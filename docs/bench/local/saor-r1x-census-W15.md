# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 90.1 | 158 / 210 | 1.90 | 21.3% | 42054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 21.3% | 158 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 16 |
| radnor.DoctorBob 1.42 | 2.7 | 14.3% | 20 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 3 |
| sample.Walls 1.0 | 6.5 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.4 | 26 / 35 | 6732 |
| 2 | 1 | 72.8 | 92.4 | 28 / 35 | 6969 |
| 3 | 1 | 71.7 | 87.6 | 27 / 35 | 6923 |
| 4 | 1 | 71.0 | 85.7 | 24 / 35 | 6755 |
| 5 | 1 | 72.2 | 89.2 | 26 / 35 | 7002 |
| 6 | 1 | 73.3 | 93.0 | 27 / 35 | 7673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 78 | 92% |
| radnor.DoctorBob 1.42 | 39 | 85% |
| mld.Infinity 2.2 | 32 | 100% |
| amz.NanoClone 1.41 | 8 | 88% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 34% | 52 |
| mz.AntiGrav 1.0 | 14 | 26% | 70 |
| amz.NanoClone 1.41 | 7 | 13% | 18 |
| mld.Infinity 2.2 | 6 | 11% | 42 |
| GarmBox.Oranges 1.0 | 4 | 8% | 5 |
| sample.Walls 1.0 | 3 | 6% | 10 |
| jangs.ns51 1.0 | 1 | 2% | 10 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.2 | 134 / 210 | 2.15 | 18.8% | 31310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.8% | 134 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.3% | 43 |
| mld.DustBunny 3.8 | 2.8 | 13.4% | 13 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.6% | 3 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.9% | 8 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.0 | 26 / 35 | 5294 |
| 2 | 1 | 69.9 | 91.4 | 24 / 35 | 5869 |
| 3 | 1 | 68.7 | 87.3 | 22 / 35 | 5513 |
| 4 | 1 | 66.6 | 79.7 | 17 / 35 | 4969 |
| 5 | 1 | 66.0 | 82.9 | 18 / 35 | 4625 |
| 6 | 1 | 69.5 | 89.2 | 27 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 83% |
| mld.DustBunny 3.8 | 45 | 87% |
| maribo.melee.BMV 0.1 | 15 | 73% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 23 | 30% | 70 |
| oog.melee.Mercutio 1.0 | 19 | 25% | 67 |
| fullsail.SweetTea 1.1 | 8 | 10% | 14 |
| maribo.melee.BMV 0.1 | 7 | 9% | 13 |
| zyx.nano.Ant 1.1 | 7 | 9% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 8% | 13 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 15 |
| cs.Grudge 1.0 | 3 | 4% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.1 | 103 / 210 | 2.97 | 18.1% | 34735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.1% | 103 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 46 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 13 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.5% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.5% | 23 |
| fm.mammillarias 1.3 | 5.2 | 10.0% | 9 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 5 |
| sample.Fire 1.0 | 9.3 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.0 | 17 / 35 | 5599 |
| 2 | 1 | 68.8 | 83.2 | 20 / 35 | 5810 |
| 3 | 1 | 64.4 | 69.2 | 13 / 35 | 5442 |
| 4 | 1 | 70.2 | 84.1 | 22 / 35 | 6414 |
| 5 | 1 | 69.3 | 83.2 | 19 / 35 | 6293 |
| 6 | 1 | 64.0 | 68.3 | 12 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 39 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 88% |
| cb.nano.Insomnia 1.0 | 24 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 30 | 28% | 44 |
| myl.micro.Troodon 1.10 | 28 | 26% | 70 |
| cb.nano.Insomnia 1.0 | 22 | 21% | 26 |
| fm.mammillarias 1.3 | 14 | 13% | 19 |
| myl.nano.KomoriNinja 1.1 | 8 | 7% | 29 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 10 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.0 | 138 / 210 | 2.08 | 20.4% | 38940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 20.4% | 138 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.8% | 26 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.3% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.4% | 4 |
| tj.zombie1n 1.0.1 | 5.7 | 8.4% | 6 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.6% | 5 |
| repositorio.NanoStep 1.0 | 8.5 | 6.9% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 26 / 35 | 6957 |
| 2 | 1 | 71.1 | 92.7 | 25 / 35 | 6481 |
| 3 | 1 | 70.1 | 90.8 | 22 / 35 | 6155 |
| 4 | 1 | 68.9 | 83.2 | 19 / 35 | 6184 |
| 5 | 1 | 70.4 | 87.0 | 25 / 35 | 6821 |
| 6 | 1 | 68.6 | 82.2 | 21 / 35 | 6342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 83% |
| stelo.SoJNanoMelee 1.1 | 43 | 79% |
| tvv.micro.Antares 1.1.1 | 22 | 91% |
| tj.zombie1n 1.0.1 | 12 | 75% |
| yk.JahMicro 1.0 | 11 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 88% |
| sample.VelociRobot 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 83% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 35% | 74 |
| stelo.SoJNanoMelee 1.1 | 18 | 25% | 42 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 11% | 13 |
| tvv.micro.Antares 1.1.1 | 7 | 10% | 30 |
| tj.zombie1n 1.0.1 | 7 | 10% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 12 |
| yk.JahMicro 1.0 | 1 | 1% | 10 |
| repositorio.NanoStep 1.0 | 1 | 1% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F05

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 67.6 | 70 / 210 | 3.92 | 15.1% | 28543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 15.1% | 70 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 37 |
| ahf.NanoAndrew .4 | 3.3 | 11.8% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.0% | 28 |
| sam.Samspin 1.0 | 5.7 | 9.7% | 16 |
| robar.nano.Assertive_Melee 0.2 | 5.7 | 9.6% | 12 |
| EBBU.Sim2 1.02 | 6.3 | 9.7% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.9 | 63.8 | 9 / 35 | 3904 |
| 2 | 1 | 62.6 | 66.3 | 14 / 35 | 5074 |
| 3 | 1 | 65.9 | 76.5 | 16 / 35 | 5489 |
| 4 | 1 | 61.4 | 65.4 | 10 / 35 | 4440 |
| 5 | 1 | 63.3 | 70.8 | 11 / 35 | 4865 |
| 6 | 1 | 61.1 | 62.5 | 10 / 35 | 4771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 63% |
| simonton.nano.MeleeSeed 1.8 | 28 | 93% |
| ahf.NanoAndrew .4 | 14 | 57% |
| sam.Samspin 1.0 | 9 | 67% |
| robar.nano.Assertive_Melee 0.2 | 7 | 43% |
| EBBU.Sim2 1.02 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 27 | 19% | 33 |
| oog.melee.Corsair 1.0 | 24 | 17% | 50 |
| ahf.NanoAndrew .4 | 16 | 11% | 23 |
| EBBU.Sim2 1.02 | 16 | 11% | 19 |
| zyx.nano.BacillusComma 1.0 | 15 | 11% | 19 |
| simonton.nano.MeleeSeed 1.8 | 14 | 10% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 10% | 14 |
| sam.Samspin 1.0 | 12 | 9% | 17 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.4 | 120 / 210 | 2.40 | 18.5% | 31307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.5% | 120 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 40 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.1% | 18 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.9% | 4 |
| fm.claire 1.7 | 6.3 | 8.5% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.5% | 9 |
| sample.SpinBot 1.0 | 7.5 | 7.6% | 4 |
| pa.Improved 1.0 | 9.2 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 19 / 35 | 5378 |
| 2 | 1 | 68.3 | 85.1 | 20 / 35 | 5343 |
| 3 | 1 | 67.1 | 82.9 | 18 / 35 | 5027 |
| 4 | 1 | 69.2 | 87.0 | 24 / 35 | 5448 |
| 5 | 1 | 66.7 | 82.9 | 20 / 35 | 4547 |
| 6 | 1 | 67.9 | 84.1 | 19 / 35 | 5564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 85% |
| oog.melee.CapuletDroid 1.1 | 26 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 90 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 36% | 86 |
| oog.melee.CapuletDroid 1.1 | 13 | 14% | 42 |
| gh.nano.Grofvuil 0.2 | 11 | 12% | 23 |
| arthord.NanoSatanMelee Beta | 10 | 11% | 19 |
| fm.claire 1.7 | 10 | 11% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 11 |
| sample.SpinBot 1.0 | 4 | 4% | 9 |
| kurios.DOSexe .9b | 3 | 3% | 6 |
| pa.Improved 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.9 | 96 / 210 | 2.80 | 17.7% | 33642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 17.7% | 96 |
| gh.micro.Gruweltje 0.7 | 2.0 | 14.7% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.9% | 30 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 30 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 9 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 1 |
| el.JumpShoot 0.2 | 8.3 | 6.2% | 3 |
| mbro.Detektor3 0.1.1 | 8.5 | 6.1% | 2 |
| fire219.CatBot 1.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.5 | 17 / 35 | 5782 |
| 2 | 1 | 64.8 | 75.9 | 11 / 35 | 5113 |
| 3 | 1 | 65.6 | 74.3 | 13 / 35 | 5723 |
| 4 | 1 | 67.7 | 81.9 | 16 / 35 | 5926 |
| 5 | 1 | 68.6 | 84.1 | 21 / 35 | 5677 |
| 6 | 1 | 67.0 | 81.0 | 18 / 35 | 5421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 43 | 84% |
| mz.MicroGodMelee 1 | 35 | 71% |
| gh.micro.Gruweltje 0.7 | 25 | 72% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 27 | 23% | 49 |
| spinnercat.micro.Tyger 0.1 | 25 | 22% | 60 |
| mz.MicroGodMelee 1 | 25 | 22% | 49 |
| acogdev.alpha 0.2 | 12 | 10% | 12 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 13 |
| el.JumpShoot 0.2 | 7 | 6% | 10 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 3 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.9 | 85 / 210 | 3.80 | 15.4% | 29229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.5 | 15.4% | 85 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.6% | 47 |
| germ.TheMind .2 | 4.7 | 9.7% | 4 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 9 |
| awesomeness.Elite 1.0 | 6.5 | 8.5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 4 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 7 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 63.2 | 12 / 35 | 4760 |
| 2 | 1 | 65.3 | 75.6 | 15 / 35 | 5130 |
| 3 | 1 | 65.2 | 72.7 | 19 / 35 | 5081 |
| 4 | 2 | 61.9 | 68.9 | 14 / 35 | 4150 |
| 5 | 2 | 60.7 | 63.8 | 9 / 35 | 4865 |
| 6 | 1 | 64.0 | 69.5 | 16 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 72% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| germ.TheMind .2 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 40% | 86 |
| germ.TheMind .2 | 22 | 18% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 16% | 40 |
| stelo.UntouchableNano 1.3 | 13 | 10% | 18 |
| awesomeness.Elite 1.0 | 12 | 10% | 17 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.0 | 118 / 210 | 2.71 | 17.7% | 27358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 17.7% | 118 |
| rz.HawkOnFire 0.1 | 2.3 | 13.3% | 27 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.7% | 21 |
| maribo.IotaCT 1.1 | 4.3 | 11.0% | 14 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.9% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.9% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 8.1% | 10 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.4 | 21 / 35 | 5028 |
| 2 | 1 | 65.1 | 77.1 | 15 / 35 | 4148 |
| 3 | 1 | 69.2 | 85.7 | 23 / 35 | 4915 |
| 4 | 1 | 64.9 | 74.3 | 16 / 35 | 4293 |
| 5 | 1 | 65.5 | 75.6 | 17 / 35 | 4383 |
| 6 | 1 | 69.4 | 88.6 | 26 / 35 | 4591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 49 | 94% |
| nz.jdc.nano.GridFu 1.0 | 40 | 88% |
| maribo.IotaCT 1.1 | 13 | 77% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| spinnercat.Omen 1.0 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 5 | 40% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 22 | 24% | 28 |
| rz.HawkOnFire 0.1 | 20 | 22% | 59 |
| nz.jdc.nano.GridFu 1.0 | 15 | 16% | 47 |
| timmit.nano.TimDog 0.33 | 13 | 14% | 18 |
| stelo.PatternRobot 1.0 | 10 | 11% | 20 |
| maribo.IotaCT 1.1 | 7 | 8% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 13 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.8 | 143 / 210 | 2.28 | 19.6% | 35213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 19.6% | 143 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.4% | 31 |
| baal.nano.N 1.42 | 2.8 | 11.5% | 6 |
| zyx.micro.Ant 1.1 | 4.0 | 10.2% | 12 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.7% | 2 |
| sanja.First 0.1 | 6.5 | 8.7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.8% | 2 |
| cvt.Firsty 1.0 | 7.7 | 7.7% | 8 |
| amk.Punbot.Punbot 0.01 | 9.0 | 6.5% | 3 |
| sample.RamFire 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.3 | 25 / 35 | 5768 |
| 2 | 1 | 69.7 | 87.6 | 24 / 35 | 5961 |
| 3 | 1 | 70.1 | 88.9 | 25 / 35 | 6065 |
| 4 | 1 | 68.3 | 81.6 | 23 / 35 | 5850 |
| 5 | 1 | 68.1 | 83.5 | 21 / 35 | 5689 |
| 6 | 1 | 69.2 | 86.0 | 25 / 35 | 5880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 97% |
| tvv.nano.Polaris 1.2 | 28 | 89% |
| cvt.Firsty 1.0 | 26 | 88% |
| zyx.micro.Ant 1.1 | 22 | 86% |
| sanja.First 0.1 | 18 | 83% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| amk.Punbot.Punbot 0.01 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 28 | 42% | 50 |
| cvt.Firsty 1.0 | 12 | 18% | 25 |
| tvv.nano.Polaris 1.2 | 8 | 12% | 48 |
| sanja.First 0.1 | 6 | 9% | 23 |
| Grystrion.TrackerWO 1.0 | 5 | 7% | 18 |
| squidM.TentalceMeleeNano 1.1 | 4 | 6% | 10 |
| baal.nano.N 1.42 | 2 | 3% | 29 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 3 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.1 | 79 / 210 | 4.05 | 15.0% | 30575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.4% | 73 |
| hadur117.micro.SaorW15 0.1 | 1.7 | 15.0% | 79 |
| cs.Wren 1.0 | 3.0 | 12.6% | 20 |
| js.PinBall 1.6 | 4.3 | 11.2% | 12 |
| mz.Cork 0.1 | 5.0 | 10.9% | 6 |
| joe.ADinosaur 1.0 | 5.8 | 9.7% | 4 |
| evd.X1 0.01 | 6.8 | 8.3% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 8 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 69.8 | 15 / 35 | 5258 |
| 2 | 2 | 62.5 | 66.3 | 15 / 35 | 5054 |
| 3 | 2 | 64.0 | 69.2 | 12 / 35 | 5532 |
| 4 | 1 | 63.9 | 70.8 | 14 / 35 | 5203 |
| 5 | 2 | 59.1 | 57.1 | 11 / 35 | 4875 |
| 6 | 2 | 60.9 | 63.2 | 12 / 35 | 4653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 76% |
| cs.Wren 1.0 | 22 | 86% |
| mz.Cork 0.1 | 9 | 100% |
| joe.ADinosaur 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 75% |
| js.PinBall 1.6 | 4 | 50% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 39 | 30% | 85 |
| evd.X1 0.01 | 30 | 23% | 32 |
| joe.ADinosaur 1.0 | 23 | 18% | 26 |
| PSW.Relentless 0.1 | 11 | 8% | 11 |
| cs.Wren 1.0 | 10 | 8% | 25 |
| mz.Cork 0.1 | 7 | 5% | 13 |
| js.PinBall 1.6 | 7 | 5% | 10 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.0 | 113 / 210 | 2.62 | 18.1% | 28524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.1% | 113 |
| myl.nano.Graviton 1.10 | 2.3 | 12.2% | 30 |
| ntc.Opposite 1.5 | 3.0 | 11.8% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.7% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.9% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 9 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 8 |
| donjezza.Muncho 1.0 | 9.5 | 5.6% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.8 | 17 / 35 | 4740 |
| 2 | 1 | 64.3 | 76.2 | 13 / 35 | 4268 |
| 3 | 1 | 66.9 | 79.7 | 20 / 35 | 4843 |
| 4 | 1 | 66.7 | 80.6 | 19 / 35 | 4592 |
| 5 | 1 | 70.5 | 91.4 | 24 / 35 | 5286 |
| 6 | 1 | 66.7 | 80.3 | 20 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 78% |
| stelo.AreaTargetingBot 1.1 | 30 | 73% |
| ntc.Opposite 1.5 | 17 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| disan.Chair 2.2.0 | 14 | 79% |
| DBall.NUKE 0.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 7 | 71% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 99 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 23 | 23% | 47 |
| stelo.AreaTargetingBot 1.1 | 16 | 16% | 38 |
| pfvicm.Sobieski 7.2.3b | 16 | 16% | 25 |
| ntc.Opposite 1.5 | 16 | 16% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 21 |
| disan.Chair 2.2.0 | 6 | 6% | 18 |
| DBall.NUKE 0.1 | 5 | 5% | 22 |
| pbg.R2D2 1.0 | 3 | 3% | 8 |
| donjezza.Muncho 1.0 | 3 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.1 | 80 / 210 | 3.60 | 15.3% | 25488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.5 | 15.3% | 80 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 39 |
| oog.melee.Capulet 1.2 | 2.8 | 13.6% | 41 |
| yagami.Tidus 0.11 | 3.5 | 12.9% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 12.0% | 18 |
| ejb.Polaris 1.0.1 | 5.8 | 10.1% | 9 |
| step.nanoPri 1.0 | 7.5 | 7.3% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 73.7 | 14 / 35 | 4164 |
| 2 | 1 | 64.1 | 72.1 | 12 / 35 | 4483 |
| 3 | 4 | 60.4 | 61.0 | 10 / 35 | 4134 |
| 4 | 1 | 63.1 | 70.5 | 12 / 35 | 4289 |
| 5 | 1 | 66.8 | 82.2 | 21 / 35 | 4162 |
| 6 | 1 | 62.9 | 67.0 | 11 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 29 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 74% |
| oog.melee.Capulet 1.2 | 21 | 81% |
| yagami.Tidus 0.11 | 15 | 87% |
| ejb.Polaris 1.0.1 | 7 | 71% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 26% | 54 |
| yagami.Tidus 0.11 | 24 | 18% | 36 |
| kawigi.micro.Shiz 1.1 | 20 | 15% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 13% | 37 |
| ejb.Polaris 1.0.1 | 10 | 8% | 16 |
| step.nanoPri 1.0 | 10 | 8% | 11 |
| kurios.DOSexe .9a | 8 | 6% | 8 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |

## Melee bench: F14

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.6 | 110 / 210 | 2.92 | 17.0% | 27135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 17.0% | 110 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 22 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 29 |
| ratosh.Nobo 0.21 | 4.2 | 11.1% | 18 |
| wompi.Quokka 1.6 | 4.5 | 11.4% | 13 |
| m3thos.Eva00 1.1 | 5.3 | 10.0% | 10 |
| bayen.UbaMicro 1.4 | 7.3 | 8.3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 8.5 | 6.3% | 4 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 79.4 | 18 / 35 | 4109 |
| 2 | 1 | 66.4 | 80.3 | 21 / 35 | 4607 |
| 3 | 1 | 66.2 | 81.3 | 20 / 35 | 4522 |
| 4 | 1 | 66.5 | 82.5 | 19 / 35 | 4496 |
| 5 | 1 | 65.3 | 76.8 | 18 / 35 | 4640 |
| 6 | 1 | 63.5 | 71.4 | 14 / 35 | 4761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 86% |
| wee.Gem 1.8.4 | 34 | 91% |
| wompi.Quokka 1.6 | 19 | 89% |
| ratosh.Nobo 0.21 | 11 | 73% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 19 | 19% | 25 |
| wompi.Quokka 1.6 | 17 | 17% | 27 |
| bayen.UbaMicro 1.4 | 16 | 16% | 20 |
| bzdp.Pansy 2.1 | 14 | 14% | 49 |
| wee.Gem 1.8.4 | 8 | 8% | 43 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 8% | 12 |
| stelo.MyAgileRobot 0.2 | 8 | 8% | 9 |
| maribo.FollowFire 1 | 6 | 6% | 8 |
| m3thos.Eva00 1.1 | 4 | 4% | 16 |

## Melee bench: F15

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.1 | 127 / 210 | 2.16 | 20.8% | 44821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 20.8% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 22 |
| ayk.WallHugger 1.0 | 4.3 | 10.2% | 0 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.3 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.5 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 88.9 | 23 / 35 | 7261 |
| 2 | 1 | 72.5 | 86.3 | 20 / 35 | 7871 |
| 3 | 1 | 70.6 | 86.0 | 19 / 35 | 6543 |
| 4 | 1 | 70.2 | 81.0 | 19 / 35 | 6968 |
| 5 | 1 | 73.7 | 93.0 | 23 / 35 | 8172 |
| 6 | 1 | 72.5 | 87.6 | 23 / 35 | 8006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 82% |
| ayk.WallHugger 1.0 | 12 | 100% |
| mz.NanoGod 2.02 | 11 | 73% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 42% | 121 |
| mz.NanoGod 2.02 | 28 | 34% | 36 |
| exauge.GateKeeper 1.1.121g | 8 | 10% | 18 |
| ayk.WallHugger 1.0 | 5 | 6% | 14 |
| stuff.Vlad 0.1 | 4 | 5% | 6 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 9 |

## Melee bench: F16

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.8 | 98 / 210 | 3.54 | 16.3% | 29066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 16.3% | 98 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.1% | 21 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 30 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.3% | 19 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 3 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 20 / 35 | 4883 |
| 2 | 1 | 65.9 | 76.2 | 19 / 35 | 4910 |
| 3 | 1 | 65.8 | 75.2 | 19 / 35 | 5213 |
| 4 | 1 | 62.4 | 66.7 | 12 / 35 | 4765 |
| 5 | 1 | 64.1 | 72.4 | 16 / 35 | 4604 |
| 6 | 1 | 61.3 | 61.6 | 12 / 35 | 4691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 86% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 83% |
| bvh.micro.Freya 0.3 | 15 | 87% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 4 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 23% | 57 |
| conscience.Electron 1.3g | 18 | 16% | 20 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 34 |
| bvh.micro.Freya 0.3 | 14 | 13% | 27 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 10 |
| dl.BetterWalls 1.0 | 3 | 3% | 5 |

## Melee bench: F17

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.0 | 128 / 210 | 2.26 | 20.0% | 39151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 20.0% | 128 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.3% | 29 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.7% | 17 |
| sul.Lunar 1.1 | 3.7 | 11.7% | 17 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 11 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 1 |
| sample.Corners 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 80.6 | 20 / 35 | 5555 |
| 2 | 1 | 68.7 | 80.6 | 16 / 35 | 6557 |
| 3 | 1 | 70.5 | 85.7 | 23 / 35 | 6897 |
| 4 | 1 | 70.6 | 90.2 | 23 / 35 | 6538 |
| 5 | 1 | 70.8 | 88.9 | 23 / 35 | 6305 |
| 6 | 1 | 71.5 | 90.2 | 23 / 35 | 7299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 37 | 81% |
| sul.Lunar 1.1 | 37 | 97% |
| supersample.SuperBoxBot 1.0 | 28 | 86% |
| dsw.StaticD 1.0 | 16 | 56% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 33 | 40% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 21% | 50 |
| dsw.StaticD 1.0 | 10 | 12% | 21 |
| mme.NikeEnhanced 2.0 | 9 | 11% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 5% | 14 |
| sample.Corners 1.0 | 3 | 4% | 9 |
| sul.Lunar 1.1 | 2 | 2% | 40 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.5 | 98 / 210 | 3.11 | 17.3% | 35335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 17.3% | 98 |
| radnor.DoctorBob 1.42 | 3.0 | 12.8% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.3% | 32 |
| mld.Wisdom 1.0 | 3.7 | 11.6% | 14 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 10 |
| amz.NanoClone 1.41 | 5.2 | 10.2% | 14 |
| sample.Walls 1.0 | 7.2 | 8.1% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 6 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 80.6 | 16 / 35 | 6532 |
| 2 | 1 | 66.5 | 75.9 | 17 / 35 | 5941 |
| 3 | 1 | 66.2 | 78.1 | 17 / 35 | 5894 |
| 4 | 1 | 63.8 | 68.3 | 14 / 35 | 5743 |
| 5 | 1 | 63.2 | 66.7 | 14 / 35 | 5305 |
| 6 | 1 | 69.4 | 89.5 | 20 / 35 | 5920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 80% |
| radnor.DoctorBob 1.42 | 27 | 78% |
| mld.Wisdom 1.0 | 21 | 76% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| amz.NanoClone 1.41 | 8 | 63% |
| sample.Walls 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 25% | 49 |
| KiraNL.Chupacabra 0.4 | 20 | 18% | 28 |
| radnor.DoctorBob 1.42 | 16 | 14% | 37 |
| amz.NanoClone 1.41 | 15 | 13% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 44 |
| GarmBox.Oranges 1.0 | 8 | 7% | 11 |
| jangs.ns51 1.0 | 7 | 6% | 9 |
| sample.Walls 1.0 | 4 | 4% | 13 |

