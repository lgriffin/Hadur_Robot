# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.3 | 137 / 210 | 2.32 | 21.0% | 43973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.0% | 137 |
| radnor.DoctorBob 1.42 | 2.3 | 14.4% | 25 |
| mz.AntiGrav 1.0 | 3.0 | 13.7% | 20 |
| mld.Infinity 2.2 | 3.7 | 13.2% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 8 |
| sample.Walls 1.0 | 6.2 | 6.8% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 91.1 | 25 / 35 | 7816 |
| 2 | 1 | 69.5 | 79.7 | 22 / 35 | 6473 |
| 3 | 1 | 74.0 | 91.7 | 28 / 35 | 8067 |
| 4 | 1 | 71.4 | 87.0 | 21 / 35 | 7073 |
| 5 | 1 | 73.0 | 90.2 | 25 / 35 | 7417 |
| 6 | 1 | 68.8 | 72.4 | 16 / 35 | 7127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 61 | 87% |
| radnor.DoctorBob 1.42 | 39 | 82% |
| mld.Infinity 2.2 | 35 | 94% |
| amz.NanoClone 1.41 | 16 | 69% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 32% | 70 |
| mz.AntiGrav 1.0 | 20 | 27% | 63 |
| mld.Infinity 2.2 | 13 | 18% | 43 |
| amz.NanoClone 1.41 | 10 | 14% | 19 |
| jangs.ns51 1.0 | 2 | 3% | 6 |
| sample.Walls 1.0 | 2 | 3% | 2 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.7 | 114 / 210 | 2.82 | 17.9% | 32494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 17.9% | 114 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 44 |
| mld.DustBunny 3.8 | 2.5 | 14.1% | 20 |
| maribo.melee.BMV 0.1 | 4.2 | 10.8% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.2% | 14 |
| zyx.nano.Ant 1.1 | 7.2 | 7.7% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.5% | 1 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.2 | 20 / 35 | 5222 |
| 2 | 1 | 66.6 | 77.1 | 18 / 35 | 5281 |
| 3 | 1 | 71.2 | 94.6 | 25 / 35 | 6040 |
| 4 | 2 | 60.3 | 55.9 | 9 / 35 | 5249 |
| 5 | 1 | 68.1 | 83.8 | 21 / 35 | 5513 |
| 6 | 1 | 68.5 | 84.8 | 21 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 62 | 90% |
| oog.melee.Mercutio 1.0 | 48 | 77% |
| maribo.melee.BMV 0.1 | 8 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 28% | 61 |
| mld.DustBunny 3.8 | 24 | 25% | 77 |
| cs.Grudge 1.0 | 12 | 13% | 15 |
| maribo.melee.BMV 0.1 | 11 | 11% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 9% | 17 |
| zyx.nano.Ant 1.1 | 6 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 78.6 | 112 / 210 | 2.92 | 19.0% | 36756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.0% | 112 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.4% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.2% | 20 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 8 |
| fm.mammillarias 1.3 | 5.5 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 3 |
| sample.Fire 1.0 | 9.3 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 77.1 | 18 / 35 | 6163 |
| 2 | 1 | 71.3 | 89.8 | 23 / 35 | 6463 |
| 3 | 1 | 66.5 | 71.4 | 13 / 35 | 5775 |
| 4 | 1 | 69.4 | 81.6 | 21 / 35 | 6196 |
| 5 | 1 | 69.8 | 79.0 | 21 / 35 | 6750 |
| 6 | 1 | 66.2 | 72.7 | 16 / 35 | 5409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 84% |
| myl.nano.KomoriNinja 1.1 | 18 | 100% |
| cb.nano.Insomnia 1.0 | 14 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 26% | 69 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 20% | 29 |
| fm.mammillarias 1.3 | 16 | 16% | 23 |
| myl.nano.KomoriNinja 1.1 | 11 | 11% | 36 |
| cb.nano.Insomnia 1.0 | 10 | 10% | 16 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 15 |
| sample.Tracker 1.0 | 4 | 4% | 5 |
| sample.Fire 1.0 | 2 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.8 | 152 / 210 | 2.19 | 20.9% | 40130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.9% | 152 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.2% | 15 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.5% | 15 |
| tj.zombie1n 1.0.1 | 4.8 | 9.0% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.7% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 5 |
| yk.JahMicro 1.0 | 7.5 | 7.8% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.0 | 22 / 35 | 6667 |
| 2 | 1 | 70.7 | 86.3 | 24 / 35 | 6667 |
| 3 | 1 | 71.0 | 86.7 | 25 / 35 | 6698 |
| 4 | 1 | 70.6 | 86.3 | 26 / 35 | 6709 |
| 5 | 1 | 70.1 | 80.3 | 27 / 35 | 6614 |
| 6 | 1 | 72.2 | 94.3 | 28 / 35 | 6775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 89% |
| stelo.SoJNanoMelee 1.1 | 38 | 84% |
| tvv.micro.Antares 1.1.1 | 21 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| tj.zombie1n 1.0.1 | 15 | 93% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 38% | 87 |
| stelo.SoJNanoMelee 1.1 | 12 | 21% | 32 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 25 |
| yk.JahMicro 1.0 | 3 | 5% | 9 |
| tj.zombie1n 1.0.1 | 3 | 5% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 69.6 | 85 / 210 | 3.74 | 16.4% | 31566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.4% | 85 |
| oog.melee.Corsair 1.0 | 2.3 | 13.1% | 35 |
| ahf.NanoAndrew .4 | 2.8 | 12.4% | 38 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 23 |
| sam.Samspin 1.0 | 5.5 | 9.6% | 15 |
| EBBU.Sim2 1.02 | 5.5 | 9.4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.7% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.1 | 15 / 35 | 4881 |
| 2 | 1 | 61.6 | 62.5 | 9 / 35 | 4870 |
| 3 | 1 | 69.3 | 81.6 | 22 / 35 | 6073 |
| 4 | 1 | 63.6 | 67.9 | 12 / 35 | 5147 |
| 5 | 1 | 61.6 | 63.5 | 11 / 35 | 4817 |
| 6 | 1 | 66.9 | 76.8 | 16 / 35 | 5778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 39 | 62% |
| ahf.NanoAndrew .4 | 29 | 66% |
| simonton.nano.MeleeSeed 1.8 | 20 | 80% |
| EBBU.Sim2 1.02 | 11 | 91% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 22% | 53 |
| simonton.nano.MeleeSeed 1.8 | 26 | 21% | 41 |
| ahf.NanoAndrew .4 | 20 | 16% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 13 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 18 |
| sam.Samspin 1.0 | 10 | 8% | 17 |
| EBBU.Sim2 1.02 | 7 | 6% | 16 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 10 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.0 | 119 / 210 | 2.35 | 18.7% | 31477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.7% | 119 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.5% | 48 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.0% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.0% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.2% | 8 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 2 |
| fm.claire 1.7 | 6.5 | 8.4% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 2 |
| pa.Improved 1.0 | 9.0 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 77.1 | 19 / 35 | 4533 |
| 2 | 1 | 69.3 | 87.0 | 18 / 35 | 5789 |
| 3 | 1 | 67.0 | 80.6 | 15 / 35 | 5146 |
| 4 | 1 | 69.1 | 88.6 | 21 / 35 | 5410 |
| 5 | 1 | 68.4 | 85.7 | 21 / 35 | 5242 |
| 6 | 1 | 69.9 | 90.8 | 25 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 76% |
| oog.melee.CapuletDroid 1.1 | 31 | 94% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| gh.nano.Grofvuil 0.2 | 11 | 73% |
| winamp32.micro.MicroMacro 1.0 | 11 | 55% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 38% | 90 |
| oog.melee.CapuletDroid 1.1 | 12 | 13% | 40 |
| arthord.NanoSatanMelee Beta | 12 | 13% | 21 |
| gh.nano.Grofvuil 0.2 | 11 | 12% | 23 |
| winamp32.micro.MicroMacro 1.0 | 10 | 11% | 17 |
| fm.claire 1.7 | 5 | 5% | 7 |
| kurios.DOSexe .9b | 4 | 4% | 4 |
| sample.SpinBot 1.0 | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.2 | 98 / 210 | 2.69 | 18.2% | 34793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.2% | 98 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.5% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.8% | 34 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 29 |
| DBall.Anarchy 0.1 | 5.0 | 8.3% | 2 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.4% | 3 |
| el.JumpShoot 0.2 | 7.2 | 6.8% | 3 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.1% | 1 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.3 | 15 / 35 | 5412 |
| 2 | 1 | 70.5 | 90.5 | 21 / 35 | 6182 |
| 3 | 1 | 67.7 | 80.0 | 15 / 35 | 5824 |
| 4 | 1 | 66.2 | 74.3 | 14 / 35 | 5641 |
| 5 | 1 | 68.9 | 84.8 | 17 / 35 | 6315 |
| 6 | 1 | 66.4 | 77.5 | 16 / 35 | 5419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 82% |
| gh.micro.Gruweltje 0.7 | 44 | 61% |
| mz.MicroGodMelee 1 | 36 | 67% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 28% | 55 |
| spinnercat.micro.Tyger 0.1 | 27 | 24% | 64 |
| gh.micro.Gruweltje 0.7 | 26 | 23% | 54 |
| acogdev.alpha 0.2 | 9 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 71.4 | 114 / 210 | 3.57 | 16.9% | 31588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.9% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.4% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 29 |
| germ.TheMind .2 | 5.3 | 9.6% | 7 |
| awesomeness.Elite 1.0 | 5.3 | 9.3% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 9.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 9.0% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 3 |
| sample.Crazy 1.0 | 9.0 | 6.5% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 69.2 | 18 / 35 | 5021 |
| 2 | 1 | 65.0 | 68.6 | 17 / 35 | 5209 |
| 3 | 1 | 66.8 | 74.9 | 20 / 35 | 5342 |
| 4 | 1 | 62.9 | 62.5 | 15 / 35 | 5041 |
| 5 | 1 | 66.3 | 73.7 | 21 / 35 | 5338 |
| 6 | 1 | 67.7 | 79.7 | 23 / 35 | 5637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 95% |
| germ.TheMind .2 | 9 | 78% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |

Hadur died in 96 of 210 rounds, at a mean tick of 368. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 50% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 15% | 41 |
| germ.TheMind .2 | 7 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 9 |
| awesomeness.Elite 1.0 | 6 | 6% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 13 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 10 |
| mym.EdgeStalker 1.0 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.7 | 163 / 210 | 1.75 | 21.1% | 33509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.1% | 163 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.7% | 11 |
| maribo.IotaCT 1.1 | 4.5 | 9.8% | 3 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 8.4% | 1 |
| stelo.PatternRobot 1.0 | 7.5 | 7.9% | 7 |
| spinnercat.Omen 1.0 | 8.7 | 7.1% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 26 / 35 | 5200 |
| 2 | 1 | 71.4 | 91.4 | 28 / 35 | 5442 |
| 3 | 1 | 72.1 | 91.1 | 28 / 35 | 5511 |
| 4 | 1 | 72.5 | 95.2 | 28 / 35 | 6147 |
| 5 | 1 | 72.1 | 92.7 | 26 / 35 | 5939 |
| 6 | 1 | 70.9 | 89.5 | 27 / 35 | 5270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 91% |
| nz.jdc.nano.GridFu 1.0 | 44 | 100% |
| stelo.PatternRobot 1.0 | 16 | 75% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| maribo.IotaCT 1.1 | 8 | 88% |
| ratosh.Wesco 1.4 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 38% | 71 |
| stelo.PatternRobot 1.0 | 9 | 19% | 20 |
| timmit.nano.TimDog 0.33 | 7 | 15% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 11% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4 | 9% | 50 |
| maribo.IotaCT 1.1 | 2 | 4% | 17 |
| ratosh.Wesco 1.4 | 2 | 4% | 13 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.1 | 162 / 210 | 1.80 | 21.7% | 40983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.7% | 162 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.2% | 16 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 11 |
| sanja.First 0.1 | 5.2 | 8.9% | 6 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 7 |
| Grystrion.TrackerWO 1.0 | 5.3 | 9.1% | 1 |
| cvt.Firsty 1.0 | 6.8 | 8.2% | 6 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.0 | 28 / 35 | 6571 |
| 2 | 1 | 72.8 | 93.3 | 28 / 35 | 7238 |
| 3 | 1 | 73.0 | 93.3 | 29 / 35 | 7315 |
| 4 | 1 | 71.2 | 88.6 | 23 / 35 | 6823 |
| 5 | 1 | 72.8 | 93.3 | 30 / 35 | 7266 |
| 6 | 1 | 69.0 | 84.8 | 24 / 35 | 5770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 86% |
| tvv.nano.Polaris 1.2 | 35 | 94% |
| sanja.First 0.1 | 32 | 97% |
| cvt.Firsty 1.0 | 29 | 93% |
| zyx.micro.Ant 1.1 | 15 | 73% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 13 | 27% | 50 |
| zyx.micro.Ant 1.1 | 13 | 27% | 33 |
| cvt.Firsty 1.0 | 6 | 13% | 28 |
| tvv.nano.Polaris 1.2 | 4 | 8% | 47 |
| sample.RamFire 1.0 | 4 | 8% | 5 |
| sanja.First 0.1 | 3 | 6% | 26 |
| Grystrion.TrackerWO 1.0 | 3 | 6% | 11 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.2 | 78 / 210 | 4.04 | 15.0% | 30226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.8% | 56 |
| hadur117.micro.SaorWGR 0.1 | 1.5 | 15.0% | 78 |
| cs.Wren 1.0 | 3.2 | 12.5% | 23 |
| mz.Cork 0.1 | 4.2 | 11.4% | 19 |
| js.PinBall 1.6 | 4.7 | 11.0% | 17 |
| joe.ADinosaur 1.0 | 6.3 | 9.3% | 3 |
| evd.X1 0.01 | 6.8 | 8.7% | 5 |
| jsal.Jsalbot 1.0 | 7.8 | 7.0% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 6 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 58.1 | 9 / 35 | 4712 |
| 2 | 2 | 64.2 | 72.1 | 14 / 35 | 4950 |
| 3 | 2 | 61.7 | 64.1 | 12 / 35 | 5052 |
| 4 | 1 | 62.4 | 65.4 | 14 / 35 | 4944 |
| 5 | 1 | 65.0 | 72.4 | 15 / 35 | 5773 |
| 6 | 1 | 61.9 | 65.4 | 14 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 71% |
| cs.Wren 1.0 | 24 | 79% |
| mz.Cork 0.1 | 11 | 82% |
| js.PinBall 1.6 | 5 | 60% |
| joe.ADinosaur 1.0 | 3 | 67% |
| evd.X1 0.01 | 3 | 33% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 43% | 98 |
| evd.X1 0.01 | 19 | 14% | 19 |
| cs.Wren 1.0 | 16 | 12% | 31 |
| joe.ADinosaur 1.0 | 12 | 9% | 17 |
| js.PinBall 1.6 | 10 | 8% | 13 |
| mz.Cork 0.1 | 8 | 6% | 14 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.8 | 124 / 210 | 2.81 | 18.2% | 29787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.2% | 124 |
| myl.nano.Graviton 1.10 | 2.7 | 12.1% | 24 |
| ntc.Opposite 1.5 | 2.8 | 11.7% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 9 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 6 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 5 |
| pbg.R2D2 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 21 / 35 | 5045 |
| 2 | 1 | 68.8 | 84.1 | 23 / 35 | 5063 |
| 3 | 1 | 66.6 | 78.7 | 20 / 35 | 4794 |
| 4 | 1 | 67.1 | 79.7 | 21 / 35 | 4840 |
| 5 | 1 | 68.0 | 83.8 | 20 / 35 | 5098 |
| 6 | 1 | 65.9 | 74.0 | 19 / 35 | 4947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 83% |
| ntc.Opposite 1.5 | 24 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 90% |
| stelo.AreaTargetingBot 1.1 | 18 | 94% |
| disan.Chair 2.2.0 | 13 | 85% |
| donjezza.Muncho 1.0 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| DBall.NUKE 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 20 | 23% | 47 |
| pfvicm.Sobieski 7.2.3b | 16 | 19% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 27 |
| stelo.AreaTargetingBot 1.1 | 11 | 13% | 32 |
| ntc.Opposite 1.5 | 11 | 13% | 24 |
| disan.Chair 2.2.0 | 6 | 7% | 18 |
| pbg.R2D2 1.0 | 4 | 5% | 10 |
| donjezza.Muncho 1.0 | 2 | 2% | 15 |
| DBall.NUKE 0.1 | 2 | 2% | 12 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 76.5 | 90 / 210 | 3.12 | 16.7% | 27389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.7% | 90 |
| oog.melee.Capulet 1.2 | 2.0 | 14.7% | 52 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.6% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.3% | 23 |
| yagami.Tidus 0.11 | 5.0 | 11.8% | 3 |
| ejb.Polaris 1.0.1 | 5.5 | 10.6% | 13 |
| stelo.MirrorNano 1.3 | 7.5 | 7.0% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 73.0 | 13 / 35 | 4452 |
| 2 | 1 | 67.4 | 81.3 | 18 / 35 | 4549 |
| 3 | 1 | 68.5 | 82.2 | 21 / 35 | 4938 |
| 4 | 2 | 63.7 | 69.2 | 15 / 35 | 3909 |
| 5 | 1 | 67.7 | 80.6 | 14 / 35 | 4925 |
| 6 | 2 | 65.2 | 72.4 | 9 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 63% |
| kawigi.micro.Shiz 1.1 | 29 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 80% |
| yagami.Tidus 0.11 | 14 | 93% |
| ejb.Polaris 1.0.1 | 7 | 43% |

Hadur died in 120 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 47% | 84 |
| ejb.Polaris 1.0.1 | 17 | 14% | 24 |
| yagami.Tidus 0.11 | 16 | 13% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% | 32 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 31 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.4 | 113 / 210 | 3.21 | 16.7% | 26594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.7% | 113 |
| bzdp.Pansy 2.1 | 3.2 | 12.5% | 21 |
| wee.Gem 1.8.4 | 3.3 | 12.2% | 26 |
| wompi.Quokka 1.6 | 3.7 | 11.7% | 16 |
| ratosh.Nobo 0.21 | 3.8 | 11.7% | 19 |
| m3thos.Eva00 1.1 | 6.0 | 9.4% | 8 |
| bayen.UbaMicro 1.4 | 7.0 | 8.2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.4 | 21 / 35 | 4614 |
| 2 | 1 | 64.7 | 77.1 | 19 / 35 | 4033 |
| 3 | 1 | 64.7 | 74.3 | 20 / 35 | 4505 |
| 4 | 1 | 65.1 | 74.3 | 19 / 35 | 4623 |
| 5 | 1 | 66.7 | 79.0 | 20 / 35 | 4576 |
| 6 | 1 | 63.0 | 69.5 | 14 / 35 | 4243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 88% |
| wee.Gem 1.8.4 | 36 | 92% |
| ratosh.Nobo 0.21 | 16 | 75% |
| wompi.Quokka 1.6 | 14 | 71% |
| m3thos.Eva00 1.1 | 2 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 22 | 23% | 67 |
| ratosh.Nobo 0.21 | 14 | 14% | 27 |
| wompi.Quokka 1.6 | 11 | 11% | 20 |
| maribo.FollowFire 1 | 10 | 10% | 10 |
| wee.Gem 1.8.4 | 9 | 9% | 45 |
| bayen.UbaMicro 1.4 | 9 | 9% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 9% | 10 |
| stelo.MyAgileRobot 0.2 | 8 | 8% | 9 |
| m3thos.Eva00 1.1 | 5 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 88.1 | 129 / 210 | 2.07 | 22.1% | 50775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.1% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 17 |
| stuff.Vlad 0.1 | 4.8 | 9.4% | 0 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 0 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.0% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 84.8 | 17 / 35 | 8244 |
| 2 | 1 | 73.0 | 87.0 | 21 / 35 | 7953 |
| 3 | 1 | 73.7 | 87.3 | 23 / 35 | 8556 |
| 4 | 1 | 75.1 | 94.0 | 25 / 35 | 9052 |
| 5 | 1 | 73.1 | 86.7 | 20 / 35 | 8542 |
| 6 | 1 | 73.9 | 88.9 | 23 / 35 | 8428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 133 | 80% |
| mz.NanoGod 2.02 | 13 | 46% |
| exauge.GateKeeper 1.1.121g | 7 | 86% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 83 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 45% | 138 |
| mz.NanoGod 2.02 | 31 | 37% | 46 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 8 |
| stelo.PianistNano 1.2 | 4 | 5% | 6 |
| drd.Dreadknoght 0.9 | 4 | 5% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 77.8 | 110 / 210 | 3.00 | 17.5% | 30295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.5% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 34 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 17 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.0% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.5% | 4 |
| conscience.Electron 1.3g | 6.7 | 8.5% | 3 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 9.0 | 6.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 69.2 | 16 / 35 | 4852 |
| 2 | 1 | 66.9 | 77.5 | 19 / 35 | 5323 |
| 3 | 1 | 65.3 | 75.2 | 18 / 35 | 4721 |
| 4 | 1 | 66.7 | 80.3 | 18 / 35 | 4916 |
| 5 | 1 | 67.6 | 82.2 | 18 / 35 | 5176 |
| 6 | 1 | 67.7 | 82.2 | 21 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 82% |
| dummy.micro.Sparrow 2.5 | 36 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 71% |
| bvh.micro.Freya 0.3 | 18 | 94% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 26% | 61 |
| dummy.micro.Sparrow 2.5 | 19 | 19% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 35 |
| conscience.Electron 1.3g | 14 | 14% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 9% | 9 |
| bvh.micro.Freya 0.3 | 8 | 8% | 18 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 10 |
| dl.BetterWalls 1.0 | 4 | 4% | 6 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 83.7 | 137 / 210 | 2.47 | 20.9% | 42937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.9% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 15 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.3% | 15 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 12 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 4 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 3 |
| sample.Corners 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 85.4 | 26 / 35 | 7620 |
| 2 | 1 | 72.2 | 87.9 | 24 / 35 | 7326 |
| 3 | 1 | 70.5 | 81.3 | 20 / 35 | 7304 |
| 4 | 1 | 69.5 | 78.1 | 19 / 35 | 6952 |
| 5 | 1 | 70.5 | 82.5 | 24 / 35 | 6630 |
| 6 | 1 | 71.4 | 86.7 | 24 / 35 | 7105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 45 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 93% |
| supersample.SuperBoxBot 1.0 | 33 | 85% |
| dsw.StaticD 1.0 | 14 | 43% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 29% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 26% | 59 |
| dsw.StaticD 1.0 | 16 | 22% | 26 |
| tlp.ThreeLeggedPig 1 | 6 | 8% | 9 |
| sul.Lunar 1.1 | 5 | 7% | 46 |
| mme.NikeEnhanced 2.0 | 4 | 5% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.2 | 116 / 210 | 2.51 | 19.0% | 38970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.0% | 116 |
| mld.Wisdom 1.0 | 2.2 | 13.5% | 30 |
| radnor.DoctorBob 1.42 | 3.2 | 12.6% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.2% | 18 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 11 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 7 |
| GarmBox.Oranges 1.0 | 7.3 | 7.1% | 1 |
| sample.Walls 1.0 | 8.0 | 6.9% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 86.7 | 23 / 35 | 7023 |
| 2 | 1 | 66.8 | 79.0 | 16 / 35 | 6002 |
| 3 | 1 | 67.9 | 80.0 | 18 / 35 | 6475 |
| 4 | 1 | 71.0 | 90.2 | 24 / 35 | 6501 |
| 5 | 1 | 66.6 | 77.5 | 17 / 35 | 6150 |
| 6 | 1 | 69.8 | 86.0 | 18 / 35 | 6819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 88% |
| radnor.DoctorBob 1.42 | 32 | 81% |
| mld.Wisdom 1.0 | 27 | 74% |
| KiraNL.Chupacabra 0.4 | 16 | 81% |
| amz.NanoClone 1.41 | 13 | 77% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 31% | 51 |
| radnor.DoctorBob 1.42 | 22 | 23% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 13% | 48 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 23 |
| amz.NanoClone 1.41 | 11 | 12% | 18 |
| GarmBox.Oranges 1.0 | 4 | 4% | 3 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| sample.Walls 1.0 | 3 | 3% | 6 |

