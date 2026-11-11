# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.5 | 143 / 210 | 2.13 | 21.3% | 44015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.3% | 143 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 31 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 15 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 14 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 5 |
| GarmBox.Oranges 1.0 | 6.3 | 7.2% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 2 |
| sample.Walls 1.0 | 7.3 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.3 | 23 / 35 | 7027 |
| 2 | 1 | 72.3 | 86.7 | 23 / 35 | 7464 |
| 3 | 1 | 70.9 | 83.8 | 21 / 35 | 6949 |
| 4 | 1 | 72.2 | 85.1 | 25 / 35 | 7226 |
| 5 | 1 | 72.6 | 88.9 | 23 / 35 | 7750 |
| 6 | 1 | 73.5 | 93.0 | 28 / 35 | 7599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 94% |
| mld.Infinity 2.2 | 39 | 92% |
| radnor.DoctorBob 1.42 | 30 | 80% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 41% | 58 |
| mz.AntiGrav 1.0 | 15 | 22% | 69 |
| mld.Infinity 2.2 | 10 | 15% | 46 |
| amz.NanoClone 1.41 | 5 | 7% | 14 |
| sample.Walls 1.0 | 4 | 6% | 8 |
| GarmBox.Oranges 1.0 | 4 | 6% | 6 |
| jangs.ns51 1.0 | 1 | 1% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.8 | 113 / 210 | 2.28 | 19.1% | 35039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.1% | 113 |
| mld.DustBunny 3.8 | 2.5 | 14.5% | 22 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.7% | 55 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.0% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 7.7% | 2 |
| zyx.nano.Ant 1.1 | 6.5 | 7.9% | 2 |
| fullsail.SweetTea 1.1 | 7.7 | 6.5% | 2 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 23 / 35 | 5820 |
| 2 | 1 | 68.8 | 87.0 | 18 / 35 | 5677 |
| 3 | 1 | 70.6 | 91.7 | 20 / 35 | 6381 |
| 4 | 1 | 68.1 | 87.0 | 17 / 35 | 5161 |
| 5 | 1 | 68.4 | 83.8 | 21 / 35 | 5589 |
| 6 | 1 | 67.7 | 73.7 | 14 / 35 | 6411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 68 | 78% |
| oog.melee.Mercutio 1.0 | 47 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| maribo.melee.BMV 0.1 | 6 | 50% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 34 | 35% | 85 |
| oog.melee.Mercutio 1.0 | 28 | 29% | 68 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 12% | 19 |
| zyx.nano.Ant 1.1 | 10 | 10% | 12 |
| maribo.melee.BMV 0.1 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 2 | 2% | 7 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 83.3 | 140 / 210 | 2.50 | 20.2% | 38958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.2% | 140 |
| myl.micro.Troodon 1.10 | 2.2 | 14.2% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 8 |
| cb.nano.Insomnia 1.0 | 4.2 | 10.5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.9% | 12 |
| fm.mammillarias 1.3 | 6.0 | 8.9% | 2 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 4 |
| sample.Fire 1.0 | 9.5 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 83.8 | 24 / 35 | 6847 |
| 2 | 1 | 69.4 | 81.6 | 20 / 35 | 6380 |
| 3 | 1 | 69.2 | 78.4 | 22 / 35 | 6507 |
| 4 | 1 | 71.8 | 87.6 | 26 / 35 | 6869 |
| 5 | 1 | 70.7 | 87.9 | 24 / 35 | 6106 |
| 6 | 1 | 69.8 | 80.6 | 24 / 35 | 6249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 93% |
| cb.nano.Insomnia 1.0 | 31 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 92% |
| myl.nano.KomoriNinja 1.1 | 17 | 76% |
| sp.Nanos.Ember 1.1 | 9 | 78% |
| fm.mammillarias 1.3 | 7 | 86% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 23% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 20% | 43 |
| fm.mammillarias 1.3 | 12 | 17% | 17 |
| cb.nano.Insomnia 1.0 | 9 | 13% | 14 |
| myl.nano.KomoriNinja 1.1 | 8 | 11% | 34 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 14 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 11 |
| sample.Fire 1.0 | 3 | 4% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.1 | 141 / 210 | 2.43 | 20.2% | 39780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.2% | 141 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 19 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 17 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.6% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.3% | 6 |
| tj.zombie1n 1.0.1 | 6.7 | 8.3% | 5 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 74.9 | 23 / 35 | 6693 |
| 2 | 1 | 70.2 | 88.3 | 25 / 35 | 6213 |
| 3 | 1 | 69.3 | 83.2 | 21 / 35 | 6326 |
| 4 | 1 | 71.0 | 86.7 | 24 / 35 | 7097 |
| 5 | 1 | 70.9 | 87.3 | 27 / 35 | 6727 |
| 6 | 1 | 70.0 | 84.4 | 21 / 35 | 6724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 91% |
| stelo.SoJNanoMelee 1.1 | 44 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| tj.zombie1n 1.0.1 | 9 | 100% |
| yk.JahMicro 1.0 | 9 | 89% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 33% | 79 |
| tvv.micro.Antares 1.1.1 | 15 | 22% | 35 |
| stelo.SoJNanoMelee 1.1 | 11 | 16% | 30 |
| yk.JahMicro 1.0 | 5 | 7% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 22 |
| repositorio.NanoStep 1.0 | 3 | 4% | 11 |
| tj.zombie1n 1.0.1 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.2 | 92 / 210 | 3.78 | 16.2% | 30847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.2% | 92 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 35 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.0% | 21 |
| ahf.NanoAndrew .4 | 3.8 | 11.4% | 30 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 6 |
| sam.Samspin 1.0 | 6.0 | 9.3% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.1% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.8% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.2 | 15 / 35 | 5074 |
| 2 | 1 | 65.6 | 73.7 | 15 / 35 | 5449 |
| 3 | 1 | 62.4 | 61.9 | 13 / 35 | 5147 |
| 4 | 1 | 64.6 | 70.8 | 14 / 35 | 5264 |
| 5 | 1 | 64.2 | 67.9 | 17 / 35 | 5002 |
| 6 | 1 | 64.5 | 71.4 | 18 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 75% |
| simonton.nano.MeleeSeed 1.8 | 31 | 90% |
| ahf.NanoAndrew .4 | 17 | 71% |
| sam.Samspin 1.0 | 10 | 80% |
| EBBU.Sim2 1.02 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| sample.TrackFire 1.0 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 23% | 50 |
| oog.melee.Corsair 1.0 | 22 | 19% | 52 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 25 |
| ahf.NanoAndrew .4 | 15 | 13% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 11 |
| EBBU.Sim2 1.02 | 9 | 8% | 15 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 11 |
| sam.Samspin 1.0 | 6 | 5% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.6 | 144 / 210 | 2.30 | 19.3% | 32968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.3% | 144 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 30 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.2% | 7 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 1 |
| fm.claire 1.7 | 6.0 | 8.5% | 2 |
| sample.SpinBot 1.0 | 8.2 | 6.6% | 4 |
| pa.Improved 1.0 | 9.2 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 27 / 35 | 5380 |
| 2 | 1 | 68.9 | 85.7 | 24 / 35 | 5320 |
| 3 | 1 | 71.5 | 92.4 | 29 / 35 | 6134 |
| 4 | 1 | 66.8 | 81.0 | 21 / 35 | 5059 |
| 5 | 1 | 68.5 | 81.6 | 21 / 35 | 5859 |
| 6 | 1 | 68.2 | 84.4 | 22 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 88% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| arthord.NanoSatanMelee Beta | 17 | 100% |
| gh.nano.Grofvuil 0.2 | 15 | 100% |
| fm.claire 1.7 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 33% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 36% | 81 |
| gh.nano.Grofvuil 0.2 | 12 | 18% | 38 |
| oog.melee.CapuletDroid 1.1 | 7 | 11% | 36 |
| arthord.NanoSatanMelee Beta | 7 | 11% | 17 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 14 |
| fm.claire 1.7 | 4 | 6% | 10 |
| sample.SpinBot 1.0 | 4 | 6% | 4 |
| kurios.DOSexe .9b | 3 | 5% | 7 |
| pa.Improved 1.0 | 1 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 77.5 | 97 / 210 | 3.02 | 17.7% | 34369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.7% | 97 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 38 |
| mz.MicroGodMelee 1 | 3.2 | 13.8% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.5% | 26 |
| DBall.Anarchy 0.1 | 5.0 | 8.3% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.0 | 7.1% | 3 |
| fire219.CatBot 1.0 | 8.5 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.5% | 2 |
| acogdev.alpha 0.2 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.7 | 13 / 35 | 5496 |
| 2 | 1 | 67.4 | 76.2 | 16 / 35 | 6106 |
| 3 | 1 | 68.4 | 82.2 | 18 / 35 | 5702 |
| 4 | 1 | 69.3 | 85.4 | 19 / 35 | 6209 |
| 5 | 1 | 65.6 | 72.4 | 16 / 35 | 5576 |
| 6 | 1 | 64.1 | 69.2 | 15 / 35 | 5280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 84% |
| mz.MicroGodMelee 1 | 47 | 62% |
| gh.micro.Gruweltje 0.7 | 28 | 68% |
| el.JumpShoot 0.2 | 2 | 50% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 30% | 67 |
| gh.micro.Gruweltje 0.7 | 22 | 19% | 45 |
| spinnercat.micro.Tyger 0.1 | 20 | 18% | 54 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 8 |
| DBall.Anarchy 0.1 | 7 | 6% | 10 |
| fire219.CatBot 1.0 | 7 | 6% | 8 |
| acogdev.alpha 0.2 | 6 | 5% | 9 |
| mbro.Detektor3 0.1.1 | 5 | 4% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 75.2 | 114 / 210 | 3.23 | 17.5% | 33179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.3 | 17.5% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.3% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.9% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.1% | 6 |
| germ.TheMind .2 | 5.7 | 8.7% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.6% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.3% | 6 |
| stelo.UntouchableNano 1.3 | 6.8 | 7.9% | 8 |
| sample.Crazy 1.0 | 8.8 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 65.4 | 9 / 35 | 4817 |
| 2 | 1 | 65.8 | 73.3 | 18 / 35 | 5480 |
| 3 | 1 | 69.0 | 83.5 | 24 / 35 | 5459 |
| 4 | 1 | 68.1 | 77.5 | 22 / 35 | 5845 |
| 5 | 1 | 65.1 | 70.8 | 18 / 35 | 5461 |
| 6 | 1 | 68.7 | 81.0 | 23 / 35 | 6117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 79% |
| lrem.micro.MoggFanatic 0.2 | 6 | 67% |
| germ.TheMind .2 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 25% |

Hadur died in 96 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 36% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 20% | 47 |
| stelo.UntouchableNano 1.3 | 12 | 13% | 15 |
| lrem.micro.MoggFanatic 0.2 | 10 | 10% | 16 |
| germ.TheMind .2 | 7 | 7% | 16 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 11 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.3 | 154 / 210 | 1.96 | 20.7% | 34291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.7% | 154 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 6 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 11 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.5% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 8.3% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 7.5% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 98.1 | 31 / 35 | 5819 |
| 2 | 1 | 70.0 | 81.6 | 22 / 35 | 5835 |
| 3 | 1 | 71.9 | 93.0 | 26 / 35 | 5477 |
| 4 | 1 | 70.9 | 90.5 | 25 / 35 | 5660 |
| 5 | 1 | 70.4 | 85.7 | 24 / 35 | 5800 |
| 6 | 1 | 71.0 | 87.0 | 26 / 35 | 5700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 94% |
| nz.jdc.nano.GridFu 1.0 | 40 | 100% |
| timmit.nano.TimDog 0.33 | 13 | 77% |
| ratosh.Wesco 1.4 | 10 | 70% |
| maribo.IotaCT 1.1 | 9 | 78% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 71% |

Hadur died in 56 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 70 |
| nz.jdc.nano.GridFu 1.0 | 9 | 16% | 56 |
| timmit.nano.TimDog 0.33 | 9 | 16% | 21 |
| ratosh.Wesco 1.4 | 7 | 13% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 13% | 8 |
| stelo.PatternRobot 1.0 | 5 | 9% | 11 |
| maribo.IotaCT 1.1 | 3 | 5% | 14 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 91.5 | 169 / 210 | 1.76 | 22.1% | 42834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.1% | 169 |
| baal.nano.N 1.42 | 2.3 | 12.3% | 7 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.2% | 16 |
| zyx.micro.Ant 1.1 | 4.3 | 9.5% | 6 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 4 |
| sanja.First 0.1 | 5.8 | 8.5% | 4 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 7.8 | 6.8% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 6.9% | 0 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 95.2 | 31 / 35 | 7560 |
| 2 | 1 | 70.9 | 84.4 | 24 / 35 | 7114 |
| 3 | 1 | 73.3 | 94.6 | 30 / 35 | 7519 |
| 4 | 1 | 72.4 | 92.4 | 28 / 35 | 7300 |
| 5 | 1 | 72.6 | 94.0 | 30 / 35 | 7050 |
| 6 | 1 | 70.8 | 88.6 | 26 / 35 | 6291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 93% |
| tvv.nano.Polaris 1.2 | 41 | 88% |
| cvt.Firsty 1.0 | 25 | 92% |
| sanja.First 0.1 | 22 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| Grystrion.TrackerWO 1.0 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 31% | 35 |
| tvv.nano.Polaris 1.2 | 9 | 21% | 61 |
| baal.nano.N 1.42 | 8 | 19% | 51 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 15 |
| cvt.Firsty 1.0 | 3 | 7% | 18 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 7 |
| sanja.First 0.1 | 1 | 2% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| sample.RamFire 1.0 | 1 | 2% | 0 |

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.4 | 89 / 210 | 3.85 | 15.8% | 32809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 15.8% | 89 |
| kc.micro.Figment 1.0 | 2.0 | 14.3% | 50 |
| cs.Wren 1.0 | 3.0 | 12.6% | 30 |
| js.PinBall 1.6 | 4.2 | 11.5% | 19 |
| mz.Cork 0.1 | 4.7 | 10.8% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 2 |
| evd.X1 0.01 | 7.2 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 7.7 | 7.0% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 59.7 | 12 / 35 | 5187 |
| 2 | 2 | 61.9 | 63.2 | 12 / 35 | 5194 |
| 3 | 1 | 66.2 | 77.5 | 17 / 35 | 5606 |
| 4 | 1 | 63.9 | 69.2 | 19 / 35 | 5334 |
| 5 | 1 | 65.9 | 74.3 | 13 / 35 | 6211 |
| 6 | 1 | 63.5 | 66.3 | 16 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 78% |
| cs.Wren 1.0 | 27 | 78% |
| js.PinBall 1.6 | 10 | 60% |
| mz.Cork 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 37% | 100 |
| cs.Wren 1.0 | 19 | 16% | 32 |
| PSW.Relentless 0.1 | 15 | 12% | 15 |
| evd.X1 0.01 | 15 | 12% | 15 |
| joe.ADinosaur 1.0 | 12 | 10% | 15 |
| js.PinBall 1.6 | 10 | 8% | 18 |
| mz.Cork 0.1 | 3 | 2% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.5 | 131 / 210 | 2.49 | 19.1% | 30882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.1% | 131 |
| myl.nano.Graviton 1.10 | 2.3 | 12.2% | 24 |
| ntc.Opposite 1.5 | 3.8 | 10.9% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.7% | 6 |
| disan.Chair 2.2.0 | 6.8 | 8.5% | 7 |
| DBall.NUKE 0.1 | 8.2 | 7.4% | 4 |
| donjezza.Muncho 1.0 | 8.8 | 5.8% | 4 |
| pbg.R2D2 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 21 / 35 | 5528 |
| 2 | 1 | 67.9 | 79.4 | 24 / 35 | 5137 |
| 3 | 1 | 68.3 | 82.9 | 23 / 35 | 4728 |
| 4 | 1 | 69.4 | 88.3 | 21 / 35 | 5142 |
| 5 | 1 | 69.1 | 86.0 | 23 / 35 | 5064 |
| 6 | 1 | 67.4 | 79.0 | 19 / 35 | 5283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 91% |
| stelo.AreaTargetingBot 1.1 | 30 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 90% |
| disan.Chair 2.2.0 | 18 | 78% |
| ntc.Opposite 1.5 | 14 | 86% |
| donjezza.Muncho 1.0 | 11 | 100% |
| DBall.NUKE 0.1 | 5 | 80% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 79 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 22% | 38 |
| pfvicm.Sobieski 7.2.3b | 16 | 20% | 23 |
| myl.nano.Graviton 1.10 | 11 | 14% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 22 |
| ntc.Opposite 1.5 | 10 | 13% | 18 |
| disan.Chair 2.2.0 | 8 | 10% | 22 |
| DBall.NUKE 0.1 | 4 | 5% | 13 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| donjezza.Muncho 1.0 | 0 | 0% | 9 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.2 | 84 / 210 | 3.32 | 16.3% | 28103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 16.3% | 84 |
| kawigi.micro.Shiz 1.1 | 2.0 | 13.7% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 20 |
| oog.melee.Capulet 1.2 | 3.7 | 13.4% | 49 |
| yagami.Tidus 0.11 | 5.0 | 11.7% | 15 |
| ejb.Polaris 1.0.1 | 5.8 | 10.2% | 14 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.9 | 14 / 35 | 4554 |
| 2 | 1 | 66.5 | 76.8 | 19 / 35 | 4720 |
| 3 | 1 | 65.0 | 74.0 | 13 / 35 | 4619 |
| 4 | 1 | 65.9 | 73.0 | 13 / 35 | 5055 |
| 5 | 1 | 66.1 | 75.6 | 15 / 35 | 4728 |
| 6 | 2 | 63.8 | 70.8 | 10 / 35 | 4427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 79% |
| oog.melee.Capulet 1.2 | 28 | 61% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| yagami.Tidus 0.11 | 13 | 92% |
| ejb.Polaris 1.0.1 | 8 | 63% |

Hadur died in 127 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 39% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 48 |
| yagami.Tidus 0.11 | 20 | 16% | 28 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 34 |
| ejb.Polaris 1.0.1 | 11 | 9% | 19 |
| kurios.DOSexe .9a | 5 | 4% | 4 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.4 | 136 / 210 | 2.68 | 18.2% | 28832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.2% | 136 |
| bzdp.Pansy 2.1 | 2.2 | 13.0% | 19 |
| wee.Gem 1.8.4 | 3.8 | 11.5% | 23 |
| ratosh.Nobo 0.21 | 4.0 | 11.0% | 10 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 15 |
| m3thos.Eva00 1.1 | 6.2 | 9.5% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.0% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 80.3 | 23 / 35 | 5085 |
| 2 | 1 | 67.7 | 82.9 | 20 / 35 | 4907 |
| 3 | 1 | 64.6 | 70.2 | 20 / 35 | 4803 |
| 4 | 1 | 68.7 | 86.0 | 23 / 35 | 4923 |
| 5 | 1 | 69.5 | 90.8 | 30 / 35 | 4726 |
| 6 | 1 | 65.9 | 78.1 | 20 / 35 | 4388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 95% |
| wee.Gem 1.8.4 | 29 | 100% |
| ratosh.Nobo 0.21 | 17 | 88% |
| wompi.Quokka 1.6 | 13 | 92% |
| m3thos.Eva00 1.1 | 9 | 78% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 26% | 73 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 15% | 15 |
| maribo.FollowFire 1 | 10 | 14% | 8 |
| ratosh.Nobo 0.21 | 8 | 11% | 22 |
| bayen.UbaMicro 1.4 | 8 | 11% | 14 |
| wompi.Quokka 1.6 | 7 | 9% | 16 |
| wee.Gem 1.8.4 | 5 | 7% | 41 |
| m3thos.Eva00 1.1 | 4 | 5% | 17 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 4 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.4 | 92.0 | 142 / 210 | 1.72 | 23.0% | 52603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 23.0% | 142 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 50 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 16 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.8% | 1 |
| ayk.WallHugger 1.0 | 5.3 | 8.6% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 90.5 | 18 / 35 | 9068 |
| 2 | 1 | 72.9 | 88.6 | 22 / 35 | 7986 |
| 3 | 1 | 75.1 | 94.9 | 26 / 35 | 9145 |
| 4 | 1 | 74.0 | 91.7 | 24 / 35 | 8368 |
| 5 | 1 | 75.3 | 94.3 | 28 / 35 | 8914 |
| 6 | 1 | 74.7 | 91.7 | 24 / 35 | 9122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 81% |
| mz.NanoGod 2.02 | 23 | 70% |
| exauge.GateKeeper 1.1.121g | 18 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 51% | 139 |
| mz.NanoGod 2.02 | 23 | 33% | 43 |
| exauge.GateKeeper 1.1.121g | 8 | 12% | 15 |
| ayk.WallHugger 1.0 | 2 | 3% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.0 | 114 / 210 | 3.25 | 17.3% | 29833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.3% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 27 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 18 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.5% | 6 |
| conscience.Electron 1.3g | 7.5 | 7.8% | 2 |
| ap.Frederick 1.1 | 8.0 | 6.7% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.9 | 21 / 35 | 4869 |
| 2 | 1 | 66.7 | 75.2 | 18 / 35 | 5253 |
| 3 | 1 | 66.7 | 80.0 | 19 / 35 | 5135 |
| 4 | 1 | 65.1 | 72.1 | 20 / 35 | 4855 |
| 5 | 1 | 64.7 | 71.7 | 17 / 35 | 4660 |
| 6 | 1 | 66.8 | 75.2 | 19 / 35 | 5061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 91% |
| dummy.micro.Sparrow 2.5 | 31 | 97% |
| bvh.micro.Freya 0.3 | 19 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 72% |
| stelo.MirrorMicro 1.0 | 7 | 71% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 22% | 60 |
| dummy.micro.Sparrow 2.5 | 19 | 20% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 34 |
| conscience.Electron 1.3g | 12 | 12% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 12 |
| dl.BetterWalls 1.0 | 8 | 8% | 13 |
| bvh.micro.Freya 0.3 | 7 | 7% | 17 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 10 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.4 | 133 / 210 | 2.40 | 21.0% | 44374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.0% | 133 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.2% | 18 |
| sul.Lunar 1.1 | 3.0 | 11.9% | 12 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.1% | 23 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.6% | 7 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.4% | 5 |
| sample.Corners 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 88.6 | 21 / 35 | 7589 |
| 2 | 1 | 71.4 | 85.7 | 23 / 35 | 7602 |
| 3 | 1 | 70.0 | 78.7 | 19 / 35 | 7284 |
| 4 | 1 | 71.5 | 83.2 | 23 / 35 | 7692 |
| 5 | 1 | 70.9 | 84.1 | 23 / 35 | 7125 |
| 6 | 1 | 71.4 | 86.0 | 24 / 35 | 7082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 43 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 33 | 94% |
| supersample.SuperBoxBot 1.0 | 28 | 54% |
| dsw.StaticD 1.0 | 15 | 73% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 34 | 44% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 17% | 45 |
| dsw.StaticD 1.0 | 8 | 10% | 22 |
| mme.NikeEnhanced 2.0 | 8 | 10% | 14 |
| sul.Lunar 1.1 | 6 | 8% | 49 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 12 |
| sample.Corners 1.0 | 2 | 3% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 80.4 | 124 / 210 | 2.77 | 19.0% | 39964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.0% | 124 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 29 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 21 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.5% | 6 |
| amz.NanoClone 1.41 | 6.2 | 9.3% | 6 |
| sample.Walls 1.0 | 7.0 | 7.8% | 3 |
| GarmBox.Oranges 1.0 | 7.5 | 7.4% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.8% | 2 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.1 | 26 / 35 | 6607 |
| 2 | 1 | 67.3 | 76.8 | 19 / 35 | 6238 |
| 3 | 1 | 70.1 | 81.9 | 22 / 35 | 7442 |
| 4 | 1 | 70.2 | 83.5 | 21 / 35 | 7577 |
| 5 | 1 | 67.3 | 76.8 | 20 / 35 | 6021 |
| 6 | 1 | 67.1 | 78.1 | 16 / 35 | 6079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 92% |
| radnor.DoctorBob 1.42 | 34 | 88% |
| mld.Wisdom 1.0 | 28 | 57% |
| KiraNL.Chupacabra 0.4 | 20 | 95% |
| jangs.ns51 1.0 | 8 | 88% |
| sample.Walls 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 7 | 86% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 34% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 20% | 56 |
| KiraNL.Chupacabra 0.4 | 11 | 13% | 34 |
| radnor.DoctorBob 1.42 | 10 | 12% | 39 |
| amz.NanoClone 1.41 | 10 | 12% | 15 |
| sample.Walls 1.0 | 5 | 6% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

