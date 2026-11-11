# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.1 | 123 / 210 | 2.16 | 20.9% | 43214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.9% | 123 |
| radnor.DoctorBob 1.42 | 2.3 | 14.9% | 42 |
| mz.AntiGrav 1.0 | 3.0 | 14.1% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.4% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 6 |
| GarmBox.Oranges 1.0 | 6.8 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.6% | 1 |
| sample.Walls 1.0 | 7.2 | 6.5% | 3 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 83.2 | 19 / 35 | 6772 |
| 2 | 1 | 72.4 | 88.6 | 20 / 35 | 7576 |
| 3 | 1 | 70.3 | 83.5 | 19 / 35 | 6629 |
| 4 | 1 | 71.6 | 85.7 | 20 / 35 | 7389 |
| 5 | 1 | 72.0 | 91.1 | 20 / 35 | 7007 |
| 6 | 1 | 73.3 | 90.5 | 25 / 35 | 7841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 91% |
| radnor.DoctorBob 1.42 | 43 | 63% |
| mld.Infinity 2.2 | 26 | 88% |
| jangs.ns51 1.0 | 10 | 90% |
| sample.Walls 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 3 | 33% |

Hadur died in 88 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 49% | 77 |
| mz.AntiGrav 1.0 | 18 | 20% | 69 |
| mld.Infinity 2.2 | 12 | 14% | 34 |
| amz.NanoClone 1.41 | 10 | 11% | 13 |
| jangs.ns51 1.0 | 2 | 2% | 10 |
| sample.Walls 1.0 | 2 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.4 | 117 / 210 | 2.77 | 17.9% | 31714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 17.9% | 117 |
| mld.DustBunny 3.8 | 2.3 | 14.2% | 25 |
| oog.melee.Mercutio 1.0 | 2.7 | 14.0% | 43 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 6 |
| zyx.nano.Ant 1.1 | 5.3 | 9.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.4% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.8% | 8 |
| fullsail.SweetTea 1.1 | 7.7 | 7.2% | 3 |
| bzdp.BoxCar 2.0 | 8.5 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.8 | 19 / 35 | 5233 |
| 2 | 1 | 65.1 | 75.9 | 15 / 35 | 4847 |
| 3 | 1 | 67.1 | 80.3 | 20 / 35 | 5133 |
| 4 | 1 | 70.0 | 90.2 | 27 / 35 | 5424 |
| 5 | 1 | 68.8 | 87.3 | 21 / 35 | 5386 |
| 6 | 1 | 64.5 | 64.8 | 15 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 65 | 91% |
| oog.melee.Mercutio 1.0 | 39 | 77% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 31 | 33% | 87 |
| oog.melee.Mercutio 1.0 | 26 | 28% | 63 |
| zyx.nano.Ant 1.1 | 15 | 16% | 18 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 10 |
| maribo.melee.BMV 0.1 | 4 | 4% | 7 |
| fullsail.SweetTea 1.1 | 4 | 4% | 7 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 84.3 | 133 / 210 | 2.41 | 20.3% | 38414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 20.3% | 133 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.2% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.3% | 15 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.5 | 5.9% | 1 |
| sample.Fire 1.0 | 8.8 | 5.3% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 84.8 | 22 / 35 | 6024 |
| 2 | 1 | 69.6 | 80.6 | 22 / 35 | 6351 |
| 3 | 1 | 69.7 | 81.9 | 21 / 35 | 6554 |
| 4 | 1 | 70.9 | 87.0 | 24 / 35 | 6005 |
| 5 | 1 | 70.9 | 85.1 | 23 / 35 | 6720 |
| 6 | 1 | 71.3 | 86.7 | 21 / 35 | 6760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 84% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| myl.nano.KomoriNinja 1.1 | 19 | 84% |
| fm.mammillarias 1.3 | 8 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 22% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 35 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 19 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 35 |
| fm.mammillarias 1.3 | 9 | 12% | 11 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 19 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.3 | 140 / 210 | 2.06 | 21.0% | 41353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 21.0% | 140 |
| tvv.micro.Antares 1.1.1 | 2.3 | 13.0% | 24 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.7% | 20 |
| tj.zombie1n 1.0.1 | 4.7 | 9.2% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.0% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 5 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.2 | 22 / 35 | 6956 |
| 2 | 1 | 69.3 | 81.0 | 19 / 35 | 6870 |
| 3 | 1 | 70.6 | 88.9 | 23 / 35 | 6599 |
| 4 | 1 | 70.5 | 87.0 | 22 / 35 | 6805 |
| 5 | 1 | 71.9 | 90.5 | 26 / 35 | 7202 |
| 6 | 1 | 72.4 | 93.0 | 28 / 35 | 6921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 85% |
| tvv.micro.Antares 1.1.1 | 44 | 70% |
| stelo.SoJNanoMelee 1.1 | 21 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 34% | 78 |
| tvv.micro.Antares 1.1.1 | 18 | 26% | 54 |
| stelo.SoJNanoMelee 1.1 | 9 | 13% | 25 |
| tj.zombie1n 1.0.1 | 6 | 9% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 5 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| sample.VelociRobot 1.0 | 2 | 3% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 62.8 | 73 / 210 | 4.35 | 14.9% | 29258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.2 | 14.9% | 73 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 39 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.4% | 19 |
| EBBU.Sim2 1.02 | 5.5 | 10.0% | 10 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.6% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 63.5 | 10 / 35 | 4819 |
| 2 | 1 | 60.6 | 57.5 | 9 / 35 | 4910 |
| 3 | 1 | 63.2 | 66.0 | 14 / 35 | 5238 |
| 4 | 1 | 61.2 | 61.3 | 11 / 35 | 4888 |
| 5 | 2 | 58.8 | 56.2 | 12 / 35 | 4317 |
| 6 | 1 | 65.1 | 72.1 | 17 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 89% |
| oog.melee.Corsair 1.0 | 27 | 59% |
| ahf.NanoAndrew .4 | 17 | 71% |
| sam.Samspin 1.0 | 8 | 63% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 360. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 23% | 57 |
| oog.melee.Corsair 1.0 | 21 | 15% | 39 |
| ahf.NanoAndrew .4 | 21 | 15% | 32 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 11% | 16 |
| robar.nano.Assertive_Melee 0.2 | 14 | 10% | 20 |
| EBBU.Sim2 1.02 | 14 | 10% | 18 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 14 |
| sam.Samspin 1.0 | 6 | 4% | 8 |
| sample.TrackFire 1.0 | 2 | 1% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.8 | 123 / 210 | 2.37 | 18.8% | 32150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.8% | 123 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.7% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.1% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 1 |
| fm.claire 1.7 | 6.7 | 8.0% | 2 |
| pa.Improved 1.0 | 8.5 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.0 | 5.7% | 2 |
| sample.SpinBot 1.0 | 9.3 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 19 / 35 | 5720 |
| 2 | 1 | 68.7 | 82.5 | 22 / 35 | 5366 |
| 3 | 1 | 68.4 | 85.4 | 20 / 35 | 5301 |
| 4 | 1 | 67.3 | 85.1 | 17 / 35 | 4930 |
| 5 | 1 | 68.2 | 83.8 | 23 / 35 | 5350 |
| 6 | 1 | 69.7 | 88.6 | 22 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 83% |
| oog.melee.CapuletDroid 1.1 | 28 | 86% |
| gh.nano.Grofvuil 0.2 | 23 | 74% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 0% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 32% | 87 |
| gh.nano.Grofvuil 0.2 | 18 | 21% | 34 |
| oog.melee.CapuletDroid 1.1 | 15 | 17% | 34 |
| winamp32.micro.MicroMacro 1.0 | 9 | 10% | 17 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 15 |
| fm.claire 1.7 | 4 | 5% | 8 |
| kurios.DOSexe .9b | 3 | 3% | 7 |
| sample.SpinBot 1.0 | 3 | 3% | 6 |
| pa.Improved 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.0 | 104 / 210 | 2.62 | 18.7% | 36451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.7% | 104 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 29 |
| mz.MicroGodMelee 1 | 3.3 | 13.6% | 45 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.5% | 22 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.1% | 3 |
| el.JumpShoot 0.2 | 7.3 | 6.8% | 2 |
| acogdev.alpha 0.2 | 8.3 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.6 | 16 / 35 | 6082 |
| 2 | 1 | 68.4 | 79.0 | 17 / 35 | 6174 |
| 3 | 1 | 68.5 | 81.0 | 15 / 35 | 6230 |
| 4 | 1 | 66.9 | 80.0 | 16 / 35 | 5559 |
| 5 | 1 | 70.0 | 87.0 | 21 / 35 | 6142 |
| 6 | 1 | 68.9 | 83.2 | 19 / 35 | 6264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 88% |
| mz.MicroGodMelee 1 | 49 | 65% |
| gh.micro.Gruweltje 0.7 | 26 | 73% |
| DBall.Anarchy 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 37 | 35% | 67 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 20 | 19% | 58 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 68.4 | 92 / 210 | 3.85 | 16.0% | 30746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.2 | 16.0% | 92 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 30 |
| germ.TheMind .2 | 5.3 | 9.4% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.8% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 4 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.1% | 8 |
| sample.Crazy 1.0 | 8.2 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 78.4 | 17 / 35 | 5960 |
| 2 | 1 | 64.4 | 70.2 | 17 / 35 | 5258 |
| 3 | 1 | 62.2 | 63.2 | 13 / 35 | 4865 |
| 4 | 1 | 64.1 | 67.3 | 17 / 35 | 5221 |
| 5 | 2 | 61.7 | 62.2 | 12 / 35 | 4701 |
| 6 | 1 | 63.5 | 68.9 | 16 / 35 | 4741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 92% |
| stelo.UntouchableNano 1.3 | 10 | 90% |
| germ.TheMind .2 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| awesomeness.Elite 1.0 | 3 | 67% |

Hadur died in 118 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 44% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 16% | 36 |
| germ.TheMind .2 | 13 | 11% | 24 |
| awesomeness.Elite 1.0 | 9 | 8% | 12 |
| stelo.UntouchableNano 1.3 | 8 | 7% | 15 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 9 |
| sample.Crazy 1.0 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.7 | 144 / 210 | 2.11 | 19.9% | 31965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 19.9% | 144 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 9 |
| maribo.IotaCT 1.1 | 4.5 | 10.7% | 11 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.1% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.8% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 0 |
| stelo.PatternRobot 1.0 | 7.8 | 7.8% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 7.5% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 23 / 35 | 5596 |
| 2 | 1 | 71.3 | 88.6 | 26 / 35 | 5886 |
| 3 | 1 | 71.8 | 92.1 | 27 / 35 | 5374 |
| 4 | 1 | 70.6 | 91.1 | 26 / 35 | 5017 |
| 5 | 1 | 67.6 | 79.4 | 21 / 35 | 4757 |
| 6 | 1 | 69.0 | 83.8 | 21 / 35 | 5335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 93% |
| nz.jdc.nano.GridFu 1.0 | 37 | 89% |
| timmit.nano.TimDog 0.33 | 13 | 77% |
| maribo.IotaCT 1.1 | 11 | 91% |
| stelo.PatternRobot 1.0 | 11 | 82% |
| ratosh.Wesco 1.4 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 24% | 67 |
| nz.jdc.nano.GridFu 1.0 | 13 | 20% | 52 |
| timmit.nano.TimDog 0.33 | 10 | 15% | 22 |
| ratosh.Wesco 1.4 | 8 | 12% | 21 |
| stelo.PatternRobot 1.0 | 7 | 11% | 18 |
| maribo.IotaCT 1.1 | 5 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 11 |
| spinnercat.Omen 1.0 | 2 | 3% | 3 |

## Melee bench: F10

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.2 | 169 / 210 | 1.61 | 22.0% | 41497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 22.0% | 169 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 6 |
| Grystrion.TrackerWO 1.0 | 4.7 | 10.4% | 3 |
| sanja.First 0.1 | 5.3 | 8.7% | 5 |
| zyx.micro.Ant 1.1 | 6.0 | 8.8% | 9 |
| cvt.Firsty 1.0 | 7.3 | 7.0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.5% | 0 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.9% | 2 |
| sample.RamFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.0 | 27 / 35 | 7410 |
| 2 | 1 | 71.4 | 88.6 | 26 / 35 | 6778 |
| 3 | 1 | 72.6 | 91.7 | 30 / 35 | 7041 |
| 4 | 1 | 73.0 | 97.5 | 31 / 35 | 7053 |
| 5 | 1 | 72.2 | 93.7 | 30 / 35 | 6624 |
| 6 | 1 | 71.5 | 94.0 | 25 / 35 | 6591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 65 | 88% |
| baal.nano.N 1.42 | 34 | 100% |
| sanja.First 0.1 | 24 | 92% |
| cvt.Firsty 1.0 | 24 | 92% |
| zyx.micro.Ant 1.1 | 17 | 71% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 33% | 38 |
| tvv.nano.Polaris 1.2 | 12 | 29% | 84 |
| baal.nano.N 1.42 | 4 | 10% | 29 |
| cvt.Firsty 1.0 | 3 | 7% | 19 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 9 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 6 |
| sanja.First 0.1 | 2 | 5% | 15 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 66.0 | 69 / 210 | 4.06 | 14.8% | 29509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.5 | 14.8% | 69 |
| kc.micro.Figment 1.0 | 1.7 | 14.4% | 64 |
| cs.Wren 1.0 | 3.3 | 12.7% | 33 |
| js.PinBall 1.6 | 3.5 | 12.2% | 14 |
| mz.Cork 0.1 | 5.3 | 10.9% | 9 |
| joe.ADinosaur 1.0 | 5.7 | 10.0% | 11 |
| evd.X1 0.01 | 7.2 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 7.8 | 7.0% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.8 | 17 / 35 | 5748 |
| 2 | 2 | 63.0 | 68.9 | 11 / 35 | 4717 |
| 3 | 1 | 58.7 | 58.1 | 6 / 35 | 4816 |
| 4 | 2 | 60.4 | 63.2 | 9 / 35 | 4747 |
| 5 | 2 | 61.5 | 63.8 | 13 / 35 | 4719 |
| 6 | 1 | 62.1 | 65.4 | 13 / 35 | 4762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 52% |
| cs.Wren 1.0 | 20 | 75% |
| mz.Cork 0.1 | 10 | 80% |
| js.PinBall 1.6 | 10 | 70% |
| jsal.Jsalbot 1.0 | 7 | 86% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 63 | 45% | 92 |
| cs.Wren 1.0 | 20 | 14% | 34 |
| js.PinBall 1.6 | 19 | 13% | 30 |
| joe.ADinosaur 1.0 | 12 | 9% | 12 |
| evd.X1 0.01 | 8 | 6% | 10 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| mz.Cork 0.1 | 7 | 5% | 14 |
| jsal.Jsalbot 1.0 | 2 | 1% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.7 | 113 / 210 | 2.82 | 18.1% | 30238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.1% | 113 |
| myl.nano.Graviton 1.10 | 2.8 | 11.9% | 23 |
| ntc.Opposite 1.5 | 2.8 | 11.5% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.8% | 26 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.6% | 8 |
| DBall.NUKE 0.1 | 7.0 | 8.2% | 7 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.5% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.0 | 27 / 35 | 5555 |
| 2 | 1 | 65.3 | 75.9 | 16 / 35 | 4591 |
| 3 | 1 | 66.8 | 80.6 | 19 / 35 | 4955 |
| 4 | 1 | 66.6 | 81.0 | 17 / 35 | 4878 |
| 5 | 1 | 65.7 | 75.6 | 16 / 35 | 5080 |
| 6 | 1 | 66.1 | 72.4 | 18 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 93% |
| ntc.Opposite 1.5 | 22 | 77% |
| stelo.AreaTargetingBot 1.1 | 19 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| donjezza.Muncho 1.0 | 10 | 100% |
| DBall.NUKE 0.1 | 10 | 100% |
| disan.Chair 2.2.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 98 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 18 | 18% | 35 |
| stelo.AreaTargetingBot 1.1 | 16 | 16% | 28 |
| pfvicm.Sobieski 7.2.3b | 16 | 16% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 15% | 22 |
| myl.nano.Graviton 1.10 | 13 | 13% | 49 |
| disan.Chair 2.2.0 | 10 | 10% | 21 |
| DBall.NUKE 0.1 | 5 | 5% | 13 |
| pbg.R2D2 1.0 | 3 | 3% | 8 |
| donjezza.Muncho 1.0 | 2 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.5 | 93 / 210 | 3.11 | 16.5% | 26168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.5% | 93 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 34 |
| oog.melee.Capulet 1.2 | 3.2 | 13.6% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.9% | 24 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.1% | 5 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 1 |
| step.nanoPri 1.0 | 7.5 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 73.3 | 12 / 35 | 4149 |
| 2 | 1 | 67.5 | 81.3 | 19 / 35 | 4550 |
| 3 | 1 | 66.1 | 78.4 | 14 / 35 | 4526 |
| 4 | 1 | 63.7 | 69.8 | 12 / 35 | 3929 |
| 5 | 1 | 67.7 | 82.5 | 19 / 35 | 4517 |
| 6 | 1 | 66.0 | 73.7 | 17 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 79% |
| oog.melee.Capulet 1.2 | 29 | 69% |
| kawigi.micro.Shiz 1.1 | 29 | 90% |
| yagami.Tidus 0.11 | 23 | 87% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 47% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 15% | 42 |
| kawigi.micro.Shiz 1.1 | 13 | 11% | 32 |
| yagami.Tidus 0.11 | 11 | 9% | 29 |
| ejb.Polaris 1.0.1 | 10 | 9% | 17 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.9 | 114 / 210 | 3.08 | 16.9% | 26777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 16.9% | 114 |
| bzdp.Pansy 2.1 | 2.3 | 13.2% | 32 |
| wompi.Quokka 1.6 | 3.3 | 11.7% | 18 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 14 |
| wee.Gem 1.8.4 | 4.2 | 11.1% | 20 |
| m3thos.Eva00 1.1 | 6.3 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 4 |
| stelo.MyAgileRobot 0.2 | 8.5 | 6.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.1% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.8 | 19 / 35 | 4645 |
| 2 | 1 | 64.1 | 72.7 | 18 / 35 | 4429 |
| 3 | 1 | 66.5 | 81.3 | 23 / 35 | 4237 |
| 4 | 1 | 65.3 | 79.4 | 17 / 35 | 4223 |
| 5 | 1 | 64.9 | 74.3 | 20 / 35 | 4320 |
| 6 | 1 | 65.8 | 75.9 | 17 / 35 | 4923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 82% |
| wee.Gem 1.8.4 | 28 | 96% |
| wompi.Quokka 1.6 | 15 | 87% |
| ratosh.Nobo 0.21 | 15 | 80% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 20% | 58 |
| wee.Gem 1.8.4 | 13 | 14% | 45 |
| ratosh.Nobo 0.21 | 13 | 14% | 25 |
| wompi.Quokka 1.6 | 12 | 13% | 22 |
| maribo.FollowFire 1 | 12 | 13% | 14 |
| bayen.UbaMicro 1.4 | 9 | 9% | 14 |
| stelo.MyAgileRobot 0.2 | 8 | 8% | 11 |
| m3thos.Eva00 1.1 | 6 | 6% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 87.7 | 129 / 210 | 2.10 | 21.7% | 48974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 21.7% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 19 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 4 |
| ayk.WallHugger 1.0 | 4.7 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 88.6 | 23 / 35 | 7865 |
| 2 | 1 | 73.3 | 85.7 | 22 / 35 | 8089 |
| 3 | 1 | 72.4 | 84.8 | 20 / 35 | 8224 |
| 4 | 1 | 73.4 | 91.7 | 22 / 35 | 7890 |
| 5 | 1 | 74.1 | 89.5 | 24 / 35 | 8627 |
| 6 | 1 | 72.4 | 86.0 | 18 / 35 | 8279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 81% |
| mz.NanoGod 2.02 | 12 | 58% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 51% | 150 |
| mz.NanoGod 2.02 | 28 | 35% | 36 |
| ayk.WallHugger 1.0 | 5 | 6% | 8 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.0 | 85 / 210 | 3.79 | 15.7% | 28184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 15.7% | 85 |
| dummy.micro.Sparrow 2.5 | 2.5 | 13.0% | 31 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 24 |
| bvh.micro.Freya 0.3 | 4.3 | 11.3% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.5% | 24 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.4% | 6 |
| conscience.Electron 1.3g | 7.0 | 7.8% | 4 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 68.9 | 12 / 35 | 5033 |
| 2 | 1 | 63.0 | 70.2 | 13 / 35 | 4679 |
| 3 | 1 | 64.3 | 69.8 | 16 / 35 | 4948 |
| 4 | 1 | 59.6 | 58.7 | 13 / 35 | 4121 |
| 5 | 1 | 65.3 | 76.5 | 17 / 35 | 4566 |
| 6 | 1 | 63.9 | 70.2 | 14 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 83% |
| dummy.micro.Sparrow 2.5 | 35 | 69% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 82% |
| stelo.MirrorMicro 1.0 | 7 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 20% | 56 |
| dummy.micro.Sparrow 2.5 | 23 | 18% | 45 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 15% | 20 |
| bvh.micro.Freya 0.3 | 17 | 14% | 26 |
| conscience.Electron 1.3g | 13 | 10% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 10% | 28 |
| dl.BetterWalls 1.0 | 10 | 8% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 13 |

## Melee bench: F17

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 84.1 | 140 / 210 | 2.43 | 21.1% | 43826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 21.1% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 22 |
| sul.Lunar 1.1 | 3.2 | 12.0% | 23 |
| supersample.SuperBoxBot 1.0 | 4.7 | 10.0% | 6 |
| dsw.StaticD 1.0 | 5.2 | 9.5% | 6 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 5 |
| tlp.ThreeLeggedPig 1 | 6.5 | 7.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.8% | 5 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 87.3 | 26 / 35 | 7961 |
| 2 | 1 | 72.0 | 87.3 | 22 / 35 | 7387 |
| 3 | 1 | 71.1 | 81.9 | 22 / 35 | 7079 |
| 4 | 1 | 70.4 | 81.6 | 21 / 35 | 7383 |
| 5 | 1 | 70.7 | 81.9 | 26 / 35 | 6907 |
| 6 | 1 | 70.7 | 84.8 | 23 / 35 | 7109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 56 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 93% |
| supersample.SuperBoxBot 1.0 | 26 | 85% |
| sample.MyFirstRobot 1.0 | 10 | 70% |
| dsw.StaticD 1.0 | 10 | 60% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 31% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 20% | 54 |
| dsw.StaticD 1.0 | 13 | 18% | 23 |
| mme.NikeEnhanced 2.0 | 9 | 13% | 13 |
| sul.Lunar 1.1 | 6 | 8% | 60 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| sample.Corners 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.3 | 99 / 210 | 2.87 | 18.2% | 37735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGN 0.1 | 1.0 | 18.2% | 99 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 36 |
| mld.Wisdom 1.0 | 3.3 | 12.2% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.2% | 28 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 12 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.8% | 6 |
| GarmBox.Oranges 1.0 | 7.3 | 7.3% | 0 |
| sample.Walls 1.0 | 7.7 | 7.0% | 3 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.2 | 20 / 35 | 7090 |
| 2 | 1 | 64.2 | 69.8 | 12 / 35 | 5519 |
| 3 | 1 | 64.4 | 69.8 | 12 / 35 | 5933 |
| 4 | 1 | 69.4 | 86.7 | 19 / 35 | 6584 |
| 5 | 1 | 69.6 | 82.9 | 20 / 35 | 6857 |
| 6 | 1 | 66.4 | 76.2 | 16 / 35 | 5752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 66% |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 88% |
| mld.Wisdom 1.0 | 15 | 80% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| amz.NanoClone 1.41 | 10 | 80% |
| sample.Walls 1.0 | 5 | 80% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 29% | 46 |
| radnor.DoctorBob 1.42 | 28 | 25% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 19% | 49 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 27 |
| amz.NanoClone 1.41 | 7 | 6% | 12 |
| jangs.ns51 1.0 | 5 | 4% | 8 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

