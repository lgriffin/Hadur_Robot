# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 89.4 | 147 / 210 | 1.95 | 21.3% | 42527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.3% | 147 |
| mz.AntiGrav 1.0 | 2.7 | 13.7% | 9 |
| radnor.DoctorBob 1.42 | 3.0 | 13.5% | 19 |
| mld.Infinity 2.2 | 3.3 | 13.3% | 28 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| sample.Walls 1.0 | 6.7 | 7.1% | 3 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 0 |
| sample.Target 1.0 | 9.3 | 4.1% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 88.9 | 25 / 35 | 6896 |
| 2 | 1 | 71.5 | 86.0 | 25 / 35 | 7200 |
| 3 | 1 | 73.1 | 90.5 | 26 / 35 | 7311 |
| 4 | 1 | 72.3 | 90.8 | 23 / 35 | 7085 |
| 5 | 1 | 71.8 | 90.5 | 24 / 35 | 6971 |
| 6 | 1 | 72.2 | 89.8 | 24 / 35 | 7064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 94% |
| mld.Infinity 2.2 | 37 | 89% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| amz.NanoClone 1.41 | 10 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 38% | 61 |
| mz.AntiGrav 1.0 | 15 | 24% | 69 |
| mld.Infinity 2.2 | 11 | 17% | 49 |
| amz.NanoClone 1.41 | 8 | 13% | 14 |
| GarmBox.Oranges 1.0 | 3 | 5% | 6 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| jangs.ns51 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.9 | 132 / 210 | 2.54 | 18.4% | 31531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 18.4% | 132 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 42 |
| mld.DustBunny 3.8 | 2.5 | 14.1% | 19 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.0% | 8 |
| maribo.melee.BMV 0.1 | 5.2 | 9.6% | 4 |
| zyx.nano.Ant 1.1 | 6.5 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 3 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 26 / 35 | 5196 |
| 2 | 1 | 66.9 | 81.3 | 17 / 35 | 4836 |
| 3 | 1 | 71.6 | 96.5 | 30 / 35 | 5876 |
| 4 | 1 | 67.4 | 81.6 | 23 / 35 | 5178 |
| 5 | 1 | 69.2 | 87.6 | 23 / 35 | 5515 |
| 6 | 2 | 62.2 | 61.6 | 13 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 60 | 87% |
| oog.melee.Mercutio 1.0 | 56 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 100% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 28 | 35% | 83 |
| oog.melee.Mercutio 1.0 | 21 | 27% | 62 |
| djdjdj.NanoSkunk10 1.0 | 8 | 10% | 16 |
| cs.Grudge 1.0 | 6 | 8% | 6 |
| maribo.melee.BMV 0.1 | 5 | 6% | 13 |
| fullsail.SweetTea 1.1 | 3 | 4% | 10 |
| zyx.nano.Ant 1.1 | 3 | 4% | 7 |
| bzdp.BoxCar 2.0 | 3 | 4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 3% | 8 |

## Melee bench: F03

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 81.6 | 130 / 210 | 2.65 | 19.4% | 36283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.4% | 130 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.0% | 20 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.7% | 7 |
| fm.mammillarias 1.3 | 6.2 | 8.9% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 1 |
| sample.Fire 1.0 | 9.0 | 5.3% | 3 |
| sample.Tracker 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 85.4 | 22 / 35 | 6049 |
| 2 | 1 | 69.4 | 83.5 | 20 / 35 | 6547 |
| 3 | 1 | 69.1 | 82.5 | 22 / 35 | 5978 |
| 4 | 1 | 70.8 | 85.4 | 25 / 35 | 6457 |
| 5 | 1 | 68.1 | 77.8 | 21 / 35 | 5357 |
| 6 | 1 | 67.7 | 75.2 | 20 / 35 | 5895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 72% |
| cb.nano.Insomnia 1.0 | 16 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 100% |
| myl.nano.KomoriNinja 1.1 | 12 | 67% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 30% | 47 |
| myl.micro.Troodon 1.10 | 13 | 16% | 70 |
| cb.nano.Insomnia 1.0 | 13 | 16% | 14 |
| fm.mammillarias 1.3 | 12 | 15% | 20 |
| myl.nano.KomoriNinja 1.1 | 10 | 12% | 27 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 17 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 9 |
| sample.Fire 1.0 | 2 | 2% | 5 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.4 | 155 / 210 | 2.13 | 20.7% | 38643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.7% | 155 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.0% | 17 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.3% | 9 |
| yk.JahMicro 1.0 | 5.2 | 8.8% | 2 |
| tj.zombie1n 1.0.1 | 5.5 | 9.1% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.9% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.2% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.6 | 29 / 35 | 6522 |
| 2 | 1 | 69.4 | 84.4 | 23 / 35 | 6149 |
| 3 | 1 | 71.9 | 90.8 | 31 / 35 | 6778 |
| 4 | 1 | 71.8 | 93.0 | 25 / 35 | 6818 |
| 5 | 1 | 68.6 | 81.3 | 22 / 35 | 5881 |
| 6 | 1 | 70.2 | 86.3 | 25 / 35 | 6495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 91% |
| stelo.SoJNanoMelee 1.1 | 47 | 89% |
| tj.zombie1n 1.0.1 | 18 | 94% |
| yk.JahMicro 1.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| tvv.micro.Antares 1.1.1 | 10 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 38% | 83 |
| stelo.SoJNanoMelee 1.1 | 10 | 18% | 35 |
| yk.JahMicro 1.0 | 7 | 13% | 15 |
| tj.zombie1n 1.0.1 | 5 | 9% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 20 |
| repositorio.NanoStep 1.0 | 4 | 7% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 6 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 21 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.3 | 89 / 210 | 3.86 | 15.8% | 28896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 15.8% | 89 |
| oog.melee.Corsair 1.0 | 2.3 | 13.2% | 44 |
| ahf.NanoAndrew .4 | 3.5 | 11.6% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.6% | 23 |
| EBBU.Sim2 1.02 | 5.0 | 10.2% | 5 |
| sam.Samspin 1.0 | 6.2 | 9.7% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 61.6 | 13 / 35 | 4872 |
| 2 | 1 | 63.9 | 68.9 | 17 / 35 | 4841 |
| 3 | 1 | 64.3 | 71.4 | 14 / 35 | 4930 |
| 4 | 1 | 64.5 | 72.7 | 13 / 35 | 4910 |
| 5 | 1 | 63.4 | 67.6 | 19 / 35 | 4442 |
| 6 | 1 | 63.4 | 67.3 | 13 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 84% |
| oog.melee.Corsair 1.0 | 32 | 63% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 13 | 100% |
| EBBU.Sim2 1.02 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |

Hadur died in 122 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 22% | 46 |
| oog.melee.Corsair 1.0 | 21 | 17% | 47 |
| ahf.NanoAndrew .4 | 17 | 14% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13% | 16 |
| EBBU.Sim2 1.02 | 11 | 9% | 18 |
| sam.Samspin 1.0 | 10 | 8% | 19 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7 | 6% | 10 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.1 | 143 / 210 | 2.25 | 19.4% | 33215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.4% | 143 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.9% | 23 |
| gh.nano.Grofvuil 0.2 | 2.8 | 11.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.1% | 13 |
| fm.claire 1.7 | 5.3 | 9.3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.6% | 6 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.0% | 5 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 2 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.6 | 22 / 35 | 5308 |
| 2 | 1 | 68.8 | 83.8 | 23 / 35 | 5657 |
| 3 | 1 | 70.8 | 91.4 | 30 / 35 | 5658 |
| 4 | 1 | 70.4 | 92.4 | 25 / 35 | 5631 |
| 5 | 1 | 68.8 | 87.3 | 22 / 35 | 5422 |
| 6 | 1 | 67.9 | 81.3 | 21 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 92% |
| oog.melee.CapuletDroid 1.1 | 36 | 94% |
| gh.nano.Grofvuil 0.2 | 18 | 72% |
| arthord.NanoSatanMelee Beta | 16 | 75% |
| sample.SpinBot 1.0 | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 67 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 28% | 71 |
| gh.nano.Grofvuil 0.2 | 12 | 18% | 34 |
| oog.melee.CapuletDroid 1.1 | 10 | 15% | 43 |
| arthord.NanoSatanMelee Beta | 9 | 13% | 24 |
| sample.SpinBot 1.0 | 5 | 7% | 9 |
| kurios.DOSexe .9b | 4 | 6% | 7 |
| fm.claire 1.7 | 3 | 4% | 9 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 8 |

## Melee bench: F07

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.6 | 102 / 210 | 2.74 | 18.1% | 34922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.1% | 102 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 30 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.5% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 2 |
| fire219.CatBot 1.0 | 8.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.6 | 13 / 35 | 5597 |
| 2 | 1 | 68.0 | 79.4 | 16 / 35 | 6341 |
| 3 | 1 | 67.9 | 80.3 | 16 / 35 | 5948 |
| 4 | 1 | 66.8 | 78.7 | 19 / 35 | 5717 |
| 5 | 1 | 68.4 | 85.4 | 19 / 35 | 5713 |
| 6 | 1 | 68.6 | 85.4 | 19 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 49 | 69% |
| spinnercat.micro.Tyger 0.1 | 45 | 87% |
| gh.micro.Gruweltje 0.7 | 25 | 68% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 29% | 66 |
| spinnercat.micro.Tyger 0.1 | 27 | 25% | 56 |
| gh.micro.Gruweltje 0.7 | 23 | 21% | 45 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 10 |
| acogdev.alpha 0.2 | 7 | 6% | 8 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 8 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |

## Melee bench: F08

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.6 | 114 / 210 | 3.29 | 17.3% | 31434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.3% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.2 | 12.2% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 8 |
| germ.TheMind .2 | 5.0 | 9.5% | 4 |
| awesomeness.Elite 1.0 | 6.2 | 8.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 0 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.7 | 22 / 35 | 5468 |
| 2 | 1 | 65.6 | 74.9 | 15 / 35 | 5098 |
| 3 | 1 | 65.5 | 71.7 | 18 / 35 | 5324 |
| 4 | 1 | 65.7 | 71.7 | 20 / 35 | 5276 |
| 5 | 1 | 66.9 | 78.7 | 19 / 35 | 5293 |
| 6 | 1 | 64.9 | 70.5 | 20 / 35 | 4975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 94% |
| germ.TheMind .2 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 45% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 17% | 35 |
| germ.TheMind .2 | 10 | 10% | 19 |
| awesomeness.Elite 1.0 | 9 | 9% | 13 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.1 | 143 / 210 | 2.25 | 19.5% | 30539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.5% | 143 |
| rz.HawkOnFire 0.1 | 2.2 | 13.0% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.0% | 5 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 12 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 6.8 | 8.7% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 7.9% | 10 |
| spinnercat.Omen 1.0 | 8.5 | 7.8% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.8 | 28 / 35 | 5239 |
| 2 | 1 | 65.0 | 74.9 | 15 / 35 | 4268 |
| 3 | 1 | 70.6 | 90.5 | 25 / 35 | 5432 |
| 4 | 1 | 69.6 | 84.8 | 23 / 35 | 5224 |
| 5 | 1 | 70.7 | 89.5 | 27 / 35 | 5492 |
| 6 | 1 | 70.2 | 87.3 | 25 / 35 | 4884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 58 | 93% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| stelo.PatternRobot 1.0 | 19 | 79% |
| timmit.nano.TimDog 0.33 | 17 | 65% |
| maribo.IotaCT 1.1 | 11 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 15 | 22% | 24 |
| timmit.nano.TimDog 0.33 | 14 | 21% | 28 |
| rz.HawkOnFire 0.1 | 12 | 18% | 58 |
| stelo.PatternRobot 1.0 | 9 | 13% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 47 |
| maribo.IotaCT 1.1 | 4 | 6% | 16 |
| spinnercat.Omen 1.0 | 4 | 6% | 5 |

## Melee bench: F10

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.0 | 167 / 210 | 1.72 | 21.5% | 38955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.5% | 167 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.5% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 9 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.3% | 9 |
| sanja.First 0.1 | 6.3 | 8.5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.0% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 28 / 35 | 6482 |
| 2 | 1 | 71.5 | 92.7 | 25 / 35 | 6809 |
| 3 | 1 | 70.4 | 90.8 | 27 / 35 | 5959 |
| 4 | 1 | 73.5 | 98.1 | 32 / 35 | 7164 |
| 5 | 1 | 69.8 | 86.3 | 25 / 35 | 6059 |
| 6 | 1 | 72.1 | 93.0 | 30 / 35 | 6482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 90% |
| baal.nano.N 1.42 | 36 | 92% |
| cvt.Firsty 1.0 | 26 | 100% |
| zyx.micro.Ant 1.1 | 24 | 75% |
| sanja.First 0.1 | 21 | 95% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 11 | 26% | 37 |
| tvv.nano.Polaris 1.2 | 9 | 21% | 56 |
| zyx.micro.Ant 1.1 | 9 | 21% | 38 |
| cvt.Firsty 1.0 | 3 | 7% | 28 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 16 |
| sanja.First 0.1 | 2 | 5% | 15 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 8 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 5 |
| sample.RamFire 1.0 | 2 | 5% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.5 | 95 / 210 | 3.48 | 16.4% | 32918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.3 | 16.4% | 95 |
| kc.micro.Figment 1.0 | 1.7 | 15.5% | 64 |
| cs.Wren 1.0 | 3.0 | 12.6% | 17 |
| mz.Cork 0.1 | 4.3 | 11.1% | 14 |
| js.PinBall 1.6 | 5.0 | 10.4% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 8.9% | 1 |
| evd.X1 0.01 | 6.7 | 8.3% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 3 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 73.3 | 12 / 35 | 5319 |
| 2 | 2 | 63.7 | 68.9 | 16 / 35 | 5189 |
| 3 | 2 | 61.5 | 61.0 | 10 / 35 | 5430 |
| 4 | 1 | 63.6 | 66.3 | 16 / 35 | 5559 |
| 5 | 1 | 67.3 | 79.4 | 19 / 35 | 5677 |
| 6 | 1 | 68.8 | 86.0 | 22 / 35 | 5744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 69 | 70% |
| cs.Wren 1.0 | 29 | 86% |
| mz.Cork 0.1 | 8 | 75% |
| js.PinBall 1.6 | 6 | 100% |
| donjezza.Jezza 1.0 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 61 | 53% | 113 |
| evd.X1 0.01 | 14 | 12% | 16 |
| joe.ADinosaur 1.0 | 11 | 10% | 14 |
| cs.Wren 1.0 | 10 | 9% | 26 |
| js.PinBall 1.6 | 7 | 6% | 16 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| mz.Cork 0.1 | 3 | 3% | 9 |
| jsal.Jsalbot 1.0 | 3 | 3% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.9 | 124 / 210 | 2.54 | 18.6% | 29168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.6% | 124 |
| myl.nano.Graviton 1.10 | 2.5 | 12.1% | 30 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 11.0% | 10 |
| ntc.Opposite 1.5 | 4.2 | 10.8% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.9% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.6% | 7 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.5 | 8.0% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 7 |
| pbg.R2D2 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 24 / 35 | 4695 |
| 2 | 1 | 68.4 | 83.5 | 22 / 35 | 5115 |
| 3 | 1 | 67.3 | 81.0 | 22 / 35 | 4635 |
| 4 | 1 | 67.6 | 83.5 | 18 / 35 | 4919 |
| 5 | 1 | 66.5 | 79.0 | 21 / 35 | 4658 |
| 6 | 1 | 67.3 | 79.7 | 17 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 86% |
| stelo.AreaTargetingBot 1.1 | 34 | 91% |
| disan.Chair 2.2.0 | 17 | 82% |
| donjezza.Muncho 1.0 | 14 | 93% |
| ntc.Opposite 1.5 | 12 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| DBall.NUKE 0.1 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 87 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 21% | 52 |
| ntc.Opposite 1.5 | 17 | 20% | 31 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 22 |
| stelo.AreaTargetingBot 1.1 | 14 | 16% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 20 |
| DBall.NUKE 0.1 | 4 | 5% | 11 |
| disan.Chair 2.2.0 | 3 | 3% | 16 |
| donjezza.Muncho 1.0 | 3 | 3% | 14 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.0 | 93 / 210 | 3.07 | 16.7% | 27305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.7% | 93 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.1% | 36 |
| oog.melee.Capulet 1.2 | 2.8 | 13.7% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 23 |
| yagami.Tidus 0.11 | 4.5 | 11.5% | 7 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 8 |
| step.nanoPri 1.0 | 7.3 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.5 | 19 / 35 | 4613 |
| 2 | 1 | 67.0 | 81.6 | 16 / 35 | 4823 |
| 3 | 1 | 66.7 | 79.7 | 17 / 35 | 4698 |
| 4 | 1 | 67.3 | 82.2 | 19 / 35 | 4494 |
| 5 | 1 | 62.9 | 68.6 | 11 / 35 | 4021 |
| 6 | 1 | 63.6 | 66.7 | 11 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 35 | 97% |
| oog.melee.Capulet 1.2 | 30 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 71% |
| yagami.Tidus 0.11 | 13 | 85% |
| ejb.Polaris 1.0.1 | 9 | 89% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 31% | 59 |
| yagami.Tidus 0.11 | 22 | 19% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 15% | 42 |
| ejb.Polaris 1.0.1 | 15 | 13% | 25 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 38 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.7 | 114 / 210 | 3.19 | 16.7% | 26902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.7% | 114 |
| bzdp.Pansy 2.1 | 2.2 | 12.6% | 20 |
| wee.Gem 1.8.4 | 3.5 | 12.0% | 30 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 15 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 13 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.9 | 18 / 35 | 4590 |
| 2 | 1 | 65.1 | 75.2 | 17 / 35 | 4565 |
| 3 | 1 | 62.9 | 67.9 | 18 / 35 | 4214 |
| 4 | 1 | 65.7 | 79.0 | 18 / 35 | 4568 |
| 5 | 1 | 66.7 | 81.9 | 21 / 35 | 4527 |
| 6 | 1 | 65.3 | 74.9 | 22 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 98% |
| wee.Gem 1.8.4 | 31 | 87% |
| wompi.Quokka 1.6 | 16 | 81% |
| ratosh.Nobo 0.21 | 15 | 80% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 67% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 19 | 20% | 26 |
| wee.Gem 1.8.4 | 15 | 16% | 45 |
| bzdp.Pansy 2.1 | 13 | 14% | 53 |
| m3thos.Eva00 1.1 | 10 | 10% | 18 |
| bayen.UbaMicro 1.4 | 9 | 9% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 9% | 14 |
| wompi.Quokka 1.6 | 8 | 8% | 21 |
| stelo.MyAgileRobot 0.2 | 7 | 7% | 10 |
| maribo.FollowFire 1 | 6 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 85.8 | 121 / 210 | 2.28 | 20.7% | 44958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.7% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 27 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.8% | 1 |
| ayk.WallHugger 1.0 | 4.7 | 10.2% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 84.4 | 21 / 35 | 7599 |
| 2 | 1 | 72.3 | 86.3 | 20 / 35 | 7758 |
| 3 | 1 | 70.6 | 82.9 | 19 / 35 | 6846 |
| 4 | 1 | 71.9 | 88.3 | 16 / 35 | 7797 |
| 5 | 1 | 70.9 | 80.3 | 22 / 35 | 7006 |
| 6 | 1 | 73.6 | 92.7 | 23 / 35 | 7952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 78% |
| exauge.GateKeeper 1.1.121g | 17 | 100% |
| mz.NanoGod 2.02 | 16 | 44% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 36 | 40% | 48 |
| wompi.Wallaby 5.1 | 33 | 37% | 119 |
| ayk.WallHugger 1.0 | 6 | 7% | 15 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 9 |
| drd.Dreadknoght 0.9 | 4 | 4% | 10 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |

## Melee bench: F16

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.4 | 108 / 210 | 3.48 | 16.7% | 28963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.7% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.5% | 16 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.8% | 20 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.7% | 21 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.8% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 7.0% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.6 | 19 / 35 | 5154 |
| 2 | 1 | 66.3 | 77.5 | 22 / 35 | 5038 |
| 3 | 1 | 64.6 | 70.8 | 19 / 35 | 4723 |
| 4 | 1 | 65.1 | 73.7 | 19 / 35 | 4788 |
| 5 | 1 | 65.1 | 72.4 | 15 / 35 | 4981 |
| 6 | 1 | 62.3 | 65.7 | 14 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 91% |
| dummy.micro.Sparrow 2.5 | 29 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 67% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| ap.Frederick 1.1 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 51 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 14 |
| bvh.micro.Freya 0.3 | 12 | 12% | 22 |
| conscience.Electron 1.3g | 11 | 11% | 19 |
| dl.BetterWalls 1.0 | 9 | 9% | 16 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.8 | 144 / 210 | 2.37 | 20.4% | 39211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.4% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 22 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 15 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.9% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 91.4 | 26 / 35 | 7463 |
| 2 | 1 | 68.0 | 76.8 | 22 / 35 | 5841 |
| 3 | 1 | 72.4 | 95.2 | 28 / 35 | 6610 |
| 4 | 1 | 69.7 | 80.0 | 21 / 35 | 6686 |
| 5 | 1 | 69.2 | 81.9 | 24 / 35 | 5735 |
| 6 | 1 | 70.8 | 83.2 | 23 / 35 | 6876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 92% |
| sul.Lunar 1.1 | 49 | 100% |
| supersample.SuperBoxBot 1.0 | 24 | 83% |
| dsw.StaticD 1.0 | 9 | 56% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 30% | 64 |
| supersample.SuperBoxBot 1.0 | 19 | 29% | 37 |
| mme.NikeEnhanced 2.0 | 8 | 12% | 14 |
| dsw.StaticD 1.0 | 7 | 11% | 13 |
| sample.Corners 1.0 | 4 | 6% | 9 |
| sul.Lunar 1.1 | 2 | 3% | 53 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 5 |

