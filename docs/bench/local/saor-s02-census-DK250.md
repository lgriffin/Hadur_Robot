# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 89.2 | 299 / 420 | 1.97 | 21.0% | 80112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 21.0% | 299 |
| mz.AntiGrav 1.0 | 2.6 | 14.1% | 32 |
| radnor.DoctorBob 1.42 | 2.7 | 14.3% | 51 |
| mld.Infinity 2.2 | 3.8 | 12.9% | 27 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 2 |
| sample.Walls 1.0 | 6.5 | 7.1% | 5 |
| GarmBox.Oranges 1.0 | 7.0 | 6.9% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.2 | 27 / 35 | 6475 |
| 2 | 1 | 71.0 | 87.0 | 20 / 35 | 6525 |
| 3 | 1 | 71.4 | 86.3 | 21 / 35 | 7033 |
| 4 | 1 | 70.9 | 87.6 | 22 / 35 | 6428 |
| 5 | 1 | 72.7 | 91.4 | 29 / 35 | 6766 |
| 6 | 1 | 72.6 | 91.1 | 27 / 35 | 7090 |
| 7 | 1 | 70.5 | 84.4 | 24 / 35 | 6257 |
| 8 | 1 | 73.4 | 93.7 | 30 / 35 | 7265 |
| 9 | 1 | 70.9 | 87.9 | 24 / 35 | 6256 |
| 10 | 1 | 70.7 | 86.3 | 23 / 35 | 6260 |
| 11 | 1 | 72.6 | 91.1 | 27 / 35 | 6561 |
| 12 | 1 | 72.7 | 93.3 | 25 / 35 | 7196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 125 | 94% |
| mld.Infinity 2.2 | 100 | 92% |
| radnor.DoctorBob 1.42 | 72 | 75% |
| jangs.ns51 1.0 | 10 | 90% |
| amz.NanoClone 1.41 | 10 | 90% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 121 of 420 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 60 | 50% | 163 |
| mld.Infinity 2.2 | 21 | 17% | 34 |
| mz.AntiGrav 1.0 | 20 | 17% | 147 |
| amz.NanoClone 1.41 | 10 | 8% | 21 |
| sample.Walls 1.0 | 5 | 4% | 22 |
| jangs.ns51 1.0 | 4 | 3% | 11 |
| GarmBox.Oranges 1.0 | 1 | 1% | 15 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.7 | 287 / 420 | 2.38 | 18.5% | 58093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.3 | 18.5% | 287 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.4% | 75 |
| mld.DustBunny 3.8 | 2.9 | 13.3% | 22 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.2% | 11 |
| zyx.nano.Ant 1.1 | 6.1 | 8.7% | 2 |
| fullsail.SweetTea 1.1 | 7.4 | 7.4% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 7.6% | 12 |
| bzdp.BoxCar 2.0 | 8.5 | 6.3% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 21 / 35 | 5081 |
| 2 | 1 | 69.1 | 89.8 | 28 / 35 | 4602 |
| 3 | 1 | 70.7 | 92.4 | 29 / 35 | 5189 |
| 4 | 1 | 70.0 | 93.7 | 28 / 35 | 5075 |
| 5 | 1 | 70.9 | 95.6 | 28 / 35 | 5405 |
| 6 | 1 | 69.1 | 89.2 | 26 / 35 | 4728 |
| 7 | 1 | 69.1 | 88.9 | 27 / 35 | 4722 |
| 8 | 1 | 65.8 | 80.6 | 20 / 35 | 4434 |
| 9 | 1 | 70.4 | 95.2 | 27 / 35 | 4958 |
| 10 | 2 | 60.4 | 54.9 | 13 / 35 | 4511 |
| 11 | 1 | 69.5 | 92.4 | 27 / 35 | 4753 |
| 12 | 3 | 62.4 | 61.3 | 13 / 35 | 4635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 140 | 84% |
| mld.DustBunny 3.8 | 110 | 90% |
| djdjdj.NanoSkunk10 1.0 | 29 | 97% |
| maribo.melee.BMV 0.1 | 15 | 100% |
| fullsail.SweetTea 1.1 | 14 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 134 of 420 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 38 | 28% | 161 |
| mld.DustBunny 3.8 | 26 | 19% | 99 |
| zyx.nano.Ant 1.1 | 19 | 14% | 29 |
| maribo.melee.BMV 0.1 | 12 | 9% | 32 |
| cs.Grudge 1.0 | 12 | 9% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 7% | 23 |
| fullsail.SweetTea 1.1 | 8 | 6% | 19 |
| djdjdj.NanoSkunk10 1.0 | 6 | 4% | 34 |
| bzdp.BoxCar 2.0 | 4 | 3% | 9 |

## Melee bench: F03

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.9 | 309 / 420 | 2.09 | 20.3% | 68538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 20.3% | 309 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 50 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 11.6% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.6% | 22 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 6 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.2% | 16 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 7.9 | 6.7% | 6 |
| sample.Fire 1.0 | 9.4 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.3 | 26 / 35 | 5730 |
| 2 | 1 | 71.6 | 90.8 | 27 / 35 | 6013 |
| 3 | 1 | 70.6 | 88.3 | 25 / 35 | 6011 |
| 4 | 1 | 70.3 | 88.9 | 27 / 35 | 5507 |
| 5 | 1 | 70.8 | 85.1 | 26 / 35 | 6469 |
| 6 | 1 | 68.1 | 79.7 | 20 / 35 | 5426 |
| 7 | 1 | 69.7 | 86.3 | 24 / 35 | 5393 |
| 8 | 1 | 70.3 | 88.6 | 27 / 35 | 5613 |
| 9 | 1 | 71.3 | 94.0 | 28 / 35 | 5412 |
| 10 | 1 | 70.3 | 87.0 | 26 / 35 | 5742 |
| 11 | 1 | 70.1 | 88.3 | 27 / 35 | 5470 |
| 12 | 1 | 70.7 | 89.5 | 26 / 35 | 5752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 122 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 80 | 91% |
| cb.nano.Insomnia 1.0 | 45 | 80% |
| myl.nano.KomoriNinja 1.1 | 36 | 100% |
| sp.Nanos.Ember 1.1 | 23 | 91% |
| fm.mammillarias 1.3 | 18 | 89% |
| cs.sheldor.Talon 1.1 | 8 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 111 of 420 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 33 | 30% | 83 |
| myl.micro.Troodon 1.10 | 22 | 20% | 143 |
| cb.nano.Insomnia 1.0 | 22 | 20% | 21 |
| myl.nano.KomoriNinja 1.1 | 14 | 13% | 84 |
| fm.mammillarias 1.3 | 9 | 8% | 17 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 24 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
| sample.Fire 1.0 | 2 | 2% | 10 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 31 |

## Melee bench: F04

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.1 | 306 / 420 | 2.07 | 20.2% | 71430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 20.2% | 306 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 30 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 28 |
| stelo.SoJNanoMelee 1.1 | 5.1 | 9.2% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.1% | 4 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 18 |
| yk.JahMicro 1.0 | 6.6 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.5% | 8 |
| repositorio.NanoStep 1.0 | 8.9 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 28 / 35 | 6368 |
| 2 | 1 | 69.4 | 85.7 | 27 / 35 | 5611 |
| 3 | 1 | 70.7 | 90.8 | 23 / 35 | 6370 |
| 4 | 1 | 68.9 | 85.1 | 24 / 35 | 5685 |
| 5 | 1 | 70.4 | 90.5 | 27 / 35 | 5823 |
| 6 | 1 | 70.9 | 90.8 | 25 / 35 | 6191 |
| 7 | 1 | 68.6 | 83.5 | 22 / 35 | 5927 |
| 8 | 1 | 71.3 | 92.1 | 31 / 35 | 5859 |
| 9 | 1 | 71.0 | 91.1 | 27 / 35 | 6141 |
| 10 | 1 | 68.8 | 84.4 | 24 / 35 | 5614 |
| 11 | 1 | 69.6 | 86.0 | 26 / 35 | 5756 |
| 12 | 1 | 68.9 | 83.2 | 22 / 35 | 6085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 125 | 91% |
| stelo.SoJNanoMelee 1.1 | 85 | 94% |
| tj.zombie1n 1.0.1 | 39 | 77% |
| tvv.micro.Antares 1.1.1 | 33 | 85% |
| yk.JahMicro 1.0 | 19 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 80% |

Hadur died in 115 of 420 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 26% | 157 |
| tj.zombie1n 1.0.1 | 22 | 19% | 30 |
| stelo.SoJNanoMelee 1.1 | 19 | 17% | 72 |
| tvv.micro.Antares 1.1.1 | 17 | 15% | 65 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 11% | 20 |
| yk.JahMicro 1.0 | 6 | 5% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 26 |
| sample.VelociRobot 1.0 | 2 | 2% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 15 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.7 | 189 / 420 | 3.73 | 15.7% | 53945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 15.7% | 189 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 78 |
| ahf.NanoAndrew .4 | 3.2 | 11.3% | 48 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 41 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 16 |
| EBBU.Sim2 1.02 | 5.9 | 9.8% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.5% | 26 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 8.6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.3 | 15 / 35 | 4577 |
| 2 | 1 | 65.8 | 80.3 | 20 / 35 | 4705 |
| 3 | 1 | 62.4 | 68.3 | 16 / 35 | 4197 |
| 4 | 1 | 62.6 | 65.4 | 18 / 35 | 4374 |
| 5 | 1 | 63.0 | 71.4 | 14 / 35 | 4542 |
| 6 | 1 | 63.6 | 69.2 | 15 / 35 | 4952 |
| 7 | 1 | 63.0 | 68.9 | 17 / 35 | 4352 |
| 8 | 1 | 63.9 | 73.0 | 17 / 35 | 4296 |
| 9 | 1 | 61.8 | 64.1 | 12 / 35 | 4469 |
| 10 | 1 | 65.5 | 76.5 | 19 / 35 | 4742 |
| 11 | 1 | 60.1 | 61.3 | 11 / 35 | 4179 |
| 12 | 1 | 63.7 | 70.2 | 15 / 35 | 4560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 71 | 90% |
| oog.melee.Corsair 1.0 | 58 | 59% |
| ahf.NanoAndrew .4 | 40 | 80% |
| sam.Samspin 1.0 | 24 | 96% |
| EBBU.Sim2 1.02 | 18 | 89% |
| zyx.nano.BacillusComma 1.0 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 231 of 420 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 45 | 19% | 90 |
| simonton.nano.MeleeSeed 1.8 | 36 | 16% | 89 |
| zyx.nano.BacillusComma 1.0 | 29 | 13% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 28 | 12% | 27 |
| EBBU.Sim2 1.02 | 25 | 11% | 47 |
| ahf.NanoAndrew .4 | 24 | 10% | 60 |
| robar.nano.Assertive_Melee 0.2 | 23 | 10% | 31 |
| sam.Samspin 1.0 | 14 | 6% | 26 |
| sample.TrackFire 1.0 | 7 | 3% | 10 |

## Melee bench: F06

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.1 | 298 / 420 | 2.07 | 19.1% | 57839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 19.1% | 298 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.3% | 47 |
| gh.nano.Grofvuil 0.2 | 3.4 | 11.3% | 18 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.2% | 29 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.2% | 9 |
| fm.claire 1.7 | 6.2 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.6 | 8.3% | 7 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 4 |
| kurios.DOSexe .9b | 9.3 | 5.8% | 8 |
| pa.Improved 1.0 | 9.4 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.7 | 27 / 35 | 5050 |
| 2 | 1 | 68.6 | 89.5 | 24 / 35 | 4685 |
| 3 | 1 | 66.0 | 81.9 | 19 / 35 | 4157 |
| 4 | 1 | 69.1 | 88.3 | 26 / 35 | 4898 |
| 5 | 1 | 70.4 | 93.7 | 29 / 35 | 5112 |
| 6 | 1 | 66.8 | 85.1 | 21 / 35 | 4394 |
| 7 | 1 | 66.7 | 80.0 | 23 / 35 | 4751 |
| 8 | 1 | 70.0 | 94.0 | 30 / 35 | 4769 |
| 9 | 1 | 70.3 | 92.7 | 29 / 35 | 5262 |
| 10 | 1 | 69.4 | 91.7 | 26 / 35 | 4942 |
| 11 | 1 | 67.2 | 82.9 | 21 / 35 | 4669 |
| 12 | 1 | 68.4 | 85.4 | 23 / 35 | 5150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 137 | 91% |
| oog.melee.CapuletDroid 1.1 | 94 | 87% |
| gh.nano.Grofvuil 0.2 | 32 | 91% |
| arthord.NanoSatanMelee Beta | 22 | 86% |
| winamp32.micro.MicroMacro 1.0 | 19 | 84% |
| sample.SpinBot 1.0 | 15 | 100% |
| kurios.DOSexe .9b | 9 | 33% |
| pa.Improved 1.0 | 7 | 71% |
| fm.claire 1.7 | 5 | 100% |

Hadur died in 126 of 420 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 21% | 165 |
| gh.nano.Grofvuil 0.2 | 27 | 21% | 81 |
| oog.melee.CapuletDroid 1.1 | 21 | 17% | 39 |
| arthord.NanoSatanMelee Beta | 18 | 14% | 32 |
| kurios.DOSexe .9b | 10 | 8% | 22 |
| sample.SpinBot 1.0 | 6 | 5% | 18 |
| fm.claire 1.7 | 6 | 5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 38 |
| pa.Improved 1.0 | 3 | 2% | 10 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.3 | 218 / 420 | 2.32 | 18.6% | 64943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 18.6% | 218 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.5% | 96 |
| mz.MicroGodMelee 1 | 3.3 | 13.3% | 62 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 13.1% | 33 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 5.9 | 7.5% | 1 |
| el.JumpShoot 0.2 | 7.6 | 6.4% | 4 |
| acogdev.alpha 0.2 | 8.5 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.1 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 20 / 35 | 5279 |
| 2 | 1 | 68.0 | 84.1 | 15 / 35 | 5732 |
| 3 | 1 | 68.4 | 87.6 | 19 / 35 | 4799 |
| 4 | 1 | 67.3 | 80.0 | 18 / 35 | 5379 |
| 5 | 1 | 69.1 | 88.3 | 16 / 35 | 5698 |
| 6 | 1 | 69.2 | 87.9 | 18 / 35 | 5323 |
| 7 | 1 | 66.5 | 79.7 | 14 / 35 | 5273 |
| 8 | 1 | 68.2 | 82.2 | 20 / 35 | 5655 |
| 9 | 1 | 68.9 | 87.9 | 19 / 35 | 5544 |
| 10 | 1 | 68.0 | 85.4 | 18 / 35 | 5111 |
| 11 | 1 | 68.6 | 86.0 | 20 / 35 | 5420 |
| 12 | 1 | 69.5 | 88.3 | 21 / 35 | 5730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 108 | 90% |
| mz.MicroGodMelee 1 | 98 | 52% |
| gh.micro.Gruweltje 0.7 | 67 | 34% |
| DBall.Anarchy 0.1 | 32 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 83% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| el.JumpShoot 0.2 | 5 | 80% |

