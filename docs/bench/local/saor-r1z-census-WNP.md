# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.5 | 135 / 210 | 2.30 | 20.6% | 42797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.6% | 135 |
| radnor.DoctorBob 1.42 | 2.3 | 14.9% | 28 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 10 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 11 |
| sample.Walls 1.0 | 6.2 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.0 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 3.5% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 81.3 | 23 / 35 | 7081 |
| 2 | 1 | 73.3 | 90.5 | 26 / 35 | 7503 |
| 3 | 1 | 71.0 | 83.5 | 22 / 35 | 7215 |
| 4 | 1 | 72.6 | 89.5 | 22 / 35 | 7564 |
| 5 | 1 | 70.4 | 86.0 | 20 / 35 | 6849 |
| 6 | 1 | 70.2 | 82.2 | 22 / 35 | 6585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 93% |
| radnor.DoctorBob 1.42 | 35 | 74% |
| mld.Infinity 2.2 | 33 | 85% |
| sample.Walls 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 7 | 57% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 39% | 63 |
| mz.AntiGrav 1.0 | 14 | 18% | 67 |
| amz.NanoClone 1.41 | 14 | 18% | 17 |
| mld.Infinity 2.2 | 9 | 12% | 44 |
| GarmBox.Oranges 1.0 | 5 | 7% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.4 | 109 / 210 | 2.67 | 17.8% | 32111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 17.8% | 109 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.2% | 54 |
| maribo.melee.BMV 0.1 | 3.7 | 11.2% | 3 |
| mld.DustBunny 3.8 | 3.8 | 12.1% | 21 |
| zyx.nano.Ant 1.1 | 5.5 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.4% | 10 |
| fullsail.SweetTea 1.1 | 8.2 | 7.4% | 4 |
| bzdp.BoxCar 2.0 | 8.3 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.0 | 19 / 35 | 5522 |
| 2 | 1 | 68.1 | 83.5 | 19 / 35 | 6008 |
| 3 | 1 | 67.2 | 84.4 | 19 / 35 | 5412 |
| 4 | 1 | 67.7 | 83.8 | 19 / 35 | 5175 |
| 5 | 1 | 66.3 | 79.4 | 17 / 35 | 5043 |
| 6 | 1 | 66.1 | 78.4 | 16 / 35 | 4951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 71% |
| mld.DustBunny 3.8 | 39 | 82% |
| maribo.melee.BMV 0.1 | 13 | 92% |
| djdjdj.NanoSkunk10 1.0 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 102 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 33% | 78 |
| mld.DustBunny 3.8 | 18 | 18% | 48 |
| zyx.nano.Ant 1.1 | 15 | 15% | 15 |
| fullsail.SweetTea 1.1 | 11 | 11% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 14 |
| maribo.melee.BMV 0.1 | 7 | 7% | 19 |
| djdjdj.NanoSkunk10 1.0 | 6 | 6% | 17 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 79.7 | 111 / 210 | 2.83 | 18.9% | 37235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 18.9% | 111 |
| myl.micro.Troodon 1.10 | 2.2 | 14.5% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.2% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.2% | 18 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.1% | 11 |
| fm.mammillarias 1.3 | 6.2 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.5% | 2 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |
| sample.Fire 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 81.0 | 21 / 35 | 6000 |
| 2 | 1 | 69.9 | 84.4 | 24 / 35 | 6057 |
| 3 | 1 | 68.7 | 78.4 | 18 / 35 | 6296 |
| 4 | 1 | 67.5 | 74.0 | 15 / 35 | 6172 |
| 5 | 1 | 68.4 | 79.4 | 17 / 35 | 6034 |
| 6 | 1 | 69.1 | 81.0 | 16 / 35 | 6676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 81% |
| myl.nano.KomoriNinja 1.1 | 16 | 69% |
| cb.nano.Insomnia 1.0 | 15 | 100% |
| sp.Nanos.Ember 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 29 | 29% | 71 |
| stelo.SoRobotNanoMelee 1.2 | 28 | 28% | 43 |
| myl.nano.KomoriNinja 1.1 | 16 | 16% | 38 |
| fm.mammillarias 1.3 | 13 | 13% | 18 |
| cb.nano.Insomnia 1.0 | 11 | 11% | 17 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 5 |
| sample.Fire 1.0 | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 15 |

