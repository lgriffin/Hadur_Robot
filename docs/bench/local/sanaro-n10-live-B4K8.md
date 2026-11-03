# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 77.5 | 133 / 700 | 3.02 | 13.6% | 56657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 455 |
| hadur117.nano.SanaroB4K8 0.3 | 2.1 | 13.6% | 133 |
| sgp.JollyNinja 3.53 | 3.7 | 12.0% | 65 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.6% | 22 |
| mz.MicroGodMelee 1 | 4.5 | 11.2% | 14 |
| lorneswork.Predator 1.0 | 5.9 | 9.7% | 11 |
| adt.Ar2 1.0 | 7.1 | 7.5% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 76.2 | 6 / 35 | 2745 |
| 2 | 2 | 60.5 | 78.1 | 4 / 35 | 2539 |
| 3 | 2 | 59.7 | 75.2 | 8 / 35 | 2305 |
| 4 | 2 | 62.9 | 81.3 | 10 / 35 | 2868 |
| 5 | 2 | 60.7 | 71.7 | 5 / 35 | 3861 |
| 6 | 2 | 61.2 | 79.0 | 9 / 35 | 2469 |
| 7 | 2 | 63.6 | 84.4 | 7 / 35 | 2993 |
| 8 | 2 | 60.7 | 75.2 | 6 / 35 | 2822 |
| 9 | 2 | 64.1 | 86.7 | 10 / 35 | 2870 |
| 10 | 2 | 61.3 | 78.1 | 6 / 35 | 2932 |
| 11 | 3 | 59.0 | 73.3 | 3 / 35 | 2394 |
| 12 | 2 | 60.4 | 74.9 | 8 / 35 | 2709 |
| 13 | 2 | 59.4 | 70.8 | 4 / 35 | 3170 |
| 14 | 2 | 62.0 | 80.0 | 7 / 35 | 2913 |
| 15 | 2 | 60.2 | 75.2 | 7 / 35 | 2547 |
| 16 | 2 | 62.0 | 78.4 | 11 / 35 | 2815 |
| 17 | 2 | 62.4 | 80.6 | 10 / 35 | 2646 |
| 18 | 2 | 60.8 | 76.5 | 5 / 35 | 2924 |
| 19 | 2 | 60.8 | 74.6 | 3 / 35 | 3461 |
| 20 | 2 | 61.2 | 80.3 | 4 / 35 | 2674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 325 | 16% |
| sgp.JollyNinja 3.53 | 47 | 57% |
| mz.MicroGodMelee 1 | 36 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| lorneswork.Predator 1.0 | 7 | 29% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 2 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 569 of 700 rounds, at a mean tick of 1060. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 329 | 58% | 381 |
| simonton.nano.WeekendObsession_Melee 1.0 | 65 | 11% | 78 |
| sgp.JollyNinja 3.53 | 62 | 11% | 82 |
| lorneswork.Predator 1.0 | 49 | 9% | 54 |
| mz.MicroGodMelee 1 | 34 | 6% | 69 |
| adt.Ar2 1.0 | 16 | 3% | 20 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 1% | 6 |
| skm.butterfly 1.0 | 5 | 1% | 5 |
| mym.EdgeStalker 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 73.2 | 192 / 700 | 3.41 | 14.0% | 61628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.9% | 185 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.5% | 147 |
| hadur117.nano.SanaroB4K8 0.3 | 2.5 | 14.0% | 192 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.3% | 13 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.1% | 34 |
| sch.Simone 0.3d | 6.6 | 8.6% | 52 |
| Noran.BitchingElk 0.054 | 6.9 | 8.0% | 46 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.8% | 10 |
| stelo.PatternRobot 1.0 | 8.8 | 6.3% | 15 |
| fullsail.SweetTea 1.1 | 9.9 | 4.6% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 77.5 | 7 / 35 | 2801 |
| 2 | 3 | 60.5 | 70.5 | 10 / 35 | 3296 |
| 3 | 3 | 60.7 | 71.7 | 10 / 35 | 3137 |
| 4 | 3 | 61.2 | 75.9 | 9 / 35 | 2954 |
| 5 | 2 | 62.0 | 75.9 | 12 / 35 | 3166 |
| 6 | 3 | 59.4 | 69.5 | 10 / 35 | 2909 |
| 7 | 2 | 60.0 | 72.4 | 7 / 35 | 3223 |
| 8 | 1 | 62.8 | 80.6 | 13 / 35 | 2936 |
| 9 | 3 | 59.3 | 68.3 | 7 / 35 | 3460 |
| 10 | 1 | 65.4 | 84.4 | 16 / 35 | 3342 |
| 11 | 4 | 55.6 | 59.0 | 5 / 35 | 3059 |
| 12 | 3 | 58.9 | 69.8 | 7 / 35 | 2870 |
| 13 | 1 | 61.4 | 75.6 | 14 / 35 | 2855 |
| 14 | 3 | 57.9 | 69.2 | 7 / 35 | 2716 |
| 15 | 2 | 61.2 | 73.7 | 11 / 35 | 3259 |
| 16 | 2 | 59.8 | 71.7 | 7 / 35 | 3057 |
| 17 | 3 | 60.5 | 73.3 | 7 / 35 | 2919 |
| 18 | 1 | 62.7 | 78.7 | 13 / 35 | 3214 |
| 19 | 3 | 61.0 | 73.3 | 11 / 35 | 3125 |
| 20 | 3 | 60.9 | 73.3 | 9 / 35 | 3330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 116 | 55% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 107 | 31% |
| Noran.BitchingElk 0.054 | 37 | 57% |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 90% |
| sch.Simone 0.3d | 30 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 80% |
| fullsail.SweetTea 1.1 | 9 | 78% |
| fnc.bandit.Bandit 5.2.0 | 8 | 88% |
| stelo.PatternRobot 1.0 | 6 | 50% |

Hadur died in 510 of 700 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 136 | 27% | 181 |
| pulsar.PulsarMax 0.8.9 | 130 | 25% | 176 |
| lrem.micro.SpikeSoldier 0.4 | 60 | 12% | 68 |
| sch.Simone 0.3d | 52 | 10% | 71 |
| stelo.PatternRobot 1.0 | 39 | 8% | 43 |
| Noran.BitchingElk 0.054 | 28 | 5% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 5% | 59 |
| fullsail.SweetTea 1.1 | 22 | 4% | 31 |
| fnc.bandit.Bandit 5.2.0 | 16 | 3% | 23 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 79.9 | 188 / 700 | 2.81 | 14.3% | 62471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 15.0% | 164 |
| kawigi.nano.Lib 1.0 | 2.0 | 15.1% | 179 |
| hadur117.nano.SanaroB4K8 0.3 | 2.5 | 14.3% | 188 |
| vuen.Cake 2.51 | 3.7 | 13.4% | 136 |
| urdos.URDOS 1.3 | 5.0 | 10.4% | 26 |
| adt.Ar1 2.1 | 6.3 | 7.9% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.1% | 2 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 75.2 | 9 / 35 | 2869 |
| 2 | 2 | 61.2 | 76.2 | 8 / 35 | 3544 |
| 3 | 3 | 62.2 | 82.2 | 10 / 35 | 2986 |
| 4 | 4 | 59.3 | 71.4 | 5 / 35 | 3181 |
| 5 | 2 | 62.6 | 82.2 | 13 / 35 | 3135 |
| 6 | 2 | 63.4 | 81.3 | 7 / 35 | 3632 |
| 7 | 2 | 62.1 | 81.3 | 10 / 35 | 3038 |
| 8 | 3 | 61.0 | 79.0 | 5 / 35 | 2956 |
| 9 | 2 | 63.0 | 82.5 | 10 / 35 | 3481 |
| 10 | 1 | 62.3 | 80.0 | 12 / 35 | 3432 |
| 11 | 3 | 62.1 | 80.6 | 10 / 35 | 3099 |
| 12 | 2 | 61.8 | 80.0 | 9 / 35 | 3242 |
| 13 | 3 | 61.7 | 81.3 | 8 / 35 | 2974 |
| 14 | 3 | 62.6 | 82.9 | 14 / 35 | 2836 |
| 15 | 2 | 62.2 | 84.4 | 9 / 35 | 2901 |
| 16 | 2 | 61.8 | 80.0 | 13 / 35 | 3015 |
| 17 | 2 | 61.9 | 82.2 | 11 / 35 | 2863 |
| 18 | 4 | 58.8 | 73.0 | 4 / 35 | 2999 |
| 19 | 2 | 62.2 | 80.3 | 12 / 35 | 3245 |
| 20 | 2 | 62.1 | 82.5 | 9 / 35 | 3043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 137 | 48% |
| vuen.Cake 2.51 | 130 | 52% |
| kawigi.nano.Lib 1.0 | 110 | 19% |
| urdos.URDOS 1.3 | 33 | 61% |
| oa.weak.FlyMk1 0.1 | 7 | 86% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |

Hadur died in 515 of 700 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 170 | 33% | 197 |
| radnor.DoctorBob 1.42 | 146 | 28% | 206 |
| vuen.Cake 2.51 | 96 | 19% | 165 |
| urdos.URDOS 1.3 | 48 | 9% | 64 |
| adt.Ar1 2.1 | 20 | 4% | 24 |
| ghent.ArthurPanzergon 1.0.0 | 15 | 3% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 2% | 10 |
| oa.weak.FlyMk1 0.1 | 8 | 2% | 12 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 77.0 | 35 / 700 | 3.07 | 13.7% | 67969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.8% | 634 |
| hadur117.nano.SanaroB4K8 0.3 | 2.5 | 13.7% | 35 |
| apc.LeeroyJenkins2 1.0 | 2.6 | 13.7% | 19 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 7 |
| josago.Jorgito 0.16 | 4.9 | 9.3% | 4 |
| tj.zombie1n 1.0.1 | 6.5 | 7.2% | 0 |
| css.Delitioner 0.11 | 6.6 | 7.1% | 1 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 79.4 | 2 / 35 | 3007 |
| 2 | 3 | 62.6 | 77.1 | 4 / 35 | 3490 |
| 3 | 2 | 62.3 | 78.1 | 1 / 35 | 3343 |
| 4 | 2 | 63.3 | 81.0 | 1 / 35 | 3419 |
| 5 | 3 | 61.2 | 73.3 | 2 / 35 | 3329 |
| 6 | 3 | 61.4 | 74.3 | 2 / 35 | 3269 |
| 7 | 2 | 61.5 | 76.8 | 1 / 35 | 3139 |
| 8 | 2 | 62.4 | 78.1 | 1 / 35 | 3582 |
| 9 | 2 | 62.1 | 76.8 | 3 / 35 | 3171 |
| 10 | 3 | 62.1 | 76.8 | 1 / 35 | 3485 |
| 11 | 2 | 62.6 | 78.7 | 1 / 35 | 3512 |
| 12 | 2 | 63.4 | 78.7 | 3 / 35 | 3802 |
| 13 | 2 | 63.6 | 82.9 | 3 / 35 | 3414 |
| 14 | 2 | 63.2 | 79.7 | 1 / 35 | 3459 |
| 15 | 3 | 60.4 | 69.2 | 0 / 35 | 3659 |
| 16 | 3 | 62.4 | 77.5 | 3 / 35 | 3375 |
| 17 | 3 | 61.1 | 73.3 | 1 / 35 | 3519 |
| 18 | 3 | 59.3 | 69.5 | 0 / 35 | 3060 |
| 19 | 2 | 62.0 | 75.9 | 1 / 35 | 3463 |
| 20 | 2 | 64.4 | 83.5 | 4 / 35 | 3472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 390 | 4% |
| apc.LeeroyJenkins2 1.0 | 15 | 67% |
| TNT.TNT 0.99.1 | 5 | 80% |
| josago.Jorgito 0.16 | 3 | 67% |
| css.Delitioner 0.11 | 2 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 665 of 700 rounds, at a mean tick of 1519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 484 | 73% | 501 |
| apc.LeeroyJenkins2 1.0 | 85 | 13% | 94 |
| josago.Jorgito 0.16 | 43 | 6% | 45 |
| TNT.TNT 0.99.1 | 23 | 3% | 28 |
| tj.zombie1n 1.0.1 | 14 | 2% | 14 |
| css.Delitioner 0.11 | 11 | 2% | 13 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 76.2 | 251 / 700 | 3.15 | 14.3% | 55861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.8 | 15.0% | 130 |
| origin.SleepSiphon 1.7b | 2.2 | 14.4% | 163 |
| hadur117.nano.SanaroB4K8 0.3 | 2.4 | 14.3% | 251 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.9% | 100 |
| mld.Wisdom 1.0 | 4.9 | 11.1% | 18 |
| gg.Wolverine 2.0 | 6.2 | 8.6% | 15 |
| spinnercat.Omen 1.0 | 7.5 | 7.3% | 10 |
| DBall.NUKE 0.1 | 7.9 | 7.0% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.4% | 10 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 74.3 | 9 / 35 | 2768 |
| 2 | 3 | 60.7 | 73.7 | 10 / 35 | 2805 |
| 3 | 3 | 60.3 | 72.7 | 13 / 35 | 2617 |
| 4 | 1 | 64.5 | 83.2 | 17 / 35 | 3124 |
| 5 | 1 | 64.5 | 82.5 | 16 / 35 | 3146 |
| 6 | 2 | 60.5 | 71.4 | 12 / 35 | 3023 |
| 7 | 1 | 64.0 | 82.9 | 15 / 35 | 2930 |
| 8 | 4 | 58.9 | 67.6 | 9 / 35 | 2823 |
| 9 | 1 | 62.3 | 77.8 | 14 / 35 | 2934 |
| 10 | 1 | 63.9 | 81.0 | 18 / 35 | 2907 |
| 11 | 1 | 63.5 | 83.5 | 15 / 35 | 2638 |
| 12 | 2 | 63.4 | 79.7 | 15 / 35 | 3051 |
| 13 | 3 | 58.4 | 68.9 | 10 / 35 | 2354 |
| 14 | 3 | 59.7 | 70.5 | 9 / 35 | 2940 |
| 15 | 4 | 60.2 | 74.0 | 7 / 35 | 2505 |
| 16 | 2 | 63.4 | 81.3 | 17 / 35 | 2452 |
| 17 | 3 | 61.6 | 75.2 | 13 / 35 | 2769 |
| 18 | 2 | 61.3 | 76.2 | 13 / 35 | 2752 |
| 19 | 3 | 61.3 | 75.9 | 11 / 35 | 2602 |
| 20 | 4 | 59.6 | 71.1 | 8 / 35 | 2721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 114 | 65% |
| jekl.StoneGhost 0.7 | 109 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 71 | 61% |
| gg.Wolverine 2.0 | 24 | 88% |
| DBall.NUKE 0.1 | 16 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 75% |
| mld.Wisdom 1.0 | 11 | 91% |
| spinnercat.Omen 1.0 | 7 | 71% |

Hadur died in 452 of 700 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 131 | 29% | 186 |
| origin.SleepSiphon 1.7b | 114 | 25% | 201 |
| pe.minimelee.SandboxMiniMelee 1.1 | 94 | 21% | 143 |
| mld.Wisdom 1.0 | 62 | 14% | 78 |
| gg.Wolverine 2.0 | 16 | 4% | 27 |
| spinnercat.Omen 1.0 | 12 | 3% | 18 |
| DBall.NUKE 0.1 | 10 | 2% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 2% | 19 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.1 | 327 / 700 | 1.95 | 18.5% | 70759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 22.1% | 190 |
| hadur117.nano.SanaroB4K8 0.3 | 2.0 | 18.5% | 327 |
| franzor.Lizt 1.3.1 | 3.4 | 13.7% | 120 |
| oog.melee.CapuletDroid 1.1 | 3.6 | 13.6% | 61 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 5.9 | 8.8% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.9% | 3 |
| drd.Dreadknoght 0.9 | 8.3 | 3.4% | 1 |
| sample.Target 1.0 | 8.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 88.6 | 16 / 35 | 3584 |
| 2 | 2 | 67.4 | 87.5 | 16 / 35 | 3504 |
| 3 | 2 | 67.6 | 87.1 | 16 / 35 | 3546 |
| 4 | 2 | 68.2 | 90.0 | 21 / 35 | 3493 |
| 5 | 2 | 66.1 | 84.3 | 14 / 35 | 3628 |
| 6 | 2 | 67.4 | 87.9 | 17 / 35 | 3613 |
| 7 | 2 | 67.5 | 88.6 | 18 / 35 | 3734 |
| 8 | 2 | 67.9 | 91.8 | 20 / 35 | 3252 |
| 9 | 2 | 65.9 | 87.9 | 15 / 35 | 2903 |
| 10 | 2 | 66.8 | 87.9 | 15 / 35 | 3561 |
| 11 | 2 | 67.3 | 91.1 | 14 / 35 | 3643 |
| 12 | 2 | 67.3 | 87.1 | 16 / 35 | 3645 |
| 13 | 2 | 64.8 | 81.4 | 11 / 35 | 3239 |
| 14 | 2 | 67.4 | 88.2 | 17 / 35 | 3740 |
| 15 | 2 | 68.5 | 91.1 | 19 / 35 | 3848 |
| 16 | 2 | 66.8 | 88.2 | 15 / 35 | 3504 |
| 17 | 2 | 66.9 | 88.9 | 16 / 35 | 3510 |
| 18 | 2 | 66.1 | 85.7 | 15 / 35 | 3402 |
| 19 | 2 | 68.7 | 91.8 | 20 / 35 | 3907 |
| 20 | 2 | 66.4 | 86.4 | 16 / 35 | 3503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 302 | 55% |
| oog.melee.CapuletDroid 1.1 | 119 | 75% |
| franzor.Lizt 1.3.1 | 110 | 61% |
| skm.PateranBotlock2 1.0 | 6 | 50% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 373 of 700 rounds, at a mean tick of 1775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 238 | 64% | 490 |
| oog.melee.CapuletDroid 1.1 | 71 | 19% | 167 |
| franzor.Lizt 1.3.1 | 47 | 13% | 1 |
| exauge.GateKeeper 1.1.121g | 7 | 2% | 15 |
| skm.PateranBotlock2 1.0 | 5 | 1% | 11 |
| lrem.micro.MoggFanatic 0.2 | 4 | 1% | 8 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F08

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 82.3 | 309 / 700 | 2.42 | 17.1% | 56487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB4K8 0.3 | 1.6 | 17.1% | 309 |
| shrub.Vapour v159 | 2.1 | 16.2% | 170 |
| tm.Yuugao 1.0 | 2.4 | 15.8% | 141 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.9% | 37 |
| m3thos.Eva00 1.1 | 5.3 | 9.5% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 5.4 | 9.4% | 25 |
| SHAM.WOW 1.4 | 7.8 | 7.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.9 | 7.0% | 4 |
| zyx.nano.BacillusComma 1.0 | 8.2 | 6.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 78.9 | 9 / 35 | 2802 |
| 2 | 1 | 66.5 | 88.6 | 24 / 35 | 2922 |
| 3 | 1 | 63.7 | 81.4 | 20 / 35 | 2935 |
| 4 | 1 | 63.3 | 81.8 | 17 / 35 | 2931 |
| 5 | 1 | 66.0 | 88.6 | 20 / 35 | 3003 |
| 6 | 2 | 62.7 | 81.4 | 12 / 35 | 2679 |
| 7 | 1 | 63.4 | 83.6 | 15 / 35 | 2747 |
| 8 | 3 | 59.5 | 73.2 | 8 / 35 | 2671 |
| 9 | 1 | 61.5 | 79.3 | 13 / 35 | 2759 |
| 10 | 1 | 64.5 | 87.5 | 19 / 35 | 2759 |
| 11 | 1 | 61.8 | 81.1 | 12 / 35 | 2650 |
| 12 | 1 | 63.9 | 84.6 | 17 / 35 | 3014 |
| 13 | 1 | 65.8 | 85.4 | 21 / 35 | 3341 |
| 14 | 1 | 65.8 | 90.0 | 19 / 35 | 2837 |
| 15 | 3 | 57.9 | 68.6 | 12 / 35 | 2463 |
| 16 | 3 | 61.5 | 78.6 | 9 / 35 | 2901 |
| 17 | 1 | 64.9 | 86.4 | 18 / 35 | 2992 |
| 18 | 3 | 62.5 | 82.9 | 11 / 35 | 2740 |
| 19 | 2 | 63.2 | 80.0 | 17 / 35 | 2849 |
| 20 | 2 | 63.4 | 83.2 | 16 / 35 | 2492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 204 | 71% |
| shrub.Vapour v159 | 139 | 44% |
| com.spp.robocode.MostlyHarmless 010 | 60 | 73% |
| jwst.DAD.DarkAndDarker 1.1 | 38 | 82% |
| m3thos.Eva00 1.1 | 22 | 59% |
| qualidafial.MajorDick 1.0.1 | 9 | 67% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 398 of 700 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 144 | 36% | 201 |
| tm.Yuugao 1.0 | 116 | 29% | 261 |
| com.spp.robocode.MostlyHarmless 010 | 46 | 12% | 85 |
| jwst.DAD.DarkAndDarker 1.1 | 29 | 7% | 59 |
| m3thos.Eva00 1.1 | 26 | 7% | 44 |
| zyx.nano.BacillusComma 1.0 | 13 | 3% | 16 |
| qualidafial.MajorDick 1.0.1 | 12 | 3% | 14 |
| SHAM.WOW 1.4 | 11 | 3% | 19 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 68.6 | 155 / 700 | 3.82 | 12.6% | 46655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.0% | 338 |
| kc.micro.Figment 1.0 | 2.1 | 14.9% | 111 |
| hadur117.nano.SanaroB4K8 0.3 | 3.2 | 12.6% | 155 |
| yagami.Tidus 0.11 | 4.2 | 11.4% | 5 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.8% | 50 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 37 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 4 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 71.1 | 10 / 35 | 2353 |
| 2 | 3 | 57.1 | 66.3 | 5 / 35 | 2142 |
| 3 | 3 | 58.6 | 69.8 | 8 / 35 | 2254 |
| 4 | 3 | 59.6 | 72.4 | 8 / 35 | 2292 |
| 5 | 2 | 62.5 | 79.0 | 11 / 35 | 2502 |
| 6 | 3 | 58.8 | 67.9 | 9 / 35 | 2475 |
| 7 | 3 | 60.8 | 75.6 | 6 / 35 | 2553 |
| 8 | 4 | 56.6 | 65.7 | 2 / 35 | 2359 |
| 9 | 3 | 58.5 | 67.9 | 8 / 35 | 2434 |
| 10 | 5 | 54.7 | 59.7 | 4 / 35 | 2072 |
| 11 | 4 | 58.5 | 67.3 | 8 / 35 | 2471 |
| 12 | 4 | 56.7 | 63.2 | 7 / 35 | 2336 |
| 13 | 3 | 57.1 | 64.8 | 9 / 35 | 2190 |
| 14 | 4 | 54.7 | 57.5 | 9 / 35 | 2126 |
| 15 | 3 | 58.8 | 68.9 | 10 / 35 | 2220 |
| 16 | 2 | 59.7 | 73.3 | 6 / 35 | 2213 |
| 17 | 3 | 59.8 | 70.8 | 8 / 35 | 2443 |
| 18 | 3 | 59.0 | 68.9 | 10 / 35 | 2235 |
| 19 | 3 | 60.2 | 73.3 | 10 / 35 | 2299 |
| 20 | 3 | 59.5 | 69.2 | 7 / 35 | 2686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 163 | 39% |
| kc.micro.Figment 1.0 | 65 | 55% |
| mc2.enemy.Original 0.9 | 27 | 89% |
| pedersen.Grishnakh 1.0 | 26 | 50% |
| yagami.Tidus 0.11 | 12 | 100% |
| dft.Calliope 5.6 | 7 | 86% |

Hadur died in 545 of 700 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 189 | 35% | 255 |
| kc.micro.Figment 1.0 | 131 | 24% | 169 |
| yagami.Tidus 0.11 | 63 | 12% | 81 |
| mc2.enemy.Original 0.9 | 53 | 10% | 76 |
| pedersen.Grishnakh 1.0 | 48 | 9% | 50 |
| robar.nano.Assertive_Melee 0.2 | 19 | 3% | 19 |
| step.nanoPri 1.0 | 16 | 3% | 17 |
| dft.Calliope 5.6 | 14 | 3% | 21 |
| rdm.Dueler 0.4x | 12 | 2% | 12 |

## Melee bench: F10

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 82.3 | 272 / 700 | 2.59 | 15.2% | 64436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.6% | 184 |
| hadur117.nano.SanaroB4K8 0.3 | 1.9 | 15.2% | 272 |
| ne.Chimera 1.2 | 3.2 | 13.2% | 68 |
| ejb.Polaris 1.0.1 | 3.7 | 12.7% | 59 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.9% | 74 |
| vStar.RAFzilla 2.15 | 5.6 | 10.3% | 27 |
| sam.Samspin 1.0 | 7.9 | 6.2% | 3 |
| kurios.DOSexe .9b | 8.1 | 5.8% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 1 |
| donjezza.Muncho 1.0 | 9.9 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 85.7 | 14 / 35 | 3055 |
| 2 | 3 | 60.2 | 76.5 | 8 / 35 | 2804 |
| 3 | 2 | 61.6 | 76.5 | 13 / 35 | 3042 |
| 4 | 3 | 60.9 | 74.3 | 9 / 35 | 3095 |
| 5 | 1 | 63.2 | 83.2 | 16 / 35 | 3060 |
| 6 | 2 | 65.2 | 87.9 | 15 / 35 | 3438 |
| 7 | 2 | 63.9 | 84.1 | 13 / 35 | 3301 |
| 8 | 2 | 64.1 | 85.4 | 13 / 35 | 3184 |
| 9 | 1 | 66.1 | 89.2 | 16 / 35 | 3809 |
| 10 | 1 | 64.7 | 88.3 | 17 / 35 | 3149 |
| 11 | 3 | 60.2 | 73.3 | 7 / 35 | 3209 |
| 12 | 2 | 64.2 | 85.7 | 13 / 35 | 3143 |
| 13 | 2 | 62.1 | 78.7 | 15 / 35 | 2995 |
| 14 | 1 | 65.0 | 86.0 | 17 / 35 | 3490 |
| 15 | 1 | 64.0 | 83.2 | 14 / 35 | 3384 |
| 16 | 3 | 61.4 | 76.2 | 12 / 35 | 2979 |
| 17 | 1 | 64.5 | 83.8 | 16 / 35 | 3506 |
| 18 | 1 | 63.4 | 82.2 | 15 / 35 | 3179 |
| 19 | 2 | 63.7 | 85.4 | 14 / 35 | 3252 |
| 20 | 2 | 63.4 | 81.3 | 15 / 35 | 3362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 147 | 46% |
| ejb.Polaris 1.0.1 | 111 | 86% |
| ne.Chimera 1.2 | 71 | 58% |
| tvv.micro.Antares 1.1.1 | 60 | 37% |
| vStar.RAFzilla 2.15 | 39 | 77% |
| kurios.DOSexe .9b | 10 | 70% |
| donjezza.Muncho 1.0 | 10 | 60% |
| sam.Samspin 1.0 | 5 | 60% |

Hadur died in 429 of 700 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 160 | 37% | 224 |
| ne.Chimera 1.2 | 112 | 26% | 154 |
| tvv.micro.Antares 1.1.1 | 65 | 15% | 83 |
| ejb.Polaris 1.0.1 | 37 | 9% | 139 |
| vStar.RAFzilla 2.15 | 20 | 5% | 45 |
| sam.Samspin 1.0 | 11 | 3% | 15 |
| kurios.DOSexe .9b | 10 | 2% | 18 |
| donjezza.Muncho 1.0 | 7 | 2% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 2% | 8 |

## Melee bench: F11

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 72.8 | 211 / 700 | 3.45 | 13.5% | 50407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 17.0% | 246 |
| hadur117.nano.SanaroB4K8 0.3 | 2.5 | 13.5% | 211 |
| cx.mini.Nimrod 0.55 | 2.6 | 13.1% | 93 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 38 |
| rdt199.Warlord 0.73 | 5.6 | 9.6% | 36 |
| br2.MobyDickBot 1.6 | 6.2 | 9.0% | 28 |
| uji.YellohFellah 1.0 | 6.6 | 8.7% | 47 |
| KiraNL.Chupacabra 0.4 | 7.6 | 7.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 1 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 72.4 | 9 / 35 | 2301 |
| 2 | 3 | 59.0 | 70.2 | 9 / 35 | 2538 |
| 3 | 2 | 60.7 | 73.7 | 14 / 35 | 2524 |
| 4 | 3 | 58.8 | 69.2 | 12 / 35 | 2174 |
| 5 | 2 | 60.3 | 76.8 | 11 / 35 | 2301 |
| 6 | 3 | 57.1 | 66.7 | 9 / 35 | 2372 |
| 7 | 2 | 59.1 | 72.4 | 9 / 35 | 2582 |
| 8 | 3 | 58.8 | 71.4 | 10 / 35 | 2415 |
| 9 | 3 | 57.7 | 66.0 | 7 / 35 | 2824 |
| 10 | 1 | 63.7 | 81.3 | 13 / 35 | 3254 |
| 11 | 3 | 59.8 | 71.4 | 12 / 35 | 2400 |
| 12 | 3 | 60.0 | 75.2 | 8 / 35 | 2308 |
| 13 | 3 | 59.2 | 71.7 | 7 / 35 | 2574 |
| 14 | 2 | 60.7 | 75.9 | 10 / 35 | 2592 |
| 15 | 3 | 58.7 | 68.9 | 9 / 35 | 2514 |
| 16 | 2 | 62.2 | 80.0 | 16 / 35 | 2548 |
| 17 | 2 | 61.0 | 75.9 | 12 / 35 | 2673 |
| 18 | 2 | 59.1 | 70.5 | 10 / 35 | 2606 |
| 19 | 3 | 58.9 | 68.9 | 11 / 35 | 2438 |
| 20 | 2 | 61.3 | 77.1 | 13 / 35 | 2469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 141 | 60% |
| cx.mini.Nimrod 0.55 | 55 | 56% |
| djc.DynaBot 0.1.1 | 44 | 84% |
| br2.MobyDickBot 1.6 | 36 | 61% |
| uji.YellohFellah 1.0 | 27 | 41% |
| rdt199.Warlord 0.73 | 21 | 95% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |

Hadur died in 489 of 700 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 181 | 37% | 257 |
| cx.mini.Nimrod 0.55 | 108 | 22% | 141 |
| rdt199.Warlord 0.73 | 55 | 11% | 75 |
| KiraNL.Chupacabra 0.4 | 35 | 7% | 38 |
| uji.YellohFellah 1.0 | 34 | 7% | 59 |
| djc.DynaBot 0.1.1 | 29 | 6% | 56 |
| br2.MobyDickBot 1.6 | 26 | 5% | 51 |
| stelo.MirrorNano 1.3 | 13 | 3% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 2% | 9 |

## Melee bench: F12

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 74.5 | 193 / 700 | 3.29 | 13.7% | 47193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.7% | 162 |
| nat.PallasHawk 1.0 | 2.3 | 14.1% | 157 |
| hadur117.nano.SanaroB4K8 0.3 | 2.9 | 13.7% | 193 |
| darkcanuck.Leon 1.01 | 3.1 | 13.4% | 128 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 39 |
| jrm.Test0 1.0 | 6.3 | 8.0% | 8 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.2% | 4 |
| jp.Perpy 16.0 | 7.7 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 8 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 77.1 | 10 / 35 | 2584 |
| 2 | 4 | 59.7 | 74.3 | 9 / 35 | 2091 |
| 3 | 1 | 62.8 | 81.6 | 13 / 35 | 2336 |
| 4 | 2 | 62.1 | 81.0 | 10 / 35 | 2483 |
| 5 | 4 | 57.5 | 70.5 | 3 / 35 | 2428 |
| 6 | 4 | 58.3 | 69.5 | 8 / 35 | 2212 |
| 7 | 4 | 58.5 | 71.7 | 5 / 35 | 2311 |
| 8 | 4 | 58.6 | 69.8 | 8 / 35 | 2373 |
| 9 | 2 | 61.6 | 77.1 | 12 / 35 | 2476 |
| 10 | 2 | 60.4 | 76.5 | 10 / 35 | 2303 |
| 11 | 3 | 58.7 | 70.5 | 8 / 35 | 2310 |
| 12 | 3 | 60.2 | 73.7 | 12 / 35 | 2338 |
| 13 | 2 | 60.7 | 77.8 | 7 / 35 | 2526 |
| 14 | 2 | 63.4 | 82.5 | 14 / 35 | 2721 |
| 15 | 3 | 59.5 | 72.1 | 9 / 35 | 2445 |
| 16 | 4 | 59.0 | 71.1 | 10 / 35 | 2397 |
| 17 | 2 | 60.2 | 73.3 | 12 / 35 | 2470 |
| 18 | 4 | 58.0 | 68.9 | 8 / 35 | 2107 |
| 19 | 3 | 58.9 | 71.7 | 11 / 35 | 2063 |
| 20 | 2 | 61.9 | 79.4 | 14 / 35 | 2219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 115 | 45% |
| bts.wiki.RipCurl 0.9b | 115 | 55% |
| nat.PallasHawk 1.0 | 114 | 32% |
| brainfade.melee.Genghis 0.36 | 24 | 88% |
| jaybot.bots.Oddball 4.0 | 9 | 56% |
| jrm.Test0 1.0 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 507 of 700 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 135 | 27% | 179 |
| bts.wiki.RipCurl 0.9b | 131 | 26% | 180 |
| darkcanuck.Leon 1.01 | 105 | 21% | 165 |
| brainfade.melee.Genghis 0.36 | 46 | 9% | 61 |
| jrm.Test0 1.0 | 40 | 8% | 48 |
| cs.sheldor.Talon 1.1 | 19 | 4% | 24 |
| jaybot.bots.Oddball 4.0 | 17 | 3% | 22 |
| stuff.Vlad 0.1 | 8 | 2% | 11 |
| jp.Perpy 16.0 | 6 | 1% | 10 |

