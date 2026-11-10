# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.0 | 150 / 210 | 1.99 | 21.7% | 44215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.7% | 150 |
| mz.AntiGrav 1.0 | 2.3 | 14.4% | 20 |
| radnor.DoctorBob 1.42 | 3.0 | 13.5% | 17 |
| mld.Infinity 2.2 | 3.7 | 12.4% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 2 |
| GarmBox.Oranges 1.0 | 6.2 | 7.4% | 0 |
| sample.Walls 1.0 | 7.0 | 6.8% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 1 |
| sample.Target 1.0 | 9.3 | 3.9% | 1 |
| arthord.MannyPacquiao Beta | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 85.4 | 24 / 35 | 7285 |
| 2 | 1 | 72.9 | 87.9 | 25 / 35 | 7679 |
| 3 | 1 | 72.3 | 91.1 | 27 / 35 | 6899 |
| 4 | 1 | 72.8 | 91.4 | 25 / 35 | 7373 |
| 5 | 1 | 73.0 | 88.9 | 26 / 35 | 7252 |
| 6 | 1 | 73.1 | 89.5 | 23 / 35 | 7727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 92% |
| mld.Infinity 2.2 | 40 | 90% |
| radnor.DoctorBob 1.42 | 27 | 93% |
| amz.NanoClone 1.41 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 18 | 30% | 74 |
| radnor.DoctorBob 1.42 | 17 | 28% | 51 |
| mld.Infinity 2.2 | 12 | 20% | 50 |
| amz.NanoClone 1.41 | 9 | 15% | 17 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.9 | 108 / 210 | 2.54 | 18.3% | 32092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.3% | 108 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.1% | 66 |
| mld.DustBunny 3.8 | 2.8 | 13.9% | 17 |
| maribo.melee.BMV 0.1 | 4.7 | 10.1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 5 |
| zyx.nano.Ant 1.1 | 5.7 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.7% | 7 |
| fullsail.SweetTea 1.1 | 8.0 | 6.7% | 2 |
| bzdp.BoxCar 2.0 | 8.7 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.9 | 14 / 35 | 4837 |
| 2 | 1 | 68.2 | 87.0 | 20 / 35 | 5232 |
| 3 | 1 | 68.1 | 86.7 | 17 / 35 | 5305 |
| 4 | 1 | 70.4 | 92.1 | 23 / 35 | 5594 |
| 5 | 1 | 68.2 | 83.8 | 20 / 35 | 5270 |
| 6 | 1 | 65.4 | 64.8 | 14 / 35 | 5854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 53 | 79% |
| oog.melee.Mercutio 1.0 | 52 | 62% |
| djdjdj.NanoSkunk10 1.0 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| maribo.melee.BMV 0.1 | 11 | 73% |
| fullsail.SweetTea 1.1 | 5 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 36% | 69 |
| mld.DustBunny 3.8 | 32 | 31% | 77 |
| djdjdj.NanoSkunk10 1.0 | 6 | 6% | 18 |
| fullsail.SweetTea 1.1 | 6 | 6% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 14 |
| maribo.melee.BMV 0.1 | 5 | 5% | 10 |
| zyx.nano.Ant 1.1 | 4 | 4% | 4 |
| bzdp.BoxCar 2.0 | 4 | 4% | 4 |
| cs.Grudge 1.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 81.9 | 134 / 210 | 2.63 | 20.0% | 38383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.0% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.2% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.8% | 14 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 9 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.2% | 2 |
| sample.Fire 1.0 | 9.5 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 78.7 | 20 / 35 | 6443 |
| 2 | 1 | 72.0 | 88.9 | 26 / 35 | 7021 |
| 3 | 1 | 69.2 | 78.1 | 20 / 35 | 6299 |
| 4 | 1 | 69.4 | 79.4 | 24 / 35 | 5975 |
| 5 | 1 | 70.0 | 82.5 | 22 / 35 | 6339 |
| 6 | 1 | 69.8 | 83.5 | 22 / 35 | 6306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 52 | 90% |
| myl.micro.Troodon 1.10 | 44 | 86% |
| cb.nano.Insomnia 1.0 | 19 | 89% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 22% | 56 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% | 50 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 18 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 32 |
| fm.mammillarias 1.3 | 7 | 9% | 13 |
| cs.sheldor.Talon 1.1 | 7 | 9% | 10 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 16 |
| sample.Fire 1.0 | 4 | 5% | 9 |
| sample.Tracker 1.0 | 3 | 4% | 5 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.8 | 157 / 210 | 2.19 | 20.8% | 39539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.8% | 157 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.8% | 18 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 10 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.3% | 7 |
| yk.JahMicro 1.0 | 7.5 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 5.9% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 88.6 | 29 / 35 | 6661 |
| 2 | 1 | 71.2 | 88.3 | 24 / 35 | 7152 |
| 3 | 1 | 70.2 | 84.8 | 23 / 35 | 6333 |
| 4 | 1 | 68.8 | 80.6 | 23 / 35 | 6090 |
| 5 | 1 | 72.0 | 91.4 | 31 / 35 | 6559 |
| 6 | 1 | 71.3 | 87.0 | 27 / 35 | 6744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 93% |
| stelo.SoJNanoMelee 1.1 | 47 | 98% |
| tvv.micro.Antares 1.1.1 | 15 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 85% |
| tj.zombie1n 1.0.1 | 12 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 57% | 105 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 18 |
| stelo.SoJNanoMelee 1.1 | 4 | 8% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 7 |
| repositorio.NanoStep 1.0 | 2 | 4% | 7 |
| tj.zombie1n 1.0.1 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| yk.JahMicro 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 65.0 | 88 / 210 | 4.15 | 15.3% | 28226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 15.3% | 88 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 33 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.4% | 25 |
| zyx.nano.BacillusComma 1.0 | 5.3 | 9.9% | 12 |
| EBBU.Sim2 1.02 | 5.8 | 9.9% | 5 |
| sam.Samspin 1.0 | 6.2 | 9.6% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 8.8% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 62.5 | 12 / 35 | 4935 |
| 2 | 1 | 62.3 | 65.1 | 15 / 35 | 4524 |
| 3 | 1 | 62.1 | 64.4 | 15 / 35 | 4414 |
| 4 | 1 | 60.7 | 59.0 | 15 / 35 | 4334 |
| 5 | 1 | 62.2 | 65.1 | 14 / 35 | 4717 |
| 6 | 1 | 65.7 | 73.7 | 17 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 90% |
| oog.melee.Corsair 1.0 | 28 | 75% |
| ahf.NanoAndrew .4 | 21 | 76% |
| sam.Samspin 1.0 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 352. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 18% | 49 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 39 |
| ahf.NanoAndrew .4 | 18 | 14% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 14% | 20 |
| sam.Samspin 1.0 | 12 | 10% | 14 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 14 |
| EBBU.Sim2 1.02 | 10 | 8% | 13 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.7 | 131 / 210 | 2.29 | 19.1% | 31677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.1% | 131 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 33 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.7% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.3% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.0% | 6 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.0% | 3 |
| fm.claire 1.7 | 6.5 | 8.0% | 1 |
| sample.SpinBot 1.0 | 8.0 | 6.9% | 1 |
| pa.Improved 1.0 | 9.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.9 | 22 / 35 | 5870 |
| 2 | 1 | 68.8 | 85.4 | 23 / 35 | 5363 |
| 3 | 1 | 68.2 | 84.8 | 21 / 35 | 5151 |
| 4 | 1 | 69.2 | 90.5 | 24 / 35 | 4958 |
| 5 | 1 | 67.2 | 79.7 | 20 / 35 | 5071 |
| 6 | 1 | 68.4 | 85.7 | 21 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 86% |
| oog.melee.CapuletDroid 1.1 | 30 | 93% |
| arthord.NanoSatanMelee Beta | 17 | 88% |
| gh.nano.Grofvuil 0.2 | 13 | 77% |
| sample.SpinBot 1.0 | 7 | 100% |
| fm.claire 1.7 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 41% | 86 |
| oog.melee.CapuletDroid 1.1 | 12 | 15% | 46 |
| gh.nano.Grofvuil 0.2 | 11 | 14% | 24 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 9 |
| kurios.DOSexe .9b | 3 | 4% | 10 |
| fm.claire 1.7 | 3 | 4% | 8 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.1 | 122 / 210 | 2.52 | 18.9% | 35079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.9% | 122 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 31 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.5% | 21 |
| mz.MicroGodMelee 1 | 3.8 | 12.9% | 24 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 0 |
| acogdev.alpha 0.2 | 8.2 | 5.9% | 2 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.6% | 2 |
| el.JumpShoot 0.2 | 8.5 | 6.0% | 4 |
| fire219.CatBot 1.0 | 8.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 75.9 | 16 / 35 | 5644 |
| 2 | 1 | 68.2 | 81.0 | 22 / 35 | 5698 |
| 3 | 1 | 70.2 | 86.7 | 22 / 35 | 6344 |
| 4 | 1 | 70.9 | 91.4 | 24 / 35 | 6101 |
| 5 | 1 | 68.6 | 81.9 | 21 / 35 | 5684 |
| 6 | 1 | 67.8 | 81.9 | 17 / 35 | 5608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 55 | 85% |
| mz.MicroGodMelee 1 | 42 | 74% |
| gh.micro.Gruweltje 0.7 | 32 | 66% |
| DBall.Anarchy 0.1 | 14 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 28 | 32% | 59 |
| gh.micro.Gruweltje 0.7 | 19 | 22% | 47 |
| spinnercat.micro.Tyger 0.1 | 16 | 18% | 52 |
| acogdev.alpha 0.2 | 7 | 8% | 9 |
| fire219.CatBot 1.0 | 6 | 7% | 6 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 10 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 17 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.6 | 110 / 210 | 3.55 | 16.7% | 30544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.3 | 16.7% | 110 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.2% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.9% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.7% | 9 |
| germ.TheMind .2 | 5.5 | 9.1% | 8 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.7% | 2 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.5% | 5 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.3 | 16 / 35 | 5080 |
| 2 | 1 | 66.0 | 71.1 | 22 / 35 | 5607 |
| 3 | 1 | 68.8 | 83.8 | 24 / 35 | 5548 |
| 4 | 1 | 64.6 | 68.3 | 18 / 35 | 4981 |
| 5 | 2 | 64.3 | 69.2 | 17 / 35 | 4687 |
| 6 | 2 | 62.0 | 64.1 | 13 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 93% |
| germ.TheMind .2 | 12 | 83% |
| qualidafial.MajorDick 1.0.1 | 11 | 91% |
| awesomeness.Elite 1.0 | 9 | 67% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 45% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 13% | 33 |
| germ.TheMind .2 | 12 | 12% | 21 |
| awesomeness.Elite 1.0 | 9 | 9% | 18 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.0 | 158 / 210 | 1.81 | 20.7% | 32149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.7% | 158 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.2% | 5 |
| maribo.IotaCT 1.1 | 4.0 | 9.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 2 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.1% | 7 |
| spinnercat.Omen 1.0 | 7.5 | 8.3% | 1 |
| stelo.PatternRobot 1.0 | 7.7 | 8.2% | 5 |
| ratosh.Wesco 1.4 | 8.0 | 8.2% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 28 / 35 | 5475 |
| 2 | 1 | 70.8 | 86.3 | 25 / 35 | 5402 |
| 3 | 1 | 70.1 | 89.5 | 25 / 35 | 5245 |
| 4 | 1 | 71.9 | 94.6 | 28 / 35 | 5424 |
| 5 | 1 | 70.9 | 87.3 | 26 / 35 | 5255 |
| 6 | 1 | 71.3 | 93.7 | 26 / 35 | 5348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 78 | 90% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| stelo.PatternRobot 1.0 | 21 | 90% |
| timmit.nano.TimDog 0.33 | 13 | 69% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 90% |
| ratosh.Wesco 1.4 | 9 | 78% |
| maribo.IotaCT 1.1 | 9 | 100% |
| spinnercat.Omen 1.0 | 8 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 35% | 83 |
| timmit.nano.TimDog 0.33 | 11 | 21% | 20 |
| ratosh.Wesco 1.4 | 7 | 13% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 9 |
| stelo.PatternRobot 1.0 | 4 | 8% | 20 |
| maribo.IotaCT 1.1 | 4 | 8% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 41 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.6 | 170 / 210 | 1.85 | 21.2% | 38352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.2% | 170 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.6% | 14 |
| baal.nano.N 1.42 | 3.7 | 10.7% | 5 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 5.3 | 9.0% | 4 |
| zyx.micro.Ant 1.1 | 5.5 | 9.5% | 10 |
| sanja.First 0.1 | 6.7 | 8.2% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.6% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.0 | 25 / 35 | 6171 |
| 2 | 1 | 70.8 | 89.5 | 27 / 35 | 6522 |
| 3 | 1 | 72.5 | 94.3 | 32 / 35 | 6771 |
| 4 | 1 | 70.1 | 87.6 | 29 / 35 | 5932 |
| 5 | 1 | 71.1 | 91.4 | 27 / 35 | 6560 |
| 6 | 1 | 71.8 | 94.6 | 30 / 35 | 6396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 97% |
| zyx.micro.Ant 1.1 | 29 | 83% |
| baal.nano.N 1.42 | 27 | 93% |
| cvt.Firsty 1.0 | 24 | 100% |
| sanja.First 0.1 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 35% | 41 |
| tvv.nano.Polaris 1.2 | 7 | 18% | 52 |
| baal.nano.N 1.42 | 6 | 15% | 33 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 16 |
| sample.RamFire 1.0 | 3 | 8% | 3 |
| sanja.First 0.1 | 2 | 5% | 20 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 12 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 11 |
| cvt.Firsty 1.0 | 1 | 3% | 18 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.1 | 86 / 210 | 3.70 | 15.8% | 31401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 15.8% | 86 |
| kc.micro.Figment 1.0 | 2.0 | 14.4% | 63 |
| cs.Wren 1.0 | 3.2 | 12.4% | 21 |
| mz.Cork 0.1 | 4.3 | 10.9% | 14 |
| js.PinBall 1.6 | 4.5 | 11.0% | 12 |
| joe.ADinosaur 1.0 | 5.8 | 9.7% | 5 |
| evd.X1 0.01 | 7.0 | 8.4% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 9.3 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.5 | 13 / 35 | 5386 |
| 2 | 2 | 61.7 | 63.2 | 14 / 35 | 4882 |
| 3 | 1 | 64.3 | 71.7 | 15 / 35 | 5442 |
| 4 | 1 | 63.9 | 68.9 | 14 / 35 | 5438 |
| 5 | 1 | 64.5 | 74.3 | 17 / 35 | 4855 |
| 6 | 1 | 62.6 | 65.7 | 13 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 65% |
| cs.Wren 1.0 | 35 | 86% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 8 | 63% |
| joe.ADinosaur 1.0 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 37% | 87 |
| cs.Wren 1.0 | 21 | 17% | 38 |
| evd.X1 0.01 | 14 | 11% | 16 |
| js.PinBall 1.6 | 11 | 9% | 17 |
| mz.Cork 0.1 | 9 | 7% | 21 |
| PSW.Relentless 0.1 | 8 | 6% | 11 |
| joe.ADinosaur 1.0 | 8 | 6% | 9 |
| jsal.Jsalbot 1.0 | 4 | 3% | 6 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.6 | 137 / 210 | 2.56 | 19.0% | 30659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.0% | 137 |
| myl.nano.Graviton 1.10 | 3.2 | 11.3% | 21 |
| ntc.Opposite 1.5 | 3.7 | 10.7% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.2% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.5% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.5% | 9 |
| DBall.NUKE 0.1 | 7.2 | 8.6% | 6 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.6 | 24 / 35 | 5318 |
| 2 | 1 | 66.7 | 76.8 | 22 / 35 | 4853 |
| 3 | 1 | 68.1 | 83.8 | 20 / 35 | 5035 |
| 4 | 1 | 68.4 | 83.8 | 24 / 35 | 5117 |
| 5 | 1 | 67.4 | 80.3 | 21 / 35 | 4924 |
| 6 | 1 | 70.4 | 89.5 | 26 / 35 | 5412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 90% |
| myl.nano.Graviton 1.10 | 31 | 97% |
| ntc.Opposite 1.5 | 18 | 72% |
| donjezza.Muncho 1.0 | 15 | 100% |
| DBall.NUKE 0.1 | 13 | 100% |
| disan.Chair 2.2.0 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 17 | 23% | 26 |
| myl.nano.Graviton 1.10 | 14 | 19% | 41 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 45 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 9% | 23 |
| disan.Chair 2.2.0 | 6 | 8% | 15 |
| DBall.NUKE 0.1 | 4 | 5% | 16 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 1 | 1% | 11 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.3 | 69 / 210 | 3.59 | 15.3% | 25475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.5 | 15.3% | 69 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 58 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.3% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 24 |
| yagami.Tidus 0.11 | 5.0 | 11.9% | 13 |
| ejb.Polaris 1.0.1 | 5.2 | 11.0% | 12 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 68.6 | 9 / 35 | 4028 |
| 2 | 2 | 62.4 | 67.0 | 9 / 35 | 4379 |
| 3 | 1 | 66.7 | 80.0 | 16 / 35 | 4337 |
| 4 | 2 | 60.9 | 64.1 | 10 / 35 | 3868 |
| 5 | 1 | 62.9 | 67.6 | 9 / 35 | 4399 |
| 6 | 1 | 66.6 | 80.3 | 16 / 35 | 4464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 47% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 67% |
| yagami.Tidus 0.11 | 11 | 82% |
| ejb.Polaris 1.0.1 | 5 | 60% |

Hadur died in 141 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 37% | 72 |
| yagami.Tidus 0.11 | 26 | 18% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 15% | 37 |
| ejb.Polaris 1.0.1 | 16 | 11% | 19 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 33 |
| stelo.MirrorNano 1.3 | 6 | 4% | 8 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.4 | 122 / 210 | 2.94 | 17.3% | 27853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.3% | 122 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 22 |
| wee.Gem 1.8.4 | 3.0 | 11.9% | 23 |
| ratosh.Nobo 0.21 | 4.0 | 11.2% | 13 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 17 |
| m3thos.Eva00 1.1 | 6.3 | 9.4% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 70.2 | 17 / 35 | 4353 |
| 2 | 1 | 65.5 | 75.9 | 17 / 35 | 4586 |
| 3 | 1 | 67.0 | 83.5 | 22 / 35 | 4755 |
| 4 | 1 | 64.8 | 74.9 | 19 / 35 | 4474 |
| 5 | 1 | 65.7 | 76.8 | 20 / 35 | 4496 |
| 6 | 1 | 69.5 | 89.2 | 27 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 93% |
| wee.Gem 1.8.4 | 33 | 91% |
| wompi.Quokka 1.6 | 19 | 79% |
| ratosh.Nobo 0.21 | 18 | 83% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 15 | 17% | 14 |
| bzdp.Pansy 2.1 | 13 | 15% | 51 |
| ratosh.Nobo 0.21 | 13 | 15% | 28 |
| wompi.Quokka 1.6 | 11 | 13% | 26 |
| wee.Gem 1.8.4 | 10 | 11% | 44 |
| m3thos.Eva00 1.1 | 7 | 8% | 14 |
| bayen.UbaMicro 1.4 | 7 | 8% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.4 | 126 / 210 | 2.13 | 21.1% | 45835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.1% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 58 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 16 |
| ayk.WallHugger 1.0 | 4.3 | 9.7% | 2 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 5 |
| stuff.Vlad 0.1 | 6.2 | 8.3% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.3% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 94.3 | 24 / 35 | 7806 |
| 2 | 1 | 69.9 | 79.0 | 20 / 35 | 7126 |
| 3 | 1 | 71.9 | 86.0 | 17 / 35 | 7825 |
| 4 | 1 | 71.5 | 87.0 | 20 / 35 | 7547 |
| 5 | 1 | 71.9 | 86.0 | 20 / 35 | 7481 |
| 6 | 1 | 73.8 | 92.1 | 25 / 35 | 8050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 106 | 80% |
| mz.NanoGod 2.02 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| ayk.WallHugger 1.0 | 9 | 100% |
| stelo.PianistNano 1.2 | 7 | 86% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 50% | 139 |
| mz.NanoGod 2.02 | 17 | 20% | 30 |
| exauge.GateKeeper 1.1.121g | 11 | 13% | 16 |
| ayk.WallHugger 1.0 | 7 | 8% | 13 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| stuff.Vlad 0.1 | 3 | 4% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.6 | 105 / 210 | 3.47 | 16.9% | 29846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.9% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 29 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.7% | 17 |
| bvh.micro.Freya 0.3 | 4.7 | 10.8% | 15 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 8 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 2 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 7 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 77.5 | 19 / 35 | 5397 |
| 2 | 1 | 62.5 | 64.8 | 16 / 35 | 4640 |
| 3 | 1 | 64.6 | 72.4 | 17 / 35 | 4862 |
| 4 | 1 | 65.8 | 74.3 | 19 / 35 | 5084 |
| 5 | 1 | 67.0 | 80.6 | 18 / 35 | 5078 |
| 6 | 1 | 63.7 | 66.0 | 16 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 82% |
| bvh.micro.Freya 0.3 | 25 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| dummy.micro.Sparrow 2.5 | 19 | 84% |
| stelo.MirrorMicro 1.0 | 9 | 89% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 20 | 19% | 44 |
| bvh.micro.Freya 0.3 | 17 | 16% | 28 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 46 |
| dl.BetterWalls 1.0 | 14 | 13% | 21 |
| conscience.Electron 1.3g | 14 | 13% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 9% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 7% | 29 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 13 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 83.7 | 143 / 210 | 2.47 | 20.8% | 42479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.8% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.8% | 12 |
| sul.Lunar 1.1 | 3.0 | 11.8% | 18 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 13 |
| dsw.StaticD 1.0 | 5.2 | 9.5% | 12 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.8% | 2 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.4% | 5 |
| sample.Corners 1.0 | 9.3 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.9 | 26 / 35 | 6848 |
| 2 | 1 | 72.0 | 86.0 | 26 / 35 | 7528 |
| 3 | 1 | 69.5 | 79.0 | 21 / 35 | 6607 |
| 4 | 1 | 70.8 | 83.5 | 23 / 35 | 7082 |
| 5 | 1 | 71.6 | 85.7 | 25 / 35 | 7364 |
| 6 | 1 | 70.0 | 79.0 | 22 / 35 | 7050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 98% |
| sul.Lunar 1.1 | 44 | 98% |
| supersample.SuperBoxBot 1.0 | 27 | 93% |
| dsw.StaticD 1.0 | 15 | 47% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 30% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 27% | 67 |
| dsw.StaticD 1.0 | 13 | 19% | 26 |
| sul.Lunar 1.1 | 6 | 9% | 47 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 2 |
| sample.Corners 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.9 | 101 / 210 | 2.81 | 18.3% | 37281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.3% | 101 |
| radnor.DoctorBob 1.42 | 2.2 | 13.2% | 33 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.0% | 26 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.9% | 7 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 12 |
| sample.Walls 1.0 | 7.3 | 7.5% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 4 |
| sample.Target 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 71.4 | 14 / 35 | 5742 |
| 2 | 1 | 68.3 | 80.0 | 17 / 35 | 6419 |
| 3 | 1 | 69.3 | 86.0 | 19 / 35 | 6498 |
| 4 | 1 | 68.5 | 81.9 | 17 / 35 | 6555 |
| 5 | 1 | 66.6 | 77.8 | 15 / 35 | 5913 |
| 6 | 1 | 68.3 | 82.2 | 19 / 35 | 6154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 82% |
| radnor.DoctorBob 1.42 | 34 | 59% |
| mld.Wisdom 1.0 | 20 | 65% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 57% |
| jangs.ns51 1.0 | 6 | 83% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 26% | 51 |
| mld.Wisdom 1.0 | 28 | 26% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 19% | 59 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 22 |
| amz.NanoClone 1.41 | 8 | 7% | 13 |
| sample.Walls 1.0 | 5 | 5% | 7 |
| GarmBox.Oranges 1.0 | 5 | 5% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 6 |

