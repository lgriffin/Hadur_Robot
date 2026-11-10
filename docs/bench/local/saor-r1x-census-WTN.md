# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.1 | 155 / 210 | 1.98 | 21.6% | 42979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.6% | 155 |
| radnor.DoctorBob 1.42 | 2.3 | 14.0% | 21 |
| mld.Infinity 2.2 | 3.3 | 13.1% | 19 |
| mz.AntiGrav 1.0 | 3.3 | 13.0% | 10 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| sample.Walls 1.0 | 6.8 | 6.6% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 8.8 | 4.9% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.0 | 27 / 35 | 7125 |
| 2 | 1 | 71.4 | 87.3 | 24 / 35 | 6953 |
| 3 | 1 | 73.3 | 93.0 | 27 / 35 | 7364 |
| 4 | 1 | 71.5 | 86.7 | 23 / 35 | 6995 |
| 5 | 1 | 74.3 | 94.3 | 29 / 35 | 7736 |
| 6 | 1 | 71.4 | 86.3 | 25 / 35 | 6806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 92% |
| mld.Infinity 2.2 | 50 | 90% |
| radnor.DoctorBob 1.42 | 32 | 88% |
| amz.NanoClone 1.41 | 7 | 86% |
| sample.Target 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 36% | 63 |
| mz.AntiGrav 1.0 | 12 | 22% | 67 |
| amz.NanoClone 1.41 | 11 | 20% | 16 |
| mld.Infinity 2.2 | 8 | 15% | 49 |
| arthord.MannyPacquiao Beta | 2 | 4% | 4 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.6 | 123 / 210 | 2.84 | 17.8% | 31260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.7 | 17.8% | 123 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 44 |
| mld.DustBunny 3.8 | 2.5 | 13.5% | 12 |
| maribo.melee.BMV 0.1 | 4.7 | 10.2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.5% | 10 |
| zyx.nano.Ant 1.1 | 6.2 | 8.3% | 1 |
| bzdp.BoxCar 2.0 | 7.2 | 7.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.9% | 12 |
| fullsail.SweetTea 1.1 | 8.8 | 6.0% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 29 / 35 | 5925 |
| 2 | 1 | 69.8 | 92.4 | 25 / 35 | 5515 |
| 3 | 1 | 68.8 | 85.4 | 22 / 35 | 5555 |
| 4 | 1 | 67.8 | 84.4 | 20 / 35 | 5174 |
| 5 | 5 | 52.2 | 38.4 | 5 / 35 | 4217 |
| 6 | 1 | 68.2 | 85.1 | 22 / 35 | 4874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 56 | 91% |
| oog.melee.Mercutio 1.0 | 56 | 80% |
| djdjdj.NanoSkunk10 1.0 | 9 | 89% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 50% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 20 | 23% | 70 |
| mld.DustBunny 3.8 | 17 | 20% | 65 |
| zyx.nano.Ant 1.1 | 14 | 16% | 17 |
| cs.Grudge 1.0 | 12 | 14% | 13 |
| maribo.melee.BMV 0.1 | 8 | 9% | 15 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 13 |
| fullsail.SweetTea 1.1 | 5 | 6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 8 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 85.5 | 140 / 210 | 2.30 | 20.0% | 36549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.0% | 140 |
| myl.micro.Troodon 1.10 | 2.0 | 13.4% | 27 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 19 |
| fm.mammillarias 1.3 | 5.3 | 9.6% | 6 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.8% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 3 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.0 | 27 / 35 | 6912 |
| 2 | 1 | 68.9 | 81.9 | 22 / 35 | 5791 |
| 3 | 1 | 69.9 | 83.5 | 24 / 35 | 5974 |
| 4 | 1 | 69.7 | 85.4 | 22 / 35 | 5812 |
| 5 | 1 | 68.8 | 81.6 | 21 / 35 | 6025 |
| 6 | 1 | 69.8 | 87.6 | 24 / 35 | 6035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 47 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 81% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| myl.nano.KomoriNinja 1.1 | 20 | 95% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 27% | 46 |
| myl.micro.Troodon 1.10 | 15 | 21% | 60 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 18 |
| fm.mammillarias 1.3 | 10 | 14% | 15 |
| myl.nano.KomoriNinja 1.1 | 6 | 9% | 33 |
| sample.Fire 1.0 | 5 | 7% | 8 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 15 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 11 |
| sample.Tracker 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 84.9 | 145 / 210 | 2.36 | 20.1% | 37923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.1% | 145 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 17 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 20 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.1% | 5 |
| yk.JahMicro 1.0 | 7.3 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 26 / 35 | 6263 |
| 2 | 1 | 68.3 | 77.5 | 21 / 35 | 6068 |
| 3 | 1 | 69.4 | 83.5 | 24 / 35 | 6149 |
| 4 | 1 | 70.5 | 87.6 | 25 / 35 | 6560 |
| 5 | 1 | 70.0 | 83.8 | 26 / 35 | 6632 |
| 6 | 1 | 69.9 | 86.3 | 23 / 35 | 6251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 92% |
| stelo.SoJNanoMelee 1.1 | 41 | 80% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 82% |
| tj.zombie1n 1.0.1 | 10 | 90% |
| yk.JahMicro 1.0 | 8 | 88% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 37% | 81 |
| stelo.SoJNanoMelee 1.1 | 17 | 26% | 36 |
| tj.zombie1n 1.0.1 | 6 | 9% | 11 |
| yk.JahMicro 1.0 | 5 | 8% | 14 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 4 |
| repositorio.NanoStep 1.0 | 2 | 3% | 14 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.6 | 88 / 210 | 3.92 | 15.5% | 28372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.3 | 15.5% | 88 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 44 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.6% | 17 |
| sam.Samspin 1.0 | 5.3 | 10.0% | 13 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.4% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.3 | 19 / 35 | 4833 |
| 2 | 1 | 61.1 | 64.1 | 14 / 35 | 4212 |
| 3 | 1 | 65.6 | 73.7 | 17 / 35 | 5289 |
| 4 | 1 | 63.7 | 71.1 | 14 / 35 | 4803 |
| 5 | 3 | 57.7 | 56.2 | 9 / 35 | 4145 |
| 6 | 1 | 63.3 | 67.0 | 15 / 35 | 5090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 88% |
| oog.melee.Corsair 1.0 | 31 | 58% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 44 |
| ahf.NanoAndrew .4 | 20 | 16% | 33 |
| robar.nano.Assertive_Melee 0.2 | 19 | 16% | 25 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 14 |
| EBBU.Sim2 1.02 | 11 | 9% | 21 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 15 |
| sam.Samspin 1.0 | 4 | 3% | 11 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.5 | 132 / 210 | 2.30 | 19.2% | 32854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.2% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 26 |
| gh.nano.Grofvuil 0.2 | 3.7 | 10.5% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.9% | 16 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.3% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 9 |
| fm.claire 1.7 | 6.3 | 8.6% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.4% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.4 | 16 / 35 | 5366 |
| 2 | 1 | 68.7 | 83.5 | 22 / 35 | 5564 |
| 3 | 1 | 68.6 | 84.4 | 21 / 35 | 5660 |
| 4 | 1 | 69.1 | 87.0 | 23 / 35 | 5366 |
| 5 | 1 | 68.8 | 87.3 | 24 / 35 | 5090 |
| 6 | 1 | 70.4 | 92.4 | 26 / 35 | 5808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 89% |
| oog.melee.CapuletDroid 1.1 | 31 | 90% |
| arthord.NanoSatanMelee Beta | 19 | 79% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 6 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| fm.claire 1.7 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 29% | 79 |
| arthord.NanoSatanMelee Beta | 18 | 23% | 29 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 37 |
| sample.SpinBot 1.0 | 9 | 11% | 13 |
| gh.nano.Grofvuil 0.2 | 8 | 10% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 12 |
| fm.claire 1.7 | 4 | 5% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 10 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.5 | 110 / 210 | 2.57 | 18.4% | 34008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.4% | 110 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.5% | 26 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 31 |
| mz.MicroGodMelee 1 | 3.2 | 13.5% | 35 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.5% | 3 |
| el.JumpShoot 0.2 | 8.3 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.3 | 5.9% | 0 |
| acogdev.alpha 0.2 | 8.5 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.5 | 18 / 35 | 5557 |
| 2 | 1 | 66.0 | 77.5 | 16 / 35 | 5097 |
| 3 | 1 | 66.9 | 80.0 | 16 / 35 | 5157 |
| 4 | 1 | 68.7 | 83.2 | 18 / 35 | 6032 |
| 5 | 1 | 70.4 | 89.2 | 24 / 35 | 6039 |
| 6 | 1 | 68.4 | 81.9 | 18 / 35 | 6126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 55 | 80% |
| mz.MicroGodMelee 1 | 43 | 74% |
| gh.micro.Gruweltje 0.7 | 25 | 68% |
| DBall.Anarchy 0.1 | 13 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 31% | 66 |
| mz.MicroGodMelee 1 | 28 | 28% | 62 |
| gh.micro.Gruweltje 0.7 | 21 | 21% | 43 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 8 |
| fire219.CatBot 1.0 | 6 | 6% | 6 |
| acogdev.alpha 0.2 | 5 | 5% | 8 |
| DBall.Anarchy 0.1 | 2 | 2% | 13 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.4 | 105 / 210 | 3.67 | 16.3% | 30801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.3% | 105 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.5% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 20 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.9% | 9 |
| germ.TheMind .2 | 5.2 | 9.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 8 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 11 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.2% | 5 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 71.4 | 18 / 35 | 5255 |
| 2 | 1 | 68.2 | 84.1 | 22 / 35 | 5313 |
| 3 | 1 | 64.9 | 70.5 | 17 / 35 | 5377 |
| 4 | 1 | 62.1 | 63.2 | 15 / 35 | 5019 |
| 5 | 1 | 62.4 | 65.7 | 17 / 35 | 4588 |
| 6 | 1 | 63.9 | 67.3 | 16 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 95% |
| germ.TheMind .2 | 11 | 82% |
| awesomeness.Elite 1.0 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 39% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 13% | 37 |
| germ.TheMind .2 | 11 | 10% | 19 |
| awesomeness.Elite 1.0 | 10 | 10% | 15 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 12 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 10 |
| sample.Crazy 1.0 | 5 | 5% | 10 |
| mym.EdgeStalker 1.0 | 5 | 5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 5 |

## Melee bench: F09

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.2 | 160 / 210 | 1.89 | 20.4% | 31327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.4% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 11 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 4 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.0% | 4 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 8.5 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 28 / 35 | 5133 |
| 2 | 1 | 70.5 | 86.3 | 24 / 35 | 5179 |
| 3 | 1 | 70.9 | 91.4 | 27 / 35 | 5167 |
| 4 | 1 | 70.7 | 88.9 | 27 / 35 | 5031 |
| 5 | 1 | 71.3 | 91.7 | 29 / 35 | 5516 |
| 6 | 1 | 71.0 | 92.1 | 25 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 95% |
| nz.jdc.nano.GridFu 1.0 | 32 | 97% |
| stelo.PatternRobot 1.0 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| maribo.IotaCT 1.1 | 10 | 100% |
| spinnercat.Omen 1.0 | 9 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |

Hadur died in 50 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 15 | 30% | 28 |
| rz.HawkOnFire 0.1 | 13 | 26% | 84 |
| ratosh.Wesco 1.4 | 6 | 12% | 17 |
| nz.jdc.nano.GridFu 1.0 | 5 | 10% | 37 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 7 |
| stelo.PatternRobot 1.0 | 3 | 6% | 9 |
| maribo.IotaCT 1.1 | 1 | 2% | 15 |
| spinnercat.Omen 1.0 | 1 | 2% | 11 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.4 | 170 / 210 | 1.68 | 21.6% | 39345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.6% | 170 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 14 |
| baal.nano.N 1.42 | 2.7 | 11.4% | 7 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.4% | 3 |
| zyx.micro.Ant 1.1 | 5.2 | 8.7% | 5 |
| sanja.First 0.1 | 6.7 | 8.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.9% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 29 / 35 | 6188 |
| 2 | 1 | 70.8 | 89.2 | 29 / 35 | 6361 |
| 3 | 1 | 72.8 | 97.1 | 29 / 35 | 6904 |
| 4 | 1 | 72.3 | 96.5 | 31 / 35 | 6521 |
| 5 | 1 | 72.0 | 93.3 | 29 / 35 | 6770 |
| 6 | 1 | 70.1 | 86.0 | 23 / 35 | 6601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 91% |
| cvt.Firsty 1.0 | 34 | 91% |
| baal.nano.N 1.42 | 29 | 93% |
| sanja.First 0.1 | 24 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| amk.Punbot.Punbot 0.01 | 15 | 93% |
| zyx.micro.Ant 1.1 | 12 | 83% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 27% | 32 |
| tvv.nano.Polaris 1.2 | 8 | 20% | 52 |
| baal.nano.N 1.42 | 6 | 15% | 34 |
| cvt.Firsty 1.0 | 5 | 12% | 23 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 20 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 12 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 14 |
| sample.RamFire 1.0 | 2 | 5% | 2 |
| sanja.First 0.1 | 0 | 0% | 16 |

## Melee bench: F11

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 63.1 | 68 / 210 | 4.32 | 14.4% | 29655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.2% | 75 |
| hadur117.micro.SaorWTN 0.1 | 1.8 | 14.4% | 68 |
| cs.Wren 1.0 | 3.2 | 12.6% | 19 |
| js.PinBall 1.6 | 4.3 | 11.5% | 18 |
| mz.Cork 0.1 | 4.7 | 11.1% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 5 |
| evd.X1 0.01 | 6.7 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 61.9 | 9 / 35 | 4955 |
| 2 | 3 | 58.3 | 53.7 | 9 / 35 | 5076 |
| 3 | 1 | 64.4 | 72.1 | 15 / 35 | 4814 |
| 4 | 2 | 60.8 | 63.8 | 10 / 35 | 4405 |
| 5 | 1 | 64.3 | 69.2 | 16 / 35 | 5611 |
| 6 | 2 | 58.7 | 58.1 | 9 / 35 | 4794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 61% |
| cs.Wren 1.0 | 25 | 84% |
| js.PinBall 1.6 | 5 | 60% |
| mz.Cork 0.1 | 4 | 50% |
| joe.ADinosaur 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 142 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 40% | 94 |
| cs.Wren 1.0 | 22 | 15% | 33 |
| evd.X1 0.01 | 18 | 13% | 19 |
| joe.ADinosaur 1.0 | 15 | 11% | 17 |
| js.PinBall 1.6 | 11 | 8% | 17 |
| PSW.Relentless 0.1 | 11 | 8% | 12 |
| mz.Cork 0.1 | 5 | 4% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.9 | 129 / 210 | 2.63 | 18.6% | 28984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.6% | 129 |
| ntc.Opposite 1.5 | 2.3 | 11.6% | 10 |
| myl.nano.Graviton 1.10 | 3.7 | 11.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.2% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.8% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 9 |
| DBall.NUKE 0.1 | 7.7 | 8.1% | 10 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.6 | 22 / 35 | 5155 |
| 2 | 1 | 69.6 | 87.6 | 25 / 35 | 5073 |
| 3 | 1 | 66.6 | 75.6 | 22 / 35 | 4477 |
| 4 | 1 | 64.5 | 73.7 | 16 / 35 | 4426 |
| 5 | 1 | 68.5 | 86.0 | 22 / 35 | 4883 |
| 6 | 1 | 69.0 | 87.9 | 22 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 76% |
| myl.nano.Graviton 1.10 | 28 | 89% |
| ntc.Opposite 1.5 | 23 | 91% |
| disan.Chair 2.2.0 | 16 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| DBall.NUKE 0.1 | 10 | 100% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 22% | 43 |
| myl.nano.Graviton 1.10 | 14 | 17% | 40 |
| ntc.Opposite 1.5 | 14 | 17% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 14% | 27 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 17 |
| disan.Chair 2.2.0 | 6 | 7% | 19 |
| pbg.R2D2 1.0 | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 15 |
| donjezza.Muncho 1.0 | 3 | 4% | 12 |

## Melee bench: F13

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.2 | 82 / 210 | 3.32 | 16.2% | 27541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.2% | 82 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 32 |
| oog.melee.Capulet 1.2 | 3.2 | 13.4% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.9% | 29 |
| yagami.Tidus 0.11 | 4.8 | 12.2% | 17 |
| ejb.Polaris 1.0.1 | 5.7 | 11.1% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.0 | 14 / 35 | 4567 |
| 2 | 1 | 67.3 | 81.0 | 18 / 35 | 4695 |
| 3 | 1 | 65.6 | 74.3 | 12 / 35 | 4647 |
| 4 | 1 | 65.0 | 73.0 | 12 / 35 | 4644 |
| 5 | 1 | 67.3 | 82.5 | 16 / 35 | 4693 |
| 6 | 1 | 60.9 | 61.3 | 10 / 35 | 4295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 97% |
| oog.melee.Capulet 1.2 | 29 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| yagami.Tidus 0.11 | 15 | 100% |
| ejb.Polaris 1.0.1 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 37% | 63 |
| yagami.Tidus 0.11 | 22 | 17% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 42 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 39 |
| ejb.Polaris 1.0.1 | 10 | 8% | 16 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.9 | 134 / 210 | 2.81 | 17.7% | 27567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.7% | 134 |
| wee.Gem 1.8.4 | 2.7 | 12.2% | 29 |
| bzdp.Pansy 2.1 | 3.5 | 11.9% | 13 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 18 |
| ratosh.Nobo 0.21 | 4.5 | 10.9% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 9.3% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.0% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 25 / 35 | 4812 |
| 2 | 1 | 67.5 | 85.1 | 23 / 35 | 4427 |
| 3 | 1 | 65.1 | 75.2 | 22 / 35 | 4470 |
| 4 | 1 | 67.1 | 80.3 | 23 / 35 | 4785 |
| 5 | 1 | 68.4 | 85.4 | 25 / 35 | 4842 |
| 6 | 1 | 63.3 | 71.4 | 16 / 35 | 4231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 94% |
| wee.Gem 1.8.4 | 36 | 97% |
| wompi.Quokka 1.6 | 24 | 92% |
| ratosh.Nobo 0.21 | 11 | 91% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 21% | 62 |
| ratosh.Nobo 0.21 | 10 | 13% | 24 |
| maribo.FollowFire 1 | 10 | 13% | 10 |
| wompi.Quokka 1.6 | 9 | 12% | 23 |
| wee.Gem 1.8.4 | 7 | 9% | 49 |
| m3thos.Eva00 1.1 | 7 | 9% | 15 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 9 |
| bayen.UbaMicro 1.4 | 6 | 8% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.1 | 127 / 210 | 2.16 | 21.0% | 46306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.0% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 20 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 5 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 92.1 | 22 / 35 | 8713 |
| 2 | 1 | 69.6 | 79.0 | 15 / 35 | 7213 |
| 3 | 1 | 71.8 | 85.4 | 24 / 35 | 7293 |
| 4 | 1 | 71.9 | 84.8 | 23 / 35 | 7916 |
| 5 | 1 | 73.2 | 90.5 | 20 / 35 | 7953 |
| 6 | 1 | 72.3 | 90.8 | 23 / 35 | 7218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 76% |
| mz.NanoGod 2.02 | 18 | 61% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 49% | 138 |
| mz.NanoGod 2.02 | 21 | 25% | 32 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 12 |
| ayk.WallHugger 1.0 | 7 | 8% | 9 |
| stelo.PianistNano 1.2 | 5 | 6% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 9 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.4 | 105 / 210 | 3.57 | 16.6% | 29414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.6% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 27 |
| bvh.micro.Freya 0.3 | 3.3 | 11.9% | 21 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.2% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 9 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 6 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 69.2 | 19 / 35 | 4183 |
| 2 | 1 | 65.5 | 74.0 | 18 / 35 | 5099 |
| 3 | 1 | 68.0 | 81.3 | 19 / 35 | 5447 |
| 4 | 1 | 62.9 | 64.1 | 18 / 35 | 4592 |
| 5 | 1 | 64.6 | 73.0 | 16 / 35 | 4881 |
| 6 | 1 | 63.7 | 67.0 | 15 / 35 | 5212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 81% |
| dummy.micro.Sparrow 2.5 | 20 | 85% |
| bvh.micro.Freya 0.3 | 19 | 68% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 18 | 17% | 37 |
| voidious.micro.BlitzBat 1.05 | 17 | 16% | 54 |
| conscience.Electron 1.3g | 16 | 15% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 40 |
| bvh.micro.Freya 0.3 | 13 | 12% | 27 |
| dl.BetterWalls 1.0 | 7 | 7% | 9 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 8 |

## Melee bench: F17

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.7 | 151 / 210 | 2.20 | 20.9% | 40341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.9% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 21 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 13 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.0% | 8 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.8% | 8 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.5% | 1 |
| sample.Corners 1.0 | 9.0 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 84.4 | 24 / 35 | 6525 |
| 2 | 1 | 70.5 | 87.0 | 26 / 35 | 6174 |
| 3 | 1 | 72.6 | 89.5 | 25 / 35 | 7512 |
| 4 | 1 | 70.0 | 82.5 | 23 / 35 | 6674 |
| 5 | 1 | 72.2 | 92.7 | 30 / 35 | 6732 |
| 6 | 1 | 70.5 | 83.8 | 23 / 35 | 6724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 91% |
| sul.Lunar 1.1 | 43 | 100% |
| supersample.SuperBoxBot 1.0 | 35 | 91% |
| sample.Corners 1.0 | 11 | 100% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 29% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 25% | 67 |
| dsw.StaticD 1.0 | 9 | 15% | 16 |
| mme.NikeEnhanced 2.0 | 7 | 12% | 12 |
| sul.Lunar 1.1 | 6 | 10% | 52 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 10 |
| sample.Corners 1.0 | 0 | 0% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.3 | 107 / 210 | 2.96 | 17.9% | 36595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.9% | 107 |
| radnor.DoctorBob 1.42 | 3.0 | 12.4% | 24 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.6% | 25 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.7% | 6 |
| amz.NanoClone 1.41 | 5.2 | 10.5% | 16 |
| sample.Walls 1.0 | 7.5 | 7.3% | 6 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 73.3 | 12 / 35 | 6024 |
| 2 | 1 | 64.9 | 69.8 | 14 / 35 | 6005 |
| 3 | 1 | 68.4 | 81.0 | 18 / 35 | 6560 |
| 4 | 1 | 66.8 | 79.7 | 19 / 35 | 5533 |
| 5 | 1 | 68.3 | 83.5 | 22 / 35 | 6007 |
| 6 | 1 | 68.6 | 82.2 | 22 / 35 | 6466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 81% |
| radnor.DoctorBob 1.42 | 30 | 83% |
| mld.Wisdom 1.0 | 13 | 62% |
| amz.NanoClone 1.41 | 10 | 60% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| jangs.ns51 1.0 | 9 | 89% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 27% | 38 |
| KiraNL.Chupacabra 0.4 | 18 | 17% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 60 |
| amz.NanoClone 1.41 | 15 | 15% | 21 |
| radnor.DoctorBob 1.42 | 14 | 14% | 41 |
| jangs.ns51 1.0 | 6 | 6% | 9 |
| sample.Walls 1.0 | 4 | 4% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

