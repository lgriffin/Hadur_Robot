# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 78.3 | 72 / 210 | 2.95 | 17.0% | 31449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 17.0% | 72 |
| radnor.DoctorBob 1.42 | 2.7 | 15.7% | 41 |
| mz.AntiGrav 1.0 | 2.8 | 15.4% | 35 |
| mld.Infinity 2.2 | 3.2 | 15.6% | 50 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| GarmBox.Oranges 1.0 | 6.5 | 6.4% | 2 |
| sample.Walls 1.0 | 6.8 | 6.5% | 3 |
| jangs.ns51 1.0 | 7.8 | 5.6% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 15 / 35 | 4712 |
| 2 | 2 | 66.5 | 79.4 | 8 / 35 | 4968 |
| 3 | 1 | 66.7 | 79.4 | 13 / 35 | 5107 |
| 4 | 2 | 67.0 | 76.8 | 13 / 35 | 5355 |
| 5 | 1 | 67.6 | 76.8 | 12 / 35 | 5858 |
| 6 | 1 | 67.0 | 78.7 | 11 / 35 | 5449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 39 | 51% |
| radnor.DoctorBob 1.42 | 33 | 61% |
| mz.AntiGrav 1.0 | 28 | 96% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 73 | 53% | 93 |
| mld.Infinity 2.2 | 34 | 25% | 29 |
| mz.AntiGrav 1.0 | 17 | 12% | 56 |
| amz.NanoClone 1.41 | 7 | 5% | 10 |
| GarmBox.Oranges 1.0 | 4 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| sample.Walls 1.0 | 1 | 1% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 4 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.0 | 116 / 210 | 2.98 | 16.6% | 24716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 16.6% | 116 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.4% | 55 |
| mld.DustBunny 3.8 | 2.7 | 13.7% | 10 |
| maribo.melee.BMV 0.1 | 4.3 | 10.6% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.1% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.3% | 10 |
| zyx.nano.Ant 1.1 | 6.7 | 8.4% | 2 |
| fullsail.SweetTea 1.1 | 8.3 | 6.5% | 7 |
| bzdp.BoxCar 2.0 | 8.3 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 82.5 | 23 / 35 | 3473 |
| 2 | 1 | 67.7 | 88.9 | 24 / 35 | 4188 |
| 3 | 1 | 67.4 | 85.4 | 25 / 35 | 4178 |
| 4 | 3 | 59.3 | 54.3 | 10 / 35 | 4455 |
| 5 | 1 | 64.9 | 77.5 | 15 / 35 | 4126 |
| 6 | 1 | 65.9 | 79.7 | 19 / 35 | 4296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 80% |
| mld.DustBunny 3.8 | 41 | 95% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 67% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 31% | 89 |
| mld.DustBunny 3.8 | 16 | 17% | 54 |
| zyx.nano.Ant 1.1 | 14 | 15% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 11% | 12 |
| fullsail.SweetTea 1.1 | 9 | 9% | 13 |
| djdjdj.NanoSkunk10 1.0 | 8 | 8% | 16 |
| cs.Grudge 1.0 | 5 | 5% | 6 |
| maribo.melee.BMV 0.1 | 3 | 3% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 75.6 | 111 / 210 | 3.20 | 17.2% | 28504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.2% | 111 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 50 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 13.1% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.0% | 20 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 9 |
| fm.mammillarias 1.3 | 5.8 | 9.2% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 4 |
| sample.Fire 1.0 | 9.5 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.7 | 21 / 35 | 5285 |
| 2 | 1 | 69.9 | 90.2 | 22 / 35 | 4895 |
| 3 | 1 | 65.7 | 76.2 | 19 / 35 | 4380 |
| 4 | 2 | 63.9 | 70.2 | 17 / 35 | 4058 |
| 5 | 1 | 65.3 | 73.7 | 16 / 35 | 4809 |
| 6 | 1 | 64.5 | 64.8 | 16 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 96% |
| myl.nano.KomoriNinja 1.1 | 26 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 68% |
| cb.nano.Insomnia 1.0 | 19 | 84% |
| sp.Nanos.Ember 1.1 | 5 | 100% |
| sample.Fire 1.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 25% | 38 |
| myl.nano.KomoriNinja 1.1 | 18 | 18% | 50 |
| myl.micro.Troodon 1.10 | 15 | 15% | 69 |
| cb.nano.Insomnia 1.0 | 15 | 15% | 14 |
| fm.mammillarias 1.3 | 12 | 12% | 13 |
| sample.Fire 1.0 | 5 | 5% | 7 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 10 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.6 | 97 / 210 | 2.66 | 17.7% | 29665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.7% | 97 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.9% | 31 |
| tvv.micro.Antares 1.1.1 | 2.5 | 13.7% | 36 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.7% | 29 |
| tj.zombie1n 1.0.1 | 5.2 | 9.3% | 6 |
| yk.JahMicro 1.0 | 5.8 | 8.6% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 8.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.6% | 5 |
| repositorio.NanoStep 1.0 | 8.7 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 20 / 35 | 5386 |
| 2 | 1 | 64.6 | 76.5 | 11 / 35 | 4861 |
| 3 | 1 | 67.5 | 83.8 | 20 / 35 | 4839 |
| 4 | 1 | 66.7 | 83.2 | 17 / 35 | 4531 |
| 5 | 1 | 66.6 | 80.0 | 13 / 35 | 5260 |
| 6 | 1 | 65.3 | 76.5 | 16 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 86% |
| stelo.SoJNanoMelee 1.1 | 32 | 53% |
| tvv.micro.Antares 1.1.1 | 25 | 40% |
| yk.JahMicro 1.0 | 9 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| tj.zombie1n 1.0.1 | 5 | 80% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 32 | 28% | 47 |
| tvv.micro.Antares 1.1.1 | 29 | 26% | 40 |
| kawigi.nano.Lib 1.0 | 28 | 25% | 78 |
| tj.zombie1n 1.0.1 | 9 | 8% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 5% | 8 |
| yk.JahMicro 1.0 | 4 | 4% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 11 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.9 | 86 / 210 | 3.80 | 15.5% | 26739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.5% | 86 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 34 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.1% | 27 |
| sam.Samspin 1.0 | 5.2 | 10.3% | 9 |
| EBBU.Sim2 1.02 | 5.8 | 10.0% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.9% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.1% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 64.8 | 11 / 35 | 4365 |
| 2 | 1 | 62.2 | 67.3 | 14 / 35 | 4395 |
| 3 | 1 | 61.8 | 66.3 | 14 / 35 | 4228 |
| 4 | 1 | 62.4 | 66.0 | 14 / 35 | 4569 |
| 5 | 1 | 65.7 | 78.4 | 17 / 35 | 4661 |
| 6 | 1 | 63.4 | 70.5 | 16 / 35 | 4521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 84% |
| simonton.nano.MeleeSeed 1.8 | 27 | 74% |
| ahf.NanoAndrew .4 | 23 | 65% |
| sam.Samspin 1.0 | 14 | 79% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 27 | 22% | 46 |
| simonton.nano.MeleeSeed 1.8 | 17 | 14% | 34 |
| sam.Samspin 1.0 | 17 | 14% | 25 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 12% | 14 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 15 |
| oog.melee.Corsair 1.0 | 12 | 10% | 37 |
| EBBU.Sim2 1.02 | 4 | 3% | 12 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.2 | 119 / 210 | 2.60 | 17.3% | 24786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.3% | 119 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 26 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.2% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.9% | 24 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 11 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.1% | 7 |
| fm.claire 1.7 | 7.3 | 7.7% | 0 |
| sample.SpinBot 1.0 | 7.7 | 7.5% | 2 |
| pa.Improved 1.0 | 9.0 | 6.0% | 3 |
| kurios.DOSexe .9b | 9.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.0 | 17 / 35 | 4687 |
| 2 | 1 | 63.4 | 73.3 | 17 / 35 | 3652 |
| 3 | 1 | 67.5 | 87.9 | 21 / 35 | 4185 |
| 4 | 1 | 67.0 | 82.5 | 20 / 35 | 4772 |
| 5 | 1 | 64.1 | 78.1 | 21 / 35 | 3416 |
| 6 | 1 | 66.5 | 84.1 | 23 / 35 | 4074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 56 | 86% |
| oog.melee.CapuletDroid 1.1 | 39 | 85% |
| gh.nano.Grofvuil 0.2 | 27 | 67% |
| winamp32.micro.MicroMacro 1.0 | 13 | 62% |
| arthord.NanoSatanMelee Beta | 9 | 67% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| sample.SpinBot 1.0 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 21 | 23% | 41 |
| d414.nano.Quantum 1.0.0 | 19 | 21% | 88 |
| oog.melee.CapuletDroid 1.1 | 17 | 18% | 17 |
| arthord.NanoSatanMelee Beta | 13 | 14% | 16 |
| winamp32.micro.MicroMacro 1.0 | 9 | 10% | 19 |
| pa.Improved 1.0 | 4 | 4% | 10 |
| sample.SpinBot 1.0 | 3 | 3% | 8 |
| fm.claire 1.7 | 3 | 3% | 4 |
| kurios.DOSexe .9b | 2 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.3 | 92 / 210 | 2.78 | 16.7% | 26601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.5 | 16.7% | 92 |
| gh.micro.Gruweltje 0.7 | 1.7 | 15.9% | 56 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.8% | 25 |
| mz.MicroGodMelee 1 | 3.8 | 13.2% | 21 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 8 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 4 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 2 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 70.5 | 11 / 35 | 4362 |
| 2 | 1 | 64.7 | 80.3 | 16 / 35 | 3902 |
| 3 | 1 | 67.1 | 86.0 | 20 / 35 | 4310 |
| 4 | 1 | 66.9 | 83.8 | 17 / 35 | 4732 |
| 5 | 1 | 66.3 | 80.3 | 15 / 35 | 4833 |
| 6 | 2 | 65.5 | 80.6 | 13 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 41 | 90% |
| spinnercat.micro.Tyger 0.1 | 38 | 55% |
| gh.micro.Gruweltje 0.7 | 33 | 61% |
| DBall.Anarchy 0.1 | 9 | 78% |
| mbro.Detektor3 0.1.1 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 38 | 32% | 60 |
| spinnercat.micro.Tyger 0.1 | 35 | 30% | 52 |
| mz.MicroGodMelee 1 | 21 | 18% | 63 |
| DBall.Anarchy 0.1 | 6 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 7 |
| acogdev.alpha 0.2 | 4 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 63.9 | 66 / 210 | 4.25 | 14.2% | 26179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.0% | 65 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 14.2% | 41 |
| hadur117.micro.SaorOG1 0.1 | 2.7 | 14.2% | 66 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 10.0% | 11 |
| germ.TheMind .2 | 5.0 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 5 |
| awesomeness.Elite 1.0 | 7.0 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.3% | 4 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 61.0 | 13 / 35 | 4600 |
| 2 | 3 | 58.9 | 60.3 | 7 / 35 | 4085 |
| 3 | 2 | 61.8 | 67.6 | 12 / 35 | 4342 |
| 4 | 2 | 63.9 | 69.8 | 14 / 35 | 4819 |
| 5 | 3 | 59.5 | 60.3 | 10 / 35 | 4260 |
| 6 | 3 | 60.4 | 64.1 | 10 / 35 | 4073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 58% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 71% |
| germ.TheMind .2 | 8 | 63% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 75% |
| sample.Crazy 1.0 | 4 | 75% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 50% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 18% | 32 |
| germ.TheMind .2 | 16 | 11% | 26 |
| qualidafial.MajorDick 1.0.1 | 9 | 6% | 12 |
| awesomeness.Elite 1.0 | 7 | 5% | 13 |
| stelo.UntouchableNano 1.3 | 7 | 5% | 12 |
| sample.Crazy 1.0 | 4 | 3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 5 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.4 | 112 / 210 | 2.49 | 16.9% | 19650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.9% | 112 |
| rz.HawkOnFire 0.1 | 2.3 | 14.4% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.7% | 37 |
| maribo.IotaCT 1.1 | 4.5 | 10.9% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.1% | 2 |
| timmit.nano.TimDog 0.33 | 6.7 | 9.1% | 3 |
| spinnercat.Omen 1.0 | 7.3 | 8.3% | 3 |
| ratosh.Wesco 1.4 | 7.5 | 8.0% | 6 |
| stelo.PatternRobot 1.0 | 8.0 | 7.4% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 84.1 | 18 / 35 | 3162 |
| 2 | 1 | 67.0 | 86.0 | 22 / 35 | 3316 |
| 3 | 1 | 68.5 | 87.9 | 25 / 35 | 3321 |
| 4 | 1 | 64.7 | 77.8 | 14 / 35 | 3356 |
| 5 | 1 | 66.1 | 83.5 | 15 / 35 | 3201 |
| 6 | 1 | 65.3 | 81.3 | 18 / 35 | 3294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 53 | 87% |
| nz.jdc.nano.GridFu 1.0 | 50 | 70% |
| maribo.IotaCT 1.1 | 16 | 50% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| stelo.PatternRobot 1.0 | 7 | 71% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 31 | 32% | 69 |
| maribo.IotaCT 1.1 | 20 | 20% | 32 |
| rz.HawkOnFire 0.1 | 17 | 17% | 57 |
| ratosh.Wesco 1.4 | 10 | 10% | 14 |
| timmit.nano.TimDog 0.33 | 7 | 7% | 14 |
| stelo.PatternRobot 1.0 | 7 | 7% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.7 | 125 / 210 | 2.29 | 18.6% | 30587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.6% | 125 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.9% | 47 |
| baal.nano.N 1.42 | 3.3 | 11.3% | 7 |
| Grystrion.TrackerWO 1.0 | 3.7 | 10.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 5.3 | 9.0% | 3 |
| zyx.micro.Ant 1.1 | 6.5 | 8.6% | 7 |
| sanja.First 0.1 | 6.8 | 8.2% | 3 |
| cvt.Firsty 1.0 | 7.8 | 7.7% | 14 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 20 / 35 | 5017 |
| 2 | 1 | 65.4 | 74.6 | 19 / 35 | 4812 |
| 3 | 1 | 68.5 | 89.2 | 22 / 35 | 5039 |
| 4 | 1 | 68.9 | 90.2 | 23 / 35 | 5024 |
| 5 | 1 | 68.2 | 87.3 | 19 / 35 | 5347 |
| 6 | 1 | 68.9 | 89.8 | 22 / 35 | 5348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 52 | 63% |
| baal.nano.N 1.42 | 38 | 95% |
| cvt.Firsty 1.0 | 20 | 75% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| sanja.First 0.1 | 10 | 90% |
| zyx.micro.Ant 1.1 | 9 | 67% |
| squidM.TentalceMeleeNano 1.1 | 9 | 78% |
| amk.Punbot.Punbot 0.01 | 8 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 45% | 82 |
| zyx.micro.Ant 1.1 | 13 | 15% | 27 |
| cvt.Firsty 1.0 | 10 | 11% | 25 |
| squidM.TentalceMeleeNano 1.1 | 5 | 6% | 13 |
| sanja.First 0.1 | 4 | 5% | 17 |
| Grystrion.TrackerWO 1.0 | 4 | 5% | 17 |
| amk.Punbot.Punbot 0.01 | 4 | 5% | 5 |
| sample.RamFire 1.0 | 4 | 5% | 5 |
| baal.nano.N 1.42 | 3 | 3% | 14 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 62.1 | 39 / 210 | 4.41 | 13.1% | 24557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.2% | 97 |
| cs.Wren 1.0 | 2.7 | 12.9% | 22 |
| hadur117.micro.SaorOG1 0.1 | 3.2 | 13.1% | 39 |
| js.PinBall 1.6 | 3.7 | 12.0% | 17 |
| mz.Cork 0.1 | 4.3 | 11.6% | 20 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 3 |
| evd.X1 0.01 | 6.8 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 10 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 1 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.6 | 48.6 | 3 / 35 | 3588 |
| 2 | 5 | 56.7 | 54.6 | 5 / 35 | 3856 |
| 3 | 3 | 59.6 | 67.0 | 4 / 35 | 4066 |
| 4 | 2 | 61.9 | 71.1 | 8 / 35 | 4413 |
| 5 | 3 | 59.3 | 61.9 | 9 / 35 | 4209 |
| 6 | 1 | 61.6 | 69.2 | 10 / 35 | 4425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 20% |
| cs.Wren 1.0 | 16 | 81% |
| js.PinBall 1.6 | 10 | 70% |
| joe.ADinosaur 1.0 | 4 | 100% |
| mz.Cork 0.1 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 73 | 43% | 90 |
| js.PinBall 1.6 | 22 | 13% | 26 |
| cs.Wren 1.0 | 17 | 10% | 26 |
| joe.ADinosaur 1.0 | 17 | 10% | 19 |
| mz.Cork 0.1 | 16 | 9% | 17 |
| evd.X1 0.01 | 13 | 8% | 17 |
| PSW.Relentless 0.1 | 9 | 5% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 74.8 | 91 / 210 | 3.27 | 15.9% | 22622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.9% | 91 |
| myl.nano.Graviton 1.10 | 2.7 | 12.5% | 33 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 12.1% | 37 |
| ntc.Opposite 1.5 | 4.5 | 10.7% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 10.1% | 4 |
| disan.Chair 2.2.0 | 7.0 | 8.8% | 12 |
| DBall.NUKE 0.1 | 7.3 | 8.6% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 5.8% | 7 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 68.9 | 14 / 35 | 3895 |
| 2 | 1 | 65.2 | 77.8 | 17 / 35 | 4159 |
| 3 | 1 | 64.6 | 77.1 | 19 / 35 | 3668 |
| 4 | 1 | 65.9 | 81.9 | 19 / 35 | 3996 |
| 5 | 1 | 62.4 | 72.1 | 11 / 35 | 3478 |
| 6 | 1 | 61.5 | 70.8 | 11 / 35 | 3426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 76% |
| stelo.AreaTargetingBot 1.1 | 36 | 50% |
| disan.Chair 2.2.0 | 14 | 100% |
| ntc.Opposite 1.5 | 8 | 63% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| DBall.NUKE 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 31 | 26% | 46 |
| pfvicm.Sobieski 7.2.3b | 22 | 18% | 29 |
| myl.nano.Graviton 1.10 | 16 | 13% | 44 |
| ntc.Opposite 1.5 | 16 | 13% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 12% | 22 |
| disan.Chair 2.2.0 | 10 | 8% | 17 |
| donjezza.Muncho 1.0 | 4 | 3% | 10 |
| pbg.R2D2 1.0 | 4 | 3% | 9 |
| DBall.NUKE 0.1 | 2 | 2% | 12 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 61.6 | 71 / 210 | 4.46 | 13.3% | 20902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 15.0% | 44 |
| kawigi.micro.Shiz 1.1 | 1.7 | 14.8% | 51 |
| hadur117.micro.SaorOG1 0.1 | 3.7 | 13.3% | 71 |
| yagami.Tidus 0.11 | 4.3 | 12.6% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.3% | 20 |
| ejb.Polaris 1.0.1 | 5.3 | 11.4% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.4% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.2 | 51.1 | 8 / 35 | 3458 |
| 2 | 2 | 64.1 | 71.1 | 15 / 35 | 3801 |
| 3 | 3 | 61.6 | 65.4 | 14 / 35 | 3208 |
| 4 | 3 | 61.8 | 62.9 | 14 / 35 | 3795 |
| 5 | 4 | 59.1 | 59.0 | 11 / 35 | 3221 |
| 6 | 4 | 59.3 | 60.0 | 9 / 35 | 3419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 78% |
| kawigi.micro.Shiz 1.1 | 18 | 78% |
| ejb.Polaris 1.0.1 | 12 | 92% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 100% |
| yagami.Tidus 0.11 | 4 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 40% | 83 |
| kawigi.micro.Shiz 1.1 | 22 | 16% | 32 |
| ejb.Polaris 1.0.1 | 19 | 14% | 27 |
| yagami.Tidus 0.11 | 18 | 13% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 8% | 24 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 5 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 69.5 | 94 / 210 | 3.74 | 14.4% | 19702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 14.4% | 94 |
| wee.Gem 1.8.4 | 1.8 | 13.9% | 60 |
| bzdp.Pansy 2.1 | 3.3 | 12.4% | 22 |
| wompi.Quokka 1.6 | 4.0 | 11.8% | 10 |
| ratosh.Nobo 0.21 | 5.0 | 10.9% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 10.2% | 7 |
| bayen.UbaMicro 1.4 | 6.7 | 8.6% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 4 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 66.7 | 17 / 35 | 3710 |
| 2 | 2 | 59.4 | 63.8 | 13 / 35 | 3369 |
| 3 | 1 | 61.0 | 70.2 | 16 / 35 | 3097 |
| 4 | 1 | 63.1 | 77.1 | 20 / 35 | 2964 |
| 5 | 1 | 60.4 | 70.8 | 13 / 35 | 3157 |
| 6 | 2 | 61.1 | 68.6 | 15 / 35 | 3405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 44 | 73% |
| bzdp.Pansy 2.1 | 32 | 91% |
| wompi.Quokka 1.6 | 15 | 93% |
| ratosh.Nobo 0.21 | 11 | 91% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| m3thos.Eva00 1.1 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 37 | 32% | 73 |
| wompi.Quokka 1.6 | 16 | 14% | 23 |
| maribo.FollowFire 1 | 14 | 12% | 18 |
| ratosh.Nobo 0.21 | 12 | 10% | 27 |
| bzdp.Pansy 2.1 | 11 | 9% | 32 |
| bayen.UbaMicro 1.4 | 9 | 8% | 11 |
| stelo.MyAgileRobot 0.2 | 8 | 7% | 8 |
| m3thos.Eva00 1.1 | 5 | 4% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.0 | 35 / 210 | 2.71 | 18.5% | 43046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.5% | 167 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 18.5% | 35 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 6 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.0% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.7% | 0 |
| ayk.WallHugger 1.0 | 5.5 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 76.8 | 3 / 35 | 6855 |
| 2 | 2 | 70.6 | 82.9 | 7 / 35 | 7464 |
| 3 | 2 | 69.5 | 79.0 | 5 / 35 | 7415 |
| 4 | 2 | 69.6 | 82.9 | 8 / 35 | 6854 |
| 5 | 2 | 70.4 | 85.4 | 9 / 35 | 7164 |
| 6 | 2 | 69.5 | 78.7 | 3 / 35 | 7294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 8% |
| mz.NanoGod 2.02 | 14 | 93% |
| exauge.GateKeeper 1.1.121g | 8 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 133 | 76% | 144 |
| mz.NanoGod 2.02 | 25 | 14% | 42 |
| exauge.GateKeeper 1.1.121g | 7 | 4% | 10 |
| ayk.WallHugger 1.0 | 7 | 4% | 9 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 63.2 | 83 / 210 | 4.31 | 13.9% | 22217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 13.9% | 83 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 36 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.6% | 22 |
| bvh.micro.Freya 0.3 | 4.2 | 11.6% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.5% | 23 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.5% | 3 |
| ap.Frederick 1.1 | 7.8 | 7.1% | 14 |
| dl.BetterWalls 1.0 | 9.2 | 6.3% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 67.0 | 14 / 35 | 3590 |
| 2 | 2 | 57.5 | 57.1 | 10 / 35 | 3519 |
| 3 | 1 | 61.9 | 65.7 | 17 / 35 | 3721 |
| 4 | 1 | 62.5 | 68.9 | 15 / 35 | 4294 |
| 5 | 1 | 59.0 | 60.3 | 14 / 35 | 3500 |
| 6 | 2 | 58.6 | 60.0 | 13 / 35 | 3593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 77% |
| dummy.micro.Sparrow 2.5 | 30 | 87% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 86% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 18% | 41 |
| conscience.Electron 1.3g | 23 | 18% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 16% | 18 |
| voidious.micro.BlitzBat 1.05 | 19 | 15% | 45 |
| dummy.micro.Sparrow 2.5 | 16 | 13% | 35 |
| dl.BetterWalls 1.0 | 12 | 9% | 16 |
| bvh.micro.Freya 0.3 | 10 | 8% | 16 |
| stelo.MirrorMicro 1.0 | 4 | 3% | 9 |

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 77.9 | 112 / 210 | 2.99 | 18.1% | 33299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 18.1% | 112 |
| sheldor.melee.nano.TestMelee 0.1 | 1.8 | 17.0% | 37 |
| sul.Lunar 1.1 | 3.3 | 12.0% | 22 |
| supersample.SuperBoxBot 1.0 | 4.2 | 11.2% | 19 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.7% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.6% | 5 |
| sample.Corners 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.3 | 20 / 35 | 5468 |
| 2 | 1 | 67.3 | 75.2 | 16 / 35 | 5992 |
| 3 | 1 | 68.0 | 75.6 | 18 / 35 | 5733 |
| 4 | 1 | 70.6 | 86.7 | 22 / 35 | 6046 |
| 5 | 2 | 64.6 | 72.4 | 15 / 35 | 4648 |
| 6 | 1 | 67.0 | 76.5 | 21 / 35 | 5412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 81% |
| sul.Lunar 1.1 | 28 | 100% |
| supersample.SuperBoxBot 1.0 | 24 | 79% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| dsw.StaticD 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 40% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 45% | 90 |
| supersample.SuperBoxBot 1.0 | 18 | 18% | 32 |
| dsw.StaticD 1.0 | 10 | 10% | 18 |
| sul.Lunar 1.1 | 8 | 8% | 33 |
| tlp.ThreeLeggedPig 1 | 8 | 8% | 12 |
| mme.NikeEnhanced 2.0 | 6 | 6% | 10 |
| sample.Corners 1.0 | 2 | 2% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 73.1 | 82 / 210 | 3.42 | 16.0% | 30661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.0% | 82 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.9% | 24 |
| mld.Wisdom 1.0 | 3.5 | 12.3% | 14 |
| amz.NanoClone 1.41 | 5.5 | 10.3% | 11 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.5% | 14 |
| sample.Walls 1.0 | 7.3 | 7.9% | 11 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 5 |
| sample.Target 1.0 | 10.0 | 3.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 18 / 35 | 5368 |
| 2 | 2 | 61.1 | 66.7 | 11 / 35 | 4360 |
| 3 | 1 | 63.6 | 69.5 | 12 / 35 | 5297 |
| 4 | 1 | 65.7 | 76.2 | 14 / 35 | 5465 |
| 5 | 1 | 62.5 | 67.6 | 12 / 35 | 5053 |
| 6 | 1 | 65.6 | 77.1 | 15 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 86% |
| radnor.DoctorBob 1.42 | 36 | 42% |
| mld.Wisdom 1.0 | 18 | 67% |
| amz.NanoClone 1.41 | 9 | 67% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 31% | 60 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 20% | 62 |
| mld.Wisdom 1.0 | 20 | 16% | 30 |
| KiraNL.Chupacabra 0.4 | 17 | 13% | 24 |
| amz.NanoClone 1.41 | 13 | 10% | 16 |
| sample.Walls 1.0 | 6 | 5% | 8 |
| jangs.ns51 1.0 | 5 | 4% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

