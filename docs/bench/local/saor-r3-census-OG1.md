# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 78.0 | 76 / 210 | 2.98 | 17.0% | 30658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 17.0% | 76 |
| radnor.DoctorBob 1.42 | 2.2 | 16.0% | 55 |
| mld.Infinity 2.2 | 3.0 | 15.1% | 45 |
| mz.AntiGrav 1.0 | 3.5 | 14.6% | 26 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| sample.Walls 1.0 | 6.7 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 77.5 | 11 / 35 | 5449 |
| 2 | 2 | 66.8 | 77.1 | 11 / 35 | 5070 |
| 3 | 1 | 65.7 | 76.8 | 15 / 35 | 4446 |
| 4 | 1 | 66.7 | 75.9 | 12 / 35 | 5358 |
| 5 | 1 | 66.6 | 75.9 | 10 / 35 | 5354 |
| 6 | 1 | 68.1 | 84.8 | 17 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 43 | 56% |
| radnor.DoctorBob 1.42 | 34 | 41% |
| mz.AntiGrav 1.0 | 30 | 93% |
| jangs.ns51 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 5 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 67 | 50% | 87 |
| mld.Infinity 2.2 | 38 | 28% | 29 |
| mz.AntiGrav 1.0 | 13 | 10% | 64 |
| amz.NanoClone 1.41 | 9 | 7% | 15 |
| jangs.ns51 1.0 | 5 | 4% | 8 |
| sample.Walls 1.0 | 2 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.6 | 107 / 210 | 2.93 | 16.4% | 24057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.4% | 107 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 59 |
| mld.DustBunny 3.8 | 2.5 | 14.5% | 23 |
| maribo.melee.BMV 0.1 | 4.0 | 11.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.3% | 8 |
| zyx.nano.Ant 1.1 | 6.3 | 8.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.1% | 6 |
| bzdp.BoxCar 2.0 | 8.2 | 7.1% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 83.5 | 18 / 35 | 3939 |
| 2 | 1 | 66.0 | 86.0 | 19 / 35 | 3711 |
| 3 | 1 | 65.3 | 81.6 | 20 / 35 | 3532 |
| 4 | 1 | 66.5 | 83.8 | 19 / 35 | 4172 |
| 5 | 1 | 65.2 | 77.1 | 18 / 35 | 4075 |
| 6 | 2 | 61.1 | 59.4 | 13 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 70% |
| mld.DustBunny 3.8 | 51 | 82% |
| djdjdj.NanoSkunk10 1.0 | 9 | 89% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 30 | 29% | 66 |
| oog.melee.Mercutio 1.0 | 29 | 28% | 73 |
| maribo.melee.BMV 0.1 | 10 | 10% | 12 |
| zyx.nano.Ant 1.1 | 9 | 9% | 9 |
| djdjdj.NanoSkunk10 1.0 | 8 | 8% | 20 |
| fullsail.SweetTea 1.1 | 6 | 6% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 12 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.6 | 105 / 210 | 3.20 | 16.9% | 28116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.9% | 105 |
| myl.micro.Troodon 1.10 | 1.8 | 15.9% | 57 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.7% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.5% | 17 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.5% | 11 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.1% | 3 |
| sample.Fire 1.0 | 9.0 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 75.9 | 16 / 35 | 5392 |
| 2 | 2 | 62.1 | 65.1 | 15 / 35 | 4086 |
| 3 | 1 | 67.5 | 80.3 | 18 / 35 | 5121 |
| 4 | 1 | 68.0 | 80.6 | 22 / 35 | 4741 |
| 5 | 1 | 63.9 | 73.7 | 15 / 35 | 3914 |
| 6 | 1 | 66.7 | 77.8 | 19 / 35 | 4862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 82% |
| cb.nano.Insomnia 1.0 | 31 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 76% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| fm.mammillarias 1.3 | 7 | 71% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 26 | 24% | 76 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 21% | 34 |
| cb.nano.Insomnia 1.0 | 17 | 16% | 16 |
| fm.mammillarias 1.3 | 13 | 12% | 12 |
| myl.nano.KomoriNinja 1.1 | 11 | 10% | 40 |
| sample.Fire 1.0 | 10 | 9% | 14 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| sample.Tracker 1.0 | 2 | 2% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 7 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.9 | 110 / 210 | 2.90 | 17.4% | 29536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.4% | 110 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.0% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.9% | 28 |
| tj.zombie1n 1.0.1 | 4.5 | 10.1% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.9% | 21 |
| yk.JahMicro 1.0 | 6.3 | 8.5% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.4 | 19 / 35 | 4710 |
| 2 | 1 | 65.8 | 78.1 | 16 / 35 | 5024 |
| 3 | 1 | 66.2 | 78.4 | 19 / 35 | 5056 |
| 4 | 1 | 66.7 | 81.0 | 18 / 35 | 5104 |
| 5 | 1 | 68.4 | 88.6 | 24 / 35 | 4538 |
| 6 | 1 | 64.0 | 68.9 | 14 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 92% |
| tvv.micro.Antares 1.1.1 | 24 | 67% |
| tj.zombie1n 1.0.1 | 14 | 57% |
| stelo.SoJNanoMelee 1.1 | 13 | 54% |
| yk.JahMicro 1.0 | 11 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 37% | 95 |
| tvv.micro.Antares 1.1.1 | 17 | 17% | 38 |
| stelo.SoJNanoMelee 1.1 | 14 | 14% | 20 |
| tj.zombie1n 1.0.1 | 11 | 11% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 8% | 8 |
| yk.JahMicro 1.0 | 6 | 6% | 11 |
| sample.VelociRobot 1.0 | 3 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 11 |
| repositorio.NanoStep 1.0 | 2 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.5 | 93 / 210 | 4.02 | 15.2% | 25731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.2% | 93 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 26 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.1% | 21 |
| sam.Samspin 1.0 | 5.3 | 10.2% | 12 |
| EBBU.Sim2 1.02 | 5.8 | 9.8% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 9.2% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.5 | 58.7 | 12 / 35 | 4140 |
| 2 | 1 | 64.1 | 71.4 | 15 / 35 | 4679 |
| 3 | 1 | 60.0 | 55.2 | 14 / 35 | 4330 |
| 4 | 1 | 65.8 | 77.8 | 20 / 35 | 4220 |
| 5 | 1 | 63.5 | 72.4 | 17 / 35 | 3877 |
| 6 | 1 | 61.8 | 63.2 | 15 / 35 | 4485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 94% |
| oog.melee.Corsair 1.0 | 29 | 83% |
| ahf.NanoAndrew .4 | 28 | 89% |
| sam.Samspin 1.0 | 11 | 73% |
| EBBU.Sim2 1.02 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 358. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 47 |
| ahf.NanoAndrew .4 | 17 | 15% | 37 |
| robar.nano.Assertive_Melee 0.2 | 17 | 15% | 21 |
| oog.melee.Corsair 1.0 | 16 | 14% | 44 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 14 |
| sam.Samspin 1.0 | 7 | 6% | 14 |
| EBBU.Sim2 1.02 | 7 | 6% | 10 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.6 | 125 / 210 | 2.39 | 17.8% | 25636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.8% | 125 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 25 |
| gh.nano.Grofvuil 0.2 | 3.3 | 12.0% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.7% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.6% | 14 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.1% | 3 |
| fm.claire 1.7 | 6.7 | 7.9% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.2% | 3 |
| pa.Improved 1.0 | 9.3 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 25 / 35 | 4717 |
| 2 | 1 | 67.0 | 82.5 | 21 / 35 | 4699 |
| 3 | 1 | 64.0 | 78.1 | 20 / 35 | 3673 |
| 4 | 1 | 64.3 | 76.2 | 16 / 35 | 3982 |
| 5 | 1 | 67.8 | 87.6 | 21 / 35 | 4249 |
| 6 | 1 | 68.5 | 91.4 | 22 / 35 | 4316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 87% |
| oog.melee.CapuletDroid 1.1 | 38 | 74% |
| gh.nano.Grofvuil 0.2 | 21 | 86% |
| winamp32.micro.MicroMacro 1.0 | 14 | 57% |
| arthord.NanoSatanMelee Beta | 8 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 87 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 21 | 24% | 20 |
| d414.nano.Quantum 1.0.0 | 17 | 20% | 81 |
| gh.nano.Grofvuil 0.2 | 12 | 14% | 36 |
| winamp32.micro.MicroMacro 1.0 | 12 | 14% | 26 |
| arthord.NanoSatanMelee Beta | 9 | 10% | 20 |
| pa.Improved 1.0 | 5 | 6% | 9 |
| sample.SpinBot 1.0 | 5 | 6% | 8 |
| kurios.DOSexe .9b | 2 | 2% | 5 |
| fm.claire 1.7 | 2 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 76.3 | 82 / 210 | 3.13 | 15.7% | 25064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 15.7% | 82 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.7% | 55 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 15.0% | 34 |
| mz.MicroGodMelee 1 | 4.0 | 13.5% | 18 |
| DBall.Anarchy 0.1 | 5.2 | 9.3% | 13 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 3 |
| fire219.CatBot 1.0 | 8.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.6% | 1 |
| acogdev.alpha 0.2 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 72.4 | 15 / 35 | 4147 |
| 2 | 1 | 64.7 | 78.1 | 16 / 35 | 4063 |
| 3 | 1 | 64.1 | 74.9 | 13 / 35 | 4463 |
| 4 | 1 | 64.2 | 79.7 | 11 / 35 | 4187 |
| 5 | 1 | 64.7 | 77.1 | 12 / 35 | 4164 |
| 6 | 2 | 64.4 | 75.9 | 15 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 38 | 87% |
| spinnercat.micro.Tyger 0.1 | 35 | 69% |
| gh.micro.Gruweltje 0.7 | 31 | 48% |
| DBall.Anarchy 0.1 | 9 | 89% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 42 | 33% | 62 |
| spinnercat.micro.Tyger 0.1 | 34 | 27% | 61 |
| mz.MicroGodMelee 1 | 30 | 23% | 53 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 6 |
| acogdev.alpha 0.2 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 4 | 3% | 12 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 5 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 63.0 | 65 / 210 | 4.33 | 13.9% | 24752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.7% | 71 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.2 | 14.1% | 36 |
| hadur117.micro.SaorOG1 0.1 | 2.7 | 13.9% | 65 |
| germ.TheMind .2 | 5.0 | 9.4% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 9.0% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 7 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.4% | 6 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 63.8 | 12 / 35 | 3668 |
| 2 | 3 | 58.3 | 57.1 | 9 / 35 | 3805 |
| 3 | 2 | 63.3 | 69.8 | 13 / 35 | 4592 |
| 4 | 3 | 59.9 | 60.6 | 9 / 35 | 4316 |
| 5 | 3 | 59.5 | 59.4 | 10 / 35 | 4032 |
| 6 | 2 | 62.1 | 67.3 | 12 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 50% |
| sample.Crazy 1.0 | 7 | 86% |
| germ.TheMind .2 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 5 | 60% |
| qualidafial.MajorDick 1.0.1 | 4 | 50% |
| stelo.UntouchableNano 1.3 | 3 | 33% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 50% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 15% | 32 |
| germ.TheMind .2 | 18 | 12% | 23 |
| lrem.micro.MoggFanatic 0.2 | 12 | 8% | 15 |
| stelo.UntouchableNano 1.3 | 7 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 7 |
| awesomeness.Elite 1.0 | 3 | 2% | 6 |
| mym.EdgeStalker 1.0 | 3 | 2% | 4 |
| sample.Crazy 1.0 | 2 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.7 | 105 / 210 | 2.83 | 16.6% | 21355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.6% | 105 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 13.6% | 27 |
| rz.HawkOnFire 0.1 | 2.5 | 14.2% | 27 |
| maribo.IotaCT 1.1 | 4.0 | 11.7% | 24 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.9% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 3 |
| stelo.PatternRobot 1.0 | 7.3 | 8.1% | 8 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 6 |
| ratosh.Wesco 1.4 | 8.7 | 7.5% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.2 | 17 / 35 | 3444 |
| 2 | 1 | 65.1 | 79.0 | 16 / 35 | 3555 |
| 3 | 1 | 65.0 | 77.8 | 17 / 35 | 3356 |
| 4 | 1 | 64.1 | 73.3 | 15 / 35 | 3505 |
| 5 | 1 | 66.9 | 80.3 | 20 / 35 | 3883 |
| 6 | 1 | 67.9 | 85.4 | 20 / 35 | 3612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 52 | 90% |
| nz.jdc.nano.GridFu 1.0 | 35 | 71% |
| maribo.IotaCT 1.1 | 19 | 63% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| spinnercat.Omen 1.0 | 5 | 100% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 106 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 31 | 29% | 56 |
| maribo.IotaCT 1.1 | 21 | 20% | 35 |
| rz.HawkOnFire 0.1 | 17 | 16% | 56 |
| stelo.PatternRobot 1.0 | 12 | 11% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 8% | 10 |
| timmit.nano.TimDog 0.33 | 7 | 7% | 16 |
| ratosh.Wesco 1.4 | 7 | 7% | 15 |
| spinnercat.Omen 1.0 | 2 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.1 | 125 / 210 | 2.16 | 19.0% | 31767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 19.0% | 125 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.7% | 46 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 6 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.3% | 5 |
| zyx.micro.Ant 1.1 | 5.2 | 9.7% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.2% | 2 |
| sanja.First 0.1 | 6.7 | 8.1% | 4 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 5 |
| cvt.Firsty 1.0 | 8.3 | 7.5% | 9 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 89.8 | 22 / 35 | 5067 |
| 2 | 1 | 69.3 | 88.6 | 21 / 35 | 5850 |
| 3 | 1 | 68.1 | 84.4 | 21 / 35 | 5428 |
| 4 | 1 | 69.0 | 88.6 | 20 / 35 | 5572 |
| 5 | 1 | 69.3 | 90.5 | 23 / 35 | 5120 |
| 6 | 1 | 65.9 | 81.0 | 18 / 35 | 4730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 53 | 47% |
| baal.nano.N 1.42 | 29 | 93% |
| cvt.Firsty 1.0 | 27 | 78% |
| zyx.micro.Ant 1.1 | 15 | 87% |
| sanja.First 0.1 | 12 | 92% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| amk.Punbot.Punbot 0.01 | 11 | 82% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 43% | 67 |
| zyx.micro.Ant 1.1 | 16 | 18% | 36 |
| Grystrion.TrackerWO 1.0 | 12 | 14% | 26 |
| cvt.Firsty 1.0 | 10 | 11% | 25 |
| amk.Punbot.Punbot 0.01 | 5 | 6% | 6 |
| baal.nano.N 1.42 | 3 | 3% | 21 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 6 |
| sanja.First 0.1 | 1 | 1% | 16 |
| sample.RamFire 1.0 | 1 | 1% | 4 |

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.8 | 55 / 210 | 4.44 | 13.1% | 23321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.7 | 15.5% | 78 |
| cs.Wren 1.0 | 2.3 | 13.3% | 28 |
| hadur117.micro.SaorOG1 0.1 | 2.5 | 13.1% | 55 |
| mz.Cork 0.1 | 4.2 | 11.6% | 14 |
| js.PinBall 1.6 | 4.3 | 11.7% | 16 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 6 |
| evd.X1 0.01 | 6.8 | 8.4% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 65.1 | 8 / 35 | 3711 |
| 2 | 1 | 59.9 | 63.8 | 12 / 35 | 4309 |
| 3 | 2 | 59.8 | 63.5 | 7 / 35 | 4047 |
| 4 | 4 | 56.7 | 59.4 | 10 / 35 | 3163 |
| 5 | 3 | 58.6 | 60.0 | 11 / 35 | 3856 |
| 6 | 3 | 58.6 | 59.0 | 7 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 40% |
| cs.Wren 1.0 | 20 | 85% |
| mz.Cork 0.1 | 10 | 80% |
| js.PinBall 1.6 | 7 | 71% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 77 | 50% | 102 |
| js.PinBall 1.6 | 16 | 10% | 20 |
| cs.Wren 1.0 | 14 | 9% | 28 |
| evd.X1 0.01 | 13 | 8% | 14 |
| mz.Cork 0.1 | 11 | 7% | 18 |
| joe.ADinosaur 1.0 | 11 | 7% | 13 |
| PSW.Relentless 0.1 | 8 | 5% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.1 | 83 / 210 | 3.33 | 15.9% | 23635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.9% | 83 |
| myl.nano.Graviton 1.10 | 3.0 | 12.1% | 35 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 11 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.0% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.7% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.9% | 10 |
| DBall.NUKE 0.1 | 7.0 | 8.7% | 9 |
| disan.Chair 2.2.0 | 7.5 | 8.3% | 10 |
| pbg.R2D2 1.0 | 9.3 | 6.0% | 5 |
| donjezza.Muncho 1.0 | 9.7 | 6.0% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 73.7 | 14 / 35 | 3742 |
| 2 | 1 | 62.8 | 72.1 | 12 / 35 | 3849 |
| 3 | 1 | 62.2 | 71.1 | 13 / 35 | 3753 |
| 4 | 1 | 63.8 | 74.0 | 13 / 35 | 4139 |
| 5 | 1 | 63.1 | 74.9 | 11 / 35 | 3915 |
| 6 | 1 | 65.8 | 79.0 | 20 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 81% |
| stelo.AreaTargetingBot 1.1 | 27 | 30% |
| ntc.Opposite 1.5 | 15 | 73% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| DBall.NUKE 0.1 | 8 | 88% |
| disan.Chair 2.2.0 | 5 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 128 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 27% | 43 |
| myl.nano.Graviton 1.10 | 20 | 16% | 43 |
| pfvicm.Sobieski 7.2.3b | 18 | 14% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 12% | 25 |
| ntc.Opposite 1.5 | 11 | 9% | 22 |
| pbg.R2D2 1.0 | 10 | 8% | 12 |
| disan.Chair 2.2.0 | 9 | 7% | 8 |
| donjezza.Muncho 1.0 | 7 | 5% | 15 |
| DBall.NUKE 0.1 | 4 | 3% | 16 |

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.6 | 95 / 210 | 3.56 | 15.0% | 20869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 2.0 | 15.0% | 95 |
| oog.melee.Capulet 1.2 | 2.0 | 14.7% | 39 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.4% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 19 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 7 |
| step.nanoPri 1.0 | 7.3 | 6.8% | 0 |
| stelo.MirrorNano 1.3 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 66.0 | 17 / 35 | 3232 |
| 2 | 3 | 63.6 | 71.1 | 16 / 35 | 3351 |
| 3 | 1 | 65.6 | 80.6 | 15 / 35 | 3631 |
| 4 | 2 | 64.5 | 72.4 | 18 / 35 | 3694 |
| 5 | 1 | 65.5 | 76.2 | 17 / 35 | 3760 |
| 6 | 3 | 60.3 | 63.2 | 12 / 35 | 3201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 38 | 84% |
| oog.melee.Capulet 1.2 | 29 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 100% |
| yagami.Tidus 0.11 | 13 | 85% |
| ejb.Polaris 1.0.1 | 8 | 75% |

Hadur died in 115 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 34% | 64 |
| yagami.Tidus 0.11 | 24 | 21% | 39 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 10% | 36 |
| ejb.Polaris 1.0.1 | 11 | 10% | 21 |
| kurios.DOSexe .9a | 7 | 6% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.6 | 99 / 210 | 3.20 | 15.4% | 19856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.4% | 99 |
| wee.Gem 1.8.4 | 2.7 | 13.2% | 37 |
| bzdp.Pansy 2.1 | 3.2 | 12.5% | 27 |
| wompi.Quokka 1.6 | 4.0 | 11.7% | 18 |
| ratosh.Nobo 0.21 | 4.3 | 11.4% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 10.2% | 13 |
| bayen.UbaMicro 1.4 | 7.2 | 8.5% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 74.9 | 14 / 35 | 3466 |
| 2 | 1 | 64.1 | 77.8 | 20 / 35 | 3447 |
| 3 | 1 | 61.8 | 73.3 | 15 / 35 | 3033 |
| 4 | 1 | 64.4 | 79.7 | 19 / 35 | 3167 |
| 5 | 1 | 63.5 | 75.9 | 18 / 35 | 3367 |
| 6 | 1 | 61.4 | 71.7 | 13 / 35 | 3376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 51 | 71% |
| bzdp.Pansy 2.1 | 34 | 79% |
| wompi.Quokka 1.6 | 23 | 87% |
| m3thos.Eva00 1.1 | 10 | 70% |
| ratosh.Nobo 0.21 | 5 | 80% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 27 | 24% | 65 |
| wompi.Quokka 1.6 | 22 | 20% | 27 |
| bzdp.Pansy 2.1 | 20 | 18% | 50 |
| m3thos.Eva00 1.1 | 9 | 8% | 21 |
| bayen.UbaMicro 1.4 | 9 | 8% | 12 |
| maribo.FollowFire 1 | 8 | 7% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 5% | 7 |
| stelo.MyAgileRobot 0.2 | 6 | 5% | 6 |
| ratosh.Nobo 0.21 | 4 | 4% | 12 |

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 78.4 | 25 / 210 | 2.95 | 17.9% | 41388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.4% | 170 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 17.9% | 25 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 9 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 5 |
| ayk.WallHugger 1.0 | 5.0 | 9.6% | 1 |
| stuff.Vlad 0.1 | 5.2 | 9.3% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 79.0 | 3 / 35 | 7529 |
| 2 | 2 | 67.7 | 75.9 | 2 / 35 | 6051 |
| 3 | 2 | 68.8 | 78.4 | 3 / 35 | 6667 |
| 4 | 2 | 69.9 | 82.2 | 7 / 35 | 7169 |
| 5 | 2 | 67.7 | 75.2 | 3 / 35 | 6660 |
| 6 | 2 | 69.5 | 79.4 | 7 / 35 | 7312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 118 | 3% |
| mz.NanoGod 2.02 | 14 | 93% |
| exauge.GateKeeper 1.1.121g | 5 | 60% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 135 | 73% | 142 |
| mz.NanoGod 2.02 | 28 | 15% | 39 |
| exauge.GateKeeper 1.1.121g | 10 | 5% | 14 |
| stelo.PianistNano 1.2 | 5 | 3% | 6 |
| ayk.WallHugger 1.0 | 4 | 2% | 3 |
| drd.Dreadknoght 0.9 | 2 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 62.6 | 76 / 210 | 4.36 | 13.8% | 22686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.5 | 14.1% | 37 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 13.8% | 76 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.6% | 27 |
| bvh.micro.Freya 0.3 | 3.7 | 12.3% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.5% | 28 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 66.0 | 17 / 35 | 3479 |
| 2 | 3 | 58.0 | 56.5 | 8 / 35 | 4017 |
| 3 | 1 | 61.6 | 67.3 | 11 / 35 | 4129 |
| 4 | 4 | 56.0 | 49.8 | 11 / 35 | 3653 |
| 5 | 2 | 59.1 | 60.3 | 12 / 35 | 3619 |
| 6 | 1 | 64.1 | 75.9 | 17 / 35 | 3789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 74% |
| dummy.micro.Sparrow 2.5 | 16 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 81% |
| bvh.micro.Freya 0.3 | 15 | 87% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 27% | 67 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 18% | 43 |
| bvh.micro.Freya 0.3 | 19 | 14% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 13% | 16 |
| conscience.Electron 1.3g | 16 | 12% | 20 |
| dummy.micro.Sparrow 2.5 | 11 | 8% | 24 |
| dl.BetterWalls 1.0 | 7 | 5% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 7 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 76.3 | 103 / 210 | 3.13 | 17.8% | 33596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 17.8% | 103 |
| sheldor.melee.nano.TestMelee 0.1 | 1.7 | 16.5% | 41 |
| sul.Lunar 1.1 | 3.5 | 11.7% | 22 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.0% | 17 |
| mme.NikeEnhanced 2.0 | 4.5 | 10.1% | 10 |
| dsw.StaticD 1.0 | 6.2 | 8.5% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.3% | 5 |
| sample.Corners 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 74.6 | 20 / 35 | 5054 |
| 2 | 1 | 67.6 | 79.7 | 17 / 35 | 5505 |
| 3 | 1 | 66.6 | 74.9 | 14 / 35 | 5636 |
| 4 | 2 | 65.0 | 71.4 | 14 / 35 | 4949 |
| 5 | 1 | 69.9 | 84.1 | 21 / 35 | 6331 |
| 6 | 1 | 67.3 | 73.3 | 17 / 35 | 6121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 89% |
| sul.Lunar 1.1 | 28 | 100% |
| supersample.SuperBoxBot 1.0 | 14 | 86% |
| dsw.StaticD 1.0 | 9 | 78% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |

Hadur died in 108 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 43% | 80 |
| supersample.SuperBoxBot 1.0 | 23 | 21% | 37 |
| dsw.StaticD 1.0 | 12 | 11% | 24 |
| mme.NikeEnhanced 2.0 | 12 | 11% | 16 |
| tlp.ThreeLeggedPig 1 | 4 | 4% | 4 |
| sul.Lunar 1.1 | 3 | 3% | 31 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 6 |
| sample.Corners 1.0 | 2 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.3 | 83 / 210 | 3.49 | 16.1% | 32051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 16.1% | 83 |
| radnor.DoctorBob 1.42 | 2.0 | 13.7% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.6% | 34 |
| mld.Wisdom 1.0 | 4.5 | 10.9% | 16 |
| KiraNL.Chupacabra 0.4 | 4.8 | 11.0% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 10 |
| sample.Walls 1.0 | 7.0 | 7.9% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.5% | 2 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 67.6 | 13 / 35 | 4996 |
| 2 | 1 | 65.6 | 75.9 | 15 / 35 | 5377 |
| 3 | 3 | 60.4 | 61.6 | 6 / 35 | 5128 |
| 4 | 1 | 65.6 | 76.5 | 16 / 35 | 5362 |
| 5 | 1 | 63.0 | 69.2 | 13 / 35 | 5206 |
| 6 | 1 | 68.0 | 83.2 | 20 / 35 | 5982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 34% |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 78% |
| mld.Wisdom 1.0 | 14 | 86% |
| amz.NanoClone 1.41 | 14 | 100% |
| KiraNL.Chupacabra 0.4 | 12 | 75% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 30% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 29% | 68 |
| KiraNL.Chupacabra 0.4 | 17 | 13% | 29 |
| mld.Wisdom 1.0 | 12 | 9% | 25 |
| amz.NanoClone 1.41 | 12 | 9% | 20 |
| jangs.ns51 1.0 | 4 | 3% | 7 |
| GarmBox.Oranges 1.0 | 4 | 3% | 4 |
| sample.Walls 1.0 | 3 | 2% | 3 |

