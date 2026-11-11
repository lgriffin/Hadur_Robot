# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.7 | 134 / 210 | 2.29 | 20.9% | 43903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.9% | 134 |
| mz.AntiGrav 1.0 | 2.8 | 13.8% | 21 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 32 |
| mld.Infinity 2.2 | 3.3 | 13.2% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.9% | 0 |
| sample.Walls 1.0 | 7.0 | 6.7% | 2 |
| jangs.ns51 1.0 | 7.5 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 8.7 | 4.7% | 2 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 83.5 | 24 / 35 | 7572 |
| 2 | 1 | 72.1 | 86.0 | 21 / 35 | 7491 |
| 3 | 1 | 71.8 | 87.3 | 22 / 35 | 7094 |
| 4 | 1 | 70.9 | 83.2 | 22 / 35 | 7148 |
| 5 | 1 | 71.5 | 85.1 | 20 / 35 | 7323 |
| 6 | 1 | 72.0 | 88.9 | 25 / 35 | 7275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 95% |
| mld.Infinity 2.2 | 35 | 89% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| jangs.ns51 1.0 | 5 | 80% |
| arthord.MannyPacquiao Beta | 4 | 50% |
| amz.NanoClone 1.41 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 39% | 69 |
| mz.AntiGrav 1.0 | 20 | 26% | 69 |
| mld.Infinity 2.2 | 11 | 14% | 44 |
| sample.Walls 1.0 | 4 | 5% | 5 |
| jangs.ns51 1.0 | 3 | 4% | 7 |
| arthord.MannyPacquiao Beta | 3 | 4% | 5 |
| GarmBox.Oranges 1.0 | 3 | 4% | 5 |
| amz.NanoClone 1.41 | 2 | 3% | 5 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.9 | 125 / 210 | 2.27 | 19.0% | 33727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.0% | 125 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.9% | 53 |
| mld.DustBunny 3.8 | 3.2 | 12.9% | 15 |
| maribo.melee.BMV 0.1 | 4.7 | 9.8% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 2 |
| zyx.nano.Ant 1.1 | 6.0 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 7.8% | 10 |
| bzdp.BoxCar 2.0 | 8.2 | 7.1% | 0 |
| fullsail.SweetTea 1.1 | 8.8 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.1 | 21 / 35 | 6115 |
| 2 | 1 | 68.0 | 85.1 | 20 / 35 | 5514 |
| 3 | 1 | 68.4 | 84.8 | 19 / 35 | 5782 |
| 4 | 1 | 69.2 | 87.0 | 22 / 35 | 5421 |
| 5 | 1 | 69.3 | 86.0 | 25 / 35 | 5358 |
| 6 | 1 | 67.6 | 80.3 | 18 / 35 | 5537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 74% |
| mld.DustBunny 3.8 | 48 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 34% | 79 |
| mld.DustBunny 3.8 | 24 | 28% | 66 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 9% | 18 |
| fullsail.SweetTea 1.1 | 7 | 8% | 13 |
| zyx.nano.Ant 1.1 | 5 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 10 |
| maribo.melee.BMV 0.1 | 3 | 4% | 9 |
| bzdp.BoxCar 2.0 | 3 | 4% | 6 |
| cs.Grudge 1.0 | 2 | 2% | 1 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 83.9 | 132 / 210 | 2.45 | 20.3% | 39157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.3% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.1% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.7% | 13 |
| fm.mammillarias 1.3 | 5.5 | 9.1% | 2 |
| cb.nano.Insomnia 1.0 | 5.8 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 5 |
| sample.Fire 1.0 | 9.3 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 90.8 | 25 / 35 | 6991 |
| 2 | 1 | 71.9 | 89.5 | 27 / 35 | 6499 |
| 3 | 1 | 70.2 | 84.4 | 19 / 35 | 6395 |
| 4 | 1 | 68.3 | 75.2 | 20 / 35 | 6125 |
| 5 | 1 | 69.3 | 78.7 | 19 / 35 | 6382 |
| 6 | 1 | 70.6 | 84.4 | 22 / 35 | 6765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 86% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 21 | 86% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 27% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 26% | 34 |
| myl.nano.KomoriNinja 1.1 | 12 | 15% | 42 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 18 |
| sample.Fire 1.0 | 6 | 8% | 8 |
| fm.mammillarias 1.3 | 5 | 6% | 7 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 15 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.0 | 143 / 210 | 2.26 | 20.5% | 39365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.5% | 143 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.3% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 5.2 | 9.1% | 14 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.4% | 6 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 3 |
| repositorio.NanoStep 1.0 | 9.3 | 5.9% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.6 | 24 / 35 | 7168 |
| 2 | 1 | 68.8 | 81.3 | 22 / 35 | 5943 |
| 3 | 1 | 67.7 | 77.5 | 19 / 35 | 6150 |
| 4 | 1 | 72.4 | 93.3 | 27 / 35 | 6967 |
| 5 | 1 | 70.6 | 85.7 | 26 / 35 | 6418 |
| 6 | 1 | 71.3 | 90.5 | 25 / 35 | 6719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 90% |
| stelo.SoJNanoMelee 1.1 | 26 | 92% |
| tj.zombie1n 1.0.1 | 18 | 78% |
| tvv.micro.Antares 1.1.1 | 17 | 65% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 73% |
| yk.JahMicro 1.0 | 9 | 89% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 30% | 89 |
| tvv.micro.Antares 1.1.1 | 13 | 19% | 35 |
| yk.JahMicro 1.0 | 9 | 13% | 13 |
| tj.zombie1n 1.0.1 | 9 | 13% | 12 |
| stelo.SoJNanoMelee 1.1 | 8 | 12% | 24 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.2 | 89 / 210 | 3.95 | 15.6% | 29082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 15.6% | 89 |
| oog.melee.Corsair 1.0 | 2.2 | 13.0% | 37 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.4% | 24 |
| EBBU.Sim2 1.02 | 5.7 | 9.6% | 7 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.0% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 73.0 | 17 / 35 | 5228 |
| 2 | 2 | 61.0 | 64.4 | 12 / 35 | 4312 |
| 3 | 1 | 60.9 | 61.3 | 14 / 35 | 4405 |
| 4 | 1 | 65.9 | 74.0 | 18 / 35 | 5331 |
| 5 | 1 | 59.0 | 55.2 | 11 / 35 | 4496 |
| 6 | 1 | 66.2 | 75.6 | 17 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 95% |
| oog.melee.Corsair 1.0 | 28 | 64% |
| ahf.NanoAndrew .4 | 17 | 65% |
| sam.Samspin 1.0 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 366. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 20% | 54 |
| oog.melee.Corsair 1.0 | 18 | 15% | 40 |
| ahf.NanoAndrew .4 | 16 | 13% | 29 |
| zyx.nano.BacillusComma 1.0 | 16 | 13% | 19 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 22 |
| EBBU.Sim2 1.02 | 10 | 8% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 11 |
| sam.Samspin 1.0 | 8 | 7% | 12 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.8 | 126 / 210 | 2.37 | 19.0% | 32648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.0% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.5% | 41 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.5% | 13 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.7% | 15 |
| fm.claire 1.7 | 5.2 | 9.1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 7 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.7% | 5 |
| sample.SpinBot 1.0 | 8.5 | 6.4% | 0 |
| pa.Improved 1.0 | 8.5 | 6.0% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.8 | 20 / 35 | 5453 |
| 2 | 1 | 70.5 | 91.1 | 26 / 35 | 5582 |
| 3 | 1 | 66.2 | 78.1 | 17 / 35 | 5035 |
| 4 | 1 | 69.1 | 86.0 | 22 / 35 | 5557 |
| 5 | 1 | 70.2 | 89.2 | 23 / 35 | 5999 |
| 6 | 1 | 66.8 | 80.3 | 18 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 82% |
| oog.melee.CapuletDroid 1.1 | 25 | 96% |
| gh.nano.Grofvuil 0.2 | 15 | 87% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 36% | 87 |
| arthord.NanoSatanMelee Beta | 12 | 14% | 19 |
| gh.nano.Grofvuil 0.2 | 11 | 13% | 26 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 35 |
| fm.claire 1.7 | 9 | 10% | 16 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 16 |
| sample.SpinBot 1.0 | 5 | 6% | 5 |
| pa.Improved 1.0 | 2 | 2% | 3 |
| kurios.DOSexe .9b | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.5 | 101 / 210 | 2.76 | 18.2% | 34739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.2% | 101 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 32 |
| mz.MicroGodMelee 1 | 3.2 | 13.9% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.7% | 34 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 1 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 78.7 | 19 / 35 | 5878 |
| 2 | 1 | 68.3 | 81.6 | 14 / 35 | 6077 |
| 3 | 1 | 65.2 | 73.7 | 16 / 35 | 5030 |
| 4 | 1 | 67.1 | 78.4 | 16 / 35 | 5442 |
| 5 | 1 | 68.9 | 81.6 | 18 / 35 | 6133 |
| 6 | 1 | 69.8 | 88.9 | 18 / 35 | 6179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 78% |
| mz.MicroGodMelee 1 | 48 | 71% |
| gh.micro.Gruweltje 0.7 | 24 | 79% |
| DBall.Anarchy 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 35% | 73 |
| gh.micro.Gruweltje 0.7 | 27 | 25% | 54 |
| spinnercat.micro.Tyger 0.1 | 23 | 21% | 50 |
| acogdev.alpha 0.2 | 8 | 7% | 10 |
| fire219.CatBot 1.0 | 6 | 5% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 3 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.0 | 84 / 210 | 3.97 | 15.7% | 30824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.3% | 52 |
| hadur117.micro.SaorWG4 0.1 | 1.8 | 15.7% | 84 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.7% | 37 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.6% | 4 |
| germ.TheMind .2 | 6.0 | 8.6% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.2% | 8 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.3% | 8 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 63.2 | 14 / 35 | 5261 |
| 2 | 3 | 57.3 | 52.4 | 8 / 35 | 4253 |
| 3 | 3 | 60.5 | 59.7 | 12 / 35 | 4756 |
| 4 | 1 | 65.7 | 74.0 | 17 / 35 | 5057 |
| 5 | 1 | 65.1 | 71.1 | 15 / 35 | 5488 |
| 6 | 1 | 68.8 | 81.6 | 18 / 35 | 6009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 64% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| germ.TheMind .2 | 4 | 50% |
| sample.Crazy 1.0 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 48% | 112 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 16% | 33 |
| germ.TheMind .2 | 12 | 10% | 17 |
| stelo.UntouchableNano 1.3 | 12 | 10% | 16 |
| awesomeness.Elite 1.0 | 11 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 5 |
| mym.EdgeStalker 1.0 | 3 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.2 | 147 / 210 | 1.80 | 20.9% | 34551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.9% | 147 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.2% | 2 |
| maribo.IotaCT 1.1 | 3.8 | 10.2% | 5 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.5% | 15 |
| ratosh.Wesco 1.4 | 6.7 | 8.3% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 7.8% | 8 |
| spinnercat.Omen 1.0 | 8.5 | 6.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.0 | 23 / 35 | 5612 |
| 2 | 1 | 72.6 | 96.2 | 28 / 35 | 5651 |
| 3 | 1 | 70.3 | 86.7 | 23 / 35 | 5566 |
| 4 | 1 | 70.7 | 89.8 | 23 / 35 | 5484 |
| 5 | 1 | 71.6 | 90.5 | 26 / 35 | 6070 |
| 6 | 1 | 71.6 | 89.8 | 24 / 35 | 6168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 87% |
| nz.jdc.nano.GridFu 1.0 | 47 | 100% |
| timmit.nano.TimDog 0.33 | 21 | 52% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| maribo.IotaCT 1.1 | 9 | 78% |
| ratosh.Wesco 1.4 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 30% | 70 |
| timmit.nano.TimDog 0.33 | 17 | 27% | 32 |
| stelo.PatternRobot 1.0 | 9 | 14% | 18 |
| maribo.IotaCT 1.1 | 7 | 11% | 19 |
| ratosh.Wesco 1.4 | 4 | 6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 7 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 49 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.6 | 160 / 210 | 1.84 | 21.4% | 39922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.4% | 160 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.2% | 23 |
| baal.nano.N 1.42 | 3.0 | 11.9% | 5 |
| zyx.micro.Ant 1.1 | 4.5 | 9.6% | 8 |
| Grystrion.TrackerWO 1.0 | 5.5 | 9.5% | 2 |
| sanja.First 0.1 | 5.8 | 8.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 7.8% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.2% | 5 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.1% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.3 | 22 / 35 | 6634 |
| 2 | 1 | 72.4 | 92.7 | 30 / 35 | 6851 |
| 3 | 1 | 71.5 | 92.4 | 28 / 35 | 6711 |
| 4 | 1 | 72.0 | 92.4 | 28 / 35 | 6654 |
| 5 | 1 | 72.2 | 90.5 | 28 / 35 | 7030 |
| 6 | 1 | 70.2 | 89.5 | 24 / 35 | 6042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 77% |
| baal.nano.N 1.42 | 35 | 97% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| cvt.Firsty 1.0 | 22 | 91% |
| sanja.First 0.1 | 19 | 89% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 16 | 32% | 61 |
| zyx.micro.Ant 1.1 | 11 | 22% | 36 |
| baal.nano.N 1.42 | 7 | 14% | 42 |
| sanja.First 0.1 | 6 | 12% | 21 |
| cvt.Firsty 1.0 | 4 | 8% | 20 |
| Grystrion.TrackerWO 1.0 | 2 | 4% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 4 |
| sample.RamFire 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 67.0 | 81 / 210 | 3.97 | 15.6% | 33259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 15.6% | 81 |
| kc.micro.Figment 1.0 | 2.2 | 14.7% | 66 |
| cs.Wren 1.0 | 3.0 | 12.3% | 21 |
| js.PinBall 1.6 | 4.3 | 11.2% | 18 |
| mz.Cork 0.1 | 4.5 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 4 |
| evd.X1 0.01 | 6.8 | 8.2% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 73.0 | 19 / 35 | 5567 |
| 2 | 1 | 64.7 | 71.4 | 13 / 35 | 5837 |
| 3 | 2 | 62.3 | 64.8 | 13 / 35 | 5104 |
| 4 | 1 | 63.6 | 68.3 | 13 / 35 | 5363 |
| 5 | 1 | 61.1 | 60.0 | 12 / 35 | 5420 |
| 6 | 1 | 63.4 | 64.4 | 11 / 35 | 5968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 74% |
| cs.Wren 1.0 | 21 | 62% |
| mz.Cork 0.1 | 13 | 92% |
| js.PinBall 1.6 | 7 | 86% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 39% | 92 |
| cs.Wren 1.0 | 31 | 24% | 43 |
| evd.X1 0.01 | 17 | 13% | 19 |
| js.PinBall 1.6 | 8 | 6% | 17 |
| joe.ADinosaur 1.0 | 8 | 6% | 10 |
| mz.Cork 0.1 | 7 | 5% | 13 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.9 | 137 / 210 | 2.45 | 19.3% | 31338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.3% | 137 |
| ntc.Opposite 1.5 | 3.0 | 11.6% | 7 |
| myl.nano.Graviton 1.10 | 3.8 | 11.1% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 5 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.3% | 15 |
| disan.Chair 2.2.0 | 6.7 | 8.4% | 7 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.8 | 27 / 35 | 5567 |
| 2 | 1 | 67.3 | 79.0 | 22 / 35 | 5044 |
| 3 | 1 | 67.4 | 79.4 | 17 / 35 | 5179 |
| 4 | 1 | 68.7 | 84.1 | 24 / 35 | 4916 |
| 5 | 1 | 69.0 | 85.4 | 23 / 35 | 5375 |
| 6 | 1 | 69.3 | 85.4 | 24 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 91% |
| disan.Chair 2.2.0 | 24 | 83% |
| ntc.Opposite 1.5 | 23 | 83% |
| stelo.AreaTargetingBot 1.1 | 21 | 81% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| pfvicm.Sobieski 7.2.3b | 14 | 100% |
| donjezza.Muncho 1.0 | 11 | 82% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 75 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 16 | 21% | 31 |
| myl.nano.Graviton 1.10 | 14 | 19% | 40 |
| ntc.Opposite 1.5 | 12 | 16% | 32 |
| stelo.AreaTargetingBot 1.1 | 11 | 15% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 9% | 23 |
| disan.Chair 2.2.0 | 6 | 8% | 18 |
| DBall.NUKE 0.1 | 4 | 5% | 15 |
| donjezza.Muncho 1.0 | 3 | 4% | 10 |
| pbg.R2D2 1.0 | 2 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.1 | 86 / 210 | 3.51 | 16.0% | 28125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 16.0% | 86 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 29 |
| oog.melee.Capulet 1.2 | 3.5 | 13.4% | 40 |
| yagami.Tidus 0.11 | 3.8 | 12.5% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 26 |
| ejb.Polaris 1.0.1 | 5.5 | 11.3% | 15 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.8 | 19 / 35 | 4645 |
| 2 | 1 | 65.3 | 71.1 | 15 / 35 | 4804 |
| 3 | 1 | 66.5 | 75.6 | 15 / 35 | 4851 |
| 4 | 2 | 60.7 | 58.4 | 12 / 35 | 4184 |
| 5 | 1 | 66.4 | 79.4 | 12 / 35 | 4826 |
| 6 | 1 | 64.3 | 70.2 | 13 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 93% |
| oog.melee.Capulet 1.2 | 26 | 46% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 77% |
| yagami.Tidus 0.11 | 20 | 90% |
| ejb.Polaris 1.0.1 | 11 | 82% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 37% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 39 |
| yagami.Tidus 0.11 | 19 | 15% | 37 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 26 |
| ejb.Polaris 1.0.1 | 10 | 8% | 25 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.1 | 119 / 210 | 3.24 | 17.0% | 27930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.0% | 119 |
| bzdp.Pansy 2.1 | 2.2 | 12.8% | 21 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 25 |
| ratosh.Nobo 0.21 | 4.2 | 11.0% | 11 |
| wompi.Quokka 1.6 | 4.2 | 11.6% | 21 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 9 |
| bayen.UbaMicro 1.4 | 7.0 | 8.8% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.4% | 0 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.2% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.6 | 20 / 35 | 4294 |
| 2 | 1 | 66.5 | 76.8 | 20 / 35 | 4770 |
| 3 | 1 | 60.8 | 62.9 | 12 / 35 | 4392 |
| 4 | 1 | 69.0 | 86.3 | 24 / 35 | 5146 |
| 5 | 1 | 63.3 | 67.0 | 18 / 35 | 4414 |
| 6 | 1 | 68.0 | 82.9 | 25 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 94% |
| wee.Gem 1.8.4 | 36 | 92% |
| ratosh.Nobo 0.21 | 15 | 93% |
| wompi.Quokka 1.6 | 11 | 100% |
| m3thos.Eva00 1.1 | 8 | 75% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 15 | 16% | 49 |
| ratosh.Nobo 0.21 | 13 | 14% | 21 |
| bzdp.Pansy 2.1 | 12 | 13% | 55 |
| maribo.FollowFire 1 | 12 | 13% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 10 |
| wompi.Quokka 1.6 | 8 | 9% | 22 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 10 |
| m3thos.Eva00 1.1 | 7 | 8% | 16 |
| bayen.UbaMicro 1.4 | 6 | 7% | 11 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.7 | 126 / 210 | 1.92 | 22.4% | 51307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 22.4% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 64 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 16 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.6% | 0 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 92.4 | 22 / 35 | 8326 |
| 2 | 1 | 72.9 | 86.3 | 17 / 35 | 8453 |
| 3 | 1 | 75.3 | 93.7 | 25 / 35 | 9239 |
| 4 | 1 | 74.8 | 94.0 | 23 / 35 | 8891 |
| 5 | 1 | 73.3 | 88.6 | 22 / 35 | 8357 |
| 6 | 1 | 72.2 | 83.5 | 17 / 35 | 8041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 77% |
| exauge.GateKeeper 1.1.121g | 15 | 80% |
| mz.NanoGod 2.02 | 13 | 69% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 51 | 61% | 147 |
| mz.NanoGod 2.02 | 21 | 25% | 32 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 17 |
| ayk.WallHugger 1.0 | 3 | 4% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.3 | 97 / 210 | 3.49 | 16.6% | 29258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.6% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.6% | 31 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 18 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 9 |
| conscience.Electron 1.3g | 7.3 | 7.7% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 10 |
| dl.BetterWalls 1.0 | 9.0 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 63.2 | 11 / 35 | 4355 |
| 2 | 1 | 66.1 | 74.0 | 19 / 35 | 5357 |
| 3 | 1 | 64.0 | 69.5 | 14 / 35 | 4830 |
| 4 | 1 | 68.8 | 85.1 | 22 / 35 | 5214 |
| 5 | 1 | 62.5 | 65.1 | 14 / 35 | 4693 |
| 6 | 1 | 66.0 | 77.1 | 17 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 82% |
| dummy.micro.Sparrow 2.5 | 30 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 81% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| stelo.MirrorMicro 1.0 | 10 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 22% | 58 |
| dummy.micro.Sparrow 2.5 | 19 | 17% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 16% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 14% | 33 |
| bvh.micro.Freya 0.3 | 13 | 11% | 21 |
| conscience.Electron 1.3g | 13 | 11% | 16 |
| stelo.MirrorMicro 1.0 | 5 | 4% | 20 |
| dl.BetterWalls 1.0 | 5 | 4% | 6 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.9 | 132 / 210 | 2.27 | 21.1% | 42969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.1% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.5% | 25 |
| sul.Lunar 1.1 | 3.0 | 11.9% | 22 |
| supersample.SuperBoxBot 1.0 | 4.7 | 9.8% | 6 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 4 |
| dsw.StaticD 1.0 | 5.2 | 8.7% | 9 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.8% | 6 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.6% | 4 |
| sample.Corners 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 92.7 | 25 / 35 | 7241 |
| 2 | 1 | 69.9 | 80.6 | 22 / 35 | 6784 |
| 3 | 1 | 71.1 | 81.9 | 23 / 35 | 7211 |
| 4 | 1 | 70.8 | 87.9 | 19 / 35 | 6884 |
| 5 | 1 | 72.3 | 86.3 | 22 / 35 | 7542 |
| 6 | 1 | 71.3 | 86.0 | 21 / 35 | 7307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 85% |
| sul.Lunar 1.1 | 46 | 87% |
| dsw.StaticD 1.0 | 17 | 53% |
| supersample.SuperBoxBot 1.0 | 17 | 94% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 25% | 60 |
| supersample.SuperBoxBot 1.0 | 15 | 19% | 28 |
| dsw.StaticD 1.0 | 14 | 18% | 23 |
| sul.Lunar 1.1 | 12 | 15% | 58 |
| mme.NikeEnhanced 2.0 | 8 | 10% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 5% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 11 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 78.6 | 98 / 210 | 2.92 | 18.6% | 41087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.6% | 98 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 40 |
| mld.Wisdom 1.0 | 3.5 | 11.8% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 10.7% | 22 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 9 |
| amz.NanoClone 1.41 | 5.2 | 9.7% | 10 |
| sample.Walls 1.0 | 7.2 | 8.2% | 7 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 2 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 72.7 | 16 / 35 | 5969 |
| 2 | 1 | 67.6 | 77.5 | 13 / 35 | 6671 |
| 3 | 1 | 67.8 | 78.1 | 16 / 35 | 6548 |
| 4 | 1 | 69.9 | 83.5 | 17 / 35 | 7466 |
| 5 | 1 | 69.0 | 81.9 | 17 / 35 | 7241 |
| 6 | 1 | 68.8 | 78.1 | 19 / 35 | 7192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 64% |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 77% |
| mld.Wisdom 1.0 | 22 | 68% |
| sample.Walls 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| amz.NanoClone 1.41 | 5 | 60% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 31% | 67 |
| mld.Wisdom 1.0 | 25 | 22% | 40 |
| KiraNL.Chupacabra 0.4 | 16 | 14% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 37 |
| amz.NanoClone 1.41 | 10 | 9% | 15 |
| sample.Walls 1.0 | 7 | 6% | 11 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 7 |

