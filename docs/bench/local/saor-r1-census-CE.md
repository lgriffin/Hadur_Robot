# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.8 | 140 / 210 | 2.10 | 20.6% | 41120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 20.6% | 140 |
| mz.AntiGrav 1.0 | 2.3 | 14.7% | 25 |
| radnor.DoctorBob 1.42 | 3.2 | 13.4% | 15 |
| mld.Infinity 2.2 | 3.7 | 13.3% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 6 |
| sample.Walls 1.0 | 6.5 | 7.0% | 3 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 1 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.9 | 23 / 35 | 6981 |
| 2 | 1 | 72.0 | 89.2 | 25 / 35 | 7087 |
| 3 | 1 | 71.4 | 89.8 | 25 / 35 | 6470 |
| 4 | 1 | 71.7 | 88.6 | 23 / 35 | 6995 |
| 5 | 1 | 70.3 | 84.1 | 19 / 35 | 6749 |
| 6 | 1 | 71.2 | 87.0 | 25 / 35 | 6838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 82 | 90% |
| mld.Infinity 2.2 | 34 | 97% |
| radnor.DoctorBob 1.42 | 23 | 78% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 35% | 57 |
| mz.AntiGrav 1.0 | 23 | 32% | 79 |
| amz.NanoClone 1.41 | 10 | 14% | 16 |
| mld.Infinity 2.2 | 4 | 6% | 37 |
| GarmBox.Oranges 1.0 | 4 | 6% | 4 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| jangs.ns51 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.4 | 103 / 210 | 2.85 | 17.6% | 31729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.3 | 17.6% | 103 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 58 |
| mld.DustBunny 3.8 | 2.5 | 13.8% | 22 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 4 |
| zyx.nano.Ant 1.1 | 5.3 | 9.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.3% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.2% | 11 |
| fullsail.SweetTea 1.1 | 7.8 | 6.7% | 4 |
| bzdp.BoxCar 2.0 | 8.5 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 21 / 35 | 5589 |
| 2 | 1 | 65.5 | 78.7 | 14 / 35 | 4912 |
| 3 | 1 | 66.4 | 80.3 | 20 / 35 | 5017 |
| 4 | 3 | 60.9 | 57.1 | 6 / 35 | 5034 |
| 5 | 1 | 69.9 | 88.9 | 23 / 35 | 5779 |
| 6 | 1 | 68.1 | 84.8 | 19 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 75% |
| mld.DustBunny 3.8 | 39 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| maribo.melee.BMV 0.1 | 4 | 50% |

Hadur died in 107 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 27% | 73 |
| mld.DustBunny 3.8 | 23 | 21% | 56 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 13% | 22 |
| zyx.nano.Ant 1.1 | 10 | 9% | 15 |
| maribo.melee.BMV 0.1 | 9 | 8% | 10 |
| djdjdj.NanoSkunk10 1.0 | 7 | 7% | 14 |
| cs.Grudge 1.0 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 6 | 6% | 10 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 76.1 | 107 / 210 | 3.15 | 18.0% | 34993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 18.0% | 107 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.6% | 18 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 13 |
| fm.mammillarias 1.3 | 5.3 | 9.7% | 6 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.8% | 3 |
| sample.Fire 1.0 | 9.0 | 5.4% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 74.0 | 19 / 35 | 6252 |
| 2 | 1 | 67.4 | 75.6 | 19 / 35 | 5672 |
| 3 | 1 | 64.7 | 69.2 | 13 / 35 | 5398 |
| 4 | 1 | 68.1 | 77.1 | 16 / 35 | 6373 |
| 5 | 1 | 69.1 | 82.2 | 21 / 35 | 5973 |
| 6 | 1 | 67.1 | 78.4 | 19 / 35 | 5325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 88% |
| myl.nano.KomoriNinja 1.1 | 16 | 81% |
| cb.nano.Insomnia 1.0 | 15 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 23% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 21% | 41 |
| myl.nano.KomoriNinja 1.1 | 16 | 16% | 37 |
| fm.mammillarias 1.3 | 16 | 16% | 24 |
| cb.nano.Insomnia 1.0 | 13 | 13% | 14 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 9 |
| sample.Fire 1.0 | 3 | 3% | 6 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 9 |

## Melee bench: F04

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.8 | 124 / 210 | 2.28 | 20.0% | 38984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 20.0% | 124 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.9% | 21 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.0% | 12 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 9.1% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.3% | 8 |
| yk.JahMicro 1.0 | 7.2 | 8.0% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.2 | 23 / 35 | 6829 |
| 2 | 1 | 70.2 | 85.4 | 24 / 35 | 6570 |
| 3 | 1 | 67.6 | 80.3 | 15 / 35 | 6176 |
| 4 | 1 | 70.1 | 88.9 | 25 / 35 | 6154 |
| 5 | 1 | 69.9 | 88.3 | 21 / 35 | 6287 |
| 6 | 1 | 68.9 | 81.6 | 16 / 35 | 6968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 46 | 89% |
| stelo.SoJNanoMelee 1.1 | 36 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 79% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| tj.zombie1n 1.0.1 | 10 | 60% |
| yk.JahMicro 1.0 | 8 | 88% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 35% | 72 |
| stelo.SoJNanoMelee 1.1 | 22 | 26% | 44 |
| tj.zombie1n 1.0.1 | 12 | 14% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 9% | 27 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 17 |
| repositorio.NanoStep 1.0 | 4 | 5% | 11 |
| yk.JahMicro 1.0 | 3 | 3% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 3% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.5 | 80 / 210 | 3.74 | 15.5% | 29079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 15.5% | 80 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 25 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 32 |
| sam.Samspin 1.0 | 5.8 | 9.9% | 12 |
| EBBU.Sim2 1.02 | 6.5 | 9.3% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 9.2% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 69.5 | 13 / 35 | 4701 |
| 2 | 1 | 62.5 | 66.0 | 14 / 35 | 4963 |
| 3 | 1 | 61.9 | 66.3 | 12 / 35 | 4621 |
| 4 | 1 | 64.9 | 74.3 | 15 / 35 | 5005 |
| 5 | 1 | 61.0 | 65.7 | 13 / 35 | 4338 |
| 6 | 1 | 65.1 | 75.2 | 13 / 35 | 5451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 52% |
| simonton.nano.MeleeSeed 1.8 | 26 | 81% |
| ahf.NanoAndrew .4 | 15 | 73% |
| EBBU.Sim2 1.02 | 14 | 86% |
| sam.Samspin 1.0 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 18% | 38 |
| ahf.NanoAndrew .4 | 20 | 15% | 33 |
| robar.nano.Assertive_Melee 0.2 | 18 | 14% | 20 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 24 |
| EBBU.Sim2 1.02 | 14 | 11% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 12 |
| simonton.nano.MeleeSeed 1.8 | 12 | 9% | 34 |
| sam.Samspin 1.0 | 9 | 7% | 18 |
| sample.TrackFire 1.0 | 6 | 5% | 8 |

## Melee bench: F06

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.2 | 134 / 210 | 2.33 | 19.1% | 32784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 19.1% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 26 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.3% | 17 |
| fm.claire 1.7 | 5.5 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.3% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.6% | 9 |
| sample.SpinBot 1.0 | 7.7 | 7.4% | 3 |
| pa.Improved 1.0 | 9.3 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.3 | 24 / 35 | 5872 |
| 2 | 1 | 69.4 | 87.0 | 25 / 35 | 5528 |
| 3 | 1 | 68.0 | 83.2 | 21 / 35 | 5300 |
| 4 | 1 | 68.2 | 85.7 | 21 / 35 | 5040 |
| 5 | 1 | 69.4 | 86.3 | 22 / 35 | 5786 |
| 6 | 1 | 67.4 | 82.5 | 21 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 85% |
| oog.melee.CapuletDroid 1.1 | 32 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 89% |
| arthord.NanoSatanMelee Beta | 16 | 94% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 34% | 74 |
| oog.melee.CapuletDroid 1.1 | 15 | 19% | 47 |
| fm.claire 1.7 | 11 | 14% | 16 |
| gh.nano.Grofvuil 0.2 | 9 | 11% | 28 |
| sample.SpinBot 1.0 | 7 | 9% | 9 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 0 | 0% | 6 |

## Melee bench: F07

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.6 | 92 / 210 | 2.74 | 17.8% | 34298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.2 | 17.8% | 92 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.4% | 36 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.4% | 39 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 36 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.5 | 5.8% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 67.6 | 13 / 35 | 5164 |
| 2 | 1 | 67.1 | 80.0 | 14 / 35 | 5493 |
| 3 | 1 | 68.2 | 84.4 | 17 / 35 | 5781 |
| 4 | 1 | 68.2 | 82.9 | 15 / 35 | 6009 |
| 5 | 1 | 67.5 | 82.5 | 14 / 35 | 5470 |
| 6 | 1 | 69.5 | 86.3 | 19 / 35 | 6381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 79% |
| mz.MicroGodMelee 1 | 32 | 53% |
| gh.micro.Gruweltje 0.7 | 24 | 79% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 27% | 47 |
| spinnercat.micro.Tyger 0.1 | 31 | 26% | 60 |
| gh.micro.Gruweltje 0.7 | 27 | 23% | 49 |
| acogdev.alpha 0.2 | 9 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 10 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 8 |
| fire219.CatBot 1.0 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| el.JumpShoot 0.2 | 2 | 2% | 8 |

## Melee bench: F08

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.9 | 103 / 210 | 3.53 | 16.4% | 30552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.2 | 16.4% | 103 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 28 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.7% | 13 |
| germ.TheMind .2 | 5.5 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.6% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 4 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 3 |
| sample.Crazy 1.0 | 9.0 | 6.8% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 66.0 | 16 / 35 | 4912 |
| 2 | 1 | 65.9 | 74.3 | 20 / 35 | 5220 |
| 3 | 2 | 61.0 | 63.8 | 11 / 35 | 4638 |
| 4 | 1 | 66.0 | 75.9 | 18 / 35 | 5046 |
| 5 | 1 | 67.3 | 77.5 | 21 / 35 | 5498 |
| 6 | 1 | 65.1 | 73.7 | 17 / 35 | 5238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 79% |
| awesomeness.Elite 1.0 | 8 | 75% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 60% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 31 | 29% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 20% | 34 |
| germ.TheMind .2 | 20 | 19% | 30 |
| awesomeness.Elite 1.0 | 10 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 15 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 2 | 2% | 10 |

## Melee bench: F09

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.0 | 133 / 210 | 2.35 | 18.9% | 30103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 18.9% | 133 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.7% | 9 |
| maribo.IotaCT 1.1 | 3.8 | 10.8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 3 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.1% | 11 |
| stelo.PatternRobot 1.0 | 6.8 | 8.8% | 16 |
| ratosh.Wesco 1.4 | 7.7 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.5 | 24 / 35 | 4902 |
| 2 | 1 | 65.6 | 76.5 | 18 / 35 | 4833 |
| 3 | 1 | 70.0 | 86.0 | 24 / 35 | 5365 |
| 4 | 1 | 70.1 | 90.2 | 21 / 35 | 4970 |
| 5 | 1 | 69.0 | 87.3 | 21 / 35 | 5296 |
| 6 | 1 | 69.4 | 86.7 | 25 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 59 | 95% |
| nz.jdc.nano.GridFu 1.0 | 30 | 97% |
| stelo.PatternRobot 1.0 | 19 | 74% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 91% |
| maribo.IotaCT 1.1 | 11 | 91% |
| spinnercat.Omen 1.0 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 25% |
| ratosh.Wesco 1.4 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 21 | 27% | 30 |
| timmit.nano.TimDog 0.33 | 16 | 21% | 23 |
| rz.HawkOnFire 0.1 | 14 | 18% | 62 |
| ratosh.Wesco 1.4 | 10 | 13% | 18 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 8 |
| maribo.IotaCT 1.1 | 2 | 3% | 18 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 9 |

## Melee bench: F10

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.9 | 155 / 210 | 2.18 | 20.3% | 37662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 20.3% | 155 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.6% | 22 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.0% | 3 |
| baal.nano.N 1.42 | 4.0 | 10.6% | 9 |
| zyx.micro.Ant 1.1 | 5.3 | 9.4% | 13 |
| sanja.First 0.1 | 5.5 | 8.9% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.2% | 4 |
| cvt.Firsty 1.0 | 8.0 | 7.7% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.3 | 26 / 35 | 6375 |
| 2 | 1 | 69.9 | 87.6 | 28 / 35 | 6145 |
| 3 | 1 | 69.8 | 88.6 | 28 / 35 | 5837 |
| 4 | 1 | 70.8 | 89.2 | 25 / 35 | 6540 |
| 5 | 1 | 69.4 | 83.8 | 23 / 35 | 6472 |
| 6 | 1 | 69.8 | 86.0 | 25 / 35 | 6293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 90% |
| sanja.First 0.1 | 29 | 100% |
| cvt.Firsty 1.0 | 27 | 96% |
| zyx.micro.Ant 1.1 | 22 | 86% |
| baal.nano.N 1.42 | 19 | 84% |
| Grystrion.TrackerWO 1.0 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 32% | 38 |
| tvv.nano.Polaris 1.2 | 10 | 18% | 49 |
| baal.nano.N 1.42 | 10 | 18% | 27 |
| cvt.Firsty 1.0 | 4 | 7% | 27 |
| squidM.TentalceMeleeNano 1.1 | 4 | 7% | 9 |
| sanja.First 0.1 | 3 | 5% | 27 |
| Grystrion.TrackerWO 1.0 | 3 | 5% | 20 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 7 |
| sample.RamFire 1.0 | 2 | 4% | 3 |

## Melee bench: F11

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.6 | 74 / 210 | 3.91 | 15.2% | 29891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.9% | 74 |
| hadur117.micro.SaorCE 0.1 | 2.0 | 15.2% | 74 |
| cs.Wren 1.0 | 2.7 | 13.3% | 24 |
| mz.Cork 0.1 | 4.5 | 11.2% | 13 |
| js.PinBall 1.6 | 4.5 | 11.5% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 8.8% | 4 |
| evd.X1 0.01 | 7.0 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 65.1 | 12 / 35 | 5191 |
| 2 | 2 | 65.9 | 74.6 | 13 / 35 | 5518 |
| 3 | 2 | 62.9 | 67.6 | 15 / 35 | 4745 |
| 4 | 2 | 62.0 | 64.4 | 12 / 35 | 4962 |
| 5 | 2 | 62.4 | 66.7 | 12 / 35 | 4786 |
| 6 | 2 | 61.9 | 67.3 | 10 / 35 | 4689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 67% |
| cs.Wren 1.0 | 27 | 78% |
| mz.Cork 0.1 | 10 | 80% |
| js.PinBall 1.6 | 8 | 63% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 36% | 92 |
| cs.Wren 1.0 | 22 | 16% | 36 |
| evd.X1 0.01 | 19 | 14% | 21 |
| joe.ADinosaur 1.0 | 16 | 12% | 17 |
| mz.Cork 0.1 | 11 | 8% | 15 |
| js.PinBall 1.6 | 9 | 7% | 14 |
| jsal.Jsalbot 1.0 | 5 | 4% | 7 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.9 | 126 / 210 | 2.63 | 18.4% | 29652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 18.4% | 126 |
| ntc.Opposite 1.5 | 2.8 | 11.6% | 9 |
| myl.nano.Graviton 1.10 | 3.2 | 11.4% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.6% | 19 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.2% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.7% | 11 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 6 |
| donjezza.Muncho 1.0 | 9.5 | 5.7% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 18 / 35 | 4927 |
| 2 | 1 | 67.9 | 82.5 | 23 / 35 | 5023 |
| 3 | 1 | 67.6 | 82.5 | 20 / 35 | 5055 |
| 4 | 1 | 66.2 | 77.1 | 19 / 35 | 4930 |
| 5 | 1 | 67.9 | 83.8 | 22 / 35 | 4746 |
| 6 | 1 | 68.8 | 86.3 | 24 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 33 | 88% |
| myl.nano.Graviton 1.10 | 32 | 88% |
| ntc.Opposite 1.5 | 22 | 86% |
| donjezza.Muncho 1.0 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| DBall.NUKE 0.1 | 9 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 20% | 31 |
| stelo.AreaTargetingBot 1.1 | 14 | 16% | 38 |
| myl.nano.Graviton 1.10 | 14 | 16% | 36 |
| ntc.Opposite 1.5 | 13 | 15% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 12% | 21 |
| disan.Chair 2.2.0 | 9 | 10% | 19 |
| pbg.R2D2 1.0 | 5 | 6% | 7 |
| donjezza.Muncho 1.0 | 2 | 2% | 10 |
| DBall.NUKE 0.1 | 1 | 1% | 13 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.6 | 68 / 210 | 3.74 | 15.2% | 26453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.7 | 15.2% | 68 |
| kawigi.micro.Shiz 1.1 | 1.7 | 14.8% | 53 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 45 |
| yagami.Tidus 0.11 | 4.3 | 12.1% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.0% | 15 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 14 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 69.2 | 13 / 35 | 4787 |
| 2 | 2 | 64.3 | 70.8 | 13 / 35 | 4577 |
| 3 | 2 | 62.1 | 70.2 | 9 / 35 | 3720 |
| 4 | 1 | 63.3 | 71.1 | 13 / 35 | 4369 |
| 5 | 1 | 64.6 | 72.4 | 12 / 35 | 4801 |
| 6 | 3 | 61.9 | 63.8 | 8 / 35 | 4199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 27 | 93% |
| yagami.Tidus 0.11 | 20 | 80% |
| oog.melee.Capulet 1.2 | 19 | 58% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 76% |
| ejb.Polaris 1.0.1 | 4 | 75% |

Hadur died in 142 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 32% | 60 |
| yagami.Tidus 0.11 | 29 | 20% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 15% | 35 |
| kawigi.micro.Shiz 1.1 | 16 | 11% | 35 |
| ejb.Polaris 1.0.1 | 16 | 11% | 21 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.4 | 124 / 210 | 2.94 | 17.2% | 27146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 17.2% | 124 |
| wompi.Quokka 1.6 | 3.0 | 11.7% | 19 |
| wee.Gem 1.8.4 | 3.3 | 11.7% | 24 |
| bzdp.Pansy 2.1 | 3.7 | 11.2% | 15 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 9.3% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.3% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 78.4 | 18 / 35 | 4229 |
| 2 | 1 | 67.4 | 83.2 | 24 / 35 | 4713 |
| 3 | 1 | 65.9 | 80.3 | 22 / 35 | 4384 |
| 4 | 1 | 63.8 | 69.8 | 17 / 35 | 4643 |
| 5 | 1 | 65.5 | 79.4 | 22 / 35 | 4277 |
| 6 | 1 | 66.6 | 79.4 | 21 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 37 | 100% |
| wee.Gem 1.8.4 | 32 | 97% |
| wompi.Quokka 1.6 | 26 | 88% |
| m3thos.Eva00 1.1 | 13 | 92% |
| ratosh.Nobo 0.21 | 12 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 80% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 16 | 19% | 26 |
| ratosh.Nobo 0.21 | 12 | 14% | 22 |
| maribo.FollowFire 1 | 11 | 13% | 12 |
| bayen.UbaMicro 1.4 | 10 | 12% | 15 |
| stelo.MyAgileRobot 0.2 | 10 | 12% | 15 |
| wee.Gem 1.8.4 | 9 | 10% | 45 |
| bzdp.Pansy 2.1 | 7 | 8% | 46 |
| m3thos.Eva00 1.1 | 6 | 7% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.3 | 131 / 210 | 1.97 | 21.6% | 46775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 21.6% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 18 |
| ayk.WallHugger 1.0 | 4.8 | 9.1% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.1% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.9% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.0 | 24 / 35 | 7886 |
| 2 | 1 | 71.7 | 87.3 | 18 / 35 | 7522 |
| 3 | 1 | 72.6 | 86.3 | 23 / 35 | 7921 |
| 4 | 1 | 72.5 | 87.9 | 24 / 35 | 7564 |
| 5 | 1 | 72.3 | 87.9 | 19 / 35 | 7500 |
| 6 | 1 | 73.9 | 93.0 | 23 / 35 | 8382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 80% |
| exauge.GateKeeper 1.1.121g | 15 | 87% |
| mz.NanoGod 2.02 | 15 | 53% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 46% | 129 |
| mz.NanoGod 2.02 | 27 | 34% | 41 |
| exauge.GateKeeper 1.1.121g | 8 | 10% | 15 |
| stuff.Vlad 0.1 | 4 | 5% | 7 |
| ayk.WallHugger 1.0 | 3 | 4% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 7 |

## Melee bench: F16

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.3 | 96 / 210 | 3.59 | 16.1% | 28275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 16.1% | 96 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.7% | 23 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 26 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 20 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.8% | 14 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 3 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 2 |
| ap.Frederick 1.1 | 8.8 | 6.7% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.1 | 23 / 35 | 4853 |
| 2 | 1 | 62.9 | 67.6 | 14 / 35 | 4992 |
| 3 | 1 | 64.1 | 70.8 | 15 / 35 | 5121 |
| 4 | 1 | 59.8 | 59.7 | 13 / 35 | 4098 |
| 5 | 1 | 65.4 | 76.5 | 18 / 35 | 4671 |
| 6 | 1 | 62.6 | 67.9 | 13 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 85% |
| dummy.micro.Sparrow 2.5 | 27 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 72% |
| bvh.micro.Freya 0.3 | 18 | 72% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 17% | 52 |
| conscience.Electron 1.3g | 20 | 17% | 24 |
| dummy.micro.Sparrow 2.5 | 18 | 16% | 46 |
| bvh.micro.Freya 0.3 | 15 | 13% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 13% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 11% | 28 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 12 |
| dl.BetterWalls 1.0 | 6 | 5% | 11 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.5 | 145 / 210 | 2.13 | 21.0% | 42657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 21.0% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 26 |
| sul.Lunar 1.1 | 3.2 | 11.4% | 11 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 12 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.7% | 1 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.6% | 5 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 3 |
| sample.Corners 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.9 | 22 / 35 | 6688 |
| 2 | 1 | 69.0 | 79.0 | 22 / 35 | 6556 |
| 3 | 1 | 72.4 | 91.7 | 26 / 35 | 7523 |
| 4 | 1 | 73.0 | 94.6 | 30 / 35 | 7432 |
| 5 | 1 | 70.6 | 85.4 | 21 / 35 | 7093 |
| 6 | 1 | 71.1 | 86.0 | 24 / 35 | 7365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 88% |
| sul.Lunar 1.1 | 48 | 96% |
| supersample.SuperBoxBot 1.0 | 22 | 100% |
| dsw.StaticD 1.0 | 12 | 75% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 80% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 34% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 25% | 51 |
| dsw.StaticD 1.0 | 7 | 11% | 18 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 13 |
| sul.Lunar 1.1 | 4 | 6% | 50 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 12 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 10 |
| sample.Corners 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorCE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.0 | 110 / 210 | 2.89 | 18.0% | 36590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCE 0.1 | 1.0 | 18.0% | 110 |
| mld.Wisdom 1.0 | 2.5 | 13.0% | 27 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.4% | 27 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.0% | 6 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 13 |
| sample.Walls 1.0 | 7.2 | 8.4% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 18 / 35 | 6382 |
| 2 | 1 | 70.1 | 87.3 | 22 / 35 | 6774 |
| 3 | 1 | 69.8 | 86.7 | 24 / 35 | 6503 |
| 4 | 1 | 66.3 | 74.6 | 16 / 35 | 6110 |
| 5 | 1 | 63.1 | 68.9 | 12 / 35 | 5191 |
| 6 | 1 | 65.8 | 75.2 | 18 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 83% |
| radnor.DoctorBob 1.42 | 34 | 85% |
| mld.Wisdom 1.0 | 30 | 67% |
| sample.Walls 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 36% | 62 |
| radnor.DoctorBob 1.42 | 16 | 16% | 51 |
| KiraNL.Chupacabra 0.4 | 14 | 14% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 13% | 41 |
| amz.NanoClone 1.41 | 11 | 11% | 14 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| jangs.ns51 1.0 | 3 | 3% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

