# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 90.2 | 322 / 420 | 1.88 | 21.6% | 85321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 21.6% | 322 |
| radnor.DoctorBob 1.42 | 2.4 | 14.1% | 36 |
| mz.AntiGrav 1.0 | 2.7 | 13.7% | 18 |
| mld.Infinity 2.2 | 3.9 | 12.6% | 27 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 13 |
| sample.Walls 1.0 | 6.3 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.1 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 88.3 | 25 / 35 | 6378 |
| 2 | 1 | 71.8 | 88.3 | 27 / 35 | 6910 |
| 3 | 1 | 72.7 | 91.1 | 26 / 35 | 7302 |
| 4 | 1 | 72.6 | 90.8 | 28 / 35 | 7202 |
| 5 | 1 | 72.5 | 90.2 | 27 / 35 | 7239 |
| 6 | 1 | 74.1 | 95.9 | 30 / 35 | 7454 |
| 7 | 1 | 73.3 | 92.1 | 25 / 35 | 7547 |
| 8 | 1 | 73.6 | 94.3 | 29 / 35 | 7458 |
| 9 | 1 | 71.8 | 88.6 | 24 / 35 | 7160 |
| 10 | 1 | 72.1 | 89.8 | 27 / 35 | 6936 |
| 11 | 1 | 70.7 | 83.2 | 26 / 35 | 6631 |
| 12 | 1 | 72.5 | 90.5 | 28 / 35 | 7104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 145 | 98% |
| mld.Infinity 2.2 | 95 | 88% |
| radnor.DoctorBob 1.42 | 74 | 85% |
| amz.NanoClone 1.41 | 11 | 91% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 98 of 420 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 39% | 144 |
| mld.Infinity 2.2 | 24 | 24% | 35 |
| mz.AntiGrav 1.0 | 14 | 14% | 145 |
| amz.NanoClone 1.41 | 11 | 11% | 35 |
| sample.Walls 1.0 | 4 | 4% | 22 |
| jangs.ns51 1.0 | 4 | 4% | 15 |
| GarmBox.Oranges 1.0 | 2 | 2% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 7 |

## Melee bench: F02

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.7 | 289 / 420 | 2.11 | 19.1% | 61893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.1 | 19.1% | 289 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.3% | 87 |
| mld.DustBunny 3.8 | 3.9 | 12.0% | 9 |
| maribo.melee.BMV 0.1 | 3.9 | 10.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 10 |
| zyx.nano.Ant 1.1 | 6.3 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.2% | 17 |
| bzdp.BoxCar 2.0 | 7.1 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 8.7 | 6.3% | 4 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 54.0 | 8 / 35 | 4298 |
| 2 | 1 | 70.2 | 93.3 | 27 / 35 | 5383 |
| 3 | 1 | 70.0 | 92.7 | 26 / 35 | 5358 |
| 4 | 1 | 68.7 | 90.2 | 24 / 35 | 5320 |
| 5 | 1 | 71.1 | 97.8 | 31 / 35 | 5436 |
| 6 | 1 | 70.3 | 91.7 | 26 / 35 | 5382 |
| 7 | 1 | 69.0 | 90.5 | 23 / 35 | 5028 |
| 8 | 1 | 66.3 | 82.5 | 21 / 35 | 4216 |
| 9 | 1 | 69.3 | 87.6 | 25 / 35 | 5355 |
| 10 | 1 | 69.8 | 90.5 | 27 / 35 | 5229 |
| 11 | 1 | 69.3 | 88.3 | 23 / 35 | 5336 |
| 12 | 1 | 70.4 | 93.3 | 28 / 35 | 5552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 145 | 76% |
| mld.DustBunny 3.8 | 97 | 97% |
| djdjdj.NanoSkunk10 1.0 | 27 | 100% |
| maribo.melee.BMV 0.1 | 24 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 74% |
| fullsail.SweetTea 1.1 | 12 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 3 | 67% |

Hadur died in 132 of 420 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 41% | 179 |
| mld.DustBunny 3.8 | 20 | 15% | 91 |
| maribo.melee.BMV 0.1 | 13 | 10% | 29 |
| zyx.nano.Ant 1.1 | 12 | 9% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 29 |
| bzdp.BoxCar 2.0 | 7 | 5% | 13 |
| cs.Grudge 1.0 | 6 | 5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 31 |
| fullsail.SweetTea 1.1 | 5 | 4% | 22 |

## Melee bench: F03

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.1 | 309 / 420 | 2.07 | 20.9% | 74551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.9% | 309 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.3% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.4% | 28 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.4% | 17 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 5 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.9 | 7.0% | 9 |
| sample.Fire 1.0 | 9.5 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.5 | 23 / 35 | 6295 |
| 2 | 1 | 70.5 | 85.7 | 24 / 35 | 6356 |
| 3 | 1 | 69.9 | 84.1 | 22 / 35 | 5929 |
| 4 | 1 | 71.1 | 85.4 | 26 / 35 | 6297 |
| 5 | 1 | 72.5 | 93.0 | 27 / 35 | 6312 |
| 6 | 1 | 71.2 | 87.6 | 25 / 35 | 6457 |
| 7 | 1 | 71.9 | 91.4 | 26 / 35 | 6516 |
| 8 | 1 | 70.7 | 86.7 | 26 / 35 | 6180 |
| 9 | 1 | 73.3 | 95.9 | 31 / 35 | 6565 |
| 10 | 1 | 70.0 | 86.3 | 25 / 35 | 5810 |
| 11 | 1 | 70.8 | 89.5 | 27 / 35 | 5984 |
| 12 | 1 | 70.5 | 87.9 | 27 / 35 | 5850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 125 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 85 | 89% |
| cb.nano.Insomnia 1.0 | 44 | 80% |
| myl.nano.KomoriNinja 1.1 | 33 | 85% |
| sp.Nanos.Ember 1.1 | 24 | 96% |
| fm.mammillarias 1.3 | 12 | 83% |
| sample.Fire 1.0 | 10 | 100% |
| cs.sheldor.Talon 1.1 | 8 | 100% |

Hadur died in 112 of 420 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 23% | 82 |
| myl.micro.Troodon 1.10 | 20 | 18% | 141 |
| cb.nano.Insomnia 1.0 | 18 | 16% | 23 |
| myl.nano.KomoriNinja 1.1 | 16 | 14% | 68 |
| fm.mammillarias 1.3 | 12 | 11% | 26 |
| cs.sheldor.Talon 1.1 | 8 | 7% | 25 |
| sp.Nanos.Ember 1.1 | 6 | 5% | 31 |
| sample.Fire 1.0 | 3 | 3% | 15 |
| sample.Tracker 1.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.7 | 302 / 420 | 2.19 | 20.5% | 77158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.5% | 302 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.1% | 31 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.2% | 24 |
| tj.zombie1n 1.0.1 | 4.8 | 9.6% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.5% | 24 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 9 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 8.7 | 6.7% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.2 | 26 / 35 | 6619 |
| 2 | 1 | 70.4 | 87.0 | 26 / 35 | 6586 |
| 3 | 1 | 69.4 | 86.3 | 20 / 35 | 6341 |
| 4 | 1 | 70.5 | 87.6 | 27 / 35 | 6259 |
| 5 | 1 | 70.3 | 88.9 | 26 / 35 | 5798 |
| 6 | 1 | 69.6 | 83.5 | 23 / 35 | 6626 |
| 7 | 1 | 69.8 | 85.1 | 26 / 35 | 6165 |
| 8 | 1 | 71.1 | 88.3 | 28 / 35 | 6577 |
| 9 | 1 | 71.0 | 89.2 | 26 / 35 | 6521 |
| 10 | 1 | 71.6 | 91.7 | 28 / 35 | 6791 |
| 11 | 1 | 69.1 | 82.5 | 23 / 35 | 6226 |
| 12 | 1 | 69.4 | 81.6 | 23 / 35 | 6649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 106 | 92% |
| stelo.SoJNanoMelee 1.1 | 79 | 89% |
| tvv.micro.Antares 1.1.1 | 40 | 90% |
| tj.zombie1n 1.0.1 | 39 | 74% |
| ers.nano.hawk.HawkLA 3.0m | 34 | 91% |
| yk.JahMicro 1.0 | 17 | 94% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 6 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 29% | 149 |
| stelo.SoJNanoMelee 1.1 | 19 | 16% | 51 |
| tj.zombie1n 1.0.1 | 19 | 16% | 29 |
| tvv.micro.Antares 1.1.1 | 16 | 13% | 61 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 8% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 8% | 45 |
| yk.JahMicro 1.0 | 7 | 6% | 24 |
| sample.VelociRobot 1.0 | 4 | 3% | 15 |
| repositorio.NanoStep 1.0 | 1 | 1% | 17 |

## Melee bench: F05

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.7 | 187 / 420 | 3.82 | 15.7% | 56711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 15.7% | 187 |
| oog.melee.Corsair 1.0 | 2.7 | 12.4% | 50 |
| ahf.NanoAndrew .4 | 3.1 | 11.9% | 57 |
| simonton.nano.MeleeSeed 1.8 | 3.6 | 11.6% | 53 |
| sam.Samspin 1.0 | 5.6 | 9.9% | 24 |
| EBBU.Sim2 1.02 | 6.3 | 9.4% | 17 |
| robar.nano.Assertive_Melee 0.2 | 6.9 | 8.9% | 15 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.6% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 6.6% | 3 |
| sample.TrackFire 1.0 | 9.9 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 64.4 | 13 / 35 | 4621 |
| 2 | 1 | 64.6 | 73.0 | 19 / 35 | 4613 |
| 3 | 1 | 61.9 | 63.8 | 14 / 35 | 4788 |
| 4 | 1 | 63.1 | 68.6 | 15 / 35 | 4748 |
| 5 | 1 | 64.4 | 71.4 | 18 / 35 | 4895 |
| 6 | 1 | 63.0 | 68.6 | 14 / 35 | 4749 |
| 7 | 1 | 63.2 | 68.3 | 19 / 35 | 4407 |
| 8 | 1 | 63.6 | 70.2 | 15 / 35 | 4928 |
| 9 | 1 | 65.4 | 75.6 | 20 / 35 | 4599 |
| 10 | 1 | 61.6 | 64.1 | 16 / 35 | 4510 |
| 11 | 1 | 62.4 | 67.3 | 15 / 35 | 4499 |
| 12 | 1 | 62.9 | 68.6 | 9 / 35 | 5354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 77 | 91% |
| oog.melee.Corsair 1.0 | 54 | 70% |
| ahf.NanoAndrew .4 | 37 | 78% |
| sam.Samspin 1.0 | 22 | 86% |
| robar.nano.Assertive_Melee 0.2 | 15 | 73% |
| EBBU.Sim2 1.02 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 234 of 420 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 18% | 106 |
| robar.nano.Assertive_Melee 0.2 | 33 | 14% | 47 |
| zyx.nano.BacillusComma 1.0 | 32 | 14% | 39 |
| oog.melee.Corsair 1.0 | 31 | 13% | 67 |
| ahf.NanoAndrew .4 | 28 | 12% | 64 |
| bwbaugh.nano.Tirunculus 0.0.0a | 24 | 10% | 25 |
| EBBU.Sim2 1.02 | 21 | 9% | 32 |
| sam.Samspin 1.0 | 18 | 8% | 32 |
| sample.TrackFire 1.0 | 4 | 2% | 7 |

## Melee bench: F06

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.3 | 279 / 420 | 2.33 | 19.1% | 63127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 19.1% | 279 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 55 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.5% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 10.0% | 30 |
| fm.claire 1.7 | 5.3 | 9.2% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 15 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.2% | 6 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 7 |
| pa.Improved 1.0 | 9.1 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.6 | 5.7% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.0 | 24 / 35 | 5380 |
| 2 | 1 | 67.4 | 82.2 | 17 / 35 | 5144 |
| 3 | 1 | 69.6 | 87.6 | 27 / 35 | 5390 |
| 4 | 1 | 70.0 | 92.1 | 25 / 35 | 5420 |
| 5 | 1 | 67.5 | 79.0 | 23 / 35 | 5092 |
| 6 | 1 | 69.5 | 90.2 | 27 / 35 | 5312 |
| 7 | 1 | 68.1 | 86.0 | 20 / 35 | 5029 |
| 8 | 1 | 67.6 | 79.4 | 22 / 35 | 5152 |
| 9 | 1 | 67.3 | 80.6 | 22 / 35 | 5202 |
| 10 | 1 | 69.3 | 88.6 | 22 / 35 | 5411 |
| 11 | 1 | 69.1 | 86.7 | 26 / 35 | 5055 |
| 12 | 1 | 68.7 | 84.8 | 24 / 35 | 5540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 132 | 86% |
| oog.melee.CapuletDroid 1.1 | 84 | 85% |
| gh.nano.Grofvuil 0.2 | 35 | 86% |
| arthord.NanoSatanMelee Beta | 23 | 91% |
| winamp32.micro.MicroMacro 1.0 | 16 | 81% |
| sample.SpinBot 1.0 | 11 | 82% |
| kurios.DOSexe .9b | 10 | 90% |
| fm.claire 1.7 | 8 | 100% |
| pa.Improved 1.0 | 5 | 80% |

Hadur died in 142 of 420 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 25% | 155 |
| oog.melee.CapuletDroid 1.1 | 27 | 19% | 34 |
| gh.nano.Grofvuil 0.2 | 22 | 15% | 79 |
| fm.claire 1.7 | 16 | 11% | 26 |
| arthord.NanoSatanMelee Beta | 12 | 8% | 33 |
| sample.SpinBot 1.0 | 11 | 8% | 19 |
| winamp32.micro.MicroMacro 1.0 | 8 | 6% | 34 |
| kurios.DOSexe .9b | 5 | 4% | 22 |
| pa.Improved 1.0 | 4 | 3% | 17 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.5 | 192 / 420 | 2.48 | 18.3% | 67185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.1 | 18.3% | 192 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.4% | 109 |
| mz.MicroGodMelee 1 | 3.3 | 13.1% | 68 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 12.9% | 29 |
| DBall.Anarchy 0.1 | 5.1 | 8.7% | 8 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.4% | 3 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 6 |
| fire219.CatBot 1.0 | 8.9 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.3 | 17 / 35 | 5721 |
| 2 | 1 | 69.4 | 90.2 | 18 / 35 | 5768 |
| 3 | 1 | 68.0 | 84.1 | 15 / 35 | 5495 |
| 4 | 1 | 66.2 | 80.6 | 14 / 35 | 4893 |
| 5 | 1 | 67.1 | 81.9 | 16 / 35 | 5360 |
| 6 | 1 | 68.4 | 83.2 | 14 / 35 | 5854 |
| 7 | 1 | 66.5 | 78.1 | 11 / 35 | 5811 |
| 8 | 1 | 66.1 | 78.4 | 13 / 35 | 5172 |
| 9 | 1 | 70.4 | 91.4 | 21 / 35 | 5995 |
| 10 | 2 | 64.8 | 72.1 | 12 / 35 | 5288 |
| 11 | 1 | 70.7 | 91.4 | 24 / 35 | 6109 |
| 12 | 1 | 68.8 | 83.8 | 17 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 94 | 29% |
| mz.MicroGodMelee 1 | 87 | 49% |
| spinnercat.micro.Tyger 0.1 | 83 | 96% |
| DBall.Anarchy 0.1 | 21 | 95% |
| el.JumpShoot 0.2 | 11 | 82% |
| mbro.Detektor3 0.1.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 229 of 420 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 93 | 41% | 131 |
| mz.MicroGodMelee 1 | 75 | 33% | 131 |
| spinnercat.micro.Tyger 0.1 | 21 | 9% | 76 |
| acogdev.alpha 0.2 | 9 | 4% | 13 |
| fire219.CatBot 1.0 | 9 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 8 | 3% | 10 |
| DBall.Anarchy 0.1 | 5 | 2% | 20 |
| el.JumpShoot 0.2 | 5 | 2% | 13 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 12 |

## Melee bench: F08

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.0 | 203 / 420 | 3.61 | 16.3% | 62128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.4 | 16.3% | 203 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 84 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.4 | 13.8% | 68 |
| germ.TheMind .2 | 4.9 | 9.5% | 15 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 17 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.3% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.0 | 19 / 35 | 5558 |
| 2 | 1 | 67.1 | 79.4 | 19 / 35 | 5481 |
| 3 | 1 | 65.3 | 73.7 | 17 / 35 | 5167 |
| 4 | 2 | 60.8 | 59.7 | 13 / 35 | 4799 |
| 5 | 1 | 65.7 | 75.2 | 19 / 35 | 4984 |
| 6 | 3 | 62.1 | 63.5 | 11 / 35 | 5185 |
| 7 | 3 | 59.9 | 58.1 | 12 / 35 | 4590 |
| 8 | 1 | 68.9 | 83.2 | 24 / 35 | 5795 |
| 9 | 1 | 64.6 | 70.8 | 17 / 35 | 4990 |
| 10 | 1 | 66.9 | 76.5 | 22 / 35 | 5478 |
| 11 | 1 | 65.1 | 73.7 | 14 / 35 | 5306 |
| 12 | 1 | 62.3 | 64.8 | 16 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 142 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 53 | 68% |
| germ.TheMind .2 | 19 | 100% |
| qualidafial.MajorDick 1.0.1 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 9 | 89% |
| awesomeness.Elite 1.0 | 9 | 89% |
| lrem.micro.MoggFanatic 0.2 | 8 | 88% |
| sample.Crazy 1.0 | 4 | 100% |

Hadur died in 219 of 420 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 108 | 49% | 208 |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 19% | 79 |
| germ.TheMind .2 | 17 | 8% | 35 |
| awesomeness.Elite 1.0 | 14 | 6% | 25 |
| lrem.micro.MoggFanatic 0.2 | 12 | 5% | 20 |
| qualidafial.MajorDick 1.0.1 | 11 | 5% | 17 |
| stelo.UntouchableNano 1.3 | 9 | 4% | 16 |
| mym.EdgeStalker 1.0 | 6 | 3% | 7 |
| sample.Crazy 1.0 | 1 | 0% | 12 |

## Melee bench: F09

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.7 | 324 / 420 | 1.84 | 20.3% | 59451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.3% | 324 |
| rz.HawkOnFire 0.1 | 2.3 | 13.0% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 30 |
| maribo.IotaCT 1.1 | 4.0 | 10.7% | 14 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 6 |
| stelo.PatternRobot 1.0 | 8.2 | 7.9% | 10 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.5 | 25 / 35 | 5317 |
| 2 | 1 | 71.7 | 93.3 | 29 / 35 | 5001 |
| 3 | 1 | 71.0 | 92.4 | 25 / 35 | 5194 |
| 4 | 1 | 68.9 | 86.0 | 25 / 35 | 4460 |
| 5 | 1 | 71.6 | 91.1 | 28 / 35 | 5313 |
| 6 | 1 | 71.1 | 90.8 | 29 / 35 | 5013 |
| 7 | 1 | 71.0 | 92.1 | 26 / 35 | 4930 |
| 8 | 1 | 68.8 | 85.7 | 24 / 35 | 4406 |
| 9 | 1 | 71.7 | 95.9 | 32 / 35 | 4800 |
| 10 | 1 | 70.6 | 90.8 | 26 / 35 | 4836 |
| 11 | 1 | 72.1 | 96.8 | 31 / 35 | 5090 |
| 12 | 1 | 69.7 | 84.1 | 24 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 126 | 97% |
| nz.jdc.nano.GridFu 1.0 | 84 | 92% |
| maribo.IotaCT 1.1 | 34 | 82% |
| stelo.PatternRobot 1.0 | 31 | 94% |
| timmit.nano.TimDog 0.33 | 24 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 24 | 100% |
| ratosh.Wesco 1.4 | 14 | 86% |
| spinnercat.Omen 1.0 | 12 | 100% |

Hadur died in 97 of 420 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 20 | 21% | 105 |
| timmit.nano.TimDog 0.33 | 20 | 21% | 48 |
| rz.HawkOnFire 0.1 | 13 | 13% | 114 |
| ratosh.Wesco 1.4 | 11 | 11% | 28 |
| maribo.IotaCT 1.1 | 10 | 10% | 53 |
| stelo.PatternRobot 1.0 | 9 | 9% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 7% | 21 |
| spinnercat.Omen 1.0 | 5 | 5% | 19 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.5 | 346 / 420 | 1.85 | 21.2% | 75752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 21.2% | 346 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 26 |
| baal.nano.N 1.42 | 3.2 | 10.9% | 8 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.7% | 1 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 14 |
| sanja.First 0.1 | 5.7 | 8.9% | 10 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.1 | 7.3% | 2 |
| cvt.Firsty 1.0 | 8.4 | 7.3% | 13 |
| sample.RamFire 1.0 | 9.9 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 86.0 | 27 / 35 | 6424 |
| 2 | 1 | 71.2 | 91.7 | 29 / 35 | 6426 |
| 3 | 1 | 72.6 | 94.9 | 32 / 35 | 6778 |
| 4 | 1 | 70.1 | 85.1 | 27 / 35 | 6202 |
| 5 | 1 | 71.1 | 91.7 | 29 / 35 | 6395 |
| 6 | 1 | 72.7 | 97.5 | 32 / 35 | 6444 |
| 7 | 1 | 72.6 | 98.1 | 31 / 35 | 6436 |
| 8 | 1 | 70.4 | 88.9 | 28 / 35 | 6155 |
| 9 | 1 | 70.7 | 91.1 | 29 / 35 | 6173 |
| 10 | 1 | 69.3 | 82.5 | 26 / 35 | 5981 |
| 11 | 1 | 71.8 | 94.0 | 30 / 35 | 6523 |
| 12 | 1 | 69.1 | 84.4 | 26 / 35 | 5815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 74 | 92% |
| cvt.Firsty 1.0 | 62 | 92% |
| baal.nano.N 1.42 | 57 | 100% |
| zyx.micro.Ant 1.1 | 47 | 96% |
| sanja.First 0.1 | 44 | 93% |
| amk.Punbot.Punbot 0.01 | 42 | 95% |
| Grystrion.TrackerWO 1.0 | 27 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 75 of 420 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 24% | 77 |
| tvv.nano.Polaris 1.2 | 13 | 17% | 101 |
| sample.RamFire 1.0 | 10 | 13% | 8 |
| squidM.TentalceMeleeNano 1.1 | 8 | 11% | 21 |
| Grystrion.TrackerWO 1.0 | 7 | 9% | 33 |
| cvt.Firsty 1.0 | 6 | 8% | 43 |
| sanja.First 0.1 | 5 | 7% | 53 |
| baal.nano.N 1.42 | 4 | 5% | 57 |
| amk.Punbot.Punbot 0.01 | 3 | 4% | 12 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.8 | 145 / 420 | 3.81 | 15.3% | 59946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 168 |
| hadur117.micro.SaorW 0.1 | 1.7 | 15.3% | 145 |
| cs.Wren 1.0 | 3.1 | 12.4% | 28 |
| js.PinBall 1.6 | 4.3 | 11.3% | 24 |
| mz.Cork 0.1 | 4.7 | 11.0% | 29 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 10 |
| evd.X1 0.01 | 7.1 | 8.0% | 5 |
| jsal.Jsalbot 1.0 | 7.8 | 6.7% | 5 |
| donjezza.Jezza 1.0 | 9.1 | 5.6% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 74.3 | 9 / 35 | 5027 |
| 2 | 2 | 59.9 | 61.0 | 7 / 35 | 4624 |
| 3 | 1 | 62.5 | 66.7 | 12 / 35 | 5171 |
| 4 | 2 | 61.5 | 62.9 | 12 / 35 | 4932 |
| 5 | 2 | 62.1 | 65.4 | 16 / 35 | 4696 |
| 6 | 1 | 62.3 | 68.9 | 12 / 35 | 4383 |
| 7 | 2 | 63.3 | 69.2 | 11 / 35 | 5231 |
| 8 | 2 | 60.5 | 62.5 | 8 / 35 | 4819 |
| 9 | 2 | 60.7 | 62.9 | 8 / 35 | 4967 |
| 10 | 1 | 66.1 | 77.8 | 15 / 35 | 5458 |
| 11 | 1 | 66.9 | 78.7 | 19 / 35 | 5376 |
| 12 | 2 | 65.8 | 74.9 | 16 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 144 | 53% |
| cs.Wren 1.0 | 43 | 88% |
| mz.Cork 0.1 | 17 | 88% |
| js.PinBall 1.6 | 11 | 73% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 4 | 25% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 277 of 420 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 124 | 45% | 213 |
| joe.ADinosaur 1.0 | 35 | 13% | 35 |
| cs.Wren 1.0 | 27 | 10% | 45 |
| evd.X1 0.01 | 27 | 10% | 27 |
| js.PinBall 1.6 | 24 | 9% | 39 |
| mz.Cork 0.1 | 18 | 6% | 33 |
| PSW.Relentless 0.1 | 14 | 5% | 16 |
| jsal.Jsalbot 1.0 | 5 | 2% | 8 |
| donjezza.Jezza 1.0 | 3 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.5 | 286 / 420 | 2.49 | 19.0% | 58736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 19.0% | 286 |
| myl.nano.Graviton 1.10 | 2.3 | 11.9% | 35 |
| ntc.Opposite 1.5 | 3.5 | 11.1% | 23 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.1% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.4 | 9.7% | 10 |
| DBall.NUKE 0.1 | 7.3 | 8.1% | 6 |
| disan.Chair 2.2.0 | 7.7 | 7.9% | 14 |
| donjezza.Muncho 1.0 | 8.5 | 6.8% | 15 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 27 / 35 | 4753 |
| 2 | 1 | 67.9 | 82.2 | 22 / 35 | 4835 |
| 3 | 1 | 67.6 | 82.5 | 23 / 35 | 4782 |
| 4 | 1 | 68.0 | 85.1 | 22 / 35 | 4478 |
| 5 | 1 | 71.4 | 93.0 | 30 / 35 | 5510 |
| 6 | 1 | 69.6 | 86.3 | 27 / 35 | 5147 |
| 7 | 1 | 66.3 | 77.5 | 21 / 35 | 4694 |
| 8 | 1 | 68.8 | 84.1 | 25 / 35 | 4923 |
| 9 | 1 | 68.6 | 84.8 | 24 / 35 | 4999 |
| 10 | 1 | 66.0 | 76.8 | 20 / 35 | 4421 |
| 11 | 1 | 67.4 | 80.0 | 20 / 35 | 5344 |
| 12 | 1 | 68.5 | 83.8 | 25 / 35 | 4850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 88 | 93% |
| stelo.AreaTargetingBot 1.1 | 59 | 93% |
| donjezza.Muncho 1.0 | 36 | 86% |
| ntc.Opposite 1.5 | 35 | 91% |
| DBall.NUKE 0.1 | 26 | 96% |
| disan.Chair 2.2.0 | 25 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 24 | 96% |
| pfvicm.Sobieski 7.2.3b | 14 | 93% |
| pbg.R2D2 1.0 | 6 | 83% |

Hadur died in 137 of 420 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 39 | 28% | 51 |
| myl.nano.Graviton 1.10 | 22 | 16% | 104 |
| stelo.AreaTargetingBot 1.1 | 20 | 15% | 74 |
| ntc.Opposite 1.5 | 20 | 15% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 9% | 42 |
| disan.Chair 2.2.0 | 11 | 8% | 26 |
| donjezza.Muncho 1.0 | 7 | 5% | 25 |
| pbg.R2D2 1.0 | 5 | 4% | 23 |
| DBall.NUKE 0.1 | 1 | 1% | 30 |

## Melee bench: F13

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.1 | 159 / 420 | 3.60 | 15.2% | 49552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.6 | 15.2% | 159 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.4% | 83 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 47 |
| yagami.Tidus 0.11 | 4.5 | 12.1% | 17 |
| ejb.Polaris 1.0.1 | 5.7 | 10.6% | 19 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.1 | 20 / 35 | 4582 |
| 2 | 1 | 63.5 | 71.4 | 14 / 35 | 4158 |
| 3 | 1 | 63.6 | 72.4 | 11 / 35 | 4201 |
| 4 | 1 | 63.2 | 70.8 | 13 / 35 | 4080 |
| 5 | 3 | 60.4 | 64.1 | 5 / 35 | 3805 |
| 6 | 1 | 63.1 | 69.5 | 11 / 35 | 4394 |
| 7 | 2 | 62.0 | 67.0 | 12 / 35 | 3868 |
| 8 | 1 | 64.8 | 74.3 | 16 / 35 | 4262 |
| 9 | 1 | 66.7 | 80.3 | 19 / 35 | 4234 |
| 10 | 2 | 63.1 | 71.4 | 10 / 35 | 3995 |
| 11 | 3 | 61.2 | 62.9 | 13 / 35 | 3752 |
| 12 | 2 | 62.2 | 64.4 | 15 / 35 | 4221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 65 | 52% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 78% |
| kawigi.micro.Shiz 1.1 | 47 | 91% |
| yagami.Tidus 0.11 | 36 | 92% |
| ejb.Polaris 1.0.1 | 19 | 53% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 262 of 420 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 105 | 40% | 152 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 15% | 75 |
| yagami.Tidus 0.11 | 38 | 15% | 63 |
| ejb.Polaris 1.0.1 | 28 | 11% | 45 |
| kawigi.micro.Shiz 1.1 | 25 | 10% | 55 |
| stelo.MirrorNano 1.3 | 11 | 4% | 11 |
| step.nanoPri 1.0 | 10 | 4% | 10 |
| kurios.DOSexe .9a | 7 | 3% | 8 |

## Melee bench: F14

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.3 | 257 / 420 | 2.86 | 17.4% | 53480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 17.4% | 257 |
| bzdp.Pansy 2.1 | 2.6 | 12.5% | 38 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 59 |
| wompi.Quokka 1.6 | 3.9 | 11.3% | 31 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 14 |
| m3thos.Eva00 1.1 | 5.9 | 9.6% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 3 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.3 | 23 / 35 | 4330 |
| 2 | 1 | 66.9 | 80.6 | 24 / 35 | 4381 |
| 3 | 1 | 65.1 | 76.2 | 21 / 35 | 4176 |
| 4 | 1 | 64.7 | 75.2 | 18 / 35 | 4380 |
| 5 | 1 | 64.0 | 70.2 | 19 / 35 | 4646 |
| 6 | 1 | 66.6 | 79.0 | 21 / 35 | 4985 |
| 7 | 1 | 67.3 | 83.5 | 22 / 35 | 4617 |
| 8 | 1 | 66.1 | 76.5 | 19 / 35 | 4846 |
| 9 | 1 | 68.0 | 86.7 | 23 / 35 | 4450 |
| 10 | 1 | 65.5 | 77.5 | 21 / 35 | 4350 |
| 11 | 1 | 64.7 | 74.9 | 21 / 35 | 4247 |
| 12 | 1 | 66.9 | 85.4 | 25 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 91 | 91% |
| wee.Gem 1.8.4 | 88 | 88% |
| wompi.Quokka 1.6 | 53 | 83% |
| ratosh.Nobo 0.21 | 21 | 86% |
| m3thos.Eva00 1.1 | 16 | 100% |
| bayen.UbaMicro 1.4 | 13 | 92% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 165 of 420 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 29 | 18% | 106 |
| wee.Gem 1.8.4 | 29 | 18% | 98 |
| jeremyreeder.Vincent 2011.12.09 | 22 | 13% | 31 |
| maribo.FollowFire 1 | 21 | 13% | 24 |
| wompi.Quokka 1.6 | 18 | 11% | 49 |
| ratosh.Nobo 0.21 | 17 | 10% | 50 |
| stelo.MyAgileRobot 0.2 | 13 | 8% | 18 |
| bayen.UbaMicro 1.4 | 11 | 7% | 25 |
| m3thos.Eva00 1.1 | 4 | 2% | 15 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.6 | 132 / 420 | 2.38 | 19.5% | 87852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 20.0% | 256 |
| hadur117.micro.SaorW 0.1 | 1.7 | 19.5% | 132 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 20 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 9 |
| ayk.WallHugger 1.0 | 4.8 | 9.1% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 78.4 | 11 / 35 | 6649 |
| 2 | 2 | 70.9 | 86.3 | 8 / 35 | 7383 |
| 3 | 1 | 71.5 | 88.6 | 15 / 35 | 7075 |
| 4 | 2 | 71.6 | 86.7 | 12 / 35 | 8001 |
| 5 | 2 | 69.0 | 81.6 | 7 / 35 | 6936 |
| 6 | 1 | 71.1 | 84.1 | 12 / 35 | 7782 |
| 7 | 1 | 71.1 | 87.0 | 13 / 35 | 7467 |
| 8 | 1 | 71.1 | 87.0 | 14 / 35 | 7430 |
| 9 | 2 | 70.3 | 85.4 | 10 / 35 | 7300 |
| 10 | 2 | 68.2 | 78.4 | 8 / 35 | 6861 |
| 11 | 2 | 70.9 | 85.7 | 11 / 35 | 7367 |
| 12 | 2 | 71.0 | 86.3 | 11 / 35 | 7601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 228 | 26% |
| mz.NanoGod 2.02 | 31 | 74% |
| exauge.GateKeeper 1.1.121g | 20 | 80% |
| drd.Dreadknoght 0.9 | 11 | 100% |
| ayk.WallHugger 1.0 | 10 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 288 of 420 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 215 | 75% | 282 |
| mz.NanoGod 2.02 | 40 | 14% | 72 |
| exauge.GateKeeper 1.1.121g | 17 | 6% | 28 |
| ayk.WallHugger 1.0 | 12 | 4% | 19 |
| stelo.PianistNano 1.2 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 0% | 6 |
| stuff.Vlad 0.1 | 1 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.2 | 214 / 420 | 3.68 | 16.1% | 55499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.1 | 16.1% | 214 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.2% | 35 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.7% | 40 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 35 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 13 |
| conscience.Electron 1.3g | 7.2 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 24 |
| dl.BetterWalls 1.0 | 8.8 | 6.9% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 68.9 | 17 / 35 | 4621 |
| 2 | 1 | 67.1 | 80.6 | 22 / 35 | 4852 |
| 3 | 2 | 60.7 | 61.6 | 15 / 35 | 4173 |
| 4 | 1 | 65.1 | 74.6 | 18 / 35 | 4726 |
| 5 | 1 | 65.2 | 75.2 | 20 / 35 | 4404 |
| 6 | 1 | 63.9 | 68.6 | 17 / 35 | 4765 |
| 7 | 1 | 63.7 | 69.8 | 16 / 35 | 4560 |
| 8 | 1 | 62.5 | 63.5 | 15 / 35 | 4880 |
| 9 | 1 | 64.9 | 73.0 | 21 / 35 | 4617 |
| 10 | 1 | 60.9 | 60.3 | 14 / 35 | 4401 |
| 11 | 1 | 62.6 | 66.3 | 17 / 35 | 4374 |
| 12 | 1 | 67.2 | 80.0 | 22 / 35 | 5126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 82 | 99% |
| dummy.micro.Sparrow 2.5 | 53 | 89% |
| bvh.micro.Freya 0.3 | 39 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 90% |
| stelo.MirrorMicro 1.0 | 16 | 88% |
| ap.Frederick 1.1 | 10 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 207 of 420 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 35 | 17% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 35 | 17% | 34 |
| voidious.micro.BlitzBat 1.05 | 32 | 15% | 93 |
| dummy.micro.Sparrow 2.5 | 31 | 15% | 80 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 11% | 58 |
| bvh.micro.Freya 0.3 | 23 | 11% | 48 |
| dl.BetterWalls 1.0 | 16 | 8% | 26 |
| stelo.MirrorMicro 1.0 | 11 | 5% | 38 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 88.6 | 317 / 420 | 2.03 | 21.3% | 81737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 21.3% | 317 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 33 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 18 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.9% | 12 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 10 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 14 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 7 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 8 |
| sample.Corners 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 84.4 | 25 / 35 | 6277 |
| 2 | 1 | 73.0 | 91.7 | 28 / 35 | 7642 |
| 3 | 1 | 70.1 | 81.3 | 23 / 35 | 6899 |
| 4 | 1 | 71.1 | 88.6 | 26 / 35 | 6742 |
| 5 | 1 | 72.4 | 92.7 | 30 / 35 | 6817 |
| 6 | 1 | 73.0 | 94.6 | 26 / 35 | 7485 |
| 7 | 1 | 70.9 | 85.7 | 26 / 35 | 6523 |
| 8 | 1 | 71.0 | 89.8 | 26 / 35 | 6508 |
| 9 | 1 | 70.2 | 84.1 | 24 / 35 | 6635 |
| 10 | 1 | 72.4 | 91.1 | 30 / 35 | 6819 |
| 11 | 1 | 72.4 | 90.2 | 27 / 35 | 6969 |
| 12 | 1 | 71.2 | 88.6 | 26 / 35 | 6421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 116 | 92% |
| sul.Lunar 1.1 | 90 | 97% |
| supersample.SuperBoxBot 1.0 | 53 | 94% |
| dsw.StaticD 1.0 | 23 | 74% |
| sample.MyFirstJuniorRobot 1.0 | 18 | 78% |
| sample.MyFirstRobot 1.0 | 17 | 100% |
| mme.NikeEnhanced 2.0 | 14 | 93% |
| sample.Corners 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |

Hadur died in 105 of 420 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 29 | 28% | 121 |
| supersample.SuperBoxBot 1.0 | 24 | 23% | 73 |
| dsw.StaticD 1.0 | 24 | 23% | 52 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 7% | 25 |
| mme.NikeEnhanced 2.0 | 7 | 7% | 22 |
| sul.Lunar 1.1 | 5 | 5% | 88 |
| sample.MyFirstRobot 1.0 | 5 | 5% | 23 |
| sample.Corners 1.0 | 1 | 1% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 7 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 78.6 | 236 / 420 | 2.92 | 18.2% | 74199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 18.2% | 236 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 65 |
| mld.Wisdom 1.0 | 3.2 | 12.3% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.4 | 10.8% | 28 |
| KiraNL.Chupacabra 0.4 | 5.1 | 10.4% | 19 |
| amz.NanoClone 1.41 | 5.1 | 10.4% | 13 |
| sample.Walls 1.0 | 7.0 | 8.0% | 15 |
| GarmBox.Oranges 1.0 | 8.3 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 7 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.3 | 19 / 35 | 6308 |
| 2 | 1 | 65.8 | 72.1 | 18 / 35 | 5996 |
| 3 | 1 | 70.7 | 87.9 | 26 / 35 | 6662 |
| 4 | 1 | 67.1 | 79.4 | 18 / 35 | 5765 |
| 5 | 1 | 65.1 | 71.1 | 18 / 35 | 5769 |
| 6 | 1 | 68.6 | 80.0 | 22 / 35 | 6466 |
| 7 | 1 | 64.4 | 66.7 | 14 / 35 | 6067 |
| 8 | 1 | 69.0 | 87.3 | 18 / 35 | 6015 |
| 9 | 1 | 67.9 | 80.0 | 20 / 35 | 6313 |
| 10 | 1 | 66.3 | 73.7 | 18 / 35 | 6000 |
| 11 | 1 | 67.7 | 79.7 | 20 / 35 | 6158 |
| 12 | 1 | 70.1 | 85.4 | 25 / 35 | 6680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 81 | 93% |
| radnor.DoctorBob 1.42 | 67 | 75% |
| mld.Wisdom 1.0 | 40 | 75% |
| amz.NanoClone 1.41 | 28 | 93% |
| KiraNL.Chupacabra 0.4 | 24 | 75% |
| jangs.ns51 1.0 | 12 | 92% |
| sample.Walls 1.0 | 11 | 100% |
| GarmBox.Oranges 1.0 | 8 | 100% |
| sample.Target 1.0 | 7 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 53 | 29% | 90 |
| radnor.DoctorBob 1.42 | 35 | 19% | 98 |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 18% | 110 |
| KiraNL.Chupacabra 0.4 | 25 | 14% | 41 |
| amz.NanoClone 1.41 | 20 | 11% | 30 |
| GarmBox.Oranges 1.0 | 7 | 4% | 13 |
| jangs.ns51 1.0 | 6 | 3% | 13 |
| sample.Walls 1.0 | 5 | 3% | 20 |

