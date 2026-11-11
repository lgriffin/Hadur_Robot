# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 88.4 | 153 / 210 | 2.05 | 21.6% | 43863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.6% | 153 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 15 |
| radnor.DoctorBob 1.42 | 3.3 | 13.4% | 18 |
| mld.Infinity 2.2 | 3.5 | 13.3% | 14 |
| amz.NanoClone 1.41 | 4.7 | 10.6% | 6 |
| GarmBox.Oranges 1.0 | 6.5 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.2% | 1 |
| sample.Walls 1.0 | 7.3 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 1 |
| sample.Target 1.0 | 9.7 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 95.2 | 26 / 35 | 8025 |
| 2 | 1 | 72.5 | 88.9 | 27 / 35 | 7189 |
| 3 | 1 | 73.0 | 88.9 | 25 / 35 | 7313 |
| 4 | 1 | 70.9 | 84.1 | 23 / 35 | 6802 |
| 5 | 1 | 71.5 | 83.2 | 24 / 35 | 7020 |
| 6 | 1 | 73.0 | 89.8 | 28 / 35 | 7514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 87 | 93% |
| mld.Infinity 2.2 | 36 | 100% |
| radnor.DoctorBob 1.42 | 25 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 24 | 42% | 96 |
| radnor.DoctorBob 1.42 | 16 | 28% | 47 |
| amz.NanoClone 1.41 | 8 | 14% | 17 |
| GarmBox.Oranges 1.0 | 3 | 5% | 8 |
| sample.Walls 1.0 | 3 | 5% | 3 |
| mld.Infinity 2.2 | 2 | 4% | 34 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.8 | 113 / 210 | 2.46 | 18.6% | 33094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 18.6% | 113 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.2% | 68 |
| mld.DustBunny 3.8 | 2.7 | 14.2% | 19 |
| maribo.melee.BMV 0.1 | 4.7 | 10.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 6.5 | 7.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.6% | 6 |
| fullsail.SweetTea 1.1 | 7.3 | 7.4% | 1 |
| bzdp.BoxCar 2.0 | 9.2 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 19 / 35 | 5332 |
| 2 | 1 | 70.0 | 90.2 | 25 / 35 | 5640 |
| 3 | 1 | 69.4 | 90.2 | 21 / 35 | 5778 |
| 4 | 1 | 69.2 | 85.4 | 21 / 35 | 5605 |
| 5 | 1 | 68.5 | 85.7 | 18 / 35 | 5453 |
| 6 | 2 | 62.5 | 60.6 | 9 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 63 | 86% |
| oog.melee.Mercutio 1.0 | 54 | 74% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 47% | 85 |
| mld.DustBunny 3.8 | 21 | 22% | 74 |
| maribo.melee.BMV 0.1 | 7 | 7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 10 |
| fullsail.SweetTea 1.1 | 5 | 5% | 10 |
| zyx.nano.Ant 1.1 | 5 | 5% | 9 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 82.3 | 125 / 210 | 2.60 | 19.7% | 37650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.7% | 125 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.2% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.2% | 18 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 6 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 8 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 79.0 | 19 / 35 | 6234 |
| 2 | 1 | 68.1 | 78.4 | 19 / 35 | 6131 |
| 3 | 1 | 69.8 | 86.3 | 22 / 35 | 5895 |
| 4 | 1 | 69.0 | 81.6 | 21 / 35 | 5893 |
| 5 | 1 | 70.5 | 80.6 | 22 / 35 | 6909 |
| 6 | 1 | 71.2 | 87.6 | 22 / 35 | 6588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 74% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 19 | 84% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 22% | 40 |
| myl.micro.Troodon 1.10 | 17 | 20% | 59 |
| fm.mammillarias 1.3 | 14 | 16% | 19 |
| myl.nano.KomoriNinja 1.1 | 8 | 9% | 38 |
| sp.Nanos.Ember 1.1 | 8 | 9% | 22 |
| cs.sheldor.Talon 1.1 | 8 | 9% | 12 |
| cb.nano.Insomnia 1.0 | 7 | 8% | 13 |
| sample.Fire 1.0 | 4 | 5% | 4 |
| sample.Tracker 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.8 | 160 / 210 | 2.19 | 21.0% | 40722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.0% | 160 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 10 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 5.7 | 8.5% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.8% | 13 |
| yk.JahMicro 1.0 | 6.3 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.0% | 7 |
| repositorio.NanoStep 1.0 | 9.2 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.9 | 24 / 35 | 6240 |
| 2 | 1 | 70.1 | 82.5 | 25 / 35 | 6778 |
| 3 | 1 | 70.2 | 83.5 | 24 / 35 | 6703 |
| 4 | 1 | 72.0 | 89.2 | 29 / 35 | 7101 |
| 5 | 1 | 70.2 | 86.0 | 26 / 35 | 6400 |
| 6 | 1 | 73.7 | 96.8 | 32 / 35 | 7500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 92% |
| stelo.SoJNanoMelee 1.1 | 34 | 88% |
| tvv.micro.Antares 1.1.1 | 32 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 85% |
| yk.JahMicro 1.0 | 11 | 100% |
| tj.zombie1n 1.0.1 | 10 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 46% | 88 |
| stelo.SoJNanoMelee 1.1 | 6 | 12% | 24 |
| tvv.micro.Antares 1.1.1 | 5 | 10% | 37 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 10% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 17 |
| tj.zombie1n 1.0.1 | 3 | 6% | 11 |
| repositorio.NanoStep 1.0 | 3 | 6% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 2 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.6 | 103 / 210 | 3.46 | 16.9% | 31068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.9% | 103 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 37 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.4% | 22 |
| EBBU.Sim2 1.02 | 5.7 | 9.5% | 3 |
| sam.Samspin 1.0 | 6.2 | 9.2% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.1% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.6 | 22 / 35 | 5440 |
| 2 | 1 | 65.9 | 75.9 | 16 / 35 | 5433 |
| 3 | 1 | 61.6 | 61.6 | 11 / 35 | 4763 |
| 4 | 1 | 64.8 | 70.8 | 17 / 35 | 4882 |
| 5 | 1 | 64.8 | 70.5 | 16 / 35 | 5276 |
| 6 | 1 | 66.3 | 75.6 | 21 / 35 | 5274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 87% |
| oog.melee.Corsair 1.0 | 38 | 55% |
| ahf.NanoAndrew .4 | 35 | 83% |
| EBBU.Sim2 1.02 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 23% | 47 |
| simonton.nano.MeleeSeed 1.8 | 20 | 19% | 47 |
| ahf.NanoAndrew .4 | 15 | 14% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 11% | 11 |
| robar.nano.Assertive_Melee 0.2 | 11 | 10% | 17 |
| EBBU.Sim2 1.02 | 10 | 9% | 15 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 10 |
| sam.Samspin 1.0 | 4 | 4% | 8 |
| sample.TrackFire 1.0 | 3 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.4 | 126 / 210 | 2.40 | 19.0% | 33268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.0% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 37 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.4% | 15 |
| arthord.NanoSatanMelee Beta | 4.5 | 9.6% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.1% | 3 |
| fm.claire 1.7 | 6.8 | 8.3% | 2 |
| pa.Improved 1.0 | 8.3 | 6.5% | 1 |
| sample.SpinBot 1.0 | 8.7 | 6.4% | 4 |
| kurios.DOSexe .9b | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.8 | 28 / 35 | 6039 |
| 2 | 1 | 66.6 | 79.4 | 16 / 35 | 5388 |
| 3 | 1 | 68.7 | 83.8 | 20 / 35 | 5683 |
| 4 | 1 | 68.5 | 84.4 | 21 / 35 | 5509 |
| 5 | 1 | 64.9 | 74.3 | 12 / 35 | 4994 |
| 6 | 1 | 71.1 | 94.0 | 29 / 35 | 5655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 84% |
| oog.melee.CapuletDroid 1.1 | 28 | 93% |
| arthord.NanoSatanMelee Beta | 15 | 73% |
| gh.nano.Grofvuil 0.2 | 14 | 64% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 38% | 91 |
| gh.nano.Grofvuil 0.2 | 14 | 17% | 24 |
| arthord.NanoSatanMelee Beta | 14 | 17% | 22 |
| oog.melee.CapuletDroid 1.1 | 11 | 13% | 37 |
| fm.claire 1.7 | 6 | 7% | 8 |
| pa.Improved 1.0 | 4 | 5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 10 |
| kurios.DOSexe .9b | 1 | 1% | 6 |
| sample.SpinBot 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.7 | 105 / 210 | 2.56 | 18.7% | 35638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.7% | 105 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.5% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 13.2% | 33 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.3% | 2 |
| DBall.Anarchy 0.1 | 5.7 | 8.2% | 4 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.7% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.7 | 14 / 35 | 6053 |
| 2 | 1 | 69.3 | 83.5 | 19 / 35 | 6043 |
| 3 | 1 | 69.5 | 88.6 | 18 / 35 | 6257 |
| 4 | 1 | 67.6 | 81.0 | 18 / 35 | 5070 |
| 5 | 1 | 70.1 | 87.0 | 19 / 35 | 6289 |
| 6 | 1 | 67.1 | 76.5 | 17 / 35 | 5926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 76% |
| mz.MicroGodMelee 1 | 49 | 69% |
| gh.micro.Gruweltje 0.7 | 32 | 63% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 31% | 63 |
| gh.micro.Gruweltje 0.7 | 30 | 29% | 56 |
| spinnercat.micro.Tyger 0.1 | 22 | 21% | 60 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 9 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 66.8 | 98 / 210 | 3.99 | 16.0% | 31096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 16.0% | 98 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.0% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.3% | 36 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 10.4% | 9 |
| awesomeness.Elite 1.0 | 6.3 | 9.0% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 9.0% | 7 |
| germ.TheMind .2 | 6.3 | 8.9% | 8 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.1% | 7 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 67.3 | 17 / 35 | 4853 |
| 2 | 1 | 62.4 | 62.2 | 14 / 35 | 5031 |
| 3 | 2 | 60.5 | 55.6 | 14 / 35 | 4903 |
| 4 | 1 | 65.8 | 73.3 | 17 / 35 | 5420 |
| 5 | 1 | 66.5 | 73.0 | 19 / 35 | 5884 |
| 6 | 1 | 64.3 | 69.5 | 17 / 35 | 5005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 78% |
| awesomeness.Elite 1.0 | 8 | 75% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| germ.TheMind .2 | 6 | 83% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 112 of 210 rounds, at a mean tick of 376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 46% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 18% | 33 |
| germ.TheMind .2 | 12 | 11% | 18 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 15 |
| awesomeness.Elite 1.0 | 7 | 6% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 12 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 4 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.5 | 156 / 210 | 2.04 | 20.5% | 33785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.5% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 8 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.0% | 8 |
| maribo.IotaCT 1.1 | 4.7 | 10.0% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.5% | 7 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 86.7 | 26 / 35 | 5726 |
| 2 | 1 | 71.5 | 93.3 | 27 / 35 | 5211 |
| 3 | 1 | 71.2 | 89.8 | 24 / 35 | 6010 |
| 4 | 1 | 70.3 | 83.5 | 24 / 35 | 5559 |
| 5 | 1 | 70.1 | 86.0 | 26 / 35 | 5369 |
| 6 | 1 | 72.1 | 91.4 | 29 / 35 | 5910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 84 | 93% |
| nz.jdc.nano.GridFu 1.0 | 33 | 100% |
| stelo.PatternRobot 1.0 | 15 | 87% |
| timmit.nano.TimDog 0.33 | 12 | 75% |
| maribo.IotaCT 1.1 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |

Hadur died in 54 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 39% | 80 |
| stelo.PatternRobot 1.0 | 15 | 28% | 27 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 21 |
| ratosh.Wesco 1.4 | 5 | 9% | 13 |
| nz.jdc.nano.GridFu 1.0 | 2 | 4% | 46 |
| maribo.IotaCT 1.1 | 2 | 4% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 5 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 91.6 | 163 / 210 | 1.76 | 22.0% | 42956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.0% | 163 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 19 |
| baal.nano.N 1.42 | 2.7 | 11.6% | 7 |
| zyx.micro.Ant 1.1 | 4.5 | 9.3% | 10 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.1% | 1 |
| sanja.First 0.1 | 5.7 | 8.7% | 4 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.4% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.7 | 28 / 35 | 7483 |
| 2 | 1 | 72.0 | 92.1 | 25 / 35 | 7283 |
| 3 | 1 | 72.5 | 94.0 | 29 / 35 | 7019 |
| 4 | 1 | 72.4 | 89.8 | 28 / 35 | 7624 |
| 5 | 1 | 70.5 | 90.2 | 24 / 35 | 6560 |
| 6 | 1 | 72.0 | 91.7 | 29 / 35 | 6987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 87% |
| cvt.Firsty 1.0 | 30 | 93% |
| tvv.nano.Polaris 1.2 | 30 | 87% |
| sanja.First 0.1 | 26 | 96% |
| zyx.micro.Ant 1.1 | 20 | 80% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 32% | 39 |
| baal.nano.N 1.42 | 12 | 26% | 51 |
| tvv.nano.Polaris 1.2 | 8 | 17% | 40 |
| cvt.Firsty 1.0 | 5 | 11% | 24 |
| sample.RamFire 1.0 | 3 | 6% | 5 |
| sanja.First 0.1 | 2 | 4% | 22 |
| Grystrion.TrackerWO 1.0 | 1 | 2% | 11 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.7 | 83 / 210 | 3.81 | 15.8% | 32457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.5 | 15.8% | 83 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 67 |
| cs.Wren 1.0 | 2.8 | 13.1% | 20 |
| mz.Cork 0.1 | 4.3 | 11.2% | 13 |
| js.PinBall 1.6 | 4.7 | 11.0% | 20 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 0 |
| evd.X1 0.01 | 6.7 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 3 |
| PSW.Relentless 0.1 | 9.3 | 5.1% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 68.3 | 14 / 35 | 5377 |
| 2 | 1 | 63.6 | 68.9 | 13 / 35 | 5282 |
| 3 | 1 | 65.9 | 74.9 | 17 / 35 | 5801 |
| 4 | 2 | 65.1 | 71.4 | 14 / 35 | 5663 |
| 5 | 2 | 60.5 | 58.1 | 10 / 35 | 4877 |
| 6 | 1 | 64.2 | 70.8 | 15 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 63% |
| cs.Wren 1.0 | 25 | 84% |
| mz.Cork 0.1 | 13 | 100% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| js.PinBall 1.6 | 4 | 0% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 46% | 106 |
| cs.Wren 1.0 | 19 | 15% | 31 |
| js.PinBall 1.6 | 11 | 9% | 13 |
| mz.Cork 0.1 | 10 | 8% | 23 |
| joe.ADinosaur 1.0 | 10 | 8% | 11 |
| evd.X1 0.01 | 9 | 7% | 10 |
| PSW.Relentless 0.1 | 7 | 6% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.3 | 135 / 210 | 2.23 | 19.6% | 31192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.6% | 135 |
| myl.nano.Graviton 1.10 | 2.5 | 11.8% | 25 |
| ntc.Opposite 1.5 | 3.5 | 11.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.4% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.0% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 6 |
| disan.Chair 2.2.0 | 6.8 | 8.4% | 8 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 9.5 | 5.6% | 4 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 25 / 35 | 4899 |
| 2 | 1 | 69.9 | 89.8 | 24 / 35 | 5399 |
| 3 | 1 | 67.9 | 84.1 | 16 / 35 | 4983 |
| 4 | 1 | 67.3 | 79.7 | 18 / 35 | 5036 |
| 5 | 1 | 69.8 | 88.3 | 24 / 35 | 5486 |
| 6 | 1 | 71.1 | 91.7 | 28 / 35 | 5389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 84% |
| stelo.AreaTargetingBot 1.1 | 31 | 87% |
| ntc.Opposite 1.5 | 26 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 82% |
| DBall.NUKE 0.1 | 17 | 94% |
| disan.Chair 2.2.0 | 14 | 79% |
| donjezza.Muncho 1.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 14 | 19% | 51 |
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 38 |
| ntc.Opposite 1.5 | 14 | 19% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 26 |
| pfvicm.Sobieski 7.2.3b | 8 | 11% | 19 |
| disan.Chair 2.2.0 | 5 | 7% | 17 |
| DBall.NUKE 0.1 | 3 | 4% | 12 |
| pbg.R2D2 1.0 | 3 | 4% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.2 | 95 / 210 | 3.23 | 16.7% | 28396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.7% | 95 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 45 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.2% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.4% | 22 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 68.3 | 12 / 35 | 4526 |
| 2 | 1 | 64.6 | 70.2 | 17 / 35 | 4530 |
| 3 | 1 | 62.9 | 68.3 | 11 / 35 | 4215 |
| 4 | 1 | 68.5 | 85.4 | 18 / 35 | 5100 |
| 5 | 1 | 67.6 | 78.7 | 20 / 35 | 5021 |
| 6 | 1 | 67.9 | 80.3 | 17 / 35 | 5004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 83% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 10 | 90% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 39% | 79 |
| yagami.Tidus 0.11 | 18 | 16% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 12% | 38 |
| kawigi.micro.Shiz 1.1 | 11 | 10% | 27 |
| ejb.Polaris 1.0.1 | 10 | 9% | 17 |
| stelo.MirrorNano 1.3 | 10 | 9% | 12 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.7 | 118 / 210 | 2.91 | 17.4% | 28472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.4% | 118 |
| bzdp.Pansy 2.1 | 2.0 | 12.9% | 30 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 13 |
| wee.Gem 1.8.4 | 4.0 | 11.8% | 28 |
| ratosh.Nobo 0.21 | 4.2 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.5 | 18 / 35 | 4677 |
| 2 | 1 | 65.4 | 74.6 | 20 / 35 | 4742 |
| 3 | 1 | 67.1 | 79.7 | 20 / 35 | 4981 |
| 4 | 1 | 66.8 | 81.6 | 21 / 35 | 4647 |
| 5 | 1 | 68.1 | 85.4 | 22 / 35 | 4665 |
| 6 | 1 | 64.7 | 74.6 | 17 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 78% |
| wee.Gem 1.8.4 | 32 | 88% |
| wompi.Quokka 1.6 | 24 | 88% |
| ratosh.Nobo 0.21 | 21 | 86% |
| m3thos.Eva00 1.1 | 7 | 86% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 21 | 22% | 56 |
| wee.Gem 1.8.4 | 13 | 14% | 46 |
| maribo.FollowFire 1 | 12 | 13% | 13 |
| ratosh.Nobo 0.21 | 11 | 12% | 28 |
| wompi.Quokka 1.6 | 9 | 10% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 9 |
| bayen.UbaMicro 1.4 | 7 | 7% | 15 |
| m3thos.Eva00 1.1 | 7 | 7% | 11 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 7 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 89.5 | 131 / 210 | 1.95 | 22.2% | 50302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.2% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 11 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.9% | 3 |
| ayk.WallHugger 1.0 | 5.2 | 9.3% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 1 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.6 | 92.7 | 24 / 35 | 8585 |
| 2 | 1 | 72.3 | 86.3 | 21 / 35 | 7779 |
| 3 | 1 | 73.5 | 90.2 | 18 / 35 | 8543 |
| 4 | 1 | 75.4 | 95.6 | 26 / 35 | 9337 |
| 5 | 1 | 72.5 | 86.0 | 22 / 35 | 7482 |
| 6 | 1 | 73.1 | 86.0 | 20 / 35 | 8576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 74% |
| exauge.GateKeeper 1.1.121g | 17 | 94% |
| mz.NanoGod 2.02 | 12 | 83% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 59% | 145 |
| mz.NanoGod 2.02 | 18 | 23% | 30 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 17 |
| ayk.WallHugger 1.0 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.4 | 117 / 210 | 3.21 | 17.3% | 29674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.3% | 117 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.7% | 21 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 15 |
| bvh.micro.Freya 0.3 | 3.8 | 11.6% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 11 |
| conscience.Electron 1.3g | 6.7 | 8.5% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 74.9 | 19 / 35 | 5249 |
| 2 | 1 | 65.3 | 74.6 | 19 / 35 | 4591 |
| 3 | 1 | 67.7 | 79.4 | 23 / 35 | 5433 |
| 4 | 1 | 64.4 | 71.7 | 19 / 35 | 4477 |
| 5 | 1 | 67.5 | 81.6 | 20 / 35 | 5008 |
| 6 | 1 | 64.6 | 70.2 | 17 / 35 | 4916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 85% |
| dummy.micro.Sparrow 2.5 | 26 | 88% |
| bvh.micro.Freya 0.3 | 23 | 74% |
| stelo.MirrorMicro 1.0 | 12 | 92% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 17% | 49 |
| dummy.micro.Sparrow 2.5 | 14 | 15% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 15% | 13 |
| bvh.micro.Freya 0.3 | 13 | 14% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 13% | 39 |
| conscience.Electron 1.3g | 9 | 10% | 15 |
| dl.BetterWalls 1.0 | 8 | 9% | 13 |
| stelo.MirrorMicro 1.0 | 7 | 8% | 18 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 81.6 | 131 / 210 | 2.65 | 20.5% | 42621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.5% | 131 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 25 |
| sul.Lunar 1.1 | 3.2 | 12.2% | 20 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 3 |
| dsw.StaticD 1.0 | 6.3 | 8.4% | 9 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.6% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.6% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.5% | 2 |
| sample.Corners 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 82.2 | 23 / 35 | 6926 |
| 2 | 1 | 70.1 | 80.6 | 17 / 35 | 7036 |
| 3 | 1 | 72.2 | 89.8 | 27 / 35 | 7106 |
| 4 | 1 | 69.4 | 76.5 | 23 / 35 | 6945 |
| 5 | 1 | 70.1 | 78.4 | 18 / 35 | 7424 |
| 6 | 1 | 70.9 | 82.2 | 23 / 35 | 7184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 96% |
| supersample.SuperBoxBot 1.0 | 34 | 79% |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 89% |
| dsw.StaticD 1.0 | 12 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 35% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 30% | 53 |
| mme.NikeEnhanced 2.0 | 10 | 13% | 17 |
| dsw.StaticD 1.0 | 7 | 9% | 21 |
| sample.Corners 1.0 | 4 | 5% | 4 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sul.Lunar 1.1 | 1 | 1% | 52 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 8 |

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 79.8 | 112 / 210 | 2.82 | 18.6% | 39047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.6% | 112 |
| mld.Wisdom 1.0 | 2.7 | 12.4% | 23 |
| radnor.DoctorBob 1.42 | 3.0 | 12.6% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.6% | 18 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 5 |
| amz.NanoClone 1.41 | 5.3 | 10.3% | 13 |
| sample.Walls 1.0 | 7.5 | 7.1% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.3% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 5 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.3 | 23 / 35 | 7589 |
| 2 | 1 | 66.7 | 79.4 | 17 / 35 | 5763 |
| 3 | 1 | 65.7 | 74.3 | 16 / 35 | 6009 |
| 4 | 1 | 68.3 | 80.6 | 20 / 35 | 6314 |
| 5 | 1 | 66.7 | 75.6 | 16 / 35 | 6324 |
| 6 | 1 | 69.1 | 80.6 | 20 / 35 | 7048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 87% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| mld.Wisdom 1.0 | 25 | 60% |
| KiraNL.Chupacabra 0.4 | 13 | 100% |
| amz.NanoClone 1.41 | 9 | 78% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 50% |

Hadur died in 98 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 35% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 51 |
| radnor.DoctorBob 1.42 | 16 | 16% | 42 |
| KiraNL.Chupacabra 0.4 | 14 | 14% | 25 |
| amz.NanoClone 1.41 | 7 | 7% | 18 |
| jangs.ns51 1.0 | 5 | 5% | 6 |
| sample.Walls 1.0 | 3 | 3% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |

