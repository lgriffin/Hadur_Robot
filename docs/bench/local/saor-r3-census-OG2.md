# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.6 | 75 / 210 | 3.10 | 16.1% | 26696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 16.1% | 75 |
| mld.Infinity 2.2 | 2.7 | 15.1% | 41 |
| mz.AntiGrav 1.0 | 2.8 | 15.0% | 36 |
| radnor.DoctorBob 1.42 | 3.0 | 14.7% | 41 |
| amz.NanoClone 1.41 | 5.2 | 9.7% | 2 |
| sample.Walls 1.0 | 6.0 | 8.3% | 4 |
| jangs.ns51 1.0 | 7.0 | 6.6% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 16 / 35 | 4204 |
| 2 | 1 | 66.0 | 78.1 | 12 / 35 | 5179 |
| 3 | 2 | 65.1 | 76.8 | 13 / 35 | 4026 |
| 4 | 1 | 65.3 | 79.7 | 11 / 35 | 4397 |
| 5 | 3 | 62.1 | 66.7 | 6 / 35 | 4652 |
| 6 | 1 | 66.0 | 77.1 | 17 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 42 | 83% |
| mld.Infinity 2.2 | 36 | 47% |
| radnor.DoctorBob 1.42 | 26 | 62% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 0% |
| amz.NanoClone 1.41 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 33% | 65 |
| mld.Infinity 2.2 | 39 | 29% | 31 |
| mz.AntiGrav 1.0 | 24 | 18% | 63 |
| jangs.ns51 1.0 | 9 | 7% | 14 |
| amz.NanoClone 1.41 | 8 | 6% | 14 |
| sample.Walls 1.0 | 5 | 4% | 16 |
| arthord.MannyPacquiao Beta | 2 | 1% | 4 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| sample.Target 1.0 | 2 | 1% | 0 |

## Melee bench: F02

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.8 | 109 / 210 | 2.90 | 16.2% | 22793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.3 | 16.2% | 109 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.2% | 55 |
| mld.DustBunny 3.8 | 2.7 | 13.7% | 15 |
| maribo.melee.BMV 0.1 | 4.5 | 10.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.9% | 19 |
| zyx.nano.Ant 1.1 | 6.2 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.9% | 4 |
| bzdp.BoxCar 2.0 | 7.8 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.7% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.5 | 20 / 35 | 4095 |
| 2 | 1 | 67.0 | 90.8 | 23 / 35 | 3356 |
| 3 | 1 | 65.9 | 81.6 | 20 / 35 | 3729 |
| 4 | 1 | 63.7 | 77.1 | 18 / 35 | 3625 |
| 5 | 1 | 66.9 | 87.6 | 22 / 35 | 3755 |
| 6 | 3 | 57.5 | 52.4 | 6 / 35 | 4233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 80% |
| mld.DustBunny 3.8 | 37 | 84% |
| djdjdj.NanoSkunk10 1.0 | 12 | 67% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 27% | 84 |
| zyx.nano.Ant 1.1 | 17 | 17% | 17 |
| mld.DustBunny 3.8 | 16 | 16% | 47 |
| djdjdj.NanoSkunk10 1.0 | 12 | 12% | 20 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 9% | 12 |
| maribo.melee.BMV 0.1 | 7 | 7% | 11 |
| cs.Grudge 1.0 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 4 | 4% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.2 | 76 / 210 | 3.77 | 15.1% | 24433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.2 | 16.0% | 64 |
| hadur117.micro.SaorOG2 0.1 | 1.8 | 15.1% | 76 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.8% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.5% | 25 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 14 |
| fm.mammillarias 1.3 | 5.7 | 9.7% | 6 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.2% | 2 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 3 |
| sample.Tracker 1.0 | 9.3 | 5.2% | 2 |
| sample.Fire 1.0 | 9.3 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 73.7 | 17 / 35 | 3809 |
| 2 | 2 | 60.8 | 64.8 | 11 / 35 | 3803 |
| 3 | 1 | 63.4 | 72.1 | 14 / 35 | 4207 |
| 4 | 2 | 64.5 | 73.0 | 15 / 35 | 4408 |
| 5 | 2 | 62.2 | 67.6 | 8 / 35 | 4254 |
| 6 | 2 | 61.2 | 64.1 | 11 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 73% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 60% |
| cb.nano.Insomnia 1.0 | 18 | 89% |
| myl.nano.KomoriNinja 1.1 | 11 | 55% |
| fm.mammillarias 1.3 | 5 | 40% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 0% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 31 | 23% | 73 |
| stelo.SoRobotNanoMelee 1.2 | 28 | 21% | 32 |
| myl.nano.KomoriNinja 1.1 | 23 | 17% | 40 |
| cb.nano.Insomnia 1.0 | 16 | 12% | 16 |
| fm.mammillarias 1.3 | 11 | 8% | 15 |
| sample.Tracker 1.0 | 8 | 6% | 9 |
| sp.Nanos.Ember 1.1 | 6 | 4% | 8 |
| sample.Fire 1.0 | 6 | 4% | 7 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 8 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.2 | 108 / 210 | 2.79 | 17.0% | 26565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 17.0% | 108 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.8% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.9% | 28 |
| tj.zombie1n 1.0.1 | 4.5 | 10.3% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 10.3% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.2% | 2 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.5% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.1% | 4 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 84.1 | 17 / 35 | 4339 |
| 2 | 1 | 65.0 | 78.4 | 17 / 35 | 4302 |
| 3 | 1 | 65.3 | 81.6 | 18 / 35 | 4121 |
| 4 | 1 | 66.7 | 79.4 | 19 / 35 | 5040 |
| 5 | 1 | 66.1 | 82.9 | 22 / 35 | 4033 |
| 6 | 1 | 64.4 | 74.6 | 15 / 35 | 4730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 87% |
| stelo.SoJNanoMelee 1.1 | 26 | 46% |
| tvv.micro.Antares 1.1.1 | 24 | 79% |
| tj.zombie1n 1.0.1 | 13 | 69% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 67% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 33% | 81 |
| stelo.SoJNanoMelee 1.1 | 28 | 27% | 39 |
| tvv.micro.Antares 1.1.1 | 15 | 14% | 35 |
| tj.zombie1n 1.0.1 | 13 | 13% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 11 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 61.3 | 70 / 210 | 4.48 | 13.3% | 20604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 13.3% | 70 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 37 |
| ahf.NanoAndrew .4 | 2.7 | 12.3% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.4% | 20 |
| zyx.nano.BacillusComma 1.0 | 5.8 | 9.7% | 14 |
| EBBU.Sim2 1.02 | 5.8 | 10.1% | 14 |
| sam.Samspin 1.0 | 6.3 | 9.6% | 15 |
| robar.nano.Assertive_Melee 0.2 | 8.0 | 8.1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.8 | 62.9 | 14 / 35 | 3638 |
| 2 | 2 | 57.2 | 56.5 | 11 / 35 | 3398 |
| 3 | 1 | 59.3 | 63.5 | 9 / 35 | 3451 |
| 4 | 2 | 58.4 | 60.0 | 12 / 35 | 3491 |
| 5 | 2 | 57.6 | 60.3 | 9 / 35 | 3307 |
| 6 | 1 | 59.7 | 64.8 | 15 / 35 | 3319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 78% |
| oog.melee.Corsair 1.0 | 22 | 82% |
| ahf.NanoAndrew .4 | 16 | 50% |
| sam.Samspin 1.0 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 4 | 50% |
| EBBU.Sim2 1.02 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 20% | 42 |
| ahf.NanoAndrew .4 | 23 | 16% | 33 |
| bwbaugh.nano.Tirunculus 0.0.0a | 21 | 15% | 23 |
| zyx.nano.BacillusComma 1.0 | 17 | 12% | 27 |
| oog.melee.Corsair 1.0 | 16 | 11% | 33 |
| EBBU.Sim2 1.02 | 14 | 10% | 18 |
| robar.nano.Assertive_Melee 0.2 | 9 | 6% | 15 |
| sam.Samspin 1.0 | 8 | 6% | 12 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.1 | 112 / 210 | 2.97 | 16.3% | 23424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.3 | 16.3% | 112 |
| d414.nano.Quantum 1.0.0 | 1.7 | 14.9% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.9% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.7% | 13 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.6% | 17 |
| fm.claire 1.7 | 6.2 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.7% | 6 |
| sample.SpinBot 1.0 | 7.3 | 8.1% | 6 |
| pa.Improved 1.0 | 9.2 | 6.0% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 80.3 | 18 / 35 | 3941 |
| 2 | 2 | 63.1 | 74.3 | 16 / 35 | 4089 |
| 3 | 1 | 63.5 | 73.7 | 18 / 35 | 4005 |
| 4 | 2 | 64.3 | 78.1 | 20 / 35 | 3383 |
| 5 | 1 | 66.5 | 87.0 | 20 / 35 | 3869 |
| 6 | 1 | 64.8 | 75.2 | 20 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 51 | 88% |
| gh.nano.Grofvuil 0.2 | 27 | 89% |
| oog.melee.CapuletDroid 1.1 | 20 | 75% |
| winamp32.micro.MicroMacro 1.0 | 13 | 85% |
| arthord.NanoSatanMelee Beta | 9 | 78% |
| sample.SpinBot 1.0 | 5 | 80% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 21% | 72 |
| oog.melee.CapuletDroid 1.1 | 17 | 17% | 16 |
| gh.nano.Grofvuil 0.2 | 13 | 13% | 42 |
| sample.SpinBot 1.0 | 13 | 13% | 16 |
| arthord.NanoSatanMelee Beta | 12 | 12% | 22 |
| winamp32.micro.MicroMacro 1.0 | 8 | 8% | 21 |
| fm.claire 1.7 | 8 | 8% | 11 |
| kurios.DOSexe .9b | 4 | 4% | 5 |
| pa.Improved 1.0 | 2 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 71.3 | 65 / 210 | 3.59 | 14.6% | 23089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.3 | 16.5% | 62 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 14.9% | 39 |
| hadur117.micro.SaorOG2 0.1 | 2.7 | 14.6% | 65 |
| mz.MicroGodMelee 1 | 3.7 | 13.2% | 20 |
| DBall.Anarchy 0.1 | 5.0 | 9.4% | 17 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.1% | 1 |
| acogdev.alpha 0.2 | 7.0 | 6.9% | 3 |
| el.JumpShoot 0.2 | 8.3 | 6.1% | 4 |
| mbro.Detektor3 0.1.1 | 8.5 | 6.2% | 1 |
| fire219.CatBot 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 68.3 | 7 / 35 | 4018 |
| 2 | 2 | 62.2 | 69.2 | 10 / 35 | 3917 |
| 3 | 4 | 58.5 | 60.0 | 9 / 35 | 3608 |
| 4 | 3 | 63.7 | 76.5 | 11 / 35 | 3963 |
| 5 | 2 | 64.2 | 79.7 | 14 / 35 | 3721 |
| 6 | 3 | 63.4 | 74.0 | 14 / 35 | 3862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 35 | 54% |
| mz.MicroGodMelee 1 | 27 | 93% |
| gh.micro.Gruweltje 0.7 | 27 | 41% |
| DBall.Anarchy 0.1 | 10 | 60% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |
| el.JumpShoot 0.2 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 47 | 32% | 60 |
| spinnercat.micro.Tyger 0.1 | 33 | 23% | 51 |
| mz.MicroGodMelee 1 | 22 | 15% | 46 |
| acogdev.alpha 0.2 | 17 | 12% | 18 |
| DBall.Anarchy 0.1 | 14 | 10% | 17 |
| mbro.Detektor3 0.1.1 | 5 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 2% | 5 |
| caimano.Furia_Ceca 0.22 | 2 | 1% | 4 |
| el.JumpShoot 0.2 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 63.9 | 75 / 210 | 4.25 | 14.3% | 25330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.5% | 62 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 14.3% | 75 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.7% | 41 |
| germ.TheMind .2 | 4.5 | 9.7% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.8% | 4 |
| awesomeness.Elite 1.0 | 7.2 | 8.0% | 6 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 70.2 | 17 / 35 | 3958 |
| 2 | 3 | 59.5 | 62.9 | 11 / 35 | 3543 |
| 3 | 1 | 62.1 | 65.1 | 13 / 35 | 4635 |
| 4 | 2 | 63.0 | 69.2 | 16 / 35 | 4208 |
| 5 | 2 | 61.2 | 63.2 | 10 / 35 | 4546 |
| 6 | 3 | 58.2 | 53.0 | 8 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 60% |
| germ.TheMind .2 | 8 | 75% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 50% | 114 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 15% | 24 |
| germ.TheMind .2 | 12 | 9% | 18 |
| qualidafial.MajorDick 1.0.1 | 11 | 8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 11 |
| stelo.UntouchableNano 1.3 | 6 | 4% | 11 |
| awesomeness.Elite 1.0 | 6 | 4% | 7 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.8 | 120 / 210 | 2.46 | 18.0% | 25457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.0% | 120 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 13.9% | 28 |
| rz.HawkOnFire 0.1 | 2.5 | 14.1% | 24 |
| maribo.IotaCT 1.1 | 4.0 | 11.3% | 17 |
| timmit.nano.TimDog 0.33 | 5.3 | 10.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.5% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 7.8% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 7.6% | 2 |
| ratosh.Wesco 1.4 | 7.8 | 7.7% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.5 | 22 / 35 | 4456 |
| 2 | 1 | 67.1 | 81.6 | 18 / 35 | 4395 |
| 3 | 1 | 67.2 | 82.2 | 19 / 35 | 3965 |
| 4 | 1 | 68.8 | 86.7 | 23 / 35 | 4023 |
| 5 | 1 | 68.9 | 85.4 | 21 / 35 | 4450 |
| 6 | 1 | 65.6 | 76.5 | 17 / 35 | 4168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 53 | 91% |
| nz.jdc.nano.GridFu 1.0 | 48 | 79% |
| maribo.IotaCT 1.1 | 17 | 53% |
| timmit.nano.TimDog 0.33 | 16 | 81% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| ratosh.Wesco 1.4 | 4 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 23 | 25% | 63 |
| rz.HawkOnFire 0.1 | 19 | 21% | 59 |
| maribo.IotaCT 1.1 | 16 | 18% | 26 |
| timmit.nano.TimDog 0.33 | 12 | 13% | 25 |
| stelo.PatternRobot 1.0 | 9 | 10% | 17 |
| ratosh.Wesco 1.4 | 5 | 5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 4% | 5 |
| spinnercat.Omen 1.0 | 3 | 3% | 6 |

## Melee bench: F10

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.3 | 130 / 210 | 2.32 | 19.0% | 32846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 19.0% | 130 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.2% | 29 |
| baal.nano.N 1.42 | 3.3 | 11.9% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.0% | 4 |
| zyx.micro.Ant 1.1 | 5.2 | 9.8% | 13 |
| sanja.First 0.1 | 6.5 | 8.0% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.0% | 2 |
| cvt.Firsty 1.0 | 7.0 | 8.1% | 17 |
| amk.Punbot.Punbot 0.01 | 8.7 | 6.7% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 80.0 | 22 / 35 | 5788 |
| 2 | 1 | 68.7 | 88.6 | 22 / 35 | 5482 |
| 3 | 1 | 67.9 | 82.5 | 19 / 35 | 5436 |
| 4 | 1 | 69.5 | 90.2 | 23 / 35 | 5661 |
| 5 | 1 | 68.8 | 89.5 | 25 / 35 | 5200 |
| 6 | 1 | 67.4 | 81.3 | 19 / 35 | 5279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 78% |
| cvt.Firsty 1.0 | 29 | 79% |
| baal.nano.N 1.42 | 26 | 100% |
| sanja.First 0.1 | 19 | 84% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| amk.Punbot.Punbot 0.01 | 8 | 88% |
| Grystrion.TrackerWO 1.0 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |

Hadur died in 85 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 24% | 43 |
| tvv.nano.Polaris 1.2 | 18 | 21% | 59 |
| Grystrion.TrackerWO 1.0 | 12 | 14% | 20 |
| cvt.Firsty 1.0 | 11 | 13% | 23 |
| baal.nano.N 1.42 | 5 | 6% | 26 |
| sanja.First 0.1 | 5 | 6% | 18 |
| amk.Punbot.Punbot 0.01 | 5 | 6% | 6 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 9 |
| sample.RamFire 1.0 | 3 | 4% | 3 |
3 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 58.5 | 30 / 210 | 4.74 | 12.2% | 23090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.7% | 109 |
| cs.Wren 1.0 | 2.2 | 13.5% | 27 |
| js.PinBall 1.6 | 3.3 | 12.3% | 21 |
| hadur117.micro.SaorOG2 0.1 | 3.7 | 12.2% | 30 |
| mz.Cork 0.1 | 4.8 | 10.8% | 14 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 4 |
| evd.X1 0.01 | 7.0 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 0 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 56.5 | 7 / 35 | 3974 |
| 2 | 4 | 57.0 | 57.8 | 5 / 35 | 3916 |
| 3 | 5 | 54.9 | 50.8 | 6 / 35 | 4001 |
| 4 | 3 | 55.8 | 60.3 | 2 / 35 | 3160 |
| 5 | 2 | 60.0 | 67.6 | 7 / 35 | 3770 |
| 6 | 4 | 57.6 | 57.8 | 3 / 35 | 4269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 13% |
| cs.Wren 1.0 | 15 | 87% |
| mz.Cork 0.1 | 5 | 80% |
| js.PinBall 1.6 | 4 | 50% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 180 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 99 | 55% | 109 |
| evd.X1 0.01 | 17 | 9% | 17 |
| cs.Wren 1.0 | 15 | 8% | 27 |
| mz.Cork 0.1 | 15 | 8% | 18 |
| js.PinBall 1.6 | 13 | 7% | 16 |
| PSW.Relentless 0.1 | 11 | 6% | 11 |
| joe.ADinosaur 1.0 | 8 | 4% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 67.7 | 66 / 210 | 3.90 | 14.5% | 21955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 14.5% | 66 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 11.7% | 34 |
| myl.nano.Graviton 1.10 | 3.5 | 11.9% | 37 |
| ntc.Opposite 1.5 | 3.7 | 11.4% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 10.2% | 9 |
| DBall.NUKE 0.1 | 6.5 | 9.0% | 8 |
| disan.Chair 2.2.0 | 8.5 | 8.1% | 8 |
| donjezza.Muncho 1.0 | 8.7 | 6.8% | 21 |
| pbg.R2D2 1.0 | 9.8 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 63.5 | 12 / 35 | 3504 |
| 2 | 1 | 60.2 | 64.8 | 8 / 35 | 3607 |
| 3 | 1 | 63.6 | 72.4 | 15 / 35 | 4133 |
| 4 | 1 | 63.7 | 77.1 | 13 / 35 | 3665 |
| 5 | 1 | 59.3 | 66.0 | 10 / 35 | 3522 |
| 6 | 1 | 58.7 | 62.5 | 8 / 35 | 3524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 25 | 44% |
| myl.nano.Graviton 1.10 | 18 | 72% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 71% |
| DBall.NUKE 0.1 | 11 | 82% |
| donjezza.Muncho 1.0 | 8 | 63% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| disan.Chair 2.2.0 | 8 | 88% |
| ntc.Opposite 1.5 | 6 | 67% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 25% | 45 |
| myl.nano.Graviton 1.10 | 25 | 17% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 15% | 29 |
| ntc.Opposite 1.5 | 19 | 13% | 26 |
| pfvicm.Sobieski 7.2.3b | 16 | 11% | 18 |
| donjezza.Muncho 1.0 | 8 | 6% | 13 |
| disan.Chair 2.2.0 | 7 | 5% | 9 |
| DBall.NUKE 0.1 | 6 | 4% | 20 |
| pbg.R2D2 1.0 | 5 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.1 | 79 / 210 | 4.05 | 13.4% | 17186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.8 | 14.4% | 51 |
| oog.melee.Capulet 1.2 | 2.0 | 14.1% | 39 |
| hadur117.micro.SaorOG2 0.1 | 3.2 | 13.4% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.0% | 20 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 11.0% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 66.3 | 12 / 35 | 3203 |
| 2 | 4 | 59.5 | 64.4 | 10 / 35 | 2902 |
| 3 | 4 | 59.7 | 64.4 | 13 / 35 | 2538 |
| 4 | 2 | 60.4 | 66.7 | 16 / 35 | 2743 |
| 5 | 2 | 62.6 | 72.1 | 16 / 35 | 3170 |
| 6 | 5 | 59.0 | 62.9 | 12 / 35 | 2630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 88% |
| kawigi.micro.Shiz 1.1 | 24 | 63% |
| yagami.Tidus 0.11 | 9 | 78% |
| ejb.Polaris 1.0.1 | 9 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 31% | 59 |
| kawigi.micro.Shiz 1.1 | 29 | 22% | 37 |
| yagami.Tidus 0.11 | 23 | 18% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 8% | 38 |
| ejb.Polaris 1.0.1 | 10 | 8% | 23 |
| step.nanoPri 1.0 | 8 | 6% | 10 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 70.8 | 86 / 210 | 3.63 | 14.7% | 21098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 14.7% | 86 |
| wee.Gem 1.8.4 | 2.7 | 13.2% | 51 |
| bzdp.Pansy 2.1 | 3.0 | 13.0% | 24 |
| wompi.Quokka 1.6 | 3.5 | 12.3% | 17 |
| ratosh.Nobo 0.21 | 5.0 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 71.7 | 13 / 35 | 3366 |
| 2 | 1 | 63.4 | 76.8 | 13 / 35 | 3918 |
| 3 | 1 | 61.4 | 70.2 | 15 / 35 | 3396 |
| 4 | 2 | 61.3 | 66.3 | 15 / 35 | 3578 |
| 5 | 1 | 61.0 | 67.6 | 12 / 35 | 3442 |
| 6 | 1 | 62.0 | 72.1 | 18 / 35 | 3398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 35 | 77% |
| bzdp.Pansy 2.1 | 35 | 89% |
| wompi.Quokka 1.6 | 17 | 88% |
| m3thos.Eva00 1.1 | 10 | 80% |
| ratosh.Nobo 0.21 | 5 | 60% |
| bayen.UbaMicro 1.4 | 3 | 67% |

Hadur died in 124 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 22 | 18% | 56 |
| wee.Gem 1.8.4 | 22 | 18% | 49 |
| wompi.Quokka 1.6 | 17 | 14% | 25 |
| maribo.FollowFire 1 | 16 | 13% | 14 |
| m3thos.Eva00 1.1 | 12 | 10% | 20 |
| bayen.UbaMicro 1.4 | 12 | 10% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 6% | 9 |
| stelo.MyAgileRobot 0.2 | 8 | 6% | 8 |
| ratosh.Nobo 0.21 | 7 | 6% | 14 |

## Melee bench: F15

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.6 | 24 / 210 | 3.47 | 15.8% | 32348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.2% | 160 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 15.8% | 24 |
| mz.NanoGod 2.02 | 2.8 | 14.3% | 15 |
| ayk.WallHugger 1.0 | 4.8 | 9.3% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.8% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.8% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 68.3 | 3 / 35 | 5453 |
| 2 | 2 | 65.1 | 74.0 | 2 / 35 | 5418 |
| 3 | 2 | 65.4 | 70.8 | 5 / 35 | 5507 |
| 4 | 3 | 65.6 | 72.1 | 3 / 35 | 5253 |
| 5 | 2 | 65.4 | 73.3 | 6 / 35 | 5210 |
| 6 | 2 | 65.9 | 77.1 | 5 / 35 | 5507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 91 | 1% |
| mz.NanoGod 2.02 | 12 | 92% |
| stuff.Vlad 0.1 | 4 | 100% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| ayk.WallHugger 1.0 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 128 | 69% | 130 |
| mz.NanoGod 2.02 | 29 | 16% | 40 |
| stelo.PianistNano 1.2 | 7 | 4% | 10 |
| exauge.GateKeeper 1.1.121g | 7 | 4% | 9 |
| ayk.WallHugger 1.0 | 6 | 3% | 8 |
| stuff.Vlad 0.1 | 5 | 3% | 9 |
| drd.Dreadknoght 0.9 | 3 | 2% | 4 |
| sample.SittingDuck 1.0 | 1 | 1% | 0 |

## Melee bench: F16

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 58.7 | 64 / 210 | 4.72 | 13.0% | 21659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 2.0 | 12.9% | 30 |
| hadur117.micro.SaorOG2 0.1 | 2.5 | 13.0% | 64 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.6% | 35 |
| bvh.micro.Freya 0.3 | 3.3 | 12.1% | 28 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 11.0% | 22 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.7% | 7 |
| dl.BetterWalls 1.0 | 7.3 | 7.9% | 8 |
| conscience.Electron 1.3g | 7.5 | 8.1% | 5 |
| ap.Frederick 1.1 | 8.8 | 6.9% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.1 | 44.4 | 6 / 35 | 3469 |
| 2 | 4 | 55.9 | 54.6 | 10 / 35 | 3307 |
| 3 | 1 | 60.3 | 64.1 | 13 / 35 | 3668 |
| 4 | 2 | 56.9 | 56.5 | 8 / 35 | 3585 |
| 5 | 1 | 63.4 | 74.3 | 17 / 35 | 3679 |
| 6 | 2 | 58.0 | 58.1 | 10 / 35 | 3951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 64% |
| bvh.micro.Freya 0.3 | 20 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 88% |
| dummy.micro.Sparrow 2.5 | 16 | 69% |
| ap.Frederick 1.1 | 5 | 40% |

