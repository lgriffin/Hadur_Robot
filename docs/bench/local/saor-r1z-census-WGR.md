# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.2 | 153 / 210 | 1.98 | 21.6% | 43610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.6% | 153 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 24 |
| mz.AntiGrav 1.0 | 2.7 | 14.0% | 16 |
| mld.Infinity 2.2 | 3.8 | 12.8% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.2% | 0 |
| sample.Walls 1.0 | 7.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 93.7 | 26 / 35 | 7907 |
| 2 | 1 | 71.8 | 87.3 | 26 / 35 | 6672 |
| 3 | 1 | 72.6 | 92.1 | 25 / 35 | 6968 |
| 4 | 1 | 72.8 | 88.6 | 26 / 35 | 7594 |
| 5 | 1 | 73.0 | 89.8 | 28 / 35 | 7327 |
| 6 | 1 | 71.1 | 83.5 | 22 / 35 | 7142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 94% |
| mld.Infinity 2.2 | 46 | 96% |
| radnor.DoctorBob 1.42 | 44 | 86% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 49% | 70 |
| mz.AntiGrav 1.0 | 12 | 21% | 65 |
| mld.Infinity 2.2 | 8 | 14% | 42 |
| jangs.ns51 1.0 | 4 | 7% | 8 |
| amz.NanoClone 1.41 | 3 | 5% | 12 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.3 | 137 / 210 | 2.06 | 19.5% | 33943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.5% | 137 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.4% | 45 |
| mld.DustBunny 3.8 | 3.5 | 12.4% | 7 |
| maribo.melee.BMV 0.1 | 3.7 | 10.7% | 5 |
| zyx.nano.Ant 1.1 | 5.5 | 9.1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.2% | 9 |
| fullsail.SweetTea 1.1 | 7.8 | 7.1% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.8 | 21 / 35 | 5487 |
| 2 | 1 | 70.3 | 89.8 | 24 / 35 | 6252 |
| 3 | 1 | 68.6 | 85.1 | 22 / 35 | 5774 |
| 4 | 1 | 69.7 | 90.2 | 26 / 35 | 5224 |
| 5 | 1 | 69.3 | 86.3 | 24 / 35 | 5562 |
| 6 | 1 | 69.6 | 88.3 | 20 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 70% |
| mld.DustBunny 3.8 | 57 | 96% |
| maribo.melee.BMV 0.1 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 47% | 85 |
| mld.DustBunny 3.8 | 15 | 21% | 67 |
| maribo.melee.BMV 0.1 | 8 | 11% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 10 |
| zyx.nano.Ant 1.1 | 4 | 5% | 9 |
| fullsail.SweetTea 1.1 | 4 | 5% | 9 |
| bzdp.BoxCar 2.0 | 2 | 3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 10 |
| cs.Grudge 1.0 | 1 | 1% | 0 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 81.0 | 122 / 210 | 2.71 | 19.3% | 36038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.3% | 122 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.0% | 24 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.3% | 10 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 6 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 1 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.3 | 24 / 35 | 6030 |
| 2 | 1 | 70.0 | 82.2 | 21 / 35 | 6381 |
| 3 | 1 | 69.2 | 82.2 | 21 / 35 | 5867 |
| 4 | 1 | 68.5 | 79.0 | 15 / 35 | 6164 |
| 5 | 1 | 69.8 | 83.2 | 24 / 35 | 6033 |
| 6 | 1 | 66.3 | 70.8 | 17 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 74% |
| cb.nano.Insomnia 1.0 | 24 | 92% |
| myl.nano.KomoriNinja 1.1 | 23 | 83% |
| sp.Nanos.Ember 1.1 | 5 | 60% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 24% | 45 |
| myl.micro.Troodon 1.10 | 19 | 22% | 66 |
| cb.nano.Insomnia 1.0 | 16 | 18% | 22 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 35 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 15 |
| fm.mammillarias 1.3 | 6 | 7% | 10 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 8 |
| sample.Fire 1.0 | 2 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.5 | 156 / 210 | 1.95 | 21.4% | 41612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.4% | 156 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.8% | 22 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 11 |
| tj.zombie1n 1.0.1 | 5.0 | 9.2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.3% | 1 |
| yk.JahMicro 1.0 | 6.0 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.0% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.8% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.7 | 28 / 35 | 6639 |
| 2 | 1 | 69.6 | 82.9 | 22 / 35 | 6714 |
| 3 | 1 | 71.9 | 89.2 | 26 / 35 | 7468 |
| 4 | 1 | 71.4 | 88.9 | 26 / 35 | 6733 |
| 5 | 1 | 72.9 | 92.7 | 29 / 35 | 7281 |
| 6 | 1 | 71.4 | 90.5 | 25 / 35 | 6777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 83 | 93% |
| tvv.micro.Antares 1.1.1 | 24 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 95% |
| stelo.SoJNanoMelee 1.1 | 16 | 88% |
| tj.zombie1n 1.0.1 | 12 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 35% | 101 |
| tvv.micro.Antares 1.1.1 | 9 | 17% | 34 |
| tj.zombie1n 1.0.1 | 7 | 13% | 14 |
| stelo.SoJNanoMelee 1.1 | 5 | 9% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 6 |
| repositorio.NanoStep 1.0 | 3 | 6% | 8 |
| yk.JahMicro 1.0 | 2 | 4% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 65.6 | 79 / 210 | 4.10 | 15.4% | 29974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 15.4% | 79 |
| oog.melee.Corsair 1.0 | 2.0 | 13.5% | 46 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 18 |
| EBBU.Sim2 1.02 | 5.3 | 10.0% | 9 |
| sam.Samspin 1.0 | 6.5 | 9.3% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 1 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 69.2 | 15 / 35 | 5075 |
| 2 | 2 | 60.3 | 60.6 | 13 / 35 | 4540 |
| 3 | 1 | 61.4 | 61.3 | 12 / 35 | 4953 |
| 4 | 1 | 62.6 | 65.7 | 13 / 35 | 4894 |
| 5 | 1 | 61.9 | 61.9 | 13 / 35 | 4862 |
| 6 | 1 | 65.9 | 74.9 | 13 / 35 | 5650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 63% |
| simonton.nano.MeleeSeed 1.8 | 25 | 96% |
| ahf.NanoAndrew .4 | 22 | 68% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| EBBU.Sim2 1.02 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 3 | 67% |

Hadur died in 132 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 22 | 17% | 25 |
| simonton.nano.MeleeSeed 1.8 | 21 | 16% | 43 |
| oog.melee.Corsair 1.0 | 21 | 16% | 42 |
| ahf.NanoAndrew .4 | 20 | 15% | 36 |
| robar.nano.Assertive_Melee 0.2 | 15 | 11% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 18 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| sam.Samspin 1.0 | 6 | 5% | 9 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.8 | 118 / 210 | 2.64 | 18.3% | 31542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.3% | 118 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.6% | 39 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 10 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 7 |
| fm.claire 1.7 | 7.0 | 8.0% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 3 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.3 | 21 / 35 | 4977 |
| 2 | 1 | 67.5 | 80.3 | 20 / 35 | 5355 |
| 3 | 1 | 68.2 | 85.1 | 21 / 35 | 4891 |
| 4 | 1 | 67.3 | 81.0 | 18 / 35 | 5573 |
| 5 | 1 | 69.4 | 86.7 | 22 / 35 | 5523 |
| 6 | 1 | 66.4 | 77.5 | 16 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 87% |
| oog.melee.CapuletDroid 1.1 | 25 | 88% |
| gh.nano.Grofvuil 0.2 | 12 | 83% |
| arthord.NanoSatanMelee Beta | 8 | 75% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| sample.SpinBot 1.0 | 7 | 100% |
| fm.claire 1.7 | 5 | 80% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 93 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 37% | 90 |
| oog.melee.CapuletDroid 1.1 | 14 | 15% | 39 |
| arthord.NanoSatanMelee Beta | 13 | 14% | 19 |
| gh.nano.Grofvuil 0.2 | 8 | 9% | 22 |
| winamp32.micro.MicroMacro 1.0 | 8 | 9% | 13 |
| sample.SpinBot 1.0 | 6 | 6% | 8 |
| fm.claire 1.7 | 4 | 4% | 8 |
| kurios.DOSexe .9b | 3 | 3% | 8 |
| pa.Improved 1.0 | 3 | 3% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 80.7 | 102 / 210 | 2.73 | 18.2% | 34653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.2% | 102 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 38 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 25 |
| mz.MicroGodMelee 1 | 3.8 | 12.9% | 37 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 2 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.6 | 18 / 35 | 5069 |
| 2 | 1 | 69.1 | 84.8 | 17 / 35 | 6121 |
| 3 | 1 | 65.7 | 71.4 | 15 / 35 | 5809 |
| 4 | 1 | 67.8 | 79.4 | 16 / 35 | 5881 |
| 5 | 1 | 70.0 | 89.8 | 20 / 35 | 5996 |
| 6 | 1 | 67.2 | 77.5 | 16 / 35 | 5777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 85% |
| mz.MicroGodMelee 1 | 39 | 67% |
| gh.micro.Gruweltje 0.7 | 32 | 69% |
| el.JumpShoot 0.2 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 36 | 33% | 65 |
| gh.micro.Gruweltje 0.7 | 30 | 28% | 55 |
| spinnercat.micro.Tyger 0.1 | 23 | 21% | 63 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 5 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.7 | 94 / 210 | 3.73 | 16.4% | 31566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.4% | 94 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 13.9% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 34 |
| germ.TheMind .2 | 4.7 | 10.0% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 5 |
| awesomeness.Elite 1.0 | 7.0 | 8.6% | 9 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 3 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.3 | 19 / 35 | 5318 |
| 2 | 1 | 65.7 | 73.0 | 17 / 35 | 5458 |
| 3 | 1 | 67.5 | 79.4 | 19 / 35 | 5575 |
| 4 | 1 | 63.6 | 63.8 | 14 / 35 | 5508 |
| 5 | 2 | 62.1 | 61.3 | 13 / 35 | 5089 |
| 6 | 2 | 62.3 | 66.3 | 12 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 79% |
| germ.TheMind .2 | 10 | 70% |
| awesomeness.Elite 1.0 | 8 | 88% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 40% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 17% | 37 |
| germ.TheMind .2 | 14 | 12% | 20 |
| awesomeness.Elite 1.0 | 10 | 9% | 21 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.9 | 144 / 210 | 2.00 | 20.4% | 33198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.4% | 144 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 9 |
| maribo.IotaCT 1.1 | 3.8 | 10.7% | 11 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.8% | 2 |
| ratosh.Wesco 1.4 | 6.8 | 8.3% | 1 |
| stelo.PatternRobot 1.0 | 7.7 | 7.7% | 3 |
| spinnercat.Omen 1.0 | 8.7 | 7.2% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.0 | 21 / 35 | 5347 |
| 2 | 1 | 72.9 | 94.9 | 29 / 35 | 6340 |
| 3 | 1 | 71.6 | 90.5 | 25 / 35 | 5472 |
| 4 | 1 | 71.1 | 89.8 | 25 / 35 | 5435 |
| 5 | 1 | 69.6 | 82.5 | 23 / 35 | 5313 |
| 6 | 1 | 69.7 | 88.9 | 21 / 35 | 5291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 86 | 90% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| timmit.nano.TimDog 0.33 | 12 | 50% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| maribo.IotaCT 1.1 | 9 | 89% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 36% | 85 |
| timmit.nano.TimDog 0.33 | 12 | 18% | 27 |
| nz.jdc.nano.GridFu 1.0 | 9 | 14% | 41 |
| maribo.IotaCT 1.1 | 7 | 11% | 18 |
| stelo.PatternRobot 1.0 | 6 | 9% | 11 |
| ratosh.Wesco 1.4 | 3 | 5% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 9 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.6 | 163 / 210 | 1.76 | 21.6% | 41002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.6% | 163 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.5% | 19 |
| baal.nano.N 1.42 | 3.0 | 11.6% | 9 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 3 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 9 |
| sanja.First 0.1 | 6.0 | 8.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.3% | 1 |
| cvt.Firsty 1.0 | 7.5 | 7.4% | 3 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.3 | 26 / 35 | 7460 |
| 2 | 1 | 72.6 | 94.0 | 30 / 35 | 7097 |
| 3 | 1 | 71.0 | 91.1 | 25 / 35 | 6480 |
| 4 | 1 | 70.4 | 85.1 | 26 / 35 | 6646 |
| 5 | 1 | 73.1 | 97.8 | 31 / 35 | 6926 |
| 6 | 1 | 70.3 | 88.3 | 25 / 35 | 6393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 50 | 82% |
| baal.nano.N 1.42 | 36 | 86% |
| cvt.Firsty 1.0 | 25 | 96% |
| zyx.micro.Ant 1.1 | 23 | 83% |
| Grystrion.TrackerWO 1.0 | 20 | 100% |
| sanja.First 0.1 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 14 | 29% | 63 |
| baal.nano.N 1.42 | 9 | 19% | 46 |
| zyx.micro.Ant 1.1 | 8 | 17% | 29 |
| Grystrion.TrackerWO 1.0 | 4 | 8% | 21 |
| amk.Punbot.Punbot 0.01 | 4 | 8% | 9 |
| cvt.Firsty 1.0 | 3 | 6% | 21 |
| sanja.First 0.1 | 3 | 6% | 9 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 4 |
| sample.RamFire 1.0 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 66.2 | 78 / 210 | 4.04 | 15.3% | 32161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 15.3% | 78 |
| kc.micro.Figment 1.0 | 2.0 | 14.5% | 61 |
| cs.Wren 1.0 | 2.7 | 12.8% | 20 |
| js.PinBall 1.6 | 4.2 | 11.4% | 17 |
| mz.Cork 0.1 | 5.0 | 10.9% | 18 |
| joe.ADinosaur 1.0 | 5.8 | 9.4% | 3 |
| evd.X1 0.01 | 7.5 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 7.7 | 7.0% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 6.0% | 4 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 70.5 | 14 / 35 | 5001 |
| 2 | 1 | 64.1 | 66.7 | 14 / 35 | 5741 |
| 3 | 2 | 61.7 | 64.1 | 9 / 35 | 5353 |
| 4 | 2 | 59.8 | 57.1 | 8 / 35 | 5165 |
| 5 | 1 | 62.8 | 67.0 | 12 / 35 | 5182 |
| 6 | 1 | 65.8 | 71.7 | 21 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 40 | 70% |
| cs.Wren 1.0 | 27 | 93% |
| js.PinBall 1.6 | 8 | 75% |
| mz.Cork 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 39% | 85 |
| evd.X1 0.01 | 21 | 16% | 22 |
| js.PinBall 1.6 | 15 | 11% | 24 |
| cs.Wren 1.0 | 14 | 11% | 35 |
| mz.Cork 0.1 | 14 | 11% | 20 |
| joe.ADinosaur 1.0 | 8 | 6% | 10 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.2 | 123 / 210 | 2.60 | 18.8% | 30880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.8% | 123 |
| ntc.Opposite 1.5 | 2.8 | 11.8% | 11 |
| myl.nano.Graviton 1.10 | 2.8 | 11.9% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 10 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.7% | 10 |
| disan.Chair 2.2.0 | 7.5 | 8.1% | 9 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.0 | 17 / 35 | 5151 |
| 2 | 1 | 70.5 | 92.4 | 24 / 35 | 5388 |
| 3 | 1 | 69.1 | 82.9 | 23 / 35 | 5282 |
| 4 | 1 | 65.0 | 72.4 | 17 / 35 | 4732 |
| 5 | 1 | 68.2 | 81.6 | 19 / 35 | 5675 |
| 6 | 1 | 69.3 | 89.8 | 23 / 35 | 4652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 27 | 81% |
| ntc.Opposite 1.5 | 26 | 73% |
| stelo.AreaTargetingBot 1.1 | 22 | 95% |
| disan.Chair 2.2.0 | 17 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| donjezza.Muncho 1.0 | 12 | 92% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 22% | 40 |
| ntc.Opposite 1.5 | 15 | 17% | 32 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 26 |
| stelo.AreaTargetingBot 1.1 | 12 | 14% | 31 |
| disan.Chair 2.2.0 | 6 | 7% | 21 |
| DBall.NUKE 0.1 | 3 | 3% | 13 |
| donjezza.Muncho 1.0 | 2 | 2% | 13 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.1 | 91 / 210 | 3.33 | 16.1% | 26320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.1% | 91 |
| oog.melee.Capulet 1.2 | 2.7 | 14.2% | 47 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.9% | 30 |
| yagami.Tidus 0.11 | 5.3 | 11.8% | 9 |
| ejb.Polaris 1.0.1 | 5.5 | 11.3% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 66.7 | 12 / 35 | 4724 |
| 2 | 1 | 66.4 | 74.3 | 18 / 35 | 4929 |
| 3 | 1 | 64.7 | 74.6 | 17 / 35 | 3899 |
| 4 | 1 | 63.0 | 68.6 | 12 / 35 | 4401 |
| 5 | 1 | 66.5 | 80.3 | 18 / 35 | 3923 |
| 6 | 1 | 66.8 | 80.3 | 14 / 35 | 4444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 84% |
| oog.melee.Capulet 1.2 | 30 | 53% |
| kawigi.micro.Shiz 1.1 | 26 | 100% |
| yagami.Tidus 0.11 | 16 | 88% |
| ejb.Polaris 1.0.1 | 12 | 75% |

Hadur died in 119 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 45% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 15% | 48 |
| yagami.Tidus 0.11 | 13 | 11% | 24 |
| ejb.Polaris 1.0.1 | 12 | 10% | 26 |
| kawigi.micro.Shiz 1.1 | 8 | 7% | 24 |
| kurios.DOSexe .9a | 7 | 6% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.5 | 119 / 210 | 2.85 | 17.3% | 27323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.3% | 119 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 18 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 22 |
| ratosh.Nobo 0.21 | 3.7 | 11.1% | 12 |
| wompi.Quokka 1.6 | 4.5 | 11.2% | 17 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 7.2 | 8.9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.4% | 4 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.4% | 2 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.4 | 21 / 35 | 4576 |
| 2 | 1 | 67.2 | 82.9 | 21 / 35 | 4855 |
| 3 | 1 | 68.0 | 84.8 | 21 / 35 | 4807 |
| 4 | 1 | 65.8 | 79.4 | 20 / 35 | 4610 |
| 5 | 1 | 64.5 | 75.6 | 18 / 35 | 4417 |
| 6 | 1 | 64.4 | 75.9 | 18 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 89% |
| wee.Gem 1.8.4 | 25 | 92% |
| wompi.Quokka 1.6 | 17 | 82% |
| ratosh.Nobo 0.21 | 16 | 75% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 21% | 58 |
| ratosh.Nobo 0.21 | 17 | 18% | 31 |
| wompi.Quokka 1.6 | 13 | 14% | 22 |
| bayen.UbaMicro 1.4 | 12 | 13% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 13 |
| wee.Gem 1.8.4 | 8 | 9% | 42 |
| m3thos.Eva00 1.1 | 6 | 7% | 14 |
| maribo.FollowFire 1 | 6 | 7% | 8 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 5 |

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 89.8 | 131 / 210 | 1.91 | 22.6% | 51295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.6% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 51 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 20 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 6 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.6 | 97.5 | 28 / 35 | 8655 |
| 2 | 1 | 74.2 | 90.8 | 18 / 35 | 9108 |
| 3 | 1 | 74.0 | 89.5 | 25 / 35 | 8470 |
| 4 | 1 | 72.9 | 84.8 | 18 / 35 | 8286 |
| 5 | 1 | 73.4 | 88.3 | 21 / 35 | 8511 |
| 6 | 1 | 73.5 | 88.3 | 21 / 35 | 8265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 80% |
| mz.NanoGod 2.02 | 13 | 46% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 51% | 143 |
| mz.NanoGod 2.02 | 27 | 34% | 39 |
| ayk.WallHugger 1.0 | 4 | 5% | 10 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 8 |
| stuff.Vlad 0.1 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.9 | 99 / 210 | 3.70 | 16.1% | 28409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.1% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 31 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.2% | 19 |
| bvh.micro.Freya 0.3 | 5.0 | 10.7% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.5% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 3 |
| ap.Frederick 1.1 | 8.3 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 69.8 | 15 / 35 | 4602 |
| 2 | 1 | 65.9 | 75.2 | 20 / 35 | 4845 |
| 3 | 1 | 63.8 | 70.2 | 15 / 35 | 4570 |
| 4 | 1 | 61.5 | 62.2 | 15 / 35 | 4541 |
| 5 | 1 | 64.9 | 71.7 | 18 / 35 | 5064 |
| 6 | 1 | 64.3 | 70.5 | 16 / 35 | 4787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 92% |
| dummy.micro.Sparrow 2.5 | 31 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 86% |
| bvh.micro.Freya 0.3 | 13 | 77% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 21% | 52 |
| dummy.micro.Sparrow 2.5 | 18 | 16% | 43 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 14% | 17 |
| bvh.micro.Freya 0.3 | 14 | 13% | 22 |
| conscience.Electron 1.3g | 12 | 11% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 10% | 33 |
| dl.BetterWalls 1.0 | 9 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 16 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 84.2 | 143 / 210 | 2.42 | 21.0% | 42844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.0% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 24 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 14 |
| supersample.SuperBoxBot 1.0 | 4.2 | 11.0% | 13 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 9 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.2 | 5.7% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.7% | 1 |
| sample.Corners 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 95.2 | 27 / 35 | 8109 |
| 2 | 1 | 70.5 | 82.5 | 23 / 35 | 6919 |
| 3 | 1 | 70.4 | 77.5 | 22 / 35 | 7260 |
| 4 | 1 | 70.2 | 81.6 | 24 / 35 | 6603 |
| 5 | 1 | 71.0 | 82.5 | 26 / 35 | 7070 |
| 6 | 1 | 71.1 | 85.7 | 21 / 35 | 6883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 47 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 87% |
| supersample.SuperBoxBot 1.0 | 34 | 82% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| dsw.StaticD 1.0 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 34% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 28% | 54 |
| dsw.StaticD 1.0 | 9 | 13% | 17 |
| sul.Lunar 1.1 | 7 | 10% | 62 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 10 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.3 | 114 / 210 | 2.68 | 18.6% | 37882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.6% | 114 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.4% | 20 |
| mld.Wisdom 1.0 | 3.7 | 11.9% | 21 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 7 |
| amz.NanoClone 1.41 | 5.2 | 10.2% | 11 |
| sample.Walls 1.0 | 7.5 | 7.4% | 1 |
| GarmBox.Oranges 1.0 | 8.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 5 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.7 | 26 / 35 | 7360 |
| 2 | 1 | 65.2 | 73.0 | 14 / 35 | 5903 |
| 3 | 1 | 66.6 | 76.2 | 14 / 35 | 6076 |
| 4 | 1 | 68.4 | 82.9 | 21 / 35 | 6130 |
| 5 | 1 | 66.9 | 76.8 | 19 / 35 | 5963 |
| 6 | 1 | 69.2 | 85.4 | 20 / 35 | 6450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 92% |
| radnor.DoctorBob 1.42 | 34 | 65% |
| mld.Wisdom 1.0 | 24 | 67% |
| KiraNL.Chupacabra 0.4 | 14 | 93% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 29% | 46 |
| radnor.DoctorBob 1.42 | 25 | 26% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 57 |
| KiraNL.Chupacabra 0.4 | 10 | 10% | 23 |
| amz.NanoClone 1.41 | 6 | 6% | 9 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 5 | 5% | 6 |
| sample.Walls 1.0 | 3 | 3% | 9 |

