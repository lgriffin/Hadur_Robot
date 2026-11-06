# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 78.3 | 151 / 700 | 2.96 | 14.0% | 61799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 430 |
| hadur117.nano.SanaroB480 0.3 | 2.2 | 14.0% | 151 |
| sgp.JollyNinja 3.53 | 3.5 | 12.1% | 69 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 18 |
| mz.MicroGodMelee 1 | 4.8 | 10.8% | 17 |
| lorneswork.Predator 1.0 | 5.4 | 10.3% | 13 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 78.1 | 9 / 35 | 3042 |
| 2 | 2 | 61.2 | 78.7 | 8 / 35 | 2939 |
| 3 | 2 | 61.9 | 78.7 | 9 / 35 | 3219 |
| 4 | 2 | 61.7 | 78.7 | 7 / 35 | 2869 |
| 5 | 3 | 59.9 | 73.7 | 5 / 35 | 2530 |
| 6 | 2 | 62.4 | 79.0 | 10 / 35 | 3262 |
| 7 | 2 | 64.0 | 88.3 | 13 / 35 | 2612 |
| 8 | 2 | 61.3 | 75.6 | 9 / 35 | 3148 |
| 9 | 2 | 61.6 | 75.2 | 10 / 35 | 3173 |
| 10 | 2 | 61.1 | 76.8 | 6 / 35 | 2870 |
| 11 | 2 | 63.4 | 84.1 | 10 / 35 | 3102 |
| 12 | 2 | 62.2 | 78.1 | 6 / 35 | 3446 |
| 13 | 2 | 61.1 | 76.2 | 6 / 35 | 3312 |
| 14 | 2 | 62.6 | 78.4 | 6 / 35 | 3665 |
| 15 | 2 | 62.5 | 79.7 | 5 / 35 | 3318 |
| 16 | 2 | 61.2 | 77.5 | 7 / 35 | 2970 |
| 17 | 2 | 62.2 | 80.0 | 7 / 35 | 3040 |
| 18 | 2 | 61.3 | 75.9 | 6 / 35 | 3177 |
| 19 | 2 | 64.1 | 85.4 | 9 / 35 | 3324 |
| 20 | 4 | 57.7 | 67.0 | 3 / 35 | 2781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 298 | 18% |
| sgp.JollyNinja 3.53 | 54 | 63% |
| mz.MicroGodMelee 1 | 35 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 74% |
| lorneswork.Predator 1.0 | 16 | 50% |
| adt.Ar2 1.0 | 6 | 83% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 551 of 700 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 296 | 54% | 363 |
| sgp.JollyNinja 3.53 | 73 | 13% | 98 |
| lorneswork.Predator 1.0 | 62 | 11% | 70 |
| simonton.nano.WeekendObsession_Melee 1.0 | 61 | 11% | 71 |
| mz.MicroGodMelee 1 | 30 | 5% | 60 |
| adt.Ar2 1.0 | 18 | 3% | 26 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 1% | 10 |
| skm.butterfly 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.9 | 181 / 700 | 3.62 | 13.8% | 65569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.8% | 189 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.5% | 151 |
| hadur117.nano.SanaroB480 0.3 | 2.5 | 13.8% | 181 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.4% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 50 |
| sch.Simone 0.3d | 6.9 | 8.2% | 46 |
| Noran.BitchingElk 0.054 | 7.2 | 8.0% | 34 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.7% | 9 |
| stelo.PatternRobot 1.0 | 8.4 | 6.7% | 22 |
| fullsail.SweetTea 1.1 | 9.9 | 4.8% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 72.1 | 9 / 35 | 3380 |
| 2 | 4 | 56.7 | 62.9 | 6 / 35 | 2985 |
| 3 | 3 | 60.1 | 69.8 | 9 / 35 | 3246 |
| 4 | 2 | 61.1 | 71.4 | 9 / 35 | 3773 |
| 5 | 3 | 61.3 | 74.0 | 9 / 35 | 3408 |
| 6 | 2 | 59.6 | 72.1 | 7 / 35 | 3191 |
| 7 | 3 | 58.0 | 64.4 | 6 / 35 | 3341 |
| 8 | 3 | 60.1 | 70.2 | 10 / 35 | 3243 |
| 9 | 1 | 63.8 | 78.1 | 12 / 35 | 3789 |
| 10 | 2 | 59.7 | 69.5 | 13 / 35 | 2965 |
| 11 | 3 | 60.1 | 72.1 | 6 / 35 | 3162 |
| 12 | 2 | 62.6 | 79.0 | 8 / 35 | 3520 |
| 13 | 3 | 58.6 | 66.3 | 9 / 35 | 3270 |
| 14 | 1 | 62.0 | 77.8 | 8 / 35 | 3346 |
| 15 | 1 | 63.2 | 77.5 | 15 / 35 | 3380 |
| 16 | 3 | 60.6 | 72.4 | 10 / 35 | 3071 |
| 17 | 3 | 57.7 | 65.4 | 7 / 35 | 3028 |
| 18 | 3 | 58.5 | 68.3 | 6 / 35 | 3075 |
| 19 | 2 | 60.0 | 68.9 | 11 / 35 | 3261 |
| 20 | 3 | 59.0 | 66.0 | 11 / 35 | 3135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 116 | 59% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 111 | 31% |
| com.cohesiva.robocode.ManOwaR 1.0 | 41 | 76% |
| sch.Simone 0.3d | 27 | 52% |
| Noran.BitchingElk 0.054 | 23 | 70% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 83% |
| stelo.PatternRobot 1.0 | 11 | 45% |
| fnc.bandit.Bandit 5.2.0 | 7 | 29% |
| fullsail.SweetTea 1.1 | 6 | 17% |

Hadur died in 520 of 700 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 137 | 26% | 180 |
| pulsar.PulsarMax 0.8.9 | 131 | 25% | 185 |
| lrem.micro.SpikeSoldier 0.4 | 68 | 13% | 74 |
| stelo.PatternRobot 1.0 | 41 | 8% | 48 |
| sch.Simone 0.3d | 40 | 8% | 61 |
| com.cohesiva.robocode.ManOwaR 1.0 | 37 | 7% | 66 |
| fnc.bandit.Bandit 5.2.0 | 33 | 6% | 34 |
| fullsail.SweetTea 1.1 | 19 | 4% | 20 |
| Noran.BitchingElk 0.054 | 14 | 3% | 32 |

## Melee bench: F03

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 82.0 | 206 / 700 | 2.62 | 15.1% | 69522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 14.9% | 164 |
| hadur117.nano.SanaroB480 0.3 | 1.9 | 15.1% | 206 |
| kawigi.nano.Lib 1.0 | 2.6 | 14.6% | 161 |
| vuen.Cake 2.51 | 3.7 | 13.6% | 138 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 21 |
| adt.Ar1 2.1 | 6.1 | 7.8% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 6.7% | 3 |
| oa.weak.FlyMk1 0.1 | 7.6 | 6.6% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 82.9 | 9 / 35 | 3335 |
| 2 | 3 | 61.9 | 79.4 | 6 / 35 | 3538 |
| 3 | 1 | 63.6 | 84.8 | 11 / 35 | 3544 |
| 4 | 1 | 62.4 | 82.5 | 10 / 35 | 3346 |
| 5 | 2 | 63.2 | 83.8 | 12 / 35 | 3276 |
| 6 | 3 | 62.1 | 76.8 | 9 / 35 | 3717 |
| 7 | 1 | 64.9 | 86.3 | 15 / 35 | 3648 |
| 8 | 2 | 62.1 | 80.6 | 8 / 35 | 3296 |
| 9 | 2 | 63.0 | 81.6 | 8 / 35 | 3697 |
| 10 | 2 | 63.1 | 83.8 | 12 / 35 | 2780 |
| 11 | 3 | 63.2 | 82.5 | 11 / 35 | 3168 |
| 12 | 2 | 61.2 | 77.5 | 9 / 35 | 3217 |
| 13 | 1 | 63.6 | 81.9 | 11 / 35 | 3652 |
| 14 | 3 | 61.6 | 80.3 | 6 / 35 | 3376 |
| 15 | 2 | 63.1 | 82.9 | 11 / 35 | 3576 |
| 16 | 2 | 63.6 | 81.3 | 12 / 35 | 4011 |
| 17 | 3 | 62.3 | 76.8 | 9 / 35 | 4024 |
| 18 | 1 | 64.4 | 87.0 | 15 / 35 | 3262 |
| 19 | 1 | 63.7 | 84.4 | 13 / 35 | 3264 |
| 20 | 1 | 63.8 | 83.8 | 9 / 35 | 3795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 157 | 55% |
| kawigi.nano.Lib 1.0 | 115 | 22% |
| radnor.DoctorBob 1.42 | 110 | 54% |
| urdos.URDOS 1.3 | 33 | 76% |
| oa.weak.FlyMk1 0.1 | 5 | 60% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 496 of 700 rounds, at a mean tick of 1075. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 171 | 34% | 200 |
| radnor.DoctorBob 1.42 | 134 | 27% | 187 |
| vuen.Cake 2.51 | 101 | 20% | 187 |
| urdos.URDOS 1.3 | 60 | 12% | 84 |
| ghent.ArthurPanzergon 1.0.0 | 12 | 2% | 17 |
| adt.Ar1 2.1 | 6 | 1% | 8 |
| oa.weak.FlyMk1 0.1 | 5 | 1% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 0% | 5 |

## Melee bench: F04

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.6 | 28 / 700 | 3.11 | 13.9% | 74312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 25.0% | 647 |
| hadur117.nano.SanaroB480 0.3 | 2.5 | 13.9% | 28 |
| apc.LeeroyJenkins2 1.0 | 2.6 | 13.5% | 17 |
| TNT.TNT 0.99.1 | 4.2 | 10.7% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 4 |
| css.Delitioner 0.11 | 6.1 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.9 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 1 |
| spin.Bugstard 0.012b | 9.4 | 4.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 71.7 | 1 / 35 | 3642 |
| 2 | 2 | 61.0 | 74.0 | 1 / 35 | 3260 |
| 3 | 3 | 61.4 | 74.3 | 1 / 35 | 3431 |
| 4 | 2 | 62.9 | 75.9 | 2 / 35 | 3983 |
| 5 | 2 | 64.3 | 82.9 | 1 / 35 | 3798 |
| 6 | 2 | 62.5 | 77.5 | 0 / 35 | 3676 |
| 7 | 2 | 64.5 | 84.1 | 1 / 35 | 3682 |
| 8 | 2 | 62.2 | 75.2 | 1 / 35 | 3771 |
| 9 | 2 | 62.8 | 75.2 | 3 / 35 | 4177 |
| 10 | 3 | 61.7 | 74.0 | 0 / 35 | 3652 |
| 11 | 3 | 60.9 | 73.3 | 1 / 35 | 3189 |
| 12 | 2 | 63.5 | 77.1 | 3 / 35 | 4152 |
| 13 | 2 | 63.4 | 80.3 | 3 / 35 | 3478 |
| 14 | 3 | 61.6 | 74.3 | 0 / 35 | 3509 |
| 15 | 2 | 64.6 | 81.3 | 1 / 35 | 4312 |
| 16 | 3 | 62.1 | 75.9 | 1 / 35 | 3581 |
| 17 | 3 | 63.0 | 77.1 | 1 / 35 | 3928 |
| 18 | 2 | 63.4 | 78.4 | 3 / 35 | 3758 |
| 19 | 3 | 61.7 | 72.1 | 1 / 35 | 3665 |
| 20 | 3 | 62.7 | 76.5 | 3 / 35 | 3668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 382 | 3% |
| apc.LeeroyJenkins2 1.0 | 15 | 60% |
| TNT.TNT 0.99.1 | 5 | 60% |
| spin.Bugstard 0.012b | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 672 of 700 rounds, at a mean tick of 1476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 483 | 72% | 495 |
| apc.LeeroyJenkins2 1.0 | 79 | 12% | 88 |
| josago.Jorgito 0.16 | 51 | 8% | 53 |
| TNT.TNT 0.99.1 | 19 | 3% | 23 |
| tj.zombie1n 1.0.1 | 16 | 2% | 16 |
| css.Delitioner 0.11 | 13 | 2% | 14 |
| rampancy.Durandal 2.1d | 8 | 1% | 8 |
| sp.Nanos.Ember 1.1 | 3 | 0% | 3 |

## Melee bench: F06

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.2 | 210 / 700 | 3.50 | 13.7% | 57405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.7% | 156 |
| origin.SleepSiphon 1.7b | 2.2 | 14.4% | 188 |
| hadur117.nano.SanaroB480 0.3 | 2.9 | 13.7% | 210 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.5% | 82 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 19 |
| gg.Wolverine 2.0 | 6.3 | 8.6% | 21 |
| spinnercat.Omen 1.0 | 7.3 | 7.6% | 7 |
| DBall.NUKE 0.1 | 7.8 | 7.1% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.4% | 7 |
| sample.Fire 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 73.0 | 10 / 35 | 2787 |
| 2 | 4 | 59.2 | 67.0 | 12 / 35 | 2724 |
| 3 | 3 | 58.4 | 68.6 | 9 / 35 | 2519 |
| 4 | 3 | 62.3 | 76.8 | 11 / 35 | 2934 |
| 5 | 2 | 61.0 | 74.0 | 9 / 35 | 2940 |
| 6 | 4 | 57.4 | 67.0 | 6 / 35 | 2406 |
| 7 | 3 | 61.5 | 73.3 | 12 / 35 | 3203 |
| 8 | 4 | 58.6 | 66.0 | 9 / 35 | 2904 |
| 9 | 2 | 63.2 | 78.1 | 15 / 35 | 3224 |
| 10 | 2 | 62.1 | 76.5 | 15 / 35 | 2789 |
| 11 | 3 | 61.8 | 74.9 | 14 / 35 | 2918 |
| 12 | 2 | 63.5 | 79.7 | 14 / 35 | 3170 |
| 13 | 3 | 59.6 | 70.2 | 12 / 35 | 2565 |
| 14 | 3 | 60.0 | 69.5 | 12 / 35 | 2825 |
| 15 | 3 | 58.2 | 67.6 | 7 / 35 | 2758 |
| 16 | 3 | 59.6 | 71.4 | 6 / 35 | 2920 |
| 17 | 3 | 61.2 | 73.3 | 10 / 35 | 3170 |
| 18 | 3 | 59.3 | 70.2 | 9 / 35 | 2848 |
| 19 | 2 | 59.2 | 70.5 | 8 / 35 | 2935 |
| 20 | 3 | 61.7 | 76.8 | 10 / 35 | 2866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 115 | 72% |
| origin.SleepSiphon 1.7b | 80 | 50% |
| pe.minimelee.SandboxMiniMelee 1.1 | 66 | 61% |
| gg.Wolverine 2.0 | 20 | 70% |
| mld.Wisdom 1.0 | 16 | 94% |
| DBall.NUKE 0.1 | 13 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 492 of 700 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 151 | 31% | 214 |
| origin.SleepSiphon 1.7b | 121 | 25% | 166 |
| pe.minimelee.SandboxMiniMelee 1.1 | 99 | 20% | 147 |
| mld.Wisdom 1.0 | 54 | 11% | 74 |
| gg.Wolverine 2.0 | 22 | 4% | 34 |
| spinnercat.Omen 1.0 | 19 | 4% | 22 |
| DBall.NUKE 0.1 | 14 | 3% | 24 |
| ers.nano.hawk.HawkLA 3.0m | 11 | 2% | 18 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.6 | 308 / 700 | 2.07 | 18.5% | 75388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 21.8% | 200 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 18.5% | 308 |
| franzor.Lizt 1.3.1 | 3.4 | 13.9% | 142 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 13.5% | 48 |
| lrem.micro.MoggFanatic 0.2 | 5.1 | 10.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.8% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 7.2% | 2 |
| drd.Dreadknoght 0.9 | 8.4 | 3.1% | 1 |
| sample.Target 1.0 | 8.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.6 | 14 / 35 | 3814 |
| 2 | 2 | 66.6 | 86.8 | 12 / 35 | 3630 |
| 3 | 2 | 66.9 | 84.6 | 12 / 35 | 4126 |
| 4 | 2 | 67.3 | 87.5 | 14 / 35 | 3872 |
| 5 | 2 | 68.2 | 89.3 | 18 / 35 | 3800 |
| 6 | 2 | 66.6 | 85.4 | 16 / 35 | 3726 |
| 7 | 2 | 67.3 | 86.8 | 18 / 35 | 3720 |
| 8 | 2 | 67.7 | 88.2 | 14 / 35 | 4085 |
| 9 | 2 | 66.8 | 87.5 | 17 / 35 | 3207 |
| 10 | 2 | 65.1 | 82.1 | 12 / 35 | 3325 |
| 11 | 2 | 66.5 | 83.2 | 14 / 35 | 3807 |
| 12 | 2 | 67.7 | 84.6 | 13 / 35 | 4304 |
| 13 | 2 | 67.5 | 87.1 | 18 / 35 | 3771 |
| 14 | 2 | 66.8 | 85.7 | 16 / 35 | 3661 |
| 15 | 2 | 66.7 | 86.8 | 15 / 35 | 3407 |
| 16 | 2 | 66.0 | 85.4 | 11 / 35 | 3662 |
| 17 | 2 | 68.2 | 90.4 | 18 / 35 | 3724 |
| 18 | 2 | 67.8 | 86.8 | 19 / 35 | 3871 |
| 19 | 2 | 68.0 | 89.6 | 21 / 35 | 3573 |
| 20 | 2 | 68.5 | 90.0 | 16 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 277 | 57% |
| franzor.Lizt 1.3.1 | 116 | 56% |
| oog.melee.CapuletDroid 1.1 | 103 | 76% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| skm.PateranBotlock2 1.0 | 2 | 0% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 392 of 700 rounds, at a mean tick of 1641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 239 | 61% | 492 |
| oog.melee.CapuletDroid 1.1 | 67 | 17% | 155 |
| franzor.Lizt 1.3.1 | 58 | 15% | 4 |
| exauge.GateKeeper 1.1.121g | 12 | 3% | 20 |
| skm.PateranBotlock2 1.0 | 10 | 3% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 1% | 8 |
| drd.Dreadknoght 0.9 | 2 | 1% | 8 |

## Melee bench: F08

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 20 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 78.6 | 272 / 700 | 2.71 | 16.4% | 57700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.7 | 16.4% | 272 |
| tm.Yuugao 1.0 | 2.1 | 16.1% | 150 |
| shrub.Vapour v159 | 2.4 | 15.6% | 166 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.3% | 49 |
| m3thos.Eva00 1.1 | 5.2 | 10.1% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 9.5% | 28 |
| SHAM.WOW 1.4 | 7.6 | 7.1% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 7.0% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 82.1 | 14 / 35 | 2748 |
| 2 | 2 | 60.2 | 73.6 | 12 / 35 | 2738 |
| 3 | 2 | 61.4 | 74.6 | 14 / 35 | 2874 |
| 4 | 3 | 60.8 | 74.6 | 12 / 35 | 2814 |
| 5 | 3 | 60.0 | 73.9 | 8 / 35 | 2876 |
| 6 | 2 | 64.3 | 82.9 | 14 / 35 | 3393 |
| 7 | 1 | 64.1 | 85.0 | 12 / 35 | 3198 |
| 8 | 1 | 62.5 | 80.4 | 14 / 35 | 2732 |
| 9 | 1 | 63.2 | 81.4 | 14 / 35 | 2807 |
| 10 | 3 | 61.5 | 75.7 | 15 / 35 | 2715 |
| 11 | 1 | 63.1 | 83.2 | 15 / 35 | 2778 |
| 12 | 1 | 62.0 | 80.4 | 14 / 35 | 2539 |
| 13 | 2 | 60.7 | 74.6 | 11 / 35 | 2809 |
| 14 | 3 | 62.0 | 78.2 | 14 / 35 | 2987 |
| 15 | 2 | 62.1 | 79.3 | 12 / 35 | 2783 |
| 16 | 1 | 62.3 | 76.4 | 17 / 35 | 3013 |
| 17 | 1 | 61.9 | 77.1 | 13 / 35 | 2967 |
| 18 | 1 | 62.3 | 77.9 | 14 / 35 | 3018 |
| 19 | 1 | 61.8 | 76.8 | 14 / 35 | 2930 |
| 20 | 1 | 64.1 | 83.9 | 19 / 35 | 2981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 175 | 73% |
| shrub.Vapour v159 | 100 | 41% |
| com.spp.robocode.MostlyHarmless 010 | 60 | 58% |
| m3thos.Eva00 1.1 | 35 | 69% |
| jwst.DAD.DarkAndDarker 1.1 | 33 | 88% |
| qualidafial.MajorDick 1.0.1 | 10 | 70% |
| SHAM.WOW 1.4 | 8 | 88% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 431 of 700 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 158 | 37% | 198 |
| tm.Yuugao 1.0 | 109 | 25% | 240 |
| com.spp.robocode.MostlyHarmless 010 | 54 | 13% | 86 |
| m3thos.Eva00 1.1 | 36 | 8% | 54 |
| jwst.DAD.DarkAndDarker 1.1 | 35 | 8% | 59 |
| zyx.nano.BacillusComma 1.0 | 22 | 5% | 27 |
| SHAM.WOW 1.4 | 11 | 3% | 29 |
| qualidafial.MajorDick 1.0.1 | 6 | 1% | 7 |

## Melee bench: F09

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 64.4 | 97 / 700 | 4.21 | 11.9% | 48492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.4% | 387 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 114 |
| hadur117.nano.SanaroB480 0.3 | 3.4 | 11.9% | 97 |
| yagami.Tidus 0.11 | 4.2 | 11.2% | 10 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.6% | 50 |
| mc2.enemy.Original 0.9 | 6.0 | 9.5% | 32 |
| dft.Calliope 5.6 | 6.8 | 8.1% | 9 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.9 | 63.8 | 4 / 35 | 2524 |
| 2 | 5 | 54.6 | 58.4 | 4 / 35 | 2248 |
| 3 | 3 | 58.0 | 65.1 | 6 / 35 | 2837 |
| 4 | 5 | 54.7 | 61.3 | 5 / 35 | 2042 |
| 5 | 3 | 57.8 | 66.7 | 4 / 35 | 2534 |
| 6 | 3 | 57.6 | 65.7 | 9 / 35 | 2289 |
| 7 | 4 | 56.0 | 62.9 | 4 / 35 | 2473 |
| 8 | 3 | 59.1 | 67.6 | 7 / 35 | 2622 |
| 9 | 3 | 58.4 | 68.6 | 6 / 35 | 2514 |
| 10 | 3 | 57.3 | 65.4 | 6 / 35 | 2356 |
| 11 | 3 | 57.7 | 64.4 | 6 / 35 | 2584 |
| 12 | 3 | 58.1 | 67.9 | 4 / 35 | 2466 |
| 13 | 3 | 56.8 | 65.4 | 4 / 35 | 2263 |
| 14 | 3 | 57.2 | 63.5 | 5 / 35 | 2596 |
| 15 | 4 | 54.6 | 60.6 | 2 / 35 | 2250 |
| 16 | 3 | 56.5 | 65.4 | 4 / 35 | 2143 |
| 17 | 3 | 60.2 | 73.3 | 6 / 35 | 2691 |
| 18 | 4 | 56.1 | 61.6 | 3 / 35 | 2397 |
| 19 | 3 | 55.3 | 60.3 | 4 / 35 | 2380 |
| 20 | 4 | 54.5 | 59.4 | 4 / 35 | 2283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 155 | 26% |
| kc.micro.Figment 1.0 | 55 | 40% |
| mc2.enemy.Original 0.9 | 18 | 83% |
| yagami.Tidus 0.11 | 13 | 92% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| dft.Calliope 5.6 | 6 | 50% |

Hadur died in 603 of 700 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 210 | 35% | 251 |
| kc.micro.Figment 1.0 | 144 | 24% | 166 |
| yagami.Tidus 0.11 | 78 | 13% | 88 |
| pedersen.Grishnakh 1.0 | 54 | 9% | 56 |
| mc2.enemy.Original 0.9 | 51 | 8% | 67 |
| robar.nano.Assertive_Melee 0.2 | 23 | 4% | 25 |
| dft.Calliope 5.6 | 21 | 3% | 25 |
| step.nanoPri 1.0 | 13 | 2% | 13 |
| rdm.Dueler 0.4x | 9 | 1% | 9 |

## Melee bench: F10

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 83.0 | 264 / 700 | 2.53 | 15.5% | 68109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.6 | 15.5% | 264 |
| DTF.Kludgy 1.2b | 1.6 | 15.6% | 184 |
| ne.Chimera 1.2 | 3.0 | 13.6% | 94 |
| ejb.Polaris 1.0.1 | 4.2 | 12.1% | 47 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.9% | 68 |
| vStar.RAFzilla 2.15 | 5.6 | 10.2% | 24 |
| sam.Samspin 1.0 | 8.0 | 6.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.8% | 11 |
| donjezza.Muncho 1.0 | 9.8 | 4.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 83.2 | 16 / 35 | 3466 |
| 2 | 1 | 65.4 | 89.8 | 16 / 35 | 3456 |
| 3 | 2 | 62.3 | 80.3 | 10 / 35 | 3196 |
| 4 | 2 | 63.2 | 82.2 | 13 / 35 | 3178 |
| 5 | 2 | 64.0 | 82.5 | 10 / 35 | 3606 |
| 6 | 1 | 63.2 | 81.9 | 13 / 35 | 3384 |
| 7 | 2 | 61.9 | 75.9 | 10 / 35 | 3537 |
| 8 | 3 | 61.6 | 74.6 | 10 / 35 | 3592 |
| 9 | 2 | 61.6 | 78.4 | 10 / 35 | 3191 |
| 10 | 2 | 65.5 | 87.6 | 14 / 35 | 3725 |
| 11 | 1 | 63.4 | 79.7 | 11 / 35 | 3590 |
| 12 | 2 | 64.7 | 89.2 | 11 / 35 | 3348 |
| 13 | 2 | 63.7 | 83.8 | 11 / 35 | 3507 |
| 14 | 2 | 60.9 | 74.9 | 11 / 35 | 3228 |
| 15 | 1 | 65.3 | 88.6 | 17 / 35 | 3354 |
| 16 | 1 | 64.5 | 83.8 | 18 / 35 | 3217 |
| 17 | 1 | 64.8 | 86.7 | 15 / 35 | 3503 |
| 18 | 1 | 65.6 | 89.8 | 18 / 35 | 3172 |
| 19 | 2 | 63.3 | 81.6 | 14 / 35 | 3240 |
| 20 | 1 | 64.7 | 85.4 | 16 / 35 | 3619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 153 | 41% |
| ejb.Polaris 1.0.1 | 113 | 91% |
| ne.Chimera 1.2 | 66 | 41% |
| tvv.micro.Antares 1.1.1 | 62 | 39% |
| vStar.RAFzilla 2.15 | 42 | 74% |
| donjezza.Muncho 1.0 | 14 | 64% |
| kurios.DOSexe .9b | 13 | 31% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 436 of 700 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 173 | 40% | 230 |
| ne.Chimera 1.2 | 108 | 25% | 141 |
| tvv.micro.Antares 1.1.1 | 60 | 14% | 76 |
| ejb.Polaris 1.0.1 | 29 | 7% | 134 |
| vStar.RAFzilla 2.15 | 20 | 5% | 47 |
| kurios.DOSexe .9b | 15 | 3% | 23 |
| sam.Samspin 1.0 | 13 | 3% | 18 |
| donjezza.Muncho 1.0 | 10 | 2% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 2% | 9 |

## Melee bench: F11

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.9 | 200 / 700 | 3.62 | 13.4% | 53556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 253 |
| hadur117.nano.SanaroB480 0.3 | 2.5 | 13.4% | 200 |
| cx.mini.Nimrod 0.55 | 2.6 | 13.3% | 88 |
| djc.DynaBot 0.1.1 | 4.1 | 10.6% | 42 |
| rdt199.Warlord 0.73 | 5.7 | 9.4% | 46 |
| uji.YellohFellah 1.0 | 6.2 | 8.9% | 40 |
| br2.MobyDickBot 1.6 | 6.4 | 9.0% | 32 |
| KiraNL.Chupacabra 0.4 | 7.6 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 66.0 | 10 / 35 | 2315 |
| 2 | 2 | 63.0 | 79.7 | 13 / 35 | 3172 |
| 3 | 2 | 61.3 | 73.3 | 12 / 35 | 2886 |
| 4 | 3 | 56.9 | 63.8 | 9 / 35 | 2432 |
| 5 | 3 | 60.1 | 73.0 | 6 / 35 | 3142 |
| 6 | 3 | 59.8 | 72.4 | 9 / 35 | 2697 |
| 7 | 2 | 61.1 | 76.2 | 10 / 35 | 2802 |
| 8 | 3 | 56.5 | 65.1 | 7 / 35 | 2492 |
| 9 | 3 | 56.0 | 62.9 | 7 / 35 | 2319 |
| 10 | 3 | 59.2 | 72.7 | 6 / 35 | 2605 |
| 11 | 2 | 58.0 | 65.7 | 9 / 35 | 2751 |
| 12 | 2 | 58.8 | 68.9 | 10 / 35 | 2641 |
| 13 | 2 | 58.5 | 70.8 | 11 / 35 | 2184 |
| 14 | 2 | 61.6 | 75.9 | 13 / 35 | 2854 |
| 15 | 3 | 59.3 | 68.9 | 9 / 35 | 2784 |
| 16 | 2 | 60.3 | 73.0 | 10 / 35 | 2709 |
| 17 | 2 | 60.4 | 73.0 | 12 / 35 | 2681 |
| 18 | 3 | 60.1 | 71.7 | 10 / 35 | 2780 |
| 19 | 2 | 61.5 | 75.6 | 16 / 35 | 2628 |
| 20 | 2 | 59.7 | 70.2 | 11 / 35 | 2682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 166 | 56% |
| cx.mini.Nimrod 0.55 | 51 | 65% |
| djc.DynaBot 0.1.1 | 30 | 73% |
| uji.YellohFellah 1.0 | 30 | 53% |
| rdt199.Warlord 0.73 | 27 | 81% |
| br2.MobyDickBot 1.6 | 16 | 56% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 500 of 700 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 193 | 39% | 273 |
| cx.mini.Nimrod 0.55 | 112 | 22% | 141 |
| rdt199.Warlord 0.73 | 49 | 10% | 74 |
| djc.DynaBot 0.1.1 | 39 | 8% | 62 |
| uji.YellohFellah 1.0 | 33 | 7% | 50 |
| br2.MobyDickBot 1.6 | 25 | 5% | 43 |
| KiraNL.Chupacabra 0.4 | 24 | 5% | 30 |
| stelo.MirrorNano 1.3 | 16 | 3% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 2% | 10 |

## Melee bench: F12

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.8 | 193 / 700 | 3.45 | 13.6% | 51358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 2.0 | 14.4% | 142 |
| nat.PallasHawk 1.0 | 2.1 | 14.3% | 173 |
| hadur117.nano.SanaroB480 0.3 | 2.8 | 13.6% | 193 |
| darkcanuck.Leon 1.01 | 3.2 | 13.3% | 120 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.6% | 41 |
| jrm.Test0 1.0 | 6.3 | 8.2% | 5 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 1 |
| jp.Perpy 16.0 | 7.6 | 7.1% | 5 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.8% | 16 |
| stuff.Vlad 0.1 | 9.6 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 78.7 | 8 / 35 | 2668 |
| 2 | 3 | 58.0 | 66.7 | 9 / 35 | 2632 |
| 3 | 4 | 59.2 | 70.5 | 7 / 35 | 2652 |
| 4 | 4 | 58.5 | 67.0 | 12 / 35 | 2458 |
| 5 | 2 | 61.2 | 74.3 | 11 / 35 | 2911 |
| 6 | 2 | 62.8 | 78.7 | 12 / 35 | 2848 |
| 7 | 2 | 59.9 | 73.3 | 12 / 35 | 2455 |
| 8 | 4 | 59.4 | 70.5 | 10 / 35 | 2228 |
| 9 | 3 | 59.9 | 71.4 | 11 / 35 | 2599 |
| 10 | 4 | 58.0 | 67.0 | 7 / 35 | 2559 |
| 11 | 2 | 60.3 | 75.6 | 6 / 35 | 2533 |
| 12 | 2 | 61.8 | 78.4 | 10 / 35 | 2705 |
| 13 | 1 | 61.0 | 74.9 | 13 / 35 | 2771 |
| 14 | 3 | 61.3 | 78.1 | 8 / 35 | 2610 |
| 15 | 3 | 60.3 | 72.1 | 13 / 35 | 2556 |
| 16 | 2 | 60.3 | 75.9 | 10 / 35 | 2320 |
| 17 | 3 | 60.0 | 71.4 | 11 / 35 | 2537 |
| 18 | 4 | 58.4 | 68.6 | 9 / 35 | 2509 |
| 19 | 4 | 58.4 | 69.2 | 7 / 35 | 2372 |
| 20 | 2 | 60.0 | 74.0 | 7 / 35 | 2435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 118 | 33% |
| darkcanuck.Leon 1.01 | 106 | 49% |
| bts.wiki.RipCurl 0.9b | 99 | 67% |
| brainfade.melee.Genghis 0.36 | 23 | 78% |
| jaybot.bots.Oddball 4.0 | 13 | 38% |
| jp.Perpy 16.0 | 9 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 507 of 700 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 148 | 29% | 188 |
| bts.wiki.RipCurl 0.9b | 97 | 19% | 158 |
| darkcanuck.Leon 1.01 | 96 | 19% | 155 |
| brainfade.melee.Genghis 0.36 | 58 | 11% | 70 |
| jrm.Test0 1.0 | 42 | 8% | 43 |
| jp.Perpy 16.0 | 23 | 5% | 33 |
| cs.sheldor.Talon 1.1 | 20 | 4% | 24 |
| jaybot.bots.Oddball 4.0 | 17 | 3% | 20 |
| stuff.Vlad 0.1 | 6 | 1% | 8 |

## Melee bench: F13

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 74.6 | 120 / 700 | 3.29 | 13.2% | 54901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.3% | 301 |
| ags.Glacier 0.2.11 | 1.6 | 17.1% | 180 |
| hadur117.nano.SanaroB480 0.3 | 3.5 | 13.2% | 120 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 62 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.0% | 35 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 77.8 | 8 / 35 | 2707 |
| 2 | 5 | 55.8 | 61.0 | 5 / 35 | 2552 |
| 3 | 4 | 59.5 | 72.4 | 4 / 35 | 2747 |
| 4 | 3 | 58.6 | 70.5 | 5 / 35 | 2536 |
| 5 | 3 | 61.1 | 76.5 | 5 / 35 | 2915 |
| 6 | 5 | 59.0 | 70.2 | 7 / 35 | 2620 |
| 7 | 4 | 60.9 | 76.5 | 9 / 35 | 2326 |
| 8 | 3 | 61.1 | 75.2 | 8 / 35 | 2886 |
| 9 | 4 | 58.1 | 67.6 | 6 / 35 | 2656 |
| 10 | 3 | 60.7 | 72.4 | 6 / 35 | 3051 |
| 11 | 4 | 58.3 | 71.1 | 3 / 35 | 2322 |
| 12 | 3 | 60.9 | 76.8 | 8 / 35 | 2648 |
| 13 | 3 | 60.6 | 74.3 | 7 / 35 | 2829 |
| 14 | 3 | 61.9 | 81.3 | 4 / 35 | 2623 |
| 15 | 3 | 62.2 | 77.5 | 7 / 35 | 3151 |
| 16 | 3 | 61.9 | 79.7 | 6 / 35 | 2798 |
| 17 | 3 | 61.9 | 78.4 | 6 / 35 | 2683 |
| 18 | 3 | 62.4 | 78.7 | 6 / 35 | 3210 |
| 19 | 3 | 62.2 | 77.1 | 6 / 35 | 3345 |
| 20 | 4 | 59.7 | 76.2 | 4 / 35 | 2296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 166 | 40% |
| ags.Glacier 0.2.11 | 124 | 19% |
| shinh.Entangled 0.3 | 42 | 43% |
| gh.micro.Gruweltje 0.7 | 13 | 69% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 580 of 700 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 211 | 36% | 231 |
| mn.Combat 3.25.0 | 162 | 28% | 234 |
| gh.micro.Gruweltje 0.7 | 77 | 13% | 87 |
| shinh.Entangled 0.3 | 74 | 13% | 90 |
| stelo.Wang 1.0 | 26 | 4% | 27 |
| apc.Colossus2 0.17 | 18 | 3% | 19 |
| maribo.FollowFire 1 | 8 | 1% | 8 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |

## Melee bench: F14

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 81.1 | 280 / 700 | 2.52 | 16.1% | 52681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 20.0% | 286 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 16.1% | 280 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.8 | 12.2% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 4.0 | 12.0% | 38 |
| sanyi.mikrobi.Roberto 1.0 | 4.9 | 11.3% | 30 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 10.8% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.9 | 9.5% | 34 |
| pa.Improved 1.0 | 8.0 | 6.0% | 2 |
| sample.TrackFire 1.0 | 9.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 80.7 | 11 / 35 | 2420 |
| 2 | 2 | 63.9 | 83.9 | 12 / 35 | 2994 |
| 3 | 2 | 60.8 | 76.8 | 12 / 35 | 2204 |
| 4 | 2 | 63.4 | 81.1 | 17 / 35 | 3013 |
| 5 | 2 | 63.8 | 82.9 | 13 / 35 | 2848 |
| 6 | 2 | 62.6 | 80.7 | 14 / 35 | 2667 |
| 7 | 2 | 64.7 | 86.4 | 19 / 35 | 2681 |
| 8 | 2 | 65.0 | 85.7 | 20 / 35 | 2858 |
| 9 | 2 | 64.1 | 85.7 | 15 / 35 | 2976 |
| 10 | 2 | 60.0 | 72.5 | 12 / 35 | 2576 |
| 11 | 2 | 62.8 | 83.9 | 14 / 35 | 2422 |
| 12 | 2 | 61.8 | 77.9 | 10 / 35 | 2708 |
| 13 | 2 | 62.1 | 78.6 | 12 / 35 | 2718 |
| 14 | 2 | 62.7 | 81.1 | 14 / 35 | 2812 |
| 15 | 2 | 61.9 | 76.1 | 14 / 35 | 2482 |
| 16 | 2 | 58.4 | 71.1 | 8 / 35 | 2429 |
| 17 | 2 | 65.6 | 88.6 | 21 / 35 | 2767 |
| 18 | 2 | 60.8 | 81.1 | 8 / 35 | 1984 |
| 19 | 2 | 63.7 | 83.2 | 18 / 35 | 2570 |
| 20 | 2 | 62.9 | 83.2 | 16 / 35 | 2552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 306 | 57% |
| Lo_Ian.Gandalf_V4 4.0 | 46 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 32 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 31 | 68% |
| sanyi.mikrobi.Roberto 1.0 | 31 | 55% |
| dmh.robocode.robot.RedDwarf 0.4 | 20 | 80% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 424 of 700 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 217 | 51% | 390 |
| dmh.robocode.robot.RedDwarf 0.4 | 46 | 11% | 65 |
| Lo_Ian.Gandalf_V4 4.0 | 43 | 10% | 69 |
| sanyi.mikrobi.Roberto 1.0 | 40 | 9% | 71 |
| co.edu.usb.rc.LidisTron 1.0 | 36 | 8% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 35 | 8% | 66 |
| pa.Improved 1.0 | 3 | 1% | 6 |
| sample.TrackFire 1.0 | 2 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.4 | 155 / 700 | 3.66 | 13.5% | 63884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 14.8% | 140 |
| hadur117.nano.SanaroB480 0.3 | 2.7 | 13.5% | 155 |
| emp.Yngwie 1.11 | 2.7 | 13.4% | 180 |
| mld.DustBunny 3.8 | 3.5 | 13.1% | 81 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.2% | 49 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.5% | 84 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.6% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 71.7 | 6 / 35 | 3731 |
| 2 | 2 | 61.8 | 74.3 | 9 / 35 | 3458 |
| 3 | 2 | 60.0 | 71.1 | 7 / 35 | 3175 |
| 4 | 2 | 61.4 | 72.4 | 13 / 35 | 3235 |
| 5 | 1 | 62.3 | 76.8 | 8 / 35 | 3573 |
| 6 | 3 | 61.2 | 70.8 | 7 / 35 | 3405 |
| 7 | 3 | 59.5 | 71.1 | 7 / 35 | 2964 |
| 8 | 4 | 58.9 | 68.3 | 5 / 35 | 3335 |
| 9 | 3 | 59.9 | 68.6 | 10 / 35 | 3277 |
| 10 | 3 | 61.0 | 71.1 | 13 / 35 | 2946 |
| 11 | 3 | 58.5 | 70.8 | 4 / 35 | 2930 |
| 12 | 3 | 59.9 | 71.1 | 5 / 35 | 3186 |
| 13 | 2 | 59.1 | 70.5 | 8 / 35 | 2756 |
| 14 | 2 | 61.1 | 73.3 | 8 / 35 | 3244 |
| 15 | 2 | 61.3 | 71.7 | 9 / 35 | 3434 |
| 16 | 2 | 58.3 | 66.0 | 9 / 35 | 3034 |
| 17 | 4 | 57.1 | 63.2 | 6 / 35 | 2990 |
| 18 | 3 | 58.7 | 67.0 | 7 / 35 | 2971 |
| 19 | 3 | 60.5 | 70.8 | 9 / 35 | 3215 |
| 20 | 4 | 58.5 | 67.9 | 5 / 35 | 3025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 89 | 67% |
| kawigi.micro.Shiz 1.1 | 61 | 31% |
| cb.nano.Insomnia 1.0 | 46 | 67% |
| mld.DustBunny 3.8 | 38 | 24% |
| kawigi.robot.Girl 1.2 | 32 | 69% |
| divineomega.TrialBot 0.003 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 50% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 545 of 700 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 125 | 23% | 147 |
| mld.DustBunny 3.8 | 117 | 21% | 141 |
| emp.Yngwie 1.11 | 108 | 20% | 181 |
| cb.nano.Insomnia 1.0 | 78 | 14% | 69 |
| kawigi.robot.Girl 1.2 | 52 | 10% | 73 |
| Grystrion.TrackerWO 1.0 | 26 | 5% | 28 |
| divineomega.TrialBot 0.003 | 20 | 4% | 38 |
| lambdaxy.TBot 0.1 | 14 | 3% | 16 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 5 | 1% | 7 |

## Melee bench: F16

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.0 | 152 / 700 | 3.61 | 13.6% | 64240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 287 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 14.8% | 37 |
| hadur117.nano.SanaroB480 0.3 | 2.9 | 13.6% | 152 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.2% | 135 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.8% | 58 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.5% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.7% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 5.4% | 13 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 1 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 77.5 | 9 / 35 | 3526 |
| 2 | 3 | 59.2 | 68.6 | 3 / 35 | 3134 |
| 3 | 3 | 61.6 | 73.0 | 9 / 35 | 3376 |
| 4 | 3 | 60.1 | 67.9 | 9 / 35 | 3145 |
| 5 | 3 | 59.2 | 67.3 | 6 / 35 | 3248 |
| 6 | 3 | 60.6 | 70.2 | 9 / 35 | 3138 |
| 7 | 3 | 56.7 | 62.9 | 5 / 35 | 2731 |
| 8 | 3 | 63.1 | 78.4 | 6 / 35 | 3652 |
| 9 | 3 | 59.3 | 68.9 | 5 / 35 | 3127 |
| 10 | 3 | 61.8 | 72.7 | 10 / 35 | 3577 |
| 11 | 3 | 59.8 | 72.4 | 8 / 35 | 2788 |
| 12 | 3 | 59.2 | 68.3 | 8 / 35 | 3099 |
| 13 | 3 | 61.2 | 73.7 | 7 / 35 | 3268 |
| 14 | 3 | 60.6 | 68.6 | 7 / 35 | 3548 |
| 15 | 3 | 58.5 | 67.6 | 4 / 35 | 2698 |
| 16 | 3 | 61.0 | 70.8 | 8 / 35 | 3491 |
| 17 | 2 | 63.6 | 77.5 | 8 / 35 | 3701 |
| 18 | 2 | 62.9 | 77.8 | 13 / 35 | 3256 |
| 19 | 3 | 60.7 | 70.5 | 8 / 35 | 3070 |
| 20 | 3 | 58.3 | 66.0 | 10 / 35 | 2667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 171 | 29% |
| techdude.forest.FlamingForest 1.1 | 75 | 51% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 37 | 86% |
| tvv.nano.Polaris 1.2 | 23 | 22% |
| divineomega.DivineBot 1.9.4.5 | 13 | 92% |
| bvh.fnr.Fenrir 0.36l | 10 | 90% |
| stelo.IntrinsicVolatility 1.4 | 8 | 63% |
| repositorio.NanoStep 1.0 | 1 | 0% |

Hadur died in 548 of 700 rounds, at a mean tick of 1456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 239 | 44% | 299 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 81 | 15% | 99 |
| techdude.forest.FlamingForest 1.1 | 64 | 12% | 106 |
| bvh.fnr.Fenrir 0.36l | 58 | 11% | 65 |
| tvv.nano.Polaris 1.2 | 40 | 7% | 43 |
| stelo.IntrinsicVolatility 1.4 | 31 | 6% | 39 |
| divineomega.DivineBot 1.9.4.5 | 20 | 4% | 34 |
| asd.Cthulhu 1.3 | 11 | 2% | 12 |
| repositorio.NanoStep 1.0 | 4 | 1% | 3 |

## Melee bench: F17

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.3 | 192 / 700 | 3.50 | 13.8% | 61678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.2% | 143 |
| hadur117.nano.SanaroB480 0.3 | 2.4 | 13.8% | 192 |
| cx.BlestPain 1.41 | 3.2 | 13.1% | 134 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.4% | 117 |
| nic.Nicator 2.4 | 4.8 | 11.7% | 72 |
| ahf.NanoAndrew .4 | 5.5 | 10.8% | 34 |
| maribo.melee.BMV 0.1 | 7.0 | 9.0% | 4 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 5 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 79.4 | 13 / 35 | 3572 |
| 2 | 1 | 61.7 | 75.2 | 13 / 35 | 2980 |
| 3 | 6 | 57.2 | 63.2 | 6 / 35 | 2735 |
| 4 | 3 | 60.1 | 71.7 | 8 / 35 | 2775 |
| 5 | 4 | 58.1 | 67.6 | 6 / 35 | 2638 |
| 6 | 2 | 62.5 | 79.0 | 10 / 35 | 3155 |
| 7 | 2 | 61.1 | 71.4 | 12 / 35 | 2937 |
| 8 | 2 | 61.2 | 74.3 | 10 / 35 | 3132 |
| 9 | 3 | 60.9 | 72.7 | 9 / 35 | 2942 |
| 10 | 3 | 61.5 | 72.7 | 8 / 35 | 3274 |
| 11 | 2 | 59.3 | 70.5 | 10 / 35 | 2648 |
| 12 | 3 | 62.6 | 77.1 | 10 / 35 | 3331 |
| 13 | 2 | 61.2 | 73.0 | 10 / 35 | 3184 |
| 14 | 2 | 61.5 | 72.1 | 14 / 35 | 3059 |
| 15 | 3 | 59.1 | 68.6 | 5 / 35 | 3121 |
| 16 | 1 | 60.9 | 69.5 | 11 / 35 | 3445 |
| 17 | 1 | 61.9 | 71.4 | 11 / 35 | 3414 |
| 18 | 1 | 62.2 | 74.6 | 9 / 35 | 3488 |
| 19 | 2 | 62.1 | 76.2 | 10 / 35 | 3280 |
| 20 | 4 | 57.3 | 64.8 | 7 / 35 | 2568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 112 | 40% |
| oog.melee.Mercutio 1.0 | 82 | 63% |
| cx.BlestPain 1.41 | 72 | 81% |
| nic.Nicator 2.4 | 40 | 38% |
| ahf.NanoAndrew .4 | 17 | 88% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |

Hadur died in 508 of 700 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 130 | 26% | 179 |
| oog.melee.Mercutio 1.0 | 100 | 20% | 152 |
| cx.BlestPain 1.41 | 76 | 15% | 131 |
| nic.Nicator 2.4 | 74 | 15% | 88 |
| ahf.NanoAndrew .4 | 70 | 14% | 85 |
| maribo.melee.BMV 0.1 | 31 | 6% | 36 |
| tex.Longbot 0.4 | 15 | 3% | 15 |
| edu.otg.spr.TheTeacher 1.2 | 8 | 2% | 10 |
| goblin.Bender 2.4 | 4 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 74.5 | 254 / 700 | 3.04 | 15.6% | 53385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.5 | 15.6% | 254 |
| agd.Mooserwirt2 2.7 | 2.1 | 14.5% | 157 |
| uji.DBH 1.1 | 3.0 | 13.6% | 99 |
| spinnercat.Robovirus 2.718 | 4.4 | 11.9% | 32 |
| ratosh.Nobo 0.21 | 4.5 | 12.0% | 39 |
| sigterm.Sigterm 1.0 | 5.7 | 10.8% | 68 |
| kawigi.mini.Fhqwhgads 1.1 | 7.1 | 8.5% | 14 |
| stelo.WangRobot 1.0 | 8.2 | 7.0% | 36 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 6.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.3 | 69.6 | 13 / 35 | 2856 |
| 2 | 1 | 59.9 | 75.4 | 10 / 35 | 2603 |
| 3 | 1 | 59.6 | 71.4 | 12 / 35 | 2552 |
| 4 | 2 | 59.9 | 71.4 | 11 / 35 | 2882 |
| 5 | 1 | 59.8 | 72.5 | 10 / 35 | 2772 |
| 6 | 1 | 63.0 | 80.4 | 20 / 35 | 2706 |
| 7 | 2 | 61.1 | 77.5 | 13 / 35 | 2514 |
| 8 | 1 | 62.8 | 78.2 | 17 / 35 | 3032 |
| 9 | 3 | 57.3 | 65.7 | 9 / 35 | 2619 |
| 10 | 1 | 61.8 | 76.1 | 15 / 35 | 2892 |
| 11 | 2 | 57.2 | 68.6 | 11 / 35 | 2243 |
| 12 | 2 | 60.7 | 78.9 | 10 / 35 | 2422 |
| 13 | 1 | 61.2 | 78.6 | 14 / 35 | 2506 |
| 14 | 1 | 64.1 | 87.1 | 19 / 35 | 2469 |
| 15 | 1 | 63.5 | 86.1 | 14 / 35 | 2611 |
| 16 | 1 | 61.2 | 75.4 | 13 / 35 | 2853 |
| 17 | 1 | 60.6 | 74.6 | 12 / 35 | 2814 |
| 18 | 3 | 58.1 | 65.7 | 11 / 35 | 2764 |
| 19 | 3 | 55.8 | 63.9 | 7 / 35 | 2413 |
| 20 | 1 | 60.2 | 72.1 | 13 / 35 | 2862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 107 | 64% |
| spinnercat.Robovirus 2.718 | 73 | 88% |
| uji.DBH 1.1 | 71 | 58% |
| sigterm.Sigterm 1.0 | 53 | 62% |
| ratosh.Nobo 0.21 | 29 | 79% |
| stelo.WangRobot 1.0 | 22 | 45% |
| kawigi.mini.Fhqwhgads 1.1 | 15 | 87% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 447 of 700 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 113 | 25% | 194 |
| uji.DBH 1.1 | 87 | 19% | 110 |
| ratosh.Nobo 0.21 | 68 | 15% | 92 |
| spinnercat.Robovirus 2.718 | 52 | 12% | 92 |
| sigterm.Sigterm 1.0 | 51 | 11% | 91 |
| stelo.WangRobot 1.0 | 37 | 8% | 53 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 20 | 4% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 19 | 4% | 41 |

## Melee bench: F19

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.0 | 267 / 700 | 2.71 | 15.6% | 67933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.7 | 16.2% | 207 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.0% | 164 |
| hadur117.nano.SanaroB480 0.3 | 2.5 | 15.6% | 267 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.5% | 21 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 10 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.9% | 13 |
| pac.ABC 2.1 | 7.6 | 7.2% | 18 |
| mbh.Mbh 0.1 | 7.6 | 7.2% | 1 |
| pbg.R2D2 1.0 | 8.9 | 5.7% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 84.1 | 13 / 35 | 3490 |
| 2 | 3 | 63.9 | 78.4 | 14 / 35 | 3188 |
| 3 | 3 | 63.6 | 78.1 | 10 / 35 | 3420 |
| 4 | 2 | 65.6 | 83.2 | 14 / 35 | 3597 |
| 5 | 3 | 65.7 | 81.9 | 13 / 35 | 3459 |
| 6 | 2 | 63.8 | 79.0 | 10 / 35 | 3377 |
| 7 | 2 | 64.9 | 81.0 | 14 / 35 | 3345 |
| 8 | 1 | 65.2 | 81.3 | 16 / 35 | 3441 |
| 9 | 3 | 62.6 | 74.0 | 11 / 35 | 3219 |
| 10 | 1 | 68.9 | 91.1 | 24 / 35 | 3914 |
| 11 | 3 | 63.6 | 77.5 | 10 / 35 | 3594 |
| 12 | 3 | 64.1 | 78.4 | 15 / 35 | 3354 |
| 13 | 3 | 63.7 | 76.8 | 12 / 35 | 3566 |
| 14 | 2 | 64.7 | 83.5 | 12 / 35 | 3107 |
| 15 | 3 | 64.0 | 79.7 | 15 / 35 | 3017 |
| 16 | 3 | 63.9 | 79.0 | 10 / 35 | 3346 |
| 17 | 1 | 66.7 | 86.0 | 18 / 35 | 3498 |
| 18 | 2 | 64.4 | 83.8 | 11 / 35 | 3112 |
| 19 | 3 | 64.2 | 79.7 | 13 / 35 | 3323 |
| 20 | 3 | 65.9 | 84.4 | 12 / 35 | 3566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 216 | 64% |
| davidalves.net.DuelistMiniMelee 1.2 | 140 | 49% |
| krillr.mini.JointStrike 2.0.0 | 27 | 70% |
| pac.ABC 2.1 | 17 | 65% |
| erdnis.Rover 0.3 | 15 | 80% |
| patson.PatsonTestBot 1.0 | 14 | 79% |
| mbh.Mbh 0.1 | 4 | 75% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 435 of 700 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 172 | 40% | 333 |
| mld.Infinity 2.2 | 113 | 26% | 75 |
| krillr.mini.JointStrike 2.0.0 | 54 | 12% | 92 |
| patson.PatsonTestBot 1.0 | 38 | 9% | 65 |
| erdnis.Rover 0.3 | 27 | 6% | 56 |
| pac.ABC 2.1 | 15 | 3% | 27 |
| mbh.Mbh 0.1 | 9 | 2% | 24 |
| pbg.R2D2 1.0 | 7 | 2% | 20 |

## Melee bench: F20

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.4 | 228 / 700 | 3.12 | 14.5% | 60829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.1 | 17.4% | 259 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 14.5% | 228 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.8% | 32 |
| fwb.Nine 1.0.1 | 3.7 | 11.9% | 90 |
| catcat20.Rabbit 0.001 | 5.1 | 10.1% | 50 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 8.5% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.3% | 10 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.8% | 18 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 69.8 | 8 / 35 | 3401 |
| 2 | 2 | 61.5 | 74.6 | 12 / 35 | 3196 |
| 3 | 2 | 62.7 | 76.5 | 12 / 35 | 3435 |
| 4 | 2 | 62.2 | 78.1 | 10 / 35 | 2640 |
| 5 | 1 | 64.9 | 85.7 | 17 / 35 | 3150 |
| 6 | 2 | 60.7 | 74.3 | 7 / 35 | 2938 |
| 7 | 2 | 59.9 | 70.8 | 12 / 35 | 2773 |
| 8 | 2 | 61.0 | 71.7 | 10 / 35 | 3407 |
| 9 | 2 | 64.1 | 81.0 | 13 / 35 | 3601 |
| 10 | 2 | 60.6 | 72.7 | 11 / 35 | 3063 |
| 11 | 2 | 62.5 | 80.3 | 13 / 35 | 2717 |
| 12 | 1 | 64.0 | 83.8 | 14 / 35 | 2975 |
| 13 | 2 | 61.7 | 76.8 | 14 / 35 | 2762 |
| 14 | 2 | 62.5 | 77.8 | 13 / 35 | 3096 |
| 15 | 2 | 59.8 | 72.1 | 11 / 35 | 2677 |
| 16 | 3 | 57.4 | 66.3 | 6 / 35 | 2516 |
| 17 | 2 | 61.6 | 77.8 | 7 / 35 | 3016 |
| 18 | 2 | 64.0 | 82.2 | 14 / 35 | 3287 |
| 19 | 2 | 63.7 | 81.6 | 12 / 35 | 3134 |
| 20 | 2 | 61.3 | 74.9 | 12 / 35 | 3045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 177 | 41% |
| fwb.Nine 1.0.1 | 78 | 76% |
| catcat20.Rabbit 0.001 | 55 | 76% |
| nz.jdc.nano.GridFu 1.0 | 32 | 75% |
| bayen.nut.Squirrel 1.615 | 16 | 81% |
| m3thos.mini.Eva01 0.5.5 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 8 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 43% |

Hadur died in 472 of 700 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 215 | 46% | 278 |
| fwb.Nine 1.0.1 | 85 | 18% | 98 |
| nz.jdc.nano.GridFu 1.0 | 60 | 13% | 105 |
| catcat20.Rabbit 0.001 | 41 | 9% | 92 |
| bayen.nut.Squirrel 1.615 | 25 | 5% | 47 |
| djdjdj.NanoSkunk10 1.0 | 18 | 4% | 33 |
| m3thos.mini.Eva01 0.5.5 | 18 | 4% | 30 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 1% | 12 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 4 |

## Melee bench: F21

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 87.8 | 345 / 700 | 2.09 | 17.4% | 79863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.6% | 268 |
| hadur117.nano.SanaroB480 0.3 | 1.7 | 17.4% | 345 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 35 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 29 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 22 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 5 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 90.8 | 20 / 35 | 3935 |
| 2 | 2 | 67.3 | 89.5 | 18 / 35 | 3908 |
| 3 | 2 | 65.7 | 87.6 | 17 / 35 | 3177 |
| 4 | 2 | 65.7 | 84.8 | 15 / 35 | 3713 |
| 5 | 2 | 66.5 | 86.7 | 16 / 35 | 3683 |
| 6 | 1 | 68.9 | 93.7 | 23 / 35 | 3985 |
| 7 | 1 | 67.5 | 87.0 | 17 / 35 | 4486 |
| 8 | 1 | 67.8 | 90.2 | 23 / 35 | 3817 |
| 9 | 1 | 68.3 | 91.4 | 20 / 35 | 3898 |
| 10 | 2 | 67.2 | 86.7 | 16 / 35 | 4251 |
| 11 | 2 | 66.7 | 85.7 | 18 / 35 | 3853 |
| 12 | 2 | 67.2 | 87.9 | 15 / 35 | 3907 |
| 13 | 2 | 67.3 | 84.1 | 17 / 35 | 4556 |
| 14 | 2 | 67.5 | 90.5 | 17 / 35 | 4034 |
| 15 | 2 | 65.6 | 82.5 | 17 / 35 | 3924 |
| 16 | 2 | 66.8 | 86.0 | 17 / 35 | 4021 |
| 17 | 2 | 65.1 | 82.5 | 12 / 35 | 3993 |
| 18 | 1 | 67.7 | 91.7 | 19 / 35 | 3739 |
| 19 | 1 | 68.1 | 91.7 | 16 / 35 | 4367 |
| 20 | 2 | 67.2 | 85.7 | 12 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 365 | 57% |
| dummy.mini.Scimitar 1.01 | 85 | 92% |
| cf.RiO.RiOx 4.2.1 | 41 | 63% |
| eld.Hmm 1.0 | 28 | 68% |
| oa.weak.BotherBot 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 6 | 67% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 355 of 700 rounds, at a mean tick of 1501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 194 | 55% | 342 |
| dummy.mini.Scimitar 1.01 | 80 | 23% | 196 |
| cf.RiO.RiOx 4.2.1 | 42 | 12% | 73 |
| eld.Hmm 1.0 | 13 | 4% | 43 |
| oa.weak.BotherBot 0.1 | 8 | 2% | 19 |
| fire219.CatBot 1.0 | 7 | 2% | 7 |
| PSW.Relentless 0.1 | 5 | 1% | 5 |
| el.JumpShoot 0.2 | 4 | 1% | 10 |
| arthord.MannyPacquiao Beta | 2 | 1% | 4 |

## Melee bench: F23

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.2 | 271 / 700 | 2.42 | 16.1% | 68447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.5% | 263 |
| hadur117.nano.SanaroB480 0.3 | 2.2 | 16.1% | 271 |
| cre.Karolos 0.32 | 2.8 | 14.6% | 105 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.2% | 28 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.3% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.4 | 8.8% | 5 |
| cw.megas.Blade 0.8 | 6.9 | 8.5% | 1 |
| sample.Walls 1.0 | 7.1 | 8.5% | 6 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 79.0 | 10 / 35 | 3466 |
| 2 | 3 | 63.6 | 79.7 | 7 / 35 | 2919 |
| 3 | 3 | 66.0 | 83.8 | 13 / 35 | 3591 |
| 4 | 2 | 65.1 | 83.5 | 8 / 35 | 3413 |
| 5 | 2 | 67.3 | 87.3 | 20 / 35 | 3426 |
| 6 | 2 | 66.2 | 85.7 | 14 / 35 | 3582 |
| 7 | 2 | 65.8 | 84.1 | 13 / 35 | 3325 |
| 8 | 2 | 67.3 | 87.6 | 17 / 35 | 3691 |
| 9 | 2 | 65.2 | 84.4 | 14 / 35 | 3129 |
| 10 | 2 | 66.9 | 87.3 | 14 / 35 | 3928 |
| 11 | 1 | 66.4 | 85.1 | 18 / 35 | 3361 |
| 12 | 2 | 68.3 | 90.2 | 17 / 35 | 3495 |
| 13 | 2 | 64.8 | 84.1 | 12 / 35 | 2939 |
| 14 | 2 | 67.5 | 86.7 | 15 / 35 | 3576 |
| 15 | 2 | 66.0 | 82.5 | 15 / 35 | 3479 |
| 16 | 2 | 65.0 | 81.0 | 11 / 35 | 3323 |
| 17 | 3 | 64.1 | 77.1 | 12 / 35 | 3202 |
| 18 | 2 | 66.3 | 84.4 | 15 / 35 | 3403 |
| 19 | 2 | 67.0 | 88.6 | 13 / 35 | 3438 |
| 20 | 2 | 66.0 | 82.5 | 13 / 35 | 3761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 240 | 53% |
| cre.Karolos 0.32 | 104 | 60% |
| stelo.AreaTargetingBot 1.1 | 37 | 68% |
| sample.Walls 1.0 | 29 | 100% |
| stelo.RamTrackSurfer 1.2 | 25 | 72% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 430 of 700 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 229 | 53% | 371 |
| cre.Karolos 0.32 | 108 | 25% | 168 |
| stelo.AreaTargetingBot 1.1 | 52 | 12% | 66 |
| stelo.RamTrackSurfer 1.2 | 19 | 4% | 43 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 12 | 3% | 23 |
| sample.Walls 1.0 | 5 | 1% | 17 |
| cw.megas.Blade 0.8 | 4 | 1% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 64.5 | 137 / 700 | 4.19 | 11.8% | 44816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 14.8% | 158 |
| davidalves.Phoenix 0.54 | 2.7 | 13.3% | 142 |
| florent.XSeries.X2 0.12 | 2.8 | 13.6% | 125 |
| pedersen.Ugluk 1.1.1 | 3.9 | 11.9% | 73 |
| hadur117.nano.SanaroB480 0.3 | 4.3 | 11.8% | 137 |
| oog.melee.Corsair 1.0 | 6.3 | 9.5% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.7% | 47 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.8% | 8 |
| as.FrankTheTank 1.3 | 9.5 | 4.9% | 2 |
| evd.X1 0.01 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 64.8 | 8 / 35 | 2103 |
| 2 | 5 | 56.2 | 63.8 | 6 / 35 | 2204 |
| 3 | 4 | 53.4 | 58.4 | 5 / 35 | 2115 |
| 4 | 5 | 56.4 | 64.4 | 5 / 35 | 2250 |
| 5 | 5 | 57.0 | 65.4 | 5 / 35 | 2271 |
| 6 | 5 | 57.1 | 66.3 | 6 / 35 | 2339 |
| 7 | 4 | 57.0 | 65.4 | 7 / 35 | 2532 |
| 8 | 4 | 57.0 | 65.4 | 10 / 35 | 2219 |
| 9 | 4 | 56.8 | 65.7 | 6 / 35 | 2409 |
| 10 | 5 | 56.1 | 65.7 | 7 / 35 | 2084 |
| 11 | 4 | 58.5 | 70.2 | 9 / 35 | 2206 |
| 12 | 3 | 57.7 | 68.3 | 7 / 35 | 2586 |
| 13 | 2 | 59.4 | 73.0 | 12 / 35 | 2117 |
| 14 | 5 | 53.8 | 57.1 | 6 / 35 | 2232 |
| 15 | 4 | 56.2 | 65.4 | 6 / 35 | 2153 |
| 16 | 6 | 53.9 | 59.0 | 3 / 35 | 2184 |
| 17 | 5 | 55.2 | 63.2 | 9 / 35 | 2069 |
| 18 | 2 | 57.6 | 67.3 | 7 / 35 | 2335 |
| 19 | 5 | 55.5 | 63.2 | 7 / 35 | 2120 |
| 20 | 5 | 54.2 | 58.4 | 6 / 35 | 2288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 67 | 57% |
| davidalves.Phoenix 0.54 | 57 | 44% |
| florent.XSeries.X2 0.12 | 41 | 78% |
| pedersen.Ugluk 1.1.1 | 28 | 64% |
| stelo.SoJNanoMelee 1.1 | 23 | 26% |
| oog.melee.Corsair 1.0 | 10 | 90% |
| lunchie.Lunchbox 0.93 | 9 | 33% |
| as.FrankTheTank 1.3 | 5 | 100% |

