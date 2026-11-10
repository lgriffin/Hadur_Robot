# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.1 | 119 / 210 | 2.34 | 20.4% | 42500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.4% | 119 |
| radnor.DoctorBob 1.42 | 2.3 | 14.8% | 39 |
| mz.AntiGrav 1.0 | 2.8 | 13.7% | 21 |
| mld.Infinity 2.2 | 4.2 | 12.6% | 18 |
| amz.NanoClone 1.41 | 4.7 | 11.7% | 10 |
| sample.Walls 1.0 | 6.7 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.3 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.7 | 19 / 35 | 7159 |
| 2 | 1 | 72.4 | 88.9 | 21 / 35 | 7781 |
| 3 | 1 | 70.1 | 79.0 | 20 / 35 | 6769 |
| 4 | 1 | 71.5 | 87.3 | 18 / 35 | 7310 |
| 5 | 1 | 72.4 | 91.7 | 24 / 35 | 7069 |
| 6 | 1 | 69.2 | 77.8 | 17 / 35 | 6412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 87% |
| radnor.DoctorBob 1.42 | 44 | 59% |
| mld.Infinity 2.2 | 28 | 93% |
| amz.NanoClone 1.41 | 10 | 40% |
| jangs.ns51 1.0 | 3 | 67% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 46% | 77 |
| mz.AntiGrav 1.0 | 23 | 25% | 66 |
| amz.NanoClone 1.41 | 14 | 15% | 17 |
| mld.Infinity 2.2 | 6 | 6% | 34 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.9 | 119 / 210 | 2.18 | 18.8% | 31869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.8% | 119 |
| mld.DustBunny 3.8 | 2.3 | 14.3% | 23 |
| oog.melee.Mercutio 1.0 | 2.7 | 14.5% | 50 |
| maribo.melee.BMV 0.1 | 4.2 | 10.4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.2% | 7 |
| zyx.nano.Ant 1.1 | 6.2 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.0% | 5 |
| fullsail.SweetTea 1.1 | 7.5 | 6.9% | 1 |
| bzdp.BoxCar 2.0 | 8.3 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 19 / 35 | 5328 |
| 2 | 1 | 69.1 | 88.3 | 19 / 35 | 5638 |
| 3 | 1 | 69.7 | 93.3 | 25 / 35 | 5253 |
| 4 | 1 | 70.2 | 92.4 | 23 / 35 | 5443 |
| 5 | 1 | 66.1 | 77.5 | 17 / 35 | 5004 |
| 6 | 1 | 67.3 | 83.5 | 16 / 35 | 5203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 68 | 79% |
| oog.melee.Mercutio 1.0 | 51 | 76% |
| maribo.melee.BMV 0.1 | 14 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 36 | 40% | 81 |
| oog.melee.Mercutio 1.0 | 30 | 33% | 77 |
| maribo.melee.BMV 0.1 | 8 | 9% | 18 |
| fullsail.SweetTea 1.1 | 6 | 7% | 10 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 78.3 | 129 / 210 | 2.96 | 18.9% | 35551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.9% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 11 |
| fm.mammillarias 1.3 | 4.5 | 9.8% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.6% | 11 |
| cb.nano.Insomnia 1.0 | 6.0 | 8.7% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 6 |
| sample.Fire 1.0 | 8.8 | 5.4% | 4 |
| sample.Tracker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 79.0 | 22 / 35 | 6057 |
| 2 | 1 | 69.2 | 79.0 | 22 / 35 | 6289 |
| 3 | 1 | 65.9 | 70.2 | 17 / 35 | 5764 |
| 4 | 1 | 71.5 | 87.0 | 27 / 35 | 6262 |
| 5 | 1 | 70.0 | 83.2 | 25 / 35 | 5939 |
| 6 | 1 | 65.3 | 71.1 | 16 / 35 | 5240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 96% |
| myl.nano.KomoriNinja 1.1 | 24 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 91% |
| cb.nano.Insomnia 1.0 | 14 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 21% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 21% | 35 |
| cb.nano.Insomnia 1.0 | 14 | 17% | 18 |
| fm.mammillarias 1.3 | 10 | 12% | 14 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 39 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 14 |
| sample.Tracker 1.0 | 4 | 5% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 9 |
| sample.Fire 1.0 | 2 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.4 | 132 / 210 | 2.22 | 20.2% | 38439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.2% | 132 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 25 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.3% | 13 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.2% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.0% | 7 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 8.4% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.6 | 25 / 35 | 6658 |
| 2 | 1 | 69.3 | 86.0 | 22 / 35 | 5970 |
| 3 | 1 | 70.0 | 86.7 | 23 / 35 | 6269 |
| 4 | 1 | 70.2 | 86.7 | 23 / 35 | 6416 |
| 5 | 1 | 68.9 | 82.9 | 19 / 35 | 6286 |
| 6 | 1 | 70.6 | 88.6 | 20 / 35 | 6840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 87% |
| stelo.SoJNanoMelee 1.1 | 33 | 82% |
| tvv.micro.Antares 1.1.1 | 23 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 95% |
| tj.zombie1n 1.0.1 | 12 | 75% |
| yk.JahMicro 1.0 | 9 | 89% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 29% | 77 |
| stelo.SoJNanoMelee 1.1 | 17 | 22% | 37 |
| tvv.micro.Antares 1.1.1 | 14 | 18% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 27 |
| tj.zombie1n 1.0.1 | 7 | 9% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 8% | 8 |
| yk.JahMicro 1.0 | 3 | 4% | 11 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.6 | 77 / 210 | 3.74 | 16.1% | 31131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.1% | 77 |
| oog.melee.Corsair 1.0 | 2.0 | 13.6% | 50 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.5% | 20 |
| sam.Samspin 1.0 | 5.0 | 9.8% | 21 |
| EBBU.Sim2 1.02 | 6.3 | 9.2% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.8% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.9% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 63.5 | 9 / 35 | 4591 |
| 2 | 1 | 66.7 | 76.8 | 15 / 35 | 5792 |
| 3 | 1 | 62.9 | 67.0 | 15 / 35 | 4899 |
| 4 | 1 | 66.3 | 77.5 | 15 / 35 | 5454 |
| 5 | 1 | 62.9 | 65.7 | 11 / 35 | 4907 |
| 6 | 1 | 63.9 | 67.0 | 12 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 39 | 49% |
| simonton.nano.MeleeSeed 1.8 | 28 | 86% |
| ahf.NanoAndrew .4 | 19 | 53% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 6 | 67% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 25% | 52 |
| simonton.nano.MeleeSeed 1.8 | 25 | 19% | 44 |
| ahf.NanoAndrew .4 | 25 | 19% | 35 |
| robar.nano.Assertive_Melee 0.2 | 12 | 9% | 20 |
| sam.Samspin 1.0 | 11 | 8% | 15 |
| zyx.nano.BacillusComma 1.0 | 11 | 8% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 7% | 13 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |
| EBBU.Sim2 1.02 | 3 | 2% | 11 |

## Melee bench: F06

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.7 | 122 / 210 | 2.47 | 18.8% | 32353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.8% | 122 |
| d414.nano.Quantum 1.0.0 | 2.2 | 15.2% | 32 |
| gh.nano.Grofvuil 0.2 | 3.7 | 11.8% | 16 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 11.0% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.3% | 6 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 3 |
| fm.claire 1.7 | 6.2 | 8.4% | 2 |
| pa.Improved 1.0 | 8.7 | 6.1% | 0 |
| sample.SpinBot 1.0 | 9.0 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.2 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.4 | 17 / 35 | 4923 |
| 2 | 1 | 67.4 | 81.0 | 19 / 35 | 5161 |
| 3 | 1 | 68.4 | 84.1 | 20 / 35 | 5480 |
| 4 | 1 | 66.8 | 79.0 | 18 / 35 | 5130 |
| 5 | 1 | 70.4 | 90.5 | 24 / 35 | 5540 |
| 6 | 1 | 70.6 | 89.2 | 24 / 35 | 6119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 84% |
| oog.melee.CapuletDroid 1.1 | 28 | 89% |
| gh.nano.Grofvuil 0.2 | 17 | 71% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| arthord.NanoSatanMelee Beta | 6 | 100% |
| fm.claire 1.7 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 40% | 89 |
| gh.nano.Grofvuil 0.2 | 21 | 24% | 37 |
| oog.melee.CapuletDroid 1.1 | 10 | 11% | 45 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 8 |
| kurios.DOSexe .9b | 6 | 7% | 8 |
| fm.claire 1.7 | 5 | 6% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 11 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.8 | 104 / 210 | 2.55 | 18.5% | 34071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.5% | 104 |
| mz.MicroGodMelee 1 | 3.0 | 14.3% | 34 |
| gh.micro.Gruweltje 0.7 | 3.0 | 14.4% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.1% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 1 |
| fire219.CatBot 1.0 | 7.8 | 6.2% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 14 / 35 | 5595 |
| 2 | 1 | 69.9 | 88.6 | 20 / 35 | 5939 |
| 3 | 1 | 68.2 | 83.2 | 18 / 35 | 5300 |
| 4 | 1 | 67.9 | 78.1 | 17 / 35 | 5857 |
| 5 | 1 | 68.4 | 82.5 | 18 / 35 | 5677 |
| 6 | 1 | 67.9 | 80.6 | 17 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 57 | 67% |
| spinnercat.micro.Tyger 0.1 | 49 | 84% |
| gh.micro.Gruweltje 0.7 | 25 | 60% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 35 | 33% | 72 |
| gh.micro.Gruweltje 0.7 | 24 | 23% | 42 |
| spinnercat.micro.Tyger 0.1 | 23 | 22% | 63 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 9 |
| fire219.CatBot 1.0 | 7 | 7% | 7 |
| acogdev.alpha 0.2 | 6 | 6% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 66.7 | 90 / 210 | 4.00 | 15.6% | 29085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.5 | 15.6% | 90 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.5% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.1% | 40 |
| germ.TheMind .2 | 5.2 | 9.4% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.8% | 4 |
| awesomeness.Elite 1.0 | 6.3 | 8.9% | 10 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.5% | 3 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 67.6 | 16 / 35 | 4551 |
| 2 | 1 | 60.9 | 60.3 | 14 / 35 | 4594 |
| 3 | 3 | 59.7 | 54.6 | 11 / 35 | 4545 |
| 4 | 1 | 64.8 | 73.7 | 17 / 35 | 4799 |
| 5 | 1 | 65.1 | 70.5 | 17 / 35 | 5111 |
| 6 | 1 | 66.0 | 73.7 | 15 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 68% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| germ.TheMind .2 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| awesomeness.Elite 1.0 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 36% | 93 |
| germ.TheMind .2 | 19 | 16% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 13% | 28 |
| qualidafial.MajorDick 1.0.1 | 13 | 11% | 16 |
| lrem.micro.MoggFanatic 0.2 | 11 | 9% | 16 |
| awesomeness.Elite 1.0 | 8 | 7% | 15 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 8 |
| sample.Crazy 1.0 | 4 | 3% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.0 | 148 / 210 | 2.08 | 20.0% | 31629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.0% | 148 |
| rz.HawkOnFire 0.1 | 2.3 | 13.7% | 27 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 7 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 7 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 12 |
| ratosh.Wesco 1.4 | 6.3 | 8.7% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.5% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 7.9% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.3% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 88.9 | 26 / 35 | 5294 |
| 2 | 1 | 70.1 | 86.3 | 23 / 35 | 5253 |
| 3 | 1 | 71.2 | 90.8 | 24 / 35 | 5462 |
| 4 | 1 | 71.1 | 90.5 | 28 / 35 | 5334 |
| 5 | 1 | 68.2 | 82.2 | 22 / 35 | 4717 |
| 6 | 1 | 70.7 | 89.2 | 25 / 35 | 5569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 94% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| ratosh.Wesco 1.4 | 8 | 88% |
| spinnercat.Omen 1.0 | 6 | 100% |
| maribo.IotaCT 1.1 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 24% | 62 |
| nz.jdc.nano.GridFu 1.0 | 12 | 19% | 57 |
| timmit.nano.TimDog 0.33 | 9 | 15% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 13% | 9 |
| ratosh.Wesco 1.4 | 7 | 11% | 19 |
| maribo.IotaCT 1.1 | 5 | 8% | 18 |
| stelo.PatternRobot 1.0 | 5 | 8% | 13 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.7 | 155 / 210 | 1.83 | 21.2% | 40215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 21.2% | 155 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.9% | 22 |
| baal.nano.N 1.42 | 3.0 | 11.7% | 10 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 2 |
| zyx.micro.Ant 1.1 | 5.5 | 8.7% | 5 |
| sanja.First 0.1 | 6.0 | 8.3% | 4 |
| cvt.Firsty 1.0 | 7.0 | 7.8% | 8 |
| amk.Punbot.Punbot 0.01 | 7.2 | 7.7% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.4 | 25 / 35 | 6336 |
| 2 | 1 | 70.0 | 87.3 | 21 / 35 | 6478 |
| 3 | 1 | 72.7 | 94.6 | 30 / 35 | 7089 |
| 4 | 1 | 71.6 | 93.3 | 29 / 35 | 6488 |
| 5 | 1 | 72.3 | 92.7 | 28 / 35 | 7142 |
| 6 | 1 | 70.9 | 92.1 | 22 / 35 | 6682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 81% |
| baal.nano.N 1.42 | 44 | 89% |
| cvt.Firsty 1.0 | 29 | 90% |
| zyx.micro.Ant 1.1 | 17 | 88% |
| sanja.First 0.1 | 16 | 94% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 23 | 42% | 69 |
| baal.nano.N 1.42 | 10 | 18% | 47 |
| cvt.Firsty 1.0 | 5 | 9% | 27 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 12 |
| zyx.micro.Ant 1.1 | 4 | 7% | 31 |
| sanja.First 0.1 | 4 | 7% | 13 |
| sample.RamFire 1.0 | 3 | 5% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.0 | 86 / 210 | 3.43 | 16.4% | 32354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.2 | 16.4% | 86 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 63 |
| cs.Wren 1.0 | 3.2 | 12.8% | 18 |
| mz.Cork 0.1 | 4.3 | 11.2% | 16 |
| js.PinBall 1.6 | 4.5 | 11.2% | 14 |
| joe.ADinosaur 1.0 | 5.8 | 9.2% | 2 |
| evd.X1 0.01 | 7.3 | 7.5% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 2 |
| donjezza.Jezza 1.0 | 8.7 | 5.7% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.9 | 17 / 35 | 6108 |
| 2 | 1 | 66.5 | 75.9 | 16 / 35 | 5793 |
| 3 | 1 | 65.8 | 75.2 | 14 / 35 | 5349 |
| 4 | 1 | 64.1 | 70.8 | 14 / 35 | 5202 |
| 5 | 1 | 63.5 | 70.2 | 13 / 35 | 5321 |
| 6 | 2 | 62.4 | 69.8 | 12 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 62% |
| cs.Wren 1.0 | 25 | 84% |
| mz.Cork 0.1 | 13 | 77% |
| js.PinBall 1.6 | 6 | 83% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 44% | 97 |
| cs.Wren 1.0 | 21 | 17% | 39 |
| js.PinBall 1.6 | 13 | 10% | 19 |
| mz.Cork 0.1 | 8 | 6% | 18 |
| evd.X1 0.01 | 8 | 6% | 9 |
| joe.ADinosaur 1.0 | 8 | 6% | 9 |
| PSW.Relentless 0.1 | 8 | 6% | 9 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.6 | 109 / 210 | 3.10 | 17.2% | 27030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 17.2% | 109 |
| ntc.Opposite 1.5 | 2.5 | 12.1% | 16 |
| myl.nano.Graviton 1.10 | 3.2 | 11.7% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.7% | 18 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.9% | 8 |
| disan.Chair 2.2.0 | 6.7 | 9.1% | 15 |
| DBall.NUKE 0.1 | 7.8 | 7.9% | 7 |
| pbg.R2D2 1.0 | 9.3 | 5.5% | 2 |
| donjezza.Muncho 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 73.7 | 16 / 35 | 4284 |
| 2 | 1 | 66.1 | 75.6 | 20 / 35 | 4592 |
| 3 | 1 | 65.3 | 76.2 | 13 / 35 | 4602 |
| 4 | 1 | 67.4 | 82.5 | 20 / 35 | 4735 |
| 5 | 1 | 65.8 | 74.9 | 20 / 35 | 4556 |
| 6 | 1 | 65.6 | 76.8 | 20 / 35 | 4261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 88% |
| myl.nano.Graviton 1.10 | 32 | 88% |
| disan.Chair 2.2.0 | 16 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 73% |
| ntc.Opposite 1.5 | 14 | 71% |
| DBall.NUKE 0.1 | 8 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 20 | 20% | 47 |
| myl.nano.Graviton 1.10 | 17 | 17% | 44 |
| pfvicm.Sobieski 7.2.3b | 16 | 16% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 15% | 26 |
| disan.Chair 2.2.0 | 15 | 15% | 21 |
| ntc.Opposite 1.5 | 10 | 10% | 25 |
| pbg.R2D2 1.0 | 5 | 5% | 7 |
| donjezza.Muncho 1.0 | 2 | 2% | 7 |
| DBall.NUKE 0.1 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.8 | 74 / 210 | 3.45 | 15.7% | 26229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.2 | 15.7% | 74 |
| oog.melee.Capulet 1.2 | 2.7 | 14.4% | 54 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.6% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 25 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 69.2 | 11 / 35 | 4388 |
| 2 | 1 | 67.1 | 80.3 | 16 / 35 | 4542 |
| 3 | 1 | 65.9 | 77.1 | 15 / 35 | 4367 |
| 4 | 1 | 65.1 | 75.2 | 11 / 35 | 4327 |
| 5 | 1 | 63.4 | 67.0 | 12 / 35 | 4249 |
| 6 | 1 | 62.8 | 67.6 | 9 / 35 | 4356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 73% |
| yagami.Tidus 0.11 | 16 | 100% |
| kawigi.micro.Shiz 1.1 | 15 | 100% |
| ejb.Polaris 1.0.1 | 4 | 75% |

Hadur died in 136 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 40% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 18% | 49 |
| kawigi.micro.Shiz 1.1 | 16 | 12% | 28 |
| yagami.Tidus 0.11 | 14 | 10% | 29 |
| ejb.Polaris 1.0.1 | 11 | 8% | 15 |
| kurios.DOSexe .9a | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.2 | 125 / 210 | 2.96 | 17.3% | 27376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 17.3% | 125 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 18 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 20 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 13 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 14 |
| m3thos.Eva00 1.1 | 6.5 | 9.5% | 10 |
| bayen.UbaMicro 1.4 | 6.5 | 9.3% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.6 | 22 / 35 | 4566 |
| 2 | 1 | 66.2 | 80.0 | 19 / 35 | 4793 |
| 3 | 1 | 66.3 | 78.7 | 21 / 35 | 4491 |
| 4 | 1 | 63.6 | 71.1 | 17 / 35 | 4319 |
| 5 | 1 | 68.9 | 88.6 | 26 / 35 | 4916 |
| 6 | 1 | 64.8 | 75.2 | 20 / 35 | 4291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 88% |
| wee.Gem 1.8.4 | 31 | 100% |
| wompi.Quokka 1.6 | 21 | 90% |
| ratosh.Nobo 0.21 | 14 | 79% |
| bayen.UbaMicro 1.4 | 8 | 63% |
| m3thos.Eva00 1.1 | 7 | 86% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 20% | 70 |
| ratosh.Nobo 0.21 | 15 | 18% | 24 |
| maribo.FollowFire 1 | 12 | 14% | 12 |
| wompi.Quokka 1.6 | 9 | 11% | 18 |
| bayen.UbaMicro 1.4 | 8 | 9% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 8 |
| wee.Gem 1.8.4 | 6 | 7% | 41 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 7 |
| m3thos.Eva00 1.1 | 4 | 5% | 12 |

## Melee bench: F15

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 87.5 | 128 / 210 | 2.13 | 22.1% | 51041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 22.1% | 128 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 59 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 16 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.9% | 6 |
| ayk.WallHugger 1.0 | 5.0 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 84.8 | 20 / 35 | 8238 |
| 2 | 1 | 76.2 | 96.5 | 26 / 35 | 9472 |
| 3 | 1 | 71.7 | 84.8 | 19 / 35 | 7679 |
| 4 | 1 | 71.3 | 81.0 | 19 / 35 | 8109 |
| 5 | 1 | 73.9 | 87.6 | 23 / 35 | 8823 |
| 6 | 1 | 74.1 | 90.2 | 21 / 35 | 8720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 78% |
| mz.NanoGod 2.02 | 16 | 75% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 51% | 141 |
| mz.NanoGod 2.02 | 23 | 28% | 37 |
| ayk.WallHugger 1.0 | 8 | 10% | 15 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 11 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.0 | 106 / 210 | 3.43 | 16.7% | 29044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.7% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.1% | 19 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 24 |
| bvh.micro.Freya 0.3 | 3.7 | 11.7% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.8% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 9 |
| conscience.Electron 1.3g | 7.3 | 7.8% | 1 |
| dl.BetterWalls 1.0 | 7.8 | 7.2% | 5 |
| ap.Frederick 1.1 | 8.8 | 6.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.8 | 21 / 35 | 5018 |
| 2 | 1 | 65.1 | 75.9 | 15 / 35 | 4866 |
| 3 | 1 | 67.4 | 80.0 | 21 / 35 | 5242 |
| 4 | 1 | 63.2 | 69.8 | 17 / 35 | 4257 |
| 5 | 1 | 63.7 | 67.3 | 16 / 35 | 4896 |
| 6 | 1 | 63.8 | 68.3 | 16 / 35 | 4765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 89% |
| dummy.micro.Sparrow 2.5 | 23 | 83% |
| bvh.micro.Freya 0.3 | 22 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 100% |
| stelo.MirrorMicro 1.0 | 9 | 67% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 23% | 57 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 36 |
| conscience.Electron 1.3g | 16 | 15% | 17 |
| bvh.micro.Freya 0.3 | 12 | 12% | 30 |
| dl.BetterWalls 1.0 | 10 | 10% | 15 |
| stelo.MirrorMicro 1.0 | 9 | 9% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 9% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 7% | 26 |

## Melee bench: F17

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.6 | 142 / 210 | 2.30 | 21.1% | 42588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 21.1% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.5 | 12.9% | 18 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 11 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.4% | 19 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.4% | 6 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 8.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 1 |
| sample.Corners 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 86.7 | 24 / 35 | 7038 |
| 2 | 1 | 73.3 | 91.7 | 27 / 35 | 8014 |
| 3 | 1 | 71.0 | 81.6 | 22 / 35 | 7219 |
| 4 | 1 | 68.4 | 76.5 | 21 / 35 | 6252 |
| 5 | 1 | 72.3 | 88.6 | 24 / 35 | 7608 |
| 6 | 1 | 71.2 | 88.6 | 24 / 35 | 6457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 89% |
| supersample.SuperBoxBot 1.0 | 28 | 96% |
| dsw.StaticD 1.0 | 12 | 58% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 78% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 6 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 29 | 43% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 18% | 53 |
| dsw.StaticD 1.0 | 11 | 16% | 23 |
| sul.Lunar 1.1 | 5 | 7% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 11 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 12 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.9 | 103 / 210 | 2.90 | 18.1% | 37722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.1% | 103 |
| radnor.DoctorBob 1.42 | 2.5 | 13.2% | 35 |
| mld.Wisdom 1.0 | 3.0 | 12.4% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.8% | 24 |
| amz.NanoClone 1.41 | 5.3 | 10.4% | 15 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.1% | 7 |
| GarmBox.Oranges 1.0 | 7.5 | 7.1% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 4 |
| jangs.ns51 1.0 | 9.0 | 5.6% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.0 | 18 / 35 | 6444 |
| 2 | 1 | 67.0 | 76.8 | 14 / 35 | 6254 |
| 3 | 1 | 62.8 | 66.7 | 10 / 35 | 5373 |
| 4 | 1 | 68.2 | 82.5 | 19 / 35 | 6138 |
| 5 | 1 | 68.1 | 79.4 | 20 / 35 | 6571 |
| 6 | 1 | 70.2 | 87.0 | 22 / 35 | 6942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 92% |
| radnor.DoctorBob 1.42 | 33 | 67% |
| mld.Wisdom 1.0 | 20 | 75% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| amz.NanoClone 1.41 | 9 | 67% |
| jangs.ns51 1.0 | 8 | 88% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 29% | 55 |
| mld.Wisdom 1.0 | 27 | 25% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 19% | 55 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 21 |
| amz.NanoClone 1.41 | 9 | 8% | 16 |
| jangs.ns51 1.0 | 6 | 6% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 1 | 1% | 4 |

