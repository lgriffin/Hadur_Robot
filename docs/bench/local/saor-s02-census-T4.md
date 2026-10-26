# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.6 | 276 / 420 | 2.12 | 20.7% | 81413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 20.7% | 276 |
| radnor.DoctorBob 1.42 | 2.3 | 14.8% | 61 |
| mz.AntiGrav 1.0 | 3.3 | 13.8% | 33 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 39 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 2 |
| sample.Walls 1.0 | 6.3 | 6.9% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 5 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 3 |
| sample.Target 1.0 | 9.6 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 90.5 | 25 / 35 | 7577 |
| 2 | 1 | 71.0 | 87.3 | 22 / 35 | 6363 |
| 3 | 1 | 71.6 | 89.8 | 23 / 35 | 6675 |
| 4 | 1 | 73.2 | 95.6 | 25 / 35 | 7089 |
| 5 | 1 | 69.5 | 82.2 | 21 / 35 | 6266 |
| 6 | 1 | 71.4 | 86.7 | 24 / 35 | 6794 |
| 7 | 1 | 69.9 | 81.6 | 19 / 35 | 6723 |
| 8 | 1 | 70.5 | 84.4 | 20 / 35 | 6816 |
| 9 | 1 | 69.8 | 83.2 | 22 / 35 | 6059 |
| 10 | 1 | 74.0 | 94.3 | 29 / 35 | 7445 |
| 11 | 1 | 69.7 | 81.0 | 20 / 35 | 6358 |
| 12 | 1 | 73.2 | 94.6 | 26 / 35 | 7248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 127 | 96% |
| mld.Infinity 2.2 | 84 | 85% |
| radnor.DoctorBob 1.42 | 77 | 74% |
| amz.NanoClone 1.41 | 12 | 100% |
| arthord.MannyPacquiao Beta | 6 | 67% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 146 of 420 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 66 | 45% | 167 |
| mld.Infinity 2.2 | 24 | 16% | 34 |
| mz.AntiGrav 1.0 | 21 | 14% | 127 |
| amz.NanoClone 1.41 | 15 | 10% | 31 |
| arthord.MannyPacquiao Beta | 6 | 4% | 16 |
| sample.Walls 1.0 | 5 | 3% | 21 |
| GarmBox.Oranges 1.0 | 5 | 3% | 7 |
| jangs.ns51 1.0 | 3 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.1 | 262 / 420 | 2.43 | 18.3% | 60017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.2 | 18.3% | 262 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 87 |
| mld.DustBunny 3.8 | 3.5 | 12.6% | 27 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.7% | 11 |
| zyx.nano.Ant 1.1 | 6.0 | 8.8% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.6 | 8.1% | 15 |
| fullsail.SweetTea 1.1 | 7.8 | 7.3% | 7 |
| bzdp.BoxCar 2.0 | 7.9 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.9 | 14 / 35 | 4843 |
| 2 | 1 | 70.3 | 90.8 | 30 / 35 | 5176 |
| 3 | 1 | 68.0 | 84.8 | 21 / 35 | 4972 |
| 4 | 1 | 70.3 | 94.0 | 25 / 35 | 5793 |
| 5 | 1 | 70.0 | 94.3 | 29 / 35 | 5026 |
| 6 | 1 | 67.7 | 84.8 | 22 / 35 | 4864 |
| 7 | 1 | 69.2 | 91.1 | 23 / 35 | 5186 |
| 8 | 1 | 68.6 | 89.5 | 27 / 35 | 5101 |
| 9 | 1 | 67.5 | 85.4 | 21 / 35 | 4906 |
| 10 | 3 | 53.7 | 40.6 | 6 / 35 | 4090 |
| 11 | 1 | 67.3 | 84.4 | 20 / 35 | 4731 |
| 12 | 1 | 69.3 | 87.3 | 24 / 35 | 5329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 145 | 77% |
| mld.DustBunny 3.8 | 81 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 24 | 63% |
| maribo.melee.BMV 0.1 | 21 | 95% |
| djdjdj.NanoSkunk10 1.0 | 19 | 95% |
| fullsail.SweetTea 1.1 | 19 | 89% |
| zyx.nano.Ant 1.1 | 7 | 71% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 162 of 420 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 36% | 164 |
| mld.DustBunny 3.8 | 27 | 17% | 86 |
| zyx.nano.Ant 1.1 | 21 | 13% | 28 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 9% | 40 |
| maribo.melee.BMV 0.1 | 13 | 8% | 26 |
| djdjdj.NanoSkunk10 1.0 | 9 | 6% | 34 |
| cs.Grudge 1.0 | 9 | 6% | 8 |
| fullsail.SweetTea 1.1 | 8 | 5% | 29 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.0 | 276 / 420 | 2.62 | 19.5% | 69671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 19.5% | 276 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 74 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.8% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.2% | 21 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.0% | 21 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 6 |
| sample.Fire 1.0 | 9.0 | 5.3% | 3 |
| sample.Tracker 1.0 | 9.9 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.5 | 22 / 35 | 6319 |
| 2 | 1 | 69.4 | 82.9 | 23 / 35 | 5665 |
| 3 | 1 | 70.6 | 85.4 | 27 / 35 | 5880 |
| 4 | 1 | 67.9 | 77.5 | 19 / 35 | 5808 |
| 5 | 1 | 68.7 | 79.4 | 23 / 35 | 5619 |
| 6 | 1 | 69.4 | 79.7 | 23 / 35 | 6241 |
| 7 | 1 | 68.9 | 82.2 | 23 / 35 | 5514 |
| 8 | 1 | 70.7 | 85.7 | 26 / 35 | 6131 |
| 9 | 1 | 69.9 | 86.7 | 27 / 35 | 5596 |
| 10 | 1 | 70.6 | 85.7 | 23 / 35 | 6263 |
| 11 | 1 | 68.4 | 81.6 | 22 / 35 | 5314 |
| 12 | 1 | 66.5 | 74.0 | 18 / 35 | 5321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 99 | 99% |
| cb.nano.Insomnia 1.0 | 54 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 54 | 94% |
| myl.nano.KomoriNinja 1.1 | 38 | 89% |
| sp.Nanos.Ember 1.1 | 22 | 95% |
| fm.mammillarias 1.3 | 14 | 100% |
| sample.Fire 1.0 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 30 | 21% | 26 |
| myl.micro.Troodon 1.10 | 27 | 19% | 126 |
| myl.nano.KomoriNinja 1.1 | 22 | 15% | 81 |
| fm.mammillarias 1.3 | 21 | 14% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 13% | 66 |
| cs.sheldor.Talon 1.1 | 12 | 8% | 25 |
| sp.Nanos.Ember 1.1 | 9 | 6% | 38 |
| sample.Fire 1.0 | 3 | 2% | 12 |
| sample.Tracker 1.0 | 2 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.0 | 296 / 420 | 2.08 | 20.5% | 75017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 20.5% | 296 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.0% | 29 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 31 |
| tj.zombie1n 1.0.1 | 5.1 | 9.0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.9% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.6% | 24 |
| yk.JahMicro 1.0 | 6.3 | 8.4% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7.1 | 7.8% | 14 |
| repositorio.NanoStep 1.0 | 9.1 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 9.9 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.4 | 29 / 35 | 7025 |
| 2 | 1 | 70.3 | 88.9 | 23 / 35 | 6135 |
| 3 | 1 | 72.9 | 98.4 | 32 / 35 | 6228 |
| 4 | 1 | 70.3 | 87.6 | 25 / 35 | 6235 |
| 5 | 1 | 71.3 | 90.8 | 26 / 35 | 6504 |
| 6 | 1 | 69.0 | 81.6 | 20 / 35 | 6377 |
| 7 | 1 | 69.0 | 82.5 | 21 / 35 | 6271 |
| 8 | 1 | 70.9 | 88.9 | 27 / 35 | 6273 |
| 9 | 1 | 70.6 | 89.5 | 25 / 35 | 6245 |
| 10 | 1 | 70.6 | 91.1 | 27 / 35 | 5867 |
| 11 | 1 | 66.0 | 74.9 | 16 / 35 | 5651 |
| 12 | 1 | 70.4 | 88.9 | 25 / 35 | 6206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 130 | 95% |
| stelo.SoJNanoMelee 1.1 | 61 | 90% |
| tvv.micro.Antares 1.1.1 | 38 | 76% |
| tj.zombie1n 1.0.1 | 31 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 27 | 70% |
| yk.JahMicro 1.0 | 24 | 75% |
| repositorio.NanoStep 1.0 | 12 | 100% |
| sample.VelociRobot 1.0 | 8 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 27% | 165 |
| tvv.micro.Antares 1.1.1 | 20 | 16% | 63 |
| stelo.SoJNanoMelee 1.1 | 20 | 16% | 51 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 10% | 41 |
| tj.zombie1n 1.0.1 | 12 | 10% | 20 |
| yk.JahMicro 1.0 | 10 | 8% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 7% | 13 |
| repositorio.NanoStep 1.0 | 4 | 3% | 18 |
| sample.VelociRobot 1.0 | 3 | 2% | 17 |

## Melee bench: F05

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 65.1 | 167 / 420 | 4.14 | 14.9% | 54395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.1 | 14.9% | 167 |
| oog.melee.Corsair 1.0 | 2.4 | 12.5% | 71 |
| ahf.NanoAndrew .4 | 3.2 | 11.7% | 61 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 49 |
| sam.Samspin 1.0 | 6.0 | 9.8% | 27 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.5% | 11 |
| EBBU.Sim2 1.02 | 6.5 | 9.5% | 16 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.2% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 69.5 | 15 / 35 | 4189 |
| 2 | 1 | 64.4 | 68.6 | 17 / 35 | 5299 |
| 3 | 1 | 63.4 | 67.6 | 13 / 35 | 5033 |
| 4 | 1 | 63.2 | 68.6 | 15 / 35 | 4582 |
| 5 | 1 | 61.8 | 64.1 | 16 / 35 | 4465 |
| 6 | 1 | 59.4 | 56.5 | 9 / 35 | 4568 |
| 7 | 1 | 64.1 | 71.1 | 16 / 35 | 4935 |
| 8 | 1 | 61.4 | 65.4 | 17 / 35 | 4117 |
| 9 | 1 | 63.1 | 69.8 | 14 / 35 | 4443 |
| 10 | 1 | 62.0 | 65.7 | 14 / 35 | 4605 |
| 11 | 1 | 58.4 | 58.4 | 11 / 35 | 3972 |
| 12 | 2 | 58.2 | 55.9 | 10 / 35 | 4187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 75 | 80% |
| oog.melee.Corsair 1.0 | 59 | 59% |
| ahf.NanoAndrew .4 | 36 | 78% |
| sam.Samspin 1.0 | 18 | 89% |
| EBBU.Sim2 1.02 | 13 | 100% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| sample.TrackFire 1.0 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 253 of 420 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 18% | 95 |
| oog.melee.Corsair 1.0 | 42 | 17% | 84 |
| bwbaugh.nano.Tirunculus 0.0.0a | 40 | 16% | 39 |
| ahf.NanoAndrew .4 | 31 | 12% | 62 |
| robar.nano.Assertive_Melee 0.2 | 26 | 10% | 36 |
| zyx.nano.BacillusComma 1.0 | 24 | 9% | 31 |
| EBBU.Sim2 1.02 | 20 | 8% | 32 |
| sam.Samspin 1.0 | 19 | 8% | 29 |
| sample.TrackFire 1.0 | 6 | 2% | 10 |

## Melee bench: F06

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.7 | 263 / 420 | 2.47 | 18.5% | 58779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 18.5% | 263 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 46 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.4% | 37 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 10.1% | 34 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.1% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 16 |
| fm.claire 1.7 | 6.6 | 8.4% | 3 |
| sample.SpinBot 1.0 | 8.2 | 7.0% | 8 |
| pa.Improved 1.0 | 9.1 | 5.9% | 4 |
| kurios.DOSexe .9b | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.2 | 20 / 35 | 4818 |
| 2 | 1 | 69.7 | 87.6 | 23 / 35 | 5432 |
| 3 | 1 | 68.0 | 86.0 | 19 / 35 | 4787 |
| 4 | 1 | 67.9 | 84.8 | 23 / 35 | 4796 |
| 5 | 1 | 68.1 | 85.7 | 21 / 35 | 4727 |
| 6 | 1 | 67.1 | 79.7 | 22 / 35 | 4807 |
| 7 | 1 | 67.9 | 83.5 | 22 / 35 | 5167 |
| 8 | 1 | 68.4 | 88.3 | 23 / 35 | 4730 |
| 9 | 1 | 67.1 | 80.0 | 22 / 35 | 4988 |
| 10 | 1 | 68.4 | 86.0 | 25 / 35 | 5030 |
| 11 | 1 | 67.3 | 82.5 | 23 / 35 | 4819 |
| 12 | 1 | 65.9 | 78.1 | 20 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 123 | 92% |
| oog.melee.CapuletDroid 1.1 | 68 | 76% |
| gh.nano.Grofvuil 0.2 | 43 | 84% |
| arthord.NanoSatanMelee Beta | 28 | 86% |
| sample.SpinBot 1.0 | 14 | 100% |
| kurios.DOSexe .9b | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 9 | 67% |
| fm.claire 1.7 | 6 | 83% |
| pa.Improved 1.0 | 5 | 80% |

Hadur died in 157 of 420 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 35 | 22% | 90 |
| d414.nano.Quantum 1.0.0 | 33 | 21% | 146 |
| oog.melee.CapuletDroid 1.1 | 25 | 16% | 32 |
| arthord.NanoSatanMelee Beta | 16 | 10% | 38 |
| winamp32.micro.MicroMacro 1.0 | 14 | 9% | 38 |
| sample.SpinBot 1.0 | 12 | 8% | 21 |
| fm.claire 1.7 | 12 | 8% | 21 |
| kurios.DOSexe .9b | 6 | 4% | 25 |
| pa.Improved 1.0 | 4 | 3% | 9 |

## Melee bench: F07

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.7 | 187 / 420 | 2.65 | 18.0% | 66249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 18.0% | 187 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.6% | 106 |
| mz.MicroGodMelee 1 | 3.4 | 13.1% | 68 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.0% | 36 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 10 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 3 |
| acogdev.alpha 0.2 | 8.1 | 6.1% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 5 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 5 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.9 | 16 / 35 | 5887 |
| 2 | 1 | 68.6 | 86.0 | 16 / 35 | 5559 |
| 3 | 1 | 67.3 | 82.2 | 16 / 35 | 5281 |
| 4 | 1 | 67.6 | 79.0 | 14 / 35 | 5894 |
| 5 | 1 | 66.2 | 78.4 | 12 / 35 | 5408 |
| 6 | 1 | 68.4 | 85.7 | 17 / 35 | 5642 |
| 7 | 1 | 68.1 | 83.2 | 19 / 35 | 5522 |
| 8 | 1 | 68.2 | 83.2 | 19 / 35 | 5424 |
| 9 | 1 | 68.5 | 82.2 | 18 / 35 | 5980 |
| 10 | 1 | 67.3 | 82.5 | 15 / 35 | 5234 |
| 11 | 1 | 65.8 | 77.8 | 15 / 35 | 4856 |
| 12 | 1 | 66.0 | 77.8 | 10 / 35 | 5562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 95 | 55% |
| spinnercat.micro.Tyger 0.1 | 91 | 92% |
| gh.micro.Gruweltje 0.7 | 70 | 23% |
| DBall.Anarchy 0.1 | 22 | 95% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 234 of 420 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 80 | 34% | 138 |
| gh.micro.Gruweltje 0.7 | 80 | 34% | 111 |
| spinnercat.micro.Tyger 0.1 | 32 | 14% | 95 |
| fire219.CatBot 1.0 | 12 | 5% | 13 |
| acogdev.alpha 0.2 | 11 | 5% | 11 |
| mbro.Detektor3 0.1.1 | 6 | 3% | 14 |
| caimano.Furia_Ceca 0.22 | 5 | 2% | 8 |
| el.JumpShoot 0.2 | 5 | 2% | 7 |
| DBall.Anarchy 0.1 | 3 | 1% | 23 |

## Melee bench: F08

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.0 | 212 / 420 | 3.52 | 16.3% | 59236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.4 | 16.3% | 212 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.1% | 83 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.7% | 57 |
| germ.TheMind .2 | 4.8 | 9.9% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 6 |
| awesomeness.Elite 1.0 | 6.4 | 8.6% | 17 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.5% | 9 |
| sample.Crazy 1.0 | 8.9 | 6.5% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.3 | 17 / 35 | 5033 |
| 2 | 2 | 64.7 | 74.0 | 20 / 35 | 4459 |
| 3 | 1 | 67.1 | 79.4 | 22 / 35 | 5183 |
| 4 | 1 | 66.9 | 80.6 | 19 / 35 | 4992 |
| 5 | 2 | 64.9 | 73.0 | 17 / 35 | 4499 |
| 6 | 2 | 63.9 | 68.3 | 16 / 35 | 4928 |
| 7 | 1 | 65.9 | 76.2 | 19 / 35 | 5312 |
| 8 | 2 | 61.9 | 63.8 | 15 / 35 | 4834 |
| 9 | 2 | 61.3 | 62.2 | 14 / 35 | 4596 |
| 10 | 1 | 65.1 | 72.1 | 19 / 35 | 4998 |
| 11 | 1 | 63.4 | 69.2 | 15 / 35 | 4990 |
| 12 | 1 | 65.7 | 71.4 | 19 / 35 | 5412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 149 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 83% |
| awesomeness.Elite 1.0 | 14 | 79% |
| germ.TheMind .2 | 13 | 92% |
| qualidafial.MajorDick 1.0.1 | 10 | 80% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 210 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 40% | 197 |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 20% | 77 |
| lrem.micro.MoggFanatic 0.2 | 20 | 10% | 27 |
| awesomeness.Elite 1.0 | 19 | 9% | 32 |
| germ.TheMind .2 | 14 | 7% | 30 |
| stelo.UntouchableNano 1.3 | 11 | 5% | 22 |
| qualidafial.MajorDick 1.0.1 | 11 | 5% | 15 |
| mym.EdgeStalker 1.0 | 5 | 2% | 9 |
| sample.Crazy 1.0 | 4 | 2% | 11 |

## Melee bench: F09

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.9 | 301 / 420 | 2.09 | 19.6% | 56795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 19.6% | 301 |
| rz.HawkOnFire 0.1 | 2.3 | 13.6% | 41 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 19 |
| maribo.IotaCT 1.1 | 4.4 | 10.6% | 20 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.3% | 1 |
| spinnercat.Omen 1.0 | 7.5 | 8.2% | 7 |
| ratosh.Wesco 1.4 | 7.6 | 8.2% | 5 |
| stelo.PatternRobot 1.0 | 8.2 | 7.7% | 11 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 27 / 35 | 4576 |
| 2 | 1 | 68.9 | 84.4 | 22 / 35 | 4724 |
| 3 | 1 | 68.8 | 84.4 | 22 / 35 | 4496 |
| 4 | 1 | 70.5 | 91.1 | 25 / 35 | 4858 |
| 5 | 1 | 69.6 | 85.1 | 25 / 35 | 4720 |
| 6 | 1 | 71.5 | 92.1 | 28 / 35 | 5222 |
| 7 | 1 | 69.0 | 84.8 | 22 / 35 | 4761 |
| 8 | 1 | 70.6 | 92.1 | 27 / 35 | 4525 |
| 9 | 1 | 70.7 | 92.1 | 28 / 35 | 5031 |
| 10 | 1 | 69.5 | 87.0 | 24 / 35 | 4462 |
| 11 | 1 | 69.8 | 87.3 | 25 / 35 | 4625 |
| 12 | 1 | 69.5 | 87.9 | 26 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 133 | 95% |
| nz.jdc.nano.GridFu 1.0 | 74 | 95% |
| timmit.nano.TimDog 0.33 | 23 | 87% |
| stelo.PatternRobot 1.0 | 22 | 91% |
| maribo.IotaCT 1.1 | 22 | 86% |
| spinnercat.Omen 1.0 | 17 | 100% |
| ratosh.Wesco 1.4 | 17 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 29 | 24% | 64 |
| rz.HawkOnFire 0.1 | 21 | 18% | 112 |
| stelo.PatternRobot 1.0 | 19 | 16% | 34 |
| nz.jdc.nano.GridFu 1.0 | 17 | 14% | 95 |
| maribo.IotaCT 1.1 | 14 | 12% | 45 |
| ratosh.Wesco 1.4 | 8 | 7% | 31 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 6% | 20 |
| spinnercat.Omen 1.0 | 4 | 3% | 12 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.8 | 337 / 420 | 1.83 | 21.1% | 74843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 21.1% | 337 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 38 |
| baal.nano.N 1.42 | 3.3 | 11.2% | 9 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.2% | 6 |
| zyx.micro.Ant 1.1 | 5.2 | 9.4% | 11 |
| sanja.First 0.1 | 6.4 | 8.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.1% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 10 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.4 | 27 / 35 | 5882 |
| 2 | 1 | 71.2 | 94.9 | 31 / 35 | 5826 |
| 3 | 1 | 69.2 | 83.8 | 27 / 35 | 5716 |
| 4 | 1 | 72.5 | 93.7 | 31 / 35 | 6835 |
| 5 | 1 | 71.5 | 93.0 | 31 / 35 | 6037 |
| 6 | 1 | 70.9 | 92.1 | 25 / 35 | 6158 |
| 7 | 1 | 68.6 | 80.0 | 22 / 35 | 6093 |
| 8 | 1 | 71.3 | 93.7 | 29 / 35 | 6108 |
| 9 | 1 | 71.9 | 93.3 | 27 / 35 | 6599 |
| 10 | 1 | 71.9 | 90.5 | 30 / 35 | 6803 |
| 11 | 1 | 71.0 | 88.3 | 28 / 35 | 6430 |
| 12 | 1 | 71.6 | 93.7 | 29 / 35 | 6356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 83 | 92% |
| baal.nano.N 1.42 | 70 | 97% |
| cvt.Firsty 1.0 | 55 | 87% |
| zyx.micro.Ant 1.1 | 44 | 93% |
| sanja.First 0.1 | 36 | 94% |
| amk.Punbot.Punbot 0.01 | 32 | 94% |
| Grystrion.TrackerWO 1.0 | 27 | 96% |
| squidM.TentalceMeleeNano 1.1 | 12 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 84 of 420 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 16 | 19% | 69 |
| tvv.nano.Polaris 1.2 | 15 | 18% | 112 |
| Grystrion.TrackerWO 1.0 | 14 | 17% | 40 |
| cvt.Firsty 1.0 | 12 | 14% | 52 |
| sample.RamFire 1.0 | 10 | 12% | 10 |
| baal.nano.N 1.42 | 8 | 10% | 53 |
| amk.Punbot.Punbot 0.01 | 4 | 5% | 8 |
| sanja.First 0.1 | 3 | 4% | 45 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 22 |

## Melee bench: F11

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 64.7 | 113 / 420 | 4.18 | 14.1% | 54674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.6% | 176 |
| hadur117.micro.SaorT4 0.1 | 2.1 | 14.1% | 113 |
| cs.Wren 1.0 | 3.2 | 12.5% | 33 |
| js.PinBall 1.6 | 3.8 | 11.5% | 41 |
| mz.Cork 0.1 | 4.8 | 11.1% | 21 |
| joe.ADinosaur 1.0 | 5.9 | 9.7% | 10 |
| evd.X1 0.01 | 7.0 | 8.4% | 7 |
| jsal.Jsalbot 1.0 | 8.1 | 6.6% | 8 |
| donjezza.Jezza 1.0 | 8.9 | 5.7% | 11 |
| PSW.Relentless 0.1 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 74.3 | 9 / 35 | 4876 |
| 2 | 2 | 60.9 | 64.4 | 11 / 35 | 4539 |
| 3 | 1 | 63.0 | 71.7 | 9 / 35 | 4823 |
| 4 | 3 | 56.7 | 56.5 | 5 / 35 | 3970 |
| 5 | 2 | 60.4 | 61.9 | 10 / 35 | 4638 |
| 6 | 1 | 63.1 | 70.2 | 10 / 35 | 5053 |
| 7 | 2 | 61.4 | 67.0 | 10 / 35 | 4457 |
| 8 | 3 | 58.8 | 60.6 | 8 / 35 | 4368 |
| 9 | 3 | 59.0 | 58.7 | 9 / 35 | 4632 |
| 10 | 3 | 57.2 | 54.9 | 11 / 35 | 4089 |
| 11 | 1 | 64.6 | 76.2 | 12 / 35 | 4873 |
| 12 | 2 | 59.0 | 60.0 | 9 / 35 | 4356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 131 | 39% |
| cs.Wren 1.0 | 33 | 97% |
| js.PinBall 1.6 | 18 | 67% |
| mz.Cork 0.1 | 13 | 77% |
| joe.ADinosaur 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 40% |
| jsal.Jsalbot 1.0 | 2 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 308 of 420 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 149 | 48% | 211 |
| joe.ADinosaur 1.0 | 42 | 14% | 45 |
| cs.Wren 1.0 | 26 | 8% | 45 |
| evd.X1 0.01 | 26 | 8% | 28 |
| js.PinBall 1.6 | 22 | 7% | 35 |
| mz.Cork 0.1 | 19 | 6% | 30 |
| PSW.Relentless 0.1 | 16 | 5% | 12 |
| donjezza.Jezza 1.0 | 5 | 2% | 9 |
| jsal.Jsalbot 1.0 | 3 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.6 | 285 / 420 | 2.47 | 18.9% | 56939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 18.9% | 285 |
| ntc.Opposite 1.5 | 3.0 | 11.6% | 15 |
| myl.nano.Graviton 1.10 | 3.7 | 11.2% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.1 | 10.6% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5.1 | 9.9% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.8% | 28 |
| disan.Chair 2.2.0 | 6.8 | 8.4% | 12 |
| DBall.NUKE 0.1 | 7.4 | 7.8% | 6 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 14 |
| pbg.R2D2 1.0 | 9.9 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 76.2 | 24 / 35 | 5027 |
| 2 | 1 | 67.7 | 82.2 | 24 / 35 | 4670 |
| 3 | 1 | 70.7 | 94.3 | 28 / 35 | 4770 |
| 4 | 1 | 69.0 | 87.0 | 24 / 35 | 4971 |
| 5 | 1 | 70.6 | 89.2 | 26 / 35 | 5655 |
| 6 | 1 | 66.1 | 77.8 | 20 / 35 | 4518 |
| 7 | 1 | 68.6 | 87.6 | 25 / 35 | 4331 |
| 8 | 1 | 64.4 | 73.3 | 20 / 35 | 4326 |
| 9 | 1 | 67.6 | 81.9 | 21 / 35 | 4606 |
| 10 | 1 | 69.8 | 91.4 | 28 / 35 | 4672 |
| 11 | 1 | 65.4 | 75.6 | 20 / 35 | 4335 |
| 12 | 1 | 69.5 | 87.0 | 25 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 74 | 88% |
| myl.nano.Graviton 1.10 | 54 | 89% |
| ntc.Opposite 1.5 | 41 | 95% |
| lrem.micro.SpikeSoldier 0.4 | 30 | 93% |
| donjezza.Muncho 1.0 | 28 | 82% |
| DBall.NUKE 0.1 | 27 | 96% |
| pfvicm.Sobieski 7.2.3b | 27 | 89% |
| disan.Chair 2.2.0 | 26 | 96% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 140 of 420 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 35 | 25% | 73 |
| stelo.AreaTargetingBot 1.1 | 32 | 23% | 75 |
| ntc.Opposite 1.5 | 19 | 14% | 41 |
| myl.nano.Graviton 1.10 | 16 | 11% | 65 |
| DBall.NUKE 0.1 | 12 | 9% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 7% | 58 |
| donjezza.Muncho 1.0 | 7 | 5% | 19 |
| disan.Chair 2.2.0 | 6 | 4% | 29 |
| pbg.R2D2 1.0 | 3 | 2% | 9 |

