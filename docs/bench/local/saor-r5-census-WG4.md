# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 88.6 | 142 / 210 | 2.03 | 21.5% | 44502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.5% | 142 |
| mz.AntiGrav 1.0 | 2.5 | 14.4% | 24 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 25 |
| mld.Infinity 2.2 | 3.5 | 12.7% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 2 |
| jangs.ns51 1.0 | 6.8 | 6.5% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| sample.Walls 1.0 | 7.2 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 87.0 | 24 / 35 | 7421 |
| 2 | 1 | 73.0 | 91.7 | 24 / 35 | 7848 |
| 3 | 1 | 72.7 | 90.2 | 24 / 35 | 7480 |
| 4 | 1 | 71.6 | 86.7 | 25 / 35 | 7012 |
| 5 | 1 | 71.6 | 87.0 | 23 / 35 | 7258 |
| 6 | 1 | 72.4 | 88.9 | 22 / 35 | 7483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 93% |
| mld.Infinity 2.2 | 35 | 94% |
| radnor.DoctorBob 1.42 | 32 | 72% |
| amz.NanoClone 1.41 | 10 | 100% |
| sample.Walls 1.0 | 4 | 75% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 44% | 57 |
| mz.AntiGrav 1.0 | 15 | 22% | 77 |
| mld.Infinity 2.2 | 11 | 16% | 44 |
| amz.NanoClone 1.41 | 6 | 9% | 12 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.3 | 119 / 210 | 2.50 | 18.7% | 33820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.7% | 119 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 54 |
| mld.DustBunny 3.8 | 2.7 | 14.4% | 16 |
| maribo.melee.BMV 0.1 | 4.2 | 10.2% | 4 |
| zyx.nano.Ant 1.1 | 6.0 | 8.3% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.0% | 10 |
| fullsail.SweetTea 1.1 | 7.8 | 7.2% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 23 / 35 | 5648 |
| 2 | 1 | 66.3 | 68.3 | 12 / 35 | 6426 |
| 3 | 1 | 69.5 | 87.3 | 24 / 35 | 5452 |
| 4 | 1 | 68.4 | 84.4 | 18 / 35 | 5586 |
| 5 | 1 | 69.8 | 89.8 | 22 / 35 | 5636 |
| 6 | 1 | 67.7 | 81.9 | 20 / 35 | 5072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 63 | 92% |
| oog.melee.Mercutio 1.0 | 52 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 37% | 72 |
| mld.DustBunny 3.8 | 29 | 32% | 85 |
| zyx.nano.Ant 1.1 | 7 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 12 |
| cs.Grudge 1.0 | 5 | 5% | 6 |
| fullsail.SweetTea 1.1 | 3 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 6 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 80.4 | 123 / 210 | 2.76 | 19.4% | 36805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.4% | 123 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.5% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.2% | 24 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 2 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.1% | 4 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 2 |
| sample.Fire 1.0 | 9.3 | 5.1% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 73.7 | 21 / 35 | 6240 |
| 2 | 1 | 69.6 | 84.1 | 19 / 35 | 6341 |
| 3 | 1 | 68.2 | 77.5 | 19 / 35 | 6019 |
| 4 | 1 | 70.5 | 84.8 | 23 / 35 | 5998 |
| 5 | 1 | 70.0 | 84.1 | 22 / 35 | 6070 |
| 6 | 1 | 68.7 | 78.4 | 19 / 35 | 6137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 80% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 73% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 12 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 30 | 34% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 16% | 24 |
| cb.nano.Insomnia 1.0 | 14 | 16% | 22 |
| fm.mammillarias 1.3 | 11 | 13% | 22 |
| myl.nano.KomoriNinja 1.1 | 9 | 10% | 42 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 19 |
| sample.Fire 1.0 | 3 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 11 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.7 | 143 / 210 | 2.20 | 20.7% | 40619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.7% | 143 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.8% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 18 |
| tj.zombie1n 1.0.1 | 5.2 | 8.8% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 5.8 | 8.6% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.5% | 0 |
| yk.JahMicro 1.0 | 7.0 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 3 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.2 | 27 / 35 | 7100 |
| 2 | 1 | 73.0 | 95.2 | 28 / 35 | 7065 |
| 3 | 1 | 68.2 | 79.4 | 18 / 35 | 6422 |
| 4 | 1 | 69.7 | 86.0 | 21 / 35 | 6208 |
| 5 | 1 | 71.1 | 86.7 | 25 / 35 | 7030 |
| 6 | 1 | 70.2 | 83.8 | 24 / 35 | 6794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 96% |
| stelo.SoJNanoMelee 1.1 | 25 | 92% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 75% |
| tvv.micro.Antares 1.1.1 | 15 | 87% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 75% |

Hadur died in 67 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 30% | 93 |
| tvv.micro.Antares 1.1.1 | 13 | 19% | 28 |
| stelo.SoJNanoMelee 1.1 | 8 | 12% | 27 |
| tj.zombie1n 1.0.1 | 7 | 10% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 9% | 6 |
| yk.JahMicro 1.0 | 3 | 4% | 13 |
| repositorio.NanoStep 1.0 | 2 | 3% | 10 |
| sample.VelociRobot 1.0 | 2 | 3% | 5 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 65.8 | 84 / 210 | 4.08 | 15.9% | 31338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 15.9% | 84 |
| oog.melee.Corsair 1.0 | 2.0 | 13.3% | 41 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 20 |
| sam.Samspin 1.0 | 5.8 | 9.5% | 11 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 67.6 | 16 / 35 | 5478 |
| 2 | 1 | 62.6 | 63.5 | 14 / 35 | 4924 |
| 3 | 1 | 62.5 | 61.9 | 13 / 35 | 4900 |
| 4 | 1 | 63.0 | 64.1 | 13 / 35 | 5133 |
| 5 | 1 | 65.7 | 71.4 | 13 / 35 | 5829 |
| 6 | 1 | 63.3 | 66.0 | 15 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 36 | 67% |
| ahf.NanoAndrew .4 | 14 | 64% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| EBBU.Sim2 1.02 | 6 | 83% |
| sam.Samspin 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 0% |

Hadur died in 126 of 210 rounds, at a mean tick of 376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 19% | 51 |
| simonton.nano.MeleeSeed 1.8 | 22 | 17% | 48 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 26 |
| ahf.NanoAndrew .4 | 18 | 14% | 28 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 13 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 13 |
| EBBU.Sim2 1.02 | 10 | 8% | 14 |
| sam.Samspin 1.0 | 8 | 6% | 10 |
| sample.TrackFire 1.0 | 3 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.7 | 123 / 210 | 2.47 | 18.7% | 31996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.7% | 123 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 40 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.9% | 13 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 9.6% | 9 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.3% | 6 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 9.1% | 14 |
| fm.claire 1.7 | 6.0 | 8.9% | 1 |
| pa.Improved 1.0 | 8.3 | 6.6% | 0 |
| sample.SpinBot 1.0 | 8.5 | 6.3% | 3 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.6 | 19 / 35 | 5209 |
| 2 | 1 | 67.2 | 79.4 | 21 / 35 | 5051 |
| 3 | 1 | 67.9 | 80.6 | 19 / 35 | 5794 |
| 4 | 1 | 69.6 | 90.5 | 25 / 35 | 5200 |
| 5 | 1 | 68.2 | 86.0 | 17 / 35 | 5418 |
| 6 | 1 | 68.5 | 84.8 | 22 / 35 | 5324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 78% |
| oog.melee.CapuletDroid 1.1 | 23 | 96% |
| gh.nano.Grofvuil 0.2 | 20 | 70% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| winamp32.micro.MicroMacro 1.0 | 13 | 77% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 87 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 36% | 87 |
| gh.nano.Grofvuil 0.2 | 20 | 23% | 40 |
| winamp32.micro.MicroMacro 1.0 | 13 | 15% | 23 |
| oog.melee.CapuletDroid 1.1 | 8 | 9% | 31 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 14 |
| fm.claire 1.7 | 3 | 3% | 7 |
| sample.SpinBot 1.0 | 3 | 3% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 2 |
| pa.Improved 1.0 | 1 | 1% | 0 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.4 | 101 / 210 | 2.76 | 18.2% | 34184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 18.2% | 101 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 15.3% | 37 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.7% | 36 |
| mz.MicroGodMelee 1 | 3.8 | 13.4% | 23 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.5 | 5.9% | 2 |
| acogdev.alpha 0.2 | 8.3 | 5.8% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.3 | 20 / 35 | 5768 |
| 2 | 1 | 69.2 | 87.3 | 15 / 35 | 5701 |
| 3 | 1 | 68.6 | 80.0 | 21 / 35 | 5850 |
| 4 | 2 | 64.3 | 67.9 | 11 / 35 | 5469 |
| 5 | 1 | 70.3 | 90.8 | 19 / 35 | 5847 |
| 6 | 1 | 66.5 | 75.2 | 15 / 35 | 5549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 55 | 87% |
| mz.MicroGodMelee 1 | 34 | 68% |
| gh.micro.Gruweltje 0.7 | 30 | 67% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 28 | 26% | 51 |
| mz.MicroGodMelee 1 | 26 | 24% | 49 |
| spinnercat.micro.Tyger 0.1 | 25 | 23% | 64 |
| acogdev.alpha 0.2 | 10 | 9% | 12 |
| caimano.Furia_Ceca 0.22 | 10 | 9% | 11 |
| DBall.Anarchy 0.1 | 4 | 4% | 11 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 65.1 | 92 / 210 | 4.14 | 15.5% | 30246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.0% | 41 |
| hadur117.micro.SaorWG4 0.1 | 1.8 | 15.5% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 33 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 6 |
| germ.TheMind .2 | 6.0 | 8.9% | 4 |
| awesomeness.Elite 1.0 | 6.2 | 8.7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 7 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.0% | 10 |
| sample.Crazy 1.0 | 8.5 | 7.3% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 72.7 | 19 / 35 | 5469 |
| 2 | 2 | 63.1 | 65.4 | 13 / 35 | 5011 |
| 3 | 3 | 61.7 | 59.7 | 14 / 35 | 4882 |
| 4 | 1 | 63.1 | 67.9 | 15 / 35 | 4911 |
| 5 | 3 | 62.3 | 59.4 | 14 / 35 | 5071 |
| 6 | 1 | 63.0 | 65.7 | 17 / 35 | 4902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 94% |
| stelo.UntouchableNano 1.3 | 8 | 75% |
| germ.TheMind .2 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 33% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 49% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 14% | 32 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 18 |
| awesomeness.Elite 1.0 | 10 | 8% | 13 |
| germ.TheMind .2 | 9 | 8% | 20 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 9 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.5 | 126 / 210 | 2.49 | 19.3% | 32654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.3% | 126 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 26 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.5% | 21 |
| maribo.IotaCT 1.1 | 4.7 | 10.7% | 6 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 8.0% | 8 |
| spinnercat.Omen 1.0 | 8.5 | 7.2% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.9 | 18 / 35 | 5104 |
| 2 | 1 | 69.8 | 86.0 | 20 / 35 | 5438 |
| 3 | 1 | 71.3 | 87.6 | 26 / 35 | 6001 |
| 4 | 1 | 69.7 | 86.0 | 20 / 35 | 5216 |
| 5 | 1 | 66.8 | 73.7 | 16 / 35 | 5039 |
| 6 | 1 | 70.8 | 85.7 | 26 / 35 | 5856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 86% |
| nz.jdc.nano.GridFu 1.0 | 26 | 96% |
| timmit.nano.TimDog 0.33 | 15 | 67% |
| stelo.PatternRobot 1.0 | 9 | 67% |
| maribo.IotaCT 1.1 | 9 | 89% |
| ratosh.Wesco 1.4 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 25 | 30% | 71 |
| timmit.nano.TimDog 0.33 | 16 | 19% | 25 |
| nz.jdc.nano.GridFu 1.0 | 14 | 17% | 46 |
| ratosh.Wesco 1.4 | 11 | 13% | 17 |
| stelo.PatternRobot 1.0 | 7 | 8% | 18 |
| maribo.IotaCT 1.1 | 4 | 5% | 14 |
| spinnercat.Omen 1.0 | 4 | 5% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 12 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.7 | 160 / 210 | 1.84 | 21.7% | 41693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.7% | 160 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.3% | 18 |
| baal.nano.N 1.42 | 2.5 | 11.8% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 11 |
| sanja.First 0.1 | 5.8 | 8.7% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.7% | 9 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.1% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 82.2 | 25 / 35 | 6479 |
| 2 | 1 | 72.8 | 95.6 | 28 / 35 | 7245 |
| 3 | 1 | 71.2 | 91.1 | 27 / 35 | 6579 |
| 4 | 1 | 70.4 | 84.8 | 24 / 35 | 6586 |
| 5 | 1 | 73.2 | 94.6 | 26 / 35 | 7706 |
| 6 | 1 | 72.7 | 95.9 | 30 / 35 | 7098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 37 | 100% |
| tvv.nano.Polaris 1.2 | 32 | 78% |
| cvt.Firsty 1.0 | 30 | 97% |
| sanja.First 0.1 | 22 | 100% |
| zyx.micro.Ant 1.1 | 18 | 61% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 26% | 30 |
| tvv.nano.Polaris 1.2 | 12 | 24% | 57 |
| Grystrion.TrackerWO 1.0 | 7 | 14% | 12 |
| cvt.Firsty 1.0 | 5 | 10% | 29 |
| baal.nano.N 1.42 | 4 | 8% | 44 |
| sample.RamFire 1.0 | 4 | 8% | 6 |
| sanja.First 0.1 | 2 | 4% | 15 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.2 | 73 / 210 | 3.95 | 15.5% | 32856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.3 | 15.5% | 73 |
| kc.micro.Figment 1.0 | 1.7 | 14.4% | 65 |
| cs.Wren 1.0 | 3.2 | 12.9% | 29 |
| mz.Cork 0.1 | 4.5 | 11.3% | 7 |
| js.PinBall 1.6 | 4.5 | 11.2% | 19 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 5 |
| evd.X1 0.01 | 7.0 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.3 | 5.3% | 4 |
| PSW.Relentless 0.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 65.4 | 14 / 35 | 5332 |
| 2 | 1 | 63.4 | 67.0 | 12 / 35 | 5451 |
| 3 | 1 | 65.6 | 72.7 | 15 / 35 | 5777 |
| 4 | 2 | 62.5 | 65.4 | 11 / 35 | 5324 |
| 5 | 1 | 63.0 | 66.3 | 10 / 35 | 5649 |
| 6 | 1 | 62.3 | 66.3 | 11 / 35 | 5323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 55% |
| mz.Cork 0.1 | 16 | 88% |
| cs.Wren 1.0 | 15 | 73% |
| js.PinBall 1.6 | 10 | 60% |
| jsal.Jsalbot 1.0 | 8 | 88% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 41% | 88 |
| js.PinBall 1.6 | 22 | 16% | 29 |
| cs.Wren 1.0 | 15 | 11% | 25 |
| evd.X1 0.01 | 13 | 9% | 17 |
| joe.ADinosaur 1.0 | 11 | 8% | 12 |
| mz.Cork 0.1 | 10 | 7% | 20 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| jsal.Jsalbot 1.0 | 4 | 3% | 11 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.5 | 122 / 210 | 2.67 | 18.8% | 31343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.8% | 122 |
| myl.nano.Graviton 1.10 | 2.7 | 11.8% | 22 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.4% | 20 |
| ntc.Opposite 1.5 | 4.0 | 10.9% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.2% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.2% | 7 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 14 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.3 | 5.7% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.3 | 19 / 35 | 4992 |
| 2 | 1 | 67.2 | 79.7 | 16 / 35 | 5319 |
| 3 | 1 | 65.5 | 72.7 | 17 / 35 | 4872 |
| 4 | 1 | 69.3 | 83.5 | 24 / 35 | 5349 |
| 5 | 1 | 69.5 | 85.1 | 26 / 35 | 5338 |
| 6 | 1 | 69.6 | 87.6 | 20 / 35 | 5473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 88% |
| stelo.AreaTargetingBot 1.1 | 32 | 84% |
| ntc.Opposite 1.5 | 22 | 91% |
| disan.Chair 2.2.0 | 18 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| DBall.NUKE 0.1 | 9 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 20% | 49 |
| stelo.AreaTargetingBot 1.1 | 16 | 18% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 24 |
| pfvicm.Sobieski 7.2.3b | 14 | 16% | 20 |
| ntc.Opposite 1.5 | 11 | 12% | 28 |
| disan.Chair 2.2.0 | 9 | 10% | 20 |
| pbg.R2D2 1.0 | 6 | 7% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 10 |
| donjezza.Muncho 1.0 | 0 | 0% | 7 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.9 | 103 / 210 | 3.08 | 16.9% | 27637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.9% | 103 |
| oog.melee.Capulet 1.2 | 2.3 | 14.3% | 51 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 20 |
| yagami.Tidus 0.11 | 5.0 | 11.2% | 5 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.3 | 17 / 35 | 4920 |
| 2 | 1 | 67.8 | 80.0 | 20 / 35 | 5013 |
| 3 | 1 | 67.2 | 80.3 | 20 / 35 | 4472 |
| 4 | 1 | 65.1 | 72.1 | 16 / 35 | 4507 |
| 5 | 1 | 65.8 | 77.8 | 16 / 35 | 4351 |
| 6 | 1 | 64.3 | 70.2 | 14 / 35 | 4374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 66% |
| kawigi.micro.Shiz 1.1 | 35 | 91% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 81% |
| yagami.Tidus 0.11 | 19 | 100% |
| ejb.Polaris 1.0.1 | 6 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 40% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 20% | 46 |
| yagami.Tidus 0.11 | 12 | 11% | 30 |
| kawigi.micro.Shiz 1.1 | 11 | 10% | 32 |
| ejb.Polaris 1.0.1 | 7 | 7% | 17 |
| stelo.MirrorNano 1.3 | 6 | 6% | 6 |
| kurios.DOSexe .9a | 5 | 5% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.3 | 133 / 210 | 2.87 | 17.9% | 29024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.9% | 133 |
| bzdp.Pansy 2.1 | 2.5 | 12.7% | 20 |
| ratosh.Nobo 0.21 | 3.5 | 11.4% | 7 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 22 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.9 | 20 / 35 | 4782 |
| 2 | 1 | 67.5 | 81.0 | 20 / 35 | 5404 |
| 3 | 1 | 65.7 | 74.0 | 22 / 35 | 4602 |
| 4 | 1 | 65.0 | 73.3 | 20 / 35 | 4640 |
| 5 | 1 | 67.1 | 80.0 | 24 / 35 | 4764 |
| 6 | 1 | 68.3 | 84.4 | 27 / 35 | 4832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 95% |
| wee.Gem 1.8.4 | 37 | 97% |
| wompi.Quokka 1.6 | 19 | 84% |
| ratosh.Nobo 0.21 | 14 | 93% |
| m3thos.Eva00 1.1 | 9 | 67% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 386. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 13 | 17% | 14 |
| bzdp.Pansy 2.1 | 12 | 16% | 67 |
| wee.Gem 1.8.4 | 10 | 13% | 46 |
| ratosh.Nobo 0.21 | 10 | 13% | 24 |
| wompi.Quokka 1.6 | 8 | 10% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 7 |
| bayen.UbaMicro 1.4 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 6 |
| m3thos.Eva00 1.1 | 5 | 6% | 11 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 88.7 | 135 / 210 | 2.01 | 22.2% | 50783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 22.2% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 54 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 14 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 6 |
| ayk.WallHugger 1.0 | 5.2 | 8.7% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 94.3 | 25 / 35 | 9356 |
| 2 | 1 | 70.5 | 78.7 | 17 / 35 | 7424 |
| 3 | 1 | 73.6 | 89.2 | 22 / 35 | 8566 |
| 4 | 1 | 73.8 | 90.2 | 24 / 35 | 8248 |
| 5 | 1 | 74.9 | 91.1 | 28 / 35 | 8985 |
| 6 | 1 | 73.2 | 88.9 | 19 / 35 | 8204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 84% |
| mz.NanoGod 2.02 | 16 | 75% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 45% | 142 |
| mz.NanoGod 2.02 | 23 | 30% | 37 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 12 |
| ayk.WallHugger 1.0 | 4 | 5% | 4 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| stuff.Vlad 0.1 | 2 | 3% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.4 | 107 / 210 | 3.58 | 16.4% | 28913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.4% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.7% | 33 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.5% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.4% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 3 |
| conscience.Electron 1.3g | 7.0 | 7.9% | 3 |
| ap.Frederick 1.1 | 7.8 | 7.4% | 9 |
| dl.BetterWalls 1.0 | 9.2 | 6.1% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 70.2 | 14 / 35 | 4656 |
| 2 | 1 | 65.0 | 74.0 | 19 / 35 | 4629 |
| 3 | 1 | 64.2 | 68.9 | 18 / 35 | 4758 |
| 4 | 1 | 66.9 | 77.5 | 19 / 35 | 5260 |
| 5 | 1 | 66.3 | 75.6 | 21 / 35 | 5033 |
| 6 | 1 | 61.8 | 62.2 | 16 / 35 | 4577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 87% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 78% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 26% | 72 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 44 |
| conscience.Electron 1.3g | 14 | 14% | 16 |
| bvh.micro.Freya 0.3 | 13 | 13% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 23 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 12 |
| dl.BetterWalls 1.0 | 4 | 4% | 6 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.2 | 152 / 210 | 2.15 | 21.8% | 44207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.8% | 152 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.3% | 16 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 13 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.2% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 4 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.1% | 6 |
| sample.Corners 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 90.2 | 27 / 35 | 7442 |
| 2 | 1 | 72.4 | 88.9 | 25 / 35 | 7283 |
| 3 | 1 | 72.7 | 87.6 | 27 / 35 | 7733 |
| 4 | 1 | 71.3 | 87.3 | 24 / 35 | 7108 |
| 5 | 1 | 72.7 | 89.8 | 28 / 35 | 7223 |
| 6 | 1 | 70.8 | 79.4 | 21 / 35 | 7418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 90% |
| supersample.SuperBoxBot 1.0 | 27 | 89% |
| dsw.StaticD 1.0 | 11 | 82% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 31% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 21% | 55 |
| sul.Lunar 1.1 | 9 | 16% | 62 |
| dsw.StaticD 1.0 | 9 | 16% | 19 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 2 | 3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 10 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 77.7 | 99 / 210 | 3.00 | 18.3% | 39608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.3% | 99 |
| radnor.DoctorBob 1.42 | 2.5 | 13.3% | 39 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 24 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.7% | 6 |
| amz.NanoClone 1.41 | 4.7 | 10.2% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.6% | 22 |
| GarmBox.Oranges 1.0 | 7.5 | 7.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.5% | 7 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.0 | 15 / 35 | 6583 |
| 2 | 1 | 69.0 | 80.3 | 20 / 35 | 6736 |
| 3 | 1 | 65.2 | 68.9 | 14 / 35 | 6461 |
| 4 | 1 | 67.3 | 78.1 | 16 / 35 | 6225 |
| 5 | 1 | 69.9 | 83.5 | 18 / 35 | 7393 |
| 6 | 1 | 66.5 | 75.6 | 16 / 35 | 6210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 62% |
| mld.Wisdom 1.0 | 31 | 68% |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 100% |
| amz.NanoClone 1.41 | 13 | 69% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 30% | 54 |
| mld.Wisdom 1.0 | 29 | 26% | 56 |
| KiraNL.Chupacabra 0.4 | 21 | 19% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 11% | 42 |
| amz.NanoClone 1.41 | 9 | 8% | 16 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 3 |

