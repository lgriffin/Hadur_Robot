# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 76.3 | 139 / 700 | 3.13 | 13.4% | 54491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 448 |
| hadur117.nano.SanaroB400 0.3 | 2.1 | 13.4% | 139 |
| sgp.JollyNinja 3.53 | 3.4 | 12.0% | 63 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 11.5% | 22 |
| mz.MicroGodMelee 1 | 4.7 | 11.1% | 12 |
| lorneswork.Predator 1.0 | 5.8 | 10.0% | 15 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 73.3 | 9 / 35 | 2616 |
| 2 | 2 | 62.2 | 81.6 | 7 / 35 | 2835 |
| 3 | 2 | 61.2 | 80.6 | 8 / 35 | 2305 |
| 4 | 2 | 61.5 | 78.7 | 6 / 35 | 2826 |
| 5 | 2 | 60.9 | 75.6 | 9 / 35 | 2883 |
| 6 | 2 | 59.7 | 74.9 | 8 / 35 | 2424 |
| 7 | 2 | 59.6 | 71.4 | 5 / 35 | 2912 |
| 8 | 2 | 60.1 | 76.2 | 5 / 35 | 2728 |
| 9 | 2 | 61.6 | 78.7 | 6 / 35 | 2744 |
| 10 | 2 | 59.8 | 73.0 | 6 / 35 | 3006 |
| 11 | 2 | 60.0 | 74.3 | 5 / 35 | 2908 |
| 12 | 2 | 62.4 | 79.7 | 8 / 35 | 3041 |
| 13 | 2 | 61.2 | 74.9 | 10 / 35 | 2885 |
| 14 | 2 | 60.9 | 76.2 | 10 / 35 | 2770 |
| 15 | 2 | 59.2 | 72.7 | 4 / 35 | 2837 |
| 16 | 4 | 59.2 | 74.3 | 7 / 35 | 2160 |
| 17 | 2 | 60.6 | 75.9 | 4 / 35 | 2682 |
| 18 | 2 | 62.0 | 79.7 | 7 / 35 | 2916 |
| 19 | 2 | 60.5 | 75.2 | 8 / 35 | 2750 |
| 20 | 2 | 60.3 | 79.7 | 7 / 35 | 2263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 318 | 20% |
| sgp.JollyNinja 3.53 | 52 | 60% |
| mz.MicroGodMelee 1 | 26 | 96% |
| lorneswork.Predator 1.0 | 15 | 53% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 64% |
| adt.Ar2 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 0% |

Hadur died in 562 of 700 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 322 | 57% | 389 |
| sgp.JollyNinja 3.53 | 69 | 12% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 54 | 10% | 60 |
| lorneswork.Predator 1.0 | 47 | 8% | 55 |
| mz.MicroGodMelee 1 | 40 | 7% | 66 |
| adt.Ar2 1.0 | 17 | 3% | 22 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 1% | 7 |
| skm.butterfly 1.0 | 4 | 1% | 5 |
| mym.EdgeStalker 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.3 | 195 / 700 | 3.49 | 13.7% | 58789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.7% | 182 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 14.6% | 134 |
| hadur117.nano.SanaroB400 0.3 | 2.5 | 13.7% | 195 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.4% | 35 |
| sch.Simone 0.3d | 7.2 | 8.0% | 39 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.8% | 12 |
| Noran.BitchingElk 0.054 | 7.4 | 7.9% | 50 |
| stelo.PatternRobot 1.0 | 8.3 | 6.8% | 24 |
| fullsail.SweetTea 1.1 | 9.8 | 5.2% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 84.1 | 14 / 35 | 3054 |
| 2 | 3 | 60.3 | 72.7 | 10 / 35 | 2843 |
| 3 | 3 | 60.6 | 73.7 | 11 / 35 | 2825 |
| 4 | 3 | 56.7 | 67.3 | 5 / 35 | 2613 |
| 5 | 3 | 57.1 | 62.5 | 7 / 35 | 3039 |
| 6 | 2 | 61.5 | 75.6 | 14 / 35 | 3046 |
| 7 | 2 | 62.0 | 77.8 | 10 / 35 | 3071 |
| 8 | 1 | 61.7 | 73.3 | 14 / 35 | 3372 |
| 9 | 2 | 59.8 | 74.3 | 8 / 35 | 3014 |
| 10 | 3 | 58.4 | 66.3 | 10 / 35 | 2746 |
| 11 | 3 | 59.3 | 69.8 | 12 / 35 | 2687 |
| 12 | 2 | 60.7 | 72.7 | 11 / 35 | 3094 |
| 13 | 2 | 62.2 | 77.8 | 11 / 35 | 3116 |
| 14 | 3 | 60.9 | 73.7 | 12 / 35 | 2903 |
| 15 | 3 | 59.4 | 74.0 | 5 / 35 | 2923 |
| 16 | 3 | 59.7 | 69.8 | 10 / 35 | 3024 |
| 17 | 3 | 57.9 | 68.3 | 8 / 35 | 2864 |
| 18 | 2 | 57.7 | 67.9 | 7 / 35 | 2847 |
| 19 | 2 | 59.1 | 70.2 | 9 / 35 | 2842 |
| 20 | 3 | 60.7 | 74.3 | 7 / 35 | 2866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 111 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 104 | 39% |
| com.cohesiva.robocode.ManOwaR 1.0 | 42 | 79% |
| sch.Simone 0.3d | 32 | 41% |
| Noran.BitchingElk 0.054 | 30 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 81% |
| stelo.PatternRobot 1.0 | 16 | 44% |
| fullsail.SweetTea 1.1 | 12 | 25% |
| fnc.bandit.Bandit 5.2.0 | 10 | 40% |

Hadur died in 506 of 700 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 134 | 26% | 183 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 123 | 24% | 163 |
| stelo.PatternRobot 1.0 | 53 | 10% | 60 |
| com.cohesiva.robocode.ManOwaR 1.0 | 49 | 10% | 88 |
| lrem.micro.SpikeSoldier 0.4 | 46 | 9% | 58 |
| sch.Simone 0.3d | 34 | 7% | 52 |
| fnc.bandit.Bandit 5.2.0 | 28 | 6% | 33 |
| Noran.BitchingElk 0.054 | 20 | 4% | 42 |
| fullsail.SweetTea 1.1 | 18 | 4% | 21 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 81.5 | 199 / 700 | 2.66 | 14.6% | 62159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 15.0% | 163 |
| kawigi.nano.Lib 1.0 | 2.0 | 15.0% | 183 |
| hadur117.nano.SanaroB400 0.3 | 2.4 | 14.6% | 199 |
| vuen.Cake 2.51 | 3.9 | 13.3% | 125 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 17 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.1% | 5 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.6% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 80.0 | 3 / 35 | 3322 |
| 2 | 3 | 61.7 | 80.0 | 10 / 35 | 2991 |
| 3 | 2 | 61.7 | 80.6 | 10 / 35 | 3027 |
| 4 | 2 | 61.9 | 81.3 | 13 / 35 | 2722 |
| 5 | 3 | 61.5 | 81.6 | 7 / 35 | 3048 |
| 6 | 3 | 60.4 | 78.4 | 9 / 35 | 2897 |
| 7 | 2 | 61.8 | 83.8 | 10 / 35 | 2752 |
| 8 | 3 | 62.4 | 83.2 | 10 / 35 | 3126 |
| 9 | 3 | 61.6 | 79.7 | 8 / 35 | 3220 |
| 10 | 1 | 63.1 | 82.9 | 11 / 35 | 3453 |
| 11 | 1 | 63.9 | 85.1 | 15 / 35 | 3324 |
| 12 | 3 | 62.0 | 82.5 | 6 / 35 | 3249 |
| 13 | 4 | 61.7 | 80.6 | 9 / 35 | 3147 |
| 14 | 3 | 60.5 | 79.4 | 8 / 35 | 2562 |
| 15 | 2 | 62.7 | 83.2 | 8 / 35 | 3375 |
| 16 | 1 | 63.5 | 85.7 | 11 / 35 | 3356 |
| 17 | 1 | 64.3 | 87.9 | 16 / 35 | 3043 |
| 18 | 3 | 61.3 | 76.8 | 9 / 35 | 3283 |
| 19 | 3 | 60.6 | 75.9 | 12 / 35 | 3023 |
| 20 | 2 | 63.2 | 81.9 | 14 / 35 | 3239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 145 | 53% |
| radnor.DoctorBob 1.42 | 144 | 50% |
| kawigi.nano.Lib 1.0 | 135 | 12% |
| urdos.URDOS 1.3 | 31 | 81% |
| ghent.ArthurPanzergon 1.0.0 | 6 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 50% |
| adt.Ar1 2.1 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 503 of 700 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 186 | 37% | 203 |
| radnor.DoctorBob 1.42 | 135 | 27% | 197 |
| vuen.Cake 2.51 | 97 | 19% | 182 |
| urdos.URDOS 1.3 | 44 | 9% | 65 |
| ghent.ArthurPanzergon 1.0.0 | 15 | 3% | 18 |
| adt.Ar1 2.1 | 13 | 3% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 2% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 0% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 78.0 | 37 / 700 | 2.98 | 13.8% | 65899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.9% | 629 |
| hadur117.nano.SanaroB400 0.3 | 2.4 | 13.8% | 37 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.5% | 24 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 3 |
| josago.Jorgito 0.16 | 5.1 | 8.9% | 5 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 7.2% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 68.9 | 0 / 35 | 3259 |
| 2 | 3 | 63.5 | 84.4 | 1 / 35 | 3090 |
| 3 | 2 | 61.8 | 77.5 | 2 / 35 | 3337 |
| 4 | 2 | 64.5 | 85.4 | 2 / 35 | 3613 |
| 5 | 3 | 62.6 | 76.5 | 2 / 35 | 3599 |
| 6 | 2 | 62.5 | 78.1 | 1 / 35 | 3303 |
| 7 | 2 | 62.7 | 79.4 | 1 / 35 | 3514 |
| 8 | 2 | 64.3 | 83.8 | 4 / 35 | 3526 |
| 9 | 2 | 61.0 | 73.7 | 3 / 35 | 3154 |
| 10 | 2 | 62.7 | 79.0 | 3 / 35 | 3345 |
| 11 | 3 | 63.0 | 78.1 | 1 / 35 | 3599 |
| 12 | 2 | 62.3 | 78.7 | 1 / 35 | 3149 |
| 13 | 3 | 61.9 | 77.5 | 5 / 35 | 2882 |
| 14 | 2 | 62.6 | 77.5 | 4 / 35 | 3271 |
| 15 | 3 | 60.7 | 72.7 | 2 / 35 | 3210 |
| 16 | 2 | 62.0 | 75.9 | 2 / 35 | 3341 |
| 17 | 2 | 62.7 | 79.4 | 0 / 35 | 3558 |
| 18 | 2 | 61.3 | 74.9 | 2 / 35 | 3252 |
| 19 | 3 | 61.6 | 78.4 | 1 / 35 | 2936 |
| 20 | 3 | 62.2 | 79.7 | 0 / 35 | 2961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 410 | 4% |
| apc.LeeroyJenkins2 1.0 | 16 | 63% |
| josago.Jorgito 0.16 | 5 | 40% |
| TNT.TNT 0.99.1 | 4 | 75% |
| css.Delitioner 0.11 | 3 | 100% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 663 of 700 rounds, at a mean tick of 1619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 507 | 76% | 528 |
| apc.LeeroyJenkins2 1.0 | 60 | 9% | 70 |
| josago.Jorgito 0.16 | 39 | 6% | 39 |
| TNT.TNT 0.99.1 | 25 | 4% | 28 |
| css.Delitioner 0.11 | 19 | 3% | 23 |
| tj.zombie1n 1.0.1 | 8 | 1% | 7 |
| rampancy.Durandal 2.1d | 5 | 1% | 5 |

## Melee bench: F06

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 73.3 | 224 / 700 | 3.40 | 13.6% | 52049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.4% | 152 |
| origin.SleepSiphon 1.7b | 2.4 | 14.0% | 162 |
| hadur117.nano.SanaroB400 0.3 | 3.0 | 13.6% | 224 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.9% | 95 |
| mld.Wisdom 1.0 | 4.8 | 10.9% | 16 |
| gg.Wolverine 2.0 | 6.4 | 8.7% | 17 |
| spinnercat.Omen 1.0 | 7.1 | 7.7% | 8 |
| DBall.NUKE 0.1 | 7.9 | 7.3% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.4% | 18 |
| sample.Fire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 76.2 | 11 / 35 | 2641 |
| 2 | 2 | 61.8 | 76.8 | 14 / 35 | 2556 |
| 3 | 2 | 63.7 | 81.9 | 17 / 35 | 2679 |
| 4 | 4 | 59.7 | 71.1 | 10 / 35 | 2617 |
| 5 | 3 | 59.2 | 71.7 | 9 / 35 | 2415 |
| 6 | 3 | 62.3 | 76.5 | 13 / 35 | 2928 |
| 7 | 1 | 62.4 | 78.7 | 14 / 35 | 3066 |
| 8 | 3 | 59.6 | 70.2 | 10 / 35 | 2786 |
| 9 | 4 | 58.2 | 67.6 | 11 / 35 | 2474 |
| 10 | 4 | 60.3 | 72.4 | 11 / 35 | 2721 |
| 11 | 1 | 63.4 | 81.9 | 14 / 35 | 2942 |
| 12 | 4 | 58.8 | 68.3 | 11 / 35 | 2570 |
| 13 | 2 | 58.9 | 72.1 | 6 / 35 | 2468 |
| 14 | 4 | 57.9 | 67.9 | 9 / 35 | 2386 |
| 15 | 2 | 61.9 | 77.5 | 15 / 35 | 2662 |
| 16 | 4 | 58.9 | 70.5 | 10 / 35 | 2310 |
| 17 | 2 | 61.2 | 74.6 | 13 / 35 | 2728 |
| 18 | 4 | 58.9 | 71.4 | 6 / 35 | 2685 |
| 19 | 4 | 57.4 | 67.9 | 9 / 35 | 2278 |
| 20 | 5 | 59.4 | 71.7 | 11 / 35 | 2137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 100 | 61% |
| jekl.StoneGhost 0.7 | 87 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 74 | 64% |
| gg.Wolverine 2.0 | 32 | 69% |
| DBall.NUKE 0.1 | 17 | 76% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 55% |
| mld.Wisdom 1.0 | 9 | 89% |
| spinnercat.Omen 1.0 | 3 | 33% |
| sample.Fire 1.0 | 2 | 50% |

Hadur died in 481 of 700 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 133 | 28% | 173 |
| origin.SleepSiphon 1.7b | 116 | 24% | 186 |
| pe.minimelee.SandboxMiniMelee 1.1 | 84 | 17% | 143 |
| mld.Wisdom 1.0 | 70 | 15% | 80 |
| gg.Wolverine 2.0 | 29 | 6% | 44 |
| spinnercat.Omen 1.0 | 25 | 5% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 12 | 2% | 19 |
| DBall.NUKE 0.1 | 10 | 2% | 25 |
| sample.Fire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 88.3 | 330 / 700 | 1.94 | 18.2% | 65586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 21.9% | 181 |
| hadur117.nano.SanaroB400 0.3 | 2.0 | 18.2% | 330 |
| franzor.Lizt 1.3.1 | 3.3 | 14.0% | 133 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 13.4% | 52 |
| lrem.micro.MoggFanatic 0.2 | 5.1 | 10.2% | 1 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.5% | 0 |
| skm.PateranBotlock2 1.0 | 6.9 | 7.5% | 4 |
| drd.Dreadknoght 0.9 | 8.3 | 3.3% | 0 |
| sample.Target 1.0 | 8.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 90.4 | 17 / 35 | 3141 |
| 2 | 2 | 66.6 | 88.9 | 17 / 35 | 3012 |
| 3 | 2 | 65.7 | 85.4 | 14 / 35 | 3176 |
| 4 | 2 | 67.0 | 87.9 | 16 / 35 | 3519 |
| 5 | 2 | 64.8 | 81.4 | 11 / 35 | 3319 |
| 6 | 2 | 67.5 | 89.6 | 18 / 35 | 3487 |
| 7 | 2 | 65.4 | 86.4 | 15 / 35 | 2878 |
| 8 | 2 | 66.3 | 87.9 | 19 / 35 | 3199 |
| 9 | 2 | 68.1 | 90.7 | 21 / 35 | 3536 |
| 10 | 2 | 64.7 | 84.3 | 13 / 35 | 3055 |
| 11 | 2 | 66.9 | 90.0 | 14 / 35 | 3265 |
| 12 | 2 | 68.9 | 92.9 | 22 / 35 | 3731 |
| 13 | 2 | 67.1 | 90.4 | 18 / 35 | 2894 |
| 14 | 2 | 67.2 | 87.1 | 16 / 35 | 3705 |
| 15 | 2 | 67.4 | 88.6 | 17 / 35 | 3523 |
| 16 | 2 | 67.3 | 90.7 | 18 / 35 | 3289 |
| 17 | 2 | 67.4 | 91.4 | 19 / 35 | 3114 |
| 18 | 2 | 68.9 | 92.9 | 18 / 35 | 3894 |
| 19 | 2 | 65.0 | 83.9 | 12 / 35 | 3172 |
| 20 | 2 | 65.0 | 85.0 | 15 / 35 | 2677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 264 | 56% |
| franzor.Lizt 1.3.1 | 149 | 62% |
| oog.melee.CapuletDroid 1.1 | 110 | 72% |
| skm.PateranBotlock2 1.0 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 375 of 700 rounds, at a mean tick of 1794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 217 | 58% | 484 |
| oog.melee.CapuletDroid 1.1 | 74 | 20% | 159 |
| franzor.Lizt 1.3.1 | 61 | 16% | 2 |
| skm.PateranBotlock2 1.0 | 9 | 2% | 17 |
| exauge.GateKeeper 1.1.121g | 8 | 2% | 14 |
| lrem.micro.MoggFanatic 0.2 | 5 | 1% | 12 |
| drd.Dreadknoght 0.9 | 0 | 0% | 9 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 78.1 | 269 / 700 | 2.75 | 16.0% | 51730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB400 0.3 | 1.9 | 16.0% | 269 |
| tm.Yuugao 1.0 | 2.1 | 15.8% | 138 |
| shrub.Vapour v159 | 2.1 | 16.1% | 174 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.8% | 61 |
| m3thos.Eva00 1.1 | 5.3 | 10.1% | 21 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.2% | 28 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.2% | 4 |
| SHAM.WOW 1.4 | 7.9 | 6.9% | 4 |
| zyx.nano.BacillusComma 1.0 | 8.2 | 6.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 75.4 | 15 / 35 | 2718 |
| 2 | 2 | 60.5 | 75.4 | 12 / 35 | 2556 |
| 3 | 1 | 60.4 | 77.1 | 12 / 35 | 2491 |
| 4 | 3 | 61.9 | 78.2 | 13 / 35 | 2806 |
| 5 | 1 | 62.5 | 80.7 | 14 / 35 | 2642 |
| 6 | 1 | 62.0 | 82.9 | 15 / 35 | 2458 |
| 7 | 3 | 59.7 | 72.1 | 13 / 35 | 2453 |
| 8 | 1 | 63.7 | 83.9 | 16 / 35 | 2935 |
| 9 | 2 | 62.4 | 78.9 | 13 / 35 | 2825 |
| 10 | 2 | 60.3 | 78.2 | 11 / 35 | 2403 |
| 11 | 2 | 62.9 | 80.7 | 15 / 35 | 2610 |
| 12 | 2 | 62.8 | 82.5 | 15 / 35 | 2557 |
| 13 | 1 | 62.5 | 80.4 | 16 / 35 | 2755 |
| 14 | 1 | 63.7 | 85.4 | 15 / 35 | 2456 |
| 15 | 3 | 59.2 | 73.2 | 12 / 35 | 2408 |
| 16 | 1 | 61.4 | 82.1 | 16 / 35 | 2017 |
| 17 | 3 | 59.6 | 73.2 | 13 / 35 | 2400 |
| 18 | 3 | 60.3 | 72.1 | 11 / 35 | 2948 |
| 19 | 1 | 62.8 | 80.7 | 13 / 35 | 2809 |
| 20 | 3 | 58.2 | 68.2 | 9 / 35 | 2483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 180 | 73% |
| shrub.Vapour v159 | 126 | 39% |
| com.spp.robocode.MostlyHarmless 010 | 62 | 48% |
| jwst.DAD.DarkAndDarker 1.1 | 34 | 79% |
| m3thos.Eva00 1.1 | 21 | 48% |
| qualidafial.MajorDick 1.0.1 | 13 | 77% |
| SHAM.WOW 1.4 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 431 of 700 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 152 | 35% | 194 |
| tm.Yuugao 1.0 | 110 | 26% | 248 |
| com.spp.robocode.MostlyHarmless 010 | 62 | 14% | 101 |
| m3thos.Eva00 1.1 | 29 | 7% | 41 |
| jwst.DAD.DarkAndDarker 1.1 | 28 | 6% | 50 |
| zyx.nano.BacillusComma 1.0 | 26 | 6% | 28 |
| qualidafial.MajorDick 1.0.1 | 15 | 3% | 18 |
| SHAM.WOW 1.4 | 9 | 2% | 18 |

## Melee bench: F09

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 68.0 | 140 / 700 | 3.88 | 12.3% | 42995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 351 |
| kc.micro.Figment 1.0 | 2.1 | 14.6% | 87 |
| hadur117.nano.SanaroB400 0.3 | 3.2 | 12.3% | 140 |
| pedersen.Grishnakh 1.0 | 4.5 | 11.2% | 59 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 9 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 34 |
| dft.Calliope 5.6 | 7.1 | 7.9% | 17 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.2% | 1 |
| rdm.Dueler 0.4x | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.6 | 65.7 | 6 / 35 | 2149 |
| 2 | 4 | 58.0 | 68.3 | 5 / 35 | 2346 |
| 3 | 3 | 55.4 | 62.9 | 4 / 35 | 2086 |
| 4 | 3 | 58.1 | 70.5 | 10 / 35 | 1898 |
| 5 | 3 | 59.3 | 71.4 | 8 / 35 | 2006 |
| 6 | 3 | 59.7 | 72.7 | 8 / 35 | 2363 |
| 7 | 3 | 56.8 | 64.1 | 8 / 35 | 2159 |
| 8 | 3 | 56.9 | 67.3 | 7 / 35 | 1770 |
| 9 | 4 | 56.1 | 64.4 | 6 / 35 | 2007 |
| 10 | 3 | 58.5 | 71.7 | 8 / 35 | 1884 |
| 11 | 3 | 59.2 | 70.8 | 9 / 35 | 2340 |
| 12 | 4 | 56.2 | 63.5 | 5 / 35 | 2329 |
| 13 | 3 | 57.5 | 66.3 | 8 / 35 | 2242 |
| 14 | 4 | 57.1 | 64.4 | 7 / 35 | 2234 |
| 15 | 3 | 58.1 | 67.3 | 6 / 35 | 2278 |
| 16 | 4 | 56.2 | 64.1 | 7 / 35 | 2099 |
| 17 | 2 | 60.7 | 76.5 | 10 / 35 | 2222 |
| 18 | 3 | 58.7 | 71.1 | 6 / 35 | 2352 |
| 19 | 3 | 57.0 | 67.0 | 7 / 35 | 1931 |
| 20 | 3 | 58.7 | 70.8 | 5 / 35 | 2300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 161 | 35% |
| kc.micro.Figment 1.0 | 51 | 63% |
| mc2.enemy.Original 0.9 | 27 | 85% |
| pedersen.Grishnakh 1.0 | 22 | 55% |
| yagami.Tidus 0.11 | 13 | 100% |
| dft.Calliope 5.6 | 6 | 50% |
| rdm.Dueler 0.4x | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 560 of 700 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 184 | 33% | 243 |
| kc.micro.Figment 1.0 | 129 | 23% | 167 |
| yagami.Tidus 0.11 | 66 | 12% | 76 |
| pedersen.Grishnakh 1.0 | 66 | 12% | 74 |
| mc2.enemy.Original 0.9 | 44 | 8% | 65 |
| dft.Calliope 5.6 | 26 | 5% | 30 |
| robar.nano.Assertive_Melee 0.2 | 26 | 5% | 26 |
| step.nanoPri 1.0 | 11 | 2% | 12 |
| rdm.Dueler 0.4x | 8 | 1% | 7 |

## Melee bench: F10

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 83.8 | 303 / 700 | 2.46 | 15.4% | 61811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.6 | 15.6% | 169 |
| hadur117.nano.SanaroB400 0.3 | 1.6 | 15.4% | 303 |
| ne.Chimera 1.2 | 3.3 | 13.3% | 75 |
| ejb.Polaris 1.0.1 | 3.8 | 12.8% | 46 |
| vStar.RAFzilla 2.15 | 5.4 | 10.5% | 31 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.5% | 58 |
| sam.Samspin 1.0 | 7.6 | 6.5% | 6 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.4% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 77.5 | 11 / 35 | 3030 |
| 2 | 2 | 62.6 | 80.6 | 10 / 35 | 3170 |
| 3 | 1 | 65.7 | 87.9 | 21 / 35 | 3226 |
| 4 | 2 | 62.9 | 84.1 | 14 / 35 | 2755 |
| 5 | 2 | 64.5 | 87.0 | 15 / 35 | 3079 |
| 6 | 3 | 61.9 | 75.9 | 11 / 35 | 3395 |
| 7 | 1 | 64.0 | 85.1 | 17 / 35 | 3158 |
| 8 | 1 | 63.3 | 82.9 | 12 / 35 | 3136 |
| 9 | 1 | 65.7 | 89.5 | 22 / 35 | 2758 |
| 10 | 2 | 63.8 | 84.8 | 13 / 35 | 3059 |
| 11 | 2 | 62.0 | 81.6 | 14 / 35 | 2574 |
| 12 | 1 | 64.7 | 87.3 | 18 / 35 | 2869 |
| 13 | 2 | 62.4 | 81.9 | 10 / 35 | 3088 |
| 14 | 1 | 64.3 | 83.5 | 18 / 35 | 3324 |
| 15 | 2 | 62.5 | 78.1 | 16 / 35 | 2895 |
| 16 | 1 | 64.9 | 85.1 | 19 / 35 | 3356 |
| 17 | 1 | 65.2 | 87.9 | 17 / 35 | 3213 |
| 18 | 1 | 64.9 | 87.3 | 17 / 35 | 3295 |
| 19 | 1 | 64.5 | 85.7 | 15 / 35 | 3126 |
| 20 | 1 | 63.0 | 82.5 | 13 / 35 | 3305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 150 | 51% |
| ejb.Polaris 1.0.1 | 133 | 92% |
| ne.Chimera 1.2 | 61 | 38% |
| tvv.micro.Antares 1.1.1 | 48 | 46% |
| vStar.RAFzilla 2.15 | 45 | 76% |
| kurios.DOSexe .9b | 14 | 86% |
| donjezza.Muncho 1.0 | 12 | 50% |
| sam.Samspin 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% |

Hadur died in 398 of 700 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 157 | 39% | 224 |
| ne.Chimera 1.2 | 102 | 26% | 129 |
| tvv.micro.Antares 1.1.1 | 41 | 10% | 58 |
| ejb.Polaris 1.0.1 | 34 | 9% | 157 |
| vStar.RAFzilla 2.15 | 24 | 6% | 61 |
| sam.Samspin 1.0 | 15 | 4% | 19 |
| kurios.DOSexe .9b | 10 | 3% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 2% | 12 |
| donjezza.Muncho 1.0 | 7 | 2% | 12 |

## Melee bench: F11

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 72.3 | 205 / 700 | 3.49 | 13.3% | 48583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.1% | 232 |
| hadur117.nano.SanaroB400 0.3 | 2.5 | 13.3% | 205 |
| cx.mini.Nimrod 0.55 | 2.6 | 13.0% | 95 |
| djc.DynaBot 0.1.1 | 4.5 | 10.8% | 37 |
| rdt199.Warlord 0.73 | 5.1 | 9.9% | 43 |
| br2.MobyDickBot 1.6 | 5.8 | 9.4% | 40 |
| uji.YellohFellah 1.0 | 6.9 | 8.4% | 43 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 3 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 65.4 | 10 / 35 | 2304 |
| 2 | 3 | 55.5 | 63.2 | 10 / 35 | 2039 |
| 3 | 3 | 58.9 | 70.8 | 9 / 35 | 2461 |
| 4 | 2 | 60.8 | 77.8 | 13 / 35 | 2172 |
| 5 | 2 | 59.3 | 70.5 | 8 / 35 | 2512 |
| 6 | 2 | 59.6 | 73.7 | 10 / 35 | 2150 |
| 7 | 3 | 58.3 | 67.3 | 7 / 35 | 2759 |
| 8 | 2 | 61.1 | 75.6 | 15 / 35 | 2537 |
| 9 | 4 | 55.8 | 63.5 | 5 / 35 | 2493 |
| 10 | 3 | 59.6 | 74.3 | 8 / 35 | 2350 |
| 11 | 2 | 59.3 | 70.8 | 11 / 35 | 2405 |
| 12 | 2 | 62.4 | 80.6 | 16 / 35 | 2319 |
| 13 | 2 | 61.7 | 77.1 | 11 / 35 | 2554 |
| 14 | 2 | 60.4 | 74.3 | 11 / 35 | 2659 |
| 15 | 2 | 57.9 | 68.6 | 11 / 35 | 2335 |
| 16 | 2 | 60.2 | 75.2 | 10 / 35 | 2528 |
| 17 | 2 | 61.2 | 79.4 | 9 / 35 | 2478 |
| 18 | 3 | 56.7 | 67.9 | 7 / 35 | 2113 |
| 19 | 3 | 59.3 | 70.8 | 11 / 35 | 2585 |
| 20 | 2 | 62.5 | 79.4 | 13 / 35 | 2830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 157 | 62% |
| cx.mini.Nimrod 0.55 | 45 | 58% |
| rdt199.Warlord 0.73 | 37 | 78% |
| uji.YellohFellah 1.0 | 31 | 42% |
| br2.MobyDickBot 1.6 | 26 | 65% |
| djc.DynaBot 0.1.1 | 25 | 76% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 497 of 700 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 187 | 38% | 279 |
| cx.mini.Nimrod 0.55 | 102 | 21% | 123 |
| rdt199.Warlord 0.73 | 54 | 11% | 87 |
| uji.YellohFellah 1.0 | 36 | 7% | 49 |
| djc.DynaBot 0.1.1 | 33 | 7% | 52 |
| br2.MobyDickBot 1.6 | 28 | 6% | 49 |
| KiraNL.Chupacabra 0.4 | 27 | 5% | 32 |
| stelo.MirrorNano 1.3 | 17 | 3% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 2% | 12 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 73.6 | 189 / 700 | 3.37 | 13.4% | 43899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.8% | 144 |
| nat.PallasHawk 1.0 | 1.8 | 14.6% | 192 |
| hadur117.nano.SanaroB400 0.3 | 3.0 | 13.4% | 189 |
| darkcanuck.Leon 1.01 | 3.5 | 13.0% | 114 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.2% | 36 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 9 |
| jp.Perpy 16.0 | 7.5 | 7.3% | 3 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.1% | 1 |
| jaybot.bots.Oddball 4.0 | 8.9 | 6.0% | 11 |
| stuff.Vlad 0.1 | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 78.4 | 14 / 35 | 2105 |
| 2 | 3 | 60.4 | 76.5 | 11 / 35 | 2004 |
| 3 | 3 | 58.7 | 69.2 | 8 / 35 | 2398 |
| 4 | 4 | 58.3 | 73.0 | 7 / 35 | 1793 |
| 5 | 2 | 62.2 | 80.3 | 11 / 35 | 2527 |
| 6 | 2 | 60.0 | 75.9 | 10 / 35 | 2194 |
| 7 | 2 | 61.3 | 77.5 | 11 / 35 | 2511 |
| 8 | 3 | 56.7 | 68.6 | 6 / 35 | 1961 |
| 9 | 3 | 60.9 | 77.8 | 10 / 35 | 2235 |
| 10 | 3 | 60.7 | 78.1 | 11 / 35 | 2055 |
| 11 | 4 | 55.5 | 63.5 | 7 / 35 | 2007 |
| 12 | 3 | 59.8 | 75.6 | 11 / 35 | 2012 |
| 13 | 3 | 61.4 | 75.9 | 9 / 35 | 2574 |
| 14 | 4 | 60.9 | 76.2 | 12 / 35 | 2299 |
| 15 | 3 | 58.9 | 72.7 | 6 / 35 | 2294 |
| 16 | 3 | 58.3 | 69.8 | 9 / 35 | 2298 |
| 17 | 3 | 59.7 | 74.6 | 10 / 35 | 2039 |
| 18 | 5 | 55.6 | 62.2 | 8 / 35 | 2200 |
| 19 | 3 | 58.1 | 70.2 | 9 / 35 | 1933 |
| 20 | 1 | 60.6 | 76.8 | 9 / 35 | 2460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 133 | 32% |
| bts.wiki.RipCurl 0.9b | 118 | 63% |
| darkcanuck.Leon 1.01 | 89 | 47% |
| brainfade.melee.Genghis 0.36 | 21 | 71% |
| jaybot.bots.Oddball 4.0 | 10 | 30% |
| jrm.Test0 1.0 | 7 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 511 of 700 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 166 | 32% | 216 |
| bts.wiki.RipCurl 0.9b | 110 | 22% | 168 |
| darkcanuck.Leon 1.01 | 84 | 16% | 137 |
| jrm.Test0 1.0 | 42 | 8% | 47 |
| brainfade.melee.Genghis 0.36 | 40 | 8% | 48 |
| cs.sheldor.Talon 1.1 | 23 | 5% | 28 |
| jaybot.bots.Oddball 4.0 | 21 | 4% | 23 |
| jp.Perpy 16.0 | 17 | 3% | 22 |
| stuff.Vlad 0.1 | 8 | 2% | 10 |

## Melee bench: F13

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 74.0 | 116 / 700 | 3.34 | 13.0% | 52871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.2% | 185 |
| mn.Combat 3.25.0 | 1.5 | 17.3% | 298 |
| hadur117.nano.SanaroB400 0.3 | 3.4 | 13.0% | 116 |
| shinh.Entangled 0.3 | 4.0 | 12.4% | 64 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.7% | 36 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.9 | 7.2% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.0 | 85.1 | 9 / 35 | 3109 |
| 2 | 4 | 58.4 | 67.9 | 3 / 35 | 2886 |
| 3 | 3 | 59.6 | 74.3 | 6 / 35 | 2542 |
| 4 | 3 | 59.3 | 73.0 | 3 / 35 | 2595 |
| 5 | 3 | 59.9 | 70.2 | 5 / 35 | 3291 |
| 6 | 4 | 59.2 | 69.8 | 3 / 35 | 2995 |
| 7 | 3 | 59.8 | 74.9 | 6 / 35 | 2412 |
| 8 | 3 | 60.2 | 74.3 | 6 / 35 | 2623 |
| 9 | 4 | 58.2 | 69.5 | 6 / 35 | 2488 |
| 10 | 3 | 60.7 | 77.5 | 5 / 35 | 2503 |
| 11 | 4 | 61.0 | 74.6 | 8 / 35 | 2777 |
| 12 | 3 | 60.2 | 76.2 | 4 / 35 | 2457 |
| 13 | 5 | 57.2 | 67.6 | 4 / 35 | 2179 |
| 14 | 3 | 61.6 | 80.3 | 11 / 35 | 2275 |
| 15 | 4 | 58.0 | 69.5 | 4 / 35 | 2416 |
| 16 | 3 | 61.7 | 75.6 | 10 / 35 | 2799 |
| 17 | 3 | 60.4 | 72.7 | 6 / 35 | 2736 |
| 18 | 3 | 59.8 | 75.2 | 6 / 35 | 2341 |
| 19 | 3 | 62.4 | 79.0 | 6 / 35 | 2792 |
| 20 | 3 | 60.1 | 73.3 | 5 / 35 | 2655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 177 | 38% |
| ags.Glacier 0.2.11 | 110 | 17% |
| shinh.Entangled 0.3 | 36 | 53% |
| gh.micro.Gruweltje 0.7 | 13 | 54% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 584 of 700 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 199 | 34% | 221 |
| mn.Combat 3.25.0 | 176 | 30% | 238 |
| shinh.Entangled 0.3 | 84 | 14% | 105 |
| gh.micro.Gruweltje 0.7 | 58 | 10% | 65 |
| stelo.Wang 1.0 | 29 | 5% | 33 |
| apc.Colossus2 0.17 | 16 | 3% | 16 |
| maribo.FollowFire 1 | 12 | 2% | 12 |
| ayk.WallHugger 1.0 | 9 | 2% | 9 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 82.9 | 308 / 700 | 2.37 | 16.2% | 47170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 19.9% | 267 |
| hadur117.nano.SanaroB400 0.3 | 2.0 | 16.2% | 308 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.8 | 12.3% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 11.5% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 4.9 | 11.1% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 11.2% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 9.3% | 35 |
| pa.Improved 1.0 | 8.0 | 6.3% | 8 |
| sample.TrackFire 1.0 | 9.0 | 2.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 82.1 | 16 / 35 | 2245 |
| 2 | 2 | 63.8 | 85.7 | 17 / 35 | 2588 |
| 3 | 2 | 64.2 | 86.1 | 15 / 35 | 2558 |
| 4 | 2 | 60.9 | 80.0 | 12 / 35 | 1947 |
| 5 | 2 | 63.9 | 87.5 | 18 / 35 | 2129 |
| 6 | 2 | 64.0 | 88.2 | 18 / 35 | 2244 |
| 7 | 2 | 63.4 | 84.3 | 16 / 35 | 2509 |
| 8 | 2 | 64.0 | 83.2 | 20 / 35 | 2670 |
| 9 | 2 | 64.0 | 86.8 | 21 / 35 | 2217 |
| 10 | 2 | 62.8 | 83.2 | 16 / 35 | 2381 |
| 11 | 2 | 62.4 | 82.9 | 13 / 35 | 2369 |
| 12 | 2 | 61.3 | 76.8 | 14 / 35 | 2338 |
| 13 | 2 | 63.6 | 85.7 | 14 / 35 | 2633 |
| 14 | 2 | 62.7 | 85.4 | 17 / 35 | 2053 |
| 15 | 2 | 61.9 | 78.6 | 16 / 35 | 2232 |
| 16 | 2 | 61.8 | 79.6 | 12 / 35 | 2605 |
| 17 | 2 | 62.1 | 82.5 | 13 / 35 | 2250 |
| 18 | 2 | 62.0 | 80.7 | 12 / 35 | 2734 |
| 19 | 2 | 58.7 | 72.5 | 11 / 35 | 2053 |
| 20 | 2 | 63.2 | 86.1 | 17 / 35 | 2415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 321 | 57% |
| sheldor.micro.PointInLineRRAL 1.0 | 48 | 69% |
| co.edu.usb.rc.LidisTron 1.0 | 39 | 54% |
| Lo_Ian.Gandalf_V4 4.0 | 33 | 91% |
| sanyi.mikrobi.Roberto 1.0 | 29 | 62% |
| dmh.robocode.robot.RedDwarf 0.4 | 22 | 86% |
| pa.Improved 1.0 | 7 | 43% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 394 of 700 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 206 | 52% | 369 |
| dmh.robocode.robot.RedDwarf 0.4 | 53 | 13% | 71 |
| co.edu.usb.rc.LidisTron 1.0 | 44 | 11% | 39 |
| sanyi.mikrobi.Roberto 1.0 | 34 | 9% | 74 |
| sheldor.micro.PointInLineRRAL 1.0 | 32 | 8% | 77 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 4% | 53 |
| pa.Improved 1.0 | 5 | 1% | 12 |
| sample.TrackFire 1.0 | 3 | 1% | 3 |

## Melee bench: F15

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.0 | 185 / 700 | 3.61 | 13.4% | 56988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.1% | 136 |
| emp.Yngwie 1.11 | 2.7 | 13.8% | 178 |
| hadur117.nano.SanaroB400 0.3 | 3.0 | 13.4% | 185 |
| mld.DustBunny 3.8 | 3.6 | 13.0% | 63 |
| cb.nano.Insomnia 1.0 | 4.6 | 11.8% | 51 |
| kawigi.robot.Girl 1.2 | 6.0 | 10.2% | 76 |
| Grystrion.TrackerWO 1.0 | 7.6 | 6.7% | 2 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.4% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 74.6 | 11 / 35 | 2883 |
| 2 | 2 | 59.7 | 72.1 | 8 / 35 | 2745 |
| 3 | 2 | 59.8 | 71.7 | 8 / 35 | 2864 |
| 4 | 4 | 56.2 | 62.2 | 9 / 35 | 2451 |
| 5 | 3 | 58.9 | 66.3 | 12 / 35 | 2848 |
| 6 | 4 | 58.6 | 68.6 | 7 / 35 | 2695 |
| 7 | 3 | 60.0 | 71.7 | 10 / 35 | 2642 |
| 8 | 3 | 59.4 | 69.5 | 9 / 35 | 3007 |
| 9 | 2 | 59.9 | 71.7 | 10 / 35 | 2717 |
| 10 | 4 | 59.8 | 71.1 | 9 / 35 | 2637 |
| 11 | 3 | 61.7 | 75.6 | 10 / 35 | 2892 |
| 12 | 4 | 58.2 | 66.0 | 10 / 35 | 2826 |
| 13 | 5 | 59.7 | 67.9 | 8 / 35 | 2999 |
| 14 | 2 | 61.5 | 75.2 | 9 / 35 | 3187 |
| 15 | 3 | 60.6 | 73.7 | 9 / 35 | 2732 |
| 16 | 4 | 56.9 | 65.7 | 5 / 35 | 2549 |
| 17 | 3 | 61.1 | 72.4 | 11 / 35 | 3096 |
| 18 | 2 | 60.5 | 73.0 | 12 / 35 | 3006 |
| 19 | 2 | 61.0 | 74.3 | 8 / 35 | 3072 |
| 20 | 2 | 62.1 | 76.8 | 10 / 35 | 3140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 109 | 74% |
| cb.nano.Insomnia 1.0 | 58 | 76% |
| kawigi.micro.Shiz 1.1 | 51 | 43% |
| kawigi.robot.Girl 1.2 | 39 | 62% |
| mld.DustBunny 3.8 | 28 | 11% |
| divineomega.TrialBot 0.003 | 9 | 89% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 515 of 700 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 115 | 22% | 148 |
| mld.DustBunny 3.8 | 113 | 22% | 139 |
| emp.Yngwie 1.11 | 95 | 18% | 195 |
| cb.nano.Insomnia 1.0 | 73 | 14% | 62 |
| kawigi.robot.Girl 1.2 | 65 | 13% | 84 |
| divineomega.TrialBot 0.003 | 18 | 3% | 31 |
| Grystrion.TrackerWO 1.0 | 17 | 3% | 20 |
| lambdaxy.TBot 0.1 | 15 | 3% | 17 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.1 | 138 / 700 | 3.51 | 13.3% | 56858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 287 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 14.8% | 33 |
| hadur117.nano.SanaroB400 0.3 | 3.0 | 13.3% | 138 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.3% | 142 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.9% | 54 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.7% | 11 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.8% | 12 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 1 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.3% | 22 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 70.8 | 6 / 35 | 2743 |
| 2 | 3 | 58.9 | 65.7 | 8 / 35 | 3058 |
| 3 | 3 | 60.8 | 75.2 | 8 / 35 | 2895 |
| 4 | 3 | 58.0 | 64.8 | 7 / 35 | 2926 |
| 5 | 3 | 61.1 | 78.4 | 10 / 35 | 2537 |
| 6 | 4 | 57.8 | 65.1 | 6 / 35 | 2639 |
| 7 | 3 | 60.5 | 73.3 | 7 / 35 | 2807 |
| 8 | 3 | 59.8 | 69.8 | 5 / 35 | 3000 |
| 9 | 3 | 60.2 | 73.0 | 5 / 35 | 2866 |
| 10 | 2 | 61.6 | 78.4 | 7 / 35 | 2782 |
| 11 | 3 | 58.8 | 70.2 | 3 / 35 | 2703 |
| 12 | 3 | 60.5 | 74.0 | 7 / 35 | 2818 |
| 13 | 2 | 63.7 | 79.0 | 10 / 35 | 3518 |
| 14 | 3 | 62.2 | 79.4 | 11 / 35 | 2544 |
| 15 | 3 | 57.3 | 64.8 | 3 / 35 | 2830 |
| 16 | 3 | 57.9 | 67.9 | 6 / 35 | 2622 |
| 17 | 3 | 60.6 | 72.4 | 11 / 35 | 2631 |
| 18 | 3 | 59.2 | 71.4 | 6 / 35 | 2689 |
| 19 | 3 | 60.9 | 75.6 | 5 / 35 | 3000 |
| 20 | 3 | 61.0 | 72.4 | 7 / 35 | 3250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 172 | 29% |
| techdude.forest.FlamingForest 1.1 | 86 | 41% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 90% |
| tvv.nano.Polaris 1.2 | 24 | 13% |
| bvh.fnr.Fenrir 0.36l | 10 | 90% |
| divineomega.DivineBot 1.9.4.5 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 7 | 57% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 562 of 700 rounds, at a mean tick of 1500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 240 | 43% | 297 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 97 | 17% | 114 |
| techdude.forest.FlamingForest 1.1 | 76 | 14% | 114 |
| bvh.fnr.Fenrir 0.36l | 55 | 10% | 64 |
| tvv.nano.Polaris 1.2 | 45 | 8% | 47 |
| stelo.IntrinsicVolatility 1.4 | 20 | 4% | 24 |
| divineomega.DivineBot 1.9.4.5 | 16 | 3% | 24 |
| asd.Cthulhu 1.3 | 10 | 2% | 12 |
| repositorio.NanoStep 1.0 | 3 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 72.7 | 240 / 700 | 3.45 | 13.6% | 53346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.0% | 127 |
| oog.melee.Mercutio 1.0 | 2.6 | 13.5% | 107 |
| hadur117.nano.SanaroB400 0.3 | 2.7 | 13.6% | 240 |
| cx.BlestPain 1.41 | 3.1 | 13.0% | 102 |
| nic.Nicator 2.4 | 5.1 | 11.6% | 56 |
| ahf.NanoAndrew .4 | 5.6 | 11.2% | 58 |
| maribo.melee.BMV 0.1 | 7.0 | 9.2% | 9 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 73.7 | 15 / 35 | 2977 |
| 2 | 1 | 63.5 | 81.6 | 16 / 35 | 2895 |
| 3 | 2 | 62.2 | 79.0 | 11 / 35 | 2874 |
| 4 | 2 | 61.5 | 74.6 | 14 / 35 | 2710 |
| 5 | 4 | 60.0 | 70.8 | 10 / 35 | 2641 |
| 6 | 1 | 62.6 | 76.8 | 18 / 35 | 2609 |
| 7 | 1 | 62.2 | 78.4 | 15 / 35 | 2555 |
| 8 | 4 | 58.5 | 69.2 | 9 / 35 | 2366 |
| 9 | 2 | 60.4 | 74.0 | 10 / 35 | 2658 |
| 10 | 4 | 58.7 | 65.7 | 12 / 35 | 2557 |
| 11 | 4 | 59.9 | 74.0 | 10 / 35 | 2379 |
| 12 | 3 | 60.6 | 74.3 | 10 / 35 | 2495 |
| 13 | 2 | 61.1 | 73.0 | 13 / 35 | 2831 |
| 14 | 3 | 59.7 | 68.9 | 11 / 35 | 2879 |
| 15 | 5 | 57.0 | 63.8 | 6 / 35 | 2873 |
| 16 | 1 | 60.9 | 73.0 | 14 / 35 | 2728 |
| 17 | 4 | 59.6 | 69.2 | 12 / 35 | 2580 |
| 18 | 4 | 59.0 | 68.6 | 9 / 35 | 2621 |
| 19 | 2 | 59.9 | 70.5 | 11 / 35 | 2924 |
| 20 | 3 | 60.9 | 75.9 | 14 / 35 | 2194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 94 | 46% |
| cx.BlestPain 1.41 | 87 | 91% |
| oog.melee.Mercutio 1.0 | 86 | 78% |
| nic.Nicator 2.4 | 45 | 58% |
| ahf.NanoAndrew .4 | 32 | 50% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| goblin.Bender 2.4 | 2 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 463 of 700 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 109 | 24% | 152 |
| nic.Nicator 2.4 | 85 | 18% | 107 |
| oog.melee.Mercutio 1.0 | 76 | 16% | 146 |
| ahf.NanoAndrew .4 | 74 | 16% | 91 |
| cx.BlestPain 1.41 | 72 | 16% | 148 |
| maribo.melee.BMV 0.1 | 28 | 6% | 34 |
| tex.Longbot 0.4 | 15 | 3% | 15 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 5 |
| goblin.Bender 2.4 | 1 | 0% | 2 |

## Melee bench: F18

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 20 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 77.2 | 269 / 700 | 2.83 | 15.7% | 47464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB400 0.3 | 1.4 | 15.7% | 269 |
| agd.Mooserwirt2 2.7 | 2.4 | 14.4% | 140 |
| uji.DBH 1.1 | 3.0 | 13.3% | 80 |
| ratosh.Nobo 0.21 | 4.0 | 12.4% | 38 |
| spinnercat.Robovirus 2.718 | 4.4 | 12.0% | 44 |
| sigterm.Sigterm 1.0 | 6.0 | 10.3% | 62 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 8.5% | 14 |
| stelo.WangRobot 1.0 | 7.9 | 7.4% | 51 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.6 | 65.4 | 13 / 35 | 2057 |
| 2 | 1 | 61.3 | 82.5 | 13 / 35 | 2242 |
| 3 | 1 | 65.2 | 87.1 | 22 / 35 | 2686 |
| 4 | 1 | 63.0 | 81.4 | 17 / 35 | 2700 |
| 5 | 1 | 61.4 | 80.4 | 15 / 35 | 2218 |
| 6 | 1 | 61.5 | 81.1 | 15 / 35 | 2151 |
| 7 | 1 | 59.7 | 77.5 | 11 / 35 | 2170 |
| 8 | 3 | 58.1 | 71.4 | 9 / 35 | 2258 |
| 9 | 2 | 57.1 | 66.8 | 9 / 35 | 2352 |
| 10 | 2 | 61.2 | 77.1 | 11 / 35 | 2615 |
| 11 | 1 | 62.9 | 80.7 | 17 / 35 | 2644 |
| 12 | 2 | 55.8 | 65.7 | 9 / 35 | 2173 |
| 13 | 1 | 60.3 | 76.8 | 13 / 35 | 2524 |
| 14 | 2 | 59.5 | 73.6 | 11 / 35 | 2530 |
| 15 | 1 | 63.1 | 83.2 | 15 / 35 | 2602 |
| 16 | 1 | 59.7 | 75.7 | 12 / 35 | 2415 |
| 17 | 1 | 61.0 | 77.5 | 12 / 35 | 2545 |
| 18 | 1 | 62.2 | 80.7 | 16 / 35 | 2475 |
| 19 | 1 | 60.4 | 79.3 | 14 / 35 | 2169 |
| 20 | 1 | 60.9 | 79.6 | 15 / 35 | 1938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 122 | 74% |
| uji.DBH 1.1 | 77 | 58% |
| spinnercat.Robovirus 2.718 | 70 | 90% |
| sigterm.Sigterm 1.0 | 59 | 56% |
| stelo.WangRobot 1.0 | 31 | 23% |
| ratosh.Nobo 0.21 | 29 | 59% |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 71% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 431 of 700 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 103 | 24% | 202 |
| uji.DBH 1.1 | 76 | 18% | 108 |
| ratosh.Nobo 0.21 | 75 | 17% | 102 |
| stelo.WangRobot 1.0 | 50 | 12% | 65 |
| sigterm.Sigterm 1.0 | 49 | 11% | 83 |
| spinnercat.Robovirus 2.718 | 39 | 9% | 76 |
| kawigi.mini.Fhqwhgads 1.1 | 24 | 6% | 42 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 15 | 3% | 18 |

## Melee bench: F19

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 85.5 | 291 / 700 | 2.30 | 16.0% | 61660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.8 | 16.1% | 141 |
| hadur117.nano.SanaroB400 0.3 | 2.1 | 16.0% | 291 |
| mld.Infinity 2.2 | 2.2 | 15.9% | 205 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.4% | 20 |
| erdnis.Rover 0.3 | 4.9 | 10.2% | 7 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.8% | 13 |
| pac.ABC 2.1 | 7.4 | 7.3% | 23 |
| mbh.Mbh 0.1 | 7.6 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.9 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 90.2 | 18 / 35 | 3425 |
| 2 | 1 | 65.6 | 86.0 | 16 / 35 | 3175 |
| 3 | 3 | 64.9 | 83.2 | 13 / 35 | 2963 |
| 4 | 1 | 66.7 | 88.6 | 17 / 35 | 3466 |
| 5 | 2 | 66.7 | 89.2 | 19 / 35 | 2988 |
| 6 | 3 | 64.2 | 83.2 | 15 / 35 | 2611 |
| 7 | 3 | 63.7 | 82.2 | 12 / 35 | 2772 |
| 8 | 2 | 64.0 | 80.6 | 11 / 35 | 2926 |
| 9 | 3 | 65.1 | 83.8 | 17 / 35 | 3029 |
| 10 | 1 | 65.8 | 86.7 | 17 / 35 | 3170 |
| 11 | 1 | 66.2 | 87.3 | 17 / 35 | 3275 |
| 12 | 3 | 65.1 | 87.0 | 15 / 35 | 2630 |
| 13 | 3 | 64.8 | 81.3 | 12 / 35 | 3329 |
| 14 | 3 | 63.8 | 80.0 | 10 / 35 | 3040 |
| 15 | 2 | 66.2 | 89.8 | 14 / 35 | 3021 |
| 16 | 1 | 65.9 | 87.6 | 16 / 35 | 3099 |
| 17 | 2 | 65.7 | 87.0 | 14 / 35 | 3336 |
| 18 | 2 | 65.6 | 87.6 | 13 / 35 | 3035 |
| 19 | 1 | 67.3 | 90.5 | 18 / 35 | 3447 |
| 20 | 3 | 62.4 | 79.0 | 7 / 35 | 2923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 244 | 57% |
| davidalves.net.DuelistMiniMelee 1.2 | 173 | 53% |
| krillr.mini.JointStrike 2.0.0 | 31 | 74% |
| pac.ABC 2.1 | 21 | 52% |
| erdnis.Rover 0.3 | 14 | 79% |
| patson.PatsonTestBot 1.0 | 12 | 83% |
| pbg.R2D2 1.0 | 4 | 75% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 411 of 700 rounds, at a mean tick of 1276. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 168 | 41% | 383 |
| mld.Infinity 2.2 | 135 | 33% | 64 |
| krillr.mini.JointStrike 2.0.0 | 38 | 9% | 75 |
| patson.PatsonTestBot 1.0 | 21 | 5% | 56 |
| erdnis.Rover 0.3 | 20 | 5% | 44 |
| pac.ABC 2.1 | 19 | 5% | 36 |
| pbg.R2D2 1.0 | 5 | 1% | 20 |
| mbh.Mbh 0.1 | 4 | 1% | 16 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 77.0 | 229 / 700 | 3.07 | 14.2% | 52819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.7% | 246 |
| hadur117.nano.SanaroB400 0.3 | 2.1 | 14.2% | 229 |
| fwb.Nine 1.0.1 | 3.7 | 11.7% | 79 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.9% | 37 |
| catcat20.Rabbit 0.001 | 4.9 | 10.3% | 55 |
| djdjdj.NanoSkunk10 1.0 | 6.4 | 8.4% | 15 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.3% | 10 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.6% | 23 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 78.4 | 12 / 35 | 2546 |
| 2 | 2 | 61.3 | 75.9 | 12 / 35 | 2699 |
| 3 | 2 | 61.2 | 78.7 | 13 / 35 | 2307 |
| 4 | 2 | 63.1 | 83.2 | 14 / 35 | 2635 |
| 5 | 2 | 60.9 | 74.0 | 12 / 35 | 2777 |
| 6 | 2 | 63.2 | 79.4 | 17 / 35 | 2769 |
| 7 | 2 | 60.6 | 74.6 | 12 / 35 | 2762 |
| 8 | 2 | 60.9 | 75.2 | 13 / 35 | 2674 |
| 9 | 2 | 61.8 | 79.7 | 12 / 35 | 2388 |
| 10 | 2 | 61.8 | 77.1 | 12 / 35 | 2728 |
| 11 | 2 | 59.7 | 73.3 | 10 / 35 | 2452 |
| 12 | 2 | 62.2 | 77.8 | 10 / 35 | 3047 |
| 13 | 2 | 62.0 | 79.4 | 14 / 35 | 2492 |
| 14 | 2 | 60.3 | 76.2 | 9 / 35 | 2546 |
| 15 | 2 | 60.6 | 76.8 | 5 / 35 | 3032 |
| 16 | 2 | 59.7 | 75.2 | 7 / 35 | 2506 |
| 17 | 2 | 59.9 | 72.4 | 8 / 35 | 2747 |
| 18 | 2 | 61.7 | 78.1 | 15 / 35 | 2676 |
| 19 | 3 | 59.6 | 72.4 | 9 / 35 | 2370 |
| 20 | 2 | 62.8 | 81.9 | 13 / 35 | 2666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 196 | 43% |
| fwb.Nine 1.0.1 | 60 | 85% |
| catcat20.Rabbit 0.001 | 41 | 71% |
| nz.jdc.nano.GridFu 1.0 | 39 | 64% |
| bayen.nut.Squirrel 1.615 | 16 | 94% |
| djdjdj.NanoSkunk10 1.0 | 14 | 71% |
| m3thos.mini.Eva01 0.5.5 | 12 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| ntc.ControlledChaos 1.1.4 | 1 | 0% |

Hadur died in 471 of 700 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 222 | 47% | 294 |
| fwb.Nine 1.0.1 | 77 | 16% | 98 |
| nz.jdc.nano.GridFu 1.0 | 61 | 13% | 97 |
| catcat20.Rabbit 0.001 | 39 | 8% | 76 |
| djdjdj.NanoSkunk10 1.0 | 26 | 6% | 45 |
| bayen.nut.Squirrel 1.615 | 20 | 4% | 34 |
| ntc.ControlledChaos 1.1.4 | 12 | 3% | 12 |
| m3thos.mini.Eva01 0.5.5 | 9 | 2% | 31 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 1% | 12 |

## Melee bench: F21

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 88.0 | 344 / 700 | 2.08 | 16.9% | 69380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.6% | 266 |
| hadur117.nano.SanaroB400 0.3 | 1.8 | 16.9% | 344 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 34 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 29 |
| eld.Hmm 1.0 | 5.5 | 8.5% | 23 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.4% | 5 |
| fire219.CatBot 1.0 | 7.5 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.1 | 6.1% | 2 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 84.4 | 16 / 35 | 3216 |
| 2 | 2 | 65.2 | 86.7 | 11 / 35 | 3519 |
| 3 | 2 | 65.8 | 85.4 | 16 / 35 | 3510 |
| 4 | 1 | 68.0 | 92.7 | 20 / 35 | 3702 |
| 5 | 1 | 67.3 | 90.8 | 20 / 35 | 3495 |
| 6 | 2 | 65.4 | 85.4 | 18 / 35 | 2975 |
| 7 | 2 | 66.5 | 86.7 | 15 / 35 | 3827 |
| 8 | 2 | 67.7 | 92.7 | 19 / 35 | 3365 |
| 9 | 2 | 65.5 | 87.9 | 17 / 35 | 2854 |
| 10 | 1 | 68.1 | 91.1 | 24 / 35 | 3854 |
| 11 | 1 | 67.0 | 87.6 | 18 / 35 | 3839 |
| 12 | 2 | 65.4 | 86.0 | 16 / 35 | 3230 |
| 13 | 2 | 65.9 | 84.1 | 17 / 35 | 3480 |
| 14 | 2 | 66.9 | 90.8 | 17 / 35 | 3528 |
| 15 | 2 | 65.4 | 85.7 | 14 / 35 | 3699 |
| 16 | 2 | 65.2 | 87.3 | 18 / 35 | 3062 |
| 17 | 1 | 67.6 | 87.6 | 18 / 35 | 4088 |
| 18 | 2 | 65.8 | 87.0 | 17 / 35 | 3428 |
| 19 | 2 | 67.3 | 90.2 | 16 / 35 | 3760 |
| 20 | 2 | 65.9 | 89.5 | 17 / 35 | 2949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 378 | 53% |
| dummy.mini.Scimitar 1.01 | 78 | 88% |
| eld.Hmm 1.0 | 44 | 84% |
| cf.RiO.RiOx 4.2.1 | 44 | 57% |
| oa.weak.BotherBot 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 5 | 60% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 359 of 700 rounds, at a mean tick of 1689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 209 | 58% | 352 |
| dummy.mini.Scimitar 1.01 | 56 | 16% | 162 |
| cf.RiO.RiOx 4.2.1 | 49 | 14% | 69 |
| eld.Hmm 1.0 | 13 | 4% | 65 |
| PSW.Relentless 0.1 | 9 | 3% | 10 |
| oa.weak.BotherBot 0.1 | 8 | 2% | 22 |
| fire219.CatBot 1.0 | 7 | 2% | 7 |
| el.JumpShoot 0.2 | 5 | 1% | 11 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 85.5 | 290 / 700 | 2.30 | 16.0% | 61508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.6% | 253 |
| hadur117.nano.SanaroB400 0.3 | 2.2 | 16.0% | 290 |
| cre.Karolos 0.32 | 2.9 | 14.5% | 105 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 32 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.1% | 14 |
| cw.megas.Blade 0.8 | 7.0 | 8.3% | 1 |
| sample.Walls 1.0 | 7.2 | 8.2% | 6 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 85.7 | 13 / 35 | 3174 |
| 2 | 2 | 67.1 | 88.9 | 18 / 35 | 3254 |
| 3 | 3 | 64.8 | 83.5 | 13 / 35 | 3183 |
| 4 | 2 | 66.7 | 87.3 | 18 / 35 | 3271 |
| 5 | 3 | 65.3 | 85.7 | 15 / 35 | 2849 |
| 6 | 2 | 66.0 | 88.6 | 18 / 35 | 2852 |
| 7 | 2 | 66.4 | 89.8 | 16 / 35 | 2626 |
| 8 | 2 | 66.0 | 86.3 | 13 / 35 | 3273 |
| 9 | 2 | 65.6 | 83.8 | 16 / 35 | 3133 |
| 10 | 2 | 63.8 | 85.4 | 11 / 35 | 2892 |
| 11 | 3 | 63.8 | 78.7 | 13 / 35 | 2885 |
| 12 | 2 | 66.1 | 86.3 | 17 / 35 | 3019 |
| 13 | 2 | 64.9 | 81.9 | 14 / 35 | 2886 |
| 14 | 2 | 65.3 | 85.1 | 13 / 35 | 3042 |
| 15 | 2 | 66.0 | 85.4 | 11 / 35 | 3341 |
| 16 | 2 | 66.8 | 87.3 | 14 / 35 | 3731 |
| 17 | 2 | 65.5 | 83.5 | 15 / 35 | 3318 |
| 18 | 2 | 66.2 | 87.3 | 14 / 35 | 3029 |
| 19 | 2 | 65.2 | 84.4 | 14 / 35 | 2755 |
| 20 | 2 | 65.7 | 85.1 | 14 / 35 | 2995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 258 | 58% |
| cre.Karolos 0.32 | 110 | 49% |
| stelo.AreaTargetingBot 1.1 | 44 | 64% |
| sample.Walls 1.0 | 33 | 97% |
| stelo.RamTrackSurfer 1.2 | 19 | 79% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 412 of 700 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 208 | 50% | 373 |
| cre.Karolos 0.32 | 114 | 28% | 163 |
| stelo.AreaTargetingBot 1.1 | 50 | 12% | 79 |
| stelo.RamTrackSurfer 1.2 | 18 | 4% | 41 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 2% | 15 |
| cw.megas.Blade 0.8 | 6 | 1% | 13 |
| sample.Walls 1.0 | 5 | 1% | 14 |
| rrh.Iwillfindyou 2.0 | 2 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F24

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 63.7 | 132 / 700 | 4.26 | 11.3% | 37994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 14.5% | 158 |
| florent.XSeries.X2 0.12 | 2.4 | 13.6% | 127 |
| davidalves.Phoenix 0.54 | 2.8 | 13.1% | 138 |
| pedersen.Ugluk 1.1.1 | 3.5 | 12.4% | 87 |
| hadur117.nano.SanaroB400 0.3 | 4.9 | 11.3% | 132 |
| oog.melee.Corsair 1.0 | 6.4 | 9.6% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.9% | 39 |
| lunchie.Lunchbox 0.93 | 8.0 | 7.0% | 12 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 1 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.8 | 63.8 | 9 / 35 | 1564 |
| 2 | 4 | 57.4 | 69.2 | 9 / 35 | 2085 |
| 3 | 5 | 54.7 | 62.9 | 8 / 35 | 1888 |
| 4 | 5 | 53.0 | 59.7 | 5 / 35 | 1754 |
| 5 | 5 | 57.1 | 68.9 | 6 / 35 | 1979 |
| 6 | 5 | 55.6 | 64.8 | 6 / 35 | 2045 |
| 7 | 5 | 53.4 | 60.6 | 5 / 35 | 1860 |
| 8 | 5 | 54.6 | 61.6 | 7 / 35 | 2004 |
| 9 | 5 | 53.8 | 61.0 | 6 / 35 | 1972 |
| 10 | 4 | 57.1 | 69.5 | 9 / 35 | 1897 |
| 11 | 5 | 52.7 | 59.0 | 5 / 35 | 1657 |
| 12 | 4 | 54.8 | 62.5 | 6 / 35 | 1934 |
| 13 | 5 | 54.0 | 60.6 | 7 / 35 | 1920 |
| 14 | 5 | 53.9 | 59.7 | 6 / 35 | 2128 |
| 15 | 6 | 52.0 | 56.8 | 4 / 35 | 1778 |
| 16 | 4 | 56.4 | 68.9 | 5 / 35 | 2109 |
| 17 | 5 | 54.8 | 63.8 | 6 / 35 | 1740 |
| 18 | 5 | 56.3 | 67.6 | 8 / 35 | 1757 |
| 19 | 5 | 57.3 | 67.9 | 7 / 35 | 2055 |
| 20 | 5 | 55.6 | 66.0 | 8 / 35 | 1868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 81 | 51% |
| davidalves.Phoenix 0.54 | 42 | 52% |
| florent.XSeries.X2 0.12 | 38 | 79% |
| pedersen.Ugluk 1.1.1 | 27 | 59% |
| stelo.SoJNanoMelee 1.1 | 25 | 28% |
| oog.melee.Corsair 1.0 | 17 | 88% |
| lunchie.Lunchbox 0.93 | 3 | 0% |

Hadur died in 570 of 700 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 130 | 23% | 167 |
| davidalves.Phoenix 0.54 | 113 | 20% | 132 |
| florent.XSeries.X2 0.12 | 104 | 18% | 134 |
| pedersen.Ugluk 1.1.1 | 100 | 18% | 112 |
| stelo.SoJNanoMelee 1.1 | 55 | 10% | 62 |
| lunchie.Lunchbox 0.93 | 25 | 4% | 27 |
| oog.melee.Corsair 1.0 | 21 | 4% | 44 |
| evd.X1 0.01 | 11 | 2% | 11 |
| as.FrankTheTank 1.3 | 9 | 2% | 10 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 76.4 | 236 / 700 | 2.89 | 15.3% | 40004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.7 | 16.2% | 155 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 15.8% | 145 |
| hadur117.nano.SanaroB400 0.3 | 2.4 | 15.3% | 236 |
| jdw.Hurricane 1.4 | 4.1 | 13.0% | 75 |
| ds.Oo 2.2 | 5.4 | 10.3% | 48 |
| gjr.Cephalosporin 0.1 | 5.8 | 9.6% | 32 |
| awesomeness.Elite 1.0 | 7.3 | 7.6% | 6 |
| adt.Ar2 1.1 | 7.6 | 7.5% | 6 |
| amk.ChumbaMini 0.2 | 9.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 78.9 | 17 / 35 | 2052 |
| 2 | 3 | 60.8 | 77.5 | 14 / 35 | 1833 |
| 3 | 3 | 60.3 | 78.2 | 11 / 35 | 1880 |
| 4 | 2 | 61.8 | 79.3 | 13 / 35 | 1931 |
| 5 | 1 | 62.7 | 82.5 | 15 / 35 | 2102 |
| 6 | 3 | 60.3 | 76.4 | 12 / 35 | 1788 |
| 7 | 3 | 61.5 | 79.3 | 13 / 35 | 1929 |
| 8 | 2 | 60.5 | 76.4 | 12 / 35 | 1963 |
| 9 | 3 | 59.0 | 71.1 | 10 / 35 | 1972 |
| 10 | 2 | 58.4 | 70.4 | 10 / 35 | 2116 |
| 11 | 3 | 59.6 | 70.7 | 13 / 35 | 1870 |
| 12 | 2 | 60.9 | 78.9 | 13 / 35 | 1996 |
| 13 | 3 | 59.6 | 70.7 | 12 / 35 | 2226 |
| 14 | 2 | 60.7 | 77.1 | 11 / 35 | 2205 |
| 15 | 2 | 61.1 | 78.2 | 9 / 35 | 2246 |
| 16 | 2 | 60.5 | 77.9 | 11 / 35 | 2012 |
| 17 | 3 | 62.9 | 83.2 | 13 / 35 | 1990 |
| 18 | 1 | 60.5 | 76.8 | 12 / 35 | 1915 |
| 19 | 2 | 60.6 | 77.9 | 10 / 35 | 2138 |
| 20 | 4 | 56.0 | 66.4 | 5 / 35 | 1840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 151 | 44% |
| voidious.micro.BlitzBat 1.05 | 117 | 42% |
| jdw.Hurricane 1.4 | 71 | 92% |
| ds.Oo 2.2 | 32 | 56% |
| gjr.Cephalosporin 0.1 | 26 | 65% |
| adt.Ar2 1.1 | 14 | 71% |
| awesomeness.Elite 1.0 | 8 | 88% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 467 of 700 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 148 | 32% | 205 |
| voidious.mini.BrokenSword 2.0.3 | 136 | 29% | 202 |
| jdw.Hurricane 1.4 | 53 | 11% | 105 |
| ds.Oo 2.2 | 50 | 11% | 70 |
| gjr.Cephalosporin 0.1 | 31 | 7% | 50 |
| awesomeness.Elite 1.0 | 24 | 5% | 30 |
| adt.Ar2 1.1 | 16 | 3% | 28 |
| amk.ChumbaMini 0.2 | 8 | 2% | 10 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 73.7 | 159 / 700 | 3.37 | 13.1% | 52798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 17.0% | 269 |
| shu.nitro.LENIN .T34 | 3.0 | 12.9% | 132 |
| hadur117.nano.SanaroB400 0.3 | 3.1 | 13.1% | 159 |
| lrem.Spectre 0.4.4 | 3.5 | 12.7% | 71 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 10.9% | 25 |
| js.PinBall 1.6 | 5.4 | 11.0% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.4% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.3% | 3 |
| sample.SpinBot 1.0 | 8.9 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 66.0 | 7 / 35 | 2573 |
| 2 | 3 | 61.5 | 79.0 | 8 / 35 | 2710 |
| 3 | 3 | 59.6 | 72.1 | 11 / 35 | 2237 |
| 4 | 2 | 61.9 | 80.6 | 11 / 35 | 2629 |
| 5 | 4 | 58.1 | 65.7 | 8 / 35 | 2801 |
| 6 | 4 | 58.4 | 70.8 | 8 / 35 | 2314 |
| 7 | 2 | 62.1 | 79.7 | 9 / 35 | 2845 |
| 8 | 2 | 61.3 | 75.6 | 8 / 35 | 2993 |
| 9 | 3 | 59.3 | 73.0 | 6 / 35 | 2611 |
| 10 | 3 | 61.0 | 75.9 | 8 / 35 | 2653 |
| 11 | 2 | 61.3 | 76.8 | 12 / 35 | 2558 |
| 12 | 4 | 58.5 | 70.2 | 4 / 35 | 2488 |
| 13 | 2 | 61.8 | 77.5 | 8 / 35 | 2872 |
| 14 | 3 | 60.0 | 73.0 | 8 / 35 | 2651 |
| 15 | 3 | 59.5 | 71.7 | 7 / 35 | 2656 |
| 16 | 4 | 60.3 | 73.3 | 7 / 35 | 2684 |
| 17 | 3 | 59.7 | 71.4 | 7 / 35 | 2942 |
| 18 | 3 | 60.6 | 77.8 | 7 / 35 | 2580 |
| 19 | 2 | 59.4 | 73.0 | 8 / 35 | 2493 |
| 20 | 4 | 58.5 | 69.8 | 7 / 35 | 2508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 141 | 35% |
| shu.nitro.LENIN .T34 | 77 | 29% |
| lrem.Spectre 0.4.4 | 70 | 64% |
| js.PinBall 1.6 | 22 | 77% |
| gh.mini.GrubbmOne 1.0 | 19 | 63% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 50% |

Hadur died in 542 of 700 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 202 | 37% | 249 |
| shu.nitro.LENIN .T34 | 88 | 16% | 115 |
| lrem.Spectre 0.4.4 | 77 | 14% | 108 |
| gh.mini.GrubbmOne 1.0 | 60 | 11% | 76 |
| js.PinBall 1.6 | 55 | 10% | 72 |
| jaybot.adv.bots.JayBot 2.0 | 36 | 7% | 49 |
| sample.SpinBot 1.0 | 16 | 3% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 1% | 13 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 73.3 | 251 / 700 | 3.40 | 13.6% | 47897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.3 | 15.3% | 219 |
| hadur117.nano.SanaroB400 0.3 | 2.4 | 13.6% | 251 |
| wee.Gem 1.8.4 | 3.2 | 12.5% | 110 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.6% | 63 |
| EH.Eagle 1.0.6 | 4.9 | 10.4% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 8.8% | 10 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.0% | 13 |
| joe.ADinosaur 1.0 | 7.6 | 7.8% | 10 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.8% | 5 |
| cs.Grudge 1.0 | 9.4 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 77.1 | 17 / 35 | 2186 |
| 2 | 3 | 59.8 | 69.2 | 10 / 35 | 2904 |
| 3 | 5 | 52.4 | 44.8 | 6 / 35 | 3497 |
| 4 | 2 | 60.5 | 76.8 | 15 / 35 | 1909 |
| 5 | 2 | 62.0 | 79.7 | 17 / 35 | 2444 |
| 6 | 1 | 61.7 | 78.4 | 15 / 35 | 2503 |
| 7 | 3 | 60.1 | 77.8 | 11 / 35 | 2110 |
| 8 | 2 | 62.6 | 79.7 | 15 / 35 | 2624 |
| 9 | 6 | 50.9 | 41.9 | 4 / 35 | 3480 |
| 10 | 1 | 58.5 | 72.4 | 11 / 35 | 2264 |
| 11 | 3 | 57.5 | 68.9 | 14 / 35 | 1846 |
| 12 | 2 | 63.1 | 85.4 | 15 / 35 | 2138 |
| 13 | 2 | 61.6 | 73.0 | 12 / 35 | 3144 |
| 14 | 2 | 60.6 | 76.2 | 14 / 35 | 2155 |
| 15 | 3 | 58.0 | 71.4 | 10 / 35 | 1997 |
| 16 | 2 | 61.8 | 82.2 | 14 / 35 | 1959 |
| 17 | 2 | 60.0 | 75.2 | 11 / 35 | 2234 |
| 18 | 2 | 60.1 | 76.2 | 12 / 35 | 2166 |
| 19 | 1 | 62.1 | 82.5 | 16 / 35 | 2217 |
| 20 | 2 | 60.3 | 76.8 | 12 / 35 | 2120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 178 | 67% |
| wee.Gem 1.8.4 | 82 | 60% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 67% |
| EH.Eagle 1.0.6 | 37 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 9 | 56% |
| joe.ADinosaur 1.0 | 4 | 50% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 449 of 700 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 133 | 30% | 245 |
| wee.Gem 1.8.4 | 80 | 18% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 78 | 17% | 109 |
| joe.ADinosaur 1.0 | 36 | 8% | 38 |
| EH.Eagle 1.0.6 | 30 | 7% | 67 |
| throxbot.ThroxBot 0.1 | 30 | 7% | 38 |
| cs.Grudge 1.0 | 24 | 5% | 23 |
| caimano.Furia_Ceca 0.22 | 20 | 4% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 18 | 4% | 26 |

## Melee bench: F28

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 83.2 | 316 / 700 | 2.51 | 15.6% | 52956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.5% | 202 |
| hadur117.nano.SanaroB400 0.3 | 1.8 | 15.6% | 316 |
| uji.Antique 1.0 | 3.3 | 12.2% | 80 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.3% | 61 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.5% | 16 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 8 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.9% | 7 |
| matt.advanced.Katana 1.0 | 8.4 | 6.5% | 8 |
| stelo.PianistNano 1.2 | 8.9 | 5.8% | 1 |
| stelo.Lifestealer 1.0 | 9.6 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 93.7 | 23 / 35 | 2879 |
| 2 | 2 | 64.1 | 85.1 | 17 / 35 | 2563 |
| 3 | 2 | 64.6 | 85.4 | 16 / 35 | 2915 |
| 4 | 2 | 61.5 | 79.0 | 13 / 35 | 2143 |
| 5 | 2 | 64.1 | 85.1 | 17 / 35 | 2511 |
| 6 | 2 | 63.8 | 82.2 | 17 / 35 | 2646 |
| 7 | 2 | 64.3 | 86.0 | 18 / 35 | 2473 |
| 8 | 2 | 62.4 | 79.0 | 14 / 35 | 2621 |
| 9 | 2 | 61.6 | 76.5 | 13 / 35 | 2513 |
| 10 | 1 | 63.7 | 82.9 | 16 / 35 | 2872 |
| 11 | 2 | 63.3 | 81.9 | 14 / 35 | 2568 |
| 12 | 2 | 62.3 | 77.8 | 14 / 35 | 2748 |
| 13 | 1 | 64.4 | 86.3 | 17 / 35 | 2665 |
| 14 | 2 | 64.1 | 85.4 | 15 / 35 | 2576 |
| 15 | 2 | 62.5 | 81.9 | 11 / 35 | 2646 |
| 16 | 2 | 63.1 | 82.5 | 16 / 35 | 2529 |
| 17 | 1 | 63.0 | 80.6 | 16 / 35 | 2583 |
| 18 | 2 | 63.9 | 83.8 | 14 / 35 | 3072 |
| 19 | 1 | 64.6 | 84.4 | 20 / 35 | 2759 |
| 20 | 2 | 63.6 | 84.8 | 15 / 35 | 2674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 282 | 65% |
| uji.Antique 1.0 | 87 | 75% |
| qohnil.blot.BlotBot 3.61 | 54 | 52% |
| pfvicm.Sobieski 7.2.3b | 20 | 80% |
| ahr.ice.Ice 1.0.2 | 13 | 69% |
| amk.ChumbaWumba 0.3 | 9 | 78% |
| matt.advanced.Katana 1.0 | 7 | 71% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 384 of 700 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 164 | 43% | 302 |
| uji.Antique 1.0 | 62 | 16% | 144 |
| pfvicm.Sobieski 7.2.3b | 53 | 14% | 69 |
| qohnil.blot.BlotBot 3.61 | 42 | 11% | 78 |
| amk.ChumbaWumba 0.3 | 28 | 7% | 37 |
| ahr.ice.Ice 1.0.2 | 17 | 4% | 36 |
| stelo.Lifestealer 1.0 | 8 | 2% | 10 |
| matt.advanced.Katana 1.0 | 5 | 1% | 13 |
| stelo.PianistNano 1.2 | 5 | 1% | 7 |

## Melee bench: F29

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 73.9 | 178 / 700 | 3.35 | 13.8% | 50169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.7% | 238 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.7% | 172 |
| hadur117.nano.SanaroB400 0.3 | 3.1 | 13.8% | 178 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 37 |
| jok.PheonixM 0.1.2 | 4.8 | 11.2% | 25 |
| ph.melee.ArcherME 0.3 | 6.6 | 7.9% | 3 |
| DBall.Anarchy 0.1 | 6.6 | 7.7% | 40 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 1 |
| jangs.ns51 1.0 | 9.4 | 4.4% | 3 |
| ap.Frederick 1.1 | 9.6 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 72.7 | 9 / 35 | 2579 |
| 2 | 3 | 60.4 | 73.3 | 6 / 35 | 2502 |
| 3 | 4 | 61.3 | 75.2 | 10 / 35 | 2423 |
| 4 | 3 | 61.8 | 76.2 | 13 / 35 | 2290 |
| 5 | 2 | 64.4 | 82.2 | 13 / 35 | 2808 |
| 6 | 3 | 62.7 | 79.4 | 11 / 35 | 2450 |
| 7 | 4 | 59.8 | 68.6 | 9 / 35 | 2556 |
| 8 | 3 | 58.1 | 66.3 | 8 / 35 | 2355 |
| 9 | 3 | 61.4 | 75.2 | 8 / 35 | 2505 |
| 10 | 3 | 60.4 | 71.7 | 8 / 35 | 2614 |
| 11 | 2 | 62.1 | 76.2 | 12 / 35 | 2581 |
| 12 | 2 | 61.8 | 78.1 | 6 / 35 | 2386 |
| 13 | 3 | 62.6 | 79.7 | 11 / 35 | 2448 |
| 14 | 3 | 59.8 | 71.7 | 6 / 35 | 2530 |
| 15 | 3 | 61.1 | 74.0 | 9 / 35 | 2491 |
| 16 | 4 | 60.6 | 70.2 | 9 / 35 | 2627 |
| 17 | 3 | 60.8 | 73.3 | 8 / 35 | 2294 |
| 18 | 3 | 61.0 | 73.3 | 7 / 35 | 2578 |
| 19 | 4 | 60.4 | 71.7 | 5 / 35 | 2649 |
| 20 | 4 | 60.2 | 69.5 | 10 / 35 | 2503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 140 | 16% |
| zyx.mega.YersiniaPestis 3.1 | 106 | 70% |
| myl.micro.Troodon 1.10 | 48 | 83% |
| DBall.Anarchy 0.1 | 32 | 50% |
| jok.PheonixM 0.1.2 | 19 | 89% |
| jangs.ns51 1.0 | 6 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |

Hadur died in 525 of 700 rounds, at a mean tick of 1348. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 263 | 50% | 284 |
| zyx.mega.YersiniaPestis 3.1 | 98 | 19% | 171 |
| myl.micro.Troodon 1.10 | 58 | 11% | 97 |
| jok.PheonixM 0.1.2 | 47 | 9% | 65 |
| DBall.Anarchy 0.1 | 28 | 5% | 47 |
| ph.melee.ArcherME 0.3 | 16 | 3% | 20 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 2% | 8 |
| jangs.ns51 1.0 | 7 | 1% | 8 |

## Melee bench: F30

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 63.4 | 97 / 700 | 3.93 | 12.4% | 42921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.9 | 16.2% | 214 |
| oog.melee.Capulet 1.2 | 2.1 | 15.9% | 164 |
| stelo.PastFuture 2.3.2 | 2.1 | 16.0% | 132 |
| hadur117.nano.SanaroB400 0.3 | 4.0 | 12.4% | 97 |
| intruder.PrairieWolf 2.61 | 5.7 | 9.9% | 40 |
| fowl3628800.LightningBolt 2.6.0 | 6.6 | 9.1% | 29 |
| tripphippy.Alice 1.1 | 6.9 | 8.9% | 19 |
| ntc.Opposite 1.5 | 6.9 | 8.7% | 7 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.4 | 67.5 | 7 / 35 | 1837 |
| 2 | 4 | 56.4 | 67.9 | 7 / 35 | 2019 |
| 3 | 4 | 58.9 | 70.0 | 9 / 35 | 2560 |
| 4 | 4 | 55.5 | 61.1 | 4 / 35 | 2303 |
| 5 | 4 | 53.5 | 56.8 | 4 / 35 | 2213 |
| 6 | 4 | 56.3 | 63.9 | 4 / 35 | 2600 |
| 7 | 4 | 56.3 | 66.1 | 8 / 35 | 2133 |
| 8 | 4 | 57.0 | 65.0 | 6 / 35 | 2407 |
| 9 | 4 | 54.9 | 67.5 | 6 / 35 | 1506 |
| 10 | 4 | 55.1 | 62.1 | 3 / 35 | 2210 |
| 11 | 4 | 53.8 | 60.4 | 4 / 35 | 1866 |
| 12 | 4 | 56.1 | 66.1 | 3 / 35 | 2100 |
| 13 | 4 | 54.5 | 62.5 | 3 / 35 | 2004 |
| 14 | 4 | 52.7 | 54.3 | 2 / 35 | 2254 |
| 15 | 4 | 57.1 | 67.1 | 4 / 35 | 2341 |
| 16 | 4 | 54.9 | 63.2 | 5 / 35 | 2039 |
| 17 | 4 | 52.6 | 58.9 | 3 / 35 | 1986 |
| 18 | 4 | 55.3 | 61.1 | 3 / 35 | 2443 |
| 19 | 4 | 54.6 | 60.4 | 6 / 35 | 2149 |
| 20 | 4 | 55.9 | 65.4 | 6 / 35 | 1951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 95 | 26% |
| oog.melee.Capulet 1.2 | 64 | 31% |
| stelo.PastFuture 2.3.2 | 53 | 51% |
| intruder.PrairieWolf 2.61 | 18 | 72% |
| fowl3628800.LightningBolt 2.6.0 | 15 | 47% |
| tripphippy.Alice 1.1 | 12 | 42% |

Hadur died in 604 of 700 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 156 | 26% | 177 |
| stelo.PastFuture 2.3.2 | 153 | 25% | 180 |
| oog.melee.Capulet 1.2 | 124 | 21% | 152 |
| ntc.Opposite 1.5 | 51 | 8% | 52 |
| tripphippy.Alice 1.1 | 43 | 7% | 51 |
| intruder.PrairieWolf 2.61 | 36 | 6% | 47 |
| fowl3628800.LightningBolt 2.6.0 | 36 | 6% | 35 |
| GarmBox.Anger 1.0 | 5 | 1% | 5 |

## Melee bench: F31

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 63.1 | 92 / 700 | 4.32 | 11.0% | 36104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 349 |
| gh.mini.Griezel 0.2 | 2.2 | 13.8% | 153 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 11.9% | 42 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.4% | 33 |
| hadur117.nano.SanaroB400 0.3 | 4.6 | 11.0% | 92 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.8% | 22 |
| fm.mammillarias 1.3 | 7.6 | 6.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.6 | 6.6% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 70.2 | 5 / 35 | 1788 |
| 2 | 3 | 56.7 | 68.9 | 6 / 35 | 1562 |
| 3 | 5 | 54.6 | 61.3 | 6 / 35 | 1852 |
| 4 | 5 | 51.7 | 57.5 | 2 / 35 | 1621 |
| 5 | 5 | 53.2 | 59.0 | 3 / 35 | 1953 |
| 6 | 4 | 58.2 | 70.2 | 5 / 35 | 1872 |
| 7 | 6 | 52.8 | 57.8 | 3 / 35 | 1775 |
| 8 | 4 | 55.4 | 63.5 | 3 / 35 | 1852 |
| 9 | 4 | 54.9 | 65.1 | 5 / 35 | 1529 |
| 10 | 4 | 55.6 | 65.1 | 6 / 35 | 1975 |
| 11 | 3 | 56.5 | 63.8 | 5 / 35 | 2227 |
| 12 | 5 | 56.1 | 66.0 | 7 / 35 | 1696 |
| 13 | 4 | 55.7 | 63.2 | 7 / 35 | 1860 |
| 14 | 5 | 53.9 | 60.6 | 3 / 35 | 2071 |
| 15 | 4 | 55.0 | 64.4 | 4 / 35 | 1672 |
| 16 | 4 | 57.1 | 69.8 | 4 / 35 | 1774 |
| 17 | 6 | 54.1 | 61.9 | 6 / 35 | 1646 |
| 18 | 5 | 53.4 | 58.7 | 4 / 35 | 1783 |
| 19 | 5 | 53.4 | 59.0 | 4 / 35 | 1942 |
| 20 | 6 | 52.3 | 56.2 | 4 / 35 | 1654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 110 | 35% |
| gh.mini.Griezel 0.2 | 96 | 43% |
| spinnercat.micro.Tyger 0.1 | 18 | 22% |
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 608 of 700 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 158 | 26% | 200 |
| abc.Shadow 3.84i | 158 | 26% | 195 |
| spinnercat.micro.Tyger 0.1 | 102 | 17% | 109 |
| d414.nano.Quantum 1.0.0 | 75 | 12% | 78 |
| gh.nano.Grofvuil 0.2 | 50 | 8% | 54 |
| timmit.nano.TimDog 0.33 | 25 | 4% | 25 |
| fm.mammillarias 1.3 | 23 | 4% | 24 |
| Gecko.ultimateGeckoBot 1.0 | 13 | 2% | 13 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 79.5 | 282 / 700 | 2.85 | 14.7% | 52759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.5% | 201 |
| hadur117.nano.SanaroB400 0.3 | 1.9 | 14.7% | 282 |
| apc.botM 3.0 | 3.1 | 12.4% | 90 |
| lxx.ConceptA 0.8 | 4.4 | 11.1% | 22 |
| vjik.UnViolation 1.1 | 4.7 | 10.7% | 45 |
| bayen.UbaMicro 1.4 | 5.9 | 9.5% | 18 |
| panzer.Panzer 0.2 | 7.5 | 7.5% | 3 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 19 |
| conscience.Electron 1.3g | 8.9 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 81.9 | 16 / 35 | 2359 |
| 2 | 2 | 62.4 | 83.8 | 12 / 35 | 2586 |
| 3 | 1 | 63.0 | 82.5 | 17 / 35 | 2722 |
| 4 | 2 | 61.9 | 81.6 | 10 / 35 | 2854 |
| 5 | 2 | 63.4 | 85.7 | 17 / 35 | 2463 |
| 6 | 2 | 59.4 | 71.1 | 10 / 35 | 2865 |
| 7 | 2 | 59.7 | 72.1 | 14 / 35 | 2507 |
| 8 | 1 | 63.2 | 81.6 | 18 / 35 | 2857 |
| 9 | 3 | 60.1 | 74.0 | 11 / 35 | 2764 |
| 10 | 2 | 61.6 | 78.1 | 12 / 35 | 2897 |
| 11 | 2 | 58.4 | 70.8 | 9 / 35 | 2397 |
| 12 | 2 | 63.4 | 83.2 | 16 / 35 | 3010 |
| 13 | 2 | 58.4 | 73.3 | 12 / 35 | 2221 |
| 14 | 2 | 62.6 | 81.3 | 16 / 35 | 2658 |
| 15 | 2 | 63.5 | 85.1 | 14 / 35 | 2598 |
| 16 | 1 | 65.9 | 92.1 | 21 / 35 | 2855 |
| 17 | 2 | 59.6 | 71.7 | 13 / 35 | 2612 |
| 18 | 3 | 60.3 | 75.6 | 11 / 35 | 2453 |
| 19 | 2 | 61.7 | 80.0 | 16 / 35 | 2330 |
| 20 | 1 | 63.3 | 83.8 | 17 / 35 | 2751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 212 | 55% |
| apc.botM 3.0 | 88 | 77% |
| lxx.ConceptA 0.8 | 42 | 81% |
| vjik.UnViolation 1.1 | 36 | 69% |
| donjezza.Jezza 1.0 | 22 | 41% |
| yk.JahMicro 1.0 | 19 | 63% |
| bayen.UbaMicro 1.4 | 19 | 58% |
| panzer.Panzer 0.2 | 7 | 86% |

Hadur died in 419 of 700 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 148 | 35% | 263 |
| lxx.ConceptA 0.8 | 77 | 18% | 98 |
| apc.botM 3.0 | 51 | 12% | 129 |
| bayen.UbaMicro 1.4 | 44 | 11% | 54 |
| vjik.UnViolation 1.1 | 33 | 8% | 67 |
| panzer.Panzer 0.2 | 20 | 5% | 22 |
| yk.JahMicro 1.0 | 19 | 5% | 29 |
| donjezza.Jezza 1.0 | 18 | 4% | 28 |
| conscience.Electron 1.3g | 9 | 2% | 10 |

## Melee bench: F33

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.4 | 231 / 700 | 2.73 | 16.1% | 52059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 19.2% | 197 |
| hadur117.nano.SanaroB400 0.3 | 2.5 | 16.1% | 231 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 15.7% | 158 |
| labg.Cataclysm 2.05 | 4.0 | 12.7% | 77 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.4 | 10.2% | 29 |
| baal.nano.N 1.42 | 5.6 | 10.0% | 3 |
| zyx.micro.Ant 1.1 | 7.2 | 6.4% | 3 |
| sanja.First 0.1 | 7.9 | 5.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.9 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 71.8 | 9 / 35 | 2559 |
| 2 | 3 | 61.5 | 77.5 | 6 / 35 | 2534 |
| 3 | 3 | 62.6 | 79.3 | 11 / 35 | 2625 |
| 4 | 3 | 63.4 | 81.1 | 13 / 35 | 2595 |
| 5 | 2 | 63.4 | 80.4 | 13 / 35 | 2584 |
| 6 | 2 | 61.4 | 75.7 | 10 / 35 | 2574 |
| 7 | 2 | 63.0 | 81.8 | 10 / 35 | 2529 |
| 8 | 3 | 61.6 | 72.5 | 11 / 35 | 2774 |
| 9 | 3 | 63.6 | 80.4 | 11 / 35 | 2746 |
| 10 | 2 | 65.2 | 86.4 | 14 / 35 | 2928 |
| 11 | 2 | 63.9 | 82.1 | 12 / 35 | 2816 |
| 12 | 2 | 61.9 | 77.1 | 13 / 35 | 2418 |
| 13 | 3 | 62.5 | 78.6 | 12 / 35 | 2483 |
| 14 | 3 | 60.9 | 73.6 | 12 / 35 | 2299 |
| 15 | 2 | 63.8 | 81.8 | 14 / 35 | 2611 |
| 16 | 3 | 62.8 | 78.6 | 10 / 35 | 2629 |
| 17 | 2 | 64.3 | 81.4 | 17 / 35 | 2476 |
| 18 | 2 | 61.8 | 75.7 | 12 / 35 | 2723 |
| 19 | 2 | 62.6 | 77.9 | 11 / 35 | 2593 |
| 20 | 3 | 61.0 | 74.6 | 10 / 35 | 2563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 190 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 144 | 23% |
| labg.Cataclysm 2.05 | 50 | 58% |
| kinsen.melee.Angsaichmophobia 1.8c | 44 | 70% |
| baal.nano.N 1.42 | 13 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 100% |
| zyx.micro.Ant 1.1 | 4 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 470 of 700 rounds, at a mean tick of 1633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 173 | 37% | 216 |
| maribo.Quester 0.3 | 172 | 37% | 306 |
| labg.Cataclysm 2.05 | 46 | 10% | 75 |
| kinsen.melee.Angsaichmophobia 1.8c | 44 | 9% | 51 |
| baal.nano.N 1.42 | 18 | 4% | 30 |
| zyx.micro.Ant 1.1 | 13 | 3% | 16 |
| sanja.First 0.1 | 3 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.3 | 203 / 700 | 3.14 | 13.8% | 52430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.3% | 214 |
| kid.Gladiator .7.2 | 1.6 | 17.1% | 197 |
| hadur117.nano.SanaroB400 0.3 | 3.1 | 13.8% | 203 |
| jcs.Seth 1.8 | 4.4 | 11.7% | 47 |
| tcf.Reach 3 | 4.7 | 11.2% | 32 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 1 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 71.4 | 8 / 35 | 2667 |
| 2 | 4 | 59.0 | 67.0 | 8 / 35 | 2556 |
| 3 | 3 | 63.9 | 82.9 | 11 / 35 | 2874 |
| 4 | 3 | 59.7 | 70.8 | 7 / 35 | 2375 |
| 5 | 3 | 63.5 | 81.6 | 16 / 35 | 2511 |
| 6 | 3 | 59.7 | 69.8 | 6 / 35 | 2573 |
| 7 | 3 | 62.1 | 76.2 | 13 / 35 | 2536 |
| 8 | 3 | 60.5 | 73.3 | 10 / 35 | 2212 |
| 9 | 3 | 60.8 | 73.0 | 11 / 35 | 2273 |
| 10 | 3 | 63.9 | 80.6 | 12 / 35 | 3089 |
| 11 | 4 | 60.8 | 75.6 | 9 / 35 | 2281 |
| 12 | 3 | 62.3 | 78.7 | 11 / 35 | 2488 |
| 13 | 3 | 62.9 | 80.3 | 13 / 35 | 2277 |
| 14 | 3 | 61.8 | 75.6 | 11 / 35 | 2769 |
| 15 | 3 | 64.0 | 80.3 | 8 / 35 | 3239 |
| 16 | 3 | 61.8 | 77.5 | 10 / 35 | 2703 |
| 17 | 3 | 61.6 | 78.7 | 7 / 35 | 2527 |
| 18 | 3 | 62.1 | 77.1 | 9 / 35 | 2531 |
| 19 | 3 | 62.9 | 77.5 | 14 / 35 | 2744 |
| 20 | 3 | 62.9 | 77.5 | 9 / 35 | 3205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 159 | 66% |
| kid.Gladiator .7.2 | 114 | 48% |
| jcs.Seth 1.8 | 41 | 61% |
| tcf.Reach 3 | 21 | 57% |
| cli.Dancer 1.1 | 7 | 43% |
| ratosh.Wesco 1.4 | 3 | 67% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 501 of 700 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 195 | 39% | 234 |
| stelo.Spread 0.9 | 168 | 34% | 281 |
| jcs.Seth 1.8 | 52 | 10% | 78 |
| tcf.Reach 3 | 46 | 9% | 63 |
| cli.Dancer 1.1 | 18 | 4% | 21 |
| ratosh.Wesco 1.4 | 13 | 3% | 16 |
| amk.Punbot.Punbot 0.01 | 5 | 1% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 70.1 | 53 / 700 | 3.69 | 12.0% | 41508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.9% | 548 |
| gh.mini.Gruwel 0.9 | 2.7 | 13.3% | 56 |
| rz.HawkOnFire 0.1 | 3.4 | 12.5% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 12.1% | 26 |
| hadur117.nano.SanaroB400 0.3 | 4.1 | 12.0% | 53 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 1 |
| dans.Cinnamon 1.2 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 71.1 | 0 / 35 | 2103 |
| 2 | 4 | 59.2 | 70.8 | 4 / 35 | 2516 |
| 3 | 4 | 59.4 | 73.0 | 3 / 35 | 2216 |
| 4 | 4 | 56.1 | 65.1 | 1 / 35 | 2349 |
| 5 | 3 | 58.6 | 71.1 | 4 / 35 | 2110 |
| 6 | 5 | 58.3 | 69.2 | 5 / 35 | 2060 |
| 7 | 4 | 57.5 | 71.1 | 1 / 35 | 1925 |
| 8 | 4 | 57.9 | 71.1 | 3 / 35 | 2195 |
| 9 | 5 | 55.3 | 63.2 | 1 / 35 | 2136 |
| 10 | 5 | 58.6 | 70.8 | 6 / 35 | 1900 |
| 11 | 4 | 58.1 | 70.8 | 2 / 35 | 2021 |
| 12 | 4 | 58.8 | 72.7 | 3 / 35 | 2175 |
| 13 | 5 | 55.6 | 66.0 | 2 / 35 | 1890 |
| 14 | 4 | 57.7 | 70.2 | 6 / 35 | 1619 |
| 15 | 3 | 58.0 | 72.4 | 3 / 35 | 1791 |
| 16 | 5 | 58.9 | 71.1 | 5 / 35 | 2145 |
| 17 | 5 | 56.7 | 66.7 | 1 / 35 | 2088 |
| 18 | 4 | 57.1 | 69.5 | 0 / 35 | 2022 |
| 19 | 3 | 57.8 | 70.2 | 1 / 35 | 2255 |
| 20 | 3 | 59.3 | 75.2 | 2 / 35 | 1992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 197 | 3% |
| gh.mini.Gruwel 0.9 | 46 | 48% |
| rz.HawkOnFire 0.1 | 16 | 81% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 67% |

Hadur died in 649 of 700 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 301 | 46% | 305 |
| gh.mini.Gruwel 0.9 | 115 | 18% | 140 |
| rz.HawkOnFire 0.1 | 91 | 14% | 102 |
| dmh.robocode.robot.BlackDeath 9.2 | 88 | 14% | 100 |
| myl.nano.KomoriNinja 1.1 | 14 | 2% | 14 |
| wit.Chuliath 1.0 | 12 | 2% | 13 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 2% | 12 |
| stelo.MyAgileRobot 0.2 | 9 | 1% | 9 |
| dans.Cinnamon 1.2 | 5 | 1% | 5 |
2 death(s) with no robot to name.

## Melee bench: F36

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.8 | 322 / 700 | 2.91 | 15.3% | 57464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB400 0.3 | 1.1 | 15.3% | 322 |
| alpha.RainingFire 1.0 | 2.9 | 12.5% | 86 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 88 |
| mz.Cork 0.1 | 4.3 | 11.6% | 56 |
| bvh.micro.Freya 0.3 | 4.8 | 11.2% | 54 |
| m3thos.Eva02 0.7.1 | 5.9 | 9.9% | 36 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 21 |
| dl.BetterWalls 1.0 | 8.5 | 6.6% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.5% | 8 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.4% | 27 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 81.3 | 17 / 35 | 2897 |
| 2 | 1 | 60.3 | 74.9 | 10 / 35 | 2774 |
| 3 | 1 | 62.5 | 78.4 | 11 / 35 | 3199 |
| 4 | 1 | 61.8 | 74.3 | 17 / 35 | 2739 |
| 5 | 1 | 63.5 | 81.6 | 16 / 35 | 2724 |
| 6 | 1 | 61.0 | 72.4 | 18 / 35 | 2877 |
| 7 | 1 | 63.2 | 79.0 | 19 / 35 | 2758 |
| 8 | 1 | 63.4 | 81.3 | 18 / 35 | 2671 |
| 9 | 2 | 60.1 | 72.1 | 11 / 35 | 2817 |
| 10 | 1 | 62.6 | 76.5 | 19 / 35 | 2978 |
| 11 | 1 | 65.2 | 85.4 | 19 / 35 | 3086 |
| 12 | 2 | 60.7 | 73.3 | 12 / 35 | 2710 |
| 13 | 1 | 63.3 | 81.0 | 15 / 35 | 3004 |
| 14 | 1 | 64.8 | 85.4 | 18 / 35 | 3140 |
| 15 | 1 | 68.1 | 93.0 | 26 / 35 | 3338 |
| 16 | 1 | 63.4 | 80.3 | 19 / 35 | 2614 |
| 17 | 1 | 63.2 | 81.0 | 17 / 35 | 2790 |
| 18 | 1 | 58.3 | 67.0 | 9 / 35 | 2791 |
| 19 | 1 | 65.0 | 84.8 | 19 / 35 | 2973 |
| 20 | 1 | 60.0 | 73.0 | 12 / 35 | 2584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 107 | 66% |
| alpha.RainingFire 1.0 | 82 | 61% |
| mz.Cork 0.1 | 80 | 85% |
| bvh.micro.Freya 0.3 | 68 | 85% |
| m3thos.Eva02 0.7.1 | 37 | 68% |
| bvh.mini.Fenrir 0.39 | 34 | 85% |
| sample.MyFirstRobot 1.0 | 20 | 30% |
| dl.BetterWalls 1.0 | 10 | 90% |
| squidM.TentalceMeleeNano 1.1 | 9 | 67% |

Hadur died in 378 of 700 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 84 | 22% | 126 |
| bzdp.Pansy 2.1 | 77 | 20% | 159 |
| bvh.mini.Fenrir 0.39 | 48 | 13% | 61 |
| bvh.micro.Freya 0.3 | 42 | 11% | 78 |
| mz.Cork 0.1 | 40 | 11% | 123 |
| m3thos.Eva02 0.7.1 | 38 | 10% | 75 |
| squidM.TentalceMeleeNano 1.1 | 22 | 6% | 30 |
| sample.MyFirstRobot 1.0 | 16 | 4% | 23 |
| dl.BetterWalls 1.0 | 11 | 3% | 25 |

## Melee bench: F37

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 80.4 | 290 / 700 | 2.76 | 15.2% | 71402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB400 0.3 | 1.0 | 15.2% | 290 |
| germ.TheMind .2 | 3.0 | 11.2% | 81 |
| EBBU.Sim2 1.02 | 3.6 | 10.9% | 68 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.9% | 49 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.5% | 49 |
| agrach.Dalek 1.0 | 6.0 | 9.4% | 56 |
| lmk.ACPFinal 0.1 | 7.9 | 8.4% | 20 |
| mb.Beast 0.1 | 8.1 | 8.2% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 8.2% | 3 |
| skm.Ryubot 1.0 | 8.3 | 8.1% | 51 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 84.4 | 16 / 35 | 3893 |
| 2 | 1 | 62.7 | 83.8 | 18 / 35 | 3156 |
| 3 | 1 | 63.1 | 81.0 | 14 / 35 | 4176 |
| 4 | 1 | 62.5 | 82.9 | 16 / 35 | 3361 |
| 5 | 1 | 61.4 | 80.6 | 12 / 35 | 3212 |
| 6 | 1 | 62.2 | 80.6 | 15 / 35 | 3529 |
| 7 | 1 | 64.2 | 86.7 | 19 / 35 | 3749 |
| 8 | 1 | 61.2 | 79.7 | 13 / 35 | 3126 |
| 9 | 1 | 59.6 | 75.6 | 11 / 35 | 3321 |
| 10 | 1 | 62.1 | 79.7 | 14 / 35 | 3843 |
| 11 | 1 | 60.2 | 75.2 | 13 / 35 | 3543 |
| 12 | 1 | 63.6 | 88.3 | 17 / 35 | 3217 |
| 13 | 1 | 60.7 | 75.9 | 12 / 35 | 3629 |
| 14 | 1 | 62.3 | 79.0 | 17 / 35 | 3819 |
| 15 | 1 | 61.1 | 79.7 | 9 / 35 | 3754 |
| 16 | 1 | 61.2 | 76.2 | 15 / 35 | 3795 |
| 17 | 1 | 62.0 | 82.9 | 15 / 35 | 3163 |
| 18 | 1 | 60.9 | 76.8 | 14 / 35 | 3701 |
| 19 | 1 | 61.4 | 78.1 | 16 / 35 | 3386 |
| 20 | 1 | 63.1 | 81.6 | 14 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 85 | 69% |
| EBBU.Sim2 1.02 | 84 | 56% |
| stelo.UntouchableNano 1.3 | 59 | 73% |
| skm.Ryubot 1.0 | 51 | 47% |
| com.syncleus.robocode.Dreadnaught 0.1 | 45 | 64% |
| mb.Beast 0.1 | 40 | 78% |
| lmk.ACPFinal 0.1 | 38 | 82% |
| agrach.Dalek 1.0 | 36 | 64% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 419 of 700 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 71 | 17% | 110 |
| germ.TheMind .2 | 67 | 16% | 116 |
| com.syncleus.robocode.Dreadnaught 0.1 | 58 | 14% | 95 |
| stelo.UntouchableNano 1.3 | 43 | 10% | 80 |
| agrach.Dalek 1.0 | 42 | 10% | 81 |
| skm.Ryubot 1.0 | 39 | 9% | 57 |
| mn.nano.perceptual.Impact 1.3.0 | 35 | 8% | 41 |
| lmk.ACPFinal 0.1 | 33 | 8% | 53 |
| mb.Beast 0.1 | 31 | 7% | 64 |

## Melee bench: F38

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 69.7 | 136 / 700 | 3.73 | 12.4% | 47072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 17.3% | 304 |
| bvh.mini.Freya 0.55 | 2.4 | 13.3% | 65 |
| hadur117.nano.SanaroB400 0.3 | 3.4 | 12.4% | 136 |
| cs.Wren 1.0 | 4.7 | 11.2% | 45 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.1% | 76 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.1 | 10.9% | 46 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.2% | 20 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.4% | 9 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 68.6 | 8 / 35 | 2487 |
| 2 | 4 | 55.7 | 64.8 | 3 / 35 | 2318 |
| 3 | 2 | 62.1 | 81.0 | 14 / 35 | 2337 |
| 4 | 3 | 57.6 | 68.9 | 2 / 35 | 2431 |
| 5 | 3 | 56.5 | 64.1 | 7 / 35 | 2476 |
| 6 | 3 | 56.9 | 66.3 | 6 / 35 | 2183 |
| 7 | 7 | 53.2 | 58.4 | 2 / 35 | 2092 |
| 8 | 3 | 57.6 | 68.6 | 7 / 35 | 2365 |
| 9 | 3 | 58.7 | 71.7 | 6 / 35 | 2326 |
| 10 | 3 | 59.8 | 72.4 | 10 / 35 | 2414 |
| 11 | 6 | 54.5 | 62.2 | 4 / 35 | 2126 |
| 12 | 6 | 55.3 | 63.5 | 4 / 35 | 2183 |
| 13 | 2 | 59.9 | 76.2 | 9 / 35 | 2311 |
| 14 | 3 | 57.4 | 67.6 | 4 / 35 | 2394 |
| 15 | 2 | 62.1 | 80.0 | 12 / 35 | 2699 |
| 16 | 4 | 56.6 | 70.2 | 4 / 35 | 1763 |
| 17 | 3 | 59.8 | 73.7 | 9 / 35 | 2295 |
| 18 | 3 | 58.7 | 69.2 | 8 / 35 | 2580 |
| 19 | 2 | 60.3 | 73.3 | 9 / 35 | 2824 |
| 20 | 2 | 59.3 | 72.4 | 8 / 35 | 2468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 153 | 48% |
| bts.mega.Gnarly 1.4 | 42 | 33% |
| bvh.mini.Freya 0.55 | 31 | 68% |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 18% |
| cs.Wren 1.0 | 22 | 41% |
| kdf.KoulDestroyer 1.0 | 14 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 565 of 700 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 171 | 30% | 242 |
| davidalves.net.DuelistNanoMelee 1.01 | 90 | 16% | 101 |
| bvh.mini.Freya 0.55 | 84 | 15% | 97 |
| bts.mega.Gnarly 1.4 | 76 | 13% | 95 |
| cs.Wren 1.0 | 65 | 12% | 73 |
| kdf.KoulDestroyer 1.0 | 51 | 9% | 59 |
| bzdp.BoxCar 2.0 | 13 | 2% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 11 | 2% | 15 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 5 |

## Melee bench: F39

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 70.2 | 98 / 700 | 3.38 | 13.4% | 46949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 17.9% | 171 |
| az.Ololobot 0.2.4 | 1.9 | 16.2% | 303 |
| hadur117.nano.SanaroB400 0.3 | 3.1 | 13.4% | 98 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.5% | 87 |
| apollokidd.ApolloKidd 0.9 | 5.2 | 9.9% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.7% | 21 |
| gimp.GimpBot 0.1 | 7.0 | 8.8% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.9 | 7.1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.0 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.6 | 66.4 | 4 / 35 | 1950 |
| 2 | 3 | 56.2 | 70.0 | 2 / 35 | 2520 |
| 3 | 3 | 55.6 | 67.1 | 6 / 35 | 2279 |
| 4 | 3 | 58.1 | 72.1 | 8 / 35 | 2461 |
| 5 | 3 | 55.3 | 66.4 | 7 / 35 | 2097 |
| 6 | 4 | 55.8 | 68.9 | 6 / 35 | 2093 |
| 7 | 3 | 57.0 | 68.2 | 5 / 35 | 2672 |
| 8 | 3 | 57.0 | 70.7 | 4 / 35 | 2525 |
| 9 | 4 | 57.5 | 71.8 | 6 / 35 | 2276 |
| 10 | 3 | 55.4 | 66.4 | 4 / 35 | 2327 |
| 11 | 3 | 58.0 | 72.1 | 3 / 35 | 2458 |
| 12 | 2 | 60.3 | 78.2 | 8 / 35 | 2670 |
| 13 | 3 | 59.1 | 75.4 | 6 / 35 | 2677 |
| 14 | 4 | 53.8 | 62.5 | 3 / 35 | 2048 |
| 15 | 3 | 55.4 | 67.1 | 3 / 35 | 2352 |
| 16 | 3 | 58.5 | 73.9 | 7 / 35 | 2318 |
| 17 | 3 | 55.7 | 67.5 | 3 / 35 | 2173 |
| 18 | 3 | 60.6 | 80.7 | 5 / 35 | 2645 |
| 19 | 3 | 57.5 | 73.6 | 6 / 35 | 2145 |
| 20 | 3 | 55.2 | 65.0 | 2 / 35 | 2263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 165 | 8% |
| bvh.fry.Freya 0.82 | 94 | 34% |
| stelo.SoRobotNanoMelee 1.2 | 50 | 40% |
| winamp32.micro.MicroMacro 1.0 | 18 | 83% |
| gimp.GimpBot 0.1 | 15 | 87% |
| apollokidd.ApolloKidd 0.9 | 8 | 50% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 604 of 700 rounds, at a mean tick of 1414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 197 | 33% | 223 |
| az.Ololobot 0.2.4 | 196 | 32% | 207 |
| stelo.SoRobotNanoMelee 1.2 | 84 | 14% | 92 |
| apollokidd.ApolloKidd 0.9 | 68 | 11% | 79 |
| gimp.GimpBot 0.1 | 21 | 3% | 36 |
| winamp32.micro.MicroMacro 1.0 | 18 | 3% | 36 |
| dcs.Eater_of_Worlds 1.1.3-A | 11 | 2% | 16 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 1% | 11 |

## Melee bench: F41

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 79.2 | 286 / 700 | 2.87 | 14.5% | 45010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.5% | 240 |
| hadur117.nano.SanaroB400 0.3 | 2.2 | 14.5% | 286 |
| ary.Swarm 1.1 | 3.4 | 13.1% | 35 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.9% | 72 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 11.5% | 39 |
| shrub.Silver v048 | 6.1 | 9.1% | 12 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 5 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 3 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 9 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 78.1 | 17 / 35 | 2238 |
| 2 | 3 | 63.2 | 82.9 | 18 / 35 | 1843 |
| 3 | 2 | 61.4 | 78.1 | 9 / 35 | 2359 |
| 4 | 2 | 61.9 | 76.8 | 10 / 35 | 2775 |
| 5 | 2 | 63.2 | 78.4 | 17 / 35 | 2419 |
| 6 | 2 | 61.9 | 77.5 | 17 / 35 | 2152 |
| 7 | 2 | 61.8 | 77.1 | 12 / 35 | 2396 |
| 8 | 2 | 62.4 | 79.7 | 12 / 35 | 2458 |
| 9 | 1 | 66.1 | 91.4 | 21 / 35 | 2423 |
| 10 | 2 | 61.8 | 78.4 | 11 / 35 | 2504 |
| 11 | 2 | 62.3 | 78.1 | 18 / 35 | 2159 |
| 12 | 3 | 60.3 | 73.3 | 12 / 35 | 2238 |
| 13 | 2 | 61.9 | 80.0 | 13 / 35 | 2204 |
| 14 | 2 | 62.1 | 79.7 | 14 / 35 | 1938 |
| 15 | 4 | 59.0 | 69.8 | 10 / 35 | 1873 |
| 16 | 3 | 62.1 | 78.4 | 11 / 35 | 2357 |
| 17 | 2 | 62.4 | 81.9 | 11 / 35 | 2359 |
| 18 | 2 | 64.3 | 84.4 | 17 / 35 | 2223 |
| 19 | 2 | 63.3 | 82.2 | 18 / 35 | 1940 |
| 20 | 2 | 61.8 | 77.5 | 18 / 35 | 2152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 239 | 56% |
| lessonz.robocode.Oz 0.5.0 | 76 | 64% |
| ary.Swarm 1.1 | 56 | 88% |
| simonton.nano.MeleeSeed 1.8 | 37 | 92% |
| shrub.Silver v048 | 13 | 77% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| stelo.Mirror 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 415 of 700 rounds, at a mean tick of 1206. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 161 | 39% | 295 |
| ary.Swarm 1.1 | 80 | 19% | 139 |
| lessonz.robocode.Oz 0.5.0 | 66 | 16% | 102 |
| simonton.nano.MeleeSeed 1.8 | 47 | 11% | 82 |
| shrub.Silver v048 | 28 | 7% | 40 |
| zyx.nano.Ant 1.1 | 22 | 5% | 22 |
| stelo.Mirror 1.1 | 5 | 1% | 9 |
| acogdev.alpha 0.2 | 4 | 1% | 4 |
| jsal.Jsalbot 1.0 | 2 | 0% | 7 |

## Melee bench: F42

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 75.8 | 185 / 700 | 3.18 | 13.7% | 54516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.6% | 316 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.1% | 65 |
| ara.Shera 0.88 | 2.9 | 14.0% | 112 |
| hadur117.nano.SanaroB400 0.3 | 3.3 | 13.7% | 185 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 16 |
| maribo.IotaCT 1.1 | 6.3 | 7.6% | 1 |
| dsw.StaticD 1.0 | 7.2 | 6.8% | 5 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.7% | 1 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 73.7 | 8 / 35 | 2298 |
| 2 | 4 | 59.5 | 73.3 | 6 / 35 | 2569 |
| 3 | 3 | 61.3 | 78.7 | 10 / 35 | 2552 |
| 4 | 3 | 60.1 | 74.6 | 9 / 35 | 2718 |
| 5 | 4 | 59.8 | 71.1 | 9 / 35 | 2659 |
| 6 | 3 | 60.8 | 76.5 | 10 / 35 | 2689 |
| 7 | 2 | 63.0 | 81.3 | 9 / 35 | 3182 |
| 8 | 3 | 61.2 | 75.9 | 9 / 35 | 2950 |
| 9 | 4 | 58.2 | 69.2 | 6 / 35 | 2770 |
| 10 | 2 | 62.5 | 81.0 | 13 / 35 | 2735 |
| 11 | 3 | 60.4 | 74.9 | 10 / 35 | 2736 |
| 12 | 4 | 62.8 | 81.3 | 11 / 35 | 2808 |
| 13 | 3 | 60.8 | 76.5 | 9 / 35 | 2687 |
| 14 | 4 | 61.6 | 76.2 | 8 / 35 | 2857 |
| 15 | 4 | 60.4 | 72.4 | 9 / 35 | 2853 |
| 16 | 3 | 59.8 | 74.9 | 8 / 35 | 2417 |
| 17 | 4 | 60.0 | 72.4 | 11 / 35 | 2467 |
| 18 | 3 | 60.9 | 75.9 | 9 / 35 | 2860 |
| 19 | 3 | 61.8 | 77.8 | 12 / 35 | 2710 |
| 20 | 2 | 61.7 | 77.8 | 9 / 35 | 2999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 188 | 45% |
| ara.Shera 0.88 | 75 | 59% |
| maribo.mini.MiniQuester 0.1 | 69 | 70% |
| dsw.StaticD 1.0 | 5 | 60% |
| amz.NanoClone 1.41 | 4 | 50% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 516 of 700 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 209 | 41% | 294 |
| ara.Shera 0.88 | 120 | 23% | 165 |
| maribo.mini.MiniQuester 0.1 | 103 | 20% | 150 |
| amz.NanoClone 1.41 | 42 | 8% | 44 |
| maribo.IotaCT 1.1 | 13 | 3% | 13 |
| dsw.StaticD 1.0 | 10 | 2% | 12 |
| mme.NikeEnhanced 2.0 | 8 | 2% | 8 |
| stelo.MirrorMicro 1.0 | 7 | 1% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 64.7 | 56 / 700 | 4.18 | 11.2% | 41080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 536 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.7% | 50 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.5% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.5% | 22 |
| hadur117.nano.SanaroB400 0.3 | 4.5 | 11.2% | 56 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.2% | 8 |
| mz.NanoGod 2.02 | 7.4 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.6% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.9 | 52.1 | 2 / 35 | 2138 |
| 2 | 5 | 58.2 | 65.4 | 4 / 35 | 2226 |
| 3 | 3 | 60.2 | 72.4 | 3 / 35 | 2160 |
| 4 | 4 | 57.5 | 64.1 | 4 / 35 | 2000 |
| 5 | 5 | 54.5 | 58.1 | 3 / 35 | 1810 |
| 6 | 4 | 57.7 | 64.1 | 4 / 35 | 2141 |
| 7 | 3 | 59.1 | 70.5 | 3 / 35 | 2086 |
| 8 | 5 | 58.2 | 65.4 | 4 / 35 | 1998 |
| 9 | 5 | 59.8 | 71.7 | 5 / 35 | 1927 |
| 10 | 6 | 55.9 | 59.0 | 1 / 35 | 2132 |
| 11 | 5 | 56.8 | 64.1 | 1 / 35 | 1954 |
| 12 | 6 | 54.4 | 56.8 | 1 / 35 | 2063 |
| 13 | 4 | 58.5 | 67.3 | 2 / 35 | 2158 |
| 14 | 2 | 60.4 | 71.4 | 7 / 35 | 2042 |
| 15 | 5 | 57.3 | 65.7 | 0 / 35 | 1835 |
| 16 | 4 | 57.6 | 65.4 | 1 / 35 | 2171 |
| 17 | 4 | 58.2 | 67.3 | 2 / 35 | 2216 |
| 18 | 4 | 57.2 | 65.1 | 1 / 35 | 2066 |
| 19 | 3 | 59.5 | 69.8 | 5 / 35 | 2103 |
| 20 | 6 | 54.9 | 57.1 | 3 / 35 | 1854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 162 | 18% |
| brainfade.melee.Dusk 0.44 | 19 | 63% |
| dummy.micro.Sparrow 2.5 | 16 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 11 | 45% |
| Krabb.akim2.Akim2 1.1b | 4 | 0% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 644 of 700 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 301 | 47% | 327 |
| dummy.micro.Sparrow 2.5 | 79 | 12% | 90 |
| brainfade.melee.Dusk 0.44 | 76 | 12% | 89 |
| wcsv.melee.EngineerMelee 0.1 | 76 | 12% | 81 |
| mz.NanoGod 2.02 | 44 | 7% | 44 |
| Krabb.akim2.Akim2 1.1b | 39 | 6% | 40 |
| jab.DiamondStealer 5 | 24 | 4% | 24 |
| cvt.Firsty 1.0 | 5 | 1% | 5 |

## Melee bench: F44

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.2 | 206 / 700 | 3.15 | 14.2% | 56693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.6% | 252 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.6% | 169 |
| hadur117.nano.SanaroB400 0.3 | 2.8 | 14.2% | 206 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 20 |
| jwirde.Gort 2.0 | 4.7 | 10.4% | 34 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.2% | 8 |
| disan.Chair 2.2.0 | 7.3 | 7.4% | 10 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.5% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.6% | 1 |
| sample.Crazy 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 75.9 | 8 / 35 | 2926 |
| 2 | 3 | 61.1 | 77.5 | 6 / 35 | 2564 |
| 3 | 3 | 61.5 | 76.8 | 8 / 35 | 2890 |
| 4 | 3 | 61.0 | 73.7 | 8 / 35 | 2933 |
| 5 | 2 | 63.9 | 82.5 | 12 / 35 | 2924 |
| 6 | 2 | 63.7 | 81.0 | 13 / 35 | 3118 |
| 7 | 3 | 62.2 | 76.8 | 12 / 35 | 3000 |
| 8 | 3 | 59.4 | 67.6 | 10 / 35 | 2826 |
| 9 | 2 | 64.6 | 82.9 | 16 / 35 | 3018 |
| 10 | 3 | 60.9 | 77.1 | 7 / 35 | 2575 |
| 11 | 3 | 60.6 | 73.3 | 8 / 35 | 2659 |
| 12 | 3 | 60.0 | 72.7 | 8 / 35 | 2701 |
| 13 | 3 | 58.9 | 69.8 | 8 / 35 | 2523 |
| 14 | 3 | 60.9 | 73.0 | 11 / 35 | 2843 |
| 15 | 3 | 62.5 | 76.2 | 11 / 35 | 2848 |
| 16 | 3 | 62.8 | 78.1 | 11 / 35 | 3041 |
| 17 | 2 | 63.1 | 81.3 | 13 / 35 | 2917 |
| 18 | 3 | 60.9 | 73.3 | 10 / 35 | 2773 |
| 19 | 3 | 60.6 | 73.0 | 12 / 35 | 2651 |
| 20 | 2 | 63.5 | 80.6 | 14 / 35 | 2963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 187 | 58% |
| tzu.TheArtOfWar 1.2 | 127 | 28% |
| jwirde.Gort 2.0 | 30 | 73% |
| wompi.Quokka 1.6 | 28 | 68% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 78% |
| disan.Chair 2.2.0 | 7 | 57% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 494 of 700 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 176 | 36% | 293 |
| tzu.TheArtOfWar 1.2 | 171 | 35% | 215 |
| wompi.Quokka 1.6 | 38 | 8% | 45 |
| jwirde.Gort 2.0 | 37 | 7% | 59 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 35 | 7% | 39 |
| disan.Chair 2.2.0 | 15 | 3% | 19 |
| stf.PanzerGeneral 0.1 | 15 | 3% | 19 |
| sample.Crazy 1.0 | 4 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 5 |

## Melee bench: F45

hadur117.nano.SanaroB400 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.9 | 191 / 700 | 3.08 | 14.9% | 61983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB400 0.3 | 1.3 | 14.9% | 191 |
| jje.BagPuss 1.2 | 2.5 | 12.9% | 45 |
| eem.IWillFireNoBullet v2.8 | 2.6 | 12.9% | 319 |
| sul.Lunar 1.1 | 4.5 | 11.2% | 72 |
| myl.nano.Graviton 1.10 | 4.6 | 10.8% | 24 |
| hvilela.HVilela 0.9 | 6.5 | 9.1% | 8 |
| fm.claire 1.7 | 7.1 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.2% | 11 |
| wit.Deep7 2.0 | 8.9 | 6.5% | 29 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 72.4 | 10 / 35 | 3041 |
| 2 | 1 | 61.4 | 75.6 | 10 / 35 | 2931 |
| 3 | 2 | 60.0 | 72.7 | 7 / 35 | 2916 |
| 4 | 1 | 63.7 | 82.2 | 12 / 35 | 3281 |
| 5 | 1 | 61.9 | 76.5 | 7 / 35 | 3280 |
| 6 | 1 | 62.6 | 80.6 | 10 / 35 | 3040 |
| 7 | 1 | 61.6 | 76.5 | 8 / 35 | 3262 |
| 8 | 1 | 63.5 | 81.6 | 13 / 35 | 3260 |
| 9 | 1 | 61.7 | 77.1 | 8 / 35 | 3029 |
| 10 | 1 | 61.9 | 76.5 | 10 / 35 | 3234 |
| 11 | 1 | 63.4 | 81.0 | 11 / 35 | 3104 |
| 12 | 2 | 60.2 | 70.5 | 10 / 35 | 3186 |
| 13 | 1 | 61.0 | 76.5 | 8 / 35 | 2675 |
| 14 | 3 | 60.7 | 72.7 | 7 / 35 | 3122 |
| 15 | 1 | 60.4 | 73.0 | 8 / 35 | 2891 |
| 16 | 1 | 64.1 | 81.9 | 13 / 35 | 3406 |
| 17 | 1 | 63.0 | 81.6 | 10 / 35 | 3103 |
| 18 | 1 | 60.4 | 74.0 | 6 / 35 | 3055 |
| 19 | 1 | 64.0 | 81.0 | 14 / 35 | 3415 |
| 20 | 2 | 60.7 | 74.6 | 9 / 35 | 2752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 243 | 47% |
| sul.Lunar 1.1 | 57 | 21% |
| jje.BagPuss 1.2 | 34 | 41% |
| myl.nano.Graviton 1.10 | 25 | 64% |
| wit.Deep7 2.0 | 24 | 54% |
| pez.mini.ChironexFleckeri 0.5 | 19 | 84% |
| hvilela.HVilela 0.9 | 4 | 75% |
| fm.claire 1.7 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 512 of 700 rounds, at a mean tick of 1593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 147 | 29% | 0 |
| jje.BagPuss 1.2 | 90 | 18% | 199 |
| sul.Lunar 1.1 | 82 | 16% | 161 |
| myl.nano.Graviton 1.10 | 69 | 13% | 134 |
| hvilela.HVilela 0.9 | 40 | 8% | 49 |
| fm.claire 1.7 | 34 | 7% | 44 |
| pez.mini.ChironexFleckeri 0.5 | 24 | 5% | 47 |
| wit.Deep7 2.0 | 21 | 4% | 46 |
| abud.ThirdRobo 1.0 | 5 | 1% | 18 |

## Melee bench: F46

hadur117.nano.SanaroB400 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 76.0 | 155 / 700 | 2.92 | 14.7% | 48788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.0% | 439 |
| hadur117.nano.SanaroB400 0.3 | 2.1 | 14.7% | 155 |
| cx.Princess 1.0 | 3.4 | 13.1% | 69 |
| mz.MicroSheep 1.0 | 3.6 | 12.7% | 31 |
| sadoner.killer 0.2 | 5.1 | 10.4% | 5 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.9% | 2 |
| jeremyreeder.collective.Prophet 5 | 6.9 | 7.6% | 0 |
| kurios.DOSexe .9a | 8.2 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 75.4 | 11 / 35 | 2470 |
| 2 | 2 | 59.6 | 74.6 | 5 / 35 | 2527 |
| 3 | 3 | 58.1 | 69.3 | 5 / 35 | 2678 |
| 4 | 2 | 59.6 | 75.0 | 7 / 35 | 2417 |
| 5 | 2 | 62.1 | 79.6 | 10 / 35 | 2680 |
| 6 | 2 | 59.7 | 73.9 | 10 / 35 | 2196 |
| 7 | 2 | 60.2 | 77.9 | 7 / 35 | 2289 |
| 8 | 2 | 60.4 | 76.1 | 9 / 35 | 2669 |
| 9 | 2 | 62.0 | 78.6 | 10 / 35 | 2749 |
| 10 | 2 | 60.0 | 75.7 | 9 / 35 | 2352 |
| 11 | 3 | 59.5 | 74.6 | 7 / 35 | 2430 |
| 12 | 2 | 61.3 | 76.8 | 10 / 35 | 2436 |
| 13 | 2 | 61.5 | 81.1 | 8 / 35 | 2425 |
| 14 | 2 | 58.7 | 72.5 | 5 / 35 | 2432 |
| 15 | 2 | 60.6 | 80.0 | 8 / 35 | 2297 |
| 16 | 2 | 59.4 | 77.5 | 6 / 35 | 2146 |
| 17 | 2 | 60.4 | 76.4 | 8 / 35 | 2426 |
| 18 | 2 | 62.3 | 80.4 | 10 / 35 | 2590 |
| 19 | 2 | 58.3 | 70.7 | 4 / 35 | 2519 |
| 20 | 2 | 58.1 | 73.6 | 6 / 35 | 2060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 312 | 34% |
| cx.Princess 1.0 | 39 | 67% |
| mz.MicroSheep 1.0 | 19 | 32% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| sadoner.killer 0.2 | 5 | 80% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 546 of 700 rounds, at a mean tick of 1098. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 337 | 62% | 454 |
| mz.MicroSheep 1.0 | 68 | 12% | 75 |
| cx.Princess 1.0 | 48 | 9% | 65 |
| sadoner.killer 0.2 | 36 | 7% | 40 |
| arthord.NanoSatanMelee Beta | 34 | 6% | 40 |
| jeremyreeder.collective.Prophet 5 | 11 | 2% | 11 |
| kurios.DOSexe .9a | 9 | 2% | 9 |
| mbro.Detektor3 0.1.1 | 2 | 0% | 6 |
1 death(s) with no robot to name.

