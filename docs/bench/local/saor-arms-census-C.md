# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 85.6 | 258 / 420 | 2.30 | 20.1% | 78741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.1% | 258 |
| radnor.DoctorBob 1.42 | 2.5 | 14.8% | 63 |
| mz.AntiGrav 1.0 | 3.0 | 14.3% | 39 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 46 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 7 |
| sample.Walls 1.0 | 6.6 | 6.9% | 3 |
| GarmBox.Oranges 1.0 | 6.9 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.6 | 6.1% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.6 | 23 / 35 | 6656 |
| 2 | 1 | 69.7 | 84.1 | 21 / 35 | 6064 |
| 3 | 1 | 72.8 | 91.4 | 25 / 35 | 6932 |
| 4 | 1 | 72.9 | 91.1 | 26 / 35 | 6889 |
| 5 | 1 | 69.0 | 80.6 | 20 / 35 | 6282 |
| 6 | 1 | 70.7 | 85.4 | 20 / 35 | 6573 |
| 7 | 1 | 71.3 | 88.6 | 23 / 35 | 6337 |
| 8 | 1 | 71.4 | 88.6 | 22 / 35 | 6775 |
| 9 | 1 | 70.6 | 83.2 | 20 / 35 | 7037 |
| 10 | 1 | 66.2 | 70.5 | 15 / 35 | 5531 |
| 11 | 1 | 70.8 | 84.8 | 20 / 35 | 6817 |
| 12 | 1 | 72.4 | 91.1 | 23 / 35 | 6848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 119 | 96% |
| radnor.DoctorBob 1.42 | 83 | 66% |
| mld.Infinity 2.2 | 76 | 83% |
| jangs.ns51 1.0 | 13 | 77% |
| amz.NanoClone 1.41 | 9 | 56% |
| sample.Walls 1.0 | 5 | 80% |
| sample.Target 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 162 of 420 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 80 | 49% | 165 |
| mld.Infinity 2.2 | 28 | 17% | 40 |
| mz.AntiGrav 1.0 | 21 | 13% | 131 |
| amz.NanoClone 1.41 | 18 | 11% | 27 |
| jangs.ns51 1.0 | 5 | 3% | 15 |
| sample.Walls 1.0 | 4 | 2% | 20 |
| arthord.MannyPacquiao Beta | 3 | 2% | 10 |
| GarmBox.Oranges 1.0 | 3 | 2% | 6 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.1 | 270 / 420 | 2.35 | 18.4% | 58544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 18.4% | 270 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.5% | 87 |
| mld.DustBunny 3.8 | 3.0 | 13.1% | 23 |
| maribo.melee.BMV 0.1 | 4.6 | 10.0% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5.1 | 9.3% | 15 |
| zyx.nano.Ant 1.1 | 6.2 | 8.5% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.3% | 14 |
| bzdp.BoxCar 2.0 | 7.6 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 8.3 | 7.1% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.6 | 23 / 35 | 5247 |
| 2 | 1 | 68.1 | 87.9 | 23 / 35 | 4779 |
| 3 | 1 | 68.1 | 86.3 | 22 / 35 | 4650 |
| 4 | 1 | 67.7 | 85.7 | 22 / 35 | 4601 |
| 5 | 1 | 68.7 | 88.9 | 24 / 35 | 5025 |
| 6 | 1 | 66.8 | 82.5 | 23 / 35 | 4769 |
| 7 | 1 | 69.0 | 91.1 | 25 / 35 | 4788 |
| 8 | 1 | 68.3 | 85.7 | 25 / 35 | 4613 |
| 9 | 3 | 60.0 | 55.2 | 11 / 35 | 4381 |
| 10 | 1 | 70.1 | 90.8 | 24 / 35 | 5621 |
| 11 | 1 | 69.3 | 89.8 | 23 / 35 | 5037 |
| 12 | 1 | 69.2 | 88.9 | 25 / 35 | 5033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 141 | 75% |
| mld.DustBunny 3.8 | 94 | 91% |
| djdjdj.NanoSkunk10 1.0 | 28 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 75% |
| fullsail.SweetTea 1.1 | 16 | 94% |
| maribo.melee.BMV 0.1 | 15 | 93% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 3 | 67% |

Hadur died in 150 of 420 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 52 | 35% | 160 |
| mld.DustBunny 3.8 | 26 | 17% | 99 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 10% | 33 |
| fullsail.SweetTea 1.1 | 14 | 9% | 26 |
| zyx.nano.Ant 1.1 | 14 | 9% | 21 |
| maribo.melee.BMV 0.1 | 9 | 6% | 20 |
| bzdp.BoxCar 2.0 | 9 | 6% | 18 |
| djdjdj.NanoSkunk10 1.0 | 8 | 5% | 37 |
| cs.Grudge 1.0 | 3 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 80.7 | 246 / 420 | 2.74 | 18.9% | 67352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 18.9% | 246 |
| myl.micro.Troodon 1.10 | 1.9 | 14.6% | 71 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 4.6 | 10.5% | 32 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 36 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 7 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 8 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 1 |
| sample.Fire 1.0 | 9.6 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.0 | 21 / 35 | 5762 |
| 2 | 1 | 70.7 | 86.0 | 25 / 35 | 6214 |
| 3 | 1 | 69.4 | 84.4 | 20 / 35 | 5759 |
| 4 | 1 | 66.5 | 74.3 | 18 / 35 | 5232 |
| 5 | 1 | 68.1 | 78.1 | 19 / 35 | 5601 |
| 6 | 1 | 70.0 | 86.7 | 23 / 35 | 5752 |
| 7 | 1 | 67.9 | 77.5 | 21 / 35 | 5649 |
| 8 | 2 | 65.6 | 73.0 | 17 / 35 | 4842 |
| 9 | 1 | 67.6 | 75.9 | 20 / 35 | 5356 |
| 10 | 1 | 68.0 | 78.7 | 21 / 35 | 5418 |
| 11 | 1 | 69.6 | 82.5 | 21 / 35 | 5867 |
| 12 | 1 | 69.7 | 85.1 | 20 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 107 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 65 | 83% |
| cb.nano.Insomnia 1.0 | 34 | 71% |
| sp.Nanos.Ember 1.1 | 27 | 93% |
| myl.nano.KomoriNinja 1.1 | 26 | 96% |
| fm.mammillarias 1.3 | 12 | 75% |
| cs.sheldor.Talon 1.1 | 7 | 86% |
| sample.Fire 1.0 | 4 | 75% |

Hadur died in 175 of 420 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 21% | 141 |
| cb.nano.Insomnia 1.0 | 34 | 19% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 28 | 16% | 68 |
| myl.nano.KomoriNinja 1.1 | 23 | 13% | 69 |
| cs.sheldor.Talon 1.1 | 17 | 10% | 31 |
| fm.mammillarias 1.3 | 17 | 10% | 26 |
| sp.Nanos.Ember 1.1 | 8 | 5% | 33 |
| sample.Fire 1.0 | 6 | 3% | 14 |
| sample.Tracker 1.0 | 4 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.8 | 298 / 420 | 2.00 | 20.4% | 72739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.4% | 298 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 29 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 37 |
| stelo.SoJNanoMelee 1.1 | 5.1 | 9.4% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.1% | 2 |
| tj.zombie1n 1.0.1 | 5.8 | 8.9% | 12 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.1 | 7.9% | 10 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 3 |
| sample.VelociRobot 1.0 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.2 | 24 / 35 | 6361 |
| 2 | 1 | 71.6 | 92.1 | 26 / 35 | 6343 |
| 3 | 1 | 70.5 | 88.9 | 26 / 35 | 6203 |
| 4 | 1 | 68.9 | 87.0 | 20 / 35 | 5810 |
| 5 | 1 | 70.1 | 90.2 | 27 / 35 | 5708 |
| 6 | 1 | 70.0 | 88.9 | 21 / 35 | 6049 |
| 7 | 1 | 69.1 | 83.5 | 24 / 35 | 6131 |
| 8 | 1 | 70.4 | 88.3 | 27 / 35 | 6064 |
| 9 | 1 | 68.6 | 83.2 | 25 / 35 | 5562 |
| 10 | 1 | 70.0 | 86.0 | 25 / 35 | 6188 |
| 11 | 1 | 70.9 | 93.0 | 24 / 35 | 6050 |
| 12 | 1 | 71.9 | 94.9 | 29 / 35 | 6270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 119 | 88% |
| stelo.SoJNanoMelee 1.1 | 88 | 91% |
| tvv.micro.Antares 1.1.1 | 37 | 70% |
| tj.zombie1n 1.0.1 | 33 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 27 | 85% |
| yk.JahMicro 1.0 | 15 | 100% |
| repositorio.NanoStep 1.0 | 11 | 100% |
| sample.VelociRobot 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 33 | 26% | 157 |
| stelo.SoJNanoMelee 1.1 | 26 | 21% | 70 |
| tvv.micro.Antares 1.1.1 | 26 | 21% | 56 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 10% | 27 |
| tj.zombie1n 1.0.1 | 11 | 9% | 20 |
| yk.JahMicro 1.0 | 8 | 6% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 41 |
| repositorio.NanoStep 1.0 | 1 | 1% | 15 |
| sample.VelociRobot 1.0 | 1 | 1% | 7 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 65.9 | 164 / 420 | 4.07 | 14.6% | 51524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 14.6% | 164 |
| oog.melee.Corsair 1.0 | 1.8 | 13.0% | 71 |
| ahf.NanoAndrew .4 | 3.4 | 11.7% | 60 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 48 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 33 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 17 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 16 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.8% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.9 | 16 / 35 | 4372 |
| 2 | 2 | 59.8 | 62.5 | 10 / 35 | 4466 |
| 3 | 1 | 60.6 | 61.9 | 13 / 35 | 4265 |
| 4 | 1 | 63.4 | 73.0 | 16 / 35 | 4232 |
| 5 | 2 | 56.7 | 53.7 | 11 / 35 | 4019 |
| 6 | 1 | 62.1 | 67.0 | 13 / 35 | 4565 |
| 7 | 1 | 62.9 | 72.1 | 15 / 35 | 4224 |
| 8 | 1 | 64.8 | 75.6 | 15 / 35 | 4740 |
| 9 | 1 | 62.7 | 71.1 | 18 / 35 | 4116 |
| 10 | 1 | 60.8 | 63.8 | 11 / 35 | 4421 |
| 11 | 2 | 54.4 | 49.2 | 10 / 35 | 3803 |
| 12 | 1 | 63.4 | 73.0 | 16 / 35 | 4301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 59 | 54% |
| simonton.nano.MeleeSeed 1.8 | 55 | 89% |
| ahf.NanoAndrew .4 | 36 | 81% |
| EBBU.Sim2 1.02 | 21 | 90% |
| sam.Samspin 1.0 | 16 | 88% |
| zyx.nano.BacillusComma 1.0 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 258 of 420 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 54 | 21% | 91 |
| simonton.nano.MeleeSeed 1.8 | 38 | 15% | 79 |
| ahf.NanoAndrew .4 | 35 | 14% | 68 |
| robar.nano.Assertive_Melee 0.2 | 35 | 14% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 33 | 13% | 32 |
| zyx.nano.BacillusComma 1.0 | 22 | 9% | 29 |
| EBBU.Sim2 1.02 | 20 | 8% | 37 |
| sam.Samspin 1.0 | 17 | 7% | 25 |
| sample.TrackFire 1.0 | 4 | 2% | 8 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.0 | 260 / 420 | 2.35 | 18.6% | 59382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.6% | 260 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 51 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.7% | 32 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.1% | 43 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.6% | 9 |
| fm.claire 1.7 | 5.9 | 8.6% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.5% | 15 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 6 |
| pa.Improved 1.0 | 9.0 | 6.1% | 6 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.5 | 19 / 35 | 5112 |
| 2 | 1 | 68.7 | 85.7 | 23 / 35 | 4939 |
| 3 | 1 | 66.3 | 80.0 | 19 / 35 | 4640 |
| 4 | 1 | 68.5 | 85.1 | 22 / 35 | 4921 |
| 5 | 1 | 68.4 | 86.7 | 22 / 35 | 5143 |
| 6 | 1 | 65.4 | 79.0 | 17 / 35 | 4270 |
| 7 | 1 | 68.5 | 87.9 | 24 / 35 | 4794 |
| 8 | 1 | 67.7 | 84.1 | 21 / 35 | 4976 |
| 9 | 1 | 69.5 | 89.2 | 23 / 35 | 5620 |
| 10 | 1 | 70.0 | 89.8 | 25 / 35 | 5308 |
| 11 | 1 | 68.8 | 88.9 | 25 / 35 | 4863 |
| 12 | 1 | 66.4 | 81.3 | 20 / 35 | 4796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 135 | 84% |
| oog.melee.CapuletDroid 1.1 | 67 | 78% |
| gh.nano.Grofvuil 0.2 | 50 | 90% |
| sample.SpinBot 1.0 | 18 | 100% |
| arthord.NanoSatanMelee Beta | 16 | 88% |
| winamp32.micro.MicroMacro 1.0 | 12 | 50% |
| pa.Improved 1.0 | 5 | 80% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 75% |

Hadur died in 161 of 420 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 25% | 158 |
| gh.nano.Grofvuil 0.2 | 37 | 23% | 100 |
| oog.melee.CapuletDroid 1.1 | 33 | 20% | 35 |
| arthord.NanoSatanMelee Beta | 19 | 12% | 40 |
| winamp32.micro.MicroMacro 1.0 | 10 | 6% | 25 |
| sample.SpinBot 1.0 | 9 | 6% | 21 |
| fm.claire 1.7 | 6 | 4% | 13 |
| kurios.DOSexe .9b | 3 | 2% | 18 |
| pa.Improved 1.0 | 3 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.1 | 163 / 420 | 2.79 | 17.3% | 62975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.3% | 163 |
| gh.micro.Gruweltje 0.7 | 1.7 | 16.1% | 124 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.0% | 44 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 63 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 11 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 4 |
| el.JumpShoot 0.2 | 7.4 | 6.6% | 5 |
| acogdev.alpha 0.2 | 8.4 | 6.1% | 1 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 5 |
| fire219.CatBot 1.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 78.7 | 12 / 35 | 4779 |
| 2 | 1 | 67.7 | 79.7 | 16 / 35 | 5870 |
| 3 | 1 | 68.3 | 84.4 | 16 / 35 | 5567 |
| 4 | 1 | 66.7 | 76.8 | 16 / 35 | 5252 |
| 5 | 1 | 64.7 | 75.2 | 13 / 35 | 4993 |
| 6 | 1 | 67.6 | 82.9 | 13 / 35 | 5343 |
| 7 | 2 | 63.7 | 73.3 | 10 / 35 | 5032 |
| 8 | 1 | 68.3 | 88.6 | 14 / 35 | 5368 |
| 9 | 2 | 64.7 | 74.0 | 9 / 35 | 5102 |
| 10 | 2 | 65.9 | 79.0 | 13 / 35 | 5040 |
| 11 | 1 | 67.3 | 82.9 | 13 / 35 | 5421 |
| 12 | 1 | 67.8 | 85.7 | 18 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 87 | 29% |
| mz.MicroGodMelee 1 | 79 | 49% |
| spinnercat.micro.Tyger 0.1 | 69 | 91% |
| DBall.Anarchy 0.1 | 15 | 100% |
| mbro.Detektor3 0.1.1 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 88% |
| el.JumpShoot 0.2 | 3 | 33% |
| acogdev.alpha 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 258 of 420 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 103 | 40% | 136 |
| mz.MicroGodMelee 1 | 75 | 29% | 133 |
| spinnercat.micro.Tyger 0.1 | 34 | 13% | 71 |
| DBall.Anarchy 0.1 | 10 | 4% | 23 |
| acogdev.alpha 0.2 | 10 | 4% | 13 |
| el.JumpShoot 0.2 | 10 | 4% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 2% | 11 |
| fire219.CatBot 1.0 | 6 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 14 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 66.9 | 180 / 420 | 3.98 | 15.2% | 56366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.6 | 15.5% | 99 |
| hadur117.micro.SaorC 0.1 | 1.8 | 15.2% | 180 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.0% | 75 |
| qualidafial.MajorDick 1.0.1 | 4.9 | 9.7% | 14 |
| germ.TheMind .2 | 5.0 | 9.8% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 8 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 8 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.7% | 10 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 61.9 | 13 / 35 | 4712 |
| 2 | 3 | 60.4 | 61.3 | 12 / 35 | 4479 |
| 3 | 1 | 63.2 | 66.7 | 17 / 35 | 4860 |
| 4 | 2 | 62.9 | 67.6 | 14 / 35 | 4653 |
| 5 | 3 | 59.3 | 57.8 | 12 / 35 | 4376 |
| 6 | 2 | 60.7 | 61.9 | 13 / 35 | 4706 |
| 7 | 2 | 63.3 | 69.5 | 18 / 35 | 4346 |
| 8 | 2 | 62.2 | 65.1 | 15 / 35 | 4656 |
| 9 | 1 | 64.5 | 69.2 | 17 / 35 | 5034 |
| 10 | 1 | 63.6 | 70.2 | 14 / 35 | 4556 |
| 11 | 1 | 64.5 | 71.1 | 17 / 35 | 4915 |
| 12 | 1 | 66.8 | 80.0 | 18 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 131 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 76% |
| germ.TheMind .2 | 17 | 88% |
| qualidafial.MajorDick 1.0.1 | 16 | 94% |
| awesomeness.Elite 1.0 | 13 | 100% |
| lrem.micro.MoggFanatic 0.2 | 9 | 78% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |

Hadur died in 241 of 420 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 106 | 44% | 202 |
| simonton.nano.WeekendObsession_Melee 1.0 | 54 | 22% | 82 |
| qualidafial.MajorDick 1.0.1 | 18 | 7% | 26 |
| awesomeness.Elite 1.0 | 17 | 7% | 32 |
| germ.TheMind .2 | 17 | 7% | 28 |
| lrem.micro.MoggFanatic 0.2 | 14 | 6% | 21 |
| stelo.UntouchableNano 1.3 | 9 | 4% | 12 |
| sample.Crazy 1.0 | 3 | 1% | 12 |
| mym.EdgeStalker 1.0 | 3 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.7 | 277 / 420 | 2.29 | 19.0% | 56148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 277 |
| rz.HawkOnFire 0.1 | 2.1 | 14.0% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.3% | 40 |
| maribo.IotaCT 1.1 | 4.4 | 10.6% | 24 |
| timmit.nano.TimDog 0.33 | 5.1 | 10.2% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.6 | 8.0% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 8 |
| spinnercat.Omen 1.0 | 8.4 | 7.4% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.7 | 23 / 35 | 4807 |
| 2 | 1 | 69.3 | 87.0 | 24 / 35 | 4731 |
| 3 | 1 | 70.0 | 88.3 | 24 / 35 | 4890 |
| 4 | 1 | 70.0 | 87.9 | 25 / 35 | 4736 |
| 5 | 1 | 69.1 | 86.0 | 21 / 35 | 4990 |
| 6 | 1 | 67.5 | 80.3 | 21 / 35 | 4264 |
| 7 | 1 | 70.1 | 88.6 | 26 / 35 | 4922 |
| 8 | 1 | 68.6 | 84.4 | 21 / 35 | 4512 |
| 9 | 1 | 67.8 | 79.7 | 20 / 35 | 4702 |
| 10 | 1 | 67.3 | 80.0 | 19 / 35 | 4245 |
| 11 | 1 | 70.1 | 87.9 | 26 / 35 | 4564 |
| 12 | 1 | 71.0 | 91.7 | 27 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 136 | 91% |
| nz.jdc.nano.GridFu 1.0 | 56 | 86% |
| stelo.PatternRobot 1.0 | 28 | 93% |
| maribo.IotaCT 1.1 | 26 | 77% |
| timmit.nano.TimDog 0.33 | 20 | 90% |
| spinnercat.Omen 1.0 | 17 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 100% |
| ratosh.Wesco 1.4 | 11 | 100% |

Hadur died in 144 of 420 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 34 | 24% | 133 |
| nz.jdc.nano.GridFu 1.0 | 29 | 20% | 98 |
| timmit.nano.TimDog 0.33 | 24 | 17% | 51 |
| maribo.IotaCT 1.1 | 18 | 13% | 46 |
| stelo.PatternRobot 1.0 | 16 | 11% | 30 |
| ratosh.Wesco 1.4 | 11 | 8% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 6% | 16 |
| spinnercat.Omen 1.0 | 3 | 2% | 11 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.0 | 318 / 420 | 1.99 | 20.4% | 71133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.4% | 318 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.5% | 46 |
| baal.nano.N 1.42 | 3.0 | 11.6% | 13 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.0% | 4 |
| zyx.micro.Ant 1.1 | 5.3 | 9.3% | 17 |
| sanja.First 0.1 | 6.1 | 8.4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.9 | 8.1% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 8 |
| cvt.Firsty 1.0 | 8.7 | 6.9% | 7 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.8 | 29 / 35 | 5919 |
| 2 | 1 | 71.4 | 95.6 | 30 / 35 | 6035 |
| 3 | 1 | 70.9 | 91.4 | 29 / 35 | 5967 |
| 4 | 1 | 70.4 | 88.9 | 24 / 35 | 6096 |
| 5 | 1 | 70.6 | 87.9 | 26 / 35 | 6392 |
| 6 | 1 | 69.4 | 86.7 | 25 / 35 | 5658 |
| 7 | 1 | 68.2 | 81.9 | 21 / 35 | 5543 |
| 8 | 1 | 70.3 | 88.3 | 28 / 35 | 5992 |
| 9 | 1 | 69.2 | 85.1 | 23 / 35 | 5908 |
| 10 | 1 | 70.7 | 89.2 | 28 / 35 | 6123 |
| 11 | 1 | 70.8 | 93.0 | 28 / 35 | 5997 |
| 12 | 1 | 69.6 | 90.5 | 27 / 35 | 5503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 79 | 85% |
| baal.nano.N 1.42 | 57 | 96% |
| zyx.micro.Ant 1.1 | 45 | 96% |
| sanja.First 0.1 | 44 | 95% |
| cvt.Firsty 1.0 | 40 | 90% |
| Grystrion.TrackerWO 1.0 | 36 | 92% |
| amk.Punbot.Punbot 0.01 | 34 | 94% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 104 of 420 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 30 | 29% | 124 |
| zyx.micro.Ant 1.1 | 18 | 17% | 72 |
| Grystrion.TrackerWO 1.0 | 12 | 12% | 37 |
| amk.Punbot.Punbot 0.01 | 10 | 10% | 14 |
| sanja.First 0.1 | 9 | 9% | 53 |
| sample.RamFire 1.0 | 9 | 9% | 12 |
| cvt.Firsty 1.0 | 8 | 8% | 37 |
| baal.nano.N 1.42 | 7 | 7% | 45 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 16 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 65.9 | 113 / 420 | 4.07 | 14.1% | 52222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.6% | 177 |
| hadur117.micro.SaorC 0.1 | 2.1 | 14.1% | 113 |
| cs.Wren 1.0 | 2.9 | 12.8% | 34 |
| js.PinBall 1.6 | 4.3 | 11.5% | 32 |
| mz.Cork 0.1 | 4.6 | 11.2% | 27 |
| joe.ADinosaur 1.0 | 6.1 | 9.7% | 8 |
| evd.X1 0.01 | 7.0 | 8.1% | 9 |
| jsal.Jsalbot 1.0 | 8.1 | 6.9% | 9 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 11 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 70.8 | 11 / 35 | 4628 |
| 2 | 1 | 62.8 | 71.7 | 11 / 35 | 4633 |
| 3 | 2 | 62.8 | 72.7 | 11 / 35 | 4516 |
| 4 | 2 | 62.9 | 72.7 | 10 / 35 | 4497 |
| 5 | 3 | 60.6 | 61.9 | 10 / 35 | 4669 |
| 6 | 2 | 59.7 | 63.8 | 10 / 35 | 3933 |
| 7 | 2 | 59.4 | 63.2 | 8 / 35 | 4093 |
| 8 | 2 | 62.2 | 70.8 | 9 / 35 | 4360 |
| 9 | 3 | 59.0 | 59.0 | 10 / 35 | 4523 |
| 10 | 2 | 59.4 | 63.8 | 11 / 35 | 3770 |
| 11 | 2 | 59.8 | 61.9 | 6 / 35 | 4676 |
| 12 | 2 | 57.8 | 58.1 | 6 / 35 | 3924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 118 | 37% |
| cs.Wren 1.0 | 37 | 84% |
| js.PinBall 1.6 | 15 | 67% |
| mz.Cork 0.1 | 13 | 85% |
| joe.ADinosaur 1.0 | 8 | 88% |
| donjezza.Jezza 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 309 of 420 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 132 | 43% | 186 |
| js.PinBall 1.6 | 38 | 12% | 53 |
| cs.Wren 1.0 | 37 | 12% | 51 |
| joe.ADinosaur 1.0 | 37 | 12% | 41 |
| evd.X1 0.01 | 26 | 8% | 27 |
| mz.Cork 0.1 | 19 | 6% | 34 |
| PSW.Relentless 0.1 | 14 | 5% | 14 |
| jsal.Jsalbot 1.0 | 4 | 1% | 10 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.4 | 240 / 420 | 2.76 | 18.0% | 55391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.0% | 240 |
| ntc.Opposite 1.5 | 2.8 | 11.6% | 17 |
| myl.nano.Graviton 1.10 | 3.0 | 11.7% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 4.6 | 10.3% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.3% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 10.0% | 38 |
| DBall.NUKE 0.1 | 7.1 | 8.3% | 22 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 18 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 15 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.4 | 22 / 35 | 4313 |
| 2 | 1 | 68.3 | 84.4 | 22 / 35 | 4834 |
| 3 | 1 | 66.2 | 78.1 | 16 / 35 | 4779 |
| 4 | 1 | 64.6 | 72.7 | 15 / 35 | 4582 |
| 5 | 1 | 67.4 | 81.0 | 21 / 35 | 4732 |
| 6 | 1 | 66.1 | 81.3 | 18 / 35 | 4083 |
| 7 | 1 | 68.6 | 87.3 | 24 / 35 | 4641 |
| 8 | 1 | 66.4 | 78.7 | 18 / 35 | 4576 |
| 9 | 1 | 66.2 | 78.1 | 21 / 35 | 4298 |
| 10 | 1 | 67.1 | 80.6 | 20 / 35 | 4682 |
| 11 | 1 | 67.9 | 81.6 | 23 / 35 | 5158 |
| 12 | 1 | 65.8 | 75.9 | 20 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 67 | 84% |
| myl.nano.Graviton 1.10 | 57 | 84% |
| disan.Chair 2.2.0 | 34 | 88% |
| DBall.NUKE 0.1 | 30 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 28 | 96% |
| ntc.Opposite 1.5 | 27 | 89% |
| donjezza.Muncho 1.0 | 19 | 84% |
| pfvicm.Sobieski 7.2.3b | 15 | 73% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 182 of 420 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 47 | 26% | 61 |
| myl.nano.Graviton 1.10 | 28 | 15% | 80 |
| stelo.AreaTargetingBot 1.1 | 25 | 14% | 68 |
| lrem.micro.SpikeSoldier 0.4 | 23 | 13% | 56 |
| ntc.Opposite 1.5 | 21 | 12% | 40 |
| disan.Chair 2.2.0 | 16 | 9% | 34 |
| donjezza.Muncho 1.0 | 10 | 5% | 23 |
| DBall.NUKE 0.1 | 7 | 4% | 37 |
| pbg.R2D2 1.0 | 5 | 3% | 18 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 70.6 | 149 / 420 | 3.65 | 15.0% | 47717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.8 | 15.0% | 149 |
| oog.melee.Capulet 1.2 | 2.2 | 14.3% | 107 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 57 |
| yagami.Tidus 0.11 | 4.6 | 11.9% | 16 |
| ejb.Polaris 1.0.1 | 5.9 | 10.7% | 23 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 8.9 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 74.3 | 10 / 35 | 4028 |
| 2 | 1 | 65.6 | 77.1 | 19 / 35 | 4156 |
| 3 | 1 | 63.5 | 72.1 | 13 / 35 | 3777 |
| 4 | 1 | 65.4 | 74.9 | 14 / 35 | 4561 |
| 5 | 4 | 59.9 | 60.3 | 10 / 35 | 3948 |
| 6 | 1 | 64.5 | 73.0 | 15 / 35 | 4054 |
| 7 | 2 | 61.5 | 64.1 | 12 / 35 | 3804 |
| 8 | 1 | 63.4 | 72.1 | 12 / 35 | 3986 |
| 9 | 4 | 58.0 | 55.6 | 8 / 35 | 3637 |
| 10 | 2 | 63.5 | 71.7 | 9 / 35 | 4080 |
| 11 | 1 | 65.3 | 77.1 | 16 / 35 | 4084 |
| 12 | 1 | 63.2 | 74.3 | 11 / 35 | 3602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 42% |
| kawigi.micro.Shiz 1.1 | 55 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 72% |
| yagami.Tidus 0.11 | 32 | 88% |
| ejb.Polaris 1.0.1 | 14 | 43% |

Hadur died in 271 of 420 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 114 | 42% | 148 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 12% | 73 |
| kawigi.micro.Shiz 1.1 | 31 | 11% | 65 |
| ejb.Polaris 1.0.1 | 30 | 11% | 41 |
| yagami.Tidus 0.11 | 27 | 10% | 54 |
| stelo.MirrorNano 1.3 | 14 | 5% | 16 |
| step.nanoPri 1.0 | 12 | 4% | 13 |
| kurios.DOSexe .9a | 10 | 4% | 10 |
| logiblocs.SittingDroid 1.0 | 1 | 0% | 0 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.3 | 224 / 420 | 3.22 | 16.1% | 47212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.1% | 224 |
| wee.Gem 1.8.4 | 3.1 | 12.2% | 74 |
| wompi.Quokka 1.6 | 3.2 | 12.2% | 44 |
| bzdp.Pansy 2.1 | 3.5 | 11.9% | 36 |
| ratosh.Nobo 0.21 | 4.3 | 11.6% | 17 |
| m3thos.Eva00 1.1 | 6.3 | 9.7% | 14 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 8.9 | 5.9% | 4 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.8 | 23 / 35 | 4150 |
| 2 | 1 | 63.6 | 74.0 | 16 / 35 | 4104 |
| 3 | 1 | 64.1 | 74.9 | 18 / 35 | 4076 |
| 4 | 1 | 63.4 | 72.7 | 17 / 35 | 3825 |
| 5 | 2 | 59.4 | 64.1 | 11 / 35 | 3148 |
| 6 | 1 | 62.1 | 69.5 | 16 / 35 | 3714 |
| 7 | 1 | 64.9 | 76.5 | 20 / 35 | 4138 |
| 8 | 1 | 63.6 | 76.5 | 19 / 35 | 3554 |
| 9 | 1 | 67.2 | 83.8 | 22 / 35 | 4474 |
| 10 | 1 | 63.9 | 73.3 | 21 / 35 | 3864 |
| 11 | 1 | 64.0 | 75.2 | 19 / 35 | 3749 |
| 12 | 1 | 66.0 | 79.0 | 22 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 78 | 85% |
| bzdp.Pansy 2.1 | 73 | 89% |
| wompi.Quokka 1.6 | 46 | 85% |
| m3thos.Eva00 1.1 | 24 | 92% |
| ratosh.Nobo 0.21 | 16 | 100% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 196 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 35 | 18% | 56 |
| wee.Gem 1.8.4 | 26 | 13% | 89 |
| maribo.FollowFire 1 | 26 | 13% | 31 |
| bzdp.Pansy 2.1 | 23 | 12% | 86 |
| bayen.UbaMicro 1.4 | 22 | 11% | 35 |
| ratosh.Nobo 0.21 | 19 | 10% | 51 |
| stelo.MyAgileRobot 0.2 | 19 | 10% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 17 | 9% | 19 |
| m3thos.Eva00 1.1 | 9 | 5% | 27 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 80.4 | 102 / 420 | 2.76 | 18.1% | 78575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 20.2% | 272 |
| hadur117.micro.SaorC 0.1 | 1.9 | 18.1% | 102 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 31 |
| exauge.GateKeeper 1.1.121g | 4.6 | 9.8% | 9 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 75.2 | 5 / 35 | 6468 |
| 2 | 2 | 70.0 | 86.0 | 9 / 35 | 6931 |
| 3 | 2 | 69.0 | 80.6 | 8 / 35 | 6811 |
| 4 | 2 | 68.0 | 75.6 | 6 / 35 | 6615 |
| 5 | 1 | 70.9 | 88.3 | 17 / 35 | 6601 |
| 6 | 2 | 70.2 | 86.0 | 10 / 35 | 6597 |
| 7 | 2 | 67.2 | 76.8 | 6 / 35 | 6462 |
| 8 | 2 | 68.2 | 78.7 | 11 / 35 | 6335 |
| 9 | 2 | 68.2 | 79.7 | 9 / 35 | 6116 |
| 10 | 2 | 67.6 | 77.8 | 8 / 35 | 6400 |
| 11 | 2 | 67.7 | 76.8 | 5 / 35 | 6257 |
| 12 | 2 | 69.8 | 83.8 | 8 / 35 | 6982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 213 | 25% |
| mz.NanoGod 2.02 | 28 | 57% |
| exauge.GateKeeper 1.1.121g | 14 | 79% |
| ayk.WallHugger 1.0 | 13 | 92% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 318 of 420 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 224 | 70% | 280 |
| mz.NanoGod 2.02 | 54 | 17% | 77 |
| exauge.GateKeeper 1.1.121g | 20 | 6% | 24 |
| ayk.WallHugger 1.0 | 14 | 4% | 19 |
| stuff.Vlad 0.1 | 3 | 1% | 7 |
| stelo.PianistNano 1.2 | 2 | 1% | 6 |
| drd.Dreadknoght 0.9 | 1 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.8 | 209 / 420 | 3.54 | 16.2% | 54658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.2% | 209 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 49 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 35 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.6% | 34 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.7% | 27 |
| conscience.Electron 1.3g | 7.2 | 8.2% | 4 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 21 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 63.8 | 14 / 35 | 4230 |
| 2 | 1 | 64.4 | 73.7 | 18 / 35 | 4462 |
| 3 | 1 | 65.5 | 74.9 | 18 / 35 | 4740 |
| 4 | 1 | 65.0 | 76.8 | 22 / 35 | 4285 |
| 5 | 1 | 64.2 | 71.1 | 18 / 35 | 4417 |
| 6 | 1 | 65.0 | 75.6 | 17 / 35 | 4659 |
| 7 | 1 | 63.4 | 71.7 | 16 / 35 | 4444 |
| 8 | 1 | 61.0 | 63.2 | 16 / 35 | 4199 |
| 9 | 1 | 65.7 | 78.1 | 18 / 35 | 4476 |
| 10 | 1 | 66.1 | 74.9 | 20 / 35 | 5130 |
| 11 | 1 | 61.6 | 63.8 | 15 / 35 | 4520 |
| 12 | 1 | 65.7 | 74.3 | 17 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 73 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 49 | 88% |
| dummy.micro.Sparrow 2.5 | 46 | 89% |
| bvh.micro.Freya 0.3 | 38 | 84% |
| stelo.MirrorMicro 1.0 | 20 | 60% |
| ap.Frederick 1.1 | 14 | 79% |
| dl.BetterWalls 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 211 of 420 rounds, at a mean tick of 492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 32 | 15% | 38 |
| voidious.micro.BlitzBat 1.05 | 31 | 15% | 90 |
| mn.nano.perceptual.Impact 1.3.0 | 30 | 14% | 33 |
| dummy.micro.Sparrow 2.5 | 28 | 13% | 73 |
| bvh.micro.Freya 0.3 | 25 | 12% | 45 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 11% | 69 |
| dl.BetterWalls 1.0 | 21 | 10% | 33 |
| stelo.MirrorMicro 1.0 | 18 | 9% | 38 |
| ap.Frederick 1.1 | 3 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 85.0 | 281 / 420 | 2.35 | 20.1% | 75839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.1% | 281 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 35 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 27 |
| supersample.SuperBoxBot 1.0 | 3.6 | 11.1% | 22 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 13 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 14 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 5 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.3% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 8.6 | 6.2% | 7 |
| sample.Corners 1.0 | 9.4 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.5 | 25 / 35 | 6547 |
| 2 | 1 | 69.3 | 83.2 | 24 / 35 | 6030 |
| 3 | 1 | 70.6 | 85.7 | 24 / 35 | 6512 |
| 4 | 1 | 69.2 | 84.4 | 22 / 35 | 6027 |
| 5 | 1 | 70.8 | 89.5 | 23 / 35 | 6242 |
| 6 | 1 | 70.6 | 87.9 | 23 / 35 | 6559 |
| 7 | 1 | 68.7 | 79.7 | 21 / 35 | 5945 |
| 8 | 1 | 71.4 | 90.5 | 28 / 35 | 6276 |
| 9 | 1 | 67.2 | 75.6 | 18 / 35 | 6172 |
| 10 | 1 | 70.1 | 86.0 | 25 / 35 | 6503 |
| 11 | 1 | 71.0 | 86.7 | 26 / 35 | 6684 |
| 12 | 1 | 69.2 | 81.3 | 22 / 35 | 6342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 115 | 93% |
| sul.Lunar 1.1 | 70 | 94% |
| supersample.SuperBoxBot 1.0 | 56 | 82% |
| dsw.StaticD 1.0 | 23 | 70% |
| mme.NikeEnhanced 2.0 | 19 | 84% |
| sample.MyFirstRobot 1.0 | 16 | 81% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 142 of 420 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 37 | 26% | 72 |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 21% | 125 |
| dsw.StaticD 1.0 | 30 | 21% | 58 |
| sul.Lunar 1.1 | 15 | 11% | 93 |
| mme.NikeEnhanced 2.0 | 13 | 9% | 30 |
| tlp.ThreeLeggedPig 1 | 6 | 4% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 3% | 13 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 12 |
| sample.Corners 1.0 | 2 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.8 | 211 / 420 | 3.09 | 17.5% | 69950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 211 |
| radnor.DoctorBob 1.42 | 2.7 | 13.4% | 71 |
| mld.Wisdom 1.0 | 3.3 | 12.2% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 36 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 34 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.0% | 14 |
| sample.Walls 1.0 | 7.2 | 8.2% | 14 |
| GarmBox.Oranges 1.0 | 7.9 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 79.7 | 15 / 35 | 6387 |
| 2 | 1 | 66.7 | 77.5 | 20 / 35 | 5782 |
| 3 | 1 | 67.9 | 80.6 | 20 / 35 | 6327 |
| 4 | 1 | 66.3 | 77.1 | 15 / 35 | 5922 |
| 5 | 1 | 67.9 | 82.9 | 20 / 35 | 5892 |
| 6 | 1 | 63.3 | 67.0 | 15 / 35 | 5087 |
| 7 | 1 | 67.5 | 81.0 | 19 / 35 | 5892 |
| 8 | 1 | 66.4 | 77.8 | 18 / 35 | 5523 |
| 9 | 1 | 69.0 | 83.5 | 22 / 35 | 6158 |
| 10 | 1 | 64.5 | 69.8 | 15 / 35 | 5518 |
| 11 | 1 | 63.6 | 69.5 | 14 / 35 | 5408 |
| 12 | 1 | 66.5 | 75.2 | 18 / 35 | 6054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 85 | 95% |
| radnor.DoctorBob 1.42 | 66 | 64% |
| mld.Wisdom 1.0 | 34 | 76% |
| amz.NanoClone 1.41 | 25 | 72% |
| KiraNL.Chupacabra 0.4 | 18 | 72% |
| sample.Walls 1.0 | 13 | 100% |
| jangs.ns51 1.0 | 10 | 100% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 209 of 420 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 59 | 28% | 109 |
| mld.Wisdom 1.0 | 43 | 21% | 74 |
| KiraNL.Chupacabra 0.4 | 39 | 19% | 59 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 13% | 108 |
| amz.NanoClone 1.41 | 21 | 10% | 34 |
| sample.Walls 1.0 | 7 | 3% | 16 |
| GarmBox.Oranges 1.0 | 7 | 3% | 8 |
| jangs.ns51 1.0 | 5 | 2% | 11 |

