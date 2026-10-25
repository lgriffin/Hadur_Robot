# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.7 | 251 / 420 | 2.28 | 20.1% | 78242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 20.1% | 251 |
| radnor.DoctorBob 1.42 | 2.2 | 15.1% | 70 |
| mz.AntiGrav 1.0 | 3.3 | 13.6% | 32 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 46 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 11 |
| sample.Walls 1.0 | 6.4 | 7.1% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.4 | 6.2% | 7 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 89.2 | 23 / 35 | 6852 |
| 2 | 1 | 70.0 | 85.1 | 20 / 35 | 5938 |
| 3 | 1 | 70.1 | 83.2 | 18 / 35 | 6579 |
| 4 | 1 | 72.4 | 92.7 | 22 / 35 | 6733 |
| 5 | 1 | 68.7 | 82.5 | 20 / 35 | 5393 |
| 6 | 1 | 70.3 | 83.2 | 20 / 35 | 6665 |
| 7 | 1 | 71.6 | 88.6 | 23 / 35 | 6698 |
| 8 | 1 | 71.3 | 84.1 | 20 / 35 | 7161 |
| 9 | 1 | 72.2 | 89.5 | 25 / 35 | 6971 |
| 10 | 1 | 71.7 | 90.2 | 23 / 35 | 6553 |
| 11 | 1 | 70.7 | 84.8 | 21 / 35 | 6675 |
| 12 | 1 | 67.8 | 75.9 | 16 / 35 | 6024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 95 | 98% |
| radnor.DoctorBob 1.42 | 86 | 70% |
| mld.Infinity 2.2 | 84 | 82% |
| amz.NanoClone 1.41 | 14 | 93% |
| jangs.ns51 1.0 | 8 | 75% |
| arthord.MannyPacquiao Beta | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 170 of 420 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 92 | 54% | 177 |
| mld.Infinity 2.2 | 25 | 15% | 33 |
| amz.NanoClone 1.41 | 18 | 11% | 30 |
| mz.AntiGrav 1.0 | 16 | 9% | 114 |
| sample.Walls 1.0 | 9 | 5% | 31 |
| GarmBox.Oranges 1.0 | 6 | 4% | 6 |
| jangs.ns51 1.0 | 4 | 2% | 14 |
| arthord.MannyPacquiao Beta | 0 | 0% | 9 |

## Melee bench: F02

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.7 | 253 / 420 | 2.73 | 17.8% | 59232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.3 | 17.8% | 253 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.5% | 95 |
| mld.DustBunny 3.8 | 3.3 | 12.7% | 27 |
| maribo.melee.BMV 0.1 | 4.3 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.1 | 9.3% | 15 |
| zyx.nano.Ant 1.1 | 6.6 | 8.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.9% | 14 |
| fullsail.SweetTea 1.1 | 7.4 | 7.7% | 10 |
| bzdp.BoxCar 2.0 | 8.0 | 7.1% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 26 / 35 | 5458 |
| 2 | 3 | 57.9 | 50.2 | 8 / 35 | 4310 |
| 3 | 1 | 68.9 | 92.1 | 28 / 35 | 4249 |
| 4 | 1 | 69.3 | 87.6 | 25 / 35 | 5586 |
| 5 | 1 | 65.0 | 76.5 | 15 / 35 | 4699 |
| 6 | 1 | 69.7 | 88.3 | 24 / 35 | 5571 |
| 7 | 1 | 67.1 | 84.4 | 23 / 35 | 4796 |
| 8 | 1 | 66.8 | 81.3 | 23 / 35 | 4779 |
| 9 | 3 | 60.2 | 55.6 | 11 / 35 | 4527 |
| 10 | 1 | 68.2 | 84.1 | 22 / 35 | 5044 |
| 11 | 1 | 68.9 | 87.9 | 24 / 35 | 5166 |
| 12 | 1 | 69.4 | 90.2 | 24 / 35 | 5047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 138 | 76% |
| mld.DustBunny 3.8 | 82 | 90% |
| djdjdj.NanoSkunk10 1.0 | 24 | 92% |
| maribo.melee.BMV 0.1 | 20 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 84% |
| fullsail.SweetTea 1.1 | 15 | 73% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 170 of 420 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 32% | 165 |
| mld.DustBunny 3.8 | 27 | 16% | 93 |
| cs.Grudge 1.0 | 19 | 11% | 17 |
| fullsail.SweetTea 1.1 | 16 | 9% | 29 |
| zyx.nano.Ant 1.1 | 14 | 8% | 20 |
| maribo.melee.BMV 0.1 | 12 | 7% | 30 |
| bzdp.BoxCar 2.0 | 11 | 6% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 5% | 27 |
| djdjdj.NanoSkunk10 1.0 | 7 | 4% | 25 |

## Melee bench: F03

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.4 | 264 / 420 | 2.50 | 19.4% | 68566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 19.4% | 264 |
| myl.micro.Troodon 1.10 | 2.0 | 13.7% | 55 |
| myl.nano.KomoriNinja 1.1 | 3.4 | 11.8% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 3.9 | 11.1% | 37 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.5% | 23 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 9 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.6 | 7.4% | 10 |
| sample.Fire 1.0 | 9.3 | 5.1% | 3 |
| sample.Tracker 1.0 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 23 / 35 | 5510 |
| 2 | 1 | 70.3 | 86.3 | 25 / 35 | 5814 |
| 3 | 1 | 70.9 | 88.9 | 24 / 35 | 6334 |
| 4 | 1 | 68.0 | 81.3 | 19 / 35 | 5661 |
| 5 | 1 | 69.2 | 84.8 | 21 / 35 | 5730 |
| 6 | 1 | 67.4 | 78.1 | 20 / 35 | 5461 |
| 7 | 1 | 69.3 | 82.2 | 24 / 35 | 5660 |
| 8 | 1 | 67.1 | 74.9 | 16 / 35 | 5408 |
| 9 | 1 | 71.3 | 89.5 | 25 / 35 | 6461 |
| 10 | 1 | 66.6 | 77.8 | 18 / 35 | 5039 |
| 11 | 1 | 69.6 | 84.1 | 25 / 35 | 5901 |
| 12 | 1 | 69.2 | 82.5 | 24 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 85 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 71 | 90% |
| cb.nano.Insomnia 1.0 | 46 | 83% |
| myl.nano.KomoriNinja 1.1 | 40 | 88% |
| sp.Nanos.Ember 1.1 | 29 | 93% |
| fm.mammillarias 1.3 | 12 | 83% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 2 | 100% |

Hadur died in 160 of 420 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 33 | 21% | 135 |
| cb.nano.Insomnia 1.0 | 31 | 19% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 29 | 18% | 80 |
| myl.nano.KomoriNinja 1.1 | 26 | 16% | 69 |
| fm.mammillarias 1.3 | 14 | 9% | 26 |
| cs.sheldor.Talon 1.1 | 11 | 7% | 22 |
| sp.Nanos.Ember 1.1 | 8 | 5% | 42 |
| sample.Fire 1.0 | 5 | 3% | 11 |
| sample.Tracker 1.0 | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.0 | 252 / 420 | 2.44 | 19.4% | 72337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 19.4% | 252 |
| kawigi.nano.Lib 1.0 | 2.4 | 12.8% | 39 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.4% | 43 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 25 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.4% | 35 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.9% | 0 |
| yk.JahMicro 1.0 | 6.6 | 8.3% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.8% | 13 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.4 | 22 / 35 | 6408 |
| 2 | 1 | 67.4 | 81.3 | 19 / 35 | 5415 |
| 3 | 1 | 71.4 | 92.7 | 23 / 35 | 6769 |
| 4 | 1 | 66.2 | 74.6 | 19 / 35 | 5607 |
| 5 | 1 | 69.6 | 86.7 | 23 / 35 | 6044 |
| 6 | 1 | 70.3 | 91.1 | 20 / 35 | 6181 |
| 7 | 1 | 68.7 | 81.9 | 22 / 35 | 6053 |
| 8 | 1 | 69.0 | 84.4 | 19 / 35 | 5908 |
| 9 | 1 | 69.9 | 86.3 | 23 / 35 | 6381 |
| 10 | 1 | 69.5 | 87.0 | 25 / 35 | 5653 |
| 11 | 1 | 69.6 | 83.5 | 22 / 35 | 6262 |
| 12 | 1 | 66.1 | 73.7 | 15 / 35 | 5656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 118 | 81% |
| stelo.SoJNanoMelee 1.1 | 75 | 85% |
| tvv.micro.Antares 1.1.1 | 32 | 66% |
| ers.nano.hawk.HawkLA 3.0m | 30 | 87% |
| tj.zombie1n 1.0.1 | 26 | 65% |
| yk.JahMicro 1.0 | 19 | 84% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 5 | 80% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 168 of 420 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 33% | 156 |
| tvv.micro.Antares 1.1.1 | 37 | 22% | 67 |
| stelo.SoJNanoMelee 1.1 | 23 | 14% | 62 |
| tj.zombie1n 1.0.1 | 21 | 13% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 5% | 39 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 5% | 15 |
| sample.VelociRobot 1.0 | 7 | 4% | 15 |
| yk.JahMicro 1.0 | 6 | 4% | 23 |
| repositorio.NanoStep 1.0 | 2 | 1% | 18 |

## Melee bench: F05

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 69.4 | 172 / 420 | 3.75 | 15.4% | 53302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 15.4% | 172 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 63 |
| ahf.NanoAndrew .4 | 3.4 | 11.8% | 61 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 66 |
| sam.Samspin 1.0 | 5.9 | 9.8% | 17 |
| EBBU.Sim2 1.02 | 6.3 | 9.6% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.9% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 73.3 | 16 / 35 | 4394 |
| 2 | 1 | 62.8 | 68.3 | 13 / 35 | 4906 |
| 3 | 1 | 65.2 | 77.5 | 18 / 35 | 4714 |
| 4 | 1 | 63.4 | 70.5 | 15 / 35 | 4406 |
| 5 | 1 | 62.0 | 68.9 | 11 / 35 | 4282 |
| 6 | 1 | 60.6 | 64.1 | 13 / 35 | 4130 |
| 7 | 1 | 61.6 | 66.7 | 13 / 35 | 4320 |
| 8 | 1 | 62.2 | 68.9 | 15 / 35 | 4164 |
| 9 | 1 | 63.7 | 70.5 | 14 / 35 | 4702 |
| 10 | 1 | 61.8 | 66.3 | 15 / 35 | 4510 |
| 11 | 1 | 63.4 | 69.5 | 14 / 35 | 4472 |
| 12 | 1 | 62.9 | 68.3 | 15 / 35 | 4302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 70 | 81% |
| oog.melee.Corsair 1.0 | 48 | 56% |
| ahf.NanoAndrew .4 | 44 | 73% |
| sam.Samspin 1.0 | 21 | 86% |
| EBBU.Sim2 1.02 | 17 | 88% |
| robar.nano.Assertive_Melee 0.2 | 15 | 87% |
| zyx.nano.BacillusComma 1.0 | 9 | 89% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 251 of 420 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 45 | 18% | 59 |
| simonton.nano.MeleeSeed 1.8 | 40 | 16% | 89 |
| ahf.NanoAndrew .4 | 40 | 16% | 76 |
| oog.melee.Corsair 1.0 | 36 | 14% | 72 |
| bwbaugh.nano.Tirunculus 0.0.0a | 29 | 12% | 26 |
| zyx.nano.BacillusComma 1.0 | 25 | 10% | 37 |
| EBBU.Sim2 1.02 | 18 | 7% | 29 |
| sam.Samspin 1.0 | 11 | 4% | 23 |
| sample.TrackFire 1.0 | 7 | 3% | 8 |

## Melee bench: F06

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.9 | 254 / 420 | 2.54 | 18.0% | 56187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 18.0% | 254 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.2% | 49 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.6% | 43 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.3% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 9.1% | 24 |
| fm.claire 1.7 | 6.0 | 8.8% | 3 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.8% | 6 |
| sample.SpinBot 1.0 | 8.0 | 6.8% | 6 |
| pa.Improved 1.0 | 9.2 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.0 | 19 / 35 | 4703 |
| 2 | 1 | 67.9 | 82.5 | 25 / 35 | 4880 |
| 3 | 1 | 66.0 | 83.2 | 21 / 35 | 4300 |
| 4 | 1 | 68.0 | 84.8 | 25 / 35 | 4604 |
| 5 | 1 | 66.6 | 82.2 | 21 / 35 | 4560 |
| 6 | 1 | 66.4 | 81.3 | 21 / 35 | 4511 |
| 7 | 1 | 68.0 | 84.1 | 23 / 35 | 4852 |
| 8 | 1 | 67.5 | 83.8 | 21 / 35 | 4584 |
| 9 | 1 | 67.8 | 86.7 | 19 / 35 | 4936 |
| 10 | 1 | 65.9 | 78.4 | 21 / 35 | 4619 |
| 11 | 1 | 67.0 | 82.2 | 17 / 35 | 5007 |
| 12 | 1 | 67.5 | 85.1 | 21 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 115 | 90% |
| oog.melee.CapuletDroid 1.1 | 61 | 75% |
| gh.nano.Grofvuil 0.2 | 48 | 85% |
| arthord.NanoSatanMelee Beta | 25 | 96% |
| winamp32.micro.MicroMacro 1.0 | 18 | 61% |
| fm.claire 1.7 | 10 | 100% |
| sample.SpinBot 1.0 | 9 | 89% |
| kurios.DOSexe .9b | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 172 of 420 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 36 | 21% | 94 |
| d414.nano.Quantum 1.0.0 | 35 | 20% | 134 |
| oog.melee.CapuletDroid 1.1 | 33 | 19% | 36 |
| arthord.NanoSatanMelee Beta | 17 | 10% | 38 |
| winamp32.micro.MicroMacro 1.0 | 16 | 9% | 42 |
| fm.claire 1.7 | 12 | 7% | 21 |
| sample.SpinBot 1.0 | 12 | 7% | 21 |
| kurios.DOSexe .9b | 5 | 3% | 21 |
| pa.Improved 1.0 | 3 | 2% | 9 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.7 | 170 / 420 | 2.65 | 17.7% | 65061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 17.7% | 170 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 89 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.3% | 38 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 94 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 11 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 3 |
| acogdev.alpha 0.2 | 7.8 | 6.4% | 2 |
| el.JumpShoot 0.2 | 8.3 | 6.0% | 4 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 9 |
| fire219.CatBot 1.0 | 9.1 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.6 | 14 / 35 | 5795 |
| 2 | 1 | 67.0 | 81.0 | 13 / 35 | 5416 |
| 3 | 1 | 66.8 | 80.3 | 16 / 35 | 5173 |
| 4 | 1 | 67.9 | 81.6 | 17 / 35 | 5568 |
| 5 | 1 | 67.3 | 81.9 | 15 / 35 | 5338 |
| 6 | 1 | 66.6 | 81.0 | 11 / 35 | 5406 |
| 7 | 1 | 67.8 | 81.9 | 17 / 35 | 5655 |
| 8 | 1 | 66.9 | 81.3 | 12 / 35 | 5185 |
| 9 | 1 | 66.1 | 81.6 | 14 / 35 | 4936 |
| 10 | 1 | 64.9 | 77.8 | 12 / 35 | 5052 |
| 11 | 1 | 68.5 | 86.0 | 15 / 35 | 5841 |
| 12 | 1 | 67.9 | 84.1 | 14 / 35 | 5696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 94 | 37% |
| spinnercat.micro.Tyger 0.1 | 82 | 89% |
| gh.micro.Gruweltje 0.7 | 59 | 25% |
| DBall.Anarchy 0.1 | 28 | 93% |
| caimano.Furia_Ceca 0.22 | 10 | 100% |
| el.JumpShoot 0.2 | 6 | 67% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| acogdev.alpha 0.2 | 3 | 67% |

Hadur died in 251 of 420 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 98 | 39% | 150 |
| gh.micro.Gruweltje 0.7 | 71 | 28% | 103 |
| spinnercat.micro.Tyger 0.1 | 34 | 14% | 78 |
| acogdev.alpha 0.2 | 14 | 6% | 16 |
| el.JumpShoot 0.2 | 9 | 4% | 11 |
| fire219.CatBot 1.0 | 9 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 7 | 3% | 15 |
| DBall.Anarchy 0.1 | 5 | 2% | 27 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 10 |

## Melee bench: F08

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 67.6 | 176 / 420 | 3.91 | 15.1% | 54504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.6 | 15.3% | 105 |
| hadur117.micro.Saor 0.1 | 1.8 | 15.1% | 176 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.6 | 13.7% | 72 |
| germ.TheMind .2 | 5.1 | 9.7% | 14 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.5% | 12 |
| awesomeness.Elite 1.0 | 6.0 | 8.7% | 18 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.8% | 6 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.6% | 10 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 5 |
| mym.EdgeStalker 1.0 | 9.9 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.9 | 47.9 | 8 / 35 | 4234 |
| 2 | 1 | 66.8 | 77.1 | 21 / 35 | 5179 |
| 3 | 1 | 64.0 | 72.1 | 17 / 35 | 4563 |
| 4 | 1 | 64.0 | 72.1 | 14 / 35 | 4951 |
| 5 | 1 | 63.9 | 73.7 | 17 / 35 | 4381 |
| 6 | 3 | 58.4 | 61.0 | 9 / 35 | 3857 |
| 7 | 2 | 61.9 | 67.3 | 15 / 35 | 4408 |
| 8 | 2 | 63.8 | 71.4 | 15 / 35 | 4537 |
| 9 | 1 | 64.7 | 72.7 | 19 / 35 | 4770 |
| 10 | 3 | 64.1 | 67.9 | 16 / 35 | 4826 |
| 11 | 3 | 60.2 | 60.3 | 10 / 35 | 4279 |
| 12 | 1 | 62.2 | 68.3 | 15 / 35 | 4519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 125 | 66% |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 79% |
| qualidafial.MajorDick 1.0.1 | 16 | 100% |
| awesomeness.Elite 1.0 | 13 | 92% |
| germ.TheMind .2 | 12 | 75% |
| stelo.UntouchableNano 1.3 | 11 | 91% |
| lrem.micro.MoggFanatic 0.2 | 11 | 82% |
| sample.Crazy 1.0 | 4 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 246 of 420 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 113 | 46% | 186 |
| simonton.nano.WeekendObsession_Melee 1.0 | 50 | 20% | 78 |
| germ.TheMind .2 | 24 | 10% | 38 |
| awesomeness.Elite 1.0 | 16 | 7% | 34 |
| lrem.micro.MoggFanatic 0.2 | 12 | 5% | 23 |
| stelo.UntouchableNano 1.3 | 11 | 4% | 20 |
| qualidafial.MajorDick 1.0.1 | 10 | 4% | 15 |
| sample.Crazy 1.0 | 5 | 2% | 13 |
| mym.EdgeStalker 1.0 | 5 | 2% | 10 |

## Melee bench: F09

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.1 | 268 / 420 | 2.43 | 18.7% | 55011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 18.7% | 268 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.3% | 50 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 21 |
| timmit.nano.TimDog 0.33 | 5.4 | 9.7% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.6% | 3 |
| ratosh.Wesco 1.4 | 7.4 | 8.4% | 8 |
| spinnercat.Omen 1.0 | 7.8 | 8.1% | 9 |
| stelo.PatternRobot 1.0 | 8.1 | 7.9% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 25 / 35 | 4389 |
| 2 | 1 | 67.5 | 80.6 | 21 / 35 | 4427 |
| 3 | 1 | 68.9 | 81.9 | 19 / 35 | 4873 |
| 4 | 1 | 68.5 | 84.1 | 21 / 35 | 4671 |
| 5 | 1 | 68.7 | 83.2 | 24 / 35 | 4645 |
| 6 | 1 | 69.3 | 85.7 | 23 / 35 | 4699 |
| 7 | 1 | 70.3 | 91.1 | 26 / 35 | 4697 |
| 8 | 1 | 70.7 | 91.1 | 25 / 35 | 4624 |
| 9 | 1 | 66.0 | 75.2 | 17 / 35 | 4416 |
| 10 | 1 | 66.1 | 75.6 | 21 / 35 | 4308 |
| 11 | 1 | 67.7 | 82.2 | 21 / 35 | 4386 |
| 12 | 1 | 69.9 | 89.5 | 25 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 127 | 96% |
| nz.jdc.nano.GridFu 1.0 | 76 | 82% |
| timmit.nano.TimDog 0.33 | 22 | 77% |
| stelo.PatternRobot 1.0 | 22 | 86% |
| maribo.IotaCT 1.1 | 18 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 100% |
| ratosh.Wesco 1.4 | 13 | 92% |
| spinnercat.Omen 1.0 | 9 | 100% |

Hadur died in 152 of 420 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 35 | 23% | 110 |
| timmit.nano.TimDog 0.33 | 28 | 18% | 51 |
| rz.HawkOnFire 0.1 | 25 | 16% | 114 |
| stelo.PatternRobot 1.0 | 22 | 14% | 38 |
| maribo.IotaCT 1.1 | 16 | 11% | 37 |
| ratosh.Wesco 1.4 | 14 | 9% | 29 |
| spinnercat.Omen 1.0 | 7 | 5% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 3% | 19 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.7 | 325 / 420 | 1.84 | 20.8% | 72555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 20.8% | 325 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.7% | 48 |
| baal.nano.N 1.42 | 2.9 | 11.5% | 14 |
| Grystrion.TrackerWO 1.0 | 4.4 | 9.6% | 6 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.6 | 8.3% | 2 |
| sanja.First 0.1 | 6.8 | 8.1% | 5 |
| cvt.Firsty 1.0 | 7.8 | 7.7% | 12 |
| amk.Punbot.Punbot 0.01 | 7.9 | 7.1% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 98.1 | 31 / 35 | 6538 |
| 2 | 1 | 72.3 | 95.6 | 30 / 35 | 6380 |
| 3 | 1 | 71.1 | 93.0 | 29 / 35 | 6030 |
| 4 | 1 | 68.7 | 84.8 | 22 / 35 | 5731 |
| 5 | 1 | 71.5 | 96.5 | 29 / 35 | 5884 |
| 6 | 1 | 70.4 | 90.8 | 25 / 35 | 6047 |
| 7 | 1 | 70.6 | 89.2 | 25 / 35 | 6005 |
| 8 | 1 | 70.4 | 87.3 | 25 / 35 | 6199 |
| 9 | 1 | 68.4 | 82.5 | 24 / 35 | 5775 |
| 10 | 1 | 71.3 | 94.9 | 31 / 35 | 5844 |
| 11 | 1 | 68.8 | 82.5 | 26 / 35 | 5779 |
| 12 | 1 | 71.8 | 92.7 | 28 / 35 | 6343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 99 | 85% |
| cvt.Firsty 1.0 | 61 | 95% |
| baal.nano.N 1.42 | 54 | 94% |
| sanja.First 0.1 | 45 | 96% |
| amk.Punbot.Punbot 0.01 | 32 | 97% |
| zyx.micro.Ant 1.1 | 25 | 100% |
| Grystrion.TrackerWO 1.0 | 21 | 95% |
| squidM.TentalceMeleeNano 1.1 | 11 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 95 of 420 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 30 | 32% | 146 |
| zyx.micro.Ant 1.1 | 19 | 20% | 62 |
| cvt.Firsty 1.0 | 11 | 12% | 50 |
| Grystrion.TrackerWO 1.0 | 11 | 12% | 26 |
| baal.nano.N 1.42 | 10 | 11% | 62 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 15 |
| amk.Punbot.Punbot 0.01 | 4 | 4% | 14 |
| sample.RamFire 1.0 | 4 | 4% | 4 |
| sanja.First 0.1 | 2 | 2% | 33 |

## Melee bench: F11

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 64.0 | 116 / 420 | 4.24 | 13.9% | 52587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.6% | 177 |
| hadur117.micro.Saor 0.1 | 2.0 | 13.9% | 116 |
| cs.Wren 1.0 | 2.8 | 12.9% | 49 |
| mz.Cork 0.1 | 4.5 | 11.2% | 28 |
| js.PinBall 1.6 | 4.5 | 11.4% | 24 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 8 |
| evd.X1 0.01 | 7.0 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.1 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 8.9 | 6.0% | 14 |
| PSW.Relentless 0.1 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 63.5 | 10 / 35 | 4600 |
| 2 | 2 | 59.6 | 61.9 | 7 / 35 | 4526 |
| 3 | 1 | 59.6 | 60.3 | 12 / 35 | 4313 |
| 4 | 2 | 58.6 | 61.0 | 6 / 35 | 4169 |
| 5 | 2 | 59.7 | 65.1 | 9 / 35 | 3999 |
| 6 | 3 | 58.7 | 60.0 | 8 / 35 | 4207 |
| 7 | 2 | 60.6 | 64.8 | 12 / 35 | 4207 |
| 8 | 2 | 63.2 | 73.0 | 14 / 35 | 4339 |
| 9 | 1 | 61.8 | 68.6 | 13 / 35 | 4449 |
| 10 | 2 | 61.0 | 65.4 | 6 / 35 | 4558 |
| 11 | 3 | 57.6 | 54.9 | 10 / 35 | 4171 |
| 12 | 2 | 63.3 | 69.8 | 9 / 35 | 5049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 118 | 48% |
| cs.Wren 1.0 | 33 | 88% |
| mz.Cork 0.1 | 13 | 69% |
| js.PinBall 1.6 | 11 | 73% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 306 of 420 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 137 | 45% | 202 |
| cs.Wren 1.0 | 32 | 10% | 48 |
| mz.Cork 0.1 | 29 | 9% | 39 |
| js.PinBall 1.6 | 27 | 9% | 33 |
| joe.ADinosaur 1.0 | 27 | 9% | 31 |
| evd.X1 0.01 | 25 | 8% | 30 |
| PSW.Relentless 0.1 | 18 | 6% | 16 |
| donjezza.Jezza 1.0 | 7 | 2% | 12 |
| jsal.Jsalbot 1.0 | 4 | 1% | 9 |

## Melee bench: F12

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.4 | 270 / 420 | 2.49 | 18.6% | 54283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 18.6% | 270 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 41 |
| ntc.Opposite 1.5 | 3.6 | 10.9% | 13 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 10.9% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.8% | 14 |
| DBall.NUKE 0.1 | 7.4 | 8.4% | 16 |
| disan.Chair 2.2.0 | 7.5 | 8.1% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 21 / 35 | 4379 |
| 2 | 1 | 66.1 | 77.8 | 21 / 35 | 4312 |
| 3 | 1 | 67.3 | 83.8 | 23 / 35 | 4063 |
| 4 | 1 | 67.0 | 81.9 | 21 / 35 | 4482 |
| 5 | 1 | 65.5 | 75.6 | 21 / 35 | 4256 |
| 6 | 1 | 68.6 | 85.7 | 25 / 35 | 4638 |
| 7 | 1 | 67.4 | 82.2 | 22 / 35 | 4668 |
| 8 | 1 | 68.7 | 87.6 | 21 / 35 | 4898 |
| 9 | 1 | 68.8 | 88.9 | 24 / 35 | 4601 |
| 10 | 1 | 68.5 | 85.1 | 23 / 35 | 4733 |
| 11 | 1 | 69.6 | 90.2 | 27 / 35 | 4699 |
| 12 | 1 | 66.9 | 79.7 | 21 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 86 | 83% |
| myl.nano.Graviton 1.10 | 70 | 87% |
| DBall.NUKE 0.1 | 32 | 88% |
| disan.Chair 2.2.0 | 28 | 93% |
| ntc.Opposite 1.5 | 23 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 100% |
| pfvicm.Sobieski 7.2.3b | 20 | 95% |
| donjezza.Muncho 1.0 | 19 | 95% |
| pbg.R2D2 1.0 | 8 | 100% |

Hadur died in 155 of 420 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 39 | 25% | 56 |
| myl.nano.Graviton 1.10 | 32 | 21% | 93 |
| stelo.AreaTargetingBot 1.1 | 26 | 17% | 75 |
| ntc.Opposite 1.5 | 19 | 12% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 10% | 36 |
| DBall.NUKE 0.1 | 11 | 7% | 47 |
| donjezza.Muncho 1.0 | 5 | 3% | 27 |
| disan.Chair 2.2.0 | 4 | 3% | 19 |
| pbg.R2D2 1.0 | 3 | 2% | 19 |

## Melee bench: F13

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.5 | 149 / 420 | 3.83 | 14.7% | 46138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.7 | 14.7% | 149 |
| oog.melee.Capulet 1.2 | 1.8 | 14.6% | 102 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 53 |
| yagami.Tidus 0.11 | 4.4 | 12.3% | 17 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 16 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 59.0 | 11 / 35 | 3426 |
| 2 | 3 | 59.3 | 58.7 | 9 / 35 | 3821 |
| 3 | 1 | 64.9 | 74.0 | 15 / 35 | 4112 |
| 4 | 1 | 64.5 | 73.7 | 16 / 35 | 3976 |
| 5 | 1 | 62.9 | 68.6 | 14 / 35 | 3555 |
| 6 | 2 | 62.8 | 73.7 | 7 / 35 | 3561 |
| 7 | 1 | 63.5 | 70.2 | 13 / 35 | 3985 |
| 8 | 1 | 64.0 | 71.1 | 15 / 35 | 3733 |
| 9 | 2 | 61.9 | 63.8 | 10 / 35 | 4008 |
| 10 | 1 | 63.9 | 72.7 | 13 / 35 | 3961 |
| 11 | 1 | 63.0 | 72.4 | 12 / 35 | 3792 |
| 12 | 2 | 62.1 | 64.4 | 14 / 35 | 4208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 58% |
| kawigi.micro.Shiz 1.1 | 61 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 71% |
| yagami.Tidus 0.11 | 29 | 90% |
| ejb.Polaris 1.0.1 | 12 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 273 of 420 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 101 | 37% | 148 |
| yagami.Tidus 0.11 | 48 | 18% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 12% | 57 |
| kawigi.micro.Shiz 1.1 | 30 | 11% | 60 |
| ejb.Polaris 1.0.1 | 23 | 8% | 46 |
| stelo.MirrorNano 1.3 | 15 | 5% | 16 |
| kurios.DOSexe .9a | 13 | 5% | 12 |
| step.nanoPri 1.0 | 10 | 4% | 13 |

## Melee bench: F14

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.8 | 224 / 420 | 3.27 | 16.1% | 48015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 16.1% | 224 |
| wee.Gem 1.8.4 | 2.6 | 12.8% | 76 |
| bzdp.Pansy 2.1 | 3.4 | 12.3% | 50 |
| wompi.Quokka 1.6 | 3.6 | 12.0% | 32 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 16 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 11 |
| bayen.UbaMicro 1.4 | 6.9 | 8.6% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 6.7% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.0 | 18 / 35 | 4266 |
| 2 | 1 | 68.0 | 86.3 | 25 / 35 | 4319 |
| 3 | 1 | 64.2 | 75.6 | 19 / 35 | 3771 |
| 4 | 1 | 60.3 | 67.0 | 14 / 35 | 3257 |
| 5 | 1 | 62.1 | 65.7 | 16 / 35 | 4042 |
| 6 | 1 | 61.7 | 66.7 | 17 / 35 | 3895 |
| 7 | 1 | 64.8 | 75.6 | 20 / 35 | 4081 |
| 8 | 1 | 64.0 | 73.3 | 19 / 35 | 4079 |
| 9 | 1 | 64.9 | 78.1 | 22 / 35 | 3727 |
| 10 | 1 | 64.4 | 78.1 | 17 / 35 | 3989 |
| 11 | 1 | 64.9 | 74.9 | 19 / 35 | 4466 |
| 12 | 1 | 64.6 | 76.8 | 18 / 35 | 4123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 82 | 89% |
| wee.Gem 1.8.4 | 77 | 86% |
| wompi.Quokka 1.6 | 41 | 76% |
| m3thos.Eva00 1.1 | 21 | 95% |
| ratosh.Nobo 0.21 | 19 | 100% |
| bayen.UbaMicro 1.4 | 12 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 198 of 420 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 38 | 19% | 59 |
| wee.Gem 1.8.4 | 29 | 15% | 92 |
| maribo.FollowFire 1 | 27 | 14% | 29 |
| bayen.UbaMicro 1.4 | 25 | 13% | 34 |
| bzdp.Pansy 2.1 | 23 | 12% | 92 |
| ratosh.Nobo 0.21 | 20 | 10% | 43 |
| stelo.MyAgileRobot 0.2 | 15 | 8% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 6% | 13 |
| m3thos.Eva00 1.1 | 10 | 5% | 31 |

## Melee bench: F15

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 79.6 | 100 / 420 | 2.84 | 17.8% | 77318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.0% | 265 |
| hadur117.micro.Saor 0.1 | 2.0 | 17.8% | 100 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 40 |
| ayk.WallHugger 1.0 | 4.5 | 9.7% | 3 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.2% | 6 |
| stuff.Vlad 0.1 | 5.6 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.7% | 3 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 2 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 82.9 | 9 / 35 | 6479 |
| 2 | 2 | 67.7 | 78.7 | 6 / 35 | 6386 |
| 3 | 2 | 66.0 | 74.9 | 8 / 35 | 5561 |
| 4 | 2 | 68.2 | 77.8 | 4 / 35 | 6561 |
| 5 | 2 | 68.8 | 81.6 | 12 / 35 | 6358 |
| 6 | 2 | 69.6 | 84.1 | 5 / 35 | 6886 |
| 7 | 2 | 68.6 | 83.8 | 6 / 35 | 6376 |
| 8 | 2 | 70.0 | 83.5 | 12 / 35 | 7026 |
| 9 | 2 | 69.2 | 82.9 | 8 / 35 | 6818 |
| 10 | 2 | 66.2 | 71.4 | 10 / 35 | 5829 |
| 11 | 2 | 68.2 | 74.0 | 11 / 35 | 6925 |
| 12 | 2 | 68.1 | 79.7 | 9 / 35 | 6113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 217 | 22% |
| mz.NanoGod 2.02 | 33 | 55% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 320 of 420 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 219 | 68% | 268 |
| mz.NanoGod 2.02 | 60 | 19% | 79 |
| exauge.GateKeeper 1.1.121g | 17 | 5% | 26 |
| ayk.WallHugger 1.0 | 14 | 4% | 22 |
| stuff.Vlad 0.1 | 6 | 2% | 12 |
| stelo.PianistNano 1.2 | 4 | 1% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 7 |

## Melee bench: F16

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 70.7 | 197 / 420 | 3.63 | 15.9% | 52614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.2 | 15.9% | 197 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 60 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.4% | 47 |
| bvh.micro.Freya 0.3 | 4.4 | 10.9% | 26 |
| stelo.MirrorMicro 1.0 | 6.1 | 8.8% | 14 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 6 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 6 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 72.1 | 18 / 35 | 4202 |
| 2 | 1 | 64.4 | 73.3 | 18 / 35 | 4571 |
| 3 | 1 | 63.9 | 71.7 | 19 / 35 | 4129 |
| 4 | 1 | 63.8 | 69.8 | 17 / 35 | 4501 |
| 5 | 1 | 65.8 | 77.8 | 18 / 35 | 4562 |
| 6 | 1 | 64.9 | 72.7 | 19 / 35 | 4710 |
| 7 | 1 | 65.6 | 77.8 | 16 / 35 | 4756 |
| 8 | 2 | 59.9 | 59.0 | 12 / 35 | 4223 |
| 9 | 1 | 64.1 | 73.0 | 16 / 35 | 4618 |
| 10 | 1 | 62.6 | 69.5 | 18 / 35 | 3817 |
| 11 | 2 | 58.3 | 58.4 | 11 / 35 | 3737 |
| 12 | 1 | 65.0 | 73.7 | 15 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 95 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 43 | 91% |
| dummy.micro.Sparrow 2.5 | 42 | 86% |
| bvh.micro.Freya 0.3 | 28 | 86% |
| stelo.MirrorMicro 1.0 | 10 | 70% |
| ap.Frederick 1.1 | 7 | 86% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 224 of 420 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 21% | 107 |
| mn.nano.perceptual.Impact 1.3.0 | 37 | 17% | 36 |
| conscience.Electron 1.3g | 34 | 15% | 40 |
| dummy.micro.Sparrow 2.5 | 33 | 15% | 70 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 11% | 65 |
| dl.BetterWalls 1.0 | 19 | 8% | 32 |
| bvh.micro.Freya 0.3 | 16 | 7% | 44 |
| stelo.MirrorMicro 1.0 | 12 | 5% | 25 |
| ap.Frederick 1.1 | 2 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.6 | 279 / 420 | 2.57 | 19.6% | 74351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 19.6% | 279 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 44 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 29 |
| supersample.SuperBoxBot 1.0 | 3.9 | 10.6% | 24 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 7 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 12 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 7.0% | 7 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.8% | 12 |
| sample.Corners 1.0 | 9.6 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 85.7 | 23 / 35 | 6895 |
| 2 | 1 | 69.2 | 82.2 | 24 / 35 | 5911 |
| 3 | 1 | 70.5 | 88.6 | 26 / 35 | 6098 |
| 4 | 1 | 68.7 | 81.0 | 20 / 35 | 6261 |
| 5 | 1 | 69.9 | 85.7 | 24 / 35 | 6222 |
| 6 | 1 | 66.4 | 74.9 | 21 / 35 | 5643 |
| 7 | 1 | 69.2 | 82.5 | 25 / 35 | 5942 |
| 8 | 1 | 70.5 | 84.1 | 23 / 35 | 6593 |
| 9 | 1 | 70.7 | 87.0 | 27 / 35 | 6222 |
| 10 | 1 | 69.2 | 82.5 | 24 / 35 | 6119 |
| 11 | 1 | 69.6 | 81.9 | 22 / 35 | 6457 |
| 12 | 1 | 67.2 | 74.6 | 20 / 35 | 5988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 106 | 90% |
| sul.Lunar 1.1 | 77 | 97% |
| supersample.SuperBoxBot 1.0 | 44 | 82% |
| sample.MyFirstJuniorRobot 1.0 | 24 | 96% |
| dsw.StaticD 1.0 | 21 | 71% |
| mme.NikeEnhanced 2.0 | 18 | 94% |
| sample.MyFirstRobot 1.0 | 12 | 67% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 142 of 420 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 48 | 34% | 75 |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 25% | 126 |
| dsw.StaticD 1.0 | 19 | 13% | 44 |
| mme.NikeEnhanced 2.0 | 12 | 8% | 27 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 17 |
| sul.Lunar 1.1 | 7 | 5% | 83 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 4% | 26 |
| sample.Corners 1.0 | 4 | 3% | 14 |
| tlp.ThreeLeggedPig 1 | 4 | 3% | 7 |

## Melee bench: F18

hadur117.micro.Saor 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 77.9 | 202 / 420 | 2.99 | 17.6% | 69948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.1 | 1.0 | 17.6% | 202 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 77 |
| mld.Wisdom 1.0 | 3.8 | 11.9% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.8% | 44 |
| amz.NanoClone 1.41 | 5.1 | 10.4% | 21 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 16 |
| sample.Walls 1.0 | 7.0 | 8.1% | 14 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 6 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 75.6 | 18 / 35 | 6044 |
| 2 | 1 | 66.7 | 77.1 | 18 / 35 | 6366 |
| 3 | 1 | 67.3 | 79.7 | 18 / 35 | 5943 |
| 4 | 1 | 65.3 | 73.7 | 13 / 35 | 5752 |
| 5 | 1 | 65.6 | 76.2 | 15 / 35 | 5429 |
| 6 | 1 | 63.6 | 66.7 | 13 / 35 | 5581 |
| 7 | 1 | 66.5 | 80.6 | 12 / 35 | 5614 |
| 8 | 1 | 66.3 | 77.1 | 15 / 35 | 5552 |
| 9 | 1 | 65.6 | 74.6 | 16 / 35 | 5537 |
| 10 | 1 | 69.0 | 87.0 | 22 / 35 | 6105 |
| 11 | 1 | 68.6 | 83.2 | 20 / 35 | 6224 |
| 12 | 1 | 68.7 | 83.8 | 22 / 35 | 5801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 93 | 89% |
| radnor.DoctorBob 1.42 | 71 | 55% |
| amz.NanoClone 1.41 | 31 | 74% |
| mld.Wisdom 1.0 | 19 | 68% |
| KiraNL.Chupacabra 0.4 | 18 | 72% |
| sample.Walls 1.0 | 14 | 100% |
| jangs.ns51 1.0 | 9 | 78% |
| GarmBox.Oranges 1.0 | 9 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 220 of 420 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 63 | 29% | 110 |
| mld.Wisdom 1.0 | 46 | 21% | 67 |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 17% | 121 |
| KiraNL.Chupacabra 0.4 | 25 | 11% | 39 |
| amz.NanoClone 1.41 | 24 | 11% | 41 |
| GarmBox.Oranges 1.0 | 11 | 5% | 14 |
| sample.Walls 1.0 | 10 | 5% | 17 |
| jangs.ns51 1.0 | 3 | 1% | 7 |

