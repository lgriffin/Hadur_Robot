# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 91.4 | 158 / 210 | 1.77 | 22.1% | 45036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.1% | 158 |
| radnor.DoctorBob 1.42 | 2.5 | 14.2% | 21 |
| mz.AntiGrav 1.0 | 3.0 | 13.8% | 17 |
| mld.Infinity 2.2 | 3.5 | 13.1% | 8 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.2% | 0 |
| sample.Walls 1.0 | 7.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 4.4% | 1 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 87.9 | 24 / 35 | 7319 |
| 2 | 1 | 73.4 | 90.5 | 24 / 35 | 7880 |
| 3 | 1 | 72.6 | 88.6 | 26 / 35 | 7487 |
| 4 | 1 | 73.9 | 95.6 | 28 / 35 | 7551 |
| 5 | 1 | 73.9 | 94.6 | 29 / 35 | 7620 |
| 6 | 1 | 72.6 | 91.4 | 27 / 35 | 7179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 96% |
| radnor.DoctorBob 1.42 | 44 | 80% |
| mld.Infinity 2.2 | 40 | 100% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 48% | 72 |
| mz.AntiGrav 1.0 | 12 | 23% | 64 |
| amz.NanoClone 1.41 | 6 | 12% | 17 |
| mld.Infinity 2.2 | 5 | 10% | 37 |
| jangs.ns51 1.0 | 2 | 4% | 7 |
| sample.Walls 1.0 | 2 | 4% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.0 | 105 / 210 | 3.07 | 17.0% | 30124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.3 | 17.0% | 105 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.8% | 62 |
| mld.DustBunny 3.8 | 2.3 | 14.6% | 21 |
| maribo.melee.BMV 0.1 | 4.5 | 10.2% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.5 | 9.0% | 10 |
| zyx.nano.Ant 1.1 | 5.7 | 8.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 8.0% | 4 |
| fullsail.SweetTea 1.1 | 7.8 | 6.9% | 2 |
| bzdp.BoxCar 2.0 | 8.7 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.8 | 16 / 35 | 5182 |
| 2 | 1 | 66.2 | 78.1 | 19 / 35 | 5101 |
| 3 | 1 | 66.9 | 82.5 | 17 / 35 | 4804 |
| 4 | 1 | 68.2 | 84.8 | 21 / 35 | 5257 |
| 5 | 1 | 68.3 | 87.9 | 23 / 35 | 4805 |
| 6 | 3 | 59.3 | 51.1 | 9 / 35 | 4975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 65 | 88% |
| oog.melee.Mercutio 1.0 | 36 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 34% | 64 |
| mld.DustBunny 3.8 | 30 | 28% | 84 |
| zyx.nano.Ant 1.1 | 14 | 13% | 18 |
| maribo.melee.BMV 0.1 | 9 | 8% | 12 |
| bzdp.BoxCar 2.0 | 6 | 6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 14 |
| fullsail.SweetTea 1.1 | 3 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 5 |
| cs.Grudge 1.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 79.3 | 113 / 210 | 2.87 | 19.0% | 37172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.0% | 113 |
| myl.micro.Troodon 1.10 | 2.0 | 15.3% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.0% | 20 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.4% | 5 |
| fm.mammillarias 1.3 | 6.3 | 8.7% | 1 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.5% | 10 |
| sample.Fire 1.0 | 9.2 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 86.0 | 22 / 35 | 6360 |
| 2 | 1 | 65.4 | 69.5 | 15 / 35 | 5432 |
| 3 | 1 | 68.9 | 81.0 | 17 / 35 | 6389 |
| 4 | 1 | 67.2 | 73.7 | 17 / 35 | 6179 |
| 5 | 1 | 69.6 | 81.6 | 22 / 35 | 6329 |
| 6 | 1 | 70.2 | 83.8 | 20 / 35 | 6483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 62 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 80% |
| myl.nano.KomoriNinja 1.1 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| sp.Nanos.Ember 1.1 | 10 | 60% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 21 | 22% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 19% | 34 |
| myl.micro.Troodon 1.10 | 17 | 18% | 70 |
| myl.nano.KomoriNinja 1.1 | 12 | 12% | 32 |
| sp.Nanos.Ember 1.1 | 10 | 10% | 19 |
| fm.mammillarias 1.3 | 9 | 9% | 9 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 10 |
| sample.Fire 1.0 | 4 | 4% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.5 | 145 / 210 | 2.49 | 20.4% | 41422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.4% | 145 |
| tvv.micro.Antares 1.1.1 | 2.5 | 13.2% | 24 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.1% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 5.3 | 8.8% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.1% | 13 |
| yk.JahMicro 1.0 | 6.5 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.8% | 5 |
| repositorio.NanoStep 1.0 | 9.2 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 80.6 | 20 / 35 | 6669 |
| 2 | 1 | 71.9 | 89.2 | 26 / 35 | 7319 |
| 3 | 1 | 70.5 | 84.1 | 26 / 35 | 6869 |
| 4 | 1 | 71.0 | 84.8 | 28 / 35 | 6988 |
| 5 | 1 | 69.8 | 82.9 | 25 / 35 | 6573 |
| 6 | 1 | 69.3 | 79.4 | 20 / 35 | 7004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 89% |
| tvv.micro.Antares 1.1.1 | 32 | 88% |
| stelo.SoJNanoMelee 1.1 | 20 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 84% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 42% | 90 |
| tvv.micro.Antares 1.1.1 | 9 | 14% | 43 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 14% | 14 |
| stelo.SoJNanoMelee 1.1 | 7 | 11% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 24 |
| tj.zombie1n 1.0.1 | 4 | 6% | 5 |
| repositorio.NanoStep 1.0 | 2 | 3% | 9 |
| yk.JahMicro 1.0 | 2 | 3% | 5 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 67.2 | 92 / 210 | 3.95 | 16.0% | 30639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.0% | 92 |
| oog.melee.Corsair 1.0 | 2.3 | 13.1% | 36 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.0% | 22 |
| EBBU.Sim2 1.02 | 5.5 | 9.9% | 6 |
| sam.Samspin 1.0 | 6.2 | 9.2% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 68.6 | 14 / 35 | 5097 |
| 2 | 1 | 64.2 | 67.3 | 15 / 35 | 5041 |
| 3 | 1 | 64.6 | 66.7 | 17 / 35 | 5189 |
| 4 | 1 | 62.5 | 65.4 | 13 / 35 | 4767 |
| 5 | 1 | 63.5 | 67.0 | 15 / 35 | 5241 |
| 6 | 1 | 64.3 | 68.6 | 18 / 35 | 5304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 92% |
| oog.melee.Corsair 1.0 | 36 | 64% |
| ahf.NanoAndrew .4 | 19 | 84% |
| EBBU.Sim2 1.02 | 6 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 371. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 21% | 56 |
| oog.melee.Corsair 1.0 | 25 | 21% | 49 |
| ahf.NanoAndrew .4 | 13 | 11% | 28 |
| EBBU.Sim2 1.02 | 13 | 11% | 18 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 15 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 13 |
| sam.Samspin 1.0 | 5 | 4% | 10 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.9 | 139 / 210 | 2.09 | 20.0% | 35130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.0% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 29 |
| gh.nano.Grofvuil 0.2 | 3.3 | 12.2% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 13 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 8.9% | 3 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.0% | 5 |
| fm.claire 1.7 | 7.0 | 7.9% | 0 |
| sample.SpinBot 1.0 | 7.8 | 6.5% | 0 |
| pa.Improved 1.0 | 9.0 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.0 | 22 / 35 | 5740 |
| 2 | 1 | 71.6 | 91.4 | 27 / 35 | 6312 |
| 3 | 1 | 69.7 | 87.3 | 22 / 35 | 5762 |
| 4 | 1 | 70.1 | 88.3 | 23 / 35 | 5988 |
| 5 | 1 | 69.5 | 89.2 | 23 / 35 | 5378 |
| 6 | 1 | 70.2 | 90.5 | 22 / 35 | 5950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 86% |
| oog.melee.CapuletDroid 1.1 | 27 | 100% |
| gh.nano.Grofvuil 0.2 | 16 | 75% |
| arthord.NanoSatanMelee Beta | 12 | 67% |
| fm.claire 1.7 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| kurios.DOSexe .9b | 6 | 67% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 38% | 93 |
| gh.nano.Grofvuil 0.2 | 13 | 18% | 30 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 39 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 11 |
| fm.claire 1.7 | 4 | 6% | 10 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| sample.SpinBot 1.0 | 3 | 4% | 3 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 11 |

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 81.5 | 100 / 210 | 2.67 | 18.5% | 35923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.5% | 100 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.4% | 31 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.8% | 37 |
| mz.MicroGodMelee 1 | 3.8 | 13.1% | 33 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 2 |
| acogdev.alpha 0.2 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.2 | 15 / 35 | 6313 |
| 2 | 1 | 68.8 | 84.4 | 17 / 35 | 5982 |
| 3 | 1 | 69.8 | 85.7 | 20 / 35 | 6213 |
| 4 | 1 | 65.8 | 73.7 | 12 / 35 | 5589 |
| 5 | 1 | 65.5 | 73.0 | 17 / 35 | 5284 |
| 6 | 1 | 70.6 | 88.9 | 19 / 35 | 6542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 75% |
| mz.MicroGodMelee 1 | 45 | 69% |
| gh.micro.Gruweltje 0.7 | 31 | 55% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 30% | 71 |
| gh.micro.Gruweltje 0.7 | 31 | 28% | 46 |
| mz.MicroGodMelee 1 | 29 | 26% | 62 |
| acogdev.alpha 0.2 | 7 | 6% | 10 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 70.2 | 100 / 210 | 3.68 | 16.6% | 31953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 16.6% | 100 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.0% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.0% | 34 |
| germ.TheMind .2 | 4.7 | 9.6% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.5% | 6 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 9.0% | 6 |
| stelo.UntouchableNano 1.3 | 7.8 | 8.2% | 7 |
| sample.Crazy 1.0 | 8.8 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 63.2 | 15 / 35 | 5349 |
| 2 | 1 | 64.8 | 70.5 | 17 / 35 | 5087 |
| 3 | 1 | 65.5 | 71.4 | 17 / 35 | 5582 |
| 4 | 2 | 65.3 | 70.8 | 15 / 35 | 5250 |
| 5 | 1 | 64.8 | 69.2 | 18 / 35 | 5232 |
| 6 | 1 | 66.4 | 76.2 | 18 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 94% |
| germ.TheMind .2 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 4 | 50% |
| mym.EdgeStalker 1.0 | 3 | 67% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 48% | 106 |
| germ.TheMind .2 | 15 | 14% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 13% | 30 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| awesomeness.Elite 1.0 | 5 | 5% | 9 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.2 | 143 / 210 | 2.15 | 20.2% | 33968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.2% | 143 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.5% | 13 |
| maribo.IotaCT 1.1 | 4.0 | 10.5% | 7 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.0% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.3% | 3 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 7.9% | 8 |
| spinnercat.Omen 1.0 | 8.5 | 7.3% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.8 | 26 / 35 | 5482 |
| 2 | 1 | 70.1 | 86.0 | 21 / 35 | 5906 |
| 3 | 1 | 70.3 | 86.3 | 24 / 35 | 5608 |
| 4 | 1 | 71.2 | 90.2 | 26 / 35 | 5609 |
| 5 | 1 | 70.9 | 86.7 | 24 / 35 | 5729 |
| 6 | 1 | 70.0 | 84.1 | 22 / 35 | 5634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 97% |
| nz.jdc.nano.GridFu 1.0 | 39 | 92% |
| stelo.PatternRobot 1.0 | 16 | 81% |
| timmit.nano.TimDog 0.33 | 14 | 57% |
| maribo.IotaCT 1.1 | 10 | 90% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 15 | 22% | 64 |
| rz.HawkOnFire 0.1 | 13 | 19% | 67 |
| timmit.nano.TimDog 0.33 | 12 | 18% | 21 |
| stelo.PatternRobot 1.0 | 8 | 12% | 18 |
| ratosh.Wesco 1.4 | 6 | 9% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 5 |
| maribo.IotaCT 1.1 | 4 | 6% | 13 |
| spinnercat.Omen 1.0 | 4 | 6% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.6 | 159 / 210 | 2.03 | 21.4% | 41836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.4% | 159 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 11 |
| baal.nano.N 1.42 | 2.7 | 12.0% | 18 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.5% | 4 |
| zyx.micro.Ant 1.1 | 5.8 | 8.7% | 10 |
| sanja.First 0.1 | 6.2 | 8.4% | 2 |
| amk.Punbot.Punbot 0.01 | 7.0 | 7.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.7% | 0 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 96.8 | 30 / 35 | 7486 |
| 2 | 1 | 71.7 | 89.8 | 28 / 35 | 7170 |
| 3 | 1 | 69.0 | 79.0 | 24 / 35 | 6634 |
| 4 | 1 | 72.1 | 92.7 | 29 / 35 | 6752 |
| 5 | 1 | 70.6 | 84.4 | 27 / 35 | 6700 |
| 6 | 1 | 71.1 | 88.6 | 21 / 35 | 7094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 82% |
| tvv.nano.Polaris 1.2 | 39 | 97% |
| cvt.Firsty 1.0 | 27 | 93% |
| zyx.micro.Ant 1.1 | 18 | 83% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| sanja.First 0.1 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 12 | 23% | 43 |
| zyx.micro.Ant 1.1 | 11 | 21% | 34 |
| cvt.Firsty 1.0 | 6 | 12% | 21 |
| Grystrion.TrackerWO 1.0 | 6 | 12% | 15 |
| amk.Punbot.Punbot 0.01 | 5 | 10% | 10 |
| tvv.nano.Polaris 1.2 | 4 | 8% | 54 |
| sample.RamFire 1.0 | 4 | 8% | 3 |
| sanja.First 0.1 | 2 | 4% | 24 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 4 |

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.5 | 86 / 210 | 3.93 | 15.6% | 31756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.2% | 62 |
| hadur117.micro.SaorWGT 0.1 | 1.5 | 15.6% | 86 |
| cs.Wren 1.0 | 3.2 | 12.5% | 16 |
| mz.Cork 0.1 | 4.2 | 11.1% | 18 |
| js.PinBall 1.6 | 4.7 | 10.4% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.5% | 7 |
| evd.X1 0.01 | 6.8 | 8.5% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.9% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 60.0 | 14 / 35 | 4940 |
| 2 | 1 | 63.6 | 67.0 | 15 / 35 | 5249 |
| 3 | 2 | 63.3 | 68.3 | 10 / 35 | 5526 |
| 4 | 1 | 68.0 | 80.3 | 21 / 35 | 5741 |
| 5 | 1 | 64.6 | 71.1 | 13 / 35 | 5548 |
| 6 | 2 | 59.5 | 58.1 | 13 / 35 | 4752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 60% |
| cs.Wren 1.0 | 19 | 100% |
| jsal.Jsalbot 1.0 | 9 | 100% |
| js.PinBall 1.6 | 9 | 78% |
| mz.Cork 0.1 | 9 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 61 | 49% | 106 |
| evd.X1 0.01 | 18 | 14% | 20 |
| cs.Wren 1.0 | 12 | 10% | 23 |
| js.PinBall 1.6 | 9 | 7% | 15 |
| mz.Cork 0.1 | 8 | 6% | 14 |
| joe.ADinosaur 1.0 | 8 | 6% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.2 | 126 / 210 | 2.60 | 18.7% | 30421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.7% | 126 |
| myl.nano.Graviton 1.10 | 2.8 | 11.8% | 22 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 11.3% | 21 |
| ntc.Opposite 1.5 | 3.7 | 10.9% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 9 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.0% | 2 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 9 |
| DBall.NUKE 0.1 | 8.0 | 7.9% | 3 |
| pbg.R2D2 1.0 | 9.3 | 5.6% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 5.7% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.2 | 22 / 35 | 5268 |
| 2 | 1 | 69.1 | 86.7 | 21 / 35 | 5460 |
| 3 | 1 | 63.3 | 71.1 | 17 / 35 | 4093 |
| 4 | 1 | 69.4 | 87.0 | 21 / 35 | 5429 |
| 5 | 1 | 69.9 | 87.3 | 24 / 35 | 5271 |
| 6 | 1 | 66.6 | 78.1 | 21 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 90% |
| stelo.AreaTargetingBot 1.1 | 35 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 83% |
| disan.Chair 2.2.0 | 15 | 87% |
| ntc.Opposite 1.5 | 13 | 85% |
| DBall.NUKE 0.1 | 11 | 100% |
| donjezza.Muncho 1.0 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 84 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 16 | 19% | 26 |
| pfvicm.Sobieski 7.2.3b | 16 | 19% | 26 |
| stelo.AreaTargetingBot 1.1 | 14 | 17% | 38 |
| ntc.Opposite 1.5 | 13 | 15% | 24 |
| myl.nano.Graviton 1.10 | 9 | 11% | 42 |
| pbg.R2D2 1.0 | 7 | 8% | 13 |
| disan.Chair 2.2.0 | 6 | 7% | 20 |
| DBall.NUKE 0.1 | 2 | 2% | 13 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 75.8 | 92 / 210 | 3.18 | 16.8% | 28323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.8% | 92 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.1% | 33 |
| oog.melee.Capulet 1.2 | 3.2 | 13.7% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 21 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 9 |
| ejb.Polaris 1.0.1 | 5.7 | 10.5% | 12 |
| step.nanoPri 1.0 | 7.5 | 6.9% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.2 | 13 / 35 | 5155 |
| 2 | 1 | 67.8 | 81.6 | 15 / 35 | 4902 |
| 3 | 1 | 64.9 | 71.4 | 15 / 35 | 4378 |
| 4 | 1 | 66.1 | 75.9 | 16 / 35 | 4616 |
| 5 | 1 | 67.7 | 80.0 | 18 / 35 | 4829 |
| 6 | 1 | 64.7 | 69.5 | 15 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 38 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 73% |
| oog.melee.Capulet 1.2 | 23 | 61% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 7 | 57% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 35% | 58 |
| yagami.Tidus 0.11 | 26 | 22% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 18% | 51 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 34 |
| ejb.Polaris 1.0.1 | 9 | 8% | 15 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| step.nanoPri 1.0 | 3 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.4 | 126 / 210 | 2.94 | 17.4% | 28167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.4% | 126 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 21 |
| wee.Gem 1.8.4 | 3.0 | 12.0% | 23 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 12 |
| wompi.Quokka 1.6 | 5.0 | 10.5% | 13 |
| m3thos.Eva00 1.1 | 5.7 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 23 / 35 | 4934 |
| 2 | 1 | 65.8 | 76.2 | 20 / 35 | 4812 |
| 3 | 1 | 65.6 | 79.0 | 15 / 35 | 4694 |
| 4 | 1 | 69.2 | 87.6 | 27 / 35 | 4939 |
| 5 | 1 | 61.8 | 65.1 | 16 / 35 | 4048 |
| 6 | 1 | 67.1 | 82.2 | 25 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 91% |
| wee.Gem 1.8.4 | 37 | 97% |
| ratosh.Nobo 0.21 | 17 | 71% |
| m3thos.Eva00 1.1 | 12 | 75% |
| wompi.Quokka 1.6 | 10 | 80% |
| bayen.UbaMicro 1.4 | 10 | 70% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 16 | 19% | 16 |
| bzdp.Pansy 2.1 | 15 | 18% | 67 |
| ratosh.Nobo 0.21 | 12 | 14% | 24 |
| bayen.UbaMicro 1.4 | 11 | 13% | 17 |
| stelo.MyAgileRobot 0.2 | 10 | 12% | 12 |
| wee.Gem 1.8.4 | 6 | 7% | 39 |
| m3thos.Eva00 1.1 | 6 | 7% | 14 |
| wompi.Quokka 1.6 | 6 | 7% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 4 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 88.6 | 130 / 210 | 2.03 | 22.3% | 51324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.3% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 17 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.6% | 2 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 2 |
| stelo.PianistNano 1.2 | 6.5 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 85.1 | 19 / 35 | 8400 |
| 2 | 1 | 72.7 | 83.8 | 20 / 35 | 8193 |
| 3 | 1 | 75.5 | 93.3 | 26 / 35 | 9177 |
| 4 | 1 | 73.6 | 90.8 | 19 / 35 | 8487 |
| 5 | 1 | 74.6 | 92.7 | 25 / 35 | 8839 |
| 6 | 1 | 72.7 | 85.7 | 21 / 35 | 8228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 121 | 85% |
| mz.NanoGod 2.02 | 17 | 65% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 0% |

Hadur died in 80 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 39% | 135 |
| mz.NanoGod 2.02 | 31 | 39% | 47 |
| ayk.WallHugger 1.0 | 10 | 13% | 12 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 10 |
| stuff.Vlad 0.1 | 3 | 4% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.4 | 116 / 210 | 3.30 | 17.2% | 30341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.2% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.2% | 21 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.7% | 18 |
| bvh.micro.Freya 0.3 | 4.2 | 10.7% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 25 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 5 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 5 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 70.5 | 20 / 35 | 4968 |
| 2 | 1 | 65.6 | 75.9 | 20 / 35 | 4529 |
| 3 | 1 | 64.3 | 68.6 | 19 / 35 | 5043 |
| 4 | 1 | 68.5 | 85.7 | 19 / 35 | 5426 |
| 5 | 1 | 68.7 | 81.6 | 22 / 35 | 5696 |
| 6 | 1 | 62.3 | 64.1 | 16 / 35 | 4679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 96% |
| dummy.micro.Sparrow 2.5 | 27 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 76% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| stelo.MirrorMicro 1.0 | 11 | 91% |
| ap.Frederick 1.1 | 3 | 67% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 17% | 59 |
| dummy.micro.Sparrow 2.5 | 16 | 17% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 17% | 36 |
| conscience.Electron 1.3g | 15 | 16% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 12% | 12 |
| stelo.MirrorMicro 1.0 | 10 | 11% | 22 |
| bvh.micro.Freya 0.3 | 7 | 7% | 16 |
| dl.BetterWalls 1.0 | 3 | 3% | 7 |

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.9 | 149 / 210 | 2.18 | 21.5% | 44064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.5% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 19 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.4% | 9 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 8 |
| tlp.ThreeLeggedPig 1 | 7.7 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.1% | 4 |
| sample.Corners 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.9 | 26 / 35 | 7289 |
| 2 | 1 | 71.1 | 83.2 | 24 / 35 | 7207 |
| 3 | 1 | 74.0 | 93.7 | 28 / 35 | 8023 |
| 4 | 1 | 70.9 | 84.8 | 23 / 35 | 7104 |
| 5 | 1 | 72.5 | 88.6 | 27 / 35 | 7388 |
| 6 | 1 | 70.4 | 82.5 | 21 / 35 | 7053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 95% |
| supersample.SuperBoxBot 1.0 | 34 | 88% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| dsw.StaticD 1.0 | 8 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 28% | 65 |
| supersample.SuperBoxBot 1.0 | 15 | 23% | 31 |
| dsw.StaticD 1.0 | 8 | 12% | 16 |
| sul.Lunar 1.1 | 7 | 11% | 54 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 15 |
| sample.Corners 1.0 | 4 | 6% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 79.8 | 118 / 210 | 2.81 | 18.9% | 40037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.9% | 118 |
| radnor.DoctorBob 1.42 | 2.7 | 12.9% | 27 |
| mld.Wisdom 1.0 | 3.2 | 11.9% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.4% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 9 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.7% | 9 |
| sample.Walls 1.0 | 7.7 | 7.5% | 5 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 77.5 | 19 / 35 | 6385 |
| 2 | 1 | 68.4 | 79.0 | 21 / 35 | 6571 |
| 3 | 1 | 68.6 | 80.0 | 18 / 35 | 6804 |
| 4 | 1 | 68.5 | 79.4 | 19 / 35 | 6604 |
| 5 | 1 | 70.5 | 85.4 | 23 / 35 | 7104 |
| 6 | 1 | 67.6 | 77.8 | 18 / 35 | 6569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 89% |
| radnor.DoctorBob 1.42 | 37 | 76% |
| mld.Wisdom 1.0 | 23 | 78% |
| KiraNL.Chupacabra 0.4 | 11 | 73% |
| amz.NanoClone 1.41 | 10 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 26% | 45 |
| radnor.DoctorBob 1.42 | 22 | 24% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 19% | 52 |
| KiraNL.Chupacabra 0.4 | 10 | 11% | 17 |
| amz.NanoClone 1.41 | 8 | 9% | 18 |
| jangs.ns51 1.0 | 7 | 8% | 14 |
| sample.Walls 1.0 | 3 | 3% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |

