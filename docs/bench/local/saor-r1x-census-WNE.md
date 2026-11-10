# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.0 | 137 / 210 | 2.26 | 20.2% | 39877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 20.2% | 137 |
| radnor.DoctorBob 1.42 | 2.7 | 13.7% | 25 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 21 |
| mld.Infinity 2.2 | 3.8 | 13.0% | 14 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 5 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 2 |
| sample.Walls 1.0 | 6.8 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 5 |
| arthord.MannyPacquiao Beta | 8.8 | 5.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 86.0 | 24 / 35 | 6557 |
| 2 | 1 | 71.7 | 88.9 | 24 / 35 | 6896 |
| 3 | 1 | 68.3 | 80.6 | 18 / 35 | 5995 |
| 4 | 1 | 72.0 | 89.8 | 25 / 35 | 7081 |
| 5 | 1 | 70.4 | 83.5 | 22 / 35 | 6468 |
| 6 | 1 | 71.5 | 87.0 | 24 / 35 | 6880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 88% |
| mld.Infinity 2.2 | 44 | 91% |
| radnor.DoctorBob 1.42 | 32 | 78% |
| amz.NanoClone 1.41 | 8 | 75% |
| GarmBox.Oranges 1.0 | 2 | 0% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 26% | 51 |
| mz.AntiGrav 1.0 | 15 | 21% | 60 |
| amz.NanoClone 1.41 | 12 | 16% | 18 |
| mld.Infinity 2.2 | 11 | 15% | 50 |
| GarmBox.Oranges 1.0 | 8 | 11% | 8 |
| jangs.ns51 1.0 | 5 | 7% | 10 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |

## Melee bench: F02

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.6 | 121 / 210 | 2.30 | 18.4% | 31676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 18.4% | 121 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 48 |
| mld.DustBunny 3.8 | 3.5 | 13.0% | 12 |
| maribo.melee.BMV 0.1 | 3.8 | 10.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.9% | 8 |
| zyx.nano.Ant 1.1 | 6.3 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.2% | 12 |
| bzdp.BoxCar 2.0 | 7.3 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.5% | 3 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 22 / 35 | 5737 |
| 2 | 1 | 68.3 | 86.3 | 21 / 35 | 5577 |
| 3 | 1 | 68.7 | 86.3 | 24 / 35 | 5368 |
| 4 | 1 | 68.2 | 86.7 | 21 / 35 | 5289 |
| 5 | 1 | 66.8 | 82.2 | 19 / 35 | 4951 |
| 6 | 1 | 65.6 | 81.9 | 14 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 64% |
| mld.DustBunny 3.8 | 53 | 91% |
| djdjdj.NanoSkunk10 1.0 | 12 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 39% | 76 |
| mld.DustBunny 3.8 | 23 | 26% | 61 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 17 |
| maribo.melee.BMV 0.1 | 6 | 7% | 15 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| bzdp.BoxCar 2.0 | 4 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 11 |
| fullsail.SweetTea 1.1 | 2 | 2% | 13 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 71.6 | 89 / 210 | 3.56 | 17.1% | 34810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.2 | 17.1% | 89 |
| myl.micro.Troodon 1.10 | 1.8 | 16.0% | 62 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.3% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.6% | 26 |
| fm.mammillarias 1.3 | 5.3 | 9.7% | 4 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.2% | 11 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 3 |
| sample.Fire 1.0 | 9.5 | 5.2% | 2 |
| sample.Tracker 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 68.6 | 13 / 35 | 6052 |
| 2 | 1 | 68.3 | 79.4 | 15 / 35 | 6070 |
| 3 | 1 | 67.3 | 75.9 | 17 / 35 | 5976 |
| 4 | 2 | 60.8 | 60.0 | 13 / 35 | 4622 |
| 5 | 1 | 66.9 | 74.3 | 16 / 35 | 6113 |
| 6 | 1 | 66.7 | 71.4 | 15 / 35 | 5977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 64% |
| myl.nano.KomoriNinja 1.1 | 17 | 82% |
| cb.nano.Insomnia 1.0 | 12 | 83% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| fm.mammillarias 1.3 | 36 | 30% | 40 |
| myl.micro.Troodon 1.10 | 31 | 26% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 25 | 21% | 32 |
| myl.nano.KomoriNinja 1.1 | 12 | 10% | 37 |
| cb.nano.Insomnia 1.0 | 6 | 5% | 6 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 13 |
| sample.Fire 1.0 | 4 | 3% | 9 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.0 | 116 / 210 | 2.89 | 18.2% | 35496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 18.2% | 116 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.3% | 32 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.4% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.7% | 22 |
| tj.zombie1n 1.0.1 | 5.5 | 9.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.7% | 8 |
| yk.JahMicro 1.0 | 8.0 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.5 | 23 / 35 | 5761 |
| 2 | 1 | 68.5 | 83.8 | 19 / 35 | 6003 |
| 3 | 1 | 69.5 | 86.0 | 23 / 35 | 6261 |
| 4 | 1 | 64.5 | 70.5 | 16 / 35 | 5543 |
| 5 | 1 | 65.3 | 70.2 | 18 / 35 | 5980 |
| 6 | 1 | 67.4 | 80.3 | 17 / 35 | 5948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 74% |
| stelo.SoJNanoMelee 1.1 | 41 | 80% |
| tvv.micro.Antares 1.1.1 | 15 | 87% |
| yk.JahMicro 1.0 | 11 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 90% |
| tj.zombie1n 1.0.1 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 39% | 79 |
| stelo.SoJNanoMelee 1.1 | 25 | 27% | 47 |
| tj.zombie1n 1.0.1 | 8 | 9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 7% | 13 |
| tvv.micro.Antares 1.1.1 | 6 | 6% | 22 |
| repositorio.NanoStep 1.0 | 5 | 5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 13 |
| yk.JahMicro 1.0 | 2 | 2% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 62.5 | 69 / 210 | 4.37 | 14.3% | 27073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.2 | 14.3% | 69 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 43 |
| ahf.NanoAndrew .4 | 4.2 | 11.2% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.1% | 26 |
| sam.Samspin 1.0 | 4.5 | 10.8% | 16 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.6% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.7% | 7 |
| EBBU.Sim2 1.02 | 7.0 | 9.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 68.6 | 12 / 35 | 4421 |
| 2 | 1 | 60.8 | 62.5 | 12 / 35 | 4584 |
| 3 | 1 | 61.7 | 64.8 | 13 / 35 | 4567 |
| 4 | 2 | 57.2 | 51.1 | 10 / 35 | 4348 |
| 5 | 1 | 60.7 | 64.4 | 8 / 35 | 4599 |
| 6 | 1 | 61.3 | 63.8 | 14 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 48% |
| simonton.nano.MeleeSeed 1.8 | 22 | 91% |
| ahf.NanoAndrew .4 | 16 | 63% |
| sam.Samspin 1.0 | 11 | 100% |
| EBBU.Sim2 1.02 | 8 | 88% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 15% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 20 | 14% | 19 |
| zyx.nano.BacillusComma 1.0 | 19 | 13% | 21 |
| ahf.NanoAndrew .4 | 18 | 13% | 33 |
| EBBU.Sim2 1.02 | 17 | 12% | 20 |
| robar.nano.Assertive_Melee 0.2 | 17 | 12% | 19 |
| simonton.nano.MeleeSeed 1.8 | 14 | 10% | 34 |
| sample.TrackFire 1.0 | 8 | 6% | 10 |
| sam.Samspin 1.0 | 7 | 5% | 15 |

## Melee bench: F06

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.4 | 128 / 210 | 2.40 | 18.6% | 31265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 18.6% | 128 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.7% | 29 |
| gh.nano.Grofvuil 0.2 | 2.8 | 11.9% | 13 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.1% | 7 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.7% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 11 |
| fm.claire 1.7 | 6.8 | 8.4% | 4 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 6 |
| pa.Improved 1.0 | 9.3 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.9 | 22 / 35 | 4747 |
| 2 | 1 | 69.5 | 86.7 | 24 / 35 | 5742 |
| 3 | 1 | 68.1 | 87.9 | 20 / 35 | 4864 |
| 4 | 1 | 68.7 | 85.7 | 19 / 35 | 5652 |
| 5 | 1 | 69.7 | 89.5 | 22 / 35 | 5633 |
| 6 | 1 | 64.6 | 73.7 | 21 / 35 | 4627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 81% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| gh.nano.Grofvuil 0.2 | 9 | 89% |
| sample.SpinBot 1.0 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| fm.claire 1.7 | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 33% | 77 |
| arthord.NanoSatanMelee Beta | 10 | 12% | 18 |
| fm.claire 1.7 | 10 | 12% | 12 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 46 |
| gh.nano.Grofvuil 0.2 | 9 | 11% | 24 |
| sample.SpinBot 1.0 | 9 | 11% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 11 |
| pa.Improved 1.0 | 3 | 4% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.5 | 87 / 210 | 3.30 | 16.5% | 31165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.5 | 16.5% | 87 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 43 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.7% | 34 |
| mz.MicroGodMelee 1 | 4.0 | 12.7% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 11 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.4% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.0 | 13 / 35 | 5435 |
| 2 | 2 | 64.6 | 73.3 | 13 / 35 | 4941 |
| 3 | 1 | 65.1 | 74.3 | 12 / 35 | 5571 |
| 4 | 1 | 66.3 | 78.7 | 17 / 35 | 5296 |
| 5 | 3 | 63.5 | 69.2 | 15 / 35 | 4525 |
| 6 | 1 | 66.9 | 78.4 | 17 / 35 | 5397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 88% |
| mz.MicroGodMelee 1 | 28 | 68% |
| gh.micro.Gruweltje 0.7 | 20 | 75% |
| el.JumpShoot 0.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 25% | 67 |
| mz.MicroGodMelee 1 | 25 | 20% | 45 |
| gh.micro.Gruweltje 0.7 | 22 | 18% | 42 |
| acogdev.alpha 0.2 | 15 | 12% | 16 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 8 |
| DBall.Anarchy 0.1 | 7 | 6% | 13 |
| el.JumpShoot 0.2 | 7 | 6% | 7 |
| fire219.CatBot 1.0 | 7 | 6% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 64.3 | 70 / 210 | 4.21 | 14.3% | 27657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.3% | 63 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.2 | 13.8% | 34 |
| hadur117.micro.SaorWNE 0.1 | 2.3 | 14.3% | 70 |
| germ.TheMind .2 | 4.5 | 10.3% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.8% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.9% | 8 |
| awesomeness.Elite 1.0 | 6.8 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 8 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 60.3 | 10 / 35 | 4542 |
| 2 | 3 | 57.0 | 57.1 | 6 / 35 | 4078 |
| 3 | 3 | 60.1 | 61.0 | 10 / 35 | 4366 |
| 4 | 1 | 61.4 | 64.4 | 15 / 35 | 4653 |
| 5 | 2 | 64.5 | 73.3 | 15 / 35 | 4819 |
| 6 | 2 | 63.9 | 69.8 | 14 / 35 | 5199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 79% |
| germ.TheMind .2 | 6 | 67% |
| awesomeness.Elite 1.0 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 36% | 81 |
| germ.TheMind .2 | 36 | 26% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 12% | 34 |
| awesomeness.Elite 1.0 | 12 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 9 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 10 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.7 | 97 / 210 | 3.46 | 15.9% | 24846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.2 | 15.9% | 97 |
| rz.HawkOnFire 0.1 | 2.2 | 13.8% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 13.0% | 27 |
| maribo.IotaCT 1.1 | 4.3 | 10.9% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 10.0% | 2 |
| ratosh.Wesco 1.4 | 5.8 | 9.7% | 13 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.5% | 13 |
| spinnercat.Omen 1.0 | 8.3 | 8.4% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 12 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.2 | 19 / 35 | 4186 |
| 2 | 1 | 65.9 | 74.3 | 18 / 35 | 4704 |
| 3 | 1 | 64.8 | 74.3 | 14 / 35 | 4277 |
| 4 | 1 | 65.8 | 76.5 | 17 / 35 | 4027 |
| 5 | 2 | 60.5 | 63.2 | 13 / 35 | 3397 |
| 6 | 1 | 64.4 | 71.7 | 16 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 43 | 93% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| stelo.PatternRobot 1.0 | 10 | 80% |
| ratosh.Wesco 1.4 | 9 | 89% |
| timmit.nano.TimDog 0.33 | 6 | 50% |
| maribo.IotaCT 1.1 | 6 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 32 | 28% | 44 |
| timmit.nano.TimDog 0.33 | 21 | 18% | 28 |
| rz.HawkOnFire 0.1 | 18 | 16% | 55 |
| stelo.PatternRobot 1.0 | 17 | 15% | 20 |
| maribo.IotaCT 1.1 | 9 | 8% | 15 |
| nz.jdc.nano.GridFu 1.0 | 7 | 6% | 31 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 7 |
| spinnercat.Omen 1.0 | 3 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 3 |

## Melee bench: F10

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.6 | 116 / 210 | 2.92 | 17.7% | 32681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 17.7% | 116 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.5% | 35 |
| baal.nano.N 1.42 | 3.3 | 11.6% | 14 |
| zyx.micro.Ant 1.1 | 4.5 | 10.5% | 18 |
| Grystrion.TrackerWO 1.0 | 4.5 | 10.5% | 10 |
| sanja.First 0.1 | 6.3 | 8.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.9% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 9 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.6% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 73.3 | 15 / 35 | 4889 |
| 2 | 1 | 68.0 | 84.1 | 20 / 35 | 5617 |
| 3 | 1 | 64.8 | 74.6 | 17 / 35 | 5290 |
| 4 | 1 | 67.6 | 80.6 | 20 / 35 | 5960 |
| 5 | 1 | 67.8 | 81.0 | 23 / 35 | 5512 |
| 6 | 1 | 66.4 | 78.1 | 21 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 27 | 78% |
| baal.nano.N 1.42 | 20 | 85% |
| cvt.Firsty 1.0 | 19 | 100% |
| sanja.First 0.1 | 19 | 89% |
| zyx.micro.Ant 1.1 | 15 | 73% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 47 | 50% | 61 |
| tvv.nano.Polaris 1.2 | 10 | 11% | 40 |
| baal.nano.N 1.42 | 9 | 10% | 26 |
| cvt.Firsty 1.0 | 8 | 9% | 23 |
| Grystrion.TrackerWO 1.0 | 8 | 9% | 21 |
| amk.Punbot.Punbot 0.01 | 5 | 5% | 8 |
| sanja.First 0.1 | 4 | 4% | 25 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 64.7 | 59 / 210 | 4.18 | 14.2% | 28474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.5% | 78 |
| hadur117.micro.SaorWNE 0.1 | 2.0 | 14.2% | 59 |
| cs.Wren 1.0 | 3.0 | 13.0% | 23 |
| mz.Cork 0.1 | 4.0 | 11.5% | 16 |
| js.PinBall 1.6 | 4.8 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 9.5% | 9 |
| evd.X1 0.01 | 6.7 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 7 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.1 | 15 / 35 | 5320 |
| 2 | 2 | 60.0 | 61.6 | 10 / 35 | 4643 |
| 3 | 2 | 60.4 | 62.5 | 7 / 35 | 4939 |
| 4 | 2 | 59.3 | 60.6 | 6 / 35 | 4431 |
| 5 | 3 | 60.0 | 62.2 | 10 / 35 | 4645 |
| 6 | 2 | 60.5 | 64.1 | 11 / 35 | 4496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 63% |
| cs.Wren 1.0 | 16 | 56% |
| mz.Cork 0.1 | 7 | 71% |
| js.PinBall 1.6 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 33% | 85 |
| cs.Wren 1.0 | 30 | 20% | 36 |
| evd.X1 0.01 | 25 | 17% | 25 |
| joe.ADinosaur 1.0 | 16 | 11% | 18 |
| js.PinBall 1.6 | 11 | 7% | 18 |
| mz.Cork 0.1 | 7 | 5% | 13 |
| PSW.Relentless 0.1 | 6 | 4% | 5 |
| donjezza.Jezza 1.0 | 4 | 3% | 6 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.0 | 107 / 210 | 3.07 | 17.0% | 27376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 17.0% | 107 |
| myl.nano.Graviton 1.10 | 2.3 | 12.0% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.7% | 5 |
| ntc.Opposite 1.5 | 4.5 | 10.6% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.1% | 18 |
| disan.Chair 2.2.0 | 6.7 | 9.1% | 18 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 9 |
| pbg.R2D2 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.7 | 17 / 35 | 4735 |
| 2 | 1 | 67.3 | 83.8 | 18 / 35 | 4848 |
| 3 | 1 | 67.4 | 83.8 | 21 / 35 | 4695 |
| 4 | 1 | 63.2 | 71.1 | 17 / 35 | 4131 |
| 5 | 1 | 61.5 | 67.0 | 12 / 35 | 4254 |
| 6 | 1 | 65.9 | 76.8 | 22 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 29 | 86% |
| myl.nano.Graviton 1.10 | 23 | 83% |
| DBall.NUKE 0.1 | 15 | 93% |
| ntc.Opposite 1.5 | 13 | 77% |
| disan.Chair 2.2.0 | 13 | 62% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| donjezza.Muncho 1.0 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 7 | 57% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 27 | 26% | 35 |
| myl.nano.Graviton 1.10 | 18 | 17% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 26 |
| ntc.Opposite 1.5 | 12 | 12% | 18 |
| disan.Chair 2.2.0 | 11 | 11% | 19 |
| stelo.AreaTargetingBot 1.1 | 9 | 9% | 30 |
| DBall.NUKE 0.1 | 6 | 6% | 20 |
| donjezza.Muncho 1.0 | 4 | 4% | 14 |
| pbg.R2D2 1.0 | 4 | 4% | 7 |

## Melee bench: F13

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 66.9 | 64 / 210 | 3.98 | 14.4% | 24920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.3% | 58 |
| hadur117.micro.SaorWNE 0.1 | 2.0 | 14.4% | 64 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 28 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 10 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 70.5 | 13 / 35 | 4271 |
| 2 | 2 | 62.3 | 65.7 | 12 / 35 | 4210 |
| 3 | 2 | 61.7 | 64.1 | 12 / 35 | 4289 |
| 4 | 4 | 59.8 | 62.9 | 7 / 35 | 3602 |
| 5 | 2 | 61.7 | 66.7 | 9 / 35 | 3964 |
| 6 | 1 | 63.9 | 71.7 | 11 / 35 | 4584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 65% |
| yagami.Tidus 0.11 | 16 | 88% |
| kawigi.micro.Shiz 1.1 | 13 | 100% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 146 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 25% | 54 |
| yagami.Tidus 0.11 | 35 | 24% | 46 |
| kawigi.micro.Shiz 1.1 | 23 | 16% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 14% | 33 |
| ejb.Polaris 1.0.1 | 13 | 9% | 21 |
| step.nanoPri 1.0 | 10 | 7% | 10 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.0 | 108 / 210 | 3.43 | 15.9% | 25528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 15.9% | 108 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 14 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 39 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 12 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 21 |
| m3thos.Eva00 1.1 | 6.2 | 10.0% | 11 |
| bayen.UbaMicro 1.4 | 6.7 | 9.1% | 3 |
| stelo.MyAgileRobot 0.2 | 8.5 | 6.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.7 | 6.4% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 66.3 | 17 / 35 | 3753 |
| 2 | 1 | 64.9 | 74.6 | 19 / 35 | 4707 |
| 3 | 1 | 64.2 | 73.7 | 19 / 35 | 4178 |
| 4 | 1 | 66.1 | 78.4 | 22 / 35 | 4672 |
| 5 | 1 | 65.0 | 79.7 | 18 / 35 | 4285 |
| 6 | 1 | 60.1 | 65.1 | 13 / 35 | 3933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 88% |
| wee.Gem 1.8.4 | 26 | 96% |
| wompi.Quokka 1.6 | 19 | 89% |
| ratosh.Nobo 0.21 | 12 | 83% |
| m3thos.Eva00 1.1 | 7 | 71% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 18% | 51 |
| ratosh.Nobo 0.21 | 15 | 15% | 25 |
| m3thos.Eva00 1.1 | 13 | 13% | 21 |
| maribo.FollowFire 1 | 13 | 13% | 13 |
| wompi.Quokka 1.6 | 10 | 10% | 24 |
| bayen.UbaMicro 1.4 | 10 | 10% | 16 |
| stelo.MyAgileRobot 0.2 | 9 | 9% | 13 |
| wee.Gem 1.8.4 | 7 | 7% | 36 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 7% | 10 |

## Melee bench: F15

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.2 | 125 / 210 | 2.15 | 20.6% | 43690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.2 | 20.6% | 125 |
| wompi.Wallaby 5.1 | 1.8 | 17.4% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 21 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.2% | 5 |
| ayk.WallHugger 1.0 | 4.8 | 9.8% | 3 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 2 |
| drd.Dreadknoght 0.9 | 7.5 | 6.4% | 2 |
| stelo.PianistNano 1.2 | 7.5 | 6.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 90.2 | 25 / 35 | 7931 |
| 2 | 1 | 71.1 | 88.3 | 21 / 35 | 6725 |
| 3 | 1 | 73.1 | 91.1 | 26 / 35 | 7728 |
| 4 | 1 | 71.5 | 88.3 | 20 / 35 | 7168 |
| 5 | 2 | 69.4 | 78.7 | 14 / 35 | 7048 |
| 6 | 1 | 71.3 | 86.7 | 19 / 35 | 7090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 107 | 77% |
| mz.NanoGod 2.02 | 16 | 63% |
| exauge.GateKeeper 1.1.121g | 15 | 67% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 40% | 117 |
| mz.NanoGod 2.02 | 24 | 28% | 40 |
| exauge.GateKeeper 1.1.121g | 17 | 20% | 25 |
| ayk.WallHugger 1.0 | 8 | 9% | 15 |
| drd.Dreadknoght 0.9 | 1 | 1% | 9 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.7 | 97 / 210 | 3.73 | 15.9% | 28051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 15.9% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 33 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 15 |
| bvh.micro.Freya 0.3 | 4.5 | 11.1% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.2% | 15 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 11 |
| conscience.Electron 1.3g | 6.5 | 8.8% | 7 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 11 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.2 | 17 / 35 | 4635 |
| 2 | 1 | 61.4 | 63.8 | 12 / 35 | 4530 |
| 3 | 1 | 64.7 | 72.7 | 18 / 35 | 4719 |
| 4 | 1 | 64.7 | 71.4 | 15 / 35 | 5146 |
| 5 | 1 | 64.1 | 71.7 | 19 / 35 | 4497 |
| 6 | 1 | 63.2 | 68.3 | 16 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 83% |
| dummy.micro.Sparrow 2.5 | 21 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 84% |
| bvh.micro.Freya 0.3 | 17 | 94% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 0% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 21% | 53 |
| conscience.Electron 1.3g | 23 | 20% | 24 |
| dummy.micro.Sparrow 2.5 | 14 | 12% | 37 |
| bvh.micro.Freya 0.3 | 12 | 11% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 11% | 14 |
| dl.BetterWalls 1.0 | 10 | 9% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 8% | 29 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 15 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.4 | 133 / 210 | 2.31 | 20.3% | 40644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 20.3% | 133 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.3% | 27 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 8 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.7% | 25 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 6 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 6.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.7% | 2 |
| sample.Corners 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 79.4 | 18 / 35 | 5953 |
| 2 | 1 | 71.2 | 86.3 | 24 / 35 | 7206 |
| 3 | 1 | 71.8 | 87.6 | 23 / 35 | 7249 |
| 4 | 1 | 70.2 | 86.0 | 22 / 35 | 6767 |
| 5 | 1 | 69.9 | 86.0 | 21 / 35 | 6685 |
| 6 | 1 | 70.9 | 87.0 | 25 / 35 | 6784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 86% |
| supersample.SuperBoxBot 1.0 | 23 | 83% |
| dsw.StaticD 1.0 | 8 | 63% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 42% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 17% | 48 |
| dsw.StaticD 1.0 | 10 | 13% | 16 |
| sul.Lunar 1.1 | 7 | 9% | 58 |
| mme.NikeEnhanced 2.0 | 5 | 6% | 9 |
| sample.Corners 1.0 | 3 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 11 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 6 |

## Melee bench: F18

hadur117.micro.SaorWNE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.0 | 96 / 210 | 3.07 | 17.3% | 36016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNE 0.1 | 1.0 | 17.3% | 96 |
| radnor.DoctorBob 1.42 | 2.0 | 14.1% | 42 |
| mld.Wisdom 1.0 | 3.7 | 11.6% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.9% | 29 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 11 |
| amz.NanoClone 1.41 | 5.5 | 9.7% | 13 |
| sample.Walls 1.0 | 7.0 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 73.0 | 14 / 35 | 5511 |
| 2 | 1 | 69.0 | 81.6 | 17 / 35 | 7270 |
| 3 | 1 | 64.9 | 72.1 | 15 / 35 | 6012 |
| 4 | 1 | 69.7 | 88.6 | 23 / 35 | 6094 |
| 5 | 1 | 65.0 | 74.6 | 14 / 35 | 5619 |
| 6 | 1 | 64.3 | 72.4 | 13 / 35 | 5510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 78% |
| radnor.DoctorBob 1.42 | 36 | 67% |
| mld.Wisdom 1.0 | 14 | 71% |
| KiraNL.Chupacabra 0.4 | 12 | 83% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 28% | 44 |
| radnor.DoctorBob 1.42 | 22 | 19% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 19% | 52 |
| amz.NanoClone 1.41 | 14 | 12% | 21 |
| KiraNL.Chupacabra 0.4 | 13 | 11% | 19 |
| GarmBox.Oranges 1.0 | 5 | 4% | 6 |
| jangs.ns51 1.0 | 5 | 4% | 5 |
| sample.Walls 1.0 | 1 | 1% | 6 |

