# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 82.8 | 119 / 210 | 2.55 | 19.1% | 39052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 19.1% | 119 |
| mz.AntiGrav 1.0 | 2.5 | 14.5% | 27 |
| radnor.DoctorBob 1.42 | 2.8 | 14.4% | 34 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 8 |
| sample.Walls 1.0 | 6.0 | 8.0% | 5 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.4% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 79.4 | 18 / 35 | 6447 |
| 2 | 1 | 71.3 | 87.9 | 23 / 35 | 7074 |
| 3 | 1 | 71.1 | 90.2 | 22 / 35 | 6554 |
| 4 | 1 | 67.5 | 77.5 | 17 / 35 | 6069 |
| 5 | 1 | 68.5 | 77.5 | 21 / 35 | 6336 |
| 6 | 1 | 69.6 | 84.1 | 18 / 35 | 6572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 51 | 86% |
| radnor.DoctorBob 1.42 | 39 | 67% |
| mld.Infinity 2.2 | 33 | 97% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 36% | 59 |
| mz.AntiGrav 1.0 | 16 | 17% | 60 |
| amz.NanoClone 1.41 | 16 | 17% | 20 |
| sample.Walls 1.0 | 14 | 15% | 20 |
| mld.Infinity 2.2 | 6 | 7% | 33 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.3 | 96 / 210 | 2.77 | 17.0% | 29988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.3 | 17.0% | 96 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.9% | 59 |
| mld.DustBunny 3.8 | 2.7 | 14.1% | 25 |
| maribo.melee.BMV 0.1 | 4.3 | 10.4% | 5 |
| zyx.nano.Ant 1.1 | 5.3 | 9.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.4% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.4% | 7 |
| bzdp.BoxCar 2.0 | 7.5 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.8 | 6.0% | 3 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.5 | 18 / 35 | 5796 |
| 2 | 1 | 64.6 | 78.1 | 15 / 35 | 4905 |
| 3 | 1 | 66.7 | 82.9 | 16 / 35 | 5033 |
| 4 | 1 | 67.6 | 87.6 | 20 / 35 | 4790 |
| 5 | 3 | 58.7 | 57.5 | 7 / 35 | 4605 |
| 6 | 1 | 67.4 | 86.3 | 20 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 49 | 69% |
| mld.DustBunny 3.8 | 43 | 79% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| zyx.nano.Ant 1.1 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |

Hadur died in 114 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 41 | 36% | 74 |
| oog.melee.Mercutio 1.0 | 26 | 23% | 60 |
| zyx.nano.Ant 1.1 | 14 | 12% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 5% | 9 |
| bzdp.BoxCar 2.0 | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 6 | 5% | 8 |
| cs.Grudge 1.0 | 6 | 5% | 6 |
| maribo.melee.BMV 0.1 | 5 | 4% | 10 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 16 |

## Melee bench: F03

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.6 | 89 / 210 | 3.29 | 16.7% | 31455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.2 | 16.7% | 89 |
| myl.micro.Troodon 1.10 | 1.8 | 15.3% | 55 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 13.2% | 29 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 11.3% | 9 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 8 |
| fm.mammillarias 1.3 | 5.8 | 9.0% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 8 |
| sample.Fire 1.0 | 8.8 | 4.9% | 3 |
| sample.Tracker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 69.2 | 16 / 35 | 4951 |
| 2 | 1 | 65.6 | 76.2 | 16 / 35 | 5026 |
| 3 | 1 | 67.6 | 80.0 | 17 / 35 | 5625 |
| 4 | 2 | 62.9 | 69.5 | 9 / 35 | 4943 |
| 5 | 1 | 65.5 | 74.9 | 16 / 35 | 4889 |
| 6 | 1 | 67.4 | 77.8 | 15 / 35 | 6021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 43 | 77% |
| myl.micro.Troodon 1.10 | 37 | 86% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| myl.nano.KomoriNinja 1.1 | 8 | 88% |
| cb.nano.Insomnia 1.0 | 8 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 35% | 76 |
| stelo.SoRobotNanoMelee 1.2 | 36 | 30% | 58 |
| cb.nano.Insomnia 1.0 | 14 | 12% | 15 |
| fm.mammillarias 1.3 | 12 | 10% | 13 |
| myl.nano.KomoriNinja 1.1 | 10 | 8% | 26 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 12 |
| sample.Fire 1.0 | 2 | 2% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.5 | 108 / 210 | 2.67 | 18.1% | 34337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.2 | 18.1% | 108 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.6% | 24 |
| tvv.micro.Antares 1.1.1 | 3.3 | 11.2% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.0 | 10.8% | 31 |
| tj.zombie1n 1.0.1 | 5.0 | 9.5% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 9.0% | 2 |
| yk.JahMicro 1.0 | 7.2 | 8.1% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 8 |
| repositorio.NanoStep 1.0 | 9.2 | 6.1% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 22 / 35 | 6412 |
| 2 | 1 | 68.6 | 83.8 | 19 / 35 | 6189 |
| 3 | 1 | 65.9 | 75.6 | 16 / 35 | 5806 |
| 4 | 1 | 68.8 | 88.6 | 20 / 35 | 5500 |
| 5 | 1 | 67.6 | 85.1 | 17 / 35 | 5588 |
| 6 | 2 | 62.4 | 68.3 | 14 / 35 | 4842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 85% |
| stelo.SoJNanoMelee 1.1 | 39 | 74% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 79% |
| tvv.micro.Antares 1.1.1 | 13 | 85% |
| yk.JahMicro 1.0 | 10 | 70% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 48 | 47% | 92 |
| stelo.SoJNanoMelee 1.1 | 24 | 24% | 42 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 9% | 11 |
| tj.zombie1n 1.0.1 | 6 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 19 |
| tvv.micro.Antares 1.1.1 | 4 | 4% | 14 |
| yk.JahMicro 1.0 | 4 | 4% | 8 |
| sample.VelociRobot 1.0 | 2 | 2% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 7 |

## Melee bench: F05

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.5 | 93 / 210 | 2.84 | 16.9% | 30158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 16.9% | 93 |
| oog.melee.Corsair 1.0 | 2.5 | 12.3% | 25 |
| simonton.nano.MeleeSeed 1.8 | 2.7 | 12.4% | 37 |
| ahf.NanoAndrew .4 | 4.0 | 11.3% | 27 |
| sam.Samspin 1.0 | 5.5 | 9.6% | 13 |
| EBBU.Sim2 1.02 | 6.2 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.6% | 3 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.3% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.3 | 19 / 35 | 5313 |
| 2 | 1 | 66.8 | 81.9 | 16 / 35 | 5579 |
| 3 | 1 | 64.7 | 78.7 | 13 / 35 | 4888 |
| 4 | 1 | 64.9 | 80.6 | 15 / 35 | 4763 |
| 5 | 1 | 63.9 | 75.9 | 14 / 35 | 4729 |
| 6 | 1 | 65.6 | 79.7 | 16 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 79% |
| oog.melee.Corsair 1.0 | 31 | 71% |
| ahf.NanoAndrew .4 | 21 | 67% |
| sam.Samspin 1.0 | 14 | 86% |
| EBBU.Sim2 1.02 | 9 | 78% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |

Hadur died in 117 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 21% | 52 |
| oog.melee.Corsair 1.0 | 21 | 18% | 43 |
| robar.nano.Assertive_Melee 0.2 | 21 | 18% | 23 |
| ahf.NanoAndrew .4 | 19 | 16% | 35 |
| EBBU.Sim2 1.02 | 11 | 9% | 21 |
| sam.Samspin 1.0 | 7 | 6% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 5% | 7 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 10 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.5 | 92 / 210 | 2.75 | 16.8% | 27461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.3 | 16.8% | 92 |
| d414.nano.Quantum 1.0.0 | 1.7 | 15.3% | 51 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.7% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 19 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.5% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.1% | 8 |
| fm.claire 1.7 | 6.5 | 8.6% | 5 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 7 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.1 | 16 / 35 | 4869 |
| 2 | 2 | 62.9 | 72.1 | 14 / 35 | 4366 |
| 3 | 1 | 68.6 | 87.3 | 23 / 35 | 5121 |
| 4 | 1 | 65.3 | 82.2 | 12 / 35 | 4534 |
| 5 | 2 | 63.7 | 77.1 | 12 / 35 | 4009 |
| 6 | 1 | 65.1 | 80.3 | 15 / 35 | 4562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 53 | 55% |
| oog.melee.CapuletDroid 1.1 | 33 | 97% |
| gh.nano.Grofvuil 0.2 | 14 | 64% |
| arthord.NanoSatanMelee Beta | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| kurios.DOSexe .9b | 4 | 75% |
| sample.SpinBot 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 0% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 49% | 80 |
| gh.nano.Grofvuil 0.2 | 13 | 11% | 24 |
| arthord.NanoSatanMelee Beta | 12 | 10% | 19 |
| sample.SpinBot 1.0 | 10 | 8% | 12 |
| fm.claire 1.7 | 10 | 8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 7 | 6% | 13 |
| oog.melee.CapuletDroid 1.1 | 5 | 4% | 38 |
| pa.Improved 1.0 | 3 | 3% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 76.9 | 78 / 210 | 3.08 | 16.3% | 30758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.2 | 16.3% | 78 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.9% | 40 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.5% | 42 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 27 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 6 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.4% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 6 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 5 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 2 |
| fire219.CatBot 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 77.1 | 10 / 35 | 5139 |
| 2 | 1 | 65.9 | 79.4 | 15 / 35 | 5298 |
| 3 | 2 | 63.3 | 72.7 | 10 / 35 | 5026 |
| 4 | 1 | 64.1 | 73.3 | 10 / 35 | 5092 |
| 5 | 1 | 65.5 | 77.1 | 17 / 35 | 4895 |
| 6 | 1 | 66.8 | 81.6 | 16 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 79% |
| mz.MicroGodMelee 1 | 32 | 75% |
| gh.micro.Gruweltje 0.7 | 20 | 55% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 3 | 0% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 29% | 63 |
| gh.micro.Gruweltje 0.7 | 28 | 21% | 41 |
| mz.MicroGodMelee 1 | 25 | 19% | 49 |
| caimano.Furia_Ceca 0.22 | 12 | 9% | 13 |
| el.JumpShoot 0.2 | 10 | 7% | 11 |
| acogdev.alpha 0.2 | 10 | 7% | 10 |
| DBall.Anarchy 0.1 | 4 | 3% | 15 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 5 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.2 | 94 / 210 | 3.14 | 16.4% | 29738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.9% | 65 |
| hadur117.micro.SaorPX5 0.1 | 1.8 | 16.4% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.2 | 12.7% | 20 |
| germ.TheMind .2 | 4.2 | 9.9% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.0% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.5% | 2 |
| awesomeness.Elite 1.0 | 7.0 | 8.1% | 7 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 7 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 74.0 | 16 / 35 | 4407 |
| 2 | 2 | 64.3 | 73.3 | 17 / 35 | 4756 |
| 3 | 2 | 62.6 | 71.7 | 10 / 35 | 4601 |
| 4 | 1 | 69.1 | 88.3 | 20 / 35 | 5806 |
| 5 | 2 | 66.0 | 80.6 | 16 / 35 | 5152 |
| 6 | 2 | 63.5 | 69.2 | 15 / 35 | 5016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 100% |
| germ.TheMind .2 | 9 | 78% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 50% |
| lrem.micro.MoggFanatic 0.2 | 3 | 33% |

Hadur died in 116 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 41% | 90 |
| germ.TheMind .2 | 31 | 27% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 11% | 30 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 16 |
| awesomeness.Elite 1.0 | 7 | 6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 7 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.3 | 91 / 210 | 3.40 | 15.8% | 25424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.5 | 15.8% | 91 |
| rz.HawkOnFire 0.1 | 1.5 | 15.2% | 45 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.4% | 18 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 21 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.7% | 4 |
| ratosh.Wesco 1.4 | 6.5 | 8.9% | 5 |
| stelo.PatternRobot 1.0 | 7.3 | 9.1% | 10 |
| spinnercat.Omen 1.0 | 8.7 | 8.0% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 72.4 | 13 / 35 | 4095 |
| 2 | 1 | 68.4 | 83.5 | 24 / 35 | 4479 |
| 3 | 2 | 62.7 | 68.9 | 12 / 35 | 3914 |
| 4 | 1 | 65.7 | 76.2 | 19 / 35 | 4545 |
| 5 | 2 | 62.5 | 68.3 | 12 / 35 | 4021 |
| 6 | 2 | 63.6 | 70.8 | 11 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 48 | 83% |
| nz.jdc.nano.GridFu 1.0 | 22 | 100% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| maribo.IotaCT 1.1 | 9 | 78% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| ratosh.Wesco 1.4 | 4 | 50% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 33 | 28% | 65 |
| stelo.PatternRobot 1.0 | 28 | 24% | 33 |
| ratosh.Wesco 1.4 | 27 | 23% | 33 |
| nz.jdc.nano.GridFu 1.0 | 8 | 7% | 34 |
| maribo.IotaCT 1.1 | 8 | 7% | 16 |
| timmit.nano.TimDog 0.33 | 6 | 5% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 8 |
| spinnercat.Omen 1.0 | 3 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.1 | 134 / 210 | 2.16 | 19.3% | 35199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 19.3% | 134 |
| baal.nano.N 1.42 | 2.3 | 12.1% | 11 |
| tvv.nano.Polaris 1.2 | 3.0 | 11.7% | 16 |
| zyx.micro.Ant 1.1 | 4.2 | 10.6% | 21 |
| Grystrion.TrackerWO 1.0 | 4.8 | 10.0% | 4 |
| sanja.First 0.1 | 6.7 | 8.3% | 5 |
| cvt.Firsty 1.0 | 7.0 | 8.3% | 18 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 24 / 35 | 5954 |
| 2 | 1 | 68.7 | 87.9 | 23 / 35 | 5791 |
| 3 | 1 | 70.4 | 93.3 | 25 / 35 | 6093 |
| 4 | 1 | 68.4 | 87.0 | 19 / 35 | 5967 |
| 5 | 1 | 65.8 | 76.8 | 20 / 35 | 5449 |
| 6 | 1 | 68.9 | 86.7 | 23 / 35 | 5945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 31 | 90% |
| cvt.Firsty 1.0 | 29 | 76% |
| baal.nano.N 1.42 | 28 | 89% |
| zyx.micro.Ant 1.1 | 18 | 67% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| sanja.First 0.1 | 14 | 86% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 37 | 49% | 48 |
| cvt.Firsty 1.0 | 13 | 17% | 33 |
| tvv.nano.Polaris 1.2 | 7 | 9% | 44 |
| baal.nano.N 1.42 | 6 | 8% | 30 |
| sanja.First 0.1 | 5 | 7% | 27 |
| Grystrion.TrackerWO 1.0 | 5 | 7% | 14 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 6 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 68.6 | 68 / 210 | 3.82 | 14.8% | 29069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 17.1% | 89 |
| hadur117.micro.SaorPX5 0.1 | 1.8 | 14.8% | 68 |
| cs.Wren 1.0 | 3.0 | 12.8% | 18 |
| js.PinBall 1.6 | 4.5 | 10.9% | 14 |
| mz.Cork 0.1 | 4.7 | 11.1% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.5% | 2 |
| evd.X1 0.01 | 6.7 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.3% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.1% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 66.3 | 14 / 35 | 4846 |
| 2 | 2 | 60.7 | 63.2 | 9 / 35 | 4886 |
| 3 | 2 | 63.1 | 71.1 | 10 / 35 | 4720 |
| 4 | 2 | 60.0 | 62.2 | 11 / 35 | 4282 |
| 5 | 2 | 63.6 | 74.6 | 9 / 35 | 4898 |
| 6 | 1 | 64.8 | 74.3 | 15 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 76% |
| cs.Wren 1.0 | 17 | 76% |
| mz.Cork 0.1 | 7 | 100% |
| js.PinBall 1.6 | 5 | 60% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 142 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 37% | 96 |
| cs.Wren 1.0 | 32 | 23% | 41 |
| joe.ADinosaur 1.0 | 22 | 15% | 23 |
| evd.X1 0.01 | 17 | 12% | 17 |
| js.PinBall 1.6 | 10 | 7% | 12 |
| mz.Cork 0.1 | 4 | 3% | 12 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.7 | 100 / 210 | 2.82 | 17.0% | 26612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 17.0% | 100 |
| myl.nano.Graviton 1.10 | 2.8 | 12.5% | 31 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 11.7% | 25 |
| ntc.Opposite 1.5 | 4.2 | 11.0% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 5.5 | 10.1% | 4 |
| disan.Chair 2.2.0 | 6.8 | 8.2% | 8 |
| DBall.NUKE 0.1 | 7.7 | 8.1% | 11 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 77.1 | 17 / 35 | 4676 |
| 2 | 1 | 64.9 | 78.1 | 15 / 35 | 4577 |
| 3 | 1 | 65.2 | 79.7 | 17 / 35 | 4198 |
| 4 | 1 | 67.0 | 85.7 | 19 / 35 | 4547 |
| 5 | 1 | 66.1 | 81.3 | 19 / 35 | 4333 |
| 6 | 1 | 64.1 | 76.5 | 13 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 82% |
| myl.nano.Graviton 1.10 | 29 | 79% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| DBall.NUKE 0.1 | 9 | 89% |
| disan.Chair 2.2.0 | 9 | 78% |
| donjezza.Muncho 1.0 | 8 | 88% |
| ntc.Opposite 1.5 | 7 | 29% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 26% | 52 |
| pfvicm.Sobieski 7.2.3b | 26 | 23% | 36 |
| stelo.AreaTargetingBot 1.1 | 15 | 13% | 34 |
| ntc.Opposite 1.5 | 15 | 13% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 21 |
| donjezza.Muncho 1.0 | 6 | 5% | 14 |
| disan.Chair 2.2.0 | 5 | 4% | 13 |
| pbg.R2D2 1.0 | 3 | 3% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.0 | 73 / 210 | 3.43 | 15.1% | 24904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.8 | 15.3% | 58 |
| hadur117.micro.SaorPX5 0.1 | 1.8 | 15.1% | 73 |
| oog.melee.Capulet 1.2 | 2.5 | 14.6% | 52 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.5% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.1% | 3 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.7 | 11 / 35 | 3886 |
| 2 | 1 | 65.4 | 78.4 | 13 / 35 | 4377 |
| 3 | 3 | 62.5 | 68.6 | 13 / 35 | 3907 |
| 4 | 2 | 62.5 | 71.7 | 11 / 35 | 4020 |
| 5 | 2 | 63.4 | 70.2 | 14 / 35 | 4317 |
| 6 | 1 | 64.8 | 76.5 | 11 / 35 | 4397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 96% |
| oog.melee.Capulet 1.2 | 24 | 50% |
| yagami.Tidus 0.11 | 17 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 100% |
| ejb.Polaris 1.0.1 | 5 | 60% |

