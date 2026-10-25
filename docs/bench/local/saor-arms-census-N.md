# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.0 | 247 / 420 | 2.35 | 19.4% | 72199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 19.4% | 247 |
| radnor.DoctorBob 1.42 | 2.3 | 14.9% | 61 |
| mz.AntiGrav 1.0 | 3.3 | 14.1% | 46 |
| mld.Infinity 2.2 | 3.4 | 13.9% | 46 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 15 |
| GarmBox.Oranges 1.0 | 6.6 | 7.1% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 4 |
| arthord.MannyPacquiao Beta | 9.4 | 4.0% | 0 |
| sample.Target 1.0 | 9.6 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 77.5 | 17 / 35 | 5582 |
| 2 | 1 | 71.1 | 89.2 | 25 / 35 | 6135 |
| 3 | 1 | 70.1 | 85.7 | 21 / 35 | 6064 |
| 4 | 1 | 71.5 | 90.5 | 22 / 35 | 6309 |
| 5 | 1 | 68.3 | 81.6 | 17 / 35 | 5736 |
| 6 | 1 | 71.5 | 90.2 | 22 / 35 | 6349 |
| 7 | 1 | 70.3 | 86.7 | 23 / 35 | 5977 |
| 8 | 1 | 69.7 | 82.5 | 23 / 35 | 6193 |
| 9 | 1 | 67.4 | 77.8 | 15 / 35 | 5028 |
| 10 | 1 | 72.4 | 92.4 | 24 / 35 | 6647 |
| 11 | 1 | 70.5 | 84.8 | 21 / 35 | 6154 |
| 12 | 1 | 68.9 | 81.6 | 17 / 35 | 6025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 101 | 95% |
| mld.Infinity 2.2 | 89 | 82% |
| radnor.DoctorBob 1.42 | 81 | 63% |
| amz.NanoClone 1.41 | 12 | 75% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 173 of 420 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 84 | 49% | 166 |
| mld.Infinity 2.2 | 37 | 21% | 47 |
| mz.AntiGrav 1.0 | 24 | 14% | 131 |
| amz.NanoClone 1.41 | 13 | 8% | 24 |
| jangs.ns51 1.0 | 6 | 3% | 11 |
| sample.Walls 1.0 | 5 | 3% | 21 |
| GarmBox.Oranges 1.0 | 3 | 2% | 9 |
| arthord.MannyPacquiao Beta | 1 | 1% | 8 |

## Melee bench: F02

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.9 | 280 / 420 | 2.54 | 17.8% | 53367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.5 | 17.8% | 280 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.7% | 87 |
| mld.DustBunny 3.8 | 3.2 | 13.1% | 23 |
| maribo.melee.BMV 0.1 | 4.4 | 10.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.0% | 9 |
| zyx.nano.Ant 1.1 | 5.6 | 9.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.5% | 12 |
| fullsail.SweetTea 1.1 | 8.0 | 7.1% | 2 |
| bzdp.BoxCar 2.0 | 8.1 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.1 | 25 / 35 | 4168 |
| 2 | 1 | 69.9 | 92.4 | 29 / 35 | 4857 |
| 3 | 1 | 68.4 | 87.3 | 24 / 35 | 4478 |
| 4 | 1 | 68.6 | 88.9 | 25 / 35 | 4259 |
| 5 | 1 | 67.0 | 83.2 | 21 / 35 | 4507 |
| 6 | 1 | 67.5 | 84.1 | 24 / 35 | 4886 |
| 7 | 1 | 69.2 | 93.7 | 28 / 35 | 4621 |
| 8 | 1 | 69.1 | 93.0 | 24 / 35 | 5086 |
| 9 | 7 | 46.6 | 30.2 | 8 / 35 | 2917 |
| 10 | 1 | 66.6 | 82.2 | 24 / 35 | 4153 |
| 11 | 1 | 68.0 | 86.7 | 22 / 35 | 4606 |
| 12 | 1 | 68.7 | 87.9 | 26 / 35 | 4829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 158 | 78% |
| mld.DustBunny 3.8 | 92 | 96% |
| djdjdj.NanoSkunk10 1.0 | 19 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 88% |
| fullsail.SweetTea 1.1 | 12 | 92% |
| zyx.nano.Ant 1.1 | 12 | 92% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 141 of 420 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 40% | 180 |
| cs.Grudge 1.0 | 18 | 13% | 17 |
| zyx.nano.Ant 1.1 | 17 | 12% | 26 |
| mld.DustBunny 3.8 | 16 | 11% | 90 |
| fullsail.SweetTea 1.1 | 14 | 10% | 27 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 5% | 24 |
| bzdp.BoxCar 2.0 | 5 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 27 |
| maribo.melee.BMV 0.1 | 4 | 3% | 19 |

## Melee bench: F03

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 75.8 | 238 / 420 | 3.18 | 17.5% | 58725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 17.5% | 238 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 71 |
| myl.nano.KomoriNinja 1.1 | 3.4 | 12.4% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.1% | 28 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 27 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 10 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.6% | 2 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 11 |
| sample.Fire 1.0 | 9.3 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 71.7 | 17 / 35 | 4702 |
| 2 | 1 | 68.8 | 81.3 | 22 / 35 | 5541 |
| 3 | 1 | 64.4 | 72.4 | 16 / 35 | 4281 |
| 4 | 1 | 67.8 | 79.7 | 22 / 35 | 5196 |
| 5 | 1 | 68.4 | 82.2 | 25 / 35 | 4883 |
| 6 | 1 | 68.2 | 81.9 | 25 / 35 | 4688 |
| 7 | 1 | 65.8 | 73.0 | 20 / 35 | 4878 |
| 8 | 1 | 64.0 | 71.4 | 16 / 35 | 4396 |
| 9 | 1 | 68.2 | 78.7 | 21 / 35 | 5497 |
| 10 | 1 | 66.6 | 76.2 | 19 / 35 | 5056 |
| 11 | 1 | 65.6 | 72.1 | 19 / 35 | 4883 |
| 12 | 1 | 64.3 | 68.9 | 16 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 98 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 62 | 97% |
| cb.nano.Insomnia 1.0 | 38 | 74% |
| myl.nano.KomoriNinja 1.1 | 26 | 81% |
| sp.Nanos.Ember 1.1 | 23 | 83% |
| fm.mammillarias 1.3 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 183 of 420 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 35 | 19% | 27 |
| myl.micro.Troodon 1.10 | 33 | 18% | 132 |
| myl.nano.KomoriNinja 1.1 | 25 | 14% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 13% | 69 |
| fm.mammillarias 1.3 | 19 | 10% | 28 |
| cs.sheldor.Talon 1.1 | 15 | 8% | 26 |
| sample.Fire 1.0 | 13 | 7% | 22 |
| sp.Nanos.Ember 1.1 | 11 | 6% | 29 |
| sample.Tracker 1.0 | 9 | 5% | 9 |

## Melee bench: F04

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.6 | 233 / 420 | 2.92 | 17.9% | 64006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 17.9% | 233 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.2% | 46 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 49 |
| tj.zombie1n 1.0.1 | 4.8 | 9.6% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 9.3% | 4 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.6% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.4% | 13 |
| yk.JahMicro 1.0 | 7.1 | 8.2% | 13 |
| repositorio.NanoStep 1.0 | 9.1 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 9.9 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.8 | 14 / 35 | 5343 |
| 2 | 1 | 67.7 | 82.5 | 19 / 35 | 5592 |
| 3 | 1 | 68.1 | 81.6 | 18 / 35 | 5890 |
| 4 | 1 | 63.8 | 68.6 | 18 / 35 | 4953 |
| 5 | 1 | 65.2 | 74.3 | 19 / 35 | 4819 |
| 6 | 1 | 67.6 | 82.5 | 21 / 35 | 5237 |
| 7 | 1 | 66.8 | 79.0 | 21 / 35 | 5296 |
| 8 | 1 | 66.3 | 74.6 | 20 / 35 | 5274 |
| 9 | 1 | 67.5 | 80.6 | 19 / 35 | 5719 |
| 10 | 1 | 67.5 | 80.6 | 20 / 35 | 5481 |
| 11 | 1 | 69.7 | 88.6 | 24 / 35 | 5389 |
| 12 | 1 | 65.1 | 73.7 | 20 / 35 | 5013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 103 | 78% |
| stelo.SoJNanoMelee 1.1 | 70 | 91% |
| tvv.micro.Antares 1.1.1 | 31 | 65% |
| tj.zombie1n 1.0.1 | 26 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 90% |
| yk.JahMicro 1.0 | 19 | 79% |
| sample.VelociRobot 1.0 | 8 | 88% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 187 of 420 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 77 | 41% | 174 |
| tvv.micro.Antares 1.1.1 | 35 | 19% | 67 |
| stelo.SoJNanoMelee 1.1 | 21 | 11% | 62 |
| yk.JahMicro 1.0 | 14 | 7% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 7% | 16 |
| tj.zombie1n 1.0.1 | 12 | 6% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 11 | 6% | 36 |
| sample.VelociRobot 1.0 | 2 | 1% | 13 |
| repositorio.NanoStep 1.0 | 2 | 1% | 12 |

## Melee bench: F05

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 62.2 | 159 / 420 | 4.40 | 13.5% | 43133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.9 | 13.5% | 159 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 66 |
| simonton.nano.MeleeSeed 1.8 | 2.9 | 12.5% | 57 |
| ahf.NanoAndrew .4 | 3.1 | 11.9% | 69 |
| sam.Samspin 1.0 | 5.7 | 10.0% | 28 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 15 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.3% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7.1 | 8.9% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 7.1% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.1 | 52.1 | 11 / 35 | 3396 |
| 2 | 2 | 57.7 | 57.8 | 11 / 35 | 3440 |
| 3 | 1 | 64.9 | 77.8 | 20 / 35 | 4310 |
| 4 | 2 | 58.4 | 61.6 | 12 / 35 | 3391 |
| 5 | 1 | 59.7 | 62.5 | 12 / 35 | 3800 |
| 6 | 1 | 56.7 | 57.5 | 9 / 35 | 3536 |
| 7 | 1 | 65.3 | 80.3 | 20 / 35 | 3850 |
| 8 | 3 | 58.8 | 61.6 | 13 / 35 | 3488 |
| 9 | 1 | 59.1 | 60.6 | 14 / 35 | 3791 |
| 10 | 5 | 51.6 | 45.7 | 7 / 35 | 2966 |
| 11 | 2 | 58.2 | 57.8 | 13 / 35 | 3475 |
| 12 | 1 | 62.1 | 70.8 | 17 / 35 | 3690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 63 | 83% |
| oog.melee.Corsair 1.0 | 44 | 70% |
| ahf.NanoAndrew .4 | 41 | 73% |
| EBBU.Sim2 1.02 | 13 | 85% |
| sam.Samspin 1.0 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 11 | 91% |
| zyx.nano.BacillusComma 1.0 | 11 | 91% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 262 of 420 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 67 | 26% | 105 |
| ahf.NanoAndrew .4 | 35 | 13% | 68 |
| bwbaugh.nano.Tirunculus 0.0.0a | 35 | 13% | 36 |
| zyx.nano.BacillusComma 1.0 | 32 | 12% | 41 |
| oog.melee.Corsair 1.0 | 26 | 10% | 65 |
| robar.nano.Assertive_Melee 0.2 | 21 | 8% | 29 |
| EBBU.Sim2 1.02 | 20 | 8% | 32 |
| sam.Samspin 1.0 | 15 | 6% | 29 |
| sample.TrackFire 1.0 | 11 | 4% | 13 |

## Melee bench: F06

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.4 | 247 / 420 | 2.85 | 17.1% | 51371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.1 | 17.1% | 247 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 60 |
| gh.nano.Grofvuil 0.2 | 3.1 | 12.2% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.0% | 40 |
| winamp32.micro.MicroMacro 1.0 | 5.1 | 9.6% | 26 |
| arthord.NanoSatanMelee Beta | 5.9 | 8.9% | 6 |
| fm.claire 1.7 | 7.0 | 8.4% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.6% | 9 |
| pa.Improved 1.0 | 9.1 | 6.1% | 2 |
| kurios.DOSexe .9b | 9.9 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.0 | 22 / 35 | 4573 |
| 2 | 1 | 64.8 | 77.8 | 20 / 35 | 3971 |
| 3 | 1 | 65.7 | 81.3 | 19 / 35 | 4204 |
| 4 | 1 | 66.8 | 84.1 | 21 / 35 | 4310 |
| 5 | 1 | 67.6 | 85.1 | 19 / 35 | 4901 |
| 6 | 1 | 65.7 | 81.6 | 18 / 35 | 4279 |
| 7 | 1 | 63.8 | 72.1 | 21 / 35 | 4043 |
| 8 | 1 | 66.3 | 81.6 | 24 / 35 | 4138 |
| 9 | 1 | 68.1 | 87.0 | 26 / 35 | 4563 |
| 10 | 1 | 65.1 | 77.1 | 19 / 35 | 4290 |
| 11 | 1 | 66.0 | 80.6 | 22 / 35 | 4347 |
| 12 | 2 | 60.8 | 63.8 | 16 / 35 | 3752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 111 | 91% |
| oog.melee.CapuletDroid 1.1 | 56 | 75% |
| gh.nano.Grofvuil 0.2 | 48 | 79% |
| arthord.NanoSatanMelee Beta | 26 | 100% |
| winamp32.micro.MicroMacro 1.0 | 19 | 63% |
| sample.SpinBot 1.0 | 14 | 86% |
| kurios.DOSexe .9b | 11 | 73% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 176 of 420 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 43 | 24% | 98 |
| oog.melee.CapuletDroid 1.1 | 37 | 21% | 31 |
| d414.nano.Quantum 1.0.0 | 28 | 16% | 123 |
| arthord.NanoSatanMelee Beta | 18 | 10% | 52 |
| winamp32.micro.MicroMacro 1.0 | 13 | 7% | 44 |
| sample.SpinBot 1.0 | 10 | 6% | 19 |
| fm.claire 1.7 | 10 | 6% | 16 |
| kurios.DOSexe .9b | 9 | 5% | 23 |
| pa.Improved 1.0 | 6 | 3% | 13 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.5 | 157 / 420 | 3.38 | 15.7% | 53928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.5 | 15.8% | 108 |
| hadur117.micro.SaorN 0.1 | 1.8 | 15.7% | 157 |
| mz.MicroGodMelee 1 | 3.3 | 13.4% | 72 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.7% | 50 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 16 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.9% | 7 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 9 |
| acogdev.alpha 0.2 | 8.4 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 8.5 | 6.1% | 1 |
| fire219.CatBot 1.0 | 9.1 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 65.4 | 8 / 35 | 4086 |
| 2 | 1 | 61.3 | 66.7 | 12 / 35 | 4507 |
| 3 | 1 | 66.4 | 80.6 | 16 / 35 | 4870 |
| 4 | 2 | 63.1 | 73.3 | 9 / 35 | 4390 |
| 5 | 2 | 64.8 | 78.4 | 10 / 35 | 4489 |
| 6 | 3 | 63.6 | 72.1 | 12 / 35 | 4313 |
| 7 | 1 | 67.2 | 82.2 | 17 / 35 | 5040 |
| 8 | 3 | 62.8 | 70.8 | 12 / 35 | 4336 |
| 9 | 2 | 63.4 | 71.1 | 12 / 35 | 4602 |
| 10 | 2 | 63.3 | 72.1 | 16 / 35 | 4075 |
| 11 | 2 | 64.0 | 74.0 | 18 / 35 | 4187 |
| 12 | 1 | 65.6 | 75.9 | 15 / 35 | 5033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 84 | 87% |
| mz.MicroGodMelee 1 | 68 | 44% |
| gh.micro.Gruweltje 0.7 | 66 | 30% |
| DBall.Anarchy 0.1 | 20 | 95% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| el.JumpShoot 0.2 | 5 | 80% |

Hadur died in 264 of 420 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 85 | 32% | 124 |
| gh.micro.Gruweltje 0.7 | 77 | 29% | 107 |
| spinnercat.micro.Tyger 0.1 | 38 | 14% | 94 |
| fire219.CatBot 1.0 | 24 | 9% | 23 |
| acogdev.alpha 0.2 | 14 | 5% | 16 |
| DBall.Anarchy 0.1 | 8 | 3% | 27 |
| caimano.Furia_Ceca 0.22 | 8 | 3% | 12 |
| mbro.Detektor3 0.1.1 | 6 | 2% | 11 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |

## Melee bench: F08

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 62.0 | 162 / 420 | 4.42 | 13.7% | 47503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 16.2% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.2% | 85 |
| hadur117.micro.SaorN 0.1 | 2.6 | 13.7% | 162 |
| germ.TheMind .2 | 5.0 | 9.6% | 19 |
| qualidafial.MajorDick 1.0.1 | 5.1 | 9.6% | 13 |
| awesomeness.Elite 1.0 | 6.3 | 8.7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.6% | 12 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.1% | 13 |
| sample.Crazy 1.0 | 8.4 | 7.2% | 11 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 67.3 | 13 / 35 | 3848 |
| 2 | 3 | 58.3 | 58.1 | 12 / 35 | 3806 |
| 3 | 2 | 64.4 | 74.6 | 18 / 35 | 4224 |
| 4 | 3 | 59.0 | 58.7 | 13 / 35 | 4000 |
| 5 | 2 | 63.6 | 70.8 | 18 / 35 | 4377 |
| 6 | 2 | 62.9 | 69.5 | 19 / 35 | 3855 |
| 7 | 3 | 60.5 | 62.2 | 17 / 35 | 3862 |
| 8 | 3 | 55.1 | 51.7 | 10 / 35 | 3433 |
| 9 | 3 | 54.9 | 48.9 | 8 / 35 | 3552 |
| 10 | 2 | 60.7 | 63.8 | 11 / 35 | 4336 |
| 11 | 3 | 60.4 | 63.2 | 13 / 35 | 4096 |
| 12 | 3 | 57.8 | 54.9 | 10 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 126 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 67% |
| germ.TheMind .2 | 16 | 94% |
| qualidafial.MajorDick 1.0.1 | 12 | 83% |
| awesomeness.Elite 1.0 | 10 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 260 of 420 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 125 | 48% | 209 |
| simonton.nano.WeekendObsession_Melee 1.0 | 54 | 21% | 76 |
| germ.TheMind .2 | 19 | 7% | 33 |
| qualidafial.MajorDick 1.0.1 | 15 | 6% | 19 |
| stelo.UntouchableNano 1.3 | 14 | 5% | 18 |
| lrem.micro.MoggFanatic 0.2 | 13 | 5% | 19 |
| awesomeness.Elite 1.0 | 9 | 3% | 23 |
| mym.EdgeStalker 1.0 | 9 | 3% | 16 |
| sample.Crazy 1.0 | 2 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.8 | 286 / 420 | 2.37 | 18.5% | 50590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 18.5% | 286 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.5% | 29 |
| maribo.IotaCT 1.1 | 3.9 | 11.0% | 28 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.6% | 6 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 7 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 13 |
| spinnercat.Omen 1.0 | 8.3 | 7.7% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.2 | 23 / 35 | 4273 |
| 2 | 1 | 68.7 | 86.7 | 21 / 35 | 4306 |
| 3 | 1 | 69.6 | 87.3 | 27 / 35 | 4053 |
| 4 | 1 | 69.4 | 85.4 | 26 / 35 | 4298 |
| 5 | 1 | 69.0 | 87.9 | 24 / 35 | 4218 |
| 6 | 1 | 69.2 | 85.7 | 26 / 35 | 4200 |
| 7 | 1 | 69.4 | 88.9 | 27 / 35 | 4147 |
| 8 | 1 | 67.8 | 81.6 | 22 / 35 | 4071 |
| 9 | 1 | 69.6 | 88.9 | 25 / 35 | 4503 |
| 10 | 1 | 67.3 | 83.5 | 23 / 35 | 4091 |
| 11 | 1 | 64.3 | 71.7 | 19 / 35 | 3955 |
| 12 | 1 | 69.7 | 87.9 | 23 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 128 | 98% |
| nz.jdc.nano.GridFu 1.0 | 77 | 91% |
| maribo.IotaCT 1.1 | 30 | 77% |
| stelo.PatternRobot 1.0 | 26 | 88% |
| timmit.nano.TimDog 0.33 | 17 | 82% |
| ratosh.Wesco 1.4 | 13 | 85% |
| spinnercat.Omen 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |

Hadur died in 135 of 420 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 30 | 22% | 57 |
| nz.jdc.nano.GridFu 1.0 | 25 | 19% | 110 |
| rz.HawkOnFire 0.1 | 19 | 14% | 100 |
| stelo.PatternRobot 1.0 | 18 | 13% | 32 |
| maribo.IotaCT 1.1 | 15 | 11% | 45 |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 10% | 27 |
| ratosh.Wesco 1.4 | 10 | 7% | 27 |
| spinnercat.Omen 1.0 | 3 | 2% | 15 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.1 | 301 / 420 | 2.34 | 19.2% | 64495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 19.2% | 301 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.5% | 46 |
| baal.nano.N 1.42 | 3.0 | 11.7% | 18 |
| Grystrion.TrackerWO 1.0 | 3.8 | 10.6% | 7 |
| zyx.micro.Ant 1.1 | 5.3 | 9.4% | 13 |
| sanja.First 0.1 | 6.3 | 8.3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.9 | 8.2% | 4 |
| cvt.Firsty 1.0 | 7.9 | 7.5% | 23 |
| amk.Punbot.Punbot 0.01 | 8.4 | 7.2% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.1 | 20 / 35 | 5446 |
| 2 | 1 | 68.7 | 86.3 | 25 / 35 | 5366 |
| 3 | 1 | 70.5 | 90.8 | 29 / 35 | 5905 |
| 4 | 1 | 71.1 | 95.2 | 30 / 35 | 5667 |
| 5 | 1 | 68.5 | 83.5 | 25 / 35 | 5529 |
| 6 | 1 | 70.1 | 90.5 | 27 / 35 | 5473 |
| 7 | 1 | 67.9 | 81.9 | 23 / 35 | 5379 |
| 8 | 1 | 68.1 | 81.3 | 25 / 35 | 5581 |
| 9 | 1 | 69.3 | 86.7 | 28 / 35 | 5176 |
| 10 | 1 | 67.4 | 82.2 | 22 / 35 | 5038 |
| 11 | 1 | 68.4 | 85.4 | 26 / 35 | 5163 |
| 12 | 1 | 66.7 | 80.6 | 21 / 35 | 4772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 72 | 86% |
| cvt.Firsty 1.0 | 59 | 78% |
| baal.nano.N 1.42 | 56 | 100% |
| Grystrion.TrackerWO 1.0 | 38 | 100% |
| zyx.micro.Ant 1.1 | 35 | 89% |
| sanja.First 0.1 | 31 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| squidM.TentalceMeleeNano 1.1 | 13 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 26 | 22% | 123 |
| zyx.micro.Ant 1.1 | 24 | 20% | 68 |
| cvt.Firsty 1.0 | 23 | 19% | 50 |
| sample.RamFire 1.0 | 16 | 13% | 20 |
| squidM.TentalceMeleeNano 1.1 | 9 | 8% | 20 |
| baal.nano.N 1.42 | 8 | 7% | 52 |
| Grystrion.TrackerWO 1.0 | 7 | 6% | 35 |
| sanja.First 0.1 | 6 | 5% | 33 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 9 |

