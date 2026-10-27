# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 92.0 | 334 / 420 | 1.72 | 22.2% | 87247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 22.2% | 334 |
| mz.AntiGrav 1.0 | 2.5 | 13.8% | 28 |
| radnor.DoctorBob 1.42 | 2.8 | 13.6% | 28 |
| mld.Infinity 2.2 | 3.8 | 12.3% | 20 |
| amz.NanoClone 1.41 | 4.9 | 10.1% | 7 |
| sample.Walls 1.0 | 6.8 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.8 | 24 / 35 | 6411 |
| 2 | 1 | 72.8 | 88.6 | 28 / 35 | 7527 |
| 3 | 1 | 73.1 | 94.3 | 28 / 35 | 7091 |
| 4 | 1 | 74.1 | 96.5 | 29 / 35 | 7501 |
| 5 | 1 | 72.6 | 89.2 | 27 / 35 | 7461 |
| 6 | 1 | 73.1 | 88.9 | 26 / 35 | 7524 |
| 7 | 1 | 71.9 | 89.2 | 27 / 35 | 6467 |
| 8 | 1 | 73.5 | 94.0 | 30 / 35 | 7532 |
| 9 | 1 | 73.6 | 96.2 | 31 / 35 | 7239 |
| 10 | 1 | 74.8 | 95.6 | 31 / 35 | 8232 |
| 11 | 1 | 71.8 | 89.8 | 26 / 35 | 6550 |
| 12 | 1 | 72.9 | 90.5 | 27 / 35 | 7712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 140 | 96% |
| mld.Infinity 2.2 | 91 | 93% |
| radnor.DoctorBob 1.42 | 80 | 91% |
| amz.NanoClone 1.41 | 17 | 88% |
| jangs.ns51 1.0 | 10 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 86 of 420 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 36% | 143 |
| mz.AntiGrav 1.0 | 16 | 19% | 156 |
| mld.Infinity 2.2 | 15 | 17% | 34 |
| amz.NanoClone 1.41 | 11 | 13% | 30 |
| sample.Walls 1.0 | 7 | 8% | 16 |
| arthord.MannyPacquiao Beta | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 15 |
| jangs.ns51 1.0 | 1 | 1% | 15 |

## Melee bench: F02

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.5 | 290 / 420 | 2.21 | 19.1% | 63194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 19.1% | 290 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.5% | 80 |
| mld.DustBunny 3.8 | 2.8 | 12.9% | 20 |
| maribo.melee.BMV 0.1 | 4.3 | 9.8% | 5 |
| zyx.nano.Ant 1.1 | 6.3 | 8.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.3% | 8 |
| fullsail.SweetTea 1.1 | 7.6 | 7.1% | 4 |
| bzdp.BoxCar 2.0 | 8.0 | 7.0% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.3 | 25 / 35 | 5599 |
| 2 | 1 | 69.6 | 88.9 | 27 / 35 | 5141 |
| 3 | 1 | 67.1 | 82.2 | 22 / 35 | 4754 |
| 4 | 1 | 68.7 | 88.3 | 23 / 35 | 5055 |
| 5 | 1 | 71.3 | 94.6 | 28 / 35 | 6128 |
| 6 | 1 | 69.9 | 90.2 | 26 / 35 | 5359 |
| 7 | 1 | 67.0 | 82.5 | 22 / 35 | 4900 |
| 8 | 1 | 70.3 | 94.0 | 27 / 35 | 5407 |
| 9 | 1 | 69.8 | 93.3 | 25 / 35 | 5174 |
| 10 | 2 | 60.8 | 54.0 | 14 / 35 | 4992 |
| 11 | 1 | 69.4 | 89.5 | 24 / 35 | 5283 |
| 12 | 1 | 70.7 | 94.3 | 27 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 175 | 82% |
| mld.DustBunny 3.8 | 85 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 94% |
| maribo.melee.BMV 0.1 | 16 | 94% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| fullsail.SweetTea 1.1 | 10 | 100% |
| zyx.nano.Ant 1.1 | 7 | 100% |
| bzdp.BoxCar 2.0 | 5 | 100% |

Hadur died in 132 of 420 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 50 | 38% | 186 |
| zyx.nano.Ant 1.1 | 22 | 17% | 33 |
| mld.DustBunny 3.8 | 20 | 15% | 89 |
| cs.Grudge 1.0 | 13 | 10% | 13 |
| maribo.melee.BMV 0.1 | 8 | 6% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 5% | 23 |
| fullsail.SweetTea 1.1 | 6 | 5% | 13 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 33 |
| bzdp.BoxCar 2.0 | 2 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.6 | 299 / 420 | 2.20 | 20.5% | 72402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.5% | 299 |
| myl.micro.Troodon 1.10 | 2.1 | 13.5% | 50 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 12.0% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 27 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.0% | 19 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 8 |
| sample.Fire 1.0 | 9.4 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 91.4 | 28 / 35 | 6220 |
| 2 | 1 | 70.7 | 85.7 | 24 / 35 | 6018 |
| 3 | 1 | 69.9 | 84.1 | 24 / 35 | 6152 |
| 4 | 1 | 69.9 | 85.4 | 22 / 35 | 5867 |
| 5 | 1 | 70.1 | 85.1 | 24 / 35 | 6156 |
| 6 | 1 | 69.5 | 80.6 | 24 / 35 | 6173 |
| 7 | 1 | 69.1 | 81.6 | 21 / 35 | 5739 |
| 8 | 1 | 71.2 | 89.5 | 28 / 35 | 6076 |
| 9 | 1 | 68.9 | 81.3 | 21 / 35 | 5657 |
| 10 | 1 | 72.2 | 93.3 | 30 / 35 | 6010 |
| 11 | 1 | 72.0 | 90.8 | 27 / 35 | 6530 |
| 12 | 1 | 71.1 | 90.5 | 26 / 35 | 5804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 96 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 74 | 95% |
| cb.nano.Insomnia 1.0 | 56 | 86% |
| myl.nano.KomoriNinja 1.1 | 47 | 94% |
| sp.Nanos.Ember 1.1 | 27 | 81% |
| fm.mammillarias 1.3 | 16 | 94% |
| sample.Fire 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 123 of 420 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 26 | 21% | 30 |
| myl.micro.Troodon 1.10 | 24 | 20% | 136 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 19% | 69 |
| myl.nano.KomoriNinja 1.1 | 14 | 11% | 79 |
| fm.mammillarias 1.3 | 12 | 10% | 23 |
| sp.Nanos.Ember 1.1 | 9 | 7% | 38 |
| sample.Fire 1.0 | 6 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 21 |
| sample.Tracker 1.0 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.3 | 314 / 420 | 2.06 | 20.8% | 77731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.8% | 314 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 19 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.0% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.3% | 30 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.0% | 8 |
| yk.JahMicro 1.0 | 7.4 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.4 | 27 / 35 | 6731 |
| 2 | 1 | 70.5 | 90.2 | 25 / 35 | 5920 |
| 3 | 1 | 70.0 | 83.8 | 24 / 35 | 6371 |
| 4 | 1 | 70.5 | 87.0 | 27 / 35 | 6489 |
| 5 | 1 | 69.2 | 84.1 | 23 / 35 | 6223 |
| 6 | 1 | 70.6 | 87.9 | 25 / 35 | 6571 |
| 7 | 1 | 71.9 | 91.7 | 29 / 35 | 6883 |
| 8 | 1 | 70.9 | 87.3 | 28 / 35 | 6546 |
| 9 | 1 | 70.1 | 85.7 | 26 / 35 | 6368 |
| 10 | 1 | 69.8 | 84.4 | 24 / 35 | 6337 |
| 11 | 1 | 71.2 | 89.5 | 27 / 35 | 6705 |
| 12 | 1 | 72.5 | 95.9 | 29 / 35 | 6587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 119 | 93% |
| stelo.SoJNanoMelee 1.1 | 94 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 34 | 88% |
| tvv.micro.Antares 1.1.1 | 33 | 91% |
| tj.zombie1n 1.0.1 | 32 | 81% |
| yk.JahMicro 1.0 | 11 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 9 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |

Hadur died in 108 of 420 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 28% | 155 |
| stelo.SoJNanoMelee 1.1 | 21 | 19% | 71 |
| tvv.micro.Antares 1.1.1 | 16 | 15% | 54 |
| tj.zombie1n 1.0.1 | 12 | 11% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 9% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 7% | 47 |
| yk.JahMicro 1.0 | 4 | 4% | 16 |
| repositorio.NanoStep 1.0 | 3 | 3% | 25 |
| sample.VelociRobot 1.0 | 2 | 2% | 7 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.0 | 197 / 420 | 3.88 | 15.7% | 58224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 15.7% | 197 |
| oog.melee.Corsair 1.0 | 2.1 | 12.7% | 63 |
| ahf.NanoAndrew .4 | 3.4 | 11.5% | 47 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.5% | 38 |
| EBBU.Sim2 1.02 | 5.3 | 10.1% | 17 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 28 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.1% | 16 |
| robar.nano.Assertive_Melee 0.2 | 7.1 | 8.7% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 68.3 | 14 / 35 | 4620 |
| 2 | 2 | 60.1 | 59.4 | 11 / 35 | 4497 |
| 3 | 1 | 65.6 | 73.0 | 21 / 35 | 5389 |
| 4 | 1 | 65.7 | 73.7 | 22 / 35 | 4913 |
| 5 | 1 | 61.1 | 59.4 | 11 / 35 | 4974 |
| 6 | 1 | 62.8 | 67.3 | 15 / 35 | 4777 |
| 7 | 1 | 62.1 | 64.8 | 19 / 35 | 4670 |
| 8 | 1 | 61.9 | 69.2 | 15 / 35 | 4337 |
| 9 | 1 | 65.6 | 75.9 | 18 / 35 | 5332 |
| 10 | 1 | 65.3 | 72.1 | 20 / 35 | 5135 |
| 11 | 1 | 64.7 | 70.8 | 17 / 35 | 5195 |
| 12 | 1 | 60.4 | 62.2 | 14 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 60 | 88% |
| oog.melee.Corsair 1.0 | 58 | 69% |
| ahf.NanoAndrew .4 | 41 | 100% |
| sam.Samspin 1.0 | 24 | 92% |
| EBBU.Sim2 1.02 | 17 | 94% |
| robar.nano.Assertive_Melee 0.2 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| sample.TrackFire 1.0 | 7 | 100% |

Hadur died in 224 of 420 rounds, at a mean tick of 377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 17% | 85 |
| oog.melee.Corsair 1.0 | 37 | 17% | 86 |
| bwbaugh.nano.Tirunculus 0.0.0a | 31 | 14% | 31 |
| robar.nano.Assertive_Melee 0.2 | 26 | 12% | 40 |
| ahf.NanoAndrew .4 | 22 | 10% | 64 |
| zyx.nano.BacillusComma 1.0 | 22 | 10% | 30 |
| EBBU.Sim2 1.02 | 19 | 8% | 39 |
| sam.Samspin 1.0 | 19 | 8% | 27 |
| sample.TrackFire 1.0 | 10 | 4% | 17 |

## Melee bench: F06

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.1 | 316 / 420 | 1.98 | 20.1% | 65890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.1% | 316 |
| d414.nano.Quantum 1.0.0 | 2.1 | 13.8% | 36 |
| gh.nano.Grofvuil 0.2 | 2.9 | 11.6% | 16 |
| oog.melee.CapuletDroid 1.1 | 5.1 | 9.4% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.4 | 8.9% | 8 |
| arthord.NanoSatanMelee Beta | 5.4 | 9.0% | 10 |
| fm.claire 1.7 | 6.3 | 8.4% | 3 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 6 |
| pa.Improved 1.0 | 9.1 | 6.1% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.5 | 26 / 35 | 5071 |
| 2 | 1 | 70.1 | 91.7 | 24 / 35 | 5430 |
| 3 | 1 | 69.8 | 86.3 | 24 / 35 | 5933 |
| 4 | 1 | 69.3 | 87.0 | 27 / 35 | 5193 |
| 5 | 1 | 69.8 | 90.8 | 27 / 35 | 5170 |
| 6 | 1 | 69.4 | 87.0 | 24 / 35 | 5625 |
| 7 | 1 | 70.5 | 93.7 | 26 / 35 | 5531 |
| 8 | 1 | 69.0 | 83.8 | 26 / 35 | 5415 |
| 9 | 1 | 68.7 | 83.5 | 25 / 35 | 5180 |
| 10 | 1 | 71.5 | 94.9 | 30 / 35 | 5767 |
| 11 | 1 | 72.2 | 97.5 | 30 / 35 | 6237 |
| 12 | 1 | 70.0 | 90.2 | 27 / 35 | 5338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 125 | 90% |
| oog.melee.CapuletDroid 1.1 | 79 | 95% |
| gh.nano.Grofvuil 0.2 | 41 | 98% |
| arthord.NanoSatanMelee Beta | 38 | 84% |
| sample.SpinBot 1.0 | 18 | 100% |
| winamp32.micro.MicroMacro 1.0 | 17 | 94% |
| kurios.DOSexe .9b | 13 | 85% |
| fm.claire 1.7 | 9 | 100% |
| pa.Improved 1.0 | 4 | 50% |

Hadur died in 110 of 420 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 25% | 132 |
| arthord.NanoSatanMelee Beta | 22 | 20% | 56 |
| gh.nano.Grofvuil 0.2 | 17 | 15% | 74 |
| oog.melee.CapuletDroid 1.1 | 17 | 15% | 32 |
| winamp32.micro.MicroMacro 1.0 | 8 | 7% | 37 |
| fm.claire 1.7 | 7 | 6% | 26 |
| kurios.DOSexe .9b | 6 | 5% | 35 |
| pa.Improved 1.0 | 3 | 3% | 13 |
| sample.SpinBot 1.0 | 2 | 2% | 11 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.8 | 194 / 420 | 2.46 | 18.4% | 67988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.4% | 194 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 86 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 86 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.4% | 38 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 9 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.5% | 4 |
| el.JumpShoot 0.2 | 7.9 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.4 | 5.8% | 0 |
| fire219.CatBot 1.0 | 8.4 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.3 | 19 / 35 | 5584 |
| 2 | 1 | 66.5 | 80.0 | 9 / 35 | 5501 |
| 3 | 1 | 69.7 | 90.2 | 17 / 35 | 6024 |
| 4 | 1 | 70.1 | 89.2 | 19 / 35 | 5821 |
| 5 | 1 | 64.6 | 75.2 | 11 / 35 | 4963 |
| 6 | 1 | 67.6 | 80.3 | 14 / 35 | 5720 |
| 7 | 1 | 66.2 | 77.1 | 14 / 35 | 5191 |
| 8 | 1 | 67.9 | 84.1 | 14 / 35 | 5520 |
| 9 | 1 | 69.3 | 84.8 | 19 / 35 | 6350 |
| 10 | 1 | 70.5 | 91.4 | 23 / 35 | 5601 |
| 11 | 1 | 68.0 | 82.9 | 19 / 35 | 5571 |
| 12 | 1 | 68.3 | 81.6 | 16 / 35 | 6142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 95 | 42% |
| spinnercat.micro.Tyger 0.1 | 95 | 88% |
| gh.micro.Gruweltje 0.7 | 72 | 29% |
| DBall.Anarchy 0.1 | 26 | 100% |
| el.JumpShoot 0.2 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 228 of 420 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 85 | 37% | 136 |
| gh.micro.Gruweltje 0.7 | 79 | 35% | 112 |
| spinnercat.micro.Tyger 0.1 | 30 | 13% | 97 |
| el.JumpShoot 0.2 | 8 | 4% | 11 |
| fire219.CatBot 1.0 | 8 | 4% | 8 |
| caimano.Furia_Ceca 0.22 | 7 | 3% | 12 |
| acogdev.alpha 0.2 | 4 | 2% | 10 |
| DBall.Anarchy 0.1 | 3 | 1% | 25 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 8 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 73.6 | 235 / 420 | 3.38 | 17.1% | 64262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.3 | 17.1% | 235 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 77 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.9 | 12.9% | 58 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.9% | 12 |
| germ.TheMind .2 | 5.3 | 9.3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.6% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 8.2% | 7 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.2 | 20 / 35 | 5070 |
| 2 | 1 | 67.1 | 76.2 | 23 / 35 | 5411 |
| 3 | 1 | 66.7 | 74.6 | 21 / 35 | 5645 |
| 4 | 2 | 64.0 | 67.3 | 14 / 35 | 5389 |
| 5 | 1 | 64.6 | 70.2 | 18 / 35 | 4917 |
| 6 | 1 | 65.4 | 73.7 | 19 / 35 | 5036 |
| 7 | 1 | 64.9 | 70.2 | 20 / 35 | 5355 |
| 8 | 1 | 69.0 | 81.6 | 24 / 35 | 5904 |
| 9 | 1 | 66.3 | 75.6 | 19 / 35 | 5770 |
| 10 | 2 | 62.8 | 64.8 | 15 / 35 | 5112 |
| 11 | 2 | 63.4 | 66.0 | 16 / 35 | 4975 |
| 12 | 1 | 70.0 | 87.9 | 26 / 35 | 5678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 155 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 77% |
| qualidafial.MajorDick 1.0.1 | 20 | 100% |
| germ.TheMind .2 | 20 | 95% |
| awesomeness.Elite 1.0 | 16 | 81% |
| stelo.UntouchableNano 1.3 | 12 | 92% |
| sample.Crazy 1.0 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 83% |

Hadur died in 185 of 420 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 46% | 215 |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 18% | 60 |
| awesomeness.Elite 1.0 | 15 | 8% | 32 |
| qualidafial.MajorDick 1.0.1 | 15 | 8% | 23 |
| lrem.micro.MoggFanatic 0.2 | 12 | 6% | 18 |
| germ.TheMind .2 | 11 | 6% | 31 |
| stelo.UntouchableNano 1.3 | 6 | 3% | 16 |
| sample.Crazy 1.0 | 4 | 2% | 11 |
| mym.EdgeStalker 1.0 | 3 | 2% | 8 |

## Melee bench: F09

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.0 | 334 / 420 | 1.72 | 20.8% | 61519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.8% | 334 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 19 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 21 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 9.7% | 3 |
| ratosh.Wesco 1.4 | 7.6 | 8.1% | 1 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 7.5% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 98.4 | 32 / 35 | 5418 |
| 2 | 1 | 69.3 | 83.2 | 25 / 35 | 4655 |
| 3 | 1 | 70.2 | 87.9 | 23 / 35 | 4995 |
| 4 | 1 | 71.3 | 91.7 | 27 / 35 | 5146 |
| 5 | 1 | 70.7 | 90.2 | 27 / 35 | 5049 |
| 6 | 1 | 72.8 | 96.2 | 30 / 35 | 5548 |
| 7 | 1 | 73.2 | 98.4 | 31 / 35 | 5595 |
| 8 | 1 | 72.0 | 94.0 | 29 / 35 | 5416 |
| 9 | 1 | 71.2 | 89.8 | 25 / 35 | 5389 |
| 10 | 1 | 72.6 | 98.1 | 32 / 35 | 5045 |
| 11 | 1 | 71.1 | 92.7 | 28 / 35 | 4771 |
| 12 | 1 | 68.9 | 83.5 | 25 / 35 | 4492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 147 | 95% |
| nz.jdc.nano.GridFu 1.0 | 74 | 96% |
| maribo.IotaCT 1.1 | 31 | 68% |
| stelo.PatternRobot 1.0 | 30 | 90% |
| timmit.nano.TimDog 0.33 | 29 | 93% |
| spinnercat.Omen 1.0 | 20 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 100% |
| ratosh.Wesco 1.4 | 10 | 100% |

Hadur died in 87 of 420 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 20 | 23% | 65 |
| rz.HawkOnFire 0.1 | 18 | 21% | 117 |
| maribo.IotaCT 1.1 | 17 | 20% | 47 |
| stelo.PatternRobot 1.0 | 13 | 15% | 32 |
| ratosh.Wesco 1.4 | 7 | 8% | 25 |
| nz.jdc.nano.GridFu 1.0 | 5 | 6% | 100 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 17 |
| spinnercat.Omen 1.0 | 2 | 2% | 11 |

## Melee bench: F10

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.6 | 361 / 420 | 1.67 | 21.8% | 79268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 21.8% | 361 |
| tvv.nano.Polaris 1.2 | 2.4 | 11.7% | 17 |
| baal.nano.N 1.42 | 2.7 | 11.1% | 9 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 10 |
| sanja.First 0.1 | 6.1 | 8.5% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 8 |
| amk.Punbot.Punbot 0.01 | 8.4 | 7.0% | 4 |
| sample.RamFire 1.0 | 9.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 92.4 | 31 / 35 | 6849 |
| 2 | 1 | 72.0 | 93.3 | 31 / 35 | 6591 |
| 3 | 1 | 73.3 | 94.9 | 32 / 35 | 7177 |
| 4 | 1 | 71.4 | 92.4 | 30 / 35 | 6298 |
| 5 | 1 | 72.0 | 90.8 | 30 / 35 | 7046 |
| 6 | 1 | 70.9 | 93.7 | 28 / 35 | 5950 |
| 7 | 1 | 70.8 | 89.5 | 30 / 35 | 6256 |
| 8 | 1 | 68.9 | 85.7 | 26 / 35 | 5871 |
| 9 | 1 | 72.6 | 96.8 | 30 / 35 | 6802 |
| 10 | 1 | 73.3 | 98.1 | 33 / 35 | 7097 |
| 11 | 1 | 71.3 | 88.3 | 28 / 35 | 6669 |
| 12 | 1 | 72.7 | 95.2 | 32 / 35 | 6662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 76 | 93% |
| baal.nano.N 1.42 | 69 | 96% |
| cvt.Firsty 1.0 | 64 | 97% |
| sanja.First 0.1 | 53 | 98% |
| zyx.micro.Ant 1.1 | 35 | 97% |
| Grystrion.TrackerWO 1.0 | 31 | 97% |
| amk.Punbot.Punbot 0.01 | 27 | 100% |
| squidM.TentalceMeleeNano 1.1 | 15 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 60 of 420 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 20% | 62 |
| baal.nano.N 1.42 | 9 | 15% | 72 |
| Grystrion.TrackerWO 1.0 | 9 | 15% | 40 |
| tvv.nano.Polaris 1.2 | 8 | 13% | 109 |
| cvt.Firsty 1.0 | 7 | 12% | 49 |
| sample.RamFire 1.0 | 6 | 10% | 8 |
| sanja.First 0.1 | 5 | 8% | 48 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 14 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.4 | 173 / 420 | 3.49 | 16.1% | 62657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.5% | 148 |
| hadur117.micro.SaorLA 0.1 | 1.5 | 16.1% | 173 |
| cs.Wren 1.0 | 3.3 | 12.5% | 41 |
| js.PinBall 1.6 | 4.3 | 10.9% | 18 |
| mz.Cork 0.1 | 4.4 | 10.8% | 17 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 4 |
| evd.X1 0.01 | 6.9 | 8.1% | 8 |
| jsal.Jsalbot 1.0 | 7.9 | 6.9% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 68.6 | 9 / 35 | 5201 |
| 2 | 2 | 59.9 | 59.4 | 10 / 35 | 4875 |
| 3 | 1 | 66.9 | 77.1 | 18 / 35 | 5766 |
| 4 | 1 | 66.6 | 79.4 | 20 / 35 | 5338 |
| 5 | 2 | 63.2 | 68.6 | 14 / 35 | 5098 |
| 6 | 1 | 66.4 | 78.7 | 16 / 35 | 5504 |
| 7 | 2 | 66.4 | 79.0 | 16 / 35 | 5009 |
| 8 | 1 | 63.6 | 68.6 | 15 / 35 | 5381 |
| 9 | 2 | 63.9 | 70.5 | 11 / 35 | 5461 |
| 10 | 2 | 62.9 | 70.8 | 10 / 35 | 4794 |
| 11 | 1 | 63.7 | 69.5 | 17 / 35 | 5138 |
| 12 | 1 | 65.6 | 78.1 | 17 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 148 | 52% |
| cs.Wren 1.0 | 46 | 85% |
| mz.Cork 0.1 | 28 | 93% |
| js.PinBall 1.6 | 15 | 80% |
| donjezza.Jezza 1.0 | 13 | 85% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 249 of 420 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 143 | 57% | 228 |
| cs.Wren 1.0 | 27 | 11% | 49 |
| PSW.Relentless 0.1 | 16 | 6% | 13 |
| evd.X1 0.01 | 15 | 6% | 17 |
| mz.Cork 0.1 | 14 | 6% | 42 |
| js.PinBall 1.6 | 14 | 6% | 32 |
| joe.ADinosaur 1.0 | 13 | 5% | 18 |
| jsal.Jsalbot 1.0 | 4 | 2% | 11 |
| donjezza.Jezza 1.0 | 3 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.6 | 287 / 420 | 2.39 | 19.0% | 57576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.0% | 287 |
| ntc.Opposite 1.5 | 3.4 | 11.0% | 21 |
| myl.nano.Graviton 1.10 | 3.5 | 11.1% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 10.4% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.5% | 23 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.6% | 7 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 13 |
| DBall.NUKE 0.1 | 7.4 | 8.2% | 7 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 11 |
| pbg.R2D2 1.0 | 9.6 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.0 | 24 / 35 | 5084 |
| 2 | 1 | 65.7 | 77.5 | 20 / 35 | 4534 |
| 3 | 1 | 67.4 | 82.5 | 23 / 35 | 4731 |
| 4 | 1 | 69.0 | 85.7 | 27 / 35 | 4870 |
| 5 | 1 | 68.2 | 83.5 | 22 / 35 | 4961 |
| 6 | 1 | 70.2 | 89.2 | 28 / 35 | 4968 |
| 7 | 1 | 67.8 | 84.1 | 21 / 35 | 4774 |
| 8 | 1 | 67.4 | 81.9 | 21 / 35 | 4755 |
| 9 | 1 | 68.6 | 86.0 | 27 / 35 | 4489 |
| 10 | 1 | 70.1 | 92.4 | 26 / 35 | 4999 |
| 11 | 1 | 66.2 | 78.7 | 22 / 35 | 4416 |
| 12 | 1 | 69.4 | 87.3 | 26 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 72 | 94% |
| myl.nano.Graviton 1.10 | 61 | 89% |
| ntc.Opposite 1.5 | 41 | 83% |
| DBall.NUKE 0.1 | 34 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 32 | 97% |
| donjezza.Muncho 1.0 | 27 | 89% |
| disan.Chair 2.2.0 | 26 | 88% |
| pfvicm.Sobieski 7.2.3b | 15 | 100% |
| pbg.R2D2 1.0 | 5 | 80% |

Hadur died in 135 of 420 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 26 | 19% | 50 |
| ntc.Opposite 1.5 | 25 | 19% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 16% | 46 |
| myl.nano.Graviton 1.10 | 20 | 15% | 75 |
| stelo.AreaTargetingBot 1.1 | 16 | 12% | 67 |
| disan.Chair 2.2.0 | 11 | 8% | 35 |
| donjezza.Muncho 1.0 | 7 | 5% | 23 |
| pbg.R2D2 1.0 | 5 | 4% | 16 |
| DBall.NUKE 0.1 | 3 | 2% | 44 |

## Melee bench: F13

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 72.9 | 191 / 420 | 3.44 | 16.1% | 53501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.2 | 16.1% | 191 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.5% | 47 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.1% | 63 |
| yagami.Tidus 0.11 | 4.5 | 11.8% | 25 |
| ejb.Polaris 1.0.1 | 5.6 | 11.0% | 18 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.5 | 18 / 35 | 4613 |
| 2 | 1 | 62.8 | 66.0 | 12 / 35 | 4202 |
| 3 | 1 | 65.1 | 69.2 | 18 / 35 | 4778 |
| 4 | 3 | 59.8 | 61.6 | 9 / 35 | 3832 |
| 5 | 1 | 65.7 | 73.3 | 17 / 35 | 4785 |
| 6 | 1 | 65.5 | 71.7 | 16 / 35 | 4816 |
| 7 | 1 | 66.0 | 76.2 | 13 / 35 | 4377 |
| 8 | 1 | 65.5 | 74.9 | 16 / 35 | 4712 |
| 9 | 1 | 66.3 | 74.9 | 19 / 35 | 4518 |
| 10 | 1 | 64.6 | 72.7 | 18 / 35 | 4194 |
| 11 | 1 | 66.4 | 79.7 | 18 / 35 | 4423 |
| 12 | 1 | 65.9 | 78.1 | 17 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 73 | 70% |
| kawigi.micro.Shiz 1.1 | 55 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 83% |
| yagami.Tidus 0.11 | 31 | 97% |
| ejb.Polaris 1.0.1 | 21 | 71% |

Hadur died in 229 of 420 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 94 | 41% | 164 |
| kawigi.micro.Shiz 1.1 | 29 | 13% | 56 |
| yagami.Tidus 0.11 | 27 | 12% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 11% | 65 |
| ejb.Polaris 1.0.1 | 24 | 10% | 48 |
| kurios.DOSexe .9a | 13 | 6% | 12 |
| step.nanoPri 1.0 | 9 | 4% | 9 |
| stelo.MirrorNano 1.3 | 8 | 3% | 12 |

## Melee bench: F14

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.8 | 276 / 420 | 2.64 | 18.1% | 56293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.1% | 276 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 43 |
| wee.Gem 1.8.4 | 3.2 | 11.6% | 47 |
| wompi.Quokka 1.6 | 4.1 | 11.1% | 18 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 8 |
| bayen.UbaMicro 1.4 | 6.3 | 9.3% | 12 |
| m3thos.Eva00 1.1 | 6.4 | 9.4% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.5 | 18 / 35 | 4650 |
| 2 | 1 | 67.0 | 82.9 | 21 / 35 | 4565 |
| 3 | 1 | 67.2 | 83.5 | 25 / 35 | 4484 |
| 4 | 1 | 68.2 | 85.1 | 26 / 35 | 4861 |
| 5 | 1 | 66.0 | 80.0 | 21 / 35 | 4421 |
| 6 | 1 | 67.1 | 82.5 | 23 / 35 | 4623 |
| 7 | 1 | 65.7 | 73.0 | 19 / 35 | 4990 |
| 8 | 1 | 69.1 | 87.0 | 28 / 35 | 4820 |
| 9 | 1 | 67.4 | 82.5 | 22 / 35 | 4865 |
| 10 | 1 | 67.9 | 85.7 | 25 / 35 | 4470 |
| 11 | 1 | 66.7 | 79.4 | 23 / 35 | 4573 |
| 12 | 1 | 68.2 | 83.5 | 25 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 108 | 93% |
| wee.Gem 1.8.4 | 83 | 94% |
| wompi.Quokka 1.6 | 37 | 95% |
| ratosh.Nobo 0.21 | 28 | 89% |
| bayen.UbaMicro 1.4 | 19 | 89% |
| m3thos.Eva00 1.1 | 16 | 81% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 147 of 420 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 21 | 14% | 106 |
| wompi.Quokka 1.6 | 20 | 14% | 53 |
| bayen.UbaMicro 1.4 | 20 | 14% | 41 |
| wee.Gem 1.8.4 | 19 | 13% | 92 |
| ratosh.Nobo 0.21 | 18 | 12% | 47 |
| jeremyreeder.Vincent 2011.12.09 | 14 | 10% | 23 |
| maribo.FollowFire 1 | 14 | 10% | 16 |
| stelo.MyAgileRobot 0.2 | 11 | 7% | 13 |
| m3thos.Eva00 1.1 | 10 | 7% | 23 |

## Melee bench: F15

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 84.2 | 152 / 420 | 2.42 | 19.6% | 89530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.4 | 19.6% | 152 |
| wompi.Wallaby 5.1 | 1.6 | 19.3% | 227 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 30 |
| ayk.WallHugger 1.0 | 4.5 | 9.6% | 2 |
| exauge.GateKeeper 1.1.121g | 4.9 | 9.3% | 7 |
| stuff.Vlad 0.1 | 5.6 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 86.7 | 13 / 35 | 7426 |
| 2 | 1 | 71.1 | 90.5 | 13 / 35 | 7410 |
| 3 | 2 | 69.4 | 80.6 | 16 / 35 | 6872 |
| 4 | 1 | 71.0 | 84.4 | 13 / 35 | 7553 |
| 5 | 2 | 71.4 | 89.2 | 12 / 35 | 7555 |
| 6 | 2 | 71.1 | 85.1 | 12 / 35 | 7731 |
| 7 | 1 | 69.7 | 76.8 | 16 / 35 | 7382 |
| 8 | 2 | 71.0 | 87.3 | 11 / 35 | 7601 |
| 9 | 1 | 70.6 | 82.9 | 13 / 35 | 7394 |
| 10 | 2 | 70.4 | 83.5 | 9 / 35 | 7485 |
| 11 | 1 | 69.9 | 80.0 | 9 / 35 | 7485 |
| 12 | 1 | 70.8 | 83.8 | 15 / 35 | 7636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 235 | 34% |
| mz.NanoGod 2.02 | 36 | 75% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| drd.Dreadknoght 0.9 | 11 | 100% |
| stelo.PianistNano 1.2 | 8 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 268 of 420 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 191 | 71% | 284 |
| mz.NanoGod 2.02 | 37 | 14% | 68 |
| ayk.WallHugger 1.0 | 13 | 5% | 20 |
| exauge.GateKeeper 1.1.121g | 13 | 5% | 19 |
| stuff.Vlad 0.1 | 6 | 2% | 9 |
| stelo.PianistNano 1.2 | 5 | 2% | 7 |
| drd.Dreadknoght 0.9 | 3 | 1% | 11 |

## Melee bench: F16

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.4 | 245 / 420 | 2.94 | 17.8% | 59788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.8% | 245 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 39 |
| dummy.micro.Sparrow 2.5 | 3.4 | 11.8% | 30 |
| bvh.micro.Freya 0.3 | 3.9 | 11.3% | 38 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.6% | 32 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 20 |
| conscience.Electron 1.3g | 6.8 | 8.0% | 1 |
| ap.Frederick 1.1 | 8.4 | 6.5% | 12 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.5 | 23 / 35 | 4956 |
| 2 | 1 | 68.3 | 86.7 | 20 / 35 | 4945 |
| 3 | 1 | 67.7 | 81.3 | 22 / 35 | 5354 |
| 4 | 1 | 66.5 | 76.5 | 21 / 35 | 4760 |
| 5 | 1 | 67.3 | 81.0 | 22 / 35 | 5035 |
| 6 | 1 | 67.1 | 76.2 | 21 / 35 | 5501 |
| 7 | 1 | 67.4 | 82.5 | 18 / 35 | 5178 |
| 8 | 1 | 63.5 | 67.6 | 18 / 35 | 4573 |
| 9 | 1 | 67.5 | 80.6 | 22 / 35 | 5052 |
| 10 | 1 | 65.9 | 76.5 | 19 / 35 | 4949 |
| 11 | 1 | 65.1 | 72.1 | 18 / 35 | 4706 |
| 12 | 1 | 66.3 | 76.8 | 21 / 35 | 4779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 91 | 92% |
| dummy.micro.Sparrow 2.5 | 65 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 44 | 84% |
| bvh.micro.Freya 0.3 | 40 | 88% |
| stelo.MirrorMicro 1.0 | 17 | 76% |
| ap.Frederick 1.1 | 13 | 100% |
| conscience.Electron 1.3g | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 175 of 420 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 19% | 106 |
| bvh.micro.Freya 0.3 | 30 | 17% | 55 |
| dummy.micro.Sparrow 2.5 | 28 | 16% | 80 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 13% | 67 |
| conscience.Electron 1.3g | 19 | 11% | 27 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 10% | 18 |
| stelo.MirrorMicro 1.0 | 15 | 9% | 39 |
| dl.BetterWalls 1.0 | 9 | 5% | 27 |

## Melee bench: F17

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 89.7 | 317 / 420 | 1.93 | 21.7% | 85164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 21.7% | 317 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.3% | 31 |
| supersample.SuperBoxBot 1.0 | 3.6 | 10.8% | 20 |
| sul.Lunar 1.1 | 3.7 | 11.2% | 16 |
| mme.NikeEnhanced 2.0 | 4.9 | 9.5% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 14 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.6 | 6.1% | 7 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 4 |
| sample.Corners 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 88.3 | 23 / 35 | 7243 |
| 2 | 1 | 71.1 | 83.8 | 22 / 35 | 7540 |
| 3 | 1 | 73.0 | 92.1 | 31 / 35 | 7329 |
| 4 | 1 | 71.2 | 86.0 | 22 / 35 | 7315 |
| 5 | 1 | 71.9 | 93.7 | 30 / 35 | 6449 |
| 6 | 1 | 71.8 | 89.5 | 25 / 35 | 7027 |
| 7 | 1 | 72.3 | 92.4 | 27 / 35 | 7177 |
| 8 | 1 | 72.1 | 94.6 | 27 / 35 | 6688 |
| 9 | 1 | 73.2 | 94.0 | 29 / 35 | 7481 |
| 10 | 1 | 70.9 | 86.0 | 26 / 35 | 6813 |
| 11 | 1 | 73.2 | 94.3 | 29 / 35 | 7359 |
| 12 | 1 | 70.1 | 81.6 | 26 / 35 | 6743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 106 | 91% |
| sul.Lunar 1.1 | 93 | 100% |
| supersample.SuperBoxBot 1.0 | 57 | 88% |
| dsw.StaticD 1.0 | 27 | 70% |
| mme.NikeEnhanced 2.0 | 17 | 88% |
| sample.MyFirstRobot 1.0 | 16 | 94% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.Corners 1.0 | 8 | 100% |

Hadur died in 105 of 420 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 31 | 30% | 126 |
| supersample.SuperBoxBot 1.0 | 29 | 28% | 70 |
| dsw.StaticD 1.0 | 15 | 14% | 45 |
| mme.NikeEnhanced 2.0 | 11 | 10% | 29 |
| sul.Lunar 1.1 | 7 | 7% | 105 |
| sample.Corners 1.0 | 3 | 3% | 13 |
| tlp.ThreeLeggedPig 1 | 3 | 3% | 10 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 11 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.4 | 236 / 420 | 2.76 | 18.5% | 74670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.5% | 236 |
| radnor.DoctorBob 1.42 | 2.4 | 13.2% | 65 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.5% | 34 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 23 |
| amz.NanoClone 1.41 | 5.4 | 9.7% | 12 |
| sample.Walls 1.0 | 7.6 | 7.5% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 9 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 79.4 | 19 / 35 | 6259 |
| 2 | 1 | 67.8 | 78.7 | 20 / 35 | 6223 |
| 3 | 1 | 66.9 | 75.9 | 17 / 35 | 6522 |
| 4 | 1 | 64.4 | 73.7 | 16 / 35 | 5339 |
| 5 | 1 | 71.4 | 93.0 | 28 / 35 | 6425 |
| 6 | 1 | 65.1 | 71.7 | 18 / 35 | 5580 |
| 7 | 1 | 68.5 | 82.5 | 17 / 35 | 6460 |
| 8 | 1 | 68.1 | 81.6 | 18 / 35 | 6405 |
| 9 | 1 | 68.6 | 81.6 | 22 / 35 | 6453 |
| 10 | 1 | 68.6 | 81.3 | 21 / 35 | 6520 |
| 11 | 1 | 68.2 | 81.9 | 19 / 35 | 6071 |
| 12 | 1 | 69.0 | 83.8 | 21 / 35 | 6413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 97 | 96% |
| radnor.DoctorBob 1.42 | 64 | 73% |
| mld.Wisdom 1.0 | 40 | 73% |
| KiraNL.Chupacabra 0.4 | 23 | 61% |
| jangs.ns51 1.0 | 20 | 85% |
| amz.NanoClone 1.41 | 13 | 92% |
| sample.Walls 1.0 | 12 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 53 | 29% | 88 |
| radnor.DoctorBob 1.42 | 36 | 20% | 93 |
| KiraNL.Chupacabra 0.4 | 30 | 16% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 15% | 121 |
| amz.NanoClone 1.41 | 17 | 9% | 28 |
| GarmBox.Oranges 1.0 | 8 | 4% | 15 |
| sample.Walls 1.0 | 7 | 4% | 16 |
| jangs.ns51 1.0 | 5 | 3% | 14 |

