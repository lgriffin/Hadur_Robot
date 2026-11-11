# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.8 | 155 / 210 | 1.92 | 21.6% | 42666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.6% | 155 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 21 |
| mld.Infinity 2.2 | 3.3 | 13.6% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 2 |
| sample.Walls 1.0 | 6.5 | 6.7% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 2 |
| sample.Target 1.0 | 9.3 | 3.8% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 92.7 | 27 / 35 | 7517 |
| 2 | 1 | 71.1 | 84.8 | 24 / 35 | 6575 |
| 3 | 1 | 71.1 | 86.0 | 25 / 35 | 6563 |
| 4 | 1 | 73.7 | 94.3 | 26 / 35 | 7885 |
| 5 | 1 | 72.9 | 90.5 | 26 / 35 | 7198 |
| 6 | 1 | 72.7 | 90.5 | 27 / 35 | 6928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 84 | 94% |
| mld.Infinity 2.2 | 37 | 95% |
| radnor.DoctorBob 1.42 | 23 | 83% |
| sample.Target 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 44% | 52 |
| mld.Infinity 2.2 | 12 | 22% | 48 |
| mz.AntiGrav 1.0 | 11 | 20% | 78 |
| amz.NanoClone 1.41 | 4 | 7% | 12 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.1 | 124 / 210 | 2.70 | 18.2% | 31772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.3 | 18.2% | 124 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 52 |
| mld.DustBunny 3.8 | 2.5 | 14.3% | 22 |
| maribo.melee.BMV 0.1 | 4.5 | 9.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.1% | 4 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.5% | 1 |
| bzdp.BoxCar 2.0 | 8.7 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 19 / 35 | 5428 |
| 2 | 1 | 69.0 | 89.2 | 25 / 35 | 5072 |
| 3 | 1 | 71.2 | 93.3 | 28 / 35 | 5994 |
| 4 | 3 | 59.4 | 51.7 | 9 / 35 | 5040 |
| 5 | 1 | 68.4 | 84.4 | 25 / 35 | 5092 |
| 6 | 1 | 67.2 | 79.4 | 18 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 67% |
| mld.DustBunny 3.8 | 55 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 100% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 31% | 71 |
| mld.DustBunny 3.8 | 26 | 30% | 70 |
| cs.Grudge 1.0 | 8 | 9% | 8 |
| fullsail.SweetTea 1.1 | 6 | 7% | 12 |
| maribo.melee.BMV 0.1 | 6 | 7% | 12 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 13 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 13 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 81.4 | 129 / 210 | 2.68 | 19.5% | 37444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.5% | 129 |
| myl.micro.Troodon 1.10 | 2.2 | 13.8% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.6% | 9 |
| fm.mammillarias 1.3 | 4.5 | 10.1% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 10.0% | 19 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 5 |
| sample.Fire 1.0 | 9.3 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 81.6 | 20 / 35 | 6495 |
| 2 | 1 | 68.2 | 79.7 | 19 / 35 | 5708 |
| 3 | 1 | 71.0 | 89.5 | 25 / 35 | 6678 |
| 4 | 1 | 68.9 | 79.4 | 22 / 35 | 6156 |
| 5 | 1 | 67.5 | 76.5 | 19 / 35 | 5729 |
| 6 | 1 | 70.3 | 81.6 | 24 / 35 | 6678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 88% |
| cb.nano.Insomnia 1.0 | 25 | 92% |
| sp.Nanos.Ember 1.1 | 16 | 88% |
| myl.nano.KomoriNinja 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 27% | 46 |
| cb.nano.Insomnia 1.0 | 16 | 20% | 19 |
| cs.sheldor.Talon 1.1 | 11 | 14% | 14 |
| myl.micro.Troodon 1.10 | 8 | 10% | 49 |
| fm.mammillarias 1.3 | 8 | 10% | 12 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 35 |
| sample.Tracker 1.0 | 5 | 6% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 20 |
| sample.Fire 1.0 | 2 | 2% | 10 |

## Melee bench: F04

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.0 | 156 / 210 | 2.08 | 21.2% | 41139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.2% | 156 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.4% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 13 |
| tj.zombie1n 1.0.1 | 5.5 | 8.9% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.3% | 6 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 95.2 | 29 / 35 | 7594 |
| 2 | 1 | 71.8 | 90.5 | 25 / 35 | 7048 |
| 3 | 1 | 69.9 | 83.2 | 24 / 35 | 6496 |
| 4 | 1 | 71.8 | 91.4 | 29 / 35 | 6685 |
| 5 | 1 | 70.3 | 84.4 | 25 / 35 | 6980 |
| 6 | 1 | 69.5 | 83.5 | 24 / 35 | 6336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 88% |
| stelo.SoJNanoMelee 1.1 | 44 | 86% |
| tj.zombie1n 1.0.1 | 24 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 82% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 43% | 87 |
| stelo.SoJNanoMelee 1.1 | 12 | 22% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 7 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 25 |
| sample.VelociRobot 1.0 | 3 | 6% | 8 |
| tj.zombie1n 1.0.1 | 2 | 4% | 9 |
| yk.JahMicro 1.0 | 2 | 4% | 8 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 66.9 | 96 / 210 | 3.98 | 15.4% | 28215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 15.4% | 96 |
| oog.melee.Corsair 1.0 | 2.5 | 12.7% | 35 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 26 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.0% | 21 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.0% | 6 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.0% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.9 | 60.6 | 11 / 35 | 4426 |
| 2 | 1 | 65.2 | 75.2 | 19 / 35 | 4946 |
| 3 | 1 | 61.8 | 65.7 | 17 / 35 | 4287 |
| 4 | 1 | 66.1 | 76.8 | 22 / 35 | 4800 |
| 5 | 1 | 60.7 | 60.6 | 14 / 35 | 4689 |
| 6 | 1 | 62.1 | 62.2 | 13 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 97% |
| oog.melee.Corsair 1.0 | 24 | 71% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 11 | 91% |
| EBBU.Sim2 1.02 | 11 | 91% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 346. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 52 |
| oog.melee.Corsair 1.0 | 18 | 16% | 36 |
| zyx.nano.BacillusComma 1.0 | 17 | 15% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 14% | 17 |
| EBBU.Sim2 1.02 | 14 | 12% | 20 |
| ahf.NanoAndrew .4 | 12 | 10% | 31 |
| sam.Samspin 1.0 | 8 | 7% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7 | 6% | 12 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.8 | 142 / 210 | 2.19 | 19.5% | 32833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.5% | 142 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 24 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.8% | 6 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 7 |
| fm.claire 1.7 | 6.2 | 8.5% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 2 |
| pa.Improved 1.0 | 9.3 | 5.5% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.3 | 23 / 35 | 5324 |
| 2 | 1 | 70.1 | 89.2 | 26 / 35 | 5797 |
| 3 | 1 | 71.1 | 95.9 | 27 / 35 | 5479 |
| 4 | 1 | 68.9 | 83.5 | 23 / 35 | 5544 |
| 5 | 1 | 67.9 | 83.8 | 20 / 35 | 5214 |
| 6 | 1 | 69.2 | 87.3 | 23 / 35 | 5475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 89% |
| oog.melee.CapuletDroid 1.1 | 38 | 100% |
| arthord.NanoSatanMelee Beta | 20 | 70% |
| gh.nano.Grofvuil 0.2 | 17 | 59% |
| sample.SpinBot 1.0 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 69 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 15 | 22% | 31 |
| d414.nano.Quantum 1.0.0 | 14 | 20% | 74 |
| oog.melee.CapuletDroid 1.1 | 13 | 19% | 49 |
| arthord.NanoSatanMelee Beta | 11 | 16% | 20 |
| winamp32.micro.MicroMacro 1.0 | 6 | 9% | 15 |
| kurios.DOSexe .9b | 4 | 6% | 7 |
| fm.claire 1.7 | 4 | 6% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 5 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.4 | 110 / 210 | 2.85 | 17.9% | 33465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.9% | 110 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 40 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.2% | 29 |
| mz.MicroGodMelee 1 | 3.8 | 12.3% | 19 |
| DBall.Anarchy 0.1 | 5.5 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.2% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.9% | 4 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.6 | 22 / 35 | 5935 |
| 2 | 1 | 68.5 | 83.2 | 16 / 35 | 5849 |
| 3 | 1 | 65.8 | 76.5 | 19 / 35 | 4795 |
| 4 | 1 | 66.8 | 78.7 | 16 / 35 | 5340 |
| 5 | 1 | 67.7 | 79.7 | 21 / 35 | 5717 |
| 6 | 1 | 66.7 | 76.8 | 16 / 35 | 5829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 55 | 85% |
| mz.MicroGodMelee 1 | 31 | 84% |
| gh.micro.Gruweltje 0.7 | 28 | 61% |
| el.JumpShoot 0.2 | 7 | 100% |
| DBall.Anarchy 0.1 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 34 | 34% | 55 |
| spinnercat.micro.Tyger 0.1 | 23 | 23% | 62 |
| mz.MicroGodMelee 1 | 14 | 14% | 45 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 9 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 11 |
| fire219.CatBot 1.0 | 5 | 5% | 6 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| DBall.Anarchy 0.1 | 4 | 4% | 11 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 80.1 | 133 / 210 | 2.79 | 18.4% | 32925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 18.4% | 133 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.4% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 16 |
| germ.TheMind .2 | 5.3 | 9.0% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 8.9% | 6 |
| awesomeness.Elite 1.0 | 5.7 | 8.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.5% | 2 |
| sample.Crazy 1.0 | 8.2 | 6.8% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 77.8 | 21 / 35 | 5483 |
| 2 | 1 | 68.1 | 83.5 | 21 / 35 | 5509 |
| 3 | 1 | 68.4 | 78.4 | 25 / 35 | 5653 |
| 4 | 1 | 68.0 | 80.0 | 22 / 35 | 5544 |
| 5 | 1 | 66.4 | 76.8 | 22 / 35 | 5173 |
| 6 | 1 | 68.4 | 84.1 | 22 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 95% |
| germ.TheMind .2 | 14 | 93% |
| awesomeness.Elite 1.0 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| sample.Crazy 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 32 | 42% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 21% | 40 |
| germ.TheMind .2 | 9 | 12% | 18 |
| qualidafial.MajorDick 1.0.1 | 8 | 10% | 10 |
| awesomeness.Elite 1.0 | 7 | 9% | 14 |
| stelo.UntouchableNano 1.3 | 2 | 3% | 8 |
| mym.EdgeStalker 1.0 | 2 | 3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 8 |

## Melee bench: F09

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.3 | 160 / 210 | 1.96 | 20.2% | 30486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.2% | 160 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 12 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 10 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 4 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.1% | 8 |
| ratosh.Wesco 1.4 | 7.3 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 2 |
| spinnercat.Omen 1.0 | 8.5 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.9 | 27 / 35 | 5043 |
| 2 | 1 | 71.2 | 90.5 | 28 / 35 | 5295 |
| 3 | 1 | 70.2 | 88.3 | 27 / 35 | 4904 |
| 4 | 1 | 70.3 | 87.3 | 24 / 35 | 5387 |
| 5 | 1 | 72.2 | 94.9 | 30 / 35 | 5445 |
| 6 | 1 | 68.9 | 86.0 | 24 / 35 | 4412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 78 | 95% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 16 | 100% |
| maribo.IotaCT 1.1 | 14 | 93% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| timmit.nano.TimDog 0.33 | 6 | 67% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 34% | 73 |
| timmit.nano.TimDog 0.33 | 11 | 22% | 15 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 12 |
| ratosh.Wesco 1.4 | 4 | 8% | 18 |
| stelo.PatternRobot 1.0 | 4 | 8% | 17 |
| maribo.IotaCT 1.1 | 3 | 6% | 16 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |

## Melee bench: F10

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.7 | 171 / 210 | 1.92 | 21.2% | 38982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.2% | 171 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.1% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.3% | 5 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 5.5 | 8.9% | 3 |
| sanja.First 0.1 | 5.8 | 9.0% | 2 |
| zyx.micro.Ant 1.1 | 5.8 | 8.6% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.1% | 0 |
| cvt.Firsty 1.0 | 8.8 | 6.7% | 7 |
| sample.RamFire 1.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 30 / 35 | 6528 |
| 2 | 1 | 71.5 | 87.9 | 30 / 35 | 6713 |
| 3 | 1 | 72.1 | 93.7 | 27 / 35 | 6859 |
| 4 | 1 | 70.6 | 88.6 | 28 / 35 | 6498 |
| 5 | 1 | 70.2 | 87.0 | 28 / 35 | 6196 |
| 6 | 1 | 70.9 | 89.2 | 28 / 35 | 6188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 35 | 86% |
| baal.nano.N 1.42 | 34 | 97% |
| sanja.First 0.1 | 30 | 100% |
| zyx.micro.Ant 1.1 | 22 | 95% |
| cvt.Firsty 1.0 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 12 | 31% | 59 |
| zyx.micro.Ant 1.1 | 8 | 21% | 35 |
| cvt.Firsty 1.0 | 8 | 21% | 22 |
| squidM.TentalceMeleeNano 1.1 | 3 | 8% | 12 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 8 |
| baal.nano.N 1.42 | 2 | 5% | 33 |
| sanja.First 0.1 | 1 | 3% | 31 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.9 | 77 / 210 | 3.89 | 15.4% | 30847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.2 | 15.4% | 77 |
| kc.micro.Figment 1.0 | 1.8 | 14.6% | 65 |
| cs.Wren 1.0 | 3.2 | 12.3% | 17 |
| mz.Cork 0.1 | 4.5 | 10.6% | 13 |
| js.PinBall 1.6 | 4.5 | 10.8% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 8 |
| evd.X1 0.01 | 7.0 | 8.5% | 8 |
| jsal.Jsalbot 1.0 | 8.2 | 7.1% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.9% | 3 |
| PSW.Relentless 0.1 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 63.2 | 9 / 35 | 5174 |
| 2 | 1 | 65.2 | 74.3 | 17 / 35 | 5233 |
| 3 | 1 | 63.3 | 67.0 | 11 / 35 | 5357 |
| 4 | 1 | 64.0 | 70.5 | 12 / 35 | 5531 |
| 5 | 2 | 60.8 | 60.3 | 13 / 35 | 4886 |
| 6 | 1 | 63.6 | 72.1 | 15 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 62% |
| cs.Wren 1.0 | 22 | 86% |
| js.PinBall 1.6 | 10 | 90% |
| mz.Cork 0.1 | 6 | 67% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 41% | 98 |
| evd.X1 0.01 | 15 | 11% | 17 |
| cs.Wren 1.0 | 14 | 11% | 25 |
| joe.ADinosaur 1.0 | 14 | 11% | 16 |
| mz.Cork 0.1 | 12 | 9% | 15 |
| js.PinBall 1.6 | 11 | 8% | 20 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| donjezza.Jezza 1.0 | 3 | 2% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.9 | 137 / 210 | 2.54 | 19.0% | 30147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.0% | 137 |
| myl.nano.Graviton 1.10 | 2.2 | 11.6% | 20 |
| ntc.Opposite 1.5 | 3.2 | 11.0% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.6% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.6% | 9 |
| disan.Chair 2.2.0 | 7.3 | 8.6% | 11 |
| DBall.NUKE 0.1 | 7.8 | 8.0% | 2 |
| donjezza.Muncho 1.0 | 9.0 | 6.4% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 80.6 | 23 / 35 | 5153 |
| 2 | 1 | 65.4 | 74.3 | 18 / 35 | 4588 |
| 3 | 1 | 68.8 | 82.5 | 21 / 35 | 5644 |
| 4 | 1 | 70.1 | 90.5 | 25 / 35 | 5046 |
| 5 | 1 | 67.4 | 81.6 | 23 / 35 | 4677 |
| 6 | 1 | 69.4 | 87.6 | 27 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 31 | 97% |
| myl.nano.Graviton 1.10 | 24 | 100% |
| disan.Chair 2.2.0 | 19 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 89% |
| donjezza.Muncho 1.0 | 17 | 94% |
| ntc.Opposite 1.5 | 14 | 86% |
| DBall.NUKE 0.1 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 29 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 21 |
| disan.Chair 2.2.0 | 12 | 16% | 23 |
| myl.nano.Graviton 1.10 | 11 | 15% | 35 |
| ntc.Opposite 1.5 | 11 | 15% | 21 |
| stelo.AreaTargetingBot 1.1 | 8 | 11% | 41 |
| DBall.NUKE 0.1 | 4 | 5% | 18 |
| pbg.R2D2 1.0 | 2 | 3% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 13 |

## Melee bench: F13

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.8 | 82 / 210 | 3.36 | 16.0% | 27132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 16.0% | 82 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 39 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 50 |
| yagami.Tidus 0.11 | 4.0 | 12.2% | 10 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.3% | 21 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 71.1 | 12 / 35 | 4174 |
| 2 | 1 | 66.1 | 74.3 | 18 / 35 | 5166 |
| 3 | 1 | 64.4 | 74.6 | 13 / 35 | 4491 |
| 4 | 1 | 64.7 | 75.9 | 13 / 35 | 4141 |
| 5 | 1 | 63.5 | 68.6 | 10 / 35 | 4524 |
| 6 | 1 | 66.7 | 78.4 | 16 / 35 | 4636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 46% |
| yagami.Tidus 0.11 | 28 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 67% |
| kawigi.micro.Shiz 1.1 | 18 | 100% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 41% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 37 |
| yagami.Tidus 0.11 | 20 | 16% | 36 |
| ejb.Polaris 1.0.1 | 11 | 9% | 20 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 7 | 5% | 7 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 25 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.1 | 146 / 210 | 2.52 | 18.5% | 28794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 18.5% | 146 |
| bzdp.Pansy 2.1 | 2.0 | 12.6% | 14 |
| wee.Gem 1.8.4 | 3.7 | 11.7% | 21 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 7 |
| ratosh.Nobo 0.21 | 5.0 | 10.5% | 7 |
| m3thos.Eva00 1.1 | 5.7 | 9.6% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.3% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.6% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.1 | 28 / 35 | 5136 |
| 2 | 1 | 67.4 | 85.7 | 25 / 35 | 4083 |
| 3 | 1 | 66.2 | 74.9 | 22 / 35 | 5204 |
| 4 | 1 | 66.9 | 79.4 | 24 / 35 | 4802 |
| 5 | 1 | 67.0 | 79.0 | 22 / 35 | 5049 |
| 6 | 1 | 68.4 | 88.6 | 25 / 35 | 4520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 97% |
| wee.Gem 1.8.4 | 46 | 98% |
| wompi.Quokka 1.6 | 17 | 94% |
| ratosh.Nobo 0.21 | 13 | 85% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 7 | 43% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 11 | 17% | 15 |
| wee.Gem 1.8.4 | 9 | 14% | 59 |
| stelo.MyAgileRobot 0.2 | 9 | 14% | 15 |
| maribo.FollowFire 1 | 9 | 14% | 10 |
| ratosh.Nobo 0.21 | 7 | 11% | 17 |
| bzdp.Pansy 2.1 | 6 | 9% | 56 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 9% | 8 |
| wompi.Quokka 1.6 | 5 | 8% | 23 |
| m3thos.Eva00 1.1 | 2 | 3% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 86.6 | 119 / 210 | 2.20 | 20.9% | 46224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.9% | 119 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 69 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 14 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.3% | 3 |
| ayk.WallHugger 1.0 | 4.8 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 87.3 | 20 / 35 | 7797 |
| 2 | 1 | 73.8 | 91.4 | 21 / 35 | 8877 |
| 3 | 1 | 70.2 | 83.8 | 18 / 35 | 6765 |
| 4 | 1 | 71.5 | 86.3 | 21 / 35 | 7301 |
| 5 | 1 | 72.0 | 87.0 | 18 / 35 | 7769 |
| 6 | 1 | 71.6 | 83.8 | 21 / 35 | 7715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 106 | 76% |
| mz.NanoGod 2.02 | 11 | 55% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| ayk.WallHugger 1.0 | 6 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stelo.PianistNano 1.2 | 6 | 67% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 47% | 131 |
| mz.NanoGod 2.02 | 24 | 26% | 34 |
| exauge.GateKeeper 1.1.121g | 9 | 10% | 16 |
| ayk.WallHugger 1.0 | 5 | 5% | 11 |
| drd.Dreadknoght 0.9 | 4 | 4% | 8 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| stelo.PianistNano 1.2 | 3 | 3% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.3 | 109 / 210 | 3.31 | 17.0% | 29798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.0% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 27 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.7% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.6% | 31 |
| bvh.micro.Freya 0.3 | 4.3 | 10.5% | 11 |
| conscience.Electron 1.3g | 6.5 | 8.2% | 0 |
| stelo.MirrorMicro 1.0 | 6.7 | 8.7% | 5 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 5 |
| ap.Frederick 1.1 | 9.0 | 6.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.2 | 15 / 35 | 4871 |
| 2 | 1 | 66.7 | 77.8 | 20 / 35 | 5207 |
| 3 | 1 | 64.5 | 72.1 | 17 / 35 | 4971 |
| 4 | 1 | 67.8 | 81.3 | 22 / 35 | 5074 |
| 5 | 1 | 63.4 | 69.5 | 15 / 35 | 4696 |
| 6 | 1 | 65.8 | 74.9 | 20 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 89% |
| dummy.micro.Sparrow 2.5 | 31 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 73% |
| bvh.micro.Freya 0.3 | 12 | 92% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 22% | 62 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 18% | 39 |
| dummy.micro.Sparrow 2.5 | 15 | 15% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 15 |
| conscience.Electron 1.3g | 12 | 12% | 15 |
| dl.BetterWalls 1.0 | 8 | 8% | 13 |
| bvh.micro.Freya 0.3 | 7 | 7% | 16 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 10 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 89.2 | 159 / 210 | 1.98 | 21.6% | 41481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.6% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.0% | 11 |
| supersample.SuperBoxBot 1.0 | 4.5 | 9.9% | 9 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 2 |
| sample.Corners 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 94.3 | 29 / 35 | 7248 |
| 2 | 1 | 72.2 | 88.3 | 27 / 35 | 7078 |
| 3 | 1 | 71.1 | 86.3 | 24 / 35 | 6677 |
| 4 | 1 | 71.0 | 85.4 | 24 / 35 | 6812 |
| 5 | 1 | 72.2 | 91.1 | 27 / 35 | 6907 |
| 6 | 1 | 71.7 | 89.5 | 28 / 35 | 6759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 95% |
| sul.Lunar 1.1 | 45 | 98% |
| supersample.SuperBoxBot 1.0 | 25 | 88% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| dsw.StaticD 1.0 | 7 | 57% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 29% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 22% | 63 |
| dsw.StaticD 1.0 | 9 | 18% | 18 |
| sul.Lunar 1.1 | 5 | 10% | 47 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 8% | 14 |
| sample.Corners 1.0 | 4 | 8% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 12 |

## Melee bench: F18

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.3 | 109 / 210 | 2.95 | 18.0% | 36724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.2 | 18.0% | 109 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 31 |
| mld.Wisdom 1.0 | 3.5 | 12.2% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.8% | 29 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 7 |
| amz.NanoClone 1.41 | 5.5 | 9.8% | 8 |
| sample.Walls 1.0 | 7.5 | 7.4% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.7% | 2 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 67.6 | 11 / 35 | 5349 |
| 2 | 1 | 67.0 | 78.7 | 18 / 35 | 6020 |
| 3 | 1 | 67.2 | 78.1 | 18 / 35 | 6135 |
| 4 | 1 | 67.1 | 77.8 | 20 / 35 | 6104 |
| 5 | 1 | 71.8 | 91.4 | 26 / 35 | 7223 |
| 6 | 1 | 66.8 | 76.2 | 16 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 78% |
| radnor.DoctorBob 1.42 | 38 | 84% |
| mld.Wisdom 1.0 | 16 | 63% |
| amz.NanoClone 1.41 | 10 | 70% |
| jangs.ns51 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 7 | 71% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 28% | 42 |
| radnor.DoctorBob 1.42 | 26 | 26% | 59 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 21% | 54 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 22 |
| amz.NanoClone 1.41 | 5 | 5% | 12 |
| sample.Walls 1.0 | 4 | 4% | 9 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 1 | 1% | 4 |

