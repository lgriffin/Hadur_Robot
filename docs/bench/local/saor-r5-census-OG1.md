# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 77.9 | 83 / 210 | 2.99 | 17.3% | 32467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.3% | 83 |
| radnor.DoctorBob 1.42 | 2.0 | 16.4% | 61 |
| mz.AntiGrav 1.0 | 3.3 | 14.7% | 19 |
| mld.Infinity 2.2 | 3.7 | 13.8% | 40 |
| amz.NanoClone 1.41 | 5.0 | 11.1% | 6 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| sample.Walls 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.6% | 1 |
| arthord.MannyPacquiao Beta | 8.8 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 76.5 | 14 / 35 | 5533 |
| 2 | 1 | 67.4 | 80.6 | 13 / 35 | 5338 |
| 3 | 1 | 68.1 | 82.9 | 14 / 35 | 5293 |
| 4 | 1 | 66.7 | 73.3 | 13 / 35 | 5297 |
| 5 | 1 | 67.3 | 76.2 | 14 / 35 | 5812 |
| 6 | 1 | 67.1 | 77.8 | 15 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 41 | 63% |
| mz.AntiGrav 1.0 | 38 | 95% |
| radnor.DoctorBob 1.42 | 31 | 32% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 68 | 54% | 87 |
| mld.Infinity 2.2 | 28 | 22% | 27 |
| amz.NanoClone 1.41 | 14 | 11% | 18 |
| mz.AntiGrav 1.0 | 7 | 6% | 54 |
| GarmBox.Oranges 1.0 | 5 | 4% | 5 |
| sample.Walls 1.0 | 3 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 9 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.0 | 120 / 210 | 2.53 | 17.0% | 23736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.0% | 120 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.8% | 48 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 22 |
| maribo.melee.BMV 0.1 | 4.3 | 10.5% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 6 |
| fullsail.SweetTea 1.1 | 7.5 | 7.4% | 3 |
| zyx.nano.Ant 1.1 | 7.7 | 7.4% | 1 |
| bzdp.BoxCar 2.0 | 7.7 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 86.0 | 19 / 35 | 4111 |
| 2 | 2 | 62.2 | 69.8 | 15 / 35 | 4033 |
| 3 | 1 | 66.7 | 88.9 | 22 / 35 | 3711 |
| 4 | 1 | 66.7 | 86.0 | 22 / 35 | 4035 |
| 5 | 1 | 66.4 | 84.4 | 23 / 35 | 3611 |
| 6 | 1 | 66.2 | 82.5 | 19 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 71% |
| mld.DustBunny 3.8 | 49 | 82% |
| maribo.melee.BMV 0.1 | 14 | 93% |
| djdjdj.NanoSkunk10 1.0 | 11 | 82% |
| fullsail.SweetTea 1.1 | 8 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 33% | 88 |
| mld.DustBunny 3.8 | 20 | 22% | 54 |
| zyx.nano.Ant 1.1 | 12 | 13% | 12 |
| djdjdj.NanoSkunk10 1.0 | 8 | 9% | 14 |
| maribo.melee.BMV 0.1 | 7 | 8% | 14 |
| fullsail.SweetTea 1.1 | 6 | 6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| cs.Grudge 1.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.7 | 95 / 210 | 3.28 | 16.9% | 28664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.9% | 95 |
| myl.micro.Troodon 1.10 | 2.0 | 15.6% | 57 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 13.5% | 19 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.1% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.7% | 20 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 5 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 2 |
| sample.Tracker 1.0 | 9.0 | 5.1% | 1 |
| sample.Fire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.9 | 18 / 35 | 4248 |
| 2 | 2 | 63.6 | 66.3 | 13 / 35 | 4523 |
| 3 | 1 | 67.5 | 82.5 | 22 / 35 | 4468 |
| 4 | 1 | 66.2 | 71.7 | 16 / 35 | 5249 |
| 5 | 1 | 67.1 | 77.5 | 14 / 35 | 5231 |
| 6 | 1 | 64.3 | 68.3 | 12 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 40 | 90% |
| myl.nano.KomoriNinja 1.1 | 22 | 82% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 68% |
| fm.mammillarias 1.3 | 5 | 80% |
| sp.Nanos.Ember 1.1 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 22% | 31 |
| myl.micro.Troodon 1.10 | 24 | 21% | 71 |
| myl.nano.KomoriNinja 1.1 | 20 | 17% | 48 |
| fm.mammillarias 1.3 | 20 | 17% | 23 |
| cb.nano.Insomnia 1.0 | 15 | 13% | 14 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 8 |
| sample.Tracker 1.0 | 2 | 2% | 4 |
| sample.Fire 1.0 | 2 | 2% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.0 | 100 / 210 | 2.98 | 17.3% | 29533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.3% | 100 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.1% | 20 |
| tvv.micro.Antares 1.1.1 | 2.7 | 14.0% | 37 |
| tj.zombie1n 1.0.1 | 4.8 | 9.6% | 11 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.7% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.3% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.5% | 2 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.1 | 20 / 35 | 5429 |
| 2 | 1 | 66.0 | 80.0 | 12 / 35 | 4911 |
| 3 | 1 | 65.8 | 76.8 | 18 / 35 | 4650 |
| 4 | 1 | 65.7 | 77.5 | 18 / 35 | 4805 |
| 5 | 1 | 67.5 | 82.5 | 18 / 35 | 5323 |
| 6 | 1 | 62.5 | 67.0 | 14 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 79% |
| tvv.micro.Antares 1.1.1 | 34 | 74% |
| stelo.SoJNanoMelee 1.1 | 26 | 54% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 80% |
| tj.zombie1n 1.0.1 | 3 | 33% |

Hadur died in 110 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 33 | 30% | 77 |
| tvv.micro.Antares 1.1.1 | 29 | 26% | 56 |
| stelo.SoJNanoMelee 1.1 | 25 | 23% | 36 |
| tj.zombie1n 1.0.1 | 7 | 6% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 12 |
| repositorio.NanoStep 1.0 | 3 | 3% | 11 |
| yk.JahMicro 1.0 | 2 | 2% | 3 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 64.1 | 79 / 210 | 4.23 | 14.6% | 25130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 14.6% | 79 |
| oog.melee.Corsair 1.0 | 2.7 | 12.4% | 30 |
| ahf.NanoAndrew .4 | 2.8 | 12.1% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 24 |
| sam.Samspin 1.0 | 4.8 | 10.6% | 20 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.7% | 8 |
| EBBU.Sim2 1.02 | 6.7 | 9.5% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 62.9 | 14 / 35 | 4319 |
| 2 | 1 | 61.5 | 66.3 | 12 / 35 | 4130 |
| 3 | 2 | 58.8 | 57.1 | 11 / 35 | 3919 |
| 4 | 1 | 61.9 | 66.0 | 17 / 35 | 4051 |
| 5 | 1 | 61.9 | 65.7 | 14 / 35 | 4340 |
| 6 | 1 | 61.7 | 66.7 | 11 / 35 | 4371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 87% |
| oog.melee.Corsair 1.0 | 21 | 86% |
| ahf.NanoAndrew .4 | 21 | 62% |
| sam.Samspin 1.0 | 11 | 73% |
| EBBU.Sim2 1.02 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 23% | 56 |
| ahf.NanoAndrew .4 | 17 | 13% | 33 |
| robar.nano.Assertive_Melee 0.2 | 16 | 12% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 11% | 15 |
| EBBU.Sim2 1.02 | 13 | 10% | 21 |
| sam.Samspin 1.0 | 13 | 10% | 19 |
| oog.melee.Corsair 1.0 | 12 | 9% | 29 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 14 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.2 | 119 / 210 | 2.87 | 16.9% | 24611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.9% | 119 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.6% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 13.0% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.6% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.3% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 4 |
| fm.claire 1.7 | 6.7 | 8.5% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 6 |
| pa.Improved 1.0 | 8.8 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.0 | 21 / 35 | 3880 |
| 2 | 1 | 63.6 | 71.7 | 17 / 35 | 4198 |
| 3 | 1 | 67.1 | 87.9 | 22 / 35 | 3969 |
| 4 | 1 | 65.7 | 81.6 | 20 / 35 | 4031 |
| 5 | 1 | 65.7 | 77.5 | 22 / 35 | 4288 |
| 6 | 1 | 65.3 | 77.5 | 17 / 35 | 4245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 87% |
| oog.melee.CapuletDroid 1.1 | 29 | 86% |
| gh.nano.Grofvuil 0.2 | 28 | 79% |
| winamp32.micro.MicroMacro 1.0 | 10 | 90% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| sample.SpinBot 1.0 | 4 | 75% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 26% | 81 |
| gh.nano.Grofvuil 0.2 | 18 | 20% | 47 |
| oog.melee.CapuletDroid 1.1 | 15 | 16% | 15 |
| fm.claire 1.7 | 11 | 12% | 12 |
| sample.SpinBot 1.0 | 8 | 9% | 15 |
| winamp32.micro.MicroMacro 1.0 | 8 | 9% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 13 |
| kurios.DOSexe .9b | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.7 | 77 / 210 | 3.10 | 16.1% | 26928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.7 | 16.1% | 54 |
| hadur117.micro.SaorOG1 0.1 | 1.7 | 16.1% | 77 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.2% | 31 |
| mz.MicroGodMelee 1 | 3.5 | 13.9% | 19 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 18 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.1% | 5 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 5 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.8% | 1 |
| acogdev.alpha 0.2 | 8.3 | 5.8% | 0 |
| fire219.CatBot 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 73.3 | 11 / 35 | 4222 |
| 2 | 2 | 65.1 | 73.7 | 13 / 35 | 4665 |
| 3 | 2 | 65.2 | 76.5 | 11 / 35 | 4615 |
| 4 | 1 | 66.3 | 82.5 | 14 / 35 | 4620 |
| 5 | 1 | 66.4 | 81.6 | 15 / 35 | 4634 |
| 6 | 2 | 62.8 | 72.7 | 13 / 35 | 4172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 42 | 81% |
| spinnercat.micro.Tyger 0.1 | 38 | 50% |
| gh.micro.Gruweltje 0.7 | 34 | 47% |
| DBall.Anarchy 0.1 | 8 | 38% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 36 | 27% | 57 |
| spinnercat.micro.Tyger 0.1 | 29 | 22% | 47 |
| mz.MicroGodMelee 1 | 26 | 20% | 53 |
| DBall.Anarchy 0.1 | 11 | 8% | 14 |
| acogdev.alpha 0.2 | 9 | 7% | 10 |
| el.JumpShoot 0.2 | 8 | 6% | 9 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 10 |
| fire219.CatBot 1.0 | 4 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 58.6 | 64 / 210 | 4.72 | 13.6% | 26291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 15.5% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 14.5% | 47 |
| hadur117.micro.SaorOG1 0.1 | 2.7 | 13.6% | 64 |
| germ.TheMind .2 | 5.0 | 9.5% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.8% | 2 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 10 |
| sample.Crazy 1.0 | 7.7 | 8.1% | 10 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.7% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 54.9 | 8 / 35 | 4701 |
| 2 | 3 | 61.1 | 64.1 | 12 / 35 | 4187 |
| 3 | 2 | 59.4 | 58.7 | 9 / 35 | 4579 |
| 4 | 3 | 55.4 | 49.5 | 12 / 35 | 3586 |
| 5 | 2 | 65.5 | 73.7 | 15 / 35 | 5267 |
| 6 | 3 | 56.5 | 50.8 | 8 / 35 | 3971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 66% |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 33% |
| sample.Crazy 1.0 | 6 | 83% |
| germ.TheMind .2 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 41% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 34 | 23% | 38 |
| germ.TheMind .2 | 11 | 8% | 18 |
| qualidafial.MajorDick 1.0.1 | 11 | 8% | 13 |
| stelo.UntouchableNano 1.3 | 9 | 6% | 13 |
| awesomeness.Elite 1.0 | 9 | 6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 8 | 5% | 15 |
| sample.Crazy 1.0 | 3 | 2% | 9 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.7 | 108 / 210 | 2.65 | 16.7% | 21129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.7% | 108 |
| rz.HawkOnFire 0.1 | 2.5 | 13.9% | 26 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 14.1% | 37 |
| maribo.IotaCT 1.1 | 4.3 | 11.5% | 12 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.3% | 3 |
| ratosh.Wesco 1.4 | 7.7 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 0 |
| stelo.PatternRobot 1.0 | 8.0 | 7.4% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.6 | 20 / 35 | 3297 |
| 2 | 1 | 64.4 | 78.7 | 13 / 35 | 3495 |
| 3 | 1 | 64.7 | 77.1 | 13 / 35 | 3729 |
| 4 | 1 | 66.7 | 85.1 | 19 / 35 | 3410 |
| 5 | 1 | 68.7 | 87.9 | 26 / 35 | 3558 |
| 6 | 1 | 65.4 | 79.7 | 17 / 35 | 3640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 47 | 79% |
| rz.HawkOnFire 0.1 | 43 | 86% |
| maribo.IotaCT 1.1 | 14 | 64% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| timmit.nano.TimDog 0.33 | 7 | 57% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 25 | 24% | 66 |
| rz.HawkOnFire 0.1 | 22 | 21% | 53 |
| maribo.IotaCT 1.1 | 19 | 18% | 31 |
| timmit.nano.TimDog 0.33 | 13 | 13% | 18 |
| stelo.PatternRobot 1.0 | 10 | 10% | 17 |
| spinnercat.Omen 1.0 | 5 | 5% | 9 |
| ratosh.Wesco 1.4 | 4 | 4% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.9 | 116 / 210 | 2.54 | 18.0% | 29300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.0% | 116 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.9% | 49 |
| baal.nano.N 1.42 | 3.2 | 11.4% | 12 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.3% | 5 |
| zyx.micro.Ant 1.1 | 5.5 | 9.4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.7% | 1 |
| sanja.First 0.1 | 6.5 | 8.8% | 5 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 13 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.0% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.3 | 20 / 35 | 4900 |
| 2 | 1 | 69.3 | 91.7 | 23 / 35 | 4917 |
| 3 | 1 | 66.0 | 82.5 | 17 / 35 | 4607 |
| 4 | 1 | 67.3 | 80.0 | 24 / 35 | 5074 |
| 5 | 1 | 66.2 | 77.8 | 17 / 35 | 4927 |
| 6 | 1 | 65.4 | 77.8 | 15 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 53 | 53% |
| baal.nano.N 1.42 | 23 | 96% |
| sanja.First 0.1 | 19 | 95% |
| cvt.Firsty 1.0 | 18 | 72% |
| Grystrion.TrackerWO 1.0 | 16 | 81% |
| zyx.micro.Ant 1.1 | 13 | 92% |
| amk.Punbot.Punbot 0.01 | 8 | 75% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 34 | 36% | 70 |
| zyx.micro.Ant 1.1 | 17 | 18% | 37 |
| Grystrion.TrackerWO 1.0 | 10 | 11% | 16 |
| baal.nano.N 1.42 | 8 | 9% | 23 |
| sanja.First 0.1 | 7 | 7% | 25 |
| cvt.Firsty 1.0 | 6 | 6% | 17 |
| amk.Punbot.Punbot 0.01 | 6 | 6% | 6 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 8 |
| sample.RamFire 1.0 | 3 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.3 | 50 / 210 | 4.03 | 14.0% | 25699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.5% | 86 |
| hadur117.micro.SaorOG1 0.1 | 2.5 | 14.0% | 50 |
| cs.Wren 1.0 | 2.7 | 13.3% | 27 |
| js.PinBall 1.6 | 4.0 | 11.6% | 20 |
| mz.Cork 0.1 | 4.7 | 11.2% | 11 |
| joe.ADinosaur 1.0 | 6.2 | 8.6% | 2 |
| evd.X1 0.01 | 6.8 | 8.2% | 7 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.8% | 3 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.3 | 53.0 | 5 / 35 | 4380 |
| 2 | 2 | 63.3 | 73.3 | 11 / 35 | 4288 |
| 3 | 3 | 59.5 | 65.1 | 5 / 35 | 4032 |
| 4 | 4 | 56.7 | 57.5 | 4 / 35 | 3645 |
| 5 | 2 | 61.5 | 69.2 | 9 / 35 | 4366 |
| 6 | 1 | 65.8 | 79.7 | 16 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 29% |
| cs.Wren 1.0 | 15 | 73% |
| js.PinBall 1.6 | 9 | 89% |
| mz.Cork 0.1 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 84 | 53% | 107 |
| cs.Wren 1.0 | 25 | 16% | 33 |
| js.PinBall 1.6 | 12 | 8% | 18 |
| evd.X1 0.01 | 11 | 7% | 12 |
| joe.ADinosaur 1.0 | 9 | 6% | 10 |
| mz.Cork 0.1 | 8 | 5% | 12 |
| PSW.Relentless 0.1 | 5 | 3% | 5 |
| jsal.Jsalbot 1.0 | 4 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.9 | 95 / 210 | 3.08 | 16.7% | 24824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.7% | 95 |
| ntc.Opposite 1.5 | 3.0 | 11.8% | 16 |
| stelo.AreaTargetingBot 1.1 | 3.0 | 11.7% | 42 |
| myl.nano.Graviton 1.10 | 4.2 | 11.2% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.7% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 10.2% | 8 |
| DBall.NUKE 0.1 | 7.3 | 8.6% | 11 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 6 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 3 |
| pbg.R2D2 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 74.0 | 15 / 35 | 3854 |
| 2 | 1 | 66.5 | 80.6 | 18 / 35 | 4260 |
| 3 | 1 | 61.0 | 67.6 | 13 / 35 | 3448 |
| 4 | 1 | 65.9 | 76.5 | 16 / 35 | 4672 |
| 5 | 1 | 67.0 | 85.1 | 18 / 35 | 4248 |
| 6 | 1 | 65.4 | 77.8 | 15 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 37% |
| myl.nano.Graviton 1.10 | 31 | 87% |
| ntc.Opposite 1.5 | 17 | 65% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| DBall.NUKE 0.1 | 12 | 75% |
| disan.Chair 2.2.0 | 11 | 100% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 37% | 54 |
| ntc.Opposite 1.5 | 20 | 17% | 30 |
| myl.nano.Graviton 1.10 | 15 | 13% | 43 |
| pfvicm.Sobieski 7.2.3b | 14 | 12% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 23 |
| DBall.NUKE 0.1 | 8 | 7% | 22 |
| disan.Chair 2.2.0 | 3 | 3% | 6 |
| donjezza.Muncho 1.0 | 2 | 2% | 7 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.1 | 78 / 210 | 3.96 | 14.2% | 21427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.2 | 15.4% | 50 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.6% | 48 |
| hadur117.micro.SaorOG1 0.1 | 2.8 | 14.2% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.3% | 14 |
| yagami.Tidus 0.11 | 4.5 | 12.5% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.5 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 70.2 | 17 / 35 | 3700 |
| 2 | 3 | 62.0 | 67.3 | 13 / 35 | 3254 |
| 3 | 3 | 63.1 | 70.8 | 11 / 35 | 3642 |
| 4 | 3 | 61.9 | 67.9 | 12 / 35 | 3422 |
| 5 | 3 | 61.5 | 65.1 | 13 / 35 | 3485 |
| 6 | 3 | 61.1 | 61.3 | 12 / 35 | 3924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 76% |
| kawigi.micro.Shiz 1.1 | 27 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 100% |
| yagami.Tidus 0.11 | 13 | 77% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 43% | 80 |
| kawigi.micro.Shiz 1.1 | 20 | 15% | 31 |
| yagami.Tidus 0.11 | 17 | 13% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 38 |
| ejb.Polaris 1.0.1 | 10 | 8% | 16 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.0 | 109 / 210 | 3.25 | 15.3% | 19453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.3% | 109 |
| wee.Gem 1.8.4 | 2.0 | 13.6% | 52 |
| wompi.Quokka 1.6 | 3.3 | 12.6% | 19 |
| bzdp.Pansy 2.1 | 3.8 | 12.1% | 12 |
| ratosh.Nobo 0.21 | 4.8 | 11.2% | 4 |
| m3thos.Eva00 1.1 | 6.3 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 3 |
| stelo.MyAgileRobot 0.2 | 8.7 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 76.5 | 16 / 35 | 3248 |
| 2 | 1 | 63.5 | 75.9 | 19 / 35 | 3421 |
| 3 | 1 | 64.4 | 78.7 | 20 / 35 | 3245 |
| 4 | 1 | 63.2 | 74.9 | 20 / 35 | 3297 |
| 5 | 1 | 63.4 | 76.8 | 19 / 35 | 2993 |
| 6 | 1 | 60.9 | 67.0 | 15 / 35 | 3249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 54 | 80% |
| bzdp.Pansy 2.1 | 31 | 94% |
| wompi.Quokka 1.6 | 25 | 80% |
| ratosh.Nobo 0.21 | 6 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| m3thos.Eva00 1.1 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 29 | 29% | 72 |
| wompi.Quokka 1.6 | 20 | 20% | 33 |
| bzdp.Pansy 2.1 | 16 | 16% | 43 |
| ratosh.Nobo 0.21 | 8 | 8% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 7% | 8 |
| m3thos.Eva00 1.1 | 6 | 6% | 11 |
| bayen.UbaMicro 1.4 | 5 | 5% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 7 |
| maribo.FollowFire 1 | 5 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 78.8 | 27 / 210 | 2.90 | 18.1% | 42699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 21.3% | 166 |
| hadur117.micro.SaorOG1 0.1 | 1.8 | 18.1% | 27 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 12 |
| ayk.WallHugger 1.0 | 4.2 | 10.5% | 1 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.9% | 3 |
| stuff.Vlad 0.1 | 5.5 | 9.1% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 79.0 | 2 / 35 | 7402 |
| 2 | 2 | 68.1 | 78.7 | 5 / 35 | 6357 |
| 3 | 2 | 70.7 | 84.1 | 5 / 35 | 7321 |
| 4 | 2 | 67.8 | 77.8 | 3 / 35 | 6886 |
| 5 | 2 | 65.8 | 65.7 | 3 / 35 | 6430 |
| 6 | 1 | 72.4 | 87.6 | 9 / 35 | 8303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 8% |
| mz.NanoGod 2.02 | 12 | 67% |
| ayk.WallHugger 1.0 | 5 | 100% |
| exauge.GateKeeper 1.1.121g | 5 | 80% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 138 | 75% | 147 |
| mz.NanoGod 2.02 | 25 | 14% | 32 |
| ayk.WallHugger 1.0 | 6 | 3% | 9 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 8 |
| stuff.Vlad 0.1 | 4 | 2% | 8 |
| drd.Dreadknoght 0.9 | 3 | 2% | 3 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 69.0 | 96 / 210 | 3.79 | 15.1% | 23342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.5 | 15.1% | 96 |
| voidious.micro.BlitzBat 1.05 | 1.7 | 13.6% | 36 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 17 |
| bvh.micro.Freya 0.3 | 4.3 | 11.6% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.1% | 15 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.8% | 11 |
| conscience.Electron 1.3g | 7.3 | 7.8% | 1 |
| dl.BetterWalls 1.0 | 8.2 | 6.8% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 65.7 | 15 / 35 | 3740 |
| 2 | 1 | 62.8 | 70.2 | 16 / 35 | 4110 |
| 3 | 1 | 65.5 | 81.3 | 21 / 35 | 3859 |
| 4 | 2 | 61.7 | 65.7 | 14 / 35 | 4033 |
| 5 | 3 | 58.8 | 59.7 | 11 / 35 | 3691 |
| 6 | 1 | 63.5 | 71.7 | 19 / 35 | 3909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 88% |
| dummy.micro.Sparrow 2.5 | 20 | 85% |
| bvh.micro.Freya 0.3 | 15 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 22% | 56 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 19% | 48 |
| conscience.Electron 1.3g | 18 | 16% | 21 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 33 |
| dl.BetterWalls 1.0 | 10 | 9% | 14 |
| stelo.MirrorMicro 1.0 | 10 | 9% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 9% | 12 |
| bvh.micro.Freya 0.3 | 7 | 6% | 13 |

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 78.8 | 117 / 210 | 2.90 | 18.6% | 34648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.6% | 117 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 16.6% | 32 |
| sul.Lunar 1.1 | 3.2 | 12.3% | 25 |
| supersample.SuperBoxBot 1.0 | 4.7 | 9.8% | 12 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.3% | 6 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.7% | 6 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.4% | 5 |
| sample.Corners 1.0 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.4 | 17 / 35 | 5817 |
| 2 | 1 | 70.3 | 85.4 | 22 / 35 | 6317 |
| 3 | 1 | 68.9 | 79.7 | 22 / 35 | 5898 |
| 4 | 1 | 65.0 | 67.9 | 17 / 35 | 5180 |
| 5 | 1 | 68.5 | 81.9 | 20 / 35 | 5704 |
| 6 | 1 | 68.3 | 78.7 | 19 / 35 | 5732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 57 | 84% |
| sul.Lunar 1.1 | 27 | 96% |
| supersample.SuperBoxBot 1.0 | 16 | 81% |
| dsw.StaticD 1.0 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 63% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 41 | 44% | 91 |
| supersample.SuperBoxBot 1.0 | 19 | 20% | 31 |
| dsw.StaticD 1.0 | 9 | 10% | 12 |
| sul.Lunar 1.1 | 8 | 9% | 35 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 6% | 12 |
| mme.NikeEnhanced 2.0 | 5 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 13 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 6 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.8 | 80 / 210 | 3.36 | 16.1% | 31040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.1% | 80 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.5 | 13.9% | 37 |
| mld.Wisdom 1.0 | 4.5 | 10.9% | 10 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.1% | 13 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 11 |
| sample.Walls 1.0 | 7.0 | 8.0% | 4 |
| GarmBox.Oranges 1.0 | 8.2 | 7.2% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.0 | 13 / 35 | 5266 |
| 2 | 1 | 64.5 | 72.1 | 16 / 35 | 5400 |
| 3 | 2 | 64.4 | 71.1 | 11 / 35 | 5231 |
| 4 | 1 | 64.9 | 75.2 | 12 / 35 | 5194 |
| 5 | 1 | 63.0 | 72.7 | 14 / 35 | 4634 |
| 6 | 1 | 65.9 | 77.5 | 14 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 56 | 71% |
| radnor.DoctorBob 1.42 | 34 | 32% |
| amz.NanoClone 1.41 | 9 | 89% |
| mld.Wisdom 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 37% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 27% | 78 |
| mld.Wisdom 1.0 | 15 | 12% | 26 |
| KiraNL.Chupacabra 0.4 | 13 | 10% | 16 |
| amz.NanoClone 1.41 | 12 | 9% | 18 |
| jangs.ns51 1.0 | 3 | 2% | 5 |
| sample.Walls 1.0 | 2 | 2% | 4 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