## Melee bench: F18

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.1 | 114 / 210 | 2.80 | 18.5% | 37940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.5% | 114 |
| radnor.DoctorBob 1.42 | 3.0 | 12.4% | 20 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.1% | 25 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.4% | 14 |
| amz.NanoClone 1.41 | 5.8 | 9.2% | 12 |
| sample.Walls 1.0 | 6.8 | 7.9% | 5 |
| GarmBox.Oranges 1.0 | 7.7 | 7.2% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 79.4 | 19 / 35 | 6082 |
| 2 | 1 | 66.5 | 75.2 | 17 / 35 | 5933 |
| 3 | 1 | 69.6 | 85.1 | 22 / 35 | 6770 |
| 4 | 1 | 66.0 | 74.9 | 17 / 35 | 5923 |
| 5 | 1 | 67.4 | 78.4 | 15 / 35 | 6656 |
| 6 | 1 | 70.3 | 87.3 | 24 / 35 | 6576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 89% |
| radnor.DoctorBob 1.42 | 31 | 77% |
| mld.Wisdom 1.0 | 21 | 52% |
| amz.NanoClone 1.41 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 71% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 30% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 22% | 64 |
| radnor.DoctorBob 1.42 | 19 | 20% | 46 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 26 |
| amz.NanoClone 1.41 | 7 | 7% | 14 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 7 |

