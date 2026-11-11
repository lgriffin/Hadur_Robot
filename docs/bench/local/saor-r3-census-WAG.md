# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.8 | 156 / 210 | 1.83 | 21.8% | 43468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.8% | 156 |
| radnor.DoctorBob 1.42 | 2.3 | 14.1% | 17 |
| mz.AntiGrav 1.0 | 3.2 | 13.8% | 17 |
| mld.Infinity 2.2 | 3.7 | 12.3% | 15 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 2 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.0 | 99.0 | 33 / 35 | 7654 |
| 2 | 1 | 72.2 | 89.8 | 24 / 35 | 7416 |
| 3 | 1 | 71.7 | 86.7 | 24 / 35 | 6773 |
| 4 | 1 | 72.6 | 92.4 | 27 / 35 | 6938 |
| 5 | 1 | 70.7 | 82.5 | 22 / 35 | 7144 |
| 6 | 1 | 73.6 | 94.3 | 26 / 35 | 7543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 92% |
| radnor.DoctorBob 1.42 | 41 | 88% |
| mld.Infinity 2.2 | 36 | 97% |
| amz.NanoClone 1.41 | 9 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 36% | 63 |
| mz.AntiGrav 1.0 | 16 | 29% | 69 |
| mld.Infinity 2.2 | 8 | 15% | 45 |
| amz.NanoClone 1.41 | 7 | 13% | 15 |
| GarmBox.Oranges 1.0 | 2 | 4% | 3 |
| jangs.ns51 1.0 | 1 | 2% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.4 | 118 / 210 | 2.49 | 18.5% | 32721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.5% | 118 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.8% | 50 |
| mld.DustBunny 3.8 | 2.8 | 13.7% | 18 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.9% | 6 |
| zyx.nano.Ant 1.1 | 5.8 | 8.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.8% | 7 |
| fullsail.SweetTea 1.1 | 8.2 | 6.8% | 4 |
| bzdp.BoxCar 2.0 | 8.3 | 6.7% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 18 / 35 | 4832 |
| 2 | 1 | 69.5 | 89.8 | 23 / 35 | 5374 |
| 3 | 1 | 68.8 | 87.0 | 20 / 35 | 5454 |
| 4 | 1 | 68.3 | 84.1 | 23 / 35 | 5515 |
| 5 | 1 | 70.2 | 89.8 | 23 / 35 | 5849 |
| 6 | 1 | 63.9 | 64.1 | 11 / 35 | 5697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 55 | 84% |
| oog.melee.Mercutio 1.0 | 53 | 66% |
| djdjdj.NanoSkunk10 1.0 | 13 | 100% |
| maribo.melee.BMV 0.1 | 8 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 32% | 69 |
| mld.DustBunny 3.8 | 26 | 28% | 70 |
| djdjdj.NanoSkunk10 1.0 | 10 | 11% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 13 |
| maribo.melee.BMV 0.1 | 7 | 8% | 10 |
| cs.Grudge 1.0 | 7 | 8% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 9 |
| zyx.nano.Ant 1.1 | 2 | 2% | 5 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.0 | 144 / 210 | 2.44 | 20.1% | 36613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.1% | 144 |
| myl.micro.Troodon 1.10 | 2.2 | 13.5% | 35 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.4% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.3% | 10 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 10 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |
| sample.Fire 1.0 | 9.7 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 84.4 | 26 / 35 | 6240 |
| 2 | 1 | 70.8 | 84.8 | 26 / 35 | 6404 |
| 3 | 1 | 70.3 | 84.8 | 26 / 35 | 6129 |
| 4 | 1 | 69.4 | 83.5 | 24 / 35 | 5549 |
| 5 | 1 | 70.3 | 83.8 | 23 / 35 | 6421 |
| 6 | 1 | 68.9 | 82.5 | 19 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 88% |
| cb.nano.Insomnia 1.0 | 28 | 100% |
| myl.nano.KomoriNinja 1.1 | 21 | 100% |
| sp.Nanos.Ember 1.1 | 18 | 100% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 13 | 20% | 41 |
| cb.nano.Insomnia 1.0 | 13 | 20% | 17 |
| myl.micro.Troodon 1.10 | 10 | 15% | 45 |
| fm.mammillarias 1.3 | 8 | 12% | 12 |
| myl.nano.KomoriNinja 1.1 | 7 | 11% | 45 |
| sample.Fire 1.0 | 6 | 9% | 10 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 20 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 15 |
| sample.Tracker 1.0 | 1 | 2% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 80.4 | 132 / 210 | 2.77 | 19.4% | 38020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.4% | 132 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.2% | 21 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.9% | 0 |
| yk.JahMicro 1.0 | 6.5 | 8.5% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 8.0% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 76.8 | 23 / 35 | 6202 |
| 2 | 1 | 67.3 | 78.1 | 15 / 35 | 6146 |
| 3 | 1 | 68.5 | 78.1 | 24 / 35 | 5993 |
| 4 | 1 | 70.4 | 87.3 | 23 / 35 | 6534 |
| 5 | 1 | 72.2 | 93.0 | 25 / 35 | 7244 |
| 6 | 1 | 66.5 | 68.9 | 22 / 35 | 5901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 90% |
| stelo.SoJNanoMelee 1.1 | 37 | 78% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 95% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| yk.JahMicro 1.0 | 9 | 89% |
| tj.zombie1n 1.0.1 | 9 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 31 | 40% | 75 |
| stelo.SoJNanoMelee 1.1 | 18 | 23% | 41 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 12% | 10 |
| tj.zombie1n 1.0.1 | 8 | 10% | 14 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 23 |
| yk.JahMicro 1.0 | 3 | 4% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 24 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.8 | 101 / 210 | 3.71 | 16.0% | 28463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.0% | 101 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 36 |
| ahf.NanoAndrew .4 | 4.0 | 11.1% | 23 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.8% | 20 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 13 |
| EBBU.Sim2 1.02 | 5.3 | 10.0% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.9% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 2 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 68.3 | 15 / 35 | 4526 |
| 2 | 1 | 62.1 | 63.5 | 15 / 35 | 4536 |
| 3 | 1 | 62.9 | 64.8 | 16 / 35 | 4806 |
| 4 | 1 | 65.3 | 75.6 | 18 / 35 | 4962 |
| 5 | 1 | 63.3 | 70.8 | 19 / 35 | 4424 |
| 6 | 1 | 66.3 | 76.2 | 18 / 35 | 5209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 78% |
| simonton.nano.MeleeSeed 1.8 | 23 | 91% |
| ahf.NanoAndrew .4 | 22 | 86% |
| sam.Samspin 1.0 | 15 | 100% |
| EBBU.Sim2 1.02 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 110 of 210 rounds, at a mean tick of 350. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 20% | 51 |
| simonton.nano.MeleeSeed 1.8 | 22 | 20% | 37 |
| ahf.NanoAndrew .4 | 16 | 15% | 37 |
| EBBU.Sim2 1.02 | 12 | 11% | 21 |
| zyx.nano.BacillusComma 1.0 | 11 | 10% | 15 |
| sam.Samspin 1.0 | 10 | 9% | 20 |
| robar.nano.Assertive_Melee 0.2 | 8 | 7% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 7 |
| sample.TrackFire 1.0 | 1 | 1% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.2 | 134 / 210 | 2.24 | 19.3% | 33230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.3% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.5% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.9% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.9% | 4 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.3% | 3 |
| fm.claire 1.7 | 6.2 | 8.5% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.3% | 4 |
| kurios.DOSexe .9b | 9.2 | 5.7% | 3 |
| pa.Improved 1.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 21 / 35 | 5330 |
| 2 | 1 | 69.4 | 86.7 | 24 / 35 | 5645 |
| 3 | 1 | 70.4 | 87.9 | 25 / 35 | 5788 |
| 4 | 1 | 68.7 | 85.4 | 21 / 35 | 5690 |
| 5 | 1 | 67.8 | 83.2 | 21 / 35 | 5169 |
| 6 | 1 | 69.7 | 90.5 | 22 / 35 | 5608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 77% |
| oog.melee.CapuletDroid 1.1 | 34 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| gh.nano.Grofvuil 0.2 | 15 | 87% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 3 | 67% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 39% | 79 |
| oog.melee.CapuletDroid 1.1 | 11 | 14% | 44 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 19 |
| sample.SpinBot 1.0 | 7 | 9% | 15 |
| fm.claire 1.7 | 7 | 9% | 9 |
| gh.nano.Grofvuil 0.2 | 5 | 7% | 22 |
| kurios.DOSexe .9b | 4 | 5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 11 |
| pa.Improved 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.9 | 115 / 210 | 2.45 | 18.8% | 34766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.8% | 115 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.5% | 26 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.9% | 33 |
| mz.MicroGodMelee 1 | 3.8 | 13.1% | 27 |
| DBall.Anarchy 0.1 | 5.2 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.2% | 3 |
| acogdev.alpha 0.2 | 7.3 | 6.5% | 1 |
| el.JumpShoot 0.2 | 8.3 | 6.0% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 22 / 35 | 5934 |
| 2 | 1 | 69.8 | 89.8 | 22 / 35 | 5473 |
| 3 | 1 | 68.5 | 83.5 | 17 / 35 | 5885 |
| 4 | 1 | 68.4 | 80.3 | 20 / 35 | 6132 |
| 5 | 1 | 69.0 | 82.9 | 21 / 35 | 6247 |
| 6 | 1 | 65.5 | 75.6 | 13 / 35 | 5095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 85% |
| mz.MicroGodMelee 1 | 39 | 72% |
| gh.micro.Gruweltje 0.7 | 30 | 83% |
| DBall.Anarchy 0.1 | 11 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 35% | 64 |
| gh.micro.Gruweltje 0.7 | 24 | 25% | 49 |
| spinnercat.micro.Tyger 0.1 | 18 | 19% | 58 |
| acogdev.alpha 0.2 | 5 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| DBall.Anarchy 0.1 | 3 | 3% | 12 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 77.6 | 132 / 210 | 3.02 | 18.0% | 32271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.0% | 132 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.1% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 26 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.2% | 4 |
| germ.TheMind .2 | 5.5 | 9.0% | 2 |
| awesomeness.Elite 1.0 | 6.0 | 8.3% | 2 |
| stelo.UntouchableNano 1.3 | 7.0 | 7.8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 7.9% | 2 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.5 | 24 / 35 | 5343 |
| 2 | 1 | 65.8 | 76.5 | 19 / 35 | 4705 |
| 3 | 1 | 67.3 | 78.4 | 22 / 35 | 5437 |
| 4 | 1 | 68.6 | 81.6 | 20 / 35 | 5792 |
| 5 | 1 | 68.1 | 77.8 | 24 / 35 | 5826 |
| 6 | 1 | 66.5 | 73.7 | 23 / 35 | 5168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 96% |
| qualidafial.MajorDick 1.0.1 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| germ.TheMind .2 | 7 | 86% |
| awesomeness.Elite 1.0 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 49% | 104 |
| germ.TheMind .2 | 12 | 15% | 23 |
| stelo.UntouchableNano 1.3 | 10 | 13% | 19 |
| awesomeness.Elite 1.0 | 8 | 10% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 8% | 27 |
| lrem.micro.MoggFanatic 0.2 | 3 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 6 |
| mym.EdgeStalker 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.0 | 159 / 210 | 1.81 | 20.7% | 31998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.7% | 159 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.6% | 9 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 7 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.6% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 6.8 | 8.1% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.3% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.9 | 26 / 35 | 4947 |
| 2 | 1 | 72.8 | 93.3 | 28 / 35 | 6141 |
| 3 | 1 | 71.4 | 92.4 | 27 / 35 | 5218 |
| 4 | 1 | 70.4 | 88.3 | 25 / 35 | 5202 |
| 5 | 1 | 71.2 | 92.4 | 27 / 35 | 5062 |
| 6 | 1 | 71.1 | 91.7 | 26 / 35 | 5428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 94% |
| nz.jdc.nano.GridFu 1.0 | 38 | 95% |
| timmit.nano.TimDog 0.33 | 15 | 87% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| maribo.IotaCT 1.1 | 12 | 92% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 29% | 76 |
| timmit.nano.TimDog 0.33 | 12 | 24% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 14% | 11 |
| ratosh.Wesco 1.4 | 5 | 10% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 42 |
| maribo.IotaCT 1.1 | 4 | 8% | 18 |
| stelo.PatternRobot 1.0 | 4 | 8% | 14 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.3 | 178 / 210 | 1.70 | 21.8% | 39919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.8% | 178 |
| baal.nano.N 1.42 | 2.5 | 11.4% | 4 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.7% | 14 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 2 |
| squidM.TentalceMeleeNano 1.1 | 5.7 | 8.8% | 2 |
| zyx.micro.Ant 1.1 | 6.2 | 8.5% | 5 |
| sanja.First 0.1 | 6.5 | 8.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 0 |
| cvt.Firsty 1.0 | 8.5 | 6.8% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 87.6 | 29 / 35 | 6659 |
| 2 | 1 | 71.4 | 90.2 | 28 / 35 | 6665 |
| 3 | 1 | 73.2 | 97.8 | 33 / 35 | 6935 |
| 4 | 1 | 71.5 | 90.2 | 29 / 35 | 6656 |
| 5 | 1 | 71.9 | 94.9 | 30 / 35 | 6506 |
| 6 | 1 | 71.5 | 93.0 | 29 / 35 | 6498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 40 | 93% |
| tvv.nano.Polaris 1.2 | 39 | 95% |
| cvt.Firsty 1.0 | 26 | 96% |
| Grystrion.TrackerWO 1.0 | 24 | 96% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| zyx.micro.Ant 1.1 | 12 | 83% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 8 | 25% | 52 |
| zyx.micro.Ant 1.1 | 6 | 19% | 27 |
| Grystrion.TrackerWO 1.0 | 4 | 13% | 18 |
| amk.Punbot.Punbot 0.01 | 4 | 13% | 6 |
| tvv.nano.Polaris 1.2 | 3 | 9% | 56 |
| cvt.Firsty 1.0 | 3 | 9% | 22 |
| sample.RamFire 1.0 | 2 | 6% | 3 |
| sanja.First 0.1 | 1 | 3% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 8 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.5 | 87 / 210 | 3.38 | 16.5% | 31999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 16.5% | 87 |
| kc.micro.Figment 1.0 | 1.8 | 14.8% | 56 |
| cs.Wren 1.0 | 3.2 | 12.9% | 21 |
| mz.Cork 0.1 | 4.2 | 11.2% | 19 |
| js.PinBall 1.6 | 4.7 | 11.2% | 15 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 7 |
| evd.X1 0.01 | 7.0 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.3% | 1 |
| PSW.Relentless 0.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 60.6 | 10 / 35 | 4977 |
| 2 | 2 | 64.4 | 70.8 | 13 / 35 | 4996 |
| 3 | 1 | 67.9 | 83.2 | 19 / 35 | 5331 |
| 4 | 1 | 67.9 | 83.5 | 16 / 35 | 5843 |
| 5 | 1 | 66.0 | 78.1 | 15 / 35 | 5663 |
| 6 | 1 | 63.0 | 65.1 | 14 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 63% |
| cs.Wren 1.0 | 28 | 82% |
| mz.Cork 0.1 | 7 | 71% |
| js.PinBall 1.6 | 7 | 71% |
| donjezza.Jezza 1.0 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 39% | 98 |
| cs.Wren 1.0 | 26 | 21% | 41 |
| js.PinBall 1.6 | 13 | 11% | 21 |
| evd.X1 0.01 | 9 | 7% | 10 |
| mz.Cork 0.1 | 8 | 7% | 12 |
| joe.ADinosaur 1.0 | 8 | 7% | 10 |
| PSW.Relentless 0.1 | 8 | 7% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.4 | 141 / 210 | 2.31 | 19.3% | 29689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.3% | 141 |
| ntc.Opposite 1.5 | 3.2 | 11.1% | 8 |
| myl.nano.Graviton 1.10 | 4.0 | 10.6% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.8% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.3% | 7 |
| disan.Chair 2.2.0 | 6.2 | 8.8% | 8 |
| DBall.NUKE 0.1 | 8.0 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.4 | 27 / 35 | 5069 |
| 2 | 1 | 67.2 | 81.3 | 20 / 35 | 4606 |
| 3 | 1 | 68.7 | 85.7 | 23 / 35 | 4684 |
| 4 | 1 | 70.0 | 88.6 | 26 / 35 | 5362 |
| 5 | 1 | 68.7 | 83.5 | 25 / 35 | 5056 |
| 6 | 1 | 67.3 | 81.9 | 20 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 45 | 87% |
| myl.nano.Graviton 1.10 | 30 | 83% |
| disan.Chair 2.2.0 | 22 | 86% |
| ntc.Opposite 1.5 | 16 | 88% |
| DBall.NUKE 0.1 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 79% |
| donjezza.Muncho 1.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 50% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 13 | 19% | 22 |
| myl.nano.Graviton 1.10 | 12 | 17% | 37 |
| stelo.AreaTargetingBot 1.1 | 11 | 16% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 14% | 30 |
| disan.Chair 2.2.0 | 10 | 14% | 20 |
| ntc.Opposite 1.5 | 8 | 11% | 22 |
| pbg.R2D2 1.0 | 4 | 6% | 12 |
| DBall.NUKE 0.1 | 2 | 3% | 16 |
| donjezza.Muncho 1.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.6 | 71 / 210 | 3.20 | 16.2% | 26869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 16.2% | 71 |
| oog.melee.Capulet 1.2 | 1.8 | 14.6% | 70 |
| kawigi.micro.Shiz 1.1 | 3.7 | 13.1% | 27 |
| yagami.Tidus 0.11 | 4.0 | 12.0% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 23 |
| ejb.Polaris 1.0.1 | 6.0 | 9.9% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.5 | 14 / 35 | 4815 |
| 2 | 2 | 64.9 | 76.2 | 10 / 35 | 4232 |
| 3 | 1 | 65.0 | 76.8 | 12 / 35 | 4229 |
| 4 | 1 | 65.6 | 78.7 | 13 / 35 | 4459 |
| 5 | 1 | 64.5 | 71.7 | 12 / 35 | 4292 |
| 6 | 2 | 65.2 | 73.3 | 10 / 35 | 4842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 39% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 76% |
| kawigi.micro.Shiz 1.1 | 18 | 94% |
| yagami.Tidus 0.11 | 15 | 93% |
| stelo.MirrorNano 1.3 | 3 | 67% |
| ejb.Polaris 1.0.1 | 2 | 50% |

Hadur died in 139 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 66 | 47% | 84 |
| yagami.Tidus 0.11 | 20 | 14% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 12% | 40 |
| ejb.Polaris 1.0.1 | 12 | 9% | 17 |
| kawigi.micro.Shiz 1.1 | 11 | 8% | 21 |
| stelo.MirrorNano 1.3 | 7 | 5% | 9 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.1 | 132 / 210 | 2.79 | 17.7% | 27782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.7% | 132 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 14 |
| wompi.Quokka 1.6 | 3.5 | 11.4% | 22 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 17 |
| ratosh.Nobo 0.21 | 4.2 | 11.1% | 10 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 8 |
| bayen.UbaMicro 1.4 | 7.3 | 8.4% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.3% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.3 | 22 / 35 | 4597 |
| 2 | 1 | 68.6 | 86.0 | 25 / 35 | 5022 |
| 3 | 1 | 66.8 | 83.2 | 23 / 35 | 4350 |
| 4 | 1 | 65.3 | 74.3 | 19 / 35 | 4628 |
| 5 | 1 | 66.5 | 81.3 | 22 / 35 | 4584 |
| 6 | 1 | 65.8 | 75.6 | 21 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| wee.Gem 1.8.4 | 35 | 94% |
| ratosh.Nobo 0.21 | 25 | 88% |
| wompi.Quokka 1.6 | 22 | 95% |
| m3thos.Eva00 1.1 | 5 | 80% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 21% | 32 |
| bzdp.Pansy 2.1 | 11 | 14% | 48 |
| maribo.FollowFire 1 | 11 | 14% | 13 |
| wompi.Quokka 1.6 | 9 | 12% | 23 |
| wee.Gem 1.8.4 | 7 | 9% | 45 |
| bayen.UbaMicro 1.4 | 7 | 9% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 10 |
| m3thos.Eva00 1.1 | 5 | 6% | 14 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.1 | 135 / 210 | 2.07 | 21.5% | 46842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.5% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 13 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 5 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 1 |
| stuff.Vlad 0.1 | 6.0 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 7.3 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.5 | 23 / 35 | 7624 |
| 2 | 1 | 75.0 | 94.0 | 26 / 35 | 8728 |
| 3 | 1 | 73.5 | 93.0 | 21 / 35 | 8243 |
| 4 | 1 | 70.1 | 81.0 | 19 / 35 | 6720 |
| 5 | 1 | 70.9 | 81.3 | 20 / 35 | 7232 |
| 6 | 1 | 74.5 | 96.2 | 26 / 35 | 8295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 79% |
| mz.NanoGod 2.02 | 21 | 81% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 43% | 129 |
| mz.NanoGod 2.02 | 22 | 29% | 40 |
| ayk.WallHugger 1.0 | 7 | 9% | 12 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 11 |
| stelo.PianistNano 1.2 | 6 | 8% | 7 |
| drd.Dreadknoght 0.9 | 2 | 3% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.9 | 103 / 210 | 3.44 | 16.8% | 30615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.8% | 103 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.3% | 18 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.4% | 27 |
| bvh.micro.Freya 0.3 | 4.2 | 11.4% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.9% | 3 |
| ap.Frederick 1.1 | 8.8 | 6.3% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 74.3 | 19 / 35 | 5208 |
| 2 | 1 | 68.3 | 83.8 | 21 / 35 | 5333 |
| 3 | 1 | 60.0 | 58.4 | 12 / 35 | 4720 |
| 4 | 1 | 64.4 | 71.4 | 15 / 35 | 4964 |
| 5 | 1 | 64.4 | 70.5 | 15 / 35 | 5283 |
| 6 | 1 | 66.8 | 79.0 | 21 / 35 | 5107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 91% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 85% |
| bvh.micro.Freya 0.3 | 22 | 91% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 21 | 20% | 17 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 44 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 46 |
| bvh.micro.Freya 0.3 | 15 | 14% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 34 |
| dl.BetterWalls 1.0 | 11 | 10% | 15 |
| conscience.Electron 1.3g | 10 | 9% | 17 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 8 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 84.9 | 145 / 210 | 2.36 | 20.6% | 39773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.6% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 28 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 8 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 12 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.0% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.6% | 1 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 2 |
| sample.Corners 1.0 | 9.0 | 5.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.6 | 20 / 35 | 6010 |
| 2 | 1 | 72.1 | 86.3 | 24 / 35 | 7407 |
| 3 | 1 | 71.5 | 91.4 | 27 / 35 | 6362 |
| 4 | 1 | 69.8 | 79.7 | 24 / 35 | 6413 |
| 5 | 1 | 73.4 | 95.2 | 28 / 35 | 7163 |
| 6 | 1 | 68.6 | 75.2 | 22 / 35 | 6418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 94% |
| sul.Lunar 1.1 | 41 | 98% |
| supersample.SuperBoxBot 1.0 | 22 | 100% |
| dsw.StaticD 1.0 | 11 | 64% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 37% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 18% | 52 |
| dsw.StaticD 1.0 | 12 | 18% | 23 |
| sul.Lunar 1.1 | 4 | 6% | 52 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 7 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 7 |
| sample.Corners 1.0 | 2 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.7 | 99 / 210 | 2.82 | 18.2% | 37705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.2% | 99 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 29 |
| mld.Wisdom 1.0 | 3.2 | 12.8% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.1% | 23 |
| amz.NanoClone 1.41 | 4.7 | 10.4% | 14 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 8 |
| sample.Walls 1.0 | 7.2 | 7.8% | 1 |
| GarmBox.Oranges 1.0 | 8.0 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.7 | 17 / 35 | 6235 |
| 2 | 1 | 68.8 | 82.9 | 18 / 35 | 6690 |
| 3 | 1 | 66.3 | 75.2 | 15 / 35 | 6139 |
| 4 | 1 | 67.8 | 84.4 | 17 / 35 | 5767 |
| 5 | 1 | 66.6 | 74.3 | 14 / 35 | 6312 |
| 6 | 1 | 68.8 | 81.9 | 18 / 35 | 6562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 87% |
| radnor.DoctorBob 1.42 | 30 | 73% |
| mld.Wisdom 1.0 | 22 | 55% |
| amz.NanoClone 1.41 | 13 | 46% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 27% | 43 |
| radnor.DoctorBob 1.42 | 27 | 24% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 14% | 52 |
| amz.NanoClone 1.41 | 15 | 13% | 23 |
| KiraNL.Chupacabra 0.4 | 13 | 12% | 22 |
| GarmBox.Oranges 1.0 | 5 | 4% | 7 |
| jangs.ns51 1.0 | 4 | 4% | 5 |
| sample.Walls 1.0 | 2 | 2% | 4 |

