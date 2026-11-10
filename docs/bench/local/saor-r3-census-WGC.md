# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 89.5 | 150 / 210 | 1.94 | 22.1% | 45890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.1% | 150 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 15 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 19 |
| mld.Infinity 2.2 | 3.5 | 13.4% | 18 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 6 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 1 |
| sample.Walls 1.0 | 7.0 | 6.8% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.4% | 0 |
| sample.Target 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 88.6 | 26 / 35 | 7840 |
| 2 | 1 | 72.0 | 85.7 | 26 / 35 | 7029 |
| 3 | 1 | 72.9 | 87.9 | 23 / 35 | 7834 |
| 4 | 1 | 75.0 | 97.1 | 32 / 35 | 8081 |
| 5 | 1 | 72.8 | 89.8 | 24 / 35 | 7552 |
| 6 | 1 | 72.4 | 87.9 | 19 / 35 | 7554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 96% |
| radnor.DoctorBob 1.42 | 40 | 85% |
| mld.Infinity 2.2 | 38 | 89% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 38% | 65 |
| mld.Infinity 2.2 | 14 | 23% | 48 |
| mz.AntiGrav 1.0 | 11 | 18% | 72 |
| amz.NanoClone 1.41 | 7 | 12% | 12 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.3 | 109 / 210 | 2.50 | 18.6% | 34046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.6% | 109 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.5% | 69 |
| mld.DustBunny 3.8 | 3.0 | 14.5% | 18 |
| maribo.melee.BMV 0.1 | 4.7 | 9.7% | 3 |
| zyx.nano.Ant 1.1 | 5.3 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.9% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.3 | 19 / 35 | 5388 |
| 2 | 1 | 66.8 | 78.4 | 15 / 35 | 5261 |
| 3 | 1 | 69.2 | 86.7 | 18 / 35 | 5786 |
| 4 | 1 | 69.2 | 89.8 | 21 / 35 | 5468 |
| 5 | 1 | 69.0 | 85.4 | 21 / 35 | 5603 |
| 6 | 1 | 68.5 | 79.4 | 15 / 35 | 6540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 64% |
| mld.DustBunny 3.8 | 52 | 90% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 47 | 46% | 94 |
| mld.DustBunny 3.8 | 27 | 26% | 67 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 11 |
| maribo.melee.BMV 0.1 | 5 | 5% | 12 |
| zyx.nano.Ant 1.1 | 5 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 6 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |
| cs.Grudge 1.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 78.3 | 129 / 210 | 2.96 | 19.4% | 38082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.4% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 15.1% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.3% | 8 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.2% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.7% | 12 |
| fm.mammillarias 1.3 | 5.5 | 9.4% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 4 |
| sample.Fire 1.0 | 9.2 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 79.7 | 23 / 35 | 6194 |
| 2 | 1 | 66.6 | 69.2 | 17 / 35 | 6093 |
| 3 | 1 | 68.7 | 75.6 | 22 / 35 | 6119 |
| 4 | 1 | 69.1 | 79.4 | 22 / 35 | 6092 |
| 5 | 1 | 69.1 | 78.4 | 19 / 35 | 6560 |
| 6 | 1 | 72.2 | 87.3 | 26 / 35 | 7024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 91% |
| cb.nano.Insomnia 1.0 | 29 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 20 | 85% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 25% | 76 |
| cb.nano.Insomnia 1.0 | 17 | 21% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 12% | 29 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 38 |
| fm.mammillarias 1.3 | 8 | 10% | 13 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 12 |
| sample.Tracker 1.0 | 5 | 6% | 7 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 10 |
| sample.Fire 1.0 | 3 | 4% | 5 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 85.7 | 141 / 210 | 2.29 | 20.7% | 41200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.7% | 141 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 24 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.3% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 8.8% | 10 |
| yk.JahMicro 1.0 | 6.3 | 8.2% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.9% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 84.1 | 23 / 35 | 7103 |
| 2 | 1 | 70.7 | 88.3 | 23 / 35 | 6899 |
| 3 | 1 | 72.8 | 94.3 | 27 / 35 | 7331 |
| 4 | 1 | 70.7 | 84.1 | 24 / 35 | 6888 |
| 5 | 1 | 69.5 | 80.6 | 23 / 35 | 6494 |
| 6 | 1 | 69.6 | 82.9 | 21 / 35 | 6485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 86% |
| stelo.SoJNanoMelee 1.1 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 23 | 87% |
| tj.zombie1n 1.0.1 | 22 | 68% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 42% | 85 |
| tj.zombie1n 1.0.1 | 10 | 14% | 15 |
| stelo.SoJNanoMelee 1.1 | 8 | 12% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 9% | 9 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 29 |
| repositorio.NanoStep 1.0 | 4 | 6% | 16 |
| yk.JahMicro 1.0 | 4 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 22 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.0 | 88 / 210 | 3.79 | 16.2% | 31361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.2% | 88 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 38 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.5% | 28 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.3% | 6 |
| sam.Samspin 1.0 | 7.0 | 9.1% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.8 | 14 / 35 | 5801 |
| 2 | 1 | 64.9 | 68.6 | 17 / 35 | 5319 |
| 3 | 1 | 64.1 | 68.6 | 16 / 35 | 5122 |
| 4 | 2 | 60.6 | 59.7 | 8 / 35 | 4934 |
| 5 | 1 | 62.1 | 64.8 | 15 / 35 | 4747 |
| 6 | 1 | 66.8 | 75.6 | 18 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 86% |
| oog.melee.Corsair 1.0 | 30 | 67% |
| ahf.NanoAndrew .4 | 19 | 79% |
| EBBU.Sim2 1.02 | 14 | 86% |
| sam.Samspin 1.0 | 8 | 63% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 45 |
| oog.melee.Corsair 1.0 | 20 | 16% | 43 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 12% | 16 |
| ahf.NanoAndrew .4 | 14 | 11% | 31 |
| EBBU.Sim2 1.02 | 12 | 10% | 19 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 15 |
| sam.Samspin 1.0 | 10 | 8% | 15 |
| sample.TrackFire 1.0 | 5 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.0 | 119 / 210 | 2.53 | 18.7% | 33341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.7% | 119 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 43 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.3% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 9 |
| fm.claire 1.7 | 6.2 | 8.3% | 0 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.0% | 4 |
| sample.SpinBot 1.0 | 7.7 | 7.5% | 6 |
| pa.Improved 1.0 | 8.8 | 6.4% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.2 | 19 / 35 | 5982 |
| 2 | 1 | 66.2 | 79.7 | 18 / 35 | 4779 |
| 3 | 1 | 67.3 | 81.6 | 19 / 35 | 5336 |
| 4 | 1 | 69.2 | 85.7 | 19 / 35 | 6043 |
| 5 | 1 | 67.1 | 77.8 | 21 / 35 | 5345 |
| 6 | 1 | 70.2 | 90.8 | 23 / 35 | 5856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 77% |
| oog.melee.CapuletDroid 1.1 | 22 | 95% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| sample.SpinBot 1.0 | 7 | 86% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 38% | 86 |
| gh.nano.Grofvuil 0.2 | 15 | 16% | 29 |
| arthord.NanoSatanMelee Beta | 10 | 11% | 16 |
| winamp32.micro.MicroMacro 1.0 | 9 | 10% | 21 |
| oog.melee.CapuletDroid 1.1 | 8 | 9% | 31 |
| fm.claire 1.7 | 6 | 6% | 8 |
| sample.SpinBot 1.0 | 4 | 4% | 8 |
| pa.Improved 1.0 | 3 | 3% | 7 |
| kurios.DOSexe .9b | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.7 | 101 / 210 | 2.83 | 18.2% | 35376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.2% | 101 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.8% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.0% | 30 |
| mz.MicroGodMelee 1 | 3.5 | 13.4% | 36 |
| DBall.Anarchy 0.1 | 5.0 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 1 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.9 | 15 / 35 | 5665 |
| 2 | 1 | 66.9 | 78.4 | 17 / 35 | 5609 |
| 3 | 1 | 69.3 | 81.3 | 20 / 35 | 6702 |
| 4 | 1 | 68.6 | 81.3 | 17 / 35 | 6070 |
| 5 | 1 | 66.4 | 74.9 | 16 / 35 | 5478 |
| 6 | 1 | 67.9 | 80.3 | 16 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 62 | 89% |
| mz.MicroGodMelee 1 | 37 | 62% |
| gh.micro.Gruweltje 0.7 | 17 | 71% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 29% | 60 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 43 |
| spinnercat.micro.Tyger 0.1 | 27 | 25% | 71 |
| fire219.CatBot 1.0 | 7 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| acogdev.alpha 0.2 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 72.5 | 106 / 210 | 3.48 | 17.2% | 33359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.2% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 15.1% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.2% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.5% | 6 |
| germ.TheMind .2 | 4.8 | 9.3% | 9 |
| awesomeness.Elite 1.0 | 6.0 | 9.0% | 10 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.3% | 2 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.3% | 7 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 76.8 | 19 / 35 | 5813 |
| 2 | 1 | 66.3 | 74.6 | 20 / 35 | 5423 |
| 3 | 1 | 65.4 | 71.7 | 16 / 35 | 5500 |
| 4 | 1 | 63.4 | 66.3 | 13 / 35 | 5298 |
| 5 | 1 | 67.8 | 76.8 | 19 / 35 | 5974 |
| 6 | 1 | 65.4 | 68.6 | 19 / 35 | 5351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| germ.TheMind .2 | 12 | 92% |
| awesomeness.Elite 1.0 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 105 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 39% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 22% | 35 |
| germ.TheMind .2 | 15 | 14% | 26 |
| awesomeness.Elite 1.0 | 8 | 8% | 17 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 10 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 9 |
| sample.Crazy 1.0 | 3 | 3% | 11 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.7 | 141 / 210 | 2.10 | 20.2% | 33574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.2% | 141 |
| rz.HawkOnFire 0.1 | 2.2 | 14.1% | 25 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.6% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 8 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.0% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.3% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.1% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 7.7% | 7 |
| spinnercat.Omen 1.0 | 8.3 | 7.5% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.6 | 22 / 35 | 5865 |
| 2 | 1 | 70.8 | 87.3 | 24 / 35 | 5577 |
| 3 | 1 | 69.6 | 83.5 | 24 / 35 | 5096 |
| 4 | 1 | 71.3 | 91.4 | 24 / 35 | 5651 |
| 5 | 1 | 70.1 | 87.0 | 21 / 35 | 5581 |
| 6 | 1 | 71.5 | 89.5 | 26 / 35 | 5804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 78 | 95% |
| nz.jdc.nano.GridFu 1.0 | 37 | 97% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| maribo.IotaCT 1.1 | 7 | 86% |
| ratosh.Wesco 1.4 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 26% | 66 |
| timmit.nano.TimDog 0.33 | 18 | 26% | 31 |
| stelo.PatternRobot 1.0 | 13 | 19% | 26 |
| nz.jdc.nano.GridFu 1.0 | 8 | 12% | 51 |
| ratosh.Wesco 1.4 | 6 | 9% | 17 |
| maribo.IotaCT 1.1 | 4 | 6% | 14 |
| spinnercat.Omen 1.0 | 2 | 3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 90.7 | 165 / 210 | 1.83 | 21.7% | 41324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.7% | 165 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 17 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 10 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 0 |
| zyx.micro.Ant 1.1 | 5.0 | 9.6% | 9 |
| sanja.First 0.1 | 5.5 | 8.7% | 5 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 8.3 | 6.8% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 28 / 35 | 6599 |
| 2 | 1 | 73.1 | 95.6 | 30 / 35 | 7290 |
| 3 | 1 | 71.8 | 89.8 | 27 / 35 | 6920 |
| 4 | 1 | 70.5 | 83.8 | 22 / 35 | 6717 |
| 5 | 1 | 72.8 | 94.3 | 31 / 35 | 7263 |
| 6 | 1 | 70.5 | 86.7 | 27 / 35 | 6535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 93% |
| tvv.nano.Polaris 1.2 | 41 | 83% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| sanja.First 0.1 | 21 | 100% |
| cvt.Firsty 1.0 | 19 | 89% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 13 | 29% | 64 |
| baal.nano.N 1.42 | 9 | 20% | 47 |
| zyx.micro.Ant 1.1 | 9 | 20% | 36 |
| cvt.Firsty 1.0 | 5 | 11% | 24 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 20 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 4 |
| sanja.First 0.1 | 1 | 2% | 12 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.6 | 91 / 210 | 3.47 | 16.6% | 33856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.6% | 91 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 58 |
| cs.Wren 1.0 | 3.0 | 12.9% | 18 |
| js.PinBall 1.6 | 4.3 | 11.4% | 17 |
| mz.Cork 0.1 | 4.7 | 10.9% | 15 |
| evd.X1 0.01 | 6.3 | 8.3% | 3 |
| joe.ADinosaur 1.0 | 6.5 | 8.5% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 70.5 | 18 / 35 | 5757 |
| 2 | 1 | 65.4 | 74.9 | 12 / 35 | 5715 |
| 3 | 2 | 65.1 | 70.2 | 12 / 35 | 5636 |
| 4 | 1 | 65.7 | 73.7 | 17 / 35 | 5669 |
| 5 | 1 | 67.2 | 79.4 | 17 / 35 | 5950 |
| 6 | 1 | 63.1 | 67.0 | 15 / 35 | 5129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 72% |
| cs.Wren 1.0 | 29 | 79% |
| js.PinBall 1.6 | 14 | 71% |
| mz.Cork 0.1 | 7 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 39% | 101 |
| cs.Wren 1.0 | 21 | 17% | 38 |
| evd.X1 0.01 | 14 | 11% | 15 |
| js.PinBall 1.6 | 13 | 11% | 17 |
| mz.Cork 0.1 | 11 | 9% | 16 |
| joe.ADinosaur 1.0 | 9 | 7% | 11 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.2 | 131 / 210 | 2.60 | 18.9% | 31085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.9% | 131 |
| myl.nano.Graviton 1.10 | 2.3 | 11.9% | 24 |
| ntc.Opposite 1.5 | 2.8 | 11.5% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.7% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.8 | 9.5% | 15 |
| disan.Chair 2.2.0 | 7.0 | 8.8% | 11 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.0 | 22 / 35 | 5071 |
| 2 | 1 | 67.6 | 79.0 | 21 / 35 | 5182 |
| 3 | 1 | 69.1 | 87.9 | 23 / 35 | 5065 |
| 4 | 1 | 67.9 | 79.7 | 21 / 35 | 5298 |
| 5 | 1 | 70.0 | 89.8 | 24 / 35 | 5284 |
| 6 | 1 | 67.0 | 77.8 | 20 / 35 | 5185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 83% |
| disan.Chair 2.2.0 | 26 | 81% |
| ntc.Opposite 1.5 | 25 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| stelo.AreaTargetingBot 1.1 | 16 | 81% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| donjezza.Muncho 1.0 | 10 | 100% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 25% | 31 |
| stelo.AreaTargetingBot 1.1 | 15 | 19% | 34 |
| myl.nano.Graviton 1.10 | 13 | 16% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 28 |
| disan.Chair 2.2.0 | 6 | 8% | 26 |
| ntc.Opposite 1.5 | 5 | 6% | 24 |
| pbg.R2D2 1.0 | 5 | 6% | 11 |
| donjezza.Muncho 1.0 | 2 | 3% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 77.1 | 95 / 210 | 3.06 | 16.9% | 28058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.9% | 95 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 22 |
| oog.melee.Capulet 1.2 | 3.3 | 13.4% | 53 |
| yagami.Tidus 0.11 | 5.0 | 11.3% | 6 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 3 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 71.4 | 14 / 35 | 4346 |
| 2 | 1 | 67.7 | 82.5 | 17 / 35 | 4834 |
| 3 | 1 | 67.5 | 81.6 | 16 / 35 | 4933 |
| 4 | 1 | 67.0 | 77.1 | 18 / 35 | 4817 |
| 5 | 1 | 66.6 | 80.6 | 14 / 35 | 4652 |
| 6 | 1 | 64.5 | 69.5 | 16 / 35 | 4476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 74% |
| kawigi.micro.Shiz 1.1 | 33 | 91% |
| oog.melee.Capulet 1.2 | 21 | 67% |
| yagami.Tidus 0.11 | 20 | 95% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 36% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 22% | 53 |
| yagami.Tidus 0.11 | 18 | 16% | 34 |
| ejb.Polaris 1.0.1 | 9 | 8% | 20 |
| kawigi.micro.Shiz 1.1 | 8 | 7% | 31 |
| kurios.DOSexe .9a | 6 | 5% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 3 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.9 | 128 / 210 | 2.80 | 17.7% | 27622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.7% | 128 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 22 |
| ratosh.Nobo 0.21 | 3.7 | 11.4% | 12 |
| wompi.Quokka 1.6 | 4.2 | 11.0% | 11 |
| wee.Gem 1.8.4 | 4.3 | 11.0% | 21 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 5 |
| bayen.UbaMicro 1.4 | 6.3 | 9.4% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.4% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 73.3 | 19 / 35 | 4276 |
| 2 | 1 | 66.2 | 77.5 | 19 / 35 | 4532 |
| 3 | 1 | 68.9 | 89.2 | 26 / 35 | 4623 |
| 4 | 1 | 69.0 | 86.7 | 25 / 35 | 5132 |
| 5 | 1 | 66.3 | 79.4 | 21 / 35 | 4715 |
| 6 | 1 | 64.0 | 73.7 | 18 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 90% |
| wee.Gem 1.8.4 | 26 | 96% |
| ratosh.Nobo 0.21 | 21 | 76% |
| wompi.Quokka 1.6 | 18 | 94% |
| m3thos.Eva00 1.1 | 14 | 79% |
| bayen.UbaMicro 1.4 | 13 | 85% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 19% | 55 |
| ratosh.Nobo 0.21 | 15 | 18% | 30 |
| m3thos.Eva00 1.1 | 10 | 12% | 21 |
| maribo.FollowFire 1 | 10 | 12% | 12 |
| bayen.UbaMicro 1.4 | 9 | 11% | 17 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| wee.Gem 1.8.4 | 6 | 7% | 36 |
| wompi.Quokka 1.6 | 3 | 4% | 17 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 84.0 | 113 / 210 | 2.44 | 21.3% | 49023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.3% | 113 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 75 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 14 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.8% | 5 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.7 | 9.1% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 89.8 | 20 / 35 | 8402 |
| 2 | 1 | 73.6 | 86.0 | 19 / 35 | 8882 |
| 3 | 1 | 74.3 | 91.4 | 22 / 35 | 8662 |
| 4 | 1 | 71.8 | 83.5 | 17 / 35 | 7628 |
| 5 | 1 | 71.9 | 79.7 | 19 / 35 | 7846 |
| 6 | 1 | 69.5 | 73.3 | 16 / 35 | 7603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 75% |
| exauge.GateKeeper 1.1.121g | 14 | 79% |
| mz.NanoGod 2.02 | 12 | 58% |
| ayk.WallHugger 1.0 | 5 | 80% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 46 | 47% | 138 |
| mz.NanoGod 2.02 | 25 | 26% | 33 |
| exauge.GateKeeper 1.1.121g | 12 | 12% | 18 |
| ayk.WallHugger 1.0 | 7 | 7% | 9 |
| stuff.Vlad 0.1 | 4 | 4% | 7 |
| stelo.PianistNano 1.2 | 3 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 69.9 | 94 / 210 | 3.71 | 16.3% | 29634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.3% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 28 |
| bvh.micro.Freya 0.3 | 3.0 | 12.5% | 26 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.2% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 9.9% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 6 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 63.8 | 13 / 35 | 4621 |
| 2 | 1 | 65.0 | 72.1 | 19 / 35 | 4753 |
| 3 | 1 | 65.1 | 71.7 | 16 / 35 | 5221 |
| 4 | 1 | 67.1 | 78.7 | 20 / 35 | 4867 |
| 5 | 1 | 63.9 | 68.6 | 14 / 35 | 5018 |
| 6 | 1 | 62.8 | 64.4 | 12 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 93% |
| dummy.micro.Sparrow 2.5 | 29 | 79% |
| bvh.micro.Freya 0.3 | 27 | 78% |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 91% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 21 | 18% | 45 |
| voidious.micro.BlitzBat 1.05 | 20 | 17% | 51 |
| bvh.micro.Freya 0.3 | 18 | 16% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 16% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 12% | 28 |
| dl.BetterWalls 1.0 | 12 | 10% | 15 |
| conscience.Electron 1.3g | 11 | 9% | 14 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 7 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 84.7 | 140 / 210 | 2.38 | 21.2% | 43656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.2% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 26 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 8 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.1% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.7% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 15 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 4 |
| sample.Corners 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.5 | 22 / 35 | 7880 |
| 2 | 1 | 72.4 | 88.6 | 26 / 35 | 7024 |
| 3 | 1 | 71.7 | 81.6 | 23 / 35 | 7776 |
| 4 | 1 | 71.4 | 83.8 | 23 / 35 | 7418 |
| 5 | 1 | 70.8 | 88.3 | 22 / 35 | 6612 |
| 6 | 1 | 70.5 | 82.2 | 24 / 35 | 6946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 87% |
| supersample.SuperBoxBot 1.0 | 25 | 92% |
| dsw.StaticD 1.0 | 14 | 36% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 29% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 26% | 52 |
| dsw.StaticD 1.0 | 15 | 21% | 26 |
| sul.Lunar 1.1 | 4 | 6% | 58 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 9 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 8 |
| sample.Corners 1.0 | 3 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 80.5 | 115 / 210 | 2.76 | 18.8% | 39166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.8% | 115 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.0% | 23 |
| mld.Wisdom 1.0 | 3.7 | 12.1% | 25 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 5 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 8 |
| sample.Walls 1.0 | 7.5 | 7.0% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 2 |
| sample.Target 1.0 | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 70.5 | 15 / 35 | 6175 |
| 2 | 1 | 69.2 | 82.9 | 20 / 35 | 6518 |
| 3 | 1 | 69.4 | 82.9 | 21 / 35 | 6673 |
| 4 | 1 | 69.0 | 80.6 | 20 / 35 | 6927 |
| 5 | 1 | 70.3 | 86.0 | 23 / 35 | 6632 |
| 6 | 1 | 67.8 | 80.0 | 16 / 35 | 6241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 96% |
| radnor.DoctorBob 1.42 | 35 | 71% |
| mld.Wisdom 1.0 | 17 | 53% |
| KiraNL.Chupacabra 0.4 | 11 | 100% |
| amz.NanoClone 1.41 | 11 | 91% |
| sample.Walls 1.0 | 7 | 86% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 34% | 47 |
| radnor.DoctorBob 1.42 | 21 | 22% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 56 |
| amz.NanoClone 1.41 | 10 | 11% | 15 |
| KiraNL.Chupacabra 0.4 | 9 | 9% | 19 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| jangs.ns51 1.0 | 3 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

