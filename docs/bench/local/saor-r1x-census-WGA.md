# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 88.6 | 139 / 210 | 2.02 | 21.5% | 44763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.5% | 139 |
| radnor.DoctorBob 1.42 | 2.2 | 14.6% | 29 |
| mz.AntiGrav 1.0 | 2.8 | 14.1% | 24 |
| mld.Infinity 2.2 | 4.0 | 12.6% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.9% | 6 |
| sample.Walls 1.0 | 6.5 | 6.3% | 1 |
| jangs.ns51 1.0 | 7.0 | 6.0% | 0 |
| GarmBox.Oranges 1.0 | 7.7 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 92.1 | 24 / 35 | 7196 |
| 2 | 1 | 72.5 | 88.3 | 21 / 35 | 7824 |
| 3 | 1 | 73.8 | 91.7 | 23 / 35 | 8137 |
| 4 | 1 | 72.3 | 88.3 | 25 / 35 | 7200 |
| 5 | 1 | 71.3 | 83.8 | 22 / 35 | 7123 |
| 6 | 1 | 72.1 | 87.6 | 24 / 35 | 7283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 89% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| mld.Infinity 2.2 | 32 | 94% |
| amz.NanoClone 1.41 | 13 | 85% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 44% | 71 |
| mz.AntiGrav 1.0 | 22 | 31% | 75 |
| mld.Infinity 2.2 | 7 | 10% | 32 |
| amz.NanoClone 1.41 | 5 | 7% | 11 |
| sample.Walls 1.0 | 3 | 4% | 9 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.5 | 124 / 210 | 2.30 | 18.9% | 33309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.9% | 124 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.3% | 57 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 14 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 7.9% | 8 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.4% | 2 |
| bzdp.BoxCar 2.0 | 7.7 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 9.2 | 5.0% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 22 / 35 | 5823 |
| 2 | 1 | 69.4 | 84.1 | 24 / 35 | 5943 |
| 3 | 1 | 68.4 | 88.3 | 20 / 35 | 5096 |
| 4 | 1 | 69.2 | 84.4 | 21 / 35 | 5768 |
| 5 | 1 | 68.0 | 84.4 | 19 / 35 | 5361 |
| 6 | 1 | 67.6 | 84.1 | 18 / 35 | 5318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 70 | 87% |
| oog.melee.Mercutio 1.0 | 68 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 41% | 92 |
| mld.DustBunny 3.8 | 25 | 29% | 76 |
| maribo.melee.BMV 0.1 | 7 | 8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 13 |
| zyx.nano.Ant 1.1 | 4 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 5 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 79.2 | 119 / 210 | 2.88 | 19.3% | 37630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.3% | 119 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 10 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.1% | 11 |
| fm.mammillarias 1.3 | 5.2 | 9.5% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 9.3% | 14 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.7% | 2 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.4% | 5 |
| sample.Fire 1.0 | 9.2 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 81.0 | 26 / 35 | 6554 |
| 2 | 1 | 68.0 | 77.5 | 14 / 35 | 5994 |
| 3 | 1 | 71.1 | 84.8 | 21 / 35 | 6895 |
| 4 | 1 | 68.6 | 78.1 | 21 / 35 | 6013 |
| 5 | 1 | 67.5 | 74.0 | 18 / 35 | 5822 |
| 6 | 1 | 68.9 | 79.7 | 19 / 35 | 6352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 89% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 85% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 11 | 82% |
| fm.mammillarias 1.3 | 7 | 71% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 19% | 67 |
| cb.nano.Insomnia 1.0 | 17 | 19% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 18% | 27 |
| myl.nano.KomoriNinja 1.1 | 12 | 13% | 35 |
| fm.mammillarias 1.3 | 10 | 11% | 13 |
| cs.sheldor.Talon 1.1 | 7 | 8% | 12 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 17 |
| sample.Fire 1.0 | 5 | 5% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.2 | 153 / 210 | 2.24 | 20.9% | 41997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.9% | 153 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.0% | 18 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.1% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 2 |
| yk.JahMicro 1.0 | 5.3 | 8.7% | 8 |
| tj.zombie1n 1.0.1 | 6.0 | 8.4% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.5% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.1% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.5 | 29 / 35 | 7581 |
| 2 | 1 | 70.1 | 84.1 | 21 / 35 | 6901 |
| 3 | 1 | 71.8 | 91.4 | 29 / 35 | 7058 |
| 4 | 1 | 72.0 | 89.5 | 26 / 35 | 7363 |
| 5 | 1 | 69.6 | 82.5 | 23 / 35 | 6681 |
| 6 | 1 | 69.2 | 80.3 | 25 / 35 | 6413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 74 | 93% |
| stelo.SoJNanoMelee 1.1 | 27 | 93% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 92% |
| yk.JahMicro 1.0 | 10 | 90% |
| tj.zombie1n 1.0.1 | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 42% | 95 |
| stelo.SoJNanoMelee 1.1 | 11 | 19% | 30 |
| tj.zombie1n 1.0.1 | 5 | 9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 9 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 25 |
| yk.JahMicro 1.0 | 4 | 7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 16 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 70.5 | 93 / 210 | 3.66 | 16.7% | 32617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.7% | 93 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 36 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 19 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.3% | 12 |
| EBBU.Sim2 1.02 | 6.7 | 9.2% | 2 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 68.3 | 16 / 35 | 5327 |
| 2 | 1 | 64.3 | 69.8 | 16 / 35 | 5024 |
| 3 | 1 | 66.4 | 73.7 | 17 / 35 | 5744 |
| 4 | 1 | 66.4 | 74.9 | 14 / 35 | 5831 |
| 5 | 1 | 61.9 | 62.9 | 15 / 35 | 4877 |
| 6 | 1 | 66.7 | 73.3 | 15 / 35 | 5814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 91% |
| oog.melee.Corsair 1.0 | 31 | 55% |
| ahf.NanoAndrew .4 | 26 | 81% |
| EBBU.Sim2 1.02 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 50% |

Hadur died in 119 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 18% | 44 |
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 41 |
| ahf.NanoAndrew .4 | 19 | 16% | 41 |
| EBBU.Sim2 1.02 | 14 | 12% | 25 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 18 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 14 |
| sample.TrackFire 1.0 | 7 | 6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 4% | 6 |
| sam.Samspin 1.0 | 4 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.4 | 148 / 210 | 2.05 | 19.9% | 33107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.9% | 148 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 20 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.5% | 17 |
| arthord.NanoSatanMelee Beta | 4.8 | 9.6% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.4% | 3 |
| fm.claire 1.7 | 6.7 | 8.5% | 0 |
| sample.SpinBot 1.0 | 8.7 | 5.9% | 0 |
| pa.Improved 1.0 | 8.7 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 95.9 | 29 / 35 | 6488 |
| 2 | 1 | 69.8 | 87.9 | 25 / 35 | 5536 |
| 3 | 1 | 67.4 | 84.8 | 17 / 35 | 4820 |
| 4 | 1 | 68.2 | 86.7 | 24 / 35 | 4993 |
| 5 | 1 | 69.0 | 84.1 | 25 / 35 | 5254 |
| 6 | 1 | 70.9 | 90.8 | 28 / 35 | 6016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 91% |
| oog.melee.CapuletDroid 1.1 | 36 | 94% |
| arthord.NanoSatanMelee Beta | 18 | 78% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 63 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 35% | 91 |
| arthord.NanoSatanMelee Beta | 11 | 17% | 20 |
| oog.melee.CapuletDroid 1.1 | 9 | 14% | 42 |
| gh.nano.Grofvuil 0.2 | 8 | 13% | 27 |
| fm.claire 1.7 | 7 | 11% | 10 |
| kurios.DOSexe .9b | 2 | 3% | 5 |
| pa.Improved 1.0 | 2 | 3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 1 | 2% | 10 |
| sample.SpinBot 1.0 | 1 | 2% | 2 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 80.1 | 106 / 210 | 2.79 | 18.2% | 35238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.2% | 106 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.5% | 26 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.4% | 39 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 29 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 2 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 5 |
| el.JumpShoot 0.2 | 7.3 | 6.7% | 1 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 19 / 35 | 6490 |
| 2 | 1 | 67.2 | 76.5 | 20 / 35 | 5676 |
| 3 | 1 | 67.7 | 79.7 | 15 / 35 | 5982 |
| 4 | 1 | 67.8 | 81.9 | 15 / 35 | 5638 |
| 5 | 1 | 67.1 | 77.8 | 19 / 35 | 5631 |
| 6 | 1 | 67.8 | 79.7 | 18 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 89% |
| mz.MicroGodMelee 1 | 32 | 63% |
| gh.micro.Gruweltje 0.7 | 30 | 83% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 30% | 74 |
| mz.MicroGodMelee 1 | 31 | 30% | 52 |
| gh.micro.Gruweltje 0.7 | 22 | 21% | 52 |
| acogdev.alpha 0.2 | 6 | 6% | 5 |
| fire219.CatBot 1.0 | 5 | 5% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 9 |
| DBall.Anarchy 0.1 | 4 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 73.5 | 111 / 210 | 3.38 | 17.1% | 31647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.1% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.9% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 28 |
| germ.TheMind .2 | 4.8 | 9.3% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 5 |
| awesomeness.Elite 1.0 | 5.7 | 8.9% | 7 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.5% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 76.2 | 20 / 35 | 5687 |
| 2 | 1 | 67.7 | 81.0 | 23 / 35 | 5372 |
| 3 | 1 | 66.6 | 74.0 | 20 / 35 | 5342 |
| 4 | 1 | 67.7 | 79.7 | 20 / 35 | 5423 |
| 5 | 1 | 62.3 | 64.4 | 13 / 35 | 4783 |
| 6 | 1 | 63.5 | 66.0 | 15 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| germ.TheMind .2 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 38% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 21% | 37 |
| awesomeness.Elite 1.0 | 9 | 9% | 12 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 16 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 10 |
| germ.TheMind .2 | 6 | 6% | 14 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.4 | 156 / 210 | 1.87 | 20.7% | 33674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.7% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.9% | 6 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 5 |
| timmit.nano.TimDog 0.33 | 4.7 | 9.9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.6% | 1 |
| stelo.PatternRobot 1.0 | 7.2 | 8.3% | 6 |
| ratosh.Wesco 1.4 | 7.7 | 7.9% | 3 |
| spinnercat.Omen 1.0 | 8.7 | 7.0% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.4 | 27 / 35 | 5318 |
| 2 | 1 | 71.3 | 90.8 | 27 / 35 | 5408 |
| 3 | 1 | 71.7 | 89.8 | 28 / 35 | 6132 |
| 4 | 1 | 71.6 | 91.4 | 27 / 35 | 5951 |
| 5 | 1 | 71.6 | 93.0 | 24 / 35 | 5614 |
| 6 | 1 | 69.2 | 84.8 | 23 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 93% |
| nz.jdc.nano.GridFu 1.0 | 37 | 100% |
| timmit.nano.TimDog 0.33 | 18 | 83% |
| stelo.PatternRobot 1.0 | 14 | 79% |
| maribo.IotaCT 1.1 | 7 | 100% |
| ratosh.Wesco 1.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 30% | 72 |
| timmit.nano.TimDog 0.33 | 12 | 22% | 33 |
| stelo.PatternRobot 1.0 | 8 | 15% | 17 |
| ratosh.Wesco 1.4 | 6 | 11% | 12 |
| maribo.IotaCT 1.1 | 5 | 9% | 21 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 41 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 6 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 91.2 | 168 / 210 | 1.80 | 21.9% | 42654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.9% | 168 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.0% | 20 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 7 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.4% | 2 |
| zyx.micro.Ant 1.1 | 5.5 | 8.9% | 7 |
| sanja.First 0.1 | 5.7 | 8.4% | 0 |
| cvt.Firsty 1.0 | 7.3 | 7.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 97.5 | 32 / 35 | 7765 |
| 2 | 1 | 71.4 | 90.2 | 28 / 35 | 6780 |
| 3 | 1 | 71.8 | 89.5 | 28 / 35 | 7105 |
| 4 | 1 | 70.6 | 84.1 | 25 / 35 | 6939 |
| 5 | 1 | 71.8 | 94.6 | 27 / 35 | 6741 |
| 6 | 1 | 72.3 | 91.1 | 28 / 35 | 7324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 57 | 93% |
| baal.nano.N 1.42 | 38 | 89% |
| cvt.Firsty 1.0 | 23 | 96% |
| sanja.First 0.1 | 20 | 100% |
| zyx.micro.Ant 1.1 | 13 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 26% | 63 |
| baal.nano.N 1.42 | 10 | 24% | 39 |
| zyx.micro.Ant 1.1 | 10 | 24% | 36 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 13 |
| sample.RamFire 1.0 | 3 | 7% | 3 |
| cvt.Firsty 1.0 | 2 | 5% | 22 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 5 |
| sanja.First 0.1 | 0 | 0% | 21 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 65.3 | 79 / 210 | 4.12 | 15.2% | 32453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 15.2% | 79 |
| kc.micro.Figment 1.0 | 1.8 | 14.1% | 59 |
| cs.Wren 1.0 | 3.2 | 12.9% | 31 |
| js.PinBall 1.6 | 4.2 | 11.3% | 11 |
| mz.Cork 0.1 | 4.7 | 11.1% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 6 |
| evd.X1 0.01 | 7.2 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 7.8 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.8% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 60.0 | 10 / 35 | 5558 |
| 2 | 1 | 63.6 | 67.6 | 15 / 35 | 5282 |
| 3 | 1 | 63.5 | 66.3 | 12 / 35 | 5651 |
| 4 | 1 | 60.4 | 58.7 | 10 / 35 | 5302 |
| 5 | 1 | 63.7 | 67.3 | 15 / 35 | 5459 |
| 6 | 1 | 64.0 | 72.1 | 17 / 35 | 5201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 69% |
| cs.Wren 1.0 | 24 | 83% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 9 | 78% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 40% | 93 |
| cs.Wren 1.0 | 20 | 15% | 33 |
| joe.ADinosaur 1.0 | 14 | 11% | 17 |
| js.PinBall 1.6 | 12 | 9% | 17 |
| evd.X1 0.01 | 12 | 9% | 13 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| mz.Cork 0.1 | 8 | 6% | 13 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 8 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.9 | 134 / 210 | 2.45 | 19.2% | 30786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.2% | 134 |
| myl.nano.Graviton 1.10 | 2.2 | 12.2% | 30 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.3% | 10 |
| ntc.Opposite 1.5 | 4.0 | 10.6% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 5 |
| disan.Chair 2.2.0 | 6.5 | 8.7% | 9 |
| pfvicm.Sobieski 7.2.3b | 6.7 | 8.9% | 4 |
| DBall.NUKE 0.1 | 7.2 | 8.4% | 7 |
| donjezza.Muncho 1.0 | 8.8 | 6.2% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 25 / 35 | 5040 |
| 2 | 1 | 70.3 | 90.5 | 25 / 35 | 5350 |
| 3 | 1 | 67.6 | 79.4 | 21 / 35 | 4854 |
| 4 | 1 | 67.8 | 80.6 | 21 / 35 | 4971 |
| 5 | 1 | 68.0 | 81.9 | 18 / 35 | 5575 |
| 6 | 1 | 68.1 | 82.9 | 24 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 80% |
| stelo.AreaTargetingBot 1.1 | 29 | 93% |
| ntc.Opposite 1.5 | 18 | 89% |
| disan.Chair 2.2.0 | 18 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| donjezza.Muncho 1.0 | 13 | 92% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 25% | 49 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 19 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 41 |
| ntc.Opposite 1.5 | 11 | 14% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 22 |
| disan.Chair 2.2.0 | 4 | 5% | 15 |
| DBall.NUKE 0.1 | 3 | 4% | 16 |
| donjezza.Muncho 1.0 | 3 | 4% | 13 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.3 | 86 / 210 | 3.31 | 16.4% | 28056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 16.4% | 86 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 39 |
| oog.melee.Capulet 1.2 | 3.2 | 13.8% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 17 |
| yagami.Tidus 0.11 | 4.2 | 12.2% | 12 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 4 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.2 | 16 / 35 | 5286 |
| 2 | 2 | 63.7 | 68.6 | 12 / 35 | 4383 |
| 3 | 1 | 64.7 | 71.7 | 13 / 35 | 4452 |
| 4 | 1 | 64.0 | 69.5 | 12 / 35 | 4485 |
| 5 | 1 | 67.0 | 79.4 | 17 / 35 | 4711 |
| 6 | 1 | 66.3 | 74.6 | 16 / 35 | 4739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 89% |
| kawigi.micro.Shiz 1.1 | 27 | 93% |
| yagami.Tidus 0.11 | 12 | 100% |
| ejb.Polaris 1.0.1 | 7 | 71% |

Hadur died in 124 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 37% | 65 |
| yagami.Tidus 0.11 | 17 | 14% | 30 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 39 |
| ejb.Polaris 1.0.1 | 16 | 13% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 36 |
| step.nanoPri 1.0 | 7 | 6% | 7 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.9 | 131 / 210 | 2.90 | 17.8% | 28862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.8% | 131 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 18 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 20 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 17 |
| ratosh.Nobo 0.21 | 4.7 | 10.8% | 11 |
| m3thos.Eva00 1.1 | 5.3 | 10.4% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 74.6 | 19 / 35 | 4724 |
| 2 | 1 | 68.0 | 84.1 | 24 / 35 | 4908 |
| 3 | 1 | 67.7 | 82.9 | 23 / 35 | 4777 |
| 4 | 1 | 67.2 | 80.0 | 23 / 35 | 5001 |
| 5 | 1 | 67.1 | 81.9 | 24 / 35 | 4551 |
| 6 | 1 | 64.4 | 69.8 | 18 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 95% |
| wee.Gem 1.8.4 | 36 | 94% |
| ratosh.Nobo 0.21 | 17 | 88% |
| m3thos.Eva00 1.1 | 11 | 73% |
| wompi.Quokka 1.6 | 11 | 91% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 382. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 15% | 61 |
| ratosh.Nobo 0.21 | 10 | 13% | 22 |
| stelo.MyAgileRobot 0.2 | 10 | 13% | 11 |
| maribo.FollowFire 1 | 10 | 13% | 10 |
| wee.Gem 1.8.4 | 9 | 11% | 50 |
| m3thos.Eva00 1.1 | 8 | 10% | 23 |
| wompi.Quokka 1.6 | 8 | 10% | 17 |
| bayen.UbaMicro 1.4 | 6 | 8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 89.4 | 130 / 210 | 1.95 | 22.2% | 50640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.2% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 20 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 2 |
| ayk.WallHugger 1.0 | 4.8 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 90.5 | 20 / 35 | 8731 |
| 2 | 1 | 75.0 | 93.7 | 28 / 35 | 8611 |
| 3 | 1 | 73.4 | 89.2 | 20 / 35 | 8249 |
| 4 | 1 | 73.4 | 91.4 | 23 / 35 | 8278 |
| 5 | 1 | 74.6 | 93.3 | 23 / 35 | 8664 |
| 6 | 1 | 70.7 | 78.4 | 16 / 35 | 8107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 120 | 82% |
| mz.NanoGod 2.02 | 17 | 71% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| ayk.WallHugger 1.0 | 5 | 80% |
| stuff.Vlad 0.1 | 3 | 67% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 43% | 137 |
| mz.NanoGod 2.02 | 27 | 33% | 39 |
| ayk.WallHugger 1.0 | 6 | 7% | 10 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 10 |
| stuff.Vlad 0.1 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.3 | 107 / 210 | 3.40 | 16.9% | 29934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.9% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 19 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 22 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.7% | 23 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.6% | 9 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 6.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 72.1 | 21 / 35 | 5071 |
| 2 | 1 | 68.3 | 81.6 | 22 / 35 | 5604 |
| 3 | 1 | 64.4 | 71.7 | 14 / 35 | 4972 |
| 4 | 1 | 65.6 | 74.0 | 18 / 35 | 5156 |
| 5 | 1 | 63.6 | 69.2 | 17 / 35 | 4546 |
| 6 | 1 | 63.6 | 71.1 | 15 / 35 | 4585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 78% |
| dummy.micro.Sparrow 2.5 | 18 | 89% |
| bvh.micro.Freya 0.3 | 17 | 82% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 61 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 31 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 17% | 43 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 16 |
| bvh.micro.Freya 0.3 | 12 | 12% | 23 |
| conscience.Electron 1.3g | 11 | 11% | 14 |
| dl.BetterWalls 1.0 | 7 | 7% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 85.0 | 148 / 210 | 2.35 | 21.6% | 44966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.6% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.8% | 26 |
| sul.Lunar 1.1 | 3.0 | 11.7% | 11 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.5% | 10 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.1% | 3 |
| dsw.StaticD 1.0 | 6.3 | 7.9% | 5 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.2% | 5 |
| sample.Corners 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 83.2 | 22 / 35 | 7484 |
| 2 | 1 | 72.1 | 83.2 | 24 / 35 | 7770 |
| 3 | 1 | 71.2 | 86.0 | 22 / 35 | 6981 |
| 4 | 1 | 72.8 | 87.0 | 26 / 35 | 7918 |
| 5 | 1 | 71.6 | 84.8 | 27 / 35 | 7449 |
| 6 | 1 | 72.5 | 85.7 | 27 / 35 | 7364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 87% |
| sul.Lunar 1.1 | 45 | 98% |
| supersample.SuperBoxBot 1.0 | 30 | 97% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| dsw.StaticD 1.0 | 7 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 29% | 64 |
| supersample.SuperBoxBot 1.0 | 14 | 23% | 37 |
| sul.Lunar 1.1 | 10 | 16% | 52 |
| dsw.StaticD 1.0 | 6 | 10% | 15 |
| tlp.ThreeLeggedPig 1 | 5 | 8% | 8 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.2 | 106 / 210 | 2.78 | 18.7% | 39826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.7% | 106 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 29 |
| mld.Wisdom 1.0 | 3.2 | 11.7% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.6% | 22 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.6% | 13 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 8 |
| GarmBox.Oranges 1.0 | 7.5 | 7.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 6 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 6 |
| sample.Target 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.3 | 14 / 35 | 6986 |
| 2 | 1 | 66.8 | 74.6 | 17 / 35 | 6171 |
| 3 | 1 | 68.2 | 77.8 | 21 / 35 | 6723 |
| 4 | 1 | 68.4 | 81.6 | 16 / 35 | 6865 |
| 5 | 1 | 68.7 | 82.5 | 20 / 35 | 6484 |
| 6 | 1 | 67.8 | 78.4 | 18 / 35 | 6597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 80% |
| radnor.DoctorBob 1.42 | 31 | 71% |
| mld.Wisdom 1.0 | 18 | 72% |
| KiraNL.Chupacabra 0.4 | 15 | 73% |
| jangs.ns51 1.0 | 9 | 78% |
| amz.NanoClone 1.41 | 9 | 78% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 25 | 24% | 41 |
| radnor.DoctorBob 1.42 | 23 | 22% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 17% | 52 |
| KiraNL.Chupacabra 0.4 | 18 | 17% | 29 |
| amz.NanoClone 1.41 | 8 | 8% | 12 |
| jangs.ns51 1.0 | 6 | 6% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 8 |
| sample.Walls 1.0 | 3 | 3% | 8 |

