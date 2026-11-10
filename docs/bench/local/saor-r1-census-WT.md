# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.5 | 138 / 210 | 2.13 | 21.0% | 43518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 21.0% | 138 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 20 |
| mz.AntiGrav 1.0 | 3.0 | 13.8% | 17 |
| mld.Infinity 2.2 | 3.2 | 13.1% | 27 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 3 |
| sample.Walls 1.0 | 6.2 | 7.5% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 5 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 86.3 | 24 / 35 | 7512 |
| 2 | 1 | 70.4 | 83.5 | 21 / 35 | 6918 |
| 3 | 1 | 72.5 | 88.3 | 24 / 35 | 7381 |
| 4 | 1 | 72.6 | 90.8 | 22 / 35 | 7640 |
| 5 | 1 | 71.3 | 87.9 | 22 / 35 | 6896 |
| 6 | 1 | 71.9 | 87.9 | 25 / 35 | 7171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 61 | 98% |
| mld.Infinity 2.2 | 43 | 84% |
| radnor.DoctorBob 1.42 | 28 | 89% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 6 | 50% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 35% | 65 |
| mld.Infinity 2.2 | 11 | 15% | 13 |
| mz.AntiGrav 1.0 | 10 | 14% | 76 |
| amz.NanoClone 1.41 | 9 | 13% | 18 |
| sample.Walls 1.0 | 8 | 11% | 16 |
| jangs.ns51 1.0 | 7 | 10% | 12 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.6 | 130 / 210 | 2.20 | 18.9% | 31814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 18.9% | 130 |
| mld.DustBunny 3.8 | 2.5 | 13.6% | 23 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.2% | 37 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 2 |
| zyx.nano.Ant 1.1 | 6.0 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.3% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.2% | 2 |
| fullsail.SweetTea 1.1 | 8.0 | 6.7% | 4 |
| bzdp.BoxCar 2.0 | 8.7 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.5 | 23 / 35 | 5412 |
| 2 | 1 | 67.5 | 83.8 | 16 / 35 | 5421 |
| 3 | 1 | 69.3 | 88.9 | 23 / 35 | 5574 |
| 4 | 1 | 67.6 | 83.2 | 22 / 35 | 4916 |
| 5 | 1 | 67.9 | 83.5 | 23 / 35 | 5268 |
| 6 | 1 | 69.5 | 90.8 | 23 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 80 | 76% |
| mld.DustBunny 3.8 | 50 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 75% |
| maribo.melee.BMV 0.1 | 11 | 91% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 4 | 50% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 29 | 36% | 71 |
| oog.melee.Mercutio 1.0 | 25 | 31% | 86 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 10% | 18 |
| bzdp.BoxCar 2.0 | 5 | 6% | 6 |
| maribo.melee.BMV 0.1 | 4 | 5% | 9 |
| fullsail.SweetTea 1.1 | 4 | 5% | 8 |
| zyx.nano.Ant 1.1 | 3 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 4 |

## Melee bench: F03

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.6 | 93 / 210 | 2.83 | 18.3% | 35225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 18.3% | 93 |
| myl.micro.Troodon 1.10 | 2.0 | 15.2% | 59 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 11.9% | 34 |
| myl.nano.KomoriNinja 1.1 | 4.2 | 11.3% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 6 |
| fm.mammillarias 1.3 | 5.7 | 9.5% | 7 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 2 |
| sample.Fire 1.0 | 9.2 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.4 | 13 / 35 | 5553 |
| 2 | 1 | 68.8 | 82.5 | 18 / 35 | 5974 |
| 3 | 1 | 69.5 | 86.0 | 18 / 35 | 5801 |
| 4 | 1 | 65.3 | 70.8 | 12 / 35 | 5901 |
| 5 | 1 | 69.1 | 82.9 | 18 / 35 | 6088 |
| 6 | 1 | 66.9 | 76.2 | 14 / 35 | 5908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 65% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 60% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| myl.nano.KomoriNinja 1.1 | 11 | 91% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 4 | 50% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 43 | 36% | 54 |
| myl.micro.Troodon 1.10 | 40 | 34% | 83 |
| fm.mammillarias 1.3 | 13 | 11% | 21 |
| cb.nano.Insomnia 1.0 | 8 | 7% | 9 |
| myl.nano.KomoriNinja 1.1 | 7 | 6% | 18 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 14 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 0 |
| sample.Fire 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.5 | 110 / 210 | 2.49 | 19.2% | 38046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 19.2% | 110 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 40 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 10.1% | 36 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 9.3% | 7 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 8.0% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.8 | 18 / 35 | 6156 |
| 2 | 1 | 68.3 | 81.6 | 18 / 35 | 6342 |
| 3 | 1 | 70.6 | 89.5 | 20 / 35 | 6803 |
| 4 | 1 | 67.7 | 82.2 | 17 / 35 | 6009 |
| 5 | 1 | 66.5 | 75.2 | 16 / 35 | 6029 |
| 6 | 1 | 70.3 | 88.6 | 21 / 35 | 6707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 67% |
| stelo.SoJNanoMelee 1.1 | 36 | 53% |
| tj.zombie1n 1.0.1 | 15 | 73% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| yk.JahMicro 1.0 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 100% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 50% |

Hadur died in 102 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 39 | 38% | 82 |
| stelo.SoJNanoMelee 1.1 | 37 | 36% | 52 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 8% | 12 |
| tj.zombie1n 1.0.1 | 7 | 7% | 11 |
| tvv.micro.Antares 1.1.1 | 6 | 6% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 11 |
| sample.VelociRobot 1.0 | 2 | 2% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 12 |

## Melee bench: F05

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.7 | 94 / 210 | 3.63 | 16.0% | 29055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 16.0% | 94 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 29 |
| ahf.NanoAndrew .4 | 3.2 | 11.3% | 25 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 24 |
| sam.Samspin 1.0 | 5.3 | 10.0% | 14 |
| EBBU.Sim2 1.02 | 5.5 | 9.9% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.1% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.7 | 15 / 35 | 4701 |
| 2 | 1 | 64.7 | 74.9 | 15 / 35 | 5078 |
| 3 | 1 | 61.4 | 63.2 | 15 / 35 | 4617 |
| 4 | 1 | 64.9 | 75.6 | 17 / 35 | 4807 |
| 5 | 1 | 63.5 | 70.2 | 17 / 35 | 4904 |
| 6 | 1 | 63.3 | 68.9 | 15 / 35 | 4948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 89% |
| oog.melee.Corsair 1.0 | 35 | 86% |
| ahf.NanoAndrew .4 | 16 | 88% |
| sam.Samspin 1.0 | 12 | 58% |
| EBBU.Sim2 1.02 | 9 | 78% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 21 | 18% | 46 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 19 |
| sam.Samspin 1.0 | 17 | 15% | 25 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 19 |
| oog.melee.Corsair 1.0 | 12 | 10% | 30 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 16 |
| EBBU.Sim2 1.02 | 10 | 9% | 22 |
| ahf.NanoAndrew .4 | 6 | 5% | 25 |
| sample.TrackFire 1.0 | 6 | 5% | 8 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.1 | 107 / 210 | 2.34 | 18.7% | 32288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 18.7% | 107 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.5% | 51 |
| gh.nano.Grofvuil 0.2 | 2.8 | 11.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.6% | 20 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.8% | 7 |
| fm.claire 1.7 | 5.8 | 8.8% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.5% | 6 |
| sample.SpinBot 1.0 | 7.3 | 7.7% | 9 |
| pa.Improved 1.0 | 9.5 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 17 / 35 | 4993 |
| 2 | 1 | 67.6 | 83.2 | 19 / 35 | 5226 |
| 3 | 1 | 65.5 | 80.0 | 11 / 35 | 4807 |
| 4 | 1 | 68.7 | 84.4 | 17 / 35 | 5863 |
| 5 | 1 | 71.3 | 95.2 | 26 / 35 | 5945 |
| 6 | 1 | 68.0 | 84.4 | 17 / 35 | 5454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 49% |
| oog.melee.CapuletDroid 1.1 | 26 | 81% |
| arthord.NanoSatanMelee Beta | 17 | 82% |
| gh.nano.Grofvuil 0.2 | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| fm.claire 1.7 | 6 | 83% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 49% | 90 |
| oog.melee.CapuletDroid 1.1 | 13 | 13% | 19 |
| gh.nano.Grofvuil 0.2 | 11 | 11% | 31 |
| arthord.NanoSatanMelee Beta | 11 | 11% | 22 |
| sample.SpinBot 1.0 | 10 | 10% | 15 |
| fm.claire 1.7 | 4 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 11 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.0 | 83 / 210 | 2.89 | 17.6% | 34114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 17.6% | 83 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 14.6% | 58 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.4% | 39 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 12 |
| DBall.Anarchy 0.1 | 5.5 | 8.3% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.7% | 6 |
| acogdev.alpha 0.2 | 8.0 | 6.6% | 2 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.5 | 16 / 35 | 5389 |
| 2 | 1 | 66.3 | 77.1 | 10 / 35 | 5694 |
| 3 | 1 | 67.3 | 80.0 | 15 / 35 | 6049 |
| 4 | 1 | 67.4 | 79.0 | 14 / 35 | 5980 |
| 5 | 1 | 67.1 | 82.5 | 14 / 35 | 5509 |
| 6 | 1 | 66.2 | 78.1 | 14 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 39% |
| mz.MicroGodMelee 1 | 37 | 92% |
| gh.micro.Gruweltje 0.7 | 24 | 46% |
| DBall.Anarchy 0.1 | 8 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 41% | 67 |
| gh.micro.Gruweltje 0.7 | 26 | 20% | 43 |
| mz.MicroGodMelee 1 | 14 | 11% | 42 |
| acogdev.alpha 0.2 | 11 | 9% | 13 |
| el.JumpShoot 0.2 | 10 | 8% | 14 |
| caimano.Furia_Ceca 0.22 | 8 | 6% | 11 |
| DBall.Anarchy 0.1 | 4 | 3% | 13 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 4 |

## Melee bench: F08

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.7 | 64 / 210 | 3.73 | 15.7% | 31587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.8% | 90 |
| hadur117.micro.SaorWT 0.1 | 1.7 | 15.7% | 64 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 6 |
| germ.TheMind .2 | 5.3 | 9.3% | 6 |
| awesomeness.Elite 1.0 | 5.8 | 8.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.1% | 2 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.3% | 1 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 70.8 | 14 / 35 | 4755 |
| 2 | 2 | 64.2 | 70.5 | 10 / 35 | 5380 |
| 3 | 1 | 64.9 | 71.7 | 12 / 35 | 5489 |
| 4 | 2 | 63.1 | 66.7 | 11 / 35 | 5129 |
| 5 | 2 | 62.7 | 65.7 | 8 / 35 | 5288 |
| 6 | 2 | 64.9 | 72.7 | 9 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 41% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 68% |
| awesomeness.Elite 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| germ.TheMind .2 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 58% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 17% | 44 |
| germ.TheMind .2 | 13 | 9% | 20 |
| stelo.UntouchableNano 1.3 | 6 | 4% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6 | 4% | 9 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 7 |
| awesomeness.Elite 1.0 | 2 | 1% | 6 |
| sample.Crazy 1.0 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.3 | 147 / 210 | 2.32 | 19.2% | 29311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 19.2% | 147 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.3% | 7 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 4 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.7% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 7 |
| stelo.PatternRobot 1.0 | 8.0 | 8.0% | 10 |
| spinnercat.Omen 1.0 | 8.0 | 7.9% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.0 | 21 / 35 | 4519 |
| 2 | 1 | 71.7 | 94.0 | 27 / 35 | 5087 |
| 3 | 1 | 70.2 | 87.0 | 27 / 35 | 5220 |
| 4 | 1 | 70.1 | 89.2 | 27 / 35 | 4729 |
| 5 | 1 | 67.3 | 77.8 | 23 / 35 | 4783 |
| 6 | 1 | 68.8 | 84.1 | 22 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 91% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| stelo.PatternRobot 1.0 | 14 | 71% |
| maribo.IotaCT 1.1 | 12 | 100% |
| timmit.nano.TimDog 0.33 | 11 | 100% |
| ratosh.Wesco 1.4 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 18 | 29% | 28 |
| rz.HawkOnFire 0.1 | 13 | 21% | 68 |
| ratosh.Wesco 1.4 | 12 | 19% | 20 |
| nz.jdc.nano.GridFu 1.0 | 9 | 14% | 46 |
| timmit.nano.TimDog 0.33 | 4 | 6% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 12 |
| maribo.IotaCT 1.1 | 1 | 2% | 11 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.2 | 146 / 210 | 1.88 | 20.7% | 38672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 20.7% | 146 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.0% | 20 |
| baal.nano.N 1.42 | 3.2 | 11.0% | 3 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 13 |
| sanja.First 0.1 | 6.8 | 8.3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.5% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.4% | 14 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.3% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.7 | 23 / 35 | 6239 |
| 2 | 1 | 70.3 | 89.5 | 25 / 35 | 6250 |
| 3 | 1 | 68.8 | 84.1 | 22 / 35 | 6072 |
| 4 | 1 | 69.6 | 85.7 | 22 / 35 | 6398 |
| 5 | 1 | 72.1 | 95.2 | 29 / 35 | 6706 |
| 6 | 1 | 71.5 | 93.0 | 25 / 35 | 7007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 91% |
| baal.nano.N 1.42 | 31 | 97% |
| cvt.Firsty 1.0 | 29 | 59% |
| sanja.First 0.1 | 26 | 85% |
| zyx.micro.Ant 1.1 | 17 | 59% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 50% |

Hadur died in 65 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 25 | 38% | 41 |
| cvt.Firsty 1.0 | 13 | 20% | 34 |
| Grystrion.TrackerWO 1.0 | 9 | 14% | 19 |
| tvv.nano.Polaris 1.2 | 5 | 8% | 46 |
| sanja.First 0.1 | 5 | 8% | 27 |
| sample.RamFire 1.0 | 3 | 5% | 4 |
| baal.nano.N 1.42 | 2 | 3% | 24 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 8 |

## Melee bench: F11

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 69.2 | 91 / 210 | 3.78 | 15.5% | 29852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.3 | 15.5% | 91 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 60 |
| cs.Wren 1.0 | 3.3 | 12.1% | 22 |
| js.PinBall 1.6 | 4.2 | 11.0% | 10 |
| mz.Cork 0.1 | 4.3 | 11.0% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 4 |
| evd.X1 0.01 | 7.2 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.3 | 6.9% | 1 |
| donjezza.Jezza 1.0 | 8.7 | 6.0% | 6 |
| PSW.Relentless 0.1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 73.7 | 19 / 35 | 5022 |
| 2 | 2 | 59.2 | 58.1 | 13 / 35 | 4369 |
| 3 | 1 | 66.9 | 80.6 | 18 / 35 | 5452 |
| 4 | 2 | 61.7 | 63.8 | 15 / 35 | 4616 |
| 5 | 1 | 66.6 | 81.0 | 13 / 35 | 5721 |
| 6 | 1 | 59.3 | 57.8 | 13 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 74 | 69% |
| cs.Wren 1.0 | 17 | 71% |
| js.PinBall 1.6 | 9 | 100% |
| mz.Cork 0.1 | 8 | 100% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 120 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 62 | 52% | 115 |
| cs.Wren 1.0 | 18 | 15% | 31 |
| evd.X1 0.01 | 14 | 12% | 16 |
| js.PinBall 1.6 | 7 | 6% | 13 |
| joe.ADinosaur 1.0 | 7 | 6% | 10 |
| mz.Cork 0.1 | 5 | 4% | 12 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 3 | 3% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.6 | 106 / 210 | 2.75 | 17.9% | 28970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 17.9% | 106 |
| myl.nano.Graviton 1.10 | 2.5 | 12.1% | 32 |
| ntc.Opposite 1.5 | 3.2 | 11.6% | 17 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.1% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.2% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.7 | 8.9% | 2 |
| DBall.NUKE 0.1 | 7.0 | 8.2% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.2% | 2 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 12 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 24 / 35 | 4799 |
| 2 | 1 | 67.9 | 83.8 | 21 / 35 | 4985 |
| 3 | 1 | 68.4 | 86.3 | 20 / 35 | 4900 |
| 4 | 1 | 63.9 | 72.4 | 13 / 35 | 4486 |
| 5 | 1 | 66.9 | 82.5 | 17 / 35 | 4923 |
| 6 | 1 | 63.2 | 68.9 | 11 / 35 | 4877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 59% |
| myl.nano.Graviton 1.10 | 30 | 80% |
| ntc.Opposite 1.5 | 19 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 94% |
| disan.Chair 2.2.0 | 13 | 100% |
| donjezza.Muncho 1.0 | 11 | 45% |
| DBall.NUKE 0.1 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 26 | 24% | 53 |
| ntc.Opposite 1.5 | 23 | 21% | 31 |
| stelo.AreaTargetingBot 1.1 | 22 | 20% | 40 |
| pfvicm.Sobieski 7.2.3b | 9 | 8% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 6% | 19 |
| donjezza.Muncho 1.0 | 7 | 6% | 13 |
| DBall.NUKE 0.1 | 6 | 6% | 21 |
| disan.Chair 2.2.0 | 6 | 6% | 12 |
| pbg.R2D2 1.0 | 2 | 2% | 5 |

## Melee bench: F13

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.4 | 73 / 210 | 3.58 | 15.6% | 27070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.5 | 15.6% | 73 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 55 |
| oog.melee.Capulet 1.2 | 3.3 | 13.8% | 37 |
| yagami.Tidus 0.11 | 3.8 | 12.7% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 20 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.4 | 12 / 35 | 4697 |
| 2 | 1 | 66.1 | 75.9 | 14 / 35 | 4948 |
| 3 | 1 | 65.2 | 76.2 | 13 / 35 | 4181 |
| 4 | 4 | 59.5 | 59.4 | 6 / 35 | 4183 |
| 5 | 1 | 66.0 | 75.2 | 16 / 35 | 4758 |
| 6 | 1 | 64.1 | 70.2 | 12 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 85% |
| kawigi.micro.Shiz 1.1 | 25 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 80% |
| yagami.Tidus 0.11 | 13 | 62% |
| ejb.Polaris 1.0.1 | 8 | 75% |

Hadur died in 137 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 36 | 26% | 47 |
| kawigi.micro.Shiz 1.1 | 33 | 24% | 49 |
| oog.melee.Capulet 1.2 | 31 | 23% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 38 |
| ejb.Polaris 1.0.1 | 11 | 8% | 17 |
| kurios.DOSexe .9a | 5 | 4% | 4 |
| stelo.MirrorNano 1.3 | 4 | 3% | 7 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.1 | 129 / 210 | 3.06 | 17.2% | 27094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 17.2% | 129 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 24 |
| wee.Gem 1.8.4 | 3.2 | 11.9% | 20 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 14 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 9 |
| bayen.UbaMicro 1.4 | 6.3 | 9.1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 5 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.0 | 20 / 35 | 4311 |
| 2 | 1 | 68.3 | 84.8 | 25 / 35 | 4973 |
| 3 | 1 | 66.0 | 75.9 | 25 / 35 | 4560 |
| 4 | 1 | 64.8 | 73.7 | 20 / 35 | 4374 |
| 5 | 1 | 65.3 | 76.8 | 19 / 35 | 4437 |
| 6 | 1 | 65.9 | 77.5 | 20 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 86% |
| wee.Gem 1.8.4 | 47 | 94% |
| wompi.Quokka 1.6 | 13 | 92% |
| ratosh.Nobo 0.21 | 13 | 85% |
| m3thos.Eva00 1.1 | 12 | 67% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 15% | 56 |
| maribo.FollowFire 1 | 12 | 15% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 13% | 12 |
| wompi.Quokka 1.6 | 10 | 12% | 17 |
| ratosh.Nobo 0.21 | 8 | 10% | 21 |
| m3thos.Eva00 1.1 | 8 | 10% | 18 |
| wee.Gem 1.8.4 | 7 | 9% | 49 |
| bayen.UbaMicro 1.4 | 7 | 9% | 14 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 9 |

## Melee bench: F15

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 83.2 | 79 / 210 | 2.51 | 19.7% | 45619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.6% | 113 |
| hadur117.micro.SaorWT 0.1 | 1.5 | 19.7% | 79 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 11 |
| ayk.WallHugger 1.0 | 4.7 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 6 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 79.7 | 11 / 35 | 7471 |
| 2 | 1 | 71.2 | 85.4 | 17 / 35 | 7459 |
| 3 | 2 | 68.6 | 75.6 | 11 / 35 | 7079 |
| 4 | 1 | 71.5 | 86.7 | 15 / 35 | 7532 |
| 5 | 1 | 72.1 | 88.3 | 13 / 35 | 7934 |
| 6 | 2 | 71.4 | 83.5 | 12 / 35 | 8144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 120 | 43% |
| mz.NanoGod 2.02 | 11 | 82% |
| exauge.GateKeeper 1.1.121g | 8 | 63% |
| stelo.PianistNano 1.2 | 5 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 92 | 70% | 143 |
| mz.NanoGod 2.02 | 15 | 11% | 28 |
| exauge.GateKeeper 1.1.121g | 15 | 11% | 19 |
| ayk.WallHugger 1.0 | 6 | 5% | 8 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 66.6 | 86 / 210 | 4.01 | 15.5% | 28511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 15.5% | 86 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 39 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.3% | 19 |
| bvh.micro.Freya 0.3 | 4.3 | 11.3% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 9.8% | 21 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 8 |
| conscience.Electron 1.3g | 6.3 | 8.6% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.3% | 12 |
| dl.BetterWalls 1.0 | 8.7 | 7.1% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 70.2 | 15 / 35 | 5093 |
| 2 | 1 | 63.2 | 67.6 | 14 / 35 | 4601 |
| 3 | 1 | 64.5 | 71.7 | 15 / 35 | 5055 |
| 4 | 1 | 59.9 | 58.7 | 13 / 35 | 4402 |
| 5 | 1 | 61.5 | 61.9 | 13 / 35 | 4730 |
| 6 | 1 | 63.3 | 69.2 | 16 / 35 | 4630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 31 | 77% |
| voidious.micro.BlitzBat 1.05 | 28 | 61% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 58% |
| bvh.micro.Freya 0.3 | 15 | 100% |
| ap.Frederick 1.1 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 21% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 24 | 19% | 25 |
| dummy.micro.Sparrow 2.5 | 20 | 16% | 48 |
| conscience.Electron 1.3g | 20 | 16% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 14% | 29 |
| dl.BetterWalls 1.0 | 9 | 7% | 16 |
| bvh.micro.Freya 0.3 | 4 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 4 | 3% | 8 |

## Melee bench: F17

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 84.9 | 128 / 210 | 2.36 | 20.3% | 40551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 20.3% | 128 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 18 |
| supersample.SuperBoxBot 1.0 | 3.2 | 12.0% | 35 |
| sul.Lunar 1.1 | 3.7 | 10.9% | 10 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.8% | 6 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 2 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 6 |
| sample.Corners 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 78.1 | 14 / 35 | 6066 |
| 2 | 1 | 71.7 | 90.5 | 24 / 35 | 7112 |
| 3 | 1 | 70.3 | 85.1 | 24 / 35 | 6893 |
| 4 | 1 | 68.6 | 77.8 | 20 / 35 | 6476 |
| 5 | 1 | 72.3 | 92.1 | 27 / 35 | 6832 |
| 6 | 1 | 70.8 | 85.7 | 19 / 35 | 7172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 56 | 95% |
| sul.Lunar 1.1 | 37 | 92% |
| supersample.SuperBoxBot 1.0 | 24 | 29% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 80% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| dsw.StaticD 1.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 47 | 56% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 13% | 50 |
| sul.Lunar 1.1 | 7 | 8% | 45 |
| mme.NikeEnhanced 2.0 | 6 | 7% | 11 |
| dsw.StaticD 1.0 | 5 | 6% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 6% | 15 |
| sample.Corners 1.0 | 1 | 1% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 76.1 | 82 / 210 | 3.15 | 17.2% | 36771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT 0.1 | 1.0 | 17.2% | 82 |
| radnor.DoctorBob 1.42 | 2.0 | 13.8% | 44 |
| mld.Wisdom 1.0 | 3.7 | 11.9% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.2% | 30 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 17 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.3% | 10 |
| GarmBox.Oranges 1.0 | 7.3 | 7.9% | 1 |
| sample.Walls 1.0 | 7.7 | 7.6% | 4 |
| jangs.ns51 1.0 | 9.2 | 5.5% | 4 |
| sample.Target 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.8 | 16 / 35 | 6159 |
| 2 | 1 | 66.3 | 76.8 | 12 / 35 | 6221 |
| 3 | 1 | 65.6 | 74.3 | 12 / 35 | 6043 |
| 4 | 1 | 64.2 | 73.0 | 12 / 35 | 5492 |
| 5 | 1 | 68.0 | 80.0 | 18 / 35 | 6862 |
| 6 | 1 | 65.5 | 75.6 | 12 / 35 | 5994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 54% |
| radnor.DoctorBob 1.42 | 35 | 63% |
| mld.Wisdom 1.0 | 13 | 62% |
| amz.NanoClone 1.41 | 12 | 67% |
| KiraNL.Chupacabra 0.4 | 9 | 56% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 28% | 68 |
| mld.Wisdom 1.0 | 36 | 28% | 46 |
| radnor.DoctorBob 1.42 | 18 | 14% | 39 |
| KiraNL.Chupacabra 0.4 | 16 | 12% | 19 |
| amz.NanoClone 1.41 | 14 | 11% | 18 |
| GarmBox.Oranges 1.0 | 4 | 3% | 5 |
| jangs.ns51 1.0 | 3 | 2% | 7 |
| sample.Walls 1.0 | 2 | 2% | 8 |

