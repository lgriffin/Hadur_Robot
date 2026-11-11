# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.2 | 87 / 210 | 2.70 | 18.5% | 39246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.2 | 18.5% | 87 |
| radnor.DoctorBob 1.42 | 1.8 | 16.2% | 58 |
| mz.AntiGrav 1.0 | 3.3 | 14.5% | 35 |
| mld.Infinity 2.2 | 3.7 | 13.2% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| sample.Walls 1.0 | 6.0 | 7.6% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 86.3 | 22 / 35 | 7083 |
| 2 | 1 | 69.1 | 81.0 | 13 / 35 | 6611 |
| 3 | 1 | 67.9 | 79.0 | 15 / 35 | 5991 |
| 4 | 1 | 69.3 | 84.4 | 13 / 35 | 6817 |
| 5 | 2 | 66.2 | 74.0 | 11 / 35 | 6018 |
| 6 | 1 | 69.1 | 82.2 | 13 / 35 | 6726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 28% |
| mld.Infinity 2.2 | 38 | 79% |
| mz.AntiGrav 1.0 | 30 | 80% |
| amz.NanoClone 1.41 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 64 | 52% | 84 |
| mz.AntiGrav 1.0 | 22 | 18% | 58 |
| mld.Infinity 2.2 | 18 | 15% | 20 |
| amz.NanoClone 1.41 | 12 | 10% | 19 |
| sample.Walls 1.0 | 3 | 2% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 9 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |

## Melee bench: F02

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 64.3 | 57 / 210 | 4.21 | 14.0% | 27456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.5 | 16.5% | 99 |
| hadur117.micro.SaorCC 0.1 | 2.0 | 14.0% | 57 |
| mld.DustBunny 3.8 | 2.5 | 14.5% | 26 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.1% | 5 |
| zyx.nano.Ant 1.1 | 5.8 | 9.4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.9% | 10 |
| fullsail.SweetTea 1.1 | 7.7 | 7.5% | 8 |
| bzdp.BoxCar 2.0 | 8.7 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.5 | 43.2 | 6 / 35 | 4328 |
| 2 | 1 | 63.3 | 74.3 | 14 / 35 | 4426 |
| 3 | 1 | 65.8 | 79.7 | 14 / 35 | 5191 |
| 4 | 2 | 61.4 | 69.5 | 9 / 35 | 4112 |
| 5 | 2 | 61.7 | 70.5 | 9 / 35 | 4410 |
| 6 | 3 | 57.0 | 48.6 | 5 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 47% |
| mld.DustBunny 3.8 | 26 | 77% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 5 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 50% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 154 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 36% | 81 |
| mld.DustBunny 3.8 | 32 | 21% | 51 |
| cs.Grudge 1.0 | 21 | 14% | 20 |
| maribo.melee.BMV 0.1 | 20 | 13% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5 | 3% | 10 |
| fullsail.SweetTea 1.1 | 5 | 3% | 8 |
| zyx.nano.Ant 1.1 | 5 | 3% | 5 |
| bzdp.BoxCar 2.0 | 5 | 3% | 5 |

## Melee bench: F03

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.1 | 83 / 210 | 3.15 | 16.9% | 32361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 16.9% | 83 |
| myl.micro.Troodon 1.10 | 2.3 | 14.3% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 13.2% | 45 |
| cb.nano.Insomnia 1.0 | 4.2 | 11.7% | 13 |
| myl.nano.KomoriNinja 1.1 | 4.5 | 11.4% | 10 |
| fm.mammillarias 1.3 | 6.2 | 8.9% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 5 |
| sample.Fire 1.0 | 9.3 | 4.5% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.9 | 16 / 35 | 5628 |
| 2 | 1 | 65.3 | 73.0 | 14 / 35 | 5404 |
| 3 | 1 | 66.0 | 77.8 | 13 / 35 | 5354 |
| 4 | 1 | 65.4 | 73.3 | 14 / 35 | 5326 |
| 5 | 1 | 65.5 | 74.9 | 12 / 35 | 5363 |
| 6 | 1 | 65.8 | 75.6 | 14 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 41 | 44% |
| myl.micro.Troodon 1.10 | 34 | 88% |
| cb.nano.Insomnia 1.0 | 22 | 82% |
| myl.nano.KomoriNinja 1.1 | 11 | 64% |
| sp.Nanos.Ember 1.1 | 5 | 60% |
| fm.mammillarias 1.3 | 4 | 50% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 33 | 26% | 40 |
| myl.micro.Troodon 1.10 | 30 | 24% | 68 |
| cb.nano.Insomnia 1.0 | 23 | 18% | 26 |
| fm.mammillarias 1.3 | 16 | 13% | 19 |
| myl.nano.KomoriNinja 1.1 | 14 | 11% | 30 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 11 |
| sample.Fire 1.0 | 3 | 2% | 7 |
| sp.Nanos.Ember 1.1 | 3 | 2% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.1 | 96 / 210 | 2.80 | 18.0% | 35447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 18.0% | 96 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.1% | 25 |
| tvv.micro.Antares 1.1.1 | 3.5 | 11.7% | 11 |
| stelo.SoJNanoMelee 1.1 | 3.7 | 11.3% | 36 |
| tj.zombie1n 1.0.1 | 5.5 | 9.7% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 9.1% | 3 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.0% | 8 |
| repositorio.NanoStep 1.0 | 9.0 | 5.9% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 14 / 35 | 5938 |
| 2 | 1 | 67.3 | 81.0 | 15 / 35 | 5977 |
| 3 | 1 | 67.9 | 81.9 | 17 / 35 | 6001 |
| 4 | 1 | 68.4 | 82.9 | 17 / 35 | 6159 |
| 5 | 1 | 67.5 | 80.6 | 17 / 35 | 5925 |
| 6 | 1 | 65.4 | 75.9 | 16 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 48 | 77% |
| stelo.SoJNanoMelee 1.1 | 40 | 65% |
| tj.zombie1n 1.0.1 | 22 | 45% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 50% |
| yk.JahMicro 1.0 | 5 | 60% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 23% | 70 |
| stelo.SoJNanoMelee 1.1 | 23 | 20% | 35 |
| tj.zombie1n 1.0.1 | 21 | 18% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 14 | 12% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 9% | 20 |
| yk.JahMicro 1.0 | 10 | 9% | 16 |
| tvv.micro.Antares 1.1.1 | 7 | 6% | 21 |
| repositorio.NanoStep 1.0 | 3 | 3% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.7 | 70 / 210 | 3.37 | 15.8% | 29881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.2 | 15.8% | 70 |
| ahf.NanoAndrew .4 | 2.7 | 12.8% | 46 |
| oog.melee.Corsair 1.0 | 2.8 | 12.7% | 33 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 12.2% | 27 |
| sam.Samspin 1.0 | 5.8 | 9.3% | 12 |
| EBBU.Sim2 1.02 | 6.3 | 9.4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 8.7% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 76.2 | 12 / 35 | 5506 |
| 2 | 1 | 64.6 | 77.1 | 13 / 35 | 5070 |
| 3 | 2 | 60.7 | 65.4 | 6 / 35 | 4840 |
| 4 | 1 | 64.0 | 73.7 | 16 / 35 | 4725 |
| 5 | 1 | 64.4 | 76.5 | 11 / 35 | 5158 |
| 6 | 1 | 62.9 | 73.3 | 12 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 84% |
| ahf.NanoAndrew .4 | 27 | 41% |
| oog.melee.Corsair 1.0 | 24 | 42% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sam.Samspin 1.0 | 6 | 67% |
| EBBU.Sim2 1.02 | 4 | 75% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 45 | 32% | 59 |
| oog.melee.Corsair 1.0 | 32 | 23% | 43 |
| EBBU.Sim2 1.02 | 16 | 11% | 19 |
| simonton.nano.MeleeSeed 1.8 | 11 | 8% | 40 |
| sam.Samspin 1.0 | 11 | 8% | 16 |
| robar.nano.Assertive_Melee 0.2 | 11 | 8% | 12 |
| zyx.nano.BacillusComma 1.0 | 6 | 4% | 8 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 68.5 | 69 / 210 | 3.83 | 14.7% | 26506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.9% | 59 |
| hadur117.micro.SaorCC 0.1 | 2.0 | 14.7% | 69 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.6% | 15 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 12.0% | 35 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.4% | 15 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.6% | 6 |
| fm.claire 1.7 | 7.0 | 8.1% | 0 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 7 |
| pa.Improved 1.0 | 9.2 | 5.6% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 60.3 | 9 / 35 | 4263 |
| 2 | 3 | 58.2 | 61.6 | 6 / 35 | 3949 |
| 3 | 1 | 63.2 | 72.7 | 15 / 35 | 4243 |
| 4 | 2 | 64.8 | 75.9 | 14 / 35 | 4721 |
| 5 | 1 | 64.9 | 75.6 | 16 / 35 | 4727 |
| 6 | 3 | 61.4 | 65.1 | 9 / 35 | 4603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 58% |
| oog.melee.CapuletDroid 1.1 | 31 | 65% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| arthord.NanoSatanMelee Beta | 9 | 67% |
| winamp32.micro.MicroMacro 1.0 | 6 | 17% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 35% | 76 |
| oog.melee.CapuletDroid 1.1 | 24 | 17% | 45 |
| gh.nano.Grofvuil 0.2 | 15 | 11% | 27 |
| winamp32.micro.MicroMacro 1.0 | 14 | 10% | 17 |
| fm.claire 1.7 | 13 | 9% | 14 |
| arthord.NanoSatanMelee Beta | 13 | 9% | 14 |
| sample.SpinBot 1.0 | 5 | 4% | 8 |
| kurios.DOSexe .9b | 5 | 4% | 7 |
| pa.Improved 1.0 | 3 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.2 | 72 / 210 | 2.87 | 17.0% | 32561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.2 | 17.0% | 72 |
| gh.micro.Gruweltje 0.7 | 2.0 | 16.0% | 62 |
| mz.MicroGodMelee 1 | 3.2 | 14.0% | 30 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.1% | 37 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.2 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.8 | 14 / 35 | 5363 |
| 2 | 1 | 68.4 | 86.7 | 13 / 35 | 5727 |
| 3 | 1 | 65.0 | 77.8 | 13 / 35 | 4799 |
| 4 | 2 | 62.5 | 68.9 | 8 / 35 | 5051 |
| 5 | 1 | 68.1 | 84.8 | 13 / 35 | 6131 |
| 6 | 1 | 66.0 | 79.4 | 11 / 35 | 5490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 46 | 67% |
| gh.micro.Gruweltje 0.7 | 39 | 21% |
| spinnercat.micro.Tyger 0.1 | 25 | 52% |
| DBall.Anarchy 0.1 | 16 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 139 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 62 | 45% | 72 |
| spinnercat.micro.Tyger 0.1 | 30 | 22% | 47 |
| mz.MicroGodMelee 1 | 27 | 19% | 52 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 10 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| acogdev.alpha 0.2 | 3 | 2% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 2 | 1% | 14 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.0 | 112 / 210 | 2.71 | 17.6% | 29931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 17.6% | 112 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.5% | 20 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 8.9% | 3 |
| germ.TheMind .2 | 5.3 | 9.1% | 8 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 2 |
| sample.Crazy 1.0 | 8.0 | 6.9% | 2 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.3 | 20 / 35 | 5260 |
| 2 | 1 | 65.6 | 75.9 | 19 / 35 | 4994 |
| 3 | 1 | 67.6 | 82.9 | 18 / 35 | 5234 |
| 4 | 1 | 65.9 | 76.8 | 20 / 35 | 4971 |
| 5 | 1 | 65.6 | 80.0 | 18 / 35 | 4533 |
| 6 | 1 | 66.5 | 81.9 | 17 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 81% |
| qualidafial.MajorDick 1.0.1 | 11 | 100% |
| awesomeness.Elite 1.0 | 8 | 88% |
| germ.TheMind .2 | 7 | 57% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 3 | 33% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 33 | 34% | 83 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 40 |
| awesomeness.Elite 1.0 | 16 | 16% | 32 |
| germ.TheMind .2 | 9 | 9% | 15 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.1 | 105 / 210 | 2.97 | 17.0% | 28008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 17.0% | 105 |
| rz.HawkOnFire 0.1 | 2.2 | 13.8% | 28 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.7% | 15 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 16 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.9% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.9% | 8 |
| stelo.PatternRobot 1.0 | 7.2 | 8.6% | 11 |
| ratosh.Wesco 1.4 | 7.8 | 8.3% | 6 |
| spinnercat.Omen 1.0 | 8.7 | 8.2% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 70.8 | 14 / 35 | 4196 |
| 2 | 1 | 68.4 | 85.4 | 22 / 35 | 4831 |
| 3 | 1 | 68.3 | 85.1 | 19 / 35 | 4983 |
| 4 | 1 | 67.0 | 81.0 | 17 / 35 | 4750 |
| 5 | 1 | 66.5 | 78.4 | 19 / 35 | 4713 |
| 6 | 1 | 63.3 | 67.9 | 14 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 86% |
| nz.jdc.nano.GridFu 1.0 | 36 | 89% |
| ratosh.Wesco 1.4 | 10 | 90% |
| stelo.PatternRobot 1.0 | 8 | 63% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| timmit.nano.TimDog 0.33 | 6 | 17% |
| maribo.IotaCT 1.1 | 6 | 67% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 31 | 29% | 67 |
| timmit.nano.TimDog 0.33 | 24 | 23% | 30 |
| nz.jdc.nano.GridFu 1.0 | 15 | 14% | 46 |
| maribo.IotaCT 1.1 | 12 | 11% | 25 |
| stelo.PatternRobot 1.0 | 10 | 9% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 8% | 10 |
| ratosh.Wesco 1.4 | 4 | 4% | 11 |
| spinnercat.Omen 1.0 | 2 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.9 | 153 / 210 | 1.90 | 20.3% | 37386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 20.3% | 153 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.9% | 14 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 11 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.4% | 8 |
| sanja.First 0.1 | 6.0 | 8.6% | 7 |
| amk.Punbot.Punbot 0.01 | 7.0 | 7.9% | 5 |
| cvt.Firsty 1.0 | 8.2 | 7.0% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.4% | 1 |
| sample.RamFire 1.0 | 9.7 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.9 | 27 / 35 | 6332 |
| 2 | 1 | 68.8 | 87.9 | 23 / 35 | 5693 |
| 3 | 1 | 70.8 | 92.1 | 27 / 35 | 6333 |
| 4 | 1 | 70.2 | 89.8 | 24 / 35 | 6559 |
| 5 | 1 | 69.9 | 89.8 | 26 / 35 | 6356 |
| 6 | 1 | 70.2 | 92.1 | 26 / 35 | 6113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 47 | 87% |
| tvv.nano.Polaris 1.2 | 38 | 84% |
| amk.Punbot.Punbot 0.01 | 22 | 86% |
| cvt.Firsty 1.0 | 21 | 81% |
| sanja.First 0.1 | 19 | 95% |
| zyx.micro.Ant 1.1 | 16 | 69% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Grystrion.TrackerWO 1.0 | 13 | 22% | 25 |
| zyx.micro.Ant 1.1 | 12 | 21% | 29 |
| baal.nano.N 1.42 | 9 | 16% | 52 |
| tvv.nano.Polaris 1.2 | 8 | 14% | 42 |
| cvt.Firsty 1.0 | 8 | 14% | 24 |
| sanja.First 0.1 | 3 | 5% | 22 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 9 |
| sample.RamFire 1.0 | 1 | 2% | 1 |

## Melee bench: F11

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 69.4 | 66 / 210 | 3.76 | 14.8% | 28303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 102 |
| hadur117.micro.SaorCC 0.1 | 2.0 | 14.8% | 66 |
| cs.Wren 1.0 | 3.0 | 13.1% | 15 |
| js.PinBall 1.6 | 4.3 | 11.1% | 7 |
| mz.Cork 0.1 | 4.8 | 10.7% | 6 |
| joe.ADinosaur 1.0 | 5.8 | 9.4% | 4 |
| evd.X1 0.01 | 7.5 | 6.6% | 1 |
| jsal.Jsalbot 1.0 | 7.5 | 6.6% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 63.8 | 8 / 35 | 4683 |
| 2 | 2 | 64.2 | 74.6 | 13 / 35 | 4831 |
| 3 | 2 | 62.3 | 70.2 | 8 / 35 | 4781 |
| 4 | 2 | 62.4 | 68.9 | 11 / 35 | 4376 |
| 5 | 2 | 61.7 | 66.3 | 12 / 35 | 4530 |
| 6 | 2 | 64.1 | 72.4 | 14 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 61 | 59% |
| cs.Wren 1.0 | 19 | 89% |
| mz.Cork 0.1 | 7 | 100% |
| js.PinBall 1.6 | 5 | 60% |
| joe.ADinosaur 1.0 | 4 | 50% |
| donjezza.Jezza 1.0 | 1 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 33% | 89 |
| cs.Wren 1.0 | 25 | 17% | 34 |
| joe.ADinosaur 1.0 | 25 | 17% | 26 |
| js.PinBall 1.6 | 20 | 14% | 21 |
| mz.Cork 0.1 | 12 | 8% | 21 |
| evd.X1 0.01 | 8 | 5% | 8 |
| PSW.Relentless 0.1 | 5 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.1 | 101 / 210 | 3.24 | 16.6% | 27178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 16.6% | 101 |
| stelo.AreaTargetingBot 1.1 | 2.3 | 12.9% | 31 |
| myl.nano.Graviton 1.10 | 3.7 | 11.4% | 25 |
| pfvicm.Sobieski 7.2.3b | 3.7 | 11.1% | 15 |
| ntc.Opposite 1.5 | 4.5 | 10.7% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 6.2 | 9.6% | 4 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 8 |
| DBall.NUKE 0.1 | 7.5 | 8.0% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.1 | 19 / 35 | 4737 |
| 2 | 1 | 66.2 | 80.0 | 16 / 35 | 4645 |
| 3 | 1 | 62.4 | 68.9 | 17 / 35 | 4111 |
| 4 | 1 | 64.7 | 75.2 | 17 / 35 | 4476 |
| 5 | 1 | 63.5 | 70.8 | 17 / 35 | 4277 |
| 6 | 1 | 66.0 | 78.4 | 15 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 79% |
| myl.nano.Graviton 1.10 | 25 | 88% |
| DBall.NUKE 0.1 | 16 | 94% |
| ntc.Opposite 1.5 | 13 | 69% |
| donjezza.Muncho 1.0 | 10 | 60% |
| disan.Chair 2.2.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 10 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 36 | 33% | 50 |
| stelo.AreaTargetingBot 1.1 | 21 | 19% | 41 |
| ntc.Opposite 1.5 | 18 | 16% | 27 |
| myl.nano.Graviton 1.10 | 13 | 12% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 6% | 18 |
| donjezza.Muncho 1.0 | 5 | 5% | 10 |
| DBall.NUKE 0.1 | 4 | 4% | 12 |
| pbg.R2D2 1.0 | 4 | 4% | 11 |
| disan.Chair 2.2.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 56.6 | 29 / 210 | 4.91 | 12.3% | 24476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.2 | 16.0% | 80 |
| kawigi.micro.Shiz 1.1 | 2.0 | 13.7% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 32 |
| hadur117.micro.SaorCC 0.1 | 4.3 | 12.3% | 29 |
| yagami.Tidus 0.11 | 4.8 | 11.4% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 11.2% | 11 |
| stelo.MirrorNano 1.3 | 7.0 | 8.4% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 57.5 | 5 / 35 | 4209 |
| 2 | 3 | 60.4 | 60.6 | 6 / 35 | 4287 |
| 3 | 5 | 58.8 | 58.4 | 6 / 35 | 3961 |
| 4 | 5 | 57.1 | 53.3 | 4 / 35 | 4010 |
| 5 | 5 | 57.1 | 54.0 | 2 / 35 | 4017 |
| 6 | 4 | 57.9 | 55.6 | 6 / 35 | 3992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 21 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 90% |
| kawigi.micro.Shiz 1.1 | 6 | 67% |
| yagami.Tidus 0.11 | 6 | 83% |
| ejb.Polaris 1.0.1 | 5 | 60% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 30% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 15% | 37 |
| yagami.Tidus 0.11 | 24 | 13% | 30 |
| kawigi.micro.Shiz 1.1 | 21 | 12% | 24 |
| stelo.MirrorNano 1.3 | 21 | 12% | 21 |
| ejb.Polaris 1.0.1 | 17 | 9% | 21 |
| step.nanoPri 1.0 | 10 | 6% | 10 |
| kurios.DOSexe .9a | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 67.9 | 78 / 210 | 3.89 | 14.5% | 24850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.2 | 14.5% | 78 |
| wee.Gem 1.8.4 | 2.3 | 12.9% | 42 |
| ratosh.Nobo 0.21 | 3.5 | 12.0% | 17 |
| bzdp.Pansy 2.1 | 3.7 | 12.0% | 28 |
| wompi.Quokka 1.6 | 4.5 | 11.5% | 25 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 10 |
| bayen.UbaMicro 1.4 | 6.5 | 9.5% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.3% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 73.3 | 14 / 35 | 4168 |
| 2 | 1 | 62.5 | 70.8 | 13 / 35 | 4381 |
| 3 | 2 | 60.2 | 63.8 | 13 / 35 | 3806 |
| 4 | 1 | 60.0 | 64.8 | 10 / 35 | 4190 |
| 5 | 1 | 61.9 | 70.2 | 12 / 35 | 4017 |
| 6 | 1 | 60.8 | 64.4 | 16 / 35 | 4288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 34 | 85% |
| bzdp.Pansy 2.1 | 31 | 74% |
| ratosh.Nobo 0.21 | 12 | 83% |
| wompi.Quokka 1.6 | 11 | 55% |
| m3thos.Eva00 1.1 | 8 | 63% |
| bayen.UbaMicro 1.4 | 6 | 17% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 22 | 17% | 51 |
| wompi.Quokka 1.6 | 20 | 15% | 25 |
| maribo.FollowFire 1 | 20 | 15% | 20 |
| ratosh.Nobo 0.21 | 19 | 14% | 25 |
| bzdp.Pansy 2.1 | 16 | 12% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 10% | 17 |
| bayen.UbaMicro 1.4 | 13 | 10% | 16 |
| m3thos.Eva00 1.1 | 6 | 5% | 11 |
| stelo.MyAgileRobot 0.2 | 4 | 3% | 5 |

## Melee bench: F15

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 72.8 | 43 / 210 | 3.45 | 16.5% | 38443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.4% | 133 |
| hadur117.micro.SaorCC 0.1 | 2.2 | 16.5% | 43 |
| mz.NanoGod 2.02 | 2.8 | 15.7% | 29 |
| ayk.WallHugger 1.0 | 4.0 | 10.9% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 0 |
| exauge.GateKeeper 1.1.121g | 5.7 | 9.2% | 4 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 76.2 | 9 / 35 | 6762 |
| 2 | 2 | 66.3 | 72.7 | 6 / 35 | 6264 |
| 3 | 2 | 66.9 | 76.8 | 5 / 35 | 6125 |
| 4 | 2 | 66.5 | 70.2 | 5 / 35 | 6661 |
| 5 | 2 | 67.4 | 72.7 | 13 / 35 | 6629 |
| 6 | 3 | 65.0 | 68.3 | 5 / 35 | 6002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 85 | 36% |
| mz.NanoGod 2.02 | 12 | 33% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 86 | 51% | 118 |
| mz.NanoGod 2.02 | 49 | 29% | 56 |
| ayk.WallHugger 1.0 | 14 | 8% | 16 |
| exauge.GateKeeper 1.1.121g | 11 | 7% | 11 |
| stuff.Vlad 0.1 | 4 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.5 | 85 / 210 | 3.83 | 15.6% | 30847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 15.6% | 85 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 2.8 | 12.5% | 39 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.8% | 22 |
| bvh.micro.Freya 0.3 | 4.7 | 11.4% | 22 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.7% | 4 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 4 |
| ap.Frederick 1.1 | 8.8 | 6.3% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.7 | 61.0 | 10 / 35 | 5190 |
| 2 | 1 | 63.5 | 68.9 | 15 / 35 | 5232 |
| 3 | 1 | 63.0 | 67.0 | 15 / 35 | 5016 |
| 4 | 1 | 63.1 | 66.0 | 17 / 35 | 5099 |
| 5 | 1 | 65.3 | 75.9 | 15 / 35 | 5187 |
| 6 | 1 | 63.7 | 72.4 | 13 / 35 | 5123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 32 | 72% |
| voidious.micro.BlitzBat 1.05 | 32 | 88% |
| dummy.micro.Sparrow 2.5 | 16 | 88% |
| bvh.micro.Freya 0.3 | 11 | 91% |
| ap.Frederick 1.1 | 6 | 83% |
| conscience.Electron 1.3g | 3 | 33% |
| dl.BetterWalls 1.0 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 16% | 44 |
| dummy.micro.Sparrow 2.5 | 20 | 16% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 14% | 44 |
| conscience.Electron 1.3g | 17 | 14% | 19 |
| stelo.MirrorMicro 1.0 | 13 | 10% | 19 |
| bvh.micro.Freya 0.3 | 12 | 10% | 22 |
| dl.BetterWalls 1.0 | 12 | 10% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 10% | 12 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.9 | 141 / 210 | 2.00 | 20.8% | 40994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 20.8% | 141 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.2% | 20 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.4% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 6 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.1% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.5% | 4 |
| sample.Corners 1.0 | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 22 / 35 | 6775 |
| 2 | 1 | 70.9 | 88.3 | 24 / 35 | 6700 |
| 3 | 1 | 72.2 | 92.7 | 26 / 35 | 6956 |
| 4 | 1 | 69.1 | 80.6 | 21 / 35 | 6799 |
| 5 | 1 | 71.7 | 92.4 | 25 / 35 | 6961 |
| 6 | 1 | 70.8 | 88.6 | 23 / 35 | 6803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 80% |
| sul.Lunar 1.1 | 42 | 98% |
| supersample.SuperBoxBot 1.0 | 24 | 63% |
| mme.NikeEnhanced 2.0 | 18 | 94% |
| dsw.StaticD 1.0 | 12 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 6 | 33% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 35% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 28% | 56 |
| sul.Lunar 1.1 | 7 | 10% | 55 |
| dsw.StaticD 1.0 | 6 | 8% | 20 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 13 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 8 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 12 |
| sample.Corners 1.0 | 2 | 3% | 3 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorCC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.4 | 104 / 210 | 2.49 | 18.3% | 35901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCC 0.1 | 1.0 | 18.3% | 104 |
| radnor.DoctorBob 1.42 | 2.2 | 14.6% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.8% | 25 |
| mld.Wisdom 1.0 | 3.7 | 12.0% | 10 |
| KiraNL.Chupacabra 0.4 | 5.2 | 9.5% | 3 |
| amz.NanoClone 1.41 | 6.0 | 9.1% | 6 |
| sample.Walls 1.0 | 6.8 | 8.1% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 17 / 35 | 6257 |
| 2 | 1 | 68.8 | 86.3 | 19 / 35 | 6234 |
| 3 | 1 | 68.4 | 84.1 | 18 / 35 | 6041 |
| 4 | 1 | 67.8 | 84.1 | 18 / 35 | 5829 |
| 5 | 1 | 67.1 | 79.4 | 16 / 35 | 5770 |
| 6 | 1 | 66.7 | 81.0 | 16 / 35 | 5770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 51 | 80% |
| radnor.DoctorBob 1.42 | 33 | 33% |
| mld.Wisdom 1.0 | 18 | 100% |
| sample.Walls 1.0 | 10 | 90% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 7 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 50% | 71 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 19% | 63 |
| amz.NanoClone 1.41 | 12 | 11% | 16 |
| mld.Wisdom 1.0 | 7 | 7% | 22 |
| KiraNL.Chupacabra 0.4 | 5 | 5% | 16 |
| sample.Walls 1.0 | 4 | 4% | 12 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 5 |

