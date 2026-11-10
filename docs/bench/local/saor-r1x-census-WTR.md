# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.2 | 148 / 210 | 2.15 | 21.2% | 43000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.2% | 148 |
| mz.AntiGrav 1.0 | 2.5 | 13.7% | 17 |
| radnor.DoctorBob 1.42 | 2.7 | 13.8% | 19 |
| mld.Infinity 2.2 | 4.0 | 12.1% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 7 |
| sample.Walls 1.0 | 6.7 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 8.8 | 5.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 83.5 | 21 / 35 | 7413 |
| 2 | 1 | 71.4 | 84.8 | 25 / 35 | 6833 |
| 3 | 1 | 70.6 | 84.1 | 24 / 35 | 6837 |
| 4 | 1 | 73.2 | 92.4 | 26 / 35 | 7408 |
| 5 | 1 | 71.6 | 87.9 | 27 / 35 | 6886 |
| 6 | 1 | 72.8 | 90.8 | 25 / 35 | 7623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 96% |
| mld.Infinity 2.2 | 33 | 88% |
| radnor.DoctorBob 1.42 | 32 | 84% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 40% | 58 |
| mz.AntiGrav 1.0 | 11 | 18% | 72 |
| mld.Infinity 2.2 | 11 | 18% | 41 |
| sample.Walls 1.0 | 5 | 8% | 13 |
| jangs.ns51 1.0 | 5 | 8% | 9 |
| amz.NanoClone 1.41 | 4 | 6% | 11 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.1 | 128 / 210 | 2.43 | 18.5% | 31494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 18.5% | 128 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.7% | 46 |
| mld.DustBunny 3.8 | 3.0 | 13.7% | 16 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.2% | 8 |
| zyx.nano.Ant 1.1 | 6.3 | 8.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 6.9% | 2 |
| fullsail.SweetTea 1.1 | 7.8 | 6.6% | 3 |
| bzdp.BoxCar 2.0 | 8.0 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.0 | 29 / 35 | 5004 |
| 2 | 1 | 68.6 | 89.2 | 21 / 35 | 5387 |
| 3 | 1 | 69.6 | 86.7 | 25 / 35 | 5844 |
| 4 | 1 | 68.5 | 87.3 | 24 / 35 | 5074 |
| 5 | 2 | 62.9 | 61.9 | 10 / 35 | 5131 |
| 6 | 1 | 68.1 | 85.4 | 19 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 77% |
| mld.DustBunny 3.8 | 57 | 89% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 31% | 70 |
| mld.DustBunny 3.8 | 21 | 25% | 65 |
| fullsail.SweetTea 1.1 | 8 | 10% | 16 |
| maribo.melee.BMV 0.1 | 7 | 8% | 13 |
| cs.Grudge 1.0 | 7 | 8% | 8 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| bzdp.BoxCar 2.0 | 4 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 1% | 9 |

## Melee bench: F03

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 85.3 | 138 / 210 | 2.32 | 20.4% | 38245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.4% | 138 |
| myl.micro.Troodon 1.10 | 2.2 | 14.1% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.0% | 18 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.5% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 3 |
| sample.Fire 1.0 | 9.3 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.4 | 22 / 35 | 6266 |
| 2 | 1 | 71.3 | 88.3 | 23 / 35 | 6304 |
| 3 | 1 | 70.4 | 83.2 | 24 / 35 | 6361 |
| 4 | 1 | 70.7 | 85.1 | 23 / 35 | 6213 |
| 5 | 1 | 71.1 | 85.4 | 25 / 35 | 6598 |
| 6 | 1 | 70.1 | 85.4 | 21 / 35 | 6503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 43 | 84% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| myl.nano.KomoriNinja 1.1 | 10 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 25% | 42 |
| myl.micro.Troodon 1.10 | 14 | 19% | 66 |
| fm.mammillarias 1.3 | 13 | 18% | 16 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 17 |
| myl.nano.KomoriNinja 1.1 | 8 | 11% | 35 |
| sample.Fire 1.0 | 3 | 4% | 6 |
| sample.Tracker 1.0 | 3 | 4% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 9 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 15 |

## Melee bench: F04

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.5 | 149 / 210 | 2.22 | 20.7% | 39849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.7% | 149 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 16 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.1% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| yk.JahMicro 1.0 | 7.2 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.9% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 83.2 | 24 / 35 | 6596 |
| 2 | 1 | 71.6 | 91.7 | 25 / 35 | 6961 |
| 3 | 1 | 69.2 | 81.9 | 23 / 35 | 6465 |
| 4 | 1 | 70.0 | 86.3 | 20 / 35 | 6348 |
| 5 | 1 | 69.5 | 81.6 | 26 / 35 | 6210 |
| 6 | 1 | 72.9 | 94.0 | 31 / 35 | 7269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 49 | 90% |
| kawigi.nano.Lib 1.0 | 46 | 98% |
| tvv.micro.Antares 1.1.1 | 20 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 86% |
| tj.zombie1n 1.0.1 | 12 | 92% |
| yk.JahMicro 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 30% | 73 |
| stelo.SoJNanoMelee 1.1 | 17 | 28% | 40 |
| tj.zombie1n 1.0.1 | 8 | 13% | 11 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 10 |
| yk.JahMicro 1.0 | 3 | 5% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 17 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.9 | 90 / 210 | 3.89 | 15.6% | 28733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 15.6% | 90 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 38 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.8% | 27 |
| sam.Samspin 1.0 | 5.3 | 10.1% | 14 |
| EBBU.Sim2 1.02 | 5.8 | 9.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.5% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.9 | 18 / 35 | 4764 |
| 2 | 1 | 62.5 | 67.9 | 12 / 35 | 4731 |
| 3 | 1 | 63.6 | 68.9 | 16 / 35 | 5081 |
| 4 | 1 | 62.6 | 66.3 | 14 / 35 | 4745 |
| 5 | 1 | 59.4 | 59.7 | 11 / 35 | 4352 |
| 6 | 1 | 64.2 | 69.5 | 19 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 77% |
| simonton.nano.MeleeSeed 1.8 | 27 | 74% |
| ahf.NanoAndrew .4 | 16 | 81% |
| EBBU.Sim2 1.02 | 13 | 100% |
| sam.Samspin 1.0 | 10 | 90% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 24 |
| oog.melee.Corsair 1.0 | 17 | 14% | 42 |
| simonton.nano.MeleeSeed 1.8 | 17 | 14% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13% | 18 |
| ahf.NanoAndrew .4 | 15 | 13% | 31 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 18 |
| EBBU.Sim2 1.02 | 10 | 8% | 17 |
| sam.Samspin 1.0 | 7 | 6% | 16 |
| sample.TrackFire 1.0 | 6 | 5% | 9 |

