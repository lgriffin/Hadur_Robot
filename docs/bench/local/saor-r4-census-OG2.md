# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 73.2 | 58 / 210 | 3.41 | 15.4% | 26239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.5 | 16.4% | 58 |
| hadur117.micro.SaorOG2 0.1 | 2.0 | 15.4% | 58 |
| mld.Infinity 2.2 | 3.2 | 14.9% | 41 |
| mz.AntiGrav 1.0 | 3.3 | 14.5% | 34 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.3 | 7.9% | 6 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 5 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 75.6 | 8 / 35 | 4542 |
| 2 | 2 | 64.6 | 74.0 | 12 / 35 | 4095 |
| 3 | 3 | 64.6 | 72.7 | 10 / 35 | 4500 |
| 4 | 2 | 64.6 | 75.9 | 13 / 35 | 4060 |
| 5 | 2 | 63.4 | 67.6 | 10 / 35 | 4476 |
| 6 | 1 | 64.0 | 73.3 | 5 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 46% |
| mld.Infinity 2.2 | 33 | 52% |
| mz.AntiGrav 1.0 | 24 | 79% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| amz.NanoClone 1.41 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 57 | 38% | 86 |
| mld.Infinity 2.2 | 42 | 28% | 34 |
| mz.AntiGrav 1.0 | 21 | 14% | 46 |
| amz.NanoClone 1.41 | 11 | 7% | 15 |
| jangs.ns51 1.0 | 8 | 5% | 12 |
| sample.Walls 1.0 | 8 | 5% | 9 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| sample.Target 1.0 | 1 | 1% | 0 |

## Melee bench: F02

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.7 | 82 / 210 | 3.55 | 14.7% | 21639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.2 | 16.3% | 83 |
| hadur117.micro.SaorOG2 0.1 | 2.0 | 14.7% | 82 |
| mld.DustBunny 3.8 | 2.8 | 13.7% | 16 |
| maribo.melee.BMV 0.1 | 4.5 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 10.6% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.3% | 9 |
| zyx.nano.Ant 1.1 | 7.3 | 7.5% | 1 |
| bzdp.BoxCar 2.0 | 7.8 | 7.1% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 5.8% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 76.2 | 15 / 35 | 3684 |
| 2 | 2 | 63.3 | 73.7 | 13 / 35 | 4011 |
| 3 | 2 | 64.3 | 78.4 | 16 / 35 | 3706 |
| 4 | 1 | 65.0 | 85.4 | 15 / 35 | 3378 |
| 5 | 2 | 61.6 | 71.4 | 14 / 35 | 3230 |
| 6 | 3 | 54.7 | 45.1 | 9 / 35 | 3630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 59% |
| mld.DustBunny 3.8 | 28 | 89% |
| djdjdj.NanoSkunk10 1.0 | 14 | 71% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 50% |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 30% | 74 |
| mld.DustBunny 3.8 | 27 | 21% | 54 |
| djdjdj.NanoSkunk10 1.0 | 22 | 17% | 30 |
| cs.Grudge 1.0 | 16 | 12% | 17 |
| zyx.nano.Ant 1.1 | 7 | 5% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 4% | 10 |
| fullsail.SweetTea 1.1 | 5 | 4% | 7 |
| maribo.melee.BMV 0.1 | 5 | 4% | 7 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.3 | 82 / 210 | 3.85 | 15.0% | 24515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.2 | 16.1% | 67 |
| hadur117.micro.SaorOG2 0.1 | 1.8 | 15.0% | 82 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.6% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.8% | 32 |
| fm.mammillarias 1.3 | 5.5 | 9.7% | 4 |
| cb.nano.Insomnia 1.0 | 6.0 | 9.6% | 7 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.5% | 3 |
| sample.Fire 1.0 | 8.8 | 5.6% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 67.6 | 16 / 35 | 4397 |
| 2 | 1 | 64.2 | 71.4 | 14 / 35 | 4349 |
| 3 | 2 | 61.7 | 68.9 | 13 / 35 | 3701 |
| 4 | 2 | 63.5 | 70.8 | 14 / 35 | 4104 |
| 5 | 2 | 60.9 | 64.1 | 13 / 35 | 3694 |
| 6 | 2 | 62.4 | 67.0 | 12 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 63% |
| cb.nano.Insomnia 1.0 | 17 | 82% |
| myl.nano.KomoriNinja 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| sample.Fire 1.0 | 2 | 50% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 35 | 27% | 44 |
| myl.micro.Troodon 1.10 | 28 | 22% | 74 |
| cb.nano.Insomnia 1.0 | 18 | 14% | 15 |
| myl.nano.KomoriNinja 1.1 | 17 | 13% | 35 |
| fm.mammillarias 1.3 | 10 | 8% | 13 |
| sample.Tracker 1.0 | 6 | 5% | 6 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 8 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 6 |
| sample.Fire 1.0 | 4 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.5 | 95 / 210 | 2.93 | 17.1% | 28963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 17.1% | 95 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.3% | 29 |
| tvv.micro.Antares 1.1.1 | 2.7 | 13.0% | 25 |
| tj.zombie1n 1.0.1 | 4.7 | 10.2% | 21 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.6% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.4% | 3 |
| yk.JahMicro 1.0 | 7.2 | 8.0% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.8% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.6 | 17 / 35 | 4536 |
| 2 | 1 | 66.0 | 77.1 | 18 / 35 | 5211 |
| 3 | 1 | 68.3 | 84.8 | 20 / 35 | 5615 |
| 4 | 1 | 64.9 | 76.2 | 12 / 35 | 4642 |
| 5 | 1 | 64.7 | 78.7 | 12 / 35 | 4642 |
| 6 | 1 | 64.9 | 78.7 | 16 / 35 | 4317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 76% |
| tvv.micro.Antares 1.1.1 | 26 | 77% |
| stelo.SoJNanoMelee 1.1 | 24 | 50% |
| tj.zombie1n 1.0.1 | 14 | 29% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| yk.JahMicro 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 115 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 30% | 83 |
| stelo.SoJNanoMelee 1.1 | 25 | 22% | 30 |
| tvv.micro.Antares 1.1.1 | 17 | 15% | 40 |
| tj.zombie1n 1.0.1 | 15 | 13% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 10% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 16 |
| yk.JahMicro 1.0 | 4 | 3% | 7 |
| repositorio.NanoStep 1.0 | 2 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 56.6 | 65 / 210 | 4.91 | 12.8% | 21098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 1.8 | 12.7% | 34 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 12.8% | 65 |
| ahf.NanoAndrew .4 | 2.8 | 12.3% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.7% | 23 |
| sam.Samspin 1.0 | 5.2 | 10.5% | 21 |
| EBBU.Sim2 1.02 | 5.7 | 10.1% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.8% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.1% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.6 | 52.7 | 12 / 35 | 3792 |
| 2 | 1 | 61.2 | 65.7 | 12 / 35 | 4137 |
| 3 | 5 | 53.0 | 45.7 | 8 / 35 | 2840 |
| 4 | 1 | 58.6 | 61.3 | 12 / 35 | 3376 |
| 5 | 2 | 56.5 | 54.3 | 9 / 35 | 3601 |
| 6 | 2 | 58.4 | 59.7 | 12 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 83% |
| oog.melee.Corsair 1.0 | 22 | 73% |
| ahf.NanoAndrew .4 | 16 | 94% |
| sam.Samspin 1.0 | 6 | 83% |
| EBBU.Sim2 1.02 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 50% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 25% | 55 |
| zyx.nano.BacillusComma 1.0 | 24 | 16% | 27 |
| oog.melee.Corsair 1.0 | 21 | 14% | 34 |
| ahf.NanoAndrew .4 | 13 | 9% | 29 |
| sam.Samspin 1.0 | 13 | 9% | 20 |
| robar.nano.Assertive_Melee 0.2 | 12 | 8% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 8% | 12 |
| EBBU.Sim2 1.02 | 8 | 5% | 10 |
| sample.TrackFire 1.0 | 6 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.9 | 103 / 210 | 2.99 | 16.2% | 23092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.3 | 16.2% | 103 |
| d414.nano.Quantum 1.0.0 | 1.7 | 15.7% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.1% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.1% | 31 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.2% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.8% | 11 |
| sample.SpinBot 1.0 | 6.8 | 8.5% | 6 |
| fm.claire 1.7 | 6.8 | 8.0% | 3 |
| pa.Improved 1.0 | 9.5 | 5.2% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.2 | 15 / 35 | 4492 |
| 2 | 1 | 64.5 | 81.3 | 17 / 35 | 3543 |
| 3 | 1 | 64.4 | 75.9 | 18 / 35 | 3989 |
| 4 | 1 | 66.1 | 83.5 | 21 / 35 | 3820 |
| 5 | 2 | 64.8 | 81.9 | 18 / 35 | 3593 |
| 6 | 2 | 61.9 | 69.8 | 14 / 35 | 3655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 83% |
| oog.melee.CapuletDroid 1.1 | 27 | 74% |
| gh.nano.Grofvuil 0.2 | 16 | 75% |
| sample.SpinBot 1.0 | 11 | 82% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 29% | 84 |
| oog.melee.CapuletDroid 1.1 | 21 | 20% | 20 |
| arthord.NanoSatanMelee Beta | 13 | 12% | 19 |
| gh.nano.Grofvuil 0.2 | 11 | 10% | 32 |
| sample.SpinBot 1.0 | 11 | 10% | 18 |
| fm.claire 1.7 | 11 | 10% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 11 |
| kurios.DOSexe .9b | 2 | 2% | 4 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.6 | 56 / 210 | 3.91 | 13.8% | 22546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.5 | 16.2% | 67 |
| spinnercat.micro.Tyger 0.1 | 1.8 | 14.7% | 42 |
| hadur117.micro.SaorOG2 0.1 | 3.2 | 13.8% | 56 |
| mz.MicroGodMelee 1 | 3.5 | 13.5% | 25 |
| DBall.Anarchy 0.1 | 5.2 | 9.6% | 12 |
| caimano.Furia_Ceca 0.22 | 6.8 | 7.4% | 0 |
| acogdev.alpha 0.2 | 7.3 | 6.8% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 4 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 4 |
| fire219.CatBot 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 74.6 | 12 / 35 | 3750 |
| 2 | 1 | 64.1 | 78.1 | 14 / 35 | 4101 |
| 3 | 4 | 57.3 | 59.0 | 10 / 35 | 3317 |
| 4 | 3 | 60.4 | 69.2 | 7 / 35 | 3787 |
| 5 | 4 | 59.9 | 62.5 | 4 / 35 | 4245 |
| 6 | 4 | 58.4 | 62.2 | 9 / 35 | 3346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 34 | 26% |
| spinnercat.micro.Tyger 0.1 | 28 | 50% |
| mz.MicroGodMelee 1 | 25 | 84% |
| DBall.Anarchy 0.1 | 10 | 70% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 49 | 32% | 62 |
| spinnercat.micro.Tyger 0.1 | 37 | 24% | 53 |
| mz.MicroGodMelee 1 | 25 | 16% | 43 |
| acogdev.alpha 0.2 | 12 | 8% | 13 |
| fire219.CatBot 1.0 | 8 | 5% | 8 |
| DBall.Anarchy 0.1 | 6 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 4% | 8 |
| mbro.Detektor3 0.1.1 | 6 | 4% | 7 |
| el.JumpShoot 0.2 | 5 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 63.1 | 71 / 210 | 4.32 | 14.2% | 25638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 16.5% | 65 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 14.2% | 71 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 14.1% | 36 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 10.0% | 11 |
| awesomeness.Elite 1.0 | 5.3 | 9.1% | 8 |
| germ.TheMind .2 | 5.8 | 9.1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 68.3 | 16 / 35 | 4387 |
| 2 | 2 | 63.3 | 71.7 | 12 / 35 | 3924 |
| 3 | 2 | 59.1 | 59.4 | 7 / 35 | 4344 |
| 4 | 2 | 60.6 | 59.7 | 13 / 35 | 4374 |
| 5 | 2 | 61.8 | 65.4 | 13 / 35 | 4219 |
| 6 | 3 | 58.5 | 54.0 | 10 / 35 | 4390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 67% |
| awesomeness.Elite 1.0 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 60% |
| germ.TheMind .2 | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 45% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 21% | 44 |
| germ.TheMind .2 | 18 | 13% | 23 |
| stelo.UntouchableNano 1.3 | 6 | 4% | 8 |
| mym.EdgeStalker 1.0 | 6 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 9 |
| awesomeness.Elite 1.0 | 4 | 3% | 10 |
| sample.Crazy 1.0 | 4 | 3% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 7 |

## Melee bench: F09

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.7 | 118 / 210 | 2.47 | 18.0% | 26135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.0% | 118 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 13.5% | 24 |
| maribo.IotaCT 1.1 | 3.7 | 12.3% | 27 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.6% | 1 |
| stelo.PatternRobot 1.0 | 7.0 | 8.3% | 8 |
| ratosh.Wesco 1.4 | 7.5 | 7.7% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 7.1% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.5 | 16 / 35 | 4313 |
| 2 | 1 | 65.2 | 76.8 | 14 / 35 | 4238 |
| 3 | 1 | 70.4 | 91.7 | 25 / 35 | 4465 |
| 4 | 1 | 69.0 | 87.0 | 22 / 35 | 4582 |
| 5 | 1 | 67.3 | 81.0 | 21 / 35 | 4361 |
| 6 | 1 | 67.3 | 81.9 | 20 / 35 | 4176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 57 | 91% |
| nz.jdc.nano.GridFu 1.0 | 43 | 79% |
| maribo.IotaCT 1.1 | 27 | 52% |
| timmit.nano.TimDog 0.33 | 10 | 100% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| ratosh.Wesco 1.4 | 3 | 33% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.IotaCT 1.1 | 22 | 23% | 43 |
| nz.jdc.nano.GridFu 1.0 | 19 | 20% | 52 |
| stelo.PatternRobot 1.0 | 17 | 18% | 20 |
| rz.HawkOnFire 0.1 | 15 | 16% | 59 |
| ratosh.Wesco 1.4 | 9 | 10% | 13 |
| timmit.nano.TimDog 0.33 | 7 | 7% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.1 | 123 / 210 | 2.61 | 18.3% | 31875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.3% | 123 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.2% | 34 |
| baal.nano.N 1.42 | 3.2 | 12.2% | 9 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 9 |
| zyx.micro.Ant 1.1 | 5.0 | 9.6% | 10 |
| sanja.First 0.1 | 6.0 | 8.9% | 6 |
| cvt.Firsty 1.0 | 7.7 | 7.5% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.4% | 3 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 2 |
| sample.RamFire 1.0 | 9.5 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.5 | 19 / 35 | 4969 |
| 2 | 1 | 66.3 | 74.9 | 21 / 35 | 5446 |
| 3 | 1 | 69.3 | 86.3 | 24 / 35 | 5465 |
| 4 | 1 | 67.8 | 85.1 | 20 / 35 | 5184 |
| 5 | 1 | 67.5 | 83.2 | 21 / 35 | 5361 |
| 6 | 1 | 66.8 | 80.3 | 18 / 35 | 5450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 79% |
| baal.nano.N 1.42 | 36 | 97% |
| cvt.Firsty 1.0 | 20 | 50% |
| zyx.micro.Ant 1.1 | 17 | 88% |
| sanja.First 0.1 | 17 | 82% |
| Grystrion.TrackerWO 1.0 | 11 | 64% |
| amk.Punbot.Punbot 0.01 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 2 | 50% |

Hadur died in 89 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 20 | 22% | 55 |
| zyx.micro.Ant 1.1 | 15 | 17% | 38 |
| cvt.Firsty 1.0 | 11 | 12% | 23 |
| sample.RamFire 1.0 | 11 | 12% | 15 |
| baal.nano.N 1.42 | 8 | 9% | 30 |
| Grystrion.TrackerWO 1.0 | 8 | 9% | 16 |
| sanja.First 0.1 | 6 | 7% | 19 |
| amk.Punbot.Punbot 0.01 | 4 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 5 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 60.5 | 34 / 210 | 4.55 | 12.8% | 24643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.0% | 111 |
| hadur117.micro.SaorOG2 0.1 | 2.7 | 12.8% | 34 |
| cs.Wren 1.0 | 2.8 | 12.7% | 20 |
| js.PinBall 1.6 | 4.2 | 11.3% | 12 |
| mz.Cork 0.1 | 4.3 | 11.2% | 14 |
| evd.X1 0.01 | 6.3 | 8.5% | 6 |
| joe.ADinosaur 1.0 | 6.7 | 8.7% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.9% | 9 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 67.9 | 3 / 35 | 3814 |
| 2 | 3 | 56.6 | 56.2 | 7 / 35 | 3641 |
| 3 | 2 | 60.0 | 65.7 | 5 / 35 | 4489 |
| 4 | 3 | 57.1 | 54.6 | 4 / 35 | 4614 |
| 5 | 4 | 55.5 | 53.7 | 6 / 35 | 3756 |
| 6 | 2 | 60.5 | 65.1 | 9 / 35 | 4329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 25% |
| cs.Wren 1.0 | 7 | 100% |
| mz.Cork 0.1 | 6 | 67% |
| js.PinBall 1.6 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 25% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 89 | 50% | 105 |
| evd.X1 0.01 | 21 | 12% | 22 |
| mz.Cork 0.1 | 13 | 7% | 16 |
| joe.ADinosaur 1.0 | 13 | 7% | 13 |
| cs.Wren 1.0 | 12 | 7% | 18 |
| js.PinBall 1.6 | 10 | 6% | 15 |
| PSW.Relentless 0.1 | 9 | 5% | 9 |
| donjezza.Jezza 1.0 | 6 | 3% | 8 |
| jsal.Jsalbot 1.0 | 4 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 71.8 | 92 / 210 | 3.54 | 15.2% | 21667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 15.2% | 92 |
| myl.nano.Graviton 1.10 | 3.2 | 12.0% | 30 |
| ntc.Opposite 1.5 | 3.3 | 11.9% | 15 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.6% | 32 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.2% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 10.4% | 5 |
| DBall.NUKE 0.1 | 6.5 | 9.0% | 13 |
| disan.Chair 2.2.0 | 7.7 | 8.4% | 13 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 80.0 | 15 / 35 | 3666 |
| 2 | 1 | 61.2 | 68.6 | 15 / 35 | 3329 |
| 3 | 1 | 62.7 | 74.0 | 13 / 35 | 3536 |
| 4 | 1 | 62.8 | 74.9 | 16 / 35 | 3496 |
| 5 | 1 | 62.4 | 67.9 | 18 / 35 | 3900 |
| 6 | 1 | 61.0 | 65.4 | 15 / 35 | 3740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 90% |
| stelo.AreaTargetingBot 1.1 | 23 | 57% |
| ntc.Opposite 1.5 | 14 | 71% |
| disan.Chair 2.2.0 | 11 | 73% |
| DBall.NUKE 0.1 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 31% | 56 |
| pfvicm.Sobieski 7.2.3b | 20 | 17% | 27 |
| ntc.Opposite 1.5 | 13 | 11% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 19 |
| DBall.NUKE 0.1 | 10 | 8% | 26 |
| myl.nano.Graviton 1.10 | 8 | 7% | 30 |
| disan.Chair 2.2.0 | 8 | 7% | 12 |
| donjezza.Muncho 1.0 | 6 | 5% | 11 |
| pbg.R2D2 1.0 | 3 | 2% | 5 |
3 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 60.7 | 52 / 210 | 4.53 | 12.1% | 16118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 15.1% | 48 |
| oog.melee.Capulet 1.2 | 1.7 | 14.8% | 55 |
| yagami.Tidus 0.11 | 3.8 | 12.8% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 25 |
| hadur117.micro.SaorOG2 0.1 | 4.5 | 12.1% | 52 |
| ejb.Polaris 1.0.1 | 5.3 | 11.1% | 14 |
| step.nanoPri 1.0 | 7.3 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.1 | 61.3 | 10 / 35 | 2609 |
| 2 | 4 | 57.7 | 61.6 | 7 / 35 | 2440 |
| 3 | 5 | 58.4 | 59.4 | 10 / 35 | 2909 |
| 4 | 5 | 55.8 | 55.6 | 9 / 35 | 2324 |
| 5 | 6 | 56.0 | 55.6 | 6 / 35 | 2805 |
| 6 | 2 | 60.8 | 71.1 | 10 / 35 | 3031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 23 | 65% |
| kawigi.micro.Shiz 1.1 | 22 | 73% |
| yagami.Tidus 0.11 | 16 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 75% |
| ejb.Polaris 1.0.1 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 35% | 64 |
| yagami.Tidus 0.11 | 29 | 18% | 43 |
| kawigi.micro.Shiz 1.1 | 29 | 18% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 11% | 31 |
| ejb.Polaris 1.0.1 | 12 | 8% | 16 |
| kurios.DOSexe .9a | 8 | 5% | 9 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.3 | 92 / 210 | 3.68 | 14.3% | 18544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 14.3% | 92 |
| wee.Gem 1.8.4 | 2.0 | 13.3% | 47 |
| wompi.Quokka 1.6 | 3.2 | 12.7% | 25 |
| bzdp.Pansy 2.1 | 4.0 | 12.2% | 25 |
| ratosh.Nobo 0.21 | 4.3 | 11.7% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 9.8% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 74.3 | 17 / 35 | 3317 |
| 2 | 1 | 63.8 | 78.4 | 18 / 35 | 3101 |
| 3 | 1 | 61.5 | 72.7 | 19 / 35 | 2734 |
| 4 | 4 | 56.9 | 56.8 | 10 / 35 | 3223 |
| 5 | 1 | 60.1 | 66.3 | 14 / 35 | 3260 |
| 6 | 1 | 61.4 | 73.0 | 14 / 35 | 2909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 36 | 86% |
| bzdp.Pansy 2.1 | 28 | 82% |
| wompi.Quokka 1.6 | 21 | 71% |
| m3thos.Eva00 1.1 | 12 | 75% |
| ratosh.Nobo 0.21 | 12 | 92% |
| bayen.UbaMicro 1.4 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 25 | 21% | 60 |
| maribo.FollowFire 1 | 19 | 16% | 21 |
| wompi.Quokka 1.6 | 18 | 15% | 24 |
| bzdp.Pansy 2.1 | 17 | 14% | 43 |
| ratosh.Nobo 0.21 | 9 | 8% | 20 |
| m3thos.Eva00 1.1 | 9 | 8% | 16 |
| bayen.UbaMicro 1.4 | 9 | 8% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 6% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.9 | 18 / 210 | 3.44 | 15.9% | 32762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.2% | 165 |
| hadur117.micro.SaorOG2 0.1 | 2.3 | 15.9% | 18 |
| mz.NanoGod 2.02 | 2.7 | 15.1% | 18 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.7% | 4 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 2 |
| stuff.Vlad 0.1 | 5.5 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 73.7 | 3 / 35 | 5501 |
| 2 | 3 | 65.3 | 74.3 | 3 / 35 | 5227 |
| 3 | 3 | 66.1 | 78.1 | 3 / 35 | 5071 |
| 4 | 2 | 65.5 | 69.8 | 3 / 35 | 5796 |
| 5 | 2 | 64.7 | 71.1 | 3 / 35 | 5360 |
| 6 | 2 | 65.9 | 70.5 | 3 / 35 | 5807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 0% |
| mz.NanoGod 2.02 | 16 | 75% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 124 | 64% | 126 |
| mz.NanoGod 2.02 | 35 | 18% | 47 |
| exauge.GateKeeper 1.1.121g | 11 | 6% | 13 |
| ayk.WallHugger 1.0 | 11 | 6% | 12 |
| stelo.PianistNano 1.2 | 5 | 3% | 5 |
| stuff.Vlad 0.1 | 5 | 3% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |
| cli.WasteOfAmmo 1.0 | 1 | 1% | 0 |

