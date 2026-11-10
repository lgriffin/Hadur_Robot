# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.4 | 141 / 210 | 2.40 | 20.4% | 42072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.4% | 141 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 24 |
| mz.AntiGrav 1.0 | 3.0 | 13.9% | 13 |
| mld.Infinity 2.2 | 3.3 | 12.6% | 23 |
| amz.NanoClone 1.41 | 4.8 | 11.0% | 5 |
| sample.Walls 1.0 | 6.3 | 7.4% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 1 |
| sample.Target 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 87.3 | 25 / 35 | 7221 |
| 2 | 1 | 71.5 | 85.1 | 22 / 35 | 7354 |
| 3 | 1 | 71.7 | 84.1 | 27 / 35 | 7257 |
| 4 | 1 | 68.9 | 77.8 | 20 / 35 | 6469 |
| 5 | 1 | 73.0 | 93.0 | 27 / 35 | 7338 |
| 6 | 1 | 68.6 | 79.0 | 20 / 35 | 6433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 60 | 97% |
| mld.Infinity 2.2 | 41 | 90% |
| radnor.DoctorBob 1.42 | 28 | 93% |
| amz.NanoClone 1.41 | 8 | 88% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 34% | 61 |
| mz.AntiGrav 1.0 | 12 | 17% | 65 |
| amz.NanoClone 1.41 | 12 | 17% | 22 |
| mld.Infinity 2.2 | 11 | 16% | 35 |
| sample.Walls 1.0 | 6 | 9% | 11 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.6 | 115 / 210 | 2.39 | 18.0% | 30256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.0% | 115 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.0% | 58 |
| mld.DustBunny 3.8 | 3.5 | 12.7% | 14 |
| maribo.melee.BMV 0.1 | 4.3 | 10.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.4% | 9 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| bzdp.BoxCar 2.0 | 8.0 | 6.8% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.6 | 20 / 35 | 5540 |
| 2 | 1 | 67.1 | 79.7 | 20 / 35 | 5532 |
| 3 | 1 | 66.1 | 84.1 | 16 / 35 | 4460 |
| 4 | 1 | 67.5 | 87.6 | 20 / 35 | 4884 |
| 5 | 1 | 67.5 | 83.5 | 17 / 35 | 5362 |
| 6 | 1 | 66.8 | 83.8 | 22 / 35 | 4478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 64% |
| mld.DustBunny 3.8 | 45 | 96% |
| djdjdj.NanoSkunk10 1.0 | 16 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| maribo.melee.BMV 0.1 | 9 | 56% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 42% | 77 |
| mld.DustBunny 3.8 | 16 | 17% | 52 |
| djdjdj.NanoSkunk10 1.0 | 10 | 10% | 27 |
| maribo.melee.BMV 0.1 | 9 | 9% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 18 |
| zyx.nano.Ant 1.1 | 6 | 6% | 10 |
| fullsail.SweetTea 1.1 | 6 | 6% | 9 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 79.5 | 117 / 210 | 2.85 | 18.8% | 36595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.8% | 117 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.6% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.3% | 20 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.9% | 11 |
| fm.mammillarias 1.3 | 5.7 | 9.5% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 4 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 75.6 | 20 / 35 | 5833 |
| 2 | 1 | 68.9 | 78.4 | 22 / 35 | 6141 |
| 3 | 1 | 69.4 | 80.6 | 17 / 35 | 6776 |
| 4 | 1 | 67.3 | 75.9 | 17 / 35 | 5930 |
| 5 | 1 | 68.6 | 82.9 | 19 / 35 | 5847 |
| 6 | 1 | 69.4 | 83.5 | 22 / 35 | 6068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 47 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 74% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 23 | 25% | 41 |
| myl.micro.Troodon 1.10 | 19 | 20% | 70 |
| fm.mammillarias 1.3 | 17 | 18% | 18 |
| cb.nano.Insomnia 1.0 | 15 | 16% | 16 |
| myl.nano.KomoriNinja 1.1 | 9 | 10% | 30 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 18 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| sample.Tracker 1.0 | 2 | 2% | 3 |
| sample.Fire 1.0 | 1 | 1% | 7 |

## Melee bench: F04

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.1 | 129 / 210 | 2.34 | 19.8% | 38662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 19.8% | 129 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 14 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.7% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.0 | 10.5% | 27 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.6% | 0 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.6% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.2 | 25 / 35 | 6294 |
| 2 | 1 | 68.4 | 82.2 | 21 / 35 | 6058 |
| 3 | 1 | 69.5 | 84.1 | 22 / 35 | 6637 |
| 4 | 1 | 70.5 | 86.3 | 23 / 35 | 6922 |
| 5 | 1 | 67.3 | 79.4 | 16 / 35 | 6163 |
| 6 | 1 | 70.1 | 88.3 | 22 / 35 | 6588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 94% |
| stelo.SoJNanoMelee 1.1 | 36 | 72% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 87% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| tvv.micro.Antares 1.1.1 | 8 | 88% |
| yk.JahMicro 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 28 | 35% | 88 |
| stelo.SoJNanoMelee 1.1 | 26 | 32% | 48 |
| tvv.micro.Antares 1.1.1 | 8 | 10% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 9% | 10 |
| tj.zombie1n 1.0.1 | 6 | 7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 17 |
| repositorio.NanoStep 1.0 | 2 | 2% | 7 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.0 | 84 / 210 | 3.70 | 15.7% | 29874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 15.7% | 84 |
| oog.melee.Corsair 1.0 | 2.0 | 13.2% | 43 |
| ahf.NanoAndrew .4 | 4.0 | 11.4% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.4% | 30 |
| sam.Samspin 1.0 | 5.5 | 10.0% | 10 |
| zyx.nano.BacillusComma 1.0 | 5.7 | 9.8% | 8 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.8 | 7.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.0 | 21 / 35 | 5301 |
| 2 | 1 | 62.4 | 66.7 | 12 / 35 | 4904 |
| 3 | 1 | 65.3 | 74.9 | 16 / 35 | 5303 |
| 4 | 1 | 59.4 | 61.0 | 8 / 35 | 4718 |
| 5 | 1 | 60.8 | 63.2 | 11 / 35 | 4624 |
| 6 | 1 | 64.6 | 73.3 | 16 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 60% |
| simonton.nano.MeleeSeed 1.8 | 27 | 96% |
| ahf.NanoAndrew .4 | 14 | 86% |
| EBBU.Sim2 1.02 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| sam.Samspin 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 40 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 24 |
| ahf.NanoAndrew .4 | 17 | 13% | 34 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13% | 16 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 19 |
| EBBU.Sim2 1.02 | 9 | 7% | 16 |
| sam.Samspin 1.0 | 6 | 5% | 12 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.5 | 120 / 210 | 2.84 | 18.0% | 32491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.0% | 120 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 40 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.8% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 3 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 10 |
| fm.claire 1.7 | 6.8 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.3% | 4 |
| pa.Improved 1.0 | 9.2 | 5.8% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.6 | 23 / 35 | 5970 |
| 2 | 1 | 67.4 | 80.6 | 19 / 35 | 5623 |
| 3 | 1 | 64.4 | 72.1 | 15 / 35 | 4847 |
| 4 | 1 | 67.3 | 80.0 | 21 / 35 | 5169 |
| 5 | 1 | 65.4 | 75.6 | 18 / 35 | 5005 |
| 6 | 1 | 69.6 | 87.3 | 24 / 35 | 5877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 82% |
| oog.melee.CapuletDroid 1.1 | 32 | 94% |
| gh.nano.Grofvuil 0.2 | 19 | 89% |
| arthord.NanoSatanMelee Beta | 12 | 75% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 35% | 66 |
| arthord.NanoSatanMelee Beta | 14 | 15% | 21 |
| gh.nano.Grofvuil 0.2 | 13 | 14% | 37 |
| fm.claire 1.7 | 10 | 11% | 11 |
| sample.SpinBot 1.0 | 9 | 10% | 15 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 36 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 11 |
| pa.Improved 1.0 | 2 | 2% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 78.9 | 92 / 210 | 2.90 | 17.6% | 34361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 17.6% | 92 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.0% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.6% | 35 |
| mz.MicroGodMelee 1 | 3.3 | 13.9% | 35 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 1 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.6% | 2 |
| acogdev.alpha 0.2 | 8.7 | 6.0% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.4 | 13 / 35 | 5584 |
| 2 | 1 | 69.4 | 85.1 | 16 / 35 | 6359 |
| 3 | 1 | 67.3 | 81.6 | 16 / 35 | 5396 |
| 4 | 1 | 69.3 | 85.7 | 19 / 35 | 6279 |
| 5 | 1 | 63.9 | 71.7 | 11 / 35 | 5114 |
| 6 | 1 | 67.0 | 77.8 | 17 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 44 | 61% |
| spinnercat.micro.Tyger 0.1 | 41 | 83% |
| gh.micro.Gruweltje 0.7 | 26 | 58% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 28% | 61 |
| gh.micro.Gruweltje 0.7 | 30 | 25% | 53 |
| spinnercat.micro.Tyger 0.1 | 27 | 23% | 51 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 10 |
| fire219.CatBot 1.0 | 6 | 5% | 7 |
| acogdev.alpha 0.2 | 6 | 5% | 6 |
| mbro.Detektor3 0.1.1 | 5 | 4% | 7 |
| el.JumpShoot 0.2 | 4 | 3% | 8 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

## Melee bench: F08

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.9 | 104 / 210 | 3.44 | 16.6% | 32231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.3 | 16.6% | 104 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.6% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 31 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 8 |
| germ.TheMind .2 | 5.0 | 9.3% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.2% | 4 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.1% | 6 |
| sample.Crazy 1.0 | 9.0 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.6 | 21 / 35 | 5337 |
| 2 | 1 | 66.6 | 79.0 | 20 / 35 | 5322 |
| 3 | 2 | 62.3 | 63.2 | 13 / 35 | 5521 |
| 4 | 2 | 64.0 | 70.2 | 14 / 35 | 5118 |
| 5 | 1 | 66.3 | 74.6 | 20 / 35 | 5635 |
| 6 | 1 | 63.9 | 69.5 | 16 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 87% |
| germ.TheMind .2 | 10 | 90% |
| awesomeness.Elite 1.0 | 9 | 67% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 30 | 28% | 86 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 17% | 30 |
| germ.TheMind .2 | 16 | 15% | 25 |
| stelo.UntouchableNano 1.3 | 14 | 13% | 16 |
| awesomeness.Elite 1.0 | 12 | 11% | 21 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 9 |
| mym.EdgeStalker 1.0 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.0 | 125 / 210 | 2.71 | 18.2% | 29454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 18.2% | 125 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 21 |
| maribo.IotaCT 1.1 | 4.7 | 10.5% | 6 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.8% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 8.3% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 7.8% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 79.0 | 20 / 35 | 5271 |
| 2 | 1 | 69.3 | 87.9 | 22 / 35 | 4772 |
| 3 | 1 | 67.1 | 77.5 | 18 / 35 | 5143 |
| 4 | 1 | 67.8 | 80.0 | 22 / 35 | 4953 |
| 5 | 1 | 68.0 | 79.7 | 20 / 35 | 5013 |
| 6 | 1 | 67.8 | 81.6 | 23 / 35 | 4302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 95% |
| nz.jdc.nano.GridFu 1.0 | 22 | 100% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| maribo.IotaCT 1.1 | 11 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 85 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 20 | 24% | 27 |
| rz.HawkOnFire 0.1 | 16 | 19% | 54 |
| nz.jdc.nano.GridFu 1.0 | 15 | 18% | 45 |
| timmit.nano.TimDog 0.33 | 14 | 16% | 28 |
| stelo.PatternRobot 1.0 | 11 | 13% | 18 |
| maribo.IotaCT 1.1 | 4 | 5% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 10 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.2 | 166 / 210 | 1.88 | 20.9% | 38868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.9% | 166 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.9% | 13 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 9 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 2 |
| zyx.micro.Ant 1.1 | 5.0 | 9.4% | 13 |
| sanja.First 0.1 | 6.0 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.6% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.4% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.6 | 29 / 35 | 6376 |
| 2 | 1 | 71.5 | 92.1 | 27 / 35 | 7055 |
| 3 | 1 | 72.2 | 95.6 | 31 / 35 | 6702 |
| 4 | 1 | 71.1 | 88.9 | 28 / 35 | 6785 |
| 5 | 1 | 70.9 | 92.4 | 26 / 35 | 6362 |
| 6 | 1 | 68.5 | 84.8 | 25 / 35 | 5588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 95% |
| baal.nano.N 1.42 | 33 | 94% |
| cvt.Firsty 1.0 | 25 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| sanja.First 0.1 | 18 | 94% |
| zyx.micro.Ant 1.1 | 17 | 76% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 31% | 34 |
| tvv.nano.Polaris 1.2 | 8 | 18% | 53 |
| baal.nano.N 1.42 | 7 | 16% | 37 |
| Grystrion.TrackerWO 1.0 | 6 | 13% | 18 |
| cvt.Firsty 1.0 | 3 | 7% | 28 |
| sample.RamFire 1.0 | 3 | 7% | 4 |
| sanja.First 0.1 | 2 | 4% | 20 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 11 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.7 | 78 / 210 | 3.91 | 15.2% | 30875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.4% | 65 |
| hadur117.micro.SaorWNH 0.1 | 1.7 | 15.2% | 78 |
| cs.Wren 1.0 | 3.5 | 12.3% | 20 |
| js.PinBall 1.6 | 4.2 | 11.2% | 16 |
| mz.Cork 0.1 | 4.5 | 11.0% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 4 |
| evd.X1 0.01 | 6.8 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.6 | 12 / 35 | 5258 |
| 2 | 2 | 60.4 | 64.1 | 9 / 35 | 4726 |
| 3 | 2 | 62.1 | 64.8 | 13 / 35 | 5165 |
| 4 | 1 | 62.6 | 68.3 | 12 / 35 | 4998 |
| 5 | 2 | 61.5 | 65.7 | 13 / 35 | 4803 |
| 6 | 1 | 66.7 | 75.6 | 19 / 35 | 5925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 69% |
| cs.Wren 1.0 | 22 | 82% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 8 | 88% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 41% | 100 |
| cs.Wren 1.0 | 20 | 15% | 32 |
| evd.X1 0.01 | 19 | 14% | 22 |
| joe.ADinosaur 1.0 | 13 | 10% | 15 |
| mz.Cork 0.1 | 11 | 8% | 19 |
| js.PinBall 1.6 | 8 | 6% | 14 |
| PSW.Relentless 0.1 | 5 | 4% | 3 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.7 | 103 / 210 | 3.28 | 16.6% | 27024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 16.6% | 103 |
| stelo.AreaTargetingBot 1.1 | 2.5 | 12.3% | 28 |
| ntc.Opposite 1.5 | 3.5 | 11.6% | 15 |
| myl.nano.Graviton 1.10 | 3.8 | 11.4% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.7% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 10.0% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.7% | 5 |
| disan.Chair 2.2.0 | 7.8 | 7.7% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 10 |
| pbg.R2D2 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 22 / 35 | 5015 |
| 2 | 1 | 66.0 | 78.4 | 17 / 35 | 4714 |
| 3 | 1 | 61.8 | 67.9 | 15 / 35 | 4041 |
| 4 | 1 | 62.1 | 64.8 | 15 / 35 | 4337 |
| 5 | 1 | 64.6 | 74.0 | 19 / 35 | 4344 |
| 6 | 1 | 65.8 | 80.0 | 15 / 35 | 4573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 43 | 77% |
| myl.nano.Graviton 1.10 | 20 | 80% |
| ntc.Opposite 1.5 | 19 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| donjezza.Muncho 1.0 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| DBall.NUKE 0.1 | 6 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 20 | 19% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 19% | 31 |
| pfvicm.Sobieski 7.2.3b | 20 | 19% | 25 |
| myl.nano.Graviton 1.10 | 18 | 17% | 35 |
| ntc.Opposite 1.5 | 15 | 14% | 30 |
| DBall.NUKE 0.1 | 7 | 7% | 11 |
| disan.Chair 2.2.0 | 4 | 4% | 7 |
| donjezza.Muncho 1.0 | 2 | 2% | 13 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 65.3 | 60 / 210 | 4.12 | 14.2% | 25601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 2.0 | 14.2% | 60 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 52 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 46 |
| yagami.Tidus 0.11 | 4.2 | 12.3% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 28 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.0 | 12 / 35 | 4318 |
| 2 | 4 | 58.3 | 57.8 | 8 / 35 | 3843 |
| 3 | 2 | 62.2 | 68.9 | 8 / 35 | 4289 |
| 4 | 1 | 62.9 | 68.6 | 12 / 35 | 4286 |
| 5 | 1 | 62.8 | 68.3 | 10 / 35 | 4418 |
| 6 | 2 | 60.6 | 61.6 | 10 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 24 | 54% |
| kawigi.micro.Shiz 1.1 | 23 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 67% |
| yagami.Tidus 0.11 | 10 | 90% |
| ejb.Polaris 1.0.1 | 7 | 100% |
| stelo.MirrorNano 1.3 | 2 | 50% |

Hadur died in 150 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 32% | 62 |
| yagami.Tidus 0.11 | 32 | 21% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 15% | 36 |
| kawigi.micro.Shiz 1.1 | 17 | 11% | 31 |
| ejb.Polaris 1.0.1 | 10 | 7% | 17 |
| stelo.MirrorNano 1.3 | 9 | 6% | 9 |
| step.nanoPri 1.0 | 8 | 5% | 8 |
| kurios.DOSexe .9a | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.6 | 116 / 210 | 3.10 | 16.7% | 27173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 16.7% | 116 |
| bzdp.Pansy 2.1 | 2.3 | 12.9% | 25 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 25 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 11 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 16 |
| m3thos.Eva00 1.1 | 5.7 | 10.1% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 6.0% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 72.4 | 17 / 35 | 4520 |
| 2 | 1 | 64.8 | 77.5 | 19 / 35 | 4325 |
| 3 | 1 | 65.3 | 77.5 | 18 / 35 | 4649 |
| 4 | 1 | 67.1 | 81.0 | 24 / 35 | 4781 |
| 5 | 1 | 64.6 | 75.6 | 18 / 35 | 4635 |
| 6 | 1 | 64.8 | 75.9 | 20 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 85% |
| wee.Gem 1.8.4 | 38 | 95% |
| wompi.Quokka 1.6 | 18 | 94% |
| m3thos.Eva00 1.1 | 12 | 92% |
| ratosh.Nobo 0.21 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 67% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 17 | 18% | 63 |
| bzdp.Pansy 2.1 | 16 | 17% | 48 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 12% | 12 |
| wompi.Quokka 1.6 | 10 | 11% | 23 |
| m3thos.Eva00 1.1 | 10 | 11% | 21 |
| bayen.UbaMicro 1.4 | 10 | 11% | 11 |
| maribo.FollowFire 1 | 9 | 9% | 10 |
| ratosh.Nobo 0.21 | 8 | 8% | 16 |
| stelo.MyAgileRobot 0.2 | 4 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.0 | 125 / 210 | 2.35 | 20.6% | 46212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.6% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 19 |
| ayk.WallHugger 1.0 | 4.2 | 9.9% | 0 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.1% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 89.5 | 26 / 35 | 8381 |
| 2 | 1 | 70.1 | 79.0 | 18 / 35 | 7177 |
| 3 | 1 | 70.5 | 81.0 | 22 / 35 | 7332 |
| 4 | 1 | 71.8 | 86.0 | 23 / 35 | 7686 |
| 5 | 1 | 71.0 | 83.8 | 13 / 35 | 7828 |
| 6 | 1 | 72.9 | 90.8 | 23 / 35 | 7808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 82% |
| mz.NanoGod 2.02 | 15 | 47% |
| ayk.WallHugger 1.0 | 8 | 100% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 37 | 43% | 45 |
| wompi.Wallaby 5.1 | 32 | 37% | 120 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 16 |
| stuff.Vlad 0.1 | 4 | 5% | 7 |
| ayk.WallHugger 1.0 | 2 | 2% | 10 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 73.1 | 100 / 210 | 3.42 | 16.4% | 29231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 16.4% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.3% | 20 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.1% | 32 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 19 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.8% | 5 |
| conscience.Electron 1.3g | 7.2 | 8.3% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 7.0% | 5 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.1 | 18 / 35 | 5281 |
| 2 | 1 | 63.3 | 71.1 | 16 / 35 | 4821 |
| 3 | 1 | 66.2 | 77.1 | 18 / 35 | 5120 |
| 4 | 1 | 63.0 | 68.9 | 17 / 35 | 4703 |
| 5 | 1 | 63.5 | 70.8 | 17 / 35 | 4645 |
| 6 | 1 | 63.6 | 72.4 | 14 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 89% |
| dummy.micro.Sparrow 2.5 | 21 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 75% |
| bvh.micro.Freya 0.3 | 16 | 94% |
| stelo.MirrorMicro 1.0 | 12 | 92% |
| ap.Frederick 1.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 18% | 42 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 44 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 36 |
| conscience.Electron 1.3g | 17 | 15% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 14 |
| bvh.micro.Freya 0.3 | 12 | 11% | 23 |
| dl.BetterWalls 1.0 | 8 | 7% | 12 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 19 |

## Melee bench: F17

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.1 | 132 / 210 | 2.25 | 20.6% | 42168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 20.6% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 20 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.8% | 18 |
| sul.Lunar 1.1 | 3.7 | 11.2% | 13 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 7 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 6 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.8% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 2 |
| sample.Corners 1.0 | 9.3 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.6 | 25 / 35 | 6577 |
| 2 | 1 | 69.2 | 78.7 | 19 / 35 | 7303 |
| 3 | 1 | 70.4 | 84.8 | 21 / 35 | 6889 |
| 4 | 1 | 68.5 | 79.0 | 18 / 35 | 6458 |
| 5 | 1 | 73.0 | 93.3 | 26 / 35 | 7676 |
| 6 | 1 | 72.3 | 93.0 | 23 / 35 | 7265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 92% |
| sul.Lunar 1.1 | 37 | 97% |
| supersample.SuperBoxBot 1.0 | 23 | 83% |
| dsw.StaticD 1.0 | 12 | 75% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 67% |
| sample.Corners 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 36% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 22% | 68 |
| dsw.StaticD 1.0 | 12 | 15% | 23 |
| mme.NikeEnhanced 2.0 | 8 | 10% | 13 |
| sul.Lunar 1.1 | 4 | 5% | 41 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 6 |
| sample.Corners 1.0 | 3 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorWNH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 75.4 | 98 / 210 | 3.21 | 17.3% | 37030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNH 0.1 | 1.0 | 17.3% | 98 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.3% | 29 |
| mld.Wisdom 1.0 | 3.5 | 12.1% | 19 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 8 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.4% | 5 |
| sample.Walls 1.0 | 7.3 | 8.2% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.6 | 15 / 35 | 6215 |
| 2 | 1 | 67.0 | 79.4 | 20 / 35 | 5596 |
| 3 | 1 | 66.7 | 76.2 | 16 / 35 | 6434 |
| 4 | 1 | 66.5 | 76.2 | 14 / 35 | 6714 |
| 5 | 1 | 66.7 | 76.5 | 19 / 35 | 6271 |
| 6 | 1 | 64.1 | 69.5 | 14 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 90% |
| radnor.DoctorBob 1.42 | 26 | 85% |
| mld.Wisdom 1.0 | 12 | 75% |
| amz.NanoClone 1.41 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 27% | 38 |
| radnor.DoctorBob 1.42 | 22 | 20% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 19% | 56 |
| KiraNL.Chupacabra 0.4 | 19 | 17% | 25 |
| amz.NanoClone 1.41 | 8 | 7% | 18 |
| GarmBox.Oranges 1.0 | 5 | 4% | 5 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| jangs.ns51 1.0 | 3 | 3% | 6 |