Hadur died in 146 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 18% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 24 | 16% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 15% | 38 |
| dummy.micro.Sparrow 2.5 | 21 | 14% | 35 |
| dl.BetterWalls 1.0 | 21 | 14% | 25 |
| conscience.Electron 1.3g | 13 | 9% | 15 |
| bvh.micro.Freya 0.3 | 8 | 5% | 14 |
| stelo.MirrorMicro 1.0 | 7 | 5% | 9 |
| ap.Frederick 1.1 | 4 | 3% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 65.6 | 81 / 210 | 4.10 | 14.7% | 25104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.2 | 17.0% | 44 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 14.7% | 81 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 24 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.5% | 27 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.7% | 10 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 3 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.5% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.7% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.4% | 7 |
| sample.Corners 1.0 | 9.2 | 6.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 68.6 | 13 / 35 | 4101 |
| 2 | 2 | 64.3 | 71.4 | 16 / 35 | 4378 |
| 3 | 2 | 59.7 | 57.5 | 13 / 35 | 4317 |
| 4 | 2 | 62.2 | 64.1 | 15 / 35 | 4603 |
| 5 | 4 | 58.8 | 61.3 | 9 / 35 | 3523 |
| 6 | 1 | 63.2 | 70.5 | 15 / 35 | 4182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 35 | 77% |
| sul.Lunar 1.1 | 20 | 90% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| supersample.SuperBoxBot 1.0 | 8 | 75% |
| sample.Corners 1.0 | 7 | 71% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dsw.StaticD 1.0 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 50% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |

Hadur died in 131 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 38% | 78 |
| supersample.SuperBoxBot 1.0 | 27 | 21% | 31 |
| sample.Corners 1.0 | 12 | 9% | 15 |
| sul.Lunar 1.1 | 10 | 8% | 26 |
| dsw.StaticD 1.0 | 9 | 7% | 17 |
| mme.NikeEnhanced 2.0 | 7 | 5% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 5% | 11 |
| tlp.ThreeLeggedPig 1 | 6 | 5% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 10 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 73.7 | 81 / 210 | 3.37 | 15.7% | 28455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 15.7% | 81 |
| radnor.DoctorBob 1.42 | 2.7 | 13.4% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.5% | 28 |
| mld.Wisdom 1.0 | 3.7 | 11.6% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 12 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.8% | 9 |
| sample.Walls 1.0 | 6.8 | 8.8% | 19 |
| GarmBox.Oranges 1.0 | 8.3 | 7.2% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.7% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 74.6 | 14 / 35 | 4541 |
| 2 | 2 | 61.6 | 64.8 | 12 / 35 | 4653 |
| 3 | 1 | 60.5 | 67.3 | 10 / 35 | 4181 |
| 4 | 1 | 66.3 | 80.6 | 16 / 35 | 5140 |
| 5 | 1 | 64.6 | 75.6 | 14 / 35 | 4780 |
| 6 | 1 | 65.4 | 79.4 | 15 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 69% |
| radnor.DoctorBob 1.42 | 30 | 67% |
| sample.Walls 1.0 | 15 | 60% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| mld.Wisdom 1.0 | 9 | 78% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 33% |
| sample.Target 1.0 | 1 | 0% |

Hadur died in 130 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 25% | 63 |
| radnor.DoctorBob 1.42 | 31 | 24% | 55 |
| mld.Wisdom 1.0 | 17 | 13% | 25 |
| amz.NanoClone 1.41 | 16 | 12% | 19 |
| KiraNL.Chupacabra 0.4 | 14 | 11% | 25 |
| sample.Walls 1.0 | 12 | 9% | 15 |
| jangs.ns51 1.0 | 5 | 4% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 0 |
| sample.Target 1.0 | 1 | 1% | 0 |

