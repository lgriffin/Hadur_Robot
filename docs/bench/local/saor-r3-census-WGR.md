# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.5 | 133 / 210 | 2.13 | 21.3% | 44340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.3% | 133 |
| mz.AntiGrav 1.0 | 2.0 | 14.9% | 26 |
| radnor.DoctorBob 1.42 | 3.3 | 13.6% | 24 |
| mld.Infinity 2.2 | 3.7 | 12.6% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 7 |
| jangs.ns51 1.0 | 6.8 | 6.6% | 1 |
| sample.Walls 1.0 | 7.0 | 6.6% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 89.2 | 22 / 35 | 7924 |
| 2 | 1 | 75.0 | 95.2 | 29 / 35 | 8437 |
| 3 | 1 | 69.3 | 80.6 | 18 / 35 | 6486 |
| 4 | 1 | 72.0 | 86.7 | 22 / 35 | 7283 |
| 5 | 1 | 71.2 | 86.0 | 20 / 35 | 6908 |
| 6 | 1 | 71.8 | 87.0 | 22 / 35 | 7302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 86 | 87% |
| mld.Infinity 2.2 | 28 | 89% |
| radnor.DoctorBob 1.42 | 21 | 81% |
| amz.NanoClone 1.41 | 8 | 75% |
| arthord.MannyPacquiao Beta | 3 | 67% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 34% | 51 |
| mz.AntiGrav 1.0 | 21 | 27% | 85 |
| mld.Infinity 2.2 | 12 | 16% | 42 |
| amz.NanoClone 1.41 | 10 | 13% | 16 |
| sample.Walls 1.0 | 6 | 8% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.1 | 115 / 210 | 2.34 | 18.9% | 34022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 18.9% | 115 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.9% | 61 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 17 |
| maribo.melee.BMV 0.1 | 4.0 | 10.2% | 2 |
| zyx.nano.Ant 1.1 | 6.2 | 8.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 7.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.0% | 7 |
| fullsail.SweetTea 1.1 | 8.2 | 6.4% | 4 |
| cs.Grudge 1.0 | 8.7 | 5.1% | 0 |
| bzdp.BoxCar 2.0 | 8.7 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.4 | 19 / 35 | 5680 |
| 2 | 1 | 70.3 | 91.7 | 22 / 35 | 5892 |
| 3 | 1 | 67.6 | 87.3 | 19 / 35 | 4664 |
| 4 | 1 | 71.6 | 94.0 | 27 / 35 | 6224 |
| 5 | 1 | 69.3 | 87.9 | 19 / 35 | 5733 |
| 6 | 2 | 64.8 | 65.4 | 9 / 35 | 5829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 65 | 86% |
| oog.melee.Mercutio 1.0 | 56 | 66% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| maribo.melee.BMV 0.1 | 4 | 50% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 37% | 77 |
| mld.DustBunny 3.8 | 28 | 29% | 79 |
| cs.Grudge 1.0 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 6 | 6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 10 |
| maribo.melee.BMV 0.1 | 5 | 5% | 7 |
| zyx.nano.Ant 1.1 | 4 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 79.5 | 124 / 210 | 2.85 | 19.2% | 37065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.2% | 124 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.9% | 11 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 7 |
| fm.mammillarias 1.3 | 5.8 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.5% | 3 |
| sample.Fire 1.0 | 9.2 | 5.2% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 80.6 | 23 / 35 | 6047 |
| 2 | 1 | 69.3 | 79.4 | 22 / 35 | 6148 |
| 3 | 1 | 70.0 | 82.5 | 20 / 35 | 6748 |
| 4 | 1 | 70.4 | 84.4 | 21 / 35 | 6599 |
| 5 | 1 | 66.4 | 72.4 | 20 / 35 | 5631 |
| 6 | 1 | 68.1 | 77.5 | 18 / 35 | 5892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 92% |
| cb.nano.Insomnia 1.0 | 24 | 96% |
| myl.nano.KomoriNinja 1.1 | 22 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 81% |
| fm.mammillarias 1.3 | 10 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sp.Nanos.Ember 1.1 | 4 | 75% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 21% | 65 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 21% | 34 |
| cb.nano.Insomnia 1.0 | 18 | 21% | 19 |
| myl.nano.KomoriNinja 1.1 | 14 | 16% | 47 |
| fm.mammillarias 1.3 | 8 | 9% | 12 |
| sample.Fire 1.0 | 5 | 6% | 14 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 10 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 9 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.7 | 141 / 210 | 2.11 | 20.7% | 39828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.7% | 141 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.2% | 19 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.4% | 16 |
| tj.zombie1n 1.0.1 | 4.7 | 9.1% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.9% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.1% | 6 |
| yk.JahMicro 1.0 | 7.3 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 23 / 35 | 6376 |
| 2 | 1 | 69.8 | 84.4 | 21 / 35 | 6784 |
| 3 | 1 | 69.5 | 85.7 | 23 / 35 | 5981 |
| 4 | 1 | 72.6 | 93.0 | 28 / 35 | 7107 |
| 5 | 1 | 70.4 | 85.4 | 24 / 35 | 6621 |
| 6 | 1 | 71.1 | 88.3 | 22 / 35 | 6959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 73 | 79% |
| stelo.SoJNanoMelee 1.1 | 32 | 91% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 78% |
| tj.zombie1n 1.0.1 | 14 | 71% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 36% | 86 |
| stelo.SoJNanoMelee 1.1 | 11 | 16% | 29 |
| tvv.micro.Antares 1.1.1 | 8 | 12% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 10% | 26 |
| tj.zombie1n 1.0.1 | 7 | 10% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 9% | 8 |
| yk.JahMicro 1.0 | 3 | 4% | 9 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.3 | 92 / 210 | 3.59 | 16.6% | 31495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.6% | 92 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 38 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 32 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 21 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 9 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.7% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.4% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 71.7 | 12 / 35 | 5656 |
| 2 | 1 | 65.0 | 74.6 | 16 / 35 | 4928 |
| 3 | 1 | 62.6 | 62.9 | 14 / 35 | 5179 |
| 4 | 1 | 67.0 | 76.5 | 19 / 35 | 5580 |
| 5 | 1 | 62.6 | 67.3 | 11 / 35 | 4875 |
| 6 | 1 | 66.2 | 74.6 | 20 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 61% |
| simonton.nano.MeleeSeed 1.8 | 35 | 94% |
| ahf.NanoAndrew .4 | 24 | 71% |
| sam.Samspin 1.0 | 9 | 78% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| EBBU.Sim2 1.02 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 44 |
| oog.melee.Corsair 1.0 | 20 | 17% | 43 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 24 |
| ahf.NanoAndrew .4 | 15 | 13% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 12 |
| EBBU.Sim2 1.02 | 12 | 10% | 20 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 14 |
| sam.Samspin 1.0 | 8 | 7% | 15 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.1 | 139 / 210 | 2.07 | 19.2% | 30595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.2% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 27 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 9.9% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 6 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 4 |
| fm.claire 1.7 | 6.7 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 2 |
| pa.Improved 1.0 | 9.3 | 5.7% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.5 | 22 / 35 | 4866 |
| 2 | 1 | 70.2 | 89.8 | 27 / 35 | 5643 |
| 3 | 1 | 69.8 | 93.0 | 24 / 35 | 5163 |
| 4 | 1 | 69.2 | 89.5 | 23 / 35 | 5040 |
| 5 | 1 | 67.8 | 85.4 | 21 / 35 | 4987 |
| 6 | 1 | 68.4 | 87.3 | 22 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 87% |
| oog.melee.CapuletDroid 1.1 | 28 | 96% |
| gh.nano.Grofvuil 0.2 | 20 | 95% |
| arthord.NanoSatanMelee Beta | 10 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 38% | 89 |
| arthord.NanoSatanMelee Beta | 11 | 15% | 17 |
| gh.nano.Grofvuil 0.2 | 9 | 13% | 34 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 36 |
| fm.claire 1.7 | 5 | 7% | 6 |
| sample.SpinBot 1.0 | 5 | 7% | 5 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 13 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.0 | 95 / 210 | 2.71 | 18.4% | 36125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.4% | 95 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.2% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 26 |
| mz.MicroGodMelee 1 | 3.3 | 13.7% | 38 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.3% | 2 |
| acogdev.alpha 0.2 | 8.2 | 5.8% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 77.5 | 15 / 35 | 6047 |
| 2 | 1 | 68.8 | 85.7 | 14 / 35 | 6215 |
| 3 | 1 | 67.9 | 81.3 | 19 / 35 | 5539 |
| 4 | 1 | 69.0 | 81.6 | 17 / 35 | 6145 |
| 5 | 1 | 67.7 | 78.4 | 14 / 35 | 6097 |
| 6 | 1 | 68.3 | 81.3 | 16 / 35 | 6082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 56 | 70% |
| spinnercat.micro.Tyger 0.1 | 36 | 92% |
| gh.micro.Gruweltje 0.7 | 26 | 50% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 37 | 32% | 54 |
| mz.MicroGodMelee 1 | 35 | 30% | 69 |
| spinnercat.micro.Tyger 0.1 | 23 | 20% | 57 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 8 |
| acogdev.alpha 0.2 | 5 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.1 | 105 / 210 | 3.33 | 16.9% | 31154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 16.9% | 105 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.6% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.6% | 34 |
| germ.TheMind .2 | 4.7 | 9.6% | 8 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 8 |
| awesomeness.Elite 1.0 | 7.2 | 8.2% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 66.0 | 13 / 35 | 5012 |
| 2 | 1 | 66.2 | 75.6 | 18 / 35 | 5460 |
| 3 | 1 | 65.3 | 73.3 | 16 / 35 | 5176 |
| 4 | 1 | 68.8 | 83.8 | 24 / 35 | 5530 |
| 5 | 1 | 63.7 | 68.3 | 15 / 35 | 4824 |
| 6 | 1 | 67.0 | 77.8 | 19 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 80% |
| qualidafial.MajorDick 1.0.1 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| germ.TheMind .2 | 8 | 63% |
| awesomeness.Elite 1.0 | 6 | 83% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 105 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 42% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 24% | 44 |
| germ.TheMind .2 | 10 | 10% | 14 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 15 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 12 |
| awesomeness.Elite 1.0 | 5 | 5% | 6 |
| sample.Crazy 1.0 | 3 | 3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.6 | 151 / 210 | 1.94 | 20.6% | 33204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.6% | 151 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.1% | 11 |
| timmit.nano.TimDog 0.33 | 4.2 | 10.4% | 13 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 4 |
| stelo.PatternRobot 1.0 | 6.8 | 8.1% | 6 |
| ratosh.Wesco 1.4 | 7.2 | 8.0% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.4% | 2 |
| spinnercat.Omen 1.0 | 8.7 | 7.1% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.7 | 23 / 35 | 5092 |
| 2 | 1 | 71.0 | 89.8 | 26 / 35 | 5430 |
| 3 | 1 | 70.3 | 88.3 | 23 / 35 | 5431 |
| 4 | 1 | 70.8 | 88.9 | 24 / 35 | 5249 |
| 5 | 1 | 72.5 | 92.4 | 28 / 35 | 6133 |
| 6 | 1 | 72.1 | 92.4 | 27 / 35 | 5869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 77 | 90% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| timmit.nano.TimDog 0.33 | 23 | 83% |
| stelo.PatternRobot 1.0 | 11 | 64% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 22% | 68 |
| timmit.nano.TimDog 0.33 | 12 | 20% | 32 |
| stelo.PatternRobot 1.0 | 10 | 17% | 19 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 41 |
| ratosh.Wesco 1.4 | 7 | 12% | 17 |
| maribo.IotaCT 1.1 | 6 | 10% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 8 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 94.3 | 167 / 210 | 1.51 | 22.3% | 41975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.3% | 167 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.3% | 18 |
| baal.nano.N 1.42 | 3.3 | 11.1% | 9 |
| Grystrion.TrackerWO 1.0 | 3.7 | 10.1% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.0% | 5 |
| sanja.First 0.1 | 6.8 | 7.9% | 4 |
| cvt.Firsty 1.0 | 7.5 | 7.5% | 5 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.3 | 28 / 35 | 6979 |
| 2 | 1 | 72.3 | 96.5 | 28 / 35 | 6689 |
| 3 | 1 | 72.5 | 93.0 | 28 / 35 | 7334 |
| 4 | 1 | 73.2 | 95.9 | 30 / 35 | 7158 |
| 5 | 1 | 72.6 | 94.9 | 29 / 35 | 7048 |
| 6 | 1 | 71.7 | 92.1 | 24 / 35 | 6767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 82% |
| baal.nano.N 1.42 | 34 | 79% |
| cvt.Firsty 1.0 | 27 | 89% |
| zyx.micro.Ant 1.1 | 22 | 86% |
| Grystrion.TrackerWO 1.0 | 22 | 95% |
| sanja.First 0.1 | 20 | 95% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 13 | 30% | 64 |
| baal.nano.N 1.42 | 9 | 21% | 37 |
| zyx.micro.Ant 1.1 | 8 | 19% | 24 |
| Grystrion.TrackerWO 1.0 | 6 | 14% | 25 |
| cvt.Firsty 1.0 | 4 | 9% | 28 |
| sanja.First 0.1 | 2 | 5% | 14 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 10 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.9 | 85 / 210 | 3.44 | 16.6% | 34082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 16.6% | 85 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 70 |
| cs.Wren 1.0 | 3.5 | 12.0% | 17 |
| js.PinBall 1.6 | 3.8 | 11.1% | 11 |
| mz.Cork 0.1 | 4.7 | 10.7% | 13 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 4 |
| evd.X1 0.01 | 6.8 | 8.3% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 68.3 | 12 / 35 | 5305 |
| 2 | 1 | 64.9 | 71.7 | 13 / 35 | 5763 |
| 3 | 1 | 66.5 | 77.1 | 16 / 35 | 5797 |
| 4 | 1 | 64.7 | 74.6 | 15 / 35 | 5081 |
| 5 | 1 | 66.1 | 74.0 | 11 / 35 | 6135 |
| 6 | 1 | 65.5 | 71.4 | 18 / 35 | 6001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 68% |
| cs.Wren 1.0 | 18 | 83% |
| js.PinBall 1.6 | 11 | 73% |
| mz.Cork 0.1 | 8 | 75% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 44% | 106 |
| js.PinBall 1.6 | 16 | 13% | 24 |
| cs.Wren 1.0 | 15 | 12% | 26 |
| joe.ADinosaur 1.0 | 11 | 9% | 11 |
| evd.X1 0.01 | 10 | 8% | 13 |
| mz.Cork 0.1 | 8 | 6% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| jsal.Jsalbot 1.0 | 4 | 3% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.1 | 120 / 210 | 2.88 | 18.2% | 29929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.2% | 120 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 22 |
| ntc.Opposite 1.5 | 4.0 | 10.9% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.7% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 10 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 11 |
| donjezza.Muncho 1.0 | 8.8 | 6.1% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 82.2 | 20 / 35 | 5510 |
| 2 | 1 | 66.0 | 73.3 | 19 / 35 | 4935 |
| 3 | 1 | 68.2 | 83.2 | 23 / 35 | 4945 |
| 4 | 1 | 63.6 | 71.4 | 13 / 35 | 4517 |
| 5 | 1 | 68.9 | 83.5 | 24 / 35 | 5061 |
| 6 | 1 | 67.5 | 81.0 | 21 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 32 | 91% |
| stelo.AreaTargetingBot 1.1 | 25 | 96% |
| ntc.Opposite 1.5 | 19 | 68% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 100% |
| disan.Chair 2.2.0 | 12 | 83% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| donjezza.Muncho 1.0 | 9 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 21 | 23% | 31 |
| myl.nano.Graviton 1.10 | 18 | 20% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 18% | 35 |
| stelo.AreaTargetingBot 1.1 | 14 | 15% | 35 |
| pfvicm.Sobieski 7.2.3b | 13 | 14% | 23 |
| disan.Chair 2.2.0 | 4 | 4% | 13 |
| DBall.NUKE 0.1 | 2 | 2% | 13 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.6 | 77 / 210 | 3.92 | 14.9% | 25762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 14.9% | 77 |
| oog.melee.Capulet 1.2 | 2.2 | 14.3% | 50 |
| kawigi.micro.Shiz 1.1 | 2.8 | 14.2% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 25 |
| yagami.Tidus 0.11 | 4.5 | 11.8% | 8 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 10 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 0 |
| step.nanoPri 1.0 | 8.2 | 7.0% | 2 |
| kurios.DOSexe .9a | 8.8 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 59.0 | 13 / 35 | 3918 |
| 2 | 1 | 65.6 | 74.9 | 16 / 35 | 4440 |
| 3 | 1 | 63.7 | 68.3 | 13 / 35 | 4498 |
| 4 | 1 | 62.8 | 66.0 | 11 / 35 | 4279 |
| 5 | 1 | 64.0 | 72.4 | 14 / 35 | 4222 |
| 6 | 1 | 61.8 | 64.8 | 10 / 35 | 4405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 34 | 97% |
| oog.melee.Capulet 1.2 | 27 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 75% |
| yagami.Tidus 0.11 | 11 | 82% |
| ejb.Polaris 1.0.1 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 38% | 70 |
| yagami.Tidus 0.11 | 23 | 17% | 34 |
| kawigi.micro.Shiz 1.1 | 17 | 13% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 13% | 31 |
| ejb.Polaris 1.0.1 | 8 | 6% | 16 |
| step.nanoPri 1.0 | 8 | 6% | 8 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.1 | 120 / 210 | 2.80 | 17.4% | 27668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.4% | 120 |
| bzdp.Pansy 2.1 | 2.7 | 12.5% | 26 |
| wee.Gem 1.8.4 | 3.2 | 11.7% | 25 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 10 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.9 | 23 / 35 | 4518 |
| 2 | 1 | 65.6 | 77.5 | 19 / 35 | 4637 |
| 3 | 1 | 66.7 | 81.9 | 19 / 35 | 4757 |
| 4 | 1 | 63.5 | 73.7 | 16 / 35 | 4237 |
| 5 | 1 | 69.7 | 92.7 | 24 / 35 | 5053 |
| 6 | 1 | 64.3 | 72.7 | 19 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 85% |
| wee.Gem 1.8.4 | 29 | 86% |
| ratosh.Nobo 0.21 | 25 | 88% |
| wompi.Quokka 1.6 | 12 | 83% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 44% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 33% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 25 | 28% | 64 |
| ratosh.Nobo 0.21 | 14 | 16% | 32 |
| bayen.UbaMicro 1.4 | 13 | 14% | 15 |
| wompi.Quokka 1.6 | 11 | 12% | 26 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 12 |
| wee.Gem 1.8.4 | 7 | 8% | 42 |
| maribo.FollowFire 1 | 7 | 8% | 8 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 5 |
| m3thos.Eva00 1.1 | 1 | 1% | 5 |

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 88.4 | 137 / 210 | 2.04 | 22.3% | 51565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.3% | 137 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 18 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 0 |
| ayk.WallHugger 1.0 | 5.2 | 9.2% | 1 |
| stuff.Vlad 0.1 | 5.2 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 83.2 | 22 / 35 | 8095 |
| 2 | 1 | 71.5 | 82.2 | 19 / 35 | 8160 |
| 3 | 1 | 74.7 | 93.7 | 24 / 35 | 8568 |
| 4 | 1 | 73.6 | 87.6 | 23 / 35 | 8598 |
| 5 | 1 | 74.7 | 92.4 | 25 / 35 | 8959 |
| 6 | 1 | 74.9 | 91.4 | 24 / 35 | 9185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 135 | 84% |
| mz.NanoGod 2.02 | 11 | 45% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 44% | 150 |
| mz.NanoGod 2.02 | 26 | 36% | 34 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 10 |
| ayk.WallHugger 1.0 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 4 | 5% | 4 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.8 | 116 / 210 | 3.09 | 17.2% | 28455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.2% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 29 |
| bvh.micro.Freya 0.3 | 3.5 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.1% | 22 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.1% | 17 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 4 |
| conscience.Electron 1.3g | 6.8 | 7.9% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 3 |
| dl.BetterWalls 1.0 | 9.0 | 5.9% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.1 | 22 / 35 | 4769 |
| 2 | 1 | 64.3 | 72.7 | 14 / 35 | 4663 |
| 3 | 1 | 67.4 | 81.3 | 23 / 35 | 4745 |
| 4 | 1 | 67.5 | 82.5 | 23 / 35 | 4978 |
| 5 | 1 | 65.4 | 77.8 | 20 / 35 | 4441 |
| 6 | 1 | 63.8 | 69.5 | 14 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 74% |
| dummy.micro.Sparrow 2.5 | 23 | 91% |
| bvh.micro.Freya 0.3 | 21 | 86% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 17% | 62 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 17% | 40 |
| bvh.micro.Freya 0.3 | 14 | 15% | 26 |
| conscience.Electron 1.3g | 12 | 13% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 13% | 12 |
| dummy.micro.Sparrow 2.5 | 9 | 10% | 24 |
| stelo.MirrorMicro 1.0 | 9 | 10% | 20 |
| dl.BetterWalls 1.0 | 6 | 6% | 12 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 86.6 | 154 / 210 | 2.20 | 21.8% | 44560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.8% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.8% | 12 |
| supersample.SuperBoxBot 1.0 | 4.5 | 9.5% | 6 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.5% | 6 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 5 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.8% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 1 |
| sample.Corners 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 79.4 | 25 / 35 | 7271 |
| 2 | 1 | 71.8 | 84.8 | 22 / 35 | 7506 |
| 3 | 1 | 71.3 | 85.1 | 24 / 35 | 7074 |
| 4 | 1 | 72.9 | 88.9 | 24 / 35 | 7774 |
| 5 | 1 | 73.5 | 91.1 | 30 / 35 | 7666 |
| 6 | 1 | 72.7 | 90.5 | 29 / 35 | 7269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 94% |
| sul.Lunar 1.1 | 45 | 98% |
| sample.MyFirstRobot 1.0 | 12 | 100% |
| supersample.SuperBoxBot 1.0 | 12 | 100% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| tlp.ThreeLeggedPig 1 | 11 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| dsw.StaticD 1.0 | 9 | 67% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 35% | 71 |
| supersample.SuperBoxBot 1.0 | 14 | 25% | 27 |
| sul.Lunar 1.1 | 6 | 11% | 53 |
| dsw.StaticD 1.0 | 5 | 9% | 14 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 11 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 12 |
| sample.Corners 1.0 | 2 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 78.5 | 111 / 210 | 2.93 | 18.5% | 38913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.5% | 111 |
| radnor.DoctorBob 1.42 | 2.0 | 13.5% | 37 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.1% | 19 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.4% | 6 |
| amz.NanoClone 1.41 | 5.7 | 10.0% | 11 |
| GarmBox.Oranges 1.0 | 7.3 | 7.7% | 1 |
| sample.Walls 1.0 | 8.0 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 83.2 | 22 / 35 | 6957 |
| 2 | 1 | 66.4 | 72.4 | 18 / 35 | 6265 |
| 3 | 1 | 68.4 | 81.3 | 17 / 35 | 6468 |
| 4 | 1 | 68.4 | 80.3 | 19 / 35 | 6432 |
| 5 | 1 | 63.4 | 65.4 | 10 / 35 | 5914 |
| 6 | 1 | 71.0 | 88.6 | 25 / 35 | 6877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 81% |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 88% |
| mld.Wisdom 1.0 | 25 | 80% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 25 | 25% | 48 |
| KiraNL.Chupacabra 0.4 | 24 | 24% | 38 |
| radnor.DoctorBob 1.42 | 22 | 22% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 14% | 38 |
| amz.NanoClone 1.41 | 10 | 10% | 17 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

