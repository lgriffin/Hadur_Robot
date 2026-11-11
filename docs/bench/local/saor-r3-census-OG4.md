# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 63 over 6 battles (10.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.9 | 141 / 210 | 2.18 | 21.1% | 42511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.1% | 141 |
| radnor.DoctorBob 1.42 | 2.8 | 14.1% | 24 |
| mz.AntiGrav 1.0 | 3.2 | 13.7% | 12 |
| mld.Infinity 2.2 | 3.2 | 13.6% | 23 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 4 |
| GarmBox.Oranges 1.0 | 6.3 | 6.7% | 1 |
| sample.Walls 1.0 | 7.3 | 6.3% | 3 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.5 | 24 / 35 | 7176 |
| 2 | 1 | 72.6 | 87.6 | 27 / 35 | 7170 |
| 3 | 1 | 72.5 | 91.4 | 25 / 35 | 7147 |
| 4 | 1 | 71.9 | 84.8 | 24 / 35 | 7443 |
| 5 | 1 | 71.1 | 83.2 | 20 / 35 | 6876 |
| 6 | 1 | 70.9 | 85.1 | 21 / 35 | 6699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 57 | 82% |
| mz.AntiGrav 1.0 | 49 | 98% |
| radnor.DoctorBob 1.42 | 42 | 74% |
| jangs.ns51 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 49% | 92 |
| mz.AntiGrav 1.0 | 14 | 20% | 78 |
| mld.Infinity 2.2 | 13 | 19% | 15 |
| amz.NanoClone 1.41 | 5 | 7% | 8 |
| sample.Walls 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.8 | 155 / 210 | 2.10 | 19.3% | 30363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.3% | 155 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.3% | 31 |
| mld.DustBunny 3.8 | 2.5 | 13.8% | 8 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 3 |
| zyx.nano.Ant 1.1 | 5.3 | 8.9% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.7% | 5 |
| fullsail.SweetTea 1.1 | 7.3 | 7.0% | 1 |
| bzdp.BoxCar 2.0 | 8.8 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.0 | 30 / 35 | 5252 |
| 2 | 1 | 70.0 | 89.8 | 25 / 35 | 5259 |
| 3 | 1 | 69.8 | 94.0 | 27 / 35 | 4668 |
| 4 | 1 | 68.8 | 85.4 | 27 / 35 | 4880 |
| 5 | 1 | 69.5 | 93.3 | 27 / 35 | 4640 |
| 6 | 1 | 66.5 | 71.1 | 19 / 35 | 5664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 86 | 93% |
| mld.DustBunny 3.8 | 55 | 95% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 0% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 13 | 24% | 59 |
| oog.melee.Mercutio 1.0 | 12 | 22% | 96 |
| zyx.nano.Ant 1.1 | 8 | 15% | 9 |
| fullsail.SweetTea 1.1 | 7 | 13% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 10 |
| maribo.melee.BMV 0.1 | 4 | 7% | 10 |
| cs.Grudge 1.0 | 3 | 5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 4% | 6 |
| bzdp.BoxCar 2.0 | 1 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.8 | 140 / 210 | 2.28 | 20.4% | 38054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.4% | 140 |
| myl.micro.Troodon 1.10 | 2.3 | 13.5% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.1% | 20 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.7% | 7 |
| fm.mammillarias 1.3 | 6.2 | 8.6% | 1 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.8% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.2% | 2 |
| sample.Fire 1.0 | 9.5 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.4 | 28 / 35 | 6923 |
| 2 | 1 | 71.1 | 91.1 | 25 / 35 | 6280 |
| 3 | 1 | 67.5 | 77.1 | 18 / 35 | 5470 |
| 4 | 1 | 71.1 | 86.3 | 26 / 35 | 6787 |
| 5 | 1 | 69.8 | 86.3 | 22 / 35 | 5524 |
| 6 | 1 | 70.5 | 81.6 | 21 / 35 | 7070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 79% |
| cb.nano.Insomnia 1.0 | 32 | 94% |
| myl.nano.KomoriNinja 1.1 | 20 | 85% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 37% | 45 |
| cb.nano.Insomnia 1.0 | 14 | 20% | 15 |
| myl.nano.KomoriNinja 1.1 | 10 | 14% | 36 |
| myl.micro.Troodon 1.10 | 9 | 13% | 66 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 18 |
| fm.mammillarias 1.3 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 18 |
| sample.Fire 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 45 over 6 battles (7.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.2 | 139 / 210 | 2.60 | 19.7% | 37529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.7% | 139 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.7% | 20 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 18 |
| tj.zombie1n 1.0.1 | 4.5 | 9.3% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 8.9% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 5 |
| yk.JahMicro 1.0 | 6.7 | 8.3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.2 | 8.0% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.6 | 23 / 35 | 6142 |
| 2 | 1 | 70.9 | 88.9 | 24 / 35 | 6475 |
| 3 | 1 | 67.4 | 74.3 | 23 / 35 | 5839 |
| 4 | 1 | 70.7 | 85.7 | 25 / 35 | 6550 |
| 5 | 1 | 69.2 | 84.1 | 23 / 35 | 6236 |
| 6 | 1 | 68.9 | 79.4 | 21 / 35 | 6287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 76 | 88% |
| stelo.SoJNanoMelee 1.1 | 28 | 86% |
| tvv.micro.Antares 1.1.1 | 24 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| tj.zombie1n 1.0.1 | 8 | 75% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 45% | 103 |
| stelo.SoJNanoMelee 1.1 | 13 | 18% | 31 |
| tvv.micro.Antares 1.1.1 | 9 | 13% | 27 |
| yk.JahMicro 1.0 | 6 | 8% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 8 |
| tj.zombie1n 1.0.1 | 5 | 7% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.6 | 111 / 210 | 3.56 | 16.7% | 30120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.7% | 111 |
| oog.melee.Corsair 1.0 | 2.3 | 13.1% | 27 |
| ahf.NanoAndrew .4 | 3.3 | 11.2% | 19 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 10.9% | 18 |
| sam.Samspin 1.0 | 5.2 | 10.2% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.1% | 8 |
| EBBU.Sim2 1.02 | 6.5 | 9.3% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.1% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 74.6 | 21 / 35 | 5405 |
| 2 | 1 | 67.3 | 78.4 | 20 / 35 | 5414 |
| 3 | 1 | 60.6 | 61.6 | 12 / 35 | 4484 |
| 4 | 1 | 66.8 | 75.9 | 23 / 35 | 5310 |
| 5 | 1 | 65.5 | 73.3 | 20 / 35 | 4806 |
| 6 | 1 | 62.5 | 65.7 | 15 / 35 | 4701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 41 | 88% |
| oog.melee.Corsair 1.0 | 39 | 90% |
| ahf.NanoAndrew .4 | 20 | 95% |
| robar.nano.Assertive_Melee 0.2 | 10 | 80% |
| EBBU.Sim2 1.02 | 8 | 75% |
| sam.Samspin 1.0 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 371. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 22% | 52 |
| robar.nano.Assertive_Melee 0.2 | 17 | 17% | 28 |
| EBBU.Sim2 1.02 | 12 | 12% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 12% | 8 |
| oog.melee.Corsair 1.0 | 10 | 10% | 45 |
| sam.Samspin 1.0 | 9 | 9% | 16 |
| zyx.nano.BacillusComma 1.0 | 9 | 9% | 13 |
| ahf.NanoAndrew .4 | 5 | 5% | 23 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 59 over 6 battles (9.8 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.0 | 129 / 210 | 2.62 | 18.4% | 30986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.4% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.4% | 36 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.9% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.5% | 9 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.8% | 4 |
| fm.claire 1.7 | 6.8 | 8.3% | 1 |
| sample.SpinBot 1.0 | 8.5 | 6.2% | 2 |
| pa.Improved 1.0 | 8.8 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 76.2 | 17 / 35 | 5021 |
| 2 | 1 | 67.9 | 82.9 | 24 / 35 | 4969 |
| 3 | 1 | 68.0 | 80.0 | 22 / 35 | 5545 |
| 4 | 1 | 68.3 | 85.7 | 22 / 35 | 4922 |
| 5 | 1 | 68.6 | 85.1 | 23 / 35 | 5259 |
| 6 | 1 | 67.9 | 82.2 | 21 / 35 | 5270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 84 | 83% |
| oog.melee.CapuletDroid 1.1 | 26 | 73% |
| arthord.NanoSatanMelee Beta | 17 | 88% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 11 | 82% |
| sample.SpinBot 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 28% | 91 |
| oog.melee.CapuletDroid 1.1 | 17 | 21% | 17 |
| arthord.NanoSatanMelee Beta | 13 | 16% | 25 |
| gh.nano.Grofvuil 0.2 | 12 | 15% | 35 |
| fm.claire 1.7 | 5 | 6% | 7 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 16 |
| sample.SpinBot 1.0 | 4 | 5% | 6 |
| pa.Improved 1.0 | 3 | 4% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.2 | 121 / 210 | 2.60 | 18.3% | 32405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 18.3% | 121 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 30 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 26 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 20 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 6 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.3% | 2 |
| el.JumpShoot 0.2 | 7.3 | 6.6% | 3 |
| acogdev.alpha 0.2 | 8.7 | 5.4% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.1 | 21 / 35 | 5890 |
| 2 | 1 | 68.0 | 81.0 | 22 / 35 | 5214 |
| 3 | 1 | 67.1 | 78.1 | 21 / 35 | 5338 |
| 4 | 1 | 69.1 | 87.0 | 22 / 35 | 5309 |
| 5 | 1 | 69.5 | 86.7 | 20 / 35 | 5769 |
| 6 | 2 | 65.3 | 76.2 | 15 / 35 | 4885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 76% |
| mz.MicroGodMelee 1 | 39 | 92% |
| gh.micro.Gruweltje 0.7 | 37 | 76% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 29 | 33% | 64 |
| gh.micro.Gruweltje 0.7 | 23 | 26% | 61 |
| mz.MicroGodMelee 1 | 13 | 15% | 50 |
| acogdev.alpha 0.2 | 6 | 7% | 7 |
| mbro.Detektor3 0.1.1 | 5 | 6% | 6 |
| el.JumpShoot 0.2 | 4 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 67.6 | 89 / 210 | 3.92 | 15.9% | 30374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.7 | 15.9% | 89 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.9% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.9% | 34 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.6% | 7 |
| germ.TheMind .2 | 5.0 | 9.4% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.1% | 3 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 9 |
| sample.Crazy 1.0 | 8.5 | 7.2% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 68.9 | 16 / 35 | 4864 |
| 2 | 2 | 62.3 | 63.8 | 13 / 35 | 4751 |
| 3 | 1 | 64.6 | 68.9 | 16 / 35 | 5317 |
| 4 | 2 | 63.9 | 65.4 | 15 / 35 | 5309 |
| 5 | 1 | 64.5 | 71.4 | 17 / 35 | 4861 |
| 6 | 2 | 63.9 | 67.0 | 12 / 35 | 5272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 71% |
| germ.TheMind .2 | 10 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| sample.Crazy 1.0 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 121 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 43% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 21% | 40 |
| lrem.micro.MoggFanatic 0.2 | 12 | 10% | 13 |
| germ.TheMind .2 | 8 | 7% | 16 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 13 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 12 |
| awesomeness.Elite 1.0 | 5 | 4% | 9 |
| sample.Crazy 1.0 | 3 | 2% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.4 | 152 / 210 | 2.05 | 20.1% | 31177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.1% | 152 |
| rz.HawkOnFire 0.1 | 2.3 | 13.7% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.8% | 13 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 7 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 6 |
| ratosh.Wesco 1.4 | 6.0 | 8.9% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.2% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 7.7% | 6 |
| stelo.PatternRobot 1.0 | 8.0 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.2 | 25 / 35 | 5421 |
| 2 | 1 | 67.2 | 79.0 | 20 / 35 | 4376 |
| 3 | 1 | 70.0 | 85.1 | 23 / 35 | 5399 |
| 4 | 1 | 70.3 | 86.3 | 24 / 35 | 5302 |
| 5 | 1 | 72.5 | 94.6 | 30 / 35 | 5120 |
| 6 | 1 | 72.3 | 95.9 | 30 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 90% |
| nz.jdc.nano.GridFu 1.0 | 41 | 98% |
| maribo.IotaCT 1.1 | 14 | 93% |
| ratosh.Wesco 1.4 | 12 | 92% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 21% | 53 |
| maribo.IotaCT 1.1 | 10 | 17% | 26 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 59 |
| ratosh.Wesco 1.4 | 8 | 14% | 25 |
| stelo.PatternRobot 1.0 | 7 | 12% | 16 |
| timmit.nano.TimDog 0.33 | 6 | 10% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| spinnercat.Omen 1.0 | 3 | 5% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.0 | 171 / 210 | 1.72 | 21.5% | 38187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.5% | 171 |
| baal.nano.N 1.42 | 2.5 | 11.8% | 4 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.2% | 14 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.4% | 3 |
| zyx.micro.Ant 1.1 | 5.7 | 8.9% | 9 |
| sanja.First 0.1 | 5.8 | 8.6% | 2 |
| cvt.Firsty 1.0 | 7.3 | 7.4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 6.9% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 27 / 35 | 5448 |
| 2 | 1 | 70.8 | 90.5 | 27 / 35 | 6184 |
| 3 | 1 | 71.7 | 91.7 | 30 / 35 | 6473 |
| 4 | 1 | 70.3 | 86.0 | 26 / 35 | 6305 |
| 5 | 1 | 73.5 | 98.7 | 32 / 35 | 6974 |
| 6 | 1 | 72.8 | 95.2 | 29 / 35 | 6803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 93% |
| baal.nano.N 1.42 | 39 | 100% |
| cvt.Firsty 1.0 | 26 | 85% |
| sanja.First 0.1 | 24 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| zyx.micro.Ant 1.1 | 16 | 75% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 12 | 30% | 57 |
| zyx.micro.Ant 1.1 | 9 | 23% | 32 |
| cvt.Firsty 1.0 | 5 | 13% | 32 |
| baal.nano.N 1.42 | 5 | 13% | 30 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 14 |
| sample.RamFire 1.0 | 3 | 8% | 5 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 7 |
| sanja.First 0.1 | 0 | 0% | 25 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.9 | 76 / 210 | 4.07 | 14.7% | 28813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.2% | 70 |
| hadur117.micro.SaorOG4 0.1 | 1.8 | 14.7% | 76 |
| cs.Wren 1.0 | 3.0 | 12.9% | 27 |
| js.PinBall 1.6 | 4.3 | 11.2% | 10 |
| mz.Cork 0.1 | 4.3 | 11.2% | 10 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 6 |
| evd.X1 0.01 | 6.8 | 8.8% | 8 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 62.9 | 10 / 35 | 4672 |
| 2 | 2 | 62.7 | 66.7 | 10 / 35 | 5338 |
| 3 | 1 | 62.8 | 67.9 | 16 / 35 | 4782 |
| 4 | 2 | 60.5 | 60.6 | 12 / 35 | 4773 |
| 5 | 1 | 64.8 | 74.6 | 19 / 35 | 4871 |
| 6 | 2 | 60.2 | 62.9 | 9 / 35 | 4377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 49% |
| cs.Wren 1.0 | 25 | 80% |
| js.PinBall 1.6 | 10 | 100% |
| mz.Cork 0.1 | 8 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 50% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 81 | 60% | 114 |
| cs.Wren 1.0 | 16 | 12% | 34 |
| evd.X1 0.01 | 12 | 9% | 14 |
| mz.Cork 0.1 | 7 | 5% | 11 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| js.PinBall 1.6 | 5 | 4% | 14 |
| joe.ADinosaur 1.0 | 4 | 3% | 8 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.3 | 118 / 210 | 2.69 | 18.2% | 28276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.2% | 118 |
| ntc.Opposite 1.5 | 3.0 | 11.8% | 11 |
| myl.nano.Graviton 1.10 | 3.0 | 12.0% | 18 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 11.3% | 33 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.2% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 5.5 | 9.7% | 1 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 10 |
| DBall.NUKE 0.1 | 7.8 | 7.5% | 6 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.4 | 19 / 35 | 4564 |
| 2 | 1 | 68.2 | 80.0 | 23 / 35 | 4933 |
| 3 | 1 | 67.7 | 86.3 | 17 / 35 | 4659 |
| 4 | 1 | 67.4 | 82.9 | 21 / 35 | 4638 |
| 5 | 1 | 65.0 | 76.2 | 17 / 35 | 4548 |
| 6 | 1 | 67.1 | 77.8 | 21 / 35 | 4934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 49 | 96% |
| stelo.AreaTargetingBot 1.1 | 41 | 54% |
| ntc.Opposite 1.5 | 21 | 95% |
| DBall.NUKE 0.1 | 9 | 100% |
| disan.Chair 2.2.0 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| donjezza.Muncho 1.0 | 5 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 32% | 54 |
| pfvicm.Sobieski 7.2.3b | 22 | 24% | 31 |
| ntc.Opposite 1.5 | 15 | 16% | 33 |
| myl.nano.Graviton 1.10 | 7 | 8% | 42 |
| disan.Chair 2.2.0 | 7 | 8% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 5% | 11 |
| donjezza.Muncho 1.0 | 4 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 2% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.3 | 92 / 210 | 3.59 | 15.4% | 24439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 15.4% | 92 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.4% | 44 |
| oog.melee.Capulet 1.2 | 3.2 | 13.2% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 16 |
| yagami.Tidus 0.11 | 4.5 | 12.4% | 15 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 72.7 | 17 / 35 | 3988 |
| 2 | 1 | 64.9 | 73.3 | 17 / 35 | 4133 |
| 3 | 1 | 63.7 | 67.0 | 15 / 35 | 4542 |
| 4 | 2 | 63.2 | 70.5 | 13 / 35 | 3988 |
| 5 | 1 | 62.9 | 69.8 | 12 / 35 | 3822 |
| 6 | 1 | 65.0 | 74.3 | 18 / 35 | 3966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 32 | 91% |
| oog.melee.Capulet 1.2 | 28 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 96% |
| yagami.Tidus 0.11 | 18 | 83% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 36% | 59 |
| yagami.Tidus 0.11 | 22 | 19% | 41 |
| kawigi.micro.Shiz 1.1 | 21 | 18% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 12% | 43 |
| ejb.Polaris 1.0.1 | 7 | 6% | 13 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.5 | 133 / 210 | 2.93 | 17.4% | 26549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.4% | 133 |
| bzdp.Pansy 2.1 | 2.7 | 12.7% | 22 |
| wee.Gem 1.8.4 | 3.3 | 11.6% | 23 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 8 |
| wompi.Quokka 1.6 | 4.2 | 11.0% | 10 |
| m3thos.Eva00 1.1 | 5.8 | 10.0% | 11 |
| bayen.UbaMicro 1.4 | 7.2 | 8.9% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.2 | 24 / 35 | 4084 |
| 2 | 1 | 68.9 | 88.9 | 27 / 35 | 4605 |
| 3 | 1 | 65.5 | 75.9 | 18 / 35 | 4586 |
| 4 | 1 | 65.0 | 76.8 | 20 / 35 | 4374 |
| 5 | 1 | 66.9 | 78.4 | 23 / 35 | 4645 |
| 6 | 1 | 65.2 | 74.9 | 21 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 98% |
| wee.Gem 1.8.4 | 38 | 95% |
| wompi.Quokka 1.6 | 18 | 89% |
| m3thos.Eva00 1.1 | 17 | 71% |
| ratosh.Nobo 0.21 | 11 | 82% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 22% | 56 |
| maribo.FollowFire 1 | 14 | 18% | 13 |
| m3thos.Eva00 1.1 | 9 | 12% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 10 |
| wompi.Quokka 1.6 | 7 | 9% | 19 |
| wee.Gem 1.8.4 | 6 | 8% | 44 |
| bayen.UbaMicro 1.4 | 6 | 8% | 14 |
| ratosh.Nobo 0.21 | 5 | 6% | 18 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 86.2 | 66 / 210 | 2.24 | 20.7% | 49626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 20.7% | 66 |
| wompi.Wallaby 5.1 | 1.8 | 20.1% | 125 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 7 |
| stuff.Vlad 0.1 | 5.0 | 8.7% | 0 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 2 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.5% | 9 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 86.7 | 11 / 35 | 8476 |
| 2 | 1 | 71.4 | 85.4 | 9 / 35 | 7762 |
| 3 | 1 | 72.8 | 86.0 | 14 / 35 | 8523 |
| 4 | 2 | 72.3 | 85.1 | 9 / 35 | 8804 |
| 5 | 1 | 71.4 | 83.5 | 11 / 35 | 8072 |
| 6 | 1 | 72.5 | 90.5 | 12 / 35 | 7989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 139 | 29% |
| mz.NanoGod 2.02 | 18 | 83% |
| exauge.GateKeeper 1.1.121g | 9 | 56% |
| ayk.WallHugger 1.0 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 116 | 79% | 159 |
| mz.NanoGod 2.02 | 13 | 9% | 27 |
| exauge.GateKeeper 1.1.121g | 6 | 4% | 8 |
| ayk.WallHugger 1.0 | 6 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 5 |
| drd.Dreadknoght 0.9 | 2 | 1% | 3 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.2 | 102 / 210 | 3.60 | 16.2% | 27970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 16.2% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 14.1% | 39 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 22 |
| bvh.micro.Freya 0.3 | 3.8 | 11.6% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.2% | 15 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.8% | 11 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 1 |
| ap.Frederick 1.1 | 8.0 | 6.8% | 3 |
| dl.BetterWalls 1.0 | 9.3 | 5.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.3 | 22 / 35 | 4817 |
| 2 | 1 | 62.5 | 66.7 | 15 / 35 | 4471 |
| 3 | 1 | 65.0 | 74.3 | 18 / 35 | 4586 |
| 4 | 3 | 60.0 | 58.1 | 12 / 35 | 4452 |
| 5 | 1 | 65.1 | 70.8 | 18 / 35 | 5097 |
| 6 | 1 | 65.8 | 76.8 | 17 / 35 | 4547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 68% |
| dummy.micro.Sparrow 2.5 | 24 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| bvh.micro.Freya 0.3 | 17 | 94% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 28% | 63 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 17% | 18 |
| conscience.Electron 1.3g | 16 | 15% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 38 |
| bvh.micro.Freya 0.3 | 11 | 10% | 15 |
| dummy.micro.Sparrow 2.5 | 10 | 9% | 39 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 12 |
| dl.BetterWalls 1.0 | 2 | 2% | 5 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.7 | 144 / 210 | 2.38 | 20.8% | 40559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.8% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.3% | 17 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 19 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 16 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.9% | 4 |
| dsw.StaticD 1.0 | 5.8 | 9.0% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 4 |
| sample.Corners 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 82.5 | 21 / 35 | 7012 |
| 2 | 1 | 70.1 | 82.2 | 21 / 35 | 5971 |
| 3 | 1 | 71.7 | 90.2 | 25 / 35 | 6490 |
| 4 | 1 | 71.4 | 83.8 | 26 / 35 | 7165 |
| 5 | 1 | 71.6 | 86.7 | 25 / 35 | 7092 |
| 6 | 1 | 71.1 | 82.9 | 26 / 35 | 6829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 57 | 88% |
| sul.Lunar 1.1 | 34 | 100% |
| supersample.SuperBoxBot 1.0 | 25 | 72% |
| dsw.StaticD 1.0 | 15 | 93% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 30% | 64 |
| supersample.SuperBoxBot 1.0 | 18 | 27% | 38 |
| sul.Lunar 1.1 | 9 | 13% | 44 |
| mme.NikeEnhanced 2.0 | 9 | 13% | 13 |
| dsw.StaticD 1.0 | 5 | 7% | 19 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 12 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 10 |

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 78.7 | 109 / 210 | 2.91 | 18.3% | 37939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.3% | 109 |
| radnor.DoctorBob 1.42 | 2.5 | 12.9% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.3% | 25 |
| mld.Wisdom 1.0 | 3.7 | 11.6% | 18 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 11 |
| amz.NanoClone 1.41 | 5.5 | 9.8% | 11 |
| GarmBox.Oranges 1.0 | 7.8 | 7.4% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 4 |
| jangs.ns51 1.0 | 8.3 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 70.5 | 10 / 35 | 6483 |
| 2 | 1 | 64.2 | 69.2 | 14 / 35 | 5637 |
| 3 | 1 | 68.3 | 81.9 | 18 / 35 | 6293 |
| 4 | 1 | 70.8 | 85.4 | 23 / 35 | 7208 |
| 5 | 1 | 68.9 | 83.2 | 22 / 35 | 6337 |
| 6 | 1 | 68.5 | 82.2 | 22 / 35 | 5981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 93% |
| radnor.DoctorBob 1.42 | 29 | 76% |
| mld.Wisdom 1.0 | 18 | 72% |
| amz.NanoClone 1.41 | 12 | 58% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 23% | 50 |
| mld.Wisdom 1.0 | 21 | 21% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 64 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 19 |
| amz.NanoClone 1.41 | 13 | 13% | 19 |
| GarmBox.Oranges 1.0 | 5 | 5% | 7 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| sample.Walls 1.0 | 4 | 4% | 5 |

