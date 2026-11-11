# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 78.6 | 84 / 210 | 2.93 | 17.7% | 33840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.7% | 84 |
| radnor.DoctorBob 1.42 | 2.3 | 15.7% | 42 |
| mz.AntiGrav 1.0 | 3.2 | 14.7% | 28 |
| mld.Infinity 2.2 | 3.3 | 14.8% | 46 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 7 |
| sample.Walls 1.0 | 6.5 | 6.7% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.3 | 15 / 35 | 5787 |
| 2 | 1 | 67.1 | 76.8 | 16 / 35 | 5350 |
| 3 | 1 | 70.2 | 85.1 | 16 / 35 | 6353 |
| 4 | 1 | 67.6 | 78.7 | 16 / 35 | 5507 |
| 5 | 2 | 65.7 | 71.1 | 12 / 35 | 5101 |
| 6 | 1 | 67.4 | 78.4 | 9 / 35 | 5742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 44 | 59% |
| mz.AntiGrav 1.0 | 38 | 95% |
| radnor.DoctorBob 1.42 | 34 | 47% |
| amz.NanoClone 1.41 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 70 | 56% | 94 |
| mld.Infinity 2.2 | 26 | 21% | 20 |
| mz.AntiGrav 1.0 | 17 | 13% | 73 |
| amz.NanoClone 1.41 | 6 | 5% | 11 |
| sample.Walls 1.0 | 6 | 5% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.3 | 120 / 210 | 2.41 | 17.3% | 24013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.3% | 120 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.8% | 49 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 19 |
| maribo.melee.BMV 0.1 | 4.2 | 10.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 4.8 | 9.3% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.4% | 9 |
| zyx.nano.Ant 1.1 | 7.2 | 7.9% | 0 |
| bzdp.BoxCar 2.0 | 8.0 | 6.9% | 2 |
| fullsail.SweetTea 1.1 | 8.7 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.3 | 23 / 35 | 4234 |
| 2 | 1 | 65.3 | 82.9 | 20 / 35 | 3451 |
| 3 | 1 | 66.1 | 85.1 | 22 / 35 | 3902 |
| 4 | 1 | 66.0 | 84.4 | 15 / 35 | 4327 |
| 5 | 1 | 66.0 | 83.5 | 21 / 35 | 3950 |
| 6 | 1 | 66.6 | 81.6 | 19 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 75% |
| mld.DustBunny 3.8 | 52 | 85% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 82% |
| djdjdj.NanoSkunk10 1.0 | 10 | 80% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| bzdp.BoxCar 2.0 | 1 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 39% | 88 |
| mld.DustBunny 3.8 | 17 | 19% | 58 |
| zyx.nano.Ant 1.1 | 9 | 10% | 10 |
| djdjdj.NanoSkunk10 1.0 | 7 | 8% | 15 |
| fullsail.SweetTea 1.1 | 7 | 8% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 14 |
| maribo.melee.BMV 0.1 | 5 | 6% | 9 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.1 | 94 / 210 | 3.42 | 16.5% | 27552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.5% | 94 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 55 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.5% | 13 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.8% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 11.0% | 20 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 7 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.1% | 2 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 2 |
| sample.Fire 1.0 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.1 | 15 / 35 | 4649 |
| 2 | 1 | 66.3 | 74.9 | 19 / 35 | 4948 |
| 3 | 1 | 64.8 | 72.7 | 16 / 35 | 4356 |
| 4 | 2 | 65.0 | 73.3 | 16 / 35 | 4391 |
| 5 | 1 | 66.0 | 75.9 | 14 / 35 | 5122 |
| 6 | 1 | 63.8 | 69.8 | 14 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 31 | 74% |
| cb.nano.Insomnia 1.0 | 29 | 79% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 79% |
| myl.nano.KomoriNinja 1.1 | 18 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| sample.Fire 1.0 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 116 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 21% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 18% | 38 |
| fm.mammillarias 1.3 | 19 | 16% | 19 |
| myl.nano.KomoriNinja 1.1 | 18 | 16% | 44 |
| cb.nano.Insomnia 1.0 | 18 | 16% | 16 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 13 |
| sample.Fire 1.0 | 6 | 5% | 8 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 7 |

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.5 | 102 / 210 | 3.03 | 17.2% | 29983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.2% | 102 |
| tvv.micro.Antares 1.1.1 | 2.5 | 13.2% | 29 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.3% | 20 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.4% | 31 |
| tj.zombie1n 1.0.1 | 5.2 | 9.9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.1% | 2 |
| yk.JahMicro 1.0 | 6.5 | 8.8% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.6 | 17 / 35 | 4988 |
| 2 | 1 | 65.9 | 76.2 | 17 / 35 | 5241 |
| 3 | 1 | 67.1 | 81.0 | 18 / 35 | 5195 |
| 4 | 1 | 65.9 | 80.3 | 18 / 35 | 4761 |
| 5 | 1 | 66.9 | 82.2 | 17 / 35 | 4962 |
| 6 | 1 | 63.5 | 70.5 | 15 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 83% |
| stelo.SoJNanoMelee 1.1 | 32 | 72% |
| tvv.micro.Antares 1.1.1 | 23 | 65% |
| yk.JahMicro 1.0 | 11 | 82% |
| tj.zombie1n 1.0.1 | 11 | 64% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 31% | 74 |
| stelo.SoJNanoMelee 1.1 | 25 | 23% | 48 |
| tvv.micro.Antares 1.1.1 | 23 | 21% | 40 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 7% | 9 |
| yk.JahMicro 1.0 | 7 | 6% | 12 |
| tj.zombie1n 1.0.1 | 6 | 6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 9 |
| repositorio.NanoStep 1.0 | 2 | 2% | 10 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 65.1 | 83 / 210 | 4.14 | 14.8% | 25500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 14.8% | 83 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 30 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.6% | 22 |
| sam.Samspin 1.0 | 5.8 | 10.2% | 16 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.5% | 11 |
| EBBU.Sim2 1.02 | 6.3 | 9.6% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 58.4 | 11 / 35 | 4134 |
| 2 | 1 | 61.8 | 63.5 | 13 / 35 | 4562 |
| 3 | 1 | 62.7 | 68.9 | 13 / 35 | 4478 |
| 4 | 1 | 60.2 | 62.9 | 11 / 35 | 4097 |
| 5 | 1 | 64.0 | 73.3 | 17 / 35 | 4193 |
| 6 | 1 | 61.6 | 63.5 | 18 / 35 | 4036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 85% |
| oog.melee.Corsair 1.0 | 26 | 85% |
| ahf.NanoAndrew .4 | 25 | 68% |
| sam.Samspin 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 7 | 71% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 25% | 53 |
| robar.nano.Assertive_Melee 0.2 | 21 | 16% | 25 |
| ahf.NanoAndrew .4 | 20 | 16% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 14 |
| sam.Samspin 1.0 | 12 | 9% | 20 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 12 |
| oog.melee.Corsair 1.0 | 9 | 7% | 28 |
| EBBU.Sim2 1.02 | 7 | 5% | 15 |
| sample.TrackFire 1.0 | 3 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.3 | 108 / 210 | 2.95 | 16.5% | 24769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.5% | 108 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.6% | 21 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 11.0% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.3% | 14 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.2% | 6 |
| fm.claire 1.7 | 6.5 | 8.4% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.4% | 5 |
| pa.Improved 1.0 | 9.3 | 5.6% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 77.1 | 19 / 35 | 3929 |
| 2 | 1 | 63.4 | 77.5 | 16 / 35 | 3476 |
| 3 | 1 | 63.8 | 74.6 | 14 / 35 | 4298 |
| 4 | 1 | 67.0 | 85.1 | 22 / 35 | 4437 |
| 5 | 1 | 65.7 | 78.7 | 20 / 35 | 4290 |
| 6 | 1 | 65.0 | 76.8 | 17 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 51 | 84% |
| oog.melee.CapuletDroid 1.1 | 31 | 77% |
| gh.nano.Grofvuil 0.2 | 19 | 84% |
| winamp32.micro.MicroMacro 1.0 | 11 | 64% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| sample.SpinBot 1.0 | 5 | 80% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 21% | 71 |
| gh.nano.Grofvuil 0.2 | 21 | 20% | 46 |
| oog.melee.CapuletDroid 1.1 | 21 | 20% | 21 |
| winamp32.micro.MicroMacro 1.0 | 11 | 11% | 22 |
| arthord.NanoSatanMelee Beta | 8 | 8% | 17 |
| fm.claire 1.7 | 7 | 7% | 10 |
| sample.SpinBot 1.0 | 6 | 6% | 11 |
| kurios.DOSexe .9b | 3 | 3% | 6 |
| pa.Improved 1.0 | 3 | 3% | 6 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.4 | 74 / 210 | 3.30 | 15.7% | 26059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.7 | 16.4% | 62 |
| hadur117.micro.SaorOG1 0.1 | 2.2 | 15.7% | 74 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.3% | 36 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 21 |
| DBall.Anarchy 0.1 | 5.0 | 9.4% | 9 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 3 |
| mbro.Detektor3 0.1.1 | 8.0 | 5.8% | 3 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 1 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 77.1 | 14 / 35 | 4404 |
| 2 | 4 | 60.2 | 63.2 | 9 / 35 | 3949 |
| 3 | 2 | 64.6 | 76.8 | 12 / 35 | 4282 |
| 4 | 1 | 66.5 | 85.7 | 14 / 35 | 4182 |
| 5 | 2 | 62.6 | 69.2 | 10 / 35 | 4503 |
| 6 | 2 | 65.4 | 74.6 | 15 / 35 | 4739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 64% |
| gh.micro.Gruweltje 0.7 | 37 | 41% |
| mz.MicroGodMelee 1 | 31 | 87% |
| DBall.Anarchy 0.1 | 7 | 71% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 136 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 39 | 29% | 55 |
| spinnercat.micro.Tyger 0.1 | 38 | 28% | 61 |
| mz.MicroGodMelee 1 | 24 | 18% | 52 |
| fire219.CatBot 1.0 | 9 | 7% | 9 |
| acogdev.alpha 0.2 | 7 | 5% | 8 |
| DBall.Anarchy 0.1 | 6 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 4% | 6 |
| el.JumpShoot 0.2 | 5 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 68.3 | 68 / 210 | 3.85 | 14.8% | 26606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.5% | 73 |
| hadur117.micro.SaorOG1 0.1 | 2.2 | 14.8% | 68 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.3% | 10 |
| germ.TheMind .2 | 5.0 | 10.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 1 |
| awesomeness.Elite 1.0 | 6.8 | 8.3% | 9 |
| stelo.UntouchableNano 1.3 | 7.8 | 6.9% | 3 |
| sample.Crazy 1.0 | 8.0 | 7.2% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 69.8 | 13 / 35 | 4134 |
| 2 | 2 | 62.1 | 68.9 | 9 / 35 | 4438 |
| 3 | 3 | 60.4 | 61.9 | 7 / 35 | 4501 |
| 4 | 2 | 65.5 | 76.2 | 14 / 35 | 5113 |
| 5 | 2 | 60.4 | 60.3 | 10 / 35 | 4317 |
| 6 | 2 | 63.5 | 72.7 | 15 / 35 | 4103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 53% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 67% |
| germ.TheMind .2 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| awesomeness.Elite 1.0 | 4 | 25% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 53% | 112 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 13% | 29 |
| germ.TheMind .2 | 15 | 11% | 19 |
| qualidafial.MajorDick 1.0.1 | 12 | 8% | 15 |
| awesomeness.Elite 1.0 | 8 | 6% | 12 |
| mym.EdgeStalker 1.0 | 6 | 4% | 7 |
| stelo.UntouchableNano 1.3 | 3 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.2 | 111 / 210 | 2.51 | 17.0% | 20339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.0% | 111 |
| rz.HawkOnFire 0.1 | 2.3 | 13.8% | 30 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.6% | 22 |
| maribo.IotaCT 1.1 | 4.2 | 11.2% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 3 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.8% | 8 |
| ratosh.Wesco 1.4 | 7.7 | 8.1% | 4 |
| spinnercat.Omen 1.0 | 7.7 | 8.3% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.8% | 11 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.9 | 22 / 35 | 3439 |
| 2 | 1 | 67.5 | 87.3 | 19 / 35 | 3427 |
| 3 | 1 | 64.2 | 76.5 | 14 / 35 | 3578 |
| 4 | 1 | 63.4 | 74.3 | 13 / 35 | 3302 |
| 5 | 1 | 67.4 | 87.6 | 22 / 35 | 3179 |
| 6 | 1 | 67.1 | 85.7 | 21 / 35 | 3414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 51 | 78% |
| rz.HawkOnFire 0.1 | 41 | 88% |
| timmit.nano.TimDog 0.33 | 16 | 88% |
| stelo.PatternRobot 1.0 | 9 | 44% |
| maribo.IotaCT 1.1 | 7 | 43% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 29 | 29% | 66 |
| rz.HawkOnFire 0.1 | 21 | 21% | 53 |
| stelo.PatternRobot 1.0 | 14 | 14% | 18 |
| maribo.IotaCT 1.1 | 13 | 13% | 18 |
| timmit.nano.TimDog 0.33 | 9 | 9% | 23 |
| ratosh.Wesco 1.4 | 8 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 4% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 8 |

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.7 | 118 / 210 | 2.29 | 18.6% | 30569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.6% | 118 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.6% | 43 |
| baal.nano.N 1.42 | 3.2 | 11.8% | 7 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.3% | 4 |
| zyx.micro.Ant 1.1 | 5.0 | 9.6% | 13 |
| sanja.First 0.1 | 6.8 | 8.4% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.4% | 5 |
| cvt.Firsty 1.0 | 7.2 | 7.8% | 11 |
| amk.Punbot.Punbot 0.01 | 8.7 | 6.9% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.3 | 19 / 35 | 5271 |
| 2 | 1 | 67.4 | 85.1 | 23 / 35 | 4792 |
| 3 | 1 | 68.7 | 87.3 | 22 / 35 | 5391 |
| 4 | 1 | 69.4 | 92.1 | 22 / 35 | 4963 |
| 5 | 1 | 66.9 | 81.6 | 17 / 35 | 5277 |
| 6 | 1 | 66.4 | 81.9 | 15 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 61% |
| baal.nano.N 1.42 | 32 | 91% |
| cvt.Firsty 1.0 | 27 | 78% |
| zyx.micro.Ant 1.1 | 19 | 84% |
| squidM.TentalceMeleeNano 1.1 | 8 | 75% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| sanja.First 0.1 | 7 | 71% |
| amk.Punbot.Punbot 0.01 | 7 | 57% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 42% | 74 |
| zyx.micro.Ant 1.1 | 18 | 20% | 38 |
| cvt.Firsty 1.0 | 10 | 11% | 27 |
| baal.nano.N 1.42 | 6 | 7% | 28 |
| Grystrion.TrackerWO 1.0 | 6 | 7% | 13 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 7 |
| sanja.First 0.1 | 3 | 3% | 12 |
| amk.Punbot.Punbot 0.01 | 3 | 3% | 4 |
| sample.RamFire 1.0 | 3 | 3% | 4 |

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.1 | 51 / 210 | 4.32 | 13.5% | 25259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.3% | 91 |
| hadur117.micro.SaorOG1 0.1 | 2.3 | 13.5% | 51 |
| cs.Wren 1.0 | 2.7 | 12.9% | 21 |
| js.PinBall 1.6 | 4.2 | 11.7% | 17 |
| mz.Cork 0.1 | 4.7 | 11.4% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.6% | 5 |
| evd.X1 0.01 | 6.8 | 8.4% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.9% | 9 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 63.2 | 6 / 35 | 4198 |
| 2 | 4 | 56.6 | 56.2 | 6 / 35 | 3945 |
| 3 | 3 | 55.2 | 51.7 | 5 / 35 | 4045 |
| 4 | 1 | 61.6 | 68.6 | 11 / 35 | 4409 |
| 5 | 2 | 61.5 | 67.3 | 11 / 35 | 4228 |
| 6 | 2 | 62.6 | 71.4 | 12 / 35 | 4434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 41 | 32% |
| cs.Wren 1.0 | 16 | 75% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 6 | 100% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| evd.X1 0.01 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 37% | 76 |
| evd.X1 0.01 | 20 | 13% | 23 |
| cs.Wren 1.0 | 18 | 11% | 31 |
| mz.Cork 0.1 | 18 | 11% | 24 |
| js.PinBall 1.6 | 15 | 9% | 20 |
| joe.ADinosaur 1.0 | 13 | 8% | 15 |
| PSW.Relentless 0.1 | 8 | 5% | 8 |
| jsal.Jsalbot 1.0 | 5 | 3% | 8 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 76.6 | 104 / 210 | 3.10 | 16.3% | 22948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.3% | 104 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 11.7% | 23 |
| ntc.Opposite 1.5 | 3.5 | 11.6% | 10 |
| myl.nano.Graviton 1.10 | 4.0 | 11.3% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.7% | 7 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 10 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 10 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 11 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 76.2 | 20 / 35 | 4029 |
| 2 | 1 | 60.4 | 66.0 | 12 / 35 | 3586 |
| 3 | 1 | 65.5 | 82.2 | 19 / 35 | 3553 |
| 4 | 1 | 62.8 | 72.1 | 14 / 35 | 3759 |
| 5 | 1 | 66.2 | 82.5 | 19 / 35 | 3933 |
| 6 | 1 | 65.5 | 80.6 | 20 / 35 | 4088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 69% |
| myl.nano.Graviton 1.10 | 28 | 68% |
| disan.Chair 2.2.0 | 13 | 92% |
| ntc.Opposite 1.5 | 12 | 75% |
| DBall.NUKE 0.1 | 10 | 100% |
| donjezza.Muncho 1.0 | 9 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 28 | 25% | 49 |
| myl.nano.Graviton 1.10 | 18 | 16% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 15% | 28 |
| ntc.Opposite 1.5 | 14 | 13% | 26 |
| pfvicm.Sobieski 7.2.3b | 14 | 13% | 18 |
| DBall.NUKE 0.1 | 9 | 8% | 18 |
| pbg.R2D2 1.0 | 4 | 4% | 10 |
| disan.Chair 2.2.0 | 3 | 3% | 15 |
| donjezza.Muncho 1.0 | 3 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.5 | 98 / 210 | 3.65 | 15.2% | 22367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 15.2% | 98 |
| oog.melee.Capulet 1.2 | 2.2 | 14.5% | 41 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.8% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 14 |
| yagami.Tidus 0.11 | 4.5 | 12.6% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 7 |
| stelo.MirrorNano 1.3 | 7.3 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.2 | 17 / 35 | 3771 |
| 2 | 1 | 63.6 | 68.6 | 17 / 35 | 3919 |
| 3 | 1 | 63.9 | 70.2 | 18 / 35 | 3506 |
| 4 | 1 | 64.4 | 71.7 | 17 / 35 | 3598 |
| 5 | 1 | 65.2 | 74.9 | 18 / 35 | 3951 |
| 6 | 3 | 61.0 | 62.5 | 11 / 35 | 3622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 96% |
| kawigi.micro.Shiz 1.1 | 27 | 89% |
| yagami.Tidus 0.11 | 21 | 81% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 44% | 73 |
| yagami.Tidus 0.11 | 16 | 14% | 43 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 21 |
| ejb.Polaris 1.0.1 | 11 | 10% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 9% | 41 |
| kurios.DOSexe .9a | 7 | 6% | 7 |
| step.nanoPri 1.0 | 3 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 72.2 | 90 / 210 | 3.50 | 14.7% | 19109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 14.7% | 90 |
| wee.Gem 1.8.4 | 2.3 | 13.8% | 56 |
| bzdp.Pansy 2.1 | 3.2 | 12.8% | 26 |
| wompi.Quokka 1.6 | 3.5 | 12.3% | 15 |
| ratosh.Nobo 0.21 | 4.7 | 11.5% | 11 |
| m3thos.Eva00 1.1 | 6.3 | 9.2% | 6 |
| bayen.UbaMicro 1.4 | 6.7 | 8.7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.4% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 72.1 | 16 / 35 | 2784 |
| 2 | 1 | 63.0 | 75.6 | 16 / 35 | 3098 |
| 3 | 1 | 63.1 | 74.0 | 16 / 35 | 3370 |
| 4 | 3 | 57.9 | 59.0 | 7 / 35 | 3685 |
| 5 | 1 | 61.1 | 70.8 | 16 / 35 | 2992 |
| 6 | 1 | 65.0 | 81.6 | 19 / 35 | 3180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 36 | 81% |
| wee.Gem 1.8.4 | 36 | 69% |
| wompi.Quokka 1.6 | 19 | 100% |
| ratosh.Nobo 0.21 | 15 | 80% |
| m3thos.Eva00 1.1 | 4 | 75% |
| bayen.UbaMicro 1.4 | 3 | 67% |

Hadur died in 120 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 29 | 24% | 60 |
| wompi.Quokka 1.6 | 21 | 18% | 30 |
| bzdp.Pansy 2.1 | 20 | 17% | 45 |
| maribo.FollowFire 1 | 11 | 9% | 12 |
| ratosh.Nobo 0.21 | 9 | 8% | 20 |
| m3thos.Eva00 1.1 | 9 | 8% | 13 |
| bayen.UbaMicro 1.4 | 7 | 6% | 9 |
| stelo.MyAgileRobot 0.2 | 7 | 6% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 79.3 | 24 / 210 | 2.87 | 18.2% | 42824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.4% | 167 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 18.2% | 24 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 13 |
| ayk.WallHugger 1.0 | 4.5 | 9.9% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 5 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.9 | 81.0 | 2 / 35 | 7212 |
| 2 | 2 | 69.2 | 78.7 | 3 / 35 | 7566 |
| 3 | 2 | 68.9 | 77.8 | 3 / 35 | 6895 |
| 4 | 2 | 68.9 | 79.4 | 5 / 35 | 6569 |
| 5 | 2 | 70.8 | 81.6 | 8 / 35 | 7809 |
| 6 | 2 | 68.1 | 77.1 | 3 / 35 | 6773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 121 | 7% |
| mz.NanoGod 2.02 | 8 | 75% |
| exauge.GateKeeper 1.1.121g | 6 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 137 | 74% | 148 |
| mz.NanoGod 2.02 | 29 | 16% | 37 |
| exauge.GateKeeper 1.1.121g | 10 | 5% | 13 |
| ayk.WallHugger 1.0 | 9 | 5% | 8 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 68.9 | 94 / 210 | 3.80 | 14.9% | 22286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.7 | 14.9% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.5% | 26 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.3% | 23 |
| bvh.micro.Freya 0.3 | 3.8 | 11.8% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.1% | 20 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 2 |
| stelo.MirrorMicro 1.0 | 6.7 | 8.8% | 9 |
| ap.Frederick 1.1 | 7.7 | 7.2% | 18 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 72.1 | 14 / 35 | 3627 |
| 2 | 1 | 63.7 | 72.7 | 18 / 35 | 3998 |
| 3 | 1 | 64.8 | 78.1 | 21 / 35 | 3918 |
| 4 | 3 | 58.9 | 59.7 | 12 / 35 | 3646 |
| 5 | 1 | 63.4 | 72.1 | 18 / 35 | 3930 |
| 6 | 3 | 57.7 | 58.7 | 11 / 35 | 3167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 81% |
| dummy.micro.Sparrow 2.5 | 25 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 76% |
| bvh.micro.Freya 0.3 | 16 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 23% | 44 |
| voidious.micro.BlitzBat 1.05 | 19 | 16% | 58 |
| dummy.micro.Sparrow 2.5 | 14 | 12% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 12% | 13 |
| conscience.Electron 1.3g | 13 | 11% | 16 |
| bvh.micro.Freya 0.3 | 11 | 9% | 21 |
| dl.BetterWalls 1.0 | 9 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 8 |
| ap.Frederick 1.1 | 2 | 2% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 72.6 | 101 / 210 | 3.46 | 17.0% | 31753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.5 | 16.9% | 34 |
| hadur117.micro.SaorOG1 0.1 | 1.5 | 17.0% | 101 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.9% | 24 |
| sul.Lunar 1.1 | 3.5 | 12.1% | 26 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 3 |
| mme.NikeEnhanced 2.0 | 6.0 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 2 |
| sample.MyFirstRobot 1.0 | 7.7 | 6.5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 5 |
| sample.Corners 1.0 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 70.8 | 15 / 35 | 5407 |
| 2 | 1 | 69.4 | 82.5 | 22 / 35 | 5878 |
| 3 | 2 | 64.7 | 69.8 | 15 / 35 | 5101 |
| 4 | 1 | 66.2 | 73.7 | 17 / 35 | 5407 |
| 5 | 2 | 62.8 | 62.5 | 14 / 35 | 4884 |
| 6 | 1 | 66.6 | 76.5 | 18 / 35 | 5076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 60 | 92% |
| sul.Lunar 1.1 | 18 | 89% |
| supersample.SuperBoxBot 1.0 | 13 | 62% |
| dsw.StaticD 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 41% | 101 |
| supersample.SuperBoxBot 1.0 | 29 | 27% | 41 |
| mme.NikeEnhanced 2.0 | 10 | 9% | 12 |
| sul.Lunar 1.1 | 9 | 8% | 25 |
| dsw.StaticD 1.0 | 6 | 6% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 7 |
| sample.Corners 1.0 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.1 | 95 / 210 | 3.06 | 17.2% | 33418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.2% | 95 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.5 | 13.0% | 27 |
| radnor.DoctorBob 1.42 | 3.0 | 12.9% | 37 |
| mld.Wisdom 1.0 | 4.2 | 11.1% | 14 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 11 |
| amz.NanoClone 1.41 | 5.7 | 9.9% | 13 |
| GarmBox.Oranges 1.0 | 7.5 | 7.4% | 0 |
| sample.Walls 1.0 | 7.5 | 7.7% | 7 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 6 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.0 | 17 / 35 | 5924 |
| 2 | 1 | 62.6 | 66.3 | 10 / 35 | 5437 |
| 3 | 1 | 64.1 | 73.0 | 15 / 35 | 5199 |
| 4 | 1 | 67.6 | 82.9 | 21 / 35 | 5272 |
| 5 | 1 | 68.0 | 85.4 | 17 / 35 | 5775 |
| 6 | 1 | 66.3 | 75.9 | 15 / 35 | 5811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 78% |
| radnor.DoctorBob 1.42 | 38 | 50% |
| mld.Wisdom 1.0 | 17 | 82% |
| amz.NanoClone 1.41 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 7 | 43% |
| jangs.ns51 1.0 | 5 | 60% |
| sample.Target 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 34% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 28% | 75 |
| KiraNL.Chupacabra 0.4 | 19 | 16% | 24 |
| mld.Wisdom 1.0 | 10 | 9% | 29 |
| amz.NanoClone 1.41 | 9 | 8% | 12 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 1 | 1% | 2 |

