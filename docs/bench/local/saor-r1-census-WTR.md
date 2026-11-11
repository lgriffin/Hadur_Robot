# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 88.6 | 142 / 210 | 2.03 | 21.4% | 44563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.4% | 142 |
| radnor.DoctorBob 1.42 | 2.5 | 13.9% | 25 |
| mz.AntiGrav 1.0 | 2.8 | 13.8% | 15 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| jangs.ns51 1.0 | 7.2 | 6.4% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.4% | 1 |
| sample.Walls 1.0 | 7.2 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 8.5 | 5.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 89.2 | 28 / 35 | 7981 |
| 2 | 1 | 73.5 | 94.0 | 27 / 35 | 7663 |
| 3 | 1 | 71.0 | 86.7 | 20 / 35 | 7123 |
| 4 | 1 | 71.8 | 86.7 | 23 / 35 | 7111 |
| 5 | 1 | 72.1 | 89.5 | 23 / 35 | 7289 |
| 6 | 1 | 71.4 | 85.4 | 21 / 35 | 7396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 75 | 95% |
| mld.Infinity 2.2 | 36 | 83% |
| radnor.DoctorBob 1.42 | 31 | 71% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 0% |

Hadur died in 68 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 35% | 57 |
| mld.Infinity 2.2 | 12 | 18% | 42 |
| mz.AntiGrav 1.0 | 10 | 15% | 69 |
| amz.NanoClone 1.41 | 9 | 13% | 14 |
| jangs.ns51 1.0 | 5 | 7% | 11 |
| sample.Walls 1.0 | 4 | 6% | 7 |
| GarmBox.Oranges 1.0 | 3 | 4% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.2 | 126 / 210 | 2.24 | 19.1% | 33229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.1% | 126 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.3% | 53 |
| mld.DustBunny 3.8 | 3.0 | 13.5% | 17 |
| maribo.melee.BMV 0.1 | 4.7 | 10.0% | 2 |
| zyx.nano.Ant 1.1 | 5.2 | 8.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.0% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.6% | 4 |
| fullsail.SweetTea 1.1 | 7.3 | 6.7% | 2 |
| bzdp.BoxCar 2.0 | 8.8 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.2 | 19 / 35 | 5288 |
| 2 | 1 | 68.4 | 84.1 | 21 / 35 | 5497 |
| 3 | 1 | 69.0 | 85.4 | 20 / 35 | 5825 |
| 4 | 1 | 68.9 | 85.4 | 20 / 35 | 5512 |
| 5 | 1 | 70.6 | 92.7 | 27 / 35 | 5615 |
| 6 | 1 | 69.0 | 87.3 | 19 / 35 | 5492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 75% |
| mld.DustBunny 3.8 | 58 | 83% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 40% | 89 |
| mld.DustBunny 3.8 | 24 | 28% | 68 |
| maribo.melee.BMV 0.1 | 7 | 8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 12 |
| zyx.nano.Ant 1.1 | 6 | 7% | 9 |
| fullsail.SweetTea 1.1 | 5 | 6% | 8 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 10 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.2 | 140 / 210 | 2.24 | 20.5% | 38189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.5% | 140 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.9% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.1% | 13 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 10 |
| fm.mammillarias 1.3 | 5.8 | 9.0% | 1 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.9% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.3 | 22 / 35 | 5983 |
| 2 | 1 | 68.4 | 78.7 | 22 / 35 | 5641 |
| 3 | 1 | 72.0 | 90.2 | 24 / 35 | 6898 |
| 4 | 1 | 71.4 | 86.0 | 24 / 35 | 6800 |
| 5 | 1 | 71.3 | 88.3 | 25 / 35 | 6594 |
| 6 | 1 | 70.6 | 87.0 | 23 / 35 | 6273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 97% |
| cb.nano.Insomnia 1.0 | 17 | 82% |
| sp.Nanos.Ember 1.1 | 17 | 88% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| fm.mammillarias 1.3 | 8 | 88% |
| sample.Fire 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 67% |

