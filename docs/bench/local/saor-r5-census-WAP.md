# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 91.2 | 164 / 210 | 1.80 | 21.9% | 42243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.9% | 164 |
| mz.AntiGrav 1.0 | 2.3 | 14.7% | 15 |
| radnor.DoctorBob 1.42 | 2.7 | 14.0% | 11 |
| mld.Infinity 2.2 | 4.0 | 12.3% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 3 |
| sample.Walls 1.0 | 6.3 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.7% | 4 |
| arthord.MannyPacquiao Beta | 9.0 | 3.9% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 94.9 | 29 / 35 | 7540 |
| 2 | 1 | 71.5 | 85.1 | 23 / 35 | 7000 |
| 3 | 1 | 73.9 | 93.7 | 29 / 35 | 7519 |
| 4 | 1 | 73.5 | 93.3 | 30 / 35 | 6988 |
| 5 | 1 | 72.3 | 90.8 | 27 / 35 | 6898 |
| 6 | 1 | 71.8 | 89.2 | 26 / 35 | 6298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 91 | 96% |
| mld.Infinity 2.2 | 37 | 92% |
| radnor.DoctorBob 1.42 | 36 | 86% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 37% | 56 |
| mz.AntiGrav 1.0 | 11 | 24% | 85 |
| mld.Infinity 2.2 | 6 | 13% | 44 |
| amz.NanoClone 1.41 | 5 | 11% | 9 |
| sample.Walls 1.0 | 3 | 7% | 7 |
| GarmBox.Oranges 1.0 | 2 | 4% | 5 |
| jangs.ns51 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.0 | 126 / 210 | 2.35 | 18.6% | 31225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 18.6% | 126 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.2% | 46 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 19 |
| maribo.melee.BMV 0.1 | 4.5 | 10.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.2% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.2% | 10 |
| zyx.nano.Ant 1.1 | 6.5 | 8.1% | 3 |
| bzdp.BoxCar 2.0 | 7.7 | 7.4% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 7.3% | 3 |
| cs.Grudge 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.7 | 21 / 35 | 4556 |
| 2 | 2 | 63.3 | 63.5 | 11 / 35 | 5102 |
| 3 | 1 | 68.6 | 87.0 | 22 / 35 | 5269 |
| 4 | 1 | 70.2 | 93.3 | 24 / 35 | 5707 |
| 5 | 1 | 70.4 | 93.0 | 28 / 35 | 5353 |
| 6 | 1 | 68.5 | 87.6 | 20 / 35 | 5238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 68 | 87% |
| oog.melee.Mercutio 1.0 | 43 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 80% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 26 | 31% | 80 |
| oog.melee.Mercutio 1.0 | 24 | 28% | 60 |
| zyx.nano.Ant 1.1 | 10 | 12% | 12 |
| maribo.melee.BMV 0.1 | 8 | 9% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 22 |
| fullsail.SweetTea 1.1 | 4 | 5% | 10 |
| cs.Grudge 1.0 | 4 | 5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 79.9 | 118 / 210 | 2.80 | 18.7% | 34061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.7% | 118 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 10.9% | 22 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 11.1% | 9 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 6 |
| fm.mammillarias 1.3 | 5.3 | 9.7% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 5 |
| sample.Fire 1.0 | 9.3 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 75.2 | 17 / 35 | 5829 |
| 2 | 1 | 67.4 | 78.7 | 17 / 35 | 5431 |
| 3 | 1 | 67.2 | 76.2 | 19 / 35 | 5522 |
| 4 | 1 | 69.7 | 84.1 | 22 / 35 | 5707 |
| 5 | 1 | 68.3 | 81.3 | 20 / 35 | 5512 |
| 6 | 1 | 69.9 | 84.1 | 23 / 35 | 6060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 61 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 88% |
| cb.nano.Insomnia 1.0 | 17 | 88% |
| fm.mammillarias 1.3 | 12 | 83% |
| myl.nano.KomoriNinja 1.1 | 9 | 78% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 28 | 30% | 81 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 15% | 38 |
| fm.mammillarias 1.3 | 14 | 15% | 19 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 17 |
| sample.Fire 1.0 | 7 | 8% | 10 |
| sample.Tracker 1.0 | 6 | 7% | 6 |
| sp.Nanos.Ember 1.1 | 5 | 5% | 13 |
| myl.nano.KomoriNinja 1.1 | 4 | 4% | 19 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.3 | 159 / 210 | 2.14 | 20.7% | 38877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.7% | 159 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.2% | 14 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 13 |
| tj.zombie1n 1.0.1 | 4.7 | 9.3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.7% | 12 |
| yk.JahMicro 1.0 | 6.7 | 8.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 82.5 | 26 / 35 | 6674 |
| 2 | 1 | 70.7 | 90.5 | 27 / 35 | 6101 |
| 3 | 1 | 71.3 | 87.0 | 27 / 35 | 6900 |
| 4 | 1 | 71.4 | 91.7 | 29 / 35 | 6307 |
| 5 | 1 | 70.4 | 87.3 | 27 / 35 | 6356 |
| 6 | 1 | 70.0 | 84.8 | 23 / 35 | 6539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 90% |
| stelo.SoJNanoMelee 1.1 | 35 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 91% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| yk.JahMicro 1.0 | 12 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 35% | 75 |
| stelo.SoJNanoMelee 1.1 | 8 | 16% | 35 |
| tj.zombie1n 1.0.1 | 8 | 16% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 12% | 27 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 8 |
| yk.JahMicro 1.0 | 2 | 4% | 11 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.7 | 91 / 210 | 3.81 | 16.0% | 29208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.0% | 91 |
| oog.melee.Corsair 1.0 | 2.5 | 13.1% | 43 |
| ahf.NanoAndrew .4 | 2.5 | 12.2% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.3% | 14 |
| EBBU.Sim2 1.02 | 6.0 | 9.2% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.3% | 5 |
| sam.Samspin 1.0 | 6.5 | 9.3% | 12 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.6% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 69.8 | 19 / 35 | 4971 |
| 2 | 1 | 63.5 | 67.0 | 15 / 35 | 4983 |
| 3 | 1 | 61.2 | 61.0 | 14 / 35 | 4505 |
| 4 | 1 | 63.8 | 70.8 | 11 / 35 | 4967 |
| 5 | 1 | 63.2 | 68.3 | 15 / 35 | 4894 |
| 6 | 1 | 65.7 | 75.6 | 17 / 35 | 4888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 61% |
| simonton.nano.MeleeSeed 1.8 | 32 | 100% |
| ahf.NanoAndrew .4 | 20 | 80% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| EBBU.Sim2 1.02 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 18% | 42 |
| ahf.NanoAndrew .4 | 21 | 18% | 40 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 16 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 43 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 19 |
| EBBU.Sim2 1.02 | 10 | 8% | 13 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 13 |
| sam.Samspin 1.0 | 9 | 8% | 13 |
| sample.TrackFire 1.0 | 8 | 7% | 11 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.7 | 141 / 210 | 2.20 | 19.2% | 31141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.2% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 8 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 6 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 7 |
| fm.claire 1.7 | 6.2 | 8.3% | 1 |
| sample.SpinBot 1.0 | 8.3 | 6.6% | 3 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.7 | 28 / 35 | 5545 |
| 2 | 1 | 69.8 | 88.6 | 22 / 35 | 5861 |
| 3 | 1 | 69.8 | 90.5 | 25 / 35 | 5333 |
| 4 | 1 | 67.4 | 82.9 | 23 / 35 | 4584 |
| 5 | 1 | 68.8 | 86.0 | 22 / 35 | 5252 |
| 6 | 1 | 66.2 | 79.7 | 21 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 80% |
| oog.melee.CapuletDroid 1.1 | 27 | 96% |
| gh.nano.Grofvuil 0.2 | 20 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 43% | 86 |
| gh.nano.Grofvuil 0.2 | 10 | 14% | 35 |
| oog.melee.CapuletDroid 1.1 | 6 | 9% | 33 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 16 |
| fm.claire 1.7 | 5 | 7% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 9 |
| pa.Improved 1.0 | 4 | 6% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.1 | 116 / 210 | 2.34 | 18.8% | 33507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.8% | 116 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.6% | 43 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.2% | 18 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 27 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.3 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.5% | 1 |
| acogdev.alpha 0.2 | 8.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 82.5 | 23 / 35 | 5545 |
| 2 | 1 | 69.2 | 85.7 | 20 / 35 | 5888 |
| 3 | 1 | 68.2 | 85.4 | 18 / 35 | 5054 |
| 4 | 1 | 68.7 | 86.7 | 17 / 35 | 5822 |
| 5 | 1 | 68.9 | 84.8 | 21 / 35 | 5602 |
| 6 | 1 | 68.5 | 85.4 | 17 / 35 | 5596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 68 | 78% |
| mz.MicroGodMelee 1 | 42 | 69% |
| gh.micro.Gruweltje 0.7 | 27 | 74% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 26 | 28% | 65 |
| mz.MicroGodMelee 1 | 23 | 24% | 54 |
| gh.micro.Gruweltje 0.7 | 20 | 21% | 44 |
| fire219.CatBot 1.0 | 6 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| DBall.Anarchy 0.1 | 4 | 4% | 13 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 7 |

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.1 | 108 / 210 | 3.51 | 16.6% | 29494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.6% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 31 |
| germ.TheMind .2 | 4.7 | 9.8% | 11 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.7% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 1 |
| awesomeness.Elite 1.0 | 6.8 | 8.1% | 3 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.7% | 3 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.8 | 16 / 35 | 4652 |
| 2 | 1 | 65.9 | 74.0 | 19 / 35 | 5053 |
| 3 | 1 | 67.4 | 83.2 | 22 / 35 | 4895 |
| 4 | 1 | 65.9 | 73.0 | 20 / 35 | 5159 |
| 5 | 1 | 63.2 | 63.5 | 15 / 35 | 5025 |
| 6 | 1 | 63.7 | 68.9 | 16 / 35 | 4710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 75% |
| germ.TheMind .2 | 12 | 83% |
| qualidafial.MajorDick 1.0.1 | 7 | 71% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 37% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 21% | 39 |
| germ.TheMind .2 | 12 | 12% | 22 |
| awesomeness.Elite 1.0 | 11 | 11% | 18 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 8 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.2 | 163 / 210 | 1.80 | 20.4% | 30007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.4% | 163 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.2% | 7 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 1 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.8% | 5 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.5% | 6 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.8 | 26 / 35 | 4881 |
| 2 | 1 | 70.0 | 87.9 | 27 / 35 | 4771 |
| 3 | 1 | 72.6 | 98.4 | 32 / 35 | 4996 |
| 4 | 1 | 72.0 | 91.4 | 28 / 35 | 5574 |
| 5 | 1 | 70.3 | 89.5 | 26 / 35 | 4815 |
| 6 | 1 | 70.0 | 88.9 | 24 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 89 | 93% |
| nz.jdc.nano.GridFu 1.0 | 27 | 93% |
| timmit.nano.TimDog 0.33 | 15 | 87% |
| maribo.IotaCT 1.1 | 12 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 10 | 21% | 74 |
| timmit.nano.TimDog 0.33 | 9 | 19% | 25 |
| stelo.PatternRobot 1.0 | 9 | 19% | 17 |
| nz.jdc.nano.GridFu 1.0 | 7 | 15% | 37 |
| ratosh.Wesco 1.4 | 6 | 13% | 18 |
| maribo.IotaCT 1.1 | 3 | 6% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 9 |
| spinnercat.Omen 1.0 | 1 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.2 | 173 / 210 | 1.70 | 21.5% | 37969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.5% | 173 |
| baal.nano.N 1.42 | 2.3 | 12.1% | 7 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.7% | 17 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.5% | 1 |
| sanja.First 0.1 | 5.3 | 8.9% | 0 |
| zyx.micro.Ant 1.1 | 6.0 | 8.9% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.6% | 0 |
| cvt.Firsty 1.0 | 8.7 | 7.0% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 28 / 35 | 6459 |
| 2 | 1 | 70.3 | 87.0 | 26 / 35 | 5944 |
| 3 | 1 | 71.8 | 94.0 | 31 / 35 | 6123 |
| 4 | 1 | 72.7 | 96.5 | 30 / 35 | 6651 |
| 5 | 1 | 71.2 | 89.8 | 29 / 35 | 6310 |
| 6 | 1 | 71.5 | 92.7 | 29 / 35 | 6482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 93% |
| tvv.nano.Polaris 1.2 | 37 | 100% |
| sanja.First 0.1 | 30 | 100% |
| cvt.Firsty 1.0 | 24 | 92% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 9 | 24% | 48 |
| zyx.micro.Ant 1.1 | 9 | 24% | 30 |
| tvv.nano.Polaris 1.2 | 7 | 19% | 54 |
| cvt.Firsty 1.0 | 4 | 11% | 23 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 9 |
| sample.RamFire 1.0 | 3 | 8% | 4 |
| sanja.First 0.1 | 1 | 3% | 20 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 8 |

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.0 | 92 / 210 | 3.70 | 15.9% | 31274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.3 | 15.9% | 92 |
| kc.micro.Figment 1.0 | 2.3 | 14.4% | 50 |
| cs.Wren 1.0 | 2.5 | 12.9% | 32 |
| js.PinBall 1.6 | 4.0 | 11.4% | 9 |
| mz.Cork 0.1 | 4.8 | 10.9% | 6 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 8 |
| evd.X1 0.01 | 7.0 | 8.3% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 59.0 | 11 / 35 | 5088 |
| 2 | 1 | 66.5 | 78.4 | 17 / 35 | 5605 |
| 3 | 1 | 62.8 | 65.1 | 14 / 35 | 5430 |
| 4 | 2 | 63.1 | 69.5 | 16 / 35 | 4501 |
| 5 | 1 | 64.7 | 70.8 | 17 / 35 | 5524 |
| 6 | 1 | 65.5 | 77.1 | 17 / 35 | 5126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 80% |
| cs.Wren 1.0 | 25 | 68% |
| js.PinBall 1.6 | 9 | 89% |
| mz.Cork 0.1 | 9 | 89% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 43 | 36% | 95 |
| cs.Wren 1.0 | 24 | 20% | 37 |
| evd.X1 0.01 | 17 | 14% | 20 |
| js.PinBall 1.6 | 11 | 9% | 22 |
| mz.Cork 0.1 | 10 | 8% | 17 |
| joe.ADinosaur 1.0 | 9 | 8% | 12 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.3 | 122 / 210 | 2.78 | 18.0% | 27766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.0% | 122 |
| ntc.Opposite 1.5 | 3.5 | 11.5% | 11 |
| myl.nano.Graviton 1.10 | 3.7 | 11.3% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 27 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.0 | 6.4% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.6 | 22 / 35 | 4712 |
| 2 | 1 | 66.3 | 79.4 | 21 / 35 | 4460 |
| 3 | 1 | 68.9 | 86.0 | 24 / 35 | 4859 |
| 4 | 1 | 67.2 | 80.6 | 19 / 35 | 4699 |
| 5 | 1 | 63.1 | 69.5 | 13 / 35 | 4412 |
| 6 | 1 | 68.0 | 84.4 | 23 / 35 | 4624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 28 | 89% |
| stelo.AreaTargetingBot 1.1 | 28 | 75% |
| myl.nano.Graviton 1.10 | 26 | 92% |
| disan.Chair 2.2.0 | 13 | 92% |
| pfvicm.Sobieski 7.2.3b | 13 | 85% |
| ntc.Opposite 1.5 | 13 | 69% |
| donjezza.Muncho 1.0 | 10 | 100% |
| DBall.NUKE 0.1 | 6 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 20% | 38 |
| myl.nano.Graviton 1.10 | 17 | 19% | 47 |
| ntc.Opposite 1.5 | 15 | 17% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 13% | 27 |
| pfvicm.Sobieski 7.2.3b | 10 | 11% | 19 |
| disan.Chair 2.2.0 | 9 | 10% | 19 |
| pbg.R2D2 1.0 | 4 | 4% | 5 |
| DBall.NUKE 0.1 | 2 | 2% | 17 |
| donjezza.Muncho 1.0 | 2 | 2% | 11 |

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.0 | 79 / 210 | 3.61 | 15.3% | 24585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 15.3% | 79 |
| oog.melee.Capulet 1.2 | 2.5 | 13.8% | 41 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.8% | 26 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 75.2 | 14 / 35 | 4390 |
| 2 | 1 | 62.2 | 65.7 | 13 / 35 | 3960 |
| 3 | 2 | 62.5 | 67.3 | 12 / 35 | 3815 |
| 4 | 1 | 62.1 | 65.1 | 11 / 35 | 4030 |
| 5 | 1 | 66.7 | 81.3 | 16 / 35 | 4237 |
| 6 | 1 | 63.7 | 71.1 | 13 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 74% |
| oog.melee.Capulet 1.2 | 25 | 48% |
| kawigi.micro.Shiz 1.1 | 20 | 80% |
| yagami.Tidus 0.11 | 18 | 89% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 36% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 15% | 45 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 33 |
| yagami.Tidus 0.11 | 16 | 12% | 28 |
| ejb.Polaris 1.0.1 | 10 | 8% | 17 |
| kurios.DOSexe .9a | 8 | 6% | 8 |
| stelo.MirrorNano 1.3 | 6 | 5% | 8 |
| step.nanoPri 1.0 | 6 | 5% | 6 |

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 76.5 | 121 / 210 | 3.11 | 16.6% | 25265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.6% | 121 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 21 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 27 |
| wompi.Quokka 1.6 | 4.2 | 11.0% | 10 |
| ratosh.Nobo 0.21 | 4.7 | 10.8% | 9 |
| m3thos.Eva00 1.1 | 5.5 | 10.1% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 9.0% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 77.8 | 21 / 35 | 3819 |
| 2 | 1 | 65.5 | 80.0 | 20 / 35 | 4323 |
| 3 | 1 | 64.2 | 72.1 | 17 / 35 | 4512 |
| 4 | 1 | 68.9 | 88.3 | 25 / 35 | 4909 |
| 5 | 1 | 60.1 | 63.8 | 17 / 35 | 3451 |
| 6 | 1 | 65.2 | 77.1 | 21 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 93% |
| wee.Gem 1.8.4 | 27 | 100% |
| wompi.Quokka 1.6 | 15 | 93% |
| ratosh.Nobo 0.21 | 12 | 83% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 9 | 56% |
| stelo.MyAgileRobot 0.2 | 3 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.MyAgileRobot 0.2 | 12 | 13% | 14 |
| maribo.FollowFire 1 | 12 | 13% | 13 |
| bzdp.Pansy 2.1 | 11 | 12% | 56 |
| bayen.UbaMicro 1.4 | 11 | 12% | 18 |
| ratosh.Nobo 0.21 | 10 | 11% | 24 |
| wee.Gem 1.8.4 | 9 | 10% | 42 |
| m3thos.Eva00 1.1 | 9 | 10% | 12 |
| wompi.Quokka 1.6 | 8 | 9% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 10 |

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 85.7 | 132 / 210 | 2.29 | 21.2% | 47120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.2% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 17 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.7% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 3 |
| stelo.PianistNano 1.2 | 7.2 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.9 | 21 / 35 | 7476 |
| 2 | 1 | 74.4 | 92.1 | 25 / 35 | 8600 |
| 3 | 1 | 69.8 | 74.9 | 21 / 35 | 7263 |
| 4 | 1 | 70.9 | 81.6 | 20 / 35 | 7241 |
| 5 | 1 | 73.9 | 91.4 | 26 / 35 | 8084 |
| 6 | 1 | 73.2 | 86.0 | 19 / 35 | 8456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 89% |
| mz.NanoGod 2.02 | 13 | 69% |
| ayk.WallHugger 1.0 | 7 | 100% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 33% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 41% | 135 |
| mz.NanoGod 2.02 | 28 | 35% | 42 |
| stelo.PianistNano 1.2 | 6 | 8% | 7 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 9 |
| stuff.Vlad 0.1 | 4 | 5% | 5 |
| ayk.WallHugger 1.0 | 3 | 4% | 8 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.5 | 101 / 210 | 3.47 | 16.3% | 27380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.3% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.6% | 30 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.4% | 34 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 16 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 2 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 1 |
| ap.Frederick 1.1 | 8.7 | 6.4% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 20 / 35 | 4745 |
| 2 | 1 | 65.6 | 76.2 | 19 / 35 | 4378 |
| 3 | 1 | 65.4 | 75.2 | 15 / 35 | 4970 |
| 4 | 1 | 63.0 | 66.7 | 18 / 35 | 4394 |
| 5 | 1 | 62.1 | 66.3 | 14 / 35 | 4369 |
| 6 | 1 | 63.4 | 68.9 | 15 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 88% |
| dummy.micro.Sparrow 2.5 | 30 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 50% |
| bvh.micro.Freya 0.3 | 18 | 78% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 21% | 36 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 56 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 15 |
| bvh.micro.Freya 0.3 | 13 | 12% | 22 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 38 |
| conscience.Electron 1.3g | 12 | 11% | 14 |
| dl.BetterWalls 1.0 | 9 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 16 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.3 | 148 / 210 | 2.23 | 20.9% | 40496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.9% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 11 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.5% | 9 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.9% | 2 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.6% | 5 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.3% | 6 |
| sample.Corners 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 77.8 | 21 / 35 | 6687 |
| 2 | 1 | 70.1 | 82.5 | 24 / 35 | 6556 |
| 3 | 1 | 72.1 | 91.4 | 28 / 35 | 6520 |
| 4 | 1 | 72.8 | 94.0 | 27 / 35 | 7245 |
| 5 | 1 | 71.5 | 86.3 | 27 / 35 | 7122 |
| 6 | 1 | 70.5 | 85.7 | 21 / 35 | 6366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 43 | 91% |
| supersample.SuperBoxBot 1.0 | 26 | 88% |
| dsw.StaticD 1.0 | 17 | 59% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 37% | 43 |
| dsw.StaticD 1.0 | 13 | 21% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 18% | 51 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 8 |
| sul.Lunar 1.1 | 4 | 6% | 57 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.7 | 117 / 210 | 2.65 | 18.6% | 36604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.6% | 117 |
| mld.Wisdom 1.0 | 2.7 | 12.7% | 25 |
| radnor.DoctorBob 1.42 | 2.8 | 12.8% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.5% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 13 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 8 |
| sample.Walls 1.0 | 7.3 | 8.0% | 4 |
| GarmBox.Oranges 1.0 | 8.2 | 6.5% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 78.7 | 16 / 35 | 6054 |
| 2 | 1 | 70.0 | 88.3 | 24 / 35 | 6333 |
| 3 | 1 | 65.4 | 73.3 | 16 / 35 | 5722 |
| 4 | 1 | 69.7 | 87.6 | 21 / 35 | 6423 |
| 5 | 1 | 67.5 | 78.4 | 17 / 35 | 6252 |
| 6 | 1 | 68.8 | 83.8 | 23 / 35 | 5820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 93% |
| radnor.DoctorBob 1.42 | 34 | 79% |
| mld.Wisdom 1.0 | 20 | 75% |
| amz.NanoClone 1.41 | 17 | 82% |
| sample.Walls 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 35% | 51 |
| radnor.DoctorBob 1.42 | 18 | 19% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 50 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 17 |
| amz.NanoClone 1.41 | 7 | 7% | 18 |
| jangs.ns51 1.0 | 6 | 6% | 8 |
| sample.Walls 1.0 | 2 | 2% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

