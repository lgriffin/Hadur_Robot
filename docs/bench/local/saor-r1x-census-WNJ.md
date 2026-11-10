# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 83.5 | 123 / 210 | 2.48 | 20.0% | 42998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 20.0% | 123 |
| mz.AntiGrav 1.0 | 2.5 | 14.0% | 21 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 25 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 26 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 7 |
| sample.Walls 1.0 | 6.2 | 7.2% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.2% | 4 |
| arthord.MannyPacquiao Beta | 8.8 | 4.9% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.3 | 23 / 35 | 7354 |
| 2 | 1 | 68.2 | 75.9 | 19 / 35 | 6479 |
| 3 | 1 | 66.9 | 76.2 | 12 / 35 | 6178 |
| 4 | 1 | 72.7 | 90.8 | 26 / 35 | 7826 |
| 5 | 1 | 71.4 | 85.7 | 22 / 35 | 7680 |
| 6 | 1 | 71.2 | 85.4 | 21 / 35 | 7481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 56 | 91% |
| mld.Infinity 2.2 | 37 | 92% |
| radnor.DoctorBob 1.42 | 33 | 76% |
| amz.NanoClone 1.41 | 4 | 75% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 41% | 71 |
| mz.AntiGrav 1.0 | 18 | 21% | 57 |
| amz.NanoClone 1.41 | 14 | 16% | 17 |
| mld.Infinity 2.2 | 11 | 13% | 44 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| arthord.MannyPacquiao Beta | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 1 | 1% | 7 |

## Melee bench: F02

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.9 | 89 / 210 | 2.72 | 17.2% | 30942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.3 | 17.2% | 89 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.4% | 77 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 23 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.4% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.2% | 4 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.0 | 6.5% | 4 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 20 / 35 | 5938 |
| 2 | 1 | 68.0 | 86.7 | 18 / 35 | 5210 |
| 3 | 2 | 64.0 | 75.9 | 11 / 35 | 4654 |
| 4 | 2 | 63.5 | 74.9 | 12 / 35 | 4868 |
| 5 | 1 | 65.9 | 78.1 | 15 / 35 | 5235 |
| 6 | 1 | 66.3 | 81.6 | 13 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 57% |
| mld.DustBunny 3.8 | 44 | 77% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 37% | 74 |
| mld.DustBunny 3.8 | 38 | 31% | 74 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 18 |
| maribo.melee.BMV 0.1 | 10 | 8% | 12 |
| zyx.nano.Ant 1.1 | 7 | 6% | 10 |
| fullsail.SweetTea 1.1 | 5 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 10 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.1 | 118 / 210 | 2.80 | 18.6% | 35212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 18.6% | 118 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 48 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 12.2% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.3% | 22 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 9 |
| fm.mammillarias 1.3 | 5.3 | 9.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.6% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.7% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 0 |
| sample.Fire 1.0 | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.1 | 20 / 35 | 6647 |
| 2 | 1 | 66.2 | 72.7 | 18 / 35 | 5430 |
| 3 | 1 | 68.7 | 79.0 | 20 / 35 | 6424 |
| 4 | 1 | 70.1 | 82.9 | 23 / 35 | 6135 |
| 5 | 1 | 65.4 | 73.0 | 16 / 35 | 5093 |
| 6 | 1 | 69.2 | 87.6 | 21 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 76% |
| myl.nano.KomoriNinja 1.1 | 24 | 88% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 22 | 24% | 65 |
| fm.mammillarias 1.3 | 21 | 23% | 26 |
| myl.nano.KomoriNinja 1.1 | 16 | 17% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 16% | 35 |
| cb.nano.Insomnia 1.0 | 10 | 11% | 15 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 14 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |
| sample.Fire 1.0 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.7 | 135 / 210 | 2.10 | 20.3% | 39361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 20.3% | 135 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 19 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 8.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.5% | 10 |
| yk.JahMicro 1.0 | 7.2 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 24 / 35 | 6467 |
| 2 | 1 | 71.1 | 91.1 | 24 / 35 | 6775 |
| 3 | 1 | 70.2 | 86.7 | 24 / 35 | 6413 |
| 4 | 1 | 69.2 | 83.5 | 19 / 35 | 6550 |
| 5 | 1 | 70.4 | 86.7 | 25 / 35 | 6852 |
| 6 | 1 | 69.8 | 90.2 | 19 / 35 | 6304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 80% |
| stelo.SoJNanoMelee 1.1 | 48 | 79% |
| tvv.micro.Antares 1.1.1 | 22 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 75% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| yk.JahMicro 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 27% | 78 |
| stelo.SoJNanoMelee 1.1 | 20 | 27% | 39 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 13% | 26 |
| tvv.micro.Antares 1.1.1 | 8 | 11% | 27 |
| tj.zombie1n 1.0.1 | 6 | 8% | 8 |
| repositorio.NanoStep 1.0 | 4 | 5% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 5% | 9 |
| yk.JahMicro 1.0 | 3 | 4% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.8 | 89 / 210 | 3.36 | 16.5% | 31432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 16.5% | 89 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 29 |
| ahf.NanoAndrew .4 | 2.7 | 12.3% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.5% | 21 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.3% | 10 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 8.9% | 6 |
| EBBU.Sim2 1.02 | 6.5 | 9.0% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.2 | 21 / 35 | 5770 |
| 2 | 1 | 64.1 | 68.6 | 16 / 35 | 5017 |
| 3 | 1 | 66.7 | 81.0 | 18 / 35 | 5306 |
| 4 | 1 | 63.4 | 69.8 | 14 / 35 | 5253 |
| 5 | 1 | 60.6 | 63.8 | 8 / 35 | 4823 |
| 6 | 1 | 64.8 | 76.2 | 12 / 35 | 5263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 72% |
| ahf.NanoAndrew .4 | 27 | 78% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 28 | 23% | 50 |
| oog.melee.Corsair 1.0 | 20 | 17% | 43 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 19 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 20 |
| EBBU.Sim2 1.02 | 13 | 11% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 17 |
| simonton.nano.MeleeSeed 1.8 | 9 | 7% | 23 |
| sam.Samspin 1.0 | 5 | 4% | 11 |
| sample.TrackFire 1.0 | 5 | 4% | 9 |

## Melee bench: F06

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.8 | 104 / 210 | 3.00 | 17.3% | 30915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 17.3% | 104 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 47 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.5% | 21 |
| fm.claire 1.7 | 5.8 | 8.8% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.7% | 7 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.4% | 7 |
| sample.SpinBot 1.0 | 7.5 | 7.2% | 4 |
| pa.Improved 1.0 | 9.5 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.1 | 17 / 35 | 5236 |
| 2 | 1 | 67.8 | 82.5 | 17 / 35 | 5601 |
| 3 | 1 | 66.5 | 80.3 | 16 / 35 | 5432 |
| 4 | 1 | 62.2 | 70.5 | 16 / 35 | 3983 |
| 5 | 1 | 66.7 | 78.4 | 21 / 35 | 5332 |
| 6 | 1 | 66.3 | 78.1 | 17 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 73% |
| oog.melee.CapuletDroid 1.1 | 33 | 94% |
| gh.nano.Grofvuil 0.2 | 10 | 90% |
| arthord.NanoSatanMelee Beta | 8 | 75% |
| sample.SpinBot 1.0 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 5 | 60% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 37% | 79 |
| gh.nano.Grofvuil 0.2 | 12 | 11% | 25 |
| oog.melee.CapuletDroid 1.1 | 11 | 10% | 36 |
| arthord.NanoSatanMelee Beta | 11 | 10% | 15 |
| kurios.DOSexe .9b | 9 | 8% | 15 |
| sample.SpinBot 1.0 | 8 | 7% | 13 |
| fm.claire 1.7 | 8 | 7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 7 | 6% | 14 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 75.8 | 81 / 210 | 3.18 | 16.7% | 32860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.2 | 16.7% | 81 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 51 |
| mz.MicroGodMelee 1 | 3.3 | 14.1% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.5% | 32 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 8 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 0 |
| fire219.CatBot 1.0 | 8.3 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.3 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.7 | 14 / 35 | 5679 |
| 2 | 1 | 66.3 | 77.8 | 16 / 35 | 5419 |
| 3 | 1 | 67.8 | 82.2 | 15 / 35 | 5918 |
| 4 | 1 | 65.4 | 75.2 | 15 / 35 | 5260 |
| 5 | 2 | 62.2 | 66.7 | 8 / 35 | 5165 |
| 6 | 1 | 65.2 | 74.3 | 13 / 35 | 5419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 41 | 83% |
| mz.MicroGodMelee 1 | 30 | 63% |
| gh.micro.Gruweltje 0.7 | 16 | 88% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |

Hadur died in 129 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 37 | 29% | 55 |
| mz.MicroGodMelee 1 | 37 | 29% | 55 |
| spinnercat.micro.Tyger 0.1 | 25 | 19% | 52 |
| caimano.Furia_Ceca 0.22 | 10 | 8% | 11 |
| DBall.Anarchy 0.1 | 6 | 5% | 17 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| acogdev.alpha 0.2 | 4 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.7 | 85 / 210 | 3.72 | 15.6% | 30384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.3% | 62 |
| hadur117.micro.SaorWNJ 0.1 | 1.8 | 15.6% | 85 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 14.1% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 4 |
| germ.TheMind .2 | 5.0 | 9.8% | 12 |
| awesomeness.Elite 1.0 | 6.2 | 8.6% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 7.9% | 1 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.4% | 6 |
| sample.Crazy 1.0 | 8.7 | 6.5% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 68.6 | 15 / 35 | 5489 |
| 2 | 3 | 61.8 | 66.3 | 11 / 35 | 4642 |
| 3 | 1 | 66.0 | 77.8 | 19 / 35 | 4976 |
| 4 | 2 | 62.7 | 64.4 | 12 / 35 | 5509 |
| 5 | 2 | 61.6 | 67.9 | 13 / 35 | 4387 |
| 6 | 1 | 65.2 | 73.3 | 15 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 78% |
| germ.TheMind .2 | 13 | 54% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 36% | 92 |
| germ.TheMind .2 | 26 | 21% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 14% | 32 |
| awesomeness.Elite 1.0 | 13 | 10% | 16 |
| stelo.UntouchableNano 1.3 | 9 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.9 | 113 / 210 | 3.08 | 17.3% | 29099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 17.3% | 113 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 18 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.2% | 16 |
| maribo.IotaCT 1.1 | 5.0 | 10.2% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.4% | 9 |
| stelo.PatternRobot 1.0 | 7.2 | 8.8% | 9 |
| spinnercat.Omen 1.0 | 7.5 | 8.6% | 4 |
| ratosh.Wesco 1.4 | 8.0 | 8.5% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.8 | 17 / 35 | 5102 |
| 2 | 1 | 64.7 | 70.8 | 18 / 35 | 4785 |
| 3 | 1 | 66.9 | 76.8 | 20 / 35 | 4959 |
| 4 | 1 | 66.9 | 80.3 | 17 / 35 | 4919 |
| 5 | 1 | 66.0 | 76.5 | 20 / 35 | 4438 |
| 6 | 1 | 67.6 | 80.0 | 21 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 54 | 93% |
| nz.jdc.nano.GridFu 1.0 | 24 | 100% |
| stelo.PatternRobot 1.0 | 14 | 93% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 33% |

Hadur died in 98 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 24 | 24% | 32 |
| rz.HawkOnFire 0.1 | 18 | 18% | 58 |
| stelo.PatternRobot 1.0 | 17 | 17% | 26 |
| nz.jdc.nano.GridFu 1.0 | 16 | 16% | 48 |
| ratosh.Wesco 1.4 | 9 | 9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 8% | 13 |
| maribo.IotaCT 1.1 | 4 | 4% | 12 |
| spinnercat.Omen 1.0 | 2 | 2% | 4 |

## Melee bench: F10

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.0 | 141 / 210 | 1.99 | 20.4% | 39233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 20.4% | 141 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.7% | 19 |
| baal.nano.N 1.42 | 3.2 | 11.5% | 11 |
| zyx.micro.Ant 1.1 | 3.8 | 10.5% | 23 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.2% | 3 |
| sanja.First 0.1 | 7.3 | 7.8% | 4 |
| cvt.Firsty 1.0 | 7.7 | 7.4% | 6 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.2 | 25 / 35 | 6612 |
| 2 | 1 | 70.2 | 88.6 | 23 / 35 | 6680 |
| 3 | 1 | 70.5 | 89.8 | 26 / 35 | 6396 |
| 4 | 1 | 68.1 | 83.2 | 21 / 35 | 5870 |
| 5 | 1 | 70.8 | 88.9 | 22 / 35 | 6840 |
| 6 | 1 | 71.4 | 93.7 | 24 / 35 | 6835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 49 | 92% |
| baal.nano.N 1.42 | 28 | 82% |
| zyx.micro.Ant 1.1 | 23 | 61% |
| cvt.Firsty 1.0 | 21 | 81% |
| sanja.First 0.1 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 27 | 39% | 44 |
| baal.nano.N 1.42 | 15 | 21% | 39 |
| tvv.nano.Polaris 1.2 | 10 | 14% | 58 |
| Grystrion.TrackerWO 1.0 | 8 | 11% | 17 |
| cvt.Firsty 1.0 | 7 | 10% | 25 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 6 |
| sanja.First 0.1 | 0 | 0% | 16 |

## Melee bench: F11

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 57.7 | 53 / 210 | 4.81 | 13.2% | 29516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 15.9% | 82 |
| cs.Wren 1.0 | 2.5 | 13.6% | 28 |
| hadur117.micro.SaorWNJ 0.1 | 2.8 | 13.2% | 53 |
| mz.Cork 0.1 | 4.3 | 11.7% | 19 |
| js.PinBall 1.6 | 4.3 | 11.5% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 8.5% | 1 |
| evd.X1 0.01 | 7.0 | 8.0% | 5 |
| jsal.Jsalbot 1.0 | 7.8 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 59.0 | 10 / 35 | 4677 |
| 2 | 2 | 59.1 | 59.0 | 9 / 35 | 4604 |
| 3 | 2 | 61.4 | 61.3 | 10 / 35 | 5442 |
| 4 | 3 | 57.4 | 51.1 | 9 / 35 | 5147 |
| 5 | 5 | 55.0 | 49.2 | 6 / 35 | 4365 |
| 6 | 2 | 62.4 | 66.3 | 9 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 39 | 77% |
| cs.Wren 1.0 | 19 | 79% |
| js.PinBall 1.6 | 4 | 75% |
| mz.Cork 0.1 | 4 | 25% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 158 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 35% | 85 |
| evd.X1 0.01 | 21 | 13% | 21 |
| cs.Wren 1.0 | 20 | 13% | 30 |
| mz.Cork 0.1 | 20 | 13% | 23 |
| js.PinBall 1.6 | 18 | 11% | 21 |
| joe.ADinosaur 1.0 | 14 | 9% | 16 |
| PSW.Relentless 0.1 | 5 | 3% | 6 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.5 | 109 / 210 | 2.94 | 17.5% | 29361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 17.5% | 109 |
| myl.nano.Graviton 1.10 | 2.3 | 11.9% | 30 |
| ntc.Opposite 1.5 | 3.7 | 11.3% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.1% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.9% | 15 |
| disan.Chair 2.2.0 | 6.5 | 8.9% | 13 |
| DBall.NUKE 0.1 | 7.8 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 9 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.3 | 21 / 35 | 4675 |
| 2 | 1 | 66.7 | 81.0 | 21 / 35 | 4603 |
| 3 | 1 | 66.8 | 80.0 | 16 / 35 | 5126 |
| 4 | 1 | 67.8 | 81.9 | 20 / 35 | 5392 |
| 5 | 1 | 65.0 | 76.5 | 16 / 35 | 4737 |
| 6 | 1 | 63.9 | 71.1 | 15 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 87% |
| myl.nano.Graviton 1.10 | 27 | 78% |
| disan.Chair 2.2.0 | 21 | 81% |
| ntc.Opposite 1.5 | 16 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 83% |
| DBall.NUKE 0.1 | 7 | 71% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| donjezza.Muncho 1.0 | 7 | 71% |
| pbg.R2D2 1.0 | 5 | 80% |

Hadur died in 102 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 26 | 25% | 30 |
| myl.nano.Graviton 1.10 | 17 | 17% | 42 |
| ntc.Opposite 1.5 | 16 | 16% | 29 |
| stelo.AreaTargetingBot 1.1 | 11 | 11% | 28 |
| disan.Chair 2.2.0 | 10 | 10% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 10% | 21 |
| DBall.NUKE 0.1 | 5 | 5% | 17 |
| pbg.R2D2 1.0 | 4 | 4% | 11 |
| donjezza.Muncho 1.0 | 3 | 3% | 10 |

