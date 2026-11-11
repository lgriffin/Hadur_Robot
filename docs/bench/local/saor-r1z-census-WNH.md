# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 84.9 | 139 / 210 | 2.36 | 20.3% | 42203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.3% | 139 |
| radnor.DoctorBob 1.42 | 2.5 | 14.3% | 30 |
| mz.AntiGrav 1.0 | 3.0 | 14.1% | 19 |
| mld.Infinity 2.2 | 3.5 | 13.9% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| sample.Walls 1.0 | 6.5 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 76.5 | 21 / 35 | 6714 |
| 2 | 1 | 69.7 | 81.9 | 22 / 35 | 6402 |
| 3 | 1 | 71.5 | 87.0 | 21 / 35 | 7110 |
| 4 | 1 | 71.9 | 87.6 | 25 / 35 | 7388 |
| 5 | 1 | 71.5 | 88.3 | 24 / 35 | 6996 |
| 6 | 1 | 72.1 | 87.9 | 26 / 35 | 7593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 93% |
| mld.Infinity 2.2 | 38 | 92% |
| radnor.DoctorBob 1.42 | 31 | 90% |
| amz.NanoClone 1.41 | 5 | 60% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 31% | 61 |
| amz.NanoClone 1.41 | 14 | 20% | 18 |
| mz.AntiGrav 1.0 | 11 | 15% | 62 |
| mld.Infinity 2.2 | 11 | 15% | 46 |
| jangs.ns51 1.0 | 4 | 6% | 5 |
| sample.Walls 1.0 | 3 | 4% | 7 |
| arthord.MannyPacquiao Beta | 3 | 4% | 7 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |

## Melee bench: F02

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.6 | 122 / 210 | 2.11 | 18.8% | 32138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.8% | 122 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 47 |
| mld.DustBunny 3.8 | 3.3 | 12.7% | 20 |
| maribo.melee.BMV 0.1 | 3.7 | 10.4% | 6 |
| zyx.nano.Ant 1.1 | 5.0 | 9.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 9 |
| fullsail.SweetTea 1.1 | 7.8 | 7.4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 6.8% | 2 |
| bzdp.BoxCar 2.0 | 8.5 | 7.2% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.2 | 19 / 35 | 5340 |
| 2 | 1 | 68.2 | 85.4 | 22 / 35 | 5479 |
| 3 | 1 | 69.5 | 91.1 | 23 / 35 | 5746 |
| 4 | 1 | 67.0 | 82.9 | 15 / 35 | 5205 |
| 5 | 1 | 68.4 | 87.6 | 22 / 35 | 5188 |
| 6 | 1 | 69.0 | 89.5 | 21 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 64% |
| mld.DustBunny 3.8 | 56 | 80% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| maribo.melee.BMV 0.1 | 12 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 82% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 34% | 73 |
| mld.DustBunny 3.8 | 28 | 32% | 64 |
| maribo.melee.BMV 0.1 | 9 | 10% | 17 |
| fullsail.SweetTea 1.1 | 7 | 8% | 12 |
| zyx.nano.Ant 1.1 | 6 | 7% | 13 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 2% | 13 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 79.1 | 105 / 210 | 2.88 | 18.5% | 36550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.5% | 105 |
| myl.micro.Troodon 1.10 | 2.2 | 14.7% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.8% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.2% | 24 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 7 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.3% | 9 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 82.2 | 22 / 35 | 6864 |
| 2 | 1 | 67.5 | 77.8 | 16 / 35 | 5964 |
| 3 | 1 | 69.0 | 81.9 | 18 / 35 | 6210 |
| 4 | 1 | 66.9 | 77.1 | 18 / 35 | 5648 |
| 5 | 1 | 67.2 | 78.7 | 14 / 35 | 5949 |
| 6 | 1 | 67.4 | 76.8 | 17 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 36 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 81% |
| sp.Nanos.Ember 1.1 | 16 | 94% |
| myl.nano.KomoriNinja 1.1 | 15 | 67% |
| cb.nano.Insomnia 1.0 | 11 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 25% | 42 |
| myl.micro.Troodon 1.10 | 23 | 22% | 58 |
| fm.mammillarias 1.3 | 16 | 15% | 23 |
| myl.nano.KomoriNinja 1.1 | 14 | 13% | 30 |
| cb.nano.Insomnia 1.0 | 14 | 13% | 16 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 7 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 26 |
| sample.Fire 1.0 | 1 | 1% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.1 | 152 / 210 | 1.90 | 21.0% | 39796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 21.0% | 152 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 19 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.2% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.5% | 20 |
| tj.zombie1n 1.0.1 | 6.0 | 8.6% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.8% | 2 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 9.2 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.8 | 29 / 35 | 6066 |
| 2 | 1 | 71.4 | 92.4 | 26 / 35 | 6729 |
| 3 | 1 | 70.2 | 87.0 | 22 / 35 | 6626 |
| 4 | 1 | 71.3 | 91.4 | 25 / 35 | 6930 |
| 5 | 1 | 70.2 | 88.3 | 24 / 35 | 6412 |
| 6 | 1 | 71.7 | 90.5 | 26 / 35 | 7033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 90% |
| stelo.SoJNanoMelee 1.1 | 53 | 85% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 88% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% |

Hadur died in 59 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 15 | 25% | 79 |
| stelo.SoJNanoMelee 1.1 | 12 | 20% | 41 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 17% | 13 |
| tj.zombie1n 1.0.1 | 9 | 15% | 11 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 24 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 22 |
| yk.JahMicro 1.0 | 4 | 7% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.5 | 86 / 210 | 3.56 | 16.0% | 30723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 16.0% | 86 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 48 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 22 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 24 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 9 |
| sam.Samspin 1.0 | 5.3 | 10.1% | 15 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 65.4 | 11 / 35 | 4726 |
| 2 | 1 | 66.4 | 79.7 | 18 / 35 | 5412 |
| 3 | 1 | 64.1 | 71.1 | 15 / 35 | 5413 |
| 4 | 1 | 63.3 | 70.5 | 16 / 35 | 4969 |
| 5 | 1 | 63.7 | 71.1 | 14 / 35 | 4976 |
| 6 | 1 | 64.1 | 71.4 | 12 / 35 | 5227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 82% |
| oog.melee.Corsair 1.0 | 25 | 60% |
| ahf.NanoAndrew .4 | 19 | 89% |
| EBBU.Sim2 1.02 | 14 | 100% |
| sam.Samspin 1.0 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 67% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 39 |
| ahf.NanoAndrew .4 | 18 | 14% | 41 |
| simonton.nano.MeleeSeed 1.8 | 17 | 13% | 42 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 20 |
| EBBU.Sim2 1.02 | 13 | 10% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 11 |
| sam.Samspin 1.0 | 9 | 7% | 17 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.9 | 113 / 210 | 2.90 | 17.6% | 31570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 17.6% | 113 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.4% | 36 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.1% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 9 |
| fm.claire 1.7 | 6.2 | 8.4% | 2 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.4% | 7 |
| sample.SpinBot 1.0 | 8.0 | 7.3% | 1 |
| kurios.DOSexe .9b | 9.2 | 6.2% | 3 |
| pa.Improved 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.3 | 19 / 35 | 5279 |
| 2 | 1 | 64.6 | 73.7 | 17 / 35 | 4808 |
| 3 | 1 | 68.7 | 86.7 | 19 / 35 | 5637 |
| 4 | 1 | 64.2 | 73.3 | 15 / 35 | 5022 |
| 5 | 1 | 67.5 | 78.7 | 22 / 35 | 5560 |
| 6 | 1 | 66.7 | 80.0 | 21 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 88% |
| oog.melee.CapuletDroid 1.1 | 33 | 100% |
| arthord.NanoSatanMelee Beta | 13 | 100% |
| gh.nano.Grofvuil 0.2 | 11 | 64% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| fm.claire 1.7 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 30% | 77 |
| gh.nano.Grofvuil 0.2 | 19 | 19% | 33 |
| arthord.NanoSatanMelee Beta | 13 | 13% | 17 |
| fm.claire 1.7 | 9 | 9% | 10 |
| winamp32.micro.MicroMacro 1.0 | 8 | 8% | 15 |
| oog.melee.CapuletDroid 1.1 | 6 | 6% | 35 |
| kurios.DOSexe .9b | 5 | 5% | 8 |
| sample.SpinBot 1.0 | 5 | 5% | 8 |
| pa.Improved 1.0 | 4 | 4% | 7 |

## Melee bench: F07

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.0 | 78 / 210 | 3.34 | 16.5% | 33107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.3 | 16.5% | 78 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.6% | 46 |
| mz.MicroGodMelee 1 | 3.2 | 13.5% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.8% | 33 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 3 |
| acogdev.alpha 0.2 | 7.7 | 6.4% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 3 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.1 | 20 / 35 | 5801 |
| 2 | 1 | 65.8 | 78.1 | 14 / 35 | 5431 |
| 3 | 2 | 64.7 | 73.0 | 8 / 35 | 5514 |
| 4 | 1 | 65.1 | 73.0 | 13 / 35 | 5333 |
| 5 | 1 | 65.1 | 72.7 | 14 / 35 | 5367 |
| 6 | 2 | 64.0 | 68.9 | 9 / 35 | 5661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 38 | 89% |
| mz.MicroGodMelee 1 | 34 | 44% |
| gh.micro.Gruweltje 0.7 | 24 | 63% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 50 | 38% | 68 |
| gh.micro.Gruweltje 0.7 | 31 | 23% | 46 |
| spinnercat.micro.Tyger 0.1 | 26 | 20% | 55 |
| caimano.Furia_Ceca 0.22 | 9 | 7% | 11 |
| acogdev.alpha 0.2 | 7 | 5% | 7 |
| fire219.CatBot 1.0 | 5 | 4% | 6 |
| el.JumpShoot 0.2 | 4 | 3% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 71.9 | 97 / 210 | 3.53 | 16.6% | 33194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.3 | 16.6% | 97 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.6% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.8% | 33 |
| germ.TheMind .2 | 5.5 | 9.3% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.7 | 8.9% | 7 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 8 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.6% | 1 |
| sample.Crazy 1.0 | 8.2 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.2 | 19 / 35 | 5656 |
| 2 | 2 | 62.5 | 63.2 | 13 / 35 | 5437 |
| 3 | 2 | 64.3 | 69.2 | 18 / 35 | 5306 |
| 4 | 1 | 65.0 | 70.8 | 16 / 35 | 5418 |
| 5 | 1 | 64.9 | 72.7 | 14 / 35 | 5338 |
| 6 | 1 | 66.7 | 73.3 | 17 / 35 | 6039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| awesomeness.Elite 1.0 | 9 | 56% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| sample.Crazy 1.0 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| germ.TheMind .2 | 4 | 50% |

Hadur died in 113 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 51 | 45% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 38 |
| germ.TheMind .2 | 14 | 12% | 18 |
| awesomeness.Elite 1.0 | 10 | 9% | 15 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.3 | 120 / 210 | 2.68 | 18.2% | 30410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.2% | 120 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.8% | 11 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 19 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.2% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.4% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 8.0 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 8.1% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.1 | 17 / 35 | 4677 |
| 2 | 1 | 68.3 | 81.3 | 22 / 35 | 5120 |
| 3 | 1 | 70.1 | 87.3 | 24 / 35 | 5356 |
| 4 | 1 | 67.5 | 79.4 | 21 / 35 | 5062 |
| 5 | 1 | 68.8 | 86.0 | 22 / 35 | 5337 |
| 6 | 1 | 65.8 | 76.8 | 14 / 35 | 4858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 88% |
| nz.jdc.nano.GridFu 1.0 | 30 | 93% |
| stelo.PatternRobot 1.0 | 20 | 90% |
| timmit.nano.TimDog 0.33 | 12 | 58% |
| spinnercat.Omen 1.0 | 10 | 100% |
| maribo.IotaCT 1.1 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 27% | 63 |
| nz.jdc.nano.GridFu 1.0 | 18 | 20% | 48 |
| timmit.nano.TimDog 0.33 | 17 | 19% | 26 |
| stelo.PatternRobot 1.0 | 10 | 11% | 23 |
| maribo.IotaCT 1.1 | 9 | 10% | 22 |
| ratosh.Wesco 1.4 | 7 | 8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 7 |

## Melee bench: F10

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 86.7 | 146 / 210 | 2.20 | 20.0% | 37230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.0% | 146 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.5% | 23 |
| baal.nano.N 1.42 | 3.2 | 11.5% | 9 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.2% | 4 |
| zyx.micro.Ant 1.1 | 5.0 | 9.4% | 14 |
| sanja.First 0.1 | 6.5 | 8.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.5% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 3 |
| cvt.Firsty 1.0 | 8.3 | 6.7% | 6 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 84.8 | 25 / 35 | 6562 |
| 2 | 1 | 71.3 | 91.7 | 27 / 35 | 6681 |
| 3 | 1 | 68.8 | 84.8 | 21 / 35 | 5951 |
| 4 | 1 | 69.6 | 86.7 | 25 / 35 | 6028 |
| 5 | 1 | 69.9 | 88.3 | 26 / 35 | 5952 |
| 6 | 1 | 68.6 | 84.1 | 22 / 35 | 6056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 88% |
| baal.nano.N 1.42 | 27 | 93% |
| cvt.Firsty 1.0 | 19 | 89% |
| zyx.micro.Ant 1.1 | 19 | 79% |
| sanja.First 0.1 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 21 | 32% | 39 |
| tvv.nano.Polaris 1.2 | 12 | 18% | 49 |
| baal.nano.N 1.42 | 7 | 11% | 27 |
| Grystrion.TrackerWO 1.0 | 6 | 9% | 21 |
| cvt.Firsty 1.0 | 5 | 8% | 24 |
| sanja.First 0.1 | 4 | 6% | 28 |
| squidM.TentalceMeleeNano 1.1 | 4 | 6% | 10 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 8 |
| sample.RamFire 1.0 | 3 | 5% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 65.7 | 67 / 210 | 4.09 | 14.7% | 30497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 84 |
| hadur117.micro.SaorWNH 0.1 | 1.7 | 14.7% | 67 |
| cs.Wren 1.0 | 3.0 | 12.8% | 21 |
| js.PinBall 1.6 | 4.3 | 11.5% | 15 |
| mz.Cork 0.1 | 4.8 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 4 |
| evd.X1 0.01 | 6.8 | 8.2% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 68.3 | 15 / 35 | 5175 |
| 2 | 2 | 61.6 | 65.4 | 11 / 35 | 4816 |
| 3 | 2 | 62.8 | 67.9 | 13 / 35 | 5272 |
| 4 | 1 | 62.8 | 67.9 | 11 / 35 | 5417 |
| 5 | 2 | 60.3 | 61.9 | 7 / 35 | 4849 |
| 6 | 2 | 61.4 | 62.5 | 10 / 35 | 4968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 41 | 59% |
| cs.Wren 1.0 | 22 | 86% |
| js.PinBall 1.6 | 10 | 90% |
| mz.Cork 0.1 | 8 | 75% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 39% | 90 |
| cs.Wren 1.0 | 25 | 17% | 36 |
| joe.ADinosaur 1.0 | 16 | 11% | 16 |
| evd.X1 0.01 | 14 | 10% | 15 |
| mz.Cork 0.1 | 12 | 8% | 20 |
| js.PinBall 1.6 | 8 | 6% | 16 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.7 | 121 / 210 | 2.82 | 18.3% | 31110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.3% | 121 |
| ntc.Opposite 1.5 | 2.8 | 11.2% | 5 |
| myl.nano.Graviton 1.10 | 3.2 | 11.7% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.0% | 6 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.6% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 10 |
| DBall.NUKE 0.1 | 7.3 | 8.4% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.7% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.5 | 22 / 35 | 5443 |
| 2 | 1 | 68.0 | 79.0 | 23 / 35 | 5465 |
| 3 | 1 | 67.5 | 80.0 | 21 / 35 | 5028 |
| 4 | 1 | 67.0 | 80.3 | 18 / 35 | 5395 |
| 5 | 1 | 65.6 | 76.8 | 17 / 35 | 4770 |
| 6 | 1 | 66.8 | 79.7 | 20 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 86% |
| myl.nano.Graviton 1.10 | 29 | 93% |
| DBall.NUKE 0.1 | 19 | 100% |
| donjezza.Muncho 1.0 | 15 | 93% |
| ntc.Opposite 1.5 | 13 | 85% |
| disan.Chair 2.2.0 | 10 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| pbg.R2D2 1.0 | 4 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 33% |

Hadur died in 90 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 19% | 45 |
| stelo.AreaTargetingBot 1.1 | 16 | 18% | 41 |
| pfvicm.Sobieski 7.2.3b | 16 | 18% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 24 |
| ntc.Opposite 1.5 | 11 | 12% | 22 |
| disan.Chair 2.2.0 | 9 | 10% | 12 |
| donjezza.Muncho 1.0 | 3 | 3% | 17 |
| DBall.NUKE 0.1 | 2 | 2% | 15 |
| pbg.R2D2 1.0 | 2 | 2% | 12 |

## Melee bench: F13

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 66.0 | 58 / 210 | 4.06 | 14.3% | 26232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 2.2 | 14.3% | 58 |
| oog.melee.Capulet 1.2 | 2.3 | 14.0% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.3% | 33 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.6% | 38 |
| yagami.Tidus 0.11 | 4.5 | 12.4% | 18 |
| ejb.Polaris 1.0.1 | 5.8 | 10.9% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 66.7 | 11 / 35 | 4218 |
| 2 | 1 | 63.7 | 70.8 | 11 / 35 | 4623 |
| 3 | 2 | 61.2 | 65.7 | 9 / 35 | 4271 |
| 4 | 3 | 60.8 | 61.0 | 9 / 35 | 4174 |
| 5 | 5 | 59.2 | 57.1 | 6 / 35 | 4304 |
| 6 | 1 | 64.9 | 74.6 | 12 / 35 | 4642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 21 | 90% |
| oog.melee.Capulet 1.2 | 17 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 73% |
| yagami.Tidus 0.11 | 15 | 80% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 39% | 72 |
| yagami.Tidus 0.11 | 25 | 16% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 14% | 38 |
| kawigi.micro.Shiz 1.1 | 17 | 11% | 33 |
| ejb.Polaris 1.0.1 | 11 | 7% | 17 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.9 | 117 / 210 | 3.17 | 16.7% | 27357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 16.7% | 117 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 14 |
| wee.Gem 1.8.4 | 2.8 | 12.1% | 34 |
| wompi.Quokka 1.6 | 4.5 | 11.3% | 17 |
| ratosh.Nobo 0.21 | 4.5 | 11.2% | 11 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 15 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 77.1 | 20 / 35 | 4260 |
| 2 | 1 | 61.8 | 66.0 | 16 / 35 | 4230 |
| 3 | 1 | 65.7 | 76.8 | 22 / 35 | 4727 |
| 4 | 1 | 63.6 | 71.4 | 18 / 35 | 4323 |
| 5 | 1 | 65.6 | 78.7 | 21 / 35 | 4328 |
| 6 | 1 | 68.5 | 85.4 | 20 / 35 | 5489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 90% |
| wee.Gem 1.8.4 | 29 | 90% |
| wompi.Quokka 1.6 | 19 | 95% |
| m3thos.Eva00 1.1 | 11 | 82% |
| ratosh.Nobo 0.21 | 10 | 70% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jeremyreeder.Vincent 2011.12.09 | 15 | 16% | 17 |
| wee.Gem 1.8.4 | 14 | 15% | 44 |
| maribo.FollowFire 1 | 14 | 15% | 13 |
| wompi.Quokka 1.6 | 12 | 13% | 31 |
| ratosh.Nobo 0.21 | 11 | 12% | 21 |
| m3thos.Eva00 1.1 | 11 | 12% | 20 |
| bzdp.Pansy 2.1 | 8 | 9% | 49 |
| bayen.UbaMicro 1.4 | 4 | 4% | 10 |
| stelo.MyAgileRobot 0.2 | 4 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 82.7 | 111 / 210 | 2.56 | 19.9% | 44785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.2 | 19.9% | 111 |
| wompi.Wallaby 5.1 | 1.8 | 18.6% | 74 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 19 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.9% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 76.8 | 16 / 35 | 6474 |
| 2 | 1 | 72.3 | 87.6 | 20 / 35 | 7677 |
| 3 | 1 | 69.9 | 78.4 | 16 / 35 | 7514 |
| 4 | 1 | 72.4 | 87.3 | 21 / 35 | 7731 |
| 5 | 1 | 71.0 | 82.9 | 19 / 35 | 7504 |
| 6 | 1 | 71.5 | 83.2 | 19 / 35 | 7885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 73% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| mz.NanoGod 2.02 | 9 | 89% |
| ayk.WallHugger 1.0 | 7 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 50% |

Hadur died in 100 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 56 | 56% | 141 |
| mz.NanoGod 2.02 | 17 | 17% | 29 |
| ayk.WallHugger 1.0 | 11 | 11% | 16 |
| exauge.GateKeeper 1.1.121g | 10 | 10% | 13 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 68.6 | 90 / 210 | 3.83 | 15.4% | 27758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 15.4% | 90 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 30 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.3% | 22 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.7% | 24 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.8% | 11 |
| conscience.Electron 1.3g | 7.0 | 8.6% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.8% | 4 |
| ap.Frederick 1.1 | 9.2 | 6.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 61.9 | 13 / 35 | 4817 |
| 2 | 1 | 67.1 | 81.9 | 21 / 35 | 4885 |
| 3 | 1 | 61.1 | 65.1 | 12 / 35 | 4313 |
| 4 | 1 | 63.0 | 68.3 | 15 / 35 | 4663 |
| 5 | 1 | 63.6 | 69.8 | 17 / 35 | 4667 |
| 6 | 1 | 60.6 | 64.4 | 12 / 35 | 4413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 80% |
| dummy.micro.Sparrow 2.5 | 30 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 63% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 23% | 56 |
| mn.nano.perceptual.Impact 1.3.0 | 22 | 18% | 18 |
| conscience.Electron 1.3g | 19 | 16% | 21 |
| dummy.micro.Sparrow 2.5 | 15 | 13% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 9% | 28 |
| dl.BetterWalls 1.0 | 10 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 16 |
| bvh.micro.Freya 0.3 | 8 | 7% | 16 |

## Melee bench: F17

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.7 | 137 / 210 | 2.10 | 20.9% | 42505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.9% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 15 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 13 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.6% | 16 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 11 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.0% | 6 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.8% | 6 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.5 | 23 / 35 | 7536 |
| 2 | 1 | 69.4 | 81.0 | 20 / 35 | 6709 |
| 3 | 1 | 71.6 | 89.5 | 26 / 35 | 6983 |
| 4 | 1 | 72.1 | 92.7 | 25 / 35 | 7128 |
| 5 | 1 | 69.7 | 85.1 | 17 / 35 | 6724 |
| 6 | 1 | 71.9 | 87.6 | 26 / 35 | 7425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 41 | 95% |
| sul.Lunar 1.1 | 39 | 97% |
| supersample.SuperBoxBot 1.0 | 30 | 87% |
| dsw.StaticD 1.0 | 12 | 42% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 3 | 67% |

Hadur died in 73 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 33% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 23% | 57 |
| dsw.StaticD 1.0 | 11 | 15% | 17 |
| sul.Lunar 1.1 | 6 | 8% | 50 |
| mme.NikeEnhanced 2.0 | 6 | 8% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 5% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 10 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 72.2 | 92 / 210 | 3.50 | 16.5% | 34880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 16.5% | 92 |
| mld.Wisdom 1.0 | 2.8 | 12.4% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 12.4% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.5% | 27 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 13 |
| amz.NanoClone 1.41 | 5.8 | 10.2% | 14 |
| sample.Walls 1.0 | 7.0 | 8.4% | 8 |
| GarmBox.Oranges 1.0 | 8.2 | 7.3% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 5 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 75.6 | 16 / 35 | 5805 |
| 2 | 1 | 67.7 | 77.1 | 19 / 35 | 6664 |
| 3 | 1 | 67.5 | 79.7 | 20 / 35 | 6067 |
| 4 | 1 | 62.8 | 66.3 | 15 / 35 | 5504 |
| 5 | 1 | 61.0 | 62.2 | 11 / 35 | 5027 |
| 6 | 1 | 64.6 | 72.4 | 11 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 76% |
| radnor.DoctorBob 1.42 | 26 | 77% |
| mld.Wisdom 1.0 | 18 | 56% |
| amz.NanoClone 1.41 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 31% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 19% | 54 |
| KiraNL.Chupacabra 0.4 | 19 | 16% | 26 |
| radnor.DoctorBob 1.42 | 14 | 12% | 40 |
| amz.NanoClone 1.41 | 14 | 12% | 17 |
| GarmBox.Oranges 1.0 | 7 | 6% | 8 |
| sample.Walls 1.0 | 5 | 4% | 11 |
| jangs.ns51 1.0 | 1 | 1% | 8 |

