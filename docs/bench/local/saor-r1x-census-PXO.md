# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.1 | 125 / 210 | 2.61 | 19.0% | 38632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 19.0% | 125 |
| mz.AntiGrav 1.0 | 2.3 | 14.7% | 27 |
| radnor.DoctorBob 1.42 | 3.0 | 14.5% | 28 |
| mld.Infinity 2.2 | 3.7 | 13.4% | 20 |
| amz.NanoClone 1.41 | 5.2 | 9.9% | 7 |
| sample.Walls 1.0 | 6.2 | 7.7% | 1 |
| GarmBox.Oranges 1.0 | 6.7 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.0 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 0 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.7 | 18 / 35 | 6109 |
| 2 | 1 | 70.5 | 83.2 | 24 / 35 | 6986 |
| 3 | 1 | 69.3 | 81.0 | 20 / 35 | 6431 |
| 4 | 1 | 66.7 | 74.0 | 18 / 35 | 5853 |
| 5 | 1 | 69.9 | 86.3 | 21 / 35 | 6292 |
| 6 | 1 | 71.2 | 88.6 | 24 / 35 | 6961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 86% |
| mld.Infinity 2.2 | 34 | 91% |
| radnor.DoctorBob 1.42 | 29 | 79% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 26 | 30% | 73 |
| radnor.DoctorBob 1.42 | 22 | 26% | 50 |
| mld.Infinity 2.2 | 12 | 14% | 40 |
| sample.Walls 1.0 | 11 | 13% | 18 |
| amz.NanoClone 1.41 | 9 | 10% | 13 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 9 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.6 | 113 / 210 | 2.12 | 18.3% | 30924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 18.3% | 113 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 55 |
| mld.DustBunny 3.8 | 2.8 | 14.1% | 28 |
| maribo.melee.BMV 0.1 | 4.5 | 10.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.5% | 9 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| bzdp.BoxCar 2.0 | 7.8 | 6.6% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.0% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.5 | 23 / 35 | 5151 |
| 2 | 1 | 67.8 | 86.7 | 20 / 35 | 5346 |
| 3 | 1 | 67.1 | 87.0 | 14 / 35 | 4863 |
| 4 | 1 | 68.5 | 90.8 | 20 / 35 | 4958 |
| 5 | 1 | 68.0 | 87.0 | 20 / 35 | 5342 |
| 6 | 1 | 67.2 | 84.4 | 16 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 57 | 77% |
| oog.melee.Mercutio 1.0 | 55 | 69% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 69% |
| djdjdj.NanoSkunk10 1.0 | 12 | 100% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 98 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 34 | 35% | 74 |
| oog.melee.Mercutio 1.0 | 33 | 34% | 78 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 12% | 15 |
| maribo.melee.BMV 0.1 | 6 | 6% | 9 |
| zyx.nano.Ant 1.1 | 6 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 16 |
| fullsail.SweetTea 1.1 | 3 | 3% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.4 | 95 / 210 | 3.30 | 16.6% | 31070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 16.6% | 95 |
| myl.micro.Troodon 1.10 | 2.0 | 15.3% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 12.0% | 23 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.5% | 11 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.3% | 7 |
| fm.mammillarias 1.3 | 5.8 | 10.1% | 9 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.5% | 3 |
| sample.Fire 1.0 | 9.0 | 4.7% | 1 |
| sample.Tracker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 73.3 | 12 / 35 | 4773 |
| 2 | 1 | 65.1 | 72.4 | 15 / 35 | 5228 |
| 3 | 1 | 65.9 | 74.0 | 15 / 35 | 5425 |
| 4 | 1 | 66.5 | 78.7 | 18 / 35 | 5110 |
| 5 | 1 | 64.9 | 72.4 | 16 / 35 | 5221 |
| 6 | 1 | 66.4 | 75.9 | 19 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 39 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 79% |
| cb.nano.Insomnia 1.0 | 15 | 87% |
| myl.nano.KomoriNinja 1.1 | 9 | 67% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Tracker 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 32% | 79 |
| fm.mammillarias 1.3 | 33 | 29% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 23% | 42 |
| cb.nano.Insomnia 1.0 | 10 | 9% | 13 |
| myl.nano.KomoriNinja 1.1 | 5 | 4% | 21 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 10 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.9 | 131 / 210 | 2.54 | 19.0% | 36919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.2 | 19.0% | 131 |
| kawigi.nano.Lib 1.0 | 1.8 | 14.8% | 29 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.6% | 14 |
| stelo.SoJNanoMelee 1.1 | 3.8 | 10.8% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.1% | 2 |
| tj.zombie1n 1.0.1 | 5.7 | 9.2% | 5 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.2% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 75.2 | 21 / 35 | 5218 |
| 2 | 1 | 69.0 | 84.1 | 21 / 35 | 6482 |
| 3 | 1 | 69.4 | 83.8 | 22 / 35 | 6668 |
| 4 | 1 | 70.4 | 88.6 | 26 / 35 | 6399 |
| 5 | 1 | 68.9 | 86.0 | 21 / 35 | 6070 |
| 6 | 1 | 67.8 | 79.7 | 20 / 35 | 6082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 97% |
| stelo.SoJNanoMelee 1.1 | 35 | 86% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| yk.JahMicro 1.0 | 9 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| tj.zombie1n 1.0.1 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 59% | 107 |
| stelo.SoJNanoMelee 1.1 | 11 | 14% | 27 |
| tvv.micro.Antares 1.1.1 | 9 | 11% | 23 |
| tj.zombie1n 1.0.1 | 5 | 6% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 5% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 14 |
| yk.JahMicro 1.0 | 1 | 1% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.9 | 95 / 210 | 2.99 | 16.6% | 29083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 16.6% | 95 |
| oog.melee.Corsair 1.0 | 2.5 | 12.7% | 33 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 12.1% | 31 |
| ahf.NanoAndrew .4 | 3.5 | 11.6% | 24 |
| sam.Samspin 1.0 | 6.3 | 9.3% | 10 |
| EBBU.Sim2 1.02 | 6.5 | 9.2% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.0% | 2 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.6% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 72.1 | 14 / 35 | 4593 |
| 2 | 1 | 63.9 | 75.6 | 14 / 35 | 4724 |
| 3 | 1 | 65.4 | 81.9 | 16 / 35 | 4697 |
| 4 | 1 | 65.4 | 78.7 | 16 / 35 | 5090 |
| 5 | 1 | 64.7 | 78.4 | 15 / 35 | 4819 |
| 6 | 1 | 66.4 | 80.6 | 20 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 37 | 65% |
| simonton.nano.MeleeSeed 1.8 | 30 | 90% |
| ahf.NanoAndrew .4 | 22 | 68% |
| EBBU.Sim2 1.02 | 10 | 60% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| sam.Samspin 1.0 | 7 | 86% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 21% | 50 |
| robar.nano.Assertive_Melee 0.2 | 23 | 20% | 30 |
| ahf.NanoAndrew .4 | 20 | 17% | 40 |
| oog.melee.Corsair 1.0 | 18 | 16% | 39 |
| EBBU.Sim2 1.02 | 14 | 12% | 20 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 13 |
| sam.Samspin 1.0 | 5 | 4% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 3% | 3 |
| sample.TrackFire 1.0 | 1 | 1% | 4 |

## Melee bench: F06

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.4 | 123 / 210 | 2.49 | 18.0% | 29629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 18.0% | 123 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.7% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 6 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.0% | 5 |
| fm.claire 1.7 | 6.0 | 8.7% | 4 |
| sample.SpinBot 1.0 | 8.2 | 7.3% | 7 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 77.8 | 15 / 35 | 4560 |
| 2 | 1 | 69.3 | 89.8 | 26 / 35 | 5107 |
| 3 | 1 | 65.9 | 78.7 | 18 / 35 | 4988 |
| 4 | 1 | 68.7 | 87.9 | 23 / 35 | 5145 |
| 5 | 1 | 67.1 | 81.9 | 20 / 35 | 5104 |
| 6 | 1 | 66.9 | 84.4 | 21 / 35 | 4725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 86% |
| oog.melee.CapuletDroid 1.1 | 27 | 96% |
| gh.nano.Grofvuil 0.2 | 16 | 75% |
| arthord.NanoSatanMelee Beta | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| fm.claire 1.7 | 5 | 80% |
| sample.SpinBot 1.0 | 5 | 80% |
| pa.Improved 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 35% | 81 |
| gh.nano.Grofvuil 0.2 | 16 | 18% | 32 |
| arthord.NanoSatanMelee Beta | 10 | 11% | 21 |
| sample.SpinBot 1.0 | 10 | 11% | 13 |
| fm.claire 1.7 | 9 | 10% | 11 |
| oog.melee.CapuletDroid 1.1 | 4 | 4% | 31 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 9 |
| pa.Improved 1.0 | 2 | 2% | 7 |
| kurios.DOSexe .9b | 2 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.7 | 91 / 210 | 2.56 | 17.3% | 30716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 17.3% | 91 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.7% | 35 |
| gh.micro.Gruweltje 0.7 | 3.0 | 14.6% | 38 |
| mz.MicroGodMelee 1 | 3.3 | 13.8% | 34 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.1% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 2 |
| fire219.CatBot 1.0 | 8.7 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.6% | 3 |
| acogdev.alpha 0.2 | 9.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.9 | 16 / 35 | 5262 |
| 2 | 1 | 65.9 | 81.0 | 11 / 35 | 5183 |
| 3 | 1 | 67.2 | 85.1 | 16 / 35 | 4937 |
| 4 | 1 | 65.1 | 78.1 | 15 / 35 | 4835 |
| 5 | 1 | 66.9 | 83.5 | 13 / 35 | 5167 |
| 6 | 1 | 68.0 | 86.7 | 20 / 35 | 5332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 82% |
| mz.MicroGodMelee 1 | 39 | 62% |
| gh.micro.Gruweltje 0.7 | 24 | 54% |
| DBall.Anarchy 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 34% | 66 |
| mz.MicroGodMelee 1 | 31 | 26% | 58 |
| gh.micro.Gruweltje 0.7 | 30 | 25% | 48 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 13 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 9 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.7 | 95 / 210 | 3.28 | 16.3% | 30460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.3 | 16.3% | 95 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.7% | 47 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.9% | 24 |
| germ.TheMind .2 | 4.8 | 9.4% | 14 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 2 |
| awesomeness.Elite 1.0 | 6.5 | 8.9% | 11 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 10 |
| sample.Crazy 1.0 | 9.0 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.0 | 20 / 35 | 4997 |
| 2 | 2 | 62.8 | 69.5 | 14 / 35 | 4975 |
| 3 | 1 | 67.6 | 82.9 | 20 / 35 | 5493 |
| 4 | 1 | 63.8 | 71.4 | 15 / 35 | 5141 |
| 5 | 2 | 60.9 | 64.4 | 13 / 35 | 4517 |
| 6 | 1 | 66.0 | 80.0 | 13 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| awesomeness.Elite 1.0 | 10 | 50% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 37% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 23% | 37 |
| germ.TheMind .2 | 19 | 17% | 26 |
| awesomeness.Elite 1.0 | 10 | 9% | 18 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.5 | 117 / 210 | 2.66 | 17.9% | 28747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 17.9% | 117 |
| rz.HawkOnFire 0.1 | 2.3 | 14.2% | 31 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.9% | 19 |
| maribo.IotaCT 1.1 | 4.2 | 10.7% | 7 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.5% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 1 |
| spinnercat.Omen 1.0 | 7.3 | 8.3% | 6 |
| ratosh.Wesco 1.4 | 7.5 | 8.3% | 7 |
| stelo.PatternRobot 1.0 | 8.0 | 8.0% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 24 / 35 | 5295 |
| 2 | 1 | 65.4 | 74.0 | 18 / 35 | 4436 |
| 3 | 1 | 66.9 | 80.3 | 16 / 35 | 4728 |
| 4 | 1 | 65.4 | 75.2 | 16 / 35 | 4534 |
| 5 | 1 | 68.7 | 85.7 | 22 / 35 | 4746 |
| 6 | 1 | 68.1 | 82.5 | 21 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 85% |
| nz.jdc.nano.GridFu 1.0 | 32 | 97% |
| stelo.PatternRobot 1.0 | 14 | 71% |
| maribo.IotaCT 1.1 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 50% |
| ratosh.Wesco 1.4 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 28 | 30% | 67 |
| stelo.PatternRobot 1.0 | 15 | 16% | 22 |
| timmit.nano.TimDog 0.33 | 13 | 14% | 18 |
| ratosh.Wesco 1.4 | 11 | 12% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 12% | 12 |
| nz.jdc.nano.GridFu 1.0 | 8 | 9% | 46 |
| maribo.IotaCT 1.1 | 5 | 5% | 22 |
| spinnercat.Omen 1.0 | 2 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.7 | 158 / 210 | 1.66 | 21.0% | 38677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 21.0% | 158 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.6% | 12 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 7 |
| zyx.micro.Ant 1.1 | 4.2 | 10.1% | 16 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.5% | 4 |
| sanja.First 0.1 | 6.8 | 8.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.3% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.5% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 25 / 35 | 6217 |
| 2 | 1 | 69.3 | 88.9 | 22 / 35 | 6121 |
| 3 | 1 | 70.3 | 92.7 | 26 / 35 | 6030 |
| 4 | 1 | 71.4 | 93.0 | 27 / 35 | 6814 |
| 5 | 1 | 71.6 | 94.3 | 29 / 35 | 6610 |
| 6 | 1 | 72.0 | 96.2 | 29 / 35 | 6885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 33 | 91% |
| cvt.Firsty 1.0 | 33 | 91% |
| tvv.nano.Polaris 1.2 | 29 | 93% |
| sanja.First 0.1 | 23 | 91% |
| zyx.micro.Ant 1.1 | 19 | 74% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 2 | 50% |

Hadur died in 53 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 30 | 57% | 56 |
| cvt.Firsty 1.0 | 5 | 9% | 30 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 21 |
| sanja.First 0.1 | 4 | 8% | 23 |
| baal.nano.N 1.42 | 3 | 6% | 27 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 14 |
| tvv.nano.Polaris 1.2 | 2 | 4% | 34 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 74.9 | 85 / 210 | 3.26 | 16.3% | 31802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.3 | 16.3% | 85 |
| kc.micro.Figment 1.0 | 1.7 | 16.0% | 67 |
| cs.Wren 1.0 | 3.0 | 12.8% | 26 |
| js.PinBall 1.6 | 4.3 | 10.7% | 12 |
| mz.Cork 0.1 | 4.8 | 10.3% | 9 |
| joe.ADinosaur 1.0 | 5.8 | 9.1% | 3 |
| evd.X1 0.01 | 7.2 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 3 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 72.7 | 15 / 35 | 4939 |
| 2 | 1 | 64.8 | 72.4 | 16 / 35 | 5425 |
| 3 | 1 | 66.3 | 78.7 | 16 / 35 | 5380 |
| 4 | 1 | 65.7 | 77.5 | 13 / 35 | 5713 |
| 5 | 2 | 65.3 | 75.9 | 15 / 35 | 5368 |
| 6 | 2 | 63.0 | 72.4 | 10 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 70% |
| cs.Wren 1.0 | 23 | 65% |
| js.PinBall 1.6 | 10 | 60% |
| mz.Cork 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 41% | 101 |
| cs.Wren 1.0 | 27 | 22% | 37 |
| evd.X1 0.01 | 17 | 14% | 18 |
| joe.ADinosaur 1.0 | 11 | 9% | 12 |
| js.PinBall 1.6 | 6 | 5% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 5 |
| mz.Cork 0.1 | 5 | 4% | 12 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.6 | 114 / 210 | 2.74 | 17.4% | 26430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 17.4% | 114 |
| stelo.AreaTargetingBot 1.1 | 2.8 | 12.1% | 22 |
| myl.nano.Graviton 1.10 | 2.8 | 11.9% | 27 |
| ntc.Opposite 1.5 | 4.2 | 11.2% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.1% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 10.1% | 3 |
| DBall.NUKE 0.1 | 7.0 | 8.2% | 9 |
| disan.Chair 2.2.0 | 7.7 | 8.0% | 8 |
| donjezza.Muncho 1.0 | 9.2 | 5.8% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 20 / 35 | 4890 |
| 2 | 1 | 67.6 | 87.9 | 21 / 35 | 4214 |
| 3 | 1 | 65.5 | 77.5 | 19 / 35 | 4391 |
| 4 | 1 | 66.2 | 80.3 | 21 / 35 | 4302 |
| 5 | 1 | 63.8 | 76.5 | 15 / 35 | 4029 |
| 6 | 1 | 65.7 | 77.1 | 18 / 35 | 4604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 81% |
| myl.nano.Graviton 1.10 | 32 | 91% |
| ntc.Opposite 1.5 | 16 | 75% |
| DBall.NUKE 0.1 | 14 | 93% |
| disan.Chair 2.2.0 | 10 | 60% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 26 | 27% | 59 |
| ntc.Opposite 1.5 | 17 | 18% | 29 |
| stelo.AreaTargetingBot 1.1 | 16 | 16% | 37 |
| pfvicm.Sobieski 7.2.3b | 13 | 13% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 20 |
| disan.Chair 2.2.0 | 6 | 6% | 11 |
| DBall.NUKE 0.1 | 5 | 5% | 19 |
| pbg.R2D2 1.0 | 2 | 2% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 73.0 | 67 / 210 | 3.43 | 15.0% | 25068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 2.0 | 15.0% | 67 |
| oog.melee.Capulet 1.2 | 2.2 | 14.4% | 58 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.2% | 36 |
| yagami.Tidus 0.11 | 3.8 | 13.0% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.7% | 27 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 75.6 | 15 / 35 | 4392 |
| 2 | 2 | 62.7 | 73.3 | 10 / 35 | 3832 |
| 3 | 1 | 64.2 | 75.6 | 12 / 35 | 4089 |
| 4 | 1 | 66.4 | 81.0 | 12 / 35 | 4762 |
| 5 | 3 | 61.2 | 65.7 | 8 / 35 | 4265 |
| 6 | 4 | 61.1 | 67.0 | 10 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 22 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| kawigi.micro.Shiz 1.1 | 19 | 89% |
| yagami.Tidus 0.11 | 19 | 84% |
| ejb.Polaris 1.0.1 | 2 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 40 | 28% | 58 |
| oog.melee.Capulet 1.2 | 40 | 28% | 54 |
| kawigi.micro.Shiz 1.1 | 26 | 18% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 14% | 31 |
| ejb.Polaris 1.0.1 | 10 | 7% | 13 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.3 | 130 / 210 | 2.32 | 18.2% | 28978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 18.2% | 130 |
| wee.Gem 1.8.4 | 2.8 | 12.4% | 27 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 20 |
| wompi.Quokka 1.6 | 3.8 | 11.1% | 13 |
| ratosh.Nobo 0.21 | 4.3 | 11.2% | 6 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.1% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.3% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.8 | 23 / 35 | 5136 |
| 2 | 1 | 67.1 | 85.4 | 20 / 35 | 4834 |
| 3 | 1 | 67.3 | 84.8 | 24 / 35 | 4552 |
| 4 | 1 | 67.7 | 84.8 | 22 / 35 | 4958 |
| 5 | 1 | 67.0 | 84.1 | 21 / 35 | 4668 |
| 6 | 1 | 66.7 | 82.2 | 20 / 35 | 4830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 48 | 90% |
| bzdp.Pansy 2.1 | 40 | 88% |
| wompi.Quokka 1.6 | 25 | 88% |
| ratosh.Nobo 0.21 | 16 | 75% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 19% | 25 |
| bzdp.Pansy 2.1 | 14 | 17% | 51 |
| wee.Gem 1.8.4 | 11 | 14% | 60 |
| wompi.Quokka 1.6 | 10 | 12% | 25 |
| m3thos.Eva00 1.1 | 10 | 12% | 16 |
| bayen.UbaMicro 1.4 | 6 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 7 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 7 |
| maribo.FollowFire 1 | 4 | 5% | 4 |

## Melee bench: F15

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.3 | 131 / 210 | 2.05 | 20.9% | 45583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 20.9% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 65 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 13 |
| ayk.WallHugger 1.0 | 4.3 | 9.9% | 1 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.7% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.2% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 86.3 | 18 / 35 | 7481 |
| 2 | 1 | 71.9 | 86.7 | 23 / 35 | 7648 |
| 3 | 1 | 71.0 | 84.8 | 19 / 35 | 7235 |
| 4 | 1 | 71.4 | 87.3 | 22 / 35 | 7245 |
| 5 | 1 | 73.7 | 94.0 | 25 / 35 | 7883 |
| 6 | 1 | 73.0 | 90.8 | 24 / 35 | 8091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 106 | 81% |
| mz.NanoGod 2.02 | 11 | 82% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| sample.SittingDuck 1.0 | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 47% | 123 |
| mz.NanoGod 2.02 | 26 | 33% | 39 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 16 |
| ayk.WallHugger 1.0 | 4 | 5% | 12 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 10 |

## Melee bench: F16

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.7 | 111 / 210 | 2.65 | 17.5% | 29060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 17.5% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.6% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.5 | 11.9% | 28 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 20 |
| bvh.micro.Freya 0.3 | 4.8 | 10.5% | 12 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.8% | 4 |
| conscience.Electron 1.3g | 7.3 | 7.7% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.4% | 4 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 76.5 | 15 / 35 | 4744 |
| 2 | 1 | 67.2 | 85.1 | 21 / 35 | 4973 |
| 3 | 1 | 66.8 | 85.1 | 19 / 35 | 4729 |
| 4 | 1 | 67.8 | 84.8 | 22 / 35 | 5104 |
| 5 | 1 | 66.7 | 80.6 | 19 / 35 | 4872 |
| 6 | 1 | 64.8 | 78.1 | 15 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 31 | 71% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| bvh.micro.Freya 0.3 | 17 | 76% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 67% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 28% | 67 |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 25% | 48 |
| dummy.micro.Sparrow 2.5 | 23 | 23% | 44 |
| bvh.micro.Freya 0.3 | 7 | 7% | 19 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 13 |
| dl.BetterWalls 1.0 | 4 | 4% | 9 |
| conscience.Electron 1.3g | 4 | 4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 3% | 4 |

## Melee bench: F17

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.0 | 146 / 210 | 1.99 | 20.7% | 40204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.0 | 20.7% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 15 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 7 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.6% | 17 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.2% | 3 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 9 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 5 |
| sample.Corners 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 91.7 | 26 / 35 | 6986 |
| 2 | 1 | 69.3 | 84.1 | 23 / 35 | 6331 |
| 3 | 1 | 68.9 | 83.5 | 19 / 35 | 6371 |
| 4 | 1 | 71.1 | 91.1 | 25 / 35 | 6810 |
| 5 | 1 | 71.4 | 90.5 | 25 / 35 | 7010 |
| 6 | 1 | 72.0 | 93.0 | 28 / 35 | 6696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 91% |
| sul.Lunar 1.1 | 41 | 100% |
| supersample.SuperBoxBot 1.0 | 34 | 88% |
| dsw.StaticD 1.0 | 12 | 75% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 44% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 23% | 62 |
| dsw.StaticD 1.0 | 5 | 8% | 15 |
| sample.MyFirstRobot 1.0 | 5 | 8% | 10 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 10 |
| sul.Lunar 1.1 | 2 | 3% | 46 |
| sample.Corners 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorPXO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.5 | 85 / 210 | 3.48 | 16.0% | 33385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPXO 0.1 | 1.3 | 16.0% | 85 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.7 | 13.4% | 31 |
| radnor.DoctorBob 1.42 | 3.0 | 13.2% | 32 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 22 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 10 |
| amz.NanoClone 1.41 | 6.0 | 9.7% | 10 |
| sample.Walls 1.0 | 6.7 | 8.7% | 11 |
| GarmBox.Oranges 1.0 | 8.2 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 7 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.0 | 15 / 35 | 5586 |
| 2 | 1 | 60.8 | 63.8 | 11 / 35 | 4991 |
| 3 | 1 | 66.3 | 78.7 | 15 / 35 | 5870 |
| 4 | 1 | 63.0 | 68.3 | 12 / 35 | 5586 |
| 5 | 1 | 68.4 | 83.8 | 21 / 35 | 6120 |
| 6 | 3 | 61.8 | 66.3 | 11 / 35 | 5232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 88% |
| radnor.DoctorBob 1.42 | 27 | 63% |
| mld.Wisdom 1.0 | 11 | 55% |
| amz.NanoClone 1.41 | 10 | 90% |
| jangs.ns51 1.0 | 8 | 63% |
| sample.Walls 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 80% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 23% | 46 |
| mld.Wisdom 1.0 | 26 | 21% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 17% | 60 |
| KiraNL.Chupacabra 0.4 | 15 | 12% | 21 |
| amz.NanoClone 1.41 | 14 | 11% | 18 |
| sample.Walls 1.0 | 10 | 8% | 14 |
| GarmBox.Oranges 1.0 | 6 | 5% | 8 |
| jangs.ns51 1.0 | 4 | 3% | 7 |

