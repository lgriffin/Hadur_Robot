# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.1 | 81 / 210 | 3.15 | 16.4% | 27577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.7 | 16.4% | 81 |
| mld.Infinity 2.2 | 2.5 | 15.5% | 46 |
| mz.AntiGrav 1.0 | 2.7 | 15.1% | 32 |
| radnor.DoctorBob 1.42 | 3.2 | 14.8% | 36 |
| amz.NanoClone 1.41 | 5.2 | 9.6% | 6 |
| sample.Walls 1.0 | 6.3 | 7.9% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 7.1% | 2 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.4 | 17 / 35 | 5084 |
| 2 | 2 | 66.0 | 79.7 | 11 / 35 | 4437 |
| 3 | 1 | 66.9 | 83.2 | 16 / 35 | 4205 |
| 4 | 3 | 63.4 | 68.6 | 14 / 35 | 4029 |
| 5 | 2 | 63.8 | 67.6 | 9 / 35 | 4948 |
| 6 | 1 | 66.5 | 79.0 | 14 / 35 | 4874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 48 | 60% |
| mz.AntiGrav 1.0 | 35 | 83% |
| radnor.DoctorBob 1.42 | 25 | 64% |
| sample.Target 1.0 | 3 | 33% |
| sample.Walls 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 0% |
| jangs.ns51 1.0 | 1 | 0% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 34% | 69 |
| mld.Infinity 2.2 | 36 | 28% | 31 |
| mz.AntiGrav 1.0 | 24 | 18% | 71 |
| amz.NanoClone 1.41 | 13 | 10% | 17 |
| sample.Walls 1.0 | 4 | 3% | 7 |
| jangs.ns51 1.0 | 3 | 2% | 7 |
| sample.Target 1.0 | 3 | 2% | 0 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |

## Melee bench: F02

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.3 | 103 / 210 | 3.22 | 15.5% | 21812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 15.5% | 103 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.3% | 64 |
| mld.DustBunny 3.8 | 2.7 | 13.6% | 20 |
| maribo.melee.BMV 0.1 | 4.2 | 11.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 10.0% | 12 |
| zyx.nano.Ant 1.1 | 7.2 | 7.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 4 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 7.2% | 5 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.7 | 17 / 35 | 3375 |
| 2 | 3 | 55.0 | 46.0 | 6 / 35 | 4003 |
| 3 | 1 | 64.6 | 80.0 | 22 / 35 | 3380 |
| 4 | 1 | 67.2 | 90.2 | 19 / 35 | 3919 |
| 5 | 1 | 65.2 | 80.0 | 22 / 35 | 3546 |
| 6 | 1 | 63.7 | 76.8 | 17 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 74% |
| mld.DustBunny 3.8 | 33 | 85% |
| djdjdj.NanoSkunk10 1.0 | 14 | 86% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 24% | 69 |
| mld.DustBunny 3.8 | 23 | 21% | 53 |
| djdjdj.NanoSkunk10 1.0 | 13 | 12% | 27 |
| zyx.nano.Ant 1.1 | 11 | 10% | 13 |
| fullsail.SweetTea 1.1 | 9 | 8% | 11 |
| maribo.melee.BMV 0.1 | 8 | 7% | 13 |
| bzdp.BoxCar 2.0 | 7 | 7% | 9 |
| cs.Grudge 1.0 | 7 | 7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 8 |

## Melee bench: F03

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.7 | 79 / 210 | 3.73 | 15.3% | 25192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.0 | 17.3% | 77 |
| hadur117.micro.SaorOG2 0.1 | 2.0 | 15.3% | 79 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 8 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.5% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.8% | 14 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 9 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.8% | 5 |
| sample.Fire 1.0 | 8.8 | 5.6% | 5 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 70.5 | 13 / 35 | 4753 |
| 2 | 2 | 63.5 | 72.4 | 13 / 35 | 3992 |
| 3 | 2 | 64.2 | 74.0 | 15 / 35 | 3806 |
| 4 | 2 | 63.8 | 70.8 | 12 / 35 | 4585 |
| 5 | 2 | 62.1 | 64.1 | 13 / 35 | 4319 |
| 6 | 2 | 61.6 | 66.3 | 13 / 35 | 3737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 66% |
| cb.nano.Insomnia 1.0 | 18 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 75% |
| myl.nano.KomoriNinja 1.1 | 8 | 63% |
| sample.Fire 1.0 | 4 | 75% |
| fm.mammillarias 1.3 | 3 | 67% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 40 | 31% | 93 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 17% | 27 |
| fm.mammillarias 1.3 | 18 | 14% | 21 |
| cb.nano.Insomnia 1.0 | 18 | 14% | 14 |
| myl.nano.KomoriNinja 1.1 | 13 | 10% | 24 |
| sample.Fire 1.0 | 8 | 6% | 11 |
| sample.Tracker 1.0 | 6 | 5% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 2% | 6 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.0 | 96 / 210 | 3.34 | 16.3% | 27330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 16.3% | 96 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.3% | 24 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 21 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.3% | 38 |
| tj.zombie1n 1.0.1 | 5.2 | 9.6% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.3% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.2% | 8 |
| yk.JahMicro 1.0 | 7.8 | 7.5% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 3 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.2 | 20 / 35 | 4374 |
| 2 | 1 | 63.8 | 71.1 | 18 / 35 | 4483 |
| 3 | 2 | 62.4 | 67.0 | 9 / 35 | 4671 |
| 4 | 1 | 65.0 | 78.1 | 17 / 35 | 4327 |
| 5 | 1 | 65.6 | 75.2 | 17 / 35 | 4965 |
| 6 | 1 | 63.3 | 69.5 | 15 / 35 | 4510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 88% |
| stelo.SoJNanoMelee 1.1 | 24 | 46% |
| tvv.micro.Antares 1.1.1 | 19 | 79% |
| tj.zombie1n 1.0.1 | 8 | 38% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 30% | 87 |
| stelo.SoJNanoMelee 1.1 | 29 | 25% | 34 |
| tvv.micro.Antares 1.1.1 | 17 | 15% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 11% | 16 |
| tj.zombie1n 1.0.1 | 11 | 10% | 13 |
| yk.JahMicro 1.0 | 5 | 4% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 11 |
| sample.VelociRobot 1.0 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 58.3 | 58 / 210 | 4.75 | 12.8% | 20807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.7 | 12.8% | 58 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 39 |
| ahf.NanoAndrew .4 | 3.5 | 11.7% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.4% | 36 |
| sam.Samspin 1.0 | 5.7 | 10.3% | 18 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 9.8% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.5% | 9 |
| EBBU.Sim2 1.02 | 7.0 | 9.5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.4 | 62.2 | 10 / 35 | 3875 |
| 2 | 2 | 57.1 | 58.7 | 7 / 35 | 3313 |
| 3 | 2 | 55.9 | 53.7 | 8 / 35 | 3364 |
| 4 | 1 | 59.0 | 62.2 | 14 / 35 | 3180 |
| 5 | 1 | 58.4 | 60.6 | 9 / 35 | 3689 |
| 6 | 3 | 55.3 | 52.4 | 10 / 35 | 3386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ahf.NanoAndrew .4 | 22 | 68% |
| simonton.nano.MeleeSeed 1.8 | 21 | 57% |
| oog.melee.Corsair 1.0 | 18 | 78% |
| sam.Samspin 1.0 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| sample.TrackFire 1.0 | 2 | 0% |
| EBBU.Sim2 1.02 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 25% | 49 |
| ahf.NanoAndrew .4 | 24 | 16% | 43 |
| zyx.nano.BacillusComma 1.0 | 22 | 14% | 23 |
| robar.nano.Assertive_Melee 0.2 | 19 | 13% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 17 | 11% | 16 |
| EBBU.Sim2 1.02 | 10 | 7% | 12 |
| sam.Samspin 1.0 | 9 | 6% | 15 |
| oog.melee.Corsair 1.0 | 8 | 5% | 21 |
| sample.TrackFire 1.0 | 5 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.2 | 116 / 210 | 2.70 | 16.6% | 21800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 16.6% | 116 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.6% | 38 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.4% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.5% | 13 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.8% | 5 |
| fm.claire 1.7 | 6.5 | 8.4% | 1 |
| sample.SpinBot 1.0 | 7.2 | 7.8% | 3 |
| pa.Improved 1.0 | 9.2 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 87.6 | 23 / 35 | 3283 |
| 2 | 1 | 64.5 | 81.9 | 16 / 35 | 3440 |
| 3 | 1 | 65.5 | 81.6 | 20 / 35 | 3791 |
| 4 | 2 | 65.0 | 80.0 | 21 / 35 | 3637 |
| 5 | 1 | 64.4 | 79.4 | 20 / 35 | 3661 |
| 6 | 1 | 63.7 | 76.5 | 16 / 35 | 3988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 86% |
| oog.melee.CapuletDroid 1.1 | 26 | 81% |
| gh.nano.Grofvuil 0.2 | 16 | 75% |
| winamp32.micro.MicroMacro 1.0 | 10 | 70% |
| fm.claire 1.7 | 6 | 100% |
| arthord.NanoSatanMelee Beta | 5 | 80% |
| sample.SpinBot 1.0 | 4 | 50% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 31% | 89 |
| oog.melee.CapuletDroid 1.1 | 20 | 21% | 20 |
| arthord.NanoSatanMelee Beta | 13 | 14% | 18 |
| gh.nano.Grofvuil 0.2 | 10 | 10% | 32 |
| winamp32.micro.MicroMacro 1.0 | 6 | 6% | 18 |
| fm.claire 1.7 | 6 | 6% | 12 |
| sample.SpinBot 1.0 | 6 | 6% | 8 |
| kurios.DOSexe .9b | 5 | 5% | 10 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.0 | 58 / 210 | 3.79 | 14.1% | 22705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.2 | 16.3% | 62 |
| hadur117.micro.SaorOG2 0.1 | 2.7 | 14.1% | 58 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.4% | 40 |
| mz.MicroGodMelee 1 | 3.5 | 13.5% | 22 |
| DBall.Anarchy 0.1 | 5.2 | 9.7% | 17 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.9% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 3 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 79.4 | 14 / 35 | 4085 |
| 2 | 4 | 57.5 | 61.0 | 6 / 35 | 3528 |
| 3 | 3 | 60.8 | 68.6 | 7 / 35 | 3711 |
| 4 | 2 | 63.2 | 75.6 | 10 / 35 | 3849 |
| 5 | 1 | 62.8 | 74.3 | 14 / 35 | 3665 |
| 6 | 4 | 56.8 | 55.2 | 7 / 35 | 3867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 34 | 38% |
| spinnercat.micro.Tyger 0.1 | 34 | 47% |
| mz.MicroGodMelee 1 | 24 | 79% |
| DBall.Anarchy 0.1 | 8 | 75% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| mbro.Detektor3 0.1.1 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 0% |

Hadur died in 152 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 42 | 28% | 59 |
| spinnercat.micro.Tyger 0.1 | 38 | 25% | 52 |
| mz.MicroGodMelee 1 | 21 | 14% | 42 |
| acogdev.alpha 0.2 | 16 | 11% | 17 |
| DBall.Anarchy 0.1 | 14 | 9% | 15 |
| mbro.Detektor3 0.1.1 | 7 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 6 | 4% | 9 |
| fire219.CatBot 1.0 | 6 | 4% | 6 |
| el.JumpShoot 0.2 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 63.6 | 72 / 210 | 4.28 | 14.1% | 24868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 16.5% | 54 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 14.7% | 52 |
| hadur117.micro.SaorOG2 0.1 | 2.5 | 14.1% | 72 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.2% | 8 |
| germ.TheMind .2 | 4.7 | 9.8% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 3 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 5 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 7 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 61.6 | 12 / 35 | 3779 |
| 2 | 2 | 63.6 | 67.9 | 13 / 35 | 4892 |
| 3 | 2 | 62.0 | 66.0 | 14 / 35 | 4268 |
| 4 | 3 | 61.6 | 66.0 | 11 / 35 | 4346 |
| 5 | 2 | 60.7 | 64.8 | 11 / 35 | 3864 |
| 6 | 3 | 57.5 | 55.2 | 11 / 35 | 3719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 48% |
| germ.TheMind .2 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 2 | 50% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 0% |

Hadur died in 138 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 51% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 20% | 40 |
| germ.TheMind .2 | 12 | 9% | 23 |
| qualidafial.MajorDick 1.0.1 | 9 | 7% | 10 |
| mym.EdgeStalker 1.0 | 6 | 4% | 8 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 8 |
| awesomeness.Elite 1.0 | 5 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.8 | 119 / 210 | 2.46 | 18.0% | 25445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.0% | 119 |
| rz.HawkOnFire 0.1 | 2.2 | 14.6% | 22 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.6% | 24 |
| maribo.IotaCT 1.1 | 4.2 | 11.1% | 21 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 6 |
| ratosh.Wesco 1.4 | 6.8 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 7.3 | 8.2% | 10 |
| spinnercat.Omen 1.0 | 7.5 | 7.6% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.8 | 7.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.5 | 19 / 35 | 4605 |
| 2 | 1 | 67.1 | 83.8 | 18 / 35 | 3779 |
| 3 | 1 | 67.6 | 83.8 | 18 / 35 | 4132 |
| 4 | 1 | 70.2 | 91.1 | 27 / 35 | 4454 |
| 5 | 1 | 67.5 | 82.9 | 18 / 35 | 4234 |
| 6 | 1 | 67.5 | 83.8 | 19 / 35 | 4241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 90% |
| nz.jdc.nano.GridFu 1.0 | 42 | 79% |
| maribo.IotaCT 1.1 | 20 | 65% |
| timmit.nano.TimDog 0.33 | 7 | 86% |
| stelo.PatternRobot 1.0 | 5 | 60% |
| spinnercat.Omen 1.0 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 22 | 24% | 60 |
| maribo.IotaCT 1.1 | 21 | 23% | 35 |
| rz.HawkOnFire 0.1 | 15 | 16% | 61 |
| stelo.PatternRobot 1.0 | 15 | 16% | 18 |
| timmit.nano.TimDog 0.33 | 7 | 8% | 16 |
| ratosh.Wesco 1.4 | 5 | 5% | 10 |
| spinnercat.Omen 1.0 | 4 | 4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.8 | 122 / 210 | 2.55 | 18.3% | 31782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.3% | 122 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.9% | 41 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 9 |
| Grystrion.TrackerWO 1.0 | 5.0 | 10.0% | 5 |
| sanja.First 0.1 | 5.7 | 9.2% | 8 |
| zyx.micro.Ant 1.1 | 6.3 | 8.9% | 12 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.1% | 4 |
| cvt.Firsty 1.0 | 7.3 | 7.9% | 12 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.6 | 21 / 35 | 5535 |
| 2 | 1 | 67.8 | 85.4 | 20 / 35 | 5174 |
| 3 | 1 | 65.4 | 78.1 | 21 / 35 | 4686 |
| 4 | 1 | 66.5 | 79.0 | 19 / 35 | 5306 |
| 5 | 1 | 68.9 | 88.9 | 21 / 35 | 5481 |
| 6 | 1 | 68.0 | 84.8 | 20 / 35 | 5600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 53% |
| baal.nano.N 1.42 | 28 | 93% |
| cvt.Firsty 1.0 | 23 | 78% |
| sanja.First 0.1 | 14 | 86% |
| Grystrion.TrackerWO 1.0 | 14 | 86% |
| amk.Punbot.Punbot 0.01 | 13 | 92% |
| zyx.micro.Ant 1.1 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 29 | 30% | 58 |
| Grystrion.TrackerWO 1.0 | 16 | 17% | 26 |
| zyx.micro.Ant 1.1 | 11 | 11% | 26 |
| cvt.Firsty 1.0 | 9 | 9% | 23 |
| baal.nano.N 1.42 | 7 | 7% | 23 |
| amk.Punbot.Punbot 0.01 | 7 | 7% | 10 |
| sanja.First 0.1 | 4 | 4% | 26 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 10 |
| sample.RamFire 1.0 | 3 | 3% | 3 |
6 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 60.2 | 30 / 210 | 4.58 | 12.4% | 23228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.6% | 115 |
| cs.Wren 1.0 | 2.3 | 12.8% | 22 |
| hadur117.micro.SaorOG2 0.1 | 2.7 | 12.4% | 30 |
| mz.Cork 0.1 | 4.7 | 10.9% | 13 |
| js.PinBall 1.6 | 4.8 | 11.0% | 12 |
| joe.ADinosaur 1.0 | 5.5 | 9.7% | 5 |
| evd.X1 0.01 | 7.2 | 8.7% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.5% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 61.0 | 4 / 35 | 3923 |
| 2 | 2 | 57.3 | 61.3 | 5 / 35 | 3696 |
| 3 | 3 | 57.2 | 58.4 | 5 / 35 | 3827 |
| 4 | 2 | 59.4 | 63.5 | 8 / 35 | 3815 |
| 5 | 3 | 57.0 | 59.0 | 2 / 35 | 4052 |
| 6 | 3 | 57.3 | 58.1 | 6 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 64 | 16% |
| cs.Wren 1.0 | 8 | 75% |
| mz.Cork 0.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| js.PinBall 1.6 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 94 | 52% | 106 |
| cs.Wren 1.0 | 22 | 12% | 26 |
| joe.ADinosaur 1.0 | 21 | 12% | 21 |
| evd.X1 0.01 | 16 | 9% | 17 |
| PSW.Relentless 0.1 | 11 | 6% | 11 |
| js.PinBall 1.6 | 8 | 4% | 10 |
| mz.Cork 0.1 | 5 | 3% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 73.3 | 89 / 210 | 3.40 | 15.4% | 21299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 15.4% | 89 |
| ntc.Opposite 1.5 | 2.7 | 12.0% | 16 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 23 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.1% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.5% | 7 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.7% | 8 |
| DBall.NUKE 0.1 | 7.0 | 8.8% | 14 |
| disan.Chair 2.2.0 | 7.3 | 8.5% | 18 |
| donjezza.Muncho 1.0 | 8.8 | 6.7% | 13 |
| pbg.R2D2 1.0 | 10.0 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 71.4 | 15 / 35 | 3855 |
| 2 | 1 | 62.4 | 74.3 | 17 / 35 | 3274 |
| 3 | 1 | 63.5 | 76.8 | 15 / 35 | 3663 |
| 4 | 1 | 61.7 | 72.1 | 12 / 35 | 3543 |
| 5 | 1 | 63.4 | 74.6 | 18 / 35 | 3295 |
| 6 | 1 | 61.4 | 70.5 | 12 / 35 | 3669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 24 | 46% |
| ntc.Opposite 1.5 | 21 | 81% |
| myl.nano.Graviton 1.10 | 20 | 80% |
| disan.Chair 2.2.0 | 16 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| donjezza.Muncho 1.0 | 11 | 73% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 25% | 42 |
| ntc.Opposite 1.5 | 22 | 17% | 33 |
| myl.nano.Graviton 1.10 | 18 | 14% | 34 |
| pfvicm.Sobieski 7.2.3b | 17 | 13% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 9% | 23 |
| donjezza.Muncho 1.0 | 9 | 7% | 16 |
| DBall.NUKE 0.1 | 8 | 6% | 24 |
| disan.Chair 2.2.0 | 5 | 4% | 11 |
| pbg.R2D2 1.0 | 2 | 2% | 4 |
3 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 64.8 | 73 / 210 | 4.17 | 13.2% | 17190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.0 | 14.4% | 51 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 47 |
| hadur117.micro.SaorOG2 0.1 | 3.3 | 13.2% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 13.1% | 21 |
| yagami.Tidus 0.11 | 4.2 | 12.7% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 65.4 | 15 / 35 | 3128 |
| 2 | 3 | 60.2 | 64.4 | 13 / 35 | 3194 |
| 3 | 1 | 62.1 | 72.1 | 14 / 35 | 2930 |
| 4 | 4 | 60.6 | 68.9 | 11 / 35 | 2486 |
| 5 | 6 | 56.4 | 54.3 | 10 / 35 | 2763 |
| 6 | 4 | 58.5 | 63.5 | 10 / 35 | 2689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 64% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 85% |
| kawigi.micro.Shiz 1.1 | 17 | 65% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 43% | 80 |
| kawigi.micro.Shiz 1.1 | 19 | 14% | 25 |
| yagami.Tidus 0.11 | 16 | 12% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 38 |
| ejb.Polaris 1.0.1 | 12 | 9% | 18 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| kurios.DOSexe .9a | 5 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.8 | 92 / 210 | 3.71 | 14.4% | 19276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.7 | 14.4% | 92 |
| wee.Gem 1.8.4 | 2.5 | 13.5% | 52 |
| wompi.Quokka 1.6 | 3.5 | 12.3% | 22 |
| bzdp.Pansy 2.1 | 3.7 | 12.0% | 20 |
| ratosh.Nobo 0.21 | 4.2 | 11.6% | 7 |
| m3thos.Eva00 1.1 | 5.7 | 10.2% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 61.9 | 15 / 35 | 2772 |
| 2 | 2 | 59.6 | 66.0 | 13 / 35 | 3149 |
| 3 | 2 | 62.2 | 71.7 | 15 / 35 | 3344 |
| 4 | 1 | 59.5 | 66.3 | 12 / 35 | 3294 |
| 5 | 1 | 65.2 | 80.3 | 19 / 35 | 3595 |
| 6 | 1 | 61.7 | 72.7 | 18 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 44 | 80% |
| bzdp.Pansy 2.1 | 21 | 86% |
| wompi.Quokka 1.6 | 18 | 83% |
| m3thos.Eva00 1.1 | 11 | 73% |
| ratosh.Nobo 0.21 | 10 | 90% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 120 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 25 | 21% | 60 |
| wompi.Quokka 1.6 | 18 | 15% | 24 |
| bzdp.Pansy 2.1 | 16 | 13% | 36 |
| maribo.FollowFire 1 | 14 | 12% | 16 |
| m3thos.Eva00 1.1 | 12 | 10% | 24 |
| ratosh.Nobo 0.21 | 10 | 8% | 23 |
| bayen.UbaMicro 1.4 | 8 | 7% | 11 |
| stelo.MyAgileRobot 0.2 | 8 | 7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 6% | 6 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.9 | 16 / 210 | 3.35 | 16.0% | 33526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.9% | 162 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 16.0% | 16 |
| mz.NanoGod 2.02 | 2.8 | 14.8% | 21 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.2% | 6 |
| ayk.WallHugger 1.0 | 5.2 | 9.0% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 6.1% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 75.6 | 1 / 35 | 5734 |
| 2 | 2 | 67.6 | 79.0 | 7 / 35 | 5800 |
| 3 | 2 | 65.9 | 74.9 | 1 / 35 | 5328 |
| 4 | 3 | 60.1 | 58.4 | 1 / 35 | 4943 |
| 5 | 2 | 65.5 | 77.1 | 1 / 35 | 5493 |
| 6 | 2 | 67.5 | 78.1 | 5 / 35 | 6228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 95 | 2% |
| mz.NanoGod 2.02 | 7 | 43% |
| exauge.GateKeeper 1.1.121g | 5 | 80% |
| drd.Dreadknoght 0.9 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 50% |

Hadur died in 194 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 126 | 65% | 131 |
| mz.NanoGod 2.02 | 33 | 17% | 39 |
| exauge.GateKeeper 1.1.121g | 13 | 7% | 15 |
| ayk.WallHugger 1.0 | 11 | 6% | 12 |
| drd.Dreadknoght 0.9 | 4 | 2% | 5 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |
| sample.SittingDuck 1.0 | 1 | 1% | 0 |

## Melee bench: F16

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 57.2 | 70 / 210 | 4.85 | 12.6% | 19861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 1.7 | 13.0% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 28 |
| hadur117.micro.SaorOG2 0.1 | 2.8 | 12.6% | 70 |
| bvh.micro.Freya 0.3 | 3.8 | 11.9% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.4% | 28 |
| stelo.MirrorMicro 1.0 | 6.5 | 9.4% | 12 |
| conscience.Electron 1.3g | 7.3 | 8.4% | 6 |
| dl.BetterWalls 1.0 | 7.5 | 7.8% | 8 |
| ap.Frederick 1.1 | 8.7 | 6.8% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 61.3 | 14 / 35 | 3501 |
| 2 | 2 | 58.6 | 61.6 | 9 / 35 | 3523 |
| 3 | 1 | 61.5 | 69.8 | 17 / 35 | 3435 |
| 4 | 5 | 53.2 | 46.7 | 10 / 35 | 3100 |
| 5 | 2 | 57.1 | 57.8 | 11 / 35 | 3383 |
| 6 | 5 | 52.3 | 46.3 | 9 / 35 | 2919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 27 | 93% |
| voidious.micro.BlitzBat 1.05 | 24 | 75% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 73% |
| bvh.micro.Freya 0.3 | 11 | 82% |
| conscience.Electron 1.3g | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dl.BetterWalls 1.0 | 24 | 17% | 25 |
| dummy.micro.Sparrow 2.5 | 22 | 16% | 41 |
| voidious.micro.BlitzBat 1.05 | 19 | 14% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 13% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 13% | 19 |
| bvh.micro.Freya 0.3 | 17 | 12% | 24 |
| conscience.Electron 1.3g | 14 | 10% | 17 |
| stelo.MirrorMicro 1.0 | 8 | 6% | 10 |

## Melee bench: F17

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.9 | 84 / 210 | 3.70 | 15.6% | 26573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.2 | 16.8% | 47 |
| hadur117.micro.SaorOG2 0.1 | 1.8 | 15.6% | 84 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.8% | 21 |
| sul.Lunar 1.1 | 3.5 | 11.9% | 25 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.2% | 6 |
| dsw.StaticD 1.0 | 5.5 | 9.0% | 8 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.5% | 7 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.2% | 11 |
| sample.Corners 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 65.1 | 10 / 35 | 4258 |
| 2 | 2 | 65.3 | 74.0 | 13 / 35 | 4942 |
| 3 | 2 | 62.1 | 67.6 | 13 / 35 | 4050 |
| 4 | 2 | 61.0 | 62.2 | 13 / 35 | 4015 |
| 5 | 1 | 66.4 | 77.5 | 18 / 35 | 4900 |
| 6 | 2 | 64.7 | 73.3 | 17 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 73% |
| sul.Lunar 1.1 | 27 | 81% |
| supersample.SuperBoxBot 1.0 | 14 | 71% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstRobot 1.0 | 6 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 35% | 76 |
| supersample.SuperBoxBot 1.0 | 33 | 26% | 43 |
| dsw.StaticD 1.0 | 16 | 13% | 24 |
| sul.Lunar 1.1 | 11 | 9% | 34 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 12 |
| mme.NikeEnhanced 2.0 | 6 | 5% | 9 |
| sample.Corners 1.0 | 3 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.9 | 65 / 210 | 3.70 | 15.1% | 29387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.3 | 15.1% | 65 |
| radnor.DoctorBob 1.42 | 2.7 | 13.7% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 13.0% | 37 |
| mld.Wisdom 1.0 | 3.5 | 12.5% | 26 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 12 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.9% | 8 |
| sample.Walls 1.0 | 6.5 | 8.8% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 5 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.1 | 15 / 35 | 5380 |
| 2 | 1 | 60.6 | 67.0 | 9 / 35 | 4312 |
| 3 | 2 | 62.8 | 67.3 | 12 / 35 | 5001 |
| 4 | 1 | 61.2 | 65.1 | 9 / 35 | 4988 |
| 5 | 2 | 61.9 | 67.9 | 9 / 35 | 4892 |
| 6 | 1 | 63.7 | 74.3 | 11 / 35 | 4814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 64% |
| radnor.DoctorBob 1.42 | 34 | 56% |
| mld.Wisdom 1.0 | 12 | 67% |
| amz.NanoClone 1.41 | 8 | 50% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 50% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 27% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 24% | 65 |
| mld.Wisdom 1.0 | 24 | 16% | 31 |
| KiraNL.Chupacabra 0.4 | 23 | 16% | 27 |
| amz.NanoClone 1.41 | 10 | 7% | 16 |
| sample.Walls 1.0 | 5 | 3% | 7 |
| jangs.ns51 1.0 | 4 | 3% | 6 |
| GarmBox.Oranges 1.0 | 4 | 3% | 3 |
| sample.Target 1.0 | 1 | 1% | 0 |
1 death(s) with no robot to name.

