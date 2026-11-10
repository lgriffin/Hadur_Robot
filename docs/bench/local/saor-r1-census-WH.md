# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.1 | 95 / 210 | 2.43 | 19.3% | 39334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 19.3% | 95 |
| mz.AntiGrav 1.0 | 2.3 | 15.3% | 40 |
| radnor.DoctorBob 1.42 | 3.0 | 14.2% | 22 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 32 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 11 |
| sample.Walls 1.0 | 6.2 | 7.3% | 2 |
| jangs.ns51 1.0 | 6.8 | 6.7% | 7 |
| GarmBox.Oranges 1.0 | 8.0 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 88.9 | 22 / 35 | 6816 |
| 2 | 1 | 71.0 | 86.7 | 17 / 35 | 7274 |
| 3 | 1 | 66.7 | 74.9 | 13 / 35 | 6376 |
| 4 | 1 | 67.6 | 79.7 | 9 / 35 | 6175 |
| 5 | 1 | 69.0 | 83.8 | 15 / 35 | 6049 |
| 6 | 1 | 71.6 | 90.8 | 19 / 35 | 6644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 60 | 65% |
| radnor.DoctorBob 1.42 | 37 | 84% |
| mld.Infinity 2.2 | 30 | 50% |
| amz.NanoClone 1.41 | 8 | 50% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 48 | 42% | 99 |
| mld.Infinity 2.2 | 22 | 19% | 10 |
| radnor.DoctorBob 1.42 | 20 | 17% | 48 |
| amz.NanoClone 1.41 | 16 | 14% | 19 |
| jangs.ns51 1.0 | 5 | 4% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 1 | 1% | 12 |
| arthord.MannyPacquiao Beta | 1 | 1% | 7 |

## Melee bench: F02

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.7 | 84 / 210 | 2.82 | 16.7% | 27961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.3 | 16.7% | 84 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.2% | 67 |
| mld.DustBunny 3.8 | 2.5 | 14.2% | 30 |
| maribo.melee.BMV 0.1 | 4.7 | 10.0% | 2 |
| zyx.nano.Ant 1.1 | 5.5 | 9.0% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.4% | 13 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.3% | 4 |
| fullsail.SweetTea 1.1 | 7.8 | 6.8% | 7 |
| bzdp.BoxCar 2.0 | 8.7 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 80.0 | 14 / 35 | 4231 |
| 2 | 1 | 66.9 | 87.0 | 15 / 35 | 4602 |
| 3 | 1 | 68.1 | 91.7 | 17 / 35 | 4954 |
| 4 | 3 | 56.0 | 45.7 | 5 / 35 | 4452 |
| 5 | 1 | 66.2 | 84.1 | 15 / 35 | 4726 |
| 6 | 1 | 68.1 | 89.8 | 18 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 61 | 70% |
| mld.DustBunny 3.8 | 44 | 52% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 22% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 5 | 40% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 50 | 39% | 76 |
| oog.melee.Mercutio 1.0 | 27 | 21% | 66 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 13% | 21 |
| zyx.nano.Ant 1.1 | 10 | 8% | 14 |
| cs.Grudge 1.0 | 9 | 7% | 9 |
| fullsail.SweetTea 1.1 | 8 | 6% | 9 |
| bzdp.BoxCar 2.0 | 4 | 3% | 4 |
| maribo.melee.BMV 0.1 | 1 | 1% | 6 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.6 | 45 / 210 | 3.47 | 16.2% | 32838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.0 | 17.2% | 92 |
| hadur117.micro.SaorWH 0.1 | 2.0 | 16.2% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.8% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.6% | 32 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 15 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.4% | 2 |
| sample.Fire 1.0 | 9.0 | 5.4% | 5 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 74.0 | 9 / 35 | 5614 |
| 2 | 2 | 66.3 | 79.4 | 8 / 35 | 5413 |
| 3 | 2 | 60.9 | 61.6 | 7 / 35 | 4952 |
| 4 | 2 | 65.6 | 72.7 | 9 / 35 | 5603 |
| 5 | 2 | 65.0 | 73.0 | 6 / 35 | 5701 |
| 6 | 2 | 65.2 | 74.9 | 6 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 46% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% |
| cb.nano.Insomnia 1.0 | 11 | 55% |
| myl.nano.KomoriNinja 1.1 | 8 | 50% |
| fm.mammillarias 1.3 | 5 | 40% |
| sp.Nanos.Ember 1.1 | 5 | 100% |
| sample.Fire 1.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 61 | 37% | 88 |
| stelo.SoRobotNanoMelee 1.2 | 39 | 24% | 43 |
| cb.nano.Insomnia 1.0 | 24 | 15% | 22 |
| fm.mammillarias 1.3 | 17 | 10% | 18 |
| myl.nano.KomoriNinja 1.1 | 16 | 10% | 23 |
| sample.Fire 1.0 | 5 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.2 | 78 / 210 | 2.70 | 18.0% | 35621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 18.0% | 78 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.9% | 52 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.8% | 18 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.0% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.5% | 2 |
| tj.zombie1n 1.0.1 | 5.8 | 9.0% | 14 |
| yk.JahMicro 1.0 | 7.0 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.3% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 13 / 35 | 5484 |
| 2 | 1 | 66.0 | 78.7 | 10 / 35 | 5703 |
| 3 | 1 | 67.3 | 81.6 | 9 / 35 | 6376 |
| 4 | 1 | 67.6 | 83.2 | 14 / 35 | 5873 |
| 5 | 1 | 66.5 | 77.1 | 12 / 35 | 6266 |
| 6 | 1 | 68.9 | 84.8 | 20 / 35 | 5919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 47% |
| stelo.SoJNanoMelee 1.1 | 30 | 40% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 69% |
| tj.zombie1n 1.0.1 | 7 | 43% |
| yk.JahMicro 1.0 | 6 | 33% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 45% | 96 |
| stelo.SoJNanoMelee 1.1 | 42 | 32% | 49 |
| tj.zombie1n 1.0.1 | 10 | 8% | 10 |
| tvv.micro.Antares 1.1.1 | 5 | 4% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 4% | 9 |
| yk.JahMicro 1.0 | 4 | 3% | 0 |
| repositorio.NanoStep 1.0 | 1 | 1% | 10 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 66.7 | 66 / 210 | 4.00 | 15.0% | 28099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 15.0% | 66 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 30 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.5% | 35 |
| sam.Samspin 1.0 | 4.7 | 10.4% | 22 |
| EBBU.Sim2 1.02 | 6.5 | 9.5% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.2% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 72.7 | 9 / 35 | 5385 |
| 2 | 1 | 60.2 | 62.9 | 11 / 35 | 4409 |
| 3 | 1 | 60.8 | 64.4 | 11 / 35 | 4400 |
| 4 | 1 | 60.5 | 63.8 | 10 / 35 | 4367 |
| 5 | 1 | 64.7 | 72.4 | 13 / 35 | 5305 |
| 6 | 1 | 60.8 | 63.8 | 12 / 35 | 4233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 57% |
| oog.melee.Corsair 1.0 | 22 | 82% |
| ahf.NanoAndrew .4 | 14 | 71% |
| EBBU.Sim2 1.02 | 11 | 73% |
| sam.Samspin 1.0 | 10 | 70% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 0% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 18% | 42 |
| bwbaugh.nano.Tirunculus 0.0.0a | 22 | 15% | 21 |
| sam.Samspin 1.0 | 21 | 14% | 29 |
| EBBU.Sim2 1.02 | 21 | 14% | 25 |
| zyx.nano.BacillusComma 1.0 | 15 | 10% | 17 |
| robar.nano.Assertive_Melee 0.2 | 15 | 10% | 17 |
| oog.melee.Corsair 1.0 | 10 | 7% | 29 |
| ahf.NanoAndrew .4 | 10 | 7% | 21 |
| sample.TrackFire 1.0 | 5 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.6 | 77 / 210 | 2.66 | 17.3% | 30003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.3 | 17.3% | 77 |
| d414.nano.Quantum 1.0.0 | 1.7 | 15.9% | 68 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.6% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.5% | 20 |
| fm.claire 1.7 | 4.8 | 9.3% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 9 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.3% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.7% | 5 |
| pa.Improved 1.0 | 9.2 | 6.5% | 7 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.9 | 16 / 35 | 5361 |
| 2 | 1 | 66.7 | 85.1 | 11 / 35 | 5097 |
| 3 | 2 | 64.5 | 76.5 | 13 / 35 | 4620 |
| 4 | 1 | 64.2 | 74.9 | 11 / 35 | 4805 |
| 5 | 1 | 68.3 | 89.2 | 16 / 35 | 5419 |
| 6 | 2 | 65.8 | 81.9 | 10 / 35 | 4701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 35% |
| oog.melee.CapuletDroid 1.1 | 19 | 68% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| sample.SpinBot 1.0 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 43% |
| pa.Improved 1.0 | 5 | 20% |
| fm.claire 1.7 | 2 | 0% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 46% | 87 |
| oog.melee.CapuletDroid 1.1 | 20 | 15% | 18 |
| fm.claire 1.7 | 13 | 10% | 15 |
| gh.nano.Grofvuil 0.2 | 12 | 9% | 32 |
| sample.SpinBot 1.0 | 11 | 8% | 19 |
| pa.Improved 1.0 | 6 | 5% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9b | 4 | 3% | 10 |
| arthord.NanoSatanMelee Beta | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 73.4 | 52 / 210 | 3.39 | 15.8% | 29795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.5 | 15.8% | 52 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 45 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 15.0% | 59 |
| mz.MicroGodMelee 1 | 3.8 | 12.9% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 14 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.4% | 3 |
| el.JumpShoot 0.2 | 7.0 | 7.0% | 3 |
| acogdev.alpha 0.2 | 8.2 | 6.5% | 1 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.2% | 2 |
| fire219.CatBot 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.7 | 12 / 35 | 5422 |
| 2 | 2 | 63.5 | 76.2 | 2 / 35 | 4755 |
| 3 | 1 | 65.8 | 76.5 | 12 / 35 | 5119 |
| 4 | 1 | 66.4 | 81.6 | 13 / 35 | 5014 |
| 5 | 3 | 60.1 | 65.1 | 3 / 35 | 4595 |
| 6 | 1 | 62.6 | 67.6 | 10 / 35 | 4890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 21% |
| mz.MicroGodMelee 1 | 36 | 64% |
| gh.micro.Gruweltje 0.7 | 22 | 23% |
| DBall.Anarchy 0.1 | 6 | 83% |
| el.JumpShoot 0.2 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 38% | 68 |
| gh.micro.Gruweltje 0.7 | 25 | 16% | 33 |
| mz.MicroGodMelee 1 | 22 | 14% | 40 |
| caimano.Furia_Ceca 0.22 | 15 | 9% | 19 |
| acogdev.alpha 0.2 | 14 | 9% | 14 |
| DBall.Anarchy 0.1 | 7 | 4% | 15 |
| el.JumpShoot 0.2 | 7 | 4% | 10 |
| mbro.Detektor3 0.1.1 | 5 | 3% | 7 |
| fire219.CatBot 1.0 | 3 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 63.2 | 46 / 210 | 4.31 | 13.8% | 27338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.5% | 70 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 14.5% | 47 |
| hadur117.micro.SaorWH 0.1 | 2.5 | 13.8% | 46 |
| germ.TheMind .2 | 5.0 | 9.7% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 6.8 | 8.5% | 11 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 9 |
| sample.Crazy 1.0 | 8.3 | 7.3% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 60.0 | 4 / 35 | 4206 |
| 2 | 2 | 61.8 | 69.2 | 11 / 35 | 4205 |
| 3 | 2 | 64.1 | 74.6 | 10 / 35 | 4709 |
| 4 | 3 | 58.7 | 60.6 | 5 / 35 | 4386 |
| 5 | 3 | 57.5 | 55.2 | 6 / 35 | 4428 |
| 6 | 2 | 60.9 | 59.4 | 10 / 35 | 5404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 30% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 55% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| germ.TheMind .2 | 6 | 33% |
| sample.Crazy 1.0 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 46% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 18% | 41 |
| germ.TheMind .2 | 22 | 13% | 21 |
| stelo.UntouchableNano 1.3 | 14 | 9% | 19 |
| awesomeness.Elite 1.0 | 6 | 4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 3% | 7 |
| sample.Crazy 1.0 | 4 | 2% | 13 |
| qualidafial.MajorDick 1.0.1 | 4 | 2% | 4 |
| mym.EdgeStalker 1.0 | 3 | 2% | 2 |

## Melee bench: F09

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.7 | 82 / 210 | 2.83 | 16.8% | 25656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 16.8% | 82 |
| rz.HawkOnFire 0.1 | 2.0 | 15.0% | 54 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 29 |
| maribo.IotaCT 1.1 | 4.3 | 10.9% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.2% | 2 |
| timmit.nano.TimDog 0.33 | 6.5 | 9.1% | 4 |
| ratosh.Wesco 1.4 | 7.5 | 8.4% | 7 |
| stelo.PatternRobot 1.0 | 7.8 | 8.1% | 9 |
| spinnercat.Omen 1.0 | 8.0 | 8.1% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.3 | 13 / 35 | 4480 |
| 2 | 1 | 63.3 | 72.1 | 9 / 35 | 3890 |
| 3 | 1 | 66.2 | 80.0 | 17 / 35 | 4150 |
| 4 | 1 | 66.4 | 78.7 | 18 / 35 | 4356 |
| 5 | 1 | 65.2 | 80.0 | 10 / 35 | 4141 |
| 6 | 1 | 67.9 | 86.0 | 15 / 35 | 4639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 56 | 61% |
| nz.jdc.nano.GridFu 1.0 | 24 | 67% |
| maribo.IotaCT 1.1 | 14 | 57% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| stelo.PatternRobot 1.0 | 10 | 40% |
| timmit.nano.TimDog 0.33 | 7 | 86% |
| ratosh.Wesco 1.4 | 4 | 0% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 42 | 33% | 73 |
| ratosh.Wesco 1.4 | 23 | 18% | 29 |
| stelo.PatternRobot 1.0 | 22 | 17% | 27 |
| nz.jdc.nano.GridFu 1.0 | 18 | 14% | 36 |
| maribo.IotaCT 1.1 | 15 | 12% | 27 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 1% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.9 | 102 / 210 | 2.54 | 18.5% | 34464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 18.5% | 102 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 30 |
| baal.nano.N 1.42 | 3.0 | 11.5% | 9 |
| zyx.micro.Ant 1.1 | 3.8 | 10.8% | 30 |
| Grystrion.TrackerWO 1.0 | 6.0 | 9.5% | 3 |
| sanja.First 0.1 | 6.5 | 8.4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.4% | 4 |
| cvt.Firsty 1.0 | 7.7 | 7.9% | 20 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 6 |
| sample.RamFire 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 22 / 35 | 5701 |
| 2 | 1 | 67.8 | 81.0 | 16 / 35 | 5984 |
| 3 | 1 | 66.9 | 80.6 | 13 / 35 | 6045 |
| 4 | 1 | 65.9 | 75.9 | 16 / 35 | 5411 |
| 5 | 1 | 68.3 | 87.3 | 17 / 35 | 5849 |
| 6 | 1 | 67.4 | 84.1 | 18 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 85% |
| baal.nano.N 1.42 | 22 | 100% |
| cvt.Firsty 1.0 | 19 | 37% |
| zyx.micro.Ant 1.1 | 15 | 47% |
| sanja.First 0.1 | 14 | 86% |
| amk.Punbot.Punbot 0.01 | 13 | 77% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 88% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 52 | 48% | 65 |
| cvt.Firsty 1.0 | 21 | 19% | 32 |
| Grystrion.TrackerWO 1.0 | 10 | 9% | 23 |
| tvv.nano.Polaris 1.2 | 8 | 7% | 33 |
| sanja.First 0.1 | 7 | 6% | 26 |
| amk.Punbot.Punbot 0.01 | 5 | 5% | 4 |
| sample.RamFire 1.0 | 3 | 3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 5 |
| baal.nano.N 1.42 | 1 | 1% | 18 |

## Melee bench: F11

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 69.8 | 67 / 210 | 3.71 | 14.8% | 27187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.6% | 82 |
| hadur117.micro.SaorWH 0.1 | 1.8 | 14.8% | 67 |
| cs.Wren 1.0 | 3.0 | 12.5% | 22 |
| js.PinBall 1.6 | 4.5 | 11.3% | 9 |
| mz.Cork 0.1 | 4.7 | 11.0% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 2 |
| evd.X1 0.01 | 7.0 | 8.5% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 8 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 69.8 | 10 / 35 | 4551 |
| 2 | 2 | 61.0 | 68.9 | 8 / 35 | 4506 |
| 3 | 2 | 63.4 | 72.4 | 14 / 35 | 4360 |
| 4 | 2 | 62.1 | 68.3 | 10 / 35 | 4684 |
| 5 | 1 | 63.3 | 72.1 | 12 / 35 | 4826 |
| 6 | 2 | 61.3 | 67.6 | 13 / 35 | 4260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 54% |
| cs.Wren 1.0 | 15 | 60% |
| js.PinBall 1.6 | 9 | 100% |
| mz.Cork 0.1 | 6 | 67% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| donjezza.Jezza 1.0 | 3 | 0% |
| evd.X1 0.01 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 70 | 48% | 106 |
| cs.Wren 1.0 | 22 | 15% | 28 |
| evd.X1 0.01 | 19 | 13% | 21 |
| joe.ADinosaur 1.0 | 10 | 7% | 12 |
| PSW.Relentless 0.1 | 7 | 5% | 6 |
| js.PinBall 1.6 | 6 | 4% | 15 |
| mz.Cork 0.1 | 5 | 3% | 10 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.1 | 62 / 210 | 3.33 | 16.1% | 26978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.2 | 16.1% | 62 |
| myl.nano.Graviton 1.10 | 2.7 | 12.8% | 51 |
| ntc.Opposite 1.5 | 3.5 | 11.4% | 14 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.0% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 6 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.6% | 7 |
| DBall.NUKE 0.1 | 6.8 | 8.9% | 13 |
| disan.Chair 2.2.0 | 7.5 | 8.7% | 15 |
| donjezza.Muncho 1.0 | 9.2 | 5.7% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 75.2 | 8 / 35 | 4601 |
| 2 | 2 | 57.8 | 59.7 | 5 / 35 | 3949 |
| 3 | 1 | 64.7 | 74.6 | 14 / 35 | 4716 |
| 4 | 1 | 65.7 | 77.8 | 12 / 35 | 4952 |
| 5 | 1 | 65.5 | 79.7 | 13 / 35 | 4248 |
| 6 | 1 | 65.2 | 77.8 | 10 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 33 | 42% |
| myl.nano.Graviton 1.10 | 24 | 29% |
| disan.Chair 2.2.0 | 18 | 67% |
| DBall.NUKE 0.1 | 11 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| ntc.Opposite 1.5 | 8 | 50% |
| donjezza.Muncho 1.0 | 6 | 33% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 44 | 30% | 52 |
| stelo.AreaTargetingBot 1.1 | 28 | 19% | 41 |
| ntc.Opposite 1.5 | 20 | 14% | 25 |
| pfvicm.Sobieski 7.2.3b | 18 | 12% | 25 |
| disan.Chair 2.2.0 | 11 | 7% | 12 |
| donjezza.Muncho 1.0 | 10 | 7% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 6% | 17 |
| DBall.NUKE 0.1 | 6 | 4% | 19 |
| pbg.R2D2 1.0 | 2 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 65.6 | 32 / 210 | 4.10 | 13.9% | 24630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.8 | 14.5% | 58 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 62 |
| hadur117.micro.SaorWH 0.1 | 2.8 | 13.9% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.0% | 29 |
| yagami.Tidus 0.11 | 4.2 | 12.2% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 16 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 61.3 | 3 / 35 | 4322 |
| 2 | 5 | 59.3 | 60.3 | 5 / 35 | 3783 |
| 3 | 2 | 63.7 | 74.3 | 6 / 35 | 4184 |
| 4 | 3 | 60.6 | 63.8 | 4 / 35 | 4087 |
| 5 | 1 | 64.1 | 73.0 | 9 / 35 | 4361 |
| 6 | 3 | 59.4 | 61.0 | 5 / 35 | 3893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 18 | 39% |
| oog.melee.Capulet 1.2 | 18 | 28% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 63% |
| yagami.Tidus 0.11 | 7 | 86% |
| ejb.Polaris 1.0.1 | 5 | 80% |

Hadur died in 179 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 27% | 53 |
| yagami.Tidus 0.11 | 41 | 23% | 47 |
| kawigi.micro.Shiz 1.1 | 32 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 13% | 33 |
| ejb.Polaris 1.0.1 | 13 | 7% | 16 |
| step.nanoPri 1.0 | 10 | 6% | 11 |
| stelo.MirrorNano 1.3 | 6 | 3% | 6 |
| kurios.DOSexe .9a | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.7 | 85 / 210 | 3.19 | 16.0% | 24954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 16.0% | 85 |
| bzdp.Pansy 2.1 | 3.2 | 12.2% | 30 |
| wee.Gem 1.8.4 | 3.3 | 12.3% | 41 |
| ratosh.Nobo 0.21 | 3.5 | 11.8% | 13 |
| wompi.Quokka 1.6 | 4.3 | 11.4% | 19 |
| m3thos.Eva00 1.1 | 6.0 | 10.0% | 13 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.1% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 72.1 | 15 / 35 | 4045 |
| 2 | 1 | 63.9 | 75.9 | 14 / 35 | 4243 |
| 3 | 1 | 66.1 | 79.4 | 18 / 35 | 4782 |
| 4 | 1 | 62.0 | 70.8 | 9 / 35 | 3827 |
| 5 | 1 | 64.4 | 78.1 | 16 / 35 | 3850 |
| 6 | 1 | 64.3 | 77.8 | 13 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 69% |
| wee.Gem 1.8.4 | 28 | 71% |
| wompi.Quokka 1.6 | 18 | 67% |
| ratosh.Nobo 0.21 | 15 | 67% |
| m3thos.Eva00 1.1 | 13 | 54% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 26 | 21% | 55 |
| m3thos.Eva00 1.1 | 18 | 14% | 26 |
| ratosh.Nobo 0.21 | 17 | 14% | 25 |
| wee.Gem 1.8.4 | 16 | 13% | 37 |
| bayen.UbaMicro 1.4 | 16 | 13% | 21 |
| wompi.Quokka 1.6 | 14 | 11% | 23 |
| maribo.FollowFire 1 | 7 | 6% | 6 |
| stelo.MyAgileRobot 0.2 | 6 | 5% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 84.8 | 90 / 210 | 2.37 | 19.4% | 40891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.3 | 19.4% | 90 |
| wompi.Wallaby 5.1 | 1.7 | 18.8% | 98 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 14 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.8% | 0 |
| drd.Dreadknoght 0.9 | 8.2 | 5.8% | 3 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 82.9 | 13 / 35 | 6540 |
| 2 | 2 | 70.2 | 84.4 | 13 / 35 | 6854 |
| 3 | 1 | 70.5 | 85.7 | 18 / 35 | 6715 |
| 4 | 1 | 70.0 | 84.8 | 15 / 35 | 6832 |
| 5 | 1 | 70.5 | 84.1 | 18 / 35 | 6857 |
| 6 | 1 | 70.2 | 87.0 | 13 / 35 | 7093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 50% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 3 | 67% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 77 | 64% | 145 |
| mz.NanoGod 2.02 | 13 | 11% | 23 |
| exauge.GateKeeper 1.1.121g | 11 | 9% | 15 |
| ayk.WallHugger 1.0 | 11 | 9% | 15 |
| stelo.PianistNano 1.2 | 5 | 4% | 5 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 65.3 | 69 / 210 | 4.12 | 14.8% | 27224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.2 | 14.8% | 69 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 38 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 23 |
| bvh.micro.Freya 0.3 | 3.8 | 11.7% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 25 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.6% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.4% | 17 |
| dl.BetterWalls 1.0 | 9.2 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 66.3 | 12 / 35 | 4378 |
| 2 | 1 | 61.0 | 63.2 | 9 / 35 | 4473 |
| 3 | 2 | 59.1 | 59.0 | 10 / 35 | 4166 |
| 4 | 1 | 63.9 | 69.5 | 13 / 35 | 5075 |
| 5 | 1 | 59.5 | 61.9 | 9 / 35 | 4225 |
| 6 | 1 | 64.4 | 71.7 | 16 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 50% |
| dummy.micro.Sparrow 2.5 | 24 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 41% |
| bvh.micro.Freya 0.3 | 14 | 86% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 26% | 57 |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 20% | 38 |
| conscience.Electron 1.3g | 22 | 16% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 14% | 20 |
| dummy.micro.Sparrow 2.5 | 12 | 9% | 36 |
| dl.BetterWalls 1.0 | 8 | 6% | 12 |
| bvh.micro.Freya 0.3 | 7 | 5% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 4% | 16 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.1 | 85 / 210 | 2.79 | 18.4% | 37421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 18.4% | 85 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.2% | 44 |
| sul.Lunar 1.1 | 3.3 | 12.2% | 21 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.6% | 25 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.7% | 13 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.6% | 10 |
| sample.Corners 1.0 | 9.7 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 77.5 | 15 / 35 | 6781 |
| 2 | 1 | 67.9 | 81.6 | 15 / 35 | 6015 |
| 3 | 1 | 68.0 | 78.7 | 14 / 35 | 6539 |
| 4 | 1 | 66.3 | 76.8 | 11 / 35 | 5520 |
| 5 | 1 | 68.5 | 83.8 | 13 / 35 | 6218 |
| 6 | 1 | 68.7 | 82.2 | 17 / 35 | 6348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 48 | 67% |
| sul.Lunar 1.1 | 40 | 85% |
| supersample.SuperBoxBot 1.0 | 15 | 40% |
| mme.NikeEnhanced 2.0 | 9 | 33% |
| dsw.StaticD 1.0 | 7 | 71% |
| sample.MyFirstRobot 1.0 | 4 | 0% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |
| sample.Corners 1.0 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 126 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 36 | 29% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 25% | 59 |
| mme.NikeEnhanced 2.0 | 16 | 13% | 19 |
| sul.Lunar 1.1 | 15 | 12% | 51 |
| dsw.StaticD 1.0 | 8 | 6% | 14 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 8 |
| tlp.ThreeLeggedPig 1 | 5 | 4% | 5 |
| sample.Corners 1.0 | 4 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.3 | 90 / 210 | 2.87 | 17.7% | 35697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWH 0.1 | 1.0 | 17.7% | 90 |
| mld.Wisdom 1.0 | 2.7 | 12.6% | 25 |
| radnor.DoctorBob 1.42 | 3.2 | 13.0% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.9% | 35 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.1% | 7 |
| amz.NanoClone 1.41 | 5.5 | 9.5% | 13 |
| GarmBox.Oranges 1.0 | 7.7 | 7.3% | 1 |
| sample.Walls 1.0 | 7.8 | 7.5% | 3 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 6 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.0 | 13 / 35 | 6347 |
| 2 | 1 | 63.9 | 72.7 | 13 / 35 | 5147 |
| 3 | 1 | 67.5 | 82.2 | 17 / 35 | 6089 |
| 4 | 1 | 65.8 | 75.9 | 16 / 35 | 5414 |
| 5 | 1 | 67.3 | 82.9 | 17 / 35 | 5966 |
| 6 | 1 | 68.2 | 81.0 | 14 / 35 | 6734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 75% |
| radnor.DoctorBob 1.42 | 32 | 66% |
| mld.Wisdom 1.0 | 19 | 63% |
| KiraNL.Chupacabra 0.4 | 13 | 85% |
| jangs.ns51 1.0 | 8 | 63% |
| amz.NanoClone 1.41 | 5 | 60% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 24% | 61 |
| mld.Wisdom 1.0 | 26 | 22% | 40 |
| radnor.DoctorBob 1.42 | 21 | 18% | 39 |
| KiraNL.Chupacabra 0.4 | 18 | 15% | 27 |
| amz.NanoClone 1.41 | 10 | 8% | 12 |
| sample.Walls 1.0 | 6 | 5% | 14 |
| GarmBox.Oranges 1.0 | 6 | 5% | 7 |
| jangs.ns51 1.0 | 4 | 3% | 7 |

