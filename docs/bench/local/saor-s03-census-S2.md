# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 90.5 | 333 / 420 | 1.86 | 21.9% | 86262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 21.9% | 333 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 32 |
| mz.AntiGrav 1.0 | 2.8 | 13.9% | 22 |
| mld.Infinity 2.2 | 3.6 | 12.8% | 24 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 6 |
| sample.Walls 1.0 | 6.2 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.6 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.1 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.3 | 28 / 35 | 7112 |
| 2 | 1 | 72.9 | 93.0 | 29 / 35 | 7071 |
| 3 | 1 | 72.1 | 86.0 | 24 / 35 | 7038 |
| 4 | 1 | 72.7 | 91.4 | 26 / 35 | 7017 |
| 5 | 1 | 73.0 | 91.7 | 30 / 35 | 7028 |
| 6 | 1 | 73.4 | 93.3 | 29 / 35 | 7190 |
| 7 | 1 | 72.4 | 85.4 | 26 / 35 | 7340 |
| 8 | 1 | 73.3 | 91.4 | 29 / 35 | 7184 |
| 9 | 1 | 73.2 | 91.1 | 31 / 35 | 7163 |
| 10 | 1 | 72.7 | 90.8 | 29 / 35 | 7049 |
| 11 | 1 | 72.9 | 88.3 | 26 / 35 | 7287 |
| 12 | 1 | 73.0 | 89.8 | 26 / 35 | 7783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 145 | 98% |
| mld.Infinity 2.2 | 96 | 98% |
| radnor.DoctorBob 1.42 | 77 | 88% |
| amz.NanoClone 1.41 | 8 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 88 of 420 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 45% | 168 |
| mz.AntiGrav 1.0 | 14 | 16% | 128 |
| amz.NanoClone 1.41 | 14 | 16% | 30 |
| mld.Infinity 2.2 | 8 | 9% | 32 |
| sample.Walls 1.0 | 7 | 8% | 29 |
| GarmBox.Oranges 1.0 | 3 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 2% | 12 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.2 | 227 / 420 | 3.14 | 17.2% | 59412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.3 | 17.2% | 227 |
| oog.melee.Mercutio 1.0 | 1.9 | 15.0% | 119 |
| mld.DustBunny 3.8 | 2.9 | 13.3% | 30 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 14 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.4% | 14 |
| bzdp.BoxCar 2.0 | 7.8 | 7.6% | 3 |
| fullsail.SweetTea 1.1 | 8.0 | 7.4% | 8 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 24 / 35 | 4847 |
| 2 | 1 | 68.0 | 88.6 | 20 / 35 | 4708 |
| 3 | 1 | 69.3 | 90.2 | 25 / 35 | 5171 |
| 4 | 1 | 69.6 | 90.5 | 26 / 35 | 5310 |
| 5 | 1 | 66.1 | 70.2 | 16 / 35 | 5595 |
| 6 | 1 | 61.5 | 56.8 | 13 / 35 | 4840 |
| 7 | 3 | 59.0 | 52.7 | 9 / 35 | 4706 |
| 8 | 1 | 68.6 | 85.4 | 25 / 35 | 5098 |
| 9 | 1 | 66.5 | 80.3 | 19 / 35 | 4543 |
| 10 | 1 | 68.2 | 87.6 | 24 / 35 | 4381 |
| 11 | 2 | 61.4 | 58.7 | 12 / 35 | 5008 |
| 12 | 1 | 64.5 | 66.3 | 14 / 35 | 5205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 143 | 69% |
| mld.DustBunny 3.8 | 76 | 87% |
| djdjdj.NanoSkunk10 1.0 | 25 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 86% |
| maribo.melee.BMV 0.1 | 13 | 100% |
| fullsail.SweetTea 1.1 | 11 | 82% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 193 of 420 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 33% | 160 |
| mld.DustBunny 3.8 | 35 | 18% | 94 |
| cs.Grudge 1.0 | 30 | 16% | 31 |
| zyx.nano.Ant 1.1 | 21 | 11% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 5% | 22 |
| maribo.melee.BMV 0.1 | 10 | 5% | 20 |
| fullsail.SweetTea 1.1 | 10 | 5% | 19 |
| bzdp.BoxCar 2.0 | 9 | 5% | 13 |
| djdjdj.NanoSkunk10 1.0 | 5 | 3% | 34 |

