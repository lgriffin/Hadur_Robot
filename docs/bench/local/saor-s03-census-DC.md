# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 92.0 | 331 / 420 | 1.72 | 22.1% | 86236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 22.1% | 331 |
| mz.AntiGrav 1.0 | 2.7 | 14.0% | 23 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 28 |
| mld.Infinity 2.2 | 3.6 | 12.7% | 30 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 4 |
| sample.Walls 1.0 | 6.5 | 6.9% | 2 |
| jangs.ns51 1.0 | 7.2 | 6.1% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 92.4 | 27 / 35 | 7533 |
| 2 | 1 | 73.6 | 92.1 | 29 / 35 | 7933 |
| 3 | 1 | 73.3 | 92.1 | 28 / 35 | 7641 |
| 4 | 1 | 72.7 | 90.5 | 28 / 35 | 6777 |
| 5 | 1 | 73.0 | 90.8 | 28 / 35 | 7238 |
| 6 | 1 | 73.0 | 94.0 | 29 / 35 | 6899 |
| 7 | 1 | 73.3 | 92.4 | 28 / 35 | 7174 |
| 8 | 1 | 72.4 | 89.8 | 26 / 35 | 6791 |
| 9 | 1 | 72.7 | 92.7 | 27 / 35 | 6926 |
| 10 | 1 | 73.8 | 96.8 | 29 / 35 | 7244 |
| 11 | 1 | 72.1 | 88.3 | 25 / 35 | 7181 |
| 12 | 1 | 73.1 | 92.4 | 27 / 35 | 6899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 134 | 98% |
| mld.Infinity 2.2 | 94 | 89% |
| radnor.DoctorBob 1.42 | 92 | 88% |
| amz.NanoClone 1.41 | 13 | 92% |
| jangs.ns51 1.0 | 13 | 92% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 91 of 420 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 42% | 163 |
| mld.Infinity 2.2 | 19 | 21% | 42 |
| mz.AntiGrav 1.0 | 12 | 13% | 134 |
| amz.NanoClone 1.41 | 8 | 9% | 21 |
| sample.Walls 1.0 | 6 | 7% | 23 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 14 |
| arthord.MannyPacquiao Beta | 2 | 2% | 9 |

## Melee bench: F02

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.1 | 243 / 420 | 2.88 | 17.7% | 59757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.4 | 17.7% | 243 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.2% | 97 |
| mld.DustBunny 3.8 | 2.7 | 13.3% | 31 |
| maribo.melee.BMV 0.1 | 4.4 | 10.3% | 5 |
| zyx.nano.Ant 1.1 | 5.9 | 9.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.1 | 8.8% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 7.7% | 19 |
| bzdp.BoxCar 2.0 | 7.8 | 7.4% | 1 |
| fullsail.SweetTea 1.1 | 8.0 | 7.2% | 4 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.8 | 20 / 35 | 4964 |
| 2 | 1 | 66.5 | 78.4 | 16 / 35 | 5067 |
| 3 | 1 | 69.2 | 90.5 | 25 / 35 | 5061 |
| 4 | 1 | 68.9 | 88.3 | 25 / 35 | 5269 |
| 5 | 1 | 67.1 | 82.5 | 22 / 35 | 5032 |
| 6 | 3 | 58.7 | 52.7 | 7 / 35 | 4528 |
| 7 | 2 | 61.9 | 58.4 | 12 / 35 | 4847 |
| 8 | 1 | 70.5 | 93.3 | 27 / 35 | 5482 |
| 9 | 1 | 71.3 | 95.6 | 31 / 35 | 5195 |
| 10 | 1 | 67.6 | 83.5 | 23 / 35 | 4779 |
| 11 | 3 | 59.7 | 55.6 | 11 / 35 | 4314 |
| 12 | 1 | 68.9 | 87.0 | 24 / 35 | 5219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 133 | 72% |
| mld.DustBunny 3.8 | 86 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 84% |
| djdjdj.NanoSkunk10 1.0 | 16 | 88% |
| maribo.melee.BMV 0.1 | 15 | 87% |
| fullsail.SweetTea 1.1 | 14 | 93% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 180 of 420 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 36% | 159 |
| mld.DustBunny 3.8 | 23 | 13% | 88 |
| cs.Grudge 1.0 | 23 | 13% | 24 |
| maribo.melee.BMV 0.1 | 20 | 11% | 29 |
| zyx.nano.Ant 1.1 | 18 | 10% | 26 |
| fullsail.SweetTea 1.1 | 10 | 6% | 23 |
| djdjdj.NanoSkunk10 1.0 | 8 | 4% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 4% | 26 |
| bzdp.BoxCar 2.0 | 6 | 3% | 10 |

## Melee bench: F03

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.5 | 304 / 420 | 2.22 | 20.6% | 74258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.6% | 304 |
| myl.micro.Troodon 1.10 | 2.1 | 13.5% | 57 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 11.8% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 4.4 | 10.5% | 18 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.4% | 17 |
| fm.mammillarias 1.3 | 5.6 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 6 |
| sample.Fire 1.0 | 9.2 | 5.3% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 83.2 | 21 / 35 | 6246 |
| 2 | 1 | 70.9 | 88.9 | 27 / 35 | 6021 |
| 3 | 1 | 69.6 | 84.4 | 24 / 35 | 5709 |
| 4 | 1 | 70.9 | 87.3 | 25 / 35 | 6193 |
| 5 | 1 | 68.4 | 77.5 | 20 / 35 | 6024 |
| 6 | 1 | 70.6 | 87.9 | 24 / 35 | 6148 |
| 7 | 1 | 72.9 | 94.6 | 30 / 35 | 6637 |
| 8 | 1 | 70.7 | 87.6 | 25 / 35 | 6281 |
| 9 | 1 | 71.1 | 90.8 | 27 / 35 | 5857 |
| 10 | 1 | 70.6 | 83.5 | 26 / 35 | 6393 |
| 11 | 1 | 70.9 | 87.3 | 27 / 35 | 6293 |
| 12 | 1 | 70.9 | 84.4 | 28 / 35 | 6456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 93 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 86 | 92% |
| myl.nano.KomoriNinja 1.1 | 43 | 91% |
| cb.nano.Insomnia 1.0 | 38 | 95% |
| sp.Nanos.Ember 1.1 | 33 | 94% |
| sample.Fire 1.0 | 13 | 100% |
| cs.sheldor.Talon 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |

Hadur died in 116 of 420 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 22% | 87 |
| myl.nano.KomoriNinja 1.1 | 21 | 18% | 68 |
| myl.micro.Troodon 1.10 | 20 | 17% | 132 |
| cb.nano.Insomnia 1.0 | 16 | 14% | 24 |
| fm.mammillarias 1.3 | 12 | 10% | 24 |
| sp.Nanos.Ember 1.1 | 8 | 7% | 42 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 23 |
| sample.Fire 1.0 | 4 | 3% | 10 |
| sample.Tracker 1.0 | 4 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.5 | 308 / 420 | 2.12 | 20.7% | 77401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.7% | 308 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.0% | 28 |
| kawigi.nano.Lib 1.0 | 2.6 | 12.1% | 17 |
| tj.zombie1n 1.0.1 | 5.0 | 9.5% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 23 |
| yk.JahMicro 1.0 | 6.5 | 8.4% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 7.6 | 7.8% | 15 |
| repositorio.NanoStep 1.0 | 9.1 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 84.4 | 25 / 35 | 6031 |
| 2 | 1 | 69.1 | 85.1 | 24 / 35 | 5826 |
| 3 | 1 | 69.1 | 81.6 | 23 / 35 | 6413 |
| 4 | 1 | 70.1 | 86.3 | 24 / 35 | 6448 |
| 5 | 1 | 72.1 | 94.6 | 30 / 35 | 6395 |
| 6 | 1 | 71.9 | 92.1 | 30 / 35 | 6650 |
| 7 | 1 | 71.8 | 91.7 | 28 / 35 | 6649 |
| 8 | 1 | 71.3 | 88.3 | 25 / 35 | 7002 |
| 9 | 1 | 67.1 | 75.6 | 20 / 35 | 6050 |
| 10 | 1 | 71.5 | 88.6 | 27 / 35 | 7259 |
| 11 | 1 | 71.7 | 93.0 | 28 / 35 | 6436 |
| 12 | 1 | 70.3 | 88.9 | 24 / 35 | 6242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 117 | 95% |
| stelo.SoJNanoMelee 1.1 | 82 | 93% |
| tj.zombie1n 1.0.1 | 43 | 77% |
| tvv.micro.Antares 1.1.1 | 32 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 31 | 71% |
| yk.JahMicro 1.0 | 20 | 85% |
| sample.VelociRobot 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 6 | 100% |

Hadur died in 114 of 420 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 26% | 153 |
| tj.zombie1n 1.0.1 | 23 | 20% | 35 |
| stelo.SoJNanoMelee 1.1 | 14 | 12% | 58 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 11% | 46 |
| tvv.micro.Antares 1.1.1 | 11 | 10% | 52 |
| yk.JahMicro 1.0 | 10 | 9% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 9% | 18 |
| repositorio.NanoStep 1.0 | 2 | 2% | 14 |
| sample.VelociRobot 1.0 | 0 | 0% | 16 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.4 | 187 / 420 | 3.85 | 15.6% | 56196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 15.6% | 187 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 66 |
| ahf.NanoAndrew .4 | 3.4 | 11.5% | 48 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.7% | 37 |
| sam.Samspin 1.0 | 4.8 | 10.2% | 34 |
| EBBU.Sim2 1.02 | 6.5 | 9.3% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.6 | 9.4% | 21 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.7% | 1 |
| sample.TrackFire 1.0 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 61.9 | 12 / 35 | 4710 |
| 2 | 1 | 65.2 | 72.7 | 22 / 35 | 4980 |
| 3 | 1 | 63.1 | 69.5 | 13 / 35 | 4813 |
| 4 | 1 | 62.4 | 65.4 | 14 / 35 | 4700 |
| 5 | 1 | 60.2 | 63.5 | 9 / 35 | 4409 |
| 6 | 1 | 62.9 | 69.5 | 18 / 35 | 4481 |
| 7 | 1 | 63.5 | 70.2 | 14 / 35 | 5015 |
| 8 | 1 | 64.3 | 70.5 | 20 / 35 | 4613 |
| 9 | 1 | 63.6 | 70.5 | 15 / 35 | 4745 |
| 10 | 1 | 64.4 | 72.1 | 18 / 35 | 4773 |
| 11 | 1 | 64.9 | 72.7 | 19 / 35 | 4660 |
| 12 | 1 | 60.9 | 61.9 | 13 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 68 | 75% |
| simonton.nano.MeleeSeed 1.8 | 55 | 89% |
| ahf.NanoAndrew .4 | 35 | 86% |
| sam.Samspin 1.0 | 27 | 89% |
| EBBU.Sim2 1.02 | 13 | 85% |
| robar.nano.Assertive_Melee 0.2 | 10 | 80% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 50% |

Hadur died in 234 of 420 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 37 | 16% | 101 |
| simonton.nano.MeleeSeed 1.8 | 37 | 16% | 80 |
| robar.nano.Assertive_Melee 0.2 | 32 | 14% | 36 |
| zyx.nano.BacillusComma 1.0 | 28 | 12% | 38 |
| EBBU.Sim2 1.02 | 25 | 11% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 10% | 23 |
| ahf.NanoAndrew .4 | 22 | 9% | 55 |
| sam.Samspin 1.0 | 21 | 9% | 37 |
| sample.TrackFire 1.0 | 9 | 4% | 11 |

## Melee bench: F06

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.4 | 296 / 420 | 2.13 | 19.5% | 63152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.5% | 296 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.2% | 48 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 9.9% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 13 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.5% | 5 |
| fm.claire 1.7 | 6.3 | 8.6% | 1 |
| sample.SpinBot 1.0 | 7.6 | 7.3% | 3 |
| pa.Improved 1.0 | 9.3 | 6.1% | 2 |
| kurios.DOSexe .9b | 9.6 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.3 | 24 / 35 | 5694 |
| 2 | 1 | 68.1 | 85.1 | 20 / 35 | 5154 |
| 3 | 1 | 69.5 | 87.0 | 28 / 35 | 5276 |
| 4 | 1 | 69.9 | 88.3 | 26 / 35 | 5768 |
| 5 | 1 | 67.6 | 83.8 | 22 / 35 | 4810 |
| 6 | 1 | 68.8 | 83.8 | 25 / 35 | 5467 |
| 7 | 1 | 68.7 | 87.6 | 24 / 35 | 4986 |
| 8 | 1 | 69.1 | 86.0 | 26 / 35 | 5126 |
| 9 | 1 | 68.5 | 85.7 | 23 / 35 | 5067 |
| 10 | 1 | 69.2 | 88.9 | 25 / 35 | 5218 |
| 11 | 1 | 69.7 | 92.1 | 25 / 35 | 5183 |
| 12 | 1 | 70.8 | 93.7 | 28 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 135 | 92% |
| oog.melee.CapuletDroid 1.1 | 72 | 78% |
| gh.nano.Grofvuil 0.2 | 42 | 81% |
| arthord.NanoSatanMelee Beta | 32 | 97% |
| winamp32.micro.MicroMacro 1.0 | 20 | 75% |
| sample.SpinBot 1.0 | 14 | 100% |
| fm.claire 1.7 | 12 | 92% |
| kurios.DOSexe .9b | 7 | 86% |
| pa.Improved 1.0 | 5 | 80% |

Hadur died in 126 of 420 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 26% | 164 |
| oog.melee.CapuletDroid 1.1 | 28 | 22% | 34 |
| gh.nano.Grofvuil 0.2 | 18 | 14% | 70 |
| arthord.NanoSatanMelee Beta | 11 | 9% | 36 |
| kurios.DOSexe .9b | 10 | 8% | 29 |
| fm.claire 1.7 | 9 | 7% | 32 |
| winamp32.micro.MicroMacro 1.0 | 7 | 6% | 27 |
| sample.SpinBot 1.0 | 5 | 4% | 12 |
| pa.Improved 1.0 | 4 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.0 | 180 / 420 | 2.80 | 17.6% | 64302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.6% | 180 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.3% | 92 |
| mz.MicroGodMelee 1 | 3.3 | 13.7% | 81 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 13.3% | 45 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 14 |
| caimano.Furia_Ceca 0.22 | 6.1 | 7.4% | 1 |
| acogdev.alpha 0.2 | 8.2 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 8.4 | 5.9% | 2 |
| el.JumpShoot 0.2 | 8.4 | 6.1% | 5 |
| fire219.CatBot 1.0 | 8.9 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.1 | 14 / 35 | 5437 |
| 2 | 1 | 69.5 | 90.5 | 15 / 35 | 6024 |
| 3 | 1 | 67.9 | 85.4 | 17 / 35 | 5215 |
| 4 | 1 | 67.0 | 78.1 | 15 / 35 | 5615 |
| 5 | 1 | 66.9 | 77.8 | 13 / 35 | 5623 |
| 6 | 1 | 65.9 | 81.6 | 13 / 35 | 4727 |
| 7 | 1 | 66.6 | 80.3 | 16 / 35 | 5165 |
| 8 | 1 | 65.3 | 74.6 | 16 / 35 | 5156 |
| 9 | 1 | 67.3 | 82.2 | 13 / 35 | 5419 |
| 10 | 1 | 66.6 | 75.6 | 14 / 35 | 5532 |
| 11 | 1 | 66.7 | 76.8 | 16 / 35 | 5277 |
| 12 | 1 | 66.8 | 79.7 | 18 / 35 | 5112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 99 | 91% |
| mz.MicroGodMelee 1 | 99 | 46% |
| gh.micro.Gruweltje 0.7 | 63 | 29% |
| DBall.Anarchy 0.1 | 19 | 95% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 240 of 420 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 87 | 36% | 148 |
| gh.micro.Gruweltje 0.7 | 78 | 33% | 108 |
| spinnercat.micro.Tyger 0.1 | 33 | 14% | 98 |
| acogdev.alpha 0.2 | 11 | 5% | 12 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 12 |
| fire219.CatBot 1.0 | 8 | 3% | 8 |
| DBall.Anarchy 0.1 | 5 | 2% | 18 |
| el.JumpShoot 0.2 | 5 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 10 |

