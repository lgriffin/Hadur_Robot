# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.5 | 238 / 420 | 2.48 | 19.5% | 77366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 19.5% | 238 |
| radnor.DoctorBob 1.42 | 2.5 | 14.8% | 70 |
| mz.AntiGrav 1.0 | 2.9 | 14.3% | 38 |
| mld.Infinity 2.2 | 3.7 | 13.3% | 55 |
| amz.NanoClone 1.41 | 4.9 | 10.8% | 14 |
| sample.Walls 1.0 | 6.6 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 3 |
| arthord.MannyPacquiao Beta | 9.4 | 3.9% | 1 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.2 | 23 / 35 | 6497 |
| 2 | 1 | 67.2 | 73.0 | 17 / 35 | 6143 |
| 3 | 1 | 70.8 | 86.0 | 23 / 35 | 6475 |
| 4 | 1 | 69.2 | 81.3 | 17 / 35 | 6009 |
| 5 | 1 | 72.3 | 89.2 | 23 / 35 | 7054 |
| 6 | 1 | 71.9 | 87.6 | 22 / 35 | 7056 |
| 7 | 1 | 70.6 | 85.4 | 24 / 35 | 6426 |
| 8 | 1 | 70.3 | 87.3 | 17 / 35 | 6487 |
| 9 | 1 | 67.9 | 77.8 | 16 / 35 | 6004 |
| 10 | 1 | 68.7 | 79.4 | 16 / 35 | 6376 |
| 11 | 1 | 69.6 | 81.3 | 19 / 35 | 6178 |
| 12 | 1 | 70.2 | 84.8 | 21 / 35 | 6661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 118 | 97% |
| radnor.DoctorBob 1.42 | 73 | 66% |
| mld.Infinity 2.2 | 66 | 82% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 91 | 49% | 163 |
| mld.Infinity 2.2 | 29 | 16% | 35 |
| mz.AntiGrav 1.0 | 26 | 14% | 139 |
| amz.NanoClone 1.41 | 22 | 12% | 36 |
| jangs.ns51 1.0 | 5 | 3% | 14 |
| GarmBox.Oranges 1.0 | 5 | 3% | 6 |
| sample.Walls 1.0 | 3 | 2% | 20 |
| arthord.MannyPacquiao Beta | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.9 | 273 / 420 | 2.27 | 18.5% | 59130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.2 | 18.5% | 273 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.5% | 86 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 29 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 5 |
| zyx.nano.Ant 1.1 | 5.6 | 8.8% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 9.0% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.4 | 7.0% | 13 |
| fullsail.SweetTea 1.1 | 8.0 | 7.2% | 4 |
| bzdp.BoxCar 2.0 | 8.1 | 7.4% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 24 / 35 | 4989 |
| 2 | 1 | 70.4 | 95.6 | 26 / 35 | 5426 |
| 3 | 1 | 67.5 | 84.4 | 24 / 35 | 4579 |
| 4 | 1 | 69.8 | 92.4 | 26 / 35 | 4985 |
| 5 | 1 | 67.9 | 86.7 | 22 / 35 | 5024 |
| 6 | 1 | 70.3 | 94.3 | 26 / 35 | 5493 |
| 7 | 1 | 66.9 | 84.4 | 19 / 35 | 4863 |
| 8 | 1 | 69.2 | 87.9 | 27 / 35 | 5173 |
| 9 | 3 | 61.3 | 58.1 | 10 / 35 | 4553 |
| 10 | 1 | 68.6 | 87.6 | 28 / 35 | 4603 |
| 11 | 1 | 65.8 | 78.7 | 18 / 35 | 4358 |
| 12 | 1 | 69.3 | 89.5 | 23 / 35 | 5084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 156 | 75% |
| mld.DustBunny 3.8 | 104 | 89% |
| djdjdj.NanoSkunk10 1.0 | 19 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 94% |
| fullsail.SweetTea 1.1 | 13 | 77% |
| maribo.melee.BMV 0.1 | 12 | 75% |
| zyx.nano.Ant 1.1 | 7 | 86% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 148 of 420 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 36% | 167 |
| mld.DustBunny 3.8 | 29 | 20% | 103 |
| zyx.nano.Ant 1.1 | 18 | 12% | 28 |
| maribo.melee.BMV 0.1 | 14 | 9% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 7% | 29 |
| fullsail.SweetTea 1.1 | 10 | 7% | 20 |
| djdjdj.NanoSkunk10 1.0 | 6 | 4% | 31 |
| cs.Grudge 1.0 | 5 | 3% | 6 |
| bzdp.BoxCar 2.0 | 3 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.1 | 251 / 420 | 2.52 | 19.3% | 68244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 19.3% | 251 |
| myl.micro.Troodon 1.10 | 2.1 | 14.3% | 68 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.3% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.7% | 37 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 24 |
| fm.mammillarias 1.3 | 5.4 | 9.3% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 8.1 | 6.5% | 7 |
| sample.Fire 1.0 | 9.3 | 5.1% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.6 | 25 / 35 | 5926 |
| 2 | 1 | 71.0 | 89.2 | 24 / 35 | 5834 |
| 3 | 1 | 65.9 | 74.0 | 14 / 35 | 5257 |
| 4 | 1 | 69.3 | 85.7 | 23 / 35 | 5458 |
| 5 | 1 | 66.3 | 72.4 | 19 / 35 | 5478 |
| 6 | 1 | 70.6 | 87.3 | 24 / 35 | 5834 |
| 7 | 1 | 70.9 | 89.2 | 24 / 35 | 5910 |
| 8 | 1 | 69.5 | 86.0 | 20 / 35 | 5879 |
| 9 | 1 | 68.7 | 80.6 | 20 / 35 | 5600 |
| 10 | 1 | 70.1 | 85.7 | 21 / 35 | 6143 |
| 11 | 1 | 68.1 | 79.4 | 19 / 35 | 5388 |
| 12 | 1 | 67.7 | 79.7 | 18 / 35 | 5537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 101 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 66 | 85% |
| cb.nano.Insomnia 1.0 | 44 | 75% |
| myl.nano.KomoriNinja 1.1 | 37 | 78% |
| sp.Nanos.Ember 1.1 | 20 | 80% |
| fm.mammillarias 1.3 | 10 | 90% |
| sample.Fire 1.0 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 8 | 100% |

Hadur died in 170 of 420 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 22% | 142 |
| cb.nano.Insomnia 1.0 | 32 | 19% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 30 | 18% | 70 |
| fm.mammillarias 1.3 | 26 | 15% | 39 |
| myl.nano.KomoriNinja 1.1 | 22 | 13% | 72 |
| sample.Tracker 1.0 | 8 | 5% | 12 |
| sp.Nanos.Ember 1.1 | 7 | 4% | 24 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 19 |
| sample.Fire 1.0 | 2 | 1% | 10 |

## Melee bench: F04

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.9 | 260 / 420 | 2.45 | 19.3% | 70778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 19.3% | 260 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.1% | 45 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 47 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.1 | 9.4% | 3 |
| tj.zombie1n 1.0.1 | 5.6 | 9.1% | 20 |
| stelo.SoJNanoMelee 1.1 | 5.6 | 9.3% | 23 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.9 | 8.1% | 15 |
| repositorio.NanoStep 1.0 | 9.1 | 5.9% | 0 |
| sample.VelociRobot 1.0 | 9.9 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 23 / 35 | 6028 |
| 2 | 1 | 68.1 | 80.6 | 20 / 35 | 5945 |
| 3 | 1 | 69.8 | 87.6 | 25 / 35 | 6028 |
| 4 | 1 | 69.6 | 87.3 | 23 / 35 | 5897 |
| 5 | 1 | 70.3 | 87.9 | 24 / 35 | 6145 |
| 6 | 1 | 67.6 | 79.4 | 20 / 35 | 5440 |
| 7 | 1 | 68.4 | 82.9 | 18 / 35 | 6056 |
| 8 | 1 | 67.6 | 81.9 | 19 / 35 | 5533 |
| 9 | 1 | 70.2 | 86.3 | 25 / 35 | 6216 |
| 10 | 1 | 66.9 | 77.5 | 18 / 35 | 5675 |
| 11 | 1 | 71.0 | 90.8 | 25 / 35 | 6602 |
| 12 | 1 | 67.4 | 81.6 | 20 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 122 | 84% |
| stelo.SoJNanoMelee 1.1 | 70 | 94% |
| tvv.micro.Antares 1.1.1 | 43 | 72% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 83% |
| tj.zombie1n 1.0.1 | 22 | 50% |
| yk.JahMicro 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 86% |
| sample.VelociRobot 1.0 | 5 | 100% |

Hadur died in 160 of 420 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 35% | 180 |
| tvv.micro.Antares 1.1.1 | 36 | 23% | 70 |
| stelo.SoJNanoMelee 1.1 | 22 | 14% | 66 |
| tj.zombie1n 1.0.1 | 18 | 11% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 8% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 4% | 34 |
| yk.JahMicro 1.0 | 4 | 3% | 13 |
| repositorio.NanoStep 1.0 | 3 | 2% | 10 |
| sample.VelociRobot 1.0 | 2 | 1% | 7 |

## Melee bench: F05

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 66.0 | 160 / 420 | 4.06 | 14.8% | 52030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.2 | 14.8% | 160 |
| oog.melee.Corsair 1.0 | 1.9 | 13.2% | 77 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 57 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.3% | 55 |
| EBBU.Sim2 1.02 | 5.4 | 9.9% | 16 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 25 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.0% | 16 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.9% | 0 |
| sample.TrackFire 1.0 | 9.9 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 60.3 | 13 / 35 | 3919 |
| 2 | 1 | 62.0 | 65.7 | 18 / 35 | 4381 |
| 3 | 1 | 62.6 | 70.5 | 14 / 35 | 4256 |
| 4 | 1 | 61.2 | 65.4 | 10 / 35 | 4430 |
| 5 | 2 | 58.7 | 57.1 | 10 / 35 | 4216 |
| 6 | 1 | 59.8 | 61.3 | 10 / 35 | 4293 |
| 7 | 1 | 64.5 | 74.0 | 15 / 35 | 4755 |
| 8 | 1 | 65.1 | 77.1 | 16 / 35 | 4609 |
| 9 | 1 | 59.6 | 59.0 | 12 / 35 | 4354 |
| 10 | 1 | 58.0 | 55.2 | 12 / 35 | 4117 |
| 11 | 1 | 64.5 | 74.9 | 16 / 35 | 4445 |
| 12 | 1 | 62.8 | 70.8 | 14 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 61 | 80% |
| oog.melee.Corsair 1.0 | 56 | 61% |
| ahf.NanoAndrew .4 | 45 | 69% |
| EBBU.Sim2 1.02 | 17 | 94% |
| robar.nano.Assertive_Melee 0.2 | 13 | 92% |
| sam.Samspin 1.0 | 11 | 91% |
| zyx.nano.BacillusComma 1.0 | 6 | 67% |
| sample.TrackFire 1.0 | 4 | 100% |

Hadur died in 260 of 420 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 17% | 84 |
| oog.melee.Corsair 1.0 | 43 | 17% | 77 |
| ahf.NanoAndrew .4 | 35 | 13% | 77 |
| bwbaugh.nano.Tirunculus 0.0.0a | 34 | 13% | 37 |
| robar.nano.Assertive_Melee 0.2 | 30 | 12% | 39 |
| EBBU.Sim2 1.02 | 26 | 10% | 39 |
| zyx.nano.BacillusComma 1.0 | 22 | 8% | 31 |
| sam.Samspin 1.0 | 18 | 7% | 23 |
| sample.TrackFire 1.0 | 7 | 3% | 10 |

## Melee bench: F06

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.6 | 252 / 420 | 2.39 | 18.3% | 57462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.1 | 18.3% | 252 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.1% | 46 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.3% | 34 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 10.3% | 47 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.2% | 19 |
| fm.claire 1.7 | 6.1 | 8.7% | 9 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.8% | 9 |
| sample.SpinBot 1.0 | 8.1 | 7.1% | 4 |
| pa.Improved 1.0 | 9.2 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.4 | 21 / 35 | 4291 |
| 2 | 1 | 67.9 | 87.6 | 21 / 35 | 4689 |
| 3 | 2 | 62.2 | 66.3 | 13 / 35 | 4371 |
| 4 | 1 | 67.5 | 83.5 | 21 / 35 | 4959 |
| 5 | 1 | 68.5 | 87.3 | 22 / 35 | 5151 |
| 6 | 1 | 66.8 | 85.1 | 16 / 35 | 4604 |
| 7 | 1 | 68.9 | 91.7 | 24 / 35 | 4699 |
| 8 | 1 | 68.4 | 87.0 | 22 / 35 | 4930 |
| 9 | 1 | 69.7 | 91.1 | 25 / 35 | 5324 |
| 10 | 1 | 68.9 | 89.8 | 27 / 35 | 4820 |
| 11 | 1 | 69.4 | 87.6 | 23 / 35 | 5447 |
| 12 | 1 | 64.9 | 78.1 | 17 / 35 | 4177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 113 | 84% |
| oog.melee.CapuletDroid 1.1 | 75 | 77% |
| gh.nano.Grofvuil 0.2 | 36 | 69% |
| arthord.NanoSatanMelee Beta | 30 | 90% |
| winamp32.micro.MicroMacro 1.0 | 21 | 52% |
| sample.SpinBot 1.0 | 17 | 94% |
| fm.claire 1.7 | 16 | 75% |
| kurios.DOSexe .9b | 6 | 83% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 173 of 420 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 20% | 133 |
| oog.melee.CapuletDroid 1.1 | 34 | 20% | 35 |
| gh.nano.Grofvuil 0.2 | 31 | 18% | 82 |
| winamp32.micro.MicroMacro 1.0 | 19 | 11% | 46 |
| arthord.NanoSatanMelee Beta | 19 | 11% | 41 |
| fm.claire 1.7 | 14 | 8% | 24 |
| sample.SpinBot 1.0 | 9 | 5% | 25 |
| pa.Improved 1.0 | 6 | 3% | 9 |
| kurios.DOSexe .9b | 3 | 2% | 21 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.5 | 169 / 420 | 2.75 | 17.3% | 61561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.1 | 17.3% | 169 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.0% | 90 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.8% | 50 |
| mz.MicroGodMelee 1 | 3.3 | 13.6% | 88 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 9 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 3 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 3 |
| el.JumpShoot 0.2 | 8.1 | 6.1% | 5 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.9% | 6 |
| fire219.CatBot 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.2 | 14 / 35 | 5044 |
| 2 | 1 | 66.6 | 80.0 | 17 / 35 | 5083 |
| 3 | 1 | 69.6 | 88.3 | 16 / 35 | 6157 |
| 4 | 1 | 65.8 | 77.1 | 12 / 35 | 5104 |
| 5 | 1 | 65.7 | 76.2 | 14 / 35 | 5039 |
| 6 | 2 | 63.4 | 72.7 | 11 / 35 | 4633 |
| 7 | 1 | 67.8 | 84.4 | 15 / 35 | 5527 |
| 8 | 1 | 68.2 | 84.8 | 15 / 35 | 5371 |
| 9 | 1 | 65.8 | 82.2 | 14 / 35 | 4667 |
| 10 | 1 | 67.7 | 84.1 | 17 / 35 | 5245 |
| 11 | 1 | 65.1 | 76.8 | 12 / 35 | 4738 |
| 12 | 1 | 66.6 | 83.2 | 12 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 95 | 84% |
| mz.MicroGodMelee 1 | 82 | 33% |
| gh.micro.Gruweltje 0.7 | 60 | 38% |
| DBall.Anarchy 0.1 | 22 | 100% |
| caimano.Furia_Ceca 0.22 | 9 | 78% |
| mbro.Detektor3 0.1.1 | 6 | 83% |
| el.JumpShoot 0.2 | 6 | 67% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 252 of 420 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 94 | 37% | 133 |
| gh.micro.Gruweltje 0.7 | 65 | 26% | 99 |
| spinnercat.micro.Tyger 0.1 | 50 | 20% | 100 |
| acogdev.alpha 0.2 | 13 | 5% | 18 |
| fire219.CatBot 1.0 | 8 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 7 | 3% | 15 |
| caimano.Furia_Ceca 0.22 | 6 | 2% | 13 |
| DBall.Anarchy 0.1 | 4 | 2% | 27 |
| el.JumpShoot 0.2 | 4 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.6 | 171 / 420 | 3.83 | 15.4% | 57213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.5 | 15.4% | 171 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.0% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.6 | 14.1% | 84 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.8% | 13 |
| germ.TheMind .2 | 5.6 | 9.4% | 12 |
| awesomeness.Elite 1.0 | 5.9 | 9.0% | 21 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.7% | 7 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 10 |
| sample.Crazy 1.0 | 8.7 | 6.7% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 67.0 | 15 / 35 | 4777 |
| 2 | 1 | 63.5 | 69.5 | 16 / 35 | 4974 |
| 3 | 1 | 62.2 | 64.4 | 13 / 35 | 5162 |
| 4 | 2 | 61.9 | 67.6 | 11 / 35 | 4568 |
| 5 | 2 | 63.0 | 68.3 | 15 / 35 | 4412 |
| 6 | 1 | 66.2 | 78.4 | 17 / 35 | 5258 |
| 7 | 2 | 62.5 | 67.9 | 14 / 35 | 4343 |
| 8 | 2 | 61.4 | 64.1 | 10 / 35 | 4792 |
| 9 | 3 | 60.6 | 60.6 | 15 / 35 | 4387 |
| 10 | 1 | 64.8 | 73.0 | 12 / 35 | 5309 |
| 11 | 1 | 62.4 | 66.7 | 15 / 35 | 4410 |
| 12 | 1 | 65.4 | 75.6 | 18 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 139 | 68% |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 68% |
| germ.TheMind .2 | 20 | 80% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| awesomeness.Elite 1.0 | 8 | 75% |
| lrem.micro.MoggFanatic 0.2 | 7 | 86% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 250 of 420 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 109 | 44% | 189 |
| simonton.nano.WeekendObsession_Melee 1.0 | 64 | 26% | 96 |
| stelo.UntouchableNano 1.3 | 18 | 7% | 26 |
| germ.TheMind .2 | 15 | 6% | 32 |
| lrem.micro.MoggFanatic 0.2 | 13 | 5% | 22 |
| awesomeness.Elite 1.0 | 10 | 4% | 21 |
| qualidafial.MajorDick 1.0.1 | 10 | 4% | 17 |
| mym.EdgeStalker 1.0 | 8 | 3% | 10 |
| sample.Crazy 1.0 | 3 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.8 | 295 / 420 | 2.10 | 19.5% | 56346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 19.5% | 295 |
| rz.HawkOnFire 0.1 | 2.1 | 13.5% | 26 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 12.7% | 36 |
| maribo.IotaCT 1.1 | 4.8 | 10.4% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.9% | 8 |
| timmit.nano.TimDog 0.33 | 5.4 | 9.5% | 12 |
| ratosh.Wesco 1.4 | 7.6 | 8.1% | 9 |
| spinnercat.Omen 1.0 | 7.7 | 7.9% | 6 |
| stelo.PatternRobot 1.0 | 8.4 | 7.5% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.7 | 26 / 35 | 5130 |
| 2 | 1 | 70.2 | 91.1 | 26 / 35 | 4490 |
| 3 | 1 | 68.5 | 83.2 | 23 / 35 | 4468 |
| 4 | 1 | 69.2 | 83.8 | 26 / 35 | 4719 |
| 5 | 1 | 69.2 | 87.6 | 24 / 35 | 4691 |
| 6 | 1 | 69.8 | 88.9 | 26 / 35 | 4437 |
| 7 | 1 | 69.4 | 86.0 | 24 / 35 | 4691 |
| 8 | 1 | 69.5 | 87.3 | 27 / 35 | 4382 |
| 9 | 1 | 70.0 | 85.7 | 23 / 35 | 5121 |
| 10 | 1 | 71.7 | 94.0 | 27 / 35 | 4861 |
| 11 | 1 | 68.8 | 85.4 | 22 / 35 | 4628 |
| 12 | 1 | 69.4 | 88.9 | 21 / 35 | 4728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 129 | 95% |
| nz.jdc.nano.GridFu 1.0 | 90 | 84% |
| stelo.PatternRobot 1.0 | 28 | 100% |
| maribo.IotaCT 1.1 | 26 | 73% |
| timmit.nano.TimDog 0.33 | 19 | 84% |
| spinnercat.Omen 1.0 | 15 | 100% |
| ratosh.Wesco 1.4 | 13 | 77% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 32 | 26% | 113 |
| timmit.nano.TimDog 0.33 | 22 | 18% | 46 |
| rz.HawkOnFire 0.1 | 19 | 15% | 116 |
| maribo.IotaCT 1.1 | 19 | 15% | 51 |
| ratosh.Wesco 1.4 | 16 | 13% | 33 |
| stelo.PatternRobot 1.0 | 11 | 9% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 18 |
| spinnercat.Omen 1.0 | 1 | 1% | 9 |

## Melee bench: F10

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.5 | 327 / 420 | 1.77 | 21.1% | 73929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 21.1% | 327 |
| tvv.nano.Polaris 1.2 | 2.1 | 12.5% | 44 |
| baal.nano.N 1.42 | 3.1 | 10.9% | 10 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.6% | 5 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 7 |
| sanja.First 0.1 | 6.0 | 8.7% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.1% | 3 |
| cvt.Firsty 1.0 | 7.7 | 7.6% | 13 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 3 |
| sample.RamFire 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.0 | 29 / 35 | 6245 |
| 2 | 1 | 72.4 | 96.2 | 30 / 35 | 6612 |
| 3 | 1 | 72.0 | 94.9 | 30 / 35 | 6337 |
| 4 | 1 | 70.4 | 92.1 | 27 / 35 | 5753 |
| 5 | 1 | 71.1 | 90.8 | 27 / 35 | 6310 |
| 6 | 1 | 71.9 | 96.2 | 29 / 35 | 6237 |
| 7 | 1 | 70.1 | 87.3 | 28 / 35 | 5942 |
| 8 | 1 | 70.5 | 86.3 | 24 / 35 | 6270 |
| 9 | 1 | 72.4 | 95.6 | 30 / 35 | 6466 |
| 10 | 1 | 69.9 | 90.2 | 24 / 35 | 5881 |
| 11 | 1 | 69.1 | 87.3 | 23 / 35 | 5659 |
| 12 | 1 | 70.4 | 87.6 | 26 / 35 | 6217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 98 | 79% |
| baal.nano.N 1.42 | 57 | 98% |
| cvt.Firsty 1.0 | 56 | 89% |
| sanja.First 0.1 | 44 | 93% |
| zyx.micro.Ant 1.1 | 36 | 100% |
| amk.Punbot.Punbot 0.01 | 30 | 97% |
| Grystrion.TrackerWO 1.0 | 25 | 100% |
| squidM.TentalceMeleeNano 1.1 | 12 | 92% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 94 of 420 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 41% | 144 |
| sanja.First 0.1 | 12 | 13% | 44 |
| cvt.Firsty 1.0 | 9 | 10% | 54 |
| baal.nano.N 1.42 | 9 | 10% | 51 |
| zyx.micro.Ant 1.1 | 7 | 7% | 60 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 34 |
| squidM.TentalceMeleeNano 1.1 | 5 | 5% | 13 |
| amk.Punbot.Punbot 0.01 | 5 | 5% | 13 |
| sample.RamFire 1.0 | 3 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 65.1 | 102 / 420 | 4.15 | 14.0% | 54035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.8% | 181 |
| hadur117.micro.SaorU 0.1 | 2.2 | 14.0% | 102 |
| cs.Wren 1.0 | 3.2 | 12.9% | 47 |
| js.PinBall 1.6 | 4.2 | 11.6% | 38 |
| mz.Cork 0.1 | 4.7 | 11.2% | 31 |
| joe.ADinosaur 1.0 | 5.8 | 9.4% | 9 |
| evd.X1 0.01 | 6.9 | 8.1% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 6 |
| PSW.Relentless 0.1 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 65.7 | 7 / 35 | 4609 |
| 2 | 2 | 60.5 | 64.1 | 5 / 35 | 4552 |
| 3 | 2 | 60.6 | 64.4 | 9 / 35 | 4704 |
| 4 | 2 | 60.4 | 63.2 | 6 / 35 | 4736 |
| 5 | 2 | 58.4 | 60.0 | 7 / 35 | 4196 |
| 6 | 4 | 57.6 | 58.4 | 7 / 35 | 4006 |
| 7 | 2 | 62.3 | 69.5 | 11 / 35 | 4470 |
| 8 | 2 | 60.6 | 65.4 | 7 / 35 | 4470 |
| 9 | 1 | 62.0 | 66.7 | 9 / 35 | 4843 |
| 10 | 1 | 66.3 | 82.9 | 15 / 35 | 4812 |
| 11 | 4 | 56.9 | 54.3 | 10 / 35 | 4059 |
| 12 | 2 | 61.5 | 66.0 | 9 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 114 | 33% |
| cs.Wren 1.0 | 33 | 82% |
| js.PinBall 1.6 | 18 | 67% |
| mz.Cork 0.1 | 15 | 73% |
| joe.ADinosaur 1.0 | 5 | 60% |
| evd.X1 0.01 | 4 | 75% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |

Hadur died in 318 of 420 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 148 | 47% | 196 |
| joe.ADinosaur 1.0 | 38 | 12% | 42 |
| js.PinBall 1.6 | 34 | 11% | 50 |
| cs.Wren 1.0 | 28 | 9% | 43 |
| evd.X1 0.01 | 28 | 9% | 30 |
| mz.Cork 0.1 | 25 | 8% | 35 |
| PSW.Relentless 0.1 | 12 | 4% | 12 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |
| donjezza.Jezza 1.0 | 1 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.4 | 245 / 420 | 2.85 | 17.9% | 54803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 17.9% | 245 |
| ntc.Opposite 1.5 | 3.2 | 11.6% | 27 |
| myl.nano.Graviton 1.10 | 3.3 | 11.3% | 42 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 33 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.1% | 15 |
| disan.Chair 2.2.0 | 7.1 | 8.4% | 16 |
| DBall.NUKE 0.1 | 7.6 | 8.2% | 10 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 21 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 72.7 | 12 / 35 | 4100 |
| 2 | 1 | 67.9 | 81.9 | 22 / 35 | 4809 |
| 3 | 1 | 66.8 | 76.2 | 22 / 35 | 4906 |
| 4 | 1 | 69.5 | 87.9 | 26 / 35 | 5011 |
| 5 | 1 | 66.8 | 79.7 | 23 / 35 | 4439 |
| 6 | 1 | 63.1 | 69.5 | 14 / 35 | 4328 |
| 7 | 1 | 67.8 | 83.2 | 23 / 35 | 4626 |
| 8 | 1 | 66.7 | 80.0 | 21 / 35 | 4582 |
| 9 | 1 | 67.6 | 83.2 | 21 / 35 | 4818 |
| 10 | 1 | 67.4 | 83.8 | 20 / 35 | 4510 |
| 11 | 1 | 66.2 | 78.4 | 20 / 35 | 4430 |
| 12 | 1 | 65.9 | 76.8 | 21 / 35 | 4244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 73 | 88% |
| stelo.AreaTargetingBot 1.1 | 64 | 86% |
| ntc.Opposite 1.5 | 35 | 86% |
| disan.Chair 2.2.0 | 28 | 86% |
| donjezza.Muncho 1.0 | 24 | 88% |
| DBall.NUKE 0.1 | 23 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 90% |
| pfvicm.Sobieski 7.2.3b | 12 | 83% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 175 of 420 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 42 | 24% | 64 |
| stelo.AreaTargetingBot 1.1 | 31 | 18% | 76 |
| ntc.Opposite 1.5 | 27 | 15% | 54 |
| myl.nano.Graviton 1.10 | 24 | 14% | 83 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 13% | 42 |
| disan.Chair 2.2.0 | 12 | 7% | 24 |
| donjezza.Muncho 1.0 | 7 | 4% | 30 |
| DBall.NUKE 0.1 | 6 | 3% | 36 |
| pbg.R2D2 1.0 | 4 | 2% | 11 |

## Melee bench: F13

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 65.7 | 123 / 420 | 4.09 | 14.0% | 45460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.5% | 119 |
| kawigi.micro.Shiz 1.1 | 2.4 | 13.8% | 80 |
| hadur117.micro.SaorU 0.1 | 2.5 | 14.0% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.6% | 49 |
| yagami.Tidus 0.11 | 4.8 | 11.9% | 20 |
| ejb.Polaris 1.0.1 | 5.5 | 11.4% | 29 |
| step.nanoPri 1.0 | 7.4 | 7.3% | 0 |
| stelo.MirrorNano 1.3 | 7.6 | 7.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 62.9 | 13 / 35 | 4070 |
| 2 | 2 | 60.0 | 64.4 | 7 / 35 | 3664 |
| 3 | 1 | 65.9 | 78.7 | 13 / 35 | 4195 |
| 4 | 1 | 64.3 | 73.3 | 11 / 35 | 4131 |
| 5 | 3 | 60.7 | 64.4 | 10 / 35 | 3579 |
| 6 | 3 | 61.2 | 66.7 | 12 / 35 | 3470 |
| 7 | 1 | 62.5 | 69.5 | 12 / 35 | 3787 |
| 8 | 5 | 58.1 | 55.6 | 11 / 35 | 3650 |
| 9 | 5 | 57.0 | 54.3 | 3 / 35 | 3438 |
| 10 | 1 | 64.9 | 75.6 | 15 / 35 | 4030 |
| 11 | 4 | 57.1 | 55.2 | 4 / 35 | 3670 |
| 12 | 1 | 62.1 | 67.6 | 12 / 35 | 3776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 46% |
| kawigi.micro.Shiz 1.1 | 49 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 74% |
| yagami.Tidus 0.11 | 23 | 100% |
| ejb.Polaris 1.0.1 | 12 | 42% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 297 of 420 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 110 | 37% | 138 |
| yagami.Tidus 0.11 | 42 | 14% | 67 |
| ejb.Polaris 1.0.1 | 38 | 13% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 11% | 67 |
| kawigi.micro.Shiz 1.1 | 26 | 9% | 45 |
| stelo.MirrorNano 1.3 | 19 | 6% | 19 |
| step.nanoPri 1.0 | 16 | 5% | 17 |
| kurios.DOSexe .9a | 12 | 4% | 11 |

## Melee bench: F14

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 77.1 | 216 / 420 | 3.06 | 16.4% | 47736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.1 | 16.4% | 216 |
| wee.Gem 1.8.4 | 2.9 | 12.5% | 76 |
| bzdp.Pansy 2.1 | 3.3 | 12.2% | 45 |
| wompi.Quokka 1.6 | 3.8 | 11.6% | 42 |
| ratosh.Nobo 0.21 | 4.1 | 11.5% | 15 |
| m3thos.Eva00 1.1 | 6.3 | 9.3% | 15 |
| bayen.UbaMicro 1.4 | 6.6 | 9.2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 6.9% | 4 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.5% | 2 |
| maribo.FollowFire 1 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 70.5 | 15 / 35 | 3784 |
| 2 | 1 | 66.9 | 83.2 | 24 / 35 | 4159 |
| 3 | 1 | 63.4 | 74.6 | 13 / 35 | 3988 |
| 4 | 1 | 66.7 | 83.5 | 21 / 35 | 4163 |
| 5 | 1 | 64.4 | 76.2 | 15 / 35 | 4095 |
| 6 | 1 | 64.0 | 74.6 | 17 / 35 | 4054 |
| 7 | 1 | 68.4 | 88.9 | 25 / 35 | 4446 |
| 8 | 1 | 65.0 | 77.5 | 21 / 35 | 4049 |
| 9 | 2 | 61.2 | 66.7 | 12 / 35 | 3751 |
| 10 | 1 | 65.2 | 79.7 | 19 / 35 | 3860 |
| 11 | 1 | 63.4 | 73.7 | 18 / 35 | 3978 |
| 12 | 1 | 62.9 | 76.5 | 16 / 35 | 3409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 74 | 82% |
| bzdp.Pansy 2.1 | 73 | 88% |
| wompi.Quokka 1.6 | 39 | 74% |
| ratosh.Nobo 0.21 | 27 | 93% |
| m3thos.Eva00 1.1 | 22 | 95% |
| bayen.UbaMicro 1.4 | 16 | 94% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 205 of 420 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 39 | 19% | 62 |
| wee.Gem 1.8.4 | 36 | 18% | 104 |
| ratosh.Nobo 0.21 | 28 | 14% | 50 |
| bzdp.Pansy 2.1 | 25 | 12% | 88 |
| bayen.UbaMicro 1.4 | 25 | 12% | 39 |
| maribo.FollowFire 1 | 20 | 10% | 22 |
| m3thos.Eva00 1.1 | 12 | 6% | 26 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 5% | 15 |
| stelo.MyAgileRobot 0.2 | 9 | 4% | 11 |

## Melee bench: F15

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 79.7 | 94 / 420 | 2.83 | 18.0% | 80727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.4% | 282 |
| hadur117.micro.SaorU 0.1 | 2.0 | 18.0% | 94 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 32 |
| ayk.WallHugger 1.0 | 4.3 | 9.9% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.3% | 9 |
| stuff.Vlad 0.1 | 5.4 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 1 |
| drd.Dreadknoght 0.9 | 7.9 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 1 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.9 | 83.2 | 7 / 35 | 7155 |
| 2 | 2 | 68.7 | 77.5 | 9 / 35 | 6782 |
| 3 | 2 | 65.1 | 72.1 | 4 / 35 | 5971 |
| 4 | 2 | 67.3 | 76.2 | 7 / 35 | 6288 |
| 5 | 2 | 70.3 | 85.4 | 11 / 35 | 7003 |
| 6 | 2 | 69.5 | 83.8 | 6 / 35 | 6567 |
| 7 | 2 | 69.7 | 83.5 | 9 / 35 | 6968 |
| 8 | 2 | 69.8 | 83.8 | 11 / 35 | 6567 |
| 9 | 2 | 68.6 | 76.8 | 9 / 35 | 7118 |
| 10 | 2 | 69.0 | 80.0 | 9 / 35 | 6943 |
| 11 | 2 | 66.2 | 73.7 | 5 / 35 | 5963 |
| 12 | 2 | 69.8 | 80.6 | 7 / 35 | 7402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 230 | 21% |
| mz.NanoGod 2.02 | 30 | 57% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 328 of 420 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 238 | 73% | 289 |
| mz.NanoGod 2.02 | 58 | 18% | 81 |
| ayk.WallHugger 1.0 | 14 | 4% | 21 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 14 |
| stuff.Vlad 0.1 | 4 | 1% | 6 |
| stelo.PianistNano 1.2 | 4 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.8 | 217 / 420 | 3.62 | 16.0% | 52918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 16.0% | 217 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 36 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.2% | 50 |
| bvh.micro.Freya 0.3 | 4.1 | 11.2% | 38 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 43 |
| stelo.MirrorMicro 1.0 | 5.9 | 9.2% | 12 |
| conscience.Electron 1.3g | 6.9 | 8.5% | 6 |
| ap.Frederick 1.1 | 8.3 | 6.6% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.5 | 22 / 35 | 4714 |
| 2 | 1 | 62.3 | 69.8 | 17 / 35 | 3980 |
| 3 | 1 | 62.6 | 63.5 | 16 / 35 | 4751 |
| 4 | 1 | 63.8 | 69.2 | 16 / 35 | 4742 |
| 5 | 1 | 65.8 | 76.8 | 21 / 35 | 4488 |
| 6 | 1 | 62.4 | 65.4 | 14 / 35 | 4387 |
| 7 | 1 | 64.4 | 74.0 | 18 / 35 | 4240 |
| 8 | 1 | 65.6 | 76.2 | 23 / 35 | 4243 |
| 9 | 1 | 63.9 | 68.9 | 18 / 35 | 4660 |
| 10 | 1 | 60.3 | 62.2 | 14 / 35 | 3804 |
| 11 | 1 | 64.2 | 72.4 | 19 / 35 | 4322 |
| 12 | 1 | 64.9 | 75.2 | 19 / 35 | 4587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 74 | 93% |
| dummy.micro.Sparrow 2.5 | 62 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 46 | 91% |
| bvh.micro.Freya 0.3 | 32 | 88% |
| ap.Frederick 1.1 | 17 | 94% |
| stelo.MirrorMicro 1.0 | 8 | 63% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 203 of 420 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 34 | 17% | 31 |
| dummy.micro.Sparrow 2.5 | 32 | 16% | 89 |
| conscience.Electron 1.3g | 31 | 15% | 38 |
| voidious.micro.BlitzBat 1.05 | 30 | 15% | 94 |
| davidalves.net.DuelistMicroMelee 1.4 | 30 | 15% | 75 |
| bvh.micro.Freya 0.3 | 21 | 10% | 37 |
| dl.BetterWalls 1.0 | 15 | 7% | 28 |
| stelo.MirrorMicro 1.0 | 9 | 4% | 28 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F17

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.0 | 277 / 420 | 2.35 | 20.3% | 78543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 20.3% | 277 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.6% | 51 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 24 |
| supersample.SuperBoxBot 1.0 | 4.1 | 10.4% | 17 |
| mme.NikeEnhanced 2.0 | 4.9 | 9.4% | 9 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 13 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.5% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.2% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 8.6 | 6.1% | 12 |
| sample.Corners 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.7 | 21 / 35 | 6129 |
| 2 | 1 | 70.2 | 81.9 | 23 / 35 | 7016 |
| 3 | 1 | 69.9 | 85.4 | 21 / 35 | 6435 |
| 4 | 1 | 70.6 | 84.8 | 26 / 35 | 6661 |
| 5 | 1 | 71.1 | 86.3 | 25 / 35 | 7093 |
| 6 | 1 | 68.9 | 80.0 | 21 / 35 | 6105 |
| 7 | 1 | 69.1 | 82.5 | 21 / 35 | 5917 |
| 8 | 1 | 71.7 | 89.2 | 26 / 35 | 6673 |
| 9 | 1 | 72.2 | 92.4 | 28 / 35 | 6878 |
| 10 | 1 | 69.3 | 81.9 | 20 / 35 | 6589 |
| 11 | 1 | 71.7 | 89.8 | 25 / 35 | 6970 |
| 12 | 1 | 68.6 | 80.0 | 20 / 35 | 6077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 107 | 84% |
| sul.Lunar 1.1 | 83 | 98% |
| supersample.SuperBoxBot 1.0 | 50 | 90% |
| mme.NikeEnhanced 2.0 | 20 | 80% |
| sample.MyFirstRobot 1.0 | 19 | 89% |
| dsw.StaticD 1.0 | 14 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 60% |
| sample.Corners 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 67% |

Hadur died in 147 of 420 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 31% | 133 |
| supersample.SuperBoxBot 1.0 | 29 | 20% | 55 |
| dsw.StaticD 1.0 | 28 | 19% | 52 |
| mme.NikeEnhanced 2.0 | 10 | 7% | 28 |
| sul.Lunar 1.1 | 9 | 6% | 83 |
| tlp.ThreeLeggedPig 1 | 9 | 6% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 4% | 21 |
| sample.Corners 1.0 | 5 | 3% | 13 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 17 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.5 | 194 / 420 | 3.20 | 17.1% | 69229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorU 0.1 | 1.0 | 17.1% | 194 |
| radnor.DoctorBob 1.42 | 2.0 | 14.3% | 88 |
| mld.Wisdom 1.0 | 3.5 | 11.7% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.5% | 38 |
| amz.NanoClone 1.41 | 4.9 | 10.6% | 21 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.1% | 19 |
| sample.Walls 1.0 | 7.3 | 7.8% | 11 |
| GarmBox.Oranges 1.0 | 8.0 | 7.3% | 2 |
| jangs.ns51 1.0 | 8.6 | 6.4% | 6 |
| sample.Target 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.7 | 15 / 35 | 5987 |
| 2 | 1 | 67.3 | 77.5 | 22 / 35 | 6039 |
| 3 | 1 | 65.4 | 72.1 | 18 / 35 | 5778 |
| 4 | 1 | 65.7 | 76.8 | 14 / 35 | 5763 |
| 5 | 1 | 65.1 | 75.2 | 16 / 35 | 5253 |
| 6 | 1 | 63.5 | 68.9 | 14 / 35 | 5236 |
| 7 | 1 | 69.4 | 86.3 | 19 / 35 | 6526 |
| 8 | 1 | 66.1 | 73.7 | 16 / 35 | 6118 |
| 9 | 1 | 66.9 | 77.8 | 13 / 35 | 6337 |
| 10 | 1 | 65.4 | 75.6 | 13 / 35 | 5770 |
| 11 | 1 | 63.6 | 70.5 | 16 / 35 | 4935 |
| 12 | 1 | 65.5 | 73.3 | 18 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 77 | 58% |
| davidalves.net.DuelistNanoMelee 1.01 | 66 | 91% |
| amz.NanoClone 1.41 | 30 | 87% |
| mld.Wisdom 1.0 | 29 | 72% |
| KiraNL.Chupacabra 0.4 | 20 | 75% |
| jangs.ns51 1.0 | 9 | 78% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 227 of 420 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 77 | 34% | 129 |
| mld.Wisdom 1.0 | 50 | 22% | 74 |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 15% | 97 |
| KiraNL.Chupacabra 0.4 | 31 | 14% | 45 |
| amz.NanoClone 1.41 | 18 | 8% | 36 |
| GarmBox.Oranges 1.0 | 6 | 3% | 12 |
| jangs.ns51 1.0 | 6 | 3% | 10 |
| sample.Walls 1.0 | 4 | 2% | 14 |

