# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.2 | 133 / 210 | 2.33 | 20.6% | 42106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.6% | 133 |
| mz.AntiGrav 1.0 | 2.3 | 14.4% | 27 |
| radnor.DoctorBob 1.42 | 3.2 | 13.8% | 24 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 6 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.3% | 1 |
| sample.Walls 1.0 | 7.2 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 78.7 | 17 / 35 | 6920 |
| 2 | 1 | 71.6 | 87.6 | 24 / 35 | 6846 |
| 3 | 1 | 69.3 | 77.8 | 19 / 35 | 6660 |
| 4 | 1 | 71.3 | 83.5 | 22 / 35 | 7155 |
| 5 | 1 | 73.2 | 91.7 | 24 / 35 | 7332 |
| 6 | 1 | 72.8 | 92.1 | 27 / 35 | 7193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 83% |
| mld.Infinity 2.2 | 36 | 94% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| amz.NanoClone 1.41 | 7 | 57% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 31 | 40% | 74 |
| radnor.DoctorBob 1.42 | 23 | 30% | 57 |
| amz.NanoClone 1.41 | 12 | 16% | 21 |
| mld.Infinity 2.2 | 6 | 8% | 41 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.1 | 117 / 210 | 2.34 | 18.9% | 33760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.9% | 117 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 54 |
| mld.DustBunny 3.8 | 2.8 | 14.3% | 21 |
| maribo.melee.BMV 0.1 | 4.3 | 10.1% | 6 |
| zyx.nano.Ant 1.1 | 6.3 | 8.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.1% | 8 |
| bzdp.BoxCar 2.0 | 8.0 | 6.4% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.3% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.3 | 19 / 35 | 4809 |
| 2 | 1 | 67.7 | 84.8 | 19 / 35 | 4928 |
| 3 | 1 | 70.1 | 91.4 | 22 / 35 | 5844 |
| 4 | 1 | 71.4 | 94.9 | 24 / 35 | 6158 |
| 5 | 1 | 69.0 | 84.1 | 22 / 35 | 5715 |
| 6 | 1 | 67.0 | 74.0 | 11 / 35 | 6306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 63 | 83% |
| oog.melee.Mercutio 1.0 | 62 | 74% |
| maribo.melee.BMV 0.1 | 10 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 37% | 83 |
| mld.DustBunny 3.8 | 28 | 30% | 76 |
| maribo.melee.BMV 0.1 | 8 | 9% | 17 |
| zyx.nano.Ant 1.1 | 5 | 5% | 7 |
| cs.Grudge 1.0 | 5 | 5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 6 |
| fullsail.SweetTea 1.1 | 4 | 4% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 7 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 83.6 | 126 / 210 | 2.48 | 19.7% | 36483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.7% | 126 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.3% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.9% | 19 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 11 |
| fm.mammillarias 1.3 | 6.3 | 8.6% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 5 |
| sample.Fire 1.0 | 9.3 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.6 | 26 / 35 | 6696 |
| 2 | 1 | 68.4 | 80.3 | 18 / 35 | 6102 |
| 3 | 1 | 67.8 | 77.1 | 19 / 35 | 5481 |
| 4 | 1 | 69.9 | 82.2 | 21 / 35 | 6512 |
| 5 | 1 | 70.1 | 87.3 | 21 / 35 | 5901 |
| 6 | 1 | 68.8 | 80.0 | 21 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 60 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 73% |
| cb.nano.Insomnia 1.0 | 25 | 92% |
| fm.mammillarias 1.3 | 9 | 89% |
| myl.nano.KomoriNinja 1.1 | 9 | 89% |
| sp.Nanos.Ember 1.1 | 9 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 23 | 27% | 42 |
| myl.micro.Troodon 1.10 | 18 | 21% | 73 |
| cb.nano.Insomnia 1.0 | 13 | 15% | 19 |
| myl.nano.KomoriNinja 1.1 | 12 | 14% | 31 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 14 |
| sample.Fire 1.0 | 5 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 10 |
| fm.mammillarias 1.3 | 3 | 4% | 9 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.8 | 148 / 210 | 2.19 | 20.6% | 39475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.6% | 148 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.3% | 18 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.0% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.5% | 11 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.0% | 6 |
| yk.JahMicro 1.0 | 6.7 | 8.3% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 5.9% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.5 | 24 / 35 | 6619 |
| 2 | 1 | 68.0 | 75.6 | 22 / 35 | 6213 |
| 3 | 1 | 70.3 | 84.1 | 24 / 35 | 6843 |
| 4 | 1 | 72.8 | 95.6 | 29 / 35 | 6797 |
| 5 | 1 | 71.2 | 89.8 | 28 / 35 | 6402 |
| 6 | 1 | 69.9 | 85.4 | 21 / 35 | 6601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 94% |
| stelo.SoJNanoMelee 1.1 | 31 | 90% |
| tvv.micro.Antares 1.1.1 | 23 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| tj.zombie1n 1.0.1 | 13 | 77% |
| yk.JahMicro 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 33% | 87 |
| stelo.SoJNanoMelee 1.1 | 11 | 17% | 33 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 11 |
| yk.JahMicro 1.0 | 6 | 10% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 14 |
| tj.zombie1n 1.0.1 | 4 | 6% | 5 |
| repositorio.NanoStep 1.0 | 2 | 3% | 12 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.0 | 93 / 210 | 3.70 | 16.2% | 30179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 16.2% | 93 |
| oog.melee.Corsair 1.0 | 1.8 | 13.5% | 47 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 20 |
| ahf.NanoAndrew .4 | 3.8 | 10.8% | 18 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 9.5% | 9 |
| sam.Samspin 1.0 | 6.5 | 9.1% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.2 | 18 / 35 | 5277 |
| 2 | 1 | 65.2 | 71.4 | 19 / 35 | 5052 |
| 3 | 1 | 62.5 | 66.3 | 13 / 35 | 4581 |
| 4 | 1 | 65.0 | 73.0 | 17 / 35 | 4998 |
| 5 | 2 | 62.1 | 65.1 | 11 / 35 | 4862 |
| 6 | 1 | 64.4 | 67.9 | 15 / 35 | 5409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 65% |
| simonton.nano.MeleeSeed 1.8 | 38 | 89% |
| ahf.NanoAndrew .4 | 18 | 78% |
| EBBU.Sim2 1.02 | 9 | 89% |
| sam.Samspin 1.0 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 21% | 50 |
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 47 |
| robar.nano.Assertive_Melee 0.2 | 20 | 17% | 25 |
| ahf.NanoAndrew .4 | 12 | 10% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 11 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 12 |
| sam.Samspin 1.0 | 8 | 7% | 11 |
| EBBU.Sim2 1.02 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.9 | 119 / 210 | 2.54 | 18.5% | 31672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.5% | 119 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 30 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.3% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.7% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.6% | 12 |
| fm.claire 1.7 | 6.7 | 8.1% | 5 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.8% | 3 |
| sample.SpinBot 1.0 | 7.7 | 6.8% | 3 |
| pa.Improved 1.0 | 9.3 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.9 | 20 / 35 | 4950 |
| 2 | 1 | 69.5 | 88.6 | 23 / 35 | 5545 |
| 3 | 1 | 65.5 | 76.8 | 19 / 35 | 4673 |
| 4 | 1 | 68.0 | 82.9 | 20 / 35 | 5431 |
| 5 | 1 | 68.8 | 82.5 | 20 / 35 | 5988 |
| 6 | 1 | 67.5 | 84.4 | 17 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 82% |
| oog.melee.CapuletDroid 1.1 | 23 | 87% |
| gh.nano.Grofvuil 0.2 | 16 | 63% |
| fm.claire 1.7 | 11 | 73% |
| arthord.NanoSatanMelee Beta | 10 | 70% |
| winamp32.micro.MicroMacro 1.0 | 10 | 80% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 32% | 84 |
| gh.nano.Grofvuil 0.2 | 13 | 14% | 29 |
| oog.melee.CapuletDroid 1.1 | 12 | 13% | 33 |
| arthord.NanoSatanMelee Beta | 9 | 10% | 15 |
| fm.claire 1.7 | 8 | 9% | 13 |
| sample.SpinBot 1.0 | 6 | 7% | 8 |
| kurios.DOSexe .9b | 6 | 7% | 8 |
| pa.Improved 1.0 | 5 | 5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 13 |

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 84.2 | 120 / 210 | 2.42 | 19.2% | 37058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.2% | 120 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.9% | 21 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 24 |
| DBall.Anarchy 0.1 | 5.5 | 7.9% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.3 | 6.3% | 1 |
| acogdev.alpha 0.2 | 8.5 | 5.6% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.6 | 18 / 35 | 6076 |
| 2 | 1 | 69.8 | 87.6 | 22 / 35 | 5948 |
| 3 | 1 | 69.5 | 85.1 | 21 / 35 | 6263 |
| 4 | 1 | 68.9 | 83.5 | 22 / 35 | 5964 |
| 5 | 1 | 69.0 | 81.3 | 21 / 35 | 6100 |
| 6 | 1 | 70.1 | 86.3 | 16 / 35 | 6707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 55 | 95% |
| mz.MicroGodMelee 1 | 55 | 78% |
| gh.micro.Gruweltje 0.7 | 18 | 56% |
| caimano.Furia_Ceca 0.22 | 6 | 83% |
| el.JumpShoot 0.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 26 | 29% | 69 |
| gh.micro.Gruweltje 0.7 | 24 | 27% | 41 |
| spinnercat.micro.Tyger 0.1 | 21 | 23% | 64 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 14 |
| acogdev.alpha 0.2 | 5 | 6% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.0 | 105 / 210 | 3.61 | 16.7% | 31344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.7% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 13.7% | 30 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.8% | 37 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.1% | 13 |
| germ.TheMind .2 | 5.0 | 9.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.8% | 5 |
| awesomeness.Elite 1.0 | 6.7 | 8.2% | 8 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.2% | 3 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 64.1 | 17 / 35 | 5325 |
| 2 | 2 | 61.0 | 59.7 | 15 / 35 | 4552 |
| 3 | 1 | 64.3 | 68.9 | 13 / 35 | 5305 |
| 4 | 1 | 67.8 | 81.0 | 21 / 35 | 5504 |
| 5 | 1 | 65.1 | 71.7 | 17 / 35 | 5178 |
| 6 | 1 | 68.3 | 80.6 | 22 / 35 | 5480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 77% |
| germ.TheMind .2 | 9 | 78% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 67% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 53% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 16% | 37 |
| awesomeness.Elite 1.0 | 11 | 10% | 17 |
| germ.TheMind .2 | 7 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 10 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 11 |
| sample.Crazy 1.0 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.6 | 142 / 210 | 2.20 | 20.0% | 33173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.0% | 142 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 11.9% | 16 |
| maribo.IotaCT 1.1 | 4.3 | 10.1% | 6 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.8% | 11 |
| ratosh.Wesco 1.4 | 6.3 | 9.0% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 2 |
| stelo.PatternRobot 1.0 | 7.3 | 8.5% | 7 |
| spinnercat.Omen 1.0 | 8.7 | 7.4% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.3 | 25 / 35 | 5342 |
| 2 | 1 | 69.1 | 85.4 | 20 / 35 | 5235 |
| 3 | 1 | 71.7 | 88.9 | 25 / 35 | 6078 |
| 4 | 1 | 68.7 | 80.6 | 21 / 35 | 5422 |
| 5 | 1 | 72.4 | 93.0 | 29 / 35 | 5615 |
| 6 | 1 | 69.8 | 84.4 | 22 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 89% |
| nz.jdc.nano.GridFu 1.0 | 27 | 93% |
| timmit.nano.TimDog 0.33 | 18 | 72% |
| maribo.IotaCT 1.1 | 14 | 100% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| ratosh.Wesco 1.4 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 26% | 74 |
| nz.jdc.nano.GridFu 1.0 | 13 | 19% | 44 |
| timmit.nano.TimDog 0.33 | 9 | 13% | 24 |
| stelo.PatternRobot 1.0 | 9 | 13% | 15 |
| ratosh.Wesco 1.4 | 8 | 12% | 19 |
| maribo.IotaCT 1.1 | 4 | 6% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 8 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.3 | 162 / 210 | 1.87 | 21.6% | 41870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.6% | 162 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 15 |
| baal.nano.N 1.42 | 3.0 | 12.0% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 2 |
| zyx.micro.Ant 1.1 | 4.3 | 10.0% | 9 |
| sanja.First 0.1 | 6.7 | 8.1% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 6.9% | 2 |
| cvt.Firsty 1.0 | 8.2 | 6.9% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 92.4 | 31 / 35 | 7140 |
| 2 | 1 | 72.1 | 90.8 | 27 / 35 | 7184 |
| 3 | 1 | 72.1 | 97.1 | 29 / 35 | 6571 |
| 4 | 1 | 71.2 | 87.3 | 24 / 35 | 7091 |
| 5 | 1 | 72.8 | 92.7 | 28 / 35 | 7280 |
| 6 | 1 | 69.6 | 81.6 | 23 / 35 | 6604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 51 | 90% |
| baal.nano.N 1.42 | 43 | 91% |
| cvt.Firsty 1.0 | 21 | 95% |
| zyx.micro.Ant 1.1 | 19 | 79% |
| amk.Punbot.Punbot 0.01 | 15 | 93% |
| sanja.First 0.1 | 14 | 86% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 10 | 20% | 46 |
| tvv.nano.Polaris 1.2 | 8 | 16% | 64 |
| zyx.micro.Ant 1.1 | 7 | 14% | 31 |
| sanja.First 0.1 | 7 | 14% | 26 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 12 |
| amk.Punbot.Punbot 0.01 | 4 | 8% | 5 |
| sample.RamFire 1.0 | 4 | 8% | 4 |
| cvt.Firsty 1.0 | 3 | 6% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.2 | 74 / 210 | 3.59 | 16.0% | 32016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.0% | 74 |
| kc.micro.Figment 1.0 | 1.7 | 14.8% | 68 |
| cs.Wren 1.0 | 3.2 | 12.4% | 26 |
| js.PinBall 1.6 | 3.8 | 11.5% | 16 |
| joe.ADinosaur 1.0 | 5.5 | 9.7% | 3 |
| mz.Cork 0.1 | 5.5 | 9.9% | 9 |
| evd.X1 0.01 | 7.0 | 8.2% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.8% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 69.5 | 9 / 35 | 4928 |
| 2 | 1 | 65.3 | 72.4 | 14 / 35 | 5659 |
| 3 | 2 | 62.2 | 66.7 | 13 / 35 | 4942 |
| 4 | 1 | 63.9 | 67.3 | 12 / 35 | 5689 |
| 5 | 1 | 64.9 | 74.0 | 14 / 35 | 5460 |
| 6 | 1 | 65.4 | 77.5 | 12 / 35 | 5338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 64% |
| cs.Wren 1.0 | 26 | 69% |
| js.PinBall 1.6 | 10 | 40% |
| mz.Cork 0.1 | 10 | 70% |
| donjezza.Jezza 1.0 | 5 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 35% | 84 |
| js.PinBall 1.6 | 18 | 13% | 26 |
| cs.Wren 1.0 | 17 | 13% | 29 |
| mz.Cork 0.1 | 13 | 10% | 21 |
| joe.ADinosaur 1.0 | 13 | 10% | 15 |
| evd.X1 0.01 | 11 | 8% | 11 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| donjezza.Jezza 1.0 | 5 | 4% | 9 |
| jsal.Jsalbot 1.0 | 2 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.2 | 135 / 210 | 2.24 | 19.5% | 30995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.5% | 135 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 30 |
| ntc.Opposite 1.5 | 2.8 | 11.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.6% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.8% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.0% | 6 |
| disan.Chair 2.2.0 | 7.5 | 8.2% | 5 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.0 | 22 / 35 | 4735 |
| 2 | 1 | 68.5 | 84.8 | 21 / 35 | 4924 |
| 3 | 1 | 68.9 | 86.0 | 22 / 35 | 5289 |
| 4 | 1 | 69.2 | 85.4 | 21 / 35 | 5404 |
| 5 | 1 | 71.3 | 94.0 | 27 / 35 | 5594 |
| 6 | 1 | 69.2 | 87.3 | 22 / 35 | 5049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 45 | 80% |
| stelo.AreaTargetingBot 1.1 | 32 | 81% |
| ntc.Opposite 1.5 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| DBall.NUKE 0.1 | 13 | 100% |
| disan.Chair 2.2.0 | 12 | 92% |
| donjezza.Muncho 1.0 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 22 | 29% | 52 |
| stelo.AreaTargetingBot 1.1 | 16 | 21% | 44 |
| pfvicm.Sobieski 7.2.3b | 16 | 21% | 25 |
| ntc.Opposite 1.5 | 10 | 13% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 8% | 18 |
| disan.Chair 2.2.0 | 3 | 4% | 16 |
| DBall.NUKE 0.1 | 2 | 3% | 20 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |
| pbg.R2D2 1.0 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.7 | 82 / 210 | 3.46 | 15.8% | 25660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 15.8% | 82 |
| oog.melee.Capulet 1.2 | 2.3 | 14.5% | 52 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.1% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 24 |
| yagami.Tidus 0.11 | 4.8 | 11.6% | 11 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 15 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 67.9 | 11 / 35 | 4633 |
| 2 | 2 | 63.5 | 68.3 | 14 / 35 | 3839 |
| 3 | 1 | 65.8 | 76.8 | 14 / 35 | 4364 |
| 4 | 1 | 64.4 | 70.5 | 13 / 35 | 4420 |
| 5 | 1 | 63.9 | 72.1 | 12 / 35 | 4215 |
| 6 | 1 | 66.5 | 80.6 | 18 / 35 | 4189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 79% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 12 | 50% |
| ejb.Polaris 1.0.1 | 5 | 60% |

Hadur died in 128 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 31% | 70 |
| yagami.Tidus 0.11 | 25 | 20% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 43 |
| ejb.Polaris 1.0.1 | 14 | 11% | 20 |
| step.nanoPri 1.0 | 10 | 8% | 11 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 25 |
| stelo.MirrorNano 1.3 | 5 | 4% | 4 |
| kurios.DOSexe .9a | 5 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.0 | 118 / 210 | 2.71 | 17.8% | 28497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.8% | 118 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 25 |
| wompi.Quokka 1.6 | 3.7 | 11.9% | 15 |
| ratosh.Nobo 0.21 | 3.8 | 11.4% | 12 |
| wee.Gem 1.8.4 | 4.3 | 11.3% | 26 |
| m3thos.Eva00 1.1 | 5.8 | 9.4% | 11 |
| bayen.UbaMicro 1.4 | 7.0 | 8.2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.2 | 19 / 35 | 4874 |
| 2 | 1 | 68.8 | 85.1 | 23 / 35 | 5211 |
| 3 | 1 | 67.7 | 85.7 | 22 / 35 | 4646 |
| 4 | 1 | 67.5 | 81.3 | 20 / 35 | 4925 |
| 5 | 1 | 65.9 | 77.5 | 19 / 35 | 4516 |
| 6 | 1 | 63.5 | 74.0 | 15 / 35 | 4325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 90% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 26 | 88% |
| ratosh.Nobo 0.21 | 15 | 73% |
| m3thos.Eva00 1.1 | 14 | 71% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 18% | 52 |
| ratosh.Nobo 0.21 | 15 | 16% | 30 |
| m3thos.Eva00 1.1 | 14 | 15% | 22 |
| wee.Gem 1.8.4 | 13 | 14% | 51 |
| wompi.Quokka 1.6 | 10 | 11% | 24 |
| bayen.UbaMicro 1.4 | 9 | 10% | 10 |
| maribo.FollowFire 1 | 8 | 9% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 3% | 3 |

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.0 | 136 / 210 | 1.99 | 22.4% | 51421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.4% | 136 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 16 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.1% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.6% | 1 |
| stuff.Vlad 0.1 | 5.3 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 91.7 | 24 / 35 | 8897 |
| 2 | 1 | 73.3 | 87.0 | 22 / 35 | 8390 |
| 3 | 1 | 73.4 | 86.7 | 27 / 35 | 8104 |
| 4 | 1 | 74.6 | 92.1 | 25 / 35 | 9102 |
| 5 | 1 | 72.6 | 86.3 | 15 / 35 | 8150 |
| 6 | 1 | 74.3 | 90.5 | 23 / 35 | 8778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 84% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| stelo.PianistNano 1.2 | 5 | 80% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 75 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 47% | 141 |
| mz.NanoGod 2.02 | 22 | 29% | 34 |
| stuff.Vlad 0.1 | 6 | 8% | 8 |
| ayk.WallHugger 1.0 | 5 | 7% | 11 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 11 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.9 | 101 / 210 | 3.44 | 16.5% | 29083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.5% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.7% | 18 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 27 |
| bvh.micro.Freya 0.3 | 3.5 | 11.6% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 23 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 5 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 6 |
| ap.Frederick 1.1 | 8.3 | 6.5% | 8 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.0 | 17 / 35 | 4794 |
| 2 | 1 | 63.5 | 68.3 | 17 / 35 | 4703 |
| 3 | 1 | 64.4 | 74.6 | 15 / 35 | 4738 |
| 4 | 1 | 62.9 | 68.9 | 16 / 35 | 4510 |
| 5 | 1 | 65.2 | 72.4 | 18 / 35 | 5099 |
| 6 | 1 | 66.0 | 74.0 | 18 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 83% |
| dummy.micro.Sparrow 2.5 | 27 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 0% |

Hadur died in 109 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 23 | 21% | 47 |
| voidious.micro.BlitzBat 1.05 | 19 | 17% | 50 |
| conscience.Electron 1.3g | 15 | 14% | 18 |
| bvh.micro.Freya 0.3 | 14 | 13% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 30 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 13 |
| dl.BetterWalls 1.0 | 5 | 5% | 9 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.0 | 150 / 210 | 1.99 | 22.0% | 44875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.0% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 17 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 9 |
| sul.Lunar 1.1 | 3.8 | 11.3% | 11 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 3 |
| dsw.StaticD 1.0 | 5.3 | 9.4% | 10 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 7 |
| sample.Corners 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 95.2 | 29 / 35 | 7908 |
| 2 | 1 | 68.6 | 71.7 | 20 / 35 | 6975 |
| 3 | 1 | 72.9 | 92.4 | 26 / 35 | 7273 |
| 4 | 1 | 73.9 | 93.7 | 30 / 35 | 7805 |
| 5 | 1 | 72.2 | 88.9 | 22 / 35 | 7437 |
| 6 | 1 | 72.6 | 92.1 | 23 / 35 | 7477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 82% |
| supersample.SuperBoxBot 1.0 | 29 | 90% |
| dsw.StaticD 1.0 | 18 | 67% |
| mme.NikeEnhanced 2.0 | 12 | 92% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 15 | 25% | 55 |
| supersample.SuperBoxBot 1.0 | 14 | 23% | 38 |
| dsw.StaticD 1.0 | 10 | 17% | 24 |
| sul.Lunar 1.1 | 8 | 13% | 59 |
| mme.NikeEnhanced 2.0 | 8 | 13% | 15 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 78.9 | 116 / 210 | 2.90 | 18.6% | 39099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.6% | 116 |
| radnor.DoctorBob 1.42 | 2.8 | 12.5% | 26 |
| mld.Wisdom 1.0 | 3.2 | 12.5% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.5% | 16 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 6 |
| amz.NanoClone 1.41 | 5.3 | 10.4% | 9 |
| sample.Walls 1.0 | 7.7 | 7.6% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 79.4 | 21 / 35 | 6209 |
| 2 | 1 | 70.7 | 87.3 | 24 / 35 | 6968 |
| 3 | 1 | 67.6 | 76.8 | 19 / 35 | 6674 |
| 4 | 1 | 65.1 | 69.8 | 14 / 35 | 5986 |
| 5 | 1 | 67.9 | 77.5 | 18 / 35 | 6472 |
| 6 | 1 | 69.2 | 82.5 | 20 / 35 | 6790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 94% |
| radnor.DoctorBob 1.42 | 31 | 77% |
| mld.Wisdom 1.0 | 22 | 77% |
| amz.NanoClone 1.41 | 15 | 93% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 27% | 44 |
| radnor.DoctorBob 1.42 | 18 | 19% | 44 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 54 |
| amz.NanoClone 1.41 | 7 | 7% | 16 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 6 |