Hadur died in 137 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 31% | 63 |
| kawigi.micro.Shiz 1.1 | 32 | 23% | 48 |
| yagami.Tidus 0.11 | 29 | 21% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 9% | 30 |
| ejb.Polaris 1.0.1 | 10 | 7% | 15 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.8 | 141 / 210 | 2.37 | 18.1% | 27440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 18.1% | 141 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 16 |
| wee.Gem 1.8.4 | 3.0 | 12.0% | 16 |
| ratosh.Nobo 0.21 | 3.5 | 11.7% | 15 |
| wompi.Quokka 1.6 | 5.0 | 10.8% | 12 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 5 |
| bayen.UbaMicro 1.4 | 7.0 | 8.3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.9 | 24 / 35 | 4595 |
| 2 | 1 | 65.7 | 78.1 | 22 / 35 | 4562 |
| 3 | 1 | 67.2 | 84.4 | 22 / 35 | 4820 |
| 4 | 1 | 65.3 | 79.0 | 22 / 35 | 4039 |
| 5 | 1 | 68.7 | 89.8 | 25 / 35 | 4819 |
| 6 | 1 | 68.0 | 88.6 | 26 / 35 | 4605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 93% |
| wee.Gem 1.8.4 | 37 | 95% |
| wompi.Quokka 1.6 | 23 | 87% |
| ratosh.Nobo 0.21 | 22 | 91% |
| m3thos.Eva00 1.1 | 7 | 86% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 10 | 14% | 55 |
| wee.Gem 1.8.4 | 10 | 14% | 50 |
| ratosh.Nobo 0.21 | 10 | 14% | 29 |
| wompi.Quokka 1.6 | 10 | 14% | 29 |
| m3thos.Eva00 1.1 | 9 | 13% | 17 |
| bayen.UbaMicro 1.4 | 7 | 10% | 10 |
| maribo.FollowFire 1 | 5 | 7% | 6 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 89.3 | 135 / 210 | 1.97 | 20.9% | 44551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 20.9% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 15 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.7% | 3 |
| ayk.WallHugger 1.0 | 4.7 | 9.9% | 0 |
| stuff.Vlad 0.1 | 6.2 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.4% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 86.3 | 21 / 35 | 7297 |
| 2 | 1 | 72.2 | 91.7 | 22 / 35 | 7036 |
| 3 | 1 | 70.5 | 86.0 | 20 / 35 | 6849 |
| 4 | 1 | 71.7 | 86.7 | 22 / 35 | 7198 |
| 5 | 1 | 74.6 | 96.5 | 29 / 35 | 8375 |
| 6 | 1 | 72.1 | 88.3 | 21 / 35 | 7796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 88% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| mz.NanoGod 2.02 | 13 | 77% |
| ayk.WallHugger 1.0 | 12 | 100% |
| stelo.PianistNano 1.2 | 6 | 83% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 34% | 116 |
| mz.NanoGod 2.02 | 26 | 34% | 45 |
| ayk.WallHugger 1.0 | 8 | 11% | 16 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 16 |
| stelo.PianistNano 1.2 | 4 | 5% | 4 |
| drd.Dreadknoght 0.9 | 2 | 3% | 7 |
| stuff.Vlad 0.1 | 2 | 3% | 6 |

## Melee bench: F16

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.1 | 103 / 210 | 3.15 | 16.4% | 27547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 16.4% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 27 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.4% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.6% | 21 |
| bvh.micro.Freya 0.3 | 4.5 | 11.1% | 17 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 77.1 | 15 / 35 | 4410 |
| 2 | 1 | 63.7 | 72.4 | 16 / 35 | 4591 |
| 3 | 1 | 65.9 | 79.4 | 20 / 35 | 4642 |
| 4 | 1 | 65.1 | 74.6 | 21 / 35 | 4738 |
| 5 | 1 | 64.5 | 76.8 | 16 / 35 | 4572 |
| 6 | 1 | 64.6 | 76.2 | 15 / 35 | 4594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 96% |
| dummy.micro.Sparrow 2.5 | 27 | 89% |
| ap.Frederick 1.1 | 10 | 100% |
| bvh.micro.Freya 0.3 | 9 | 67% |
| stelo.MirrorMicro 1.0 | 4 | 50% |
| conscience.Electron 1.3g | 1 | 0% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 32% | 66 |
| dummy.micro.Sparrow 2.5 | 20 | 19% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 17% | 45 |
| dl.BetterWalls 1.0 | 9 | 8% | 16 |
| bvh.micro.Freya 0.3 | 9 | 8% | 12 |
| conscience.Electron 1.3g | 9 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 4% | 7 |

## Melee bench: F17

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.3 | 122 / 210 | 2.41 | 19.4% | 38612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 19.4% | 122 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 25 |
| sul.Lunar 1.1 | 3.2 | 12.3% | 21 |
| supersample.SuperBoxBot 1.0 | 4.2 | 11.0% | 20 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 7 |
| dsw.StaticD 1.0 | 6.2 | 8.1% | 6 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 4 |
| sample.Corners 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.2 | 22 / 35 | 6593 |
| 2 | 1 | 68.7 | 79.7 | 21 / 35 | 6703 |
| 3 | 1 | 68.3 | 83.8 | 15 / 35 | 6033 |
| 4 | 1 | 67.1 | 77.8 | 17 / 35 | 6202 |
| 5 | 1 | 69.9 | 87.6 | 22 / 35 | 6402 |
| 6 | 1 | 70.7 | 87.9 | 25 / 35 | 6679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 81% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| supersample.SuperBoxBot 1.0 | 13 | 85% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 36 | 41% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 27% | 63 |
| mme.NikeEnhanced 2.0 | 8 | 9% | 13 |
| sul.Lunar 1.1 | 7 | 8% | 50 |
| dsw.StaticD 1.0 | 4 | 5% | 15 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 7 |
| sample.Corners 1.0 | 2 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorPX5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 72.8 | 90 / 210 | 3.45 | 15.7% | 31003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX5 0.1 | 1.0 | 15.7% | 90 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.5 | 13.4% | 31 |
| radnor.DoctorBob 1.42 | 2.8 | 13.1% | 33 |
| mld.Wisdom 1.0 | 4.0 | 12.1% | 25 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 14 |
| KiraNL.Chupacabra 0.4 | 6.0 | 9.9% | 8 |
| sample.Walls 1.0 | 6.7 | 8.7% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.6% | 4 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 71.1 | 16 / 35 | 5721 |
| 2 | 1 | 65.2 | 76.8 | 20 / 35 | 5135 |
| 3 | 1 | 63.2 | 69.5 | 15 / 35 | 5238 |
| 4 | 1 | 62.5 | 70.5 | 13 / 35 | 4878 |
| 5 | 1 | 63.7 | 74.0 | 13 / 35 | 5257 |
| 6 | 1 | 63.5 | 74.6 | 13 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 83% |
| radnor.DoctorBob 1.42 | 33 | 85% |
| mld.Wisdom 1.0 | 14 | 71% |
| amz.NanoClone 1.41 | 11 | 64% |
| KiraNL.Chupacabra 0.4 | 8 | 63% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 23% | 57 |
| mld.Wisdom 1.0 | 24 | 20% | 35 |
| KiraNL.Chupacabra 0.4 | 19 | 16% | 24 |
| radnor.DoctorBob 1.42 | 15 | 13% | 39 |
| sample.Walls 1.0 | 15 | 13% | 21 |
| amz.NanoClone 1.41 | 12 | 10% | 19 |
| GarmBox.Oranges 1.0 | 6 | 5% | 7 |
| jangs.ns51 1.0 | 2 | 2% | 7 |

