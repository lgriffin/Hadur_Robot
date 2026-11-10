# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 85.7 | 133 / 210 | 2.29 | 20.2% | 41196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 20.2% | 133 |
| radnor.DoctorBob 1.42 | 2.3 | 14.9% | 31 |
| mz.AntiGrav 1.0 | 3.0 | 14.3% | 20 |
| mld.Infinity 2.2 | 3.7 | 13.4% | 22 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 2 |
| sample.Walls 1.0 | 6.2 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 90.2 | 23 / 35 | 7212 |
| 2 | 1 | 73.0 | 92.4 | 25 / 35 | 7352 |
| 3 | 1 | 68.7 | 77.8 | 18 / 35 | 6483 |
| 4 | 1 | 71.5 | 87.9 | 24 / 35 | 6914 |
| 5 | 1 | 70.3 | 83.5 | 23 / 35 | 6571 |
| 6 | 1 | 70.0 | 82.5 | 20 / 35 | 6664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 95% |
| radnor.DoctorBob 1.42 | 35 | 83% |
| mld.Infinity 2.2 | 33 | 94% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 44% | 64 |
| mz.AntiGrav 1.0 | 13 | 17% | 68 |
| mld.Infinity 2.2 | 9 | 12% | 36 |
| amz.NanoClone 1.41 | 9 | 12% | 20 |
| GarmBox.Oranges 1.0 | 7 | 9% | 7 |
| jangs.ns51 1.0 | 3 | 4% | 4 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.8 | 127 / 210 | 2.10 | 18.9% | 31951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.9% | 127 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.4% | 45 |
| mld.DustBunny 3.8 | 3.0 | 13.2% | 16 |
| maribo.melee.BMV 0.1 | 4.3 | 10.5% | 4 |
| zyx.nano.Ant 1.1 | 6.0 | 8.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.5% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.2% | 6 |
| bzdp.BoxCar 2.0 | 7.7 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 7.0% | 3 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 21 / 35 | 4978 |
| 2 | 1 | 70.0 | 94.0 | 21 / 35 | 5689 |
| 3 | 1 | 66.9 | 82.2 | 19 / 35 | 4986 |
| 4 | 1 | 68.7 | 85.7 | 21 / 35 | 5406 |
| 5 | 1 | 68.4 | 87.3 | 20 / 35 | 5426 |
| 6 | 1 | 70.3 | 92.7 | 25 / 35 | 5466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 72% |
| mld.DustBunny 3.8 | 50 | 90% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| djdjdj.NanoSkunk10 1.0 | 10 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 37% | 78 |
| mld.DustBunny 3.8 | 19 | 23% | 57 |
| maribo.melee.BMV 0.1 | 12 | 14% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 20 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 12 |
| zyx.nano.Ant 1.1 | 4 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 4% | 12 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.5 | 128 / 210 | 2.49 | 19.5% | 36173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 19.5% | 128 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 11.9% | 23 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.8% | 6 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 5 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 1 |
| sample.Fire 1.0 | 9.3 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.7 | 21 / 35 | 6328 |
| 2 | 1 | 69.4 | 83.8 | 21 / 35 | 5957 |
| 3 | 1 | 70.3 | 85.7 | 23 / 35 | 6196 |
| 4 | 1 | 69.2 | 84.4 | 21 / 35 | 5749 |
| 5 | 1 | 68.4 | 77.8 | 19 / 35 | 6197 |
| 6 | 1 | 69.3 | 83.5 | 23 / 35 | 5746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 50 | 84% |
| myl.micro.Troodon 1.10 | 42 | 93% |
| cb.nano.Insomnia 1.0 | 16 | 100% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 27 | 33% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 23% | 53 |
| cb.nano.Insomnia 1.0 | 10 | 12% | 13 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 30 |
| fm.mammillarias 1.3 | 8 | 10% | 11 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 13 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 12 |
| sample.Fire 1.0 | 1 | 1% | 7 |

## Melee bench: F04

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.3 | 139 / 210 | 2.05 | 20.5% | 39756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 20.5% | 139 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.1% | 26 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.6% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.2% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.6% | 2 |
| tj.zombie1n 1.0.1 | 5.8 | 8.8% | 7 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.5% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.0 | 27 / 35 | 7007 |
| 2 | 1 | 68.6 | 81.6 | 18 / 35 | 6604 |
| 3 | 1 | 70.9 | 88.3 | 25 / 35 | 6812 |
| 4 | 1 | 69.2 | 86.3 | 23 / 35 | 5891 |
| 5 | 1 | 71.1 | 92.1 | 24 / 35 | 6600 |
| 6 | 1 | 70.7 | 88.6 | 22 / 35 | 6842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 87% |
| stelo.SoJNanoMelee 1.1 | 46 | 83% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 77% |
| tj.zombie1n 1.0.1 | 9 | 78% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 28% | 82 |
| stelo.SoJNanoMelee 1.1 | 15 | 21% | 39 |
| tvv.micro.Antares 1.1.1 | 7 | 10% | 25 |
| tj.zombie1n 1.0.1 | 7 | 10% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 10 |
| repositorio.NanoStep 1.0 | 6 | 8% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 16 |
| yk.JahMicro 1.0 | 4 | 6% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 76.3 | 96 / 210 | 3.13 | 16.9% | 31168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 16.9% | 96 |
| oog.melee.Corsair 1.0 | 2.7 | 12.1% | 33 |
| ahf.NanoAndrew .4 | 2.8 | 11.7% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.6% | 22 |
| sam.Samspin 1.0 | 5.0 | 9.8% | 11 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.9% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.6 | 17 / 35 | 5490 |
| 2 | 1 | 66.9 | 80.6 | 17 / 35 | 5471 |
| 3 | 1 | 63.8 | 75.6 | 14 / 35 | 4743 |
| 4 | 1 | 63.8 | 72.4 | 17 / 35 | 4859 |
| 5 | 1 | 64.4 | 72.1 | 15 / 35 | 5366 |
| 6 | 1 | 65.0 | 75.6 | 16 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 34 | 62% |
| ahf.NanoAndrew .4 | 20 | 85% |
| sam.Samspin 1.0 | 12 | 75% |
| EBBU.Sim2 1.02 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 24 | 21% | 27 |
| oog.melee.Corsair 1.0 | 16 | 14% | 39 |
| ahf.NanoAndrew .4 | 16 | 14% | 34 |
| sam.Samspin 1.0 | 15 | 13% | 28 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 15 |
| simonton.nano.MeleeSeed 1.8 | 12 | 10% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 8 |
| EBBU.Sim2 1.02 | 7 | 6% | 15 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.1 | 125 / 210 | 2.34 | 18.7% | 31584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.7% | 125 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.4% | 45 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.5% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.0% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 3 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 8 |
| fm.claire 1.7 | 6.3 | 8.1% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.1% | 1 |
| pa.Improved 1.0 | 9.0 | 6.3% | 3 |
| kurios.DOSexe .9b | 10.0 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 22 / 35 | 5404 |
| 2 | 1 | 66.3 | 77.8 | 18 / 35 | 5173 |
| 3 | 1 | 67.5 | 87.3 | 18 / 35 | 4976 |
| 4 | 1 | 70.1 | 90.5 | 26 / 35 | 5539 |
| 5 | 1 | 67.3 | 81.6 | 19 / 35 | 5297 |
| 6 | 1 | 68.9 | 89.2 | 22 / 35 | 5195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 79% |
| oog.melee.CapuletDroid 1.1 | 36 | 97% |
| gh.nano.Grofvuil 0.2 | 15 | 93% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| arthord.NanoSatanMelee Beta | 6 | 83% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 36% | 80 |
| arthord.NanoSatanMelee Beta | 12 | 14% | 15 |
| fm.claire 1.7 | 11 | 13% | 12 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 44 |
| gh.nano.Grofvuil 0.2 | 9 | 10% | 26 |
| sample.SpinBot 1.0 | 6 | 7% | 9 |
| pa.Improved 1.0 | 4 | 5% | 7 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 11 |
| kurios.DOSexe .9b | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.4 | 99 / 210 | 2.68 | 18.0% | 34006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.0% | 99 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.9% | 26 |
| mz.MicroGodMelee 1 | 3.7 | 13.5% | 36 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 6 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.2% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 0 |
| fire219.CatBot 1.0 | 8.2 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 2 |
| acogdev.alpha 0.2 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 18 / 35 | 5458 |
| 2 | 1 | 65.3 | 74.3 | 12 / 35 | 5526 |
| 3 | 1 | 69.1 | 87.6 | 17 / 35 | 5826 |
| 4 | 1 | 65.9 | 78.1 | 15 / 35 | 5113 |
| 5 | 1 | 67.9 | 80.6 | 16 / 35 | 6042 |
| 6 | 1 | 69.0 | 84.4 | 21 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 88% |
| mz.MicroGodMelee 1 | 43 | 58% |
| gh.micro.Gruweltje 0.7 | 21 | 52% |
| DBall.Anarchy 0.1 | 13 | 100% |
| el.JumpShoot 0.2 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 40 | 36% | 66 |
| gh.micro.Gruweltje 0.7 | 27 | 24% | 42 |
| spinnercat.micro.Tyger 0.1 | 23 | 21% | 57 |
| acogdev.alpha 0.2 | 7 | 6% | 11 |
| fire219.CatBot 1.0 | 6 | 5% | 6 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 14 |
| el.JumpShoot 0.2 | 1 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.8 | 105 / 210 | 3.18 | 16.9% | 31666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.2 | 16.9% | 105 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.9% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.4% | 2 |
| germ.TheMind .2 | 6.0 | 8.8% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 6.7 | 7.9% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.5% | 2 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.9 | 18 / 35 | 5218 |
| 2 | 2 | 62.4 | 69.2 | 11 / 35 | 4733 |
| 3 | 1 | 63.3 | 68.3 | 14 / 35 | 5216 |
| 4 | 1 | 67.4 | 80.3 | 20 / 35 | 5495 |
| 5 | 1 | 67.9 | 82.9 | 24 / 35 | 5581 |
| 6 | 1 | 66.7 | 79.0 | 18 / 35 | 5423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 75% |
| qualidafial.MajorDick 1.0.1 | 12 | 100% |
| sample.Crazy 1.0 | 8 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 60% |
| germ.TheMind .2 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 50% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 11% | 25 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 11 |
| germ.TheMind .2 | 9 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 11 |
| awesomeness.Elite 1.0 | 5 | 5% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 12 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.6 | 139 / 210 | 2.30 | 19.2% | 29910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 19.2% | 139 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 16 |
| maribo.IotaCT 1.1 | 4.8 | 9.9% | 8 |
| timmit.nano.TimDog 0.33 | 5.5 | 10.0% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 2 |
| stelo.PatternRobot 1.0 | 7.0 | 8.4% | 10 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 4 |
| ratosh.Wesco 1.4 | 8.2 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 23 / 35 | 4991 |
| 2 | 1 | 70.0 | 87.9 | 23 / 35 | 5130 |
| 3 | 1 | 68.6 | 82.2 | 24 / 35 | 4834 |
| 4 | 1 | 68.8 | 84.4 | 24 / 35 | 4876 |
| 5 | 1 | 67.2 | 78.4 | 19 / 35 | 5045 |
| 6 | 1 | 70.7 | 91.4 | 26 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 89% |
| nz.jdc.nano.GridFu 1.0 | 45 | 93% |
| stelo.PatternRobot 1.0 | 16 | 81% |
| maribo.IotaCT 1.1 | 10 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 71 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 23% | 60 |
| stelo.PatternRobot 1.0 | 14 | 20% | 25 |
| nz.jdc.nano.GridFu 1.0 | 11 | 15% | 56 |
| ratosh.Wesco 1.4 | 9 | 13% | 13 |
| timmit.nano.TimDog 0.33 | 8 | 11% | 21 |
| maribo.IotaCT 1.1 | 8 | 11% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 7 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |

## Melee bench: F10

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.3 | 160 / 210 | 1.78 | 21.0% | 38733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 21.0% | 160 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.7% | 13 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.6% | 7 |
| zyx.micro.Ant 1.1 | 4.5 | 9.9% | 14 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.5% | 1 |
| sanja.First 0.1 | 6.8 | 8.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.8% | 0 |
| cvt.Firsty 1.0 | 8.3 | 6.8% | 7 |
| sample.RamFire 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.6 | 24 / 35 | 6877 |
| 2 | 1 | 71.0 | 91.1 | 29 / 35 | 6121 |
| 3 | 1 | 71.0 | 94.0 | 26 / 35 | 6321 |
| 4 | 1 | 69.9 | 86.7 | 23 / 35 | 6485 |
| 5 | 1 | 71.4 | 93.0 | 29 / 35 | 6365 |
| 6 | 1 | 71.9 | 94.6 | 29 / 35 | 6564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 90% |
| tvv.nano.Polaris 1.2 | 37 | 89% |
| zyx.micro.Ant 1.1 | 27 | 74% |
| cvt.Firsty 1.0 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| sanja.First 0.1 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 21 | 42% | 46 |
| tvv.nano.Polaris 1.2 | 9 | 18% | 50 |
| baal.nano.N 1.42 | 7 | 14% | 38 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 20 |
| sample.RamFire 1.0 | 4 | 8% | 4 |
| cvt.Firsty 1.0 | 3 | 6% | 22 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 7 |
| sanja.First 0.1 | 0 | 0% | 14 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 8 |

## Melee bench: F11

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.1 | 81 / 210 | 3.96 | 15.2% | 31150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.3 | 15.2% | 81 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 62 |
| cs.Wren 1.0 | 2.8 | 13.3% | 28 |
| js.PinBall 1.6 | 4.7 | 11.1% | 11 |
| mz.Cork 0.1 | 4.8 | 10.7% | 10 |
| joe.ADinosaur 1.0 | 5.5 | 9.9% | 5 |
| evd.X1 0.01 | 7.0 | 7.7% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 72.4 | 13 / 35 | 5466 |
| 2 | 1 | 65.4 | 73.0 | 17 / 35 | 5502 |
| 3 | 2 | 57.7 | 54.6 | 10 / 35 | 4604 |
| 4 | 1 | 62.2 | 65.1 | 15 / 35 | 5039 |
| 5 | 1 | 64.1 | 72.4 | 12 / 35 | 5326 |
| 6 | 1 | 62.6 | 65.4 | 14 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 68% |
| cs.Wren 1.0 | 29 | 72% |
| js.PinBall 1.6 | 13 | 92% |
| mz.Cork 0.1 | 7 | 71% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 62 | 48% | 107 |
| cs.Wren 1.0 | 19 | 15% | 30 |
| joe.ADinosaur 1.0 | 16 | 12% | 18 |
| js.PinBall 1.6 | 10 | 8% | 21 |
| mz.Cork 0.1 | 9 | 7% | 17 |
| evd.X1 0.01 | 8 | 6% | 8 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.9 | 137 / 210 | 2.27 | 19.4% | 30732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 19.4% | 137 |
| ntc.Opposite 1.5 | 2.5 | 11.9% | 7 |
| myl.nano.Graviton 1.10 | 3.5 | 11.1% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.1% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.3% | 26 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.0% | 3 |
| disan.Chair 2.2.0 | 7.3 | 7.8% | 4 |
| DBall.NUKE 0.1 | 7.7 | 7.6% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 6.4% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.4 | 28 / 35 | 5443 |
| 2 | 1 | 67.6 | 83.5 | 20 / 35 | 4885 |
| 3 | 1 | 69.9 | 89.5 | 25 / 35 | 5526 |
| 4 | 1 | 67.5 | 81.0 | 19 / 35 | 5222 |
| 5 | 1 | 69.0 | 87.6 | 25 / 35 | 4784 |
| 6 | 1 | 67.5 | 82.5 | 20 / 35 | 4872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 81% |
| myl.nano.Graviton 1.10 | 32 | 94% |
| ntc.Opposite 1.5 | 22 | 82% |
| donjezza.Muncho 1.0 | 19 | 84% |
| disan.Chair 2.2.0 | 15 | 93% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| DBall.NUKE 0.1 | 9 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 23% | 44 |
| ntc.Opposite 1.5 | 13 | 18% | 28 |
| myl.nano.Graviton 1.10 | 10 | 14% | 45 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 19 |
| donjezza.Muncho 1.0 | 5 | 7% | 18 |
| disan.Chair 2.2.0 | 5 | 7% | 13 |
| pbg.R2D2 1.0 | 4 | 5% | 12 |
| DBall.NUKE 0.1 | 0 | 0% | 16 |

## Melee bench: F13

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.4 | 75 / 210 | 3.58 | 15.3% | 25873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.5 | 15.3% | 75 |
| oog.melee.Capulet 1.2 | 2.3 | 14.6% | 58 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.6% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 17 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 11 |
| ejb.Polaris 1.0.1 | 5.7 | 11.0% | 9 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 1 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 68.6 | 13 / 35 | 3848 |
| 2 | 1 | 64.1 | 69.8 | 16 / 35 | 4145 |
| 3 | 1 | 66.8 | 80.0 | 14 / 35 | 4671 |
| 4 | 1 | 67.6 | 80.6 | 17 / 35 | 4857 |
| 5 | 2 | 61.4 | 65.7 | 8 / 35 | 4199 |
| 6 | 2 | 60.6 | 63.5 | 7 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| kawigi.micro.Shiz 1.1 | 18 | 100% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 8 | 88% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 62 | 46% | 80 |
| kawigi.micro.Shiz 1.1 | 19 | 14% | 32 |
| yagami.Tidus 0.11 | 18 | 13% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 35 |
| ejb.Polaris 1.0.1 | 9 | 7% | 18 |
| stelo.MirrorNano 1.3 | 5 | 4% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.0 | 126 / 210 | 2.53 | 17.9% | 28080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 17.9% | 126 |
| wompi.Quokka 1.6 | 3.3 | 11.5% | 17 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 27 |
| bzdp.Pansy 2.1 | 3.8 | 11.4% | 11 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 12 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 3 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.2 | 20 / 35 | 5122 |
| 2 | 1 | 65.1 | 76.2 | 20 / 35 | 4482 |
| 3 | 1 | 67.7 | 85.7 | 24 / 35 | 4772 |
| 4 | 1 | 67.7 | 85.7 | 23 / 35 | 4746 |
| 5 | 1 | 66.2 | 80.3 | 19 / 35 | 4718 |
| 6 | 1 | 65.7 | 79.7 | 20 / 35 | 4240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 90% |
| wee.Gem 1.8.4 | 35 | 97% |
| wompi.Quokka 1.6 | 22 | 73% |
| ratosh.Nobo 0.21 | 14 | 79% |
| m3thos.Eva00 1.1 | 13 | 77% |
| bayen.UbaMicro 1.4 | 10 | 70% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 14 | 17% | 23 |
| bzdp.Pansy 2.1 | 12 | 14% | 54 |
| wompi.Quokka 1.6 | 12 | 14% | 21 |
| wee.Gem 1.8.4 | 10 | 12% | 47 |
| m3thos.Eva00 1.1 | 10 | 12% | 20 |
| bayen.UbaMicro 1.4 | 9 | 11% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 11% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 8 |
| maribo.FollowFire 1 | 2 | 2% | 3 |

## Melee bench: F15

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 86.2 | 118 / 210 | 2.24 | 20.4% | 45024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 20.4% | 118 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 66 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 17 |
| ayk.WallHugger 1.0 | 4.7 | 9.4% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 5 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 83.5 | 17 / 35 | 7193 |
| 2 | 1 | 71.7 | 85.7 | 19 / 35 | 7643 |
| 3 | 1 | 71.5 | 89.5 | 21 / 35 | 6892 |
| 4 | 1 | 71.5 | 83.8 | 21 / 35 | 7989 |
| 5 | 1 | 72.9 | 89.8 | 21 / 35 | 7931 |
| 6 | 1 | 71.1 | 84.8 | 19 / 35 | 7376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 79% |
| mz.NanoGod 2.02 | 16 | 50% |
| exauge.GateKeeper 1.1.121g | 8 | 75% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| ayk.WallHugger 1.0 | 5 | 80% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 48% | 134 |
| mz.NanoGod 2.02 | 28 | 30% | 44 |
| exauge.GateKeeper 1.1.121g | 13 | 14% | 16 |
| stelo.PianistNano 1.2 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.7 | 120 / 210 | 3.19 | 17.2% | 29828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 17.2% | 120 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.8% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.3% | 23 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 16 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.8% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.3% | 0 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 70.2 | 18 / 35 | 5075 |
| 2 | 1 | 67.8 | 83.5 | 22 / 35 | 5257 |
| 3 | 1 | 64.9 | 73.7 | 19 / 35 | 4711 |
| 4 | 1 | 67.9 | 84.4 | 24 / 35 | 5076 |
| 5 | 1 | 64.1 | 67.9 | 17 / 35 | 5097 |
| 6 | 1 | 65.1 | 74.3 | 20 / 35 | 4612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 93% |
| dummy.micro.Sparrow 2.5 | 35 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 85% |
| bvh.micro.Freya 0.3 | 10 | 70% |
| stelo.MirrorMicro 1.0 | 9 | 78% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 21% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 19% | 16 |
| dummy.micro.Sparrow 2.5 | 12 | 13% | 49 |
| conscience.Electron 1.3g | 11 | 12% | 14 |
| voidious.micro.BlitzBat 1.05 | 10 | 11% | 44 |
| bvh.micro.Freya 0.3 | 10 | 11% | 21 |
| dl.BetterWalls 1.0 | 8 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.0 | 144 / 210 | 2.08 | 21.0% | 41624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 21.0% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.5% | 26 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.4% | 16 |
| sul.Lunar 1.1 | 3.7 | 11.6% | 8 |
| mme.NikeEnhanced 2.0 | 4.7 | 10.1% | 7 |
| tlp.ThreeLeggedPig 1 | 6.5 | 7.3% | 1 |
| dsw.StaticD 1.0 | 6.7 | 7.8% | 5 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.4% | 3 |
| sample.Corners 1.0 | 9.0 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 87.6 | 24 / 35 | 6962 |
| 2 | 1 | 72.3 | 94.6 | 28 / 35 | 6577 |
| 3 | 1 | 70.0 | 82.9 | 20 / 35 | 7073 |
| 4 | 1 | 69.7 | 84.1 | 20 / 35 | 6612 |
| 5 | 1 | 70.4 | 84.4 | 24 / 35 | 6797 |
| 6 | 1 | 73.0 | 94.3 | 28 / 35 | 7603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 78% |
| supersample.SuperBoxBot 1.0 | 30 | 87% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| tlp.ThreeLeggedPig 1 | 9 | 89% |
| dsw.StaticD 1.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 27 | 41% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 18% | 44 |
| mme.NikeEnhanced 2.0 | 12 | 18% | 26 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 13 |
| sul.Lunar 1.1 | 3 | 5% | 56 |
| dsw.StaticD 1.0 | 3 | 5% | 12 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 8 |
| sample.Corners 1.0 | 2 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.6 | 92 / 210 | 3.20 | 17.1% | 36001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.2 | 17.1% | 92 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 30 |
| mld.Wisdom 1.0 | 2.7 | 13.1% | 35 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.8% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.7% | 13 |
| amz.NanoClone 1.41 | 5.3 | 10.2% | 11 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 1 |
| sample.Walls 1.0 | 7.7 | 7.5% | 12 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 5 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 24 / 35 | 6410 |
| 2 | 1 | 69.0 | 85.7 | 20 / 35 | 6772 |
| 3 | 1 | 66.6 | 78.1 | 13 / 35 | 6290 |
| 4 | 2 | 62.1 | 64.4 | 12 / 35 | 5208 |
| 5 | 1 | 65.6 | 74.9 | 12 / 35 | 5997 |
| 6 | 1 | 61.8 | 65.4 | 11 / 35 | 5324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 71% |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 94% |
| mld.Wisdom 1.0 | 20 | 65% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| amz.NanoClone 1.41 | 6 | 50% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 31% | 47 |
| radnor.DoctorBob 1.42 | 25 | 21% | 52 |
| KiraNL.Chupacabra 0.4 | 16 | 14% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 12% | 47 |
| amz.NanoClone 1.41 | 14 | 12% | 19 |
| jangs.ns51 1.0 | 6 | 5% | 8 |
| sample.Walls 1.0 | 4 | 3% | 6 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |

