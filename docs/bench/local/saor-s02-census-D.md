# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 88.2 | 295 / 420 | 2.06 | 21.0% | 82182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 21.0% | 295 |
| radnor.DoctorBob 1.42 | 2.6 | 14.2% | 45 |
| mz.AntiGrav 1.0 | 3.2 | 13.8% | 25 |
| mld.Infinity 2.2 | 3.3 | 13.2% | 41 |
| amz.NanoClone 1.41 | 4.9 | 10.4% | 7 |
| sample.Walls 1.0 | 6.4 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 6.9 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 6 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.6 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 87.3 | 26 / 35 | 6858 |
| 2 | 1 | 69.7 | 78.4 | 22 / 35 | 6432 |
| 3 | 1 | 71.9 | 90.2 | 25 / 35 | 6695 |
| 4 | 1 | 71.2 | 88.3 | 23 / 35 | 6406 |
| 5 | 1 | 71.6 | 87.3 | 23 / 35 | 6934 |
| 6 | 1 | 70.9 | 84.4 | 19 / 35 | 7214 |
| 7 | 1 | 69.5 | 78.7 | 22 / 35 | 6388 |
| 8 | 1 | 74.2 | 97.8 | 30 / 35 | 7613 |
| 9 | 1 | 73.6 | 95.2 | 30 / 35 | 6743 |
| 10 | 1 | 72.4 | 90.2 | 26 / 35 | 7042 |
| 11 | 1 | 72.4 | 91.4 | 26 / 35 | 6756 |
| 12 | 1 | 72.1 | 89.5 | 23 / 35 | 7101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 119 | 94% |
| mld.Infinity 2.2 | 92 | 90% |
| radnor.DoctorBob 1.42 | 80 | 85% |
| amz.NanoClone 1.41 | 14 | 86% |
| jangs.ns51 1.0 | 10 | 70% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 128 of 420 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 42% | 156 |
| mz.AntiGrav 1.0 | 31 | 24% | 150 |
| mld.Infinity 2.2 | 17 | 13% | 33 |
| amz.NanoClone 1.41 | 12 | 9% | 27 |
| jangs.ns51 1.0 | 7 | 5% | 12 |
| sample.Walls 1.0 | 2 | 2% | 17 |
| GarmBox.Oranges 1.0 | 2 | 2% | 11 |
| arthord.MannyPacquiao Beta | 2 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.2 | 263 / 420 | 2.60 | 18.2% | 59688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.4 | 18.2% | 263 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 98 |
| mld.DustBunny 3.8 | 2.6 | 13.8% | 27 |
| maribo.melee.BMV 0.1 | 4.3 | 10.1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 10 |
| zyx.nano.Ant 1.1 | 5.7 | 8.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 12 |
| fullsail.SweetTea 1.1 | 7.8 | 7.2% | 3 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.3 | 24 / 35 | 5716 |
| 2 | 1 | 69.1 | 88.9 | 25 / 35 | 4879 |
| 3 | 1 | 68.4 | 86.0 | 23 / 35 | 4868 |
| 4 | 1 | 71.8 | 97.5 | 31 / 35 | 5867 |
| 5 | 1 | 69.6 | 90.8 | 26 / 35 | 5185 |
| 6 | 1 | 68.9 | 86.3 | 25 / 35 | 5168 |
| 7 | 1 | 67.7 | 85.1 | 22 / 35 | 4583 |
| 8 | 1 | 67.9 | 85.1 | 24 / 35 | 5132 |
| 9 | 1 | 70.0 | 92.1 | 25 / 35 | 5305 |
| 10 | 4 | 53.0 | 41.6 | 3 / 35 | 3737 |
| 11 | 1 | 69.6 | 90.8 | 25 / 35 | 4870 |
| 12 | 3 | 60.5 | 55.6 | 10 / 35 | 4378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 134 | 75% |
| mld.DustBunny 3.8 | 110 | 92% |
| fullsail.SweetTea 1.1 | 17 | 100% |
| djdjdj.NanoSkunk10 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| zyx.nano.Ant 1.1 | 9 | 89% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 158 of 420 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 35% | 167 |
| mld.DustBunny 3.8 | 32 | 20% | 105 |
| zyx.nano.Ant 1.1 | 19 | 12% | 28 |
| cs.Grudge 1.0 | 15 | 9% | 12 |
| maribo.melee.BMV 0.1 | 9 | 6% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 6% | 23 |
| fullsail.SweetTea 1.1 | 9 | 6% | 22 |
| bzdp.BoxCar 2.0 | 5 | 3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 26 |

## Melee bench: F03

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.8 | 281 / 420 | 2.46 | 19.8% | 71480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 19.8% | 281 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 59 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 3.9 | 10.8% | 28 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.9% | 24 |
| fm.mammillarias 1.3 | 6.1 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.9 | 6.7% | 7 |
| sample.Fire 1.0 | 9.5 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 79.4 | 21 / 35 | 6145 |
| 2 | 1 | 68.7 | 80.0 | 22 / 35 | 5776 |
| 3 | 1 | 69.4 | 84.1 | 21 / 35 | 5771 |
| 4 | 1 | 70.0 | 86.3 | 25 / 35 | 5758 |
| 5 | 1 | 70.7 | 86.7 | 25 / 35 | 6428 |
| 6 | 1 | 69.2 | 82.5 | 21 / 35 | 5850 |
| 7 | 1 | 69.8 | 84.4 | 24 / 35 | 5857 |
| 8 | 1 | 67.9 | 76.5 | 21 / 35 | 5827 |
| 9 | 1 | 70.3 | 85.4 | 26 / 35 | 6002 |
| 10 | 1 | 70.0 | 85.4 | 23 / 35 | 6016 |
| 11 | 1 | 69.8 | 83.5 | 24 / 35 | 5861 |
| 12 | 1 | 71.3 | 91.1 | 28 / 35 | 6189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 109 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 67 | 91% |
| myl.nano.KomoriNinja 1.1 | 46 | 93% |
| cb.nano.Insomnia 1.0 | 43 | 77% |
| sp.Nanos.Ember 1.1 | 20 | 95% |
| fm.mammillarias 1.3 | 14 | 86% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 139 of 420 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 33 | 24% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 29 | 21% | 83 |
| myl.micro.Troodon 1.10 | 27 | 19% | 132 |
| myl.nano.KomoriNinja 1.1 | 18 | 13% | 78 |
| fm.mammillarias 1.3 | 15 | 11% | 26 |
| sample.Fire 1.0 | 8 | 6% | 13 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 32 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 15 |
| sample.Tracker 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.2 | 307 / 420 | 2.06 | 20.6% | 75419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 20.6% | 307 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 29 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.7% | 19 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.6% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.2% | 3 |
| tj.zombie1n 1.0.1 | 5.6 | 9.0% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 7.1 | 8.1% | 10 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 8.9 | 6.3% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.6 | 31 / 35 | 6237 |
| 2 | 1 | 70.9 | 89.5 | 27 / 35 | 6341 |
| 3 | 1 | 68.7 | 79.7 | 20 / 35 | 6414 |
| 4 | 1 | 69.8 | 85.7 | 26 / 35 | 6176 |
| 5 | 1 | 72.6 | 97.1 | 32 / 35 | 6288 |
| 6 | 1 | 71.4 | 89.2 | 24 / 35 | 6666 |
| 7 | 1 | 68.7 | 81.6 | 25 / 35 | 5923 |
| 8 | 1 | 71.1 | 89.2 | 26 / 35 | 6465 |
| 9 | 1 | 70.8 | 89.5 | 23 / 35 | 6383 |
| 10 | 1 | 69.5 | 85.4 | 24 / 35 | 5745 |
| 11 | 1 | 70.6 | 89.2 | 27 / 35 | 6135 |
| 12 | 1 | 70.0 | 86.7 | 22 / 35 | 6646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 129 | 87% |
| stelo.SoJNanoMelee 1.1 | 87 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 35 | 80% |
| tvv.micro.Antares 1.1.1 | 31 | 87% |
| tj.zombie1n 1.0.1 | 29 | 86% |
| yk.JahMicro 1.0 | 22 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 115 of 420 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 36% | 171 |
| stelo.SoJNanoMelee 1.1 | 17 | 15% | 57 |
| tvv.micro.Antares 1.1.1 | 16 | 14% | 63 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 10% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 8% | 47 |
| yk.JahMicro 1.0 | 8 | 7% | 20 |
| tj.zombie1n 1.0.1 | 8 | 7% | 18 |
| repositorio.NanoStep 1.0 | 2 | 2% | 17 |
| sample.VelociRobot 1.0 | 2 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.0 | 179 / 420 | 3.97 | 15.3% | 54832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 15.3% | 179 |
| oog.melee.Corsair 1.0 | 2.6 | 12.2% | 61 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 61 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.3% | 55 |
| EBBU.Sim2 1.02 | 5.9 | 9.6% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.1 | 9.5% | 19 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 27 |
| robar.nano.Assertive_Melee 0.2 | 7.4 | 9.0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.2 | 15 / 35 | 4552 |
| 2 | 1 | 61.2 | 61.6 | 15 / 35 | 4431 |
| 3 | 1 | 62.4 | 69.8 | 14 / 35 | 4444 |
| 4 | 1 | 62.6 | 68.3 | 17 / 35 | 4543 |
| 5 | 1 | 62.3 | 66.3 | 17 / 35 | 4674 |
| 6 | 1 | 62.2 | 66.7 | 15 / 35 | 4739 |
| 7 | 1 | 66.3 | 77.8 | 22 / 35 | 4832 |
| 8 | 1 | 62.8 | 70.5 | 14 / 35 | 4403 |
| 9 | 1 | 60.6 | 62.2 | 11 / 35 | 4512 |
| 10 | 1 | 59.9 | 57.1 | 13 / 35 | 4810 |
| 11 | 1 | 61.5 | 63.2 | 12 / 35 | 4422 |
| 12 | 1 | 62.8 | 69.8 | 14 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 71 | 90% |
| oog.melee.Corsair 1.0 | 47 | 68% |
| ahf.NanoAndrew .4 | 41 | 85% |
| sam.Samspin 1.0 | 15 | 80% |
| EBBU.Sim2 1.02 | 15 | 87% |
| zyx.nano.BacillusComma 1.0 | 11 | 82% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| sample.TrackFire 1.0 | 5 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 241 of 420 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 15% | 88 |
| robar.nano.Assertive_Melee 0.2 | 35 | 15% | 45 |
| oog.melee.Corsair 1.0 | 34 | 14% | 79 |
| bwbaugh.nano.Tirunculus 0.0.0a | 29 | 12% | 25 |
| EBBU.Sim2 1.02 | 27 | 11% | 39 |
| zyx.nano.BacillusComma 1.0 | 27 | 11% | 34 |
| ahf.NanoAndrew .4 | 25 | 10% | 64 |
| sam.Samspin 1.0 | 21 | 9% | 34 |
| sample.TrackFire 1.0 | 6 | 2% | 10 |

## Melee bench: F06

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.4 | 291 / 420 | 2.14 | 19.4% | 61781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 19.4% | 291 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.2% | 46 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.7% | 36 |
| arthord.NanoSatanMelee Beta | 4.9 | 9.2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 9.1% | 16 |
| fm.claire 1.7 | 6.9 | 8.1% | 0 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 7 |
| pa.Improved 1.0 | 9.3 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.6 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.1 | 23 / 35 | 4806 |
| 2 | 1 | 69.7 | 89.2 | 25 / 35 | 5503 |
| 3 | 1 | 69.0 | 84.8 | 27 / 35 | 5265 |
| 4 | 1 | 70.9 | 92.1 | 27 / 35 | 5391 |
| 5 | 1 | 69.9 | 90.5 | 22 / 35 | 5321 |
| 6 | 1 | 69.1 | 88.6 | 23 / 35 | 5139 |
| 7 | 1 | 65.4 | 77.1 | 16 / 35 | 4719 |
| 8 | 1 | 71.0 | 94.0 | 30 / 35 | 5282 |
| 9 | 1 | 66.5 | 77.5 | 23 / 35 | 4553 |
| 10 | 1 | 68.0 | 85.1 | 23 / 35 | 5056 |
| 11 | 1 | 69.8 | 89.5 | 26 / 35 | 5502 |
| 12 | 1 | 69.2 | 87.9 | 26 / 35 | 5244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 142 | 87% |
| oog.melee.CapuletDroid 1.1 | 64 | 73% |
| gh.nano.Grofvuil 0.2 | 48 | 90% |
| arthord.NanoSatanMelee Beta | 29 | 100% |
| winamp32.micro.MicroMacro 1.0 | 20 | 85% |
| sample.SpinBot 1.0 | 15 | 100% |
| fm.claire 1.7 | 10 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 132 of 420 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 32 | 24% | 36 |
| d414.nano.Quantum 1.0.0 | 31 | 23% | 145 |
| gh.nano.Grofvuil 0.2 | 21 | 16% | 81 |
| winamp32.micro.MicroMacro 1.0 | 14 | 11% | 46 |
| arthord.NanoSatanMelee Beta | 12 | 9% | 40 |
| sample.SpinBot 1.0 | 11 | 8% | 20 |
| kurios.DOSexe .9b | 4 | 3% | 22 |
| fm.claire 1.7 | 4 | 3% | 18 |
| pa.Improved 1.0 | 2 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.2 | 175 / 420 | 2.88 | 17.4% | 63896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.1 | 17.4% | 175 |
| gh.micro.Gruweltje 0.7 | 2.4 | 15.6% | 108 |
| spinnercat.micro.Tyger 0.1 | 3.1 | 13.6% | 41 |
| mz.MicroGodMelee 1 | 3.4 | 12.9% | 70 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 13 |
| caimano.Furia_Ceca 0.22 | 5.9 | 7.7% | 1 |
| acogdev.alpha 0.2 | 7.6 | 6.4% | 3 |
| el.JumpShoot 0.2 | 8.2 | 6.3% | 5 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 4 |
| fire219.CatBot 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 16 / 35 | 5292 |
| 2 | 1 | 66.0 | 75.9 | 16 / 35 | 5566 |
| 3 | 1 | 65.6 | 77.8 | 14 / 35 | 4816 |
| 4 | 1 | 67.8 | 82.5 | 13 / 35 | 5593 |
| 5 | 1 | 67.4 | 81.3 | 15 / 35 | 5587 |
| 6 | 1 | 66.6 | 77.5 | 17 / 35 | 5333 |
| 7 | 2 | 66.0 | 79.0 | 10 / 35 | 5235 |
| 8 | 1 | 65.4 | 75.9 | 15 / 35 | 4936 |
| 9 | 1 | 65.4 | 76.8 | 13 / 35 | 5011 |
| 10 | 1 | 66.4 | 77.1 | 14 / 35 | 5437 |
| 11 | 1 | 68.5 | 85.1 | 19 / 35 | 5705 |
| 12 | 1 | 66.4 | 78.4 | 13 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 94 | 91% |
| mz.MicroGodMelee 1 | 83 | 47% |
| gh.micro.Gruweltje 0.7 | 74 | 27% |
| DBall.Anarchy 0.1 | 20 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 245 of 420 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 88 | 36% | 124 |
| mz.MicroGodMelee 1 | 76 | 31% | 124 |
| spinnercat.micro.Tyger 0.1 | 28 | 11% | 90 |
| caimano.Furia_Ceca 0.22 | 14 | 6% | 17 |
| acogdev.alpha 0.2 | 14 | 6% | 16 |
| fire219.CatBot 1.0 | 12 | 5% | 11 |
| el.JumpShoot 0.2 | 7 | 3% | 9 |
| DBall.Anarchy 0.1 | 4 | 2% | 19 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 9 |

## Melee bench: F08

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.3 | 214 / 420 | 3.41 | 16.7% | 60990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.2 | 16.7% | 214 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 74 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.0% | 82 |
| germ.TheMind .2 | 4.8 | 9.3% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 7 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 9 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.4% | 12 |
| sample.Crazy 1.0 | 8.3 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.4 | 18 / 35 | 4732 |
| 2 | 1 | 66.1 | 74.0 | 18 / 35 | 5548 |
| 3 | 1 | 65.4 | 74.0 | 17 / 35 | 5311 |
| 4 | 2 | 62.6 | 66.7 | 14 / 35 | 4699 |
| 5 | 1 | 64.9 | 73.0 | 18 / 35 | 5179 |
| 6 | 1 | 69.3 | 84.4 | 25 / 35 | 5802 |
| 7 | 1 | 65.7 | 76.5 | 20 / 35 | 4793 |
| 8 | 1 | 64.0 | 71.4 | 16 / 35 | 4842 |
| 9 | 1 | 65.5 | 71.7 | 22 / 35 | 5099 |
| 10 | 1 | 64.6 | 74.0 | 15 / 35 | 4892 |
| 11 | 1 | 65.6 | 73.0 | 18 / 35 | 5357 |
| 12 | 2 | 63.4 | 68.9 | 13 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 144 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 51 | 71% |
| germ.TheMind .2 | 18 | 89% |
| qualidafial.MajorDick 1.0.1 | 16 | 100% |
| sample.Crazy 1.0 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 9 | 89% |
| awesomeness.Elite 1.0 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 206 of 420 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 41% | 198 |
| simonton.nano.WeekendObsession_Melee 1.0 | 43 | 21% | 80 |
| germ.TheMind .2 | 28 | 14% | 47 |
| awesomeness.Elite 1.0 | 16 | 8% | 26 |
| lrem.micro.MoggFanatic 0.2 | 10 | 5% | 21 |
| qualidafial.MajorDick 1.0.1 | 9 | 4% | 16 |
| mym.EdgeStalker 1.0 | 7 | 3% | 9 |
| stelo.UntouchableNano 1.3 | 6 | 3% | 13 |
| sample.Crazy 1.0 | 3 | 1% | 10 |

## Melee bench: F09

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.3 | 294 / 420 | 2.23 | 19.4% | 58095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 19.4% | 294 |
| rz.HawkOnFire 0.1 | 2.6 | 13.1% | 25 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 12.2% | 34 |
| maribo.IotaCT 1.1 | 3.8 | 10.9% | 17 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.1% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 8.2% | 13 |
| ratosh.Wesco 1.4 | 7.8 | 8.2% | 8 |
| spinnercat.Omen 1.0 | 7.8 | 8.1% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 27 / 35 | 4675 |
| 2 | 1 | 69.6 | 85.7 | 27 / 35 | 4832 |
| 3 | 1 | 69.6 | 84.8 | 26 / 35 | 4734 |
| 4 | 1 | 69.2 | 86.3 | 24 / 35 | 4177 |
| 5 | 1 | 68.6 | 81.0 | 23 / 35 | 5129 |
| 6 | 1 | 67.4 | 79.4 | 19 / 35 | 4760 |
| 7 | 1 | 72.0 | 96.5 | 28 / 35 | 5163 |
| 8 | 1 | 70.1 | 89.5 | 25 / 35 | 4972 |
| 9 | 1 | 71.1 | 90.2 | 26 / 35 | 5049 |
| 10 | 1 | 70.2 | 89.5 | 25 / 35 | 4877 |
| 11 | 1 | 68.8 | 84.8 | 22 / 35 | 4841 |
| 12 | 1 | 67.3 | 77.1 | 22 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 115 | 94% |
| nz.jdc.nano.GridFu 1.0 | 75 | 93% |
| stelo.PatternRobot 1.0 | 40 | 93% |
| timmit.nano.TimDog 0.33 | 32 | 75% |
| maribo.IotaCT 1.1 | 27 | 85% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 100% |
| ratosh.Wesco 1.4 | 11 | 82% |
| spinnercat.Omen 1.0 | 10 | 100% |

Hadur died in 129 of 420 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 32 | 25% | 63 |
| rz.HawkOnFire 0.1 | 26 | 20% | 107 |
| nz.jdc.nano.GridFu 1.0 | 20 | 16% | 101 |
| ratosh.Wesco 1.4 | 13 | 10% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 10% | 21 |
| stelo.PatternRobot 1.0 | 12 | 9% | 36 |
| maribo.IotaCT 1.1 | 11 | 9% | 45 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 11 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.1 | 355 / 420 | 1.62 | 21.6% | 76233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 21.6% | 355 |
| tvv.nano.Polaris 1.2 | 2.4 | 11.9% | 21 |
| baal.nano.N 1.42 | 2.9 | 11.2% | 13 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 5 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 14 |
| squidM.TentalceMeleeNano 1.1 | 6.4 | 8.3% | 0 |
| sanja.First 0.1 | 7.1 | 8.0% | 4 |
| cvt.Firsty 1.0 | 7.9 | 7.4% | 8 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.0% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 30 / 35 | 6150 |
| 2 | 1 | 70.0 | 85.1 | 27 / 35 | 6181 |
| 3 | 1 | 72.3 | 96.2 | 32 / 35 | 6524 |
| 4 | 1 | 71.4 | 94.6 | 27 / 35 | 6207 |
| 5 | 1 | 72.1 | 91.7 | 31 / 35 | 6711 |
| 6 | 1 | 72.4 | 95.6 | 33 / 35 | 6330 |
| 7 | 1 | 71.2 | 90.2 | 29 / 35 | 6327 |
| 8 | 1 | 70.1 | 90.5 | 26 / 35 | 5661 |
| 9 | 1 | 72.7 | 95.6 | 31 / 35 | 7029 |
| 10 | 1 | 73.0 | 98.1 | 31 / 35 | 6770 |
| 11 | 1 | 70.9 | 91.1 | 29 / 35 | 5946 |
| 12 | 1 | 72.1 | 95.2 | 29 / 35 | 6397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 84 | 94% |
| baal.nano.N 1.42 | 67 | 94% |
| cvt.Firsty 1.0 | 56 | 93% |
| sanja.First 0.1 | 42 | 93% |
| zyx.micro.Ant 1.1 | 40 | 88% |
| Grystrion.TrackerWO 1.0 | 35 | 100% |
| amk.Punbot.Punbot 0.01 | 33 | 97% |
| squidM.TentalceMeleeNano 1.1 | 19 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 66 of 420 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 20% | 61 |
| tvv.nano.Polaris 1.2 | 12 | 18% | 113 |
| Grystrion.TrackerWO 1.0 | 10 | 15% | 45 |
| sanja.First 0.1 | 7 | 11% | 55 |
| cvt.Firsty 1.0 | 6 | 9% | 43 |
| sample.RamFire 1.0 | 6 | 9% | 11 |
| baal.nano.N 1.42 | 5 | 8% | 59 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 10 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 14 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 69.9 | 145 / 420 | 3.71 | 15.2% | 57423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 162 |
| hadur117.micro.SaorD 0.1 | 1.8 | 15.2% | 145 |
| cs.Wren 1.0 | 2.9 | 12.8% | 31 |
| mz.Cork 0.1 | 4.3 | 11.4% | 27 |
| js.PinBall 1.6 | 4.7 | 11.2% | 34 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 7 |
| evd.X1 0.01 | 7.0 | 7.7% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 6 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 59.0 | 9 / 35 | 4066 |
| 2 | 1 | 66.0 | 80.0 | 14 / 35 | 5019 |
| 3 | 2 | 62.2 | 68.9 | 8 / 35 | 4721 |
| 4 | 2 | 61.5 | 66.7 | 12 / 35 | 4674 |
| 5 | 1 | 64.0 | 72.4 | 11 / 35 | 5060 |
| 6 | 2 | 61.9 | 65.1 | 14 / 35 | 4869 |
| 7 | 1 | 63.8 | 69.2 | 17 / 35 | 5089 |
| 8 | 2 | 64.5 | 74.9 | 11 / 35 | 5105 |
| 9 | 2 | 63.6 | 73.7 | 12 / 35 | 4524 |
| 10 | 1 | 65.2 | 75.2 | 18 / 35 | 4856 |
| 11 | 2 | 63.4 | 71.7 | 11 / 35 | 4822 |
| 12 | 2 | 60.2 | 62.2 | 8 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 153 | 40% |
| cs.Wren 1.0 | 39 | 92% |
| mz.Cork 0.1 | 20 | 90% |
| js.PinBall 1.6 | 15 | 67% |
| jsal.Jsalbot 1.0 | 11 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 275 of 420 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 150 | 55% | 217 |
| js.PinBall 1.6 | 29 | 11% | 47 |
| evd.X1 0.01 | 26 | 9% | 29 |
| cs.Wren 1.0 | 21 | 8% | 43 |
| joe.ADinosaur 1.0 | 20 | 7% | 25 |
| mz.Cork 0.1 | 15 | 5% | 30 |
| PSW.Relentless 0.1 | 9 | 3% | 9 |
| jsal.Jsalbot 1.0 | 4 | 1% | 15 |
| donjezza.Jezza 1.0 | 1 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.2 | 264 / 420 | 2.69 | 18.3% | 55687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.3% | 264 |
| myl.nano.Graviton 1.10 | 2.9 | 11.5% | 41 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.0% | 37 |
| ntc.Opposite 1.5 | 3.8 | 11.0% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.5% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.6 | 9.7% | 8 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 20 |
| DBall.NUKE 0.1 | 7.3 | 8.2% | 9 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 14 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.0 | 24 / 35 | 4555 |
| 2 | 1 | 62.3 | 68.3 | 17 / 35 | 3819 |
| 3 | 1 | 66.7 | 81.3 | 18 / 35 | 4690 |
| 4 | 1 | 64.0 | 73.0 | 17 / 35 | 4211 |
| 5 | 1 | 69.5 | 89.2 | 25 / 35 | 4786 |
| 6 | 1 | 68.0 | 83.8 | 24 / 35 | 4794 |
| 7 | 1 | 68.2 | 83.8 | 24 / 35 | 4602 |
| 8 | 1 | 70.2 | 92.1 | 27 / 35 | 4796 |
| 9 | 1 | 65.9 | 77.1 | 19 / 35 | 4782 |
| 10 | 1 | 69.8 | 88.3 | 25 / 35 | 5214 |
| 11 | 1 | 66.3 | 73.3 | 21 / 35 | 4938 |
| 12 | 1 | 67.7 | 83.5 | 23 / 35 | 4500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 79 | 86% |
| myl.nano.Graviton 1.10 | 65 | 88% |
| disan.Chair 2.2.0 | 30 | 87% |
| DBall.NUKE 0.1 | 29 | 97% |
| ntc.Opposite 1.5 | 26 | 77% |
| lrem.micro.SpikeSoldier 0.4 | 24 | 96% |
| donjezza.Muncho 1.0 | 23 | 91% |
| pfvicm.Sobieski 7.2.3b | 19 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 158 of 420 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 22% | 93 |
| pfvicm.Sobieski 7.2.3b | 31 | 20% | 48 |
| myl.nano.Graviton 1.10 | 25 | 16% | 86 |
| ntc.Opposite 1.5 | 21 | 13% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 11% | 42 |
| disan.Chair 2.2.0 | 11 | 7% | 25 |
| DBall.NUKE 0.1 | 7 | 4% | 40 |
| donjezza.Muncho 1.0 | 7 | 4% | 22 |
| pbg.R2D2 1.0 | 4 | 3% | 13 |

## Melee bench: F13

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 69.8 | 157 / 420 | 3.72 | 15.0% | 49242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.2 | 15.0% | 157 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 99 |
| kawigi.micro.Shiz 1.1 | 2.9 | 13.5% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 48 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 25 |
| ejb.Polaris 1.0.1 | 5.8 | 11.0% | 19 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 1 |
| kurios.DOSexe .9a | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 63.5 | 13 / 35 | 3715 |
| 2 | 1 | 62.4 | 66.3 | 13 / 35 | 4325 |
| 3 | 1 | 68.0 | 84.1 | 18 / 35 | 4802 |
| 4 | 1 | 61.5 | 64.8 | 10 / 35 | 4205 |
| 5 | 1 | 62.0 | 64.4 | 13 / 35 | 3774 |
| 6 | 1 | 61.8 | 67.3 | 11 / 35 | 3892 |
| 7 | 1 | 63.4 | 72.1 | 16 / 35 | 3732 |
| 8 | 1 | 64.9 | 74.0 | 15 / 35 | 4097 |
| 9 | 1 | 63.3 | 73.0 | 11 / 35 | 4142 |
| 10 | 1 | 62.9 | 68.3 | 11 / 35 | 4329 |
| 11 | 2 | 61.3 | 64.8 | 9 / 35 | 3903 |
| 12 | 1 | 65.3 | 74.6 | 17 / 35 | 4326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 69 | 46% |
| kawigi.micro.Shiz 1.1 | 57 | 91% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 70% |
| yagami.Tidus 0.11 | 28 | 89% |
| ejb.Polaris 1.0.1 | 16 | 81% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 265 of 420 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 110 | 42% | 145 |
| yagami.Tidus 0.11 | 39 | 15% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 13% | 67 |
| ejb.Polaris 1.0.1 | 29 | 11% | 57 |
| kawigi.micro.Shiz 1.1 | 22 | 8% | 53 |
| stelo.MirrorNano 1.3 | 15 | 6% | 18 |
| step.nanoPri 1.0 | 11 | 4% | 12 |
| kurios.DOSexe .9a | 5 | 2% | 6 |

## Melee bench: F14

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 76.1 | 237 / 420 | 3.15 | 16.6% | 50835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 16.6% | 237 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 42 |
| wee.Gem 1.8.4 | 3.0 | 12.1% | 58 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 34 |
| ratosh.Nobo 0.21 | 4.4 | 11.1% | 21 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 17 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 75.2 | 17 / 35 | 4085 |
| 2 | 1 | 67.5 | 83.8 | 19 / 35 | 4854 |
| 3 | 1 | 63.4 | 71.7 | 18 / 35 | 4199 |
| 4 | 1 | 61.3 | 65.7 | 17 / 35 | 3846 |
| 5 | 1 | 62.8 | 71.1 | 20 / 35 | 3747 |
| 6 | 1 | 64.6 | 77.5 | 21 / 35 | 3971 |
| 7 | 1 | 64.4 | 75.6 | 19 / 35 | 4158 |
| 8 | 1 | 67.5 | 84.8 | 24 / 35 | 4539 |
| 9 | 1 | 66.7 | 81.3 | 19 / 35 | 4615 |
| 10 | 1 | 65.1 | 73.3 | 19 / 35 | 4557 |
| 11 | 1 | 65.8 | 77.8 | 23 / 35 | 4213 |
| 12 | 1 | 64.8 | 75.2 | 21 / 35 | 4051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 92 | 91% |
| wee.Gem 1.8.4 | 77 | 92% |
| wompi.Quokka 1.6 | 41 | 90% |
| ratosh.Nobo 0.21 | 17 | 76% |
| m3thos.Eva00 1.1 | 16 | 88% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| stelo.MyAgileRobot 0.2 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 183 of 420 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 33 | 18% | 105 |
| wompi.Quokka 1.6 | 26 | 14% | 54 |
| bzdp.Pansy 2.1 | 25 | 14% | 89 |
| maribo.FollowFire 1 | 23 | 13% | 26 |
| ratosh.Nobo 0.21 | 21 | 11% | 42 |
| bayen.UbaMicro 1.4 | 18 | 10% | 31 |
| stelo.MyAgileRobot 0.2 | 14 | 8% | 20 |
| m3thos.Eva00 1.1 | 12 | 7% | 30 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 6% | 16 |

## Melee bench: F15

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 81.5 | 120 / 420 | 2.67 | 18.8% | 85178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 19.7% | 263 |
| hadur117.micro.SaorD 0.1 | 1.8 | 18.8% | 120 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 22 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 10 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 80.3 | 13 / 35 | 7088 |
| 2 | 2 | 68.5 | 78.4 | 3 / 35 | 6640 |
| 3 | 2 | 69.1 | 80.6 | 10 / 35 | 6900 |
| 4 | 2 | 70.1 | 84.1 | 10 / 35 | 7175 |
| 5 | 2 | 69.1 | 79.4 | 9 / 35 | 6942 |
| 6 | 2 | 69.9 | 81.3 | 12 / 35 | 7274 |
| 7 | 2 | 68.7 | 79.0 | 9 / 35 | 6748 |
| 8 | 1 | 71.3 | 85.7 | 14 / 35 | 7468 |
| 9 | 2 | 68.5 | 78.7 | 5 / 35 | 7039 |
| 10 | 1 | 71.1 | 87.0 | 15 / 35 | 7612 |
| 11 | 2 | 68.6 | 79.4 | 11 / 35 | 6575 |
| 12 | 2 | 70.5 | 83.5 | 9 / 35 | 7717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 217 | 28% |
| mz.NanoGod 2.02 | 36 | 72% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| sample.SittingDuck 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 303 of 420 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 207 | 68% | 268 |
| mz.NanoGod 2.02 | 52 | 17% | 85 |
| exauge.GateKeeper 1.1.121g | 18 | 6% | 25 |
| ayk.WallHugger 1.0 | 14 | 5% | 19 |
| stelo.PianistNano 1.2 | 6 | 2% | 8 |
| stuff.Vlad 0.1 | 5 | 2% | 7 |
| drd.Dreadknoght 0.9 | 1 | 0% | 8 |

## Melee bench: F16

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.5 | 224 / 420 | 3.39 | 16.5% | 54299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 16.5% | 224 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 12.8% | 39 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 45 |
| bvh.micro.Freya 0.3 | 4.1 | 11.2% | 30 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.3% | 39 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 18 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 17 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 72.7 | 19 / 35 | 4231 |
| 2 | 1 | 69.2 | 87.3 | 26 / 35 | 5198 |
| 3 | 1 | 66.5 | 77.1 | 22 / 35 | 4722 |
| 4 | 1 | 63.9 | 71.1 | 17 / 35 | 4328 |
| 5 | 1 | 65.3 | 74.6 | 19 / 35 | 4580 |
| 6 | 1 | 65.1 | 77.1 | 17 / 35 | 4485 |
| 7 | 1 | 65.1 | 76.2 | 18 / 35 | 4690 |
| 8 | 1 | 64.2 | 70.2 | 18 / 35 | 4552 |
| 9 | 1 | 66.0 | 79.0 | 21 / 35 | 4298 |
| 10 | 1 | 63.8 | 71.4 | 16 / 35 | 4411 |
| 11 | 1 | 60.9 | 61.3 | 14 / 35 | 4505 |
| 12 | 1 | 62.1 | 63.8 | 17 / 35 | 4299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 89 | 89% |
| dummy.micro.Sparrow 2.5 | 55 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 51 | 82% |
| bvh.micro.Freya 0.3 | 36 | 100% |
| stelo.MirrorMicro 1.0 | 13 | 77% |
| ap.Frederick 1.1 | 7 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 197 of 420 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 37 | 19% | 77 |
| conscience.Electron 1.3g | 33 | 17% | 37 |
| voidious.micro.BlitzBat 1.05 | 32 | 16% | 103 |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 14% | 83 |
| dl.BetterWalls 1.0 | 23 | 12% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 10% | 22 |
| bvh.micro.Freya 0.3 | 12 | 6% | 39 |
| stelo.MirrorMicro 1.0 | 12 | 6% | 26 |

## Melee bench: F17

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.9 | 304 / 420 | 2.18 | 21.1% | 82722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 21.1% | 304 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 43 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 17 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.5% | 16 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 10 |
| dsw.StaticD 1.0 | 5.5 | 8.9% | 16 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 6 |
| sample.Corners 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.7 | 27 / 35 | 6997 |
| 2 | 1 | 70.3 | 83.5 | 23 / 35 | 6987 |
| 3 | 1 | 71.8 | 90.5 | 25 / 35 | 7067 |
| 4 | 1 | 71.3 | 87.9 | 23 / 35 | 6976 |
| 5 | 1 | 73.0 | 91.1 | 30 / 35 | 7301 |
| 6 | 1 | 72.0 | 89.2 | 25 / 35 | 6923 |
| 7 | 1 | 71.1 | 87.9 | 24 / 35 | 6865 |
| 8 | 1 | 69.5 | 82.9 | 26 / 35 | 6136 |
| 9 | 1 | 72.1 | 89.8 | 26 / 35 | 7212 |
| 10 | 1 | 71.6 | 85.1 | 26 / 35 | 7407 |
| 11 | 1 | 67.6 | 72.7 | 21 / 35 | 6218 |
| 12 | 1 | 71.3 | 88.9 | 28 / 35 | 6633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 114 | 87% |
| sul.Lunar 1.1 | 83 | 100% |
| supersample.SuperBoxBot 1.0 | 51 | 98% |
| dsw.StaticD 1.0 | 30 | 67% |
| mme.NikeEnhanced 2.0 | 18 | 100% |
| sample.MyFirstRobot 1.0 | 13 | 92% |
| sample.Corners 1.0 | 10 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |

Hadur died in 117 of 420 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 37 | 32% | 127 |
| supersample.SuperBoxBot 1.0 | 26 | 22% | 62 |
| dsw.StaticD 1.0 | 25 | 21% | 53 |
| sul.Lunar 1.1 | 8 | 7% | 108 |
| mme.NikeEnhanced 2.0 | 6 | 5% | 26 |
| sample.Corners 1.0 | 4 | 3% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 13 |
| tlp.ThreeLeggedPig 1 | 3 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.2 | 249 / 420 | 2.69 | 18.6% | 72885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.6% | 249 |
| radnor.DoctorBob 1.42 | 2.9 | 12.5% | 45 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.3% | 41 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 21 |
| amz.NanoClone 1.41 | 5.6 | 9.5% | 21 |
| sample.Walls 1.0 | 7.0 | 8.0% | 11 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.1 | 22 / 35 | 6079 |
| 2 | 1 | 70.1 | 88.3 | 21 / 35 | 6630 |
| 3 | 1 | 67.4 | 78.4 | 18 / 35 | 6282 |
| 4 | 1 | 65.8 | 74.3 | 19 / 35 | 5549 |
| 5 | 1 | 70.4 | 89.5 | 25 / 35 | 6236 |
| 6 | 1 | 68.0 | 84.4 | 22 / 35 | 5579 |
| 7 | 1 | 67.9 | 81.6 | 21 / 35 | 6024 |
| 8 | 1 | 68.4 | 82.9 | 21 / 35 | 5978 |
| 9 | 1 | 65.3 | 72.4 | 18 / 35 | 5724 |
| 10 | 1 | 66.5 | 74.0 | 21 / 35 | 6085 |
| 11 | 1 | 69.4 | 82.9 | 23 / 35 | 6541 |
| 12 | 1 | 68.0 | 81.9 | 18 / 35 | 6178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 117 | 96% |
| radnor.DoctorBob 1.42 | 55 | 78% |
| mld.Wisdom 1.0 | 37 | 76% |
| KiraNL.Chupacabra 0.4 | 23 | 74% |
| amz.NanoClone 1.41 | 21 | 76% |
| sample.Walls 1.0 | 14 | 100% |
| jangs.ns51 1.0 | 12 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Target 1.0 | 2 | 50% |

Hadur died in 171 of 420 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 50 | 29% | 85 |
| radnor.DoctorBob 1.42 | 39 | 23% | 93 |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 17% | 133 |
| KiraNL.Chupacabra 0.4 | 28 | 16% | 47 |
| amz.NanoClone 1.41 | 11 | 6% | 19 |
| GarmBox.Oranges 1.0 | 6 | 4% | 8 |
| sample.Walls 1.0 | 5 | 3% | 18 |
| jangs.ns51 1.0 | 3 | 2% | 9 |

