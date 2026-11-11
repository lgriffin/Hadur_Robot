# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 75.1 | 77 / 210 | 3.24 | 16.9% | 32194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.9% | 77 |
| radnor.DoctorBob 1.42 | 1.8 | 15.9% | 59 |
| mld.Infinity 2.2 | 3.5 | 14.5% | 41 |
| mz.AntiGrav 1.0 | 3.5 | 14.4% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| sample.Walls 1.0 | 6.2 | 7.5% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 4 |
| arthord.MannyPacquiao Beta | 8.8 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.2 | 14 / 35 | 5459 |
| 2 | 1 | 66.4 | 72.7 | 9 / 35 | 6013 |
| 3 | 1 | 66.9 | 78.1 | 13 / 35 | 5365 |
| 4 | 1 | 65.3 | 69.2 | 14 / 35 | 5093 |
| 5 | 1 | 67.3 | 76.8 | 17 / 35 | 5145 |
| 6 | 2 | 64.8 | 71.4 | 10 / 35 | 5119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 41 | 56% |
| mz.AntiGrav 1.0 | 39 | 87% |
| radnor.DoctorBob 1.42 | 30 | 47% |
| sample.Walls 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| amz.NanoClone 1.41 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 52 | 39% | 70 |
| mld.Infinity 2.2 | 33 | 25% | 27 |
| mz.AntiGrav 1.0 | 21 | 16% | 65 |
| amz.NanoClone 1.41 | 12 | 9% | 19 |
| jangs.ns51 1.0 | 5 | 4% | 9 |
| sample.Walls 1.0 | 4 | 3% | 9 |
| GarmBox.Oranges 1.0 | 3 | 2% | 5 |
| arthord.MannyPacquiao Beta | 3 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.1 | 116 / 210 | 2.61 | 17.1% | 24685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 17.1% | 116 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.5% | 61 |
| mld.DustBunny 3.8 | 2.5 | 14.3% | 18 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.1% | 6 |
| zyx.nano.Ant 1.1 | 6.3 | 8.0% | 1 |
| bzdp.BoxCar 2.0 | 7.3 | 7.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.0% | 2 |
| fullsail.SweetTea 1.1 | 8.8 | 5.4% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 85.4 | 18 / 35 | 3730 |
| 2 | 1 | 67.9 | 87.6 | 23 / 35 | 4212 |
| 3 | 1 | 66.2 | 82.2 | 22 / 35 | 4075 |
| 4 | 1 | 67.0 | 86.7 | 20 / 35 | 3882 |
| 5 | 1 | 68.8 | 91.1 | 26 / 35 | 4237 |
| 6 | 3 | 61.1 | 59.7 | 7 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 73% |
| mld.DustBunny 3.8 | 45 | 93% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 49% | 102 |
| mld.DustBunny 3.8 | 21 | 22% | 57 |
| zyx.nano.Ant 1.1 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 6 | 6% | 9 |
| cs.Grudge 1.0 | 5 | 5% | 6 |
| maribo.melee.BMV 0.1 | 4 | 4% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 12 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.5 | 101 / 210 | 3.12 | 17.3% | 29566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.3% | 101 |
| myl.micro.Troodon 1.10 | 1.8 | 15.5% | 46 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 13.3% | 16 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.2% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.3% | 23 |
| fm.mammillarias 1.3 | 5.7 | 9.6% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.1% | 4 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |
| sample.Fire 1.0 | 9.5 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.3 | 21 / 35 | 5382 |
| 2 | 1 | 65.8 | 76.2 | 14 / 35 | 4542 |
| 3 | 1 | 67.2 | 78.7 | 19 / 35 | 5066 |
| 4 | 1 | 64.4 | 70.5 | 14 / 35 | 4783 |
| 5 | 1 | 66.6 | 78.1 | 16 / 35 | 4923 |
| 6 | 2 | 64.9 | 68.9 | 17 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 86% |
| myl.nano.KomoriNinja 1.1 | 21 | 86% |
| cb.nano.Insomnia 1.0 | 21 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 71% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 109 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 22% | 82 |
| stelo.SoRobotNanoMelee 1.2 | 24 | 22% | 32 |
| cb.nano.Insomnia 1.0 | 22 | 20% | 21 |
| myl.nano.KomoriNinja 1.1 | 15 | 14% | 36 |
| fm.mammillarias 1.3 | 12 | 11% | 14 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 10 |
| sample.Fire 1.0 | 3 | 3% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.3 | 102 / 210 | 2.95 | 17.3% | 30106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.3% | 102 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.9% | 23 |
| tvv.micro.Antares 1.1.1 | 2.5 | 13.5% | 35 |
| tj.zombie1n 1.0.1 | 5.2 | 9.5% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.1% | 1 |
| yk.JahMicro 1.0 | 6.2 | 9.0% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.6 | 22 / 35 | 5271 |
| 2 | 1 | 67.0 | 78.1 | 19 / 35 | 5618 |
| 3 | 2 | 61.1 | 65.1 | 9 / 35 | 4300 |
| 4 | 1 | 66.8 | 82.9 | 15 / 35 | 4961 |
| 5 | 1 | 66.5 | 79.7 | 16 / 35 | 4815 |
| 6 | 1 | 67.9 | 83.5 | 21 / 35 | 5141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 90% |
| tvv.micro.Antares 1.1.1 | 27 | 63% |
| stelo.SoJNanoMelee 1.1 | 24 | 54% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| tj.zombie1n 1.0.1 | 7 | 71% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 30% | 82 |
| tvv.micro.Antares 1.1.1 | 26 | 24% | 45 |
| stelo.SoJNanoMelee 1.1 | 22 | 20% | 37 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 7% | 11 |
| tj.zombie1n 1.0.1 | 6 | 6% | 9 |
| yk.JahMicro 1.0 | 6 | 6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 13 |
| repositorio.NanoStep 1.0 | 2 | 2% | 3 |
| sample.VelociRobot 1.0 | 2 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 67.0 | 82 / 210 | 3.97 | 15.0% | 25600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 15.0% | 82 |
| oog.melee.Corsair 1.0 | 2.7 | 12.7% | 32 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 12.1% | 32 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 16 |
| EBBU.Sim2 1.02 | 6.3 | 9.5% | 4 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.9% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 61.3 | 10 / 35 | 3974 |
| 2 | 1 | 61.4 | 63.5 | 13 / 35 | 4344 |
| 3 | 1 | 63.6 | 69.8 | 11 / 35 | 4863 |
| 4 | 1 | 64.4 | 73.0 | 18 / 35 | 4399 |
| 5 | 1 | 63.9 | 73.3 | 19 / 35 | 4049 |
| 6 | 1 | 60.0 | 61.3 | 11 / 35 | 3971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 93% |
| oog.melee.Corsair 1.0 | 21 | 71% |
| ahf.NanoAndrew .4 | 18 | 83% |
| sam.Samspin 1.0 | 13 | 54% |
| EBBU.Sim2 1.02 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 20% | 48 |
| ahf.NanoAndrew .4 | 25 | 19% | 39 |
| sam.Samspin 1.0 | 15 | 12% | 25 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 19 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 20 |
| EBBU.Sim2 1.02 | 12 | 9% | 22 |
| oog.melee.Corsair 1.0 | 11 | 9% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 8 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.1 | 111 / 210 | 2.70 | 16.9% | 24375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.9% | 111 |
| d414.nano.Quantum 1.0.0 | 1.8 | 14.8% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.2% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.9% | 21 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.4% | 9 |
| fm.claire 1.7 | 6.8 | 8.6% | 4 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 2 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| kurios.DOSexe .9b | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.9 | 16 / 35 | 4397 |
| 2 | 1 | 67.9 | 84.8 | 24 / 35 | 4731 |
| 3 | 1 | 66.0 | 85.4 | 19 / 35 | 3817 |
| 4 | 2 | 63.8 | 76.5 | 15 / 35 | 3815 |
| 5 | 1 | 66.8 | 83.8 | 20 / 35 | 3956 |
| 6 | 1 | 64.2 | 80.3 | 17 / 35 | 3659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 80% |
| oog.melee.CapuletDroid 1.1 | 30 | 73% |
| gh.nano.Grofvuil 0.2 | 20 | 80% |
| arthord.NanoSatanMelee Beta | 11 | 91% |
| winamp32.micro.MicroMacro 1.0 | 9 | 78% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 67% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 102 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 28% | 83 |
| gh.nano.Grofvuil 0.2 | 17 | 17% | 42 |
| arthord.NanoSatanMelee Beta | 16 | 16% | 26 |
| oog.melee.CapuletDroid 1.1 | 14 | 14% | 11 |
| fm.claire 1.7 | 9 | 9% | 11 |
| pa.Improved 1.0 | 5 | 5% | 9 |
| sample.SpinBot 1.0 | 4 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 12 |
| kurios.DOSexe .9b | 3 | 3% | 6 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 74.3 | 75 / 210 | 3.31 | 15.4% | 24870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.8 | 16.2% | 51 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 15.0% | 39 |
| hadur117.micro.SaorOG1 0.1 | 2.3 | 15.4% | 75 |
| mz.MicroGodMelee 1 | 3.7 | 13.4% | 21 |
| DBall.Anarchy 0.1 | 5.0 | 9.5% | 15 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 4 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 3 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.6% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 80.3 | 15 / 35 | 4509 |
| 2 | 3 | 62.0 | 70.8 | 13 / 35 | 3637 |
| 3 | 2 | 63.9 | 75.9 | 13 / 35 | 4004 |
| 4 | 4 | 58.8 | 60.6 | 9 / 35 | 3700 |
| 5 | 2 | 65.1 | 77.5 | 13 / 35 | 4498 |
| 6 | 2 | 65.8 | 80.6 | 12 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 51% |
| gh.micro.Gruweltje 0.7 | 34 | 56% |
| mz.MicroGodMelee 1 | 33 | 91% |
| DBall.Anarchy 0.1 | 6 | 50% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| el.JumpShoot 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 40 | 30% | 62 |
| spinnercat.micro.Tyger 0.1 | 35 | 26% | 58 |
| mz.MicroGodMelee 1 | 24 | 18% | 46 |
| DBall.Anarchy 0.1 | 10 | 7% | 12 |
| acogdev.alpha 0.2 | 8 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 8 |
| fire219.CatBot 1.0 | 6 | 4% | 6 |
| el.JumpShoot 0.2 | 3 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 63.7 | 71 / 210 | 4.27 | 14.3% | 26001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.1% | 65 |
| hadur117.micro.SaorOG1 0.1 | 2.2 | 14.3% | 71 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.4% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.3% | 5 |
| germ.TheMind .2 | 5.2 | 9.7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.9% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.6% | 10 |
| stelo.UntouchableNano 1.3 | 7.8 | 8.1% | 13 |
| sample.Crazy 1.0 | 8.0 | 7.4% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.6 | 51.1 | 9 / 35 | 3978 |
| 2 | 2 | 61.4 | 67.6 | 13 / 35 | 3854 |
| 3 | 2 | 62.9 | 69.2 | 9 / 35 | 4832 |
| 4 | 2 | 60.9 | 64.4 | 13 / 35 | 4163 |
| 5 | 3 | 59.5 | 57.8 | 12 / 35 | 4157 |
| 6 | 1 | 64.9 | 71.7 | 15 / 35 | 5017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 81% |
| awesomeness.Elite 1.0 | 9 | 89% |
| germ.TheMind .2 | 8 | 63% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 42% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 21% | 44 |
| germ.TheMind .2 | 18 | 13% | 24 |
| awesomeness.Elite 1.0 | 14 | 10% | 21 |
| qualidafial.MajorDick 1.0.1 | 9 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.1 | 99 / 210 | 2.88 | 16.3% | 20776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 16.3% | 99 |
| rz.HawkOnFire 0.1 | 2.2 | 14.2% | 27 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.7% | 35 |
| maribo.IotaCT 1.1 | 3.8 | 11.6% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 2 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.7% | 9 |
| ratosh.Wesco 1.4 | 7.8 | 7.9% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 8.2% | 7 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.4 | 18 / 35 | 3354 |
| 2 | 2 | 64.4 | 77.1 | 13 / 35 | 3213 |
| 3 | 2 | 61.9 | 72.1 | 11 / 35 | 3036 |
| 4 | 1 | 66.4 | 81.6 | 17 / 35 | 4000 |
| 5 | 1 | 67.2 | 84.1 | 19 / 35 | 3862 |
| 6 | 1 | 65.5 | 80.3 | 21 / 35 | 3311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 41 | 93% |
| nz.jdc.nano.GridFu 1.0 | 40 | 73% |
| maribo.IotaCT 1.1 | 10 | 50% |
| timmit.nano.TimDog 0.33 | 7 | 100% |
| stelo.PatternRobot 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 5 | 80% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 24 | 21% | 57 |
| rz.HawkOnFire 0.1 | 21 | 19% | 47 |
| maribo.IotaCT 1.1 | 19 | 17% | 28 |
| ratosh.Wesco 1.4 | 13 | 12% | 22 |
| timmit.nano.TimDog 0.33 | 13 | 12% | 21 |
| stelo.PatternRobot 1.0 | 11 | 10% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 9 |
| spinnercat.Omen 1.0 | 5 | 4% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 0 |

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.8 | 135 / 210 | 2.10 | 19.3% | 31342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 19.3% | 135 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.4% | 35 |
| baal.nano.N 1.42 | 3.3 | 11.7% | 7 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.4% | 5 |
| zyx.micro.Ant 1.1 | 5.0 | 9.6% | 11 |
| sanja.First 0.1 | 6.7 | 8.4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.2% | 1 |
| cvt.Firsty 1.0 | 7.3 | 7.3% | 9 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.2% | 2 |
| sample.RamFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.1 | 26 / 35 | 5228 |
| 2 | 1 | 70.4 | 92.4 | 23 / 35 | 5729 |
| 3 | 1 | 71.2 | 93.7 | 29 / 35 | 5608 |
| 4 | 1 | 68.7 | 88.6 | 21 / 35 | 5111 |
| 5 | 1 | 66.6 | 83.8 | 18 / 35 | 4427 |
| 6 | 1 | 66.2 | 76.2 | 18 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 76% |
| baal.nano.N 1.42 | 36 | 94% |
| cvt.Firsty 1.0 | 23 | 74% |
| Grystrion.TrackerWO 1.0 | 17 | 82% |
| sanja.First 0.1 | 16 | 81% |
| zyx.micro.Ant 1.1 | 14 | 86% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| amk.Punbot.Punbot 0.01 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 25 | 33% | 67 |
| zyx.micro.Ant 1.1 | 21 | 28% | 40 |
| Grystrion.TrackerWO 1.0 | 7 | 9% | 17 |
| baal.nano.N 1.42 | 6 | 8% | 29 |
| cvt.Firsty 1.0 | 6 | 8% | 21 |
| sanja.First 0.1 | 4 | 5% | 17 |
| squidM.TentalceMeleeNano 1.1 | 4 | 5% | 11 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 61.4 | 56 / 210 | 4.47 | 13.1% | 23643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 15.1% | 82 |
| hadur117.micro.SaorOG1 0.1 | 2.5 | 13.1% | 56 |
| cs.Wren 1.0 | 2.7 | 13.1% | 20 |
| js.PinBall 1.6 | 4.2 | 11.8% | 17 |
| mz.Cork 0.1 | 4.7 | 11.5% | 15 |
| joe.ADinosaur 1.0 | 6.3 | 9.6% | 8 |
| evd.X1 0.01 | 6.8 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 6 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 61.6 | 8 / 35 | 3417 |
| 2 | 2 | 63.2 | 72.4 | 14 / 35 | 4130 |
| 3 | 3 | 56.5 | 52.7 | 9 / 35 | 4267 |
| 4 | 2 | 58.4 | 61.0 | 7 / 35 | 3914 |
| 5 | 3 | 55.8 | 54.0 | 7 / 35 | 3786 |
| 6 | 2 | 60.8 | 67.0 | 11 / 35 | 4129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 36% |
| cs.Wren 1.0 | 18 | 83% |
| mz.Cork 0.1 | 11 | 82% |
| js.PinBall 1.6 | 9 | 89% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 36% | 75 |
| cs.Wren 1.0 | 21 | 13% | 32 |
| evd.X1 0.01 | 21 | 13% | 22 |
| mz.Cork 0.1 | 16 | 10% | 25 |
| js.PinBall 1.6 | 15 | 10% | 20 |
| joe.ADinosaur 1.0 | 12 | 8% | 12 |
| PSW.Relentless 0.1 | 9 | 6% | 10 |
| jsal.Jsalbot 1.0 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 77.0 | 104 / 210 | 3.07 | 16.5% | 23415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.5% | 104 |
| myl.nano.Graviton 1.10 | 3.2 | 12.2% | 29 |
| ntc.Opposite 1.5 | 3.2 | 11.8% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 11.0% | 29 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 7 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 6 |
| disan.Chair 2.2.0 | 7.7 | 7.9% | 8 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 6 |
| pbg.R2D2 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 78.1 | 17 / 35 | 3942 |
| 2 | 1 | 61.6 | 68.9 | 11 / 35 | 3840 |
| 3 | 1 | 63.9 | 76.5 | 16 / 35 | 3782 |
| 4 | 1 | 64.7 | 75.9 | 20 / 35 | 3959 |
| 5 | 1 | 66.8 | 81.9 | 21 / 35 | 3894 |
| 6 | 1 | 66.1 | 80.6 | 19 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 30 | 97% |
| stelo.AreaTargetingBot 1.1 | 27 | 41% |
| ntc.Opposite 1.5 | 18 | 89% |
| DBall.NUKE 0.1 | 14 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 75% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| donjezza.Muncho 1.0 | 11 | 91% |
| disan.Chair 2.2.0 | 7 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 24 | 23% | 32 |
| myl.nano.Graviton 1.10 | 19 | 18% | 46 |
| pfvicm.Sobieski 7.2.3b | 17 | 16% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 13% | 30 |
| ntc.Opposite 1.5 | 12 | 11% | 26 |
| DBall.NUKE 0.1 | 7 | 7% | 18 |
| disan.Chair 2.2.0 | 6 | 6% | 10 |
| donjezza.Muncho 1.0 | 4 | 4% | 16 |
| pbg.R2D2 1.0 | 3 | 3% | 8 |

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 66.7 | 78 / 210 | 4.00 | 14.2% | 21436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 15.4% | 59 |
| hadur117.micro.SaorOG1 0.1 | 2.5 | 14.2% | 78 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.2% | 38 |
| yagami.Tidus 0.11 | 4.0 | 12.7% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.1% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 6 |
| stelo.MirrorNano 1.3 | 7.3 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 66.3 | 14 / 35 | 3484 |
| 2 | 5 | 56.1 | 53.7 | 7 / 35 | 3274 |
| 3 | 1 | 62.9 | 68.3 | 16 / 35 | 3662 |
| 4 | 2 | 63.4 | 68.9 | 13 / 35 | 3593 |
| 5 | 1 | 65.7 | 77.5 | 16 / 35 | 3790 |
| 6 | 3 | 61.7 | 65.7 | 12 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 79% |
| kawigi.micro.Shiz 1.1 | 23 | 87% |
| yagami.Tidus 0.11 | 15 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 100% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 132 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 45% | 76 |
| yagami.Tidus 0.11 | 23 | 17% | 39 |
| kawigi.micro.Shiz 1.1 | 13 | 10% | 32 |
| ejb.Polaris 1.0.1 | 12 | 9% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 8% | 29 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 69.8 | 81 / 210 | 3.71 | 14.4% | 19906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 14.4% | 81 |
| wee.Gem 1.8.4 | 2.5 | 13.6% | 52 |
| wompi.Quokka 1.6 | 3.2 | 12.1% | 28 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 22 |
| ratosh.Nobo 0.21 | 4.7 | 11.1% | 7 |
| m3thos.Eva00 1.1 | 6.5 | 9.6% | 5 |
| bayen.UbaMicro 1.4 | 6.5 | 9.3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.6% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 3 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 74.3 | 15 / 35 | 3554 |
| 2 | 2 | 57.9 | 59.7 | 11 / 35 | 3300 |
| 3 | 1 | 61.3 | 70.8 | 15 / 35 | 3161 |
| 4 | 1 | 60.0 | 68.6 | 12 / 35 | 3112 |
| 5 | 1 | 63.1 | 73.7 | 14 / 35 | 3743 |
| 6 | 2 | 61.4 | 72.1 | 14 / 35 | 3036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 35 | 66% |
| bzdp.Pansy 2.1 | 28 | 82% |
| wompi.Quokka 1.6 | 15 | 87% |
| ratosh.Nobo 0.21 | 12 | 92% |
| m3thos.Eva00 1.1 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 35 | 27% | 64 |
| wompi.Quokka 1.6 | 21 | 16% | 26 |
| bzdp.Pansy 2.1 | 18 | 14% | 44 |
| ratosh.Nobo 0.21 | 13 | 10% | 23 |
| stelo.MyAgileRobot 0.2 | 10 | 8% | 12 |
| maribo.FollowFire 1 | 10 | 8% | 11 |
| bayen.UbaMicro 1.4 | 8 | 6% | 11 |
| m3thos.Eva00 1.1 | 7 | 5% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 79.4 | 26 / 210 | 2.85 | 18.0% | 41801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.3% | 165 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 18.0% | 26 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 12 |
| ayk.WallHugger 1.0 | 4.7 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 81.9 | 10 / 35 | 6822 |
| 2 | 2 | 67.5 | 75.2 | 2 / 35 | 6506 |
| 3 | 2 | 69.8 | 81.3 | 2 / 35 | 7527 |
| 4 | 2 | 68.5 | 76.8 | 6 / 35 | 6899 |
| 5 | 2 | 69.3 | 78.1 | 2 / 35 | 7251 |
| 6 | 2 | 69.7 | 83.2 | 4 / 35 | 6796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 9% |
| mz.NanoGod 2.02 | 12 | 75% |
| exauge.GateKeeper 1.1.121g | 4 | 50% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 139 | 76% | 151 |
| mz.NanoGod 2.02 | 29 | 16% | 39 |
| ayk.WallHugger 1.0 | 7 | 4% | 8 |
| stelo.PianistNano 1.2 | 4 | 2% | 5 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 69.3 | 90 / 210 | 3.76 | 15.0% | 22592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 15.0% | 90 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.8% | 29 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.3% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.7% | 20 |
| bvh.micro.Freya 0.3 | 4.5 | 11.5% | 17 |
| conscience.Electron 1.3g | 6.3 | 8.6% | 6 |
| stelo.MirrorMicro 1.0 | 6.5 | 9.0% | 6 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 10 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 69.2 | 15 / 35 | 3951 |
| 2 | 1 | 62.8 | 71.4 | 14 / 35 | 3865 |
| 3 | 1 | 63.6 | 73.7 | 16 / 35 | 4072 |
| 4 | 2 | 60.6 | 67.6 | 13 / 35 | 3294 |
| 5 | 1 | 63.1 | 69.2 | 18 / 35 | 3949 |
| 6 | 1 | 60.3 | 64.8 | 14 / 35 | 3461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 73% |
| davidalves.net.DuelistMicroMelee 1.4 | 30 | 87% |
| dummy.micro.Sparrow 2.5 | 20 | 60% |
| bvh.micro.Freya 0.3 | 19 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 22 | 18% | 39 |
| conscience.Electron 1.3g | 22 | 18% | 24 |
| voidious.micro.BlitzBat 1.05 | 21 | 17% | 53 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 16% | 49 |
| bvh.micro.Freya 0.3 | 12 | 10% | 17 |
| dl.BetterWalls 1.0 | 11 | 9% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 5 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 79.7 | 117 / 210 | 2.82 | 18.4% | 32527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 18.4% | 117 |
| sheldor.melee.nano.TestMelee 0.1 | 1.8 | 17.1% | 43 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 16 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.2% | 9 |
| dsw.StaticD 1.0 | 5.3 | 9.1% | 7 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.6% | 8 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 4 |
| sample.Corners 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 78.4 | 19 / 35 | 5232 |
| 2 | 1 | 68.5 | 79.7 | 20 / 35 | 5803 |
| 3 | 1 | 67.6 | 79.4 | 21 / 35 | 4993 |
| 4 | 1 | 68.9 | 81.9 | 20 / 35 | 5598 |
| 5 | 1 | 67.6 | 76.2 | 16 / 35 | 5919 |
| 6 | 2 | 68.4 | 82.9 | 21 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 70 | 86% |
| sul.Lunar 1.1 | 26 | 100% |
| supersample.SuperBoxBot 1.0 | 17 | 88% |
| dsw.StaticD 1.0 | 8 | 75% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 2 | 0% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |

Hadur died in 93 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 42 | 45% | 99 |
| supersample.SuperBoxBot 1.0 | 21 | 23% | 34 |
| dsw.StaticD 1.0 | 8 | 9% | 16 |
| mme.NikeEnhanced 2.0 | 7 | 8% | 10 |
| sul.Lunar 1.1 | 4 | 4% | 27 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 10 |
| tlp.ThreeLeggedPig 1 | 3 | 3% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 6 |
| sample.Corners 1.0 | 2 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.6 | 87 / 210 | 3.01 | 16.8% | 31972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.8% | 87 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 13.3% | 36 |
| mld.Wisdom 1.0 | 3.7 | 12.2% | 17 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.0% | 6 |
| amz.NanoClone 1.41 | 5.7 | 10.0% | 9 |
| sample.Walls 1.0 | 7.5 | 7.4% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.3 | 14 / 35 | 5541 |
| 2 | 1 | 67.8 | 85.4 | 16 / 35 | 5689 |
| 3 | 1 | 65.3 | 76.2 | 15 / 35 | 5377 |
| 4 | 1 | 64.6 | 75.2 | 16 / 35 | 4791 |
| 5 | 2 | 63.0 | 68.6 | 10 / 35 | 5069 |
| 6 | 1 | 66.1 | 79.0 | 16 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 72% |
| radnor.DoctorBob 1.42 | 30 | 47% |
| mld.Wisdom 1.0 | 24 | 79% |
| jangs.ns51 1.0 | 11 | 64% |
| KiraNL.Chupacabra 0.4 | 7 | 71% |
| amz.NanoClone 1.41 | 6 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 31% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 30% | 70 |
| mld.Wisdom 1.0 | 20 | 16% | 34 |
| KiraNL.Chupacabra 0.4 | 13 | 11% | 22 |
| sample.Walls 1.0 | 6 | 5% | 8 |
| jangs.ns51 1.0 | 5 | 4% | 11 |
| amz.NanoClone 1.41 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

