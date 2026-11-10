# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.1 | 139 / 210 | 2.16 | 21.3% | 44312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.3% | 139 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 27 |
| mz.AntiGrav 1.0 | 2.8 | 14.3% | 16 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 6 |
| sample.Walls 1.0 | 6.7 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 3.8% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 86.7 | 25 / 35 | 6973 |
| 2 | 1 | 72.3 | 86.3 | 24 / 35 | 7409 |
| 3 | 1 | 72.3 | 86.3 | 22 / 35 | 7570 |
| 4 | 1 | 71.8 | 88.3 | 19 / 35 | 7374 |
| 5 | 1 | 72.1 | 85.1 | 24 / 35 | 7241 |
| 6 | 1 | 72.9 | 89.8 | 25 / 35 | 7745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 92% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| mld.Infinity 2.2 | 30 | 93% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 35% | 67 |
| mz.AntiGrav 1.0 | 20 | 28% | 79 |
| amz.NanoClone 1.41 | 10 | 14% | 15 |
| mld.Infinity 2.2 | 9 | 13% | 34 |
| jangs.ns51 1.0 | 3 | 4% | 6 |
| sample.Walls 1.0 | 3 | 4% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.5 | 105 / 210 | 2.76 | 17.9% | 32851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 17.9% | 105 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.9% | 62 |
| mld.DustBunny 3.8 | 2.8 | 14.1% | 29 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 5 |
| fullsail.SweetTea 1.1 | 6.8 | 7.5% | 1 |
| zyx.nano.Ant 1.1 | 7.5 | 7.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 6.5% | 7 |
| cs.Grudge 1.0 | 8.7 | 5.9% | 0 |
| bzdp.BoxCar 2.0 | 8.7 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 74.6 | 15 / 35 | 5644 |
| 2 | 1 | 69.4 | 87.9 | 21 / 35 | 5747 |
| 3 | 1 | 69.4 | 87.9 | 23 / 35 | 5741 |
| 4 | 1 | 65.4 | 79.4 | 12 / 35 | 4810 |
| 5 | 1 | 70.5 | 95.2 | 24 / 35 | 5590 |
| 6 | 3 | 61.7 | 57.8 | 10 / 35 | 5319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 67% |
| mld.DustBunny 3.8 | 46 | 70% |
| maribo.melee.BMV 0.1 | 11 | 91% |
| fullsail.SweetTea 1.1 | 10 | 100% |
| djdjdj.NanoSkunk10 1.0 | 9 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 38% | 74 |
| mld.DustBunny 3.8 | 26 | 25% | 64 |
| maribo.melee.BMV 0.1 | 9 | 9% | 15 |
| cs.Grudge 1.0 | 9 | 9% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 15 |
| fullsail.SweetTea 1.1 | 4 | 4% | 11 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 80.8 | 129 / 210 | 2.72 | 19.5% | 37141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.5% | 129 |
| myl.micro.Troodon 1.10 | 2.2 | 13.8% | 33 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.2% | 10 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.4% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.4% | 12 |
| fm.mammillarias 1.3 | 5.7 | 9.6% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 4 |
| sample.Fire 1.0 | 9.2 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 81.9 | 22 / 35 | 6474 |
| 2 | 1 | 69.1 | 80.3 | 21 / 35 | 6010 |
| 3 | 1 | 71.3 | 85.7 | 22 / 35 | 6777 |
| 4 | 1 | 68.7 | 79.0 | 20 / 35 | 6002 |
| 5 | 1 | 69.6 | 83.2 | 23 / 35 | 6222 |
| 6 | 1 | 67.8 | 74.9 | 21 / 35 | 5656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 95% |
| cb.nano.Insomnia 1.0 | 31 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 18 | 83% |
| fm.mammillarias 1.3 | 7 | 86% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 18 | 22% | 20 |
| myl.micro.Troodon 1.10 | 13 | 16% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 16% | 32 |
| fm.mammillarias 1.3 | 13 | 16% | 18 |
| myl.nano.KomoriNinja 1.1 | 12 | 14% | 39 |
| cs.sheldor.Talon 1.1 | 7 | 8% | 13 |
| sample.Fire 1.0 | 3 | 4% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 16 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.0 | 135 / 210 | 2.53 | 19.9% | 39196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.9% | 135 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.1% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.5% | 2 |
| tj.zombie1n 1.0.1 | 5.0 | 9.5% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.9% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.8% | 5 |
| yk.JahMicro 1.0 | 7.8 | 7.4% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 82.5 | 21 / 35 | 6972 |
| 2 | 1 | 67.9 | 79.4 | 19 / 35 | 6094 |
| 3 | 1 | 69.0 | 79.7 | 22 / 35 | 6451 |
| 4 | 1 | 69.0 | 82.5 | 19 / 35 | 6524 |
| 5 | 1 | 71.4 | 89.8 | 29 / 35 | 6338 |
| 6 | 1 | 70.8 | 83.8 | 25 / 35 | 6817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 71 | 93% |
| tvv.micro.Antares 1.1.1 | 24 | 92% |
| stelo.SoJNanoMelee 1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 64% |
| yk.JahMicro 1.0 | 9 | 89% |
| tj.zombie1n 1.0.1 | 7 | 71% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 33% | 92 |
| stelo.SoJNanoMelee 1.1 | 15 | 20% | 25 |
| tvv.micro.Antares 1.1.1 | 13 | 17% | 40 |
| tj.zombie1n 1.0.1 | 6 | 8% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 5% | 9 |
| yk.JahMicro 1.0 | 4 | 5% | 8 |
| repositorio.NanoStep 1.0 | 3 | 4% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.1 | 88 / 210 | 3.60 | 16.6% | 31344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 16.6% | 88 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 39 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.4% | 31 |
| ahf.NanoAndrew .4 | 3.7 | 11.1% | 15 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 7 |
| sam.Samspin 1.0 | 6.2 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.0 | 17 / 35 | 5514 |
| 2 | 1 | 65.0 | 71.1 | 16 / 35 | 5180 |
| 3 | 1 | 65.6 | 72.7 | 18 / 35 | 5420 |
| 4 | 1 | 66.7 | 77.1 | 18 / 35 | 5131 |
| 5 | 2 | 61.7 | 62.9 | 9 / 35 | 4748 |
| 6 | 1 | 62.6 | 61.9 | 10 / 35 | 5351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 38 | 50% |
| simonton.nano.MeleeSeed 1.8 | 33 | 88% |
| ahf.NanoAndrew .4 | 14 | 100% |
| EBBU.Sim2 1.02 | 10 | 80% |
| sam.Samspin 1.0 | 9 | 78% |
| zyx.nano.BacillusComma 1.0 | 7 | 71% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 21% | 46 |
| zyx.nano.BacillusComma 1.0 | 19 | 15% | 20 |
| simonton.nano.MeleeSeed 1.8 | 18 | 15% | 37 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 23 |
| EBBU.Sim2 1.02 | 13 | 11% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 14 |
| ahf.NanoAndrew .4 | 10 | 8% | 34 |
| sam.Samspin 1.0 | 4 | 3% | 8 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.6 | 128 / 210 | 2.30 | 19.0% | 32745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.0% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.5% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.4% | 10 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 7 |
| fm.claire 1.7 | 6.7 | 8.4% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 3 |
| kurios.DOSexe .9b | 9.3 | 5.4% | 2 |
| pa.Improved 1.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.4 | 21 / 35 | 5445 |
| 2 | 1 | 64.1 | 74.9 | 14 / 35 | 4460 |
| 3 | 1 | 69.5 | 86.3 | 24 / 35 | 5821 |
| 4 | 1 | 69.2 | 90.2 | 22 / 35 | 5399 |
| 5 | 1 | 70.7 | 93.0 | 27 / 35 | 5615 |
| 6 | 1 | 68.9 | 84.8 | 20 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 87% |
| oog.melee.CapuletDroid 1.1 | 28 | 100% |
| arthord.NanoSatanMelee Beta | 17 | 88% |
| gh.nano.Grofvuil 0.2 | 13 | 62% |
| kurios.DOSexe .9b | 5 | 80% |
| pa.Improved 1.0 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| fm.claire 1.7 | 4 | 75% |
| sample.SpinBot 1.0 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 33% | 84 |
| gh.nano.Grofvuil 0.2 | 16 | 20% | 35 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 36 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 15 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 12 |
| sample.SpinBot 1.0 | 5 | 6% | 9 |
| fm.claire 1.7 | 5 | 6% | 6 |
| kurios.DOSexe .9b | 4 | 5% | 10 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.3 | 99 / 210 | 2.86 | 18.2% | 35875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.2% | 99 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.4% | 47 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.6% | 24 |
| mz.MicroGodMelee 1 | 4.0 | 12.9% | 30 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 7 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 2 |
| fire219.CatBot 1.0 | 8.5 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.5 | 19 / 35 | 6049 |
| 2 | 1 | 68.9 | 81.6 | 17 / 35 | 6169 |
| 3 | 1 | 68.7 | 83.5 | 17 / 35 | 6334 |
| 4 | 1 | 67.0 | 77.5 | 17 / 35 | 5819 |
| 5 | 1 | 67.6 | 77.5 | 16 / 35 | 6128 |
| 6 | 1 | 65.6 | 73.3 | 13 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 93% |
| mz.MicroGodMelee 1 | 38 | 58% |
| gh.micro.Gruweltje 0.7 | 38 | 58% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 32% | 61 |
| mz.MicroGodMelee 1 | 33 | 30% | 58 |
| spinnercat.micro.Tyger 0.1 | 16 | 14% | 52 |
| DBall.Anarchy 0.1 | 9 | 8% | 12 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 5 | 5% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.6 | 102 / 210 | 3.73 | 16.3% | 30227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.3% | 102 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.9% | 26 |
| germ.TheMind .2 | 5.5 | 9.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 9.1% | 3 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 5.7 | 9.1% | 12 |
| sample.Crazy 1.0 | 8.0 | 7.1% | 7 |
| stelo.UntouchableNano 1.3 | 8.7 | 6.9% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.9 | 22 / 35 | 5225 |
| 2 | 3 | 60.3 | 56.5 | 10 / 35 | 5051 |
| 3 | 1 | 66.4 | 74.6 | 18 / 35 | 5417 |
| 4 | 1 | 62.8 | 64.1 | 19 / 35 | 4700 |
| 5 | 1 | 65.1 | 70.5 | 18 / 35 | 5021 |
| 6 | 1 | 64.2 | 69.2 | 15 / 35 | 4813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 83% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 6 | 67% |
| sample.Crazy 1.0 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 37 | 34% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 20% | 39 |
| awesomeness.Elite 1.0 | 14 | 13% | 17 |
| germ.TheMind .2 | 12 | 11% | 17 |
| lrem.micro.MoggFanatic 0.2 | 9 | 8% | 12 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 8 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.9 | 142 / 210 | 2.18 | 20.2% | 33807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.2% | 142 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 18 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 8 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.6% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.4% | 9 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 82.2 | 19 / 35 | 5433 |
| 2 | 1 | 70.4 | 87.6 | 24 / 35 | 5298 |
| 3 | 1 | 71.0 | 88.3 | 24 / 35 | 5949 |
| 4 | 1 | 71.5 | 91.7 | 24 / 35 | 5764 |
| 5 | 1 | 70.9 | 87.0 | 25 / 35 | 5550 |
| 6 | 1 | 70.5 | 84.4 | 26 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 91 | 92% |
| nz.jdc.nano.GridFu 1.0 | 22 | 95% |
| timmit.nano.TimDog 0.33 | 15 | 67% |
| maribo.IotaCT 1.1 | 9 | 89% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| ratosh.Wesco 1.4 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 31% | 85 |
| timmit.nano.TimDog 0.33 | 16 | 24% | 34 |
| nz.jdc.nano.GridFu 1.0 | 8 | 12% | 44 |
| stelo.PatternRobot 1.0 | 6 | 9% | 13 |
| ratosh.Wesco 1.4 | 5 | 7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 7 |
| maribo.IotaCT 1.1 | 4 | 6% | 10 |
| spinnercat.Omen 1.0 | 3 | 4% | 4 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.9 | 160 / 210 | 1.82 | 21.7% | 42256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.7% | 160 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 21 |
| baal.nano.N 1.42 | 2.7 | 11.8% | 9 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.2% | 10 |
| sanja.First 0.1 | 6.0 | 8.5% | 3 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.3% | 0 |
| cvt.Firsty 1.0 | 8.2 | 7.1% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 85.7 | 24 / 35 | 7068 |
| 2 | 1 | 73.0 | 95.2 | 29 / 35 | 7469 |
| 3 | 1 | 72.4 | 92.7 | 27 / 35 | 7206 |
| 4 | 1 | 70.8 | 88.3 | 26 / 35 | 6559 |
| 5 | 1 | 72.1 | 93.0 | 29 / 35 | 6839 |
| 6 | 1 | 71.5 | 90.5 | 25 / 35 | 7115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 87% |
| tvv.nano.Polaris 1.2 | 36 | 78% |
| cvt.Firsty 1.0 | 24 | 100% |
| zyx.micro.Ant 1.1 | 21 | 81% |
| sanja.First 0.1 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| amk.Punbot.Punbot 0.01 | 15 | 93% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 12 | 23% | 46 |
| zyx.micro.Ant 1.1 | 12 | 23% | 36 |
| tvv.nano.Polaris 1.2 | 10 | 19% | 56 |
| Grystrion.TrackerWO 1.0 | 8 | 15% | 14 |
| amk.Punbot.Punbot 0.01 | 4 | 8% | 8 |
| sample.RamFire 1.0 | 3 | 6% | 5 |
| cvt.Firsty 1.0 | 2 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| sanja.First 0.1 | 0 | 0% | 18 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 64.6 | 73 / 210 | 4.19 | 14.9% | 31246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.6% | 71 |
| hadur117.micro.SaorWGR 0.1 | 1.8 | 14.9% | 73 |
| cs.Wren 1.0 | 3.2 | 12.8% | 23 |
| js.PinBall 1.6 | 4.3 | 10.7% | 15 |
| mz.Cork 0.1 | 4.7 | 10.9% | 7 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 5 |
| evd.X1 0.01 | 6.8 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 7.1% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 6.2% | 8 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 66.0 | 17 / 35 | 5404 |
| 2 | 2 | 61.0 | 62.5 | 9 / 35 | 4932 |
| 3 | 2 | 62.1 | 66.0 | 10 / 35 | 5164 |
| 4 | 1 | 64.3 | 67.9 | 15 / 35 | 5691 |
| 5 | 2 | 61.0 | 59.7 | 10 / 35 | 5183 |
| 6 | 2 | 61.8 | 65.1 | 12 / 35 | 4872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 73% |
| cs.Wren 1.0 | 21 | 86% |
| js.PinBall 1.6 | 6 | 100% |
| mz.Cork 0.1 | 5 | 80% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 137 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 39% | 97 |
| cs.Wren 1.0 | 21 | 15% | 35 |
| joe.ADinosaur 1.0 | 15 | 11% | 15 |
| evd.X1 0.01 | 14 | 10% | 17 |
| js.PinBall 1.6 | 11 | 8% | 20 |
| mz.Cork 0.1 | 11 | 8% | 12 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.2 | 136 / 210 | 2.24 | 19.7% | 31877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.7% | 136 |
| ntc.Opposite 1.5 | 2.8 | 11.3% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 6 |
| myl.nano.Graviton 1.10 | 4.2 | 10.7% | 17 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.7% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 8 |
| DBall.NUKE 0.1 | 7.0 | 8.1% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 13 |
| pbg.R2D2 1.0 | 9.3 | 6.2% | 2 |
| donjezza.Muncho 1.0 | 9.5 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 29 / 35 | 5398 |
| 2 | 1 | 68.8 | 84.8 | 22 / 35 | 5499 |
| 3 | 1 | 69.8 | 90.2 | 24 / 35 | 4990 |
| 4 | 1 | 68.7 | 82.9 | 20 / 35 | 5832 |
| 5 | 1 | 67.3 | 80.6 | 19 / 35 | 4896 |
| 6 | 1 | 68.8 | 86.0 | 22 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 81% |
| stelo.AreaTargetingBot 1.1 | 29 | 93% |
| ntc.Opposite 1.5 | 26 | 81% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 90% |
| disan.Chair 2.2.0 | 14 | 64% |
| DBall.NUKE 0.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 23% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 19% | 23 |
| myl.nano.Graviton 1.10 | 11 | 15% | 40 |
| disan.Chair 2.2.0 | 9 | 12% | 22 |
| ntc.Opposite 1.5 | 9 | 12% | 22 |
| stelo.AreaTargetingBot 1.1 | 6 | 8% | 32 |
| donjezza.Muncho 1.0 | 4 | 5% | 13 |
| pbg.R2D2 1.0 | 3 | 4% | 18 |
| DBall.NUKE 0.1 | 2 | 3% | 10 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.1 | 86 / 210 | 3.33 | 16.0% | 26209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.0% | 86 |
| oog.melee.Capulet 1.2 | 1.8 | 15.0% | 52 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 28 |
| yagami.Tidus 0.11 | 4.2 | 12.0% | 10 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 11.7% | 17 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 16 |
| stelo.MirrorNano 1.3 | 7.5 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 8.7 | 5.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.4 | 20 / 35 | 4511 |
| 2 | 1 | 66.8 | 79.7 | 14 / 35 | 4654 |
| 3 | 2 | 65.4 | 76.2 | 14 / 35 | 4182 |
| 4 | 2 | 63.2 | 66.7 | 12 / 35 | 4474 |
| 5 | 1 | 64.4 | 71.7 | 14 / 35 | 4459 |
| 6 | 1 | 63.5 | 71.1 | 12 / 35 | 3929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 56% |
| kawigi.micro.Shiz 1.1 | 27 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 73% |
| yagami.Tidus 0.11 | 15 | 100% |
| ejb.Polaris 1.0.1 | 5 | 60% |
| step.nanoPri 1.0 | 3 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 40% | 74 |
| yagami.Tidus 0.11 | 20 | 16% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 12% | 37 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 34 |
| ejb.Polaris 1.0.1 | 13 | 10% | 16 |
| step.nanoPri 1.0 | 5 | 4% | 8 |
| kurios.DOSexe .9a | 4 | 3% | 3 |
| stelo.MirrorNano 1.3 | 3 | 2% | 6 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.8 | 124 / 210 | 2.91 | 17.5% | 27998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.5% | 124 |
| bzdp.Pansy 2.1 | 2.3 | 12.5% | 23 |
| wee.Gem 1.8.4 | 3.0 | 12.1% | 32 |
| ratosh.Nobo 0.21 | 4.5 | 10.7% | 10 |
| wompi.Quokka 1.6 | 4.8 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.3 | 21 / 35 | 4675 |
| 2 | 1 | 64.7 | 74.6 | 17 / 35 | 4422 |
| 3 | 1 | 65.2 | 73.0 | 19 / 35 | 4843 |
| 4 | 1 | 66.4 | 79.4 | 22 / 35 | 4521 |
| 5 | 1 | 67.7 | 84.1 | 23 / 35 | 4822 |
| 6 | 1 | 67.2 | 81.3 | 22 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 92% |
| wee.Gem 1.8.4 | 27 | 93% |
| wompi.Quokka 1.6 | 15 | 93% |
| ratosh.Nobo 0.21 | 14 | 86% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 3 | 33% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 20% | 75 |
| ratosh.Nobo 0.21 | 11 | 13% | 25 |
| maribo.FollowFire 1 | 10 | 11% | 10 |
| wee.Gem 1.8.4 | 9 | 10% | 34 |
| bayen.UbaMicro 1.4 | 9 | 10% | 11 |
| stelo.MyAgileRobot 0.2 | 9 | 10% | 10 |
| m3thos.Eva00 1.1 | 8 | 9% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 10 |
| wompi.Quokka 1.6 | 6 | 7% | 15 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 89.6 | 135 / 210 | 1.94 | 22.3% | 50237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.3% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 16 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.0 | 8.8% | 0 |
| ayk.WallHugger 1.0 | 5.5 | 9.0% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 90.2 | 21 / 35 | 8269 |
| 2 | 1 | 74.6 | 92.1 | 27 / 35 | 8755 |
| 3 | 1 | 72.4 | 84.4 | 21 / 35 | 7874 |
| 4 | 1 | 74.8 | 93.0 | 26 / 35 | 8779 |
| 5 | 1 | 73.3 | 87.6 | 19 / 35 | 8515 |
| 6 | 1 | 73.3 | 90.2 | 21 / 35 | 8045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 80% |
| mz.NanoGod 2.02 | 16 | 50% |
| exauge.GateKeeper 1.1.121g | 15 | 87% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 52% | 145 |
| mz.NanoGod 2.02 | 21 | 28% | 32 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 13 |
| ayk.WallHugger 1.0 | 6 | 8% | 7 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 8 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.4 | 97 / 210 | 3.57 | 16.3% | 29315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.3% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 18 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.5% | 29 |
| bvh.micro.Freya 0.3 | 3.7 | 11.3% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.1% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 0 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.8 | 19 / 35 | 5127 |
| 2 | 1 | 64.0 | 70.5 | 17 / 35 | 5048 |
| 3 | 1 | 67.7 | 83.5 | 18 / 35 | 5086 |
| 4 | 1 | 62.7 | 66.0 | 13 / 35 | 4766 |
| 5 | 1 | 65.1 | 71.4 | 18 / 35 | 5162 |
| 6 | 1 | 59.8 | 60.3 | 12 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 87% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| bvh.micro.Freya 0.3 | 15 | 73% |
| ap.Frederick 1.1 | 12 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 50% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 21 | 19% | 47 |
| voidious.micro.BlitzBat 1.05 | 20 | 18% | 61 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 15% | 28 |
| bvh.micro.Freya 0.3 | 14 | 12% | 20 |
| conscience.Electron 1.3g | 13 | 12% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 12% | 14 |
| dl.BetterWalls 1.0 | 9 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 10 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 83.2 | 140 / 210 | 2.51 | 20.7% | 42079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.7% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.4% | 26 |
| sul.Lunar 1.1 | 3.3 | 11.9% | 10 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.5% | 12 |
| mme.NikeEnhanced 2.0 | 5.0 | 8.9% | 6 |
| dsw.StaticD 1.0 | 5.8 | 8.0% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 6.0% | 3 |
| sample.Corners 1.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 80.6 | 22 / 35 | 6951 |
| 2 | 1 | 72.0 | 88.6 | 24 / 35 | 7132 |
| 3 | 1 | 71.2 | 82.9 | 25 / 35 | 7024 |
| 4 | 1 | 71.0 | 82.2 | 23 / 35 | 7371 |
| 5 | 1 | 72.0 | 86.7 | 25 / 35 | 7345 |
| 6 | 1 | 68.6 | 78.4 | 21 / 35 | 6256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 84% |
| sul.Lunar 1.1 | 49 | 98% |
| supersample.SuperBoxBot 1.0 | 28 | 93% |
| dsw.StaticD 1.0 | 8 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 0% |

Hadur died in 70 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 27 | 39% | 51 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 27% | 64 |
| dsw.StaticD 1.0 | 9 | 13% | 16 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 9 |
| sul.Lunar 1.1 | 3 | 4% | 51 |
| sample.Corners 1.0 | 3 | 4% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 79.2 | 102 / 210 | 2.88 | 18.5% | 39510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.5% | 102 |
| radnor.DoctorBob 1.42 | 2.7 | 13.3% | 38 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.8% | 23 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.5% | 9 |
| amz.NanoClone 1.41 | 5.7 | 10.2% | 9 |
| sample.Walls 1.0 | 7.2 | 7.1% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.9% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 83.5 | 20 / 35 | 7127 |
| 2 | 1 | 66.8 | 76.2 | 13 / 35 | 6380 |
| 3 | 1 | 67.4 | 76.5 | 16 / 35 | 6781 |
| 4 | 1 | 69.4 | 86.7 | 17 / 35 | 6245 |
| 5 | 1 | 67.8 | 77.5 | 20 / 35 | 6359 |
| 6 | 1 | 67.2 | 74.6 | 16 / 35 | 6618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 65% |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 82% |
| mld.Wisdom 1.0 | 25 | 68% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 8 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 28% | 60 |
| mld.Wisdom 1.0 | 27 | 25% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 19% | 51 |
| KiraNL.Chupacabra 0.4 | 16 | 15% | 24 |
| amz.NanoClone 1.41 | 5 | 5% | 10 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| sample.Walls 1.0 | 1 | 1% | 4 |

