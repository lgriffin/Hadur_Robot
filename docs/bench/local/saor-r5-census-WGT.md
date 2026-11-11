# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 90.7 | 159 / 210 | 1.83 | 22.1% | 44582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.1% | 159 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 16 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.8% | 14 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| sample.Walls 1.0 | 6.8 | 6.1% | 1 |
| jangs.ns51 1.0 | 7.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 4.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 89.2 | 26 / 35 | 7440 |
| 2 | 1 | 73.6 | 94.3 | 27 / 35 | 7503 |
| 3 | 1 | 72.4 | 87.9 | 24 / 35 | 7214 |
| 4 | 1 | 72.0 | 85.4 | 25 / 35 | 7319 |
| 5 | 1 | 74.2 | 94.3 | 28 / 35 | 8098 |
| 6 | 1 | 73.1 | 93.3 | 29 / 35 | 7008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 91% |
| mld.Infinity 2.2 | 42 | 95% |
| radnor.DoctorBob 1.42 | 34 | 85% |
| amz.NanoClone 1.41 | 13 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 41% | 64 |
| mz.AntiGrav 1.0 | 14 | 27% | 74 |
| mld.Infinity 2.2 | 7 | 14% | 44 |
| amz.NanoClone 1.41 | 3 | 6% | 11 |
| GarmBox.Oranges 1.0 | 2 | 4% | 5 |
| jangs.ns51 1.0 | 2 | 4% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| sample.Walls 1.0 | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.0 | 131 / 210 | 2.17 | 19.1% | 32822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.1% | 131 |
| mld.DustBunny 3.8 | 2.5 | 14.2% | 20 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 39 |
| maribo.melee.BMV 0.1 | 4.0 | 11.3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.1% | 4 |
| bzdp.BoxCar 2.0 | 7.2 | 7.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 7 |
| fullsail.SweetTea 1.1 | 7.3 | 7.1% | 2 |
| zyx.nano.Ant 1.1 | 7.7 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.2 | 21 / 35 | 5581 |
| 2 | 1 | 68.1 | 82.9 | 19 / 35 | 5356 |
| 3 | 1 | 68.7 | 86.3 | 22 / 35 | 5505 |
| 4 | 1 | 66.9 | 83.2 | 19 / 35 | 4824 |
| 5 | 1 | 69.7 | 87.6 | 23 / 35 | 5760 |
| 6 | 1 | 71.0 | 93.0 | 27 / 35 | 5796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 72 | 90% |
| oog.melee.Mercutio 1.0 | 53 | 81% |
| maribo.melee.BMV 0.1 | 11 | 73% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 35% | 74 |
| mld.DustBunny 3.8 | 25 | 31% | 84 |
| maribo.melee.BMV 0.1 | 11 | 14% | 20 |
| fullsail.SweetTea 1.1 | 6 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 10 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.8 | 143 / 210 | 2.28 | 21.0% | 40849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.0% | 143 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.6% | 16 |
| fm.mammillarias 1.3 | 5.2 | 9.6% | 4 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.0% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 2 |
| sample.Fire 1.0 | 9.2 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 76.8 | 20 / 35 | 6272 |
| 2 | 1 | 72.3 | 87.9 | 26 / 35 | 7227 |
| 3 | 1 | 72.4 | 89.8 | 27 / 35 | 6900 |
| 4 | 1 | 71.4 | 88.3 | 22 / 35 | 6836 |
| 5 | 1 | 70.7 | 82.5 | 24 / 35 | 6634 |
| 6 | 1 | 71.6 | 89.5 | 24 / 35 | 6980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 73 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 82% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 94% |
| fm.mammillarias 1.3 | 9 | 89% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 27% | 79 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 22% | 33 |
| fm.mammillarias 1.3 | 11 | 16% | 15 |
| myl.nano.KomoriNinja 1.1 | 10 | 15% | 32 |
| cb.nano.Insomnia 1.0 | 8 | 12% | 18 |
| sample.Fire 1.0 | 3 | 4% | 7 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 14 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 6 |

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.2 | 146 / 210 | 2.33 | 20.6% | 40660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.6% | 146 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.6% | 19 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.5% | 15 |
| yk.JahMicro 1.0 | 5.7 | 8.7% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.6% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 8.6% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.4% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 91.7 | 29 / 35 | 6713 |
| 2 | 1 | 71.7 | 87.9 | 28 / 35 | 7172 |
| 3 | 1 | 69.8 | 81.0 | 23 / 35 | 6729 |
| 4 | 1 | 70.4 | 87.6 | 23 / 35 | 6626 |
| 5 | 1 | 68.2 | 77.5 | 22 / 35 | 6308 |
| 6 | 1 | 70.6 | 85.7 | 21 / 35 | 7112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 89% |
| stelo.SoJNanoMelee 1.1 | 32 | 94% |
| tvv.micro.Antares 1.1.1 | 23 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 85% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| yk.JahMicro 1.0 | 12 | 83% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 39% | 77 |
| tj.zombie1n 1.0.1 | 11 | 17% | 14 |
| stelo.SoJNanoMelee 1.1 | 8 | 13% | 21 |
| yk.JahMicro 1.0 | 6 | 9% | 17 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 71.0 | 92 / 210 | 3.61 | 16.9% | 33140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.9% | 92 |
| oog.melee.Corsair 1.0 | 2.3 | 13.1% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 20 |
| ahf.NanoAndrew .4 | 3.8 | 11.2% | 29 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 13 |
| EBBU.Sim2 1.02 | 6.2 | 9.4% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 69.5 | 12 / 35 | 5487 |
| 2 | 1 | 66.0 | 74.0 | 14 / 35 | 5742 |
| 3 | 1 | 62.8 | 63.8 | 15 / 35 | 4972 |
| 4 | 1 | 66.7 | 74.3 | 17 / 35 | 5930 |
| 5 | 1 | 64.2 | 66.3 | 16 / 35 | 5441 |
| 6 | 1 | 67.1 | 78.1 | 18 / 35 | 5568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 38 | 68% |
| simonton.nano.MeleeSeed 1.8 | 33 | 91% |
| ahf.NanoAndrew .4 | 23 | 83% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 19% | 54 |
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 44 |
| ahf.NanoAndrew .4 | 17 | 14% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 14 |
| sam.Samspin 1.0 | 11 | 9% | 16 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 14 |
| EBBU.Sim2 1.02 | 10 | 8% | 19 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 9 |
| sample.TrackFire 1.0 | 5 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.7 | 126 / 210 | 2.38 | 19.1% | 33568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.1% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.4% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.9% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.5% | 8 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 4 |
| fm.claire 1.7 | 6.2 | 8.8% | 2 |
| sample.SpinBot 1.0 | 8.2 | 6.5% | 2 |
| pa.Improved 1.0 | 9.2 | 5.6% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.6 | 22 / 35 | 5654 |
| 2 | 1 | 68.7 | 84.8 | 21 / 35 | 5369 |
| 3 | 1 | 67.5 | 80.3 | 20 / 35 | 5429 |
| 4 | 1 | 69.5 | 87.0 | 22 / 35 | 5769 |
| 5 | 1 | 68.9 | 85.1 | 22 / 35 | 5631 |
| 6 | 1 | 68.3 | 83.5 | 19 / 35 | 5716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 83% |
| oog.melee.CapuletDroid 1.1 | 28 | 89% |
| arthord.NanoSatanMelee Beta | 15 | 87% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| fm.claire 1.7 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| pa.Improved 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 85 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 39% | 88 |
| gh.nano.Grofvuil 0.2 | 14 | 16% | 28 |
| winamp32.micro.MicroMacro 1.0 | 12 | 14% | 18 |
| oog.melee.CapuletDroid 1.1 | 11 | 13% | 37 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 14 |
| fm.claire 1.7 | 5 | 6% | 9 |
| pa.Improved 1.0 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.4 | 108 / 210 | 2.59 | 18.7% | 36213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.7% | 108 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.3% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.3% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 12.8% | 27 |
| DBall.Anarchy 0.1 | 5.5 | 8.9% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.7% | 0 |
| acogdev.alpha 0.2 | 8.5 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 78.4 | 17 / 35 | 6215 |
| 2 | 1 | 67.3 | 81.0 | 18 / 35 | 5268 |
| 3 | 1 | 67.9 | 81.0 | 15 / 35 | 5852 |
| 4 | 1 | 70.1 | 86.7 | 20 / 35 | 6417 |
| 5 | 1 | 68.8 | 81.9 | 20 / 35 | 6252 |
| 6 | 1 | 69.3 | 85.4 | 18 / 35 | 6209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 92% |
| mz.MicroGodMelee 1 | 44 | 68% |
| gh.micro.Gruweltje 0.7 | 30 | 67% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 33 | 32% | 60 |
| mz.MicroGodMelee 1 | 30 | 29% | 57 |
| spinnercat.micro.Tyger 0.1 | 15 | 15% | 56 |
| acogdev.alpha 0.2 | 7 | 7% | 8 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 10 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 72.4 | 111 / 210 | 3.49 | 17.1% | 32531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 17.1% | 111 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.6% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.9% | 8 |
| germ.TheMind .2 | 5.8 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.3% | 1 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.0% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 8.2% | 8 |
| sample.Crazy 1.0 | 8.2 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 78.1 | 19 / 35 | 6211 |
| 2 | 2 | 63.9 | 64.4 | 17 / 35 | 5438 |
| 3 | 1 | 68.8 | 81.3 | 22 / 35 | 5504 |
| 4 | 1 | 60.6 | 60.0 | 12 / 35 | 4847 |
| 5 | 1 | 66.8 | 75.9 | 22 / 35 | 5310 |
| 6 | 1 | 66.1 | 74.6 | 19 / 35 | 5221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 73% |
| germ.TheMind .2 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 45% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 21% | 35 |
| germ.TheMind .2 | 9 | 9% | 21 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 10 |
| awesomeness.Elite 1.0 | 6 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 86.1 | 143 / 210 | 2.25 | 19.9% | 32816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.9% | 143 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 12 |
| maribo.IotaCT 1.1 | 4.7 | 10.5% | 6 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.5% | 8 |
| stelo.PatternRobot 1.0 | 7.5 | 8.2% | 8 |
| spinnercat.Omen 1.0 | 8.0 | 8.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 84.1 | 25 / 35 | 5178 |
| 2 | 1 | 69.3 | 83.5 | 20 / 35 | 5469 |
| 3 | 1 | 70.2 | 85.7 | 24 / 35 | 5444 |
| 4 | 1 | 70.0 | 85.4 | 24 / 35 | 5355 |
| 5 | 1 | 71.0 | 87.6 | 23 / 35 | 5607 |
| 6 | 1 | 71.1 | 90.5 | 27 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 67 | 94% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| maribo.IotaCT 1.1 | 14 | 100% |
| ratosh.Wesco 1.4 | 13 | 85% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 25% | 71 |
| timmit.nano.TimDog 0.33 | 13 | 19% | 22 |
| stelo.PatternRobot 1.0 | 12 | 18% | 16 |
| ratosh.Wesco 1.4 | 10 | 15% | 21 |
| nz.jdc.nano.GridFu 1.0 | 7 | 10% | 50 |
| maribo.IotaCT 1.1 | 4 | 6% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.7 | 155 / 210 | 1.92 | 21.3% | 40302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.3% | 155 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.6% | 24 |
| baal.nano.N 1.42 | 2.8 | 11.9% | 13 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 2 |
| sanja.First 0.1 | 5.7 | 8.6% | 0 |
| zyx.micro.Ant 1.1 | 6.0 | 8.7% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.1% | 4 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 84.4 | 23 / 35 | 6290 |
| 2 | 1 | 70.3 | 86.0 | 24 / 35 | 6659 |
| 3 | 1 | 71.6 | 88.9 | 23 / 35 | 7271 |
| 4 | 1 | 72.8 | 98.1 | 30 / 35 | 6937 |
| 5 | 1 | 71.6 | 90.5 | 28 / 35 | 6569 |
| 6 | 1 | 71.5 | 90.5 | 27 / 35 | 6576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 91% |
| tvv.nano.Polaris 1.2 | 35 | 83% |
| cvt.Firsty 1.0 | 21 | 90% |
| sanja.First 0.1 | 21 | 100% |
| zyx.micro.Ant 1.1 | 18 | 78% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 17 | 30% | 67 |
| zyx.micro.Ant 1.1 | 11 | 20% | 30 |
| baal.nano.N 1.42 | 9 | 16% | 43 |
| squidM.TentalceMeleeNano 1.1 | 6 | 11% | 7 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 10 |
| cvt.Firsty 1.0 | 4 | 7% | 20 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 4 |
| sanja.First 0.1 | 1 | 2% | 22 |
| sample.RamFire 1.0 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.9 | 97 / 210 | 3.53 | 16.6% | 33966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 16.6% | 97 |
| kc.micro.Figment 1.0 | 2.0 | 14.4% | 57 |
| cs.Wren 1.0 | 2.8 | 12.7% | 27 |
| js.PinBall 1.6 | 4.2 | 11.0% | 11 |
| mz.Cork 0.1 | 5.0 | 10.8% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 4 |
| evd.X1 0.01 | 6.8 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.5 | 5.1% | 3 |
| PSW.Relentless 0.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.7 | 17 / 35 | 6130 |
| 2 | 1 | 65.5 | 70.8 | 18 / 35 | 5916 |
| 3 | 1 | 64.1 | 69.2 | 13 / 35 | 5754 |
| 4 | 1 | 67.7 | 79.0 | 20 / 35 | 5983 |
| 5 | 1 | 63.9 | 67.0 | 15 / 35 | 5419 |
| 6 | 2 | 62.1 | 65.7 | 14 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 71% |
| cs.Wren 1.0 | 29 | 90% |
| mz.Cork 0.1 | 11 | 82% |
| js.PinBall 1.6 | 11 | 82% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 113 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 40% | 95 |
| cs.Wren 1.0 | 16 | 14% | 36 |
| joe.ADinosaur 1.0 | 13 | 12% | 14 |
| evd.X1 0.01 | 12 | 11% | 11 |
| js.PinBall 1.6 | 11 | 10% | 18 |
| PSW.Relentless 0.1 | 10 | 9% | 10 |
| mz.Cork 0.1 | 4 | 4% | 17 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.7 | 135 / 210 | 2.47 | 19.3% | 30925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.3% | 135 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 22 |
| ntc.Opposite 1.5 | 2.7 | 11.7% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 8 |
| disan.Chair 2.2.0 | 6.3 | 8.8% | 10 |
| pfvicm.Sobieski 7.2.3b | 6.8 | 8.6% | 4 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 8.8 | 6.5% | 8 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.8 | 23 / 35 | 5510 |
| 2 | 1 | 66.6 | 78.1 | 21 / 35 | 4735 |
| 3 | 1 | 69.3 | 86.3 | 23 / 35 | 5129 |
| 4 | 1 | 68.9 | 83.2 | 22 / 35 | 5310 |
| 5 | 1 | 69.5 | 86.3 | 22 / 35 | 5255 |
| 6 | 1 | 68.8 | 83.5 | 24 / 35 | 4986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 90% |
| stelo.AreaTargetingBot 1.1 | 30 | 87% |
| ntc.Opposite 1.5 | 25 | 100% |
| disan.Chair 2.2.0 | 19 | 79% |
| donjezza.Muncho 1.0 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| DBall.NUKE 0.1 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 2 | 50% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 25% | 43 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 17 |
| myl.nano.Graviton 1.10 | 12 | 16% | 49 |
| ntc.Opposite 1.5 | 11 | 14% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 19 |
| disan.Chair 2.2.0 | 6 | 8% | 17 |
| pbg.R2D2 1.0 | 4 | 5% | 7 |
| DBall.NUKE 0.1 | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 1 | 1% | 13 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 77.2 | 97 / 210 | 3.05 | 17.0% | 28600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 17.0% | 97 |
| oog.melee.Capulet 1.2 | 2.5 | 14.1% | 47 |
| kawigi.micro.Shiz 1.1 | 3.7 | 13.0% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.0% | 27 |
| yagami.Tidus 0.11 | 3.8 | 12.8% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 9.8% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.8 | 19 / 35 | 5123 |
| 2 | 1 | 66.7 | 76.8 | 18 / 35 | 4815 |
| 3 | 1 | 67.9 | 80.3 | 19 / 35 | 4975 |
| 4 | 1 | 66.2 | 76.5 | 16 / 35 | 4617 |
| 5 | 2 | 64.1 | 69.5 | 9 / 35 | 4607 |
| 6 | 1 | 65.7 | 75.2 | 16 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 84% |
| yagami.Tidus 0.11 | 24 | 88% |
| kawigi.micro.Shiz 1.1 | 20 | 100% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 47% | 75 |
| yagami.Tidus 0.11 | 25 | 22% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 12% | 44 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 21 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| ejb.Polaris 1.0.1 | 5 | 4% | 14 |
| step.nanoPri 1.0 | 4 | 4% | 5 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.5 | 121 / 210 | 3.39 | 16.6% | 26865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.6% | 121 |
| bzdp.Pansy 2.1 | 2.8 | 12.5% | 21 |
| ratosh.Nobo 0.21 | 3.2 | 11.7% | 11 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 34 |
| wompi.Quokka 1.6 | 4.7 | 11.1% | 12 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.7 | 23 / 35 | 4760 |
| 2 | 1 | 64.0 | 71.4 | 20 / 35 | 4307 |
| 3 | 1 | 66.0 | 76.5 | 22 / 35 | 4540 |
| 4 | 1 | 61.8 | 61.9 | 18 / 35 | 4065 |
| 5 | 1 | 66.5 | 81.9 | 21 / 35 | 4565 |
| 6 | 1 | 63.6 | 69.5 | 17 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 94% |
| wee.Gem 1.8.4 | 28 | 96% |
| wompi.Quokka 1.6 | 17 | 88% |
| ratosh.Nobo 0.21 | 17 | 94% |
| m3thos.Eva00 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 342. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 19 | 21% | 49 |
| maribo.FollowFire 1 | 14 | 15% | 16 |
| ratosh.Nobo 0.21 | 12 | 13% | 28 |
| wompi.Quokka 1.6 | 10 | 11% | 21 |
| bayen.UbaMicro 1.4 | 10 | 11% | 14 |
| bzdp.Pansy 2.1 | 9 | 10% | 49 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 8 |
| m3thos.Eva00 1.1 | 6 | 7% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 4% | 8 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 86.0 | 117 / 210 | 2.26 | 21.6% | 50606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.6% | 117 |
| wompi.Wallaby 5.1 | 2.0 | 18.6% | 77 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 9 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.6% | 5 |
| ayk.WallHugger 1.0 | 5.2 | 8.9% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 83.8 | 19 / 35 | 8361 |
| 2 | 1 | 74.2 | 87.9 | 22 / 35 | 9472 |
| 3 | 1 | 72.4 | 84.8 | 18 / 35 | 8066 |
| 4 | 1 | 73.6 | 88.6 | 23 / 35 | 8316 |
| 5 | 1 | 71.7 | 83.5 | 16 / 35 | 8137 |
| 6 | 1 | 73.0 | 87.3 | 19 / 35 | 8254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 72% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| mz.NanoGod 2.02 | 11 | 73% |
| stuff.Vlad 0.1 | 3 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 0% |

Hadur died in 93 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 49 | 53% | 142 |
| mz.NanoGod 2.02 | 25 | 27% | 32 |
| ayk.WallHugger 1.0 | 7 | 8% | 8 |
| exauge.GateKeeper 1.1.121g | 6 | 6% | 12 |
| stelo.PianistNano 1.2 | 4 | 4% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 72.1 | 99 / 210 | 3.51 | 16.6% | 30002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.6% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.4% | 26 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.2% | 23 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 27 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 5 |
| conscience.Electron 1.3g | 7.5 | 7.7% | 0 |
| ap.Frederick 1.1 | 8.0 | 6.9% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 5.8% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 66.7 | 16 / 35 | 4874 |
| 2 | 1 | 61.8 | 61.6 | 12 / 35 | 4865 |
| 3 | 1 | 66.2 | 77.5 | 19 / 35 | 4622 |
| 4 | 1 | 67.4 | 79.4 | 17 / 35 | 5509 |
| 5 | 1 | 67.2 | 81.0 | 21 / 35 | 5291 |
| 6 | 1 | 63.1 | 66.7 | 14 / 35 | 4841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 84% |
| dummy.micro.Sparrow 2.5 | 33 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 80% |
| bvh.micro.Freya 0.3 | 14 | 71% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 24% | 60 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 17 |
| dummy.micro.Sparrow 2.5 | 14 | 13% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 32 |
| conscience.Electron 1.3g | 14 | 13% | 16 |
| bvh.micro.Freya 0.3 | 11 | 10% | 21 |
| stelo.MirrorMicro 1.0 | 11 | 10% | 17 |
| dl.BetterWalls 1.0 | 3 | 3% | 5 |

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.4 | 154 / 210 | 2.31 | 21.6% | 44182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.6% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 17 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.1% | 9 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 9 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 7 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.8% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.6% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.0% | 1 |
| sample.Corners 1.0 | 9.5 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 85.1 | 25 / 35 | 7429 |
| 2 | 1 | 69.4 | 76.8 | 22 / 35 | 6605 |
| 3 | 1 | 71.3 | 82.5 | 24 / 35 | 7512 |
| 4 | 1 | 73.6 | 95.6 | 28 / 35 | 7472 |
| 5 | 1 | 71.9 | 82.9 | 27 / 35 | 7554 |
| 6 | 1 | 73.0 | 89.5 | 28 / 35 | 7610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 95% |
| supersample.SuperBoxBot 1.0 | 32 | 94% |
| sample.MyFirstRobot 1.0 | 13 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| dsw.StaticD 1.0 | 7 | 86% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 42% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 19% | 57 |
| sul.Lunar 1.1 | 7 | 12% | 46 |
| dsw.StaticD 1.0 | 5 | 9% | 17 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 11 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 12 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.5 | 112 / 210 | 2.84 | 18.6% | 38892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.6% | 112 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 30 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.5% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 12 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 7 |
| jangs.ns51 1.0 | 7.7 | 6.7% | 3 |
| sample.Walls 1.0 | 8.0 | 6.7% | 5 |
| GarmBox.Oranges 1.0 | 8.3 | 6.4% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 83.2 | 22 / 35 | 6812 |
| 2 | 1 | 68.4 | 79.7 | 21 / 35 | 6607 |
| 3 | 1 | 67.9 | 79.7 | 17 / 35 | 6450 |
| 4 | 1 | 68.0 | 79.7 | 17 / 35 | 6237 |
| 5 | 1 | 64.7 | 70.2 | 13 / 35 | 5787 |
| 6 | 1 | 69.9 | 84.8 | 22 / 35 | 6999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 100% |
| mld.Wisdom 1.0 | 21 | 67% |
| amz.NanoClone 1.41 | 12 | 92% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| jangs.ns51 1.0 | 8 | 88% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |

Hadur died in 98 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 31% | 47 |
| radnor.DoctorBob 1.42 | 23 | 23% | 59 |
| KiraNL.Chupacabra 0.4 | 12 | 12% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 11% | 44 |
| amz.NanoClone 1.41 | 10 | 10% | 18 |
| GarmBox.Oranges 1.0 | 7 | 7% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| sample.Walls 1.0 | 2 | 2% | 6 |

