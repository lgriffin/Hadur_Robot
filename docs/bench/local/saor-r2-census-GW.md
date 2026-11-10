# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.0 | 56 / 210 | 2.89 | 16.9% | 31510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.5 | 16.9% | 56 |
| radnor.DoctorBob 1.42 | 1.8 | 16.2% | 56 |
| mz.AntiGrav 1.0 | 2.8 | 14.8% | 42 |
| mld.Infinity 2.2 | 3.8 | 13.5% | 40 |
| amz.NanoClone 1.41 | 5.0 | 11.2% | 9 |
| sample.Walls 1.0 | 6.8 | 6.8% | 2 |
| jangs.ns51 1.0 | 6.8 | 6.4% | 4 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 1 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 77.5 | 10 / 35 | 4492 |
| 2 | 3 | 64.9 | 73.0 | 9 / 35 | 4548 |
| 3 | 1 | 67.2 | 79.7 | 10 / 35 | 5664 |
| 4 | 1 | 66.4 | 80.0 | 10 / 35 | 5130 |
| 5 | 1 | 68.3 | 82.9 | 9 / 35 | 5851 |
| 6 | 1 | 67.5 | 81.0 | 8 / 35 | 5825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 52 | 58% |
| radnor.DoctorBob 1.42 | 28 | 32% |
| mld.Infinity 2.2 | 24 | 46% |
| amz.NanoClone 1.41 | 4 | 75% |
| GarmBox.Oranges 1.0 | 4 | 75% |

Hadur died in 155 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 45% | 90 |
| mz.AntiGrav 1.0 | 41 | 26% | 66 |
| mld.Infinity 2.2 | 29 | 19% | 21 |
| amz.NanoClone 1.41 | 6 | 4% | 14 |
| jangs.ns51 1.0 | 3 | 2% | 5 |
| sample.Walls 1.0 | 3 | 2% | 5 |
| GarmBox.Oranges 1.0 | 2 | 1% | 1 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.3 | 90 / 210 | 2.50 | 16.7% | 24251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.2 | 16.7% | 90 |
| oog.melee.Mercutio 1.0 | 2.0 | 16.3% | 87 |
| mld.DustBunny 3.8 | 3.2 | 13.7% | 16 |
| maribo.melee.BMV 0.1 | 3.8 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 8 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 3 |
| bzdp.BoxCar 2.0 | 7.8 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 77.8 | 11 / 35 | 4127 |
| 2 | 1 | 65.8 | 85.1 | 14 / 35 | 4079 |
| 3 | 1 | 65.5 | 82.5 | 17 / 35 | 3864 |
| 4 | 2 | 64.6 | 84.4 | 13 / 35 | 3566 |
| 5 | 1 | 66.2 | 84.8 | 17 / 35 | 4212 |
| 6 | 1 | 66.5 | 85.1 | 18 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 93 | 53% |
| mld.DustBunny 3.8 | 32 | 88% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 67% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 59% | 114 |
| mld.DustBunny 3.8 | 21 | 18% | 47 |
| djdjdj.NanoSkunk10 1.0 | 8 | 7% | 12 |
| zyx.nano.Ant 1.1 | 7 | 6% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 4% | 8 |
| maribo.melee.BMV 0.1 | 3 | 3% | 11 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| fullsail.SweetTea 1.1 | 2 | 2% | 8 |

## Melee bench: F03

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.2 | 113 / 210 | 2.60 | 18.4% | 30999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 18.4% | 113 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 11 |
| fm.mammillarias 1.3 | 4.7 | 9.9% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.9% | 10 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 16 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 2 |
| sample.Fire 1.0 | 9.3 | 5.1% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.0 | 23 / 35 | 5137 |
| 2 | 1 | 67.3 | 79.0 | 17 / 35 | 5022 |
| 3 | 1 | 68.7 | 83.8 | 18 / 35 | 5715 |
| 4 | 1 | 68.1 | 83.5 | 18 / 35 | 5163 |
| 5 | 1 | 66.2 | 76.8 | 17 / 35 | 5123 |
| 6 | 1 | 67.6 | 83.2 | 20 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 77% |
| cb.nano.Insomnia 1.0 | 28 | 61% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 16 | 81% |
| sp.Nanos.Ember 1.1 | 10 | 80% |
| fm.mammillarias 1.3 | 6 | 83% |
| sample.Fire 1.0 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 27 | 27% | 75 |
| cb.nano.Insomnia 1.0 | 20 | 20% | 14 |
| fm.mammillarias 1.3 | 15 | 15% | 20 |
| myl.nano.KomoriNinja 1.1 | 14 | 14% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 11% | 27 |
| sp.Nanos.Ember 1.1 | 6 | 6% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 15 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.2 | 84 / 210 | 2.87 | 17.6% | 32923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 17.6% | 84 |
| tvv.micro.Antares 1.1.1 | 2.5 | 13.4% | 38 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.5% | 21 |
| tj.zombie1n 1.0.1 | 4.3 | 10.2% | 16 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 9.1% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 9.0% | 2 |
| yk.JahMicro 1.0 | 6.5 | 8.6% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.0% | 10 |
| repositorio.NanoStep 1.0 | 8.8 | 6.8% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.6 | 16 / 35 | 5048 |
| 2 | 1 | 68.9 | 87.0 | 15 / 35 | 6213 |
| 3 | 1 | 67.6 | 84.4 | 12 / 35 | 5822 |
| 4 | 1 | 66.2 | 75.6 | 15 / 35 | 5522 |
| 5 | 1 | 63.7 | 69.8 | 11 / 35 | 5339 |
| 6 | 1 | 66.6 | 82.9 | 15 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 42 | 79% |
| tvv.micro.Antares 1.1.1 | 25 | 36% |
| stelo.SoJNanoMelee 1.1 | 24 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 67% |
| tj.zombie1n 1.0.1 | 11 | 45% |
| repositorio.NanoStep 1.0 | 5 | 60% |
| yk.JahMicro 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 67% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.micro.Antares 1.1.1 | 37 | 29% | 46 |
| kawigi.nano.Lib 1.0 | 30 | 24% | 69 |
| stelo.SoJNanoMelee 1.1 | 17 | 13% | 29 |
| tj.zombie1n 1.0.1 | 17 | 13% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 8% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 5% | 6 |
| yk.JahMicro 1.0 | 5 | 4% | 10 |
| repositorio.NanoStep 1.0 | 3 | 2% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 65.5 | 76 / 210 | 4.10 | 14.3% | 24494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.3 | 14.3% | 76 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 35 |
| ahf.NanoAndrew .4 | 3.0 | 12.2% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.4% | 28 |
| sam.Samspin 1.0 | 5.5 | 10.4% | 16 |
| EBBU.Sim2 1.02 | 6.2 | 9.7% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 74.9 | 19 / 35 | 4189 |
| 2 | 1 | 62.0 | 69.2 | 14 / 35 | 4070 |
| 3 | 1 | 60.9 | 66.0 | 11 / 35 | 4236 |
| 4 | 2 | 58.7 | 59.7 | 9 / 35 | 3796 |
| 5 | 2 | 58.6 | 56.2 | 11 / 35 | 4321 |
| 6 | 1 | 60.4 | 67.0 | 12 / 35 | 3882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 81% |
| oog.melee.Corsair 1.0 | 30 | 63% |
| ahf.NanoAndrew .4 | 19 | 68% |
| EBBU.Sim2 1.02 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| sam.Samspin 1.0 | 5 | 80% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 21% | 46 |
| robar.nano.Assertive_Melee 0.2 | 21 | 16% | 26 |
| bwbaugh.nano.Tirunculus 0.0.0a | 19 | 14% | 19 |
| oog.melee.Corsair 1.0 | 18 | 13% | 37 |
| ahf.NanoAndrew .4 | 18 | 13% | 32 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 16 |
| EBBU.Sim2 1.02 | 8 | 6% | 18 |
| sam.Samspin 1.0 | 8 | 6% | 13 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.3 | 112 / 210 | 2.50 | 17.6% | 26791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 17.6% | 112 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.9% | 32 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.6% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.1% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 11 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.6% | 5 |
| fm.claire 1.7 | 6.8 | 8.1% | 0 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 1 |
| pa.Improved 1.0 | 9.2 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 19 / 35 | 4469 |
| 2 | 1 | 66.1 | 82.9 | 19 / 35 | 4283 |
| 3 | 1 | 65.2 | 80.3 | 15 / 35 | 4267 |
| 4 | 1 | 66.8 | 81.6 | 19 / 35 | 4554 |
| 5 | 1 | 68.4 | 87.9 | 23 / 35 | 4655 |
| 6 | 1 | 66.4 | 82.2 | 17 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 82% |
| oog.melee.CapuletDroid 1.1 | 28 | 61% |
| gh.nano.Grofvuil 0.2 | 21 | 76% |
| arthord.NanoSatanMelee Beta | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 44% |
| sample.SpinBot 1.0 | 9 | 100% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 99 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 24% | 75 |
| oog.melee.CapuletDroid 1.1 | 21 | 21% | 17 |
| gh.nano.Grofvuil 0.2 | 17 | 17% | 36 |
| arthord.NanoSatanMelee Beta | 13 | 13% | 25 |
| winamp32.micro.MicroMacro 1.0 | 12 | 12% | 22 |
| fm.claire 1.7 | 5 | 5% | 15 |
| sample.SpinBot 1.0 | 4 | 4% | 9 |
| kurios.DOSexe .9b | 1 | 1% | 8 |
| pa.Improved 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 76.7 | 56 / 210 | 3.10 | 15.5% | 25410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 2.0 | 15.2% | 49 |
| hadur117.micro.SaorGW 0.1 | 2.0 | 15.5% | 56 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.2% | 31 |
| mz.MicroGodMelee 1 | 3.5 | 13.5% | 42 |
| DBall.Anarchy 0.1 | 5.0 | 9.4% | 16 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 4 |
| acogdev.alpha 0.2 | 8.2 | 6.3% | 3 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.5 | 6.1% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 6.2% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 71.4 | 11 / 35 | 4122 |
| 2 | 2 | 62.2 | 70.2 | 8 / 35 | 4392 |
| 3 | 3 | 61.4 | 71.7 | 6 / 35 | 3833 |
| 4 | 2 | 64.7 | 81.3 | 8 / 35 | 4188 |
| 5 | 1 | 64.5 | 80.0 | 9 / 35 | 4665 |
| 6 | 1 | 66.1 | 85.7 | 14 / 35 | 4210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 37 | 76% |
| mz.MicroGodMelee 1 | 35 | 40% |
| gh.micro.Gruweltje 0.7 | 27 | 11% |
| DBall.Anarchy 0.1 | 9 | 56% |
| mbro.Detektor3 0.1.1 | 4 | 50% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 3 | 67% |

Hadur died in 154 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 48 | 31% | 57 |
| mz.MicroGodMelee 1 | 43 | 28% | 55 |
| spinnercat.micro.Tyger 0.1 | 24 | 16% | 45 |
| DBall.Anarchy 0.1 | 9 | 6% | 16 |
| caimano.Furia_Ceca 0.22 | 9 | 6% | 13 |
| mbro.Detektor3 0.1.1 | 9 | 6% | 9 |
| acogdev.alpha 0.2 | 6 | 4% | 7 |
| fire219.CatBot 1.0 | 5 | 3% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 69.3 | 77 / 210 | 3.76 | 15.0% | 26164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 15.9% | 51 |
| hadur117.micro.SaorGW 0.1 | 2.2 | 15.0% | 77 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 40 |
| germ.TheMind .2 | 4.7 | 10.0% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.0% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.6% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 7 |
| sample.Crazy 1.0 | 7.8 | 7.7% | 6 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 66.0 | 13 / 35 | 4498 |
| 2 | 2 | 62.7 | 71.1 | 13 / 35 | 4130 |
| 3 | 3 | 60.9 | 65.1 | 9 / 35 | 4359 |
| 4 | 3 | 59.7 | 63.2 | 12 / 35 | 3900 |
| 5 | 1 | 65.9 | 78.7 | 15 / 35 | 4948 |
| 6 | 2 | 63.4 | 71.7 | 15 / 35 | 4329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 42% |
| germ.TheMind .2 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 6 | 50% |
| sample.Crazy 1.0 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 3 | 33% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 46% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 25% | 44 |
| awesomeness.Elite 1.0 | 9 | 7% | 13 |
| germ.TheMind .2 | 8 | 6% | 14 |
| lrem.micro.MoggFanatic 0.2 | 8 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 8 |
| sample.Crazy 1.0 | 4 | 3% | 9 |
| mym.EdgeStalker 1.0 | 3 | 2% | 4 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.6 | 82 / 210 | 3.01 | 15.9% | 21460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 15.9% | 82 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 13.5% | 44 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 20 |
| timmit.nano.TimDog 0.33 | 5.3 | 10.3% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 10.3% | 3 |
| spinnercat.Omen 1.0 | 7.3 | 9.0% | 11 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 8.5 | 7.4% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 77.8 | 12 / 35 | 3717 |
| 2 | 1 | 64.2 | 76.5 | 15 / 35 | 3214 |
| 3 | 1 | 63.3 | 73.3 | 12 / 35 | 3795 |
| 4 | 1 | 65.0 | 76.8 | 11 / 35 | 3686 |
| 5 | 1 | 66.5 | 81.3 | 16 / 35 | 4028 |
| 6 | 1 | 64.6 | 80.0 | 16 / 35 | 3020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 37 | 81% |
| nz.jdc.nano.GridFu 1.0 | 33 | 39% |
| maribo.IotaCT 1.1 | 11 | 45% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 10 | 60% |
| stelo.PatternRobot 1.0 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 6 | 83% |

Hadur died in 129 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 32 | 25% | 50 |
| timmit.nano.TimDog 0.33 | 28 | 22% | 37 |
| rz.HawkOnFire 0.1 | 24 | 19% | 53 |
| maribo.IotaCT 1.1 | 16 | 12% | 24 |
| stelo.PatternRobot 1.0 | 13 | 10% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 5% | 11 |
| ratosh.Wesco 1.4 | 4 | 3% | 9 |
| spinnercat.Omen 1.0 | 3 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.8 | 116 / 210 | 2.46 | 18.0% | 29524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 18.0% | 116 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.9% | 52 |
| baal.nano.N 1.42 | 3.2 | 11.6% | 6 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 1 |
| zyx.micro.Ant 1.1 | 5.2 | 9.3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.4% | 3 |
| sanja.First 0.1 | 6.7 | 8.5% | 6 |
| cvt.Firsty 1.0 | 8.0 | 7.6% | 12 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.9 | 18 / 35 | 4826 |
| 2 | 1 | 68.2 | 88.3 | 18 / 35 | 5042 |
| 3 | 1 | 69.6 | 90.2 | 23 / 35 | 5470 |
| 4 | 1 | 66.4 | 81.6 | 16 / 35 | 5128 |
| 5 | 1 | 67.5 | 86.7 | 24 / 35 | 4834 |
| 6 | 1 | 62.7 | 74.3 | 17 / 35 | 4224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 53% |
| baal.nano.N 1.42 | 24 | 83% |
| cvt.Firsty 1.0 | 21 | 76% |
| zyx.micro.Ant 1.1 | 17 | 94% |
| sanja.First 0.1 | 14 | 93% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| amk.Punbot.Punbot 0.01 | 8 | 88% |
| squidM.TentalceMeleeNano 1.1 | 7 | 86% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 37% | 70 |
| Grystrion.TrackerWO 1.0 | 13 | 13% | 24 |
| zyx.micro.Ant 1.1 | 12 | 12% | 32 |
| baal.nano.N 1.42 | 8 | 8% | 30 |
| cvt.Firsty 1.0 | 8 | 8% | 20 |
| sanja.First 0.1 | 6 | 6% | 15 |
| amk.Punbot.Punbot 0.01 | 4 | 4% | 5 |
| sample.RamFire 1.0 | 4 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 7 |
5 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 62.4 | 39 / 210 | 4.39 | 12.9% | 22909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.4% | 95 |
| hadur117.micro.SaorGW 0.1 | 2.7 | 12.9% | 39 |
| js.PinBall 1.6 | 3.2 | 12.7% | 30 |
| cs.Wren 1.0 | 3.5 | 12.4% | 16 |
| mz.Cork 0.1 | 4.5 | 11.3% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 9.5% | 6 |
| evd.X1 0.01 | 6.8 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 63.2 | 11 / 35 | 4128 |
| 2 | 3 | 59.1 | 62.2 | 8 / 35 | 3942 |
| 3 | 2 | 59.0 | 65.1 | 6 / 35 | 3874 |
| 4 | 4 | 54.5 | 52.4 | 4 / 35 | 3693 |
| 5 | 2 | 58.7 | 65.4 | 3 / 35 | 3590 |
| 6 | 3 | 59.5 | 66.0 | 7 / 35 | 3682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 26% |
| cs.Wren 1.0 | 12 | 92% |
| mz.Cork 0.1 | 7 | 57% |
| js.PinBall 1.6 | 6 | 17% |
| donjezza.Jezza 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 1 | 0% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 72 | 42% | 86 |
| js.PinBall 1.6 | 26 | 15% | 30 |
| joe.ADinosaur 1.0 | 17 | 10% | 18 |
| mz.Cork 0.1 | 16 | 9% | 20 |
| cs.Wren 1.0 | 14 | 8% | 22 |
| evd.X1 0.01 | 13 | 8% | 16 |
| jsal.Jsalbot 1.0 | 5 | 3% | 7 |
| PSW.Relentless 0.1 | 5 | 3% | 6 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 74.1 | 106 / 210 | 3.33 | 16.2% | 24099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 16.2% | 106 |
| myl.nano.Graviton 1.10 | 2.3 | 12.4% | 32 |
| ntc.Opposite 1.5 | 3.3 | 11.6% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.7% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.6% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.9% | 3 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 13 |
| DBall.NUKE 0.1 | 7.5 | 8.4% | 12 |
| pbg.R2D2 1.0 | 9.2 | 5.9% | 2 |
| donjezza.Muncho 1.0 | 9.5 | 5.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.2 | 16 / 35 | 4228 |
| 2 | 1 | 62.6 | 73.0 | 18 / 35 | 3367 |
| 3 | 1 | 66.8 | 82.9 | 21 / 35 | 3999 |
| 4 | 1 | 65.9 | 77.1 | 18 / 35 | 4905 |
| 5 | 1 | 62.2 | 67.9 | 16 / 35 | 3885 |
| 6 | 1 | 63.2 | 73.3 | 17 / 35 | 3715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 74% |
| stelo.AreaTargetingBot 1.1 | 22 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| disan.Chair 2.2.0 | 12 | 83% |
| ntc.Opposite 1.5 | 11 | 91% |
| DBall.NUKE 0.1 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 30 | 28% | 37 |
| myl.nano.Graviton 1.10 | 23 | 21% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 18% | 35 |
| ntc.Opposite 1.5 | 12 | 11% | 17 |
| stelo.AreaTargetingBot 1.1 | 7 | 6% | 34 |
| disan.Chair 2.2.0 | 4 | 4% | 6 |
| DBall.NUKE 0.1 | 3 | 3% | 20 |
| donjezza.Muncho 1.0 | 3 | 3% | 8 |
| pbg.R2D2 1.0 | 3 | 3% | 5 |
4 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 64.2 | 55 / 210 | 4.22 | 13.6% | 21216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 14.5% | 54 |
| hadur117.micro.SaorGW 0.1 | 2.7 | 13.6% | 55 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.6% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.2% | 35 |
| ejb.Polaris 1.0.1 | 5.3 | 11.6% | 17 |
| yagami.Tidus 0.11 | 5.5 | 11.7% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 69.5 | 11 / 35 | 3566 |
| 2 | 4 | 57.3 | 55.6 | 6 / 35 | 3439 |
| 3 | 4 | 59.2 | 58.1 | 8 / 35 | 3585 |
| 4 | 3 | 58.8 | 58.7 | 7 / 35 | 3466 |
| 5 | 1 | 64.5 | 73.3 | 16 / 35 | 3863 |
| 6 | 3 | 61.3 | 69.8 | 7 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 24 | 58% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 42% |
| kawigi.micro.Shiz 1.1 | 24 | 63% |
| yagami.Tidus 0.11 | 11 | 91% |
| ejb.Polaris 1.0.1 | 10 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 35% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 17% | 39 |
| ejb.Polaris 1.0.1 | 22 | 14% | 28 |
| kawigi.micro.Shiz 1.1 | 21 | 13% | 29 |
| yagami.Tidus 0.11 | 17 | 11% | 27 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 75.6 | 99 / 210 | 3.20 | 15.8% | 22712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 15.8% | 99 |
| wee.Gem 1.8.4 | 3.0 | 12.1% | 40 |
| ratosh.Nobo 0.21 | 3.2 | 12.1% | 6 |
| bzdp.Pansy 2.1 | 3.7 | 11.8% | 26 |
| wompi.Quokka 1.6 | 4.2 | 11.5% | 21 |
| m3thos.Eva00 1.1 | 6.5 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 6.5 | 9.5% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 74.6 | 18 / 35 | 3458 |
| 2 | 1 | 63.1 | 72.1 | 13 / 35 | 4028 |
| 3 | 1 | 64.5 | 77.5 | 20 / 35 | 3892 |
| 4 | 1 | 63.5 | 76.5 | 16 / 35 | 3682 |
| 5 | 1 | 63.5 | 75.2 | 14 / 35 | 3898 |
| 6 | 1 | 64.4 | 77.8 | 18 / 35 | 3754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 73% |
| wee.Gem 1.8.4 | 37 | 65% |
| ratosh.Nobo 0.21 | 15 | 87% |
| wompi.Quokka 1.6 | 15 | 87% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |

Hadur died in 113 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 25 | 22% | 54 |
| bzdp.Pansy 2.1 | 16 | 14% | 41 |
| ratosh.Nobo 0.21 | 15 | 13% | 26 |
| wompi.Quokka 1.6 | 12 | 11% | 21 |
| maribo.FollowFire 1 | 11 | 10% | 12 |
| bayen.UbaMicro 1.4 | 9 | 8% | 16 |
| m3thos.Eva00 1.1 | 9 | 8% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 8% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 5% | 9 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 76.4 | 21 / 210 | 3.12 | 16.2% | 33730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.8% | 159 |
| hadur117.micro.SaorGW 0.1 | 2.3 | 16.2% | 21 |
| mz.NanoGod 2.02 | 2.7 | 15.8% | 22 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 1 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.9% | 5 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 78.7 | 2 / 35 | 6192 |
| 2 | 3 | 64.4 | 68.9 | 3 / 35 | 5136 |
| 3 | 2 | 65.5 | 74.3 | 3 / 35 | 5639 |
| 4 | 3 | 65.3 | 75.9 | 5 / 35 | 5190 |
| 5 | 2 | 67.3 | 78.4 | 5 / 35 | 6076 |
| 6 | 2 | 67.4 | 82.2 | 3 / 35 | 5497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 104 | 5% |
| mz.NanoGod 2.02 | 11 | 64% |
| exauge.GateKeeper 1.1.121g | 5 | 40% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 128 | 68% | 133 |
| mz.NanoGod 2.02 | 41 | 22% | 47 |
| exauge.GateKeeper 1.1.121g | 8 | 4% | 11 |
| ayk.WallHugger 1.0 | 5 | 3% | 7 |
| stuff.Vlad 0.1 | 4 | 2% | 6 |
| stelo.PianistNano 1.2 | 3 | 2% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 65.6 | 80 / 210 | 4.10 | 14.7% | 24487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 14.7% | 80 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 27 |
| bvh.micro.Freya 0.3 | 3.3 | 12.5% | 28 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 27 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.1% | 15 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 1 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 19 |
| dl.BetterWalls 1.0 | 8.7 | 6.9% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.4 | 60.3 | 10 / 35 | 3905 |
| 2 | 1 | 62.0 | 67.3 | 16 / 35 | 3831 |
| 3 | 1 | 62.8 | 71.1 | 16 / 35 | 4007 |
| 4 | 1 | 60.9 | 62.9 | 13 / 35 | 4257 |
| 5 | 1 | 61.7 | 66.7 | 8 / 35 | 4377 |
| 6 | 1 | 61.7 | 65.4 | 17 / 35 | 4110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 88% |
| bvh.micro.Freya 0.3 | 22 | 73% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 80% |
| dummy.micro.Sparrow 2.5 | 14 | 79% |
| ap.Frederick 1.1 | 8 | 50% |
| stelo.MirrorMicro 1.0 | 4 | 75% |

Hadur died in 130 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 28 | 22% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 22 | 17% | 20 |
| bvh.micro.Freya 0.3 | 19 | 15% | 29 |
| dummy.micro.Sparrow 2.5 | 15 | 12% | 26 |
| voidious.micro.BlitzBat 1.05 | 14 | 11% | 46 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 8% | 28 |
| dl.BetterWalls 1.0 | 11 | 8% | 16 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 16 |
| ap.Frederick 1.1 | 4 | 3% | 0 |

## Melee bench: F17

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.0 | 85 / 210 | 2.98 | 17.4% | 32874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.2 | 17.4% | 85 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.2% | 36 |
| sul.Lunar 1.1 | 2.8 | 12.5% | 39 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.6% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 10.0% | 9 |
| dsw.StaticD 1.0 | 6.0 | 8.4% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.7% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.6% | 8 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.8% | 7 |
| sample.Corners 1.0 | 9.3 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.3 | 15 / 35 | 5800 |
| 2 | 1 | 67.5 | 84.1 | 17 / 35 | 5304 |
| 3 | 2 | 65.9 | 73.7 | 13 / 35 | 5534 |
| 4 | 1 | 63.0 | 73.3 | 11 / 35 | 4594 |
| 5 | 1 | 68.2 | 80.3 | 17 / 35 | 5854 |
| 6 | 1 | 66.2 | 76.5 | 12 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 80% |
| sul.Lunar 1.1 | 34 | 29% |
| supersample.SuperBoxBot 1.0 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 6 | 67% |
| mme.NikeEnhanced 2.0 | 6 | 50% |
| dsw.StaticD 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1123. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sul.Lunar 1.1 | 36 | 28% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 23% | 67 |
| supersample.SuperBoxBot 1.0 | 18 | 14% | 30 |
| mme.NikeEnhanced 2.0 | 13 | 10% | 18 |
| dsw.StaticD 1.0 | 11 | 9% | 15 |
| tlp.ThreeLeggedPig 1 | 9 | 7% | 12 |
| sample.Corners 1.0 | 4 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 3 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 8 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.6 | 107 / 210 | 3.02 | 17.3% | 32685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGW 0.1 | 1.0 | 17.3% | 107 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 36 |
| mld.Wisdom 1.0 | 3.0 | 12.5% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.8% | 16 |
| KiraNL.Chupacabra 0.4 | 4.7 | 11.0% | 15 |
| amz.NanoClone 1.41 | 5.7 | 9.7% | 7 |
| sample.Walls 1.0 | 7.0 | 8.3% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.8% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.3 | 19 / 35 | 5144 |
| 2 | 1 | 67.7 | 79.7 | 19 / 35 | 6138 |
| 3 | 1 | 68.0 | 83.5 | 21 / 35 | 5479 |
| 4 | 1 | 65.2 | 75.2 | 17 / 35 | 5367 |
| 5 | 1 | 62.6 | 65.7 | 13 / 35 | 5230 |
| 6 | 1 | 66.5 | 80.0 | 18 / 35 | 5327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 91% |
| radnor.DoctorBob 1.42 | 26 | 54% |
| mld.Wisdom 1.0 | 16 | 75% |
| KiraNL.Chupacabra 0.4 | 15 | 73% |
| amz.NanoClone 1.41 | 12 | 92% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 50% |

Hadur died in 103 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 29% | 49 |
| mld.Wisdom 1.0 | 18 | 17% | 30 |
| KiraNL.Chupacabra 0.4 | 18 | 17% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 56 |
| sample.Walls 1.0 | 7 | 7% | 13 |
| GarmBox.Oranges 1.0 | 6 | 6% | 8 |
| amz.NanoClone 1.41 | 5 | 5% | 16 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| sample.Target 1.0 | 1 | 1% | 0 |

