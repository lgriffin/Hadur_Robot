# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.0 | 143 / 210 | 1.99 | 21.7% | 44719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.7% | 143 |
| mz.AntiGrav 1.0 | 2.2 | 14.8% | 23 |
| radnor.DoctorBob 1.42 | 2.8 | 14.1% | 24 |
| mld.Infinity 2.2 | 4.2 | 11.9% | 9 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 5 |
| sample.Walls 1.0 | 6.7 | 6.5% | 2 |
| jangs.ns51 1.0 | 7.0 | 6.2% | 3 |
| GarmBox.Oranges 1.0 | 7.7 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 8.7 | 5.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.0 | 25 / 35 | 7573 |
| 2 | 1 | 74.1 | 93.7 | 28 / 35 | 8070 |
| 3 | 1 | 70.0 | 83.8 | 17 / 35 | 6756 |
| 4 | 1 | 72.1 | 87.6 | 24 / 35 | 7194 |
| 5 | 1 | 73.7 | 93.0 | 27 / 35 | 7493 |
| 6 | 1 | 72.8 | 89.2 | 22 / 35 | 7633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 94 | 89% |
| radnor.DoctorBob 1.42 | 28 | 79% |
| mld.Infinity 2.2 | 27 | 89% |
| amz.NanoClone 1.41 | 7 | 71% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 34% | 52 |
| mz.AntiGrav 1.0 | 19 | 28% | 95 |
| mld.Infinity 2.2 | 6 | 9% | 30 |
| sample.Walls 1.0 | 6 | 9% | 9 |
| amz.NanoClone 1.41 | 6 | 9% | 8 |
| jangs.ns51 1.0 | 5 | 7% | 8 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.9 | 134 / 210 | 2.00 | 19.5% | 34287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.5% | 134 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.6% | 49 |
| mld.DustBunny 3.8 | 3.5 | 12.6% | 12 |
| maribo.melee.BMV 0.1 | 3.8 | 10.5% | 2 |
| zyx.nano.Ant 1.1 | 5.0 | 9.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.2% | 5 |
| fullsail.SweetTea 1.1 | 8.0 | 6.9% | 3 |
| bzdp.BoxCar 2.0 | 8.0 | 7.2% | 1 |
| cs.Grudge 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 21 / 35 | 5619 |
| 2 | 1 | 70.0 | 91.1 | 24 / 35 | 6064 |
| 3 | 1 | 69.3 | 86.0 | 23 / 35 | 6054 |
| 4 | 1 | 68.8 | 87.3 | 22 / 35 | 5321 |
| 5 | 1 | 70.8 | 94.0 | 23 / 35 | 6052 |
| 6 | 1 | 68.4 | 85.7 | 21 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 74% |
| mld.DustBunny 3.8 | 54 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 88% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 49% | 91 |
| mld.DustBunny 3.8 | 15 | 20% | 62 |
| zyx.nano.Ant 1.1 | 6 | 8% | 11 |
| maribo.melee.BMV 0.1 | 6 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 17 |
| fullsail.SweetTea 1.1 | 3 | 4% | 8 |
| cs.Grudge 1.0 | 3 | 4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 85.3 | 135 / 210 | 2.32 | 20.4% | 38849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.4% | 135 |
| myl.micro.Troodon 1.10 | 2.3 | 14.5% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.7% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.7% | 13 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.3% | 6 |
| fm.mammillarias 1.3 | 5.8 | 8.8% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 1 |
| sample.Fire 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.9 | 18 / 35 | 6164 |
| 2 | 1 | 69.7 | 82.9 | 23 / 35 | 6041 |
| 3 | 1 | 68.5 | 76.8 | 18 / 35 | 6283 |
| 4 | 1 | 70.9 | 86.3 | 22 / 35 | 6647 |
| 5 | 1 | 72.8 | 91.7 | 26 / 35 | 7032 |
| 6 | 1 | 72.5 | 91.4 | 28 / 35 | 6682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 39 | 87% |
| cb.nano.Insomnia 1.0 | 32 | 97% |
| myl.nano.KomoriNinja 1.1 | 16 | 81% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 23% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% | 40 |
| myl.nano.KomoriNinja 1.1 | 13 | 17% | 43 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 17 |
| fm.mammillarias 1.3 | 10 | 13% | 17 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 12 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 10 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 80.5 | 129 / 210 | 2.75 | 19.6% | 39758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.6% | 129 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.7% | 24 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.5% | 22 |
| tj.zombie1n 1.0.1 | 5.2 | 9.0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.9% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.2% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.3% | 8 |
| yk.JahMicro 1.0 | 7.5 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 83.2 | 24 / 35 | 6732 |
| 2 | 1 | 71.9 | 90.5 | 25 / 35 | 7068 |
| 3 | 1 | 68.7 | 80.0 | 19 / 35 | 6477 |
| 4 | 1 | 69.0 | 78.4 | 25 / 35 | 6621 |
| 5 | 1 | 67.3 | 76.5 | 17 / 35 | 6234 |
| 6 | 1 | 67.8 | 74.6 | 19 / 35 | 6626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 91% |
| stelo.SoJNanoMelee 1.1 | 22 | 91% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 75% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 38 | 47% | 96 |
| tvv.micro.Antares 1.1.1 | 11 | 14% | 29 |
| tj.zombie1n 1.0.1 | 10 | 12% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 24 |
| stelo.SoJNanoMelee 1.1 | 6 | 7% | 21 |
| yk.JahMicro 1.0 | 4 | 5% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 6 |
| repositorio.NanoStep 1.0 | 2 | 2% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 70.5 | 94 / 210 | 3.65 | 16.3% | 30247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.3% | 94 |
| oog.melee.Corsair 1.0 | 2.5 | 13.0% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.5% | 26 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 34 |
| EBBU.Sim2 1.02 | 5.5 | 10.0% | 6 |
| sam.Samspin 1.0 | 5.7 | 9.6% | 10 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.2% | 4 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.4% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 71.7 | 13 / 35 | 4818 |
| 2 | 1 | 66.9 | 77.5 | 18 / 35 | 5630 |
| 3 | 1 | 62.7 | 64.8 | 14 / 35 | 4953 |
| 4 | 1 | 63.4 | 67.0 | 16 / 35 | 4793 |
| 5 | 1 | 65.4 | 73.7 | 20 / 35 | 5051 |
| 6 | 1 | 63.7 | 68.6 | 13 / 35 | 5002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 39 | 69% |
| simonton.nano.MeleeSeed 1.8 | 35 | 89% |
| ahf.NanoAndrew .4 | 21 | 71% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 20% | 55 |
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 43 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 17 |
| ahf.NanoAndrew .4 | 14 | 12% | 30 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 12 |
| EBBU.Sim2 1.02 | 8 | 7% | 14 |
| sam.Samspin 1.0 | 7 | 6% | 16 |
| sample.TrackFire 1.0 | 6 | 5% | 7 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.6 | 119 / 210 | 2.39 | 18.8% | 32549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.8% | 119 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 43 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 12 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.3% | 12 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.3% | 8 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.9% | 10 |
| fm.claire 1.7 | 7.0 | 8.0% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 1 |
| pa.Improved 1.0 | 9.0 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 20 / 35 | 5077 |
| 2 | 1 | 69.0 | 87.0 | 19 / 35 | 5623 |
| 3 | 1 | 69.2 | 86.0 | 22 / 35 | 5606 |
| 4 | 1 | 65.7 | 77.8 | 13 / 35 | 4968 |
| 5 | 1 | 70.4 | 88.6 | 25 / 35 | 6062 |
| 6 | 1 | 67.9 | 85.1 | 20 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 83% |
| oog.melee.CapuletDroid 1.1 | 25 | 92% |
| gh.nano.Grofvuil 0.2 | 19 | 79% |
| arthord.NanoSatanMelee Beta | 12 | 67% |
| sample.SpinBot 1.0 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| fm.claire 1.7 | 3 | 67% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 34% | 79 |
| arthord.NanoSatanMelee Beta | 16 | 18% | 21 |
| gh.nano.Grofvuil 0.2 | 14 | 15% | 33 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 34 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 11 |
| fm.claire 1.7 | 5 | 5% | 7 |
| sample.SpinBot 1.0 | 4 | 4% | 8 |
| pa.Improved 1.0 | 4 | 4% | 6 |
| kurios.DOSexe .9b | 2 | 2% | 11 |

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.4 | 104 / 210 | 2.58 | 18.6% | 34798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.6% | 104 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.2% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.0% | 24 |
| mz.MicroGodMelee 1 | 3.8 | 13.2% | 38 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 2 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.5 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.3% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.6 | 21 / 35 | 6065 |
| 2 | 1 | 69.2 | 85.4 | 18 / 35 | 5881 |
| 3 | 1 | 66.9 | 78.1 | 14 / 35 | 5381 |
| 4 | 1 | 69.3 | 84.1 | 16 / 35 | 6333 |
| 5 | 1 | 68.1 | 80.3 | 19 / 35 | 5750 |
| 6 | 1 | 66.9 | 78.1 | 16 / 35 | 5388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 86% |
| mz.MicroGodMelee 1 | 41 | 63% |
| gh.micro.Gruweltje 0.7 | 28 | 68% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 34 | 32% | 55 |
| mz.MicroGodMelee 1 | 29 | 27% | 59 |
| spinnercat.micro.Tyger 0.1 | 25 | 24% | 66 |
| acogdev.alpha 0.2 | 7 | 7% | 8 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 5 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 70.3 | 103 / 210 | 3.68 | 16.6% | 31475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.6% | 103 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.3% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.8% | 29 |
| germ.TheMind .2 | 5.0 | 9.3% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.2% | 6 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.3% | 9 |
| awesomeness.Elite 1.0 | 6.7 | 8.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.3% | 3 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.6 | 16 / 35 | 4651 |
| 2 | 1 | 63.9 | 65.4 | 16 / 35 | 5187 |
| 3 | 1 | 67.2 | 75.6 | 18 / 35 | 5674 |
| 4 | 1 | 64.3 | 67.0 | 19 / 35 | 5035 |
| 5 | 1 | 67.4 | 77.1 | 18 / 35 | 5853 |
| 6 | 1 | 64.8 | 68.9 | 16 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 78% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| germ.TheMind .2 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| awesomeness.Elite 1.0 | 3 | 33% |

