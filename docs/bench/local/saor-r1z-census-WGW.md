# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.7 | 138 / 210 | 2.20 | 21.1% | 43373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.1% | 138 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 28 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 18 |
| mld.Infinity 2.2 | 4.0 | 12.9% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 6 |
| sample.Walls 1.0 | 6.5 | 6.7% | 3 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 3.9% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 85.1 | 20 / 35 | 6939 |
| 2 | 1 | 72.7 | 88.9 | 24 / 35 | 7243 |
| 3 | 1 | 70.2 | 81.0 | 18 / 35 | 6969 |
| 4 | 1 | 72.7 | 89.2 | 25 / 35 | 7279 |
| 5 | 1 | 73.8 | 90.5 | 25 / 35 | 7909 |
| 6 | 1 | 71.7 | 85.7 | 26 / 35 | 7034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 89% |
| radnor.DoctorBob 1.42 | 38 | 66% |
| mld.Infinity 2.2 | 38 | 95% |
| amz.NanoClone 1.41 | 5 | 80% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 24 | 33% | 86 |
| radnor.DoctorBob 1.42 | 22 | 31% | 55 |
| mld.Infinity 2.2 | 12 | 17% | 37 |
| amz.NanoClone 1.41 | 5 | 7% | 9 |
| GarmBox.Oranges 1.0 | 5 | 7% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 1 | 1% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 5 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.1 | 131 / 210 | 2.25 | 18.9% | 32419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.9% | 131 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.6% | 41 |
| mld.DustBunny 3.8 | 2.8 | 13.7% | 23 |
| zyx.nano.Ant 1.1 | 4.7 | 9.5% | 1 |
| maribo.melee.BMV 0.1 | 4.7 | 10.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.2% | 8 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 2 |
| bzdp.BoxCar 2.0 | 8.3 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.4 | 18 / 35 | 5479 |
| 2 | 1 | 69.4 | 87.3 | 25 / 35 | 5736 |
| 3 | 1 | 68.5 | 86.7 | 23 / 35 | 5437 |
| 4 | 1 | 69.0 | 85.1 | 23 / 35 | 5477 |
| 5 | 1 | 68.5 | 85.7 | 20 / 35 | 5187 |
| 6 | 1 | 68.5 | 86.3 | 22 / 35 | 5103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 90% |
| oog.melee.Mercutio 1.0 | 59 | 81% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 24 | 30% | 72 |
| oog.melee.Mercutio 1.0 | 23 | 29% | 75 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 14% | 21 |
| zyx.nano.Ant 1.1 | 9 | 11% | 13 |
| maribo.melee.BMV 0.1 | 5 | 6% | 7 |
| bzdp.BoxCar 2.0 | 3 | 4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 8 |
| cs.Grudge 1.0 | 2 | 3% | 2 |
| fullsail.SweetTea 1.1 | 0 | 0% | 8 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.0 | 130 / 210 | 2.71 | 19.7% | 38181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.7% | 130 |
| myl.micro.Troodon 1.10 | 2.0 | 15.1% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.3% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.6% | 11 |
| fm.mammillarias 1.3 | 5.2 | 9.6% | 7 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.7% | 10 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 3 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 90.5 | 25 / 35 | 6523 |
| 2 | 1 | 70.1 | 81.6 | 19 / 35 | 6844 |
| 3 | 1 | 68.9 | 79.7 | 21 / 35 | 5910 |
| 4 | 1 | 67.7 | 75.6 | 19 / 35 | 5824 |
| 5 | 1 | 69.2 | 77.1 | 21 / 35 | 6676 |
| 6 | 1 | 70.4 | 81.3 | 25 / 35 | 6404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 90% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 95% |
| sp.Nanos.Ember 1.1 | 14 | 86% |
| fm.mammillarias 1.3 | 10 | 90% |
| myl.nano.KomoriNinja 1.1 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 21% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 19% | 34 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 21 |
| fm.mammillarias 1.3 | 11 | 14% | 17 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 23 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 16 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 20 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| sample.Tracker 1.0 | 3 | 4% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.8 | 143 / 210 | 2.10 | 20.7% | 39883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.7% | 143 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 20 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.3% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.6% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 5.8 | 8.4% | 6 |
| tj.zombie1n 1.0.1 | 6.0 | 8.5% | 5 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.0 | 22 / 35 | 6516 |
| 2 | 1 | 70.1 | 85.7 | 24 / 35 | 6388 |
| 3 | 1 | 70.2 | 85.4 | 23 / 35 | 6608 |
| 4 | 1 | 71.3 | 90.2 | 27 / 35 | 6681 |
| 5 | 1 | 71.2 | 89.2 | 24 / 35 | 6811 |
| 6 | 1 | 71.3 | 90.5 | 23 / 35 | 6879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 91% |
| stelo.SoJNanoMelee 1.1 | 35 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 75% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| yk.JahMicro 1.0 | 9 | 67% |
| tj.zombie1n 1.0.1 | 5 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 37% | 93 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 13% | 26 |
| stelo.SoJNanoMelee 1.1 | 8 | 12% | 27 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 27 |
| tj.zombie1n 1.0.1 | 6 | 9% | 7 |
| yk.JahMicro 1.0 | 5 | 7% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 5 |
| repositorio.NanoStep 1.0 | 3 | 4% | 9 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.3 | 98 / 210 | 3.76 | 16.5% | 30988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.5% | 98 |
| oog.melee.Corsair 1.0 | 2.7 | 12.1% | 33 |
| ahf.NanoAndrew .4 | 3.0 | 11.5% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.1% | 12 |
| EBBU.Sim2 1.02 | 4.5 | 10.5% | 8 |
| sam.Samspin 1.0 | 6.3 | 9.7% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.0% | 10 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 71.1 | 16 / 35 | 5065 |
| 2 | 1 | 63.6 | 66.3 | 16 / 35 | 5143 |
| 3 | 1 | 64.5 | 70.5 | 17 / 35 | 5151 |
| 4 | 1 | 60.8 | 60.3 | 10 / 35 | 4598 |
| 5 | 1 | 64.5 | 67.3 | 18 / 35 | 5273 |
| 6 | 1 | 68.4 | 80.3 | 21 / 35 | 5758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 97% |
| oog.melee.Corsair 1.0 | 30 | 60% |
| ahf.NanoAndrew .4 | 20 | 85% |
| sam.Samspin 1.0 | 9 | 100% |
| EBBU.Sim2 1.02 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 22% | 43 |
| robar.nano.Assertive_Melee 0.2 | 22 | 19% | 25 |
| EBBU.Sim2 1.02 | 16 | 14% | 25 |
| simonton.nano.MeleeSeed 1.8 | 14 | 12% | 46 |
| ahf.NanoAndrew .4 | 9 | 8% | 31 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 10 |
| sam.Samspin 1.0 | 8 | 7% | 17 |
| sample.TrackFire 1.0 | 5 | 4% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.6 | 123 / 210 | 2.39 | 18.8% | 32029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 18.8% | 123 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.5% | 38 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.3% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.2% | 18 |
| fm.claire 1.7 | 5.2 | 8.9% | 5 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.8% | 4 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 6 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.0 | 20 / 35 | 5455 |
| 2 | 1 | 69.8 | 87.9 | 26 / 35 | 5576 |
| 3 | 2 | 65.7 | 77.5 | 12 / 35 | 4962 |
| 4 | 1 | 70.0 | 90.8 | 25 / 35 | 5367 |
| 5 | 1 | 67.0 | 79.4 | 20 / 35 | 5106 |
| 6 | 1 | 68.6 | 85.7 | 20 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 80% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| gh.nano.Grofvuil 0.2 | 7 | 86% |
| sample.SpinBot 1.0 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| fm.claire 1.7 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 40% | 93 |
| oog.melee.CapuletDroid 1.1 | 10 | 11% | 33 |
| gh.nano.Grofvuil 0.2 | 10 | 11% | 17 |
| arthord.NanoSatanMelee Beta | 9 | 10% | 15 |
| fm.claire 1.7 | 9 | 10% | 14 |
| sample.SpinBot 1.0 | 7 | 8% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 15 |
| kurios.DOSexe .9b | 3 | 3% | 8 |
| pa.Improved 1.0 | 2 | 2% | 5 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.4 | 111 / 210 | 2.40 | 19.2% | 36691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.2% | 111 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.5% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.3% | 28 |
| mz.MicroGodMelee 1 | 3.2 | 13.4% | 29 |
| DBall.Anarchy 0.1 | 5.5 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.3% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.4% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 3 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 85.4 | 20 / 35 | 6641 |
| 2 | 1 | 70.2 | 90.2 | 21 / 35 | 5988 |
| 3 | 1 | 68.5 | 84.1 | 12 / 35 | 6078 |
| 4 | 1 | 69.2 | 82.9 | 22 / 35 | 6217 |
| 5 | 1 | 68.0 | 82.2 | 21 / 35 | 5473 |
| 6 | 1 | 68.7 | 81.9 | 15 / 35 | 6294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 83% |
| mz.MicroGodMelee 1 | 48 | 67% |
| gh.micro.Gruweltje 0.7 | 24 | 58% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 33% | 71 |
| gh.micro.Gruweltje 0.7 | 26 | 26% | 43 |
| spinnercat.micro.Tyger 0.1 | 24 | 24% | 62 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 13 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 70.8 | 110 / 210 | 3.63 | 16.7% | 31768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.7% | 110 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 30 |
| germ.TheMind .2 | 4.7 | 10.1% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 8.9% | 2 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.4% | 3 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.2% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 75.2 | 23 / 35 | 4904 |
| 2 | 1 | 66.4 | 76.5 | 20 / 35 | 5186 |
| 3 | 1 | 63.4 | 63.8 | 13 / 35 | 5420 |
| 4 | 1 | 67.3 | 76.5 | 18 / 35 | 6021 |
| 5 | 1 | 61.1 | 60.6 | 15 / 35 | 4602 |
| 6 | 1 | 66.4 | 72.1 | 21 / 35 | 5635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 85% |
| germ.TheMind .2 | 17 | 94% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 88% |
| awesomeness.Elite 1.0 | 9 | 89% |
| stelo.UntouchableNano 1.3 | 8 | 63% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 100 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 45% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 19% | 37 |
| awesomeness.Elite 1.0 | 10 | 10% | 16 |
| germ.TheMind .2 | 8 | 8% | 20 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 14 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 5 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.5 | 158 / 210 | 2.21 | 20.2% | 33125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.2% | 158 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 7 |
| maribo.IotaCT 1.1 | 4.2 | 10.7% | 7 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.6% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 2 |
| ratosh.Wesco 1.4 | 6.8 | 8.3% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 81.0 | 24 / 35 | 5104 |
| 2 | 1 | 71.9 | 90.8 | 28 / 35 | 5523 |
| 3 | 1 | 71.7 | 90.8 | 29 / 35 | 5695 |
| 4 | 1 | 71.3 | 90.5 | 28 / 35 | 5330 |
| 5 | 1 | 69.6 | 82.5 | 24 / 35 | 5712 |
| 6 | 1 | 70.1 | 83.5 | 25 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 89 | 96% |
| nz.jdc.nano.GridFu 1.0 | 23 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 80% |
| stelo.PatternRobot 1.0 | 15 | 100% |
| maribo.IotaCT 1.1 | 12 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 21% | 76 |
| nz.jdc.nano.GridFu 1.0 | 11 | 21% | 47 |
| timmit.nano.TimDog 0.33 | 9 | 17% | 21 |
| ratosh.Wesco 1.4 | 6 | 12% | 16 |
| stelo.PatternRobot 1.0 | 5 | 10% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 11 |
| maribo.IotaCT 1.1 | 4 | 8% | 23 |
| spinnercat.Omen 1.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.5 | 157 / 210 | 2.04 | 21.1% | 40399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.1% | 157 |
| baal.nano.N 1.42 | 2.5 | 12.2% | 12 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.3% | 17 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.4% | 4 |
| sanja.First 0.1 | 5.2 | 9.2% | 3 |
| zyx.micro.Ant 1.1 | 5.8 | 8.8% | 9 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.3% | 0 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 8 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 28 / 35 | 6898 |
| 2 | 1 | 71.4 | 90.8 | 28 / 35 | 6409 |
| 3 | 1 | 72.9 | 94.0 | 32 / 35 | 7032 |
| 4 | 1 | 72.1 | 89.2 | 27 / 35 | 7291 |
| 5 | 1 | 69.4 | 83.2 | 23 / 35 | 6672 |
| 6 | 1 | 68.3 | 80.6 | 19 / 35 | 6097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 50 | 92% |
| tvv.nano.Polaris 1.2 | 40 | 95% |
| sanja.First 0.1 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 94% |
| zyx.micro.Ant 1.1 | 17 | 76% |
| cvt.Firsty 1.0 | 15 | 80% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 26% | 37 |
| baal.nano.N 1.42 | 13 | 24% | 53 |
| tvv.nano.Polaris 1.2 | 9 | 17% | 54 |
| cvt.Firsty 1.0 | 5 | 9% | 15 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 14 |
| sanja.First 0.1 | 4 | 7% | 18 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 9 |
| sample.RamFire 1.0 | 1 | 2% | 3 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.8 | 87 / 210 | 3.62 | 16.2% | 32650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.3 | 16.2% | 87 |
| kc.micro.Figment 1.0 | 1.8 | 15.4% | 65 |
| cs.Wren 1.0 | 3.2 | 12.4% | 23 |
| js.PinBall 1.6 | 4.3 | 11.3% | 13 |
| mz.Cork 0.1 | 4.5 | 10.6% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 8.9% | 5 |
| evd.X1 0.01 | 7.2 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 7.7 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.9% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 67.0 | 12 / 35 | 5641 |
| 2 | 1 | 67.1 | 79.7 | 21 / 35 | 5241 |
| 3 | 1 | 66.8 | 77.8 | 15 / 35 | 5883 |
| 4 | 1 | 63.7 | 67.6 | 13 / 35 | 5722 |
| 5 | 2 | 64.0 | 69.5 | 13 / 35 | 5226 |
| 6 | 2 | 61.9 | 63.5 | 13 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 64% |
| cs.Wren 1.0 | 30 | 83% |
| mz.Cork 0.1 | 10 | 100% |
| js.PinBall 1.6 | 8 | 88% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 61 | 50% | 107 |
| cs.Wren 1.0 | 18 | 15% | 34 |
| js.PinBall 1.6 | 12 | 10% | 22 |
| joe.ADinosaur 1.0 | 9 | 7% | 10 |
| evd.X1 0.01 | 7 | 6% | 7 |
| mz.Cork 0.1 | 6 | 5% | 14 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.5 | 123 / 210 | 2.84 | 18.5% | 30855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.5% | 123 |
| ntc.Opposite 1.5 | 3.0 | 11.8% | 10 |
| myl.nano.Graviton 1.10 | 3.2 | 11.4% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.5% | 16 |
| disan.Chair 2.2.0 | 6.8 | 8.8% | 13 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 8 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.5 | 20 / 35 | 5356 |
| 2 | 1 | 69.3 | 89.2 | 22 / 35 | 5056 |
| 3 | 1 | 67.4 | 75.2 | 20 / 35 | 5591 |
| 4 | 1 | 66.2 | 74.9 | 23 / 35 | 4469 |
| 5 | 1 | 69.0 | 84.1 | 23 / 35 | 5378 |
| 6 | 1 | 64.5 | 71.1 | 15 / 35 | 5005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 94% |
| ntc.Opposite 1.5 | 24 | 88% |
| stelo.AreaTargetingBot 1.1 | 18 | 83% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 14 | 57% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| donjezza.Muncho 1.0 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 11 | 73% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 20% | 28 |
| myl.nano.Graviton 1.10 | 16 | 18% | 36 |
| stelo.AreaTargetingBot 1.1 | 13 | 15% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 14% | 29 |
| ntc.Opposite 1.5 | 9 | 10% | 23 |
| disan.Chair 2.2.0 | 9 | 10% | 18 |
| DBall.NUKE 0.1 | 6 | 7% | 21 |
| pbg.R2D2 1.0 | 3 | 3% | 8 |
| donjezza.Muncho 1.0 | 2 | 2% | 12 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.4 | 86 / 210 | 3.67 | 15.4% | 25093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.3 | 15.4% | 86 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.5% | 45 |
| oog.melee.Capulet 1.2 | 3.2 | 13.4% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.2% | 28 |
| yagami.Tidus 0.11 | 5.0 | 11.4% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.0% | 6 |
| stelo.MirrorNano 1.3 | 7.0 | 8.2% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.5 | 17 / 35 | 3835 |
| 2 | 2 | 63.9 | 68.6 | 15 / 35 | 4202 |
| 3 | 2 | 62.6 | 67.3 | 13 / 35 | 4004 |
| 4 | 1 | 62.6 | 66.7 | 12 / 35 | 4237 |
| 5 | 1 | 65.1 | 72.4 | 14 / 35 | 4708 |
| 6 | 1 | 65.9 | 77.8 | 15 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 75% |
| kawigi.micro.Shiz 1.1 | 28 | 96% |
| yagami.Tidus 0.11 | 18 | 94% |
| oog.melee.Capulet 1.2 | 18 | 67% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 33% | 59 |
| yagami.Tidus 0.11 | 24 | 19% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 51 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 26 |
| stelo.MirrorNano 1.3 | 9 | 7% | 11 |
| ejb.Polaris 1.0.1 | 7 | 6% | 13 |
| step.nanoPri 1.0 | 7 | 6% | 7 |
| kurios.DOSexe .9a | 6 | 5% | 6 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.8 | 124 / 210 | 3.09 | 17.0% | 26816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.0% | 124 |
| bzdp.Pansy 2.1 | 2.3 | 12.6% | 25 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 14 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 25 |
| wompi.Quokka 1.6 | 4.8 | 10.7% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 10.0% | 9 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 4 |
| stelo.MyAgileRobot 0.2 | 8.3 | 6.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 8.8 | 6.5% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.1 | 24 / 35 | 4756 |
| 2 | 1 | 65.1 | 77.5 | 22 / 35 | 4249 |
| 3 | 1 | 61.5 | 64.8 | 16 / 35 | 4008 |
| 4 | 1 | 66.7 | 81.0 | 22 / 35 | 4586 |
| 5 | 1 | 64.5 | 71.4 | 17 / 35 | 4613 |
| 6 | 1 | 67.1 | 81.9 | 23 / 35 | 4604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 95% |
| wee.Gem 1.8.4 | 17 | 94% |
| wompi.Quokka 1.6 | 16 | 94% |
| ratosh.Nobo 0.21 | 15 | 87% |
| m3thos.Eva00 1.1 | 13 | 62% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 17 | 20% | 30 |
| bzdp.Pansy 2.1 | 12 | 14% | 67 |
| m3thos.Eva00 1.1 | 11 | 13% | 19 |
| bayen.UbaMicro 1.4 | 11 | 13% | 18 |
| wee.Gem 1.8.4 | 10 | 11% | 27 |
| maribo.FollowFire 1 | 9 | 10% | 11 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 8 |
| wompi.Quokka 1.6 | 6 | 7% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 90.4 | 135 / 210 | 1.87 | 22.7% | 52125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 22.7% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 57 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 10 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.2% | 5 |
| stuff.Vlad 0.1 | 5.2 | 9.0% | 1 |
| ayk.WallHugger 1.0 | 5.2 | 9.4% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 85.1 | 18 / 35 | 7868 |
| 2 | 1 | 73.9 | 91.1 | 20 / 35 | 8544 |
| 3 | 1 | 73.0 | 86.0 | 24 / 35 | 8076 |
| 4 | 1 | 75.4 | 94.6 | 25 / 35 | 9560 |
| 5 | 1 | 74.7 | 91.7 | 23 / 35 | 8997 |
| 6 | 1 | 75.0 | 93.7 | 25 / 35 | 9080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 137 | 77% |
| exauge.GateKeeper 1.1.121g | 18 | 78% |
| mz.NanoGod 2.02 | 16 | 69% |
| stelo.PianistNano 1.2 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 58% | 143 |
| mz.NanoGod 2.02 | 13 | 17% | 30 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 11 |
| ayk.WallHugger 1.0 | 5 | 7% | 10 |
| stuff.Vlad 0.1 | 4 | 5% | 6 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.3 | 115 / 210 | 3.13 | 17.2% | 29369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.2% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.1% | 19 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.4% | 19 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.4% | 13 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 9 |
| conscience.Electron 1.3g | 7.0 | 7.9% | 3 |
| ap.Frederick 1.1 | 8.0 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 9.3 | 6.1% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 64.4 | 16 / 35 | 4239 |
| 2 | 1 | 66.7 | 80.6 | 21 / 35 | 4756 |
| 3 | 1 | 65.5 | 78.1 | 17 / 35 | 4619 |
| 4 | 1 | 66.6 | 79.0 | 20 / 35 | 5239 |
| 5 | 1 | 67.6 | 81.6 | 24 / 35 | 5225 |
| 6 | 1 | 65.7 | 74.0 | 17 / 35 | 5291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 92% |
| bvh.micro.Freya 0.3 | 24 | 75% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 74% |
| dummy.micro.Sparrow 2.5 | 23 | 96% |
| stelo.MirrorMicro 1.0 | 9 | 89% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 95 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 21% | 20 |
| voidious.micro.BlitzBat 1.05 | 17 | 18% | 57 |
| bvh.micro.Freya 0.3 | 17 | 18% | 31 |
| conscience.Electron 1.3g | 13 | 14% | 14 |
| dummy.micro.Sparrow 2.5 | 10 | 11% | 38 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 9% | 30 |
| dl.BetterWalls 1.0 | 5 | 5% | 8 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 84.6 | 143 / 210 | 2.39 | 21.3% | 44369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.3% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 20 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 9 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 11 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 6 |
| sample.Corners 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 81.9 | 21 / 35 | 6887 |
| 2 | 1 | 72.2 | 86.3 | 26 / 35 | 7425 |
| 3 | 1 | 71.4 | 85.1 | 25 / 35 | 6969 |
| 4 | 1 | 71.8 | 82.5 | 24 / 35 | 7819 |
| 5 | 1 | 72.4 | 89.2 | 23 / 35 | 7853 |
| 6 | 1 | 71.4 | 82.2 | 24 / 35 | 7416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 92% |
| supersample.SuperBoxBot 1.0 | 22 | 95% |
| dsw.StaticD 1.0 | 11 | 64% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 29% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 26% | 49 |
| dsw.StaticD 1.0 | 9 | 13% | 21 |
| mme.NikeEnhanced 2.0 | 7 | 10% | 11 |
| sul.Lunar 1.1 | 5 | 7% | 59 |
| sample.MyFirstRobot 1.0 | 5 | 7% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sample.Corners 1.0 | 2 | 3% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.2 | 111 / 210 | 2.88 | 18.5% | 38798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.5% | 111 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 27 |
| mld.Wisdom 1.0 | 2.8 | 13.0% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 10.9% | 15 |
| amz.NanoClone 1.41 | 4.5 | 11.3% | 17 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.5% | 3 |
| sample.Walls 1.0 | 7.8 | 7.1% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.3 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.0 | 20 / 35 | 6209 |
| 2 | 1 | 66.8 | 76.8 | 18 / 35 | 5934 |
| 3 | 1 | 67.9 | 75.9 | 20 / 35 | 6456 |
| 4 | 1 | 70.0 | 86.7 | 21 / 35 | 6967 |
| 5 | 1 | 67.3 | 76.2 | 13 / 35 | 6548 |
| 6 | 1 | 68.6 | 80.3 | 19 / 35 | 6684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 87% |
| mld.Wisdom 1.0 | 24 | 67% |
| amz.NanoClone 1.41 | 17 | 71% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 34% | 52 |
| radnor.DoctorBob 1.42 | 25 | 25% | 57 |
| KiraNL.Chupacabra 0.4 | 17 | 17% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 10% | 35 |
| amz.NanoClone 1.41 | 9 | 9% | 22 |
| sample.Walls 1.0 | 3 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 7 |

