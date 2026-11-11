# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.4 | 143 / 210 | 2.31 | 21.1% | 43213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.1% | 143 |
| mz.AntiGrav 1.0 | 2.5 | 14.5% | 21 |
| radnor.DoctorBob 1.42 | 3.0 | 13.5% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 14 |
| amz.NanoClone 1.41 | 4.8 | 11.0% | 11 |
| sample.Walls 1.0 | 6.3 | 6.9% | 3 |
| GarmBox.Oranges 1.0 | 7.2 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 8.7 | 4.7% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 90.8 | 28 / 35 | 6903 |
| 2 | 1 | 72.9 | 88.6 | 27 / 35 | 7527 |
| 3 | 1 | 72.0 | 86.3 | 22 / 35 | 7591 |
| 4 | 1 | 71.6 | 82.2 | 22 / 35 | 7308 |
| 5 | 1 | 70.1 | 81.9 | 22 / 35 | 6465 |
| 6 | 1 | 71.4 | 82.9 | 22 / 35 | 7419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 82 | 94% |
| mld.Infinity 2.2 | 32 | 91% |
| radnor.DoctorBob 1.42 | 28 | 89% |
| amz.NanoClone 1.41 | 9 | 44% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 31% | 52 |
| mz.AntiGrav 1.0 | 16 | 24% | 85 |
| amz.NanoClone 1.41 | 11 | 16% | 19 |
| mld.Infinity 2.2 | 9 | 13% | 33 |
| arthord.MannyPacquiao Beta | 5 | 7% | 6 |
| jangs.ns51 1.0 | 3 | 4% | 6 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.6 | 112 / 210 | 2.48 | 18.4% | 32445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.4% | 112 |
| mld.DustBunny 3.8 | 2.3 | 14.3% | 29 |
| oog.melee.Mercutio 1.0 | 2.7 | 14.5% | 47 |
| maribo.melee.BMV 0.1 | 4.5 | 10.5% | 4 |
| zyx.nano.Ant 1.1 | 5.3 | 8.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.4% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.9% | 5 |
| fullsail.SweetTea 1.1 | 8.3 | 6.6% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.0 | 20 / 35 | 5632 |
| 2 | 1 | 69.0 | 87.6 | 18 / 35 | 5759 |
| 3 | 1 | 69.6 | 87.9 | 25 / 35 | 5554 |
| 4 | 1 | 67.0 | 79.4 | 17 / 35 | 5411 |
| 5 | 1 | 65.8 | 80.0 | 13 / 35 | 4891 |
| 6 | 1 | 67.3 | 80.6 | 19 / 35 | 5198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 59 | 78% |
| oog.melee.Mercutio 1.0 | 58 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 39% | 78 |
| mld.DustBunny 3.8 | 25 | 25% | 71 |
| zyx.nano.Ant 1.1 | 13 | 13% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 14 |
| maribo.melee.BMV 0.1 | 6 | 6% | 11 |
| fullsail.SweetTea 1.1 | 4 | 4% | 10 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 8 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 82.0 | 130 / 210 | 2.62 | 19.9% | 38471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.9% | 130 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 48 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.2% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.3% | 4 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 7.3 | 7.6% | 7 |
| sample.Fire 1.0 | 9.2 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 80.3 | 20 / 35 | 6480 |
| 2 | 1 | 70.8 | 82.5 | 22 / 35 | 6825 |
| 3 | 1 | 70.0 | 83.5 | 24 / 35 | 5996 |
| 4 | 1 | 70.4 | 83.5 | 21 / 35 | 6734 |
| 5 | 1 | 68.2 | 79.0 | 21 / 35 | 5792 |
| 6 | 1 | 70.5 | 82.9 | 22 / 35 | 6644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 83% |
| cb.nano.Insomnia 1.0 | 24 | 96% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 13 | 69% |
| fm.mammillarias 1.3 | 7 | 71% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 30% | 77 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 18% | 27 |
| fm.mammillarias 1.3 | 12 | 15% | 16 |
| cb.nano.Insomnia 1.0 | 10 | 13% | 20 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 20 |
| sample.Fire 1.0 | 5 | 6% | 11 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 28 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 8 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.7 | 144 / 210 | 2.20 | 20.9% | 41133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.9% | 144 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 9 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.6% | 16 |
| tj.zombie1n 1.0.1 | 4.5 | 9.3% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.1% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.3% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.2% | 0 |
| yk.JahMicro 1.0 | 7.2 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 82.5 | 24 / 35 | 7211 |
| 2 | 1 | 71.9 | 91.7 | 25 / 35 | 6997 |
| 3 | 1 | 71.4 | 88.9 | 28 / 35 | 6383 |
| 4 | 1 | 71.0 | 87.6 | 21 / 35 | 7111 |
| 5 | 1 | 68.7 | 82.9 | 20 / 35 | 6146 |
| 6 | 1 | 71.5 | 86.7 | 26 / 35 | 7285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 89% |
| stelo.SoJNanoMelee 1.1 | 31 | 77% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| tj.zombie1n 1.0.1 | 20 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 67% |
| yk.JahMicro 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 36% | 82 |
| stelo.SoJNanoMelee 1.1 | 14 | 21% | 27 |
| tj.zombie1n 1.0.1 | 10 | 15% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 26 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 6 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 65.3 | 68 / 210 | 4.12 | 15.4% | 30525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 15.4% | 68 |
| oog.melee.Corsair 1.0 | 2.7 | 12.3% | 36 |
| ahf.NanoAndrew .4 | 3.0 | 12.3% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.6% | 26 |
| EBBU.Sim2 1.02 | 4.8 | 10.4% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.9% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.3% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 9.2% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 63.8 | 10 / 35 | 5232 |
| 2 | 1 | 65.2 | 73.7 | 11 / 35 | 5520 |
| 3 | 1 | 64.9 | 67.6 | 16 / 35 | 5431 |
| 4 | 1 | 60.6 | 60.6 | 10 / 35 | 4570 |
| 5 | 1 | 62.6 | 66.0 | 10 / 35 | 4948 |
| 6 | 1 | 60.5 | 60.0 | 11 / 35 | 4824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 45% |
| simonton.nano.MeleeSeed 1.8 | 30 | 83% |
| ahf.NanoAndrew .4 | 21 | 67% |
| EBBU.Sim2 1.02 | 5 | 80% |
| sam.Samspin 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 25% | 57 |
| oog.melee.Corsair 1.0 | 25 | 17% | 40 |
| ahf.NanoAndrew .4 | 22 | 15% | 38 |
| robar.nano.Assertive_Melee 0.2 | 16 | 11% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 8% | 10 |
| EBBU.Sim2 1.02 | 10 | 7% | 12 |
| zyx.nano.BacillusComma 1.0 | 9 | 6% | 9 |
| sam.Samspin 1.0 | 8 | 6% | 14 |
| sample.TrackFire 1.0 | 7 | 5% | 8 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.2 | 126 / 210 | 2.42 | 18.6% | 30905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.6% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.3% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.1% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 7 |
| fm.claire 1.7 | 5.8 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 5 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 4 |
| pa.Improved 1.0 | 9.5 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.8 | 19 / 35 | 4905 |
| 2 | 1 | 67.4 | 80.3 | 23 / 35 | 5393 |
| 3 | 1 | 68.6 | 89.8 | 22 / 35 | 4980 |
| 4 | 1 | 66.7 | 80.6 | 17 / 35 | 5114 |
| 5 | 1 | 69.1 | 86.7 | 25 / 35 | 5045 |
| 6 | 1 | 68.3 | 83.8 | 20 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 80% |
| oog.melee.CapuletDroid 1.1 | 23 | 96% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| fm.claire 1.7 | 7 | 100% |
| sample.SpinBot 1.0 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 33% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 45% | 94 |
| arthord.NanoSatanMelee Beta | 14 | 16% | 24 |
| oog.melee.CapuletDroid 1.1 | 8 | 9% | 32 |
| gh.nano.Grofvuil 0.2 | 8 | 9% | 25 |
| kurios.DOSexe .9b | 7 | 8% | 12 |
| sample.SpinBot 1.0 | 4 | 5% | 6 |
| fm.claire 1.7 | 2 | 2% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.5 | 109 / 210 | 2.58 | 18.8% | 36392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.8% | 109 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 33 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 23 |
| mz.MicroGodMelee 1 | 3.7 | 13.2% | 37 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 2 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.0 | 6.7% | 5 |
| acogdev.alpha 0.2 | 7.7 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 0 |
| fire219.CatBot 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.4 | 15 / 35 | 5501 |
| 2 | 1 | 69.0 | 84.8 | 17 / 35 | 6073 |
| 3 | 1 | 68.8 | 84.1 | 21 / 35 | 5778 |
| 4 | 1 | 67.4 | 77.8 | 15 / 35 | 6291 |
| 5 | 1 | 69.8 | 83.5 | 20 / 35 | 6582 |
| 6 | 1 | 69.8 | 85.4 | 21 / 35 | 6167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 64 | 92% |
| gh.micro.Gruweltje 0.7 | 34 | 68% |
| mz.MicroGodMelee 1 | 34 | 56% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 35 | 35% | 56 |
| gh.micro.Gruweltje 0.7 | 23 | 23% | 49 |
| spinnercat.micro.Tyger 0.1 | 22 | 22% | 71 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 8 |
| acogdev.alpha 0.2 | 6 | 6% | 8 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 68.6 | 99 / 210 | 3.82 | 16.2% | 30519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.3 | 16.2% | 99 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 14.9% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 31 |
| germ.TheMind .2 | 4.7 | 10.0% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.8% | 5 |
| awesomeness.Elite 1.0 | 6.8 | 8.7% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 8 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 67.3 | 16 / 35 | 5197 |
| 2 | 1 | 66.2 | 75.2 | 20 / 35 | 5286 |
| 3 | 1 | 62.4 | 62.2 | 16 / 35 | 5025 |
| 4 | 1 | 63.9 | 68.6 | 15 / 35 | 4983 |
| 5 | 1 | 66.0 | 70.5 | 20 / 35 | 5495 |
| 6 | 2 | 63.0 | 67.9 | 12 / 35 | 4533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 84% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| germ.TheMind .2 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 50% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 13% | 30 |
| germ.TheMind .2 | 12 | 11% | 24 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 13 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 12 |
| awesomeness.Elite 1.0 | 6 | 5% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.5 | 149 / 210 | 2.12 | 20.3% | 33372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.3% | 149 |
| rz.HawkOnFire 0.1 | 2.2 | 14.1% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.8% | 5 |
| timmit.nano.TimDog 0.33 | 3.8 | 10.6% | 11 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.8% | 5 |
| stelo.PatternRobot 1.0 | 7.0 | 8.2% | 9 |
| ratosh.Wesco 1.4 | 7.5 | 8.3% | 2 |
| spinnercat.Omen 1.0 | 8.8 | 7.6% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 86.3 | 25 / 35 | 5525 |
| 2 | 1 | 70.9 | 87.6 | 24 / 35 | 5796 |
| 3 | 1 | 69.4 | 84.1 | 23 / 35 | 5288 |
| 4 | 1 | 70.6 | 88.3 | 27 / 35 | 5155 |
| 5 | 1 | 70.6 | 87.6 | 24 / 35 | 5643 |
| 6 | 1 | 72.0 | 91.1 | 26 / 35 | 5965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 93 | 92% |
| timmit.nano.TimDog 0.33 | 23 | 78% |
| nz.jdc.nano.GridFu 1.0 | 16 | 94% |
| stelo.PatternRobot 1.0 | 13 | 92% |
| maribo.IotaCT 1.1 | 8 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 28% | 85 |
| timmit.nano.TimDog 0.33 | 14 | 23% | 33 |
| stelo.PatternRobot 1.0 | 8 | 13% | 17 |
| ratosh.Wesco 1.4 | 7 | 11% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 28 |
| maribo.IotaCT 1.1 | 4 | 7% | 16 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.7 | 160 / 210 | 1.75 | 21.7% | 42016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.7% | 160 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.7% | 23 |
| baal.nano.N 1.42 | 3.2 | 11.0% | 9 |
| zyx.micro.Ant 1.1 | 4.8 | 9.1% | 8 |
| Grystrion.TrackerWO 1.0 | 5.3 | 9.4% | 0 |
| sanja.First 0.1 | 5.3 | 9.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 7.8% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 0 |
| cvt.Firsty 1.0 | 8.7 | 7.1% | 6 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 87.6 | 23 / 35 | 7084 |
| 2 | 1 | 72.3 | 94.9 | 29 / 35 | 6908 |
| 3 | 1 | 72.8 | 94.9 | 28 / 35 | 7404 |
| 4 | 1 | 72.3 | 94.3 | 30 / 35 | 6795 |
| 5 | 1 | 71.4 | 91.1 | 24 / 35 | 7192 |
| 6 | 1 | 70.5 | 87.3 | 26 / 35 | 6633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 51 | 84% |
| baal.nano.N 1.42 | 33 | 85% |
| sanja.First 0.1 | 26 | 100% |
| cvt.Firsty 1.0 | 22 | 95% |
| zyx.micro.Ant 1.1 | 18 | 78% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 29% | 32 |
| tvv.nano.Polaris 1.2 | 12 | 24% | 65 |
| baal.nano.N 1.42 | 11 | 22% | 36 |
| sanja.First 0.1 | 3 | 6% | 26 |
| Grystrion.TrackerWO 1.0 | 3 | 6% | 16 |
| cvt.Firsty 1.0 | 2 | 4% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 7 |
| sample.RamFire 1.0 | 2 | 4% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 7 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.9 | 81 / 210 | 3.53 | 16.1% | 32106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.3 | 16.1% | 81 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 66 |
| cs.Wren 1.0 | 3.3 | 12.6% | 26 |
| js.PinBall 1.6 | 4.0 | 11.3% | 11 |
| mz.Cork 0.1 | 4.7 | 10.6% | 9 |
| evd.X1 0.01 | 6.5 | 8.3% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 8.4% | 6 |
| jsal.Jsalbot 1.0 | 7.7 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 17 / 35 | 5620 |
| 2 | 2 | 62.4 | 64.8 | 10 / 35 | 5476 |
| 3 | 1 | 63.8 | 71.1 | 14 / 35 | 5062 |
| 4 | 1 | 61.9 | 67.0 | 11 / 35 | 4738 |
| 5 | 2 | 63.3 | 67.9 | 12 / 35 | 5217 |
| 6 | 1 | 67.8 | 81.6 | 17 / 35 | 5993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 56% |
| cs.Wren 1.0 | 24 | 79% |
| js.PinBall 1.6 | 14 | 79% |
| joe.ADinosaur 1.0 | 6 | 83% |
| mz.Cork 0.1 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 46% | 98 |
| cs.Wren 1.0 | 26 | 20% | 40 |
| js.PinBall 1.6 | 13 | 10% | 24 |
| evd.X1 0.01 | 12 | 9% | 12 |
| mz.Cork 0.1 | 6 | 5% | 13 |
| joe.ADinosaur 1.0 | 5 | 4% | 8 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.0 | 129 / 210 | 2.44 | 18.9% | 29824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.9% | 129 |
| myl.nano.Graviton 1.10 | 2.3 | 11.9% | 22 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.5% | 15 |
| ntc.Opposite 1.5 | 4.0 | 10.7% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.9% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 6 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 22 / 35 | 5097 |
| 2 | 1 | 68.4 | 87.0 | 22 / 35 | 4566 |
| 3 | 1 | 63.8 | 67.0 | 17 / 35 | 4755 |
| 4 | 1 | 67.8 | 81.0 | 19 / 35 | 5404 |
| 5 | 1 | 70.4 | 90.5 | 25 / 35 | 5332 |
| 6 | 1 | 69.1 | 89.5 | 24 / 35 | 4670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 89% |
| stelo.AreaTargetingBot 1.1 | 28 | 93% |
| disan.Chair 2.2.0 | 19 | 79% |
| ntc.Opposite 1.5 | 17 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| donjezza.Muncho 1.0 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| DBall.NUKE 0.1 | 10 | 90% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 16 | 20% | 26 |
| ntc.Opposite 1.5 | 16 | 20% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 17% | 24 |
| stelo.AreaTargetingBot 1.1 | 12 | 15% | 41 |
| myl.nano.Graviton 1.10 | 11 | 13% | 39 |
| disan.Chair 2.2.0 | 7 | 9% | 22 |
| DBall.NUKE 0.1 | 5 | 6% | 18 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 77.0 | 93 / 210 | 3.07 | 16.3% | 25436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.3% | 93 |
| oog.melee.Capulet 1.2 | 2.5 | 14.3% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 17 |
| kawigi.micro.Shiz 1.1 | 3.8 | 13.3% | 32 |
| yagami.Tidus 0.11 | 4.3 | 11.8% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.6 | 19 / 35 | 4110 |
| 2 | 1 | 64.3 | 72.4 | 16 / 35 | 4176 |
| 3 | 1 | 63.4 | 72.1 | 11 / 35 | 4074 |
| 4 | 1 | 65.4 | 74.6 | 13 / 35 | 4710 |
| 5 | 1 | 67.6 | 82.9 | 20 / 35 | 4309 |
| 6 | 1 | 65.2 | 78.4 | 14 / 35 | 4057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 83% |
| yagami.Tidus 0.11 | 19 | 95% |
| kawigi.micro.Shiz 1.1 | 16 | 88% |
| ejb.Polaris 1.0.1 | 9 | 78% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 42% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 17% | 50 |
| yagami.Tidus 0.11 | 14 | 12% | 31 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 24 |
| ejb.Polaris 1.0.1 | 7 | 6% | 13 |
| step.nanoPri 1.0 | 7 | 6% | 7 |
| kurios.DOSexe .9a | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 3 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.6 | 128 / 210 | 2.83 | 17.8% | 29012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.8% | 128 |
| wee.Gem 1.8.4 | 3.0 | 12.3% | 29 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 21 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 11 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 19 / 35 | 4916 |
| 2 | 1 | 66.1 | 78.4 | 19 / 35 | 4717 |
| 3 | 1 | 67.2 | 79.0 | 25 / 35 | 5096 |
| 4 | 1 | 69.0 | 85.1 | 25 / 35 | 5140 |
| 5 | 1 | 65.9 | 77.8 | 19 / 35 | 4557 |
| 6 | 1 | 65.9 | 78.4 | 21 / 35 | 4586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 94% |
| wee.Gem 1.8.4 | 30 | 100% |
| wompi.Quokka 1.6 | 20 | 90% |
| ratosh.Nobo 0.21 | 15 | 80% |
| m3thos.Eva00 1.1 | 7 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 16 | 19% | 30 |
| bayen.UbaMicro 1.4 | 15 | 18% | 19 |
| bzdp.Pansy 2.1 | 14 | 17% | 52 |
| ratosh.Nobo 0.21 | 12 | 14% | 25 |
| wee.Gem 1.8.4 | 7 | 8% | 43 |
| maribo.FollowFire 1 | 6 | 7% | 9 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 9 |
| m3thos.Eva00 1.1 | 4 | 5% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 90.2 | 126 / 210 | 1.88 | 22.3% | 50908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 22.3% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 23 |
| ayk.WallHugger 1.0 | 4.8 | 9.0% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.0% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 88.6 | 17 / 35 | 8243 |
| 2 | 1 | 74.8 | 94.3 | 28 / 35 | 8211 |
| 3 | 1 | 75.0 | 92.1 | 24 / 35 | 9173 |
| 4 | 1 | 71.7 | 83.5 | 16 / 35 | 8028 |
| 5 | 1 | 74.5 | 91.7 | 20 / 35 | 8806 |
| 6 | 1 | 73.8 | 91.1 | 21 / 35 | 8447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 79% |
| mz.NanoGod 2.02 | 20 | 70% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 84 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 48% | 134 |
| mz.NanoGod 2.02 | 31 | 37% | 46 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 14 |
| drd.Dreadknoght 0.9 | 3 | 4% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.2 | 112 / 210 | 3.23 | 17.2% | 29563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.2% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 30 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.9% | 20 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 2 |
| conscience.Electron 1.3g | 7.7 | 7.3% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.4 | 20 / 35 | 5085 |
| 2 | 1 | 66.5 | 77.8 | 20 / 35 | 4863 |
| 3 | 1 | 64.7 | 70.8 | 17 / 35 | 4891 |
| 4 | 1 | 67.3 | 80.3 | 21 / 35 | 5105 |
| 5 | 1 | 64.4 | 73.0 | 16 / 35 | 4678 |
| 6 | 1 | 65.2 | 70.8 | 18 / 35 | 4941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 91% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 79% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 21% | 61 |
| dummy.micro.Sparrow 2.5 | 21 | 21% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 26 |
| conscience.Electron 1.3g | 9 | 9% | 11 |
| bvh.micro.Freya 0.3 | 8 | 8% | 24 |
| dl.BetterWalls 1.0 | 8 | 8% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 16 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.0 | 145 / 210 | 2.17 | 21.6% | 44438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.6% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 23 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.0% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.9% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.3% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 2 |
| sample.Corners 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 88.3 | 25 / 35 | 7676 |
| 2 | 1 | 72.3 | 89.5 | 24 / 35 | 7469 |
| 3 | 1 | 70.9 | 85.1 | 24 / 35 | 6896 |
| 4 | 1 | 71.9 | 85.1 | 25 / 35 | 7346 |
| 5 | 1 | 71.9 | 87.0 | 23 / 35 | 7768 |
| 6 | 1 | 71.7 | 87.0 | 24 / 35 | 7283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 45 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 83% |
| supersample.SuperBoxBot 1.0 | 32 | 75% |
| dsw.StaticD 1.0 | 13 | 85% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 35% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 31% | 55 |
| sul.Lunar 1.1 | 7 | 11% | 48 |
| dsw.StaticD 1.0 | 6 | 9% | 15 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 20 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |
| sample.Corners 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.1 | 114 / 210 | 2.52 | 19.2% | 39655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.2% | 114 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 34 |
| mld.Wisdom 1.0 | 3.5 | 11.8% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.4% | 19 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.9% | 9 |
| amz.NanoClone 1.41 | 6.0 | 9.3% | 5 |
| GarmBox.Oranges 1.0 | 7.5 | 7.3% | 1 |
| sample.Walls 1.0 | 7.8 | 6.9% | 6 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 83.5 | 20 / 35 | 6862 |
| 2 | 1 | 67.3 | 77.5 | 17 / 35 | 6233 |
| 3 | 1 | 68.6 | 83.8 | 19 / 35 | 6419 |
| 4 | 1 | 69.1 | 83.5 | 18 / 35 | 6940 |
| 5 | 1 | 69.3 | 85.4 | 19 / 35 | 6564 |
| 6 | 1 | 69.4 | 85.1 | 21 / 35 | 6637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 92% |
| mld.Wisdom 1.0 | 23 | 65% |
| KiraNL.Chupacabra 0.4 | 18 | 89% |
| jangs.ns51 1.0 | 9 | 89% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Walls 1.0 | 6 | 83% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 30% | 57 |
| mld.Wisdom 1.0 | 27 | 28% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 14% | 46 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 23 |
| GarmBox.Oranges 1.0 | 6 | 6% | 10 |
| amz.NanoClone 1.41 | 5 | 5% | 10 |
| sample.Walls 1.0 | 3 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 2% | 11 |

