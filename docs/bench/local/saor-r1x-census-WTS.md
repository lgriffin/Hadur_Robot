# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.1 | 143 / 210 | 2.34 | 20.5% | 41656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 20.5% | 143 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 14 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 22 |
| mld.Infinity 2.2 | 3.5 | 13.1% | 23 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 5 |
| sample.Walls 1.0 | 6.2 | 7.3% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 79.7 | 23 / 35 | 6753 |
| 2 | 1 | 70.6 | 85.7 | 22 / 35 | 6390 |
| 3 | 1 | 71.0 | 83.8 | 25 / 35 | 6911 |
| 4 | 1 | 70.6 | 85.4 | 22 / 35 | 6730 |
| 5 | 1 | 72.6 | 88.9 | 27 / 35 | 7602 |
| 6 | 1 | 71.7 | 87.0 | 24 / 35 | 7270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 97% |
| radnor.DoctorBob 1.42 | 30 | 83% |
| mld.Infinity 2.2 | 28 | 100% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 39% | 59 |
| mz.AntiGrav 1.0 | 15 | 22% | 73 |
| amz.NanoClone 1.41 | 8 | 12% | 18 |
| mld.Infinity 2.2 | 7 | 10% | 34 |
| GarmBox.Oranges 1.0 | 4 | 6% | 6 |
| arthord.MannyPacquiao Beta | 3 | 4% | 3 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 3% | 6 |

## Melee bench: F02

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.4 | 131 / 210 | 2.40 | 18.7% | 32388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 18.7% | 131 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 45 |
| mld.DustBunny 3.8 | 3.0 | 13.1% | 12 |
| maribo.melee.BMV 0.1 | 3.7 | 11.3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.9% | 5 |
| zyx.nano.Ant 1.1 | 6.2 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.8% | 6 |
| bzdp.BoxCar 2.0 | 7.8 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 5.8% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.3 | 25 / 35 | 5509 |
| 2 | 1 | 69.1 | 88.9 | 25 / 35 | 5523 |
| 3 | 1 | 69.1 | 88.6 | 21 / 35 | 5374 |
| 4 | 1 | 68.8 | 88.9 | 25 / 35 | 5081 |
| 5 | 1 | 65.7 | 69.8 | 13 / 35 | 5596 |
| 6 | 1 | 68.3 | 84.1 | 22 / 35 | 5305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 53 | 94% |
| oog.melee.Mercutio 1.0 | 47 | 85% |
| maribo.melee.BMV 0.1 | 17 | 76% |
| djdjdj.NanoSkunk10 1.0 | 15 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| fullsail.SweetTea 1.1 | 5 | 80% |

Hadur died in 79 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 30% | 68 |
| mld.DustBunny 3.8 | 17 | 22% | 62 |
| maribo.melee.BMV 0.1 | 10 | 13% | 21 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 20 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| fullsail.SweetTea 1.1 | 5 | 6% | 9 |
| zyx.nano.Ant 1.1 | 5 | 6% | 6 |
| cs.Grudge 1.0 | 5 | 6% | 5 |
| bzdp.BoxCar 2.0 | 3 | 4% | 5 |

