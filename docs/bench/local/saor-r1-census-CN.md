# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.3 | 108 / 210 | 2.50 | 19.5% | 40748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 19.5% | 108 |
| mz.AntiGrav 1.0 | 2.5 | 14.9% | 37 |
| radnor.DoctorBob 1.42 | 2.7 | 14.8% | 30 |
| mld.Infinity 2.2 | 4.0 | 12.9% | 22 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 11 |
| sample.Walls 1.0 | 6.5 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 1 |
| sample.Target 1.0 | 9.5 | 3.8% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.9 | 19 / 35 | 7459 |
| 2 | 1 | 65.9 | 73.0 | 13 / 35 | 5625 |
| 3 | 1 | 70.3 | 85.1 | 19 / 35 | 6500 |
| 4 | 1 | 69.9 | 79.0 | 17 / 35 | 7240 |
| 5 | 1 | 70.5 | 85.4 | 18 / 35 | 6811 |
| 6 | 1 | 71.7 | 88.6 | 22 / 35 | 7113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 66% |
| mld.Infinity 2.2 | 39 | 85% |
| radnor.DoctorBob 1.42 | 30 | 80% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 32% | 56 |
| mz.AntiGrav 1.0 | 31 | 30% | 89 |
| amz.NanoClone 1.41 | 13 | 13% | 19 |
| mld.Infinity 2.2 | 13 | 13% | 14 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 3 | 3% | 12 |
| arthord.MannyPacquiao Beta | 3 | 3% | 9 |
| sample.Walls 1.0 | 2 | 2% | 5 |

## Melee bench: F02

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 76.6 | 80 / 210 | 3.11 | 16.5% | 29683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.3 | 16.5% | 80 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.9% | 65 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 35 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 3 |
| zyx.nano.Ant 1.1 | 5.3 | 9.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.1% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.2% | 10 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.4% | 5 |
| cs.Grudge 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 17 / 35 | 5212 |
| 2 | 1 | 66.0 | 81.0 | 20 / 35 | 4487 |
| 3 | 1 | 67.5 | 85.1 | 16 / 35 | 5281 |
| 4 | 3 | 57.1 | 49.2 | 3 / 35 | 4783 |
| 5 | 1 | 64.4 | 76.5 | 10 / 35 | 5033 |
| 6 | 1 | 66.1 | 82.9 | 14 / 35 | 4887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 68% |
| mld.DustBunny 3.8 | 44 | 55% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 50% |
| fullsail.SweetTea 1.1 | 5 | 40% |
| zyx.nano.Ant 1.1 | 4 | 25% |

Hadur died in 130 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 46 | 35% | 71 |
| oog.melee.Mercutio 1.0 | 28 | 22% | 65 |
| zyx.nano.Ant 1.1 | 16 | 12% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 18 |
| fullsail.SweetTea 1.1 | 9 | 7% | 12 |
| cs.Grudge 1.0 | 8 | 6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6 | 5% | 6 |
| bzdp.BoxCar 2.0 | 4 | 3% | 5 |
| maribo.melee.BMV 0.1 | 3 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 75.4 | 65 / 210 | 3.21 | 17.3% | 34657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.3 | 17.3% | 65 |
| myl.micro.Troodon 1.10 | 1.7 | 16.1% | 80 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.9% | 32 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.1% | 17 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.3% | 1 |
| sample.Fire 1.0 | 9.3 | 5.0% | 4 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 73.3 | 8 / 35 | 5366 |
| 2 | 2 | 65.4 | 72.7 | 9 / 35 | 5578 |
| 3 | 1 | 66.9 | 73.7 | 12 / 35 | 6164 |
| 4 | 1 | 67.9 | 79.4 | 12 / 35 | 6097 |
| 5 | 1 | 67.1 | 80.3 | 12 / 35 | 5629 |
| 6 | 1 | 66.3 | 73.0 | 12 / 35 | 5823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 27% |
| myl.nano.KomoriNinja 1.1 | 15 | 73% |
| cb.nano.Insomnia 1.0 | 12 | 75% |
| sample.Fire 1.0 | 5 | 60% |
| sp.Nanos.Ember 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 30% | 71 |
| stelo.SoRobotNanoMelee 1.2 | 35 | 24% | 40 |
| fm.mammillarias 1.3 | 29 | 20% | 32 |
| myl.nano.KomoriNinja 1.1 | 13 | 9% | 29 |
| cb.nano.Insomnia 1.0 | 12 | 8% | 10 |
| sample.Fire 1.0 | 5 | 3% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 9 |
| sample.Tracker 1.0 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.5 | 86 / 210 | 2.57 | 18.7% | 38038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 18.7% | 86 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.0% | 51 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 12 |
| tj.zombie1n 1.0.1 | 5.0 | 9.3% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.7% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.2% | 2 |
| yk.JahMicro 1.0 | 6.8 | 8.3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.4% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 5 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 18 / 35 | 6836 |
| 2 | 1 | 69.4 | 87.3 | 18 / 35 | 6509 |
| 3 | 1 | 68.2 | 82.9 | 16 / 35 | 6403 |
| 4 | 1 | 66.4 | 77.1 | 11 / 35 | 6179 |
| 5 | 1 | 66.6 | 80.3 | 10 / 35 | 5986 |
| 6 | 1 | 67.7 | 82.5 | 13 / 35 | 6125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 57% |
| stelo.SoJNanoMelee 1.1 | 28 | 39% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| tj.zombie1n 1.0.1 | 14 | 57% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 80% |
| yk.JahMicro 1.0 | 7 | 43% |
| repositorio.NanoStep 1.0 | 5 | 60% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 42% | 88 |
| stelo.SoJNanoMelee 1.1 | 36 | 29% | 48 |
| tj.zombie1n 1.0.1 | 15 | 12% | 20 |
| tvv.micro.Antares 1.1.1 | 6 | 5% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 3% | 6 |
| yk.JahMicro 1.0 | 4 | 3% | 5 |
| repositorio.NanoStep 1.0 | 3 | 2% | 11 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.5 | 83 / 210 | 3.84 | 15.4% | 29079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 15.4% | 83 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 33 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 31 |
| ahf.NanoAndrew .4 | 3.8 | 11.2% | 25 |
| sam.Samspin 1.0 | 4.8 | 10.3% | 18 |
| robar.nano.Assertive_Melee 0.2 | 5.2 | 10.1% | 10 |
| EBBU.Sim2 1.02 | 7.2 | 9.2% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.1% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.2 | 62.5 | 12 / 35 | 4378 |
| 2 | 1 | 63.3 | 70.5 | 15 / 35 | 4729 |
| 3 | 1 | 65.1 | 74.3 | 19 / 35 | 4950 |
| 4 | 1 | 65.4 | 74.0 | 17 / 35 | 5498 |
| 5 | 1 | 59.0 | 60.3 | 7 / 35 | 4634 |
| 6 | 1 | 63.1 | 69.2 | 13 / 35 | 4890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 82% |
| oog.melee.Corsair 1.0 | 34 | 79% |
| ahf.NanoAndrew .4 | 16 | 75% |
| sam.Samspin 1.0 | 12 | 75% |
| EBBU.Sim2 1.02 | 5 | 60% |
| robar.nano.Assertive_Melee 0.2 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 24 | 19% | 29 |
| simonton.nano.MeleeSeed 1.8 | 18 | 14% | 45 |
| oog.melee.Corsair 1.0 | 17 | 13% | 38 |
| EBBU.Sim2 1.02 | 16 | 13% | 19 |
| ahf.NanoAndrew .4 | 15 | 12% | 28 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 16 |
| sam.Samspin 1.0 | 12 | 9% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 11 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.5 | 83 / 210 | 3.03 | 16.4% | 27975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.3 | 16.4% | 83 |
| d414.nano.Quantum 1.0.0 | 1.7 | 15.7% | 66 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.3% | 22 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 8 |
| fm.claire 1.7 | 6.7 | 8.6% | 1 |
| sample.SpinBot 1.0 | 7.2 | 8.4% | 10 |
| kurios.DOSexe .9b | 9.3 | 5.3% | 4 |
| pa.Improved 1.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 74.0 | 15 / 35 | 4103 |
| 2 | 1 | 66.9 | 83.5 | 14 / 35 | 5284 |
| 3 | 2 | 63.6 | 72.4 | 13 / 35 | 4553 |
| 4 | 2 | 62.8 | 76.5 | 11 / 35 | 4391 |
| 5 | 1 | 66.4 | 81.9 | 16 / 35 | 4969 |
| 6 | 1 | 64.5 | 76.5 | 14 / 35 | 4675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 45% |
| oog.melee.CapuletDroid 1.1 | 18 | 61% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| arthord.NanoSatanMelee Beta | 11 | 100% |
| sample.SpinBot 1.0 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 5 | 60% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 41% | 88 |
| oog.melee.CapuletDroid 1.1 | 19 | 15% | 17 |
| arthord.NanoSatanMelee Beta | 13 | 10% | 18 |
| gh.nano.Grofvuil 0.2 | 12 | 9% | 26 |
| sample.SpinBot 1.0 | 11 | 9% | 16 |
| pa.Improved 1.0 | 7 | 5% | 15 |
| fm.claire 1.7 | 7 | 5% | 12 |
| kurios.DOSexe .9b | 5 | 4% | 12 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.7 | 86 / 210 | 2.82 | 17.6% | 33728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 17.6% | 86 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.5% | 56 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.3% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 13.4% | 24 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 4 |
| acogdev.alpha 0.2 | 7.8 | 6.4% | 2 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.9 | 13 / 35 | 5751 |
| 2 | 1 | 65.3 | 75.9 | 11 / 35 | 5304 |
| 3 | 1 | 66.5 | 79.4 | 13 / 35 | 5831 |
| 4 | 1 | 68.6 | 81.3 | 18 / 35 | 5894 |
| 5 | 1 | 65.5 | 75.9 | 11 / 35 | 5318 |
| 6 | 1 | 68.2 | 84.1 | 20 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 51 | 86% |
| spinnercat.micro.Tyger 0.1 | 41 | 37% |
| gh.micro.Gruweltje 0.7 | 18 | 44% |
| DBall.Anarchy 0.1 | 12 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 46% | 72 |
| gh.micro.Gruweltje 0.7 | 27 | 21% | 39 |
| mz.MicroGodMelee 1 | 17 | 13% | 54 |
| caimano.Furia_Ceca 0.22 | 9 | 7% | 11 |
| DBall.Anarchy 0.1 | 3 | 2% | 16 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 7 |
| el.JumpShoot 0.2 | 3 | 2% | 5 |
| acogdev.alpha 0.2 | 3 | 2% | 3 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.5 | 58 / 210 | 3.74 | 15.4% | 30459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.7% | 84 |
| hadur117.micro.SaorCN 0.1 | 2.0 | 15.4% | 58 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.4% | 35 |
| germ.TheMind .2 | 4.2 | 10.0% | 8 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.3% | 3 |
| sample.Crazy 1.0 | 7.8 | 7.1% | 5 |
| awesomeness.Elite 1.0 | 8.0 | 7.7% | 4 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.4% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 56.5 | 6 / 35 | 4945 |
| 2 | 1 | 63.9 | 72.1 | 13 / 35 | 4907 |
| 3 | 2 | 66.7 | 77.8 | 12 / 35 | 5678 |
| 4 | 2 | 63.7 | 73.7 | 7 / 35 | 4867 |
| 5 | 2 | 61.5 | 67.3 | 9 / 35 | 4728 |
| 6 | 2 | 64.1 | 69.8 | 11 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 41% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 67% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 75% |
| germ.TheMind .2 | 4 | 50% |
| sample.Crazy 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 41% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 20% | 36 |
| germ.TheMind .2 | 23 | 15% | 29 |
| stelo.UntouchableNano 1.3 | 15 | 10% | 16 |
| qualidafial.MajorDick 1.0.1 | 8 | 5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 10 |
| awesomeness.Elite 1.0 | 4 | 3% | 7 |
| mym.EdgeStalker 1.0 | 3 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.0 | 86 / 210 | 2.80 | 17.2% | 28022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 17.2% | 86 |
| rz.HawkOnFire 0.1 | 2.2 | 14.5% | 40 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 22 |
| maribo.IotaCT 1.1 | 4.5 | 10.6% | 14 |
| timmit.nano.TimDog 0.33 | 5.2 | 10.0% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.3% | 7 |
| stelo.PatternRobot 1.0 | 7.3 | 8.3% | 13 |
| ratosh.Wesco 1.4 | 7.7 | 8.7% | 10 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.2 | 16 / 35 | 4570 |
| 2 | 1 | 65.3 | 75.6 | 14 / 35 | 4489 |
| 3 | 1 | 66.2 | 77.1 | 12 / 35 | 5117 |
| 4 | 1 | 65.1 | 79.4 | 11 / 35 | 4192 |
| 5 | 1 | 67.7 | 82.2 | 15 / 35 | 5177 |
| 6 | 1 | 67.5 | 82.5 | 18 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 67% |
| nz.jdc.nano.GridFu 1.0 | 33 | 61% |
| timmit.nano.TimDog 0.33 | 11 | 64% |
| maribo.IotaCT 1.1 | 11 | 91% |
| stelo.PatternRobot 1.0 | 10 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| ratosh.Wesco 1.4 | 4 | 25% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 39 | 31% | 63 |
| stelo.PatternRobot 1.0 | 19 | 15% | 25 |
| nz.jdc.nano.GridFu 1.0 | 18 | 15% | 48 |
| timmit.nano.TimDog 0.33 | 15 | 12% | 20 |
| ratosh.Wesco 1.4 | 15 | 12% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 10% | 14 |
| maribo.IotaCT 1.1 | 3 | 2% | 14 |
| spinnercat.Omen 1.0 | 3 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.9 | 137 / 210 | 2.09 | 19.9% | 36220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 19.9% | 137 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 19 |
| baal.nano.N 1.42 | 2.8 | 11.5% | 13 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.9% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 9.8% | 20 |
| sanja.First 0.1 | 5.3 | 9.6% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.8% | 0 |
| cvt.Firsty 1.0 | 8.0 | 7.2% | 9 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.1% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.3 | 21 / 35 | 5911 |
| 2 | 1 | 70.7 | 90.8 | 25 / 35 | 6281 |
| 3 | 1 | 69.5 | 87.3 | 22 / 35 | 6057 |
| 4 | 1 | 70.0 | 90.8 | 23 / 35 | 6173 |
| 5 | 1 | 68.2 | 82.9 | 23 / 35 | 5669 |
| 6 | 1 | 69.6 | 87.3 | 23 / 35 | 6129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 35 | 91% |
| tvv.nano.Polaris 1.2 | 32 | 94% |
| sanja.First 0.1 | 24 | 92% |
| zyx.micro.Ant 1.1 | 20 | 45% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| cvt.Firsty 1.0 | 15 | 53% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 32 | 44% | 52 |
| cvt.Firsty 1.0 | 12 | 16% | 28 |
| tvv.nano.Polaris 1.2 | 8 | 11% | 43 |
| baal.nano.N 1.42 | 6 | 8% | 30 |
| Grystrion.TrackerWO 1.0 | 6 | 8% | 19 |
| sanja.First 0.1 | 5 | 7% | 28 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 5 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 66.7 | 60 / 210 | 4.00 | 14.8% | 30351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.2% | 81 |
| hadur117.micro.SaorCN 0.1 | 1.5 | 14.8% | 60 |
| cs.Wren 1.0 | 3.2 | 12.8% | 28 |
| js.PinBall 1.6 | 4.5 | 11.2% | 13 |
| mz.Cork 0.1 | 4.5 | 10.6% | 7 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 7 |
| evd.X1 0.01 | 7.3 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 7.7 | 7.4% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 66.7 | 8 / 35 | 4981 |
| 2 | 2 | 61.0 | 63.5 | 9 / 35 | 4789 |
| 3 | 1 | 63.5 | 71.1 | 11 / 35 | 5286 |
| 4 | 2 | 61.2 | 64.8 | 11 / 35 | 4607 |
| 5 | 1 | 64.2 | 70.5 | 12 / 35 | 5542 |
| 6 | 1 | 61.3 | 63.5 | 9 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 56% |
| cs.Wren 1.0 | 21 | 43% |
| mz.Cork 0.1 | 8 | 100% |
| js.PinBall 1.6 | 7 | 86% |
| evd.X1 0.01 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 31% | 81 |
| cs.Wren 1.0 | 38 | 25% | 45 |
| joe.ADinosaur 1.0 | 16 | 11% | 17 |
| evd.X1 0.01 | 12 | 8% | 13 |
| PSW.Relentless 0.1 | 12 | 8% | 11 |
| mz.Cork 0.1 | 8 | 5% | 16 |
| js.PinBall 1.6 | 6 | 4% | 11 |
| donjezza.Jezza 1.0 | 6 | 4% | 7 |
| jsal.Jsalbot 1.0 | 5 | 3% | 8 |

