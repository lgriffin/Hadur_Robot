# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 82.7 | 225 / 420 | 2.56 | 19.3% | 76708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 19.3% | 225 |
| radnor.DoctorBob 1.42 | 2.4 | 15.4% | 84 |
| mz.AntiGrav 1.0 | 3.3 | 13.9% | 37 |
| mld.Infinity 2.2 | 3.3 | 13.6% | 62 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 6 |
| sample.Walls 1.0 | 6.3 | 7.3% | 1 |
| GarmBox.Oranges 1.0 | 6.9 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.9 | 5.6% | 4 |
| arthord.MannyPacquiao Beta | 9.1 | 4.1% | 1 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 77.8 | 19 / 35 | 6492 |
| 2 | 1 | 68.1 | 76.8 | 18 / 35 | 5805 |
| 3 | 1 | 69.4 | 80.3 | 15 / 35 | 6353 |
| 4 | 1 | 70.5 | 86.0 | 22 / 35 | 6186 |
| 5 | 1 | 72.2 | 88.3 | 23 / 35 | 7446 |
| 6 | 1 | 68.8 | 79.0 | 15 / 35 | 6060 |
| 7 | 1 | 69.7 | 84.1 | 19 / 35 | 6010 |
| 8 | 1 | 71.3 | 88.6 | 23 / 35 | 6751 |
| 9 | 1 | 70.7 | 87.9 | 19 / 35 | 6228 |
| 10 | 1 | 71.9 | 87.6 | 20 / 35 | 6945 |
| 11 | 1 | 69.6 | 80.6 | 19 / 35 | 6779 |
| 12 | 1 | 66.6 | 75.2 | 13 / 35 | 5653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 94 | 97% |
| mld.Infinity 2.2 | 80 | 86% |
| radnor.DoctorBob 1.42 | 73 | 51% |
| amz.NanoClone 1.41 | 13 | 92% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 195 of 420 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 114 | 58% | 194 |
| mld.Infinity 2.2 | 27 | 14% | 43 |
| mz.AntiGrav 1.0 | 21 | 11% | 100 |
| amz.NanoClone 1.41 | 16 | 8% | 30 |
| sample.Walls 1.0 | 7 | 4% | 27 |
| GarmBox.Oranges 1.0 | 4 | 2% | 10 |
| arthord.MannyPacquiao Beta | 3 | 2% | 9 |
| jangs.ns51 1.0 | 3 | 2% | 6 |

## Melee bench: F02

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.9 | 199 / 420 | 2.72 | 17.5% | 60538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.2 | 17.5% | 199 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.6% | 108 |
| mld.DustBunny 3.8 | 2.9 | 13.8% | 57 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.9% | 13 |
| zyx.nano.Ant 1.1 | 6.1 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.6% | 21 |
| bzdp.BoxCar 2.0 | 7.7 | 7.6% | 3 |
| fullsail.SweetTea 1.1 | 8.1 | 6.9% | 7 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 18 / 35 | 5378 |
| 2 | 1 | 66.5 | 80.0 | 13 / 35 | 5186 |
| 3 | 1 | 66.6 | 81.3 | 15 / 35 | 5181 |
| 4 | 1 | 66.1 | 78.4 | 14 / 35 | 5169 |
| 5 | 1 | 68.6 | 89.5 | 22 / 35 | 5040 |
| 6 | 1 | 68.9 | 89.8 | 21 / 35 | 5630 |
| 7 | 1 | 67.2 | 84.4 | 17 / 35 | 5291 |
| 8 | 1 | 68.2 | 85.4 | 20 / 35 | 5053 |
| 9 | 3 | 55.5 | 45.4 | 6 / 35 | 4067 |
| 10 | 1 | 64.9 | 78.7 | 15 / 35 | 4365 |
| 11 | 1 | 68.4 | 88.6 | 19 / 35 | 5340 |
| 12 | 1 | 67.5 | 83.2 | 19 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 132 | 70% |
| mld.DustBunny 3.8 | 95 | 57% |
| djdjdj.NanoSkunk10 1.0 | 20 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 44% |
| maribo.melee.BMV 0.1 | 17 | 53% |
| fullsail.SweetTea 1.1 | 11 | 64% |
| zyx.nano.Ant 1.1 | 7 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 223 of 420 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 62 | 28% | 108 |
| oog.melee.Mercutio 1.0 | 59 | 26% | 146 |
| maribo.melee.BMV 0.1 | 26 | 12% | 35 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 8% | 25 |
| fullsail.SweetTea 1.1 | 16 | 7% | 30 |
| cs.Grudge 1.0 | 14 | 6% | 14 |
| zyx.nano.Ant 1.1 | 13 | 6% | 21 |
| djdjdj.NanoSkunk10 1.0 | 9 | 4% | 31 |
| bzdp.BoxCar 2.0 | 7 | 3% | 10 |

## Melee bench: F03

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.6 | 199 / 420 | 2.47 | 18.9% | 68133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 18.9% | 199 |
| myl.micro.Troodon 1.10 | 2.1 | 14.2% | 73 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.4% | 84 |
| fm.mammillarias 1.3 | 5.4 | 9.3% | 8 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.4% | 24 |
| cs.sheldor.Talon 1.1 | 7.1 | 8.1% | 2 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 11 |
| sample.Fire 1.0 | 9.1 | 5.4% | 10 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.2 | 10 / 35 | 5260 |
| 2 | 1 | 69.9 | 87.6 | 20 / 35 | 5917 |
| 3 | 1 | 69.2 | 86.0 | 19 / 35 | 5454 |
| 4 | 1 | 67.4 | 80.6 | 15 / 35 | 5545 |
| 5 | 1 | 69.8 | 84.1 | 16 / 35 | 6369 |
| 6 | 1 | 67.7 | 81.0 | 19 / 35 | 5240 |
| 7 | 1 | 68.7 | 82.5 | 21 / 35 | 5570 |
| 8 | 1 | 68.8 | 87.0 | 19 / 35 | 5356 |
| 9 | 1 | 69.5 | 85.7 | 18 / 35 | 6032 |
| 10 | 1 | 69.1 | 86.3 | 13 / 35 | 6303 |
| 11 | 1 | 68.0 | 84.4 | 12 / 35 | 5601 |
| 12 | 1 | 68.1 | 81.9 | 17 / 35 | 5486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 87 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 73 | 19% |
| cb.nano.Insomnia 1.0 | 57 | 81% |
| myl.nano.KomoriNinja 1.1 | 35 | 91% |
| sp.Nanos.Ember 1.1 | 21 | 90% |
| fm.mammillarias 1.3 | 14 | 79% |
| sample.Fire 1.0 | 8 | 25% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 222 of 420 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 86 | 39% | 99 |
| myl.micro.Troodon 1.10 | 41 | 18% | 120 |
| cb.nano.Insomnia 1.0 | 24 | 11% | 24 |
| fm.mammillarias 1.3 | 22 | 10% | 39 |
| myl.nano.KomoriNinja 1.1 | 20 | 9% | 70 |
| sp.Nanos.Ember 1.1 | 10 | 5% | 29 |
| sample.Fire 1.0 | 9 | 4% | 15 |
| cs.sheldor.Talon 1.1 | 8 | 4% | 20 |
| sample.Tracker 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.6 | 161 / 420 | 2.65 | 18.5% | 73813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 18.5% | 161 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.6% | 77 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 54 |
| stelo.SoJNanoMelee 1.1 | 4.9 | 9.9% | 79 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 3 |
| tj.zombie1n 1.0.1 | 5.9 | 8.9% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.4% | 20 |
| yk.JahMicro 1.0 | 7.7 | 7.8% | 7 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 77.5 | 13 / 35 | 5741 |
| 2 | 1 | 65.8 | 75.6 | 9 / 35 | 6067 |
| 3 | 1 | 69.4 | 87.3 | 15 / 35 | 6389 |
| 4 | 1 | 69.7 | 85.7 | 16 / 35 | 6639 |
| 5 | 1 | 65.3 | 74.3 | 9 / 35 | 5698 |
| 6 | 1 | 66.5 | 77.8 | 13 / 35 | 5743 |
| 7 | 1 | 68.4 | 86.3 | 13 / 35 | 6115 |
| 8 | 1 | 68.6 | 81.3 | 17 / 35 | 6271 |
| 9 | 1 | 66.6 | 77.8 | 12 / 35 | 5797 |
| 10 | 1 | 69.7 | 86.3 | 17 / 35 | 6756 |
| 11 | 1 | 67.8 | 85.1 | 9 / 35 | 6186 |
| 12 | 1 | 69.2 | 84.4 | 18 / 35 | 6411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 112 | 49% |
| stelo.SoJNanoMelee 1.1 | 74 | 28% |
| tvv.micro.Antares 1.1.1 | 33 | 58% |
| tj.zombie1n 1.0.1 | 27 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 24 | 42% |
| yk.JahMicro 1.0 | 12 | 92% |
| repositorio.NanoStep 1.0 | 12 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 89% |
| sample.VelociRobot 1.0 | 5 | 60% |

Hadur died in 261 of 420 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 78 | 30% | 137 |
| stelo.SoJNanoMelee 1.1 | 75 | 29% | 88 |
| tvv.micro.Antares 1.1.1 | 44 | 17% | 74 |
| ers.nano.hawk.HawkLA 3.0m | 21 | 8% | 37 |
| tj.zombie1n 1.0.1 | 17 | 7% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 12 | 5% | 17 |
| yk.JahMicro 1.0 | 7 | 3% | 15 |
| repositorio.NanoStep 1.0 | 4 | 2% | 15 |
| sample.VelociRobot 1.0 | 3 | 1% | 7 |

## Melee bench: F05

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 66.9 | 139 / 420 | 3.98 | 14.8% | 53716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.2 | 14.8% | 139 |
| oog.melee.Corsair 1.0 | 2.0 | 13.5% | 98 |
| ahf.NanoAndrew .4 | 3.0 | 12.1% | 74 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 10.7% | 37 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 18 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 22 |
| robar.nano.Assertive_Melee 0.2 | 6.9 | 9.1% | 14 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 6.8% | 1 |
| sample.TrackFire 1.0 | 9.9 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 68.9 | 13 / 35 | 4178 |
| 2 | 1 | 62.7 | 67.6 | 13 / 35 | 4513 |
| 3 | 1 | 62.0 | 67.6 | 11 / 35 | 4460 |
| 4 | 2 | 58.9 | 60.3 | 9 / 35 | 4070 |
| 5 | 1 | 62.9 | 70.2 | 12 / 35 | 4879 |
| 6 | 1 | 61.7 | 64.1 | 12 / 35 | 4695 |
| 7 | 1 | 60.4 | 62.9 | 7 / 35 | 4452 |
| 8 | 1 | 62.8 | 69.8 | 12 / 35 | 4872 |
| 9 | 1 | 65.4 | 78.1 | 17 / 35 | 4817 |
| 10 | 1 | 62.6 | 69.5 | 13 / 35 | 4331 |
| 11 | 2 | 59.2 | 62.9 | 9 / 35 | 3931 |
| 12 | 1 | 60.6 | 61.3 | 11 / 35 | 4518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 71 | 44% |
| simonton.nano.MeleeSeed 1.8 | 59 | 85% |
| ahf.NanoAndrew .4 | 38 | 53% |
| sam.Samspin 1.0 | 16 | 88% |
| EBBU.Sim2 1.02 | 13 | 62% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 282 of 420 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 59 | 21% | 102 |
| ahf.NanoAndrew .4 | 51 | 18% | 78 |
| simonton.nano.MeleeSeed 1.8 | 43 | 15% | 79 |
| robar.nano.Assertive_Melee 0.2 | 32 | 11% | 41 |
| zyx.nano.BacillusComma 1.0 | 26 | 9% | 30 |
| EBBU.Sim2 1.02 | 24 | 9% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 22 | 8% | 22 |
| sam.Samspin 1.0 | 14 | 5% | 19 |
| sample.TrackFire 1.0 | 10 | 4% | 12 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.4 | 182 / 420 | 2.67 | 17.6% | 60642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 17.6% | 182 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 101 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.5% | 41 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 9.9% | 50 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 8.8% | 20 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 13 |
| fm.claire 1.7 | 6.8 | 8.4% | 2 |
| sample.SpinBot 1.0 | 7.7 | 7.4% | 10 |
| pa.Improved 1.0 | 9.2 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.6 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 13 / 35 | 5064 |
| 2 | 1 | 67.6 | 87.3 | 14 / 35 | 5194 |
| 3 | 1 | 65.2 | 77.8 | 13 / 35 | 4881 |
| 4 | 1 | 66.5 | 82.5 | 12 / 35 | 5110 |
| 5 | 1 | 69.8 | 89.5 | 21 / 35 | 5808 |
| 6 | 1 | 66.6 | 77.8 | 16 / 35 | 5265 |
| 7 | 1 | 63.4 | 74.6 | 13 / 35 | 4376 |
| 8 | 1 | 66.5 | 79.4 | 15 / 35 | 5136 |
| 9 | 1 | 66.9 | 84.4 | 17 / 35 | 5013 |
| 10 | 1 | 67.5 | 83.2 | 18 / 35 | 5161 |
| 11 | 1 | 65.6 | 80.0 | 16 / 35 | 4771 |
| 12 | 1 | 65.2 | 77.1 | 14 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 112 | 43% |
| oog.melee.CapuletDroid 1.1 | 73 | 67% |
| gh.nano.Grofvuil 0.2 | 48 | 71% |
| arthord.NanoSatanMelee Beta | 17 | 76% |
| winamp32.micro.MicroMacro 1.0 | 15 | 60% |
| fm.claire 1.7 | 12 | 92% |
| sample.SpinBot 1.0 | 10 | 90% |
| pa.Improved 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 75% |

Hadur died in 240 of 420 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 89 | 37% | 142 |
| gh.nano.Grofvuil 0.2 | 54 | 23% | 98 |
| oog.melee.CapuletDroid 1.1 | 32 | 13% | 51 |
| winamp32.micro.MicroMacro 1.0 | 16 | 7% | 35 |
| fm.claire 1.7 | 15 | 6% | 21 |
| arthord.NanoSatanMelee Beta | 13 | 5% | 27 |
| kurios.DOSexe .9b | 8 | 3% | 18 |
| sample.SpinBot 1.0 | 6 | 3% | 15 |
| pa.Improved 1.0 | 5 | 2% | 12 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 75.5 | 100 / 420 | 3.21 | 16.1% | 61857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.6 | 16.1% | 100 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 105 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.4% | 104 |
| mz.MicroGodMelee 1 | 3.6 | 13.2% | 84 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 11 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 4 |
| el.JumpShoot 0.2 | 7.7 | 6.6% | 5 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 4 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 4 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 80.3 | 12 / 35 | 4835 |
| 2 | 1 | 68.3 | 84.8 | 15 / 35 | 5636 |
| 3 | 1 | 65.5 | 77.1 | 8 / 35 | 5542 |
| 4 | 2 | 61.9 | 67.6 | 5 / 35 | 5165 |
| 5 | 4 | 61.2 | 68.6 | 2 / 35 | 4500 |
| 6 | 1 | 64.9 | 77.8 | 12 / 35 | 4568 |
| 7 | 1 | 66.8 | 85.1 | 12 / 35 | 4896 |
| 8 | 2 | 64.5 | 76.5 | 6 / 35 | 5118 |
| 9 | 1 | 62.9 | 67.0 | 9 / 35 | 5335 |
| 10 | 2 | 62.9 | 68.6 | 6 / 35 | 4925 |
| 11 | 1 | 65.8 | 76.8 | 9 / 35 | 5709 |
| 12 | 2 | 64.9 | 75.6 | 4 / 35 | 5628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 91 | 35% |
| gh.micro.Gruweltje 0.7 | 64 | 30% |
| mz.MicroGodMelee 1 | 63 | 29% |
| DBall.Anarchy 0.1 | 19 | 95% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| el.JumpShoot 0.2 | 5 | 60% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 320 of 420 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 93 | 29% | 117 |
| mz.MicroGodMelee 1 | 82 | 26% | 103 |
| spinnercat.micro.Tyger 0.1 | 80 | 25% | 106 |
| acogdev.alpha 0.2 | 20 | 6% | 22 |
| fire219.CatBot 1.0 | 14 | 4% | 14 |
| caimano.Furia_Ceca 0.22 | 13 | 4% | 17 |
| el.JumpShoot 0.2 | 10 | 3% | 10 |
| DBall.Anarchy 0.1 | 6 | 2% | 19 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 11 |

## Melee bench: F08

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 63.5 | 153 / 420 | 4.28 | 14.7% | 57182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.7% | 99 |
| hadur117.micro.SaorL 0.1 | 1.9 | 14.7% | 153 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.0% | 72 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 19 |
| germ.TheMind .2 | 5.5 | 9.5% | 22 |
| awesomeness.Elite 1.0 | 6.2 | 9.1% | 24 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.8% | 11 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.9% | 13 |
| sample.Crazy 1.0 | 8.4 | 7.3% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 74.0 | 14 / 35 | 5245 |
| 2 | 1 | 64.2 | 69.2 | 14 / 35 | 5066 |
| 3 | 3 | 61.5 | 62.2 | 12 / 35 | 4899 |
| 4 | 3 | 61.0 | 64.8 | 12 / 35 | 4291 |
| 5 | 3 | 60.3 | 59.4 | 14 / 35 | 4605 |
| 6 | 3 | 59.8 | 60.6 | 14 / 35 | 4210 |
| 7 | 1 | 61.5 | 63.2 | 14 / 35 | 4737 |
| 8 | 1 | 62.5 | 66.0 | 11 / 35 | 5193 |
| 9 | 3 | 58.4 | 58.4 | 10 / 35 | 4122 |
| 10 | 2 | 60.4 | 58.4 | 9 / 35 | 4609 |
| 11 | 1 | 61.7 | 61.6 | 13 / 35 | 5216 |
| 12 | 1 | 63.0 | 64.4 | 16 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 121 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 36 | 83% |
| qualidafial.MajorDick 1.0.1 | 13 | 77% |
| germ.TheMind .2 | 9 | 78% |
| awesomeness.Elite 1.0 | 8 | 75% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| sample.Crazy 1.0 | 5 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 269 of 420 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 115 | 43% | 189 |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 15% | 63 |
| awesomeness.Elite 1.0 | 38 | 14% | 45 |
| germ.TheMind .2 | 24 | 9% | 39 |
| stelo.UntouchableNano 1.3 | 21 | 8% | 28 |
| qualidafial.MajorDick 1.0.1 | 15 | 6% | 23 |
| lrem.micro.MoggFanatic 0.2 | 13 | 5% | 21 |
| sample.Crazy 1.0 | 2 | 1% | 8 |
| mym.EdgeStalker 1.0 | 1 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.8 | 257 / 420 | 2.28 | 19.0% | 57478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 19.0% | 257 |
| rz.HawkOnFire 0.1 | 2.2 | 13.8% | 42 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.3% | 32 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 22 |
| timmit.nano.TimDog 0.33 | 5.1 | 9.9% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.2% | 3 |
| ratosh.Wesco 1.4 | 7.4 | 8.3% | 5 |
| stelo.PatternRobot 1.0 | 7.7 | 8.0% | 24 |
| spinnercat.Omen 1.0 | 8.1 | 7.8% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.0 | 24 / 35 | 4691 |
| 2 | 1 | 69.9 | 87.6 | 23 / 35 | 4840 |
| 3 | 1 | 67.0 | 76.2 | 18 / 35 | 4981 |
| 4 | 1 | 71.2 | 92.1 | 23 / 35 | 5290 |
| 5 | 1 | 69.1 | 87.6 | 21 / 35 | 4570 |
| 6 | 1 | 68.3 | 84.1 | 24 / 35 | 4167 |
| 7 | 1 | 70.2 | 89.5 | 19 / 35 | 5354 |
| 8 | 1 | 70.3 | 87.6 | 24 / 35 | 5258 |
| 9 | 1 | 68.5 | 84.8 | 19 / 35 | 4697 |
| 10 | 1 | 67.4 | 80.6 | 18 / 35 | 4645 |
| 11 | 1 | 68.8 | 87.3 | 22 / 35 | 4537 |
| 12 | 1 | 68.9 | 85.7 | 22 / 35 | 4448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 125 | 84% |
| nz.jdc.nano.GridFu 1.0 | 83 | 86% |
| stelo.PatternRobot 1.0 | 29 | 52% |
| timmit.nano.TimDog 0.33 | 27 | 63% |
| maribo.IotaCT 1.1 | 19 | 84% |
| spinnercat.Omen 1.0 | 13 | 100% |
| ratosh.Wesco 1.4 | 12 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |

Hadur died in 164 of 420 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 38 | 23% | 102 |
| nz.jdc.nano.GridFu 1.0 | 28 | 17% | 104 |
| stelo.PatternRobot 1.0 | 24 | 15% | 40 |
| timmit.nano.TimDog 0.33 | 23 | 14% | 52 |
| maribo.IotaCT 1.1 | 17 | 10% | 50 |
| ratosh.Wesco 1.4 | 17 | 10% | 32 |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 8% | 24 |
| spinnercat.Omen 1.0 | 3 | 2% | 11 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.0 | 288 / 420 | 1.99 | 20.4% | 74214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 20.4% | 288 |
| tvv.nano.Polaris 1.2 | 2.1 | 12.7% | 56 |
| baal.nano.N 1.42 | 3.1 | 11.4% | 13 |
| Grystrion.TrackerWO 1.0 | 4.6 | 9.6% | 3 |
| zyx.micro.Ant 1.1 | 5.4 | 8.9% | 16 |
| squidM.TentalceMeleeNano 1.1 | 6.6 | 8.3% | 3 |
| sanja.First 0.1 | 6.6 | 8.4% | 9 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.6% | 5 |
| cvt.Firsty 1.0 | 7.9 | 7.3% | 29 |
| sample.RamFire 1.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.0 | 24 / 35 | 6616 |
| 2 | 1 | 70.1 | 87.9 | 25 / 35 | 6153 |
| 3 | 1 | 71.3 | 92.4 | 23 / 35 | 6584 |
| 4 | 1 | 69.4 | 84.4 | 21 / 35 | 6505 |
| 5 | 1 | 70.5 | 91.4 | 27 / 35 | 5830 |
| 6 | 1 | 69.7 | 85.7 | 25 / 35 | 6096 |
| 7 | 1 | 70.8 | 92.4 | 27 / 35 | 5958 |
| 8 | 1 | 70.3 | 89.5 | 26 / 35 | 6065 |
| 9 | 1 | 70.2 | 89.2 | 21 / 35 | 6233 |
| 10 | 1 | 69.0 | 85.1 | 22 / 35 | 6020 |
| 11 | 1 | 70.0 | 88.3 | 23 / 35 | 6288 |
| 12 | 1 | 69.6 | 87.3 | 24 / 35 | 5866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 96 | 72% |
| baal.nano.N 1.42 | 62 | 100% |
| cvt.Firsty 1.0 | 40 | 45% |
| sanja.First 0.1 | 40 | 95% |
| zyx.micro.Ant 1.1 | 34 | 76% |
| amk.Punbot.Punbot 0.01 | 33 | 94% |
| Grystrion.TrackerWO 1.0 | 31 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 134 of 420 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 52 | 39% | 152 |
| cvt.Firsty 1.0 | 27 | 20% | 41 |
| zyx.micro.Ant 1.1 | 22 | 16% | 61 |
| Grystrion.TrackerWO 1.0 | 11 | 8% | 30 |
| baal.nano.N 1.42 | 9 | 7% | 64 |
| sanja.First 0.1 | 4 | 3% | 28 |
| squidM.TentalceMeleeNano 1.1 | 4 | 3% | 23 |
| amk.Punbot.Punbot 0.01 | 4 | 3% | 16 |
| sample.RamFire 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.3 | 56 / 420 | 4.48 | 13.0% | 52173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.4% | 207 |
| cs.Wren 1.0 | 2.5 | 12.8% | 59 |
| hadur117.micro.SaorL 0.1 | 2.9 | 13.0% | 56 |
| js.PinBall 1.6 | 3.8 | 11.9% | 51 |
| mz.Cork 0.1 | 4.7 | 11.1% | 22 |
| joe.ADinosaur 1.0 | 6.1 | 9.5% | 8 |
| evd.X1 0.01 | 6.8 | 8.1% | 7 |
| jsal.Jsalbot 1.0 | 8.1 | 6.8% | 8 |
| donjezza.Jezza 1.0 | 9.1 | 5.6% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 63.2 | 4 / 35 | 4147 |
| 2 | 4 | 56.9 | 62.5 | 2 / 35 | 3621 |
| 3 | 4 | 56.8 | 55.6 | 2 / 35 | 4242 |
| 4 | 3 | 57.6 | 55.9 | 4 / 35 | 4845 |
| 5 | 2 | 60.4 | 65.4 | 8 / 35 | 4174 |
| 6 | 2 | 60.2 | 63.2 | 7 / 35 | 4641 |
| 7 | 2 | 59.4 | 60.3 | 6 / 35 | 4666 |
| 8 | 3 | 57.6 | 60.3 | 1 / 35 | 4221 |
| 9 | 5 | 55.7 | 56.5 | 4 / 35 | 3558 |
| 10 | 2 | 62.3 | 71.4 | 5 / 35 | 4799 |
| 11 | 3 | 57.6 | 54.6 | 5 / 35 | 4396 |
| 12 | 2 | 61.8 | 67.0 | 8 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 110 | 29% |
| cs.Wren 1.0 | 21 | 24% |
| js.PinBall 1.6 | 12 | 50% |
| mz.Cork 0.1 | 12 | 58% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 33% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 364 of 420 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 143 | 39% | 176 |
| js.PinBall 1.6 | 45 | 12% | 51 |
| cs.Wren 1.0 | 44 | 12% | 51 |
| joe.ADinosaur 1.0 | 44 | 12% | 46 |
| mz.Cork 0.1 | 39 | 11% | 45 |
| evd.X1 0.01 | 22 | 6% | 21 |
| PSW.Relentless 0.1 | 14 | 4% | 13 |
| donjezza.Jezza 1.0 | 7 | 2% | 8 |
| jsal.Jsalbot 1.0 | 6 | 2% | 9 |

## Melee bench: F12

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.2 | 234 / 420 | 2.78 | 17.9% | 55024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 17.9% | 234 |
| myl.nano.Graviton 1.10 | 3.1 | 11.3% | 42 |
| ntc.Opposite 1.5 | 3.6 | 11.1% | 23 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.6% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.3% | 18 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 11 |
| DBall.NUKE 0.1 | 7.4 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 9.1 | 6.5% | 21 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 20 / 35 | 4741 |
| 2 | 1 | 68.6 | 85.4 | 22 / 35 | 4870 |
| 3 | 1 | 67.7 | 81.0 | 21 / 35 | 5035 |
| 4 | 1 | 69.6 | 87.9 | 26 / 35 | 4946 |
| 5 | 1 | 64.6 | 76.2 | 15 / 35 | 4459 |
| 6 | 1 | 66.8 | 81.3 | 18 / 35 | 4889 |
| 7 | 1 | 65.5 | 75.9 | 18 / 35 | 4599 |
| 8 | 1 | 66.8 | 81.9 | 19 / 35 | 4649 |
| 9 | 1 | 65.0 | 73.7 | 16 / 35 | 4394 |
| 10 | 1 | 68.4 | 87.9 | 24 / 35 | 4427 |
| 11 | 1 | 66.3 | 80.6 | 20 / 35 | 4452 |
| 12 | 1 | 61.5 | 67.6 | 15 / 35 | 3563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 74 | 65% |
| myl.nano.Graviton 1.10 | 65 | 89% |
| ntc.Opposite 1.5 | 33 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 29 | 93% |
| DBall.NUKE 0.1 | 24 | 100% |
| donjezza.Muncho 1.0 | 23 | 74% |
| disan.Chair 2.2.0 | 22 | 86% |
| pfvicm.Sobieski 7.2.3b | 15 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 189 of 420 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 47 | 25% | 73 |
| stelo.AreaTargetingBot 1.1 | 40 | 21% | 78 |
| myl.nano.Graviton 1.10 | 23 | 12% | 79 |
| ntc.Opposite 1.5 | 22 | 12% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 11% | 41 |
| disan.Chair 2.2.0 | 13 | 7% | 29 |
| donjezza.Muncho 1.0 | 13 | 7% | 28 |
| DBall.NUKE 0.1 | 6 | 3% | 35 |
| pbg.R2D2 1.0 | 5 | 3% | 7 |

## Melee bench: F13

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 65.3 | 96 / 420 | 4.13 | 13.7% | 45622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 2.1 | 14.1% | 98 |
| oog.melee.Capulet 1.2 | 2.3 | 14.0% | 103 |
| hadur117.micro.SaorL 0.1 | 2.9 | 13.7% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.9 | 12.8% | 66 |
| yagami.Tidus 0.11 | 4.2 | 12.5% | 35 |
| ejb.Polaris 1.0.1 | 5.6 | 11.1% | 21 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.7 | 56.5 | 4 / 35 | 3488 |
| 2 | 1 | 62.5 | 69.5 | 10 / 35 | 3708 |
| 3 | 4 | 59.9 | 62.9 | 8 / 35 | 3655 |
| 4 | 3 | 61.3 | 65.4 | 11 / 35 | 3735 |
| 5 | 3 | 60.1 | 61.9 | 6 / 35 | 3943 |
| 6 | 1 | 65.0 | 79.0 | 11 / 35 | 3957 |
| 7 | 2 | 61.8 | 67.0 | 7 / 35 | 4361 |
| 8 | 3 | 61.0 | 67.0 | 7 / 35 | 3436 |
| 9 | 3 | 60.4 | 63.8 | 7 / 35 | 3669 |
| 10 | 1 | 64.5 | 75.2 | 11 / 35 | 4324 |
| 11 | 5 | 56.7 | 54.6 | 8 / 35 | 3439 |
| 12 | 4 | 59.4 | 60.3 | 6 / 35 | 3907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 67 | 42% |
| kawigi.micro.Shiz 1.1 | 35 | 74% |
| yagami.Tidus 0.11 | 33 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 43% |
| ejb.Polaris 1.0.1 | 11 | 64% |

Hadur died in 324 of 420 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 122 | 38% | 150 |
| ejb.Polaris 1.0.1 | 46 | 14% | 59 |
| kawigi.micro.Shiz 1.1 | 42 | 13% | 59 |
| yagami.Tidus 0.11 | 39 | 12% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 12% | 53 |
| step.nanoPri 1.0 | 23 | 7% | 25 |
| stelo.MirrorNano 1.3 | 7 | 2% | 9 |
| kurios.DOSexe .9a | 7 | 2% | 8 |

## Melee bench: F14

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 73.0 | 190 / 420 | 3.43 | 15.6% | 48201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 15.6% | 190 |
| wee.Gem 1.8.4 | 2.6 | 12.6% | 82 |
| bzdp.Pansy 2.1 | 3.5 | 11.9% | 53 |
| wompi.Quokka 1.6 | 3.7 | 11.9% | 44 |
| ratosh.Nobo 0.21 | 4.5 | 11.1% | 18 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 16 |
| bayen.UbaMicro 1.4 | 6.6 | 9.3% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.3% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 73.0 | 16 / 35 | 3881 |
| 2 | 1 | 65.4 | 80.6 | 18 / 35 | 3972 |
| 3 | 1 | 61.4 | 69.5 | 12 / 35 | 3939 |
| 4 | 1 | 63.0 | 73.7 | 18 / 35 | 3672 |
| 5 | 1 | 64.8 | 73.0 | 18 / 35 | 4396 |
| 6 | 1 | 61.9 | 67.9 | 15 / 35 | 4187 |
| 7 | 1 | 61.5 | 67.3 | 14 / 35 | 3956 |
| 8 | 1 | 62.6 | 70.5 | 15 / 35 | 4264 |
| 9 | 1 | 65.9 | 84.1 | 17 / 35 | 4134 |
| 10 | 1 | 62.0 | 71.4 | 13 / 35 | 3749 |
| 11 | 1 | 63.5 | 73.7 | 18 / 35 | 3915 |
| 12 | 1 | 62.8 | 71.7 | 16 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 79% |
| wee.Gem 1.8.4 | 62 | 82% |
| wompi.Quokka 1.6 | 44 | 73% |
| ratosh.Nobo 0.21 | 23 | 83% |
| m3thos.Eva00 1.1 | 18 | 78% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |

Hadur died in 233 of 420 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 43 | 18% | 101 |
| bzdp.Pansy 2.1 | 38 | 16% | 86 |
| wompi.Quokka 1.6 | 35 | 15% | 65 |
| ratosh.Nobo 0.21 | 29 | 12% | 52 |
| bayen.UbaMicro 1.4 | 28 | 12% | 40 |
| m3thos.Eva00 1.1 | 19 | 8% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 18 | 8% | 21 |
| maribo.FollowFire 1 | 16 | 7% | 16 |
| stelo.MyAgileRobot 0.2 | 6 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 79.6 | 91 / 420 | 2.84 | 18.0% | 81008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.1% | 273 |
| hadur117.micro.SaorL 0.1 | 1.8 | 18.0% | 91 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 44 |
| ayk.WallHugger 1.0 | 4.4 | 9.9% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.6% | 1 |
| exauge.GateKeeper 1.1.121g | 5.4 | 9.1% | 7 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.1 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.0 | 11 / 35 | 6968 |
| 2 | 1 | 68.3 | 79.4 | 8 / 35 | 6847 |
| 3 | 2 | 69.4 | 79.4 | 8 / 35 | 6804 |
| 4 | 2 | 69.0 | 81.3 | 8 / 35 | 6557 |
| 5 | 2 | 66.8 | 74.6 | 8 / 35 | 6170 |
| 6 | 2 | 66.3 | 71.7 | 7 / 35 | 6453 |
| 7 | 2 | 68.9 | 79.7 | 7 / 35 | 6792 |
| 8 | 2 | 69.1 | 82.5 | 7 / 35 | 6946 |
| 9 | 2 | 68.5 | 81.3 | 3 / 35 | 6647 |
| 10 | 2 | 69.5 | 81.6 | 8 / 35 | 7131 |
| 11 | 2 | 69.9 | 81.6 | 9 / 35 | 7165 |
| 12 | 2 | 67.0 | 76.2 | 7 / 35 | 6528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 205 | 22% |
| mz.NanoGod 2.02 | 40 | 50% |
| exauge.GateKeeper 1.1.121g | 10 | 70% |
| ayk.WallHugger 1.0 | 8 | 88% |
| drd.Dreadknoght 0.9 | 7 | 86% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |

Hadur died in 330 of 420 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 204 | 62% | 248 |
| mz.NanoGod 2.02 | 79 | 24% | 105 |
| exauge.GateKeeper 1.1.121g | 17 | 5% | 24 |
| ayk.WallHugger 1.0 | 14 | 4% | 19 |
| stelo.PianistNano 1.2 | 8 | 2% | 10 |
| stuff.Vlad 0.1 | 7 | 2% | 9 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 66.0 | 128 / 420 | 4.06 | 14.6% | 52229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.2 | 14.6% | 128 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 83 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.4% | 63 |
| bvh.micro.Freya 0.3 | 3.9 | 11.6% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.8% | 53 |
| stelo.MirrorMicro 1.0 | 6.1 | 9.2% | 12 |
| conscience.Electron 1.3g | 7.1 | 8.4% | 3 |
| ap.Frederick 1.1 | 8.0 | 7.4% | 26 |
| dl.BetterWalls 1.0 | 8.8 | 6.8% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 65.7 | 12 / 35 | 4571 |
| 2 | 1 | 62.2 | 71.4 | 11 / 35 | 4165 |
| 3 | 2 | 59.9 | 61.6 | 11 / 35 | 4051 |
| 4 | 1 | 64.6 | 77.8 | 14 / 35 | 4387 |
| 5 | 1 | 61.2 | 66.3 | 9 / 35 | 4453 |
| 6 | 1 | 60.4 | 62.2 | 7 / 35 | 4530 |
| 7 | 1 | 60.6 | 61.3 | 12 / 35 | 4444 |
| 8 | 1 | 61.4 | 67.3 | 11 / 35 | 4082 |
| 9 | 2 | 58.1 | 56.2 | 6 / 35 | 4203 |
| 10 | 1 | 62.8 | 67.9 | 13 / 35 | 4444 |
| 11 | 1 | 63.3 | 69.5 | 12 / 35 | 4654 |
| 12 | 1 | 60.9 | 65.1 | 10 / 35 | 4245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 69 | 29% |
| davidalves.net.DuelistMicroMelee 1.4 | 45 | 60% |
| dummy.micro.Sparrow 2.5 | 37 | 86% |
| bvh.micro.Freya 0.3 | 29 | 90% |
| ap.Frederick 1.1 | 15 | 87% |
| stelo.MirrorMicro 1.0 | 9 | 78% |
| conscience.Electron 1.3g | 3 | 67% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 292 of 420 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 83 | 28% | 108 |
| davidalves.net.DuelistMicroMelee 1.4 | 44 | 15% | 70 |
| dummy.micro.Sparrow 2.5 | 34 | 12% | 67 |
| conscience.Electron 1.3g | 34 | 12% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 31 | 11% | 32 |
| bvh.micro.Freya 0.3 | 26 | 9% | 43 |
| stelo.MirrorMicro 1.0 | 21 | 7% | 36 |
| dl.BetterWalls 1.0 | 17 | 6% | 27 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.0 | 232 / 420 | 2.53 | 19.6% | 78561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.0 | 19.6% | 232 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.5% | 53 |
| sul.Lunar 1.1 | 3.1 | 11.8% | 46 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.0% | 36 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 12 |
| dsw.StaticD 1.0 | 5.8 | 9.1% | 17 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 9 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 10 |
| sample.Corners 1.0 | 9.6 | 5.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.1 | 20 / 35 | 6598 |
| 2 | 1 | 69.4 | 84.1 | 19 / 35 | 6189 |
| 3 | 1 | 69.5 | 81.6 | 18 / 35 | 7094 |
| 4 | 1 | 69.5 | 83.2 | 20 / 35 | 6494 |
| 5 | 1 | 69.2 | 81.3 | 18 / 35 | 6768 |
| 6 | 1 | 67.7 | 79.4 | 15 / 35 | 6083 |
| 7 | 1 | 71.6 | 91.1 | 24 / 35 | 6761 |
| 8 | 1 | 68.6 | 79.0 | 21 / 35 | 6251 |
| 9 | 1 | 70.3 | 84.8 | 17 / 35 | 7231 |
| 10 | 1 | 69.8 | 82.2 | 19 / 35 | 6832 |
| 11 | 1 | 68.0 | 78.7 | 21 / 35 | 5852 |
| 12 | 1 | 70.1 | 85.4 | 20 / 35 | 6408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 86 | 80% |
| sul.Lunar 1.1 | 84 | 77% |
| supersample.SuperBoxBot 1.0 | 55 | 78% |
| dsw.StaticD 1.0 | 23 | 57% |
| tlp.ThreeLeggedPig 1 | 19 | 84% |
| mme.NikeEnhanced 2.0 | 12 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 80% |
| sample.Corners 1.0 | 8 | 50% |
| sample.MyFirstRobot 1.0 | 7 | 57% |

Hadur died in 194 of 420 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 27% | 125 |
| supersample.SuperBoxBot 1.0 | 39 | 20% | 73 |
| dsw.StaticD 1.0 | 30 | 15% | 60 |
| sul.Lunar 1.1 | 24 | 12% | 86 |
| mme.NikeEnhanced 2.0 | 16 | 8% | 26 |
| sample.Corners 1.0 | 9 | 5% | 12 |
| sample.MyFirstRobot 1.0 | 7 | 4% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 3% | 14 |
| tlp.ThreeLeggedPig 1 | 6 | 3% | 12 |
5 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorL 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.7 | 122 / 420 | 3.64 | 15.6% | 64681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorL 0.1 | 1.2 | 15.6% | 122 |
| radnor.DoctorBob 1.42 | 2.3 | 14.0% | 95 |
| mld.Wisdom 1.0 | 3.3 | 12.5% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 11.9% | 101 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 16 |
| amz.NanoClone 1.41 | 5.3 | 10.3% | 25 |
| sample.Walls 1.0 | 7.5 | 7.7% | 11 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.4% | 9 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 68.9 | 14 / 35 | 5674 |
| 2 | 1 | 61.5 | 67.3 | 7 / 35 | 5262 |
| 3 | 1 | 63.1 | 70.8 | 10 / 35 | 5214 |
| 4 | 1 | 64.4 | 72.7 | 10 / 35 | 5440 |
| 5 | 2 | 64.1 | 73.7 | 12 / 35 | 5219 |
| 6 | 1 | 62.7 | 70.2 | 10 / 35 | 5177 |
| 7 | 1 | 66.0 | 76.8 | 12 / 35 | 5904 |
| 8 | 2 | 61.4 | 65.7 | 7 / 35 | 5178 |
| 9 | 1 | 64.7 | 72.1 | 10 / 35 | 5936 |
| 10 | 1 | 63.6 | 72.1 | 11 / 35 | 5269 |
| 11 | 1 | 63.2 | 69.5 | 10 / 35 | 5423 |
| 12 | 1 | 62.4 | 68.9 | 9 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 73 | 23% |
| radnor.DoctorBob 1.42 | 61 | 44% |
| mld.Wisdom 1.0 | 30 | 67% |
| amz.NanoClone 1.41 | 20 | 75% |
| KiraNL.Chupacabra 0.4 | 14 | 79% |
| jangs.ns51 1.0 | 12 | 92% |
| GarmBox.Oranges 1.0 | 11 | 100% |
| sample.Target 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 80% |

Hadur died in 299 of 420 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 88 | 29% | 122 |
| davidalves.net.DuelistNanoMelee 1.01 | 80 | 27% | 102 |
| mld.Wisdom 1.0 | 68 | 23% | 91 |
| KiraNL.Chupacabra 0.4 | 27 | 9% | 40 |
| amz.NanoClone 1.41 | 20 | 7% | 31 |
| sample.Walls 1.0 | 8 | 3% | 14 |
| GarmBox.Oranges 1.0 | 5 | 2% | 8 |
| jangs.ns51 1.0 | 3 | 1% | 10 |

