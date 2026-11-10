# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.6 | 122 / 210 | 2.20 | 20.4% | 42124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 20.4% | 122 |
| mz.AntiGrav 1.0 | 2.8 | 13.9% | 31 |
| mld.Infinity 2.2 | 3.0 | 13.7% | 31 |
| radnor.DoctorBob 1.42 | 3.2 | 13.8% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 4 |
| sample.Walls 1.0 | 6.5 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 3 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 81.6 | 18 / 35 | 6114 |
| 2 | 1 | 70.7 | 85.1 | 19 / 35 | 7067 |
| 3 | 1 | 71.6 | 89.5 | 19 / 35 | 7132 |
| 4 | 1 | 72.1 | 87.9 | 25 / 35 | 7476 |
| 5 | 1 | 71.1 | 86.3 | 17 / 35 | 7304 |
| 6 | 1 | 71.7 | 89.2 | 24 / 35 | 7031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 70% |
| mld.Infinity 2.2 | 46 | 61% |
| radnor.DoctorBob 1.42 | 38 | 95% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1183. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 32 | 36% | 91 |
| mld.Infinity 2.2 | 20 | 23% | 13 |
| radnor.DoctorBob 1.42 | 14 | 16% | 56 |
| amz.NanoClone 1.41 | 11 | 13% | 23 |
| GarmBox.Oranges 1.0 | 5 | 6% | 8 |
| jangs.ns51 1.0 | 4 | 5% | 9 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.0 | 89 / 210 | 2.35 | 17.5% | 29336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 17.5% | 89 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.9% | 59 |
| mld.DustBunny 3.8 | 3.0 | 13.4% | 33 |
| maribo.melee.BMV 0.1 | 4.5 | 10.1% | 3 |
| zyx.nano.Ant 1.1 | 5.5 | 8.6% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 10 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.5% | 3 |
| cs.Grudge 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 82.2 | 13 / 35 | 4535 |
| 2 | 1 | 65.5 | 83.5 | 12 / 35 | 4687 |
| 3 | 1 | 67.1 | 86.3 | 16 / 35 | 5155 |
| 4 | 1 | 68.5 | 90.2 | 20 / 35 | 5349 |
| 5 | 1 | 67.5 | 90.2 | 15 / 35 | 4799 |
| 6 | 1 | 65.0 | 77.5 | 13 / 35 | 4811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 76 | 61% |
| mld.DustBunny 3.8 | 38 | 39% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 33% |
| bzdp.BoxCar 2.0 | 2 | 50% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 42 | 35% | 88 |
| mld.DustBunny 3.8 | 42 | 35% | 59 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 14 |
| zyx.nano.Ant 1.1 | 10 | 8% | 14 |
| bzdp.BoxCar 2.0 | 7 | 6% | 8 |
| fullsail.SweetTea 1.1 | 4 | 3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 10 |
| maribo.melee.BMV 0.1 | 2 | 2% | 7 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 77.4 | 75 / 210 | 3.03 | 17.6% | 35247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.2 | 17.6% | 75 |
| myl.micro.Troodon 1.10 | 1.8 | 16.2% | 72 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 12.8% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 25 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.4% | 11 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.4% | 2 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 1 |
| sample.Fire 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 70.8 | 12 / 35 | 5701 |
| 2 | 1 | 69.0 | 83.2 | 15 / 35 | 6237 |
| 3 | 2 | 66.0 | 74.0 | 11 / 35 | 5449 |
| 4 | 1 | 66.5 | 77.8 | 11 / 35 | 5460 |
| 5 | 1 | 68.0 | 81.0 | 15 / 35 | 6012 |
| 6 | 1 | 67.5 | 77.8 | 11 / 35 | 6388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 55% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 42% |
| myl.nano.KomoriNinja 1.1 | 23 | 70% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| sp.Nanos.Ember 1.1 | 7 | 71% |
| fm.mammillarias 1.3 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 36% | 88 |
| stelo.SoRobotNanoMelee 1.2 | 29 | 21% | 35 |
| cb.nano.Insomnia 1.0 | 20 | 15% | 19 |
| fm.mammillarias 1.3 | 15 | 11% | 17 |
| myl.nano.KomoriNinja 1.1 | 12 | 9% | 25 |
| sample.Tracker 1.0 | 4 | 3% | 6 |
| sp.Nanos.Ember 1.1 | 3 | 2% | 10 |
| sample.Fire 1.0 | 3 | 2% | 7 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.7 | 98 / 210 | 2.47 | 19.1% | 38218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 19.1% | 98 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 38 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 13 |
| tj.zombie1n 1.0.1 | 4.7 | 9.2% | 12 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.8% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 10 |
| yk.JahMicro 1.0 | 7.0 | 8.0% | 5 |
| repositorio.NanoStep 1.0 | 8.5 | 7.0% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.1 | 12 / 35 | 6236 |
| 2 | 1 | 67.2 | 82.2 | 10 / 35 | 5952 |
| 3 | 1 | 70.5 | 90.2 | 22 / 35 | 6743 |
| 4 | 1 | 67.6 | 81.6 | 16 / 35 | 5985 |
| 5 | 1 | 68.5 | 81.9 | 16 / 35 | 6741 |
| 6 | 1 | 69.2 | 82.2 | 22 / 35 | 6561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 67% |
| stelo.SoJNanoMelee 1.1 | 28 | 39% |
| tj.zombie1n 1.0.1 | 19 | 68% |
| tvv.micro.Antares 1.1.1 | 18 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 75% |
| yk.JahMicro 1.0 | 7 | 57% |
| repositorio.NanoStep 1.0 | 5 | 60% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 36% | 83 |
| stelo.SoJNanoMelee 1.1 | 31 | 27% | 40 |
| tj.zombie1n 1.0.1 | 10 | 9% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 6% | 24 |
| tvv.micro.Antares 1.1.1 | 6 | 5% | 14 |
| yk.JahMicro 1.0 | 6 | 5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 4% | 8 |
| repositorio.NanoStep 1.0 | 4 | 4% | 12 |
| sample.VelociRobot 1.0 | 3 | 3% | 6 |

## Melee bench: F05

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 67.7 | 71 / 210 | 3.90 | 14.9% | 26961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 14.9% | 71 |
| oog.melee.Corsair 1.0 | 2.5 | 12.4% | 26 |
| ahf.NanoAndrew .4 | 2.7 | 12.2% | 40 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.8% | 28 |
| sam.Samspin 1.0 | 5.3 | 10.1% | 17 |
| EBBU.Sim2 1.02 | 6.2 | 9.5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.2% | 12 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.8 | 63.8 | 10 / 35 | 4212 |
| 2 | 1 | 58.7 | 60.0 | 10 / 35 | 4038 |
| 3 | 1 | 63.1 | 72.4 | 11 / 35 | 4795 |
| 4 | 1 | 61.3 | 67.3 | 12 / 35 | 4415 |
| 5 | 1 | 64.8 | 73.7 | 16 / 35 | 4922 |
| 6 | 1 | 61.9 | 69.2 | 12 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 64% |
| simonton.nano.MeleeSeed 1.8 | 22 | 64% |
| ahf.NanoAndrew .4 | 22 | 82% |
| sam.Samspin 1.0 | 12 | 67% |
| EBBU.Sim2 1.02 | 8 | 38% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 60% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 19% | 39 |
| robar.nano.Assertive_Melee 0.2 | 22 | 16% | 29 |
| EBBU.Sim2 1.02 | 22 | 16% | 26 |
| oog.melee.Corsair 1.0 | 14 | 10% | 32 |
| sam.Samspin 1.0 | 14 | 10% | 21 |
| ahf.NanoAndrew .4 | 13 | 9% | 30 |
| zyx.nano.BacillusComma 1.0 | 13 | 9% | 14 |
| sample.TrackFire 1.0 | 8 | 6% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 9 |

## Melee bench: F06

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.3 | 92 / 210 | 2.77 | 17.5% | 31177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.2 | 17.5% | 92 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.4% | 69 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.2% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.5% | 4 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.4% | 2 |
| fm.claire 1.7 | 6.7 | 7.9% | 2 |
| sample.SpinBot 1.0 | 7.0 | 8.2% | 8 |
| pa.Improved 1.0 | 9.0 | 5.8% | 2 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.7 | 20 / 35 | 5360 |
| 2 | 1 | 67.4 | 86.0 | 15 / 35 | 5189 |
| 3 | 1 | 63.1 | 67.9 | 12 / 35 | 5110 |
| 4 | 1 | 67.9 | 82.9 | 18 / 35 | 5722 |
| 5 | 2 | 65.1 | 77.5 | 11 / 35 | 4973 |
| 6 | 1 | 65.9 | 81.0 | 16 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 30% |
| oog.melee.CapuletDroid 1.1 | 23 | 78% |
| sample.SpinBot 1.0 | 17 | 88% |
| gh.nano.Grofvuil 0.2 | 15 | 93% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| arthord.NanoSatanMelee Beta | 10 | 90% |
| pa.Improved 1.0 | 4 | 75% |
| fm.claire 1.7 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 51% | 90 |
| sample.SpinBot 1.0 | 12 | 10% | 23 |
| oog.melee.CapuletDroid 1.1 | 12 | 10% | 12 |
| fm.claire 1.7 | 9 | 8% | 10 |
| gh.nano.Grofvuil 0.2 | 7 | 6% | 28 |
| arthord.NanoSatanMelee Beta | 6 | 5% | 14 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 16 |
| kurios.DOSexe .9b | 4 | 3% | 8 |
| pa.Improved 1.0 | 3 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.9 | 69 / 210 | 2.90 | 16.9% | 32017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.2 | 16.9% | 69 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 14.5% | 53 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 43 |
| mz.MicroGodMelee 1 | 4.0 | 12.7% | 24 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 7 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.8% | 5 |
| el.JumpShoot 0.2 | 7.5 | 6.7% | 4 |
| acogdev.alpha 0.2 | 8.0 | 6.6% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 4 |
| fire219.CatBot 1.0 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.4 | 10 / 35 | 5578 |
| 2 | 1 | 65.2 | 77.1 | 11 / 35 | 5245 |
| 3 | 1 | 66.0 | 79.4 | 12 / 35 | 5187 |
| 4 | 1 | 67.8 | 86.3 | 15 / 35 | 5404 |
| 5 | 2 | 64.4 | 74.6 | 10 / 35 | 5007 |
| 6 | 1 | 65.7 | 77.5 | 11 / 35 | 5596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 31% |
| mz.MicroGodMelee 1 | 36 | 81% |
| gh.micro.Gruweltje 0.7 | 31 | 32% |
| DBall.Anarchy 0.1 | 12 | 92% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 0% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 0% |

Hadur died in 141 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 36% | 67 |
| gh.micro.Gruweltje 0.7 | 37 | 26% | 48 |
| mz.MicroGodMelee 1 | 13 | 9% | 37 |
| caimano.Furia_Ceca 0.22 | 12 | 9% | 15 |
| el.JumpShoot 0.2 | 10 | 7% | 11 |
| fire219.CatBot 1.0 | 9 | 6% | 9 |
| acogdev.alpha 0.2 | 6 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 12 |

## Melee bench: F08

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 69.5 | 77 / 210 | 3.75 | 15.4% | 29067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.3 | 15.4% | 77 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.7% | 65 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 29 |
| germ.TheMind .2 | 4.8 | 10.0% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.9% | 5 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.8% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 8.0% | 3 |
| sample.Crazy 1.0 | 8.5 | 7.2% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 72.1 | 10 / 35 | 4651 |
| 2 | 1 | 65.4 | 78.4 | 15 / 35 | 4685 |
| 3 | 1 | 61.0 | 64.4 | 13 / 35 | 4569 |
| 4 | 1 | 64.5 | 72.4 | 14 / 35 | 5133 |
| 5 | 2 | 61.6 | 63.2 | 10 / 35 | 5028 |
| 6 | 1 | 62.6 | 66.3 | 15 / 35 | 5001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 58% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 67% |
| qualidafial.MajorDick 1.0.1 | 7 | 71% |
| germ.TheMind .2 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 45% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 15% | 32 |
| germ.TheMind .2 | 15 | 11% | 22 |
| stelo.UntouchableNano 1.3 | 13 | 10% | 17 |
| awesomeness.Elite 1.0 | 8 | 6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 8 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 11 |

## Melee bench: F09

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.7 | 96 / 210 | 2.47 | 18.0% | 28783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 18.0% | 96 |
| rz.HawkOnFire 0.1 | 2.0 | 14.9% | 57 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 15 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 7 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.9% | 8 |
| stelo.PatternRobot 1.0 | 7.7 | 8.1% | 17 |
| spinnercat.Omen 1.0 | 8.2 | 8.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 13 / 35 | 4679 |
| 2 | 1 | 68.1 | 81.3 | 17 / 35 | 5283 |
| 3 | 1 | 68.4 | 86.7 | 16 / 35 | 5055 |
| 4 | 1 | 66.9 | 79.7 | 13 / 35 | 4393 |
| 5 | 1 | 66.9 | 81.6 | 17 / 35 | 4587 |
| 6 | 1 | 69.4 | 89.8 | 20 / 35 | 4786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 62 | 47% |
| nz.jdc.nano.GridFu 1.0 | 29 | 90% |
| ratosh.Wesco 1.4 | 13 | 54% |
| maribo.IotaCT 1.1 | 9 | 78% |
| spinnercat.Omen 1.0 | 9 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 78% |
| stelo.PatternRobot 1.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 54 | 47% | 81 |
| stelo.PatternRobot 1.0 | 17 | 15% | 19 |
| ratosh.Wesco 1.4 | 16 | 14% | 27 |
| nz.jdc.nano.GridFu 1.0 | 10 | 9% | 35 |
| maribo.IotaCT 1.1 | 6 | 5% | 20 |
| timmit.nano.TimDog 0.33 | 6 | 5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 9 |
| spinnercat.Omen 1.0 | 2 | 2% | 8 |

## Melee bench: F10

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.5 | 126 / 210 | 2.21 | 19.6% | 36450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 19.6% | 126 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.2% | 17 |
| baal.nano.N 1.42 | 3.3 | 11.0% | 8 |
| zyx.micro.Ant 1.1 | 4.0 | 10.0% | 19 |
| Grystrion.TrackerWO 1.0 | 4.7 | 10.1% | 9 |
| cvt.Firsty 1.0 | 6.3 | 8.5% | 20 |
| sanja.First 0.1 | 7.3 | 7.9% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.6% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.4 | 16 / 35 | 6033 |
| 2 | 1 | 69.7 | 89.5 | 22 / 35 | 5939 |
| 3 | 1 | 68.2 | 84.1 | 22 / 35 | 6025 |
| 4 | 1 | 69.7 | 88.9 | 23 / 35 | 6155 |
| 5 | 1 | 70.7 | 91.4 | 25 / 35 | 6395 |
| 6 | 1 | 67.6 | 80.6 | 18 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 34 | 94% |
| baal.nano.N 1.42 | 32 | 91% |
| cvt.Firsty 1.0 | 30 | 60% |
| zyx.micro.Ant 1.1 | 18 | 39% |
| Grystrion.TrackerWO 1.0 | 14 | 86% |
| sanja.First 0.1 | 14 | 86% |
| amk.Punbot.Punbot 0.01 | 12 | 92% |
| sample.RamFire 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 31 | 35% | 49 |
| cvt.Firsty 1.0 | 22 | 25% | 36 |
| Grystrion.TrackerWO 1.0 | 9 | 10% | 20 |
| tvv.nano.Polaris 1.2 | 6 | 7% | 34 |
| baal.nano.N 1.42 | 6 | 7% | 26 |
| sanja.First 0.1 | 5 | 6% | 22 |
| amk.Punbot.Punbot 0.01 | 5 | 6% | 10 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 9 |
| sample.RamFire 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 63.5 | 61 / 210 | 4.28 | 14.0% | 27625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.3% | 71 |
| hadur117.micro.SaorCR 0.1 | 2.0 | 14.0% | 61 |
| cs.Wren 1.0 | 3.2 | 12.7% | 36 |
| mz.Cork 0.1 | 4.3 | 11.2% | 13 |
| js.PinBall 1.6 | 4.5 | 11.5% | 16 |
| joe.ADinosaur 1.0 | 5.8 | 9.7% | 5 |
| evd.X1 0.01 | 7.0 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 7.2% | 4 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 60.6 | 9 / 35 | 4874 |
| 2 | 2 | 60.0 | 61.9 | 9 / 35 | 4669 |
| 3 | 2 | 62.2 | 67.3 | 14 / 35 | 4666 |
| 4 | 2 | 58.2 | 57.5 | 6 / 35 | 4627 |
| 5 | 2 | 61.4 | 67.9 | 12 / 35 | 4118 |
| 6 | 2 | 62.0 | 66.0 | 11 / 35 | 4671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 59% |
| cs.Wren 1.0 | 16 | 19% |
| mz.Cork 0.1 | 8 | 88% |
| js.PinBall 1.6 | 6 | 100% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 150 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 63 | 42% | 100 |
| cs.Wren 1.0 | 33 | 22% | 35 |
| evd.X1 0.01 | 20 | 13% | 21 |
| joe.ADinosaur 1.0 | 10 | 7% | 12 |
| mz.Cork 0.1 | 7 | 5% | 11 |
| PSW.Relentless 0.1 | 6 | 4% | 7 |
| js.PinBall 1.6 | 5 | 3% | 10 |
| jsal.Jsalbot 1.0 | 4 | 3% | 12 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.3 | 103 / 210 | 2.60 | 17.9% | 28282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 17.9% | 103 |
| myl.nano.Graviton 1.10 | 2.3 | 12.0% | 36 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 10.2% | 22 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.0% | 5 |
| DBall.NUKE 0.1 | 6.8 | 8.2% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 11 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.9 | 19 / 35 | 4661 |
| 2 | 1 | 68.9 | 87.3 | 21 / 35 | 5174 |
| 3 | 1 | 65.7 | 78.1 | 14 / 35 | 4916 |
| 4 | 1 | 65.5 | 78.1 | 17 / 35 | 4536 |
| 5 | 1 | 67.1 | 84.4 | 17 / 35 | 4651 |
| 6 | 1 | 66.1 | 82.9 | 15 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 49% |
| stelo.AreaTargetingBot 1.1 | 25 | 60% |
| ntc.Opposite 1.5 | 19 | 63% |
| disan.Chair 2.2.0 | 14 | 93% |
| DBall.NUKE 0.1 | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 28 | 25% | 51 |
| stelo.AreaTargetingBot 1.1 | 20 | 18% | 37 |
| ntc.Opposite 1.5 | 20 | 18% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 14% | 32 |
| pfvicm.Sobieski 7.2.3b | 15 | 13% | 19 |
| disan.Chair 2.2.0 | 6 | 5% | 10 |
| donjezza.Muncho 1.0 | 5 | 4% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 16 |
| pbg.R2D2 1.0 | 1 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 65.9 | 48 / 210 | 4.07 | 14.1% | 25007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.4% | 47 |
| hadur117.micro.SaorCR 0.1 | 2.7 | 14.1% | 48 |
| oog.melee.Capulet 1.2 | 3.2 | 13.3% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.0% | 33 |
| yagami.Tidus 0.11 | 4.0 | 12.2% | 20 |
| ejb.Polaris 1.0.1 | 5.8 | 11.0% | 14 |
| stelo.MirrorNano 1.3 | 7.0 | 7.4% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 72.7 | 11 / 35 | 4044 |
| 2 | 6 | 57.9 | 56.8 | 4 / 35 | 4071 |
| 3 | 1 | 63.5 | 70.2 | 12 / 35 | 4459 |
| 4 | 3 | 61.4 | 67.0 | 6 / 35 | 4002 |
| 5 | 2 | 62.3 | 66.3 | 8 / 35 | 4398 |
| 6 | 3 | 60.4 | 62.2 | 7 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 24 | 67% |
| oog.melee.Capulet 1.2 | 21 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 65% |
| yagami.Tidus 0.11 | 15 | 53% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 30% | 58 |
| yagami.Tidus 0.11 | 41 | 25% | 48 |
| kawigi.micro.Shiz 1.1 | 25 | 15% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 10% | 31 |
| ejb.Polaris 1.0.1 | 9 | 6% | 14 |
| stelo.MirrorNano 1.3 | 9 | 6% | 9 |
| step.nanoPri 1.0 | 7 | 4% | 7 |
| kurios.DOSexe .9a | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 76.3 | 96 / 210 | 3.13 | 16.3% | 25958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 16.3% | 96 |
| bzdp.Pansy 2.1 | 2.2 | 12.7% | 35 |
| wee.Gem 1.8.4 | 3.7 | 11.8% | 28 |
| wompi.Quokka 1.6 | 4.2 | 11.5% | 13 |
| ratosh.Nobo 0.21 | 4.7 | 11.2% | 12 |
| m3thos.Eva00 1.1 | 5.3 | 10.5% | 14 |
| bayen.UbaMicro 1.4 | 7.0 | 8.9% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 1 |
| maribo.FollowFire 1 | 9.3 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 76.8 | 16 / 35 | 4362 |
| 2 | 1 | 66.5 | 84.1 | 19 / 35 | 4291 |
| 3 | 1 | 62.4 | 71.7 | 13 / 35 | 4190 |
| 4 | 1 | 66.5 | 80.0 | 20 / 35 | 4592 |
| 5 | 1 | 62.2 | 71.1 | 13 / 35 | 3906 |
| 6 | 1 | 64.8 | 74.3 | 15 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 72% |
| wee.Gem 1.8.4 | 34 | 79% |
| wompi.Quokka 1.6 | 18 | 83% |
| m3thos.Eva00 1.1 | 16 | 63% |
| ratosh.Nobo 0.21 | 12 | 67% |
| bayen.UbaMicro 1.4 | 3 | 33% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 26 | 22% | 58 |
| m3thos.Eva00 1.1 | 18 | 16% | 28 |
| ratosh.Nobo 0.21 | 16 | 14% | 24 |
| wee.Gem 1.8.4 | 13 | 11% | 41 |
| bayen.UbaMicro 1.4 | 11 | 9% | 14 |
| maribo.FollowFire 1 | 10 | 9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 8% | 14 |
| wompi.Quokka 1.6 | 7 | 6% | 17 |
| stelo.MyAgileRobot 0.2 | 6 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.9 | 115 / 210 | 2.27 | 20.2% | 43044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 20.2% | 115 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 64 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 20 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.1% | 7 |
| ayk.WallHugger 1.0 | 4.5 | 9.9% | 4 |
| stuff.Vlad 0.1 | 6.2 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 82.2 | 19 / 35 | 7191 |
| 2 | 1 | 71.6 | 87.0 | 20 / 35 | 7491 |
| 3 | 1 | 72.6 | 91.1 | 22 / 35 | 7392 |
| 4 | 1 | 70.3 | 82.2 | 19 / 35 | 7193 |
| 5 | 1 | 71.6 | 90.2 | 19 / 35 | 6911 |
| 6 | 1 | 70.0 | 82.5 | 16 / 35 | 6866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 113 | 66% |
| mz.NanoGod 2.02 | 17 | 82% |
| exauge.GateKeeper 1.1.121g | 14 | 79% |
| ayk.WallHugger 1.0 | 8 | 75% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 48 | 49% | 126 |
| mz.NanoGod 2.02 | 19 | 19% | 34 |
| ayk.WallHugger 1.0 | 14 | 14% | 21 |
| exauge.GateKeeper 1.1.121g | 12 | 12% | 18 |
| drd.Dreadknoght 0.9 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 72.9 | 80 / 210 | 3.44 | 16.0% | 28051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 16.0% | 80 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 40 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 19 |
| bvh.micro.Freya 0.3 | 4.0 | 11.7% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.2% | 29 |
| conscience.Electron 1.3g | 6.3 | 8.8% | 7 |
| stelo.MirrorMicro 1.0 | 6.5 | 9.1% | 5 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 10 |
| dl.BetterWalls 1.0 | 9.0 | 5.8% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.3 | 17 / 35 | 4938 |
| 2 | 1 | 62.5 | 69.2 | 8 / 35 | 4620 |
| 3 | 1 | 64.2 | 76.5 | 14 / 35 | 4418 |
| 4 | 1 | 63.5 | 68.9 | 14 / 35 | 4634 |
| 5 | 1 | 65.4 | 75.2 | 13 / 35 | 5295 |
| 6 | 1 | 61.7 | 67.3 | 14 / 35 | 4146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 48% |
| dummy.micro.Sparrow 2.5 | 23 | 74% |
| bvh.micro.Freya 0.3 | 23 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 55% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 25% | 60 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 18% | 40 |
| conscience.Electron 1.3g | 22 | 17% | 25 |
| dummy.micro.Sparrow 2.5 | 19 | 15% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 12% | 13 |
| bvh.micro.Freya 0.3 | 7 | 5% | 15 |
| dl.BetterWalls 1.0 | 6 | 5% | 9 |
| stelo.MirrorMicro 1.0 | 4 | 3% | 10 |

## Melee bench: F17

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.4 | 112 / 210 | 2.40 | 19.7% | 39513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.0 | 19.7% | 112 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 32 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.7% | 26 |
| sul.Lunar 1.1 | 3.8 | 11.7% | 16 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 9 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 3 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 8 |
| sample.Corners 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.8 | 22 / 35 | 7068 |
| 2 | 1 | 67.9 | 75.6 | 12 / 35 | 6867 |
| 3 | 1 | 69.0 | 85.1 | 17 / 35 | 6009 |
| 4 | 1 | 69.6 | 84.4 | 20 / 35 | 6620 |
| 5 | 1 | 67.9 | 79.4 | 18 / 35 | 6253 |
| 6 | 1 | 71.7 | 92.4 | 23 / 35 | 6696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 61 | 75% |
| sul.Lunar 1.1 | 35 | 94% |
| supersample.SuperBoxBot 1.0 | 25 | 48% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| dsw.StaticD 1.0 | 6 | 83% |
| mme.NikeEnhanced 2.0 | 6 | 67% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| sample.Corners 1.0 | 1 | 0% |

Hadur died in 100 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 32% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 29% | 75 |
| mme.NikeEnhanced 2.0 | 12 | 12% | 20 |
| sul.Lunar 1.1 | 11 | 11% | 45 |
| dsw.StaticD 1.0 | 6 | 6% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 7 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.2 | 85 / 210 | 3.14 | 17.1% | 35452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCR 0.1 | 1.2 | 17.1% | 85 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 38 |
| mld.Wisdom 1.0 | 3.2 | 12.3% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 39 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 11 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 7 |
| sample.Walls 1.0 | 7.2 | 8.1% | 5 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 4 |
| GarmBox.Oranges 1.0 | 8.7 | 6.6% | 1 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 58.1 | 6 / 35 | 4999 |
| 2 | 1 | 67.9 | 83.5 | 17 / 35 | 5929 |
| 3 | 1 | 65.7 | 74.9 | 14 / 35 | 6015 |
| 4 | 1 | 65.3 | 75.6 | 16 / 35 | 5545 |
| 5 | 1 | 67.2 | 81.3 | 14 / 35 | 6173 |
| 6 | 1 | 68.6 | 83.8 | 18 / 35 | 6791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 52% |
| radnor.DoctorBob 1.42 | 33 | 67% |
| mld.Wisdom 1.0 | 20 | 55% |
| KiraNL.Chupacabra 0.4 | 14 | 64% |
| sample.Target 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 4 | 50% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 25% | 57 |
| mld.Wisdom 1.0 | 29 | 23% | 44 |
| radnor.DoctorBob 1.42 | 18 | 14% | 35 |
| KiraNL.Chupacabra 0.4 | 18 | 14% | 30 |
| amz.NanoClone 1.41 | 14 | 11% | 17 |
| GarmBox.Oranges 1.0 | 7 | 6% | 8 |
| jangs.ns51 1.0 | 6 | 5% | 11 |
| sample.Walls 1.0 | 3 | 2% | 7 |

