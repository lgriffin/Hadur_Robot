# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 91.3 | 163 / 210 | 1.78 | 22.4% | 44898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 22.4% | 163 |
| mz.AntiGrav 1.0 | 2.2 | 14.1% | 11 |
| radnor.DoctorBob 1.42 | 3.0 | 13.5% | 18 |
| mld.Infinity 2.2 | 3.8 | 13.1% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 2 |
| sample.Walls 1.0 | 6.5 | 6.6% | 2 |
| GarmBox.Oranges 1.0 | 7.5 | 6.1% | 1 |
| jangs.ns51 1.0 | 7.5 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 8.7 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.3 | 25 / 35 | 7514 |
| 2 | 1 | 73.0 | 91.4 | 27 / 35 | 7372 |
| 3 | 1 | 73.0 | 89.5 | 26 / 35 | 7350 |
| 4 | 1 | 72.8 | 89.8 | 28 / 35 | 7159 |
| 5 | 1 | 75.4 | 95.6 | 31 / 35 | 8137 |
| 6 | 1 | 72.6 | 88.3 | 26 / 35 | 7366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 96% |
| mld.Infinity 2.2 | 45 | 96% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| amz.NanoClone 1.41 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 19 | 40% | 80 |
| radnor.DoctorBob 1.42 | 17 | 36% | 60 |
| mld.Infinity 2.2 | 3 | 6% | 51 |
| sample.Walls 1.0 | 3 | 6% | 7 |
| amz.NanoClone 1.41 | 2 | 4% | 5 |
| GarmBox.Oranges 1.0 | 2 | 4% | 1 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.5 | 127 / 210 | 2.21 | 19.0% | 33595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.0% | 127 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.8% | 38 |
| mld.DustBunny 3.8 | 3.2 | 12.2% | 21 |
| maribo.melee.BMV 0.1 | 3.7 | 10.9% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.9% | 7 |
| zyx.nano.Ant 1.1 | 5.8 | 8.9% | 0 |
| fullsail.SweetTea 1.1 | 7.5 | 7.5% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.1% | 7 |
| bzdp.BoxCar 2.0 | 8.3 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 18 / 35 | 5421 |
| 2 | 1 | 66.4 | 80.0 | 21 / 35 | 5134 |
| 3 | 1 | 69.8 | 91.4 | 22 / 35 | 6184 |
| 4 | 1 | 71.0 | 93.3 | 24 / 35 | 6100 |
| 5 | 1 | 68.3 | 84.1 | 23 / 35 | 5453 |
| 6 | 1 | 68.2 | 85.7 | 19 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 70% |
| mld.DustBunny 3.8 | 52 | 85% |
| djdjdj.NanoSkunk10 1.0 | 16 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 75% |
| maribo.melee.BMV 0.1 | 11 | 64% |
| fullsail.SweetTea 1.1 | 11 | 73% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 35% | 72 |
| mld.DustBunny 3.8 | 18 | 21% | 53 |
| maribo.melee.BMV 0.1 | 10 | 12% | 18 |
| zyx.nano.Ant 1.1 | 7 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 15 |
| fullsail.SweetTea 1.1 | 6 | 7% | 12 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 21 |
| bzdp.BoxCar 2.0 | 3 | 4% | 7 |
| cs.Grudge 1.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.4 | 139 / 210 | 2.31 | 20.5% | 38403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.5% | 139 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.1% | 20 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.3% | 9 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.4% | 7 |
| fm.mammillarias 1.3 | 5.7 | 8.9% | 1 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.2% | 4 |
| sample.Fire 1.0 | 9.2 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 82.5 | 20 / 35 | 6319 |
| 2 | 1 | 73.0 | 93.7 | 27 / 35 | 7045 |
| 3 | 1 | 70.2 | 82.5 | 24 / 35 | 6402 |
| 4 | 1 | 70.2 | 84.8 | 25 / 35 | 6061 |
| 5 | 1 | 70.9 | 84.4 | 22 / 35 | 6661 |
| 6 | 1 | 70.0 | 84.8 | 21 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 51 | 90% |
| myl.micro.Troodon 1.10 | 42 | 95% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| myl.nano.KomoriNinja 1.1 | 12 | 75% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 8 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 15 | 21% | 43 |
| myl.nano.KomoriNinja 1.1 | 15 | 21% | 40 |
| myl.micro.Troodon 1.10 | 14 | 20% | 63 |
| cb.nano.Insomnia 1.0 | 14 | 20% | 17 |
| sp.Nanos.Ember 1.1 | 5 | 7% | 19 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 10 |
| sample.Fire 1.0 | 2 | 3% | 7 |
| fm.mammillarias 1.3 | 1 | 1% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.0 | 141 / 210 | 2.35 | 20.5% | 40235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.5% | 141 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 19 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.4% | 12 |
| tj.zombie1n 1.0.1 | 4.7 | 9.5% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.4% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.8% | 1 |
| yk.JahMicro 1.0 | 6.7 | 8.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 8 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 82.9 | 21 / 35 | 6748 |
| 2 | 1 | 68.7 | 78.4 | 23 / 35 | 6444 |
| 3 | 1 | 70.8 | 86.7 | 23 / 35 | 6884 |
| 4 | 1 | 71.7 | 88.9 | 25 / 35 | 7118 |
| 5 | 1 | 70.2 | 87.0 | 23 / 35 | 6414 |
| 6 | 1 | 70.8 | 86.0 | 26 / 35 | 6627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 95% |
| stelo.SoJNanoMelee 1.1 | 32 | 91% |
| tj.zombie1n 1.0.1 | 17 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| tvv.micro.Antares 1.1.1 | 12 | 75% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 32% | 86 |
| stelo.SoJNanoMelee 1.1 | 12 | 17% | 29 |
| tvv.micro.Antares 1.1.1 | 10 | 14% | 27 |
| tj.zombie1n 1.0.1 | 8 | 12% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 24 |
| yk.JahMicro 1.0 | 3 | 4% | 7 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.7 | 93 / 210 | 3.90 | 15.8% | 28444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 15.8% | 93 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 34 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 25 |
| EBBU.Sim2 1.02 | 5.5 | 9.7% | 6 |
| sam.Samspin 1.0 | 6.5 | 9.1% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 69.2 | 15 / 35 | 5009 |
| 2 | 1 | 62.3 | 64.8 | 14 / 35 | 4621 |
| 3 | 1 | 60.4 | 58.4 | 12 / 35 | 4445 |
| 4 | 1 | 63.9 | 69.8 | 17 / 35 | 4609 |
| 5 | 1 | 64.7 | 71.1 | 18 / 35 | 4969 |
| 6 | 1 | 64.7 | 73.0 | 17 / 35 | 4791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 91% |
| oog.melee.Corsair 1.0 | 25 | 52% |
| ahf.NanoAndrew .4 | 21 | 81% |
| sam.Samspin 1.0 | 12 | 100% |
| EBBU.Sim2 1.02 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 19% | 52 |
| oog.melee.Corsair 1.0 | 22 | 19% | 40 |
| ahf.NanoAndrew .4 | 15 | 13% | 31 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 17 |
| EBBU.Sim2 1.02 | 12 | 10% | 20 |
| sam.Samspin 1.0 | 11 | 9% | 20 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 10 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 137 / 210 | 2.17 | 19.5% | 33294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.5% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 34 |
| gh.nano.Grofvuil 0.2 | 3.8 | 10.4% | 8 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.3% | 13 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.3% | 6 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 7 |
| sample.SpinBot 1.0 | 7.5 | 7.2% | 2 |
| fm.claire 1.7 | 7.8 | 7.4% | 0 |
| pa.Improved 1.0 | 8.8 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 23 / 35 | 5762 |
| 2 | 1 | 69.4 | 87.9 | 25 / 35 | 5550 |
| 3 | 1 | 70.9 | 91.4 | 26 / 35 | 5945 |
| 4 | 1 | 68.2 | 85.1 | 21 / 35 | 5350 |
| 5 | 1 | 67.8 | 81.9 | 22 / 35 | 5109 |
| 6 | 1 | 69.0 | 87.9 | 20 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 83% |
| oog.melee.CapuletDroid 1.1 | 39 | 100% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| gh.nano.Grofvuil 0.2 | 12 | 75% |
| sample.SpinBot 1.0 | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 36% | 80 |
| arthord.NanoSatanMelee Beta | 14 | 19% | 21 |
| gh.nano.Grofvuil 0.2 | 9 | 12% | 21 |
| sample.SpinBot 1.0 | 6 | 8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 14 |
| fm.claire 1.7 | 4 | 5% | 6 |
| pa.Improved 1.0 | 4 | 5% | 6 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 45 |
| kurios.DOSexe .9b | 2 | 3% | 7 |

## Melee bench: F07

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.2 | 109 / 210 | 2.51 | 18.7% | 34675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 18.7% | 109 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 32 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 24 |
| mz.MicroGodMelee 1 | 3.7 | 12.6% | 28 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 9 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.1% | 4 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.3 | 16 / 35 | 4908 |
| 2 | 1 | 70.3 | 88.3 | 22 / 35 | 5911 |
| 3 | 1 | 66.8 | 77.8 | 11 / 35 | 5627 |
| 4 | 1 | 69.3 | 87.6 | 19 / 35 | 6098 |
| 5 | 1 | 70.1 | 87.9 | 21 / 35 | 6436 |
| 6 | 1 | 69.1 | 84.4 | 20 / 35 | 5695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 90% |
| mz.MicroGodMelee 1 | 43 | 70% |
| gh.micro.Gruweltje 0.7 | 27 | 70% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 29 | 29% | 55 |
| mz.MicroGodMelee 1 | 28 | 28% | 62 |
| spinnercat.micro.Tyger 0.1 | 19 | 19% | 51 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 10 |
| acogdev.alpha 0.2 | 8 | 8% | 9 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 10 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 76.6 | 129 / 210 | 3.11 | 17.8% | 31840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 17.8% | 129 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.2% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 30 |
| germ.TheMind .2 | 4.5 | 9.5% | 1 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 3 |
| awesomeness.Elite 1.0 | 6.7 | 8.1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.6% | 4 |
| sample.Crazy 1.0 | 8.0 | 7.0% | 4 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.6% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.1 | 16 / 35 | 5030 |
| 2 | 1 | 67.5 | 80.6 | 23 / 35 | 5058 |
| 3 | 1 | 66.5 | 74.0 | 22 / 35 | 5226 |
| 4 | 1 | 68.1 | 79.7 | 25 / 35 | 5408 |
| 5 | 1 | 65.9 | 73.3 | 18 / 35 | 5305 |
| 6 | 1 | 68.6 | 80.6 | 25 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 91% |
| germ.TheMind .2 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 50% |
| awesomeness.Elite 1.0 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 32 | 40% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 16% | 30 |
| stelo.UntouchableNano 1.3 | 12 | 15% | 16 |
| germ.TheMind .2 | 8 | 10% | 21 |
| awesomeness.Elite 1.0 | 6 | 7% | 16 |
| qualidafial.MajorDick 1.0.1 | 4 | 5% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 11 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 85.3 | 141 / 210 | 2.32 | 19.6% | 31483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.6% | 141 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.5% | 17 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.8% | 1 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.3% | 9 |
| ratosh.Wesco 1.4 | 7.3 | 8.4% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 8.2% | 9 |
| spinnercat.Omen 1.0 | 8.2 | 7.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 25 / 35 | 4753 |
| 2 | 1 | 71.9 | 90.8 | 27 / 35 | 5773 |
| 3 | 1 | 69.8 | 87.9 | 22 / 35 | 5130 |
| 4 | 1 | 72.1 | 92.1 | 29 / 35 | 5769 |
| 5 | 1 | 66.9 | 76.5 | 17 / 35 | 4987 |
| 6 | 1 | 68.5 | 79.7 | 21 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 57 | 93% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| stelo.PatternRobot 1.0 | 16 | 81% |
| timmit.nano.TimDog 0.33 | 11 | 64% |
| maribo.IotaCT 1.1 | 10 | 100% |
| ratosh.Wesco 1.4 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 8 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 26% | 61 |
| timmit.nano.TimDog 0.33 | 15 | 22% | 26 |
| nz.jdc.nano.GridFu 1.0 | 8 | 12% | 49 |
| ratosh.Wesco 1.4 | 8 | 12% | 22 |
| stelo.PatternRobot 1.0 | 7 | 10% | 17 |
| maribo.IotaCT 1.1 | 6 | 9% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 7 |
| spinnercat.Omen 1.0 | 2 | 3% | 8 |

## Melee bench: F10

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 90.3 | 171 / 210 | 1.88 | 21.6% | 40439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.6% | 171 |
| tvv.nano.Polaris 1.2 | 2.8 | 12.0% | 12 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 11 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.8% | 2 |
| zyx.micro.Ant 1.1 | 6.0 | 8.9% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.2% | 1 |
| sanja.First 0.1 | 6.8 | 8.0% | 1 |
| cvt.Firsty 1.0 | 7.5 | 7.3% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 2 |
| sample.RamFire 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.3 | 27 / 35 | 5741 |
| 2 | 1 | 72.3 | 93.3 | 30 / 35 | 6914 |
| 3 | 1 | 72.8 | 94.0 | 28 / 35 | 7220 |
| 4 | 1 | 72.8 | 93.3 | 30 / 35 | 7119 |
| 5 | 1 | 71.1 | 89.5 | 27 / 35 | 6656 |
| 6 | 1 | 71.5 | 90.2 | 29 / 35 | 6789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 97% |
| baal.nano.N 1.42 | 36 | 89% |
| cvt.Firsty 1.0 | 27 | 93% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| amk.Punbot.Punbot 0.01 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| sanja.First 0.1 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 26% | 39 |
| baal.nano.N 1.42 | 8 | 21% | 34 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 62 |
| sample.RamFire 1.0 | 5 | 13% | 6 |
| cvt.Firsty 1.0 | 4 | 10% | 19 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 13 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 6 |
| sanja.First 0.1 | 1 | 3% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 13 |

## Melee bench: F11

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.2 | 90 / 210 | 3.68 | 15.9% | 31493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.2 | 15.9% | 90 |
| kc.micro.Figment 1.0 | 1.8 | 14.8% | 59 |
| cs.Wren 1.0 | 3.3 | 12.4% | 19 |
| js.PinBall 1.6 | 4.0 | 11.7% | 14 |
| mz.Cork 0.1 | 4.7 | 10.9% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 5 |
| evd.X1 0.01 | 7.0 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 60.3 | 10 / 35 | 4888 |
| 2 | 2 | 62.7 | 66.3 | 13 / 35 | 4968 |
| 3 | 1 | 65.2 | 72.4 | 16 / 35 | 5571 |
| 4 | 1 | 64.7 | 74.3 | 17 / 35 | 5059 |
| 5 | 1 | 65.5 | 74.0 | 17 / 35 | 5469 |
| 6 | 1 | 65.6 | 74.0 | 17 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 72% |
| cs.Wren 1.0 | 31 | 84% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 7 | 86% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 120 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 41% | 95 |
| cs.Wren 1.0 | 21 | 18% | 42 |
| mz.Cork 0.1 | 12 | 10% | 20 |
| evd.X1 0.01 | 12 | 10% | 14 |
| joe.ADinosaur 1.0 | 8 | 7% | 11 |
| js.PinBall 1.6 | 6 | 5% | 12 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 3% | 6 |

## Melee bench: F12

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.4 | 135 / 210 | 2.40 | 19.1% | 29697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.1% | 135 |
| myl.nano.Graviton 1.10 | 2.5 | 11.7% | 16 |
| ntc.Opposite 1.5 | 3.5 | 11.3% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.4% | 3 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 10 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 6.4% | 9 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.7 | 21 / 35 | 4878 |
| 2 | 1 | 68.4 | 84.1 | 23 / 35 | 5033 |
| 3 | 1 | 70.4 | 90.5 | 25 / 35 | 5145 |
| 4 | 1 | 70.4 | 92.1 | 27 / 35 | 5062 |
| 5 | 1 | 66.0 | 79.4 | 17 / 35 | 4690 |
| 6 | 1 | 68.1 | 81.9 | 22 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 91% |
| stelo.AreaTargetingBot 1.1 | 30 | 83% |
| ntc.Opposite 1.5 | 23 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| disan.Chair 2.2.0 | 12 | 83% |
| donjezza.Muncho 1.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| DBall.NUKE 0.1 | 10 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 21% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 20% | 27 |
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 46 |
| ntc.Opposite 1.5 | 12 | 16% | 28 |
| pfvicm.Sobieski 7.2.3b | 9 | 12% | 17 |
| disan.Chair 2.2.0 | 4 | 5% | 16 |
| DBall.NUKE 0.1 | 2 | 3% | 13 |
| donjezza.Muncho 1.0 | 2 | 3% | 7 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.9 | 83 / 210 | 3.44 | 16.0% | 26887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.0% | 83 |
| oog.melee.Capulet 1.2 | 2.5 | 13.7% | 49 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 21 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 9 |
| step.nanoPri 1.0 | 7.2 | 7.6% | 1 |
| stelo.MirrorNano 1.3 | 7.8 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.7 | 14 / 35 | 4804 |
| 2 | 1 | 66.0 | 77.1 | 15 / 35 | 4567 |
| 3 | 1 | 64.5 | 73.0 | 13 / 35 | 4301 |
| 4 | 1 | 62.3 | 63.5 | 13 / 35 | 4317 |
| 5 | 1 | 64.2 | 69.5 | 13 / 35 | 4523 |
| 6 | 1 | 65.4 | 75.6 | 15 / 35 | 4375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 51% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 78% |
| yagami.Tidus 0.11 | 16 | 94% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| step.nanoPri 1.0 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 40% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 36 |
| yagami.Tidus 0.11 | 17 | 13% | 30 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 34 |
| ejb.Polaris 1.0.1 | 12 | 9% | 21 |
| step.nanoPri 1.0 | 6 | 5% | 8 |
| stelo.MirrorNano 1.3 | 4 | 3% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.9 | 142 / 210 | 2.54 | 18.4% | 28992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 18.4% | 142 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 23 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 16 |
| wompi.Quokka 1.6 | 3.8 | 10.8% | 9 |
| ratosh.Nobo 0.21 | 4.5 | 10.5% | 5 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 6.5 | 9.0% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 3 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 25 / 35 | 4883 |
| 2 | 1 | 69.2 | 89.2 | 27 / 35 | 4835 |
| 3 | 1 | 65.4 | 76.8 | 20 / 35 | 4475 |
| 4 | 1 | 64.6 | 73.3 | 20 / 35 | 4402 |
| 5 | 1 | 66.9 | 80.0 | 21 / 35 | 4997 |
| 6 | 1 | 70.5 | 90.5 | 29 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 93% |
| wee.Gem 1.8.4 | 33 | 100% |
| wompi.Quokka 1.6 | 22 | 95% |
| ratosh.Nobo 0.21 | 12 | 100% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 10 | 70% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 20% | 57 |
| bayen.UbaMicro 1.4 | 12 | 17% | 19 |
| wompi.Quokka 1.6 | 8 | 12% | 27 |
| ratosh.Nobo 0.21 | 8 | 12% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 10% | 10 |
| maribo.FollowFire 1 | 7 | 10% | 8 |
| wee.Gem 1.8.4 | 6 | 9% | 51 |
| m3thos.Eva00 1.1 | 5 | 7% | 12 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.0 | 125 / 210 | 2.17 | 21.1% | 46139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.1% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 62 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 16 |
| ayk.WallHugger 1.0 | 4.2 | 9.9% | 1 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 90.5 | 22 / 35 | 8162 |
| 2 | 1 | 71.9 | 89.2 | 19 / 35 | 7574 |
| 3 | 1 | 72.6 | 87.3 | 23 / 35 | 7945 |
| 4 | 1 | 70.6 | 80.3 | 19 / 35 | 7228 |
| 5 | 1 | 71.2 | 83.5 | 19 / 35 | 7257 |
| 6 | 1 | 73.5 | 91.1 | 23 / 35 | 7973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 73% |
| exauge.GateKeeper 1.1.121g | 13 | 100% |
| mz.NanoGod 2.02 | 12 | 75% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 53% | 136 |
| mz.NanoGod 2.02 | 19 | 22% | 39 |
| exauge.GateKeeper 1.1.121g | 10 | 12% | 12 |
| ayk.WallHugger 1.0 | 4 | 5% | 8 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| drd.Dreadknoght 0.9 | 2 | 2% | 5 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 73.7 | 106 / 210 | 3.37 | 17.0% | 29880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 17.0% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 16 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 26 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 18 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.5% | 12 |
| conscience.Electron 1.3g | 7.2 | 7.5% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.1% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 73.7 | 16 / 35 | 5312 |
| 2 | 1 | 64.7 | 73.3 | 18 / 35 | 4603 |
| 3 | 1 | 68.7 | 86.3 | 22 / 35 | 5224 |
| 4 | 1 | 64.0 | 68.3 | 17 / 35 | 5051 |
| 5 | 1 | 64.9 | 71.7 | 15 / 35 | 5062 |
| 6 | 1 | 64.2 | 68.9 | 18 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 95% |
| dummy.micro.Sparrow 2.5 | 30 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 75% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| stelo.MirrorMicro 1.0 | 8 | 63% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 19 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 16% | 41 |
| dl.BetterWalls 1.0 | 14 | 13% | 19 |
| bvh.micro.Freya 0.3 | 11 | 11% | 22 |
| conscience.Electron 1.3g | 10 | 10% | 11 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 14 |
| voidious.micro.BlitzBat 1.05 | 6 | 6% | 42 |

## Melee bench: F17

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 86.5 | 148 / 210 | 2.22 | 21.2% | 41997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.2% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 23 |
| sul.Lunar 1.1 | 3.2 | 10.9% | 7 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.3% | 9 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 6 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.6% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.6% | 5 |
| sample.Corners 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 86.7 | 26 / 35 | 6599 |
| 2 | 1 | 72.3 | 87.9 | 26 / 35 | 7379 |
| 3 | 1 | 71.6 | 86.3 | 25 / 35 | 7056 |
| 4 | 1 | 71.9 | 86.7 | 24 / 35 | 7606 |
| 5 | 1 | 69.5 | 81.0 | 23 / 35 | 6214 |
| 6 | 1 | 72.1 | 90.2 | 24 / 35 | 7143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 91% |
| sul.Lunar 1.1 | 40 | 100% |
| supersample.SuperBoxBot 1.0 | 27 | 89% |
| mme.NikeEnhanced 2.0 | 17 | 100% |
| dsw.StaticD 1.0 | 7 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 26% | 31 |
| dsw.StaticD 1.0 | 16 | 26% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 24% | 61 |
| sul.Lunar 1.1 | 5 | 8% | 46 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 17 |
| sample.Corners 1.0 | 3 | 5% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 81.6 | 122 / 210 | 2.66 | 19.0% | 38399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.0% | 122 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.1% | 26 |
| mld.Wisdom 1.0 | 3.5 | 11.8% | 15 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.4% | 6 |
| amz.NanoClone 1.41 | 6.2 | 9.1% | 8 |
| sample.Walls 1.0 | 7.2 | 7.8% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.2 | 19 / 35 | 6345 |
| 2 | 1 | 67.6 | 78.1 | 20 / 35 | 6263 |
| 3 | 1 | 65.8 | 73.7 | 18 / 35 | 5739 |
| 4 | 1 | 69.0 | 83.5 | 20 / 35 | 6376 |
| 5 | 1 | 69.6 | 82.2 | 23 / 35 | 6591 |
| 6 | 1 | 71.0 | 88.9 | 22 / 35 | 7085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 54 | 85% |
| radnor.DoctorBob 1.42 | 29 | 86% |
| mld.Wisdom 1.0 | 19 | 79% |
| sample.Walls 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| jangs.ns51 1.0 | 8 | 88% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 22 | 25% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 20% | 63 |
| radnor.DoctorBob 1.42 | 17 | 19% | 50 |
| KiraNL.Chupacabra 0.4 | 13 | 15% | 20 |
| amz.NanoClone 1.41 | 8 | 9% | 18 |
| jangs.ns51 1.0 | 6 | 7% | 8 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

