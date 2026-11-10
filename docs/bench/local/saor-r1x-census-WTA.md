# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.3 | 160 / 210 | 1.87 | 21.9% | 44226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.9% | 160 |
| radnor.DoctorBob 1.42 | 2.3 | 14.1% | 21 |
| mld.Infinity 2.2 | 3.2 | 13.0% | 13 |
| mz.AntiGrav 1.0 | 3.5 | 13.2% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| sample.Walls 1.0 | 7.0 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.3 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 8.8 | 4.7% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.7 | 21 / 35 | 6741 |
| 2 | 1 | 72.3 | 87.6 | 28 / 35 | 7226 |
| 3 | 1 | 72.9 | 88.3 | 24 / 35 | 7768 |
| 4 | 1 | 74.2 | 98.1 | 31 / 35 | 7756 |
| 5 | 1 | 72.4 | 91.7 | 28 / 35 | 6986 |
| 6 | 1 | 73.2 | 90.5 | 28 / 35 | 7749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 97% |
| mld.Infinity 2.2 | 49 | 88% |
| radnor.DoctorBob 1.42 | 37 | 89% |
| amz.NanoClone 1.41 | 6 | 100% |
| arthord.MannyPacquiao Beta | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 44% | 72 |
| mld.Infinity 2.2 | 10 | 20% | 57 |
| mz.AntiGrav 1.0 | 10 | 20% | 57 |
| arthord.MannyPacquiao Beta | 2 | 4% | 6 |
| sample.Walls 1.0 | 2 | 4% | 6 |
| amz.NanoClone 1.41 | 2 | 4% | 6 |
| jangs.ns51 1.0 | 2 | 4% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.7 | 129 / 210 | 2.64 | 18.2% | 31464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 18.2% | 129 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.5% | 42 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 17 |
| maribo.melee.BMV 0.1 | 4.5 | 10.4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.4% | 9 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.8% | 4 |
| bzdp.BoxCar 2.0 | 7.2 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.3% | 4 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.3 | 25 / 35 | 5774 |
| 2 | 1 | 70.4 | 94.3 | 28 / 35 | 5317 |
| 3 | 1 | 68.0 | 83.5 | 22 / 35 | 5228 |
| 4 | 1 | 67.6 | 84.8 | 21 / 35 | 5063 |
| 5 | 2 | 59.7 | 52.4 | 12 / 35 | 4920 |
| 6 | 1 | 68.9 | 89.2 | 21 / 35 | 5162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 81% |
| mld.DustBunny 3.8 | 47 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 35% | 86 |
| mld.DustBunny 3.8 | 19 | 23% | 59 |
| cs.Grudge 1.0 | 12 | 15% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 14 |
| fullsail.SweetTea 1.1 | 5 | 6% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 15 |
| maribo.melee.BMV 0.1 | 4 | 5% | 11 |
| zyx.nano.Ant 1.1 | 3 | 4% | 5 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.0 | 136 / 210 | 2.26 | 20.5% | 38716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.5% | 136 |
| myl.micro.Troodon 1.10 | 2.2 | 13.2% | 26 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.3% | 20 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 10 |
| fm.mammillarias 1.3 | 5.5 | 9.4% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.3% | 7 |
| sample.Fire 1.0 | 9.2 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.0 | 23 / 35 | 6368 |
| 2 | 1 | 72.0 | 91.7 | 25 / 35 | 6612 |
| 3 | 1 | 70.0 | 85.1 | 19 / 35 | 6380 |
| 4 | 1 | 71.6 | 88.6 | 25 / 35 | 6661 |
| 5 | 1 | 70.6 | 86.0 | 23 / 35 | 6390 |
| 6 | 1 | 70.1 | 83.5 | 21 / 35 | 6305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 84% |
| cb.nano.Insomnia 1.0 | 25 | 100% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| sp.Nanos.Ember 1.1 | 14 | 79% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 60% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.KomoriNinja 1.1 | 15 | 20% | 40 |
| cb.nano.Insomnia 1.0 | 14 | 19% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 18% | 39 |
| myl.micro.Troodon 1.10 | 12 | 16% | 58 |
| fm.mammillarias 1.3 | 7 | 9% | 14 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 22 |
| sample.Fire 1.0 | 4 | 5% | 9 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 9 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.8 | 153 / 210 | 2.19 | 20.6% | 38928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.6% | 153 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 22 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.1% | 7 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.9% | 18 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.0% | 4 |
| yk.JahMicro 1.0 | 8.0 | 7.5% | 0 |
| repositorio.NanoStep 1.0 | 8.7 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.9 | 29 / 35 | 7049 |
| 2 | 1 | 70.3 | 87.6 | 22 / 35 | 6408 |
| 3 | 1 | 67.5 | 77.5 | 23 / 35 | 5828 |
| 4 | 1 | 70.3 | 86.7 | 26 / 35 | 6219 |
| 5 | 1 | 70.8 | 87.9 | 26 / 35 | 6648 |
| 6 | 1 | 71.0 | 86.3 | 27 / 35 | 6776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 85% |
| stelo.SoJNanoMelee 1.1 | 45 | 89% |
| tj.zombie1n 1.0.1 | 23 | 91% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 50% | 94 |
| stelo.SoJNanoMelee 1.1 | 12 | 21% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 5 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 16 |
| tj.zombie1n 1.0.1 | 3 | 5% | 6 |
| sample.VelociRobot 1.0 | 2 | 3% | 8 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 13 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 63.5 | 74 / 210 | 4.28 | 14.8% | 27397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 14.8% | 74 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 32 |
| ahf.NanoAndrew .4 | 3.3 | 11.9% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.8% | 32 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 19 |
| EBBU.Sim2 1.02 | 5.5 | 9.7% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.7% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 66.7 | 13 / 35 | 4907 |
| 2 | 1 | 60.7 | 57.5 | 14 / 35 | 4688 |
| 3 | 1 | 63.6 | 70.8 | 15 / 35 | 4483 |
| 4 | 1 | 58.0 | 56.2 | 9 / 35 | 4183 |
| 5 | 1 | 63.3 | 72.1 | 11 / 35 | 4697 |
| 6 | 1 | 60.2 | 58.1 | 12 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 77% |
| oog.melee.Corsair 1.0 | 28 | 57% |
| ahf.NanoAndrew .4 | 12 | 58% |
| zyx.nano.BacillusComma 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 8 | 88% |
| sam.Samspin 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| sample.TrackFire 1.0 | 3 | 67% |

Hadur died in 136 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 21% | 52 |
| simonton.nano.MeleeSeed 1.8 | 23 | 17% | 42 |
| robar.nano.Assertive_Melee 0.2 | 19 | 14% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 13% | 18 |
| ahf.NanoAndrew .4 | 16 | 12% | 25 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 14 |
| EBBU.Sim2 1.02 | 11 | 8% | 17 |
| sam.Samspin 1.0 | 4 | 3% | 10 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.6 | 146 / 210 | 2.02 | 19.8% | 33184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.8% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 31 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.8% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.5% | 3 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.6% | 4 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.0 | 7.2% | 1 |
| pa.Improved 1.0 | 9.2 | 5.6% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.3 | 24 / 35 | 5184 |
| 2 | 1 | 70.0 | 91.4 | 25 / 35 | 5222 |
| 3 | 1 | 70.3 | 90.5 | 25 / 35 | 5730 |
| 4 | 1 | 72.2 | 94.9 | 29 / 35 | 6416 |
| 5 | 1 | 68.9 | 86.7 | 22 / 35 | 5413 |
| 6 | 1 | 68.6 | 87.0 | 21 / 35 | 5219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 85% |
| oog.melee.CapuletDroid 1.1 | 34 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 87% |
| gh.nano.Grofvuil 0.2 | 13 | 85% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 31% | 87 |
| arthord.NanoSatanMelee Beta | 10 | 15% | 16 |
| gh.nano.Grofvuil 0.2 | 9 | 14% | 21 |
| oog.melee.CapuletDroid 1.1 | 7 | 11% | 46 |
| winamp32.micro.MicroMacro 1.0 | 6 | 9% | 11 |
| kurios.DOSexe .9b | 4 | 6% | 10 |
| fm.claire 1.7 | 4 | 6% | 6 |
| sample.SpinBot 1.0 | 3 | 5% | 6 |
| pa.Improved 1.0 | 2 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.3 | 115 / 210 | 2.50 | 18.7% | 34293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.7% | 115 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.5% | 25 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 28 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.7% | 35 |
| DBall.Anarchy 0.1 | 5.5 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.6% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 1 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 80.6 | 19 / 35 | 6249 |
| 2 | 1 | 68.5 | 85.7 | 18 / 35 | 5419 |
| 3 | 1 | 66.7 | 76.5 | 16 / 35 | 5724 |
| 4 | 1 | 68.1 | 83.5 | 16 / 35 | 5732 |
| 5 | 1 | 69.7 | 86.7 | 23 / 35 | 5630 |
| 6 | 1 | 68.9 | 86.7 | 23 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 86% |
| mz.MicroGodMelee 1 | 43 | 72% |
| gh.micro.Gruweltje 0.7 | 24 | 79% |
| DBall.Anarchy 0.1 | 10 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 27 | 28% | 57 |
| gh.micro.Gruweltje 0.7 | 22 | 23% | 50 |
| spinnercat.micro.Tyger 0.1 | 21 | 22% | 62 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 9 |
| acogdev.alpha 0.2 | 6 | 6% | 8 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 12 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 67.9 | 100 / 210 | 3.89 | 15.9% | 29380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 15.9% | 100 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.7% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 32 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.9% | 9 |
| germ.TheMind .2 | 5.3 | 9.9% | 8 |
| awesomeness.Elite 1.0 | 5.8 | 8.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.7% | 5 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.2% | 0 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 66.3 | 18 / 35 | 4940 |
| 2 | 2 | 59.7 | 56.8 | 11 / 35 | 4772 |
| 3 | 1 | 66.3 | 77.8 | 19 / 35 | 5072 |
| 4 | 1 | 65.2 | 73.0 | 19 / 35 | 4840 |
| 5 | 1 | 64.0 | 70.5 | 16 / 35 | 4767 |
| 6 | 1 | 62.6 | 63.2 | 17 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 83% |
| germ.TheMind .2 | 10 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 391. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 45% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 16% | 32 |
| germ.TheMind .2 | 15 | 14% | 25 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 13 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 7 |
| awesomeness.Elite 1.0 | 5 | 5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 10 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.0 | 174 / 210 | 1.63 | 21.2% | 32463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.2% | 174 |
| rz.HawkOnFire 0.1 | 2.0 | 13.1% | 9 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.7% | 6 |
| maribo.IotaCT 1.1 | 3.8 | 10.8% | 3 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 8.7 | 7.3% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.2 | 30 / 35 | 5520 |
| 2 | 1 | 72.3 | 93.7 | 31 / 35 | 5557 |
| 3 | 1 | 70.8 | 89.8 | 26 / 35 | 5416 |
| 4 | 1 | 72.3 | 94.6 | 31 / 35 | 5409 |
| 5 | 1 | 70.0 | 87.6 | 26 / 35 | 5079 |
| 6 | 1 | 72.6 | 95.9 | 30 / 35 | 5482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 98% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| maribo.IotaCT 1.1 | 17 | 94% |
| stelo.PatternRobot 1.0 | 14 | 79% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 8 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |

Hadur died in 36 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 10 | 28% | 76 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 14% | 15 |
| stelo.PatternRobot 1.0 | 5 | 14% | 14 |
| ratosh.Wesco 1.4 | 5 | 14% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4 | 11% | 46 |
| maribo.IotaCT 1.1 | 3 | 8% | 21 |
| timmit.nano.TimDog 0.33 | 3 | 8% | 16 |
| spinnercat.Omen 1.0 | 1 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.2 | 175 / 210 | 1.61 | 21.8% | 39657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.8% | 175 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.4% | 9 |
| baal.nano.N 1.42 | 2.8 | 11.3% | 5 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 9.4% | 7 |
| sanja.First 0.1 | 6.5 | 8.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.5% | 6 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.6 | 31 / 35 | 6552 |
| 2 | 1 | 71.8 | 93.7 | 28 / 35 | 6408 |
| 3 | 1 | 71.8 | 92.4 | 29 / 35 | 6642 |
| 4 | 1 | 72.9 | 97.1 | 33 / 35 | 6869 |
| 5 | 1 | 70.4 | 87.0 | 25 / 35 | 6457 |
| 6 | 1 | 72.2 | 94.6 | 29 / 35 | 6729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 97% |
| baal.nano.N 1.42 | 32 | 94% |
| cvt.Firsty 1.0 | 29 | 93% |
| zyx.micro.Ant 1.1 | 26 | 92% |
| amk.Punbot.Punbot 0.01 | 21 | 100% |
| sanja.First 0.1 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 60% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 20% | 39 |
| tvv.nano.Polaris 1.2 | 6 | 17% | 57 |
| baal.nano.N 1.42 | 5 | 14% | 40 |
| sanja.First 0.1 | 5 | 14% | 22 |
| Grystrion.TrackerWO 1.0 | 4 | 11% | 9 |
| cvt.Firsty 1.0 | 3 | 9% | 24 |
| squidM.TentalceMeleeNano 1.1 | 3 | 9% | 7 |
| sample.RamFire 1.0 | 2 | 6% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 8 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.0 | 84 / 210 | 3.43 | 16.3% | 32333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.3% | 84 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 64 |
| cs.Wren 1.0 | 3.0 | 12.6% | 24 |
| mz.Cork 0.1 | 4.2 | 11.3% | 15 |
| js.PinBall 1.6 | 4.8 | 10.3% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 5 |
| evd.X1 0.01 | 7.2 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.6% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 64.8 | 12 / 35 | 5105 |
| 2 | 1 | 63.0 | 68.9 | 16 / 35 | 4825 |
| 3 | 1 | 66.2 | 77.8 | 13 / 35 | 5640 |
| 4 | 1 | 66.7 | 79.4 | 15 / 35 | 5590 |
| 5 | 1 | 64.4 | 70.5 | 12 / 35 | 5619 |
| 6 | 1 | 66.1 | 76.8 | 16 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 65% |
| cs.Wren 1.0 | 26 | 85% |
| mz.Cork 0.1 | 8 | 100% |
| js.PinBall 1.6 | 6 | 67% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 0% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 41% | 98 |
| cs.Wren 1.0 | 18 | 14% | 33 |
| js.PinBall 1.6 | 14 | 11% | 16 |
| joe.ADinosaur 1.0 | 13 | 10% | 14 |
| PSW.Relentless 0.1 | 10 | 8% | 11 |
| evd.X1 0.01 | 9 | 7% | 9 |
| mz.Cork 0.1 | 8 | 6% | 19 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.7 | 137 / 210 | 2.47 | 19.0% | 29787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.0% | 137 |
| myl.nano.Graviton 1.10 | 2.7 | 11.4% | 18 |
| ntc.Opposite 1.5 | 3.2 | 11.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.4% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 7 |
| DBall.NUKE 0.1 | 7.0 | 8.3% | 5 |
| disan.Chair 2.2.0 | 7.7 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 7 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 27 / 35 | 5495 |
| 2 | 1 | 68.5 | 86.0 | 22 / 35 | 4918 |
| 3 | 1 | 67.5 | 79.7 | 24 / 35 | 4881 |
| 4 | 1 | 67.2 | 78.1 | 21 / 35 | 4953 |
| 5 | 1 | 68.0 | 84.4 | 20 / 35 | 4924 |
| 6 | 1 | 67.3 | 81.3 | 23 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 97% |
| stelo.AreaTargetingBot 1.1 | 28 | 93% |
| donjezza.Muncho 1.0 | 18 | 83% |
| ntc.Opposite 1.5 | 18 | 78% |
| DBall.NUKE 0.1 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| disan.Chair 2.2.0 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 17 | 22% | 31 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 16% | 26 |
| myl.nano.Graviton 1.10 | 10 | 13% | 37 |
| stelo.AreaTargetingBot 1.1 | 9 | 12% | 32 |
| donjezza.Muncho 1.0 | 6 | 8% | 18 |
| DBall.NUKE 0.1 | 3 | 4% | 18 |
| disan.Chair 2.2.0 | 3 | 4% | 16 |
| pbg.R2D2 1.0 | 3 | 4% | 11 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.0 | 79 / 210 | 3.43 | 15.8% | 26302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 15.8% | 79 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 37 |
| oog.melee.Capulet 1.2 | 3.3 | 13.5% | 49 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.1% | 26 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 70.8 | 16 / 35 | 4244 |
| 2 | 1 | 62.4 | 67.0 | 8 / 35 | 4345 |
| 3 | 1 | 65.7 | 74.9 | 15 / 35 | 4701 |
| 4 | 1 | 65.4 | 77.1 | 15 / 35 | 4285 |
| 5 | 1 | 66.6 | 77.8 | 16 / 35 | 4797 |
| 6 | 1 | 63.2 | 70.5 | 9 / 35 | 3930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 60% |
| yagami.Tidus 0.11 | 24 | 88% |
| oog.melee.Capulet 1.2 | 24 | 63% |
| kawigi.micro.Shiz 1.1 | 23 | 91% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 35% | 62 |
| yagami.Tidus 0.11 | 23 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 38 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 34 |
| kurios.DOSexe .9a | 10 | 8% | 10 |
| ejb.Polaris 1.0.1 | 7 | 5% | 19 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.8 | 123 / 210 | 2.90 | 17.4% | 27422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.4% | 123 |
| bzdp.Pansy 2.1 | 2.2 | 12.6% | 17 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 26 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 12 |
| wompi.Quokka 1.6 | 4.5 | 10.8% | 14 |
| bayen.UbaMicro 1.4 | 6.5 | 9.3% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 9.4% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 71.7 | 17 / 35 | 4249 |
| 2 | 1 | 64.9 | 76.5 | 19 / 35 | 4201 |
| 3 | 1 | 66.7 | 80.0 | 22 / 35 | 4719 |
| 4 | 1 | 65.8 | 78.4 | 19 / 35 | 4539 |
| 5 | 1 | 67.3 | 81.9 | 23 / 35 | 4725 |
| 6 | 1 | 68.2 | 84.4 | 23 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 94% |
| wee.Gem 1.8.4 | 34 | 97% |
| wompi.Quokka 1.6 | 17 | 82% |
| ratosh.Nobo 0.21 | 13 | 62% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| m3thos.Eva00 1.1 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 18% | 24 |
| maribo.FollowFire 1 | 14 | 16% | 16 |
| wee.Gem 1.8.4 | 11 | 13% | 54 |
| m3thos.Eva00 1.1 | 9 | 10% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 15 |
| bayen.UbaMicro 1.4 | 9 | 10% | 10 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 9 |
| bzdp.Pansy 2.1 | 6 | 7% | 49 |
| wompi.Quokka 1.6 | 6 | 7% | 16 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 87.8 | 129 / 210 | 2.10 | 21.2% | 46460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.2% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 13 |
| ayk.WallHugger 1.0 | 4.5 | 9.6% | 3 |
| exauge.GateKeeper 1.1.121g | 5.2 | 8.9% | 1 |
| stuff.Vlad 0.1 | 5.3 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 94.9 | 25 / 35 | 8555 |
| 2 | 1 | 73.6 | 93.0 | 23 / 35 | 8323 |
| 3 | 1 | 70.6 | 82.2 | 23 / 35 | 6908 |
| 4 | 1 | 71.5 | 86.0 | 19 / 35 | 7561 |
| 5 | 1 | 70.7 | 81.9 | 20 / 35 | 7057 |
| 6 | 1 | 72.9 | 88.9 | 19 / 35 | 8056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 78% |
| mz.NanoGod 2.02 | 17 | 53% |
| ayk.WallHugger 1.0 | 13 | 92% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| stuff.Vlad 0.1 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 48% | 132 |
| mz.NanoGod 2.02 | 21 | 26% | 36 |
| ayk.WallHugger 1.0 | 8 | 10% | 18 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 11 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| stuff.Vlad 0.1 | 3 | 4% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.3 | 103 / 210 | 3.40 | 16.8% | 29337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.8% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.7 | 11.1% | 24 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 22 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 14 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.8% | 7 |
| conscience.Electron 1.3g | 7.2 | 7.7% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.1% | 9 |
| dl.BetterWalls 1.0 | 8.5 | 7.0% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.2 | 19 / 35 | 4996 |
| 2 | 1 | 64.4 | 72.1 | 14 / 35 | 4797 |
| 3 | 1 | 65.2 | 74.6 | 16 / 35 | 4748 |
| 4 | 1 | 64.6 | 69.2 | 20 / 35 | 4846 |
| 5 | 1 | 63.4 | 67.3 | 14 / 35 | 4909 |
| 6 | 1 | 67.2 | 80.3 | 20 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 79% |
| dummy.micro.Sparrow 2.5 | 27 | 89% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 19% | 47 |
| dummy.micro.Sparrow 2.5 | 20 | 19% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 14% | 43 |
| conscience.Electron 1.3g | 11 | 10% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 12 |
| bvh.micro.Freya 0.3 | 10 | 9% | 20 |
| stelo.MirrorMicro 1.0 | 10 | 9% | 17 |
| dl.BetterWalls 1.0 | 10 | 9% | 16 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.8 | 151 / 210 | 2.10 | 21.4% | 41503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.4% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.8% | 21 |
| sul.Lunar 1.1 | 3.0 | 11.9% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 2 |
| dsw.StaticD 1.0 | 6.2 | 8.3% | 7 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.5% | 2 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.9% | 5 |
| sample.Corners 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.5 | 24 / 35 | 6421 |
| 2 | 1 | 73.6 | 94.6 | 27 / 35 | 7405 |
| 3 | 1 | 72.5 | 89.5 | 26 / 35 | 7599 |
| 4 | 1 | 70.4 | 81.9 | 24 / 35 | 6792 |
| 5 | 1 | 70.3 | 83.8 | 25 / 35 | 6287 |
| 6 | 1 | 71.7 | 87.3 | 25 / 35 | 6999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 89% |
| supersample.SuperBoxBot 1.0 | 24 | 83% |
| dsw.StaticD 1.0 | 12 | 58% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 35% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 32% | 59 |
| dsw.StaticD 1.0 | 8 | 13% | 20 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 12 |
| sample.MyFirstRobot 1.0 | 4 | 7% | 10 |
| sul.Lunar 1.1 | 3 | 5% | 57 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.1 | 116 / 210 | 2.70 | 18.9% | 39556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.9% | 116 |
| radnor.DoctorBob 1.42 | 2.2 | 13.5% | 31 |
| mld.Wisdom 1.0 | 3.3 | 11.5% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.5% | 17 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.4% | 2 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 13 |
| sample.Walls 1.0 | 7.3 | 7.7% | 8 |
| GarmBox.Oranges 1.0 | 7.7 | 7.2% | 1 |
| jangs.ns51 1.0 | 9.0 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 84.1 | 21 / 35 | 6591 |
| 2 | 1 | 67.4 | 76.8 | 17 / 35 | 6608 |
| 3 | 1 | 68.1 | 80.6 | 18 / 35 | 6489 |
| 4 | 1 | 68.6 | 81.9 | 21 / 35 | 6463 |
| 5 | 1 | 70.5 | 87.6 | 22 / 35 | 7065 |
| 6 | 1 | 66.8 | 75.6 | 17 / 35 | 6340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 88% |
| radnor.DoctorBob 1.42 | 40 | 78% |
| amz.NanoClone 1.41 | 15 | 60% |
| mld.Wisdom 1.0 | 15 | 80% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 33% | 67 |
| mld.Wisdom 1.0 | 18 | 19% | 36 |
| amz.NanoClone 1.41 | 14 | 15% | 19 |
| KiraNL.Chupacabra 0.4 | 10 | 11% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 10% | 43 |
| sample.Walls 1.0 | 6 | 6% | 13 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