Hadur died in 565 of 700 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 122 | 22% | 156 |
| davidalves.Phoenix 0.54 | 120 | 21% | 152 |
| pedersen.Ugluk 1.1.1 | 100 | 18% | 114 |
| florent.XSeries.X2 0.12 | 99 | 18% | 127 |
| stelo.SoJNanoMelee 1.1 | 47 | 8% | 53 |
| oog.melee.Corsair 1.0 | 29 | 5% | 42 |
| lunchie.Lunchbox 0.93 | 28 | 5% | 33 |
| evd.X1 0.01 | 10 | 2% | 10 |
| as.FrankTheTank 1.3 | 8 | 1% | 13 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 72.9 | 188 / 700 | 3.17 | 14.9% | 45597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 16.2% | 165 |
| voidious.micro.BlitzBat 1.05 | 2.1 | 15.5% | 146 |
| hadur117.nano.SanaroB480 0.3 | 2.7 | 14.9% | 188 |
| jdw.Hurricane 1.4 | 3.9 | 13.4% | 93 |
| ds.Oo 2.2 | 5.1 | 10.7% | 59 |
| gjr.Cephalosporin 0.1 | 6.0 | 9.4% | 37 |
| adt.Ar2 1.1 | 7.3 | 7.7% | 6 |
| awesomeness.Elite 1.0 | 7.6 | 7.3% | 7 |
| amk.ChumbaMini 0.2 | 9.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 75.7 | 9 / 35 | 2316 |
| 2 | 2 | 60.1 | 74.6 | 10 / 35 | 2147 |
| 3 | 2 | 60.5 | 72.5 | 11 / 35 | 2560 |
| 4 | 2 | 59.4 | 71.8 | 8 / 35 | 2116 |
| 5 | 3 | 59.9 | 71.8 | 11 / 35 | 2388 |
| 6 | 3 | 61.2 | 78.6 | 10 / 35 | 2165 |
| 7 | 3 | 60.8 | 78.2 | 9 / 35 | 1987 |
| 8 | 3 | 61.0 | 71.1 | 11 / 35 | 2606 |
| 9 | 3 | 58.1 | 71.8 | 6 / 35 | 2212 |
| 10 | 3 | 60.9 | 76.1 | 11 / 35 | 2195 |
| 11 | 3 | 57.8 | 67.1 | 8 / 35 | 2307 |
| 12 | 3 | 58.5 | 72.9 | 6 / 35 | 2103 |
| 13 | 3 | 59.6 | 70.7 | 10 / 35 | 2424 |
| 14 | 2 | 59.2 | 72.9 | 11 / 35 | 2173 |
| 15 | 3 | 59.3 | 71.1 | 7 / 35 | 2451 |
| 16 | 3 | 60.8 | 74.6 | 13 / 35 | 2375 |
| 17 | 3 | 58.2 | 69.6 | 9 / 35 | 2228 |
| 18 | 4 | 58.3 | 68.2 | 8 / 35 | 2369 |
| 19 | 2 | 61.1 | 74.6 | 12 / 35 | 2416 |
| 20 | 2 | 59.1 | 73.2 | 8 / 35 | 2059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 134 | 32% |
| voidious.micro.BlitzBat 1.05 | 123 | 35% |
| jdw.Hurricane 1.4 | 67 | 75% |
| ds.Oo 2.2 | 26 | 46% |
| gjr.Cephalosporin 0.1 | 23 | 70% |
| adt.Ar2 1.1 | 15 | 93% |
| awesomeness.Elite 1.0 | 8 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 512 of 700 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 153 | 30% | 198 |
| voidious.mini.BrokenSword 2.0.3 | 147 | 29% | 195 |
| jdw.Hurricane 1.4 | 69 | 13% | 115 |
| ds.Oo 2.2 | 55 | 11% | 71 |
| gjr.Cephalosporin 0.1 | 40 | 8% | 54 |
| adt.Ar2 1.1 | 24 | 5% | 37 |
| awesomeness.Elite 1.0 | 12 | 2% | 18 |
| amk.ChumbaMini 0.2 | 12 | 2% | 12 |

## Melee bench: F26

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 72.3 | 142 / 700 | 3.49 | 13.2% | 59119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.3% | 231 |
| hadur117.nano.SanaroB480 0.3 | 3.0 | 13.2% | 142 |
| shu.nitro.LENIN .T34 | 3.1 | 13.1% | 150 |
| lrem.Spectre 0.4.4 | 3.4 | 12.7% | 86 |
| js.PinBall 1.6 | 5.1 | 11.3% | 35 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.9% | 30 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.3% | 20 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.5% | 4 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 4 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 66.0 | 7 / 35 | 2832 |
| 2 | 3 | 60.5 | 74.3 | 6 / 35 | 2894 |
| 3 | 2 | 61.6 | 78.7 | 10 / 35 | 2651 |
| 4 | 4 | 59.2 | 71.1 | 4 / 35 | 2828 |
| 5 | 4 | 58.0 | 66.7 | 5 / 35 | 2922 |
| 6 | 2 | 60.8 | 74.9 | 8 / 35 | 2974 |
| 7 | 2 | 60.9 | 74.3 | 8 / 35 | 3118 |
| 8 | 2 | 60.7 | 72.4 | 8 / 35 | 3049 |
| 9 | 4 | 58.5 | 69.2 | 4 / 35 | 2834 |
| 10 | 4 | 59.2 | 70.5 | 5 / 35 | 2839 |
| 11 | 3 | 61.8 | 76.5 | 8 / 35 | 3187 |
| 12 | 4 | 59.0 | 69.8 | 5 / 35 | 2774 |
| 13 | 3 | 60.3 | 73.0 | 7 / 35 | 3123 |
| 14 | 2 | 60.9 | 74.3 | 8 / 35 | 2893 |
| 15 | 3 | 60.2 | 72.1 | 6 / 35 | 2980 |
| 16 | 3 | 60.9 | 71.4 | 9 / 35 | 3205 |
| 17 | 2 | 61.0 | 72.4 | 8 / 35 | 3346 |
| 18 | 3 | 59.8 | 71.4 | 9 / 35 | 2638 |
| 19 | 4 | 58.9 | 68.9 | 6 / 35 | 2755 |
| 20 | 2 | 63.0 | 77.8 | 11 / 35 | 3277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 134 | 40% |
| lrem.Spectre 0.4.4 | 63 | 56% |
| shu.nitro.LENIN .T34 | 58 | 19% |
| gh.mini.GrubbmOne 1.0 | 18 | 61% |
| js.PinBall 1.6 | 15 | 87% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 64% |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 89% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 559 of 700 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 183 | 33% | 231 |
| shu.nitro.LENIN .T34 | 98 | 18% | 117 |
| gh.mini.GrubbmOne 1.0 | 86 | 15% | 100 |
| lrem.Spectre 0.4.4 | 68 | 12% | 94 |
| js.PinBall 1.6 | 57 | 10% | 71 |
| jaybot.adv.bots.JayBot 2.0 | 37 | 7% | 44 |
| sample.SpinBot 1.0 | 21 | 4% | 24 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 1% | 19 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 72.8 | 251 / 700 | 3.44 | 13.8% | 52724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.2 | 15.9% | 240 |
| hadur117.nano.SanaroB480 0.3 | 2.2 | 13.8% | 251 |
| wee.Gem 1.8.4 | 3.3 | 12.5% | 114 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.7% | 42 |
| EH.Eagle 1.0.6 | 5.2 | 10.2% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.0% | 14 |
| joe.ADinosaur 1.0 | 7.4 | 7.8% | 5 |
| throxbot.ThroxBot 0.1 | 7.4 | 7.7% | 9 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.6% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 75.9 | 14 / 35 | 2608 |
| 2 | 1 | 64.2 | 85.7 | 18 / 35 | 2707 |
| 3 | 5 | 51.8 | 43.5 | 3 / 35 | 3744 |
| 4 | 1 | 61.9 | 80.3 | 13 / 35 | 2507 |
| 5 | 2 | 60.5 | 75.9 | 12 / 35 | 2359 |
| 6 | 2 | 60.4 | 77.1 | 14 / 35 | 2070 |
| 7 | 2 | 62.6 | 80.6 | 17 / 35 | 2400 |
| 8 | 1 | 60.5 | 74.0 | 13 / 35 | 2587 |
| 9 | 4 | 56.5 | 52.4 | 8 / 35 | 3836 |
| 10 | 1 | 61.5 | 77.8 | 17 / 35 | 2289 |
| 11 | 2 | 62.1 | 79.7 | 16 / 35 | 2485 |
| 12 | 4 | 55.5 | 48.6 | 5 / 35 | 4241 |
| 13 | 2 | 59.2 | 73.0 | 11 / 35 | 2315 |
| 14 | 2 | 59.4 | 72.4 | 10 / 35 | 2381 |
| 15 | 2 | 60.1 | 74.3 | 11 / 35 | 2393 |
| 16 | 2 | 61.6 | 77.5 | 15 / 35 | 2348 |
| 17 | 2 | 62.2 | 78.4 | 14 / 35 | 2564 |
| 18 | 2 | 61.0 | 77.1 | 14 / 35 | 2366 |
| 19 | 3 | 59.9 | 73.7 | 11 / 35 | 2241 |
| 20 | 2 | 61.5 | 79.0 | 15 / 35 | 2283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 180 | 64% |
| wee.Gem 1.8.4 | 85 | 64% |
| sheldor.melee.nano.TestMelee 0.1 | 50 | 74% |
| EH.Eagle 1.0.6 | 23 | 78% |
| techdude.kombat.FlamingKombat 1.5 | 17 | 71% |
| joe.ADinosaur 1.0 | 7 | 71% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 450 of 700 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 141 | 31% | 251 |
| wee.Gem 1.8.4 | 74 | 16% | 131 |
| sheldor.melee.nano.TestMelee 0.1 | 65 | 14% | 106 |
| joe.ADinosaur 1.0 | 43 | 10% | 45 |
| EH.Eagle 1.0.6 | 37 | 8% | 60 |
| throxbot.ThroxBot 0.1 | 37 | 8% | 44 |
| caimano.Furia_Ceca 0.22 | 18 | 4% | 20 |
| cs.Grudge 1.0 | 18 | 4% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 16 | 4% | 24 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 82.5 | 303 / 700 | 2.58 | 15.9% | 61375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.4 | 15.9% | 303 |
| kid.test.NightFox .2 | 1.6 | 15.8% | 174 |
| uji.Antique 1.0 | 3.5 | 12.2% | 95 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.4% | 68 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.7% | 26 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.3% | 9 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 21 |
| matt.advanced.Katana 1.0 | 8.4 | 6.3% | 3 |
| stelo.PianistNano 1.2 | 9.0 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 81.3 | 14 / 35 | 3357 |
| 2 | 2 | 62.0 | 78.1 | 14 / 35 | 2715 |
| 3 | 2 | 62.4 | 79.7 | 11 / 35 | 2737 |
| 4 | 1 | 64.9 | 84.8 | 16 / 35 | 3233 |
| 5 | 2 | 63.1 | 80.0 | 13 / 35 | 3059 |
| 6 | 1 | 66.8 | 89.8 | 19 / 35 | 3305 |
| 7 | 1 | 65.0 | 87.9 | 13 / 35 | 3085 |
| 8 | 1 | 63.5 | 83.2 | 15 / 35 | 2976 |
| 9 | 1 | 63.8 | 81.3 | 15 / 35 | 3221 |
| 10 | 2 | 63.9 | 83.2 | 14 / 35 | 3024 |
| 11 | 1 | 64.7 | 83.8 | 18 / 35 | 3151 |
| 12 | 1 | 65.2 | 85.7 | 20 / 35 | 3075 |
| 13 | 2 | 63.7 | 82.2 | 14 / 35 | 2918 |
| 14 | 1 | 62.7 | 80.6 | 12 / 35 | 2898 |
| 15 | 2 | 64.3 | 82.2 | 15 / 35 | 3275 |
| 16 | 2 | 61.1 | 72.4 | 13 / 35 | 3036 |
| 17 | 1 | 63.5 | 81.6 | 16 / 35 | 2918 |
| 18 | 1 | 66.2 | 89.2 | 17 / 35 | 3415 |
| 19 | 1 | 63.5 | 79.0 | 17 / 35 | 3054 |
| 20 | 1 | 64.4 | 83.2 | 17 / 35 | 2923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 257 | 68% |
| uji.Antique 1.0 | 86 | 69% |
| qohnil.blot.BlotBot 3.61 | 59 | 42% |
| amk.ChumbaWumba 0.3 | 22 | 82% |
| pfvicm.Sobieski 7.2.3b | 16 | 69% |
| ahr.ice.Ice 1.0.2 | 13 | 54% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 397 of 700 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 143 | 36% | 284 |
| uji.Antique 1.0 | 60 | 15% | 135 |
| pfvicm.Sobieski 7.2.3b | 60 | 15% | 76 |
| qohnil.blot.BlotBot 3.61 | 51 | 13% | 86 |
| amk.ChumbaWumba 0.3 | 34 | 9% | 45 |
| ahr.ice.Ice 1.0.2 | 28 | 7% | 40 |
| stelo.PianistNano 1.2 | 9 | 2% | 10 |
| stelo.Lifestealer 1.0 | 7 | 2% | 9 |
| matt.advanced.Katana 1.0 | 5 | 1% | 13 |

## Melee bench: F29

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 70.4 | 153 / 700 | 3.67 | 13.5% | 57203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.4% | 225 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.7% | 189 |
| hadur117.nano.SanaroB480 0.3 | 3.1 | 13.5% | 153 |
| myl.micro.Troodon 1.10 | 3.9 | 12.5% | 44 |
| jok.PheonixM 0.1.2 | 4.9 | 11.1% | 30 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.2% | 6 |
| DBall.Anarchy 0.1 | 6.6 | 8.0% | 45 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.6% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.6% | 6 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 61.9 | 8 / 35 | 2773 |
| 2 | 3 | 60.9 | 71.4 | 9 / 35 | 2832 |
| 3 | 2 | 63.2 | 77.1 | 13 / 35 | 2902 |
| 4 | 3 | 60.8 | 69.2 | 9 / 35 | 3132 |
| 5 | 4 | 59.4 | 67.9 | 5 / 35 | 2882 |
| 6 | 3 | 61.6 | 74.0 | 8 / 35 | 3012 |
| 7 | 3 | 62.6 | 74.3 | 10 / 35 | 3095 |
| 8 | 2 | 61.5 | 74.0 | 7 / 35 | 3035 |
| 9 | 3 | 56.7 | 60.6 | 6 / 35 | 2524 |
| 10 | 3 | 59.5 | 66.7 | 6 / 35 | 2992 |
| 11 | 3 | 62.1 | 75.2 | 6 / 35 | 3073 |
| 12 | 3 | 62.0 | 73.0 | 10 / 35 | 3123 |
| 13 | 1 | 65.2 | 81.9 | 14 / 35 | 3271 |
| 14 | 3 | 59.4 | 67.6 | 6 / 35 | 2749 |
| 15 | 4 | 58.7 | 65.1 | 6 / 35 | 2683 |
| 16 | 3 | 58.5 | 68.3 | 3 / 35 | 2689 |
| 17 | 3 | 62.7 | 77.1 | 10 / 35 | 2931 |
| 18 | 3 | 60.4 | 72.4 | 7 / 35 | 2453 |
| 19 | 5 | 56.5 | 62.2 | 6 / 35 | 2492 |
| 20 | 3 | 58.5 | 67.3 | 4 / 35 | 2560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 139 | 9% |
| zyx.mega.YersiniaPestis 3.1 | 101 | 66% |
| myl.micro.Troodon 1.10 | 45 | 80% |
| DBall.Anarchy 0.1 | 32 | 66% |
| jok.PheonixM 0.1.2 | 19 | 58% |
| ap.Frederick 1.1 | 4 | 75% |
| ph.melee.ArcherME 0.3 | 3 | 67% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 548 of 700 rounds, at a mean tick of 1303. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 245 | 45% | 261 |
| zyx.mega.YersiniaPestis 3.1 | 113 | 21% | 173 |
| myl.micro.Troodon 1.10 | 69 | 13% | 104 |
| jok.PheonixM 0.1.2 | 52 | 9% | 66 |
| ph.melee.ArcherME 0.3 | 25 | 5% | 30 |
| DBall.Anarchy 0.1 | 24 | 4% | 46 |
| fullsail.TimbotNoPrediction 1.0 | 11 | 2% | 12 |
| jangs.ns51 1.0 | 8 | 1% | 8 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 62.3 | 96 / 700 | 4.01 | 12.5% | 46672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.9 | 16.6% | 230 |
| stelo.PastFuture 2.3.2 | 2.1 | 15.9% | 138 |
| oog.melee.Capulet 1.2 | 2.1 | 16.1% | 159 |
| hadur117.nano.SanaroB480 0.3 | 4.1 | 12.5% | 96 |
| intruder.PrairieWolf 2.61 | 5.7 | 9.9% | 36 |
| tripphippy.Alice 1.1 | 6.5 | 9.0% | 19 |
| ntc.Opposite 1.5 | 6.7 | 8.8% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.1 | 8.5% | 16 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 65.7 | 5 / 35 | 2304 |
| 2 | 4 | 56.9 | 66.1 | 4 / 35 | 2233 |
| 3 | 5 | 50.8 | 49.3 | 2 / 35 | 2299 |
| 4 | 4 | 54.1 | 58.9 | 2 / 35 | 2299 |
| 5 | 4 | 56.6 | 62.9 | 7 / 35 | 2495 |
| 6 | 4 | 55.8 | 61.8 | 6 / 35 | 2432 |
| 7 | 4 | 53.4 | 56.8 | 3 / 35 | 2357 |
| 8 | 4 | 51.7 | 54.3 | 3 / 35 | 2075 |
| 9 | 4 | 58.8 | 71.4 | 6 / 35 | 2401 |
| 10 | 4 | 57.3 | 70.7 | 6 / 35 | 2182 |
| 11 | 4 | 55.1 | 62.5 | 6 / 35 | 2025 |
| 12 | 4 | 58.3 | 69.6 | 9 / 35 | 2334 |
| 13 | 4 | 55.4 | 62.9 | 5 / 35 | 2206 |
| 14 | 4 | 55.9 | 60.7 | 2 / 35 | 2907 |
| 15 | 4 | 53.6 | 55.0 | 5 / 35 | 2480 |
| 16 | 4 | 56.7 | 65.4 | 7 / 35 | 2279 |
| 17 | 4 | 57.5 | 68.6 | 2 / 35 | 2328 |
| 18 | 4 | 55.5 | 64.6 | 2 / 35 | 2315 |
| 19 | 4 | 59.3 | 70.4 | 9 / 35 | 2487 |
| 20 | 4 | 51.1 | 49.3 | 5 / 35 | 2234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 78 | 28% |
| oog.melee.Capulet 1.2 | 64 | 28% |
| stelo.PastFuture 2.3.2 | 51 | 61% |
| intruder.PrairieWolf 2.61 | 25 | 56% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 78% |
| tripphippy.Alice 1.1 | 4 | 50% |
| ntc.Opposite 1.5 | 3 | 33% |

Hadur died in 605 of 700 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 149 | 25% | 171 |
| stelo.PastFuture 2.3.2 | 141 | 23% | 170 |
| oog.melee.Capulet 1.2 | 129 | 21% | 158 |
| ntc.Opposite 1.5 | 53 | 9% | 53 |
| intruder.PrairieWolf 2.61 | 44 | 7% | 53 |
| fowl3628800.LightningBolt 2.6.0 | 42 | 7% | 46 |
| tripphippy.Alice 1.1 | 41 | 7% | 43 |
| GarmBox.Anger 1.0 | 6 | 1% | 6 |

## Melee bench: F31

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 62.8 | 91 / 700 | 4.35 | 11.2% | 41092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 344 |
| gh.mini.Griezel 0.2 | 2.0 | 14.1% | 167 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.9% | 45 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.8% | 40 |
| hadur117.nano.SanaroB480 0.3 | 4.4 | 11.2% | 91 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.3% | 12 |
| timmit.nano.TimDog 0.33 | 7.6 | 6.7% | 3 |
| fm.mammillarias 1.3 | 7.7 | 6.5% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.5 | 65.1 | 3 / 35 | 2218 |
| 2 | 3 | 57.7 | 68.6 | 7 / 35 | 2166 |
| 3 | 5 | 54.3 | 61.0 | 4 / 35 | 1890 |
| 4 | 5 | 52.2 | 57.5 | 2 / 35 | 1756 |
| 5 | 3 | 59.8 | 75.2 | 5 / 35 | 2324 |
| 6 | 5 | 50.9 | 53.7 | 3 / 35 | 1906 |
| 7 | 4 | 53.8 | 58.1 | 5 / 35 | 2049 |
| 8 | 3 | 55.8 | 64.4 | 7 / 35 | 1804 |
| 9 | 5 | 54.1 | 60.6 | 2 / 35 | 2027 |
| 10 | 5 | 55.4 | 61.3 | 3 / 35 | 2283 |
| 11 | 5 | 53.9 | 60.3 | 3 / 35 | 1946 |
| 12 | 5 | 55.0 | 63.5 | 2 / 35 | 1980 |
| 13 | 6 | 49.4 | 49.8 | 4 / 35 | 1807 |
| 14 | 5 | 56.6 | 64.4 | 6 / 35 | 2140 |
| 15 | 5 | 55.1 | 62.9 | 5 / 35 | 2108 |
| 16 | 4 | 56.5 | 63.8 | 6 / 35 | 2135 |
| 17 | 5 | 54.6 | 60.6 | 4 / 35 | 2069 |
| 18 | 3 | 58.7 | 70.8 | 8 / 35 | 2210 |
| 19 | 4 | 55.9 | 63.2 | 3 / 35 | 2097 |
| 20 | 3 | 59.6 | 71.7 | 9 / 35 | 2177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 107 | 40% |
| abc.Shadow 3.84i | 106 | 33% |
| d414.nano.Quantum 1.0.0 | 15 | 13% |
| spinnercat.micro.Tyger 0.1 | 14 | 7% |
| gh.nano.Grofvuil 0.2 | 7 | 71% |
| fm.mammillarias 1.3 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 610 of 700 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 175 | 29% | 219 |
| abc.Shadow 3.84i | 146 | 24% | 181 |
| spinnercat.micro.Tyger 0.1 | 101 | 17% | 105 |
| d414.nano.Quantum 1.0.0 | 85 | 14% | 86 |
| gh.nano.Grofvuil 0.2 | 45 | 7% | 52 |
| timmit.nano.TimDog 0.33 | 22 | 4% | 22 |
| fm.mammillarias 1.3 | 21 | 3% | 21 |
| Gecko.ultimateGeckoBot 1.0 | 11 | 2% | 11 |
| tlp.ThreeLeggedPig 1 | 3 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 79.4 | 307 / 700 | 2.85 | 15.1% | 59547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.5% | 191 |
| hadur117.nano.SanaroB480 0.3 | 1.7 | 15.1% | 307 |
| apc.botM 3.0 | 3.3 | 12.1% | 90 |
| lxx.ConceptA 0.8 | 4.4 | 11.0% | 12 |
| vjik.UnViolation 1.1 | 4.6 | 10.8% | 44 |
| bayen.UbaMicro 1.4 | 5.7 | 9.6% | 22 |
| panzer.Panzer 0.2 | 7.5 | 7.2% | 1 |
| yk.JahMicro 1.0 | 8.1 | 6.9% | 17 |
| conscience.Electron 1.3g | 9.0 | 6.1% | 4 |
| donjezza.Jezza 1.0 | 9.4 | 5.6% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 84.1 | 18 / 35 | 3063 |
| 2 | 3 | 59.6 | 70.5 | 14 / 35 | 2854 |
| 3 | 3 | 59.9 | 71.7 | 13 / 35 | 2796 |
| 4 | 2 | 63.7 | 84.1 | 14 / 35 | 2898 |
| 5 | 1 | 61.2 | 75.9 | 13 / 35 | 2984 |
| 6 | 2 | 63.1 | 80.6 | 17 / 35 | 2911 |
| 7 | 2 | 61.7 | 75.2 | 15 / 35 | 3230 |
| 8 | 2 | 62.6 | 79.0 | 17 / 35 | 2940 |
| 9 | 2 | 62.3 | 78.7 | 13 / 35 | 3068 |
| 10 | 1 | 64.1 | 84.8 | 20 / 35 | 2844 |
| 11 | 2 | 60.5 | 76.2 | 13 / 35 | 2498 |
| 12 | 2 | 63.0 | 81.3 | 13 / 35 | 2951 |
| 13 | 1 | 63.8 | 83.5 | 16 / 35 | 3134 |
| 14 | 2 | 61.9 | 77.5 | 16 / 35 | 2797 |
| 15 | 1 | 63.6 | 82.2 | 17 / 35 | 3020 |
| 16 | 1 | 64.1 | 82.9 | 19 / 35 | 3118 |
| 17 | 1 | 63.7 | 84.1 | 17 / 35 | 2915 |
| 18 | 2 | 61.6 | 76.8 | 10 / 35 | 3103 |
| 19 | 2 | 61.3 | 76.2 | 14 / 35 | 3025 |
| 20 | 1 | 64.2 | 82.5 | 18 / 35 | 3398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 205 | 60% |
| apc.botM 3.0 | 94 | 67% |
| vjik.UnViolation 1.1 | 48 | 75% |
| lxx.ConceptA 0.8 | 41 | 90% |
| bayen.UbaMicro 1.4 | 22 | 82% |
| yk.JahMicro 1.0 | 18 | 78% |
| donjezza.Jezza 1.0 | 15 | 53% |
| panzer.Panzer 0.2 | 9 | 89% |

Hadur died in 394 of 700 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 130 | 33% | 258 |
| lxx.ConceptA 0.8 | 83 | 21% | 98 |
| apc.botM 3.0 | 58 | 15% | 129 |
| bayen.UbaMicro 1.4 | 38 | 10% | 50 |
| vjik.UnViolation 1.1 | 29 | 7% | 80 |
| panzer.Panzer 0.2 | 21 | 5% | 22 |
| yk.JahMicro 1.0 | 13 | 3% | 20 |
| conscience.Electron 1.3g | 13 | 3% | 19 |
| donjezza.Jezza 1.0 | 9 | 2% | 22 |

## Melee bench: F33

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 75.8 | 185 / 700 | 2.93 | 16.0% | 61004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 19.2% | 207 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 15.6% | 171 |
| hadur117.nano.SanaroB480 0.3 | 2.6 | 16.0% | 185 |
| labg.Cataclysm 2.05 | 4.0 | 13.2% | 96 |
| baal.nano.N 1.42 | 5.4 | 10.0% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.7% | 27 |
| zyx.micro.Ant 1.1 | 7.1 | 6.4% | 6 |
| sanja.First 0.1 | 8.0 | 5.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.3 | 10 / 35 | 3257 |
| 2 | 3 | 61.2 | 70.7 | 9 / 35 | 3059 |
| 3 | 2 | 64.7 | 81.4 | 13 / 35 | 3157 |
| 4 | 2 | 62.6 | 76.4 | 10 / 35 | 3022 |
| 5 | 3 | 62.3 | 75.4 | 8 / 35 | 3022 |
| 6 | 2 | 62.7 | 76.1 | 10 / 35 | 3089 |
| 7 | 2 | 64.5 | 82.1 | 12 / 35 | 3181 |
| 8 | 2 | 61.7 | 73.9 | 8 / 35 | 3015 |
| 9 | 2 | 64.6 | 81.4 | 14 / 35 | 3109 |
| 10 | 3 | 60.4 | 71.4 | 4 / 35 | 3004 |
| 11 | 3 | 63.1 | 78.2 | 9 / 35 | 2972 |
| 12 | 3 | 61.7 | 73.2 | 9 / 35 | 3027 |
| 13 | 3 | 62.1 | 72.1 | 7 / 35 | 3297 |
| 14 | 3 | 62.1 | 74.3 | 7 / 35 | 3100 |
| 15 | 2 | 63.7 | 80.4 | 12 / 35 | 3097 |
| 16 | 2 | 61.3 | 71.1 | 10 / 35 | 2981 |
| 17 | 3 | 61.9 | 75.7 | 8 / 35 | 3033 |
| 18 | 3 | 64.5 | 82.5 | 12 / 35 | 2975 |
| 19 | 3 | 59.6 | 69.6 | 6 / 35 | 2773 |
| 20 | 3 | 61.7 | 76.1 | 7 / 35 | 2834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 166 | 54% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 162 | 22% |
| labg.Cataclysm 2.05 | 66 | 42% |
| kinsen.melee.Angsaichmophobia 1.8c | 20 | 80% |
| baal.nano.N 1.42 | 7 | 71% |
| zyx.micro.Ant 1.1 | 6 | 83% |
| sanja.First 0.1 | 5 | 100% |