## Melee bench: F03

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.2 | 307 / 420 | 2.24 | 20.4% | 73346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 20.4% | 307 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 48 |
| myl.nano.KomoriNinja 1.1 | 2.9 | 12.1% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.7% | 24 |
| fm.mammillarias 1.3 | 5.3 | 9.2% | 6 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.0% | 11 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 5 |
| sample.Fire 1.0 | 9.1 | 5.4% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 79.4 | 24 / 35 | 5902 |
| 2 | 1 | 70.8 | 88.3 | 24 / 35 | 5999 |
| 3 | 1 | 70.5 | 85.4 | 26 / 35 | 6258 |
| 4 | 1 | 71.7 | 91.4 | 29 / 35 | 5777 |
| 5 | 1 | 69.2 | 79.4 | 23 / 35 | 6504 |
| 6 | 1 | 72.8 | 95.2 | 31 / 35 | 6362 |
| 7 | 1 | 69.8 | 82.5 | 23 / 35 | 6012 |
| 8 | 1 | 68.7 | 80.6 | 23 / 35 | 5908 |
| 9 | 1 | 70.9 | 86.3 | 27 / 35 | 6227 |
| 10 | 1 | 70.8 | 87.9 | 26 / 35 | 6080 |
| 11 | 1 | 71.0 | 88.9 | 27 / 35 | 6214 |
| 12 | 1 | 70.8 | 89.2 | 24 / 35 | 6103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 108 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 77 | 95% |
| myl.nano.KomoriNinja 1.1 | 48 | 92% |
| cb.nano.Insomnia 1.0 | 37 | 92% |
| sp.Nanos.Ember 1.1 | 27 | 100% |
| fm.mammillarias 1.3 | 19 | 89% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 114 of 420 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 19% | 79 |
| myl.micro.Troodon 1.10 | 20 | 18% | 132 |
| myl.nano.KomoriNinja 1.1 | 17 | 15% | 77 |
| fm.mammillarias 1.3 | 16 | 14% | 38 |
| cb.nano.Insomnia 1.0 | 13 | 11% | 18 |
| sample.Fire 1.0 | 11 | 10% | 21 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 18 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 28 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.7 | 317 / 420 | 2.01 | 21.1% | 79669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 21.1% | 317 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 28 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.4% | 22 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.0% | 16 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 1 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.8% | 11 |
| repositorio.NanoStep 1.0 | 8.9 | 6.2% | 3 |
| sample.VelociRobot 1.0 | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.2 | 27 / 35 | 6654 |
| 2 | 1 | 71.7 | 91.7 | 28 / 35 | 6467 |
| 3 | 1 | 68.6 | 81.3 | 24 / 35 | 5857 |
| 4 | 1 | 71.4 | 88.6 | 28 / 35 | 6859 |
| 5 | 1 | 71.1 | 88.3 | 24 / 35 | 6707 |
| 6 | 1 | 72.5 | 93.7 | 30 / 35 | 6932 |
| 7 | 1 | 71.5 | 91.7 | 27 / 35 | 6610 |
| 8 | 1 | 70.3 | 82.9 | 25 / 35 | 6898 |
| 9 | 1 | 73.2 | 95.2 | 31 / 35 | 6968 |
| 10 | 1 | 69.8 | 85.7 | 24 / 35 | 6293 |
| 11 | 1 | 70.9 | 87.9 | 26 / 35 | 6590 |
| 12 | 1 | 70.9 | 87.6 | 23 / 35 | 6834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 149 | 91% |
| stelo.SoJNanoMelee 1.1 | 73 | 96% |
| tj.zombie1n 1.0.1 | 33 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 30 | 80% |
| tvv.micro.Antares 1.1.1 | 27 | 85% |
| yk.JahMicro 1.0 | 14 | 86% |
| repositorio.NanoStep 1.0 | 9 | 89% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 7 | 100% |

Hadur died in 104 of 420 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 43 | 41% | 195 |
| stelo.SoJNanoMelee 1.1 | 14 | 13% | 60 |
| yk.JahMicro 1.0 | 11 | 11% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 9% | 42 |
| tvv.micro.Antares 1.1.1 | 8 | 8% | 35 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 8% | 23 |
| tj.zombie1n 1.0.1 | 6 | 6% | 12 |
| sample.VelociRobot 1.0 | 3 | 3% | 10 |
| repositorio.NanoStep 1.0 | 1 | 1% | 12 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.2 | 209 / 420 | 3.41 | 16.6% | 59292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 16.6% | 209 |
| oog.melee.Corsair 1.0 | 2.6 | 12.6% | 64 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 56 |
| simonton.nano.MeleeSeed 1.8 | 4.1 | 10.9% | 37 |
| EBBU.Sim2 1.02 | 5.4 | 9.7% | 14 |
| sam.Samspin 1.0 | 6.1 | 9.4% | 17 |
| zyx.nano.BacillusComma 1.0 | 6.4 | 9.0% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7.4 | 8.6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 69.2 | 18 / 35 | 4798 |
| 2 | 1 | 63.6 | 71.1 | 17 / 35 | 4569 |
| 3 | 1 | 64.4 | 73.0 | 19 / 35 | 4756 |
| 4 | 1 | 65.6 | 77.1 | 18 / 35 | 4871 |
| 5 | 1 | 65.9 | 76.8 | 18 / 35 | 5111 |
| 6 | 1 | 62.8 | 64.8 | 13 / 35 | 4839 |
| 7 | 1 | 66.4 | 76.2 | 16 / 35 | 5450 |
| 8 | 1 | 67.2 | 83.2 | 19 / 35 | 5246 |
| 9 | 1 | 65.3 | 72.4 | 19 / 35 | 5076 |
| 10 | 1 | 65.4 | 73.7 | 18 / 35 | 5074 |
| 11 | 1 | 64.2 | 70.2 | 17 / 35 | 4894 |
| 12 | 1 | 64.0 | 71.1 | 17 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 71 | 96% |
| oog.melee.Corsair 1.0 | 65 | 58% |
| ahf.NanoAndrew .4 | 59 | 86% |
| EBBU.Sim2 1.02 | 17 | 94% |
| sam.Samspin 1.0 | 15 | 100% |
| zyx.nano.BacillusComma 1.0 | 10 | 90% |
| robar.nano.Assertive_Melee 0.2 | 9 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 212 of 420 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 45 | 21% | 93 |
| simonton.nano.MeleeSeed 1.8 | 29 | 14% | 81 |
| robar.nano.Assertive_Melee 0.2 | 27 | 13% | 35 |
| ahf.NanoAndrew .4 | 26 | 12% | 83 |
| EBBU.Sim2 1.02 | 23 | 11% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 11% | 24 |
| zyx.nano.BacillusComma 1.0 | 20 | 9% | 31 |
| sam.Samspin 1.0 | 10 | 5% | 24 |
| sample.TrackFire 1.0 | 9 | 4% | 13 |

## Melee bench: F06

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.6 | 303 / 420 | 2.03 | 19.8% | 64586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 19.8% | 303 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.2% | 39 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.6% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.4 | 9.9% | 35 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.4% | 8 |
| fm.claire 1.7 | 6.0 | 8.6% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 6 |
| pa.Improved 1.0 | 9.1 | 6.2% | 4 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.5 | 27 / 35 | 5674 |
| 2 | 1 | 68.8 | 88.9 | 23 / 35 | 4743 |
| 3 | 1 | 70.5 | 90.5 | 27 / 35 | 5659 |
| 4 | 1 | 70.4 | 93.3 | 25 / 35 | 5512 |
| 5 | 1 | 67.0 | 79.7 | 24 / 35 | 4976 |
| 6 | 1 | 70.0 | 89.8 | 25 / 35 | 5781 |
| 7 | 1 | 70.2 | 90.2 | 27 / 35 | 5495 |
| 8 | 1 | 69.1 | 88.6 | 25 / 35 | 5048 |
| 9 | 1 | 70.3 | 92.7 | 27 / 35 | 5607 |
| 10 | 1 | 68.9 | 86.0 | 24 / 35 | 5524 |
| 11 | 1 | 69.2 | 87.0 | 25 / 35 | 5193 |
| 12 | 1 | 69.1 | 86.0 | 24 / 35 | 5374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 145 | 90% |
| oog.melee.CapuletDroid 1.1 | 81 | 84% |
| gh.nano.Grofvuil 0.2 | 36 | 97% |
| arthord.NanoSatanMelee Beta | 35 | 94% |
| sample.SpinBot 1.0 | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 12 | 75% |
| pa.Improved 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 5 | 80% |

Hadur died in 121 of 420 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 24% | 153 |
| oog.melee.CapuletDroid 1.1 | 27 | 22% | 37 |
| gh.nano.Grofvuil 0.2 | 13 | 11% | 78 |
| arthord.NanoSatanMelee Beta | 11 | 9% | 41 |
| sample.SpinBot 1.0 | 10 | 8% | 23 |
| winamp32.micro.MicroMacro 1.0 | 9 | 7% | 27 |
| fm.claire 1.7 | 9 | 7% | 23 |
| kurios.DOSexe .9b | 7 | 6% | 23 |
| pa.Improved 1.0 | 4 | 3% | 12 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.7 | 217 / 420 | 2.47 | 18.5% | 67768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.5% | 217 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 85 |
| mz.MicroGodMelee 1 | 3.3 | 12.9% | 72 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.0% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 9 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.7% | 1 |
| acogdev.alpha 0.2 | 7.9 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.4 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.1 | 18 / 35 | 5450 |
| 2 | 1 | 69.4 | 85.1 | 20 / 35 | 6139 |
| 3 | 1 | 66.1 | 79.7 | 16 / 35 | 5148 |
| 4 | 1 | 66.3 | 78.7 | 17 / 35 | 5110 |
| 5 | 1 | 69.4 | 86.7 | 21 / 35 | 5766 |
| 6 | 1 | 67.8 | 83.2 | 19 / 35 | 5456 |
| 7 | 1 | 70.2 | 90.8 | 23 / 35 | 5912 |
| 8 | 1 | 68.2 | 84.4 | 20 / 35 | 5529 |
| 9 | 1 | 68.7 | 85.4 | 15 / 35 | 5951 |
| 10 | 1 | 66.7 | 81.0 | 14 / 35 | 5456 |
| 11 | 1 | 68.0 | 81.0 | 14 / 35 | 6144 |
| 12 | 1 | 68.4 | 84.1 | 20 / 35 | 5707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 106 | 90% |
| mz.MicroGodMelee 1 | 92 | 49% |
| gh.micro.Gruweltje 0.7 | 63 | 30% |
| DBall.Anarchy 0.1 | 31 | 100% |
| el.JumpShoot 0.2 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 100% |
| acogdev.alpha 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |

Hadur died in 205 of 420 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 75 | 37% | 133 |
| gh.micro.Gruweltje 0.7 | 65 | 32% | 98 |
| spinnercat.micro.Tyger 0.1 | 24 | 12% | 102 |
| caimano.Furia_Ceca 0.22 | 11 | 5% | 18 |
| fire219.CatBot 1.0 | 9 | 4% | 10 |
| acogdev.alpha 0.2 | 8 | 4% | 12 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 12 |
| DBall.Anarchy 0.1 | 4 | 2% | 25 |
| el.JumpShoot 0.2 | 2 | 1% | 8 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 69.9 | 211 / 420 | 3.71 | 16.4% | 62974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.3 | 16.4% | 211 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.1% | 72 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 65 |
| qualidafial.MajorDick 1.0.1 | 4.9 | 9.5% | 10 |
| germ.TheMind .2 | 5.1 | 9.4% | 15 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 19 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.6% | 7 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 12 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.2 | 19 / 35 | 4859 |
| 2 | 1 | 64.0 | 67.0 | 17 / 35 | 5190 |
| 3 | 1 | 65.8 | 71.4 | 21 / 35 | 5558 |
| 4 | 2 | 61.6 | 57.1 | 15 / 35 | 5490 |
| 5 | 1 | 62.7 | 65.1 | 15 / 35 | 4891 |
| 6 | 2 | 63.3 | 67.3 | 14 / 35 | 4999 |
| 7 | 2 | 65.7 | 69.8 | 19 / 35 | 5393 |
| 8 | 1 | 66.5 | 77.5 | 18 / 35 | 5389 |
| 9 | 1 | 65.5 | 72.1 | 16 / 35 | 5505 |
| 10 | 1 | 65.4 | 70.8 | 19 / 35 | 5303 |
| 11 | 1 | 66.0 | 75.2 | 19 / 35 | 5373 |
| 12 | 2 | 64.9 | 70.5 | 19 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 156 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 80% |
| germ.TheMind .2 | 19 | 95% |
| qualidafial.MajorDick 1.0.1 | 13 | 92% |
| awesomeness.Elite 1.0 | 12 | 83% |
| stelo.UntouchableNano 1.3 | 11 | 91% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 209 of 420 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 107 | 51% | 226 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 13% | 55 |
| awesomeness.Elite 1.0 | 16 | 8% | 24 |
| germ.TheMind .2 | 15 | 7% | 31 |
| qualidafial.MajorDick 1.0.1 | 15 | 7% | 23 |
| lrem.micro.MoggFanatic 0.2 | 12 | 6% | 22 |
| stelo.UntouchableNano 1.3 | 11 | 5% | 21 |
| mym.EdgeStalker 1.0 | 4 | 2% | 7 |
| sample.Crazy 1.0 | 1 | 0% | 9 |

## Melee bench: F09

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.1 | 338 / 420 | 1.80 | 20.6% | 61235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 20.6% | 338 |
| rz.HawkOnFire 0.1 | 2.2 | 13.1% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.7% | 14 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 2 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 11 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 6 |
| stelo.PatternRobot 1.0 | 8.0 | 7.8% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 24 / 35 | 4847 |
| 2 | 1 | 72.1 | 93.7 | 28 / 35 | 5557 |
| 3 | 1 | 71.9 | 93.3 | 32 / 35 | 4964 |
| 4 | 1 | 69.3 | 86.0 | 26 / 35 | 4655 |
| 5 | 1 | 70.6 | 89.5 | 25 / 35 | 5213 |
| 6 | 1 | 71.5 | 93.7 | 31 / 35 | 5152 |
| 7 | 1 | 71.4 | 91.7 | 29 / 35 | 5131 |
| 8 | 1 | 71.0 | 91.7 | 29 / 35 | 5236 |
| 9 | 1 | 68.9 | 83.8 | 24 / 35 | 4789 |
| 10 | 1 | 71.5 | 92.1 | 31 / 35 | 5253 |
| 11 | 1 | 72.3 | 93.0 | 29 / 35 | 5336 |
| 12 | 1 | 71.7 | 93.0 | 30 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 137 | 98% |
| nz.jdc.nano.GridFu 1.0 | 85 | 96% |
| stelo.PatternRobot 1.0 | 33 | 100% |
| timmit.nano.TimDog 0.33 | 30 | 93% |
| maribo.IotaCT 1.1 | 27 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 95% |
| ratosh.Wesco 1.4 | 13 | 85% |
| spinnercat.Omen 1.0 | 10 | 100% |

Hadur died in 82 of 420 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 17 | 21% | 56 |
| nz.jdc.nano.GridFu 1.0 | 14 | 17% | 102 |
| maribo.IotaCT 1.1 | 13 | 16% | 52 |
| rz.HawkOnFire 0.1 | 11 | 13% | 111 |
| stelo.PatternRobot 1.0 | 10 | 12% | 32 |
| ratosh.Wesco 1.4 | 9 | 11% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 7% | 20 |
| spinnercat.Omen 1.0 | 2 | 2% | 9 |

## Melee bench: F10

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.1 | 360 / 420 | 1.62 | 21.7% | 76164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 21.7% | 360 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.0% | 19 |
| baal.nano.N 1.42 | 3.3 | 11.3% | 6 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 3 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.2% | 3 |
| sanja.First 0.1 | 6.5 | 8.4% | 4 |
| cvt.Firsty 1.0 | 7.7 | 7.5% | 13 |
| amk.Punbot.Punbot 0.01 | 8.1 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.5 | 30 / 35 | 6003 |
| 2 | 1 | 72.1 | 93.3 | 31 / 35 | 6524 |
| 3 | 1 | 71.9 | 93.3 | 30 / 35 | 6350 |
| 4 | 1 | 72.3 | 96.8 | 33 / 35 | 6278 |
| 5 | 1 | 72.5 | 93.7 | 28 / 35 | 6779 |
| 6 | 1 | 69.3 | 85.1 | 24 / 35 | 5935 |
| 7 | 1 | 70.2 | 88.6 | 29 / 35 | 5987 |
| 8 | 1 | 72.3 | 94.0 | 31 / 35 | 6760 |
| 9 | 1 | 72.7 | 97.1 | 31 / 35 | 6696 |
| 10 | 1 | 72.8 | 98.7 | 32 / 35 | 6423 |
| 11 | 1 | 71.2 | 91.1 | 30 / 35 | 6219 |
| 12 | 1 | 72.0 | 94.9 | 31 / 35 | 6210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 78 | 97% |
| baal.nano.N 1.42 | 74 | 99% |
| cvt.Firsty 1.0 | 67 | 90% |
| sanja.First 0.1 | 47 | 96% |
| zyx.micro.Ant 1.1 | 34 | 91% |
| Grystrion.TrackerWO 1.0 | 32 | 97% |
| amk.Punbot.Punbot 0.01 | 28 | 100% |
| squidM.TentalceMeleeNano 1.1 | 13 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 61 of 420 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 16 | 26% | 73 |
| cvt.Firsty 1.0 | 10 | 16% | 51 |
| tvv.nano.Polaris 1.2 | 9 | 15% | 112 |
| sanja.First 0.1 | 7 | 11% | 45 |
| Grystrion.TrackerWO 1.0 | 5 | 8% | 35 |
| sample.RamFire 1.0 | 5 | 8% | 7 |
| baal.nano.N 1.42 | 4 | 7% | 56 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 19 |

## Melee bench: F11

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 68.8 | 157 / 420 | 3.81 | 15.2% | 58540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.4% | 146 |
| hadur117.micro.SaorS2 0.1 | 1.7 | 15.2% | 157 |
| cs.Wren 1.0 | 3.4 | 12.2% | 35 |
| js.PinBall 1.6 | 4.2 | 11.4% | 25 |
| mz.Cork 0.1 | 4.3 | 11.0% | 29 |
| joe.ADinosaur 1.0 | 6.3 | 8.9% | 5 |
| evd.X1 0.01 | 6.8 | 8.4% | 7 |
| jsal.Jsalbot 1.0 | 8.1 | 6.9% | 8 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 8 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 67.6 | 11 / 35 | 4949 |
| 2 | 1 | 65.6 | 75.2 | 18 / 35 | 5136 |
| 3 | 2 | 60.5 | 59.7 | 12 / 35 | 5003 |
| 4 | 1 | 65.0 | 76.2 | 15 / 35 | 5131 |
| 5 | 2 | 62.1 | 67.3 | 12 / 35 | 4571 |
| 6 | 1 | 64.2 | 71.1 | 13 / 35 | 5405 |
| 7 | 2 | 60.9 | 66.0 | 12 / 35 | 4377 |
| 8 | 2 | 63.5 | 70.5 | 13 / 35 | 5000 |
| 9 | 1 | 64.0 | 71.7 | 18 / 35 | 4776 |
| 10 | 3 | 57.7 | 56.2 | 9 / 35 | 4354 |
| 11 | 1 | 63.8 | 71.7 | 12 / 35 | 4828 |
| 12 | 2 | 63.8 | 72.4 | 12 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 135 | 54% |
| cs.Wren 1.0 | 34 | 94% |
| js.PinBall 1.6 | 23 | 78% |
| mz.Cork 0.1 | 21 | 76% |
| jsal.Jsalbot 1.0 | 7 | 57% |
| joe.ADinosaur 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 263 of 420 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 123 | 47% | 214 |
| joe.ADinosaur 1.0 | 28 | 11% | 35 |
| js.PinBall 1.6 | 26 | 10% | 46 |
| mz.Cork 0.1 | 24 | 9% | 37 |
| cs.Wren 1.0 | 20 | 8% | 36 |
| evd.X1 0.01 | 19 | 7% | 19 |
| PSW.Relentless 0.1 | 18 | 7% | 20 |
| jsal.Jsalbot 1.0 | 4 | 2% | 9 |
| donjezza.Jezza 1.0 | 1 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.7 | 266 / 420 | 2.56 | 18.8% | 59244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.8% | 266 |
| myl.nano.Graviton 1.10 | 2.9 | 11.6% | 51 |
| ntc.Opposite 1.5 | 3.1 | 11.4% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.5% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.9 | 10.2% | 32 |
| pfvicm.Sobieski 7.2.3b | 5.4 | 9.6% | 6 |
| DBall.NUKE 0.1 | 6.9 | 8.3% | 13 |
| disan.Chair 2.2.0 | 7.6 | 7.9% | 12 |
| donjezza.Muncho 1.0 | 9.0 | 6.4% | 18 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.6 | 21 / 35 | 4828 |
| 2 | 1 | 69.5 | 87.9 | 25 / 35 | 5117 |
| 3 | 1 | 69.8 | 88.3 | 25 / 35 | 5173 |
| 4 | 1 | 66.4 | 77.8 | 19 / 35 | 4600 |
| 5 | 1 | 70.1 | 88.6 | 30 / 35 | 5167 |
| 6 | 1 | 68.7 | 86.3 | 23 / 35 | 4760 |
| 7 | 1 | 67.5 | 80.6 | 20 / 35 | 4907 |
| 8 | 1 | 67.8 | 79.4 | 23 / 35 | 5086 |
| 9 | 1 | 68.7 | 84.4 | 25 / 35 | 4859 |
| 10 | 1 | 63.0 | 67.3 | 13 / 35 | 4735 |
| 11 | 1 | 68.0 | 84.1 | 21 / 35 | 4832 |
| 12 | 1 | 69.0 | 85.7 | 21 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 68 | 85% |
| stelo.AreaTargetingBot 1.1 | 63 | 87% |
| ntc.Opposite 1.5 | 44 | 93% |
| donjezza.Muncho 1.0 | 32 | 81% |
| DBall.NUKE 0.1 | 29 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 25 | 96% |
| disan.Chair 2.2.0 | 22 | 82% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 156 of 420 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 38 | 24% | 61 |
| myl.nano.Graviton 1.10 | 28 | 18% | 82 |
| stelo.AreaTargetingBot 1.1 | 23 | 15% | 68 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 13% | 56 |
| ntc.Opposite 1.5 | 16 | 10% | 44 |
| disan.Chair 2.2.0 | 12 | 8% | 33 |
| donjezza.Muncho 1.0 | 10 | 6% | 27 |
| DBall.NUKE 0.1 | 7 | 4% | 36 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.5 | 173 / 420 | 3.56 | 15.7% | 52006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.1 | 15.7% | 173 |
| oog.melee.Capulet 1.2 | 2.6 | 13.9% | 104 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.8% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.4 | 12.1% | 38 |
| yagami.Tidus 0.11 | 4.7 | 11.8% | 18 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 26 |
| stelo.MirrorNano 1.3 | 7.3 | 7.9% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.2 | 15 / 35 | 4443 |
| 2 | 1 | 64.9 | 71.1 | 16 / 35 | 4608 |
| 3 | 1 | 65.0 | 76.2 | 14 / 35 | 4281 |
| 4 | 2 | 62.1 | 67.6 | 8 / 35 | 4072 |
| 5 | 1 | 65.1 | 73.0 | 16 / 35 | 4409 |
| 6 | 1 | 64.7 | 70.8 | 15 / 35 | 4385 |
| 7 | 1 | 65.7 | 76.2 | 14 / 35 | 4287 |
| 8 | 1 | 62.0 | 61.9 | 14 / 35 | 4337 |
| 9 | 1 | 64.7 | 74.3 | 13 / 35 | 4498 |
| 10 | 1 | 62.9 | 66.7 | 13 / 35 | 4295 |
| 11 | 1 | 63.9 | 69.5 | 15 / 35 | 4109 |
| 12 | 1 | 65.7 | 75.9 | 20 / 35 | 4282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 69 | 97% |
| oog.melee.Capulet 1.2 | 64 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 87% |
| yagami.Tidus 0.11 | 31 | 94% |
| ejb.Polaris 1.0.1 | 21 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 248 of 420 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 108 | 44% | 150 |
| yagami.Tidus 0.11 | 47 | 19% | 66 |
| ejb.Polaris 1.0.1 | 23 | 9% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 8% | 54 |
| kawigi.micro.Shiz 1.1 | 19 | 8% | 63 |
| kurios.DOSexe .9a | 14 | 6% | 15 |
| stelo.MirrorNano 1.3 | 10 | 4% | 12 |
| step.nanoPri 1.0 | 7 | 3% | 10 |

## Melee bench: F14

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.6 | 266 / 420 | 2.75 | 17.8% | 54673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.8% | 266 |
| bzdp.Pansy 2.1 | 3.1 | 12.2% | 40 |
| wee.Gem 1.8.4 | 3.4 | 11.8% | 53 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 23 |
| ratosh.Nobo 0.21 | 3.8 | 11.4% | 22 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 7.0% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.9 | 16 / 35 | 4168 |
| 2 | 1 | 67.0 | 81.9 | 19 / 35 | 4748 |
| 3 | 1 | 69.2 | 89.2 | 28 / 35 | 4790 |
| 4 | 1 | 69.3 | 89.2 | 26 / 35 | 4869 |
| 5 | 1 | 68.4 | 85.7 | 24 / 35 | 4784 |
| 6 | 1 | 66.6 | 78.1 | 24 / 35 | 4298 |
| 7 | 1 | 67.2 | 81.3 | 20 / 35 | 4975 |
| 8 | 1 | 65.8 | 80.0 | 22 / 35 | 4243 |
| 9 | 1 | 66.5 | 78.4 | 20 / 35 | 4691 |
| 10 | 1 | 66.1 | 80.3 | 21 / 35 | 4234 |
| 11 | 1 | 66.5 | 79.0 | 23 / 35 | 4504 |
| 12 | 1 | 65.7 | 75.9 | 23 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 98 | 93% |
| wee.Gem 1.8.4 | 84 | 88% |
| wompi.Quokka 1.6 | 42 | 95% |
| ratosh.Nobo 0.21 | 35 | 89% |
| m3thos.Eva00 1.1 | 18 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 157 of 420 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 23 | 15% | 93 |
| ratosh.Nobo 0.21 | 23 | 15% | 61 |
| bzdp.Pansy 2.1 | 22 | 14% | 98 |
| wompi.Quokka 1.6 | 21 | 13% | 55 |
| jeremyreeder.Vincent 2011.12.09 | 19 | 12% | 25 |
| bayen.UbaMicro 1.4 | 17 | 11% | 32 |
| m3thos.Eva00 1.1 | 12 | 8% | 30 |
| maribo.FollowFire 1 | 12 | 8% | 16 |
| stelo.MyAgileRobot 0.2 | 8 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.0 | 136 / 420 | 2.44 | 19.5% | 88288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.9% | 246 |
| hadur117.micro.SaorS2 0.1 | 1.7 | 19.5% | 136 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 31 |
| ayk.WallHugger 1.0 | 4.4 | 9.7% | 2 |
| exauge.GateKeeper 1.1.121g | 4.9 | 9.2% | 4 |
| stuff.Vlad 0.1 | 5.9 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.2 | 81.3 | 13 / 35 | 6905 |
| 2 | 1 | 72.1 | 87.6 | 18 / 35 | 7733 |
| 3 | 2 | 71.2 | 86.7 | 12 / 35 | 7398 |
| 4 | 2 | 69.9 | 81.0 | 7 / 35 | 7208 |
| 5 | 1 | 70.4 | 83.5 | 14 / 35 | 7220 |
| 6 | 2 | 70.6 | 84.4 | 8 / 35 | 7590 |
| 7 | 1 | 72.7 | 89.5 | 17 / 35 | 7803 |
| 8 | 2 | 69.4 | 80.0 | 10 / 35 | 7230 |
| 9 | 2 | 69.4 | 81.9 | 6 / 35 | 7128 |
| 10 | 1 | 72.1 | 87.9 | 13 / 35 | 8030 |
| 11 | 2 | 70.5 | 84.8 | 6 / 35 | 7785 |
| 12 | 2 | 68.4 | 79.7 | 12 / 35 | 6258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 244 | 30% |
| mz.NanoGod 2.02 | 30 | 60% |
| exauge.GateKeeper 1.1.121g | 16 | 94% |
| drd.Dreadknoght 0.9 | 13 | 92% |
| ayk.WallHugger 1.0 | 8 | 88% |
| stelo.PianistNano 1.2 | 7 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 285 of 420 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 212 | 74% | 301 |
| mz.NanoGod 2.02 | 39 | 14% | 59 |
| exauge.GateKeeper 1.1.121g | 14 | 5% | 27 |
| ayk.WallHugger 1.0 | 10 | 4% | 15 |
| stelo.PianistNano 1.2 | 5 | 2% | 5 |
| drd.Dreadknoght 0.9 | 3 | 1% | 9 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.0 | 238 / 420 | 3.25 | 17.3% | 59400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.3% | 238 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.8% | 41 |
| dummy.micro.Sparrow 2.5 | 3.4 | 11.8% | 36 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.3% | 31 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.5% | 19 |
| conscience.Electron 1.3g | 7.2 | 8.1% | 2 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 14 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.6 | 18 / 35 | 5167 |
| 2 | 1 | 64.5 | 69.2 | 16 / 35 | 4998 |
| 3 | 1 | 64.9 | 73.7 | 21 / 35 | 4504 |
| 4 | 1 | 63.2 | 65.1 | 17 / 35 | 4885 |
| 5 | 1 | 66.1 | 75.6 | 22 / 35 | 4728 |
| 6 | 1 | 67.6 | 81.6 | 24 / 35 | 4854 |
| 7 | 1 | 68.3 | 84.8 | 22 / 35 | 5062 |
| 8 | 1 | 66.2 | 76.2 | 22 / 35 | 4938 |
| 9 | 1 | 66.0 | 77.8 | 21 / 35 | 4877 |
| 10 | 1 | 64.7 | 70.8 | 17 / 35 | 5074 |
| 11 | 1 | 67.8 | 79.4 | 21 / 35 | 5525 |
| 12 | 1 | 64.0 | 70.2 | 17 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 73 | 96% |
| dummy.micro.Sparrow 2.5 | 60 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 49 | 86% |
| bvh.micro.Freya 0.3 | 41 | 90% |
| stelo.MirrorMicro 1.0 | 19 | 74% |
| ap.Frederick 1.1 | 16 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 31 | 17% | 29 |
| voidious.micro.BlitzBat 1.05 | 30 | 16% | 87 |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 16% | 90 |
| conscience.Electron 1.3g | 23 | 13% | 34 |
| bvh.micro.Freya 0.3 | 21 | 11% | 41 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 65 |
| dl.BetterWalls 1.0 | 20 | 11% | 37 |
| stelo.MirrorMicro 1.0 | 10 | 5% | 35 |

## Melee bench: F17

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 89.5 | 319 / 420 | 1.94 | 21.5% | 83511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 21.5% | 319 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 29 |
| sul.Lunar 1.1 | 3.4 | 11.0% | 21 |
| supersample.SuperBoxBot 1.0 | 3.6 | 11.1% | 23 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.9% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 3 |
| sample.MyFirstRobot 1.0 | 8.4 | 5.9% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 2 |
| sample.Corners 1.0 | 9.4 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.5 | 26 / 35 | 6976 |
| 2 | 1 | 71.4 | 88.3 | 24 / 35 | 7021 |
| 3 | 1 | 72.3 | 92.4 | 28 / 35 | 6811 |
| 4 | 1 | 71.5 | 90.5 | 27 / 35 | 6828 |
| 5 | 1 | 71.0 | 87.3 | 24 / 35 | 7220 |
| 6 | 1 | 72.7 | 93.7 | 29 / 35 | 7070 |
| 7 | 1 | 71.3 | 87.6 | 26 / 35 | 7013 |
| 8 | 1 | 70.3 | 84.4 | 27 / 35 | 6489 |
| 9 | 1 | 72.6 | 92.4 | 28 / 35 | 7227 |
| 10 | 1 | 71.9 | 89.8 | 29 / 35 | 6814 |
| 11 | 1 | 71.9 | 89.5 | 25 / 35 | 6971 |
| 12 | 1 | 71.4 | 87.9 | 26 / 35 | 7071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 113 | 89% |
| sul.Lunar 1.1 | 77 | 100% |
| supersample.SuperBoxBot 1.0 | 64 | 92% |
| dsw.StaticD 1.0 | 21 | 86% |
| mme.NikeEnhanced 2.0 | 20 | 95% |
| sample.MyFirstRobot 1.0 | 15 | 87% |
| sample.MyFirstJuniorRobot 1.0 | 14 | 100% |
| sample.Corners 1.0 | 12 | 92% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |

Hadur died in 105 of 420 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 34 | 32% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 30% | 126 |
| dsw.StaticD 1.0 | 15 | 14% | 51 |
| sul.Lunar 1.1 | 8 | 8% | 87 |
| sample.Corners 1.0 | 7 | 7% | 26 |
| mme.NikeEnhanced 2.0 | 4 | 4% | 24 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 14 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 5 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.8 | 231 / 420 | 2.91 | 18.1% | 73992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.1% | 231 |
| radnor.DoctorBob 1.42 | 2.4 | 13.0% | 55 |
| mld.Wisdom 1.0 | 3.1 | 12.3% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.4 | 11.1% | 30 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 26 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 14 |
| sample.Walls 1.0 | 7.2 | 7.9% | 10 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.9 | 5.9% | 4 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.6 | 17 / 35 | 6026 |
| 2 | 1 | 63.8 | 67.6 | 14 / 35 | 5768 |
| 3 | 1 | 68.6 | 83.2 | 19 / 35 | 6517 |
| 4 | 1 | 66.6 | 76.5 | 19 / 35 | 5853 |
| 5 | 1 | 68.3 | 80.3 | 22 / 35 | 6231 |
| 6 | 1 | 70.4 | 86.0 | 19 / 35 | 7365 |
| 7 | 1 | 65.8 | 74.6 | 17 / 35 | 5717 |
| 8 | 1 | 67.1 | 78.4 | 20 / 35 | 6136 |
| 9 | 1 | 68.9 | 83.2 | 22 / 35 | 6408 |
| 10 | 1 | 65.5 | 75.2 | 17 / 35 | 5683 |
| 11 | 1 | 69.7 | 86.7 | 25 / 35 | 6211 |
| 12 | 1 | 67.1 | 77.8 | 20 / 35 | 6077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 83 | 94% |
| radnor.DoctorBob 1.42 | 61 | 75% |
| mld.Wisdom 1.0 | 38 | 76% |
| amz.NanoClone 1.41 | 29 | 79% |
| KiraNL.Chupacabra 0.4 | 27 | 81% |
| jangs.ns51 1.0 | 15 | 93% |
| GarmBox.Oranges 1.0 | 10 | 100% |
| sample.Walls 1.0 | 8 | 88% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 189 of 420 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 64 | 34% | 96 |
| radnor.DoctorBob 1.42 | 36 | 19% | 98 |
| KiraNL.Chupacabra 0.4 | 28 | 15% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 14% | 103 |
| amz.NanoClone 1.41 | 19 | 10% | 31 |
| sample.Walls 1.0 | 6 | 3% | 19 |
| GarmBox.Oranges 1.0 | 5 | 3% | 10 |
| jangs.ns51 1.0 | 4 | 2% | 9 |

