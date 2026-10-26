# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.3 | 261 / 420 | 2.23 | 20.1% | 77341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.1% | 261 |
| radnor.DoctorBob 1.42 | 2.5 | 14.7% | 64 |
| mz.AntiGrav 1.0 | 3.1 | 14.1% | 33 |
| mld.Infinity 2.2 | 3.4 | 13.8% | 53 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 7 |
| sample.Walls 1.0 | 6.3 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.1 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 92.1 | 24 / 35 | 6727 |
| 2 | 1 | 69.8 | 85.4 | 18 / 35 | 5958 |
| 3 | 1 | 73.2 | 94.0 | 28 / 35 | 7051 |
| 4 | 1 | 73.0 | 91.7 | 27 / 35 | 6967 |
| 5 | 1 | 72.3 | 93.3 | 25 / 35 | 6485 |
| 6 | 1 | 67.9 | 76.2 | 16 / 35 | 5967 |
| 7 | 1 | 67.7 | 76.2 | 17 / 35 | 5789 |
| 8 | 1 | 69.8 | 82.9 | 16 / 35 | 6385 |
| 9 | 1 | 72.2 | 90.2 | 26 / 35 | 6167 |
| 10 | 1 | 69.8 | 82.5 | 20 / 35 | 6389 |
| 11 | 1 | 71.1 | 86.3 | 21 / 35 | 6574 |
| 12 | 1 | 70.9 | 84.8 | 23 / 35 | 6882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 110 | 96% |
| mld.Infinity 2.2 | 91 | 86% |
| radnor.DoctorBob 1.42 | 77 | 65% |
| amz.NanoClone 1.41 | 15 | 80% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 160 of 420 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 82 | 51% | 155 |
| mld.Infinity 2.2 | 33 | 21% | 38 |
| mz.AntiGrav 1.0 | 17 | 11% | 132 |
| amz.NanoClone 1.41 | 17 | 11% | 36 |
| sample.Walls 1.0 | 5 | 3% | 24 |
| GarmBox.Oranges 1.0 | 3 | 2% | 8 |
| jangs.ns51 1.0 | 2 | 1% | 13 |
| arthord.MannyPacquiao Beta | 1 | 1% | 6 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.9 | 251 / 420 | 2.72 | 17.7% | 57843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.7% | 251 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.2% | 99 |
| mld.DustBunny 3.8 | 3.7 | 12.3% | 16 |
| maribo.melee.BMV 0.1 | 4.0 | 10.6% | 10 |
| zyx.nano.Ant 1.1 | 5.0 | 9.5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.8% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.2% | 16 |
| fullsail.SweetTea 1.1 | 7.8 | 7.7% | 10 |
| bzdp.BoxCar 2.0 | 8.3 | 7.0% | 2 |
| cs.Grudge 1.0 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.6 | 17 / 35 | 5141 |
| 2 | 1 | 68.2 | 82.2 | 25 / 35 | 4988 |
| 3 | 1 | 64.9 | 77.5 | 18 / 35 | 4251 |
| 4 | 1 | 68.3 | 87.6 | 22 / 35 | 5097 |
| 5 | 1 | 66.4 | 76.5 | 21 / 35 | 4982 |
| 6 | 1 | 66.9 | 81.6 | 22 / 35 | 4558 |
| 7 | 1 | 63.9 | 73.7 | 18 / 35 | 4297 |
| 8 | 1 | 68.8 | 88.9 | 25 / 35 | 5220 |
| 9 | 1 | 69.0 | 87.3 | 25 / 35 | 5331 |
| 10 | 2 | 59.9 | 57.8 | 11 / 35 | 4200 |
| 11 | 1 | 69.6 | 93.7 | 24 / 35 | 4985 |
| 12 | 1 | 68.4 | 88.9 | 23 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 128 | 73% |
| mld.DustBunny 3.8 | 83 | 94% |
| djdjdj.NanoSkunk10 1.0 | 25 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 22 | 82% |
| maribo.melee.BMV 0.1 | 17 | 82% |
| fullsail.SweetTea 1.1 | 13 | 92% |
| zyx.nano.Ant 1.1 | 12 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 170 of 420 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 27% | 137 |
| zyx.nano.Ant 1.1 | 26 | 15% | 38 |
| mld.DustBunny 3.8 | 21 | 12% | 91 |
| fullsail.SweetTea 1.1 | 19 | 11% | 33 |
| maribo.melee.BMV 0.1 | 15 | 9% | 30 |
| cs.Grudge 1.0 | 15 | 9% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 6% | 31 |
| djdjdj.NanoSkunk10 1.0 | 10 | 6% | 35 |
| bzdp.BoxCar 2.0 | 7 | 4% | 9 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.6 | 257 / 420 | 2.57 | 19.0% | 65416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 257 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 76 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 12.2% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 4.1 | 10.9% | 26 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.4% | 23 |
| fm.mammillarias 1.3 | 5.9 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 12 |
| sample.Tracker 1.0 | 9.4 | 4.9% | 0 |
| sample.Fire 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.8 | 18 / 35 | 5011 |
| 2 | 1 | 67.8 | 81.6 | 23 / 35 | 4677 |
| 3 | 1 | 70.6 | 88.3 | 22 / 35 | 6341 |
| 4 | 1 | 68.5 | 80.6 | 22 / 35 | 5550 |
| 5 | 1 | 68.7 | 81.9 | 20 / 35 | 5423 |
| 6 | 1 | 68.2 | 80.6 | 15 / 35 | 5779 |
| 7 | 1 | 69.4 | 85.1 | 25 / 35 | 5361 |
| 8 | 1 | 70.1 | 87.3 | 24 / 35 | 5552 |
| 9 | 1 | 70.4 | 86.7 | 24 / 35 | 5822 |
| 10 | 1 | 67.7 | 78.4 | 22 / 35 | 5397 |
| 11 | 1 | 66.8 | 79.0 | 20 / 35 | 4845 |
| 12 | 1 | 69.1 | 83.8 | 22 / 35 | 5658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 104 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 68 | 94% |
| myl.nano.KomoriNinja 1.1 | 32 | 81% |
| cb.nano.Insomnia 1.0 | 31 | 74% |
| sp.Nanos.Ember 1.1 | 20 | 75% |
| fm.mammillarias 1.3 | 13 | 100% |
| cs.sheldor.Talon 1.1 | 10 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 164 of 420 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 27% | 150 |
| stelo.SoRobotNanoMelee 1.2 | 25 | 15% | 68 |
| myl.nano.KomoriNinja 1.1 | 23 | 14% | 76 |
| cb.nano.Insomnia 1.0 | 18 | 11% | 18 |
| fm.mammillarias 1.3 | 17 | 10% | 26 |
| cs.sheldor.Talon 1.1 | 12 | 7% | 24 |
| sample.Fire 1.0 | 11 | 7% | 19 |
| sp.Nanos.Ember 1.1 | 8 | 5% | 26 |
| sample.Tracker 1.0 | 4 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.0 | 265 / 420 | 2.35 | 19.7% | 72723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.7% | 265 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 34 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.7% | 40 |
| stelo.SoJNanoMelee 1.1 | 5.1 | 9.4% | 33 |
| tj.zombie1n 1.0.1 | 5.3 | 9.5% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.1 | 8.0% | 8 |
| yk.JahMicro 1.0 | 7.3 | 7.6% | 11 |
| repositorio.NanoStep 1.0 | 8.9 | 6.3% | 2 |
| sample.VelociRobot 1.0 | 9.9 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.5 | 22 / 35 | 6281 |
| 2 | 1 | 71.3 | 92.4 | 26 / 35 | 6170 |
| 3 | 1 | 68.1 | 82.5 | 20 / 35 | 5454 |
| 4 | 1 | 67.6 | 78.1 | 16 / 35 | 6198 |
| 5 | 1 | 71.1 | 92.4 | 26 / 35 | 6340 |
| 6 | 1 | 70.7 | 88.9 | 21 / 35 | 6600 |
| 7 | 1 | 67.3 | 79.0 | 22 / 35 | 5598 |
| 8 | 1 | 69.9 | 87.6 | 25 / 35 | 6032 |
| 9 | 1 | 71.4 | 91.4 | 29 / 35 | 6319 |
| 10 | 1 | 67.1 | 76.2 | 20 / 35 | 5786 |
| 11 | 1 | 69.8 | 88.3 | 23 / 35 | 5943 |
| 12 | 1 | 67.9 | 80.3 | 15 / 35 | 6002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 109 | 90% |
| stelo.SoJNanoMelee 1.1 | 72 | 86% |
| tvv.micro.Antares 1.1.1 | 46 | 72% |
| tj.zombie1n 1.0.1 | 40 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 24 | 83% |
| yk.JahMicro 1.0 | 11 | 82% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 156 of 420 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 44 | 28% | 148 |
| stelo.SoJNanoMelee 1.1 | 37 | 24% | 71 |
| tvv.micro.Antares 1.1.1 | 36 | 23% | 89 |
| tj.zombie1n 1.0.1 | 17 | 11% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 6% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 5% | 37 |
| yk.JahMicro 1.0 | 3 | 2% | 11 |
| repositorio.NanoStep 1.0 | 1 | 1% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 67.1 | 170 / 420 | 3.96 | 15.1% | 54046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 15.1% | 170 |
| oog.melee.Corsair 1.0 | 2.5 | 12.4% | 57 |
| ahf.NanoAndrew .4 | 2.7 | 12.0% | 69 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.8% | 41 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 34 |
| EBBU.Sim2 1.02 | 6.3 | 9.7% | 15 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.3% | 23 |
| robar.nano.Assertive_Melee 0.2 | 7.4 | 9.0% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 62.5 | 12 / 35 | 4562 |
| 2 | 1 | 63.7 | 71.1 | 17 / 35 | 4595 |
| 3 | 1 | 60.9 | 63.8 | 13 / 35 | 4234 |
| 4 | 2 | 60.1 | 62.9 | 10 / 35 | 4245 |
| 5 | 1 | 62.2 | 68.9 | 15 / 35 | 4429 |
| 6 | 1 | 64.0 | 72.1 | 14 / 35 | 4842 |
| 7 | 1 | 59.3 | 59.7 | 11 / 35 | 4249 |
| 8 | 1 | 63.8 | 71.7 | 16 / 35 | 4662 |
| 9 | 1 | 62.5 | 67.9 | 16 / 35 | 4302 |
| 10 | 1 | 64.1 | 71.1 | 18 / 35 | 4878 |
| 11 | 1 | 61.8 | 67.3 | 14 / 35 | 4322 |
| 12 | 1 | 62.3 | 66.0 | 14 / 35 | 4726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 63 | 79% |
| oog.melee.Corsair 1.0 | 45 | 69% |
| ahf.NanoAndrew .4 | 45 | 71% |
| sam.Samspin 1.0 | 24 | 88% |
| EBBU.Sim2 1.02 | 17 | 88% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| sample.TrackFire 1.0 | 6 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 253 of 420 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 44 | 17% | 87 |
| oog.melee.Corsair 1.0 | 38 | 15% | 83 |
| robar.nano.Assertive_Melee 0.2 | 37 | 15% | 46 |
| ahf.NanoAndrew .4 | 36 | 14% | 75 |
| zyx.nano.BacillusComma 1.0 | 30 | 12% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 9% | 20 |
| EBBU.Sim2 1.02 | 21 | 8% | 31 |
| sam.Samspin 1.0 | 19 | 8% | 29 |
| sample.TrackFire 1.0 | 5 | 2% | 10 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.1 | 259 / 420 | 2.34 | 18.6% | 59675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.6% | 259 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.5% | 50 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 32 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.9% | 40 |
| winamp32.micro.MicroMacro 1.0 | 5.1 | 9.4% | 17 |
| fm.claire 1.7 | 6.3 | 8.1% | 4 |
| arthord.NanoSatanMelee Beta | 6.6 | 8.2% | 4 |
| sample.SpinBot 1.0 | 7.6 | 7.4% | 10 |
| pa.Improved 1.0 | 9.1 | 6.3% | 3 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.1 | 20 / 35 | 4569 |
| 2 | 1 | 68.3 | 85.1 | 20 / 35 | 4957 |
| 3 | 1 | 69.5 | 91.4 | 25 / 35 | 5008 |
| 4 | 1 | 67.1 | 80.0 | 20 / 35 | 5271 |
| 5 | 1 | 67.9 | 83.2 | 22 / 35 | 4935 |
| 6 | 1 | 66.4 | 81.9 | 18 / 35 | 4669 |
| 7 | 1 | 67.8 | 84.4 | 20 / 35 | 5140 |
| 8 | 1 | 68.2 | 85.1 | 22 / 35 | 5169 |
| 9 | 1 | 67.2 | 83.5 | 19 / 35 | 4829 |
| 10 | 1 | 70.4 | 92.7 | 28 / 35 | 5231 |
| 11 | 1 | 68.2 | 87.6 | 22 / 35 | 4816 |
| 12 | 1 | 68.8 | 89.2 | 23 / 35 | 5081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 121 | 93% |
| oog.melee.CapuletDroid 1.1 | 64 | 80% |
| gh.nano.Grofvuil 0.2 | 46 | 83% |
| arthord.NanoSatanMelee Beta | 22 | 91% |
| winamp32.micro.MicroMacro 1.0 | 17 | 65% |
| fm.claire 1.7 | 11 | 82% |
| sample.SpinBot 1.0 | 9 | 100% |
| pa.Improved 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 6 | 50% |

Hadur died in 164 of 420 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 23% | 140 |
| gh.nano.Grofvuil 0.2 | 35 | 21% | 91 |
| oog.melee.CapuletDroid 1.1 | 23 | 14% | 32 |
| winamp32.micro.MicroMacro 1.0 | 17 | 10% | 41 |
| arthord.NanoSatanMelee Beta | 15 | 9% | 37 |
| fm.claire 1.7 | 12 | 7% | 17 |
| sample.SpinBot 1.0 | 11 | 7% | 21 |
| kurios.DOSexe .9b | 9 | 5% | 25 |
| pa.Improved 1.0 | 2 | 1% | 13 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.1 | 170 / 420 | 2.97 | 17.0% | 60553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.0% | 170 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 104 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 49 |
| mz.MicroGodMelee 1 | 3.5 | 13.2% | 74 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 8 |
| caimano.Furia_Ceca 0.22 | 5.9 | 8.1% | 3 |
| acogdev.alpha 0.2 | 7.8 | 6.5% | 2 |
| el.JumpShoot 0.2 | 8.0 | 6.3% | 4 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 6 |
| fire219.CatBot 1.0 | 9.1 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 74.9 | 12 / 35 | 4908 |
| 2 | 1 | 68.6 | 88.3 | 17 / 35 | 5232 |
| 3 | 1 | 66.6 | 76.5 | 12 / 35 | 5620 |
| 4 | 1 | 66.0 | 79.7 | 16 / 35 | 4881 |
| 5 | 1 | 65.5 | 77.1 | 15 / 35 | 4833 |
| 6 | 1 | 65.6 | 77.1 | 13 / 35 | 5304 |
| 7 | 1 | 65.5 | 79.7 | 13 / 35 | 4812 |
| 8 | 1 | 64.9 | 74.3 | 12 / 35 | 5041 |
| 9 | 2 | 64.7 | 75.2 | 8 / 35 | 4725 |
| 10 | 1 | 67.1 | 80.0 | 18 / 35 | 5319 |
| 11 | 1 | 66.7 | 81.6 | 19 / 35 | 4868 |
| 12 | 1 | 65.0 | 72.4 | 15 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 82 | 94% |
| mz.MicroGodMelee 1 | 78 | 41% |
| gh.micro.Gruweltje 0.7 | 61 | 26% |
| DBall.Anarchy 0.1 | 22 | 91% |
| el.JumpShoot 0.2 | 10 | 80% |
| mbro.Detektor3 0.1.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 83% |
| acogdev.alpha 0.2 | 5 | 100% |

Hadur died in 250 of 420 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 79 | 32% | 119 |
| gh.micro.Gruweltje 0.7 | 75 | 30% | 109 |
| spinnercat.micro.Tyger 0.1 | 36 | 14% | 84 |
| fire219.CatBot 1.0 | 12 | 5% | 13 |
| mbro.Detektor3 0.1.1 | 11 | 4% | 20 |
| caimano.Furia_Ceca 0.22 | 11 | 4% | 15 |
| DBall.Anarchy 0.1 | 10 | 4% | 34 |
| acogdev.alpha 0.2 | 10 | 4% | 18 |
| el.JumpShoot 0.2 | 6 | 2% | 8 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 69.9 | 180 / 420 | 3.71 | 15.7% | 56980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.6 | 15.4% | 96 |
| hadur117.micro.SaorC 0.1 | 1.6 | 15.7% | 180 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 14.3% | 76 |
| germ.TheMind .2 | 4.8 | 9.7% | 20 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 9.0% | 14 |
| awesomeness.Elite 1.0 | 6.0 | 8.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.8% | 10 |
| stelo.UntouchableNano 1.3 | 7.4 | 7.8% | 8 |
| sample.Crazy 1.0 | 8.9 | 6.6% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 67.6 | 16 / 35 | 5032 |
| 2 | 2 | 64.3 | 71.7 | 16 / 35 | 4668 |
| 3 | 2 | 61.1 | 63.5 | 14 / 35 | 4301 |
| 4 | 2 | 63.1 | 68.9 | 15 / 35 | 4557 |
| 5 | 1 | 64.2 | 74.0 | 16 / 35 | 4597 |
| 6 | 2 | 62.6 | 68.3 | 13 / 35 | 4402 |
| 7 | 1 | 64.2 | 73.0 | 15 / 35 | 4807 |
| 8 | 2 | 64.4 | 72.4 | 16 / 35 | 4601 |
| 9 | 2 | 63.2 | 68.6 | 13 / 35 | 4504 |
| 10 | 1 | 63.7 | 68.6 | 14 / 35 | 5324 |
| 11 | 1 | 66.1 | 74.0 | 21 / 35 | 4871 |
| 12 | 1 | 63.9 | 68.3 | 11 / 35 | 5316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 134 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 67% |
| germ.TheMind .2 | 19 | 89% |
| qualidafial.MajorDick 1.0.1 | 13 | 77% |
| stelo.UntouchableNano 1.3 | 12 | 92% |
| awesomeness.Elite 1.0 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 7 | 86% |
| sample.Crazy 1.0 | 5 | 100% |

Hadur died in 241 of 420 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 40% | 180 |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 20% | 83 |
| germ.TheMind .2 | 25 | 10% | 39 |
| lrem.micro.MoggFanatic 0.2 | 22 | 9% | 33 |
| awesomeness.Elite 1.0 | 19 | 8% | 27 |
| stelo.UntouchableNano 1.3 | 13 | 5% | 21 |
| qualidafial.MajorDick 1.0.1 | 8 | 3% | 13 |
| sample.Crazy 1.0 | 5 | 2% | 15 |
| mym.EdgeStalker 1.0 | 5 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.3 | 270 / 420 | 2.15 | 19.2% | 55488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.2% | 270 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 33 |
| maribo.IotaCT 1.1 | 4.6 | 10.5% | 28 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.6 | 8.3% | 9 |
| stelo.PatternRobot 1.0 | 7.9 | 7.8% | 14 |
| spinnercat.Omen 1.0 | 8.3 | 7.7% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.3 | 28 / 35 | 4795 |
| 2 | 1 | 70.3 | 87.9 | 23 / 35 | 5012 |
| 3 | 1 | 69.4 | 90.5 | 23 / 35 | 4366 |
| 4 | 1 | 70.8 | 91.7 | 26 / 35 | 4828 |
| 5 | 1 | 69.7 | 88.9 | 23 / 35 | 4611 |
| 6 | 1 | 70.1 | 89.5 | 24 / 35 | 4655 |
| 7 | 1 | 70.3 | 89.8 | 24 / 35 | 4902 |
| 8 | 1 | 68.7 | 85.4 | 22 / 35 | 4350 |
| 9 | 1 | 66.2 | 77.8 | 18 / 35 | 3861 |
| 10 | 1 | 67.8 | 81.0 | 17 / 35 | 4630 |
| 11 | 1 | 68.7 | 85.4 | 22 / 35 | 4648 |
| 12 | 1 | 69.2 | 86.0 | 20 / 35 | 4830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 132 | 89% |
| nz.jdc.nano.GridFu 1.0 | 78 | 83% |
| maribo.IotaCT 1.1 | 27 | 70% |
| stelo.PatternRobot 1.0 | 23 | 83% |
| timmit.nano.TimDog 0.33 | 19 | 84% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 100% |
| ratosh.Wesco 1.4 | 14 | 79% |
| spinnercat.Omen 1.0 | 8 | 100% |

Hadur died in 151 of 420 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 39 | 26% | 114 |
| timmit.nano.TimDog 0.33 | 32 | 21% | 54 |
| nz.jdc.nano.GridFu 1.0 | 25 | 17% | 111 |
| maribo.IotaCT 1.1 | 16 | 11% | 39 |
| stelo.PatternRobot 1.0 | 14 | 9% | 29 |
| ratosh.Wesco 1.4 | 11 | 7% | 35 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 5% | 21 |
| spinnercat.Omen 1.0 | 6 | 4% | 13 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 324 / 420 | 1.87 | 20.6% | 70666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.6% | 324 |
| tvv.nano.Polaris 1.2 | 2.1 | 12.7% | 48 |
| baal.nano.N 1.42 | 3.2 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 4 |
| zyx.micro.Ant 1.1 | 5.7 | 9.1% | 12 |
| sanja.First 0.1 | 6.3 | 8.4% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.9% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.3% | 13 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.4% | 2 |
| sample.RamFire 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.8 | 27 / 35 | 6128 |
| 2 | 1 | 71.0 | 93.7 | 29 / 35 | 5775 |
| 3 | 1 | 70.9 | 92.4 | 28 / 35 | 5965 |
| 4 | 1 | 71.7 | 97.8 | 31 / 35 | 5831 |
| 5 | 1 | 69.0 | 85.4 | 24 / 35 | 5658 |
| 6 | 1 | 69.5 | 86.7 | 26 / 35 | 5864 |
| 7 | 1 | 70.2 | 87.6 | 26 / 35 | 6279 |
| 8 | 1 | 69.8 | 88.6 | 26 / 35 | 5829 |
| 9 | 1 | 70.9 | 91.7 | 28 / 35 | 5883 |
| 10 | 1 | 70.8 | 92.7 | 27 / 35 | 5847 |
| 11 | 1 | 70.6 | 88.9 | 27 / 35 | 6083 |
| 12 | 1 | 69.3 | 88.6 | 25 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 85 | 78% |
| baal.nano.N 1.42 | 68 | 96% |
| cvt.Firsty 1.0 | 60 | 90% |
| sanja.First 0.1 | 42 | 93% |
| zyx.micro.Ant 1.1 | 38 | 95% |
| amk.Punbot.Punbot 0.01 | 27 | 96% |
| Grystrion.TrackerWO 1.0 | 25 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 98 of 420 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 39% | 125 |
| zyx.micro.Ant 1.1 | 17 | 17% | 72 |
| Grystrion.TrackerWO 1.0 | 11 | 11% | 30 |
| cvt.Firsty 1.0 | 9 | 9% | 42 |
| baal.nano.N 1.42 | 8 | 8% | 67 |
| sample.RamFire 1.0 | 7 | 7% | 8 |
| sanja.First 0.1 | 5 | 5% | 38 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 16 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 61.4 | 94 / 420 | 4.48 | 13.1% | 49130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.3% | 172 |
| cs.Wren 1.0 | 2.3 | 13.4% | 60 |
| hadur117.micro.SaorC 0.1 | 2.8 | 13.1% | 94 |
| js.PinBall 1.6 | 4.3 | 11.7% | 32 |
| mz.Cork 0.1 | 4.5 | 11.5% | 31 |
| joe.ADinosaur 1.0 | 5.8 | 9.8% | 9 |
| evd.X1 0.01 | 7.2 | 8.1% | 11 |
| jsal.Jsalbot 1.0 | 7.9 | 6.9% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 7 |
| PSW.Relentless 0.1 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 60.3 | 4 / 35 | 3654 |
| 2 | 2 | 58.1 | 60.3 | 6 / 35 | 3791 |
| 3 | 4 | 56.2 | 54.6 | 6 / 35 | 3833 |
| 4 | 3 | 59.1 | 61.6 | 10 / 35 | 4258 |
| 5 | 3 | 59.0 | 61.9 | 7 / 35 | 4074 |
| 6 | 2 | 59.9 | 64.1 | 8 / 35 | 4064 |
| 7 | 2 | 61.7 | 69.5 | 11 / 35 | 4164 |
| 8 | 3 | 59.1 | 61.3 | 10 / 35 | 3974 |
| 9 | 3 | 58.3 | 58.1 | 7 / 35 | 4312 |
| 10 | 2 | 59.2 | 60.6 | 8 / 35 | 4272 |
| 11 | 2 | 59.1 | 59.4 | 9 / 35 | 4499 |
| 12 | 3 | 60.4 | 64.8 | 8 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 100 | 34% |
| cs.Wren 1.0 | 40 | 85% |
| js.PinBall 1.6 | 14 | 50% |
| mz.Cork 0.1 | 10 | 70% |
| joe.ADinosaur 1.0 | 10 | 80% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 326 of 420 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 126 | 39% | 160 |
| joe.ADinosaur 1.0 | 47 | 14% | 49 |
| js.PinBall 1.6 | 40 | 12% | 51 |
| cs.Wren 1.0 | 31 | 10% | 52 |
| mz.Cork 0.1 | 31 | 10% | 44 |
| evd.X1 0.01 | 25 | 8% | 25 |
| PSW.Relentless 0.1 | 15 | 5% | 15 |
| jsal.Jsalbot 1.0 | 9 | 3% | 14 |
| donjezza.Jezza 1.0 | 2 | 1% | 9 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.5 | 226 / 420 | 2.94 | 17.4% | 53691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.4% | 226 |
| ntc.Opposite 1.5 | 3.3 | 11.4% | 16 |
| myl.nano.Graviton 1.10 | 3.5 | 11.5% | 55 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.9% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.0% | 17 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 15 |
| DBall.NUKE 0.1 | 7.6 | 8.1% | 15 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 19 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.4 | 21 / 35 | 4782 |
| 2 | 1 | 63.9 | 69.2 | 15 / 35 | 4818 |
| 3 | 1 | 65.9 | 77.5 | 19 / 35 | 4595 |
| 4 | 1 | 68.7 | 87.0 | 23 / 35 | 4733 |
| 5 | 1 | 66.5 | 79.4 | 18 / 35 | 4727 |
| 6 | 1 | 67.2 | 81.3 | 21 / 35 | 4624 |
| 7 | 1 | 67.4 | 83.2 | 23 / 35 | 4573 |
| 8 | 1 | 62.8 | 74.0 | 13 / 35 | 3634 |
| 9 | 1 | 67.8 | 84.1 | 22 / 35 | 4512 |
| 10 | 1 | 62.7 | 68.9 | 16 / 35 | 4067 |
| 11 | 1 | 65.1 | 77.8 | 17 / 35 | 3886 |
| 12 | 1 | 65.3 | 75.2 | 18 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 70 | 77% |
| myl.nano.Graviton 1.10 | 61 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 38 | 97% |
| ntc.Opposite 1.5 | 29 | 93% |
| disan.Chair 2.2.0 | 17 | 94% |
| donjezza.Muncho 1.0 | 17 | 59% |
| DBall.NUKE 0.1 | 17 | 100% |
| pfvicm.Sobieski 7.2.3b | 12 | 83% |
| pbg.R2D2 1.0 | 5 | 80% |

Hadur died in 197 of 420 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 48 | 24% | 67 |
| stelo.AreaTargetingBot 1.1 | 32 | 16% | 71 |
| ntc.Opposite 1.5 | 30 | 15% | 54 |
| myl.nano.Graviton 1.10 | 25 | 13% | 68 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 10% | 49 |
| disan.Chair 2.2.0 | 13 | 7% | 34 |
| donjezza.Muncho 1.0 | 12 | 6% | 22 |
| DBall.NUKE 0.1 | 9 | 5% | 33 |
| pbg.R2D2 1.0 | 7 | 4% | 20 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 65.0 | 125 / 420 | 4.15 | 13.9% | 45220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.2 | 14.4% | 115 |
| hadur117.micro.SaorC 0.1 | 2.3 | 13.9% | 125 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 57 |
| yagami.Tidus 0.11 | 4.6 | 12.0% | 25 |
| ejb.Polaris 1.0.1 | 5.5 | 10.9% | 21 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.6 | 57.5 | 6 / 35 | 3432 |
| 2 | 2 | 62.6 | 66.7 | 12 / 35 | 4193 |
| 3 | 1 | 62.7 | 66.0 | 16 / 35 | 3684 |
| 4 | 1 | 61.5 | 66.3 | 11 / 35 | 3659 |
| 5 | 3 | 59.0 | 58.7 | 6 / 35 | 3647 |
| 6 | 1 | 63.5 | 72.4 | 15 / 35 | 3833 |
| 7 | 4 | 58.7 | 59.4 | 6 / 35 | 3589 |
| 8 | 1 | 62.7 | 69.2 | 12 / 35 | 3910 |
| 9 | 4 | 59.8 | 60.0 | 9 / 35 | 3697 |
| 10 | 1 | 63.0 | 70.5 | 12 / 35 | 3878 |
| 11 | 2 | 62.7 | 68.6 | 10 / 35 | 3958 |
| 12 | 2 | 60.7 | 64.8 | 10 / 35 | 3740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 39% |
| kawigi.micro.Shiz 1.1 | 48 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 71% |
| yagami.Tidus 0.11 | 25 | 84% |
| ejb.Polaris 1.0.1 | 21 | 62% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 296 of 420 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 111 | 38% | 138 |
| yagami.Tidus 0.11 | 42 | 14% | 61 |
| ejb.Polaris 1.0.1 | 36 | 12% | 56 |
| kawigi.micro.Shiz 1.1 | 33 | 11% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 10% | 58 |
| stelo.MirrorNano 1.3 | 17 | 6% | 19 |
| kurios.DOSexe .9a | 14 | 5% | 15 |
| step.nanoPri 1.0 | 12 | 4% | 13 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.8 | 215 / 420 | 3.17 | 16.2% | 48647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.2% | 215 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 58 |
| wompi.Quokka 1.6 | 3.3 | 11.9% | 51 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 40 |
| ratosh.Nobo 0.21 | 4.5 | 11.3% | 19 |
| m3thos.Eva00 1.1 | 6.1 | 9.8% | 18 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.0 | 22 / 35 | 4140 |
| 2 | 1 | 61.9 | 68.9 | 16 / 35 | 3785 |
| 3 | 1 | 65.3 | 77.5 | 21 / 35 | 4236 |
| 4 | 1 | 66.1 | 78.7 | 20 / 35 | 4314 |
| 5 | 1 | 64.0 | 77.8 | 16 / 35 | 3846 |
| 6 | 1 | 62.9 | 72.1 | 17 / 35 | 3817 |
| 7 | 1 | 63.4 | 72.1 | 15 / 35 | 4023 |
| 8 | 1 | 65.5 | 80.0 | 18 / 35 | 4095 |
| 9 | 1 | 65.9 | 79.7 | 18 / 35 | 4407 |
| 10 | 1 | 65.0 | 75.2 | 20 / 35 | 4301 |
| 11 | 1 | 62.5 | 73.3 | 17 / 35 | 3686 |
| 12 | 1 | 62.9 | 74.0 | 15 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 73 | 86% |
| bzdp.Pansy 2.1 | 71 | 87% |
| wompi.Quokka 1.6 | 45 | 78% |
| ratosh.Nobo 0.21 | 33 | 94% |
| m3thos.Eva00 1.1 | 15 | 80% |
| bayen.UbaMicro 1.4 | 10 | 60% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 207 of 420 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 35 | 17% | 61 |
| bzdp.Pansy 2.1 | 29 | 14% | 90 |
| wee.Gem 1.8.4 | 28 | 14% | 92 |
| bayen.UbaMicro 1.4 | 28 | 14% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 26 | 13% | 28 |
| ratosh.Nobo 0.21 | 16 | 8% | 46 |
| maribo.FollowFire 1 | 16 | 8% | 18 |
| m3thos.Eva00 1.1 | 15 | 7% | 23 |
| stelo.MyAgileRobot 0.2 | 14 | 7% | 18 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 78.8 | 87 / 420 | 2.91 | 17.6% | 78324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 20.2% | 274 |
| hadur117.micro.SaorC 0.1 | 2.0 | 17.6% | 87 |
| mz.NanoGod 2.02 | 2.9 | 14.7% | 42 |
| ayk.WallHugger 1.0 | 4.7 | 10.2% | 6 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 6 |
| stuff.Vlad 0.1 | 5.5 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 2 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 81.0 | 9 / 35 | 6304 |
| 2 | 2 | 67.8 | 76.5 | 7 / 35 | 6860 |
| 3 | 2 | 67.8 | 78.4 | 6 / 35 | 6463 |
| 4 | 3 | 65.4 | 71.1 | 5 / 35 | 5598 |
| 5 | 1 | 71.1 | 88.9 | 10 / 35 | 7317 |
| 6 | 2 | 68.2 | 76.8 | 9 / 35 | 6997 |
| 7 | 2 | 68.4 | 79.7 | 8 / 35 | 6508 |
| 8 | 2 | 68.3 | 81.3 | 7 / 35 | 6164 |
| 9 | 2 | 68.7 | 78.4 | 7 / 35 | 6655 |
| 10 | 2 | 66.9 | 75.2 | 6 / 35 | 6157 |
| 11 | 2 | 67.3 | 78.1 | 6 / 35 | 5995 |
| 12 | 2 | 69.1 | 80.3 | 7 / 35 | 7306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 205 | 20% |
| mz.NanoGod 2.02 | 38 | 55% |
| ayk.WallHugger 1.0 | 9 | 78% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |

Hadur died in 334 of 420 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 213 | 64% | 261 |
| mz.NanoGod 2.02 | 75 | 22% | 98 |
| ayk.WallHugger 1.0 | 16 | 5% | 24 |
| exauge.GateKeeper 1.1.121g | 13 | 4% | 16 |
| stuff.Vlad 0.1 | 10 | 3% | 13 |
| stelo.PianistNano 1.2 | 6 | 2% | 7 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.8 | 215 / 420 | 3.45 | 16.3% | 54426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 215 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.8% | 46 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.6% | 43 |
| bvh.micro.Freya 0.3 | 3.6 | 11.6% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.2% | 29 |
| stelo.MirrorMicro 1.0 | 5.6 | 9.6% | 18 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 3 |
| ap.Frederick 1.1 | 8.4 | 7.0% | 22 |
| dl.BetterWalls 1.0 | 9.0 | 6.6% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.2 | 20 / 35 | 5063 |
| 2 | 1 | 64.3 | 73.3 | 20 / 35 | 4326 |
| 3 | 1 | 65.1 | 76.8 | 20 / 35 | 4281 |
| 4 | 1 | 64.1 | 70.8 | 18 / 35 | 4748 |
| 5 | 1 | 64.3 | 73.7 | 19 / 35 | 4336 |
| 6 | 1 | 66.5 | 77.8 | 22 / 35 | 4957 |
| 7 | 1 | 61.5 | 65.7 | 16 / 35 | 3897 |
| 8 | 1 | 66.3 | 75.6 | 22 / 35 | 4941 |
| 9 | 1 | 63.8 | 72.1 | 13 / 35 | 4734 |
| 10 | 1 | 59.7 | 60.6 | 13 / 35 | 4046 |
| 11 | 1 | 65.6 | 75.6 | 18 / 35 | 4756 |
| 12 | 1 | 62.2 | 68.3 | 14 / 35 | 4341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 84 | 89% |
| dummy.micro.Sparrow 2.5 | 53 | 85% |
| bvh.micro.Freya 0.3 | 42 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 35 | 89% |
| ap.Frederick 1.1 | 19 | 84% |
| stelo.MirrorMicro 1.0 | 14 | 57% |
| conscience.Electron 1.3g | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 206 of 420 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 17% | 102 |
| dummy.micro.Sparrow 2.5 | 35 | 17% | 80 |
| mn.nano.perceptual.Impact 1.3.0 | 32 | 16% | 32 |
| conscience.Electron 1.3g | 29 | 14% | 39 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 9% | 67 |
| bvh.micro.Freya 0.3 | 18 | 9% | 41 |
| stelo.MirrorMicro 1.0 | 18 | 9% | 30 |
| dl.BetterWalls 1.0 | 17 | 8% | 27 |
| ap.Frederick 1.1 | 3 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.2 | 282 / 420 | 2.33 | 20.2% | 76699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.2% | 282 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 45 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 32 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.1% | 20 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 10 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 8 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 6 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.0% | 14 |
| sample.Corners 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.4 | 23 / 35 | 6107 |
| 2 | 1 | 70.7 | 88.3 | 26 / 35 | 6265 |
| 3 | 1 | 68.7 | 80.6 | 22 / 35 | 6175 |
| 4 | 1 | 70.2 | 85.4 | 22 / 35 | 6490 |
| 5 | 1 | 69.9 | 80.6 | 23 / 35 | 6753 |
| 6 | 1 | 71.1 | 86.3 | 26 / 35 | 6757 |
| 7 | 1 | 70.4 | 87.0 | 24 / 35 | 6490 |
| 8 | 1 | 69.3 | 85.1 | 19 / 35 | 6067 |
| 9 | 1 | 70.6 | 87.3 | 22 / 35 | 6387 |
| 10 | 1 | 70.4 | 85.4 | 22 / 35 | 6586 |
| 11 | 1 | 73.5 | 94.9 | 32 / 35 | 7112 |
| 12 | 1 | 66.8 | 75.9 | 21 / 35 | 5510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 95 | 85% |
| sul.Lunar 1.1 | 79 | 96% |
| supersample.SuperBoxBot 1.0 | 47 | 87% |
| sample.MyFirstRobot 1.0 | 24 | 83% |
| dsw.StaticD 1.0 | 19 | 79% |
| sample.MyFirstJuniorRobot 1.0 | 17 | 76% |
| mme.NikeEnhanced 2.0 | 15 | 67% |
| sample.Corners 1.0 | 14 | 100% |
| tlp.ThreeLeggedPig 1 | 12 | 100% |

Hadur died in 142 of 420 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 41 | 29% | 128 |
| supersample.SuperBoxBot 1.0 | 36 | 25% | 74 |
| dsw.StaticD 1.0 | 18 | 13% | 45 |
| sul.Lunar 1.1 | 12 | 8% | 94 |
| mme.NikeEnhanced 2.0 | 12 | 8% | 20 |
| sample.MyFirstRobot 1.0 | 7 | 5% | 23 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 4% | 15 |
| sample.Corners 1.0 | 6 | 4% | 14 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.1 | 197 / 420 | 2.88 | 17.8% | 71648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.8% | 197 |
| radnor.DoctorBob 1.42 | 2.4 | 13.3% | 82 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.1% | 36 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.6% | 18 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 18 |
| sample.Walls 1.0 | 6.9 | 8.1% | 13 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 9 |
| sample.Target 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 17 / 35 | 6017 |
| 2 | 1 | 68.2 | 82.2 | 18 / 35 | 6394 |
| 3 | 1 | 64.2 | 73.3 | 13 / 35 | 5282 |
| 4 | 1 | 67.0 | 75.6 | 18 / 35 | 6350 |
| 5 | 1 | 66.7 | 79.0 | 16 / 35 | 5804 |
| 6 | 1 | 66.3 | 77.8 | 17 / 35 | 5905 |
| 7 | 1 | 66.8 | 79.4 | 13 / 35 | 6183 |
| 8 | 1 | 67.2 | 82.5 | 17 / 35 | 5611 |
| 9 | 1 | 69.3 | 85.7 | 18 / 35 | 6563 |
| 10 | 1 | 65.5 | 77.5 | 13 / 35 | 5601 |
| 11 | 1 | 67.5 | 78.7 | 18 / 35 | 6251 |
| 12 | 1 | 66.6 | 76.8 | 19 / 35 | 5687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 83 | 90% |
| radnor.DoctorBob 1.42 | 62 | 48% |
| mld.Wisdom 1.0 | 43 | 70% |
| amz.NanoClone 1.41 | 21 | 86% |
| KiraNL.Chupacabra 0.4 | 21 | 67% |
| sample.Walls 1.0 | 11 | 100% |
| jangs.ns51 1.0 | 9 | 78% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 224 of 420 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 66 | 29% | 105 |
| mld.Wisdom 1.0 | 55 | 25% | 87 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 14% | 103 |
| KiraNL.Chupacabra 0.4 | 24 | 11% | 40 |
| amz.NanoClone 1.41 | 20 | 9% | 35 |
| sample.Walls 1.0 | 11 | 5% | 21 |
| jangs.ns51 1.0 | 10 | 4% | 15 |
| GarmBox.Oranges 1.0 | 6 | 3% | 10 |

