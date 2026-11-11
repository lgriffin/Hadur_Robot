# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.9 | 158 / 210 | 2.00 | 21.8% | 44157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.8% | 158 |
| mz.AntiGrav 1.0 | 2.5 | 14.0% | 14 |
| radnor.DoctorBob 1.42 | 2.7 | 13.9% | 20 |
| mld.Infinity 2.2 | 4.0 | 12.2% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 3 |
| sample.Walls 1.0 | 6.7 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 7.0% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.2% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 95.9 | 30 / 35 | 7185 |
| 2 | 1 | 70.7 | 79.4 | 23 / 35 | 7198 |
| 3 | 1 | 72.4 | 89.2 | 24 / 35 | 7471 |
| 4 | 1 | 73.7 | 93.7 | 30 / 35 | 7319 |
| 5 | 1 | 73.1 | 87.9 | 26 / 35 | 7902 |
| 6 | 1 | 71.9 | 87.6 | 25 / 35 | 7082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 97% |
| mld.Infinity 2.2 | 42 | 98% |
| radnor.DoctorBob 1.42 | 35 | 94% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 33% | 60 |
| mz.AntiGrav 1.0 | 13 | 25% | 72 |
| amz.NanoClone 1.41 | 11 | 21% | 15 |
| mld.Infinity 2.2 | 7 | 13% | 46 |
| sample.Walls 1.0 | 1 | 2% | 8 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.2 | 130 / 210 | 2.06 | 19.1% | 32572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.1% | 130 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.9% | 49 |
| mld.DustBunny 3.8 | 3.5 | 11.9% | 11 |
| maribo.melee.BMV 0.1 | 3.7 | 10.8% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 8.8% | 5 |
| zyx.nano.Ant 1.1 | 6.3 | 8.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.1% | 7 |
| fullsail.SweetTea 1.1 | 7.8 | 6.9% | 3 |
| bzdp.BoxCar 2.0 | 8.0 | 7.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 24 / 35 | 5606 |
| 2 | 1 | 69.1 | 88.3 | 22 / 35 | 5853 |
| 3 | 1 | 69.6 | 92.1 | 22 / 35 | 5821 |
| 4 | 1 | 68.1 | 87.0 | 20 / 35 | 5034 |
| 5 | 1 | 68.6 | 85.7 | 20 / 35 | 5318 |
| 6 | 1 | 68.7 | 89.2 | 22 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 70% |
| mld.DustBunny 3.8 | 44 | 86% |
| djdjdj.NanoSkunk10 1.0 | 17 | 100% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| bzdp.BoxCar 2.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 49% | 88 |
| mld.DustBunny 3.8 | 17 | 20% | 47 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 15 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 17 |
| maribo.melee.BMV 0.1 | 5 | 6% | 17 |
| zyx.nano.Ant 1.1 | 4 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 4% | 14 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 82.6 | 140 / 210 | 2.57 | 19.6% | 34988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.6% | 140 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.7% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.3% | 18 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 7 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 0 |
| sample.Fire 1.0 | 9.5 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 79.0 | 24 / 35 | 5665 |
| 2 | 1 | 69.3 | 82.9 | 24 / 35 | 5717 |
| 3 | 1 | 68.5 | 78.7 | 20 / 35 | 5868 |
| 4 | 1 | 68.5 | 78.1 | 22 / 35 | 5633 |
| 5 | 1 | 71.8 | 91.1 | 27 / 35 | 6275 |
| 6 | 1 | 69.8 | 85.7 | 23 / 35 | 5830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 93% |
| cb.nano.Insomnia 1.0 | 25 | 100% |
| sp.Nanos.Ember 1.1 | 14 | 100% |
| myl.nano.KomoriNinja 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 23% | 42 |
| myl.nano.KomoriNinja 1.1 | 13 | 19% | 40 |
| myl.micro.Troodon 1.10 | 12 | 17% | 54 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 16 |
| sp.Nanos.Ember 1.1 | 6 | 9% | 29 |
| sample.Fire 1.0 | 5 | 7% | 8 |
| fm.mammillarias 1.3 | 4 | 6% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.7 | 155 / 210 | 2.29 | 20.6% | 39597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.6% | 155 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 14 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 8.9% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 8.7% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.3% | 6 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.1 | 30 / 35 | 7545 |
| 2 | 1 | 67.1 | 73.7 | 20 / 35 | 5972 |
| 3 | 1 | 68.8 | 80.6 | 23 / 35 | 6368 |
| 4 | 1 | 70.8 | 87.9 | 27 / 35 | 6438 |
| 5 | 1 | 70.2 | 85.4 | 27 / 35 | 6463 |
| 6 | 1 | 71.5 | 89.5 | 28 / 35 | 6811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 93% |
| stelo.SoJNanoMelee 1.1 | 34 | 94% |
| tvv.micro.Antares 1.1.1 | 22 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 85% |
| tj.zombie1n 1.0.1 | 11 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 35% | 74 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 13% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 25 |
| yk.JahMicro 1.0 | 5 | 9% | 13 |
| repositorio.NanoStep 1.0 | 4 | 7% | 9 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 27 |
| tj.zombie1n 1.0.1 | 3 | 5% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.8 | 91 / 210 | 3.72 | 16.2% | 29754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.2% | 91 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 32 |
| ahf.NanoAndrew .4 | 3.0 | 11.6% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.2% | 21 |
| sam.Samspin 1.0 | 5.3 | 10.1% | 14 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.8% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.6 | 18 / 35 | 5103 |
| 2 | 1 | 61.6 | 65.1 | 10 / 35 | 4646 |
| 3 | 1 | 62.5 | 67.0 | 15 / 35 | 4491 |
| 4 | 1 | 65.9 | 74.0 | 17 / 35 | 5236 |
| 5 | 1 | 63.0 | 64.8 | 15 / 35 | 4909 |
| 6 | 1 | 65.6 | 72.4 | 16 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 92% |
| oog.melee.Corsair 1.0 | 25 | 60% |
| ahf.NanoAndrew .4 | 19 | 79% |
| sam.Samspin 1.0 | 15 | 93% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| EBBU.Sim2 1.02 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 21 | 18% | 39 |
| oog.melee.Corsair 1.0 | 20 | 17% | 36 |
| simonton.nano.MeleeSeed 1.8 | 18 | 15% | 49 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 21 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 19 |
| EBBU.Sim2 1.02 | 13 | 11% | 14 |
| sam.Samspin 1.0 | 10 | 8% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 5% | 5 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.9 | 137 / 210 | 2.27 | 19.4% | 33064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.4% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 35 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.6% | 9 |
| fm.claire 1.7 | 5.3 | 9.0% | 5 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.2% | 3 |
| sample.SpinBot 1.0 | 8.0 | 7.4% | 2 |
| pa.Improved 1.0 | 9.3 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.5 | 23 / 35 | 5428 |
| 2 | 1 | 67.8 | 83.5 | 21 / 35 | 5268 |
| 3 | 1 | 67.1 | 79.4 | 19 / 35 | 5088 |
| 4 | 1 | 70.3 | 90.8 | 26 / 35 | 5710 |
| 5 | 1 | 70.0 | 87.0 | 26 / 35 | 5869 |
| 6 | 1 | 68.9 | 85.1 | 22 / 35 | 5701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 56 | 71% |
| oog.melee.CapuletDroid 1.1 | 43 | 98% |
| gh.nano.Grofvuil 0.2 | 21 | 81% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| sample.SpinBot 1.0 | 12 | 100% |
| fm.claire 1.7 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 37% | 68 |
| gh.nano.Grofvuil 0.2 | 13 | 18% | 35 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 14 |
| fm.claire 1.7 | 6 | 8% | 10 |
| oog.melee.CapuletDroid 1.1 | 5 | 7% | 47 |
| pa.Improved 1.0 | 4 | 5% | 6 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| sample.SpinBot 1.0 | 3 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 11 |

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.2 | 104 / 210 | 2.69 | 18.3% | 34486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.3% | 104 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.6% | 43 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.5% | 25 |
| mz.MicroGodMelee 1 | 4.0 | 12.4% | 26 |
| DBall.Anarchy 0.1 | 5.5 | 8.2% | 8 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.7% | 4 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 0 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 0 |
| fire219.CatBot 1.0 | 9.0 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.4 | 16 / 35 | 5676 |
| 2 | 1 | 68.0 | 79.0 | 20 / 35 | 5832 |
| 3 | 1 | 68.4 | 82.9 | 15 / 35 | 5930 |
| 4 | 1 | 66.7 | 75.9 | 16 / 35 | 5431 |
| 5 | 1 | 68.2 | 83.5 | 20 / 35 | 5627 |
| 6 | 1 | 69.1 | 86.7 | 17 / 35 | 5990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 86% |
| mz.MicroGodMelee 1 | 29 | 72% |
| gh.micro.Gruweltje 0.7 | 25 | 64% |
| DBall.Anarchy 0.1 | 7 | 86% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 37 | 35% | 57 |
| spinnercat.micro.Tyger 0.1 | 23 | 22% | 65 |
| mz.MicroGodMelee 1 | 21 | 20% | 45 |
| acogdev.alpha 0.2 | 6 | 6% | 8 |
| el.JumpShoot 0.2 | 5 | 5% | 6 |
| DBall.Anarchy 0.1 | 4 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 8 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 72.5 | 119 / 210 | 3.47 | 17.2% | 31974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.2% | 119 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 13.7% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.5% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 9.9% | 9 |
| germ.TheMind .2 | 5.3 | 9.4% | 4 |
| awesomeness.Elite 1.0 | 6.5 | 8.5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.0% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.2% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 58.4 | 18 / 35 | 4925 |
| 2 | 1 | 69.0 | 81.6 | 24 / 35 | 5653 |
| 3 | 1 | 65.3 | 69.8 | 18 / 35 | 5539 |
| 4 | 1 | 68.4 | 81.0 | 23 / 35 | 5672 |
| 5 | 1 | 65.2 | 73.0 | 19 / 35 | 5006 |
| 6 | 1 | 65.1 | 71.4 | 17 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 93% |
| awesomeness.Elite 1.0 | 13 | 77% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 45% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 11% | 32 |
| stelo.UntouchableNano 1.3 | 10 | 11% | 15 |
| germ.TheMind .2 | 9 | 10% | 21 |
| qualidafial.MajorDick 1.0.1 | 7 | 8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 7% | 10 |
| awesomeness.Elite 1.0 | 4 | 4% | 11 |
| mym.EdgeStalker 1.0 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.4 | 159 / 210 | 1.95 | 20.3% | 31195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.3% | 159 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 9.8% | 3 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 5 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.4% | 7 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 7.7% | 0 |
| stelo.PatternRobot 1.0 | 8.5 | 7.2% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.9 | 24 / 35 | 5057 |
| 2 | 1 | 72.4 | 97.8 | 31 / 35 | 5325 |
| 3 | 1 | 71.6 | 91.7 | 27 / 35 | 5482 |
| 4 | 1 | 70.0 | 87.9 | 24 / 35 | 5021 |
| 5 | 1 | 69.2 | 84.1 | 24 / 35 | 5136 |
| 6 | 1 | 71.6 | 93.0 | 29 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 85 | 92% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 87% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| spinnercat.Omen 1.0 | 6 | 100% |
| maribo.IotaCT 1.1 | 6 | 83% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 40% | 81 |
| timmit.nano.TimDog 0.33 | 7 | 13% | 27 |
| ratosh.Wesco 1.4 | 7 | 13% | 11 |
| nz.jdc.nano.GridFu 1.0 | 5 | 10% | 51 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 12 |
| maribo.IotaCT 1.1 | 4 | 8% | 11 |
| stelo.PatternRobot 1.0 | 3 | 6% | 10 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.4 | 163 / 210 | 1.95 | 21.0% | 38459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.0% | 163 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.2% | 15 |
| baal.nano.N 1.42 | 3.0 | 11.1% | 9 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 1 |
| zyx.micro.Ant 1.1 | 5.2 | 9.3% | 13 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 3 |
| sanja.First 0.1 | 6.7 | 8.4% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 3 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.1% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.8 | 32 / 35 | 7216 |
| 2 | 1 | 70.1 | 86.0 | 29 / 35 | 6056 |
| 3 | 1 | 69.3 | 87.6 | 24 / 35 | 5934 |
| 4 | 1 | 69.8 | 84.8 | 25 / 35 | 5926 |
| 5 | 1 | 71.5 | 89.5 | 27 / 35 | 7096 |
| 6 | 1 | 71.0 | 90.8 | 26 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 35 | 94% |
| baal.nano.N 1.42 | 31 | 100% |
| sanja.First 0.1 | 25 | 100% |
| zyx.micro.Ant 1.1 | 22 | 95% |
| cvt.Firsty 1.0 | 20 | 90% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 83% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 25% | 31 |
| tvv.nano.Polaris 1.2 | 8 | 17% | 59 |
| Grystrion.TrackerWO 1.0 | 6 | 13% | 18 |
| sample.RamFire 1.0 | 6 | 13% | 8 |
| sanja.First 0.1 | 4 | 8% | 21 |
| squidM.TentalceMeleeNano 1.1 | 4 | 8% | 9 |
| baal.nano.N 1.42 | 3 | 6% | 40 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 6 |
| cvt.Firsty 1.0 | 2 | 4% | 16 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.8 | 96 / 210 | 3.72 | 16.0% | 31980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 16.0% | 96 |
| kc.micro.Figment 1.0 | 2.0 | 14.2% | 50 |
| cs.Wren 1.0 | 3.3 | 12.4% | 27 |
| js.PinBall 1.6 | 3.7 | 11.7% | 13 |
| mz.Cork 0.1 | 4.8 | 10.6% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 5 |
| evd.X1 0.01 | 7.0 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 6 |
| PSW.Relentless 0.1 | 9.5 | 5.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 69.8 | 14 / 35 | 5212 |
| 2 | 1 | 63.8 | 67.9 | 18 / 35 | 5150 |
| 3 | 1 | 64.7 | 69.8 | 16 / 35 | 5545 |
| 4 | 1 | 66.5 | 79.7 | 16 / 35 | 5369 |
| 5 | 1 | 64.3 | 69.8 | 17 / 35 | 5622 |
| 6 | 1 | 61.2 | 61.6 | 15 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 71% |
| cs.Wren 1.0 | 22 | 86% |
| js.PinBall 1.6 | 11 | 73% |
| mz.Cork 0.1 | 10 | 80% |
| donjezza.Jezza 1.0 | 5 | 100% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 44% | 98 |
| joe.ADinosaur 1.0 | 14 | 12% | 15 |
| cs.Wren 1.0 | 11 | 10% | 30 |
| js.PinBall 1.6 | 11 | 10% | 21 |
| evd.X1 0.01 | 11 | 10% | 12 |
| PSW.Relentless 0.1 | 9 | 8% | 9 |
| mz.Cork 0.1 | 7 | 6% | 14 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.9 | 145 / 210 | 2.00 | 20.2% | 32172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.2% | 145 |
| myl.nano.Graviton 1.10 | 3.2 | 11.1% | 18 |
| ntc.Opposite 1.5 | 3.5 | 11.0% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 3 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.3% | 1 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.4% | 14 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 14 |
| DBall.NUKE 0.1 | 7.3 | 8.2% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 3 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.4 | 21 / 35 | 5076 |
| 2 | 1 | 69.6 | 86.7 | 24 / 35 | 5487 |
| 3 | 1 | 70.1 | 89.2 | 24 / 35 | 5505 |
| 4 | 1 | 69.9 | 90.2 | 23 / 35 | 5466 |
| 5 | 1 | 71.9 | 93.7 | 30 / 35 | 5863 |
| 6 | 1 | 69.1 | 89.2 | 23 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 91% |
| myl.nano.Graviton 1.10 | 31 | 94% |
| disan.Chair 2.2.0 | 19 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 95% |
| donjezza.Muncho 1.0 | 15 | 93% |
| ntc.Opposite 1.5 | 15 | 87% |
| DBall.NUKE 0.1 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 11 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 15 | 22% | 29 |
| disan.Chair 2.2.0 | 13 | 19% | 23 |
| myl.nano.Graviton 1.10 | 10 | 15% | 47 |
| stelo.AreaTargetingBot 1.1 | 10 | 15% | 35 |
| pfvicm.Sobieski 7.2.3b | 9 | 13% | 23 |
| ntc.Opposite 1.5 | 6 | 9% | 21 |
| pbg.R2D2 1.0 | 2 | 3% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 15 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.9 | 78 / 210 | 3.44 | 15.7% | 26121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 15.7% | 78 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 40 |
| oog.melee.Capulet 1.2 | 3.0 | 13.3% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.6% | 26 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 8.4% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.0 | 13 / 35 | 4266 |
| 2 | 1 | 66.5 | 81.3 | 17 / 35 | 4363 |
| 3 | 1 | 64.2 | 72.1 | 10 / 35 | 4568 |
| 4 | 2 | 61.7 | 65.4 | 11 / 35 | 4016 |
| 5 | 1 | 65.9 | 76.8 | 16 / 35 | 4759 |
| 6 | 2 | 63.1 | 68.6 | 11 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 93% |
| oog.melee.Capulet 1.2 | 25 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 85% |
| yagami.Tidus 0.11 | 16 | 88% |
| ejb.Polaris 1.0.1 | 5 | 80% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 35% | 67 |
| yagami.Tidus 0.11 | 24 | 18% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 34 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 34 |
| ejb.Polaris 1.0.1 | 13 | 10% | 21 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 6 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.4 | 127 / 210 | 2.94 | 17.3% | 27468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.3% | 127 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 15 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 24 |
| wompi.Quokka 1.6 | 4.0 | 11.1% | 20 |
| ratosh.Nobo 0.21 | 4.2 | 11.1% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 10.2% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 24 / 35 | 4888 |
| 2 | 1 | 64.4 | 73.7 | 20 / 35 | 4382 |
| 3 | 1 | 65.5 | 76.5 | 20 / 35 | 4711 |
| 4 | 1 | 64.9 | 78.4 | 18 / 35 | 4395 |
| 5 | 1 | 65.6 | 74.9 | 22 / 35 | 4411 |
| 6 | 1 | 67.2 | 82.5 | 23 / 35 | 4681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 94% |
| wee.Gem 1.8.4 | 34 | 97% |
| wompi.Quokka 1.6 | 19 | 89% |
| ratosh.Nobo 0.21 | 16 | 94% |
| m3thos.Eva00 1.1 | 9 | 89% |
| bayen.UbaMicro 1.4 | 6 | 50% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 18% | 27 |
| m3thos.Eva00 1.1 | 14 | 17% | 22 |
| maribo.FollowFire 1 | 12 | 14% | 13 |
| wompi.Quokka 1.6 | 11 | 13% | 23 |
| bzdp.Pansy 2.1 | 9 | 11% | 49 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 11 |
| bayen.UbaMicro 1.4 | 6 | 7% | 10 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 7 |
| wee.Gem 1.8.4 | 4 | 5% | 47 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 87.4 | 130 / 210 | 2.14 | 21.4% | 47418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.4% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 17 |
| ayk.WallHugger 1.0 | 4.3 | 9.6% | 0 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 4 |
| stuff.Vlad 0.1 | 6.0 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.3% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 87.3 | 21 / 35 | 7287 |
| 2 | 1 | 72.6 | 86.0 | 21 / 35 | 8214 |
| 3 | 1 | 73.7 | 91.1 | 26 / 35 | 8520 |
| 4 | 1 | 72.3 | 85.4 | 21 / 35 | 7907 |
| 5 | 1 | 72.4 | 87.9 | 23 / 35 | 7616 |
| 6 | 1 | 71.8 | 86.3 | 18 / 35 | 7874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 83% |
| mz.NanoGod 2.02 | 19 | 58% |
| drd.Dreadknoght 0.9 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| ayk.WallHugger 1.0 | 10 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 44% | 120 |
| mz.NanoGod 2.02 | 25 | 31% | 38 |
| ayk.WallHugger 1.0 | 8 | 10% | 15 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 13 |
| drd.Dreadknoght 0.9 | 3 | 4% | 17 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.4 | 110 / 210 | 3.49 | 16.6% | 28723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.6% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 25 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.2% | 11 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 17 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 12 |
| dl.BetterWalls 1.0 | 9.0 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 73.7 | 20 / 35 | 4488 |
| 2 | 1 | 68.4 | 84.8 | 20 / 35 | 5373 |
| 3 | 1 | 64.5 | 71.4 | 19 / 35 | 4668 |
| 4 | 1 | 62.2 | 62.9 | 15 / 35 | 4755 |
| 5 | 1 | 64.9 | 73.0 | 21 / 35 | 4677 |
| 6 | 1 | 63.4 | 68.6 | 15 / 35 | 4762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 83% |
| dummy.micro.Sparrow 2.5 | 31 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 77% |
| bvh.micro.Freya 0.3 | 19 | 95% |
| stelo.MirrorMicro 1.0 | 6 | 67% |
| conscience.Electron 1.3g | 3 | 67% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 20% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 18% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 42 |
| conscience.Electron 1.3g | 15 | 15% | 20 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 36 |
| bvh.micro.Freya 0.3 | 10 | 10% | 19 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.8 | 154 / 210 | 2.10 | 21.2% | 41107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.2% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.5% | 10 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.5% | 17 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 11 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 9 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 1 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.7% | 4 |
| sample.Corners 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 90.5 | 28 / 35 | 7358 |
| 2 | 1 | 70.3 | 83.8 | 25 / 35 | 6476 |
| 3 | 1 | 71.3 | 86.3 | 24 / 35 | 7237 |
| 4 | 1 | 69.9 | 84.4 | 25 / 35 | 6167 |
| 5 | 1 | 71.7 | 91.1 | 26 / 35 | 6701 |
| 6 | 1 | 72.1 | 90.8 | 26 / 35 | 7168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 94% |
| sul.Lunar 1.1 | 37 | 100% |
| supersample.SuperBoxBot 1.0 | 31 | 87% |
| dsw.StaticD 1.0 | 12 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 30% | 69 |
| supersample.SuperBoxBot 1.0 | 16 | 28% | 40 |
| dsw.StaticD 1.0 | 8 | 14% | 21 |
| mme.NikeEnhanced 2.0 | 6 | 11% | 12 |
| sul.Lunar 1.1 | 3 | 5% | 39 |
| sample.Corners 1.0 | 2 | 4% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.1 | 110 / 210 | 2.70 | 18.6% | 38391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.6% | 110 |
| radnor.DoctorBob 1.42 | 2.0 | 13.6% | 31 |
| mld.Wisdom 1.0 | 3.8 | 11.5% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.1% | 21 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.6% | 7 |
| amz.NanoClone 1.41 | 5.3 | 9.6% | 8 |
| GarmBox.Oranges 1.0 | 7.0 | 8.3% | 3 |
| sample.Walls 1.0 | 7.8 | 7.4% | 4 |
| jangs.ns51 1.0 | 8.8 | 5.7% | 7 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.3 | 20 / 35 | 6193 |
| 2 | 1 | 66.5 | 77.5 | 16 / 35 | 6080 |
| 3 | 1 | 67.1 | 80.3 | 15 / 35 | 5758 |
| 4 | 1 | 70.2 | 87.3 | 19 / 35 | 7036 |
| 5 | 1 | 67.6 | 75.6 | 19 / 35 | 6614 |
| 6 | 1 | 69.4 | 85.4 | 21 / 35 | 6710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 80% |
| mld.Wisdom 1.0 | 19 | 53% |
| KiraNL.Chupacabra 0.4 | 12 | 92% |
| GarmBox.Oranges 1.0 | 10 | 90% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 25% | 65 |
| mld.Wisdom 1.0 | 25 | 25% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 20% | 52 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 26 |
| amz.NanoClone 1.41 | 8 | 8% | 12 |
| GarmBox.Oranges 1.0 | 5 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| sample.Walls 1.0 | 2 | 2% | 4 |

