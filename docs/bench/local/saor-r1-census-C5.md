# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.5 | 152 / 210 | 1.95 | 21.5% | 44849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 21.5% | 152 |
| mz.AntiGrav 1.0 | 2.2 | 14.1% | 17 |
| radnor.DoctorBob 1.42 | 3.0 | 13.4% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.2% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 5 |
| sample.Walls 1.0 | 6.3 | 7.3% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 89.2 | 25 / 35 | 7056 |
| 2 | 1 | 71.3 | 87.0 | 23 / 35 | 7307 |
| 3 | 1 | 72.6 | 90.5 | 23 / 35 | 7866 |
| 4 | 1 | 72.7 | 92.7 | 27 / 35 | 7338 |
| 5 | 1 | 72.9 | 90.5 | 26 / 35 | 7919 |
| 6 | 1 | 72.0 | 87.0 | 28 / 35 | 7363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 99% |
| radnor.DoctorBob 1.42 | 27 | 85% |
| mld.Infinity 2.2 | 26 | 100% |
| sample.Walls 1.0 | 15 | 100% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Target 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 28% | 56 |
| mz.AntiGrav 1.0 | 15 | 26% | 78 |
| mld.Infinity 2.2 | 11 | 19% | 43 |
| amz.NanoClone 1.41 | 8 | 14% | 14 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |

## Melee bench: F02

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.5 | 94 / 210 | 2.94 | 17.2% | 32083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.3 | 17.2% | 94 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 60 |
| mld.DustBunny 3.8 | 2.5 | 13.5% | 20 |
| maribo.melee.BMV 0.1 | 4.7 | 10.1% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.8 | 8.7% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.9% | 12 |
| zyx.nano.Ant 1.1 | 6.2 | 8.6% | 1 |
| fullsail.SweetTea 1.1 | 7.7 | 6.9% | 7 |
| bzdp.BoxCar 2.0 | 9.2 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.2 | 17 / 35 | 5132 |
| 2 | 1 | 67.2 | 81.9 | 17 / 35 | 5360 |
| 3 | 1 | 68.1 | 84.8 | 19 / 35 | 5592 |
| 4 | 3 | 57.7 | 50.5 | 6 / 35 | 4908 |
| 5 | 1 | 68.1 | 85.1 | 18 / 35 | 5551 |
| 6 | 1 | 68.0 | 86.3 | 17 / 35 | 5540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 48 | 75% |
| oog.melee.Mercutio 1.0 | 42 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 82% |
| fullsail.SweetTea 1.1 | 8 | 75% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 36 | 31% | 65 |
| oog.melee.Mercutio 1.0 | 28 | 24% | 71 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 13% | 28 |
| maribo.melee.BMV 0.1 | 12 | 10% | 16 |
| fullsail.SweetTea 1.1 | 8 | 7% | 11 |
| zyx.nano.Ant 1.1 | 8 | 7% | 8 |
| cs.Grudge 1.0 | 5 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 76.8 | 112 / 210 | 3.09 | 18.6% | 37381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 18.6% | 112 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 12.0% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.2% | 26 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 11 |
| fm.mammillarias 1.3 | 6.2 | 9.1% | 1 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 5 |
| sample.Fire 1.0 | 9.2 | 5.1% | 3 |
| sample.Tracker 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 78.7 | 20 / 35 | 6304 |
| 2 | 1 | 70.4 | 83.8 | 23 / 35 | 6527 |
| 3 | 1 | 67.3 | 75.6 | 18 / 35 | 5766 |
| 4 | 1 | 67.7 | 74.6 | 17 / 35 | 6599 |
| 5 | 1 | 68.9 | 78.4 | 20 / 35 | 6341 |
| 6 | 1 | 65.6 | 69.8 | 14 / 35 | 5844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 40 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 77% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| cb.nano.Insomnia 1.0 | 16 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| sp.Nanos.Ember 1.1 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 27% | 41 |
| myl.micro.Troodon 1.10 | 20 | 20% | 59 |
| myl.nano.KomoriNinja 1.1 | 14 | 14% | 35 |
| cb.nano.Insomnia 1.0 | 13 | 13% | 24 |
| fm.mammillarias 1.3 | 13 | 13% | 17 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 15 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 13 |
| sample.Fire 1.0 | 2 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 84.9 | 135 / 210 | 2.36 | 20.2% | 40369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 20.2% | 135 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.7% | 23 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.4% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 9.8% | 19 |
| tj.zombie1n 1.0.1 | 4.8 | 9.8% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 0 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 9.2 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 81.9 | 20 / 35 | 6887 |
| 2 | 1 | 70.8 | 87.0 | 27 / 35 | 6815 |
| 3 | 1 | 71.9 | 91.7 | 24 / 35 | 7224 |
| 4 | 1 | 67.9 | 79.7 | 18 / 35 | 6235 |
| 5 | 1 | 71.1 | 89.2 | 25 / 35 | 6649 |
| 6 | 1 | 68.6 | 80.0 | 21 / 35 | 6559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 48 | 81% |
| stelo.SoJNanoMelee 1.1 | 40 | 90% |
| tj.zombie1n 1.0.1 | 22 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 100% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 43% | 78 |
| stelo.SoJNanoMelee 1.1 | 15 | 20% | 35 |
| tj.zombie1n 1.0.1 | 10 | 13% | 14 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 10 |
| yk.JahMicro 1.0 | 1 | 1% | 11 |
| repositorio.NanoStep 1.0 | 1 | 1% | 9 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F05

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.7 | 92 / 210 | 3.54 | 16.2% | 30079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 16.2% | 92 |
| oog.melee.Corsair 1.0 | 2.0 | 12.4% | 31 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.1% | 26 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 8 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 68.6 | 13 / 35 | 5134 |
| 2 | 1 | 64.3 | 72.1 | 12 / 35 | 5260 |
| 3 | 1 | 65.1 | 73.3 | 20 / 35 | 5092 |
| 4 | 1 | 64.6 | 74.9 | 19 / 35 | 4880 |
| 5 | 1 | 64.4 | 73.0 | 14 / 35 | 5116 |
| 6 | 1 | 62.7 | 68.6 | 14 / 35 | 4597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 65% |
| simonton.nano.MeleeSeed 1.8 | 27 | 96% |
| ahf.NanoAndrew .4 | 16 | 88% |
| sam.Samspin 1.0 | 12 | 100% |
| EBBU.Sim2 1.02 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 23% | 53 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 21 |
| EBBU.Sim2 1.02 | 16 | 14% | 23 |
| simonton.nano.MeleeSeed 1.8 | 14 | 12% | 36 |
| ahf.NanoAndrew .4 | 14 | 12% | 27 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 19 |
| sam.Samspin 1.0 | 9 | 8% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 4% | 5 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.1 | 113 / 210 | 2.79 | 17.9% | 32185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 17.9% | 113 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 36 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 20 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 10.0% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.2% | 6 |
| fm.claire 1.7 | 5.5 | 9.2% | 4 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.3% | 8 |
| sample.SpinBot 1.0 | 7.7 | 7.5% | 5 |
| pa.Improved 1.0 | 9.5 | 5.6% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.8 | 19 / 35 | 5227 |
| 2 | 1 | 65.4 | 74.6 | 15 / 35 | 5264 |
| 3 | 1 | 65.7 | 79.7 | 16 / 35 | 4942 |
| 4 | 1 | 69.3 | 85.7 | 20 / 35 | 6156 |
| 5 | 1 | 67.3 | 80.6 | 20 / 35 | 5352 |
| 6 | 1 | 67.8 | 83.2 | 23 / 35 | 5244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 85% |
| oog.melee.CapuletDroid 1.1 | 22 | 100% |
| arthord.NanoSatanMelee Beta | 17 | 88% |
| winamp32.micro.MicroMacro 1.0 | 11 | 100% |
| gh.nano.Grofvuil 0.2 | 10 | 100% |
| sample.SpinBot 1.0 | 5 | 60% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 29% | 68 |
| arthord.NanoSatanMelee Beta | 18 | 19% | 24 |
| gh.nano.Grofvuil 0.2 | 15 | 15% | 33 |
| winamp32.micro.MicroMacro 1.0 | 10 | 10% | 22 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 30 |
| sample.SpinBot 1.0 | 7 | 7% | 7 |
| fm.claire 1.7 | 6 | 6% | 11 |
| pa.Improved 1.0 | 4 | 4% | 9 |
| kurios.DOSexe .9b | 2 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.8 | 73 / 210 | 3.09 | 17.2% | 35192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.2 | 17.2% | 73 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.2% | 52 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.9% | 34 |
| mz.MicroGodMelee 1 | 3.8 | 13.1% | 35 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 10 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 0 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.1% | 4 |
| acogdev.alpha 0.2 | 8.7 | 5.9% | 0 |
| fire219.CatBot 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.0 | 15 / 35 | 5986 |
| 2 | 2 | 65.1 | 73.0 | 11 / 35 | 5705 |
| 3 | 1 | 67.8 | 79.0 | 12 / 35 | 6430 |
| 4 | 1 | 67.9 | 83.2 | 10 / 35 | 6165 |
| 5 | 1 | 65.1 | 74.3 | 12 / 35 | 5194 |
| 6 | 1 | 65.2 | 71.4 | 13 / 35 | 5712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 36 | 83% |
| mz.MicroGodMelee 1 | 30 | 53% |
| gh.micro.Gruweltje 0.7 | 22 | 55% |
| DBall.Anarchy 0.1 | 6 | 83% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 44 | 32% | 56 |
| mz.MicroGodMelee 1 | 36 | 26% | 55 |
| spinnercat.micro.Tyger 0.1 | 31 | 23% | 55 |
| acogdev.alpha 0.2 | 10 | 7% | 12 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 10 |
| fire219.CatBot 1.0 | 6 | 4% | 7 |
| DBall.Anarchy 0.1 | 2 | 1% | 11 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.5 | 81 / 210 | 3.93 | 15.5% | 30934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.5 | 15.5% | 81 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.5% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 34 |
| germ.TheMind .2 | 4.7 | 10.6% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.3% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 3 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 7 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 7 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 67.0 | 12 / 35 | 5282 |
| 2 | 2 | 63.4 | 69.8 | 14 / 35 | 4782 |
| 3 | 2 | 62.6 | 66.7 | 12 / 35 | 4767 |
| 4 | 1 | 62.3 | 64.1 | 16 / 35 | 4862 |
| 5 | 1 | 62.6 | 63.8 | 12 / 35 | 5383 |
| 6 | 1 | 65.9 | 73.3 | 15 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 84% |
| germ.TheMind .2 | 11 | 91% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| awesomeness.Elite 1.0 | 1 | 0% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 40% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 16% | 40 |
| germ.TheMind .2 | 16 | 12% | 26 |
| awesomeness.Elite 1.0 | 10 | 8% | 15 |
| stelo.UntouchableNano 1.3 | 9 | 7% | 17 |
| lrem.micro.MoggFanatic 0.2 | 9 | 7% | 10 |
| qualidafial.MajorDick 1.0.1 | 9 | 7% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.0 | 120 / 210 | 2.80 | 18.3% | 31128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 18.3% | 120 |
| rz.HawkOnFire 0.1 | 2.3 | 13.7% | 25 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.7% | 13 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 9 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.3% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.3% | 6 |
| stelo.PatternRobot 1.0 | 7.7 | 8.2% | 8 |
| spinnercat.Omen 1.0 | 7.7 | 8.3% | 8 |
| ratosh.Wesco 1.4 | 8.3 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.9 | 21 / 35 | 5443 |
| 2 | 1 | 64.1 | 71.4 | 13 / 35 | 4384 |
| 3 | 1 | 69.2 | 81.9 | 22 / 35 | 5549 |
| 4 | 1 | 68.1 | 81.6 | 20 / 35 | 5517 |
| 5 | 1 | 68.3 | 78.1 | 20 / 35 | 5081 |
| 6 | 1 | 69.7 | 85.1 | 24 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 91% |
| nz.jdc.nano.GridFu 1.0 | 25 | 100% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| spinnercat.Omen 1.0 | 10 | 100% |
| ratosh.Wesco 1.4 | 7 | 71% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| timmit.nano.TimDog 0.33 | 4 | 50% |
| maribo.IotaCT 1.1 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 19 | 21% | 27 |
| rz.HawkOnFire 0.1 | 18 | 20% | 66 |
| nz.jdc.nano.GridFu 1.0 | 13 | 14% | 50 |
| ratosh.Wesco 1.4 | 13 | 14% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 11% | 13 |
| maribo.IotaCT 1.1 | 7 | 8% | 11 |
| stelo.PatternRobot 1.0 | 6 | 7% | 10 |
| spinnercat.Omen 1.0 | 2 | 2% | 11 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.2 | 149 / 210 | 2.06 | 20.6% | 39222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 20.6% | 149 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.1% | 17 |
| baal.nano.N 1.42 | 3.0 | 11.5% | 9 |
| zyx.micro.Ant 1.1 | 4.3 | 10.1% | 21 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.7% | 4 |
| sanja.First 0.1 | 6.5 | 8.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.3% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.6% | 1 |
| cvt.Firsty 1.0 | 8.2 | 6.8% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.0 | 21 / 35 | 6233 |
| 2 | 1 | 70.8 | 86.7 | 23 / 35 | 6847 |
| 3 | 1 | 70.7 | 88.3 | 26 / 35 | 6382 |
| 4 | 1 | 70.6 | 89.8 | 26 / 35 | 6445 |
| 5 | 1 | 70.4 | 87.6 | 25 / 35 | 6481 |
| 6 | 1 | 71.1 | 89.8 | 28 / 35 | 6834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 33 | 94% |
| tvv.nano.Polaris 1.2 | 32 | 94% |
| zyx.micro.Ant 1.1 | 26 | 73% |
| sanja.First 0.1 | 22 | 100% |
| cvt.Firsty 1.0 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 23 | 37% | 42 |
| tvv.nano.Polaris 1.2 | 11 | 17% | 59 |
| baal.nano.N 1.42 | 11 | 17% | 41 |
| squidM.TentalceMeleeNano 1.1 | 6 | 10% | 10 |
| Grystrion.TrackerWO 1.0 | 4 | 6% | 12 |
| sample.RamFire 1.0 | 3 | 5% | 3 |
| sanja.First 0.1 | 2 | 3% | 22 |
| cvt.Firsty 1.0 | 2 | 3% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 8 |

## Melee bench: F11

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 66.0 | 73 / 210 | 4.06 | 14.8% | 30347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.7 | 15.4% | 71 |
| hadur117.micro.SaorC5 0.1 | 1.8 | 14.8% | 73 |
| cs.Wren 1.0 | 2.7 | 12.9% | 28 |
| mz.Cork 0.1 | 4.2 | 11.5% | 11 |
| js.PinBall 1.6 | 4.7 | 11.1% | 19 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 2 |
| evd.X1 0.01 | 6.7 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.1% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 59.7 | 12 / 35 | 4566 |
| 2 | 2 | 61.9 | 64.1 | 11 / 35 | 5096 |
| 3 | 2 | 62.4 | 68.9 | 9 / 35 | 4847 |
| 4 | 1 | 65.1 | 72.7 | 14 / 35 | 5698 |
| 5 | 2 | 60.2 | 61.3 | 12 / 35 | 4706 |
| 6 | 1 | 63.7 | 69.5 | 15 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 47 | 74% |
| cs.Wren 1.0 | 20 | 75% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 8 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 33% | 85 |
| cs.Wren 1.0 | 25 | 18% | 36 |
| evd.X1 0.01 | 18 | 13% | 22 |
| joe.ADinosaur 1.0 | 16 | 12% | 19 |
| mz.Cork 0.1 | 12 | 9% | 17 |
| js.PinBall 1.6 | 10 | 7% | 18 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.1 | 100 / 210 | 3.24 | 17.0% | 29242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 17.0% | 100 |
| myl.nano.Graviton 1.10 | 3.2 | 11.9% | 30 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.9% | 23 |
| ntc.Opposite 1.5 | 4.0 | 11.0% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 5 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.3% | 13 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 10 |
| DBall.NUKE 0.1 | 7.5 | 8.3% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 10 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 67.0 | 15 / 35 | 5030 |
| 2 | 1 | 65.1 | 74.3 | 16 / 35 | 4982 |
| 3 | 1 | 65.8 | 79.0 | 15 / 35 | 4798 |
| 4 | 1 | 65.8 | 77.1 | 19 / 35 | 4637 |
| 5 | 1 | 67.0 | 77.8 | 20 / 35 | 4972 |
| 6 | 1 | 64.8 | 75.2 | 15 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 28 | 79% |
| myl.nano.Graviton 1.10 | 20 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 87% |
| donjezza.Muncho 1.0 | 15 | 87% |
| ntc.Opposite 1.5 | 11 | 100% |
| disan.Chair 2.2.0 | 10 | 70% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 56% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 27 | 24% | 36 |
| myl.nano.Graviton 1.10 | 21 | 19% | 32 |
| stelo.AreaTargetingBot 1.1 | 17 | 15% | 36 |
| ntc.Opposite 1.5 | 15 | 14% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 24 |
| disan.Chair 2.2.0 | 9 | 8% | 18 |
| donjezza.Muncho 1.0 | 4 | 4% | 15 |
| pbg.R2D2 1.0 | 4 | 4% | 8 |
| DBall.NUKE 0.1 | 3 | 3% | 13 |

## Melee bench: F13

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 63.5 | 47 / 210 | 4.29 | 13.7% | 25584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.2 | 13.9% | 63 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 39 |
| hadur117.micro.SaorC5 0.1 | 3.3 | 13.7% | 47 |
| yagami.Tidus 0.11 | 3.3 | 13.0% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.2% | 30 |
| ejb.Polaris 1.0.1 | 6.0 | 11.1% | 13 |
| stelo.MirrorNano 1.3 | 7.3 | 7.3% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 70.2 | 11 / 35 | 4426 |
| 2 | 1 | 63.9 | 73.0 | 14 / 35 | 4395 |
| 3 | 4 | 60.8 | 61.0 | 6 / 35 | 4629 |
| 4 | 4 | 59.3 | 60.6 | 4 / 35 | 4175 |
| 5 | 5 | 58.3 | 55.6 | 6 / 35 | 4053 |
| 6 | 5 | 59.9 | 60.6 | 6 / 35 | 3906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 20 | 50% |
| kawigi.micro.Shiz 1.1 | 16 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 80% |
| yagami.Tidus 0.11 | 10 | 70% |
| ejb.Polaris 1.0.1 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 34% | 67 |
| yagami.Tidus 0.11 | 29 | 18% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 17% | 40 |
| ejb.Polaris 1.0.1 | 21 | 13% | 24 |
| kawigi.micro.Shiz 1.1 | 8 | 5% | 20 |
| step.nanoPri 1.0 | 8 | 5% | 8 |
| kurios.DOSexe .9a | 8 | 5% | 8 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.9 | 111 / 210 | 3.08 | 17.1% | 29184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 17.1% | 111 |
| ratosh.Nobo 0.21 | 2.8 | 12.0% | 22 |
| wee.Gem 1.8.4 | 3.3 | 12.2% | 30 |
| bzdp.Pansy 2.1 | 3.8 | 11.5% | 14 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 17 |
| m3thos.Eva00 1.1 | 5.7 | 10.1% | 9 |
| bayen.UbaMicro 1.4 | 7.2 | 8.4% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.0 | 18 / 35 | 5022 |
| 2 | 1 | 66.7 | 79.0 | 20 / 35 | 5009 |
| 3 | 1 | 62.7 | 67.9 | 14 / 35 | 4824 |
| 4 | 1 | 65.8 | 77.8 | 20 / 35 | 4477 |
| 5 | 1 | 66.3 | 78.1 | 20 / 35 | 4861 |
| 6 | 1 | 66.4 | 79.4 | 19 / 35 | 4991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 95% |
| wee.Gem 1.8.4 | 26 | 100% |
| wompi.Quokka 1.6 | 17 | 88% |
| ratosh.Nobo 0.21 | 16 | 75% |
| m3thos.Eva00 1.1 | 15 | 87% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 21 | 21% | 30 |
| m3thos.Eva00 1.1 | 13 | 13% | 27 |
| bayen.UbaMicro 1.4 | 13 | 13% | 16 |
| maribo.FollowFire 1 | 11 | 11% | 11 |
| wompi.Quokka 1.6 | 10 | 10% | 23 |
| bzdp.Pansy 2.1 | 9 | 9% | 49 |
| wee.Gem 1.8.4 | 8 | 8% | 35 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 8% | 9 |
| stelo.MyAgileRobot 0.2 | 6 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.3 | 122 / 210 | 2.14 | 21.1% | 46720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 21.1% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 62 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 16 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 6 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 0 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 84.1 | 20 / 35 | 7662 |
| 2 | 1 | 72.0 | 87.9 | 19 / 35 | 7623 |
| 3 | 1 | 70.5 | 83.5 | 17 / 35 | 7132 |
| 4 | 1 | 72.6 | 89.8 | 21 / 35 | 7821 |
| 5 | 1 | 72.7 | 88.3 | 22 / 35 | 8044 |
| 6 | 1 | 73.8 | 90.2 | 23 / 35 | 8438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 94 | 87% |
| exauge.GateKeeper 1.1.121g | 16 | 81% |
| mz.NanoGod 2.02 | 14 | 43% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 33 | 38% | 44 |
| wompi.Wallaby 5.1 | 29 | 33% | 115 |
| exauge.GateKeeper 1.1.121g | 14 | 16% | 23 |
| ayk.WallHugger 1.0 | 6 | 7% | 14 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 8 |

## Melee bench: F16

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.9 | 89 / 210 | 3.70 | 15.8% | 28206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 15.8% | 89 |
| dummy.micro.Sparrow 2.5 | 2.3 | 13.0% | 27 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.6% | 32 |
| bvh.micro.Freya 0.3 | 4.5 | 11.2% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 11.0% | 21 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 7 |
| conscience.Electron 1.3g | 6.5 | 8.1% | 4 |
| ap.Frederick 1.1 | 8.3 | 6.5% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 65.1 | 13 / 35 | 4302 |
| 2 | 1 | 65.3 | 77.8 | 14 / 35 | 4590 |
| 3 | 1 | 61.3 | 61.9 | 14 / 35 | 4546 |
| 4 | 1 | 62.8 | 66.0 | 15 / 35 | 4788 |
| 5 | 1 | 65.0 | 75.9 | 17 / 35 | 4682 |
| 6 | 1 | 65.5 | 73.0 | 16 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 85% |
| dummy.micro.Sparrow 2.5 | 27 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 63% |
| bvh.micro.Freya 0.3 | 15 | 80% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 20% | 55 |
| dummy.micro.Sparrow 2.5 | 22 | 18% | 51 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 18% | 36 |
| conscience.Electron 1.3g | 16 | 13% | 17 |
| bvh.micro.Freya 0.3 | 13 | 11% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 10% | 11 |
| dl.BetterWalls 1.0 | 6 | 5% | 8 |
| stelo.MirrorMicro 1.0 | 5 | 4% | 11 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.6 | 155 / 210 | 2.02 | 22.0% | 47546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 22.0% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 17 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 11 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.9% | 17 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.4% | 2 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 3 |
| tlp.ThreeLeggedPig 1 | 7.2 | 6.9% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 4 |
| sample.Corners 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 88.9 | 28 / 35 | 8088 |
| 2 | 1 | 72.1 | 92.4 | 27 / 35 | 7100 |
| 3 | 1 | 71.8 | 87.0 | 22 / 35 | 8351 |
| 4 | 1 | 70.6 | 81.6 | 23 / 35 | 7472 |
| 5 | 1 | 74.0 | 91.7 | 30 / 35 | 8780 |
| 6 | 1 | 73.0 | 90.2 | 25 / 35 | 7755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 43 | 95% |
| supersample.SuperBoxBot 1.0 | 27 | 81% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 100% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| dsw.StaticD 1.0 | 9 | 89% |
| sample.Corners 1.0 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 21 | 37% | 69 |
| supersample.SuperBoxBot 1.0 | 20 | 35% | 38 |
| dsw.StaticD 1.0 | 4 | 7% | 13 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 5 |
| sul.Lunar 1.1 | 2 | 4% | 54 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 10 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 10 |
| sample.Corners 1.0 | 2 | 4% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.9 | 90 / 210 | 3.08 | 17.4% | 36796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC5 0.1 | 1.0 | 17.4% | 90 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 34 |
| mld.Wisdom 1.0 | 3.0 | 12.9% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 29 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.6% | 12 |
| amz.NanoClone 1.41 | 6.2 | 9.1% | 9 |
| sample.Walls 1.0 | 6.7 | 8.8% | 11 |
| GarmBox.Oranges 1.0 | 7.7 | 7.5% | 2 |
| jangs.ns51 1.0 | 9.0 | 5.9% | 3 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.7 | 13 / 35 | 5772 |
| 2 | 1 | 67.4 | 80.0 | 16 / 35 | 6247 |
| 3 | 1 | 65.7 | 73.0 | 15 / 35 | 6065 |
| 4 | 1 | 65.0 | 73.7 | 11 / 35 | 5924 |
| 5 | 1 | 67.5 | 78.4 | 20 / 35 | 6374 |
| 6 | 1 | 67.0 | 76.5 | 15 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 83% |
| sample.Walls 1.0 | 24 | 96% |
| radnor.DoctorBob 1.42 | 22 | 55% |
| mld.Wisdom 1.0 | 12 | 75% |
| KiraNL.Chupacabra 0.4 | 8 | 50% |
| amz.NanoClone 1.41 | 4 | 50% |
| GarmBox.Oranges 1.0 | 4 | 75% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 28% | 51 |
| mld.Wisdom 1.0 | 30 | 25% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 15% | 56 |
| KiraNL.Chupacabra 0.4 | 16 | 13% | 21 |
| amz.NanoClone 1.41 | 13 | 11% | 14 |
| GarmBox.Oranges 1.0 | 4 | 3% | 9 |
| jangs.ns51 1.0 | 4 | 3% | 4 |
| sample.Walls 1.0 | 2 | 2% | 13 |