## Melee bench: F16

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 58.9 | 64 / 210 | 4.70 | 12.9% | 20878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.0 | 13.9% | 39 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.6% | 28 |
| hadur117.micro.SaorOG2 0.1 | 2.8 | 12.9% | 64 |
| bvh.micro.Freya 0.3 | 4.2 | 11.6% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 17 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.7% | 14 |
| dl.BetterWalls 1.0 | 8.0 | 7.1% | 9 |
| ap.Frederick 1.1 | 8.0 | 7.5% | 16 |
| conscience.Electron 1.3g | 8.2 | 7.8% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 54.3 | 9 / 35 | 3270 |
| 2 | 2 | 58.9 | 58.7 | 13 / 35 | 3828 |
| 3 | 3 | 55.8 | 51.7 | 9 / 35 | 3559 |
| 4 | 2 | 58.9 | 61.9 | 9 / 35 | 3843 |
| 5 | 3 | 57.5 | 57.8 | 12 / 35 | 3157 |
| 6 | 2 | 60.5 | 68.9 | 12 / 35 | 3221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 67% |
| dummy.micro.Sparrow 2.5 | 23 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 100% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| bvh.micro.Freya 0.3 | 6 | 83% |
| dl.BetterWalls 1.0 | 1 | 0% |

Hadur died in 146 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 17% | 47 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 15% | 35 |
| conscience.Electron 1.3g | 22 | 15% | 22 |
| bvh.micro.Freya 0.3 | 21 | 14% | 22 |
| dummy.micro.Sparrow 2.5 | 19 | 13% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 13% | 20 |
| dl.BetterWalls 1.0 | 13 | 9% | 14 |
| stelo.MirrorMicro 1.0 | 5 | 3% | 11 |

## Melee bench: F17

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.9 | 101 / 210 | 3.35 | 16.5% | 27044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.3 | 16.9% | 39 |
| hadur117.micro.SaorOG2 0.1 | 1.7 | 16.5% | 101 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 20 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.7% | 18 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.2% | 11 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.7% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.4% | 5 |
| sample.Corners 1.0 | 9.2 | 6.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.4 | 16 / 35 | 5015 |
| 2 | 1 | 66.6 | 77.8 | 18 / 35 | 4583 |
| 3 | 2 | 64.1 | 70.2 | 18 / 35 | 4656 |
| 4 | 2 | 61.5 | 67.9 | 15 / 35 | 3746 |
| 5 | 2 | 65.9 | 75.6 | 18 / 35 | 4918 |
| 6 | 2 | 64.0 | 73.3 | 16 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 89% |
| sul.Lunar 1.1 | 21 | 86% |
| supersample.SuperBoxBot 1.0 | 12 | 83% |
| sample.MyFirstRobot 1.0 | 12 | 83% |
| dsw.StaticD 1.0 | 10 | 80% |
| mme.NikeEnhanced 2.0 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 29 | 26% | 68 |
| supersample.SuperBoxBot 1.0 | 27 | 24% | 32 |
| dsw.StaticD 1.0 | 16 | 14% | 23 |
| sul.Lunar 1.1 | 10 | 9% | 31 |
| mme.NikeEnhanced 2.0 | 10 | 9% | 13 |
| sample.Corners 1.0 | 9 | 8% | 12 |
| sample.MyFirstRobot 1.0 | 6 | 5% | 18 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.5 | 71 / 210 | 3.65 | 15.0% | 27688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 15.0% | 71 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.3 | 13.1% | 36 |
| radnor.DoctorBob 1.42 | 2.8 | 13.1% | 42 |
| mld.Wisdom 1.0 | 3.8 | 11.9% | 18 |
| KiraNL.Chupacabra 0.4 | 4.7 | 11.2% | 13 |
| amz.NanoClone 1.41 | 6.0 | 10.2% | 12 |
| sample.Walls 1.0 | 7.0 | 8.6% | 10 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 58.1 | 7 / 35 | 4210 |
| 2 | 1 | 67.4 | 83.5 | 19 / 35 | 4982 |
| 3 | 1 | 63.2 | 72.1 | 11 / 35 | 4866 |
| 4 | 1 | 62.8 | 69.8 | 14 / 35 | 4952 |
| 5 | 1 | 62.7 | 72.1 | 7 / 35 | 4649 |
| 6 | 1 | 60.6 | 67.6 | 13 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 72% |
| radnor.DoctorBob 1.42 | 24 | 46% |
| mld.Wisdom 1.0 | 13 | 77% |
| KiraNL.Chupacabra 0.4 | 11 | 64% |
| amz.NanoClone 1.41 | 9 | 89% |
| sample.Walls 1.0 | 8 | 88% |
| GarmBox.Oranges 1.0 | 4 | 50% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 0% |

Hadur died in 139 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 32% | 68 |
| radnor.DoctorBob 1.42 | 31 | 22% | 42 |
| KiraNL.Chupacabra 0.4 | 23 | 17% | 35 |
| mld.Wisdom 1.0 | 14 | 10% | 25 |
| amz.NanoClone 1.41 | 8 | 6% | 13 |
| jangs.ns51 1.0 | 7 | 5% | 9 |
| sample.Walls 1.0 | 6 | 4% | 13 |
| GarmBox.Oranges 1.0 | 4 | 3% | 2 |
| sample.Target 1.0 | 1 | 1% | 0 |

