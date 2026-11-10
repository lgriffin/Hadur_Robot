# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 86.9 | 137 / 210 | 2.18 | 20.5% | 40327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 20.5% | 137 |
| mz.AntiGrav 1.0 | 2.5 | 14.8% | 20 |
| radnor.DoctorBob 1.42 | 3.0 | 14.1% | 29 |
| mld.Infinity 2.2 | 3.5 | 13.4% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| sample.Walls 1.0 | 6.3 | 7.2% | 1 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.7% | 0 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 80.3 | 16 / 35 | 6588 |
| 2 | 1 | 72.0 | 87.6 | 23 / 35 | 7187 |
| 3 | 1 | 71.7 | 86.7 | 26 / 35 | 6643 |
| 4 | 1 | 71.1 | 87.0 | 23 / 35 | 6392 |
| 5 | 1 | 72.0 | 91.1 | 25 / 35 | 6701 |
| 6 | 1 | 71.7 | 88.6 | 24 / 35 | 6816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 90% |
| mld.Infinity 2.2 | 29 | 83% |
| radnor.DoctorBob 1.42 | 28 | 89% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 36% | 55 |
| mz.AntiGrav 1.0 | 24 | 32% | 89 |
| mld.Infinity 2.2 | 9 | 12% | 30 |
| amz.NanoClone 1.41 | 5 | 7% | 14 |
| sample.Walls 1.0 | 3 | 4% | 10 |
| jangs.ns51 1.0 | 3 | 4% | 7 |
| GarmBox.Oranges 1.0 | 3 | 4% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.8 | 107 / 210 | 2.81 | 17.6% | 31014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.3 | 17.6% | 107 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.8% | 55 |
| mld.DustBunny 3.8 | 2.8 | 13.5% | 19 |
| maribo.melee.BMV 0.1 | 4.8 | 9.9% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 8 |
| zyx.nano.Ant 1.1 | 6.0 | 8.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.2% | 9 |
| fullsail.SweetTea 1.1 | 7.7 | 7.0% | 5 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.8 | 19 / 35 | 5232 |
| 2 | 1 | 69.4 | 89.5 | 24 / 35 | 5431 |
| 3 | 1 | 67.4 | 84.8 | 19 / 35 | 5159 |
| 4 | 3 | 56.3 | 46.0 | 6 / 35 | 4605 |
| 5 | 1 | 68.7 | 87.3 | 21 / 35 | 5306 |
| 6 | 1 | 67.4 | 81.6 | 18 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 79% |
| mld.DustBunny 3.8 | 47 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 29% | 74 |
| mld.DustBunny 3.8 | 24 | 23% | 61 |
| cs.Grudge 1.0 | 12 | 12% | 10 |
| zyx.nano.Ant 1.1 | 10 | 10% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 16 |
| fullsail.SweetTea 1.1 | 7 | 7% | 13 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 9 |
| maribo.melee.BMV 0.1 | 5 | 5% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 79.8 | 112 / 210 | 2.82 | 18.7% | 35537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 18.7% | 112 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.0% | 27 |
| fm.mammillarias 1.3 | 5.0 | 10.0% | 5 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.7% | 11 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 4 |
| sample.Fire 1.0 | 9.2 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 81.3 | 21 / 35 | 6283 |
| 2 | 1 | 68.3 | 80.3 | 19 / 35 | 6063 |
| 3 | 1 | 68.9 | 81.0 | 22 / 35 | 5722 |
| 4 | 1 | 69.4 | 80.3 | 18 / 35 | 6167 |
| 5 | 1 | 66.7 | 77.1 | 16 / 35 | 5340 |
| 6 | 1 | 67.9 | 78.7 | 16 / 35 | 5962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 64% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| sp.Nanos.Ember 1.1 | 15 | 93% |
| myl.nano.KomoriNinja 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 31 | 32% | 42 |
| myl.micro.Troodon 1.10 | 17 | 17% | 65 |
| fm.mammillarias 1.3 | 17 | 17% | 21 |
| cb.nano.Insomnia 1.0 | 15 | 15% | 20 |
| myl.nano.KomoriNinja 1.1 | 7 | 7% | 28 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 22 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
| sample.Fire 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.3 | 142 / 210 | 2.23 | 20.2% | 38317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 20.2% | 142 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 10.2% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 6.0 | 8.7% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 3 |
| yk.JahMicro 1.0 | 7.7 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.2 | 25 / 35 | 5989 |
| 2 | 1 | 70.9 | 91.7 | 26 / 35 | 6187 |
| 3 | 1 | 69.8 | 86.3 | 22 / 35 | 6420 |
| 4 | 1 | 69.5 | 83.5 | 22 / 35 | 6243 |
| 5 | 1 | 71.6 | 89.8 | 24 / 35 | 7182 |
| 6 | 1 | 69.3 | 84.1 | 23 / 35 | 6296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 93% |
| stelo.SoJNanoMelee 1.1 | 48 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 89% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| tj.zombie1n 1.0.1 | 8 | 88% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 23 | 34% | 43 |
| kawigi.nano.Lib 1.0 | 18 | 26% | 76 |
| tvv.micro.Antares 1.1.1 | 8 | 12% | 24 |
| tj.zombie1n 1.0.1 | 7 | 10% | 9 |
| yk.JahMicro 1.0 | 4 | 6% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 22 |
| repositorio.NanoStep 1.0 | 3 | 4% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.9 | 84 / 210 | 3.80 | 15.7% | 29615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 15.7% | 84 |
| oog.melee.Corsair 1.0 | 2.5 | 12.3% | 32 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.8% | 22 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 12 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.7% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 75.2 | 16 / 35 | 5187 |
| 2 | 1 | 62.0 | 68.6 | 12 / 35 | 4677 |
| 3 | 1 | 60.7 | 61.9 | 15 / 35 | 4672 |
| 4 | 1 | 64.1 | 69.8 | 14 / 35 | 5298 |
| 5 | 1 | 62.6 | 68.3 | 15 / 35 | 4601 |
| 6 | 1 | 63.7 | 69.8 | 12 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 87% |
| oog.melee.Corsair 1.0 | 28 | 57% |
| ahf.NanoAndrew .4 | 26 | 85% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 18% | 43 |
| ahf.NanoAndrew .4 | 21 | 17% | 48 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13% | 17 |
| EBBU.Sim2 1.02 | 14 | 11% | 22 |
| sam.Samspin 1.0 | 12 | 10% | 17 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.8 | 137 / 210 | 2.19 | 19.5% | 33495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 19.5% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 32 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.1% | 9 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.6% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 8 |
| fm.claire 1.7 | 6.2 | 8.6% | 0 |
| sample.SpinBot 1.0 | 8.0 | 7.3% | 2 |
| pa.Improved 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 27 / 35 | 5725 |
| 2 | 1 | 68.9 | 87.3 | 23 / 35 | 5218 |
| 3 | 1 | 69.4 | 87.9 | 23 / 35 | 5641 |
| 4 | 1 | 69.9 | 86.3 | 22 / 35 | 6182 |
| 5 | 1 | 67.1 | 79.7 | 20 / 35 | 5112 |
| 6 | 1 | 69.3 | 88.6 | 22 / 35 | 5617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 84% |
| oog.melee.CapuletDroid 1.1 | 47 | 100% |
| arthord.NanoSatanMelee Beta | 17 | 82% |
| gh.nano.Grofvuil 0.2 | 11 | 73% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| sample.SpinBot 1.0 | 8 | 100% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 31% | 65 |
| gh.nano.Grofvuil 0.2 | 15 | 20% | 30 |
| arthord.NanoSatanMelee Beta | 11 | 15% | 22 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 13 |
| oog.melee.CapuletDroid 1.1 | 6 | 8% | 52 |
| sample.SpinBot 1.0 | 3 | 4% | 10 |
| pa.Improved 1.0 | 3 | 4% | 6 |
| kurios.DOSexe .9b | 3 | 4% | 6 |
| fm.claire 1.7 | 3 | 4% | 6 |

## Melee bench: F07

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.0 | 84 / 210 | 3.16 | 16.8% | 32115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.2 | 16.8% | 84 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.5% | 49 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.7% | 42 |
| mz.MicroGodMelee 1 | 4.0 | 12.6% | 23 |
| DBall.Anarchy 0.1 | 5.5 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.2% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.9% | 3 |
| el.JumpShoot 0.2 | 8.5 | 6.2% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 76.8 | 13 / 35 | 5362 |
| 2 | 1 | 64.5 | 74.3 | 11 / 35 | 5280 |
| 3 | 1 | 68.2 | 83.2 | 18 / 35 | 5757 |
| 4 | 1 | 64.1 | 68.9 | 15 / 35 | 5348 |
| 5 | 1 | 65.9 | 74.3 | 14 / 35 | 5537 |
| 6 | 1 | 65.5 | 78.4 | 13 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 81% |
| mz.MicroGodMelee 1 | 22 | 73% |
| gh.micro.Gruweltje 0.7 | 21 | 57% |
| DBall.Anarchy 0.1 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 32% | 79 |
| gh.micro.Gruweltje 0.7 | 39 | 31% | 52 |
| mz.MicroGodMelee 1 | 17 | 13% | 35 |
| acogdev.alpha 0.2 | 9 | 7% | 10 |
| caimano.Furia_Ceca 0.22 | 8 | 6% | 10 |
| el.JumpShoot 0.2 | 6 | 5% | 6 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |

## Melee bench: F08

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.1 | 106 / 210 | 3.51 | 16.4% | 29606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.3 | 16.4% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 35 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 4 |
| germ.TheMind .2 | 5.2 | 9.5% | 9 |
| awesomeness.Elite 1.0 | 6.3 | 8.7% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.9% | 3 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 22 / 35 | 4978 |
| 2 | 2 | 64.4 | 69.2 | 17 / 35 | 4894 |
| 3 | 2 | 63.3 | 67.9 | 15 / 35 | 4881 |
| 4 | 1 | 63.4 | 69.8 | 15 / 35 | 4707 |
| 5 | 1 | 64.5 | 70.8 | 17 / 35 | 4936 |
| 6 | 1 | 66.3 | 76.8 | 20 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 76% |
| germ.TheMind .2 | 9 | 89% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| sample.Crazy 1.0 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |

Hadur died in 105 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 42% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 36 |
| germ.TheMind .2 | 13 | 12% | 23 |
| stelo.UntouchableNano 1.3 | 12 | 11% | 20 |
| awesomeness.Elite 1.0 | 7 | 7% | 18 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.5 | 133 / 210 | 2.48 | 18.8% | 29696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 18.8% | 133 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.7% | 10 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 9 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.8% | 4 |
| stelo.PatternRobot 1.0 | 7.2 | 8.3% | 11 |
| ratosh.Wesco 1.4 | 7.8 | 8.3% | 9 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 22 / 35 | 4843 |
| 2 | 1 | 68.3 | 79.7 | 22 / 35 | 4845 |
| 3 | 1 | 69.7 | 85.7 | 23 / 35 | 5296 |
| 4 | 1 | 70.7 | 87.9 | 25 / 35 | 5314 |
| 5 | 1 | 67.3 | 80.6 | 21 / 35 | 4371 |
| 6 | 1 | 68.2 | 84.1 | 20 / 35 | 5027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 97% |
| nz.jdc.nano.GridFu 1.0 | 28 | 93% |
| stelo.PatternRobot 1.0 | 13 | 69% |
| maribo.IotaCT 1.1 | 12 | 83% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 89% |
| ratosh.Wesco 1.4 | 7 | 71% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 20 | 26% | 24 |
| rz.HawkOnFire 0.1 | 17 | 22% | 74 |
| timmit.nano.TimDog 0.33 | 14 | 18% | 23 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 47 |
| maribo.IotaCT 1.1 | 7 | 9% | 18 |
| ratosh.Wesco 1.4 | 6 | 8% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |

## Melee bench: F10

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.4 | 152 / 210 | 1.95 | 20.6% | 38067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 20.6% | 152 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 17 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 12 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 4 |
| zyx.micro.Ant 1.1 | 5.2 | 9.1% | 10 |
| sanja.First 0.1 | 7.0 | 8.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.1% | 2 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.5% | 2 |
| cvt.Firsty 1.0 | 7.8 | 7.3% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.7 | 26 / 35 | 6335 |
| 2 | 1 | 69.6 | 85.7 | 25 / 35 | 6276 |
| 3 | 1 | 70.9 | 91.4 | 26 / 35 | 6419 |
| 4 | 1 | 70.3 | 90.8 | 26 / 35 | 5885 |
| 5 | 1 | 69.2 | 84.4 | 21 / 35 | 6315 |
| 6 | 1 | 71.7 | 92.4 | 28 / 35 | 6837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 93% |
| baal.nano.N 1.42 | 32 | 78% |
| cvt.Firsty 1.0 | 27 | 89% |
| sanja.First 0.1 | 19 | 89% |
| amk.Punbot.Punbot 0.01 | 15 | 93% |
| zyx.micro.Ant 1.1 | 14 | 86% |
| Grystrion.TrackerWO 1.0 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 34% | 41 |
| baal.nano.N 1.42 | 10 | 17% | 36 |
| tvv.nano.Polaris 1.2 | 6 | 10% | 47 |
| cvt.Firsty 1.0 | 6 | 10% | 24 |
| Grystrion.TrackerWO 1.0 | 6 | 10% | 15 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 16 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 6 |
| sanja.First 0.1 | 2 | 3% | 19 |
| sample.RamFire 1.0 | 2 | 3% | 5 |

## Melee bench: F11

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.8 | 80 / 210 | 3.81 | 15.4% | 30084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.3 | 15.4% | 80 |
| kc.micro.Figment 1.0 | 1.7 | 15.0% | 61 |
| cs.Wren 1.0 | 3.8 | 12.2% | 23 |
| mz.Cork 0.1 | 4.3 | 10.9% | 16 |
| js.PinBall 1.6 | 4.5 | 11.2% | 11 |
| joe.ADinosaur 1.0 | 5.7 | 9.3% | 6 |
| evd.X1 0.01 | 6.8 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.2% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 74.0 | 17 / 35 | 5235 |
| 2 | 1 | 65.2 | 74.6 | 15 / 35 | 5250 |
| 3 | 2 | 63.5 | 68.9 | 11 / 35 | 5443 |
| 4 | 2 | 60.9 | 62.9 | 14 / 35 | 4462 |
| 5 | 1 | 60.9 | 61.3 | 10 / 35 | 4901 |
| 6 | 1 | 63.1 | 71.1 | 13 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 71% |
| cs.Wren 1.0 | 23 | 78% |
| js.PinBall 1.6 | 10 | 80% |
| mz.Cork 0.1 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 42% | 107 |
| cs.Wren 1.0 | 23 | 18% | 31 |
| evd.X1 0.01 | 16 | 12% | 16 |
| joe.ADinosaur 1.0 | 10 | 8% | 10 |
| PSW.Relentless 0.1 | 10 | 8% | 9 |
| js.PinBall 1.6 | 6 | 5% | 14 |
| mz.Cork 0.1 | 4 | 3% | 10 |
| jsal.Jsalbot 1.0 | 4 | 3% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.4 | 127 / 210 | 2.40 | 18.7% | 28915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 18.7% | 127 |
| myl.nano.Graviton 1.10 | 2.8 | 11.7% | 27 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 12 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.7% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.0% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 4 |
| disan.Chair 2.2.0 | 7.0 | 8.2% | 6 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 3 |
| pbg.R2D2 1.0 | 9.5 | 6.0% | 2 |
| donjezza.Muncho 1.0 | 9.5 | 6.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 20 / 35 | 4375 |
| 2 | 1 | 68.8 | 85.7 | 22 / 35 | 5294 |
| 3 | 1 | 69.3 | 87.3 | 24 / 35 | 5279 |
| 4 | 1 | 68.7 | 86.3 | 22 / 35 | 4999 |
| 5 | 1 | 66.9 | 82.5 | 19 / 35 | 4500 |
| 6 | 1 | 66.7 | 82.9 | 20 / 35 | 4468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 98% |
| stelo.AreaTargetingBot 1.1 | 31 | 84% |
| ntc.Opposite 1.5 | 21 | 71% |
| donjezza.Muncho 1.0 | 14 | 93% |
| disan.Chair 2.2.0 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| DBall.NUKE 0.1 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 75% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 22% | 43 |
| ntc.Opposite 1.5 | 17 | 20% | 27 |
| myl.nano.Graviton 1.10 | 13 | 15% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 21 |
| pfvicm.Sobieski 7.2.3b | 8 | 9% | 16 |
| disan.Chair 2.2.0 | 6 | 7% | 17 |
| pbg.R2D2 1.0 | 6 | 7% | 16 |
| donjezza.Muncho 1.0 | 3 | 4% | 14 |
| DBall.NUKE 0.1 | 2 | 2% | 5 |

## Melee bench: F13

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.7 | 68 / 210 | 3.72 | 15.1% | 26222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.3 | 15.1% | 68 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 38 |
| oog.melee.Capulet 1.2 | 2.3 | 14.3% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 23 |
| yagami.Tidus 0.11 | 4.7 | 11.8% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.9 | 13 / 35 | 4573 |
| 2 | 1 | 60.7 | 65.1 | 7 / 35 | 4372 |
| 3 | 1 | 63.4 | 67.3 | 11 / 35 | 4638 |
| 4 | 2 | 63.2 | 67.9 | 15 / 35 | 4170 |
| 5 | 1 | 64.1 | 72.4 | 11 / 35 | 4442 |
| 6 | 2 | 63.5 | 70.8 | 11 / 35 | 4027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 61% |
| oog.melee.Capulet 1.2 | 26 | 62% |
| kawigi.micro.Shiz 1.1 | 20 | 95% |
| yagami.Tidus 0.11 | 14 | 93% |
| ejb.Polaris 1.0.1 | 4 | 75% |

Hadur died in 142 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 35% | 66 |
| yagami.Tidus 0.11 | 25 | 18% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 15% | 40 |
| kawigi.micro.Shiz 1.1 | 20 | 14% | 29 |
| ejb.Polaris 1.0.1 | 13 | 9% | 20 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |
| kurios.DOSexe .9a | 4 | 3% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.3 | 123 / 210 | 2.96 | 17.2% | 26899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 17.2% | 123 |
| bzdp.Pansy 2.1 | 3.3 | 11.5% | 14 |
| wee.Gem 1.8.4 | 3.5 | 11.8% | 27 |
| wompi.Quokka 1.6 | 3.7 | 11.5% | 15 |
| ratosh.Nobo 0.21 | 4.0 | 11.7% | 14 |
| m3thos.Eva00 1.1 | 5.5 | 10.1% | 12 |
| bayen.UbaMicro 1.4 | 7.2 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 6.0% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.3 | 27 / 35 | 4697 |
| 2 | 1 | 64.9 | 74.9 | 17 / 35 | 4689 |
| 3 | 1 | 67.0 | 81.9 | 19 / 35 | 4635 |
| 4 | 1 | 66.4 | 81.9 | 21 / 35 | 4473 |
| 5 | 1 | 63.3 | 69.5 | 20 / 35 | 4135 |
| 6 | 1 | 64.1 | 73.0 | 19 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 100% |
| wee.Gem 1.8.4 | 36 | 97% |
| wompi.Quokka 1.6 | 22 | 86% |
| ratosh.Nobo 0.21 | 14 | 86% |
| m3thos.Eva00 1.1 | 8 | 63% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 14 | 16% | 23 |
| maribo.FollowFire 1 | 12 | 13% | 12 |
| m3thos.Eva00 1.1 | 11 | 12% | 21 |
| bayen.UbaMicro 1.4 | 10 | 11% | 16 |
| bzdp.Pansy 2.1 | 9 | 10% | 48 |
| wee.Gem 1.8.4 | 9 | 10% | 45 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 13 |
| stelo.MyAgileRobot 0.2 | 9 | 10% | 11 |
| wompi.Quokka 1.6 | 6 | 7% | 19 |

## Melee bench: F15

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 89.7 | 131 / 210 | 1.93 | 21.1% | 43255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 21.1% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 50 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 23 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 2 |
| ayk.WallHugger 1.0 | 4.5 | 10.0% | 2 |
| stuff.Vlad 0.1 | 6.3 | 8.2% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 87.9 | 21 / 35 | 6717 |
| 2 | 1 | 70.6 | 88.3 | 16 / 35 | 6616 |
| 3 | 1 | 73.5 | 94.0 | 27 / 35 | 7655 |
| 4 | 1 | 73.9 | 94.0 | 28 / 35 | 7677 |
| 5 | 1 | 72.4 | 90.5 | 21 / 35 | 7379 |
| 6 | 1 | 71.0 | 83.5 | 18 / 35 | 7211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 83% |
| mz.NanoGod 2.02 | 20 | 45% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 44% | 134 |
| mz.NanoGod 2.02 | 29 | 36% | 42 |
| ayk.WallHugger 1.0 | 7 | 9% | 12 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 11 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.0 | 88 / 210 | 3.79 | 15.9% | 29371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 15.9% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 31 |
| bvh.micro.Freya 0.3 | 3.3 | 11.9% | 28 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.4% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.7% | 22 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.7% | 5 |
| conscience.Electron 1.3g | 6.3 | 8.3% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.3% | 1 |
| dl.BetterWalls 1.0 | 9.5 | 6.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 67.3 | 14 / 35 | 4797 |
| 2 | 1 | 63.0 | 67.3 | 14 / 35 | 4985 |
| 3 | 1 | 65.2 | 74.3 | 17 / 35 | 4969 |
| 4 | 1 | 63.0 | 66.7 | 15 / 35 | 4826 |
| 5 | 1 | 65.4 | 74.9 | 16 / 35 | 4862 |
| 6 | 1 | 61.7 | 63.8 | 12 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 78% |
| dummy.micro.Sparrow 2.5 | 22 | 77% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 90% |
| bvh.micro.Freya 0.3 | 16 | 63% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 22% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 17% | 21 |
| conscience.Electron 1.3g | 18 | 15% | 20 |
| dummy.micro.Sparrow 2.5 | 17 | 14% | 34 |
| bvh.micro.Freya 0.3 | 15 | 12% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 10% | 31 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 14 |
| dl.BetterWalls 1.0 | 4 | 3% | 9 |

## Melee bench: F17

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 85.6 | 140 / 210 | 2.30 | 20.8% | 42455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 20.8% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.9% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 9 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 13 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 5 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.6% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 6 |
| sample.Corners 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 94.9 | 29 / 35 | 7415 |
| 2 | 1 | 71.3 | 83.5 | 22 / 35 | 7818 |
| 3 | 1 | 68.2 | 79.4 | 19 / 35 | 6505 |
| 4 | 1 | 70.3 | 84.8 | 23 / 35 | 6795 |
| 5 | 1 | 71.1 | 86.3 | 25 / 35 | 6911 |
| 6 | 1 | 70.6 | 84.8 | 22 / 35 | 7011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 93% |
| supersample.SuperBoxBot 1.0 | 29 | 83% |
| dsw.StaticD 1.0 | 15 | 60% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 28% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 21% | 39 |
| dsw.StaticD 1.0 | 11 | 15% | 23 |
| mme.NikeEnhanced 2.0 | 9 | 13% | 16 |
| sul.Lunar 1.1 | 5 | 7% | 60 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 2 | 3% | 5 |

## Melee bench: F18

hadur117.micro.SaorWRD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.6 | 114 / 210 | 2.75 | 18.5% | 37620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWRD 0.1 | 1.0 | 18.5% | 114 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 27 |
| mld.Wisdom 1.0 | 3.2 | 12.4% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 24 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 9 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 10 |
| sample.Walls 1.0 | 7.0 | 8.0% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.9% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.4 | 21 / 35 | 6502 |
| 2 | 1 | 69.3 | 85.1 | 22 / 35 | 6523 |
| 3 | 1 | 67.5 | 77.8 | 16 / 35 | 6688 |
| 4 | 1 | 67.3 | 78.1 | 19 / 35 | 6052 |
| 5 | 1 | 66.1 | 75.9 | 18 / 35 | 5640 |
| 6 | 1 | 67.9 | 81.3 | 18 / 35 | 6215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 54 | 91% |
| radnor.DoctorBob 1.42 | 32 | 78% |
| sample.Walls 1.0 | 10 | 100% |
| mld.Wisdom 1.0 | 10 | 90% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 5 | 80% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 31% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 20% | 67 |
| radnor.DoctorBob 1.42 | 18 | 19% | 44 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 20 |
| amz.NanoClone 1.41 | 6 | 6% | 11 |
| GarmBox.Oranges 1.0 | 5 | 5% | 5 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 2 | 2% | 13 |

