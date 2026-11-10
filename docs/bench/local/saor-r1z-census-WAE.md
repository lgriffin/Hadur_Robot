# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 89.8 | 152 / 210 | 1.91 | 21.9% | 45209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.9% | 152 |
| mz.AntiGrav 1.0 | 2.3 | 14.6% | 20 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 20 |
| mld.Infinity 2.2 | 3.8 | 12.7% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 3 |
| GarmBox.Oranges 1.0 | 6.5 | 6.8% | 0 |
| sample.Walls 1.0 | 6.7 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 92.1 | 25 / 35 | 7448 |
| 2 | 1 | 72.7 | 88.9 | 24 / 35 | 7590 |
| 3 | 1 | 73.0 | 89.5 | 25 / 35 | 7468 |
| 4 | 1 | 73.0 | 91.7 | 28 / 35 | 7410 |
| 5 | 1 | 72.7 | 87.9 | 26 / 35 | 7590 |
| 6 | 1 | 72.6 | 88.9 | 24 / 35 | 7703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 87 | 92% |
| mld.Infinity 2.2 | 31 | 90% |
| radnor.DoctorBob 1.42 | 28 | 79% |
| amz.NanoClone 1.41 | 8 | 88% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 40% | 58 |
| mz.AntiGrav 1.0 | 17 | 29% | 81 |
| mld.Infinity 2.2 | 10 | 17% | 40 |
| sample.Walls 1.0 | 3 | 5% | 6 |
| amz.NanoClone 1.41 | 2 | 3% | 15 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.9 | 124 / 210 | 2.27 | 19.0% | 33269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.0% | 124 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.6% | 49 |
| mld.DustBunny 3.8 | 2.7 | 13.3% | 21 |
| maribo.melee.BMV 0.1 | 3.8 | 10.7% | 4 |
| zyx.nano.Ant 1.1 | 5.7 | 8.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.0% | 5 |
| fullsail.SweetTea 1.1 | 8.2 | 7.0% | 0 |
| bzdp.BoxCar 2.0 | 8.3 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 18 / 35 | 5240 |
| 2 | 1 | 68.4 | 83.8 | 22 / 35 | 5464 |
| 3 | 1 | 69.1 | 86.7 | 24 / 35 | 5721 |
| 4 | 1 | 69.6 | 87.6 | 21 / 35 | 6002 |
| 5 | 1 | 69.4 | 87.6 | 21 / 35 | 5718 |
| 6 | 1 | 67.4 | 83.2 | 18 / 35 | 5124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 73% |
| mld.DustBunny 3.8 | 59 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| maribo.melee.BMV 0.1 | 10 | 70% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 39% | 85 |
| mld.DustBunny 3.8 | 25 | 29% | 71 |
| maribo.melee.BMV 0.1 | 7 | 8% | 10 |
| fullsail.SweetTea 1.1 | 6 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 12 |
| zyx.nano.Ant 1.1 | 5 | 6% | 9 |
| bzdp.BoxCar 2.0 | 3 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 81.1 | 134 / 210 | 2.70 | 19.7% | 37956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.7% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.6% | 20 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.7% | 7 |
| fm.mammillarias 1.3 | 5.8 | 9.4% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 76.5 | 22 / 35 | 6149 |
| 2 | 1 | 70.4 | 84.8 | 22 / 35 | 6476 |
| 3 | 1 | 70.5 | 86.0 | 25 / 35 | 6151 |
| 4 | 1 | 67.7 | 74.3 | 20 / 35 | 6214 |
| 5 | 1 | 70.9 | 83.8 | 25 / 35 | 6590 |
| 6 | 1 | 69.4 | 81.0 | 20 / 35 | 6376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 89% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 11 | 73% |
| fm.mammillarias 1.3 | 10 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 19 | 25% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% | 37 |
| myl.micro.Troodon 1.10 | 11 | 14% | 61 |
| myl.nano.KomoriNinja 1.1 | 8 | 11% | 35 |
| fm.mammillarias 1.3 | 7 | 9% | 15 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 16 |
| sample.Tracker 1.0 | 6 | 8% | 6 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 11 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.0 | 152 / 210 | 2.26 | 20.8% | 40664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.8% | 152 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 19 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 13 |
| tj.zombie1n 1.0.1 | 4.7 | 9.5% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.7% | 12 |
| yk.JahMicro 1.0 | 6.5 | 8.0% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.4% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 90.5 | 29 / 35 | 6912 |
| 2 | 1 | 65.4 | 68.6 | 14 / 35 | 5909 |
| 3 | 1 | 69.4 | 83.2 | 23 / 35 | 6145 |
| 4 | 1 | 72.3 | 92.1 | 28 / 35 | 7194 |
| 5 | 1 | 73.4 | 96.5 | 31 / 35 | 7265 |
| 6 | 1 | 71.3 | 85.1 | 27 / 35 | 7239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 74 | 96% |
| stelo.SoJNanoMelee 1.1 | 26 | 88% |
| tj.zombie1n 1.0.1 | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 73% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 38% | 100 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 14% | 21 |
| stelo.SoJNanoMelee 1.1 | 7 | 12% | 21 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 26 |
| repositorio.NanoStep 1.0 | 5 | 9% | 10 |
| tj.zombie1n 1.0.1 | 4 | 7% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 7 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.0 | 91 / 210 | 3.79 | 16.2% | 30823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.2% | 91 |
| oog.melee.Corsair 1.0 | 2.2 | 13.3% | 39 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 28 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.3% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.9% | 5 |
| sam.Samspin 1.0 | 7.0 | 8.9% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 73.0 | 18 / 35 | 5305 |
| 2 | 1 | 62.8 | 66.7 | 15 / 35 | 4948 |
| 3 | 1 | 65.3 | 72.7 | 15 / 35 | 5303 |
| 4 | 1 | 62.9 | 64.8 | 15 / 35 | 4979 |
| 5 | 1 | 64.2 | 69.5 | 16 / 35 | 4803 |
| 6 | 1 | 63.9 | 67.3 | 12 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 60% |
| simonton.nano.MeleeSeed 1.8 | 29 | 97% |
| ahf.NanoAndrew .4 | 27 | 78% |
| sam.Samspin 1.0 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 71% |
| EBBU.Sim2 1.02 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 23% | 53 |
| ahf.NanoAndrew .4 | 17 | 14% | 39 |
| EBBU.Sim2 1.02 | 15 | 13% | 20 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 20 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 15 |
| simonton.nano.MeleeSeed 1.8 | 10 | 8% | 32 |
| sam.Samspin 1.0 | 4 | 3% | 10 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 86.5 | 150 / 210 | 2.21 | 19.7% | 33809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.7% | 150 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.7% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 12 |
| fm.claire 1.7 | 5.5 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.0% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.9% | 3 |
| sample.SpinBot 1.0 | 8.7 | 6.0% | 0 |
| pa.Improved 1.0 | 8.8 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.1 | 25 / 35 | 5561 |
| 2 | 1 | 69.1 | 87.6 | 24 / 35 | 5161 |
| 3 | 1 | 70.7 | 89.5 | 26 / 35 | 5993 |
| 4 | 1 | 69.2 | 84.8 | 21 / 35 | 5991 |
| 5 | 1 | 67.8 | 81.6 | 24 / 35 | 5246 |
| 6 | 1 | 71.3 | 91.4 | 30 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 93% |
| oog.melee.CapuletDroid 1.1 | 27 | 100% |
| gh.nano.Grofvuil 0.2 | 25 | 92% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 27% | 82 |
| oog.melee.CapuletDroid 1.1 | 10 | 17% | 42 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 30 |
| arthord.NanoSatanMelee Beta | 8 | 13% | 16 |
| sample.SpinBot 1.0 | 5 | 8% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 12 |
| fm.claire 1.7 | 3 | 5% | 8 |
| pa.Improved 1.0 | 3 | 5% | 6 |
| kurios.DOSexe .9b | 3 | 5% | 5 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.6 | 102 / 210 | 2.65 | 18.8% | 37344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.8% | 102 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.0% | 44 |
| mz.MicroGodMelee 1 | 3.3 | 13.4% | 30 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.1% | 24 |
| DBall.Anarchy 0.1 | 5.5 | 8.1% | 1 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 2 |
| el.JumpShoot 0.2 | 7.0 | 6.6% | 1 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 5 |
| fire219.CatBot 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.5 | 24 / 35 | 6909 |
| 2 | 1 | 68.0 | 79.0 | 16 / 35 | 6123 |
| 3 | 1 | 69.1 | 82.2 | 15 / 35 | 6599 |
| 4 | 1 | 69.0 | 83.5 | 19 / 35 | 6103 |
| 5 | 1 | 69.0 | 85.7 | 14 / 35 | 6187 |
| 6 | 1 | 64.8 | 69.8 | 14 / 35 | 5423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 89% |
| mz.MicroGodMelee 1 | 43 | 70% |
| gh.micro.Gruweltje 0.7 | 30 | 63% |
| mbro.Detektor3 0.1.1 | 4 | 75% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 33 | 31% | 56 |
| spinnercat.micro.Tyger 0.1 | 27 | 25% | 65 |
| mz.MicroGodMelee 1 | 26 | 24% | 56 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| el.JumpShoot 0.2 | 5 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 74.4 | 118 / 210 | 3.30 | 17.5% | 32392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.5% | 118 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.2% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.6% | 21 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.7% | 8 |
| germ.TheMind .2 | 5.3 | 9.5% | 7 |
| awesomeness.Elite 1.0 | 5.7 | 9.0% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 2 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 2 |
| stelo.UntouchableNano 1.3 | 8.5 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 72.4 | 19 / 35 | 5196 |
| 2 | 1 | 68.9 | 83.2 | 21 / 35 | 5783 |
| 3 | 1 | 65.2 | 71.7 | 17 / 35 | 5184 |
| 4 | 1 | 65.5 | 69.2 | 19 / 35 | 5332 |
| 5 | 1 | 65.3 | 72.4 | 20 / 35 | 5008 |
| 6 | 1 | 68.4 | 77.8 | 22 / 35 | 5889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 87% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| germ.TheMind .2 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |

Hadur died in 92 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 48% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 16% | 36 |
| stelo.UntouchableNano 1.3 | 8 | 9% | 13 |
| germ.TheMind .2 | 7 | 8% | 24 |
| awesomeness.Elite 1.0 | 7 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 9 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.4 | 160 / 210 | 1.96 | 20.8% | 33717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.8% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.0% | 10 |
| maribo.IotaCT 1.1 | 4.8 | 10.4% | 7 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.3% | 2 |
| ratosh.Wesco 1.4 | 6.7 | 8.4% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 7.5% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 7.1% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 28 / 35 | 5905 |
| 2 | 1 | 70.9 | 89.5 | 26 / 35 | 5329 |
| 3 | 1 | 71.5 | 91.4 | 28 / 35 | 5380 |
| 4 | 1 | 70.6 | 85.1 | 26 / 35 | 5648 |
| 5 | 1 | 71.3 | 87.3 | 25 / 35 | 5877 |
| 6 | 1 | 71.6 | 89.8 | 27 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 95% |
| nz.jdc.nano.GridFu 1.0 | 36 | 100% |
| maribo.IotaCT 1.1 | 13 | 100% |
| ratosh.Wesco 1.4 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 11 | 73% |
| stelo.PatternRobot 1.0 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 28% | 66 |
| timmit.nano.TimDog 0.33 | 13 | 26% | 24 |
| stelo.PatternRobot 1.0 | 10 | 20% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 8 |
| ratosh.Wesco 1.4 | 3 | 6% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2 | 4% | 50 |
| maribo.IotaCT 1.1 | 2 | 4% | 18 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.1 | 161 / 210 | 1.98 | 21.2% | 40384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.2% | 161 |
| baal.nano.N 1.42 | 2.3 | 12.0% | 5 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.9% | 18 |
| zyx.micro.Ant 1.1 | 4.7 | 9.6% | 12 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 3 |
| sanja.First 0.1 | 6.0 | 8.9% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.3 | 6.8% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.9 | 27 / 35 | 6839 |
| 2 | 1 | 70.9 | 88.6 | 26 / 35 | 6785 |
| 3 | 1 | 71.7 | 91.7 | 25 / 35 | 6976 |
| 4 | 1 | 69.7 | 83.2 | 24 / 35 | 6545 |
| 5 | 1 | 71.9 | 92.7 | 29 / 35 | 6764 |
| 6 | 1 | 71.5 | 90.5 | 30 / 35 | 6475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 96% |
| tvv.nano.Polaris 1.2 | 39 | 87% |
| sanja.First 0.1 | 25 | 92% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| cvt.Firsty 1.0 | 17 | 94% |
| zyx.micro.Ant 1.1 | 16 | 75% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 22% | 33 |
| tvv.nano.Polaris 1.2 | 9 | 18% | 52 |
| baal.nano.N 1.42 | 8 | 16% | 43 |
| sanja.First 0.1 | 6 | 12% | 26 |
| cvt.Firsty 1.0 | 5 | 10% | 18 |
| Grystrion.TrackerWO 1.0 | 4 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 4 | 8% | 10 |
| sample.RamFire 1.0 | 2 | 4% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.5 | 80 / 210 | 3.93 | 15.4% | 31505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.5 | 15.4% | 80 |
| kc.micro.Figment 1.0 | 1.5 | 15.6% | 67 |
| cs.Wren 1.0 | 3.5 | 12.0% | 18 |
| js.PinBall 1.6 | 4.0 | 11.3% | 10 |
| mz.Cork 0.1 | 5.2 | 10.7% | 16 |
| joe.ADinosaur 1.0 | 5.7 | 9.0% | 5 |
| evd.X1 0.01 | 7.0 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 7.8 | 7.0% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.7 | 12 / 35 | 5712 |
| 2 | 2 | 62.2 | 65.4 | 12 / 35 | 4841 |
| 3 | 2 | 62.4 | 67.6 | 12 / 35 | 4993 |
| 4 | 1 | 65.2 | 72.4 | 18 / 35 | 5585 |
| 5 | 2 | 60.4 | 59.4 | 11 / 35 | 4884 |
| 6 | 1 | 63.6 | 67.3 | 15 / 35 | 5490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 61 | 77% |
| cs.Wren 1.0 | 11 | 64% |
| mz.Cork 0.1 | 11 | 82% |
| donjezza.Jezza 1.0 | 7 | 71% |
| js.PinBall 1.6 | 7 | 71% |
| joe.ADinosaur 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 38% | 99 |
| cs.Wren 1.0 | 21 | 16% | 30 |
| joe.ADinosaur 1.0 | 17 | 13% | 19 |
| evd.X1 0.01 | 16 | 12% | 18 |
| js.PinBall 1.6 | 10 | 8% | 15 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| mz.Cork 0.1 | 5 | 4% | 10 |
| donjezza.Jezza 1.0 | 4 | 3% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.2 | 129 / 210 | 2.51 | 19.3% | 32188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.3% | 129 |
| myl.nano.Graviton 1.10 | 2.7 | 12.2% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.9% | 3 |
| ntc.Opposite 1.5 | 4.0 | 10.9% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.2% | 19 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.7% | 3 |
| disan.Chair 2.2.0 | 6.3 | 8.8% | 10 |
| DBall.NUKE 0.1 | 7.8 | 7.6% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 5.5% | 5 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 22 / 35 | 5115 |
| 2 | 1 | 67.9 | 79.4 | 18 / 35 | 5351 |
| 3 | 1 | 68.8 | 82.5 | 23 / 35 | 5263 |
| 4 | 1 | 69.9 | 86.7 | 25 / 35 | 5478 |
| 5 | 1 | 68.2 | 79.4 | 20 / 35 | 5373 |
| 6 | 1 | 70.0 | 87.9 | 21 / 35 | 5608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 93% |
| stelo.AreaTargetingBot 1.1 | 26 | 81% |
| ntc.Opposite 1.5 | 21 | 81% |
| disan.Chair 2.2.0 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| donjezza.Muncho 1.0 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 85 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 24 | 28% | 60 |
| stelo.AreaTargetingBot 1.1 | 15 | 18% | 35 |
| ntc.Opposite 1.5 | 13 | 15% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 12% | 26 |
| disan.Chair 2.2.0 | 7 | 8% | 19 |
| pfvicm.Sobieski 7.2.3b | 7 | 8% | 15 |
| pbg.R2D2 1.0 | 6 | 7% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 12 |
| donjezza.Muncho 1.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.9 | 82 / 210 | 3.53 | 15.6% | 26273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.3 | 15.6% | 82 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 57 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 19 |
| yagami.Tidus 0.11 | 4.8 | 11.3% | 4 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 7 |
| step.nanoPri 1.0 | 7.5 | 7.4% | 1 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 74.3 | 15 / 35 | 4024 |
| 2 | 1 | 63.0 | 69.5 | 11 / 35 | 4337 |
| 3 | 2 | 63.5 | 71.7 | 14 / 35 | 4144 |
| 4 | 1 | 66.5 | 76.2 | 18 / 35 | 4906 |
| 5 | 1 | 63.3 | 67.6 | 9 / 35 | 4513 |
| 6 | 1 | 64.5 | 72.1 | 15 / 35 | 4349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 96% |
| oog.melee.Capulet 1.2 | 26 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 71% |
| yagami.Tidus 0.11 | 19 | 95% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 38% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 41 |
| yagami.Tidus 0.11 | 18 | 14% | 35 |
| ejb.Polaris 1.0.1 | 13 | 10% | 22 |
| step.nanoPri 1.0 | 11 | 9% | 12 |
| kawigi.micro.Shiz 1.1 | 8 | 6% | 23 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.5 | 120 / 210 | 3.02 | 17.5% | 28965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.5% | 120 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 22 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 31 |
| ratosh.Nobo 0.21 | 3.8 | 11.2% | 13 |
| wompi.Quokka 1.6 | 4.2 | 10.7% | 13 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 7.3% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.6% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.2 | 22 / 35 | 4860 |
| 2 | 1 | 65.1 | 75.2 | 15 / 35 | 4728 |
| 3 | 1 | 68.6 | 85.1 | 25 / 35 | 5154 |
| 4 | 1 | 67.2 | 79.0 | 22 / 35 | 5391 |
| 5 | 1 | 63.4 | 67.0 | 17 / 35 | 4567 |
| 6 | 1 | 65.0 | 75.6 | 19 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 87% |
| wee.Gem 1.8.4 | 29 | 97% |
| ratosh.Nobo 0.21 | 20 | 65% |
| wompi.Quokka 1.6 | 14 | 79% |
| m3thos.Eva00 1.1 | 7 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 18% | 56 |
| ratosh.Nobo 0.21 | 13 | 14% | 24 |
| stelo.MyAgileRobot 0.2 | 11 | 12% | 15 |
| wee.Gem 1.8.4 | 10 | 11% | 38 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 14 |
| maribo.FollowFire 1 | 10 | 11% | 11 |
| wompi.Quokka 1.6 | 9 | 10% | 23 |
| bayen.UbaMicro 1.4 | 6 | 7% | 14 |
| m3thos.Eva00 1.1 | 5 | 6% | 13 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 84.6 | 113 / 210 | 2.39 | 21.2% | 49204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.2% | 113 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 71 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 20 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.6% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 76.5 | 13 / 35 | 7377 |
| 2 | 1 | 71.3 | 80.0 | 19 / 35 | 7920 |
| 3 | 1 | 72.7 | 84.4 | 18 / 35 | 8132 |
| 4 | 1 | 72.2 | 82.5 | 21 / 35 | 7705 |
| 5 | 1 | 74.0 | 89.5 | 19 / 35 | 9028 |
| 6 | 1 | 74.9 | 94.3 | 23 / 35 | 9042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 69% |
| mz.NanoGod 2.02 | 22 | 64% |
| exauge.GateKeeper 1.1.121g | 13 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 43% | 125 |
| mz.NanoGod 2.02 | 33 | 34% | 48 |
| exauge.GateKeeper 1.1.121g | 7 | 7% | 13 |
| ayk.WallHugger 1.0 | 7 | 7% | 11 |
| stuff.Vlad 0.1 | 4 | 4% | 6 |
| stelo.PianistNano 1.2 | 3 | 3% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.7 | 112 / 210 | 3.46 | 16.7% | 28808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.7% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.8% | 25 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 19 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 16 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 1 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 11 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.0 | 21 / 35 | 4786 |
| 2 | 1 | 61.5 | 62.9 | 15 / 35 | 4464 |
| 3 | 1 | 65.2 | 73.0 | 19 / 35 | 4717 |
| 4 | 1 | 65.9 | 73.7 | 20 / 35 | 4910 |
| 5 | 1 | 66.1 | 76.2 | 18 / 35 | 5016 |
| 6 | 1 | 65.9 | 76.5 | 19 / 35 | 4915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 92% |
| dummy.micro.Sparrow 2.5 | 36 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 74% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 9 | 67% |
| ap.Frederick 1.1 | 7 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 14 | 14% | 49 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 14 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 29 |
| conscience.Electron 1.3g | 13 | 13% | 19 |
| stelo.MirrorMicro 1.0 | 11 | 11% | 19 |
| dl.BetterWalls 1.0 | 11 | 11% | 13 |
| bvh.micro.Freya 0.3 | 9 | 9% | 23 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.2 | 139 / 210 | 2.33 | 21.2% | 44091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.2% | 139 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 23 |
| sul.Lunar 1.1 | 3.5 | 11.0% | 15 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.1% | 6 |
| mme.NikeEnhanced 2.0 | 4.7 | 10.0% | 8 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 7 |
| sample.Corners 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 85.7 | 25 / 35 | 7710 |
| 2 | 1 | 71.1 | 87.3 | 21 / 35 | 7016 |
| 3 | 1 | 69.7 | 79.7 | 21 / 35 | 6785 |
| 4 | 1 | 69.9 | 81.6 | 22 / 35 | 6762 |
| 5 | 1 | 71.6 | 85.4 | 22 / 35 | 7853 |
| 6 | 1 | 73.5 | 91.4 | 28 / 35 | 7965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 41 | 100% |
| supersample.SuperBoxBot 1.0 | 33 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 81% |
| dsw.StaticD 1.0 | 22 | 64% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 25% | 45 |
| dsw.StaticD 1.0 | 17 | 24% | 36 |
| supersample.SuperBoxBot 1.0 | 14 | 20% | 38 |
| sul.Lunar 1.1 | 6 | 8% | 45 |
| mme.NikeEnhanced 2.0 | 6 | 8% | 14 |
| sample.MyFirstRobot 1.0 | 5 | 7% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| sample.Corners 1.0 | 2 | 3% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 9 |

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.3 | 130 / 210 | 2.50 | 19.6% | 40731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.6% | 130 |
| radnor.DoctorBob 1.42 | 2.5 | 12.5% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.2% | 14 |
| mld.Wisdom 1.0 | 3.8 | 11.6% | 17 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.7% | 8 |
| amz.NanoClone 1.41 | 5.7 | 9.8% | 7 |
| sample.Walls 1.0 | 7.5 | 7.2% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.7 | 5.9% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.6 | 25 / 35 | 7090 |
| 2 | 1 | 70.1 | 85.4 | 22 / 35 | 7154 |
| 3 | 1 | 68.0 | 76.8 | 20 / 35 | 6657 |
| 4 | 1 | 69.1 | 80.0 | 21 / 35 | 6713 |
| 5 | 1 | 69.9 | 84.8 | 22 / 35 | 6954 |
| 6 | 1 | 69.1 | 85.1 | 20 / 35 | 6163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 60 | 95% |
| radnor.DoctorBob 1.42 | 31 | 74% |
| mld.Wisdom 1.0 | 21 | 71% |
| KiraNL.Chupacabra 0.4 | 13 | 92% |
| amz.NanoClone 1.41 | 9 | 78% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 21 | 26% | 41 |
| radnor.DoctorBob 1.42 | 17 | 21% | 44 |
| KiraNL.Chupacabra 0.4 | 17 | 21% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 16% | 66 |
| amz.NanoClone 1.41 | 8 | 10% | 18 |
| jangs.ns51 1.0 | 3 | 4% | 4 |
| sample.Walls 1.0 | 1 | 1% | 8 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

