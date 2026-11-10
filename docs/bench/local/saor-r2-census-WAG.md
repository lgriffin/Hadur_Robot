# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 88.3 | 151 / 210 | 2.05 | 21.4% | 42261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.4% | 151 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 11 |
| radnor.DoctorBob 1.42 | 3.2 | 13.7% | 23 |
| mld.Infinity 2.2 | 3.3 | 13.0% | 15 |
| amz.NanoClone 1.41 | 4.8 | 11.1% | 7 |
| sample.Walls 1.0 | 6.2 | 7.1% | 3 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 0 |
| GarmBox.Oranges 1.0 | 7.5 | 6.2% | 0 |
| sample.Target 1.0 | 9.5 | 3.5% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 83.5 | 21 / 35 | 7319 |
| 2 | 1 | 72.8 | 89.8 | 25 / 35 | 7465 |
| 3 | 1 | 72.2 | 87.6 | 27 / 35 | 6815 |
| 4 | 1 | 73.2 | 92.7 | 30 / 35 | 7008 |
| 5 | 1 | 71.2 | 86.3 | 21 / 35 | 6610 |
| 6 | 1 | 72.7 | 89.8 | 27 / 35 | 7044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 97% |
| radnor.DoctorBob 1.42 | 32 | 84% |
| mld.Infinity 2.2 | 31 | 94% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 39% | 56 |
| mz.AntiGrav 1.0 | 13 | 22% | 86 |
| mld.Infinity 2.2 | 10 | 17% | 39 |
| amz.NanoClone 1.41 | 10 | 17% | 17 |
| GarmBox.Oranges 1.0 | 2 | 3% | 1 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.4 | 120 / 210 | 2.40 | 18.5% | 31492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 18.5% | 120 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 53 |
| mld.DustBunny 3.8 | 2.5 | 13.4% | 17 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.3% | 4 |
| zyx.nano.Ant 1.1 | 6.8 | 8.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 6 |
| bzdp.BoxCar 2.0 | 7.8 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 16 / 35 | 4987 |
| 2 | 1 | 70.9 | 96.2 | 27 / 35 | 5472 |
| 3 | 1 | 69.9 | 91.7 | 23 / 35 | 5710 |
| 4 | 1 | 69.9 | 91.1 | 24 / 35 | 5577 |
| 5 | 1 | 69.6 | 89.2 | 24 / 35 | 5247 |
| 6 | 3 | 58.1 | 51.1 | 6 / 35 | 4499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 56 | 88% |
| oog.melee.Mercutio 1.0 | 48 | 65% |
| djdjdj.NanoSkunk10 1.0 | 20 | 95% |
| maribo.melee.BMV 0.1 | 11 | 64% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 38% | 71 |
| mld.DustBunny 3.8 | 20 | 22% | 60 |
| zyx.nano.Ant 1.1 | 8 | 9% | 13 |
| fullsail.SweetTea 1.1 | 7 | 8% | 15 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 12 |
| maribo.melee.BMV 0.1 | 5 | 6% | 10 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 19 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 82.9 | 129 / 210 | 2.54 | 19.6% | 36651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.6% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.2% | 16 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 6 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 6 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.2% | 6 |
| sample.Fire 1.0 | 9.3 | 5.0% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.2 | 21 / 35 | 5703 |
| 2 | 1 | 69.3 | 83.2 | 20 / 35 | 5754 |
| 3 | 1 | 69.4 | 81.0 | 23 / 35 | 6395 |
| 4 | 1 | 69.4 | 80.3 | 21 / 35 | 6390 |
| 5 | 1 | 68.7 | 82.5 | 20 / 35 | 5919 |
| 6 | 1 | 71.2 | 87.0 | 24 / 35 | 6490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 39 | 87% |
| myl.nano.KomoriNinja 1.1 | 19 | 95% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| sp.Nanos.Ember 1.1 | 11 | 64% |
| fm.mammillarias 1.3 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 26% | 43 |
| myl.micro.Troodon 1.10 | 17 | 21% | 57 |
| sp.Nanos.Ember 1.1 | 11 | 14% | 28 |
| cb.nano.Insomnia 1.0 | 9 | 11% | 12 |
| fm.mammillarias 1.3 | 8 | 10% | 13 |
| myl.nano.KomoriNinja 1.1 | 6 | 7% | 39 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 10 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.5 | 161 / 210 | 1.86 | 21.2% | 38760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.2% | 161 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.8% | 10 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.4% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.6% | 1 |
| tj.zombie1n 1.0.1 | 6.0 | 8.5% | 6 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.8% | 5 |
| repositorio.NanoStep 1.0 | 9.3 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.3 | 26 / 35 | 6410 |
| 2 | 1 | 71.0 | 90.8 | 24 / 35 | 6450 |
| 3 | 1 | 71.1 | 88.9 | 26 / 35 | 6816 |
| 4 | 1 | 70.5 | 89.5 | 25 / 35 | 6348 |
| 5 | 1 | 71.9 | 92.1 | 29 / 35 | 6656 |
| 6 | 1 | 71.4 | 93.3 | 31 / 35 | 6080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 93% |
| stelo.SoJNanoMelee 1.1 | 50 | 90% |
| tj.zombie1n 1.0.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 92% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 11 | 91% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 15 | 30% | 81 |
| stelo.SoJNanoMelee 1.1 | 13 | 26% | 39 |
| tvv.micro.Antares 1.1.1 | 6 | 12% | 26 |
| tj.zombie1n 1.0.1 | 5 | 10% | 9 |
| yk.JahMicro 1.0 | 4 | 8% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.2 | 94 / 210 | 3.68 | 16.2% | 29250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.2% | 94 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 30 |
| ahf.NanoAndrew .4 | 3.5 | 11.7% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 29 |
| EBBU.Sim2 1.02 | 5.2 | 9.8% | 7 |
| sam.Samspin 1.0 | 5.7 | 9.6% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.9% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.0 | 11 / 35 | 4663 |
| 2 | 1 | 62.8 | 65.4 | 15 / 35 | 4959 |
| 3 | 1 | 62.5 | 68.3 | 15 / 35 | 4348 |
| 4 | 1 | 68.7 | 84.1 | 25 / 35 | 5409 |
| 5 | 1 | 62.6 | 66.0 | 14 / 35 | 4801 |
| 6 | 1 | 64.5 | 70.5 | 14 / 35 | 5070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 94% |
| oog.melee.Corsair 1.0 | 26 | 62% |
| ahf.NanoAndrew .4 | 20 | 85% |
| sam.Samspin 1.0 | 12 | 92% |
| EBBU.Sim2 1.02 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 5 | 60% |
| sample.TrackFire 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 18 | 16% | 42 |
| ahf.NanoAndrew .4 | 17 | 15% | 36 |
| EBBU.Sim2 1.02 | 17 | 15% | 22 |
| simonton.nano.MeleeSeed 1.8 | 16 | 14% | 39 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 19 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 13 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.6 | 146 / 210 | 2.21 | 19.7% | 33749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.7% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.0% | 9 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.4% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 6 |
| fm.claire 1.7 | 7.0 | 7.7% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.3% | 4 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.5 | 24 / 35 | 5665 |
| 2 | 1 | 69.1 | 85.1 | 23 / 35 | 5582 |
| 3 | 1 | 70.0 | 89.2 | 26 / 35 | 5535 |
| 4 | 1 | 68.1 | 83.8 | 20 / 35 | 5564 |
| 5 | 1 | 69.8 | 88.9 | 27 / 35 | 5434 |
| 6 | 1 | 70.6 | 88.9 | 26 / 35 | 5969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 85% |
| oog.melee.CapuletDroid 1.1 | 37 | 97% |
| gh.nano.Grofvuil 0.2 | 19 | 84% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 29% | 67 |
| oog.melee.CapuletDroid 1.1 | 14 | 22% | 52 |
| arthord.NanoSatanMelee Beta | 10 | 15% | 20 |
| gh.nano.Grofvuil 0.2 | 7 | 11% | 26 |
| kurios.DOSexe .9b | 6 | 9% | 18 |
| fm.claire 1.7 | 4 | 6% | 10 |
| sample.SpinBot 1.0 | 2 | 3% | 9 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.0 | 110 / 210 | 2.71 | 18.2% | 33856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 18.2% | 110 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.4% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.8% | 29 |
| mz.MicroGodMelee 1 | 4.0 | 12.1% | 24 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.0% | 1 |
| DBall.Anarchy 0.1 | 5.7 | 8.2% | 3 |
| acogdev.alpha 0.2 | 7.8 | 6.4% | 3 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.1% | 1 |
| el.JumpShoot 0.2 | 8.7 | 6.2% | 0 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.9 | 21 / 35 | 5264 |
| 2 | 1 | 67.8 | 81.3 | 22 / 35 | 5542 |
| 3 | 1 | 68.5 | 82.2 | 19 / 35 | 5875 |
| 4 | 2 | 63.6 | 67.9 | 15 / 35 | 4893 |
| 5 | 1 | 69.9 | 89.2 | 17 / 35 | 6281 |
| 6 | 1 | 68.2 | 82.2 | 16 / 35 | 6001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 83% |
| mz.MicroGodMelee 1 | 38 | 74% |
| gh.micro.Gruweltje 0.7 | 25 | 56% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 26 | 26% | 48 |
| spinnercat.micro.Tyger 0.1 | 22 | 22% | 61 |
| mz.MicroGodMelee 1 | 22 | 22% | 51 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 10 |
| acogdev.alpha 0.2 | 6 | 6% | 9 |
| mbro.Detektor3 0.1.1 | 6 | 6% | 8 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 4 | 4% | 13 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 70.3 | 106 / 210 | 3.67 | 16.5% | 30952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 16.5% | 106 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 14.7% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 11 |
| germ.TheMind .2 | 4.7 | 10.0% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.0% | 3 |
| awesomeness.Elite 1.0 | 7.0 | 8.4% | 9 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.6% | 2 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 77.1 | 19 / 35 | 5644 |
| 2 | 1 | 62.2 | 63.5 | 19 / 35 | 4682 |
| 3 | 2 | 64.1 | 70.2 | 17 / 35 | 4634 |
| 4 | 2 | 63.2 | 64.8 | 17 / 35 | 4673 |
| 5 | 1 | 66.2 | 74.6 | 14 / 35 | 5805 |
| 6 | 1 | 65.9 | 71.7 | 20 / 35 | 5514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 71% |
| germ.TheMind .2 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 48% | 117 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 35 |
| germ.TheMind .2 | 11 | 11% | 23 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 10 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 7 |
| awesomeness.Elite 1.0 | 3 | 3% | 8 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 4 |
| mym.EdgeStalker 1.0 | 3 | 3% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.7 | 160 / 210 | 1.75 | 20.7% | 31583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.7% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 13.5% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.9% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 10.7% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.6% | 2 |
| timmit.nano.TimDog 0.33 | 6.0 | 8.9% | 5 |
| ratosh.Wesco 1.4 | 7.8 | 8.2% | 4 |
| stelo.PatternRobot 1.0 | 7.8 | 7.6% | 9 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.3 | 27 / 35 | 5058 |
| 2 | 1 | 72.2 | 95.9 | 28 / 35 | 5240 |
| 3 | 1 | 70.3 | 87.3 | 25 / 35 | 5207 |
| 4 | 1 | 70.2 | 87.9 | 23 / 35 | 5350 |
| 5 | 1 | 72.1 | 93.0 | 29 / 35 | 5631 |
| 6 | 1 | 71.2 | 91.7 | 28 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 93% |
| nz.jdc.nano.GridFu 1.0 | 42 | 98% |
| maribo.IotaCT 1.1 | 17 | 100% |
| stelo.PatternRobot 1.0 | 15 | 87% |
| timmit.nano.TimDog 0.33 | 8 | 63% |
| spinnercat.Omen 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |

Hadur died in 50 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 24% | 65 |
| stelo.PatternRobot 1.0 | 12 | 24% | 22 |
| nz.jdc.nano.GridFu 1.0 | 10 | 20% | 53 |
| timmit.nano.TimDog 0.33 | 8 | 16% | 15 |
| ratosh.Wesco 1.4 | 5 | 10% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 7 |
| maribo.IotaCT 1.1 | 0 | 0% | 21 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.3 | 169 / 210 | 1.88 | 21.1% | 37867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.1% | 169 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.0% | 12 |
| baal.nano.N 1.42 | 3.3 | 10.8% | 7 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.7% | 3 |
| zyx.micro.Ant 1.1 | 5.5 | 9.1% | 12 |
| sanja.First 0.1 | 5.7 | 8.6% | 0 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.0% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.8% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 4 |
| sample.RamFire 1.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.2 | 31 / 35 | 6685 |
| 2 | 1 | 72.0 | 94.3 | 30 / 35 | 6610 |
| 3 | 1 | 69.0 | 84.4 | 26 / 35 | 5902 |
| 4 | 1 | 71.2 | 92.1 | 29 / 35 | 5953 |
| 5 | 1 | 70.7 | 87.9 | 27 / 35 | 6519 |
| 6 | 1 | 70.0 | 86.7 | 26 / 35 | 6198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 35 | 94% |
| sanja.First 0.1 | 32 | 100% |
| cvt.Firsty 1.0 | 28 | 96% |
| tvv.nano.Polaris 1.2 | 26 | 92% |
| zyx.micro.Ant 1.1 | 21 | 90% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 80% |

Hadur died in 41 of 210 rounds, at a mean tick of 492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 22% | 39 |
| sample.RamFire 1.0 | 9 | 22% | 9 |
| baal.nano.N 1.42 | 6 | 15% | 34 |
| tvv.nano.Polaris 1.2 | 4 | 10% | 52 |
| cvt.Firsty 1.0 | 4 | 10% | 26 |
| squidM.TentalceMeleeNano 1.1 | 3 | 7% | 11 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 10 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 7 |
| sanja.First 0.1 | 0 | 0% | 19 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.7 | 93 / 210 | 3.55 | 16.3% | 32187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.3% | 93 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 56 |
| cs.Wren 1.0 | 3.3 | 11.9% | 14 |
| mz.Cork 0.1 | 4.3 | 11.4% | 15 |
| js.PinBall 1.6 | 4.7 | 10.8% | 12 |
| joe.ADinosaur 1.0 | 5.7 | 9.7% | 5 |
| evd.X1 0.01 | 7.0 | 8.1% | 6 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.0 | 16 / 35 | 5408 |
| 2 | 1 | 65.2 | 74.6 | 17 / 35 | 5258 |
| 3 | 1 | 63.1 | 66.3 | 16 / 35 | 5151 |
| 4 | 1 | 61.0 | 61.3 | 9 / 35 | 5214 |
| 5 | 1 | 67.3 | 77.8 | 20 / 35 | 5786 |
| 6 | 1 | 66.1 | 77.1 | 15 / 35 | 5370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 68% |
| cs.Wren 1.0 | 26 | 88% |
| joe.ADinosaur 1.0 | 9 | 100% |
| js.PinBall 1.6 | 8 | 88% |
| mz.Cork 0.1 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 41% | 100 |
| cs.Wren 1.0 | 20 | 17% | 37 |
| joe.ADinosaur 1.0 | 14 | 12% | 18 |
| evd.X1 0.01 | 11 | 9% | 11 |
| js.PinBall 1.6 | 10 | 8% | 19 |
| mz.Cork 0.1 | 7 | 6% | 15 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.0 | 147 / 210 | 2.08 | 19.7% | 29666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.7% | 147 |
| ntc.Opposite 1.5 | 3.0 | 11.3% | 8 |
| myl.nano.Graviton 1.10 | 3.5 | 11.0% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 1 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 6 |
| DBall.NUKE 0.1 | 7.3 | 7.8% | 4 |
| disan.Chair 2.2.0 | 7.8 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 8.7 | 6.8% | 8 |
| pbg.R2D2 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.2 | 28 / 35 | 5174 |
| 2 | 1 | 68.9 | 88.6 | 24 / 35 | 4726 |
| 3 | 1 | 69.0 | 86.0 | 22 / 35 | 5253 |
| 4 | 1 | 68.4 | 86.0 | 22 / 35 | 4807 |
| 5 | 1 | 67.8 | 85.4 | 21 / 35 | 4836 |
| 6 | 1 | 70.6 | 91.7 | 30 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 95% |
| stelo.AreaTargetingBot 1.1 | 38 | 79% |
| ntc.Opposite 1.5 | 23 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 95% |
| disan.Chair 2.2.0 | 16 | 75% |
| donjezza.Muncho 1.0 | 16 | 94% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 15 | 23% | 39 |
| ntc.Opposite 1.5 | 12 | 18% | 32 |
| myl.nano.Graviton 1.10 | 10 | 15% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 14% | 29 |
| disan.Chair 2.2.0 | 6 | 9% | 23 |
| pfvicm.Sobieski 7.2.3b | 6 | 9% | 13 |
| donjezza.Muncho 1.0 | 4 | 6% | 15 |
| DBall.NUKE 0.1 | 3 | 5% | 13 |
| pbg.R2D2 1.0 | 1 | 2% | 4 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.9 | 86 / 210 | 3.26 | 16.3% | 27120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.3% | 86 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 39 |
| oog.melee.Capulet 1.2 | 2.8 | 13.6% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 26 |
| yagami.Tidus 0.11 | 5.0 | 11.4% | 4 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.3 | 11 / 35 | 4067 |
| 2 | 1 | 66.6 | 78.1 | 16 / 35 | 4687 |
| 3 | 1 | 66.4 | 76.8 | 17 / 35 | 4755 |
| 4 | 1 | 65.7 | 73.0 | 16 / 35 | 4794 |
| 5 | 1 | 64.8 | 74.0 | 15 / 35 | 4216 |
| 6 | 1 | 64.8 | 73.0 | 11 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 91% |
| oog.melee.Capulet 1.2 | 30 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 62% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 9 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 31% | 69 |
| yagami.Tidus 0.11 | 23 | 19% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 33 |
| ejb.Polaris 1.0.1 | 13 | 10% | 20 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 34 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| step.nanoPri 1.0 | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.1 | 118 / 210 | 3.15 | 17.0% | 27894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.0% | 118 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 18 |
| wee.Gem 1.8.4 | 3.0 | 12.0% | 30 |
| wompi.Quokka 1.6 | 3.7 | 11.6% | 18 |
| ratosh.Nobo 0.21 | 5.3 | 10.0% | 9 |
| m3thos.Eva00 1.1 | 5.5 | 10.0% | 11 |
| bayen.UbaMicro 1.4 | 7.2 | 8.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.3% | 1 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.0 | 20 / 35 | 4718 |
| 2 | 1 | 66.3 | 79.0 | 23 / 35 | 4668 |
| 3 | 1 | 64.2 | 71.4 | 16 / 35 | 4748 |
| 4 | 1 | 62.8 | 66.7 | 14 / 35 | 4677 |
| 5 | 1 | 63.0 | 70.5 | 17 / 35 | 4088 |
| 6 | 1 | 69.3 | 88.3 | 28 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 94% |
| wee.Gem 1.8.4 | 29 | 93% |
| wompi.Quokka 1.6 | 21 | 81% |
| m3thos.Eva00 1.1 | 9 | 100% |
| ratosh.Nobo 0.21 | 9 | 89% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |

Hadur died in 92 of 210 rounds, at a mean tick of 378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 14% | 55 |
| ratosh.Nobo 0.21 | 13 | 14% | 20 |
| wompi.Quokka 1.6 | 12 | 13% | 25 |
| bayen.UbaMicro 1.4 | 12 | 13% | 17 |
| maribo.FollowFire 1 | 11 | 12% | 10 |
| wee.Gem 1.8.4 | 9 | 10% | 42 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 14 |
| m3thos.Eva00 1.1 | 7 | 8% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.0 | 130 / 210 | 1.99 | 21.5% | 46530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.5% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 10 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 8.6% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.9% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 88.6 | 22 / 35 | 8145 |
| 2 | 1 | 73.6 | 91.7 | 25 / 35 | 8041 |
| 3 | 1 | 73.2 | 92.4 | 22 / 35 | 7959 |
| 4 | 1 | 72.6 | 89.2 | 24 / 35 | 7555 |
| 5 | 1 | 71.1 | 85.1 | 18 / 35 | 7132 |
| 6 | 1 | 72.0 | 87.0 | 19 / 35 | 7698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 109 | 76% |
| exauge.GateKeeper 1.1.121g | 17 | 100% |
| mz.NanoGod 2.02 | 10 | 50% |
| ayk.WallHugger 1.0 | 10 | 90% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| sample.SittingDuck 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 80 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 51% | 142 |
| mz.NanoGod 2.02 | 24 | 30% | 34 |
| ayk.WallHugger 1.0 | 7 | 9% | 14 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 3% | 9 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.1 | 112 / 210 | 3.24 | 17.3% | 30345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.3% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.0% | 23 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 22 |
| bvh.micro.Freya 0.3 | 4.0 | 10.9% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.1% | 23 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.9% | 6 |
| conscience.Electron 1.3g | 7.2 | 7.7% | 0 |
| ap.Frederick 1.1 | 8.2 | 6.6% | 4 |
| dl.BetterWalls 1.0 | 9.2 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 72.4 | 18 / 35 | 4993 |
| 2 | 1 | 64.8 | 72.4 | 18 / 35 | 4974 |
| 3 | 1 | 66.5 | 76.5 | 18 / 35 | 5186 |
| 4 | 1 | 68.3 | 79.4 | 21 / 35 | 5917 |
| 5 | 1 | 64.9 | 73.3 | 19 / 35 | 4482 |
| 6 | 1 | 65.5 | 76.5 | 18 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 42 | 95% |
| voidious.micro.BlitzBat 1.05 | 37 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| bvh.micro.Freya 0.3 | 18 | 78% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 20% | 49 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 15% | 37 |
| conscience.Electron 1.3g | 13 | 13% | 17 |
| dl.BetterWalls 1.0 | 13 | 13% | 14 |
| dummy.micro.Sparrow 2.5 | 12 | 12% | 50 |
| bvh.micro.Freya 0.3 | 9 | 9% | 22 |
| stelo.MirrorMicro 1.0 | 9 | 9% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 7% | 7 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.7 | 144 / 210 | 2.38 | 20.8% | 41206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.8% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 21 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.2% | 14 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.9% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 4 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.1% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 5 |
| sample.Corners 1.0 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 92.7 | 28 / 35 | 7301 |
| 2 | 1 | 69.8 | 79.0 | 25 / 35 | 6710 |
| 3 | 1 | 69.9 | 83.2 | 21 / 35 | 6493 |
| 4 | 1 | 69.8 | 78.7 | 20 / 35 | 6934 |
| 5 | 1 | 71.9 | 89.2 | 26 / 35 | 7035 |
| 6 | 1 | 70.7 | 85.4 | 24 / 35 | 6733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 92% |
| sul.Lunar 1.1 | 39 | 100% |
| supersample.SuperBoxBot 1.0 | 28 | 79% |
| dsw.StaticD 1.0 | 9 | 67% |
| sample.MyFirstRobot 1.0 | 9 | 78% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| sample.Corners 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |

Hadur died in 66 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 38% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 24% | 62 |
| dsw.StaticD 1.0 | 10 | 15% | 17 |
| tlp.ThreeLeggedPig 1 | 5 | 8% | 9 |
| sul.Lunar 1.1 | 4 | 6% | 45 |
| sample.Corners 1.0 | 4 | 6% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 10 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 82.9 | 127 / 210 | 2.54 | 19.2% | 38356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.2% | 127 |
| radnor.DoctorBob 1.42 | 2.5 | 12.7% | 31 |
| mld.Wisdom 1.0 | 2.5 | 12.9% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.8% | 20 |
| KiraNL.Chupacabra 0.4 | 5.0 | 9.9% | 2 |
| amz.NanoClone 1.41 | 5.5 | 9.7% | 6 |
| sample.Walls 1.0 | 7.0 | 8.0% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.1 | 17 / 35 | 5866 |
| 2 | 1 | 69.7 | 85.1 | 24 / 35 | 6576 |
| 3 | 1 | 69.5 | 85.7 | 20 / 35 | 6801 |
| 4 | 1 | 68.3 | 80.0 | 20 / 35 | 6480 |
| 5 | 1 | 69.3 | 81.3 | 23 / 35 | 6469 |
| 6 | 1 | 69.7 | 87.3 | 23 / 35 | 6164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 89% |
| radnor.DoctorBob 1.42 | 34 | 71% |
| mld.Wisdom 1.0 | 20 | 80% |
| amz.NanoClone 1.41 | 20 | 85% |
| sample.Walls 1.0 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| jangs.ns51 1.0 | 8 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 23 | 28% | 44 |
| radnor.DoctorBob 1.42 | 19 | 23% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 14% | 51 |
| amz.NanoClone 1.41 | 11 | 13% | 23 |
| KiraNL.Chupacabra 0.4 | 10 | 12% | 24 |
| sample.Walls 1.0 | 6 | 7% | 13 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 5 |