## Melee bench: F11

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 56.6 | 89 / 420 | 4.91 | 11.8% | 42158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.6% | 193 |
| cs.Wren 1.0 | 2.3 | 13.6% | 60 |
| js.PinBall 1.6 | 3.5 | 11.9% | 33 |
| hadur117.micro.SaorN 0.1 | 3.8 | 11.8% | 89 |
| mz.Cork 0.1 | 4.4 | 11.3% | 25 |
| joe.ADinosaur 1.0 | 6.1 | 9.6% | 6 |
| evd.X1 0.01 | 7.0 | 7.9% | 5 |
| jsal.Jsalbot 1.0 | 7.9 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 9.3 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.4 | 50.2 | 4 / 35 | 3164 |
| 2 | 3 | 56.7 | 57.5 | 7 / 35 | 3716 |
| 3 | 4 | 56.6 | 57.1 | 8 / 35 | 3438 |
| 4 | 4 | 54.2 | 51.1 | 9 / 35 | 3390 |
| 5 | 3 | 58.1 | 59.7 | 8 / 35 | 3588 |
| 6 | 5 | 55.4 | 52.4 | 7 / 35 | 3601 |
| 7 | 5 | 53.6 | 50.2 | 11 / 35 | 3267 |
| 8 | 3 | 56.0 | 54.0 | 8 / 35 | 3451 |
| 9 | 4 | 58.4 | 62.2 | 6 / 35 | 3871 |
| 10 | 3 | 58.6 | 62.2 | 11 / 35 | 3464 |
| 11 | 3 | 57.5 | 59.7 | 4 / 35 | 3942 |
| 12 | 3 | 57.5 | 62.5 | 6 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 96 | 31% |
| cs.Wren 1.0 | 34 | 91% |
| mz.Cork 0.1 | 16 | 81% |
| js.PinBall 1.6 | 9 | 67% |
| jsal.Jsalbot 1.0 | 6 | 50% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 333 of 420 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 162 | 49% | 201 |
| joe.ADinosaur 1.0 | 35 | 11% | 37 |
| js.PinBall 1.6 | 30 | 9% | 41 |
| cs.Wren 1.0 | 27 | 8% | 39 |
| PSW.Relentless 0.1 | 25 | 8% | 29 |
| evd.X1 0.01 | 23 | 7% | 25 |
| mz.Cork 0.1 | 21 | 6% | 30 |
| jsal.Jsalbot 1.0 | 6 | 2% | 10 |
| donjezza.Jezza 1.0 | 4 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.1 | 233 / 420 | 2.97 | 16.9% | 48258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 16.9% | 233 |
| ntc.Opposite 1.5 | 3.3 | 11.8% | 22 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.3% | 46 |
| myl.nano.Graviton 1.10 | 3.7 | 11.3% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.3% | 18 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 17 |
| DBall.NUKE 0.1 | 7.4 | 8.0% | 12 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 19 / 35 | 4001 |
| 2 | 1 | 62.7 | 69.8 | 18 / 35 | 3988 |
| 3 | 1 | 65.8 | 81.3 | 20 / 35 | 3884 |
| 4 | 1 | 64.2 | 75.6 | 17 / 35 | 3968 |
| 5 | 1 | 66.6 | 81.9 | 24 / 35 | 3988 |
| 6 | 1 | 64.2 | 73.3 | 18 / 35 | 3726 |
| 7 | 1 | 64.8 | 77.1 | 19 / 35 | 4089 |
| 8 | 1 | 67.1 | 82.9 | 21 / 35 | 4394 |
| 9 | 1 | 64.2 | 75.6 | 16 / 35 | 3893 |
| 10 | 1 | 66.4 | 80.0 | 22 / 35 | 4138 |
| 11 | 1 | 64.4 | 74.6 | 19 / 35 | 3920 |
| 12 | 1 | 66.4 | 81.0 | 20 / 35 | 4269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 64 | 81% |
| myl.nano.Graviton 1.10 | 51 | 82% |
| ntc.Opposite 1.5 | 38 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 32 | 97% |
| DBall.NUKE 0.1 | 29 | 93% |
| donjezza.Muncho 1.0 | 22 | 82% |
| disan.Chair 2.2.0 | 20 | 85% |
| pfvicm.Sobieski 7.2.3b | 13 | 69% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 192 of 420 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 46 | 24% | 69 |
| stelo.AreaTargetingBot 1.1 | 34 | 18% | 76 |
| myl.nano.Graviton 1.10 | 29 | 15% | 74 |
| ntc.Opposite 1.5 | 24 | 13% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 11% | 44 |
| disan.Chair 2.2.0 | 11 | 6% | 29 |
| DBall.NUKE 0.1 | 9 | 5% | 36 |
| donjezza.Muncho 1.0 | 8 | 4% | 18 |
| pbg.R2D2 1.0 | 8 | 4% | 17 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 63.5 | 126 / 420 | 4.29 | 13.3% | 40024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 15.1% | 113 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 82 |
| hadur117.micro.SaorN 0.1 | 3.3 | 13.3% | 126 |
| yagami.Tidus 0.11 | 4.0 | 12.7% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 45 |
| ejb.Polaris 1.0.1 | 5.8 | 11.0% | 30 |
| stelo.MirrorNano 1.3 | 7.4 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 1 |
| kurios.DOSexe .9a | 8.9 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 58.7 | 8 / 35 | 3134 |
| 2 | 4 | 59.6 | 64.1 | 5 / 35 | 3384 |
| 3 | 1 | 63.4 | 71.7 | 15 / 35 | 3695 |
| 4 | 3 | 59.7 | 64.4 | 11 / 35 | 3316 |
| 5 | 4 | 58.9 | 59.7 | 4 / 35 | 3168 |
| 6 | 6 | 56.7 | 55.9 | 9 / 35 | 2741 |
| 7 | 3 | 60.1 | 63.8 | 10 / 35 | 3328 |
| 8 | 3 | 61.4 | 64.4 | 14 / 35 | 3633 |
| 9 | 2 | 60.6 | 60.6 | 14 / 35 | 3634 |
| 10 | 4 | 61.1 | 65.1 | 13 / 35 | 3290 |
| 11 | 5 | 58.6 | 58.4 | 7 / 35 | 3289 |
| 12 | 1 | 64.8 | 74.6 | 16 / 35 | 3412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 52% |
| kawigi.micro.Shiz 1.1 | 39 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 70% |
| yagami.Tidus 0.11 | 30 | 90% |
| ejb.Polaris 1.0.1 | 18 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 294 of 420 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 132 | 45% | 166 |
| yagami.Tidus 0.11 | 44 | 15% | 64 |
| ejb.Polaris 1.0.1 | 36 | 12% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 6% | 41 |
| kurios.DOSexe .9a | 19 | 6% | 20 |
| kawigi.micro.Shiz 1.1 | 17 | 6% | 46 |
| stelo.MirrorNano 1.3 | 16 | 5% | 16 |
| step.nanoPri 1.0 | 11 | 4% | 12 |