## Melee bench: F13

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 75.3 | 142 / 700 | 3.22 | 13.1% | 50421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.4% | 307 |
| ags.Glacier 0.2.11 | 1.7 | 16.9% | 157 |
| hadur117.nano.SanaroB4K8 0.3 | 3.3 | 13.1% | 142 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 56 |
| gh.micro.Gruweltje 0.7 | 4.4 | 11.8% | 33 |
| apc.Colossus2 0.17 | 6.1 | 8.6% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.2% | 5 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 74.3 | 5 / 35 | 2442 |
| 2 | 3 | 62.2 | 77.8 | 9 / 35 | 3029 |
| 3 | 4 | 60.8 | 78.1 | 5 / 35 | 2611 |
| 4 | 3 | 60.7 | 77.8 | 6 / 35 | 2422 |
| 5 | 3 | 61.6 | 80.6 | 7 / 35 | 2501 |
| 6 | 3 | 60.2 | 76.5 | 7 / 35 | 2347 |
| 7 | 3 | 58.8 | 70.5 | 6 / 35 | 2229 |
| 8 | 3 | 60.1 | 76.8 | 9 / 35 | 2089 |
| 9 | 3 | 60.7 | 76.2 | 8 / 35 | 2633 |
| 10 | 3 | 59.8 | 72.7 | 7 / 35 | 2616 |
| 11 | 4 | 58.4 | 70.8 | 5 / 35 | 2526 |
| 12 | 4 | 58.8 | 69.8 | 5 / 35 | 2630 |
| 13 | 3 | 63.3 | 81.0 | 13 / 35 | 2863 |
| 14 | 3 | 61.5 | 77.8 | 10 / 35 | 2498 |
| 15 | 4 | 61.2 | 78.7 | 8 / 35 | 2394 |
| 16 | 5 | 56.3 | 63.8 | 3 / 35 | 2315 |
| 17 | 3 | 59.6 | 70.8 | 9 / 35 | 2606 |
| 18 | 3 | 61.9 | 79.4 | 6 / 35 | 2748 |
| 19 | 3 | 60.5 | 74.9 | 10 / 35 | 2425 |
| 20 | 3 | 60.3 | 77.5 | 4 / 35 | 2497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 179 | 45% |
| ags.Glacier 0.2.11 | 109 | 22% |
| shinh.Entangled 0.3 | 50 | 44% |
| gh.micro.Gruweltje 0.7 | 21 | 57% |
| stelo.Wang 1.0 | 3 | 67% |

Hadur died in 558 of 700 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 188 | 34% | 213 |
| mn.Combat 3.25.0 | 162 | 29% | 243 |
| shinh.Entangled 0.3 | 82 | 15% | 102 |
| gh.micro.Gruweltje 0.7 | 60 | 11% | 75 |
| stelo.Wang 1.0 | 29 | 5% | 30 |
| apc.Colossus2 0.17 | 22 | 4% | 22 |
| maribo.FollowFire 1 | 10 | 2% | 10 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 82.8 | 293 / 700 | 2.37 | 16.2% | 49776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 19.7% | 254 |
| hadur117.nano.SanaroB4K8 0.3 | 2.1 | 16.2% | 293 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.5 | 12.6% | 22 |
| Lo_Ian.Gandalf_V4 4.0 | 4.4 | 11.7% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 11.2% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 10.8% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.6 | 9.4% | 45 |
| pa.Improved 1.0 | 8.0 | 6.0% | 6 |
| sample.TrackFire 1.0 | 9.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 78.6 | 10 / 35 | 2565 |
| 2 | 2 | 63.4 | 85.0 | 16 / 35 | 2275 |
| 3 | 3 | 59.7 | 75.0 | 9 / 35 | 2443 |
| 4 | 2 | 63.0 | 83.2 | 15 / 35 | 2627 |
| 5 | 2 | 63.3 | 81.1 | 16 / 35 | 2616 |
| 6 | 2 | 62.3 | 82.1 | 15 / 35 | 2170 |
| 7 | 2 | 62.6 | 79.6 | 16 / 35 | 2780 |
| 8 | 2 | 61.1 | 78.6 | 13 / 35 | 2133 |
| 9 | 2 | 64.5 | 87.1 | 18 / 35 | 2370 |
| 10 | 2 | 63.5 | 85.7 | 16 / 35 | 2300 |
| 11 | 2 | 61.9 | 78.9 | 15 / 35 | 2275 |
| 12 | 2 | 63.8 | 82.5 | 20 / 35 | 2606 |
| 13 | 2 | 62.7 | 85.0 | 12 / 35 | 2362 |
| 14 | 2 | 63.5 | 82.1 | 12 / 35 | 3327 |
| 15 | 2 | 62.9 | 85.7 | 14 / 35 | 2529 |
| 16 | 2 | 65.9 | 93.9 | 22 / 35 | 2340 |
| 17 | 2 | 63.0 | 83.9 | 15 / 35 | 2354 |
| 18 | 2 | 61.4 | 80.4 | 11 / 35 | 2331 |
| 19 | 2 | 62.7 | 81.8 | 15 / 35 | 2488 |
| 20 | 2 | 63.9 | 86.1 | 13 / 35 | 2885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 325 | 58% |
| sheldor.micro.PointInLineRRAL 1.0 | 48 | 58% |
| sanyi.mikrobi.Roberto 1.0 | 34 | 62% |
| co.edu.usb.rc.LidisTron 1.0 | 32 | 56% |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 80% |
| Lo_Ian.Gandalf_V4 4.0 | 25 | 60% |
| pa.Improved 1.0 | 6 | 17% |

Hadur died in 407 of 700 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 214 | 53% | 383 |
| Lo_Ian.Gandalf_V4 4.0 | 40 | 10% | 57 |
| co.edu.usb.rc.LidisTron 1.0 | 40 | 10% | 42 |
| sheldor.micro.PointInLineRRAL 1.0 | 39 | 10% | 76 |
| dmh.robocode.robot.RedDwarf 0.4 | 34 | 8% | 54 |
| sanyi.mikrobi.Roberto 1.0 | 32 | 8% | 73 |
| pa.Improved 1.0 | 8 | 2% | 11 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 71.2 | 185 / 700 | 3.59 | 13.5% | 61006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.6 | 14.9% | 138 |
| emp.Yngwie 1.11 | 2.4 | 14.0% | 187 |
| hadur117.nano.SanaroB4K8 0.3 | 2.8 | 13.5% | 185 |
| mld.DustBunny 3.8 | 3.4 | 13.1% | 64 |
| cb.nano.Insomnia 1.0 | 5.3 | 11.0% | 35 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.4% | 83 |
| lambdaxy.TBot 0.1 | 7.6 | 6.9% | 1 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.7% | 4 |
| divineomega.TrialBot 0.003 | 8.9 | 5.1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 72.7 | 10 / 35 | 3288 |
| 2 | 4 | 60.5 | 72.7 | 10 / 35 | 2780 |
| 3 | 3 | 61.0 | 74.0 | 9 / 35 | 3085 |
| 4 | 3 | 59.2 | 67.9 | 7 / 35 | 3224 |
| 5 | 3 | 61.0 | 73.0 | 10 / 35 | 3094 |
| 6 | 4 | 56.3 | 64.8 | 3 / 35 | 2734 |
| 7 | 2 | 61.3 | 74.6 | 8 / 35 | 3167 |
| 8 | 3 | 57.9 | 64.1 | 9 / 35 | 2910 |
| 9 | 3 | 58.9 | 67.6 | 11 / 35 | 3022 |
| 10 | 1 | 61.8 | 75.2 | 13 / 35 | 2954 |
| 11 | 2 | 62.8 | 79.4 | 10 / 35 | 3135 |
| 12 | 2 | 60.7 | 73.3 | 10 / 35 | 3006 |
| 13 | 4 | 58.5 | 65.4 | 9 / 35 | 3064 |
| 14 | 3 | 60.4 | 70.5 | 9 / 35 | 3193 |
| 15 | 4 | 58.7 | 67.9 | 9 / 35 | 2842 |
| 16 | 3 | 61.4 | 74.9 | 10 / 35 | 3004 |
| 17 | 2 | 61.0 | 73.3 | 9 / 35 | 3407 |
| 18 | 2 | 61.3 | 72.1 | 12 / 35 | 3212 |
| 19 | 3 | 61.1 | 73.0 | 10 / 35 | 3104 |
| 20 | 3 | 57.8 | 67.0 | 7 / 35 | 2781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 117 | 74% |
| kawigi.micro.Shiz 1.1 | 68 | 43% |
| cb.nano.Insomnia 1.0 | 35 | 74% |
| kawigi.robot.Girl 1.2 | 35 | 74% |
| mld.DustBunny 3.8 | 26 | 19% |
| divineomega.TrialBot 0.003 | 12 | 83% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 516 of 700 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 121 | 23% | 146 |
| emp.Yngwie 1.11 | 110 | 21% | 214 |
| mld.DustBunny 3.8 | 98 | 19% | 118 |
| cb.nano.Insomnia 1.0 | 71 | 14% | 64 |
| kawigi.robot.Girl 1.2 | 60 | 12% | 87 |
| Grystrion.TrackerWO 1.0 | 19 | 4% | 19 |
| lambdaxy.TBot 0.1 | 15 | 3% | 15 |
| divineomega.TrialBot 0.003 | 14 | 3% | 28 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 7 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 72.7 | 167 / 700 | 3.46 | 13.7% | 60140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.9% | 284 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.6% | 27 |
| hadur117.nano.SanaroB4K8 0.3 | 2.8 | 13.7% | 167 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.4% | 136 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.4% | 10 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.4% | 41 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.8% | 11 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.7% | 20 |
| repositorio.NanoStep 1.0 | 9.1 | 5.0% | 1 |
| asd.Cthulhu 1.3 | 9.3 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.3 | 9 / 35 | 3350 |
| 2 | 3 | 60.8 | 74.3 | 9 / 35 | 2961 |
| 3 | 3 | 61.4 | 75.2 | 6 / 35 | 3026 |
| 4 | 3 | 62.4 | 76.8 | 9 / 35 | 3137 |
| 5 | 3 | 59.7 | 70.2 | 8 / 35 | 2954 |
| 6 | 3 | 60.0 | 72.4 | 7 / 35 | 2818 |
| 7 | 3 | 62.2 | 75.6 | 10 / 35 | 3373 |
| 8 | 3 | 60.0 | 71.7 | 7 / 35 | 2937 |
| 9 | 2 | 62.7 | 78.1 | 10 / 35 | 3286 |
| 10 | 2 | 61.4 | 75.9 | 12 / 35 | 2669 |
| 11 | 3 | 59.5 | 69.8 | 6 / 35 | 2791 |
| 12 | 2 | 61.8 | 75.6 | 11 / 35 | 3050 |
| 13 | 3 | 59.4 | 69.5 | 8 / 35 | 2921 |
| 14 | 3 | 61.4 | 72.7 | 10 / 35 | 3098 |
| 15 | 2 | 62.5 | 76.5 | 11 / 35 | 3294 |
| 16 | 3 | 59.7 | 70.2 | 10 / 35 | 2559 |
| 17 | 3 | 57.0 | 63.8 | 4 / 35 | 2856 |
| 18 | 3 | 60.0 | 72.1 | 8 / 35 | 2783 |
| 19 | 3 | 60.8 | 72.1 | 5 / 35 | 3285 |
| 20 | 3 | 59.0 | 67.3 | 7 / 35 | 2992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 198 | 33% |
| techdude.forest.FlamingForest 1.1 | 81 | 43% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 36 | 100% |
| tvv.nano.Polaris 1.2 | 17 | 12% |
| bvh.fnr.Fenrir 0.36l | 14 | 93% |
| divineomega.DivineBot 1.9.4.5 | 11 | 73% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| repositorio.NanoStep 1.0 | 1 | 0% |

Hadur died in 533 of 700 rounds, at a mean tick of 1540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 248 | 47% | 324 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 86 | 16% | 108 |
| techdude.forest.FlamingForest 1.1 | 64 | 12% | 102 |
| bvh.fnr.Fenrir 0.36l | 45 | 8% | 49 |
| tvv.nano.Polaris 1.2 | 41 | 8% | 44 |
| stelo.IntrinsicVolatility 1.4 | 17 | 3% | 24 |
| divineomega.DivineBot 1.9.4.5 | 15 | 3% | 30 |
| asd.Cthulhu 1.3 | 15 | 3% | 15 |
| repositorio.NanoStep 1.0 | 2 | 0% | 4 |

## Melee bench: F17

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 70.7 | 204 / 700 | 3.63 | 13.3% | 57015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.9 | 14.1% | 127 |
| oog.melee.Mercutio 1.0 | 2.4 | 13.6% | 133 |
| hadur117.nano.SanaroB4K8 0.3 | 2.9 | 13.3% | 204 |
| cx.BlestPain 1.41 | 3.7 | 12.7% | 114 |
| nic.Nicator 2.4 | 4.8 | 11.8% | 57 |
| ahf.NanoAndrew .4 | 5.5 | 11.2% | 63 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.5% | 3 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 69.2 | 10 / 35 | 2510 |
| 2 | 2 | 60.2 | 72.1 | 9 / 35 | 2906 |
| 3 | 3 | 60.9 | 73.7 | 8 / 35 | 3001 |
| 4 | 5 | 55.7 | 61.0 | 8 / 35 | 2558 |
| 5 | 3 | 58.7 | 67.9 | 11 / 35 | 2627 |
| 6 | 3 | 60.2 | 69.8 | 14 / 35 | 2702 |
| 7 | 4 | 58.4 | 64.1 | 10 / 35 | 2906 |
| 8 | 4 | 59.2 | 68.3 | 8 / 35 | 2849 |
| 9 | 3 | 60.5 | 72.4 | 13 / 35 | 2830 |
| 10 | 4 | 58.4 | 65.4 | 8 / 35 | 2895 |
| 11 | 2 | 61.9 | 77.1 | 9 / 35 | 2889 |
| 12 | 3 | 61.2 | 74.6 | 9 / 35 | 2918 |
| 13 | 1 | 62.0 | 75.9 | 13 / 35 | 2806 |
| 14 | 1 | 61.9 | 77.1 | 13 / 35 | 2890 |
| 15 | 1 | 64.1 | 82.9 | 18 / 35 | 2975 |
| 16 | 4 | 57.0 | 62.9 | 7 / 35 | 2787 |
| 17 | 1 | 62.2 | 74.0 | 14 / 35 | 3476 |
| 18 | 1 | 62.5 | 77.1 | 11 / 35 | 3037 |
| 19 | 4 | 56.8 | 63.2 | 6 / 35 | 2715 |
| 20 | 5 | 57.8 | 66.3 | 5 / 35 | 2738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 103 | 43% |
| oog.melee.Mercutio 1.0 | 77 | 68% |
| cx.BlestPain 1.41 | 62 | 85% |
| nic.Nicator 2.4 | 47 | 55% |
| ahf.NanoAndrew .4 | 28 | 57% |
| maribo.melee.BMV 0.1 | 12 | 92% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |

Hadur died in 498 of 700 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 115 | 23% | 157 |
| cx.BlestPain 1.41 | 86 | 17% | 140 |
| ahf.NanoAndrew .4 | 77 | 15% | 96 |
| nic.Nicator 2.4 | 71 | 14% | 93 |
| oog.melee.Mercutio 1.0 | 69 | 14% | 123 |
| maribo.melee.BMV 0.1 | 45 | 9% | 54 |
| tex.Longbot 0.4 | 25 | 5% | 25 |
| edu.otg.spr.TheTeacher 1.2 | 9 | 2% | 11 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 75.8 | 272 / 700 | 2.93 | 15.6% | 49352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB4K8 0.3 | 1.5 | 15.6% | 272 |
| agd.Mooserwirt2 2.7 | 1.8 | 14.9% | 155 |
| uji.DBH 1.1 | 3.4 | 13.3% | 83 |
| spinnercat.Robovirus 2.718 | 4.2 | 12.3% | 39 |
| ratosh.Nobo 0.21 | 4.4 | 12.2% | 33 |
| sigterm.Sigterm 1.0 | 6.2 | 9.9% | 62 |
| kawigi.mini.Fhqwhgads 1.1 | 6.8 | 8.7% | 24 |
| stelo.WangRobot 1.0 | 8.2 | 7.0% | 34 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 72.1 | 13 / 35 | 2332 |
| 2 | 1 | 61.6 | 78.9 | 14 / 35 | 2622 |
| 3 | 2 | 58.0 | 69.3 | 9 / 35 | 2667 |
| 4 | 2 | 60.7 | 75.0 | 13 / 35 | 2554 |
| 5 | 1 | 61.5 | 80.4 | 17 / 35 | 2215 |
| 6 | 1 | 62.6 | 79.6 | 17 / 35 | 2702 |
| 7 | 1 | 60.9 | 75.4 | 15 / 35 | 2609 |
| 8 | 2 | 58.1 | 72.1 | 11 / 35 | 2073 |
| 9 | 1 | 60.6 | 76.1 | 14 / 35 | 2547 |
| 10 | 1 | 58.1 | 68.6 | 14 / 35 | 2355 |
| 11 | 1 | 62.8 | 79.6 | 18 / 35 | 2607 |
| 12 | 1 | 63.1 | 83.6 | 15 / 35 | 2546 |
| 13 | 2 | 60.3 | 78.6 | 11 / 35 | 2293 |
| 14 | 1 | 62.4 | 78.2 | 18 / 35 | 2708 |
| 15 | 1 | 62.8 | 83.6 | 17 / 35 | 2408 |
| 16 | 1 | 61.9 | 79.6 | 16 / 35 | 2371 |
| 17 | 2 | 58.6 | 71.1 | 10 / 35 | 2449 |
| 18 | 3 | 56.6 | 65.7 | 10 / 35 | 2337 |
| 19 | 2 | 58.4 | 71.4 | 7 / 35 | 2629 |
| 20 | 1 | 60.8 | 77.9 | 13 / 35 | 2328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 127 | 69% |
| uji.DBH 1.1 | 71 | 58% |
| spinnercat.Robovirus 2.718 | 61 | 87% |
| sigterm.Sigterm 1.0 | 43 | 56% |
| ratosh.Nobo 0.21 | 34 | 79% |
| stelo.WangRobot 1.0 | 27 | 48% |
| kawigi.mini.Fhqwhgads 1.1 | 26 | 81% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 100% |

Hadur died in 431 of 700 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 110 | 26% | 203 |
| uji.DBH 1.1 | 79 | 18% | 102 |
| ratosh.Nobo 0.21 | 75 | 17% | 108 |
| spinnercat.Robovirus 2.718 | 47 | 11% | 91 |
| sigterm.Sigterm 1.0 | 40 | 9% | 68 |
| kawigi.mini.Fhqwhgads 1.1 | 29 | 7% | 53 |
| stelo.WangRobot 1.0 | 29 | 7% | 49 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 21 | 5% | 26 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 83.7 | 272 / 700 | 2.47 | 15.7% | 61173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.5 | 16.5% | 233 |
| hadur117.nano.SanaroB4K8 0.3 | 2.2 | 15.7% | 272 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 15.7% | 141 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.5% | 22 |
| erdnis.Rover 0.3 | 5.1 | 10.4% | 9 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.9% | 8 |
| mbh.Mbh 0.1 | 7.4 | 7.3% | 0 |
| pac.ABC 2.1 | 7.7 | 7.2% | 13 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 82.9 | 14 / 35 | 3078 |
| 2 | 3 | 64.5 | 82.2 | 15 / 35 | 2895 |
| 3 | 2 | 63.8 | 79.0 | 12 / 35 | 3289 |
| 4 | 1 | 66.5 | 88.9 | 17 / 35 | 3281 |
| 5 | 2 | 65.2 | 84.8 | 13 / 35 | 3174 |
| 6 | 3 | 63.7 | 81.0 | 8 / 35 | 3067 |
| 7 | 3 | 62.5 | 77.5 | 8 / 35 | 3000 |
| 8 | 1 | 66.6 | 88.9 | 19 / 35 | 3157 |
| 9 | 2 | 66.0 | 88.3 | 15 / 35 | 2748 |
| 10 | 2 | 65.9 | 85.4 | 13 / 35 | 3309 |
| 11 | 2 | 66.4 | 88.9 | 18 / 35 | 2724 |
| 12 | 3 | 65.3 | 82.2 | 12 / 35 | 3509 |
| 13 | 2 | 66.2 | 87.3 | 16 / 35 | 3010 |
| 14 | 2 | 65.4 | 87.6 | 14 / 35 | 2957 |
| 15 | 2 | 65.2 | 83.5 | 15 / 35 | 3125 |
| 16 | 2 | 64.5 | 84.4 | 13 / 35 | 2809 |
| 17 | 2 | 63.6 | 79.0 | 13 / 35 | 2841 |
| 18 | 3 | 61.6 | 74.0 | 8 / 35 | 3056 |
| 19 | 1 | 64.5 | 84.4 | 13 / 35 | 2969 |
| 20 | 2 | 65.4 | 83.5 | 16 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 254 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 147 | 49% |
| krillr.mini.JointStrike 2.0.0 | 42 | 79% |
| erdnis.Rover 0.3 | 21 | 86% |
| pac.ABC 2.1 | 14 | 43% |
| patson.PatsonTestBot 1.0 | 11 | 82% |
| pbg.R2D2 1.0 | 2 | 50% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 431 of 700 rounds, at a mean tick of 1250. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 162 | 38% | 79 |
| davidalves.net.DuelistMiniMelee 1.2 | 153 | 35% | 362 |
| krillr.mini.JointStrike 2.0.0 | 45 | 10% | 81 |
| erdnis.Rover 0.3 | 26 | 6% | 55 |
| patson.PatsonTestBot 1.0 | 21 | 5% | 47 |
| pac.ABC 2.1 | 14 | 3% | 35 |
| pbg.R2D2 1.0 | 8 | 2% | 20 |
| mbh.Mbh 0.1 | 2 | 0% | 20 |

## Melee bench: F20

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 76.8 | 232 / 700 | 3.09 | 14.3% | 54837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.1 | 17.5% | 258 |
| hadur117.nano.SanaroB4K8 0.3 | 2.0 | 14.3% | 232 |
| nz.jdc.nano.GridFu 1.0 | 3.4 | 12.0% | 52 |
| fwb.Nine 1.0.1 | 4.0 | 11.5% | 60 |
| catcat20.Rabbit 0.001 | 4.8 | 10.4% | 53 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 8.5% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.4% | 10 |
| bayen.nut.Squirrel 1.615 | 7.4 | 7.9% | 26 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 78.7 | 12 / 35 | 2973 |
| 2 | 2 | 59.8 | 75.6 | 9 / 35 | 2269 |
| 3 | 2 | 62.4 | 76.8 | 10 / 35 | 3124 |
| 4 | 2 | 63.0 | 79.7 | 13 / 35 | 3072 |
| 5 | 2 | 63.8 | 84.1 | 16 / 35 | 2824 |
| 6 | 2 | 59.9 | 73.7 | 9 / 35 | 2426 |
| 7 | 2 | 59.5 | 73.3 | 11 / 35 | 2507 |
| 8 | 2 | 60.0 | 72.7 | 13 / 35 | 2432 |
| 9 | 2 | 61.2 | 77.1 | 9 / 35 | 2815 |
| 10 | 3 | 59.3 | 70.5 | 10 / 35 | 2635 |
| 11 | 2 | 61.3 | 76.2 | 10 / 35 | 2950 |
| 12 | 2 | 61.8 | 77.8 | 10 / 35 | 2861 |
| 13 | 2 | 63.3 | 78.7 | 19 / 35 | 2740 |
| 14 | 1 | 64.9 | 85.7 | 21 / 35 | 2987 |
| 15 | 2 | 58.2 | 72.1 | 7 / 35 | 2267 |
| 16 | 2 | 60.0 | 74.9 | 6 / 35 | 2685 |
| 17 | 2 | 60.2 | 72.1 | 10 / 35 | 2734 |
| 18 | 2 | 62.0 | 78.7 | 14 / 35 | 2528 |
| 19 | 2 | 63.4 | 81.3 | 12 / 35 | 3141 |
| 20 | 2 | 61.3 | 76.2 | 11 / 35 | 2867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 175 | 49% |
| fwb.Nine 1.0.1 | 58 | 91% |
| catcat20.Rabbit 0.001 | 54 | 74% |
| nz.jdc.nano.GridFu 1.0 | 47 | 70% |
| bayen.nut.Squirrel 1.615 | 12 | 75% |
| m3thos.mini.Eva01 0.5.5 | 12 | 58% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 470 of 700 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 219 | 47% | 294 |
| fwb.Nine 1.0.1 | 88 | 19% | 118 |
| nz.jdc.nano.GridFu 1.0 | 62 | 13% | 101 |
| catcat20.Rabbit 0.001 | 34 | 7% | 81 |
| bayen.nut.Squirrel 1.615 | 29 | 6% | 40 |
| djdjdj.NanoSkunk10 1.0 | 15 | 3% | 21 |
| m3thos.mini.Eva01 0.5.5 | 14 | 3% | 30 |
| ntc.ControlledChaos 1.1.4 | 6 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 86.0 | 347 / 700 | 2.26 | 16.9% | 74163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.6% | 256 |
| hadur117.nano.SanaroB4K8 0.3 | 1.8 | 16.9% | 347 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 44 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 25 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 4 |
| eld.Hmm 1.0 | 5.6 | 8.4% | 23 |
| fire219.CatBot 1.0 | 7.6 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 3 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.7 | 21 / 35 | 3837 |
| 2 | 2 | 66.1 | 83.5 | 15 / 35 | 4012 |
| 3 | 2 | 66.0 | 87.3 | 12 / 35 | 3600 |
| 4 | 2 | 67.0 | 88.3 | 19 / 35 | 3812 |
| 5 | 1 | 66.6 | 88.6 | 19 / 35 | 3393 |
| 6 | 2 | 67.0 | 88.6 | 21 / 35 | 3369 |
| 7 | 2 | 67.1 | 89.8 | 20 / 35 | 3631 |
| 8 | 2 | 66.1 | 85.1 | 13 / 35 | 4010 |
| 9 | 2 | 65.4 | 83.8 | 18 / 35 | 3450 |
| 10 | 1 | 67.6 | 88.3 | 21 / 35 | 3859 |
| 11 | 2 | 66.8 | 86.0 | 16 / 35 | 3844 |
| 12 | 1 | 66.6 | 88.9 | 19 / 35 | 3564 |
| 13 | 2 | 67.2 | 86.3 | 19 / 35 | 4022 |
| 14 | 1 | 66.9 | 86.0 | 18 / 35 | 4165 |
| 15 | 2 | 64.9 | 80.3 | 19 / 35 | 3492 |
| 16 | 2 | 66.9 | 87.6 | 21 / 35 | 3587 |
| 17 | 2 | 66.7 | 87.3 | 19 / 35 | 3463 |
| 18 | 3 | 63.8 | 79.0 | 12 / 35 | 3473 |
| 19 | 2 | 64.5 | 81.0 | 13 / 35 | 3726 |
| 20 | 2 | 66.1 | 87.3 | 12 / 35 | 3854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 362 | 60% |
| dummy.mini.Scimitar 1.01 | 69 | 86% |
| eld.Hmm 1.0 | 48 | 79% |
| cf.RiO.RiOx 4.2.1 | 33 | 55% |
| oa.weak.BotherBot 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 6 | 67% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 354 of 700 rounds, at a mean tick of 1518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 178 | 50% | 339 |
| dummy.mini.Scimitar 1.01 | 75 | 21% | 166 |
| cf.RiO.RiOx 4.2.1 | 51 | 14% | 72 |
| eld.Hmm 1.0 | 15 | 4% | 67 |
| PSW.Relentless 0.1 | 10 | 3% | 10 |
| oa.weak.BotherBot 0.1 | 9 | 3% | 23 |
| fire219.CatBot 1.0 | 7 | 2% | 7 |
| el.JumpShoot 0.2 | 5 | 1% | 12 |
| arthord.MannyPacquiao Beta | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.8 | 291 / 700 | 2.37 | 16.2% | 65053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.7% | 250 |
| hadur117.nano.SanaroB4K8 0.3 | 2.2 | 16.2% | 291 |
| cre.Karolos 0.32 | 2.9 | 14.9% | 107 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.3% | 33 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.1% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.1% | 5 |
| sample.Walls 1.0 | 7.2 | 8.0% | 4 |
| cw.megas.Blade 0.8 | 7.4 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 84.4 | 13 / 35 | 3237 |
| 2 | 2 | 65.9 | 86.7 | 14 / 35 | 3067 |
| 3 | 3 | 64.9 | 82.2 | 13 / 35 | 3101 |
| 4 | 3 | 65.3 | 82.9 | 13 / 35 | 3218 |
| 5 | 2 | 65.7 | 81.0 | 12 / 35 | 3847 |
| 6 | 2 | 66.6 | 89.5 | 16 / 35 | 3174 |
| 7 | 2 | 68.9 | 92.1 | 21 / 35 | 3508 |
| 8 | 3 | 62.2 | 72.1 | 7 / 35 | 2915 |
| 9 | 2 | 65.8 | 84.1 | 15 / 35 | 2944 |
| 10 | 2 | 65.9 | 84.8 | 13 / 35 | 3482 |
| 11 | 2 | 66.1 | 85.4 | 14 / 35 | 3471 |
| 12 | 2 | 66.6 | 88.9 | 15 / 35 | 3160 |
| 13 | 2 | 66.5 | 84.4 | 18 / 35 | 3174 |
| 14 | 2 | 65.7 | 83.8 | 15 / 35 | 3435 |
| 15 | 2 | 67.1 | 89.2 | 19 / 35 | 3173 |
| 16 | 2 | 66.5 | 85.4 | 13 / 35 | 3128 |
| 17 | 2 | 65.1 | 81.3 | 13 / 35 | 3006 |
| 18 | 2 | 68.1 | 91.1 | 20 / 35 | 3269 |
| 19 | 2 | 65.4 | 82.9 | 14 / 35 | 3176 |
| 20 | 2 | 66.8 | 84.1 | 13 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 251 | 58% |
| cre.Karolos 0.32 | 109 | 50% |
| stelo.AreaTargetingBot 1.1 | 36 | 75% |
| sample.Walls 1.0 | 31 | 97% |
| stelo.RamTrackSurfer 1.2 | 19 | 95% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 15 | 80% |
| cw.megas.Blade 0.8 | 5 | 100% |

Hadur died in 410 of 700 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 207 | 50% | 362 |
| cre.Karolos 0.32 | 113 | 28% | 165 |
| stelo.AreaTargetingBot 1.1 | 46 | 11% | 69 |
| stelo.RamTrackSurfer 1.2 | 17 | 4% | 44 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 15 | 4% | 26 |
| sample.Walls 1.0 | 6 | 1% | 20 |
| cw.megas.Blade 0.8 | 6 | 1% | 11 |

## Melee bench: F24

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 65.1 | 124 / 700 | 4.14 | 11.7% | 42233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 14.7% | 155 |
| florent.XSeries.X2 0.12 | 2.3 | 13.8% | 126 |
| davidalves.Phoenix 0.54 | 2.9 | 13.2% | 140 |
| pedersen.Ugluk 1.1.1 | 4.1 | 12.3% | 85 |
| hadur117.nano.SanaroB4K8 0.3 | 4.4 | 11.7% | 124 |
| oog.melee.Corsair 1.0 | 6.4 | 9.3% | 24 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.9% | 41 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.8% | 5 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 1 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.2 | 57.8 | 6 / 35 | 1972 |
| 2 | 4 | 55.2 | 64.8 | 4 / 35 | 2049 |
| 3 | 3 | 59.1 | 72.1 | 11 / 35 | 2196 |
| 4 | 3 | 57.1 | 67.9 | 8 / 35 | 2235 |
| 5 | 4 | 55.9 | 64.8 | 5 / 35 | 2303 |
| 6 | 5 | 53.6 | 61.0 | 4 / 35 | 1825 |
| 7 | 5 | 56.5 | 66.7 | 6 / 35 | 2014 |
| 8 | 5 | 55.0 | 61.3 | 1 / 35 | 2457 |
| 9 | 5 | 54.3 | 59.0 | 6 / 35 | 2232 |
| 10 | 4 | 57.6 | 65.7 | 8 / 35 | 2455 |
| 11 | 3 | 58.0 | 68.3 | 9 / 35 | 2023 |
| 12 | 5 | 55.2 | 66.3 | 6 / 35 | 1643 |
| 13 | 5 | 52.3 | 57.5 | 3 / 35 | 1864 |
| 14 | 5 | 54.4 | 61.3 | 5 / 35 | 2225 |
| 15 | 5 | 57.1 | 67.9 | 8 / 35 | 1977 |
| 16 | 4 | 58.1 | 69.5 | 9 / 35 | 2176 |
| 17 | 4 | 58.8 | 73.3 | 5 / 35 | 2340 |
| 18 | 4 | 57.3 | 66.0 | 8 / 35 | 2360 |
| 19 | 5 | 56.7 | 66.7 | 7 / 35 | 2060 |
| 20 | 5 | 54.6 | 63.5 | 5 / 35 | 1827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 68 | 51% |
| florent.XSeries.X2 0.12 | 56 | 66% |
| davidalves.Phoenix 0.54 | 43 | 47% |
| pedersen.Ugluk 1.1.1 | 41 | 54% |
| stelo.SoJNanoMelee 1.1 | 16 | 19% |
| oog.melee.Corsair 1.0 | 10 | 60% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 576 of 700 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 133 | 23% | 169 |
| florent.XSeries.X2 0.12 | 118 | 20% | 158 |
| pedersen.Ugluk 1.1.1 | 99 | 17% | 113 |
| davidalves.Phoenix 0.54 | 90 | 16% | 109 |
| stelo.SoJNanoMelee 1.1 | 58 | 10% | 61 |
| oog.melee.Corsair 1.0 | 34 | 6% | 42 |
| lunchie.Lunchbox 0.93 | 21 | 4% | 23 |
| as.FrankTheTank 1.3 | 14 | 2% | 15 |
| evd.X1 0.01 | 9 | 2% | 10 |

## Melee bench: F25

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 74.9 | 224 / 700 | 3.01 | 15.1% | 41092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 16.2% | 154 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 15.3% | 125 |
| hadur117.nano.SanaroB4K8 0.3 | 2.5 | 15.1% | 224 |
| jdw.Hurricane 1.4 | 3.6 | 13.1% | 98 |
| ds.Oo 2.2 | 5.3 | 10.4% | 50 |
| gjr.Cephalosporin 0.1 | 5.8 | 9.6% | 32 |
| adt.Ar2 1.1 | 7.4 | 8.0% | 7 |
| awesomeness.Elite 1.0 | 7.6 | 7.7% | 10 |
| amk.ChumbaMini 0.2 | 9.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 76.4 | 10 / 35 | 2045 |
| 2 | 1 | 61.8 | 79.3 | 12 / 35 | 2275 |
| 3 | 3 | 60.3 | 73.2 | 12 / 35 | 2233 |
| 4 | 3 | 57.6 | 71.4 | 5 / 35 | 1833 |
| 5 | 3 | 60.0 | 75.4 | 10 / 35 | 2014 |
| 6 | 2 | 61.1 | 76.4 | 13 / 35 | 2249 |
| 7 | 3 | 59.3 | 72.5 | 9 / 35 | 2263 |
| 8 | 3 | 62.2 | 81.1 | 15 / 35 | 1835 |
| 9 | 2 | 60.5 | 77.5 | 13 / 35 | 1858 |
| 10 | 3 | 60.5 | 76.4 | 12 / 35 | 1861 |
| 11 | 2 | 61.9 | 78.9 | 14 / 35 | 2134 |
| 12 | 2 | 59.9 | 73.6 | 11 / 35 | 2214 |
| 13 | 2 | 61.8 | 81.1 | 11 / 35 | 2159 |
| 14 | 3 | 56.1 | 68.6 | 6 / 35 | 1831 |
| 15 | 2 | 59.2 | 72.1 | 10 / 35 | 2061 |
| 16 | 3 | 58.4 | 70.4 | 12 / 35 | 1790 |
| 17 | 4 | 57.1 | 65.7 | 10 / 35 | 2012 |
| 18 | 3 | 59.5 | 73.9 | 10 / 35 | 1992 |
| 19 | 1 | 63.2 | 81.8 | 18 / 35 | 2388 |
| 20 | 3 | 59.3 | 71.4 | 11 / 35 | 2045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 135 | 40% |
| voidious.micro.BlitzBat 1.05 | 98 | 39% |
| jdw.Hurricane 1.4 | 67 | 88% |
| gjr.Cephalosporin 0.1 | 41 | 66% |
| ds.Oo 2.2 | 30 | 57% |
| adt.Ar2 1.1 | 21 | 86% |
| awesomeness.Elite 1.0 | 9 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 476 of 700 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 143 | 30% | 202 |
| voidious.micro.BlitzBat 1.05 | 130 | 27% | 181 |
| jdw.Hurricane 1.4 | 70 | 15% | 112 |
| ds.Oo 2.2 | 53 | 11% | 77 |
| gjr.Cephalosporin 0.1 | 30 | 6% | 58 |
| adt.Ar2 1.1 | 27 | 6% | 42 |
| amk.ChumbaMini 0.2 | 13 | 3% | 13 |
| awesomeness.Elite 1.0 | 10 | 2% | 15 |

## Melee bench: F26

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 75.5 | 170 / 700 | 3.20 | 13.5% | 54766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 16.2% | 228 |
| hadur117.nano.SanaroB4K8 0.3 | 2.7 | 13.5% | 170 |
| shu.nitro.LENIN .T34 | 3.4 | 12.8% | 141 |
| lrem.Spectre 0.4.4 | 3.4 | 12.6% | 71 |
| js.PinBall 1.6 | 5.0 | 11.2% | 43 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.8% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.1% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 15 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 75.2 | 11 / 35 | 3006 |
| 2 | 3 | 61.2 | 75.6 | 9 / 35 | 2854 |
| 3 | 2 | 59.9 | 71.4 | 7 / 35 | 2898 |
| 4 | 2 | 63.3 | 81.9 | 15 / 35 | 2847 |
| 5 | 2 | 61.1 | 78.1 | 6 / 35 | 2824 |
| 6 | 3 | 58.4 | 70.2 | 6 / 35 | 2774 |
| 7 | 1 | 63.7 | 82.2 | 16 / 35 | 3160 |
| 8 | 2 | 62.4 | 81.6 | 8 / 35 | 2939 |
| 9 | 2 | 62.0 | 78.7 | 11 / 35 | 2783 |
| 10 | 3 | 60.2 | 77.1 | 2 / 35 | 3006 |
| 11 | 2 | 61.2 | 77.8 | 12 / 35 | 2412 |
| 12 | 4 | 59.1 | 73.3 | 6 / 35 | 2396 |
| 13 | 3 | 60.0 | 75.6 | 6 / 35 | 2176 |
| 14 | 3 | 58.7 | 72.4 | 4 / 35 | 2623 |
| 15 | 3 | 59.1 | 69.5 | 10 / 35 | 2543 |
| 16 | 5 | 57.3 | 65.4 | 4 / 35 | 2497 |
| 17 | 2 | 62.0 | 78.7 | 10 / 35 | 2937 |
| 18 | 3 | 61.0 | 77.5 | 10 / 35 | 2542 |
| 19 | 4 | 59.8 | 71.1 | 8 / 35 | 2778 |
| 20 | 3 | 61.1 | 77.1 | 9 / 35 | 2771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 125 | 37% |
| shu.nitro.LENIN .T34 | 84 | 31% |
| lrem.Spectre 0.4.4 | 70 | 76% |
| js.PinBall 1.6 | 29 | 72% |
| gh.mini.GrubbmOne 1.0 | 25 | 48% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 50% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 533 of 700 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 182 | 34% | 227 |
| shu.nitro.LENIN .T34 | 98 | 18% | 133 |
| lrem.Spectre 0.4.4 | 71 | 13% | 107 |
| gh.mini.GrubbmOne 1.0 | 69 | 13% | 85 |
| js.PinBall 1.6 | 51 | 10% | 69 |
| jaybot.adv.bots.JayBot 2.0 | 28 | 5% | 38 |
| fullsail.LaxativeTeaTwo 1.0 | 19 | 4% | 25 |
| sample.SpinBot 1.0 | 13 | 2% | 16 |
2 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 76.2 | 272 / 700 | 3.14 | 14.2% | 49177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 15.1% | 198 |
| hadur117.nano.SanaroB4K8 0.3 | 2.2 | 14.2% | 272 |
| wee.Gem 1.8.4 | 3.0 | 12.7% | 123 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 11.5% | 44 |
| EH.Eagle 1.0.6 | 4.5 | 11.1% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.6% | 21 |
| joe.ADinosaur 1.0 | 7.3 | 7.9% | 6 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.8% | 10 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.4% | 3 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 80.0 | 17 / 35 | 2447 |
| 2 | 3 | 59.7 | 73.7 | 10 / 35 | 2220 |
| 3 | 3 | 58.7 | 68.9 | 9 / 35 | 2375 |
| 4 | 2 | 61.3 | 79.4 | 13 / 35 | 2228 |
| 5 | 5 | 53.5 | 47.3 | 7 / 35 | 3423 |
| 6 | 2 | 63.1 | 82.9 | 17 / 35 | 2513 |
| 7 | 2 | 63.3 | 84.8 | 17 / 35 | 2216 |
| 8 | 1 | 62.3 | 81.9 | 16 / 35 | 2287 |
| 9 | 4 | 58.3 | 56.5 | 9 / 35 | 3994 |
| 10 | 2 | 58.6 | 69.2 | 11 / 35 | 2593 |
| 11 | 1 | 63.6 | 84.4 | 19 / 35 | 2435 |
| 12 | 2 | 61.9 | 82.5 | 12 / 35 | 2253 |
| 13 | 2 | 61.3 | 76.8 | 13 / 35 | 2475 |
| 14 | 1 | 63.0 | 82.5 | 16 / 35 | 2442 |
| 15 | 2 | 61.5 | 78.4 | 12 / 35 | 2414 |
| 16 | 2 | 60.2 | 77.1 | 10 / 35 | 2149 |
| 17 | 2 | 60.8 | 77.5 | 16 / 35 | 2095 |
| 18 | 3 | 59.3 | 73.3 | 12 / 35 | 2100 |
| 19 | 1 | 64.5 | 85.7 | 21 / 35 | 2523 |
| 20 | 2 | 61.4 | 80.6 | 15 / 35 | 1995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 189 | 70% |
| wee.Gem 1.8.4 | 95 | 59% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 68% |
| EH.Eagle 1.0.6 | 37 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 19 | 63% |
| joe.ADinosaur 1.0 | 6 | 67% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |

Hadur died in 431 of 700 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 134 | 31% | 264 |
| wee.Gem 1.8.4 | 89 | 21% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 58 | 13% | 91 |
| EH.Eagle 1.0.6 | 32 | 7% | 68 |
| joe.ADinosaur 1.0 | 29 | 7% | 32 |
| throxbot.ThroxBot 0.1 | 26 | 6% | 28 |
| techdude.kombat.FlamingKombat 1.5 | 23 | 5% | 30 |
| caimano.Furia_Ceca 0.22 | 23 | 5% | 27 |
| cs.Grudge 1.0 | 16 | 4% | 16 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 84.8 | 329 / 700 | 2.37 | 16.0% | 54237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB4K8 0.3 | 1.5 | 16.0% | 329 |
| kid.test.NightFox .2 | 1.6 | 15.7% | 171 |
| uji.Antique 1.0 | 3.3 | 12.5% | 101 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.4% | 56 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.6% | 20 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 3 |
| ahr.ice.Ice 1.0.2 | 6.9 | 8.0% | 13 |
| matt.advanced.Katana 1.0 | 8.3 | 6.4% | 6 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 86.7 | 19 / 35 | 3044 |
| 2 | 2 | 62.3 | 79.7 | 15 / 35 | 2393 |
| 3 | 1 | 66.4 | 89.2 | 21 / 35 | 3196 |
| 4 | 2 | 62.9 | 81.9 | 11 / 35 | 2750 |
| 5 | 2 | 63.7 | 86.3 | 15 / 35 | 2479 |
| 6 | 1 | 64.1 | 86.3 | 17 / 35 | 2470 |
| 7 | 1 | 64.5 | 86.3 | 17 / 35 | 2685 |
| 8 | 3 | 60.3 | 75.6 | 7 / 35 | 2552 |
| 9 | 2 | 62.9 | 82.5 | 14 / 35 | 2492 |
| 10 | 1 | 64.9 | 85.1 | 16 / 35 | 3037 |
| 11 | 1 | 66.0 | 92.1 | 22 / 35 | 2391 |
| 12 | 1 | 65.5 | 89.2 | 21 / 35 | 2672 |
| 13 | 2 | 64.4 | 85.7 | 17 / 35 | 2688 |
| 14 | 1 | 64.7 | 86.0 | 18 / 35 | 2726 |
| 15 | 1 | 64.4 | 84.1 | 19 / 35 | 2678 |
| 16 | 1 | 66.8 | 93.0 | 21 / 35 | 2764 |
| 17 | 2 | 61.9 | 77.5 | 13 / 35 | 2671 |
| 18 | 1 | 64.9 | 84.8 | 18 / 35 | 3064 |
| 19 | 2 | 63.8 | 83.2 | 15 / 35 | 2750 |
| 20 | 2 | 62.8 | 81.3 | 13 / 35 | 2735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 270 | 67% |
| uji.Antique 1.0 | 102 | 72% |
| qohnil.blot.BlotBot 3.61 | 63 | 54% |
| pfvicm.Sobieski 7.2.3b | 19 | 68% |
| amk.ChumbaWumba 0.3 | 15 | 87% |
| ahr.ice.Ice 1.0.2 | 8 | 38% |
| matt.advanced.Katana 1.0 | 6 | 83% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 373 of 700 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 155 | 42% | 294 |
| uji.Antique 1.0 | 56 | 15% | 146 |
| qohnil.blot.BlotBot 3.61 | 49 | 13% | 91 |
| pfvicm.Sobieski 7.2.3b | 46 | 12% | 59 |
| amk.ChumbaWumba 0.3 | 27 | 7% | 36 |
| ahr.ice.Ice 1.0.2 | 21 | 6% | 32 |
| stelo.Lifestealer 1.0 | 9 | 2% | 13 |
| stelo.PianistNano 1.2 | 6 | 2% | 11 |
| matt.advanced.Katana 1.0 | 4 | 1% | 16 |

## Melee bench: F29

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 73.5 | 169 / 700 | 3.38 | 13.8% | 53500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.4% | 244 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.2% | 171 |
| hadur117.nano.SanaroB4K8 0.3 | 3.0 | 13.8% | 169 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 38 |
| jok.PheonixM 0.1.2 | 4.8 | 11.2% | 34 |
| DBall.Anarchy 0.1 | 6.5 | 8.1% | 36 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.2% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.5% | 6 |
| jangs.ns51 1.0 | 9.5 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.3 | 10 / 35 | 2770 |
| 2 | 2 | 64.4 | 83.8 | 9 / 35 | 2849 |
| 3 | 3 | 57.7 | 64.8 | 3 / 35 | 2778 |
| 4 | 3 | 61.7 | 74.9 | 10 / 35 | 2740 |
| 5 | 3 | 60.4 | 73.7 | 7 / 35 | 2436 |
| 6 | 3 | 61.2 | 71.7 | 10 / 35 | 3124 |
| 7 | 3 | 60.3 | 71.4 | 8 / 35 | 2557 |
| 8 | 3 | 60.1 | 72.1 | 6 / 35 | 2476 |
| 9 | 3 | 63.6 | 82.5 | 7 / 35 | 2628 |
| 10 | 5 | 56.7 | 62.5 | 6 / 35 | 2415 |
| 11 | 3 | 61.9 | 75.6 | 8 / 35 | 2913 |
| 12 | 3 | 61.1 | 73.7 | 9 / 35 | 2634 |
| 13 | 4 | 58.5 | 66.3 | 8 / 35 | 2370 |
| 14 | 3 | 61.5 | 75.9 | 9 / 35 | 2650 |
| 15 | 3 | 60.1 | 69.2 | 9 / 35 | 2741 |
| 16 | 4 | 61.1 | 74.0 | 8 / 35 | 2819 |
| 17 | 1 | 64.3 | 81.6 | 13 / 35 | 2727 |
| 18 | 2 | 61.4 | 75.6 | 9 / 35 | 2408 |
| 19 | 2 | 63.7 | 79.4 | 14 / 35 | 2946 |
| 20 | 3 | 59.3 | 68.6 | 6 / 35 | 2519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 150 | 13% |
| zyx.mega.YersiniaPestis 3.1 | 102 | 58% |
| myl.micro.Troodon 1.10 | 55 | 80% |
| DBall.Anarchy 0.1 | 39 | 64% |
| jok.PheonixM 0.1.2 | 30 | 57% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 50% |

