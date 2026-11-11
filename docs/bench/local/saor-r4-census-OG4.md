# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.7 | 148 / 210 | 2.11 | 21.1% | 41582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.1% | 148 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 22 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 11 |
| mld.Infinity 2.2 | 3.3 | 13.3% | 18 |
| amz.NanoClone 1.41 | 5.0 | 11.0% | 8 |
| GarmBox.Oranges 1.0 | 6.2 | 6.8% | 0 |
| sample.Walls 1.0 | 7.2 | 6.0% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.7% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 79.7 | 20 / 35 | 6407 |
| 2 | 1 | 73.3 | 92.1 | 26 / 35 | 7311 |
| 3 | 1 | 72.7 | 89.5 | 25 / 35 | 7278 |
| 4 | 1 | 73.3 | 92.4 | 31 / 35 | 7332 |
| 5 | 1 | 71.7 | 87.3 | 24 / 35 | 6585 |
| 6 | 1 | 71.4 | 85.1 | 22 / 35 | 6669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 98% |
| mld.Infinity 2.2 | 45 | 87% |
| radnor.DoctorBob 1.42 | 40 | 88% |
| amz.NanoClone 1.41 | 9 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 37% | 82 |
| mz.AntiGrav 1.0 | 15 | 24% | 79 |
| mld.Infinity 2.2 | 14 | 23% | 17 |
| amz.NanoClone 1.41 | 7 | 11% | 11 |
| GarmBox.Oranges 1.0 | 2 | 3% | 4 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.1 | 144 / 210 | 2.34 | 19.0% | 31385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.0% | 144 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.0% | 42 |
| mld.DustBunny 3.8 | 3.0 | 13.4% | 10 |
| maribo.melee.BMV 0.1 | 4.3 | 10.4% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 7 |
| zyx.nano.Ant 1.1 | 6.0 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 6.8% | 4 |
| cs.Grudge 1.0 | 8.5 | 5.9% | 0 |
| bzdp.BoxCar 2.0 | 8.5 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.8 | 25 / 35 | 5256 |
| 2 | 1 | 69.2 | 86.7 | 23 / 35 | 5218 |
| 3 | 1 | 67.9 | 83.8 | 23 / 35 | 4710 |
| 4 | 1 | 70.2 | 88.9 | 29 / 35 | 5361 |
| 5 | 1 | 70.5 | 91.7 | 29 / 35 | 5303 |
| 6 | 1 | 65.4 | 68.9 | 15 / 35 | 5537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 96 | 80% |
| mld.DustBunny 3.8 | 44 | 95% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 48% | 113 |
| mld.DustBunny 3.8 | 9 | 13% | 50 |
| zyx.nano.Ant 1.1 | 9 | 13% | 11 |
| cs.Grudge 1.0 | 6 | 9% | 6 |
| maribo.melee.BMV 0.1 | 5 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 82.7 | 134 / 210 | 2.56 | 19.8% | 36818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.8% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 4 |
| cb.nano.Insomnia 1.0 | 4.2 | 10.4% | 12 |
| fm.mammillarias 1.3 | 5.2 | 9.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.7% | 18 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 1 |
| sample.Fire 1.0 | 9.2 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.5 | 25 / 35 | 6527 |
| 2 | 1 | 71.4 | 90.8 | 25 / 35 | 6184 |
| 3 | 1 | 68.8 | 76.8 | 20 / 35 | 6183 |
| 4 | 1 | 68.0 | 77.8 | 18 / 35 | 6006 |
| 5 | 1 | 70.9 | 85.4 | 24 / 35 | 6230 |
| 6 | 1 | 68.1 | 75.9 | 22 / 35 | 5688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 93% |
| cb.nano.Insomnia 1.0 | 36 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 74% |
| myl.nano.KomoriNinja 1.1 | 18 | 83% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 23% | 29 |
| myl.micro.Troodon 1.10 | 15 | 19% | 81 |
| myl.nano.KomoriNinja 1.1 | 11 | 14% | 42 |
| fm.mammillarias 1.3 | 11 | 14% | 12 |
| cb.nano.Insomnia 1.0 | 9 | 12% | 8 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 11 |
| sample.Fire 1.0 | 4 | 5% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 14 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.7 | 142 / 210 | 2.11 | 20.3% | 37100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.3% | 142 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 14 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 10 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.8% | 27 |
| tj.zombie1n 1.0.1 | 4.8 | 9.2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.5% | 3 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 8.3 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.3 | 23 / 35 | 5910 |
| 2 | 1 | 71.7 | 92.4 | 27 / 35 | 6577 |
| 3 | 1 | 69.2 | 83.5 | 23 / 35 | 6107 |
| 4 | 1 | 70.7 | 92.7 | 24 / 35 | 5965 |
| 5 | 1 | 68.2 | 80.3 | 19 / 35 | 5964 |
| 6 | 1 | 71.4 | 90.8 | 26 / 35 | 6577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 91% |
| stelo.SoJNanoMelee 1.1 | 47 | 62% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 93% |
| tj.zombie1n 1.0.1 | 13 | 69% |
| yk.JahMicro 1.0 | 9 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1127. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 32 | 45% | 54 |
| kawigi.nano.Lib 1.0 | 18 | 25% | 79 |
| tj.zombie1n 1.0.1 | 7 | 10% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 8 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 15 |
| repositorio.NanoStep 1.0 | 1 | 1% | 7 |
| yk.JahMicro 1.0 | 0 | 0% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 70.2 | 107 / 210 | 3.68 | 16.5% | 29784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.5% | 107 |
| oog.melee.Corsair 1.0 | 2.3 | 12.4% | 24 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.2% | 29 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.0% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.9% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 72.4 | 19 / 35 | 5474 |
| 2 | 1 | 65.6 | 74.6 | 19 / 35 | 5075 |
| 3 | 1 | 60.4 | 60.3 | 12 / 35 | 4465 |
| 4 | 1 | 62.3 | 64.4 | 17 / 35 | 4399 |
| 5 | 1 | 66.9 | 77.1 | 21 / 35 | 5320 |
| 6 | 1 | 65.3 | 72.4 | 19 / 35 | 5051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 81% |
| oog.melee.Corsair 1.0 | 36 | 94% |
| ahf.NanoAndrew .4 | 18 | 100% |
| sam.Samspin 1.0 | 11 | 73% |
| EBBU.Sim2 1.02 | 7 | 71% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 27% | 51 |
| zyx.nano.BacillusComma 1.0 | 19 | 18% | 27 |
| robar.nano.Assertive_Melee 0.2 | 14 | 14% | 19 |
| EBBU.Sim2 1.02 | 13 | 13% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 10% | 10 |
| oog.melee.Corsair 1.0 | 7 | 7% | 38 |
| sam.Samspin 1.0 | 5 | 5% | 14 |
| ahf.NanoAndrew .4 | 4 | 4% | 23 |
| sample.TrackFire 1.0 | 3 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.2 | 145 / 210 | 2.15 | 19.4% | 31104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.4% | 145 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 21 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.5% | 14 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.3% | 7 |
| fm.claire 1.7 | 6.3 | 8.6% | 2 |
| sample.SpinBot 1.0 | 8.7 | 5.7% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.5 | 24 / 35 | 4964 |
| 2 | 1 | 71.2 | 93.7 | 27 / 35 | 5513 |
| 3 | 1 | 69.6 | 88.9 | 27 / 35 | 5164 |
| 4 | 1 | 68.6 | 88.3 | 22 / 35 | 4864 |
| 5 | 1 | 68.7 | 83.8 | 22 / 35 | 5633 |
| 6 | 1 | 68.3 | 86.0 | 23 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 89% |
| oog.melee.CapuletDroid 1.1 | 41 | 88% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| fm.claire 1.7 | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 20% | 83 |
| arthord.NanoSatanMelee Beta | 13 | 20% | 25 |
| oog.melee.CapuletDroid 1.1 | 12 | 18% | 19 |
| gh.nano.Grofvuil 0.2 | 11 | 17% | 34 |
| sample.SpinBot 1.0 | 5 | 8% | 7 |
| fm.claire 1.7 | 4 | 6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 15 |
| kurios.DOSexe .9b | 2 | 3% | 10 |
| pa.Improved 1.0 | 2 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.7 | 125 / 210 | 2.47 | 18.6% | 32287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.6% | 125 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 30 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.7% | 29 |
| mz.MicroGodMelee 1 | 4.0 | 12.7% | 13 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 6 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 1 |
| acogdev.alpha 0.2 | 8.3 | 5.5% | 1 |
| fire219.CatBot 1.0 | 8.3 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.5 | 23 / 35 | 5414 |
| 2 | 1 | 67.4 | 81.3 | 17 / 35 | 5402 |
| 3 | 1 | 70.3 | 90.2 | 25 / 35 | 5564 |
| 4 | 1 | 70.4 | 90.5 | 23 / 35 | 6054 |
| 5 | 1 | 66.3 | 74.9 | 17 / 35 | 4868 |
| 6 | 1 | 68.0 | 82.9 | 20 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 62 | 69% |
| mz.MicroGodMelee 1 | 43 | 98% |
| gh.micro.Gruweltje 0.7 | 36 | 75% |
| caimano.Furia_Ceca 0.22 | 7 | 57% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 23 | 27% | 69 |
| gh.micro.Gruweltje 0.7 | 22 | 26% | 57 |
| mz.MicroGodMelee 1 | 17 | 20% | 50 |
| acogdev.alpha 0.2 | 6 | 7% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 7 |
| DBall.Anarchy 0.1 | 3 | 4% | 10 |
| el.JumpShoot 0.2 | 3 | 4% | 5 |
| fire219.CatBot 1.0 | 3 | 4% | 3 |
| mbro.Detektor3 0.1.1 | 3 | 4% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.8 | 106 / 210 | 3.27 | 17.0% | 31200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.0% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 14.4% | 39 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.2% | 5 |
| germ.TheMind .2 | 5.2 | 9.2% | 6 |
| awesomeness.Elite 1.0 | 6.2 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 7.0 | 7.5% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 7.9% | 2 |
| sample.Crazy 1.0 | 8.7 | 6.7% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.1 | 22 / 35 | 5574 |
| 2 | 1 | 65.9 | 73.0 | 16 / 35 | 5538 |
| 3 | 1 | 65.7 | 71.7 | 15 / 35 | 5279 |
| 4 | 1 | 68.6 | 87.0 | 22 / 35 | 5243 |
| 5 | 1 | 62.8 | 64.1 | 16 / 35 | 4990 |
| 6 | 1 | 64.8 | 74.6 | 15 / 35 | 4576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 62% |
| germ.TheMind .2 | 9 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 45% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 25% | 46 |
| germ.TheMind .2 | 9 | 8% | 19 |
| awesomeness.Elite 1.0 | 5 | 5% | 8 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 5 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 8 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.3 | 162 / 210 | 1.96 | 20.5% | 31914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.5% | 162 |
| rz.HawkOnFire 0.1 | 2.5 | 13.0% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 15 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 4 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.0% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.0% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.6% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.6% | 7 |
| spinnercat.Omen 1.0 | 8.5 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.1 | 30 / 35 | 5369 |
| 2 | 1 | 70.9 | 88.6 | 27 / 35 | 5126 |
| 3 | 1 | 69.7 | 86.0 | 25 / 35 | 5208 |
| 4 | 1 | 71.0 | 92.1 | 26 / 35 | 5402 |
| 5 | 1 | 70.1 | 87.6 | 26 / 35 | 5059 |
| 6 | 1 | 71.9 | 90.5 | 28 / 35 | 5750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 99% |
| nz.jdc.nano.GridFu 1.0 | 42 | 86% |
| timmit.nano.TimDog 0.33 | 16 | 94% |
| maribo.IotaCT 1.1 | 13 | 92% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| ratosh.Wesco 1.4 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 8 | 17% | 57 |
| ratosh.Wesco 1.4 | 8 | 17% | 21 |
| rz.HawkOnFire 0.1 | 7 | 15% | 63 |
| timmit.nano.TimDog 0.33 | 7 | 15% | 26 |
| stelo.PatternRobot 1.0 | 7 | 15% | 15 |
| maribo.IotaCT 1.1 | 4 | 8% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 6 |
| rrh.Iwillfindyou 2.0 | 2 | 4% | 2 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.6 | 173 / 210 | 1.75 | 21.7% | 40232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.7% | 173 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 11 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 1 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 2 |
| zyx.micro.Ant 1.1 | 5.2 | 9.0% | 9 |
| sanja.First 0.1 | 6.0 | 8.5% | 3 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 8 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.4 | 29 / 35 | 6864 |
| 2 | 1 | 72.1 | 94.6 | 29 / 35 | 6532 |
| 3 | 1 | 69.4 | 81.3 | 24 / 35 | 6386 |
| 4 | 1 | 72.2 | 90.5 | 30 / 35 | 6992 |
| 5 | 1 | 72.0 | 95.6 | 29 / 35 | 6450 |
| 6 | 1 | 72.8 | 95.6 | 32 / 35 | 7008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 96% |
| baal.nano.N 1.42 | 34 | 100% |
| cvt.Firsty 1.0 | 27 | 81% |
| sanja.First 0.1 | 23 | 100% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 32% | 40 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 55 |
| cvt.Firsty 1.0 | 5 | 13% | 30 |
| baal.nano.N 1.42 | 4 | 11% | 28 |
| amk.Punbot.Punbot 0.01 | 4 | 11% | 9 |
| sample.RamFire 1.0 | 3 | 8% | 3 |
| Grystrion.TrackerWO 1.0 | 2 | 5% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 5 |
| sanja.First 0.1 | 1 | 3% | 20 |

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 68.0 | 70 / 210 | 3.88 | 15.0% | 28966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.6% | 93 |
| hadur117.micro.SaorOG4 0.1 | 2.2 | 15.0% | 70 |
| cs.Wren 1.0 | 3.2 | 12.4% | 18 |
| js.PinBall 1.6 | 4.0 | 11.5% | 15 |
| mz.Cork 0.1 | 4.7 | 10.5% | 3 |
| evd.X1 0.01 | 6.7 | 8.1% | 2 |
| joe.ADinosaur 1.0 | 6.7 | 8.7% | 1 |
| jsal.Jsalbot 1.0 | 7.7 | 7.2% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 7 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 73.3 | 11 / 35 | 4924 |
| 2 | 3 | 60.2 | 61.6 | 13 / 35 | 4344 |
| 3 | 2 | 63.4 | 69.2 | 13 / 35 | 5289 |
| 4 | 2 | 66.1 | 78.7 | 15 / 35 | 5115 |
| 5 | 2 | 60.5 | 62.2 | 8 / 35 | 4505 |
| 6 | 2 | 60.8 | 63.2 | 10 / 35 | 4789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 37% |
| cs.Wren 1.0 | 22 | 95% |
| js.PinBall 1.6 | 9 | 100% |
| mz.Cork 0.1 | 8 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 144 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 89 | 62% | 118 |
| cs.Wren 1.0 | 15 | 10% | 31 |
| js.PinBall 1.6 | 9 | 6% | 17 |
| PSW.Relentless 0.1 | 9 | 6% | 8 |
| evd.X1 0.01 | 8 | 6% | 9 |
| joe.ADinosaur 1.0 | 6 | 4% | 7 |
| mz.Cork 0.1 | 4 | 3% | 11 |
| jsal.Jsalbot 1.0 | 3 | 2% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.7 | 131 / 210 | 2.47 | 18.8% | 29367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.8% | 131 |
| myl.nano.Graviton 1.10 | 2.7 | 11.8% | 21 |
| ntc.Opposite 1.5 | 3.7 | 10.9% | 7 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.7% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.2% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.9% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 3 |
| DBall.NUKE 0.1 | 8.0 | 7.6% | 2 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.7 | 19 / 35 | 4763 |
| 2 | 1 | 67.9 | 81.9 | 25 / 35 | 4783 |
| 3 | 1 | 69.9 | 88.6 | 25 / 35 | 5393 |
| 4 | 1 | 67.5 | 85.7 | 16 / 35 | 4605 |
| 5 | 1 | 68.4 | 85.4 | 23 / 35 | 4719 |
| 6 | 1 | 68.3 | 81.9 | 23 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 89% |
| stelo.AreaTargetingBot 1.1 | 40 | 65% |
| disan.Chair 2.2.0 | 17 | 88% |
| ntc.Opposite 1.5 | 14 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 83% |
| donjezza.Muncho 1.0 | 9 | 89% |
| DBall.NUKE 0.1 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 27 | 34% | 52 |
| pfvicm.Sobieski 7.2.3b | 17 | 21% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 11% | 20 |
| myl.nano.Graviton 1.10 | 8 | 10% | 48 |
| ntc.Opposite 1.5 | 8 | 10% | 24 |
| disan.Chair 2.2.0 | 4 | 5% | 9 |
| donjezza.Muncho 1.0 | 3 | 4% | 12 |
| DBall.NUKE 0.1 | 2 | 3% | 10 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.2 | 86 / 210 | 3.77 | 14.8% | 21779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.0 | 14.3% | 42 |
| hadur117.micro.SaorOG4 0.1 | 2.0 | 14.8% | 86 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 43 |
| yagami.Tidus 0.11 | 3.8 | 13.0% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.3% | 21 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 5 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 67.3 | 13 / 35 | 3545 |
| 2 | 2 | 63.6 | 68.3 | 13 / 35 | 3929 |
| 3 | 2 | 62.0 | 68.3 | 13 / 35 | 3552 |
| 4 | 3 | 60.1 | 61.9 | 11 / 35 | 3199 |
| 5 | 1 | 67.1 | 81.0 | 22 / 35 | 3816 |
| 6 | 2 | 62.6 | 68.6 | 14 / 35 | 3738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 76% |
| oog.melee.Capulet 1.2 | 28 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 95% |
| yagami.Tidus 0.11 | 17 | 82% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 27% | 55 |
| kawigi.micro.Shiz 1.1 | 24 | 19% | 43 |
| yagami.Tidus 0.11 | 24 | 19% | 41 |
| ejb.Polaris 1.0.1 | 15 | 12% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 8% | 32 |
| stelo.MirrorNano 1.3 | 10 | 8% | 10 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.0 | 142 / 210 | 2.71 | 18.0% | 27315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.0% | 142 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 15 |
| wee.Gem 1.8.4 | 3.2 | 11.7% | 22 |
| wompi.Quokka 1.6 | 3.5 | 11.8% | 17 |
| ratosh.Nobo 0.21 | 5.3 | 10.4% | 4 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.3 | 26 / 35 | 4842 |
| 2 | 1 | 67.1 | 78.7 | 24 / 35 | 4617 |
| 3 | 1 | 64.9 | 74.3 | 21 / 35 | 4371 |
| 4 | 1 | 66.4 | 79.0 | 21 / 35 | 4490 |
| 5 | 1 | 64.7 | 76.5 | 20 / 35 | 4168 |
| 6 | 1 | 69.8 | 90.8 | 30 / 35 | 4827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 95% |
| wee.Gem 1.8.4 | 41 | 98% |
| wompi.Quokka 1.6 | 19 | 95% |
| m3thos.Eva00 1.1 | 15 | 80% |
| ratosh.Nobo 0.21 | 11 | 100% |
| bayen.UbaMicro 1.4 | 9 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 18% | 59 |
| wompi.Quokka 1.6 | 10 | 15% | 24 |
| ratosh.Nobo 0.21 | 8 | 12% | 22 |
| maribo.FollowFire 1 | 8 | 12% | 9 |
| m3thos.Eva00 1.1 | 7 | 10% | 23 |
| wee.Gem 1.8.4 | 6 | 9% | 47 |
| bayen.UbaMicro 1.4 | 6 | 9% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 9% | 7 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 6 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 85.4 | 63 / 210 | 2.31 | 20.2% | 47940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 20.2% | 63 |
| wompi.Wallaby 5.1 | 1.7 | 20.4% | 131 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 7 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.8 | 84.8 | 9 / 35 | 7259 |
| 2 | 1 | 72.7 | 87.6 | 13 / 35 | 8201 |
| 3 | 1 | 72.0 | 85.7 | 10 / 35 | 8398 |
| 4 | 1 | 72.1 | 86.3 | 13 / 35 | 8066 |
| 5 | 1 | 71.7 | 85.1 | 11 / 35 | 8134 |
| 6 | 2 | 70.8 | 82.9 | 7 / 35 | 7882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 133 | 30% |
| mz.NanoGod 2.02 | 12 | 75% |
| stelo.PianistNano 1.2 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| ayk.WallHugger 1.0 | 4 | 50% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 116 | 78% | 156 |
| mz.NanoGod 2.02 | 20 | 14% | 30 |
| ayk.WallHugger 1.0 | 5 | 3% | 7 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 5 |
| stelo.PianistNano 1.2 | 3 | 2% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.8 | 107 / 210 | 3.45 | 16.4% | 26848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.4% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.7% | 28 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.1% | 23 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 13 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.2% | 6 |
| conscience.Electron 1.3g | 6.3 | 8.9% | 2 |
| ap.Frederick 1.1 | 8.0 | 6.9% | 14 |
| dl.BetterWalls 1.0 | 9.2 | 6.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 67.3 | 16 / 35 | 4479 |
| 2 | 1 | 63.1 | 68.9 | 18 / 35 | 4242 |
| 3 | 1 | 60.8 | 60.3 | 15 / 35 | 4239 |
| 4 | 1 | 65.7 | 76.2 | 17 / 35 | 4707 |
| 5 | 1 | 68.7 | 88.6 | 24 / 35 | 4656 |
| 6 | 1 | 64.8 | 75.2 | 17 / 35 | 4525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 68% |
| dummy.micro.Sparrow 2.5 | 30 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 30 | 87% |
| bvh.micro.Freya 0.3 | 13 | 85% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 29 | 28% | 68 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 40 |
| dummy.micro.Sparrow 2.5 | 12 | 12% | 38 |
| conscience.Electron 1.3g | 9 | 9% | 12 |
| dl.BetterWalls 1.0 | 9 | 9% | 10 |
| bvh.micro.Freya 0.3 | 8 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 12 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 84.7 | 151 / 210 | 2.38 | 20.8% | 40477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.8% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 23 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 9 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.2% | 10 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 6 |
| dsw.StaticD 1.0 | 6.0 | 8.9% | 4 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.7% | 0 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 3 |
| sample.Corners 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 85.4 | 25 / 35 | 6842 |
| 2 | 1 | 72.4 | 91.1 | 28 / 35 | 6910 |
| 3 | 1 | 70.3 | 80.6 | 24 / 35 | 7059 |
| 4 | 1 | 72.7 | 90.5 | 28 / 35 | 7237 |
| 5 | 1 | 68.9 | 79.0 | 22 / 35 | 6013 |
| 6 | 1 | 70.1 | 81.3 | 24 / 35 | 6416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 96% |
| sul.Lunar 1.1 | 32 | 100% |
| supersample.SuperBoxBot 1.0 | 30 | 93% |
| dsw.StaticD 1.0 | 16 | 94% |
| mme.NikeEnhanced 2.0 | 9 | 67% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 25% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 20% | 59 |
| mme.NikeEnhanced 2.0 | 10 | 16% | 18 |
| sul.Lunar 1.1 | 6 | 10% | 39 |
| dsw.StaticD 1.0 | 4 | 7% | 22 |
| sample.MyFirstRobot 1.0 | 4 | 7% | 10 |
| sample.Corners 1.0 | 4 | 7% | 6 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 10 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.6 | 111 / 210 | 2.84 | 18.4% | 38339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.4% | 111 |
| radnor.DoctorBob 1.42 | 2.5 | 13.2% | 36 |
| mld.Wisdom 1.0 | 3.3 | 11.7% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.5% | 6 |
| sample.Walls 1.0 | 7.5 | 7.2% | 6 |
| jangs.ns51 1.0 | 8.2 | 6.4% | 1 |
| GarmBox.Oranges 1.0 | 8.3 | 6.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 76.2 | 19 / 35 | 6686 |
| 2 | 1 | 67.3 | 78.1 | 20 / 35 | 5822 |
| 3 | 1 | 69.2 | 84.8 | 19 / 35 | 6508 |
| 4 | 1 | 65.5 | 73.0 | 16 / 35 | 5830 |
| 5 | 1 | 67.0 | 79.0 | 16 / 35 | 6069 |
| 6 | 1 | 70.8 | 86.3 | 21 / 35 | 7424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 54 | 89% |
| radnor.DoctorBob 1.42 | 28 | 71% |
| mld.Wisdom 1.0 | 18 | 61% |
| KiraNL.Chupacabra 0.4 | 16 | 81% |
| amz.NanoClone 1.41 | 11 | 82% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 30% | 49 |
| mld.Wisdom 1.0 | 27 | 27% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 18% | 66 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 25 |
| amz.NanoClone 1.41 | 5 | 5% | 14 |
| jangs.ns51 1.0 | 3 | 3% | 9 |
| sample.Walls 1.0 | 3 | 3% | 4 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

