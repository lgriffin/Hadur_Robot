# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.0 | 291 / 420 | 2.08 | 21.5% | 89311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 21.5% | 291 |
| radnor.DoctorBob 1.42 | 2.6 | 14.1% | 54 |
| mz.AntiGrav 1.0 | 3.0 | 13.6% | 24 |
| mld.Infinity 2.2 | 3.4 | 13.3% | 43 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| sample.Walls 1.0 | 6.8 | 6.6% | 1 |
| GarmBox.Oranges 1.0 | 7.1 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 85.7 | 24 / 35 | 7463 |
| 2 | 1 | 72.4 | 88.6 | 23 / 35 | 7239 |
| 3 | 1 | 70.5 | 82.5 | 24 / 35 | 6768 |
| 4 | 1 | 72.2 | 90.5 | 23 / 35 | 7163 |
| 5 | 1 | 73.8 | 90.2 | 22 / 35 | 8850 |
| 6 | 1 | 73.1 | 91.7 | 26 / 35 | 7517 |
| 7 | 1 | 71.1 | 81.3 | 22 / 35 | 7454 |
| 8 | 1 | 70.7 | 81.3 | 23 / 35 | 6910 |
| 9 | 1 | 74.1 | 95.6 | 29 / 35 | 7517 |
| 10 | 1 | 74.1 | 94.0 | 27 / 35 | 7839 |
| 11 | 1 | 70.3 | 82.2 | 22 / 35 | 6745 |
| 12 | 1 | 73.9 | 92.1 | 26 / 35 | 7846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 107 | 99% |
| mld.Infinity 2.2 | 105 | 86% |
| radnor.DoctorBob 1.42 | 77 | 79% |
| amz.NanoClone 1.41 | 12 | 100% |
| jangs.ns51 1.0 | 9 | 89% |
| arthord.MannyPacquiao Beta | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 130 of 420 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 51 | 39% | 170 |
| mz.AntiGrav 1.0 | 23 | 18% | 128 |
| mld.Infinity 2.2 | 20 | 15% | 28 |
| amz.NanoClone 1.41 | 14 | 11% | 31 |
| GarmBox.Oranges 1.0 | 9 | 7% | 15 |
| sample.Walls 1.0 | 6 | 5% | 19 |
| jangs.ns51 1.0 | 6 | 5% | 13 |
| arthord.MannyPacquiao Beta | 1 | 1% | 8 |

## Melee bench: F02

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.2 | 231 / 420 | 3.05 | 17.5% | 61829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.6 | 17.5% | 231 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.0% | 121 |
| mld.DustBunny 3.8 | 2.8 | 13.2% | 25 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.3% | 13 |
| zyx.nano.Ant 1.1 | 6.1 | 8.9% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 7.1% | 13 |
| bzdp.BoxCar 2.0 | 8.2 | 7.1% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.9% | 6 |
| cs.Grudge 1.0 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.3 | 26 / 35 | 5231 |
| 2 | 1 | 68.4 | 84.1 | 23 / 35 | 5221 |
| 3 | 1 | 69.2 | 88.6 | 24 / 35 | 5197 |
| 4 | 1 | 69.4 | 90.5 | 22 / 35 | 5277 |
| 5 | 1 | 71.6 | 96.5 | 28 / 35 | 5953 |
| 6 | 2 | 62.4 | 60.0 | 9 / 35 | 5206 |
| 7 | 3 | 56.8 | 47.0 | 9 / 35 | 4195 |
| 8 | 1 | 70.3 | 91.4 | 28 / 35 | 5624 |
| 9 | 1 | 68.6 | 86.0 | 22 / 35 | 5079 |
| 10 | 1 | 69.3 | 88.3 | 23 / 35 | 5293 |
| 11 | 3 | 58.5 | 49.5 | 8 / 35 | 4816 |
| 12 | 3 | 58.8 | 50.5 | 9 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 135 | 71% |
| mld.DustBunny 3.8 | 84 | 94% |
| djdjdj.NanoSkunk10 1.0 | 19 | 89% |
| maribo.melee.BMV 0.1 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| fullsail.SweetTea 1.1 | 9 | 78% |
| zyx.nano.Ant 1.1 | 8 | 88% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 192 of 420 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 29% | 150 |
| cs.Grudge 1.0 | 32 | 17% | 30 |
| mld.DustBunny 3.8 | 28 | 15% | 85 |
| zyx.nano.Ant 1.1 | 26 | 14% | 39 |
| djdjdj.NanoSkunk10 1.0 | 14 | 7% | 36 |
| maribo.melee.BMV 0.1 | 14 | 7% | 27 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 5% | 21 |
| fullsail.SweetTea 1.1 | 8 | 4% | 21 |
| bzdp.BoxCar 2.0 | 4 | 2% | 10 |

## Melee bench: F03

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.1 | 297 / 420 | 2.16 | 20.9% | 77582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 20.9% | 297 |
| myl.micro.Troodon 1.10 | 2.3 | 13.6% | 51 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.4% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 20 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.5% | 25 |
| fm.mammillarias 1.3 | 5.6 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 7 |
| sample.Fire 1.0 | 9.4 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 82.9 | 23 / 35 | 6571 |
| 2 | 1 | 70.2 | 84.4 | 23 / 35 | 6363 |
| 3 | 1 | 70.9 | 86.0 | 22 / 35 | 6542 |
| 4 | 1 | 70.7 | 86.7 | 24 / 35 | 6269 |
| 5 | 1 | 69.8 | 82.9 | 23 / 35 | 6169 |
| 6 | 1 | 71.1 | 87.3 | 25 / 35 | 6162 |
| 7 | 1 | 71.9 | 88.6 | 26 / 35 | 6843 |
| 8 | 1 | 71.8 | 90.8 | 25 / 35 | 6515 |
| 9 | 1 | 72.0 | 92.1 | 29 / 35 | 6310 |
| 10 | 1 | 70.7 | 83.5 | 24 / 35 | 6617 |
| 11 | 1 | 71.5 | 88.3 | 26 / 35 | 6584 |
| 12 | 1 | 72.0 | 91.4 | 27 / 35 | 6637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 97 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 78 | 94% |
| cb.nano.Insomnia 1.0 | 53 | 74% |
| myl.nano.KomoriNinja 1.1 | 49 | 82% |
| sp.Nanos.Ember 1.1 | 29 | 93% |
| fm.mammillarias 1.3 | 11 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 123 of 420 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 32 | 26% | 29 |
| myl.nano.KomoriNinja 1.1 | 26 | 21% | 86 |
| myl.micro.Troodon 1.10 | 17 | 14% | 117 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 14% | 69 |
| fm.mammillarias 1.3 | 14 | 11% | 34 |
| cs.sheldor.Talon 1.1 | 7 | 6% | 28 |
| sample.Fire 1.0 | 5 | 4% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 37 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.7 | 296 / 420 | 2.11 | 21.0% | 82508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 21.0% | 296 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.2% | 27 |
| kawigi.nano.Lib 1.0 | 2.6 | 12.2% | 23 |
| tj.zombie1n 1.0.1 | 5.0 | 9.4% | 19 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.1% | 12 |
| yk.JahMicro 1.0 | 7.3 | 7.6% | 2 |
| repositorio.NanoStep 1.0 | 9.2 | 6.2% | 5 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.0 | 25 / 35 | 7023 |
| 2 | 1 | 70.7 | 89.5 | 23 / 35 | 6452 |
| 3 | 1 | 70.4 | 82.5 | 24 / 35 | 6872 |
| 4 | 1 | 71.2 | 87.3 | 27 / 35 | 7030 |
| 5 | 1 | 72.0 | 91.1 | 26 / 35 | 7194 |
| 6 | 1 | 70.5 | 87.9 | 25 / 35 | 6403 |
| 7 | 1 | 69.4 | 82.9 | 22 / 35 | 6478 |
| 8 | 1 | 72.2 | 93.3 | 24 / 35 | 7267 |
| 9 | 1 | 68.1 | 77.1 | 19 / 35 | 6658 |
| 10 | 1 | 72.2 | 94.0 | 28 / 35 | 6776 |
| 11 | 1 | 71.1 | 87.3 | 25 / 35 | 6906 |
| 12 | 1 | 72.5 | 92.1 | 28 / 35 | 7449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 105 | 93% |
| stelo.SoJNanoMelee 1.1 | 81 | 89% |
| tvv.micro.Antares 1.1.1 | 44 | 91% |
| tj.zombie1n 1.0.1 | 42 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 30 | 83% |
| yk.JahMicro 1.0 | 11 | 91% |
| sample.VelociRobot 1.0 | 10 | 90% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 88% |
| repositorio.NanoStep 1.0 | 5 | 100% |

Hadur died in 124 of 420 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 28% | 153 |
| tvv.micro.Antares 1.1.1 | 22 | 18% | 63 |
| stelo.SoJNanoMelee 1.1 | 20 | 16% | 51 |
| tj.zombie1n 1.0.1 | 17 | 14% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 9% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 8% | 47 |
| yk.JahMicro 1.0 | 7 | 6% | 14 |
| repositorio.NanoStep 1.0 | 1 | 1% | 19 |
| sample.VelociRobot 1.0 | 1 | 1% | 16 |

## Melee bench: F05

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 68.6 | 187 / 420 | 3.82 | 15.8% | 59899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.1 | 15.8% | 187 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 72 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 53 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.1% | 35 |
| EBBU.Sim2 1.02 | 5.2 | 10.3% | 18 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 22 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.3% | 19 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.6% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 62.2 | 14 / 35 | 4517 |
| 2 | 1 | 67.8 | 80.3 | 22 / 35 | 5464 |
| 3 | 1 | 64.3 | 72.1 | 16 / 35 | 5144 |
| 4 | 2 | 60.4 | 62.2 | 9 / 35 | 4439 |
| 5 | 1 | 61.9 | 65.7 | 15 / 35 | 4775 |
| 6 | 1 | 62.9 | 66.3 | 17 / 35 | 5025 |
| 7 | 1 | 65.3 | 74.9 | 18 / 35 | 5107 |
| 8 | 1 | 63.5 | 69.2 | 15 / 35 | 5064 |
| 9 | 1 | 64.0 | 68.9 | 14 / 35 | 5376 |
| 10 | 1 | 60.9 | 60.3 | 15 / 35 | 4893 |
| 11 | 1 | 65.6 | 74.9 | 17 / 35 | 5309 |
| 12 | 1 | 62.9 | 66.3 | 15 / 35 | 4786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 72 | 92% |
| oog.melee.Corsair 1.0 | 67 | 61% |
| ahf.NanoAndrew .4 | 37 | 76% |
| EBBU.Sim2 1.02 | 19 | 100% |
| sam.Samspin 1.0 | 12 | 100% |
| zyx.nano.BacillusComma 1.0 | 11 | 91% |
| sample.TrackFire 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |

Hadur died in 237 of 420 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 47 | 20% | 96 |
| oog.melee.Corsair 1.0 | 37 | 16% | 80 |
| robar.nano.Assertive_Melee 0.2 | 34 | 14% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 29 | 12% | 28 |
| EBBU.Sim2 1.02 | 25 | 11% | 39 |
| ahf.NanoAndrew .4 | 21 | 9% | 61 |
| zyx.nano.BacillusComma 1.0 | 21 | 9% | 32 |
| sam.Samspin 1.0 | 16 | 7% | 29 |
| sample.TrackFire 1.0 | 6 | 3% | 13 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 280 / 420 | 2.34 | 19.3% | 65385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 19.3% | 280 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.1% | 43 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 27 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.3% | 41 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.2% | 10 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.6% | 12 |
| fm.claire 1.7 | 6.3 | 8.5% | 2 |
| sample.SpinBot 1.0 | 8.3 | 7.0% | 5 |
| pa.Improved 1.0 | 9.0 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.3 | 20 / 35 | 5641 |
| 2 | 1 | 69.3 | 85.7 | 26 / 35 | 5456 |
| 3 | 1 | 69.9 | 88.6 | 24 / 35 | 5758 |
| 4 | 1 | 69.2 | 84.1 | 26 / 35 | 5447 |
| 5 | 1 | 69.0 | 87.6 | 19 / 35 | 5467 |
| 6 | 1 | 69.8 | 89.2 | 26 / 35 | 5644 |
| 7 | 1 | 66.9 | 77.5 | 19 / 35 | 5428 |
| 8 | 1 | 69.4 | 87.9 | 25 / 35 | 5392 |
| 9 | 1 | 67.5 | 80.6 | 22 / 35 | 5152 |
| 10 | 1 | 65.6 | 74.0 | 20 / 35 | 4847 |
| 11 | 1 | 69.9 | 90.2 | 25 / 35 | 5623 |
| 12 | 1 | 71.2 | 95.2 | 28 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 126 | 94% |
| oog.melee.CapuletDroid 1.1 | 66 | 83% |
| gh.nano.Grofvuil 0.2 | 35 | 91% |
| arthord.NanoSatanMelee Beta | 26 | 77% |
| sample.SpinBot 1.0 | 18 | 94% |
| winamp32.micro.MicroMacro 1.0 | 17 | 88% |
| kurios.DOSexe .9b | 10 | 70% |
| fm.claire 1.7 | 9 | 100% |
| pa.Improved 1.0 | 7 | 100% |

Hadur died in 148 of 420 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 23% | 148 |
| gh.nano.Grofvuil 0.2 | 27 | 18% | 81 |
| arthord.NanoSatanMelee Beta | 26 | 18% | 45 |
| oog.melee.CapuletDroid 1.1 | 23 | 16% | 28 |
| winamp32.micro.MicroMacro 1.0 | 8 | 5% | 34 |
| sample.SpinBot 1.0 | 8 | 5% | 28 |
| fm.claire 1.7 | 8 | 5% | 19 |
| kurios.DOSexe .9b | 5 | 3% | 21 |
| pa.Improved 1.0 | 5 | 3% | 14 |
4 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.6 | 190 / 420 | 2.56 | 18.4% | 69808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.4% | 190 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.3% | 87 |
| mz.MicroGodMelee 1 | 3.4 | 13.3% | 83 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.1% | 41 |
| DBall.Anarchy 0.1 | 5.0 | 8.8% | 13 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.2% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 2 |
| el.JumpShoot 0.2 | 8.5 | 5.9% | 2 |
| fire219.CatBot 1.0 | 8.6 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.4 | 18 / 35 | 5840 |
| 2 | 1 | 68.1 | 84.4 | 17 / 35 | 5514 |
| 3 | 1 | 65.9 | 75.2 | 13 / 35 | 5525 |
| 4 | 1 | 67.9 | 82.2 | 15 / 35 | 5947 |
| 5 | 1 | 69.2 | 84.1 | 18 / 35 | 6011 |
| 6 | 1 | 68.3 | 82.2 | 19 / 35 | 5949 |
| 7 | 1 | 68.3 | 83.2 | 18 / 35 | 5734 |
| 8 | 1 | 68.3 | 81.6 | 15 / 35 | 5998 |
| 9 | 1 | 67.0 | 81.0 | 12 / 35 | 5592 |
| 10 | 1 | 69.8 | 91.7 | 19 / 35 | 5966 |
| 11 | 1 | 67.2 | 79.4 | 12 / 35 | 5794 |
| 12 | 1 | 67.8 | 81.0 | 14 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 106 | 87% |
| mz.MicroGodMelee 1 | 91 | 42% |
| gh.micro.Gruweltje 0.7 | 68 | 28% |
| DBall.Anarchy 0.1 | 17 | 94% |
| mbro.Detektor3 0.1.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 231 of 420 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 82 | 35% | 140 |
| gh.micro.Gruweltje 0.7 | 76 | 33% | 115 |
| spinnercat.micro.Tyger 0.1 | 31 | 13% | 91 |
| acogdev.alpha 0.2 | 10 | 4% | 11 |
| DBall.Anarchy 0.1 | 8 | 3% | 20 |
| caimano.Furia_Ceca 0.22 | 7 | 3% | 13 |
| fire219.CatBot 1.0 | 7 | 3% | 7 |
| el.JumpShoot 0.2 | 5 | 2% | 8 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 13 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.3 | 210 / 420 | 3.58 | 16.7% | 65201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.3 | 16.7% | 210 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.9 | 13.3% | 57 |
| germ.TheMind .2 | 4.7 | 9.5% | 14 |
| qualidafial.MajorDick 1.0.1 | 4.9 | 9.2% | 13 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7.1 | 8.0% | 4 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.9% | 10 |
| sample.Crazy 1.0 | 8.4 | 7.2% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 71.1 | 19 / 35 | 5321 |
| 2 | 1 | 64.1 | 68.3 | 16 / 35 | 5297 |
| 3 | 1 | 64.5 | 68.3 | 18 / 35 | 5389 |
| 4 | 1 | 63.6 | 65.4 | 17 / 35 | 5332 |
| 5 | 1 | 68.4 | 81.6 | 21 / 35 | 5855 |
| 6 | 1 | 68.4 | 82.5 | 22 / 35 | 5589 |
| 7 | 1 | 63.4 | 66.3 | 17 / 35 | 4970 |
| 8 | 3 | 58.8 | 56.5 | 10 / 35 | 4521 |
| 9 | 2 | 63.2 | 66.0 | 14 / 35 | 5454 |
| 10 | 1 | 68.4 | 83.2 | 19 / 35 | 5885 |
| 11 | 1 | 67.1 | 73.3 | 22 / 35 | 6259 |
| 12 | 2 | 65.3 | 73.0 | 15 / 35 | 5329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 151 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 45 | 78% |
| germ.TheMind .2 | 20 | 90% |
| qualidafial.MajorDick 1.0.1 | 16 | 94% |
| awesomeness.Elite 1.0 | 11 | 91% |
| lrem.micro.MoggFanatic 0.2 | 7 | 86% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 213 of 420 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 46% | 205 |
| simonton.nano.WeekendObsession_Melee 1.0 | 45 | 21% | 70 |
| germ.TheMind .2 | 16 | 8% | 32 |
| awesomeness.Elite 1.0 | 14 | 7% | 27 |
| qualidafial.MajorDick 1.0.1 | 13 | 6% | 25 |
| stelo.UntouchableNano 1.3 | 10 | 5% | 22 |
| lrem.micro.MoggFanatic 0.2 | 9 | 4% | 19 |
| mym.EdgeStalker 1.0 | 5 | 2% | 8 |
| sample.Crazy 1.0 | 1 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.1 | 308 / 420 | 2.07 | 20.0% | 61910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 20.0% | 308 |
| rz.HawkOnFire 0.1 | 2.1 | 13.6% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.2% | 24 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 18 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.4% | 4 |
| ratosh.Wesco 1.4 | 7.8 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 7.9% | 6 |
| stelo.PatternRobot 1.0 | 8.1 | 7.5% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.9 | 21 / 35 | 4810 |
| 2 | 1 | 70.4 | 87.3 | 27 / 35 | 5098 |
| 3 | 1 | 70.1 | 85.4 | 25 / 35 | 5287 |
| 4 | 1 | 70.7 | 91.4 | 28 / 35 | 5014 |
| 5 | 1 | 71.7 | 94.6 | 28 / 35 | 5119 |
| 6 | 1 | 72.2 | 94.3 | 28 / 35 | 5434 |
| 7 | 1 | 68.5 | 81.0 | 20 / 35 | 5572 |
| 8 | 1 | 70.5 | 89.8 | 26 / 35 | 4993 |
| 9 | 1 | 68.5 | 80.6 | 24 / 35 | 4777 |
| 10 | 1 | 72.5 | 97.1 | 28 / 35 | 5400 |
| 11 | 1 | 70.2 | 83.8 | 28 / 35 | 5048 |
| 12 | 1 | 70.9 | 90.5 | 25 / 35 | 5358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 131 | 92% |
| nz.jdc.nano.GridFu 1.0 | 82 | 95% |
| timmit.nano.TimDog 0.33 | 34 | 88% |
| stelo.PatternRobot 1.0 | 26 | 85% |
| maribo.IotaCT 1.1 | 20 | 80% |
| spinnercat.Omen 1.0 | 16 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 16 | 100% |
| ratosh.Wesco 1.4 | 11 | 91% |

Hadur died in 113 of 420 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 26 | 23% | 126 |
| timmit.nano.TimDog 0.33 | 18 | 16% | 54 |
| maribo.IotaCT 1.1 | 17 | 15% | 41 |
| nz.jdc.nano.GridFu 1.0 | 16 | 14% | 106 |
| stelo.PatternRobot 1.0 | 15 | 13% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 7% | 18 |
| ratosh.Wesco 1.4 | 7 | 6% | 27 |
| spinnercat.Omen 1.0 | 4 | 4% | 11 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.9 | 350 / 420 | 1.64 | 21.9% | 80799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 21.9% | 350 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.6% | 33 |
| baal.nano.N 1.42 | 2.6 | 11.3% | 5 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.3% | 3 |
| zyx.micro.Ant 1.1 | 5.4 | 9.1% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.5% | 1 |
| sanja.First 0.1 | 6.3 | 8.6% | 7 |
| cvt.Firsty 1.0 | 7.8 | 7.5% | 10 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.2% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.8 | 27 / 35 | 6698 |
| 2 | 1 | 70.8 | 88.9 | 24 / 35 | 6612 |
| 3 | 1 | 71.9 | 94.3 | 30 / 35 | 6506 |
| 4 | 1 | 71.0 | 89.5 | 27 / 35 | 6637 |
| 5 | 1 | 71.8 | 92.4 | 29 / 35 | 6586 |
| 6 | 1 | 72.5 | 95.2 | 29 / 35 | 7029 |
| 7 | 1 | 72.7 | 96.2 | 32 / 35 | 6793 |
| 8 | 1 | 71.9 | 92.7 | 28 / 35 | 6891 |
| 9 | 1 | 72.0 | 92.7 | 30 / 35 | 6605 |
| 10 | 1 | 72.3 | 93.7 | 30 / 35 | 6799 |
| 11 | 1 | 72.6 | 94.0 | 32 / 35 | 6839 |
| 12 | 1 | 72.5 | 95.6 | 32 / 35 | 6804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 75 | 92% |
| baal.nano.N 1.42 | 71 | 99% |
| cvt.Firsty 1.0 | 58 | 97% |
| sanja.First 0.1 | 45 | 93% |
| amk.Punbot.Punbot 0.01 | 39 | 100% |
| zyx.micro.Ant 1.1 | 33 | 82% |
| Grystrion.TrackerWO 1.0 | 31 | 100% |
| squidM.TentalceMeleeNano 1.1 | 13 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 71 of 420 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 17 | 24% | 104 |
| zyx.micro.Ant 1.1 | 13 | 18% | 75 |
| sanja.First 0.1 | 10 | 14% | 48 |
| baal.nano.N 1.42 | 8 | 11% | 73 |
| cvt.Firsty 1.0 | 7 | 10% | 43 |
| Grystrion.TrackerWO 1.0 | 5 | 7% | 34 |
| sample.RamFire 1.0 | 5 | 7% | 8 |
| amk.Punbot.Punbot 0.01 | 3 | 4% | 13 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 17 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.1 | 129 / 420 | 4.05 | 14.9% | 61780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.2% | 179 |
| hadur117.micro.SaorS3 0.1 | 1.8 | 14.9% | 129 |
| cs.Wren 1.0 | 3.3 | 12.4% | 27 |
| js.PinBall 1.6 | 4.0 | 11.8% | 30 |
| mz.Cork 0.1 | 4.8 | 10.8% | 26 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 6 |
| evd.X1 0.01 | 6.8 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 7 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 12 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 62.9 | 11 / 35 | 5171 |
| 2 | 2 | 62.7 | 64.8 | 14 / 35 | 5253 |
| 3 | 1 | 65.1 | 74.9 | 13 / 35 | 5406 |
| 4 | 2 | 62.9 | 68.6 | 9 / 35 | 5098 |
| 5 | 2 | 62.3 | 65.1 | 11 / 35 | 5168 |
| 6 | 2 | 62.6 | 68.3 | 10 / 35 | 4862 |
| 7 | 2 | 64.3 | 70.5 | 10 / 35 | 5623 |
| 8 | 2 | 61.3 | 63.5 | 9 / 35 | 4751 |
| 9 | 2 | 60.1 | 61.0 | 8 / 35 | 4832 |
| 10 | 2 | 64.1 | 68.9 | 14 / 35 | 5469 |
| 11 | 2 | 61.0 | 62.9 | 10 / 35 | 4851 |
| 12 | 1 | 61.3 | 62.2 | 10 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 137 | 48% |
| cs.Wren 1.0 | 32 | 94% |
| mz.Cork 0.1 | 16 | 75% |
| js.PinBall 1.6 | 14 | 79% |
| donjezza.Jezza 1.0 | 8 | 63% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 292 of 420 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 145 | 50% | 218 |
| mz.Cork 0.1 | 27 | 9% | 43 |
| joe.ADinosaur 1.0 | 26 | 9% | 30 |
| evd.X1 0.01 | 25 | 9% | 28 |
| js.PinBall 1.6 | 23 | 8% | 33 |
| cs.Wren 1.0 | 19 | 7% | 33 |
| PSW.Relentless 0.1 | 16 | 5% | 16 |
| donjezza.Jezza 1.0 | 8 | 3% | 10 |
| jsal.Jsalbot 1.0 | 3 | 1% | 9 |

## Melee bench: F12

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.7 | 276 / 420 | 2.38 | 19.3% | 61637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 19.3% | 276 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 30 |
| ntc.Opposite 1.5 | 3.6 | 10.9% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.9% | 30 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 9.9% | 13 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 10 |
| DBall.NUKE 0.1 | 7.4 | 8.2% | 13 |
| donjezza.Muncho 1.0 | 9.1 | 6.2% | 16 |
| pbg.R2D2 1.0 | 9.9 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.8 | 23 / 35 | 5082 |
| 2 | 1 | 65.7 | 76.2 | 20 / 35 | 4525 |
| 3 | 1 | 68.7 | 83.8 | 23 / 35 | 5316 |
| 4 | 1 | 69.9 | 91.1 | 22 / 35 | 5490 |
| 5 | 1 | 70.5 | 90.2 | 28 / 35 | 5168 |
| 6 | 1 | 69.3 | 87.3 | 25 / 35 | 5043 |
| 7 | 1 | 68.8 | 85.7 | 23 / 35 | 4789 |
| 8 | 1 | 69.6 | 87.6 | 26 / 35 | 5177 |
| 9 | 1 | 67.4 | 81.6 | 21 / 35 | 5041 |
| 10 | 1 | 68.5 | 83.2 | 22 / 35 | 5560 |
| 11 | 1 | 68.5 | 83.8 | 22 / 35 | 5077 |
| 12 | 1 | 68.0 | 81.6 | 21 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 78 | 95% |
| stelo.AreaTargetingBot 1.1 | 58 | 81% |
| ntc.Opposite 1.5 | 39 | 90% |
| DBall.NUKE 0.1 | 30 | 93% |
| disan.Chair 2.2.0 | 29 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 27 | 93% |
| donjezza.Muncho 1.0 | 27 | 85% |
| pfvicm.Sobieski 7.2.3b | 16 | 81% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 27 | 19% | 90 |
| stelo.AreaTargetingBot 1.1 | 27 | 19% | 72 |
| pfvicm.Sobieski 7.2.3b | 26 | 18% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 15% | 55 |
| ntc.Opposite 1.5 | 18 | 12% | 44 |
| disan.Chair 2.2.0 | 8 | 6% | 27 |
| pbg.R2D2 1.0 | 7 | 5% | 19 |
| DBall.NUKE 0.1 | 5 | 3% | 45 |
| donjezza.Muncho 1.0 | 5 | 3% | 24 |

## Melee bench: F13

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 69.4 | 164 / 420 | 3.75 | 15.4% | 52461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.8 | 15.4% | 164 |
| oog.melee.Capulet 1.2 | 2.7 | 14.0% | 94 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.5% | 53 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 20 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 18 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 8.9 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 70.5 | 14 / 35 | 4316 |
| 2 | 1 | 65.1 | 69.8 | 12 / 35 | 4986 |
| 3 | 5 | 58.1 | 53.7 | 9 / 35 | 3932 |
| 4 | 1 | 66.8 | 81.3 | 15 / 35 | 4620 |
| 5 | 1 | 65.4 | 74.0 | 16 / 35 | 4430 |
| 6 | 3 | 61.6 | 64.1 | 15 / 35 | 3988 |
| 7 | 2 | 63.9 | 69.8 | 12 / 35 | 4202 |
| 8 | 1 | 66.8 | 77.5 | 21 / 35 | 4643 |
| 9 | 1 | 62.9 | 66.0 | 13 / 35 | 4175 |
| 10 | 1 | 63.5 | 71.1 | 11 / 35 | 4145 |
| 11 | 3 | 61.8 | 63.5 | 9 / 35 | 4274 |
| 12 | 1 | 64.8 | 71.4 | 17 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 76 | 59% |
| kawigi.micro.Shiz 1.1 | 53 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 66% |
| yagami.Tidus 0.11 | 23 | 96% |
| ejb.Polaris 1.0.1 | 17 | 82% |
| step.nanoPri 1.0 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 258 of 420 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 115 | 45% | 164 |
| yagami.Tidus 0.11 | 34 | 13% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 13% | 66 |
| ejb.Polaris 1.0.1 | 27 | 10% | 53 |
| kawigi.micro.Shiz 1.1 | 18 | 7% | 48 |
| stelo.MirrorNano 1.3 | 11 | 4% | 15 |
| step.nanoPri 1.0 | 10 | 4% | 12 |
| kurios.DOSexe .9a | 10 | 4% | 8 |

## Melee bench: F14

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.5 | 246 / 420 | 3.03 | 17.2% | 55060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.2% | 246 |
| wompi.Quokka 1.6 | 2.9 | 12.0% | 41 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 58 |
| bzdp.Pansy 2.1 | 3.5 | 11.7% | 34 |
| ratosh.Nobo 0.21 | 4.4 | 11.1% | 13 |
| m3thos.Eva00 1.1 | 6.3 | 9.3% | 14 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 7.0% | 4 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 3 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 75.2 | 20 / 35 | 4647 |
| 2 | 1 | 65.8 | 76.2 | 21 / 35 | 4653 |
| 3 | 1 | 65.0 | 74.6 | 21 / 35 | 4551 |
| 4 | 1 | 66.6 | 79.4 | 22 / 35 | 4545 |
| 5 | 1 | 68.4 | 84.8 | 24 / 35 | 5092 |
| 6 | 1 | 63.4 | 72.1 | 16 / 35 | 4046 |
| 7 | 1 | 68.4 | 83.5 | 25 / 35 | 4946 |
| 8 | 1 | 66.8 | 81.0 | 22 / 35 | 4642 |
| 9 | 1 | 64.3 | 73.7 | 18 / 35 | 4398 |
| 10 | 1 | 63.3 | 70.8 | 17 / 35 | 4088 |
| 11 | 1 | 67.3 | 85.1 | 22 / 35 | 4510 |
| 12 | 1 | 65.5 | 73.7 | 18 / 35 | 4942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 86 | 93% |
| wee.Gem 1.8.4 | 82 | 90% |
| wompi.Quokka 1.6 | 55 | 82% |
| ratosh.Nobo 0.21 | 22 | 95% |
| m3thos.Eva00 1.1 | 14 | 86% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| stelo.MyAgileRobot 0.2 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 177 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 34 | 19% | 68 |
| wee.Gem 1.8.4 | 23 | 13% | 91 |
| jeremyreeder.Vincent 2011.12.09 | 23 | 13% | 31 |
| maribo.FollowFire 1 | 23 | 13% | 23 |
| bzdp.Pansy 2.1 | 19 | 11% | 81 |
| bayen.UbaMicro 1.4 | 18 | 10% | 34 |
| m3thos.Eva00 1.1 | 16 | 9% | 27 |
| stelo.MyAgileRobot 0.2 | 13 | 7% | 21 |
| ratosh.Nobo 0.21 | 8 | 5% | 36 |

## Melee bench: F15

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 80.1 | 114 / 420 | 2.79 | 19.0% | 90149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.9% | 269 |
| hadur117.micro.SaorS3 0.1 | 1.8 | 19.0% | 114 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 31 |
| ayk.WallHugger 1.0 | 4.3 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 5.1 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 7.1 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.1 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 77.5 | 5 / 35 | 7121 |
| 2 | 2 | 68.3 | 73.0 | 9 / 35 | 7372 |
| 3 | 1 | 73.0 | 91.4 | 14 / 35 | 8322 |
| 4 | 2 | 68.2 | 75.9 | 8 / 35 | 7094 |
| 5 | 2 | 69.6 | 81.3 | 6 / 35 | 7548 |
| 6 | 2 | 70.0 | 81.0 | 7 / 35 | 7611 |
| 7 | 2 | 70.9 | 80.6 | 9 / 35 | 8278 |
| 8 | 1 | 72.8 | 90.2 | 16 / 35 | 8022 |
| 9 | 2 | 69.5 | 79.0 | 8 / 35 | 7413 |
| 10 | 2 | 68.7 | 77.5 | 9 / 35 | 7045 |
| 11 | 1 | 70.3 | 78.4 | 15 / 35 | 7680 |
| 12 | 2 | 68.2 | 75.9 | 8 / 35 | 6643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 218 | 26% |
| mz.NanoGod 2.02 | 24 | 79% |
| exauge.GateKeeper 1.1.121g | 14 | 100% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| ayk.WallHugger 1.0 | 9 | 89% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 308 of 420 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 224 | 73% | 291 |
| mz.NanoGod 2.02 | 39 | 13% | 60 |
| ayk.WallHugger 1.0 | 18 | 6% | 26 |
| exauge.GateKeeper 1.1.121g | 10 | 3% | 20 |
| stelo.PianistNano 1.2 | 8 | 3% | 10 |
| stuff.Vlad 0.1 | 8 | 3% | 9 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.1 | 215 / 420 | 3.42 | 16.8% | 59667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 16.8% | 215 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 42 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 48 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.0% | 34 |
| bvh.micro.Freya 0.3 | 4.4 | 11.1% | 42 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 20 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 4 |
| dl.BetterWalls 1.0 | 8.4 | 6.8% | 4 |
| ap.Frederick 1.1 | 8.9 | 6.5% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 72.4 | 14 / 35 | 4757 |
| 2 | 1 | 65.5 | 74.3 | 22 / 35 | 4802 |
| 3 | 1 | 67.4 | 78.4 | 21 / 35 | 5428 |
| 4 | 1 | 66.7 | 79.0 | 20 / 35 | 5074 |
| 5 | 1 | 65.6 | 71.7 | 18 / 35 | 5065 |
| 6 | 1 | 63.0 | 65.4 | 17 / 35 | 4906 |
| 7 | 1 | 66.3 | 76.5 | 15 / 35 | 5405 |
| 8 | 1 | 63.7 | 68.9 | 17 / 35 | 4837 |
| 9 | 1 | 66.9 | 78.1 | 22 / 35 | 5363 |
| 10 | 1 | 59.5 | 57.1 | 14 / 35 | 4284 |
| 11 | 1 | 65.5 | 77.5 | 16 / 35 | 4637 |
| 12 | 1 | 66.6 | 77.5 | 19 / 35 | 5109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 92 | 92% |
| dummy.micro.Sparrow 2.5 | 46 | 83% |
| bvh.micro.Freya 0.3 | 41 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 41 | 78% |
| stelo.MirrorMicro 1.0 | 14 | 64% |
| ap.Frederick 1.1 | 12 | 100% |
| conscience.Electron 1.3g | 6 | 67% |

Hadur died in 207 of 420 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 39 | 19% | 49 |
| voidious.micro.BlitzBat 1.05 | 35 | 17% | 101 |
| mn.nano.perceptual.Impact 1.3.0 | 30 | 14% | 32 |
| dummy.micro.Sparrow 2.5 | 29 | 14% | 77 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 11% | 61 |
| stelo.MirrorMicro 1.0 | 18 | 9% | 30 |
| bvh.micro.Freya 0.3 | 17 | 8% | 40 |
| dl.BetterWalls 1.0 | 17 | 8% | 30 |

## Melee bench: F17

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.0 | 301 / 420 | 2.08 | 21.2% | 84490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 21.2% | 301 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 48 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.3% | 18 |
| sul.Lunar 1.1 | 3.9 | 10.6% | 20 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 16 |
| dsw.StaticD 1.0 | 5.9 | 8.4% | 11 |
| tlp.ThreeLeggedPig 1 | 6.9 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 7 |
| sample.Corners 1.0 | 9.4 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 92.1 | 28 / 35 | 7270 |
| 2 | 1 | 68.8 | 78.1 | 21 / 35 | 6623 |
| 3 | 1 | 71.8 | 87.0 | 24 / 35 | 7367 |
| 4 | 1 | 72.2 | 90.8 | 27 / 35 | 7184 |
| 5 | 1 | 71.7 | 90.8 | 28 / 35 | 6882 |
| 6 | 1 | 72.6 | 94.6 | 28 / 35 | 6787 |
| 7 | 1 | 69.5 | 82.2 | 21 / 35 | 6678 |
| 8 | 1 | 73.0 | 93.3 | 26 / 35 | 7674 |
| 9 | 1 | 69.9 | 81.6 | 20 / 35 | 7006 |
| 10 | 1 | 69.6 | 78.4 | 20 / 35 | 7345 |
| 11 | 1 | 73.2 | 95.9 | 31 / 35 | 6988 |
| 12 | 1 | 71.7 | 90.8 | 27 / 35 | 6686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 106 | 88% |
| sul.Lunar 1.1 | 66 | 100% |
| supersample.SuperBoxBot 1.0 | 64 | 92% |
| dsw.StaticD 1.0 | 26 | 69% |
| sample.MyFirstRobot 1.0 | 21 | 76% |
| tlp.ThreeLeggedPig 1 | 19 | 100% |
| mme.NikeEnhanced 2.0 | 15 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 100% |
| sample.Corners 1.0 | 6 | 83% |

Hadur died in 126 of 420 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 36 | 29% | 124 |
| supersample.SuperBoxBot 1.0 | 31 | 25% | 78 |
| dsw.StaticD 1.0 | 18 | 14% | 47 |
| mme.NikeEnhanced 2.0 | 13 | 10% | 28 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 20 |
| sul.Lunar 1.1 | 6 | 5% | 78 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 2% | 23 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 11 |
| sample.Corners 1.0 | 3 | 2% | 9 |
5 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 79.3 | 248 / 420 | 2.86 | 18.8% | 79502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.8% | 248 |
| radnor.DoctorBob 1.42 | 2.8 | 12.6% | 49 |
| mld.Wisdom 1.0 | 3.1 | 11.8% | 29 |
| KiraNL.Chupacabra 0.4 | 4.6 | 10.6% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.6 | 11.0% | 38 |
| amz.NanoClone 1.41 | 5.4 | 9.8% | 15 |
| sample.Walls 1.0 | 7.3 | 8.1% | 12 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.0 | 22 / 35 | 6757 |
| 2 | 1 | 68.2 | 77.8 | 21 / 35 | 6484 |
| 3 | 1 | 69.1 | 83.5 | 20 / 35 | 6470 |
| 4 | 1 | 68.0 | 77.8 | 21 / 35 | 6744 |
| 5 | 1 | 67.7 | 77.5 | 19 / 35 | 6789 |
| 6 | 1 | 70.0 | 84.4 | 24 / 35 | 7128 |
| 7 | 1 | 68.2 | 80.6 | 22 / 35 | 6347 |
| 8 | 1 | 68.2 | 79.4 | 21 / 35 | 6367 |
| 9 | 1 | 65.1 | 69.8 | 14 / 35 | 6054 |
| 10 | 1 | 69.2 | 81.3 | 21 / 35 | 6906 |
| 11 | 1 | 69.3 | 81.3 | 24 / 35 | 6991 |
| 12 | 1 | 67.5 | 77.8 | 19 / 35 | 6465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 76 | 96% |
| radnor.DoctorBob 1.42 | 75 | 79% |
| mld.Wisdom 1.0 | 40 | 83% |
| jangs.ns51 1.0 | 25 | 96% |
| sample.Walls 1.0 | 20 | 95% |
| amz.NanoClone 1.41 | 15 | 100% |
| KiraNL.Chupacabra 0.4 | 14 | 71% |
| GarmBox.Oranges 1.0 | 13 | 92% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 174 of 420 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 56 | 32% | 99 |
| radnor.DoctorBob 1.42 | 40 | 23% | 103 |
| KiraNL.Chupacabra 0.4 | 30 | 17% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 11% | 95 |
| amz.NanoClone 1.41 | 15 | 9% | 23 |
| sample.Walls 1.0 | 6 | 3% | 22 |
| jangs.ns51 1.0 | 5 | 3% | 18 |
| GarmBox.Oranges 1.0 | 3 | 2% | 8 |

