# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.9 | 252 / 420 | 2.45 | 19.7% | 76988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 19.7% | 252 |
| radnor.DoctorBob 1.42 | 2.5 | 14.8% | 68 |
| mz.AntiGrav 1.0 | 2.9 | 14.2% | 35 |
| mld.Infinity 2.2 | 3.6 | 13.5% | 54 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 6 |
| sample.Walls 1.0 | 6.2 | 7.3% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 84.1 | 20 / 35 | 6724 |
| 2 | 1 | 67.8 | 79.0 | 16 / 35 | 5610 |
| 3 | 1 | 67.9 | 75.9 | 15 / 35 | 6221 |
| 4 | 1 | 70.0 | 80.6 | 23 / 35 | 6391 |
| 5 | 1 | 71.6 | 87.9 | 25 / 35 | 6577 |
| 6 | 1 | 73.0 | 94.6 | 27 / 35 | 6722 |
| 7 | 1 | 69.4 | 82.5 | 21 / 35 | 6052 |
| 8 | 1 | 70.1 | 82.9 | 19 / 35 | 6557 |
| 9 | 1 | 71.7 | 89.2 | 25 / 35 | 6674 |
| 10 | 1 | 70.9 | 84.1 | 21 / 35 | 6705 |
| 11 | 1 | 70.7 | 86.0 | 20 / 35 | 6329 |
| 12 | 1 | 69.2 | 79.4 | 20 / 35 | 6426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 116 | 97% |
| mld.Infinity 2.2 | 82 | 83% |
| radnor.DoctorBob 1.42 | 61 | 66% |
| amz.NanoClone 1.41 | 19 | 95% |
| jangs.ns51 1.0 | 8 | 88% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 168 of 420 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 81 | 48% | 156 |
| mld.Infinity 2.2 | 26 | 15% | 32 |
| mz.AntiGrav 1.0 | 23 | 14% | 137 |
| amz.NanoClone 1.41 | 20 | 12% | 40 |
| jangs.ns51 1.0 | 7 | 4% | 14 |
| sample.Walls 1.0 | 5 | 3% | 19 |
| GarmBox.Oranges 1.0 | 5 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 10 |

## Melee bench: F02

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.5 | 286 / 420 | 2.12 | 18.9% | 60383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 18.9% | 286 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.7% | 88 |
| mld.DustBunny 3.8 | 4.0 | 11.9% | 13 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 12 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.9% | 8 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.7% | 5 |
| cs.Grudge 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 68.9 | 15 / 35 | 5081 |
| 2 | 1 | 67.4 | 81.6 | 24 / 35 | 5138 |
| 3 | 1 | 65.9 | 85.1 | 18 / 35 | 4463 |
| 4 | 1 | 70.4 | 95.2 | 30 / 35 | 5437 |
| 5 | 1 | 69.6 | 90.8 | 28 / 35 | 5448 |
| 6 | 1 | 69.5 | 89.8 | 25 / 35 | 5105 |
| 7 | 1 | 66.8 | 84.8 | 18 / 35 | 4600 |
| 8 | 1 | 70.1 | 92.4 | 25 / 35 | 5225 |
| 9 | 1 | 68.9 | 89.5 | 26 / 35 | 4611 |
| 10 | 1 | 70.9 | 95.9 | 29 / 35 | 5638 |
| 11 | 1 | 68.1 | 86.7 | 21 / 35 | 4854 |
| 12 | 1 | 69.1 | 89.5 | 27 / 35 | 4783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 159 | 77% |
| mld.DustBunny 3.8 | 83 | 99% |
| sheldor.micro.PointInLineRRAL 1.0 | 27 | 89% |
| maribo.melee.BMV 0.1 | 25 | 80% |
| djdjdj.NanoSkunk10 1.0 | 21 | 86% |
| fullsail.SweetTea 1.1 | 13 | 77% |
| zyx.nano.Ant 1.1 | 8 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 134 of 420 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 52 | 39% | 167 |
| maribo.melee.BMV 0.1 | 18 | 13% | 37 |
| mld.DustBunny 3.8 | 16 | 12% | 84 |
| zyx.nano.Ant 1.1 | 13 | 10% | 25 |
| fullsail.SweetTea 1.1 | 13 | 10% | 23 |
| djdjdj.NanoSkunk10 1.0 | 8 | 6% | 41 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 4% | 30 |
| cs.Grudge 1.0 | 5 | 4% | 4 |
| bzdp.BoxCar 2.0 | 4 | 3% | 7 |

## Melee bench: F03

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 81.4 | 262 / 420 | 2.68 | 19.3% | 69480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 19.3% | 262 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 74 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 26 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.8% | 26 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 9 |
| sample.Fire 1.0 | 9.1 | 5.3% | 5 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 23 / 35 | 5532 |
| 2 | 1 | 68.8 | 78.4 | 21 / 35 | 5751 |
| 3 | 1 | 68.7 | 79.4 | 22 / 35 | 5739 |
| 4 | 1 | 67.5 | 77.8 | 20 / 35 | 5446 |
| 5 | 1 | 68.0 | 78.7 | 17 / 35 | 5673 |
| 6 | 1 | 70.4 | 85.4 | 24 / 35 | 5744 |
| 7 | 1 | 69.0 | 81.6 | 23 / 35 | 5676 |
| 8 | 1 | 69.0 | 78.4 | 23 / 35 | 5933 |
| 9 | 1 | 68.7 | 79.7 | 21 / 35 | 6020 |
| 10 | 1 | 68.9 | 81.0 | 20 / 35 | 6116 |
| 11 | 1 | 71.5 | 89.5 | 27 / 35 | 6385 |
| 12 | 1 | 67.7 | 78.4 | 21 / 35 | 5465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 101 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 73 | 88% |
| cb.nano.Insomnia 1.0 | 41 | 76% |
| myl.nano.KomoriNinja 1.1 | 32 | 91% |
| sp.Nanos.Ember 1.1 | 25 | 84% |
| fm.mammillarias 1.3 | 9 | 100% |
| sample.Fire 1.0 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 159 of 420 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 39 | 25% | 34 |
| myl.micro.Troodon 1.10 | 31 | 19% | 141 |
| stelo.SoRobotNanoMelee 1.2 | 30 | 19% | 66 |
| myl.nano.KomoriNinja 1.1 | 20 | 13% | 72 |
| fm.mammillarias 1.3 | 14 | 9% | 30 |
| sp.Nanos.Ember 1.1 | 9 | 6% | 29 |
| cs.sheldor.Talon 1.1 | 8 | 5% | 24 |
| sample.Fire 1.0 | 8 | 5% | 17 |
| sample.Tracker 1.0 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.2 | 277 / 420 | 2.15 | 20.1% | 72659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 20.1% | 277 |
| kawigi.nano.Lib 1.0 | 2.4 | 12.7% | 32 |
| tvv.micro.Antares 1.1.1 | 2.6 | 12.3% | 34 |
| tj.zombie1n 1.0.1 | 5.0 | 9.4% | 19 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.4% | 38 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.1 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 11 |
| yk.JahMicro 1.0 | 7.1 | 8.0% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 3 |
| sample.VelociRobot 1.0 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.8 | 26 / 35 | 5627 |
| 2 | 1 | 71.3 | 90.8 | 27 / 35 | 6530 |
| 3 | 1 | 69.9 | 87.3 | 23 / 35 | 6060 |
| 4 | 1 | 69.0 | 83.8 | 24 / 35 | 5858 |
| 5 | 1 | 67.9 | 77.5 | 22 / 35 | 5722 |
| 6 | 1 | 69.7 | 90.2 | 20 / 35 | 6092 |
| 7 | 1 | 70.6 | 88.6 | 25 / 35 | 6459 |
| 8 | 1 | 70.7 | 89.8 | 22 / 35 | 6246 |
| 9 | 1 | 71.6 | 94.3 | 26 / 35 | 6019 |
| 10 | 1 | 67.9 | 82.2 | 18 / 35 | 5802 |
| 11 | 1 | 68.4 | 81.0 | 19 / 35 | 6240 |
| 12 | 1 | 70.3 | 90.5 | 25 / 35 | 6004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 110 | 90% |
| stelo.SoJNanoMelee 1.1 | 82 | 85% |
| tvv.micro.Antares 1.1.1 | 44 | 73% |
| ers.nano.hawk.HawkLA 3.0m | 30 | 83% |
| tj.zombie1n 1.0.1 | 26 | 73% |
| yk.JahMicro 1.0 | 15 | 87% |
| repositorio.NanoStep 1.0 | 9 | 100% |
| sample.VelociRobot 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 146 of 420 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 24% | 156 |
| stelo.SoJNanoMelee 1.1 | 31 | 21% | 65 |
| tvv.micro.Antares 1.1.1 | 28 | 19% | 60 |
| tj.zombie1n 1.0.1 | 20 | 14% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 14 | 10% | 51 |
| yk.JahMicro 1.0 | 9 | 6% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 4% | 12 |
| repositorio.NanoStep 1.0 | 2 | 1% | 14 |
| sample.VelociRobot 1.0 | 0 | 0% | 13 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 67.3 | 162 / 420 | 3.94 | 15.0% | 53157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.1 | 15.0% | 162 |
| oog.melee.Corsair 1.0 | 2.3 | 12.9% | 73 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 67 |
| simonton.nano.MeleeSeed 1.8 | 3.9 | 11.1% | 46 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 12 |
| sam.Samspin 1.0 | 6.0 | 9.8% | 24 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.3% | 17 |
| zyx.nano.BacillusComma 1.0 | 7.1 | 8.8% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.6% | 0 |
| sample.TrackFire 1.0 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 60.0 | 8 / 35 | 4292 |
| 2 | 1 | 64.1 | 71.1 | 15 / 35 | 4782 |
| 3 | 1 | 63.0 | 67.9 | 12 / 35 | 5098 |
| 4 | 1 | 63.3 | 74.3 | 17 / 35 | 4155 |
| 5 | 1 | 57.9 | 54.9 | 10 / 35 | 4402 |
| 6 | 1 | 62.0 | 70.5 | 14 / 35 | 4144 |
| 7 | 1 | 62.8 | 72.1 | 14 / 35 | 4335 |
| 8 | 1 | 59.0 | 60.0 | 10 / 35 | 3903 |
| 9 | 1 | 60.7 | 64.8 | 13 / 35 | 4131 |
| 10 | 1 | 64.6 | 73.0 | 16 / 35 | 5029 |
| 11 | 1 | 61.5 | 63.5 | 15 / 35 | 4374 |
| 12 | 1 | 64.9 | 75.6 | 18 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 63 | 51% |
| simonton.nano.MeleeSeed 1.8 | 59 | 88% |
| ahf.NanoAndrew .4 | 48 | 63% |
| sam.Samspin 1.0 | 16 | 88% |
| EBBU.Sim2 1.02 | 14 | 100% |
| robar.nano.Assertive_Melee 0.2 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 261 of 420 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 52 | 20% | 92 |
| simonton.nano.MeleeSeed 1.8 | 50 | 19% | 90 |
| ahf.NanoAndrew .4 | 36 | 14% | 70 |
| robar.nano.Assertive_Melee 0.2 | 35 | 13% | 44 |
| EBBU.Sim2 1.02 | 25 | 10% | 38 |
| zyx.nano.BacillusComma 1.0 | 19 | 7% | 23 |
| sam.Samspin 1.0 | 18 | 7% | 32 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 6% | 16 |
| sample.TrackFire 1.0 | 10 | 4% | 14 |

## Melee bench: F06

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.8 | 277 / 420 | 2.46 | 18.6% | 59080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 18.6% | 277 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.4% | 50 |
| gh.nano.Grofvuil 0.2 | 2.9 | 12.0% | 26 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 9.8% | 28 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.8% | 17 |
| fm.claire 1.7 | 6.6 | 8.4% | 4 |
| sample.SpinBot 1.0 | 7.6 | 7.4% | 7 |
| pa.Improved 1.0 | 9.1 | 6.2% | 4 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 20 / 35 | 4826 |
| 2 | 1 | 67.8 | 82.9 | 23 / 35 | 5030 |
| 3 | 1 | 68.1 | 86.3 | 23 / 35 | 4479 |
| 4 | 1 | 68.2 | 84.8 | 24 / 35 | 5001 |
| 5 | 1 | 67.7 | 83.8 | 21 / 35 | 4998 |
| 6 | 1 | 67.2 | 81.9 | 21 / 35 | 5023 |
| 7 | 1 | 67.5 | 82.5 | 23 / 35 | 4958 |
| 8 | 1 | 67.2 | 80.3 | 22 / 35 | 4909 |
| 9 | 1 | 69.4 | 90.2 | 27 / 35 | 4814 |
| 10 | 1 | 68.6 | 84.8 | 25 / 35 | 4959 |
| 11 | 1 | 69.8 | 88.6 | 25 / 35 | 5464 |
| 12 | 1 | 66.4 | 78.1 | 23 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 129 | 94% |
| oog.melee.CapuletDroid 1.1 | 73 | 79% |
| gh.nano.Grofvuil 0.2 | 43 | 81% |
| arthord.NanoSatanMelee Beta | 26 | 96% |
| sample.SpinBot 1.0 | 18 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 44% |
| kurios.DOSexe .9b | 6 | 83% |
| pa.Improved 1.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 31 | 21% | 83 |
| oog.melee.CapuletDroid 1.1 | 28 | 19% | 34 |
| d414.nano.Quantum 1.0.0 | 25 | 17% | 154 |
| fm.claire 1.7 | 16 | 11% | 25 |
| arthord.NanoSatanMelee Beta | 15 | 10% | 37 |
| winamp32.micro.MicroMacro 1.0 | 12 | 8% | 35 |
| kurios.DOSexe .9b | 8 | 6% | 25 |
| sample.SpinBot 1.0 | 6 | 4% | 16 |
| pa.Improved 1.0 | 4 | 3% | 8 |

## Melee bench: F07

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.9 | 181 / 420 | 2.72 | 17.5% | 62317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 17.5% | 181 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 88 |
| mz.MicroGodMelee 1 | 3.3 | 13.7% | 80 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.5% | 47 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 10 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 5 |
| acogdev.alpha 0.2 | 7.4 | 6.5% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.4% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.1 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.0 | 11 / 35 | 5179 |
| 2 | 1 | 69.2 | 89.2 | 18 / 35 | 5634 |
| 3 | 1 | 68.3 | 85.1 | 16 / 35 | 5649 |
| 4 | 1 | 66.3 | 79.4 | 16 / 35 | 5096 |
| 5 | 1 | 68.5 | 84.4 | 18 / 35 | 5710 |
| 6 | 1 | 66.9 | 80.3 | 17 / 35 | 5109 |
| 7 | 1 | 66.2 | 78.7 | 15 / 35 | 5168 |
| 8 | 1 | 64.9 | 76.8 | 15 / 35 | 4561 |
| 9 | 1 | 65.7 | 76.5 | 16 / 35 | 5000 |
| 10 | 1 | 62.3 | 72.1 | 10 / 35 | 4195 |
| 11 | 1 | 66.6 | 81.6 | 11 / 35 | 5241 |
| 12 | 1 | 69.0 | 86.0 | 18 / 35 | 5775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 95 | 89% |
| mz.MicroGodMelee 1 | 84 | 42% |
| gh.micro.Gruweltje 0.7 | 55 | 31% |
| DBall.Anarchy 0.1 | 25 | 96% |
| mbro.Detektor3 0.1.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 89 | 37% | 137 |
| gh.micro.Gruweltje 0.7 | 76 | 32% | 104 |
| spinnercat.micro.Tyger 0.1 | 38 | 16% | 103 |
| fire219.CatBot 1.0 | 11 | 5% | 11 |
| acogdev.alpha 0.2 | 10 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 6 | 3% | 9 |
| el.JumpShoot 0.2 | 5 | 2% | 11 |
| DBall.Anarchy 0.1 | 3 | 1% | 22 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 8 |

## Melee bench: F08

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.3 | 186 / 420 | 3.76 | 15.6% | 57153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.5 | 15.6% | 186 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 14.4% | 80 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 10 |
| germ.TheMind .2 | 4.9 | 9.7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.6% | 7 |
| awesomeness.Elite 1.0 | 6.8 | 8.3% | 11 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 8 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 10 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 73.7 | 19 / 35 | 5115 |
| 2 | 1 | 65.5 | 73.7 | 18 / 35 | 4973 |
| 3 | 3 | 60.0 | 62.2 | 12 / 35 | 4128 |
| 4 | 3 | 60.2 | 61.6 | 13 / 35 | 4233 |
| 5 | 3 | 61.2 | 61.6 | 16 / 35 | 4483 |
| 6 | 1 | 63.0 | 67.6 | 14 / 35 | 4801 |
| 7 | 1 | 63.6 | 71.7 | 15 / 35 | 4335 |
| 8 | 1 | 62.2 | 66.3 | 12 / 35 | 4703 |
| 9 | 1 | 64.0 | 70.2 | 17 / 35 | 4694 |
| 10 | 1 | 66.0 | 76.2 | 17 / 35 | 5119 |
| 11 | 1 | 65.7 | 74.3 | 15 / 35 | 5422 |
| 12 | 1 | 65.2 | 72.4 | 18 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 140 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 38 | 68% |
| germ.TheMind .2 | 16 | 88% |
| qualidafial.MajorDick 1.0.1 | 14 | 100% |
| stelo.UntouchableNano 1.3 | 12 | 75% |
| sample.Crazy 1.0 | 10 | 90% |
| awesomeness.Elite 1.0 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |

Hadur died in 236 of 420 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 38% | 174 |
| simonton.nano.WeekendObsession_Melee 1.0 | 63 | 27% | 94 |
| stelo.UntouchableNano 1.3 | 21 | 9% | 29 |
| germ.TheMind .2 | 14 | 6% | 30 |
| lrem.micro.MoggFanatic 0.2 | 14 | 6% | 22 |
| awesomeness.Elite 1.0 | 11 | 5% | 26 |
| qualidafial.MajorDick 1.0.1 | 9 | 4% | 13 |
| mym.EdgeStalker 1.0 | 9 | 4% | 11 |
| sample.Crazy 1.0 | 5 | 2% | 19 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.9 | 281 / 420 | 2.18 | 19.2% | 55175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 19.2% | 281 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 38 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 28 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 16 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.5 | 8.6% | 10 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 8.1 | 8.0% | 21 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 26 / 35 | 4628 |
| 2 | 1 | 69.6 | 87.3 | 23 / 35 | 4614 |
| 3 | 1 | 70.3 | 89.2 | 25 / 35 | 4608 |
| 4 | 1 | 68.4 | 84.1 | 21 / 35 | 4793 |
| 5 | 1 | 68.8 | 84.1 | 23 / 35 | 4529 |
| 6 | 1 | 71.0 | 92.7 | 29 / 35 | 4415 |
| 7 | 1 | 69.9 | 86.3 | 22 / 35 | 5014 |
| 8 | 1 | 67.2 | 82.2 | 18 / 35 | 4189 |
| 9 | 1 | 70.1 | 88.9 | 25 / 35 | 4477 |
| 10 | 1 | 69.8 | 86.7 | 25 / 35 | 4821 |
| 11 | 1 | 69.0 | 86.3 | 23 / 35 | 4552 |
| 12 | 1 | 68.5 | 84.8 | 21 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 123 | 90% |
| nz.jdc.nano.GridFu 1.0 | 73 | 86% |
| stelo.PatternRobot 1.0 | 28 | 82% |
| timmit.nano.TimDog 0.33 | 28 | 82% |
| maribo.IotaCT 1.1 | 28 | 82% |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 100% |
| ratosh.Wesco 1.4 | 11 | 82% |
| spinnercat.Omen 1.0 | 10 | 100% |

Hadur died in 139 of 420 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 34 | 24% | 117 |
| timmit.nano.TimDog 0.33 | 28 | 20% | 52 |
| stelo.PatternRobot 1.0 | 23 | 17% | 50 |
| nz.jdc.nano.GridFu 1.0 | 22 | 16% | 93 |
| ratosh.Wesco 1.4 | 12 | 9% | 28 |
| maribo.IotaCT 1.1 | 10 | 7% | 40 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 17 |
| spinnercat.Omen 1.0 | 5 | 4% | 13 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.7 | 325 / 420 | 1.93 | 20.7% | 72668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 20.7% | 325 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 38 |
| baal.nano.N 1.42 | 3.0 | 11.1% | 8 |
| Grystrion.TrackerWO 1.0 | 4.1 | 10.3% | 14 |
| zyx.micro.Ant 1.1 | 5.3 | 9.4% | 18 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.5% | 1 |
| sanja.First 0.1 | 6.7 | 8.3% | 5 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 4 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 8 |
| sample.RamFire 1.0 | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.1 | 30 / 35 | 6700 |
| 2 | 1 | 70.0 | 87.0 | 27 / 35 | 6038 |
| 3 | 1 | 68.5 | 83.5 | 24 / 35 | 5591 |
| 4 | 1 | 68.6 | 84.4 | 24 / 35 | 5774 |
| 5 | 1 | 70.5 | 89.8 | 26 / 35 | 6139 |
| 6 | 1 | 70.1 | 88.9 | 26 / 35 | 5656 |
| 7 | 1 | 70.8 | 90.5 | 26 / 35 | 5991 |
| 8 | 1 | 72.7 | 96.5 | 32 / 35 | 6730 |
| 9 | 1 | 71.5 | 94.9 | 29 / 35 | 6140 |
| 10 | 1 | 70.8 | 90.5 | 26 / 35 | 6230 |
| 11 | 1 | 71.2 | 93.3 | 27 / 35 | 6244 |
| 12 | 1 | 69.0 | 85.7 | 28 / 35 | 5435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 80 | 84% |
| baal.nano.N 1.42 | 70 | 96% |
| cvt.Firsty 1.0 | 50 | 94% |
| amk.Punbot.Punbot 0.01 | 37 | 97% |
| zyx.micro.Ant 1.1 | 36 | 92% |
| Grystrion.TrackerWO 1.0 | 33 | 85% |
| sanja.First 0.1 | 33 | 97% |
| squidM.TentalceMeleeNano 1.1 | 14 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 96 of 420 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 23 | 24% | 106 |
| zyx.micro.Ant 1.1 | 16 | 17% | 75 |
| Grystrion.TrackerWO 1.0 | 12 | 13% | 40 |
| sample.RamFire 1.0 | 12 | 13% | 12 |
| baal.nano.N 1.42 | 10 | 10% | 57 |
| cvt.Firsty 1.0 | 8 | 8% | 40 |
| squidM.TentalceMeleeNano 1.1 | 7 | 7% | 26 |
| amk.Punbot.Punbot 0.01 | 5 | 5% | 16 |
| sanja.First 0.1 | 3 | 3% | 39 |

## Melee bench: F11

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 66.0 | 99 / 420 | 4.06 | 14.1% | 53262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.3% | 197 |
| hadur117.micro.SaorZ 0.1 | 2.3 | 14.1% | 99 |
| cs.Wren 1.0 | 2.8 | 12.7% | 30 |
| mz.Cork 0.1 | 4.3 | 11.0% | 23 |
| js.PinBall 1.6 | 4.5 | 11.2% | 33 |
| joe.ADinosaur 1.0 | 6.1 | 9.6% | 7 |
| evd.X1 0.01 | 6.9 | 8.1% | 9 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 8 |
| donjezza.Jezza 1.0 | 8.9 | 5.7% | 15 |
| PSW.Relentless 0.1 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 64.8 | 9 / 35 | 3845 |
| 2 | 2 | 61.6 | 67.9 | 10 / 35 | 4465 |
| 3 | 2 | 62.3 | 69.2 | 7 / 35 | 5003 |
| 4 | 2 | 62.6 | 68.9 | 7 / 35 | 4812 |
| 5 | 5 | 53.2 | 48.9 | 6 / 35 | 3574 |
| 6 | 1 | 62.4 | 70.2 | 8 / 35 | 4770 |
| 7 | 3 | 59.0 | 60.6 | 7 / 35 | 4285 |
| 8 | 2 | 66.7 | 83.8 | 12 / 35 | 5083 |
| 9 | 2 | 61.0 | 65.7 | 8 / 35 | 4514 |
| 10 | 2 | 60.2 | 65.4 | 7 / 35 | 4312 |
| 11 | 2 | 61.0 | 64.1 | 10 / 35 | 4529 |
| 12 | 2 | 59.4 | 62.9 | 8 / 35 | 4070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 139 | 33% |
| cs.Wren 1.0 | 30 | 87% |
| mz.Cork 0.1 | 13 | 92% |
| js.PinBall 1.6 | 8 | 75% |
| joe.ADinosaur 1.0 | 5 | 60% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| evd.X1 0.01 | 3 | 67% |

Hadur died in 323 of 420 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 157 | 49% | 199 |
| joe.ADinosaur 1.0 | 43 | 13% | 48 |
| cs.Wren 1.0 | 30 | 9% | 49 |
| js.PinBall 1.6 | 26 | 8% | 35 |
| mz.Cork 0.1 | 25 | 8% | 39 |
| evd.X1 0.01 | 25 | 8% | 29 |
| PSW.Relentless 0.1 | 9 | 3% | 9 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |
| donjezza.Jezza 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.6 | 242 / 420 | 2.84 | 17.8% | 54667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 17.8% | 242 |
| ntc.Opposite 1.5 | 2.8 | 11.7% | 19 |
| myl.nano.Graviton 1.10 | 3.2 | 11.3% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.5% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 20 |
| stelo.AreaTargetingBot 1.1 | 5.1 | 10.2% | 47 |
| disan.Chair 2.2.0 | 7.3 | 8.6% | 12 |
| DBall.NUKE 0.1 | 7.5 | 8.4% | 12 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 18 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.7 | 22 / 35 | 4373 |
| 2 | 1 | 66.4 | 81.3 | 17 / 35 | 4502 |
| 3 | 1 | 68.2 | 85.1 | 23 / 35 | 4653 |
| 4 | 1 | 64.5 | 72.7 | 16 / 35 | 4679 |
| 5 | 1 | 65.8 | 77.1 | 20 / 35 | 4447 |
| 6 | 1 | 68.0 | 83.8 | 24 / 35 | 4556 |
| 7 | 1 | 66.7 | 81.0 | 21 / 35 | 4595 |
| 8 | 1 | 62.4 | 66.3 | 15 / 35 | 4156 |
| 9 | 1 | 66.4 | 79.7 | 18 / 35 | 4392 |
| 10 | 1 | 66.7 | 79.0 | 22 / 35 | 4694 |
| 11 | 1 | 66.3 | 76.8 | 20 / 35 | 4764 |
| 12 | 1 | 68.5 | 85.4 | 24 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 67 | 93% |
| stelo.AreaTargetingBot 1.1 | 52 | 75% |
| ntc.Opposite 1.5 | 38 | 89% |
| DBall.NUKE 0.1 | 31 | 90% |
| donjezza.Muncho 1.0 | 27 | 81% |
| lrem.micro.SpikeSoldier 0.4 | 24 | 88% |
| disan.Chair 2.2.0 | 16 | 94% |
| pfvicm.Sobieski 7.2.3b | 14 | 79% |
| pbg.R2D2 1.0 | 10 | 100% |

Hadur died in 182 of 420 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 21% | 72 |
| pfvicm.Sobieski 7.2.3b | 38 | 21% | 57 |
| myl.nano.Graviton 1.10 | 33 | 18% | 86 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 12% | 50 |
| ntc.Opposite 1.5 | 19 | 10% | 49 |
| donjezza.Muncho 1.0 | 11 | 6% | 24 |
| DBall.NUKE 0.1 | 8 | 4% | 41 |
| disan.Chair 2.2.0 | 7 | 4% | 24 |
| pbg.R2D2 1.0 | 6 | 3% | 15 |

## Melee bench: F13

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 71.0 | 147 / 420 | 3.61 | 15.0% | 47238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.7 | 15.0% | 147 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 98 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.9% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.8% | 56 |
| yagami.Tidus 0.11 | 4.6 | 12.1% | 20 |
| ejb.Polaris 1.0.1 | 5.7 | 10.8% | 19 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 1 |
| kurios.DOSexe .9a | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.3 | 16 / 35 | 4164 |
| 2 | 1 | 65.7 | 78.7 | 19 / 35 | 3938 |
| 3 | 1 | 63.1 | 68.3 | 12 / 35 | 4357 |
| 4 | 1 | 62.4 | 67.3 | 10 / 35 | 4084 |
| 5 | 2 | 61.7 | 68.3 | 11 / 35 | 3856 |
| 6 | 2 | 61.8 | 68.9 | 9 / 35 | 3795 |
| 7 | 3 | 60.5 | 61.0 | 9 / 35 | 3942 |
| 8 | 2 | 62.6 | 70.5 | 11 / 35 | 3678 |
| 9 | 4 | 59.5 | 61.9 | 9 / 35 | 3519 |
| 10 | 1 | 64.9 | 77.5 | 12 / 35 | 4021 |
| 11 | 1 | 64.2 | 72.7 | 12 / 35 | 3998 |
| 12 | 1 | 65.4 | 76.8 | 17 / 35 | 3886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 63 | 43% |
| kawigi.micro.Shiz 1.1 | 54 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 77% |
| yagami.Tidus 0.11 | 32 | 94% |
| ejb.Polaris 1.0.1 | 10 | 70% |

Hadur died in 273 of 420 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 118 | 43% | 159 |
| yagami.Tidus 0.11 | 35 | 13% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 12% | 71 |
| ejb.Polaris 1.0.1 | 34 | 12% | 48 |
| kawigi.micro.Shiz 1.1 | 23 | 8% | 51 |
| step.nanoPri 1.0 | 11 | 4% | 12 |
| stelo.MirrorNano 1.3 | 11 | 4% | 12 |
| kurios.DOSexe .9a | 7 | 3% | 8 |

## Melee bench: F14

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.2 | 232 / 420 | 2.96 | 16.8% | 49201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 16.8% | 232 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 38 |
| wee.Gem 1.8.4 | 3.5 | 11.8% | 66 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 39 |
| ratosh.Nobo 0.21 | 4.1 | 11.3% | 11 |
| m3thos.Eva00 1.1 | 6.3 | 9.7% | 19 |
| bayen.UbaMicro 1.4 | 6.6 | 9.2% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 8.9 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.0 | 21 / 35 | 4599 |
| 2 | 1 | 66.7 | 85.1 | 20 / 35 | 4125 |
| 3 | 1 | 65.9 | 80.3 | 21 / 35 | 4022 |
| 4 | 1 | 63.2 | 72.1 | 15 / 35 | 3963 |
| 5 | 1 | 64.6 | 75.6 | 19 / 35 | 4160 |
| 6 | 1 | 63.9 | 74.3 | 19 / 35 | 3878 |
| 7 | 1 | 66.8 | 82.5 | 21 / 35 | 4255 |
| 8 | 1 | 64.6 | 75.9 | 19 / 35 | 3875 |
| 9 | 1 | 66.0 | 85.4 | 21 / 35 | 3715 |
| 10 | 1 | 66.7 | 81.6 | 21 / 35 | 4277 |
| 11 | 1 | 66.0 | 78.1 | 19 / 35 | 4448 |
| 12 | 1 | 61.9 | 67.3 | 16 / 35 | 3884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 87 | 87% |
| wee.Gem 1.8.4 | 60 | 77% |
| wompi.Quokka 1.6 | 55 | 76% |
| ratosh.Nobo 0.21 | 31 | 94% |
| m3thos.Eva00 1.1 | 24 | 83% |
| bayen.UbaMicro 1.4 | 17 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |

Hadur died in 189 of 420 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 33 | 17% | 73 |
| bzdp.Pansy 2.1 | 31 | 16% | 102 |
| wompi.Quokka 1.6 | 29 | 15% | 58 |
| maribo.FollowFire 1 | 23 | 12% | 25 |
| bayen.UbaMicro 1.4 | 17 | 9% | 34 |
| jeremyreeder.Vincent 2011.12.09 | 16 | 8% | 21 |
| ratosh.Nobo 0.21 | 14 | 7% | 50 |
| m3thos.Eva00 1.1 | 14 | 7% | 35 |
| stelo.MyAgileRobot 0.2 | 12 | 6% | 16 |

## Melee bench: F15

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 81.6 | 111 / 420 | 2.66 | 18.3% | 78747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 19.9% | 261 |
| hadur117.micro.SaorZ 0.1 | 1.9 | 18.3% | 111 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 34 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.6% | 7 |
| stuff.Vlad 0.1 | 5.6 | 8.7% | 2 |
| stelo.PianistNano 1.2 | 6.9 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 84.8 | 10 / 35 | 6327 |
| 2 | 2 | 68.9 | 82.9 | 12 / 35 | 6069 |
| 3 | 2 | 69.0 | 83.5 | 8 / 35 | 6582 |
| 4 | 2 | 67.1 | 75.2 | 8 / 35 | 6088 |
| 5 | 2 | 70.4 | 81.0 | 13 / 35 | 7268 |
| 6 | 2 | 70.1 | 85.1 | 7 / 35 | 6972 |
| 7 | 2 | 69.4 | 79.7 | 10 / 35 | 7354 |
| 8 | 2 | 67.2 | 76.8 | 4 / 35 | 6290 |
| 9 | 1 | 71.3 | 89.8 | 9 / 35 | 7067 |
| 10 | 2 | 68.4 | 79.0 | 10 / 35 | 6125 |
| 11 | 2 | 67.4 | 78.4 | 8 / 35 | 5935 |
| 12 | 2 | 70.1 | 82.9 | 12 / 35 | 6670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 221 | 23% |
| mz.NanoGod 2.02 | 39 | 62% |
| exauge.GateKeeper 1.1.121g | 15 | 87% |
| ayk.WallHugger 1.0 | 10 | 90% |
| stelo.PianistNano 1.2 | 7 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 310 of 420 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 212 | 68% | 271 |
| mz.NanoGod 2.02 | 55 | 18% | 81 |
| exauge.GateKeeper 1.1.121g | 18 | 6% | 23 |
| ayk.WallHugger 1.0 | 11 | 4% | 21 |
| stuff.Vlad 0.1 | 7 | 2% | 12 |
| stelo.PianistNano 1.2 | 5 | 2% | 6 |
| drd.Dreadknoght 0.9 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.8 | 228 / 420 | 3.27 | 16.7% | 54233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.1 | 16.7% | 228 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 12.9% | 45 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 43 |
| bvh.micro.Freya 0.3 | 4.1 | 11.0% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.0% | 34 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.4% | 17 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 2 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 18 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.8 | 22 / 35 | 5041 |
| 2 | 1 | 65.2 | 77.1 | 18 / 35 | 4358 |
| 3 | 1 | 61.1 | 62.9 | 14 / 35 | 4297 |
| 4 | 1 | 67.7 | 85.4 | 25 / 35 | 4355 |
| 5 | 1 | 68.5 | 85.7 | 24 / 35 | 4936 |
| 6 | 1 | 64.1 | 72.1 | 15 / 35 | 4649 |
| 7 | 1 | 66.9 | 81.3 | 23 / 35 | 4589 |
| 8 | 1 | 65.2 | 74.0 | 20 / 35 | 4878 |
| 9 | 2 | 59.6 | 60.0 | 13 / 35 | 3990 |
| 10 | 1 | 64.3 | 73.7 | 20 / 35 | 4215 |
| 11 | 1 | 65.4 | 76.5 | 19 / 35 | 4609 |
| 12 | 1 | 63.5 | 71.4 | 15 / 35 | 4316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 87 | 93% |
| dummy.micro.Sparrow 2.5 | 48 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 47 | 81% |
| bvh.micro.Freya 0.3 | 39 | 92% |
| ap.Frederick 1.1 | 17 | 94% |
| stelo.MirrorMicro 1.0 | 11 | 64% |
| conscience.Electron 1.3g | 5 | 80% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 192 of 420 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 35 | 18% | 81 |
| davidalves.net.DuelistMicroMelee 1.4 | 33 | 17% | 78 |
| mn.nano.perceptual.Impact 1.3.0 | 31 | 16% | 30 |
| voidious.micro.BlitzBat 1.05 | 28 | 15% | 94 |
| conscience.Electron 1.3g | 26 | 14% | 34 |
| dl.BetterWalls 1.0 | 17 | 9% | 33 |
| bvh.micro.Freya 0.3 | 14 | 7% | 41 |
| stelo.MirrorMicro 1.0 | 7 | 4% | 27 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.3 | 281 / 420 | 2.23 | 20.4% | 76932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.0 | 20.4% | 281 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 48 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 24 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.7% | 18 |
| mme.NikeEnhanced 2.0 | 5.1 | 9.5% | 9 |
| dsw.StaticD 1.0 | 5.6 | 9.0% | 16 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.0% | 5 |
| sample.Corners 1.0 | 9.6 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.4 | 24 / 35 | 6091 |
| 2 | 1 | 71.3 | 88.3 | 25 / 35 | 6663 |
| 3 | 1 | 71.9 | 90.2 | 28 / 35 | 6832 |
| 4 | 1 | 68.7 | 80.3 | 20 / 35 | 6099 |
| 5 | 1 | 69.0 | 84.4 | 22 / 35 | 5667 |
| 6 | 1 | 69.3 | 81.6 | 20 / 35 | 6552 |
| 7 | 1 | 71.1 | 91.1 | 24 / 35 | 6174 |
| 8 | 1 | 71.8 | 90.2 | 26 / 35 | 6971 |
| 9 | 1 | 69.4 | 85.4 | 23 / 35 | 5999 |
| 10 | 1 | 71.1 | 85.7 | 23 / 35 | 6796 |
| 11 | 1 | 71.7 | 91.4 | 25 / 35 | 6625 |
| 12 | 1 | 69.5 | 81.9 | 21 / 35 | 6463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 89 | 83% |
| sul.Lunar 1.1 | 88 | 97% |
| supersample.SuperBoxBot 1.0 | 56 | 89% |
| dsw.StaticD 1.0 | 25 | 56% |
| sample.MyFirstRobot 1.0 | 17 | 71% |
| mme.NikeEnhanced 2.0 | 16 | 81% |
| sample.MyFirstJuniorRobot 1.0 | 14 | 100% |
| sample.Corners 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 9 | 100% |

Hadur died in 139 of 420 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 42 | 30% | 130 |
| dsw.StaticD 1.0 | 32 | 23% | 56 |
| supersample.SuperBoxBot 1.0 | 27 | 19% | 65 |
| mme.NikeEnhanced 2.0 | 13 | 9% | 29 |
| sul.Lunar 1.1 | 10 | 7% | 90 |
| sample.MyFirstRobot 1.0 | 10 | 7% | 17 |
| sample.Corners 1.0 | 3 | 2% | 12 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 14 |

## Melee bench: F18

hadur117.micro.SaorZ 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.4 | 208 / 420 | 3.21 | 17.0% | 66461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorZ 0.1 | 1.1 | 17.0% | 208 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 79 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 11.5% | 44 |
| amz.NanoClone 1.41 | 5.1 | 10.5% | 22 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.3% | 18 |
| sample.Walls 1.0 | 7.1 | 8.4% | 12 |
| GarmBox.Oranges 1.0 | 7.9 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.9 | 5.9% | 5 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 22 / 35 | 5671 |
| 2 | 1 | 65.4 | 73.0 | 15 / 35 | 5683 |
| 3 | 1 | 67.6 | 78.7 | 23 / 35 | 5634 |
| 4 | 1 | 67.1 | 77.8 | 22 / 35 | 5775 |
| 5 | 1 | 66.3 | 76.5 | 18 / 35 | 5585 |
| 6 | 1 | 64.4 | 73.7 | 13 / 35 | 5318 |
| 7 | 1 | 66.2 | 77.1 | 16 / 35 | 5780 |
| 8 | 2 | 63.1 | 66.7 | 15 / 35 | 5147 |
| 9 | 1 | 65.7 | 75.9 | 16 / 35 | 5464 |
| 10 | 1 | 64.2 | 71.1 | 14 / 35 | 5375 |
| 11 | 1 | 64.9 | 73.3 | 16 / 35 | 5144 |
| 12 | 1 | 66.5 | 75.2 | 18 / 35 | 5885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 89 | 92% |
| radnor.DoctorBob 1.42 | 60 | 63% |
| amz.NanoClone 1.41 | 27 | 78% |
| mld.Wisdom 1.0 | 24 | 83% |
| KiraNL.Chupacabra 0.4 | 18 | 83% |
| sample.Walls 1.0 | 11 | 100% |
| jangs.ns51 1.0 | 10 | 90% |
| GarmBox.Oranges 1.0 | 8 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 213 of 420 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 63 | 30% | 107 |
| mld.Wisdom 1.0 | 44 | 21% | 70 |
| KiraNL.Chupacabra 0.4 | 34 | 16% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 13% | 108 |
| amz.NanoClone 1.41 | 20 | 9% | 33 |
| sample.Walls 1.0 | 14 | 7% | 28 |
| jangs.ns51 1.0 | 7 | 3% | 12 |
| GarmBox.Oranges 1.0 | 4 | 2% | 8 |

