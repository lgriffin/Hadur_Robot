# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 86.9 | 147 / 210 | 2.18 | 21.2% | 43242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.2% | 147 |
| mz.AntiGrav 1.0 | 2.2 | 14.5% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 19 |
| mld.Infinity 2.2 | 3.8 | 12.8% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 6 |
| GarmBox.Oranges 1.0 | 6.8 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.1% | 2 |
| sample.Walls 1.0 | 7.2 | 6.6% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 81.3 | 21 / 35 | 6489 |
| 2 | 1 | 72.8 | 88.3 | 25 / 35 | 7225 |
| 3 | 1 | 71.4 | 86.7 | 25 / 35 | 6725 |
| 4 | 1 | 71.4 | 86.0 | 25 / 35 | 6991 |
| 5 | 1 | 71.8 | 85.1 | 21 / 35 | 7454 |
| 6 | 1 | 74.6 | 94.3 | 30 / 35 | 8358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 90 | 94% |
| mld.Infinity 2.2 | 28 | 89% |
| radnor.DoctorBob 1.42 | 26 | 81% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 67% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 35% | 58 |
| mz.AntiGrav 1.0 | 14 | 22% | 81 |
| amz.NanoClone 1.41 | 10 | 16% | 19 |
| mld.Infinity 2.2 | 7 | 11% | 36 |
| jangs.ns51 1.0 | 4 | 6% | 7 |
| GarmBox.Oranges 1.0 | 3 | 5% | 3 |
| sample.Walls 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.3 | 115 / 210 | 2.59 | 18.5% | 33710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.3 | 18.5% | 115 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.8% | 59 |
| mld.DustBunny 3.8 | 2.7 | 13.4% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 1 |
| zyx.nano.Ant 1.1 | 5.5 | 9.0% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.9% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 7.4% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.9% | 4 |
| cs.Grudge 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.4 | 23 / 35 | 5567 |
| 2 | 1 | 70.6 | 92.7 | 26 / 35 | 6288 |
| 3 | 1 | 67.9 | 84.8 | 15 / 35 | 5224 |
| 4 | 1 | 68.6 | 83.2 | 22 / 35 | 5634 |
| 5 | 3 | 61.9 | 55.9 | 8 / 35 | 5529 |
| 6 | 1 | 69.8 | 92.1 | 21 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 67% |
| mld.DustBunny 3.8 | 53 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 41% | 84 |
| mld.DustBunny 3.8 | 24 | 25% | 71 |
| maribo.melee.BMV 0.1 | 8 | 8% | 11 |
| fullsail.SweetTea 1.1 | 7 | 7% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 12 |
| zyx.nano.Ant 1.1 | 5 | 5% | 7 |
| bzdp.BoxCar 2.0 | 3 | 3% | 5 |
| cs.Grudge 1.0 | 3 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 82.4 | 129 / 210 | 2.59 | 19.8% | 37975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.8% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.6% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.7% | 20 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.9% | 9 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.6% | 0 |
| sample.Fire 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 71.7 | 17 / 35 | 6165 |
| 2 | 1 | 72.3 | 93.0 | 27 / 35 | 6634 |
| 3 | 1 | 72.1 | 89.2 | 23 / 35 | 7180 |
| 4 | 1 | 68.2 | 77.1 | 17 / 35 | 5949 |
| 5 | 1 | 66.2 | 73.7 | 17 / 35 | 5389 |
| 6 | 1 | 72.1 | 89.5 | 28 / 35 | 6658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 89% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| myl.nano.KomoriNinja 1.1 | 11 | 82% |
| sp.Nanos.Ember 1.1 | 10 | 70% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 21% | 43 |
| myl.micro.Troodon 1.10 | 14 | 17% | 69 |
| cb.nano.Insomnia 1.0 | 14 | 17% | 18 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 28 |
| sp.Nanos.Ember 1.1 | 8 | 10% | 17 |
| fm.mammillarias 1.3 | 8 | 10% | 12 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 13 |
| sample.Fire 1.0 | 4 | 5% | 5 |
| sample.Tracker 1.0 | 4 | 5% | 4 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.9 | 145 / 210 | 2.45 | 20.5% | 41097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.5% | 145 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.4% | 14 |
| kawigi.nano.Lib 1.0 | 2.7 | 11.3% | 11 |
| tj.zombie1n 1.0.1 | 4.8 | 9.8% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.1% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 9.1% | 20 |
| yk.JahMicro 1.0 | 6.5 | 8.3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.0% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 80.0 | 23 / 35 | 6659 |
| 2 | 1 | 72.3 | 89.5 | 29 / 35 | 7378 |
| 3 | 1 | 69.5 | 81.9 | 24 / 35 | 6665 |
| 4 | 1 | 71.3 | 85.4 | 24 / 35 | 7551 |
| 5 | 1 | 70.0 | 85.1 | 22 / 35 | 6643 |
| 6 | 1 | 69.0 | 81.3 | 23 / 35 | 6201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 45 | 96% |
| tvv.micro.Antares 1.1.1 | 27 | 89% |
| stelo.SoJNanoMelee 1.1 | 27 | 89% |
| tj.zombie1n 1.0.1 | 22 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| yk.JahMicro 1.0 | 11 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 88% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 29% | 67 |
| tvv.micro.Antares 1.1.1 | 12 | 18% | 38 |
| stelo.SoJNanoMelee 1.1 | 9 | 13% | 26 |
| yk.JahMicro 1.0 | 7 | 10% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 9% | 8 |
| tj.zombie1n 1.0.1 | 5 | 7% | 12 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.4 | 86 / 210 | 3.57 | 16.5% | 30961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.5% | 86 |
| oog.melee.Corsair 1.0 | 1.8 | 13.6% | 41 |
| ahf.NanoAndrew .4 | 3.5 | 11.1% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 23 |
| EBBU.Sim2 1.02 | 5.3 | 10.0% | 7 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.8% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 63.8 | 7 / 35 | 4723 |
| 2 | 1 | 64.7 | 72.4 | 15 / 35 | 5229 |
| 3 | 1 | 66.0 | 75.9 | 19 / 35 | 5392 |
| 4 | 1 | 65.1 | 74.3 | 13 / 35 | 5068 |
| 5 | 1 | 65.2 | 71.7 | 15 / 35 | 5443 |
| 6 | 1 | 65.0 | 70.5 | 17 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 67% |
| simonton.nano.MeleeSeed 1.8 | 24 | 79% |
| ahf.NanoAndrew .4 | 19 | 79% |
| EBBU.Sim2 1.02 | 9 | 78% |
| sam.Samspin 1.0 | 8 | 50% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 24% | 57 |
| simonton.nano.MeleeSeed 1.8 | 26 | 21% | 39 |
| EBBU.Sim2 1.02 | 17 | 13% | 22 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 16 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 16 |
| sam.Samspin 1.0 | 11 | 9% | 17 |
| ahf.NanoAndrew .4 | 8 | 6% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 6 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.1 | 137 / 210 | 2.16 | 19.9% | 35451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.9% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.6% | 16 |
| fm.claire 1.7 | 5.8 | 8.7% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.7% | 3 |
| pa.Improved 1.0 | 8.3 | 6.0% | 2 |
| sample.SpinBot 1.0 | 9.2 | 5.5% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.9 | 22 / 35 | 5309 |
| 2 | 1 | 72.2 | 95.2 | 27 / 35 | 6561 |
| 3 | 1 | 67.3 | 81.6 | 17 / 35 | 5427 |
| 4 | 1 | 69.9 | 87.6 | 22 / 35 | 5957 |
| 5 | 1 | 70.3 | 87.3 | 25 / 35 | 6076 |
| 6 | 1 | 70.5 | 88.9 | 24 / 35 | 6121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 90% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 47% | 92 |
| oog.melee.CapuletDroid 1.1 | 9 | 12% | 41 |
| sample.SpinBot 1.0 | 8 | 11% | 8 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 11 |
| gh.nano.Grofvuil 0.2 | 6 | 8% | 29 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 13 |
| fm.claire 1.7 | 3 | 4% | 8 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| kurios.DOSexe .9b | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.3 | 112 / 210 | 2.41 | 19.0% | 35651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.0% | 112 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 20 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 32 |
| DBall.Anarchy 0.1 | 5.0 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.2% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 3 |
| fire219.CatBot 1.0 | 8.3 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.4% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.5 | 11 / 35 | 5476 |
| 2 | 1 | 68.1 | 80.3 | 18 / 35 | 5791 |
| 3 | 1 | 70.3 | 86.3 | 21 / 35 | 6209 |
| 4 | 1 | 71.5 | 91.4 | 23 / 35 | 6541 |
| 5 | 1 | 69.6 | 88.3 | 19 / 35 | 5981 |
| 6 | 1 | 68.5 | 82.2 | 20 / 35 | 5653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 95% |
| mz.MicroGodMelee 1 | 48 | 69% |
| gh.micro.Gruweltje 0.7 | 29 | 66% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 33% | 60 |
| mz.MicroGodMelee 1 | 25 | 26% | 50 |
| spinnercat.micro.Tyger 0.1 | 20 | 20% | 67 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 9 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 68.7 | 106 / 210 | 3.82 | 16.4% | 30740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.4% | 106 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.8% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 23 |
| germ.TheMind .2 | 4.7 | 9.8% | 10 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.4% | 10 |
| awesomeness.Elite 1.0 | 5.3 | 9.3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.5% | 3 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 77.8 | 24 / 35 | 5736 |
| 2 | 1 | 63.3 | 66.7 | 15 / 35 | 4722 |
| 3 | 2 | 63.4 | 63.8 | 19 / 35 | 4835 |
| 4 | 1 | 62.7 | 64.1 | 16 / 35 | 4938 |
| 5 | 1 | 63.3 | 64.8 | 14 / 35 | 5004 |
| 6 | 1 | 66.5 | 74.9 | 18 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 84% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 8 | 88% |
| germ.TheMind .2 | 6 | 50% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 40% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 15% | 35 |
| germ.TheMind .2 | 16 | 15% | 19 |
| awesomeness.Elite 1.0 | 10 | 10% | 15 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 17 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 14 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 8 |
| sample.Crazy 1.0 | 2 | 2% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.4 | 156 / 210 | 1.86 | 20.9% | 34776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.9% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 12 |
| maribo.IotaCT 1.1 | 4.2 | 10.4% | 5 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.4% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 7.0 | 8.3% | 8 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 4 |
| spinnercat.Omen 1.0 | 8.8 | 7.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.7 | 25 / 35 | 5903 |
| 2 | 1 | 71.7 | 91.7 | 28 / 35 | 5657 |
| 3 | 1 | 72.1 | 92.1 | 26 / 35 | 5944 |
| 4 | 1 | 71.7 | 93.3 | 28 / 35 | 5643 |
| 5 | 1 | 70.3 | 87.0 | 25 / 35 | 5650 |
| 6 | 1 | 71.6 | 91.7 | 24 / 35 | 5979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 87 | 95% |
| nz.jdc.nano.GridFu 1.0 | 36 | 97% |
| timmit.nano.TimDog 0.33 | 17 | 76% |
| stelo.PatternRobot 1.0 | 11 | 73% |
| ratosh.Wesco 1.4 | 7 | 86% |
| maribo.IotaCT 1.1 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 13 | 24% | 21 |
| rz.HawkOnFire 0.1 | 12 | 22% | 75 |
| ratosh.Wesco 1.4 | 8 | 15% | 24 |
| timmit.nano.TimDog 0.33 | 8 | 15% | 20 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 46 |
| maribo.IotaCT 1.1 | 5 | 9% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 89.2 | 166 / 210 | 1.97 | 21.6% | 41631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.6% | 166 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 15 |
| baal.nano.N 1.42 | 2.7 | 11.4% | 6 |
| zyx.micro.Ant 1.1 | 4.5 | 9.9% | 13 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.4% | 4 |
| sanja.First 0.1 | 5.8 | 8.8% | 2 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 7.8 | 7.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 86.7 | 25 / 35 | 7360 |
| 2 | 1 | 71.9 | 91.7 | 29 / 35 | 6728 |
| 3 | 1 | 72.0 | 89.5 | 29 / 35 | 7006 |
| 4 | 1 | 71.8 | 88.9 | 27 / 35 | 7301 |
| 5 | 1 | 71.3 | 89.8 | 28 / 35 | 6515 |
| 6 | 1 | 71.5 | 88.6 | 28 / 35 | 6721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 93% |
| baal.nano.N 1.42 | 32 | 97% |
| sanja.First 0.1 | 24 | 100% |
| zyx.micro.Ant 1.1 | 24 | 88% |
| cvt.Firsty 1.0 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 34% | 44 |
| sample.RamFire 1.0 | 7 | 16% | 8 |
| tvv.nano.Polaris 1.2 | 5 | 11% | 48 |
| baal.nano.N 1.42 | 5 | 11% | 34 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 14 |
| squidM.TentalceMeleeNano 1.1 | 3 | 7% | 2 |
| sanja.First 0.1 | 2 | 5% | 31 |
| cvt.Firsty 1.0 | 2 | 5% | 24 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 72.5 | 81 / 210 | 3.47 | 16.4% | 32664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.4% | 81 |
| kc.micro.Figment 1.0 | 2.0 | 16.1% | 80 |
| cs.Wren 1.0 | 3.0 | 12.4% | 19 |
| js.PinBall 1.6 | 4.5 | 10.7% | 7 |
| mz.Cork 0.1 | 4.7 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 5.7 | 9.4% | 6 |
| evd.X1 0.01 | 7.2 | 7.5% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.2% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 68.9 | 11 / 35 | 5292 |
| 2 | 2 | 62.6 | 68.9 | 11 / 35 | 4613 |
| 3 | 1 | 66.4 | 76.2 | 14 / 35 | 5647 |
| 4 | 1 | 66.6 | 77.5 | 16 / 35 | 5782 |
| 5 | 1 | 64.0 | 66.7 | 15 / 35 | 5627 |
| 6 | 1 | 66.7 | 77.1 | 14 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 73 | 66% |
| cs.Wren 1.0 | 25 | 68% |
| mz.Cork 0.1 | 6 | 100% |
| js.PinBall 1.6 | 5 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 2 | 0% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 64 | 50% | 112 |
| cs.Wren 1.0 | 24 | 19% | 37 |
| js.PinBall 1.6 | 10 | 8% | 16 |
| evd.X1 0.01 | 10 | 8% | 11 |
| joe.ADinosaur 1.0 | 9 | 7% | 10 |
| mz.Cork 0.1 | 5 | 4% | 10 |
| PSW.Relentless 0.1 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.0 | 129 / 210 | 2.53 | 19.2% | 31823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.2% | 129 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 26 |
| ntc.Opposite 1.5 | 4.0 | 10.7% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 11 |
| disan.Chair 2.2.0 | 7.7 | 7.9% | 10 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 6 |
| donjezza.Muncho 1.0 | 8.7 | 6.5% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.9 | 18 / 35 | 5223 |
| 2 | 1 | 67.7 | 81.9 | 22 / 35 | 5030 |
| 3 | 1 | 70.4 | 90.2 | 23 / 35 | 5430 |
| 4 | 1 | 68.1 | 82.5 | 20 / 35 | 5014 |
| 5 | 1 | 67.8 | 80.3 | 20 / 35 | 5407 |
| 6 | 1 | 70.5 | 87.3 | 26 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 89% |
| disan.Chair 2.2.0 | 20 | 85% |
| stelo.AreaTargetingBot 1.1 | 19 | 74% |
| ntc.Opposite 1.5 | 18 | 89% |
| donjezza.Muncho 1.0 | 17 | 94% |
| pfvicm.Sobieski 7.2.3b | 17 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| DBall.NUKE 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 23% | 57 |
| pfvicm.Sobieski 7.2.3b | 15 | 18% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 17% | 33 |
| stelo.AreaTargetingBot 1.1 | 12 | 14% | 26 |
| ntc.Opposite 1.5 | 8 | 10% | 22 |
| disan.Chair 2.2.0 | 7 | 8% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.2 | 93 / 210 | 3.60 | 15.7% | 26346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 15.7% | 93 |
| oog.melee.Capulet 1.2 | 3.0 | 13.2% | 41 |
| yagami.Tidus 0.11 | 3.2 | 13.2% | 12 |
| kawigi.micro.Shiz 1.1 | 3.7 | 13.1% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 21 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 13 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 19 / 35 | 4320 |
| 2 | 1 | 65.6 | 74.0 | 15 / 35 | 4662 |
| 3 | 2 | 62.0 | 66.0 | 12 / 35 | 4127 |
| 4 | 1 | 64.6 | 69.2 | 15 / 35 | 4647 |
| 5 | 1 | 63.2 | 64.8 | 18 / 35 | 4191 |
| 6 | 1 | 64.6 | 72.7 | 14 / 35 | 4399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 94% |
| yagami.Tidus 0.11 | 27 | 96% |
| oog.melee.Capulet 1.2 | 21 | 67% |
| kawigi.micro.Shiz 1.1 | 13 | 100% |
| ejb.Polaris 1.0.1 | 7 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 39% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 14% | 49 |
| yagami.Tidus 0.11 | 14 | 12% | 34 |
| kawigi.micro.Shiz 1.1 | 13 | 11% | 22 |
| ejb.Polaris 1.0.1 | 10 | 8% | 21 |
| kurios.DOSexe .9a | 10 | 8% | 11 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| step.nanoPri 1.0 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 76.0 | 118 / 210 | 3.16 | 17.3% | 29273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.3% | 118 |
| bzdp.Pansy 2.1 | 2.3 | 12.6% | 23 |
| ratosh.Nobo 0.21 | 3.8 | 11.5% | 15 |
| wee.Gem 1.8.4 | 4.0 | 11.3% | 30 |
| wompi.Quokka 1.6 | 4.2 | 11.3% | 14 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 72.7 | 18 / 35 | 5218 |
| 2 | 1 | 65.8 | 74.6 | 17 / 35 | 4734 |
| 3 | 1 | 65.2 | 75.9 | 18 / 35 | 4598 |
| 4 | 1 | 67.8 | 81.6 | 24 / 35 | 5036 |
| 5 | 1 | 64.6 | 70.8 | 18 / 35 | 4578 |
| 6 | 1 | 67.3 | 80.3 | 23 / 35 | 5109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 96% |
| wee.Gem 1.8.4 | 23 | 91% |
| ratosh.Nobo 0.21 | 17 | 88% |
| wompi.Quokka 1.6 | 15 | 100% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| m3thos.Eva00 1.1 | 9 | 78% |
| stelo.MyAgileRobot 0.2 | 3 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 17% | 29 |
| m3thos.Eva00 1.1 | 12 | 13% | 24 |
| wee.Gem 1.8.4 | 11 | 12% | 32 |
| bzdp.Pansy 2.1 | 10 | 11% | 54 |
| wompi.Quokka 1.6 | 10 | 11% | 23 |
| bayen.UbaMicro 1.4 | 10 | 11% | 20 |
| stelo.MyAgileRobot 0.2 | 10 | 11% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 10 |
| maribo.FollowFire 1 | 7 | 7% | 8 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 86.6 | 137 / 210 | 2.20 | 21.8% | 49577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.8% | 137 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 14 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.1% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 0 |
| ayk.WallHugger 1.0 | 5.3 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 88.9 | 24 / 35 | 8333 |
| 2 | 1 | 72.2 | 81.6 | 21 / 35 | 8022 |
| 3 | 1 | 71.2 | 79.4 | 21 / 35 | 7968 |
| 4 | 1 | 72.6 | 86.0 | 17 / 35 | 8474 |
| 5 | 1 | 75.3 | 94.3 | 30 / 35 | 8718 |
| 6 | 1 | 73.6 | 89.5 | 24 / 35 | 8062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 81% |
| exauge.GateKeeper 1.1.121g | 16 | 94% |
| mz.NanoGod 2.02 | 16 | 69% |
| stelo.PianistNano 1.2 | 5 | 80% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 67% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 42% | 136 |
| mz.NanoGod 2.02 | 19 | 26% | 34 |
| exauge.GateKeeper 1.1.121g | 10 | 14% | 17 |
| ayk.WallHugger 1.0 | 8 | 11% | 12 |
| drd.Dreadknoght 0.9 | 2 | 3% | 5 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.2 | 103 / 210 | 3.50 | 16.8% | 30817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.8% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 25 |
| bvh.micro.Freya 0.3 | 3.2 | 12.0% | 22 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.2% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 0 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 13 |
| dl.BetterWalls 1.0 | 9.2 | 6.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 69.5 | 17 / 35 | 5375 |
| 2 | 1 | 64.3 | 69.5 | 17 / 35 | 4930 |
| 3 | 1 | 67.3 | 80.3 | 16 / 35 | 5506 |
| 4 | 1 | 64.4 | 70.8 | 17 / 35 | 4917 |
| 5 | 1 | 65.0 | 71.1 | 20 / 35 | 5093 |
| 6 | 1 | 64.7 | 72.1 | 16 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 82% |
| bvh.micro.Freya 0.3 | 29 | 72% |
| dummy.micro.Sparrow 2.5 | 27 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 80% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 50% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 21 | 20% | 41 |
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 16% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 35 |
| conscience.Electron 1.3g | 12 | 11% | 13 |
| dummy.micro.Sparrow 2.5 | 10 | 9% | 36 |
| dl.BetterWalls 1.0 | 8 | 7% | 12 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 12 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.0 | 146 / 210 | 2.35 | 21.4% | 44347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.4% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.5% | 15 |
| sul.Lunar 1.1 | 2.8 | 12.5% | 24 |
| mme.NikeEnhanced 2.0 | 4.5 | 9.6% | 5 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.3% | 8 |
| dsw.StaticD 1.0 | 6.3 | 8.2% | 3 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.4% | 2 |
| sample.Corners 1.0 | 9.8 | 4.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 87.9 | 25 / 35 | 7752 |
| 2 | 1 | 70.9 | 87.0 | 22 / 35 | 7083 |
| 3 | 1 | 71.3 | 84.4 | 26 / 35 | 7134 |
| 4 | 1 | 71.0 | 80.0 | 22 / 35 | 7498 |
| 5 | 1 | 70.5 | 81.9 | 24 / 35 | 6853 |
| 6 | 1 | 73.1 | 88.9 | 27 / 35 | 8027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 61 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 85% |
| supersample.SuperBoxBot 1.0 | 26 | 88% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| dsw.StaticD 1.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 27% | 58 |
| supersample.SuperBoxBot 1.0 | 14 | 22% | 30 |
| dsw.StaticD 1.0 | 9 | 14% | 21 |
| sul.Lunar 1.1 | 8 | 13% | 61 |
| mme.NikeEnhanced 2.0 | 8 | 13% | 18 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 3 |
| sample.Corners 1.0 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 80.7 | 118 / 210 | 2.73 | 19.1% | 40877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.1% | 118 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 30 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.0% | 15 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 10 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.6% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.0% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 8 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.5 | 24 / 35 | 6752 |
| 2 | 1 | 68.8 | 81.6 | 19 / 35 | 6723 |
| 3 | 1 | 68.2 | 75.2 | 19 / 35 | 7300 |
| 4 | 1 | 66.6 | 75.2 | 17 / 35 | 6058 |
| 5 | 1 | 68.4 | 82.9 | 17 / 35 | 6733 |
| 6 | 1 | 70.9 | 87.0 | 22 / 35 | 7311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 91% |
| mld.Wisdom 1.0 | 29 | 76% |
| amz.NanoClone 1.41 | 13 | 62% |
| jangs.ns51 1.0 | 9 | 78% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 22 | 24% | 48 |
| radnor.DoctorBob 1.42 | 17 | 18% | 50 |
| amz.NanoClone 1.41 | 16 | 17% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 16% | 50 |
| KiraNL.Chupacabra 0.4 | 9 | 10% | 16 |
| jangs.ns51 1.0 | 8 | 9% | 13 |
| sample.Walls 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

