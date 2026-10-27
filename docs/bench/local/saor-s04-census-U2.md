# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 90.2 | 307 / 420 | 1.88 | 21.6% | 85515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 21.6% | 307 |
| radnor.DoctorBob 1.42 | 2.4 | 14.1% | 35 |
| mz.AntiGrav 1.0 | 3.0 | 13.6% | 30 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 35 |
| amz.NanoClone 1.41 | 4.9 | 10.1% | 12 |
| sample.Walls 1.0 | 6.4 | 7.2% | 4 |
| GarmBox.Oranges 1.0 | 6.6 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.1 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.6 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 94.6 | 28 / 35 | 6943 |
| 2 | 1 | 72.7 | 91.7 | 26 / 35 | 7241 |
| 3 | 1 | 73.1 | 95.6 | 28 / 35 | 7059 |
| 4 | 1 | 73.4 | 92.7 | 28 / 35 | 7264 |
| 5 | 1 | 70.6 | 84.4 | 23 / 35 | 6507 |
| 6 | 1 | 72.5 | 88.9 | 26 / 35 | 7397 |
| 7 | 1 | 71.6 | 87.3 | 22 / 35 | 7233 |
| 8 | 1 | 71.7 | 86.7 | 25 / 35 | 7179 |
| 9 | 1 | 71.8 | 86.3 | 23 / 35 | 7595 |
| 10 | 1 | 72.5 | 92.1 | 26 / 35 | 6752 |
| 11 | 1 | 72.2 | 87.6 | 23 / 35 | 7118 |
| 12 | 1 | 73.3 | 94.9 | 29 / 35 | 7227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 127 | 98% |
| radnor.DoctorBob 1.42 | 95 | 86% |
| mld.Infinity 2.2 | 77 | 87% |
| amz.NanoClone 1.41 | 14 | 71% |
| jangs.ns51 1.0 | 10 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 116 of 420 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 39% | 161 |
| amz.NanoClone 1.41 | 19 | 16% | 35 |
| mld.Infinity 2.2 | 19 | 16% | 33 |
| mz.AntiGrav 1.0 | 14 | 12% | 136 |
| sample.Walls 1.0 | 12 | 10% | 23 |
| GarmBox.Oranges 1.0 | 4 | 3% | 8 |
| arthord.MannyPacquiao Beta | 2 | 2% | 7 |
| jangs.ns51 1.0 | 0 | 0% | 9 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.4 | 277 / 420 | 2.13 | 19.0% | 61351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.2 | 19.0% | 277 |
| oog.melee.Mercutio 1.0 | 1.9 | 14.9% | 98 |
| mld.DustBunny 3.8 | 2.9 | 13.5% | 20 |
| maribo.melee.BMV 0.1 | 4.4 | 10.1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 6 |
| zyx.nano.Ant 1.1 | 7.3 | 7.4% | 1 |
| bzdp.BoxCar 2.0 | 8.1 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.2% | 7 |
| cs.Grudge 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.3 | 23 / 35 | 4757 |
| 2 | 1 | 69.2 | 87.9 | 22 / 35 | 5426 |
| 3 | 1 | 70.1 | 91.4 | 27 / 35 | 5286 |
| 4 | 1 | 69.6 | 92.4 | 22 / 35 | 5348 |
| 5 | 1 | 71.4 | 95.2 | 28 / 35 | 5739 |
| 6 | 1 | 69.3 | 89.5 | 26 / 35 | 5118 |
| 7 | 1 | 69.6 | 90.5 | 24 / 35 | 5435 |
| 8 | 1 | 69.3 | 88.6 | 26 / 35 | 4968 |
| 9 | 1 | 70.0 | 91.7 | 24 / 35 | 5140 |
| 10 | 3 | 59.8 | 54.9 | 11 / 35 | 4483 |
| 11 | 1 | 67.2 | 84.4 | 21 / 35 | 4461 |
| 12 | 1 | 70.0 | 94.0 | 23 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 170 | 74% |
| mld.DustBunny 3.8 | 96 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 90% |
| djdjdj.NanoSkunk10 1.0 | 19 | 100% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| fullsail.SweetTea 1.1 | 10 | 90% |
| zyx.nano.Ant 1.1 | 7 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 144 of 420 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 43% | 195 |
| mld.DustBunny 3.8 | 26 | 18% | 99 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 8% | 32 |
| maribo.melee.BMV 0.1 | 10 | 7% | 15 |
| cs.Grudge 1.0 | 10 | 7% | 10 |
| fullsail.SweetTea 1.1 | 9 | 6% | 18 |
| zyx.nano.Ant 1.1 | 8 | 6% | 16 |
| djdjdj.NanoSkunk10 1.0 | 5 | 3% | 28 |
| bzdp.BoxCar 2.0 | 3 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.6 | 294 / 420 | 2.39 | 20.0% | 71353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 20.0% | 294 |
| myl.micro.Troodon 1.10 | 2.1 | 14.0% | 57 |
| myl.nano.KomoriNinja 1.1 | 2.9 | 12.2% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 18 |
| cb.nano.Insomnia 1.0 | 5.4 | 9.5% | 16 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 7 |
| sample.Fire 1.0 | 9.3 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.4 | 23 / 35 | 6130 |
| 2 | 1 | 68.9 | 79.4 | 23 / 35 | 5986 |
| 3 | 1 | 67.1 | 73.7 | 22 / 35 | 5595 |
| 4 | 1 | 71.0 | 88.6 | 26 / 35 | 5783 |
| 5 | 1 | 70.1 | 83.5 | 25 / 35 | 6052 |
| 6 | 1 | 69.0 | 80.6 | 21 / 35 | 5834 |
| 7 | 1 | 71.0 | 88.6 | 28 / 35 | 6064 |
| 8 | 1 | 69.1 | 83.8 | 21 / 35 | 5700 |
| 9 | 1 | 70.9 | 87.0 | 26 / 35 | 6262 |
| 10 | 1 | 71.5 | 90.2 | 25 / 35 | 6300 |
| 11 | 1 | 68.8 | 81.3 | 24 / 35 | 5448 |
| 12 | 1 | 72.5 | 94.0 | 30 / 35 | 6199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 102 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 78 | 92% |
| cb.nano.Insomnia 1.0 | 37 | 95% |
| myl.nano.KomoriNinja 1.1 | 30 | 93% |
| sp.Nanos.Ember 1.1 | 30 | 93% |
| fm.mammillarias 1.3 | 16 | 94% |
| sample.Fire 1.0 | 11 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 126 of 420 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 29 | 23% | 137 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 21% | 76 |
| cb.nano.Insomnia 1.0 | 19 | 15% | 24 |
| myl.nano.KomoriNinja 1.1 | 18 | 14% | 62 |
| fm.mammillarias 1.3 | 14 | 11% | 31 |
| sample.Tracker 1.0 | 6 | 5% | 7 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 41 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 26 |
| sample.Fire 1.0 | 4 | 3% | 13 |

## Melee bench: F04

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.9 | 311 / 420 | 2.09 | 20.9% | 79342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 20.9% | 311 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 34 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.9 | 9.3% | 0 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.4 | 8.9% | 21 |
| yk.JahMicro 1.0 | 6.8 | 8.0% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.5% | 10 |
| repositorio.NanoStep 1.0 | 8.9 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 9.9 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.5 | 28 / 35 | 6402 |
| 2 | 1 | 70.8 | 86.7 | 27 / 35 | 6734 |
| 3 | 1 | 72.2 | 93.7 | 29 / 35 | 6812 |
| 4 | 1 | 69.9 | 82.9 | 24 / 35 | 6711 |
| 5 | 1 | 72.5 | 95.6 | 28 / 35 | 6593 |
| 6 | 1 | 69.5 | 81.6 | 23 / 35 | 6560 |
| 7 | 1 | 71.1 | 90.2 | 26 / 35 | 6626 |
| 8 | 1 | 70.5 | 85.7 | 24 / 35 | 6927 |
| 9 | 1 | 71.0 | 88.3 | 26 / 35 | 6575 |
| 10 | 1 | 71.7 | 93.3 | 27 / 35 | 6374 |
| 11 | 1 | 69.0 | 78.4 | 24 / 35 | 6300 |
| 12 | 1 | 71.3 | 89.5 | 25 / 35 | 6728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 129 | 90% |
| stelo.SoJNanoMelee 1.1 | 79 | 89% |
| tvv.micro.Antares 1.1.1 | 35 | 97% |
| tj.zombie1n 1.0.1 | 28 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 27 | 78% |
| yk.JahMicro 1.0 | 22 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 100% |
| repositorio.NanoStep 1.0 | 11 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 110 of 420 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 43% | 175 |
| stelo.SoJNanoMelee 1.1 | 18 | 16% | 62 |
| Grystrion.RandomTrackerNOREV 1.0 | 14 | 13% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 9% | 39 |
| tvv.micro.Antares 1.1.1 | 9 | 8% | 49 |
| tj.zombie1n 1.0.1 | 7 | 6% | 21 |
| yk.JahMicro 1.0 | 3 | 3% | 19 |
| repositorio.NanoStep 1.0 | 1 | 1% | 19 |
| sample.VelociRobot 1.0 | 1 | 1% | 9 |

## Melee bench: F05

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.6 | 198 / 420 | 3.65 | 16.1% | 57936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 16.1% | 198 |
| oog.melee.Corsair 1.0 | 2.0 | 13.2% | 78 |
| ahf.NanoAndrew .4 | 3.5 | 11.2% | 39 |
| simonton.nano.MeleeSeed 1.8 | 3.9 | 11.2% | 37 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 16 |
| sam.Samspin 1.0 | 6.0 | 9.6% | 29 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 15 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 73.7 | 19 / 35 | 5377 |
| 2 | 1 | 62.9 | 65.7 | 19 / 35 | 4614 |
| 3 | 1 | 61.2 | 62.9 | 15 / 35 | 4522 |
| 4 | 1 | 63.6 | 68.9 | 17 / 35 | 4874 |
| 5 | 1 | 60.8 | 62.9 | 13 / 35 | 4306 |
| 6 | 1 | 62.7 | 67.0 | 15 / 35 | 4912 |
| 7 | 1 | 65.8 | 77.8 | 19 / 35 | 4807 |
| 8 | 1 | 66.7 | 81.3 | 17 / 35 | 5170 |
| 9 | 1 | 63.8 | 70.2 | 16 / 35 | 4927 |
| 10 | 1 | 63.8 | 70.2 | 14 / 35 | 4699 |
| 11 | 1 | 66.5 | 78.4 | 18 / 35 | 5244 |
| 12 | 1 | 63.1 | 68.6 | 16 / 35 | 4484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 63 | 90% |
| oog.melee.Corsair 1.0 | 61 | 54% |
| ahf.NanoAndrew .4 | 47 | 91% |
| EBBU.Sim2 1.02 | 26 | 100% |
| sam.Samspin 1.0 | 14 | 86% |
| zyx.nano.BacillusComma 1.0 | 12 | 100% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| sample.TrackFire 1.0 | 6 | 83% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 224 of 420 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 50 | 22% | 94 |
| simonton.nano.MeleeSeed 1.8 | 39 | 17% | 93 |
| EBBU.Sim2 1.02 | 27 | 12% | 45 |
| bwbaugh.nano.Tirunculus 0.0.0a | 27 | 12% | 29 |
| robar.nano.Assertive_Melee 0.2 | 26 | 12% | 30 |
| ahf.NanoAndrew .4 | 22 | 10% | 71 |
| zyx.nano.BacillusComma 1.0 | 21 | 9% | 29 |
| sam.Samspin 1.0 | 7 | 3% | 18 |
| sample.TrackFire 1.0 | 5 | 2% | 10 |

## Melee bench: F06

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.6 | 284 / 420 | 2.20 | 19.2% | 62661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 19.2% | 284 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 42 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.1% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.2% | 37 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.5% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.9 | 8.8% | 10 |
| fm.claire 1.7 | 6.4 | 8.3% | 2 |
| sample.SpinBot 1.0 | 8.0 | 6.7% | 8 |
| pa.Improved 1.0 | 9.3 | 6.0% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 26 / 35 | 5544 |
| 2 | 1 | 69.8 | 90.5 | 24 / 35 | 5484 |
| 3 | 1 | 66.8 | 83.5 | 21 / 35 | 4702 |
| 4 | 1 | 70.5 | 93.3 | 25 / 35 | 5276 |
| 5 | 1 | 68.2 | 84.4 | 24 / 35 | 4958 |
| 6 | 1 | 67.3 | 80.6 | 21 / 35 | 5065 |
| 7 | 1 | 71.3 | 91.7 | 28 / 35 | 6048 |
| 8 | 1 | 69.1 | 83.8 | 25 / 35 | 5499 |
| 9 | 1 | 69.4 | 89.8 | 24 / 35 | 5279 |
| 10 | 1 | 68.5 | 87.6 | 23 / 35 | 5087 |
| 11 | 1 | 69.1 | 87.6 | 25 / 35 | 5186 |
| 12 | 1 | 65.1 | 77.8 | 18 / 35 | 4533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 135 | 92% |
| oog.melee.CapuletDroid 1.1 | 77 | 86% |
| gh.nano.Grofvuil 0.2 | 43 | 74% |
| arthord.NanoSatanMelee Beta | 22 | 100% |
| winamp32.micro.MicroMacro 1.0 | 14 | 64% |
| sample.SpinBot 1.0 | 14 | 100% |
| fm.claire 1.7 | 7 | 100% |
| kurios.DOSexe .9b | 7 | 57% |
| pa.Improved 1.0 | 6 | 100% |

Hadur died in 139 of 420 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 31 | 22% | 38 |
| d414.nano.Quantum 1.0.0 | 26 | 19% | 130 |
| gh.nano.Grofvuil 0.2 | 24 | 17% | 85 |
| arthord.NanoSatanMelee Beta | 20 | 14% | 53 |
| winamp32.micro.MicroMacro 1.0 | 11 | 8% | 35 |
| kurios.DOSexe .9b | 8 | 6% | 28 |
| sample.SpinBot 1.0 | 8 | 6% | 19 |
| fm.claire 1.7 | 8 | 6% | 15 |
| pa.Improved 1.0 | 2 | 1% | 12 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.4 | 199 / 420 | 2.68 | 18.0% | 65965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.1 | 18.0% | 199 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.0% | 92 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.5% | 45 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 62 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 12 |
| caimano.Furia_Ceca 0.22 | 6.4 | 7.6% | 3 |
| acogdev.alpha 0.2 | 7.4 | 6.6% | 3 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 73.3 | 14 / 35 | 4562 |
| 2 | 1 | 66.0 | 78.7 | 14 / 35 | 5072 |
| 3 | 1 | 68.9 | 82.9 | 22 / 35 | 5865 |
| 4 | 1 | 66.8 | 77.8 | 11 / 35 | 5838 |
| 5 | 1 | 67.6 | 81.0 | 17 / 35 | 5572 |
| 6 | 1 | 68.3 | 84.8 | 16 / 35 | 5885 |
| 7 | 1 | 67.2 | 80.0 | 21 / 35 | 5072 |
| 8 | 1 | 66.7 | 80.3 | 13 / 35 | 5304 |
| 9 | 1 | 68.8 | 86.0 | 16 / 35 | 5705 |
| 10 | 1 | 70.8 | 90.8 | 24 / 35 | 5970 |
| 11 | 1 | 65.8 | 76.8 | 12 / 35 | 5605 |
| 12 | 1 | 68.5 | 84.1 | 19 / 35 | 5515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 103 | 89% |
| mz.MicroGodMelee 1 | 90 | 56% |
| gh.micro.Gruweltje 0.7 | 69 | 28% |
| DBall.Anarchy 0.1 | 23 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 221 of 420 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 78 | 35% | 116 |
| mz.MicroGodMelee 1 | 68 | 31% | 123 |
| spinnercat.micro.Tyger 0.1 | 39 | 18% | 107 |
| DBall.Anarchy 0.1 | 10 | 5% | 25 |
| acogdev.alpha 0.2 | 8 | 4% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 3% | 11 |
| fire219.CatBot 1.0 | 6 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 13 |
| el.JumpShoot 0.2 | 3 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.4 | 221 / 420 | 3.58 | 16.7% | 63851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.2 | 16.7% | 221 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.6% | 70 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 62 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 14 |
| germ.TheMind .2 | 5.0 | 9.5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 14 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.3% | 11 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 10 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 68.3 | 17 / 35 | 5351 |
| 2 | 2 | 59.9 | 57.8 | 14 / 35 | 4626 |
| 3 | 1 | 68.6 | 80.6 | 25 / 35 | 5897 |
| 4 | 1 | 65.3 | 71.4 | 20 / 35 | 5288 |
| 5 | 2 | 66.0 | 76.2 | 16 / 35 | 5235 |
| 6 | 1 | 66.2 | 72.7 | 18 / 35 | 5772 |
| 7 | 1 | 63.7 | 66.3 | 17 / 35 | 5079 |
| 8 | 1 | 66.0 | 76.8 | 21 / 35 | 4929 |
| 9 | 1 | 66.6 | 76.2 | 18 / 35 | 5597 |
| 10 | 1 | 62.0 | 61.3 | 15 / 35 | 5343 |
| 11 | 1 | 65.7 | 70.8 | 19 / 35 | 5512 |
| 12 | 1 | 66.7 | 78.1 | 21 / 35 | 5222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 152 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 44 | 80% |
| qualidafial.MajorDick 1.0.1 | 16 | 88% |
| germ.TheMind .2 | 11 | 91% |
| awesomeness.Elite 1.0 | 11 | 82% |
| stelo.UntouchableNano 1.3 | 10 | 100% |
| lrem.micro.MoggFanatic 0.2 | 9 | 100% |
| sample.Crazy 1.0 | 8 | 100% |

Hadur died in 199 of 420 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 97 | 49% | 201 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 16% | 66 |
| awesomeness.Elite 1.0 | 20 | 10% | 36 |
| qualidafial.MajorDick 1.0.1 | 14 | 7% | 27 |
| germ.TheMind .2 | 12 | 6% | 29 |
| lrem.micro.MoggFanatic 0.2 | 10 | 5% | 23 |
| stelo.UntouchableNano 1.3 | 9 | 5% | 16 |
| mym.EdgeStalker 1.0 | 5 | 3% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 10 |

## Melee bench: F09

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.9 | 312 / 420 | 2.00 | 20.0% | 59863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 20.0% | 312 |
| rz.HawkOnFire 0.1 | 2.1 | 13.5% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 25 |
| maribo.IotaCT 1.1 | 4.4 | 10.6% | 21 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.3% | 3 |
| spinnercat.Omen 1.0 | 7.6 | 8.1% | 7 |
| ratosh.Wesco 1.4 | 7.9 | 7.9% | 2 |
| stelo.PatternRobot 1.0 | 7.9 | 7.9% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 23 / 35 | 4748 |
| 2 | 1 | 70.9 | 90.8 | 27 / 35 | 4910 |
| 3 | 1 | 70.6 | 91.1 | 27 / 35 | 4976 |
| 4 | 1 | 69.3 | 84.4 | 24 / 35 | 5097 |
| 5 | 1 | 70.0 | 88.9 | 26 / 35 | 4757 |
| 6 | 1 | 67.8 | 80.3 | 22 / 35 | 4635 |
| 7 | 1 | 72.4 | 94.3 | 28 / 35 | 5638 |
| 8 | 1 | 72.5 | 94.9 | 32 / 35 | 5221 |
| 9 | 1 | 72.5 | 97.1 | 30 / 35 | 5199 |
| 10 | 1 | 70.7 | 90.2 | 27 / 35 | 5079 |
| 11 | 1 | 68.4 | 83.2 | 22 / 35 | 4509 |
| 12 | 1 | 69.6 | 86.3 | 24 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 136 | 97% |
| nz.jdc.nano.GridFu 1.0 | 71 | 99% |
| timmit.nano.TimDog 0.33 | 31 | 87% |
| maribo.IotaCT 1.1 | 30 | 77% |
| stelo.PatternRobot 1.0 | 27 | 96% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 100% |
| spinnercat.Omen 1.0 | 11 | 100% |
| ratosh.Wesco 1.4 | 10 | 100% |

Hadur died in 108 of 420 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 26 | 24% | 59 |
| rz.HawkOnFire 0.1 | 25 | 23% | 112 |
| nz.jdc.nano.GridFu 1.0 | 17 | 16% | 98 |
| stelo.PatternRobot 1.0 | 13 | 12% | 31 |
| maribo.IotaCT 1.1 | 12 | 11% | 50 |
| ratosh.Wesco 1.4 | 7 | 6% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 20 |
| spinnercat.Omen 1.0 | 2 | 2% | 18 |

## Melee bench: F10

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.0 | 352 / 420 | 1.72 | 21.6% | 77067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 21.6% | 352 |
| tvv.nano.Polaris 1.2 | 2.6 | 11.7% | 26 |
| baal.nano.N 1.42 | 2.6 | 11.5% | 9 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.8 | 9.0% | 12 |
| squidM.TentalceMeleeNano 1.1 | 6.4 | 8.6% | 3 |
| sanja.First 0.1 | 6.8 | 8.2% | 2 |
| cvt.Firsty 1.0 | 7.6 | 7.4% | 12 |
| amk.Punbot.Punbot 0.01 | 8.1 | 7.1% | 2 |
| sample.RamFire 1.0 | 9.9 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.6 | 30 / 35 | 6704 |
| 2 | 1 | 71.6 | 90.5 | 28 / 35 | 6509 |
| 3 | 1 | 71.2 | 91.7 | 31 / 35 | 5960 |
| 4 | 1 | 72.8 | 96.2 | 33 / 35 | 6503 |
| 5 | 1 | 71.0 | 87.6 | 26 / 35 | 6561 |
| 6 | 1 | 69.0 | 88.3 | 26 / 35 | 5310 |
| 7 | 1 | 71.1 | 88.9 | 28 / 35 | 6557 |
| 8 | 1 | 71.9 | 93.3 | 31 / 35 | 6551 |
| 9 | 1 | 72.0 | 94.3 | 30 / 35 | 6587 |
| 10 | 1 | 72.6 | 95.2 | 32 / 35 | 6771 |
| 11 | 1 | 71.1 | 88.9 | 27 / 35 | 6442 |
| 12 | 1 | 72.3 | 94.6 | 30 / 35 | 6612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 80 | 94% |
| baal.nano.N 1.42 | 79 | 99% |
| cvt.Firsty 1.0 | 57 | 91% |
| sanja.First 0.1 | 43 | 98% |
| zyx.micro.Ant 1.1 | 33 | 97% |
| Grystrion.TrackerWO 1.0 | 32 | 100% |
| amk.Punbot.Punbot 0.01 | 25 | 100% |
| squidM.TentalceMeleeNano 1.1 | 12 | 92% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 68 of 420 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 16 | 24% | 78 |
| tvv.nano.Polaris 1.2 | 15 | 22% | 112 |
| cvt.Firsty 1.0 | 8 | 12% | 36 |
| sample.RamFire 1.0 | 8 | 12% | 12 |
| baal.nano.N 1.42 | 7 | 10% | 70 |
| Grystrion.TrackerWO 1.0 | 7 | 10% | 32 |
| sanja.First 0.1 | 3 | 4% | 42 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 21 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 9 |

## Melee bench: F11

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.8 | 144 / 420 | 3.90 | 15.1% | 59477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.4% | 152 |
| hadur117.micro.SaorU2 0.1 | 1.8 | 15.1% | 144 |
| cs.Wren 1.0 | 3.1 | 12.7% | 42 |
| mz.Cork 0.1 | 4.3 | 11.3% | 24 |
| js.PinBall 1.6 | 4.4 | 11.2% | 32 |
| joe.ADinosaur 1.0 | 6.3 | 8.9% | 1 |
| evd.X1 0.01 | 6.7 | 8.2% | 8 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 9 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 9 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 67.6 | 11 / 35 | 4983 |
| 2 | 3 | 59.1 | 58.4 | 9 / 35 | 4583 |
| 3 | 1 | 64.8 | 73.0 | 15 / 35 | 5327 |
| 4 | 2 | 63.6 | 71.7 | 13 / 35 | 5035 |
| 5 | 1 | 63.3 | 71.1 | 13 / 35 | 4825 |
| 6 | 2 | 63.3 | 67.3 | 12 / 35 | 5276 |
| 7 | 2 | 62.0 | 67.3 | 10 / 35 | 4996 |
| 8 | 1 | 61.9 | 64.8 | 13 / 35 | 5051 |
| 9 | 3 | 59.2 | 60.0 | 11 / 35 | 4256 |
| 10 | 2 | 62.4 | 67.6 | 11 / 35 | 4826 |
| 11 | 1 | 63.2 | 69.8 | 11 / 35 | 5155 |
| 12 | 1 | 65.2 | 74.9 | 15 / 35 | 5164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 140 | 50% |
| cs.Wren 1.0 | 37 | 86% |
| js.PinBall 1.6 | 20 | 65% |
| mz.Cork 0.1 | 12 | 92% |
| joe.ADinosaur 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 7 | 71% |
| jsal.Jsalbot 1.0 | 6 | 100% |

Hadur died in 276 of 420 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 136 | 49% | 213 |
| js.PinBall 1.6 | 34 | 12% | 53 |
| evd.X1 0.01 | 24 | 9% | 25 |
| joe.ADinosaur 1.0 | 23 | 8% | 26 |
| cs.Wren 1.0 | 19 | 7% | 36 |
| PSW.Relentless 0.1 | 15 | 5% | 15 |
| mz.Cork 0.1 | 12 | 4% | 25 |
| jsal.Jsalbot 1.0 | 9 | 3% | 18 |
| donjezza.Jezza 1.0 | 4 | 1% | 9 |

## Melee bench: F12

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.6 | 269 / 420 | 2.39 | 19.0% | 58339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 19.0% | 269 |
| ntc.Opposite 1.5 | 3.3 | 11.2% | 17 |
| myl.nano.Graviton 1.10 | 3.4 | 11.1% | 38 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 10.8% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 3.9 | 10.4% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.6 | 9.7% | 9 |
| disan.Chair 2.2.0 | 6.9 | 8.7% | 18 |
| DBall.NUKE 0.1 | 7.9 | 7.9% | 9 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 13 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.2 | 24 / 35 | 4778 |
| 2 | 1 | 69.1 | 87.9 | 26 / 35 | 4744 |
| 3 | 1 | 67.8 | 84.1 | 19 / 35 | 4794 |
| 4 | 1 | 67.2 | 82.2 | 20 / 35 | 4474 |
| 5 | 1 | 67.6 | 81.3 | 21 / 35 | 4958 |
| 6 | 1 | 67.4 | 81.9 | 23 / 35 | 4758 |
| 7 | 1 | 68.3 | 86.3 | 20 / 35 | 4697 |
| 8 | 1 | 69.3 | 87.0 | 27 / 35 | 4719 |
| 9 | 1 | 68.6 | 83.2 | 24 / 35 | 5255 |
| 10 | 1 | 70.8 | 91.7 | 25 / 35 | 5628 |
| 11 | 1 | 67.3 | 83.5 | 20 / 35 | 4750 |
| 12 | 1 | 67.6 | 83.2 | 20 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 75 | 89% |
| myl.nano.Graviton 1.10 | 59 | 80% |
| ntc.Opposite 1.5 | 41 | 90% |
| disan.Chair 2.2.0 | 36 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 35 | 91% |
| DBall.NUKE 0.1 | 26 | 100% |
| donjezza.Muncho 1.0 | 17 | 65% |
| pfvicm.Sobieski 7.2.3b | 16 | 88% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 156 of 420 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 19% | 75 |
| pfvicm.Sobieski 7.2.3b | 30 | 19% | 52 |
| myl.nano.Graviton 1.10 | 25 | 16% | 69 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 13% | 60 |
| ntc.Opposite 1.5 | 18 | 12% | 48 |
| disan.Chair 2.2.0 | 18 | 12% | 37 |
| donjezza.Muncho 1.0 | 9 | 6% | 23 |
| pbg.R2D2 1.0 | 4 | 3% | 21 |
| DBall.NUKE 0.1 | 2 | 1% | 28 |

## Melee bench: F13

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.5 | 177 / 420 | 3.47 | 15.8% | 52234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.3 | 15.8% | 177 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.7% | 68 |
| oog.melee.Capulet 1.2 | 2.7 | 13.8% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 48 |
| yagami.Tidus 0.11 | 4.8 | 11.9% | 22 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 27 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 18 / 35 | 4527 |
| 2 | 3 | 62.5 | 66.3 | 15 / 35 | 3679 |
| 3 | 1 | 65.1 | 74.3 | 14 / 35 | 4616 |
| 4 | 1 | 61.8 | 66.0 | 14 / 35 | 4124 |
| 5 | 2 | 62.9 | 68.9 | 12 / 35 | 3942 |
| 6 | 1 | 65.4 | 74.9 | 14 / 35 | 4337 |
| 7 | 2 | 64.1 | 67.3 | 14 / 35 | 4576 |
| 8 | 1 | 64.6 | 70.8 | 14 / 35 | 4474 |
| 9 | 1 | 66.7 | 78.4 | 15 / 35 | 4751 |
| 10 | 1 | 63.9 | 71.1 | 14 / 35 | 4424 |
| 11 | 1 | 65.3 | 74.6 | 19 / 35 | 4530 |
| 12 | 1 | 64.5 | 74.0 | 14 / 35 | 4254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 68 | 62% |
| kawigi.micro.Shiz 1.1 | 59 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 68% |
| yagami.Tidus 0.11 | 32 | 91% |
| ejb.Polaris 1.0.1 | 19 | 68% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| kurios.DOSexe .9a | 1 | 0% |

Hadur died in 244 of 420 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 96 | 39% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 16% | 73 |
| yagami.Tidus 0.11 | 36 | 15% | 61 |
| ejb.Polaris 1.0.1 | 25 | 10% | 48 |
| kawigi.micro.Shiz 1.1 | 20 | 8% | 55 |
| step.nanoPri 1.0 | 11 | 5% | 14 |
| kurios.DOSexe .9a | 9 | 4% | 9 |
| stelo.MirrorNano 1.3 | 8 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.9 | 283 / 420 | 2.45 | 18.4% | 55843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 18.4% | 283 |
| bzdp.Pansy 2.1 | 2.6 | 11.9% | 32 |
| wee.Gem 1.8.4 | 3.4 | 11.5% | 40 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 29 |
| ratosh.Nobo 0.21 | 4.6 | 10.7% | 14 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 6 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 23 / 35 | 4957 |
| 2 | 1 | 70.9 | 95.2 | 28 / 35 | 5183 |
| 3 | 1 | 64.2 | 70.8 | 19 / 35 | 4652 |
| 4 | 1 | 66.4 | 82.2 | 22 / 35 | 4508 |
| 5 | 1 | 70.1 | 92.7 | 28 / 35 | 4834 |
| 6 | 1 | 67.8 | 82.9 | 26 / 35 | 4394 |
| 7 | 1 | 68.2 | 84.8 | 26 / 35 | 4914 |
| 8 | 1 | 67.5 | 83.8 | 22 / 35 | 4763 |
| 9 | 1 | 65.9 | 80.6 | 21 / 35 | 4317 |
| 10 | 1 | 67.3 | 83.8 | 24 / 35 | 4367 |
| 11 | 1 | 65.2 | 75.9 | 21 / 35 | 4341 |
| 12 | 1 | 67.7 | 84.8 | 23 / 35 | 4613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 95 | 95% |
| wee.Gem 1.8.4 | 90 | 91% |
| wompi.Quokka 1.6 | 43 | 84% |
| ratosh.Nobo 0.21 | 28 | 89% |
| m3thos.Eva00 1.1 | 28 | 96% |
| bayen.UbaMicro 1.4 | 19 | 95% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 137 of 420 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 26 | 19% | 59 |
| ratosh.Nobo 0.21 | 22 | 16% | 46 |
| wee.Gem 1.8.4 | 21 | 15% | 94 |
| jeremyreeder.Vincent 2011.12.09 | 16 | 12% | 25 |
| bzdp.Pansy 2.1 | 13 | 9% | 98 |
| m3thos.Eva00 1.1 | 13 | 9% | 32 |
| maribo.FollowFire 1 | 12 | 9% | 18 |
| stelo.MyAgileRobot 0.2 | 9 | 7% | 13 |
| bayen.UbaMicro 1.4 | 5 | 4% | 28 |

## Melee bench: F15

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 83.5 | 142 / 420 | 2.49 | 19.6% | 90612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.4 | 19.6% | 142 |
| wompi.Wallaby 5.1 | 1.6 | 19.6% | 245 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 21 |
| ayk.WallHugger 1.0 | 4.6 | 9.4% | 3 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 6 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.2% | 1 |
| sample.SittingDuck 1.0 | 9.1 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 79.0 | 11 / 35 | 7554 |
| 2 | 1 | 71.3 | 86.7 | 12 / 35 | 7565 |
| 3 | 2 | 70.2 | 83.5 | 9 / 35 | 7347 |
| 4 | 2 | 68.3 | 76.2 | 8 / 35 | 7226 |
| 5 | 1 | 71.8 | 84.4 | 14 / 35 | 8157 |
| 6 | 1 | 72.4 | 91.1 | 16 / 35 | 7494 |
| 7 | 1 | 69.7 | 79.0 | 14 / 35 | 7677 |
| 8 | 2 | 69.7 | 82.9 | 11 / 35 | 7032 |
| 9 | 1 | 71.6 | 85.4 | 13 / 35 | 7783 |
| 10 | 1 | 71.6 | 86.0 | 15 / 35 | 7800 |
| 11 | 1 | 72.2 | 89.2 | 10 / 35 | 8254 |
| 12 | 2 | 68.3 | 78.4 | 9 / 35 | 6723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 235 | 31% |
| mz.NanoGod 2.02 | 39 | 85% |
| exauge.GateKeeper 1.1.121g | 18 | 94% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 282 of 420 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 203 | 72% | 281 |
| mz.NanoGod 2.02 | 38 | 13% | 75 |
| ayk.WallHugger 1.0 | 19 | 7% | 23 |
| exauge.GateKeeper 1.1.121g | 11 | 4% | 18 |
| stuff.Vlad 0.1 | 6 | 2% | 10 |
| stelo.PianistNano 1.2 | 5 | 2% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.3 | 231 / 420 | 3.40 | 16.9% | 58305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 16.9% | 231 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 35 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.5% | 36 |
| bvh.micro.Freya 0.3 | 3.6 | 11.3% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.4% | 32 |
| stelo.MirrorMicro 1.0 | 6.1 | 9.2% | 22 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 9 |
| ap.Frederick 1.1 | 8.3 | 7.1% | 18 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.0 | 21 / 35 | 4858 |
| 2 | 1 | 66.1 | 79.7 | 19 / 35 | 4906 |
| 3 | 1 | 64.8 | 73.0 | 19 / 35 | 4687 |
| 4 | 1 | 63.7 | 67.9 | 15 / 35 | 4961 |
| 5 | 1 | 64.6 | 70.5 | 21 / 35 | 4852 |
| 6 | 1 | 65.3 | 70.2 | 19 / 35 | 5173 |
| 7 | 1 | 64.7 | 72.1 | 19 / 35 | 4787 |
| 8 | 1 | 65.4 | 73.0 | 20 / 35 | 5063 |
| 9 | 1 | 65.6 | 74.6 | 21 / 35 | 4928 |
| 10 | 1 | 64.3 | 71.1 | 17 / 35 | 4719 |
| 11 | 1 | 65.6 | 75.2 | 18 / 35 | 4838 |
| 12 | 1 | 66.4 | 78.4 | 22 / 35 | 4533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 91 | 93% |
| dummy.micro.Sparrow 2.5 | 59 | 97% |
| bvh.micro.Freya 0.3 | 36 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 34 | 88% |
| stelo.MirrorMicro 1.0 | 17 | 82% |
| ap.Frederick 1.1 | 10 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 34 | 18% | 29 |
| voidious.micro.BlitzBat 1.05 | 31 | 16% | 93 |
| conscience.Electron 1.3g | 29 | 15% | 42 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 81 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 11% | 65 |
| bvh.micro.Freya 0.3 | 19 | 10% | 35 |
| stelo.MirrorMicro 1.0 | 18 | 9% | 43 |
| dl.BetterWalls 1.0 | 18 | 9% | 28 |

## Melee bench: F17

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 86.9 | 304 / 420 | 2.18 | 21.2% | 84270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 21.2% | 304 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 36 |
| sul.Lunar 1.1 | 3.1 | 11.5% | 26 |
| supersample.SuperBoxBot 1.0 | 4.4 | 10.5% | 19 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 6 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 12 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.5% | 0 |
| sample.Corners 1.0 | 9.0 | 5.5% | 2 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 91.1 | 29 / 35 | 7530 |
| 2 | 1 | 71.8 | 87.9 | 26 / 35 | 7056 |
| 3 | 1 | 72.6 | 89.5 | 26 / 35 | 7779 |
| 4 | 1 | 69.4 | 78.7 | 20 / 35 | 6885 |
| 5 | 1 | 72.8 | 91.1 | 28 / 35 | 7256 |
| 6 | 1 | 70.9 | 87.9 | 25 / 35 | 6558 |
| 7 | 1 | 70.7 | 87.0 | 24 / 35 | 6534 |
| 8 | 1 | 72.5 | 91.1 | 28 / 35 | 7341 |
| 9 | 1 | 71.3 | 86.7 | 24 / 35 | 6863 |
| 10 | 1 | 70.1 | 81.3 | 23 / 35 | 6884 |
| 11 | 1 | 71.3 | 87.6 | 27 / 35 | 6746 |
| 12 | 1 | 70.7 | 83.2 | 24 / 35 | 6838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 94 | 95% |
| sul.Lunar 1.1 | 89 | 98% |
| supersample.SuperBoxBot 1.0 | 46 | 91% |
| mme.NikeEnhanced 2.0 | 23 | 96% |
| dsw.StaticD 1.0 | 20 | 60% |
| sample.MyFirstRobot 1.0 | 19 | 95% |
| tlp.ThreeLeggedPig 1 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 100% |
| sample.Corners 1.0 | 8 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 27% | 60 |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 24% | 127 |
| dsw.StaticD 1.0 | 22 | 18% | 48 |
| mme.NikeEnhanced 2.0 | 13 | 11% | 25 |
| sul.Lunar 1.1 | 11 | 9% | 88 |
| sample.Corners 1.0 | 5 | 4% | 14 |
| tlp.ThreeLeggedPig 1 | 4 | 3% | 12 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 26 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorU2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.7 | 241 / 420 | 2.65 | 18.7% | 75525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU2 0.1 | 1.0 | 18.7% | 241 |
| mld.Wisdom 1.0 | 2.8 | 12.5% | 39 |
| radnor.DoctorBob 1.42 | 2.9 | 12.4% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.2% | 39 |
| KiraNL.Chupacabra 0.4 | 5.1 | 10.4% | 16 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 22 |
| GarmBox.Oranges 1.0 | 7.6 | 7.2% | 0 |
| sample.Walls 1.0 | 7.6 | 7.8% | 11 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.2 | 20 / 35 | 6029 |
| 2 | 1 | 68.8 | 82.5 | 20 / 35 | 6471 |
| 3 | 1 | 69.5 | 85.4 | 21 / 35 | 6583 |
| 4 | 1 | 68.5 | 86.3 | 21 / 35 | 5887 |
| 5 | 1 | 67.2 | 76.5 | 19 / 35 | 6220 |
| 6 | 1 | 69.8 | 87.3 | 22 / 35 | 6591 |
| 7 | 1 | 68.2 | 78.4 | 20 / 35 | 6728 |
| 8 | 1 | 69.2 | 84.1 | 20 / 35 | 6693 |
| 9 | 1 | 69.0 | 86.3 | 23 / 35 | 5847 |
| 10 | 1 | 68.1 | 80.0 | 18 / 35 | 6463 |
| 11 | 1 | 65.8 | 74.6 | 19 / 35 | 5599 |
| 12 | 1 | 66.7 | 76.2 | 18 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 101 | 93% |
| radnor.DoctorBob 1.42 | 61 | 74% |
| mld.Wisdom 1.0 | 44 | 68% |
| amz.NanoClone 1.41 | 24 | 79% |
| KiraNL.Chupacabra 0.4 | 23 | 87% |
| sample.Walls 1.0 | 14 | 100% |
| jangs.ns51 1.0 | 12 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 179 of 420 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 47 | 26% | 80 |
| radnor.DoctorBob 1.42 | 46 | 26% | 97 |
| KiraNL.Chupacabra 0.4 | 28 | 16% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 12% | 115 |
| amz.NanoClone 1.41 | 21 | 12% | 33 |
| GarmBox.Oranges 1.0 | 7 | 4% | 14 |
| sample.Walls 1.0 | 5 | 3% | 19 |
| jangs.ns51 1.0 | 3 | 2% | 12 |