## Melee bench: F13

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 57.4 | 53 / 210 | 4.83 | 12.5% | 23921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.5% | 52 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 49 |
| yagami.Tidus 0.11 | 3.0 | 13.1% | 21 |
| hadur117.micro.SaorWNJ 0.1 | 4.0 | 12.5% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 29 |
| ejb.Polaris 1.0.1 | 5.7 | 11.0% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 56.8 | 9 / 35 | 4267 |
| 2 | 2 | 59.9 | 59.7 | 10 / 35 | 4007 |
| 3 | 4 | 59.1 | 61.6 | 10 / 35 | 3635 |
| 4 | 5 | 58.1 | 55.6 | 9 / 35 | 4169 |
| 5 | 6 | 54.7 | 48.6 | 6 / 35 | 3591 |
| 6 | 3 | 61.1 | 62.2 | 9 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 69% |
| kawigi.micro.Shiz 1.1 | 19 | 84% |
| yagami.Tidus 0.11 | 14 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 71% |
| ejb.Polaris 1.0.1 | 4 | 25% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 32% | 71 |
| ejb.Polaris 1.0.1 | 23 | 15% | 25 |
| kawigi.micro.Shiz 1.1 | 17 | 11% | 34 |
| yagami.Tidus 0.11 | 17 | 11% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 10% | 21 |
| stelo.MirrorNano 1.3 | 13 | 8% | 13 |
| step.nanoPri 1.0 | 12 | 8% | 13 |
| kurios.DOSexe .9a | 9 | 6% | 9 |
| logiblocs.SittingDroid 1.0 | 1 | 1% | 0 |

## Melee bench: F14

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 69.9 | 97 / 210 | 3.70 | 15.4% | 26628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 15.4% | 97 |
| wee.Gem 1.8.4 | 2.5 | 12.9% | 46 |
| bzdp.Pansy 2.1 | 3.2 | 12.4% | 24 |
| wompi.Quokka 1.6 | 3.8 | 11.6% | 11 |
| ratosh.Nobo 0.21 | 4.8 | 11.3% | 13 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 13 |
| bayen.UbaMicro 1.4 | 7.3 | 8.2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 69.2 | 14 / 35 | 4665 |
| 2 | 1 | 61.5 | 64.4 | 13 / 35 | 4283 |
| 3 | 1 | 63.5 | 69.8 | 20 / 35 | 4511 |
| 4 | 1 | 63.4 | 73.7 | 16 / 35 | 4166 |
| 5 | 1 | 64.4 | 74.9 | 17 / 35 | 4568 |
| 6 | 1 | 62.0 | 67.6 | 17 / 35 | 4435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 82% |
| wee.Gem 1.8.4 | 37 | 95% |
| ratosh.Nobo 0.21 | 15 | 60% |
| wompi.Quokka 1.6 | 13 | 100% |
| m3thos.Eva00 1.1 | 4 | 75% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 18% | 53 |
| maribo.FollowFire 1 | 18 | 16% | 18 |
| ratosh.Nobo 0.21 | 16 | 14% | 25 |
| wee.Gem 1.8.4 | 13 | 12% | 47 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 12% | 14 |
| bayen.UbaMicro 1.4 | 12 | 11% | 13 |
| wompi.Quokka 1.6 | 8 | 7% | 19 |
| m3thos.Eva00 1.1 | 7 | 6% | 14 |
| stelo.MyAgileRobot 0.2 | 6 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 80.2 | 103 / 210 | 2.78 | 19.3% | 44390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.3 | 19.3% | 103 |
| wompi.Wallaby 5.1 | 1.7 | 18.3% | 81 |
| mz.NanoGod 2.02 | 3.0 | 15.1% | 18 |
| ayk.WallHugger 1.0 | 4.5 | 9.3% | 3 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 2 |
| stuff.Vlad 0.1 | 6.2 | 8.2% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 82.2 | 18 / 35 | 7464 |
| 2 | 1 | 70.9 | 83.2 | 20 / 35 | 7304 |
| 3 | 2 | 68.1 | 75.6 | 13 / 35 | 6774 |
| 4 | 1 | 69.3 | 77.8 | 15 / 35 | 7347 |
| 5 | 1 | 71.9 | 85.4 | 20 / 35 | 8151 |
| 6 | 2 | 69.6 | 77.1 | 17 / 35 | 7350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 68% |
| mz.NanoGod 2.02 | 13 | 77% |
| exauge.GateKeeper 1.1.121g | 8 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 6 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 40% | 122 |
| mz.NanoGod 2.02 | 40 | 37% | 54 |
| ayk.WallHugger 1.0 | 10 | 9% | 12 |
| exauge.GateKeeper 1.1.121g | 9 | 8% | 13 |
| drd.Dreadknoght 0.9 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.8 | 93 / 210 | 3.81 | 15.6% | 28373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.2 | 15.6% | 93 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 32 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.3% | 17 |
| conscience.Electron 1.3g | 6.5 | 8.7% | 2 |
| stelo.MirrorMicro 1.0 | 6.5 | 8.6% | 9 |
| dl.BetterWalls 1.0 | 8.5 | 7.0% | 6 |
| ap.Frederick 1.1 | 9.0 | 6.9% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 66.7 | 16 / 35 | 4464 |
| 2 | 1 | 65.3 | 76.5 | 20 / 35 | 4746 |
| 3 | 1 | 64.0 | 70.2 | 17 / 35 | 5084 |
| 4 | 1 | 63.7 | 70.5 | 18 / 35 | 4651 |
| 5 | 2 | 60.1 | 60.6 | 10 / 35 | 4609 |
| 6 | 1 | 62.6 | 68.3 | 12 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 74% |
| dummy.micro.Sparrow 2.5 | 27 | 81% |
| bvh.micro.Freya 0.3 | 18 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 79% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 24% | 61 |
| conscience.Electron 1.3g | 21 | 18% | 25 |
| dummy.micro.Sparrow 2.5 | 18 | 15% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 18 |
| dl.BetterWalls 1.0 | 10 | 9% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 7% | 24 |
| bvh.micro.Freya 0.3 | 8 | 7% | 19 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 12 |

## Melee bench: F17

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.7 | 141 / 210 | 2.01 | 21.1% | 42783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 21.1% | 141 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 23 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.2% | 18 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.5% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.8% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 2 |
| sample.Corners 1.0 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 88.9 | 22 / 35 | 7123 |
| 2 | 1 | 71.6 | 91.1 | 23 / 35 | 7167 |
| 3 | 1 | 70.0 | 82.2 | 23 / 35 | 6800 |
| 4 | 1 | 70.7 | 85.7 | 21 / 35 | 7056 |
| 5 | 1 | 72.2 | 92.7 | 26 / 35 | 6967 |
| 6 | 1 | 72.5 | 91.7 | 26 / 35 | 7670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 53 | 77% |
| sul.Lunar 1.1 | 46 | 100% |
| supersample.SuperBoxBot 1.0 | 25 | 64% |
| dsw.StaticD 1.0 | 13 | 77% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |

Hadur died in 70 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 25 | 36% | 66 |
| supersample.SuperBoxBot 1.0 | 23 | 33% | 30 |
| dsw.StaticD 1.0 | 8 | 11% | 17 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 16 |
| sul.Lunar 1.1 | 5 | 7% | 55 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 15 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.2 | 86 / 210 | 3.69 | 16.2% | 35194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.2 | 16.2% | 86 |
| radnor.DoctorBob 1.42 | 2.7 | 13.3% | 31 |
| mld.Wisdom 1.0 | 3.0 | 13.2% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.7% | 34 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 13 |
| amz.NanoClone 1.41 | 5.8 | 9.7% | 12 |
| sample.Walls 1.0 | 7.0 | 7.9% | 3 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.7% | 3 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 63.8 | 12 / 35 | 5234 |
| 2 | 1 | 65.6 | 75.2 | 14 / 35 | 6048 |
| 3 | 1 | 63.6 | 66.7 | 15 / 35 | 5688 |
| 4 | 1 | 66.7 | 75.6 | 16 / 35 | 6132 |
| 5 | 1 | 65.5 | 72.7 | 15 / 35 | 6159 |
| 6 | 1 | 63.8 | 67.0 | 14 / 35 | 5933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 76% |
| radnor.DoctorBob 1.42 | 24 | 88% |
| mld.Wisdom 1.0 | 12 | 50% |
| amz.NanoClone 1.41 | 10 | 90% |
| sample.Walls 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 7 | 71% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 40 | 32% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 22% | 62 |
| radnor.DoctorBob 1.42 | 20 | 16% | 43 |
| KiraNL.Chupacabra 0.4 | 14 | 11% | 21 |
| amz.NanoClone 1.41 | 10 | 8% | 16 |
| sample.Walls 1.0 | 7 | 6% | 12 |
| GarmBox.Oranges 1.0 | 4 | 3% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

