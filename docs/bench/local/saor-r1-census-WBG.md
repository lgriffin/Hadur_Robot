# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.9 | 148 / 210 | 2.09 | 21.3% | 43235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.3% | 148 |
| mz.AntiGrav 1.0 | 2.5 | 14.4% | 19 |
| radnor.DoctorBob 1.42 | 3.2 | 14.0% | 16 |
| mld.Infinity 2.2 | 3.3 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 5 |
| sample.Walls 1.0 | 6.3 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 0 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 80.3 | 23 / 35 | 6950 |
| 2 | 1 | 72.9 | 90.8 | 24 / 35 | 7475 |
| 3 | 1 | 73.8 | 94.3 | 28 / 35 | 7479 |
| 4 | 1 | 72.9 | 90.8 | 25 / 35 | 7514 |
| 5 | 1 | 71.6 | 85.7 | 26 / 35 | 6936 |
| 6 | 1 | 71.2 | 85.7 | 22 / 35 | 6881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 83 | 98% |
| mld.Infinity 2.2 | 30 | 90% |
| radnor.DoctorBob 1.42 | 21 | 95% |
| jangs.ns51 1.0 | 8 | 88% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 40% | 56 |
| mld.Infinity 2.2 | 14 | 23% | 39 |
| mz.AntiGrav 1.0 | 13 | 21% | 83 |
| amz.NanoClone 1.41 | 8 | 13% | 15 |
| jangs.ns51 1.0 | 1 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.2 | 112 / 210 | 2.70 | 18.0% | 32493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 18.0% | 112 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.2% | 65 |
| mld.DustBunny 3.8 | 3.0 | 13.6% | 13 |
| maribo.melee.BMV 0.1 | 4.0 | 10.6% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.0% | 7 |
| zyx.nano.Ant 1.1 | 6.3 | 8.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.1% | 8 |
| fullsail.SweetTea 1.1 | 8.2 | 6.2% | 0 |
| bzdp.BoxCar 2.0 | 8.7 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.3 | 16 / 35 | 4926 |
| 2 | 1 | 68.9 | 85.1 | 23 / 35 | 5490 |
| 3 | 1 | 68.5 | 86.0 | 19 / 35 | 5674 |
| 4 | 2 | 62.2 | 60.0 | 10 / 35 | 5245 |
| 5 | 1 | 71.2 | 94.3 | 27 / 35 | 6113 |
| 6 | 1 | 67.0 | 80.3 | 17 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 56 | 93% |
| oog.melee.Mercutio 1.0 | 55 | 71% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 33% | 80 |
| mld.DustBunny 3.8 | 26 | 27% | 67 |
| zyx.nano.Ant 1.1 | 12 | 12% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 9 |
| cs.Grudge 1.0 | 7 | 7% | 6 |
| maribo.melee.BMV 0.1 | 5 | 5% | 11 |
| bzdp.BoxCar 2.0 | 4 | 4% | 3 |
| fullsail.SweetTea 1.1 | 3 | 3% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 12 |

## Melee bench: F03

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 82.3 | 134 / 210 | 2.60 | 19.7% | 36811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.7% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 15.1% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.4% | 16 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.0 | 8.5% | 1 |
| fm.mammillarias 1.3 | 6.2 | 8.8% | 4 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 2 |
| sample.Fire 1.0 | 9.3 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.1 | 24 / 35 | 5575 |
| 2 | 1 | 69.2 | 78.7 | 23 / 35 | 5976 |
| 3 | 1 | 70.4 | 85.4 | 23 / 35 | 6362 |
| 4 | 1 | 70.9 | 86.3 | 22 / 35 | 6829 |
| 5 | 1 | 69.6 | 82.2 | 22 / 35 | 6139 |
| 6 | 1 | 68.2 | 76.8 | 20 / 35 | 5930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 85% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| sp.Nanos.Ember 1.1 | 15 | 93% |
| myl.nano.KomoriNinja 1.1 | 14 | 86% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 36 |
| myl.micro.Troodon 1.10 | 14 | 18% | 68 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 16 |
| fm.mammillarias 1.3 | 8 | 11% | 9 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 30 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 28 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 10 |
| sample.Fire 1.0 | 3 | 4% | 8 |
| sample.Tracker 1.0 | 3 | 4% | 4 |

## Melee bench: F04

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.1 | 146 / 210 | 2.07 | 20.9% | 40189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.9% | 146 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.9% | 19 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.2% | 12 |
| tj.zombie1n 1.0.1 | 4.5 | 9.6% | 9 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.8% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.7% | 1 |
| yk.JahMicro 1.0 | 7.2 | 8.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.6% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.2 | 23 / 35 | 6874 |
| 2 | 1 | 71.4 | 90.5 | 25 / 35 | 6795 |
| 3 | 1 | 70.8 | 86.7 | 26 / 35 | 6858 |
| 4 | 1 | 70.4 | 88.6 | 27 / 35 | 6050 |
| 5 | 1 | 70.9 | 87.6 | 23 / 35 | 6716 |
| 6 | 1 | 70.5 | 86.3 | 22 / 35 | 6896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 88% |
| stelo.SoJNanoMelee 1.1 | 45 | 84% |
| tj.zombie1n 1.0.1 | 18 | 72% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 33% | 84 |
| stelo.SoJNanoMelee 1.1 | 16 | 25% | 37 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 14% | 10 |
| tj.zombie1n 1.0.1 | 6 | 9% | 14 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 25 |
| repositorio.NanoStep 1.0 | 4 | 6% | 7 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 19 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.5 | 97 / 210 | 3.39 | 16.4% | 29040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 16.4% | 97 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 29 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.4% | 29 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.5% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.8% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.9% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.6% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.5 | 16 / 35 | 4466 |
| 2 | 1 | 62.8 | 66.3 | 14 / 35 | 4913 |
| 3 | 1 | 63.8 | 71.7 | 17 / 35 | 4743 |
| 4 | 1 | 64.0 | 75.6 | 13 / 35 | 4619 |
| 5 | 1 | 67.4 | 83.8 | 19 / 35 | 5259 |
| 6 | 1 | 64.9 | 73.0 | 18 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 86% |
| oog.melee.Corsair 1.0 | 31 | 65% |
| ahf.NanoAndrew .4 | 25 | 84% |
| EBBU.Sim2 1.02 | 16 | 81% |
| sam.Samspin 1.0 | 7 | 71% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 19 | 17% | 45 |
| ahf.NanoAndrew .4 | 18 | 16% | 37 |
| simonton.nano.MeleeSeed 1.8 | 17 | 15% | 39 |
| EBBU.Sim2 1.02 | 16 | 14% | 27 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 10 |
| sam.Samspin 1.0 | 9 | 8% | 18 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 13 |
| sample.TrackFire 1.0 | 0 | 0% | 3 |

## Melee bench: F06

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.6 | 136 / 210 | 2.39 | 19.0% | 32616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.0% | 136 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 26 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.2% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.5% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 10 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.6% | 4 |
| fm.claire 1.7 | 7.0 | 7.8% | 2 |
| sample.SpinBot 1.0 | 7.2 | 7.6% | 4 |
| pa.Improved 1.0 | 9.2 | 6.4% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.3 | 17 / 35 | 4975 |
| 2 | 1 | 69.8 | 89.5 | 26 / 35 | 5403 |
| 3 | 1 | 67.2 | 79.7 | 21 / 35 | 5378 |
| 4 | 1 | 69.6 | 85.4 | 24 / 35 | 5916 |
| 5 | 1 | 68.6 | 85.1 | 22 / 35 | 5560 |
| 6 | 1 | 70.6 | 93.7 | 26 / 35 | 5384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 89% |
| oog.melee.CapuletDroid 1.1 | 38 | 100% |
| arthord.NanoSatanMelee Beta | 16 | 88% |
| sample.SpinBot 1.0 | 12 | 92% |
| gh.nano.Grofvuil 0.2 | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| fm.claire 1.7 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 32% | 74 |
| gh.nano.Grofvuil 0.2 | 16 | 22% | 30 |
| arthord.NanoSatanMelee Beta | 9 | 12% | 18 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 14 |
| sample.SpinBot 1.0 | 6 | 8% | 10 |
| oog.melee.CapuletDroid 1.1 | 5 | 7% | 44 |
| fm.claire 1.7 | 4 | 5% | 6 |
| pa.Improved 1.0 | 2 | 3% | 8 |
| kurios.DOSexe .9b | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.7 | 116 / 210 | 2.56 | 18.7% | 34871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.7% | 116 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.7% | 44 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.6% | 19 |
| mz.MicroGodMelee 1 | 3.7 | 12.6% | 21 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.7% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.4 | 25 / 35 | 6030 |
| 2 | 1 | 67.3 | 78.1 | 19 / 35 | 5632 |
| 3 | 1 | 67.5 | 80.6 | 17 / 35 | 5660 |
| 4 | 1 | 69.7 | 86.7 | 17 / 35 | 6293 |
| 5 | 1 | 70.2 | 88.6 | 22 / 35 | 6202 |
| 6 | 1 | 65.9 | 76.8 | 16 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 90% |
| mz.MicroGodMelee 1 | 41 | 80% |
| gh.micro.Gruweltje 0.7 | 21 | 67% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| fire219.CatBot 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 29 | 31% | 52 |
| mz.MicroGodMelee 1 | 26 | 28% | 64 |
| spinnercat.micro.Tyger 0.1 | 20 | 21% | 64 |
| acogdev.alpha 0.2 | 6 | 6% | 11 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 70.9 | 111 / 210 | 3.62 | 16.6% | 31125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 16.6% | 111 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.4% | 38 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.5% | 35 |
| germ.TheMind .2 | 4.7 | 9.2% | 5 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.4% | 5 |
| awesomeness.Elite 1.0 | 6.2 | 8.4% | 6 |
| stelo.UntouchableNano 1.3 | 7.0 | 7.9% | 7 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 7.9% | 2 |
| sample.Crazy 1.0 | 9.0 | 6.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 70.5 | 15 / 35 | 4895 |
| 2 | 2 | 61.6 | 63.2 | 16 / 35 | 4415 |
| 3 | 1 | 66.2 | 72.7 | 19 / 35 | 5606 |
| 4 | 1 | 66.2 | 73.3 | 19 / 35 | 5339 |
| 5 | 1 | 64.3 | 66.0 | 20 / 35 | 5299 |
| 6 | 1 | 68.0 | 79.7 | 22 / 35 | 5571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 78% |
| germ.TheMind .2 | 9 | 78% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 43% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 33 |
| germ.TheMind .2 | 10 | 10% | 16 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 11 |
| mym.EdgeStalker 1.0 | 6 | 6% | 11 |
| awesomeness.Elite 1.0 | 6 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.9 | 142 / 210 | 2.18 | 19.6% | 30332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.6% | 142 |
| rz.HawkOnFire 0.1 | 2.3 | 13.9% | 24 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.9% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 2 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.4% | 8 |
| ratosh.Wesco 1.4 | 7.7 | 8.1% | 4 |
| stelo.PatternRobot 1.0 | 8.2 | 7.4% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 8.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.2 | 25 / 35 | 5203 |
| 2 | 1 | 69.7 | 87.3 | 24 / 35 | 4906 |
| 3 | 1 | 68.0 | 79.4 | 22 / 35 | 4786 |
| 4 | 1 | 70.6 | 90.2 | 24 / 35 | 5006 |
| 5 | 1 | 70.2 | 85.7 | 22 / 35 | 5277 |
| 6 | 1 | 70.7 | 89.8 | 25 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 89% |
| nz.jdc.nano.GridFu 1.0 | 43 | 98% |
| timmit.nano.TimDog 0.33 | 15 | 80% |
| stelo.PatternRobot 1.0 | 12 | 75% |
| maribo.IotaCT 1.1 | 11 | 73% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 29% | 64 |
| nz.jdc.nano.GridFu 1.0 | 12 | 18% | 60 |
| timmit.nano.TimDog 0.33 | 9 | 13% | 20 |
| ratosh.Wesco 1.4 | 9 | 13% | 16 |
| maribo.IotaCT 1.1 | 6 | 9% | 17 |
| stelo.PatternRobot 1.0 | 5 | 7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 12 |
| spinnercat.Omen 1.0 | 2 | 3% | 7 |

## Melee bench: F10

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.9 | 175 / 210 | 1.73 | 21.7% | 39656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.7% | 175 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.8% | 11 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 9 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 0 |
| sanja.First 0.1 | 5.7 | 8.6% | 1 |
| zyx.micro.Ant 1.1 | 6.0 | 8.8% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.7% | 6 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 99.4 | 34 / 35 | 6866 |
| 2 | 1 | 73.2 | 96.5 | 31 / 35 | 7048 |
| 3 | 1 | 70.9 | 89.8 | 28 / 35 | 6383 |
| 4 | 1 | 69.1 | 81.3 | 22 / 35 | 6362 |
| 5 | 1 | 72.6 | 93.7 | 31 / 35 | 6690 |
| 6 | 1 | 70.9 | 90.8 | 29 / 35 | 6307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 37 | 95% |
| tvv.nano.Polaris 1.2 | 33 | 97% |
| baal.nano.N 1.42 | 30 | 90% |
| amk.Punbot.Punbot 0.01 | 20 | 95% |
| sanja.First 0.1 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| zyx.micro.Ant 1.1 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 11 | 31% | 45 |
| tvv.nano.Polaris 1.2 | 6 | 17% | 47 |
| zyx.micro.Ant 1.1 | 6 | 17% | 40 |
| cvt.Firsty 1.0 | 5 | 14% | 35 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 15 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 7 |
| sanja.First 0.1 | 1 | 3% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 6 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 66.4 | 79 / 210 | 4.02 | 15.2% | 31985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.3 | 15.2% | 79 |
| kc.micro.Figment 1.0 | 1.7 | 14.2% | 50 |
| cs.Wren 1.0 | 3.5 | 12.6% | 21 |
| mz.Cork 0.1 | 4.2 | 11.4% | 19 |
| js.PinBall 1.6 | 4.3 | 11.6% | 15 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 4 |
| evd.X1 0.01 | 6.7 | 8.7% | 7 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 9 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 68.6 | 15 / 35 | 5380 |
| 2 | 1 | 63.6 | 67.6 | 13 / 35 | 5729 |
| 3 | 2 | 60.9 | 60.6 | 12 / 35 | 5149 |
| 4 | 2 | 61.1 | 63.8 | 8 / 35 | 5102 |
| 5 | 1 | 65.4 | 74.3 | 16 / 35 | 5611 |
| 6 | 1 | 62.0 | 63.5 | 15 / 35 | 5014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 72% |
| cs.Wren 1.0 | 25 | 76% |
| mz.Cork 0.1 | 17 | 71% |
| js.PinBall 1.6 | 9 | 67% |
| joe.ADinosaur 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 64 | 49% | 105 |
| cs.Wren 1.0 | 19 | 15% | 32 |
| mz.Cork 0.1 | 14 | 11% | 22 |
| joe.ADinosaur 1.0 | 8 | 6% | 11 |
| js.PinBall 1.6 | 7 | 5% | 15 |
| evd.X1 0.01 | 7 | 5% | 8 |
| jsal.Jsalbot 1.0 | 6 | 5% | 10 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.4 | 131 / 210 | 2.49 | 18.8% | 30035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.8% | 131 |
| ntc.Opposite 1.5 | 3.5 | 10.6% | 6 |
| myl.nano.Graviton 1.10 | 3.7 | 11.1% | 26 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 10.8% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 8 |
| DBall.NUKE 0.1 | 7.3 | 8.5% | 4 |
| disan.Chair 2.2.0 | 7.7 | 7.9% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.1 | 18 / 35 | 4808 |
| 2 | 1 | 69.7 | 89.5 | 26 / 35 | 5123 |
| 3 | 1 | 67.3 | 79.7 | 20 / 35 | 5209 |
| 4 | 1 | 69.6 | 87.9 | 24 / 35 | 5133 |
| 5 | 1 | 68.9 | 89.2 | 24 / 35 | 4766 |
| 6 | 1 | 66.0 | 76.2 | 19 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 45 | 80% |
| myl.nano.Graviton 1.10 | 31 | 84% |
| ntc.Opposite 1.5 | 22 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 87% |
| disan.Chair 2.2.0 | 12 | 67% |
| DBall.NUKE 0.1 | 11 | 91% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 21 | 26% | 52 |
| myl.nano.Graviton 1.10 | 16 | 20% | 37 |
| pfvicm.Sobieski 7.2.3b | 12 | 15% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 12% | 19 |
| disan.Chair 2.2.0 | 10 | 12% | 15 |
| ntc.Opposite 1.5 | 9 | 11% | 28 |
| DBall.NUKE 0.1 | 2 | 2% | 19 |
| pbg.R2D2 1.0 | 1 | 1% | 8 |
| donjezza.Muncho 1.0 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.1 | 78 / 210 | 3.51 | 15.8% | 27481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 15.8% | 78 |
| oog.melee.Capulet 1.2 | 2.7 | 13.6% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 19 |
| kawigi.micro.Shiz 1.1 | 3.3 | 12.9% | 33 |
| yagami.Tidus 0.11 | 4.7 | 11.6% | 15 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 8.2% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.4 | 14 / 35 | 4606 |
| 2 | 1 | 66.4 | 78.4 | 17 / 35 | 4822 |
| 3 | 1 | 66.0 | 76.8 | 14 / 35 | 4750 |
| 4 | 1 | 66.4 | 79.0 | 12 / 35 | 4809 |
| 5 | 2 | 60.3 | 61.3 | 9 / 35 | 4065 |
| 6 | 1 | 61.9 | 64.8 | 12 / 35 | 4429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 75% |
| oog.melee.Capulet 1.2 | 27 | 59% |
| kawigi.micro.Shiz 1.1 | 20 | 100% |
| yagami.Tidus 0.11 | 16 | 88% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 31% | 55 |
| yagami.Tidus 0.11 | 20 | 15% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 43 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 33 |
| ejb.Polaris 1.0.1 | 15 | 11% | 23 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 6 | 5% | 9 |
| kurios.DOSexe .9a | 6 | 5% | 7 |

## Melee bench: F14

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.8 | 129 / 210 | 2.73 | 17.8% | 28281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.8% | 129 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 16 |
| wompi.Quokka 1.6 | 3.2 | 11.6% | 18 |
| ratosh.Nobo 0.21 | 4.2 | 11.3% | 5 |
| wee.Gem 1.8.4 | 4.2 | 11.4% | 24 |
| m3thos.Eva00 1.1 | 5.7 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.3% | 3 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 25 / 35 | 4790 |
| 2 | 1 | 68.8 | 88.9 | 21 / 35 | 5136 |
| 3 | 1 | 66.4 | 79.7 | 20 / 35 | 4675 |
| 4 | 1 | 66.0 | 80.6 | 19 / 35 | 4607 |
| 5 | 1 | 64.9 | 74.0 | 22 / 35 | 4405 |
| 6 | 1 | 66.7 | 80.0 | 22 / 35 | 4668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 88% |
| wee.Gem 1.8.4 | 39 | 92% |
| wompi.Quokka 1.6 | 30 | 83% |
| ratosh.Nobo 0.21 | 19 | 84% |
| m3thos.Eva00 1.1 | 10 | 90% |
| stelo.MyAgileRobot 0.2 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 12 | 15% | 51 |
| wompi.Quokka 1.6 | 12 | 15% | 28 |
| ratosh.Nobo 0.21 | 11 | 14% | 30 |
| bzdp.Pansy 2.1 | 10 | 12% | 42 |
| m3thos.Eva00 1.1 | 9 | 11% | 19 |
| bayen.UbaMicro 1.4 | 8 | 10% | 13 |
| maribo.FollowFire 1 | 8 | 10% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 9 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 85.4 | 128 / 210 | 2.31 | 20.8% | 46109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.8% | 128 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 23 |
| ayk.WallHugger 1.0 | 4.2 | 10.1% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 1 |
| exauge.GateKeeper 1.1.121g | 5.7 | 8.8% | 3 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.6 | 92.1 | 28 / 35 | 8760 |
| 2 | 1 | 71.6 | 82.5 | 22 / 35 | 7595 |
| 3 | 1 | 71.3 | 83.5 | 16 / 35 | 7680 |
| 4 | 1 | 70.5 | 81.9 | 21 / 35 | 7091 |
| 5 | 1 | 70.5 | 82.2 | 18 / 35 | 7123 |
| 6 | 1 | 72.8 | 90.2 | 23 / 35 | 7860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 82% |
| mz.NanoGod 2.02 | 11 | 64% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 39% | 131 |
| mz.NanoGod 2.02 | 25 | 30% | 33 |
| ayk.WallHugger 1.0 | 10 | 12% | 17 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 10 |
| stelo.PianistNano 1.2 | 5 | 6% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.8 | 124 / 210 | 3.00 | 17.7% | 30301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.7% | 124 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.2% | 22 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 15 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 15 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 6 |
| conscience.Electron 1.3g | 7.3 | 7.3% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 7 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.5 | 19 / 35 | 5059 |
| 2 | 1 | 66.1 | 74.6 | 19 / 35 | 5205 |
| 3 | 1 | 68.6 | 83.8 | 26 / 35 | 5048 |
| 4 | 1 | 66.6 | 79.0 | 19 / 35 | 5059 |
| 5 | 1 | 66.4 | 78.4 | 21 / 35 | 4998 |
| 6 | 1 | 65.6 | 74.6 | 20 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 90% |
| dummy.micro.Sparrow 2.5 | 27 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 83% |
| bvh.micro.Freya 0.3 | 23 | 91% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 14 | 16% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 15% | 33 |
| conscience.Electron 1.3g | 13 | 15% | 16 |
| dl.BetterWalls 1.0 | 12 | 14% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 14% | 12 |
| dummy.micro.Sparrow 2.5 | 8 | 9% | 32 |
| stelo.MirrorMicro 1.0 | 8 | 9% | 14 |
| bvh.micro.Freya 0.3 | 6 | 7% | 27 |

## Melee bench: F17

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 90.4 | 161 / 210 | 1.87 | 22.0% | 43596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 22.0% | 161 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 19 |
| sul.Lunar 1.1 | 3.0 | 11.5% | 8 |
| supersample.SuperBoxBot 1.0 | 4.5 | 9.7% | 6 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 7 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 6 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 0 |
| sample.Corners 1.0 | 8.7 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 81.3 | 23 / 35 | 6909 |
| 2 | 1 | 72.6 | 91.1 | 27 / 35 | 7174 |
| 3 | 1 | 72.2 | 90.5 | 25 / 35 | 7317 |
| 4 | 1 | 72.7 | 92.7 | 28 / 35 | 7126 |
| 5 | 1 | 73.0 | 94.6 | 28 / 35 | 7359 |
| 6 | 1 | 73.4 | 92.1 | 30 / 35 | 7711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 60 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 96% |
| supersample.SuperBoxBot 1.0 | 21 | 90% |
| sample.Corners 1.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| dsw.StaticD 1.0 | 8 | 50% |
| mme.NikeEnhanced 2.0 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 13 | 27% | 18 |
| supersample.SuperBoxBot 1.0 | 9 | 18% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 16% | 61 |
| mme.NikeEnhanced 2.0 | 8 | 16% | 17 |
| sul.Lunar 1.1 | 3 | 6% | 56 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 6% | 10 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 7 |
| sample.Corners 1.0 | 2 | 4% | 11 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 78.7 | 107 / 210 | 2.91 | 18.4% | 38613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.4% | 107 |
| radnor.DoctorBob 1.42 | 3.0 | 12.4% | 28 |
| mld.Wisdom 1.0 | 3.5 | 12.2% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 27 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.2% | 9 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 8 |
| sample.Walls 1.0 | 6.7 | 8.6% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.0 | 18 / 35 | 6378 |
| 2 | 1 | 66.2 | 74.6 | 16 / 35 | 6188 |
| 3 | 1 | 70.3 | 85.7 | 22 / 35 | 7109 |
| 4 | 1 | 70.0 | 85.7 | 21 / 35 | 6924 |
| 5 | 1 | 66.5 | 73.3 | 17 / 35 | 6144 |
| 6 | 1 | 65.3 | 73.0 | 13 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 88% |
| radnor.DoctorBob 1.42 | 25 | 76% |
| sample.Walls 1.0 | 18 | 100% |
| mld.Wisdom 1.0 | 18 | 78% |
| amz.NanoClone 1.41 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 21% | 44 |
| mld.Wisdom 1.0 | 22 | 21% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 19% | 57 |
| KiraNL.Chupacabra 0.4 | 14 | 14% | 24 |
| amz.NanoClone 1.41 | 13 | 13% | 20 |
| GarmBox.Oranges 1.0 | 6 | 6% | 12 |
| jangs.ns51 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 2 | 2% | 8 |
| sample.Target 1.0 | 1 | 1% | 0 |

