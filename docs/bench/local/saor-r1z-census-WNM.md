# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 84.9 | 134 / 210 | 2.36 | 20.3% | 41618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.3% | 134 |
| radnor.DoctorBob 1.42 | 2.2 | 14.4% | 24 |
| mz.AntiGrav 1.0 | 3.2 | 13.4% | 16 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 8 |
| GarmBox.Oranges 1.0 | 6.5 | 7.4% | 3 |
| sample.Walls 1.0 | 7.0 | 7.0% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 2 |
| sample.Target 1.0 | 9.3 | 4.0% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 78.7 | 18 / 35 | 6349 |
| 2 | 1 | 72.2 | 87.3 | 25 / 35 | 7218 |
| 3 | 1 | 70.3 | 81.3 | 22 / 35 | 7300 |
| 4 | 1 | 70.2 | 84.1 | 22 / 35 | 6405 |
| 5 | 1 | 71.2 | 88.6 | 22 / 35 | 6984 |
| 6 | 1 | 72.1 | 89.5 | 25 / 35 | 7362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 61 | 93% |
| mld.Infinity 2.2 | 42 | 81% |
| radnor.DoctorBob 1.42 | 28 | 86% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 34% | 56 |
| mz.AntiGrav 1.0 | 18 | 24% | 66 |
| mld.Infinity 2.2 | 13 | 17% | 50 |
| amz.NanoClone 1.41 | 9 | 12% | 12 |
| jangs.ns51 1.0 | 5 | 7% | 11 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| sample.Walls 1.0 | 2 | 3% | 9 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 131 / 210 | 2.08 | 19.0% | 31878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 19.0% | 131 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.9% | 48 |
| mld.DustBunny 3.8 | 3.0 | 12.2% | 14 |
| maribo.melee.BMV 0.1 | 3.8 | 10.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.4% | 4 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 2 |
| fullsail.SweetTea 1.1 | 7.8 | 7.7% | 3 |
| bzdp.BoxCar 2.0 | 8.5 | 7.4% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.1 | 18 / 35 | 4983 |
| 2 | 1 | 68.4 | 87.9 | 20 / 35 | 5597 |
| 3 | 1 | 68.0 | 87.0 | 21 / 35 | 5232 |
| 4 | 1 | 68.7 | 85.4 | 21 / 35 | 5345 |
| 5 | 1 | 69.6 | 91.1 | 26 / 35 | 5305 |
| 6 | 1 | 70.0 | 92.7 | 25 / 35 | 5416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 66 | 76% |
| mld.DustBunny 3.8 | 42 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| maribo.melee.BMV 0.1 | 13 | 92% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| fullsail.SweetTea 1.1 | 10 | 80% |
| zyx.nano.Ant 1.1 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 42% | 86 |
| mld.DustBunny 3.8 | 19 | 24% | 52 |
| maribo.melee.BMV 0.1 | 6 | 8% | 15 |
| fullsail.SweetTea 1.1 | 6 | 8% | 12 |
| zyx.nano.Ant 1.1 | 6 | 8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 20 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 12 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.6 | 128 / 210 | 2.30 | 20.0% | 38067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.0% | 128 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 31 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.3% | 8 |
| fm.mammillarias 1.3 | 6.0 | 8.9% | 1 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 2 |
| sample.Fire 1.0 | 9.3 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.6 | 24 / 35 | 6556 |
| 2 | 1 | 69.0 | 83.2 | 15 / 35 | 6275 |
| 3 | 1 | 68.1 | 77.8 | 20 / 35 | 6055 |
| 4 | 1 | 72.3 | 92.1 | 28 / 35 | 6610 |
| 5 | 1 | 68.0 | 81.3 | 16 / 35 | 5877 |
| 6 | 1 | 71.4 | 90.5 | 25 / 35 | 6694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 68% |
| myl.nano.KomoriNinja 1.1 | 16 | 100% |
| cb.nano.Insomnia 1.0 | 16 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| sample.Fire 1.0 | 6 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 30 | 37% | 44 |
| myl.micro.Troodon 1.10 | 17 | 21% | 76 |
| fm.mammillarias 1.3 | 12 | 15% | 17 |
| cb.nano.Insomnia 1.0 | 8 | 10% | 10 |
| myl.nano.KomoriNinja 1.1 | 6 | 7% | 32 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| sample.Fire 1.0 | 3 | 4% | 6 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 14 |

## Melee bench: F04

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.4 | 146 / 210 | 1.96 | 20.9% | 40204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.9% | 146 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.2% | 20 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.7% | 5 |
| tj.zombie1n 1.0.1 | 5.2 | 9.0% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.4% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 3 |
| yk.JahMicro 1.0 | 6.2 | 8.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.4 | 26 / 35 | 6937 |
| 2 | 1 | 70.1 | 87.0 | 25 / 35 | 6414 |
| 3 | 1 | 69.8 | 86.3 | 20 / 35 | 6591 |
| 4 | 1 | 72.3 | 92.7 | 27 / 35 | 7378 |
| 5 | 1 | 69.7 | 86.3 | 22 / 35 | 6259 |
| 6 | 1 | 71.2 | 91.4 | 26 / 35 | 6625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 95% |
| stelo.SoJNanoMelee 1.1 | 44 | 80% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| yk.JahMicro 1.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 41% | 82 |
| stelo.SoJNanoMelee 1.1 | 17 | 27% | 40 |
| tj.zombie1n 1.0.1 | 7 | 11% | 11 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 6 |
| yk.JahMicro 1.0 | 1 | 2% | 11 |
| repositorio.NanoStep 1.0 | 0 | 0% | 13 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.5 | 79 / 210 | 3.75 | 15.4% | 28590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 15.4% | 79 |
| ahf.NanoAndrew .4 | 2.7 | 12.1% | 35 |
| oog.melee.Corsair 1.0 | 2.8 | 12.7% | 43 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.4% | 20 |
| robar.nano.Assertive_Melee 0.2 | 5.3 | 9.7% | 8 |
| sam.Samspin 1.0 | 5.7 | 9.6% | 13 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 9.0% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 72.4 | 15 / 35 | 5007 |
| 2 | 1 | 62.0 | 67.9 | 11 / 35 | 4536 |
| 3 | 1 | 63.1 | 68.9 | 13 / 35 | 4983 |
| 4 | 1 | 62.7 | 70.2 | 11 / 35 | 4953 |
| 5 | 1 | 63.6 | 72.7 | 15 / 35 | 4745 |
| 6 | 1 | 61.0 | 64.8 | 14 / 35 | 4366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 87% |
| oog.melee.Corsair 1.0 | 27 | 44% |
| ahf.NanoAndrew .4 | 21 | 90% |
| sam.Samspin 1.0 | 9 | 78% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 24 | 18% | 43 |
| robar.nano.Assertive_Melee 0.2 | 22 | 17% | 27 |
| oog.melee.Corsair 1.0 | 18 | 14% | 35 |
| EBBU.Sim2 1.02 | 18 | 14% | 22 |
| zyx.nano.BacillusComma 1.0 | 16 | 12% | 15 |
| simonton.nano.MeleeSeed 1.8 | 12 | 9% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 13 |
| sam.Samspin 1.0 | 9 | 7% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.3 | 129 / 210 | 2.41 | 18.7% | 31913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.7% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 32 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.9% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 7 |
| fm.claire 1.7 | 6.7 | 8.0% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 4 |
| pa.Improved 1.0 | 9.2 | 5.9% | 3 |
| kurios.DOSexe .9b | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 24 / 35 | 5368 |
| 2 | 1 | 68.1 | 82.9 | 21 / 35 | 5495 |
| 3 | 1 | 67.8 | 83.2 | 24 / 35 | 5115 |
| 4 | 1 | 68.8 | 84.4 | 24 / 35 | 5801 |
| 5 | 1 | 67.7 | 84.8 | 21 / 35 | 4973 |
| 6 | 1 | 66.0 | 79.7 | 15 / 35 | 5161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 89% |
| oog.melee.CapuletDroid 1.1 | 35 | 94% |
| gh.nano.Grofvuil 0.2 | 13 | 100% |
| arthord.NanoSatanMelee Beta | 10 | 90% |
| sample.SpinBot 1.0 | 7 | 71% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 33% | 74 |
| gh.nano.Grofvuil 0.2 | 14 | 17% | 30 |
| sample.SpinBot 1.0 | 10 | 12% | 13 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 43 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 12 |
| fm.claire 1.7 | 6 | 7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 14 |
| kurios.DOSexe .9b | 2 | 2% | 9 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.2 | 110 / 210 | 2.33 | 18.6% | 34517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.6% | 110 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.5% | 34 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.5% | 30 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 24 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 2 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 18 / 35 | 5939 |
| 2 | 1 | 66.8 | 80.6 | 17 / 35 | 5535 |
| 3 | 1 | 69.1 | 87.3 | 19 / 35 | 5981 |
| 4 | 1 | 68.8 | 84.4 | 18 / 35 | 5970 |
| 5 | 1 | 69.0 | 86.0 | 19 / 35 | 5855 |
| 6 | 1 | 68.2 | 86.0 | 19 / 35 | 5237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 78% |
| mz.MicroGodMelee 1 | 43 | 65% |
| gh.micro.Gruweltje 0.7 | 35 | 69% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| fire219.CatBot 1.0 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 29 | 29% | 58 |
| spinnercat.micro.Tyger 0.1 | 28 | 28% | 58 |
| mz.MicroGodMelee 1 | 26 | 26% | 54 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 8 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 10 |

## Melee bench: F08

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.0 | 98 / 210 | 3.79 | 15.7% | 29797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.2% | 50 |
| hadur117.micro.SaorWNM 0.1 | 1.5 | 15.7% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.9% | 19 |
| germ.TheMind .2 | 4.7 | 9.6% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.3% | 9 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.6% | 5 |
| awesomeness.Elite 1.0 | 7.7 | 7.9% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 58.4 | 10 / 35 | 4988 |
| 2 | 1 | 65.5 | 74.3 | 20 / 35 | 4974 |
| 3 | 2 | 62.1 | 69.2 | 15 / 35 | 4212 |
| 4 | 2 | 64.5 | 69.2 | 17 / 35 | 5148 |
| 5 | 1 | 63.8 | 67.6 | 17 / 35 | 5275 |
| 6 | 1 | 66.1 | 75.6 | 19 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 89% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| germ.TheMind .2 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 46% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 34 |
| germ.TheMind .2 | 11 | 10% | 20 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 18 |
| awesomeness.Elite 1.0 | 8 | 7% | 10 |
| sample.Crazy 1.0 | 5 | 4% | 9 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.9 | 141 / 210 | 2.18 | 19.4% | 30874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 19.4% | 141 |
| rz.HawkOnFire 0.1 | 2.0 | 13.4% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.0% | 8 |
| maribo.IotaCT 1.1 | 3.8 | 10.8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 3 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.7% | 9 |
| stelo.PatternRobot 1.0 | 7.0 | 8.7% | 9 |
| ratosh.Wesco 1.4 | 8.0 | 8.3% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 7.9% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 26 / 35 | 5052 |
| 2 | 1 | 68.3 | 84.4 | 23 / 35 | 4923 |
| 3 | 1 | 69.2 | 85.1 | 24 / 35 | 5198 |
| 4 | 1 | 69.1 | 85.7 | 23 / 35 | 5205 |
| 5 | 1 | 71.4 | 94.0 | 26 / 35 | 5726 |
| 6 | 1 | 67.3 | 81.0 | 19 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 89% |
| nz.jdc.nano.GridFu 1.0 | 23 | 100% |
| stelo.PatternRobot 1.0 | 23 | 87% |
| maribo.IotaCT 1.1 | 16 | 94% |
| timmit.nano.TimDog 0.33 | 14 | 64% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 20% | 56 |
| timmit.nano.TimDog 0.33 | 12 | 17% | 28 |
| ratosh.Wesco 1.4 | 11 | 16% | 24 |
| stelo.PatternRobot 1.0 | 9 | 13% | 22 |
| nz.jdc.nano.GridFu 1.0 | 6 | 9% | 39 |
| maribo.IotaCT 1.1 | 5 | 7% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 10 |
| spinnercat.Omen 1.0 | 5 | 7% | 8 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 3 |

## Melee bench: F10

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.4 | 172 / 210 | 1.60 | 21.6% | 39444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 21.6% | 172 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.0% | 15 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 3 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.2% | 10 |
| squidM.TentalceMeleeNano 1.1 | 5.7 | 8.8% | 1 |
| sanja.First 0.1 | 6.8 | 8.2% | 2 |
| cvt.Firsty 1.0 | 8.3 | 6.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.9% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 30 / 35 | 6349 |
| 2 | 1 | 72.4 | 97.8 | 32 / 35 | 6353 |
| 3 | 1 | 70.3 | 87.9 | 25 / 35 | 6340 |
| 4 | 1 | 71.6 | 91.4 | 28 / 35 | 6804 |
| 5 | 1 | 72.4 | 95.9 | 29 / 35 | 7011 |
| 6 | 1 | 71.1 | 93.0 | 28 / 35 | 6587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 94% |
| baal.nano.N 1.42 | 34 | 97% |
| cvt.Firsty 1.0 | 27 | 100% |
| sanja.First 0.1 | 19 | 100% |
| zyx.micro.Ant 1.1 | 18 | 89% |
| amk.Punbot.Punbot 0.01 | 15 | 93% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |

Hadur died in 38 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 37% | 31 |
| tvv.nano.Polaris 1.2 | 9 | 24% | 54 |
| cvt.Firsty 1.0 | 4 | 11% | 32 |
| baal.nano.N 1.42 | 3 | 8% | 38 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 8 |
| sample.RamFire 1.0 | 2 | 5% | 3 |
| sanja.First 0.1 | 1 | 3% | 24 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 65.9 | 78 / 210 | 4.07 | 15.0% | 31768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.1% | 68 |
| hadur117.micro.SaorWNM 0.1 | 1.8 | 15.0% | 78 |
| cs.Wren 1.0 | 3.2 | 12.7% | 27 |
| js.PinBall 1.6 | 4.2 | 11.3% | 15 |
| mz.Cork 0.1 | 4.8 | 10.7% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 2 |
| evd.X1 0.01 | 7.0 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 63.5 | 11 / 35 | 5258 |
| 2 | 2 | 62.2 | 64.4 | 13 / 35 | 5003 |
| 3 | 2 | 63.4 | 69.8 | 13 / 35 | 5401 |
| 4 | 2 | 62.5 | 62.2 | 14 / 35 | 5462 |
| 5 | 1 | 64.6 | 72.4 | 13 / 35 | 5562 |
| 6 | 2 | 61.6 | 62.9 | 14 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 64 | 67% |
| cs.Wren 1.0 | 21 | 76% |
| mz.Cork 0.1 | 7 | 71% |
| js.PinBall 1.6 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 44% | 110 |
| cs.Wren 1.0 | 22 | 17% | 29 |
| js.PinBall 1.6 | 11 | 8% | 15 |
| joe.ADinosaur 1.0 | 11 | 8% | 11 |
| mz.Cork 0.1 | 10 | 8% | 18 |
| evd.X1 0.01 | 10 | 8% | 11 |
| PSW.Relentless 0.1 | 7 | 5% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.6 | 117 / 210 | 2.39 | 18.7% | 29956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.7% | 117 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 25 |
| ntc.Opposite 1.5 | 3.3 | 11.0% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.3% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.1% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.9% | 9 |
| DBall.NUKE 0.1 | 7.7 | 7.6% | 6 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 11 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 22 / 35 | 5451 |
| 2 | 1 | 68.8 | 87.9 | 23 / 35 | 5135 |
| 3 | 1 | 66.9 | 81.3 | 19 / 35 | 4981 |
| 4 | 1 | 66.0 | 80.3 | 17 / 35 | 4558 |
| 5 | 1 | 67.6 | 84.4 | 17 / 35 | 5087 |
| 6 | 1 | 68.3 | 86.7 | 19 / 35 | 4744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 41 | 71% |
| myl.nano.Graviton 1.10 | 32 | 72% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 82% |
| ntc.Opposite 1.5 | 15 | 67% |
| disan.Chair 2.2.0 | 13 | 92% |
| DBall.NUKE 0.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 22 | 23% | 31 |
| myl.nano.Graviton 1.10 | 20 | 21% | 56 |
| stelo.AreaTargetingBot 1.1 | 20 | 21% | 34 |
| ntc.Opposite 1.5 | 9 | 10% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 17 |
| donjezza.Muncho 1.0 | 4 | 4% | 12 |
| pbg.R2D2 1.0 | 4 | 4% | 12 |
| DBall.NUKE 0.1 | 3 | 3% | 14 |
| disan.Chair 2.2.0 | 3 | 3% | 11 |

## Melee bench: F13

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 66.0 | 66 / 210 | 4.06 | 14.3% | 25135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.7 | 14.7% | 54 |
| hadur117.micro.SaorWNM 0.1 | 2.3 | 14.3% | 66 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.6% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.2% | 17 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 8 |
| ejb.Polaris 1.0.1 | 5.5 | 11.1% | 19 |
| stelo.MirrorNano 1.3 | 7.5 | 7.8% | 2 |
| step.nanoPri 1.0 | 7.5 | 7.5% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 78.1 | 11 / 35 | 4011 |
| 2 | 3 | 61.4 | 62.9 | 12 / 35 | 3984 |
| 3 | 3 | 59.8 | 59.0 | 8 / 35 | 4257 |
| 4 | 3 | 60.7 | 61.6 | 9 / 35 | 4252 |
| 5 | 1 | 65.2 | 74.6 | 15 / 35 | 4469 |
| 6 | 3 | 60.3 | 60.0 | 11 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 58% |
| yagami.Tidus 0.11 | 21 | 90% |
| kawigi.micro.Shiz 1.1 | 17 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 60% |
| ejb.Polaris 1.0.1 | 7 | 43% |

Hadur died in 144 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 41% | 77 |
| yagami.Tidus 0.11 | 18 | 13% | 35 |
| kawigi.micro.Shiz 1.1 | 18 | 13% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 13% | 30 |
| ejb.Polaris 1.0.1 | 13 | 9% | 18 |
| step.nanoPri 1.0 | 8 | 6% | 9 |
| kurios.DOSexe .9a | 6 | 4% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.6 | 122 / 210 | 2.92 | 17.1% | 27280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 17.1% | 122 |
| wee.Gem 1.8.4 | 3.3 | 11.5% | 25 |
| ratosh.Nobo 0.21 | 3.5 | 11.6% | 17 |
| wompi.Quokka 1.6 | 3.5 | 11.5% | 9 |
| bzdp.Pansy 2.1 | 3.8 | 11.3% | 17 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 7.2 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.6% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 3 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.9 | 19 / 35 | 4813 |
| 2 | 1 | 65.7 | 78.4 | 21 / 35 | 4652 |
| 3 | 1 | 66.1 | 79.7 | 21 / 35 | 4631 |
| 4 | 1 | 65.6 | 77.8 | 21 / 35 | 4653 |
| 5 | 1 | 65.4 | 81.0 | 20 / 35 | 4116 |
| 6 | 1 | 64.1 | 73.0 | 20 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 35 | 91% |
| wee.Gem 1.8.4 | 33 | 94% |
| wompi.Quokka 1.6 | 26 | 92% |
| ratosh.Nobo 0.21 | 16 | 81% |
| m3thos.Eva00 1.1 | 14 | 100% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 14 | 16% | 26 |
| ratosh.Nobo 0.21 | 13 | 15% | 23 |
| bayen.UbaMicro 1.4 | 11 | 13% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 13% | 11 |
| bzdp.Pansy 2.1 | 10 | 11% | 42 |
| wee.Gem 1.8.4 | 9 | 10% | 41 |
| wompi.Quokka 1.6 | 9 | 10% | 32 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 10 |
| maribo.FollowFire 1 | 5 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.2 | 114 / 210 | 2.15 | 20.7% | 45566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.7% | 114 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 74 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 17 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 1 |
| ayk.WallHugger 1.0 | 4.7 | 9.6% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 91.1 | 22 / 35 | 7769 |
| 2 | 1 | 73.2 | 92.1 | 24 / 35 | 7658 |
| 3 | 1 | 70.1 | 84.1 | 19 / 35 | 6620 |
| 4 | 1 | 71.7 | 83.8 | 18 / 35 | 7820 |
| 5 | 1 | 71.0 | 84.8 | 12 / 35 | 8158 |
| 6 | 1 | 71.9 | 87.3 | 19 / 35 | 7541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 68% |
| mz.NanoGod 2.02 | 13 | 54% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 45% | 125 |
| mz.NanoGod 2.02 | 35 | 36% | 48 |
| ayk.WallHugger 1.0 | 8 | 8% | 10 |
| exauge.GateKeeper 1.1.121g | 5 | 5% | 10 |
| stelo.PianistNano 1.2 | 4 | 4% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 8 |
| stuff.Vlad 0.1 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.9 | 102 / 210 | 3.17 | 16.9% | 29769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 16.9% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 27 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.9% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.5% | 25 |
| bvh.micro.Freya 0.3 | 4.5 | 10.9% | 14 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.7% | 2 |
| conscience.Electron 1.3g | 7.0 | 7.7% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 12 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.9 | 16 / 35 | 5308 |
| 2 | 1 | 64.6 | 73.0 | 16 / 35 | 4906 |
| 3 | 1 | 68.8 | 85.7 | 19 / 35 | 5455 |
| 4 | 1 | 62.4 | 68.6 | 13 / 35 | 4671 |
| 5 | 1 | 63.2 | 71.1 | 17 / 35 | 4355 |
| 6 | 1 | 67.0 | 81.0 | 21 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 83% |
| dummy.micro.Sparrow 2.5 | 26 | 92% |
| bvh.micro.Freya 0.3 | 23 | 78% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 71% |
| ap.Frederick 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 23% | 66 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 19% | 34 |
| dummy.micro.Sparrow 2.5 | 19 | 18% | 46 |
| bvh.micro.Freya 0.3 | 13 | 12% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 11% | 13 |
| conscience.Electron 1.3g | 9 | 8% | 12 |
| dl.BetterWalls 1.0 | 8 | 7% | 12 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 4 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.1 | 145 / 210 | 2.07 | 21.1% | 42362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 21.1% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 18 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 14 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.0% | 16 |
| dsw.StaticD 1.0 | 5.5 | 8.9% | 6 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 3 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 5.9% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 4 |
| sample.Corners 1.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.3 | 20 / 35 | 7510 |
| 2 | 1 | 71.9 | 90.5 | 25 / 35 | 7048 |
| 3 | 1 | 73.4 | 93.3 | 28 / 35 | 7964 |
| 4 | 1 | 71.5 | 89.8 | 26 / 35 | 6929 |
| 5 | 1 | 69.4 | 84.4 | 22 / 35 | 6413 |
| 6 | 1 | 70.1 | 83.5 | 24 / 35 | 6498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 93% |
| supersample.SuperBoxBot 1.0 | 26 | 88% |
| dsw.StaticD 1.0 | 15 | 73% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |

Hadur died in 66 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 36% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 20% | 55 |
| dsw.StaticD 1.0 | 8 | 12% | 21 |
| sul.Lunar 1.1 | 5 | 8% | 56 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 10 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 8 |
| sample.Corners 1.0 | 3 | 5% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.9 | 93 / 210 | 3.26 | 17.0% | 36011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 17.0% | 93 |
| mld.Wisdom 1.0 | 2.8 | 12.4% | 22 |
| radnor.DoctorBob 1.42 | 3.0 | 12.7% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 11.9% | 32 |
| amz.NanoClone 1.41 | 5.3 | 10.5% | 18 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.4% | 5 |
| sample.Walls 1.0 | 7.3 | 7.9% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 2 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 70.2 | 12 / 35 | 5575 |
| 2 | 1 | 67.8 | 81.0 | 19 / 35 | 6227 |
| 3 | 1 | 63.1 | 66.7 | 14 / 35 | 5417 |
| 4 | 1 | 64.5 | 73.0 | 14 / 35 | 5603 |
| 5 | 1 | 66.0 | 75.2 | 14 / 35 | 6268 |
| 6 | 1 | 69.1 | 83.5 | 20 / 35 | 6921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 82% |
| radnor.DoctorBob 1.42 | 28 | 82% |
| mld.Wisdom 1.0 | 17 | 59% |
| amz.NanoClone 1.41 | 9 | 33% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 31% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 26 | 22% | 60 |
| radnor.DoctorBob 1.42 | 17 | 14% | 42 |
| KiraNL.Chupacabra 0.4 | 16 | 14% | 25 |
| amz.NanoClone 1.41 | 14 | 12% | 16 |
| jangs.ns51 1.0 | 5 | 4% | 8 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

