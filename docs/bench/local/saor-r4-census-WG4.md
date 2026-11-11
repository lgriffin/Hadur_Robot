# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 147 / 210 | 2.10 | 21.4% | 44022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.4% | 147 |
| radnor.DoctorBob 1.42 | 2.7 | 14.4% | 21 |
| mz.AntiGrav 1.0 | 2.8 | 14.1% | 23 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.4% | 1 |
| sample.Walls 1.0 | 7.2 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 2 |
| arthord.MannyPacquiao Beta | 8.5 | 4.9% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 92.4 | 27 / 35 | 7524 |
| 2 | 1 | 71.1 | 82.2 | 21 / 35 | 7323 |
| 3 | 1 | 72.8 | 90.2 | 27 / 35 | 7195 |
| 4 | 1 | 73.0 | 91.1 | 28 / 35 | 7346 |
| 5 | 1 | 72.2 | 88.6 | 23 / 35 | 7690 |
| 6 | 1 | 71.0 | 82.5 | 21 / 35 | 6944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 90% |
| radnor.DoctorBob 1.42 | 40 | 85% |
| mld.Infinity 2.2 | 38 | 97% |
| jangs.ns51 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 38% | 72 |
| mz.AntiGrav 1.0 | 19 | 30% | 63 |
| amz.NanoClone 1.41 | 8 | 13% | 17 |
| mld.Infinity 2.2 | 6 | 10% | 39 |
| jangs.ns51 1.0 | 3 | 5% | 6 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.9 | 102 / 210 | 2.63 | 18.3% | 34328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.3 | 18.3% | 102 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.7% | 70 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 23 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 3 |
| zyx.nano.Ant 1.1 | 6.0 | 8.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.1% | 5 |
| fullsail.SweetTea 1.1 | 7.8 | 6.5% | 4 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.0 | 26 / 35 | 6414 |
| 2 | 1 | 69.0 | 87.9 | 20 / 35 | 5577 |
| 3 | 1 | 69.6 | 89.2 | 17 / 35 | 6070 |
| 4 | 1 | 67.3 | 76.2 | 16 / 35 | 5885 |
| 5 | 1 | 68.5 | 87.9 | 17 / 35 | 5276 |
| 6 | 3 | 62.0 | 62.9 | 6 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 67% |
| mld.DustBunny 3.8 | 45 | 82% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 40% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 40% | 90 |
| mld.DustBunny 3.8 | 27 | 25% | 66 |
| zyx.nano.Ant 1.1 | 10 | 9% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 7% | 11 |
| cs.Grudge 1.0 | 8 | 7% | 8 |
| maribo.melee.BMV 0.1 | 5 | 5% | 10 |
| fullsail.SweetTea 1.1 | 4 | 4% | 5 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.4 | 131 / 210 | 2.59 | 20.2% | 39076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.2% | 131 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.8% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.9% | 14 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.4% | 6 |
| fm.mammillarias 1.3 | 5.3 | 9.1% | 7 |
| cs.sheldor.Talon 1.1 | 6.0 | 8.8% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.1% | 6 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |
| sample.Fire 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 69.2 | 18 / 35 | 5694 |
| 2 | 1 | 69.6 | 79.0 | 21 / 35 | 6544 |
| 3 | 1 | 71.7 | 90.8 | 26 / 35 | 6398 |
| 4 | 1 | 68.0 | 75.6 | 16 / 35 | 6361 |
| 5 | 1 | 71.6 | 87.6 | 26 / 35 | 6482 |
| 6 | 1 | 73.2 | 92.1 | 24 / 35 | 7597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 90% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 86% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| sp.Nanos.Ember 1.1 | 11 | 73% |
| fm.mammillarias 1.3 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 20% | 65 |
| fm.mammillarias 1.3 | 15 | 19% | 23 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 20 |
| sp.Nanos.Ember 1.1 | 9 | 11% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 10% | 22 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 39 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 10 |
| sample.Tracker 1.0 | 2 | 3% | 5 |
| sample.Fire 1.0 | 2 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.0 | 143 / 210 | 2.26 | 20.7% | 41079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.7% | 143 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 16 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.5% | 19 |
| tj.zombie1n 1.0.1 | 4.5 | 9.6% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.0% | 3 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 84.8 | 22 / 35 | 7044 |
| 2 | 1 | 71.5 | 88.9 | 23 / 35 | 7245 |
| 3 | 1 | 69.9 | 83.5 | 24 / 35 | 6554 |
| 4 | 1 | 72.3 | 93.0 | 27 / 35 | 7029 |
| 5 | 1 | 69.1 | 81.0 | 22 / 35 | 6428 |
| 6 | 1 | 70.7 | 84.8 | 25 / 35 | 6779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 87% |
| stelo.SoJNanoMelee 1.1 | 34 | 85% |
| tvv.micro.Antares 1.1.1 | 23 | 65% |
| tj.zombie1n 1.0.1 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 30% | 81 |
| tvv.micro.Antares 1.1.1 | 12 | 18% | 32 |
| stelo.SoJNanoMelee 1.1 | 11 | 16% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 13% | 11 |
| tj.zombie1n 1.0.1 | 7 | 10% | 13 |
| yk.JahMicro 1.0 | 4 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 24 |
| repositorio.NanoStep 1.0 | 1 | 1% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.2 | 86 / 210 | 3.68 | 16.4% | 31709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.4% | 86 |
| oog.melee.Corsair 1.0 | 2.2 | 13.0% | 44 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.5% | 28 |
| ahf.NanoAndrew .4 | 3.7 | 11.1% | 20 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 6 |
| sam.Samspin 1.0 | 6.0 | 9.5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 68.6 | 10 / 35 | 5024 |
| 2 | 1 | 62.6 | 63.2 | 11 / 35 | 5093 |
| 3 | 1 | 68.0 | 82.9 | 18 / 35 | 5827 |
| 4 | 1 | 62.3 | 62.2 | 13 / 35 | 5073 |
| 5 | 1 | 67.4 | 77.5 | 21 / 35 | 5609 |
| 6 | 1 | 63.7 | 67.0 | 13 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 52% |
| simonton.nano.MeleeSeed 1.8 | 33 | 85% |
| ahf.NanoAndrew .4 | 19 | 89% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 124 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 29 | 23% | 49 |
| oog.melee.Corsair 1.0 | 27 | 22% | 48 |
| ahf.NanoAndrew .4 | 18 | 15% | 34 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 23 |
| EBBU.Sim2 1.02 | 12 | 10% | 22 |
| sam.Samspin 1.0 | 11 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 2% | 2 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.0 | 132 / 210 | 2.26 | 19.2% | 32182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.2% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 34 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.9% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.3% | 9 |
| fm.claire 1.7 | 5.8 | 9.0% | 2 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.4% | 4 |
| sample.SpinBot 1.0 | 8.2 | 6.5% | 2 |
| pa.Improved 1.0 | 8.8 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 20 / 35 | 5329 |
| 2 | 1 | 68.0 | 86.0 | 20 / 35 | 4892 |
| 3 | 1 | 67.2 | 84.4 | 20 / 35 | 4586 |
| 4 | 1 | 69.7 | 83.8 | 26 / 35 | 5859 |
| 5 | 1 | 67.8 | 80.3 | 19 / 35 | 5550 |
| 6 | 1 | 71.8 | 96.5 | 27 / 35 | 5966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 79% |
| oog.melee.CapuletDroid 1.1 | 32 | 88% |
| gh.nano.Grofvuil 0.2 | 14 | 86% |
| winamp32.micro.MicroMacro 1.0 | 10 | 80% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| fm.claire 1.7 | 6 | 100% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 46% | 94 |
| gh.nano.Grofvuil 0.2 | 11 | 14% | 24 |
| fm.claire 1.7 | 8 | 10% | 12 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 39 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 19 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 12 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 3 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 77.9 | 92 / 210 | 2.99 | 17.7% | 34504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.7% | 92 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 38 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 31 |
| mz.MicroGodMelee 1 | 4.0 | 12.9% | 34 |
| DBall.Anarchy 0.1 | 5.8 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.8% | 4 |
| el.JumpShoot 0.2 | 6.5 | 7.3% | 6 |
| fire219.CatBot 1.0 | 8.8 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 19 / 35 | 5763 |
| 2 | 1 | 66.8 | 77.8 | 16 / 35 | 5791 |
| 3 | 1 | 66.3 | 74.9 | 15 / 35 | 5462 |
| 4 | 1 | 68.7 | 80.3 | 17 / 35 | 6304 |
| 5 | 1 | 65.8 | 73.3 | 10 / 35 | 5720 |
| 6 | 1 | 66.0 | 75.2 | 15 / 35 | 5464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 81% |
| mz.MicroGodMelee 1 | 33 | 61% |
| gh.micro.Gruweltje 0.7 | 18 | 56% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 27% | 50 |
| mz.MicroGodMelee 1 | 31 | 26% | 51 |
| spinnercat.micro.Tyger 0.1 | 29 | 25% | 68 |
| acogdev.alpha 0.2 | 6 | 5% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 11 |
| fire219.CatBot 1.0 | 5 | 4% | 6 |
| el.JumpShoot 0.2 | 5 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 76.2 | 112 / 210 | 3.14 | 17.6% | 32210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.6% | 112 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.9% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 28 |
| germ.TheMind .2 | 4.5 | 9.8% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.7% | 7 |
| awesomeness.Elite 1.0 | 6.2 | 8.6% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.2% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.5% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.3 | 15 / 35 | 5162 |
| 2 | 1 | 68.1 | 82.9 | 22 / 35 | 5319 |
| 3 | 1 | 65.3 | 68.3 | 22 / 35 | 5261 |
| 4 | 1 | 66.5 | 76.2 | 18 / 35 | 5160 |
| 5 | 1 | 67.6 | 78.7 | 17 / 35 | 5693 |
| 6 | 1 | 66.8 | 76.8 | 18 / 35 | 5615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 84% |
| germ.TheMind .2 | 12 | 92% |
| awesomeness.Elite 1.0 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 4 | 50% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 44% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 20% | 40 |
| awesomeness.Elite 1.0 | 10 | 10% | 19 |
| germ.TheMind .2 | 5 | 5% | 17 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 11 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 7 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.3 | 158 / 210 | 1.79 | 21.1% | 34091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.1% | 158 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 11 |
| maribo.IotaCT 1.1 | 4.2 | 10.4% | 6 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.8% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.0% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 7.8% | 4 |
| spinnercat.Omen 1.0 | 8.2 | 7.3% | 2 |
| ratosh.Wesco 1.4 | 8.3 | 7.5% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.0 | 24 / 35 | 5765 |
| 2 | 1 | 71.5 | 92.1 | 26 / 35 | 5320 |
| 3 | 1 | 72.6 | 95.2 | 27 / 35 | 5679 |
| 4 | 1 | 71.7 | 91.4 | 29 / 35 | 5527 |
| 5 | 1 | 71.7 | 89.8 | 26 / 35 | 5869 |
| 6 | 1 | 72.2 | 93.0 | 26 / 35 | 5931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 89 | 93% |
| nz.jdc.nano.GridFu 1.0 | 31 | 94% |
| stelo.PatternRobot 1.0 | 17 | 88% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| ratosh.Wesco 1.4 | 9 | 89% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 31% | 79 |
| timmit.nano.TimDog 0.33 | 13 | 25% | 29 |
| stelo.PatternRobot 1.0 | 5 | 10% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 12 |
| maribo.IotaCT 1.1 | 5 | 10% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 39 |
| ratosh.Wesco 1.4 | 2 | 4% | 12 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 91.7 | 163 / 210 | 1.74 | 21.8% | 42108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.8% | 163 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.6% | 20 |
| baal.nano.N 1.42 | 3.0 | 11.4% | 6 |
| Grystrion.TrackerWO 1.0 | 3.7 | 10.0% | 2 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 7 |
| sanja.First 0.1 | 6.2 | 8.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.0% | 2 |
| cvt.Firsty 1.0 | 7.7 | 7.5% | 5 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.4 | 23 / 35 | 6750 |
| 2 | 1 | 72.4 | 93.3 | 27 / 35 | 7201 |
| 3 | 1 | 72.3 | 96.2 | 28 / 35 | 6647 |
| 4 | 1 | 71.8 | 91.1 | 26 / 35 | 6958 |
| 5 | 1 | 73.4 | 95.6 | 30 / 35 | 7535 |
| 6 | 1 | 71.6 | 88.9 | 29 / 35 | 7017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 49 | 86% |
| baal.nano.N 1.42 | 40 | 93% |
| cvt.Firsty 1.0 | 31 | 90% |
| zyx.micro.Ant 1.1 | 18 | 83% |
| sanja.First 0.1 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 18 | 37% | 74 |
| zyx.micro.Ant 1.1 | 12 | 24% | 27 |
| baal.nano.N 1.42 | 7 | 14% | 40 |
| cvt.Firsty 1.0 | 4 | 8% | 25 |
| Grystrion.TrackerWO 1.0 | 3 | 6% | 12 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 4 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| sanja.First 0.1 | 0 | 0% | 18 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.9 | 89 / 210 | 3.71 | 16.1% | 33297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 16.1% | 89 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 60 |
| cs.Wren 1.0 | 3.2 | 12.6% | 17 |
| mz.Cork 0.1 | 4.0 | 11.3% | 15 |
| js.PinBall 1.6 | 4.8 | 11.1% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 5 |
| evd.X1 0.01 | 7.3 | 7.6% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.3% | 4 |
| donjezza.Jezza 1.0 | 8.7 | 5.5% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 71.1 | 15 / 35 | 5300 |
| 2 | 1 | 63.8 | 67.0 | 14 / 35 | 5487 |
| 3 | 1 | 62.9 | 65.1 | 12 / 35 | 5437 |
| 4 | 1 | 62.5 | 64.1 | 15 / 35 | 5184 |
| 5 | 1 | 65.6 | 71.7 | 13 / 35 | 6054 |
| 6 | 1 | 67.8 | 80.3 | 20 / 35 | 5835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 70% |
| cs.Wren 1.0 | 20 | 85% |
| mz.Cork 0.1 | 13 | 92% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| js.PinBall 1.6 | 5 | 80% |
| joe.ADinosaur 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 48% | 108 |
| joe.ADinosaur 1.0 | 14 | 11% | 16 |
| evd.X1 0.01 | 11 | 9% | 13 |
| cs.Wren 1.0 | 10 | 8% | 26 |
| mz.Cork 0.1 | 9 | 7% | 19 |
| js.PinBall 1.6 | 8 | 7% | 13 |
| PSW.Relentless 0.1 | 8 | 7% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 131 / 210 | 2.33 | 19.4% | 31116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.4% | 131 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 20 |
| ntc.Opposite 1.5 | 3.3 | 11.1% | 13 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 10.5% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.2% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 11 |
| DBall.NUKE 0.1 | 7.5 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.9 | 21 / 35 | 5074 |
| 2 | 1 | 69.5 | 87.0 | 24 / 35 | 5381 |
| 3 | 1 | 69.4 | 86.7 | 20 / 35 | 5454 |
| 4 | 1 | 69.5 | 86.3 | 26 / 35 | 5093 |
| 5 | 1 | 68.4 | 85.4 | 19 / 35 | 5009 |
| 6 | 1 | 68.0 | 82.9 | 21 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 88% |
| stelo.AreaTargetingBot 1.1 | 33 | 82% |
| ntc.Opposite 1.5 | 20 | 65% |
| disan.Chair 2.2.0 | 19 | 84% |
| donjezza.Muncho 1.0 | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 80% |
| DBall.NUKE 0.1 | 10 | 90% |
| pbg.R2D2 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |

Hadur died in 80 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 21% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 19% | 32 |
| stelo.AreaTargetingBot 1.1 | 12 | 15% | 39 |
| ntc.Opposite 1.5 | 12 | 15% | 22 |
| pfvicm.Sobieski 7.2.3b | 9 | 11% | 14 |
| disan.Chair 2.2.0 | 8 | 10% | 20 |
| DBall.NUKE 0.1 | 3 | 4% | 13 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 2 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.9 | 99 / 210 | 3.35 | 16.2% | 26263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.3 | 16.2% | 99 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 41 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.2% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 24 |
| yagami.Tidus 0.11 | 4.3 | 12.2% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.4% | 2 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.5 | 24 / 35 | 5368 |
| 2 | 2 | 62.8 | 66.3 | 14 / 35 | 4120 |
| 3 | 1 | 65.2 | 74.3 | 15 / 35 | 4284 |
| 4 | 2 | 63.2 | 69.2 | 12 / 35 | 4069 |
| 5 | 1 | 62.6 | 65.7 | 12 / 35 | 4342 |
| 6 | 1 | 67.6 | 84.4 | 22 / 35 | 4080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 97% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 82% |
| oog.melee.Capulet 1.2 | 26 | 73% |
| yagami.Tidus 0.11 | 22 | 100% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 38% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 17% | 44 |
| yagami.Tidus 0.11 | 15 | 14% | 33 |
| ejb.Polaris 1.0.1 | 10 | 9% | 20 |
| kurios.DOSexe .9a | 9 | 8% | 10 |
| step.nanoPri 1.0 | 7 | 6% | 7 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 31 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 76.1 | 117 / 210 | 3.15 | 17.0% | 28142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.0% | 117 |
| bzdp.Pansy 2.1 | 3.0 | 12.3% | 21 |
| wompi.Quokka 1.6 | 3.3 | 11.6% | 22 |
| wee.Gem 1.8.4 | 3.7 | 12.1% | 28 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 11 |
| m3thos.Eva00 1.1 | 6.3 | 9.4% | 5 |
| bayen.UbaMicro 1.4 | 6.5 | 8.8% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.3 | 22 / 35 | 5148 |
| 2 | 1 | 64.3 | 71.1 | 18 / 35 | 4620 |
| 3 | 1 | 69.7 | 93.3 | 26 / 35 | 4911 |
| 4 | 1 | 64.2 | 71.1 | 17 / 35 | 4496 |
| 5 | 1 | 64.8 | 74.6 | 20 / 35 | 4289 |
| 6 | 1 | 62.6 | 65.4 | 14 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 87% |
| wee.Gem 1.8.4 | 22 | 95% |
| wompi.Quokka 1.6 | 21 | 86% |
| ratosh.Nobo 0.21 | 18 | 94% |
| m3thos.Eva00 1.1 | 9 | 89% |
| bayen.UbaMicro 1.4 | 8 | 63% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 16% | 58 |
| wee.Gem 1.8.4 | 13 | 14% | 38 |
| wompi.Quokka 1.6 | 12 | 13% | 24 |
| maribo.FollowFire 1 | 12 | 13% | 15 |
| ratosh.Nobo 0.21 | 9 | 10% | 24 |
| m3thos.Eva00 1.1 | 9 | 10% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 12 |
| bayen.UbaMicro 1.4 | 8 | 9% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 88.5 | 119 / 210 | 2.04 | 21.9% | 50723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.9% | 119 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 68 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 20 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 3 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 0 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 78.7 | 16 / 35 | 7962 |
| 2 | 1 | 73.3 | 88.6 | 21 / 35 | 7842 |
| 3 | 1 | 74.0 | 91.1 | 20 / 35 | 8784 |
| 4 | 1 | 75.6 | 95.6 | 26 / 35 | 9401 |
| 5 | 1 | 73.9 | 90.5 | 22 / 35 | 8705 |
| 6 | 1 | 72.0 | 86.3 | 14 / 35 | 8029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 76% |
| mz.NanoGod 2.02 | 16 | 38% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| ayk.WallHugger 1.0 | 5 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 47% | 139 |
| mz.NanoGod 2.02 | 30 | 33% | 37 |
| exauge.GateKeeper 1.1.121g | 12 | 13% | 16 |
| stuff.Vlad 0.1 | 4 | 4% | 9 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| ayk.WallHugger 1.0 | 0 | 0% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.2 | 114 / 210 | 3.23 | 17.2% | 29541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.2% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.9% | 29 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 18 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 9.9% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.8% | 3 |
| conscience.Electron 1.3g | 6.7 | 8.1% | 4 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 9 |
| dl.BetterWalls 1.0 | 9.2 | 6.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.5 | 20 / 35 | 5363 |
| 2 | 1 | 65.9 | 75.2 | 19 / 35 | 5014 |
| 3 | 1 | 67.3 | 79.4 | 19 / 35 | 5259 |
| 4 | 1 | 62.9 | 68.3 | 16 / 35 | 4210 |
| 5 | 1 | 65.9 | 74.9 | 19 / 35 | 4851 |
| 6 | 1 | 66.3 | 76.8 | 21 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 59 | 86% |
| dummy.micro.Sparrow 2.5 | 26 | 92% |
| bvh.micro.Freya 0.3 | 19 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 69% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 20% | 70 |
| dummy.micro.Sparrow 2.5 | 19 | 20% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 19% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 32 |
| bvh.micro.Freya 0.3 | 10 | 10% | 23 |
| conscience.Electron 1.3g | 8 | 8% | 13 |
| dl.BetterWalls 1.0 | 5 | 5% | 7 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 8 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 81.6 | 129 / 210 | 2.66 | 20.3% | 42012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.3% | 129 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.8% | 20 |
| sul.Lunar 1.1 | 3.3 | 12.1% | 18 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.4% | 18 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.9% | 6 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.3% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 6 |
| sample.Corners 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.4 | 26 / 35 | 7472 |
| 2 | 1 | 69.6 | 80.0 | 19 / 35 | 6858 |
| 3 | 1 | 70.3 | 77.1 | 21 / 35 | 7212 |
| 4 | 1 | 69.8 | 77.5 | 19 / 35 | 7228 |
| 5 | 1 | 70.0 | 81.9 | 22 / 35 | 6567 |
| 6 | 1 | 69.6 | 81.6 | 22 / 35 | 6675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 98% |
| supersample.SuperBoxBot 1.0 | 39 | 85% |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 76% |
| dsw.StaticD 1.0 | 11 | 64% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 34% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 22% | 48 |
| dsw.StaticD 1.0 | 11 | 13% | 20 |
| mme.NikeEnhanced 2.0 | 7 | 9% | 16 |
| sul.Lunar 1.1 | 6 | 7% | 56 |
| tlp.ThreeLeggedPig 1 | 4 | 5% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 5 |
| sample.Corners 1.0 | 3 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.1 | 110 / 210 | 2.80 | 18.7% | 39629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.7% | 110 |
| mld.Wisdom 1.0 | 2.5 | 12.6% | 25 |
| radnor.DoctorBob 1.42 | 2.5 | 12.7% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.8% | 16 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 16 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.5% | 7 |
| sample.Walls 1.0 | 7.2 | 7.8% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 78.1 | 15 / 35 | 6365 |
| 2 | 1 | 69.3 | 82.9 | 21 / 35 | 6853 |
| 3 | 1 | 70.6 | 88.3 | 23 / 35 | 7028 |
| 4 | 1 | 68.2 | 79.0 | 16 / 35 | 6775 |
| 5 | 1 | 68.9 | 83.2 | 21 / 35 | 6434 |
| 6 | 1 | 64.7 | 68.9 | 14 / 35 | 6174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 88% |
| radnor.DoctorBob 1.42 | 35 | 69% |
| mld.Wisdom 1.0 | 20 | 65% |
| KiraNL.Chupacabra 0.4 | 11 | 100% |
| amz.NanoClone 1.41 | 10 | 70% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 86% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 27% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 17% | 52 |
| radnor.DoctorBob 1.42 | 17 | 17% | 48 |
| KiraNL.Chupacabra 0.4 | 17 | 17% | 30 |
| amz.NanoClone 1.41 | 10 | 10% | 16 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 5 | 5% | 7 |
| sample.Walls 1.0 | 2 | 2% | 5 |

