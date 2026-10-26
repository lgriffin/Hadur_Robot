# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.3 | 304 / 420 | 1.96 | 21.4% | 85637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.4% | 304 |
| radnor.DoctorBob 1.42 | 2.4 | 14.1% | 41 |
| mz.AntiGrav 1.0 | 3.1 | 13.8% | 23 |
| mld.Infinity 2.2 | 3.5 | 13.0% | 32 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 13 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 1 |
| sample.Walls 1.0 | 6.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 7.4 | 6.4% | 4 |
| arthord.MannyPacquiao Beta | 9.4 | 3.9% | 1 |
| sample.Target 1.0 | 9.6 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 93.3 | 27 / 35 | 7930 |
| 2 | 1 | 73.5 | 94.3 | 29 / 35 | 7180 |
| 3 | 1 | 71.8 | 89.5 | 26 / 35 | 6678 |
| 4 | 1 | 72.2 | 89.5 | 22 / 35 | 7272 |
| 5 | 1 | 70.8 | 84.8 | 23 / 35 | 6535 |
| 6 | 1 | 73.5 | 90.5 | 27 / 35 | 7920 |
| 7 | 1 | 70.1 | 79.7 | 23 / 35 | 6709 |
| 8 | 1 | 71.1 | 85.1 | 21 / 35 | 6966 |
| 9 | 1 | 73.0 | 91.7 | 25 / 35 | 7304 |
| 10 | 1 | 71.6 | 87.3 | 25 / 35 | 6971 |
| 11 | 1 | 74.4 | 96.8 | 31 / 35 | 7514 |
| 12 | 1 | 71.8 | 89.5 | 25 / 35 | 6658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 136 | 97% |
| mld.Infinity 2.2 | 100 | 91% |
| radnor.DoctorBob 1.42 | 67 | 81% |
| amz.NanoClone 1.41 | 16 | 81% |
| jangs.ns51 1.0 | 8 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 118 of 420 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 47 | 40% | 147 |
| mz.AntiGrav 1.0 | 21 | 18% | 158 |
| mld.Infinity 2.2 | 19 | 16% | 31 |
| amz.NanoClone 1.41 | 11 | 9% | 30 |
| jangs.ns51 1.0 | 11 | 9% | 19 |
| sample.Walls 1.0 | 5 | 4% | 17 |
| arthord.MannyPacquiao Beta | 2 | 2% | 8 |
| GarmBox.Oranges 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.3 | 240 / 420 | 3.05 | 17.3% | 58116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.6 | 17.3% | 240 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.9% | 115 |
| mld.DustBunny 3.8 | 2.8 | 13.2% | 24 |
| maribo.melee.BMV 0.1 | 4.3 | 10.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.4 | 9.1% | 15 |
| zyx.nano.Ant 1.1 | 5.8 | 8.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 7.8% | 13 |
| fullsail.SweetTea 1.1 | 7.8 | 7.5% | 6 |
| bzdp.BoxCar 2.0 | 8.8 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.2 | 21 / 35 | 5129 |
| 2 | 3 | 58.2 | 49.2 | 10 / 35 | 4282 |
| 3 | 1 | 68.8 | 89.5 | 24 / 35 | 4686 |
| 4 | 1 | 66.8 | 83.5 | 21 / 35 | 4633 |
| 5 | 1 | 69.2 | 83.5 | 25 / 35 | 5761 |
| 6 | 1 | 68.2 | 85.1 | 22 / 35 | 5016 |
| 7 | 1 | 69.6 | 91.7 | 25 / 35 | 5066 |
| 8 | 1 | 70.9 | 95.9 | 30 / 35 | 5465 |
| 9 | 1 | 68.6 | 86.3 | 23 / 35 | 5217 |
| 10 | 3 | 56.7 | 47.9 | 6 / 35 | 4181 |
| 11 | 1 | 69.0 | 89.5 | 23 / 35 | 4862 |
| 12 | 4 | 54.8 | 42.9 | 10 / 35 | 3818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 144 | 73% |
| mld.DustBunny 3.8 | 74 | 97% |
| djdjdj.NanoSkunk10 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| maribo.melee.BMV 0.1 | 13 | 100% |
| fullsail.SweetTea 1.1 | 12 | 100% |
| zyx.nano.Ant 1.1 | 9 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 180 of 420 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 31% | 166 |
| mld.DustBunny 3.8 | 30 | 17% | 87 |
| cs.Grudge 1.0 | 30 | 17% | 31 |
| zyx.nano.Ant 1.1 | 19 | 11% | 31 |
| djdjdj.NanoSkunk10 1.0 | 12 | 7% | 30 |
| maribo.melee.BMV 0.1 | 9 | 5% | 20 |
| fullsail.SweetTea 1.1 | 9 | 5% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 4% | 22 |
| bzdp.BoxCar 2.0 | 8 | 4% | 13 |

## Melee bench: F03

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.4 | 307 / 420 | 2.22 | 20.4% | 71745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.4% | 307 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 56 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.5% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.9 | 10.7% | 17 |
| cb.nano.Insomnia 1.0 | 5.4 | 9.5% | 14 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 9 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 5 |
| sample.Fire 1.0 | 9.3 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.6 | 27 / 35 | 5513 |
| 2 | 1 | 72.2 | 91.1 | 31 / 35 | 6228 |
| 3 | 1 | 70.0 | 86.0 | 23 / 35 | 5889 |
| 4 | 1 | 71.2 | 90.8 | 26 / 35 | 5911 |
| 5 | 1 | 72.2 | 90.5 | 29 / 35 | 6440 |
| 6 | 1 | 70.1 | 86.7 | 26 / 35 | 5830 |
| 7 | 1 | 68.4 | 78.7 | 21 / 35 | 6018 |
| 8 | 1 | 71.4 | 87.6 | 28 / 35 | 5979 |
| 9 | 1 | 69.9 | 84.4 | 20 / 35 | 6106 |
| 10 | 1 | 72.1 | 91.4 | 30 / 35 | 6458 |
| 11 | 1 | 69.0 | 81.6 | 24 / 35 | 5667 |
| 12 | 1 | 68.4 | 80.6 | 22 / 35 | 5706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 101 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 86 | 92% |
| cb.nano.Insomnia 1.0 | 39 | 90% |
| myl.nano.KomoriNinja 1.1 | 38 | 87% |
| fm.mammillarias 1.3 | 21 | 95% |
| sp.Nanos.Ember 1.1 | 19 | 95% |
| cs.sheldor.Talon 1.1 | 13 | 100% |
| sample.Fire 1.0 | 11 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 114 of 420 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 29 | 25% | 82 |
| cb.nano.Insomnia 1.0 | 24 | 21% | 36 |
| myl.micro.Troodon 1.10 | 20 | 18% | 123 |
| myl.nano.KomoriNinja 1.1 | 16 | 14% | 72 |
| fm.mammillarias 1.3 | 12 | 11% | 29 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 24 |
| sample.Fire 1.0 | 4 | 4% | 16 |
| sample.Tracker 1.0 | 3 | 3% | 2 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 30 |

## Melee bench: F04

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.6 | 323 / 420 | 1.94 | 21.3% | 79760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.3% | 323 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 26 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.0% | 18 |
| tj.zombie1n 1.0.1 | 5.4 | 9.1% | 18 |
| yk.JahMicro 1.0 | 7.0 | 7.9% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 7 |
| repositorio.NanoStep 1.0 | 8.9 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.0 | 23 / 35 | 6517 |
| 2 | 1 | 70.4 | 86.7 | 25 / 35 | 6503 |
| 3 | 1 | 69.8 | 85.7 | 24 / 35 | 6216 |
| 4 | 1 | 69.4 | 85.1 | 24 / 35 | 6157 |
| 5 | 1 | 71.7 | 90.8 | 26 / 35 | 6656 |
| 6 | 1 | 70.8 | 87.6 | 27 / 35 | 6413 |
| 7 | 1 | 71.5 | 91.1 | 26 / 35 | 6797 |
| 8 | 1 | 73.6 | 96.8 | 33 / 35 | 7050 |
| 9 | 1 | 72.2 | 91.7 | 28 / 35 | 6826 |
| 10 | 1 | 71.5 | 87.9 | 28 / 35 | 6824 |
| 11 | 1 | 74.2 | 99.0 | 33 / 35 | 7638 |
| 12 | 1 | 69.7 | 85.4 | 26 / 35 | 6163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 119 | 93% |
| stelo.SoJNanoMelee 1.1 | 83 | 94% |
| tj.zombie1n 1.0.1 | 37 | 86% |
| tvv.micro.Antares 1.1.1 | 37 | 97% |
| ers.nano.hawk.HawkLA 3.0m | 28 | 86% |
| repositorio.NanoStep 1.0 | 15 | 100% |
| yk.JahMicro 1.0 | 14 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |

Hadur died in 97 of 420 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 38% | 167 |
| tvv.micro.Antares 1.1.1 | 15 | 15% | 59 |
| stelo.SoJNanoMelee 1.1 | 13 | 13% | 59 |
| tj.zombie1n 1.0.1 | 12 | 12% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 9% | 50 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 8% | 19 |
| yk.JahMicro 1.0 | 2 | 2% | 11 |
| sample.VelociRobot 1.0 | 1 | 1% | 15 |
| repositorio.NanoStep 1.0 | 0 | 0% | 20 |

## Melee bench: F05

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.1 | 183 / 420 | 3.87 | 15.6% | 57342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 15.6% | 183 |
| oog.melee.Corsair 1.0 | 2.4 | 12.7% | 66 |
| ahf.NanoAndrew .4 | 3.1 | 11.7% | 65 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 10.3% | 36 |
| sam.Samspin 1.0 | 5.6 | 9.7% | 20 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.5% | 25 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.0% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 64.8 | 12 / 35 | 4585 |
| 2 | 1 | 65.7 | 75.2 | 19 / 35 | 5373 |
| 3 | 1 | 63.4 | 67.9 | 15 / 35 | 4982 |
| 4 | 1 | 59.8 | 60.3 | 13 / 35 | 4439 |
| 5 | 1 | 65.9 | 76.2 | 18 / 35 | 4962 |
| 6 | 1 | 64.6 | 71.7 | 17 / 35 | 4997 |
| 7 | 1 | 63.9 | 73.7 | 18 / 35 | 4507 |
| 8 | 1 | 61.8 | 65.4 | 12 / 35 | 4541 |
| 9 | 1 | 61.5 | 62.9 | 15 / 35 | 4608 |
| 10 | 1 | 62.5 | 66.3 | 14 / 35 | 4708 |
| 11 | 1 | 62.5 | 67.0 | 16 / 35 | 4736 |
| 12 | 1 | 62.6 | 66.0 | 14 / 35 | 4904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 61 | 89% |
| oog.melee.Corsair 1.0 | 58 | 64% |
| ahf.NanoAndrew .4 | 43 | 81% |
| sam.Samspin 1.0 | 23 | 91% |
| EBBU.Sim2 1.02 | 19 | 84% |
| robar.nano.Assertive_Melee 0.2 | 12 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 238 of 420 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 19% | 87 |
| oog.melee.Corsair 1.0 | 43 | 18% | 89 |
| robar.nano.Assertive_Melee 0.2 | 39 | 16% | 48 |
| ahf.NanoAndrew .4 | 27 | 11% | 70 |
| EBBU.Sim2 1.02 | 25 | 11% | 37 |
| zyx.nano.BacillusComma 1.0 | 20 | 8% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 20 | 8% | 20 |
| sam.Samspin 1.0 | 12 | 5% | 31 |
| sample.TrackFire 1.0 | 6 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.4 | 291 / 420 | 2.22 | 19.2% | 62746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.2% | 291 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 37 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.9% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.0% | 37 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 15 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 9 |
| fm.claire 1.7 | 6.3 | 8.5% | 2 |
| sample.SpinBot 1.0 | 7.7 | 7.1% | 2 |
| pa.Improved 1.0 | 9.5 | 5.9% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.5 | 27 / 35 | 5857 |
| 2 | 1 | 68.2 | 82.5 | 21 / 35 | 5230 |
| 3 | 1 | 66.9 | 81.3 | 19 / 35 | 5188 |
| 4 | 1 | 68.5 | 83.8 | 23 / 35 | 5366 |
| 5 | 1 | 69.5 | 90.2 | 27 / 35 | 5235 |
| 6 | 1 | 68.5 | 87.6 | 25 / 35 | 4928 |
| 7 | 1 | 69.4 | 90.2 | 25 / 35 | 4865 |
| 8 | 1 | 69.8 | 89.2 | 26 / 35 | 5553 |
| 9 | 1 | 67.3 | 82.5 | 23 / 35 | 4891 |
| 10 | 1 | 68.0 | 84.1 | 24 / 35 | 5033 |
| 11 | 1 | 68.0 | 84.1 | 24 / 35 | 5022 |
| 12 | 1 | 70.3 | 92.1 | 27 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 136 | 95% |
| oog.melee.CapuletDroid 1.1 | 74 | 84% |
| gh.nano.Grofvuil 0.2 | 33 | 91% |
| arthord.NanoSatanMelee Beta | 28 | 89% |
| winamp32.micro.MicroMacro 1.0 | 18 | 67% |
| sample.SpinBot 1.0 | 16 | 100% |
| fm.claire 1.7 | 10 | 100% |
| kurios.DOSexe .9b | 5 | 60% |
| pa.Improved 1.0 | 4 | 100% |

Hadur died in 133 of 420 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 27 | 20% | 40 |
| gh.nano.Grofvuil 0.2 | 25 | 19% | 79 |
| d414.nano.Quantum 1.0.0 | 24 | 18% | 137 |
| arthord.NanoSatanMelee Beta | 18 | 14% | 48 |
| winamp32.micro.MicroMacro 1.0 | 11 | 8% | 47 |
| fm.claire 1.7 | 11 | 8% | 20 |
| kurios.DOSexe .9b | 7 | 5% | 17 |
| sample.SpinBot 1.0 | 5 | 4% | 14 |
| pa.Improved 1.0 | 3 | 2% | 16 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.7 | 185 / 420 | 2.65 | 18.1% | 67953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.1% | 185 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.1% | 92 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.4% | 41 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 73 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 14 |
| caimano.Furia_Ceca 0.22 | 6.1 | 7.6% | 3 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 5 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.0% | 2 |
| el.JumpShoot 0.2 | 8.4 | 6.0% | 5 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.0 | 18 / 35 | 6147 |
| 2 | 1 | 67.3 | 78.1 | 16 / 35 | 5633 |
| 3 | 1 | 67.7 | 83.8 | 14 / 35 | 5480 |
| 4 | 1 | 68.4 | 81.0 | 17 / 35 | 6036 |
| 5 | 1 | 69.0 | 87.6 | 16 / 35 | 5977 |
| 6 | 1 | 67.8 | 82.2 | 16 / 35 | 5698 |
| 7 | 1 | 67.2 | 82.5 | 15 / 35 | 5333 |
| 8 | 1 | 68.8 | 85.1 | 15 / 35 | 5889 |
| 9 | 1 | 65.9 | 79.0 | 14 / 35 | 5407 |
| 10 | 1 | 64.1 | 72.4 | 10 / 35 | 5038 |
| 11 | 1 | 68.5 | 84.1 | 16 / 35 | 5687 |
| 12 | 1 | 66.8 | 78.1 | 18 / 35 | 5628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 93 | 90% |
| mz.MicroGodMelee 1 | 92 | 42% |
| gh.micro.Gruweltje 0.7 | 65 | 31% |
| DBall.Anarchy 0.1 | 27 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 67% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 235 of 420 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 95 | 40% | 143 |
| gh.micro.Gruweltje 0.7 | 70 | 30% | 107 |
| spinnercat.micro.Tyger 0.1 | 33 | 14% | 89 |
| caimano.Furia_Ceca 0.22 | 11 | 5% | 15 |
| acogdev.alpha 0.2 | 11 | 5% | 14 |
| fire219.CatBot 1.0 | 6 | 3% | 6 |
| el.JumpShoot 0.2 | 5 | 2% | 10 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 9 |
| DBall.Anarchy 0.1 | 1 | 0% | 27 |

## Melee bench: F08

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.7 | 224 / 420 | 3.46 | 16.8% | 62531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 16.8% | 224 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 14.8% | 66 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 65 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 20 |
| germ.TheMind .2 | 5.3 | 9.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.7% | 7 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 11 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 11 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.6 | 20 / 35 | 5201 |
| 2 | 1 | 67.6 | 80.6 | 19 / 35 | 5188 |
| 3 | 1 | 65.3 | 71.7 | 17 / 35 | 5453 |
| 4 | 1 | 64.3 | 70.2 | 18 / 35 | 4961 |
| 5 | 1 | 67.1 | 77.1 | 22 / 35 | 5343 |
| 6 | 1 | 63.4 | 66.7 | 15 / 35 | 5191 |
| 7 | 2 | 63.3 | 66.7 | 17 / 35 | 4759 |
| 8 | 1 | 65.3 | 70.8 | 23 / 35 | 4998 |
| 9 | 1 | 64.6 | 68.6 | 19 / 35 | 5056 |
| 10 | 1 | 64.4 | 70.5 | 18 / 35 | 5403 |
| 11 | 1 | 65.6 | 74.6 | 14 / 35 | 5663 |
| 12 | 1 | 67.5 | 79.0 | 22 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 157 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 75% |
| qualidafial.MajorDick 1.0.1 | 13 | 85% |
| sample.Crazy 1.0 | 13 | 100% |
| germ.TheMind .2 | 12 | 100% |
| awesomeness.Elite 1.0 | 11 | 91% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 7 | 100% |

Hadur died in 196 of 420 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 39% | 195 |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 21% | 76 |
| qualidafial.MajorDick 1.0.1 | 20 | 10% | 22 |
| germ.TheMind .2 | 19 | 10% | 36 |
| awesomeness.Elite 1.0 | 12 | 6% | 25 |
| stelo.UntouchableNano 1.3 | 12 | 6% | 19 |
| lrem.micro.MoggFanatic 0.2 | 10 | 5% | 19 |
| mym.EdgeStalker 1.0 | 5 | 3% | 11 |
| sample.Crazy 1.0 | 0 | 0% | 14 |

## Melee bench: F09

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.3 | 311 / 420 | 2.06 | 19.8% | 58598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.8% | 311 |
| rz.HawkOnFire 0.1 | 2.3 | 13.4% | 31 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.0% | 19 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 24 |
| timmit.nano.TimDog 0.33 | 5.6 | 9.5% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 5 |
| spinnercat.Omen 1.0 | 7.6 | 8.3% | 5 |
| ratosh.Wesco 1.4 | 7.6 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.6% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.3 | 26 / 35 | 5137 |
| 2 | 1 | 71.2 | 92.1 | 27 / 35 | 5085 |
| 3 | 1 | 69.8 | 87.6 | 27 / 35 | 4568 |
| 4 | 1 | 68.9 | 83.8 | 23 / 35 | 4561 |
| 5 | 1 | 71.2 | 93.0 | 28 / 35 | 4971 |
| 6 | 1 | 69.5 | 83.5 | 24 / 35 | 4996 |
| 7 | 1 | 69.5 | 86.7 | 27 / 35 | 4718 |
| 8 | 1 | 70.9 | 90.2 | 26 / 35 | 5061 |
| 9 | 1 | 71.7 | 94.6 | 30 / 35 | 5185 |
| 10 | 1 | 68.6 | 84.4 | 22 / 35 | 4538 |
| 11 | 1 | 71.2 | 91.4 | 29 / 35 | 5004 |
| 12 | 1 | 69.3 | 85.4 | 22 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 122 | 93% |
| nz.jdc.nano.GridFu 1.0 | 90 | 98% |
| stelo.PatternRobot 1.0 | 29 | 93% |
| maribo.IotaCT 1.1 | 26 | 81% |
| timmit.nano.TimDog 0.33 | 24 | 92% |
| ratosh.Wesco 1.4 | 22 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |

Hadur died in 110 of 420 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 30 | 27% | 110 |
| stelo.PatternRobot 1.0 | 16 | 15% | 36 |
| nz.jdc.nano.GridFu 1.0 | 15 | 14% | 110 |
| ratosh.Wesco 1.4 | 14 | 13% | 36 |
| maribo.IotaCT 1.1 | 13 | 12% | 50 |
| timmit.nano.TimDog 0.33 | 11 | 10% | 37 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 7% | 23 |
| spinnercat.Omen 1.0 | 2 | 2% | 14 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.7 | 348 / 420 | 1.75 | 21.4% | 76558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.4% | 348 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 26 |
| baal.nano.N 1.42 | 2.9 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.2% | 7 |
| zyx.micro.Ant 1.1 | 5.0 | 9.5% | 15 |
| sanja.First 0.1 | 6.8 | 8.2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.1 | 8.1% | 4 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.2% | 1 |
| cvt.Firsty 1.0 | 8.1 | 7.1% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 95.6 | 31 / 35 | 6888 |
| 2 | 1 | 70.1 | 87.0 | 26 / 35 | 6054 |
| 3 | 1 | 71.6 | 94.3 | 31 / 35 | 5943 |
| 4 | 1 | 71.3 | 92.1 | 29 / 35 | 6113 |
| 5 | 1 | 71.9 | 91.4 | 28 / 35 | 6792 |
| 6 | 1 | 72.1 | 95.2 | 31 / 35 | 6367 |
| 7 | 1 | 69.2 | 83.8 | 24 / 35 | 6088 |
| 8 | 1 | 72.3 | 94.3 | 32 / 35 | 6556 |
| 9 | 1 | 72.3 | 95.6 | 33 / 35 | 6299 |
| 10 | 1 | 71.5 | 89.5 | 27 / 35 | 6903 |
| 11 | 1 | 70.4 | 90.5 | 26 / 35 | 6056 |
| 12 | 1 | 71.4 | 91.4 | 30 / 35 | 6499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 74 | 99% |
| tvv.nano.Polaris 1.2 | 71 | 94% |
| cvt.Firsty 1.0 | 57 | 93% |
| zyx.micro.Ant 1.1 | 45 | 87% |
| sanja.First 0.1 | 39 | 92% |
| amk.Punbot.Punbot 0.01 | 38 | 100% |
| Grystrion.TrackerWO 1.0 | 30 | 97% |
| squidM.TentalceMeleeNano 1.1 | 10 | 90% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 73 of 420 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 22 | 30% | 79 |
| Grystrion.TrackerWO 1.0 | 13 | 18% | 43 |
| tvv.nano.Polaris 1.2 | 11 | 15% | 108 |
| sample.RamFire 1.0 | 9 | 12% | 11 |
| sanja.First 0.1 | 7 | 10% | 42 |
| cvt.Firsty 1.0 | 6 | 8% | 49 |
| baal.nano.N 1.42 | 3 | 4% | 61 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 11 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 8 |

## Melee bench: F11

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.3 | 151 / 420 | 3.94 | 15.0% | 59190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.7 | 15.0% | 151 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 141 |
| cs.Wren 1.0 | 3.2 | 12.5% | 37 |
| js.PinBall 1.6 | 3.8 | 11.8% | 44 |
| mz.Cork 0.1 | 4.8 | 10.6% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 6 |
| evd.X1 0.01 | 6.9 | 8.3% | 6 |
| jsal.Jsalbot 1.0 | 8.1 | 7.1% | 11 |
| donjezza.Jezza 1.0 | 8.9 | 5.9% | 8 |
| PSW.Relentless 0.1 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.7 | 53.7 | 12 / 35 | 4179 |
| 2 | 1 | 68.6 | 86.0 | 18 / 35 | 5696 |
| 3 | 1 | 63.9 | 72.4 | 12 / 35 | 5278 |
| 4 | 2 | 60.6 | 60.6 | 10 / 35 | 4649 |
| 5 | 2 | 59.8 | 61.0 | 10 / 35 | 4865 |
| 6 | 2 | 61.2 | 65.7 | 7 / 35 | 4974 |
| 7 | 1 | 66.2 | 80.6 | 16 / 35 | 5324 |
| 8 | 1 | 63.9 | 71.7 | 16 / 35 | 4826 |
| 9 | 2 | 60.9 | 63.2 | 12 / 35 | 4733 |
| 10 | 3 | 60.5 | 60.3 | 10 / 35 | 4900 |
| 11 | 2 | 60.1 | 61.6 | 11 / 35 | 4639 |
| 12 | 1 | 63.9 | 70.8 | 17 / 35 | 5127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 120 | 56% |
| cs.Wren 1.0 | 38 | 87% |
| js.PinBall 1.6 | 20 | 80% |
| mz.Cork 0.1 | 13 | 92% |
| joe.ADinosaur 1.0 | 11 | 100% |
| jsal.Jsalbot 1.0 | 8 | 63% |
| donjezza.Jezza 1.0 | 5 | 80% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 271 of 420 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 127 | 47% | 202 |
| joe.ADinosaur 1.0 | 44 | 16% | 49 |
| cs.Wren 1.0 | 24 | 9% | 44 |
| evd.X1 0.01 | 24 | 9% | 31 |
| js.PinBall 1.6 | 19 | 7% | 39 |
| mz.Cork 0.1 | 17 | 6% | 30 |
| PSW.Relentless 0.1 | 10 | 4% | 10 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.0 | 281 / 420 | 2.44 | 19.1% | 59034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.1% | 281 |
| ntc.Opposite 1.5 | 2.8 | 11.5% | 12 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.2% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.0% | 12 |
| stelo.AreaTargetingBot 1.1 | 5.6 | 9.7% | 34 |
| disan.Chair 2.2.0 | 6.9 | 8.7% | 11 |
| DBall.NUKE 0.1 | 7.5 | 8.1% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 14 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.6 | 22 / 35 | 4307 |
| 2 | 1 | 67.7 | 80.3 | 24 / 35 | 5010 |
| 3 | 1 | 68.5 | 86.3 | 20 / 35 | 4751 |
| 4 | 1 | 69.1 | 86.3 | 24 / 35 | 5061 |
| 5 | 1 | 70.1 | 89.5 | 27 / 35 | 4911 |
| 6 | 1 | 69.2 | 88.9 | 24 / 35 | 4796 |
| 7 | 1 | 70.8 | 89.5 | 30 / 35 | 5336 |
| 8 | 1 | 68.9 | 86.0 | 23 / 35 | 4916 |
| 9 | 1 | 67.6 | 80.3 | 21 / 35 | 5389 |
| 10 | 1 | 64.7 | 70.2 | 16 / 35 | 4976 |
| 11 | 1 | 67.1 | 78.4 | 24 / 35 | 4838 |
| 12 | 1 | 69.7 | 92.1 | 26 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 70 | 94% |
| stelo.AreaTargetingBot 1.1 | 63 | 78% |
| ntc.Opposite 1.5 | 43 | 95% |
| disan.Chair 2.2.0 | 37 | 97% |
| DBall.NUKE 0.1 | 30 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 26 | 96% |
| donjezza.Muncho 1.0 | 19 | 84% |
| pfvicm.Sobieski 7.2.3b | 16 | 88% |
| pbg.R2D2 1.0 | 6 | 100% |

Hadur died in 143 of 420 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 39 | 27% | 64 |
| stelo.AreaTargetingBot 1.1 | 32 | 22% | 72 |
| myl.nano.Graviton 1.10 | 25 | 17% | 89 |
| ntc.Opposite 1.5 | 14 | 10% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 8% | 47 |
| disan.Chair 2.2.0 | 9 | 6% | 27 |
| DBall.NUKE 0.1 | 7 | 5% | 37 |
| donjezza.Muncho 1.0 | 4 | 3% | 21 |
| pbg.R2D2 1.0 | 2 | 1% | 13 |

## Melee bench: F13

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.2 | 153 / 420 | 3.77 | 15.1% | 50139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.3 | 15.1% | 153 |
| oog.melee.Capulet 1.2 | 2.4 | 14.1% | 100 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.7% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.4% | 51 |
| yagami.Tidus 0.11 | 5.0 | 11.5% | 24 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 19 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 2 |
| step.nanoPri 1.0 | 7.9 | 7.0% | 2 |
| kurios.DOSexe .9a | 8.9 | 5.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 67.6 | 15 / 35 | 4142 |
| 2 | 1 | 63.2 | 67.0 | 13 / 35 | 4493 |
| 3 | 2 | 61.6 | 64.4 | 11 / 35 | 4105 |
| 4 | 1 | 61.9 | 65.4 | 11 / 35 | 4137 |
| 5 | 1 | 64.6 | 71.1 | 15 / 35 | 4251 |
| 6 | 1 | 62.4 | 68.6 | 12 / 35 | 4054 |
| 7 | 1 | 63.7 | 71.1 | 14 / 35 | 3834 |
| 8 | 1 | 64.0 | 72.7 | 12 / 35 | 4422 |
| 9 | 3 | 60.3 | 61.3 | 11 / 35 | 3876 |
| 10 | 1 | 65.9 | 77.5 | 13 / 35 | 4580 |
| 11 | 1 | 63.1 | 69.5 | 12 / 35 | 4152 |
| 12 | 1 | 65.0 | 74.6 | 14 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 67 | 48% |
| kawigi.micro.Shiz 1.1 | 59 | 98% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 74% |
| yagami.Tidus 0.11 | 23 | 91% |
| ejb.Polaris 1.0.1 | 20 | 65% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 268 of 420 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 116 | 43% | 150 |
| yagami.Tidus 0.11 | 38 | 14% | 56 |
| ejb.Polaris 1.0.1 | 33 | 12% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 9% | 62 |
| stelo.MirrorNano 1.3 | 18 | 7% | 20 |
| kurios.DOSexe .9a | 16 | 6% | 15 |
| kawigi.micro.Shiz 1.1 | 14 | 5% | 52 |
| step.nanoPri 1.0 | 9 | 3% | 10 |

## Melee bench: F14

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.7 | 251 / 420 | 2.92 | 17.3% | 53212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.3% | 251 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 43 |
| wee.Gem 1.8.4 | 3.1 | 12.1% | 55 |
| wompi.Quokka 1.6 | 4.1 | 11.2% | 26 |
| ratosh.Nobo 0.21 | 4.7 | 10.8% | 19 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 14 |
| bayen.UbaMicro 1.4 | 6.7 | 8.7% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 3 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.0 | 23 / 35 | 4073 |
| 2 | 1 | 69.0 | 89.2 | 25 / 35 | 5101 |
| 3 | 1 | 65.0 | 73.7 | 18 / 35 | 4503 |
| 4 | 1 | 66.4 | 80.0 | 22 / 35 | 4417 |
| 5 | 1 | 66.4 | 79.7 | 21 / 35 | 4491 |
| 6 | 1 | 67.0 | 78.7 | 24 / 35 | 4910 |
| 7 | 1 | 66.2 | 77.1 | 20 / 35 | 4627 |
| 8 | 1 | 64.7 | 75.2 | 20 / 35 | 4451 |
| 9 | 1 | 62.3 | 70.2 | 16 / 35 | 3801 |
| 10 | 1 | 66.9 | 81.6 | 19 / 35 | 4479 |
| 11 | 1 | 65.3 | 77.5 | 19 / 35 | 4002 |
| 12 | 1 | 66.8 | 82.2 | 24 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 86 | 86% |
| wee.Gem 1.8.4 | 85 | 89% |
| wompi.Quokka 1.6 | 35 | 86% |
| ratosh.Nobo 0.21 | 33 | 94% |
| m3thos.Eva00 1.1 | 25 | 100% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 67% |

Hadur died in 169 of 420 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 28 | 17% | 99 |
| wompi.Quokka 1.6 | 28 | 17% | 54 |
| maribo.FollowFire 1 | 23 | 14% | 26 |
| wee.Gem 1.8.4 | 20 | 12% | 92 |
| jeremyreeder.Vincent 2011.12.09 | 19 | 11% | 25 |
| ratosh.Nobo 0.21 | 17 | 10% | 44 |
| bayen.UbaMicro 1.4 | 16 | 9% | 32 |
| stelo.MyAgileRobot 0.2 | 11 | 7% | 16 |
| m3thos.Eva00 1.1 | 7 | 4% | 29 |

## Melee bench: F15

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.4 | 126 / 420 | 2.50 | 19.2% | 87576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.7% | 249 |
| hadur117.micro.SaorDC 0.1 | 1.7 | 19.2% | 126 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 28 |
| exauge.GateKeeper 1.1.121g | 4.4 | 9.6% | 5 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 5 |
| stuff.Vlad 0.1 | 5.9 | 8.5% | 3 |
| stelo.PianistNano 1.2 | 7.1 | 7.2% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 2 |
| sample.SittingDuck 1.0 | 9.4 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.6 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.4 | 84.4 | 10 / 35 | 7404 |
| 2 | 1 | 70.7 | 84.4 | 11 / 35 | 7784 |
| 3 | 2 | 68.6 | 79.7 | 10 / 35 | 6671 |
| 4 | 2 | 71.2 | 85.7 | 12 / 35 | 7646 |
| 5 | 2 | 69.8 | 81.9 | 11 / 35 | 6988 |
| 6 | 2 | 68.7 | 78.7 | 6 / 35 | 7072 |
| 7 | 2 | 69.2 | 81.3 | 9 / 35 | 6605 |
| 8 | 2 | 70.0 | 83.5 | 12 / 35 | 7152 |
| 9 | 2 | 70.4 | 82.9 | 9 / 35 | 7383 |
| 10 | 1 | 71.0 | 86.0 | 12 / 35 | 7522 |
| 11 | 1 | 70.3 | 83.8 | 12 / 35 | 7189 |
| 12 | 1 | 72.2 | 87.9 | 12 / 35 | 8160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 226 | 27% |
| mz.NanoGod 2.02 | 31 | 71% |
| exauge.GateKeeper 1.1.121g | 20 | 85% |
| drd.Dreadknoght 0.9 | 11 | 91% |
| ayk.WallHugger 1.0 | 10 | 80% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 295 of 420 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 205 | 69% | 278 |
| mz.NanoGod 2.02 | 40 | 14% | 69 |
| exauge.GateKeeper 1.1.121g | 20 | 7% | 24 |
| ayk.WallHugger 1.0 | 16 | 5% | 21 |
| stelo.PianistNano 1.2 | 7 | 2% | 8 |
| stuff.Vlad 0.1 | 6 | 2% | 9 |
| drd.Dreadknoght 0.9 | 1 | 0% | 10 |

## Melee bench: F16

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.4 | 251 / 420 | 3.03 | 17.5% | 57984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.5% | 251 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 43 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 38 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.1% | 23 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 15 |
| conscience.Electron 1.3g | 6.9 | 8.2% | 5 |
| ap.Frederick 1.1 | 8.6 | 6.6% | 10 |
| dl.BetterWalls 1.0 | 8.6 | 6.6% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 75.9 | 21 / 35 | 4873 |
| 2 | 1 | 66.7 | 79.0 | 21 / 35 | 4906 |
| 3 | 1 | 65.7 | 76.5 | 18 / 35 | 4666 |
| 4 | 1 | 67.7 | 83.8 | 24 / 35 | 4825 |
| 5 | 1 | 65.6 | 75.6 | 20 / 35 | 4521 |
| 6 | 1 | 67.7 | 81.3 | 23 / 35 | 5086 |
| 7 | 1 | 68.8 | 86.7 | 23 / 35 | 5173 |
| 8 | 1 | 65.8 | 77.1 | 21 / 35 | 4586 |
| 9 | 1 | 65.2 | 73.7 | 19 / 35 | 4816 |
| 10 | 1 | 67.5 | 81.0 | 24 / 35 | 5079 |
| 11 | 1 | 64.1 | 70.5 | 20 / 35 | 4703 |
| 12 | 1 | 63.7 | 68.3 | 17 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 87 | 95% |
| dummy.micro.Sparrow 2.5 | 59 | 90% |
| bvh.micro.Freya 0.3 | 45 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 39 | 92% |
| stelo.MirrorMicro 1.0 | 21 | 67% |
| ap.Frederick 1.1 | 17 | 94% |
| conscience.Electron 1.3g | 4 | 75% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 169 of 420 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 31 | 18% | 82 |
| conscience.Electron 1.3g | 28 | 17% | 44 |
| voidious.micro.BlitzBat 1.05 | 23 | 14% | 94 |
| bvh.micro.Freya 0.3 | 21 | 12% | 49 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 12% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 11% | 72 |
| dl.BetterWalls 1.0 | 13 | 8% | 23 |
| stelo.MirrorMicro 1.0 | 12 | 7% | 30 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.5 | 321 / 420 | 2.13 | 21.0% | 79816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.0% | 321 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 41 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 13 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 13 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 11 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 8 |
| tlp.ThreeLeggedPig 1 | 7.6 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 8 |
| sample.MyFirstRobot 1.0 | 9.1 | 5.8% | 5 |
| sample.Corners 1.0 | 9.2 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 80.6 | 19 / 35 | 6099 |
| 2 | 1 | 71.0 | 88.9 | 28 / 35 | 6379 |
| 3 | 1 | 71.3 | 86.3 | 27 / 35 | 6621 |
| 4 | 1 | 71.9 | 90.5 | 26 / 35 | 6915 |
| 5 | 1 | 71.7 | 87.3 | 28 / 35 | 6927 |
| 6 | 1 | 71.2 | 86.0 | 25 / 35 | 7082 |
| 7 | 1 | 71.9 | 90.5 | 28 / 35 | 6929 |
| 8 | 1 | 71.3 | 88.3 | 27 / 35 | 6548 |
| 9 | 1 | 71.9 | 89.2 | 29 / 35 | 6764 |
| 10 | 1 | 72.2 | 90.2 | 29 / 35 | 6811 |
| 11 | 1 | 68.4 | 77.1 | 24 / 35 | 6145 |
| 12 | 1 | 72.5 | 94.6 | 31 / 35 | 6596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 108 | 94% |
| sul.Lunar 1.1 | 87 | 100% |
| supersample.SuperBoxBot 1.0 | 47 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 22 | 86% |
| mme.NikeEnhanced 2.0 | 19 | 100% |
| sample.Corners 1.0 | 19 | 100% |
| dsw.StaticD 1.0 | 18 | 83% |
| sample.MyFirstRobot 1.0 | 14 | 93% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |

Hadur died in 100 of 420 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 26 | 26% | 119 |
| supersample.SuperBoxBot 1.0 | 26 | 26% | 59 |
| dsw.StaticD 1.0 | 16 | 16% | 49 |
| sul.Lunar 1.1 | 6 | 6% | 92 |
| mme.NikeEnhanced 2.0 | 6 | 6% | 30 |
| tlp.ThreeLeggedPig 1 | 6 | 6% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 5% | 20 |
| sample.Corners 1.0 | 4 | 4% | 21 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 19 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.0 | 221 / 420 | 2.89 | 18.0% | 71768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.0% | 221 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 58 |
| mld.Wisdom 1.0 | 3.7 | 12.1% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.5% | 43 |
| amz.NanoClone 1.41 | 5.1 | 10.1% | 16 |
| KiraNL.Chupacabra 0.4 | 5.1 | 10.1% | 13 |
| sample.Walls 1.0 | 7.6 | 7.4% | 11 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 12 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 75.9 | 16 / 35 | 5543 |
| 2 | 1 | 70.7 | 87.3 | 24 / 35 | 6755 |
| 3 | 1 | 65.5 | 74.9 | 14 / 35 | 5937 |
| 4 | 1 | 65.4 | 74.0 | 15 / 35 | 5852 |
| 5 | 1 | 67.5 | 79.0 | 19 / 35 | 6021 |
| 6 | 1 | 66.9 | 78.4 | 17 / 35 | 5900 |
| 7 | 1 | 69.0 | 84.4 | 23 / 35 | 6221 |
| 8 | 1 | 66.0 | 74.9 | 16 / 35 | 5900 |
| 9 | 1 | 70.4 | 87.9 | 26 / 35 | 6581 |
| 10 | 1 | 63.5 | 68.9 | 15 / 35 | 4962 |
| 11 | 1 | 67.3 | 80.6 | 19 / 35 | 5855 |
| 12 | 1 | 68.6 | 81.6 | 17 / 35 | 6241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 86 | 91% |
| radnor.DoctorBob 1.42 | 69 | 77% |
| mld.Wisdom 1.0 | 38 | 61% |
| amz.NanoClone 1.41 | 25 | 76% |
| KiraNL.Chupacabra 0.4 | 15 | 73% |
| jangs.ns51 1.0 | 13 | 92% |
| sample.Walls 1.0 | 12 | 92% |
| GarmBox.Oranges 1.0 | 10 | 90% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 200 of 420 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 67 | 34% | 93 |
| radnor.DoctorBob 1.42 | 34 | 17% | 91 |
| KiraNL.Chupacabra 0.4 | 33 | 17% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 12% | 103 |
| amz.NanoClone 1.41 | 23 | 12% | 36 |
| sample.Walls 1.0 | 7 | 4% | 23 |
| jangs.ns51 1.0 | 7 | 4% | 14 |
| GarmBox.Oranges 1.0 | 5 | 3% | 8 |

