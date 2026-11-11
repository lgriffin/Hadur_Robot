# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.6 | 137 / 210 | 2.39 | 20.3% | 42969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 20.3% | 137 |
| mz.AntiGrav 1.0 | 2.3 | 14.5% | 23 |
| radnor.DoctorBob 1.42 | 3.0 | 14.1% | 26 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 3 |
| GarmBox.Oranges 1.0 | 6.3 | 7.2% | 0 |
| sample.Walls 1.0 | 6.7 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.0 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 1 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 91.4 | 28 / 35 | 7745 |
| 2 | 1 | 71.5 | 85.4 | 23 / 35 | 7507 |
| 3 | 1 | 69.1 | 78.1 | 20 / 35 | 6740 |
| 4 | 1 | 69.1 | 79.4 | 21 / 35 | 6795 |
| 5 | 1 | 71.3 | 85.1 | 24 / 35 | 7273 |
| 6 | 1 | 71.3 | 88.3 | 21 / 35 | 6909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 90% |
| mld.Infinity 2.2 | 40 | 93% |
| radnor.DoctorBob 1.42 | 33 | 91% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 27 | 36% | 82 |
| radnor.DoctorBob 1.42 | 22 | 30% | 52 |
| mld.Infinity 2.2 | 12 | 16% | 48 |
| jangs.ns51 1.0 | 4 | 5% | 6 |
| sample.Walls 1.0 | 3 | 4% | 9 |
| amz.NanoClone 1.41 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |

## Melee bench: F02

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.9 | 92 / 210 | 3.26 | 16.4% | 29948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.5 | 16.4% | 92 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 63 |
| mld.DustBunny 3.8 | 2.3 | 14.7% | 30 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 9.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.4% | 10 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.7% | 5 |
| bzdp.BoxCar 2.0 | 7.7 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 7.7 | 7.1% | 6 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.9 | 19 / 35 | 5059 |
| 2 | 1 | 65.0 | 76.2 | 15 / 35 | 5049 |
| 3 | 1 | 65.5 | 77.1 | 19 / 35 | 4786 |
| 4 | 1 | 67.4 | 80.0 | 16 / 35 | 5637 |
| 5 | 3 | 60.5 | 57.5 | 8 / 35 | 5114 |
| 6 | 2 | 63.9 | 75.9 | 15 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 50 | 82% |
| oog.melee.Mercutio 1.0 | 47 | 72% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 27% | 71 |
| oog.melee.Mercutio 1.0 | 28 | 24% | 61 |
| zyx.nano.Ant 1.1 | 24 | 20% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 9% | 16 |
| maribo.melee.BMV 0.1 | 8 | 7% | 12 |
| fullsail.SweetTea 1.1 | 7 | 6% | 14 |
| cs.Grudge 1.0 | 5 | 4% | 5 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 73.9 | 92 / 210 | 3.35 | 17.3% | 35066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.2 | 17.3% | 92 |
| myl.micro.Troodon 1.10 | 1.8 | 15.0% | 60 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 12.4% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.7% | 32 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.9% | 7 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.4% | 3 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.5% | 1 |
| sample.Fire 1.0 | 9.2 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 80.3 | 17 / 35 | 5938 |
| 2 | 1 | 67.7 | 76.5 | 17 / 35 | 6373 |
| 3 | 1 | 66.4 | 73.0 | 16 / 35 | 5899 |
| 4 | 1 | 66.8 | 76.8 | 18 / 35 | 5807 |
| 5 | 1 | 63.7 | 66.0 | 12 / 35 | 5445 |
| 6 | 2 | 64.7 | 70.8 | 12 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 34 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 29 | 72% |
| cb.nano.Insomnia 1.0 | 12 | 100% |
| myl.nano.KomoriNinja 1.1 | 10 | 80% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 33 | 28% | 63 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 22% | 42 |
| fm.mammillarias 1.3 | 20 | 17% | 24 |
| myl.nano.KomoriNinja 1.1 | 19 | 16% | 38 |
| cb.nano.Insomnia 1.0 | 12 | 10% | 19 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 9 |
| sample.Tracker 1.0 | 2 | 2% | 4 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.0 | 122 / 210 | 2.89 | 18.6% | 37010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 18.6% | 122 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.1% | 31 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.4% | 18 |
| tj.zombie1n 1.0.1 | 4.8 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.0% | 0 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.5% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.7 | 21 / 35 | 6464 |
| 2 | 1 | 70.4 | 87.9 | 25 / 35 | 6599 |
| 3 | 1 | 67.2 | 77.1 | 21 / 35 | 5965 |
| 4 | 1 | 68.2 | 77.8 | 19 / 35 | 6501 |
| 5 | 1 | 67.2 | 76.8 | 20 / 35 | 6009 |
| 6 | 1 | 64.3 | 68.9 | 16 / 35 | 5472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 85% |
| stelo.SoJNanoMelee 1.1 | 30 | 77% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| tj.zombie1n 1.0.1 | 14 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| yk.JahMicro 1.0 | 5 | 80% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 39% | 85 |
| stelo.SoJNanoMelee 1.1 | 18 | 20% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 10% | 13 |
| tvv.micro.Antares 1.1.1 | 6 | 7% | 27 |
| tj.zombie1n 1.0.1 | 6 | 7% | 11 |
| yk.JahMicro 1.0 | 5 | 6% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 17 |
| repositorio.NanoStep 1.0 | 3 | 3% | 9 |
| sample.VelociRobot 1.0 | 3 | 3% | 9 |

## Melee bench: F05

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 71.0 | 76 / 210 | 3.61 | 15.6% | 29463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 15.6% | 76 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 40 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.0% | 25 |
| sam.Samspin 1.0 | 5.7 | 10.0% | 14 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.7% | 15 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.6% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 72.7 | 15 / 35 | 5162 |
| 2 | 1 | 61.7 | 67.9 | 10 / 35 | 4699 |
| 3 | 1 | 64.5 | 74.6 | 14 / 35 | 5068 |
| 4 | 1 | 63.4 | 71.4 | 12 / 35 | 4932 |
| 5 | 1 | 62.7 | 69.8 | 13 / 35 | 4862 |
| 6 | 1 | 62.1 | 69.5 | 12 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 37 | 59% |
| simonton.nano.MeleeSeed 1.8 | 23 | 74% |
| ahf.NanoAndrew .4 | 19 | 63% |
| EBBU.Sim2 1.02 | 12 | 58% |
| sam.Samspin 1.0 | 9 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 71% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 18% | 45 |
| simonton.nano.MeleeSeed 1.8 | 22 | 16% | 40 |
| ahf.NanoAndrew .4 | 20 | 15% | 32 |
| robar.nano.Assertive_Melee 0.2 | 18 | 13% | 23 |
| zyx.nano.BacillusComma 1.0 | 15 | 11% | 19 |
| EBBU.Sim2 1.02 | 14 | 10% | 17 |
| sam.Samspin 1.0 | 8 | 6% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 10 |
| sample.TrackFire 1.0 | 6 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.5 | 99 / 210 | 2.94 | 17.4% | 31885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.2 | 17.4% | 99 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.3% | 45 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.5% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.2% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.5% | 13 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 7 |
| fm.claire 1.7 | 6.0 | 8.9% | 2 |
| sample.SpinBot 1.0 | 8.2 | 6.8% | 4 |
| pa.Improved 1.0 | 9.2 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 73.3 | 15 / 35 | 5100 |
| 2 | 1 | 66.1 | 78.7 | 16 / 35 | 5485 |
| 3 | 1 | 66.9 | 82.2 | 20 / 35 | 4898 |
| 4 | 1 | 67.6 | 81.6 | 18 / 35 | 5933 |
| 5 | 1 | 65.6 | 74.9 | 17 / 35 | 5045 |
| 6 | 1 | 66.4 | 80.0 | 13 / 35 | 5424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 75% |
| oog.melee.CapuletDroid 1.1 | 20 | 90% |
| gh.nano.Grofvuil 0.2 | 11 | 91% |
| arthord.NanoSatanMelee Beta | 9 | 56% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 35% | 74 |
| gh.nano.Grofvuil 0.2 | 18 | 16% | 35 |
| oog.melee.CapuletDroid 1.1 | 14 | 13% | 33 |
| arthord.NanoSatanMelee Beta | 13 | 12% | 16 |
| sample.SpinBot 1.0 | 7 | 6% | 9 |
| fm.claire 1.7 | 7 | 6% | 9 |
| kurios.DOSexe .9b | 6 | 5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 17 |
| pa.Improved 1.0 | 3 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 69.9 | 70 / 210 | 3.70 | 15.5% | 31198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.7 | 15.4% | 43 |
| hadur117.micro.SaorWNW 0.1 | 2.2 | 15.5% | 70 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.5% | 41 |
| mz.MicroGodMelee 1 | 3.2 | 14.2% | 37 |
| DBall.Anarchy 0.1 | 5.0 | 8.7% | 8 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.7% | 2 |
| acogdev.alpha 0.2 | 7.2 | 7.0% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 17 / 35 | 5913 |
| 2 | 3 | 61.3 | 62.9 | 9 / 35 | 5056 |
| 3 | 1 | 65.7 | 77.1 | 14 / 35 | 5089 |
| 4 | 1 | 65.7 | 73.0 | 13 / 35 | 5534 |
| 5 | 3 | 60.9 | 62.5 | 9 / 35 | 4632 |
| 6 | 4 | 60.8 | 62.5 | 8 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 43 | 70% |
| spinnercat.micro.Tyger 0.1 | 23 | 83% |
| gh.micro.Gruweltje 0.7 | 15 | 60% |
| DBall.Anarchy 0.1 | 9 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 27% | 61 |
| gh.micro.Gruweltje 0.7 | 35 | 25% | 53 |
| spinnercat.micro.Tyger 0.1 | 33 | 23% | 50 |
| caimano.Furia_Ceca 0.22 | 11 | 8% | 12 |
| fire219.CatBot 1.0 | 7 | 5% | 7 |
| acogdev.alpha 0.2 | 7 | 5% | 7 |
| DBall.Anarchy 0.1 | 6 | 4% | 15 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 66.5 | 96 / 210 | 4.01 | 15.4% | 30971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.5% | 54 |
| hadur117.micro.SaorWNW 0.1 | 1.8 | 15.4% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.4% | 24 |
| germ.TheMind .2 | 5.2 | 9.2% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.7% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.8% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 5 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.7% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 61.3 | 12 / 35 | 4828 |
| 2 | 2 | 59.8 | 58.4 | 14 / 35 | 4851 |
| 3 | 2 | 63.7 | 66.0 | 15 / 35 | 5367 |
| 4 | 1 | 65.7 | 70.8 | 20 / 35 | 5920 |
| 5 | 2 | 64.7 | 72.1 | 17 / 35 | 5006 |
| 6 | 2 | 64.6 | 70.5 | 18 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 76% |
| germ.TheMind .2 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 39% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 39 |
| germ.TheMind .2 | 11 | 10% | 17 |
| awesomeness.Elite 1.0 | 10 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 10 |
| mym.EdgeStalker 1.0 | 6 | 5% | 8 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 7 |
| sample.Crazy 1.0 | 4 | 4% | 9 |

## Melee bench: F09

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.3 | 101 / 210 | 3.22 | 16.7% | 28288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 16.7% | 101 |
| rz.HawkOnFire 0.1 | 2.0 | 14.4% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.7% | 21 |
| maribo.IotaCT 1.1 | 4.0 | 11.2% | 22 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 9.0% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 8.5% | 5 |
| stelo.PatternRobot 1.0 | 8.2 | 8.2% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.8 | 12 / 35 | 4374 |
| 2 | 1 | 64.8 | 72.7 | 16 / 35 | 4518 |
| 3 | 1 | 69.6 | 87.3 | 23 / 35 | 5003 |
| 4 | 1 | 63.7 | 70.2 | 14 / 35 | 4359 |
| 5 | 1 | 66.2 | 73.0 | 19 / 35 | 5012 |
| 6 | 1 | 66.6 | 77.8 | 17 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 54 | 89% |
| nz.jdc.nano.GridFu 1.0 | 15 | 93% |
| stelo.PatternRobot 1.0 | 14 | 79% |
| timmit.nano.TimDog 0.33 | 12 | 58% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| maribo.IotaCT 1.1 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 26 | 24% | 64 |
| stelo.PatternRobot 1.0 | 23 | 21% | 33 |
| ratosh.Wesco 1.4 | 18 | 16% | 25 |
| nz.jdc.nano.GridFu 1.0 | 16 | 15% | 35 |
| timmit.nano.TimDog 0.33 | 12 | 11% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 13 |
| spinnercat.Omen 1.0 | 5 | 5% | 9 |
| maribo.IotaCT 1.1 | 3 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.1 | 146 / 210 | 2.34 | 20.0% | 38500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 20.0% | 146 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 10 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.4% | 17 |
| zyx.micro.Ant 1.1 | 4.2 | 10.3% | 11 |
| Grystrion.TrackerWO 1.0 | 4.5 | 10.1% | 7 |
| sanja.First 0.1 | 6.5 | 8.4% | 7 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 9 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.8% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.8 | 27 / 35 | 6413 |
| 2 | 1 | 71.6 | 90.5 | 28 / 35 | 6978 |
| 3 | 1 | 70.3 | 87.3 | 27 / 35 | 6469 |
| 4 | 1 | 66.3 | 76.8 | 16 / 35 | 5976 |
| 5 | 1 | 68.9 | 81.0 | 24 / 35 | 6494 |
| 6 | 1 | 69.3 | 85.1 | 24 / 35 | 6170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 93% |
| tvv.nano.Polaris 1.2 | 26 | 96% |
| cvt.Firsty 1.0 | 23 | 91% |
| sanja.First 0.1 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| zyx.micro.Ant 1.1 | 14 | 86% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 21 | 32% | 41 |
| baal.nano.N 1.42 | 10 | 15% | 42 |
| Grystrion.TrackerWO 1.0 | 10 | 15% | 28 |
| amk.Punbot.Punbot 0.01 | 7 | 11% | 11 |
| cvt.Firsty 1.0 | 6 | 9% | 19 |
| tvv.nano.Polaris 1.2 | 4 | 6% | 40 |
| squidM.TentalceMeleeNano 1.1 | 4 | 6% | 9 |
| sanja.First 0.1 | 3 | 5% | 19 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 65.6 | 69 / 210 | 4.10 | 14.5% | 28946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.8% | 91 |
| hadur117.micro.SaorWNW 0.1 | 2.2 | 14.5% | 69 |
| cs.Wren 1.0 | 3.0 | 12.8% | 24 |
| mz.Cork 0.1 | 4.5 | 11.2% | 8 |
| js.PinBall 1.6 | 4.5 | 11.0% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 2 |
| evd.X1 0.01 | 6.8 | 8.1% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.3% | 0 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 70.2 | 16 / 35 | 5016 |
| 2 | 2 | 62.0 | 66.7 | 12 / 35 | 4827 |
| 3 | 2 | 60.7 | 64.1 | 10 / 35 | 4550 |
| 4 | 3 | 58.1 | 55.9 | 9 / 35 | 4246 |
| 5 | 2 | 63.1 | 69.8 | 11 / 35 | 5233 |
| 6 | 2 | 62.8 | 66.7 | 11 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 71% |
| cs.Wren 1.0 | 19 | 95% |
| mz.Cork 0.1 | 8 | 75% |
| js.PinBall 1.6 | 7 | 71% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 39% | 93 |
| cs.Wren 1.0 | 20 | 14% | 30 |
| evd.X1 0.01 | 16 | 11% | 18 |
| joe.ADinosaur 1.0 | 15 | 11% | 18 |
| mz.Cork 0.1 | 12 | 8% | 20 |
| js.PinBall 1.6 | 12 | 8% | 17 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.1 | 103 / 210 | 3.15 | 17.0% | 28904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 17.0% | 103 |
| myl.nano.Graviton 1.10 | 3.2 | 12.0% | 32 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 11.4% | 19 |
| ntc.Opposite 1.5 | 3.8 | 11.1% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 9 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.8% | 9 |
| disan.Chair 2.2.0 | 6.7 | 8.5% | 9 |
| DBall.NUKE 0.1 | 7.5 | 8.5% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.5% | 8 |
| pbg.R2D2 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.9 | 20 / 35 | 5356 |
| 2 | 1 | 66.5 | 80.0 | 18 / 35 | 4927 |
| 3 | 1 | 63.0 | 69.8 | 12 / 35 | 4636 |
| 4 | 1 | 65.5 | 76.2 | 18 / 35 | 4563 |
| 5 | 1 | 68.1 | 81.6 | 23 / 35 | 5369 |
| 6 | 1 | 61.3 | 67.3 | 12 / 35 | 4053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 88% |
| stelo.AreaTargetingBot 1.1 | 25 | 88% |
| ntc.Opposite 1.5 | 14 | 86% |
| disan.Chair 2.2.0 | 12 | 92% |
| DBall.NUKE 0.1 | 12 | 83% |
| donjezza.Muncho 1.0 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 1 | 0% |

Hadur died in 107 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 21 | 20% | 52 |
| ntc.Opposite 1.5 | 20 | 19% | 29 |
| pfvicm.Sobieski 7.2.3b | 19 | 18% | 22 |
| stelo.AreaTargetingBot 1.1 | 15 | 14% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 14% | 21 |
| disan.Chair 2.2.0 | 7 | 7% | 16 |
| pbg.R2D2 1.0 | 4 | 4% | 5 |
| donjezza.Muncho 1.0 | 3 | 3% | 14 |
| DBall.NUKE 0.1 | 3 | 3% | 12 |

## Melee bench: F13

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 61.7 | 55 / 210 | 4.44 | 13.5% | 25105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.6% | 57 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 41 |
| hadur117.micro.SaorWNW 0.1 | 3.0 | 13.5% | 55 |
| yagami.Tidus 0.11 | 3.5 | 13.3% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 25 |
| ejb.Polaris 1.0.1 | 5.8 | 11.1% | 12 |
| stelo.MirrorNano 1.3 | 7.5 | 7.0% | 1 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.5 | 64.8 | 8 / 35 | 4218 |
| 2 | 2 | 61.5 | 60.3 | 11 / 35 | 4471 |
| 3 | 4 | 58.9 | 57.8 | 8 / 35 | 3926 |
| 4 | 1 | 60.4 | 61.0 | 11 / 35 | 4171 |
| 5 | 3 | 61.7 | 63.5 | 9 / 35 | 4448 |
| 6 | 4 | 60.2 | 63.2 | 8 / 35 | 3871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 22 | 59% |
| kawigi.micro.Shiz 1.1 | 16 | 88% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 80% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 45 | 29% | 54 |
| oog.melee.Capulet 1.2 | 43 | 28% | 55 |
| kawigi.micro.Shiz 1.1 | 18 | 12% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 12% | 30 |
| ejb.Polaris 1.0.1 | 13 | 8% | 21 |
| stelo.MirrorNano 1.3 | 10 | 6% | 10 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.5 | 102 / 210 | 3.39 | 16.0% | 27165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 16.0% | 102 |
| bzdp.Pansy 2.1 | 2.5 | 12.8% | 27 |
| wee.Gem 1.8.4 | 3.5 | 11.6% | 30 |
| wompi.Quokka 1.6 | 3.7 | 11.6% | 21 |
| ratosh.Nobo 0.21 | 4.8 | 10.9% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 10.3% | 10 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.3% | 3 |
| maribo.FollowFire 1 | 9.5 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 23 / 35 | 4869 |
| 2 | 1 | 62.8 | 69.5 | 17 / 35 | 4439 |
| 3 | 1 | 60.6 | 66.0 | 12 / 35 | 4135 |
| 4 | 1 | 61.8 | 67.9 | 17 / 35 | 4147 |
| 5 | 1 | 66.5 | 81.3 | 19 / 35 | 4837 |
| 6 | 1 | 63.0 | 69.2 | 14 / 35 | 4738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 38 | 89% |
| wompi.Quokka 1.6 | 24 | 79% |
| wee.Gem 1.8.4 | 22 | 95% |
| m3thos.Eva00 1.1 | 13 | 77% |
| ratosh.Nobo 0.21 | 12 | 92% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 19% | 52 |
| wompi.Quokka 1.6 | 20 | 19% | 39 |
| bayen.UbaMicro 1.4 | 15 | 14% | 18 |
| maribo.FollowFire 1 | 15 | 14% | 14 |
| ratosh.Nobo 0.21 | 11 | 10% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 8% | 13 |
| m3thos.Eva00 1.1 | 8 | 7% | 16 |
| wee.Gem 1.8.4 | 5 | 5% | 29 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 82.1 | 116 / 210 | 2.61 | 19.8% | 44689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 19.8% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 68 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 19 |
| ayk.WallHugger 1.0 | 4.3 | 10.4% | 4 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.2% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 86.3 | 21 / 35 | 7407 |
| 2 | 1 | 71.8 | 87.9 | 23 / 35 | 7375 |
| 3 | 1 | 69.7 | 75.9 | 17 / 35 | 7489 |
| 4 | 1 | 69.7 | 77.8 | 16 / 35 | 7282 |
| 5 | 1 | 72.0 | 85.4 | 22 / 35 | 7783 |
| 6 | 1 | 70.2 | 79.0 | 17 / 35 | 7353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 81% |
| mz.NanoGod 2.02 | 12 | 83% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| sample.SittingDuck 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 94 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 35% | 121 |
| mz.NanoGod 2.02 | 30 | 32% | 45 |
| ayk.WallHugger 1.0 | 14 | 15% | 16 |
| exauge.GateKeeper 1.1.121g | 9 | 10% | 13 |
| stuff.Vlad 0.1 | 7 | 7% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.6 | 96 / 210 | 3.56 | 16.3% | 30355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 16.3% | 96 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 32 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.2% | 21 |
| bvh.micro.Freya 0.3 | 4.5 | 10.8% | 15 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 10 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 5 |
| dl.BetterWalls 1.0 | 8.2 | 6.9% | 3 |
| ap.Frederick 1.1 | 8.8 | 6.4% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.8 | 18 / 35 | 5071 |
| 2 | 1 | 62.6 | 67.6 | 13 / 35 | 4780 |
| 3 | 1 | 63.7 | 68.9 | 16 / 35 | 5010 |
| 4 | 1 | 66.0 | 74.9 | 20 / 35 | 5241 |
| 5 | 1 | 64.2 | 71.1 | 16 / 35 | 5044 |
| 6 | 1 | 63.6 | 69.2 | 13 / 35 | 5209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 82% |
| dummy.micro.Sparrow 2.5 | 25 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 78% |
| bvh.micro.Freya 0.3 | 17 | 94% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 22% | 61 |
| dummy.micro.Sparrow 2.5 | 22 | 19% | 43 |
| conscience.Electron 1.3g | 18 | 16% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 15% | 32 |
| bvh.micro.Freya 0.3 | 14 | 12% | 23 |
| dl.BetterWalls 1.0 | 11 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 5 | 4% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 3% | 4 |

## Melee bench: F17

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.1 | 134 / 210 | 2.52 | 19.9% | 41131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 19.9% | 134 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 29 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 12 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.6% | 12 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.9% | 6 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.6% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 8 |
| sample.Corners 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.8 | 22 / 35 | 7093 |
| 2 | 1 | 69.4 | 81.9 | 19 / 35 | 6926 |
| 3 | 1 | 68.8 | 78.1 | 19 / 35 | 6888 |
| 4 | 1 | 69.6 | 80.6 | 23 / 35 | 7074 |
| 5 | 1 | 70.9 | 88.3 | 26 / 35 | 6782 |
| 6 | 1 | 70.1 | 85.7 | 25 / 35 | 6368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 43 | 91% |
| sul.Lunar 1.1 | 38 | 100% |
| supersample.SuperBoxBot 1.0 | 23 | 91% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 36% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 25% | 59 |
| dsw.StaticD 1.0 | 10 | 13% | 17 |
| mme.NikeEnhanced 2.0 | 7 | 9% | 19 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 7 |
| sul.Lunar 1.1 | 3 | 4% | 43 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 18 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 4 |
| sample.Corners 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 66.6 | 79 / 210 | 4.01 | 15.3% | 33287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.2 | 15.3% | 79 |
| radnor.DoctorBob 1.42 | 2.0 | 13.6% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.1% | 27 |
| mld.Wisdom 1.0 | 3.7 | 12.6% | 22 |
| KiraNL.Chupacabra 0.4 | 4.7 | 11.4% | 13 |
| amz.NanoClone 1.41 | 5.8 | 10.0% | 13 |
| sample.Walls 1.0 | 7.2 | 8.0% | 14 |
| GarmBox.Oranges 1.0 | 8.0 | 7.2% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 63.5 | 15 / 35 | 5435 |
| 2 | 2 | 61.1 | 62.2 | 10 / 35 | 5146 |
| 3 | 1 | 65.3 | 73.7 | 17 / 35 | 5775 |
| 4 | 1 | 61.5 | 62.2 | 11 / 35 | 5643 |
| 5 | 1 | 63.3 | 66.7 | 11 / 35 | 5598 |
| 6 | 1 | 64.4 | 71.1 | 15 / 35 | 5690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 82% |
| radnor.DoctorBob 1.42 | 26 | 69% |
| mld.Wisdom 1.0 | 22 | 73% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 22% | 55 |
| mld.Wisdom 1.0 | 29 | 22% | 46 |
| radnor.DoctorBob 1.42 | 26 | 20% | 45 |
| KiraNL.Chupacabra 0.4 | 22 | 17% | 27 |
| amz.NanoClone 1.41 | 9 | 7% | 13 |
| GarmBox.Oranges 1.0 | 7 | 5% | 6 |
| sample.Walls 1.0 | 5 | 4% | 10 |
| jangs.ns51 1.0 | 5 | 4% | 8 |

