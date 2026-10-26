# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.8 | 295 / 420 | 2.10 | 21.1% | 84064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 21.1% | 295 |
| radnor.DoctorBob 1.42 | 2.6 | 14.4% | 43 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 36 |
| mld.Infinity 2.2 | 3.9 | 12.3% | 29 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 11 |
| sample.Walls 1.0 | 6.5 | 7.0% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.6 | 6.0% | 5 |
| arthord.MannyPacquiao Beta | 8.7 | 5.0% | 0 |
| sample.Target 1.0 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.6 | 27 / 35 | 7233 |
| 2 | 1 | 73.1 | 92.1 | 29 / 35 | 7301 |
| 3 | 1 | 72.0 | 90.5 | 25 / 35 | 6847 |
| 4 | 1 | 71.0 | 85.1 | 21 / 35 | 6984 |
| 5 | 1 | 71.2 | 84.4 | 21 / 35 | 6915 |
| 6 | 1 | 71.3 | 86.7 | 25 / 35 | 6688 |
| 7 | 1 | 73.9 | 92.4 | 28 / 35 | 7800 |
| 8 | 1 | 72.2 | 86.7 | 23 / 35 | 7262 |
| 9 | 1 | 71.2 | 85.4 | 21 / 35 | 7084 |
| 10 | 1 | 70.9 | 86.7 | 24 / 35 | 6447 |
| 11 | 1 | 70.1 | 83.2 | 24 / 35 | 6479 |
| 12 | 1 | 72.9 | 92.1 | 27 / 35 | 7024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 139 | 96% |
| mld.Infinity 2.2 | 75 | 88% |
| radnor.DoctorBob 1.42 | 72 | 88% |
| jangs.ns51 1.0 | 9 | 89% |
| amz.NanoClone 1.41 | 9 | 89% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 43% | 155 |
| mz.AntiGrav 1.0 | 20 | 16% | 145 |
| mld.Infinity 2.2 | 19 | 15% | 33 |
| amz.NanoClone 1.41 | 16 | 13% | 35 |
| jangs.ns51 1.0 | 9 | 7% | 18 |
| GarmBox.Oranges 1.0 | 4 | 3% | 7 |
| sample.Walls 1.0 | 2 | 2% | 18 |
| arthord.MannyPacquiao Beta | 1 | 1% | 6 |

## Melee bench: F02

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.5 | 252 / 420 | 2.75 | 17.8% | 59232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.4 | 17.8% | 252 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 100 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 27 |
| maribo.melee.BMV 0.1 | 4.1 | 10.4% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 9.2% | 16 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.0% | 18 |
| fullsail.SweetTea 1.1 | 7.6 | 7.3% | 5 |
| bzdp.BoxCar 2.0 | 9.0 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.5 | 23 / 35 | 5274 |
| 2 | 1 | 67.9 | 83.8 | 23 / 35 | 4989 |
| 3 | 1 | 69.0 | 87.6 | 23 / 35 | 5195 |
| 4 | 1 | 68.8 | 89.5 | 23 / 35 | 5232 |
| 5 | 1 | 67.6 | 84.1 | 25 / 35 | 4994 |
| 6 | 1 | 66.8 | 80.6 | 21 / 35 | 4779 |
| 7 | 1 | 69.5 | 88.9 | 26 / 35 | 5371 |
| 8 | 1 | 68.1 | 86.0 | 20 / 35 | 5133 |
| 9 | 1 | 68.4 | 87.6 | 25 / 35 | 4944 |
| 10 | 3 | 58.3 | 53.0 | 11 / 35 | 3899 |
| 11 | 1 | 70.6 | 93.7 | 27 / 35 | 5199 |
| 12 | 4 | 56.9 | 48.9 | 5 / 35 | 4223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 133 | 74% |
| mld.DustBunny 3.8 | 84 | 99% |
| djdjdj.NanoSkunk10 1.0 | 20 | 100% |
| maribo.melee.BMV 0.1 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 100% |
| fullsail.SweetTea 1.1 | 14 | 86% |
| zyx.nano.Ant 1.1 | 4 | 100% |

Hadur died in 171 of 420 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 39% | 162 |
| mld.DustBunny 3.8 | 34 | 20% | 107 |
| cs.Grudge 1.0 | 15 | 9% | 15 |
| fullsail.SweetTea 1.1 | 13 | 8% | 25 |
| maribo.melee.BMV 0.1 | 11 | 6% | 26 |
| zyx.nano.Ant 1.1 | 11 | 6% | 25 |
| djdjdj.NanoSkunk10 1.0 | 10 | 6% | 28 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 4% | 23 |
| bzdp.BoxCar 2.0 | 3 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.9 | 290 / 420 | 2.27 | 20.1% | 70954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 20.1% | 290 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 64 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 11.9% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.5% | 20 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 20 |
| fm.mammillarias 1.3 | 5.4 | 9.5% | 5 |
| cs.sheldor.Talon 1.1 | 6.9 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.1 | 6.8% | 6 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.7 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.6 | 21 / 35 | 5701 |
| 2 | 1 | 70.7 | 90.8 | 26 / 35 | 5610 |
| 3 | 1 | 68.5 | 82.5 | 21 / 35 | 5637 |
| 4 | 1 | 71.7 | 89.8 | 30 / 35 | 6041 |
| 5 | 1 | 68.5 | 75.9 | 23 / 35 | 5944 |
| 6 | 1 | 71.0 | 87.3 | 24 / 35 | 6465 |
| 7 | 1 | 70.2 | 88.6 | 26 / 35 | 5605 |
| 8 | 1 | 69.6 | 85.1 | 21 / 35 | 6041 |
| 9 | 1 | 70.0 | 84.4 | 23 / 35 | 6000 |
| 10 | 1 | 71.1 | 89.8 | 26 / 35 | 6003 |
| 11 | 1 | 71.0 | 90.5 | 27 / 35 | 5807 |
| 12 | 1 | 68.9 | 78.4 | 22 / 35 | 6100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 112 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 71 | 93% |
| myl.nano.KomoriNinja 1.1 | 46 | 87% |
| cb.nano.Insomnia 1.0 | 37 | 78% |
| sp.Nanos.Ember 1.1 | 28 | 96% |
| fm.mammillarias 1.3 | 10 | 100% |
| cs.sheldor.Talon 1.1 | 9 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 130 of 420 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 30 | 23% | 132 |
| myl.nano.KomoriNinja 1.1 | 26 | 20% | 92 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 20% | 67 |
| cb.nano.Insomnia 1.0 | 24 | 18% | 26 |
| fm.mammillarias 1.3 | 7 | 5% | 23 |
| cs.sheldor.Talon 1.1 | 7 | 5% | 21 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 37 |
| sample.Tracker 1.0 | 4 | 3% | 7 |
| sample.Fire 1.0 | 2 | 2% | 8 |

## Melee bench: F04

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 85.4 | 299 / 420 | 2.31 | 20.0% | 74067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 20.0% | 299 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 34 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.7% | 33 |
| tj.zombie1n 1.0.1 | 4.8 | 9.2% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.9% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.6 | 8.8% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 6.9 | 8.0% | 9 |
| yk.JahMicro 1.0 | 7.4 | 7.7% | 8 |
| repositorio.NanoStep 1.0 | 8.9 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.9 | 25 / 35 | 6315 |
| 2 | 1 | 71.6 | 92.7 | 30 / 35 | 6428 |
| 3 | 1 | 71.0 | 91.4 | 28 / 35 | 6051 |
| 4 | 1 | 70.3 | 85.7 | 25 / 35 | 6381 |
| 5 | 1 | 70.3 | 85.7 | 26 / 35 | 6685 |
| 6 | 1 | 70.2 | 86.3 | 26 / 35 | 6294 |
| 7 | 1 | 69.2 | 80.6 | 22 / 35 | 6359 |
| 8 | 1 | 69.4 | 83.8 | 23 / 35 | 5991 |
| 9 | 1 | 68.5 | 79.0 | 23 / 35 | 6056 |
| 10 | 1 | 66.7 | 75.9 | 22 / 35 | 5499 |
| 11 | 1 | 68.8 | 85.1 | 21 / 35 | 5780 |
| 12 | 1 | 71.1 | 90.5 | 28 / 35 | 6228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 125 | 91% |
| stelo.SoJNanoMelee 1.1 | 77 | 96% |
| tvv.micro.Antares 1.1.1 | 37 | 89% |
| tj.zombie1n 1.0.1 | 27 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 26 | 92% |
| yk.JahMicro 1.0 | 17 | 94% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 121 of 420 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 40 | 33% | 163 |
| stelo.SoJNanoMelee 1.1 | 26 | 21% | 67 |
| tj.zombie1n 1.0.1 | 16 | 13% | 22 |
| tvv.micro.Antares 1.1.1 | 13 | 11% | 54 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 9% | 17 |
| yk.JahMicro 1.0 | 6 | 5% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 43 |
| repositorio.NanoStep 1.0 | 2 | 2% | 17 |
| sample.VelociRobot 1.0 | 2 | 2% | 14 |

## Melee bench: F05

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 67.5 | 191 / 420 | 3.93 | 15.5% | 56982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 15.5% | 191 |
| oog.melee.Corsair 1.0 | 2.6 | 12.2% | 59 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 60 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 47 |
| sam.Samspin 1.0 | 5.9 | 9.8% | 23 |
| EBBU.Sim2 1.02 | 6.4 | 9.5% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.6 | 9.3% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.3% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 69.8 | 15 / 35 | 4802 |
| 2 | 1 | 66.4 | 77.8 | 21 / 35 | 4967 |
| 3 | 1 | 62.7 | 63.8 | 18 / 35 | 4791 |
| 4 | 1 | 63.1 | 66.7 | 14 / 35 | 5034 |
| 5 | 1 | 59.9 | 60.3 | 11 / 35 | 4595 |
| 6 | 1 | 62.6 | 67.6 | 16 / 35 | 4573 |
| 7 | 1 | 63.8 | 70.5 | 17 / 35 | 4756 |
| 8 | 1 | 62.1 | 63.2 | 15 / 35 | 4762 |
| 9 | 1 | 66.1 | 76.8 | 18 / 35 | 5245 |
| 10 | 1 | 62.1 | 67.3 | 16 / 35 | 4236 |
| 11 | 1 | 61.3 | 62.2 | 16 / 35 | 4604 |
| 12 | 1 | 61.4 | 63.8 | 14 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 68 | 88% |
| oog.melee.Corsair 1.0 | 55 | 60% |
| ahf.NanoAndrew .4 | 38 | 84% |
| EBBU.Sim2 1.02 | 20 | 95% |
| robar.nano.Assertive_Melee 0.2 | 18 | 89% |
| sam.Samspin 1.0 | 14 | 100% |
| zyx.nano.BacillusComma 1.0 | 11 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 231 of 420 rounds, at a mean tick of 395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 49 | 21% | 104 |
| oog.melee.Corsair 1.0 | 42 | 18% | 79 |
| bwbaugh.nano.Tirunculus 0.0.0a | 30 | 13% | 27 |
| ahf.NanoAndrew .4 | 25 | 11% | 67 |
| robar.nano.Assertive_Melee 0.2 | 25 | 11% | 40 |
| zyx.nano.BacillusComma 1.0 | 23 | 10% | 37 |
| EBBU.Sim2 1.02 | 19 | 8% | 31 |
| sam.Samspin 1.0 | 12 | 5% | 24 |
| sample.TrackFire 1.0 | 5 | 2% | 10 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.7 | 279 / 420 | 2.19 | 19.1% | 61252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 19.1% | 279 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 40 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 10.0% | 42 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 19 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.8% | 5 |
| sample.SpinBot 1.0 | 7.3 | 7.4% | 1 |
| fm.claire 1.7 | 7.4 | 7.6% | 2 |
| pa.Improved 1.0 | 9.2 | 6.1% | 4 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.1 | 19 / 35 | 4465 |
| 2 | 1 | 69.6 | 89.5 | 25 / 35 | 5525 |
| 3 | 1 | 68.5 | 89.5 | 26 / 35 | 4729 |
| 4 | 1 | 70.0 | 90.2 | 27 / 35 | 5345 |
| 5 | 1 | 67.3 | 82.2 | 20 / 35 | 5001 |
| 6 | 1 | 69.3 | 89.8 | 23 / 35 | 5172 |
| 7 | 1 | 70.8 | 93.7 | 28 / 35 | 5217 |
| 8 | 1 | 68.2 | 87.6 | 21 / 35 | 5063 |
| 9 | 1 | 68.5 | 85.7 | 22 / 35 | 5184 |
| 10 | 1 | 70.6 | 91.4 | 25 / 35 | 5707 |
| 11 | 1 | 66.9 | 80.0 | 23 / 35 | 4924 |
| 12 | 1 | 67.2 | 83.2 | 20 / 35 | 4920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 129 | 91% |
| oog.melee.CapuletDroid 1.1 | 69 | 86% |
| gh.nano.Grofvuil 0.2 | 45 | 80% |
| arthord.NanoSatanMelee Beta | 31 | 94% |
| winamp32.micro.MicroMacro 1.0 | 19 | 74% |
| sample.SpinBot 1.0 | 17 | 100% |
| kurios.DOSexe .9b | 6 | 50% |
| pa.Improved 1.0 | 5 | 20% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 142 of 420 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 20% | 145 |
| oog.melee.CapuletDroid 1.1 | 27 | 19% | 35 |
| gh.nano.Grofvuil 0.2 | 24 | 17% | 89 |
| arthord.NanoSatanMelee Beta | 16 | 11% | 37 |
| winamp32.micro.MicroMacro 1.0 | 14 | 10% | 42 |
| pa.Improved 1.0 | 9 | 6% | 14 |
| kurios.DOSexe .9b | 8 | 6% | 24 |
| fm.claire 1.7 | 8 | 6% | 19 |
| sample.SpinBot 1.0 | 6 | 4% | 11 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.4 | 182 / 420 | 2.67 | 18.0% | 66832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.1 | 18.0% | 182 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.1% | 94 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 86 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 13.4% | 40 |
| DBall.Anarchy 0.1 | 5.1 | 8.6% | 7 |
| caimano.Furia_Ceca 0.22 | 6.6 | 7.1% | 1 |
| acogdev.alpha 0.2 | 7.3 | 6.5% | 3 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 4 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 5 |
| fire219.CatBot 1.0 | 9.1 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 16 / 35 | 5461 |
| 2 | 1 | 65.5 | 75.6 | 11 / 35 | 5154 |
| 3 | 1 | 68.8 | 84.8 | 18 / 35 | 5662 |
| 4 | 1 | 68.0 | 86.3 | 18 / 35 | 5034 |
| 5 | 1 | 65.4 | 76.5 | 10 / 35 | 5278 |
| 6 | 1 | 67.9 | 81.0 | 12 / 35 | 6035 |
| 7 | 1 | 67.9 | 84.1 | 17 / 35 | 5503 |
| 8 | 1 | 68.5 | 84.1 | 15 / 35 | 5972 |
| 9 | 1 | 67.5 | 82.9 | 17 / 35 | 5531 |
| 10 | 2 | 64.0 | 69.2 | 10 / 35 | 5420 |
| 11 | 1 | 68.9 | 84.4 | 18 / 35 | 5663 |
| 12 | 1 | 69.0 | 83.8 | 20 / 35 | 6119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 100 | 40% |
| spinnercat.micro.Tyger 0.1 | 83 | 90% |
| gh.micro.Gruweltje 0.7 | 58 | 31% |
| DBall.Anarchy 0.1 | 29 | 100% |
| mbro.Detektor3 0.1.1 | 8 | 100% |
| el.JumpShoot 0.2 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 103 | 43% | 146 |
| gh.micro.Gruweltje 0.7 | 72 | 30% | 105 |
| spinnercat.micro.Tyger 0.1 | 27 | 11% | 82 |
| caimano.Furia_Ceca 0.22 | 9 | 4% | 13 |
| fire219.CatBot 1.0 | 7 | 3% | 9 |
| acogdev.alpha 0.2 | 6 | 3% | 12 |
| DBall.Anarchy 0.1 | 5 | 2% | 26 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 21 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.9 | 216 / 420 | 3.17 | 17.1% | 62118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.2 | 17.1% | 216 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 84 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 58 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.3% | 9 |
| germ.TheMind .2 | 5.0 | 9.3% | 16 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 9 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.6% | 10 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 68.9 | 17 / 35 | 5489 |
| 2 | 1 | 64.1 | 69.8 | 14 / 35 | 5417 |
| 3 | 1 | 63.4 | 69.8 | 17 / 35 | 4709 |
| 4 | 1 | 62.6 | 65.7 | 13 / 35 | 4967 |
| 5 | 1 | 65.9 | 74.0 | 17 / 35 | 5508 |
| 6 | 1 | 66.1 | 76.8 | 17 / 35 | 5094 |
| 7 | 1 | 67.4 | 82.5 | 21 / 35 | 4788 |
| 8 | 1 | 69.6 | 87.0 | 25 / 35 | 5898 |
| 9 | 3 | 63.4 | 68.6 | 15 / 35 | 4774 |
| 10 | 1 | 65.8 | 79.0 | 17 / 35 | 4774 |
| 11 | 1 | 67.6 | 81.6 | 20 / 35 | 5423 |
| 12 | 1 | 68.9 | 87.0 | 23 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 151 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 44 | 80% |
| germ.TheMind .2 | 19 | 95% |
| qualidafial.MajorDick 1.0.1 | 16 | 81% |
| stelo.UntouchableNano 1.3 | 13 | 92% |
| awesomeness.Elite 1.0 | 9 | 89% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 67% |

Hadur died in 204 of 420 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 41% | 195 |
| simonton.nano.WeekendObsession_Melee 1.0 | 50 | 25% | 80 |
| lrem.micro.MoggFanatic 0.2 | 15 | 7% | 22 |
| germ.TheMind .2 | 14 | 7% | 32 |
| stelo.UntouchableNano 1.3 | 14 | 7% | 29 |
| qualidafial.MajorDick 1.0.1 | 11 | 5% | 24 |
| awesomeness.Elite 1.0 | 11 | 5% | 21 |
| mym.EdgeStalker 1.0 | 5 | 2% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 9 |

## Melee bench: F09

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 313 / 420 | 1.89 | 20.0% | 57828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 20.0% | 313 |
| rz.HawkOnFire 0.1 | 2.1 | 13.3% | 37 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 30 |
| maribo.IotaCT 1.1 | 4.3 | 10.9% | 20 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.8% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.6% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 7.9 | 7.8% | 6 |
| ratosh.Wesco 1.4 | 8.2 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 24 / 35 | 4941 |
| 2 | 1 | 70.2 | 88.3 | 24 / 35 | 5517 |
| 3 | 1 | 71.1 | 93.7 | 27 / 35 | 5195 |
| 4 | 1 | 71.1 | 94.0 | 29 / 35 | 4535 |
| 5 | 1 | 71.6 | 95.2 | 29 / 35 | 5127 |
| 6 | 1 | 68.9 | 87.0 | 23 / 35 | 4563 |
| 7 | 1 | 70.0 | 86.3 | 27 / 35 | 4860 |
| 8 | 1 | 68.9 | 83.8 | 24 / 35 | 4707 |
| 9 | 1 | 70.3 | 90.5 | 27 / 35 | 4325 |
| 10 | 1 | 69.7 | 88.9 | 25 / 35 | 4393 |
| 11 | 1 | 70.3 | 90.5 | 26 / 35 | 4487 |
| 12 | 1 | 71.4 | 92.4 | 28 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 120 | 92% |
| nz.jdc.nano.GridFu 1.0 | 89 | 92% |
| maribo.IotaCT 1.1 | 41 | 80% |
| timmit.nano.TimDog 0.33 | 25 | 96% |
| stelo.PatternRobot 1.0 | 23 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 95% |
| spinnercat.Omen 1.0 | 14 | 100% |
| ratosh.Wesco 1.4 | 9 | 100% |

Hadur died in 107 of 420 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 26 | 24% | 115 |
| nz.jdc.nano.GridFu 1.0 | 20 | 19% | 98 |
| timmit.nano.TimDog 0.33 | 18 | 17% | 54 |
| maribo.IotaCT 1.1 | 16 | 15% | 63 |
| stelo.PatternRobot 1.0 | 14 | 13% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 20 |
| ratosh.Wesco 1.4 | 5 | 5% | 18 |
| spinnercat.Omen 1.0 | 2 | 2% | 17 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.1 | 342 / 420 | 1.98 | 20.7% | 72206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 20.7% | 342 |
| tvv.nano.Polaris 1.2 | 2.1 | 12.3% | 39 |
| baal.nano.N 1.42 | 3.1 | 11.1% | 4 |
| Grystrion.TrackerWO 1.0 | 4.6 | 9.9% | 8 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 15 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.3% | 2 |
| sanja.First 0.1 | 6.8 | 8.2% | 3 |
| amk.Punbot.Punbot 0.01 | 6.9 | 8.1% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.2 | 28 / 35 | 6037 |
| 2 | 1 | 72.3 | 94.3 | 32 / 35 | 6485 |
| 3 | 1 | 71.3 | 94.0 | 29 / 35 | 6397 |
| 4 | 1 | 69.4 | 87.0 | 26 / 35 | 5485 |
| 5 | 1 | 71.0 | 88.9 | 28 / 35 | 6209 |
| 6 | 1 | 69.5 | 85.4 | 27 / 35 | 5432 |
| 7 | 1 | 70.5 | 89.5 | 29 / 35 | 6015 |
| 8 | 1 | 70.8 | 90.5 | 28 / 35 | 6037 |
| 9 | 1 | 68.6 | 81.9 | 28 / 35 | 5680 |
| 10 | 1 | 71.0 | 89.5 | 30 / 35 | 6233 |
| 11 | 1 | 70.9 | 91.7 | 30 / 35 | 6165 |
| 12 | 1 | 69.7 | 86.3 | 27 / 35 | 6031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 78 | 88% |
| baal.nano.N 1.42 | 71 | 99% |
| cvt.Firsty 1.0 | 52 | 96% |
| amk.Punbot.Punbot 0.01 | 44 | 100% |
| sanja.First 0.1 | 35 | 97% |
| zyx.micro.Ant 1.1 | 32 | 100% |
| Grystrion.TrackerWO 1.0 | 29 | 97% |
| squidM.TentalceMeleeNano 1.1 | 12 | 92% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 79 of 420 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 22 | 28% | 102 |
| zyx.micro.Ant 1.1 | 15 | 19% | 71 |
| Grystrion.TrackerWO 1.0 | 13 | 16% | 46 |
| sample.RamFire 1.0 | 8 | 10% | 11 |
| sanja.First 0.1 | 5 | 6% | 43 |
| cvt.Firsty 1.0 | 5 | 6% | 34 |
| baal.nano.N 1.42 | 4 | 5% | 56 |
| squidM.TentalceMeleeNano 1.1 | 4 | 5% | 17 |
| amk.Punbot.Punbot 0.01 | 3 | 4% | 22 |

## Melee bench: F11

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 68.0 | 129 / 420 | 3.88 | 14.9% | 57888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.4% | 171 |
| hadur117.micro.SaorDH5 0.1 | 1.6 | 14.9% | 129 |
| cs.Wren 1.0 | 3.3 | 12.8% | 41 |
| js.PinBall 1.6 | 4.3 | 11.3% | 26 |
| mz.Cork 0.1 | 4.5 | 11.0% | 28 |
| joe.ADinosaur 1.0 | 5.9 | 9.4% | 7 |
| evd.X1 0.01 | 7.1 | 8.1% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 9 |
| donjezza.Jezza 1.0 | 9.3 | 5.3% | 5 |
| PSW.Relentless 0.1 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 73.0 | 13 / 35 | 4963 |
| 2 | 2 | 62.3 | 67.3 | 12 / 35 | 4742 |
| 3 | 1 | 60.0 | 62.5 | 8 / 35 | 4831 |
| 4 | 1 | 63.0 | 68.9 | 11 / 35 | 4856 |
| 5 | 2 | 60.9 | 62.9 | 10 / 35 | 4813 |
| 6 | 2 | 65.2 | 76.2 | 10 / 35 | 5284 |
| 7 | 2 | 62.6 | 70.2 | 10 / 35 | 4752 |
| 8 | 2 | 61.1 | 64.1 | 10 / 35 | 4789 |
| 9 | 1 | 62.4 | 68.6 | 13 / 35 | 4615 |
| 10 | 2 | 63.4 | 71.1 | 15 / 35 | 4633 |
| 11 | 2 | 60.7 | 63.8 | 8 / 35 | 4314 |
| 12 | 1 | 62.8 | 67.0 | 9 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 119 | 40% |
| cs.Wren 1.0 | 37 | 89% |
| mz.Cork 0.1 | 31 | 74% |
| js.PinBall 1.6 | 12 | 83% |
| joe.ADinosaur 1.0 | 7 | 86% |
| donjezza.Jezza 1.0 | 5 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 295 of 420 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 138 | 47% | 190 |
| mz.Cork 0.1 | 35 | 12% | 51 |
| cs.Wren 1.0 | 27 | 9% | 43 |
| joe.ADinosaur 1.0 | 26 | 9% | 34 |
| js.PinBall 1.6 | 25 | 8% | 44 |
| evd.X1 0.01 | 21 | 7% | 25 |
| PSW.Relentless 0.1 | 15 | 5% | 16 |
| jsal.Jsalbot 1.0 | 6 | 2% | 11 |
| donjezza.Jezza 1.0 | 1 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.9 | 260 / 420 | 2.72 | 18.4% | 57354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 18.4% | 260 |
| myl.nano.Graviton 1.10 | 2.8 | 11.7% | 50 |
| ntc.Opposite 1.5 | 3.2 | 11.4% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.4% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.9 | 10.2% | 33 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 9 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 10 |
| disan.Chair 2.2.0 | 7.5 | 8.0% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 78.7 | 23 / 35 | 4116 |
| 2 | 1 | 71.0 | 91.1 | 26 / 35 | 5652 |
| 3 | 1 | 65.4 | 76.2 | 19 / 35 | 4368 |
| 4 | 1 | 65.4 | 73.3 | 17 / 35 | 4801 |
| 5 | 1 | 68.8 | 86.3 | 23 / 35 | 4752 |
| 6 | 1 | 68.2 | 82.9 | 22 / 35 | 5002 |
| 7 | 1 | 66.5 | 80.0 | 22 / 35 | 4417 |
| 8 | 1 | 66.9 | 78.7 | 20 / 35 | 4831 |
| 9 | 1 | 67.6 | 82.2 | 21 / 35 | 4929 |
| 10 | 1 | 67.4 | 79.4 | 22 / 35 | 4826 |
| 11 | 1 | 67.9 | 81.3 | 24 / 35 | 4888 |
| 12 | 1 | 67.1 | 80.6 | 21 / 35 | 4772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 74 | 88% |
| stelo.AreaTargetingBot 1.1 | 68 | 88% |
| ntc.Opposite 1.5 | 38 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 33 | 97% |
| disan.Chair 2.2.0 | 25 | 92% |
| donjezza.Muncho 1.0 | 22 | 82% |
| pfvicm.Sobieski 7.2.3b | 14 | 100% |
| DBall.NUKE 0.1 | 14 | 86% |
| pbg.R2D2 1.0 | 6 | 83% |

Hadur died in 164 of 420 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 30 | 18% | 50 |
| stelo.AreaTargetingBot 1.1 | 29 | 18% | 74 |
| ntc.Opposite 1.5 | 28 | 17% | 51 |
| myl.nano.Graviton 1.10 | 25 | 15% | 93 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 10% | 51 |
| disan.Chair 2.2.0 | 12 | 7% | 35 |
| DBall.NUKE 0.1 | 9 | 5% | 30 |
| donjezza.Muncho 1.0 | 9 | 5% | 23 |
| pbg.R2D2 1.0 | 5 | 3% | 12 |

## Melee bench: F13

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.9 | 156 / 420 | 3.71 | 15.0% | 48200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.3 | 15.0% | 156 |
| oog.melee.Capulet 1.2 | 2.1 | 14.2% | 105 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.3% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.9 | 12.6% | 44 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 25 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 27 |
| stelo.MirrorNano 1.3 | 7.3 | 7.9% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 71.4 | 15 / 35 | 4127 |
| 2 | 1 | 65.3 | 78.4 | 15 / 35 | 4013 |
| 3 | 1 | 63.6 | 71.4 | 14 / 35 | 3955 |
| 4 | 1 | 61.2 | 65.4 | 11 / 35 | 3972 |
| 5 | 1 | 62.2 | 67.6 | 10 / 35 | 4034 |
| 6 | 3 | 62.3 | 65.7 | 12 / 35 | 4291 |
| 7 | 2 | 61.4 | 65.1 | 12 / 35 | 3735 |
| 8 | 1 | 66.1 | 76.5 | 15 / 35 | 4337 |
| 9 | 2 | 62.6 | 69.2 | 10 / 35 | 3851 |
| 10 | 1 | 63.3 | 70.5 | 16 / 35 | 3698 |
| 11 | 1 | 63.8 | 70.8 | 14 / 35 | 4060 |
| 12 | 1 | 62.4 | 66.3 | 12 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 63 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 80% |
| kawigi.micro.Shiz 1.1 | 44 | 95% |
| yagami.Tidus 0.11 | 25 | 92% |
| ejb.Polaris 1.0.1 | 18 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 264 of 420 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 110 | 42% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 13% | 86 |
| yagami.Tidus 0.11 | 33 | 13% | 55 |
| ejb.Polaris 1.0.1 | 27 | 10% | 43 |
| kawigi.micro.Shiz 1.1 | 23 | 9% | 49 |
| stelo.MirrorNano 1.3 | 16 | 6% | 16 |
| kurios.DOSexe .9a | 13 | 5% | 13 |
| step.nanoPri 1.0 | 8 | 3% | 8 |

## Melee bench: F14

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.1 | 243 / 420 | 2.88 | 17.2% | 51757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 17.2% | 243 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 39 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 67 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 32 |
| ratosh.Nobo 0.21 | 4.9 | 10.7% | 11 |
| m3thos.Eva00 1.1 | 5.6 | 10.1% | 19 |
| bayen.UbaMicro 1.4 | 6.8 | 9.2% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 27 / 35 | 4912 |
| 2 | 1 | 67.6 | 84.4 | 22 / 35 | 4479 |
| 3 | 1 | 63.5 | 72.4 | 14 / 35 | 4447 |
| 4 | 1 | 63.3 | 72.7 | 16 / 35 | 3939 |
| 5 | 1 | 64.3 | 73.3 | 18 / 35 | 3968 |
| 6 | 1 | 66.4 | 80.3 | 20 / 35 | 4644 |
| 7 | 1 | 64.1 | 74.3 | 17 / 35 | 3929 |
| 8 | 1 | 64.3 | 75.6 | 18 / 35 | 4247 |
| 9 | 1 | 69.2 | 91.7 | 26 / 35 | 4416 |
| 10 | 1 | 66.1 | 80.0 | 22 / 35 | 4310 |
| 11 | 1 | 66.4 | 80.6 | 22 / 35 | 4123 |
| 12 | 1 | 64.8 | 74.6 | 21 / 35 | 4343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 86 | 91% |
| wee.Gem 1.8.4 | 83 | 77% |
| wompi.Quokka 1.6 | 39 | 85% |
| ratosh.Nobo 0.21 | 30 | 97% |
| m3thos.Eva00 1.1 | 26 | 77% |
| bayen.UbaMicro 1.4 | 15 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 178 of 420 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 37 | 21% | 100 |
| wompi.Quokka 1.6 | 23 | 13% | 54 |
| maribo.FollowFire 1 | 21 | 12% | 20 |
| bzdp.Pansy 2.1 | 19 | 11% | 88 |
| ratosh.Nobo 0.21 | 19 | 11% | 43 |
| m3thos.Eva00 1.1 | 17 | 10% | 41 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 8% | 22 |
| stelo.MyAgileRobot 0.2 | 14 | 8% | 19 |
| bayen.UbaMicro 1.4 | 13 | 7% | 27 |

## Melee bench: F15

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 81.4 | 133 / 420 | 2.67 | 18.8% | 85245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.5% | 245 |
| hadur117.micro.SaorDH5 0.1 | 1.5 | 18.8% | 133 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 32 |
| ayk.WallHugger 1.0 | 4.2 | 10.3% | 4 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 2 |
| stuff.Vlad 0.1 | 6.1 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 2 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 78.1 | 9 / 35 | 6404 |
| 2 | 1 | 70.6 | 82.2 | 14 / 35 | 7557 |
| 3 | 2 | 69.4 | 79.4 | 6 / 35 | 7307 |
| 4 | 2 | 69.3 | 80.6 | 14 / 35 | 6682 |
| 5 | 2 | 69.1 | 81.6 | 9 / 35 | 6836 |
| 6 | 2 | 65.4 | 67.9 | 7 / 35 | 6342 |
| 7 | 1 | 70.0 | 81.3 | 12 / 35 | 7633 |
| 8 | 1 | 71.7 | 87.9 | 15 / 35 | 7469 |
| 9 | 1 | 71.1 | 85.7 | 12 / 35 | 7784 |
| 10 | 2 | 69.2 | 82.9 | 10 / 35 | 6533 |
| 11 | 1 | 70.1 | 81.0 | 12 / 35 | 7353 |
| 12 | 1 | 71.6 | 88.3 | 13 / 35 | 7345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 208 | 25% |
| mz.NanoGod 2.02 | 35 | 86% |
| exauge.GateKeeper 1.1.121g | 19 | 100% |
| ayk.WallHugger 1.0 | 13 | 100% |
| drd.Dreadknoght 0.9 | 8 | 88% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 288 of 420 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 208 | 72% | 271 |
| mz.NanoGod 2.02 | 42 | 15% | 87 |
| ayk.WallHugger 1.0 | 18 | 6% | 28 |
| exauge.GateKeeper 1.1.121g | 10 | 3% | 21 |
| stuff.Vlad 0.1 | 5 | 2% | 7 |
| stelo.PianistNano 1.2 | 3 | 1% | 3 |
| drd.Dreadknoght 0.9 | 2 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.3 | 213 / 420 | 3.76 | 15.9% | 53617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 15.9% | 213 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.6% | 41 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.0% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.2% | 44 |
| bvh.micro.Freya 0.3 | 4.3 | 11.3% | 35 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.2% | 10 |
| conscience.Electron 1.3g | 6.5 | 8.5% | 5 |
| ap.Frederick 1.1 | 8.4 | 7.0% | 19 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 23 / 35 | 4966 |
| 2 | 1 | 63.1 | 68.3 | 18 / 35 | 4488 |
| 3 | 1 | 61.5 | 62.9 | 15 / 35 | 4204 |
| 4 | 1 | 62.6 | 66.0 | 15 / 35 | 4465 |
| 5 | 1 | 64.1 | 73.0 | 16 / 35 | 4400 |
| 6 | 1 | 62.9 | 66.0 | 16 / 35 | 4552 |
| 7 | 1 | 62.3 | 67.3 | 15 / 35 | 4321 |
| 8 | 1 | 64.4 | 73.7 | 19 / 35 | 4572 |
| 9 | 1 | 61.6 | 62.5 | 15 / 35 | 4287 |
| 10 | 1 | 64.9 | 73.0 | 21 / 35 | 4600 |
| 11 | 1 | 62.7 | 64.8 | 19 / 35 | 4129 |
| 12 | 1 | 65.4 | 76.5 | 21 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 69 | 91% |
| dummy.micro.Sparrow 2.5 | 57 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 48 | 83% |
| bvh.micro.Freya 0.3 | 40 | 98% |
| stelo.MirrorMicro 1.0 | 13 | 85% |
| ap.Frederick 1.1 | 10 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 208 of 420 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 39 | 19% | 50 |
| davidalves.net.DuelistMicroMelee 1.4 | 34 | 16% | 79 |
| mn.nano.perceptual.Impact 1.3.0 | 33 | 16% | 33 |
| voidious.micro.BlitzBat 1.05 | 28 | 13% | 75 |
| dummy.micro.Sparrow 2.5 | 27 | 13% | 75 |
| dl.BetterWalls 1.0 | 17 | 8% | 31 |
| stelo.MirrorMicro 1.0 | 15 | 7% | 38 |
| bvh.micro.Freya 0.3 | 15 | 7% | 36 |

## Melee bench: F17

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.8 | 286 / 420 | 2.46 | 20.1% | 78217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 20.1% | 286 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.2% | 47 |
| supersample.SuperBoxBot 1.0 | 3.4 | 11.5% | 22 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 19 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.6% | 11 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 10 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 5 |
| sample.MyFirstRobot 1.0 | 8.6 | 5.8% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 8.6 | 6.3% | 6 |
| sample.Corners 1.0 | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 81.0 | 26 / 35 | 6570 |
| 2 | 1 | 71.5 | 88.9 | 24 / 35 | 6523 |
| 3 | 1 | 68.4 | 77.5 | 23 / 35 | 6363 |
| 4 | 1 | 69.3 | 82.5 | 23 / 35 | 6199 |
| 5 | 1 | 68.8 | 79.4 | 22 / 35 | 6454 |
| 6 | 1 | 70.0 | 87.6 | 26 / 35 | 5918 |
| 7 | 1 | 69.7 | 82.5 | 23 / 35 | 6827 |
| 8 | 1 | 71.3 | 86.0 | 24 / 35 | 6834 |
| 9 | 1 | 70.7 | 87.3 | 24 / 35 | 6575 |
| 10 | 1 | 71.5 | 85.7 | 24 / 35 | 7178 |
| 11 | 1 | 69.5 | 82.5 | 23 / 35 | 6400 |
| 12 | 1 | 70.0 | 84.1 | 24 / 35 | 6376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 98 | 88% |
| sul.Lunar 1.1 | 83 | 99% |
| supersample.SuperBoxBot 1.0 | 59 | 88% |
| mme.NikeEnhanced 2.0 | 20 | 95% |
| dsw.StaticD 1.0 | 16 | 81% |
| sample.MyFirstJuniorRobot 1.0 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 11 | 55% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |
| sample.Corners 1.0 | 6 | 100% |

Hadur died in 137 of 420 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 45 | 33% | 82 |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 23% | 126 |
| dsw.StaticD 1.0 | 18 | 13% | 39 |
| sul.Lunar 1.1 | 10 | 7% | 91 |
| sample.MyFirstRobot 1.0 | 9 | 7% | 15 |
| mme.NikeEnhanced 2.0 | 7 | 5% | 26 |
| tlp.ThreeLeggedPig 1 | 6 | 4% | 7 |
| sample.Corners 1.0 | 5 | 4% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 3% | 24 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDH5 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.4 | 236 / 420 | 2.85 | 18.3% | 72874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH5 0.1 | 1.0 | 18.3% | 236 |
| radnor.DoctorBob 1.42 | 2.1 | 13.3% | 61 |
| mld.Wisdom 1.0 | 3.5 | 11.8% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.1% | 32 |
| KiraNL.Chupacabra 0.4 | 4.9 | 10.3% | 18 |
| amz.NanoClone 1.41 | 5.4 | 9.9% | 19 |
| sample.Walls 1.0 | 7.2 | 8.2% | 12 |
| GarmBox.Oranges 1.0 | 8.1 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 5 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 71.1 | 18 / 35 | 5760 |
| 2 | 1 | 64.4 | 68.6 | 17 / 35 | 5627 |
| 3 | 1 | 69.8 | 84.4 | 23 / 35 | 6914 |
| 4 | 1 | 66.4 | 78.4 | 17 / 35 | 5572 |
| 5 | 1 | 66.8 | 78.4 | 19 / 35 | 5837 |
| 6 | 1 | 68.8 | 81.6 | 21 / 35 | 6313 |
| 7 | 1 | 68.9 | 84.8 | 20 / 35 | 6383 |
| 8 | 1 | 68.0 | 80.6 | 20 / 35 | 6009 |
| 9 | 1 | 67.7 | 78.7 | 19 / 35 | 6149 |
| 10 | 1 | 69.8 | 86.0 | 21 / 35 | 6580 |
| 11 | 1 | 67.7 | 79.7 | 22 / 35 | 5834 |
| 12 | 1 | 67.4 | 80.6 | 19 / 35 | 5896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 95 | 91% |
| radnor.DoctorBob 1.42 | 77 | 73% |
| mld.Wisdom 1.0 | 35 | 66% |
| amz.NanoClone 1.41 | 27 | 78% |
| jangs.ns51 1.0 | 16 | 100% |
| sample.Walls 1.0 | 16 | 100% |
| KiraNL.Chupacabra 0.4 | 12 | 67% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 186 of 420 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 46 | 25% | 117 |
| mld.Wisdom 1.0 | 45 | 24% | 81 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 17% | 116 |
| KiraNL.Chupacabra 0.4 | 31 | 17% | 43 |
| amz.NanoClone 1.41 | 17 | 9% | 26 |
| sample.Walls 1.0 | 7 | 4% | 26 |
| GarmBox.Oranges 1.0 | 6 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 1% | 6 |

