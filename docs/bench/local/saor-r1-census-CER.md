# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 85.8 | 133 / 210 | 2.28 | 20.9% | 44995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 20.9% | 133 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 20 |
| mz.AntiGrav 1.0 | 3.2 | 13.4% | 22 |
| mld.Infinity 2.2 | 3.2 | 13.5% | 24 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 8 |
| sample.Walls 1.0 | 6.7 | 7.1% | 2 |
| jangs.ns51 1.0 | 7.0 | 6.2% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 79.0 | 18 / 35 | 6768 |
| 2 | 1 | 71.7 | 83.2 | 20 / 35 | 7994 |
| 3 | 1 | 73.8 | 92.1 | 27 / 35 | 7771 |
| 4 | 1 | 72.7 | 88.3 | 23 / 35 | 7978 |
| 5 | 1 | 70.9 | 85.4 | 23 / 35 | 7012 |
| 6 | 1 | 71.6 | 87.0 | 22 / 35 | 7472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 51 | 96% |
| mld.Infinity 2.2 | 40 | 93% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 35% | 59 |
| mz.AntiGrav 1.0 | 18 | 23% | 61 |
| amz.NanoClone 1.41 | 12 | 15% | 18 |
| mld.Infinity 2.2 | 10 | 13% | 46 |
| GarmBox.Oranges 1.0 | 6 | 8% | 7 |
| sample.Walls 1.0 | 3 | 4% | 9 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.5 | 112 / 210 | 3.20 | 17.0% | 31383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.7 | 17.0% | 112 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.7% | 57 |
| mld.DustBunny 3.8 | 3.0 | 13.0% | 18 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 8.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.0% | 7 |
| fullsail.SweetTea 1.1 | 7.3 | 7.7% | 5 |
| bzdp.BoxCar 2.0 | 8.3 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 75.9 | 12 / 35 | 4546 |
| 2 | 1 | 68.6 | 82.9 | 24 / 35 | 5766 |
| 3 | 1 | 68.8 | 86.0 | 23 / 35 | 5644 |
| 4 | 1 | 67.6 | 82.9 | 22 / 35 | 5479 |
| 5 | 1 | 69.5 | 87.9 | 24 / 35 | 5980 |
| 6 | 5 | 51.8 | 37.5 | 7 / 35 | 3968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 82% |
| mld.DustBunny 3.8 | 41 | 85% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 24 | 24% | 58 |
| oog.melee.Mercutio 1.0 | 21 | 21% | 63 |
| cs.Grudge 1.0 | 15 | 15% | 16 |
| zyx.nano.Ant 1.1 | 12 | 12% | 15 |
| fullsail.SweetTea 1.1 | 10 | 10% | 16 |
| maribo.melee.BMV 0.1 | 6 | 6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 14 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |

## Melee bench: F03

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 79.6 | 112 / 210 | 2.84 | 18.8% | 37133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 18.8% | 112 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.7% | 20 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.0% | 7 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 5 |
| sample.Fire 1.0 | 9.3 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 83.8 | 19 / 35 | 6309 |
| 2 | 1 | 67.6 | 77.1 | 20 / 35 | 6033 |
| 3 | 1 | 68.6 | 80.3 | 17 / 35 | 6414 |
| 4 | 1 | 67.0 | 75.6 | 16 / 35 | 5735 |
| 5 | 1 | 69.8 | 84.8 | 23 / 35 | 6348 |
| 6 | 1 | 67.7 | 75.9 | 17 / 35 | 6294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 38 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 85% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| myl.nano.KomoriNinja 1.1 | 14 | 86% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| sample.Fire 1.0 | 5 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 31 | 32% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 20% | 43 |
| fm.mammillarias 1.3 | 17 | 17% | 23 |
| myl.nano.KomoriNinja 1.1 | 12 | 12% | 35 |
| cb.nano.Insomnia 1.0 | 11 | 11% | 17 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 17 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.9 | 134 / 210 | 2.27 | 20.2% | 39890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 20.2% | 134 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 22 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.1% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 9.9% | 23 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.6% | 2 |
| yk.JahMicro 1.0 | 7.2 | 7.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.5% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 83.2 | 18 / 35 | 7029 |
| 2 | 1 | 66.9 | 77.1 | 19 / 35 | 5929 |
| 3 | 1 | 70.8 | 89.8 | 24 / 35 | 6402 |
| 4 | 1 | 70.3 | 85.1 | 25 / 35 | 6547 |
| 5 | 1 | 70.1 | 86.3 | 22 / 35 | 6689 |
| 6 | 1 | 72.6 | 94.0 | 26 / 35 | 7294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 84% |
| stelo.SoJNanoMelee 1.1 | 45 | 78% |
| tvv.micro.Antares 1.1.1 | 20 | 100% |
| yk.JahMicro 1.0 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| tj.zombie1n 1.0.1 | 8 | 75% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 39% | 80 |
| stelo.SoJNanoMelee 1.1 | 25 | 33% | 45 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 8% | 7 |
| tj.zombie1n 1.0.1 | 5 | 7% | 9 |
| tvv.micro.Antares 1.1.1 | 3 | 4% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 14 |
| yk.JahMicro 1.0 | 2 | 3% | 13 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 67.6 | 79 / 210 | 3.91 | 15.3% | 29406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.2 | 15.3% | 79 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 36 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.8% | 34 |
| ahf.NanoAndrew .4 | 3.8 | 11.7% | 29 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.4% | 12 |
| sam.Samspin 1.0 | 6.0 | 9.6% | 10 |
| EBBU.Sim2 1.02 | 6.2 | 9.4% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.1 | 21 / 35 | 5580 |
| 2 | 1 | 61.2 | 65.1 | 12 / 35 | 4811 |
| 3 | 1 | 63.5 | 69.5 | 16 / 35 | 4872 |
| 4 | 2 | 60.0 | 59.4 | 11 / 35 | 4595 |
| 5 | 1 | 58.4 | 60.0 | 8 / 35 | 4500 |
| 6 | 1 | 62.4 | 66.7 | 11 / 35 | 5048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ahf.NanoAndrew .4 | 26 | 85% |
| oog.melee.Corsair 1.0 | 24 | 63% |
| simonton.nano.MeleeSeed 1.8 | 20 | 95% |
| sam.Samspin 1.0 | 10 | 80% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| EBBU.Sim2 1.02 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 26 | 20% | 29 |
| ahf.NanoAndrew .4 | 22 | 17% | 44 |
| oog.melee.Corsair 1.0 | 19 | 15% | 37 |
| simonton.nano.MeleeSeed 1.8 | 18 | 14% | 35 |
| zyx.nano.BacillusComma 1.0 | 18 | 14% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| sam.Samspin 1.0 | 9 | 7% | 19 |
| EBBU.Sim2 1.02 | 8 | 6% | 13 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.5 | 97 / 210 | 3.30 | 16.9% | 31899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.2 | 16.9% | 97 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.6% | 48 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.5% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.3% | 13 |
| fm.claire 1.7 | 6.0 | 8.8% | 2 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.1% | 6 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 4 |
| pa.Improved 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 67.6 | 10 / 35 | 5025 |
| 2 | 1 | 66.5 | 77.8 | 17 / 35 | 5249 |
| 3 | 1 | 65.3 | 73.0 | 16 / 35 | 5525 |
| 4 | 1 | 68.9 | 84.4 | 25 / 35 | 5700 |
| 5 | 1 | 63.7 | 69.8 | 14 / 35 | 5044 |
| 6 | 1 | 65.6 | 74.3 | 15 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 87% |
| oog.melee.CapuletDroid 1.1 | 27 | 100% |
| gh.nano.Grofvuil 0.2 | 15 | 53% |
| arthord.NanoSatanMelee Beta | 8 | 75% |
| sample.SpinBot 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 23% | 64 |
| gh.nano.Grofvuil 0.2 | 23 | 20% | 33 |
| oog.melee.CapuletDroid 1.1 | 15 | 13% | 43 |
| fm.claire 1.7 | 11 | 10% | 11 |
| arthord.NanoSatanMelee Beta | 10 | 9% | 16 |
| winamp32.micro.MicroMacro 1.0 | 10 | 9% | 14 |
| sample.SpinBot 1.0 | 8 | 7% | 11 |
| kurios.DOSexe .9b | 5 | 4% | 11 |
| pa.Improved 1.0 | 5 | 4% | 7 |

## Melee bench: F07

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.7 | 99 / 210 | 3.01 | 17.4% | 33667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 17.4% | 99 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.4% | 34 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 13.7% | 23 |
| mz.MicroGodMelee 1 | 3.7 | 13.3% | 37 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 7 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 3 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.4% | 1 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 2 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.4 | 17 / 35 | 6019 |
| 2 | 1 | 67.9 | 80.6 | 17 / 35 | 6035 |
| 3 | 1 | 65.0 | 75.6 | 11 / 35 | 5105 |
| 4 | 1 | 69.0 | 84.1 | 22 / 35 | 5934 |
| 5 | 1 | 66.3 | 77.8 | 19 / 35 | 5352 |
| 6 | 1 | 63.7 | 69.5 | 13 / 35 | 5222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 89% |
| mz.MicroGodMelee 1 | 37 | 70% |
| gh.micro.Gruweltje 0.7 | 16 | 63% |
| DBall.Anarchy 0.1 | 14 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 29% | 58 |
| spinnercat.micro.Tyger 0.1 | 27 | 24% | 61 |
| gh.micro.Gruweltje 0.7 | 23 | 21% | 42 |
| caimano.Furia_Ceca 0.22 | 11 | 10% | 13 |
| acogdev.alpha 0.2 | 7 | 6% | 10 |
| fire219.CatBot 1.0 | 6 | 5% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 10 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.3 | 91 / 210 | 3.58 | 16.1% | 31625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.5 | 16.1% | 91 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.8% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.7% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 10 |
| germ.TheMind .2 | 5.3 | 9.4% | 4 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 67.6 | 11 / 35 | 5230 |
| 2 | 1 | 62.5 | 66.3 | 13 / 35 | 5079 |
| 3 | 1 | 66.9 | 77.1 | 18 / 35 | 5857 |
| 4 | 2 | 66.5 | 79.7 | 20 / 35 | 4917 |
| 5 | 1 | 64.8 | 72.4 | 17 / 35 | 5259 |
| 6 | 2 | 62.7 | 64.8 | 12 / 35 | 5283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 69% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 9 | 67% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 39% | 85 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 18% | 33 |
| germ.TheMind .2 | 14 | 12% | 25 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 17 |
| awesomeness.Elite 1.0 | 9 | 8% | 15 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 12 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.3 | 129 / 210 | 2.69 | 18.5% | 31097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 18.5% | 129 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.8% | 14 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 8 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.3% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.8% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 8.7% | 7 |
| stelo.PatternRobot 1.0 | 8.3 | 7.8% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 7.5% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.0 | 23 / 35 | 5344 |
| 2 | 1 | 65.2 | 71.1 | 17 / 35 | 4733 |
| 3 | 1 | 69.9 | 85.7 | 25 / 35 | 5319 |
| 4 | 1 | 67.7 | 78.1 | 20 / 35 | 5079 |
| 5 | 1 | 68.4 | 79.7 | 21 / 35 | 5343 |
| 6 | 1 | 69.4 | 86.0 | 23 / 35 | 5279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 88% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| ratosh.Wesco 1.4 | 11 | 82% |
| timmit.nano.TimDog 0.33 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| maribo.IotaCT 1.1 | 5 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 30% | 67 |
| timmit.nano.TimDog 0.33 | 13 | 16% | 22 |
| ratosh.Wesco 1.4 | 11 | 14% | 23 |
| nz.jdc.nano.GridFu 1.0 | 10 | 12% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 10% | 16 |
| stelo.PatternRobot 1.0 | 7 | 9% | 13 |
| maribo.IotaCT 1.1 | 5 | 6% | 16 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |

## Melee bench: F10

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.2 | 147 / 210 | 2.15 | 20.5% | 39508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 20.5% | 147 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.4% | 24 |
| baal.nano.N 1.42 | 3.7 | 10.6% | 7 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.4% | 4 |
| zyx.micro.Ant 1.1 | 4.7 | 10.0% | 15 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.3% | 0 |
| sanja.First 0.1 | 6.7 | 8.5% | 4 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 7 |
| amk.Punbot.Punbot 0.01 | 8.7 | 7.2% | 2 |
| sample.RamFire 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.9 | 27 / 35 | 6733 |
| 2 | 1 | 71.7 | 90.8 | 25 / 35 | 7404 |
| 3 | 1 | 71.9 | 94.0 | 30 / 35 | 6600 |
| 4 | 1 | 68.9 | 82.9 | 21 / 35 | 6260 |
| 5 | 1 | 69.1 | 83.8 | 23 / 35 | 6211 |
| 6 | 1 | 69.2 | 84.1 | 21 / 35 | 6300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 93% |
| cvt.Firsty 1.0 | 26 | 96% |
| zyx.micro.Ant 1.1 | 23 | 70% |
| baal.nano.N 1.42 | 21 | 90% |
| Grystrion.TrackerWO 1.0 | 19 | 95% |
| sanja.First 0.1 | 14 | 100% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 27 | 43% | 40 |
| tvv.nano.Polaris 1.2 | 8 | 13% | 52 |
| baal.nano.N 1.42 | 8 | 13% | 27 |
| Grystrion.TrackerWO 1.0 | 5 | 8% | 23 |
| cvt.Firsty 1.0 | 4 | 6% | 28 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 8 |
| sanja.First 0.1 | 3 | 5% | 22 |
| sample.RamFire 1.0 | 3 | 5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 7 |

## Melee bench: F11

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 59.7 | 69 / 210 | 4.62 | 14.0% | 30390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.8 | 14.8% | 72 |
| hadur117.micro.SaorCER 0.1 | 2.2 | 14.0% | 69 |
| cs.Wren 1.0 | 2.5 | 13.0% | 21 |
| js.PinBall 1.6 | 4.0 | 11.2% | 20 |
| mz.Cork 0.1 | 4.5 | 11.1% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 9.3% | 4 |
| evd.X1 0.01 | 6.7 | 8.8% | 5 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 6.3% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 60.3 | 9 / 35 | 5331 |
| 2 | 2 | 60.1 | 59.0 | 11 / 35 | 4973 |
| 3 | 4 | 57.4 | 52.4 | 7 / 35 | 4927 |
| 4 | 1 | 63.9 | 70.2 | 17 / 35 | 5118 |
| 5 | 3 | 58.1 | 54.6 | 10 / 35 | 4446 |
| 6 | 2 | 62.6 | 61.9 | 15 / 35 | 5595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 73% |
| cs.Wren 1.0 | 13 | 85% |
| mz.Cork 0.1 | 10 | 90% |
| joe.ADinosaur 1.0 | 5 | 80% |
| js.PinBall 1.6 | 4 | 75% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 141 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 33% | 82 |
| evd.X1 0.01 | 20 | 14% | 21 |
| cs.Wren 1.0 | 14 | 10% | 27 |
| mz.Cork 0.1 | 14 | 10% | 23 |
| joe.ADinosaur 1.0 | 14 | 10% | 17 |
| js.PinBall 1.6 | 12 | 9% | 14 |
| PSW.Relentless 0.1 | 12 | 9% | 11 |
| jsal.Jsalbot 1.0 | 4 | 3% | 9 |
| donjezza.Jezza 1.0 | 4 | 3% | 6 |

## Melee bench: F12

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 76.1 | 111 / 210 | 3.15 | 17.4% | 29401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 17.4% | 111 |
| myl.nano.Graviton 1.10 | 2.3 | 12.1% | 34 |
| ntc.Opposite 1.5 | 3.7 | 11.1% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.1% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.9% | 6 |
| pfvicm.Sobieski 7.2.3b | 6.3 | 9.5% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.2 | 8.1% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 10 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.0 | 20 / 35 | 5157 |
| 2 | 1 | 65.8 | 74.3 | 18 / 35 | 5090 |
| 3 | 1 | 67.3 | 79.7 | 19 / 35 | 5089 |
| 4 | 1 | 66.5 | 77.8 | 19 / 35 | 5019 |
| 5 | 1 | 64.7 | 72.1 | 19 / 35 | 4547 |
| 6 | 1 | 64.1 | 72.1 | 16 / 35 | 4499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 78% |
| myl.nano.Graviton 1.10 | 34 | 97% |
| disan.Chair 2.2.0 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| ntc.Opposite 1.5 | 9 | 89% |
| DBall.NUKE 0.1 | 9 | 89% |
| donjezza.Muncho 1.0 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 17% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 17% | 28 |
| pfvicm.Sobieski 7.2.3b | 17 | 17% | 22 |
| myl.nano.Graviton 1.10 | 16 | 16% | 38 |
| ntc.Opposite 1.5 | 16 | 16% | 27 |
| disan.Chair 2.2.0 | 9 | 9% | 18 |
| DBall.NUKE 0.1 | 4 | 4% | 17 |
| pbg.R2D2 1.0 | 3 | 3% | 12 |
| donjezza.Muncho 1.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 59.9 | 44 / 210 | 4.60 | 13.3% | 25478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.6% | 72 |
| oog.melee.Capulet 1.2 | 2.5 | 13.5% | 47 |
| hadur117.micro.SaorCER 0.1 | 3.2 | 13.3% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 25 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 11 |
| ejb.Polaris 1.0.1 | 5.5 | 10.8% | 11 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.8 | 51.4 | 4 / 35 | 4357 |
| 2 | 2 | 60.6 | 64.1 | 8 / 35 | 3990 |
| 3 | 5 | 59.1 | 55.9 | 6 / 35 | 4349 |
| 4 | 2 | 62.2 | 65.4 | 9 / 35 | 4382 |
| 5 | 3 | 60.5 | 62.5 | 10 / 35 | 4154 |
| 6 | 2 | 60.8 | 60.3 | 7 / 35 | 4246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 23 | 91% |
| oog.melee.Capulet 1.2 | 14 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 71% |
| yagami.Tidus 0.11 | 9 | 100% |
| ejb.Polaris 1.0.1 | 4 | 75% |

Hadur died in 166 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 61 | 37% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 13% | 32 |
| yagami.Tidus 0.11 | 20 | 12% | 27 |
| kawigi.micro.Shiz 1.1 | 19 | 11% | 34 |
| ejb.Polaris 1.0.1 | 19 | 11% | 25 |
| stelo.MirrorNano 1.3 | 12 | 7% | 12 |
| kurios.DOSexe .9a | 8 | 5% | 9 |
| step.nanoPri 1.0 | 6 | 4% | 8 |

## Melee bench: F14

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.0 | 117 / 210 | 3.16 | 16.8% | 27492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 16.8% | 117 |
| wee.Gem 1.8.4 | 3.2 | 12.1% | 33 |
| bzdp.Pansy 2.1 | 3.5 | 12.0% | 17 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 10 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 14 |
| m3thos.Eva00 1.1 | 6.0 | 10.0% | 14 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 67.9 | 15 / 35 | 4502 |
| 2 | 1 | 66.2 | 78.1 | 20 / 35 | 5050 |
| 3 | 1 | 66.0 | 80.6 | 21 / 35 | 4279 |
| 4 | 1 | 65.1 | 76.2 | 19 / 35 | 4659 |
| 5 | 1 | 64.5 | 73.3 | 21 / 35 | 4269 |
| 6 | 1 | 66.6 | 79.7 | 21 / 35 | 4733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 89% |
| wee.Gem 1.8.4 | 26 | 100% |
| wompi.Quokka 1.6 | 25 | 100% |
| ratosh.Nobo 0.21 | 17 | 88% |
| m3thos.Eva00 1.1 | 8 | 75% |
| bayen.UbaMicro 1.4 | 2 | 50% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 18% | 52 |
| m3thos.Eva00 1.1 | 17 | 18% | 22 |
| ratosh.Nobo 0.21 | 13 | 14% | 30 |
| maribo.FollowFire 1 | 12 | 13% | 12 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 11 |
| wee.Gem 1.8.4 | 7 | 8% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 10 |
| wompi.Quokka 1.6 | 6 | 6% | 26 |
| bayen.UbaMicro 1.4 | 6 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 83.5 | 133 / 210 | 2.49 | 21.0% | 47241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 21.0% | 133 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 14 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 85.7 | 25 / 35 | 7711 |
| 2 | 1 | 70.7 | 77.8 | 21 / 35 | 7965 |
| 3 | 1 | 70.3 | 78.1 | 20 / 35 | 7527 |
| 4 | 1 | 73.2 | 88.6 | 24 / 35 | 7961 |
| 5 | 1 | 71.3 | 80.6 | 20 / 35 | 7924 |
| 6 | 1 | 73.7 | 90.2 | 23 / 35 | 8153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 86% |
| mz.NanoGod 2.02 | 13 | 77% |
| drd.Dreadknoght 0.9 | 12 | 100% |
| ayk.WallHugger 1.0 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 6 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 29 | 38% | 50 |
| wompi.Wallaby 5.1 | 27 | 35% | 112 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 12 |
| ayk.WallHugger 1.0 | 6 | 8% | 15 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| drd.Dreadknoght 0.9 | 2 | 3% | 13 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |

## Melee bench: F16

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.0 | 96 / 210 | 3.61 | 16.0% | 28368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 16.0% | 96 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.4% | 23 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 23 |
| bvh.micro.Freya 0.3 | 4.7 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.7% | 10 |
| conscience.Electron 1.3g | 6.2 | 9.2% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 9 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 68.6 | 13 / 35 | 4311 |
| 2 | 1 | 62.0 | 67.0 | 14 / 35 | 4469 |
| 3 | 1 | 66.6 | 77.1 | 19 / 35 | 5354 |
| 4 | 1 | 64.9 | 74.6 | 20 / 35 | 4678 |
| 5 | 1 | 64.5 | 72.1 | 16 / 35 | 4983 |
| 6 | 1 | 62.3 | 66.7 | 14 / 35 | 4573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 83% |
| dummy.micro.Sparrow 2.5 | 26 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 95% |
| bvh.micro.Freya 0.3 | 13 | 85% |
| stelo.MirrorMicro 1.0 | 10 | 80% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 25 | 22% | 29 |
| voidious.micro.BlitzBat 1.05 | 20 | 18% | 53 |
| dummy.micro.Sparrow 2.5 | 20 | 18% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 16% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 10% | 31 |
| bvh.micro.Freya 0.3 | 8 | 7% | 15 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 14 |
| dl.BetterWalls 1.0 | 4 | 4% | 10 |

## Melee bench: F17

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.4 | 136 / 210 | 2.31 | 21.0% | 44920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 21.0% | 136 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 22 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 15 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.9% | 17 |
| dsw.StaticD 1.0 | 5.3 | 8.9% | 5 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 4 |
| tlp.ThreeLeggedPig 1 | 7.7 | 6.9% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.0% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 5 |
| sample.Corners 1.0 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 79.0 | 19 / 35 | 7093 |
| 2 | 1 | 72.1 | 86.3 | 25 / 35 | 7971 |
| 3 | 1 | 71.7 | 87.0 | 22 / 35 | 7736 |
| 4 | 1 | 71.6 | 88.3 | 25 / 35 | 7548 |
| 5 | 1 | 71.9 | 88.9 | 26 / 35 | 7424 |
| 6 | 1 | 69.9 | 82.9 | 19 / 35 | 7148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 90% |
| sul.Lunar 1.1 | 45 | 96% |
| supersample.SuperBoxBot 1.0 | 20 | 85% |
| dsw.StaticD 1.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 30% | 68 |
| supersample.SuperBoxBot 1.0 | 21 | 28% | 36 |
| mme.NikeEnhanced 2.0 | 10 | 14% | 12 |
| dsw.StaticD 1.0 | 7 | 9% | 17 |
| sul.Lunar 1.1 | 5 | 7% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 5% | 9 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorCER 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 74.5 | 98 / 210 | 3.30 | 17.2% | 36229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCER 0.1 | 1.0 | 17.2% | 98 |
| mld.Wisdom 1.0 | 2.5 | 13.0% | 23 |
| radnor.DoctorBob 1.42 | 3.0 | 13.0% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.3% | 33 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 7 |
| amz.NanoClone 1.41 | 5.5 | 10.1% | 14 |
| sample.Walls 1.0 | 7.2 | 8.3% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.5% | 3 |
| sample.Target 1.0 | 9.8 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 18 / 35 | 6362 |
| 2 | 1 | 65.5 | 74.0 | 18 / 35 | 5527 |
| 3 | 1 | 66.3 | 74.0 | 16 / 35 | 6506 |
| 4 | 1 | 67.1 | 78.1 | 16 / 35 | 5982 |
| 5 | 1 | 64.6 | 68.6 | 16 / 35 | 5832 |
| 6 | 1 | 65.1 | 70.8 | 14 / 35 | 6020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 51 | 82% |
| radnor.DoctorBob 1.42 | 23 | 83% |
| mld.Wisdom 1.0 | 11 | 82% |
| amz.NanoClone 1.41 | 9 | 78% |
| sample.Walls 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 29% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 22% | 67 |
| radnor.DoctorBob 1.42 | 25 | 22% | 49 |
| KiraNL.Chupacabra 0.4 | 17 | 15% | 23 |
| sample.Walls 1.0 | 5 | 4% | 12 |
| amz.NanoClone 1.41 | 5 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 1 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

