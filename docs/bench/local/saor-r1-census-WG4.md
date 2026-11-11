# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.8 | 136 / 210 | 2.28 | 21.0% | 43460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.0% | 136 |
| radnor.DoctorBob 1.42 | 2.2 | 14.8% | 30 |
| mz.AntiGrav 1.0 | 3.3 | 13.6% | 13 |
| mld.Infinity 2.2 | 3.5 | 13.3% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.5 | 6.7% | 3 |
| GarmBox.Oranges 1.0 | 6.5 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.2 | 5.7% | 2 |
| arthord.MannyPacquiao Beta | 8.8 | 4.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 82.5 | 21 / 35 | 6948 |
| 2 | 1 | 70.3 | 80.0 | 20 / 35 | 7256 |
| 3 | 1 | 73.1 | 88.3 | 26 / 35 | 7810 |
| 4 | 1 | 71.7 | 88.9 | 22 / 35 | 7015 |
| 5 | 1 | 72.6 | 89.8 | 23 / 35 | 7130 |
| 6 | 1 | 72.1 | 85.1 | 24 / 35 | 7301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 93% |
| mld.Infinity 2.2 | 36 | 86% |
| radnor.DoctorBob 1.42 | 36 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 3 | 67% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 42% | 64 |
| mz.AntiGrav 1.0 | 16 | 22% | 76 |
| mld.Infinity 2.2 | 12 | 16% | 36 |
| amz.NanoClone 1.41 | 7 | 9% | 11 |
| jangs.ns51 1.0 | 4 | 5% | 10 |
| sample.Walls 1.0 | 3 | 4% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.1 | 119 / 210 | 2.34 | 18.8% | 33476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.8% | 119 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.4% | 56 |
| mld.DustBunny 3.8 | 2.7 | 13.9% | 17 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 3 |
| zyx.nano.Ant 1.1 | 6.0 | 8.3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.0% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.5% | 5 |
| fullsail.SweetTea 1.1 | 7.8 | 6.2% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 20 / 35 | 5719 |
| 2 | 1 | 69.4 | 90.2 | 22 / 35 | 5341 |
| 3 | 1 | 69.0 | 87.9 | 20 / 35 | 5854 |
| 4 | 1 | 68.4 | 82.2 | 19 / 35 | 5820 |
| 5 | 1 | 67.2 | 81.6 | 18 / 35 | 5187 |
| 6 | 1 | 68.0 | 80.6 | 20 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 75 | 72% |
| mld.DustBunny 3.8 | 51 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 6 | 83% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 47% | 103 |
| mld.DustBunny 3.8 | 20 | 22% | 57 |
| zyx.nano.Ant 1.1 | 9 | 10% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 10 |
| fullsail.SweetTea 1.1 | 4 | 4% | 7 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 82.3 | 122 / 210 | 2.60 | 19.7% | 38009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.7% | 122 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.7% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.8% | 15 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 6 |
| fm.mammillarias 1.3 | 5.3 | 9.9% | 9 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.9% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 5 |
| sample.Fire 1.0 | 9.2 | 5.3% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.9 | 19 / 35 | 6068 |
| 2 | 1 | 69.4 | 82.2 | 20 / 35 | 6360 |
| 3 | 1 | 68.6 | 78.4 | 18 / 35 | 6291 |
| 4 | 1 | 69.9 | 82.5 | 20 / 35 | 6620 |
| 5 | 1 | 71.0 | 85.7 | 25 / 35 | 6388 |
| 6 | 1 | 69.7 | 82.9 | 20 / 35 | 6282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 36 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 89% |
| myl.nano.KomoriNinja 1.1 | 21 | 81% |
| cb.nano.Insomnia 1.0 | 19 | 89% |
| sp.Nanos.Ember 1.1 | 12 | 67% |
| fm.mammillarias 1.3 | 11 | 91% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 23% | 40 |
| myl.nano.KomoriNinja 1.1 | 18 | 20% | 42 |
| cb.nano.Insomnia 1.0 | 18 | 20% | 23 |
| myl.micro.Troodon 1.10 | 10 | 11% | 52 |
| fm.mammillarias 1.3 | 9 | 10% | 20 |
| sp.Nanos.Ember 1.1 | 9 | 10% | 20 |
| sample.Fire 1.0 | 3 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.1 | 143 / 210 | 2.43 | 20.2% | 39373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.2% | 143 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.8% | 18 |
| tj.zombie1n 1.0.1 | 6.2 | 8.5% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.5% | 8 |
| yk.JahMicro 1.0 | 6.3 | 8.5% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.1 | 27 / 35 | 7008 |
| 2 | 1 | 71.1 | 88.3 | 25 / 35 | 6680 |
| 3 | 1 | 67.3 | 77.1 | 20 / 35 | 5602 |
| 4 | 1 | 69.0 | 79.4 | 21 / 35 | 6948 |
| 5 | 1 | 70.2 | 84.4 | 25 / 35 | 6444 |
| 6 | 1 | 70.0 | 83.2 | 25 / 35 | 6691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 86% |
| stelo.SoJNanoMelee 1.1 | 32 | 94% |
| tvv.micro.Antares 1.1.1 | 24 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 81% |
| tj.zombie1n 1.0.1 | 10 | 90% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 34% | 76 |
| stelo.SoJNanoMelee 1.1 | 11 | 16% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 12% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 10% | 30 |
| tvv.micro.Antares 1.1.1 | 7 | 10% | 28 |
| yk.JahMicro 1.0 | 6 | 9% | 15 |
| tj.zombie1n 1.0.1 | 5 | 7% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.4 | 87 / 210 | 3.57 | 16.6% | 31456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.6% | 87 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 38 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 25 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.9% | 19 |
| EBBU.Sim2 1.02 | 5.2 | 10.2% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.3% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 12 |
| sam.Samspin 1.0 | 7.2 | 9.2% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 72.4 | 14 / 35 | 4896 |
| 2 | 1 | 65.5 | 71.1 | 15 / 35 | 5562 |
| 3 | 1 | 65.6 | 73.7 | 15 / 35 | 5397 |
| 4 | 1 | 65.8 | 72.7 | 17 / 35 | 5512 |
| 5 | 1 | 64.5 | 70.2 | 14 / 35 | 5193 |
| 6 | 1 | 63.3 | 68.6 | 12 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 84% |
| ahf.NanoAndrew .4 | 24 | 75% |
| oog.melee.Corsair 1.0 | 23 | 57% |
| sam.Samspin 1.0 | 10 | 90% |
| EBBU.Sim2 1.02 | 10 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 20% | 51 |
| oog.melee.Corsair 1.0 | 21 | 17% | 35 |
| ahf.NanoAndrew .4 | 16 | 13% | 38 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 22 |
| EBBU.Sim2 1.02 | 12 | 10% | 17 |
| robar.nano.Assertive_Melee 0.2 | 10 | 8% | 15 |
| sam.Samspin 1.0 | 10 | 8% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| sample.TrackFire 1.0 | 5 | 4% | 8 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.0 | 138 / 210 | 2.08 | 19.6% | 33125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.6% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 18 |
| winamp32.micro.MicroMacro 1.0 | 4.8 | 9.5% | 8 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 8.9% | 14 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 4 |
| fm.claire 1.7 | 6.3 | 8.3% | 0 |
| sample.SpinBot 1.0 | 8.3 | 7.0% | 0 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 24 / 35 | 5324 |
| 2 | 1 | 69.2 | 88.6 | 21 / 35 | 5513 |
| 3 | 1 | 71.4 | 92.4 | 30 / 35 | 5915 |
| 4 | 1 | 68.8 | 88.9 | 22 / 35 | 5174 |
| 5 | 1 | 70.4 | 91.7 | 24 / 35 | 5825 |
| 6 | 1 | 67.5 | 83.2 | 17 / 35 | 5374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 89% |
| gh.nano.Grofvuil 0.2 | 24 | 79% |
| oog.melee.CapuletDroid 1.1 | 15 | 100% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 11 | 91% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 36% | 100 |
| gh.nano.Grofvuil 0.2 | 17 | 24% | 36 |
| arthord.NanoSatanMelee Beta | 9 | 13% | 17 |
| oog.melee.CapuletDroid 1.1 | 6 | 8% | 22 |
| fm.claire 1.7 | 5 | 7% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 10 |
| kurios.DOSexe .9b | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 6 |
| pa.Improved 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.2 | 110 / 210 | 2.79 | 18.5% | 35586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.5% | 110 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.9% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.1% | 30 |
| mz.MicroGodMelee 1 | 3.3 | 13.1% | 22 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.1% | 3 |
| el.JumpShoot 0.2 | 7.3 | 6.3% | 0 |
| acogdev.alpha 0.2 | 8.2 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 83.8 | 20 / 35 | 6221 |
| 2 | 1 | 69.2 | 80.6 | 20 / 35 | 6264 |
| 3 | 1 | 67.9 | 79.4 | 18 / 35 | 5942 |
| 4 | 1 | 67.0 | 75.9 | 15 / 35 | 5822 |
| 5 | 1 | 67.4 | 78.4 | 18 / 35 | 5446 |
| 6 | 1 | 68.6 | 82.9 | 19 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 83% |
| mz.MicroGodMelee 1 | 37 | 76% |
| gh.micro.Gruweltje 0.7 | 33 | 61% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 32% | 55 |
| mz.MicroGodMelee 1 | 21 | 21% | 53 |
| spinnercat.micro.Tyger 0.1 | 16 | 16% | 59 |
| acogdev.alpha 0.2 | 10 | 10% | 10 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 10 |
| fire219.CatBot 1.0 | 6 | 6% | 5 |
| DBall.Anarchy 0.1 | 4 | 4% | 9 |
| el.JumpShoot 0.2 | 1 | 1% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 71.0 | 102 / 210 | 3.61 | 16.7% | 31743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.7% | 102 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.2% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 27 |
| germ.TheMind .2 | 4.7 | 9.9% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.6% | 7 |
| awesomeness.Elite 1.0 | 6.5 | 8.5% | 8 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 8.2% | 4 |
| sample.Crazy 1.0 | 8.2 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.1 | 17 / 35 | 5167 |
| 2 | 1 | 67.6 | 79.4 | 22 / 35 | 5436 |
| 3 | 1 | 63.6 | 67.0 | 15 / 35 | 5077 |
| 4 | 1 | 68.0 | 79.0 | 20 / 35 | 5575 |
| 5 | 1 | 62.3 | 64.8 | 13 / 35 | 5067 |
| 6 | 1 | 63.5 | 63.8 | 15 / 35 | 5421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 89% |
| awesomeness.Elite 1.0 | 11 | 73% |
| germ.TheMind .2 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 44% | 99 |
| germ.TheMind .2 | 15 | 14% | 24 |
| awesomeness.Elite 1.0 | 12 | 11% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 10% | 28 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.3 | 155 / 210 | 1.96 | 20.6% | 33565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.6% | 155 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.5% | 15 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 7 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.6% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 2 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 90.5 | 27 / 35 | 5921 |
| 2 | 1 | 71.2 | 89.8 | 27 / 35 | 5294 |
| 3 | 1 | 70.4 | 87.3 | 26 / 35 | 5459 |
| 4 | 1 | 70.9 | 88.3 | 25 / 35 | 5682 |
| 5 | 1 | 70.3 | 88.6 | 23 / 35 | 5477 |
| 6 | 1 | 71.7 | 91.4 | 27 / 35 | 5732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 96% |
| nz.jdc.nano.GridFu 1.0 | 37 | 95% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| maribo.IotaCT 1.1 | 9 | 89% |
| ratosh.Wesco 1.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 50% |

Hadur died in 55 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 22% | 79 |
| nz.jdc.nano.GridFu 1.0 | 12 | 22% | 48 |
| stelo.PatternRobot 1.0 | 7 | 13% | 19 |
| ratosh.Wesco 1.4 | 7 | 13% | 15 |
| maribo.IotaCT 1.1 | 6 | 11% | 20 |
| timmit.nano.TimDog 0.33 | 5 | 9% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 5 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.0 | 166 / 210 | 1.72 | 21.7% | 40912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.7% | 166 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 17 |
| baal.nano.N 1.42 | 3.2 | 11.5% | 8 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.6% | 1 |
| zyx.micro.Ant 1.1 | 4.8 | 9.5% | 7 |
| sanja.First 0.1 | 5.8 | 9.0% | 5 |
| cvt.Firsty 1.0 | 7.3 | 7.5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.2 | 30 / 35 | 6911 |
| 2 | 1 | 70.3 | 84.8 | 23 / 35 | 6750 |
| 3 | 1 | 71.0 | 88.9 | 26 / 35 | 6505 |
| 4 | 1 | 71.8 | 91.4 | 28 / 35 | 6701 |
| 5 | 1 | 72.4 | 93.7 | 29 / 35 | 7031 |
| 6 | 1 | 72.8 | 97.1 | 30 / 35 | 7014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 81% |
| baal.nano.N 1.42 | 29 | 90% |
| cvt.Firsty 1.0 | 29 | 97% |
| sanja.First 0.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 13 | 30% | 62 |
| baal.nano.N 1.42 | 7 | 16% | 31 |
| Grystrion.TrackerWO 1.0 | 6 | 14% | 22 |
| cvt.Firsty 1.0 | 5 | 11% | 27 |
| zyx.micro.Ant 1.1 | 5 | 11% | 23 |
| sanja.First 0.1 | 4 | 9% | 20 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 7 |
| sample.RamFire 1.0 | 2 | 5% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.1 | 89 / 210 | 3.42 | 16.6% | 33332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 16.6% | 89 |
| kc.micro.Figment 1.0 | 1.8 | 15.5% | 67 |
| cs.Wren 1.0 | 3.7 | 11.8% | 16 |
| js.PinBall 1.6 | 4.2 | 11.2% | 14 |
| mz.Cork 0.1 | 4.2 | 11.1% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 2 |
| evd.X1 0.01 | 7.2 | 7.6% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.6 | 14 / 35 | 5704 |
| 2 | 1 | 65.8 | 72.4 | 16 / 35 | 5902 |
| 3 | 1 | 65.7 | 73.7 | 16 / 35 | 5684 |
| 4 | 2 | 67.2 | 81.0 | 14 / 35 | 5778 |
| 5 | 1 | 63.7 | 69.5 | 14 / 35 | 5232 |
| 6 | 1 | 62.9 | 66.3 | 15 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 83 | 63% |
| cs.Wren 1.0 | 16 | 81% |
| mz.Cork 0.1 | 8 | 100% |
| js.PinBall 1.6 | 7 | 71% |
| donjezza.Jezza 1.0 | 6 | 83% |
| evd.X1 0.01 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 46% | 112 |
| mz.Cork 0.1 | 19 | 16% | 23 |
| cs.Wren 1.0 | 13 | 11% | 23 |
| evd.X1 0.01 | 9 | 7% | 10 |
| js.PinBall 1.6 | 7 | 6% | 13 |
| joe.ADinosaur 1.0 | 7 | 6% | 11 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 3 | 2% | 10 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.4 | 132 / 210 | 2.58 | 19.1% | 31802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.1% | 132 |
| ntc.Opposite 1.5 | 2.8 | 11.5% | 12 |
| myl.nano.Graviton 1.10 | 3.2 | 11.8% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.1% | 9 |
| DBall.NUKE 0.1 | 7.2 | 8.0% | 3 |
| disan.Chair 2.2.0 | 7.8 | 7.8% | 7 |
| donjezza.Muncho 1.0 | 8.7 | 6.7% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.5 | 21 / 35 | 5037 |
| 2 | 1 | 68.7 | 85.7 | 22 / 35 | 4971 |
| 3 | 1 | 69.4 | 87.3 | 22 / 35 | 5457 |
| 4 | 1 | 67.0 | 77.1 | 19 / 35 | 5429 |
| 5 | 1 | 66.5 | 73.0 | 20 / 35 | 5515 |
| 6 | 1 | 71.6 | 94.0 | 28 / 35 | 5393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 86% |
| stelo.AreaTargetingBot 1.1 | 27 | 96% |
| ntc.Opposite 1.5 | 20 | 80% |
| disan.Chair 2.2.0 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| donjezza.Muncho 1.0 | 14 | 100% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 70% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 23% | 50 |
| pfvicm.Sobieski 7.2.3b | 17 | 21% | 26 |
| ntc.Opposite 1.5 | 15 | 19% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 11% | 27 |
| stelo.AreaTargetingBot 1.1 | 8 | 10% | 26 |
| disan.Chair 2.2.0 | 6 | 8% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 13 |
| DBall.NUKE 0.1 | 2 | 3% | 14 |
| pbg.R2D2 1.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.4 | 92 / 210 | 3.30 | 16.4% | 27334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.4% | 92 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 31 |
| oog.melee.Capulet 1.2 | 3.5 | 13.0% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.0% | 25 |
| yagami.Tidus 0.11 | 4.0 | 12.4% | 14 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 9 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.8 | 12 / 35 | 4503 |
| 2 | 1 | 64.6 | 71.1 | 15 / 35 | 4586 |
| 3 | 1 | 65.0 | 71.4 | 15 / 35 | 4670 |
| 4 | 1 | 67.0 | 80.3 | 18 / 35 | 4446 |
| 5 | 1 | 64.3 | 71.1 | 12 / 35 | 4233 |
| 6 | 1 | 68.3 | 81.9 | 20 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 86% |
| kawigi.micro.Shiz 1.1 | 27 | 93% |
| oog.melee.Capulet 1.2 | 24 | 54% |
| yagami.Tidus 0.11 | 16 | 81% |
| ejb.Polaris 1.0.1 | 5 | 80% |

Hadur died in 118 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 31% | 52 |
| yagami.Tidus 0.11 | 24 | 20% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 14% | 55 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 33 |
| ejb.Polaris 1.0.1 | 11 | 9% | 17 |
| stelo.MirrorNano 1.3 | 8 | 7% | 8 |
| kurios.DOSexe .9a | 6 | 5% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.6 | 126 / 210 | 2.92 | 17.6% | 28247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.6% | 126 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 20 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 28 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 9 |
| wompi.Quokka 1.6 | 4.7 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.4% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 3 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.1 | 21 / 35 | 4408 |
| 2 | 1 | 66.5 | 78.4 | 21 / 35 | 4798 |
| 3 | 1 | 68.6 | 84.8 | 26 / 35 | 5243 |
| 4 | 1 | 66.6 | 79.4 | 22 / 35 | 4627 |
| 5 | 1 | 61.6 | 67.3 | 12 / 35 | 4074 |
| 6 | 1 | 68.2 | 83.8 | 24 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 92% |
| wee.Gem 1.8.4 | 34 | 97% |
| m3thos.Eva00 1.1 | 14 | 100% |
| wompi.Quokka 1.6 | 13 | 100% |
| ratosh.Nobo 0.21 | 13 | 77% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 21% | 62 |
| wompi.Quokka 1.6 | 13 | 15% | 22 |
| m3thos.Eva00 1.1 | 13 | 15% | 22 |
| maribo.FollowFire 1 | 11 | 13% | 11 |
| ratosh.Nobo 0.21 | 9 | 11% | 22 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 8 |
| wee.Gem 1.8.4 | 6 | 7% | 44 |
| bayen.UbaMicro 1.4 | 6 | 7% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 6 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.4 | 135 / 210 | 1.96 | 22.3% | 50951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 22.3% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 16 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.6% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 4.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 85.4 | 18 / 35 | 8033 |
| 2 | 1 | 74.0 | 90.2 | 22 / 35 | 8738 |
| 3 | 1 | 73.5 | 87.3 | 23 / 35 | 8625 |
| 4 | 1 | 72.5 | 85.4 | 21 / 35 | 8170 |
| 5 | 1 | 75.9 | 96.5 | 26 / 35 | 9059 |
| 6 | 1 | 74.2 | 91.4 | 25 / 35 | 8326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 129 | 84% |
| exauge.GateKeeper 1.1.121g | 17 | 88% |
| mz.NanoGod 2.02 | 14 | 36% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 39% | 142 |
| mz.NanoGod 2.02 | 28 | 36% | 38 |
| exauge.GateKeeper 1.1.121g | 11 | 14% | 15 |
| ayk.WallHugger 1.0 | 3 | 4% | 8 |
| stuff.Vlad 0.1 | 2 | 3% | 4 |
| stelo.PianistNano 1.2 | 2 | 3% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.4 | 102 / 210 | 3.58 | 16.6% | 29990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.6% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.2% | 25 |
| bvh.micro.Freya 0.3 | 3.3 | 11.8% | 21 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.5% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.1% | 20 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 8 |
| conscience.Electron 1.3g | 7.0 | 7.7% | 1 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 12 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 72.1 | 15 / 35 | 5145 |
| 2 | 1 | 69.2 | 84.4 | 25 / 35 | 5398 |
| 3 | 1 | 63.2 | 67.6 | 15 / 35 | 4734 |
| 4 | 1 | 63.2 | 65.7 | 15 / 35 | 5097 |
| 5 | 1 | 66.0 | 75.2 | 17 / 35 | 5131 |
| 6 | 1 | 62.1 | 63.2 | 15 / 35 | 4485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 90% |
| dummy.micro.Sparrow 2.5 | 36 | 89% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 56% |
| ap.Frederick 1.1 | 8 | 88% |
| stelo.MirrorMicro 1.0 | 7 | 86% |

Hadur died in 108 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 22 | 20% | 52 |
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 55 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 15% | 15 |
| bvh.micro.Freya 0.3 | 13 | 12% | 26 |
| conscience.Electron 1.3g | 13 | 12% | 13 |
| dl.BetterWalls 1.0 | 7 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 7 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.3 | 145 / 210 | 2.32 | 21.2% | 43331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.2% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 17 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.5% | 10 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.9% | 4 |
| dsw.StaticD 1.0 | 5.5 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 3 |
| sample.Corners 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 89.2 | 26 / 35 | 7793 |
| 2 | 1 | 70.2 | 80.6 | 26 / 35 | 6785 |
| 3 | 1 | 69.8 | 81.0 | 21 / 35 | 6888 |
| 4 | 1 | 71.0 | 85.1 | 23 / 35 | 6634 |
| 5 | 1 | 73.4 | 94.3 | 28 / 35 | 7480 |
| 6 | 1 | 71.5 | 81.9 | 21 / 35 | 7751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 95% |
| supersample.SuperBoxBot 1.0 | 34 | 82% |
| dsw.StaticD 1.0 | 13 | 85% |
| mme.NikeEnhanced 2.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |

Hadur died in 65 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 29% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 23% | 58 |
| dsw.StaticD 1.0 | 11 | 17% | 24 |
| mme.NikeEnhanced 2.0 | 8 | 12% | 12 |
| sul.Lunar 1.1 | 5 | 8% | 50 |
| sample.Corners 1.0 | 3 | 5% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.0 | 113 / 210 | 2.44 | 19.6% | 41660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.6% | 113 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 36 |
| mld.Wisdom 1.0 | 3.7 | 11.6% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.2% | 13 |
| amz.NanoClone 1.41 | 4.5 | 10.5% | 16 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.5% | 8 |
| sample.Walls 1.0 | 7.2 | 7.3% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 19 / 35 | 6465 |
| 2 | 1 | 71.7 | 91.1 | 23 / 35 | 7294 |
| 3 | 1 | 68.7 | 81.6 | 18 / 35 | 6877 |
| 4 | 1 | 69.9 | 81.0 | 21 / 35 | 7444 |
| 5 | 1 | 68.8 | 82.2 | 19 / 35 | 6714 |
| 6 | 1 | 68.4 | 83.2 | 13 / 35 | 6866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 69% |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 91% |
| mld.Wisdom 1.0 | 19 | 63% |
| amz.NanoClone 1.41 | 15 | 73% |
| jangs.ns51 1.0 | 14 | 86% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 26% | 66 |
| mld.Wisdom 1.0 | 22 | 23% | 36 |
| KiraNL.Chupacabra 0.4 | 17 | 18% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 47 |
| amz.NanoClone 1.41 | 14 | 14% | 20 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| sample.Walls 1.0 | 1 | 1% | 8 |
| GarmBox.Oranges 1.0 | 1 | 1% | 3 |

