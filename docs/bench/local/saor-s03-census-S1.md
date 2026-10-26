# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 90.0 | 308 / 420 | 1.90 | 21.5% | 84289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.5% | 308 |
| radnor.DoctorBob 1.42 | 2.7 | 14.0% | 38 |
| mz.AntiGrav 1.0 | 2.9 | 13.7% | 23 |
| mld.Infinity 2.2 | 3.4 | 13.0% | 37 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 8 |
| GarmBox.Oranges 1.0 | 6.5 | 7.1% | 0 |
| sample.Walls 1.0 | 6.8 | 6.7% | 3 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.1 | 27 / 35 | 7002 |
| 2 | 1 | 73.7 | 96.8 | 31 / 35 | 7071 |
| 3 | 1 | 72.9 | 91.1 | 26 / 35 | 7340 |
| 4 | 1 | 71.6 | 84.8 | 24 / 35 | 6725 |
| 5 | 1 | 70.3 | 80.3 | 22 / 35 | 6751 |
| 6 | 1 | 72.5 | 90.8 | 25 / 35 | 7024 |
| 7 | 1 | 72.2 | 88.6 | 26 / 35 | 7172 |
| 8 | 1 | 72.0 | 88.3 | 24 / 35 | 7060 |
| 9 | 1 | 72.3 | 90.8 | 26 / 35 | 7136 |
| 10 | 1 | 72.0 | 89.8 | 24 / 35 | 6880 |
| 11 | 1 | 73.7 | 94.9 | 28 / 35 | 7407 |
| 12 | 1 | 71.9 | 91.7 | 25 / 35 | 6721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 136 | 99% |
| mld.Infinity 2.2 | 80 | 88% |
| radnor.DoctorBob 1.42 | 77 | 87% |
| jangs.ns51 1.0 | 13 | 100% |
| amz.NanoClone 1.41 | 11 | 73% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 113 of 420 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 49 | 43% | 149 |
| amz.NanoClone 1.41 | 23 | 20% | 40 |
| mld.Infinity 2.2 | 17 | 15% | 39 |
| mz.AntiGrav 1.0 | 10 | 9% | 124 |
| sample.Walls 1.0 | 5 | 4% | 26 |
| jangs.ns51 1.0 | 4 | 4% | 14 |
| arthord.MannyPacquiao Beta | 3 | 3% | 12 |
| GarmBox.Oranges 1.0 | 2 | 2% | 11 |

## Melee bench: F02

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 12 battles (1.6 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.4 | 239 / 420 | 3.03 | 17.5% | 60754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.4 | 17.5% | 239 |
| oog.melee.Mercutio 1.0 | 1.9 | 14.8% | 113 |
| mld.DustBunny 3.8 | 2.8 | 13.5% | 29 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.6 | 9.0% | 14 |
| zyx.nano.Ant 1.1 | 6.0 | 8.9% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 10 |
| fullsail.SweetTea 1.1 | 7.9 | 7.3% | 7 |
| bzdp.BoxCar 2.0 | 8.2 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 24 / 35 | 4917 |
| 2 | 1 | 69.0 | 87.0 | 23 / 35 | 5176 |
| 3 | 1 | 68.1 | 85.4 | 24 / 35 | 5059 |
| 4 | 1 | 69.7 | 92.1 | 27 / 35 | 5321 |
| 5 | 1 | 65.7 | 68.6 | 19 / 35 | 5381 |
| 6 | 2 | 64.5 | 65.7 | 12 / 35 | 5363 |
| 7 | 2 | 62.6 | 61.3 | 10 / 35 | 5074 |
| 8 | 1 | 69.2 | 90.5 | 27 / 35 | 4715 |
| 9 | 1 | 70.2 | 91.7 | 27 / 35 | 5445 |
| 10 | 1 | 69.4 | 86.7 | 27 / 35 | 5212 |
| 11 | 2 | 62.4 | 59.4 | 13 / 35 | 4965 |
| 12 | 3 | 57.7 | 52.7 | 6 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 119 | 71% |
| mld.DustBunny 3.8 | 93 | 94% |
| maribo.melee.BMV 0.1 | 18 | 94% |
| fullsail.SweetTea 1.1 | 18 | 72% |
| djdjdj.NanoSkunk10 1.0 | 16 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 4 | 100% |

Hadur died in 181 of 420 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 28% | 137 |
| mld.DustBunny 3.8 | 35 | 19% | 107 |
| zyx.nano.Ant 1.1 | 23 | 13% | 28 |
| cs.Grudge 1.0 | 23 | 13% | 24 |
| fullsail.SweetTea 1.1 | 15 | 8% | 32 |
| maribo.melee.BMV 0.1 | 10 | 6% | 27 |
| djdjdj.NanoSkunk10 1.0 | 9 | 5% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 4% | 22 |
| bzdp.BoxCar 2.0 | 7 | 4% | 13 |

## Melee bench: F03

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.7 | 300 / 420 | 2.20 | 20.7% | 75552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 20.7% | 300 |
| myl.micro.Troodon 1.10 | 2.1 | 13.8% | 54 |
| myl.nano.KomoriNinja 1.1 | 3.4 | 11.3% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.6% | 22 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 19 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 2 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.1 | 6.6% | 7 |
| sample.Fire 1.0 | 9.1 | 5.2% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.3 | 22 / 35 | 6019 |
| 2 | 1 | 72.3 | 92.1 | 30 / 35 | 6359 |
| 3 | 1 | 69.5 | 87.3 | 20 / 35 | 5774 |
| 4 | 1 | 70.0 | 85.1 | 25 / 35 | 5976 |
| 5 | 1 | 70.7 | 86.7 | 25 / 35 | 6265 |
| 6 | 1 | 71.4 | 84.8 | 25 / 35 | 6824 |
| 7 | 1 | 71.0 | 84.4 | 25 / 35 | 6863 |
| 8 | 1 | 71.9 | 91.1 | 27 / 35 | 6625 |
| 9 | 1 | 70.5 | 85.4 | 24 / 35 | 6136 |
| 10 | 1 | 72.0 | 90.8 | 29 / 35 | 6511 |
| 11 | 1 | 70.2 | 84.8 | 23 / 35 | 5923 |
| 12 | 1 | 71.1 | 87.6 | 25 / 35 | 6277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 101 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 83 | 93% |
| cb.nano.Insomnia 1.0 | 41 | 88% |
| sp.Nanos.Ember 1.1 | 37 | 86% |
| myl.nano.KomoriNinja 1.1 | 33 | 88% |
| fm.mammillarias 1.3 | 17 | 100% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 121 of 420 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 20% | 79 |
| myl.nano.KomoriNinja 1.1 | 23 | 19% | 83 |
| myl.micro.Troodon 1.10 | 21 | 17% | 117 |
| cb.nano.Insomnia 1.0 | 18 | 15% | 24 |
| sp.Nanos.Ember 1.1 | 11 | 9% | 39 |
| fm.mammillarias 1.3 | 10 | 8% | 29 |
| cs.sheldor.Talon 1.1 | 9 | 7% | 29 |
| sample.Tracker 1.0 | 3 | 2% | 3 |
| sample.Fire 1.0 | 1 | 1% | 14 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.7 | 311 / 420 | 2.10 | 20.8% | 78211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 20.8% | 311 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.2% | 23 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 20 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.3% | 25 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.1% | 3 |
| yk.JahMicro 1.0 | 6.8 | 8.3% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 8 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 29 / 35 | 6266 |
| 2 | 1 | 69.7 | 84.8 | 23 / 35 | 6576 |
| 3 | 1 | 70.3 | 89.5 | 25 / 35 | 6346 |
| 4 | 1 | 69.1 | 81.9 | 23 / 35 | 6536 |
| 5 | 1 | 70.4 | 88.6 | 28 / 35 | 6202 |
| 6 | 1 | 72.7 | 94.3 | 29 / 35 | 7068 |
| 7 | 1 | 71.6 | 90.2 | 29 / 35 | 6455 |
| 8 | 1 | 68.2 | 77.8 | 20 / 35 | 6447 |
| 9 | 1 | 71.8 | 90.8 | 28 / 35 | 6674 |
| 10 | 1 | 72.4 | 92.1 | 28 / 35 | 7095 |
| 11 | 1 | 70.1 | 88.6 | 24 / 35 | 6149 |
| 12 | 1 | 69.3 | 81.0 | 25 / 35 | 6397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 114 | 96% |
| stelo.SoJNanoMelee 1.1 | 95 | 94% |
| tj.zombie1n 1.0.1 | 33 | 76% |
| tvv.micro.Antares 1.1.1 | 32 | 88% |
| yk.JahMicro 1.0 | 28 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 24 | 79% |
| repositorio.NanoStep 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 27% | 150 |
| Grystrion.RandomTrackerNOREV 1.0 | 20 | 18% | 34 |
| stelo.SoJNanoMelee 1.1 | 19 | 17% | 65 |
| tvv.micro.Antares 1.1.1 | 10 | 9% | 54 |
| yk.JahMicro 1.0 | 10 | 9% | 27 |
| tj.zombie1n 1.0.1 | 10 | 9% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 8% | 37 |
| repositorio.NanoStep 1.0 | 2 | 2% | 23 |
| sample.VelociRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F05

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.4 | 172 / 420 | 3.94 | 15.4% | 56777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 15.4% | 172 |
| oog.melee.Corsair 1.0 | 2.1 | 13.1% | 77 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 48 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.5% | 45 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 21 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.6% | 23 |
| sam.Samspin 1.0 | 6.3 | 9.7% | 27 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.6% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 64.1 | 12 / 35 | 4406 |
| 2 | 1 | 60.8 | 63.8 | 10 / 35 | 4530 |
| 3 | 1 | 64.4 | 70.5 | 16 / 35 | 5262 |
| 4 | 2 | 56.6 | 51.4 | 8 / 35 | 4418 |
| 5 | 1 | 64.6 | 72.7 | 16 / 35 | 5064 |
| 6 | 1 | 63.9 | 70.2 | 15 / 35 | 5082 |
| 7 | 1 | 62.0 | 69.5 | 14 / 35 | 4220 |
| 8 | 1 | 63.8 | 73.3 | 16 / 35 | 4531 |
| 9 | 1 | 66.5 | 76.2 | 19 / 35 | 5074 |
| 10 | 1 | 64.2 | 71.7 | 17 / 35 | 4925 |
| 11 | 1 | 63.0 | 66.7 | 16 / 35 | 4794 |
| 12 | 1 | 59.5 | 58.4 | 13 / 35 | 4471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 66 | 62% |
| simonton.nano.MeleeSeed 1.8 | 63 | 79% |
| ahf.NanoAndrew .4 | 40 | 83% |
| sam.Samspin 1.0 | 18 | 89% |
| EBBU.Sim2 1.02 | 16 | 81% |
| zyx.nano.BacillusComma 1.0 | 11 | 91% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 250 of 420 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 52 | 21% | 91 |
| oog.melee.Corsair 1.0 | 51 | 20% | 100 |
| bwbaugh.nano.Tirunculus 0.0.0a | 29 | 12% | 27 |
| ahf.NanoAndrew .4 | 27 | 11% | 69 |
| robar.nano.Assertive_Melee 0.2 | 23 | 9% | 32 |
| EBBU.Sim2 1.02 | 22 | 9% | 29 |
| zyx.nano.BacillusComma 1.0 | 20 | 8% | 34 |
| sam.Samspin 1.0 | 18 | 7% | 25 |
| sample.TrackFire 1.0 | 7 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 12 battles (0.6 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.1 | 300 / 420 | 1.98 | 19.9% | 65136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.9% | 300 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.9% | 40 |
| gh.nano.Grofvuil 0.2 | 2.9 | 12.1% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 40 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 6 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 9 |
| fm.claire 1.7 | 6.4 | 8.4% | 2 |
| sample.SpinBot 1.0 | 7.9 | 7.0% | 5 |
| pa.Improved 1.0 | 9.1 | 5.7% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 27 / 35 | 5380 |
| 2 | 1 | 68.9 | 88.6 | 22 / 35 | 5169 |
| 3 | 1 | 68.3 | 83.8 | 22 / 35 | 5566 |
| 4 | 1 | 69.1 | 88.3 | 24 / 35 | 5256 |
| 5 | 1 | 70.4 | 93.0 | 25 / 35 | 5407 |
| 6 | 1 | 69.6 | 87.9 | 24 / 35 | 5675 |
| 7 | 1 | 69.8 | 88.3 | 25 / 35 | 5750 |
| 8 | 1 | 69.2 | 86.7 | 26 / 35 | 5141 |
| 9 | 1 | 70.8 | 93.3 | 27 / 35 | 5615 |
| 10 | 1 | 70.7 | 92.1 | 27 / 35 | 5513 |
| 11 | 1 | 69.6 | 89.5 | 23 / 35 | 5425 |
| 12 | 1 | 69.4 | 87.6 | 28 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 132 | 88% |
| oog.melee.CapuletDroid 1.1 | 77 | 79% |
| gh.nano.Grofvuil 0.2 | 41 | 95% |
| arthord.NanoSatanMelee Beta | 32 | 91% |
| winamp32.micro.MicroMacro 1.0 | 21 | 90% |
| sample.SpinBot 1.0 | 16 | 100% |
| fm.claire 1.7 | 10 | 100% |
| kurios.DOSexe .9b | 7 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 123 of 420 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 31 | 25% | 39 |
| d414.nano.Quantum 1.0.0 | 28 | 23% | 147 |
| arthord.NanoSatanMelee Beta | 20 | 16% | 55 |
| gh.nano.Grofvuil 0.2 | 16 | 13% | 75 |
| fm.claire 1.7 | 8 | 7% | 12 |
| sample.SpinBot 1.0 | 7 | 6% | 19 |
| winamp32.micro.MicroMacro 1.0 | 6 | 5% | 42 |
| kurios.DOSexe .9b | 3 | 2% | 19 |
| pa.Improved 1.0 | 2 | 2% | 8 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.9 | 212 / 420 | 2.45 | 18.6% | 68812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.6% | 212 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 90 |
| mz.MicroGodMelee 1 | 3.3 | 13.3% | 67 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.2% | 36 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 8 |
| caimano.Furia_Ceca 0.22 | 5.9 | 7.7% | 3 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 3 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 83.5 | 19 / 35 | 6000 |
| 2 | 1 | 69.6 | 90.5 | 19 / 35 | 5769 |
| 3 | 1 | 68.7 | 85.7 | 17 / 35 | 5851 |
| 4 | 1 | 66.9 | 78.4 | 17 / 35 | 5287 |
| 5 | 1 | 69.3 | 85.7 | 19 / 35 | 5994 |
| 6 | 1 | 67.6 | 81.6 | 19 / 35 | 5362 |
| 7 | 1 | 69.6 | 91.7 | 18 / 35 | 5528 |
| 8 | 1 | 68.1 | 80.6 | 19 / 35 | 5880 |
| 9 | 1 | 68.6 | 83.2 | 19 / 35 | 5713 |
| 10 | 1 | 68.0 | 82.2 | 15 / 35 | 6169 |
| 11 | 1 | 66.9 | 77.1 | 15 / 35 | 5984 |
| 12 | 1 | 68.5 | 87.0 | 16 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 108 | 54% |
| spinnercat.micro.Tyger 0.1 | 102 | 92% |
| gh.micro.Gruweltje 0.7 | 68 | 29% |
| DBall.Anarchy 0.1 | 22 | 100% |
| caimano.Furia_Ceca 0.22 | 9 | 89% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| fire219.CatBot 1.0 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 208 of 420 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 76 | 37% | 147 |
| gh.micro.Gruweltje 0.7 | 64 | 31% | 102 |
| spinnercat.micro.Tyger 0.1 | 29 | 14% | 97 |
| acogdev.alpha 0.2 | 10 | 5% | 14 |
| fire219.CatBot 1.0 | 10 | 5% | 11 |
| caimano.Furia_Ceca 0.22 | 9 | 4% | 17 |
| DBall.Anarchy 0.1 | 4 | 2% | 20 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 7 |
| el.JumpShoot 0.2 | 2 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 70.8 | 226 / 420 | 3.63 | 16.4% | 61435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.4 | 16.4% | 226 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 74 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 66 |
| qualidafial.MajorDick 1.0.1 | 5.1 | 9.4% | 14 |
| germ.TheMind .2 | 5.1 | 9.5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 3 |
| awesomeness.Elite 1.0 | 6.6 | 8.3% | 11 |
| stelo.UntouchableNano 1.3 | 7.4 | 7.7% | 11 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 65.4 | 20 / 35 | 4805 |
| 2 | 1 | 66.6 | 76.2 | 20 / 35 | 5488 |
| 3 | 1 | 65.4 | 73.7 | 21 / 35 | 4884 |
| 4 | 1 | 66.7 | 76.2 | 22 / 35 | 5236 |
| 5 | 1 | 65.7 | 73.3 | 18 / 35 | 5543 |
| 6 | 1 | 66.1 | 75.2 | 20 / 35 | 5215 |
| 7 | 2 | 63.9 | 68.9 | 18 / 35 | 4741 |
| 8 | 1 | 63.6 | 65.7 | 17 / 35 | 5466 |
| 9 | 2 | 61.0 | 61.6 | 12 / 35 | 4875 |
| 10 | 1 | 67.5 | 81.6 | 25 / 35 | 5186 |
| 11 | 3 | 60.7 | 57.5 | 14 / 35 | 4842 |
| 12 | 1 | 65.4 | 74.0 | 19 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 137 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 46 | 83% |
| germ.TheMind .2 | 17 | 88% |
| qualidafial.MajorDick 1.0.1 | 16 | 100% |
| awesomeness.Elite 1.0 | 13 | 100% |
| stelo.UntouchableNano 1.3 | 11 | 100% |
| lrem.micro.MoggFanatic 0.2 | 8 | 100% |
| sample.Crazy 1.0 | 7 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 195 of 420 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 88 | 45% | 199 |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 20% | 76 |
| germ.TheMind .2 | 20 | 10% | 41 |
| lrem.micro.MoggFanatic 0.2 | 15 | 8% | 26 |
| qualidafial.MajorDick 1.0.1 | 11 | 6% | 20 |
| stelo.UntouchableNano 1.3 | 8 | 4% | 22 |
| awesomeness.Elite 1.0 | 8 | 4% | 20 |
| mym.EdgeStalker 1.0 | 5 | 3% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 87.7 | 311 / 420 | 2.10 | 19.9% | 59564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.9% | 311 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 25 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 12.5% | 28 |
| maribo.IotaCT 1.1 | 4.0 | 10.8% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.5% | 4 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.5% | 8 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 6 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 8.2 | 7.7% | 11 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.3 | 24 / 35 | 4979 |
| 2 | 1 | 70.4 | 90.5 | 26 / 35 | 4599 |
| 3 | 1 | 70.7 | 88.9 | 26 / 35 | 5247 |
| 4 | 1 | 69.8 | 85.4 | 27 / 35 | 5097 |
| 5 | 1 | 70.6 | 90.8 | 27 / 35 | 4742 |
| 6 | 1 | 70.2 | 87.6 | 25 / 35 | 5113 |
| 7 | 1 | 69.0 | 84.8 | 24 / 35 | 4398 |
| 8 | 1 | 71.0 | 92.4 | 29 / 35 | 5050 |
| 9 | 1 | 70.4 | 86.7 | 25 / 35 | 5230 |
| 10 | 1 | 70.6 | 88.9 | 26 / 35 | 5063 |
| 11 | 1 | 70.9 | 88.9 | 28 / 35 | 5097 |
| 12 | 1 | 68.9 | 81.6 | 24 / 35 | 4949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 123 | 96% |
| nz.jdc.nano.GridFu 1.0 | 92 | 92% |
| maribo.IotaCT 1.1 | 26 | 85% |
| stelo.PatternRobot 1.0 | 25 | 100% |
| timmit.nano.TimDog 0.33 | 24 | 88% |
| ratosh.Wesco 1.4 | 18 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 93% |
| spinnercat.Omen 1.0 | 11 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 29 | 27% | 55 |
| nz.jdc.nano.GridFu 1.0 | 23 | 21% | 107 |
| rz.HawkOnFire 0.1 | 18 | 17% | 102 |
| maribo.IotaCT 1.1 | 10 | 9% | 52 |
| ratosh.Wesco 1.4 | 10 | 9% | 37 |
| stelo.PatternRobot 1.0 | 10 | 9% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 22 |
| spinnercat.Omen 1.0 | 2 | 2% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.5 | 347 / 420 | 1.68 | 21.3% | 74056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.3% | 347 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 25 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 6 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.3% | 8 |
| zyx.micro.Ant 1.1 | 5.4 | 9.0% | 9 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.5% | 2 |
| sanja.First 0.1 | 6.8 | 8.1% | 5 |
| cvt.Firsty 1.0 | 7.4 | 7.9% | 15 |
| amk.Punbot.Punbot 0.01 | 8.8 | 7.0% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 31 / 35 | 6408 |
| 2 | 1 | 70.6 | 90.2 | 28 / 35 | 6077 |
| 3 | 1 | 71.6 | 93.3 | 31 / 35 | 6248 |
| 4 | 1 | 72.9 | 99.0 | 33 / 35 | 6403 |
| 5 | 1 | 72.1 | 96.2 | 31 / 35 | 6246 |
| 6 | 1 | 70.7 | 88.6 | 26 / 35 | 6496 |
| 7 | 1 | 71.6 | 91.1 | 30 / 35 | 6322 |
| 8 | 1 | 71.8 | 95.6 | 29 / 35 | 6327 |
| 9 | 1 | 71.9 | 96.8 | 28 / 35 | 6180 |
| 10 | 1 | 68.3 | 83.5 | 25 / 35 | 5579 |
| 11 | 1 | 72.0 | 93.7 | 30 / 35 | 6402 |
| 12 | 1 | 69.3 | 88.3 | 25 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 79 | 91% |
| tvv.nano.Polaris 1.2 | 77 | 90% |
| baal.nano.N 1.42 | 55 | 95% |
| sanja.First 0.1 | 40 | 93% |
| zyx.micro.Ant 1.1 | 37 | 95% |
| amk.Punbot.Punbot 0.01 | 37 | 97% |
| Grystrion.TrackerWO 1.0 | 35 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 75 of 420 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 16 | 21% | 102 |
| zyx.micro.Ant 1.1 | 14 | 19% | 70 |
| Grystrion.TrackerWO 1.0 | 13 | 17% | 43 |
| cvt.Firsty 1.0 | 10 | 13% | 59 |
| sample.RamFire 1.0 | 8 | 11% | 12 |
| baal.nano.N 1.42 | 4 | 5% | 54 |
| sanja.First 0.1 | 4 | 5% | 43 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 20 |
| amk.Punbot.Punbot 0.01 | 3 | 4% | 10 |

## Melee bench: F11

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 66.8 | 130 / 420 | 3.99 | 14.7% | 58177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.6 | 15.1% | 156 |
| hadur117.micro.SaorS1 0.1 | 1.6 | 14.7% | 130 |
| cs.Wren 1.0 | 3.3 | 12.7% | 46 |
| js.PinBall 1.6 | 4.3 | 11.3% | 28 |
| mz.Cork 0.1 | 4.5 | 11.4% | 30 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 5 |
| evd.X1 0.01 | 6.8 | 8.5% | 11 |
| jsal.Jsalbot 1.0 | 8.1 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 8.9 | 5.6% | 10 |
| PSW.Relentless 0.1 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 56.8 | 9 / 35 | 4243 |
| 2 | 1 | 64.2 | 73.7 | 12 / 35 | 5162 |
| 3 | 1 | 64.7 | 73.7 | 15 / 35 | 5166 |
| 4 | 1 | 65.1 | 78.1 | 11 / 35 | 5110 |
| 5 | 2 | 59.2 | 60.6 | 10 / 35 | 4436 |
| 6 | 1 | 61.2 | 62.2 | 12 / 35 | 5073 |
| 7 | 2 | 61.9 | 65.7 | 9 / 35 | 4842 |
| 8 | 3 | 58.0 | 56.2 | 6 / 35 | 4662 |
| 9 | 1 | 66.0 | 77.5 | 15 / 35 | 5200 |
| 10 | 2 | 61.2 | 64.8 | 10 / 35 | 4585 |
| 11 | 1 | 61.7 | 66.3 | 10 / 35 | 4842 |
| 12 | 1 | 61.7 | 66.0 | 11 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 130 | 41% |
| cs.Wren 1.0 | 39 | 92% |
| js.PinBall 1.6 | 20 | 60% |
| mz.Cork 0.1 | 19 | 89% |
| jsal.Jsalbot 1.0 | 8 | 63% |
| joe.ADinosaur 1.0 | 4 | 75% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 293 of 420 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 146 | 50% | 207 |
| cs.Wren 1.0 | 31 | 11% | 52 |
| evd.X1 0.01 | 28 | 10% | 31 |
| joe.ADinosaur 1.0 | 24 | 8% | 27 |
| js.PinBall 1.6 | 23 | 8% | 36 |
| mz.Cork 0.1 | 20 | 7% | 37 |
| PSW.Relentless 0.1 | 14 | 5% | 16 |
| jsal.Jsalbot 1.0 | 5 | 2% | 10 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.8 | 268 / 420 | 2.55 | 18.6% | 57406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.6% | 268 |
| ntc.Opposite 1.5 | 3.8 | 10.8% | 18 |
| myl.nano.Graviton 1.10 | 3.8 | 10.9% | 37 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.6% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.2% | 6 |
| DBall.NUKE 0.1 | 7.3 | 8.4% | 10 |
| disan.Chair 2.2.0 | 7.5 | 8.1% | 13 |
| donjezza.Muncho 1.0 | 8.8 | 6.6% | 20 |
| pbg.R2D2 1.0 | 9.8 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.9 | 17 / 35 | 4813 |
| 2 | 1 | 65.3 | 78.7 | 18 / 35 | 4512 |
| 3 | 1 | 69.5 | 87.0 | 26 / 35 | 5197 |
| 4 | 1 | 69.8 | 88.3 | 27 / 35 | 5018 |
| 5 | 1 | 69.0 | 89.5 | 23 / 35 | 4762 |
| 6 | 1 | 67.3 | 79.4 | 24 / 35 | 4660 |
| 7 | 1 | 64.9 | 74.9 | 21 / 35 | 4123 |
| 8 | 1 | 67.4 | 81.0 | 19 / 35 | 4793 |
| 9 | 1 | 67.4 | 83.2 | 23 / 35 | 4995 |
| 10 | 1 | 69.8 | 89.8 | 24 / 35 | 4954 |
| 11 | 1 | 67.4 | 82.2 | 22 / 35 | 4561 |
| 12 | 1 | 68.4 | 84.4 | 24 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 72 | 88% |
| myl.nano.Graviton 1.10 | 67 | 87% |
| disan.Chair 2.2.0 | 31 | 90% |
| DBall.NUKE 0.1 | 29 | 100% |
| ntc.Opposite 1.5 | 28 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 26 | 100% |
| donjezza.Muncho 1.0 | 26 | 81% |
| pfvicm.Sobieski 7.2.3b | 18 | 94% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 157 of 420 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 33 | 21% | 54 |
| stelo.AreaTargetingBot 1.1 | 30 | 19% | 78 |
| ntc.Opposite 1.5 | 22 | 14% | 49 |
| myl.nano.Graviton 1.10 | 21 | 13% | 73 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 13% | 55 |
| DBall.NUKE 0.1 | 10 | 6% | 45 |
| disan.Chair 2.2.0 | 9 | 6% | 34 |
| donjezza.Muncho 1.0 | 7 | 4% | 20 |
| pbg.R2D2 1.0 | 4 | 3% | 9 |

## Melee bench: F13

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.0 | 184 / 420 | 3.43 | 15.9% | 52789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.2 | 15.9% | 184 |
| kawigi.micro.Shiz 1.1 | 2.4 | 13.8% | 71 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.3% | 34 |
| yagami.Tidus 0.11 | 5.1 | 11.7% | 22 |
| ejb.Polaris 1.0.1 | 5.7 | 10.8% | 20 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 3 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 20 / 35 | 4786 |
| 2 | 1 | 65.6 | 75.9 | 17 / 35 | 4335 |
| 3 | 1 | 64.6 | 72.7 | 15 / 35 | 4472 |
| 4 | 1 | 62.9 | 67.3 | 13 / 35 | 4208 |
| 5 | 1 | 65.1 | 73.0 | 14 / 35 | 4350 |
| 6 | 1 | 66.1 | 77.1 | 18 / 35 | 4624 |
| 7 | 1 | 66.5 | 81.0 | 18 / 35 | 4339 |
| 8 | 1 | 64.8 | 72.1 | 15 / 35 | 4613 |
| 9 | 2 | 62.8 | 69.8 | 11 / 35 | 4071 |
| 10 | 1 | 66.2 | 74.9 | 18 / 35 | 4540 |
| 11 | 1 | 61.5 | 62.5 | 11 / 35 | 4335 |
| 12 | 2 | 62.0 | 64.1 | 14 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 65 | 58% |
| kawigi.micro.Shiz 1.1 | 59 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 83% |
| yagami.Tidus 0.11 | 38 | 89% |
| ejb.Polaris 1.0.1 | 14 | 79% |
| stelo.MirrorNano 1.3 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 236 of 420 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 107 | 45% | 158 |
| yagami.Tidus 0.11 | 28 | 12% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 11% | 72 |
| kawigi.micro.Shiz 1.1 | 24 | 10% | 63 |
| ejb.Polaris 1.0.1 | 19 | 8% | 36 |
| stelo.MirrorNano 1.3 | 14 | 6% | 18 |
| step.nanoPri 1.0 | 10 | 4% | 12 |
| kurios.DOSexe .9a | 7 | 3% | 8 |

## Melee bench: F14

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 12 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.2 | 250 / 420 | 2.96 | 17.2% | 52633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.2% | 250 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 45 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 57 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 34 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 14 |
| m3thos.Eva00 1.1 | 6.4 | 9.5% | 10 |
| bayen.UbaMicro 1.4 | 6.5 | 9.0% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 6.7% | 4 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.9 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 73.7 | 21 / 35 | 4194 |
| 2 | 1 | 68.3 | 87.3 | 23 / 35 | 4653 |
| 3 | 1 | 62.1 | 67.0 | 16 / 35 | 4217 |
| 4 | 1 | 63.2 | 69.2 | 17 / 35 | 4262 |
| 5 | 1 | 66.7 | 82.2 | 21 / 35 | 4547 |
| 6 | 1 | 66.1 | 76.5 | 22 / 35 | 4559 |
| 7 | 1 | 66.3 | 83.2 | 25 / 35 | 3924 |
| 8 | 1 | 65.6 | 78.7 | 23 / 35 | 4287 |
| 9 | 1 | 68.9 | 88.6 | 27 / 35 | 4637 |
| 10 | 1 | 66.6 | 79.7 | 19 / 35 | 4817 |
| 11 | 1 | 63.8 | 74.9 | 17 / 35 | 4037 |
| 12 | 1 | 65.9 | 77.8 | 19 / 35 | 4499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 96 | 88% |
| wee.Gem 1.8.4 | 83 | 88% |
| wompi.Quokka 1.6 | 39 | 90% |
| ratosh.Nobo 0.21 | 24 | 92% |
| m3thos.Eva00 1.1 | 20 | 90% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 171 of 420 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 27 | 16% | 52 |
| bzdp.Pansy 2.1 | 25 | 15% | 95 |
| maribo.FollowFire 1 | 24 | 14% | 26 |
| wee.Gem 1.8.4 | 22 | 13% | 92 |
| jeremyreeder.Vincent 2011.12.09 | 18 | 11% | 26 |
| bayen.UbaMicro 1.4 | 17 | 10% | 32 |
| ratosh.Nobo 0.21 | 14 | 8% | 44 |
| m3thos.Eva00 1.1 | 14 | 8% | 33 |
| stelo.MyAgileRobot 0.2 | 10 | 6% | 17 |

## Melee bench: F15

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 82.2 | 128 / 420 | 2.60 | 19.0% | 85562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.7% | 250 |
| hadur117.micro.SaorS1 0.1 | 1.7 | 19.0% | 128 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 29 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 8 |
| ayk.WallHugger 1.0 | 5.0 | 9.2% | 4 |
| stuff.Vlad 0.1 | 5.6 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.1 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 74.3 | 6 / 35 | 6639 |
| 2 | 1 | 70.6 | 84.1 | 12 / 35 | 7364 |
| 3 | 2 | 68.9 | 79.4 | 11 / 35 | 6760 |
| 4 | 2 | 68.3 | 79.4 | 6 / 35 | 6473 |
| 5 | 2 | 70.8 | 85.7 | 10 / 35 | 7534 |
| 6 | 2 | 68.8 | 79.0 | 10 / 35 | 7019 |
| 7 | 2 | 69.2 | 81.9 | 7 / 35 | 6641 |
| 8 | 2 | 70.7 | 83.5 | 10 / 35 | 7499 |
| 9 | 2 | 70.3 | 80.6 | 10 / 35 | 7802 |
| 10 | 1 | 70.7 | 84.8 | 13 / 35 | 7264 |
| 11 | 1 | 71.7 | 87.0 | 16 / 35 | 7462 |
| 12 | 1 | 71.3 | 86.7 | 17 / 35 | 7105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 228 | 28% |
| mz.NanoGod 2.02 | 37 | 68% |
| exauge.GateKeeper 1.1.121g | 16 | 88% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| ayk.WallHugger 1.0 | 8 | 75% |
| sample.SittingDuck 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 292 of 420 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 210 | 72% | 282 |
| mz.NanoGod 2.02 | 42 | 14% | 77 |
| ayk.WallHugger 1.0 | 15 | 5% | 20 |
| exauge.GateKeeper 1.1.121g | 15 | 5% | 20 |
| stelo.PianistNano 1.2 | 5 | 2% | 5 |
| stuff.Vlad 0.1 | 4 | 1% | 10 |
| drd.Dreadknoght 0.9 | 1 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.3 | 243 / 420 | 3.23 | 17.3% | 58636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.3% | 243 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 12.7% | 38 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 34 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 30 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 32 |
| stelo.MirrorMicro 1.0 | 6.1 | 9.0% | 17 |
| conscience.Electron 1.3g | 7.1 | 7.9% | 4 |
| ap.Frederick 1.1 | 8.4 | 6.7% | 18 |
| dl.BetterWalls 1.0 | 8.6 | 6.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.4 | 23 / 35 | 4842 |
| 2 | 1 | 64.6 | 72.7 | 19 / 35 | 4668 |
| 3 | 1 | 66.8 | 78.4 | 21 / 35 | 4882 |
| 4 | 1 | 66.2 | 74.3 | 23 / 35 | 4958 |
| 5 | 1 | 65.1 | 71.1 | 18 / 35 | 4849 |
| 6 | 1 | 64.7 | 73.7 | 19 / 35 | 4313 |
| 7 | 1 | 62.9 | 63.5 | 14 / 35 | 4994 |
| 8 | 1 | 64.0 | 70.5 | 16 / 35 | 4762 |
| 9 | 1 | 67.5 | 78.4 | 22 / 35 | 5436 |
| 10 | 1 | 65.8 | 75.6 | 19 / 35 | 4859 |
| 11 | 1 | 68.2 | 83.2 | 26 / 35 | 4987 |
| 12 | 1 | 68.1 | 82.5 | 23 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 84 | 96% |
| dummy.micro.Sparrow 2.5 | 73 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 49 | 84% |
| bvh.micro.Freya 0.3 | 43 | 91% |
| stelo.MirrorMicro 1.0 | 8 | 63% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 178 of 420 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 34 | 19% | 35 |
| conscience.Electron 1.3g | 33 | 19% | 37 |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 15% | 81 |
| dummy.micro.Sparrow 2.5 | 21 | 12% | 80 |
| voidious.micro.BlitzBat 1.05 | 20 | 11% | 91 |
| bvh.micro.Freya 0.3 | 15 | 8% | 37 |
| dl.BetterWalls 1.0 | 15 | 8% | 30 |
| stelo.MirrorMicro 1.0 | 12 | 7% | 28 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 90.2 | 326 / 420 | 1.89 | 21.7% | 83417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.7% | 326 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.2% | 37 |
| sul.Lunar 1.1 | 3.4 | 11.3% | 15 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.5% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 9 |
| dsw.StaticD 1.0 | 5.6 | 8.8% | 11 |
| tlp.ThreeLeggedPig 1 | 6.9 | 7.5% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.8% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 4 |
| sample.Corners 1.0 | 9.4 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.4 | 29 / 35 | 6455 |
| 2 | 1 | 72.3 | 92.7 | 30 / 35 | 6904 |
| 3 | 1 | 73.5 | 95.6 | 31 / 35 | 7412 |
| 4 | 1 | 72.5 | 91.1 | 26 / 35 | 7096 |
| 5 | 1 | 71.5 | 89.5 | 23 / 35 | 6657 |
| 6 | 1 | 71.7 | 89.2 | 28 / 35 | 6932 |
| 7 | 1 | 70.8 | 87.6 | 24 / 35 | 6707 |
| 8 | 1 | 70.4 | 81.3 | 23 / 35 | 7409 |
| 9 | 1 | 72.7 | 90.5 | 30 / 35 | 6972 |
| 10 | 1 | 71.6 | 87.6 | 27 / 35 | 6797 |
| 11 | 1 | 71.9 | 90.2 | 24 / 35 | 7096 |
| 12 | 1 | 73.2 | 95.2 | 31 / 35 | 6980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 108 | 87% |
| sul.Lunar 1.1 | 101 | 100% |
| supersample.SuperBoxBot 1.0 | 49 | 94% |
| dsw.StaticD 1.0 | 37 | 78% |
| mme.NikeEnhanced 2.0 | 26 | 81% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 11 | 82% |
| tlp.ThreeLeggedPig 1 | 10 | 90% |
| sample.Corners 1.0 | 6 | 100% |

Hadur died in 94 of 420 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 32 | 34% | 127 |
| supersample.SuperBoxBot 1.0 | 19 | 20% | 54 |
| dsw.StaticD 1.0 | 16 | 17% | 61 |
| mme.NikeEnhanced 2.0 | 11 | 12% | 39 |
| sul.Lunar 1.1 | 7 | 7% | 99 |
| tlp.ThreeLeggedPig 1 | 5 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 11 |
| sample.Corners 1.0 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 16 |

## Melee bench: F18

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.TeamRunner x2), parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.8 | 248 / 420 | 2.82 | 18.5% | 74691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.5% | 248 |
| mld.Wisdom 1.0 | 2.8 | 12.6% | 34 |
| radnor.DoctorBob 1.42 | 3.0 | 12.4% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.1% | 33 |
| KiraNL.Chupacabra 0.4 | 4.9 | 10.4% | 13 |
| amz.NanoClone 1.41 | 5.1 | 10.2% | 23 |
| sample.Walls 1.0 | 6.9 | 7.9% | 12 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 8 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.7 | 21 / 35 | 5236 |
| 2 | 1 | 68.2 | 81.6 | 20 / 35 | 6254 |
| 3 | 1 | 70.6 | 88.6 | 26 / 35 | 6514 |
| 4 | 1 | 68.2 | 80.0 | 18 / 35 | 6882 |
| 5 | 1 | 67.3 | 79.7 | 22 / 35 | 5761 |
| 6 | 1 | 66.7 | 75.6 | 18 / 35 | 6120 |
| 7 | 1 | 67.4 | 76.8 | 20 / 35 | 6384 |
| 8 | 1 | 66.9 | 79.4 | 18 / 35 | 5756 |
| 9 | 1 | 67.5 | 76.2 | 20 / 35 | 6176 |
| 10 | 1 | 68.5 | 81.0 | 21 / 35 | 6502 |
| 11 | 1 | 70.0 | 88.6 | 22 / 35 | 6619 |
| 12 | 1 | 67.8 | 76.8 | 22 / 35 | 6487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 99 | 98% |
| radnor.DoctorBob 1.42 | 50 | 76% |
| mld.Wisdom 1.0 | 41 | 73% |
| amz.NanoClone 1.41 | 29 | 83% |
| KiraNL.Chupacabra 0.4 | 24 | 75% |
| sample.Walls 1.0 | 17 | 100% |
| GarmBox.Oranges 1.0 | 11 | 100% |
| jangs.ns51 1.0 | 11 | 73% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 173 of 420 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 51 | 29% | 87 |
| KiraNL.Chupacabra 0.4 | 34 | 20% | 53 |
| radnor.DoctorBob 1.42 | 32 | 18% | 83 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 14% | 118 |
| amz.NanoClone 1.41 | 18 | 10% | 37 |
| GarmBox.Oranges 1.0 | 6 | 3% | 14 |
| sample.Walls 1.0 | 5 | 3% | 16 |
| jangs.ns51 1.0 | 3 | 2% | 9 |