Hadur died in 516 of 700 rounds, at a mean tick of 1637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 198 | 38% | 295 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 174 | 34% | 214 |
| labg.Cataclysm 2.05 | 56 | 11% | 80 |
| kinsen.melee.Angsaichmophobia 1.8c | 38 | 7% | 45 |
| baal.nano.N 1.42 | 24 | 5% | 30 |
| zyx.micro.Ant 1.1 | 19 | 4% | 25 |
| sanja.First 0.1 | 4 | 1% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.9 | 156 / 700 | 3.26 | 13.7% | 59401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.7% | 207 |
| stelo.Spread 0.9 | 1.6 | 17.6% | 267 |
| hadur117.nano.SanaroB480 0.3 | 3.1 | 13.7% | 156 |
| jcs.Seth 1.8 | 4.6 | 11.2% | 38 |
| tcf.Reach 3 | 4.7 | 11.0% | 27 |
| cli.Dancer 1.1 | 5.7 | 9.8% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 9.1 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 82.5 | 14 / 35 | 3204 |
| 2 | 3 | 61.4 | 73.7 | 8 / 35 | 2783 |
| 3 | 3 | 63.8 | 81.0 | 7 / 35 | 3183 |
| 4 | 3 | 61.1 | 71.1 | 6 / 35 | 3430 |
| 5 | 4 | 59.2 | 68.9 | 5 / 35 | 2561 |
| 6 | 3 | 63.3 | 80.0 | 7 / 35 | 3117 |
| 7 | 3 | 60.6 | 71.7 | 6 / 35 | 2963 |
| 8 | 4 | 59.4 | 67.3 | 4 / 35 | 2904 |
| 9 | 3 | 60.4 | 70.5 | 8 / 35 | 2717 |
| 10 | 3 | 62.2 | 76.8 | 6 / 35 | 2825 |
| 11 | 3 | 63.4 | 79.0 | 12 / 35 | 3082 |
| 12 | 3 | 64.3 | 80.3 | 13 / 35 | 3365 |
| 13 | 3 | 61.4 | 77.1 | 5 / 35 | 2662 |
| 14 | 3 | 61.2 | 73.3 | 7 / 35 | 2932 |
| 15 | 3 | 61.0 | 71.1 | 8 / 35 | 3008 |
| 16 | 3 | 61.6 | 73.0 | 11 / 35 | 2704 |
| 17 | 3 | 62.3 | 75.2 | 5 / 35 | 3210 |
| 18 | 3 | 60.8 | 74.9 | 5 / 35 | 2543 |
| 19 | 3 | 62.3 | 75.2 | 9 / 35 | 3086 |
| 20 | 3 | 62.6 | 75.9 | 10 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 135 | 53% |
| kid.Gladiator .7.2 | 122 | 44% |
| jcs.Seth 1.8 | 27 | 63% |
| tcf.Reach 3 | 16 | 56% |
| cli.Dancer 1.1 | 4 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 547 of 700 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 239 | 44% | 272 |
| stelo.Spread 0.9 | 182 | 33% | 261 |
| jcs.Seth 1.8 | 45 | 8% | 66 |
| tcf.Reach 3 | 36 | 7% | 54 |
| ratosh.Wesco 1.4 | 18 | 3% | 20 |
| cli.Dancer 1.1 | 16 | 3% | 19 |
| amk.Punbot.Punbot 0.01 | 6 | 1% | 6 |
| sample.VelociRobot 1.0 | 2 | 0% | 2 |
3 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 71.4 | 56 / 700 | 3.57 | 12.5% | 46721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 526 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.6% | 61 |
| hadur117.nano.SanaroB480 0.3 | 3.6 | 12.5% | 56 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.4% | 41 |
| rz.HawkOnFire 0.1 | 4.3 | 12.0% | 15 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 6.9% | 1 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 1 |
| dans.Cinnamon 1.2 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 74.0 | 2 / 35 | 2276 |
| 2 | 5 | 56.0 | 64.4 | 3 / 35 | 2222 |
| 3 | 3 | 59.8 | 71.7 | 6 / 35 | 2601 |
| 4 | 3 | 60.6 | 75.9 | 3 / 35 | 2387 |
| 5 | 3 | 58.9 | 72.1 | 2 / 35 | 2293 |
| 6 | 3 | 58.8 | 74.0 | 3 / 35 | 2064 |
| 7 | 3 | 59.3 | 73.7 | 2 / 35 | 2442 |
| 8 | 5 | 59.6 | 73.7 | 3 / 35 | 2378 |
| 9 | 3 | 58.7 | 73.0 | 1 / 35 | 2162 |
| 10 | 5 | 57.8 | 67.6 | 1 / 35 | 2512 |
| 11 | 4 | 57.7 | 67.3 | 1 / 35 | 2330 |
| 12 | 2 | 60.9 | 78.4 | 6 / 35 | 2217 |
| 13 | 5 | 57.7 | 67.6 | 2 / 35 | 2315 |
| 14 | 3 | 59.6 | 73.0 | 4 / 35 | 2297 |
| 15 | 2 | 59.4 | 72.7 | 3 / 35 | 2536 |
| 16 | 3 | 58.8 | 69.8 | 3 / 35 | 2520 |
| 17 | 4 | 58.5 | 68.6 | 4 / 35 | 2434 |
| 18 | 4 | 57.5 | 67.3 | 3 / 35 | 2193 |
| 19 | 4 | 58.6 | 72.4 | 2 / 35 | 2136 |
| 20 | 3 | 58.5 | 70.8 | 2 / 35 | 2406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 194 | 5% |
| gh.mini.Gruwel 0.9 | 57 | 44% |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 42% |
| rz.HawkOnFire 0.1 | 14 | 79% |
| wit.Chuliath 1.0 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 646 of 700 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 298 | 46% | 305 |
| dmh.robocode.robot.BlackDeath 9.2 | 97 | 15% | 111 |
| gh.mini.Gruwel 0.9 | 93 | 14% | 117 |
| rz.HawkOnFire 0.1 | 91 | 14% | 99 |
| myl.nano.KomoriNinja 1.1 | 25 | 4% | 26 |
| wit.Chuliath 1.0 | 12 | 2% | 13 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 2% | 12 |
| stelo.MyAgileRobot 0.2 | 12 | 2% | 12 |
| dans.Cinnamon 1.2 | 5 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.8 | 304 / 700 | 3.00 | 15.4% | 65161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.1 | 15.4% | 304 |
| bzdp.Pansy 2.1 | 2.8 | 12.6% | 95 |
| alpha.RainingFire 1.0 | 2.8 | 12.6% | 92 |
| mz.Cork 0.1 | 4.1 | 11.4% | 67 |
| bvh.micro.Freya 0.3 | 5.1 | 10.8% | 50 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.8% | 37 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.9% | 13 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.7% | 16 |
| dl.BetterWalls 1.0 | 8.6 | 6.4% | 5 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 24 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 79.0 | 19 / 35 | 3217 |
| 2 | 1 | 62.0 | 72.7 | 14 / 35 | 3532 |
| 3 | 1 | 63.6 | 79.7 | 14 / 35 | 3391 |
| 4 | 1 | 63.5 | 80.6 | 16 / 35 | 2989 |
| 5 | 1 | 68.5 | 92.1 | 25 / 35 | 3815 |
| 6 | 1 | 60.8 | 73.0 | 13 / 35 | 3162 |
| 7 | 1 | 62.3 | 78.1 | 10 / 35 | 3293 |
| 8 | 1 | 60.2 | 67.9 | 15 / 35 | 3261 |
| 9 | 1 | 63.0 | 79.0 | 16 / 35 | 2895 |
| 10 | 1 | 62.3 | 76.2 | 12 / 35 | 3472 |
| 11 | 1 | 64.4 | 80.0 | 18 / 35 | 3357 |
| 12 | 1 | 62.2 | 77.8 | 15 / 35 | 2852 |
| 13 | 1 | 61.4 | 74.0 | 12 / 35 | 3110 |
| 14 | 1 | 64.1 | 79.4 | 17 / 35 | 3456 |
| 15 | 1 | 61.7 | 72.4 | 15 / 35 | 3308 |
| 16 | 2 | 61.4 | 73.0 | 12 / 35 | 3117 |
| 17 | 1 | 62.2 | 74.9 | 14 / 35 | 2974 |
| 18 | 1 | 63.2 | 79.0 | 12 / 35 | 3315 |
| 19 | 1 | 65.0 | 83.5 | 16 / 35 | 3579 |
| 20 | 1 | 64.7 | 84.1 | 19 / 35 | 3066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 104 | 63% |
| mz.Cork 0.1 | 75 | 76% |
| bvh.micro.Freya 0.3 | 65 | 80% |
| alpha.RainingFire 1.0 | 64 | 59% |
| bvh.mini.Fenrir 0.39 | 46 | 91% |
| m3thos.Eva02 0.7.1 | 37 | 78% |
| sample.MyFirstRobot 1.0 | 17 | 29% |
| squidM.TentalceMeleeNano 1.1 | 14 | 71% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 399 of 700 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 84 | 21% | 164 |
| alpha.RainingFire 1.0 | 82 | 21% | 118 |
| mz.Cork 0.1 | 52 | 13% | 115 |
| bvh.mini.Fenrir 0.39 | 48 | 12% | 69 |
| m3thos.Eva02 0.7.1 | 44 | 11% | 78 |
| bvh.micro.Freya 0.3 | 42 | 11% | 81 |
| squidM.TentalceMeleeNano 1.1 | 18 | 5% | 31 |
| sample.MyFirstRobot 1.0 | 17 | 4% | 22 |
| dl.BetterWalls 1.0 | 11 | 3% | 22 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 79.8 | 295 / 700 | 2.82 | 15.6% | 79796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.0 | 15.6% | 295 |
| germ.TheMind .2 | 2.9 | 11.5% | 85 |
| EBBU.Sim2 1.02 | 3.4 | 10.8% | 64 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.9 | 10.7% | 46 |
| agrach.Dalek 1.0 | 6.2 | 9.2% | 52 |
| lmk.ACPFinal 0.1 | 6.6 | 9.0% | 36 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.6% | 37 |
| skm.Ryubot 1.0 | 7.7 | 8.2% | 37 |
| mb.Beast 0.1 | 7.9 | 8.4% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 8.0% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 75.9 | 15 / 35 | 3896 |
| 2 | 1 | 62.2 | 83.2 | 14 / 35 | 3378 |
| 3 | 1 | 63.7 | 83.8 | 20 / 35 | 3698 |
| 4 | 1 | 61.4 | 77.8 | 13 / 35 | 3645 |
| 5 | 1 | 62.2 | 79.7 | 15 / 35 | 3822 |
| 6 | 1 | 61.0 | 75.6 | 10 / 35 | 4125 |
| 7 | 1 | 63.0 | 82.5 | 13 / 35 | 3995 |
| 8 | 1 | 64.0 | 84.1 | 16 / 35 | 3832 |
| 9 | 1 | 61.1 | 74.3 | 12 / 35 | 4098 |
| 10 | 1 | 64.1 | 81.9 | 15 / 35 | 4459 |
| 11 | 1 | 64.7 | 84.1 | 16 / 35 | 4623 |
| 12 | 1 | 60.2 | 72.4 | 12 / 35 | 3940 |
| 13 | 1 | 62.3 | 78.4 | 17 / 35 | 3731 |
| 14 | 1 | 60.5 | 73.0 | 12 / 35 | 4018 |
| 15 | 1 | 63.6 | 79.0 | 17 / 35 | 4639 |
| 16 | 1 | 63.5 | 81.9 | 16 / 35 | 4177 |
| 17 | 1 | 64.5 | 83.2 | 16 / 35 | 4572 |
| 18 | 1 | 63.9 | 86.0 | 14 / 35 | 3814 |
| 19 | 1 | 62.4 | 79.4 | 18 / 35 | 3455 |
| 20 | 1 | 62.4 | 80.0 | 14 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 97 | 68% |
| EBBU.Sim2 1.02 | 66 | 48% |
| com.syncleus.robocode.Dreadnaught 0.1 | 46 | 70% |
| agrach.Dalek 1.0 | 46 | 78% |
| stelo.UntouchableNano 1.3 | 45 | 82% |
| skm.Ryubot 1.0 | 43 | 58% |
| mb.Beast 0.1 | 42 | 71% |
| lmk.ACPFinal 0.1 | 40 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 80% |

Hadur died in 408 of 700 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 88 | 22% | 145 |
| EBBU.Sim2 1.02 | 67 | 16% | 100 |
| com.syncleus.robocode.Dreadnaught 0.1 | 55 | 13% | 99 |
| lmk.ACPFinal 0.1 | 49 | 12% | 71 |
| mb.Beast 0.1 | 37 | 9% | 70 |
| agrach.Dalek 1.0 | 32 | 8% | 81 |
| mn.nano.perceptual.Impact 1.3.0 | 29 | 7% | 36 |
| skm.Ryubot 1.0 | 26 | 6% | 42 |
| stelo.UntouchableNano 1.3 | 25 | 6% | 56 |

## Melee bench: F38

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 69.2 | 124 / 700 | 3.77 | 12.5% | 50813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.8% | 280 |
| bvh.mini.Freya 0.55 | 2.8 | 13.1% | 66 |
| hadur117.nano.SanaroB480 0.3 | 3.0 | 12.5% | 124 |
| bts.mega.Gnarly 1.4 | 4.6 | 11.4% | 97 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.1% | 52 |
| cs.Wren 1.0 | 5.0 | 11.3% | 45 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.3% | 21 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.1% | 15 |
| bzdp.BoxCar 2.0 | 9.4 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 70.8 | 6 / 35 | 2582 |
| 2 | 3 | 56.0 | 63.2 | 4 / 35 | 2498 |
| 3 | 4 | 56.6 | 66.0 | 5 / 35 | 2260 |
| 4 | 2 | 60.7 | 75.6 | 8 / 35 | 2689 |
| 5 | 2 | 60.6 | 76.5 | 7 / 35 | 2766 |
| 6 | 2 | 58.2 | 70.5 | 3 / 35 | 2602 |
| 7 | 5 | 56.1 | 61.6 | 4 / 35 | 2696 |
| 8 | 2 | 60.2 | 75.6 | 9 / 35 | 2384 |
| 9 | 3 | 57.2 | 68.3 | 8 / 35 | 2295 |
| 10 | 3 | 57.6 | 66.7 | 7 / 35 | 2453 |
| 11 | 4 | 55.2 | 63.2 | 3 / 35 | 2268 |
| 12 | 2 | 59.2 | 71.4 | 7 / 35 | 2512 |
| 13 | 3 | 57.7 | 67.9 | 8 / 35 | 2384 |
| 14 | 5 | 57.0 | 65.4 | 5 / 35 | 2652 |
| 15 | 2 | 59.7 | 72.7 | 6 / 35 | 2727 |
| 16 | 3 | 59.4 | 70.2 | 8 / 35 | 2621 |
| 17 | 2 | 59.7 | 73.7 | 6 / 35 | 2628 |
| 18 | 6 | 53.7 | 57.5 | 4 / 35 | 2437 |
| 19 | 3 | 58.8 | 69.5 | 6 / 35 | 2670 |
| 20 | 2 | 62.2 | 78.1 | 10 / 35 | 2689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 136 | 53% |
| bts.mega.Gnarly 1.4 | 42 | 21% |
| bvh.mini.Freya 0.55 | 34 | 44% |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 19% |
| cs.Wren 1.0 | 20 | 30% |
| kdf.KoulDestroyer 1.0 | 16 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 40% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 576 of 700 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 156 | 27% | 234 |
| bvh.mini.Freya 0.55 | 96 | 17% | 104 |
| bts.mega.Gnarly 1.4 | 89 | 15% | 101 |
| davidalves.net.DuelistNanoMelee 1.01 | 80 | 14% | 88 |
| cs.Wren 1.0 | 66 | 11% | 73 |
| kdf.KoulDestroyer 1.0 | 55 | 10% | 59 |
| kawigi.spare.SpareParts 0.7.6nosnd | 14 | 2% | 17 |
| bzdp.BoxCar 2.0 | 12 | 2% | 12 |
| matt.UnderDark3 2.4.34 | 8 | 1% | 10 |

## Melee bench: F39

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 71.6 | 107 / 700 | 3.28 | 14.0% | 53077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 17.9% | 181 |
| az.Ololobot 0.2.4 | 1.9 | 15.9% | 290 |
| hadur117.nano.SanaroB480 0.3 | 2.9 | 14.0% | 107 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.5% | 85 |
| apollokidd.ApolloKidd 0.9 | 5.6 | 9.8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.9 | 9.5% | 18 |
| gimp.GimpBot 0.1 | 6.4 | 9.1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.1 | 6.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.0 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 68.9 | 6 / 35 | 2808 |
| 2 | 3 | 58.5 | 71.8 | 4 / 35 | 2910 |
| 3 | 2 | 60.0 | 74.3 | 8 / 35 | 2940 |
| 4 | 3 | 57.6 | 69.6 | 6 / 35 | 2551 |
| 5 | 3 | 58.8 | 72.9 | 6 / 35 | 2769 |
| 6 | 3 | 57.1 | 68.6 | 6 / 35 | 2624 |
| 7 | 3 | 58.6 | 74.3 | 9 / 35 | 2366 |
| 8 | 2 | 58.8 | 73.6 | 5 / 35 | 2927 |
| 9 | 3 | 55.7 | 64.3 | 6 / 35 | 2633 |
| 10 | 3 | 56.7 | 69.3 | 3 / 35 | 2604 |
| 11 | 3 | 57.8 | 69.6 | 8 / 35 | 2597 |
| 12 | 3 | 58.3 | 73.2 | 1 / 35 | 2872 |
| 13 | 3 | 57.1 | 68.2 | 4 / 35 | 2785 |
| 14 | 3 | 59.3 | 75.0 | 6 / 35 | 2680 |
| 15 | 2 | 59.8 | 75.4 | 5 / 35 | 2947 |
| 16 | 3 | 56.9 | 69.3 | 2 / 35 | 2492 |
| 17 | 3 | 58.5 | 72.9 | 5 / 35 | 2513 |
| 18 | 4 | 57.1 | 69.3 | 4 / 35 | 2485 |
| 19 | 3 | 59.0 | 76.4 | 8 / 35 | 2178 |
| 20 | 3 | 58.2 | 74.3 | 5 / 35 | 2396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 156 | 10% |
| bvh.fry.Freya 0.82 | 112 | 33% |
| stelo.SoRobotNanoMelee 1.2 | 49 | 47% |
| gimp.GimpBot 0.1 | 20 | 80% |
| winamp32.micro.MicroMacro 1.0 | 17 | 71% |
| apollokidd.ApolloKidd 0.9 | 5 | 40% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 595 of 700 rounds, at a mean tick of 1390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 210 | 35% | 244 |
| az.Ololobot 0.2.4 | 167 | 28% | 187 |
| stelo.SoRobotNanoMelee 1.2 | 97 | 16% | 108 |
| apollokidd.ApolloKidd 0.9 | 65 | 11% | 69 |
| winamp32.micro.MicroMacro 1.0 | 23 | 4% | 39 |
| gimp.GimpBot 0.1 | 15 | 3% | 28 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 2% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 1% | 12 |

## Melee bench: F41

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 74.0 | 223 / 700 | 3.34 | 13.8% | 51620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 278 |
| hadur117.nano.SanaroB480 0.3 | 2.7 | 13.8% | 223 |
| ary.Swarm 1.1 | 2.9 | 13.5% | 50 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.9% | 74 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.5% | 49 |
| shrub.Silver v048 | 6.2 | 8.8% | 11 |
| zyx.nano.Ant 1.1 | 6.8 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 9 |
| stelo.Mirror 1.1 | 8.6 | 6.0% | 4 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 82.2 | 11 / 35 | 2721 |
| 2 | 2 | 63.2 | 79.7 | 14 / 35 | 2609 |
| 3 | 2 | 61.5 | 74.6 | 13 / 35 | 2555 |
| 4 | 2 | 64.2 | 81.3 | 14 / 35 | 2745 |
| 5 | 4 | 60.8 | 72.7 | 11 / 35 | 2689 |
| 6 | 2 | 63.1 | 80.6 | 16 / 35 | 2400 |
| 7 | 3 | 61.2 | 72.4 | 13 / 35 | 2604 |
| 8 | 2 | 61.7 | 75.2 | 12 / 35 | 2632 |
| 9 | 4 | 58.3 | 67.3 | 8 / 35 | 2428 |
| 10 | 2 | 60.9 | 73.7 | 11 / 35 | 2619 |
| 11 | 2 | 61.4 | 73.7 | 12 / 35 | 2572 |
| 12 | 3 | 60.3 | 72.1 | 7 / 35 | 2594 |
| 13 | 2 | 62.5 | 76.5 | 14 / 35 | 2690 |
| 14 | 3 | 60.9 | 74.3 | 7 / 35 | 2944 |
| 15 | 3 | 59.3 | 68.6 | 10 / 35 | 2494 |
| 16 | 4 | 59.3 | 70.5 | 10 / 35 | 2216 |
| 17 | 3 | 59.1 | 69.8 | 10 / 35 | 2303 |
| 18 | 4 | 56.8 | 65.1 | 4 / 35 | 2473 |
| 19 | 2 | 62.7 | 75.9 | 13 / 35 | 2830 |
| 20 | 2 | 61.2 | 74.3 | 13 / 35 | 2502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 205 | 54% |
| lessonz.robocode.Oz 0.5.0 | 56 | 77% |
| ary.Swarm 1.1 | 47 | 85% |
| simonton.nano.MeleeSeed 1.8 | 28 | 64% |
| shrub.Silver v048 | 8 | 25% |
| jsal.Jsalbot 1.0 | 7 | 71% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 477 of 700 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 167 | 35% | 275 |
| ary.Swarm 1.1 | 104 | 22% | 147 |
| lessonz.robocode.Oz 0.5.0 | 60 | 13% | 89 |
| simonton.nano.MeleeSeed 1.8 | 58 | 12% | 83 |
| zyx.nano.Ant 1.1 | 35 | 7% | 38 |
| shrub.Silver v048 | 29 | 6% | 32 |
| stelo.Mirror 1.1 | 12 | 3% | 17 |
| jsal.Jsalbot 1.0 | 7 | 1% | 13 |
| acogdev.alpha 0.2 | 5 | 1% | 6 |

## Melee bench: F42

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.3 | 198 / 700 | 3.14 | 14.2% | 61794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 308 |
| hadur117.nano.SanaroB480 0.3 | 3.0 | 14.2% | 198 |
| ara.Shera 0.88 | 3.0 | 14.3% | 98 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 14.0% | 63 |
| amz.NanoClone 1.41 | 5.3 | 9.3% | 11 |
| maribo.IotaCT 1.1 | 6.3 | 7.5% | 4 |
| dsw.StaticD 1.0 | 6.8 | 7.2% | 16 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.7% | 1 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 75.2 | 8 / 35 | 2891 |
| 2 | 3 | 62.8 | 80.0 | 9 / 35 | 3131 |
| 3 | 3 | 60.7 | 70.8 | 10 / 35 | 3399 |
| 4 | 4 | 60.9 | 73.0 | 5 / 35 | 3297 |
| 5 | 2 | 63.6 | 79.7 | 14 / 35 | 3353 |
| 6 | 3 | 61.9 | 76.5 | 7 / 35 | 3202 |
| 7 | 4 | 61.3 | 77.1 | 7 / 35 | 2874 |
| 8 | 3 | 61.4 | 75.2 | 8 / 35 | 3177 |
| 9 | 4 | 60.1 | 71.1 | 9 / 35 | 3178 |
| 10 | 4 | 59.4 | 70.2 | 6 / 35 | 2951 |
| 11 | 2 | 62.7 | 78.7 | 13 / 35 | 3024 |
| 12 | 2 | 63.5 | 80.0 | 13 / 35 | 3367 |
| 13 | 4 | 62.7 | 77.1 | 11 / 35 | 3313 |
| 14 | 2 | 62.9 | 81.9 | 10 / 35 | 2981 |
| 15 | 3 | 60.9 | 77.5 | 11 / 35 | 2621 |
| 16 | 3 | 61.4 | 74.0 | 12 / 35 | 2979 |
| 17 | 3 | 62.7 | 78.4 | 11 / 35 | 3254 |
| 18 | 2 | 61.8 | 76.8 | 11 / 35 | 2936 |
| 19 | 3 | 62.1 | 78.4 | 10 / 35 | 2896 |
| 20 | 3 | 61.0 | 73.3 | 13 / 35 | 2970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 177 | 41% |
| ara.Shera 0.88 | 98 | 62% |
| maribo.mini.MiniQuester 0.1 | 63 | 79% |
| maribo.IotaCT 1.1 | 6 | 67% |
| dsw.StaticD 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 50% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 502 of 700 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 202 | 40% | 271 |
| ara.Shera 0.88 | 128 | 25% | 192 |
| maribo.mini.MiniQuester 0.1 | 92 | 18% | 143 |
| amz.NanoClone 1.41 | 36 | 7% | 37 |
| maribo.IotaCT 1.1 | 15 | 3% | 19 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9 | 2% | 11 |
| dsw.StaticD 1.0 | 8 | 2% | 14 |
| mme.NikeEnhanced 2.0 | 7 | 1% | 7 |
| stelo.MirrorMicro 1.0 | 5 | 1% | 6 |

## Melee bench: F43

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 64.2 | 60 / 700 | 4.22 | 11.5% | 47820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 541 |
| brainfade.melee.Dusk 0.44 | 2.3 | 13.1% | 59 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.2% | 17 |
| hadur117.nano.SanaroB480 0.3 | 4.0 | 11.5% | 60 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.4% | 10 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.1% | 11 |
| mz.NanoGod 2.02 | 7.4 | 7.6% | 2 |
| jab.DiamondStealer 5 | 7.6 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 61.6 | 2 / 35 | 1960 |
| 2 | 5 | 54.6 | 56.5 | 1 / 35 | 2296 |
| 3 | 4 | 60.3 | 67.3 | 4 / 35 | 2713 |
| 4 | 5 | 57.1 | 60.6 | 1 / 35 | 2551 |
| 5 | 4 | 59.7 | 68.6 | 2 / 35 | 2531 |
| 6 | 3 | 58.0 | 63.5 | 4 / 35 | 2356 |
| 7 | 4 | 56.7 | 61.9 | 1 / 35 | 2278 |
| 8 | 4 | 58.3 | 64.1 | 4 / 35 | 2371 |
| 9 | 2 | 62.0 | 74.0 | 6 / 35 | 2719 |
| 10 | 3 | 59.5 | 68.3 | 6 / 35 | 2354 |
| 11 | 5 | 55.0 | 56.2 | 0 / 35 | 2386 |
| 12 | 5 | 55.1 | 57.1 | 1 / 35 | 2253 |
| 13 | 4 | 56.9 | 62.2 | 1 / 35 | 2365 |
| 14 | 4 | 58.1 | 64.1 | 2 / 35 | 2284 |
| 15 | 4 | 59.5 | 65.7 | 6 / 35 | 2404 |
| 16 | 5 | 57.9 | 63.2 | 3 / 35 | 2529 |
| 17 | 4 | 56.9 | 60.6 | 3 / 35 | 2309 |
| 18 | 3 | 60.1 | 68.6 | 4 / 35 | 2696 |
| 19 | 3 | 60.1 | 69.8 | 4 / 35 | 2281 |
| 20 | 3 | 59.9 | 70.8 | 5 / 35 | 2184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 151 | 19% |
| brainfade.melee.Dusk 0.44 | 31 | 68% |
| dummy.micro.Sparrow 2.5 | 8 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 4 | 50% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 640 of 700 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 319 | 50% | 350 |
| dummy.micro.Sparrow 2.5 | 84 | 13% | 88 |
| brainfade.melee.Dusk 0.44 | 83 | 13% | 103 |
| wcsv.melee.EngineerMelee 0.1 | 57 | 9% | 59 |
| Krabb.akim2.Akim2 1.1b | 39 | 6% | 41 |
| mz.NanoGod 2.02 | 37 | 6% | 38 |
| jab.DiamondStealer 5 | 18 | 3% | 18 |
| cvt.Firsty 1.0 | 3 | 0% | 3 |

## Melee bench: F44

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.9 | 208 / 700 | 3.17 | 14.5% | 61658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.8% | 252 |
| tzu.TheArtOfWar 1.2 | 2.2 | 15.2% | 162 |
| hadur117.nano.SanaroB480 0.3 | 2.6 | 14.5% | 208 |
| wompi.Quokka 1.6 | 4.5 | 10.7% | 19 |
| jwirde.Gort 2.0 | 4.8 | 10.2% | 43 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.3% | 7 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 6 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.8% | 2 |
| sample.Crazy 1.0 | 9.4 | 4.7% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 71.7 | 6 / 35 | 2908 |
| 2 | 2 | 61.9 | 76.2 | 13 / 35 | 3033 |
| 3 | 1 | 63.0 | 80.3 | 11 / 35 | 3172 |
| 4 | 2 | 63.4 | 79.7 | 11 / 35 | 3177 |
| 5 | 3 | 62.3 | 75.2 | 14 / 35 | 2998 |
| 6 | 3 | 61.4 | 74.0 | 10 / 35 | 3124 |
| 7 | 3 | 59.8 | 69.2 | 9 / 35 | 2999 |
| 8 | 3 | 61.5 | 76.5 | 7 / 35 | 2831 |
| 9 | 3 | 61.8 | 73.3 | 8 / 35 | 3275 |
| 10 | 2 | 61.8 | 74.6 | 11 / 35 | 3193 |
| 11 | 3 | 63.1 | 78.7 | 13 / 35 | 3081 |
| 12 | 2 | 64.5 | 82.2 | 15 / 35 | 3283 |
| 13 | 3 | 60.8 | 72.7 | 5 / 35 | 3156 |
| 14 | 2 | 61.8 | 75.6 | 10 / 35 | 3032 |
| 15 | 2 | 63.6 | 79.4 | 13 / 35 | 3316 |
| 16 | 3 | 61.4 | 74.3 | 12 / 35 | 2852 |
| 17 | 3 | 64.9 | 83.8 | 14 / 35 | 3209 |
| 18 | 2 | 63.7 | 80.3 | 11 / 35 | 3235 |
| 19 | 3 | 59.2 | 69.5 | 6 / 35 | 2652 |
| 20 | 3 | 61.2 | 71.4 | 9 / 35 | 3132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 175 | 60% |
| tzu.TheArtOfWar 1.2 | 110 | 31% |
| jwirde.Gort 2.0 | 33 | 55% |
| wompi.Quokka 1.6 | 31 | 77% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 85% |
| disan.Chair 2.2.0 | 8 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 494 of 700 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 171 | 35% | 208 |
| stelo.Liblix 0.3.1 | 165 | 33% | 283 |
| jwirde.Gort 2.0 | 50 | 10% | 74 |
| wompi.Quokka 1.6 | 39 | 8% | 51 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 34 | 7% | 38 |
| stf.PanzerGeneral 0.1 | 13 | 3% | 15 |
| disan.Chair 2.2.0 | 11 | 2% | 13 |
| amk.jointstrike.JointStrike 0.2 | 7 | 1% | 10 |
| sample.Crazy 1.0 | 3 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.4 | 183 / 700 | 3.12 | 15.1% | 67745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.1 | 15.1% | 183 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.3% | 355 |
| jje.BagPuss 1.2 | 3.0 | 12.6% | 36 |
| sul.Lunar 1.1 | 4.4 | 11.0% | 62 |
| myl.nano.Graviton 1.10 | 4.7 | 10.7% | 19 |
| hvilela.HVilela 0.9 | 6.5 | 8.9% | 2 |
| fm.claire 1.7 | 7.1 | 8.4% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 8.4% | 6 |
| wit.Deep7 2.0 | 8.8 | 6.8% | 32 |
| abud.ThirdRobo 1.0 | 9.9 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 85.4 | 11 / 35 | 3498 |
| 2 | 1 | 63.6 | 78.4 | 13 / 35 | 3524 |
| 3 | 1 | 62.0 | 75.9 | 8 / 35 | 3506 |
| 4 | 1 | 62.3 | 78.7 | 8 / 35 | 3375 |
| 5 | 1 | 62.8 | 78.7 | 9 / 35 | 3517 |
| 6 | 1 | 61.3 | 73.3 | 8 / 35 | 3300 |
| 7 | 1 | 61.4 | 74.6 | 9 / 35 | 3269 |
| 8 | 1 | 60.5 | 73.3 | 9 / 35 | 2903 |
| 9 | 3 | 55.9 | 62.5 | 3 / 35 | 2843 |
| 10 | 1 | 63.3 | 76.8 | 8 / 35 | 3822 |
| 11 | 1 | 61.6 | 73.0 | 11 / 35 | 3433 |
| 12 | 1 | 60.0 | 70.5 | 7 / 35 | 3223 |
| 13 | 1 | 64.3 | 82.2 | 14 / 35 | 3274 |
| 14 | 1 | 64.2 | 82.2 | 9 / 35 | 3692 |
| 15 | 1 | 60.5 | 71.4 | 7 / 35 | 3326 |
| 16 | 1 | 64.5 | 84.8 | 10 / 35 | 3368 |
| 17 | 1 | 64.5 | 82.2 | 10 / 35 | 3845 |
| 18 | 1 | 62.7 | 75.6 | 11 / 35 | 3543 |
| 19 | 1 | 62.2 | 76.2 | 11 / 35 | 3056 |
| 20 | 1 | 61.1 | 72.1 | 7 / 35 | 3428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 252 | 39% |
| jje.BagPuss 1.2 | 39 | 67% |
| sul.Lunar 1.1 | 38 | 21% |
| wit.Deep7 2.0 | 23 | 48% |
| pez.mini.ChironexFleckeri 0.5 | 21 | 90% |
| myl.nano.Graviton 1.10 | 12 | 75% |
| fm.claire 1.7 | 9 | 78% |
| abud.ThirdRobo 1.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 517 of 700 rounds, at a mean tick of 1518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 174 | 34% | 0 |
| jje.BagPuss 1.2 | 89 | 17% | 216 |
| sul.Lunar 1.1 | 83 | 16% | 160 |
| myl.nano.Graviton 1.10 | 59 | 11% | 109 |
| fm.claire 1.7 | 30 | 6% | 45 |
| hvilela.HVilela 0.9 | 28 | 5% | 49 |
| wit.Deep7 2.0 | 27 | 5% | 62 |
| pez.mini.ChironexFleckeri 0.5 | 22 | 4% | 45 |
| abud.ThirdRobo 1.0 | 5 | 1% | 11 |

## Melee bench: F46

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 76.9 | 160 / 700 | 2.85 | 15.1% | 52520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.6% | 403 |
| hadur117.nano.SanaroB480 0.3 | 2.3 | 15.1% | 160 |
| mz.MicroSheep 1.0 | 3.4 | 13.1% | 46 |
| cx.Princess 1.0 | 3.4 | 13.3% | 85 |
| sadoner.killer 0.2 | 5.2 | 10.2% | 2 |
| arthord.NanoSatanMelee Beta | 5.9 | 8.8% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.1 | 7.3% | 1 |
| kurios.DOSexe .9a | 8.1 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 78.2 | 9 / 35 | 2360 |
| 2 | 2 | 59.1 | 72.1 | 6 / 35 | 2374 |
| 3 | 2 | 62.6 | 82.1 | 7 / 35 | 3082 |
| 4 | 3 | 57.1 | 66.4 | 4 / 35 | 2450 |
| 5 | 2 | 61.6 | 81.4 | 4 / 35 | 2431 |
| 6 | 2 | 62.3 | 76.8 | 11 / 35 | 3099 |
| 7 | 2 | 62.7 | 82.9 | 8 / 35 | 2664 |
| 8 | 2 | 62.7 | 80.4 | 13 / 35 | 2623 |
| 9 | 2 | 63.7 | 83.6 | 14 / 35 | 2793 |
| 10 | 2 | 61.1 | 77.5 | 8 / 35 | 2775 |
| 11 | 2 | 61.7 | 78.6 | 9 / 35 | 2803 |
| 12 | 2 | 61.5 | 81.1 | 7 / 35 | 2569 |
| 13 | 4 | 57.6 | 67.9 | 6 / 35 | 2464 |
| 14 | 2 | 61.4 | 79.6 | 8 / 35 | 2348 |
| 15 | 2 | 63.0 | 82.5 | 7 / 35 | 2899 |
| 16 | 3 | 59.5 | 74.3 | 6 / 35 | 2320 |
| 17 | 2 | 59.4 | 69.6 | 8 / 35 | 2623 |
| 18 | 2 | 61.6 | 77.5 | 11 / 35 | 2666 |
| 19 | 2 | 60.4 | 74.3 | 9 / 35 | 2491 |
| 20 | 3 | 58.4 | 71.4 | 5 / 35 | 2686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 297 | 37% |
| cx.Princess 1.0 | 58 | 57% |
| mz.MicroSheep 1.0 | 33 | 27% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 50% |
| sadoner.killer 0.2 | 2 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 541 of 700 rounds, at a mean tick of 1095. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 328 | 61% | 443 |
| mz.MicroSheep 1.0 | 62 | 11% | 72 |
| cx.Princess 1.0 | 57 | 11% | 84 |
| sadoner.killer 0.2 | 38 | 7% | 41 |
| arthord.NanoSatanMelee Beta | 27 | 5% | 28 |
| jeremyreeder.collective.Prophet 5 | 15 | 3% | 16 |
| kurios.DOSexe .9a | 8 | 1% | 9 |
| mbro.Detektor3 0.1.1 | 5 | 1% | 6 |
1 death(s) with no robot to name.

