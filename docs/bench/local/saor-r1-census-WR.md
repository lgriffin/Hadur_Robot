# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.8 | 129 / 210 | 2.19 | 20.2% | 40152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 20.2% | 129 |
| mz.AntiGrav 1.0 | 2.2 | 15.0% | 31 |
| radnor.DoctorBob 1.42 | 3.3 | 13.9% | 16 |
| mld.Infinity 2.2 | 3.5 | 13.8% | 28 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| sample.Walls 1.0 | 6.7 | 6.3% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.7 | 23 / 35 | 6722 |
| 2 | 1 | 71.0 | 88.3 | 23 / 35 | 6469 |
| 3 | 1 | 71.9 | 89.8 | 21 / 35 | 6843 |
| 4 | 1 | 69.2 | 83.2 | 19 / 35 | 6112 |
| 5 | 1 | 71.4 | 84.4 | 21 / 35 | 7261 |
| 6 | 1 | 71.4 | 88.3 | 22 / 35 | 6745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 61 | 77% |
| mld.Infinity 2.2 | 46 | 76% |
| radnor.DoctorBob 1.42 | 43 | 93% |
| amz.NanoClone 1.41 | 5 | 40% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 27 | 33% | 90 |
| radnor.DoctorBob 1.42 | 16 | 20% | 55 |
| mld.Infinity 2.2 | 14 | 17% | 10 |
| amz.NanoClone 1.41 | 10 | 12% | 20 |
| GarmBox.Oranges 1.0 | 6 | 7% | 6 |
| sample.Walls 1.0 | 3 | 4% | 14 |
| jangs.ns51 1.0 | 3 | 4% | 10 |
| arthord.MannyPacquiao Beta | 2 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.7 | 109 / 210 | 2.38 | 18.0% | 30326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 18.0% | 109 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 57 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 34 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.3% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.4% | 4 |
| fullsail.SweetTea 1.1 | 8.0 | 6.2% | 2 |
| bzdp.BoxCar 2.0 | 8.3 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.1 | 22 / 35 | 4723 |
| 2 | 1 | 67.3 | 83.5 | 17 / 35 | 5308 |
| 3 | 1 | 69.6 | 90.5 | 24 / 35 | 5438 |
| 4 | 1 | 67.6 | 84.4 | 17 / 35 | 5137 |
| 5 | 1 | 65.4 | 82.2 | 13 / 35 | 4652 |
| 6 | 1 | 66.9 | 82.5 | 16 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 73% |
| mld.DustBunny 3.8 | 47 | 62% |
| maribo.melee.BMV 0.1 | 12 | 100% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 40 | 40% | 71 |
| oog.melee.Mercutio 1.0 | 29 | 29% | 77 |
| fullsail.SweetTea 1.1 | 8 | 8% | 10 |
| zyx.nano.Ant 1.1 | 5 | 5% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 16 |
| maribo.melee.BMV 0.1 | 4 | 4% | 11 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| cs.Grudge 1.0 | 3 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 76.8 | 80 / 210 | 3.09 | 17.7% | 34363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.3 | 17.7% | 80 |
| myl.micro.Troodon 1.10 | 1.7 | 15.7% | 72 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.1% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.2% | 27 |
| fm.mammillarias 1.3 | 5.2 | 9.4% | 3 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.3% | 15 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.3% | 5 |
| sample.Fire 1.0 | 9.2 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 68.6 | 10 / 35 | 5422 |
| 2 | 2 | 66.6 | 77.5 | 8 / 35 | 5691 |
| 3 | 1 | 69.0 | 81.6 | 18 / 35 | 6317 |
| 4 | 1 | 67.5 | 79.4 | 15 / 35 | 5759 |
| 5 | 1 | 65.8 | 75.9 | 15 / 35 | 5256 |
| 6 | 1 | 67.5 | 78.1 | 14 / 35 | 5918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 59% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 63% |
| myl.nano.KomoriNinja 1.1 | 16 | 88% |
| cb.nano.Insomnia 1.0 | 10 | 60% |
| sp.Nanos.Ember 1.1 | 7 | 57% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Fire 1.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 35% | 80 |
| stelo.SoRobotNanoMelee 1.2 | 32 | 25% | 44 |
| fm.mammillarias 1.3 | 18 | 14% | 20 |
| cb.nano.Insomnia 1.0 | 13 | 10% | 12 |
| myl.nano.KomoriNinja 1.1 | 8 | 6% | 29 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 11 |
| sample.Fire 1.0 | 4 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.4 | 96 / 210 | 2.76 | 18.8% | 38064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 18.8% | 96 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.4% | 41 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.7% | 17 |
| tj.zombie1n 1.0.1 | 5.2 | 9.3% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.3% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.1% | 1 |
| yk.JahMicro 1.0 | 6.7 | 8.5% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.5% | 9 |
| repositorio.NanoStep 1.0 | 9.2 | 6.5% | 4 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.9 | 19 / 35 | 6489 |
| 2 | 1 | 63.2 | 69.5 | 10 / 35 | 5287 |
| 3 | 1 | 69.1 | 83.8 | 18 / 35 | 6291 |
| 4 | 1 | 68.3 | 79.4 | 17 / 35 | 6399 |
| 5 | 1 | 67.9 | 78.7 | 17 / 35 | 6428 |
| 6 | 1 | 70.6 | 89.2 | 15 / 35 | 7170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 64% |
| stelo.SoJNanoMelee 1.1 | 32 | 53% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 80% |
| tj.zombie1n 1.0.1 | 10 | 70% |
| yk.JahMicro 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 4 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 45% | 92 |
| stelo.SoJNanoMelee 1.1 | 26 | 23% | 41 |
| tj.zombie1n 1.0.1 | 14 | 12% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 7% | 13 |
| yk.JahMicro 1.0 | 5 | 4% | 6 |
| tvv.micro.Antares 1.1.1 | 3 | 3% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 12 |
| repositorio.NanoStep 1.0 | 3 | 3% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.0 | 84 / 210 | 3.88 | 15.6% | 28766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 15.6% | 84 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.8% | 36 |
| ahf.NanoAndrew .4 | 4.3 | 11.0% | 20 |
| EBBU.Sim2 1.02 | 5.2 | 10.2% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.6% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.0% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.1% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 68.6 | 16 / 35 | 4811 |
| 2 | 1 | 66.4 | 79.0 | 17 / 35 | 5185 |
| 3 | 1 | 62.9 | 66.7 | 14 / 35 | 4966 |
| 4 | 1 | 59.6 | 60.3 | 12 / 35 | 4170 |
| 5 | 1 | 63.5 | 69.5 | 14 / 35 | 4780 |
| 6 | 1 | 61.6 | 63.8 | 11 / 35 | 4854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 64% |
| oog.melee.Corsair 1.0 | 28 | 86% |
| ahf.NanoAndrew .4 | 14 | 93% |
| EBBU.Sim2 1.02 | 9 | 78% |
| sam.Samspin 1.0 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 28% | 64 |
| robar.nano.Assertive_Melee 0.2 | 25 | 20% | 28 |
| EBBU.Sim2 1.02 | 12 | 9% | 18 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 14 |
| sam.Samspin 1.0 | 11 | 9% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| oog.melee.Corsair 1.0 | 8 | 6% | 27 |
| ahf.NanoAndrew .4 | 8 | 6% | 22 |
| sample.TrackFire 1.0 | 6 | 5% | 6 |

## Melee bench: F06

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.5 | 109 / 210 | 2.67 | 17.8% | 30221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.2 | 17.8% | 109 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.4% | 52 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.4% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 18 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.9% | 8 |
| fm.claire 1.7 | 6.5 | 8.4% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 2 |
| kurios.DOSexe .9b | 9.3 | 5.8% | 3 |
| pa.Improved 1.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 26 / 35 | 5687 |
| 2 | 2 | 63.8 | 71.7 | 11 / 35 | 4812 |
| 3 | 1 | 67.5 | 81.6 | 14 / 35 | 5602 |
| 4 | 1 | 67.6 | 87.6 | 22 / 35 | 4476 |
| 5 | 1 | 66.7 | 82.5 | 18 / 35 | 4681 |
| 6 | 1 | 65.6 | 77.8 | 18 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 53% |
| oog.melee.CapuletDroid 1.1 | 25 | 84% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| sample.SpinBot 1.0 | 12 | 100% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 11 | 91% |
| fm.claire 1.7 | 6 | 83% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 49% | 95 |
| oog.melee.CapuletDroid 1.1 | 14 | 14% | 19 |
| arthord.NanoSatanMelee Beta | 8 | 8% | 19 |
| sample.SpinBot 1.0 | 8 | 8% | 15 |
| gh.nano.Grofvuil 0.2 | 7 | 7% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 13 |
| fm.claire 1.7 | 5 | 5% | 6 |
| kurios.DOSexe .9b | 4 | 4% | 14 |
| pa.Improved 1.0 | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.2 | 68 / 210 | 3.14 | 16.5% | 31452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.5 | 16.5% | 68 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 15.5% | 60 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.7% | 41 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 21 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 6 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.7% | 5 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.0% | 4 |
| acogdev.alpha 0.2 | 8.5 | 6.4% | 1 |
| fire219.CatBot 1.0 | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 14 / 35 | 5414 |
| 2 | 1 | 64.9 | 73.3 | 10 / 35 | 5423 |
| 3 | 2 | 63.0 | 71.4 | 10 / 35 | 4604 |
| 4 | 1 | 66.0 | 76.5 | 12 / 35 | 5550 |
| 5 | 1 | 67.3 | 82.5 | 15 / 35 | 5190 |
| 6 | 3 | 62.6 | 67.0 | 7 / 35 | 5271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 37% |
| mz.MicroGodMelee 1 | 41 | 83% |
| gh.micro.Gruweltje 0.7 | 23 | 26% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| el.JumpShoot 0.2 | 2 | 0% |
| fire219.CatBot 1.0 | 1 | 0% |

Hadur died in 142 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 41% | 78 |
| gh.micro.Gruweltje 0.7 | 28 | 20% | 38 |
| mz.MicroGodMelee 1 | 15 | 11% | 37 |
| acogdev.alpha 0.2 | 14 | 10% | 15 |
| fire219.CatBot 1.0 | 8 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 9 |
| DBall.Anarchy 0.1 | 4 | 3% | 13 |
| el.JumpShoot 0.2 | 4 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 4 |

## Melee bench: F08

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.1 | 75 / 210 | 3.87 | 15.4% | 29590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.3 | 15.4% | 75 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.5% | 56 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 35 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 12 |
| germ.TheMind .2 | 5.0 | 10.2% | 11 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.5% | 4 |
| awesomeness.Elite 1.0 | 7.0 | 8.4% | 10 |
| sample.Crazy 1.0 | 8.5 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.4 | 17 / 35 | 5167 |
| 2 | 3 | 57.9 | 54.0 | 8 / 35 | 4413 |
| 3 | 1 | 62.3 | 69.5 | 11 / 35 | 4709 |
| 4 | 1 | 63.7 | 69.5 | 12 / 35 | 5092 |
| 5 | 1 | 62.6 | 66.7 | 12 / 35 | 5066 |
| 6 | 1 | 65.9 | 76.8 | 15 / 35 | 5143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 56% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| qualidafial.MajorDick 1.0.1 | 7 | 71% |
| germ.TheMind .2 | 7 | 71% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| sample.Crazy 1.0 | 6 | 83% |
| awesomeness.Elite 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 42% | 86 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 16% | 42 |
| germ.TheMind .2 | 20 | 15% | 25 |
| stelo.UntouchableNano 1.3 | 13 | 10% | 18 |
| qualidafial.MajorDick 1.0.1 | 8 | 6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 10 |
| sample.Crazy 1.0 | 3 | 2% | 10 |
| awesomeness.Elite 1.0 | 3 | 2% | 5 |
| mym.EdgeStalker 1.0 | 3 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.0 | 105 / 210 | 2.53 | 18.1% | 28600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 18.1% | 105 |
| rz.HawkOnFire 0.1 | 2.0 | 15.1% | 50 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.6% | 16 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.3% | 9 |
| maribo.IotaCT 1.1 | 5.2 | 10.2% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 1 |
| stelo.PatternRobot 1.0 | 7.5 | 8.2% | 10 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 16 / 35 | 4827 |
| 2 | 1 | 67.7 | 81.3 | 16 / 35 | 4676 |
| 3 | 1 | 70.5 | 91.1 | 24 / 35 | 4994 |
| 4 | 1 | 68.9 | 84.8 | 22 / 35 | 4712 |
| 5 | 1 | 65.8 | 78.1 | 13 / 35 | 4491 |
| 6 | 1 | 67.5 | 81.9 | 14 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 67% |
| nz.jdc.nano.GridFu 1.0 | 31 | 87% |
| timmit.nano.TimDog 0.33 | 12 | 92% |
| stelo.PatternRobot 1.0 | 10 | 40% |
| ratosh.Wesco 1.4 | 9 | 67% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| maribo.IotaCT 1.1 | 4 | 50% |

Hadur died in 106 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 37 | 35% | 77 |
| stelo.PatternRobot 1.0 | 20 | 19% | 24 |
| ratosh.Wesco 1.4 | 14 | 13% | 22 |
| timmit.nano.TimDog 0.33 | 11 | 10% | 21 |
| nz.jdc.nano.GridFu 1.0 | 9 | 8% | 38 |
| maribo.IotaCT 1.1 | 7 | 7% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 7% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.5 | 135 / 210 | 2.40 | 19.3% | 35304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 19.3% | 135 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.7% | 26 |
| baal.nano.N 1.42 | 3.2 | 11.1% | 5 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 4 |
| zyx.micro.Ant 1.1 | 5.3 | 9.5% | 13 |
| sanja.First 0.1 | 6.0 | 9.1% | 7 |
| cvt.Firsty 1.0 | 6.7 | 8.2% | 19 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.7 | 7.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.9 | 24 / 35 | 6151 |
| 2 | 1 | 68.5 | 85.1 | 23 / 35 | 5684 |
| 3 | 1 | 67.6 | 81.9 | 21 / 35 | 5544 |
| 4 | 1 | 69.4 | 87.9 | 24 / 35 | 6050 |
| 5 | 1 | 67.2 | 78.1 | 19 / 35 | 5922 |
| 6 | 1 | 69.3 | 86.0 | 24 / 35 | 5953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 34 | 65% |
| tvv.nano.Polaris 1.2 | 31 | 84% |
| baal.nano.N 1.42 | 31 | 94% |
| sanja.First 0.1 | 21 | 86% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| zyx.micro.Ant 1.1 | 9 | 78% |
| squidM.TentalceMeleeNano 1.1 | 6 | 83% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 24 | 31% | 41 |
| cvt.Firsty 1.0 | 16 | 21% | 44 |
| baal.nano.N 1.42 | 8 | 10% | 28 |
| Grystrion.TrackerWO 1.0 | 8 | 10% | 18 |
| sanja.First 0.1 | 6 | 8% | 31 |
| tvv.nano.Polaris 1.2 | 6 | 8% | 31 |
| sample.RamFire 1.0 | 4 | 5% | 8 |
| amk.Punbot.Punbot 0.01 | 3 | 4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 63.3 | 57 / 210 | 4.30 | 14.1% | 28207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.8 | 14.2% | 71 |
| cs.Wren 1.0 | 2.0 | 13.8% | 36 |
| hadur117.micro.SaorWR 0.1 | 2.3 | 14.1% | 57 |
| js.PinBall 1.6 | 4.0 | 12.0% | 21 |
| mz.Cork 0.1 | 4.8 | 11.2% | 12 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 2 |
| evd.X1 0.01 | 6.7 | 8.9% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 68.3 | 12 / 35 | 4869 |
| 2 | 4 | 58.8 | 58.4 | 6 / 35 | 4528 |
| 3 | 1 | 63.4 | 69.5 | 14 / 35 | 5081 |
| 4 | 2 | 61.9 | 66.0 | 9 / 35 | 5095 |
| 5 | 3 | 58.2 | 59.4 | 7 / 35 | 4141 |
| 6 | 3 | 59.1 | 58.4 | 9 / 35 | 4493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 51% |
| cs.Wren 1.0 | 20 | 60% |
| js.PinBall 1.6 | 9 | 78% |
| mz.Cork 0.1 | 9 | 89% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 154 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 37% | 83 |
| cs.Wren 1.0 | 29 | 19% | 38 |
| evd.X1 0.01 | 21 | 14% | 23 |
| joe.ADinosaur 1.0 | 15 | 10% | 18 |
| js.PinBall 1.6 | 13 | 8% | 20 |
| PSW.Relentless 0.1 | 9 | 6% | 9 |
| mz.Cork 0.1 | 4 | 3% | 8 |
| donjezza.Jezza 1.0 | 4 | 3% | 7 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.9 | 101 / 210 | 2.54 | 18.1% | 29205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 18.1% | 101 |
| ntc.Opposite 1.5 | 2.7 | 11.5% | 14 |
| myl.nano.Graviton 1.10 | 3.2 | 11.9% | 33 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.7% | 5 |
| DBall.NUKE 0.1 | 7.5 | 8.3% | 5 |
| disan.Chair 2.2.0 | 7.5 | 7.8% | 6 |
| donjezza.Muncho 1.0 | 8.7 | 6.7% | 13 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 20 / 35 | 4878 |
| 2 | 1 | 66.2 | 81.3 | 15 / 35 | 4764 |
| 3 | 1 | 64.3 | 74.0 | 14 / 35 | 4500 |
| 4 | 1 | 66.8 | 81.6 | 15 / 35 | 4996 |
| 5 | 1 | 68.9 | 89.5 | 21 / 35 | 4790 |
| 6 | 1 | 69.0 | 90.2 | 16 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 54% |
| stelo.AreaTargetingBot 1.1 | 32 | 56% |
| ntc.Opposite 1.5 | 19 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| DBall.NUKE 0.1 | 15 | 93% |
| donjezza.Muncho 1.0 | 14 | 57% |
| disan.Chair 2.2.0 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 26% | 50 |
| stelo.AreaTargetingBot 1.1 | 23 | 21% | 33 |
| ntc.Opposite 1.5 | 17 | 15% | 29 |
| donjezza.Muncho 1.0 | 11 | 10% | 21 |
| pfvicm.Sobieski 7.2.3b | 9 | 8% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 7% | 20 |
| DBall.NUKE 0.1 | 5 | 4% | 24 |
| disan.Chair 2.2.0 | 5 | 4% | 11 |
| pbg.R2D2 1.0 | 5 | 4% | 7 |

## Melee bench: F13

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 66.8 | 52 / 210 | 3.99 | 14.3% | 25275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.7 | 14.3% | 52 |
| kawigi.micro.Shiz 1.1 | 1.8 | 14.4% | 52 |
| oog.melee.Capulet 1.2 | 3.3 | 13.4% | 50 |
| yagami.Tidus 0.11 | 4.0 | 12.5% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 33 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 66.7 | 8 / 35 | 4361 |
| 2 | 1 | 61.7 | 63.8 | 11 / 35 | 4213 |
| 3 | 2 | 61.5 | 67.3 | 6 / 35 | 4099 |
| 4 | 2 | 63.0 | 69.5 | 10 / 35 | 4293 |
| 5 | 2 | 62.3 | 69.8 | 8 / 35 | 4106 |
| 6 | 1 | 61.5 | 63.5 | 9 / 35 | 4203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 24 | 46% |
| oog.melee.Capulet 1.2 | 22 | 45% |
| yagami.Tidus 0.11 | 17 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 71% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 39 | 25% | 54 |
| oog.melee.Capulet 1.2 | 39 | 25% | 51 |
| kawigi.micro.Shiz 1.1 | 35 | 22% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 9% | 26 |
| step.nanoPri 1.0 | 10 | 6% | 11 |
| stelo.MirrorNano 1.3 | 10 | 6% | 10 |
| ejb.Polaris 1.0.1 | 6 | 4% | 8 |
| kurios.DOSexe .9a | 6 | 4% | 7 |

## Melee bench: F14

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.8 | 105 / 210 | 2.91 | 16.9% | 26474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 16.9% | 105 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 28 |
| wee.Gem 1.8.4 | 3.3 | 11.7% | 26 |
| wompi.Quokka 1.6 | 3.3 | 11.9% | 21 |
| ratosh.Nobo 0.21 | 4.3 | 11.4% | 14 |
| m3thos.Eva00 1.1 | 6.2 | 9.2% | 10 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 24 / 35 | 4911 |
| 2 | 1 | 67.9 | 87.9 | 22 / 35 | 4681 |
| 3 | 1 | 67.0 | 84.1 | 18 / 35 | 4719 |
| 4 | 1 | 63.9 | 76.5 | 13 / 35 | 4012 |
| 5 | 1 | 62.8 | 71.1 | 13 / 35 | 4171 |
| 6 | 1 | 61.9 | 68.3 | 15 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 80% |
| wee.Gem 1.8.4 | 32 | 78% |
| wompi.Quokka 1.6 | 24 | 63% |
| m3thos.Eva00 1.1 | 9 | 67% |
| ratosh.Nobo 0.21 | 8 | 75% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 18 | 17% | 43 |
| bzdp.Pansy 2.1 | 17 | 16% | 58 |
| m3thos.Eva00 1.1 | 16 | 15% | 22 |
| ratosh.Nobo 0.21 | 13 | 12% | 20 |
| stelo.MyAgileRobot 0.2 | 11 | 10% | 12 |
| wompi.Quokka 1.6 | 10 | 9% | 20 |
| bayen.UbaMicro 1.4 | 9 | 8% | 15 |
| maribo.FollowFire 1 | 9 | 8% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 5% | 9 |

## Melee bench: F15

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.6 | 100 / 210 | 2.30 | 20.1% | 44309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.2 | 20.1% | 100 |
| wompi.Wallaby 5.1 | 1.8 | 19.0% | 87 |
| mz.NanoGod 2.02 | 3.0 | 13.4% | 16 |
| ayk.WallHugger 1.0 | 4.5 | 10.0% | 1 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.0% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.9% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.7 | 19 / 35 | 7266 |
| 2 | 1 | 70.2 | 82.2 | 16 / 35 | 7082 |
| 3 | 1 | 72.4 | 90.5 | 18 / 35 | 7914 |
| 4 | 2 | 70.2 | 82.2 | 15 / 35 | 7038 |
| 5 | 1 | 71.6 | 85.7 | 17 / 35 | 7629 |
| 6 | 1 | 71.3 | 87.3 | 15 / 35 | 7380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 59% |
| mz.NanoGod 2.02 | 14 | 71% |
| exauge.GateKeeper 1.1.121g | 8 | 75% |
| ayk.WallHugger 1.0 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 72 | 64% | 145 |
| mz.NanoGod 2.02 | 15 | 13% | 23 |
| exauge.GateKeeper 1.1.121g | 10 | 9% | 13 |
| ayk.WallHugger 1.0 | 9 | 8% | 17 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 72.1 | 85 / 210 | 3.51 | 16.1% | 28318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.2 | 16.1% | 85 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 39 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.4% | 22 |
| conscience.Electron 1.3g | 6.3 | 8.8% | 3 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.8% | 13 |
| dl.BetterWalls 1.0 | 9.0 | 6.3% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.5 | 56.8 | 4 / 35 | 4215 |
| 2 | 1 | 65.4 | 76.5 | 18 / 35 | 4629 |
| 3 | 1 | 66.4 | 76.8 | 17 / 35 | 5374 |
| 4 | 1 | 63.0 | 70.2 | 11 / 35 | 4627 |
| 5 | 1 | 64.8 | 73.3 | 15 / 35 | 4999 |
| 6 | 1 | 66.0 | 79.0 | 20 / 35 | 4474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 56% |
| dummy.micro.Sparrow 2.5 | 33 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 62% |
| stelo.MirrorMicro 1.0 | 11 | 82% |
| bvh.micro.Freya 0.3 | 10 | 80% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 30% | 62 |
| dummy.micro.Sparrow 2.5 | 20 | 16% | 43 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 14% | 16 |
| conscience.Electron 1.3g | 17 | 13% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 12% | 26 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 15 |
| dl.BetterWalls 1.0 | 6 | 5% | 13 |
| bvh.micro.Freya 0.3 | 5 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.5 | 112 / 210 | 2.57 | 19.3% | 37945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 19.3% | 112 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 32 |
| sul.Lunar 1.1 | 3.7 | 11.1% | 12 |
| supersample.SuperBoxBot 1.0 | 3.8 | 12.0% | 30 |
| mme.NikeEnhanced 2.0 | 4.5 | 9.7% | 11 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 1 |
| tlp.ThreeLeggedPig 1 | 7.7 | 6.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.3% | 2 |
| sample.Corners 1.0 | 8.8 | 5.7% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.1 | 19 / 35 | 6415 |
| 2 | 1 | 68.4 | 80.6 | 19 / 35 | 6151 |
| 3 | 1 | 69.4 | 79.7 | 20 / 35 | 6536 |
| 4 | 1 | 69.4 | 83.5 | 21 / 35 | 6447 |
| 5 | 1 | 68.5 | 80.3 | 16 / 35 | 6431 |
| 6 | 1 | 68.9 | 86.0 | 17 / 35 | 5965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 62 | 74% |
| sul.Lunar 1.1 | 29 | 97% |
| supersample.SuperBoxBot 1.0 | 23 | 39% |
| dsw.StaticD 1.0 | 12 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 67% |
| sample.Corners 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| sample.MyFirstRobot 1.0 | 3 | 33% |

Hadur died in 99 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 45 | 45% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 24% | 70 |
| sample.MyFirstRobot 1.0 | 7 | 7% | 9 |
| mme.NikeEnhanced 2.0 | 6 | 6% | 12 |
| sample.Corners 1.0 | 6 | 6% | 9 |
| sul.Lunar 1.1 | 4 | 4% | 33 |
| dsw.StaticD 1.0 | 4 | 4% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.6 | 87 / 210 | 3.29 | 16.7% | 34192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWR 0.1 | 1.0 | 16.7% | 87 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 34 |
| mld.Wisdom 1.0 | 2.8 | 12.6% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.6% | 29 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.9% | 12 |
| amz.NanoClone 1.41 | 5.8 | 9.9% | 12 |
| sample.Walls 1.0 | 7.2 | 8.2% | 11 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.9 | 16 / 35 | 5762 |
| 2 | 1 | 66.4 | 76.5 | 16 / 35 | 6028 |
| 3 | 1 | 64.9 | 75.2 | 13 / 35 | 5550 |
| 4 | 1 | 63.5 | 68.3 | 14 / 35 | 5541 |
| 5 | 1 | 64.5 | 71.1 | 14 / 35 | 5603 |
| 6 | 1 | 66.2 | 80.3 | 14 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 30 | 77% |
| radnor.DoctorBob 1.42 | 27 | 85% |
| mld.Wisdom 1.0 | 21 | 67% |
| KiraNL.Chupacabra 0.4 | 12 | 58% |
| amz.NanoClone 1.41 | 9 | 89% |
| sample.Walls 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 28% | 52 |
| KiraNL.Chupacabra 0.4 | 26 | 21% | 33 |
| radnor.DoctorBob 1.42 | 22 | 18% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 16% | 45 |
| amz.NanoClone 1.41 | 9 | 7% | 14 |
| jangs.ns51 1.0 | 5 | 4% | 7 |
| sample.Walls 1.0 | 4 | 3% | 13 |
| GarmBox.Oranges 1.0 | 4 | 3% | 5 |

