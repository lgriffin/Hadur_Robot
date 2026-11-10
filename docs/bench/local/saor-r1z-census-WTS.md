# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.7 | 143 / 210 | 2.29 | 20.7% | 42154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 20.7% | 143 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 20 |
| mz.AntiGrav 1.0 | 3.3 | 13.3% | 16 |
| mld.Infinity 2.2 | 3.3 | 13.5% | 19 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 7 |
| sample.Walls 1.0 | 6.3 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 4 |
| arthord.MannyPacquiao Beta | 9.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 81.0 | 22 / 35 | 7064 |
| 2 | 1 | 70.4 | 83.2 | 21 / 35 | 6463 |
| 3 | 1 | 73.2 | 90.8 | 27 / 35 | 7855 |
| 4 | 1 | 71.5 | 85.7 | 23 / 35 | 7165 |
| 5 | 1 | 71.0 | 84.8 | 24 / 35 | 6642 |
| 6 | 1 | 71.6 | 88.9 | 26 / 35 | 6965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 58 | 91% |
| mld.Infinity 2.2 | 41 | 98% |
| radnor.DoctorBob 1.42 | 36 | 86% |
| amz.NanoClone 1.41 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 34% | 69 |
| mz.AntiGrav 1.0 | 19 | 28% | 64 |
| amz.NanoClone 1.41 | 7 | 10% | 9 |
| mld.Infinity 2.2 | 6 | 9% | 43 |
| arthord.MannyPacquiao Beta | 3 | 4% | 6 |
| GarmBox.Oranges 1.0 | 3 | 4% | 5 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| sample.Walls 1.0 | 3 | 4% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.8 | 127 / 210 | 2.28 | 18.9% | 32891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 18.9% | 127 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 52 |
| mld.DustBunny 3.8 | 3.7 | 12.6% | 17 |
| maribo.melee.BMV 0.1 | 4.5 | 10.0% | 2 |
| zyx.nano.Ant 1.1 | 5.3 | 8.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.5% | 9 |
| bzdp.BoxCar 2.0 | 8.0 | 7.4% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 20 / 35 | 5002 |
| 2 | 1 | 67.2 | 80.3 | 19 / 35 | 5677 |
| 3 | 1 | 70.6 | 93.7 | 21 / 35 | 6002 |
| 4 | 1 | 69.3 | 88.9 | 20 / 35 | 5867 |
| 5 | 1 | 69.4 | 89.5 | 24 / 35 | 5328 |
| 6 | 1 | 67.7 | 81.9 | 23 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 70% |
| mld.DustBunny 3.8 | 61 | 84% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 42% | 81 |
| mld.DustBunny 3.8 | 21 | 25% | 65 |
| maribo.melee.BMV 0.1 | 5 | 6% | 14 |
| zyx.nano.Ant 1.1 | 5 | 6% | 10 |
| fullsail.SweetTea 1.1 | 5 | 6% | 10 |
| cs.Grudge 1.0 | 5 | 6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 13 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 84.0 | 127 / 210 | 2.44 | 19.7% | 36061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.7% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 15.2% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.1% | 19 |
| fm.mammillarias 1.3 | 5.2 | 9.3% | 1 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.3% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.2% | 1 |
| sample.Tracker 1.0 | 8.8 | 4.8% | 0 |
| sample.Fire 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.8 | 20 / 35 | 6458 |
| 2 | 1 | 70.0 | 86.3 | 23 / 35 | 5583 |
| 3 | 1 | 69.6 | 84.1 | 21 / 35 | 6005 |
| 4 | 1 | 70.0 | 84.1 | 23 / 35 | 6081 |
| 5 | 1 | 68.4 | 77.8 | 19 / 35 | 5954 |
| 6 | 1 | 70.3 | 86.7 | 21 / 35 | 5980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 83% |
| cb.nano.Insomnia 1.0 | 24 | 100% |
| myl.nano.KomoriNinja 1.1 | 21 | 76% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| fm.mammillarias 1.3 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 25% | 48 |
| myl.micro.Troodon 1.10 | 20 | 24% | 75 |
| myl.nano.KomoriNinja 1.1 | 12 | 14% | 38 |
| cs.sheldor.Talon 1.1 | 8 | 10% | 12 |
| fm.mammillarias 1.3 | 8 | 10% | 10 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 10 |
| cb.nano.Insomnia 1.0 | 5 | 6% | 10 |
| sample.Fire 1.0 | 4 | 5% | 6 |

## Melee bench: F04

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.7 | 148 / 210 | 2.20 | 20.5% | 38888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 20.5% | 148 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.5% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.5% | 17 |
| tj.zombie1n 1.0.1 | 5.5 | 9.3% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.1% | 5 |
| yk.JahMicro 1.0 | 7.0 | 8.1% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.4 | 27 / 35 | 6470 |
| 2 | 1 | 71.6 | 90.5 | 27 / 35 | 6942 |
| 3 | 1 | 70.1 | 87.3 | 25 / 35 | 6301 |
| 4 | 1 | 70.7 | 87.0 | 26 / 35 | 6846 |
| 5 | 1 | 71.0 | 87.9 | 27 / 35 | 6682 |
| 6 | 1 | 66.8 | 75.9 | 16 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 93% |
| stelo.SoJNanoMelee 1.1 | 37 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| tj.zombie1n 1.0.1 | 11 | 73% |
| yk.JahMicro 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 31% | 91 |
| stelo.SoJNanoMelee 1.1 | 12 | 19% | 31 |
| tvv.micro.Antares 1.1.1 | 10 | 16% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 23 |
| yk.JahMicro 1.0 | 5 | 8% | 7 |
| tj.zombie1n 1.0.1 | 4 | 6% | 7 |
| repositorio.NanoStep 1.0 | 3 | 5% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.2 | 85 / 210 | 3.69 | 15.9% | 29280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 15.9% | 85 |
| oog.melee.Corsair 1.0 | 2.5 | 12.5% | 37 |
| ahf.NanoAndrew .4 | 2.8 | 12.2% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.9% | 27 |
| EBBU.Sim2 1.02 | 4.7 | 10.3% | 6 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.7% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.5 | 16 / 35 | 4941 |
| 2 | 1 | 63.8 | 69.5 | 15 / 35 | 5067 |
| 3 | 1 | 62.6 | 67.3 | 11 / 35 | 4645 |
| 4 | 1 | 64.5 | 73.0 | 17 / 35 | 4827 |
| 5 | 1 | 61.2 | 62.2 | 10 / 35 | 4834 |
| 6 | 1 | 64.7 | 72.4 | 16 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ahf.NanoAndrew .4 | 25 | 84% |
| oog.melee.Corsair 1.0 | 22 | 45% |
| simonton.nano.MeleeSeed 1.8 | 19 | 100% |
| EBBU.Sim2 1.02 | 14 | 93% |
| sam.Samspin 1.0 | 13 | 85% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 22 | 18% | 45 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 36 |
| oog.melee.Corsair 1.0 | 19 | 15% | 30 |
| EBBU.Sim2 1.02 | 18 | 14% | 29 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 23 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 7% | 11 |
| sam.Samspin 1.0 | 7 | 6% | 14 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.0 | 142 / 210 | 2.08 | 19.8% | 33241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.8% | 142 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.8% | 23 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.4% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.9% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 10 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.6% | 2 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 2 |
| pa.Improved 1.0 | 9.0 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.9 | 19 / 35 | 5360 |
| 2 | 1 | 69.1 | 85.4 | 26 / 35 | 5424 |
| 3 | 1 | 70.7 | 94.9 | 24 / 35 | 5678 |
| 4 | 1 | 69.1 | 87.0 | 21 / 35 | 5577 |
| 5 | 1 | 70.5 | 89.8 | 27 / 35 | 5834 |
| 6 | 1 | 69.4 | 88.3 | 25 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 79% |
| oog.melee.CapuletDroid 1.1 | 44 | 95% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| sample.SpinBot 1.0 | 11 | 91% |
| gh.nano.Grofvuil 0.2 | 11 | 91% |
| winamp32.micro.MicroMacro 1.0 | 10 | 70% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 42% | 75 |
| winamp32.micro.MicroMacro 1.0 | 8 | 12% | 18 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 47 |
| fm.claire 1.7 | 7 | 10% | 8 |
| sample.SpinBot 1.0 | 6 | 9% | 13 |
| gh.nano.Grofvuil 0.2 | 4 | 6% | 17 |
| arthord.NanoSatanMelee Beta | 4 | 6% | 14 |
| kurios.DOSexe .9b | 3 | 4% | 10 |
| pa.Improved 1.0 | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.8 | 119 / 210 | 2.55 | 18.8% | 35581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 18.8% | 119 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.4% | 27 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 23 |
| mz.MicroGodMelee 1 | 3.3 | 13.1% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 2 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.1% | 3 |
| acogdev.alpha 0.2 | 8.7 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.6 | 18 / 35 | 5548 |
| 2 | 1 | 67.8 | 78.7 | 21 / 35 | 5958 |
| 3 | 1 | 69.3 | 86.3 | 20 / 35 | 5907 |
| 4 | 1 | 66.6 | 76.2 | 17 / 35 | 5608 |
| 5 | 1 | 69.7 | 86.0 | 25 / 35 | 5981 |
| 6 | 1 | 70.5 | 88.9 | 18 / 35 | 6579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 90% |
| mz.MicroGodMelee 1 | 43 | 72% |
| gh.micro.Gruweltje 0.7 | 26 | 69% |
| DBall.Anarchy 0.1 | 8 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 27 | 30% | 63 |
| gh.micro.Gruweltje 0.7 | 22 | 24% | 43 |
| spinnercat.micro.Tyger 0.1 | 17 | 19% | 60 |
| DBall.Anarchy 0.1 | 6 | 7% | 17 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 8 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 6 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 70.8 | 106 / 210 | 3.63 | 16.4% | 30210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.3 | 16.4% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.1% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.5% | 6 |
| germ.TheMind .2 | 5.3 | 9.2% | 8 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.8% | 8 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 62.2 | 16 / 35 | 4672 |
| 2 | 1 | 67.3 | 76.5 | 22 / 35 | 5632 |
| 3 | 1 | 63.6 | 65.7 | 16 / 35 | 5064 |
| 4 | 2 | 62.3 | 65.4 | 17 / 35 | 4410 |
| 5 | 1 | 67.3 | 81.3 | 18 / 35 | 5155 |
| 6 | 1 | 65.7 | 73.7 | 17 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 83% |
| germ.TheMind .2 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| awesomeness.Elite 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 40% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 16% | 36 |
| germ.TheMind .2 | 15 | 14% | 27 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 10 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 12 |
| awesomeness.Elite 1.0 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.8 | 143 / 210 | 2.19 | 19.6% | 31150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.6% | 143 |
| nz.jdc.nano.GridFu 1.0 | 2.3 | 12.6% | 11 |
| rz.HawkOnFire 0.1 | 2.7 | 13.3% | 20 |
| maribo.IotaCT 1.1 | 4.5 | 10.6% | 11 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 4 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 1 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 7.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.9 | 26 / 35 | 4953 |
| 2 | 1 | 69.1 | 83.5 | 23 / 35 | 5255 |
| 3 | 1 | 70.6 | 89.2 | 25 / 35 | 5267 |
| 4 | 1 | 69.5 | 87.9 | 24 / 35 | 4966 |
| 5 | 1 | 69.1 | 86.0 | 20 / 35 | 5336 |
| 6 | 1 | 70.5 | 86.0 | 25 / 35 | 5373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 92% |
| nz.jdc.nano.GridFu 1.0 | 44 | 98% |
| timmit.nano.TimDog 0.33 | 13 | 54% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 92% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| maribo.IotaCT 1.1 | 8 | 88% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 31% | 63 |
| timmit.nano.TimDog 0.33 | 14 | 21% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 13% | 17 |
| stelo.PatternRobot 1.0 | 7 | 10% | 16 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 49 |
| ratosh.Wesco 1.4 | 5 | 7% | 17 |
| maribo.IotaCT 1.1 | 4 | 6% | 16 |
| spinnercat.Omen 1.0 | 2 | 3% | 2 |

## Melee bench: F10

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.0 | 167 / 210 | 1.72 | 21.6% | 39416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 21.6% | 167 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.5% | 14 |
| baal.nano.N 1.42 | 2.7 | 11.2% | 10 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.4% | 2 |
| zyx.micro.Ant 1.1 | 5.8 | 8.8% | 5 |
| sanja.First 0.1 | 6.2 | 8.7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.4% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.6% | 5 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.3 | 27 / 35 | 6586 |
| 2 | 1 | 72.2 | 96.8 | 30 / 35 | 6509 |
| 3 | 1 | 72.0 | 94.9 | 28 / 35 | 6583 |
| 4 | 1 | 71.2 | 89.8 | 29 / 35 | 6573 |
| 5 | 1 | 70.9 | 88.6 | 25 / 35 | 6656 |
| 6 | 1 | 71.0 | 88.3 | 28 / 35 | 6509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 32 | 91% |
| cvt.Firsty 1.0 | 30 | 90% |
| tvv.nano.Polaris 1.2 | 29 | 100% |
| sanja.First 0.1 | 23 | 100% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 11 | 24% | 38 |
| tvv.nano.Polaris 1.2 | 7 | 16% | 52 |
| cvt.Firsty 1.0 | 6 | 13% | 30 |
| zyx.micro.Ant 1.1 | 6 | 13% | 28 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 12 |
| sanja.First 0.1 | 4 | 9% | 28 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 8 |
| sample.RamFire 1.0 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 75.6 | 102 / 210 | 3.20 | 16.9% | 31899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 16.9% | 102 |
| kc.micro.Figment 1.0 | 2.0 | 14.7% | 50 |
| cs.Wren 1.0 | 3.5 | 12.0% | 21 |
| js.PinBall 1.6 | 4.0 | 11.7% | 13 |
| mz.Cork 0.1 | 4.8 | 10.5% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 4 |
| evd.X1 0.01 | 6.7 | 8.1% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 4 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 20 / 35 | 5336 |
| 2 | 1 | 63.0 | 69.5 | 13 / 35 | 4939 |
| 3 | 1 | 66.3 | 76.5 | 14 / 35 | 5654 |
| 4 | 1 | 67.8 | 82.9 | 19 / 35 | 5687 |
| 5 | 1 | 66.6 | 76.5 | 19 / 35 | 5519 |
| 6 | 1 | 62.4 | 66.3 | 17 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 70 | 77% |
| cs.Wren 1.0 | 31 | 77% |
| js.PinBall 1.6 | 12 | 83% |
| joe.ADinosaur 1.0 | 5 | 80% |
| mz.Cork 0.1 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 33 | 31% | 95 |
| evd.X1 0.01 | 20 | 19% | 22 |
| cs.Wren 1.0 | 15 | 14% | 30 |
| joe.ADinosaur 1.0 | 15 | 14% | 18 |
| js.PinBall 1.6 | 9 | 8% | 16 |
| mz.Cork 0.1 | 7 | 6% | 14 |
| PSW.Relentless 0.1 | 5 | 5% | 4 |
| jsal.Jsalbot 1.0 | 4 | 4% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.5 | 142 / 210 | 2.40 | 19.1% | 29459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 19.1% | 142 |
| ntc.Opposite 1.5 | 3.2 | 11.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 10.6% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 3 |
| myl.nano.Graviton 1.10 | 4.3 | 10.9% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 9 |
| DBall.NUKE 0.1 | 7.0 | 8.2% | 2 |
| disan.Chair 2.2.0 | 7.7 | 7.8% | 5 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 26 / 35 | 5333 |
| 2 | 1 | 68.1 | 84.8 | 25 / 35 | 4648 |
| 3 | 1 | 67.9 | 82.5 | 22 / 35 | 4969 |
| 4 | 1 | 67.9 | 82.5 | 25 / 35 | 4747 |
| 5 | 1 | 68.3 | 83.5 | 24 / 35 | 4964 |
| 6 | 1 | 67.2 | 82.2 | 20 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 86% |
| stelo.AreaTargetingBot 1.1 | 35 | 77% |
| ntc.Opposite 1.5 | 20 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 89% |
| DBall.NUKE 0.1 | 16 | 100% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| donjezza.Muncho 1.0 | 11 | 100% |
| disan.Chair 2.2.0 | 9 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 24% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 19% | 24 |
| pfvicm.Sobieski 7.2.3b | 12 | 18% | 24 |
| myl.nano.Graviton 1.10 | 10 | 15% | 42 |
| ntc.Opposite 1.5 | 8 | 12% | 20 |
| DBall.NUKE 0.1 | 5 | 7% | 23 |
| disan.Chair 2.2.0 | 3 | 4% | 25 |
| pbg.R2D2 1.0 | 1 | 1% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 6 |

## Melee bench: F13

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.9 | 83 / 210 | 3.44 | 15.8% | 25829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.2 | 15.8% | 83 |
| oog.melee.Capulet 1.2 | 2.5 | 13.7% | 42 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.8% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 23 |
| yagami.Tidus 0.11 | 5.0 | 11.3% | 8 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 14 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 77.1 | 11 / 35 | 4317 |
| 2 | 1 | 65.4 | 77.1 | 15 / 35 | 4265 |
| 3 | 1 | 65.7 | 75.9 | 17 / 35 | 4376 |
| 4 | 1 | 62.4 | 64.1 | 14 / 35 | 4277 |
| 5 | 2 | 60.6 | 63.2 | 7 / 35 | 4045 |
| 6 | 1 | 67.1 | 79.7 | 19 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 58% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 80% |
| yagami.Tidus 0.11 | 15 | 100% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 34% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 43 |
| yagami.Tidus 0.11 | 18 | 14% | 36 |
| ejb.Polaris 1.0.1 | 16 | 13% | 21 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 28 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| kurios.DOSexe .9a | 4 | 3% | 3 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.8 | 131 / 210 | 2.81 | 17.6% | 27389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 17.6% | 131 |
| bzdp.Pansy 2.1 | 2.8 | 11.8% | 20 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 26 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 10 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 3 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 3 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 3 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 75.9 | 19 / 35 | 4307 |
| 2 | 1 | 69.3 | 89.8 | 24 / 35 | 5053 |
| 3 | 1 | 65.4 | 74.9 | 21 / 35 | 4619 |
| 4 | 1 | 64.5 | 74.0 | 20 / 35 | 4083 |
| 5 | 1 | 65.4 | 76.8 | 20 / 35 | 4502 |
| 6 | 1 | 68.9 | 87.6 | 27 / 35 | 4825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 80% |
| wee.Gem 1.8.4 | 39 | 95% |
| wompi.Quokka 1.6 | 24 | 88% |
| ratosh.Nobo 0.21 | 20 | 85% |
| m3thos.Eva00 1.1 | 10 | 100% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 19% | 43 |
| bayen.UbaMicro 1.4 | 11 | 14% | 18 |
| ratosh.Nobo 0.21 | 10 | 13% | 36 |
| maribo.FollowFire 1 | 9 | 11% | 9 |
| wee.Gem 1.8.4 | 8 | 10% | 46 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 15 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 8 |
| wompi.Quokka 1.6 | 6 | 8% | 18 |
| m3thos.Eva00 1.1 | 5 | 6% | 15 |

## Melee bench: F15

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.1 | 130 / 210 | 2.16 | 21.2% | 46247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.2 | 21.2% | 130 |
| wompi.Wallaby 5.1 | 1.8 | 17.5% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 19 |
| ayk.WallHugger 1.0 | 4.2 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.9% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 85.7 | 23 / 35 | 7593 |
| 2 | 1 | 74.3 | 95.2 | 27 / 35 | 8173 |
| 3 | 2 | 68.2 | 73.0 | 15 / 35 | 6738 |
| 4 | 1 | 71.7 | 85.7 | 20 / 35 | 7604 |
| 5 | 1 | 73.4 | 92.1 | 22 / 35 | 7911 |
| 6 | 1 | 73.4 | 91.1 | 23 / 35 | 8228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 74% |
| mz.NanoGod 2.02 | 15 | 53% |
| drd.Dreadknoght 0.9 | 13 | 100% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 4 | 75% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 51% | 137 |
| mz.NanoGod 2.02 | 22 | 27% | 32 |
| ayk.WallHugger 1.0 | 8 | 10% | 13 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 10 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 11 |

## Melee bench: F16

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.0 | 94 / 210 | 3.79 | 15.9% | 28381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 15.9% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.4% | 27 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.0% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 25 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 5 |
| conscience.Electron 1.3g | 7.0 | 8.6% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 10 |
| dl.BetterWalls 1.0 | 9.0 | 6.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.7 | 20 / 35 | 4987 |
| 2 | 1 | 61.9 | 61.6 | 15 / 35 | 4393 |
| 3 | 1 | 66.4 | 77.5 | 21 / 35 | 4842 |
| 4 | 1 | 64.4 | 70.8 | 16 / 35 | 4779 |
| 5 | 1 | 61.8 | 65.4 | 12 / 35 | 4763 |
| 6 | 1 | 61.7 | 65.1 | 10 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 84% |
| dummy.micro.Sparrow 2.5 | 19 | 89% |
| bvh.micro.Freya 0.3 | 10 | 90% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 7 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 22% | 53 |
| dummy.micro.Sparrow 2.5 | 19 | 16% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 16% | 42 |
| conscience.Electron 1.3g | 18 | 16% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 13% | 15 |
| dl.BetterWalls 1.0 | 10 | 9% | 14 |
| bvh.micro.Freya 0.3 | 9 | 8% | 15 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 10 |

## Melee bench: F17

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 88.8 | 155 / 210 | 2.00 | 21.7% | 42758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 21.7% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.4% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 7 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.0% | 13 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.4% | 0 |
| dsw.StaticD 1.0 | 5.7 | 8.4% | 9 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 4 |
| sample.Corners 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 91.7 | 27 / 35 | 7466 |
| 2 | 1 | 72.5 | 91.7 | 28 / 35 | 6953 |
| 3 | 1 | 70.6 | 81.6 | 24 / 35 | 7158 |
| 4 | 1 | 72.1 | 90.5 | 26 / 35 | 6976 |
| 5 | 1 | 73.2 | 93.7 | 28 / 35 | 7385 |
| 6 | 1 | 70.1 | 83.8 | 22 / 35 | 6820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 87% |
| supersample.SuperBoxBot 1.0 | 25 | 84% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| sample.Corners 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 32% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 27% | 55 |
| dsw.StaticD 1.0 | 8 | 14% | 17 |
| sul.Lunar 1.1 | 6 | 11% | 59 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 15 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 8 |
| sample.Corners 1.0 | 0 | 0% | 6 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWTS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.5 | 107 / 210 | 2.94 | 18.0% | 37516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTS 0.1 | 1.0 | 18.0% | 107 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 23 |
| mld.Wisdom 1.0 | 2.8 | 12.6% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.6% | 28 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.7% | 7 |
| sample.Walls 1.0 | 7.3 | 8.2% | 13 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.6 | 25 / 35 | 6585 |
| 2 | 1 | 68.2 | 81.3 | 19 / 35 | 6557 |
| 3 | 1 | 67.5 | 81.3 | 18 / 35 | 6148 |
| 4 | 1 | 65.7 | 73.7 | 12 / 35 | 5972 |
| 5 | 1 | 65.4 | 71.7 | 16 / 35 | 5815 |
| 6 | 1 | 66.2 | 74.3 | 17 / 35 | 6439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 81% |
| radnor.DoctorBob 1.42 | 31 | 74% |
| mld.Wisdom 1.0 | 22 | 77% |
| amz.NanoClone 1.41 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 29% | 47 |
| radnor.DoctorBob 1.42 | 28 | 27% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 52 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 20 |
| amz.NanoClone 1.41 | 9 | 9% | 15 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |

