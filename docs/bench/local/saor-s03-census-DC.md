# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.5 | 300 / 420 | 2.13 | 21.0% | 83401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.0% | 300 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 42 |
| mld.Infinity 2.2 | 3.1 | 13.2% | 36 |
| mz.AntiGrav 1.0 | 3.2 | 13.9% | 27 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 8 |
| sample.Walls 1.0 | 6.3 | 7.2% | 4 |
| GarmBox.Oranges 1.0 | 6.9 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 79.0 | 21 / 35 | 6564 |
| 2 | 1 | 72.8 | 89.2 | 27 / 35 | 7395 |
| 3 | 1 | 72.4 | 89.8 | 25 / 35 | 7064 |
| 4 | 1 | 71.3 | 86.7 | 22 / 35 | 7002 |
| 5 | 1 | 73.4 | 94.9 | 27 / 35 | 7104 |
| 6 | 1 | 72.3 | 90.2 | 24 / 35 | 7046 |
| 7 | 1 | 72.1 | 87.3 | 29 / 35 | 6669 |
| 8 | 1 | 70.2 | 82.2 | 24 / 35 | 6375 |
| 9 | 1 | 71.1 | 85.7 | 25 / 35 | 6793 |
| 10 | 1 | 70.5 | 83.2 | 22 / 35 | 6638 |
| 11 | 1 | 72.7 | 87.9 | 26 / 35 | 7376 |
| 12 | 1 | 73.4 | 93.3 | 28 / 35 | 7375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 129 | 98% |
| mld.Infinity 2.2 | 84 | 92% |
| radnor.DoctorBob 1.42 | 74 | 88% |
| jangs.ns51 1.0 | 11 | 82% |
| amz.NanoClone 1.41 | 11 | 82% |
| GarmBox.Oranges 1.0 | 7 | 86% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 53 | 43% | 147 |
| mz.AntiGrav 1.0 | 19 | 16% | 146 |
| amz.NanoClone 1.41 | 15 | 12% | 26 |
| mld.Infinity 2.2 | 14 | 11% | 27 |
| sample.Walls 1.0 | 7 | 6% | 18 |
| jangs.ns51 1.0 | 7 | 6% | 14 |
| GarmBox.Oranges 1.0 | 4 | 3% | 16 |
| arthord.MannyPacquiao Beta | 3 | 2% | 12 |

## Melee bench: F02

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.4 | 232 / 420 | 2.94 | 17.5% | 59477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.4 | 17.5% | 232 |
| oog.melee.Mercutio 1.0 | 1.9 | 14.5% | 105 |
| mld.DustBunny 3.8 | 2.8 | 13.4% | 32 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.6 | 9.1% | 17 |
| zyx.nano.Ant 1.1 | 6.0 | 8.8% | 6 |
| bzdp.BoxCar 2.0 | 7.8 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 7.9 | 7.5% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 6.5% | 7 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.1 | 23 / 35 | 5183 |
| 2 | 1 | 70.2 | 88.3 | 26 / 35 | 5440 |
| 3 | 1 | 70.6 | 94.9 | 28 / 35 | 5398 |
| 4 | 1 | 69.6 | 91.4 | 27 / 35 | 5387 |
| 5 | 1 | 64.2 | 67.6 | 13 / 35 | 4993 |
| 6 | 3 | 58.4 | 54.0 | 10 / 35 | 4213 |
| 7 | 2 | 60.9 | 56.2 | 11 / 35 | 4690 |
| 8 | 1 | 70.4 | 93.3 | 25 / 35 | 5542 |
| 9 | 1 | 65.4 | 75.2 | 17 / 35 | 4574 |
| 10 | 1 | 70.2 | 92.4 | 24 / 35 | 5338 |
| 11 | 3 | 58.8 | 54.0 | 7 / 35 | 4321 |
| 12 | 1 | 67.0 | 82.5 | 21 / 35 | 4398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 129 | 73% |
| mld.DustBunny 3.8 | 90 | 88% |
| djdjdj.NanoSkunk10 1.0 | 18 | 94% |
| maribo.melee.BMV 0.1 | 18 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| fullsail.SweetTea 1.1 | 14 | 71% |
| zyx.nano.Ant 1.1 | 5 | 100% |

Hadur died in 189 of 420 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 34% | 153 |
| cs.Grudge 1.0 | 33 | 17% | 35 |
| mld.DustBunny 3.8 | 32 | 17% | 97 |
| maribo.melee.BMV 0.1 | 13 | 7% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 7% | 23 |
| zyx.nano.Ant 1.1 | 12 | 6% | 19 |
| fullsail.SweetTea 1.1 | 10 | 5% | 22 |
| djdjdj.NanoSkunk10 1.0 | 8 | 4% | 32 |
| bzdp.BoxCar 2.0 | 4 | 2% | 7 |

## Melee bench: F03

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 12 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.6 | 295 / 420 | 2.30 | 20.5% | 74197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.5% | 295 |
| myl.micro.Troodon 1.10 | 2.3 | 13.6% | 58 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.8% | 24 |
| fm.mammillarias 1.3 | 5.4 | 9.4% | 4 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.3% | 13 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 8 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 2 |
| sample.Fire 1.0 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 78.7 | 19 / 35 | 5790 |
| 2 | 1 | 70.2 | 83.5 | 25 / 35 | 6129 |
| 3 | 1 | 71.3 | 86.7 | 24 / 35 | 6831 |
| 4 | 1 | 71.3 | 88.9 | 28 / 35 | 6030 |
| 5 | 1 | 71.2 | 88.3 | 22 / 35 | 6621 |
| 6 | 1 | 69.1 | 81.9 | 25 / 35 | 5574 |
| 7 | 1 | 68.6 | 78.7 | 21 / 35 | 5837 |
| 8 | 1 | 71.0 | 87.3 | 26 / 35 | 6248 |
| 9 | 1 | 72.1 | 92.7 | 27 / 35 | 6427 |
| 10 | 1 | 70.2 | 83.8 | 24 / 35 | 6106 |
| 11 | 1 | 70.7 | 87.3 | 24 / 35 | 6214 |
| 12 | 1 | 72.1 | 89.2 | 30 / 35 | 6390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 101 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 85 | 95% |
| cb.nano.Insomnia 1.0 | 42 | 90% |
| myl.nano.KomoriNinja 1.1 | 37 | 86% |
| sp.Nanos.Ember 1.1 | 26 | 96% |
| fm.mammillarias 1.3 | 10 | 90% |
| cs.sheldor.Talon 1.1 | 8 | 100% |
| sample.Fire 1.0 | 7 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 34 | 27% | 137 |
| cb.nano.Insomnia 1.0 | 26 | 21% | 30 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 15% | 81 |
| myl.nano.KomoriNinja 1.1 | 16 | 13% | 70 |
| fm.mammillarias 1.3 | 16 | 13% | 28 |
| sample.Tracker 1.0 | 5 | 4% | 9 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 30 |
| sample.Fire 1.0 | 4 | 3% | 12 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 19 |

## Melee bench: F04

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 42 over 12 battles (3.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.6 | 308 / 420 | 2.03 | 20.9% | 77654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.9% | 308 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.2% | 30 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 23 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.6% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.2% | 4 |
| tj.zombie1n 1.0.1 | 5.8 | 8.9% | 14 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.6% | 8 |
| repositorio.NanoStep 1.0 | 8.9 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.9 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.0 | 27 / 35 | 6553 |
| 2 | 1 | 70.6 | 91.4 | 21 / 35 | 6446 |
| 3 | 1 | 71.6 | 91.1 | 26 / 35 | 6864 |
| 4 | 1 | 70.5 | 87.6 | 26 / 35 | 6436 |
| 5 | 1 | 69.6 | 86.0 | 25 / 35 | 6144 |
| 6 | 1 | 68.5 | 79.7 | 23 / 35 | 6099 |
| 7 | 1 | 67.0 | 76.5 | 21 / 35 | 5501 |
| 8 | 1 | 72.5 | 93.3 | 31 / 35 | 6791 |
| 9 | 1 | 72.2 | 91.7 | 27 / 35 | 7055 |
| 10 | 1 | 71.7 | 92.4 | 26 / 35 | 6547 |
| 11 | 1 | 71.5 | 91.7 | 27 / 35 | 6222 |
| 12 | 1 | 72.4 | 94.6 | 28 / 35 | 6996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 123 | 89% |
| stelo.SoJNanoMelee 1.1 | 90 | 91% |
| tvv.micro.Antares 1.1.1 | 32 | 97% |
| tj.zombie1n 1.0.1 | 26 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 87% |
| yk.JahMicro 1.0 | 21 | 90% |
| Grystrion.RandomTrackerNOREV 1.0 | 12 | 92% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 6 | 100% |

Hadur died in 112 of 420 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 29% | 156 |
| stelo.SoJNanoMelee 1.1 | 21 | 19% | 70 |
| tvv.micro.Antares 1.1.1 | 16 | 14% | 57 |
| Grystrion.RandomTrackerNOREV 1.0 | 12 | 11% | 25 |
| yk.JahMicro 1.0 | 8 | 7% | 21 |
| tj.zombie1n 1.0.1 | 8 | 7% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 35 |
| repositorio.NanoStep 1.0 | 5 | 4% | 25 |
| sample.VelociRobot 1.0 | 4 | 4% | 13 |

## Melee bench: F05

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 70.5 | 184 / 420 | 3.65 | 15.9% | 56356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 15.9% | 184 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 68 |
| ahf.NanoAndrew .4 | 3.5 | 11.1% | 57 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.2% | 48 |
| sam.Samspin 1.0 | 5.7 | 10.0% | 20 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.6 | 9.3% | 22 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 72.1 | 16 / 35 | 4645 |
| 2 | 1 | 66.5 | 81.6 | 17 / 35 | 4982 |
| 3 | 1 | 60.2 | 60.0 | 13 / 35 | 4415 |
| 4 | 1 | 65.2 | 74.9 | 19 / 35 | 4735 |
| 5 | 1 | 60.9 | 62.9 | 13 / 35 | 4349 |
| 6 | 1 | 65.7 | 75.2 | 19 / 35 | 5038 |
| 7 | 1 | 65.9 | 75.2 | 17 / 35 | 5091 |
| 8 | 1 | 59.6 | 59.0 | 12 / 35 | 4455 |
| 9 | 1 | 62.3 | 67.3 | 14 / 35 | 4369 |
| 10 | 1 | 65.1 | 76.5 | 15 / 35 | 4841 |
| 11 | 1 | 61.6 | 64.4 | 11 / 35 | 4605 |
| 12 | 1 | 64.9 | 76.8 | 18 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 67 | 85% |
| oog.melee.Corsair 1.0 | 61 | 51% |
| ahf.NanoAndrew .4 | 43 | 77% |
| EBBU.Sim2 1.02 | 22 | 82% |
| sam.Samspin 1.0 | 20 | 100% |
| robar.nano.Assertive_Melee 0.2 | 14 | 93% |
| zyx.nano.BacillusComma 1.0 | 10 | 90% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 238 of 420 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 49 | 21% | 93 |
| ahf.NanoAndrew .4 | 35 | 15% | 73 |
| simonton.nano.MeleeSeed 1.8 | 32 | 13% | 76 |
| robar.nano.Assertive_Melee 0.2 | 31 | 13% | 44 |
| EBBU.Sim2 1.02 | 24 | 10% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 10% | 26 |
| zyx.nano.BacillusComma 1.0 | 22 | 9% | 29 |
| sam.Samspin 1.0 | 17 | 7% | 33 |
| sample.TrackFire 1.0 | 5 | 2% | 7 |

## Melee bench: F06

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 12 battles (1.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.1 | 301 / 420 | 1.98 | 19.7% | 63585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.7% | 301 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 40 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.3% | 37 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 12 |
| fm.claire 1.7 | 6.0 | 8.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 9 |
| sample.SpinBot 1.0 | 7.7 | 7.2% | 3 |
| pa.Improved 1.0 | 9.3 | 5.8% | 2 |
| kurios.DOSexe .9b | 9.6 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 29 / 35 | 5177 |
| 2 | 1 | 69.7 | 91.1 | 25 / 35 | 5325 |
| 3 | 1 | 70.9 | 92.7 | 27 / 35 | 5514 |
| 4 | 1 | 69.7 | 89.8 | 26 / 35 | 5321 |
| 5 | 1 | 70.8 | 92.7 | 25 / 35 | 5627 |
| 6 | 1 | 66.9 | 81.9 | 19 / 35 | 5115 |
| 7 | 1 | 68.0 | 83.5 | 24 / 35 | 4899 |
| 8 | 1 | 69.0 | 89.2 | 23 / 35 | 5287 |
| 9 | 1 | 68.7 | 85.7 | 23 / 35 | 5391 |
| 10 | 1 | 70.8 | 92.1 | 29 / 35 | 5647 |
| 11 | 1 | 69.6 | 92.1 | 26 / 35 | 5253 |
| 12 | 1 | 68.9 | 87.6 | 25 / 35 | 5029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 138 | 92% |
| oog.melee.CapuletDroid 1.1 | 73 | 77% |
| gh.nano.Grofvuil 0.2 | 45 | 93% |
| arthord.NanoSatanMelee Beta | 36 | 92% |
| winamp32.micro.MicroMacro 1.0 | 15 | 67% |
| sample.SpinBot 1.0 | 14 | 100% |
| pa.Improved 1.0 | 9 | 100% |
| fm.claire 1.7 | 8 | 88% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 123 of 420 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 27% | 142 |
| oog.melee.CapuletDroid 1.1 | 29 | 24% | 52 |
| gh.nano.Grofvuil 0.2 | 13 | 11% | 77 |
| winamp32.micro.MicroMacro 1.0 | 12 | 10% | 31 |
| fm.claire 1.7 | 12 | 10% | 22 |
| arthord.NanoSatanMelee Beta | 11 | 9% | 42 |
| sample.SpinBot 1.0 | 8 | 7% | 17 |
| pa.Improved 1.0 | 3 | 2% | 18 |
| kurios.DOSexe .9b | 2 | 2% | 14 |

## Melee bench: F07

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.4 | 192 / 420 | 2.59 | 18.1% | 66805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.1% | 192 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.5% | 114 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 33 |
| mz.MicroGodMelee 1 | 3.8 | 12.2% | 56 |
| DBall.Anarchy 0.1 | 5.1 | 8.8% | 12 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 3 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 5 |
| acogdev.alpha 0.2 | 8.4 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.6 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 18 / 35 | 5695 |
| 2 | 1 | 67.5 | 82.2 | 12 / 35 | 5709 |
| 3 | 1 | 67.8 | 81.3 | 16 / 35 | 5448 |
| 4 | 1 | 68.4 | 85.7 | 14 / 35 | 5513 |
| 5 | 1 | 66.6 | 79.0 | 15 / 35 | 5237 |
| 6 | 1 | 67.5 | 81.6 | 17 / 35 | 5713 |
| 7 | 1 | 66.3 | 77.1 | 16 / 35 | 5249 |
| 8 | 1 | 66.1 | 75.9 | 17 / 35 | 5168 |
| 9 | 1 | 69.3 | 87.0 | 18 / 35 | 6154 |
| 10 | 1 | 69.1 | 88.6 | 16 / 35 | 5764 |
| 11 | 1 | 68.3 | 83.2 | 21 / 35 | 5738 |
| 12 | 1 | 65.9 | 77.1 | 12 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 105 | 96% |
| gh.micro.Gruweltje 0.7 | 84 | 23% |
| mz.MicroGodMelee 1 | 73 | 49% |
| DBall.Anarchy 0.1 | 22 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 229 of 420 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 98 | 43% | 136 |
| mz.MicroGodMelee 1 | 61 | 27% | 106 |
| spinnercat.micro.Tyger 0.1 | 29 | 13% | 100 |
| acogdev.alpha 0.2 | 11 | 5% | 15 |
| fire219.CatBot 1.0 | 10 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 7 | 3% | 11 |
| el.JumpShoot 0.2 | 7 | 3% | 9 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 11 |
| DBall.Anarchy 0.1 | 1 | 0% | 18 |

## Melee bench: F08

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.4 | 224 / 420 | 3.58 | 16.5% | 61529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.3 | 16.5% | 224 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 70 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 61 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 13 |
| germ.TheMind .2 | 4.8 | 9.6% | 12 |
| awesomeness.Elite 1.0 | 6.3 | 8.7% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 7 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 9 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.1 | 18 / 35 | 5299 |
| 2 | 1 | 65.9 | 77.1 | 21 / 35 | 4829 |
| 3 | 1 | 65.2 | 72.1 | 16 / 35 | 5288 |
| 4 | 2 | 62.9 | 62.9 | 18 / 35 | 5225 |
| 5 | 1 | 62.0 | 62.9 | 16 / 35 | 5025 |
| 6 | 1 | 66.9 | 77.8 | 21 / 35 | 5196 |
| 7 | 1 | 65.8 | 73.7 | 21 / 35 | 4955 |
| 8 | 2 | 63.1 | 65.1 | 17 / 35 | 5023 |
| 9 | 1 | 65.2 | 70.2 | 21 / 35 | 5202 |
| 10 | 1 | 66.1 | 73.7 | 17 / 35 | 5558 |
| 11 | 1 | 66.7 | 76.2 | 19 / 35 | 5490 |
| 12 | 2 | 62.9 | 67.9 | 19 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 146 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 43 | 86% |
| germ.TheMind .2 | 19 | 84% |
| qualidafial.MajorDick 1.0.1 | 16 | 94% |
| awesomeness.Elite 1.0 | 12 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 197 of 420 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 42% | 200 |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 20% | 76 |
| awesomeness.Elite 1.0 | 19 | 10% | 35 |
| germ.TheMind .2 | 16 | 8% | 35 |
| stelo.UntouchableNano 1.3 | 14 | 7% | 24 |
| qualidafial.MajorDick 1.0.1 | 10 | 5% | 21 |
| lrem.micro.MoggFanatic 0.2 | 8 | 4% | 12 |
| mym.EdgeStalker 1.0 | 5 | 3% | 8 |
| sample.Crazy 1.0 | 3 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.1 | 320 / 420 | 1.98 | 20.1% | 58654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.1% | 320 |
| rz.HawkOnFire 0.1 | 2.3 | 13.7% | 29 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 17 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 20 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.8% | 3 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 7 |
| stelo.PatternRobot 1.0 | 8.6 | 7.5% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.2 | 29 / 35 | 4596 |
| 2 | 1 | 70.2 | 90.5 | 27 / 35 | 4581 |
| 3 | 1 | 70.0 | 83.5 | 25 / 35 | 5043 |
| 4 | 1 | 70.3 | 88.6 | 24 / 35 | 5050 |
| 5 | 1 | 70.4 | 90.5 | 26 / 35 | 5060 |
| 6 | 1 | 70.9 | 91.1 | 28 / 35 | 4762 |
| 7 | 1 | 70.7 | 89.8 | 26 / 35 | 5187 |
| 8 | 1 | 70.5 | 87.9 | 28 / 35 | 4968 |
| 9 | 1 | 69.5 | 87.0 | 24 / 35 | 4566 |
| 10 | 1 | 69.5 | 84.4 | 25 / 35 | 4949 |
| 11 | 1 | 71.1 | 92.1 | 28 / 35 | 4743 |
| 12 | 1 | 71.9 | 94.6 | 30 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 152 | 94% |
| nz.jdc.nano.GridFu 1.0 | 89 | 94% |
| timmit.nano.TimDog 0.33 | 25 | 88% |
| maribo.IotaCT 1.1 | 22 | 64% |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 100% |
| stelo.PatternRobot 1.0 | 19 | 100% |
| ratosh.Wesco 1.4 | 15 | 93% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 101 of 420 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 22 | 22% | 125 |
| nz.jdc.nano.GridFu 1.0 | 20 | 20% | 107 |
| timmit.nano.TimDog 0.33 | 20 | 20% | 50 |
| maribo.IotaCT 1.1 | 12 | 12% | 48 |
| ratosh.Wesco 1.4 | 10 | 10% | 30 |
| stelo.PatternRobot 1.0 | 7 | 7% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 17 |
| spinnercat.Omen 1.0 | 5 | 5% | 10 |

## Melee bench: F10

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.7 | 342 / 420 | 1.84 | 21.2% | 75710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.2% | 342 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.9% | 28 |
| baal.nano.N 1.42 | 2.9 | 11.3% | 11 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 5 |
| zyx.micro.Ant 1.1 | 5.9 | 8.7% | 13 |
| sanja.First 0.1 | 6.5 | 8.6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.6 | 8.4% | 4 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 1 |
| cvt.Firsty 1.0 | 7.9 | 7.4% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 27 / 35 | 6163 |
| 2 | 1 | 71.5 | 92.1 | 30 / 35 | 6184 |
| 3 | 1 | 72.0 | 93.0 | 27 / 35 | 6707 |
| 4 | 1 | 70.8 | 90.5 | 29 / 35 | 6111 |
| 5 | 1 | 70.4 | 88.3 | 28 / 35 | 5979 |
| 6 | 1 | 71.7 | 93.7 | 30 / 35 | 6295 |
| 7 | 1 | 69.1 | 80.6 | 23 / 35 | 6030 |
| 8 | 1 | 72.0 | 93.7 | 30 / 35 | 6658 |
| 9 | 1 | 70.5 | 87.6 | 27 / 35 | 6526 |
| 10 | 1 | 71.1 | 90.5 | 28 / 35 | 6370 |
| 11 | 1 | 72.0 | 94.0 | 32 / 35 | 6461 |
| 12 | 1 | 71.8 | 94.6 | 31 / 35 | 6226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 70 | 96% |
| baal.nano.N 1.42 | 67 | 96% |
| cvt.Firsty 1.0 | 56 | 96% |
| sanja.First 0.1 | 47 | 98% |
| Grystrion.TrackerWO 1.0 | 35 | 97% |
| amk.Punbot.Punbot 0.01 | 32 | 100% |
| zyx.micro.Ant 1.1 | 30 | 90% |
| squidM.TentalceMeleeNano 1.1 | 14 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 80 of 420 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 19 | 24% | 67 |
| tvv.nano.Polaris 1.2 | 14 | 18% | 110 |
| cvt.Firsty 1.0 | 11 | 14% | 46 |
| sample.RamFire 1.0 | 10 | 13% | 10 |
| baal.nano.N 1.42 | 9 | 11% | 53 |
| Grystrion.TrackerWO 1.0 | 7 | 9% | 35 |
| amk.Punbot.Punbot 0.01 | 5 | 6% | 17 |
| sanja.First 0.1 | 3 | 4% | 49 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 22 |

## Melee bench: F11

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 12 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.0 | 135 / 420 | 3.97 | 14.9% | 59282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.7% | 162 |
| hadur117.micro.SaorDC 0.1 | 1.8 | 14.9% | 135 |
| cs.Wren 1.0 | 3.1 | 12.3% | 38 |
| mz.Cork 0.1 | 4.5 | 11.2% | 30 |
| js.PinBall 1.6 | 4.5 | 11.1% | 29 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 8 |
| evd.X1 0.01 | 7.2 | 8.0% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 6.8% | 14 |
| donjezza.Jezza 1.0 | 9.1 | 5.7% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 65.7 | 12 / 35 | 4888 |
| 2 | 1 | 62.3 | 67.9 | 12 / 35 | 4893 |
| 3 | 2 | 63.5 | 69.8 | 12 / 35 | 5089 |
| 4 | 2 | 61.0 | 63.5 | 7 / 35 | 4876 |
| 5 | 2 | 63.3 | 69.8 | 11 / 35 | 5075 |
| 6 | 2 | 59.7 | 58.1 | 8 / 35 | 5070 |
| 7 | 3 | 59.0 | 57.5 | 10 / 35 | 4458 |
| 8 | 2 | 61.6 | 63.2 | 15 / 35 | 4876 |
| 9 | 2 | 63.4 | 73.3 | 12 / 35 | 4725 |
| 10 | 1 | 66.4 | 79.7 | 15 / 35 | 5528 |
| 11 | 1 | 62.5 | 67.9 | 12 / 35 | 4836 |
| 12 | 1 | 62.3 | 67.3 | 9 / 35 | 4968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 155 | 48% |
| cs.Wren 1.0 | 28 | 93% |
| mz.Cork 0.1 | 17 | 76% |
| jsal.Jsalbot 1.0 | 7 | 71% |
| js.PinBall 1.6 | 7 | 57% |
| donjezza.Jezza 1.0 | 7 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |

Hadur died in 285 of 420 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 148 | 52% | 224 |
| cs.Wren 1.0 | 28 | 10% | 46 |
| joe.ADinosaur 1.0 | 28 | 10% | 31 |
| js.PinBall 1.6 | 22 | 8% | 32 |
| mz.Cork 0.1 | 18 | 6% | 29 |
| evd.X1 0.01 | 16 | 6% | 18 |
| PSW.Relentless 0.1 | 15 | 5% | 16 |
| jsal.Jsalbot 1.0 | 8 | 3% | 17 |
| donjezza.Jezza 1.0 | 2 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 18 over 12 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.4 | 272 / 420 | 2.49 | 18.9% | 57862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.9% | 272 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 35 |
| ntc.Opposite 1.5 | 3.9 | 10.8% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.5% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.6 | 10.2% | 29 |
| pfvicm.Sobieski 7.2.3b | 5.1 | 9.9% | 16 |
| disan.Chair 2.2.0 | 7.2 | 8.0% | 13 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 20 |
| pbg.R2D2 1.0 | 9.4 | 6.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 74.0 | 19 / 35 | 4844 |
| 2 | 1 | 69.9 | 90.2 | 27 / 35 | 5037 |
| 3 | 1 | 68.4 | 84.4 | 23 / 35 | 4736 |
| 4 | 1 | 70.5 | 91.7 | 28 / 35 | 5052 |
| 5 | 1 | 65.0 | 75.2 | 18 / 35 | 4293 |
| 6 | 1 | 68.2 | 82.9 | 21 / 35 | 5079 |
| 7 | 1 | 68.0 | 85.1 | 23 / 35 | 4583 |
| 8 | 1 | 66.5 | 77.8 | 20 / 35 | 4520 |
| 9 | 1 | 68.6 | 88.3 | 22 / 35 | 4738 |
| 10 | 1 | 66.3 | 79.7 | 23 / 35 | 4224 |
| 11 | 1 | 69.8 | 86.3 | 21 / 35 | 5835 |
| 12 | 1 | 69.2 | 85.7 | 27 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 66 | 91% |
| stelo.AreaTargetingBot 1.1 | 59 | 88% |
| ntc.Opposite 1.5 | 33 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 31 | 94% |
| donjezza.Muncho 1.0 | 30 | 90% |
| disan.Chair 2.2.0 | 30 | 97% |
| DBall.NUKE 0.1 | 27 | 89% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 151 of 420 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 34 | 23% | 53 |
| myl.nano.Graviton 1.10 | 31 | 21% | 90 |
| stelo.AreaTargetingBot 1.1 | 26 | 17% | 70 |
| lrem.micro.SpikeSoldier 0.4 | 23 | 15% | 56 |
| ntc.Opposite 1.5 | 17 | 11% | 42 |
| DBall.NUKE 0.1 | 6 | 4% | 33 |
| disan.Chair 2.2.0 | 6 | 4% | 29 |
| donjezza.Muncho 1.0 | 5 | 3% | 24 |
| pbg.R2D2 1.0 | 3 | 2% | 20 |

## Melee bench: F13

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 12 battles (0.6 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.5 | 177 / 420 | 3.65 | 15.4% | 49543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.3 | 15.4% | 177 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.5% | 62 |
| oog.melee.Capulet 1.2 | 3.0 | 13.5% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 55 |
| yagami.Tidus 0.11 | 4.5 | 12.1% | 24 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 23 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 62.9 | 12 / 35 | 3972 |
| 2 | 1 | 64.2 | 69.8 | 14 / 35 | 4485 |
| 3 | 1 | 63.8 | 69.2 | 12 / 35 | 4441 |
| 4 | 1 | 66.1 | 76.8 | 18 / 35 | 4402 |
| 5 | 1 | 64.1 | 73.3 | 19 / 35 | 3574 |
| 6 | 1 | 64.7 | 72.7 | 17 / 35 | 4327 |
| 7 | 1 | 62.8 | 66.3 | 14 / 35 | 3891 |
| 8 | 1 | 64.9 | 74.9 | 16 / 35 | 4209 |
| 9 | 1 | 63.2 | 70.2 | 10 / 35 | 4061 |
| 10 | 1 | 66.3 | 77.8 | 20 / 35 | 4212 |
| 11 | 1 | 64.4 | 71.4 | 15 / 35 | 4212 |
| 12 | 3 | 60.2 | 60.6 | 10 / 35 | 3757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 74 | 95% |
| oog.melee.Capulet 1.2 | 52 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 83% |
| yagami.Tidus 0.11 | 32 | 91% |
| ejb.Polaris 1.0.1 | 25 | 64% |
| stelo.MirrorNano 1.3 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 245 of 420 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 99 | 40% | 136 |
| yagami.Tidus 0.11 | 40 | 16% | 71 |
| ejb.Polaris 1.0.1 | 27 | 11% | 51 |
| kawigi.micro.Shiz 1.1 | 24 | 10% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 9% | 61 |
| stelo.MirrorNano 1.3 | 15 | 6% | 15 |
| kurios.DOSexe .9a | 12 | 5% | 11 |
| step.nanoPri 1.0 | 5 | 2% | 7 |

## Melee bench: F14

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 11 over 12 battles (0.9 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.0 | 249 / 420 | 2.98 | 17.0% | 52068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.0% | 249 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 61 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 33 |
| wompi.Quokka 1.6 | 3.6 | 11.6% | 32 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 15 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 24 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 7.1% | 3 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.6 | 23 / 35 | 4770 |
| 2 | 1 | 65.2 | 75.9 | 20 / 35 | 4488 |
| 3 | 1 | 67.9 | 87.0 | 25 / 35 | 4239 |
| 4 | 1 | 63.8 | 74.0 | 17 / 35 | 4130 |
| 5 | 1 | 67.9 | 86.3 | 24 / 35 | 4523 |
| 6 | 1 | 63.1 | 72.1 | 17 / 35 | 4000 |
| 7 | 1 | 65.1 | 77.5 | 20 / 35 | 4294 |
| 8 | 1 | 66.2 | 80.0 | 23 / 35 | 4307 |
| 9 | 1 | 65.7 | 76.8 | 23 / 35 | 4364 |
| 10 | 1 | 64.7 | 75.2 | 18 / 35 | 4201 |
| 11 | 1 | 64.2 | 73.7 | 19 / 35 | 4468 |
| 12 | 1 | 65.1 | 75.9 | 20 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 90 | 93% |
| wee.Gem 1.8.4 | 78 | 82% |
| wompi.Quokka 1.6 | 48 | 77% |
| ratosh.Nobo 0.21 | 28 | 93% |
| m3thos.Eva00 1.1 | 23 | 91% |
| bayen.UbaMicro 1.4 | 13 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 173 of 420 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 32 | 18% | 100 |
| wompi.Quokka 1.6 | 32 | 18% | 62 |
| maribo.FollowFire 1 | 21 | 12% | 23 |
| bzdp.Pansy 2.1 | 19 | 11% | 92 |
| ratosh.Nobo 0.21 | 19 | 11% | 45 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 9% | 23 |
| m3thos.Eva00 1.1 | 14 | 8% | 35 |
| bayen.UbaMicro 1.4 | 13 | 8% | 26 |
| stelo.MyAgileRobot 0.2 | 8 | 5% | 12 |

## Melee bench: F15

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 85.1 | 148 / 420 | 2.34 | 19.7% | 89664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.4 | 19.7% | 148 |
| wompi.Wallaby 5.1 | 1.6 | 19.9% | 248 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 19 |
| ayk.WallHugger 1.0 | 4.2 | 10.3% | 2 |
| exauge.GateKeeper 1.1.121g | 5.1 | 9.1% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.1 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.1 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 80.3 | 11 / 35 | 6919 |
| 2 | 1 | 70.6 | 84.4 | 15 / 35 | 7017 |
| 3 | 1 | 72.7 | 89.2 | 14 / 35 | 8544 |
| 4 | 1 | 70.8 | 84.4 | 14 / 35 | 7241 |
| 5 | 2 | 69.1 | 78.1 | 11 / 35 | 7119 |
| 6 | 1 | 71.0 | 84.4 | 12 / 35 | 8085 |
| 7 | 1 | 71.9 | 88.9 | 11 / 35 | 7795 |
| 8 | 1 | 71.8 | 88.9 | 12 / 35 | 7704 |
| 9 | 1 | 71.3 | 88.9 | 15 / 35 | 7475 |
| 10 | 2 | 71.3 | 88.3 | 12 / 35 | 7398 |
| 11 | 2 | 70.0 | 83.2 | 12 / 35 | 7023 |
| 12 | 2 | 69.7 | 82.2 | 9 / 35 | 7344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 254 | 31% |
| mz.NanoGod 2.02 | 26 | 81% |
| exauge.GateKeeper 1.1.121g | 17 | 94% |
| ayk.WallHugger 1.0 | 15 | 93% |
| stelo.PianistNano 1.2 | 7 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 273 of 420 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 209 | 77% | 299 |
| mz.NanoGod 2.02 | 31 | 11% | 63 |
| ayk.WallHugger 1.0 | 14 | 5% | 25 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 16 |
| stuff.Vlad 0.1 | 4 | 1% | 8 |
| stelo.PianistNano 1.2 | 4 | 1% | 4 |
| drd.Dreadknoght 0.9 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 12 battles (1.6 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.5 | 231 / 420 | 3.47 | 16.6% | 55975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 16.6% | 231 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.5% | 40 |
| bvh.micro.Freya 0.3 | 3.7 | 11.5% | 43 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.6% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 39 |
| stelo.MirrorMicro 1.0 | 5.9 | 9.4% | 13 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.6 | 6.7% | 15 |
| dl.BetterWalls 1.0 | 8.6 | 6.6% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.5 | 21 / 35 | 4698 |
| 2 | 1 | 65.2 | 74.9 | 22 / 35 | 4591 |
| 3 | 1 | 64.8 | 73.7 | 23 / 35 | 4455 |
| 4 | 1 | 66.2 | 77.5 | 20 / 35 | 4793 |
| 5 | 1 | 61.6 | 63.2 | 13 / 35 | 4791 |
| 6 | 1 | 61.3 | 64.4 | 13 / 35 | 4265 |
| 7 | 1 | 64.2 | 72.1 | 19 / 35 | 4357 |
| 8 | 1 | 64.6 | 71.1 | 19 / 35 | 4933 |
| 9 | 1 | 63.6 | 68.6 | 17 / 35 | 4685 |
| 10 | 1 | 67.0 | 81.0 | 22 / 35 | 4734 |
| 11 | 1 | 65.5 | 73.0 | 22 / 35 | 4912 |
| 12 | 1 | 65.5 | 73.3 | 20 / 35 | 4761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 79 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 55 | 87% |
| dummy.micro.Sparrow 2.5 | 55 | 96% |
| bvh.micro.Freya 0.3 | 37 | 84% |
| ap.Frederick 1.1 | 14 | 93% |
| stelo.MirrorMicro 1.0 | 11 | 91% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 189 of 420 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 36 | 19% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 33 | 17% | 33 |
| voidious.micro.BlitzBat 1.05 | 26 | 14% | 94 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 14% | 77 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 77 |
| bvh.micro.Freya 0.3 | 21 | 11% | 46 |
| dl.BetterWalls 1.0 | 15 | 8% | 28 |
| stelo.MirrorMicro 1.0 | 8 | 4% | 25 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 20 over 12 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.3 | 313 / 420 | 2.05 | 21.2% | 81230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 21.2% | 313 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 37 |
| sul.Lunar 1.1 | 3.4 | 11.2% | 16 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 16 |
| mme.NikeEnhanced 2.0 | 4.9 | 9.7% | 11 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 9 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 11 |
| sample.Corners 1.0 | 9.6 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.1 | 25 / 35 | 6442 |
| 2 | 1 | 69.2 | 82.2 | 22 / 35 | 6251 |
| 3 | 1 | 72.3 | 94.0 | 25 / 35 | 6935 |
| 4 | 1 | 72.1 | 91.7 | 29 / 35 | 6587 |
| 5 | 1 | 72.1 | 90.5 | 26 / 35 | 6850 |
| 6 | 1 | 71.3 | 86.3 | 27 / 35 | 6828 |
| 7 | 1 | 71.3 | 86.7 | 23 / 35 | 7249 |
| 8 | 1 | 69.9 | 84.8 | 24 / 35 | 6500 |
| 9 | 1 | 70.5 | 84.1 | 25 / 35 | 6789 |
| 10 | 1 | 71.4 | 88.9 | 28 / 35 | 6856 |
| 11 | 1 | 72.6 | 91.4 | 29 / 35 | 7014 |
| 12 | 1 | 72.8 | 94.3 | 30 / 35 | 6929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 112 | 89% |
| sul.Lunar 1.1 | 87 | 99% |
| supersample.SuperBoxBot 1.0 | 60 | 92% |
| dsw.StaticD 1.0 | 22 | 77% |
| mme.NikeEnhanced 2.0 | 22 | 95% |
| sample.MyFirstJuniorRobot 1.0 | 16 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| sample.Corners 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |

Hadur died in 110 of 420 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 30 | 27% | 126 |
| supersample.SuperBoxBot 1.0 | 24 | 22% | 59 |
| dsw.StaticD 1.0 | 21 | 19% | 58 |
| mme.NikeEnhanced 2.0 | 16 | 15% | 36 |
| sample.MyFirstRobot 1.0 | 6 | 5% | 15 |
| tlp.ThreeLeggedPig 1 | 5 | 5% | 8 |
| sul.Lunar 1.1 | 3 | 3% | 89 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 18 |
| sample.Corners 1.0 | 1 | 1% | 11 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.6 | 252 / 420 | 2.57 | 18.8% | 73688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.8% | 252 |
| radnor.DoctorBob 1.42 | 2.8 | 13.0% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.4 | 11.9% | 40 |
| mld.Wisdom 1.0 | 3.6 | 11.9% | 32 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.3% | 15 |
| amz.NanoClone 1.41 | 5.4 | 9.6% | 17 |
| sample.Walls 1.0 | 7.2 | 7.6% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.6 | 26 / 35 | 6339 |
| 2 | 1 | 66.0 | 77.8 | 13 / 35 | 5932 |
| 3 | 1 | 67.5 | 79.4 | 20 / 35 | 5922 |
| 4 | 1 | 70.0 | 87.9 | 24 / 35 | 6281 |
| 5 | 1 | 67.8 | 76.8 | 20 / 35 | 6477 |
| 6 | 1 | 68.5 | 81.9 | 20 / 35 | 6541 |
| 7 | 1 | 68.4 | 81.9 | 22 / 35 | 6215 |
| 8 | 1 | 67.5 | 78.7 | 21 / 35 | 5979 |
| 9 | 1 | 70.8 | 89.2 | 27 / 35 | 6553 |
| 10 | 1 | 67.6 | 81.6 | 20 / 35 | 5787 |
| 11 | 1 | 68.2 | 84.8 | 19 / 35 | 5908 |
| 12 | 1 | 67.9 | 82.2 | 20 / 35 | 5754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 103 | 95% |
| radnor.DoctorBob 1.42 | 62 | 79% |
| mld.Wisdom 1.0 | 42 | 79% |
| KiraNL.Chupacabra 0.4 | 23 | 78% |
| amz.NanoClone 1.41 | 21 | 95% |
| sample.Walls 1.0 | 15 | 100% |
| jangs.ns51 1.0 | 11 | 82% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 4 | 75% |

Hadur died in 168 of 420 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 52 | 31% | 85 |
| radnor.DoctorBob 1.42 | 37 | 22% | 95 |
| KiraNL.Chupacabra 0.4 | 27 | 16% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 13% | 113 |
| amz.NanoClone 1.41 | 14 | 8% | 34 |
| jangs.ns51 1.0 | 6 | 4% | 14 |
| sample.Walls 1.0 | 5 | 3% | 17 |
| GarmBox.Oranges 1.0 | 4 | 2% | 8 |
| sample.Target 1.0 | 1 | 1% | 0 |