## Melee bench: F08

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.0 | 214 / 420 | 3.61 | 16.2% | 58942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.5 | 16.2% | 214 |
| simonton.micro.Sprout 1.1.3 | 1.6 | 15.4% | 79 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.9 | 13.5% | 64 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.3% | 12 |
| germ.TheMind .2 | 5.6 | 9.3% | 9 |
| awesomeness.Elite 1.0 | 6.3 | 8.6% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 11 |
| sample.Crazy 1.0 | 8.2 | 7.1% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 66.7 | 15 / 35 | 5003 |
| 2 | 2 | 61.4 | 65.7 | 14 / 35 | 4195 |
| 3 | 1 | 64.6 | 72.4 | 18 / 35 | 4703 |
| 4 | 2 | 63.6 | 66.3 | 16 / 35 | 4951 |
| 5 | 2 | 64.5 | 71.1 | 16 / 35 | 4792 |
| 6 | 2 | 63.6 | 68.9 | 14 / 35 | 4996 |
| 7 | 1 | 68.4 | 83.2 | 26 / 35 | 5325 |
| 8 | 1 | 65.8 | 74.0 | 18 / 35 | 5380 |
| 9 | 1 | 62.8 | 66.0 | 17 / 35 | 4990 |
| 10 | 1 | 66.1 | 77.5 | 23 / 35 | 4680 |
| 11 | 2 | 65.1 | 72.4 | 20 / 35 | 4935 |
| 12 | 1 | 63.8 | 68.3 | 17 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 164 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 82% |
| germ.TheMind .2 | 12 | 100% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| sample.Crazy 1.0 | 9 | 100% |
| awesomeness.Elite 1.0 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 206 of 420 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 95 | 46% | 213 |
| simonton.nano.WeekendObsession_Melee 1.0 | 38 | 18% | 68 |
| qualidafial.MajorDick 1.0.1 | 17 | 8% | 21 |
| awesomeness.Elite 1.0 | 16 | 8% | 31 |
| germ.TheMind .2 | 11 | 5% | 29 |
| stelo.UntouchableNano 1.3 | 10 | 5% | 23 |
| lrem.micro.MoggFanatic 0.2 | 10 | 5% | 17 |
| mym.EdgeStalker 1.0 | 6 | 3% | 8 |
| sample.Crazy 1.0 | 3 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.9 | 314 / 420 | 2.00 | 20.0% | 59290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.0% | 314 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 24 |
| maribo.IotaCT 1.1 | 4.5 | 10.6% | 17 |
| timmit.nano.TimDog 0.33 | 5.1 | 9.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.2% | 9 |
| spinnercat.Omen 1.0 | 8.0 | 7.9% | 8 |
| stelo.PatternRobot 1.0 | 8.0 | 7.9% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 25 / 35 | 5638 |
| 2 | 1 | 72.0 | 94.9 | 29 / 35 | 4959 |
| 3 | 1 | 71.3 | 91.4 | 29 / 35 | 4958 |
| 4 | 1 | 69.9 | 85.4 | 25 / 35 | 5107 |
| 5 | 1 | 72.3 | 97.1 | 29 / 35 | 5119 |
| 6 | 1 | 71.1 | 91.1 | 29 / 35 | 4778 |
| 7 | 1 | 70.5 | 89.5 | 27 / 35 | 5012 |
| 8 | 1 | 68.2 | 86.0 | 22 / 35 | 4519 |
| 9 | 1 | 70.1 | 87.0 | 24 / 35 | 4981 |
| 10 | 1 | 69.4 | 86.7 | 25 / 35 | 4672 |
| 11 | 1 | 70.6 | 87.9 | 27 / 35 | 5081 |
| 12 | 1 | 67.7 | 79.0 | 23 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 142 | 94% |
| nz.jdc.nano.GridFu 1.0 | 90 | 92% |
| timmit.nano.TimDog 0.33 | 29 | 93% |
| stelo.PatternRobot 1.0 | 29 | 93% |
| maribo.IotaCT 1.1 | 20 | 90% |
| ratosh.Wesco 1.4 | 14 | 79% |
| spinnercat.Omen 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 106 of 420 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 23 | 22% | 122 |
| nz.jdc.nano.GridFu 1.0 | 18 | 17% | 106 |
| timmit.nano.TimDog 0.33 | 18 | 17% | 53 |
| maribo.IotaCT 1.1 | 13 | 12% | 45 |
| ratosh.Wesco 1.4 | 12 | 11% | 29 |
| stelo.PatternRobot 1.0 | 11 | 10% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 8% | 18 |
| spinnercat.Omen 1.0 | 2 | 2% | 17 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 3 |

## Melee bench: F10

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.1 | 347 / 420 | 1.80 | 21.3% | 76485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.3% | 347 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 31 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 6 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6.1 | 8.5% | 3 |
| sanja.First 0.1 | 6.5 | 8.2% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 12 |
| amk.Punbot.Punbot 0.01 | 8.8 | 6.8% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 27 / 35 | 5948 |
| 2 | 1 | 72.9 | 95.6 | 31 / 35 | 6827 |
| 3 | 1 | 71.5 | 89.5 | 29 / 35 | 6464 |
| 4 | 1 | 72.6 | 96.5 | 32 / 35 | 6544 |
| 5 | 1 | 70.3 | 88.6 | 26 / 35 | 6377 |
| 6 | 1 | 71.5 | 93.3 | 30 / 35 | 6291 |
| 7 | 1 | 69.9 | 89.2 | 25 / 35 | 5838 |
| 8 | 1 | 73.0 | 95.9 | 33 / 35 | 6938 |
| 9 | 1 | 71.0 | 91.4 | 29 / 35 | 6118 |
| 10 | 1 | 71.1 | 89.2 | 27 / 35 | 6693 |
| 11 | 1 | 68.6 | 81.9 | 27 / 35 | 5553 |
| 12 | 1 | 72.5 | 93.3 | 31 / 35 | 6894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 91 | 98% |
| tvv.nano.Polaris 1.2 | 80 | 93% |
| cvt.Firsty 1.0 | 56 | 89% |
| sanja.First 0.1 | 46 | 98% |
| zyx.micro.Ant 1.1 | 34 | 94% |
| Grystrion.TrackerWO 1.0 | 27 | 96% |
| amk.Punbot.Punbot 0.01 | 23 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 75 of 420 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 27% | 61 |
| tvv.nano.Polaris 1.2 | 14 | 19% | 116 |
| Grystrion.TrackerWO 1.0 | 9 | 12% | 32 |
| baal.nano.N 1.42 | 8 | 11% | 74 |
| cvt.Firsty 1.0 | 8 | 11% | 46 |
| squidM.TentalceMeleeNano 1.1 | 5 | 7% | 19 |
| sample.RamFire 1.0 | 5 | 7% | 10 |
| sanja.First 0.1 | 3 | 4% | 44 |
| amk.Punbot.Punbot 0.01 | 3 | 4% | 10 |

## Melee bench: F11

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.3 | 164 / 420 | 3.58 | 15.6% | 58168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.8% | 147 |
| hadur117.micro.SaorDC 0.1 | 1.7 | 15.6% | 164 |
| cs.Wren 1.0 | 3.3 | 12.2% | 34 |
| mz.Cork 0.1 | 4.3 | 11.2% | 31 |
| js.PinBall 1.6 | 4.4 | 11.3% | 22 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 8 |
| evd.X1 0.01 | 7.0 | 7.9% | 4 |
| jsal.Jsalbot 1.0 | 7.9 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 4 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 62.9 | 11 / 35 | 4411 |
| 2 | 2 | 65.9 | 75.6 | 14 / 35 | 5475 |
| 3 | 2 | 60.3 | 61.3 | 10 / 35 | 4642 |
| 4 | 1 | 64.5 | 74.6 | 15 / 35 | 5092 |
| 5 | 1 | 65.8 | 77.1 | 16 / 35 | 5362 |
| 6 | 2 | 60.9 | 66.7 | 11 / 35 | 4244 |
| 7 | 1 | 64.9 | 73.0 | 16 / 35 | 5267 |
| 8 | 1 | 66.4 | 80.0 | 19 / 35 | 4964 |
| 9 | 2 | 64.4 | 74.3 | 11 / 35 | 4886 |
| 10 | 2 | 62.2 | 67.9 | 11 / 35 | 4342 |
| 11 | 3 | 58.3 | 58.7 | 8 / 35 | 4253 |
| 12 | 1 | 67.7 | 83.8 | 22 / 35 | 5230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 140 | 56% |
| cs.Wren 1.0 | 40 | 88% |
| js.PinBall 1.6 | 24 | 75% |
| mz.Cork 0.1 | 23 | 83% |
| jsal.Jsalbot 1.0 | 7 | 71% |
| joe.ADinosaur 1.0 | 5 | 100% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 259 of 420 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 118 | 46% | 209 |
| joe.ADinosaur 1.0 | 32 | 12% | 35 |
| cs.Wren 1.0 | 27 | 10% | 46 |
| js.PinBall 1.6 | 24 | 9% | 45 |
| mz.Cork 0.1 | 21 | 8% | 35 |
| evd.X1 0.01 | 19 | 7% | 23 |
| PSW.Relentless 0.1 | 12 | 5% | 12 |
| jsal.Jsalbot 1.0 | 3 | 1% | 10 |
| donjezza.Jezza 1.0 | 3 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.4 | 284 / 420 | 2.50 | 18.9% | 57420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.9% | 284 |
| ntc.Opposite 1.5 | 2.9 | 11.5% | 11 |
| myl.nano.Graviton 1.10 | 3.1 | 11.3% | 37 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.8% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.9 | 10.2% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.8% | 11 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 17 |
| DBall.NUKE 0.1 | 7.4 | 8.0% | 7 |
| donjezza.Muncho 1.0 | 9.1 | 6.1% | 13 |
| pbg.R2D2 1.0 | 9.9 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 22 / 35 | 4568 |
| 2 | 1 | 70.6 | 92.1 | 29 / 35 | 5046 |
| 3 | 1 | 68.7 | 87.6 | 23 / 35 | 4628 |
| 4 | 1 | 66.5 | 78.7 | 21 / 35 | 4498 |
| 5 | 1 | 67.7 | 82.2 | 23 / 35 | 4669 |
| 6 | 1 | 70.2 | 89.2 | 25 / 35 | 5358 |
| 7 | 1 | 67.8 | 82.2 | 24 / 35 | 4674 |
| 8 | 1 | 64.5 | 72.4 | 19 / 35 | 4194 |
| 9 | 1 | 69.6 | 84.8 | 27 / 35 | 5216 |
| 10 | 1 | 67.0 | 78.7 | 24 / 35 | 4664 |
| 11 | 1 | 67.8 | 82.9 | 21 / 35 | 4823 |
| 12 | 1 | 69.4 | 87.9 | 26 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 87 | 94% |
| myl.nano.Graviton 1.10 | 54 | 91% |
| ntc.Opposite 1.5 | 39 | 95% |
| disan.Chair 2.2.0 | 29 | 90% |
| donjezza.Muncho 1.0 | 28 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 28 | 93% |
| DBall.NUKE 0.1 | 28 | 100% |
| pfvicm.Sobieski 7.2.3b | 13 | 85% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 136 of 420 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 30 | 22% | 47 |
| myl.nano.Graviton 1.10 | 23 | 17% | 80 |
| ntc.Opposite 1.5 | 20 | 15% | 57 |
| stelo.AreaTargetingBot 1.1 | 19 | 14% | 79 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 13% | 49 |
| donjezza.Muncho 1.0 | 10 | 7% | 25 |
| disan.Chair 2.2.0 | 8 | 6% | 24 |
| pbg.R2D2 1.0 | 5 | 4% | 18 |
| DBall.NUKE 0.1 | 4 | 3% | 38 |

## Melee bench: F13

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.0 | 182 / 420 | 3.61 | 15.5% | 50061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.3 | 15.5% | 182 |
| oog.melee.Capulet 1.2 | 2.6 | 14.2% | 91 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.9% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.9 | 12.7% | 42 |
| yagami.Tidus 0.11 | 4.8 | 11.7% | 16 |
| ejb.Polaris 1.0.1 | 5.9 | 10.4% | 16 |
| stelo.MirrorNano 1.3 | 7.3 | 8.0% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.8 | 19 / 35 | 4374 |
| 2 | 1 | 65.2 | 74.3 | 18 / 35 | 4007 |
| 3 | 1 | 62.9 | 67.9 | 16 / 35 | 3963 |
| 4 | 2 | 63.5 | 69.5 | 17 / 35 | 3907 |
| 5 | 1 | 65.9 | 77.5 | 13 / 35 | 4660 |
| 6 | 1 | 65.1 | 75.2 | 14 / 35 | 4234 |
| 7 | 1 | 64.6 | 71.1 | 15 / 35 | 4469 |
| 8 | 1 | 63.6 | 68.3 | 15 / 35 | 4238 |
| 9 | 1 | 63.7 | 72.1 | 14 / 35 | 3947 |
| 10 | 1 | 65.5 | 74.3 | 16 / 35 | 4408 |
| 11 | 2 | 62.0 | 62.2 | 13 / 35 | 3950 |
| 12 | 2 | 61.5 | 61.6 | 12 / 35 | 3904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 66 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 89% |
| kawigi.micro.Shiz 1.1 | 54 | 98% |
| yagami.Tidus 0.11 | 28 | 89% |
| ejb.Polaris 1.0.1 | 13 | 54% |
| stelo.MirrorNano 1.3 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 105 | 44% | 156 |
| yagami.Tidus 0.11 | 31 | 13% | 53 |
| ejb.Polaris 1.0.1 | 28 | 12% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 10% | 78 |
| kawigi.micro.Shiz 1.1 | 19 | 8% | 56 |
| stelo.MirrorNano 1.3 | 16 | 7% | 18 |
| step.nanoPri 1.0 | 8 | 3% | 9 |
| kurios.DOSexe .9a | 7 | 3% | 9 |

## Melee bench: F14

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.9 | 266 / 420 | 2.72 | 17.7% | 54194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.7% | 266 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 33 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 57 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 31 |
| ratosh.Nobo 0.21 | 4.3 | 11.2% | 15 |
| m3thos.Eva00 1.1 | 6.1 | 9.4% | 9 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.9 | 7.1% | 4 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 74.9 | 23 / 35 | 4529 |
| 2 | 1 | 68.2 | 87.9 | 24 / 35 | 4554 |
| 3 | 1 | 67.9 | 84.8 | 25 / 35 | 4602 |
| 4 | 1 | 68.1 | 86.0 | 23 / 35 | 5032 |
| 5 | 1 | 64.7 | 75.6 | 20 / 35 | 4422 |
| 6 | 1 | 67.4 | 82.2 | 24 / 35 | 4585 |
| 7 | 1 | 69.3 | 88.9 | 24 / 35 | 5253 |
| 8 | 1 | 62.8 | 67.9 | 17 / 35 | 4326 |
| 9 | 1 | 66.0 | 82.9 | 22 / 35 | 4013 |
| 10 | 1 | 65.3 | 78.1 | 21 / 35 | 4228 |
| 11 | 1 | 65.0 | 74.6 | 20 / 35 | 4255 |
| 12 | 1 | 67.9 | 87.3 | 23 / 35 | 4395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 98 | 91% |
| wee.Gem 1.8.4 | 85 | 88% |
| wompi.Quokka 1.6 | 42 | 90% |
| ratosh.Nobo 0.21 | 24 | 96% |
| m3thos.Eva00 1.1 | 21 | 90% |
| bayen.UbaMicro 1.4 | 17 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 155 of 420 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 31 | 20% | 103 |
| bzdp.Pansy 2.1 | 27 | 17% | 99 |
| wompi.Quokka 1.6 | 19 | 12% | 56 |
| jeremyreeder.Vincent 2011.12.09 | 17 | 11% | 21 |
| bayen.UbaMicro 1.4 | 15 | 10% | 28 |
| ratosh.Nobo 0.21 | 13 | 8% | 46 |
| maribo.FollowFire 1 | 13 | 8% | 16 |
| stelo.MyAgileRobot 0.2 | 11 | 7% | 15 |
| m3thos.Eva00 1.1 | 9 | 6% | 30 |

## Melee bench: F15

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.5 | 138 / 420 | 2.57 | 19.2% | 86124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.8% | 243 |
| hadur117.micro.SaorDC 0.1 | 1.8 | 19.2% | 138 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 27 |
| ayk.WallHugger 1.0 | 4.4 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.0% | 6 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 7.9 | 6.0% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.0 | 86.7 | 13 / 35 | 7351 |
| 2 | 1 | 70.9 | 84.4 | 14 / 35 | 7268 |
| 3 | 2 | 68.5 | 80.0 | 15 / 35 | 6240 |
| 4 | 2 | 70.7 | 83.5 | 10 / 35 | 7623 |
| 5 | 2 | 69.6 | 82.5 | 9 / 35 | 6917 |
| 6 | 1 | 71.3 | 87.0 | 14 / 35 | 7367 |
| 7 | 2 | 69.3 | 80.0 | 9 / 35 | 7141 |
| 8 | 2 | 67.7 | 76.2 | 8 / 35 | 6598 |
| 9 | 2 | 70.3 | 81.6 | 13 / 35 | 7118 |
| 10 | 1 | 71.2 | 85.4 | 14 / 35 | 7636 |
| 11 | 2 | 70.4 | 82.2 | 10 / 35 | 7263 |
| 12 | 2 | 70.0 | 81.0 | 9 / 35 | 7602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 219 | 33% |
| mz.NanoGod 2.02 | 37 | 68% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 5 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 285 of 420 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 197 | 69% | 274 |
| mz.NanoGod 2.02 | 49 | 17% | 81 |
| ayk.WallHugger 1.0 | 15 | 5% | 23 |
| exauge.GateKeeper 1.1.121g | 12 | 4% | 20 |
| stuff.Vlad 0.1 | 5 | 2% | 8 |
| stelo.PianistNano 1.2 | 4 | 1% | 5 |
| drd.Dreadknoght 0.9 | 3 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.9 | 222 / 420 | 3.53 | 16.5% | 57188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 16.5% | 222 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.3% | 34 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.3% | 48 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 32 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.6 | 10.7% | 37 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 17 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.4 | 7.0% | 21 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 73.0 | 18 / 35 | 4710 |
| 2 | 1 | 65.5 | 72.4 | 17 / 35 | 5088 |
| 3 | 1 | 64.7 | 73.7 | 19 / 35 | 4511 |
| 4 | 1 | 64.4 | 71.7 | 18 / 35 | 4580 |
| 5 | 1 | 66.7 | 79.4 | 23 / 35 | 4896 |
| 6 | 1 | 63.5 | 68.6 | 17 / 35 | 4408 |
| 7 | 1 | 62.5 | 63.2 | 18 / 35 | 4589 |
| 8 | 1 | 61.5 | 63.8 | 17 / 35 | 4274 |
| 9 | 1 | 66.2 | 77.8 | 20 / 35 | 5098 |
| 10 | 1 | 64.5 | 69.2 | 17 / 35 | 5197 |
| 11 | 1 | 66.7 | 77.8 | 19 / 35 | 5157 |
| 12 | 1 | 64.2 | 71.7 | 19 / 35 | 4680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 71 | 94% |
| dummy.micro.Sparrow 2.5 | 54 | 83% |
| bvh.micro.Freya 0.3 | 40 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 37 | 89% |
| ap.Frederick 1.1 | 20 | 100% |
| stelo.MirrorMicro 1.0 | 19 | 84% |
| conscience.Electron 1.3g | 5 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 200 of 420 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 36 | 18% | 37 |
| conscience.Electron 1.3g | 34 | 17% | 45 |
| dummy.micro.Sparrow 2.5 | 33 | 17% | 78 |
| voidious.micro.BlitzBat 1.05 | 27 | 14% | 81 |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 13% | 67 |
| bvh.micro.Freya 0.3 | 18 | 9% | 42 |
| dl.BetterWalls 1.0 | 16 | 8% | 29 |
| stelo.MirrorMicro 1.0 | 8 | 4% | 38 |
| ap.Frederick 1.1 | 2 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.3 | 302 / 420 | 2.05 | 21.2% | 81909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.2% | 302 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 38 |
| sul.Lunar 1.1 | 3.4 | 11.2% | 24 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.8% | 16 |
| dsw.StaticD 1.0 | 5.3 | 8.9% | 17 |
| mme.NikeEnhanced 2.0 | 5.8 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 8 |
| sample.MyFirstRobot 1.0 | 9.1 | 5.6% | 9 |
| sample.Corners 1.0 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.3 | 25 / 35 | 6588 |
| 2 | 1 | 69.8 | 82.9 | 24 / 35 | 6520 |
| 3 | 1 | 71.8 | 91.7 | 25 / 35 | 6708 |
| 4 | 1 | 72.1 | 90.5 | 26 / 35 | 6926 |
| 5 | 1 | 71.0 | 83.5 | 24 / 35 | 7191 |
| 6 | 1 | 72.0 | 90.8 | 26 / 35 | 7067 |
| 7 | 1 | 71.4 | 89.5 | 25 / 35 | 6864 |
| 8 | 1 | 72.5 | 90.2 | 27 / 35 | 7277 |
| 9 | 1 | 71.0 | 87.0 | 23 / 35 | 6962 |
| 10 | 1 | 72.1 | 91.4 | 28 / 35 | 6743 |
| 11 | 1 | 72.0 | 90.2 | 25 / 35 | 6977 |
| 12 | 1 | 69.7 | 83.8 | 24 / 35 | 6086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 104 | 84% |
| sul.Lunar 1.1 | 86 | 99% |
| supersample.SuperBoxBot 1.0 | 50 | 94% |
| dsw.StaticD 1.0 | 27 | 59% |
| sample.MyFirstJuniorRobot 1.0 | 21 | 90% |
| sample.MyFirstRobot 1.0 | 16 | 88% |
| mme.NikeEnhanced 2.0 | 16 | 94% |
| tlp.ThreeLeggedPig 1 | 13 | 85% |
| sample.Corners 1.0 | 7 | 100% |

Hadur died in 124 of 420 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 36 | 29% | 132 |
| supersample.SuperBoxBot 1.0 | 26 | 21% | 65 |
| dsw.StaticD 1.0 | 24 | 19% | 61 |
| sul.Lunar 1.1 | 8 | 6% | 78 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 19 |
| tlp.ThreeLeggedPig 1 | 6 | 5% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 4% | 21 |
| mme.NikeEnhanced 2.0 | 4 | 3% | 21 |
| sample.Corners 1.0 | 3 | 2% | 13 |
4 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.1 | 251 / 420 | 2.61 | 18.9% | 76168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.9% | 251 |
| radnor.DoctorBob 1.42 | 2.3 | 12.9% | 55 |
| mld.Wisdom 1.0 | 3.3 | 11.8% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.2% | 29 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.5% | 22 |
| amz.NanoClone 1.41 | 5.4 | 9.8% | 14 |
| sample.Walls 1.0 | 6.9 | 7.8% | 7 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 6 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 76.2 | 18 / 35 | 6303 |
| 2 | 1 | 65.5 | 72.4 | 16 / 35 | 5845 |
| 3 | 1 | 66.8 | 75.2 | 19 / 35 | 6136 |
| 4 | 1 | 71.3 | 89.5 | 24 / 35 | 7351 |
| 5 | 1 | 69.0 | 83.2 | 24 / 35 | 6250 |
| 6 | 1 | 67.6 | 80.6 | 19 / 35 | 5943 |
| 7 | 1 | 70.1 | 88.3 | 24 / 35 | 6442 |
| 8 | 1 | 70.2 | 89.5 | 22 / 35 | 6314 |
| 9 | 1 | 69.4 | 84.1 | 20 / 35 | 7013 |
| 10 | 1 | 68.6 | 83.5 | 21 / 35 | 6190 |
| 11 | 1 | 68.3 | 82.2 | 22 / 35 | 6046 |
| 12 | 1 | 68.3 | 81.0 | 22 / 35 | 6335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 89 | 99% |
| radnor.DoctorBob 1.42 | 66 | 73% |
| KiraNL.Chupacabra 0.4 | 37 | 78% |
| mld.Wisdom 1.0 | 35 | 74% |
| amz.NanoClone 1.41 | 25 | 88% |
| jangs.ns51 1.0 | 14 | 93% |
| sample.Walls 1.0 | 10 | 100% |
| GarmBox.Oranges 1.0 | 8 | 88% |
| sample.Target 1.0 | 8 | 100% |

Hadur died in 170 of 420 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 42 | 25% | 73 |
| radnor.DoctorBob 1.42 | 36 | 21% | 99 |
| KiraNL.Chupacabra 0.4 | 35 | 21% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 14% | 111 |
| amz.NanoClone 1.41 | 18 | 11% | 39 |
| jangs.ns51 1.0 | 7 | 4% | 17 |
| GarmBox.Oranges 1.0 | 6 | 4% | 8 |
| sample.Walls 1.0 | 2 | 1% | 15 |