## Melee bench: F13

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 66.6 | 145 / 420 | 4.01 | 14.3% | 46169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.9 | 14.3% | 145 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 82 |
| oog.melee.Capulet 1.2 | 2.4 | 14.0% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.0% | 49 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 19 |
| ejb.Polaris 1.0.1 | 5.8 | 10.9% | 24 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 3 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 73.7 | 13 / 35 | 3876 |
| 2 | 3 | 60.2 | 59.4 | 11 / 35 | 3916 |
| 3 | 1 | 61.7 | 66.3 | 13 / 35 | 3811 |
| 4 | 2 | 60.7 | 65.1 | 12 / 35 | 3492 |
| 5 | 1 | 62.1 | 67.0 | 12 / 35 | 3791 |
| 6 | 1 | 63.1 | 68.6 | 13 / 35 | 3928 |
| 7 | 1 | 62.7 | 71.1 | 13 / 35 | 3941 |
| 8 | 1 | 65.0 | 75.6 | 17 / 35 | 4013 |
| 9 | 4 | 58.8 | 58.7 | 8 / 35 | 3572 |
| 10 | 4 | 59.8 | 59.7 | 8 / 35 | 3698 |
| 11 | 3 | 62.1 | 65.4 | 12 / 35 | 3943 |
| 12 | 1 | 62.8 | 68.6 | 13 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 47% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 84% |
| kawigi.micro.Shiz 1.1 | 44 | 93% |
| yagami.Tidus 0.11 | 33 | 88% |
| ejb.Polaris 1.0.1 | 11 | 73% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 275 of 420 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 118 | 43% | 164 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 12% | 71 |
| yagami.Tidus 0.11 | 33 | 12% | 54 |
| ejb.Polaris 1.0.1 | 27 | 10% | 48 |
| kawigi.micro.Shiz 1.1 | 22 | 8% | 39 |
| stelo.MirrorNano 1.3 | 16 | 6% | 18 |
| kurios.DOSexe .9a | 16 | 6% | 15 |
| step.nanoPri 1.0 | 10 | 4% | 11 |

## Melee bench: F14

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 75.1 | 222 / 420 | 3.24 | 16.2% | 48387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 16.2% | 222 |
| wee.Gem 1.8.4 | 2.7 | 12.4% | 78 |
| wompi.Quokka 1.6 | 3.6 | 11.7% | 28 |
| bzdp.Pansy 2.1 | 3.6 | 12.0% | 41 |
| ratosh.Nobo 0.21 | 4.3 | 11.3% | 25 |
| m3thos.Eva00 1.1 | 5.8 | 10.0% | 16 |
| bayen.UbaMicro 1.4 | 7.1 | 8.6% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 3 |
| stelo.MyAgileRobot 0.2 | 8.9 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.0 | 22 / 35 | 4426 |
| 2 | 1 | 67.2 | 83.2 | 23 / 35 | 4190 |
| 3 | 1 | 61.4 | 68.6 | 13 / 35 | 3744 |
| 4 | 1 | 65.0 | 75.6 | 22 / 35 | 4257 |
| 5 | 1 | 63.9 | 76.2 | 19 / 35 | 3769 |
| 6 | 1 | 64.1 | 74.6 | 17 / 35 | 4006 |
| 7 | 1 | 64.6 | 75.9 | 20 / 35 | 3928 |
| 8 | 1 | 65.5 | 77.8 | 21 / 35 | 4137 |
| 9 | 1 | 64.7 | 77.1 | 21 / 35 | 3935 |
| 10 | 1 | 60.8 | 63.8 | 16 / 35 | 3605 |
| 11 | 1 | 65.4 | 78.4 | 15 / 35 | 4496 |
| 12 | 1 | 61.9 | 70.8 | 13 / 35 | 3894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 71 | 87% |
| wee.Gem 1.8.4 | 66 | 86% |
| wompi.Quokka 1.6 | 47 | 83% |
| ratosh.Nobo 0.21 | 27 | 89% |
| m3thos.Eva00 1.1 | 26 | 88% |
| bayen.UbaMicro 1.4 | 15 | 80% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 200 of 420 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 27 | 14% | 85 |
| wee.Gem 1.8.4 | 26 | 13% | 79 |
| jeremyreeder.Vincent 2011.12.09 | 25 | 13% | 25 |
| wompi.Quokka 1.6 | 24 | 12% | 64 |
| ratosh.Nobo 0.21 | 23 | 12% | 49 |
| maribo.FollowFire 1 | 22 | 11% | 23 |
| bayen.UbaMicro 1.4 | 21 | 11% | 31 |
| m3thos.Eva00 1.1 | 18 | 9% | 40 |
| stelo.MyAgileRobot 0.2 | 13 | 7% | 18 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 81.3 | 116 / 420 | 2.69 | 18.7% | 83521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.7% | 253 |
| hadur117.micro.SaorT4 0.1 | 1.7 | 18.7% | 116 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 36 |
| ayk.WallHugger 1.0 | 4.3 | 10.1% | 7 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.3% | 7 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.4 | 17 / 35 | 7712 |
| 2 | 2 | 67.8 | 74.9 | 7 / 35 | 6632 |
| 3 | 2 | 68.2 | 78.4 | 7 / 35 | 6790 |
| 4 | 1 | 70.5 | 84.4 | 9 / 35 | 7413 |
| 5 | 2 | 69.1 | 78.1 | 8 / 35 | 7062 |
| 6 | 2 | 70.2 | 82.9 | 9 / 35 | 7577 |
| 7 | 2 | 69.4 | 80.3 | 8 / 35 | 7001 |
| 8 | 1 | 71.2 | 88.3 | 13 / 35 | 6977 |
| 9 | 2 | 69.3 | 80.0 | 10 / 35 | 6994 |
| 10 | 1 | 70.6 | 83.8 | 15 / 35 | 6863 |
| 11 | 2 | 68.2 | 74.0 | 8 / 35 | 6631 |
| 12 | 2 | 68.1 | 78.7 | 5 / 35 | 5869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 223 | 29% |
| mz.NanoGod 2.02 | 30 | 53% |
| ayk.WallHugger 1.0 | 13 | 92% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 305 of 420 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 198 | 65% | 265 |
| mz.NanoGod 2.02 | 52 | 17% | 74 |
| exauge.GateKeeper 1.1.121g | 23 | 8% | 30 |
| ayk.WallHugger 1.0 | 14 | 5% | 23 |
| stelo.PianistNano 1.2 | 9 | 3% | 12 |
| stuff.Vlad 0.1 | 8 | 3% | 11 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.2 | 204 / 420 | 3.78 | 15.7% | 53520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 15.7% | 204 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 13.3% | 49 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.9 | 11.3% | 44 |
| bvh.micro.Freya 0.3 | 4.5 | 11.0% | 30 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.6% | 20 |
| conscience.Electron 1.3g | 6.9 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 18 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 66.7 | 16 / 35 | 4470 |
| 2 | 1 | 63.4 | 70.2 | 16 / 35 | 4362 |
| 3 | 1 | 63.9 | 68.9 | 16 / 35 | 4842 |
| 4 | 1 | 62.0 | 64.4 | 16 / 35 | 4225 |
| 5 | 1 | 62.7 | 66.0 | 16 / 35 | 4392 |
| 6 | 1 | 60.9 | 61.6 | 14 / 35 | 4322 |
| 7 | 1 | 65.9 | 76.8 | 22 / 35 | 4644 |
| 8 | 1 | 62.4 | 67.6 | 15 / 35 | 4448 |
| 9 | 1 | 64.2 | 74.6 | 18 / 35 | 4347 |
| 10 | 1 | 65.8 | 76.8 | 21 / 35 | 4514 |
| 11 | 1 | 63.6 | 69.2 | 18 / 35 | 4415 |
| 12 | 1 | 62.7 | 67.0 | 16 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 76 | 92% |
| dummy.micro.Sparrow 2.5 | 57 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 41 | 85% |
| bvh.micro.Freya 0.3 | 30 | 93% |
| stelo.MirrorMicro 1.0 | 14 | 50% |
| ap.Frederick 1.1 | 9 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 217 of 420 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 39 | 18% | 46 |
| mn.nano.perceptual.Impact 1.3.0 | 38 | 18% | 35 |
| dummy.micro.Sparrow 2.5 | 37 | 17% | 94 |
| voidious.micro.BlitzBat 1.05 | 28 | 13% | 81 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 12% | 76 |
| stelo.MirrorMicro 1.0 | 19 | 9% | 30 |
| dl.BetterWalls 1.0 | 15 | 7% | 28 |
| bvh.micro.Freya 0.3 | 14 | 6% | 28 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.1 | 296 / 420 | 2.25 | 20.6% | 79370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 20.6% | 296 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.0% | 36 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 22 |
| supersample.SuperBoxBot 1.0 | 4.1 | 11.0% | 23 |
| dsw.StaticD 1.0 | 5.3 | 9.4% | 23 |
| mme.NikeEnhanced 2.0 | 5.4 | 9.3% | 9 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.8% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 8.9 | 5.7% | 10 |
| sample.Corners 1.0 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.0 | 32 / 35 | 7275 |
| 2 | 1 | 70.6 | 84.4 | 25 / 35 | 6651 |
| 3 | 1 | 70.8 | 85.4 | 22 / 35 | 6829 |
| 4 | 1 | 70.3 | 84.8 | 24 / 35 | 6479 |
| 5 | 1 | 68.6 | 80.0 | 20 / 35 | 5926 |
| 6 | 1 | 69.8 | 82.5 | 22 / 35 | 6667 |
| 7 | 1 | 70.4 | 82.9 | 24 / 35 | 6702 |
| 8 | 1 | 72.0 | 92.4 | 27 / 35 | 6923 |
| 9 | 1 | 70.7 | 89.2 | 25 / 35 | 6454 |
| 10 | 1 | 71.6 | 87.0 | 27 / 35 | 6739 |
| 11 | 1 | 69.3 | 84.1 | 25 / 35 | 5925 |
| 12 | 1 | 70.9 | 86.7 | 23 / 35 | 6800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 96 | 91% |
| sul.Lunar 1.1 | 96 | 98% |
| supersample.SuperBoxBot 1.0 | 53 | 91% |
| dsw.StaticD 1.0 | 29 | 62% |
| mme.NikeEnhanced 2.0 | 18 | 89% |
| sample.MyFirstRobot 1.0 | 12 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.Corners 1.0 | 6 | 100% |

Hadur died in 127 of 420 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 34 | 27% | 127 |
| dsw.StaticD 1.0 | 30 | 24% | 64 |
| supersample.SuperBoxBot 1.0 | 28 | 22% | 67 |
| mme.NikeEnhanced 2.0 | 11 | 9% | 23 |
| sul.Lunar 1.1 | 5 | 4% | 97 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 4% | 14 |
| sample.MyFirstRobot 1.0 | 5 | 4% | 11 |
| sample.Corners 1.0 | 3 | 2% | 12 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 5 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorT4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.2 | 213 / 420 | 2.87 | 17.9% | 70864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT4 0.1 | 1.0 | 17.9% | 213 |
| radnor.DoctorBob 1.42 | 2.2 | 13.6% | 72 |
| mld.Wisdom 1.0 | 3.1 | 12.1% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.3% | 41 |
| amz.NanoClone 1.41 | 5.1 | 10.3% | 28 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 17 |
| sample.Walls 1.0 | 7.3 | 7.6% | 7 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 7 |
| sample.Target 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.3 | 16 / 35 | 5960 |
| 2 | 1 | 67.4 | 78.4 | 19 / 35 | 6031 |
| 3 | 1 | 70.1 | 90.2 | 25 / 35 | 6004 |
| 4 | 1 | 66.2 | 78.7 | 17 / 35 | 5440 |
| 5 | 1 | 65.1 | 72.4 | 17 / 35 | 5628 |
| 6 | 1 | 65.8 | 74.9 | 14 / 35 | 5757 |
| 7 | 1 | 67.6 | 81.3 | 16 / 35 | 5873 |
| 8 | 1 | 65.9 | 77.1 | 13 / 35 | 5631 |
| 9 | 1 | 69.0 | 84.1 | 20 / 35 | 6535 |
| 10 | 1 | 65.2 | 72.7 | 17 / 35 | 5354 |
| 11 | 1 | 68.8 | 82.9 | 20 / 35 | 6601 |
| 12 | 1 | 68.7 | 84.4 | 19 / 35 | 6050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 76 | 96% |
| radnor.DoctorBob 1.42 | 74 | 65% |
| mld.Wisdom 1.0 | 30 | 83% |
| amz.NanoClone 1.41 | 29 | 62% |
| KiraNL.Chupacabra 0.4 | 23 | 65% |
| GarmBox.Oranges 1.0 | 13 | 92% |
| sample.Walls 1.0 | 10 | 100% |
| jangs.ns51 1.0 | 10 | 90% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 208 of 420 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 60 | 29% | 114 |
| mld.Wisdom 1.0 | 41 | 20% | 71 |
| amz.NanoClone 1.41 | 32 | 15% | 44 |
| KiraNL.Chupacabra 0.4 | 31 | 15% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 14% | 101 |
| jangs.ns51 1.0 | 10 | 5% | 13 |
| GarmBox.Oranges 1.0 | 3 | 1% | 8 |
| sample.Walls 1.0 | 2 | 1% | 18 |

