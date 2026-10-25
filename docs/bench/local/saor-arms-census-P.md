# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 83.0 | 240 / 420 | 2.53 | 19.4% | 76549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 19.4% | 240 |
| radnor.DoctorBob 1.42 | 2.6 | 14.7% | 62 |
| mz.AntiGrav 1.0 | 2.8 | 14.1% | 44 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 47 |
| amz.NanoClone 1.41 | 4.9 | 11.1% | 13 |
| sample.Walls 1.0 | 6.4 | 7.1% | 4 |
| GarmBox.Oranges 1.0 | 6.9 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 8 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 2 |
| sample.Target 1.0 | 9.6 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.7 | 18 / 35 | 6300 |
| 2 | 1 | 70.7 | 85.4 | 20 / 35 | 6710 |
| 3 | 1 | 70.3 | 83.5 | 21 / 35 | 6724 |
| 4 | 1 | 67.8 | 76.8 | 20 / 35 | 5762 |
| 5 | 1 | 70.4 | 84.8 | 20 / 35 | 6487 |
| 6 | 1 | 68.6 | 81.3 | 18 / 35 | 5883 |
| 7 | 1 | 70.7 | 83.5 | 23 / 35 | 6770 |
| 8 | 1 | 70.7 | 87.0 | 21 / 35 | 6626 |
| 9 | 1 | 70.6 | 83.8 | 23 / 35 | 6263 |
| 10 | 1 | 71.6 | 87.3 | 20 / 35 | 6927 |
| 11 | 1 | 69.0 | 81.0 | 18 / 35 | 5937 |
| 12 | 1 | 67.8 | 76.2 | 18 / 35 | 6160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 100 | 99% |
| mld.Infinity 2.2 | 73 | 89% |
| radnor.DoctorBob 1.42 | 70 | 64% |
| amz.NanoClone 1.41 | 22 | 91% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 180 of 420 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 85 | 47% | 161 |
| amz.NanoClone 1.41 | 28 | 16% | 49 |
| mld.Infinity 2.2 | 25 | 14% | 35 |
| mz.AntiGrav 1.0 | 22 | 12% | 113 |
| sample.Walls 1.0 | 8 | 4% | 21 |
| GarmBox.Oranges 1.0 | 5 | 3% | 12 |
| arthord.MannyPacquiao Beta | 4 | 2% | 10 |
| jangs.ns51 1.0 | 3 | 2% | 11 |

## Melee bench: F02

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.5 | 273 / 420 | 2.21 | 18.6% | 57979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.2 | 18.6% | 273 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 97 |
| mld.DustBunny 3.8 | 2.9 | 13.0% | 18 |
| maribo.melee.BMV 0.1 | 4.4 | 10.3% | 7 |
| zyx.nano.Ant 1.1 | 5.4 | 9.0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.0% | 7 |
| bzdp.BoxCar 2.0 | 7.9 | 7.4% | 0 |
| fullsail.SweetTea 1.1 | 7.9 | 7.2% | 9 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.6 | 29 / 35 | 5291 |
| 2 | 1 | 69.4 | 92.7 | 24 / 35 | 4877 |
| 3 | 1 | 67.4 | 83.8 | 22 / 35 | 4759 |
| 4 | 1 | 68.6 | 87.9 | 24 / 35 | 4916 |
| 5 | 1 | 69.8 | 93.3 | 26 / 35 | 4952 |
| 6 | 1 | 70.5 | 94.3 | 27 / 35 | 5462 |
| 7 | 1 | 67.9 | 88.3 | 23 / 35 | 4415 |
| 8 | 1 | 67.1 | 83.5 | 22 / 35 | 4575 |
| 9 | 3 | 58.6 | 52.4 | 8 / 35 | 4266 |
| 10 | 1 | 69.1 | 91.4 | 23 / 35 | 4977 |
| 11 | 1 | 66.1 | 82.5 | 21 / 35 | 4333 |
| 12 | 1 | 70.0 | 93.7 | 24 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 145 | 67% |
| mld.DustBunny 3.8 | 96 | 94% |
| djdjdj.NanoSkunk10 1.0 | 25 | 100% |
| maribo.melee.BMV 0.1 | 25 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 21 | 81% |
| fullsail.SweetTea 1.1 | 18 | 72% |
| bzdp.BoxCar 2.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |

Hadur died in 149 of 420 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 61 | 41% | 161 |
| zyx.nano.Ant 1.1 | 19 | 13% | 25 |
| mld.DustBunny 3.8 | 18 | 12% | 97 |
| maribo.melee.BMV 0.1 | 14 | 9% | 30 |
| fullsail.SweetTea 1.1 | 12 | 8% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 7% | 30 |
| cs.Grudge 1.0 | 8 | 5% | 9 |
| bzdp.BoxCar 2.0 | 4 | 3% | 10 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 31 |

## Melee bench: F03

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.9 | 262 / 420 | 2.54 | 19.4% | 68042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 19.4% | 262 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 72 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.1% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.8% | 22 |
| fm.mammillarias 1.3 | 5.4 | 9.5% | 11 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.2% | 24 |
| cs.sheldor.Talon 1.1 | 6.9 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 7.9 | 6.6% | 11 |
| sample.Fire 1.0 | 9.3 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.6 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.5 | 19 / 35 | 5598 |
| 2 | 1 | 68.1 | 79.4 | 21 / 35 | 5461 |
| 3 | 1 | 66.2 | 72.4 | 19 / 35 | 5223 |
| 4 | 1 | 69.9 | 82.5 | 26 / 35 | 5966 |
| 5 | 1 | 69.4 | 84.1 | 22 / 35 | 5661 |
| 6 | 1 | 69.2 | 84.8 | 22 / 35 | 5533 |
| 7 | 1 | 70.9 | 89.8 | 24 / 35 | 6188 |
| 8 | 1 | 71.2 | 89.5 | 25 / 35 | 5871 |
| 9 | 1 | 69.1 | 82.9 | 22 / 35 | 5510 |
| 10 | 1 | 69.8 | 84.4 | 22 / 35 | 6107 |
| 11 | 1 | 69.0 | 84.4 | 19 / 35 | 5504 |
| 12 | 1 | 67.9 | 77.5 | 21 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 111 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 64 | 94% |
| cb.nano.Insomnia 1.0 | 43 | 86% |
| myl.nano.KomoriNinja 1.1 | 39 | 85% |
| sp.Nanos.Ember 1.1 | 15 | 80% |
| fm.mammillarias 1.3 | 12 | 75% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 67% |

Hadur died in 160 of 420 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 39 | 24% | 136 |
| stelo.SoRobotNanoMelee 1.2 | 32 | 20% | 79 |
| cb.nano.Insomnia 1.0 | 22 | 14% | 24 |
| fm.mammillarias 1.3 | 21 | 13% | 28 |
| myl.nano.KomoriNinja 1.1 | 17 | 11% | 77 |
| sp.Nanos.Ember 1.1 | 11 | 7% | 28 |
| cs.sheldor.Talon 1.1 | 9 | 6% | 25 |
| sample.Fire 1.0 | 5 | 3% | 11 |
| sample.Tracker 1.0 | 3 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.0 | 278 / 420 | 2.26 | 20.1% | 74328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 20.1% | 278 |
| kawigi.nano.Lib 1.0 | 2.4 | 13.0% | 30 |
| tvv.micro.Antares 1.1.1 | 2.6 | 12.2% | 35 |
| tj.zombie1n 1.0.1 | 5.1 | 9.3% | 20 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.3% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.1% | 3 |
| yk.JahMicro 1.0 | 6.9 | 8.0% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 12 |
| repositorio.NanoStep 1.0 | 8.9 | 6.1% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 23 / 35 | 5974 |
| 2 | 1 | 68.5 | 81.6 | 19 / 35 | 6098 |
| 3 | 1 | 67.5 | 79.4 | 19 / 35 | 5616 |
| 4 | 1 | 69.3 | 80.0 | 23 / 35 | 6629 |
| 5 | 1 | 69.5 | 85.7 | 21 / 35 | 6150 |
| 6 | 1 | 72.1 | 94.6 | 30 / 35 | 6338 |
| 7 | 1 | 69.8 | 86.7 | 24 / 35 | 6227 |
| 8 | 1 | 70.9 | 88.9 | 26 / 35 | 6464 |
| 9 | 1 | 70.9 | 88.9 | 28 / 35 | 6018 |
| 10 | 1 | 70.2 | 86.3 | 22 / 35 | 6446 |
| 11 | 1 | 69.0 | 81.0 | 20 / 35 | 6510 |
| 12 | 1 | 70.1 | 90.5 | 23 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 110 | 93% |
| stelo.SoJNanoMelee 1.1 | 83 | 87% |
| tvv.micro.Antares 1.1.1 | 36 | 72% |
| tj.zombie1n 1.0.1 | 35 | 74% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 87% |
| yk.JahMicro 1.0 | 14 | 71% |
| repositorio.NanoStep 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |

Hadur died in 142 of 420 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 36 | 25% | 152 |
| tvv.micro.Antares 1.1.1 | 27 | 19% | 64 |
| stelo.SoJNanoMelee 1.1 | 24 | 17% | 66 |
| tj.zombie1n 1.0.1 | 17 | 12% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 9% | 25 |
| yk.JahMicro 1.0 | 12 | 8% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 5% | 37 |
| repositorio.NanoStep 1.0 | 4 | 3% | 20 |
| sample.VelociRobot 1.0 | 2 | 1% | 16 |

## Melee bench: F05

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 66.2 | 162 / 420 | 4.04 | 14.9% | 53436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.1 | 14.9% | 162 |
| oog.melee.Corsair 1.0 | 2.3 | 13.0% | 76 |
| ahf.NanoAndrew .4 | 3.1 | 11.9% | 62 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 48 |
| EBBU.Sim2 1.02 | 5.8 | 9.8% | 17 |
| sam.Samspin 1.0 | 5.9 | 9.7% | 28 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.2% | 18 |
| robar.nano.Assertive_Melee 0.2 | 7.1 | 9.0% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 61.0 | 13 / 35 | 4446 |
| 2 | 1 | 59.8 | 59.0 | 11 / 35 | 4238 |
| 3 | 1 | 60.4 | 63.5 | 11 / 35 | 4076 |
| 4 | 1 | 63.0 | 71.1 | 13 / 35 | 4739 |
| 5 | 1 | 63.6 | 67.6 | 15 / 35 | 4845 |
| 6 | 1 | 63.6 | 71.1 | 16 / 35 | 4607 |
| 7 | 1 | 58.7 | 56.8 | 11 / 35 | 4141 |
| 8 | 1 | 65.9 | 80.6 | 19 / 35 | 4627 |
| 9 | 2 | 60.4 | 60.3 | 12 / 35 | 4513 |
| 10 | 1 | 60.7 | 64.8 | 12 / 35 | 4351 |
| 11 | 1 | 61.6 | 67.6 | 13 / 35 | 4382 |
| 12 | 1 | 63.7 | 71.4 | 16 / 35 | 4471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 59 | 85% |
| oog.melee.Corsair 1.0 | 58 | 53% |
| ahf.NanoAndrew .4 | 45 | 78% |
| sam.Samspin 1.0 | 19 | 79% |
| EBBU.Sim2 1.02 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 9 | 100% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |

Hadur died in 259 of 420 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 49 | 19% | 91 |
| simonton.nano.MeleeSeed 1.8 | 43 | 17% | 83 |
| robar.nano.Assertive_Melee 0.2 | 41 | 16% | 50 |
| ahf.NanoAndrew .4 | 33 | 13% | 70 |
| zyx.nano.BacillusComma 1.0 | 31 | 12% | 38 |
| EBBU.Sim2 1.02 | 20 | 8% | 30 |
| sam.Samspin 1.0 | 19 | 7% | 29 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 7% | 17 |
| sample.TrackFire 1.0 | 5 | 2% | 11 |

## Melee bench: F06

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.0 | 254 / 420 | 2.44 | 18.1% | 55759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 18.1% | 254 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.6% | 51 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.5% | 31 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 10.0% | 47 |
| winamp32.micro.MicroMacro 1.0 | 5.4 | 9.2% | 18 |
| fm.claire 1.7 | 5.9 | 8.5% | 7 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.6% | 11 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 4 |
| pa.Improved 1.0 | 9.3 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.9 | 24 / 35 | 4398 |
| 2 | 1 | 67.6 | 85.4 | 21 / 35 | 4712 |
| 3 | 1 | 64.6 | 73.7 | 19 / 35 | 4331 |
| 4 | 1 | 65.6 | 77.5 | 19 / 35 | 4563 |
| 5 | 1 | 67.6 | 84.4 | 23 / 35 | 4624 |
| 6 | 1 | 66.1 | 81.0 | 18 / 35 | 4624 |
| 7 | 1 | 68.2 | 87.6 | 21 / 35 | 4849 |
| 8 | 1 | 69.2 | 90.8 | 23 / 35 | 4949 |
| 9 | 1 | 67.8 | 87.0 | 20 / 35 | 4698 |
| 10 | 1 | 69.4 | 86.3 | 26 / 35 | 5236 |
| 11 | 1 | 66.1 | 81.0 | 18 / 35 | 4355 |
| 12 | 1 | 67.2 | 85.4 | 22 / 35 | 4420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 125 | 91% |
| oog.melee.CapuletDroid 1.1 | 56 | 68% |
| gh.nano.Grofvuil 0.2 | 54 | 85% |
| arthord.NanoSatanMelee Beta | 27 | 81% |
| winamp32.micro.MicroMacro 1.0 | 18 | 61% |
| fm.claire 1.7 | 13 | 85% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 5 | 60% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 168 of 420 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 38 | 23% | 103 |
| d414.nano.Quantum 1.0.0 | 34 | 20% | 129 |
| oog.melee.CapuletDroid 1.1 | 33 | 20% | 30 |
| arthord.NanoSatanMelee Beta | 22 | 13% | 47 |
| winamp32.micro.MicroMacro 1.0 | 11 | 7% | 32 |
| fm.claire 1.7 | 11 | 7% | 23 |
| sample.SpinBot 1.0 | 7 | 4% | 18 |
| pa.Improved 1.0 | 6 | 4% | 16 |
| kurios.DOSexe .9b | 4 | 2% | 21 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.3 | 176 / 420 | 2.77 | 17.5% | 63916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 17.5% | 176 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 94 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 43 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 85 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 9 |
| caimano.Furia_Ceca 0.22 | 6.1 | 7.5% | 3 |
| el.JumpShoot 0.2 | 7.6 | 6.7% | 4 |
| mbro.Detektor3 0.1.1 | 8.6 | 5.9% | 6 |
| acogdev.alpha 0.2 | 8.7 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.9 | 14 / 35 | 6191 |
| 2 | 1 | 67.4 | 82.5 | 14 / 35 | 5745 |
| 3 | 1 | 66.2 | 79.4 | 14 / 35 | 5113 |
| 4 | 1 | 64.9 | 77.5 | 13 / 35 | 4674 |
| 5 | 1 | 68.7 | 86.7 | 20 / 35 | 5410 |
| 6 | 1 | 66.2 | 78.4 | 12 / 35 | 5519 |
| 7 | 1 | 67.3 | 80.6 | 16 / 35 | 5605 |
| 8 | 1 | 66.1 | 79.4 | 15 / 35 | 4842 |
| 9 | 1 | 65.4 | 75.2 | 14 / 35 | 5178 |
| 10 | 1 | 67.3 | 81.0 | 12 / 35 | 5498 |
| 11 | 1 | 66.3 | 81.0 | 15 / 35 | 4974 |
| 12 | 1 | 66.8 | 79.0 | 17 / 35 | 5167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 99 | 87% |
| mz.MicroGodMelee 1 | 83 | 43% |
| gh.micro.Gruweltje 0.7 | 62 | 23% |
| DBall.Anarchy 0.1 | 20 | 95% |
| mbro.Detektor3 0.1.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| el.JumpShoot 0.2 | 7 | 86% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 245 of 420 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 82 | 33% | 124 |
| gh.micro.Gruweltje 0.7 | 74 | 30% | 99 |
| spinnercat.micro.Tyger 0.1 | 38 | 16% | 93 |
| acogdev.alpha 0.2 | 13 | 5% | 16 |
| caimano.Furia_Ceca 0.22 | 12 | 5% | 18 |
| fire219.CatBot 1.0 | 11 | 4% | 17 |
| el.JumpShoot 0.2 | 8 | 3% | 16 |
| DBall.Anarchy 0.1 | 6 | 2% | 23 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 14 |

## Melee bench: F08

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.9 | 180 / 420 | 3.89 | 15.3% | 56786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.6 | 15.3% | 180 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.3% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.6 | 13.6% | 66 |
| germ.TheMind .2 | 4.7 | 10.1% | 16 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.9% | 10 |
| awesomeness.Elite 1.0 | 6.6 | 8.5% | 21 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 12 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 66.3 | 13 / 35 | 4621 |
| 2 | 2 | 60.1 | 58.4 | 16 / 35 | 4692 |
| 3 | 2 | 61.1 | 65.4 | 12 / 35 | 4258 |
| 4 | 1 | 64.3 | 73.3 | 17 / 35 | 4674 |
| 5 | 1 | 62.2 | 66.3 | 15 / 35 | 4680 |
| 6 | 1 | 66.3 | 75.9 | 20 / 35 | 5275 |
| 7 | 2 | 62.8 | 65.4 | 13 / 35 | 4908 |
| 8 | 2 | 61.1 | 63.2 | 16 / 35 | 4462 |
| 9 | 1 | 67.3 | 80.0 | 20 / 35 | 5133 |
| 10 | 3 | 58.6 | 56.2 | 7 / 35 | 4605 |
| 11 | 1 | 66.3 | 79.7 | 19 / 35 | 4572 |
| 12 | 1 | 61.7 | 65.1 | 12 / 35 | 4906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 145 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 38 | 76% |
| germ.TheMind .2 | 17 | 76% |
| stelo.UntouchableNano 1.3 | 12 | 83% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| lrem.micro.MoggFanatic 0.2 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 240 of 420 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 43% | 200 |
| simonton.nano.WeekendObsession_Melee 1.0 | 38 | 16% | 66 |
| germ.TheMind .2 | 28 | 12% | 44 |
| lrem.micro.MoggFanatic 0.2 | 18 | 8% | 26 |
| awesomeness.Elite 1.0 | 18 | 8% | 24 |
| stelo.UntouchableNano 1.3 | 12 | 5% | 23 |
| qualidafial.MajorDick 1.0.1 | 12 | 5% | 13 |
| mym.EdgeStalker 1.0 | 8 | 3% | 13 |
| sample.Crazy 1.0 | 2 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.0 | 269 / 420 | 2.44 | 18.4% | 52508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 18.4% | 269 |
| rz.HawkOnFire 0.1 | 2.1 | 13.7% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.0% | 36 |
| maribo.IotaCT 1.1 | 4.2 | 11.2% | 30 |
| timmit.nano.TimDog 0.33 | 5.1 | 10.1% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.6% | 2 |
| ratosh.Wesco 1.4 | 7.8 | 8.2% | 8 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 5 |
| stelo.PatternRobot 1.0 | 8.1 | 7.9% | 15 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.3 | 22 / 35 | 3990 |
| 2 | 1 | 70.0 | 89.5 | 26 / 35 | 4542 |
| 3 | 1 | 69.4 | 86.3 | 21 / 35 | 4854 |
| 4 | 1 | 67.7 | 84.4 | 22 / 35 | 3967 |
| 5 | 1 | 67.0 | 78.4 | 23 / 35 | 4038 |
| 6 | 1 | 69.9 | 88.3 | 26 / 35 | 4609 |
| 7 | 1 | 69.6 | 87.6 | 24 / 35 | 4695 |
| 8 | 1 | 69.2 | 86.0 | 23 / 35 | 4641 |
| 9 | 1 | 67.1 | 81.0 | 21 / 35 | 4177 |
| 10 | 1 | 66.1 | 77.5 | 18 / 35 | 4202 |
| 11 | 1 | 68.6 | 85.1 | 20 / 35 | 4383 |
| 12 | 1 | 68.1 | 83.2 | 23 / 35 | 4410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 124 | 94% |
| nz.jdc.nano.GridFu 1.0 | 58 | 90% |
| maribo.IotaCT 1.1 | 32 | 75% |
| stelo.PatternRobot 1.0 | 24 | 92% |
| timmit.nano.TimDog 0.33 | 22 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 100% |
| ratosh.Wesco 1.4 | 15 | 87% |
| spinnercat.Omen 1.0 | 8 | 100% |

Hadur died in 151 of 420 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 37 | 25% | 59 |
| rz.HawkOnFire 0.1 | 27 | 18% | 114 |
| nz.jdc.nano.GridFu 1.0 | 21 | 14% | 81 |
| stelo.PatternRobot 1.0 | 19 | 13% | 32 |
| maribo.IotaCT 1.1 | 17 | 11% | 56 |
| ratosh.Wesco 1.4 | 14 | 9% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 7% | 26 |
| spinnercat.Omen 1.0 | 5 | 3% | 14 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 3 |

## Melee bench: F10

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.7 | 317 / 420 | 1.93 | 20.7% | 72520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 20.7% | 317 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.5% | 45 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 12 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 8 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.3% | 2 |
| sanja.First 0.1 | 6.8 | 8.4% | 7 |
| cvt.Firsty 1.0 | 7.9 | 7.3% | 14 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 5 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.3 | 26 / 35 | 5871 |
| 2 | 1 | 72.0 | 93.7 | 26 / 35 | 6492 |
| 3 | 1 | 71.0 | 92.7 | 29 / 35 | 5911 |
| 4 | 1 | 70.6 | 89.8 | 26 / 35 | 5896 |
| 5 | 1 | 69.0 | 83.5 | 24 / 35 | 5865 |
| 6 | 1 | 70.4 | 88.3 | 26 / 35 | 6145 |
| 7 | 1 | 70.6 | 91.4 | 27 / 35 | 6121 |
| 8 | 1 | 71.0 | 91.7 | 29 / 35 | 6130 |
| 9 | 1 | 70.3 | 87.9 | 22 / 35 | 6258 |
| 10 | 1 | 69.2 | 87.9 | 25 / 35 | 5473 |
| 11 | 1 | 69.7 | 86.3 | 27 / 35 | 5739 |
| 12 | 1 | 72.3 | 94.3 | 30 / 35 | 6619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 93 | 85% |
| baal.nano.N 1.42 | 71 | 96% |
| cvt.Firsty 1.0 | 53 | 87% |
| sanja.First 0.1 | 44 | 93% |
| zyx.micro.Ant 1.1 | 35 | 100% |
| Grystrion.TrackerWO 1.0 | 21 | 86% |
| amk.Punbot.Punbot 0.01 | 21 | 95% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 104 of 420 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 28 | 27% | 129 |
| zyx.micro.Ant 1.1 | 21 | 20% | 78 |
| cvt.Firsty 1.0 | 12 | 12% | 35 |
| sanja.First 0.1 | 10 | 10% | 42 |
| baal.nano.N 1.42 | 9 | 9% | 61 |
| sample.RamFire 1.0 | 9 | 9% | 13 |
| Grystrion.TrackerWO 1.0 | 7 | 7% | 29 |
| amk.Punbot.Punbot 0.01 | 4 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 12 |

## Melee bench: F11

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 62.6 | 97 / 420 | 4.37 | 13.5% | 51098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.0% | 191 |
| cs.Wren 1.0 | 2.8 | 12.9% | 35 |
| hadur117.micro.SaorP 0.1 | 2.8 | 13.5% | 97 |
| js.PinBall 1.6 | 4.0 | 11.7% | 36 |
| mz.Cork 0.1 | 4.5 | 11.5% | 33 |
| joe.ADinosaur 1.0 | 6.1 | 9.3% | 7 |
| evd.X1 0.01 | 6.9 | 8.1% | 2 |
| jsal.Jsalbot 1.0 | 8.1 | 6.9% | 8 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 11 |
| PSW.Relentless 0.1 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 54.3 | 4 / 35 | 4052 |
| 2 | 3 | 58.6 | 59.7 | 5 / 35 | 4128 |
| 3 | 4 | 56.5 | 52.7 | 8 / 35 | 4164 |
| 4 | 2 | 60.3 | 65.7 | 9 / 35 | 4198 |
| 5 | 2 | 61.0 | 67.6 | 7 / 35 | 4250 |
| 6 | 3 | 58.5 | 61.0 | 8 / 35 | 4011 |
| 7 | 3 | 60.2 | 62.5 | 9 / 35 | 4616 |
| 8 | 2 | 61.8 | 67.6 | 10 / 35 | 4216 |
| 9 | 2 | 64.6 | 76.2 | 13 / 35 | 4585 |
| 10 | 2 | 62.5 | 67.6 | 11 / 35 | 4751 |
| 11 | 3 | 57.3 | 57.5 | 6 / 35 | 4053 |
| 12 | 4 | 58.6 | 58.7 | 7 / 35 | 4074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 104 | 42% |
| cs.Wren 1.0 | 37 | 89% |
| js.PinBall 1.6 | 11 | 36% |
| mz.Cork 0.1 | 7 | 57% |
| joe.ADinosaur 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 323 of 420 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 123 | 38% | 169 |
| joe.ADinosaur 1.0 | 45 | 14% | 50 |
| cs.Wren 1.0 | 42 | 13% | 64 |
| js.PinBall 1.6 | 38 | 12% | 46 |
| mz.Cork 0.1 | 31 | 10% | 39 |
| evd.X1 0.01 | 21 | 7% | 24 |
| jsal.Jsalbot 1.0 | 10 | 3% | 13 |
| PSW.Relentless 0.1 | 7 | 2% | 8 |
| donjezza.Jezza 1.0 | 6 | 2% | 7 |

## Melee bench: F12

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.7 | 234 / 420 | 3.01 | 17.5% | 54516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 17.5% | 234 |
| ntc.Opposite 1.5 | 2.8 | 11.7% | 23 |
| myl.nano.Graviton 1.10 | 3.5 | 11.3% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.9% | 18 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.3% | 13 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.1% | 40 |
| disan.Chair 2.2.0 | 6.8 | 8.5% | 16 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 18 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 12 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.2 | 21 / 35 | 4942 |
| 2 | 1 | 61.8 | 65.1 | 15 / 35 | 4399 |
| 3 | 1 | 65.5 | 77.1 | 16 / 35 | 4507 |
| 4 | 1 | 63.7 | 72.4 | 17 / 35 | 4240 |
| 5 | 1 | 64.1 | 70.2 | 18 / 35 | 4406 |
| 6 | 1 | 66.9 | 79.4 | 22 / 35 | 4654 |
| 7 | 1 | 67.3 | 80.0 | 22 / 35 | 4887 |
| 8 | 1 | 65.6 | 80.0 | 17 / 35 | 4201 |
| 9 | 1 | 66.5 | 79.0 | 18 / 35 | 4660 |
| 10 | 1 | 67.3 | 80.0 | 23 / 35 | 4857 |
| 11 | 1 | 65.6 | 76.5 | 17 / 35 | 4282 |
| 12 | 1 | 69.6 | 90.5 | 28 / 35 | 4481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 52 | 83% |
| myl.nano.Graviton 1.10 | 47 | 87% |
| ntc.Opposite 1.5 | 36 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 32 | 94% |
| donjezza.Muncho 1.0 | 29 | 93% |
| disan.Chair 2.2.0 | 29 | 79% |
| DBall.NUKE 0.1 | 23 | 96% |
| pfvicm.Sobieski 7.2.3b | 12 | 83% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 51 | 27% | 66 |
| myl.nano.Graviton 1.10 | 32 | 17% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 28 | 15% | 57 |
| stelo.AreaTargetingBot 1.1 | 27 | 14% | 68 |
| ntc.Opposite 1.5 | 25 | 13% | 41 |
| DBall.NUKE 0.1 | 11 | 6% | 39 |
| disan.Chair 2.2.0 | 11 | 6% | 31 |
| donjezza.Muncho 1.0 | 3 | 2% | 25 |
| pbg.R2D2 1.0 | 2 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 69.9 | 123 / 420 | 3.71 | 14.6% | 45471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 121 |
| hadur117.micro.SaorP 0.1 | 2.0 | 14.6% | 123 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 74 |
| yagami.Tidus 0.11 | 4.1 | 12.6% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.8% | 54 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 22 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 2 |
| step.nanoPri 1.0 | 8.1 | 6.7% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 67.3 | 9 / 35 | 3253 |
| 2 | 2 | 61.9 | 68.6 | 9 / 35 | 3824 |
| 3 | 4 | 60.9 | 63.8 | 6 / 35 | 3889 |
| 4 | 4 | 59.9 | 61.9 | 8 / 35 | 3519 |
| 5 | 2 | 63.4 | 71.1 | 9 / 35 | 4091 |
| 6 | 1 | 64.9 | 77.5 | 15 / 35 | 4011 |
| 7 | 1 | 62.8 | 69.8 | 12 / 35 | 3675 |
| 8 | 2 | 62.6 | 68.6 | 12 / 35 | 3839 |
| 9 | 2 | 63.2 | 70.5 | 11 / 35 | 3742 |
| 10 | 1 | 62.8 | 68.9 | 13 / 35 | 3932 |
| 11 | 1 | 64.6 | 78.4 | 11 / 35 | 3566 |
| 12 | 2 | 63.5 | 72.7 | 8 / 35 | 4130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 39% |
| kawigi.micro.Shiz 1.1 | 43 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 76% |
| yagami.Tidus 0.11 | 34 | 85% |
| ejb.Polaris 1.0.1 | 10 | 40% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 297 of 420 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 132 | 44% | 162 |
| yagami.Tidus 0.11 | 39 | 13% | 65 |
| ejb.Polaris 1.0.1 | 33 | 11% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 11% | 63 |
| kawigi.micro.Shiz 1.1 | 32 | 11% | 54 |
| stelo.MirrorNano 1.3 | 15 | 5% | 16 |
| kurios.DOSexe .9a | 7 | 2% | 8 |
| step.nanoPri 1.0 | 7 | 2% | 8 |

## Melee bench: F14

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.0 | 232 / 420 | 2.89 | 16.8% | 48587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 16.8% | 232 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 34 |
| wee.Gem 1.8.4 | 3.6 | 12.1% | 68 |
| wompi.Quokka 1.6 | 3.7 | 11.8% | 36 |
| ratosh.Nobo 0.21 | 3.8 | 11.4% | 14 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 22 |
| bayen.UbaMicro 1.4 | 6.8 | 9.0% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 6.5% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 2 |
| maribo.FollowFire 1 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 73.7 | 17 / 35 | 3756 |
| 2 | 1 | 66.2 | 81.6 | 20 / 35 | 4229 |
| 3 | 1 | 62.6 | 72.1 | 15 / 35 | 3821 |
| 4 | 1 | 67.8 | 87.6 | 21 / 35 | 4462 |
| 5 | 1 | 67.0 | 84.1 | 22 / 35 | 4348 |
| 6 | 1 | 65.2 | 80.3 | 21 / 35 | 3850 |
| 7 | 1 | 62.0 | 66.7 | 16 / 35 | 3762 |
| 8 | 1 | 66.3 | 83.2 | 17 / 35 | 4281 |
| 9 | 1 | 67.7 | 87.6 | 24 / 35 | 4084 |
| 10 | 1 | 65.8 | 79.0 | 20 / 35 | 4146 |
| 11 | 1 | 63.6 | 74.6 | 18 / 35 | 3735 |
| 12 | 1 | 65.6 | 78.1 | 21 / 35 | 4113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 77 | 86% |
| bzdp.Pansy 2.1 | 76 | 88% |
| wompi.Quokka 1.6 | 48 | 77% |
| ratosh.Nobo 0.21 | 31 | 94% |
| m3thos.Eva00 1.1 | 19 | 89% |
| bayen.UbaMicro 1.4 | 12 | 75% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 194 of 420 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 39 | 20% | 63 |
| wee.Gem 1.8.4 | 30 | 15% | 98 |
| ratosh.Nobo 0.21 | 25 | 13% | 58 |
| m3thos.Eva00 1.1 | 24 | 12% | 37 |
| bzdp.Pansy 2.1 | 21 | 11% | 82 |
| bayen.UbaMicro 1.4 | 18 | 9% | 28 |
| maribo.FollowFire 1 | 15 | 8% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 7% | 23 |
| stelo.MyAgileRobot 0.2 | 7 | 4% | 8 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 79.7 | 86 / 420 | 2.83 | 17.9% | 81014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.2% | 282 |
| hadur117.micro.SaorP 0.1 | 2.0 | 17.9% | 86 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 37 |
| ayk.WallHugger 1.0 | 4.3 | 10.3% | 4 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.1% | 6 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 2 |
| sample.SittingDuck 1.0 | 9.1 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 80.6 | 7 / 35 | 7324 |
| 2 | 2 | 67.1 | 75.6 | 4 / 35 | 6406 |
| 3 | 2 | 69.0 | 80.6 | 6 / 35 | 6976 |
| 4 | 2 | 70.4 | 83.2 | 12 / 35 | 7199 |
| 5 | 2 | 65.3 | 72.4 | 5 / 35 | 6029 |
| 6 | 2 | 70.1 | 84.8 | 9 / 35 | 7199 |
| 7 | 2 | 69.7 | 84.4 | 9 / 35 | 6723 |
| 8 | 2 | 68.5 | 80.3 | 5 / 35 | 6908 |
| 9 | 2 | 69.1 | 80.6 | 10 / 35 | 7012 |
| 10 | 2 | 68.5 | 81.6 | 7 / 35 | 6512 |
| 11 | 2 | 67.0 | 78.1 | 6 / 35 | 5971 |
| 12 | 2 | 67.0 | 74.3 | 6 / 35 | 6755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 205 | 18% |
| mz.NanoGod 2.02 | 33 | 73% |
| exauge.GateKeeper 1.1.121g | 13 | 69% |
| ayk.WallHugger 1.0 | 6 | 67% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 334 of 420 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 226 | 68% | 269 |
| mz.NanoGod 2.02 | 63 | 19% | 91 |
| ayk.WallHugger 1.0 | 19 | 6% | 24 |
| exauge.GateKeeper 1.1.121g | 15 | 4% | 17 |
| stuff.Vlad 0.1 | 6 | 2% | 8 |
| stelo.PianistNano 1.2 | 5 | 1% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 74.1 | 226 / 420 | 3.33 | 16.5% | 53260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 16.5% | 226 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 12.7% | 42 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.1% | 39 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 37 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.0% | 33 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 14 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 16 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 68.9 | 16 / 35 | 4440 |
| 2 | 1 | 63.4 | 69.2 | 19 / 35 | 4298 |
| 3 | 1 | 65.6 | 74.3 | 20 / 35 | 4959 |
| 4 | 1 | 65.5 | 78.7 | 19 / 35 | 4213 |
| 5 | 1 | 62.7 | 69.2 | 17 / 35 | 4119 |
| 6 | 1 | 60.8 | 64.4 | 14 / 35 | 3879 |
| 7 | 1 | 67.1 | 81.0 | 22 / 35 | 4764 |
| 8 | 1 | 67.3 | 82.9 | 20 / 35 | 4845 |
| 9 | 1 | 64.5 | 72.1 | 18 / 35 | 4574 |
| 10 | 1 | 64.0 | 73.0 | 19 / 35 | 4204 |
| 11 | 1 | 64.9 | 75.9 | 20 / 35 | 4266 |
| 12 | 1 | 66.6 | 80.0 | 22 / 35 | 4699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 79 | 92% |
| dummy.micro.Sparrow 2.5 | 74 | 92% |
| bvh.micro.Freya 0.3 | 39 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 36 | 83% |
| ap.Frederick 1.1 | 12 | 83% |
| stelo.MirrorMicro 1.0 | 9 | 89% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 194 of 420 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 21% | 103 |
| conscience.Electron 1.3g | 29 | 15% | 35 |
| dummy.micro.Sparrow 2.5 | 28 | 14% | 91 |
| mn.nano.perceptual.Impact 1.3.0 | 28 | 14% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 11% | 70 |
| bvh.micro.Freya 0.3 | 19 | 10% | 43 |
| dl.BetterWalls 1.0 | 17 | 9% | 26 |
| stelo.MirrorMicro 1.0 | 9 | 5% | 25 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 85.2 | 286 / 420 | 2.34 | 20.2% | 77492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 20.2% | 286 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.4% | 43 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 21 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.0% | 27 |
| mme.NikeEnhanced 2.0 | 5.1 | 9.3% | 9 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 16 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.5% | 6 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 8.9 | 5.9% | 2 |
| sample.Corners 1.0 | 9.3 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 86.0 | 24 / 35 | 6579 |
| 2 | 1 | 70.5 | 87.0 | 24 / 35 | 6069 |
| 3 | 1 | 70.2 | 85.4 | 23 / 35 | 6280 |
| 4 | 1 | 70.3 | 85.1 | 27 / 35 | 6516 |
| 5 | 1 | 72.6 | 93.3 | 30 / 35 | 6666 |
| 6 | 1 | 70.9 | 87.6 | 24 / 35 | 6885 |
| 7 | 1 | 69.4 | 81.9 | 22 / 35 | 6386 |
| 8 | 1 | 72.0 | 89.2 | 26 / 35 | 7158 |
| 9 | 1 | 69.6 | 84.8 | 24 / 35 | 6027 |
| 10 | 1 | 68.4 | 79.4 | 20 / 35 | 6277 |
| 11 | 1 | 67.9 | 78.1 | 19 / 35 | 6061 |
| 12 | 1 | 70.4 | 84.1 | 23 / 35 | 6588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 100 | 89% |
| sul.Lunar 1.1 | 82 | 96% |
| supersample.SuperBoxBot 1.0 | 47 | 91% |
| dsw.StaticD 1.0 | 26 | 69% |
| sample.MyFirstRobot 1.0 | 19 | 74% |
| mme.NikeEnhanced 2.0 | 17 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 92% |
| tlp.ThreeLeggedPig 1 | 10 | 90% |
| sample.Corners 1.0 | 6 | 100% |

Hadur died in 136 of 420 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 42 | 31% | 76 |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 26% | 117 |
| dsw.StaticD 1.0 | 24 | 18% | 50 |
| mme.NikeEnhanced 2.0 | 8 | 6% | 31 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 17 |
| sul.Lunar 1.1 | 7 | 5% | 94 |
| sample.Corners 1.0 | 5 | 4% | 12 |
| tlp.ThreeLeggedPig 1 | 4 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 14 |

## Melee bench: F18

hadur117.micro.SaorP 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 76.7 | 199 / 420 | 3.10 | 17.1% | 66510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorP 0.1 | 1.0 | 17.1% | 199 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 72 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.2% | 51 |
| mld.Wisdom 1.0 | 3.6 | 11.8% | 32 |
| amz.NanoClone 1.41 | 5.1 | 10.6% | 30 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.1% | 14 |
| sample.Walls 1.0 | 7.3 | 7.7% | 13 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 9 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 73.0 | 17 / 35 | 5176 |
| 2 | 1 | 64.3 | 73.0 | 14 / 35 | 5314 |
| 3 | 1 | 66.9 | 79.0 | 17 / 35 | 5752 |
| 4 | 1 | 64.4 | 73.3 | 15 / 35 | 4969 |
| 5 | 1 | 65.4 | 74.9 | 16 / 35 | 5518 |
| 6 | 1 | 65.1 | 73.7 | 13 / 35 | 5709 |
| 7 | 1 | 64.5 | 72.1 | 14 / 35 | 5324 |
| 8 | 1 | 67.4 | 78.7 | 19 / 35 | 5846 |
| 9 | 1 | 67.1 | 82.2 | 17 / 35 | 5498 |
| 10 | 1 | 69.1 | 81.9 | 22 / 35 | 6519 |
| 11 | 1 | 65.8 | 77.8 | 17 / 35 | 5146 |
| 12 | 1 | 67.2 | 80.6 | 18 / 35 | 5739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 92 | 90% |
| radnor.DoctorBob 1.42 | 61 | 56% |
| KiraNL.Chupacabra 0.4 | 20 | 75% |
| mld.Wisdom 1.0 | 20 | 70% |
| amz.NanoClone 1.41 | 20 | 65% |
| sample.Walls 1.0 | 14 | 100% |
| GarmBox.Oranges 1.0 | 13 | 100% |
| jangs.ns51 1.0 | 11 | 73% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 222 of 420 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 66 | 30% | 108 |
| mld.Wisdom 1.0 | 47 | 21% | 69 |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 16% | 117 |
| KiraNL.Chupacabra 0.4 | 35 | 16% | 46 |
| amz.NanoClone 1.41 | 27 | 12% | 41 |
| jangs.ns51 1.0 | 6 | 3% | 16 |
| sample.Walls 1.0 | 4 | 2% | 14 |
| GarmBox.Oranges 1.0 | 2 | 1% | 7 |

