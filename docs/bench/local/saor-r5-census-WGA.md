# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 89.8 | 149 / 210 | 1.92 | 22.2% | 47250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.2% | 149 |
| mz.AntiGrav 1.0 | 2.2 | 14.0% | 19 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 26 |
| mld.Infinity 2.2 | 4.0 | 12.2% | 9 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 5 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| sample.Walls 1.0 | 7.0 | 6.4% | 2 |
| jangs.ns51 1.0 | 7.3 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 91.4 | 26 / 35 | 8334 |
| 2 | 1 | 71.9 | 88.6 | 24 / 35 | 7150 |
| 3 | 1 | 71.4 | 83.5 | 22 / 35 | 7223 |
| 4 | 1 | 73.6 | 94.0 | 27 / 35 | 7431 |
| 5 | 1 | 73.0 | 89.8 | 23 / 35 | 8056 |
| 6 | 1 | 74.8 | 91.4 | 27 / 35 | 9056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 93% |
| radnor.DoctorBob 1.42 | 37 | 84% |
| mld.Infinity 2.2 | 36 | 89% |
| amz.NanoClone 1.41 | 6 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 32% | 58 |
| mz.AntiGrav 1.0 | 18 | 29% | 84 |
| mld.Infinity 2.2 | 10 | 16% | 40 |
| amz.NanoClone 1.41 | 6 | 10% | 13 |
| arthord.MannyPacquiao Beta | 3 | 5% | 3 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 3% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.2 | 126 / 210 | 2.51 | 18.7% | 33884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 18.7% | 126 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 46 |
| mld.DustBunny 3.8 | 2.7 | 14.4% | 23 |
| maribo.melee.BMV 0.1 | 4.7 | 10.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.0% | 5 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 2 |
| bzdp.BoxCar 2.0 | 7.7 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 7.7 | 6.5% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.5 | 21 / 35 | 5843 |
| 2 | 1 | 68.3 | 82.5 | 21 / 35 | 5569 |
| 3 | 2 | 64.8 | 71.4 | 18 / 35 | 4905 |
| 4 | 1 | 69.2 | 86.0 | 20 / 35 | 5717 |
| 5 | 1 | 69.5 | 85.7 | 22 / 35 | 5881 |
| 6 | 1 | 69.3 | 84.1 | 24 / 35 | 5969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 75 | 84% |
| oog.melee.Mercutio 1.0 | 51 | 73% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 84 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 28 | 33% | 81 |
| oog.melee.Mercutio 1.0 | 27 | 32% | 79 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| fullsail.SweetTea 1.1 | 6 | 7% | 6 |
| maribo.melee.BMV 0.1 | 5 | 6% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 7 |
| bzdp.BoxCar 2.0 | 3 | 4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.9 | 140 / 210 | 2.36 | 20.9% | 41312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.9% | 140 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 9.8% | 13 |
| fm.mammillarias 1.3 | 5.2 | 9.3% | 3 |
| cb.nano.Insomnia 1.0 | 5.5 | 8.9% | 9 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 0 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 84.1 | 24 / 35 | 6508 |
| 2 | 1 | 71.5 | 83.2 | 22 / 35 | 7467 |
| 3 | 1 | 70.7 | 82.5 | 20 / 35 | 7078 |
| 4 | 1 | 72.3 | 89.5 | 26 / 35 | 7063 |
| 5 | 1 | 72.8 | 92.4 | 28 / 35 | 6948 |
| 6 | 1 | 68.7 | 77.8 | 20 / 35 | 6248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 67 | 93% |
| myl.nano.KomoriNinja 1.1 | 28 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 76% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| fm.mammillarias 1.3 | 8 | 88% |
| sp.Nanos.Ember 1.1 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 29% | 36 |
| myl.micro.Troodon 1.10 | 14 | 20% | 75 |
| cb.nano.Insomnia 1.0 | 9 | 13% | 17 |
| fm.mammillarias 1.3 | 9 | 13% | 12 |
| myl.nano.KomoriNinja 1.1 | 7 | 10% | 43 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 12 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 82.6 | 135 / 210 | 2.56 | 20.2% | 41406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.2% | 135 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.4% | 23 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.5% | 16 |
| tj.zombie1n 1.0.1 | 5.2 | 9.1% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.7% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 9 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 81.6 | 22 / 35 | 6872 |
| 2 | 1 | 69.7 | 82.2 | 23 / 35 | 6743 |
| 3 | 1 | 71.2 | 87.6 | 24 / 35 | 6978 |
| 4 | 1 | 69.4 | 80.6 | 23 / 35 | 6744 |
| 5 | 1 | 69.3 | 80.0 | 24 / 35 | 6638 |
| 6 | 1 | 70.1 | 83.8 | 19 / 35 | 7431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 50 | 94% |
| stelo.SoJNanoMelee 1.1 | 29 | 86% |
| tvv.micro.Antares 1.1.1 | 23 | 70% |
| tj.zombie1n 1.0.1 | 18 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 71% |
| yk.JahMicro 1.0 | 6 | 83% |
| sample.VelociRobot 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 33% | 76 |
| tvv.micro.Antares 1.1.1 | 19 | 25% | 43 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 13% | 25 |
| stelo.SoJNanoMelee 1.1 | 8 | 11% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 9 |
| yk.JahMicro 1.0 | 3 | 4% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 9 |
| tj.zombie1n 1.0.1 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 67.1 | 74 / 210 | 3.96 | 16.1% | 32968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.1% | 74 |
| oog.melee.Corsair 1.0 | 2.0 | 13.4% | 52 |
| ahf.NanoAndrew .4 | 3.7 | 11.6% | 33 |
| sam.Samspin 1.0 | 4.5 | 10.2% | 16 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.6% | 24 |
| EBBU.Sim2 1.02 | 6.3 | 9.2% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.6% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 59.7 | 7 / 35 | 5632 |
| 2 | 1 | 64.2 | 68.6 | 13 / 35 | 5316 |
| 3 | 1 | 64.7 | 69.8 | 16 / 35 | 5371 |
| 4 | 1 | 64.1 | 67.9 | 13 / 35 | 5560 |
| 5 | 1 | 67.1 | 75.2 | 15 / 35 | 5940 |
| 6 | 1 | 61.8 | 61.3 | 10 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 49% |
| simonton.nano.MeleeSeed 1.8 | 26 | 88% |
| ahf.NanoAndrew .4 | 24 | 71% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| EBBU.Sim2 1.02 | 5 | 80% |
| sam.Samspin 1.0 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 26% | 52 |
| simonton.nano.MeleeSeed 1.8 | 23 | 17% | 37 |
| ahf.NanoAndrew .4 | 22 | 16% | 44 |
| robar.nano.Assertive_Melee 0.2 | 13 | 9% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 9% | 15 |
| zyx.nano.BacillusComma 1.0 | 11 | 8% | 14 |
| EBBU.Sim2 1.02 | 9 | 7% | 11 |
| sam.Samspin 1.0 | 6 | 4% | 11 |
| sample.TrackFire 1.0 | 5 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.7 | 128 / 210 | 2.29 | 19.6% | 35467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.6% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.3% | 9 |
| fm.claire 1.7 | 6.0 | 8.5% | 1 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.4% | 4 |
| sample.SpinBot 1.0 | 8.7 | 6.2% | 1 |
| pa.Improved 1.0 | 8.8 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 26 / 35 | 6123 |
| 2 | 1 | 69.6 | 82.9 | 20 / 35 | 6423 |
| 3 | 1 | 68.1 | 82.5 | 18 / 35 | 5897 |
| 4 | 1 | 69.4 | 87.3 | 22 / 35 | 5669 |
| 5 | 1 | 69.7 | 87.6 | 23 / 35 | 5859 |
| 6 | 1 | 68.6 | 82.9 | 19 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 84% |
| oog.melee.CapuletDroid 1.1 | 24 | 88% |
| gh.nano.Grofvuil 0.2 | 21 | 81% |
| arthord.NanoSatanMelee Beta | 10 | 80% |
| winamp32.micro.MicroMacro 1.0 | 9 | 67% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 36% | 89 |
| oog.melee.CapuletDroid 1.1 | 13 | 16% | 38 |
| gh.nano.Grofvuil 0.2 | 13 | 16% | 33 |
| winamp32.micro.MicroMacro 1.0 | 10 | 12% | 17 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 13 |
| fm.claire 1.7 | 3 | 4% | 6 |
| sample.SpinBot 1.0 | 3 | 4% | 6 |
| pa.Improved 1.0 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.5 | 110 / 210 | 2.40 | 19.0% | 35608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.0% | 110 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 25 |
| mz.MicroGodMelee 1 | 3.8 | 13.3% | 33 |
| DBall.Anarchy 0.1 | 5.5 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 5.5 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.2% | 1 |
| acogdev.alpha 0.2 | 8.3 | 5.8% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 79.0 | 17 / 35 | 6054 |
| 2 | 1 | 69.8 | 86.0 | 22 / 35 | 6023 |
| 3 | 1 | 68.0 | 84.1 | 15 / 35 | 5750 |
| 4 | 1 | 70.3 | 89.8 | 21 / 35 | 5910 |
| 5 | 1 | 69.0 | 82.5 | 17 / 35 | 6343 |
| 6 | 1 | 68.8 | 85.4 | 18 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 62 | 92% |
| gh.micro.Gruweltje 0.7 | 33 | 61% |
| mz.MicroGodMelee 1 | 32 | 63% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 33 | 33% | 60 |
| spinnercat.micro.Tyger 0.1 | 27 | 27% | 69 |
| mz.MicroGodMelee 1 | 27 | 27% | 52 |
| acogdev.alpha 0.2 | 7 | 7% | 8 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 7 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 73.3 | 108 / 210 | 3.40 | 17.1% | 31785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 17.1% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.0% | 37 |
| germ.TheMind .2 | 5.0 | 9.4% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.0% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 3 |
| awesomeness.Elite 1.0 | 6.8 | 8.1% | 9 |
| stelo.UntouchableNano 1.3 | 6.8 | 7.9% | 6 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 67.9 | 18 / 35 | 5025 |
| 2 | 1 | 65.7 | 71.1 | 18 / 35 | 5597 |
| 3 | 1 | 67.3 | 77.1 | 20 / 35 | 5768 |
| 4 | 1 | 67.8 | 79.0 | 24 / 35 | 5320 |
| 5 | 2 | 61.9 | 62.9 | 11 / 35 | 4745 |
| 6 | 1 | 67.6 | 81.6 | 17 / 35 | 5330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 64% |
| stelo.UntouchableNano 1.3 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| germ.TheMind .2 | 5 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 102 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 44% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 19% | 42 |
| germ.TheMind .2 | 11 | 11% | 17 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 17 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| awesomeness.Elite 1.0 | 3 | 3% | 9 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.1 | 148 / 210 | 2.07 | 20.3% | 33225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.3% | 148 |
| rz.HawkOnFire 0.1 | 2.3 | 14.0% | 24 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.4% | 12 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 9 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.7% | 2 |
| ratosh.Wesco 1.4 | 6.5 | 8.9% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 7.6% | 2 |
| stelo.PatternRobot 1.0 | 8.7 | 7.3% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 26 / 35 | 5314 |
| 2 | 1 | 71.6 | 88.9 | 26 / 35 | 5943 |
| 3 | 1 | 71.9 | 91.7 | 26 / 35 | 5970 |
| 4 | 1 | 70.4 | 87.0 | 25 / 35 | 5246 |
| 5 | 1 | 69.6 | 85.1 | 21 / 35 | 5432 |
| 6 | 1 | 69.5 | 83.8 | 24 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 86% |
| nz.jdc.nano.GridFu 1.0 | 39 | 95% |
| maribo.IotaCT 1.1 | 14 | 93% |
| ratosh.Wesco 1.4 | 12 | 92% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 27 | 44% | 85 |
| timmit.nano.TimDog 0.33 | 10 | 16% | 21 |
| nz.jdc.nano.GridFu 1.0 | 8 | 13% | 47 |
| ratosh.Wesco 1.4 | 6 | 10% | 22 |
| maribo.IotaCT 1.1 | 5 | 8% | 16 |
| stelo.PatternRobot 1.0 | 4 | 6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.0 | 157 / 210 | 2.08 | 21.0% | 40086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.0% | 157 |
| baal.nano.N 1.42 | 2.5 | 12.2% | 16 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 12 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 12 |
| Grystrion.TrackerWO 1.0 | 5.5 | 9.2% | 4 |
| sanja.First 0.1 | 5.5 | 9.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.0% | 4 |
| sample.RamFire 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.1 | 27 / 35 | 6964 |
| 2 | 1 | 70.7 | 84.4 | 25 / 35 | 7041 |
| 3 | 1 | 71.5 | 90.5 | 28 / 35 | 6557 |
| 4 | 1 | 70.3 | 86.0 | 24 / 35 | 6429 |
| 5 | 1 | 72.0 | 91.7 | 29 / 35 | 6786 |
| 6 | 1 | 69.8 | 84.4 | 24 / 35 | 6309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 50 | 88% |
| tvv.nano.Polaris 1.2 | 36 | 92% |
| sanja.First 0.1 | 24 | 100% |
| cvt.Firsty 1.0 | 20 | 85% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| amk.Punbot.Punbot 0.01 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 21% | 37 |
| baal.nano.N 1.42 | 10 | 19% | 43 |
| tvv.nano.Polaris 1.2 | 7 | 13% | 51 |
| sanja.First 0.1 | 6 | 11% | 31 |
| cvt.Firsty 1.0 | 5 | 9% | 18 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 11 |
| sample.RamFire 1.0 | 5 | 9% | 5 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.1 | 80 / 210 | 3.69 | 16.0% | 33297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.0% | 80 |
| kc.micro.Figment 1.0 | 2.3 | 14.5% | 59 |
| cs.Wren 1.0 | 2.8 | 12.8% | 34 |
| js.PinBall 1.6 | 4.2 | 11.1% | 13 |
| mz.Cork 0.1 | 4.7 | 10.9% | 9 |
| joe.ADinosaur 1.0 | 6.3 | 8.9% | 4 |
| evd.X1 0.01 | 7.0 | 8.0% | 1 |
| jsal.Jsalbot 1.0 | 7.7 | 7.2% | 7 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 67.6 | 10 / 35 | 5970 |
| 2 | 1 | 67.2 | 80.6 | 15 / 35 | 5843 |
| 3 | 1 | 63.5 | 67.6 | 15 / 35 | 5377 |
| 4 | 1 | 64.5 | 72.1 | 16 / 35 | 5283 |
| 5 | 1 | 60.2 | 60.3 | 9 / 35 | 5197 |
| 6 | 1 | 65.1 | 72.4 | 15 / 35 | 5627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 62% |
| cs.Wren 1.0 | 22 | 77% |
| js.PinBall 1.6 | 9 | 78% |
| mz.Cork 0.1 | 7 | 71% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| evd.X1 0.01 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 62 | 47% | 108 |
| evd.X1 0.01 | 20 | 15% | 21 |
| cs.Wren 1.0 | 14 | 11% | 22 |
| js.PinBall 1.6 | 12 | 9% | 19 |
| joe.ADinosaur 1.0 | 10 | 8% | 10 |
| mz.Cork 0.1 | 8 | 6% | 14 |
| PSW.Relentless 0.1 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.0 | 123 / 210 | 2.62 | 18.9% | 30372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.9% | 123 |
| ntc.Opposite 1.5 | 2.5 | 11.7% | 10 |
| myl.nano.Graviton 1.10 | 3.8 | 10.8% | 17 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.9% | 11 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 12 |
| DBall.NUKE 0.1 | 8.3 | 7.4% | 3 |
| pbg.R2D2 1.0 | 9.0 | 5.9% | 3 |
| donjezza.Muncho 1.0 | 9.5 | 5.4% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 71.7 | 14 / 35 | 4791 |
| 2 | 1 | 69.3 | 86.7 | 19 / 35 | 5426 |
| 3 | 1 | 69.8 | 85.4 | 25 / 35 | 5313 |
| 4 | 1 | 66.9 | 80.3 | 19 / 35 | 4566 |
| 5 | 1 | 70.4 | 87.9 | 24 / 35 | 5427 |
| 6 | 1 | 67.6 | 79.7 | 22 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 85% |
| myl.nano.Graviton 1.10 | 30 | 93% |
| ntc.Opposite 1.5 | 20 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 87% |
| disan.Chair 2.2.0 | 13 | 62% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| DBall.NUKE 0.1 | 8 | 88% |
| donjezza.Muncho 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 22% | 48 |
| ntc.Opposite 1.5 | 15 | 17% | 29 |
| stelo.AreaTargetingBot 1.1 | 14 | 16% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 14% | 28 |
| disan.Chair 2.2.0 | 11 | 13% | 17 |
| pfvicm.Sobieski 7.2.3b | 10 | 11% | 18 |
| pbg.R2D2 1.0 | 3 | 3% | 13 |
| DBall.NUKE 0.1 | 3 | 3% | 13 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 77.3 | 94 / 210 | 3.04 | 17.0% | 27833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.0% | 94 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.6% | 31 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.8% | 26 |
| yagami.Tidus 0.11 | 4.0 | 12.5% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.1% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 68.3 | 14 / 35 | 4321 |
| 2 | 1 | 67.6 | 81.9 | 17 / 35 | 4803 |
| 3 | 1 | 65.8 | 74.6 | 15 / 35 | 4524 |
| 4 | 1 | 68.4 | 82.9 | 20 / 35 | 4744 |
| 5 | 1 | 65.6 | 73.3 | 12 / 35 | 4720 |
| 6 | 1 | 68.0 | 82.9 | 16 / 35 | 4721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 32 | 94% |
| oog.melee.Capulet 1.2 | 32 | 66% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 69% |
| yagami.Tidus 0.11 | 21 | 90% |
| ejb.Polaris 1.0.1 | 6 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 33% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 21% | 42 |
| yagami.Tidus 0.11 | 17 | 15% | 37 |
| kawigi.micro.Shiz 1.1 | 15 | 13% | 40 |
| ejb.Polaris 1.0.1 | 10 | 9% | 19 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.4 | 131 / 210 | 3.04 | 17.4% | 27680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.4% | 131 |
| bzdp.Pansy 2.1 | 2.0 | 13.0% | 27 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 16 |
| wee.Gem 1.8.4 | 4.2 | 11.2% | 15 |
| ratosh.Nobo 0.21 | 4.2 | 11.4% | 10 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 4 |
| bayen.UbaMicro 1.4 | 6.5 | 8.9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.6 | 18 / 35 | 4243 |
| 2 | 1 | 66.8 | 78.4 | 22 / 35 | 5170 |
| 3 | 1 | 64.6 | 73.3 | 20 / 35 | 4134 |
| 4 | 1 | 65.5 | 75.2 | 21 / 35 | 4520 |
| 5 | 1 | 68.6 | 86.7 | 26 / 35 | 4864 |
| 6 | 1 | 67.6 | 81.9 | 24 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 96% |
| wee.Gem 1.8.4 | 31 | 97% |
| m3thos.Eva00 1.1 | 15 | 93% |
| wompi.Quokka 1.6 | 15 | 93% |
| ratosh.Nobo 0.21 | 15 | 87% |
| bayen.UbaMicro 1.4 | 10 | 70% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 340. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 15 | 19% | 52 |
| maribo.FollowFire 1 | 14 | 18% | 15 |
| bzdp.Pansy 2.1 | 9 | 11% | 59 |
| ratosh.Nobo 0.21 | 9 | 11% | 24 |
| wompi.Quokka 1.6 | 9 | 11% | 14 |
| bayen.UbaMicro 1.4 | 8 | 10% | 14 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 5 |
| m3thos.Eva00 1.1 | 3 | 4% | 14 |

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 88.0 | 136 / 210 | 2.08 | 22.2% | 51508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.2% | 136 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 52 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 15 |
| exauge.GateKeeper 1.1.121g | 4.0 | 10.1% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 0 |
| ayk.WallHugger 1.0 | 5.5 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 86.3 | 23 / 35 | 8514 |
| 2 | 1 | 72.5 | 84.8 | 20 / 35 | 8213 |
| 3 | 1 | 73.4 | 86.7 | 26 / 35 | 8364 |
| 4 | 1 | 73.4 | 86.7 | 20 / 35 | 8642 |
| 5 | 1 | 74.6 | 91.7 | 24 / 35 | 9189 |
| 6 | 1 | 74.0 | 92.1 | 23 / 35 | 8586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 82% |
| exauge.GateKeeper 1.1.121g | 20 | 90% |
| mz.NanoGod 2.02 | 10 | 70% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 43% | 139 |
| mz.NanoGod 2.02 | 27 | 36% | 39 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 14 |
| ayk.WallHugger 1.0 | 3 | 4% | 7 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.0 | 85 / 210 | 4.15 | 15.0% | 27101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.3 | 15.0% | 85 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 30 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.6% | 26 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.4% | 19 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.8% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.5% | 6 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.2 | 19 / 35 | 4673 |
| 2 | 1 | 64.1 | 71.1 | 17 / 35 | 4481 |
| 3 | 1 | 61.4 | 61.3 | 17 / 35 | 4560 |
| 4 | 1 | 60.3 | 62.2 | 13 / 35 | 4125 |
| 5 | 1 | 64.2 | 71.7 | 13 / 35 | 4848 |
| 6 | 3 | 56.4 | 48.6 | 6 / 35 | 4414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 81% |
| dummy.micro.Sparrow 2.5 | 25 | 84% |
| bvh.micro.Freya 0.3 | 22 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 62% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 25% | 58 |
| conscience.Electron 1.3g | 19 | 15% | 20 |
| dummy.micro.Sparrow 2.5 | 17 | 14% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 14% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 13% | 29 |
| bvh.micro.Freya 0.3 | 9 | 7% | 25 |
| dl.BetterWalls 1.0 | 9 | 7% | 12 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 14 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 81.6 | 143 / 210 | 2.65 | 20.8% | 43350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.8% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 26 |
| sul.Lunar 1.1 | 3.0 | 11.7% | 16 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 9 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 8 |
| dsw.StaticD 1.0 | 5.7 | 9.0% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.4% | 3 |
| sample.Corners 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 83.8 | 26 / 35 | 7381 |
| 2 | 1 | 71.7 | 83.5 | 24 / 35 | 7486 |
| 3 | 1 | 66.2 | 67.3 | 17 / 35 | 6081 |
| 4 | 1 | 71.9 | 83.8 | 24 / 35 | 7658 |
| 5 | 1 | 71.1 | 82.9 | 25 / 35 | 7010 |
| 6 | 1 | 73.0 | 88.6 | 27 / 35 | 7734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 90% |
| sul.Lunar 1.1 | 45 | 96% |
| supersample.SuperBoxBot 1.0 | 24 | 88% |
| dsw.StaticD 1.0 | 14 | 79% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 31% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 21% | 66 |
| mme.NikeEnhanced 2.0 | 8 | 12% | 19 |
| dsw.StaticD 1.0 | 7 | 10% | 18 |
| sul.Lunar 1.1 | 6 | 9% | 46 |
| sample.Corners 1.0 | 5 | 7% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 78.4 | 109 / 210 | 2.95 | 18.5% | 39782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.5% | 109 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 23 |
| mld.Wisdom 1.0 | 2.8 | 12.3% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.8% | 24 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 9 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.3% | 11 |
| GarmBox.Oranges 1.0 | 7.3 | 7.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.4% | 9 |
| jangs.ns51 1.0 | 9.2 | 5.8% | 3 |
| sample.Target 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 81.6 | 16 / 35 | 6929 |
| 2 | 1 | 67.7 | 75.9 | 18 / 35 | 6672 |
| 3 | 1 | 65.1 | 71.7 | 16 / 35 | 5895 |
| 4 | 1 | 67.2 | 74.6 | 19 / 35 | 6395 |
| 5 | 1 | 70.0 | 84.8 | 20 / 35 | 7295 |
| 6 | 1 | 68.7 | 81.6 | 20 / 35 | 6596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 90% |
| radnor.DoctorBob 1.42 | 27 | 85% |
| mld.Wisdom 1.0 | 20 | 80% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| amz.NanoClone 1.41 | 8 | 63% |
| sample.Walls 1.0 | 8 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 31% | 49 |
| radnor.DoctorBob 1.42 | 24 | 23% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 47 |
| amz.NanoClone 1.41 | 11 | 11% | 18 |
| KiraNL.Chupacabra 0.4 | 9 | 9% | 19 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 3 | 3% | 8 |

