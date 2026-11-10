# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 91.0 | 148 / 210 | 1.81 | 21.9% | 44489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.9% | 148 |
| mz.AntiGrav 1.0 | 2.5 | 13.9% | 17 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 20 |
| mld.Infinity 2.2 | 3.8 | 12.4% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 5 |
| GarmBox.Oranges 1.0 | 6.2 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.1% | 3 |
| sample.Walls 1.0 | 7.7 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 89.2 | 22 / 35 | 7079 |
| 2 | 1 | 73.9 | 93.7 | 27 / 35 | 7592 |
| 3 | 1 | 73.7 | 94.3 | 25 / 35 | 8191 |
| 4 | 1 | 74.0 | 96.2 | 29 / 35 | 7581 |
| 5 | 1 | 69.9 | 84.1 | 19 / 35 | 6615 |
| 6 | 1 | 72.8 | 88.6 | 26 / 35 | 7431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 92% |
| radnor.DoctorBob 1.42 | 39 | 79% |
| mld.Infinity 2.2 | 31 | 87% |
| amz.NanoClone 1.41 | 12 | 83% |
| jangs.ns51 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 40% | 68 |
| mld.Infinity 2.2 | 11 | 18% | 40 |
| mz.AntiGrav 1.0 | 10 | 16% | 67 |
| amz.NanoClone 1.41 | 8 | 13% | 16 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 2 | 3% | 4 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.4 | 110 / 210 | 2.85 | 17.6% | 31204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.6% | 110 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.1% | 60 |
| mld.DustBunny 3.8 | 3.0 | 13.7% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.9% | 6 |
| zyx.nano.Ant 1.1 | 6.2 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 7 |
| bzdp.BoxCar 2.0 | 8.2 | 6.8% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 76.2 | 17 / 35 | 4995 |
| 2 | 1 | 67.6 | 81.3 | 18 / 35 | 5267 |
| 3 | 1 | 68.2 | 85.1 | 21 / 35 | 5110 |
| 4 | 1 | 69.0 | 89.8 | 25 / 35 | 5295 |
| 5 | 1 | 66.7 | 79.4 | 19 / 35 | 5049 |
| 6 | 1 | 63.5 | 64.8 | 10 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 59 | 78% |
| mld.DustBunny 3.8 | 48 | 88% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 40% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 33% | 76 |
| mld.DustBunny 3.8 | 27 | 27% | 71 |
| maribo.melee.BMV 0.1 | 9 | 9% | 12 |
| fullsail.SweetTea 1.1 | 7 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 11 |
| zyx.nano.Ant 1.1 | 6 | 6% | 8 |
| cs.Grudge 1.0 | 6 | 6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 12 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 84.4 | 134 / 210 | 2.40 | 20.4% | 38670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.4% | 134 |
| myl.micro.Troodon 1.10 | 2.2 | 14.4% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.6% | 18 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.6% | 5 |
| fm.mammillarias 1.3 | 6.0 | 8.7% | 3 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.5 | 6.2% | 4 |
| sample.Fire 1.0 | 9.2 | 5.3% | 0 |
| sample.Tracker 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 88.3 | 24 / 35 | 6460 |
| 2 | 1 | 68.7 | 77.5 | 22 / 35 | 6075 |
| 3 | 1 | 67.0 | 74.9 | 12 / 35 | 6092 |
| 4 | 1 | 72.1 | 89.2 | 24 / 35 | 7057 |
| 5 | 1 | 71.7 | 88.3 | 26 / 35 | 6647 |
| 6 | 1 | 71.6 | 88.3 | 26 / 35 | 6339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 63 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 73% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| myl.nano.KomoriNinja 1.1 | 22 | 91% |
| sp.Nanos.Ember 1.1 | 8 | 75% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 22 | 29% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% | 34 |
| myl.nano.KomoriNinja 1.1 | 12 | 16% | 43 |
| fm.mammillarias 1.3 | 9 | 12% | 12 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 16 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 14 |
| sample.Fire 1.0 | 3 | 4% | 8 |
| sample.Tracker 1.0 | 2 | 3% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 9 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.3 | 150 / 210 | 2.14 | 21.1% | 42363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.1% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 14 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.4% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.3% | 9 |
| yk.JahMicro 1.0 | 6.8 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 6.8% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 26 / 35 | 6380 |
| 2 | 1 | 71.6 | 90.8 | 22 / 35 | 7303 |
| 3 | 1 | 70.4 | 81.6 | 24 / 35 | 7027 |
| 4 | 1 | 71.9 | 90.2 | 26 / 35 | 7106 |
| 5 | 1 | 70.8 | 84.8 | 27 / 35 | 7071 |
| 6 | 1 | 71.2 | 85.1 | 25 / 35 | 7476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 84% |
| stelo.SoJNanoMelee 1.1 | 27 | 93% |
| tj.zombie1n 1.0.1 | 23 | 100% |
| tvv.micro.Antares 1.1.1 | 22 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| repositorio.NanoStep 1.0 | 6 | 83% |
| yk.JahMicro 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 45% | 91 |
| tvv.micro.Antares 1.1.1 | 12 | 20% | 35 |
| stelo.SoJNanoMelee 1.1 | 5 | 8% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 19 |
| tj.zombie1n 1.0.1 | 3 | 5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 11 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.7 | 103 / 210 | 3.72 | 16.4% | 30760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.4% | 103 |
| oog.melee.Corsair 1.0 | 2.0 | 13.2% | 44 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.0% | 15 |
| EBBU.Sim2 1.02 | 5.5 | 10.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.1% | 7 |
| sam.Samspin 1.0 | 6.3 | 9.3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.4% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.5% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 73.0 | 19 / 35 | 4883 |
| 2 | 1 | 66.4 | 76.5 | 21 / 35 | 5120 |
| 3 | 1 | 65.9 | 73.0 | 19 / 35 | 5326 |
| 4 | 1 | 63.3 | 67.9 | 15 / 35 | 4674 |
| 5 | 1 | 62.0 | 61.3 | 14 / 35 | 5256 |
| 6 | 1 | 64.5 | 66.7 | 15 / 35 | 5501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 67% |
| simonton.nano.MeleeSeed 1.8 | 40 | 100% |
| ahf.NanoAndrew .4 | 19 | 79% |
| EBBU.Sim2 1.02 | 9 | 89% |
| sam.Samspin 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 20% | 49 |
| robar.nano.Assertive_Melee 0.2 | 21 | 20% | 26 |
| simonton.nano.MeleeSeed 1.8 | 18 | 17% | 51 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 15% | 17 |
| ahf.NanoAndrew .4 | 10 | 9% | 24 |
| EBBU.Sim2 1.02 | 10 | 9% | 21 |
| sam.Samspin 1.0 | 5 | 5% | 10 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 8 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.5 | 143 / 210 | 2.03 | 19.9% | 33707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.9% | 143 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 29 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.1% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.2% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.3% | 6 |
| fm.claire 1.7 | 6.8 | 7.7% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.6% | 2 |
| pa.Improved 1.0 | 9.0 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.5 | 23 / 35 | 5325 |
| 2 | 1 | 68.8 | 84.4 | 20 / 35 | 5793 |
| 3 | 1 | 66.9 | 79.0 | 21 / 35 | 5239 |
| 4 | 1 | 71.1 | 93.0 | 24 / 35 | 6025 |
| 5 | 1 | 71.8 | 95.6 | 30 / 35 | 5947 |
| 6 | 1 | 69.5 | 88.6 | 25 / 35 | 5378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 82% |
| oog.melee.CapuletDroid 1.1 | 36 | 97% |
| gh.nano.Grofvuil 0.2 | 17 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 87% |
| winamp32.micro.MicroMacro 1.0 | 10 | 60% |
| sample.SpinBot 1.0 | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 37% | 89 |
| winamp32.micro.MicroMacro 1.0 | 10 | 15% | 16 |
| gh.nano.Grofvuil 0.2 | 7 | 10% | 29 |
| oog.melee.CapuletDroid 1.1 | 6 | 9% | 34 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 16 |
| sample.SpinBot 1.0 | 5 | 7% | 10 |
| fm.claire 1.7 | 4 | 6% | 6 |
| pa.Improved 1.0 | 3 | 4% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.6 | 122 / 210 | 2.56 | 19.1% | 36657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.1% | 122 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 30 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.2% | 24 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 2 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.7% | 0 |
| el.JumpShoot 0.2 | 6.8 | 6.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 8.8 | 5.5% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.6 | 21 / 35 | 5782 |
| 2 | 1 | 69.7 | 82.5 | 20 / 35 | 6673 |
| 3 | 1 | 68.1 | 77.5 | 19 / 35 | 6201 |
| 4 | 1 | 68.7 | 82.2 | 21 / 35 | 6003 |
| 5 | 1 | 68.8 | 82.5 | 19 / 35 | 6024 |
| 6 | 1 | 70.4 | 89.5 | 22 / 35 | 5974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 65 | 91% |
| mz.MicroGodMelee 1 | 41 | 73% |
| gh.micro.Gruweltje 0.7 | 27 | 85% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 28 | 32% | 59 |
| spinnercat.micro.Tyger 0.1 | 21 | 24% | 72 |
| gh.micro.Gruweltje 0.7 | 16 | 18% | 46 |
| fire219.CatBot 1.0 | 8 | 9% | 7 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 8 |
| acogdev.alpha 0.2 | 4 | 5% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.9 | 102 / 210 | 3.44 | 16.6% | 30325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.6% | 102 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.5% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 31 |
| germ.TheMind .2 | 4.3 | 9.9% | 7 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 14 |
| awesomeness.Elite 1.0 | 6.0 | 8.7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 8.1% | 1 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.9% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 68.6 | 20 / 35 | 4789 |
| 2 | 1 | 67.8 | 81.9 | 17 / 35 | 5670 |
| 3 | 1 | 61.6 | 62.5 | 14 / 35 | 4687 |
| 4 | 1 | 61.1 | 62.9 | 16 / 35 | 4185 |
| 5 | 1 | 67.6 | 79.7 | 18 / 35 | 5630 |
| 6 | 1 | 67.5 | 81.6 | 17 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 72% |
| awesomeness.Elite 1.0 | 8 | 75% |
| germ.TheMind .2 | 8 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 42% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 22% | 43 |
| germ.TheMind .2 | 11 | 10% | 18 |
| awesomeness.Elite 1.0 | 8 | 7% | 17 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 10 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 10 |
| sample.Crazy 1.0 | 3 | 3% | 10 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.1 | 145 / 210 | 2.25 | 20.0% | 32665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.0% | 145 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 11 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.8% | 2 |
| ratosh.Wesco 1.4 | 6.7 | 8.7% | 6 |
| stelo.PatternRobot 1.0 | 7.7 | 7.8% | 8 |
| spinnercat.Omen 1.0 | 8.3 | 7.5% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 83.2 | 22 / 35 | 5410 |
| 2 | 1 | 70.4 | 86.3 | 25 / 35 | 5509 |
| 3 | 1 | 71.2 | 89.2 | 27 / 35 | 5658 |
| 4 | 1 | 71.3 | 89.2 | 25 / 35 | 5655 |
| 5 | 1 | 69.7 | 83.8 | 24 / 35 | 5337 |
| 6 | 1 | 69.7 | 85.1 | 22 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 88% |
| nz.jdc.nano.GridFu 1.0 | 35 | 97% |
| timmit.nano.TimDog 0.33 | 15 | 60% |
| maribo.IotaCT 1.1 | 12 | 92% |
| ratosh.Wesco 1.4 | 10 | 80% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 32% | 67 |
| timmit.nano.TimDog 0.33 | 12 | 18% | 24 |
| stelo.PatternRobot 1.0 | 10 | 15% | 16 |
| maribo.IotaCT 1.1 | 6 | 9% | 20 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 46 |
| ratosh.Wesco 1.4 | 5 | 8% | 19 |
| spinnercat.Omen 1.0 | 3 | 5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.0 | 160 / 210 | 1.81 | 21.5% | 40593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.5% | 160 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 19 |
| baal.nano.N 1.42 | 2.7 | 12.2% | 13 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 4.7 | 9.5% | 10 |
| sanja.First 0.1 | 6.0 | 8.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.0% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.0% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 88.6 | 28 / 35 | 6712 |
| 2 | 1 | 72.1 | 94.9 | 27 / 35 | 6707 |
| 3 | 1 | 71.7 | 90.5 | 24 / 35 | 6945 |
| 4 | 1 | 71.6 | 90.2 | 28 / 35 | 6954 |
| 5 | 1 | 71.5 | 90.5 | 28 / 35 | 6572 |
| 6 | 1 | 72.0 | 91.4 | 25 / 35 | 6703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 90% |
| baal.nano.N 1.42 | 42 | 88% |
| sanja.First 0.1 | 20 | 100% |
| zyx.micro.Ant 1.1 | 20 | 85% |
| cvt.Firsty 1.0 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 34% | 40 |
| tvv.nano.Polaris 1.2 | 12 | 24% | 62 |
| baal.nano.N 1.42 | 10 | 20% | 48 |
| sanja.First 0.1 | 4 | 8% | 18 |
| Grystrion.TrackerWO 1.0 | 4 | 8% | 18 |
| cvt.Firsty 1.0 | 2 | 4% | 16 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 62.7 | 74 / 210 | 4.36 | 14.4% | 29427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 15.7% | 70 |
| hadur117.micro.SaorWGW 0.1 | 2.2 | 14.4% | 74 |
| cs.Wren 1.0 | 2.8 | 12.6% | 22 |
| js.PinBall 1.6 | 4.5 | 11.1% | 17 |
| mz.Cork 0.1 | 4.7 | 11.1% | 11 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 5 |
| evd.X1 0.01 | 7.0 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 65.7 | 12 / 35 | 5622 |
| 2 | 2 | 64.9 | 74.0 | 13 / 35 | 5127 |
| 3 | 2 | 61.2 | 61.3 | 13 / 35 | 4933 |
| 4 | 3 | 57.9 | 56.5 | 11 / 35 | 4288 |
| 5 | 2 | 61.2 | 60.6 | 14 / 35 | 4948 |
| 6 | 2 | 59.0 | 58.1 | 11 / 35 | 4509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 62% |
| cs.Wren 1.0 | 15 | 100% |
| mz.Cork 0.1 | 7 | 86% |
| evd.X1 0.01 | 4 | 100% |
| js.PinBall 1.6 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 63 | 46% | 102 |
| PSW.Relentless 0.1 | 16 | 12% | 18 |
| evd.X1 0.01 | 13 | 10% | 15 |
| joe.ADinosaur 1.0 | 12 | 9% | 14 |
| mz.Cork 0.1 | 11 | 8% | 16 |
| cs.Wren 1.0 | 10 | 7% | 22 |
| js.PinBall 1.6 | 8 | 6% | 15 |
| jsal.Jsalbot 1.0 | 2 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.7 | 137 / 210 | 2.47 | 19.2% | 31101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.2% | 137 |
| myl.nano.Graviton 1.10 | 2.3 | 11.9% | 22 |
| ntc.Opposite 1.5 | 3.0 | 11.1% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.1% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.8% | 0 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.8% | 12 |
| disan.Chair 2.2.0 | 6.8 | 8.8% | 9 |
| DBall.NUKE 0.1 | 8.2 | 7.5% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 9 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.3 | 26 / 35 | 5271 |
| 2 | 1 | 67.0 | 80.3 | 20 / 35 | 4843 |
| 3 | 1 | 68.2 | 82.5 | 23 / 35 | 5315 |
| 4 | 1 | 71.2 | 89.2 | 29 / 35 | 5780 |
| 5 | 1 | 67.4 | 81.6 | 18 / 35 | 4826 |
| 6 | 1 | 67.6 | 81.0 | 21 / 35 | 5066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 93% |
| ntc.Opposite 1.5 | 21 | 95% |
| pfvicm.Sobieski 7.2.3b | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| disan.Chair 2.2.0 | 15 | 100% |
| stelo.AreaTargetingBot 1.1 | 14 | 93% |
| donjezza.Muncho 1.0 | 10 | 100% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 19 | 25% | 31 |
| myl.nano.Graviton 1.10 | 15 | 19% | 45 |
| stelo.AreaTargetingBot 1.1 | 14 | 18% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 22 |
| pfvicm.Sobieski 7.2.3b | 9 | 12% | 23 |
| DBall.NUKE 0.1 | 3 | 4% | 13 |
| pbg.R2D2 1.0 | 3 | 4% | 10 |
| disan.Chair 2.2.0 | 2 | 3% | 21 |
| donjezza.Muncho 1.0 | 2 | 3% | 11 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.6 | 80 / 210 | 3.64 | 15.7% | 27216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 15.7% | 80 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 54 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 21 |
| yagami.Tidus 0.11 | 5.2 | 11.8% | 8 |
| ejb.Polaris 1.0.1 | 5.7 | 11.1% | 15 |
| step.nanoPri 1.0 | 7.5 | 7.3% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 72.1 | 15 / 35 | 4398 |
| 2 | 1 | 65.0 | 69.2 | 15 / 35 | 4565 |
| 3 | 1 | 63.0 | 65.4 | 13 / 35 | 4333 |
| 4 | 1 | 67.0 | 80.3 | 15 / 35 | 4544 |
| 5 | 2 | 61.9 | 63.8 | 10 / 35 | 4348 |
| 6 | 1 | 65.4 | 73.0 | 12 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 76% |
| kawigi.micro.Shiz 1.1 | 21 | 95% |
| yagami.Tidus 0.11 | 17 | 88% |
| oog.melee.Capulet 1.2 | 16 | 44% |
| ejb.Polaris 1.0.1 | 11 | 91% |

Hadur died in 130 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 41% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 46 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 29 |
| stelo.MirrorNano 1.3 | 10 | 8% | 10 |
| step.nanoPri 1.0 | 9 | 7% | 9 |
| ejb.Polaris 1.0.1 | 8 | 6% | 21 |
| yagami.Tidus 0.11 | 8 | 6% | 21 |
| kurios.DOSexe .9a | 8 | 6% | 8 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.1 | 132 / 210 | 2.97 | 17.7% | 28418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.7% | 132 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 21 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 28 |
| wompi.Quokka 1.6 | 4.0 | 11.3% | 8 |
| ratosh.Nobo 0.21 | 4.3 | 10.9% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 7 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.2 | 24 / 35 | 4968 |
| 2 | 1 | 63.5 | 67.6 | 20 / 35 | 4394 |
| 3 | 1 | 64.9 | 72.4 | 17 / 35 | 4815 |
| 4 | 1 | 67.5 | 81.9 | 22 / 35 | 5058 |
| 5 | 1 | 67.5 | 82.5 | 25 / 35 | 4409 |
| 6 | 1 | 67.6 | 82.2 | 24 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 90% |
| wee.Gem 1.8.4 | 31 | 94% |
| wompi.Quokka 1.6 | 21 | 86% |
| ratosh.Nobo 0.21 | 11 | 91% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 21% | 64 |
| bayen.UbaMicro 1.4 | 12 | 15% | 19 |
| wee.Gem 1.8.4 | 10 | 13% | 42 |
| wompi.Quokka 1.6 | 9 | 12% | 30 |
| ratosh.Nobo 0.21 | 8 | 10% | 22 |
| maribo.FollowFire 1 | 8 | 10% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 8 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 7 |
| m3thos.Eva00 1.1 | 3 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 88.6 | 124 / 210 | 2.03 | 22.0% | 49797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 22.0% | 124 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 18 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.7% | 3 |
| stuff.Vlad 0.1 | 5.5 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.8% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 4.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 90.8 | 19 / 35 | 7813 |
| 2 | 1 | 73.7 | 89.2 | 20 / 35 | 8214 |
| 3 | 1 | 73.8 | 90.5 | 23 / 35 | 8302 |
| 4 | 1 | 73.7 | 88.3 | 24 / 35 | 8555 |
| 5 | 1 | 74.6 | 92.7 | 20 / 35 | 9092 |
| 6 | 1 | 71.5 | 80.0 | 18 / 35 | 7821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 80% |
| mz.NanoGod 2.02 | 18 | 50% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| stelo.PianistNano 1.2 | 5 | 60% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 86 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 47% | 136 |
| mz.NanoGod 2.02 | 33 | 38% | 46 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 9 |
| ayk.WallHugger 1.0 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.9 | 105 / 210 | 3.26 | 17.2% | 30983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.2% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 26 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.7% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.8% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 7 |
| dl.BetterWalls 1.0 | 8.5 | 6.4% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 69.5 | 16 / 35 | 4788 |
| 2 | 1 | 66.3 | 74.9 | 17 / 35 | 5345 |
| 3 | 1 | 65.5 | 73.3 | 18 / 35 | 5254 |
| 4 | 1 | 66.4 | 77.5 | 18 / 35 | 5111 |
| 5 | 1 | 67.2 | 80.0 | 18 / 35 | 5225 |
| 6 | 1 | 65.9 | 74.0 | 18 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| dummy.micro.Sparrow 2.5 | 30 | 87% |
| bvh.micro.Freya 0.3 | 27 | 78% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 53% |
| stelo.MirrorMicro 1.0 | 6 | 67% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 19% | 55 |
| bvh.micro.Freya 0.3 | 19 | 18% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 16% | 24 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 11% | 10 |
| conscience.Electron 1.3g | 9 | 9% | 12 |
| dl.BetterWalls 1.0 | 8 | 8% | 15 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 16 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 153 / 210 | 2.10 | 21.9% | 44804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.9% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.3% | 14 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 13 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.8% | 15 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.9% | 4 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 0 |
| sample.Corners 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 89.8 | 28 / 35 | 7331 |
| 2 | 1 | 72.1 | 86.0 | 24 / 35 | 7884 |
| 3 | 1 | 74.3 | 94.9 | 29 / 35 | 8158 |
| 4 | 1 | 70.9 | 86.3 | 23 / 35 | 6779 |
| 5 | 1 | 70.8 | 81.6 | 21 / 35 | 7119 |
| 6 | 1 | 72.5 | 88.3 | 28 / 35 | 7533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 57 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 96% |
| supersample.SuperBoxBot 1.0 | 22 | 82% |
| dsw.StaticD 1.0 | 16 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 35% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 16% | 55 |
| mme.NikeEnhanced 2.0 | 8 | 14% | 15 |
| sul.Lunar 1.1 | 7 | 12% | 65 |
| dsw.StaticD 1.0 | 6 | 11% | 18 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 7 |
| sample.Corners 1.0 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 79.9 | 103 / 210 | 2.81 | 18.6% | 39528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.6% | 103 |
| radnor.DoctorBob 1.42 | 2.8 | 13.4% | 36 |
| mld.Wisdom 1.0 | 3.5 | 12.0% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.3% | 24 |
| amz.NanoClone 1.41 | 4.5 | 10.7% | 13 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.9% | 7 |
| sample.Walls 1.0 | 7.5 | 7.3% | 8 |
| GarmBox.Oranges 1.0 | 7.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.8 | 20 / 35 | 6980 |
| 2 | 1 | 66.4 | 77.1 | 13 / 35 | 6265 |
| 3 | 1 | 67.4 | 73.0 | 19 / 35 | 6462 |
| 4 | 1 | 68.7 | 82.5 | 16 / 35 | 7051 |
| 5 | 1 | 67.5 | 80.3 | 18 / 35 | 6036 |
| 6 | 1 | 68.8 | 81.6 | 17 / 35 | 6734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 67% |
| mld.Wisdom 1.0 | 31 | 77% |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 82% |
| amz.NanoClone 1.41 | 13 | 77% |
| sample.Walls 1.0 | 11 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| jangs.ns51 1.0 | 8 | 88% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 29% | 62 |
| mld.Wisdom 1.0 | 30 | 28% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 14% | 34 |
| amz.NanoClone 1.41 | 12 | 11% | 19 |
| KiraNL.Chupacabra 0.4 | 9 | 8% | 18 |
| sample.Walls 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 6 |

