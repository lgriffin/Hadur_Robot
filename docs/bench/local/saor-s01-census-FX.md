# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.4 | 318 / 420 | 1.86 | 21.8% | 87335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 21.8% | 318 |
| radnor.DoctorBob 1.42 | 2.6 | 14.1% | 37 |
| mz.AntiGrav 1.0 | 2.9 | 14.0% | 29 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 29 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 3 |
| sample.Walls 1.0 | 6.3 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.9 | 5.8% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.1 | 27 / 35 | 7488 |
| 2 | 1 | 73.2 | 91.7 | 29 / 35 | 7328 |
| 3 | 1 | 74.5 | 95.6 | 30 / 35 | 7733 |
| 4 | 1 | 73.7 | 94.3 | 28 / 35 | 7807 |
| 5 | 1 | 71.6 | 87.6 | 26 / 35 | 6879 |
| 6 | 1 | 71.7 | 86.3 | 23 / 35 | 7369 |
| 7 | 1 | 72.4 | 89.2 | 27 / 35 | 7155 |
| 8 | 1 | 71.8 | 87.6 | 24 / 35 | 7030 |
| 9 | 1 | 73.8 | 94.0 | 29 / 35 | 7465 |
| 10 | 1 | 71.5 | 87.0 | 26 / 35 | 6539 |
| 11 | 1 | 72.4 | 88.6 | 25 / 35 | 7402 |
| 12 | 1 | 72.9 | 92.4 | 24 / 35 | 7140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 143 | 99% |
| mld.Infinity 2.2 | 98 | 91% |
| radnor.DoctorBob 1.42 | 68 | 84% |
| amz.NanoClone 1.41 | 14 | 86% |
| jangs.ns51 1.0 | 6 | 83% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 102 of 420 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 49 | 48% | 150 |
| mld.Infinity 2.2 | 15 | 15% | 35 |
| amz.NanoClone 1.41 | 10 | 10% | 26 |
| GarmBox.Oranges 1.0 | 8 | 8% | 12 |
| mz.AntiGrav 1.0 | 7 | 7% | 144 |
| arthord.MannyPacquiao Beta | 6 | 6% | 15 |
| sample.Walls 1.0 | 5 | 5% | 17 |
| jangs.ns51 1.0 | 2 | 2% | 15 |

## Melee bench: F02

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.9 | 284 / 420 | 2.36 | 18.9% | 63143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 18.9% | 284 |
| oog.melee.Mercutio 1.0 | 1.9 | 14.2% | 74 |
| mld.DustBunny 3.8 | 3.3 | 12.6% | 22 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 6 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.4% | 17 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.6% | 8 |
| fullsail.SweetTea 1.1 | 8.3 | 6.7% | 5 |
| bzdp.BoxCar 2.0 | 8.4 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 57.1 | 15 / 35 | 4953 |
| 2 | 1 | 69.1 | 87.3 | 25 / 35 | 5159 |
| 3 | 1 | 70.1 | 92.7 | 26 / 35 | 5552 |
| 4 | 1 | 69.5 | 91.4 | 26 / 35 | 5063 |
| 5 | 1 | 70.5 | 94.9 | 28 / 35 | 5451 |
| 6 | 1 | 67.6 | 83.8 | 22 / 35 | 4788 |
| 7 | 1 | 71.3 | 95.6 | 28 / 35 | 5588 |
| 8 | 1 | 68.6 | 86.3 | 23 / 35 | 5275 |
| 9 | 1 | 69.0 | 86.7 | 25 / 35 | 5135 |
| 10 | 1 | 70.9 | 94.9 | 28 / 35 | 5474 |
| 11 | 1 | 71.0 | 92.4 | 28 / 35 | 5691 |
| 12 | 2 | 60.6 | 55.6 | 10 / 35 | 5014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 150 | 81% |
| mld.DustBunny 3.8 | 92 | 93% |
| djdjdj.NanoSkunk10 1.0 | 21 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 83% |
| maribo.melee.BMV 0.1 | 16 | 94% |
| fullsail.SweetTea 1.1 | 13 | 100% |
| zyx.nano.Ant 1.1 | 11 | 82% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 136 of 420 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 47 | 35% | 167 |
| mld.DustBunny 3.8 | 22 | 16% | 88 |
| cs.Grudge 1.0 | 21 | 15% | 23 |
| zyx.nano.Ant 1.1 | 14 | 10% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 7% | 31 |
| maribo.melee.BMV 0.1 | 9 | 7% | 28 |
| fullsail.SweetTea 1.1 | 6 | 4% | 22 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 29 |
| bzdp.BoxCar 2.0 | 3 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.6 | 301 / 420 | 2.20 | 20.7% | 76100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 20.7% | 301 |
| myl.micro.Troodon 1.10 | 2.3 | 13.6% | 46 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.1% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.9% | 22 |
| cb.nano.Insomnia 1.0 | 4.9 | 9.8% | 22 |
| fm.mammillarias 1.3 | 5.7 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.6 | 7.2% | 8 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 1 |
| sample.Fire 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 90.8 | 29 / 35 | 6353 |
| 2 | 1 | 67.5 | 75.2 | 20 / 35 | 5468 |
| 3 | 1 | 71.0 | 86.0 | 23 / 35 | 6755 |
| 4 | 1 | 71.6 | 89.5 | 26 / 35 | 6428 |
| 5 | 1 | 71.4 | 87.0 | 24 / 35 | 6771 |
| 6 | 1 | 71.8 | 90.8 | 27 / 35 | 6395 |
| 7 | 1 | 70.4 | 86.3 | 22 / 35 | 6381 |
| 8 | 1 | 71.8 | 89.2 | 27 / 35 | 6391 |
| 9 | 1 | 72.3 | 91.1 | 28 / 35 | 6710 |
| 10 | 1 | 68.7 | 79.7 | 19 / 35 | 6174 |
| 11 | 1 | 72.2 | 93.3 | 30 / 35 | 6232 |
| 12 | 1 | 69.8 | 80.3 | 26 / 35 | 6042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 106 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 72 | 94% |
| cb.nano.Insomnia 1.0 | 55 | 80% |
| myl.nano.KomoriNinja 1.1 | 45 | 91% |
| sp.Nanos.Ember 1.1 | 31 | 84% |
| fm.mammillarias 1.3 | 8 | 100% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 34 | 28% | 30 |
| myl.micro.Troodon 1.10 | 17 | 14% | 143 |
| myl.nano.KomoriNinja 1.1 | 17 | 14% | 80 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 13% | 65 |
| sp.Nanos.Ember 1.1 | 9 | 8% | 40 |
| fm.mammillarias 1.3 | 9 | 8% | 23 |
| cs.sheldor.Talon 1.1 | 9 | 8% | 19 |
| sample.Fire 1.0 | 6 | 5% | 13 |
| sample.Tracker 1.0 | 3 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.0 | 296 / 420 | 2.26 | 20.3% | 76484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 20.3% | 296 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.0% | 31 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 27 |
| tj.zombie1n 1.0.1 | 5.1 | 9.0% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.4 | 8.8% | 20 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 7.1 | 8.0% | 11 |
| repositorio.NanoStep 1.0 | 9.2 | 6.4% | 4 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 23 / 35 | 6014 |
| 2 | 1 | 69.8 | 83.8 | 26 / 35 | 6390 |
| 3 | 1 | 68.9 | 79.4 | 26 / 35 | 6537 |
| 4 | 1 | 68.2 | 79.4 | 21 / 35 | 5889 |
| 5 | 1 | 70.9 | 88.9 | 25 / 35 | 6530 |
| 6 | 1 | 69.7 | 82.5 | 25 / 35 | 6695 |
| 7 | 1 | 70.8 | 87.0 | 23 / 35 | 6622 |
| 8 | 1 | 71.6 | 90.8 | 27 / 35 | 6742 |
| 9 | 1 | 69.6 | 86.7 | 22 / 35 | 6129 |
| 10 | 1 | 67.0 | 78.7 | 18 / 35 | 5741 |
| 11 | 1 | 72.0 | 90.8 | 30 / 35 | 6624 |
| 12 | 1 | 72.3 | 95.2 | 30 / 35 | 6571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 135 | 88% |
| stelo.SoJNanoMelee 1.1 | 83 | 95% |
| tj.zombie1n 1.0.1 | 28 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 25 | 80% |
| tvv.micro.Antares 1.1.1 | 25 | 76% |
| yk.JahMicro 1.0 | 19 | 79% |
| repositorio.NanoStep 1.0 | 9 | 100% |
| sample.VelociRobot 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |

Hadur died in 126 of 420 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 43 | 34% | 169 |
| stelo.SoJNanoMelee 1.1 | 23 | 18% | 67 |
| tvv.micro.Antares 1.1.1 | 18 | 14% | 44 |
| tj.zombie1n 1.0.1 | 14 | 11% | 26 |
| yk.JahMicro 1.0 | 10 | 8% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 6% | 35 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 6% | 17 |
| repositorio.NanoStep 1.0 | 2 | 2% | 20 |
| sample.VelociRobot 1.0 | 2 | 2% | 18 |

## Melee bench: F05

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.7 | 202 / 420 | 3.73 | 16.0% | 58156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 16.0% | 202 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 59 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 45 |
| simonton.nano.MeleeSeed 1.8 | 3.6 | 11.1% | 48 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 11 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 27 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.7% | 12 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.8% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.8% | 0 |
| sample.TrackFire 1.0 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 67.6 | 14 / 35 | 5101 |
| 2 | 1 | 62.4 | 66.3 | 16 / 35 | 4612 |
| 3 | 1 | 65.8 | 76.5 | 19 / 35 | 4879 |
| 4 | 1 | 62.5 | 65.7 | 17 / 35 | 4513 |
| 5 | 1 | 60.3 | 61.3 | 11 / 35 | 4568 |
| 6 | 1 | 61.8 | 61.9 | 16 / 35 | 4740 |
| 7 | 1 | 67.1 | 78.4 | 21 / 35 | 5482 |
| 8 | 1 | 64.1 | 69.5 | 17 / 35 | 5061 |
| 9 | 1 | 64.1 | 72.1 | 18 / 35 | 4617 |
| 10 | 1 | 62.8 | 66.3 | 15 / 35 | 4910 |
| 11 | 1 | 63.7 | 70.8 | 18 / 35 | 4555 |
| 12 | 1 | 66.7 | 80.0 | 20 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 70 | 90% |
| oog.melee.Corsair 1.0 | 65 | 75% |
| ahf.NanoAndrew .4 | 45 | 91% |
| sam.Samspin 1.0 | 14 | 100% |
| EBBU.Sim2 1.02 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 13 | 92% |
| zyx.nano.BacillusComma 1.0 | 10 | 90% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 218 of 420 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 54 | 25% | 95 |
| oog.melee.Corsair 1.0 | 37 | 17% | 89 |
| zyx.nano.BacillusComma 1.0 | 28 | 13% | 38 |
| ahf.NanoAndrew .4 | 25 | 11% | 82 |
| robar.nano.Assertive_Melee 0.2 | 23 | 11% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 22 | 10% | 26 |
| EBBU.Sim2 1.02 | 15 | 7% | 27 |
| sam.Samspin 1.0 | 11 | 5% | 23 |
| sample.TrackFire 1.0 | 3 | 1% | 7 |

## Melee bench: F06

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.6 | 311 / 420 | 2.11 | 19.6% | 63641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 19.6% | 311 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 37 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.6% | 26 |
| winamp32.micro.MicroMacro 1.0 | 4.9 | 9.3% | 13 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.7% | 5 |
| fm.claire 1.7 | 6.4 | 8.5% | 3 |
| sample.SpinBot 1.0 | 7.5 | 7.4% | 5 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 1 |
| pa.Improved 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 28 / 35 | 5467 |
| 2 | 1 | 69.9 | 91.7 | 27 / 35 | 5293 |
| 3 | 1 | 69.8 | 89.2 | 25 / 35 | 5367 |
| 4 | 1 | 69.5 | 87.6 | 25 / 35 | 5473 |
| 5 | 1 | 70.5 | 90.2 | 26 / 35 | 5785 |
| 6 | 1 | 67.6 | 82.2 | 23 / 35 | 5092 |
| 7 | 1 | 67.4 | 80.3 | 23 / 35 | 5013 |
| 8 | 1 | 70.0 | 87.9 | 27 / 35 | 5646 |
| 9 | 1 | 66.6 | 80.0 | 21 / 35 | 4926 |
| 10 | 1 | 69.8 | 89.8 | 30 / 35 | 5189 |
| 11 | 1 | 70.7 | 93.3 | 30 / 35 | 5317 |
| 12 | 1 | 69.5 | 89.2 | 26 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 146 | 96% |
| oog.melee.CapuletDroid 1.1 | 72 | 81% |
| arthord.NanoSatanMelee Beta | 37 | 92% |
| gh.nano.Grofvuil 0.2 | 33 | 88% |
| sample.SpinBot 1.0 | 18 | 100% |
| winamp32.micro.MicroMacro 1.0 | 14 | 86% |
| fm.claire 1.7 | 10 | 90% |
| pa.Improved 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 25 | 23% | 41 |
| d414.nano.Quantum 1.0.0 | 24 | 22% | 150 |
| gh.nano.Grofvuil 0.2 | 19 | 17% | 73 |
| arthord.NanoSatanMelee Beta | 12 | 11% | 43 |
| sample.SpinBot 1.0 | 11 | 10% | 21 |
| kurios.DOSexe .9b | 6 | 6% | 24 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 34 |
| fm.claire 1.7 | 4 | 4% | 14 |
| pa.Improved 1.0 | 3 | 3% | 15 |

## Melee bench: F07

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.7 | 191 / 420 | 2.64 | 18.2% | 68018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.2% | 191 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.1% | 91 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.0% | 37 |
| mz.MicroGodMelee 1 | 3.4 | 13.5% | 78 |
| DBall.Anarchy 0.1 | 5.1 | 8.7% | 15 |
| caimano.Furia_Ceca 0.22 | 5.9 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 1 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.9 | 19 / 35 | 5584 |
| 2 | 1 | 67.2 | 77.8 | 15 / 35 | 6113 |
| 3 | 1 | 65.1 | 71.7 | 15 / 35 | 5308 |
| 4 | 1 | 68.7 | 86.3 | 18 / 35 | 5384 |
| 5 | 1 | 68.4 | 84.4 | 15 / 35 | 5857 |
| 6 | 1 | 66.5 | 75.2 | 12 / 35 | 5915 |
| 7 | 1 | 68.9 | 87.0 | 19 / 35 | 5875 |
| 8 | 1 | 65.6 | 75.6 | 14 / 35 | 5224 |
| 9 | 1 | 68.8 | 83.2 | 19 / 35 | 5880 |
| 10 | 1 | 68.9 | 87.6 | 16 / 35 | 5405 |
| 11 | 1 | 69.0 | 85.1 | 17 / 35 | 5843 |
| 12 | 1 | 66.7 | 79.0 | 12 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 102 | 88% |
| mz.MicroGodMelee 1 | 100 | 49% |
| gh.micro.Gruweltje 0.7 | 62 | 27% |
| DBall.Anarchy 0.1 | 18 | 94% |
| caimano.Furia_Ceca 0.22 | 6 | 83% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| acogdev.alpha 0.2 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 229 of 420 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 91 | 40% | 152 |
| gh.micro.Gruweltje 0.7 | 66 | 29% | 97 |
| spinnercat.micro.Tyger 0.1 | 37 | 16% | 109 |
| acogdev.alpha 0.2 | 11 | 5% | 15 |
| DBall.Anarchy 0.1 | 6 | 3% | 17 |
| caimano.Furia_Ceca 0.22 | 6 | 3% | 10 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 9 |

## Melee bench: F08

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 75.1 | 239 / 420 | 3.25 | 17.4% | 65527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 17.4% | 239 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 15.1% | 72 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 62 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 11 |
| germ.TheMind .2 | 5.0 | 9.3% | 14 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.6 | 8.2% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.3% | 2 |
| sample.Crazy 1.0 | 8.6 | 6.6% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.4 | 20 / 35 | 5887 |
| 2 | 1 | 68.7 | 83.5 | 20 / 35 | 5952 |
| 3 | 1 | 66.0 | 73.7 | 20 / 35 | 5402 |
| 4 | 1 | 63.6 | 68.3 | 15 / 35 | 5122 |
| 5 | 2 | 62.3 | 62.5 | 15 / 35 | 4826 |
| 6 | 1 | 65.5 | 72.4 | 19 / 35 | 5141 |
| 7 | 1 | 65.0 | 69.8 | 19 / 35 | 5276 |
| 8 | 1 | 70.0 | 87.0 | 28 / 35 | 5751 |
| 9 | 1 | 65.7 | 74.3 | 17 / 35 | 5425 |
| 10 | 1 | 68.2 | 80.6 | 22 / 35 | 5603 |
| 11 | 1 | 67.2 | 74.9 | 21 / 35 | 5637 |
| 12 | 1 | 66.7 | 74.3 | 23 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 166 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 46 | 76% |
| qualidafial.MajorDick 1.0.1 | 24 | 92% |
| germ.TheMind .2 | 15 | 100% |
| awesomeness.Elite 1.0 | 11 | 64% |
| sample.Crazy 1.0 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 183 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 44% | 207 |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 21% | 79 |
| germ.TheMind .2 | 14 | 8% | 32 |
| awesomeness.Elite 1.0 | 14 | 8% | 25 |
| qualidafial.MajorDick 1.0.1 | 14 | 8% | 22 |
| lrem.micro.MoggFanatic 0.2 | 9 | 5% | 16 |
| stelo.UntouchableNano 1.3 | 8 | 4% | 15 |
| mym.EdgeStalker 1.0 | 4 | 2% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 14 |

## Melee bench: F09

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.2 | 319 / 420 | 1.97 | 20.1% | 59039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 20.1% | 319 |
| rz.HawkOnFire 0.1 | 2.3 | 13.2% | 26 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.6% | 19 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 14 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 4 |
| ratosh.Wesco 1.4 | 7.6 | 8.1% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 14 |
| spinnercat.Omen 1.0 | 8.1 | 7.9% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 28 / 35 | 4674 |
| 2 | 1 | 72.5 | 95.9 | 31 / 35 | 5015 |
| 3 | 1 | 68.5 | 80.6 | 22 / 35 | 4817 |
| 4 | 1 | 71.4 | 92.1 | 27 / 35 | 5176 |
| 5 | 1 | 72.4 | 97.1 | 31 / 35 | 5092 |
| 6 | 1 | 70.9 | 89.2 | 29 / 35 | 4956 |
| 7 | 1 | 67.7 | 81.9 | 23 / 35 | 4345 |
| 8 | 1 | 70.3 | 90.2 | 26 / 35 | 4956 |
| 9 | 1 | 70.4 | 89.5 | 25 / 35 | 5248 |
| 10 | 1 | 68.7 | 83.2 | 24 / 35 | 4798 |
| 11 | 1 | 71.8 | 93.7 | 27 / 35 | 5155 |
| 12 | 1 | 69.7 | 87.0 | 26 / 35 | 4807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 125 | 94% |
| nz.jdc.nano.GridFu 1.0 | 108 | 95% |
| stelo.PatternRobot 1.0 | 28 | 82% |
| timmit.nano.TimDog 0.33 | 21 | 86% |
| maribo.IotaCT 1.1 | 20 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 16 | 100% |
| spinnercat.Omen 1.0 | 15 | 100% |
| ratosh.Wesco 1.4 | 11 | 82% |

Hadur died in 101 of 420 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 22 | 22% | 55 |
| nz.jdc.nano.GridFu 1.0 | 19 | 19% | 123 |
| rz.HawkOnFire 0.1 | 15 | 15% | 101 |
| stelo.PatternRobot 1.0 | 15 | 15% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 13% | 26 |
| ratosh.Wesco 1.4 | 7 | 7% | 32 |
| maribo.IotaCT 1.1 | 6 | 6% | 34 |
| spinnercat.Omen 1.0 | 4 | 4% | 18 |

## Melee bench: F10

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.5 | 346 / 420 | 1.77 | 21.2% | 74174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 21.2% | 346 |
| tvv.nano.Polaris 1.2 | 2.6 | 11.7% | 22 |
| baal.nano.N 1.42 | 2.9 | 11.4% | 12 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 6 |
| zyx.micro.Ant 1.1 | 5.2 | 9.2% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6.6 | 8.4% | 4 |
| sanja.First 0.1 | 6.8 | 8.3% | 6 |
| cvt.Firsty 1.0 | 7.3 | 7.6% | 14 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.9% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 28 / 35 | 6402 |
| 2 | 1 | 71.9 | 92.4 | 30 / 35 | 6549 |
| 3 | 1 | 72.2 | 92.7 | 29 / 35 | 6958 |
| 4 | 1 | 71.4 | 93.3 | 29 / 35 | 6263 |
| 5 | 1 | 68.6 | 84.1 | 27 / 35 | 5514 |
| 6 | 1 | 69.7 | 87.6 | 27 / 35 | 5779 |
| 7 | 1 | 71.2 | 96.2 | 30 / 35 | 5642 |
| 8 | 1 | 72.3 | 97.5 | 30 / 35 | 6383 |
| 9 | 1 | 71.3 | 90.8 | 30 / 35 | 6264 |
| 10 | 1 | 70.8 | 90.5 | 27 / 35 | 6250 |
| 11 | 1 | 70.8 | 90.8 | 29 / 35 | 5963 |
| 12 | 1 | 71.1 | 90.5 | 30 / 35 | 6207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 65 | 91% |
| tvv.nano.Polaris 1.2 | 65 | 92% |
| baal.nano.N 1.42 | 63 | 95% |
| zyx.micro.Ant 1.1 | 59 | 92% |
| sanja.First 0.1 | 39 | 97% |
| amk.Punbot.Punbot 0.01 | 36 | 97% |
| Grystrion.TrackerWO 1.0 | 28 | 93% |
| squidM.TentalceMeleeNano 1.1 | 11 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 75 of 420 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 24% | 84 |
| tvv.nano.Polaris 1.2 | 10 | 13% | 104 |
| cvt.Firsty 1.0 | 10 | 13% | 55 |
| sample.RamFire 1.0 | 10 | 13% | 11 |
| Grystrion.TrackerWO 1.0 | 9 | 12% | 30 |
| baal.nano.N 1.42 | 7 | 9% | 62 |
| squidM.TentalceMeleeNano 1.1 | 6 | 8% | 14 |
| sanja.First 0.1 | 3 | 4% | 44 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 7 |

## Melee bench: F11

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 68.5 | 141 / 420 | 3.83 | 15.2% | 59661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.0% | 169 |
| hadur117.micro.SaorFX 0.1 | 1.8 | 15.2% | 141 |
| cs.Wren 1.0 | 3.1 | 12.5% | 28 |
| js.PinBall 1.6 | 4.1 | 11.3% | 38 |
| mz.Cork 0.1 | 4.9 | 10.7% | 19 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 7 |
| evd.X1 0.01 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 7 |
| donjezza.Jezza 1.0 | 9.1 | 5.5% | 11 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 63.8 | 8 / 35 | 5265 |
| 2 | 2 | 63.8 | 70.8 | 12 / 35 | 5090 |
| 3 | 1 | 65.2 | 76.5 | 13 / 35 | 5132 |
| 4 | 2 | 62.9 | 66.3 | 13 / 35 | 5079 |
| 5 | 1 | 66.3 | 77.8 | 17 / 35 | 5449 |
| 6 | 2 | 60.3 | 63.5 | 8 / 35 | 4753 |
| 7 | 2 | 61.2 | 66.3 | 9 / 35 | 4660 |
| 8 | 2 | 60.6 | 63.5 | 7 / 35 | 4783 |
| 9 | 1 | 66.2 | 78.4 | 16 / 35 | 5225 |
| 10 | 2 | 61.8 | 65.1 | 12 / 35 | 4759 |
| 11 | 2 | 61.6 | 65.4 | 12 / 35 | 4749 |
| 12 | 2 | 62.1 | 65.1 | 14 / 35 | 4717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 153 | 42% |
| cs.Wren 1.0 | 36 | 94% |
| mz.Cork 0.1 | 15 | 87% |
| js.PinBall 1.6 | 14 | 64% |
| donjezza.Jezza 1.0 | 8 | 75% |
| joe.ADinosaur 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 280 of 420 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 149 | 53% | 217 |
| joe.ADinosaur 1.0 | 36 | 13% | 43 |
| evd.X1 0.01 | 23 | 8% | 27 |
| mz.Cork 0.1 | 22 | 8% | 34 |
| js.PinBall 1.6 | 20 | 7% | 32 |
| cs.Wren 1.0 | 16 | 6% | 38 |
| PSW.Relentless 0.1 | 9 | 3% | 12 |
| donjezza.Jezza 1.0 | 3 | 1% | 6 |
| jsal.Jsalbot 1.0 | 2 | 1% | 8 |

## Melee bench: F12

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.3 | 254 / 420 | 2.68 | 18.3% | 56827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.3% | 254 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 51 |
| ntc.Opposite 1.5 | 3.1 | 11.4% | 20 |
| stelo.AreaTargetingBot 1.1 | 3.6 | 10.6% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 10.1% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 16 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 12 |
| disan.Chair 2.2.0 | 7.4 | 8.3% | 9 |
| donjezza.Muncho 1.0 | 9.4 | 6.2% | 14 |
| pbg.R2D2 1.0 | 9.6 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.7 | 18 / 35 | 4802 |
| 2 | 1 | 67.5 | 84.4 | 21 / 35 | 4610 |
| 3 | 1 | 66.3 | 79.0 | 19 / 35 | 4586 |
| 4 | 1 | 63.4 | 70.2 | 16 / 35 | 4268 |
| 5 | 1 | 65.2 | 75.9 | 20 / 35 | 4362 |
| 6 | 1 | 69.3 | 90.2 | 27 / 35 | 4730 |
| 7 | 1 | 69.7 | 87.9 | 25 / 35 | 5191 |
| 8 | 1 | 66.1 | 78.4 | 17 / 35 | 4672 |
| 9 | 1 | 70.1 | 89.5 | 23 / 35 | 5248 |
| 10 | 1 | 68.0 | 82.5 | 25 / 35 | 4794 |
| 11 | 1 | 67.5 | 80.3 | 22 / 35 | 4968 |
| 12 | 1 | 66.3 | 78.1 | 21 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 69 | 88% |
| myl.nano.Graviton 1.10 | 56 | 86% |
| ntc.Opposite 1.5 | 35 | 80% |
| disan.Chair 2.2.0 | 31 | 94% |
| DBall.NUKE 0.1 | 31 | 94% |
| donjezza.Muncho 1.0 | 27 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 95% |
| pfvicm.Sobieski 7.2.3b | 19 | 79% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 172 of 420 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 41 | 24% | 53 |
| ntc.Opposite 1.5 | 32 | 19% | 55 |
| stelo.AreaTargetingBot 1.1 | 29 | 17% | 81 |
| myl.nano.Graviton 1.10 | 27 | 16% | 77 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 12% | 55 |
| disan.Chair 2.2.0 | 13 | 8% | 32 |
| DBall.NUKE 0.1 | 3 | 2% | 36 |
| donjezza.Muncho 1.0 | 3 | 2% | 23 |
| pbg.R2D2 1.0 | 3 | 2% | 5 |

## Melee bench: F13

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.2 | 166 / 420 | 3.68 | 15.3% | 51249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.3 | 15.3% | 166 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 101 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.7% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.9 | 12.3% | 38 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 20 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 31 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 20 / 35 | 4403 |
| 2 | 2 | 63.0 | 69.5 | 12 / 35 | 3974 |
| 3 | 2 | 62.1 | 64.4 | 13 / 35 | 3980 |
| 4 | 1 | 64.4 | 73.0 | 13 / 35 | 4395 |
| 5 | 1 | 63.4 | 69.2 | 14 / 35 | 4482 |
| 6 | 1 | 64.8 | 71.4 | 15 / 35 | 4645 |
| 7 | 1 | 65.9 | 78.7 | 15 / 35 | 4184 |
| 8 | 1 | 62.4 | 66.0 | 15 / 35 | 4176 |
| 9 | 3 | 60.7 | 62.5 | 8 / 35 | 3951 |
| 10 | 1 | 63.3 | 69.2 | 14 / 35 | 4121 |
| 11 | 1 | 64.0 | 68.9 | 14 / 35 | 4820 |
| 12 | 1 | 62.9 | 67.6 | 13 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 70 | 53% |
| kawigi.micro.Shiz 1.1 | 56 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 83% |
| yagami.Tidus 0.11 | 31 | 97% |
| ejb.Polaris 1.0.1 | 16 | 81% |
| step.nanoPri 1.0 | 3 | 100% |

Hadur died in 254 of 420 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 110 | 43% | 156 |
| yagami.Tidus 0.11 | 32 | 13% | 56 |
| kawigi.micro.Shiz 1.1 | 30 | 12% | 58 |
| ejb.Polaris 1.0.1 | 22 | 9% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 8% | 55 |
| stelo.MirrorNano 1.3 | 14 | 6% | 16 |
| kurios.DOSexe .9a | 13 | 5% | 16 |
| step.nanoPri 1.0 | 12 | 5% | 15 |

## Melee bench: F14

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.6 | 257 / 420 | 3.02 | 17.2% | 53087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 17.2% | 257 |
| wee.Gem 1.8.4 | 2.7 | 12.2% | 58 |
| bzdp.Pansy 2.1 | 3.3 | 11.7% | 29 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 30 |
| ratosh.Nobo 0.21 | 4.4 | 11.1% | 16 |
| m3thos.Eva00 1.1 | 6.1 | 9.6% | 14 |
| bayen.UbaMicro 1.4 | 6.8 | 9.1% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 4 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 27 / 35 | 4459 |
| 2 | 1 | 68.3 | 84.4 | 24 / 35 | 4901 |
| 3 | 1 | 68.2 | 87.6 | 23 / 35 | 4776 |
| 4 | 1 | 65.6 | 79.0 | 21 / 35 | 4150 |
| 5 | 1 | 64.4 | 70.5 | 20 / 35 | 4577 |
| 6 | 1 | 66.7 | 79.0 | 22 / 35 | 4699 |
| 7 | 1 | 64.3 | 71.7 | 19 / 35 | 4588 |
| 8 | 1 | 64.0 | 70.8 | 22 / 35 | 4126 |
| 9 | 1 | 66.2 | 78.7 | 23 / 35 | 4296 |
| 10 | 1 | 61.1 | 67.3 | 15 / 35 | 3616 |
| 11 | 1 | 65.1 | 75.2 | 21 / 35 | 4344 |
| 12 | 1 | 66.1 | 80.0 | 20 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 91 | 90% |
| wee.Gem 1.8.4 | 87 | 90% |
| wompi.Quokka 1.6 | 36 | 89% |
| ratosh.Nobo 0.21 | 29 | 97% |
| bayen.UbaMicro 1.4 | 21 | 86% |
| m3thos.Eva00 1.1 | 14 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 164 of 420 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 29 | 18% | 99 |
| bzdp.Pansy 2.1 | 24 | 15% | 104 |
| maribo.FollowFire 1 | 18 | 11% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 18 | 11% | 22 |
| stelo.MyAgileRobot 0.2 | 18 | 11% | 21 |
| ratosh.Nobo 0.21 | 15 | 9% | 40 |
| wompi.Quokka 1.6 | 15 | 9% | 39 |
| bayen.UbaMicro 1.4 | 14 | 9% | 33 |
| m3thos.Eva00 1.1 | 13 | 8% | 32 |

## Melee bench: F15

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.8 | 132 / 420 | 2.55 | 19.2% | 87714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.8% | 258 |
| hadur117.micro.SaorFX 0.1 | 1.7 | 19.2% | 132 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 20 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 5 |
| ayk.WallHugger 1.0 | 5.0 | 9.2% | 4 |
| stuff.Vlad 0.1 | 5.5 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.1 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 90.8 | 16 / 35 | 7806 |
| 2 | 2 | 66.3 | 73.0 | 8 / 35 | 6072 |
| 3 | 2 | 70.0 | 84.4 | 10 / 35 | 7377 |
| 4 | 2 | 70.2 | 84.4 | 6 / 35 | 7606 |
| 5 | 2 | 70.7 | 83.5 | 13 / 35 | 7515 |
| 6 | 1 | 71.4 | 86.7 | 13 / 35 | 7481 |
| 7 | 2 | 68.4 | 77.1 | 8 / 35 | 7155 |
| 8 | 2 | 69.0 | 78.7 | 8 / 35 | 6756 |
| 9 | 2 | 71.1 | 85.4 | 13 / 35 | 7599 |
| 10 | 1 | 72.1 | 89.2 | 16 / 35 | 7721 |
| 11 | 2 | 68.5 | 74.0 | 10 / 35 | 7214 |
| 12 | 1 | 71.1 | 86.7 | 11 / 35 | 7412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 231 | 26% |
| mz.NanoGod 2.02 | 35 | 83% |
| exauge.GateKeeper 1.1.121g | 16 | 100% |
| ayk.WallHugger 1.0 | 11 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 290 of 420 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 221 | 76% | 287 |
| mz.NanoGod 2.02 | 41 | 14% | 75 |
| exauge.GateKeeper 1.1.121g | 10 | 3% | 21 |
| ayk.WallHugger 1.0 | 7 | 2% | 17 |
| stuff.Vlad 0.1 | 7 | 2% | 10 |
| stelo.PianistNano 1.2 | 4 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.8 | 232 / 420 | 3.36 | 17.0% | 59092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 17.0% | 232 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 38 |
| dummy.micro.Sparrow 2.5 | 3.0 | 11.9% | 40 |
| bvh.micro.Freya 0.3 | 3.7 | 11.3% | 37 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.4 | 9.9% | 28 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 12 |
| conscience.Electron 1.3g | 6.9 | 8.4% | 6 |
| ap.Frederick 1.1 | 8.1 | 7.0% | 21 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 66.0 | 20 / 35 | 4458 |
| 2 | 1 | 62.9 | 67.6 | 18 / 35 | 4388 |
| 3 | 1 | 65.9 | 74.9 | 16 / 35 | 5389 |
| 4 | 1 | 63.0 | 64.8 | 16 / 35 | 4713 |
| 5 | 1 | 65.9 | 73.3 | 18 / 35 | 5382 |
| 6 | 1 | 64.0 | 69.5 | 18 / 35 | 4864 |
| 7 | 1 | 66.7 | 77.5 | 21 / 35 | 4898 |
| 8 | 1 | 66.0 | 75.2 | 19 / 35 | 5236 |
| 9 | 1 | 68.8 | 87.0 | 26 / 35 | 4941 |
| 10 | 1 | 66.0 | 74.9 | 20 / 35 | 5201 |
| 11 | 1 | 65.5 | 76.5 | 20 / 35 | 4648 |
| 12 | 1 | 66.8 | 77.8 | 20 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 68 | 93% |
| dummy.micro.Sparrow 2.5 | 62 | 92% |
| bvh.micro.Freya 0.3 | 52 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 34 | 97% |
| ap.Frederick 1.1 | 18 | 89% |
| stelo.MirrorMicro 1.0 | 13 | 85% |
| conscience.Electron 1.3g | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 189 of 420 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 32 | 17% | 35 |
| conscience.Electron 1.3g | 31 | 16% | 39 |
| voidious.micro.BlitzBat 1.05 | 28 | 15% | 69 |
| dummy.micro.Sparrow 2.5 | 27 | 14% | 99 |
| bvh.micro.Freya 0.3 | 26 | 14% | 51 |
| dl.BetterWalls 1.0 | 17 | 9% | 31 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 8% | 65 |
| stelo.MirrorMicro 1.0 | 10 | 5% | 29 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 88.5 | 311 / 420 | 2.03 | 21.4% | 83713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 21.4% | 311 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 40 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 19 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 20 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 10 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.9 | 6.4% | 6 |
| sample.MyFirstRobot 1.0 | 9.1 | 5.6% | 7 |
| sample.Corners 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.6 | 24 / 35 | 7270 |
| 2 | 1 | 73.4 | 94.0 | 30 / 35 | 7391 |
| 3 | 1 | 70.5 | 84.8 | 26 / 35 | 6843 |
| 4 | 1 | 73.3 | 93.0 | 28 / 35 | 7452 |
| 5 | 1 | 69.6 | 80.6 | 24 / 35 | 6769 |
| 6 | 1 | 71.6 | 88.6 | 27 / 35 | 7050 |
| 7 | 1 | 72.6 | 91.7 | 24 / 35 | 7389 |
| 8 | 1 | 70.3 | 86.7 | 22 / 35 | 6644 |
| 9 | 1 | 71.5 | 90.5 | 27 / 35 | 6579 |
| 10 | 1 | 72.0 | 90.8 | 27 / 35 | 6493 |
| 11 | 1 | 72.3 | 92.4 | 28 / 35 | 7041 |
| 12 | 1 | 70.2 | 81.0 | 24 / 35 | 6792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 111 | 87% |
| sul.Lunar 1.1 | 85 | 96% |
| supersample.SuperBoxBot 1.0 | 60 | 87% |
| dsw.StaticD 1.0 | 32 | 75% |
| mme.NikeEnhanced 2.0 | 15 | 93% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 12 | 83% |
| sample.Corners 1.0 | 11 | 100% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |

Hadur died in 111 of 420 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 39 | 35% | 127 |
| supersample.SuperBoxBot 1.0 | 29 | 26% | 77 |
| dsw.StaticD 1.0 | 16 | 14% | 52 |
| sul.Lunar 1.1 | 10 | 9% | 95 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 17 |
| mme.NikeEnhanced 2.0 | 4 | 4% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 4% | 12 |
| sample.Corners 1.0 | 3 | 3% | 13 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 10 |

## Melee bench: F18

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 81.9 | 244 / 420 | 2.63 | 18.9% | 75959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.9% | 244 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 56 |
| mld.Wisdom 1.0 | 3.4 | 12.3% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.1 | 11.1% | 29 |
| KiraNL.Chupacabra 0.4 | 4.9 | 10.2% | 19 |
| amz.NanoClone 1.41 | 5.3 | 9.8% | 16 |
| sample.Walls 1.0 | 7.2 | 7.8% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 7 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.8 | 23 / 35 | 6121 |
| 2 | 1 | 67.7 | 80.0 | 18 / 35 | 6308 |
| 3 | 1 | 67.5 | 80.3 | 17 / 35 | 6084 |
| 4 | 1 | 70.6 | 89.2 | 23 / 35 | 6773 |
| 5 | 1 | 68.4 | 79.7 | 20 / 35 | 6717 |
| 6 | 1 | 66.9 | 76.8 | 19 / 35 | 6015 |
| 7 | 1 | 69.1 | 83.2 | 21 / 35 | 6621 |
| 8 | 1 | 69.2 | 83.2 | 20 / 35 | 6415 |
| 9 | 1 | 70.2 | 86.3 | 23 / 35 | 6760 |
| 10 | 1 | 69.0 | 83.2 | 23 / 35 | 6058 |
| 11 | 1 | 68.1 | 80.3 | 19 / 35 | 6061 |
| 12 | 1 | 67.1 | 76.5 | 18 / 35 | 6026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 93 | 95% |
| radnor.DoctorBob 1.42 | 69 | 80% |
| mld.Wisdom 1.0 | 37 | 68% |
| KiraNL.Chupacabra 0.4 | 31 | 68% |
| amz.NanoClone 1.41 | 28 | 79% |
| sample.Walls 1.0 | 13 | 100% |
| jangs.ns51 1.0 | 10 | 80% |
| sample.Target 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |

Hadur died in 178 of 420 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 51 | 29% | 82 |
| radnor.DoctorBob 1.42 | 30 | 17% | 99 |
| KiraNL.Chupacabra 0.4 | 30 | 17% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 15% | 110 |
| amz.NanoClone 1.41 | 20 | 11% | 32 |
| sample.Walls 1.0 | 11 | 6% | 23 |
| jangs.ns51 1.0 | 7 | 4% | 16 |
| GarmBox.Oranges 1.0 | 2 | 1% | 4 |