Hadur died in 107 of 210 rounds, at a mean tick of 395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 40% | 88 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 20% | 42 |
| awesomeness.Elite 1.0 | 10 | 9% | 13 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 14 |
| germ.TheMind .2 | 8 | 7% | 15 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 14 |
| sample.Crazy 1.0 | 4 | 4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.9 | 146 / 210 | 2.18 | 20.2% | 33983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.2% | 146 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 13 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 15 |
| maribo.IotaCT 1.1 | 4.7 | 10.2% | 7 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.2% | 3 |
| ratosh.Wesco 1.4 | 6.5 | 8.6% | 6 |
| stelo.PatternRobot 1.0 | 8.0 | 8.1% | 9 |
| spinnercat.Omen 1.0 | 8.7 | 7.3% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 88.6 | 26 / 35 | 5919 |
| 2 | 1 | 66.8 | 73.7 | 18 / 35 | 5319 |
| 3 | 1 | 71.8 | 88.9 | 24 / 35 | 6334 |
| 4 | 1 | 70.7 | 88.6 | 25 / 35 | 5240 |
| 5 | 1 | 69.4 | 86.3 | 22 / 35 | 5112 |
| 6 | 1 | 72.9 | 95.2 | 31 / 35 | 6059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 94% |
| nz.jdc.nano.GridFu 1.0 | 23 | 91% |
| timmit.nano.TimDog 0.33 | 15 | 80% |
| maribo.IotaCT 1.1 | 14 | 100% |
| stelo.PatternRobot 1.0 | 14 | 79% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |

Hadur died in 64 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 27% | 77 |
| timmit.nano.TimDog 0.33 | 13 | 20% | 26 |
| stelo.PatternRobot 1.0 | 12 | 19% | 17 |
| nz.jdc.nano.GridFu 1.0 | 7 | 11% | 45 |
| ratosh.Wesco 1.4 | 6 | 9% | 14 |
| maribo.IotaCT 1.1 | 4 | 6% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 90.9 | 162 / 210 | 1.82 | 21.7% | 41918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.7% | 162 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 18 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 5 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 3 |
| zyx.micro.Ant 1.1 | 5.2 | 9.8% | 10 |
| sanja.First 0.1 | 5.2 | 9.4% | 7 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 87.9 | 25 / 35 | 7059 |
| 2 | 1 | 70.6 | 85.7 | 25 / 35 | 6611 |
| 3 | 1 | 73.0 | 95.9 | 31 / 35 | 6995 |
| 4 | 1 | 71.2 | 87.6 | 26 / 35 | 6881 |
| 5 | 1 | 71.5 | 90.5 | 26 / 35 | 7072 |
| 6 | 1 | 73.4 | 97.8 | 29 / 35 | 7300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 93% |
| tvv.nano.Polaris 1.2 | 35 | 86% |
| sanja.First 0.1 | 32 | 97% |
| cvt.Firsty 1.0 | 24 | 96% |
| zyx.micro.Ant 1.1 | 22 | 77% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 38% | 43 |
| tvv.nano.Polaris 1.2 | 10 | 21% | 59 |
| baal.nano.N 1.42 | 5 | 10% | 35 |
| sanja.First 0.1 | 4 | 8% | 30 |
| cvt.Firsty 1.0 | 4 | 8% | 19 |
| Grystrion.TrackerWO 1.0 | 4 | 8% | 13 |
| sample.RamFire 1.0 | 2 | 4% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 68.0 | 84 / 210 | 3.88 | 15.5% | 31166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.3 | 15.5% | 84 |
| kc.micro.Figment 1.0 | 1.7 | 14.7% | 63 |
| cs.Wren 1.0 | 3.3 | 12.4% | 15 |
| mz.Cork 0.1 | 4.2 | 11.4% | 19 |
| js.PinBall 1.6 | 5.0 | 11.3% | 18 |
| joe.ADinosaur 1.0 | 5.5 | 9.9% | 7 |
| evd.X1 0.01 | 7.2 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 7.8 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.3% | 1 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 57.5 | 11 / 35 | 5028 |
| 2 | 1 | 63.5 | 69.5 | 13 / 35 | 5307 |
| 3 | 2 | 63.1 | 68.3 | 14 / 35 | 5049 |
| 4 | 1 | 65.3 | 71.7 | 16 / 35 | 5699 |
| 5 | 1 | 64.9 | 74.3 | 16 / 35 | 4713 |
| 6 | 1 | 63.6 | 67.0 | 14 / 35 | 5370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 69% |
| cs.Wren 1.0 | 23 | 78% |
| js.PinBall 1.6 | 10 | 90% |
| mz.Cork 0.1 | 10 | 70% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 40% | 96 |
| evd.X1 0.01 | 20 | 16% | 23 |
| cs.Wren 1.0 | 16 | 13% | 31 |
| js.PinBall 1.6 | 10 | 8% | 18 |
| mz.Cork 0.1 | 10 | 8% | 14 |
| PSW.Relentless 0.1 | 10 | 8% | 10 |
| joe.ADinosaur 1.0 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.8 | 137 / 210 | 2.55 | 19.0% | 30395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.0% | 137 |
| myl.nano.Graviton 1.10 | 2.0 | 12.1% | 21 |
| ntc.Opposite 1.5 | 4.0 | 10.6% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.3% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.8 | 9.4% | 10 |
| disan.Chair 2.2.0 | 6.7 | 8.5% | 5 |
| DBall.NUKE 0.1 | 6.7 | 8.3% | 6 |
| pbg.R2D2 1.0 | 9.5 | 6.0% | 4 |
| donjezza.Muncho 1.0 | 9.5 | 6.1% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.9 | 24 / 35 | 4633 |
| 2 | 1 | 70.3 | 92.7 | 25 / 35 | 5061 |
| 3 | 1 | 65.8 | 74.0 | 20 / 35 | 4840 |
| 4 | 1 | 68.4 | 85.1 | 19 / 35 | 5196 |
| 5 | 1 | 69.0 | 81.6 | 25 / 35 | 5461 |
| 6 | 1 | 68.1 | 80.6 | 24 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 97% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 91% |
| disan.Chair 2.2.0 | 18 | 94% |
| donjezza.Muncho 1.0 | 17 | 94% |
| stelo.AreaTargetingBot 1.1 | 16 | 88% |
| ntc.Opposite 1.5 | 15 | 87% |
| DBall.NUKE 0.1 | 14 | 86% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 74 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 15 | 20% | 27 |
| myl.nano.Graviton 1.10 | 14 | 19% | 44 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 31 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 22 |
| DBall.NUKE 0.1 | 5 | 7% | 21 |
| donjezza.Muncho 1.0 | 4 | 5% | 13 |
| disan.Chair 2.2.0 | 3 | 4% | 22 |
| pbg.R2D2 1.0 | 2 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.5 | 87 / 210 | 3.12 | 16.6% | 27220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.6% | 87 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 40 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 38 |
| yagami.Tidus 0.11 | 4.2 | 12.7% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 24 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.3 | 13 / 35 | 4484 |
| 2 | 1 | 65.1 | 74.0 | 13 / 35 | 4420 |
| 3 | 1 | 67.4 | 81.3 | 18 / 35 | 4558 |
| 4 | 1 | 67.3 | 81.0 | 16 / 35 | 4788 |
| 5 | 1 | 63.8 | 71.1 | 12 / 35 | 4235 |
| 6 | 1 | 66.8 | 77.1 | 15 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 93% |
| yagami.Tidus 0.11 | 27 | 89% |
| kawigi.micro.Shiz 1.1 | 23 | 87% |
| oog.melee.Capulet 1.2 | 22 | 64% |
| ejb.Polaris 1.0.1 | 5 | 60% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 36% | 62 |
| yagami.Tidus 0.11 | 21 | 17% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 14% | 40 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 30 |
| ejb.Polaris 1.0.1 | 11 | 9% | 19 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.2 | 134 / 210 | 2.96 | 17.6% | 28715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.6% | 134 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 23 |
| wee.Gem 1.8.4 | 3.3 | 11.4% | 20 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 14 |
| ratosh.Nobo 0.21 | 4.7 | 10.5% | 7 |
| m3thos.Eva00 1.1 | 5.5 | 10.0% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.3% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.4 | 22 / 35 | 4564 |
| 2 | 1 | 65.9 | 76.8 | 20 / 35 | 4885 |
| 3 | 1 | 64.5 | 72.1 | 21 / 35 | 4477 |
| 4 | 1 | 65.5 | 74.3 | 22 / 35 | 4936 |
| 5 | 1 | 67.0 | 81.0 | 23 / 35 | 4742 |
| 6 | 1 | 68.9 | 85.7 | 26 / 35 | 5111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 95% |
| wee.Gem 1.8.4 | 23 | 100% |
| wompi.Quokka 1.6 | 23 | 91% |
| m3thos.Eva00 1.1 | 13 | 100% |
| ratosh.Nobo 0.21 | 12 | 92% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 360. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 20% | 29 |
| maribo.FollowFire 1 | 15 | 19% | 14 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 13 |
| wee.Gem 1.8.4 | 8 | 10% | 40 |
| bzdp.Pansy 2.1 | 7 | 9% | 53 |
| bayen.UbaMicro 1.4 | 7 | 9% | 15 |
| m3thos.Eva00 1.1 | 6 | 8% | 18 |
| wompi.Quokka 1.6 | 6 | 8% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 89.2 | 135 / 210 | 1.98 | 22.2% | 50741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.2% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 15 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 8.7% | 0 |
| stuff.Vlad 0.1 | 5.2 | 9.1% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 85.7 | 20 / 35 | 8189 |
| 2 | 1 | 72.9 | 83.8 | 22 / 35 | 8416 |
| 3 | 1 | 74.2 | 94.3 | 25 / 35 | 8519 |
| 4 | 1 | 74.0 | 90.5 | 22 / 35 | 8472 |
| 5 | 1 | 73.4 | 87.0 | 23 / 35 | 8640 |
| 6 | 1 | 74.3 | 93.7 | 23 / 35 | 8505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 80% |
| mz.NanoGod 2.02 | 17 | 53% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 54% | 136 |
| mz.NanoGod 2.02 | 27 | 36% | 46 |
| ayk.WallHugger 1.0 | 3 | 4% | 10 |
| exauge.GateKeeper 1.1.121g | 3 | 4% | 10 |
| stelo.PianistNano 1.2 | 2 | 3% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.2 | 110 / 210 | 3.14 | 17.3% | 29859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.3% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 22 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 24 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.6% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 7 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 1 |
| dl.BetterWalls 1.0 | 8.5 | 6.6% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.7 | 14 / 35 | 4892 |
| 2 | 1 | 64.7 | 71.4 | 16 / 35 | 5132 |
| 3 | 1 | 68.2 | 83.8 | 22 / 35 | 5257 |
| 4 | 1 | 65.6 | 75.2 | 18 / 35 | 5045 |
| 5 | 1 | 65.6 | 75.9 | 17 / 35 | 4773 |
| 6 | 1 | 66.7 | 78.1 | 23 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 94% |
| dummy.micro.Sparrow 2.5 | 34 | 85% |
| bvh.micro.Freya 0.3 | 24 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 60% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 67% |

Hadur died in 100 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 19 | 19% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 28 |
| voidious.micro.BlitzBat 1.05 | 13 | 13% | 56 |
| conscience.Electron 1.3g | 12 | 12% | 14 |
| bvh.micro.Freya 0.3 | 11 | 11% | 28 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 13 |
| dl.BetterWalls 1.0 | 8 | 8% | 11 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 88.6 | 156 / 210 | 2.03 | 22.2% | 45954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.2% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 12 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 10 |
| mme.NikeEnhanced 2.0 | 4.5 | 10.2% | 6 |
| supersample.SuperBoxBot 1.0 | 4.7 | 10.2% | 9 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.6% | 7 |
| tlp.ThreeLeggedPig 1 | 8.0 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.Corners 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.6 | 26 / 35 | 7619 |
| 2 | 1 | 74.1 | 93.3 | 29 / 35 | 8029 |
| 3 | 1 | 72.1 | 87.3 | 26 / 35 | 7478 |
| 4 | 1 | 71.2 | 85.4 | 24 / 35 | 6937 |
| 5 | 1 | 72.9 | 87.0 | 24 / 35 | 8019 |
| 6 | 1 | 73.4 | 89.8 | 27 / 35 | 7872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 94% |
| sul.Lunar 1.1 | 44 | 95% |
| supersample.SuperBoxBot 1.0 | 28 | 89% |
| dsw.StaticD 1.0 | 15 | 67% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 82% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 27% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 24% | 54 |
| dsw.StaticD 1.0 | 9 | 16% | 24 |
| mme.NikeEnhanced 2.0 | 6 | 11% | 15 |
| sul.Lunar 1.1 | 5 | 9% | 51 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 10 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 10 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 78.8 | 98 / 210 | 2.90 | 18.3% | 38435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.3% | 98 |
| radnor.DoctorBob 1.42 | 2.5 | 13.3% | 27 |
| mld.Wisdom 1.0 | 3.3 | 12.8% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.3% | 26 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 16 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.0% | 6 |
| sample.Walls 1.0 | 7.5 | 6.9% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 5.7% | 4 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 78.4 | 17 / 35 | 6438 |
| 2 | 1 | 68.6 | 78.4 | 19 / 35 | 6925 |
| 3 | 1 | 67.9 | 78.7 | 15 / 35 | 6445 |
| 4 | 1 | 67.9 | 81.3 | 18 / 35 | 6150 |
| 5 | 1 | 68.3 | 81.0 | 16 / 35 | 6607 |
| 6 | 1 | 65.9 | 75.2 | 13 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 87% |
| radnor.DoctorBob 1.42 | 30 | 70% |
| mld.Wisdom 1.0 | 21 | 67% |
| amz.NanoClone 1.41 | 13 | 69% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 29% | 47 |
| radnor.DoctorBob 1.42 | 26 | 23% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 17% | 50 |
| KiraNL.Chupacabra 0.4 | 14 | 13% | 26 |
| amz.NanoClone 1.41 | 8 | 7% | 15 |
| GarmBox.Oranges 1.0 | 5 | 4% | 5 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| sample.Walls 1.0 | 3 | 3% | 6 |