## Melee bench: F14

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 72.3 | 204 / 420 | 3.50 | 15.2% | 43499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 15.2% | 204 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 49 |
| wee.Gem 1.8.4 | 3.0 | 12.5% | 68 |
| wompi.Quokka 1.6 | 3.7 | 12.1% | 47 |
| ratosh.Nobo 0.21 | 4.4 | 11.3% | 29 |
| m3thos.Eva00 1.1 | 6.2 | 9.8% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 9.0% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 2 |
| maribo.FollowFire 1 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 68.9 | 13 / 35 | 3589 |
| 2 | 1 | 61.6 | 69.2 | 17 / 35 | 3366 |
| 3 | 1 | 62.7 | 70.8 | 16 / 35 | 3943 |
| 4 | 1 | 64.1 | 75.6 | 18 / 35 | 3752 |
| 5 | 1 | 63.1 | 72.1 | 21 / 35 | 3850 |
| 6 | 1 | 62.6 | 71.4 | 17 / 35 | 3605 |
| 7 | 1 | 61.3 | 70.8 | 13 / 35 | 3316 |
| 8 | 1 | 65.6 | 81.6 | 21 / 35 | 4037 |
| 9 | 1 | 63.4 | 74.3 | 16 / 35 | 3745 |
| 10 | 1 | 62.5 | 72.4 | 15 / 35 | 3607 |
| 11 | 1 | 60.7 | 67.0 | 18 / 35 | 3079 |
| 12 | 1 | 63.3 | 73.3 | 19 / 35 | 3610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 78 | 85% |
| bzdp.Pansy 2.1 | 73 | 86% |
| wompi.Quokka 1.6 | 37 | 78% |
| m3thos.Eva00 1.1 | 23 | 96% |
| ratosh.Nobo 0.21 | 21 | 67% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 217 of 420 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 37 | 17% | 62 |
| wee.Gem 1.8.4 | 31 | 14% | 95 |
| bzdp.Pansy 2.1 | 29 | 13% | 84 |
| maribo.FollowFire 1 | 29 | 13% | 32 |
| bayen.UbaMicro 1.4 | 21 | 10% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 20 | 9% | 22 |
| m3thos.Eva00 1.1 | 17 | 8% | 28 |
| stelo.MyAgileRobot 0.2 | 17 | 8% | 22 |
| ratosh.Nobo 0.21 | 15 | 7% | 40 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 78.6 | 112 / 420 | 2.93 | 17.3% | 70925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.1% | 262 |
| hadur117.micro.SaorN 0.1 | 2.0 | 17.3% | 112 |
| mz.NanoGod 2.02 | 3.0 | 15.4% | 38 |
| ayk.WallHugger 1.0 | 4.0 | 10.4% | 2 |
| exauge.GateKeeper 1.1.121g | 5.6 | 8.8% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 76.8 | 8 / 35 | 5847 |
| 2 | 2 | 66.5 | 77.1 | 5 / 35 | 5881 |
| 3 | 2 | 68.0 | 79.4 | 14 / 35 | 5929 |
| 4 | 2 | 69.1 | 82.2 | 7 / 35 | 6530 |
| 5 | 2 | 68.3 | 79.4 | 12 / 35 | 5975 |
| 6 | 2 | 67.6 | 81.6 | 7 / 35 | 5586 |
| 7 | 2 | 68.7 | 81.6 | 13 / 35 | 6027 |
| 8 | 2 | 67.8 | 78.7 | 11 / 35 | 5881 |
| 9 | 2 | 66.5 | 75.6 | 7 / 35 | 5456 |
| 10 | 2 | 68.1 | 79.0 | 10 / 35 | 6186 |
| 11 | 2 | 65.6 | 73.0 | 6 / 35 | 5341 |
| 12 | 2 | 68.5 | 78.4 | 12 / 35 | 6286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 206 | 26% |
| mz.NanoGod 2.02 | 36 | 78% |
| ayk.WallHugger 1.0 | 13 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| exauge.GateKeeper 1.1.121g | 5 | 60% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 310 of 420 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 192 | 62% | 255 |
| mz.NanoGod 2.02 | 69 | 22% | 94 |
| exauge.GateKeeper 1.1.121g | 19 | 6% | 22 |
| ayk.WallHugger 1.0 | 18 | 6% | 27 |
| stelo.PianistNano 1.2 | 5 | 2% | 7 |
| stuff.Vlad 0.1 | 4 | 1% | 9 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |
| cli.WasteOfAmmo 1.0 | 1 | 0% | 1 |
| sample.SittingDuck 1.0 | 1 | 0% | 0 |

## Melee bench: F16

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 66.0 | 196 / 420 | 4.06 | 14.5% | 44084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.5 | 14.5% | 196 |
| voidious.micro.BlitzBat 1.05 | 1.9 | 13.2% | 48 |
| dummy.micro.Sparrow 2.5 | 3.6 | 12.0% | 38 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 39 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 47 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.4% | 18 |
| conscience.Electron 1.3g | 6.8 | 8.7% | 4 |
| dl.BetterWalls 1.0 | 8.3 | 6.9% | 7 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 68.9 | 17 / 35 | 3683 |
| 2 | 1 | 65.5 | 78.7 | 24 / 35 | 4090 |
| 3 | 1 | 62.3 | 67.9 | 16 / 35 | 3987 |
| 4 | 2 | 58.1 | 58.7 | 11 / 35 | 3503 |
| 5 | 1 | 57.8 | 58.1 | 14 / 35 | 3445 |
| 6 | 1 | 63.0 | 70.5 | 16 / 35 | 3970 |
| 7 | 2 | 60.0 | 63.8 | 17 / 35 | 3572 |
| 8 | 1 | 60.6 | 64.1 | 16 / 35 | 3650 |
| 9 | 1 | 62.3 | 67.9 | 19 / 35 | 3562 |
| 10 | 1 | 64.3 | 78.1 | 20 / 35 | 3696 |
| 11 | 1 | 62.1 | 69.8 | 15 / 35 | 3864 |
| 12 | 5 | 52.7 | 44.8 | 11 / 35 | 3062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 68 | 88% |
| dummy.micro.Sparrow 2.5 | 48 | 92% |
| bvh.micro.Freya 0.3 | 41 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 37 | 89% |
| stelo.MirrorMicro 1.0 | 17 | 65% |
| ap.Frederick 1.1 | 7 | 86% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 226 of 420 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 53 | 23% | 53 |
| dummy.micro.Sparrow 2.5 | 33 | 15% | 78 |
| voidious.micro.BlitzBat 1.05 | 31 | 14% | 82 |
| conscience.Electron 1.3g | 28 | 12% | 38 |
| bvh.micro.Freya 0.3 | 24 | 11% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 10% | 62 |
| stelo.MirrorMicro 1.0 | 19 | 8% | 37 |
| dl.BetterWalls 1.0 | 13 | 6% | 26 |
| ap.Frederick 1.1 | 2 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.2 | 256 / 420 | 2.87 | 18.4% | 68571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 18.4% | 256 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 42 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.7% | 20 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 33 |
| dsw.StaticD 1.0 | 5.5 | 9.3% | 26 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.3% | 11 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.5% | 5 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.4% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 10 |
| sample.Corners 1.0 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 73.7 | 19 / 35 | 5498 |
| 2 | 1 | 70.5 | 88.9 | 26 / 35 | 6075 |
| 3 | 1 | 66.4 | 74.0 | 21 / 35 | 5366 |
| 4 | 1 | 67.1 | 75.9 | 21 / 35 | 5667 |
| 5 | 1 | 66.5 | 73.7 | 17 / 35 | 5770 |
| 6 | 1 | 67.9 | 81.6 | 22 / 35 | 5589 |
| 7 | 1 | 69.5 | 84.8 | 24 / 35 | 5958 |
| 8 | 1 | 65.4 | 68.9 | 18 / 35 | 5606 |
| 9 | 1 | 66.7 | 77.1 | 20 / 35 | 5492 |
| 10 | 1 | 69.6 | 87.0 | 26 / 35 | 5609 |
| 11 | 1 | 69.9 | 85.1 | 21 / 35 | 6273 |
| 12 | 1 | 67.7 | 79.7 | 21 / 35 | 5668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 99 | 90% |
| sul.Lunar 1.1 | 71 | 100% |
| supersample.SuperBoxBot 1.0 | 43 | 98% |
| dsw.StaticD 1.0 | 28 | 36% |
| sample.MyFirstRobot 1.0 | 14 | 64% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 165 of 420 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 54 | 33% | 88 |
| dsw.StaticD 1.0 | 37 | 22% | 51 |
| sheldor.melee.nano.TestMelee 0.1 | 26 | 16% | 112 |
| sul.Lunar 1.1 | 13 | 8% | 84 |
| sample.MyFirstRobot 1.0 | 11 | 7% | 19 |
| mme.NikeEnhanced 2.0 | 7 | 4% | 25 |
| sample.Corners 1.0 | 7 | 4% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 3% | 15 |
| tlp.ThreeLeggedPig 1 | 5 | 3% | 12 |

## Melee bench: F18

hadur117.micro.SaorN 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.3 | 187 / 420 | 3.31 | 16.2% | 59993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorN 0.1 | 1.0 | 16.2% | 187 |
| radnor.DoctorBob 1.42 | 2.4 | 13.8% | 89 |
| mld.Wisdom 1.0 | 3.7 | 12.4% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 39 |
| KiraNL.Chupacabra 0.4 | 5.1 | 10.1% | 17 |
| amz.NanoClone 1.41 | 5.1 | 10.3% | 22 |
| sample.Walls 1.0 | 7.5 | 8.0% | 10 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 12 |
| sample.Target 1.0 | 10.0 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 70.2 | 16 / 35 | 4923 |
| 2 | 1 | 62.1 | 67.0 | 14 / 35 | 4247 |
| 3 | 1 | 66.6 | 79.7 | 20 / 35 | 5116 |
| 4 | 1 | 65.8 | 78.4 | 15 / 35 | 5280 |
| 5 | 1 | 66.0 | 79.7 | 17 / 35 | 4975 |
| 6 | 1 | 65.5 | 76.5 | 18 / 35 | 5041 |
| 7 | 1 | 65.9 | 79.0 | 18 / 35 | 4934 |
| 8 | 1 | 60.3 | 61.9 | 8 / 35 | 4829 |
| 9 | 1 | 64.0 | 73.0 | 16 / 35 | 5114 |
| 10 | 1 | 66.1 | 81.3 | 13 / 35 | 5281 |
| 11 | 1 | 62.3 | 67.9 | 13 / 35 | 4878 |
| 12 | 1 | 65.6 | 76.8 | 19 / 35 | 5375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 105 | 90% |
| radnor.DoctorBob 1.42 | 73 | 45% |
| mld.Wisdom 1.0 | 21 | 71% |
| KiraNL.Chupacabra 0.4 | 15 | 87% |
| amz.NanoClone 1.41 | 13 | 77% |
| jangs.ns51 1.0 | 11 | 73% |
| GarmBox.Oranges 1.0 | 9 | 100% |
| sample.Walls 1.0 | 5 | 100% |

Hadur died in 234 of 420 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 74 | 32% | 108 |
| mld.Wisdom 1.0 | 49 | 21% | 67 |
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 18% | 128 |
| KiraNL.Chupacabra 0.4 | 26 | 11% | 37 |
| amz.NanoClone 1.41 | 16 | 7% | 30 |
| sample.Walls 1.0 | 15 | 6% | 27 |
| jangs.ns51 1.0 | 9 | 4% | 12 |
| GarmBox.Oranges 1.0 | 4 | 2% | 8 |