Hadur died in 70 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 24% | 69 |
| cb.nano.Insomnia 1.0 | 12 | 17% | 22 |
| myl.nano.KomoriNinja 1.1 | 10 | 14% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 14% | 28 |
| fm.mammillarias 1.3 | 7 | 10% | 11 |
| sp.Nanos.Ember 1.1 | 6 | 9% | 19 |
| sample.Tracker 1.0 | 5 | 7% | 5 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 10 |
| sample.Fire 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.3 | 158 / 210 | 2.06 | 21.1% | 40492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.1% | 158 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.5% | 14 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.2% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.3% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.3% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 8.8% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 4 |
| yk.JahMicro 1.0 | 7.3 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 85.7 | 25 / 35 | 7014 |
| 2 | 1 | 71.3 | 90.5 | 28 / 35 | 6748 |
| 3 | 1 | 72.1 | 90.8 | 28 / 35 | 6989 |
| 4 | 1 | 69.8 | 84.8 | 21 / 35 | 6511 |
| 5 | 1 | 71.9 | 90.8 | 29 / 35 | 6896 |
| 6 | 1 | 70.1 | 87.0 | 27 / 35 | 6334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 95% |
| stelo.SoJNanoMelee 1.1 | 52 | 88% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 87% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| yk.JahMicro 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 40% | 87 |
| stelo.SoJNanoMelee 1.1 | 16 | 30% | 38 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 23 |
| tj.zombie1n 1.0.1 | 3 | 6% | 8 |
| yk.JahMicro 1.0 | 3 | 6% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.8 | 84 / 210 | 3.90 | 15.4% | 28130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 15.4% | 84 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 38 |
| ahf.NanoAndrew .4 | 3.2 | 11.5% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 22 |
| EBBU.Sim2 1.02 | 5.7 | 10.0% | 11 |
| sam.Samspin 1.0 | 6.0 | 9.6% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.2% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.1% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 60.3 | 12 / 35 | 4327 |
| 2 | 1 | 63.5 | 71.7 | 14 / 35 | 4856 |
| 3 | 1 | 61.2 | 63.8 | 13 / 35 | 4463 |
| 4 | 1 | 63.6 | 71.4 | 15 / 35 | 4626 |
| 5 | 1 | 66.5 | 79.0 | 18 / 35 | 5163 |
| 6 | 2 | 61.0 | 60.3 | 12 / 35 | 4695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 87% |
| oog.melee.Corsair 1.0 | 27 | 52% |
| ahf.NanoAndrew .4 | 25 | 68% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| EBBU.Sim2 1.02 | 8 | 75% |
| sam.Samspin 1.0 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 126 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 20 | 16% | 37 |
| simonton.nano.MeleeSeed 1.8 | 19 | 15% | 42 |
| ahf.NanoAndrew .4 | 19 | 15% | 39 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 21 |
| EBBU.Sim2 1.02 | 15 | 12% | 21 |
| sam.Samspin 1.0 | 11 | 9% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 11 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| sample.TrackFire 1.0 | 6 | 5% | 6 |

## Melee bench: F06

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.8 | 139 / 210 | 2.19 | 19.5% | 34010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.5% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 39 |
| gh.nano.Grofvuil 0.2 | 3.3 | 10.9% | 4 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.8% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.0% | 4 |
| sample.SpinBot 1.0 | 6.7 | 7.7% | 5 |
| fm.claire 1.7 | 6.7 | 8.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.0% | 0 |
| pa.Improved 1.0 | 9.3 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.8 | 27 / 35 | 6252 |
| 2 | 1 | 69.3 | 90.2 | 24 / 35 | 5306 |
| 3 | 1 | 69.5 | 87.3 | 24 / 35 | 5900 |
| 4 | 1 | 69.8 | 88.3 | 25 / 35 | 5746 |
| 5 | 1 | 67.6 | 83.5 | 19 / 35 | 5390 |
| 6 | 1 | 67.7 | 81.9 | 20 / 35 | 5416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 83% |
| oog.melee.CapuletDroid 1.1 | 25 | 96% |
| arthord.NanoSatanMelee Beta | 17 | 100% |
| sample.SpinBot 1.0 | 12 | 100% |
| gh.nano.Grofvuil 0.2 | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 50% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 42% | 82 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 36 |
| gh.nano.Grofvuil 0.2 | 7 | 10% | 22 |
| sample.SpinBot 1.0 | 7 | 10% | 14 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 19 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 16 |
| kurios.DOSexe .9b | 4 | 6% | 8 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| fm.claire 1.7 | 2 | 3% | 8 |

## Melee bench: F07

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.6 | 91 / 210 | 3.11 | 17.2% | 32838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 17.2% | 91 |
| gh.micro.Gruweltje 0.7 | 2.0 | 14.9% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 27 |
| mz.MicroGodMelee 1 | 3.7 | 13.4% | 40 |
| DBall.Anarchy 0.1 | 5.5 | 8.2% | 6 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.3% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.8% | 3 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 0 |
| acogdev.alpha 0.2 | 8.7 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 67.0 | 10 / 35 | 4555 |
| 2 | 1 | 64.7 | 72.1 | 13 / 35 | 5294 |
| 3 | 1 | 67.3 | 80.6 | 17 / 35 | 5581 |
| 4 | 1 | 67.1 | 79.4 | 16 / 35 | 5776 |
| 5 | 1 | 68.3 | 80.3 | 17 / 35 | 6018 |
| 6 | 1 | 67.7 | 80.0 | 18 / 35 | 5614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 89% |
| mz.MicroGodMelee 1 | 42 | 60% |
| gh.micro.Gruweltje 0.7 | 15 | 53% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 40 | 34% | 65 |
| gh.micro.Gruweltje 0.7 | 26 | 22% | 46 |
| spinnercat.micro.Tyger 0.1 | 23 | 19% | 54 |
| acogdev.alpha 0.2 | 6 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 9 |
| el.JumpShoot 0.2 | 5 | 4% | 8 |
| fire219.CatBot 1.0 | 5 | 4% | 4 |
| DBall.Anarchy 0.1 | 4 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 7 |

## Melee bench: F08

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 72.9 | 115 / 210 | 3.44 | 16.9% | 30759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.9% | 115 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.3% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.2% | 4 |
| germ.TheMind .2 | 5.2 | 9.3% | 4 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 69.8 | 16 / 35 | 5112 |
| 2 | 1 | 63.6 | 67.0 | 17 / 35 | 4795 |
| 3 | 1 | 63.7 | 67.6 | 16 / 35 | 4908 |
| 4 | 1 | 66.7 | 75.9 | 21 / 35 | 5117 |
| 5 | 1 | 66.7 | 77.1 | 22 / 35 | 5006 |
| 6 | 1 | 68.6 | 80.0 | 23 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| germ.TheMind .2 | 7 | 86% |
| awesomeness.Elite 1.0 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 47% | 107 |
| qualidafial.MajorDick 1.0.1 | 11 | 12% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 9% | 27 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 13 |
| germ.TheMind .2 | 7 | 7% | 18 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 9 |
| awesomeness.Elite 1.0 | 4 | 4% | 11 |
| sample.Crazy 1.0 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |

## Melee bench: F09

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.3 | 173 / 210 | 1.78 | 21.0% | 32562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.0% | 173 |
| rz.HawkOnFire 0.1 | 2.2 | 12.9% | 9 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.9% | 7 |
| maribo.IotaCT 1.1 | 4.2 | 10.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.5% | 0 |
| timmit.nano.TimDog 0.33 | 6.8 | 8.9% | 7 |
| ratosh.Wesco 1.4 | 7.3 | 8.6% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 8.2% | 1 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.1 | 31 / 35 | 5557 |
| 2 | 1 | 72.0 | 92.4 | 28 / 35 | 5639 |
| 3 | 1 | 72.3 | 92.7 | 29 / 35 | 5782 |
| 4 | 1 | 72.1 | 94.6 | 30 / 35 | 5605 |
| 5 | 1 | 71.5 | 93.3 | 29 / 35 | 4936 |
| 6 | 1 | 69.2 | 82.9 | 26 / 35 | 5043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 96% |
| nz.jdc.nano.GridFu 1.0 | 40 | 98% |
| stelo.PatternRobot 1.0 | 19 | 100% |
| maribo.IotaCT 1.1 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 12 | 67% |
| ratosh.Wesco 1.4 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 10 | 27% | 24 |
| ratosh.Wesco 1.4 | 6 | 16% | 17 |
| rz.HawkOnFire 0.1 | 5 | 14% | 55 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 14% | 12 |
| stelo.PatternRobot 1.0 | 4 | 11% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3 | 8% | 58 |
| spinnercat.Omen 1.0 | 2 | 5% | 8 |
| maribo.IotaCT 1.1 | 1 | 3% | 18 |
| rrh.Iwillfindyou 2.0 | 1 | 3% | 0 |

## Melee bench: F10

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.1 | 175 / 210 | 1.71 | 21.7% | 39934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.7% | 175 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.8% | 7 |
| baal.nano.N 1.42 | 3.3 | 10.9% | 7 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.8% | 4 |
| zyx.micro.Ant 1.1 | 5.2 | 9.1% | 10 |
| sanja.First 0.1 | 5.8 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.5% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.7 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.4 | 30 / 35 | 6662 |
| 2 | 1 | 71.6 | 89.5 | 27 / 35 | 6618 |
| 3 | 1 | 72.4 | 94.0 | 31 / 35 | 6981 |
| 4 | 1 | 71.0 | 89.5 | 27 / 35 | 6514 |
| 5 | 1 | 72.2 | 94.6 | 31 / 35 | 6900 |
| 6 | 1 | 71.6 | 93.7 | 29 / 35 | 6259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 98% |
| baal.nano.N 1.42 | 31 | 94% |
| cvt.Firsty 1.0 | 30 | 97% |
| sanja.First 0.1 | 27 | 100% |
| zyx.micro.Ant 1.1 | 19 | 79% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 31% | 35 |
| baal.nano.N 1.42 | 6 | 17% | 29 |
| Grystrion.TrackerWO 1.0 | 4 | 11% | 13 |
| sanja.First 0.1 | 3 | 9% | 27 |
| cvt.Firsty 1.0 | 3 | 9% | 21 |
| sample.RamFire 1.0 | 3 | 9% | 3 |
| tvv.nano.Polaris 1.2 | 2 | 6% | 62 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 8 |

## Melee bench: F11

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.6 | 90 / 210 | 3.55 | 16.4% | 33657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 16.4% | 90 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 63 |
| cs.Wren 1.0 | 3.3 | 12.8% | 25 |
| js.PinBall 1.6 | 4.3 | 10.9% | 12 |
| mz.Cork 0.1 | 4.7 | 10.4% | 6 |
| joe.ADinosaur 1.0 | 5.7 | 9.5% | 5 |
| evd.X1 0.01 | 7.2 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 64.1 | 11 / 35 | 5487 |
| 2 | 1 | 66.2 | 79.4 | 14 / 35 | 5788 |
| 3 | 1 | 65.6 | 71.1 | 16 / 35 | 5961 |
| 4 | 1 | 63.0 | 67.0 | 15 / 35 | 4905 |
| 5 | 1 | 66.5 | 75.9 | 18 / 35 | 5763 |
| 6 | 1 | 65.5 | 72.4 | 16 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 68% |
| cs.Wren 1.0 | 33 | 85% |
| js.PinBall 1.6 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| mz.Cork 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |

Hadur died in 121 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 41% | 98 |
| cs.Wren 1.0 | 24 | 20% | 42 |
| js.PinBall 1.6 | 10 | 8% | 16 |
| joe.ADinosaur 1.0 | 9 | 7% | 11 |
| evd.X1 0.01 | 9 | 7% | 11 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| mz.Cork 0.1 | 5 | 4% | 10 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.2 | 138 / 210 | 2.42 | 19.1% | 29792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.1% | 138 |
| myl.nano.Graviton 1.10 | 2.8 | 11.2% | 12 |
| ntc.Opposite 1.5 | 3.2 | 11.2% | 11 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 10.8% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.5% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.5% | 4 |
| DBall.NUKE 0.1 | 7.0 | 8.1% | 7 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 10 |
| donjezza.Muncho 1.0 | 9.5 | 6.2% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.4 | 23 / 35 | 4888 |
| 2 | 1 | 68.2 | 85.4 | 23 / 35 | 4855 |
| 3 | 1 | 67.5 | 80.3 | 21 / 35 | 5122 |
| 4 | 1 | 66.8 | 78.4 | 20 / 35 | 4945 |
| 5 | 1 | 69.5 | 88.6 | 26 / 35 | 5125 |
| 6 | 1 | 69.2 | 88.3 | 25 / 35 | 4857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 44 | 91% |
| myl.nano.Graviton 1.10 | 30 | 97% |
| ntc.Opposite 1.5 | 15 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| DBall.NUKE 0.1 | 14 | 100% |
| donjezza.Muncho 1.0 | 12 | 100% |
| disan.Chair 2.2.0 | 12 | 75% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 74 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 16 | 22% | 26 |
| stelo.AreaTargetingBot 1.1 | 15 | 20% | 43 |
| ntc.Opposite 1.5 | 11 | 15% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 23 |
| myl.nano.Graviton 1.10 | 8 | 11% | 35 |
| disan.Chair 2.2.0 | 8 | 11% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 15 |
| pbg.R2D2 1.0 | 3 | 4% | 9 |
| DBall.NUKE 0.1 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.9 | 78 / 210 | 3.70 | 15.3% | 25783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.7 | 15.3% | 78 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 47 |
| oog.melee.Capulet 1.2 | 2.5 | 13.7% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 23 |
| yagami.Tidus 0.11 | 5.2 | 11.8% | 6 |
| ejb.Polaris 1.0.1 | 5.3 | 11.0% | 10 |
| step.nanoPri 1.0 | 7.3 | 7.2% | 0 |
| stelo.MirrorNano 1.3 | 7.7 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 62.9 | 11 / 35 | 3905 |
| 2 | 1 | 64.5 | 73.3 | 14 / 35 | 4157 |
| 3 | 2 | 63.8 | 68.9 | 13 / 35 | 4339 |
| 4 | 1 | 65.2 | 74.3 | 15 / 35 | 4566 |
| 5 | 2 | 62.0 | 64.1 | 9 / 35 | 4227 |
| 6 | 1 | 65.5 | 76.2 | 16 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 70% |
| kawigi.micro.Shiz 1.1 | 22 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 79% |
| yagami.Tidus 0.11 | 16 | 100% |
| ejb.Polaris 1.0.1 | 8 | 63% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 30% | 63 |
| ejb.Polaris 1.0.1 | 22 | 17% | 29 |
| yagami.Tidus 0.11 | 20 | 15% | 33 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 11% | 33 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.1 | 125 / 210 | 2.97 | 17.5% | 28509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.5% | 125 |
| wee.Gem 1.8.4 | 2.8 | 11.9% | 23 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 18 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 14 |
| ratosh.Nobo 0.21 | 4.0 | 11.2% | 14 |
| bayen.UbaMicro 1.4 | 6.3 | 8.9% | 7 |
| m3thos.Eva00 1.1 | 6.5 | 9.6% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.0 | 22 / 35 | 4627 |
| 2 | 1 | 65.8 | 77.1 | 17 / 35 | 4828 |
| 3 | 1 | 65.9 | 76.8 | 20 / 35 | 4571 |
| 4 | 1 | 65.8 | 75.6 | 20 / 35 | 4985 |
| 5 | 1 | 67.6 | 81.6 | 23 / 35 | 4819 |
| 6 | 1 | 66.4 | 77.8 | 23 / 35 | 4679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 98% |
| wee.Gem 1.8.4 | 40 | 100% |
| wompi.Quokka 1.6 | 17 | 82% |
| m3thos.Eva00 1.1 | 14 | 93% |
| ratosh.Nobo 0.21 | 14 | 86% |
| bayen.UbaMicro 1.4 | 5 | 40% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 16 | 19% | 16 |
| wee.Gem 1.8.4 | 14 | 16% | 63 |
| ratosh.Nobo 0.21 | 14 | 16% | 22 |
| bzdp.Pansy 2.1 | 11 | 13% | 44 |
| wompi.Quokka 1.6 | 9 | 11% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 11 |
| bayen.UbaMicro 1.4 | 7 | 8% | 9 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 6 |
| m3thos.Eva00 1.1 | 1 | 1% | 11 |

## Melee bench: F15

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 83.5 | 115 / 210 | 2.49 | 20.2% | 44778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.2% | 115 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 74 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 17 |
| ayk.WallHugger 1.0 | 4.7 | 9.9% | 2 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 83.8 | 20 / 35 | 8077 |
| 2 | 1 | 70.9 | 81.9 | 17 / 35 | 7314 |
| 3 | 1 | 70.4 | 81.0 | 16 / 35 | 7268 |
| 4 | 1 | 70.8 | 83.5 | 20 / 35 | 7121 |
| 5 | 1 | 72.9 | 89.5 | 23 / 35 | 8007 |
| 6 | 1 | 70.4 | 81.3 | 19 / 35 | 6991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 76% |
| exauge.GateKeeper 1.1.121g | 13 | 100% |
| mz.NanoGod 2.02 | 13 | 62% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 39% | 121 |
| mz.NanoGod 2.02 | 30 | 32% | 38 |
| exauge.GateKeeper 1.1.121g | 14 | 15% | 20 |
| ayk.WallHugger 1.0 | 9 | 9% | 18 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| drd.Dreadknoght 0.9 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.9 | 98 / 210 | 3.53 | 16.3% | 28934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.3% | 98 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.3% | 23 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 18 |
| bvh.micro.Freya 0.3 | 3.7 | 11.2% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.0% | 31 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.8% | 8 |
| conscience.Electron 1.3g | 7.2 | 8.2% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 5 |
| ap.Frederick 1.1 | 9.2 | 6.3% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.6 | 20 / 35 | 4946 |
| 2 | 1 | 66.3 | 77.5 | 18 / 35 | 5286 |
| 3 | 1 | 64.3 | 73.0 | 15 / 35 | 4498 |
| 4 | 1 | 62.7 | 67.9 | 15 / 35 | 4477 |
| 5 | 1 | 63.2 | 69.2 | 15 / 35 | 4867 |
| 6 | 1 | 62.1 | 62.9 | 15 / 35 | 4860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 77% |
| dummy.micro.Sparrow 2.5 | 26 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 64% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| stelo.MirrorMicro 1.0 | 10 | 80% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 24 | 21% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 21% | 42 |
| dummy.micro.Sparrow 2.5 | 18 | 16% | 46 |
| voidious.micro.BlitzBat 1.05 | 14 | 13% | 39 |
| dl.BetterWalls 1.0 | 10 | 9% | 15 |
| bvh.micro.Freya 0.3 | 9 | 8% | 20 |
| conscience.Electron 1.3g | 7 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 15 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.7 | 150 / 210 | 2.29 | 21.2% | 42766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.2% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 19 |
| sul.Lunar 1.1 | 3.3 | 11.1% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.0% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.7% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.3% | 4 |
| sample.Corners 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.9 | 22 / 35 | 6448 |
| 2 | 1 | 72.1 | 89.8 | 27 / 35 | 6810 |
| 3 | 1 | 70.0 | 80.6 | 21 / 35 | 7055 |
| 4 | 1 | 71.5 | 85.7 | 26 / 35 | 7262 |
| 5 | 1 | 71.3 | 84.4 | 25 / 35 | 7289 |
| 6 | 1 | 73.6 | 91.7 | 29 / 35 | 7902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 98% |
| sul.Lunar 1.1 | 47 | 100% |
| supersample.SuperBoxBot 1.0 | 25 | 84% |
| dsw.StaticD 1.0 | 12 | 67% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 30% | 34 |
| dsw.StaticD 1.0 | 12 | 20% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 16% | 60 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 7% | 7 |
| sul.Lunar 1.1 | 3 | 5% | 53 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 9 |
| sample.Corners 1.0 | 1 | 2% | 8 |

## Melee bench: F18

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.4 | 121 / 210 | 2.68 | 18.7% | 37690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.7% | 121 |
| radnor.DoctorBob 1.42 | 2.8 | 12.6% | 24 |
| mld.Wisdom 1.0 | 3.0 | 12.1% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 18 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 13 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 5 |
| sample.Walls 1.0 | 7.3 | 7.8% | 7 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.1 | 19 / 35 | 5711 |
| 2 | 1 | 68.7 | 82.9 | 22 / 35 | 6206 |
| 3 | 1 | 67.9 | 81.0 | 19 / 35 | 6239 |
| 4 | 1 | 69.6 | 85.1 | 22 / 35 | 6564 |
| 5 | 1 | 69.6 | 84.4 | 21 / 35 | 6863 |
| 6 | 1 | 66.7 | 77.8 | 18 / 35 | 6107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 94% |
| radnor.DoctorBob 1.42 | 31 | 81% |
| mld.Wisdom 1.0 | 21 | 62% |
| amz.NanoClone 1.41 | 16 | 69% |
| sample.Walls 1.0 | 13 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 31% | 42 |
| radnor.DoctorBob 1.42 | 19 | 21% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 13% | 57 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 18 |
| amz.NanoClone 1.41 | 11 | 12% | 18 |
| sample.Walls 1.0 | 3 | 3% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

