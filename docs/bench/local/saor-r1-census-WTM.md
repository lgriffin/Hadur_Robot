# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 91.6 | 150 / 210 | 1.75 | 21.8% | 43707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 21.8% | 150 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 19 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 24 |
| mld.Infinity 2.2 | 3.7 | 13.0% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 0 |
| sample.Walls 1.0 | 6.5 | 6.8% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 96.5 | 28 / 35 | 7424 |
| 2 | 1 | 72.0 | 88.6 | 24 / 35 | 6923 |
| 3 | 1 | 72.3 | 90.5 | 24 / 35 | 7021 |
| 4 | 1 | 73.3 | 93.7 | 28 / 35 | 7363 |
| 5 | 1 | 71.5 | 87.0 | 23 / 35 | 7118 |
| 6 | 1 | 73.4 | 93.7 | 23 / 35 | 7858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 90% |
| mld.Infinity 2.2 | 46 | 96% |
| radnor.DoctorBob 1.42 | 40 | 70% |
| amz.NanoClone 1.41 | 9 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 41% | 64 |
| mz.AntiGrav 1.0 | 16 | 26% | 73 |
| mld.Infinity 2.2 | 10 | 16% | 45 |
| jangs.ns51 1.0 | 3 | 5% | 6 |
| amz.NanoClone 1.41 | 2 | 3% | 9 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.4 | 111 / 210 | 2.67 | 17.9% | 32155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 17.9% | 111 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 49 |
| mld.DustBunny 3.8 | 2.5 | 14.0% | 27 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.1% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.9% | 5 |
| zyx.nano.Ant 1.1 | 7.2 | 7.6% | 0 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 5 |
| bzdp.BoxCar 2.0 | 8.5 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.3 | 23 / 35 | 5346 |
| 2 | 1 | 67.4 | 86.0 | 17 / 35 | 5331 |
| 3 | 1 | 67.8 | 82.5 | 21 / 35 | 5432 |
| 4 | 1 | 62.2 | 61.0 | 11 / 35 | 5191 |
| 5 | 1 | 68.3 | 88.3 | 18 / 35 | 5263 |
| 6 | 1 | 68.2 | 83.5 | 21 / 35 | 5592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 63 | 87% |
| oog.melee.Mercutio 1.0 | 42 | 62% |
| djdjdj.NanoSkunk10 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 5 | 40% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 34% | 62 |
| mld.DustBunny 3.8 | 23 | 23% | 72 |
| cs.Grudge 1.0 | 12 | 12% | 12 |
| djdjdj.NanoSkunk10 1.0 | 10 | 10% | 21 |
| fullsail.SweetTea 1.1 | 9 | 9% | 12 |
| maribo.melee.BMV 0.1 | 5 | 5% | 11 |
| zyx.nano.Ant 1.1 | 4 | 4% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 1% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.4 | 139 / 210 | 2.40 | 20.1% | 37806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 20.1% | 139 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.5% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.8% | 15 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 3 |
| cb.nano.Insomnia 1.0 | 6.0 | 9.3% | 4 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.6% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |
| sample.Fire 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 84.1 | 24 / 35 | 6425 |
| 2 | 1 | 67.2 | 75.9 | 20 / 35 | 5451 |
| 3 | 1 | 70.3 | 85.7 | 24 / 35 | 6113 |
| 4 | 1 | 69.9 | 86.3 | 19 / 35 | 6103 |
| 5 | 1 | 70.1 | 83.5 | 23 / 35 | 6789 |
| 6 | 1 | 72.7 | 90.8 | 29 / 35 | 6925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 86% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 83% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 24% | 33 |
| myl.micro.Troodon 1.10 | 15 | 21% | 70 |
| cb.nano.Insomnia 1.0 | 14 | 20% | 19 |
| myl.nano.KomoriNinja 1.1 | 9 | 13% | 38 |
| fm.mammillarias 1.3 | 9 | 13% | 14 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 15 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 14 |
| sample.Fire 1.0 | 2 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.6 | 155 / 210 | 1.94 | 21.0% | 39385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 21.0% | 155 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.3% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.6% | 13 |
| tj.zombie1n 1.0.1 | 6.0 | 8.5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.1% | 2 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.7 | 20 / 35 | 6792 |
| 2 | 1 | 71.5 | 91.1 | 28 / 35 | 6685 |
| 3 | 1 | 70.3 | 89.2 | 25 / 35 | 6246 |
| 4 | 1 | 69.9 | 85.1 | 24 / 35 | 6392 |
| 5 | 1 | 71.4 | 91.1 | 28 / 35 | 6421 |
| 6 | 1 | 72.4 | 94.3 | 30 / 35 | 6849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 92% |
| stelo.SoJNanoMelee 1.1 | 47 | 85% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 94% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 15 | 27% | 74 |
| stelo.SoJNanoMelee 1.1 | 13 | 24% | 36 |
| tvv.micro.Antares 1.1.1 | 7 | 13% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 13% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 25 |
| tj.zombie1n 1.0.1 | 5 | 9% | 10 |
| yk.JahMicro 1.0 | 2 | 4% | 3 |
| repositorio.NanoStep 1.0 | 1 | 2% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.3 | 87 / 210 | 3.85 | 15.6% | 28582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.2 | 15.6% | 87 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 30 |
| ahf.NanoAndrew .4 | 3.5 | 11.8% | 35 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 10.8% | 25 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 9 |
| sam.Samspin 1.0 | 6.2 | 9.6% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.2% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 67.3 | 14 / 35 | 4529 |
| 2 | 2 | 59.9 | 62.5 | 10 / 35 | 4317 |
| 3 | 1 | 62.1 | 67.0 | 12 / 35 | 4789 |
| 4 | 1 | 64.3 | 70.5 | 19 / 35 | 4729 |
| 5 | 1 | 63.3 | 69.2 | 14 / 35 | 4731 |
| 6 | 1 | 65.5 | 73.3 | 18 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 81% |
| ahf.NanoAndrew .4 | 24 | 71% |
| oog.melee.Corsair 1.0 | 22 | 73% |
| EBBU.Sim2 1.02 | 14 | 93% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| sam.Samspin 1.0 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 23% | 52 |
| oog.melee.Corsair 1.0 | 18 | 15% | 39 |
| ahf.NanoAndrew .4 | 18 | 15% | 35 |
| zyx.nano.BacillusComma 1.0 | 18 | 15% | 19 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 22 |
| sam.Samspin 1.0 | 10 | 8% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| EBBU.Sim2 1.02 | 6 | 5% | 15 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.9 | 133 / 210 | 2.54 | 18.8% | 33223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 18.8% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.1% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.6% | 7 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.6% | 10 |
| fm.claire 1.7 | 6.7 | 8.2% | 0 |
| sample.SpinBot 1.0 | 7.7 | 7.3% | 3 |
| pa.Improved 1.0 | 8.8 | 6.3% | 3 |
| kurios.DOSexe .9b | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.8 | 21 / 35 | 5225 |
| 2 | 1 | 69.1 | 86.0 | 19 / 35 | 5874 |
| 3 | 1 | 68.0 | 80.0 | 22 / 35 | 5717 |
| 4 | 1 | 68.2 | 82.5 | 22 / 35 | 5552 |
| 5 | 1 | 67.9 | 81.0 | 24 / 35 | 5509 |
| 6 | 1 | 68.8 | 84.1 | 25 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 86% |
| oog.melee.CapuletDroid 1.1 | 40 | 98% |
| gh.nano.Grofvuil 0.2 | 20 | 90% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 27% | 72 |
| arthord.NanoSatanMelee Beta | 13 | 17% | 22 |
| oog.melee.CapuletDroid 1.1 | 12 | 16% | 47 |
| gh.nano.Grofvuil 0.2 | 11 | 14% | 33 |
| winamp32.micro.MicroMacro 1.0 | 8 | 10% | 15 |
| fm.claire 1.7 | 6 | 8% | 6 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| sample.SpinBot 1.0 | 2 | 3% | 4 |

## Melee bench: F07

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.0 | 98 / 210 | 2.62 | 18.2% | 34523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 18.2% | 98 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.7% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.5% | 32 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 30 |
| DBall.Anarchy 0.1 | 5.5 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.6% | 3 |
| fire219.CatBot 1.0 | 8.3 | 6.0% | 1 |
| el.JumpShoot 0.2 | 8.3 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.9 | 15 / 35 | 6085 |
| 2 | 1 | 69.4 | 87.0 | 19 / 35 | 5816 |
| 3 | 1 | 66.3 | 78.4 | 16 / 35 | 5439 |
| 4 | 1 | 67.2 | 81.0 | 17 / 35 | 5502 |
| 5 | 1 | 68.0 | 81.9 | 14 / 35 | 6082 |
| 6 | 1 | 67.4 | 81.9 | 17 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 76% |
| mz.MicroGodMelee 1 | 40 | 63% |
| gh.micro.Gruweltje 0.7 | 32 | 66% |
| DBall.Anarchy 0.1 | 8 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 31% | 55 |
| mz.MicroGodMelee 1 | 28 | 25% | 52 |
| spinnercat.micro.Tyger 0.1 | 22 | 20% | 51 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 13 |
| acogdev.alpha 0.2 | 7 | 6% | 11 |
| DBall.Anarchy 0.1 | 4 | 4% | 14 |
| el.JumpShoot 0.2 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 8 |

## Melee bench: F08

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.6 | 109 / 210 | 3.47 | 16.7% | 31049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.2 | 16.7% | 109 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.7% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.7% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.4% | 6 |
| germ.TheMind .2 | 5.3 | 9.1% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.8% | 3 |
| awesomeness.Elite 1.0 | 6.8 | 8.0% | 7 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.2% | 7 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 73.3 | 19 / 35 | 5507 |
| 2 | 1 | 66.9 | 76.2 | 21 / 35 | 5521 |
| 3 | 2 | 64.1 | 69.5 | 19 / 35 | 4788 |
| 4 | 1 | 65.8 | 74.0 | 18 / 35 | 5088 |
| 5 | 1 | 65.4 | 73.3 | 18 / 35 | 5054 |
| 6 | 1 | 64.1 | 69.2 | 14 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| germ.TheMind .2 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| sample.Crazy 1.0 | 4 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 41% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 19% | 38 |
| germ.TheMind .2 | 11 | 11% | 18 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 8 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 12 |
| awesomeness.Elite 1.0 | 7 | 7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 10 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.4 | 157 / 210 | 1.95 | 20.5% | 32475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 20.5% | 157 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.9% | 6 |
| maribo.IotaCT 1.1 | 4.2 | 10.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 9.8% | 1 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.2% | 7 |
| stelo.PatternRobot 1.0 | 7.3 | 7.9% | 8 |
| spinnercat.Omen 1.0 | 8.2 | 7.5% | 1 |
| ratosh.Wesco 1.4 | 8.3 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 96.2 | 29 / 35 | 5688 |
| 2 | 1 | 71.0 | 90.8 | 28 / 35 | 5317 |
| 3 | 1 | 70.8 | 86.7 | 24 / 35 | 5509 |
| 4 | 1 | 70.1 | 87.0 | 23 / 35 | 5633 |
| 5 | 1 | 70.3 | 85.7 | 27 / 35 | 5265 |
| 6 | 1 | 70.4 | 90.2 | 26 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 91% |
| nz.jdc.nano.GridFu 1.0 | 31 | 100% |
| stelo.PatternRobot 1.0 | 14 | 93% |
| maribo.IotaCT 1.1 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 11 | 73% |
| spinnercat.Omen 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 26% | 77 |
| timmit.nano.TimDog 0.33 | 11 | 20% | 21 |
| nz.jdc.nano.GridFu 1.0 | 8 | 15% | 46 |
| stelo.PatternRobot 1.0 | 8 | 15% | 17 |
| maribo.IotaCT 1.1 | 4 | 7% | 16 |
| ratosh.Wesco 1.4 | 4 | 7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 9 |
| spinnercat.Omen 1.0 | 2 | 4% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.9 | 177 / 210 | 1.64 | 22.0% | 41091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 22.0% | 177 |
| baal.nano.N 1.42 | 2.7 | 11.1% | 7 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.0% | 8 |
| Grystrion.TrackerWO 1.0 | 3.5 | 10.0% | 4 |
| zyx.micro.Ant 1.1 | 6.0 | 8.9% | 4 |
| sanja.First 0.1 | 6.2 | 8.7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.5% | 0 |
| cvt.Firsty 1.0 | 8.2 | 7.4% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.9% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 31 / 35 | 6625 |
| 2 | 1 | 73.1 | 96.2 | 31 / 35 | 7201 |
| 3 | 1 | 71.0 | 88.3 | 30 / 35 | 6444 |
| 4 | 1 | 71.8 | 92.1 | 28 / 35 | 6893 |
| 5 | 1 | 73.0 | 97.8 | 31 / 35 | 6992 |
| 6 | 1 | 71.0 | 89.2 | 26 / 35 | 6936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 35 | 91% |
| tvv.nano.Polaris 1.2 | 34 | 91% |
| cvt.Firsty 1.0 | 30 | 93% |
| sanja.First 0.1 | 28 | 100% |
| amk.Punbot.Punbot 0.01 | 21 | 100% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 21% | 36 |
| tvv.nano.Polaris 1.2 | 5 | 15% | 51 |
| baal.nano.N 1.42 | 5 | 15% | 34 |
| cvt.Firsty 1.0 | 5 | 15% | 30 |
| squidM.TentalceMeleeNano 1.1 | 4 | 12% | 15 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 11 |
| sanja.First 0.1 | 2 | 6% | 22 |
| sample.RamFire 1.0 | 2 | 6% | 3 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 65.8 | 78 / 210 | 4.08 | 15.0% | 30754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.5 | 15.0% | 78 |
| kc.micro.Figment 1.0 | 1.5 | 14.8% | 63 |
| cs.Wren 1.0 | 3.7 | 12.3% | 20 |
| js.PinBall 1.6 | 4.0 | 11.6% | 15 |
| mz.Cork 0.1 | 4.3 | 11.0% | 14 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 6 |
| evd.X1 0.01 | 6.8 | 8.4% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 7.5% | 12 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 62.9 | 13 / 35 | 4936 |
| 2 | 2 | 61.8 | 65.7 | 9 / 35 | 4864 |
| 3 | 2 | 62.1 | 66.7 | 11 / 35 | 5217 |
| 4 | 1 | 64.2 | 71.7 | 15 / 35 | 5309 |
| 5 | 2 | 63.2 | 64.4 | 15 / 35 | 5277 |
| 6 | 1 | 62.2 | 63.5 | 15 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 74% |
| cs.Wren 1.0 | 21 | 90% |
| js.PinBall 1.6 | 10 | 80% |
| mz.Cork 0.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 38% | 91 |
| cs.Wren 1.0 | 21 | 16% | 33 |
| joe.ADinosaur 1.0 | 18 | 14% | 19 |
| evd.X1 0.01 | 17 | 13% | 17 |
| js.PinBall 1.6 | 11 | 8% | 22 |
| mz.Cork 0.1 | 9 | 7% | 16 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.7 | 135 / 210 | 2.47 | 19.0% | 30574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 19.0% | 135 |
| myl.nano.Graviton 1.10 | 2.5 | 11.7% | 17 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.8% | 11 |
| ntc.Opposite 1.5 | 3.8 | 10.3% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.0% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.8% | 6 |
| disan.Chair 2.2.0 | 7.5 | 8.0% | 11 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.7% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.8 | 23 / 35 | 5198 |
| 2 | 1 | 68.3 | 85.1 | 22 / 35 | 5146 |
| 3 | 1 | 64.4 | 73.3 | 17 / 35 | 4499 |
| 4 | 1 | 68.4 | 82.5 | 22 / 35 | 5373 |
| 5 | 1 | 70.4 | 91.4 | 27 / 35 | 5301 |
| 6 | 1 | 68.9 | 84.8 | 24 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 49 | 86% |
| myl.nano.Graviton 1.10 | 33 | 97% |
| disan.Chair 2.2.0 | 18 | 67% |
| donjezza.Muncho 1.0 | 14 | 100% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| ntc.Opposite 1.5 | 8 | 88% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 15 | 20% | 25 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 46 |
| myl.nano.Graviton 1.10 | 12 | 16% | 43 |
| disan.Chair 2.2.0 | 10 | 13% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 9% | 20 |
| ntc.Opposite 1.5 | 7 | 9% | 14 |
| DBall.NUKE 0.1 | 5 | 7% | 15 |
| donjezza.Muncho 1.0 | 4 | 5% | 14 |
| pbg.R2D2 1.0 | 3 | 4% | 11 |

## Melee bench: F13

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.4 | 73 / 210 | 3.49 | 15.7% | 26909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.2 | 15.7% | 73 |
| oog.melee.Capulet 1.2 | 2.7 | 14.0% | 52 |
| kawigi.micro.Shiz 1.1 | 2.8 | 14.0% | 39 |
| yagami.Tidus 0.11 | 4.2 | 12.3% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 24 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 67.9 | 9 / 35 | 4393 |
| 2 | 1 | 63.1 | 67.6 | 11 / 35 | 4311 |
| 3 | 1 | 63.5 | 69.2 | 10 / 35 | 4442 |
| 4 | 1 | 65.8 | 77.5 | 14 / 35 | 4510 |
| 5 | 1 | 65.8 | 74.0 | 16 / 35 | 4347 |
| 6 | 1 | 66.3 | 78.1 | 13 / 35 | 4906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 79% |
| kawigi.micro.Shiz 1.1 | 21 | 90% |
| yagami.Tidus 0.11 | 13 | 92% |
| ejb.Polaris 1.0.1 | 3 | 67% |

Hadur died in 137 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 33% | 65 |
| yagami.Tidus 0.11 | 30 | 22% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 13% | 41 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 32 |
| ejb.Polaris 1.0.1 | 17 | 12% | 24 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.6 | 144 / 210 | 2.74 | 18.2% | 29168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 18.2% | 144 |
| bzdp.Pansy 2.1 | 3.0 | 11.9% | 16 |
| wee.Gem 1.8.4 | 3.2 | 11.9% | 13 |
| wompi.Quokka 1.6 | 4.0 | 11.1% | 12 |
| ratosh.Nobo 0.21 | 4.0 | 10.9% | 5 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 9.3% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.7 | 27 / 35 | 4940 |
| 2 | 1 | 67.0 | 80.3 | 24 / 35 | 4689 |
| 3 | 1 | 67.3 | 79.4 | 24 / 35 | 4907 |
| 4 | 1 | 68.3 | 83.2 | 26 / 35 | 5072 |
| 5 | 1 | 67.4 | 80.3 | 23 / 35 | 4908 |
| 6 | 1 | 65.4 | 74.0 | 20 / 35 | 4652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 98% |
| wee.Gem 1.8.4 | 40 | 98% |
| wompi.Quokka 1.6 | 28 | 93% |
| ratosh.Nobo 0.21 | 17 | 100% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 325. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 11 | 17% | 9 |
| bzdp.Pansy 2.1 | 10 | 15% | 47 |
| wee.Gem 1.8.4 | 9 | 14% | 59 |
| wompi.Quokka 1.6 | 9 | 14% | 28 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 14% | 13 |
| ratosh.Nobo 0.21 | 7 | 11% | 26 |
| bayen.UbaMicro 1.4 | 5 | 8% | 12 |
| stelo.MyAgileRobot 0.2 | 5 | 8% | 7 |
| m3thos.Eva00 1.1 | 1 | 2% | 8 |

## Melee bench: F15

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.8 | 127 / 210 | 2.19 | 20.9% | 46084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 20.9% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 20 |
| ayk.WallHugger 1.0 | 4.2 | 9.9% | 1 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 88.9 | 25 / 35 | 7650 |
| 2 | 1 | 68.9 | 76.5 | 16 / 35 | 6946 |
| 3 | 1 | 70.6 | 83.5 | 20 / 35 | 7224 |
| 4 | 1 | 72.6 | 91.4 | 21 / 35 | 7743 |
| 5 | 1 | 72.4 | 87.9 | 19 / 35 | 7965 |
| 6 | 1 | 74.1 | 92.4 | 26 / 35 | 8556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 107 | 80% |
| mz.NanoGod 2.02 | 15 | 73% |
| drd.Dreadknoght 0.9 | 10 | 90% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 42% | 125 |
| mz.NanoGod 2.02 | 25 | 30% | 40 |
| exauge.GateKeeper 1.1.121g | 9 | 11% | 16 |
| ayk.WallHugger 1.0 | 7 | 8% | 18 |
| stuff.Vlad 0.1 | 3 | 4% | 5 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.8 | 104 / 210 | 3.45 | 16.6% | 28822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 16.6% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.7% | 26 |
| bvh.micro.Freya 0.3 | 3.3 | 11.5% | 20 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.5% | 22 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.7% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 6.7% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.9% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.5 | 20 / 35 | 5004 |
| 2 | 1 | 62.3 | 65.7 | 13 / 35 | 4628 |
| 3 | 1 | 65.6 | 75.9 | 19 / 35 | 4839 |
| 4 | 1 | 66.2 | 75.6 | 19 / 35 | 5206 |
| 5 | 1 | 63.5 | 69.5 | 18 / 35 | 4499 |
| 6 | 1 | 64.1 | 73.3 | 15 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 80% |
| dummy.micro.Sparrow 2.5 | 29 | 83% |
| bvh.micro.Freya 0.3 | 24 | 75% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 94% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| conscience.Electron 1.3g | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 49 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 17% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 14 |
| dummy.micro.Sparrow 2.5 | 14 | 13% | 41 |
| bvh.micro.Freya 0.3 | 13 | 12% | 29 |
| conscience.Electron 1.3g | 12 | 11% | 13 |
| dl.BetterWalls 1.0 | 11 | 10% | 18 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 12 |

## Melee bench: F17

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.4 | 150 / 210 | 2.13 | 21.3% | 43033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 21.3% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 20 |
| sul.Lunar 1.1 | 3.3 | 11.1% | 10 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.6% | 9 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 6 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 9 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 3 |
| sample.Corners 1.0 | 8.8 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 83.5 | 24 / 35 | 6607 |
| 2 | 1 | 71.7 | 88.9 | 25 / 35 | 7421 |
| 3 | 1 | 72.1 | 90.2 | 28 / 35 | 7286 |
| 4 | 1 | 71.7 | 86.3 | 25 / 35 | 7418 |
| 5 | 1 | 71.0 | 87.3 | 22 / 35 | 6927 |
| 6 | 1 | 72.0 | 88.3 | 26 / 35 | 7374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 91% |
| sul.Lunar 1.1 | 37 | 100% |
| supersample.SuperBoxBot 1.0 | 28 | 93% |
| dsw.StaticD 1.0 | 13 | 62% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 31% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 27% | 63 |
| dsw.StaticD 1.0 | 14 | 23% | 23 |
| sul.Lunar 1.1 | 4 | 6% | 43 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 12 |
| sample.Corners 1.0 | 3 | 5% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 11 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.4 | 114 / 210 | 2.76 | 18.5% | 38126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 18.5% | 114 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 26 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.0% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 16 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.0% | 7 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 1 |
| sample.Walls 1.0 | 7.8 | 7.4% | 5 |
| jangs.ns51 1.0 | 8.3 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 20 / 35 | 6053 |
| 2 | 1 | 67.5 | 79.7 | 15 / 35 | 6422 |
| 3 | 1 | 68.2 | 81.0 | 19 / 35 | 6311 |
| 4 | 1 | 68.4 | 80.0 | 20 / 35 | 6615 |
| 5 | 1 | 68.6 | 82.5 | 21 / 35 | 6427 |
| 6 | 1 | 67.1 | 74.9 | 19 / 35 | 6298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 92% |
| radnor.DoctorBob 1.42 | 33 | 88% |
| mld.Wisdom 1.0 | 26 | 62% |
| KiraNL.Chupacabra 0.4 | 13 | 85% |
| amz.NanoClone 1.41 | 10 | 70% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 31% | 47 |
| radnor.DoctorBob 1.42 | 18 | 19% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 48 |
| amz.NanoClone 1.41 | 15 | 15% | 20 |
| sample.Walls 1.0 | 7 | 7% | 11 |
| jangs.ns51 1.0 | 6 | 6% | 10 |
| KiraNL.Chupacabra 0.4 | 4 | 4% | 13 |
| GarmBox.Oranges 1.0 | 2 | 2% | 6 |

