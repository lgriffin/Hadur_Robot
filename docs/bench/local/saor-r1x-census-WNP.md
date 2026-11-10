# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.0 | 134 / 210 | 2.44 | 20.2% | 41971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.2% | 134 |
| radnor.DoctorBob 1.42 | 2.2 | 15.0% | 25 |
| mz.AntiGrav 1.0 | 3.0 | 13.9% | 17 |
| mld.Infinity 2.2 | 3.8 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 9 |
| sample.Walls 1.0 | 6.3 | 7.2% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.5% | 4 |
| sample.Target 1.0 | 9.3 | 3.9% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 79.4 | 22 / 35 | 6698 |
| 2 | 1 | 71.9 | 87.9 | 25 / 35 | 6846 |
| 3 | 1 | 70.4 | 83.5 | 23 / 35 | 6699 |
| 4 | 1 | 71.0 | 84.1 | 22 / 35 | 7218 |
| 5 | 1 | 72.4 | 87.0 | 23 / 35 | 7584 |
| 6 | 1 | 70.1 | 81.9 | 19 / 35 | 6926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 99% |
| radnor.DoctorBob 1.42 | 34 | 88% |
| mld.Infinity 2.2 | 29 | 97% |
| amz.NanoClone 1.41 | 5 | 60% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 36% | 67 |
| amz.NanoClone 1.41 | 21 | 27% | 24 |
| mz.AntiGrav 1.0 | 17 | 22% | 69 |
| mld.Infinity 2.2 | 4 | 5% | 34 |
| sample.Walls 1.0 | 3 | 4% | 8 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.0 | 103 / 210 | 2.71 | 17.6% | 31479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 17.6% | 103 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.6% | 52 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 30 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 5 |
| zyx.nano.Ant 1.1 | 5.8 | 8.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.5% | 8 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 8.8 | 6.0% | 6 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.6 | 17 / 35 | 5111 |
| 2 | 1 | 66.8 | 81.9 | 16 / 35 | 5213 |
| 3 | 1 | 67.8 | 83.5 | 20 / 35 | 5463 |
| 4 | 1 | 67.0 | 81.3 | 14 / 35 | 5504 |
| 5 | 1 | 67.8 | 83.5 | 20 / 35 | 5416 |
| 6 | 1 | 65.8 | 80.0 | 16 / 35 | 4772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 70% |
| mld.DustBunny 3.8 | 49 | 76% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 7 | 86% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 5 | 40% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 34% | 74 |
| mld.DustBunny 3.8 | 32 | 30% | 71 |
| zyx.nano.Ant 1.1 | 13 | 12% | 17 |
| maribo.melee.BMV 0.1 | 9 | 8% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 9 |
| fullsail.SweetTea 1.1 | 5 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 12 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 78.0 | 104 / 210 | 2.98 | 18.3% | 35889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 18.3% | 104 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.9% | 27 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.3% | 12 |
| fm.mammillarias 1.3 | 5.7 | 9.7% | 5 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 3 |
| sample.Fire 1.0 | 9.5 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.6 | 23 / 35 | 6640 |
| 2 | 1 | 67.2 | 75.9 | 14 / 35 | 6052 |
| 3 | 1 | 65.1 | 69.5 | 15 / 35 | 5380 |
| 4 | 1 | 67.0 | 76.2 | 16 / 35 | 5804 |
| 5 | 1 | 68.3 | 79.4 | 17 / 35 | 6119 |
| 6 | 1 | 68.4 | 79.7 | 19 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 75% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 14 | 79% |
| fm.mammillarias 1.3 | 10 | 80% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sp.Nanos.Ember 1.1 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 25% | 43 |
| myl.micro.Troodon 1.10 | 24 | 23% | 61 |
| fm.mammillarias 1.3 | 22 | 21% | 30 |
| myl.nano.KomoriNinja 1.1 | 13 | 12% | 35 |
| cb.nano.Insomnia 1.0 | 8 | 8% | 13 |
| cs.sheldor.Talon 1.1 | 7 | 7% | 12 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 10 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.0 | 138 / 210 | 2.26 | 20.1% | 38582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.1% | 138 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 20 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.6% | 4 |
| tj.zombie1n 1.0.1 | 5.5 | 9.4% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.7% | 13 |
| yk.JahMicro 1.0 | 6.5 | 8.3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.3% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.4 | 22 / 35 | 6638 |
| 2 | 1 | 69.2 | 85.4 | 22 / 35 | 6034 |
| 3 | 1 | 71.9 | 92.7 | 28 / 35 | 6734 |
| 4 | 1 | 70.1 | 87.9 | 24 / 35 | 6369 |
| 5 | 1 | 70.1 | 87.0 | 21 / 35 | 6616 |
| 6 | 1 | 67.9 | 77.5 | 21 / 35 | 6191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 50 | 88% |
| stelo.SoJNanoMelee 1.1 | 38 | 87% |
| tj.zombie1n 1.0.1 | 18 | 83% |
| tvv.micro.Antares 1.1.1 | 17 | 76% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 79% |
| yk.JahMicro 1.0 | 11 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 80% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 33% | 73 |
| stelo.SoJNanoMelee 1.1 | 14 | 19% | 35 |
| tvv.micro.Antares 1.1.1 | 8 | 11% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 11% | 26 |
| tj.zombie1n 1.0.1 | 8 | 11% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 10 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 72.3 | 86 / 210 | 3.50 | 16.2% | 30263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 16.2% | 86 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 36 |
| ahf.NanoAndrew .4 | 3.7 | 11.5% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.0% | 25 |
| EBBU.Sim2 1.02 | 5.7 | 9.6% | 5 |
| sam.Samspin 1.0 | 6.3 | 9.0% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.1% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.0% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.6 | 15 / 35 | 5325 |
| 2 | 1 | 64.6 | 72.1 | 15 / 35 | 5151 |
| 3 | 1 | 63.1 | 73.0 | 15 / 35 | 4577 |
| 4 | 1 | 60.9 | 62.2 | 10 / 35 | 4867 |
| 5 | 1 | 65.9 | 77.8 | 18 / 35 | 5269 |
| 6 | 1 | 64.0 | 73.0 | 13 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 63% |
| simonton.nano.MeleeSeed 1.8 | 28 | 75% |
| ahf.NanoAndrew .4 | 23 | 78% |
| EBBU.Sim2 1.02 | 15 | 93% |
| sam.Samspin 1.0 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 43 |
| ahf.NanoAndrew .4 | 20 | 16% | 45 |
| simonton.nano.MeleeSeed 1.8 | 18 | 15% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13% | 17 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 18 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 13 |
| sam.Samspin 1.0 | 10 | 8% | 16 |
| EBBU.Sim2 1.02 | 7 | 6% | 18 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.0 | 105 / 210 | 2.89 | 17.6% | 31799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 17.6% | 105 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 45 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.5% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.7% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.5% | 12 |
| fm.claire 1.7 | 6.0 | 8.7% | 3 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.3% | 5 |
| sample.SpinBot 1.0 | 7.8 | 7.5% | 8 |
| kurios.DOSexe .9b | 9.2 | 5.8% | 3 |
| pa.Improved 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.2 | 19 / 35 | 5690 |
| 2 | 1 | 67.0 | 80.6 | 18 / 35 | 5430 |
| 3 | 1 | 65.1 | 74.3 | 14 / 35 | 4937 |
| 4 | 1 | 66.6 | 81.3 | 19 / 35 | 5178 |
| 5 | 1 | 67.6 | 81.6 | 22 / 35 | 5295 |
| 6 | 1 | 64.7 | 73.0 | 13 / 35 | 5269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 74% |
| oog.melee.CapuletDroid 1.1 | 24 | 96% |
| gh.nano.Grofvuil 0.2 | 14 | 93% |
| arthord.NanoSatanMelee Beta | 10 | 80% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| sample.SpinBot 1.0 | 7 | 86% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 37% | 78 |
| arthord.NanoSatanMelee Beta | 14 | 13% | 19 |
| gh.nano.Grofvuil 0.2 | 12 | 11% | 27 |
| oog.melee.CapuletDroid 1.1 | 10 | 9% | 32 |
| winamp32.micro.MicroMacro 1.0 | 8 | 8% | 17 |
| sample.SpinBot 1.0 | 8 | 8% | 13 |
| fm.claire 1.7 | 8 | 8% | 11 |
| kurios.DOSexe .9b | 7 | 7% | 11 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.6 | 90 / 210 | 3.38 | 16.7% | 33145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.5 | 16.7% | 90 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.3% | 42 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.5% | 32 |
| mz.MicroGodMelee 1 | 3.3 | 13.7% | 32 |
| DBall.Anarchy 0.1 | 5.3 | 8.9% | 6 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.3% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.4% | 4 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 1 |
| fire219.CatBot 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.2 | 17 / 35 | 5304 |
| 2 | 1 | 68.2 | 82.2 | 21 / 35 | 5772 |
| 3 | 1 | 66.1 | 71.4 | 13 / 35 | 5996 |
| 4 | 4 | 60.4 | 60.3 | 7 / 35 | 4933 |
| 5 | 1 | 66.1 | 74.3 | 16 / 35 | 5888 |
| 6 | 1 | 66.1 | 77.1 | 16 / 35 | 5252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 88% |
| mz.MicroGodMelee 1 | 29 | 76% |
| gh.micro.Gruweltje 0.7 | 20 | 65% |
| DBall.Anarchy 0.1 | 15 | 100% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 28% | 58 |
| spinnercat.micro.Tyger 0.1 | 31 | 26% | 57 |
| gh.micro.Gruweltje 0.7 | 25 | 21% | 40 |
| caimano.Furia_Ceca 0.22 | 11 | 9% | 12 |
| fire219.CatBot 1.0 | 9 | 7% | 8 |
| acogdev.alpha 0.2 | 7 | 6% | 8 |
| DBall.Anarchy 0.1 | 2 | 2% | 17 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 8 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 70.5 | 101 / 210 | 3.66 | 16.3% | 31934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.3% | 49 |
| hadur117.micro.SaorWNP 0.1 | 1.7 | 16.3% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.9% | 38 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.6% | 5 |
| germ.TheMind .2 | 5.3 | 8.7% | 5 |
| awesomeness.Elite 1.0 | 6.2 | 8.5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 1 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.3% | 0 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 71.1 | 16 / 35 | 5177 |
| 2 | 2 | 61.3 | 60.3 | 11 / 35 | 5458 |
| 3 | 3 | 61.5 | 60.6 | 14 / 35 | 4723 |
| 4 | 1 | 65.2 | 72.4 | 20 / 35 | 5264 |
| 5 | 1 | 67.1 | 81.0 | 21 / 35 | 5136 |
| 6 | 1 | 67.9 | 77.5 | 19 / 35 | 6176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 76% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| germ.TheMind .2 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 44% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 20% | 43 |
| awesomeness.Elite 1.0 | 10 | 9% | 13 |
| germ.TheMind .2 | 9 | 8% | 15 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 7 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.7 | 120 / 210 | 2.92 | 17.8% | 30231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 17.8% | 120 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 28 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.9% | 27 |
| maribo.IotaCT 1.1 | 4.7 | 10.4% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.2% | 7 |
| ratosh.Wesco 1.4 | 6.3 | 9.0% | 7 |
| stelo.PatternRobot 1.0 | 8.0 | 8.3% | 7 |
| spinnercat.Omen 1.0 | 8.3 | 7.8% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.0 | 23 / 35 | 5165 |
| 2 | 1 | 67.4 | 80.3 | 21 / 35 | 4889 |
| 3 | 1 | 66.0 | 74.6 | 17 / 35 | 4880 |
| 4 | 1 | 67.5 | 79.4 | 22 / 35 | 4990 |
| 5 | 1 | 67.0 | 78.1 | 19 / 35 | 5103 |
| 6 | 1 | 67.2 | 78.7 | 18 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 85% |
| nz.jdc.nano.GridFu 1.0 | 26 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| timmit.nano.TimDog 0.33 | 11 | 73% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| ratosh.Wesco 1.4 | 9 | 78% |
| maribo.IotaCT 1.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 27% | 61 |
| stelo.PatternRobot 1.0 | 15 | 17% | 22 |
| ratosh.Wesco 1.4 | 13 | 14% | 25 |
| timmit.nano.TimDog 0.33 | 13 | 14% | 21 |
| nz.jdc.nano.GridFu 1.0 | 10 | 11% | 41 |
| maribo.IotaCT 1.1 | 7 | 8% | 22 |
| spinnercat.Omen 1.0 | 5 | 6% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 10 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.5 | 150 / 210 | 2.22 | 20.3% | 38401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.3% | 150 |
| baal.nano.N 1.42 | 2.5 | 12.4% | 14 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.1% | 17 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.2% | 4 |
| zyx.micro.Ant 1.1 | 4.7 | 9.9% | 10 |
| sanja.First 0.1 | 6.8 | 8.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.8% | 3 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 6 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.7 | 23 / 35 | 6531 |
| 2 | 1 | 70.1 | 83.8 | 24 / 35 | 6667 |
| 3 | 1 | 67.4 | 75.9 | 23 / 35 | 5915 |
| 4 | 1 | 72.0 | 92.4 | 28 / 35 | 6673 |
| 5 | 1 | 72.0 | 94.0 | 28 / 35 | 6644 |
| 6 | 1 | 69.1 | 87.0 | 24 / 35 | 5971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 84% |
| tvv.nano.Polaris 1.2 | 34 | 85% |
| zyx.micro.Ant 1.1 | 21 | 90% |
| sanja.First 0.1 | 20 | 95% |
| cvt.Firsty 1.0 | 19 | 95% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 23% | 36 |
| baal.nano.N 1.42 | 11 | 18% | 44 |
| Grystrion.TrackerWO 1.0 | 11 | 18% | 20 |
| tvv.nano.Polaris 1.2 | 8 | 13% | 50 |
| sample.RamFire 1.0 | 5 | 8% | 5 |
| sanja.First 0.1 | 3 | 5% | 22 |
| cvt.Firsty 1.0 | 3 | 5% | 18 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 8 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 66.2 | 71 / 210 | 4.04 | 14.8% | 30087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 74 |
| hadur117.micro.SaorWNP 0.1 | 1.8 | 14.8% | 71 |
| cs.Wren 1.0 | 3.0 | 12.8% | 25 |
| mz.Cork 0.1 | 4.3 | 11.3% | 11 |
| js.PinBall 1.6 | 4.7 | 11.3% | 14 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 4 |
| evd.X1 0.01 | 7.0 | 7.7% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.3% | 5 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 64.4 | 12 / 35 | 4547 |
| 2 | 1 | 63.3 | 71.4 | 12 / 35 | 5171 |
| 3 | 2 | 63.1 | 68.6 | 11 / 35 | 5091 |
| 4 | 1 | 62.9 | 67.6 | 14 / 35 | 5082 |
| 5 | 2 | 63.3 | 67.6 | 14 / 35 | 5309 |
| 6 | 3 | 59.3 | 57.8 | 8 / 35 | 4887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 72% |
| cs.Wren 1.0 | 30 | 60% |
| mz.Cork 0.1 | 7 | 71% |
| joe.ADinosaur 1.0 | 4 | 100% |
| js.PinBall 1.6 | 3 | 67% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 37% | 98 |
| joe.ADinosaur 1.0 | 21 | 15% | 22 |
| cs.Wren 1.0 | 18 | 13% | 26 |
| evd.X1 0.01 | 17 | 12% | 17 |
| mz.Cork 0.1 | 14 | 10% | 21 |
| PSW.Relentless 0.1 | 8 | 6% | 6 |
| js.PinBall 1.6 | 3 | 2% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.4 | 116 / 210 | 2.86 | 18.1% | 30043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 18.1% | 116 |
| ntc.Opposite 1.5 | 3.2 | 11.6% | 9 |
| myl.nano.Graviton 1.10 | 3.5 | 11.6% | 29 |
| pfvicm.Sobieski 7.2.3b | 3.7 | 10.9% | 12 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.1% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.6% | 6 |
| disan.Chair 2.2.0 | 6.7 | 8.3% | 7 |
| DBall.NUKE 0.1 | 7.3 | 8.2% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.4% | 12 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 73.3 | 18 / 35 | 4870 |
| 2 | 1 | 65.7 | 74.6 | 16 / 35 | 4932 |
| 3 | 1 | 67.6 | 81.9 | 19 / 35 | 5250 |
| 4 | 1 | 65.9 | 76.2 | 18 / 35 | 4850 |
| 5 | 1 | 67.6 | 81.9 | 20 / 35 | 5239 |
| 6 | 1 | 69.5 | 88.3 | 25 / 35 | 4902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 86% |
| myl.nano.Graviton 1.10 | 31 | 90% |
| ntc.Opposite 1.5 | 18 | 67% |
| DBall.NUKE 0.1 | 13 | 85% |
| disan.Chair 2.2.0 | 11 | 100% |
| donjezza.Muncho 1.0 | 9 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 27 | 28% | 32 |
| stelo.AreaTargetingBot 1.1 | 16 | 17% | 37 |
| myl.nano.Graviton 1.10 | 13 | 14% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 14% | 21 |
| ntc.Opposite 1.5 | 12 | 13% | 25 |
| disan.Chair 2.2.0 | 5 | 5% | 18 |
| DBall.NUKE 0.1 | 4 | 4% | 21 |
| pbg.R2D2 1.0 | 4 | 4% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 66.7 | 62 / 210 | 4.00 | 14.4% | 25451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 14.7% | 58 |
| hadur117.micro.SaorWNP 0.1 | 2.2 | 14.4% | 62 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.3% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 24 |
| yagami.Tidus 0.11 | 5.0 | 11.8% | 15 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 13 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 66.3 | 9 / 35 | 4087 |
| 2 | 3 | 60.3 | 60.6 | 10 / 35 | 4290 |
| 3 | 3 | 61.4 | 64.1 | 9 / 35 | 4095 |
| 4 | 2 | 59.5 | 58.4 | 9 / 35 | 4101 |
| 5 | 1 | 66.2 | 77.8 | 15 / 35 | 4562 |
| 6 | 1 | 63.8 | 72.7 | 10 / 35 | 4316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 54% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 77% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| ejb.Polaris 1.0.1 | 10 | 70% |
| yagami.Tidus 0.11 | 7 | 86% |

Hadur died in 148 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 38% | 70 |
| yagami.Tidus 0.11 | 23 | 16% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 12% | 40 |
| ejb.Polaris 1.0.1 | 17 | 11% | 24 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 24 |
| step.nanoPri 1.0 | 12 | 8% | 12 |
| stelo.MirrorNano 1.3 | 8 | 5% | 8 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 68.4 | 89 / 210 | 3.85 | 15.1% | 25762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.3 | 15.1% | 89 |
| wee.Gem 1.8.4 | 2.5 | 12.7% | 42 |
| bzdp.Pansy 2.1 | 3.2 | 12.5% | 26 |
| ratosh.Nobo 0.21 | 4.0 | 12.0% | 16 |
| wompi.Quokka 1.6 | 4.0 | 11.6% | 21 |
| m3thos.Eva00 1.1 | 6.3 | 9.4% | 10 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 68.6 | 15 / 35 | 4216 |
| 2 | 1 | 62.7 | 70.8 | 16 / 35 | 4014 |
| 3 | 1 | 66.0 | 78.4 | 17 / 35 | 4664 |
| 4 | 3 | 57.3 | 55.2 | 11 / 35 | 3766 |
| 5 | 1 | 61.7 | 65.7 | 14 / 35 | 4558 |
| 6 | 1 | 64.4 | 71.4 | 16 / 35 | 4544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 33 | 94% |
| wee.Gem 1.8.4 | 21 | 95% |
| ratosh.Nobo 0.21 | 19 | 74% |
| wompi.Quokka 1.6 | 12 | 92% |
| m3thos.Eva00 1.1 | 8 | 63% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 23 | 19% | 36 |
| bzdp.Pansy 2.1 | 21 | 17% | 42 |
| wee.Gem 1.8.4 | 17 | 14% | 41 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 11% | 15 |
| wompi.Quokka 1.6 | 12 | 10% | 18 |
| bayen.UbaMicro 1.4 | 10 | 8% | 19 |
| maribo.FollowFire 1 | 9 | 7% | 11 |
| m3thos.Eva00 1.1 | 8 | 7% | 17 |
| stelo.MyAgileRobot 0.2 | 8 | 7% | 10 |

## Melee bench: F15

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 83.2 | 125 / 210 | 2.51 | 20.4% | 45007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 20.4% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 18 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 88.9 | 20 / 35 | 8218 |
| 2 | 1 | 70.4 | 80.0 | 20 / 35 | 7119 |
| 3 | 1 | 71.1 | 83.2 | 21 / 35 | 7266 |
| 4 | 1 | 69.3 | 75.2 | 19 / 35 | 6947 |
| 5 | 1 | 70.8 | 81.0 | 19 / 35 | 7395 |
| 6 | 1 | 73.7 | 91.1 | 26 / 35 | 8062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 96 | 82% |
| mz.NanoGod 2.02 | 15 | 67% |
| exauge.GateKeeper 1.1.121g | 15 | 100% |
| ayk.WallHugger 1.0 | 8 | 88% |
| stuff.Vlad 0.1 | 5 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 40% | 120 |
| mz.NanoGod 2.02 | 32 | 37% | 48 |
| ayk.WallHugger 1.0 | 11 | 13% | 16 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 11 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.4 | 98 / 210 | 3.58 | 16.2% | 29024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 16.2% | 98 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.7% | 24 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 23 |
| bvh.micro.Freya 0.3 | 3.3 | 11.6% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 19 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 0 |
| stelo.MirrorMicro 1.0 | 6.7 | 8.7% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 7.2% | 9 |
| ap.Frederick 1.1 | 8.7 | 6.8% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 72.4 | 13 / 35 | 4951 |
| 2 | 1 | 63.3 | 71.4 | 15 / 35 | 4680 |
| 3 | 1 | 65.5 | 74.6 | 22 / 35 | 4710 |
| 4 | 1 | 64.7 | 73.0 | 15 / 35 | 5166 |
| 5 | 1 | 60.5 | 61.6 | 13 / 35 | 4503 |
| 6 | 1 | 65.7 | 75.2 | 20 / 35 | 5014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 82% |
| dummy.micro.Sparrow 2.5 | 23 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 100% |
| bvh.micro.Freya 0.3 | 19 | 79% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 23 | 21% | 29 |
| voidious.micro.BlitzBat 1.05 | 22 | 20% | 48 |
| bvh.micro.Freya 0.3 | 18 | 16% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 12% | 12 |
| dummy.micro.Sparrow 2.5 | 10 | 9% | 32 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 8% | 31 |
| dl.BetterWalls 1.0 | 9 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 13 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 86.2 | 138 / 210 | 2.24 | 21.0% | 42744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 21.0% | 138 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 14 |
| sul.Lunar 1.1 | 3.7 | 11.0% | 11 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.1% | 15 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.5% | 9 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 11 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 4 |
| sample.Corners 1.0 | 9.0 | 5.8% | 3 |
| sample.MyFirstRobot 1.0 | 9.2 | 6.0% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 83.2 | 24 / 35 | 6967 |
| 2 | 1 | 72.1 | 89.5 | 24 / 35 | 7607 |
| 3 | 1 | 69.3 | 80.3 | 19 / 35 | 6728 |
| 4 | 1 | 70.7 | 81.9 | 21 / 35 | 7414 |
| 5 | 1 | 71.5 | 89.2 | 23 / 35 | 6974 |
| 6 | 1 | 72.5 | 93.3 | 27 / 35 | 7054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 42 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 95% |
| supersample.SuperBoxBot 1.0 | 29 | 93% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| mme.NikeEnhanced 2.0 | 8 | 63% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 27 | 37% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 27% | 65 |
| dsw.StaticD 1.0 | 6 | 8% | 12 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 15 |
| sul.Lunar 1.1 | 4 | 5% | 43 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| sample.Corners 1.0 | 2 | 3% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.5 | 111 / 210 | 2.84 | 18.1% | 36794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNP 0.1 | 1.0 | 18.1% | 111 |
| mld.Wisdom 1.0 | 2.8 | 12.9% | 24 |
| radnor.DoctorBob 1.42 | 3.2 | 12.6% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.0% | 23 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 9 |
| amz.NanoClone 1.41 | 5.3 | 10.4% | 10 |
| sample.Walls 1.0 | 7.0 | 7.4% | 4 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.2 | 21 / 35 | 6643 |
| 2 | 1 | 67.7 | 79.0 | 20 / 35 | 6162 |
| 3 | 1 | 68.6 | 83.8 | 18 / 35 | 6431 |
| 4 | 1 | 67.5 | 79.7 | 18 / 35 | 6055 |
| 5 | 1 | 67.3 | 78.4 | 18 / 35 | 5903 |
| 6 | 1 | 65.4 | 73.0 | 16 / 35 | 5600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 51 | 88% |
| radnor.DoctorBob 1.42 | 22 | 77% |
| mld.Wisdom 1.0 | 20 | 55% |
| amz.NanoClone 1.41 | 11 | 91% |
| jangs.ns51 1.0 | 11 | 91% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 31% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 23% | 73 |
| KiraNL.Chupacabra 0.4 | 16 | 16% | 24 |
| amz.NanoClone 1.41 | 12 | 12% | 19 |
| radnor.DoctorBob 1.42 | 11 | 11% | 31 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |
| sample.Walls 1.0 | 0 | 0% | 8 |