Hadur died in 204 of 420 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 73 | 36% | 117 |
| mz.MicroGodMelee 1 | 71 | 35% | 130 |
| spinnercat.micro.Tyger 0.1 | 22 | 11% | 90 |
| acogdev.alpha 0.2 | 13 | 6% | 16 |
| caimano.Furia_Ceca 0.22 | 9 | 4% | 12 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 15 |
| el.JumpShoot 0.2 | 5 | 2% | 7 |
| DBall.Anarchy 0.1 | 4 | 2% | 29 |
| fire219.CatBot 1.0 | 2 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 66.9 | 195 / 420 | 3.98 | 15.3% | 55849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.7 | 15.3% | 195 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 14.8% | 85 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.3% | 77 |
| germ.TheMind .2 | 5.0 | 9.3% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.1 | 9.3% | 16 |
| awesomeness.Elite 1.0 | 5.8 | 8.7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7.1 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 7.6 | 8.0% | 9 |
| sample.Crazy 1.0 | 8.5 | 7.3% | 9 |
| mym.EdgeStalker 1.0 | 10.0 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 66.0 | 16 / 35 | 4770 |
| 2 | 3 | 60.5 | 61.9 | 12 / 35 | 4536 |
| 3 | 3 | 59.3 | 58.4 | 16 / 35 | 4155 |
| 4 | 2 | 62.8 | 65.7 | 15 / 35 | 4869 |
| 5 | 1 | 63.1 | 66.3 | 16 / 35 | 4978 |
| 6 | 1 | 65.6 | 78.4 | 18 / 35 | 4753 |
| 7 | 1 | 63.7 | 71.7 | 18 / 35 | 4479 |
| 8 | 1 | 61.9 | 65.7 | 16 / 35 | 4283 |
| 9 | 1 | 62.9 | 66.3 | 19 / 35 | 4496 |
| 10 | 1 | 66.7 | 77.8 | 19 / 35 | 5188 |
| 11 | 1 | 63.2 | 65.7 | 16 / 35 | 4914 |
| 12 | 3 | 59.7 | 58.1 | 14 / 35 | 4428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 123 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 49 | 78% |
| awesomeness.Elite 1.0 | 14 | 79% |
| germ.TheMind .2 | 13 | 100% |
| qualidafial.MajorDick 1.0.1 | 11 | 82% |
| stelo.UntouchableNano 1.3 | 10 | 90% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 83% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 227 of 420 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 98 | 43% | 190 |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 18% | 81 |
| awesomeness.Elite 1.0 | 19 | 8% | 30 |
| qualidafial.MajorDick 1.0.1 | 19 | 8% | 24 |
| germ.TheMind .2 | 15 | 7% | 28 |
| stelo.UntouchableNano 1.3 | 13 | 6% | 21 |
| lrem.micro.MoggFanatic 0.2 | 11 | 5% | 18 |
| mym.EdgeStalker 1.0 | 7 | 3% | 12 |
| sample.Crazy 1.0 | 4 | 2% | 13 |

## Melee bench: F09

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.3 | 319 / 420 | 2.05 | 19.5% | 53517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 19.5% | 319 |
| rz.HawkOnFire 0.1 | 2.4 | 13.0% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.5% | 26 |
| maribo.IotaCT 1.1 | 4.1 | 10.8% | 24 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.1 | 9.3% | 3 |
| ratosh.Wesco 1.4 | 7.4 | 8.3% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 27 / 35 | 4549 |
| 2 | 1 | 70.8 | 90.2 | 27 / 35 | 4815 |
| 3 | 1 | 68.3 | 84.8 | 25 / 35 | 4246 |
| 4 | 1 | 69.3 | 86.3 | 25 / 35 | 4575 |
| 5 | 1 | 69.4 | 86.7 | 25 / 35 | 4400 |
| 6 | 1 | 69.6 | 88.9 | 28 / 35 | 4047 |
| 7 | 1 | 70.2 | 90.8 | 29 / 35 | 4265 |
| 8 | 1 | 69.7 | 87.9 | 27 / 35 | 4366 |
| 9 | 1 | 71.1 | 93.7 | 27 / 35 | 4920 |
| 10 | 1 | 70.3 | 92.4 | 29 / 35 | 4430 |
| 11 | 1 | 67.6 | 81.0 | 21 / 35 | 4302 |
| 12 | 1 | 70.3 | 89.2 | 29 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 130 | 98% |
| nz.jdc.nano.GridFu 1.0 | 100 | 97% |
| stelo.PatternRobot 1.0 | 30 | 93% |
| maribo.IotaCT 1.1 | 22 | 82% |
| timmit.nano.TimDog 0.33 | 21 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 93% |
| spinnercat.Omen 1.0 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |

Hadur died in 102 of 420 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 21 | 21% | 46 |
| stelo.PatternRobot 1.0 | 18 | 18% | 41 |
| maribo.IotaCT 1.1 | 15 | 15% | 51 |
| nz.jdc.nano.GridFu 1.0 | 13 | 13% | 106 |
| ratosh.Wesco 1.4 | 12 | 12% | 28 |
| rz.HawkOnFire 0.1 | 11 | 11% | 111 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 7% | 20 |
| spinnercat.Omen 1.0 | 4 | 4% | 14 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.5 | 356 / 420 | 1.76 | 20.9% | 69208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 20.9% | 356 |
| tvv.nano.Polaris 1.2 | 2.4 | 12.1% | 25 |
| baal.nano.N 1.42 | 2.6 | 11.4% | 9 |
| Grystrion.TrackerWO 1.0 | 4.6 | 9.8% | 3 |
| zyx.micro.Ant 1.1 | 5.7 | 8.7% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.1 | 8.6% | 4 |
| sanja.First 0.1 | 6.2 | 8.6% | 4 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 3 |
| cvt.Firsty 1.0 | 8.4 | 7.1% | 7 |
| sample.RamFire 1.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 28 / 35 | 5269 |
| 2 | 1 | 70.6 | 91.7 | 29 / 35 | 5833 |
| 3 | 1 | 71.1 | 91.7 | 29 / 35 | 5981 |
| 4 | 1 | 71.9 | 95.2 | 31 / 35 | 6173 |
| 5 | 1 | 70.8 | 91.7 | 32 / 35 | 5692 |
| 6 | 1 | 68.5 | 85.4 | 27 / 35 | 5060 |
| 7 | 1 | 72.5 | 97.1 | 34 / 35 | 6054 |
| 8 | 1 | 71.5 | 94.6 | 31 / 35 | 5824 |
| 9 | 1 | 71.8 | 94.6 | 32 / 35 | 5990 |
| 10 | 1 | 71.5 | 93.3 | 30 / 35 | 6088 |
| 11 | 1 | 70.6 | 89.8 | 30 / 35 | 5794 |
| 12 | 1 | 68.3 | 84.1 | 23 / 35 | 5450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 81 | 98% |
| baal.nano.N 1.42 | 79 | 97% |
| sanja.First 0.1 | 55 | 98% |
| cvt.Firsty 1.0 | 47 | 98% |
| zyx.micro.Ant 1.1 | 34 | 94% |
| Grystrion.TrackerWO 1.0 | 31 | 97% |
| amk.Punbot.Punbot 0.01 | 25 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 64 of 420 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 16 | 25% | 117 |
| zyx.micro.Ant 1.1 | 11 | 17% | 65 |
| sanja.First 0.1 | 7 | 11% | 56 |
| Grystrion.TrackerWO 1.0 | 7 | 11% | 27 |
| sample.RamFire 1.0 | 7 | 11% | 9 |
| cvt.Firsty 1.0 | 5 | 8% | 42 |
| squidM.TentalceMeleeNano 1.1 | 5 | 8% | 24 |
| baal.nano.N 1.42 | 4 | 6% | 60 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 11 |

## Melee bench: F11

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 66.9 | 134 / 420 | 3.98 | 14.4% | 53165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.5% | 163 |
| hadur117.micro.SaorDK250 0.1 | 2.0 | 14.4% | 134 |
| cs.Wren 1.0 | 3.2 | 12.6% | 35 |
| mz.Cork 0.1 | 4.0 | 11.6% | 26 |
| js.PinBall 1.6 | 4.6 | 11.3% | 30 |
| joe.ADinosaur 1.0 | 5.9 | 9.6% | 12 |
| evd.X1 0.01 | 7.0 | 8.2% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 9 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 67.3 | 10 / 35 | 3973 |
| 2 | 2 | 61.0 | 66.3 | 12 / 35 | 4315 |
| 3 | 1 | 61.9 | 66.3 | 10 / 35 | 4780 |
| 4 | 1 | 65.5 | 80.6 | 12 / 35 | 4897 |
| 5 | 1 | 65.5 | 79.7 | 21 / 35 | 4088 |
| 6 | 4 | 56.3 | 53.3 | 5 / 35 | 4125 |
| 7 | 2 | 60.7 | 66.3 | 7 / 35 | 4445 |
| 8 | 3 | 58.6 | 55.9 | 8 / 35 | 4708 |
| 9 | 1 | 64.7 | 75.9 | 14 / 35 | 4927 |
| 10 | 2 | 62.2 | 70.2 | 14 / 35 | 4089 |
| 11 | 3 | 56.7 | 52.7 | 10 / 35 | 4156 |
| 12 | 2 | 62.3 | 68.3 | 11 / 35 | 4662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 131 | 48% |
| cs.Wren 1.0 | 36 | 92% |
| mz.Cork 0.1 | 22 | 77% |
| js.PinBall 1.6 | 17 | 82% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 286 of 420 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 130 | 45% | 202 |
| joe.ADinosaur 1.0 | 31 | 11% | 35 |
| cs.Wren 1.0 | 28 | 10% | 44 |
| evd.X1 0.01 | 28 | 10% | 29 |
| mz.Cork 0.1 | 27 | 9% | 43 |
| js.PinBall 1.6 | 19 | 7% | 37 |
| PSW.Relentless 0.1 | 13 | 5% | 12 |
| jsal.Jsalbot 1.0 | 8 | 3% | 13 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.6 | 281 / 420 | 2.48 | 18.6% | 54660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 18.6% | 281 |
| myl.nano.Graviton 1.10 | 2.9 | 11.3% | 41 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.8% | 21 |
| ntc.Opposite 1.5 | 4.0 | 10.8% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.1% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 9 |
| disan.Chair 2.2.0 | 7.5 | 8.3% | 12 |
| DBall.NUKE 0.1 | 7.5 | 8.1% | 14 |
| donjezza.Muncho 1.0 | 8.9 | 6.5% | 21 |
| pbg.R2D2 1.0 | 9.9 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 25 / 35 | 4331 |
| 2 | 1 | 69.3 | 88.3 | 27 / 35 | 4818 |
| 3 | 1 | 67.0 | 81.3 | 22 / 35 | 4674 |
| 4 | 1 | 66.5 | 80.0 | 23 / 35 | 4244 |
| 5 | 1 | 70.0 | 92.4 | 27 / 35 | 4896 |
| 6 | 1 | 65.3 | 77.5 | 17 / 35 | 4183 |
| 7 | 1 | 68.8 | 85.4 | 26 / 35 | 4682 |
| 8 | 1 | 62.6 | 69.2 | 18 / 35 | 3837 |
| 9 | 1 | 68.4 | 87.0 | 25 / 35 | 4466 |
| 10 | 1 | 68.1 | 84.8 | 22 / 35 | 4719 |
| 11 | 1 | 68.9 | 85.7 | 25 / 35 | 5056 |
| 12 | 1 | 68.9 | 88.6 | 24 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 83 | 93% |
| myl.nano.Graviton 1.10 | 75 | 88% |
| ntc.Opposite 1.5 | 32 | 91% |
| DBall.NUKE 0.1 | 30 | 97% |
| donjezza.Muncho 1.0 | 29 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 25 | 92% |
| disan.Chair 2.2.0 | 22 | 86% |
| pfvicm.Sobieski 7.2.3b | 14 | 93% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 141 of 420 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 38 | 27% | 56 |
| stelo.AreaTargetingBot 1.1 | 22 | 16% | 90 |
| myl.nano.Graviton 1.10 | 20 | 14% | 73 |
| ntc.Opposite 1.5 | 16 | 11% | 52 |
| disan.Chair 2.2.0 | 13 | 9% | 27 |
| donjezza.Muncho 1.0 | 12 | 9% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 8% | 43 |
| DBall.NUKE 0.1 | 6 | 4% | 30 |
| pbg.R2D2 1.0 | 3 | 2% | 18 |

## Melee bench: F13

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 71.4 | 180 / 420 | 3.57 | 15.2% | 46226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.3 | 15.2% | 180 |
| oog.melee.Capulet 1.2 | 2.7 | 13.9% | 82 |
| kawigi.micro.Shiz 1.1 | 2.9 | 13.8% | 67 |
| yagami.Tidus 0.11 | 4.1 | 12.5% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.6% | 47 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 21 |
| stelo.MirrorNano 1.3 | 7.1 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.0 | 6.6% | 0 |
| kurios.DOSexe .9a | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 77.8 | 17 / 35 | 3734 |
| 2 | 1 | 63.2 | 71.1 | 16 / 35 | 3433 |
| 3 | 1 | 63.3 | 71.1 | 17 / 35 | 3938 |
| 4 | 1 | 62.5 | 68.6 | 12 / 35 | 3824 |
| 5 | 2 | 62.4 | 68.6 | 10 / 35 | 4006 |
| 6 | 2 | 62.8 | 68.9 | 14 / 35 | 3533 |
| 7 | 1 | 66.8 | 83.8 | 19 / 35 | 3885 |
| 8 | 1 | 63.1 | 68.3 | 17 / 35 | 3835 |
| 9 | 1 | 63.9 | 71.7 | 15 / 35 | 4206 |
| 10 | 2 | 61.9 | 65.4 | 14 / 35 | 3810 |
| 11 | 1 | 63.9 | 72.4 | 15 / 35 | 3804 |
| 12 | 1 | 64.1 | 69.2 | 14 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 71 | 62% |
| kawigi.micro.Shiz 1.1 | 48 | 94% |
| yagami.Tidus 0.11 | 46 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 86% |
| ejb.Polaris 1.0.1 | 10 | 90% |
| stelo.MirrorNano 1.3 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 243 of 420 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 105 | 43% | 161 |
| yagami.Tidus 0.11 | 37 | 15% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 11% | 57 |
| kawigi.micro.Shiz 1.1 | 22 | 9% | 51 |
| ejb.Polaris 1.0.1 | 22 | 9% | 42 |
| kurios.DOSexe .9a | 12 | 5% | 14 |
| stelo.MirrorNano 1.3 | 11 | 5% | 12 |
| step.nanoPri 1.0 | 7 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.7 | 275 / 420 | 2.65 | 17.6% | 50425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 17.6% | 275 |
| wee.Gem 1.8.4 | 2.8 | 12.1% | 52 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 28 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 36 |
| ratosh.Nobo 0.21 | 4.4 | 10.9% | 10 |
| m3thos.Eva00 1.1 | 6.1 | 9.5% | 10 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 3 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.9 | 22 / 35 | 4100 |
| 2 | 1 | 67.7 | 86.3 | 26 / 35 | 4278 |
| 3 | 1 | 66.5 | 84.4 | 23 / 35 | 4168 |
| 4 | 1 | 63.5 | 72.4 | 18 / 35 | 3952 |
| 5 | 1 | 65.6 | 79.7 | 21 / 35 | 4227 |
| 6 | 1 | 67.6 | 85.1 | 25 / 35 | 4370 |
| 7 | 1 | 65.9 | 81.0 | 21 / 35 | 3806 |
| 8 | 1 | 67.5 | 84.1 | 24 / 35 | 4343 |
| 9 | 1 | 62.9 | 69.8 | 17 / 35 | 4080 |
| 10 | 1 | 67.7 | 86.3 | 28 / 35 | 4320 |
| 11 | 1 | 66.6 | 83.2 | 24 / 35 | 4284 |
| 12 | 1 | 68.0 | 85.4 | 26 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 97 | 94% |
| wee.Gem 1.8.4 | 91 | 93% |
| wompi.Quokka 1.6 | 40 | 80% |
| ratosh.Nobo 0.21 | 33 | 88% |
| m3thos.Eva00 1.1 | 20 | 95% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 67% |

Hadur died in 147 of 420 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 25 | 17% | 53 |
| wompi.Quokka 1.6 | 22 | 15% | 53 |
| wee.Gem 1.8.4 | 17 | 12% | 101 |
| bzdp.Pansy 2.1 | 16 | 11% | 96 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 10% | 21 |
| maribo.FollowFire 1 | 15 | 10% | 16 |
| stelo.MyAgileRobot 0.2 | 13 | 9% | 19 |
| m3thos.Eva00 1.1 | 12 | 8% | 32 |
| bayen.UbaMicro 1.4 | 11 | 7% | 25 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 84.3 | 118 / 420 | 2.41 | 18.8% | 81101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.3% | 266 |
| hadur117.micro.SaorDK250 0.1 | 1.8 | 18.8% | 118 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 25 |
| ayk.WallHugger 1.0 | 4.4 | 9.6% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 1 |
| stuff.Vlad 0.1 | 5.9 | 8.3% | 2 |
| stelo.PianistNano 1.2 | 6.9 | 7.1% | 2 |
| drd.Dreadknoght 0.9 | 7.9 | 5.8% | 3 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 80.0 | 7 / 35 | 6303 |
| 2 | 2 | 71.0 | 88.6 | 13 / 35 | 7074 |
| 3 | 2 | 69.2 | 80.6 | 12 / 35 | 6759 |
| 4 | 2 | 69.3 | 84.4 | 6 / 35 | 6383 |
| 5 | 1 | 69.7 | 81.3 | 13 / 35 | 6664 |
| 6 | 2 | 69.6 | 82.9 | 6 / 35 | 6898 |
| 7 | 2 | 69.2 | 82.2 | 12 / 35 | 6574 |
| 8 | 2 | 70.0 | 90.8 | 12 / 35 | 6187 |
| 9 | 2 | 68.5 | 77.5 | 6 / 35 | 6876 |
| 10 | 1 | 71.2 | 90.2 | 15 / 35 | 7024 |
| 11 | 2 | 70.9 | 87.3 | 8 / 35 | 7113 |
| 12 | 2 | 70.1 | 85.7 | 8 / 35 | 7246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 228 | 27% |
| mz.NanoGod 2.02 | 28 | 68% |
| ayk.WallHugger 1.0 | 12 | 92% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| drd.Dreadknoght 0.9 | 8 | 88% |
| stelo.PianistNano 1.2 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 33% |
| cli.WasteOfAmmo 1.0 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 303 of 420 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 226 | 75% | 292 |
| mz.NanoGod 2.02 | 48 | 16% | 78 |
| ayk.WallHugger 1.0 | 14 | 5% | 24 |
| stelo.PianistNano 1.2 | 7 | 2% | 8 |
| exauge.GateKeeper 1.1.121g | 4 | 1% | 12 |
| stuff.Vlad 0.1 | 3 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.9 | 243 / 420 | 3.26 | 16.7% | 52722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 16.7% | 243 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 12.9% | 35 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.0% | 39 |
| bvh.micro.Freya 0.3 | 4.1 | 11.5% | 32 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.4 | 10.9% | 27 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 13 |
| conscience.Electron 1.3g | 7.3 | 7.9% | 5 |
| dl.BetterWalls 1.0 | 8.1 | 7.0% | 10 |
| ap.Frederick 1.1 | 8.4 | 6.9% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 69.5 | 17 / 35 | 3919 |
| 2 | 1 | 67.6 | 83.8 | 25 / 35 | 4266 |
| 3 | 1 | 62.7 | 69.8 | 18 / 35 | 3877 |
| 4 | 1 | 67.3 | 83.8 | 25 / 35 | 4359 |
| 5 | 1 | 67.2 | 81.0 | 26 / 35 | 4642 |
| 6 | 1 | 64.7 | 72.7 | 17 / 35 | 4686 |
| 7 | 1 | 64.8 | 74.9 | 21 / 35 | 4345 |
| 8 | 1 | 63.8 | 71.4 | 18 / 35 | 4299 |
| 9 | 1 | 63.7 | 69.2 | 17 / 35 | 4542 |
| 10 | 1 | 65.7 | 77.1 | 19 / 35 | 4751 |
| 11 | 1 | 62.7 | 66.0 | 18 / 35 | 4412 |
| 12 | 1 | 66.8 | 79.7 | 22 / 35 | 4624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 85 | 94% |
| dummy.micro.Sparrow 2.5 | 62 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 56 | 93% |
| bvh.micro.Freya 0.3 | 35 | 91% |
| ap.Frederick 1.1 | 11 | 100% |
| stelo.MirrorMicro 1.0 | 10 | 70% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 178 of 420 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 17% | 88 |
| mn.nano.perceptual.Impact 1.3.0 | 29 | 16% | 27 |
| conscience.Electron 1.3g | 28 | 16% | 38 |
| dl.BetterWalls 1.0 | 22 | 12% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 12% | 85 |
| bvh.micro.Freya 0.3 | 20 | 11% | 46 |
| dummy.micro.Sparrow 2.5 | 19 | 11% | 73 |
| stelo.MirrorMicro 1.0 | 8 | 4% | 22 |

## Melee bench: F17

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.3 | 312 / 420 | 2.05 | 20.8% | 77210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 20.8% | 312 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.2% | 28 |
| sul.Lunar 1.1 | 3.0 | 11.4% | 20 |
| supersample.SuperBoxBot 1.0 | 4.4 | 10.5% | 23 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.5% | 13 |
| dsw.StaticD 1.0 | 6.1 | 8.4% | 11 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.6 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.1% | 7 |
| sample.Corners 1.0 | 9.2 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.3 | 28 / 35 | 7123 |
| 2 | 1 | 68.7 | 81.0 | 24 / 35 | 6034 |
| 3 | 1 | 71.1 | 89.5 | 27 / 35 | 6132 |
| 4 | 1 | 68.9 | 83.5 | 22 / 35 | 5935 |
| 5 | 1 | 69.5 | 85.4 | 25 / 35 | 5949 |
| 6 | 1 | 72.0 | 92.1 | 27 / 35 | 6793 |
| 7 | 1 | 69.9 | 84.4 | 24 / 35 | 6491 |
| 8 | 1 | 72.3 | 95.9 | 29 / 35 | 6324 |
| 9 | 1 | 71.6 | 91.1 | 27 / 35 | 6626 |
| 10 | 1 | 70.6 | 85.7 | 25 / 35 | 6870 |
| 11 | 1 | 70.3 | 85.4 | 23 / 35 | 6284 |
| 12 | 1 | 72.1 | 92.4 | 31 / 35 | 6649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 110 | 90% |
| sul.Lunar 1.1 | 87 | 99% |
| supersample.SuperBoxBot 1.0 | 51 | 90% |
| sample.Corners 1.0 | 19 | 100% |
| sample.MyFirstRobot 1.0 | 18 | 89% |
| dsw.StaticD 1.0 | 18 | 61% |
| mme.NikeEnhanced 2.0 | 18 | 78% |
| sample.MyFirstJuniorRobot 1.0 | 14 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |

Hadur died in 110 of 420 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 28 | 25% | 131 |
| dsw.StaticD 1.0 | 22 | 20% | 41 |
| supersample.SuperBoxBot 1.0 | 20 | 18% | 52 |
| mme.NikeEnhanced 2.0 | 13 | 12% | 29 |
| sul.Lunar 1.1 | 8 | 7% | 102 |
| sample.MyFirstRobot 1.0 | 6 | 5% | 24 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 5% | 15 |
| sample.Corners 1.0 | 4 | 4% | 18 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 8 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDK250 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.5 | 225 / 420 | 2.84 | 17.9% | 68673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK250 0.1 | 1.0 | 17.9% | 225 |
| radnor.DoctorBob 1.42 | 2.9 | 12.7% | 51 |
| mld.Wisdom 1.0 | 3.3 | 12.2% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.4 | 11.9% | 47 |
| KiraNL.Chupacabra 0.4 | 5.1 | 10.3% | 20 |
| amz.NanoClone 1.41 | 5.4 | 10.1% | 19 |
| sample.Walls 1.0 | 7.3 | 7.8% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 9 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.7 | 17 / 35 | 5389 |
| 2 | 1 | 68.5 | 80.6 | 21 / 35 | 6197 |
| 3 | 1 | 67.4 | 81.9 | 16 / 35 | 5857 |
| 4 | 1 | 69.1 | 86.7 | 25 / 35 | 6052 |
| 5 | 1 | 66.2 | 73.7 | 16 / 35 | 6070 |
| 6 | 1 | 66.0 | 75.2 | 17 / 35 | 5851 |
| 7 | 1 | 65.9 | 79.0 | 17 / 35 | 5294 |
| 8 | 1 | 69.3 | 86.3 | 23 / 35 | 6122 |
| 9 | 1 | 65.1 | 71.7 | 17 / 35 | 5373 |
| 10 | 1 | 67.2 | 80.0 | 18 / 35 | 5761 |
| 11 | 1 | 66.0 | 78.4 | 16 / 35 | 5399 |
| 12 | 1 | 67.4 | 81.9 | 22 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 96 | 84% |
| radnor.DoctorBob 1.42 | 63 | 81% |
| mld.Wisdom 1.0 | 39 | 69% |
| amz.NanoClone 1.41 | 18 | 83% |
| KiraNL.Chupacabra 0.4 | 17 | 71% |
| sample.Walls 1.0 | 16 | 100% |
| jangs.ns51 1.0 | 15 | 93% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 195 of 420 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 55 | 28% | 86 |
| KiraNL.Chupacabra 0.4 | 37 | 19% | 54 |
| radnor.DoctorBob 1.42 | 34 | 17% | 95 |
| davidalves.net.DuelistNanoMelee 1.01 | 30 | 15% | 114 |
| amz.NanoClone 1.41 | 19 | 10% | 26 |
| jangs.ns51 1.0 | 9 | 5% | 17 |
| sample.Walls 1.0 | 6 | 3% | 19 |
| GarmBox.Oranges 1.0 | 5 | 3% | 7 |