## Melee bench: F03

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 82.8 | 127 / 210 | 2.55 | 19.6% | 36938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.6% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 15.2% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.6% | 18 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.4% | 9 |
| fm.mammillarias 1.3 | 6.2 | 8.5% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 83.2 | 24 / 35 | 6277 |
| 2 | 1 | 71.1 | 87.9 | 24 / 35 | 6434 |
| 3 | 1 | 71.0 | 86.7 | 23 / 35 | 6536 |
| 4 | 1 | 70.1 | 83.2 | 22 / 35 | 6254 |
| 5 | 1 | 67.8 | 76.8 | 16 / 35 | 6055 |
| 6 | 1 | 67.7 | 79.0 | 18 / 35 | 5382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 88% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| myl.nano.KomoriNinja 1.1 | 11 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 7 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 22 | 27% | 78 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 25% | 41 |
| cb.nano.Insomnia 1.0 | 14 | 17% | 20 |
| fm.mammillarias 1.3 | 8 | 10% | 10 |
| myl.nano.KomoriNinja 1.1 | 5 | 6% | 26 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| sample.Fire 1.0 | 4 | 5% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 11 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.7 | 152 / 210 | 2.01 | 20.8% | 38514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 20.8% | 152 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 16 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.0% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.5% | 20 |
| tj.zombie1n 1.0.1 | 5.7 | 8.9% | 7 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 24 / 35 | 6134 |
| 2 | 1 | 72.7 | 95.9 | 29 / 35 | 6999 |
| 3 | 1 | 71.4 | 89.5 | 30 / 35 | 6582 |
| 4 | 1 | 70.0 | 86.7 | 24 / 35 | 6295 |
| 5 | 1 | 69.4 | 85.1 | 23 / 35 | 6049 |
| 6 | 1 | 70.7 | 90.2 | 22 / 35 | 6455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 92% |
| stelo.SoJNanoMelee 1.1 | 58 | 84% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| tj.zombie1n 1.0.1 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 80% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 6 | 83% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 34% | 80 |
| stelo.SoJNanoMelee 1.1 | 15 | 25% | 45 |
| tj.zombie1n 1.0.1 | 7 | 12% | 9 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 28 |
| yk.JahMicro 1.0 | 5 | 8% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 15 |
| repositorio.NanoStep 1.0 | 2 | 3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 5 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.5 | 81 / 210 | 4.02 | 15.3% | 28089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 15.3% | 81 |
| oog.melee.Corsair 1.0 | 2.7 | 12.5% | 33 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 22 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.5% | 15 |
| sam.Samspin 1.0 | 6.3 | 9.7% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.9% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 60.0 | 11 / 35 | 4634 |
| 2 | 1 | 64.7 | 73.0 | 14 / 35 | 5154 |
| 3 | 1 | 65.3 | 74.6 | 18 / 35 | 4902 |
| 4 | 1 | 62.9 | 67.3 | 13 / 35 | 4803 |
| 5 | 1 | 59.6 | 57.5 | 12 / 35 | 4276 |
| 6 | 1 | 61.4 | 66.3 | 13 / 35 | 4320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 90% |
| oog.melee.Corsair 1.0 | 28 | 64% |
| ahf.NanoAndrew .4 | 18 | 78% |
| sam.Samspin 1.0 | 9 | 100% |
| EBBU.Sim2 1.02 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 18% | 40 |
| robar.nano.Assertive_Melee 0.2 | 23 | 18% | 25 |
| zyx.nano.BacillusComma 1.0 | 17 | 13% | 20 |
| simonton.nano.MeleeSeed 1.8 | 15 | 11% | 45 |
| ahf.NanoAndrew .4 | 14 | 11% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 10% | 11 |
| EBBU.Sim2 1.02 | 11 | 8% | 18 |
| sam.Samspin 1.0 | 11 | 8% | 15 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.4 | 152 / 210 | 2.22 | 19.5% | 32678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.5% | 152 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 25 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.0% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 4 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.8% | 5 |
| fm.claire 1.7 | 6.3 | 8.7% | 0 |
| sample.SpinBot 1.0 | 8.2 | 7.0% | 1 |
| pa.Improved 1.0 | 9.0 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 23 / 35 | 5581 |
| 2 | 1 | 68.7 | 84.8 | 25 / 35 | 5277 |
| 3 | 1 | 69.3 | 84.8 | 27 / 35 | 5609 |
| 4 | 1 | 69.1 | 84.1 | 25 / 35 | 5656 |
| 5 | 1 | 68.4 | 85.4 | 24 / 35 | 5205 |
| 6 | 1 | 70.8 | 94.9 | 28 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 87% |
| oog.melee.CapuletDroid 1.1 | 45 | 96% |
| gh.nano.Grofvuil 0.2 | 17 | 88% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 27% | 66 |
| arthord.NanoSatanMelee Beta | 11 | 19% | 17 |
| gh.nano.Grofvuil 0.2 | 10 | 17% | 28 |
| oog.melee.CapuletDroid 1.1 | 7 | 12% | 57 |
| kurios.DOSexe .9b | 5 | 8% | 13 |
| fm.claire 1.7 | 4 | 7% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 10 |
| sample.SpinBot 1.0 | 3 | 5% | 8 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.4 | 109 / 210 | 2.67 | 18.3% | 34004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 18.3% | 109 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 30 |
| mz.MicroGodMelee 1 | 3.5 | 12.7% | 25 |
| DBall.Anarchy 0.1 | 5.2 | 8.3% | 9 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.8% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.4% | 2 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.7% | 2 |
| fire219.CatBot 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 78.4 | 16 / 35 | 5933 |
| 2 | 1 | 68.1 | 80.6 | 17 / 35 | 6029 |
| 3 | 1 | 69.8 | 87.9 | 20 / 35 | 5783 |
| 4 | 1 | 67.0 | 77.5 | 18 / 35 | 5584 |
| 5 | 1 | 67.5 | 81.0 | 18 / 35 | 5486 |
| 6 | 1 | 67.5 | 83.2 | 20 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 88% |
| mz.MicroGodMelee 1 | 39 | 74% |
| gh.micro.Gruweltje 0.7 | 30 | 67% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 29 | 29% | 63 |
| gh.micro.Gruweltje 0.7 | 28 | 28% | 51 |
| mz.MicroGodMelee 1 | 26 | 26% | 57 |
| acogdev.alpha 0.2 | 5 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 8 |
| DBall.Anarchy 0.1 | 3 | 3% | 12 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.4 | 115 / 210 | 3.49 | 16.8% | 31007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.2 | 16.8% | 115 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 14.0% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 10.2% | 2 |
| germ.TheMind .2 | 6.2 | 8.5% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 4 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.0% | 8 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 74.3 | 21 / 35 | 5063 |
| 2 | 1 | 64.5 | 69.8 | 17 / 35 | 5155 |
| 3 | 1 | 64.7 | 70.5 | 21 / 35 | 5050 |
| 4 | 2 | 64.1 | 69.5 | 16 / 35 | 4826 |
| 5 | 1 | 66.0 | 71.4 | 20 / 35 | 5355 |
| 6 | 1 | 67.9 | 78.7 | 20 / 35 | 5558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 94% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 8 | 50% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| germ.TheMind .2 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 95 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 43% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 20% | 27 |
| germ.TheMind .2 | 8 | 8% | 17 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| awesomeness.Elite 1.0 | 7 | 7% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.8 | 150 / 210 | 2.19 | 19.8% | 30748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.8% | 150 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 15 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 5 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.7% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.7 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 4 |
| stelo.PatternRobot 1.0 | 8.7 | 7.7% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.6 | 31 / 35 | 5615 |
| 2 | 1 | 68.3 | 82.9 | 22 / 35 | 4827 |
| 3 | 1 | 67.3 | 76.2 | 20 / 35 | 4989 |
| 4 | 1 | 71.0 | 90.2 | 27 / 35 | 5225 |
| 5 | 1 | 71.0 | 91.7 | 26 / 35 | 5240 |
| 6 | 1 | 69.5 | 85.4 | 24 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 93% |
| nz.jdc.nano.GridFu 1.0 | 34 | 97% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| maribo.IotaCT 1.1 | 10 | 70% |
| timmit.nano.TimDog 0.33 | 9 | 56% |
| ratosh.Wesco 1.4 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 20% | 64 |
| timmit.nano.TimDog 0.33 | 12 | 20% | 20 |
| nz.jdc.nano.GridFu 1.0 | 8 | 13% | 47 |
| ratosh.Wesco 1.4 | 6 | 10% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 17 |
| stelo.PatternRobot 1.0 | 5 | 8% | 18 |
| maribo.IotaCT 1.1 | 5 | 8% | 15 |
| spinnercat.Omen 1.0 | 5 | 8% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.3 | 173 / 210 | 1.69 | 21.6% | 39120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 21.6% | 173 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.5% | 10 |
| baal.nano.N 1.42 | 3.0 | 10.8% | 7 |
| Grystrion.TrackerWO 1.0 | 3.8 | 9.8% | 4 |
| sanja.First 0.1 | 5.8 | 8.9% | 2 |
| zyx.micro.Ant 1.1 | 6.3 | 8.7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.8% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.7% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.7 | 28 / 35 | 6880 |
| 2 | 1 | 71.5 | 91.4 | 29 / 35 | 6555 |
| 3 | 1 | 71.1 | 91.4 | 27 / 35 | 6475 |
| 4 | 1 | 71.5 | 92.1 | 30 / 35 | 6465 |
| 5 | 1 | 70.5 | 88.9 | 27 / 35 | 6252 |
| 6 | 1 | 72.5 | 97.5 | 32 / 35 | 6493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 32 | 97% |
| cvt.Firsty 1.0 | 26 | 100% |
| zyx.micro.Ant 1.1 | 25 | 84% |
| baal.nano.N 1.42 | 25 | 92% |
| sanja.First 0.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 23 | 100% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 86% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 22% | 37 |
| Grystrion.TrackerWO 1.0 | 7 | 19% | 18 |
| cvt.Firsty 1.0 | 5 | 14% | 28 |
| baal.nano.N 1.42 | 5 | 14% | 28 |
| tvv.nano.Polaris 1.2 | 4 | 11% | 47 |
| squidM.TentalceMeleeNano 1.1 | 3 | 8% | 12 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 5 |
| sample.RamFire 1.0 | 2 | 5% | 2 |
| sanja.First 0.1 | 1 | 3% | 31 |

## Melee bench: F11

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.6 | 91 / 210 | 3.46 | 16.4% | 32112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.1% | 65 |
| hadur117.micro.SaorWTS 0.1 | 1.5 | 16.4% | 91 |
| cs.Wren 1.0 | 3.2 | 12.3% | 20 |
| js.PinBall 1.6 | 4.3 | 11.0% | 12 |
| mz.Cork 0.1 | 4.7 | 10.9% | 10 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 2 |
| evd.X1 0.01 | 6.7 | 8.6% | 4 |
| jsal.Jsalbot 1.0 | 8.3 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 69.5 | 12 / 35 | 4763 |
| 2 | 1 | 63.5 | 71.1 | 12 / 35 | 4948 |
| 3 | 2 | 65.8 | 72.7 | 17 / 35 | 5744 |
| 4 | 2 | 63.2 | 66.3 | 15 / 35 | 5302 |
| 5 | 1 | 67.3 | 80.0 | 18 / 35 | 5794 |
| 6 | 1 | 66.1 | 76.2 | 17 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 65% |
| cs.Wren 1.0 | 23 | 83% |
| mz.Cork 0.1 | 15 | 80% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| js.PinBall 1.6 | 6 | 67% |
| joe.ADinosaur 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 45% | 98 |
| evd.X1 0.01 | 16 | 13% | 17 |
| cs.Wren 1.0 | 15 | 13% | 30 |
| mz.Cork 0.1 | 10 | 8% | 23 |
| js.PinBall 1.6 | 9 | 8% | 11 |
| joe.ADinosaur 1.0 | 8 | 7% | 11 |
| PSW.Relentless 0.1 | 5 | 4% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.3 | 145 / 210 | 2.14 | 19.7% | 30576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.7% | 145 |
| myl.nano.Graviton 1.10 | 2.7 | 11.1% | 17 |
| ntc.Opposite 1.5 | 3.5 | 10.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 2 |
| disan.Chair 2.2.0 | 7.0 | 8.2% | 8 |
| DBall.NUKE 0.1 | 7.8 | 8.3% | 7 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 6.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.6 | 18 / 35 | 4931 |
| 2 | 1 | 69.2 | 88.9 | 25 / 35 | 4996 |
| 3 | 1 | 69.6 | 89.5 | 22 / 35 | 5228 |
| 4 | 1 | 67.3 | 82.2 | 22 / 35 | 4507 |
| 5 | 1 | 71.5 | 94.3 | 29 / 35 | 5542 |
| 6 | 1 | 70.9 | 93.3 | 29 / 35 | 5372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 53 | 87% |
| myl.nano.Graviton 1.10 | 33 | 91% |
| donjezza.Muncho 1.0 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| DBall.NUKE 0.1 | 12 | 92% |
| ntc.Opposite 1.5 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| disan.Chair 2.2.0 | 7 | 86% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 14 | 21% | 27 |
| stelo.AreaTargetingBot 1.1 | 12 | 18% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 18% | 27 |
| myl.nano.Graviton 1.10 | 10 | 15% | 35 |
| ntc.Opposite 1.5 | 9 | 14% | 23 |
| disan.Chair 2.2.0 | 5 | 8% | 14 |
| DBall.NUKE 0.1 | 3 | 5% | 15 |
| pbg.R2D2 1.0 | 1 | 2% | 10 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |

## Melee bench: F13

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.4 | 67 / 210 | 3.76 | 15.1% | 26630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.3 | 15.1% | 67 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 44 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 46 |
| yagami.Tidus 0.11 | 3.8 | 12.6% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.1% | 21 |
| ejb.Polaris 1.0.1 | 5.8 | 11.0% | 19 |
| stelo.MirrorNano 1.3 | 7.2 | 8.1% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 67.9 | 14 / 35 | 4470 |
| 2 | 1 | 63.1 | 70.8 | 10 / 35 | 4407 |
| 3 | 1 | 67.2 | 80.3 | 17 / 35 | 4889 |
| 4 | 2 | 61.7 | 62.2 | 11 / 35 | 4223 |
| 5 | 1 | 63.4 | 72.7 | 7 / 35 | 4253 |
| 6 | 2 | 61.3 | 62.2 | 8 / 35 | 4388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 62% |
| kawigi.micro.Shiz 1.1 | 19 | 89% |
| yagami.Tidus 0.11 | 18 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 82% |
| ejb.Polaris 1.0.1 | 7 | 57% |

Hadur died in 143 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 40% | 75 |
| yagami.Tidus 0.11 | 28 | 20% | 41 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 11% | 33 |
| ejb.Polaris 1.0.1 | 14 | 10% | 20 |
| stelo.MirrorNano 1.3 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.6 | 132 / 210 | 2.93 | 17.4% | 27217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 17.4% | 132 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 18 |
| ratosh.Nobo 0.21 | 3.5 | 11.5% | 14 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 22 |
| wompi.Quokka 1.6 | 4.8 | 10.8% | 13 |
| m3thos.Eva00 1.1 | 6.0 | 10.0% | 8 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.9 | 20 / 35 | 4474 |
| 2 | 1 | 68.6 | 87.0 | 25 / 35 | 4802 |
| 3 | 1 | 66.3 | 78.4 | 19 / 35 | 4605 |
| 4 | 1 | 67.3 | 84.1 | 25 / 35 | 4414 |
| 5 | 1 | 63.6 | 67.6 | 21 / 35 | 4448 |
| 6 | 1 | 64.7 | 72.4 | 22 / 35 | 4474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 93% |
| wee.Gem 1.8.4 | 28 | 100% |
| ratosh.Nobo 0.21 | 18 | 78% |
| wompi.Quokka 1.6 | 18 | 94% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 386. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 19% | 59 |
| ratosh.Nobo 0.21 | 10 | 13% | 25 |
| maribo.FollowFire 1 | 10 | 13% | 9 |
| m3thos.Eva00 1.1 | 9 | 12% | 16 |
| wee.Gem 1.8.4 | 8 | 10% | 41 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 11 |
| bayen.UbaMicro 1.4 | 7 | 9% | 15 |
| wompi.Quokka 1.6 | 6 | 8% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 87.4 | 127 / 210 | 2.14 | 21.2% | 46068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 21.2% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 59 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 14 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 3 |
| ayk.WallHugger 1.0 | 5.3 | 9.1% | 4 |
| stuff.Vlad 0.1 | 5.3 | 9.1% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 86.3 | 19 / 35 | 7734 |
| 2 | 1 | 73.8 | 92.4 | 23 / 35 | 8021 |
| 3 | 1 | 72.9 | 88.6 | 24 / 35 | 7836 |
| 4 | 1 | 71.0 | 81.9 | 20 / 35 | 7401 |
| 5 | 1 | 71.4 | 87.3 | 19 / 35 | 7286 |
| 6 | 1 | 72.6 | 87.6 | 22 / 35 | 7790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 75% |
| mz.NanoGod 2.02 | 18 | 50% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| ayk.WallHugger 1.0 | 10 | 90% |
| drd.Dreadknoght 0.9 | 7 | 86% |
| stelo.PianistNano 1.2 | 4 | 75% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 48% | 138 |
| mz.NanoGod 2.02 | 21 | 25% | 30 |
| ayk.WallHugger 1.0 | 9 | 11% | 12 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 12 |
| stelo.PianistNano 1.2 | 5 | 6% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.7 | 106 / 210 | 3.37 | 16.7% | 28887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 16.7% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 25 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 23 |
| bvh.micro.Freya 0.3 | 3.8 | 11.0% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 9.9% | 15 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.8% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.7% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 6 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 75.6 | 20 / 35 | 5412 |
| 2 | 1 | 65.7 | 76.5 | 21 / 35 | 4600 |
| 3 | 1 | 63.7 | 69.5 | 14 / 35 | 4888 |
| 4 | 1 | 64.1 | 72.1 | 16 / 35 | 4829 |
| 5 | 1 | 65.4 | 77.5 | 19 / 35 | 4377 |
| 6 | 1 | 64.2 | 70.8 | 16 / 35 | 4781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 92% |
| dummy.micro.Sparrow 2.5 | 29 | 90% |
| bvh.micro.Freya 0.3 | 28 | 75% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 82% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 54 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 42 |
| conscience.Electron 1.3g | 15 | 14% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 34 |
| bvh.micro.Freya 0.3 | 11 | 10% | 24 |
| dl.BetterWalls 1.0 | 7 | 7% | 14 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 8 |

## Melee bench: F17

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.0 | 159 / 210 | 2.08 | 21.4% | 42187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 21.4% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 9 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 14 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 8 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.1% | 2 |
| dsw.StaticD 1.0 | 6.2 | 8.3% | 6 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.7% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 4 |
| sample.Corners 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 81.9 | 26 / 35 | 6868 |
| 2 | 1 | 70.4 | 86.7 | 25 / 35 | 6407 |
| 3 | 1 | 72.5 | 91.7 | 28 / 35 | 7017 |
| 4 | 1 | 72.3 | 91.1 | 27 / 35 | 7249 |
| 5 | 1 | 73.1 | 91.4 | 29 / 35 | 7332 |
| 6 | 1 | 71.4 | 85.1 | 24 / 35 | 7314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 55 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 50 | 98% |
| supersample.SuperBoxBot 1.0 | 23 | 96% |
| dsw.StaticD 1.0 | 9 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 31% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 25% | 67 |
| sul.Lunar 1.1 | 7 | 14% | 62 |
| dsw.StaticD 1.0 | 7 | 14% | 16 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 12 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |
| sample.Corners 1.0 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 78.1 | 112 / 210 | 2.97 | 18.1% | 37460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 18.1% | 112 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 33 |
| mld.Wisdom 1.0 | 3.7 | 11.4% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.4% | 27 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.4% | 5 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 8 |
| sample.Walls 1.0 | 7.5 | 8.2% | 9 |
| GarmBox.Oranges 1.0 | 7.5 | 7.6% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.6 | 20 / 35 | 6626 |
| 2 | 1 | 67.3 | 78.4 | 19 / 35 | 6063 |
| 3 | 1 | 64.6 | 69.8 | 15 / 35 | 5973 |
| 4 | 1 | 67.4 | 78.1 | 20 / 35 | 5976 |
| 5 | 1 | 66.8 | 78.1 | 16 / 35 | 6273 |
| 6 | 1 | 69.3 | 82.9 | 22 / 35 | 6549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 94% |
| radnor.DoctorBob 1.42 | 31 | 77% |
| mld.Wisdom 1.0 | 18 | 72% |
| KiraNL.Chupacabra 0.4 | 12 | 100% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 29% | 48 |
| mld.Wisdom 1.0 | 27 | 28% | 48 |
| KiraNL.Chupacabra 0.4 | 12 | 12% | 24 |
| amz.NanoClone 1.41 | 11 | 11% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 10% | 48 |
| sample.Walls 1.0 | 6 | 6% | 11 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

