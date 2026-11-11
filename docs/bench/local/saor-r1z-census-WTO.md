# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.6 | 144 / 210 | 2.03 | 21.5% | 43813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.5% | 144 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 11 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 21 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 26 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 4 |
| sample.Walls 1.0 | 6.2 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 3 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |
| sample.Target 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.4 | 26 / 35 | 6990 |
| 2 | 1 | 72.0 | 86.0 | 22 / 35 | 7439 |
| 3 | 1 | 73.7 | 91.4 | 26 / 35 | 7914 |
| 4 | 1 | 71.3 | 85.1 | 23 / 35 | 6972 |
| 5 | 1 | 71.2 | 83.8 | 21 / 35 | 6998 |
| 6 | 1 | 73.6 | 92.7 | 26 / 35 | 7500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 59 | 78% |
| mz.AntiGrav 1.0 | 50 | 96% |
| radnor.DoctorBob 1.42 | 38 | 84% |
| amz.NanoClone 1.41 | 8 | 88% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| sample.Target 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 42% | 78 |
| mld.Infinity 2.2 | 16 | 24% | 12 |
| mz.AntiGrav 1.0 | 13 | 19% | 85 |
| amz.NanoClone 1.41 | 3 | 4% | 11 |
| sample.Walls 1.0 | 3 | 4% | 10 |
| jangs.ns51 1.0 | 2 | 3% | 8 |
| GarmBox.Oranges 1.0 | 1 | 1% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.4 | 149 / 210 | 2.04 | 19.2% | 30968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.2% | 149 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.8% | 35 |
| mld.DustBunny 3.8 | 2.8 | 12.5% | 8 |
| maribo.melee.BMV 0.1 | 3.7 | 10.5% | 2 |
| zyx.nano.Ant 1.1 | 5.7 | 8.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.5% | 1 |
| bzdp.BoxCar 2.0 | 7.7 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 7.7 | 7.6% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.1% | 8 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 19 / 35 | 4968 |
| 2 | 1 | 68.7 | 87.6 | 27 / 35 | 5047 |
| 3 | 1 | 66.5 | 79.0 | 21 / 35 | 5300 |
| 4 | 1 | 70.9 | 94.9 | 29 / 35 | 5269 |
| 5 | 1 | 70.9 | 95.6 | 29 / 35 | 5204 |
| 6 | 1 | 68.7 | 87.9 | 24 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 74 | 78% |
| mld.DustBunny 3.8 | 46 | 96% |
| maribo.melee.BMV 0.1 | 16 | 100% |
| djdjdj.NanoSkunk10 1.0 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| fullsail.SweetTea 1.1 | 8 | 63% |
| zyx.nano.Ant 1.1 | 5 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 43% | 87 |
| mld.DustBunny 3.8 | 10 | 16% | 57 |
| fullsail.SweetTea 1.1 | 7 | 11% | 15 |
| djdjdj.NanoSkunk10 1.0 | 5 | 8% | 10 |
| zyx.nano.Ant 1.1 | 4 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 12 |
| bzdp.BoxCar 2.0 | 3 | 5% | 5 |
| maribo.melee.BMV 0.1 | 2 | 3% | 10 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.2 | 145 / 210 | 2.24 | 20.4% | 37342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.4% | 145 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.4% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.4% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 5 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.6% | 3 |
| sample.Fire 1.0 | 9.3 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 84.4 | 22 / 35 | 6158 |
| 2 | 1 | 72.0 | 92.4 | 29 / 35 | 6509 |
| 3 | 1 | 70.3 | 84.8 | 24 / 35 | 6313 |
| 4 | 1 | 68.0 | 76.5 | 19 / 35 | 5838 |
| 5 | 1 | 70.8 | 88.6 | 25 / 35 | 6229 |
| 6 | 1 | 71.8 | 90.5 | 26 / 35 | 6295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 91% |
| myl.nano.KomoriNinja 1.1 | 25 | 92% |
| cb.nano.Insomnia 1.0 | 14 | 100% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 6 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 27% | 79 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 25% | 38 |
| myl.nano.KomoriNinja 1.1 | 9 | 13% | 34 |
| cb.nano.Insomnia 1.0 | 9 | 13% | 11 |
| fm.mammillarias 1.3 | 5 | 7% | 10 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 17 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 10 |
| sample.Fire 1.0 | 2 | 3% | 9 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.2 | 154 / 210 | 1.98 | 21.0% | 39484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.0% | 154 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.9% | 15 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.5% | 7 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 9.6% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 8.6% | 6 |
| yk.JahMicro 1.0 | 6.5 | 8.5% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.3% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 90.5 | 27 / 35 | 6354 |
| 2 | 1 | 69.1 | 83.2 | 20 / 35 | 6454 |
| 3 | 1 | 72.1 | 93.0 | 29 / 35 | 6606 |
| 4 | 1 | 72.6 | 97.1 | 31 / 35 | 6582 |
| 5 | 1 | 70.3 | 86.0 | 25 / 35 | 6558 |
| 6 | 1 | 70.2 | 85.1 | 22 / 35 | 6930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 88% |
| stelo.SoJNanoMelee 1.1 | 45 | 78% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 14 | 79% |
| yk.JahMicro 1.0 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| sample.VelociRobot 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 20 | 35% | 47 |
| kawigi.nano.Lib 1.0 | 19 | 33% | 88 |
| tj.zombie1n 1.0.1 | 4 | 7% | 10 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 9 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 16 |
| repositorio.NanoStep 1.0 | 2 | 4% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 10 |

## Melee bench: F05

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.0 | 109 / 210 | 3.34 | 16.8% | 29872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 16.8% | 109 |
| oog.melee.Corsair 1.0 | 2.5 | 12.0% | 24 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.6% | 14 |
| EBBU.Sim2 1.02 | 4.7 | 10.3% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.4% | 15 |
| sam.Samspin 1.0 | 6.7 | 9.4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 7.1% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.2 | 17 / 35 | 4639 |
| 2 | 1 | 65.4 | 74.9 | 20 / 35 | 4930 |
| 3 | 1 | 64.7 | 72.4 | 16 / 35 | 4932 |
| 4 | 1 | 64.4 | 73.3 | 17 / 35 | 4792 |
| 5 | 1 | 66.7 | 79.4 | 21 / 35 | 5309 |
| 6 | 1 | 65.5 | 74.0 | 18 / 35 | 5270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| ahf.NanoAndrew .4 | 22 | 95% |
| oog.melee.Corsair 1.0 | 22 | 91% |
| EBBU.Sim2 1.02 | 14 | 79% |
| sam.Samspin 1.0 | 11 | 82% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sample.TrackFire 1.0 | 5 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 103 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 21% | 46 |
| robar.nano.Assertive_Melee 0.2 | 19 | 18% | 25 |
| EBBU.Sim2 1.02 | 12 | 12% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 12% | 16 |
| zyx.nano.BacillusComma 1.0 | 11 | 11% | 16 |
| ahf.NanoAndrew .4 | 9 | 9% | 28 |
| sam.Samspin 1.0 | 8 | 8% | 21 |
| oog.melee.Corsair 1.0 | 7 | 7% | 25 |
| sample.TrackFire 1.0 | 3 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.0 | 120 / 210 | 2.62 | 18.3% | 31364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 18.3% | 120 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.5% | 13 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.1% | 12 |
| fm.claire 1.7 | 5.5 | 9.0% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 6 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 9.6% | 28 |
| sample.SpinBot 1.0 | 8.0 | 7.5% | 3 |
| pa.Improved 1.0 | 9.0 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 22 / 35 | 5570 |
| 2 | 1 | 67.3 | 84.1 | 16 / 35 | 5101 |
| 3 | 1 | 66.1 | 76.5 | 18 / 35 | 5034 |
| 4 | 1 | 65.7 | 77.8 | 19 / 35 | 4587 |
| 5 | 1 | 67.6 | 80.3 | 22 / 35 | 5615 |
| 6 | 1 | 68.8 | 87.6 | 23 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 83% |
| oog.melee.CapuletDroid 1.1 | 22 | 68% |
| gh.nano.Grofvuil 0.2 | 19 | 79% |
| arthord.NanoSatanMelee Beta | 14 | 64% |
| sample.SpinBot 1.0 | 8 | 100% |
| fm.claire 1.7 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 29% | 86 |
| oog.melee.CapuletDroid 1.1 | 17 | 19% | 19 |
| gh.nano.Grofvuil 0.2 | 14 | 15% | 30 |
| arthord.NanoSatanMelee Beta | 14 | 15% | 25 |
| sample.SpinBot 1.0 | 6 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 12 |
| fm.claire 1.7 | 4 | 4% | 11 |
| kurios.DOSexe .9b | 3 | 3% | 9 |
| pa.Improved 1.0 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.6 | 114 / 210 | 2.39 | 18.8% | 34929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 18.8% | 114 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 32 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 13.9% | 34 |
| mz.MicroGodMelee 1 | 3.8 | 12.4% | 15 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 9 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.4% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 3 |
| fire219.CatBot 1.0 | 8.7 | 5.6% | 0 |
| el.JumpShoot 0.2 | 8.7 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 19 / 35 | 6161 |
| 2 | 1 | 67.8 | 81.9 | 19 / 35 | 5569 |
| 3 | 1 | 66.9 | 78.4 | 19 / 35 | 5524 |
| 4 | 1 | 69.6 | 86.3 | 16 / 35 | 6420 |
| 5 | 1 | 69.4 | 89.8 | 23 / 35 | 5409 |
| 6 | 1 | 68.6 | 83.8 | 18 / 35 | 5846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 64% |
| mz.MicroGodMelee 1 | 39 | 77% |
| gh.micro.Gruweltje 0.7 | 35 | 63% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 7 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 33% | 69 |
| gh.micro.Gruweltje 0.7 | 28 | 29% | 63 |
| mz.MicroGodMelee 1 | 22 | 23% | 41 |
| acogdev.alpha 0.2 | 7 | 7% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 9 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 5 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.7 | 96 / 210 | 3.90 | 15.7% | 29437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 15.7% | 96 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.5% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 34 |
| germ.TheMind .2 | 4.2 | 10.0% | 8 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 3 |
| awesomeness.Elite 1.0 | 7.2 | 8.2% | 6 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 8 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 65.7 | 13 / 35 | 4892 |
| 2 | 1 | 67.4 | 77.1 | 20 / 35 | 5764 |
| 3 | 1 | 59.9 | 60.6 | 14 / 35 | 4150 |
| 4 | 1 | 62.9 | 63.5 | 16 / 35 | 5078 |
| 5 | 1 | 63.1 | 68.3 | 15 / 35 | 4810 |
| 6 | 1 | 64.3 | 71.1 | 18 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| germ.TheMind .2 | 7 | 71% |
| awesomeness.Elite 1.0 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 43% | 100 |
| germ.TheMind .2 | 19 | 17% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 16% | 34 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 13 |
| awesomeness.Elite 1.0 | 6 | 5% | 11 |
| sample.Crazy 1.0 | 5 | 4% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 5 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.2 | 157 / 210 | 1.97 | 20.1% | 30334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.1% | 157 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.4% | 13 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 2 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 2 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 7.5% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 7.3% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.8 | 24 / 35 | 4608 |
| 2 | 1 | 70.2 | 89.2 | 24 / 35 | 4943 |
| 3 | 1 | 71.5 | 91.7 | 28 / 35 | 5419 |
| 4 | 1 | 71.8 | 94.6 | 29 / 35 | 4970 |
| 5 | 1 | 69.7 | 85.7 | 24 / 35 | 5108 |
| 6 | 1 | 71.3 | 90.2 | 28 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 94% |
| nz.jdc.nano.GridFu 1.0 | 36 | 94% |
| stelo.PatternRobot 1.0 | 15 | 80% |
| timmit.nano.TimDog 0.33 | 12 | 100% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 20% | 72 |
| timmit.nano.TimDog 0.33 | 10 | 19% | 20 |
| nz.jdc.nano.GridFu 1.0 | 9 | 17% | 52 |
| stelo.PatternRobot 1.0 | 8 | 15% | 16 |
| ratosh.Wesco 1.4 | 6 | 11% | 15 |
| maribo.IotaCT 1.1 | 4 | 7% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 7 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.3 | 169 / 210 | 1.96 | 21.0% | 37929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.0% | 169 |
| baal.nano.N 1.42 | 2.5 | 12.2% | 10 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.6% | 12 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.0% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 9 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.2% | 3 |
| sanja.First 0.1 | 6.5 | 8.4% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 5 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.0 | 24 / 35 | 6009 |
| 2 | 1 | 70.5 | 87.3 | 25 / 35 | 6599 |
| 3 | 1 | 71.4 | 90.2 | 28 / 35 | 6413 |
| 4 | 1 | 72.8 | 94.6 | 32 / 35 | 6695 |
| 5 | 1 | 72.1 | 93.3 | 31 / 35 | 6406 |
| 6 | 1 | 70.3 | 89.5 | 29 / 35 | 5807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 100% |
| cvt.Firsty 1.0 | 34 | 85% |
| tvv.nano.Polaris 1.2 | 25 | 96% |
| Grystrion.TrackerWO 1.0 | 20 | 100% |
| sanja.First 0.1 | 19 | 100% |
| zyx.micro.Ant 1.1 | 18 | 83% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 29% | 39 |
| tvv.nano.Polaris 1.2 | 6 | 15% | 41 |
| cvt.Firsty 1.0 | 6 | 15% | 32 |
| Grystrion.TrackerWO 1.0 | 5 | 12% | 26 |
| baal.nano.N 1.42 | 4 | 10% | 31 |
| sample.RamFire 1.0 | 4 | 10% | 7 |
| sanja.First 0.1 | 2 | 5% | 19 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 10 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 66.2 | 79 / 210 | 4.04 | 15.1% | 30754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.3 | 15.1% | 79 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 71 |
| cs.Wren 1.0 | 3.2 | 12.8% | 20 |
| mz.Cork 0.1 | 4.2 | 11.5% | 11 |
| js.PinBall 1.6 | 4.5 | 11.3% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 9.8% | 4 |
| evd.X1 0.01 | 7.0 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.3% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.7 | 61.9 | 10 / 35 | 4849 |
| 2 | 1 | 61.5 | 63.8 | 15 / 35 | 4879 |
| 3 | 2 | 63.4 | 68.9 | 13 / 35 | 5080 |
| 4 | 1 | 63.7 | 69.8 | 11 / 35 | 5172 |
| 5 | 1 | 63.3 | 66.7 | 17 / 35 | 5242 |
| 6 | 2 | 63.2 | 66.0 | 13 / 35 | 5532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 71% |
| cs.Wren 1.0 | 20 | 70% |
| mz.Cork 0.1 | 9 | 100% |
| js.PinBall 1.6 | 6 | 67% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 42% | 103 |
| js.PinBall 1.6 | 18 | 14% | 20 |
| cs.Wren 1.0 | 15 | 11% | 30 |
| evd.X1 0.01 | 15 | 11% | 15 |
| joe.ADinosaur 1.0 | 11 | 8% | 13 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| mz.Cork 0.1 | 7 | 5% | 13 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.8 | 129 / 210 | 2.37 | 18.8% | 28741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 18.8% | 129 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 11.2% | 25 |
| ntc.Opposite 1.5 | 3.5 | 11.2% | 14 |
| myl.nano.Graviton 1.10 | 3.7 | 11.3% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.3% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.6% | 1 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 4 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 6 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 23 / 35 | 5225 |
| 2 | 1 | 69.9 | 91.7 | 24 / 35 | 4853 |
| 3 | 1 | 68.8 | 85.7 | 26 / 35 | 4939 |
| 4 | 1 | 65.7 | 77.5 | 17 / 35 | 4609 |
| 5 | 1 | 66.5 | 81.6 | 20 / 35 | 4278 |
| 6 | 1 | 67.7 | 84.4 | 19 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 84% |
| stelo.AreaTargetingBot 1.1 | 36 | 64% |
| disan.Chair 2.2.0 | 20 | 95% |
| DBall.NUKE 0.1 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| ntc.Opposite 1.5 | 13 | 54% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| donjezza.Muncho 1.0 | 11 | 82% |

Hadur died in 82 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 24 | 29% | 49 |
| ntc.Opposite 1.5 | 14 | 17% | 22 |
| myl.nano.Graviton 1.10 | 13 | 16% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 22 |
| pfvicm.Sobieski 7.2.3b | 7 | 9% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 17 |
| disan.Chair 2.2.0 | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 22 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.0 | 79 / 210 | 3.79 | 15.2% | 26057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.5 | 15.2% | 79 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 46 |
| oog.melee.Capulet 1.2 | 2.8 | 13.6% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.1% | 27 |
| yagami.Tidus 0.11 | 5.3 | 11.1% | 5 |
| ejb.Polaris 1.0.1 | 5.3 | 11.0% | 13 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 60.6 | 13 / 35 | 4171 |
| 2 | 2 | 63.0 | 68.3 | 14 / 35 | 4100 |
| 3 | 1 | 63.7 | 70.5 | 13 / 35 | 4161 |
| 4 | 1 | 61.8 | 64.4 | 11 / 35 | 4165 |
| 5 | 1 | 65.9 | 75.9 | 13 / 35 | 4906 |
| 6 | 1 | 65.7 | 74.6 | 15 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 86% |
| oog.melee.Capulet 1.2 | 25 | 80% |
| kawigi.micro.Shiz 1.1 | 25 | 72% |
| yagami.Tidus 0.11 | 11 | 100% |
| ejb.Polaris 1.0.1 | 9 | 56% |

Hadur died in 131 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 31% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 20% | 56 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 29 |
| yagami.Tidus 0.11 | 17 | 13% | 27 |
| ejb.Polaris 1.0.1 | 17 | 13% | 27 |
| kurios.DOSexe .9a | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.2 | 133 / 210 | 3.05 | 17.3% | 26642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 17.3% | 133 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 24 |
| wee.Gem 1.8.4 | 2.8 | 12.2% | 19 |
| wompi.Quokka 1.6 | 4.0 | 11.0% | 12 |
| ratosh.Nobo 0.21 | 5.0 | 10.6% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 10 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 2 |
| maribo.FollowFire 1 | 9.3 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 76.2 | 23 / 35 | 4464 |
| 2 | 1 | 66.4 | 79.7 | 23 / 35 | 4558 |
| 3 | 1 | 69.2 | 89.2 | 26 / 35 | 4751 |
| 4 | 1 | 65.0 | 70.5 | 20 / 35 | 4611 |
| 5 | 1 | 62.8 | 70.2 | 19 / 35 | 3818 |
| 6 | 1 | 65.9 | 77.8 | 22 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 51 | 94% |
| bzdp.Pansy 2.1 | 43 | 84% |
| wompi.Quokka 1.6 | 18 | 94% |
| ratosh.Nobo 0.21 | 15 | 100% |
| m3thos.Eva00 1.1 | 8 | 88% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| maribo.FollowFire 1 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 386. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 19% | 46 |
| wee.Gem 1.8.4 | 12 | 16% | 60 |
| maribo.FollowFire 1 | 12 | 16% | 12 |
| bayen.UbaMicro 1.4 | 11 | 14% | 18 |
| wompi.Quokka 1.6 | 8 | 10% | 22 |
| ratosh.Nobo 0.21 | 6 | 8% | 20 |
| m3thos.Eva00 1.1 | 6 | 8% | 15 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 86.5 | 71 / 210 | 2.22 | 20.2% | 47391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.2 | 20.2% | 71 |
| wompi.Wallaby 5.1 | 1.8 | 19.3% | 119 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 13 |
| ayk.WallHugger 1.0 | 4.3 | 9.9% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.0% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.8% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 88.6 | 15 / 35 | 7637 |
| 2 | 1 | 72.8 | 90.8 | 14 / 35 | 8379 |
| 3 | 1 | 71.3 | 87.0 | 15 / 35 | 7440 |
| 4 | 1 | 71.4 | 85.4 | 10 / 35 | 8403 |
| 5 | 2 | 69.3 | 79.7 | 7 / 35 | 7353 |
| 6 | 1 | 71.4 | 87.3 | 10 / 35 | 8179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 21% |
| mz.NanoGod 2.02 | 20 | 70% |
| exauge.GateKeeper 1.1.121g | 16 | 81% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 105 | 76% | 141 |
| mz.NanoGod 2.02 | 16 | 12% | 34 |
| exauge.GateKeeper 1.1.121g | 8 | 6% | 13 |
| ayk.WallHugger 1.0 | 7 | 5% | 11 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.1 | 100 / 210 | 3.87 | 15.9% | 28365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 15.9% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 27 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.2% | 22 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 18 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.9% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 62.2 | 16 / 35 | 4656 |
| 2 | 1 | 61.7 | 63.8 | 15 / 35 | 4634 |
| 3 | 1 | 64.3 | 71.1 | 18 / 35 | 4708 |
| 4 | 1 | 65.7 | 75.2 | 18 / 35 | 5009 |
| 5 | 1 | 64.6 | 71.1 | 17 / 35 | 4866 |
| 6 | 1 | 62.5 | 65.4 | 16 / 35 | 4492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 71% |
| dummy.micro.Sparrow 2.5 | 29 | 93% |
| bvh.micro.Freya 0.3 | 23 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 88% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 46 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 21% | 21 |
| conscience.Electron 1.3g | 16 | 15% | 22 |
| dl.BetterWalls 1.0 | 14 | 13% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 9% | 32 |
| dummy.micro.Sparrow 2.5 | 9 | 8% | 34 |
| bvh.micro.Freya 0.3 | 9 | 8% | 19 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 13 |

## Melee bench: F17

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 85.7 | 144 / 210 | 2.29 | 20.6% | 39961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.6% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 19 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 15 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.0% | 6 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 3 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 4 |
| sample.Corners 1.0 | 9.0 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 78.7 | 23 / 35 | 5965 |
| 2 | 1 | 70.1 | 86.0 | 22 / 35 | 6620 |
| 3 | 1 | 72.7 | 90.5 | 27 / 35 | 7382 |
| 4 | 1 | 70.3 | 84.1 | 26 / 35 | 6181 |
| 5 | 1 | 72.3 | 94.0 | 25 / 35 | 6951 |
| 6 | 1 | 69.7 | 81.0 | 21 / 35 | 6862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 90% |
| sul.Lunar 1.1 | 41 | 100% |
| supersample.SuperBoxBot 1.0 | 25 | 68% |
| dsw.StaticD 1.0 | 18 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 57% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |

Hadur died in 67 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 34% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 22% | 63 |
| dsw.StaticD 1.0 | 9 | 13% | 22 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 13 |
| sul.Lunar 1.1 | 4 | 6% | 55 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 7 |
| sample.Corners 1.0 | 2 | 3% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 84.1 | 134 / 210 | 2.43 | 19.6% | 40061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.6% | 134 |
| radnor.DoctorBob 1.42 | 2.0 | 13.4% | 27 |
| mld.Wisdom 1.0 | 3.7 | 11.2% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.0% | 11 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 5 |
| amz.NanoClone 1.41 | 5.3 | 9.8% | 10 |
| sample.Walls 1.0 | 7.0 | 7.5% | 4 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.7 | 23 / 35 | 6551 |
| 2 | 1 | 69.4 | 84.8 | 23 / 35 | 6408 |
| 3 | 1 | 70.8 | 89.8 | 24 / 35 | 6957 |
| 4 | 1 | 67.1 | 77.5 | 19 / 35 | 6002 |
| 5 | 1 | 69.7 | 83.2 | 22 / 35 | 6855 |
| 6 | 1 | 69.8 | 83.5 | 23 / 35 | 7288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 93% |
| radnor.DoctorBob 1.42 | 40 | 88% |
| mld.Wisdom 1.0 | 21 | 81% |
| KiraNL.Chupacabra 0.4 | 20 | 85% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 100% |
| sample.Target 1.0 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 21 | 27% | 38 |
| radnor.DoctorBob 1.42 | 19 | 24% | 58 |
| KiraNL.Chupacabra 0.4 | 15 | 19% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 14% | 55 |
| amz.NanoClone 1.41 | 5 | 6% | 7 |
| sample.Walls 1.0 | 3 | 4% | 4 |
| jangs.ns51 1.0 | 2 | 3% | 10 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |

