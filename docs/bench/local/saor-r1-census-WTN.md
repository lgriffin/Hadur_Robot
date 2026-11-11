# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.7 | 165 / 210 | 1.83 | 21.9% | 42825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.9% | 165 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 18 |
| mz.AntiGrav 1.0 | 2.7 | 13.8% | 12 |
| mld.Infinity 2.2 | 3.7 | 12.4% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 3 |
| GarmBox.Oranges 1.0 | 6.3 | 6.8% | 0 |
| sample.Walls 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 92.4 | 28 / 35 | 7186 |
| 2 | 1 | 72.2 | 87.9 | 27 / 35 | 6939 |
| 3 | 1 | 72.1 | 87.9 | 27 / 35 | 7238 |
| 4 | 1 | 73.8 | 93.7 | 28 / 35 | 8060 |
| 5 | 1 | 73.2 | 94.0 | 29 / 35 | 6945 |
| 6 | 1 | 71.7 | 88.6 | 26 / 35 | 6457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 97% |
| radnor.DoctorBob 1.42 | 42 | 86% |
| mld.Infinity 2.2 | 35 | 97% |
| amz.NanoClone 1.41 | 9 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 42% | 62 |
| mz.AntiGrav 1.0 | 10 | 22% | 81 |
| mld.Infinity 2.2 | 6 | 13% | 34 |
| amz.NanoClone 1.41 | 6 | 13% | 12 |
| jangs.ns51 1.0 | 2 | 4% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.9 | 123 / 210 | 2.54 | 18.4% | 31636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.3 | 18.4% | 123 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 48 |
| mld.DustBunny 3.8 | 2.5 | 13.9% | 22 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 2 |
| zyx.nano.Ant 1.1 | 5.8 | 8.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.0% | 10 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 24 / 35 | 4965 |
| 2 | 1 | 70.3 | 95.2 | 25 / 35 | 5344 |
| 3 | 1 | 66.4 | 79.4 | 19 / 35 | 5364 |
| 4 | 3 | 62.2 | 60.6 | 9 / 35 | 5058 |
| 5 | 1 | 70.0 | 89.5 | 25 / 35 | 5431 |
| 6 | 1 | 68.7 | 87.0 | 21 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 84% |
| oog.melee.Mercutio 1.0 | 55 | 76% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 57% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 32% | 75 |
| mld.DustBunny 3.8 | 22 | 25% | 65 |
| zyx.nano.Ant 1.1 | 8 | 9% | 11 |
| fullsail.SweetTea 1.1 | 7 | 8% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 10 |
| maribo.melee.BMV 0.1 | 5 | 6% | 14 |
| cs.Grudge 1.0 | 5 | 6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 11 |
| bzdp.BoxCar 2.0 | 3 | 3% | 7 |

## Melee bench: F03

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 81.7 | 136 / 210 | 2.65 | 19.5% | 36300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.5% | 136 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.3% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 16 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.0% | 14 |
| fm.mammillarias 1.3 | 5.5 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 3 |
| sample.Fire 1.0 | 9.3 | 5.3% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.6 | 22 / 35 | 6209 |
| 2 | 1 | 66.8 | 74.6 | 18 / 35 | 5676 |
| 3 | 1 | 68.1 | 78.1 | 21 / 35 | 5493 |
| 4 | 1 | 71.5 | 89.8 | 28 / 35 | 6369 |
| 5 | 1 | 71.6 | 87.3 | 27 / 35 | 6898 |
| 6 | 1 | 67.8 | 78.7 | 20 / 35 | 5655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 81% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| myl.nano.KomoriNinja 1.1 | 15 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 9 | 100% |
| sample.Fire 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 30% | 52 |
| myl.micro.Troodon 1.10 | 14 | 19% | 59 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 16 |
| cs.sheldor.Talon 1.1 | 9 | 12% | 16 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 33 |
| sp.Nanos.Ember 1.1 | 5 | 7% | 18 |
| fm.mammillarias 1.3 | 4 | 5% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 3 |
| sample.Fire 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.3 | 153 / 210 | 2.05 | 20.9% | 39980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.9% | 153 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.1% | 2 |
| tj.zombie1n 1.0.1 | 5.8 | 8.7% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 3 |
| yk.JahMicro 1.0 | 7.7 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 83.2 | 23 / 35 | 6163 |
| 2 | 1 | 70.7 | 89.5 | 25 / 35 | 6341 |
| 3 | 1 | 72.1 | 92.4 | 27 / 35 | 6902 |
| 4 | 1 | 71.9 | 91.1 | 28 / 35 | 7051 |
| 5 | 1 | 71.0 | 88.3 | 25 / 35 | 6744 |
| 6 | 1 | 70.4 | 85.4 | 25 / 35 | 6779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 50 | 86% |
| kawigi.nano.Lib 1.0 | 49 | 94% |
| tvv.micro.Antares 1.1.1 | 19 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 83% |
| tj.zombie1n 1.0.1 | 13 | 77% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 32% | 78 |
| stelo.SoJNanoMelee 1.1 | 10 | 18% | 35 |
| tj.zombie1n 1.0.1 | 8 | 14% | 13 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 11% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 5 |
| yk.JahMicro 1.0 | 3 | 5% | 10 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 12 |

## Melee bench: F05

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 66.7 | 91 / 210 | 4.00 | 15.5% | 28768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 15.5% | 91 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 28 |
| ahf.NanoAndrew .4 | 3.2 | 11.5% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.5% | 27 |
| sam.Samspin 1.0 | 6.2 | 9.4% | 14 |
| EBBU.Sim2 1.02 | 6.2 | 9.4% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.4% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.8% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.1 | 18 / 35 | 4768 |
| 2 | 1 | 61.9 | 65.4 | 11 / 35 | 4915 |
| 3 | 1 | 61.2 | 63.8 | 15 / 35 | 4259 |
| 4 | 1 | 63.1 | 67.0 | 14 / 35 | 5162 |
| 5 | 1 | 59.6 | 55.2 | 12 / 35 | 4472 |
| 6 | 1 | 66.6 | 77.8 | 21 / 35 | 5192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 94% |
| oog.melee.Corsair 1.0 | 21 | 76% |
| ahf.NanoAndrew .4 | 14 | 93% |
| sam.Samspin 1.0 | 10 | 90% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| EBBU.Sim2 1.02 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 358. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 25% | 59 |
| ahf.NanoAndrew .4 | 16 | 13% | 33 |
| oog.melee.Corsair 1.0 | 15 | 13% | 36 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 20 |
| sam.Samspin 1.0 | 9 | 8% | 16 |
| EBBU.Sim2 1.02 | 8 | 7% | 14 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.7 | 138 / 210 | 2.10 | 19.8% | 34152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.8% | 138 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.2% | 26 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.4% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.3% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 6 |
| fm.claire 1.7 | 6.8 | 8.0% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 2 |
| pa.Improved 1.0 | 9.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 18 / 35 | 5829 |
| 2 | 1 | 70.1 | 89.2 | 27 / 35 | 5558 |
| 3 | 1 | 70.4 | 91.4 | 25 / 35 | 5651 |
| 4 | 1 | 70.5 | 89.2 | 22 / 35 | 6022 |
| 5 | 1 | 67.3 | 82.2 | 21 / 35 | 5099 |
| 6 | 1 | 70.4 | 89.8 | 25 / 35 | 5993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 86% |
| oog.melee.CapuletDroid 1.1 | 39 | 100% |
| gh.nano.Grofvuil 0.2 | 16 | 69% |
| arthord.NanoSatanMelee Beta | 15 | 73% |
| winamp32.micro.MicroMacro 1.0 | 10 | 80% |
| kurios.DOSexe .9b | 6 | 67% |
| sample.SpinBot 1.0 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 32% | 74 |
| gh.nano.Grofvuil 0.2 | 17 | 23% | 33 |
| arthord.NanoSatanMelee Beta | 13 | 18% | 23 |
| oog.melee.CapuletDroid 1.1 | 5 | 7% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 18 |
| kurios.DOSexe .9b | 3 | 4% | 7 |
| fm.claire 1.7 | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| pa.Improved 1.0 | 2 | 3% | 4 |

## Melee bench: F07

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.8 | 100 / 210 | 2.73 | 17.8% | 33397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 17.8% | 100 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 36 |
| mz.MicroGodMelee 1 | 2.8 | 13.7% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.3% | 24 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 6 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.6% | 3 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.2 | 21 / 35 | 5444 |
| 2 | 1 | 67.7 | 82.5 | 20 / 35 | 5418 |
| 3 | 2 | 64.2 | 70.8 | 11 / 35 | 5455 |
| 4 | 1 | 67.6 | 82.5 | 17 / 35 | 5622 |
| 5 | 1 | 68.6 | 84.1 | 17 / 35 | 5994 |
| 6 | 1 | 67.3 | 82.5 | 14 / 35 | 5464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 84% |
| mz.MicroGodMelee 1 | 41 | 68% |
| gh.micro.Gruweltje 0.7 | 24 | 79% |
| DBall.Anarchy 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 28% | 60 |
| mz.MicroGodMelee 1 | 29 | 26% | 58 |
| gh.micro.Gruweltje 0.7 | 24 | 22% | 49 |
| acogdev.alpha 0.2 | 10 | 9% | 11 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 12 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 8 |

## Melee bench: F08

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.9 | 106 / 210 | 3.53 | 16.8% | 31275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.8% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 13.6% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 36 |
| germ.TheMind .2 | 5.0 | 9.8% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 4 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 3 |
| sample.Crazy 1.0 | 8.5 | 7.4% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 23 / 35 | 5548 |
| 2 | 1 | 65.7 | 74.6 | 19 / 35 | 5192 |
| 3 | 1 | 62.1 | 62.2 | 13 / 35 | 4763 |
| 4 | 1 | 66.3 | 75.6 | 20 / 35 | 5255 |
| 5 | 1 | 66.0 | 75.2 | 19 / 35 | 5214 |
| 6 | 1 | 62.2 | 61.6 | 12 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 81% |
| germ.TheMind .2 | 14 | 71% |
| qualidafial.MajorDick 1.0.1 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 39% | 87 |
| germ.TheMind .2 | 16 | 15% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 13% | 29 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 15 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 10 |
| awesomeness.Elite 1.0 | 5 | 5% | 12 |
| mym.EdgeStalker 1.0 | 5 | 5% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.9 | 151 / 210 | 2.18 | 19.7% | 30656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.7% | 151 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.3% | 13 |
| maribo.IotaCT 1.1 | 4.2 | 10.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 0 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.3% | 9 |
| ratosh.Wesco 1.4 | 7.0 | 8.6% | 8 |
| stelo.PatternRobot 1.0 | 7.7 | 8.3% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 8.3% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.3 | 28 / 35 | 5167 |
| 2 | 1 | 69.7 | 84.1 | 24 / 35 | 5013 |
| 3 | 1 | 70.8 | 89.5 | 28 / 35 | 5130 |
| 4 | 1 | 67.6 | 82.2 | 19 / 35 | 4850 |
| 5 | 1 | 70.6 | 88.3 | 27 / 35 | 5150 |
| 6 | 1 | 70.4 | 88.9 | 25 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 67 | 93% |
| nz.jdc.nano.GridFu 1.0 | 35 | 94% |
| stelo.PatternRobot 1.0 | 21 | 95% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 32% | 72 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 45 |
| stelo.PatternRobot 1.0 | 7 | 12% | 23 |
| timmit.nano.TimDog 0.33 | 6 | 10% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 15 |
| maribo.IotaCT 1.1 | 5 | 8% | 19 |
| ratosh.Wesco 1.4 | 5 | 8% | 13 |
| spinnercat.Omen 1.0 | 3 | 5% | 6 |

## Melee bench: F10

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.0 | 181 / 210 | 1.54 | 22.2% | 40293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 22.2% | 181 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 6 |
| baal.nano.N 1.42 | 2.7 | 11.2% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.2% | 0 |
| zyx.micro.Ant 1.1 | 6.2 | 8.1% | 7 |
| sanja.First 0.1 | 6.7 | 8.5% | 1 |
| cvt.Firsty 1.0 | 7.5 | 7.5% | 5 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.4% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 28 / 35 | 6275 |
| 2 | 1 | 72.7 | 95.2 | 31 / 35 | 6746 |
| 3 | 1 | 73.3 | 98.7 | 32 / 35 | 6867 |
| 4 | 1 | 70.9 | 89.5 | 29 / 35 | 6299 |
| 5 | 1 | 72.3 | 94.0 | 32 / 35 | 6669 |
| 6 | 1 | 72.9 | 94.6 | 29 / 35 | 7437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 96% |
| baal.nano.N 1.42 | 40 | 88% |
| cvt.Firsty 1.0 | 28 | 93% |
| sanja.First 0.1 | 27 | 100% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 24% | 30 |
| baal.nano.N 1.42 | 6 | 21% | 34 |
| Grystrion.TrackerWO 1.0 | 5 | 17% | 18 |
| tvv.nano.Polaris 1.2 | 3 | 10% | 64 |
| cvt.Firsty 1.0 | 3 | 10% | 26 |
| sanja.First 0.1 | 2 | 7% | 24 |
| sample.RamFire 1.0 | 2 | 7% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.5 | 89 / 210 | 3.56 | 16.2% | 32158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.3 | 16.2% | 89 |
| kc.micro.Figment 1.0 | 1.8 | 15.3% | 65 |
| cs.Wren 1.0 | 3.0 | 12.2% | 19 |
| mz.Cork 0.1 | 4.2 | 11.3% | 16 |
| js.PinBall 1.6 | 4.8 | 11.0% | 10 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 5 |
| evd.X1 0.01 | 6.7 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.7 | 17 / 35 | 5605 |
| 2 | 1 | 65.2 | 74.0 | 16 / 35 | 5338 |
| 3 | 2 | 63.7 | 70.2 | 13 / 35 | 5228 |
| 4 | 1 | 64.6 | 69.8 | 12 / 35 | 5786 |
| 5 | 1 | 62.6 | 65.1 | 16 / 35 | 4960 |
| 6 | 2 | 64.4 | 71.4 | 15 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 74 | 65% |
| cs.Wren 1.0 | 18 | 94% |
| mz.Cork 0.1 | 11 | 82% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 48% | 109 |
| evd.X1 0.01 | 12 | 10% | 13 |
| joe.ADinosaur 1.0 | 11 | 9% | 11 |
| cs.Wren 1.0 | 10 | 8% | 26 |
| PSW.Relentless 0.1 | 10 | 8% | 11 |
| js.PinBall 1.6 | 9 | 7% | 15 |
| mz.Cork 0.1 | 7 | 6% | 16 |
| donjezza.Jezza 1.0 | 4 | 3% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.3 | 132 / 210 | 2.50 | 18.8% | 29791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.8% | 132 |
| myl.nano.Graviton 1.10 | 3.2 | 11.5% | 25 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 7 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.0% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.0% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.7% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 4 |
| DBall.NUKE 0.1 | 7.5 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.1 | 18 / 35 | 5039 |
| 2 | 1 | 68.1 | 84.8 | 22 / 35 | 4740 |
| 3 | 1 | 68.9 | 84.4 | 25 / 35 | 5009 |
| 4 | 1 | 69.2 | 89.8 | 25 / 35 | 4763 |
| 5 | 1 | 69.0 | 85.7 | 23 / 35 | 5200 |
| 6 | 1 | 66.4 | 76.8 | 19 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 79% |
| myl.nano.Graviton 1.10 | 35 | 86% |
| ntc.Opposite 1.5 | 18 | 89% |
| DBall.NUKE 0.1 | 17 | 100% |
| donjezza.Muncho 1.0 | 16 | 94% |
| disan.Chair 2.2.0 | 12 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 22 | 28% | 53 |
| stelo.AreaTargetingBot 1.1 | 16 | 20% | 43 |
| pfvicm.Sobieski 7.2.3b | 16 | 20% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 10% | 26 |
| ntc.Opposite 1.5 | 6 | 8% | 16 |
| disan.Chair 2.2.0 | 4 | 5% | 16 |
| donjezza.Muncho 1.0 | 3 | 4% | 13 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 3% | 16 |

## Melee bench: F13

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.3 | 76 / 210 | 3.31 | 16.0% | 26945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 16.0% | 76 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 52 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.2% | 22 |
| yagami.Tidus 0.11 | 4.2 | 12.3% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.0 | 14 / 35 | 4568 |
| 2 | 1 | 69.0 | 88.9 | 22 / 35 | 4960 |
| 3 | 2 | 61.9 | 66.3 | 9 / 35 | 4074 |
| 4 | 1 | 63.4 | 69.5 | 11 / 35 | 4355 |
| 5 | 1 | 63.5 | 71.1 | 9 / 35 | 4342 |
| 6 | 1 | 64.1 | 70.8 | 11 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 44% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 83% |
| kawigi.micro.Shiz 1.1 | 20 | 95% |
| yagami.Tidus 0.11 | 15 | 80% |
| ejb.Polaris 1.0.1 | 10 | 80% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 43% | 72 |
| yagami.Tidus 0.11 | 24 | 18% | 35 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 32 |
| ejb.Polaris 1.0.1 | 10 | 7% | 21 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 149 / 210 | 2.25 | 18.9% | 28520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.9% | 149 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 10 |
| bzdp.Pansy 2.1 | 3.0 | 11.8% | 12 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 14 |
| ratosh.Nobo 0.21 | 4.5 | 10.7% | 14 |
| m3thos.Eva00 1.1 | 5.3 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 7.2 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.4% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.4 | 27 / 35 | 4766 |
| 2 | 1 | 69.9 | 93.0 | 29 / 35 | 4758 |
| 3 | 1 | 66.8 | 78.7 | 21 / 35 | 4838 |
| 4 | 1 | 67.4 | 80.6 | 23 / 35 | 5020 |
| 5 | 1 | 68.6 | 87.9 | 26 / 35 | 4720 |
| 6 | 1 | 67.6 | 84.8 | 23 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 95% |
| wee.Gem 1.8.4 | 42 | 100% |
| ratosh.Nobo 0.21 | 21 | 81% |
| wompi.Quokka 1.6 | 17 | 76% |
| m3thos.Eva00 1.1 | 15 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 12 | 20% | 22 |
| bzdp.Pansy 2.1 | 8 | 13% | 57 |
| m3thos.Eva00 1.1 | 7 | 11% | 23 |
| wompi.Quokka 1.6 | 7 | 11% | 19 |
| bayen.UbaMicro 1.4 | 7 | 11% | 14 |
| maribo.FollowFire 1 | 7 | 11% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 10% | 10 |
| wee.Gem 1.8.4 | 4 | 7% | 49 |
| stelo.MyAgileRobot 0.2 | 3 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 86.1 | 126 / 210 | 2.25 | 21.1% | 46660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 21.1% | 126 |
| wompi.Wallaby 5.1 | 1.8 | 17.5% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 22 |
| ayk.WallHugger 1.0 | 5.0 | 9.0% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.2 | 8.9% | 4 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 4.0% | 1 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 91.7 | 19 / 35 | 8263 |
| 2 | 1 | 73.0 | 86.7 | 25 / 35 | 8288 |
| 3 | 1 | 73.7 | 90.2 | 27 / 35 | 8442 |
| 4 | 1 | 70.6 | 81.6 | 20 / 35 | 7201 |
| 5 | 2 | 70.0 | 78.1 | 15 / 35 | 7263 |
| 6 | 1 | 71.5 | 88.6 | 20 / 35 | 7203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 76% |
| mz.NanoGod 2.02 | 20 | 70% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 46% | 132 |
| mz.NanoGod 2.02 | 30 | 36% | 46 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 8 |
| ayk.WallHugger 1.0 | 3 | 4% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| drd.Dreadknoght 0.9 | 2 | 2% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.8 | 106 / 210 | 3.09 | 17.2% | 29352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.2% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.1% | 26 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.2% | 18 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 20 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 9 |
| conscience.Electron 1.3g | 7.5 | 7.9% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.1% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 77.8 | 13 / 35 | 4742 |
| 2 | 1 | 67.8 | 82.9 | 24 / 35 | 5120 |
| 3 | 1 | 66.2 | 77.5 | 20 / 35 | 4821 |
| 4 | 1 | 65.9 | 75.9 | 17 / 35 | 5071 |
| 5 | 1 | 64.4 | 70.5 | 16 / 35 | 4941 |
| 6 | 1 | 65.3 | 76.5 | 16 / 35 | 4657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 83% |
| bvh.micro.Freya 0.3 | 23 | 87% |
| dummy.micro.Sparrow 2.5 | 16 | 81% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 23% | 56 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 35 |
| conscience.Electron 1.3g | 15 | 14% | 18 |
| dl.BetterWalls 1.0 | 14 | 13% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 31 |
| bvh.micro.Freya 0.3 | 10 | 10% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 9% | 8 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 18 |

## Melee bench: F17

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.2 | 145 / 210 | 2.33 | 20.9% | 41518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.9% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 22 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.5% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 4 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 9 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.6% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 4 |
| sample.Corners 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 85.7 | 22 / 35 | 7437 |
| 2 | 1 | 71.9 | 87.6 | 27 / 35 | 6882 |
| 3 | 1 | 70.4 | 82.5 | 23 / 35 | 6845 |
| 4 | 1 | 70.2 | 81.3 | 23 / 35 | 6658 |
| 5 | 1 | 71.6 | 87.0 | 26 / 35 | 7220 |
| 6 | 1 | 71.0 | 87.0 | 24 / 35 | 6476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 98% |
| supersample.SuperBoxBot 1.0 | 27 | 93% |
| dsw.StaticD 1.0 | 11 | 73% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 80% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 28% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 24% | 56 |
| dsw.StaticD 1.0 | 13 | 19% | 23 |
| sul.Lunar 1.1 | 6 | 9% | 57 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 13 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 5 |
| sample.Corners 1.0 | 1 | 1% | 6 |

## Melee bench: F18

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.6 | 122 / 210 | 2.74 | 18.5% | 36772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.5% | 122 |
| mld.Wisdom 1.0 | 2.7 | 12.9% | 20 |
| radnor.DoctorBob 1.42 | 3.0 | 12.5% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 24 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 6 |
| amz.NanoClone 1.41 | 5.5 | 9.6% | 8 |
| GarmBox.Oranges 1.0 | 7.5 | 7.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.1% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.5% | 6 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.4 | 23 / 35 | 6315 |
| 2 | 1 | 70.2 | 86.0 | 22 / 35 | 6882 |
| 3 | 1 | 66.8 | 74.3 | 18 / 35 | 6080 |
| 4 | 1 | 67.9 | 82.9 | 17 / 35 | 5659 |
| 5 | 1 | 63.7 | 68.3 | 18 / 35 | 5506 |
| 6 | 1 | 70.0 | 87.9 | 24 / 35 | 6330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 83% |
| radnor.DoctorBob 1.42 | 29 | 79% |
| mld.Wisdom 1.0 | 25 | 72% |
| KiraNL.Chupacabra 0.4 | 12 | 92% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 30% | 43 |
| radnor.DoctorBob 1.42 | 18 | 20% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 18% | 58 |
| KiraNL.Chupacabra 0.4 | 13 | 15% | 28 |
| amz.NanoClone 1.41 | 8 | 9% | 15 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |

