# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 91.3 | 162 / 210 | 1.78 | 22.6% | 46198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.6% | 162 |
| mz.AntiGrav 1.0 | 2.3 | 14.5% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 13.8% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.5% | 7 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.1% | 0 |
| sample.Walls 1.0 | 7.3 | 6.3% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 92.7 | 27 / 35 | 7386 |
| 2 | 1 | 73.0 | 87.9 | 25 / 35 | 7258 |
| 3 | 1 | 74.2 | 94.0 | 28 / 35 | 7918 |
| 4 | 1 | 73.9 | 94.3 | 27 / 35 | 7562 |
| 5 | 1 | 74.2 | 92.1 | 30 / 35 | 8216 |
| 6 | 1 | 73.0 | 87.0 | 25 / 35 | 7858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 89 | 90% |
| radnor.DoctorBob 1.42 | 42 | 81% |
| mld.Infinity 2.2 | 34 | 100% |
| amz.NanoClone 1.41 | 7 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 22 | 45% | 86 |
| radnor.DoctorBob 1.42 | 21 | 43% | 62 |
| mld.Infinity 2.2 | 2 | 4% | 38 |
| amz.NanoClone 1.41 | 2 | 4% | 9 |
| jangs.ns51 1.0 | 2 | 4% | 4 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.3 | 108 / 210 | 2.68 | 18.0% | 32044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.0% | 108 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.1% | 61 |
| mld.DustBunny 3.8 | 2.7 | 14.4% | 26 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.6% | 5 |
| zyx.nano.Ant 1.1 | 6.7 | 8.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 6.9% | 5 |
| bzdp.BoxCar 2.0 | 7.7 | 7.1% | 0 |
| fullsail.SweetTea 1.1 | 8.0 | 7.2% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.5 | 21 / 35 | 5763 |
| 2 | 1 | 64.1 | 64.8 | 11 / 35 | 5598 |
| 3 | 1 | 68.6 | 87.9 | 17 / 35 | 5361 |
| 4 | 1 | 67.7 | 83.2 | 16 / 35 | 5257 |
| 5 | 1 | 68.2 | 84.4 | 22 / 35 | 5199 |
| 6 | 1 | 67.6 | 84.1 | 21 / 35 | 4866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 80% |
| oog.melee.Mercutio 1.0 | 59 | 64% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 39% | 80 |
| mld.DustBunny 3.8 | 28 | 27% | 73 |
| cs.Grudge 1.0 | 9 | 9% | 9 |
| maribo.melee.BMV 0.1 | 7 | 7% | 13 |
| zyx.nano.Ant 1.1 | 7 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 9 |
| fullsail.SweetTea 1.1 | 4 | 4% | 5 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 8 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 83.7 | 129 / 210 | 2.47 | 20.2% | 38648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.2% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 15.5% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.4% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.8% | 16 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 7 |
| fm.mammillarias 1.3 | 6.0 | 8.4% | 0 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 3 |
| sample.Tracker 1.0 | 9.2 | 4.7% | 1 |
| sample.Fire 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.4 | 20 / 35 | 6380 |
| 2 | 1 | 69.6 | 79.4 | 21 / 35 | 6381 |
| 3 | 1 | 71.2 | 87.3 | 25 / 35 | 6333 |
| 4 | 1 | 70.4 | 83.5 | 23 / 35 | 6386 |
| 5 | 1 | 72.2 | 88.9 | 22 / 35 | 6830 |
| 6 | 1 | 68.6 | 77.8 | 18 / 35 | 6338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 68 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 83% |
| cb.nano.Insomnia 1.0 | 17 | 82% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 30% | 75 |
| cb.nano.Insomnia 1.0 | 17 | 21% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 16% | 30 |
| fm.mammillarias 1.3 | 11 | 14% | 19 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 31 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 6 |
| sample.Fire 1.0 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.5 | 155 / 210 | 1.95 | 21.5% | 42231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.5% | 155 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.7% | 11 |
| kawigi.nano.Lib 1.0 | 2.7 | 11.8% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.7% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 6.0 | 8.8% | 7 |
| yk.JahMicro 1.0 | 6.5 | 8.4% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.3 | 24 / 35 | 6983 |
| 2 | 1 | 72.0 | 91.4 | 28 / 35 | 6726 |
| 3 | 1 | 72.1 | 92.1 | 24 / 35 | 7403 |
| 4 | 1 | 71.3 | 88.6 | 26 / 35 | 6772 |
| 5 | 1 | 70.7 | 87.3 | 25 / 35 | 6690 |
| 6 | 1 | 72.4 | 90.2 | 28 / 35 | 7657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 96% |
| stelo.SoJNanoMelee 1.1 | 47 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 79% |
| tj.zombie1n 1.0.1 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| yk.JahMicro 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 17 | 31% | 47 |
| kawigi.nano.Lib 1.0 | 16 | 29% | 72 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 11% | 24 |
| yk.JahMicro 1.0 | 4 | 7% | 13 |
| tj.zombie1n 1.0.1 | 4 | 7% | 12 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 22 |
| repositorio.NanoStep 1.0 | 3 | 5% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.4 | 87 / 210 | 3.76 | 16.2% | 30044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.2% | 87 |
| oog.melee.Corsair 1.0 | 2.3 | 12.9% | 32 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.4% | 28 |
| ahf.NanoAndrew .4 | 4.3 | 11.0% | 27 |
| EBBU.Sim2 1.02 | 5.7 | 10.1% | 4 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.5% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.6% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 63.8 | 13 / 35 | 4997 |
| 2 | 1 | 65.8 | 74.9 | 17 / 35 | 4968 |
| 3 | 1 | 63.2 | 65.4 | 13 / 35 | 5040 |
| 4 | 1 | 63.3 | 69.8 | 12 / 35 | 4827 |
| 5 | 1 | 63.3 | 66.0 | 15 / 35 | 5027 |
| 6 | 1 | 66.0 | 76.2 | 17 / 35 | 5185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 79% |
| oog.melee.Corsair 1.0 | 34 | 68% |
| ahf.NanoAndrew .4 | 14 | 71% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| EBBU.Sim2 1.02 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 45 |
| oog.melee.Corsair 1.0 | 19 | 15% | 41 |
| ahf.NanoAndrew .4 | 19 | 15% | 34 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 28 |
| EBBU.Sim2 1.02 | 14 | 11% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 14 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 15 |
| sam.Samspin 1.0 | 4 | 3% | 10 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.2 | 143 / 210 | 2.24 | 19.9% | 35963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.9% | 143 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.4% | 13 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.6% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 3 |
| fm.claire 1.7 | 5.8 | 8.4% | 1 |
| pa.Improved 1.0 | 8.5 | 6.4% | 0 |
| sample.SpinBot 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.9 | 21 / 35 | 5544 |
| 2 | 1 | 70.6 | 88.6 | 23 / 35 | 6383 |
| 3 | 1 | 71.5 | 93.7 | 26 / 35 | 6295 |
| 4 | 1 | 69.1 | 85.7 | 23 / 35 | 5510 |
| 5 | 1 | 70.3 | 86.3 | 27 / 35 | 6066 |
| 6 | 1 | 69.0 | 81.0 | 23 / 35 | 6165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 88% |
| oog.melee.CapuletDroid 1.1 | 33 | 94% |
| gh.nano.Grofvuil 0.2 | 27 | 85% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| kurios.DOSexe .9b | 6 | 100% |
| fm.claire 1.7 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 28% | 73 |
| oog.melee.CapuletDroid 1.1 | 14 | 21% | 46 |
| gh.nano.Grofvuil 0.2 | 12 | 18% | 41 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 13 |
| winamp32.micro.MicroMacro 1.0 | 6 | 9% | 10 |
| pa.Improved 1.0 | 3 | 4% | 6 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| fm.claire 1.7 | 2 | 3% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 10 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.8 | 96 / 210 | 2.64 | 18.7% | 37738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.7% | 96 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.5% | 49 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 28 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 28 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.1% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.3 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.1 | 15 / 35 | 6283 |
| 2 | 1 | 69.3 | 83.2 | 20 / 35 | 6261 |
| 3 | 1 | 68.3 | 84.1 | 18 / 35 | 5747 |
| 4 | 1 | 69.5 | 82.9 | 17 / 35 | 6814 |
| 5 | 1 | 68.1 | 80.0 | 14 / 35 | 6143 |
| 6 | 1 | 67.3 | 76.5 | 12 / 35 | 6490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 77% |
| mz.MicroGodMelee 1 | 35 | 46% |
| gh.micro.Gruweltje 0.7 | 33 | 61% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 31% | 61 |
| mz.MicroGodMelee 1 | 29 | 25% | 50 |
| spinnercat.micro.Tyger 0.1 | 25 | 22% | 61 |
| acogdev.alpha 0.2 | 9 | 8% | 10 |
| el.JumpShoot 0.2 | 5 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 8 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 1 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 70.7 | 106 / 210 | 3.63 | 16.7% | 31779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.7% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 40 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.7% | 6 |
| germ.TheMind .2 | 5.0 | 9.9% | 9 |
| awesomeness.Elite 1.0 | 6.5 | 8.7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 1 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 66.7 | 16 / 35 | 5363 |
| 2 | 1 | 63.5 | 65.7 | 15 / 35 | 5002 |
| 3 | 1 | 66.9 | 76.8 | 21 / 35 | 5213 |
| 4 | 1 | 67.1 | 77.5 | 18 / 35 | 5608 |
| 5 | 1 | 64.2 | 67.9 | 17 / 35 | 4981 |
| 6 | 1 | 65.9 | 69.8 | 19 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 77% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 388. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 44% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 38 |
| germ.TheMind .2 | 13 | 12% | 22 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 13 |
| awesomeness.Elite 1.0 | 6 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.6 | 145 / 210 | 2.03 | 20.4% | 33985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.4% | 145 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 20 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.6% | 14 |
| maribo.IotaCT 1.1 | 4.7 | 10.0% | 3 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.3% | 4 |
| stelo.PatternRobot 1.0 | 7.5 | 8.1% | 5 |
| ratosh.Wesco 1.4 | 7.5 | 8.0% | 3 |
| spinnercat.Omen 1.0 | 8.8 | 6.8% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.0 | 18 / 35 | 5572 |
| 2 | 1 | 71.5 | 87.9 | 27 / 35 | 5928 |
| 3 | 1 | 70.0 | 84.8 | 22 / 35 | 5637 |
| 4 | 1 | 71.1 | 93.0 | 25 / 35 | 5326 |
| 5 | 1 | 72.1 | 96.2 | 28 / 35 | 5469 |
| 6 | 1 | 72.0 | 90.5 | 25 / 35 | 6053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 93% |
| nz.jdc.nano.GridFu 1.0 | 42 | 100% |
| stelo.PatternRobot 1.0 | 16 | 81% |
| maribo.IotaCT 1.1 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 8 | 25% |
| ratosh.Wesco 1.4 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 31% | 74 |
| stelo.PatternRobot 1.0 | 13 | 20% | 22 |
| nz.jdc.nano.GridFu 1.0 | 11 | 17% | 60 |
| timmit.nano.TimDog 0.33 | 11 | 17% | 18 |
| ratosh.Wesco 1.4 | 5 | 8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| maribo.IotaCT 1.1 | 2 | 3% | 14 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.0 | 164 / 210 | 1.72 | 21.7% | 40865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.7% | 164 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 18 |
| baal.nano.N 1.42 | 2.5 | 11.8% | 11 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.3% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 8.6% | 8 |
| cvt.Firsty 1.0 | 6.7 | 8.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 1 |
| sanja.First 0.1 | 7.7 | 8.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.6% | 2 |
| sample.RamFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.8 | 28 / 35 | 6740 |
| 2 | 1 | 71.3 | 91.1 | 25 / 35 | 6734 |
| 3 | 1 | 72.8 | 98.1 | 32 / 35 | 6506 |
| 4 | 1 | 71.4 | 91.1 | 25 / 35 | 6715 |
| 5 | 1 | 72.4 | 91.4 | 28 / 35 | 7386 |
| 6 | 1 | 71.5 | 89.2 | 26 / 35 | 6784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 52 | 94% |
| cvt.Firsty 1.0 | 33 | 94% |
| tvv.nano.Polaris 1.2 | 31 | 84% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| Grystrion.TrackerWO 1.0 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 10 | 21% | 50 |
| tvv.nano.Polaris 1.2 | 10 | 21% | 47 |
| cvt.Firsty 1.0 | 8 | 17% | 29 |
| zyx.micro.Ant 1.1 | 7 | 15% | 29 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 18 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 9 |
| sanja.First 0.1 | 2 | 4% | 19 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 4 |
| sample.RamFire 1.0 | 1 | 2% | 1 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.0 | 75 / 210 | 3.88 | 15.6% | 32618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 15.6% | 75 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 67 |
| cs.Wren 1.0 | 3.2 | 12.6% | 27 |
| js.PinBall 1.6 | 4.3 | 11.5% | 12 |
| mz.Cork 0.1 | 4.5 | 11.2% | 18 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 2 |
| evd.X1 0.01 | 6.8 | 8.1% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.5% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 63.8 | 14 / 35 | 5653 |
| 2 | 2 | 63.4 | 67.9 | 10 / 35 | 5410 |
| 3 | 1 | 66.8 | 77.5 | 14 / 35 | 5864 |
| 4 | 2 | 62.9 | 66.7 | 14 / 35 | 5077 |
| 5 | 1 | 61.6 | 64.1 | 11 / 35 | 5028 |
| 6 | 1 | 63.8 | 68.3 | 12 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 63% |
| cs.Wren 1.0 | 20 | 90% |
| jsal.Jsalbot 1.0 | 7 | 86% |
| js.PinBall 1.6 | 6 | 67% |
| mz.Cork 0.1 | 6 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 135 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 43% | 100 |
| evd.X1 0.01 | 17 | 13% | 19 |
| joe.ADinosaur 1.0 | 15 | 11% | 16 |
| cs.Wren 1.0 | 12 | 9% | 26 |
| js.PinBall 1.6 | 10 | 7% | 14 |
| mz.Cork 0.1 | 10 | 7% | 13 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 9 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.9 | 127 / 210 | 2.72 | 19.0% | 31906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.0% | 127 |
| myl.nano.Graviton 1.10 | 2.7 | 12.5% | 32 |
| ntc.Opposite 1.5 | 2.8 | 11.5% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 9.9% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.8% | 12 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 10 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 6.0% | 2 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.4 | 21 / 35 | 5711 |
| 2 | 1 | 69.1 | 85.7 | 23 / 35 | 5196 |
| 3 | 1 | 68.8 | 79.0 | 19 / 35 | 5826 |
| 4 | 1 | 67.2 | 75.9 | 22 / 35 | 5099 |
| 5 | 1 | 66.9 | 77.1 | 19 / 35 | 4943 |
| 6 | 1 | 68.4 | 82.2 | 23 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 79% |
| stelo.AreaTargetingBot 1.1 | 19 | 95% |
| disan.Chair 2.2.0 | 18 | 83% |
| ntc.Opposite 1.5 | 17 | 82% |
| DBall.NUKE 0.1 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| donjezza.Muncho 1.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 22% | 53 |
| stelo.AreaTargetingBot 1.1 | 13 | 16% | 34 |
| ntc.Opposite 1.5 | 13 | 16% | 27 |
| pfvicm.Sobieski 7.2.3b | 13 | 16% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 24 |
| disan.Chair 2.2.0 | 11 | 13% | 19 |
| DBall.NUKE 0.1 | 2 | 2% | 20 |
| donjezza.Muncho 1.0 | 1 | 1% | 11 |
| pbg.R2D2 1.0 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 70.7 | 91 / 210 | 3.63 | 15.8% | 27266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.7 | 15.8% | 91 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.1% | 38 |
| oog.melee.Capulet 1.2 | 2.8 | 13.7% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 13.1% | 24 |
| yagami.Tidus 0.11 | 5.0 | 11.9% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 63.5 | 13 / 35 | 4302 |
| 2 | 1 | 65.5 | 75.6 | 13 / 35 | 4345 |
| 3 | 1 | 65.0 | 72.1 | 14 / 35 | 4690 |
| 4 | 3 | 62.3 | 61.9 | 13 / 35 | 4109 |
| 5 | 1 | 67.4 | 76.8 | 18 / 35 | 5055 |
| 6 | 1 | 65.9 | 74.6 | 20 / 35 | 4765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 93% |
| oog.melee.Capulet 1.2 | 28 | 54% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| yagami.Tidus 0.11 | 15 | 100% |
| ejb.Polaris 1.0.1 | 8 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 45% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 17% | 50 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 33 |
| yagami.Tidus 0.11 | 14 | 12% | 29 |
| step.nanoPri 1.0 | 6 | 5% | 8 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| kurios.DOSexe .9a | 2 | 2% | 3 |
| ejb.Polaris 1.0.1 | 1 | 1% | 10 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.9 | 127 / 210 | 2.80 | 17.6% | 27854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.6% | 127 |
| bzdp.Pansy 2.1 | 3.0 | 12.3% | 27 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 23 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 14 |
| ratosh.Nobo 0.21 | 4.2 | 11.4% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 3 |
| bayen.UbaMicro 1.4 | 7.0 | 8.3% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.9 | 23 / 35 | 4847 |
| 2 | 1 | 66.5 | 79.0 | 21 / 35 | 4748 |
| 3 | 1 | 65.2 | 74.6 | 19 / 35 | 4477 |
| 4 | 1 | 68.5 | 84.4 | 25 / 35 | 5229 |
| 5 | 1 | 66.9 | 84.8 | 22 / 35 | 4333 |
| 6 | 1 | 64.2 | 74.0 | 17 / 35 | 4220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 89% |
| wee.Gem 1.8.4 | 29 | 100% |
| wompi.Quokka 1.6 | 19 | 84% |
| ratosh.Nobo 0.21 | 18 | 78% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 24% | 61 |
| ratosh.Nobo 0.21 | 13 | 15% | 31 |
| wompi.Quokka 1.6 | 11 | 13% | 21 |
| maribo.FollowFire 1 | 11 | 13% | 11 |
| m3thos.Eva00 1.1 | 9 | 11% | 22 |
| wee.Gem 1.8.4 | 7 | 8% | 39 |
| bayen.UbaMicro 1.4 | 6 | 7% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.5 | 130 / 210 | 1.94 | 22.4% | 51610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.4% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 11 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.3 | 8.7% | 3 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.0 | 93.3 | 25 / 35 | 9069 |
| 2 | 1 | 72.9 | 86.0 | 18 / 35 | 8186 |
| 3 | 1 | 71.6 | 83.8 | 18 / 35 | 7851 |
| 4 | 1 | 74.3 | 89.5 | 20 / 35 | 9141 |
| 5 | 1 | 73.1 | 87.6 | 21 / 35 | 8186 |
| 6 | 1 | 75.7 | 96.8 | 28 / 35 | 9177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 139 | 76% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| ayk.WallHugger 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 46 | 57% | 155 |
| mz.NanoGod 2.02 | 23 | 28% | 37 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 11 |
| ayk.WallHugger 1.0 | 3 | 4% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.9 | 104 / 210 | 3.53 | 16.4% | 28913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.4% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 28 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.4% | 23 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.5% | 5 |
| conscience.Electron 1.3g | 7.3 | 7.9% | 2 |
| ap.Frederick 1.1 | 7.8 | 7.1% | 8 |
| dl.BetterWalls 1.0 | 9.0 | 6.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.5 | 17 / 35 | 4764 |
| 2 | 1 | 63.5 | 70.5 | 19 / 35 | 4205 |
| 3 | 1 | 61.0 | 59.7 | 13 / 35 | 4912 |
| 4 | 1 | 61.8 | 63.5 | 15 / 35 | 4473 |
| 5 | 1 | 66.4 | 78.4 | 18 / 35 | 5124 |
| 6 | 1 | 68.4 | 82.9 | 22 / 35 | 5435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| dummy.micro.Sparrow 2.5 | 20 | 70% |
| bvh.micro.Freya 0.3 | 19 | 74% |
| stelo.MirrorMicro 1.0 | 12 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 22 | 21% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 20 |
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 56 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 33 |
| conscience.Electron 1.3g | 12 | 11% | 14 |
| bvh.micro.Freya 0.3 | 7 | 7% | 20 |
| dl.BetterWalls 1.0 | 7 | 7% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 20 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 85.6 | 143 / 210 | 2.30 | 21.4% | 44268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.4% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.8% | 18 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.3% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.8% | 2 |
| dsw.StaticD 1.0 | 5.2 | 8.9% | 12 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 84.8 | 22 / 35 | 7658 |
| 2 | 1 | 73.6 | 92.1 | 28 / 35 | 7847 |
| 3 | 1 | 70.3 | 77.8 | 20 / 35 | 7275 |
| 4 | 1 | 70.1 | 83.5 | 19 / 35 | 6717 |
| 5 | 1 | 73.9 | 94.0 | 30 / 35 | 7790 |
| 6 | 1 | 70.4 | 81.6 | 24 / 35 | 6981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 57 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 52 | 88% |
| supersample.SuperBoxBot 1.0 | 18 | 89% |
| dsw.StaticD 1.0 | 12 | 42% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 31% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 21% | 56 |
| dsw.StaticD 1.0 | 12 | 18% | 25 |
| sul.Lunar 1.1 | 9 | 13% | 66 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 14 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 4 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 80.9 | 117 / 210 | 2.72 | 19.1% | 40899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.1% | 117 |
| radnor.DoctorBob 1.42 | 2.3 | 12.9% | 32 |
| mld.Wisdom 1.0 | 3.0 | 11.7% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.0% | 19 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.7% | 8 |
| amz.NanoClone 1.41 | 5.3 | 10.5% | 17 |
| sample.Walls 1.0 | 7.5 | 7.6% | 3 |
| GarmBox.Oranges 1.0 | 8.0 | 6.5% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.1 | 23 / 35 | 7574 |
| 2 | 1 | 68.3 | 81.6 | 17 / 35 | 6316 |
| 3 | 1 | 68.9 | 80.0 | 20 / 35 | 7005 |
| 4 | 1 | 69.5 | 81.0 | 21 / 35 | 7121 |
| 5 | 1 | 67.8 | 78.1 | 18 / 35 | 6667 |
| 6 | 1 | 66.6 | 73.7 | 18 / 35 | 6216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 88% |
| radnor.DoctorBob 1.42 | 33 | 76% |
| mld.Wisdom 1.0 | 16 | 94% |
| amz.NanoClone 1.41 | 16 | 69% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| sample.Walls 1.0 | 10 | 100% |
| jangs.ns51 1.0 | 8 | 88% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 26% | 52 |
| amz.NanoClone 1.41 | 20 | 22% | 28 |
| mld.Wisdom 1.0 | 16 | 17% | 32 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 13% | 50 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 2 | 2% | 12 |
| jangs.ns51 1.0 | 2 | 2% | 6 |

