# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.6 | 261 / 420 | 2.21 | 20.1% | 77017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 20.1% | 261 |
| radnor.DoctorBob 1.42 | 2.3 | 14.9% | 63 |
| mz.AntiGrav 1.0 | 3.2 | 13.9% | 32 |
| mld.Infinity 2.2 | 3.6 | 13.0% | 44 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 12 |
| GarmBox.Oranges 1.0 | 6.6 | 6.8% | 1 |
| sample.Walls 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 7 |
| arthord.MannyPacquiao Beta | 9.3 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.0 | 18 / 35 | 6622 |
| 2 | 1 | 71.0 | 86.7 | 22 / 35 | 6422 |
| 3 | 1 | 70.6 | 87.3 | 26 / 35 | 6097 |
| 4 | 1 | 71.3 | 87.9 | 24 / 35 | 6461 |
| 5 | 1 | 72.4 | 92.1 | 24 / 35 | 6749 |
| 6 | 1 | 71.4 | 89.8 | 24 / 35 | 6524 |
| 7 | 1 | 69.9 | 83.8 | 24 / 35 | 5900 |
| 8 | 1 | 70.5 | 85.1 | 19 / 35 | 6379 |
| 9 | 1 | 71.0 | 87.0 | 20 / 35 | 6741 |
| 10 | 1 | 71.9 | 93.3 | 24 / 35 | 6566 |
| 11 | 1 | 69.5 | 83.2 | 21 / 35 | 6081 |
| 12 | 1 | 68.6 | 76.5 | 15 / 35 | 6475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 120 | 97% |
| mld.Infinity 2.2 | 79 | 82% |
| radnor.DoctorBob 1.42 | 74 | 72% |
| amz.NanoClone 1.41 | 11 | 73% |
| jangs.ns51 1.0 | 7 | 57% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 159 of 420 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 78 | 49% | 153 |
| mld.Infinity 2.2 | 28 | 18% | 28 |
| mz.AntiGrav 1.0 | 25 | 16% | 149 |
| amz.NanoClone 1.41 | 15 | 9% | 37 |
| jangs.ns51 1.0 | 5 | 3% | 15 |
| sample.Walls 1.0 | 5 | 3% | 14 |
| arthord.MannyPacquiao Beta | 2 | 1% | 11 |
| GarmBox.Oranges 1.0 | 1 | 1% | 6 |

## Melee bench: F02

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 278 / 420 | 2.34 | 18.4% | 57075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.1 | 18.4% | 278 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 78 |
| mld.DustBunny 3.8 | 2.7 | 13.4% | 24 |
| maribo.melee.BMV 0.1 | 4.7 | 10.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 8.7% | 7 |
| zyx.nano.Ant 1.1 | 6.1 | 8.6% | 3 |
| fullsail.SweetTea 1.1 | 7.3 | 7.8% | 12 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.3% | 13 |
| cs.Grudge 1.0 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.7 | 21 / 35 | 4811 |
| 2 | 1 | 70.5 | 93.0 | 29 / 35 | 5130 |
| 3 | 1 | 68.8 | 89.8 | 25 / 35 | 4631 |
| 4 | 1 | 66.4 | 81.9 | 19 / 35 | 4311 |
| 5 | 1 | 69.8 | 92.7 | 25 / 35 | 5031 |
| 6 | 1 | 67.6 | 83.8 | 23 / 35 | 5007 |
| 7 | 1 | 70.3 | 94.9 | 28 / 35 | 5035 |
| 8 | 1 | 66.0 | 79.7 | 23 / 35 | 4113 |
| 9 | 2 | 59.2 | 52.1 | 13 / 35 | 4654 |
| 10 | 1 | 69.2 | 91.4 | 25 / 35 | 4912 |
| 11 | 1 | 68.0 | 86.0 | 24 / 35 | 4686 |
| 12 | 1 | 68.7 | 89.8 | 23 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 125 | 77% |
| mld.DustBunny 3.8 | 111 | 95% |
| fullsail.SweetTea 1.1 | 29 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 80% |
| maribo.melee.BMV 0.1 | 15 | 93% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| zyx.nano.Ant 1.1 | 7 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 142 of 420 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 44 | 31% | 156 |
| mld.DustBunny 3.8 | 23 | 16% | 116 |
| zyx.nano.Ant 1.1 | 21 | 15% | 28 |
| fullsail.SweetTea 1.1 | 18 | 13% | 41 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 8% | 31 |
| cs.Grudge 1.0 | 10 | 7% | 10 |
| bzdp.BoxCar 2.0 | 6 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 22 |
| maribo.melee.BMV 0.1 | 4 | 3% | 9 |

## Melee bench: F03

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.2 | 239 / 420 | 2.60 | 18.8% | 65634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 18.8% | 239 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 84 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.0% | 41 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.5% | 23 |
| fm.mammillarias 1.3 | 5.8 | 9.3% | 3 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 8.1 | 6.8% | 8 |
| sample.Fire 1.0 | 9.0 | 5.3% | 4 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 86.7 | 22 / 35 | 6352 |
| 2 | 1 | 70.1 | 90.2 | 22 / 35 | 5516 |
| 3 | 1 | 68.4 | 82.2 | 18 / 35 | 5384 |
| 4 | 1 | 69.4 | 83.2 | 22 / 35 | 5446 |
| 5 | 1 | 68.0 | 80.3 | 20 / 35 | 5590 |
| 6 | 1 | 67.8 | 81.0 | 20 / 35 | 5218 |
| 7 | 1 | 68.2 | 81.0 | 21 / 35 | 5330 |
| 8 | 1 | 68.8 | 82.2 | 22 / 35 | 5682 |
| 9 | 1 | 67.5 | 83.5 | 19 / 35 | 4806 |
| 10 | 1 | 66.6 | 74.0 | 18 / 35 | 5352 |
| 11 | 1 | 67.0 | 78.1 | 15 / 35 | 5247 |
| 12 | 1 | 69.0 | 83.8 | 20 / 35 | 5711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 107 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 47 | 77% |
| myl.nano.KomoriNinja 1.1 | 39 | 90% |
| cb.nano.Insomnia 1.0 | 33 | 79% |
| sp.Nanos.Ember 1.1 | 24 | 88% |
| cs.sheldor.Talon 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 9 | 89% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 182 of 420 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 55 | 30% | 89 |
| myl.micro.Troodon 1.10 | 42 | 23% | 145 |
| myl.nano.KomoriNinja 1.1 | 24 | 13% | 73 |
| cb.nano.Insomnia 1.0 | 24 | 13% | 17 |
| fm.mammillarias 1.3 | 17 | 9% | 25 |
| sp.Nanos.Ember 1.1 | 8 | 4% | 34 |
| sample.Fire 1.0 | 6 | 3% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 22 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.4 | 268 / 420 | 2.31 | 19.5% | 70031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 19.5% | 268 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 44 |
| tvv.micro.Antares 1.1.1 | 2.9 | 12.5% | 36 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 20 |
| stelo.SoJNanoMelee 1.1 | 4.9 | 9.3% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 3 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7.4 | 7.9% | 8 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.0 | 19 / 35 | 5181 |
| 2 | 1 | 70.0 | 88.6 | 22 / 35 | 6152 |
| 3 | 1 | 69.5 | 87.3 | 23 / 35 | 5904 |
| 4 | 1 | 68.0 | 81.6 | 21 / 35 | 5648 |
| 5 | 1 | 68.1 | 80.6 | 23 / 35 | 5513 |
| 6 | 1 | 70.3 | 90.5 | 25 / 35 | 5674 |
| 7 | 1 | 70.6 | 89.8 | 24 / 35 | 6201 |
| 8 | 1 | 69.4 | 87.3 | 24 / 35 | 5894 |
| 9 | 1 | 68.4 | 84.4 | 21 / 35 | 5678 |
| 10 | 1 | 70.1 | 87.0 | 24 / 35 | 6365 |
| 11 | 1 | 68.6 | 82.2 | 19 / 35 | 6093 |
| 12 | 1 | 69.2 | 87.0 | 23 / 35 | 5728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 110 | 82% |
| stelo.SoJNanoMelee 1.1 | 71 | 89% |
| tvv.micro.Antares 1.1.1 | 49 | 86% |
| tj.zombie1n 1.0.1 | 27 | 78% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 74% |
| yk.JahMicro 1.0 | 18 | 94% |
| sample.VelociRobot 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 86% |

Hadur died in 153 of 420 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 34% | 164 |
| stelo.SoJNanoMelee 1.1 | 33 | 22% | 83 |
| tvv.micro.Antares 1.1.1 | 25 | 16% | 60 |
| tj.zombie1n 1.0.1 | 13 | 8% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 5% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 5% | 16 |
| yk.JahMicro 1.0 | 8 | 5% | 14 |
| repositorio.NanoStep 1.0 | 3 | 2% | 22 |
| sample.VelociRobot 1.0 | 2 | 1% | 13 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 65.8 | 170 / 420 | 4.08 | 14.6% | 49797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.1 | 14.6% | 170 |
| oog.melee.Corsair 1.0 | 2.4 | 12.6% | 56 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 50 |
| simonton.nano.MeleeSeed 1.8 | 3.6 | 11.6% | 68 |
| EBBU.Sim2 1.02 | 5.1 | 10.3% | 25 |
| robar.nano.Assertive_Melee 0.2 | 6.6 | 9.4% | 11 |
| sam.Samspin 1.0 | 6.8 | 9.3% | 22 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.9% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.5 | 55.9 | 11 / 35 | 3752 |
| 2 | 1 | 65.1 | 77.5 | 18 / 35 | 4434 |
| 3 | 1 | 62.3 | 65.7 | 15 / 35 | 4591 |
| 4 | 1 | 61.2 | 67.0 | 12 / 35 | 4077 |
| 5 | 1 | 61.0 | 67.6 | 14 / 35 | 3819 |
| 6 | 1 | 61.7 | 69.5 | 14 / 35 | 4077 |
| 7 | 1 | 59.8 | 60.0 | 13 / 35 | 4363 |
| 8 | 1 | 63.9 | 72.4 | 19 / 35 | 4313 |
| 9 | 1 | 59.9 | 62.9 | 13 / 35 | 4089 |
| 10 | 1 | 60.6 | 63.5 | 14 / 35 | 3901 |
| 11 | 1 | 60.3 | 62.5 | 12 / 35 | 4298 |
| 12 | 1 | 61.2 | 65.1 | 15 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 70 | 66% |
| oog.melee.Corsair 1.0 | 51 | 86% |
| ahf.NanoAndrew .4 | 37 | 89% |
| EBBU.Sim2 1.02 | 20 | 85% |
| sam.Samspin 1.0 | 15 | 80% |
| robar.nano.Assertive_Melee 0.2 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 251 of 420 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 64 | 25% | 101 |
| robar.nano.Assertive_Melee 0.2 | 39 | 16% | 53 |
| zyx.nano.BacillusComma 1.0 | 34 | 14% | 42 |
| bwbaugh.nano.Tirunculus 0.0.0a | 26 | 10% | 27 |
| ahf.NanoAndrew .4 | 22 | 9% | 51 |
| EBBU.Sim2 1.02 | 19 | 8% | 38 |
| sam.Samspin 1.0 | 17 | 7% | 28 |
| oog.melee.Corsair 1.0 | 15 | 6% | 59 |
| sample.TrackFire 1.0 | 14 | 6% | 18 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.3 | 258 / 420 | 2.41 | 18.3% | 57805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 18.3% | 258 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 59 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.8% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.3% | 42 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 19 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.6% | 8 |
| fm.claire 1.7 | 6.4 | 8.4% | 3 |
| sample.SpinBot 1.0 | 7.3 | 7.8% | 12 |
| pa.Improved 1.0 | 9.3 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.8 | 21 / 35 | 4764 |
| 2 | 1 | 66.8 | 82.5 | 21 / 35 | 4758 |
| 3 | 1 | 66.7 | 82.2 | 21 / 35 | 4505 |
| 4 | 1 | 69.7 | 90.2 | 23 / 35 | 5375 |
| 5 | 1 | 67.0 | 82.5 | 22 / 35 | 4630 |
| 6 | 1 | 68.8 | 87.0 | 22 / 35 | 5364 |
| 7 | 1 | 68.4 | 87.9 | 22 / 35 | 4830 |
| 8 | 1 | 68.6 | 86.7 | 23 / 35 | 4852 |
| 9 | 1 | 65.7 | 81.0 | 19 / 35 | 4168 |
| 10 | 1 | 68.6 | 87.3 | 24 / 35 | 4933 |
| 11 | 1 | 66.7 | 80.6 | 20 / 35 | 4853 |
| 12 | 1 | 65.8 | 78.7 | 20 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 131 | 81% |
| oog.melee.CapuletDroid 1.1 | 58 | 69% |
| gh.nano.Grofvuil 0.2 | 45 | 98% |
| arthord.NanoSatanMelee Beta | 21 | 90% |
| sample.SpinBot 1.0 | 18 | 100% |
| winamp32.micro.MicroMacro 1.0 | 17 | 71% |
| fm.claire 1.7 | 9 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |

Hadur died in 164 of 420 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 46 | 28% | 157 |
| oog.melee.CapuletDroid 1.1 | 38 | 23% | 39 |
| gh.nano.Grofvuil 0.2 | 18 | 11% | 63 |
| arthord.NanoSatanMelee Beta | 18 | 11% | 44 |
| sample.SpinBot 1.0 | 14 | 9% | 38 |
| fm.claire 1.7 | 12 | 7% | 20 |
| winamp32.micro.MicroMacro 1.0 | 9 | 5% | 25 |
| kurios.DOSexe .9b | 6 | 4% | 21 |
| pa.Improved 1.0 | 2 | 1% | 11 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.7 | 198 / 420 | 2.74 | 17.5% | 60832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 17.5% | 198 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 77 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.7% | 56 |
| mz.MicroGodMelee 1 | 3.6 | 13.1% | 60 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 11 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 8 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 4 |
| acogdev.alpha 0.2 | 7.8 | 6.5% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 77.5 | 15 / 35 | 4885 |
| 2 | 1 | 67.2 | 82.2 | 16 / 35 | 4897 |
| 3 | 1 | 66.5 | 80.6 | 13 / 35 | 5309 |
| 4 | 1 | 65.8 | 79.4 | 15 / 35 | 4938 |
| 5 | 1 | 65.7 | 79.7 | 12 / 35 | 4840 |
| 6 | 1 | 68.9 | 87.9 | 20 / 35 | 5645 |
| 7 | 1 | 67.8 | 82.9 | 20 / 35 | 5098 |
| 8 | 1 | 68.0 | 83.2 | 20 / 35 | 5261 |
| 9 | 1 | 68.4 | 86.0 | 23 / 35 | 5020 |
| 10 | 1 | 64.6 | 71.7 | 15 / 35 | 4906 |
| 11 | 1 | 66.9 | 79.4 | 17 / 35 | 5351 |
| 12 | 1 | 64.7 | 77.8 | 12 / 35 | 4682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 92 | 72% |
| spinnercat.micro.Tyger 0.1 | 80 | 83% |
| gh.micro.Gruweltje 0.7 | 78 | 40% |
| DBall.Anarchy 0.1 | 19 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 88% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 223 of 420 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 67 | 30% | 112 |
| mz.MicroGodMelee 1 | 54 | 24% | 112 |
| spinnercat.micro.Tyger 0.1 | 52 | 23% | 108 |
| acogdev.alpha 0.2 | 15 | 7% | 20 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 16 |
| DBall.Anarchy 0.1 | 9 | 4% | 26 |
| fire219.CatBot 1.0 | 8 | 4% | 9 |
| el.JumpShoot 0.2 | 4 | 2% | 8 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 8 |

## Melee bench: F08

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 68.3 | 164 / 420 | 3.85 | 15.2% | 55261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.7 | 15.2% | 164 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.1% | 110 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.4 | 14.3% | 84 |
| qualidafial.MajorDick 1.0.1 | 4.4 | 10.2% | 14 |
| germ.TheMind .2 | 5.3 | 9.5% | 15 |
| awesomeness.Elite 1.0 | 6.4 | 8.3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.6 | 8.4% | 8 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 72.4 | 16 / 35 | 4814 |
| 2 | 2 | 60.8 | 63.8 | 13 / 35 | 4082 |
| 3 | 2 | 62.3 | 69.8 | 12 / 35 | 4206 |
| 4 | 1 | 66.8 | 80.3 | 20 / 35 | 5185 |
| 5 | 2 | 63.0 | 69.2 | 13 / 35 | 4573 |
| 6 | 1 | 62.0 | 67.9 | 10 / 35 | 4479 |
| 7 | 1 | 64.2 | 70.5 | 15 / 35 | 4885 |
| 8 | 2 | 63.5 | 69.5 | 16 / 35 | 4584 |
| 9 | 2 | 63.9 | 68.6 | 15 / 35 | 5196 |
| 10 | 3 | 59.8 | 60.0 | 11 / 35 | 4195 |
| 11 | 1 | 63.7 | 70.8 | 15 / 35 | 4534 |
| 12 | 2 | 59.1 | 56.8 | 8 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 128 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 55 | 65% |
| qualidafial.MajorDick 1.0.1 | 11 | 100% |
| germ.TheMind .2 | 11 | 82% |
| lrem.micro.MoggFanatic 0.2 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| awesomeness.Elite 1.0 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |

Hadur died in 257 of 420 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 116 | 45% | 187 |
| simonton.nano.WeekendObsession_Melee 1.0 | 55 | 21% | 93 |
| germ.TheMind .2 | 26 | 10% | 40 |
| stelo.UntouchableNano 1.3 | 18 | 7% | 25 |
| awesomeness.Elite 1.0 | 10 | 4% | 24 |
| qualidafial.MajorDick 1.0.1 | 10 | 4% | 17 |
| lrem.micro.MoggFanatic 0.2 | 10 | 4% | 13 |
| mym.EdgeStalker 1.0 | 9 | 4% | 10 |
| sample.Crazy 1.0 | 3 | 1% | 8 |

## Melee bench: F09

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.4 | 297 / 420 | 2.04 | 19.4% | 54533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 19.4% | 297 |
| rz.HawkOnFire 0.1 | 2.1 | 13.8% | 40 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.2% | 32 |
| maribo.IotaCT 1.1 | 4.0 | 10.7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 7 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.0% | 9 |
| ratosh.Wesco 1.4 | 7.3 | 8.5% | 5 |
| stelo.PatternRobot 1.0 | 7.5 | 8.3% | 13 |
| spinnercat.Omen 1.0 | 8.5 | 7.6% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 28 / 35 | 4571 |
| 2 | 1 | 69.2 | 86.0 | 24 / 35 | 4304 |
| 3 | 1 | 69.3 | 88.6 | 27 / 35 | 4105 |
| 4 | 1 | 69.7 | 89.8 | 25 / 35 | 4599 |
| 5 | 1 | 69.7 | 87.6 | 23 / 35 | 4800 |
| 6 | 1 | 70.2 | 88.9 | 23 / 35 | 4952 |
| 7 | 1 | 69.5 | 88.6 | 25 / 35 | 4319 |
| 8 | 1 | 71.2 | 94.0 | 26 / 35 | 4684 |
| 9 | 1 | 69.7 | 87.0 | 27 / 35 | 4569 |
| 10 | 1 | 69.3 | 90.2 | 22 / 35 | 4301 |
| 11 | 1 | 69.9 | 88.6 | 24 / 35 | 4889 |
| 12 | 1 | 67.8 | 82.9 | 23 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 139 | 93% |
| nz.jdc.nano.GridFu 1.0 | 72 | 83% |
| timmit.nano.TimDog 0.33 | 25 | 96% |
| maribo.IotaCT 1.1 | 24 | 96% |
| stelo.PatternRobot 1.0 | 21 | 81% |
| dmh.robocode.robot.RedDwarf 0.4 | 20 | 100% |
| ratosh.Wesco 1.4 | 17 | 88% |
| spinnercat.Omen 1.0 | 9 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 27 | 22% | 36 |
| nz.jdc.nano.GridFu 1.0 | 25 | 20% | 95 |
| rz.HawkOnFire 0.1 | 24 | 19% | 124 |
| timmit.nano.TimDog 0.33 | 18 | 14% | 46 |
| ratosh.Wesco 1.4 | 12 | 10% | 33 |
| maribo.IotaCT 1.1 | 8 | 6% | 41 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 6% | 23 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 12 |

## Melee bench: F10

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.4 | 292 / 420 | 2.22 | 19.5% | 67717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 19.5% | 292 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.7% | 56 |
| baal.nano.N 1.42 | 3.0 | 11.8% | 11 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 8 |
| zyx.micro.Ant 1.1 | 4.8 | 9.7% | 17 |
| sanja.First 0.1 | 6.6 | 8.3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.2% | 4 |
| cvt.Firsty 1.0 | 7.8 | 7.5% | 15 |
| amk.Punbot.Punbot 0.01 | 7.9 | 7.4% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 27 / 35 | 5655 |
| 2 | 1 | 68.7 | 86.3 | 23 / 35 | 5805 |
| 3 | 1 | 67.8 | 80.6 | 22 / 35 | 5302 |
| 4 | 1 | 68.4 | 82.9 | 23 / 35 | 5698 |
| 5 | 1 | 69.2 | 87.6 | 23 / 35 | 5812 |
| 6 | 1 | 68.2 | 86.0 | 19 / 35 | 5764 |
| 7 | 1 | 69.5 | 88.9 | 24 / 35 | 5610 |
| 8 | 1 | 70.2 | 90.5 | 27 / 35 | 5735 |
| 9 | 1 | 67.6 | 80.3 | 23 / 35 | 5387 |
| 10 | 1 | 68.0 | 82.9 | 23 / 35 | 5414 |
| 11 | 1 | 69.3 | 87.6 | 27 / 35 | 5456 |
| 12 | 1 | 71.8 | 94.9 | 31 / 35 | 6079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 84 | 76% |
| baal.nano.N 1.42 | 67 | 96% |
| cvt.Firsty 1.0 | 45 | 82% |
| sanja.First 0.1 | 35 | 91% |
| zyx.micro.Ant 1.1 | 33 | 97% |
| amk.Punbot.Punbot 0.01 | 27 | 93% |
| Grystrion.TrackerWO 1.0 | 23 | 96% |
| squidM.TentalceMeleeNano 1.1 | 14 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 129 of 420 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 28% | 117 |
| zyx.micro.Ant 1.1 | 29 | 22% | 90 |
| cvt.Firsty 1.0 | 14 | 11% | 47 |
| sample.RamFire 1.0 | 12 | 9% | 14 |
| Grystrion.TrackerWO 1.0 | 11 | 9% | 32 |
| baal.nano.N 1.42 | 9 | 7% | 61 |
| sanja.First 0.1 | 8 | 6% | 34 |
| amk.Punbot.Punbot 0.01 | 6 | 5% | 7 |
| squidM.TentalceMeleeNano 1.1 | 4 | 3% | 10 |

## Melee bench: F11

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 69.4 | 129 / 420 | 3.75 | 14.7% | 52680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.3% | 163 |
| hadur117.micro.SaorS 0.1 | 1.8 | 14.7% | 129 |
| cs.Wren 1.0 | 2.8 | 13.3% | 48 |
| js.PinBall 1.6 | 4.3 | 11.5% | 22 |
| mz.Cork 0.1 | 4.8 | 10.7% | 25 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 6 |
| evd.X1 0.01 | 6.8 | 8.3% | 5 |
| jsal.Jsalbot 1.0 | 8.1 | 6.5% | 8 |
| donjezza.Jezza 1.0 | 8.9 | 5.7% | 16 |
| PSW.Relentless 0.1 | 9.9 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.9 | 15 / 35 | 4571 |
| 2 | 1 | 62.3 | 68.9 | 12 / 35 | 4756 |
| 3 | 2 | 62.9 | 69.5 | 13 / 35 | 4706 |
| 4 | 2 | 62.4 | 74.3 | 9 / 35 | 4137 |
| 5 | 2 | 62.5 | 72.4 | 10 / 35 | 4196 |
| 6 | 3 | 57.3 | 56.8 | 8 / 35 | 3945 |
| 7 | 1 | 66.3 | 79.4 | 17 / 35 | 5021 |
| 8 | 2 | 61.9 | 68.3 | 10 / 35 | 4409 |
| 9 | 3 | 61.1 | 67.3 | 11 / 35 | 4062 |
| 10 | 2 | 61.1 | 67.0 | 10 / 35 | 4552 |
| 11 | 1 | 59.7 | 63.2 | 8 / 35 | 4571 |
| 12 | 2 | 61.3 | 70.2 | 6 / 35 | 3754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 137 | 40% |
| cs.Wren 1.0 | 49 | 80% |
| mz.Cork 0.1 | 20 | 75% |
| js.PinBall 1.6 | 10 | 80% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| donjezza.Jezza 1.0 | 5 | 20% |
| evd.X1 0.01 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 296 of 420 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 132 | 45% | 196 |
| cs.Wren 1.0 | 38 | 13% | 62 |
| joe.ADinosaur 1.0 | 31 | 10% | 32 |
| evd.X1 0.01 | 27 | 9% | 32 |
| js.PinBall 1.6 | 24 | 8% | 36 |
| mz.Cork 0.1 | 18 | 6% | 30 |
| PSW.Relentless 0.1 | 13 | 4% | 14 |
| donjezza.Jezza 1.0 | 8 | 3% | 10 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.2 | 232 / 420 | 2.87 | 17.5% | 53310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 17.5% | 232 |
| ntc.Opposite 1.5 | 2.7 | 11.5% | 23 |
| myl.nano.Graviton 1.10 | 3.9 | 11.0% | 42 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.1 | 10.1% | 16 |
| disan.Chair 2.2.0 | 6.9 | 8.6% | 19 |
| DBall.NUKE 0.1 | 7.6 | 8.1% | 12 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 23 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.4 | 20 / 35 | 4340 |
| 2 | 1 | 65.9 | 75.9 | 18 / 35 | 4738 |
| 3 | 1 | 67.1 | 84.1 | 22 / 35 | 4190 |
| 4 | 1 | 64.1 | 73.3 | 16 / 35 | 4340 |
| 5 | 1 | 66.0 | 78.1 | 18 / 35 | 4468 |
| 6 | 1 | 68.0 | 83.5 | 24 / 35 | 4696 |
| 7 | 1 | 69.1 | 85.1 | 25 / 35 | 5064 |
| 8 | 1 | 66.2 | 78.7 | 20 / 35 | 4474 |
| 9 | 1 | 67.5 | 84.8 | 21 / 35 | 4506 |
| 10 | 1 | 64.0 | 74.3 | 15 / 35 | 4142 |
| 11 | 1 | 64.8 | 77.5 | 16 / 35 | 4154 |
| 12 | 1 | 64.4 | 75.6 | 17 / 35 | 4198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 66 | 77% |
| myl.nano.Graviton 1.10 | 60 | 85% |
| ntc.Opposite 1.5 | 34 | 85% |
| disan.Chair 2.2.0 | 26 | 81% |
| donjezza.Muncho 1.0 | 24 | 92% |
| DBall.NUKE 0.1 | 23 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 91% |
| pfvicm.Sobieski 7.2.3b | 14 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 21% | 85 |
| myl.nano.Graviton 1.10 | 36 | 19% | 84 |
| pfvicm.Sobieski 7.2.3b | 34 | 18% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 33 | 17% | 65 |
| ntc.Opposite 1.5 | 23 | 12% | 52 |
| donjezza.Muncho 1.0 | 9 | 5% | 22 |
| disan.Chair 2.2.0 | 7 | 4% | 18 |
| DBall.NUKE 0.1 | 5 | 3% | 25 |
| pbg.R2D2 1.0 | 4 | 2% | 18 |

## Melee bench: F13

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 70.2 | 147 / 420 | 3.69 | 14.9% | 46566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.7 | 14.9% | 147 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 86 |
| kawigi.micro.Shiz 1.1 | 3.1 | 13.8% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 61 |
| yagami.Tidus 0.11 | 4.4 | 12.2% | 20 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 25 |
| stelo.MirrorNano 1.3 | 7.5 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 73.7 | 11 / 35 | 4210 |
| 2 | 1 | 66.3 | 78.4 | 18 / 35 | 4420 |
| 3 | 2 | 62.1 | 64.8 | 12 / 35 | 4013 |
| 4 | 1 | 61.8 | 68.9 | 10 / 35 | 3716 |
| 5 | 1 | 64.4 | 74.0 | 14 / 35 | 3947 |
| 6 | 2 | 60.4 | 66.0 | 7 / 35 | 3712 |
| 7 | 2 | 62.0 | 67.3 | 14 / 35 | 3504 |
| 8 | 3 | 61.4 | 65.4 | 12 / 35 | 3585 |
| 9 | 1 | 63.8 | 72.7 | 14 / 35 | 3751 |
| 10 | 1 | 65.2 | 75.9 | 15 / 35 | 4128 |
| 11 | 2 | 62.1 | 67.0 | 10 / 35 | 3893 |
| 12 | 3 | 62.2 | 67.9 | 10 / 35 | 3687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 61 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 71% |
| oog.melee.Capulet 1.2 | 51 | 55% |
| yagami.Tidus 0.11 | 25 | 84% |
| ejb.Polaris 1.0.1 | 19 | 84% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 275 of 420 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 105 | 38% | 144 |
| yagami.Tidus 0.11 | 39 | 14% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 14% | 73 |
| kawigi.micro.Shiz 1.1 | 34 | 12% | 54 |
| ejb.Polaris 1.0.1 | 28 | 10% | 47 |
| stelo.MirrorNano 1.3 | 14 | 5% | 20 |
| step.nanoPri 1.0 | 10 | 4% | 11 |
| kurios.DOSexe .9a | 7 | 3% | 8 |

## Melee bench: F14

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.0 | 242 / 420 | 2.98 | 16.7% | 47617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.1 | 16.7% | 242 |
| wee.Gem 1.8.4 | 3.0 | 12.3% | 63 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 40 |
| wompi.Quokka 1.6 | 3.7 | 11.6% | 29 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 17 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 13 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 3 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 64.4 | 15 / 35 | 3513 |
| 2 | 1 | 65.9 | 80.0 | 18 / 35 | 4460 |
| 3 | 1 | 69.5 | 91.1 | 27 / 35 | 4773 |
| 4 | 1 | 66.1 | 84.8 | 23 / 35 | 3771 |
| 5 | 1 | 63.2 | 71.1 | 16 / 35 | 3855 |
| 6 | 1 | 60.0 | 64.8 | 12 / 35 | 3758 |
| 7 | 1 | 66.1 | 81.0 | 19 / 35 | 4254 |
| 8 | 1 | 64.9 | 80.6 | 22 / 35 | 3507 |
| 9 | 1 | 63.8 | 73.7 | 20 / 35 | 3783 |
| 10 | 1 | 65.6 | 79.7 | 24 / 35 | 3598 |
| 11 | 1 | 67.0 | 81.9 | 22 / 35 | 4370 |
| 12 | 1 | 66.7 | 82.9 | 24 / 35 | 3975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 87 | 84% |
| wee.Gem 1.8.4 | 75 | 84% |
| wompi.Quokka 1.6 | 42 | 90% |
| ratosh.Nobo 0.21 | 28 | 96% |
| m3thos.Eva00 1.1 | 22 | 95% |
| bayen.UbaMicro 1.4 | 15 | 80% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 180 of 420 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 31 | 17% | 104 |
| wee.Gem 1.8.4 | 27 | 15% | 88 |
| wompi.Quokka 1.6 | 27 | 15% | 54 |
| maribo.FollowFire 1 | 27 | 15% | 32 |
| bayen.UbaMicro 1.4 | 20 | 11% | 32 |
| ratosh.Nobo 0.21 | 19 | 11% | 42 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 6% | 19 |
| stelo.MyAgileRobot 0.2 | 10 | 6% | 15 |
| m3thos.Eva00 1.1 | 7 | 4% | 26 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 81.4 | 92 / 420 | 2.67 | 18.3% | 80793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.6% | 286 |
| hadur117.micro.SaorS 0.1 | 2.0 | 18.3% | 92 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 29 |
| ayk.WallHugger 1.0 | 4.5 | 9.4% | 6 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.1% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.9 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.6% | 2 |
| sample.SittingDuck 1.0 | 9.1 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.6 | 81.6 | 11 / 35 | 6667 |
| 2 | 2 | 69.3 | 80.3 | 10 / 35 | 6912 |
| 3 | 2 | 69.2 | 83.2 | 7 / 35 | 6451 |
| 4 | 2 | 68.6 | 79.7 | 6 / 35 | 6640 |
| 5 | 2 | 69.8 | 84.8 | 7 / 35 | 6867 |
| 6 | 2 | 69.6 | 85.4 | 8 / 35 | 6744 |
| 7 | 2 | 69.0 | 81.3 | 6 / 35 | 6952 |
| 8 | 2 | 69.9 | 82.2 | 10 / 35 | 6958 |
| 9 | 2 | 68.1 | 79.4 | 5 / 35 | 6546 |
| 10 | 2 | 68.1 | 78.1 | 7 / 35 | 6786 |
| 11 | 2 | 68.8 | 79.4 | 8 / 35 | 7033 |
| 12 | 2 | 68.4 | 81.9 | 7 / 35 | 6237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 229 | 18% |
| mz.NanoGod 2.02 | 36 | 61% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| drd.Dreadknoght 0.9 | 10 | 80% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 329 of 420 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 237 | 72% | 283 |
| mz.NanoGod 2.02 | 50 | 15% | 74 |
| exauge.GateKeeper 1.1.121g | 21 | 6% | 28 |
| ayk.WallHugger 1.0 | 9 | 3% | 11 |
| stuff.Vlad 0.1 | 5 | 2% | 9 |
| stelo.PianistNano 1.2 | 4 | 1% | 4 |
| drd.Dreadknoght 0.9 | 3 | 1% | 11 |

## Melee bench: F16

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 73.5 | 220 / 420 | 3.38 | 16.3% | 52453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 16.3% | 220 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.6% | 37 |
| dummy.micro.Sparrow 2.5 | 3.4 | 11.9% | 52 |
| bvh.micro.Freya 0.3 | 3.9 | 11.3% | 32 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.4 | 11.0% | 44 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.3% | 11 |
| conscience.Electron 1.3g | 6.7 | 8.5% | 4 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 19 |
| dl.BetterWalls 1.0 | 8.6 | 6.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.3 | 19 / 35 | 4609 |
| 2 | 1 | 63.3 | 68.6 | 18 / 35 | 4396 |
| 3 | 1 | 65.8 | 77.5 | 18 / 35 | 4670 |
| 4 | 1 | 63.7 | 73.3 | 18 / 35 | 4117 |
| 5 | 1 | 66.0 | 77.5 | 21 / 35 | 4755 |
| 6 | 1 | 63.0 | 70.2 | 17 / 35 | 3893 |
| 7 | 1 | 67.0 | 83.8 | 23 / 35 | 4366 |
| 8 | 1 | 63.7 | 72.4 | 17 / 35 | 4269 |
| 9 | 1 | 60.8 | 62.5 | 15 / 35 | 4150 |
| 10 | 1 | 62.6 | 69.2 | 16 / 35 | 4100 |
| 11 | 1 | 65.1 | 75.2 | 18 / 35 | 4656 |
| 12 | 1 | 66.0 | 78.1 | 20 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 78 | 90% |
| dummy.micro.Sparrow 2.5 | 54 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 46 | 78% |
| bvh.micro.Freya 0.3 | 32 | 91% |
| ap.Frederick 1.1 | 23 | 78% |
| stelo.MirrorMicro 1.0 | 17 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 201 of 420 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 33 | 16% | 82 |
| voidious.micro.BlitzBat 1.05 | 31 | 15% | 96 |
| davidalves.net.DuelistMicroMelee 1.4 | 30 | 15% | 75 |
| conscience.Electron 1.3g | 27 | 13% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 27 | 13% | 28 |
| bvh.micro.Freya 0.3 | 19 | 9% | 30 |
| dl.BetterWalls 1.0 | 18 | 9% | 38 |
| stelo.MirrorMicro 1.0 | 11 | 5% | 36 |
| ap.Frederick 1.1 | 5 | 2% | 0 |

## Melee bench: F17

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.4 | 287 / 420 | 2.31 | 20.3% | 77305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 20.3% | 287 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 50 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 30 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.3% | 21 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 12 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.1 | 6.4% | 7 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.8% | 7 |
| sample.Corners 1.0 | 9.4 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.1 | 23 / 35 | 5796 |
| 2 | 1 | 70.4 | 84.4 | 22 / 35 | 6821 |
| 3 | 1 | 67.9 | 80.0 | 18 / 35 | 5912 |
| 4 | 1 | 72.7 | 92.4 | 28 / 35 | 6976 |
| 5 | 1 | 69.4 | 80.6 | 21 / 35 | 6572 |
| 6 | 1 | 69.6 | 82.5 | 24 / 35 | 6327 |
| 7 | 1 | 71.1 | 87.0 | 26 / 35 | 6807 |
| 8 | 1 | 69.5 | 82.5 | 24 / 35 | 6192 |
| 9 | 1 | 70.9 | 89.5 | 28 / 35 | 5795 |
| 10 | 1 | 71.9 | 91.1 | 26 / 35 | 6904 |
| 11 | 1 | 69.9 | 85.1 | 23 / 35 | 6489 |
| 12 | 1 | 70.4 | 84.4 | 24 / 35 | 6714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 105 | 84% |
| sul.Lunar 1.1 | 87 | 99% |
| supersample.SuperBoxBot 1.0 | 47 | 87% |
| dsw.StaticD 1.0 | 21 | 95% |
| sample.MyFirstRobot 1.0 | 15 | 80% |
| mme.NikeEnhanced 2.0 | 14 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| sample.Corners 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |

Hadur died in 139 of 420 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 37 | 27% | 128 |
| supersample.SuperBoxBot 1.0 | 32 | 23% | 71 |
| sul.Lunar 1.1 | 14 | 10% | 93 |
| dsw.StaticD 1.0 | 12 | 9% | 33 |
| mme.NikeEnhanced 2.0 | 12 | 9% | 29 |
| sample.Corners 1.0 | 9 | 6% | 19 |
| tlp.ThreeLeggedPig 1 | 9 | 6% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 5% | 18 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 19 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorS 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.4 | 204 / 420 | 3.03 | 17.3% | 68569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS 0.1 | 1.0 | 17.3% | 204 |
| radnor.DoctorBob 1.42 | 2.0 | 13.9% | 66 |
| mld.Wisdom 1.0 | 3.5 | 12.3% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 11.7% | 56 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 25 |
| KiraNL.Chupacabra 0.4 | 5.4 | 10.2% | 18 |
| sample.Walls 1.0 | 7.4 | 7.7% | 12 |
| GarmBox.Oranges 1.0 | 7.7 | 7.5% | 1 |
| jangs.ns51 1.0 | 8.9 | 5.8% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 78.4 | 21 / 35 | 5779 |
| 2 | 1 | 63.7 | 68.9 | 13 / 35 | 5302 |
| 3 | 1 | 68.3 | 84.4 | 21 / 35 | 6071 |
| 4 | 1 | 67.0 | 80.6 | 16 / 35 | 5879 |
| 5 | 1 | 65.4 | 74.9 | 17 / 35 | 5630 |
| 6 | 1 | 69.3 | 84.1 | 21 / 35 | 6657 |
| 7 | 1 | 64.2 | 71.4 | 16 / 35 | 5032 |
| 8 | 1 | 65.7 | 75.9 | 16 / 35 | 5456 |
| 9 | 1 | 66.9 | 78.4 | 17 / 35 | 5593 |
| 10 | 1 | 66.4 | 79.4 | 13 / 35 | 5763 |
| 11 | 1 | 65.7 | 74.9 | 16 / 35 | 5532 |
| 12 | 1 | 66.3 | 77.5 | 17 / 35 | 5875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 85 | 91% |
| radnor.DoctorBob 1.42 | 74 | 58% |
| mld.Wisdom 1.0 | 33 | 76% |
| amz.NanoClone 1.41 | 23 | 65% |
| KiraNL.Chupacabra 0.4 | 16 | 75% |
| sample.Walls 1.0 | 13 | 92% |
| jangs.ns51 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 8 | 88% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 218 of 420 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 68 | 31% | 115 |
| mld.Wisdom 1.0 | 45 | 21% | 73 |
| KiraNL.Chupacabra 0.4 | 33 | 15% | 50 |
| amz.NanoClone 1.41 | 28 | 13% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 11% | 103 |
| GarmBox.Oranges 1.0 | 8 | 4% | 10 |
| jangs.ns51 1.0 | 6 | 3% | 17 |
| sample.Walls 1.0 | 5 | 2% | 12 |

