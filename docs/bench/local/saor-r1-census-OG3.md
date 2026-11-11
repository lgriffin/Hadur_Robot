# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 70 over 6 battles (11.7 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 88.7 | 126 / 210 | 2.02 | 20.6% | 39993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.6% | 126 |
| radnor.DoctorBob 1.42 | 2.7 | 14.6% | 29 |
| mz.AntiGrav 1.0 | 3.0 | 14.4% | 20 |
| mld.Infinity 2.2 | 3.3 | 13.8% | 29 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 2 |
| sample.Walls 1.0 | 6.3 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.4% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.8% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 3.8% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.1 | 21 / 35 | 6681 |
| 2 | 1 | 70.8 | 87.6 | 19 / 35 | 6557 |
| 3 | 1 | 72.4 | 90.5 | 20 / 35 | 7003 |
| 4 | 1 | 69.6 | 80.3 | 19 / 35 | 6564 |
| 5 | 1 | 71.4 | 87.3 | 23 / 35 | 6580 |
| 6 | 1 | 72.7 | 94.3 | 24 / 35 | 6608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 87% |
| mld.Infinity 2.2 | 50 | 78% |
| radnor.DoctorBob 1.42 | 37 | 62% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 3 | 33% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 43% | 73 |
| mz.AntiGrav 1.0 | 25 | 30% | 87 |
| mld.Infinity 2.2 | 15 | 18% | 20 |
| jangs.ns51 1.0 | 4 | 5% | 11 |
| amz.NanoClone 1.41 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| sample.Walls 1.0 | 0 | 0% | 8 |

## Melee bench: F02

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 132 over 6 battles (22.0 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.4 | 139 / 210 | 2.04 | 19.1% | 30564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.1% | 139 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.5% | 47 |
| mld.DustBunny 3.8 | 3.3 | 12.9% | 7 |
| maribo.melee.BMV 0.1 | 4.5 | 9.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.5% | 4 |
| zyx.nano.Ant 1.1 | 5.5 | 8.8% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 5 |
| fullsail.SweetTea 1.1 | 7.8 | 6.2% | 1 |
| bzdp.BoxCar 2.0 | 8.7 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.8 | 22 / 35 | 4563 |
| 2 | 1 | 68.4 | 86.0 | 22 / 35 | 5064 |
| 3 | 1 | 67.6 | 88.9 | 20 / 35 | 4592 |
| 4 | 1 | 68.6 | 84.8 | 24 / 35 | 5419 |
| 5 | 1 | 70.0 | 93.0 | 26 / 35 | 5327 |
| 6 | 1 | 69.9 | 87.0 | 25 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 108 | 80% |
| mld.DustBunny 3.8 | 36 | 86% |
| djdjdj.NanoSkunk10 1.0 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 4 | 50% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 49% | 122 |
| mld.DustBunny 3.8 | 11 | 15% | 43 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 11% | 16 |
| zyx.nano.Ant 1.1 | 6 | 8% | 8 |
| maribo.melee.BMV 0.1 | 4 | 6% | 5 |
| fullsail.SweetTea 1.1 | 2 | 3% | 4 |
| bzdp.BoxCar 2.0 | 2 | 3% | 3 |
| cs.Grudge 1.0 | 2 | 3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.1 | 128 / 210 | 2.70 | 19.1% | 34192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.1% | 128 |
| myl.micro.Troodon 1.10 | 2.0 | 15.8% | 46 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.8% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.1% | 13 |
| fm.mammillarias 1.3 | 5.5 | 9.0% | 3 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.1% | 9 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 4 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 80.3 | 21 / 35 | 5848 |
| 2 | 1 | 69.1 | 81.9 | 20 / 35 | 5737 |
| 3 | 1 | 66.6 | 70.5 | 18 / 35 | 5920 |
| 4 | 1 | 67.2 | 78.1 | 21 / 35 | 4867 |
| 5 | 1 | 69.8 | 84.8 | 22 / 35 | 5906 |
| 6 | 1 | 71.4 | 91.1 | 26 / 35 | 5914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 75 | 84% |
| cb.nano.Insomnia 1.0 | 22 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 88% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 36 | 44% | 106 |
| fm.mammillarias 1.3 | 9 | 11% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 10% | 18 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 28 |
| cb.nano.Insomnia 1.0 | 7 | 9% | 10 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 12 |
| sample.Fire 1.0 | 4 | 5% | 9 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 10 |

## Melee bench: F04

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 39 over 6 battles (6.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.6 | 120 / 210 | 2.48 | 19.3% | 36444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.3% | 120 |
| tvv.micro.Antares 1.1.1 | 2.5 | 13.2% | 26 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.0% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.3% | 4 |
| tj.zombie1n 1.0.1 | 5.2 | 9.5% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.2% | 15 |
| yk.JahMicro 1.0 | 6.3 | 8.5% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.3% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 18 / 35 | 5673 |
| 2 | 1 | 68.6 | 80.0 | 21 / 35 | 6211 |
| 3 | 1 | 70.1 | 85.1 | 24 / 35 | 6303 |
| 4 | 1 | 68.7 | 84.1 | 17 / 35 | 6135 |
| 5 | 1 | 68.7 | 81.0 | 21 / 35 | 6174 |
| 6 | 1 | 68.5 | 83.8 | 19 / 35 | 5948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 94% |
| stelo.SoJNanoMelee 1.1 | 32 | 75% |
| tvv.micro.Antares 1.1.1 | 31 | 74% |
| tj.zombie1n 1.0.1 | 14 | 57% |
| yk.JahMicro 1.0 | 8 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 27% | 81 |
| tvv.micro.Antares 1.1.1 | 17 | 19% | 41 |
| stelo.SoJNanoMelee 1.1 | 16 | 18% | 32 |
| tj.zombie1n 1.0.1 | 10 | 11% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 9% | 16 |
| yk.JahMicro 1.0 | 7 | 8% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 8% | 10 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.7 | 109 / 210 | 3.72 | 16.4% | 29187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 16.4% | 109 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 21 |
| ahf.NanoAndrew .4 | 3.7 | 11.6% | 18 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 23 |
| EBBU.Sim2 1.02 | 5.3 | 10.0% | 12 |
| sam.Samspin 1.0 | 5.3 | 10.2% | 15 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.9% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 8.1% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 61.9 | 16 / 35 | 4312 |
| 2 | 1 | 64.3 | 71.4 | 19 / 35 | 4483 |
| 3 | 1 | 64.1 | 68.3 | 18 / 35 | 4638 |
| 4 | 1 | 64.8 | 73.0 | 16 / 35 | 4967 |
| 5 | 1 | 64.1 | 66.3 | 18 / 35 | 4912 |
| 6 | 1 | 67.8 | 77.5 | 22 / 35 | 5875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 90% |
| oog.melee.Corsair 1.0 | 36 | 89% |
| ahf.NanoAndrew .4 | 18 | 89% |
| EBBU.Sim2 1.02 | 10 | 60% |
| sam.Samspin 1.0 | 10 | 80% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 347. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 23% | 59 |
| oog.melee.Corsair 1.0 | 14 | 14% | 46 |
| EBBU.Sim2 1.02 | 13 | 13% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 13% | 12 |
| ahf.NanoAndrew .4 | 10 | 10% | 36 |
| robar.nano.Assertive_Melee 0.2 | 10 | 10% | 15 |
| sam.Samspin 1.0 | 9 | 9% | 13 |
| zyx.nano.BacillusComma 1.0 | 7 | 7% | 7 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.2 | 154 / 210 | 2.06 | 19.9% | 32799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.9% | 154 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.2% | 8 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.3% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 3 |
| fm.claire 1.7 | 6.3 | 8.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.3% | 4 |
| pa.Improved 1.0 | 8.7 | 6.1% | 1 |
| sample.SpinBot 1.0 | 8.8 | 5.7% | 3 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.8 | 25 / 35 | 5448 |
| 2 | 1 | 71.9 | 96.5 | 30 / 35 | 5562 |
| 3 | 1 | 69.6 | 87.6 | 22 / 35 | 5462 |
| 4 | 1 | 68.6 | 83.8 | 23 / 35 | 5527 |
| 5 | 1 | 71.3 | 91.4 | 31 / 35 | 5665 |
| 6 | 1 | 68.4 | 85.1 | 23 / 35 | 5135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 86% |
| oog.melee.CapuletDroid 1.1 | 41 | 95% |
| gh.nano.Grofvuil 0.2 | 25 | 92% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 39% | 95 |
| gh.nano.Grofvuil 0.2 | 10 | 18% | 49 |
| oog.melee.CapuletDroid 1.1 | 10 | 18% | 17 |
| arthord.NanoSatanMelee Beta | 5 | 9% | 18 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 11 |
| fm.claire 1.7 | 2 | 4% | 6 |
| sample.SpinBot 1.0 | 2 | 4% | 5 |
| pa.Improved 1.0 | 2 | 4% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 5 |

## Melee bench: F07

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 76 over 6 battles (12.7 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.4 | 70 / 210 | 3.30 | 16.1% | 29780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.3 | 16.9% | 70 |
| hadur117.micro.SaorOG3 0.1 | 1.7 | 16.1% | 70 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.8% | 43 |
| mz.MicroGodMelee 1 | 4.0 | 12.5% | 19 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 0 |
| acogdev.alpha 0.2 | 7.5 | 6.4% | 1 |
| mbro.Detektor3 0.1.1 | 8.0 | 6.0% | 3 |
| el.JumpShoot 0.2 | 8.3 | 5.9% | 1 |
| fire219.CatBot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 80.6 | 11 / 35 | 5057 |
| 2 | 2 | 64.6 | 70.8 | 15 / 35 | 4881 |
| 3 | 2 | 65.2 | 73.3 | 10 / 35 | 5216 |
| 4 | 1 | 64.6 | 76.8 | 14 / 35 | 4546 |
| 5 | 2 | 64.0 | 72.7 | 10 / 35 | 4793 |
| 6 | 2 | 64.4 | 72.1 | 10 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 54 | 44% |
| spinnercat.micro.Tyger 0.1 | 41 | 46% |
| mz.MicroGodMelee 1 | 23 | 87% |
| DBall.Anarchy 0.1 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 52 | 37% | 81 |
| spinnercat.micro.Tyger 0.1 | 41 | 29% | 59 |
| mz.MicroGodMelee 1 | 15 | 11% | 33 |
| caimano.Furia_Ceca 0.22 | 9 | 6% | 10 |
| acogdev.alpha 0.2 | 7 | 5% | 8 |
| fire219.CatBot 1.0 | 7 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 5 | 4% | 6 |
| el.JumpShoot 0.2 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.2 | 84 / 210 | 3.86 | 15.4% | 27810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.3% | 55 |
| hadur117.micro.SaorOG3 0.1 | 1.7 | 15.4% | 84 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.7% | 34 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 10.0% | 7 |
| germ.TheMind .2 | 4.8 | 9.9% | 10 |
| awesomeness.Elite 1.0 | 7.0 | 8.0% | 7 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 7.7% | 1 |
| sample.Crazy 1.0 | 8.2 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 67.0 | 14 / 35 | 4774 |
| 2 | 2 | 63.8 | 70.2 | 12 / 35 | 4802 |
| 3 | 1 | 64.4 | 70.8 | 14 / 35 | 4857 |
| 4 | 2 | 63.1 | 68.3 | 14 / 35 | 4602 |
| 5 | 2 | 62.9 | 66.0 | 15 / 35 | 4787 |
| 6 | 2 | 62.1 | 67.0 | 15 / 35 | 3988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 59% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 71% |
| germ.TheMind .2 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 62% | 115 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 13% | 37 |
| germ.TheMind .2 | 8 | 6% | 18 |
| stelo.UntouchableNano 1.3 | 8 | 6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 8 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 8 |
| awesomeness.Elite 1.0 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.4 | 147 / 210 | 2.04 | 19.3% | 26823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.3% | 147 |
| rz.HawkOnFire 0.1 | 2.0 | 14.4% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.8% | 10 |
| maribo.IotaCT 1.1 | 3.7 | 11.2% | 8 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.2% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 8.5% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 4 |
| stelo.PatternRobot 1.0 | 8.2 | 7.2% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.4 | 28 / 35 | 4269 |
| 2 | 1 | 69.7 | 87.3 | 22 / 35 | 4842 |
| 3 | 1 | 70.5 | 89.5 | 25 / 35 | 4832 |
| 4 | 1 | 69.7 | 89.8 | 25 / 35 | 4430 |
| 5 | 1 | 68.4 | 85.1 | 23 / 35 | 4170 |
| 6 | 1 | 69.1 | 87.3 | 24 / 35 | 4280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 87% |
| nz.jdc.nano.GridFu 1.0 | 30 | 90% |
| maribo.IotaCT 1.1 | 17 | 88% |
| timmit.nano.TimDog 0.33 | 12 | 100% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 29% | 74 |
| timmit.nano.TimDog 0.33 | 11 | 17% | 25 |
| nz.jdc.nano.GridFu 1.0 | 9 | 14% | 46 |
| stelo.PatternRobot 1.0 | 9 | 14% | 14 |
| maribo.IotaCT 1.1 | 8 | 13% | 29 |
| ratosh.Wesco 1.4 | 5 | 8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.7 | 157 / 210 | 1.75 | 21.0% | 36985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 21.0% | 157 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.5% | 26 |
| baal.nano.N 1.42 | 3.3 | 10.8% | 3 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.8% | 4 |
| sanja.First 0.1 | 5.3 | 9.0% | 5 |
| zyx.micro.Ant 1.1 | 5.8 | 9.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.2% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 11 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.0 | 22 / 35 | 6292 |
| 2 | 1 | 72.0 | 97.1 | 30 / 35 | 6178 |
| 3 | 1 | 70.8 | 91.1 | 26 / 35 | 6192 |
| 4 | 1 | 72.4 | 96.2 | 29 / 35 | 6460 |
| 5 | 1 | 71.4 | 94.0 | 30 / 35 | 5874 |
| 6 | 1 | 69.1 | 84.8 | 20 / 35 | 5989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 76% |
| baal.nano.N 1.42 | 34 | 97% |
| cvt.Firsty 1.0 | 27 | 78% |
| sanja.First 0.1 | 27 | 96% |
| amk.Punbot.Punbot 0.01 | 17 | 94% |
| zyx.micro.Ant 1.1 | 16 | 94% |
| Grystrion.TrackerWO 1.0 | 11 | 91% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 20 | 36% | 55 |
| zyx.micro.Ant 1.1 | 6 | 11% | 41 |
| cvt.Firsty 1.0 | 6 | 11% | 19 |
| sanja.First 0.1 | 5 | 9% | 31 |
| baal.nano.N 1.42 | 4 | 7% | 26 |
| Grystrion.TrackerWO 1.0 | 4 | 7% | 22 |
| amk.Punbot.Punbot 0.01 | 4 | 7% | 8 |
| sample.RamFire 1.0 | 3 | 5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 67.8 | 51 / 210 | 3.90 | 14.3% | 27057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 17.4% | 110 |
| hadur117.micro.SaorOG3 0.1 | 1.8 | 14.3% | 51 |
| cs.Wren 1.0 | 3.3 | 12.0% | 14 |
| mz.Cork 0.1 | 4.3 | 11.1% | 9 |
| js.PinBall 1.6 | 4.5 | 11.0% | 10 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 5 |
| evd.X1 0.01 | 6.7 | 8.2% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 75.2 | 15 / 35 | 4940 |
| 2 | 2 | 62.8 | 72.1 | 8 / 35 | 4695 |
| 3 | 2 | 57.3 | 56.8 | 5 / 35 | 4257 |
| 4 | 2 | 61.5 | 68.3 | 8 / 35 | 4540 |
| 5 | 2 | 59.3 | 62.5 | 3 / 35 | 4403 |
| 6 | 2 | 62.5 | 71.7 | 12 / 35 | 4222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 79 | 19% |
| cs.Wren 1.0 | 16 | 88% |
| mz.Cork 0.1 | 15 | 100% |
| evd.X1 0.01 | 3 | 100% |
| js.PinBall 1.6 | 3 | 67% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 109 | 69% | 124 |
| cs.Wren 1.0 | 12 | 8% | 24 |
| mz.Cork 0.1 | 10 | 6% | 21 |
| evd.X1 0.01 | 10 | 6% | 12 |
| joe.ADinosaur 1.0 | 8 | 5% | 10 |
| js.PinBall 1.6 | 5 | 3% | 10 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.8 | 118 / 210 | 2.82 | 18.1% | 28677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.1% | 118 |
| myl.nano.Graviton 1.10 | 2.5 | 12.4% | 28 |
| ntc.Opposite 1.5 | 2.8 | 12.0% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 11.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.3% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.7% | 3 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 10 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 2 |
| donjezza.Muncho 1.0 | 9.0 | 6.0% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.1 | 20 / 35 | 4539 |
| 2 | 1 | 68.1 | 82.2 | 23 / 35 | 5013 |
| 3 | 1 | 68.0 | 81.6 | 20 / 35 | 5113 |
| 4 | 1 | 68.6 | 84.1 | 20 / 35 | 4883 |
| 5 | 1 | 67.1 | 78.1 | 22 / 35 | 4628 |
| 6 | 1 | 64.4 | 74.6 | 13 / 35 | 4501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 82% |
| ntc.Opposite 1.5 | 22 | 77% |
| stelo.AreaTargetingBot 1.1 | 19 | 74% |
| disan.Chair 2.2.0 | 17 | 88% |
| donjezza.Muncho 1.0 | 16 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 18% | 52 |
| stelo.AreaTargetingBot 1.1 | 17 | 18% | 33 |
| pfvicm.Sobieski 7.2.3b | 17 | 18% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 14% | 24 |
| ntc.Opposite 1.5 | 11 | 12% | 32 |
| disan.Chair 2.2.0 | 7 | 8% | 14 |
| DBall.NUKE 0.1 | 4 | 4% | 13 |
| pbg.R2D2 1.0 | 4 | 4% | 8 |
| donjezza.Muncho 1.0 | 2 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.9 | 98 / 210 | 3.44 | 15.9% | 24652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.3 | 15.9% | 98 |
| oog.melee.Capulet 1.2 | 2.2 | 13.7% | 41 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.6% | 18 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 8 |
| ejb.Polaris 1.0.1 | 6.0 | 10.9% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 59.0 | 8 / 35 | 4087 |
| 2 | 1 | 67.5 | 82.9 | 21 / 35 | 4148 |
| 3 | 1 | 68.2 | 88.3 | 19 / 35 | 4033 |
| 4 | 1 | 64.5 | 72.4 | 19 / 35 | 3797 |
| 5 | 1 | 64.7 | 70.5 | 16 / 35 | 4335 |
| 6 | 1 | 62.5 | 64.4 | 15 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 77% |
| oog.melee.Capulet 1.2 | 30 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 100% |
| yagami.Tidus 0.11 | 20 | 75% |
| ejb.Polaris 1.0.1 | 6 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 37% | 64 |
| kawigi.micro.Shiz 1.1 | 23 | 21% | 37 |
| yagami.Tidus 0.11 | 21 | 19% | 37 |
| ejb.Polaris 1.0.1 | 9 | 8% | 20 |
| kurios.DOSexe .9a | 7 | 6% | 6 |
| step.nanoPri 1.0 | 6 | 5% | 8 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 3% | 36 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 36 over 6 battles (6.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.5 | 133 / 210 | 2.85 | 17.4% | 26069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 17.4% | 133 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 17 |
| ratosh.Nobo 0.21 | 3.5 | 11.2% | 7 |
| wee.Gem 1.8.4 | 3.8 | 11.3% | 19 |
| wompi.Quokka 1.6 | 4.3 | 11.2% | 16 |
| m3thos.Eva00 1.1 | 6.2 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 8.6% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 4 |
| maribo.FollowFire 1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 75.9 | 23 / 35 | 4079 |
| 2 | 1 | 65.2 | 79.7 | 22 / 35 | 4122 |
| 3 | 1 | 66.9 | 81.9 | 24 / 35 | 4436 |
| 4 | 1 | 64.6 | 75.6 | 17 / 35 | 4135 |
| 5 | 1 | 67.8 | 84.4 | 24 / 35 | 4479 |
| 6 | 1 | 66.7 | 79.4 | 23 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 98% |
| wee.Gem 1.8.4 | 34 | 97% |
| wompi.Quokka 1.6 | 23 | 100% |
| m3thos.Eva00 1.1 | 12 | 67% |
| ratosh.Nobo 0.21 | 10 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 15 | 19% | 23 |
| stelo.MyAgileRobot 0.2 | 13 | 17% | 14 |
| wompi.Quokka 1.6 | 9 | 12% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 10 |
| bzdp.Pansy 2.1 | 8 | 10% | 60 |
| ratosh.Nobo 0.21 | 8 | 10% | 17 |
| bayen.UbaMicro 1.4 | 6 | 8% | 17 |
| maribo.FollowFire 1 | 5 | 6% | 7 |
| wee.Gem 1.8.4 | 4 | 5% | 44 |

## Melee bench: F15

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.4 | 33 / 210 | 2.22 | 19.8% | 46772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.3% | 163 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 19.8% | 33 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 9 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 4 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 0 |
| ayk.WallHugger 1.0 | 5.3 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.8 | 86.0 | 7 / 35 | 8217 |
| 2 | 2 | 71.5 | 87.6 | 5 / 35 | 7649 |
| 3 | 2 | 70.4 | 84.8 | 4 / 35 | 7419 |
| 4 | 2 | 71.5 | 86.0 | 6 / 35 | 8120 |
| 5 | 2 | 70.3 | 84.4 | 4 / 35 | 7502 |
| 6 | 2 | 71.8 | 89.5 | 7 / 35 | 7865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 141 | 7% |
| mz.NanoGod 2.02 | 16 | 69% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| stuff.Vlad 0.1 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 154 | 87% | 163 |
| mz.NanoGod 2.02 | 14 | 8% | 28 |
| exauge.GateKeeper 1.1.121g | 6 | 3% | 8 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |
| ayk.WallHugger 1.0 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.4 | 112 / 210 | 3.21 | 16.8% | 27319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.2 | 16.8% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 26 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.2% | 21 |
| bvh.micro.Freya 0.3 | 4.5 | 11.1% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 22 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 7 |
| conscience.Electron 1.3g | 7.2 | 8.3% | 4 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.1% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.0 | 15 / 35 | 4714 |
| 2 | 1 | 67.3 | 80.3 | 21 / 35 | 4965 |
| 3 | 2 | 60.9 | 64.8 | 16 / 35 | 3722 |
| 4 | 1 | 64.9 | 75.6 | 18 / 35 | 4413 |
| 5 | 1 | 66.4 | 79.4 | 21 / 35 | 4608 |
| 6 | 1 | 66.9 | 78.4 | 21 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 76% |
| dummy.micro.Sparrow 2.5 | 33 | 94% |
| bvh.micro.Freya 0.3 | 24 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 67% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 21% | 64 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 45 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 15% | 31 |
| conscience.Electron 1.3g | 15 | 15% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 9% | 11 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 15 |
| dl.BetterWalls 1.0 | 8 | 8% | 10 |
| bvh.micro.Freya 0.3 | 6 | 6% | 14 |

## Melee bench: F17

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 86.9 | 147 / 210 | 2.18 | 21.3% | 41368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 21.3% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.1% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 20 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.4% | 13 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.3% | 4 |
| dsw.StaticD 1.0 | 5.8 | 9.0% | 2 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.1% | 2 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.5% | 2 |
| sample.Corners 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 92.1 | 27 / 35 | 7037 |
| 2 | 1 | 72.5 | 90.8 | 27 / 35 | 6902 |
| 3 | 1 | 70.9 | 81.3 | 21 / 35 | 7017 |
| 4 | 1 | 69.1 | 79.7 | 18 / 35 | 6422 |
| 5 | 1 | 71.5 | 84.8 | 23 / 35 | 6920 |
| 6 | 1 | 73.1 | 93.0 | 31 / 35 | 7070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 61 | 95% |
| sul.Lunar 1.1 | 40 | 95% |
| supersample.SuperBoxBot 1.0 | 19 | 74% |
| dsw.StaticD 1.0 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 30% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 25% | 72 |
| sul.Lunar 1.1 | 9 | 14% | 45 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 13 |
| dsw.StaticD 1.0 | 6 | 9% | 17 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 14 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.Corners 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.5 | 109 / 210 | 2.75 | 18.4% | 38019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.4% | 109 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 23 |
| mld.Wisdom 1.0 | 3.7 | 12.1% | 16 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 6 |
| amz.NanoClone 1.41 | 5.7 | 9.5% | 10 |
| sample.Walls 1.0 | 7.2 | 7.4% | 8 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.0 | 17 / 35 | 6112 |
| 2 | 1 | 67.9 | 80.0 | 18 / 35 | 6496 |
| 3 | 1 | 66.8 | 77.1 | 18 / 35 | 6016 |
| 4 | 1 | 67.1 | 79.7 | 16 / 35 | 5778 |
| 5 | 1 | 69.6 | 84.8 | 21 / 35 | 6793 |
| 6 | 1 | 68.7 | 81.6 | 19 / 35 | 6824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 90% |
| radnor.DoctorBob 1.42 | 37 | 65% |
| mld.Wisdom 1.0 | 20 | 70% |
| amz.NanoClone 1.41 | 13 | 77% |
| KiraNL.Chupacabra 0.4 | 12 | 83% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 32% | 60 |
| KiraNL.Chupacabra 0.4 | 22 | 22% | 28 |
| mld.Wisdom 1.0 | 13 | 13% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 11% | 51 |
| amz.NanoClone 1.41 | 8 | 8% | 13 |
| sample.Walls 1.0 | 6 | 6% | 15 |
| jangs.ns51 1.0 | 5 | 5% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |

