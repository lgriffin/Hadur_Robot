# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 90.7 | 328 / 420 | 1.84 | 22.1% | 89577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 22.1% | 328 |
| radnor.DoctorBob 1.42 | 2.4 | 14.2% | 38 |
| mz.AntiGrav 1.0 | 3.0 | 13.5% | 17 |
| mld.Infinity 2.2 | 3.7 | 12.5% | 22 |
| amz.NanoClone 1.41 | 4.9 | 10.4% | 8 |
| sample.Walls 1.0 | 6.4 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.1 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.6 | 6.0% | 6 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.6 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 83.2 | 26 / 35 | 7226 |
| 2 | 1 | 73.9 | 91.7 | 28 / 35 | 8362 |
| 3 | 1 | 73.0 | 92.7 | 28 / 35 | 7126 |
| 4 | 1 | 72.7 | 90.5 | 28 / 35 | 6944 |
| 5 | 1 | 74.0 | 95.2 | 31 / 35 | 7614 |
| 6 | 1 | 72.6 | 88.6 | 26 / 35 | 7493 |
| 7 | 1 | 73.9 | 95.6 | 29 / 35 | 7738 |
| 8 | 1 | 73.5 | 94.0 | 29 / 35 | 7257 |
| 9 | 1 | 72.2 | 88.6 | 25 / 35 | 7358 |
| 10 | 1 | 72.8 | 90.2 | 27 / 35 | 7539 |
| 11 | 1 | 71.9 | 86.3 | 25 / 35 | 7134 |
| 12 | 1 | 73.5 | 92.1 | 26 / 35 | 7786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 130 | 100% |
| mld.Infinity 2.2 | 99 | 92% |
| radnor.DoctorBob 1.42 | 85 | 87% |
| amz.NanoClone 1.41 | 12 | 92% |
| sample.Walls 1.0 | 8 | 100% |
| sample.Target 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 93 of 420 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 40% | 154 |
| mld.Infinity 2.2 | 18 | 19% | 33 |
| amz.NanoClone 1.41 | 12 | 13% | 32 |
| mz.AntiGrav 1.0 | 10 | 11% | 146 |
| GarmBox.Oranges 1.0 | 6 | 6% | 15 |
| jangs.ns51 1.0 | 6 | 6% | 11 |
| sample.Walls 1.0 | 3 | 3% | 19 |
| arthord.MannyPacquiao Beta | 1 | 1% | 6 |

## Melee bench: F02

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.0 | 281 / 420 | 2.26 | 19.0% | 62172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.2 | 19.0% | 281 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.7% | 86 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 20 |
| maribo.melee.BMV 0.1 | 4.4 | 10.3% | 5 |
| zyx.nano.Ant 1.1 | 5.8 | 8.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.1 | 8.6% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 20 |
| bzdp.BoxCar 2.0 | 8.0 | 6.8% | 0 |
| fullsail.SweetTea 1.1 | 8.4 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.0 | 28 / 35 | 5219 |
| 2 | 1 | 70.5 | 91.7 | 25 / 35 | 5550 |
| 3 | 1 | 71.1 | 98.4 | 31 / 35 | 4991 |
| 4 | 1 | 69.0 | 90.2 | 21 / 35 | 5342 |
| 5 | 2 | 61.1 | 57.1 | 13 / 35 | 4626 |
| 6 | 1 | 68.8 | 90.2 | 23 / 35 | 4893 |
| 7 | 1 | 68.9 | 87.6 | 23 / 35 | 5366 |
| 8 | 1 | 70.5 | 92.1 | 27 / 35 | 5341 |
| 9 | 1 | 70.4 | 92.1 | 27 / 35 | 5332 |
| 10 | 2 | 63.4 | 60.3 | 12 / 35 | 5260 |
| 11 | 1 | 69.0 | 87.0 | 25 / 35 | 5194 |
| 12 | 1 | 69.8 | 91.7 | 26 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 168 | 77% |
| mld.DustBunny 3.8 | 101 | 94% |
| djdjdj.NanoSkunk10 1.0 | 20 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 82% |
| maribo.melee.BMV 0.1 | 12 | 92% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 140 of 420 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 41% | 189 |
| cs.Grudge 1.0 | 19 | 14% | 19 |
| mld.DustBunny 3.8 | 17 | 12% | 99 |
| zyx.nano.Ant 1.1 | 12 | 9% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 7% | 30 |
| djdjdj.NanoSkunk10 1.0 | 9 | 6% | 28 |
| maribo.melee.BMV 0.1 | 7 | 5% | 19 |
| bzdp.BoxCar 2.0 | 5 | 4% | 8 |
| fullsail.SweetTea 1.1 | 4 | 3% | 8 |

## Melee bench: F03

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.0 | 299 / 420 | 2.17 | 20.7% | 73995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.7% | 299 |
| myl.micro.Troodon 1.10 | 2.3 | 13.2% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 11.5% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.7% | 28 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.3% | 19 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 8 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.3% | 6 |
| sample.Tracker 1.0 | 9.4 | 5.0% | 0 |
| sample.Fire 1.0 | 9.6 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.8 | 29 / 35 | 6181 |
| 2 | 1 | 71.3 | 88.9 | 24 / 35 | 6350 |
| 3 | 1 | 71.4 | 92.4 | 25 / 35 | 6030 |
| 4 | 1 | 69.1 | 80.6 | 20 / 35 | 5977 |
| 5 | 1 | 70.2 | 85.4 | 26 / 35 | 6188 |
| 6 | 1 | 71.5 | 90.8 | 27 / 35 | 6002 |
| 7 | 1 | 71.9 | 90.5 | 26 / 35 | 6571 |
| 8 | 1 | 70.2 | 81.3 | 26 / 35 | 6151 |
| 9 | 1 | 71.3 | 88.3 | 27 / 35 | 6333 |
| 10 | 1 | 69.8 | 83.5 | 24 / 35 | 6059 |
| 11 | 1 | 70.5 | 88.3 | 21 / 35 | 6144 |
| 12 | 1 | 69.8 | 84.1 | 24 / 35 | 6009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 92 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 79 | 86% |
| myl.nano.KomoriNinja 1.1 | 47 | 96% |
| cb.nano.Insomnia 1.0 | 46 | 85% |
| sp.Nanos.Ember 1.1 | 28 | 96% |
| fm.mammillarias 1.3 | 16 | 94% |
| sample.Fire 1.0 | 10 | 100% |
| cs.sheldor.Talon 1.1 | 8 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 28 | 23% | 81 |
| cb.nano.Insomnia 1.0 | 24 | 20% | 24 |
| myl.micro.Troodon 1.10 | 21 | 17% | 119 |
| myl.nano.KomoriNinja 1.1 | 15 | 12% | 74 |
| fm.mammillarias 1.3 | 14 | 11% | 34 |
| sp.Nanos.Ember 1.1 | 7 | 6% | 44 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 26 |
| sample.Fire 1.0 | 5 | 4% | 12 |
| sample.Tracker 1.0 | 3 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.1 | 336 / 420 | 1.89 | 21.3% | 78775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 21.3% | 336 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.5% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.1% | 18 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.8% | 7 |
| yk.JahMicro 1.0 | 7.3 | 7.5% | 9 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.4 | 26 / 35 | 5870 |
| 2 | 1 | 72.1 | 92.7 | 30 / 35 | 6834 |
| 3 | 1 | 70.5 | 87.9 | 27 / 35 | 6492 |
| 4 | 1 | 72.7 | 95.6 | 30 / 35 | 6888 |
| 5 | 1 | 72.2 | 94.6 | 27 / 35 | 6819 |
| 6 | 1 | 72.3 | 93.3 | 30 / 35 | 6622 |
| 7 | 1 | 71.6 | 92.1 | 29 / 35 | 6472 |
| 8 | 1 | 69.4 | 82.9 | 24 / 35 | 6316 |
| 9 | 1 | 71.0 | 88.9 | 28 / 35 | 6412 |
| 10 | 1 | 72.1 | 91.1 | 31 / 35 | 6719 |
| 11 | 1 | 71.3 | 87.9 | 26 / 35 | 6915 |
| 12 | 1 | 71.2 | 89.8 | 28 / 35 | 6416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 128 | 96% |
| stelo.SoJNanoMelee 1.1 | 97 | 98% |
| tj.zombie1n 1.0.1 | 41 | 88% |
| tvv.micro.Antares 1.1.1 | 29 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 25 | 88% |
| repositorio.NanoStep 1.0 | 12 | 100% |
| yk.JahMicro 1.0 | 10 | 80% |
| sample.VelociRobot 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |

Hadur died in 84 of 420 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 30% | 170 |
| stelo.SoJNanoMelee 1.1 | 15 | 18% | 54 |
| tvv.micro.Antares 1.1.1 | 12 | 14% | 50 |
| tj.zombie1n 1.0.1 | 12 | 14% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 8% | 23 |
| yk.JahMicro 1.0 | 6 | 7% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 37 |
| sample.VelociRobot 1.0 | 3 | 4% | 23 |
| repositorio.NanoStep 1.0 | 0 | 0% | 21 |

## Melee bench: F05

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.9 | 220 / 420 | 3.35 | 16.8% | 59894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 16.8% | 220 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 59 |
| ahf.NanoAndrew .4 | 3.4 | 11.5% | 44 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 35 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 11 |
| sam.Samspin 1.0 | 5.8 | 9.5% | 24 |
| zyx.nano.BacillusComma 1.0 | 6.6 | 9.2% | 19 |
| robar.nano.Assertive_Melee 0.2 | 7.4 | 8.3% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 66.0 | 14 / 35 | 4700 |
| 2 | 1 | 63.3 | 66.0 | 19 / 35 | 4542 |
| 3 | 1 | 67.3 | 84.1 | 20 / 35 | 5167 |
| 4 | 1 | 64.3 | 72.7 | 18 / 35 | 4984 |
| 5 | 1 | 66.2 | 75.6 | 19 / 35 | 5637 |
| 6 | 1 | 62.5 | 67.0 | 14 / 35 | 4413 |
| 7 | 1 | 64.6 | 70.8 | 17 / 35 | 5093 |
| 8 | 1 | 64.4 | 71.4 | 18 / 35 | 4782 |
| 9 | 1 | 66.1 | 76.2 | 20 / 35 | 5148 |
| 10 | 1 | 65.3 | 77.5 | 19 / 35 | 4875 |
| 11 | 1 | 68.4 | 82.9 | 26 / 35 | 5200 |
| 12 | 1 | 66.1 | 76.8 | 16 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 74 | 95% |
| oog.melee.Corsair 1.0 | 66 | 68% |
| ahf.NanoAndrew .4 | 48 | 90% |
| sam.Samspin 1.0 | 26 | 92% |
| EBBU.Sim2 1.02 | 16 | 100% |
| zyx.nano.BacillusComma 1.0 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sample.TrackFire 1.0 | 4 | 100% |

Hadur died in 201 of 420 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 20% | 94 |
| simonton.nano.MeleeSeed 1.8 | 32 | 16% | 88 |
| bwbaugh.nano.Tirunculus 0.0.0a | 28 | 14% | 32 |
| zyx.nano.BacillusComma 1.0 | 27 | 13% | 36 |
| robar.nano.Assertive_Melee 0.2 | 25 | 12% | 39 |
| ahf.NanoAndrew .4 | 19 | 9% | 67 |
| EBBU.Sim2 1.02 | 13 | 6% | 29 |
| sam.Samspin 1.0 | 10 | 5% | 22 |
| sample.TrackFire 1.0 | 6 | 3% | 11 |

## Melee bench: F06

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.3 | 302 / 420 | 2.23 | 19.4% | 63951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.4% | 302 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 43 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.8% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 10 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 13 |
| fm.claire 1.7 | 6.3 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.5% | 8 |
| pa.Improved 1.0 | 9.3 | 6.2% | 4 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 26 / 35 | 5789 |
| 2 | 1 | 69.1 | 86.0 | 26 / 35 | 5220 |
| 3 | 1 | 69.6 | 90.5 | 26 / 35 | 5203 |
| 4 | 1 | 69.1 | 86.7 | 25 / 35 | 5423 |
| 5 | 1 | 68.7 | 85.7 | 24 / 35 | 5145 |
| 6 | 1 | 69.4 | 85.1 | 24 / 35 | 5925 |
| 7 | 1 | 68.5 | 84.8 | 27 / 35 | 5084 |
| 8 | 1 | 66.7 | 78.7 | 22 / 35 | 4807 |
| 9 | 1 | 69.5 | 88.6 | 25 / 35 | 5445 |
| 10 | 1 | 68.5 | 83.8 | 24 / 35 | 5060 |
| 11 | 1 | 68.5 | 86.3 | 25 / 35 | 5149 |
| 12 | 1 | 70.6 | 92.7 | 28 / 35 | 5701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 122 | 93% |
| oog.melee.CapuletDroid 1.1 | 71 | 90% |
| gh.nano.Grofvuil 0.2 | 38 | 95% |
| arthord.NanoSatanMelee Beta | 32 | 91% |
| winamp32.micro.MicroMacro 1.0 | 21 | 86% |
| fm.claire 1.7 | 16 | 94% |
| sample.SpinBot 1.0 | 15 | 93% |
| kurios.DOSexe .9b | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |

Hadur died in 124 of 420 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 23% | 135 |
| gh.nano.Grofvuil 0.2 | 18 | 15% | 78 |
| arthord.NanoSatanMelee Beta | 18 | 15% | 47 |
| oog.melee.CapuletDroid 1.1 | 16 | 13% | 34 |
| sample.SpinBot 1.0 | 12 | 10% | 25 |
| fm.claire 1.7 | 11 | 9% | 28 |
| winamp32.micro.MicroMacro 1.0 | 8 | 6% | 38 |
| pa.Improved 1.0 | 5 | 4% | 10 |
| kurios.DOSexe .9b | 4 | 3% | 19 |
4 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.3 | 193 / 420 | 2.68 | 18.1% | 67712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.1% | 193 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.2% | 98 |
| mz.MicroGodMelee 1 | 3.3 | 13.8% | 82 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 13.2% | 26 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 10 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.3% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 6 |
| acogdev.alpha 0.2 | 8.4 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.6 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.9 | 16 / 35 | 5655 |
| 2 | 1 | 66.5 | 79.0 | 15 / 35 | 5350 |
| 3 | 1 | 66.9 | 75.9 | 14 / 35 | 5792 |
| 4 | 1 | 67.7 | 80.3 | 14 / 35 | 5772 |
| 5 | 1 | 66.8 | 81.0 | 18 / 35 | 5152 |
| 6 | 1 | 66.4 | 75.9 | 13 / 35 | 5660 |
| 7 | 1 | 67.6 | 83.5 | 13 / 35 | 5624 |
| 8 | 1 | 66.9 | 81.9 | 16 / 35 | 4997 |
| 9 | 1 | 67.0 | 77.5 | 16 / 35 | 5741 |
| 10 | 1 | 69.9 | 90.5 | 23 / 35 | 5874 |
| 11 | 1 | 68.5 | 83.5 | 18 / 35 | 5911 |
| 12 | 1 | 69.2 | 84.4 | 17 / 35 | 6184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 98 | 91% |
| mz.MicroGodMelee 1 | 97 | 46% |
| gh.micro.Gruweltje 0.7 | 70 | 29% |
| DBall.Anarchy 0.1 | 25 | 96% |
| el.JumpShoot 0.2 | 7 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 227 of 420 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 83 | 37% | 139 |
| gh.micro.Gruweltje 0.7 | 75 | 33% | 111 |
| spinnercat.micro.Tyger 0.1 | 35 | 15% | 97 |
| acogdev.alpha 0.2 | 9 | 4% | 12 |
| fire219.CatBot 1.0 | 8 | 4% | 8 |
| DBall.Anarchy 0.1 | 5 | 2% | 25 |
| caimano.Furia_Ceca 0.22 | 5 | 2% | 9 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 12 |
| el.JumpShoot 0.2 | 3 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 74.7 | 237 / 420 | 3.28 | 17.3% | 64251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.2 | 17.3% | 237 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.0% | 77 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.9 | 12.9% | 52 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 17 |
| germ.TheMind .2 | 5.2 | 9.4% | 13 |
| awesomeness.Elite 1.0 | 6.1 | 8.7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.5% | 6 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 70.8 | 19 / 35 | 5335 |
| 2 | 1 | 69.6 | 81.3 | 24 / 35 | 6449 |
| 3 | 1 | 64.9 | 72.4 | 20 / 35 | 5069 |
| 4 | 1 | 66.7 | 77.5 | 19 / 35 | 5554 |
| 5 | 1 | 67.6 | 76.8 | 22 / 35 | 5603 |
| 6 | 2 | 63.9 | 68.9 | 17 / 35 | 5018 |
| 7 | 1 | 67.9 | 81.0 | 21 / 35 | 5420 |
| 8 | 2 | 65.3 | 72.4 | 16 / 35 | 5126 |
| 9 | 1 | 64.9 | 72.1 | 19 / 35 | 4847 |
| 10 | 1 | 65.2 | 74.3 | 19 / 35 | 4795 |
| 11 | 1 | 66.3 | 75.2 | 20 / 35 | 5449 |
| 12 | 1 | 66.4 | 73.3 | 21 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 167 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 83% |
| awesomeness.Elite 1.0 | 15 | 100% |
| qualidafial.MajorDick 1.0.1 | 15 | 93% |
| germ.TheMind .2 | 13 | 100% |
| lrem.micro.MoggFanatic 0.2 | 9 | 89% |
| sample.Crazy 1.0 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 183 of 420 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 90 | 49% | 213 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 16% | 63 |
| awesomeness.Elite 1.0 | 15 | 8% | 32 |
| germ.TheMind .2 | 13 | 7% | 27 |
| stelo.UntouchableNano 1.3 | 13 | 7% | 25 |
| qualidafial.MajorDick 1.0.1 | 12 | 7% | 20 |
| mym.EdgeStalker 1.0 | 5 | 3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 16 |
| sample.Crazy 1.0 | 2 | 1% | 11 |

## Melee bench: F09

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.5 | 325 / 420 | 1.94 | 20.3% | 61444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.3% | 325 |
| rz.HawkOnFire 0.1 | 2.2 | 12.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.0% | 26 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 9.7% | 3 |
| timmit.nano.TimDog 0.33 | 5.4 | 9.7% | 13 |
| ratosh.Wesco 1.4 | 7.4 | 8.3% | 5 |
| stelo.PatternRobot 1.0 | 8.0 | 7.8% | 11 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.2 | 28 / 35 | 5328 |
| 2 | 1 | 69.0 | 82.5 | 24 / 35 | 4985 |
| 3 | 1 | 70.4 | 87.0 | 27 / 35 | 5104 |
| 4 | 1 | 72.0 | 93.7 | 29 / 35 | 5531 |
| 5 | 1 | 68.9 | 84.4 | 23 / 35 | 4712 |
| 6 | 1 | 71.4 | 93.0 | 28 / 35 | 5238 |
| 7 | 1 | 70.3 | 88.9 | 26 / 35 | 4965 |
| 8 | 1 | 69.8 | 86.7 | 25 / 35 | 5102 |
| 9 | 1 | 70.7 | 93.3 | 26 / 35 | 4803 |
| 10 | 1 | 70.1 | 87.6 | 26 / 35 | 4861 |
| 11 | 1 | 71.3 | 90.2 | 29 / 35 | 5193 |
| 12 | 1 | 73.4 | 97.8 | 34 / 35 | 5622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 126 | 96% |
| nz.jdc.nano.GridFu 1.0 | 89 | 98% |
| timmit.nano.TimDog 0.33 | 37 | 89% |
| stelo.PatternRobot 1.0 | 28 | 89% |
| maribo.IotaCT 1.1 | 25 | 96% |
| ratosh.Wesco 1.4 | 13 | 85% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 92% |
| spinnercat.Omen 1.0 | 11 | 100% |

Hadur died in 95 of 420 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 22 | 23% | 61 |
| nz.jdc.nano.GridFu 1.0 | 19 | 20% | 111 |
| rz.HawkOnFire 0.1 | 14 | 15% | 103 |
| ratosh.Wesco 1.4 | 12 | 13% | 36 |
| maribo.IotaCT 1.1 | 10 | 11% | 52 |
| stelo.PatternRobot 1.0 | 9 | 9% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 16 |
| spinnercat.Omen 1.0 | 3 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.9 | 367 / 420 | 1.55 | 22.0% | 79473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 22.0% | 367 |
| baal.nano.N 1.42 | 2.5 | 11.2% | 9 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.6% | 19 |
| Grystrion.TrackerWO 1.0 | 4.1 | 10.0% | 6 |
| zyx.micro.Ant 1.1 | 5.9 | 8.4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6.1 | 8.3% | 0 |
| sanja.First 0.1 | 6.8 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.8% | 2 |
| cvt.Firsty 1.0 | 8.4 | 7.1% | 6 |
| sample.RamFire 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 92.4 | 32 / 35 | 6789 |
| 2 | 1 | 72.5 | 95.2 | 32 / 35 | 6631 |
| 3 | 1 | 71.2 | 89.5 | 29 / 35 | 6623 |
| 4 | 1 | 72.4 | 96.5 | 32 / 35 | 6712 |
| 5 | 1 | 71.4 | 94.6 | 28 / 35 | 6208 |
| 6 | 1 | 72.3 | 94.9 | 30 / 35 | 6784 |
| 7 | 1 | 71.1 | 88.6 | 30 / 35 | 6527 |
| 8 | 1 | 71.8 | 93.3 | 31 / 35 | 6358 |
| 9 | 1 | 73.2 | 98.4 | 33 / 35 | 6714 |
| 10 | 1 | 71.7 | 92.1 | 28 / 35 | 6627 |
| 11 | 1 | 72.2 | 94.9 | 30 / 35 | 6490 |
| 12 | 1 | 73.0 | 96.8 | 32 / 35 | 7010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 75 | 97% |
| cvt.Firsty 1.0 | 67 | 93% |
| tvv.nano.Polaris 1.2 | 57 | 95% |
| amk.Punbot.Punbot 0.01 | 51 | 98% |
| sanja.First 0.1 | 46 | 100% |
| zyx.micro.Ant 1.1 | 40 | 93% |
| Grystrion.TrackerWO 1.0 | 25 | 100% |
| squidM.TentalceMeleeNano 1.1 | 17 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 56 of 420 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 23% | 76 |
| cvt.Firsty 1.0 | 10 | 18% | 54 |
| baal.nano.N 1.42 | 9 | 16% | 70 |
| sanja.First 0.1 | 7 | 13% | 45 |
| tvv.nano.Polaris 1.2 | 6 | 11% | 92 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 13 |
| Grystrion.TrackerWO 1.0 | 2 | 4% | 32 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 24 |
| sample.RamFire 1.0 | 2 | 4% | 7 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.7 | 158 / 420 | 3.73 | 15.4% | 59836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.1% | 145 |
| hadur117.micro.SaorLA 0.1 | 1.5 | 15.4% | 158 |
| cs.Wren 1.0 | 3.1 | 12.7% | 38 |
| mz.Cork 0.1 | 4.6 | 11.1% | 21 |
| js.PinBall 1.6 | 4.8 | 11.0% | 27 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 10 |
| evd.X1 0.01 | 7.0 | 8.1% | 7 |
| jsal.Jsalbot 1.0 | 7.9 | 6.8% | 8 |
| donjezza.Jezza 1.0 | 9.4 | 5.2% | 4 |
| PSW.Relentless 0.1 | 9.5 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 67.3 | 13 / 35 | 5037 |
| 2 | 2 | 64.5 | 73.7 | 14 / 35 | 4863 |
| 3 | 1 | 63.9 | 73.3 | 13 / 35 | 4840 |
| 4 | 1 | 65.0 | 75.2 | 14 / 35 | 5193 |
| 5 | 2 | 60.0 | 59.7 | 12 / 35 | 4488 |
| 6 | 2 | 60.4 | 61.6 | 8 / 35 | 4913 |
| 7 | 1 | 64.4 | 71.1 | 14 / 35 | 5394 |
| 8 | 1 | 63.7 | 69.2 | 14 / 35 | 5201 |
| 9 | 1 | 64.9 | 74.9 | 16 / 35 | 5034 |
| 10 | 2 | 62.1 | 67.6 | 12 / 35 | 4904 |
| 11 | 1 | 65.4 | 74.6 | 18 / 35 | 4996 |
| 12 | 2 | 62.0 | 67.6 | 10 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 137 | 55% |
| cs.Wren 1.0 | 44 | 91% |
| mz.Cork 0.1 | 14 | 79% |
| js.PinBall 1.6 | 11 | 82% |
| jsal.Jsalbot 1.0 | 7 | 100% |
| evd.X1 0.01 | 6 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| PSW.Relentless 0.1 | 1 | 0% |

Hadur died in 262 of 420 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 115 | 44% | 198 |
| cs.Wren 1.0 | 29 | 11% | 51 |
| evd.X1 0.01 | 28 | 11% | 31 |
| js.PinBall 1.6 | 26 | 10% | 40 |
| joe.ADinosaur 1.0 | 23 | 9% | 32 |
| mz.Cork 0.1 | 22 | 8% | 37 |
| PSW.Relentless 0.1 | 14 | 5% | 14 |
| donjezza.Jezza 1.0 | 4 | 2% | 8 |
| jsal.Jsalbot 1.0 | 1 | 0% | 9 |

## Melee bench: F12

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.5 | 292 / 420 | 2.31 | 19.5% | 60225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.5% | 292 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 40 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 10.8% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.5% | 8 |
| ntc.Opposite 1.5 | 4.1 | 10.7% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 3 |
| disan.Chair 2.2.0 | 6.9 | 8.1% | 17 |
| DBall.NUKE 0.1 | 7.6 | 7.8% | 7 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 14 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 24 / 35 | 5312 |
| 2 | 1 | 68.9 | 85.7 | 21 / 35 | 4981 |
| 3 | 1 | 69.6 | 89.2 | 26 / 35 | 4791 |
| 4 | 1 | 70.9 | 93.7 | 27 / 35 | 5292 |
| 5 | 1 | 68.0 | 81.3 | 23 / 35 | 4992 |
| 6 | 1 | 67.0 | 79.4 | 23 / 35 | 4882 |
| 7 | 1 | 67.9 | 83.8 | 21 / 35 | 4753 |
| 8 | 1 | 67.7 | 81.0 | 24 / 35 | 4609 |
| 9 | 1 | 67.6 | 80.0 | 23 / 35 | 5141 |
| 10 | 1 | 68.3 | 81.3 | 22 / 35 | 5341 |
| 11 | 1 | 71.9 | 97.8 | 33 / 35 | 4970 |
| 12 | 1 | 69.4 | 86.7 | 25 / 35 | 5161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 78 | 86% |
| stelo.AreaTargetingBot 1.1 | 76 | 91% |
| ntc.Opposite 1.5 | 35 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 34 | 100% |
| disan.Chair 2.2.0 | 33 | 79% |
| donjezza.Muncho 1.0 | 27 | 85% |
| DBall.NUKE 0.1 | 24 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| pbg.R2D2 1.0 | 6 | 100% |

Hadur died in 130 of 420 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 27 | 21% | 52 |
| myl.nano.Graviton 1.10 | 25 | 19% | 90 |
| stelo.AreaTargetingBot 1.1 | 20 | 15% | 77 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 12% | 50 |
| ntc.Opposite 1.5 | 13 | 10% | 35 |
| disan.Chair 2.2.0 | 13 | 10% | 26 |
| pbg.R2D2 1.0 | 7 | 5% | 25 |
| DBall.NUKE 0.1 | 5 | 4% | 34 |
| donjezza.Muncho 1.0 | 5 | 4% | 26 |

## Melee bench: F13

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.4 | 176 / 420 | 3.67 | 15.5% | 51934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.2 | 15.5% | 176 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 79 |
| oog.melee.Capulet 1.2 | 2.7 | 13.5% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.7% | 40 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 20 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 17 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 3 |
| kurios.DOSexe .9a | 8.9 | 5.3% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.6 | 16 / 35 | 4330 |
| 2 | 1 | 65.1 | 74.9 | 16 / 35 | 4131 |
| 3 | 1 | 65.0 | 74.0 | 15 / 35 | 4373 |
| 4 | 1 | 65.6 | 76.2 | 14 / 35 | 4361 |
| 5 | 1 | 65.8 | 73.7 | 15 / 35 | 4674 |
| 6 | 1 | 62.8 | 65.4 | 16 / 35 | 4143 |
| 7 | 1 | 63.5 | 67.6 | 16 / 35 | 4386 |
| 8 | 3 | 61.3 | 62.9 | 8 / 35 | 4081 |
| 9 | 1 | 62.7 | 68.6 | 15 / 35 | 3954 |
| 10 | 1 | 62.8 | 64.8 | 15 / 35 | 4280 |
| 11 | 1 | 65.8 | 76.2 | 13 / 35 | 4969 |
| 12 | 1 | 64.8 | 71.7 | 17 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 66 | 64% |
| kawigi.micro.Shiz 1.1 | 59 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 84% |
| yagami.Tidus 0.11 | 26 | 92% |
| ejb.Polaris 1.0.1 | 14 | 79% |
| stelo.MirrorNano 1.3 | 3 | 100% |

Hadur died in 244 of 420 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 91 | 37% | 140 |
| yagami.Tidus 0.11 | 35 | 14% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 14% | 76 |
| kawigi.micro.Shiz 1.1 | 22 | 9% | 58 |
| ejb.Polaris 1.0.1 | 21 | 9% | 45 |
| step.nanoPri 1.0 | 15 | 6% | 17 |
| kurios.DOSexe .9a | 15 | 6% | 17 |
| stelo.MirrorNano 1.3 | 11 | 5% | 11 |

## Melee bench: F14

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.8 | 272 / 420 | 2.72 | 17.9% | 55567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.9% | 272 |
| wee.Gem 1.8.4 | 2.9 | 12.0% | 43 |
| bzdp.Pansy 2.1 | 3.3 | 11.8% | 38 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 33 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 13 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 13 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.6 | 22 / 35 | 4297 |
| 2 | 1 | 65.4 | 77.8 | 20 / 35 | 4529 |
| 3 | 1 | 67.9 | 84.8 | 23 / 35 | 4705 |
| 4 | 1 | 69.6 | 91.1 | 26 / 35 | 5115 |
| 5 | 1 | 67.6 | 84.1 | 25 / 35 | 4729 |
| 6 | 1 | 65.2 | 74.6 | 20 / 35 | 4541 |
| 7 | 1 | 66.0 | 76.2 | 20 / 35 | 4703 |
| 8 | 1 | 69.2 | 86.3 | 28 / 35 | 5061 |
| 9 | 1 | 66.2 | 79.7 | 20 / 35 | 4376 |
| 10 | 1 | 67.4 | 82.2 | 25 / 35 | 4556 |
| 11 | 1 | 67.2 | 81.0 | 24 / 35 | 4661 |
| 12 | 1 | 63.6 | 70.8 | 19 / 35 | 4294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 91 | 88% |
| wee.Gem 1.8.4 | 77 | 91% |
| wompi.Quokka 1.6 | 39 | 95% |
| ratosh.Nobo 0.21 | 34 | 94% |
| m3thos.Eva00 1.1 | 28 | 93% |
| bayen.UbaMicro 1.4 | 16 | 94% |
| stelo.MyAgileRobot 0.2 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |

Hadur died in 150 of 420 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 25 | 17% | 59 |
| bzdp.Pansy 2.1 | 21 | 14% | 107 |
| wee.Gem 1.8.4 | 18 | 12% | 86 |
| ratosh.Nobo 0.21 | 18 | 12% | 42 |
| bayen.UbaMicro 1.4 | 17 | 11% | 32 |
| maribo.FollowFire 1 | 15 | 10% | 18 |
| stelo.MyAgileRobot 0.2 | 14 | 9% | 20 |
| m3thos.Eva00 1.1 | 11 | 7% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 7% | 18 |

## Melee bench: F15

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.2 | 137 / 420 | 2.43 | 19.5% | 89106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.5 | 19.5% | 137 |
| wompi.Wallaby 5.1 | 1.5 | 19.7% | 242 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 31 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.1% | 2 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 5 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 7.9 | 5.9% | 2 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 84.8 | 12 / 35 | 7735 |
| 2 | 2 | 70.3 | 85.1 | 11 / 35 | 7164 |
| 3 | 2 | 70.8 | 84.8 | 13 / 35 | 7286 |
| 4 | 2 | 70.8 | 84.8 | 9 / 35 | 7311 |
| 5 | 1 | 72.2 | 87.3 | 13 / 35 | 8408 |
| 6 | 1 | 70.4 | 85.7 | 14 / 35 | 6956 |
| 7 | 1 | 71.8 | 88.3 | 17 / 35 | 7589 |
| 8 | 2 | 68.6 | 78.7 | 5 / 35 | 7191 |
| 9 | 2 | 69.9 | 80.6 | 9 / 35 | 7176 |
| 10 | 2 | 70.5 | 81.0 | 9 / 35 | 7754 |
| 11 | 1 | 70.6 | 83.8 | 13 / 35 | 6943 |
| 12 | 1 | 70.7 | 85.1 | 12 / 35 | 7593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 221 | 30% |
| mz.NanoGod 2.02 | 27 | 63% |
| exauge.GateKeeper 1.1.121g | 19 | 95% |
| ayk.WallHugger 1.0 | 13 | 100% |
| drd.Dreadknoght 0.9 | 11 | 91% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |

Hadur died in 284 of 420 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 206 | 73% | 280 |
| mz.NanoGod 2.02 | 43 | 15% | 74 |
| ayk.WallHugger 1.0 | 14 | 5% | 29 |
| exauge.GateKeeper 1.1.121g | 10 | 4% | 16 |
| stelo.PianistNano 1.2 | 9 | 3% | 11 |
| drd.Dreadknoght 0.9 | 1 | 0% | 6 |
| stuff.Vlad 0.1 | 1 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.1 | 227 / 420 | 3.60 | 16.6% | 57645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 16.6% | 227 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.8% | 40 |
| bvh.micro.Freya 0.3 | 3.7 | 11.6% | 31 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.5% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 35 |
| stelo.MirrorMicro 1.0 | 6.1 | 9.5% | 15 |
| conscience.Electron 1.3g | 7.3 | 8.0% | 5 |
| dl.BetterWalls 1.0 | 8.3 | 6.7% | 13 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 61.6 | 15 / 35 | 4287 |
| 2 | 1 | 62.2 | 61.9 | 15 / 35 | 4733 |
| 3 | 1 | 62.6 | 64.4 | 17 / 35 | 4616 |
| 4 | 1 | 66.3 | 75.6 | 22 / 35 | 4942 |
| 5 | 1 | 65.0 | 71.1 | 20 / 35 | 5064 |
| 6 | 1 | 68.6 | 83.8 | 24 / 35 | 5210 |
| 7 | 1 | 67.1 | 79.4 | 22 / 35 | 4912 |
| 8 | 1 | 62.2 | 65.4 | 17 / 35 | 4344 |
| 9 | 1 | 68.9 | 87.9 | 22 / 35 | 5349 |
| 10 | 1 | 64.4 | 67.9 | 18 / 35 | 5142 |
| 11 | 1 | 63.8 | 70.8 | 19 / 35 | 4184 |
| 12 | 1 | 63.3 | 63.5 | 16 / 35 | 4862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 78 | 95% |
| dummy.micro.Sparrow 2.5 | 58 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 51 | 86% |
| bvh.micro.Freya 0.3 | 37 | 97% |
| stelo.MirrorMicro 1.0 | 11 | 64% |
| ap.Frederick 1.1 | 7 | 86% |
| dl.BetterWalls 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 193 of 420 rounds, at a mean tick of 382. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 36 | 19% | 45 |
| mn.nano.perceptual.Impact 1.3.0 | 34 | 18% | 34 |
| dummy.micro.Sparrow 2.5 | 26 | 13% | 69 |
| voidious.micro.BlitzBat 1.05 | 24 | 12% | 94 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 11% | 79 |
| bvh.micro.Freya 0.3 | 19 | 10% | 41 |
| dl.BetterWalls 1.0 | 19 | 10% | 34 |
| stelo.MirrorMicro 1.0 | 12 | 6% | 24 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 88.6 | 323 / 420 | 2.03 | 21.6% | 86207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 21.6% | 323 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 27 |
| sul.Lunar 1.1 | 3.3 | 11.2% | 21 |
| supersample.SuperBoxBot 1.0 | 4.4 | 10.3% | 16 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 3 |
| dsw.StaticD 1.0 | 5.4 | 8.9% | 17 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 7 |
| sample.Corners 1.0 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 92.1 | 28 / 35 | 6769 |
| 2 | 1 | 72.0 | 87.0 | 27 / 35 | 7724 |
| 3 | 1 | 71.4 | 88.3 | 26 / 35 | 6714 |
| 4 | 1 | 72.1 | 87.9 | 27 / 35 | 7623 |
| 5 | 1 | 72.8 | 94.3 | 29 / 35 | 7098 |
| 6 | 1 | 70.7 | 84.1 | 24 / 35 | 6889 |
| 7 | 1 | 72.2 | 89.5 | 27 / 35 | 7190 |
| 8 | 1 | 72.4 | 89.2 | 27 / 35 | 7740 |
| 9 | 1 | 70.4 | 83.5 | 25 / 35 | 6543 |
| 10 | 1 | 70.1 | 82.9 | 26 / 35 | 6822 |
| 11 | 1 | 72.9 | 91.1 | 29 / 35 | 7319 |
| 12 | 1 | 72.8 | 93.0 | 28 / 35 | 7776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 92 | 96% |
| sul.Lunar 1.1 | 82 | 99% |
| supersample.SuperBoxBot 1.0 | 56 | 93% |
| dsw.StaticD 1.0 | 40 | 83% |
| mme.NikeEnhanced 2.0 | 24 | 96% |
| sample.MyFirstRobot 1.0 | 19 | 89% |
| sample.Corners 1.0 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |

Hadur died in 100 of 420 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 27 | 27% | 119 |
| supersample.SuperBoxBot 1.0 | 25 | 25% | 68 |
| dsw.StaticD 1.0 | 20 | 20% | 56 |
| mme.NikeEnhanced 2.0 | 10 | 10% | 27 |
| sul.Lunar 1.1 | 7 | 7% | 86 |
| sample.MyFirstRobot 1.0 | 7 | 7% | 24 |
| sample.Corners 1.0 | 2 | 2% | 13 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 14 |

## Melee bench: F18

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 83.3 | 265 / 420 | 2.50 | 19.6% | 80093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.6% | 265 |
| radnor.DoctorBob 1.42 | 2.6 | 12.9% | 48 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 10.9% | 35 |
| KiraNL.Chupacabra 0.4 | 4.6 | 10.4% | 13 |
| amz.NanoClone 1.41 | 5.4 | 9.7% | 14 |
| sample.Walls 1.0 | 7.0 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 7.9 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.9 | 6.0% | 6 |
| sample.Target 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 21 / 35 | 6480 |
| 2 | 1 | 70.3 | 89.2 | 24 / 35 | 6587 |
| 3 | 1 | 69.6 | 85.7 | 23 / 35 | 6469 |
| 4 | 1 | 72.5 | 94.0 | 28 / 35 | 6996 |
| 5 | 1 | 69.1 | 81.0 | 20 / 35 | 6974 |
| 6 | 1 | 66.3 | 74.0 | 18 / 35 | 6113 |
| 7 | 1 | 68.4 | 80.0 | 21 / 35 | 6633 |
| 8 | 1 | 65.7 | 70.5 | 17 / 35 | 6484 |
| 9 | 1 | 69.7 | 84.4 | 23 / 35 | 6539 |
| 10 | 1 | 70.5 | 88.6 | 24 / 35 | 6571 |
| 11 | 1 | 68.2 | 77.8 | 19 / 35 | 6866 |
| 12 | 1 | 72.2 | 91.4 | 27 / 35 | 7381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 93 | 94% |
| radnor.DoctorBob 1.42 | 74 | 86% |
| mld.Wisdom 1.0 | 36 | 89% |
| KiraNL.Chupacabra 0.4 | 27 | 85% |
| sample.Walls 1.0 | 22 | 100% |
| amz.NanoClone 1.41 | 17 | 82% |
| GarmBox.Oranges 1.0 | 11 | 100% |
| jangs.ns51 1.0 | 9 | 89% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 156 of 420 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 46 | 29% | 89 |
| radnor.DoctorBob 1.42 | 35 | 22% | 101 |
| KiraNL.Chupacabra 0.4 | 29 | 19% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 14% | 111 |
| amz.NanoClone 1.41 | 11 | 7% | 26 |
| sample.Walls 1.0 | 5 | 3% | 21 |
| jangs.ns51 1.0 | 5 | 3% | 8 |
| GarmBox.Oranges 1.0 | 3 | 2% | 5 |

