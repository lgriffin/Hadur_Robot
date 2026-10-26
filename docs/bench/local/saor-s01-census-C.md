# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.7 | 249 / 420 | 2.38 | 19.9% | 78342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.9% | 249 |
| radnor.DoctorBob 1.42 | 2.6 | 14.6% | 68 |
| mz.AntiGrav 1.0 | 2.8 | 14.2% | 37 |
| mld.Infinity 2.2 | 3.6 | 13.1% | 58 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| sample.Walls 1.0 | 6.3 | 7.4% | 2 |
| GarmBox.Oranges 1.0 | 7.1 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.6 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.4 | 20 / 35 | 6688 |
| 2 | 1 | 69.3 | 79.0 | 19 / 35 | 6427 |
| 3 | 1 | 69.6 | 86.7 | 18 / 35 | 6029 |
| 4 | 1 | 71.3 | 83.5 | 23 / 35 | 7205 |
| 5 | 1 | 69.6 | 83.8 | 17 / 35 | 6400 |
| 6 | 1 | 71.9 | 87.6 | 26 / 35 | 7188 |
| 7 | 1 | 70.8 | 84.1 | 21 / 35 | 6741 |
| 8 | 1 | 71.9 | 89.5 | 25 / 35 | 6754 |
| 9 | 1 | 71.7 | 90.2 | 23 / 35 | 6529 |
| 10 | 1 | 69.4 | 81.3 | 19 / 35 | 6137 |
| 11 | 1 | 69.5 | 83.2 | 19 / 35 | 5803 |
| 12 | 1 | 70.2 | 82.9 | 19 / 35 | 6441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 114 | 98% |
| mld.Infinity 2.2 | 77 | 75% |
| radnor.DoctorBob 1.42 | 75 | 64% |
| amz.NanoClone 1.41 | 12 | 92% |
| sample.Target 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 172 of 420 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 83 | 48% | 159 |
| mld.Infinity 2.2 | 37 | 22% | 42 |
| mz.AntiGrav 1.0 | 25 | 15% | 138 |
| amz.NanoClone 1.41 | 13 | 8% | 24 |
| jangs.ns51 1.0 | 5 | 3% | 15 |
| sample.Walls 1.0 | 4 | 2% | 21 |
| arthord.MannyPacquiao Beta | 4 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 11 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.3 | 258 / 420 | 2.42 | 18.2% | 58536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 18.2% | 258 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.7% | 100 |
| mld.DustBunny 3.8 | 3.4 | 12.1% | 23 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 4.9 | 9.1% | 10 |
| zyx.nano.Ant 1.1 | 5.6 | 9.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.2% | 13 |
| bzdp.BoxCar 2.0 | 8.1 | 7.3% | 2 |
| fullsail.SweetTea 1.1 | 8.8 | 6.5% | 9 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.1 | 40.6 | 3 / 35 | 3996 |
| 2 | 1 | 69.6 | 90.8 | 26 / 35 | 5214 |
| 3 | 1 | 67.7 | 85.4 | 23 / 35 | 5141 |
| 4 | 1 | 66.3 | 83.5 | 17 / 35 | 4897 |
| 5 | 1 | 68.2 | 88.9 | 23 / 35 | 4908 |
| 6 | 1 | 67.4 | 85.4 | 20 / 35 | 4429 |
| 7 | 1 | 69.1 | 90.8 | 26 / 35 | 4598 |
| 8 | 1 | 68.8 | 88.3 | 22 / 35 | 5080 |
| 9 | 1 | 69.9 | 90.2 | 26 / 35 | 5380 |
| 10 | 1 | 68.0 | 88.6 | 22 / 35 | 4636 |
| 11 | 1 | 69.2 | 90.2 | 23 / 35 | 5088 |
| 12 | 1 | 68.8 | 88.6 | 27 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 137 | 73% |
| mld.DustBunny 3.8 | 77 | 91% |
| djdjdj.NanoSkunk10 1.0 | 28 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 26 | 81% |
| maribo.melee.BMV 0.1 | 21 | 100% |
| zyx.nano.Ant 1.1 | 14 | 93% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| bzdp.BoxCar 2.0 | 3 | 67% |

Hadur died in 165 of 420 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 35% | 163 |
| zyx.nano.Ant 1.1 | 24 | 15% | 32 |
| mld.DustBunny 3.8 | 23 | 14% | 85 |
| maribo.melee.BMV 0.1 | 12 | 7% | 32 |
| bzdp.BoxCar 2.0 | 11 | 7% | 14 |
| cs.Grudge 1.0 | 11 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 6% | 32 |
| djdjdj.NanoSkunk10 1.0 | 9 | 5% | 35 |
| fullsail.SweetTea 1.1 | 7 | 4% | 15 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.8 | 266 / 420 | 2.37 | 19.6% | 68127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.6% | 266 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 63 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 11.7% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.1 | 10.8% | 35 |
| cb.nano.Insomnia 1.0 | 5.1 | 10.0% | 31 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 6.9 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.9 | 6.8% | 10 |
| sample.Fire 1.0 | 9.4 | 4.7% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.0 | 28 / 35 | 6306 |
| 2 | 1 | 69.8 | 86.0 | 23 / 35 | 5350 |
| 3 | 1 | 69.4 | 83.5 | 20 / 35 | 5631 |
| 4 | 1 | 69.2 | 86.3 | 21 / 35 | 5354 |
| 5 | 1 | 70.1 | 86.0 | 23 / 35 | 5802 |
| 6 | 1 | 68.4 | 80.6 | 20 / 35 | 5863 |
| 7 | 1 | 70.0 | 85.4 | 22 / 35 | 5926 |
| 8 | 1 | 71.2 | 88.6 | 23 / 35 | 6211 |
| 9 | 1 | 67.7 | 80.6 | 20 / 35 | 5248 |
| 10 | 1 | 68.7 | 83.2 | 24 / 35 | 5388 |
| 11 | 1 | 69.3 | 85.7 | 22 / 35 | 5585 |
| 12 | 1 | 67.6 | 77.1 | 20 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 99 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 70 | 86% |
| cb.nano.Insomnia 1.0 | 54 | 70% |
| myl.nano.KomoriNinja 1.1 | 37 | 92% |
| sp.Nanos.Ember 1.1 | 19 | 89% |
| fm.mammillarias 1.3 | 12 | 83% |
| sample.Fire 1.0 | 8 | 88% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 154 of 420 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 39 | 25% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 36 | 23% | 81 |
| myl.micro.Troodon 1.10 | 25 | 16% | 129 |
| myl.nano.KomoriNinja 1.1 | 16 | 10% | 83 |
| fm.mammillarias 1.3 | 12 | 8% | 24 |
| cs.sheldor.Talon 1.1 | 11 | 7% | 23 |
| sample.Fire 1.0 | 7 | 5% | 16 |
| sp.Nanos.Ember 1.1 | 5 | 3% | 30 |
| sample.Tracker 1.0 | 3 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.1 | 268 / 420 | 2.34 | 19.8% | 73366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 268 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 28 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.8% | 46 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 35 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 9.2% | 1 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 14 |
| repositorio.NanoStep 1.0 | 9.1 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 9.9 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 80.0 | 21 / 35 | 5524 |
| 2 | 1 | 66.6 | 76.8 | 17 / 35 | 5712 |
| 3 | 1 | 70.3 | 87.3 | 26 / 35 | 6159 |
| 4 | 1 | 70.4 | 86.7 | 24 / 35 | 6565 |
| 5 | 1 | 70.5 | 89.2 | 22 / 35 | 6331 |
| 6 | 1 | 68.2 | 83.2 | 19 / 35 | 5754 |
| 7 | 1 | 70.0 | 87.9 | 22 / 35 | 6149 |
| 8 | 1 | 70.5 | 86.3 | 24 / 35 | 6757 |
| 9 | 1 | 68.6 | 82.9 | 22 / 35 | 5666 |
| 10 | 1 | 70.0 | 84.4 | 22 / 35 | 6463 |
| 11 | 1 | 71.1 | 92.4 | 28 / 35 | 6086 |
| 12 | 1 | 69.1 | 83.8 | 21 / 35 | 6200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 124 | 90% |
| stelo.SoJNanoMelee 1.1 | 75 | 87% |
| tvv.micro.Antares 1.1.1 | 45 | 69% |
| tj.zombie1n 1.0.1 | 23 | 70% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 78% |
| yk.JahMicro 1.0 | 21 | 81% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 152 of 420 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 27% | 161 |
| tvv.micro.Antares 1.1.1 | 32 | 21% | 76 |
| stelo.SoJNanoMelee 1.1 | 31 | 20% | 63 |
| tj.zombie1n 1.0.1 | 20 | 13% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 9% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 5% | 35 |
| yk.JahMicro 1.0 | 6 | 4% | 16 |
| repositorio.NanoStep 1.0 | 2 | 1% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 11 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 65.7 | 175 / 420 | 4.09 | 14.8% | 51922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 14.8% | 175 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 63 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 68 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.7% | 48 |
| EBBU.Sim2 1.02 | 5.9 | 9.7% | 14 |
| sam.Samspin 1.0 | 6.3 | 9.5% | 23 |
| zyx.nano.BacillusComma 1.0 | 6.9 | 9.0% | 18 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.2% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 67.3 | 13 / 35 | 4433 |
| 2 | 1 | 57.2 | 54.3 | 10 / 35 | 3966 |
| 3 | 1 | 65.0 | 75.6 | 19 / 35 | 4634 |
| 4 | 1 | 62.4 | 70.5 | 15 / 35 | 4034 |
| 5 | 1 | 62.1 | 64.1 | 18 / 35 | 4107 |
| 6 | 2 | 60.9 | 66.0 | 13 / 35 | 4275 |
| 7 | 1 | 65.4 | 75.6 | 19 / 35 | 4600 |
| 8 | 1 | 61.0 | 63.5 | 16 / 35 | 3999 |
| 9 | 1 | 60.7 | 62.2 | 13 / 35 | 4542 |
| 10 | 1 | 62.1 | 66.7 | 16 / 35 | 4393 |
| 11 | 1 | 60.0 | 60.3 | 11 / 35 | 4462 |
| 12 | 1 | 61.0 | 62.2 | 12 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 80 | 84% |
| oog.melee.Corsair 1.0 | 44 | 68% |
| ahf.NanoAndrew .4 | 40 | 80% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| EBBU.Sim2 1.02 | 11 | 91% |
| zyx.nano.BacillusComma 1.0 | 11 | 100% |
| sam.Samspin 1.0 | 11 | 82% |
| sample.TrackFire 1.0 | 7 | 100% |

Hadur died in 246 of 420 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 46 | 19% | 95 |
| zyx.nano.BacillusComma 1.0 | 34 | 14% | 46 |
| ahf.NanoAndrew .4 | 33 | 13% | 66 |
| bwbaugh.nano.Tirunculus 0.0.0a | 32 | 13% | 34 |
| oog.melee.Corsair 1.0 | 31 | 13% | 73 |
| robar.nano.Assertive_Melee 0.2 | 26 | 11% | 38 |
| sam.Samspin 1.0 | 21 | 9% | 29 |
| EBBU.Sim2 1.02 | 17 | 7% | 25 |
| sample.TrackFire 1.0 | 6 | 2% | 12 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.9 | 257 / 420 | 2.36 | 18.5% | 58766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.5% | 257 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 55 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.9% | 51 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 14 |
| fm.claire 1.7 | 5.8 | 8.9% | 4 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.7% | 7 |
| sample.SpinBot 1.0 | 8.1 | 6.9% | 10 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 23 / 35 | 4911 |
| 2 | 1 | 69.0 | 89.5 | 24 / 35 | 5081 |
| 3 | 1 | 67.9 | 85.7 | 25 / 35 | 4805 |
| 4 | 1 | 69.4 | 89.5 | 23 / 35 | 5291 |
| 5 | 1 | 67.6 | 82.5 | 18 / 35 | 5087 |
| 6 | 1 | 68.5 | 87.0 | 24 / 35 | 4951 |
| 7 | 1 | 67.5 | 83.2 | 18 / 35 | 4834 |
| 8 | 1 | 68.9 | 89.5 | 20 / 35 | 4909 |
| 9 | 1 | 68.7 | 88.9 | 25 / 35 | 4754 |
| 10 | 1 | 67.1 | 82.9 | 22 / 35 | 4802 |
| 11 | 1 | 66.1 | 78.7 | 17 / 35 | 4946 |
| 12 | 1 | 64.6 | 74.9 | 18 / 35 | 4395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 130 | 91% |
| oog.melee.CapuletDroid 1.1 | 71 | 68% |
| gh.nano.Grofvuil 0.2 | 42 | 79% |
| arthord.NanoSatanMelee Beta | 21 | 90% |
| sample.SpinBot 1.0 | 15 | 100% |
| winamp32.micro.MicroMacro 1.0 | 15 | 73% |
| fm.claire 1.7 | 9 | 78% |
| kurios.DOSexe .9b | 6 | 50% |
| pa.Improved 1.0 | 4 | 75% |

Hadur died in 167 of 420 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 47 | 28% | 47 |
| gh.nano.Grofvuil 0.2 | 35 | 21% | 86 |
| d414.nano.Quantum 1.0.0 | 28 | 17% | 137 |
| arthord.NanoSatanMelee Beta | 14 | 8% | 38 |
| fm.claire 1.7 | 12 | 7% | 23 |
| winamp32.micro.MicroMacro 1.0 | 10 | 6% | 35 |
| kurios.DOSexe .9b | 7 | 4% | 25 |
| sample.SpinBot 1.0 | 6 | 4% | 14 |
| pa.Improved 1.0 | 5 | 3% | 13 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.8 | 164 / 420 | 2.82 | 17.3% | 63681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.3% | 164 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.2% | 93 |
| mz.MicroGodMelee 1 | 3.3 | 13.6% | 85 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.2% | 48 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 14 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 5 |
| el.JumpShoot 0.2 | 8.3 | 6.3% | 5 |
| acogdev.alpha 0.2 | 8.4 | 6.0% | 1 |
| fire219.CatBot 1.0 | 8.5 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.7 | 16 / 35 | 5474 |
| 2 | 1 | 66.5 | 78.4 | 13 / 35 | 5537 |
| 3 | 1 | 68.2 | 81.3 | 13 / 35 | 6213 |
| 4 | 1 | 66.4 | 77.8 | 13 / 35 | 5236 |
| 5 | 1 | 65.1 | 73.7 | 14 / 35 | 4925 |
| 6 | 2 | 62.6 | 68.9 | 7 / 35 | 5088 |
| 7 | 1 | 66.9 | 81.6 | 13 / 35 | 5367 |
| 8 | 1 | 67.1 | 83.5 | 17 / 35 | 5008 |
| 9 | 1 | 67.1 | 81.6 | 14 / 35 | 5303 |
| 10 | 1 | 67.7 | 85.4 | 17 / 35 | 5179 |
| 11 | 1 | 66.6 | 79.7 | 14 / 35 | 5328 |
| 12 | 1 | 65.4 | 78.7 | 13 / 35 | 5023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 91 | 37% |
| spinnercat.micro.Tyger 0.1 | 82 | 84% |
| gh.micro.Gruweltje 0.7 | 69 | 22% |
| DBall.Anarchy 0.1 | 26 | 92% |
| el.JumpShoot 0.2 | 10 | 80% |
| mbro.Detektor3 0.1.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |

Hadur died in 256 of 420 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 95 | 37% | 132 |
| gh.micro.Gruweltje 0.7 | 72 | 28% | 102 |
| spinnercat.micro.Tyger 0.1 | 39 | 15% | 88 |
| caimano.Furia_Ceca 0.22 | 14 | 5% | 19 |
| el.JumpShoot 0.2 | 10 | 4% | 16 |
| DBall.Anarchy 0.1 | 8 | 3% | 35 |
| fire219.CatBot 1.0 | 8 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 13 |
| acogdev.alpha 0.2 | 5 | 2% | 6 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 68.0 | 172 / 420 | 3.88 | 15.3% | 56678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.7 | 15.3% | 172 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.8% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.4 | 13.8% | 78 |
| germ.TheMind .2 | 4.9 | 9.7% | 17 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 11 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6.6 | 8.7% | 5 |
| stelo.UntouchableNano 1.3 | 7.9 | 7.5% | 16 |
| sample.Crazy 1.0 | 8.4 | 7.3% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 66.0 | 13 / 35 | 4584 |
| 2 | 2 | 63.0 | 68.9 | 13 / 35 | 4650 |
| 3 | 1 | 63.8 | 69.8 | 16 / 35 | 4758 |
| 4 | 1 | 66.1 | 75.6 | 16 / 35 | 5330 |
| 5 | 1 | 66.6 | 78.4 | 18 / 35 | 5127 |
| 6 | 3 | 60.1 | 60.0 | 11 / 35 | 4606 |
| 7 | 1 | 64.2 | 73.0 | 14 / 35 | 4992 |
| 8 | 1 | 62.2 | 66.0 | 16 / 35 | 4444 |
| 9 | 1 | 65.0 | 74.6 | 15 / 35 | 4990 |
| 10 | 3 | 59.0 | 59.4 | 12 / 35 | 4087 |
| 11 | 3 | 57.8 | 55.9 | 11 / 35 | 4251 |
| 12 | 1 | 63.8 | 68.9 | 17 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 127 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 70% |
| germ.TheMind .2 | 15 | 87% |
| qualidafial.MajorDick 1.0.1 | 12 | 100% |
| awesomeness.Elite 1.0 | 12 | 75% |
| stelo.UntouchableNano 1.3 | 11 | 91% |
| lrem.micro.MoggFanatic 0.2 | 8 | 88% |
| sample.Crazy 1.0 | 8 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 251 of 420 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 40% | 181 |
| simonton.nano.WeekendObsession_Melee 1.0 | 64 | 25% | 90 |
| awesomeness.Elite 1.0 | 19 | 8% | 29 |
| germ.TheMind .2 | 17 | 7% | 31 |
| qualidafial.MajorDick 1.0.1 | 16 | 6% | 21 |
| lrem.micro.MoggFanatic 0.2 | 15 | 6% | 21 |
| stelo.UntouchableNano 1.3 | 8 | 3% | 18 |
| mym.EdgeStalker 1.0 | 8 | 3% | 11 |
| sample.Crazy 1.0 | 3 | 1% | 14 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.5 | 288 / 420 | 2.04 | 19.5% | 56038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.5% | 288 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 33 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 47 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.4% | 2 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.5% | 13 |
| spinnercat.Omen 1.0 | 7.6 | 8.0% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 8.1% | 10 |
| ratosh.Wesco 1.4 | 8.0 | 7.8% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 26 / 35 | 4639 |
| 2 | 1 | 69.5 | 87.9 | 27 / 35 | 4201 |
| 3 | 1 | 68.3 | 85.1 | 19 / 35 | 4912 |
| 4 | 1 | 69.1 | 87.0 | 22 / 35 | 4645 |
| 5 | 1 | 70.4 | 92.7 | 24 / 35 | 4561 |
| 6 | 1 | 68.6 | 81.9 | 20 / 35 | 4912 |
| 7 | 1 | 70.8 | 91.1 | 27 / 35 | 4679 |
| 8 | 1 | 68.2 | 83.5 | 23 / 35 | 4341 |
| 9 | 1 | 68.9 | 86.0 | 22 / 35 | 4833 |
| 10 | 1 | 71.7 | 93.0 | 26 / 35 | 5282 |
| 11 | 1 | 70.6 | 91.7 | 27 / 35 | 4515 |
| 12 | 1 | 70.1 | 89.5 | 25 / 35 | 4518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 142 | 94% |
| nz.jdc.nano.GridFu 1.0 | 72 | 79% |
| stelo.PatternRobot 1.0 | 31 | 84% |
| maribo.IotaCT 1.1 | 24 | 75% |
| timmit.nano.TimDog 0.33 | 23 | 74% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 100% |
| ratosh.Wesco 1.4 | 12 | 100% |
| spinnercat.Omen 1.0 | 10 | 100% |

Hadur died in 132 of 420 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 35 | 27% | 98 |
| rz.HawkOnFire 0.1 | 30 | 23% | 137 |
| timmit.nano.TimDog 0.33 | 24 | 18% | 47 |
| maribo.IotaCT 1.1 | 14 | 11% | 53 |
| ratosh.Wesco 1.4 | 10 | 8% | 33 |
| stelo.PatternRobot 1.0 | 9 | 7% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 15 |
| spinnercat.Omen 1.0 | 3 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.7 | 313 / 420 | 1.93 | 20.5% | 71762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.5% | 313 |
| tvv.nano.Polaris 1.2 | 2.1 | 12.9% | 50 |
| baal.nano.N 1.42 | 2.9 | 11.7% | 13 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 9.4% | 13 |
| sanja.First 0.1 | 6.2 | 8.4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 1 |
| cvt.Firsty 1.0 | 7.9 | 7.4% | 14 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.2 | 30 / 35 | 6664 |
| 2 | 1 | 68.7 | 83.5 | 23 / 35 | 5608 |
| 3 | 1 | 72.3 | 96.5 | 30 / 35 | 6656 |
| 4 | 1 | 71.4 | 94.3 | 26 / 35 | 6229 |
| 5 | 1 | 69.6 | 87.0 | 24 / 35 | 5958 |
| 6 | 1 | 68.8 | 86.7 | 22 / 35 | 5525 |
| 7 | 1 | 70.6 | 87.9 | 28 / 35 | 6199 |
| 8 | 1 | 69.7 | 88.3 | 28 / 35 | 5436 |
| 9 | 1 | 70.3 | 91.1 | 26 / 35 | 5868 |
| 10 | 1 | 69.4 | 84.8 | 26 / 35 | 5994 |
| 11 | 1 | 69.8 | 90.8 | 26 / 35 | 5495 |
| 12 | 1 | 70.2 | 89.2 | 24 / 35 | 6130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 91 | 76% |
| baal.nano.N 1.42 | 65 | 97% |
| cvt.Firsty 1.0 | 51 | 82% |
| sanja.First 0.1 | 44 | 100% |
| zyx.micro.Ant 1.1 | 34 | 88% |
| amk.Punbot.Punbot 0.01 | 34 | 97% |
| Grystrion.TrackerWO 1.0 | 21 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 37% | 127 |
| zyx.micro.Ant 1.1 | 17 | 16% | 68 |
| cvt.Firsty 1.0 | 14 | 13% | 42 |
| sanja.First 0.1 | 8 | 7% | 43 |
| baal.nano.N 1.42 | 7 | 6% | 66 |
| sample.RamFire 1.0 | 7 | 6% | 13 |
| Grystrion.TrackerWO 1.0 | 6 | 6% | 23 |
| amk.Punbot.Punbot 0.01 | 6 | 6% | 14 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 16 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 65.5 | 101 / 420 | 4.10 | 14.1% | 53947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.4% | 184 |
| hadur117.micro.SaorC 0.1 | 2.3 | 14.1% | 101 |
| cs.Wren 1.0 | 2.5 | 13.6% | 55 |
| js.PinBall 1.6 | 4.3 | 11.5% | 29 |
| mz.Cork 0.1 | 4.7 | 11.3% | 26 |
| joe.ADinosaur 1.0 | 6.1 | 9.2% | 10 |
| evd.X1 0.01 | 6.9 | 8.0% | 7 |
| jsal.Jsalbot 1.0 | 7.9 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 9.1 | 5.6% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 66.7 | 10 / 35 | 4297 |
| 2 | 2 | 61.4 | 65.7 | 11 / 35 | 4627 |
| 3 | 1 | 63.8 | 72.7 | 13 / 35 | 4641 |
| 4 | 3 | 58.6 | 59.4 | 9 / 35 | 4008 |
| 5 | 2 | 59.5 | 64.8 | 2 / 35 | 4437 |
| 6 | 4 | 57.8 | 58.1 | 6 / 35 | 4245 |
| 7 | 2 | 62.2 | 67.9 | 8 / 35 | 4613 |
| 8 | 2 | 58.9 | 60.6 | 9 / 35 | 4337 |
| 9 | 2 | 62.7 | 68.3 | 8 / 35 | 4954 |
| 10 | 2 | 62.4 | 69.2 | 9 / 35 | 4474 |
| 11 | 2 | 63.6 | 72.7 | 8 / 35 | 4798 |
| 12 | 2 | 58.8 | 60.0 | 8 / 35 | 4516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 109 | 28% |
| cs.Wren 1.0 | 45 | 87% |
| mz.Cork 0.1 | 19 | 74% |
| js.PinBall 1.6 | 10 | 70% |
| donjezza.Jezza 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 319 of 420 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 148 | 46% | 184 |
| js.PinBall 1.6 | 42 | 13% | 51 |
| joe.ADinosaur 1.0 | 29 | 9% | 33 |
| cs.Wren 1.0 | 28 | 9% | 55 |
| PSW.Relentless 0.1 | 24 | 8% | 25 |
| evd.X1 0.01 | 21 | 7% | 23 |
| mz.Cork 0.1 | 17 | 5% | 31 |
| jsal.Jsalbot 1.0 | 5 | 2% | 11 |
| donjezza.Jezza 1.0 | 5 | 2% | 7 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.6 | 244 / 420 | 2.84 | 17.7% | 53219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.7% | 244 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 24 |
| myl.nano.Graviton 1.10 | 3.4 | 11.5% | 49 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.4% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.1% | 9 |
| DBall.NUKE 0.1 | 7.3 | 8.4% | 11 |
| disan.Chair 2.2.0 | 7.4 | 8.3% | 15 |
| donjezza.Muncho 1.0 | 9.1 | 6.2% | 23 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.2 | 25 / 35 | 4301 |
| 2 | 1 | 68.0 | 83.2 | 23 / 35 | 4785 |
| 3 | 1 | 66.7 | 81.3 | 22 / 35 | 4273 |
| 4 | 1 | 63.1 | 72.1 | 16 / 35 | 3854 |
| 5 | 1 | 66.0 | 79.4 | 17 / 35 | 4377 |
| 6 | 1 | 68.1 | 86.3 | 20 / 35 | 4800 |
| 7 | 1 | 65.8 | 77.5 | 20 / 35 | 4629 |
| 8 | 1 | 65.5 | 74.9 | 19 / 35 | 4494 |
| 9 | 1 | 65.9 | 79.4 | 20 / 35 | 4191 |
| 10 | 1 | 67.4 | 81.3 | 21 / 35 | 4960 |
| 11 | 1 | 66.1 | 78.4 | 20 / 35 | 4301 |
| 12 | 1 | 65.9 | 78.1 | 21 / 35 | 4254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 64 | 83% |
| myl.nano.Graviton 1.10 | 63 | 83% |
| ntc.Opposite 1.5 | 34 | 94% |
| DBall.NUKE 0.1 | 31 | 90% |
| disan.Chair 2.2.0 | 27 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 25 | 92% |
| donjezza.Muncho 1.0 | 23 | 78% |
| pfvicm.Sobieski 7.2.3b | 12 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 179 of 420 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 46 | 26% | 67 |
| stelo.AreaTargetingBot 1.1 | 32 | 18% | 81 |
| myl.nano.Graviton 1.10 | 29 | 16% | 81 |
| ntc.Opposite 1.5 | 24 | 13% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 10% | 43 |
| donjezza.Muncho 1.0 | 12 | 7% | 22 |
| disan.Chair 2.2.0 | 10 | 6% | 27 |
| DBall.NUKE 0.1 | 8 | 4% | 39 |
| pbg.R2D2 1.0 | 0 | 0% | 13 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 70.7 | 147 / 420 | 3.64 | 14.9% | 46778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.6 | 14.9% | 147 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 106 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.8% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 45 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 29 |
| ejb.Polaris 1.0.1 | 5.6 | 10.7% | 18 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 67.3 | 11 / 35 | 3928 |
| 2 | 3 | 60.2 | 65.1 | 9 / 35 | 3464 |
| 3 | 1 | 63.9 | 72.1 | 14 / 35 | 3996 |
| 4 | 2 | 62.4 | 66.7 | 12 / 35 | 3951 |
| 5 | 1 | 65.1 | 76.8 | 14 / 35 | 4026 |
| 6 | 1 | 62.7 | 69.5 | 13 / 35 | 3812 |
| 7 | 1 | 62.0 | 68.9 | 12 / 35 | 3827 |
| 8 | 2 | 63.1 | 69.5 | 11 / 35 | 4264 |
| 9 | 2 | 62.8 | 71.7 | 10 / 35 | 3606 |
| 10 | 1 | 61.5 | 66.0 | 10 / 35 | 3940 |
| 11 | 1 | 64.1 | 72.7 | 14 / 35 | 4095 |
| 12 | 1 | 66.1 | 81.6 | 17 / 35 | 3869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 73 | 55% |
| kawigi.micro.Shiz 1.1 | 53 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 73% |
| yagami.Tidus 0.11 | 29 | 86% |
| ejb.Polaris 1.0.1 | 12 | 67% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 274 of 420 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 106 | 39% | 154 |
| kawigi.micro.Shiz 1.1 | 39 | 14% | 64 |
| yagami.Tidus 0.11 | 37 | 14% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 11% | 61 |
| ejb.Polaris 1.0.1 | 29 | 11% | 43 |
| stelo.MirrorNano 1.3 | 13 | 5% | 14 |
| step.nanoPri 1.0 | 12 | 4% | 12 |
| kurios.DOSexe .9a | 8 | 3% | 8 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 74.3 | 201 / 420 | 3.31 | 15.9% | 47154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 15.9% | 201 |
| wee.Gem 1.8.4 | 2.8 | 12.7% | 90 |
| bzdp.Pansy 2.1 | 3.4 | 12.2% | 45 |
| wompi.Quokka 1.6 | 3.4 | 12.0% | 48 |
| ratosh.Nobo 0.21 | 4.4 | 11.1% | 12 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 11 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.2% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 71.4 | 13 / 35 | 4138 |
| 2 | 1 | 63.7 | 72.7 | 16 / 35 | 4379 |
| 3 | 1 | 63.9 | 73.3 | 16 / 35 | 3970 |
| 4 | 1 | 61.4 | 67.6 | 14 / 35 | 3554 |
| 5 | 1 | 65.7 | 84.1 | 19 / 35 | 3685 |
| 6 | 1 | 63.5 | 73.0 | 18 / 35 | 3720 |
| 7 | 1 | 61.6 | 69.2 | 15 / 35 | 3600 |
| 8 | 1 | 67.2 | 84.4 | 22 / 35 | 4503 |
| 9 | 1 | 61.9 | 69.8 | 14 / 35 | 3550 |
| 10 | 1 | 63.9 | 74.9 | 17 / 35 | 3994 |
| 11 | 1 | 65.9 | 81.3 | 19 / 35 | 4228 |
| 12 | 1 | 62.8 | 70.2 | 18 / 35 | 3833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 83 | 88% |
| wompi.Quokka 1.6 | 60 | 68% |
| wee.Gem 1.8.4 | 59 | 75% |
| ratosh.Nobo 0.21 | 17 | 82% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| m3thos.Eva00 1.1 | 12 | 92% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |

Hadur died in 220 of 420 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 49 | 22% | 69 |
| wee.Gem 1.8.4 | 37 | 17% | 89 |
| bzdp.Pansy 2.1 | 30 | 14% | 100 |
| maribo.FollowFire 1 | 24 | 11% | 23 |
| bayen.UbaMicro 1.4 | 20 | 9% | 33 |
| jeremyreeder.Vincent 2011.12.09 | 20 | 9% | 27 |
| ratosh.Nobo 0.21 | 17 | 8% | 38 |
| m3thos.Eva00 1.1 | 12 | 5% | 26 |
| stelo.MyAgileRobot 0.2 | 11 | 5% | 13 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 81.5 | 87 / 420 | 2.66 | 18.1% | 78203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 20.2% | 279 |
| hadur117.micro.SaorC 0.1 | 1.9 | 18.1% | 87 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 44 |
| ayk.WallHugger 1.0 | 4.4 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 5 |
| stuff.Vlad 0.1 | 6.3 | 8.1% | 1 |
| stelo.PianistNano 1.2 | 6.6 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.0 | 84.1 | 10 / 35 | 6879 |
| 2 | 2 | 68.8 | 81.0 | 5 / 35 | 6560 |
| 3 | 2 | 68.4 | 81.0 | 7 / 35 | 6422 |
| 4 | 2 | 69.0 | 82.5 | 3 / 35 | 6636 |
| 5 | 2 | 69.0 | 83.5 | 10 / 35 | 6290 |
| 6 | 2 | 68.4 | 82.2 | 6 / 35 | 6086 |
| 7 | 2 | 68.4 | 77.1 | 8 / 35 | 6597 |
| 8 | 1 | 71.0 | 88.9 | 12 / 35 | 6892 |
| 9 | 2 | 67.1 | 77.1 | 4 / 35 | 6129 |
| 10 | 2 | 70.2 | 87.3 | 7 / 35 | 7020 |
| 11 | 2 | 69.1 | 79.4 | 7 / 35 | 6834 |
| 12 | 2 | 66.9 | 74.0 | 8 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 214 | 21% |
| mz.NanoGod 2.02 | 30 | 37% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 335 of 420 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 222 | 66% | 273 |
| mz.NanoGod 2.02 | 72 | 21% | 87 |
| ayk.WallHugger 1.0 | 17 | 5% | 25 |
| exauge.GateKeeper 1.1.121g | 11 | 3% | 16 |
| drd.Dreadknoght 0.9 | 6 | 2% | 9 |
| stelo.PianistNano 1.2 | 5 | 1% | 8 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.3 | 214 / 420 | 3.40 | 16.3% | 52963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.3% | 214 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 46 |
| dummy.micro.Sparrow 2.5 | 3.4 | 12.0% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.1% | 37 |
| bvh.micro.Freya 0.3 | 4.3 | 11.4% | 40 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 13 |
| conscience.Electron 1.3g | 7.4 | 7.7% | 4 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 20 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.8 | 21 / 35 | 4662 |
| 2 | 1 | 65.0 | 74.6 | 19 / 35 | 4607 |
| 3 | 1 | 64.6 | 75.6 | 17 / 35 | 4278 |
| 4 | 1 | 66.6 | 80.0 | 21 / 35 | 4714 |
| 5 | 1 | 65.4 | 77.1 | 20 / 35 | 4400 |
| 6 | 1 | 64.1 | 70.5 | 16 / 35 | 4581 |
| 7 | 1 | 64.7 | 72.4 | 19 / 35 | 4448 |
| 8 | 1 | 65.4 | 77.5 | 17 / 35 | 4510 |
| 9 | 1 | 63.9 | 73.0 | 15 / 35 | 4283 |
| 10 | 1 | 64.6 | 71.7 | 20 / 35 | 4593 |
| 11 | 2 | 58.7 | 58.4 | 11 / 35 | 3771 |
| 12 | 1 | 63.7 | 72.1 | 18 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 92 | 90% |
| bvh.micro.Freya 0.3 | 48 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 41 | 88% |
| dummy.micro.Sparrow 2.5 | 38 | 87% |
| stelo.MirrorMicro 1.0 | 14 | 71% |
| ap.Frederick 1.1 | 9 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 211 of 420 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 19% | 105 |
| mn.nano.perceptual.Impact 1.3.0 | 37 | 18% | 36 |
| dummy.micro.Sparrow 2.5 | 33 | 16% | 68 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 12% | 78 |
| conscience.Electron 1.3g | 24 | 11% | 35 |
| bvh.micro.Freya 0.3 | 23 | 11% | 44 |
| stelo.MirrorMicro 1.0 | 13 | 6% | 29 |
| dl.BetterWalls 1.0 | 12 | 6% | 24 |
| ap.Frederick 1.1 | 1 | 0% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.6 | 278 / 420 | 2.48 | 19.8% | 75538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 278 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.5% | 42 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 30 |
| supersample.SuperBoxBot 1.0 | 4.1 | 10.5% | 17 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.7% | 14 |
| dsw.StaticD 1.0 | 5.6 | 8.9% | 17 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.1 | 6.3% | 7 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.8% | 10 |
| sample.Corners 1.0 | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 83.8 | 26 / 35 | 6222 |
| 2 | 1 | 70.9 | 90.8 | 25 / 35 | 6243 |
| 3 | 1 | 69.8 | 80.6 | 25 / 35 | 6617 |
| 4 | 1 | 68.4 | 79.7 | 18 / 35 | 6441 |
| 5 | 1 | 70.6 | 87.9 | 26 / 35 | 6242 |
| 6 | 1 | 70.8 | 87.0 | 26 / 35 | 6433 |
| 7 | 1 | 71.8 | 94.9 | 25 / 35 | 6346 |
| 8 | 1 | 67.5 | 74.3 | 19 / 35 | 6346 |
| 9 | 1 | 68.8 | 78.1 | 21 / 35 | 6232 |
| 10 | 1 | 66.9 | 74.3 | 18 / 35 | 5622 |
| 11 | 1 | 70.6 | 87.0 | 25 / 35 | 6356 |
| 12 | 1 | 70.1 | 84.4 | 24 / 35 | 6438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 97 | 92% |
| sul.Lunar 1.1 | 72 | 97% |
| supersample.SuperBoxBot 1.0 | 45 | 91% |
| mme.NikeEnhanced 2.0 | 25 | 92% |
| dsw.StaticD 1.0 | 24 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 15 | 100% |
| sample.MyFirstRobot 1.0 | 14 | 86% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 34% | 125 |
| supersample.SuperBoxBot 1.0 | 25 | 17% | 65 |
| dsw.StaticD 1.0 | 25 | 17% | 51 |
| mme.NikeEnhanced 2.0 | 20 | 14% | 46 |
| sample.Corners 1.0 | 8 | 6% | 12 |
| sul.Lunar 1.1 | 7 | 5% | 82 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 3% | 20 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 1% | 15 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.1 | 188 / 420 | 3.06 | 17.3% | 68716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.3% | 188 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 89 |
| mld.Wisdom 1.0 | 3.7 | 11.8% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 11.6% | 50 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 30 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.9% | 15 |
| sample.Walls 1.0 | 7.1 | 7.9% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 4 |
| sample.Target 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.0 | 16 / 35 | 5326 |
| 2 | 1 | 67.0 | 80.6 | 18 / 35 | 5569 |
| 3 | 1 | 65.9 | 75.9 | 11 / 35 | 5991 |
| 4 | 1 | 65.5 | 77.5 | 13 / 35 | 5323 |
| 5 | 1 | 69.3 | 84.8 | 18 / 35 | 6597 |
| 6 | 1 | 68.0 | 84.1 | 20 / 35 | 5786 |
| 7 | 1 | 63.7 | 69.5 | 13 / 35 | 5182 |
| 8 | 1 | 66.9 | 75.9 | 18 / 35 | 6444 |
| 9 | 1 | 66.4 | 74.6 | 17 / 35 | 6116 |
| 10 | 1 | 65.9 | 74.6 | 13 / 35 | 6042 |
| 11 | 1 | 63.4 | 69.2 | 15 / 35 | 5019 |
| 12 | 1 | 66.3 | 79.7 | 16 / 35 | 5321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 81 | 91% |
| radnor.DoctorBob 1.42 | 63 | 49% |
| mld.Wisdom 1.0 | 35 | 80% |
| amz.NanoClone 1.41 | 23 | 70% |
| KiraNL.Chupacabra 0.4 | 19 | 68% |
| GarmBox.Oranges 1.0 | 10 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 80% |

Hadur died in 234 of 420 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 29% | 102 |
| mld.Wisdom 1.0 | 59 | 25% | 87 |
| davidalves.net.DuelistNanoMelee 1.01 | 30 | 13% | 109 |
| KiraNL.Chupacabra 0.4 | 29 | 12% | 47 |
| amz.NanoClone 1.41 | 28 | 12% | 35 |
| sample.Walls 1.0 | 7 | 3% | 15 |
| jangs.ns51 1.0 | 6 | 3% | 11 |
| GarmBox.Oranges 1.0 | 6 | 3% | 11 |

