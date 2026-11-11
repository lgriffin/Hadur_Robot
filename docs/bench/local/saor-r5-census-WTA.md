# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.3 | 165 / 210 | 1.97 | 21.8% | 43390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.8% | 165 |
| mz.AntiGrav 1.0 | 2.5 | 13.7% | 7 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 14 |
| mld.Infinity 2.2 | 3.8 | 12.3% | 14 |
| amz.NanoClone 1.41 | 4.7 | 11.0% | 5 |
| jangs.ns51 1.0 | 7.0 | 6.8% | 2 |
| sample.Walls 1.0 | 7.0 | 6.5% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 83.8 | 26 / 35 | 6981 |
| 2 | 1 | 71.8 | 85.4 | 27 / 35 | 7109 |
| 3 | 1 | 72.9 | 89.5 | 27 / 35 | 7453 |
| 4 | 1 | 74.1 | 94.3 | 29 / 35 | 7588 |
| 5 | 1 | 73.5 | 94.6 | 30 / 35 | 7134 |
| 6 | 1 | 72.1 | 87.9 | 26 / 35 | 7125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 75 | 99% |
| mld.Infinity 2.2 | 37 | 97% |
| radnor.DoctorBob 1.42 | 35 | 91% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 6 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 38% | 56 |
| mz.AntiGrav 1.0 | 10 | 22% | 68 |
| mld.Infinity 2.2 | 10 | 22% | 49 |
| amz.NanoClone 1.41 | 5 | 11% | 17 |
| jangs.ns51 1.0 | 1 | 2% | 6 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.6 | 125 / 210 | 2.56 | 18.3% | 31584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 18.3% | 125 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.7% | 44 |
| mld.DustBunny 3.8 | 2.5 | 13.7% | 12 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.2% | 6 |
| fullsail.SweetTea 1.1 | 7.3 | 7.7% | 9 |
| zyx.nano.Ant 1.1 | 7.5 | 7.4% | 5 |
| bzdp.BoxCar 2.0 | 7.7 | 7.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.7% | 5 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.6 | 24 / 35 | 5579 |
| 2 | 2 | 59.7 | 54.6 | 9 / 35 | 5023 |
| 3 | 1 | 68.3 | 84.8 | 23 / 35 | 5222 |
| 4 | 1 | 68.7 | 86.7 | 24 / 35 | 5338 |
| 5 | 1 | 67.3 | 81.6 | 20 / 35 | 5240 |
| 6 | 1 | 69.9 | 93.7 | 25 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 66 | 89% |
| oog.melee.Mercutio 1.0 | 46 | 72% |
| maribo.melee.BMV 0.1 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 28% | 55 |
| mld.DustBunny 3.8 | 23 | 27% | 76 |
| cs.Grudge 1.0 | 8 | 9% | 8 |
| maribo.melee.BMV 0.1 | 7 | 8% | 18 |
| bzdp.BoxCar 2.0 | 7 | 8% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 18 |
| zyx.nano.Ant 1.1 | 5 | 6% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 12 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.4 | 151 / 210 | 2.31 | 20.7% | 38594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.7% | 151 |
| myl.micro.Troodon 1.10 | 2.0 | 12.9% | 27 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.3% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.7% | 9 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.5% | 5 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.9% | 0 |
| fm.mammillarias 1.3 | 6.3 | 8.6% | 2 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 3 |
| sample.Fire 1.0 | 9.3 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.7 | 27 / 35 | 6405 |
| 2 | 1 | 71.4 | 88.6 | 27 / 35 | 6737 |
| 3 | 1 | 70.9 | 87.3 | 24 / 35 | 6497 |
| 4 | 1 | 70.4 | 84.1 | 22 / 35 | 6506 |
| 5 | 1 | 70.2 | 82.5 | 25 / 35 | 6218 |
| 6 | 1 | 70.2 | 83.5 | 26 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 40 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 94% |
| cb.nano.Insomnia 1.0 | 25 | 100% |
| sp.Nanos.Ember 1.1 | 24 | 96% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| sample.Fire 1.0 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 15 | 25% | 48 |
| myl.micro.Troodon 1.10 | 8 | 14% | 49 |
| cb.nano.Insomnia 1.0 | 8 | 14% | 12 |
| fm.mammillarias 1.3 | 8 | 14% | 11 |
| myl.nano.KomoriNinja 1.1 | 7 | 12% | 27 |
| cs.sheldor.Talon 1.1 | 5 | 8% | 15 |
| sp.Nanos.Ember 1.1 | 4 | 7% | 31 |
| sample.Fire 1.0 | 3 | 5% | 9 |
| sample.Tracker 1.0 | 1 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.5 | 148 / 210 | 2.30 | 20.3% | 38904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.3% | 148 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 13 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.4% | 20 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 4 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.2% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 2 |
| yk.JahMicro 1.0 | 7.5 | 7.8% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.7 | 24 / 35 | 6033 |
| 2 | 1 | 71.2 | 90.2 | 27 / 35 | 6295 |
| 3 | 1 | 70.6 | 86.3 | 27 / 35 | 6567 |
| 4 | 1 | 70.0 | 85.4 | 24 / 35 | 6644 |
| 5 | 1 | 70.4 | 82.5 | 24 / 35 | 7204 |
| 6 | 1 | 69.1 | 82.9 | 22 / 35 | 6161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 50 | 88% |
| kawigi.nano.Lib 1.0 | 49 | 96% |
| tvv.micro.Antares 1.1.1 | 22 | 86% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| yk.JahMicro 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 18 | 29% | 42 |
| kawigi.nano.Lib 1.0 | 15 | 24% | 70 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 9 |
| yk.JahMicro 1.0 | 5 | 8% | 9 |
| tj.zombie1n 1.0.1 | 5 | 8% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.6 | 92 / 210 | 3.82 | 15.6% | 27601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 15.6% | 92 |
| oog.melee.Corsair 1.0 | 1.8 | 13.0% | 35 |
| ahf.NanoAndrew .4 | 3.0 | 11.5% | 25 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.8% | 21 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.0% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.4% | 10 |
| sam.Samspin 1.0 | 7.3 | 8.8% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.3 | 20 / 35 | 5224 |
| 2 | 1 | 64.8 | 74.9 | 15 / 35 | 4868 |
| 3 | 2 | 58.4 | 56.5 | 14 / 35 | 3900 |
| 4 | 1 | 61.6 | 65.1 | 13 / 35 | 4312 |
| 5 | 1 | 62.7 | 67.6 | 17 / 35 | 4453 |
| 6 | 1 | 62.7 | 66.3 | 13 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 41 | 90% |
| oog.melee.Corsair 1.0 | 25 | 56% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 51 |
| oog.melee.Corsair 1.0 | 21 | 18% | 42 |
| robar.nano.Assertive_Melee 0.2 | 19 | 16% | 26 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 12 |
| EBBU.Sim2 1.02 | 12 | 10% | 16 |
| ahf.NanoAndrew .4 | 11 | 9% | 26 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 17 |
| sam.Samspin 1.0 | 5 | 4% | 12 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.9 | 137 / 210 | 2.18 | 19.5% | 33109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.5% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 36 |
| gh.nano.Grofvuil 0.2 | 3.8 | 10.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.2% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 5 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 6 |
| fm.claire 1.7 | 6.0 | 8.5% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.2% | 0 |
| pa.Improved 1.0 | 9.3 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.0 | 20 / 35 | 4990 |
| 2 | 1 | 70.5 | 91.1 | 27 / 35 | 5719 |
| 3 | 1 | 68.9 | 87.0 | 21 / 35 | 5576 |
| 4 | 1 | 68.3 | 83.8 | 18 / 35 | 5844 |
| 5 | 1 | 67.5 | 82.2 | 21 / 35 | 5234 |
| 6 | 1 | 71.8 | 96.2 | 30 / 35 | 5746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 83% |
| oog.melee.CapuletDroid 1.1 | 38 | 95% |
| arthord.NanoSatanMelee Beta | 17 | 88% |
| gh.nano.Grofvuil 0.2 | 10 | 80% |
| sample.SpinBot 1.0 | 9 | 100% |
| fm.claire 1.7 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 36% | 82 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 20 |
| oog.melee.CapuletDroid 1.1 | 9 | 12% | 50 |
| fm.claire 1.7 | 9 | 12% | 10 |
| gh.nano.Grofvuil 0.2 | 8 | 11% | 21 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 11 |
| pa.Improved 1.0 | 3 | 4% | 6 |
| sample.SpinBot 1.0 | 2 | 3% | 6 |
| kurios.DOSexe .9b | 2 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.5 | 109 / 210 | 2.48 | 18.9% | 35768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.9% | 109 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.5% | 32 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 33 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 26 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 2 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.1% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 4 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 1 |
| acogdev.alpha 0.2 | 8.7 | 5.6% | 2 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.9 | 22 / 35 | 6403 |
| 2 | 1 | 66.3 | 74.9 | 15 / 35 | 5619 |
| 3 | 1 | 69.6 | 88.3 | 21 / 35 | 5681 |
| 4 | 1 | 69.4 | 87.3 | 21 / 35 | 6036 |
| 5 | 1 | 68.8 | 83.8 | 15 / 35 | 6135 |
| 6 | 1 | 67.3 | 78.1 | 15 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 81% |
| mz.MicroGodMelee 1 | 43 | 65% |
| gh.micro.Gruweltje 0.7 | 24 | 71% |
| DBall.Anarchy 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 101 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 27 | 27% | 53 |
| spinnercat.micro.Tyger 0.1 | 26 | 26% | 63 |
| gh.micro.Gruweltje 0.7 | 26 | 26% | 53 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 9 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 9 |
| DBall.Anarchy 0.1 | 3 | 3% | 9 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 73.3 | 105 / 210 | 3.40 | 17.1% | 32360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.1% | 105 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 35 |
| germ.TheMind .2 | 4.7 | 9.2% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.3% | 3 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 6 |
| sample.Crazy 1.0 | 7.8 | 7.7% | 3 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.5% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 73.0 | 20 / 35 | 5265 |
| 2 | 1 | 66.3 | 69.5 | 16 / 35 | 6006 |
| 3 | 1 | 66.9 | 75.9 | 20 / 35 | 5459 |
| 4 | 1 | 64.0 | 69.5 | 17 / 35 | 4967 |
| 5 | 1 | 65.1 | 72.7 | 15 / 35 | 4881 |
| 6 | 1 | 67.3 | 79.4 | 17 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 65% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 4 | 50% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 46% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 22% | 42 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| germ.TheMind .2 | 7 | 7% | 12 |
| awesomeness.Elite 1.0 | 6 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 2 | 2% | 8 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.4 | 161 / 210 | 1.86 | 20.6% | 32235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.6% | 161 |
| rz.HawkOnFire 0.1 | 2.3 | 12.9% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.9% | 9 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 8 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.1% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.8 | 7.9% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 2 |
| stelo.PatternRobot 1.0 | 8.2 | 7.3% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 25 / 35 | 5237 |
| 2 | 1 | 72.3 | 94.9 | 29 / 35 | 5709 |
| 3 | 1 | 70.4 | 88.3 | 26 / 35 | 5317 |
| 4 | 1 | 71.6 | 93.0 | 27 / 35 | 5548 |
| 5 | 1 | 70.4 | 87.6 | 27 / 35 | 5238 |
| 6 | 1 | 70.9 | 90.5 | 27 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 92% |
| nz.jdc.nano.GridFu 1.0 | 46 | 98% |
| timmit.nano.TimDog 0.33 | 18 | 89% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| maribo.IotaCT 1.1 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 27% | 63 |
| stelo.PatternRobot 1.0 | 9 | 18% | 22 |
| timmit.nano.TimDog 0.33 | 7 | 14% | 26 |
| maribo.IotaCT 1.1 | 7 | 14% | 17 |
| ratosh.Wesco 1.4 | 4 | 8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 8 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 55 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.8 | 179 / 210 | 1.56 | 21.9% | 39697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.9% | 179 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 12 |
| baal.nano.N 1.42 | 3.2 | 10.9% | 4 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.8 | 8.5% | 7 |
| sanja.First 0.1 | 6.0 | 8.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.0% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.5% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.6% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 30 / 35 | 6669 |
| 2 | 1 | 71.1 | 92.1 | 28 / 35 | 6552 |
| 3 | 1 | 72.0 | 92.7 | 30 / 35 | 6609 |
| 4 | 1 | 72.1 | 94.6 | 32 / 35 | 6681 |
| 5 | 1 | 71.4 | 93.0 | 29 / 35 | 6278 |
| 6 | 1 | 72.6 | 95.9 | 30 / 35 | 6908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 95% |
| cvt.Firsty 1.0 | 33 | 97% |
| baal.nano.N 1.42 | 32 | 94% |
| sanja.First 0.1 | 20 | 95% |
| zyx.micro.Ant 1.1 | 20 | 85% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 19 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 7 | 23% | 32 |
| zyx.micro.Ant 1.1 | 7 | 23% | 30 |
| tvv.nano.Polaris 1.2 | 5 | 16% | 62 |
| cvt.Firsty 1.0 | 3 | 10% | 34 |
| Grystrion.TrackerWO 1.0 | 3 | 10% | 13 |
| amk.Punbot.Punbot 0.01 | 3 | 10% | 7 |
| sanja.First 0.1 | 2 | 6% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 11 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.9 | 87 / 210 | 3.80 | 15.8% | 31827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.5 | 15.8% | 87 |
| kc.micro.Figment 1.0 | 1.7 | 14.7% | 54 |
| cs.Wren 1.0 | 2.8 | 13.1% | 26 |
| js.PinBall 1.6 | 4.5 | 11.0% | 19 |
| mz.Cork 0.1 | 4.5 | 10.9% | 10 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 2 |
| evd.X1 0.01 | 7.0 | 8.2% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 4 |
| PSW.Relentless 0.1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 68.6 | 13 / 35 | 5682 |
| 2 | 1 | 65.5 | 74.0 | 17 / 35 | 5225 |
| 3 | 3 | 59.8 | 58.1 | 11 / 35 | 4883 |
| 4 | 1 | 63.3 | 68.3 | 15 / 35 | 5224 |
| 5 | 2 | 64.8 | 72.1 | 14 / 35 | 5358 |
| 6 | 1 | 65.0 | 72.7 | 17 / 35 | 5455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 73 | 71% |
| cs.Wren 1.0 | 20 | 80% |
| js.PinBall 1.6 | 12 | 67% |
| mz.Cork 0.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 37% | 96 |
| evd.X1 0.01 | 20 | 16% | 21 |
| cs.Wren 1.0 | 17 | 14% | 35 |
| mz.Cork 0.1 | 12 | 10% | 17 |
| js.PinBall 1.6 | 9 | 7% | 14 |
| PSW.Relentless 0.1 | 9 | 7% | 8 |
| joe.ADinosaur 1.0 | 8 | 7% | 10 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.6 | 142 / 210 | 2.39 | 19.3% | 30066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.3% | 142 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 21 |
| ntc.Opposite 1.5 | 3.2 | 10.9% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.6% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 3 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.7 | 23 / 35 | 5099 |
| 2 | 1 | 68.9 | 85.1 | 24 / 35 | 4944 |
| 3 | 1 | 69.2 | 87.9 | 25 / 35 | 4978 |
| 4 | 1 | 67.9 | 82.5 | 21 / 35 | 5104 |
| 5 | 1 | 68.3 | 84.1 | 22 / 35 | 5029 |
| 6 | 1 | 69.6 | 88.3 | 27 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 88% |
| myl.nano.Graviton 1.10 | 35 | 94% |
| ntc.Opposite 1.5 | 17 | 88% |
| disan.Chair 2.2.0 | 13 | 100% |
| DBall.NUKE 0.1 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| donjezza.Muncho 1.0 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 22% | 44 |
| pfvicm.Sobieski 7.2.3b | 13 | 19% | 22 |
| stelo.AreaTargetingBot 1.1 | 12 | 17% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 14% | 23 |
| ntc.Opposite 1.5 | 7 | 10% | 19 |
| DBall.NUKE 0.1 | 5 | 7% | 16 |
| donjezza.Muncho 1.0 | 4 | 6% | 12 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |
| disan.Chair 2.2.0 | 1 | 1% | 15 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.6 | 80 / 210 | 3.55 | 15.7% | 26661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.3 | 15.7% | 80 |
| oog.melee.Capulet 1.2 | 2.3 | 14.0% | 50 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.1% | 23 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 9 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 1 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 70.5 | 9 / 35 | 4674 |
| 2 | 1 | 64.9 | 73.3 | 15 / 35 | 4359 |
| 3 | 1 | 63.4 | 69.2 | 12 / 35 | 4385 |
| 4 | 1 | 65.6 | 75.9 | 17 / 35 | 4344 |
| 5 | 2 | 63.0 | 66.3 | 13 / 35 | 4376 |
| 6 | 1 | 65.1 | 74.6 | 14 / 35 | 4523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 59% |
| kawigi.micro.Shiz 1.1 | 23 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 75% |
| yagami.Tidus 0.11 | 18 | 100% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 35% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 38 |
| kawigi.micro.Shiz 1.1 | 17 | 13% | 31 |
| yagami.Tidus 0.11 | 14 | 11% | 33 |
| stelo.MirrorNano 1.3 | 11 | 8% | 13 |
| ejb.Polaris 1.0.1 | 8 | 6% | 16 |
| step.nanoPri 1.0 | 7 | 5% | 8 |
| kurios.DOSexe .9a | 7 | 5% | 6 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.7 | 127 / 210 | 2.92 | 17.5% | 27698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.5% | 127 |
| bzdp.Pansy 2.1 | 2.7 | 12.5% | 21 |
| wee.Gem 1.8.4 | 3.7 | 11.9% | 26 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 13 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 5.8 | 10.2% | 6 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.4% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.8 | 21 / 35 | 4790 |
| 2 | 1 | 68.2 | 84.4 | 24 / 35 | 4967 |
| 3 | 1 | 64.0 | 69.8 | 18 / 35 | 4384 |
| 4 | 1 | 68.2 | 85.7 | 21 / 35 | 4690 |
| 5 | 1 | 65.1 | 73.7 | 18 / 35 | 4504 |
| 6 | 1 | 66.5 | 80.6 | 25 / 35 | 4363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 89% |
| wee.Gem 1.8.4 | 30 | 100% |
| wompi.Quokka 1.6 | 21 | 95% |
| ratosh.Nobo 0.21 | 19 | 74% |
| m3thos.Eva00 1.1 | 14 | 93% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 67% |

Hadur died in 83 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 15 | 18% | 25 |
| ratosh.Nobo 0.21 | 12 | 14% | 26 |
| bzdp.Pansy 2.1 | 11 | 13% | 44 |
| wompi.Quokka 1.6 | 10 | 12% | 32 |
| stelo.MyAgileRobot 0.2 | 10 | 12% | 15 |
| maribo.FollowFire 1 | 8 | 10% | 7 |
| wee.Gem 1.8.4 | 7 | 8% | 40 |
| bayen.UbaMicro 1.4 | 6 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 89.2 | 132 / 210 | 1.98 | 21.6% | 46876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.6% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 20 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 3 |
| ayk.WallHugger 1.0 | 4.7 | 8.9% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.9 | 21 / 35 | 7773 |
| 2 | 1 | 72.8 | 89.8 | 21 / 35 | 7736 |
| 3 | 1 | 72.3 | 88.9 | 20 / 35 | 7701 |
| 4 | 1 | 72.4 | 85.4 | 23 / 35 | 7729 |
| 5 | 1 | 73.3 | 90.8 | 23 / 35 | 7964 |
| 6 | 1 | 73.6 | 92.1 | 24 / 35 | 7973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 109 | 80% |
| mz.NanoGod 2.02 | 19 | 58% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 6 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 33 | 42% | 49 |
| wompi.Wallaby 5.1 | 32 | 41% | 126 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 12 |
| ayk.WallHugger 1.0 | 3 | 4% | 9 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 65.0 | 88 / 210 | 4.15 | 15.2% | 27825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 15.2% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.4% | 27 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.3% | 29 |
| bvh.micro.Freya 0.3 | 4.2 | 11.4% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.4% | 8 |
| conscience.Electron 1.3g | 6.7 | 8.7% | 5 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 68.3 | 17 / 35 | 4357 |
| 2 | 2 | 57.9 | 52.4 | 5 / 35 | 4864 |
| 3 | 1 | 60.8 | 60.0 | 19 / 35 | 4119 |
| 4 | 1 | 64.1 | 70.8 | 18 / 35 | 4450 |
| 5 | 1 | 64.2 | 70.2 | 14 / 35 | 5101 |
| 6 | 1 | 64.0 | 68.6 | 15 / 35 | 4934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 88% |
| dummy.micro.Sparrow 2.5 | 20 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 82% |
| bvh.micro.Freya 0.3 | 12 | 83% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 29 | 24% | 64 |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 17% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 16% | 18 |
| dummy.micro.Sparrow 2.5 | 13 | 11% | 32 |
| dl.BetterWalls 1.0 | 13 | 11% | 17 |
| conscience.Electron 1.3g | 13 | 11% | 13 |
| bvh.micro.Freya 0.3 | 10 | 8% | 18 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 12 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.0 | 147 / 210 | 2.26 | 21.1% | 41670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.1% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.5% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 15 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.3% | 5 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.7% | 8 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 7.8 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.8% | 8 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 3 |
| sample.Corners 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.3 | 26 / 35 | 7278 |
| 2 | 1 | 70.3 | 81.6 | 22 / 35 | 6910 |
| 3 | 1 | 70.1 | 82.2 | 22 / 35 | 6727 |
| 4 | 1 | 70.3 | 82.9 | 24 / 35 | 6856 |
| 5 | 1 | 72.6 | 91.1 | 27 / 35 | 7295 |
| 6 | 1 | 70.9 | 84.8 | 26 / 35 | 6604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 40 | 93% |
| sul.Lunar 1.1 | 40 | 98% |
| supersample.SuperBoxBot 1.0 | 32 | 97% |
| dsw.StaticD 1.0 | 14 | 71% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 16 | 25% | 56 |
| supersample.SuperBoxBot 1.0 | 12 | 19% | 33 |
| dsw.StaticD 1.0 | 10 | 16% | 23 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 20 |
| tlp.ThreeLeggedPig 1 | 6 | 9% | 7 |
| sul.Lunar 1.1 | 5 | 8% | 48 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 10 |
| sample.Corners 1.0 | 3 | 5% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 6 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 82.9 | 122 / 210 | 2.54 | 19.3% | 39528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.3% | 122 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 24 |
| mld.Wisdom 1.0 | 2.8 | 11.9% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 20 |
| amz.NanoClone 1.41 | 5.3 | 9.8% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.0% | 8 |
| sample.Walls 1.0 | 7.2 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.3 | 24 / 35 | 7404 |
| 2 | 1 | 69.6 | 87.9 | 22 / 35 | 6317 |
| 3 | 1 | 69.4 | 82.5 | 23 / 35 | 6697 |
| 4 | 1 | 68.7 | 81.3 | 20 / 35 | 6670 |
| 5 | 1 | 68.5 | 81.6 | 19 / 35 | 6477 |
| 6 | 1 | 66.6 | 77.8 | 14 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 83% |
| radnor.DoctorBob 1.42 | 28 | 79% |
| mld.Wisdom 1.0 | 21 | 81% |
| amz.NanoClone 1.41 | 16 | 69% |
| jangs.ns51 1.0 | 11 | 100% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 26% | 51 |
| mld.Wisdom 1.0 | 20 | 23% | 38 |
| KiraNL.Chupacabra 0.4 | 16 | 18% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 15% | 52 |
| amz.NanoClone 1.41 | 8 | 9% | 14 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 14 |

