# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 92.1 | 162 / 210 | 1.71 | 21.9% | 42520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.9% | 162 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 11 |
| mz.AntiGrav 1.0 | 2.8 | 14.1% | 19 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.6% | 0 |
| sample.Walls 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 88.6 | 27 / 35 | 6838 |
| 2 | 1 | 73.2 | 94.6 | 28 / 35 | 6903 |
| 3 | 1 | 71.9 | 89.8 | 26 / 35 | 6622 |
| 4 | 1 | 73.7 | 91.7 | 26 / 35 | 7983 |
| 5 | 1 | 72.9 | 93.0 | 27 / 35 | 7038 |
| 6 | 1 | 73.5 | 94.6 | 28 / 35 | 7136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 96% |
| radnor.DoctorBob 1.42 | 40 | 93% |
| mld.Infinity 2.2 | 36 | 100% |
| jangs.ns51 1.0 | 8 | 88% |
| amz.NanoClone 1.41 | 7 | 43% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 35% | 59 |
| mz.AntiGrav 1.0 | 8 | 17% | 67 |
| mld.Infinity 2.2 | 8 | 17% | 43 |
| amz.NanoClone 1.41 | 8 | 17% | 17 |
| jangs.ns51 1.0 | 3 | 6% | 13 |
| GarmBox.Oranges 1.0 | 2 | 4% | 4 |
| arthord.MannyPacquiao Beta | 2 | 4% | 3 |
| sample.Walls 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.2 | 132 / 210 | 2.24 | 18.9% | 31375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.9% | 132 |
| mld.DustBunny 3.8 | 2.5 | 14.2% | 20 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.2% | 39 |
| maribo.melee.BMV 0.1 | 4.0 | 10.8% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.2% | 7 |
| zyx.nano.Ant 1.1 | 6.5 | 8.3% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.7% | 0 |
| bzdp.BoxCar 2.0 | 8.7 | 6.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.8 | 22 / 35 | 5207 |
| 2 | 1 | 69.1 | 88.9 | 22 / 35 | 5209 |
| 3 | 1 | 69.8 | 93.7 | 25 / 35 | 5012 |
| 4 | 1 | 68.0 | 85.4 | 25 / 35 | 4952 |
| 5 | 1 | 70.7 | 94.0 | 27 / 35 | 5292 |
| 6 | 1 | 65.0 | 65.7 | 11 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 75 | 87% |
| oog.melee.Mercutio 1.0 | 54 | 74% |
| maribo.melee.BMV 0.1 | 10 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 26 | 33% | 80 |
| oog.melee.Mercutio 1.0 | 21 | 27% | 70 |
| maribo.melee.BMV 0.1 | 7 | 9% | 15 |
| zyx.nano.Ant 1.1 | 7 | 9% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 13 |
| fullsail.SweetTea 1.1 | 4 | 5% | 10 |
| cs.Grudge 1.0 | 4 | 5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.9 | 135 / 210 | 2.36 | 19.7% | 34912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.7% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 14 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 10 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 2 |
| sample.Fire 1.0 | 9.2 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 22 / 35 | 5335 |
| 2 | 1 | 67.2 | 78.1 | 16 / 35 | 5388 |
| 3 | 1 | 70.2 | 84.8 | 25 / 35 | 5835 |
| 4 | 1 | 71.2 | 93.3 | 25 / 35 | 5866 |
| 5 | 1 | 71.3 | 89.5 | 24 / 35 | 6449 |
| 6 | 1 | 69.3 | 81.6 | 23 / 35 | 6039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 84% |
| cb.nano.Insomnia 1.0 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 15 | 80% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 5 | 60% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 33% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 17% | 44 |
| myl.nano.KomoriNinja 1.1 | 12 | 16% | 37 |
| fm.mammillarias 1.3 | 11 | 15% | 14 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 11 |
| sample.Tracker 1.0 | 3 | 4% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 10 |
| sample.Fire 1.0 | 0 | 0% | 6 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.5 | 150 / 210 | 2.13 | 20.1% | 36086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.1% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 10 |
| tj.zombie1n 1.0.1 | 5.0 | 9.4% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.5% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 4 |
| yk.JahMicro 1.0 | 6.8 | 8.3% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 28 / 35 | 5781 |
| 2 | 1 | 69.1 | 83.2 | 23 / 35 | 6107 |
| 3 | 1 | 69.1 | 85.1 | 24 / 35 | 5850 |
| 4 | 1 | 68.7 | 81.3 | 25 / 35 | 5674 |
| 5 | 1 | 72.5 | 95.9 | 30 / 35 | 6740 |
| 6 | 1 | 68.6 | 84.8 | 20 / 35 | 5934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 89% |
| stelo.SoJNanoMelee 1.1 | 38 | 89% |
| tj.zombie1n 1.0.1 | 21 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 90% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| yk.JahMicro 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 67% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 42% | 87 |
| stelo.SoJNanoMelee 1.1 | 11 | 18% | 37 |
| tvv.micro.Antares 1.1.1 | 9 | 15% | 32 |
| tj.zombie1n 1.0.1 | 6 | 10% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 7 |
| repositorio.NanoStep 1.0 | 2 | 3% | 4 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |
| yk.JahMicro 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.9 | 91 / 210 | 3.70 | 16.0% | 28590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.0% | 91 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 36 |
| ahf.NanoAndrew .4 | 2.8 | 12.1% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 23 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.4% | 3 |
| sam.Samspin 1.0 | 6.0 | 9.8% | 12 |
| EBBU.Sim2 1.02 | 6.7 | 9.3% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.7% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 70.5 | 17 / 35 | 4911 |
| 2 | 1 | 65.0 | 72.4 | 19 / 35 | 4826 |
| 3 | 1 | 64.1 | 71.7 | 18 / 35 | 4483 |
| 4 | 1 | 62.9 | 67.3 | 13 / 35 | 4944 |
| 5 | 1 | 63.6 | 71.4 | 13 / 35 | 4515 |
| 6 | 1 | 62.6 | 66.3 | 11 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 70% |
| simonton.nano.MeleeSeed 1.8 | 34 | 85% |
| ahf.NanoAndrew .4 | 18 | 78% |
| EBBU.Sim2 1.02 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sam.Samspin 1.0 | 5 | 80% |

Hadur died in 122 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 18% | 46 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 49 |
| ahf.NanoAndrew .4 | 21 | 17% | 38 |
| EBBU.Sim2 1.02 | 14 | 11% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| sam.Samspin 1.0 | 11 | 9% | 19 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 7% | 12 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.3 | 138 / 210 | 2.23 | 19.0% | 30458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.0% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.5% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.3% | 0 |
| fm.claire 1.7 | 6.3 | 8.5% | 0 |
| sample.SpinBot 1.0 | 8.7 | 6.0% | 1 |
| pa.Improved 1.0 | 9.0 | 5.8% | 2 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 24 / 35 | 5298 |
| 2 | 1 | 68.2 | 82.2 | 25 / 35 | 5240 |
| 3 | 1 | 68.5 | 85.7 | 21 / 35 | 5122 |
| 4 | 1 | 69.2 | 91.1 | 25 / 35 | 4605 |
| 5 | 1 | 67.4 | 80.3 | 23 / 35 | 4793 |
| 6 | 1 | 69.6 | 90.8 | 20 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 89 | 84% |
| oog.melee.CapuletDroid 1.1 | 27 | 78% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 72 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 36% | 94 |
| oog.melee.CapuletDroid 1.1 | 12 | 17% | 37 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 26 |
| sample.SpinBot 1.0 | 6 | 8% | 8 |
| kurios.DOSexe .9b | 5 | 7% | 10 |
| arthord.NanoSatanMelee Beta | 4 | 6% | 13 |
| fm.claire 1.7 | 4 | 6% | 7 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 10 |

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.0 | 109 / 210 | 2.71 | 18.1% | 33796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.1% | 109 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.7% | 36 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 28 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 27 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 6 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.4% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 0 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 84.8 | 20 / 35 | 6679 |
| 2 | 1 | 68.1 | 84.8 | 19 / 35 | 5460 |
| 3 | 1 | 65.2 | 76.2 | 16 / 35 | 4911 |
| 4 | 1 | 66.2 | 74.3 | 15 / 35 | 5838 |
| 5 | 1 | 69.2 | 86.0 | 23 / 35 | 5634 |
| 6 | 1 | 67.5 | 80.0 | 16 / 35 | 5274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 65 | 88% |
| mz.MicroGodMelee 1 | 36 | 81% |
| gh.micro.Gruweltje 0.7 | 29 | 59% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 31% | 77 |
| gh.micro.Gruweltje 0.7 | 28 | 28% | 53 |
| mz.MicroGodMelee 1 | 23 | 23% | 50 |
| acogdev.alpha 0.2 | 8 | 8% | 8 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 74.9 | 111 / 210 | 3.26 | 17.1% | 30343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.1% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 15.3% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.1% | 27 |
| germ.TheMind .2 | 4.7 | 9.8% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 5 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 5 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 74.9 | 21 / 35 | 5209 |
| 2 | 1 | 59.2 | 58.4 | 15 / 35 | 4064 |
| 3 | 1 | 66.0 | 76.8 | 17 / 35 | 4846 |
| 4 | 1 | 66.2 | 76.8 | 20 / 35 | 4861 |
| 5 | 1 | 69.0 | 84.4 | 23 / 35 | 5533 |
| 6 | 1 | 67.4 | 78.1 | 15 / 35 | 5830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 76% |
| germ.TheMind .2 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 75% |
| awesomeness.Elite 1.0 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 41% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 32 |
| germ.TheMind .2 | 11 | 11% | 19 |
| awesomeness.Elite 1.0 | 9 | 9% | 19 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 13 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| sample.Crazy 1.0 | 4 | 4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.4 | 154 / 210 | 2.05 | 19.7% | 28662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.7% | 154 |
| rz.HawkOnFire 0.1 | 2.3 | 13.6% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.9% | 13 |
| timmit.nano.TimDog 0.33 | 4.7 | 9.8% | 5 |
| maribo.IotaCT 1.1 | 4.8 | 10.2% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.3% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 8.0% | 6 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 5 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 27 / 35 | 4321 |
| 2 | 1 | 68.3 | 84.4 | 26 / 35 | 4128 |
| 3 | 1 | 70.2 | 91.1 | 23 / 35 | 4932 |
| 4 | 1 | 70.6 | 89.2 | 26 / 35 | 5058 |
| 5 | 1 | 70.9 | 88.3 | 25 / 35 | 5206 |
| 6 | 1 | 71.1 | 91.4 | 27 / 35 | 5017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 88% |
| nz.jdc.nano.GridFu 1.0 | 34 | 97% |
| stelo.PatternRobot 1.0 | 20 | 95% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| maribo.IotaCT 1.1 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 60% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 34% | 77 |
| timmit.nano.TimDog 0.33 | 12 | 21% | 27 |
| nz.jdc.nano.GridFu 1.0 | 9 | 16% | 44 |
| maribo.IotaCT 1.1 | 4 | 7% | 17 |
| ratosh.Wesco 1.4 | 4 | 7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 11 |
| stelo.PatternRobot 1.0 | 3 | 5% | 15 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.3 | 185 / 210 | 1.42 | 21.8% | 37409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.8% | 185 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 7 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 7 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 0 |
| zyx.micro.Ant 1.1 | 5.0 | 9.3% | 7 |
| sanja.First 0.1 | 5.8 | 8.6% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.6% | 0 |
| cvt.Firsty 1.0 | 8.2 | 6.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 30 / 35 | 5932 |
| 2 | 1 | 71.8 | 97.1 | 32 / 35 | 6212 |
| 3 | 1 | 72.4 | 97.1 | 31 / 35 | 6428 |
| 4 | 1 | 71.5 | 92.1 | 30 / 35 | 6158 |
| 5 | 1 | 73.2 | 99.4 | 34 / 35 | 6517 |
| 6 | 1 | 71.0 | 92.7 | 28 / 35 | 6162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 91% |
| tvv.nano.Polaris 1.2 | 43 | 93% |
| sanja.First 0.1 | 26 | 96% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| cvt.Firsty 1.0 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 26 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 6 | 23% | 37 |
| tvv.nano.Polaris 1.2 | 5 | 19% | 48 |
| baal.nano.N 1.42 | 4 | 15% | 41 |
| sanja.First 0.1 | 3 | 12% | 28 |
| Grystrion.TrackerWO 1.0 | 3 | 12% | 17 |
| sample.RamFire 1.0 | 3 | 12% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 11 |
| cvt.Firsty 1.0 | 0 | 0% | 20 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 67.5 | 86 / 210 | 3.92 | 15.3% | 29942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.3 | 15.3% | 86 |
| kc.micro.Figment 1.0 | 2.2 | 14.3% | 57 |
| cs.Wren 1.0 | 3.0 | 12.8% | 23 |
| js.PinBall 1.6 | 4.2 | 11.3% | 21 |
| mz.Cork 0.1 | 4.3 | 11.6% | 14 |
| joe.ADinosaur 1.0 | 6.3 | 9.6% | 4 |
| evd.X1 0.01 | 6.7 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 1 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 68.3 | 15 / 35 | 4886 |
| 2 | 1 | 64.7 | 69.5 | 17 / 35 | 5313 |
| 3 | 1 | 64.9 | 72.1 | 15 / 35 | 5512 |
| 4 | 1 | 64.9 | 73.3 | 16 / 35 | 5158 |
| 5 | 1 | 61.1 | 61.9 | 16 / 35 | 4607 |
| 6 | 2 | 58.6 | 60.0 | 7 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 65% |
| cs.Wren 1.0 | 26 | 92% |
| mz.Cork 0.1 | 15 | 93% |
| js.PinBall 1.6 | 7 | 71% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 38% | 88 |
| joe.ADinosaur 1.0 | 16 | 13% | 17 |
| evd.X1 0.01 | 15 | 12% | 15 |
| cs.Wren 1.0 | 11 | 9% | 30 |
| mz.Cork 0.1 | 10 | 8% | 26 |
| js.PinBall 1.6 | 10 | 8% | 17 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.1 | 138 / 210 | 2.61 | 18.4% | 27010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.4% | 138 |
| ntc.Opposite 1.5 | 2.5 | 12.3% | 8 |
| myl.nano.Graviton 1.10 | 2.8 | 11.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.9% | 10 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.4% | 1 |
| disan.Chair 2.2.0 | 6.5 | 8.5% | 10 |
| DBall.NUKE 0.1 | 8.0 | 7.7% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 25 / 35 | 4462 |
| 2 | 1 | 66.8 | 78.1 | 25 / 35 | 4422 |
| 3 | 1 | 69.0 | 88.6 | 25 / 35 | 4684 |
| 4 | 1 | 66.1 | 78.1 | 20 / 35 | 4412 |
| 5 | 1 | 67.3 | 82.2 | 22 / 35 | 4367 |
| 6 | 1 | 67.2 | 81.0 | 21 / 35 | 4663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 84% |
| ntc.Opposite 1.5 | 27 | 96% |
| stelo.AreaTargetingBot 1.1 | 25 | 84% |
| disan.Chair 2.2.0 | 17 | 94% |
| donjezza.Muncho 1.0 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| DBall.NUKE 0.1 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 23% | 43 |
| pfvicm.Sobieski 7.2.3b | 16 | 22% | 27 |
| ntc.Opposite 1.5 | 12 | 16% | 35 |
| stelo.AreaTargetingBot 1.1 | 10 | 14% | 37 |
| disan.Chair 2.2.0 | 7 | 10% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 7% | 22 |
| pbg.R2D2 1.0 | 4 | 5% | 7 |
| DBall.NUKE 0.1 | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.9 | 90 / 210 | 3.35 | 15.8% | 25109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 15.8% | 90 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 38 |
| oog.melee.Capulet 1.2 | 3.0 | 13.4% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 25 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 71.4 | 11 / 35 | 4010 |
| 2 | 2 | 61.7 | 63.8 | 14 / 35 | 3963 |
| 3 | 1 | 65.7 | 76.2 | 17 / 35 | 4289 |
| 4 | 1 | 65.0 | 73.0 | 13 / 35 | 4593 |
| 5 | 1 | 67.4 | 82.5 | 20 / 35 | 4084 |
| 6 | 1 | 64.6 | 76.2 | 15 / 35 | 4170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 72% |
| oog.melee.Capulet 1.2 | 26 | 65% |
| yagami.Tidus 0.11 | 24 | 92% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| ejb.Polaris 1.0.1 | 3 | 67% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 36% | 60 |
| yagami.Tidus 0.11 | 22 | 18% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 47 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 28 |
| ejb.Polaris 1.0.1 | 7 | 6% | 14 |
| kurios.DOSexe .9a | 7 | 6% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.9 | 139 / 210 | 2.63 | 17.7% | 26076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.7% | 139 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 21 |
| wompi.Quokka 1.6 | 3.7 | 11.8% | 15 |
| ratosh.Nobo 0.21 | 3.8 | 11.6% | 11 |
| wee.Gem 1.8.4 | 4.2 | 11.3% | 15 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 3 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 6.0% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.2 | 24 / 35 | 4343 |
| 2 | 1 | 66.9 | 81.6 | 23 / 35 | 4561 |
| 3 | 1 | 67.3 | 82.5 | 25 / 35 | 4395 |
| 4 | 1 | 63.1 | 72.7 | 19 / 35 | 3766 |
| 5 | 1 | 66.4 | 80.3 | 24 / 35 | 4342 |
| 6 | 1 | 67.9 | 85.1 | 24 / 35 | 4669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 94% |
| wee.Gem 1.8.4 | 30 | 100% |
| wompi.Quokka 1.6 | 24 | 92% |
| ratosh.Nobo 0.21 | 21 | 90% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 13 | 18% | 29 |
| bzdp.Pansy 2.1 | 11 | 15% | 60 |
| m3thos.Eva00 1.1 | 10 | 14% | 18 |
| maribo.FollowFire 1 | 9 | 13% | 9 |
| bayen.UbaMicro 1.4 | 8 | 11% | 16 |
| wompi.Quokka 1.6 | 7 | 10% | 25 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 6 |
| wee.Gem 1.8.4 | 3 | 4% | 39 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 88.1 | 138 / 210 | 2.07 | 21.5% | 46105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.5% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 49 |
| mz.NanoGod 2.02 | 3.0 | 15.1% | 19 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 5.3 | 8.7% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 89.2 | 24 / 35 | 7923 |
| 2 | 1 | 74.7 | 94.6 | 28 / 35 | 8297 |
| 3 | 1 | 70.2 | 79.4 | 19 / 35 | 6868 |
| 4 | 1 | 72.6 | 88.6 | 25 / 35 | 7631 |
| 5 | 1 | 73.6 | 91.7 | 21 / 35 | 7955 |
| 6 | 1 | 72.3 | 85.4 | 21 / 35 | 7431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 86% |
| mz.NanoGod 2.02 | 19 | 74% |
| exauge.GateKeeper 1.1.121g | 9 | 78% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 44% | 136 |
| mz.NanoGod 2.02 | 28 | 38% | 46 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 10 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.2 | 101 / 210 | 3.50 | 16.5% | 28714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.5% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 26 |
| bvh.micro.Freya 0.3 | 3.2 | 11.9% | 21 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.0% | 14 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 6 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 71.4 | 15 / 35 | 4293 |
| 2 | 1 | 66.2 | 76.8 | 17 / 35 | 5120 |
| 3 | 1 | 64.7 | 71.7 | 19 / 35 | 4911 |
| 4 | 1 | 65.2 | 73.3 | 17 / 35 | 4996 |
| 5 | 1 | 64.2 | 70.8 | 17 / 35 | 4709 |
| 6 | 1 | 63.4 | 68.9 | 16 / 35 | 4685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| bvh.micro.Freya 0.3 | 28 | 82% |
| dummy.micro.Sparrow 2.5 | 24 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 73% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| ap.Frederick 1.1 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 22 | 20% | 20 |
| dummy.micro.Sparrow 2.5 | 20 | 18% | 37 |
| voidious.micro.BlitzBat 1.05 | 19 | 17% | 60 |
| bvh.micro.Freya 0.3 | 13 | 12% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 30 |
| conscience.Electron 1.3g | 10 | 9% | 14 |
| dl.BetterWalls 1.0 | 9 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.4 | 158 / 210 | 2.14 | 21.3% | 41061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.3% | 158 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.6% | 14 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 10 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.1% | 14 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 1 |
| dsw.StaticD 1.0 | 5.3 | 8.8% | 4 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.3% | 4 |
| sample.Corners 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 89.2 | 27 / 35 | 6975 |
| 2 | 1 | 73.9 | 95.2 | 29 / 35 | 7591 |
| 3 | 1 | 69.5 | 80.0 | 24 / 35 | 6298 |
| 4 | 1 | 70.6 | 83.2 | 23 / 35 | 6718 |
| 5 | 1 | 71.8 | 88.3 | 27 / 35 | 6770 |
| 6 | 1 | 71.5 | 88.3 | 28 / 35 | 6709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 47 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 47 | 96% |
| supersample.SuperBoxBot 1.0 | 26 | 92% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 29% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 23% | 59 |
| dsw.StaticD 1.0 | 8 | 15% | 20 |
| mme.NikeEnhanced 2.0 | 4 | 8% | 9 |
| sul.Lunar 1.1 | 3 | 6% | 54 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 7 |
| sample.Corners 1.0 | 3 | 6% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 10 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 10 |

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.5 | 110 / 210 | 2.75 | 18.4% | 36867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.4% | 110 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 36 |
| mld.Wisdom 1.0 | 3.3 | 12.3% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.7% | 29 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.0% | 8 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 6 |
| sample.Walls 1.0 | 7.2 | 7.3% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.2 | 20 / 35 | 6222 |
| 2 | 1 | 67.5 | 78.7 | 17 / 35 | 6169 |
| 3 | 1 | 68.4 | 81.6 | 17 / 35 | 6620 |
| 4 | 1 | 68.1 | 79.7 | 18 / 35 | 6280 |
| 5 | 1 | 66.2 | 75.9 | 19 / 35 | 5589 |
| 6 | 1 | 68.3 | 84.1 | 19 / 35 | 5987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 88% |
| radnor.DoctorBob 1.42 | 34 | 65% |
| mld.Wisdom 1.0 | 25 | 80% |
| sample.Walls 1.0 | 9 | 89% |
| amz.NanoClone 1.41 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 7 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 30% | 55 |
| mld.Wisdom 1.0 | 21 | 21% | 40 |
| KiraNL.Chupacabra 0.4 | 20 | 20% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 52 |
| amz.NanoClone 1.41 | 8 | 8% | 14 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 1 | 1% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

