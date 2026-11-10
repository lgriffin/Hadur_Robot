# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.4 | 148 / 210 | 2.05 | 21.2% | 42792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.2% | 148 |
| mz.AntiGrav 1.0 | 2.5 | 13.8% | 10 |
| radnor.DoctorBob 1.42 | 3.0 | 14.1% | 26 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 6 |
| sample.Walls 1.0 | 6.2 | 7.4% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 92.4 | 27 / 35 | 7165 |
| 2 | 1 | 72.1 | 86.0 | 23 / 35 | 7573 |
| 3 | 1 | 72.8 | 91.4 | 27 / 35 | 7243 |
| 4 | 1 | 71.3 | 83.8 | 23 / 35 | 7334 |
| 5 | 1 | 72.0 | 89.8 | 25 / 35 | 6663 |
| 6 | 1 | 70.8 | 86.7 | 23 / 35 | 6814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 94% |
| mld.Infinity 2.2 | 39 | 90% |
| radnor.DoctorBob 1.42 | 30 | 80% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 42% | 62 |
| mz.AntiGrav 1.0 | 16 | 25% | 80 |
| mld.Infinity 2.2 | 8 | 13% | 47 |
| amz.NanoClone 1.41 | 6 | 9% | 9 |
| sample.Walls 1.0 | 3 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.3 | 114 / 210 | 2.50 | 18.5% | 33682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 18.5% | 114 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 58 |
| mld.DustBunny 3.8 | 2.7 | 12.7% | 15 |
| maribo.melee.BMV 0.1 | 4.7 | 9.8% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.1% | 5 |
| zyx.nano.Ant 1.1 | 5.8 | 8.7% | 2 |
| bzdp.BoxCar 2.0 | 7.7 | 7.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.9% | 9 |
| fullsail.SweetTea 1.1 | 8.2 | 6.4% | 4 |
| cs.Grudge 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 18 / 35 | 6004 |
| 2 | 1 | 69.1 | 88.6 | 21 / 35 | 5496 |
| 3 | 1 | 69.7 | 91.7 | 23 / 35 | 5531 |
| 4 | 1 | 69.3 | 87.6 | 23 / 35 | 5787 |
| 5 | 1 | 68.5 | 86.3 | 18 / 35 | 5746 |
| 6 | 2 | 61.1 | 57.1 | 11 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 66 | 68% |
| mld.DustBunny 3.8 | 41 | 83% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 64% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 32% | 83 |
| mld.DustBunny 3.8 | 19 | 20% | 47 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 11% | 17 |
| cs.Grudge 1.0 | 10 | 10% | 9 |
| zyx.nano.Ant 1.1 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 6 | 6% | 12 |
| maribo.melee.BMV 0.1 | 6 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 19 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.3 | 144 / 210 | 2.05 | 21.1% | 39740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.1% | 144 |
| myl.micro.Troodon 1.10 | 2.2 | 13.2% | 23 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.3% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.3% | 21 |
| fm.mammillarias 1.3 | 5.2 | 9.3% | 0 |
| cs.sheldor.Talon 1.1 | 5.8 | 8.9% | 0 |
| cb.nano.Insomnia 1.0 | 6.3 | 9.0% | 6 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 1 |
| sample.Fire 1.0 | 9.2 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 88.6 | 23 / 35 | 6658 |
| 2 | 1 | 72.4 | 91.1 | 23 / 35 | 7205 |
| 3 | 1 | 71.6 | 89.5 | 27 / 35 | 6505 |
| 4 | 1 | 70.0 | 82.9 | 22 / 35 | 6301 |
| 5 | 1 | 70.3 | 86.3 | 21 / 35 | 6363 |
| 6 | 1 | 72.4 | 91.4 | 28 / 35 | 6708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 86% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| myl.nano.KomoriNinja 1.1 | 22 | 68% |
| sp.Nanos.Ember 1.1 | 20 | 95% |
| fm.mammillarias 1.3 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 24% | 43 |
| myl.micro.Troodon 1.10 | 13 | 20% | 57 |
| myl.nano.KomoriNinja 1.1 | 11 | 17% | 36 |
| cb.nano.Insomnia 1.0 | 10 | 15% | 13 |
| fm.mammillarias 1.3 | 7 | 11% | 12 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 13 |
| sample.Fire 1.0 | 4 | 6% | 11 |
| sp.Nanos.Ember 1.1 | 1 | 2% | 22 |

## Melee bench: F04

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.4 | 157 / 210 | 2.04 | 21.2% | 40540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.2% | 157 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.3% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.6% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 1 |
| yk.JahMicro 1.0 | 6.0 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 4 |
| tj.zombie1n 1.0.1 | 7.2 | 8.2% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.3 | 26 / 35 | 6733 |
| 2 | 1 | 71.4 | 87.6 | 27 / 35 | 7115 |
| 3 | 1 | 70.3 | 85.1 | 24 / 35 | 6678 |
| 4 | 1 | 71.4 | 91.7 | 26 / 35 | 6453 |
| 5 | 1 | 70.2 | 85.4 | 25 / 35 | 6610 |
| 6 | 1 | 72.4 | 92.4 | 29 / 35 | 6951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 91% |
| stelo.SoJNanoMelee 1.1 | 46 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 96% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| yk.JahMicro 1.0 | 13 | 92% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 38% | 74 |
| stelo.SoJNanoMelee 1.1 | 11 | 21% | 36 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 25 |
| tj.zombie1n 1.0.1 | 5 | 9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 28 |
| yk.JahMicro 1.0 | 3 | 6% | 13 |
| sample.VelociRobot 1.0 | 2 | 4% | 9 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.8 | 99 / 210 | 3.71 | 16.1% | 29222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.1% | 99 |
| oog.melee.Corsair 1.0 | 2.2 | 12.4% | 32 |
| ahf.NanoAndrew .4 | 3.5 | 11.1% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.2% | 25 |
| sam.Samspin 1.0 | 5.7 | 9.7% | 9 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 63.8 | 13 / 35 | 4427 |
| 2 | 1 | 65.5 | 72.1 | 20 / 35 | 5325 |
| 3 | 1 | 65.6 | 73.7 | 20 / 35 | 4938 |
| 4 | 1 | 63.0 | 68.9 | 13 / 35 | 4875 |
| 5 | 1 | 63.9 | 70.8 | 18 / 35 | 4765 |
| 6 | 1 | 64.0 | 69.8 | 15 / 35 | 4892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 44 | 93% |
| oog.melee.Corsair 1.0 | 29 | 69% |
| ahf.NanoAndrew .4 | 18 | 72% |
| sam.Samspin 1.0 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 22% | 50 |
| robar.nano.Assertive_Melee 0.2 | 19 | 17% | 23 |
| zyx.nano.BacillusComma 1.0 | 15 | 13% | 17 |
| simonton.nano.MeleeSeed 1.8 | 14 | 12% | 49 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 12% | 13 |
| sam.Samspin 1.0 | 10 | 9% | 14 |
| ahf.NanoAndrew .4 | 9 | 8% | 30 |
| EBBU.Sim2 1.02 | 6 | 5% | 9 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.1 | 141 / 210 | 2.34 | 19.1% | 32509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.1% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 33 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 9.9% | 11 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.2% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.6% | 9 |
| fm.claire 1.7 | 6.5 | 8.1% | 1 |
| sample.SpinBot 1.0 | 8.0 | 6.8% | 3 |
| pa.Improved 1.0 | 9.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.0 | 20 / 35 | 5202 |
| 2 | 1 | 69.7 | 90.8 | 27 / 35 | 5188 |
| 3 | 1 | 69.4 | 87.3 | 25 / 35 | 5757 |
| 4 | 1 | 70.3 | 91.4 | 26 / 35 | 5364 |
| 5 | 1 | 66.8 | 74.0 | 18 / 35 | 5578 |
| 6 | 1 | 69.1 | 87.0 | 25 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 86% |
| oog.melee.CapuletDroid 1.1 | 40 | 98% |
| gh.nano.Grofvuil 0.2 | 15 | 87% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| sample.SpinBot 1.0 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 31% | 77 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 34 |
| oog.melee.CapuletDroid 1.1 | 8 | 11% | 47 |
| winamp32.micro.MicroMacro 1.0 | 8 | 11% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 14 |
| fm.claire 1.7 | 5 | 7% | 8 |
| sample.SpinBot 1.0 | 5 | 7% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 8 |
| pa.Improved 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.1 | 100 / 210 | 2.79 | 17.9% | 33215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 17.9% | 100 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.6% | 44 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.2% | 28 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 26 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 1 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 0 |
| fire219.CatBot 1.0 | 8.5 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.5 | 6.4% | 4 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.0 | 15 / 35 | 5379 |
| 2 | 1 | 68.9 | 83.5 | 19 / 35 | 6231 |
| 3 | 1 | 66.1 | 75.9 | 17 / 35 | 5441 |
| 4 | 1 | 69.7 | 84.4 | 23 / 35 | 6161 |
| 5 | 1 | 67.2 | 81.6 | 14 / 35 | 5495 |
| 6 | 1 | 63.9 | 76.2 | 12 / 35 | 4508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 84% |
| mz.MicroGodMelee 1 | 38 | 68% |
| gh.micro.Gruweltje 0.7 | 28 | 57% |
| el.JumpShoot 0.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 29 | 26% | 55 |
| mz.MicroGodMelee 1 | 27 | 25% | 51 |
| spinnercat.micro.Tyger 0.1 | 26 | 24% | 58 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 9 |
| fire219.CatBot 1.0 | 7 | 6% | 8 |
| acogdev.alpha 0.2 | 6 | 5% | 8 |
| DBall.Anarchy 0.1 | 5 | 5% | 11 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.0 | 93 / 210 | 3.97 | 15.4% | 28626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.7 | 15.4% | 93 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.5% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.6% | 32 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 9.0% | 3 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.3% | 6 |
| germ.TheMind .2 | 5.5 | 9.1% | 7 |
| awesomeness.Elite 1.0 | 6.7 | 8.5% | 10 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 8 |
| sample.Crazy 1.0 | 9.0 | 6.7% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 76.5 | 21 / 35 | 5503 |
| 2 | 1 | 65.1 | 73.3 | 17 / 35 | 4765 |
| 3 | 2 | 62.6 | 66.3 | 13 / 35 | 4774 |
| 4 | 3 | 60.0 | 59.0 | 15 / 35 | 4255 |
| 5 | 1 | 61.1 | 61.3 | 12 / 35 | 4757 |
| 6 | 2 | 62.4 | 65.7 | 15 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 86% |
| germ.TheMind .2 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 33% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 49% | 103 |
| germ.TheMind .2 | 16 | 14% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 11% | 29 |
| stelo.UntouchableNano 1.3 | 11 | 9% | 19 |
| qualidafial.MajorDick 1.0.1 | 11 | 9% | 16 |
| awesomeness.Elite 1.0 | 4 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.4 | 160 / 210 | 1.86 | 20.3% | 31552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.3% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 7 |
| maribo.IotaCT 1.1 | 4.0 | 10.2% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 1 |
| timmit.nano.TimDog 0.33 | 6.2 | 8.9% | 6 |
| spinnercat.Omen 1.0 | 7.5 | 7.9% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 7.8% | 8 |
| ratosh.Wesco 1.4 | 8.0 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.1 | 27 / 35 | 5286 |
| 2 | 1 | 67.8 | 81.6 | 20 / 35 | 4838 |
| 3 | 1 | 71.5 | 91.7 | 29 / 35 | 5357 |
| 4 | 1 | 71.9 | 95.2 | 32 / 35 | 5238 |
| 5 | 1 | 71.6 | 94.3 | 28 / 35 | 5752 |
| 6 | 1 | 69.9 | 88.6 | 24 / 35 | 5081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 89 | 92% |
| nz.jdc.nano.GridFu 1.0 | 37 | 100% |
| stelo.PatternRobot 1.0 | 18 | 83% |
| maribo.IotaCT 1.1 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 6 | 50% |
| ratosh.Wesco 1.4 | 4 | 75% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 34% | 83 |
| stelo.PatternRobot 1.0 | 11 | 22% | 26 |
| timmit.nano.TimDog 0.33 | 6 | 12% | 13 |
| ratosh.Wesco 1.4 | 6 | 12% | 10 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 41 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 10 |
| maribo.IotaCT 1.1 | 2 | 4% | 18 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

## Melee bench: F10

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.9 | 172 / 210 | 1.55 | 21.8% | 39344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.8% | 172 |
| baal.nano.N 1.42 | 2.0 | 12.3% | 10 |
| tvv.nano.Polaris 1.2 | 3.2 | 11.3% | 10 |
| zyx.micro.Ant 1.1 | 4.7 | 9.2% | 6 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.3% | 2 |
| sanja.First 0.1 | 6.8 | 7.9% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.4% | 8 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 0 |
| sample.RamFire 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.5 | 30 / 35 | 6744 |
| 2 | 1 | 71.4 | 92.7 | 26 / 35 | 6445 |
| 3 | 1 | 71.6 | 92.4 | 28 / 35 | 6692 |
| 4 | 1 | 72.3 | 97.1 | 31 / 35 | 6422 |
| 5 | 1 | 70.2 | 87.6 | 26 / 35 | 6054 |
| 6 | 1 | 73.1 | 96.8 | 31 / 35 | 6987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 56 | 84% |
| tvv.nano.Polaris 1.2 | 32 | 91% |
| cvt.Firsty 1.0 | 28 | 82% |
| zyx.micro.Ant 1.1 | 24 | 88% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| sanja.First 0.1 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 9 | 23% | 40 |
| cvt.Firsty 1.0 | 7 | 18% | 33 |
| zyx.micro.Ant 1.1 | 7 | 18% | 29 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 54 |
| Grystrion.TrackerWO 1.0 | 5 | 13% | 15 |
| sanja.First 0.1 | 2 | 5% | 21 |
| sample.RamFire 1.0 | 2 | 5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |

## Melee bench: F11

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.6 | 86 / 210 | 3.55 | 16.3% | 32683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 16.3% | 86 |
| kc.micro.Figment 1.0 | 1.7 | 15.0% | 65 |
| cs.Wren 1.0 | 3.5 | 12.6% | 22 |
| js.PinBall 1.6 | 3.7 | 11.6% | 19 |
| mz.Cork 0.1 | 4.8 | 10.0% | 5 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 4 |
| evd.X1 0.01 | 7.0 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.2% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.3 | 17 / 35 | 5494 |
| 2 | 1 | 66.2 | 77.1 | 14 / 35 | 5837 |
| 3 | 2 | 61.3 | 63.5 | 11 / 35 | 4970 |
| 4 | 2 | 63.2 | 64.8 | 15 / 35 | 5151 |
| 5 | 1 | 63.8 | 67.9 | 14 / 35 | 5398 |
| 6 | 1 | 67.5 | 82.2 | 15 / 35 | 5833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 64% |
| cs.Wren 1.0 | 32 | 81% |
| js.PinBall 1.6 | 11 | 73% |
| mz.Cork 0.1 | 9 | 89% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 37% | 83 |
| cs.Wren 1.0 | 25 | 20% | 46 |
| js.PinBall 1.6 | 12 | 10% | 17 |
| joe.ADinosaur 1.0 | 11 | 9% | 14 |
| evd.X1 0.01 | 11 | 9% | 13 |
| mz.Cork 0.1 | 9 | 7% | 18 |
| PSW.Relentless 0.1 | 6 | 5% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.1 | 126 / 210 | 2.61 | 18.5% | 29469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.5% | 126 |
| myl.nano.Graviton 1.10 | 3.3 | 11.5% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 10.7% | 5 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 10.4% | 14 |
| ntc.Opposite 1.5 | 4.3 | 10.4% | 10 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.6% | 8 |
| disan.Chair 2.2.0 | 6.7 | 8.7% | 11 |
| DBall.NUKE 0.1 | 7.5 | 8.3% | 2 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 77.1 | 16 / 35 | 4657 |
| 2 | 1 | 67.8 | 82.2 | 22 / 35 | 4893 |
| 3 | 1 | 67.9 | 83.5 | 23 / 35 | 4823 |
| 4 | 1 | 67.0 | 79.0 | 19 / 35 | 5165 |
| 5 | 1 | 69.0 | 87.0 | 25 / 35 | 4782 |
| 6 | 1 | 68.0 | 83.8 | 21 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 93% |
| myl.nano.Graviton 1.10 | 24 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| DBall.NUKE 0.1 | 16 | 100% |
| ntc.Opposite 1.5 | 14 | 79% |
| disan.Chair 2.2.0 | 13 | 77% |
| donjezza.Muncho 1.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 21 | 25% | 33 |
| pfvicm.Sobieski 7.2.3b | 16 | 19% | 23 |
| myl.nano.Graviton 1.10 | 14 | 16% | 40 |
| stelo.AreaTargetingBot 1.1 | 12 | 14% | 40 |
| ntc.Opposite 1.5 | 11 | 13% | 25 |
| disan.Chair 2.2.0 | 6 | 7% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 11 |

## Melee bench: F13

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.7 | 76 / 210 | 3.63 | 15.4% | 26626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 15.4% | 76 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.1% | 37 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 43 |
| yagami.Tidus 0.11 | 3.7 | 12.6% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.1% | 33 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 6 |
| step.nanoPri 1.0 | 7.3 | 7.5% | 1 |
| stelo.MirrorNano 1.3 | 7.7 | 7.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 64.4 | 13 / 35 | 4044 |
| 2 | 1 | 62.7 | 67.6 | 9 / 35 | 4681 |
| 3 | 1 | 62.6 | 67.0 | 13 / 35 | 4271 |
| 4 | 2 | 61.7 | 64.4 | 10 / 35 | 4236 |
| 5 | 1 | 65.8 | 77.8 | 16 / 35 | 4245 |
| 6 | 1 | 67.8 | 83.2 | 15 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 67% |
| yagami.Tidus 0.11 | 18 | 94% |
| kawigi.micro.Shiz 1.1 | 16 | 100% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 34% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 19% | 44 |
| kawigi.micro.Shiz 1.1 | 21 | 16% | 34 |
| yagami.Tidus 0.11 | 19 | 14% | 36 |
| ejb.Polaris 1.0.1 | 7 | 5% | 19 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 5 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.5 | 124 / 210 | 2.94 | 17.5% | 28003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 17.5% | 124 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 22 |
| wee.Gem 1.8.4 | 2.5 | 11.9% | 20 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 17 |
| ratosh.Nobo 0.21 | 5.3 | 10.2% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 4 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 3 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 3 |
| maribo.FollowFire 1 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.6 | 22 / 35 | 4450 |
| 2 | 1 | 67.7 | 83.5 | 23 / 35 | 4870 |
| 3 | 1 | 65.6 | 77.8 | 18 / 35 | 4610 |
| 4 | 1 | 66.0 | 79.0 | 19 / 35 | 4678 |
| 5 | 1 | 63.8 | 69.8 | 16 / 35 | 4627 |
| 6 | 1 | 68.2 | 85.1 | 26 / 35 | 4768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 92% |
| wee.Gem 1.8.4 | 36 | 94% |
| ratosh.Nobo 0.21 | 12 | 75% |
| wompi.Quokka 1.6 | 12 | 92% |
| m3thos.Eva00 1.1 | 10 | 100% |
| bayen.UbaMicro 1.4 | 4 | 25% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 15% | 54 |
| ratosh.Nobo 0.21 | 12 | 14% | 21 |
| wompi.Quokka 1.6 | 10 | 12% | 19 |
| bayen.UbaMicro 1.4 | 10 | 12% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 12% | 15 |
| maribo.FollowFire 1 | 10 | 12% | 12 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 9 |
| m3thos.Eva00 1.1 | 7 | 8% | 15 |
| wee.Gem 1.8.4 | 6 | 7% | 49 |

## Melee bench: F15

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 86.7 | 127 / 210 | 2.20 | 20.9% | 45338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.9% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 64 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 13 |
| ayk.WallHugger 1.0 | 4.3 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.2% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 82.2 | 23 / 35 | 7319 |
| 2 | 1 | 71.0 | 83.5 | 17 / 35 | 7339 |
| 3 | 1 | 72.7 | 89.5 | 22 / 35 | 7843 |
| 4 | 1 | 72.1 | 87.0 | 23 / 35 | 7412 |
| 5 | 1 | 73.1 | 91.1 | 24 / 35 | 7680 |
| 6 | 1 | 71.8 | 87.0 | 18 / 35 | 7745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 84% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| mz.NanoGod 2.02 | 6 | 67% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 52% | 141 |
| mz.NanoGod 2.02 | 24 | 29% | 30 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 12 |
| stuff.Vlad 0.1 | 4 | 5% | 7 |
| ayk.WallHugger 1.0 | 2 | 2% | 10 |
| drd.Dreadknoght 0.9 | 2 | 2% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.0 | 106 / 210 | 3.25 | 17.1% | 29720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 17.1% | 106 |
| dummy.micro.Sparrow 2.5 | 2.5 | 12.6% | 31 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.4% | 14 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 9 |
| dl.BetterWalls 1.0 | 8.7 | 6.9% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.1 | 15 / 35 | 4855 |
| 2 | 1 | 69.2 | 84.8 | 23 / 35 | 5765 |
| 3 | 1 | 65.0 | 70.5 | 16 / 35 | 5219 |
| 4 | 1 | 65.7 | 75.9 | 20 / 35 | 4559 |
| 5 | 1 | 61.0 | 63.5 | 11 / 35 | 4595 |
| 6 | 1 | 67.3 | 83.2 | 21 / 35 | 4727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 91% |
| dummy.micro.Sparrow 2.5 | 31 | 81% |
| bvh.micro.Freya 0.3 | 23 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 19 | 18% | 42 |
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 50 |
| conscience.Electron 1.3g | 15 | 14% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 30 |
| dl.BetterWalls 1.0 | 11 | 11% | 14 |
| bvh.micro.Freya 0.3 | 9 | 9% | 26 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 14 |

## Melee bench: F17

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.0 | 155 / 210 | 2.17 | 21.4% | 42738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.4% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.3% | 16 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 14 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 9 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.8% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 0 |
| sample.Corners 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 80.6 | 25 / 35 | 6930 |
| 2 | 1 | 71.6 | 88.9 | 28 / 35 | 6562 |
| 3 | 1 | 71.6 | 87.3 | 25 / 35 | 7297 |
| 4 | 1 | 72.8 | 89.5 | 25 / 35 | 7858 |
| 5 | 1 | 71.6 | 87.6 | 24 / 35 | 7129 |
| 6 | 1 | 71.9 | 88.3 | 28 / 35 | 6962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 100% |
| supersample.SuperBoxBot 1.0 | 33 | 91% |
| dsw.StaticD 1.0 | 12 | 67% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |

Hadur died in 56 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 36% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 25% | 55 |
| dsw.StaticD 1.0 | 6 | 11% | 21 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 12 |
| tlp.ThreeLeggedPig 1 | 5 | 9% | 10 |
| sul.Lunar 1.1 | 2 | 4% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| sample.Corners 1.0 | 1 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.7 | 109 / 210 | 2.82 | 18.3% | 37676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.3% | 109 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 21 |
| mld.Wisdom 1.0 | 2.8 | 12.9% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.0% | 27 |
| KiraNL.Chupacabra 0.4 | 4.3 | 11.0% | 8 |
| amz.NanoClone 1.41 | 5.7 | 9.7% | 12 |
| sample.Walls 1.0 | 7.2 | 7.7% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.9 | 18 / 35 | 6375 |
| 2 | 1 | 71.4 | 90.5 | 22 / 35 | 7281 |
| 3 | 1 | 65.9 | 74.0 | 16 / 35 | 5853 |
| 4 | 1 | 67.2 | 77.1 | 20 / 35 | 6116 |
| 5 | 1 | 69.3 | 86.7 | 21 / 35 | 6238 |
| 6 | 1 | 63.8 | 68.3 | 12 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 85% |
| radnor.DoctorBob 1.42 | 25 | 96% |
| mld.Wisdom 1.0 | 23 | 70% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| GarmBox.Oranges 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 30% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 19% | 56 |
| KiraNL.Chupacabra 0.4 | 16 | 16% | 23 |
| radnor.DoctorBob 1.42 | 15 | 15% | 47 |
| amz.NanoClone 1.41 | 10 | 10% | 13 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 6 |