## Melee bench: F06

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.1 | 136 / 210 | 2.52 | 18.8% | 32121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.8% | 136 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 28 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.6% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.2% | 11 |
| fm.claire 1.7 | 5.3 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 5.3 | 8.9% | 8 |
| oog.melee.CapuletDroid 1.1 | 5.8 | 9.0% | 10 |
| sample.SpinBot 1.0 | 7.8 | 7.4% | 3 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 80.3 | 21 / 35 | 5770 |
| 2 | 1 | 67.5 | 83.8 | 23 / 35 | 4807 |
| 3 | 1 | 68.9 | 83.2 | 25 / 35 | 5507 |
| 4 | 1 | 70.8 | 90.5 | 27 / 35 | 5900 |
| 5 | 1 | 65.7 | 77.1 | 17 / 35 | 4920 |
| 6 | 1 | 68.0 | 83.8 | 23 / 35 | 5217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 86% |
| oog.melee.CapuletDroid 1.1 | 26 | 100% |
| arthord.NanoSatanMelee Beta | 18 | 83% |
| gh.nano.Grofvuil 0.2 | 13 | 69% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 32% | 79 |
| gh.nano.Grofvuil 0.2 | 15 | 20% | 27 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 35 |
| arthord.NanoSatanMelee Beta | 10 | 13% | 22 |
| fm.claire 1.7 | 7 | 9% | 12 |
| sample.SpinBot 1.0 | 4 | 5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 14 |
| pa.Improved 1.0 | 2 | 3% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.2 | 92 / 210 | 2.79 | 17.9% | 34059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.9% | 92 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.3% | 34 |
| mz.MicroGodMelee 1 | 3.2 | 14.0% | 49 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.8% | 29 |
| DBall.Anarchy 0.1 | 5.0 | 8.8% | 1 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.3% | 0 |
| acogdev.alpha 0.2 | 7.5 | 6.3% | 1 |
| el.JumpShoot 0.2 | 8.3 | 6.0% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.6 | 13 / 35 | 5817 |
| 2 | 1 | 67.3 | 81.6 | 16 / 35 | 5633 |
| 3 | 1 | 67.7 | 81.3 | 15 / 35 | 5716 |
| 4 | 1 | 68.0 | 79.4 | 16 / 35 | 6156 |
| 5 | 1 | 67.5 | 80.6 | 19 / 35 | 5373 |
| 6 | 1 | 67.3 | 82.5 | 13 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 46 | 54% |
| spinnercat.micro.Tyger 0.1 | 43 | 79% |
| gh.micro.Gruweltje 0.7 | 22 | 73% |
| DBall.Anarchy 0.1 | 11 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 48 | 41% | 73 |
| spinnercat.micro.Tyger 0.1 | 30 | 25% | 57 |
| gh.micro.Gruweltje 0.7 | 21 | 18% | 42 |
| acogdev.alpha 0.2 | 5 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 7 |
| fire219.CatBot 1.0 | 4 | 3% | 5 |
| el.JumpShoot 0.2 | 4 | 3% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.9 | 114 / 210 | 3.26 | 17.2% | 31824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.2% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.1% | 23 |
| awesomeness.Elite 1.0 | 5.7 | 8.7% | 7 |
| germ.TheMind .2 | 5.8 | 9.2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.5% | 2 |
| qualidafial.MajorDick 1.0.1 | 6.3 | 8.6% | 6 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 8 |
| sample.Crazy 1.0 | 7.7 | 7.6% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 73.3 | 17 / 35 | 5345 |
| 2 | 1 | 68.2 | 82.9 | 26 / 35 | 5233 |
| 3 | 1 | 65.8 | 73.0 | 16 / 35 | 5527 |
| 4 | 1 | 64.8 | 71.1 | 16 / 35 | 5221 |
| 5 | 1 | 66.2 | 78.4 | 19 / 35 | 5342 |
| 6 | 1 | 65.1 | 70.8 | 20 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 89% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| germ.TheMind .2 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 44% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 19% | 37 |
| lrem.micro.MoggFanatic 0.2 | 9 | 9% | 13 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 10 |
| awesomeness.Elite 1.0 | 6 | 6% | 14 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 11 |
| germ.TheMind .2 | 5 | 5% | 13 |
| sample.Crazy 1.0 | 1 | 1% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.2 | 159 / 210 | 1.97 | 20.2% | 30593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.2% | 159 |
| rz.HawkOnFire 0.1 | 2.0 | 13.3% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 7 |
| maribo.IotaCT 1.1 | 4.0 | 10.8% | 6 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 1 |
| spinnercat.Omen 1.0 | 7.2 | 8.3% | 3 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 29 / 35 | 5133 |
| 2 | 1 | 70.6 | 87.9 | 26 / 35 | 5090 |
| 3 | 1 | 69.1 | 83.8 | 25 / 35 | 4906 |
| 4 | 1 | 71.1 | 92.1 | 27 / 35 | 5020 |
| 5 | 1 | 70.4 | 89.5 | 26 / 35 | 5246 |
| 6 | 1 | 70.5 | 87.6 | 26 / 35 | 5198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 94% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| timmit.nano.TimDog 0.33 | 15 | 80% |
| maribo.IotaCT 1.1 | 12 | 83% |
| spinnercat.Omen 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |

Hadur died in 52 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 21% | 59 |
| timmit.nano.TimDog 0.33 | 11 | 21% | 22 |
| nz.jdc.nano.GridFu 1.0 | 10 | 19% | 55 |
| stelo.PatternRobot 1.0 | 6 | 12% | 17 |
| ratosh.Wesco 1.4 | 5 | 10% | 15 |
| maribo.IotaCT 1.1 | 4 | 8% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.7 | 174 / 210 | 1.57 | 21.7% | 39036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.7% | 174 |
| baal.nano.N 1.42 | 2.5 | 11.6% | 10 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.3% | 7 |
| Grystrion.TrackerWO 1.0 | 3.8 | 10.2% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 6 |
| sanja.First 0.1 | 6.2 | 8.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.4% | 8 |
| sample.RamFire 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.0 | 28 / 35 | 6290 |
| 2 | 1 | 71.2 | 90.5 | 28 / 35 | 6549 |
| 3 | 1 | 72.5 | 94.0 | 30 / 35 | 7183 |
| 4 | 1 | 70.4 | 89.2 | 26 / 35 | 6132 |
| 5 | 1 | 72.0 | 96.8 | 31 / 35 | 6178 |
| 6 | 1 | 72.7 | 97.5 | 31 / 35 | 6704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 90% |
| tvv.nano.Polaris 1.2 | 38 | 95% |
| cvt.Firsty 1.0 | 24 | 88% |
| zyx.micro.Ant 1.1 | 23 | 96% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| sanja.First 0.1 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 8 | 22% | 60 |
| baal.nano.N 1.42 | 7 | 19% | 38 |
| zyx.micro.Ant 1.1 | 6 | 17% | 34 |
| Grystrion.TrackerWO 1.0 | 6 | 17% | 26 |
| cvt.Firsty 1.0 | 3 | 8% | 23 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 7 |
| sample.RamFire 1.0 | 2 | 6% | 3 |
| sanja.First 0.1 | 1 | 3% | 17 |

## Melee bench: F11

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 65.4 | 75 / 210 | 4.11 | 15.0% | 30767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.4% | 78 |
| hadur117.micro.SaorWTR 0.1 | 1.7 | 15.0% | 75 |
| cs.Wren 1.0 | 3.0 | 12.7% | 18 |
| mz.Cork 0.1 | 4.5 | 11.2% | 15 |
| js.PinBall 1.6 | 4.5 | 11.2% | 8 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 1 |
| evd.X1 0.01 | 7.0 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 8.5 | 6.6% | 6 |
| donjezza.Jezza 1.0 | 8.7 | 5.8% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 64.4 | 12 / 35 | 4734 |
| 2 | 2 | 62.4 | 64.8 | 15 / 35 | 5101 |
| 3 | 1 | 64.0 | 69.8 | 14 / 35 | 5290 |
| 4 | 2 | 62.9 | 66.3 | 15 / 35 | 5213 |
| 5 | 2 | 62.3 | 65.1 | 10 / 35 | 5205 |
| 6 | 2 | 61.9 | 61.9 | 9 / 35 | 5224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 57% |
| cs.Wren 1.0 | 21 | 95% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 9 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 60 | 44% | 97 |
| cs.Wren 1.0 | 16 | 12% | 29 |
| js.PinBall 1.6 | 12 | 9% | 21 |
| mz.Cork 0.1 | 11 | 8% | 23 |
| evd.X1 0.01 | 11 | 8% | 14 |
| joe.ADinosaur 1.0 | 11 | 8% | 11 |
| PSW.Relentless 0.1 | 11 | 8% | 11 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.0 | 137 / 210 | 2.35 | 19.1% | 29364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.1% | 137 |
| stelo.AreaTargetingBot 1.1 | 2.5 | 11.4% | 19 |
| myl.nano.Graviton 1.10 | 3.2 | 11.1% | 20 |
| ntc.Opposite 1.5 | 4.0 | 11.1% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.9% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.8% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 8 |
| DBall.NUKE 0.1 | 7.5 | 8.0% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 27 / 35 | 5093 |
| 2 | 1 | 69.6 | 87.9 | 25 / 35 | 4975 |
| 3 | 1 | 69.3 | 86.0 | 20 / 35 | 5622 |
| 4 | 1 | 68.9 | 87.6 | 24 / 35 | 4844 |
| 5 | 1 | 66.0 | 79.0 | 19 / 35 | 4481 |
| 6 | 1 | 66.2 | 79.0 | 22 / 35 | 4349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 90% |
| myl.nano.Graviton 1.10 | 32 | 88% |
| ntc.Opposite 1.5 | 17 | 82% |
| disan.Chair 2.2.0 | 17 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| DBall.NUKE 0.1 | 12 | 100% |
| donjezza.Muncho 1.0 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 75 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 25% | 52 |
| myl.nano.Graviton 1.10 | 14 | 19% | 45 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 22 |
| ntc.Opposite 1.5 | 8 | 11% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 21 |
| DBall.NUKE 0.1 | 6 | 8% | 19 |
| disan.Chair 2.2.0 | 4 | 5% | 14 |
| donjezza.Muncho 1.0 | 2 | 3% | 8 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.5 | 69 / 210 | 3.84 | 14.9% | 25775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.3 | 14.9% | 69 |
| oog.melee.Capulet 1.2 | 2.0 | 14.8% | 70 |
| kawigi.micro.Shiz 1.1 | 3.3 | 12.9% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 25 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 15 |
| ejb.Polaris 1.0.1 | 5.8 | 10.2% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.6 | 12 / 35 | 4441 |
| 2 | 2 | 61.8 | 64.8 | 10 / 35 | 4421 |
| 3 | 2 | 63.0 | 68.6 | 10 / 35 | 4272 |
| 4 | 1 | 63.5 | 69.2 | 14 / 35 | 4088 |
| 5 | 1 | 62.8 | 69.2 | 12 / 35 | 4101 |
| 6 | 1 | 62.2 | 63.5 | 11 / 35 | 4452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 48% |
| kawigi.micro.Shiz 1.1 | 26 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| yagami.Tidus 0.11 | 15 | 87% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 41% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 18% | 43 |
| yagami.Tidus 0.11 | 22 | 15% | 34 |
| ejb.Polaris 1.0.1 | 10 | 7% | 15 |
| kawigi.micro.Shiz 1.1 | 9 | 6% | 32 |
| stelo.MirrorNano 1.3 | 7 | 5% | 6 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.8 | 128 / 210 | 3.00 | 17.3% | 27784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.3% | 128 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 24 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 24 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 14 |
| ratosh.Nobo 0.21 | 4.2 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 6.2 | 9.8% | 10 |
| bayen.UbaMicro 1.4 | 6.8 | 9.0% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 79.7 | 23 / 35 | 5067 |
| 2 | 1 | 64.7 | 74.3 | 17 / 35 | 4712 |
| 3 | 1 | 67.0 | 82.9 | 24 / 35 | 4605 |
| 4 | 1 | 65.6 | 78.7 | 21 / 35 | 4325 |
| 5 | 1 | 65.6 | 76.8 | 21 / 35 | 4642 |
| 6 | 1 | 65.1 | 74.6 | 22 / 35 | 4433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 39 | 95% |
| bzdp.Pansy 2.1 | 38 | 100% |
| wompi.Quokka 1.6 | 26 | 85% |
| ratosh.Nobo 0.21 | 13 | 100% |
| m3thos.Eva00 1.1 | 9 | 89% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 14 | 17% | 29 |
| m3thos.Eva00 1.1 | 14 | 17% | 22 |
| maribo.FollowFire 1 | 11 | 13% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 12% | 14 |
| bzdp.Pansy 2.1 | 9 | 11% | 43 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 9 |
| wee.Gem 1.8.4 | 7 | 8% | 46 |
| ratosh.Nobo 0.21 | 6 | 7% | 21 |
| bayen.UbaMicro 1.4 | 4 | 5% | 13 |

## Melee bench: F15

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 83.7 | 116 / 210 | 2.47 | 20.4% | 45738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.4% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 72 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 17 |
| ayk.WallHugger 1.0 | 4.3 | 9.7% | 2 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 0 |
| stuff.Vlad 0.1 | 6.2 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 78.1 | 21 / 35 | 7519 |
| 2 | 1 | 72.6 | 87.9 | 23 / 35 | 7995 |
| 3 | 1 | 72.2 | 86.7 | 23 / 35 | 7577 |
| 4 | 1 | 71.1 | 83.2 | 18 / 35 | 7461 |
| 5 | 1 | 71.8 | 85.7 | 15 / 35 | 7889 |
| 6 | 1 | 70.5 | 80.3 | 16 / 35 | 7297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 90 | 77% |
| exauge.GateKeeper 1.1.121g | 15 | 100% |
| mz.NanoGod 2.02 | 11 | 64% |
| ayk.WallHugger 1.0 | 10 | 90% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 44% | 124 |
| mz.NanoGod 2.02 | 26 | 28% | 38 |
| exauge.GateKeeper 1.1.121g | 9 | 10% | 14 |
| ayk.WallHugger 1.0 | 8 | 9% | 14 |
| stelo.PianistNano 1.2 | 5 | 5% | 8 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| drd.Dreadknoght 0.9 | 2 | 2% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.0 | 88 / 210 | 3.88 | 15.6% | 28122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 15.6% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.0% | 28 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.5% | 29 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.4% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 5 |
| conscience.Electron 1.3g | 7.2 | 8.2% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 7.1% | 9 |
| ap.Frederick 1.1 | 9.0 | 6.5% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 70.5 | 14 / 35 | 5035 |
| 2 | 1 | 61.9 | 62.5 | 16 / 35 | 4500 |
| 3 | 1 | 63.7 | 69.8 | 16 / 35 | 4659 |
| 4 | 1 | 63.1 | 71.7 | 15 / 35 | 4336 |
| 5 | 1 | 61.9 | 63.5 | 13 / 35 | 4539 |
| 6 | 1 | 63.8 | 69.8 | 14 / 35 | 5053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 83% |
| dummy.micro.Sparrow 2.5 | 23 | 83% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 64% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 67% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 20% | 62 |
| dummy.micro.Sparrow 2.5 | 24 | 20% | 44 |
| conscience.Electron 1.3g | 18 | 15% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 14% | 16 |
| bvh.micro.Freya 0.3 | 12 | 10% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 8% | 21 |
| dl.BetterWalls 1.0 | 10 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 10 |

## Melee bench: F17

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.3 | 149 / 210 | 2.32 | 21.0% | 42056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.0% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 18 |
| sul.Lunar 1.1 | 3.2 | 12.0% | 17 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.0% | 10 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.2% | 5 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 7 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 84.8 | 26 / 35 | 7039 |
| 2 | 1 | 70.9 | 84.4 | 23 / 35 | 7174 |
| 3 | 1 | 71.0 | 86.3 | 22 / 35 | 6933 |
| 4 | 1 | 69.3 | 78.1 | 24 / 35 | 6401 |
| 5 | 1 | 72.1 | 88.9 | 26 / 35 | 7353 |
| 6 | 1 | 72.4 | 89.5 | 28 / 35 | 7156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 94% |
| sul.Lunar 1.1 | 45 | 100% |
| supersample.SuperBoxBot 1.0 | 21 | 90% |
| dsw.StaticD 1.0 | 13 | 62% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 29% | 67 |
| supersample.SuperBoxBot 1.0 | 17 | 27% | 28 |
| dsw.StaticD 1.0 | 10 | 16% | 17 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 15 |
| tlp.ThreeLeggedPig 1 | 6 | 10% | 8 |
| sul.Lunar 1.1 | 3 | 5% | 55 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |
| sample.Corners 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 76.9 | 115 / 210 | 3.08 | 17.8% | 36436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.8% | 115 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 29 |
| mld.Wisdom 1.0 | 3.3 | 12.3% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 25 |
| amz.NanoClone 1.41 | 5.2 | 10.3% | 8 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.2% | 4 |
| sample.Walls 1.0 | 6.8 | 8.0% | 8 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 71.7 | 13 / 35 | 5934 |
| 2 | 1 | 68.4 | 83.5 | 21 / 35 | 6099 |
| 3 | 1 | 67.1 | 76.5 | 19 / 35 | 6420 |
| 4 | 1 | 67.3 | 76.8 | 22 / 35 | 6118 |
| 5 | 1 | 64.4 | 67.9 | 17 / 35 | 5683 |
| 6 | 1 | 69.1 | 84.8 | 23 / 35 | 6182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 89% |
| radnor.DoctorBob 1.42 | 31 | 81% |
| mld.Wisdom 1.0 | 18 | 78% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 8 | 88% |
| jangs.ns51 1.0 | 6 | 83% |
| sample.Target 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 28% | 45 |
| KiraNL.Chupacabra 0.4 | 19 | 20% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 19% | 62 |
| radnor.DoctorBob 1.42 | 12 | 13% | 39 |
| amz.NanoClone 1.41 | 7 | 7% | 11 |
| sample.Walls 1.0 | 4 | 4% | 11 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |

