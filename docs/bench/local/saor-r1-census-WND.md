# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 92.3 | 158 / 210 | 1.69 | 22.0% | 44501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 22.0% | 158 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 16 |
| mld.Infinity 2.2 | 3.8 | 12.2% | 7 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 6 |
| GarmBox.Oranges 1.0 | 6.7 | 7.0% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 2 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.2 | 28 / 35 | 7081 |
| 2 | 1 | 73.6 | 95.9 | 28 / 35 | 7363 |
| 3 | 1 | 70.5 | 84.1 | 20 / 35 | 7155 |
| 4 | 1 | 73.5 | 94.3 | 27 / 35 | 7560 |
| 5 | 1 | 72.0 | 88.9 | 26 / 35 | 7208 |
| 6 | 1 | 74.5 | 95.6 | 29 / 35 | 8134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 78 | 91% |
| radnor.DoctorBob 1.42 | 43 | 93% |
| mld.Infinity 2.2 | 33 | 94% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 16 | 31% | 73 |
| radnor.DoctorBob 1.42 | 16 | 31% | 57 |
| mld.Infinity 2.2 | 6 | 12% | 34 |
| amz.NanoClone 1.41 | 5 | 10% | 14 |
| sample.Walls 1.0 | 4 | 8% | 12 |
| jangs.ns51 1.0 | 3 | 6% | 8 |
| GarmBox.Oranges 1.0 | 2 | 4% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.3 | 103 / 210 | 2.78 | 17.6% | 30969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.3 | 17.6% | 103 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.4% | 60 |
| mld.DustBunny 3.8 | 2.5 | 13.7% | 19 |
| maribo.melee.BMV 0.1 | 4.3 | 10.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.6% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.2% | 13 |
| zyx.nano.Ant 1.1 | 6.7 | 8.2% | 1 |
| fullsail.SweetTea 1.1 | 7.7 | 6.6% | 4 |
| bzdp.BoxCar 2.0 | 8.8 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 16 / 35 | 5586 |
| 2 | 1 | 66.9 | 80.6 | 18 / 35 | 5141 |
| 3 | 1 | 68.6 | 87.6 | 20 / 35 | 5416 |
| 4 | 3 | 60.0 | 54.0 | 10 / 35 | 4745 |
| 5 | 1 | 68.1 | 86.3 | 19 / 35 | 4869 |
| 6 | 1 | 68.5 | 87.3 | 20 / 35 | 5212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 70% |
| mld.DustBunny 3.8 | 49 | 84% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 25% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 38% | 83 |
| mld.DustBunny 3.8 | 23 | 21% | 53 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 8% | 14 |
| maribo.melee.BMV 0.1 | 8 | 7% | 12 |
| zyx.nano.Ant 1.1 | 8 | 7% | 11 |
| fullsail.SweetTea 1.1 | 7 | 7% | 12 |
| cs.Grudge 1.0 | 5 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 16 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.4 | 128 / 210 | 2.49 | 19.7% | 37039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 19.7% | 128 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.6% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.1% | 24 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.7% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 3 |
| sample.Fire 1.0 | 9.2 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.6 | 22 / 35 | 6001 |
| 2 | 1 | 69.6 | 81.3 | 19 / 35 | 6673 |
| 3 | 1 | 71.0 | 87.9 | 24 / 35 | 6502 |
| 4 | 1 | 70.0 | 84.1 | 22 / 35 | 6112 |
| 5 | 1 | 68.0 | 77.8 | 21 / 35 | 5676 |
| 6 | 1 | 69.3 | 81.9 | 20 / 35 | 6075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 94% |
| cb.nano.Insomnia 1.0 | 31 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 84% |
| myl.nano.KomoriNinja 1.1 | 12 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 30 | 37% | 87 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 27% | 46 |
| fm.mammillarias 1.3 | 11 | 13% | 15 |
| cb.nano.Insomnia 1.0 | 8 | 10% | 13 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 20 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 11 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 14 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.0 | 156 / 210 | 1.81 | 21.3% | 40302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 21.3% | 156 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.5% | 26 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.1% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 8.9% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.0 | 8.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 5 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.1 | 26 / 35 | 6619 |
| 2 | 1 | 72.0 | 92.4 | 26 / 35 | 7152 |
| 3 | 1 | 71.6 | 93.7 | 28 / 35 | 6428 |
| 4 | 1 | 72.0 | 93.7 | 29 / 35 | 6710 |
| 5 | 1 | 68.2 | 81.0 | 19 / 35 | 6293 |
| 6 | 1 | 72.3 | 93.3 | 28 / 35 | 7100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 88% |
| stelo.SoJNanoMelee 1.1 | 47 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| tj.zombie1n 1.0.1 | 13 | 100% |
| yk.JahMicro 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 31 | 57% | 90 |
| stelo.SoJNanoMelee 1.1 | 11 | 20% | 39 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 21 |
| repositorio.NanoStep 1.0 | 3 | 6% | 11 |
| tj.zombie1n 1.0.1 | 3 | 6% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 22 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 6 |
| yk.JahMicro 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 72.3 | 102 / 210 | 3.50 | 16.1% | 28602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 16.1% | 102 |
| oog.melee.Corsair 1.0 | 2.5 | 12.1% | 27 |
| ahf.NanoAndrew .4 | 3.8 | 11.7% | 22 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.9% | 18 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 11 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.3% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.4% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 70.5 | 18 / 35 | 4897 |
| 2 | 1 | 64.4 | 72.7 | 18 / 35 | 4582 |
| 3 | 1 | 62.8 | 69.8 | 15 / 35 | 4688 |
| 4 | 1 | 62.2 | 69.2 | 12 / 35 | 4540 |
| 5 | 1 | 65.1 | 76.5 | 19 / 35 | 4888 |
| 6 | 1 | 65.2 | 74.9 | 20 / 35 | 5007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 67% |
| simonton.nano.MeleeSeed 1.8 | 27 | 93% |
| ahf.NanoAndrew .4 | 20 | 75% |
| EBBU.Sim2 1.02 | 14 | 86% |
| sam.Samspin 1.0 | 14 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 24 | 22% | 33 |
| oog.melee.Corsair 1.0 | 19 | 17% | 42 |
| simonton.nano.MeleeSeed 1.8 | 19 | 17% | 37 |
| ahf.NanoAndrew .4 | 13 | 12% | 36 |
| EBBU.Sim2 1.02 | 10 | 9% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 10 |
| sam.Samspin 1.0 | 6 | 5% | 13 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 12 |
| sample.TrackFire 1.0 | 4 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.6 | 129 / 210 | 2.30 | 19.1% | 33017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 19.1% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 44 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 9 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.5% | 9 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.5% | 6 |
| fm.claire 1.7 | 6.3 | 8.5% | 4 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 3 |
| pa.Improved 1.0 | 9.0 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.8 | 25 / 35 | 5746 |
| 2 | 1 | 68.7 | 85.1 | 19 / 35 | 5635 |
| 3 | 1 | 69.7 | 89.8 | 23 / 35 | 5629 |
| 4 | 1 | 70.2 | 87.9 | 24 / 35 | 6023 |
| 5 | 1 | 65.9 | 76.8 | 18 / 35 | 5216 |
| 6 | 1 | 67.0 | 84.1 | 20 / 35 | 4768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 75% |
| oog.melee.CapuletDroid 1.1 | 39 | 100% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 3 | 67% |

Hadur died in 81 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 37% | 78 |
| arthord.NanoSatanMelee Beta | 14 | 17% | 21 |
| fm.claire 1.7 | 9 | 11% | 14 |
| sample.SpinBot 1.0 | 9 | 11% | 12 |
| gh.nano.Grofvuil 0.2 | 8 | 10% | 22 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 42 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 11 |
| pa.Improved 1.0 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.6 | 97 / 210 | 2.56 | 18.2% | 34189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 18.2% | 97 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.4% | 26 |
| mz.MicroGodMelee 1 | 3.0 | 14.0% | 44 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.6% | 7 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 1 |
| el.JumpShoot 0.2 | 8.5 | 6.1% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.9 | 15 / 35 | 5720 |
| 2 | 1 | 68.2 | 85.7 | 14 / 35 | 5887 |
| 3 | 1 | 69.2 | 85.4 | 21 / 35 | 5982 |
| 4 | 1 | 65.8 | 76.5 | 12 / 35 | 5491 |
| 5 | 1 | 68.4 | 85.1 | 17 / 35 | 5806 |
| 6 | 1 | 67.4 | 80.3 | 18 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 88% |
| mz.MicroGodMelee 1 | 47 | 49% |
| gh.micro.Gruweltje 0.7 | 16 | 75% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| acogdev.alpha 0.2 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 42 | 37% | 67 |
| spinnercat.micro.Tyger 0.1 | 26 | 23% | 66 |
| gh.micro.Gruweltje 0.7 | 23 | 20% | 37 |
| caimano.Furia_Ceca 0.22 | 10 | 9% | 10 |
| acogdev.alpha 0.2 | 5 | 4% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 10 |

## Melee bench: F08

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.7 | 104 / 210 | 3.73 | 16.1% | 30721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.2 | 16.1% | 104 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 32 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 10.0% | 8 |
| germ.TheMind .2 | 4.8 | 9.9% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 7 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 8 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.1% | 5 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 66.3 | 15 / 35 | 5000 |
| 2 | 1 | 63.6 | 65.7 | 16 / 35 | 5334 |
| 3 | 1 | 67.7 | 83.8 | 21 / 35 | 5474 |
| 4 | 1 | 64.5 | 71.1 | 16 / 35 | 5085 |
| 5 | 1 | 64.6 | 69.8 | 17 / 35 | 5260 |
| 6 | 2 | 61.8 | 61.3 | 19 / 35 | 4568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 96% |
| germ.TheMind .2 | 11 | 100% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 40% | 86 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 20% | 40 |
| stelo.UntouchableNano 1.3 | 13 | 12% | 19 |
| germ.TheMind .2 | 10 | 9% | 20 |
| awesomeness.Elite 1.0 | 7 | 7% | 17 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 9 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.1 | 146 / 210 | 2.07 | 19.8% | 30594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 19.8% | 146 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.4% | 16 |
| maribo.IotaCT 1.1 | 3.8 | 11.2% | 8 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.7% | 1 |
| stelo.PatternRobot 1.0 | 7.3 | 7.9% | 7 |
| ratosh.Wesco 1.4 | 7.5 | 8.0% | 3 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.7 | 28 / 35 | 5173 |
| 2 | 1 | 70.1 | 86.7 | 25 / 35 | 4882 |
| 3 | 1 | 71.0 | 92.7 | 26 / 35 | 5132 |
| 4 | 1 | 68.9 | 83.2 | 20 / 35 | 5422 |
| 5 | 1 | 68.1 | 84.1 | 22 / 35 | 4624 |
| 6 | 1 | 70.9 | 90.5 | 25 / 35 | 5361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 95% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 16 | 94% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| maribo.IotaCT 1.1 | 13 | 85% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 16 | 25% | 31 |
| rz.HawkOnFire 0.1 | 14 | 22% | 62 |
| stelo.PatternRobot 1.0 | 9 | 14% | 20 |
| ratosh.Wesco 1.4 | 7 | 11% | 13 |
| nz.jdc.nano.GridFu 1.0 | 6 | 9% | 44 |
| maribo.IotaCT 1.1 | 6 | 9% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| spinnercat.Omen 1.0 | 2 | 3% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.0 | 157 / 210 | 2.08 | 20.3% | 36942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 20.3% | 157 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.6% | 17 |
| Grystrion.TrackerWO 1.0 | 3.3 | 10.7% | 3 |
| baal.nano.N 1.42 | 4.2 | 10.4% | 5 |
| zyx.micro.Ant 1.1 | 5.0 | 10.0% | 18 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.5% | 1 |
| sanja.First 0.1 | 7.2 | 7.9% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 3 |
| cvt.Firsty 1.0 | 8.2 | 7.3% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.0 | 28 / 35 | 6296 |
| 2 | 1 | 69.1 | 82.9 | 23 / 35 | 6024 |
| 3 | 1 | 72.0 | 94.3 | 31 / 35 | 6733 |
| 4 | 1 | 69.4 | 86.7 | 25 / 35 | 5920 |
| 5 | 1 | 69.1 | 84.8 | 26 / 35 | 5978 |
| 6 | 1 | 69.3 | 85.7 | 24 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 95% |
| baal.nano.N 1.42 | 31 | 97% |
| cvt.Firsty 1.0 | 21 | 95% |
| Grystrion.TrackerWO 1.0 | 21 | 100% |
| zyx.micro.Ant 1.1 | 19 | 63% |
| sanja.First 0.1 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 90% |

Hadur died in 53 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 21 | 40% | 39 |
| Grystrion.TrackerWO 1.0 | 8 | 15% | 30 |
| sample.RamFire 1.0 | 7 | 13% | 7 |
| tvv.nano.Polaris 1.2 | 6 | 11% | 54 |
| cvt.Firsty 1.0 | 4 | 8% | 17 |
| baal.nano.N 1.42 | 3 | 6% | 31 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 11 |
| sanja.First 0.1 | 1 | 2% | 19 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.9 | 86 / 210 | 3.44 | 16.3% | 31938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.2 | 16.3% | 86 |
| kc.micro.Figment 1.0 | 2.3 | 14.3% | 59 |
| cs.Wren 1.0 | 2.8 | 12.9% | 24 |
| js.PinBall 1.6 | 4.2 | 11.3% | 15 |
| mz.Cork 0.1 | 4.5 | 10.7% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 8.9% | 3 |
| evd.X1 0.01 | 7.2 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 7.8 | 7.1% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 6 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 68.3 | 13 / 35 | 5193 |
| 2 | 1 | 66.3 | 79.4 | 15 / 35 | 5512 |
| 3 | 2 | 62.1 | 66.0 | 12 / 35 | 4893 |
| 4 | 1 | 66.0 | 73.0 | 15 / 35 | 5761 |
| 5 | 1 | 67.9 | 83.5 | 18 / 35 | 5558 |
| 6 | 1 | 62.1 | 67.0 | 13 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 71% |
| cs.Wren 1.0 | 27 | 70% |
| mz.Cork 0.1 | 9 | 67% |
| js.PinBall 1.6 | 7 | 71% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| joe.ADinosaur 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 40% | 91 |
| cs.Wren 1.0 | 27 | 22% | 42 |
| joe.ADinosaur 1.0 | 14 | 11% | 14 |
| evd.X1 0.01 | 11 | 9% | 13 |
| mz.Cork 0.1 | 8 | 6% | 15 |
| js.PinBall 1.6 | 6 | 5% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| jsal.Jsalbot 1.0 | 3 | 2% | 10 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.0 | 133 / 210 | 2.44 | 19.0% | 30080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 19.0% | 133 |
| myl.nano.Graviton 1.10 | 2.5 | 12.0% | 23 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 11.0% | 18 |
| ntc.Opposite 1.5 | 4.3 | 10.4% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 5.8 | 9.9% | 3 |
| DBall.NUKE 0.1 | 6.8 | 8.4% | 7 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 8 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 8 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 24 / 35 | 5084 |
| 2 | 1 | 65.7 | 76.8 | 17 / 35 | 4724 |
| 3 | 1 | 66.8 | 78.4 | 20 / 35 | 5054 |
| 4 | 1 | 68.5 | 86.0 | 23 / 35 | 4979 |
| 5 | 1 | 68.4 | 84.4 | 22 / 35 | 4975 |
| 6 | 1 | 70.7 | 92.7 | 27 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 82% |
| myl.nano.Graviton 1.10 | 29 | 100% |
| ntc.Opposite 1.5 | 20 | 95% |
| disan.Chair 2.2.0 | 17 | 71% |
| DBall.NUKE 0.1 | 14 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 25% | 55 |
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 24 |
| stelo.AreaTargetingBot 1.1 | 14 | 18% | 39 |
| ntc.Opposite 1.5 | 7 | 9% | 22 |
| disan.Chair 2.2.0 | 6 | 8% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 6% | 18 |
| DBall.NUKE 0.1 | 4 | 5% | 18 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |
| donjezza.Muncho 1.0 | 2 | 3% | 12 |

## Melee bench: F13

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.5 | 60 / 210 | 3.83 | 14.8% | 25805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.7 | 14.6% | 56 |
| hadur117.micro.SaorWND 0.1 | 2.0 | 14.8% | 60 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.7% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.9% | 36 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.1 | 63.5 | 6 / 35 | 4206 |
| 2 | 1 | 64.9 | 75.6 | 10 / 35 | 4571 |
| 3 | 1 | 62.7 | 68.9 | 9 / 35 | 4088 |
| 4 | 2 | 63.1 | 67.3 | 12 / 35 | 4380 |
| 5 | 2 | 63.9 | 70.2 | 13 / 35 | 4331 |
| 6 | 2 | 62.0 | 65.7 | 10 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 53% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| yagami.Tidus 0.11 | 17 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 69% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 38% | 77 |
| yagami.Tidus 0.11 | 32 | 21% | 42 |
| kawigi.micro.Shiz 1.1 | 19 | 13% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 10% | 27 |
| stelo.MirrorNano 1.3 | 11 | 7% | 12 |
| ejb.Polaris 1.0.1 | 7 | 5% | 9 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.4 | 134 / 210 | 2.76 | 17.7% | 26999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 17.7% | 134 |
| bzdp.Pansy 2.1 | 2.5 | 11.7% | 16 |
| wee.Gem 1.8.4 | 3.0 | 11.7% | 21 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 14 |
| ratosh.Nobo 0.21 | 4.5 | 10.9% | 10 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 6.7 | 9.1% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.6 | 20 / 35 | 4305 |
| 2 | 1 | 65.6 | 79.4 | 22 / 35 | 4434 |
| 3 | 1 | 67.1 | 84.4 | 22 / 35 | 4443 |
| 4 | 1 | 67.7 | 83.2 | 24 / 35 | 4947 |
| 5 | 1 | 65.9 | 77.1 | 23 / 35 | 4462 |
| 6 | 1 | 66.1 | 77.8 | 23 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 95% |
| wee.Gem 1.8.4 | 37 | 100% |
| m3thos.Eva00 1.1 | 15 | 87% |
| wompi.Quokka 1.6 | 14 | 100% |
| ratosh.Nobo 0.21 | 13 | 85% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| stelo.MyAgileRobot 0.2 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.MyAgileRobot 0.2 | 14 | 18% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 13% | 15 |
| bzdp.Pansy 2.1 | 9 | 12% | 41 |
| m3thos.Eva00 1.1 | 8 | 10% | 22 |
| bayen.UbaMicro 1.4 | 8 | 10% | 16 |
| wee.Gem 1.8.4 | 7 | 9% | 53 |
| wompi.Quokka 1.6 | 7 | 9% | 20 |
| ratosh.Nobo 0.21 | 7 | 9% | 13 |
| maribo.FollowFire 1 | 7 | 9% | 10 |

## Melee bench: F15

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.5 | 130 / 210 | 2.22 | 20.8% | 45032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 20.8% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 60 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 14 |
| ayk.WallHugger 1.0 | 4.0 | 10.2% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.1% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 85.7 | 17 / 35 | 7285 |
| 2 | 1 | 72.5 | 89.8 | 26 / 35 | 7204 |
| 3 | 1 | 72.4 | 89.2 | 21 / 35 | 7647 |
| 4 | 1 | 71.1 | 81.6 | 20 / 35 | 7576 |
| 5 | 1 | 70.9 | 82.5 | 21 / 35 | 7299 |
| 6 | 1 | 73.4 | 89.8 | 25 / 35 | 8021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 118 | 80% |
| mz.NanoGod 2.02 | 14 | 71% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| ayk.WallHugger 1.0 | 8 | 88% |
| stuff.Vlad 0.1 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 51% | 138 |
| mz.NanoGod 2.02 | 16 | 20% | 32 |
| ayk.WallHugger 1.0 | 14 | 17% | 19 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 10 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 8 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.6 | 91 / 210 | 3.82 | 15.8% | 29203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.3 | 15.8% | 91 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 26 |
| dummy.micro.Sparrow 2.5 | 2.5 | 12.8% | 33 |
| bvh.micro.Freya 0.3 | 4.2 | 10.8% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.2% | 16 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 9 |
| conscience.Electron 1.3g | 6.7 | 8.8% | 4 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 11 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 72.7 | 19 / 35 | 5315 |
| 2 | 1 | 64.2 | 71.1 | 17 / 35 | 4942 |
| 3 | 1 | 65.1 | 73.0 | 16 / 35 | 5196 |
| 4 | 1 | 65.8 | 74.3 | 18 / 35 | 5220 |
| 5 | 1 | 62.5 | 67.9 | 12 / 35 | 4514 |
| 6 | 3 | 56.6 | 52.7 | 9 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 91% |
| dummy.micro.Sparrow 2.5 | 21 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 94% |
| bvh.micro.Freya 0.3 | 12 | 83% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 24% | 67 |
| mn.nano.perceptual.Impact 1.3.0 | 22 | 18% | 21 |
| dummy.micro.Sparrow 2.5 | 18 | 15% | 38 |
| conscience.Electron 1.3g | 15 | 13% | 16 |
| bvh.micro.Freya 0.3 | 12 | 10% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 8% | 29 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 12 |
| dl.BetterWalls 1.0 | 7 | 6% | 9 |

## Melee bench: F17

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 84.7 | 131 / 210 | 2.38 | 20.3% | 39953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 20.3% | 131 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 22 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.7% | 18 |
| sul.Lunar 1.1 | 3.8 | 11.3% | 16 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.1% | 7 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.5% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 4 |
| sample.Corners 1.0 | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 88.6 | 26 / 35 | 6915 |
| 2 | 1 | 70.4 | 83.8 | 22 / 35 | 6727 |
| 3 | 1 | 71.2 | 87.0 | 25 / 35 | 6682 |
| 4 | 1 | 69.6 | 84.4 | 19 / 35 | 6403 |
| 5 | 1 | 68.3 | 78.4 | 16 / 35 | 6287 |
| 6 | 1 | 70.7 | 85.7 | 23 / 35 | 6939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 80% |
| sul.Lunar 1.1 | 39 | 95% |
| supersample.SuperBoxBot 1.0 | 33 | 76% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| sample.Corners 1.0 | 7 | 100% |
| dsw.StaticD 1.0 | 7 | 57% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 40% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 22% | 53 |
| dsw.StaticD 1.0 | 8 | 10% | 15 |
| sul.Lunar 1.1 | 7 | 9% | 43 |
| mme.NikeEnhanced 2.0 | 6 | 7% | 15 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 8 |
| sample.Corners 1.0 | 3 | 4% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 11 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorWND 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.7 | 118 / 210 | 2.64 | 18.7% | 38438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWND 0.1 | 1.0 | 18.7% | 118 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 27 |
| mld.Wisdom 1.0 | 2.7 | 12.6% | 25 |
| amz.NanoClone 1.41 | 4.5 | 10.6% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.2% | 19 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 6 |
| sample.Walls 1.0 | 7.7 | 7.4% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 22 / 35 | 6585 |
| 2 | 1 | 66.6 | 76.2 | 19 / 35 | 5964 |
| 3 | 1 | 67.7 | 81.6 | 17 / 35 | 6351 |
| 4 | 1 | 71.4 | 92.7 | 24 / 35 | 7158 |
| 5 | 1 | 64.5 | 69.8 | 13 / 35 | 5938 |
| 6 | 1 | 69.6 | 85.1 | 23 / 35 | 6442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 84% |
| radnor.DoctorBob 1.42 | 36 | 83% |
| mld.Wisdom 1.0 | 26 | 65% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 29% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 17% | 53 |
| radnor.DoctorBob 1.42 | 16 | 17% | 48 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 27 |
| amz.NanoClone 1.41 | 12 | 13% | 18 |
| GarmBox.Oranges 1.0 | 5 | 5% | 4 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 2 | 2% | 9 |

