# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 87.5 | 143 / 210 | 2.12 | 21.4% | 44306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.4% | 143 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 29 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 16 |
| mld.Infinity 2.2 | 4.0 | 12.2% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 9 |
| sample.Walls 1.0 | 6.7 | 6.6% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 89.5 | 23 / 35 | 7818 |
| 2 | 1 | 72.9 | 87.6 | 25 / 35 | 7880 |
| 3 | 1 | 70.7 | 84.1 | 23 / 35 | 6518 |
| 4 | 1 | 72.8 | 88.3 | 26 / 35 | 7517 |
| 5 | 1 | 71.9 | 86.0 | 22 / 35 | 7189 |
| 6 | 1 | 72.6 | 89.5 | 24 / 35 | 7384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 93% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| mld.Infinity 2.2 | 34 | 100% |
| amz.NanoClone 1.41 | 11 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 46% | 69 |
| mz.AntiGrav 1.0 | 15 | 22% | 67 |
| amz.NanoClone 1.41 | 6 | 9% | 16 |
| GarmBox.Oranges 1.0 | 5 | 7% | 7 |
| mld.Infinity 2.2 | 4 | 6% | 34 |
| sample.Walls 1.0 | 4 | 6% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.8 | 124 / 210 | 2.46 | 18.9% | 34052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.3 | 18.9% | 124 |
| mld.DustBunny 3.8 | 2.3 | 14.1% | 18 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 49 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.1% | 7 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.4% | 6 |
| fullsail.SweetTea 1.1 | 7.3 | 7.7% | 3 |
| bzdp.BoxCar 2.0 | 8.0 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 28 / 35 | 5612 |
| 2 | 3 | 60.7 | 57.1 | 8 / 35 | 4978 |
| 3 | 1 | 66.6 | 78.4 | 15 / 35 | 5504 |
| 4 | 1 | 69.6 | 87.9 | 22 / 35 | 5768 |
| 5 | 1 | 71.7 | 94.9 | 27 / 35 | 6227 |
| 6 | 1 | 71.1 | 93.0 | 24 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 63 | 87% |
| oog.melee.Mercutio 1.0 | 55 | 78% |
| maribo.melee.BMV 0.1 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 34% | 73 |
| mld.DustBunny 3.8 | 23 | 26% | 80 |
| fullsail.SweetTea 1.1 | 11 | 13% | 10 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| zyx.nano.Ant 1.1 | 5 | 6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 12 |
| maribo.melee.BMV 0.1 | 3 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.7 | 131 / 210 | 2.47 | 20.0% | 37798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.0% | 131 |
| myl.micro.Troodon 1.10 | 2.0 | 15.2% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.1% | 10 |
| fm.mammillarias 1.3 | 5.2 | 9.6% | 2 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.3% | 6 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 6 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 79.4 | 22 / 35 | 6301 |
| 2 | 1 | 70.3 | 79.7 | 22 / 35 | 6547 |
| 3 | 1 | 70.2 | 85.4 | 21 / 35 | 6156 |
| 4 | 1 | 70.2 | 87.3 | 22 / 35 | 6185 |
| 5 | 1 | 71.3 | 86.7 | 23 / 35 | 6651 |
| 6 | 1 | 69.5 | 83.8 | 21 / 35 | 5958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 92% |
| myl.nano.KomoriNinja 1.1 | 21 | 95% |
| cb.nano.Insomnia 1.0 | 18 | 94% |
| fm.mammillarias 1.3 | 11 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 80% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 29% | 74 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 18 |
| myl.nano.KomoriNinja 1.1 | 12 | 15% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 14% | 28 |
| fm.mammillarias 1.3 | 11 | 14% | 17 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 15 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 9 |
| sample.Fire 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.1 | 141 / 210 | 2.43 | 20.3% | 40033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.3% | 141 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 12 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 17 |
| tj.zombie1n 1.0.1 | 4.3 | 9.9% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.3% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.2% | 0 |
| yk.JahMicro 1.0 | 6.7 | 8.0% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 79.0 | 21 / 35 | 6464 |
| 2 | 1 | 71.8 | 89.2 | 28 / 35 | 6910 |
| 3 | 1 | 71.0 | 87.0 | 24 / 35 | 7101 |
| 4 | 1 | 69.8 | 82.2 | 23 / 35 | 6766 |
| 5 | 1 | 71.4 | 90.5 | 24 / 35 | 7035 |
| 6 | 1 | 67.8 | 76.8 | 21 / 35 | 5757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 92% |
| stelo.SoJNanoMelee 1.1 | 34 | 91% |
| tj.zombie1n 1.0.1 | 20 | 80% |
| tvv.micro.Antares 1.1.1 | 19 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 32% | 86 |
| stelo.SoJNanoMelee 1.1 | 12 | 17% | 30 |
| tj.zombie1n 1.0.1 | 12 | 17% | 17 |
| tvv.micro.Antares 1.1.1 | 9 | 13% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 15 |
| yk.JahMicro 1.0 | 3 | 4% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.5 | 90 / 210 | 3.83 | 16.1% | 30574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.1% | 90 |
| oog.melee.Corsair 1.0 | 2.2 | 12.3% | 32 |
| ahf.NanoAndrew .4 | 3.3 | 11.9% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 16 |
| sam.Samspin 1.0 | 5.2 | 10.0% | 17 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.5% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.4% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 60.3 | 11 / 35 | 4771 |
| 2 | 1 | 67.0 | 75.9 | 20 / 35 | 5645 |
| 3 | 1 | 63.2 | 68.3 | 15 / 35 | 4701 |
| 4 | 1 | 63.6 | 67.3 | 16 / 35 | 4937 |
| 5 | 1 | 63.0 | 65.7 | 13 / 35 | 4910 |
| 6 | 1 | 66.0 | 73.7 | 15 / 35 | 5610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 94% |
| ahf.NanoAndrew .4 | 24 | 75% |
| oog.melee.Corsair 1.0 | 18 | 44% |
| sam.Samspin 1.0 | 13 | 85% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| sample.TrackFire 1.0 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 23 | 19% | 40 |
| oog.melee.Corsair 1.0 | 22 | 18% | 36 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 25 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 42 |
| EBBU.Sim2 1.02 | 12 | 10% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 10 |
| sam.Samspin 1.0 | 9 | 7% | 19 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.6 | 123 / 210 | 2.20 | 19.1% | 32175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.1% | 123 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.6% | 6 |
| fm.claire 1.7 | 6.7 | 8.2% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.0% | 4 |
| sample.SpinBot 1.0 | 7.2 | 7.5% | 4 |
| pa.Improved 1.0 | 8.8 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 20 / 35 | 5640 |
| 2 | 1 | 69.4 | 87.3 | 23 / 35 | 5238 |
| 3 | 1 | 67.0 | 81.3 | 16 / 35 | 5175 |
| 4 | 1 | 68.2 | 86.7 | 19 / 35 | 5074 |
| 5 | 1 | 68.2 | 84.1 | 21 / 35 | 5561 |
| 6 | 1 | 70.1 | 91.7 | 24 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 80% |
| oog.melee.CapuletDroid 1.1 | 20 | 95% |
| gh.nano.Grofvuil 0.2 | 13 | 85% |
| arthord.NanoSatanMelee Beta | 11 | 82% |
| fm.claire 1.7 | 10 | 80% |
| kurios.DOSexe .9b | 5 | 20% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| sample.SpinBot 1.0 | 4 | 75% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 38% | 98 |
| oog.melee.CapuletDroid 1.1 | 12 | 14% | 35 |
| gh.nano.Grofvuil 0.2 | 10 | 11% | 23 |
| kurios.DOSexe .9b | 7 | 8% | 12 |
| winamp32.micro.MicroMacro 1.0 | 7 | 8% | 11 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 9 |
| fm.claire 1.7 | 6 | 7% | 9 |
| sample.SpinBot 1.0 | 5 | 6% | 9 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.6 | 111 / 210 | 2.66 | 18.6% | 36342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.6% | 111 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 36 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.3% | 21 |
| DBall.Anarchy 0.1 | 5.7 | 8.1% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 4 |
| el.JumpShoot 0.2 | 7.0 | 6.7% | 2 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.8% | 1 |
| mbro.Detektor3 0.1.1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.5 | 18 / 35 | 6362 |
| 2 | 1 | 67.7 | 80.6 | 15 / 35 | 5894 |
| 3 | 1 | 66.3 | 73.3 | 19 / 35 | 5371 |
| 4 | 1 | 68.8 | 84.1 | 20 / 35 | 5943 |
| 5 | 1 | 69.9 | 86.3 | 22 / 35 | 6419 |
| 6 | 1 | 68.9 | 82.5 | 17 / 35 | 6353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 84% |
| mz.MicroGodMelee 1 | 42 | 67% |
| gh.micro.Gruweltje 0.7 | 40 | 73% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 28 | 28% | 61 |
| mz.MicroGodMelee 1 | 28 | 28% | 58 |
| spinnercat.micro.Tyger 0.1 | 21 | 21% | 63 |
| acogdev.alpha 0.2 | 8 | 8% | 9 |
| DBall.Anarchy 0.1 | 5 | 5% | 9 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 75.4 | 111 / 210 | 3.21 | 17.6% | 32814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 17.6% | 111 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.1% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.4% | 27 |
| germ.TheMind .2 | 4.3 | 9.6% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.3% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.7% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.0% | 4 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.6% | 4 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 65.7 | 19 / 35 | 5061 |
| 2 | 1 | 69.5 | 82.9 | 22 / 35 | 6170 |
| 3 | 1 | 65.8 | 71.4 | 16 / 35 | 5497 |
| 4 | 1 | 66.5 | 79.0 | 18 / 35 | 5172 |
| 5 | 1 | 64.5 | 69.5 | 15 / 35 | 5012 |
| 6 | 1 | 69.0 | 83.8 | 21 / 35 | 5902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 80% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 67% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 45% | 109 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 20% | 36 |
| germ.TheMind .2 | 9 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 15 |
| awesomeness.Elite 1.0 | 4 | 4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.3 | 157 / 210 | 1.87 | 20.8% | 34209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.8% | 157 |
| rz.HawkOnFire 0.1 | 2.0 | 14.2% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.6% | 7 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 5 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.9% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 8.9% | 1 |
| stelo.PatternRobot 1.0 | 7.3 | 7.9% | 5 |
| ratosh.Wesco 1.4 | 7.3 | 8.0% | 3 |
| spinnercat.Omen 1.0 | 8.8 | 7.2% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 25 / 35 | 5756 |
| 2 | 1 | 71.7 | 92.1 | 30 / 35 | 5388 |
| 3 | 1 | 70.7 | 89.2 | 26 / 35 | 5576 |
| 4 | 1 | 71.2 | 90.5 | 26 / 35 | 5901 |
| 5 | 1 | 71.5 | 89.8 | 23 / 35 | 5851 |
| 6 | 1 | 71.4 | 89.2 | 27 / 35 | 5737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 95 | 94% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| stelo.PatternRobot 1.0 | 12 | 100% |
| maribo.IotaCT 1.1 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 26% | 78 |
| nz.jdc.nano.GridFu 1.0 | 9 | 17% | 44 |
| timmit.nano.TimDog 0.33 | 9 | 17% | 21 |
| stelo.PatternRobot 1.0 | 9 | 17% | 21 |
| maribo.IotaCT 1.1 | 4 | 8% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 6 |
| spinnercat.Omen 1.0 | 3 | 6% | 11 |
| ratosh.Wesco 1.4 | 1 | 2% | 11 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.5 | 160 / 210 | 1.94 | 21.4% | 41096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.4% | 160 |
| baal.nano.N 1.42 | 2.3 | 12.3% | 11 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.8% | 20 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.5% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 7.7% | 1 |
| sanja.First 0.1 | 6.8 | 7.9% | 5 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 1 |
| cvt.Firsty 1.0 | 8.2 | 6.9% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.0 | 25 / 35 | 6295 |
| 2 | 1 | 72.4 | 91.1 | 28 / 35 | 7459 |
| 3 | 1 | 72.2 | 92.4 | 28 / 35 | 7023 |
| 4 | 1 | 72.9 | 94.9 | 29 / 35 | 7260 |
| 5 | 1 | 69.2 | 81.0 | 22 / 35 | 6664 |
| 6 | 1 | 71.4 | 90.8 | 28 / 35 | 6395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 48 | 83% |
| tvv.nano.Polaris 1.2 | 33 | 88% |
| sanja.First 0.1 | 21 | 100% |
| cvt.Firsty 1.0 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| zyx.micro.Ant 1.1 | 18 | 83% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 14 | 28% | 54 |
| zyx.micro.Ant 1.1 | 10 | 20% | 37 |
| tvv.nano.Polaris 1.2 | 7 | 14% | 50 |
| Grystrion.TrackerWO 1.0 | 7 | 14% | 20 |
| sample.RamFire 1.0 | 4 | 8% | 4 |
| cvt.Firsty 1.0 | 3 | 6% | 20 |
| sanja.First 0.1 | 2 | 4% | 14 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.4 | 95 / 210 | 3.57 | 16.4% | 32882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.4% | 95 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 60 |
| cs.Wren 1.0 | 3.7 | 12.0% | 19 |
| js.PinBall 1.6 | 3.8 | 11.4% | 15 |
| mz.Cork 0.1 | 4.5 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 2 |
| evd.X1 0.01 | 7.2 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.5 | 5.4% | 3 |
| PSW.Relentless 0.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.9 | 19 / 35 | 5301 |
| 2 | 1 | 62.6 | 64.1 | 14 / 35 | 5291 |
| 3 | 1 | 66.0 | 73.0 | 20 / 35 | 5547 |
| 4 | 2 | 60.6 | 59.0 | 13 / 35 | 4887 |
| 5 | 1 | 66.3 | 77.8 | 15 / 35 | 5768 |
| 6 | 1 | 67.1 | 79.7 | 14 / 35 | 6088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 74% |
| cs.Wren 1.0 | 24 | 83% |
| js.PinBall 1.6 | 11 | 64% |
| mz.Cork 0.1 | 8 | 88% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 43% | 107 |
| cs.Wren 1.0 | 15 | 13% | 32 |
| evd.X1 0.01 | 14 | 12% | 14 |
| joe.ADinosaur 1.0 | 10 | 9% | 10 |
| js.PinBall 1.6 | 9 | 8% | 14 |
| PSW.Relentless 0.1 | 8 | 7% | 8 |
| mz.Cork 0.1 | 5 | 4% | 12 |
| jsal.Jsalbot 1.0 | 3 | 3% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.6 | 136 / 210 | 2.39 | 19.4% | 31008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.4% | 136 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 19 |
| ntc.Opposite 1.5 | 3.7 | 11.0% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.3% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 3 |
| disan.Chair 2.2.0 | 6.8 | 8.8% | 11 |
| DBall.NUKE 0.1 | 7.5 | 7.6% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 5.6% | 5 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 77.8 | 20 / 35 | 5174 |
| 2 | 1 | 70.0 | 88.9 | 25 / 35 | 5271 |
| 3 | 1 | 69.4 | 86.7 | 22 / 35 | 5158 |
| 4 | 1 | 68.5 | 83.5 | 25 / 35 | 4833 |
| 5 | 1 | 69.4 | 86.3 | 23 / 35 | 5334 |
| 6 | 1 | 68.9 | 84.1 | 21 / 35 | 5238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 44 | 91% |
| stelo.AreaTargetingBot 1.1 | 27 | 100% |
| ntc.Opposite 1.5 | 19 | 79% |
| disan.Chair 2.2.0 | 18 | 72% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 81% |
| donjezza.Muncho 1.0 | 12 | 100% |
| DBall.NUKE 0.1 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 22% | 50 |
| ntc.Opposite 1.5 | 14 | 18% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 34 |
| pfvicm.Sobieski 7.2.3b | 11 | 14% | 14 |
| disan.Chair 2.2.0 | 10 | 13% | 23 |
| stelo.AreaTargetingBot 1.1 | 7 | 9% | 38 |
| DBall.NUKE 0.1 | 2 | 3% | 11 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |
| donjezza.Muncho 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.5 | 91 / 210 | 3.57 | 16.2% | 28461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.2% | 91 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 28 |
| oog.melee.Capulet 1.2 | 3.3 | 13.1% | 38 |
| yagami.Tidus 0.11 | 4.7 | 12.3% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 74.3 | 17 / 35 | 5116 |
| 2 | 1 | 68.5 | 82.5 | 21 / 35 | 5136 |
| 3 | 1 | 64.5 | 70.2 | 14 / 35 | 4602 |
| 4 | 1 | 66.5 | 74.6 | 16 / 35 | 5071 |
| 5 | 2 | 61.9 | 60.0 | 9 / 35 | 4357 |
| 6 | 1 | 62.9 | 67.3 | 14 / 35 | 4179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 74% |
| kawigi.micro.Shiz 1.1 | 26 | 100% |
| oog.melee.Capulet 1.2 | 24 | 79% |
| yagami.Tidus 0.11 | 21 | 86% |
| ejb.Polaris 1.0.1 | 3 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 36% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 20% | 53 |
| yagami.Tidus 0.11 | 18 | 15% | 33 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 30 |
| ejb.Polaris 1.0.1 | 8 | 7% | 10 |
| stelo.MirrorNano 1.3 | 7 | 6% | 9 |
| kurios.DOSexe .9a | 5 | 4% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.4 | 122 / 210 | 3.21 | 17.0% | 27734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.0% | 122 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 19 |
| wee.Gem 1.8.4 | 3.2 | 12.1% | 24 |
| ratosh.Nobo 0.21 | 3.8 | 11.5% | 14 |
| wompi.Quokka 1.6 | 4.7 | 10.8% | 12 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 8 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 3 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.3 | 20 / 35 | 4688 |
| 2 | 1 | 64.7 | 76.2 | 19 / 35 | 4426 |
| 3 | 1 | 66.1 | 75.2 | 20 / 35 | 4899 |
| 4 | 1 | 66.4 | 77.1 | 22 / 35 | 4713 |
| 5 | 1 | 64.7 | 73.3 | 18 / 35 | 4509 |
| 6 | 1 | 65.8 | 76.2 | 23 / 35 | 4499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 96% |
| wee.Gem 1.8.4 | 33 | 97% |
| ratosh.Nobo 0.21 | 15 | 93% |
| wompi.Quokka 1.6 | 12 | 100% |
| m3thos.Eva00 1.1 | 7 | 71% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 88 of 210 rounds, at a mean tick of 345. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 16% | 55 |
| bayen.UbaMicro 1.4 | 13 | 15% | 21 |
| ratosh.Nobo 0.21 | 11 | 13% | 23 |
| stelo.MyAgileRobot 0.2 | 10 | 11% | 14 |
| wee.Gem 1.8.4 | 9 | 10% | 46 |
| wompi.Quokka 1.6 | 9 | 10% | 17 |
| maribo.FollowFire 1 | 9 | 10% | 9 |
| m3thos.Eva00 1.1 | 8 | 9% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 89.5 | 141 / 210 | 1.94 | 22.6% | 51527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.6% | 141 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 50 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 12 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.2% | 4 |
| ayk.WallHugger 1.0 | 5.2 | 8.9% | 1 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 8.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 2 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 84.1 | 22 / 35 | 8106 |
| 2 | 1 | 76.0 | 96.5 | 27 / 35 | 9487 |
| 3 | 1 | 74.4 | 93.0 | 27 / 35 | 8392 |
| 4 | 1 | 72.9 | 87.0 | 19 / 35 | 8365 |
| 5 | 1 | 73.8 | 87.9 | 23 / 35 | 8414 |
| 6 | 1 | 73.9 | 88.6 | 23 / 35 | 8763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 82% |
| mz.NanoGod 2.02 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| drd.Dreadknoght 0.9 | 4 | 75% |
| stelo.PianistNano 1.2 | 4 | 100% |
| ayk.WallHugger 1.0 | 4 | 75% |

Hadur died in 69 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 54% | 147 |
| mz.NanoGod 2.02 | 16 | 23% | 25 |
| exauge.GateKeeper 1.1.121g | 7 | 10% | 12 |
| stelo.PianistNano 1.2 | 3 | 4% | 8 |
| stuff.Vlad 0.1 | 3 | 4% | 5 |
| ayk.WallHugger 1.0 | 2 | 3% | 9 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.6 | 97 / 210 | 3.55 | 16.4% | 29308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.4% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 14.0% | 32 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 26 |
| bvh.micro.Freya 0.3 | 3.7 | 11.9% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.2% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.0% | 8 |
| conscience.Electron 1.3g | 7.0 | 7.6% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 6.6% | 2 |
| ap.Frederick 1.1 | 9.0 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 68.6 | 19 / 35 | 4752 |
| 2 | 1 | 63.9 | 67.9 | 15 / 35 | 4974 |
| 3 | 1 | 65.9 | 73.7 | 16 / 35 | 5322 |
| 4 | 1 | 66.1 | 74.9 | 19 / 35 | 5113 |
| 5 | 1 | 62.9 | 68.9 | 14 / 35 | 4635 |
| 6 | 1 | 64.4 | 75.9 | 14 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 83% |
| dummy.micro.Sparrow 2.5 | 24 | 75% |
| bvh.micro.Freya 0.3 | 18 | 78% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 67% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 25% | 70 |
| dummy.micro.Sparrow 2.5 | 20 | 18% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 14% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 25 |
| bvh.micro.Freya 0.3 | 12 | 11% | 19 |
| conscience.Electron 1.3g | 10 | 9% | 13 |
| dl.BetterWalls 1.0 | 9 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 15 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.7 | 151 / 210 | 2.10 | 21.9% | 44799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.9% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 11 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.6% | 11 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 6 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.5% | 1 |
| sample.Corners 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.3 | 27 / 35 | 7329 |
| 2 | 1 | 71.3 | 86.0 | 23 / 35 | 6952 |
| 3 | 1 | 73.1 | 90.8 | 26 / 35 | 7739 |
| 4 | 1 | 71.7 | 85.1 | 23 / 35 | 7494 |
| 5 | 1 | 72.3 | 86.7 | 26 / 35 | 7713 |
| 6 | 1 | 72.5 | 89.5 | 26 / 35 | 7572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 55 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 95% |
| supersample.SuperBoxBot 1.0 | 26 | 77% |
| dsw.StaticD 1.0 | 18 | 72% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 27% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 25% | 56 |
| dsw.StaticD 1.0 | 13 | 22% | 34 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 15 |
| sul.Lunar 1.1 | 4 | 7% | 50 |
| sample.Corners 1.0 | 2 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 78.6 | 108 / 210 | 2.93 | 18.5% | 39429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.5% | 108 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 30 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.6% | 23 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 9 |
| amz.NanoClone 1.41 | 5.3 | 9.6% | 11 |
| sample.Walls 1.0 | 7.3 | 7.6% | 7 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.9 | 21 / 35 | 6261 |
| 2 | 1 | 66.4 | 74.0 | 16 / 35 | 6467 |
| 3 | 1 | 69.5 | 84.1 | 17 / 35 | 6938 |
| 4 | 1 | 66.3 | 73.3 | 17 / 35 | 6291 |
| 5 | 1 | 69.0 | 81.3 | 20 / 35 | 7013 |
| 6 | 1 | 67.6 | 76.8 | 17 / 35 | 6459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 88% |
| mld.Wisdom 1.0 | 27 | 89% |
| radnor.DoctorBob 1.42 | 27 | 78% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 71% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 5 | 40% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 24% | 52 |
| radnor.DoctorBob 1.42 | 21 | 21% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 19% | 51 |
| KiraNL.Chupacabra 0.4 | 19 | 19% | 28 |
| amz.NanoClone 1.41 | 7 | 7% | 11 |
| sample.Walls 1.0 | 6 | 6% | 10 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