## Melee bench: F12

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 77.4 | 77 / 210 | 3.03 | 16.9% | 29237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 16.9% | 77 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 46 |
| ntc.Opposite 1.5 | 2.7 | 12.1% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.1% | 24 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.5% | 4 |
| DBall.NUKE 0.1 | 7.2 | 8.5% | 9 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.6% | 14 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 72.4 | 12 / 35 | 5166 |
| 2 | 1 | 66.4 | 82.2 | 11 / 35 | 5180 |
| 3 | 1 | 65.0 | 75.9 | 12 / 35 | 4990 |
| 4 | 1 | 65.3 | 79.7 | 12 / 35 | 4638 |
| 5 | 1 | 64.7 | 77.8 | 15 / 35 | 4490 |
| 6 | 1 | 65.2 | 76.5 | 15 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 27 | 63% |
| myl.nano.Graviton 1.10 | 26 | 23% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| ntc.Opposite 1.5 | 14 | 29% |
| disan.Chair 2.2.0 | 13 | 92% |
| DBall.NUKE 0.1 | 10 | 100% |
| donjezza.Muncho 1.0 | 10 | 50% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| pbg.R2D2 1.0 | 4 | 50% |

Hadur died in 135 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 25% | 43 |
| ntc.Opposite 1.5 | 29 | 21% | 34 |
| stelo.AreaTargetingBot 1.1 | 20 | 15% | 36 |
| pfvicm.Sobieski 7.2.3b | 18 | 13% | 24 |
| pbg.R2D2 1.0 | 8 | 6% | 10 |
| DBall.NUKE 0.1 | 7 | 5% | 21 |
| donjezza.Muncho 1.0 | 6 | 4% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 4% | 14 |
| disan.Chair 2.2.0 | 6 | 4% | 13 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 67.0 | 45 / 210 | 3.97 | 14.3% | 25190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 56 |
| hadur117.micro.SaorCN 0.1 | 2.0 | 14.3% | 45 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 55 |
| yagami.Tidus 0.11 | 4.3 | 12.8% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.5% | 30 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 11 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 1 |
| step.nanoPri 1.0 | 8.2 | 6.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 69.8 | 6 / 35 | 4083 |
| 2 | 1 | 64.1 | 72.4 | 8 / 35 | 4230 |
| 3 | 4 | 59.8 | 58.7 | 5 / 35 | 4026 |
| 4 | 3 | 59.2 | 57.8 | 7 / 35 | 4304 |
| 5 | 1 | 62.8 | 69.2 | 9 / 35 | 4236 |
| 6 | 1 | 64.5 | 74.0 | 10 / 35 | 4311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 23 | 52% |
| kawigi.micro.Shiz 1.1 | 23 | 48% |
| yagami.Tidus 0.11 | 15 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 64% |
| ejb.Polaris 1.0.1 | 8 | 75% |

Hadur died in 165 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 30% | 61 |
| yagami.Tidus 0.11 | 43 | 26% | 53 |
| kawigi.micro.Shiz 1.1 | 33 | 20% | 42 |
| ejb.Polaris 1.0.1 | 10 | 6% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 5% | 17 |
| stelo.MirrorNano 1.3 | 9 | 5% | 9 |
| kurios.DOSexe .9a | 7 | 4% | 7 |
| step.nanoPri 1.0 | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.7 | 91 / 210 | 3.19 | 16.3% | 26578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 16.3% | 91 |
| wee.Gem 1.8.4 | 3.0 | 11.9% | 38 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 30 |
| ratosh.Nobo 0.21 | 3.7 | 11.3% | 8 |
| wompi.Quokka 1.6 | 5.0 | 11.0% | 17 |
| m3thos.Eva00 1.1 | 5.2 | 10.6% | 23 |
| bayen.UbaMicro 1.4 | 7.0 | 8.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.5 | 6.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.7% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 80.3 | 18 / 35 | 4186 |
| 2 | 1 | 65.0 | 77.8 | 15 / 35 | 4488 |
| 3 | 1 | 64.9 | 74.0 | 18 / 35 | 4506 |
| 4 | 1 | 64.0 | 74.0 | 15 / 35 | 4352 |
| 5 | 1 | 62.3 | 70.5 | 11 / 35 | 4503 |
| 6 | 1 | 64.6 | 77.5 | 14 / 35 | 4543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 44 | 75% |
| bzdp.Pansy 2.1 | 41 | 71% |
| ratosh.Nobo 0.21 | 15 | 67% |
| wompi.Quokka 1.6 | 14 | 71% |
| m3thos.Eva00 1.1 | 12 | 25% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 25 | 21% | 31 |
| bzdp.Pansy 2.1 | 17 | 14% | 45 |
| stelo.MyAgileRobot 0.2 | 17 | 14% | 20 |
| maribo.FollowFire 1 | 13 | 11% | 12 |
| wee.Gem 1.8.4 | 12 | 10% | 47 |
| ratosh.Nobo 0.21 | 11 | 9% | 24 |
| wompi.Quokka 1.6 | 11 | 9% | 14 |
| bayen.UbaMicro 1.4 | 9 | 8% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 4 |

## Melee bench: F15

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.0 | 129 / 210 | 1.99 | 21.3% | 45890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 21.3% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 57 |
| mz.NanoGod 2.02 | 3.0 | 13.3% | 11 |
| ayk.WallHugger 1.0 | 4.5 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.1% | 10 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.3 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.7 | 5.9% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 86.0 | 21 / 35 | 8009 |
| 2 | 1 | 72.0 | 90.2 | 23 / 35 | 7163 |
| 3 | 1 | 70.3 | 81.9 | 15 / 35 | 7411 |
| 4 | 1 | 74.4 | 98.1 | 29 / 35 | 7899 |
| 5 | 1 | 70.9 | 86.0 | 17 / 35 | 7193 |
| 6 | 1 | 73.7 | 91.7 | 24 / 35 | 8215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 74% |
| exauge.GateKeeper 1.1.121g | 18 | 72% |
| mz.NanoGod 2.02 | 18 | 61% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 6 | 67% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 47% | 135 |
| mz.NanoGod 2.02 | 20 | 25% | 31 |
| exauge.GateKeeper 1.1.121g | 11 | 14% | 16 |
| ayk.WallHugger 1.0 | 5 | 6% | 14 |
| stelo.PianistNano 1.2 | 4 | 5% | 4 |
| drd.Dreadknoght 0.9 | 3 | 4% | 8 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.8 | 77 / 210 | 3.63 | 15.7% | 28289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 15.7% | 77 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 41 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.4% | 34 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.3% | 27 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.9% | 6 |
| conscience.Electron 1.3g | 7.0 | 7.8% | 3 |
| ap.Frederick 1.1 | 8.3 | 7.0% | 6 |
| dl.BetterWalls 1.0 | 9.2 | 6.5% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 74.9 | 11 / 35 | 4794 |
| 2 | 1 | 61.6 | 66.0 | 12 / 35 | 4512 |
| 3 | 1 | 64.8 | 72.1 | 15 / 35 | 4988 |
| 4 | 1 | 62.8 | 71.4 | 13 / 35 | 4325 |
| 5 | 1 | 65.2 | 75.6 | 15 / 35 | 4999 |
| 6 | 1 | 61.7 | 64.8 | 11 / 35 | 4671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 56% |
| dummy.micro.Sparrow 2.5 | 26 | 77% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 48% |
| bvh.micro.Freya 0.3 | 20 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 4 | 75% |

Hadur died in 135 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 28% | 60 |
| dummy.micro.Sparrow 2.5 | 29 | 21% | 48 |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 20% | 43 |
| conscience.Electron 1.3g | 12 | 9% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 8% | 11 |
| bvh.micro.Freya 0.3 | 8 | 6% | 18 |
| dl.BetterWalls 1.0 | 7 | 5% | 9 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 8 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 83.0 | 108 / 210 | 2.53 | 19.5% | 39937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 19.5% | 108 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 34 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.7% | 25 |
| sul.Lunar 1.1 | 3.7 | 11.5% | 14 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 8 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 3 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 5 |
| sample.Corners 1.0 | 9.3 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.7 | 19 / 35 | 6743 |
| 2 | 1 | 70.2 | 85.4 | 18 / 35 | 6788 |
| 3 | 1 | 68.1 | 78.7 | 16 / 35 | 6679 |
| 4 | 1 | 69.3 | 82.2 | 17 / 35 | 6783 |
| 5 | 1 | 68.1 | 79.7 | 17 / 35 | 6328 |
| 6 | 1 | 70.2 | 85.1 | 21 / 35 | 6616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 76% |
| sul.Lunar 1.1 | 30 | 93% |
| supersample.SuperBoxBot 1.0 | 23 | 48% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| dsw.StaticD 1.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 43% |
| sample.MyFirstRobot 1.0 | 5 | 0% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 41 | 40% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 20% | 59 |
| mme.NikeEnhanced 2.0 | 14 | 14% | 22 |
| sul.Lunar 1.1 | 10 | 10% | 45 |
| sample.MyFirstRobot 1.0 | 6 | 6% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 5% | 8 |
| dsw.StaticD 1.0 | 4 | 4% | 14 |
| sample.Corners 1.0 | 2 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorCN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.4 | 75 / 210 | 3.67 | 16.0% | 35191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCN 0.1 | 1.0 | 16.0% | 75 |
| radnor.DoctorBob 1.42 | 3.0 | 12.5% | 33 |
| mld.Wisdom 1.0 | 3.0 | 12.6% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.2% | 42 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 14 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.5% | 9 |
| sample.Walls 1.0 | 7.2 | 8.3% | 8 |
| GarmBox.Oranges 1.0 | 7.8 | 7.5% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 67.0 | 9 / 35 | 5368 |
| 2 | 1 | 67.6 | 78.4 | 15 / 35 | 6789 |
| 3 | 1 | 60.6 | 61.0 | 9 / 35 | 5520 |
| 4 | 1 | 65.4 | 72.4 | 17 / 35 | 6144 |
| 5 | 1 | 64.2 | 69.5 | 13 / 35 | 5911 |
| 6 | 1 | 64.2 | 74.0 | 12 / 35 | 5459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 64% |
| radnor.DoctorBob 1.42 | 25 | 68% |
| mld.Wisdom 1.0 | 19 | 58% |
| amz.NanoClone 1.41 | 9 | 67% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 26% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 20% | 50 |
| radnor.DoctorBob 1.42 | 25 | 19% | 45 |
| amz.NanoClone 1.41 | 22 | 16% | 26 |
| KiraNL.Chupacabra 0.4 | 13 | 10% | 25 |
| sample.Walls 1.0 | 6 | 4% | 8 |
| jangs.ns51 1.0 | 4 | 3% | 6 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |

