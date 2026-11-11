# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.3 | 146 / 210 | 2.41 | 20.4% | 42258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 20.4% | 146 |
| radnor.DoctorBob 1.42 | 2.5 | 14.4% | 30 |
| mz.AntiGrav 1.0 | 3.0 | 13.9% | 14 |
| mld.Infinity 2.2 | 3.5 | 13.3% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 7.0% | 1 |
| sample.Walls 1.0 | 7.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.8% | 0 |
| sample.Target 1.0 | 9.5 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.9 | 25 / 35 | 6808 |
| 2 | 1 | 70.9 | 84.8 | 25 / 35 | 6731 |
| 3 | 1 | 72.6 | 88.3 | 26 / 35 | 7748 |
| 4 | 1 | 69.1 | 79.7 | 22 / 35 | 6482 |
| 5 | 1 | 71.8 | 85.1 | 23 / 35 | 7417 |
| 6 | 1 | 70.7 | 80.0 | 25 / 35 | 7072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 97% |
| mld.Infinity 2.2 | 37 | 92% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| amz.NanoClone 1.41 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 32% | 55 |
| mz.AntiGrav 1.0 | 15 | 23% | 70 |
| mld.Infinity 2.2 | 12 | 18% | 52 |
| amz.NanoClone 1.41 | 7 | 11% | 9 |
| GarmBox.Oranges 1.0 | 5 | 8% | 8 |
| sample.Walls 1.0 | 2 | 3% | 9 |
| jangs.ns51 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |

## Melee bench: F02

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.6 | 116 / 210 | 2.12 | 18.8% | 32843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 18.8% | 116 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 61 |
| mld.DustBunny 3.8 | 3.0 | 13.6% | 13 |
| maribo.melee.BMV 0.1 | 4.3 | 9.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.4% | 6 |
| zyx.nano.Ant 1.1 | 6.5 | 8.0% | 1 |
| fullsail.SweetTea 1.1 | 7.5 | 7.2% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 6.7% | 6 |
| bzdp.BoxCar 2.0 | 8.2 | 7.3% | 0 |
| cs.Grudge 1.0 | 8.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 22 / 35 | 5694 |
| 2 | 1 | 67.7 | 87.9 | 18 / 35 | 5198 |
| 3 | 1 | 69.3 | 89.8 | 23 / 35 | 5728 |
| 4 | 1 | 67.0 | 82.2 | 18 / 35 | 5088 |
| 5 | 1 | 68.6 | 87.0 | 17 / 35 | 5524 |
| 6 | 1 | 68.6 | 88.6 | 18 / 35 | 5611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 63% |
| mld.DustBunny 3.8 | 55 | 87% |
| djdjdj.NanoSkunk10 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 56% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 36% | 74 |
| mld.DustBunny 3.8 | 25 | 27% | 72 |
| zyx.nano.Ant 1.1 | 11 | 12% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 15 |
| maribo.melee.BMV 0.1 | 6 | 6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 14 |
| fullsail.SweetTea 1.1 | 4 | 4% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 83.8 | 137 / 210 | 2.46 | 20.3% | 39316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 20.3% | 137 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.4% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.0% | 15 |
| fm.mammillarias 1.3 | 4.5 | 9.8% | 4 |
| cb.nano.Insomnia 1.0 | 6.3 | 8.6% | 5 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 3 |
| sample.Fire 1.0 | 9.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 81.6 | 21 / 35 | 6481 |
| 2 | 1 | 70.2 | 84.1 | 24 / 35 | 6497 |
| 3 | 1 | 70.4 | 86.3 | 21 / 35 | 6368 |
| 4 | 1 | 71.7 | 86.7 | 27 / 35 | 6857 |
| 5 | 1 | 68.7 | 77.1 | 20 / 35 | 6425 |
| 6 | 1 | 71.2 | 87.0 | 24 / 35 | 6688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 47 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 92% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| fm.mammillarias 1.3 | 11 | 82% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 15 | 21% | 65 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 18% | 43 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 16 |
| fm.mammillarias 1.3 | 11 | 15% | 22 |
| cs.sheldor.Talon 1.1 | 9 | 12% | 16 |
| myl.nano.KomoriNinja 1.1 | 7 | 10% | 28 |
| sample.Fire 1.0 | 3 | 4% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 14 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.6 | 156 / 210 | 2.11 | 20.9% | 40757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 20.9% | 156 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.3% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.3% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 12 |
| tj.zombie1n 1.0.1 | 5.3 | 9.5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 3 |
| yk.JahMicro 1.0 | 7.3 | 7.6% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 89.5 | 29 / 35 | 7159 |
| 2 | 1 | 70.6 | 87.0 | 23 / 35 | 6712 |
| 3 | 1 | 72.7 | 93.7 | 30 / 35 | 7114 |
| 4 | 1 | 71.1 | 87.3 | 27 / 35 | 6960 |
| 5 | 1 | 70.6 | 87.9 | 26 / 35 | 6622 |
| 6 | 1 | 68.3 | 80.3 | 21 / 35 | 6190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 95% |
| stelo.SoJNanoMelee 1.1 | 39 | 95% |
| tj.zombie1n 1.0.1 | 20 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 84% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 41% | 90 |
| tj.zombie1n 1.0.1 | 9 | 17% | 11 |
| tvv.micro.Antares 1.1.1 | 7 | 13% | 23 |
| stelo.SoJNanoMelee 1.1 | 6 | 11% | 39 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 24 |
| yk.JahMicro 1.0 | 3 | 6% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.2 | 92 / 210 | 3.78 | 15.8% | 30387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 15.8% | 92 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 33 |
| ahf.NanoAndrew .4 | 3.0 | 11.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 19 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.4% | 14 |
| EBBU.Sim2 1.02 | 6.3 | 9.5% | 10 |
| sam.Samspin 1.0 | 6.3 | 9.6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.9% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 74.0 | 18 / 35 | 5002 |
| 2 | 1 | 62.3 | 67.0 | 12 / 35 | 4723 |
| 3 | 1 | 62.5 | 64.8 | 15 / 35 | 5145 |
| 4 | 1 | 60.1 | 62.2 | 11 / 35 | 4712 |
| 5 | 1 | 64.3 | 70.2 | 19 / 35 | 5288 |
| 6 | 1 | 66.1 | 76.8 | 17 / 35 | 5517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 85% |
| oog.melee.Corsair 1.0 | 33 | 64% |
| ahf.NanoAndrew .4 | 21 | 90% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| EBBU.Sim2 1.02 | 7 | 86% |
| sam.Samspin 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |

Hadur died in 118 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 21% | 51 |
| oog.melee.Corsair 1.0 | 25 | 21% | 47 |
| ahf.NanoAndrew .4 | 17 | 14% | 42 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 15 |
| EBBU.Sim2 1.02 | 13 | 11% | 18 |
| robar.nano.Assertive_Melee 0.2 | 12 | 10% | 16 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 14 |
| sam.Samspin 1.0 | 2 | 2% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

## Melee bench: F06

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.6 | 103 / 210 | 3.02 | 17.4% | 32001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 17.4% | 103 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.9% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.1% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 12 |
| fm.claire 1.7 | 5.7 | 9.2% | 5 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 4 |
| sample.SpinBot 1.0 | 8.2 | 7.1% | 3 |
| kurios.DOSexe .9b | 9.2 | 5.6% | 2 |
| pa.Improved 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.2 | 18 / 35 | 5554 |
| 2 | 1 | 68.3 | 85.1 | 19 / 35 | 5294 |
| 3 | 1 | 66.0 | 77.8 | 15 / 35 | 5278 |
| 4 | 1 | 65.2 | 73.7 | 15 / 35 | 5240 |
| 5 | 1 | 64.6 | 71.7 | 15 / 35 | 5212 |
| 6 | 1 | 67.4 | 81.0 | 21 / 35 | 5423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 72% |
| oog.melee.CapuletDroid 1.1 | 19 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 72% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| fm.claire 1.7 | 5 | 60% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 29% | 68 |
| gh.nano.Grofvuil 0.2 | 22 | 21% | 42 |
| fm.claire 1.7 | 12 | 11% | 14 |
| arthord.NanoSatanMelee Beta | 11 | 10% | 19 |
| kurios.DOSexe .9b | 10 | 9% | 14 |
| oog.melee.CapuletDroid 1.1 | 8 | 7% | 29 |
| winamp32.micro.MicroMacro 1.0 | 7 | 7% | 13 |
| sample.SpinBot 1.0 | 5 | 5% | 6 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.3 | 86 / 210 | 3.31 | 16.7% | 32946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.2 | 16.7% | 86 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.3% | 38 |
| mz.MicroGodMelee 1 | 3.5 | 13.2% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 10 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.1% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 4 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.2 | 15 / 35 | 5864 |
| 2 | 1 | 64.9 | 72.7 | 11 / 35 | 5737 |
| 3 | 1 | 67.2 | 81.6 | 16 / 35 | 5382 |
| 4 | 1 | 64.3 | 71.4 | 14 / 35 | 5199 |
| 5 | 1 | 66.5 | 75.6 | 20 / 35 | 5407 |
| 6 | 2 | 63.4 | 68.3 | 10 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 78% |
| mz.MicroGodMelee 1 | 39 | 69% |
| gh.micro.Gruweltje 0.7 | 16 | 69% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 41 | 33% | 68 |
| gh.micro.Gruweltje 0.7 | 32 | 26% | 48 |
| spinnercat.micro.Tyger 0.1 | 23 | 19% | 50 |
| fire219.CatBot 1.0 | 9 | 7% | 9 |
| acogdev.alpha 0.2 | 8 | 6% | 9 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 11 |
| el.JumpShoot 0.2 | 3 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.7 | 109 / 210 | 3.55 | 16.4% | 31422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.3 | 16.4% | 109 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.9% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 20 |
| germ.TheMind .2 | 4.7 | 9.7% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.2% | 9 |
| stelo.UntouchableNano 1.3 | 6.8 | 7.9% | 4 |
| awesomeness.Elite 1.0 | 7.0 | 8.3% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 70.2 | 15 / 35 | 5194 |
| 2 | 2 | 65.3 | 72.1 | 19 / 35 | 5319 |
| 3 | 1 | 64.6 | 71.4 | 19 / 35 | 5177 |
| 4 | 1 | 64.4 | 69.8 | 18 / 35 | 4998 |
| 5 | 1 | 65.7 | 74.3 | 23 / 35 | 5282 |
| 6 | 1 | 64.8 | 72.4 | 15 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 100% |
| germ.TheMind .2 | 7 | 71% |
| sample.Crazy 1.0 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 50% |
| awesomeness.Elite 1.0 | 3 | 67% |

Hadur died in 101 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 48% | 115 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 15% | 25 |
| awesomeness.Elite 1.0 | 9 | 9% | 18 |
| germ.TheMind .2 | 8 | 8% | 18 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.1 | 142 / 210 | 2.52 | 19.1% | 31697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 19.1% | 142 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 19 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.6% | 12 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 11 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.1% | 3 |
| spinnercat.Omen 1.0 | 7.0 | 8.2% | 4 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.8% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.3 | 21 / 35 | 5077 |
| 2 | 1 | 68.4 | 81.3 | 23 / 35 | 4983 |
| 3 | 1 | 69.9 | 84.8 | 26 / 35 | 5532 |
| 4 | 1 | 72.1 | 93.3 | 30 / 35 | 5636 |
| 5 | 1 | 66.7 | 74.3 | 19 / 35 | 5188 |
| 6 | 1 | 69.6 | 84.4 | 23 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 97% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| stelo.PatternRobot 1.0 | 16 | 88% |
| spinnercat.Omen 1.0 | 10 | 100% |
| maribo.IotaCT 1.1 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 88% |
| ratosh.Wesco 1.4 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 25% | 58 |
| nz.jdc.nano.GridFu 1.0 | 14 | 21% | 59 |
| timmit.nano.TimDog 0.33 | 13 | 19% | 25 |
| stelo.PatternRobot 1.0 | 9 | 13% | 15 |
| ratosh.Wesco 1.4 | 5 | 7% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 10 |
| maribo.IotaCT 1.1 | 3 | 4% | 14 |
| spinnercat.Omen 1.0 | 2 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.7 | 175 / 210 | 1.66 | 21.8% | 39881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 21.8% | 175 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 8 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.7 | 8.7% | 5 |
| sanja.First 0.1 | 6.7 | 8.1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 7.9% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.5% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 88.3 | 27 / 35 | 6819 |
| 2 | 1 | 72.0 | 93.0 | 29 / 35 | 6603 |
| 3 | 1 | 70.9 | 92.7 | 29 / 35 | 6016 |
| 4 | 1 | 73.4 | 98.7 | 32 / 35 | 6874 |
| 5 | 1 | 70.8 | 90.5 | 28 / 35 | 6444 |
| 6 | 1 | 72.6 | 93.0 | 30 / 35 | 7125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 37 | 86% |
| cvt.Firsty 1.0 | 33 | 100% |
| tvv.nano.Polaris 1.2 | 33 | 91% |
| sanja.First 0.1 | 23 | 96% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 10 | 29% | 39 |
| tvv.nano.Polaris 1.2 | 5 | 14% | 59 |
| Grystrion.TrackerWO 1.0 | 5 | 14% | 14 |
| zyx.micro.Ant 1.1 | 4 | 11% | 31 |
| cvt.Firsty 1.0 | 3 | 9% | 25 |
| sample.RamFire 1.0 | 3 | 9% | 4 |
| sanja.First 0.1 | 2 | 6% | 18 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |

## Melee bench: F11

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.2 | 79 / 210 | 3.86 | 15.2% | 31158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.5 | 15.2% | 79 |
| kc.micro.Figment 1.0 | 1.5 | 16.0% | 75 |
| cs.Wren 1.0 | 3.0 | 12.9% | 21 |
| js.PinBall 1.6 | 4.3 | 11.4% | 12 |
| mz.Cork 0.1 | 4.7 | 11.0% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 4 |
| evd.X1 0.01 | 7.0 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.3% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 74.9 | 14 / 35 | 5658 |
| 2 | 1 | 64.4 | 71.7 | 13 / 35 | 5385 |
| 3 | 2 | 60.7 | 60.6 | 11 / 35 | 4881 |
| 4 | 2 | 61.4 | 64.1 | 12 / 35 | 4989 |
| 5 | 1 | 65.9 | 77.1 | 18 / 35 | 5489 |
| 6 | 2 | 60.0 | 60.6 | 11 / 35 | 4756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 64% |
| cs.Wren 1.0 | 30 | 87% |
| mz.Cork 0.1 | 7 | 71% |
| js.PinBall 1.6 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 37% | 93 |
| joe.ADinosaur 1.0 | 24 | 18% | 24 |
| js.PinBall 1.6 | 18 | 14% | 20 |
| mz.Cork 0.1 | 14 | 11% | 15 |
| cs.Wren 1.0 | 11 | 8% | 32 |
| evd.X1 0.01 | 8 | 6% | 9 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.4 | 115 / 210 | 3.12 | 17.7% | 30699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 17.7% | 115 |
| myl.nano.Graviton 1.10 | 2.8 | 11.5% | 25 |
| ntc.Opposite 1.5 | 3.3 | 11.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.0% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 13 |
| disan.Chair 2.2.0 | 7.3 | 8.7% | 15 |
| DBall.NUKE 0.1 | 7.5 | 8.3% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 3 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 77.5 | 20 / 35 | 5410 |
| 2 | 1 | 67.0 | 77.1 | 20 / 35 | 5460 |
| 3 | 1 | 68.5 | 82.5 | 24 / 35 | 5137 |
| 4 | 1 | 67.6 | 81.0 | 21 / 35 | 5068 |
| 5 | 1 | 66.2 | 75.2 | 20 / 35 | 4934 |
| 6 | 1 | 61.3 | 65.1 | 10 / 35 | 4690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 89% |
| myl.nano.Graviton 1.10 | 25 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 88% |
| ntc.Opposite 1.5 | 12 | 67% |
| donjezza.Muncho 1.0 | 12 | 100% |
| disan.Chair 2.2.0 | 12 | 67% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| DBall.NUKE 0.1 | 10 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 26 | 27% | 34 |
| stelo.AreaTargetingBot 1.1 | 19 | 20% | 41 |
| disan.Chair 2.2.0 | 14 | 15% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 13% | 25 |
| ntc.Opposite 1.5 | 10 | 11% | 18 |
| myl.nano.Graviton 1.10 | 8 | 8% | 36 |
| DBall.NUKE 0.1 | 3 | 3% | 19 |
| pbg.R2D2 1.0 | 2 | 2% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 65.0 | 50 / 210 | 4.15 | 14.1% | 26221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.7 | 14.7% | 63 |
| hadur117.micro.SaorWCR 0.1 | 2.2 | 14.1% | 50 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 35 |
| yagami.Tidus 0.11 | 5.0 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.3% | 1 |
| step.nanoPri 1.0 | 8.0 | 7.1% | 2 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.2 | 8 / 35 | 4819 |
| 2 | 2 | 62.9 | 70.2 | 9 / 35 | 4372 |
| 3 | 4 | 58.7 | 59.0 | 4 / 35 | 4114 |
| 4 | 3 | 59.6 | 58.7 | 8 / 35 | 4303 |
| 5 | 1 | 63.0 | 69.5 | 11 / 35 | 4357 |
| 6 | 2 | 61.8 | 63.2 | 10 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 43% |
| kawigi.micro.Shiz 1.1 | 19 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 39% |
| yagami.Tidus 0.11 | 12 | 75% |
| ejb.Polaris 1.0.1 | 4 | 75% |

Hadur died in 160 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 63 | 39% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 14% | 33 |
| ejb.Polaris 1.0.1 | 20 | 13% | 23 |
| yagami.Tidus 0.11 | 16 | 10% | 29 |
| kawigi.micro.Shiz 1.1 | 14 | 9% | 24 |
| step.nanoPri 1.0 | 9 | 6% | 9 |
| kurios.DOSexe .9a | 8 | 5% | 8 |
| stelo.MirrorNano 1.3 | 7 | 4% | 7 |

## Melee bench: F14

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.7 | 112 / 210 | 3.28 | 16.6% | 28142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 16.6% | 112 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 18 |
| wee.Gem 1.8.4 | 3.0 | 12.2% | 36 |
| ratosh.Nobo 0.21 | 4.0 | 11.4% | 9 |
| wompi.Quokka 1.6 | 4.7 | 11.3% | 18 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.8% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 76.8 | 21 / 35 | 4377 |
| 2 | 1 | 64.6 | 74.3 | 18 / 35 | 4681 |
| 3 | 1 | 65.8 | 77.1 | 20 / 35 | 4688 |
| 4 | 1 | 63.5 | 68.3 | 16 / 35 | 4779 |
| 5 | 1 | 64.7 | 74.3 | 19 / 35 | 4643 |
| 6 | 1 | 65.7 | 77.5 | 18 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 98% |
| wee.Gem 1.8.4 | 33 | 88% |
| ratosh.Nobo 0.21 | 15 | 80% |
| bayen.UbaMicro 1.4 | 11 | 64% |
| wompi.Quokka 1.6 | 11 | 73% |
| m3thos.Eva00 1.1 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 19 | 19% | 54 |
| ratosh.Nobo 0.21 | 17 | 17% | 31 |
| bzdp.Pansy 2.1 | 11 | 11% | 54 |
| maribo.FollowFire 1 | 11 | 11% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 11% | 11 |
| bayen.UbaMicro 1.4 | 10 | 10% | 17 |
| wompi.Quokka 1.6 | 9 | 9% | 15 |
| m3thos.Eva00 1.1 | 5 | 5% | 12 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 5 |

## Melee bench: F15

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 81.6 | 108 / 210 | 2.66 | 19.8% | 45578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.2 | 19.8% | 108 |
| wompi.Wallaby 5.1 | 1.8 | 18.2% | 79 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 20 |
| ayk.WallHugger 1.0 | 4.5 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 2 |
| stuff.Vlad 0.1 | 6.0 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.9% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 75.6 | 13 / 35 | 6958 |
| 2 | 1 | 72.7 | 88.6 | 20 / 35 | 8285 |
| 3 | 1 | 69.4 | 77.1 | 19 / 35 | 7386 |
| 4 | 1 | 71.5 | 84.4 | 16 / 35 | 7892 |
| 5 | 1 | 70.5 | 78.4 | 19 / 35 | 7691 |
| 6 | 1 | 71.6 | 85.4 | 21 / 35 | 7366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 70% |
| exauge.GateKeeper 1.1.121g | 17 | 94% |
| mz.NanoGod 2.02 | 8 | 75% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 40% | 115 |
| mz.NanoGod 2.02 | 39 | 38% | 50 |
| ayk.WallHugger 1.0 | 9 | 9% | 16 |
| exauge.GateKeeper 1.1.121g | 8 | 8% | 13 |
| stuff.Vlad 0.1 | 5 | 5% | 9 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 64.4 | 87 / 210 | 4.20 | 14.9% | 27793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 14.9% | 87 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.1% | 36 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.2% | 22 |
| bvh.micro.Freya 0.3 | 4.8 | 10.6% | 15 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.7% | 11 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 2 |
| dl.BetterWalls 1.0 | 8.0 | 7.0% | 3 |
| ap.Frederick 1.1 | 8.8 | 6.9% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.6 | 19 / 35 | 4592 |
| 2 | 1 | 61.1 | 64.1 | 15 / 35 | 4295 |
| 3 | 1 | 60.1 | 60.3 | 12 / 35 | 4541 |
| 4 | 1 | 62.6 | 67.3 | 14 / 35 | 4894 |
| 5 | 1 | 64.6 | 72.1 | 16 / 35 | 5087 |
| 6 | 1 | 58.2 | 54.9 | 11 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 86% |
| dummy.micro.Sparrow 2.5 | 22 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 86% |
| bvh.micro.Freya 0.3 | 9 | 78% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 382. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 20% | 54 |
| dummy.micro.Sparrow 2.5 | 18 | 15% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 15% | 18 |
| dl.BetterWalls 1.0 | 15 | 12% | 15 |
| bvh.micro.Freya 0.3 | 14 | 11% | 18 |
| conscience.Electron 1.3g | 14 | 11% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 10% | 34 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.2 | 145 / 210 | 2.24 | 21.3% | 45425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 21.3% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 14 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 11 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.2% | 18 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 7 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 9 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 4 |
| sample.Corners 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 84.4 | 21 / 35 | 7847 |
| 2 | 1 | 73.8 | 92.7 | 27 / 35 | 8166 |
| 3 | 1 | 70.2 | 81.3 | 24 / 35 | 7326 |
| 4 | 1 | 69.9 | 82.5 | 23 / 35 | 6792 |
| 5 | 1 | 70.9 | 82.2 | 22 / 35 | 7779 |
| 6 | 1 | 73.1 | 94.0 | 28 / 35 | 7515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 88% |
| supersample.SuperBoxBot 1.0 | 25 | 80% |
| mme.NikeEnhanced 2.0 | 14 | 93% |
| dsw.StaticD 1.0 | 12 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 37% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 20% | 53 |
| dsw.StaticD 1.0 | 13 | 20% | 24 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 18 |
| sul.Lunar 1.1 | 4 | 6% | 52 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
| sample.Corners 1.0 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.0 | 98 / 210 | 3.52 | 16.9% | 37129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 16.9% | 98 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 32 |
| mld.Wisdom 1.0 | 3.0 | 12.7% | 24 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.8% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.6% | 21 |
| amz.NanoClone 1.41 | 5.7 | 9.9% | 11 |
| sample.Walls 1.0 | 6.5 | 8.2% | 14 |
| GarmBox.Oranges 1.0 | 8.2 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 5 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 69.5 | 13 / 35 | 5844 |
| 2 | 1 | 64.9 | 69.2 | 18 / 35 | 6121 |
| 3 | 1 | 68.0 | 80.6 | 20 / 35 | 6533 |
| 4 | 1 | 64.6 | 69.2 | 13 / 35 | 6150 |
| 5 | 1 | 68.3 | 79.0 | 22 / 35 | 6404 |
| 6 | 1 | 63.1 | 64.4 | 12 / 35 | 6077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 81% |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 76% |
| mld.Wisdom 1.0 | 13 | 69% |
| sample.Walls 1.0 | 12 | 92% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 32% | 48 |
| radnor.DoctorBob 1.42 | 29 | 26% | 65 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 17% | 43 |
| KiraNL.Chupacabra 0.4 | 13 | 12% | 20 |
| amz.NanoClone 1.41 | 10 | 9% | 15 |
| sample.Walls 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

