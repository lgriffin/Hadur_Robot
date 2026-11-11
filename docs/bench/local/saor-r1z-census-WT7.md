# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 55 over 6 battles (9.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 88.5 | 149 / 210 | 2.03 | 21.7% | 44848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.7% | 149 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 21 |
| mz.AntiGrav 1.0 | 2.7 | 14.5% | 21 |
| mld.Infinity 2.2 | 3.8 | 13.0% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 6 |
| GarmBox.Oranges 1.0 | 6.3 | 6.8% | 1 |
| sample.Walls 1.0 | 6.8 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 3.7% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 85.1 | 26 / 35 | 7591 |
| 2 | 1 | 72.3 | 87.9 | 23 / 35 | 7345 |
| 3 | 1 | 74.4 | 94.3 | 28 / 35 | 7927 |
| 4 | 1 | 72.6 | 87.9 | 26 / 35 | 7243 |
| 5 | 1 | 72.3 | 87.6 | 23 / 35 | 7132 |
| 6 | 1 | 72.4 | 88.3 | 23 / 35 | 7610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 85 | 89% |
| radnor.DoctorBob 1.42 | 36 | 89% |
| mld.Infinity 2.2 | 33 | 97% |
| amz.NanoClone 1.41 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 39% | 64 |
| mz.AntiGrav 1.0 | 22 | 35% | 81 |
| mld.Infinity 2.2 | 7 | 11% | 37 |
| amz.NanoClone 1.41 | 5 | 8% | 14 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.9 | 127 / 210 | 2.09 | 19.3% | 33987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.3% | 127 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.5% | 48 |
| mld.DustBunny 3.8 | 3.3 | 12.8% | 10 |
| maribo.melee.BMV 0.1 | 3.7 | 10.6% | 8 |
| zyx.nano.Ant 1.1 | 6.0 | 8.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.5% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.5% | 10 |
| fullsail.SweetTea 1.1 | 7.7 | 7.3% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.1 | 21 / 35 | 5334 |
| 2 | 1 | 69.1 | 85.1 | 20 / 35 | 6257 |
| 3 | 1 | 68.8 | 87.6 | 21 / 35 | 5816 |
| 4 | 1 | 69.4 | 88.9 | 24 / 35 | 5447 |
| 5 | 1 | 70.1 | 89.5 | 20 / 35 | 5915 |
| 6 | 1 | 68.4 | 85.4 | 21 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 69 | 93% |
| oog.melee.Mercutio 1.0 | 55 | 65% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 62% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 41% | 75 |
| mld.DustBunny 3.8 | 17 | 20% | 77 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 12% | 16 |
| zyx.nano.Ant 1.1 | 10 | 12% | 11 |
| maribo.melee.BMV 0.1 | 7 | 8% | 14 |
| fullsail.SweetTea 1.1 | 3 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.6 | 117 / 210 | 2.66 | 19.5% | 37554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.5% | 117 |
| myl.micro.Troodon 1.10 | 2.2 | 14.6% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.7% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.6% | 16 |
| fm.mammillarias 1.3 | 5.2 | 9.9% | 6 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 8 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 5 |
| sample.Fire 1.0 | 9.5 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 89.8 | 24 / 35 | 6949 |
| 2 | 1 | 70.8 | 87.9 | 23 / 35 | 6357 |
| 3 | 1 | 69.1 | 80.0 | 20 / 35 | 6364 |
| 4 | 1 | 67.1 | 74.6 | 19 / 35 | 5709 |
| 5 | 1 | 68.1 | 77.5 | 16 / 35 | 6054 |
| 6 | 1 | 68.6 | 79.7 | 15 / 35 | 6121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 82% |
| cb.nano.Insomnia 1.0 | 20 | 85% |
| sp.Nanos.Ember 1.1 | 18 | 83% |
| myl.nano.KomoriNinja 1.1 | 15 | 80% |
| fm.mammillarias 1.3 | 14 | 93% |
| sample.Tracker 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 23 | 25% | 25 |
| myl.micro.Troodon 1.10 | 17 | 18% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 18% | 36 |
| myl.nano.KomoriNinja 1.1 | 13 | 14% | 34 |
| fm.mammillarias 1.3 | 9 | 10% | 17 |
| sp.Nanos.Ember 1.1 | 6 | 6% | 24 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 10 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.5 | 141 / 210 | 2.40 | 20.4% | 40546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.4% | 141 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.9% | 17 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 17 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.0% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.3% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.2% | 1 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 91.7 | 29 / 35 | 6803 |
| 2 | 1 | 68.1 | 78.4 | 20 / 35 | 6344 |
| 3 | 1 | 72.3 | 89.2 | 29 / 35 | 7427 |
| 4 | 1 | 68.9 | 81.3 | 18 / 35 | 6621 |
| 5 | 1 | 68.1 | 77.5 | 20 / 35 | 6131 |
| 6 | 1 | 71.6 | 88.9 | 25 / 35 | 7220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 90% |
| stelo.SoJNanoMelee 1.1 | 32 | 97% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 50% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 32% | 85 |
| ers.nano.hawk.HawkLA 3.0m | 12 | 17% | 25 |
| stelo.SoJNanoMelee 1.1 | 10 | 14% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 12% | 11 |
| tj.zombie1n 1.0.1 | 7 | 10% | 12 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 20 |
| yk.JahMicro 1.0 | 3 | 4% | 7 |
| sample.VelociRobot 1.0 | 3 | 4% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 14 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 66.7 | 82 / 210 | 4.00 | 15.7% | 30813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 15.7% | 82 |
| oog.melee.Corsair 1.0 | 1.8 | 13.9% | 50 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 10.8% | 19 |
| ahf.NanoAndrew .4 | 3.7 | 11.2% | 24 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.4% | 7 |
| sam.Samspin 1.0 | 6.5 | 9.2% | 12 |
| EBBU.Sim2 1.02 | 6.8 | 9.3% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 68.9 | 13 / 35 | 5427 |
| 2 | 2 | 61.7 | 63.5 | 10 / 35 | 4802 |
| 3 | 1 | 66.4 | 74.0 | 21 / 35 | 5582 |
| 4 | 1 | 65.0 | 73.3 | 16 / 35 | 5192 |
| 5 | 2 | 59.3 | 55.2 | 9 / 35 | 4663 |
| 6 | 1 | 63.1 | 65.1 | 13 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 53% |
| simonton.nano.MeleeSeed 1.8 | 31 | 87% |
| ahf.NanoAndrew .4 | 20 | 80% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| sam.Samspin 1.0 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| EBBU.Sim2 1.02 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 20% | 47 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 21 |
| simonton.nano.MeleeSeed 1.8 | 17 | 13% | 40 |
| zyx.nano.BacillusComma 1.0 | 16 | 12% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 12% | 16 |
| ahf.NanoAndrew .4 | 15 | 12% | 35 |
| EBBU.Sim2 1.02 | 13 | 10% | 18 |
| sample.TrackFire 1.0 | 6 | 5% | 7 |
| sam.Samspin 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.6 | 135 / 210 | 2.30 | 19.5% | 34433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.5% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.3% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.6% | 5 |
| fm.claire 1.7 | 6.3 | 8.6% | 3 |
| sample.SpinBot 1.0 | 8.0 | 6.5% | 2 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.8 | 20 / 35 | 5631 |
| 2 | 1 | 70.7 | 89.8 | 25 / 35 | 6023 |
| 3 | 1 | 67.3 | 80.6 | 20 / 35 | 5415 |
| 4 | 1 | 70.9 | 91.4 | 24 / 35 | 6102 |
| 5 | 1 | 70.3 | 88.9 | 27 / 35 | 5741 |
| 6 | 1 | 67.1 | 77.8 | 19 / 35 | 5521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 85% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| gh.nano.Grofvuil 0.2 | 14 | 86% |
| pa.Improved 1.0 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 39% | 84 |
| arthord.NanoSatanMelee Beta | 11 | 15% | 17 |
| oog.melee.CapuletDroid 1.1 | 8 | 11% | 45 |
| gh.nano.Grofvuil 0.2 | 7 | 9% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 10 |
| fm.claire 1.7 | 5 | 7% | 9 |
| pa.Improved 1.0 | 4 | 5% | 7 |
| kurios.DOSexe .9b | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.4 | 88 / 210 | 2.86 | 17.8% | 34746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.8% | 88 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.0% | 40 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 15.1% | 35 |
| mz.MicroGodMelee 1 | 4.0 | 12.4% | 32 |
| DBall.Anarchy 0.1 | 5.5 | 8.3% | 6 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 3 |
| acogdev.alpha 0.2 | 7.8 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.6 | 16 / 35 | 5763 |
| 2 | 1 | 66.9 | 77.5 | 11 / 35 | 5900 |
| 3 | 1 | 66.7 | 75.9 | 14 / 35 | 5831 |
| 4 | 1 | 67.2 | 79.0 | 14 / 35 | 5756 |
| 5 | 1 | 64.8 | 73.7 | 14 / 35 | 5014 |
| 6 | 1 | 70.4 | 89.5 | 19 / 35 | 6482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 86% |
| mz.MicroGodMelee 1 | 30 | 53% |
| gh.micro.Gruweltje 0.7 | 17 | 53% |
| el.JumpShoot 0.2 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| DBall.Anarchy 0.1 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 38 | 31% | 54 |
| spinnercat.micro.Tyger 0.1 | 31 | 25% | 72 |
| mz.MicroGodMelee 1 | 28 | 23% | 47 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 12 |
| DBall.Anarchy 0.1 | 7 | 6% | 10 |
| acogdev.alpha 0.2 | 4 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 71.6 | 102 / 210 | 3.56 | 16.8% | 32296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.8% | 102 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.7% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.1% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.0% | 8 |
| germ.TheMind .2 | 5.2 | 9.4% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 2 |
| sample.Crazy 1.0 | 8.0 | 7.0% | 2 |
| stelo.UntouchableNano 1.3 | 8.5 | 6.7% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 66.3 | 16 / 35 | 5077 |
| 2 | 1 | 64.1 | 69.8 | 14 / 35 | 5118 |
| 3 | 1 | 69.4 | 84.4 | 19 / 35 | 6069 |
| 4 | 1 | 66.7 | 73.7 | 20 / 35 | 5724 |
| 5 | 1 | 62.3 | 61.6 | 16 / 35 | 4834 |
| 6 | 1 | 66.1 | 73.7 | 17 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 80% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| awesomeness.Elite 1.0 | 5 | 60% |
| germ.TheMind .2 | 4 | 50% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 45% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 16% | 32 |
| germ.TheMind .2 | 13 | 12% | 17 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| awesomeness.Elite 1.0 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.1 | 151 / 210 | 2.07 | 20.3% | 33238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.3% | 151 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.6% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 2 |
| maribo.IotaCT 1.1 | 5.2 | 10.1% | 5 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.9% | 9 |
| ratosh.Wesco 1.4 | 6.8 | 8.3% | 5 |
| stelo.PatternRobot 1.0 | 7.7 | 7.9% | 5 |
| spinnercat.Omen 1.0 | 8.5 | 7.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.2 | 28 / 35 | 5541 |
| 2 | 1 | 70.5 | 86.3 | 24 / 35 | 5603 |
| 3 | 1 | 70.0 | 85.1 | 23 / 35 | 5730 |
| 4 | 1 | 70.8 | 86.7 | 26 / 35 | 5517 |
| 5 | 1 | 71.0 | 91.4 | 24 / 35 | 5068 |
| 6 | 1 | 71.1 | 89.8 | 26 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 93% |
| nz.jdc.nano.GridFu 1.0 | 33 | 97% |
| stelo.PatternRobot 1.0 | 16 | 88% |
| timmit.nano.TimDog 0.33 | 13 | 85% |
| ratosh.Wesco 1.4 | 10 | 80% |
| maribo.IotaCT 1.1 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 31% | 73 |
| ratosh.Wesco 1.4 | 12 | 20% | 24 |
| timmit.nano.TimDog 0.33 | 9 | 15% | 23 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 46 |
| stelo.PatternRobot 1.0 | 6 | 10% | 14 |
| maribo.IotaCT 1.1 | 4 | 7% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 7 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 92.0 | 167 / 210 | 1.72 | 22.1% | 42462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.1% | 167 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.5% | 15 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.5% | 9 |
| sanja.First 0.1 | 6.0 | 9.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.6% | 2 |
| cvt.Firsty 1.0 | 7.5 | 7.5% | 3 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.8% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.3 | 27 / 35 | 7024 |
| 2 | 1 | 71.1 | 87.0 | 27 / 35 | 6766 |
| 3 | 1 | 72.8 | 91.1 | 28 / 35 | 7569 |
| 4 | 1 | 72.9 | 92.7 | 28 / 35 | 7522 |
| 5 | 1 | 72.2 | 92.7 | 28 / 35 | 6851 |
| 6 | 1 | 72.2 | 95.2 | 29 / 35 | 6730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 90% |
| baal.nano.N 1.42 | 36 | 86% |
| cvt.Firsty 1.0 | 29 | 93% |
| sanja.First 0.1 | 25 | 96% |
| zyx.micro.Ant 1.1 | 18 | 78% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 23% | 31 |
| baal.nano.N 1.42 | 8 | 19% | 32 |
| tvv.nano.Polaris 1.2 | 7 | 16% | 60 |
| sanja.First 0.1 | 5 | 12% | 28 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 13 |
| cvt.Firsty 1.0 | 3 | 7% | 26 |
| sample.RamFire 1.0 | 3 | 7% | 3 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 66.5 | 78 / 210 | 4.01 | 15.4% | 32398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 15.4% | 78 |
| kc.micro.Figment 1.0 | 2.3 | 14.1% | 51 |
| cs.Wren 1.0 | 2.7 | 13.4% | 32 |
| js.PinBall 1.6 | 4.3 | 11.6% | 22 |
| mz.Cork 0.1 | 4.8 | 11.4% | 14 |
| joe.ADinosaur 1.0 | 5.7 | 9.4% | 3 |
| evd.X1 0.01 | 7.3 | 7.4% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 70.8 | 14 / 35 | 5657 |
| 2 | 1 | 64.6 | 71.1 | 14 / 35 | 5595 |
| 3 | 1 | 65.8 | 75.2 | 15 / 35 | 5441 |
| 4 | 1 | 62.5 | 64.1 | 11 / 35 | 5526 |
| 5 | 2 | 58.4 | 53.3 | 11 / 35 | 4832 |
| 6 | 1 | 62.8 | 64.4 | 13 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 60% |
| cs.Wren 1.0 | 27 | 78% |
| mz.Cork 0.1 | 13 | 100% |
| js.PinBall 1.6 | 7 | 86% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 69 | 52% | 108 |
| cs.Wren 1.0 | 15 | 11% | 30 |
| joe.ADinosaur 1.0 | 12 | 9% | 12 |
| evd.X1 0.01 | 12 | 9% | 12 |
| js.PinBall 1.6 | 9 | 7% | 14 |
| mz.Cork 0.1 | 8 | 6% | 22 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.1 | 134 / 210 | 2.70 | 18.8% | 30774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.8% | 134 |
| myl.nano.Graviton 1.10 | 2.8 | 11.8% | 21 |
| ntc.Opposite 1.5 | 3.5 | 11.4% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.0% | 12 |
| DBall.NUKE 0.1 | 6.7 | 8.8% | 8 |
| disan.Chair 2.2.0 | 7.7 | 7.9% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.9 | 23 / 35 | 4671 |
| 2 | 1 | 67.8 | 75.9 | 22 / 35 | 5224 |
| 3 | 1 | 70.6 | 89.2 | 26 / 35 | 5491 |
| 4 | 1 | 65.1 | 73.3 | 18 / 35 | 4782 |
| 5 | 1 | 69.5 | 85.4 | 22 / 35 | 5758 |
| 6 | 1 | 67.4 | 80.6 | 23 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 45 | 98% |
| ntc.Opposite 1.5 | 24 | 92% |
| stelo.AreaTargetingBot 1.1 | 24 | 92% |
| disan.Chair 2.2.0 | 15 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| DBall.NUKE 0.1 | 7 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 23 | 29% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 21% | 27 |
| stelo.AreaTargetingBot 1.1 | 12 | 15% | 36 |
| myl.nano.Graviton 1.10 | 11 | 14% | 48 |
| ntc.Opposite 1.5 | 7 | 9% | 28 |
| pbg.R2D2 1.0 | 4 | 5% | 11 |
| DBall.NUKE 0.1 | 2 | 3% | 14 |
| disan.Chair 2.2.0 | 2 | 3% | 12 |
| donjezza.Muncho 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.4 | 94 / 210 | 3.12 | 16.5% | 26420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.5% | 94 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 43 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.1% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 20 |
| yagami.Tidus 0.11 | 4.2 | 12.8% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 76.2 | 14 / 35 | 4184 |
| 2 | 1 | 65.0 | 74.9 | 14 / 35 | 4114 |
| 3 | 1 | 65.2 | 74.9 | 18 / 35 | 4213 |
| 4 | 1 | 66.7 | 80.3 | 14 / 35 | 4802 |
| 5 | 1 | 65.6 | 73.7 | 15 / 35 | 4641 |
| 6 | 1 | 67.2 | 78.4 | 19 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 61% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 90% |
| yagami.Tidus 0.11 | 21 | 86% |
| kawigi.micro.Shiz 1.1 | 19 | 89% |
| ejb.Polaris 1.0.1 | 11 | 91% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 35% | 63 |
| yagami.Tidus 0.11 | 32 | 28% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 13% | 41 |
| ejb.Polaris 1.0.1 | 7 | 6% | 20 |
| stelo.MirrorNano 1.3 | 7 | 6% | 8 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 21 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.1 | 129 / 210 | 2.70 | 18.1% | 29633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.1% | 129 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 17 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 26 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 9 |
| m3thos.Eva00 1.1 | 4.8 | 10.2% | 7 |
| wompi.Quokka 1.6 | 5.0 | 10.2% | 12 |
| bayen.UbaMicro 1.4 | 6.7 | 9.2% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.1 | 25 / 35 | 5090 |
| 2 | 1 | 66.4 | 80.0 | 19 / 35 | 4772 |
| 3 | 1 | 68.7 | 86.3 | 24 / 35 | 4970 |
| 4 | 1 | 65.8 | 77.5 | 19 / 35 | 4859 |
| 5 | 1 | 66.3 | 78.1 | 21 / 35 | 4929 |
| 6 | 1 | 67.3 | 80.3 | 21 / 35 | 5013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 91% |
| wee.Gem 1.8.4 | 33 | 94% |
| ratosh.Nobo 0.21 | 21 | 76% |
| m3thos.Eva00 1.1 | 15 | 100% |
| wompi.Quokka 1.6 | 10 | 80% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 22% | 63 |
| ratosh.Nobo 0.21 | 12 | 14% | 23 |
| bayen.UbaMicro 1.4 | 10 | 12% | 14 |
| maribo.FollowFire 1 | 10 | 12% | 10 |
| m3thos.Eva00 1.1 | 7 | 8% | 21 |
| wompi.Quokka 1.6 | 7 | 8% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 12 |
| wee.Gem 1.8.4 | 6 | 7% | 40 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 6 |

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.2 | 89.5 | 134 / 210 | 1.94 | 22.8% | 52768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.8% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 56 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 12 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.2% | 6 |
| ayk.WallHugger 1.0 | 5.3 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.1% | 0 |
| sample.SittingDuck 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 88.9 | 21 / 35 | 8720 |
| 2 | 1 | 72.8 | 87.3 | 19 / 35 | 7978 |
| 3 | 1 | 74.6 | 89.5 | 23 / 35 | 8994 |
| 4 | 1 | 74.7 | 90.2 | 25 / 35 | 8837 |
| 5 | 1 | 74.2 | 89.5 | 21 / 35 | 9131 |
| 6 | 1 | 75.1 | 91.7 | 25 / 35 | 9108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 79% |
| mz.NanoGod 2.02 | 20 | 75% |
| exauge.GateKeeper 1.1.121g | 18 | 89% |
| stelo.PianistNano 1.2 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 45% | 134 |
| mz.NanoGod 2.02 | 23 | 30% | 40 |
| exauge.GateKeeper 1.1.121g | 10 | 13% | 15 |
| ayk.WallHugger 1.0 | 7 | 9% | 8 |
| stelo.PianistNano 1.2 | 2 | 3% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.7 | 110 / 210 | 3.28 | 17.1% | 29517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.1% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 17 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.0% | 20 |
| bvh.micro.Freya 0.3 | 4.5 | 11.2% | 15 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.7% | 3 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 6.0% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 67.6 | 18 / 35 | 4845 |
| 2 | 1 | 67.4 | 79.4 | 21 / 35 | 5245 |
| 3 | 1 | 65.9 | 74.3 | 19 / 35 | 4906 |
| 4 | 1 | 66.1 | 76.8 | 19 / 35 | 4856 |
| 5 | 1 | 65.9 | 76.5 | 18 / 35 | 4878 |
| 6 | 1 | 64.5 | 73.7 | 15 / 35 | 4787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 94% |
| dummy.micro.Sparrow 2.5 | 26 | 85% |
| bvh.micro.Freya 0.3 | 23 | 65% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 79% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 17 | 17% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 17% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 34 |
| conscience.Electron 1.3g | 16 | 16% | 19 |
| bvh.micro.Freya 0.3 | 14 | 14% | 26 |
| voidious.micro.BlitzBat 1.05 | 13 | 13% | 51 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |
| dl.BetterWalls 1.0 | 3 | 3% | 6 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 83.0 | 135 / 210 | 2.53 | 20.9% | 44396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.9% | 135 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 22 |
| sul.Lunar 1.1 | 3.2 | 12.0% | 17 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 6 |
| dsw.StaticD 1.0 | 5.3 | 8.8% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 4 |
| sample.Corners 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 86.0 | 22 / 35 | 7833 |
| 2 | 1 | 70.1 | 75.9 | 20 / 35 | 7139 |
| 3 | 1 | 71.3 | 83.2 | 22 / 35 | 7635 |
| 4 | 1 | 69.9 | 81.0 | 22 / 35 | 6878 |
| 5 | 1 | 70.8 | 80.6 | 22 / 35 | 7579 |
| 6 | 1 | 72.9 | 91.1 | 27 / 35 | 7332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 91% |
| sul.Lunar 1.1 | 43 | 98% |
| supersample.SuperBoxBot 1.0 | 33 | 88% |
| dsw.StaticD 1.0 | 6 | 33% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 32% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 27% | 52 |
| dsw.StaticD 1.0 | 11 | 15% | 21 |
| mme.NikeEnhanced 2.0 | 7 | 9% | 11 |
| sample.Corners 1.0 | 5 | 7% | 6 |
| sul.Lunar 1.1 | 4 | 5% | 61 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 78.6 | 101 / 210 | 2.93 | 18.5% | 39523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.5% | 101 |
| radnor.DoctorBob 1.42 | 2.3 | 12.6% | 28 |
| mld.Wisdom 1.0 | 2.7 | 12.5% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.2% | 21 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 17 |
| KiraNL.Chupacabra 0.4 | 5.7 | 10.3% | 7 |
| GarmBox.Oranges 1.0 | 7.7 | 7.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.0% | 5 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 6 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 80.3 | 16 / 35 | 6540 |
| 2 | 1 | 67.6 | 75.2 | 18 / 35 | 6614 |
| 3 | 1 | 66.8 | 73.0 | 16 / 35 | 6629 |
| 4 | 1 | 68.4 | 82.2 | 15 / 35 | 6867 |
| 5 | 1 | 67.2 | 79.0 | 14 / 35 | 6383 |
| 6 | 1 | 69.4 | 81.6 | 22 / 35 | 6490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 92% |
| mld.Wisdom 1.0 | 29 | 66% |
| radnor.DoctorBob 1.42 | 23 | 70% |
| amz.NanoClone 1.41 | 14 | 71% |
| KiraNL.Chupacabra 0.4 | 9 | 67% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 24% | 47 |
| radnor.DoctorBob 1.42 | 23 | 21% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 16% | 44 |
| KiraNL.Chupacabra 0.4 | 18 | 16% | 30 |
| amz.NanoClone 1.41 | 12 | 11% | 21 |
| jangs.ns51 1.0 | 6 | 5% | 11 |
| sample.Walls 1.0 | 6 | 5% | 9 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

