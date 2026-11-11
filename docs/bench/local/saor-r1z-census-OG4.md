# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.7 | 149 / 210 | 2.02 | 21.4% | 42420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.4% | 149 |
| mz.AntiGrav 1.0 | 2.8 | 13.8% | 14 |
| radnor.DoctorBob 1.42 | 3.0 | 14.0% | 17 |
| mld.Infinity 2.2 | 3.2 | 14.1% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 5 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 1 |
| sample.Walls 1.0 | 7.0 | 6.2% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 3.8% | 0 |
| sample.Target 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.8 | 26 / 35 | 6993 |
| 2 | 1 | 72.1 | 89.8 | 23 / 35 | 6577 |
| 3 | 1 | 74.4 | 95.6 | 28 / 35 | 7722 |
| 4 | 1 | 69.2 | 74.6 | 19 / 35 | 6614 |
| 5 | 1 | 73.2 | 92.1 | 27 / 35 | 7468 |
| 6 | 1 | 72.8 | 90.2 | 26 / 35 | 7046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 92% |
| mld.Infinity 2.2 | 54 | 89% |
| radnor.DoctorBob 1.42 | 39 | 79% |
| amz.NanoClone 1.41 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 39% | 69 |
| mz.AntiGrav 1.0 | 17 | 28% | 86 |
| mld.Infinity 2.2 | 11 | 18% | 14 |
| amz.NanoClone 1.41 | 5 | 8% | 20 |
| jangs.ns51 1.0 | 3 | 5% | 9 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 7 |
| sample.Walls 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.1 | 152 / 210 | 1.89 | 19.5% | 31263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.5% | 152 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.5% | 41 |
| mld.DustBunny 3.8 | 3.7 | 12.0% | 9 |
| maribo.melee.BMV 0.1 | 4.7 | 10.1% | 1 |
| zyx.nano.Ant 1.1 | 5.3 | 8.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 7.8% | 4 |
| bzdp.BoxCar 2.0 | 8.3 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 25 / 35 | 4770 |
| 2 | 1 | 70.7 | 93.3 | 27 / 35 | 5716 |
| 3 | 1 | 68.2 | 87.0 | 23 / 35 | 5118 |
| 4 | 1 | 70.9 | 94.6 | 27 / 35 | 5509 |
| 5 | 1 | 66.4 | 80.6 | 20 / 35 | 4709 |
| 6 | 1 | 71.5 | 95.6 | 30 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 108 | 80% |
| mld.DustBunny 3.8 | 36 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 100% |
| zyx.nano.Ant 1.1 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 48% | 115 |
| mld.DustBunny 3.8 | 13 | 22% | 44 |
| zyx.nano.Ant 1.1 | 4 | 7% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 5% | 9 |
| maribo.melee.BMV 0.1 | 3 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 5% | 4 |
| bzdp.BoxCar 2.0 | 2 | 3% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 2% | 17 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 79.4 | 120 / 210 | 2.86 | 18.8% | 34510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.8% | 120 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 48 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.4% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.8% | 10 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.5% | 12 |
| fm.mammillarias 1.3 | 5.8 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.1% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 72.1 | 17 / 35 | 5529 |
| 2 | 1 | 68.8 | 80.0 | 21 / 35 | 5881 |
| 3 | 1 | 69.2 | 81.0 | 20 / 35 | 5987 |
| 4 | 1 | 70.0 | 88.9 | 24 / 35 | 5542 |
| 5 | 1 | 69.6 | 81.6 | 19 / 35 | 6316 |
| 6 | 1 | 66.6 | 72.7 | 19 / 35 | 5255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 90% |
| cb.nano.Insomnia 1.0 | 24 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 83% |
| myl.nano.KomoriNinja 1.1 | 23 | 91% |
| fm.mammillarias 1.3 | 10 | 90% |
| sp.Nanos.Ember 1.1 | 7 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 27 | 30% | 76 |
| cb.nano.Insomnia 1.0 | 21 | 23% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 16% | 30 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 35 |
| fm.mammillarias 1.3 | 7 | 8% | 15 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 13 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 10 |
| sample.Fire 1.0 | 4 | 4% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.6 | 153 / 210 | 2.11 | 20.6% | 37959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.6% | 153 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.6% | 21 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.6% | 2 |
| tj.zombie1n 1.0.1 | 6.0 | 8.6% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.3% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.2% | 12 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.2 | 28 / 35 | 6881 |
| 2 | 1 | 71.1 | 90.2 | 27 / 35 | 6550 |
| 3 | 1 | 69.5 | 82.2 | 25 / 35 | 6150 |
| 4 | 1 | 68.4 | 81.9 | 20 / 35 | 5827 |
| 5 | 1 | 70.2 | 85.7 | 25 / 35 | 6476 |
| 6 | 1 | 70.8 | 89.5 | 28 / 35 | 6075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 77 | 86% |
| tvv.micro.Antares 1.1.1 | 24 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 100% |
| stelo.SoJNanoMelee 1.1 | 22 | 73% |
| tj.zombie1n 1.0.1 | 12 | 75% |
| yk.JahMicro 1.0 | 10 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 67% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 39% | 93 |
| stelo.SoJNanoMelee 1.1 | 11 | 19% | 28 |
| tj.zombie1n 1.0.1 | 8 | 14% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 14% | 12 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 23 |
| yk.JahMicro 1.0 | 2 | 4% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 23 |

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 66.7 | 100 / 210 | 4.00 | 15.7% | 28736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 15.7% | 100 |
| oog.melee.Corsair 1.0 | 2.5 | 12.5% | 28 |
| ahf.NanoAndrew .4 | 2.8 | 12.0% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.6% | 14 |
| sam.Samspin 1.0 | 5.3 | 9.8% | 14 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.2% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.8% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 66.3 | 16 / 35 | 5011 |
| 2 | 1 | 62.7 | 66.0 | 15 / 35 | 4991 |
| 3 | 1 | 60.6 | 60.0 | 15 / 35 | 4456 |
| 4 | 1 | 63.9 | 68.6 | 16 / 35 | 4879 |
| 5 | 1 | 63.9 | 67.9 | 18 / 35 | 4590 |
| 6 | 1 | 64.5 | 71.1 | 20 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 86% |
| oog.melee.Corsair 1.0 | 28 | 93% |
| ahf.NanoAndrew .4 | 15 | 100% |
| sam.Samspin 1.0 | 10 | 90% |
| EBBU.Sim2 1.02 | 10 | 90% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 337. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 28% | 57 |
| robar.nano.Assertive_Melee 0.2 | 21 | 19% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 13% | 16 |
| zyx.nano.BacillusComma 1.0 | 12 | 11% | 16 |
| EBBU.Sim2 1.02 | 10 | 9% | 19 |
| oog.melee.Corsair 1.0 | 9 | 8% | 35 |
| ahf.NanoAndrew .4 | 7 | 6% | 23 |
| sam.Samspin 1.0 | 4 | 4% | 9 |
| sample.TrackFire 1.0 | 4 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.3 | 147 / 210 | 1.97 | 19.9% | 32284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.9% | 147 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.5% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.5% | 4 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.7% | 3 |
| fm.claire 1.7 | 6.2 | 8.5% | 3 |
| pa.Improved 1.0 | 8.2 | 6.3% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.2% | 0 |
| sample.SpinBot 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 25 / 35 | 5192 |
| 2 | 1 | 69.3 | 89.2 | 23 / 35 | 5130 |
| 3 | 1 | 69.4 | 83.8 | 22 / 35 | 5668 |
| 4 | 1 | 71.1 | 94.6 | 27 / 35 | 5512 |
| 5 | 1 | 71.2 | 95.9 | 28 / 35 | 5406 |
| 6 | 1 | 68.6 | 84.1 | 22 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 83% |
| oog.melee.CapuletDroid 1.1 | 28 | 79% |
| gh.nano.Grofvuil 0.2 | 27 | 96% |
| winamp32.micro.MicroMacro 1.0 | 11 | 91% |
| arthord.NanoSatanMelee Beta | 11 | 91% |
| fm.claire 1.7 | 6 | 67% |
| kurios.DOSexe .9b | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 40% | 104 |
| oog.melee.CapuletDroid 1.1 | 11 | 17% | 14 |
| gh.nano.Grofvuil 0.2 | 5 | 8% | 36 |
| fm.claire 1.7 | 5 | 8% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 8% | 8 |
| kurios.DOSexe .9b | 4 | 6% | 9 |
| sample.SpinBot 1.0 | 4 | 6% | 5 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 17 |
| pa.Improved 1.0 | 2 | 3% | 4 |

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.7 | 103 / 210 | 2.73 | 17.7% | 31063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.7% | 103 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.5% | 36 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.9% | 42 |
| mz.MicroGodMelee 1 | 4.0 | 13.3% | 17 |
| caimano.Furia_Ceca 0.22 | 5.3 | 7.9% | 4 |
| DBall.Anarchy 0.1 | 5.7 | 8.1% | 3 |
| el.JumpShoot 0.2 | 7.3 | 6.5% | 1 |
| acogdev.alpha 0.2 | 8.3 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 4 |
| fire219.CatBot 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.9 | 17 / 35 | 5362 |
| 2 | 1 | 70.0 | 90.8 | 20 / 35 | 5524 |
| 3 | 1 | 66.8 | 78.1 | 18 / 35 | 5150 |
| 4 | 1 | 67.2 | 81.3 | 17 / 35 | 5020 |
| 5 | 1 | 66.8 | 78.7 | 16 / 35 | 5098 |
| 6 | 1 | 65.0 | 73.7 | 15 / 35 | 4909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 57% |
| mz.MicroGodMelee 1 | 42 | 83% |
| gh.micro.Gruweltje 0.7 | 38 | 76% |
| caimano.Furia_Ceca 0.22 | 4 | 50% |
| DBall.Anarchy 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 41 | 38% | 71 |
| gh.micro.Gruweltje 0.7 | 25 | 23% | 61 |
| mz.MicroGodMelee 1 | 18 | 17% | 48 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 10 |
| DBall.Anarchy 0.1 | 7 | 7% | 8 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.6 | 104 / 210 | 3.56 | 16.4% | 30206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 16.4% | 104 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.1% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 32 |
| germ.TheMind .2 | 4.8 | 9.6% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 6.7 | 8.1% | 5 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 8 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 70.2 | 16 / 35 | 5399 |
| 2 | 1 | 66.9 | 80.3 | 19 / 35 | 5057 |
| 3 | 1 | 64.5 | 69.5 | 18 / 35 | 4945 |
| 4 | 1 | 64.1 | 71.1 | 18 / 35 | 4719 |
| 5 | 1 | 64.4 | 70.2 | 15 / 35 | 5250 |
| 6 | 2 | 64.2 | 68.3 | 18 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 60% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| germ.TheMind .2 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 49% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 39 |
| germ.TheMind .2 | 13 | 12% | 26 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 10 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 12 |
| awesomeness.Elite 1.0 | 3 | 3% | 8 |
| sample.Crazy 1.0 | 2 | 2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 44 over 6 battles (7.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.8 | 149 / 210 | 2.10 | 20.0% | 31403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.0% | 149 |
| rz.HawkOnFire 0.1 | 2.3 | 13.6% | 12 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.1% | 18 |
| maribo.IotaCT 1.1 | 3.8 | 10.5% | 11 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.5% | 7 |
| ratosh.Wesco 1.4 | 6.8 | 8.6% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 7.9% | 1 |
| stelo.PatternRobot 1.0 | 7.5 | 8.0% | 6 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 80.0 | 22 / 35 | 5111 |
| 2 | 1 | 70.3 | 88.3 | 24 / 35 | 5092 |
| 3 | 1 | 72.3 | 93.3 | 28 / 35 | 5700 |
| 4 | 1 | 71.3 | 90.8 | 27 / 35 | 5618 |
| 5 | 1 | 71.7 | 93.7 | 27 / 35 | 5265 |
| 6 | 1 | 68.0 | 80.6 | 21 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 100% |
| nz.jdc.nano.GridFu 1.0 | 40 | 90% |
| maribo.IotaCT 1.1 | 14 | 57% |
| ratosh.Wesco 1.4 | 13 | 85% |
| stelo.PatternRobot 1.0 | 11 | 73% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 21% | 72 |
| nz.jdc.nano.GridFu 1.0 | 12 | 20% | 52 |
| maribo.IotaCT 1.1 | 11 | 18% | 27 |
| stelo.PatternRobot 1.0 | 8 | 13% | 18 |
| ratosh.Wesco 1.4 | 6 | 10% | 18 |
| timmit.nano.TimDog 0.33 | 5 | 8% | 14 |
| spinnercat.Omen 1.0 | 2 | 3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 2 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.5 | 172 / 210 | 1.86 | 21.6% | 39891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.6% | 172 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.9% | 5 |
| sanja.First 0.1 | 5.7 | 9.0% | 3 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.3 | 6.6% | 6 |
| sample.RamFire 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.0 | 26 / 35 | 6233 |
| 2 | 1 | 71.4 | 88.9 | 29 / 35 | 6665 |
| 3 | 1 | 72.2 | 93.0 | 31 / 35 | 6659 |
| 4 | 1 | 71.7 | 89.8 | 28 / 35 | 6749 |
| 5 | 1 | 72.0 | 90.5 | 29 / 35 | 6841 |
| 6 | 1 | 72.1 | 93.7 | 29 / 35 | 6744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 100% |
| tvv.nano.Polaris 1.2 | 36 | 92% |
| cvt.Firsty 1.0 | 23 | 83% |
| zyx.micro.Ant 1.1 | 21 | 95% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 19 | 100% |
| sanja.First 0.1 | 19 | 95% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 18% | 45 |
| cvt.Firsty 1.0 | 7 | 18% | 26 |
| sample.RamFire 1.0 | 7 | 18% | 8 |
| sanja.First 0.1 | 6 | 16% | 30 |
| tvv.nano.Polaris 1.2 | 4 | 11% | 44 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 19 |
| baal.nano.N 1.42 | 2 | 5% | 26 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 66.1 | 72 / 210 | 4.05 | 14.8% | 29581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.5% | 84 |
| hadur117.micro.SaorOG4 0.1 | 1.7 | 14.8% | 72 |
| cs.Wren 1.0 | 3.2 | 12.6% | 15 |
| js.PinBall 1.6 | 4.5 | 11.1% | 16 |
| mz.Cork 0.1 | 4.5 | 10.7% | 7 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 7 |
| evd.X1 0.01 | 6.8 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.5 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 8.7 | 6.0% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 66.0 | 13 / 35 | 4831 |
| 2 | 2 | 60.4 | 60.3 | 12 / 35 | 4743 |
| 3 | 2 | 61.1 | 64.1 | 10 / 35 | 4816 |
| 4 | 2 | 61.6 | 65.7 | 9 / 35 | 5022 |
| 5 | 1 | 66.4 | 77.8 | 15 / 35 | 5621 |
| 6 | 1 | 60.9 | 62.9 | 13 / 35 | 4548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 37% |
| cs.Wren 1.0 | 26 | 96% |
| js.PinBall 1.6 | 11 | 91% |
| mz.Cork 0.1 | 6 | 100% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 80 | 58% | 109 |
| evd.X1 0.01 | 16 | 12% | 18 |
| joe.ADinosaur 1.0 | 10 | 7% | 12 |
| cs.Wren 1.0 | 9 | 6% | 32 |
| mz.Cork 0.1 | 8 | 6% | 10 |
| js.PinBall 1.6 | 7 | 5% | 14 |
| PSW.Relentless 0.1 | 7 | 5% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.4 | 125 / 210 | 2.59 | 18.6% | 28720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.6% | 125 |
| myl.nano.Graviton 1.10 | 2.3 | 12.5% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.4% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 22 |
| ntc.Opposite 1.5 | 4.3 | 11.0% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.7% | 4 |
| disan.Chair 2.2.0 | 7.5 | 7.8% | 7 |
| DBall.NUKE 0.1 | 7.8 | 7.1% | 10 |
| donjezza.Muncho 1.0 | 8.7 | 6.2% | 6 |
| pbg.R2D2 1.0 | 10.0 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 24 / 35 | 5040 |
| 2 | 1 | 68.7 | 87.9 | 22 / 35 | 4749 |
| 3 | 1 | 66.8 | 78.4 | 17 / 35 | 4779 |
| 4 | 1 | 65.6 | 75.9 | 16 / 35 | 4616 |
| 5 | 1 | 66.8 | 78.1 | 20 / 35 | 4608 |
| 6 | 1 | 69.1 | 85.4 | 26 / 35 | 4928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 49 | 92% |
| stelo.AreaTargetingBot 1.1 | 30 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 100% |
| ntc.Opposite 1.5 | 16 | 88% |
| disan.Chair 2.2.0 | 10 | 90% |
| DBall.NUKE 0.1 | 9 | 67% |
| donjezza.Muncho 1.0 | 8 | 63% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 26 | 30% | 49 |
| myl.nano.Graviton 1.10 | 14 | 16% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 14% | 28 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 17 |
| ntc.Opposite 1.5 | 10 | 12% | 24 |
| donjezza.Muncho 1.0 | 4 | 5% | 12 |
| DBall.NUKE 0.1 | 4 | 5% | 10 |
| disan.Chair 2.2.0 | 3 | 3% | 9 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.6 | 91 / 210 | 3.38 | 15.7% | 23757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 15.7% | 91 |
| oog.melee.Capulet 1.2 | 2.2 | 14.4% | 40 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 43 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.5% | 18 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 7 |
| step.nanoPri 1.0 | 7.5 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.2 | 15 / 35 | 4082 |
| 2 | 2 | 61.9 | 66.7 | 13 / 35 | 3875 |
| 3 | 1 | 64.9 | 76.8 | 15 / 35 | 3766 |
| 4 | 1 | 65.5 | 78.4 | 16 / 35 | 3914 |
| 5 | 1 | 63.2 | 67.0 | 15 / 35 | 3875 |
| 6 | 1 | 66.2 | 76.5 | 17 / 35 | 4245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 96% |
| kawigi.micro.Shiz 1.1 | 22 | 82% |
| yagami.Tidus 0.11 | 16 | 75% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 38% | 66 |
| yagami.Tidus 0.11 | 22 | 18% | 36 |
| kawigi.micro.Shiz 1.1 | 17 | 14% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 11% | 45 |
| ejb.Polaris 1.0.1 | 12 | 10% | 19 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.2 | 135 / 210 | 2.87 | 17.6% | 26855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.6% | 135 |
| bzdp.Pansy 2.1 | 2.3 | 12.2% | 11 |
| wee.Gem 1.8.4 | 3.7 | 11.6% | 28 |
| wompi.Quokka 1.6 | 3.8 | 11.1% | 17 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 10.0% | 4 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.6% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.4 | 22 / 35 | 4301 |
| 2 | 1 | 66.2 | 79.0 | 22 / 35 | 4614 |
| 3 | 1 | 68.3 | 86.7 | 27 / 35 | 4533 |
| 4 | 1 | 66.2 | 80.0 | 22 / 35 | 4349 |
| 5 | 1 | 63.5 | 68.9 | 19 / 35 | 4020 |
| 6 | 1 | 68.1 | 82.2 | 23 / 35 | 5038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 97% |
| wee.Gem 1.8.4 | 25 | 88% |
| wompi.Quokka 1.6 | 19 | 89% |
| ratosh.Nobo 0.21 | 16 | 94% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 0% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 12 | 16% | 24 |
| bzdp.Pansy 2.1 | 11 | 14% | 63 |
| wee.Gem 1.8.4 | 11 | 14% | 38 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 13% | 14 |
| ratosh.Nobo 0.21 | 8 | 10% | 21 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 13 |
| bayen.UbaMicro 1.4 | 6 | 8% | 10 |
| maribo.FollowFire 1 | 6 | 8% | 8 |
| m3thos.Eva00 1.1 | 5 | 6% | 16 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 83.1 | 51 / 210 | 2.52 | 20.0% | 49343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 20.7% | 140 |
| hadur117.micro.SaorOG4 0.1 | 1.7 | 20.0% | 51 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 14 |
| ayk.WallHugger 1.0 | 4.8 | 9.0% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.4% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 79.7 | 9 / 35 | 8156 |
| 2 | 2 | 71.3 | 82.5 | 8 / 35 | 8066 |
| 3 | 2 | 71.4 | 81.0 | 6 / 35 | 8705 |
| 4 | 2 | 71.3 | 81.0 | 11 / 35 | 8299 |
| 5 | 2 | 71.6 | 87.0 | 6 / 35 | 8031 |
| 6 | 1 | 72.5 | 87.6 | 11 / 35 | 8086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 133 | 21% |
| mz.NanoGod 2.02 | 16 | 69% |
| exauge.GateKeeper 1.1.121g | 6 | 83% |
| ayk.WallHugger 1.0 | 4 | 75% |
| stuff.Vlad 0.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 123 | 77% | 156 |
| mz.NanoGod 2.02 | 21 | 13% | 33 |
| exauge.GateKeeper 1.1.121g | 9 | 6% | 12 |
| ayk.WallHugger 1.0 | 4 | 3% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.8 | 100 / 210 | 3.81 | 15.7% | 26668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 15.7% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 14.0% | 34 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 22 |
| bvh.micro.Freya 0.3 | 4.3 | 11.3% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.3% | 23 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 4 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 3 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 8.8 | 6.2% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 72.1 | 16 / 35 | 4956 |
| 2 | 1 | 63.2 | 69.5 | 17 / 35 | 4268 |
| 3 | 1 | 60.4 | 59.4 | 14 / 35 | 4204 |
| 4 | 1 | 64.9 | 74.3 | 19 / 35 | 4335 |
| 5 | 1 | 61.6 | 64.4 | 15 / 35 | 4065 |
| 6 | 1 | 65.8 | 73.0 | 19 / 35 | 4840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 76% |
| bvh.micro.Freya 0.3 | 22 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 89% |
| dummy.micro.Sparrow 2.5 | 19 | 89% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 59 |
| mn.nano.perceptual.Impact 1.3.0 | 22 | 20% | 22 |
| dummy.micro.Sparrow 2.5 | 16 | 15% | 30 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 38 |
| conscience.Electron 1.3g | 11 | 10% | 14 |
| stelo.MirrorMicro 1.0 | 10 | 9% | 18 |
| bvh.micro.Freya 0.3 | 9 | 8% | 16 |
| dl.BetterWalls 1.0 | 6 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 86.1 | 143 / 210 | 2.25 | 21.3% | 42466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.3% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 29 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.2% | 15 |
| sul.Lunar 1.1 | 3.7 | 11.5% | 11 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 3 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.6% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 3 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 81.0 | 23 / 35 | 7063 |
| 2 | 1 | 72.7 | 89.2 | 27 / 35 | 7271 |
| 3 | 1 | 70.9 | 83.2 | 24 / 35 | 6670 |
| 4 | 1 | 73.2 | 92.1 | 25 / 35 | 7422 |
| 5 | 1 | 70.6 | 83.5 | 20 / 35 | 7110 |
| 6 | 1 | 71.9 | 87.9 | 24 / 35 | 6930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 60 | 85% |
| sul.Lunar 1.1 | 35 | 94% |
| supersample.SuperBoxBot 1.0 | 26 | 81% |
| dsw.StaticD 1.0 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 29% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 24% | 59 |
| sul.Lunar 1.1 | 9 | 13% | 41 |
| mme.NikeEnhanced 2.0 | 9 | 13% | 17 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 7 |
| dsw.StaticD 1.0 | 3 | 4% | 25 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 10 |
| sample.Corners 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 77.3 | 101 / 210 | 3.04 | 18.0% | 38351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.0% | 101 |
| radnor.DoctorBob 1.42 | 2.2 | 13.6% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.7% | 19 |
| mld.Wisdom 1.0 | 4.3 | 11.5% | 16 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.6% | 14 |
| amz.NanoClone 1.41 | 5.2 | 10.8% | 11 |
| GarmBox.Oranges 1.0 | 7.5 | 6.9% | 1 |
| sample.Walls 1.0 | 7.7 | 6.9% | 7 |
| jangs.ns51 1.0 | 8.8 | 5.7% | 2 |
| sample.Target 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.8 | 21 / 35 | 6214 |
| 2 | 1 | 67.4 | 75.6 | 15 / 35 | 6381 |
| 3 | 1 | 64.7 | 71.4 | 13 / 35 | 5821 |
| 4 | 1 | 65.6 | 71.7 | 18 / 35 | 5644 |
| 5 | 1 | 69.0 | 80.0 | 18 / 35 | 7238 |
| 6 | 1 | 68.9 | 81.3 | 16 / 35 | 7053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 96% |
| radnor.DoctorBob 1.42 | 30 | 53% |
| mld.Wisdom 1.0 | 16 | 81% |
| amz.NanoClone 1.41 | 14 | 64% |
| KiraNL.Chupacabra 0.4 | 12 | 58% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 26% | 49 |
| mld.Wisdom 1.0 | 24 | 22% | 35 |
| KiraNL.Chupacabra 0.4 | 21 | 19% | 31 |
| amz.NanoClone 1.41 | 16 | 15% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 10% | 60 |
| jangs.ns51 1.0 | 4 | 4% | 7 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| sample.Walls 1.0 | 1 | 1% | 3 |