## Melee bench: F04

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 85.1 | 132 / 210 | 2.34 | 20.1% | 39620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.1% | 132 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 26 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 20 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.3% | 8 |
| yk.JahMicro 1.0 | 7.7 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 80.6 | 18 / 35 | 6431 |
| 2 | 1 | 70.4 | 85.7 | 24 / 35 | 6825 |
| 3 | 1 | 71.7 | 91.4 | 26 / 35 | 6928 |
| 4 | 1 | 68.7 | 82.9 | 18 / 35 | 6348 |
| 5 | 1 | 69.5 | 82.9 | 22 / 35 | 6518 |
| 6 | 1 | 70.3 | 87.3 | 24 / 35 | 6570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 88% |
| stelo.SoJNanoMelee 1.1 | 34 | 68% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 75% |
| tj.zombie1n 1.0.1 | 11 | 100% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| yk.JahMicro 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 28% | 82 |
| stelo.SoJNanoMelee 1.1 | 22 | 28% | 36 |
| tvv.micro.Antares 1.1.1 | 7 | 9% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 20 |
| tj.zombie1n 1.0.1 | 7 | 9% | 14 |
| yk.JahMicro 1.0 | 6 | 8% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 6% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 12 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 70.5 | 83 / 210 | 3.66 | 15.9% | 29811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 15.9% | 83 |
| oog.melee.Corsair 1.0 | 2.0 | 13.3% | 46 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.6% | 21 |
| ahf.NanoAndrew .4 | 3.8 | 11.0% | 32 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 6 |
| zyx.nano.BacillusComma 1.0 | 5.8 | 9.6% | 10 |
| sam.Samspin 1.0 | 6.7 | 9.0% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.6% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 71.7 | 15 / 35 | 5088 |
| 2 | 1 | 61.6 | 66.3 | 13 / 35 | 4429 |
| 3 | 1 | 64.0 | 71.7 | 13 / 35 | 5051 |
| 4 | 1 | 63.9 | 68.9 | 11 / 35 | 5226 |
| 5 | 1 | 63.6 | 69.5 | 14 / 35 | 5115 |
| 6 | 1 | 64.6 | 74.6 | 17 / 35 | 4902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 63% |
| simonton.nano.MeleeSeed 1.8 | 31 | 94% |
| ahf.NanoAndrew .4 | 15 | 53% |
| zyx.nano.BacillusComma 1.0 | 9 | 78% |
| sam.Samspin 1.0 | 7 | 86% |
| EBBU.Sim2 1.02 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 21% | 48 |
| ahf.NanoAndrew .4 | 22 | 17% | 34 |
| EBBU.Sim2 1.02 | 18 | 14% | 24 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 41 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 16 |
| robar.nano.Assertive_Melee 0.2 | 12 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 13 |
| sam.Samspin 1.0 | 6 | 5% | 11 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.8 | 115 / 210 | 2.91 | 17.8% | 31783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.2 | 17.8% | 115 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.2% | 43 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.9% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.2% | 9 |
| fm.claire 1.7 | 6.5 | 8.4% | 1 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.2% | 6 |
| sample.SpinBot 1.0 | 7.0 | 7.8% | 6 |
| pa.Improved 1.0 | 9.3 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.2 | 19 / 35 | 5560 |
| 2 | 1 | 67.5 | 81.9 | 21 / 35 | 5345 |
| 3 | 1 | 66.1 | 76.5 | 18 / 35 | 5319 |
| 4 | 2 | 63.7 | 72.7 | 14 / 35 | 4814 |
| 5 | 1 | 67.5 | 80.3 | 23 / 35 | 5223 |
| 6 | 1 | 67.2 | 79.0 | 20 / 35 | 5522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 79% |
| oog.melee.CapuletDroid 1.1 | 26 | 96% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 31% | 70 |
| gh.nano.Grofvuil 0.2 | 19 | 20% | 35 |
| oog.melee.CapuletDroid 1.1 | 13 | 13% | 38 |
| fm.claire 1.7 | 12 | 12% | 16 |
| arthord.NanoSatanMelee Beta | 8 | 8% | 15 |
| winamp32.micro.MicroMacro 1.0 | 6 | 6% | 15 |
| kurios.DOSexe .9b | 5 | 5% | 8 |
| sample.SpinBot 1.0 | 2 | 2% | 8 |
| pa.Improved 1.0 | 2 | 2% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 78.8 | 97 / 210 | 2.91 | 17.8% | 34970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 17.8% | 97 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.2% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.6% | 28 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 35 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 1 |
| acogdev.alpha 0.2 | 7.5 | 6.4% | 1 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.0% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| el.JumpShoot 0.2 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.2 | 20 / 35 | 6181 |
| 2 | 1 | 66.4 | 73.7 | 14 / 35 | 5906 |
| 3 | 1 | 68.8 | 82.5 | 22 / 35 | 5898 |
| 4 | 1 | 65.5 | 75.9 | 14 / 35 | 5307 |
| 5 | 1 | 66.2 | 76.2 | 13 / 35 | 5671 |
| 6 | 1 | 67.7 | 82.2 | 14 / 35 | 6007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 84% |
| mz.MicroGodMelee 1 | 39 | 62% |
| gh.micro.Gruweltje 0.7 | 23 | 70% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 35 | 31% | 66 |
| gh.micro.Gruweltje 0.7 | 30 | 27% | 49 |
| spinnercat.micro.Tyger 0.1 | 23 | 20% | 55 |
| caimano.Furia_Ceca 0.22 | 10 | 9% | 11 |
| acogdev.alpha 0.2 | 8 | 7% | 8 |
| fire219.CatBot 1.0 | 5 | 4% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 6 |

## Melee bench: F08

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.3 | 95 / 210 | 3.68 | 16.2% | 31701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.5 | 16.2% | 95 |
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.5% | 56 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 25 |
| germ.TheMind .2 | 4.7 | 9.5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 8.9% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 8.6% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 8.0% | 6 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 69.8 | 19 / 35 | 5668 |
| 2 | 1 | 66.6 | 77.8 | 20 / 35 | 5182 |
| 3 | 2 | 61.9 | 66.0 | 12 / 35 | 4727 |
| 4 | 2 | 62.3 | 61.9 | 16 / 35 | 5059 |
| 5 | 2 | 65.6 | 74.9 | 11 / 35 | 5601 |
| 6 | 1 | 65.3 | 71.1 | 17 / 35 | 5464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 83% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| germ.TheMind .2 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 46% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 18% | 39 |
| germ.TheMind .2 | 10 | 9% | 14 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 12 |
| awesomeness.Elite 1.0 | 7 | 6% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 7 |
| sample.Crazy 1.0 | 3 | 3% | 12 |

## Melee bench: F09

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 81.9 | 126 / 210 | 2.63 | 18.5% | 30869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 18.5% | 126 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 29 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 13 |
| maribo.IotaCT 1.1 | 4.7 | 10.5% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.1% | 4 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 8 |
| ratosh.Wesco 1.4 | 7.7 | 8.4% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 8.1% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 8.1% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 22 / 35 | 4764 |
| 2 | 1 | 70.3 | 87.3 | 22 / 35 | 5935 |
| 3 | 1 | 68.9 | 84.8 | 22 / 35 | 5054 |
| 4 | 1 | 68.7 | 82.9 | 23 / 35 | 5191 |
| 5 | 1 | 66.8 | 74.9 | 19 / 35 | 5029 |
| 6 | 1 | 66.6 | 76.8 | 18 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 56 | 86% |
| nz.jdc.nano.GridFu 1.0 | 31 | 100% |
| stelo.PatternRobot 1.0 | 14 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 100% |
| maribo.IotaCT 1.1 | 9 | 78% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 29% | 70 |
| nz.jdc.nano.GridFu 1.0 | 13 | 15% | 49 |
| ratosh.Wesco 1.4 | 13 | 15% | 22 |
| stelo.PatternRobot 1.0 | 12 | 14% | 21 |
| timmit.nano.TimDog 0.33 | 7 | 8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 10 |
| maribo.IotaCT 1.1 | 5 | 6% | 15 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.5 | 156 / 210 | 2.22 | 20.6% | 39174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.6% | 156 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 16 |
| baal.nano.N 1.42 | 2.7 | 12.0% | 7 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 2 |
| zyx.micro.Ant 1.1 | 5.5 | 9.0% | 13 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.3% | 2 |
| sanja.First 0.1 | 6.7 | 8.3% | 1 |
| amk.Punbot.Punbot 0.01 | 7.3 | 8.0% | 4 |
| cvt.Firsty 1.0 | 8.7 | 7.1% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.7 | 28 / 35 | 6899 |
| 2 | 1 | 70.8 | 87.9 | 27 / 35 | 6598 |
| 3 | 1 | 69.5 | 82.9 | 25 / 35 | 6326 |
| 4 | 1 | 71.9 | 90.2 | 29 / 35 | 6980 |
| 5 | 1 | 68.8 | 82.5 | 23 / 35 | 6264 |
| 6 | 1 | 69.2 | 83.5 | 24 / 35 | 6107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 95% |
| tvv.nano.Polaris 1.2 | 40 | 93% |
| cvt.Firsty 1.0 | 22 | 86% |
| sanja.First 0.1 | 19 | 100% |
| zyx.micro.Ant 1.1 | 17 | 65% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 26% | 31 |
| cvt.Firsty 1.0 | 9 | 17% | 24 |
| sample.RamFire 1.0 | 7 | 13% | 9 |
| Grystrion.TrackerWO 1.0 | 6 | 11% | 17 |
| baal.nano.N 1.42 | 5 | 9% | 49 |
| tvv.nano.Polaris 1.2 | 5 | 9% | 47 |
| sanja.First 0.1 | 4 | 7% | 22 |
| squidM.TentalceMeleeNano 1.1 | 4 | 7% | 6 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 60.9 | 67 / 210 | 4.52 | 13.8% | 28708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.7% | 84 |
| hadur117.micro.SaorWNP 0.1 | 2.3 | 13.8% | 67 |
| cs.Wren 1.0 | 2.7 | 13.0% | 25 |
| js.PinBall 1.6 | 4.3 | 11.3% | 12 |
| mz.Cork 0.1 | 4.8 | 10.6% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 4 |
| evd.X1 0.01 | 6.8 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 8 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 61.0 | 9 / 35 | 4546 |
| 2 | 2 | 61.0 | 61.0 | 9 / 35 | 5255 |
| 3 | 3 | 58.7 | 56.5 | 11 / 35 | 4525 |
| 4 | 2 | 63.2 | 67.6 | 15 / 35 | 5128 |
| 5 | 3 | 59.3 | 59.4 | 9 / 35 | 4400 |
| 6 | 2 | 61.0 | 60.0 | 14 / 35 | 4854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 47 | 62% |
| cs.Wren 1.0 | 25 | 84% |
| mz.Cork 0.1 | 8 | 100% |
| js.PinBall 1.6 | 4 | 50% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 66 | 46% | 103 |
| joe.ADinosaur 1.0 | 18 | 13% | 20 |
| cs.Wren 1.0 | 17 | 12% | 33 |
| js.PinBall 1.6 | 14 | 10% | 18 |
| evd.X1 0.01 | 11 | 8% | 13 |
| mz.Cork 0.1 | 7 | 5% | 11 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.9 | 104 / 210 | 3.26 | 17.1% | 28913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 17.1% | 104 |
| myl.nano.Graviton 1.10 | 2.8 | 11.8% | 37 |
| ntc.Opposite 1.5 | 3.8 | 11.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.1% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.4% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.0% | 11 |
| DBall.NUKE 0.1 | 7.0 | 8.4% | 7 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 12 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.6 | 18 / 35 | 4906 |
| 2 | 1 | 62.9 | 67.3 | 17 / 35 | 4575 |
| 3 | 1 | 68.7 | 84.4 | 23 / 35 | 5078 |
| 4 | 1 | 64.7 | 72.1 | 15 / 35 | 4763 |
| 5 | 1 | 65.2 | 75.6 | 15 / 35 | 4742 |
| 6 | 1 | 65.5 | 74.6 | 16 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 28 | 96% |
| myl.nano.Graviton 1.10 | 22 | 91% |
| ntc.Opposite 1.5 | 17 | 88% |
| DBall.NUKE 0.1 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| disan.Chair 2.2.0 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| donjezza.Muncho 1.0 | 6 | 83% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 24 | 22% | 49 |
| pfvicm.Sobieski 7.2.3b | 22 | 21% | 29 |
| stelo.AreaTargetingBot 1.1 | 19 | 18% | 40 |
| ntc.Opposite 1.5 | 11 | 10% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 9% | 15 |
| DBall.NUKE 0.1 | 7 | 7% | 18 |
| disan.Chair 2.2.0 | 6 | 6% | 14 |
| pbg.R2D2 1.0 | 5 | 5% | 10 |
| donjezza.Muncho 1.0 | 3 | 3% | 13 |

## Melee bench: F13

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 62.6 | 63 / 210 | 4.36 | 13.8% | 25375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 52 |
| oog.melee.Capulet 1.2 | 2.2 | 14.0% | 39 |
| hadur117.micro.SaorWNP 0.1 | 3.0 | 13.8% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.7% | 27 |
| yagami.Tidus 0.11 | 4.8 | 12.1% | 13 |
| ejb.Polaris 1.0.1 | 5.5 | 11.1% | 16 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.6 | 62.2 | 9 / 35 | 4155 |
| 2 | 2 | 62.5 | 66.0 | 10 / 35 | 4514 |
| 3 | 4 | 58.5 | 56.5 | 10 / 35 | 3848 |
| 4 | 1 | 63.5 | 68.3 | 12 / 35 | 4551 |
| 5 | 5 | 59.1 | 56.2 | 10 / 35 | 4018 |
| 6 | 2 | 62.7 | 66.7 | 12 / 35 | 4289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 22 | 59% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| yagami.Tidus 0.11 | 19 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 75% |
| ejb.Polaris 1.0.1 | 8 | 63% |

Hadur died in 147 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 37% | 73 |
| yagami.Tidus 0.11 | 27 | 18% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 11% | 26 |
| kawigi.micro.Shiz 1.1 | 14 | 10% | 26 |
| ejb.Polaris 1.0.1 | 13 | 9% | 21 |
| stelo.MirrorNano 1.3 | 12 | 8% | 13 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 73.3 | 112 / 210 | 3.40 | 16.1% | 26257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 16.1% | 112 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 23 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 30 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 11 |
| ratosh.Nobo 0.21 | 4.7 | 11.1% | 13 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 10 |
| bayen.UbaMicro 1.4 | 6.5 | 9.4% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.0 | 22 / 35 | 4831 |
| 2 | 1 | 64.8 | 75.6 | 20 / 35 | 4277 |
| 3 | 1 | 65.2 | 77.5 | 22 / 35 | 4461 |
| 4 | 1 | 63.9 | 72.7 | 17 / 35 | 4309 |
| 5 | 1 | 61.7 | 65.4 | 15 / 35 | 4437 |
| 6 | 1 | 61.6 | 67.9 | 16 / 35 | 3942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 93% |
| wee.Gem 1.8.4 | 25 | 100% |
| wompi.Quokka 1.6 | 18 | 94% |
| ratosh.Nobo 0.21 | 12 | 75% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 379. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 22 | 22% | 52 |
| ratosh.Nobo 0.21 | 16 | 16% | 28 |
| bzdp.Pansy 2.1 | 14 | 14% | 46 |
| m3thos.Eva00 1.1 | 11 | 11% | 19 |
| maribo.FollowFire 1 | 11 | 11% | 11 |
| stelo.MyAgileRobot 0.2 | 8 | 8% | 15 |
| wompi.Quokka 1.6 | 6 | 6% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 6% | 9 |
| bayen.UbaMicro 1.4 | 5 | 5% | 14 |

## Melee bench: F15

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 83.4 | 121 / 210 | 2.49 | 20.1% | 44902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.1% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 65 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 16 |
| ayk.WallHugger 1.0 | 4.3 | 10.5% | 0 |
| exauge.GateKeeper 1.1.121g | 4.7 | 10.3% | 7 |
| stuff.Vlad 0.1 | 6.0 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 6.7% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 91.7 | 23 / 35 | 7698 |
| 2 | 1 | 71.8 | 84.8 | 21 / 35 | 7925 |
| 3 | 1 | 69.4 | 76.5 | 14 / 35 | 7390 |
| 4 | 1 | 72.9 | 89.5 | 23 / 35 | 7635 |
| 5 | 1 | 69.0 | 78.1 | 19 / 35 | 6918 |
| 6 | 1 | 70.8 | 80.0 | 21 / 35 | 7336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 91 | 82% |
| mz.NanoGod 2.02 | 17 | 71% |
| exauge.GateKeeper 1.1.121g | 17 | 82% |
| ayk.WallHugger 1.0 | 10 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 44% | 118 |
| mz.NanoGod 2.02 | 23 | 26% | 42 |
| exauge.GateKeeper 1.1.121g | 14 | 16% | 21 |
| stelo.PianistNano 1.2 | 6 | 7% | 6 |
| ayk.WallHugger 1.0 | 5 | 6% | 14 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.2 | 99 / 210 | 3.41 | 16.6% | 30160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 16.6% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.4% | 21 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.7% | 23 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.2% | 24 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 6 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 67.0 | 11 / 35 | 4973 |
| 2 | 1 | 65.1 | 73.0 | 14 / 35 | 5147 |
| 3 | 1 | 66.8 | 80.3 | 22 / 35 | 5112 |
| 4 | 1 | 62.0 | 65.7 | 14 / 35 | 4734 |
| 5 | 1 | 65.8 | 76.8 | 18 / 35 | 5088 |
| 6 | 1 | 65.9 | 76.5 | 20 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 75% |
| dummy.micro.Sparrow 2.5 | 19 | 79% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| ap.Frederick 1.1 | 11 | 100% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 20% | 56 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 18% | 40 |
| dummy.micro.Sparrow 2.5 | 19 | 17% | 38 |
| bvh.micro.Freya 0.3 | 12 | 11% | 21 |
| dl.BetterWalls 1.0 | 11 | 10% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 9% | 10 |
| conscience.Electron 1.3g | 9 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 18 |

## Melee bench: F17

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 88.3 | 154 / 210 | 2.05 | 21.7% | 44761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 21.7% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 10 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 14 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 14 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 8 |
| mme.NikeEnhanced 2.0 | 5.8 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.9% | 0 |
| sample.Corners 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 92.1 | 29 / 35 | 8143 |
| 2 | 1 | 71.1 | 89.8 | 24 / 35 | 6767 |
| 3 | 1 | 70.7 | 83.2 | 23 / 35 | 7441 |
| 4 | 1 | 71.0 | 84.1 | 23 / 35 | 7145 |
| 5 | 1 | 73.1 | 92.4 | 30 / 35 | 7563 |
| 6 | 1 | 72.4 | 88.3 | 25 / 35 | 7702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 47 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 89% |
| supersample.SuperBoxBot 1.0 | 26 | 77% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 34% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 23% | 58 |
| dsw.StaticD 1.0 | 9 | 16% | 21 |
| sul.Lunar 1.1 | 5 | 9% | 56 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 12 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 9 |
| sample.Corners 1.0 | 2 | 4% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 8 |

## Melee bench: F18

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.5 | 89 / 210 | 3.47 | 16.8% | 36443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 16.8% | 89 |
| radnor.DoctorBob 1.42 | 2.8 | 13.0% | 30 |
| mld.Wisdom 1.0 | 3.0 | 12.3% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.6% | 29 |
| amz.NanoClone 1.41 | 5.3 | 10.4% | 12 |
| KiraNL.Chupacabra 0.4 | 5.7 | 10.2% | 12 |
| sample.Walls 1.0 | 7.5 | 7.6% | 7 |
| GarmBox.Oranges 1.0 | 8.0 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.2 | 15 / 35 | 6202 |
| 2 | 1 | 66.0 | 72.4 | 14 / 35 | 6514 |
| 3 | 1 | 64.4 | 68.3 | 17 / 35 | 5949 |
| 4 | 1 | 66.9 | 77.5 | 17 / 35 | 6003 |
| 5 | 1 | 66.8 | 74.9 | 17 / 35 | 6245 |
| 6 | 1 | 62.4 | 66.0 | 9 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 90% |
| radnor.DoctorBob 1.42 | 29 | 83% |
| mld.Wisdom 1.0 | 21 | 52% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| amz.NanoClone 1.41 | 6 | 67% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 37 | 31% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 20% | 63 |
| radnor.DoctorBob 1.42 | 22 | 18% | 43 |
| KiraNL.Chupacabra 0.4 | 16 | 13% | 28 |
| amz.NanoClone 1.41 | 9 | 7% | 12 |
| sample.Walls 1.0 | 5 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 3% | 5 |
| jangs.ns51 1.0 | 4 | 3% | 4 |

