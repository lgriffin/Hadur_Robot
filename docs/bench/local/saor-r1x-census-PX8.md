# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 67.2 | 75 / 210 | 3.95 | 15.1% | 31653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mz.AntiGrav 1.0 | 1.8 | 16.1% | 48 |
| radnor.DoctorBob 1.42 | 2.2 | 15.1% | 43 |
| hadur117.micro.SaorPX8 0.1 | 2.5 | 15.1% | 75 |
| mld.Infinity 2.2 | 3.5 | 13.8% | 28 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 9 |
| sample.Walls 1.0 | 6.2 | 8.5% | 3 |
| GarmBox.Oranges 1.0 | 7.3 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.5% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 1 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 74.6 | 17 / 35 | 6132 |
| 2 | 2 | 64.6 | 69.2 | 13 / 35 | 5595 |
| 3 | 2 | 62.8 | 66.7 | 10 / 35 | 5257 |
| 4 | 3 | 60.7 | 62.2 | 11 / 35 | 4472 |
| 5 | 4 | 61.9 | 62.5 | 10 / 35 | 4796 |
| 6 | 3 | 64.8 | 68.3 | 14 / 35 | 5401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 45 | 87% |
| radnor.DoctorBob 1.42 | 24 | 75% |
| mld.Infinity 2.2 | 16 | 88% |
| amz.NanoClone 1.41 | 4 | 25% |
| arthord.MannyPacquiao Beta | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sample.Walls 1.0 | 35 | 26% | 36 |
| mz.AntiGrav 1.0 | 27 | 20% | 59 |
| amz.NanoClone 1.41 | 26 | 19% | 29 |
| radnor.DoctorBob 1.42 | 23 | 17% | 39 |
| mld.Infinity 2.2 | 13 | 10% | 30 |
| jangs.ns51 1.0 | 5 | 4% | 6 |
| GarmBox.Oranges 1.0 | 4 | 3% | 5 |
| arthord.MannyPacquiao Beta | 3 | 2% | 5 |

## Melee bench: F02

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.1 | 73 / 210 | 3.06 | 15.6% | 27052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.8 | 15.6% | 73 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.2% | 64 |
| mld.DustBunny 3.8 | 2.5 | 14.4% | 34 |
| maribo.melee.BMV 0.1 | 4.0 | 11.1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 9.0% | 8 |
| zyx.nano.Ant 1.1 | 6.3 | 8.6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.3% | 13 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 5.8% | 8 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.9 | 15 / 35 | 4399 |
| 2 | 1 | 63.5 | 77.5 | 10 / 35 | 4868 |
| 3 | 3 | 61.8 | 71.4 | 11 / 35 | 4197 |
| 4 | 1 | 65.9 | 81.0 | 16 / 35 | 4694 |
| 5 | 2 | 62.9 | 74.9 | 10 / 35 | 4405 |
| 6 | 3 | 63.7 | 75.9 | 11 / 35 | 4489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 45 | 76% |
| oog.melee.Mercutio 1.0 | 40 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 33% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 45 | 33% | 73 |
| oog.melee.Mercutio 1.0 | 27 | 20% | 54 |
| maribo.melee.BMV 0.1 | 19 | 14% | 21 |
| zyx.nano.Ant 1.1 | 18 | 13% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 8% | 17 |
| bzdp.BoxCar 2.0 | 7 | 5% | 9 |
| fullsail.SweetTea 1.1 | 5 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 64.1 | 61 / 210 | 4.23 | 14.3% | 28790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.0 | 17.0% | 87 |
| hadur117.micro.SaorPX8 0.1 | 2.3 | 14.3% | 61 |
| stelo.SoRobotNanoMelee 1.2 | 2.8 | 12.9% | 31 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 12.0% | 10 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.5% | 12 |
| fm.mammillarias 1.3 | 5.7 | 9.8% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 2 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.4% | 3 |
| sample.Fire 1.0 | 8.8 | 5.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 66.0 | 10 / 35 | 4785 |
| 2 | 2 | 62.1 | 66.7 | 10 / 35 | 4672 |
| 3 | 3 | 60.9 | 62.2 | 9 / 35 | 4838 |
| 4 | 3 | 57.7 | 54.6 | 7 / 35 | 4445 |
| 5 | 2 | 62.7 | 67.0 | 12 / 35 | 4808 |
| 6 | 2 | 63.9 | 68.3 | 13 / 35 | 5242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 78% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 86% |
| cb.nano.Insomnia 1.0 | 12 | 100% |
| myl.nano.KomoriNinja 1.1 | 6 | 67% |
| sp.Nanos.Ember 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 34% | 73 |
| fm.mammillarias 1.3 | 36 | 24% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 29 | 19% | 39 |
| myl.nano.KomoriNinja 1.1 | 15 | 10% | 27 |
| cb.nano.Insomnia 1.0 | 12 | 8% | 13 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 8 |
| cs.sheldor.Talon 1.1 | 2 | 1% | 4 |
| sample.Tracker 1.0 | 2 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 74.9 | 80 / 210 | 3.26 | 16.4% | 32494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.2 | 16.4% | 80 |
| kawigi.nano.Lib 1.0 | 1.8 | 14.9% | 47 |
| tvv.micro.Antares 1.1.1 | 3.3 | 12.4% | 25 |
| stelo.SoJNanoMelee 1.1 | 4.0 | 11.1% | 28 |
| tj.zombie1n 1.0.1 | 5.2 | 9.9% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.5% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.0 | 8.3% | 1 |
| yk.JahMicro 1.0 | 7.3 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.8 | 16 / 35 | 5393 |
| 2 | 1 | 64.7 | 76.2 | 11 / 35 | 5400 |
| 3 | 1 | 62.3 | 69.5 | 13 / 35 | 4770 |
| 4 | 1 | 68.6 | 81.6 | 18 / 35 | 6563 |
| 5 | 2 | 63.0 | 71.1 | 9 / 35 | 5006 |
| 6 | 1 | 64.4 | 73.3 | 13 / 35 | 5362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 70% |
| stelo.SoJNanoMelee 1.1 | 31 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 62% |
| tj.zombie1n 1.0.1 | 10 | 100% |
| tvv.micro.Antares 1.1.1 | 9 | 56% |
| yk.JahMicro 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 46% | 93 |
| stelo.SoJNanoMelee 1.1 | 28 | 22% | 45 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 10% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 8% | 15 |
| tvv.micro.Antares 1.1.1 | 9 | 7% | 15 |
| tj.zombie1n 1.0.1 | 7 | 5% | 9 |
| sample.VelociRobot 1.0 | 2 | 2% | 6 |
| yk.JahMicro 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.4 | 67 / 210 | 3.58 | 15.1% | 27865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.2 | 15.1% | 67 |
| oog.melee.Corsair 1.0 | 2.7 | 12.5% | 31 |
| ahf.NanoAndrew .4 | 2.8 | 12.2% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.7% | 33 |
| EBBU.Sim2 1.02 | 5.2 | 10.2% | 11 |
| sam.Samspin 1.0 | 6.5 | 9.1% | 16 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.0% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.6% | 8 |
| sample.TrackFire 1.0 | 9.5 | 5.4% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 63.8 | 9 / 35 | 3823 |
| 2 | 1 | 60.6 | 66.0 | 11 / 35 | 4408 |
| 3 | 1 | 61.1 | 70.2 | 10 / 35 | 4349 |
| 4 | 1 | 63.0 | 73.3 | 10 / 35 | 5010 |
| 5 | 1 | 64.8 | 78.4 | 15 / 35 | 5000 |
| 6 | 1 | 64.6 | 76.5 | 12 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 83% |
| oog.melee.Corsair 1.0 | 19 | 68% |
| ahf.NanoAndrew .4 | 14 | 64% |
| EBBU.Sim2 1.02 | 13 | 69% |
| sam.Samspin 1.0 | 8 | 38% |
| robar.nano.Assertive_Melee 0.2 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| sample.TrackFire 1.0 | 2 | 0% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 26 | 18% | 29 |
| simonton.nano.MeleeSeed 1.8 | 20 | 14% | 42 |
| ahf.NanoAndrew .4 | 19 | 13% | 29 |
| sam.Samspin 1.0 | 19 | 13% | 23 |
| oog.melee.Corsair 1.0 | 18 | 13% | 32 |
| EBBU.Sim2 1.02 | 15 | 10% | 25 |
| zyx.nano.BacillusComma 1.0 | 10 | 7% | 12 |
| sample.TrackFire 1.0 | 9 | 6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 5% | 9 |

## Melee bench: F06

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 74.4 | 79 / 210 | 3.30 | 15.6% | 27017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.5 | 15.6% | 79 |
| d414.nano.Quantum 1.0.0 | 1.5 | 15.7% | 53 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.4% | 20 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.8% | 25 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 11 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.6% | 2 |
| fm.claire 1.7 | 6.5 | 8.4% | 4 |
| sample.SpinBot 1.0 | 7.5 | 7.8% | 8 |
| pa.Improved 1.0 | 9.2 | 6.2% | 7 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 73.7 | 14 / 35 | 4344 |
| 2 | 2 | 64.7 | 76.2 | 15 / 35 | 4779 |
| 3 | 1 | 62.6 | 74.0 | 10 / 35 | 4506 |
| 4 | 2 | 64.0 | 76.2 | 14 / 35 | 4614 |
| 5 | 2 | 62.0 | 71.1 | 12 / 35 | 4228 |
| 6 | 1 | 63.4 | 75.2 | 14 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 47 | 72% |
| oog.melee.CapuletDroid 1.1 | 19 | 95% |
| gh.nano.Grofvuil 0.2 | 14 | 71% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| pa.Improved 1.0 | 2 | 50% |
| fm.claire 1.7 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 41% | 84 |
| gh.nano.Grofvuil 0.2 | 18 | 13% | 32 |
| fm.claire 1.7 | 18 | 13% | 19 |
| arthord.NanoSatanMelee Beta | 13 | 10% | 16 |
| oog.melee.CapuletDroid 1.1 | 10 | 7% | 26 |
| winamp32.micro.MicroMacro 1.0 | 7 | 5% | 14 |
| kurios.DOSexe .9b | 6 | 4% | 9 |
| sample.SpinBot 1.0 | 6 | 4% | 7 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.6 | 46 / 210 | 3.73 | 14.3% | 27266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.7 | 16.0% | 59 |
| spinnercat.micro.Tyger 0.1 | 1.8 | 15.3% | 55 |
| hadur117.micro.SaorPX8 0.1 | 2.7 | 14.3% | 46 |
| mz.MicroGodMelee 1 | 3.8 | 13.4% | 29 |
| DBall.Anarchy 0.1 | 5.2 | 9.1% | 7 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.2% | 4 |
| mbro.Detektor3 0.1.1 | 7.7 | 6.0% | 5 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 3 |
| el.JumpShoot 0.2 | 8.7 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 63.2 | 8 / 35 | 4014 |
| 2 | 3 | 60.6 | 64.8 | 6 / 35 | 4427 |
| 3 | 2 | 63.6 | 74.9 | 9 / 35 | 4739 |
| 4 | 3 | 60.2 | 66.3 | 5 / 35 | 4506 |
| 5 | 2 | 64.8 | 77.1 | 11 / 35 | 5269 |
| 6 | 3 | 61.7 | 71.4 | 7 / 35 | 4311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 29 | 55% |
| spinnercat.micro.Tyger 0.1 | 29 | 55% |
| gh.micro.Gruweltje 0.7 | 18 | 28% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 30% | 62 |
| gh.micro.Gruweltje 0.7 | 35 | 21% | 42 |
| mz.MicroGodMelee 1 | 24 | 15% | 37 |
| caimano.Furia_Ceca 0.22 | 22 | 13% | 24 |
| mbro.Detektor3 0.1.1 | 11 | 7% | 12 |
| acogdev.alpha 0.2 | 10 | 6% | 11 |
| el.JumpShoot 0.2 | 7 | 4% | 9 |
| fire219.CatBot 1.0 | 5 | 3% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

## Melee bench: F08

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 57.7 | 49 / 210 | 4.80 | 12.3% | 24510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.1% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 13.7% | 22 |
| hadur117.micro.SaorPX8 0.1 | 3.3 | 12.3% | 49 |
| germ.TheMind .2 | 4.3 | 10.4% | 14 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.2% | 12 |
| awesomeness.Elite 1.0 | 6.3 | 8.9% | 10 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.8 | 7.8% | 3 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 53.7 | 9 / 35 | 3706 |
| 2 | 3 | 61.1 | 65.7 | 12 / 35 | 4568 |
| 3 | 3 | 56.7 | 55.9 | 8 / 35 | 3964 |
| 4 | 3 | 59.0 | 61.0 | 7 / 35 | 4464 |
| 5 | 3 | 58.5 | 61.9 | 8 / 35 | 4049 |
| 6 | 4 | 52.3 | 48.3 | 5 / 35 | 3759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 60% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| germ.TheMind .2 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 44 | 27% | 47 |
| simonton.micro.Sprout 1.1.3 | 41 | 25% | 62 |
| stelo.UntouchableNano 1.3 | 23 | 14% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 12% | 28 |
| awesomeness.Elite 1.0 | 18 | 11% | 21 |
| mym.EdgeStalker 1.0 | 6 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 3% | 5 |
| sample.Crazy 1.0 | 3 | 2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 60.5 | 53 / 210 | 4.55 | 12.8% | 22229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 1.3 | 14.4% | 39 |
| hadur117.micro.SaorPX8 0.1 | 2.5 | 12.8% | 53 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 13.2% | 35 |
| maribo.IotaCT 1.1 | 4.0 | 11.3% | 26 |
| timmit.nano.TimDog 0.33 | 5.7 | 10.3% | 21 |
| ratosh.Wesco 1.4 | 6.3 | 9.8% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.8% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 8.9% | 14 |
| spinnercat.Omen 1.0 | 8.8 | 8.2% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 60.6 | 9 / 35 | 3861 |
| 2 | 3 | 59.0 | 62.2 | 8 / 35 | 3524 |
| 3 | 4 | 56.3 | 55.6 | 6 / 35 | 3379 |
| 4 | 2 | 58.6 | 61.0 | 9 / 35 | 3676 |
| 5 | 1 | 60.4 | 63.5 | 12 / 35 | 4055 |
| 6 | 3 | 59.2 | 60.3 | 9 / 35 | 3734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 25 | 88% |
| nz.jdc.nano.GridFu 1.0 | 13 | 92% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| maribo.IotaCT 1.1 | 5 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 48 | 31% | 53 |
| rz.HawkOnFire 0.1 | 25 | 16% | 41 |
| stelo.PatternRobot 1.0 | 25 | 16% | 30 |
| timmit.nano.TimDog 0.33 | 20 | 13% | 23 |
| maribo.IotaCT 1.1 | 19 | 12% | 25 |
| nz.jdc.nano.GridFu 1.0 | 11 | 7% | 26 |
| spinnercat.Omen 1.0 | 6 | 4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 77.7 | 101 / 210 | 3.01 | 16.9% | 32078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.0 | 16.9% | 101 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.1% | 40 |
| baal.nano.N 1.42 | 3.5 | 11.3% | 10 |
| zyx.micro.Ant 1.1 | 3.8 | 11.5% | 29 |
| Grystrion.TrackerWO 1.0 | 4.7 | 10.6% | 14 |
| sanja.First 0.1 | 6.5 | 8.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.7% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.7% | 11 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.3 | 19 / 35 | 5762 |
| 2 | 1 | 63.3 | 72.4 | 14 / 35 | 5114 |
| 3 | 1 | 67.6 | 83.8 | 22 / 35 | 5614 |
| 4 | 1 | 63.3 | 72.7 | 13 / 35 | 4919 |
| 5 | 1 | 66.7 | 82.2 | 17 / 35 | 5527 |
| 6 | 1 | 63.7 | 73.7 | 16 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 26 | 88% |
| zyx.micro.Ant 1.1 | 21 | 81% |
| baal.nano.N 1.42 | 20 | 90% |
| cvt.Firsty 1.0 | 16 | 69% |
| sanja.First 0.1 | 14 | 93% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 7 | 71% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 55 | 50% | 67 |
| cvt.Firsty 1.0 | 17 | 16% | 27 |
| baal.nano.N 1.42 | 11 | 10% | 33 |
| tvv.nano.Polaris 1.2 | 8 | 7% | 27 |
| Grystrion.TrackerWO 1.0 | 8 | 7% | 13 |
| squidM.TentalceMeleeNano 1.1 | 6 | 6% | 14 |
| sanja.First 0.1 | 2 | 2% | 23 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 4 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 60.8 | 46 / 210 | 4.53 | 12.9% | 26144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.3% | 106 |
| cs.Wren 1.0 | 2.5 | 13.1% | 21 |
| hadur117.micro.SaorPX8 0.1 | 2.5 | 12.9% | 46 |
| js.PinBall 1.6 | 4.2 | 11.5% | 19 |
| mz.Cork 0.1 | 4.8 | 11.2% | 6 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 5 |
| evd.X1 0.01 | 6.8 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 61.3 | 8 / 35 | 4467 |
| 2 | 2 | 58.8 | 61.3 | 8 / 35 | 4227 |
| 3 | 3 | 56.2 | 53.3 | 8 / 35 | 4084 |
| 4 | 3 | 58.6 | 63.5 | 10 / 35 | 3895 |
| 5 | 2 | 59.2 | 60.6 | 4 / 35 | 4651 |
| 6 | 2 | 60.5 | 64.8 | 8 / 35 | 4820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 36 | 69% |
| cs.Wren 1.0 | 19 | 74% |
| mz.Cork 0.1 | 5 | 80% |
| js.PinBall 1.6 | 5 | 60% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 164 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 27% | 73 |
| joe.ADinosaur 1.0 | 38 | 23% | 38 |
| cs.Wren 1.0 | 23 | 14% | 31 |
| evd.X1 0.01 | 21 | 13% | 21 |
| js.PinBall 1.6 | 15 | 9% | 19 |
| mz.Cork 0.1 | 12 | 7% | 15 |
| PSW.Relentless 0.1 | 7 | 4% | 8 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 68.6 | 73 / 210 | 3.82 | 14.6% | 23874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.5 | 14.6% | 73 |
| myl.nano.Graviton 1.10 | 2.2 | 12.7% | 39 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 12.1% | 26 |
| ntc.Opposite 1.5 | 4.2 | 11.4% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.7% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 10.0% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 13 |
| DBall.NUKE 0.1 | 8.0 | 7.9% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 15 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 69.8 | 14 / 35 | 4147 |
| 2 | 1 | 60.6 | 65.1 | 15 / 35 | 3808 |
| 3 | 1 | 62.4 | 71.4 | 13 / 35 | 4065 |
| 4 | 1 | 63.2 | 74.9 | 12 / 35 | 4284 |
| 5 | 1 | 64.0 | 76.2 | 13 / 35 | 4248 |
| 6 | 4 | 54.4 | 54.3 | 6 / 35 | 3322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 81% |
| myl.nano.Graviton 1.10 | 18 | 94% |
| ntc.Opposite 1.5 | 9 | 56% |
| disan.Chair 2.2.0 | 9 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 57% |
| DBall.NUKE 0.1 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| donjezza.Muncho 1.0 | 5 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 41 | 30% | 46 |
| myl.nano.Graviton 1.10 | 27 | 20% | 44 |
| ntc.Opposite 1.5 | 25 | 18% | 30 |
| disan.Chair 2.2.0 | 14 | 10% | 19 |
| stelo.AreaTargetingBot 1.1 | 13 | 9% | 35 |
| pbg.R2D2 1.0 | 7 | 5% | 9 |
| donjezza.Muncho 1.0 | 5 | 4% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 3% | 12 |
| DBall.NUKE 0.1 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 62.6 | 40 / 210 | 4.36 | 12.7% | 22220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 14.9% | 62 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 58 |
| hadur117.micro.SaorPX8 0.1 | 3.8 | 12.7% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 25 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 15 |
| ejb.Polaris 1.0.1 | 5.2 | 10.8% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 64.8 | 4 / 35 | 3728 |
| 2 | 4 | 59.1 | 62.2 | 7 / 35 | 3985 |
| 3 | 3 | 58.3 | 60.6 | 6 / 35 | 3671 |
| 4 | 3 | 60.3 | 66.0 | 10 / 35 | 3776 |
| 5 | 4 | 60.7 | 65.4 | 9 / 35 | 3702 |
| 6 | 5 | 56.4 | 56.8 | 4 / 35 | 3358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 15 | 87% |
| oog.melee.Capulet 1.2 | 12 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 83% |
| yagami.Tidus 0.11 | 9 | 100% |
| ejb.Polaris 1.0.1 | 3 | 67% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 23% | 46 |
| yagami.Tidus 0.11 | 36 | 21% | 43 |
| kawigi.micro.Shiz 1.1 | 25 | 15% | 35 |
| ejb.Polaris 1.0.1 | 20 | 12% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 11% | 30 |
| step.nanoPri 1.0 | 15 | 9% | 16 |
| stelo.MirrorNano 1.3 | 14 | 8% | 14 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.5 | 74 / 210 | 3.66 | 14.5% | 23954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.0 | 14.5% | 74 |
| bzdp.Pansy 2.1 | 2.7 | 12.9% | 33 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 42 |
| ratosh.Nobo 0.21 | 4.2 | 11.4% | 19 |
| wompi.Quokka 1.6 | 4.8 | 10.9% | 14 |
| bayen.UbaMicro 1.4 | 6.0 | 10.1% | 17 |
| m3thos.Eva00 1.1 | 6.3 | 9.8% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 67.6 | 14 / 35 | 3994 |
| 2 | 1 | 59.4 | 65.1 | 11 / 35 | 3791 |
| 3 | 1 | 62.2 | 74.6 | 14 / 35 | 3854 |
| 4 | 1 | 62.1 | 73.3 | 12 / 35 | 4044 |
| 5 | 1 | 61.2 | 69.8 | 12 / 35 | 4078 |
| 6 | 1 | 62.2 | 72.4 | 11 / 35 | 4193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 75% |
| wee.Gem 1.8.4 | 19 | 84% |
| wompi.Quokka 1.6 | 10 | 80% |
| m3thos.Eva00 1.1 | 9 | 78% |
| ratosh.Nobo 0.21 | 8 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| bayen.UbaMicro 1.4 | 4 | 50% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 25 | 18% | 33 |
| jeremyreeder.Vincent 2011.12.09 | 21 | 15% | 22 |
| bzdp.Pansy 2.1 | 19 | 14% | 46 |
| ratosh.Nobo 0.21 | 19 | 14% | 26 |
| wee.Gem 1.8.4 | 15 | 11% | 34 |
| m3thos.Eva00 1.1 | 11 | 8% | 16 |
| wompi.Quokka 1.6 | 11 | 8% | 16 |
| stelo.MyAgileRobot 0.2 | 9 | 7% | 10 |
| maribo.FollowFire 1 | 7 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 85.3 | 115 / 210 | 2.32 | 19.8% | 43030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.0 | 19.8% | 115 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 21 |
| exauge.GateKeeper 1.1.121g | 4.0 | 10.3% | 6 |
| ayk.WallHugger 1.0 | 5.5 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.7 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 81.0 | 18 / 35 | 7099 |
| 2 | 1 | 71.4 | 87.9 | 22 / 35 | 7022 |
| 3 | 1 | 71.2 | 86.0 | 21 / 35 | 7134 |
| 4 | 1 | 69.3 | 83.8 | 15 / 35 | 6678 |
| 5 | 1 | 72.9 | 91.7 | 23 / 35 | 7866 |
| 6 | 1 | 70.0 | 81.6 | 16 / 35 | 7231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 101 | 78% |
| mz.NanoGod 2.02 | 18 | 56% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| ayk.WallHugger 1.0 | 10 | 90% |
| stuff.Vlad 0.1 | 4 | 75% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 0% |

Hadur died in 95 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 31% | 108 |
| mz.NanoGod 2.02 | 28 | 29% | 39 |
| exauge.GateKeeper 1.1.121g | 16 | 17% | 23 |
| ayk.WallHugger 1.0 | 12 | 13% | 22 |
| stuff.Vlad 0.1 | 4 | 4% | 8 |
| drd.Dreadknoght 0.9 | 3 | 3% | 7 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |

## Melee bench: F16

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.5 | 90 / 210 | 3.65 | 15.2% | 26514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.0 | 15.2% | 90 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.8% | 24 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.5% | 24 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.2% | 23 |
| conscience.Electron 1.3g | 6.5 | 8.6% | 2 |
| stelo.MirrorMicro 1.0 | 6.5 | 8.9% | 9 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 14 |
| dl.BetterWalls 1.0 | 9.3 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 70.8 | 16 / 35 | 4433 |
| 2 | 1 | 63.2 | 71.4 | 16 / 35 | 4745 |
| 3 | 1 | 63.5 | 72.1 | 14 / 35 | 4889 |
| 4 | 1 | 61.0 | 68.3 | 14 / 35 | 4254 |
| 5 | 1 | 60.5 | 66.3 | 14 / 35 | 4070 |
| 6 | 1 | 63.1 | 74.3 | 16 / 35 | 4123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 96% |
| dummy.micro.Sparrow 2.5 | 23 | 83% |
| bvh.micro.Freya 0.3 | 12 | 83% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 24 | 20% | 25 |
| voidious.micro.BlitzBat 1.05 | 21 | 18% | 50 |
| dummy.micro.Sparrow 2.5 | 18 | 15% | 33 |
| dl.BetterWalls 1.0 | 15 | 13% | 18 |
| bvh.micro.Freya 0.3 | 14 | 12% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 11% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 8% | 11 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 14 |

## Melee bench: F17

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.4 | 74 / 210 | 3.76 | 15.7% | 33378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.5 | 15.8% | 40 |
| hadur117.micro.SaorPX8 0.1 | 1.7 | 15.7% | 74 |
| supersample.SuperBoxBot 1.0 | 3.3 | 12.9% | 34 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 22 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 6 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.4% | 12 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.8% | 10 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.5% | 6 |
| sample.Corners 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 73.3 | 11 / 35 | 5749 |
| 2 | 2 | 63.4 | 67.0 | 11 / 35 | 5642 |
| 3 | 1 | 62.9 | 66.7 | 12 / 35 | 5508 |
| 4 | 2 | 63.5 | 68.9 | 12 / 35 | 5597 |
| 5 | 2 | 62.9 | 69.5 | 13 / 35 | 5046 |
| 6 | 1 | 64.8 | 70.8 | 15 / 35 | 5836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 27 | 74% |
| sul.Lunar 1.1 | 23 | 100% |
| supersample.SuperBoxBot 1.0 | 18 | 67% |
| dsw.StaticD 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| mme.NikeEnhanced 2.0 | 3 | 67% |

Hadur died in 136 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 43 | 32% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 22% | 49 |
| dsw.StaticD 1.0 | 13 | 10% | 21 |
| mme.NikeEnhanced 2.0 | 13 | 10% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 10 | 7% | 17 |
| sample.Corners 1.0 | 10 | 7% | 11 |
| sul.Lunar 1.1 | 8 | 6% | 31 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.micro.SaorPX8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 64.2 | 61 / 210 | 4.22 | 13.9% | 29049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX8 0.1 | 1.2 | 13.9% | 61 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.7% | 34 |
| mld.Wisdom 1.0 | 3.5 | 12.2% | 23 |
| amz.NanoClone 1.41 | 4.7 | 10.7% | 17 |
| KiraNL.Chupacabra 0.4 | 5.8 | 10.6% | 14 |
| sample.Walls 1.0 | 7.2 | 9.0% | 17 |
| jangs.ns51 1.0 | 8.3 | 6.9% | 7 |
| GarmBox.Oranges 1.0 | 8.5 | 7.1% | 1 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.7 | 66.0 | 11 / 35 | 4698 |
| 2 | 1 | 59.1 | 59.4 | 9 / 35 | 4956 |
| 3 | 2 | 59.0 | 62.2 | 11 / 35 | 4418 |
| 4 | 1 | 62.6 | 71.1 | 11 / 35 | 5103 |
| 5 | 1 | 60.6 | 64.8 | 8 / 35 | 4995 |
| 6 | 1 | 59.3 | 61.9 | 11 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 79% |
| radnor.DoctorBob 1.42 | 16 | 56% |
| mld.Wisdom 1.0 | 12 | 58% |
| amz.NanoClone 1.41 | 8 | 100% |
| sample.Walls 1.0 | 5 | 60% |
| KiraNL.Chupacabra 0.4 | 5 | 40% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 22% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 18% | 48 |
| sample.Walls 1.0 | 23 | 15% | 31 |
| amz.NanoClone 1.41 | 18 | 12% | 22 |
| radnor.DoctorBob 1.42 | 17 | 11% | 31 |
| KiraNL.Chupacabra 0.4 | 15 | 10% | 18 |
| jangs.ns51 1.0 | 8 | 5% | 10 |
| GarmBox.Oranges 1.0 | 8 | 5% | 9 |