Hadur died in 534 of 700 rounds, at a mean tick of 1448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 261 | 49% | 284 |
| zyx.mega.YersiniaPestis 3.1 | 92 | 17% | 148 |
| myl.micro.Troodon 1.10 | 56 | 10% | 93 |
| jok.PheonixM 0.1.2 | 53 | 10% | 73 |
| ph.melee.ArcherME 0.3 | 26 | 5% | 27 |
| DBall.Anarchy 0.1 | 25 | 5% | 53 |
| fullsail.TimbotNoPrediction 1.0 | 13 | 2% | 14 |
| jangs.ns51 1.0 | 6 | 1% | 8 |
| ap.Frederick 1.1 | 1 | 0% | 0 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 63.1 | 103 / 700 | 3.95 | 12.4% | 42514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.7 | 16.5% | 225 |
| stelo.PastFuture 2.3.2 | 2.0 | 15.9% | 129 |
| oog.melee.Capulet 1.2 | 2.4 | 15.6% | 153 |
| hadur117.nano.SanaroB4K8 0.3 | 4.0 | 12.4% | 103 |
| intruder.PrairieWolf 2.61 | 5.6 | 10.1% | 49 |
| tripphippy.Alice 1.1 | 6.3 | 9.2% | 20 |
| ntc.Opposite 1.5 | 6.9 | 8.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 8.6% | 21 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 61.8 | 5 / 35 | 1828 |
| 2 | 4 | 55.0 | 63.9 | 6 / 35 | 1949 |
| 3 | 5 | 52.7 | 57.5 | 2 / 35 | 1994 |
| 4 | 4 | 54.3 | 61.8 | 4 / 35 | 2131 |
| 5 | 2 | 58.4 | 72.1 | 11 / 35 | 1979 |
| 6 | 4 | 58.6 | 69.6 | 5 / 35 | 2397 |
| 7 | 4 | 53.4 | 59.3 | 2 / 35 | 2439 |
| 8 | 4 | 56.7 | 65.7 | 7 / 35 | 2170 |
| 9 | 4 | 54.9 | 60.7 | 6 / 35 | 2133 |
| 10 | 4 | 59.3 | 73.9 | 9 / 35 | 2076 |
| 11 | 4 | 54.9 | 62.5 | 3 / 35 | 1970 |
| 12 | 5 | 52.8 | 57.1 | 4 / 35 | 2203 |
| 13 | 4 | 53.2 | 61.4 | 2 / 35 | 1867 |
| 14 | 4 | 55.5 | 60.0 | 5 / 35 | 2417 |
| 15 | 4 | 54.8 | 60.7 | 5 / 35 | 2374 |
| 16 | 4 | 56.4 | 65.7 | 4 / 35 | 2233 |
| 17 | 4 | 54.9 | 62.9 | 5 / 35 | 2047 |
| 18 | 4 | 55.5 | 65.0 | 5 / 35 | 2036 |
| 19 | 4 | 54.1 | 60.0 | 5 / 35 | 2090 |
| 20 | 4 | 55.8 | 61.1 | 8 / 35 | 2181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 87 | 25% |
| oog.melee.Capulet 1.2 | 60 | 25% |
| stelo.PastFuture 2.3.2 | 53 | 60% |
| intruder.PrairieWolf 2.61 | 30 | 63% |
| fowl3628800.LightningBolt 2.6.0 | 14 | 79% |
| tripphippy.Alice 1.1 | 8 | 50% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 598 of 700 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 162 | 27% | 183 |
| stelo.PastFuture 2.3.2 | 127 | 21% | 164 |
| oog.melee.Capulet 1.2 | 124 | 21% | 148 |
| ntc.Opposite 1.5 | 54 | 9% | 54 |
| tripphippy.Alice 1.1 | 53 | 9% | 55 |
| fowl3628800.LightningBolt 2.6.0 | 39 | 7% | 40 |
| intruder.PrairieWolf 2.61 | 35 | 6% | 52 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 63.9 | 95 / 700 | 4.25 | 11.3% | 38849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 334 |
| gh.mini.Griezel 0.2 | 2.4 | 14.0% | 157 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 12.5% | 45 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.7% | 47 |
| hadur117.nano.SanaroB4K8 0.3 | 4.3 | 11.3% | 95 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.3% | 18 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.9% | 6 |
| fm.mammillarias 1.3 | 8.0 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.8 | 62.9 | 7 / 35 | 2007 |
| 2 | 4 | 56.5 | 67.9 | 3 / 35 | 1853 |
| 3 | 4 | 54.8 | 61.6 | 8 / 35 | 1710 |
| 4 | 5 | 54.4 | 61.9 | 4 / 35 | 1852 |
| 5 | 3 | 59.8 | 74.0 | 9 / 35 | 2080 |
| 6 | 4 | 56.5 | 65.7 | 3 / 35 | 2100 |
| 7 | 3 | 56.6 | 65.7 | 4 / 35 | 2127 |
| 8 | 5 | 54.8 | 61.6 | 5 / 35 | 1770 |
| 9 | 3 | 58.2 | 70.8 | 3 / 35 | 2050 |
| 10 | 5 | 57.0 | 68.9 | 6 / 35 | 1703 |
| 11 | 5 | 52.7 | 56.5 | 2 / 35 | 1925 |
| 12 | 4 | 56.4 | 67.0 | 6 / 35 | 1859 |
| 13 | 5 | 57.7 | 69.2 | 4 / 35 | 1857 |
| 14 | 5 | 56.1 | 64.1 | 4 / 35 | 2081 |
| 15 | 5 | 51.5 | 53.7 | 2 / 35 | 1968 |
| 16 | 5 | 55.3 | 64.4 | 4 / 35 | 1863 |
| 17 | 6 | 51.1 | 53.3 | 3 / 35 | 1664 |
| 18 | 4 | 53.3 | 57.5 | 4 / 35 | 2165 |
| 19 | 4 | 54.9 | 61.3 | 8 / 35 | 1851 |
| 20 | 3 | 58.8 | 69.8 | 6 / 35 | 2364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 100 | 43% |
| abc.Shadow 3.84i | 98 | 40% |
| d414.nano.Quantum 1.0.0 | 24 | 21% |
| spinnercat.micro.Tyger 0.1 | 19 | 5% |
| gh.nano.Grofvuil 0.2 | 5 | 60% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 605 of 700 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 141 | 23% | 178 |
| gh.mini.Griezel 0.2 | 139 | 23% | 181 |
| spinnercat.micro.Tyger 0.1 | 101 | 17% | 104 |
| d414.nano.Quantum 1.0.0 | 88 | 15% | 97 |
| gh.nano.Grofvuil 0.2 | 51 | 8% | 54 |
| fm.mammillarias 1.3 | 40 | 7% | 40 |
| timmit.nano.TimDog 0.33 | 25 | 4% | 26 |
| Gecko.ultimateGeckoBot 1.0 | 15 | 2% | 15 |
| tlp.ThreeLeggedPig 1 | 5 | 1% | 5 |

## Melee bench: F32

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 80.2 | 295 / 700 | 2.79 | 14.9% | 54625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.4% | 192 |
| hadur117.nano.SanaroB4K8 0.3 | 1.6 | 14.9% | 295 |
| apc.botM 3.0 | 3.2 | 12.4% | 88 |
| lxx.ConceptA 0.8 | 4.4 | 10.8% | 9 |
| vjik.UnViolation 1.1 | 4.5 | 10.6% | 51 |
| bayen.UbaMicro 1.4 | 6.1 | 9.2% | 16 |
| panzer.Panzer 0.2 | 7.2 | 7.8% | 6 |
| yk.JahMicro 1.0 | 7.9 | 7.0% | 21 |
| conscience.Electron 1.3g | 8.9 | 6.5% | 5 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 18 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 84.8 | 17 / 35 | 2898 |
| 2 | 1 | 61.9 | 81.0 | 14 / 35 | 2527 |
| 3 | 2 | 62.9 | 82.5 | 14 / 35 | 2697 |
| 4 | 2 | 62.1 | 78.4 | 14 / 35 | 2734 |
| 5 | 1 | 60.7 | 76.8 | 15 / 35 | 2373 |
| 6 | 1 | 64.1 | 82.5 | 23 / 35 | 2774 |
| 7 | 1 | 62.8 | 82.2 | 13 / 35 | 2981 |
| 8 | 3 | 61.2 | 78.7 | 12 / 35 | 2709 |
| 9 | 2 | 60.1 | 74.9 | 12 / 35 | 2624 |
| 10 | 1 | 59.9 | 72.7 | 12 / 35 | 2809 |
| 11 | 1 | 65.3 | 86.3 | 21 / 35 | 3154 |
| 12 | 2 | 59.2 | 73.3 | 10 / 35 | 2504 |
| 13 | 2 | 59.9 | 76.5 | 13 / 35 | 2380 |
| 14 | 2 | 60.9 | 77.8 | 11 / 35 | 2774 |
| 15 | 2 | 59.7 | 74.9 | 12 / 35 | 2446 |
| 16 | 1 | 65.3 | 87.9 | 20 / 35 | 2976 |
| 17 | 2 | 61.7 | 78.7 | 13 / 35 | 2666 |
| 18 | 2 | 63.2 | 84.1 | 16 / 35 | 2753 |
| 19 | 2 | 63.1 | 83.2 | 15 / 35 | 2681 |
| 20 | 1 | 64.5 | 85.7 | 18 / 35 | 3165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 216 | 61% |
| apc.botM 3.0 | 89 | 65% |
| vjik.UnViolation 1.1 | 43 | 70% |
| lxx.ConceptA 0.8 | 34 | 100% |
| yk.JahMicro 1.0 | 28 | 68% |
| donjezza.Jezza 1.0 | 24 | 38% |
| bayen.UbaMicro 1.4 | 15 | 47% |
| panzer.Panzer 0.2 | 8 | 75% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 407 of 700 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 139 | 34% | 279 |
| lxx.ConceptA 0.8 | 74 | 18% | 96 |
| apc.botM 3.0 | 59 | 14% | 122 |
| bayen.UbaMicro 1.4 | 32 | 8% | 40 |
| vjik.UnViolation 1.1 | 30 | 7% | 67 |
| panzer.Panzer 0.2 | 25 | 6% | 26 |
| yk.JahMicro 1.0 | 17 | 4% | 28 |
| donjezza.Jezza 1.0 | 16 | 4% | 25 |
| conscience.Electron 1.3g | 15 | 4% | 17 |

## Melee bench: F33

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.1 | 221 / 700 | 2.75 | 16.2% | 55644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.1 | 19.2% | 197 |
| hadur117.nano.SanaroB4K8 0.3 | 2.2 | 16.2% | 221 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.7% | 178 |
| labg.Cataclysm 2.05 | 4.1 | 12.9% | 75 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.3 | 10.3% | 27 |
| baal.nano.N 1.42 | 5.7 | 9.6% | 4 |
| zyx.micro.Ant 1.1 | 7.2 | 6.4% | 0 |
| sanja.First 0.1 | 8.0 | 5.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 73.9 | 10 / 35 | 2707 |
| 2 | 3 | 60.2 | 72.1 | 7 / 35 | 2709 |
| 3 | 2 | 64.4 | 81.8 | 14 / 35 | 2771 |
| 4 | 2 | 62.5 | 78.2 | 10 / 35 | 2807 |
| 5 | 3 | 59.2 | 68.9 | 5 / 35 | 2495 |
| 6 | 2 | 62.5 | 78.2 | 8 / 35 | 2790 |
| 7 | 2 | 64.1 | 80.7 | 17 / 35 | 2883 |
| 8 | 2 | 63.7 | 79.6 | 15 / 35 | 2832 |
| 9 | 2 | 64.5 | 82.1 | 13 / 35 | 2951 |
| 10 | 2 | 65.1 | 83.6 | 15 / 35 | 2890 |
| 11 | 2 | 62.0 | 76.4 | 12 / 35 | 2688 |
| 12 | 2 | 62.3 | 77.5 | 10 / 35 | 2541 |
| 13 | 2 | 61.2 | 73.9 | 9 / 35 | 2863 |
| 14 | 3 | 62.2 | 78.2 | 9 / 35 | 2699 |
| 15 | 2 | 62.1 | 79.3 | 10 / 35 | 2507 |
| 16 | 2 | 63.1 | 77.9 | 11 / 35 | 2775 |
| 17 | 1 | 66.8 | 89.3 | 18 / 35 | 3160 |
| 18 | 3 | 60.8 | 72.5 | 7 / 35 | 2622 |
| 19 | 3 | 63.0 | 77.9 | 10 / 35 | 2999 |
| 20 | 2 | 63.4 | 80.0 | 11 / 35 | 2955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 173 | 61% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 164 | 22% |
| labg.Cataclysm 2.05 | 56 | 61% |
| kinsen.melee.Angsaichmophobia 1.8c | 30 | 83% |
| baal.nano.N 1.42 | 8 | 100% |
| sanja.First 0.1 | 6 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 481 of 700 rounds, at a mean tick of 1631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 182 | 38% | 301 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 176 | 37% | 217 |
| kinsen.melee.Angsaichmophobia 1.8c | 41 | 9% | 46 |
| labg.Cataclysm 2.05 | 40 | 8% | 75 |
| baal.nano.N 1.42 | 22 | 5% | 31 |
| zyx.micro.Ant 1.1 | 13 | 3% | 15 |
| sanja.First 0.1 | 5 | 1% | 11 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 0% | 2 |

## Melee bench: F34

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.7 | 172 / 700 | 3.09 | 13.9% | 56390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.2% | 239 |
| kid.Gladiator .7.2 | 1.5 | 17.5% | 194 |
| hadur117.nano.SanaroB4K8 0.3 | 3.0 | 13.9% | 172 |
| jcs.Seth 1.8 | 4.5 | 11.5% | 55 |
| tcf.Reach 3 | 4.8 | 11.2% | 29 |
| cli.Dancer 1.1 | 5.8 | 10.0% | 10 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 5 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 80.3 | 10 / 35 | 3138 |
| 2 | 3 | 62.4 | 75.9 | 10 / 35 | 2962 |
| 3 | 3 | 60.6 | 73.0 | 8 / 35 | 2392 |
| 4 | 3 | 61.6 | 76.2 | 7 / 35 | 2735 |
| 5 | 3 | 61.0 | 73.7 | 4 / 35 | 2765 |
| 6 | 3 | 62.0 | 77.1 | 11 / 35 | 2720 |
| 7 | 3 | 63.2 | 76.8 | 11 / 35 | 3104 |
| 8 | 3 | 61.5 | 76.8 | 4 / 35 | 3007 |
| 9 | 3 | 62.5 | 75.9 | 11 / 35 | 2981 |
| 10 | 3 | 62.0 | 77.8 | 9 / 35 | 2408 |
| 11 | 3 | 62.7 | 79.4 | 9 / 35 | 2526 |
| 12 | 3 | 61.4 | 76.2 | 8 / 35 | 2588 |
| 13 | 3 | 62.3 | 79.0 | 9 / 35 | 2513 |
| 14 | 3 | 61.3 | 74.9 | 6 / 35 | 2834 |
| 15 | 3 | 64.7 | 82.5 | 9 / 35 | 3362 |
| 16 | 3 | 61.9 | 76.5 | 8 / 35 | 2700 |
| 17 | 3 | 60.6 | 72.7 | 8 / 35 | 2631 |
| 18 | 3 | 62.8 | 78.7 | 11 / 35 | 2755 |
| 19 | 3 | 62.3 | 74.3 | 8 / 35 | 3000 |
| 20 | 3 | 63.1 | 77.1 | 11 / 35 | 3269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 137 | 39% |
| stelo.Spread 0.9 | 120 | 57% |
| jcs.Seth 1.8 | 47 | 74% |
| tcf.Reach 3 | 18 | 50% |
| cli.Dancer 1.1 | 12 | 33% |
| ratosh.Wesco 1.4 | 5 | 40% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 531 of 700 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 248 | 47% | 277 |
| stelo.Spread 0.9 | 149 | 28% | 235 |
| jcs.Seth 1.8 | 45 | 8% | 84 |
| tcf.Reach 3 | 41 | 8% | 49 |
| cli.Dancer 1.1 | 20 | 4% | 28 |
| ratosh.Wesco 1.4 | 17 | 3% | 19 |
| amk.Punbot.Punbot 0.01 | 5 | 1% | 5 |
| sample.VelociRobot 1.0 | 3 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 0% | 0 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 71.1 | 62 / 700 | 3.60 | 12.3% | 43366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 533 |
| gh.mini.Gruwel 0.9 | 2.3 | 13.8% | 64 |
| rz.HawkOnFire 0.1 | 3.9 | 12.2% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 12.2% | 29 |
| hadur117.nano.SanaroB4K8 0.3 | 4.0 | 12.3% | 62 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.8% | 0 |
| wit.Chuliath 1.0 | 6.9 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.6% | 0 |
| dans.Cinnamon 1.2 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 71.7 | 5 / 35 | 2175 |
| 2 | 3 | 61.0 | 76.5 | 6 / 35 | 2415 |
| 3 | 2 | 59.8 | 75.2 | 2 / 35 | 2245 |
| 4 | 4 | 57.7 | 68.3 | 2 / 35 | 2223 |
| 5 | 3 | 59.6 | 72.4 | 5 / 35 | 2428 |
| 6 | 3 | 60.7 | 77.5 | 3 / 35 | 2231 |
| 7 | 3 | 59.4 | 74.6 | 4 / 35 | 2044 |
| 8 | 4 | 58.6 | 69.8 | 2 / 35 | 2222 |
| 9 | 5 | 57.5 | 67.9 | 5 / 35 | 2086 |
| 10 | 4 | 58.9 | 72.4 | 3 / 35 | 2090 |
| 11 | 4 | 58.4 | 70.5 | 5 / 35 | 2133 |
| 12 | 3 | 61.4 | 80.3 | 6 / 35 | 2178 |
| 13 | 5 | 57.6 | 71.1 | 2 / 35 | 1871 |
| 14 | 4 | 58.7 | 72.4 | 3 / 35 | 2240 |
| 15 | 4 | 58.5 | 66.7 | 3 / 35 | 2651 |
| 16 | 5 | 57.8 | 69.5 | 1 / 35 | 2061 |
| 17 | 5 | 55.7 | 65.1 | 0 / 35 | 1848 |
| 18 | 5 | 58.1 | 68.6 | 2 / 35 | 2372 |
| 19 | 5 | 55.7 | 66.7 | 1 / 35 | 1668 |
| 20 | 5 | 56.8 | 64.8 | 2 / 35 | 2185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 193 | 3% |
| gh.mini.Gruwel 0.9 | 57 | 58% |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 61% |
| rz.HawkOnFire 0.1 | 16 | 69% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 638 of 700 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 281 | 44% | 286 |
| gh.mini.Gruwel 0.9 | 127 | 20% | 162 |
| rz.HawkOnFire 0.1 | 88 | 14% | 97 |
| dmh.robocode.robot.BlackDeath 9.2 | 86 | 13% | 98 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 17 | 3% | 17 |
| myl.nano.KomoriNinja 1.1 | 15 | 2% | 15 |
| wit.Chuliath 1.0 | 13 | 2% | 14 |
| dans.Cinnamon 1.2 | 7 | 1% | 7 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 82.1 | 353 / 700 | 2.61 | 16.1% | 62730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB4K8 0.3 | 1.0 | 16.1% | 353 |
| bzdp.Pansy 2.1 | 2.8 | 12.8% | 95 |
| alpha.RainingFire 1.0 | 2.8 | 12.4% | 78 |
| mz.Cork 0.1 | 4.2 | 11.6% | 57 |
| bvh.micro.Freya 0.3 | 4.5 | 11.2% | 46 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.5% | 34 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.5% | 18 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.4% | 4 |
| dl.BetterWalls 1.0 | 8.6 | 6.3% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 77.5 | 16 / 35 | 2850 |
| 2 | 1 | 67.6 | 91.4 | 25 / 35 | 3255 |
| 3 | 1 | 64.2 | 83.5 | 18 / 35 | 3091 |
| 4 | 1 | 63.0 | 76.2 | 15 / 35 | 3330 |
| 5 | 1 | 63.0 | 77.8 | 16 / 35 | 3023 |
| 6 | 1 | 64.9 | 86.3 | 18 / 35 | 2965 |
| 7 | 1 | 63.2 | 76.2 | 16 / 35 | 3514 |
| 8 | 1 | 62.9 | 81.3 | 15 / 35 | 2800 |
| 9 | 1 | 64.0 | 80.6 | 20 / 35 | 3045 |
| 10 | 1 | 61.9 | 74.6 | 13 / 35 | 3342 |
| 11 | 1 | 66.1 | 88.3 | 18 / 35 | 3334 |
| 12 | 1 | 63.0 | 79.0 | 13 / 35 | 3087 |
| 13 | 1 | 66.2 | 87.0 | 23 / 35 | 3161 |
| 14 | 1 | 65.1 | 86.0 | 16 / 35 | 3237 |
| 15 | 1 | 62.7 | 77.8 | 15 / 35 | 3093 |
| 16 | 1 | 63.0 | 79.7 | 17 / 35 | 2889 |
| 17 | 1 | 65.0 | 84.1 | 18 / 35 | 3013 |
| 18 | 1 | 64.4 | 82.5 | 19 / 35 | 3029 |
| 19 | 1 | 66.6 | 86.7 | 21 / 35 | 3522 |
| 20 | 1 | 65.3 | 84.8 | 21 / 35 | 3150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 112 | 65% |
| mz.Cork 0.1 | 91 | 87% |
| alpha.RainingFire 1.0 | 87 | 72% |
| bvh.micro.Freya 0.3 | 80 | 85% |
| m3thos.Eva02 0.7.1 | 46 | 72% |
| bvh.mini.Fenrir 0.39 | 35 | 80% |
| sample.MyFirstRobot 1.0 | 9 | 56% |
| squidM.TentalceMeleeNano 1.1 | 4 | 25% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 348 of 700 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 89 | 26% | 185 |
| alpha.RainingFire 1.0 | 84 | 24% | 147 |
| mz.Cork 0.1 | 46 | 13% | 116 |
| bvh.mini.Fenrir 0.39 | 37 | 11% | 51 |
| m3thos.Eva02 0.7.1 | 32 | 9% | 67 |
| bvh.micro.Freya 0.3 | 30 | 9% | 74 |
| squidM.TentalceMeleeNano 1.1 | 16 | 5% | 21 |
| dl.BetterWalls 1.0 | 7 | 2% | 24 |
| sample.MyFirstRobot 1.0 | 6 | 2% | 15 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 81.3 | 304 / 700 | 2.69 | 15.6% | 74666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB4K8 0.3 | 1.0 | 15.6% | 304 |
| germ.TheMind .2 | 2.8 | 11.7% | 97 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 10.6% | 54 |
| EBBU.Sim2 1.02 | 4.0 | 10.4% | 48 |
| agrach.Dalek 1.0 | 5.5 | 9.4% | 63 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.9% | 36 |
| mb.Beast 0.1 | 7.0 | 8.8% | 47 |
| lmk.ACPFinal 0.1 | 7.5 | 8.6% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 8.1% | 1 |
| skm.Ryubot 1.0 | 8.5 | 7.9% | 37 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 79.0 | 14 / 35 | 3929 |
| 2 | 1 | 60.9 | 77.8 | 11 / 35 | 3559 |
| 3 | 1 | 63.1 | 83.8 | 17 / 35 | 3600 |
| 4 | 1 | 63.7 | 84.8 | 17 / 35 | 3702 |
| 5 | 1 | 57.7 | 68.6 | 10 / 35 | 3504 |
| 6 | 1 | 64.6 | 86.0 | 19 / 35 | 3994 |
| 7 | 1 | 63.1 | 82.5 | 18 / 35 | 3738 |
| 8 | 1 | 64.1 | 86.3 | 17 / 35 | 3862 |
| 9 | 1 | 63.2 | 83.5 | 12 / 35 | 4090 |
| 10 | 1 | 62.9 | 81.3 | 18 / 35 | 3640 |
| 11 | 1 | 63.2 | 81.0 | 17 / 35 | 3828 |
| 12 | 1 | 63.3 | 81.0 | 15 / 35 | 4218 |
| 13 | 1 | 63.0 | 84.4 | 11 / 35 | 3796 |
| 14 | 1 | 61.6 | 78.7 | 16 / 35 | 3378 |
| 15 | 1 | 64.1 | 87.6 | 16 / 35 | 3637 |
| 16 | 1 | 59.3 | 73.0 | 11 / 35 | 3473 |
| 17 | 1 | 62.0 | 79.7 | 19 / 35 | 3293 |
| 18 | 1 | 63.6 | 80.6 | 17 / 35 | 4313 |
| 19 | 1 | 60.3 | 76.2 | 12 / 35 | 3369 |
| 20 | 1 | 64.7 | 89.2 | 17 / 35 | 3743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 95 | 63% |
| EBBU.Sim2 1.02 | 67 | 55% |
| mb.Beast 0.1 | 59 | 80% |
| agrach.Dalek 1.0 | 51 | 65% |
| skm.Ryubot 1.0 | 49 | 49% |
| stelo.UntouchableNano 1.3 | 49 | 84% |
| com.syncleus.robocode.Dreadnaught 0.1 | 46 | 63% |
| lmk.ACPFinal 0.1 | 33 | 85% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 100% |

Hadur died in 403 of 700 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 84 | 21% | 137 |
| EBBU.Sim2 1.02 | 63 | 16% | 94 |
| com.syncleus.robocode.Dreadnaught 0.1 | 59 | 15% | 97 |
| agrach.Dalek 1.0 | 44 | 11% | 100 |
| lmk.ACPFinal 0.1 | 38 | 9% | 61 |
| skm.Ryubot 1.0 | 33 | 8% | 52 |
| mb.Beast 0.1 | 30 | 7% | 78 |
| stelo.UntouchableNano 1.3 | 29 | 7% | 51 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 6% | 26 |

## Melee bench: F38

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 69.6 | 120 / 700 | 3.73 | 12.4% | 47971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 286 |
| bvh.mini.Freya 0.55 | 2.7 | 13.0% | 56 |
| hadur117.nano.SanaroB4K8 0.3 | 3.2 | 12.4% | 120 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.6% | 105 |
| cs.Wren 1.0 | 4.9 | 11.1% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.9 | 10.4% | 46 |
| kdf.KoulDestroyer 1.0 | 6.4 | 9.5% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.4% | 16 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.4% | 3 |
| bzdp.BoxCar 2.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.7 | 72.1 | 6 / 35 | 2446 |
| 2 | 5 | 56.7 | 65.7 | 5 / 35 | 2394 |
| 3 | 2 | 58.3 | 70.2 | 6 / 35 | 2403 |
| 4 | 2 | 62.3 | 79.0 | 9 / 35 | 2705 |
| 5 | 2 | 58.5 | 68.9 | 10 / 35 | 2458 |
| 6 | 4 | 56.3 | 64.8 | 10 / 35 | 2072 |
| 7 | 5 | 56.4 | 65.1 | 6 / 35 | 2425 |
| 8 | 2 | 58.4 | 71.7 | 4 / 35 | 2212 |
| 9 | 3 | 59.1 | 72.1 | 8 / 35 | 2464 |
| 10 | 5 | 55.4 | 64.1 | 4 / 35 | 2147 |
| 11 | 2 | 59.2 | 75.2 | 6 / 35 | 2397 |
| 12 | 2 | 59.5 | 73.3 | 5 / 35 | 2564 |
| 13 | 3 | 60.0 | 74.0 | 7 / 35 | 2791 |
| 14 | 3 | 57.3 | 67.9 | 3 / 35 | 2545 |
| 15 | 2 | 61.3 | 78.4 | 8 / 35 | 2588 |
| 16 | 4 | 57.4 | 68.3 | 6 / 35 | 2177 |
| 17 | 6 | 51.5 | 54.9 | 3 / 35 | 2009 |
| 18 | 4 | 57.5 | 68.3 | 5 / 35 | 2321 |
| 19 | 3 | 58.5 | 68.9 | 7 / 35 | 2671 |
| 20 | 3 | 56.7 | 69.8 | 2 / 35 | 2182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 130 | 48% |
| bts.mega.Gnarly 1.4 | 47 | 26% |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 21% |
| cs.Wren 1.0 | 25 | 40% |
| bvh.mini.Freya 0.55 | 22 | 64% |
| kdf.KoulDestroyer 1.0 | 14 | 64% |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 71% |
| matt.UnderDark3 2.4.34 | 2 | 50% |

Hadur died in 581 of 700 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 174 | 30% | 242 |
| bts.mega.Gnarly 1.4 | 89 | 15% | 102 |
| bvh.mini.Freya 0.55 | 81 | 14% | 89 |
| davidalves.net.DuelistNanoMelee 1.01 | 77 | 13% | 87 |
| cs.Wren 1.0 | 68 | 12% | 75 |
| kdf.KoulDestroyer 1.0 | 53 | 9% | 60 |
| bzdp.BoxCar 2.0 | 16 | 3% | 16 |
| matt.UnderDark3 2.4.34 | 13 | 2% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 2% | 15 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 70.6 | 94 / 700 | 3.35 | 13.6% | 48630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 18.5% | 195 |
| az.Ololobot 0.2.4 | 2.2 | 16.0% | 295 |
| hadur117.nano.SanaroB4K8 0.3 | 3.0 | 13.6% | 94 |
| stelo.SoRobotNanoMelee 1.2 | 4.4 | 11.0% | 71 |
| apollokidd.ApolloKidd 0.9 | 5.0 | 10.3% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.9 | 9.5% | 15 |
| gimp.GimpBot 0.1 | 6.7 | 8.9% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.1 | 6.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.9 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.3 | 63.9 | 2 / 35 | 2551 |
| 2 | 3 | 54.9 | 64.3 | 2 / 35 | 2471 |
| 3 | 3 | 57.5 | 69.3 | 4 / 35 | 2748 |
| 4 | 3 | 57.4 | 70.7 | 3 / 35 | 2569 |
| 5 | 3 | 58.3 | 72.9 | 6 / 35 | 2462 |
| 6 | 2 | 60.6 | 78.2 | 12 / 35 | 2595 |
| 7 | 3 | 57.4 | 73.6 | 5 / 35 | 2188 |
| 8 | 3 | 57.6 | 69.6 | 6 / 35 | 2500 |
| 9 | 3 | 55.1 | 66.8 | 0 / 35 | 2298 |
| 10 | 4 | 56.7 | 71.1 | 3 / 35 | 2132 |
| 11 | 3 | 56.2 | 69.3 | 7 / 35 | 2191 |
| 12 | 3 | 59.1 | 74.3 | 5 / 35 | 2759 |
| 13 | 4 | 54.8 | 64.6 | 3 / 35 | 2183 |
| 14 | 4 | 55.4 | 66.4 | 5 / 35 | 2209 |
| 15 | 3 | 59.9 | 77.1 | 6 / 35 | 2569 |
| 16 | 2 | 58.9 | 74.3 | 5 / 35 | 2760 |
| 17 | 3 | 58.8 | 74.3 | 4 / 35 | 2721 |
| 18 | 2 | 58.5 | 75.4 | 6 / 35 | 2370 |
| 19 | 3 | 56.6 | 69.3 | 5 / 35 | 2460 |
| 20 | 3 | 54.9 | 67.5 | 5 / 35 | 1894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 149 | 7% |
| bvh.fry.Freya 0.82 | 119 | 31% |
| stelo.SoRobotNanoMelee 1.2 | 39 | 44% |
| winamp32.micro.MicroMacro 1.0 | 20 | 85% |
| gimp.GimpBot 0.1 | 11 | 73% |
| apollokidd.ApolloKidd 0.9 | 8 | 25% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 607 of 700 rounds, at a mean tick of 1372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 221 | 36% | 252 |
| az.Ololobot 0.2.4 | 175 | 29% | 187 |
| apollokidd.ApolloKidd 0.9 | 80 | 13% | 85 |
| stelo.SoRobotNanoMelee 1.2 | 78 | 13% | 87 |
| winamp32.micro.MicroMacro 1.0 | 23 | 4% | 46 |
| gimp.GimpBot 0.1 | 20 | 3% | 30 |
| dcs.Eater_of_Worlds 1.1.3-A | 7 | 1% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 0% | 4 |

## Melee bench: F41

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 77.7 | 278 / 700 | 3.01 | 14.4% | 48760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 16.6% | 247 |
| hadur117.nano.SanaroB4K8 0.3 | 2.1 | 14.4% | 278 |
| ary.Swarm 1.1 | 3.2 | 13.3% | 45 |
| lessonz.robocode.Oz 0.5.0 | 4.1 | 12.4% | 54 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.9% | 62 |
| shrub.Silver v048 | 6.2 | 9.2% | 10 |
| zyx.nano.Ant 1.1 | 7.0 | 8.0% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.0% | 5 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 76.8 | 15 / 35 | 2521 |
| 2 | 2 | 61.9 | 75.9 | 14 / 35 | 2473 |
| 3 | 2 | 63.9 | 84.8 | 15 / 35 | 2378 |
| 4 | 2 | 63.3 | 82.5 | 16 / 35 | 2184 |
| 5 | 1 | 60.5 | 74.9 | 15 / 35 | 2085 |
| 6 | 2 | 64.9 | 84.8 | 17 / 35 | 2640 |
| 7 | 2 | 62.8 | 81.3 | 14 / 35 | 2382 |
| 8 | 4 | 59.6 | 72.4 | 8 / 35 | 2213 |
| 9 | 2 | 63.4 | 81.6 | 16 / 35 | 2444 |
| 10 | 2 | 61.1 | 76.8 | 10 / 35 | 2468 |
| 11 | 2 | 62.1 | 74.0 | 16 / 35 | 2719 |
| 12 | 2 | 60.7 | 74.3 | 11 / 35 | 2390 |
| 13 | 2 | 62.5 | 79.4 | 14 / 35 | 2400 |
| 14 | 2 | 62.9 | 78.7 | 12 / 35 | 2746 |
| 15 | 2 | 62.5 | 79.7 | 17 / 35 | 2095 |
| 16 | 2 | 62.3 | 75.9 | 15 / 35 | 2665 |
| 17 | 2 | 62.1 | 77.5 | 13 / 35 | 2327 |
| 18 | 3 | 59.7 | 69.5 | 10 / 35 | 2255 |
| 19 | 2 | 63.1 | 77.5 | 15 / 35 | 2687 |
| 20 | 2 | 61.6 | 74.9 | 15 / 35 | 2688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 229 | 56% |
| lessonz.robocode.Oz 0.5.0 | 62 | 79% |
| ary.Swarm 1.1 | 58 | 95% |
| simonton.nano.MeleeSeed 1.8 | 40 | 75% |
| shrub.Silver v048 | 9 | 56% |
| jsal.Jsalbot 1.0 | 8 | 88% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 426 of 700 rounds, at a mean tick of 1162. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 161 | 38% | 288 |
| ary.Swarm 1.1 | 85 | 20% | 148 |
| simonton.nano.MeleeSeed 1.8 | 67 | 16% | 99 |
| lessonz.robocode.Oz 0.5.0 | 49 | 12% | 84 |
| zyx.nano.Ant 1.1 | 24 | 6% | 26 |
| shrub.Silver v048 | 20 | 5% | 23 |
| acogdev.alpha 0.2 | 8 | 2% | 8 |
| stelo.Mirror 1.1 | 5 | 1% | 9 |
| jsal.Jsalbot 1.0 | 4 | 1% | 12 |
3 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 75.7 | 197 / 700 | 3.19 | 14.0% | 58168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 306 |
| ara.Shera 0.88 | 2.9 | 14.2% | 116 |
| hadur117.nano.SanaroB4K8 0.3 | 2.9 | 14.0% | 197 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.9% | 56 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 8 |
| maribo.IotaCT 1.1 | 6.4 | 7.6% | 4 |
| dsw.StaticD 1.0 | 6.7 | 7.2% | 11 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.5% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.1 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 80.0 | 10 / 35 | 2848 |
| 2 | 4 | 58.4 | 67.0 | 6 / 35 | 2993 |
| 3 | 3 | 60.5 | 74.3 | 7 / 35 | 2919 |
| 4 | 3 | 60.6 | 74.0 | 7 / 35 | 2900 |
| 5 | 3 | 61.2 | 76.5 | 9 / 35 | 2874 |
| 6 | 2 | 63.0 | 79.0 | 12 / 35 | 3157 |
| 7 | 3 | 60.8 | 76.2 | 9 / 35 | 2711 |
| 8 | 4 | 57.5 | 64.8 | 9 / 35 | 2555 |
| 9 | 3 | 61.1 | 76.8 | 7 / 35 | 2928 |
| 10 | 2 | 62.7 | 79.0 | 13 / 35 | 3054 |
| 11 | 2 | 63.5 | 82.9 | 13 / 35 | 2910 |
| 12 | 4 | 60.6 | 74.3 | 7 / 35 | 2830 |
| 13 | 3 | 62.1 | 78.1 | 12 / 35 | 2742 |
| 14 | 4 | 61.9 | 76.5 | 11 / 35 | 3207 |
| 15 | 2 | 61.3 | 72.7 | 10 / 35 | 3290 |
| 16 | 2 | 62.6 | 79.0 | 12 / 35 | 3060 |
| 17 | 2 | 63.4 | 83.2 | 15 / 35 | 2893 |
| 18 | 2 | 61.6 | 76.8 | 12 / 35 | 2901 |
| 19 | 3 | 60.5 | 75.2 | 9 / 35 | 2836 |
| 20 | 4 | 57.9 | 67.9 | 7 / 35 | 2560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 203 | 44% |
| ara.Shera 0.88 | 79 | 67% |
| maribo.mini.MiniQuester 0.1 | 57 | 77% |
| dsw.StaticD 1.0 | 8 | 75% |
| maribo.IotaCT 1.1 | 4 | 50% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% |

Hadur died in 504 of 700 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 203 | 40% | 290 |
| ara.Shera 0.88 | 116 | 23% | 167 |
| maribo.mini.MiniQuester 0.1 | 110 | 22% | 158 |
| amz.NanoClone 1.41 | 27 | 5% | 27 |
| dsw.StaticD 1.0 | 13 | 3% | 19 |
| maribo.IotaCT 1.1 | 13 | 3% | 15 |
| stelo.MirrorMicro 1.0 | 9 | 2% | 10 |
| mme.NikeEnhanced 2.0 | 7 | 1% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 1% | 6 |

## Melee bench: F43

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 64.6 | 75 / 700 | 4.18 | 11.3% | 41925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 522 |
| brainfade.melee.Dusk 0.44 | 2.4 | 12.9% | 57 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.4% | 16 |
| hadur117.nano.SanaroB4K8 0.3 | 4.3 | 11.3% | 75 |
| wcsv.melee.EngineerMelee 0.1 | 4.4 | 11.3% | 16 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 10.0% | 12 |
| jab.DiamondStealer 5 | 7.4 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.4 | 63.5 | 3 / 35 | 1830 |
| 2 | 6 | 55.5 | 60.0 | 3 / 35 | 1846 |
| 3 | 4 | 58.4 | 66.0 | 3 / 35 | 2099 |
| 4 | 4 | 58.0 | 65.1 | 4 / 35 | 2235 |
| 5 | 4 | 59.0 | 67.3 | 4 / 35 | 2019 |
| 6 | 4 | 58.0 | 64.4 | 5 / 35 | 2306 |
| 7 | 4 | 56.8 | 62.9 | 3 / 35 | 2070 |
| 8 | 5 | 56.3 | 60.6 | 4 / 35 | 1839 |
| 9 | 2 | 62.1 | 76.8 | 12 / 35 | 1970 |
| 10 | 3 | 59.3 | 67.6 | 2 / 35 | 2408 |
| 11 | 6 | 55.2 | 58.4 | 4 / 35 | 1826 |
| 12 | 4 | 58.3 | 65.7 | 4 / 35 | 2187 |
| 13 | 4 | 59.1 | 69.2 | 5 / 35 | 2098 |
| 14 | 3 | 57.9 | 64.8 | 4 / 35 | 2229 |
| 15 | 5 | 56.6 | 62.2 | 2 / 35 | 2158 |
| 16 | 4 | 57.2 | 61.3 | 1 / 35 | 2306 |
| 17 | 5 | 56.0 | 61.9 | 1 / 35 | 2039 |
| 18 | 4 | 58.5 | 65.1 | 4 / 35 | 2298 |
| 19 | 5 | 57.7 | 65.4 | 2 / 35 | 2088 |
| 20 | 4 | 57.6 | 64.4 | 5 / 35 | 2074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 176 | 23% |
| brainfade.melee.Dusk 0.44 | 26 | 81% |
| dummy.micro.Sparrow 2.5 | 12 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 5 | 20% |
| jab.DiamondStealer 5 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 626 of 700 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 297 | 47% | 330 |
| dummy.micro.Sparrow 2.5 | 85 | 14% | 95 |
| brainfade.melee.Dusk 0.44 | 74 | 12% | 100 |
| wcsv.melee.EngineerMelee 0.1 | 68 | 11% | 71 |
| Krabb.akim2.Akim2 1.1b | 36 | 6% | 37 |
| mz.NanoGod 2.02 | 34 | 5% | 34 |
| jab.DiamondStealer 5 | 28 | 4% | 29 |
| cvt.Firsty 1.0 | 3 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.2 | 183 / 700 | 3.23 | 14.1% | 57637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.4 | 16.8% | 256 |
| tzu.TheArtOfWar 1.2 | 1.7 | 15.7% | 190 |
| hadur117.nano.SanaroB4K8 0.3 | 3.0 | 14.1% | 183 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 23 |
| jwirde.Gort 2.0 | 5.1 | 10.1% | 30 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.0% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 5 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.8% | 8 |
| sample.Crazy 1.0 | 9.4 | 4.8% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 74.0 | 8 / 35 | 3194 |
| 2 | 3 | 60.3 | 72.4 | 10 / 35 | 2840 |
| 3 | 3 | 62.0 | 76.5 | 9 / 35 | 3092 |
| 4 | 3 | 61.6 | 76.5 | 11 / 35 | 2684 |
| 5 | 3 | 62.6 | 79.0 | 9 / 35 | 2984 |
| 6 | 3 | 59.4 | 69.2 | 9 / 35 | 2643 |
| 7 | 3 | 63.1 | 80.0 | 12 / 35 | 2729 |
| 8 | 3 | 60.4 | 73.0 | 8 / 35 | 2738 |
| 9 | 3 | 63.4 | 80.6 | 13 / 35 | 2903 |
| 10 | 3 | 60.8 | 74.9 | 6 / 35 | 2450 |
| 11 | 3 | 59.1 | 67.9 | 6 / 35 | 2960 |
| 12 | 3 | 60.5 | 74.0 | 10 / 35 | 2645 |
| 13 | 3 | 60.5 | 73.0 | 9 / 35 | 2854 |
| 14 | 3 | 60.3 | 72.7 | 6 / 35 | 3010 |
| 15 | 3 | 60.6 | 72.4 | 7 / 35 | 2918 |
| 16 | 3 | 63.7 | 80.6 | 12 / 35 | 3103 |
| 17 | 2 | 63.6 | 81.9 | 13 / 35 | 2886 |
| 18 | 3 | 63.2 | 80.0 | 11 / 35 | 3147 |
| 19 | 3 | 59.7 | 72.1 | 6 / 35 | 2690 |
| 20 | 3 | 60.8 | 73.0 | 8 / 35 | 3167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 160 | 62% |
| tzu.TheArtOfWar 1.2 | 135 | 16% |
| wompi.Quokka 1.6 | 31 | 77% |
| jwirde.Gort 2.0 | 27 | 59% |
| disan.Chair 2.2.0 | 11 | 73% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 6 | 50% |
| amk.jointstrike.JointStrike 0.2 | 2 | 50% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 517 of 700 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 208 | 40% | 234 |
| stelo.Liblix 0.3.1 | 164 | 32% | 275 |
| wompi.Quokka 1.6 | 47 | 9% | 62 |
| jwirde.Gort 2.0 | 32 | 6% | 48 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 20 | 4% | 22 |
| stf.PanzerGeneral 0.1 | 19 | 4% | 26 |
| disan.Chair 2.2.0 | 14 | 3% | 14 |
| amk.jointstrike.JointStrike 0.2 | 9 | 2% | 12 |
| sample.Crazy 1.0 | 4 | 1% | 7 |

## Melee bench: F45

hadur117.nano.SanaroB4K8 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.9 | 205 / 700 | 3.08 | 15.0% | 64850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB4K8 0.3 | 1.1 | 15.0% | 205 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 13.1% | 327 |
| jje.BagPuss 1.2 | 3.0 | 12.4% | 34 |
| sul.Lunar 1.1 | 4.1 | 11.0% | 67 |
| myl.nano.Graviton 1.10 | 4.8 | 10.5% | 18 |
| hvilela.HVilela 0.9 | 6.2 | 9.1% | 2 |
| fm.claire 1.7 | 7.0 | 8.6% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 8.2% | 7 |
| wit.Deep7 2.0 | 9.1 | 6.8% | 36 |
| abud.ThirdRobo 1.0 | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 75.9 | 13 / 35 | 3257 |
| 2 | 1 | 62.0 | 75.2 | 13 / 35 | 3187 |
| 3 | 1 | 60.4 | 74.6 | 7 / 35 | 2963 |
| 4 | 1 | 64.5 | 83.2 | 15 / 35 | 3610 |
| 5 | 3 | 55.8 | 62.9 | 3 / 35 | 2922 |
| 6 | 1 | 60.9 | 74.3 | 10 / 35 | 3015 |
| 7 | 1 | 64.0 | 82.9 | 10 / 35 | 3527 |
| 8 | 1 | 62.6 | 76.8 | 13 / 35 | 3349 |
| 9 | 1 | 61.2 | 73.7 | 10 / 35 | 3307 |
| 10 | 1 | 64.1 | 83.2 | 14 / 35 | 3155 |
| 11 | 1 | 62.4 | 79.7 | 11 / 35 | 2936 |
| 12 | 1 | 61.5 | 74.9 | 8 / 35 | 3282 |
| 13 | 1 | 62.3 | 78.7 | 9 / 35 | 3101 |
| 14 | 1 | 61.8 | 74.6 | 10 / 35 | 3495 |
| 15 | 1 | 62.6 | 79.7 | 11 / 35 | 2997 |
| 16 | 1 | 61.5 | 74.3 | 10 / 35 | 3291 |
| 17 | 1 | 65.0 | 85.7 | 13 / 35 | 3314 |
| 18 | 1 | 61.8 | 74.9 | 7 / 35 | 3456 |
| 19 | 1 | 62.6 | 76.5 | 10 / 35 | 3500 |
| 20 | 1 | 61.4 | 76.5 | 8 / 35 | 3186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 260 | 47% |
| sul.Lunar 1.1 | 49 | 22% |
| jje.BagPuss 1.2 | 39 | 49% |
| wit.Deep7 2.0 | 26 | 54% |
| myl.nano.Graviton 1.10 | 16 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 16 | 100% |
| hvilela.HVilela 0.9 | 6 | 100% |
| fm.claire 1.7 | 3 | 67% |
| abud.ThirdRobo 1.0 | 2 | 100% |

Hadur died in 497 of 700 rounds, at a mean tick of 1571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 149 | 30% | 0 |
| jje.BagPuss 1.2 | 92 | 19% | 211 |
| sul.Lunar 1.1 | 71 | 14% | 154 |
| myl.nano.Graviton 1.10 | 61 | 12% | 111 |
| hvilela.HVilela 0.9 | 37 | 7% | 56 |
| fm.claire 1.7 | 32 | 6% | 47 |
| wit.Deep7 2.0 | 28 | 6% | 57 |
| pez.mini.ChironexFleckeri 0.5 | 21 | 4% | 51 |
| abud.ThirdRobo 1.0 | 5 | 1% | 12 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroB4K8 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 77.9 | 199 / 700 | 2.76 | 15.3% | 50400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.8% | 397 |
| hadur117.nano.SanaroB4K8 0.3 | 2.1 | 15.3% | 199 |
| cx.Princess 1.0 | 3.5 | 12.6% | 56 |
| mz.MicroSheep 1.0 | 3.6 | 13.0% | 34 |
| sadoner.killer 0.2 | 5.0 | 10.5% | 5 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.6% | 7 |
| jeremyreeder.collective.Prophet 5 | 6.8 | 7.4% | 0 |
| kurios.DOSexe .9a | 8.3 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 80.0 | 11 / 35 | 2735 |
| 2 | 2 | 60.0 | 73.2 | 8 / 35 | 2584 |
| 3 | 2 | 60.5 | 75.7 | 8 / 35 | 2689 |
| 4 | 2 | 60.6 | 76.4 | 8 / 35 | 2648 |
| 5 | 2 | 60.9 | 76.4 | 9 / 35 | 2610 |
| 6 | 2 | 59.5 | 72.1 | 9 / 35 | 2535 |
| 7 | 2 | 60.7 | 78.9 | 9 / 35 | 2177 |
| 8 | 3 | 57.6 | 70.4 | 5 / 35 | 2180 |
| 9 | 2 | 61.2 | 78.9 | 11 / 35 | 2351 |
| 10 | 2 | 64.5 | 87.1 | 14 / 35 | 2870 |
| 11 | 2 | 62.6 | 82.5 | 16 / 35 | 2316 |
| 12 | 2 | 60.0 | 75.4 | 8 / 35 | 2367 |
| 13 | 2 | 60.6 | 76.1 | 10 / 35 | 2539 |
| 14 | 2 | 63.6 | 81.4 | 10 / 35 | 3160 |
| 15 | 2 | 62.8 | 80.4 | 14 / 35 | 2475 |
| 16 | 3 | 59.4 | 71.4 | 11 / 35 | 2342 |
| 17 | 2 | 60.6 | 78.2 | 8 / 35 | 2291 |
| 18 | 2 | 61.4 | 78.9 | 8 / 35 | 2725 |
| 19 | 2 | 60.3 | 77.9 | 8 / 35 | 2268 |
| 20 | 2 | 64.0 | 87.5 | 14 / 35 | 2538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 326 | 43% |
| cx.Princess 1.0 | 49 | 61% |
| mz.MicroSheep 1.0 | 26 | 54% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 40% |
| sadoner.killer 0.2 | 4 | 75% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 501 of 700 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 301 | 60% | 453 |
| mz.MicroSheep 1.0 | 61 | 12% | 71 |
| cx.Princess 1.0 | 50 | 10% | 71 |
| sadoner.killer 0.2 | 40 | 8% | 45 |
| arthord.NanoSatanMelee Beta | 24 | 5% | 30 |
| jeremyreeder.collective.Prophet 5 | 16 | 3% | 18 |
| kurios.DOSexe .9a | 5 | 1% | 6 |
| mbro.Detektor3 0.1.1 | 4 | 1% | 6 |

