# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.3 | 142 / 210 | 1.97 | 21.8% | 45694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.8% | 142 |
| mz.AntiGrav 1.0 | 2.3 | 14.4% | 19 |
| radnor.DoctorBob 1.42 | 3.2 | 13.4% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 20 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 9 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 1 |
| sample.Walls 1.0 | 7.0 | 6.3% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 85.4 | 21 / 35 | 7073 |
| 2 | 1 | 71.9 | 84.4 | 22 / 35 | 7938 |
| 3 | 1 | 74.1 | 96.2 | 28 / 35 | 7889 |
| 4 | 1 | 73.5 | 91.7 | 25 / 35 | 7506 |
| 5 | 1 | 71.5 | 84.8 | 20 / 35 | 7660 |
| 6 | 1 | 73.7 | 93.0 | 26 / 35 | 7628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 95% |
| mld.Infinity 2.2 | 34 | 91% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| amz.NanoClone 1.41 | 4 | 75% |
| sample.Target 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 34% | 58 |
| mz.AntiGrav 1.0 | 17 | 25% | 79 |
| mld.Infinity 2.2 | 13 | 19% | 38 |
| amz.NanoClone 1.41 | 9 | 13% | 16 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |
| sample.Walls 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.7 | 111 / 210 | 2.74 | 18.0% | 32108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 18.0% | 111 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.0% | 53 |
| mld.DustBunny 3.8 | 2.5 | 14.4% | 26 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 2 |
| zyx.nano.Ant 1.1 | 5.5 | 8.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.4% | 4 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 2 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.4 | 16 / 35 | 4863 |
| 2 | 1 | 68.6 | 88.6 | 22 / 35 | 4971 |
| 3 | 1 | 68.6 | 85.7 | 17 / 35 | 5558 |
| 4 | 1 | 69.8 | 85.7 | 21 / 35 | 6135 |
| 5 | 1 | 69.6 | 88.9 | 24 / 35 | 5478 |
| 6 | 2 | 60.7 | 55.9 | 11 / 35 | 5103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 85% |
| oog.melee.Mercutio 1.0 | 56 | 71% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 32% | 72 |
| oog.melee.Mercutio 1.0 | 30 | 30% | 79 |
| zyx.nano.Ant 1.1 | 9 | 9% | 10 |
| fullsail.SweetTea 1.1 | 8 | 8% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 12 |
| maribo.melee.BMV 0.1 | 6 | 6% | 11 |
| cs.Grudge 1.0 | 4 | 4% | 5 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 81.0 | 124 / 210 | 2.71 | 19.6% | 38261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.6% | 124 |
| myl.micro.Troodon 1.10 | 2.3 | 14.3% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.3% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.8% | 20 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 6 |
| fm.mammillarias 1.3 | 5.5 | 9.8% | 8 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 4 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 87.3 | 25 / 35 | 6840 |
| 2 | 1 | 69.3 | 76.2 | 20 / 35 | 6568 |
| 3 | 1 | 68.8 | 81.9 | 18 / 35 | 6134 |
| 4 | 1 | 69.1 | 79.0 | 20 / 35 | 5997 |
| 5 | 1 | 71.1 | 85.7 | 24 / 35 | 6800 |
| 6 | 1 | 67.7 | 75.6 | 17 / 35 | 5922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 84% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| myl.nano.KomoriNinja 1.1 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 12 | 92% |
| fm.mammillarias 1.3 | 5 | 60% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 23 | 27% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 22% | 42 |
| myl.micro.Troodon 1.10 | 15 | 17% | 60 |
| fm.mammillarias 1.3 | 12 | 14% | 17 |
| myl.nano.KomoriNinja 1.1 | 6 | 7% | 34 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 17 |
| sample.Fire 1.0 | 3 | 3% | 4 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 9 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.8 | 144 / 210 | 2.10 | 20.9% | 40488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.9% | 144 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 18 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.2% | 14 |
| tj.zombie1n 1.0.1 | 6.0 | 8.5% | 7 |
| yk.JahMicro 1.0 | 6.0 | 8.8% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.4% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 8.3% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.3 | 27 / 35 | 6927 |
| 2 | 1 | 69.8 | 82.2 | 22 / 35 | 6798 |
| 3 | 1 | 71.3 | 89.8 | 25 / 35 | 6813 |
| 4 | 1 | 68.8 | 80.6 | 19 / 35 | 6478 |
| 5 | 1 | 70.9 | 89.2 | 26 / 35 | 6409 |
| 6 | 1 | 72.0 | 91.7 | 25 / 35 | 7063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 89% |
| stelo.SoJNanoMelee 1.1 | 35 | 94% |
| tvv.micro.Antares 1.1.1 | 25 | 72% |
| tj.zombie1n 1.0.1 | 12 | 75% |
| yk.JahMicro 1.0 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 35% | 76 |
| tvv.micro.Antares 1.1.1 | 14 | 21% | 39 |
| stelo.SoJNanoMelee 1.1 | 12 | 18% | 36 |
| tj.zombie1n 1.0.1 | 7 | 11% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 18 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| repositorio.NanoStep 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 70.3 | 89 / 210 | 3.68 | 16.7% | 32477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.7% | 89 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 31 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.3% | 27 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 4 |
| sam.Samspin 1.0 | 6.7 | 9.3% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 71.4 | 19 / 35 | 5416 |
| 2 | 1 | 65.6 | 70.8 | 17 / 35 | 5480 |
| 3 | 1 | 63.4 | 66.0 | 10 / 35 | 5276 |
| 4 | 1 | 64.7 | 68.6 | 18 / 35 | 5251 |
| 5 | 1 | 64.2 | 69.8 | 13 / 35 | 5162 |
| 6 | 1 | 66.3 | 74.9 | 12 / 35 | 5892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 58% |
| simonton.nano.MeleeSeed 1.8 | 32 | 91% |
| ahf.NanoAndrew .4 | 24 | 71% |
| EBBU.Sim2 1.02 | 10 | 80% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 19% | 44 |
| zyx.nano.BacillusComma 1.0 | 20 | 17% | 29 |
| simonton.nano.MeleeSeed 1.8 | 19 | 16% | 40 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 23 |
| EBBU.Sim2 1.02 | 16 | 13% | 20 |
| ahf.NanoAndrew .4 | 14 | 12% | 35 |
| sam.Samspin 1.0 | 6 | 5% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 3% | 4 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.1 | 128 / 210 | 2.34 | 19.3% | 34328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.3% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 39 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.5% | 8 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.2% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 7 |
| fm.claire 1.7 | 6.0 | 8.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.3% | 4 |
| sample.SpinBot 1.0 | 8.2 | 6.8% | 3 |
| pa.Improved 1.0 | 9.0 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.8 | 23 / 35 | 6048 |
| 2 | 1 | 69.2 | 85.7 | 22 / 35 | 5930 |
| 3 | 1 | 69.3 | 87.3 | 21 / 35 | 5527 |
| 4 | 1 | 66.4 | 77.5 | 17 / 35 | 5263 |
| 5 | 1 | 67.5 | 80.3 | 19 / 35 | 5545 |
| 6 | 1 | 70.4 | 89.2 | 26 / 35 | 6015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 82% |
| oog.melee.CapuletDroid 1.1 | 34 | 88% |
| gh.nano.Grofvuil 0.2 | 12 | 92% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 9 | 78% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 40% | 88 |
| oog.melee.CapuletDroid 1.1 | 19 | 23% | 48 |
| gh.nano.Grofvuil 0.2 | 7 | 9% | 20 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 17 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 14 |
| sample.SpinBot 1.0 | 5 | 6% | 7 |
| pa.Improved 1.0 | 4 | 5% | 5 |
| fm.claire 1.7 | 2 | 2% | 6 |
| kurios.DOSexe .9b | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.6 | 96 / 210 | 2.74 | 18.4% | 36647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.4% | 96 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 39 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.4% | 37 |
| mz.MicroGodMelee 1 | 3.8 | 13.3% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.0% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 3 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.0 | 19 / 35 | 6041 |
| 2 | 1 | 66.5 | 74.0 | 10 / 35 | 6181 |
| 3 | 1 | 67.0 | 77.5 | 16 / 35 | 5637 |
| 4 | 1 | 70.2 | 87.6 | 19 / 35 | 6589 |
| 5 | 1 | 70.0 | 84.4 | 17 / 35 | 6646 |
| 6 | 1 | 67.3 | 79.4 | 15 / 35 | 5553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 88% |
| mz.MicroGodMelee 1 | 35 | 63% |
| gh.micro.Gruweltje 0.7 | 25 | 60% |
| el.JumpShoot 0.2 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 28% | 49 |
| spinnercat.micro.Tyger 0.1 | 29 | 25% | 71 |
| mz.MicroGodMelee 1 | 29 | 25% | 57 |
| fire219.CatBot 1.0 | 7 | 6% | 8 |
| acogdev.alpha 0.2 | 7 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 72.3 | 108 / 210 | 3.49 | 17.0% | 32433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.0% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.4% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 26 |
| awesomeness.Elite 1.0 | 5.3 | 9.3% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 8.8% | 7 |
| germ.TheMind .2 | 5.7 | 9.1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.7% | 3 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.1% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 68.9 | 20 / 35 | 5323 |
| 2 | 1 | 66.9 | 74.9 | 18 / 35 | 5459 |
| 3 | 1 | 64.9 | 73.3 | 16 / 35 | 5063 |
| 4 | 1 | 65.4 | 72.1 | 17 / 35 | 5496 |
| 5 | 1 | 67.3 | 76.2 | 19 / 35 | 5938 |
| 6 | 1 | 64.0 | 68.6 | 18 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 88% |
| germ.TheMind .2 | 12 | 83% |
| stelo.UntouchableNano 1.3 | 9 | 89% |
| awesomeness.Elite 1.0 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 44% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 19% | 37 |
| awesomeness.Elite 1.0 | 9 | 9% | 16 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 15 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 10 |
| germ.TheMind .2 | 7 | 7% | 17 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.2 | 139 / 210 | 2.15 | 20.2% | 33429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.2% | 139 |
| rz.HawkOnFire 0.1 | 2.3 | 13.4% | 23 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.9% | 17 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 8 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.5% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 8.9% | 4 |
| ratosh.Wesco 1.4 | 7.2 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 7.3% | 4 |
| stelo.PatternRobot 1.0 | 8.2 | 8.1% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.3 | 23 / 35 | 5739 |
| 2 | 1 | 71.9 | 88.9 | 28 / 35 | 5622 |
| 3 | 1 | 69.0 | 81.3 | 19 / 35 | 5339 |
| 4 | 1 | 72.0 | 92.1 | 26 / 35 | 5819 |
| 5 | 1 | 70.1 | 87.3 | 22 / 35 | 5314 |
| 6 | 1 | 70.5 | 86.3 | 21 / 35 | 5596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 61 | 85% |
| nz.jdc.nano.GridFu 1.0 | 38 | 95% |
| maribo.IotaCT 1.1 | 19 | 95% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| ratosh.Wesco 1.4 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 23 | 32% | 63 |
| timmit.nano.TimDog 0.33 | 12 | 17% | 27 |
| nz.jdc.nano.GridFu 1.0 | 10 | 14% | 48 |
| stelo.PatternRobot 1.0 | 8 | 11% | 17 |
| maribo.IotaCT 1.1 | 7 | 10% | 24 |
| spinnercat.Omen 1.0 | 5 | 7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 6 |
| ratosh.Wesco 1.4 | 3 | 4% | 13 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 90.3 | 167 / 210 | 1.87 | 21.6% | 40857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.6% | 167 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 21 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.6% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.3% | 6 |
| sanja.First 0.1 | 6.0 | 8.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 2 |
| cvt.Firsty 1.0 | 8.5 | 7.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.6 | 31 / 35 | 7316 |
| 2 | 1 | 72.0 | 93.3 | 30 / 35 | 6790 |
| 3 | 1 | 73.2 | 95.9 | 31 / 35 | 7320 |
| 4 | 1 | 70.0 | 84.8 | 25 / 35 | 6524 |
| 5 | 1 | 70.5 | 86.3 | 26 / 35 | 6259 |
| 6 | 1 | 70.5 | 86.0 | 24 / 35 | 6648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 91% |
| baal.nano.N 1.42 | 39 | 97% |
| cvt.Firsty 1.0 | 25 | 96% |
| sanja.First 0.1 | 20 | 90% |
| zyx.micro.Ant 1.1 | 19 | 95% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 23% | 64 |
| zyx.micro.Ant 1.1 | 10 | 23% | 35 |
| cvt.Firsty 1.0 | 5 | 11% | 24 |
| baal.nano.N 1.42 | 4 | 9% | 41 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 14 |
| amk.Punbot.Punbot 0.01 | 4 | 9% | 6 |
| sanja.First 0.1 | 3 | 7% | 20 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 4 |
| sample.RamFire 1.0 | 2 | 5% | 2 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.6 | 97 / 210 | 3.55 | 16.4% | 32612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.4% | 97 |
| kc.micro.Figment 1.0 | 2.7 | 13.3% | 46 |
| cs.Wren 1.0 | 3.0 | 12.7% | 16 |
| js.PinBall 1.6 | 3.5 | 12.1% | 25 |
| mz.Cork 0.1 | 4.8 | 11.3% | 12 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 4 |
| evd.X1 0.01 | 6.7 | 8.4% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 67.0 | 11 / 35 | 5466 |
| 2 | 1 | 65.5 | 71.7 | 19 / 35 | 5319 |
| 3 | 1 | 65.4 | 73.0 | 18 / 35 | 5819 |
| 4 | 1 | 64.5 | 72.7 | 15 / 35 | 5281 |
| 5 | 1 | 64.3 | 68.3 | 17 / 35 | 5259 |
| 6 | 1 | 65.8 | 77.1 | 17 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 44 | 70% |
| cs.Wren 1.0 | 35 | 97% |
| js.PinBall 1.6 | 19 | 63% |
| mz.Cork 0.1 | 13 | 85% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 75% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 38 | 33% | 81 |
| cs.Wren 1.0 | 20 | 18% | 41 |
| js.PinBall 1.6 | 16 | 14% | 27 |
| evd.X1 0.01 | 15 | 13% | 19 |
| joe.ADinosaur 1.0 | 9 | 8% | 9 |
| mz.Cork 0.1 | 8 | 7% | 22 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.8 | 143 / 210 | 2.28 | 19.6% | 30960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.6% | 143 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 25 |
| ntc.Opposite 1.5 | 3.3 | 11.3% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.4% | 5 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.3% | 14 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 7 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 1 |
| donjezza.Muncho 1.0 | 9.2 | 5.8% | 2 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 19 / 35 | 4587 |
| 2 | 1 | 68.1 | 80.6 | 23 / 35 | 5182 |
| 3 | 1 | 69.6 | 86.3 | 24 / 35 | 5291 |
| 4 | 1 | 68.5 | 85.7 | 23 / 35 | 4827 |
| 5 | 1 | 71.4 | 93.7 | 27 / 35 | 5710 |
| 6 | 1 | 70.5 | 89.5 | 27 / 35 | 5363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 49 | 84% |
| ntc.Opposite 1.5 | 25 | 92% |
| disan.Chair 2.2.0 | 21 | 86% |
| stelo.AreaTargetingBot 1.1 | 17 | 82% |
| donjezza.Muncho 1.0 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| DBall.NUKE 0.1 | 9 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 25% | 56 |
| ntc.Opposite 1.5 | 13 | 19% | 35 |
| stelo.AreaTargetingBot 1.1 | 13 | 19% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 10% | 16 |
| disan.Chair 2.2.0 | 6 | 9% | 23 |
| pfvicm.Sobieski 7.2.3b | 5 | 7% | 10 |
| DBall.NUKE 0.1 | 3 | 4% | 15 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.6 | 74 / 210 | 3.55 | 15.4% | 25940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.5 | 15.4% | 74 |
| oog.melee.Capulet 1.2 | 2.5 | 13.8% | 50 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.1% | 32 |
| yagami.Tidus 0.11 | 3.8 | 12.5% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.3% | 22 |
| ejb.Polaris 1.0.1 | 6.0 | 10.7% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 2 |
| kurios.DOSexe .9a | 8.8 | 5.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 71.4 | 13 / 35 | 4181 |
| 2 | 3 | 60.9 | 65.1 | 8 / 35 | 3770 |
| 3 | 1 | 65.4 | 75.9 | 15 / 35 | 4435 |
| 4 | 1 | 66.2 | 77.1 | 14 / 35 | 4825 |
| 5 | 2 | 61.5 | 65.4 | 11 / 35 | 4080 |
| 6 | 1 | 65.5 | 74.9 | 13 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 83% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| yagami.Tidus 0.11 | 13 | 85% |
| ejb.Polaris 1.0.1 | 7 | 57% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 38% | 72 |
| yagami.Tidus 0.11 | 30 | 22% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 38 |
| ejb.Polaris 1.0.1 | 11 | 8% | 19 |
| kawigi.micro.Shiz 1.1 | 8 | 6% | 22 |
| step.nanoPri 1.0 | 8 | 6% | 8 |
| kurios.DOSexe .9a | 6 | 4% | 7 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.5 | 123 / 210 | 3.03 | 17.1% | 27114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.1% | 123 |
| wee.Gem 1.8.4 | 3.0 | 11.9% | 23 |
| bzdp.Pansy 2.1 | 3.0 | 11.8% | 17 |
| ratosh.Nobo 0.21 | 3.8 | 11.3% | 10 |
| wompi.Quokka 1.6 | 4.8 | 10.8% | 12 |
| m3thos.Eva00 1.1 | 5.5 | 10.1% | 13 |
| bayen.UbaMicro 1.4 | 7.0 | 9.1% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 75.6 | 21 / 35 | 4703 |
| 2 | 1 | 64.7 | 74.6 | 19 / 35 | 4483 |
| 3 | 1 | 66.1 | 75.9 | 21 / 35 | 4942 |
| 4 | 1 | 64.7 | 77.1 | 18 / 35 | 4240 |
| 5 | 1 | 66.1 | 81.0 | 22 / 35 | 4283 |
| 6 | 1 | 66.5 | 80.6 | 22 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 95% |
| wee.Gem 1.8.4 | 29 | 93% |
| wompi.Quokka 1.6 | 15 | 87% |
| ratosh.Nobo 0.21 | 12 | 83% |
| m3thos.Eva00 1.1 | 9 | 67% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 16% | 64 |
| ratosh.Nobo 0.21 | 13 | 15% | 25 |
| bayen.UbaMicro 1.4 | 11 | 13% | 18 |
| maribo.FollowFire 1 | 11 | 13% | 11 |
| wompi.Quokka 1.6 | 10 | 11% | 17 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 11 |
| m3thos.Eva00 1.1 | 7 | 8% | 14 |
| wee.Gem 1.8.4 | 5 | 6% | 35 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 88.5 | 134 / 210 | 2.04 | 22.0% | 49099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 22.0% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 54 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 14 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.9% | 6 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.7% | 0 |
| drd.Dreadknoght 0.9 | 8.2 | 5.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 88.9 | 25 / 35 | 8050 |
| 2 | 1 | 73.3 | 91.4 | 20 / 35 | 8071 |
| 3 | 1 | 72.5 | 84.4 | 22 / 35 | 7770 |
| 4 | 1 | 73.1 | 87.0 | 18 / 35 | 8519 |
| 5 | 1 | 73.7 | 88.9 | 25 / 35 | 8093 |
| 6 | 1 | 74.3 | 90.2 | 24 / 35 | 8596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 123 | 82% |
| mz.NanoGod 2.02 | 17 | 76% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| ayk.WallHugger 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 46% | 134 |
| mz.NanoGod 2.02 | 22 | 29% | 37 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 14 |
| ayk.WallHugger 1.0 | 5 | 7% | 9 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| stuff.Vlad 0.1 | 2 | 3% | 8 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.3 | 114 / 210 | 3.31 | 17.2% | 30042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.2% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 22 |
| bvh.micro.Freya 0.3 | 3.7 | 11.5% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.1% | 20 |
| dummy.micro.Sparrow 2.5 | 4.3 | 10.9% | 15 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 6 |
| conscience.Electron 1.3g | 7.0 | 7.7% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.0 | 21 / 35 | 4892 |
| 2 | 1 | 67.1 | 76.2 | 21 / 35 | 5588 |
| 3 | 1 | 62.8 | 68.3 | 15 / 35 | 4444 |
| 4 | 1 | 61.5 | 62.9 | 14 / 35 | 4327 |
| 5 | 1 | 66.0 | 73.3 | 19 / 35 | 5325 |
| 6 | 1 | 69.0 | 85.4 | 24 / 35 | 5466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 58 | 88% |
| bvh.micro.Freya 0.3 | 25 | 92% |
| dummy.micro.Sparrow 2.5 | 22 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 80% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 25% | 70 |
| dummy.micro.Sparrow 2.5 | 17 | 18% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 16% | 13 |
| bvh.micro.Freya 0.3 | 12 | 13% | 28 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 27 |
| conscience.Electron 1.3g | 8 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 10 |
| dl.BetterWalls 1.0 | 5 | 5% | 8 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 84.3 | 137 / 210 | 2.41 | 21.2% | 44740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.2% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.5 | 14.2% | 18 |
| sul.Lunar 1.1 | 2.8 | 12.0% | 18 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.5% | 15 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 5 |
| dsw.StaticD 1.0 | 5.7 | 9.0% | 9 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.5% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 4 |
| sample.Corners 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 88.3 | 23 / 35 | 8020 |
| 2 | 1 | 72.7 | 90.5 | 25 / 35 | 7625 |
| 3 | 1 | 69.6 | 75.9 | 22 / 35 | 6861 |
| 4 | 1 | 71.9 | 87.0 | 22 / 35 | 7457 |
| 5 | 1 | 68.9 | 75.2 | 21 / 35 | 6638 |
| 6 | 1 | 73.1 | 88.9 | 24 / 35 | 8139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 59 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 87% |
| supersample.SuperBoxBot 1.0 | 22 | 68% |
| dsw.StaticD 1.0 | 10 | 70% |
| mme.NikeEnhanced 2.0 | 8 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 32% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 27% | 59 |
| sul.Lunar 1.1 | 8 | 11% | 66 |
| dsw.StaticD 1.0 | 8 | 11% | 20 |
| mme.NikeEnhanced 2.0 | 7 | 10% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 9 |
| sample.Corners 1.0 | 2 | 3% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 80.1 | 107 / 210 | 2.79 | 18.8% | 39584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.8% | 107 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 27 |
| mld.Wisdom 1.0 | 2.8 | 12.5% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.4% | 20 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.7% | 11 |
| amz.NanoClone 1.41 | 5.5 | 10.0% | 13 |
| sample.Walls 1.0 | 7.5 | 7.1% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.3% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 78.7 | 18 / 35 | 6812 |
| 2 | 1 | 70.2 | 87.6 | 21 / 35 | 6737 |
| 3 | 1 | 65.9 | 71.4 | 15 / 35 | 5883 |
| 4 | 1 | 68.3 | 79.7 | 19 / 35 | 6449 |
| 5 | 1 | 70.1 | 85.7 | 18 / 35 | 7274 |
| 6 | 1 | 67.4 | 77.5 | 16 / 35 | 6429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 87% |
| radnor.DoctorBob 1.42 | 38 | 74% |
| mld.Wisdom 1.0 | 23 | 57% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 28% | 42 |
| radnor.DoctorBob 1.42 | 24 | 23% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 17% | 57 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 21 |
| amz.NanoClone 1.41 | 6 | 6% | 13 |
| sample.Walls 1.0 | 6 | 6% | 6 |
| jangs.ns51 1.0 | 4 | 4% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 4 |

