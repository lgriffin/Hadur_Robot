# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.3 | 147 / 210 | 1.97 | 21.5% | 44160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.5% | 147 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 15 |
| radnor.DoctorBob 1.42 | 3.2 | 13.7% | 21 |
| mld.Infinity 2.2 | 3.3 | 12.9% | 22 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 2 |
| sample.Walls 1.0 | 6.3 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 1 |
| sample.Target 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.9 | 23 / 35 | 7433 |
| 2 | 1 | 72.2 | 89.8 | 25 / 35 | 7067 |
| 3 | 1 | 71.1 | 84.4 | 23 / 35 | 6879 |
| 4 | 1 | 71.6 | 85.1 | 23 / 35 | 7156 |
| 5 | 1 | 73.7 | 95.2 | 28 / 35 | 7972 |
| 6 | 1 | 73.2 | 92.1 | 25 / 35 | 7653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 99% |
| mld.Infinity 2.2 | 45 | 91% |
| radnor.DoctorBob 1.42 | 20 | 75% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 39% | 51 |
| mld.Infinity 2.2 | 17 | 27% | 64 |
| mz.AntiGrav 1.0 | 9 | 14% | 61 |
| amz.NanoClone 1.41 | 6 | 9% | 11 |
| GarmBox.Oranges 1.0 | 3 | 5% | 7 |
| jangs.ns51 1.0 | 2 | 3% | 9 |
| sample.Walls 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.9 | 126 / 210 | 2.09 | 19.1% | 31967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.3 | 19.1% | 126 |
| mld.DustBunny 3.8 | 2.2 | 14.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 43 |
| maribo.melee.BMV 0.1 | 4.2 | 9.9% | 4 |
| zyx.nano.Ant 1.1 | 5.2 | 9.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.4% | 4 |
| fullsail.SweetTea 1.1 | 7.5 | 6.9% | 2 |
| bzdp.BoxCar 2.0 | 8.5 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 94.3 | 23 / 35 | 4783 |
| 2 | 1 | 70.7 | 94.3 | 27 / 35 | 5433 |
| 3 | 1 | 68.4 | 88.3 | 19 / 35 | 5199 |
| 4 | 1 | 70.8 | 93.0 | 23 / 35 | 5969 |
| 5 | 1 | 70.8 | 94.0 | 26 / 35 | 5444 |
| 6 | 3 | 62.7 | 63.5 | 8 / 35 | 5139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 72 | 85% |
| oog.melee.Mercutio 1.0 | 51 | 69% |
| maribo.melee.BMV 0.1 | 10 | 70% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 4 | 75% |

Hadur died in 85 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 34% | 68 |
| mld.DustBunny 3.8 | 25 | 29% | 77 |
| maribo.melee.BMV 0.1 | 6 | 7% | 10 |
| zyx.nano.Ant 1.1 | 6 | 7% | 10 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 13 |
| fullsail.SweetTea 1.1 | 4 | 5% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 8 |
| cs.Grudge 1.0 | 4 | 5% | 5 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.6 | 131 / 210 | 2.66 | 19.6% | 36574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.6% | 131 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.4% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 9.8% | 15 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.9% | 11 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.5% | 4 |
| sample.Fire 1.0 | 9.3 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.8 | 22 / 35 | 6124 |
| 2 | 1 | 69.3 | 81.9 | 21 / 35 | 6283 |
| 3 | 1 | 69.4 | 83.2 | 22 / 35 | 5934 |
| 4 | 1 | 69.7 | 83.5 | 22 / 35 | 6105 |
| 5 | 1 | 65.4 | 68.9 | 17 / 35 | 5500 |
| 6 | 1 | 71.7 | 87.3 | 27 / 35 | 6628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 34 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 93% |
| cb.nano.Insomnia 1.0 | 25 | 80% |
| sp.Nanos.Ember 1.1 | 23 | 100% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| fm.mammillarias 1.3 | 11 | 91% |
| cs.sheldor.Talon 1.1 | 7 | 86% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 19 | 24% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 16% | 35 |
| myl.micro.Troodon 1.10 | 12 | 15% | 50 |
| sp.Nanos.Ember 1.1 | 9 | 11% | 33 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 31 |
| fm.mammillarias 1.3 | 7 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 11 |
| sample.Fire 1.0 | 4 | 5% | 10 |
| sample.Tracker 1.0 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.3 | 147 / 210 | 2.23 | 20.5% | 38998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.5% | 147 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.0% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.3% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 8.8% | 5 |
| yk.JahMicro 1.0 | 6.5 | 8.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 10 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.5 | 26 / 35 | 6752 |
| 2 | 1 | 71.2 | 91.1 | 25 / 35 | 6221 |
| 3 | 1 | 70.2 | 86.7 | 25 / 35 | 6291 |
| 4 | 1 | 69.2 | 78.4 | 24 / 35 | 6540 |
| 5 | 1 | 72.0 | 92.4 | 27 / 35 | 6907 |
| 6 | 1 | 68.6 | 80.0 | 20 / 35 | 6287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 90% |
| stelo.SoJNanoMelee 1.1 | 45 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 69% |
| tj.zombie1n 1.0.1 | 13 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| yk.JahMicro 1.0 | 7 | 71% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 28 | 44% | 93 |
| stelo.SoJNanoMelee 1.1 | 9 | 14% | 39 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 7 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 20 |
| yk.JahMicro 1.0 | 4 | 6% | 9 |
| tj.zombie1n 1.0.1 | 3 | 5% | 9 |
| repositorio.NanoStep 1.0 | 3 | 5% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.0 | 86 / 210 | 3.61 | 16.0% | 28073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.0% | 86 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 40 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.4% | 25 |
| ahf.NanoAndrew .4 | 3.8 | 11.1% | 30 |
| EBBU.Sim2 1.02 | 5.2 | 10.3% | 11 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.5% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.3 | 16 / 35 | 4637 |
| 2 | 1 | 62.5 | 66.7 | 11 / 35 | 4619 |
| 3 | 1 | 65.4 | 74.0 | 18 / 35 | 5159 |
| 4 | 1 | 63.5 | 71.1 | 14 / 35 | 4654 |
| 5 | 1 | 61.5 | 66.3 | 12 / 35 | 4254 |
| 6 | 1 | 64.3 | 73.7 | 15 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 91% |
| oog.melee.Corsair 1.0 | 29 | 55% |
| sam.Samspin 1.0 | 17 | 88% |
| ahf.NanoAndrew .4 | 16 | 63% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 60% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 24% | 58 |
| oog.melee.Corsair 1.0 | 23 | 18% | 44 |
| ahf.NanoAndrew .4 | 16 | 13% | 29 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 20 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 13 |
| sam.Samspin 1.0 | 7 | 6% | 15 |
| EBBU.Sim2 1.02 | 3 | 2% | 9 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.4 | 139 / 210 | 2.40 | 19.1% | 32878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.1% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 26 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.5% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 4 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.9% | 2 |
| sample.SpinBot 1.0 | 7.2 | 7.9% | 7 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 3 |
| pa.Improved 1.0 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 19 / 35 | 5118 |
| 2 | 1 | 67.0 | 77.1 | 22 / 35 | 5408 |
| 3 | 1 | 70.2 | 89.8 | 25 / 35 | 5648 |
| 4 | 1 | 70.2 | 90.5 | 28 / 35 | 5534 |
| 5 | 1 | 67.5 | 80.6 | 21 / 35 | 5391 |
| 6 | 1 | 70.1 | 89.8 | 24 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 90% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| gh.nano.Grofvuil 0.2 | 16 | 81% |
| sample.SpinBot 1.0 | 16 | 94% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| fm.claire 1.7 | 5 | 80% |
| kurios.DOSexe .9b | 3 | 67% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 32% | 69 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 35 |
| oog.melee.CapuletDroid 1.1 | 11 | 15% | 49 |
| sample.SpinBot 1.0 | 7 | 10% | 16 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 14 |
| kurios.DOSexe .9b | 4 | 6% | 9 |
| pa.Improved 1.0 | 3 | 4% | 5 |
| fm.claire 1.7 | 3 | 4% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.2 | 101 / 210 | 2.69 | 18.0% | 33845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.0% | 101 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.4% | 35 |
| mz.MicroGodMelee 1 | 3.0 | 13.5% | 29 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 37 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.1% | 3 |
| acogdev.alpha 0.2 | 7.7 | 6.2% | 0 |
| fire219.CatBot 1.0 | 8.2 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.5 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 17 / 35 | 5908 |
| 2 | 1 | 65.6 | 76.2 | 14 / 35 | 5220 |
| 3 | 1 | 66.5 | 76.8 | 16 / 35 | 5536 |
| 4 | 1 | 66.5 | 78.4 | 17 / 35 | 5389 |
| 5 | 1 | 70.5 | 91.4 | 20 / 35 | 6164 |
| 6 | 1 | 66.7 | 79.0 | 17 / 35 | 5628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 46 | 65% |
| spinnercat.micro.Tyger 0.1 | 42 | 74% |
| gh.micro.Gruweltje 0.7 | 30 | 60% |
| DBall.Anarchy 0.1 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 28% | 59 |
| gh.micro.Gruweltje 0.7 | 28 | 26% | 56 |
| spinnercat.micro.Tyger 0.1 | 24 | 22% | 47 |
| acogdev.alpha 0.2 | 9 | 8% | 11 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 13 |
| fire219.CatBot 1.0 | 5 | 5% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 73.3 | 114 / 210 | 3.40 | 17.1% | 31882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.1% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.2% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 26 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.0% | 9 |
| germ.TheMind .2 | 5.2 | 9.5% | 8 |
| awesomeness.Elite 1.0 | 5.5 | 9.3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 1 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.2% | 7 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 72.1 | 20 / 35 | 4828 |
| 2 | 1 | 63.6 | 66.7 | 18 / 35 | 5014 |
| 3 | 1 | 63.3 | 66.3 | 16 / 35 | 4854 |
| 4 | 1 | 69.3 | 85.7 | 21 / 35 | 6056 |
| 5 | 1 | 68.7 | 82.9 | 21 / 35 | 5788 |
| 6 | 1 | 64.3 | 66.3 | 18 / 35 | 5342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 87% |
| qualidafial.MajorDick 1.0.1 | 12 | 100% |
| germ.TheMind .2 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 7 | 57% |
| awesomeness.Elite 1.0 | 7 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 391. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 41% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 20% | 48 |
| germ.TheMind .2 | 14 | 15% | 22 |
| awesomeness.Elite 1.0 | 8 | 8% | 16 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.2 | 162 / 210 | 1.89 | 20.4% | 31203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.4% | 162 |
| rz.HawkOnFire 0.1 | 2.2 | 13.2% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 10 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 2 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 5 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 7.5% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 7.2% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 26 / 35 | 5419 |
| 2 | 1 | 72.0 | 95.9 | 31 / 35 | 5398 |
| 3 | 1 | 69.9 | 87.9 | 25 / 35 | 5206 |
| 4 | 1 | 68.9 | 85.7 | 24 / 35 | 4643 |
| 5 | 1 | 70.6 | 87.6 | 27 / 35 | 5161 |
| 6 | 1 | 71.3 | 90.8 | 29 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 93% |
| nz.jdc.nano.GridFu 1.0 | 42 | 100% |
| stelo.PatternRobot 1.0 | 16 | 94% |
| maribo.IotaCT 1.1 | 15 | 93% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 100% |
| spinnercat.Omen 1.0 | 8 | 100% |
| ratosh.Wesco 1.4 | 5 | 60% |
| timmit.nano.TimDog 0.33 | 4 | 75% |

Hadur died in 48 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 27% | 66 |
| timmit.nano.TimDog 0.33 | 8 | 17% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 15% | 53 |
| spinnercat.Omen 1.0 | 6 | 13% | 17 |
| ratosh.Wesco 1.4 | 5 | 10% | 13 |
| maribo.IotaCT 1.1 | 4 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 13 |
| stelo.PatternRobot 1.0 | 2 | 4% | 11 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.3 | 168 / 210 | 1.69 | 21.5% | 39312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.5% | 168 |
| baal.nano.N 1.42 | 2.3 | 12.6% | 13 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.8% | 16 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 5.5 | 8.7% | 3 |
| zyx.micro.Ant 1.1 | 6.0 | 8.7% | 4 |
| sanja.First 0.1 | 6.3 | 8.1% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 96.2 | 32 / 35 | 6873 |
| 2 | 1 | 72.5 | 95.6 | 30 / 35 | 6724 |
| 3 | 1 | 70.9 | 90.8 | 27 / 35 | 6315 |
| 4 | 1 | 71.3 | 92.1 | 28 / 35 | 6504 |
| 5 | 1 | 70.4 | 88.3 | 25 / 35 | 6393 |
| 6 | 1 | 71.1 | 91.1 | 26 / 35 | 6503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 85% |
| tvv.nano.Polaris 1.2 | 38 | 95% |
| cvt.Firsty 1.0 | 25 | 96% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| sanja.First 0.1 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 12 | 29% | 55 |
| zyx.micro.Ant 1.1 | 9 | 21% | 28 |
| tvv.nano.Polaris 1.2 | 6 | 14% | 49 |
| cvt.Firsty 1.0 | 5 | 12% | 25 |
| sanja.First 0.1 | 3 | 7% | 21 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 11 |
| Grystrion.TrackerWO 1.0 | 2 | 5% | 9 |
| sample.RamFire 1.0 | 2 | 5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 9 |

## Melee bench: F11

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.7 | 100 / 210 | 3.28 | 16.9% | 33267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.9% | 100 |
| kc.micro.Figment 1.0 | 2.3 | 13.9% | 46 |
| cs.Wren 1.0 | 2.7 | 12.6% | 24 |
| mz.Cork 0.1 | 4.3 | 10.7% | 14 |
| js.PinBall 1.6 | 4.7 | 10.8% | 14 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 5 |
| evd.X1 0.01 | 6.7 | 8.6% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 5 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.6 | 19 / 35 | 5749 |
| 2 | 1 | 64.2 | 70.8 | 16 / 35 | 5405 |
| 3 | 1 | 66.8 | 78.4 | 19 / 35 | 5773 |
| 4 | 1 | 66.5 | 77.8 | 17 / 35 | 5589 |
| 5 | 1 | 65.5 | 75.9 | 15 / 35 | 5475 |
| 6 | 1 | 63.5 | 70.5 | 14 / 35 | 5276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 66% |
| cs.Wren 1.0 | 33 | 82% |
| js.PinBall 1.6 | 10 | 90% |
| mz.Cork 0.1 | 10 | 80% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 42% | 90 |
| joe.ADinosaur 1.0 | 13 | 12% | 15 |
| evd.X1 0.01 | 12 | 11% | 14 |
| cs.Wren 1.0 | 10 | 9% | 31 |
| PSW.Relentless 0.1 | 9 | 8% | 10 |
| js.PinBall 1.6 | 8 | 7% | 20 |
| mz.Cork 0.1 | 7 | 6% | 17 |
| jsal.Jsalbot 1.0 | 3 | 3% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.7 | 140 / 210 | 2.47 | 19.0% | 29855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.0% | 140 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 17 |
| ntc.Opposite 1.5 | 3.3 | 11.4% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 8 |
| DBall.NUKE 0.1 | 7.3 | 7.6% | 4 |
| disan.Chair 2.2.0 | 7.7 | 7.8% | 5 |
| pbg.R2D2 1.0 | 9.3 | 5.9% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.7 | 26 / 35 | 4861 |
| 2 | 1 | 68.2 | 83.5 | 23 / 35 | 4649 |
| 3 | 1 | 68.8 | 87.0 | 26 / 35 | 4945 |
| 4 | 1 | 66.0 | 76.2 | 19 / 35 | 4929 |
| 5 | 1 | 69.5 | 84.8 | 25 / 35 | 5461 |
| 6 | 1 | 68.2 | 83.8 | 21 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 93% |
| stelo.AreaTargetingBot 1.1 | 38 | 92% |
| ntc.Opposite 1.5 | 18 | 83% |
| donjezza.Muncho 1.0 | 14 | 93% |
| disan.Chair 2.2.0 | 12 | 83% |
| DBall.NUKE 0.1 | 11 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 18 | 26% | 27 |
| myl.nano.Graviton 1.10 | 11 | 16% | 51 |
| ntc.Opposite 1.5 | 11 | 16% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 16% | 20 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 42 |
| disan.Chair 2.2.0 | 5 | 7% | 13 |
| DBall.NUKE 0.1 | 3 | 4% | 14 |
| donjezza.Muncho 1.0 | 1 | 1% | 13 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.3 | 90 / 210 | 3.13 | 16.5% | 26593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.5% | 90 |
| oog.melee.Capulet 1.2 | 2.2 | 14.0% | 57 |
| kawigi.micro.Shiz 1.1 | 3.3 | 12.9% | 23 |
| yagami.Tidus 0.11 | 4.0 | 12.3% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 11.7% | 20 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 11 |
| stelo.MirrorNano 1.3 | 7.0 | 8.0% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.9 | 14 / 35 | 4504 |
| 2 | 1 | 65.1 | 75.6 | 15 / 35 | 4273 |
| 3 | 1 | 65.8 | 74.9 | 16 / 35 | 4556 |
| 4 | 1 | 67.0 | 81.6 | 15 / 35 | 4478 |
| 5 | 1 | 66.0 | 79.0 | 17 / 35 | 4239 |
| 6 | 1 | 64.7 | 71.1 | 13 / 35 | 4543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 61% |
| kawigi.micro.Shiz 1.1 | 32 | 91% |
| yagami.Tidus 0.11 | 20 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 68% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 39% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 34 |
| yagami.Tidus 0.11 | 17 | 14% | 36 |
| ejb.Polaris 1.0.1 | 13 | 11% | 20 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 37 |
| kurios.DOSexe .9a | 8 | 7% | 8 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.6 | 124 / 210 | 3.20 | 17.0% | 27795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.0% | 124 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 22 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 21 |
| wompi.Quokka 1.6 | 3.3 | 11.6% | 16 |
| ratosh.Nobo 0.21 | 4.7 | 10.6% | 9 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 9 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.5 | 18 / 35 | 4419 |
| 2 | 1 | 68.5 | 85.1 | 24 / 35 | 5130 |
| 3 | 1 | 63.6 | 71.4 | 18 / 35 | 4428 |
| 4 | 1 | 62.3 | 64.8 | 19 / 35 | 4301 |
| 5 | 1 | 66.2 | 77.1 | 23 / 35 | 4563 |
| 6 | 1 | 68.1 | 84.8 | 22 / 35 | 4954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 39 | 97% |
| bzdp.Pansy 2.1 | 35 | 94% |
| wompi.Quokka 1.6 | 23 | 96% |
| ratosh.Nobo 0.21 | 15 | 73% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |

Hadur died in 87 of 210 rounds, at a mean tick of 365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 17 | 20% | 25 |
| bzdp.Pansy 2.1 | 16 | 18% | 48 |
| wompi.Quokka 1.6 | 10 | 11% | 22 |
| ratosh.Nobo 0.21 | 8 | 9% | 19 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 15 |
| maribo.FollowFire 1 | 8 | 9% | 8 |
| wee.Gem 1.8.4 | 7 | 8% | 46 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 11 |
| m3thos.Eva00 1.1 | 6 | 7% | 14 |

## Melee bench: F15

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.3 | 126 / 210 | 2.23 | 20.5% | 43163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.5% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 22 |
| ayk.WallHugger 1.0 | 4.2 | 10.2% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 4 |
| stuff.Vlad 0.1 | 6.2 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.9 | 22 / 35 | 7293 |
| 2 | 1 | 70.4 | 81.0 | 19 / 35 | 7136 |
| 3 | 1 | 70.6 | 82.5 | 17 / 35 | 7031 |
| 4 | 1 | 71.6 | 86.7 | 22 / 35 | 7198 |
| 5 | 1 | 73.0 | 91.4 | 26 / 35 | 7561 |
| 6 | 1 | 71.3 | 87.6 | 20 / 35 | 6944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 82% |
| mz.NanoGod 2.02 | 15 | 47% |
| ayk.WallHugger 1.0 | 13 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| exauge.GateKeeper 1.1.121g | 6 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 37% | 119 |
| mz.NanoGod 2.02 | 29 | 34% | 40 |
| exauge.GateKeeper 1.1.121g | 10 | 12% | 14 |
| ayk.WallHugger 1.0 | 8 | 9% | 18 |
| stelo.PianistNano 1.2 | 4 | 5% | 7 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 7 |

## Melee bench: F16

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.1 | 114 / 210 | 2.97 | 17.6% | 29833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.6% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 12.8% | 22 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 15 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 0 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 9 |
| dl.BetterWalls 1.0 | 9.3 | 6.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 75.2 | 14 / 35 | 4413 |
| 2 | 1 | 65.1 | 74.9 | 21 / 35 | 4585 |
| 3 | 1 | 66.0 | 75.9 | 19 / 35 | 4926 |
| 4 | 1 | 68.5 | 83.8 | 21 / 35 | 5577 |
| 5 | 1 | 68.2 | 83.8 | 21 / 35 | 5477 |
| 6 | 1 | 65.4 | 75.2 | 18 / 35 | 4855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 92% |
| dummy.micro.Sparrow 2.5 | 32 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 83% |
| bvh.micro.Freya 0.3 | 23 | 70% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 23% | 55 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 16% | 42 |
| bvh.micro.Freya 0.3 | 15 | 16% | 28 |
| dummy.micro.Sparrow 2.5 | 14 | 15% | 37 |
| conscience.Electron 1.3g | 12 | 13% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 8% | 8 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 19 |
| dl.BetterWalls 1.0 | 3 | 3% | 7 |

## Melee bench: F17

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 88.3 | 156 / 210 | 2.05 | 21.4% | 41416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.4% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.4% | 10 |
| supersample.SuperBoxBot 1.0 | 4.5 | 9.8% | 8 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.9% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.4% | 7 |
| tlp.ThreeLeggedPig 1 | 6.3 | 7.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 2 |
| sample.Corners 1.0 | 9.0 | 5.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 82.9 | 23 / 35 | 7079 |
| 2 | 1 | 70.8 | 86.3 | 23 / 35 | 6736 |
| 3 | 1 | 73.2 | 94.6 | 29 / 35 | 7007 |
| 4 | 1 | 72.0 | 89.5 | 26 / 35 | 7011 |
| 5 | 1 | 70.5 | 83.5 | 26 / 35 | 6701 |
| 6 | 1 | 72.6 | 93.0 | 29 / 35 | 6882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 96% |
| sul.Lunar 1.1 | 38 | 100% |
| supersample.SuperBoxBot 1.0 | 33 | 88% |
| dsw.StaticD 1.0 | 13 | 77% |
| sample.Corners 1.0 | 11 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 32% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 21% | 64 |
| dsw.StaticD 1.0 | 8 | 14% | 18 |
| tlp.ThreeLeggedPig 1 | 5 | 9% | 8 |
| sul.Lunar 1.1 | 4 | 7% | 46 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 9 |
| sample.Corners 1.0 | 1 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.5 | 118 / 210 | 2.76 | 18.6% | 37532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.6% | 118 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 31 |
| mld.Wisdom 1.0 | 3.0 | 12.2% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.2% | 18 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.6% | 4 |
| amz.NanoClone 1.41 | 5.5 | 9.8% | 8 |
| sample.Walls 1.0 | 6.8 | 7.9% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.2 | 18 / 35 | 6292 |
| 2 | 1 | 67.1 | 77.8 | 20 / 35 | 5938 |
| 3 | 1 | 68.5 | 78.7 | 20 / 35 | 6839 |
| 4 | 1 | 66.9 | 77.5 | 17 / 35 | 6098 |
| 5 | 1 | 67.0 | 77.5 | 17 / 35 | 5796 |
| 6 | 1 | 70.6 | 88.3 | 26 / 35 | 6569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 89% |
| radnor.DoctorBob 1.42 | 40 | 85% |
| mld.Wisdom 1.0 | 21 | 71% |
| amz.NanoClone 1.41 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| GarmBox.Oranges 1.0 | 7 | 86% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 39% | 50 |
| radnor.DoctorBob 1.42 | 18 | 19% | 54 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 12% | 48 |
| amz.NanoClone 1.41 | 10 | 11% | 17 |
| jangs.ns51 1.0 | 3 | 3% | 10 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

