# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.7 | 132 / 210 | 2.11 | 20.8% | 41386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.8% | 132 |
| radnor.DoctorBob 1.42 | 2.2 | 14.8% | 30 |
| mz.AntiGrav 1.0 | 3.2 | 13.1% | 14 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 6 |
| sample.Walls 1.0 | 6.5 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 3 |
| arthord.MannyPacquiao Beta | 8.8 | 4.8% | 0 |
| sample.Target 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 94.0 | 28 / 35 | 7374 |
| 2 | 1 | 71.9 | 90.2 | 24 / 35 | 6880 |
| 3 | 1 | 71.0 | 86.7 | 21 / 35 | 6447 |
| 4 | 1 | 71.7 | 86.7 | 20 / 35 | 7042 |
| 5 | 1 | 70.6 | 84.8 | 19 / 35 | 6858 |
| 6 | 1 | 70.1 | 83.8 | 20 / 35 | 6785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 95% |
| radnor.DoctorBob 1.42 | 46 | 74% |
| mld.Infinity 2.2 | 29 | 83% |
| amz.NanoClone 1.41 | 10 | 70% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 45% | 79 |
| mz.AntiGrav 1.0 | 17 | 22% | 67 |
| mld.Infinity 2.2 | 11 | 14% | 31 |
| amz.NanoClone 1.41 | 7 | 9% | 12 |
| sample.Walls 1.0 | 3 | 4% | 10 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.5 | 121 / 210 | 2.49 | 18.4% | 31954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.2 | 18.4% | 121 |
| mld.DustBunny 3.8 | 2.3 | 14.6% | 18 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.9% | 56 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.2% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.6% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| fullsail.SweetTea 1.1 | 7.5 | 7.0% | 7 |
| bzdp.BoxCar 2.0 | 8.8 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.1 | 21 / 35 | 5313 |
| 2 | 1 | 69.3 | 90.2 | 23 / 35 | 5094 |
| 3 | 1 | 69.7 | 91.7 | 23 / 35 | 5024 |
| 4 | 1 | 69.5 | 90.5 | 21 / 35 | 5624 |
| 5 | 1 | 67.4 | 81.0 | 21 / 35 | 5481 |
| 6 | 2 | 63.7 | 62.5 | 12 / 35 | 5418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 79 | 92% |
| oog.melee.Mercutio 1.0 | 50 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 39% | 77 |
| mld.DustBunny 3.8 | 26 | 29% | 88 |
| zyx.nano.Ant 1.1 | 11 | 12% | 18 |
| maribo.melee.BMV 0.1 | 5 | 6% | 7 |
| fullsail.SweetTea 1.1 | 5 | 6% | 7 |
| cs.Grudge 1.0 | 3 | 3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 79.4 | 118 / 210 | 2.86 | 19.1% | 36810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 19.1% | 118 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 10 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.9% | 15 |
| fm.mammillarias 1.3 | 5.3 | 10.0% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.8% | 7 |
| sample.Fire 1.0 | 9.2 | 5.2% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 75.9 | 19 / 35 | 6791 |
| 2 | 1 | 67.7 | 79.0 | 18 / 35 | 5674 |
| 3 | 1 | 68.8 | 82.9 | 20 / 35 | 5600 |
| 4 | 1 | 69.3 | 79.4 | 20 / 35 | 6392 |
| 5 | 1 | 70.3 | 84.8 | 22 / 35 | 6519 |
| 6 | 1 | 67.6 | 74.3 | 19 / 35 | 5834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 94% |
| cb.nano.Insomnia 1.0 | 23 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 81% |
| sp.Nanos.Ember 1.1 | 12 | 75% |
| myl.nano.KomoriNinja 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Tracker 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 23 | 25% | 26 |
| myl.micro.Troodon 1.10 | 21 | 23% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 14% | 29 |
| fm.mammillarias 1.3 | 10 | 11% | 16 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 21 |
| sp.Nanos.Ember 1.1 | 7 | 8% | 20 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 16 |
| sample.Fire 1.0 | 3 | 3% | 4 |
| sample.Tracker 1.0 | 3 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.8 | 130 / 210 | 2.46 | 20.1% | 40197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.1% | 130 |
| tvv.micro.Antares 1.1.1 | 2.3 | 13.3% | 23 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.4% | 16 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.4% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 7.9% | 7 |
| yk.JahMicro 1.0 | 7.3 | 7.5% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 86.3 | 23 / 35 | 6336 |
| 2 | 1 | 69.4 | 83.5 | 22 / 35 | 6237 |
| 3 | 1 | 70.1 | 82.5 | 19 / 35 | 6953 |
| 4 | 1 | 69.4 | 82.2 | 22 / 35 | 6541 |
| 5 | 1 | 70.3 | 82.5 | 22 / 35 | 7227 |
| 6 | 1 | 70.5 | 85.4 | 22 / 35 | 6903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 48 | 94% |
| tvv.micro.Antares 1.1.1 | 34 | 71% |
| stelo.SoJNanoMelee 1.1 | 28 | 93% |
| tj.zombie1n 1.0.1 | 18 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 67% |
| yk.JahMicro 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 31% | 75 |
| tvv.micro.Antares 1.1.1 | 21 | 26% | 50 |
| stelo.SoJNanoMelee 1.1 | 11 | 14% | 29 |
| tj.zombie1n 1.0.1 | 9 | 11% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 5% | 8 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.5 | 98 / 210 | 3.47 | 16.9% | 31091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.9% | 98 |
| ahf.NanoAndrew .4 | 2.8 | 11.9% | 29 |
| oog.melee.Corsair 1.0 | 3.0 | 12.1% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 10.9% | 23 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.1% | 6 |
| EBBU.Sim2 1.02 | 6.7 | 9.1% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 9.0% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 75.6 | 17 / 35 | 5468 |
| 2 | 1 | 62.7 | 66.0 | 12 / 35 | 4950 |
| 3 | 1 | 64.8 | 69.5 | 15 / 35 | 5418 |
| 4 | 1 | 66.1 | 75.9 | 20 / 35 | 5092 |
| 5 | 1 | 65.6 | 73.7 | 17 / 35 | 5077 |
| 6 | 1 | 65.6 | 74.6 | 17 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 92% |
| oog.melee.Corsair 1.0 | 32 | 63% |
| ahf.NanoAndrew .4 | 23 | 87% |
| sam.Samspin 1.0 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| EBBU.Sim2 1.02 | 5 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 20 | 18% | 43 |
| ahf.NanoAndrew .4 | 18 | 16% | 37 |
| EBBU.Sim2 1.02 | 17 | 15% | 24 |
| zyx.nano.BacillusComma 1.0 | 15 | 13% | 19 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 18 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 7 |
| sam.Samspin 1.0 | 4 | 4% | 13 |
| sample.TrackFire 1.0 | 4 | 4% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.9 | 135 / 210 | 2.00 | 19.7% | 33377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 19.7% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.4% | 38 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.6% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.4% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.5% | 1 |
| fm.claire 1.7 | 6.3 | 8.2% | 2 |
| pa.Improved 1.0 | 8.5 | 5.9% | 0 |
| sample.SpinBot 1.0 | 9.0 | 5.5% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.2 | 17 / 35 | 5480 |
| 2 | 1 | 69.7 | 89.5 | 23 / 35 | 5794 |
| 3 | 1 | 70.3 | 88.9 | 25 / 35 | 5665 |
| 4 | 1 | 69.3 | 88.9 | 23 / 35 | 5211 |
| 5 | 1 | 70.0 | 92.1 | 22 / 35 | 5449 |
| 6 | 1 | 70.3 | 90.8 | 25 / 35 | 5778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 82% |
| oog.melee.CapuletDroid 1.1 | 31 | 90% |
| gh.nano.Grofvuil 0.2 | 21 | 76% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 43% | 91 |
| gh.nano.Grofvuil 0.2 | 16 | 21% | 37 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 38 |
| winamp32.micro.MicroMacro 1.0 | 8 | 11% | 19 |
| fm.claire 1.7 | 6 | 8% | 12 |
| arthord.NanoSatanMelee Beta | 2 | 3% | 9 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.1 | 109 / 210 | 2.52 | 18.7% | 35475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.7% | 109 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.3% | 30 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.3% | 21 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.1% | 3 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.3 | 5.5% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.6% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.8 | 20 / 35 | 6128 |
| 2 | 1 | 67.8 | 78.7 | 17 / 35 | 5913 |
| 3 | 1 | 68.1 | 78.4 | 15 / 35 | 6322 |
| 4 | 1 | 69.4 | 86.0 | 19 / 35 | 6092 |
| 5 | 1 | 68.3 | 84.4 | 19 / 35 | 5606 |
| 6 | 1 | 68.0 | 81.3 | 19 / 35 | 5414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 54 | 67% |
| spinnercat.micro.Tyger 0.1 | 51 | 86% |
| gh.micro.Gruweltje 0.7 | 27 | 78% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 35% | 61 |
| mz.MicroGodMelee 1 | 30 | 30% | 62 |
| spinnercat.micro.Tyger 0.1 | 18 | 18% | 52 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 7 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |

## Melee bench: F08

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 74.6 | 112 / 210 | 3.29 | 17.4% | 32524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 17.4% | 112 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.6% | 29 |
| germ.TheMind .2 | 4.3 | 10.1% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 8 |
| awesomeness.Elite 1.0 | 6.8 | 8.0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 5 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.6% | 1 |
| sample.Crazy 1.0 | 8.3 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 76.5 | 20 / 35 | 5650 |
| 2 | 1 | 65.7 | 73.3 | 17 / 35 | 5390 |
| 3 | 1 | 65.0 | 68.6 | 21 / 35 | 5046 |
| 4 | 1 | 65.8 | 71.4 | 18 / 35 | 5258 |
| 5 | 1 | 68.3 | 83.8 | 18 / 35 | 5675 |
| 6 | 1 | 66.7 | 74.0 | 18 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| germ.TheMind .2 | 10 | 90% |
| awesomeness.Elite 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 48% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 21% | 36 |
| germ.TheMind .2 | 11 | 11% | 25 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 16 |
| awesomeness.Elite 1.0 | 5 | 5% | 13 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.4 | 151 / 210 | 2.13 | 20.1% | 32095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.1% | 151 |
| rz.HawkOnFire 0.1 | 2.3 | 13.8% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.9% | 19 |
| maribo.IotaCT 1.1 | 4.2 | 10.9% | 7 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.5% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.3% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 7.5% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.4% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.3 | 28 / 35 | 5049 |
| 2 | 1 | 68.7 | 81.0 | 21 / 35 | 4832 |
| 3 | 1 | 69.8 | 85.1 | 23 / 35 | 5652 |
| 4 | 1 | 70.6 | 87.9 | 25 / 35 | 5566 |
| 5 | 1 | 71.0 | 87.3 | 25 / 35 | 5697 |
| 6 | 1 | 72.3 | 94.9 | 29 / 35 | 5299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 77 | 95% |
| nz.jdc.nano.GridFu 1.0 | 34 | 97% |
| timmit.nano.TimDog 0.33 | 18 | 89% |
| stelo.PatternRobot 1.0 | 13 | 69% |
| maribo.IotaCT 1.1 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| ratosh.Wesco 1.4 | 5 | 80% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 12 | 20% | 55 |
| rz.HawkOnFire 0.1 | 9 | 15% | 64 |
| timmit.nano.TimDog 0.33 | 9 | 15% | 23 |
| stelo.PatternRobot 1.0 | 9 | 15% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 14% | 12 |
| ratosh.Wesco 1.4 | 6 | 10% | 16 |
| maribo.IotaCT 1.1 | 5 | 8% | 15 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.7 | 144 / 210 | 1.93 | 20.8% | 39204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.8% | 144 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.7% | 29 |
| baal.nano.N 1.42 | 3.0 | 11.8% | 11 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.6% | 2 |
| zyx.micro.Ant 1.1 | 5.2 | 9.0% | 10 |
| sanja.First 0.1 | 5.5 | 8.5% | 3 |
| amk.Punbot.Punbot 0.01 | 7.2 | 7.5% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 7.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 22 / 35 | 6246 |
| 2 | 1 | 71.2 | 93.0 | 24 / 35 | 6600 |
| 3 | 1 | 70.7 | 86.3 | 26 / 35 | 6734 |
| 4 | 1 | 70.1 | 86.7 | 24 / 35 | 6388 |
| 5 | 1 | 71.4 | 93.3 | 25 / 35 | 6550 |
| 6 | 1 | 70.6 | 88.9 | 23 / 35 | 6686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 57 | 70% |
| baal.nano.N 1.42 | 36 | 92% |
| cvt.Firsty 1.0 | 20 | 75% |
| sanja.First 0.1 | 19 | 89% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| zyx.micro.Ant 1.1 | 15 | 73% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 24 | 36% | 71 |
| zyx.micro.Ant 1.1 | 14 | 21% | 34 |
| cvt.Firsty 1.0 | 9 | 14% | 21 |
| baal.nano.N 1.42 | 6 | 9% | 32 |
| Grystrion.TrackerWO 1.0 | 6 | 9% | 12 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 9 |
| sanja.First 0.1 | 2 | 3% | 23 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |
| sample.RamFire 1.0 | 1 | 2% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.9 | 77 / 210 | 3.70 | 15.5% | 30393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.3 | 15.5% | 77 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 78 |
| cs.Wren 1.0 | 3.5 | 12.1% | 12 |
| mz.Cork 0.1 | 3.8 | 11.5% | 16 |
| js.PinBall 1.6 | 4.8 | 10.9% | 14 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 3 |
| evd.X1 0.01 | 6.8 | 8.3% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 66.7 | 12 / 35 | 4666 |
| 2 | 2 | 62.6 | 65.7 | 10 / 35 | 5197 |
| 3 | 1 | 64.4 | 75.2 | 11 / 35 | 5161 |
| 4 | 2 | 61.1 | 62.2 | 12 / 35 | 4842 |
| 5 | 1 | 66.3 | 80.3 | 16 / 35 | 5114 |
| 6 | 1 | 64.4 | 69.5 | 16 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 60% |
| cs.Wren 1.0 | 22 | 77% |
| mz.Cork 0.1 | 12 | 92% |
| jsal.Jsalbot 1.0 | 8 | 88% |
| js.PinBall 1.6 | 7 | 71% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 40% | 93 |
| cs.Wren 1.0 | 19 | 14% | 32 |
| mz.Cork 0.1 | 15 | 11% | 23 |
| evd.X1 0.01 | 15 | 11% | 16 |
| joe.ADinosaur 1.0 | 14 | 10% | 15 |
| js.PinBall 1.6 | 10 | 7% | 17 |
| jsal.Jsalbot 1.0 | 3 | 2% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.6 | 127 / 210 | 2.39 | 18.9% | 29302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.9% | 127 |
| ntc.Opposite 1.5 | 3.0 | 11.5% | 17 |
| myl.nano.Graviton 1.10 | 3.0 | 11.7% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.4% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.2% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.5% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 6 |
| disan.Chair 2.2.0 | 7.3 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 21 / 35 | 4857 |
| 2 | 1 | 67.9 | 85.7 | 23 / 35 | 4416 |
| 3 | 1 | 69.7 | 90.8 | 26 / 35 | 4760 |
| 4 | 1 | 67.6 | 81.3 | 20 / 35 | 4996 |
| 5 | 1 | 68.9 | 84.1 | 20 / 35 | 5450 |
| 6 | 1 | 66.2 | 77.5 | 17 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 91% |
| ntc.Opposite 1.5 | 24 | 71% |
| disan.Chair 2.2.0 | 19 | 95% |
| stelo.AreaTargetingBot 1.1 | 18 | 72% |
| donjezza.Muncho 1.0 | 17 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 80% |
| DBall.NUKE 0.1 | 5 | 80% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 17 | 20% | 32 |
| myl.nano.Graviton 1.10 | 14 | 17% | 50 |
| stelo.AreaTargetingBot 1.1 | 14 | 17% | 36 |
| pfvicm.Sobieski 7.2.3b | 13 | 15% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 11% | 23 |
| disan.Chair 2.2.0 | 7 | 8% | 22 |
| donjezza.Muncho 1.0 | 7 | 8% | 17 |
| DBall.NUKE 0.1 | 2 | 2% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.8 | 97 / 210 | 3.18 | 16.5% | 26456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.5% | 97 |
| oog.melee.Capulet 1.2 | 2.3 | 14.4% | 44 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.4% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.0% | 17 |
| yagami.Tidus 0.11 | 4.5 | 12.4% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 6.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 73.7 | 14 / 35 | 4495 |
| 2 | 1 | 66.6 | 79.4 | 16 / 35 | 4645 |
| 3 | 1 | 67.8 | 81.3 | 21 / 35 | 4757 |
| 4 | 1 | 64.3 | 70.8 | 15 / 35 | 3890 |
| 5 | 1 | 65.2 | 74.3 | 16 / 35 | 4374 |
| 6 | 1 | 65.6 | 75.2 | 15 / 35 | 4295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 87% |
| kawigi.micro.Shiz 1.1 | 27 | 100% |
| yagami.Tidus 0.11 | 18 | 100% |
| ejb.Polaris 1.0.1 | 3 | 67% |

Hadur died in 113 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 43% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 17% | 49 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 32 |
| yagami.Tidus 0.11 | 13 | 12% | 30 |
| ejb.Polaris 1.0.1 | 12 | 11% | 18 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 1 | 1% | 0 |

## Melee bench: F14

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.6 | 115 / 210 | 3.01 | 17.0% | 26680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 17.0% | 115 |
| bzdp.Pansy 2.1 | 2.2 | 12.9% | 31 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 31 |
| wompi.Quokka 1.6 | 4.3 | 11.3% | 11 |
| ratosh.Nobo 0.21 | 4.3 | 11.4% | 10 |
| m3thos.Eva00 1.1 | 5.7 | 10.1% | 6 |
| bayen.UbaMicro 1.4 | 7.2 | 8.0% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 75.9 | 19 / 35 | 4652 |
| 2 | 1 | 65.8 | 77.1 | 20 / 35 | 4457 |
| 3 | 1 | 65.9 | 76.5 | 18 / 35 | 4965 |
| 4 | 1 | 64.6 | 74.3 | 20 / 35 | 4128 |
| 5 | 1 | 64.2 | 77.1 | 17 / 35 | 3911 |
| 6 | 1 | 67.5 | 84.8 | 21 / 35 | 4567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 93% |
| wee.Gem 1.8.4 | 29 | 90% |
| ratosh.Nobo 0.21 | 17 | 71% |
| wompi.Quokka 1.6 | 16 | 75% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 19% | 58 |
| ratosh.Nobo 0.21 | 17 | 18% | 28 |
| wompi.Quokka 1.6 | 12 | 13% | 24 |
| m3thos.Eva00 1.1 | 12 | 13% | 21 |
| wee.Gem 1.8.4 | 10 | 11% | 41 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 8% | 11 |
| maribo.FollowFire 1 | 8 | 8% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 9 |
| bayen.UbaMicro 1.4 | 5 | 5% | 9 |

## Melee bench: F15

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 84.1 | 112 / 210 | 2.43 | 21.1% | 48959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 21.1% | 112 |
| wompi.Wallaby 5.1 | 2.0 | 18.4% | 77 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 16 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 1 |
| stuff.Vlad 0.1 | 5.2 | 9.1% | 1 |
| ayk.WallHugger 1.0 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.5 | 7.3% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 84.4 | 17 / 35 | 8423 |
| 2 | 1 | 72.9 | 85.4 | 18 / 35 | 8247 |
| 3 | 1 | 73.9 | 90.5 | 22 / 35 | 8638 |
| 4 | 1 | 71.0 | 81.0 | 18 / 35 | 7506 |
| 5 | 1 | 71.3 | 81.9 | 18 / 35 | 8037 |
| 6 | 1 | 72.0 | 81.6 | 19 / 35 | 8108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 130 | 69% |
| mz.NanoGod 2.02 | 17 | 59% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 0% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 52 | 53% | 136 |
| mz.NanoGod 2.02 | 25 | 26% | 37 |
| exauge.GateKeeper 1.1.121g | 8 | 8% | 15 |
| ayk.WallHugger 1.0 | 6 | 6% | 6 |
| stelo.PianistNano 1.2 | 5 | 5% | 9 |
| stuff.Vlad 0.1 | 2 | 2% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.9 | 114 / 210 | 3.26 | 16.9% | 28508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.9% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.5% | 19 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 16 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.5% | 9 |
| conscience.Electron 1.3g | 7.3 | 7.9% | 2 |
| ap.Frederick 1.1 | 8.0 | 6.7% | 6 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.3 | 18 / 35 | 4994 |
| 2 | 1 | 65.1 | 73.3 | 20 / 35 | 4645 |
| 3 | 1 | 61.8 | 65.1 | 14 / 35 | 4352 |
| 4 | 1 | 66.8 | 78.7 | 23 / 35 | 4864 |
| 5 | 1 | 66.6 | 79.7 | 23 / 35 | 4358 |
| 6 | 1 | 64.6 | 71.4 | 16 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 60 | 92% |
| bvh.micro.Freya 0.3 | 23 | 78% |
| dummy.micro.Sparrow 2.5 | 21 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 80% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 17 | 18% | 72 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 15% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 16 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 32 |
| bvh.micro.Freya 0.3 | 11 | 11% | 20 |
| conscience.Electron 1.3g | 11 | 11% | 13 |
| dl.BetterWalls 1.0 | 8 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 11 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.1 | 137 / 210 | 2.25 | 20.8% | 41407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.8% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.3% | 22 |
| sul.Lunar 1.1 | 3.3 | 10.9% | 13 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 12 |
| dsw.StaticD 1.0 | 5.2 | 9.3% | 12 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.9% | 3 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 6 |
| sample.MyFirstRobot 1.0 | 8.3 | 5.9% | 4 |
| sample.Corners 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 82.9 | 23 / 35 | 6568 |
| 2 | 1 | 71.2 | 85.1 | 23 / 35 | 7103 |
| 3 | 1 | 67.9 | 76.2 | 19 / 35 | 6298 |
| 4 | 1 | 72.7 | 92.4 | 26 / 35 | 7270 |
| 5 | 1 | 73.4 | 93.3 | 26 / 35 | 7298 |
| 6 | 1 | 70.9 | 87.0 | 20 / 35 | 6870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 80% |
| sul.Lunar 1.1 | 34 | 100% |
| supersample.SuperBoxBot 1.0 | 33 | 79% |
| dsw.StaticD 1.0 | 20 | 50% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 24 | 32% | 63 |
| dsw.StaticD 1.0 | 17 | 23% | 31 |
| supersample.SuperBoxBot 1.0 | 16 | 21% | 37 |
| sul.Lunar 1.1 | 7 | 9% | 46 |
| mme.NikeEnhanced 2.0 | 6 | 8% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 9 |
| sample.Corners 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.4 | 104 / 210 | 2.59 | 18.9% | 39074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.9% | 104 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 39 |
| mld.Wisdom 1.0 | 3.2 | 11.7% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.2% | 27 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 9 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 8 |
| GarmBox.Oranges 1.0 | 7.5 | 7.0% | 0 |
| sample.Walls 1.0 | 7.7 | 7.6% | 4 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 1 |
| sample.Target 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 79.0 | 15 / 35 | 6158 |
| 2 | 1 | 69.0 | 83.8 | 17 / 35 | 6497 |
| 3 | 1 | 70.7 | 87.0 | 23 / 35 | 7348 |
| 4 | 1 | 69.0 | 84.1 | 15 / 35 | 6872 |
| 5 | 1 | 66.3 | 75.9 | 15 / 35 | 5730 |
| 6 | 1 | 68.8 | 84.4 | 19 / 35 | 6469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 81% |
| radnor.DoctorBob 1.42 | 38 | 58% |
| mld.Wisdom 1.0 | 14 | 64% |
| KiraNL.Chupacabra 0.4 | 12 | 83% |
| amz.NanoClone 1.41 | 9 | 100% |
| sample.Walls 1.0 | 8 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 36% | 66 |
| mld.Wisdom 1.0 | 25 | 24% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 18% | 49 |
| KiraNL.Chupacabra 0.4 | 12 | 11% | 24 |
| amz.NanoClone 1.41 | 6 | 6% | 13 |
| jangs.ns51 1.0 | 3 | 3% | 12 |
| sample.Walls 1.0 | 2 | 2% | 9 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

