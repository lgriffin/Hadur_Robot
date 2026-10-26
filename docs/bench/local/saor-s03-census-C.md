# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 15 over 12 battles (1.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 83.9 | 226 / 420 | 2.45 | 19.5% | 77634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.5% | 226 |
| radnor.DoctorBob 1.42 | 2.2 | 15.1% | 74 |
| mz.AntiGrav 1.0 | 3.1 | 14.1% | 48 |
| mld.Infinity 2.2 | 3.8 | 12.9% | 52 |
| amz.NanoClone 1.41 | 4.9 | 10.6% | 15 |
| sample.Walls 1.0 | 6.8 | 6.9% | 1 |
| GarmBox.Oranges 1.0 | 6.9 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 4 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 81.6 | 15 / 35 | 6167 |
| 2 | 1 | 69.1 | 79.4 | 20 / 35 | 6183 |
| 3 | 1 | 72.0 | 90.2 | 20 / 35 | 7196 |
| 4 | 1 | 69.8 | 82.5 | 16 / 35 | 6573 |
| 5 | 1 | 70.3 | 85.7 | 22 / 35 | 6275 |
| 6 | 1 | 68.3 | 80.0 | 17 / 35 | 5893 |
| 7 | 1 | 72.1 | 91.1 | 23 / 35 | 6771 |
| 8 | 1 | 69.2 | 77.5 | 16 / 35 | 6944 |
| 9 | 1 | 70.9 | 88.9 | 21 / 35 | 6301 |
| 10 | 1 | 71.2 | 87.0 | 22 / 35 | 7009 |
| 11 | 1 | 67.2 | 77.1 | 15 / 35 | 5908 |
| 12 | 1 | 70.0 | 86.0 | 19 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 104 | 94% |
| radnor.DoctorBob 1.42 | 70 | 61% |
| mld.Infinity 2.2 | 67 | 81% |
| amz.NanoClone 1.41 | 17 | 65% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 195 of 420 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 108 | 55% | 183 |
| mld.Infinity 2.2 | 26 | 13% | 32 |
| mz.AntiGrav 1.0 | 25 | 13% | 119 |
| amz.NanoClone 1.41 | 19 | 10% | 33 |
| GarmBox.Oranges 1.0 | 7 | 4% | 10 |
| jangs.ns51 1.0 | 5 | 3% | 13 |
| sample.Walls 1.0 | 2 | 1% | 20 |
| arthord.MannyPacquiao Beta | 2 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 12 battles (11.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.3 | 234 / 420 | 2.86 | 17.4% | 56885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.4% | 234 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.8% | 116 |
| mld.DustBunny 3.8 | 3.2 | 13.1% | 26 |
| maribo.melee.BMV 0.1 | 4.1 | 10.6% | 9 |
| zyx.nano.Ant 1.1 | 5.8 | 9.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.1 | 8.9% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 6.6% | 12 |
| bzdp.BoxCar 2.0 | 7.6 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 7.4% | 9 |
| cs.Grudge 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 26 / 35 | 4844 |
| 2 | 1 | 70.2 | 94.9 | 27 / 35 | 4937 |
| 3 | 1 | 68.9 | 87.6 | 22 / 35 | 5265 |
| 4 | 1 | 69.1 | 92.4 | 24 / 35 | 5191 |
| 5 | 2 | 61.3 | 58.4 | 11 / 35 | 4552 |
| 6 | 1 | 65.1 | 76.5 | 18 / 35 | 4432 |
| 7 | 3 | 59.4 | 54.9 | 8 / 35 | 4291 |
| 8 | 1 | 69.3 | 91.1 | 28 / 35 | 4937 |
| 9 | 1 | 66.9 | 83.8 | 17 / 35 | 4723 |
| 10 | 1 | 66.5 | 83.2 | 20 / 35 | 4319 |
| 11 | 2 | 61.1 | 57.1 | 11 / 35 | 4490 |
| 12 | 1 | 68.1 | 85.1 | 22 / 35 | 4904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 128 | 70% |
| mld.DustBunny 3.8 | 94 | 91% |
| djdjdj.NanoSkunk10 1.0 | 18 | 100% |
| maribo.melee.BMV 0.1 | 13 | 69% |
| fullsail.SweetTea 1.1 | 12 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| zyx.nano.Ant 1.1 | 12 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 188 of 420 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 66 | 35% | 143 |
| mld.DustBunny 3.8 | 35 | 19% | 104 |
| cs.Grudge 1.0 | 21 | 11% | 24 |
| zyx.nano.Ant 1.1 | 18 | 10% | 35 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 7% | 27 |
| maribo.melee.BMV 0.1 | 13 | 7% | 25 |
| fullsail.SweetTea 1.1 | 11 | 6% | 21 |
| bzdp.BoxCar 2.0 | 8 | 4% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 26 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 12 battles (1.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.6 | 267 / 420 | 2.56 | 19.4% | 68661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 267 |
| myl.micro.Troodon 1.10 | 2.1 | 14.8% | 64 |
| myl.nano.KomoriNinja 1.1 | 2.9 | 12.0% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.9% | 29 |
| fm.mammillarias 1.3 | 5.1 | 9.7% | 6 |
| cb.nano.Insomnia 1.0 | 5.6 | 9.2% | 26 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 12 |
| sample.Tracker 1.0 | 9.3 | 5.1% | 0 |
| sample.Fire 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.4 | 22 / 35 | 5905 |
| 2 | 1 | 66.5 | 76.5 | 21 / 35 | 4993 |
| 3 | 1 | 67.3 | 77.8 | 18 / 35 | 5383 |
| 4 | 1 | 68.9 | 82.2 | 23 / 35 | 5492 |
| 5 | 1 | 70.3 | 83.8 | 24 / 35 | 5909 |
| 6 | 1 | 69.6 | 87.9 | 21 / 35 | 5721 |
| 7 | 1 | 68.8 | 81.3 | 20 / 35 | 5811 |
| 8 | 1 | 72.8 | 93.7 | 30 / 35 | 6808 |
| 9 | 1 | 66.1 | 73.3 | 17 / 35 | 5255 |
| 10 | 1 | 68.8 | 81.0 | 22 / 35 | 5656 |
| 11 | 1 | 70.7 | 87.9 | 25 / 35 | 6024 |
| 12 | 1 | 69.0 | 81.0 | 24 / 35 | 5704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 123 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 51 | 92% |
| myl.nano.KomoriNinja 1.1 | 36 | 92% |
| cb.nano.Insomnia 1.0 | 34 | 76% |
| sp.Nanos.Ember 1.1 | 26 | 81% |
| fm.mammillarias 1.3 | 17 | 94% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 3 | 67% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 154 of 420 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 31 | 20% | 143 |
| myl.nano.KomoriNinja 1.1 | 25 | 16% | 85 |
| stelo.SoRobotNanoMelee 1.2 | 25 | 16% | 65 |
| cb.nano.Insomnia 1.0 | 22 | 14% | 26 |
| fm.mammillarias 1.3 | 17 | 11% | 26 |
| sp.Nanos.Ember 1.1 | 11 | 7% | 31 |
| sample.Tracker 1.0 | 9 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 7 | 5% | 20 |
| sample.Fire 1.0 | 7 | 5% | 10 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 57 over 12 battles (4.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.4 | 257 / 420 | 2.40 | 19.5% | 72809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.5% | 257 |
| tvv.micro.Antares 1.1.1 | 2.4 | 12.7% | 49 |
| kawigi.nano.Lib 1.0 | 2.6 | 12.8% | 40 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.4% | 4 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 21 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.2% | 33 |
| ers.nano.hawk.HawkLA 3.0m | 6.6 | 8.1% | 8 |
| yk.JahMicro 1.0 | 7.3 | 8.0% | 6 |
| repositorio.NanoStep 1.0 | 8.9 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.3 | 23 / 35 | 6352 |
| 2 | 1 | 69.1 | 81.9 | 24 / 35 | 6270 |
| 3 | 1 | 68.2 | 82.2 | 19 / 35 | 5622 |
| 4 | 1 | 68.5 | 81.9 | 19 / 35 | 6331 |
| 5 | 1 | 70.4 | 86.7 | 24 / 35 | 6315 |
| 6 | 1 | 70.2 | 88.6 | 23 / 35 | 6259 |
| 7 | 1 | 69.4 | 84.8 | 20 / 35 | 6457 |
| 8 | 1 | 70.0 | 87.9 | 21 / 35 | 6232 |
| 9 | 1 | 67.0 | 79.0 | 21 / 35 | 5353 |
| 10 | 1 | 70.7 | 91.7 | 26 / 35 | 6012 |
| 11 | 1 | 68.5 | 81.6 | 19 / 35 | 5793 |
| 12 | 1 | 67.1 | 78.7 | 18 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 108 | 84% |
| stelo.SoJNanoMelee 1.1 | 86 | 84% |
| tvv.micro.Antares 1.1.1 | 44 | 73% |
| tj.zombie1n 1.0.1 | 24 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 82% |
| yk.JahMicro 1.0 | 13 | 92% |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 90% |
| sample.VelociRobot 1.0 | 6 | 83% |
| repositorio.NanoStep 1.0 | 6 | 100% |

Hadur died in 163 of 420 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 32% | 161 |
| tvv.micro.Antares 1.1.1 | 33 | 20% | 77 |
| stelo.SoJNanoMelee 1.1 | 26 | 16% | 63 |
| tj.zombie1n 1.0.1 | 17 | 10% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 16 | 10% | 23 |
| yk.JahMicro 1.0 | 8 | 5% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 4% | 31 |
| repositorio.NanoStep 1.0 | 3 | 2% | 13 |
| sample.VelociRobot 1.0 | 2 | 1% | 11 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 28 over 12 battles (2.3 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 68.3 | 170 / 420 | 3.85 | 15.1% | 52882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 15.1% | 170 |
| ahf.NanoAndrew .4 | 2.4 | 12.5% | 64 |
| oog.melee.Corsair 1.0 | 2.8 | 12.4% | 63 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.8% | 41 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 32 |
| EBBU.Sim2 1.02 | 6.3 | 9.5% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.2% | 20 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 65.1 | 14 / 35 | 4347 |
| 2 | 1 | 60.8 | 66.0 | 10 / 35 | 4285 |
| 3 | 1 | 58.8 | 55.9 | 10 / 35 | 4443 |
| 4 | 1 | 61.7 | 67.3 | 13 / 35 | 4312 |
| 5 | 1 | 60.0 | 64.4 | 13 / 35 | 4022 |
| 6 | 1 | 62.1 | 67.6 | 9 / 35 | 4714 |
| 7 | 1 | 64.3 | 74.9 | 15 / 35 | 4738 |
| 8 | 1 | 66.2 | 81.9 | 19 / 35 | 4321 |
| 9 | 1 | 59.7 | 60.0 | 13 / 35 | 4193 |
| 10 | 1 | 64.5 | 73.0 | 18 / 35 | 4749 |
| 11 | 1 | 64.8 | 72.7 | 20 / 35 | 4717 |
| 12 | 1 | 62.5 | 70.8 | 16 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 66 | 83% |
| oog.melee.Corsair 1.0 | 51 | 65% |
| ahf.NanoAndrew .4 | 47 | 79% |
| sam.Samspin 1.0 | 17 | 82% |
| EBBU.Sim2 1.02 | 16 | 94% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 7 | 71% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 252 of 420 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 18% | 97 |
| ahf.NanoAndrew .4 | 40 | 16% | 80 |
| robar.nano.Assertive_Melee 0.2 | 33 | 13% | 44 |
| zyx.nano.BacillusComma 1.0 | 33 | 13% | 37 |
| oog.melee.Corsair 1.0 | 29 | 12% | 63 |
| bwbaugh.nano.Tirunculus 0.0.0a | 27 | 11% | 26 |
| EBBU.Sim2 1.02 | 20 | 8% | 37 |
| sam.Samspin 1.0 | 20 | 8% | 29 |
| sample.TrackFire 1.0 | 5 | 2% | 7 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 12 battles (0.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.8 | 267 / 420 | 2.36 | 18.7% | 59907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 267 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.4% | 49 |
| gh.nano.Grofvuil 0.2 | 2.9 | 12.5% | 40 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.9% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 13 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.5% | 5 |
| fm.claire 1.7 | 6.4 | 8.5% | 1 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 12 |
| pa.Improved 1.0 | 9.1 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 21 / 35 | 4939 |
| 2 | 1 | 66.8 | 80.6 | 21 / 35 | 4886 |
| 3 | 1 | 69.6 | 89.8 | 26 / 35 | 5074 |
| 4 | 1 | 66.5 | 80.3 | 19 / 35 | 4729 |
| 5 | 1 | 67.4 | 81.0 | 22 / 35 | 5079 |
| 6 | 1 | 67.1 | 82.9 | 22 / 35 | 4543 |
| 7 | 1 | 68.4 | 83.5 | 23 / 35 | 5324 |
| 8 | 1 | 67.9 | 85.7 | 21 / 35 | 4965 |
| 9 | 1 | 68.4 | 87.9 | 24 / 35 | 4778 |
| 10 | 1 | 68.1 | 85.1 | 22 / 35 | 4992 |
| 11 | 1 | 69.0 | 86.3 | 23 / 35 | 5306 |
| 12 | 1 | 69.5 | 91.4 | 23 / 35 | 5292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 125 | 90% |
| oog.melee.CapuletDroid 1.1 | 66 | 76% |
| gh.nano.Grofvuil 0.2 | 48 | 77% |
| arthord.NanoSatanMelee Beta | 36 | 89% |
| winamp32.micro.MicroMacro 1.0 | 21 | 76% |
| fm.claire 1.7 | 8 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 155 of 420 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 41 | 26% | 95 |
| d414.nano.Quantum 1.0.0 | 36 | 23% | 148 |
| oog.melee.CapuletDroid 1.1 | 31 | 20% | 37 |
| arthord.NanoSatanMelee Beta | 19 | 12% | 48 |
| winamp32.micro.MicroMacro 1.0 | 9 | 6% | 33 |
| sample.SpinBot 1.0 | 8 | 5% | 16 |
| fm.claire 1.7 | 7 | 5% | 13 |
| pa.Improved 1.0 | 2 | 1% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 22 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 29 over 12 battles (2.4 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.6 | 171 / 420 | 2.84 | 17.4% | 63728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.4% | 171 |
| gh.micro.Gruweltje 0.7 | 2.6 | 14.9% | 94 |
| mz.MicroGodMelee 1 | 3.0 | 14.0% | 86 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 46 |
| DBall.Anarchy 0.1 | 5.4 | 8.4% | 10 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 3 |
| acogdev.alpha 0.2 | 7.9 | 6.4% | 3 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.7% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 20 / 35 | 5708 |
| 2 | 2 | 65.4 | 77.5 | 9 / 35 | 5133 |
| 3 | 1 | 65.9 | 77.5 | 16 / 35 | 5036 |
| 4 | 1 | 65.8 | 78.1 | 12 / 35 | 4989 |
| 5 | 1 | 68.4 | 85.7 | 17 / 35 | 5419 |
| 6 | 1 | 63.4 | 70.8 | 13 / 35 | 4731 |
| 7 | 1 | 67.9 | 82.9 | 16 / 35 | 5473 |
| 8 | 1 | 64.7 | 74.3 | 15 / 35 | 4934 |
| 9 | 1 | 67.7 | 82.2 | 13 / 35 | 5686 |
| 10 | 1 | 67.9 | 82.9 | 16 / 35 | 5368 |
| 11 | 1 | 66.8 | 78.4 | 15 / 35 | 5644 |
| 12 | 1 | 66.5 | 79.7 | 9 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 95 | 42% |
| spinnercat.micro.Tyger 0.1 | 75 | 87% |
| gh.micro.Gruweltje 0.7 | 66 | 26% |
| DBall.Anarchy 0.1 | 28 | 100% |
| mbro.Detektor3 0.1.1 | 9 | 100% |
| el.JumpShoot 0.2 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 6 | 83% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 250 of 420 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 90 | 36% | 140 |
| gh.micro.Gruweltje 0.7 | 84 | 34% | 108 |
| spinnercat.micro.Tyger 0.1 | 34 | 14% | 86 |
| acogdev.alpha 0.2 | 8 | 3% | 10 |
| DBall.Anarchy 0.1 | 7 | 3% | 30 |
| el.JumpShoot 0.2 | 7 | 3% | 12 |
| fire219.CatBot 1.0 | 7 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 6 | 2% | 13 |
| caimano.Furia_Ceca 0.22 | 6 | 2% | 13 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.TeamRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 18 over 12 battles (1.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.7 | 195 / 420 | 3.64 | 15.9% | 57578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 15.9% | 195 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 63 |
| germ.TheMind .2 | 4.9 | 9.8% | 15 |
| qualidafial.MajorDick 1.0.1 | 5.1 | 9.5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.8% | 9 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 18 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.5% | 9 |
| sample.Crazy 1.0 | 8.2 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 60.6 | 14 / 35 | 4640 |
| 2 | 1 | 66.2 | 77.8 | 18 / 35 | 5083 |
| 3 | 1 | 64.9 | 72.1 | 16 / 35 | 4947 |
| 4 | 1 | 66.0 | 77.5 | 19 / 35 | 4822 |
| 5 | 1 | 64.8 | 73.3 | 16 / 35 | 4981 |
| 6 | 3 | 61.9 | 67.9 | 14 / 35 | 3996 |
| 7 | 1 | 66.0 | 76.8 | 20 / 35 | 4826 |
| 8 | 3 | 61.8 | 63.8 | 14 / 35 | 4553 |
| 9 | 1 | 63.1 | 66.3 | 16 / 35 | 5267 |
| 10 | 1 | 65.2 | 73.7 | 18 / 35 | 4750 |
| 11 | 1 | 63.7 | 69.2 | 16 / 35 | 4875 |
| 12 | 1 | 63.2 | 69.2 | 14 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 164 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 66% |
| qualidafial.MajorDick 1.0.1 | 15 | 100% |
| germ.TheMind .2 | 15 | 80% |
| awesomeness.Elite 1.0 | 12 | 75% |
| stelo.UntouchableNano 1.3 | 10 | 100% |
| lrem.micro.MoggFanatic 0.2 | 7 | 71% |
| sample.Crazy 1.0 | 5 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 225 of 420 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 43% | 199 |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 19% | 66 |
| germ.TheMind .2 | 22 | 10% | 39 |
| lrem.micro.MoggFanatic 0.2 | 22 | 10% | 29 |
| awesomeness.Elite 1.0 | 19 | 8% | 31 |
| stelo.UntouchableNano 1.3 | 12 | 5% | 20 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 13 |
| mym.EdgeStalker 1.0 | 3 | 1% | 6 |
| sample.Crazy 1.0 | 2 | 1% | 14 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.6 | 292 / 420 | 2.29 | 19.0% | 54975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 292 |
| rz.HawkOnFire 0.1 | 2.3 | 13.4% | 38 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 26 |
| maribo.IotaCT 1.1 | 4.8 | 10.7% | 19 |
| timmit.nano.TimDog 0.33 | 5.4 | 9.8% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.6% | 3 |
| stelo.PatternRobot 1.0 | 7.1 | 8.2% | 11 |
| ratosh.Wesco 1.4 | 7.6 | 8.3% | 9 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.2 | 22 / 35 | 4301 |
| 2 | 1 | 69.6 | 87.6 | 26 / 35 | 4318 |
| 3 | 1 | 68.8 | 84.8 | 23 / 35 | 4729 |
| 4 | 1 | 68.5 | 83.8 | 23 / 35 | 4508 |
| 5 | 1 | 69.5 | 88.9 | 24 / 35 | 4813 |
| 6 | 1 | 70.2 | 89.5 | 25 / 35 | 4815 |
| 7 | 1 | 70.0 | 89.5 | 27 / 35 | 4440 |
| 8 | 1 | 70.0 | 88.3 | 27 / 35 | 4502 |
| 9 | 1 | 70.6 | 90.8 | 27 / 35 | 5079 |
| 10 | 1 | 69.9 | 85.1 | 26 / 35 | 4651 |
| 11 | 1 | 65.6 | 74.9 | 21 / 35 | 4079 |
| 12 | 1 | 67.5 | 81.3 | 21 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 137 | 94% |
| nz.jdc.nano.GridFu 1.0 | 76 | 91% |
| stelo.PatternRobot 1.0 | 34 | 94% |
| maribo.IotaCT 1.1 | 24 | 71% |
| timmit.nano.TimDog 0.33 | 21 | 81% |
| ratosh.Wesco 1.4 | 14 | 79% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |

Hadur died in 128 of 420 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 24 | 19% | 113 |
| ratosh.Wesco 1.4 | 22 | 17% | 36 |
| rz.HawkOnFire 0.1 | 20 | 16% | 113 |
| timmit.nano.TimDog 0.33 | 19 | 15% | 53 |
| maribo.IotaCT 1.1 | 18 | 14% | 40 |
| stelo.PatternRobot 1.0 | 18 | 14% | 35 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 3% | 14 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 7 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 568 over 12 battles (47.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.7 | 309 / 420 | 2.02 | 20.3% | 70888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.3% | 309 |
| tvv.nano.Polaris 1.2 | 2.1 | 12.5% | 48 |
| baal.nano.N 1.42 | 3.3 | 11.3% | 11 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 16 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.7% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.1 | 8.5% | 3 |
| sanja.First 0.1 | 6.9 | 8.4% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 9 |
| cvt.Firsty 1.0 | 8.3 | 7.3% | 13 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.3 | 24 / 35 | 5553 |
| 2 | 1 | 69.6 | 87.3 | 25 / 35 | 5840 |
| 3 | 1 | 70.5 | 90.5 | 28 / 35 | 6046 |
| 4 | 1 | 68.3 | 81.9 | 24 / 35 | 5445 |
| 5 | 1 | 70.0 | 85.1 | 23 / 35 | 6192 |
| 6 | 1 | 71.5 | 93.7 | 28 / 35 | 6370 |
| 7 | 1 | 69.6 | 87.0 | 25 / 35 | 5748 |
| 8 | 1 | 70.9 | 92.1 | 26 / 35 | 6082 |
| 9 | 1 | 70.6 | 93.3 | 26 / 35 | 5881 |
| 10 | 1 | 69.7 | 87.6 | 25 / 35 | 5791 |
| 11 | 1 | 70.7 | 90.2 | 27 / 35 | 6060 |
| 12 | 1 | 69.6 | 88.6 | 28 / 35 | 5880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 81 | 79% |
| cvt.Firsty 1.0 | 59 | 88% |
| baal.nano.N 1.42 | 59 | 97% |
| zyx.micro.Ant 1.1 | 47 | 96% |
| sanja.First 0.1 | 35 | 100% |
| Grystrion.TrackerWO 1.0 | 25 | 100% |
| amk.Punbot.Punbot 0.01 | 23 | 83% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 112 of 420 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 33% | 130 |
| zyx.micro.Ant 1.1 | 17 | 15% | 70 |
| cvt.Firsty 1.0 | 14 | 13% | 43 |
| Grystrion.TrackerWO 1.0 | 10 | 9% | 31 |
| amk.Punbot.Punbot 0.01 | 9 | 8% | 12 |
| sample.RamFire 1.0 | 9 | 8% | 11 |
| baal.nano.N 1.42 | 7 | 6% | 52 |
| sanja.First 0.1 | 7 | 6% | 42 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 17 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 12 battles (14.1 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 63.6 | 107 / 420 | 4.27 | 13.7% | 51647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 15.8% | 183 |
| hadur117.micro.SaorC 0.1 | 2.3 | 13.7% | 107 |
| cs.Wren 1.0 | 3.1 | 12.7% | 47 |
| js.PinBall 1.6 | 4.3 | 11.6% | 27 |
| mz.Cork 0.1 | 4.3 | 11.7% | 28 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 3 |
| evd.X1 0.01 | 7.1 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 11 |
| donjezza.Jezza 1.0 | 9.1 | 5.9% | 12 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 61.3 | 6 / 35 | 4251 |
| 2 | 3 | 58.1 | 56.2 | 10 / 35 | 4265 |
| 3 | 2 | 60.5 | 64.1 | 8 / 35 | 4489 |
| 4 | 3 | 58.7 | 57.1 | 7 / 35 | 4440 |
| 5 | 2 | 60.5 | 64.1 | 11 / 35 | 4396 |
| 6 | 2 | 60.1 | 63.8 | 9 / 35 | 4323 |
| 7 | 4 | 57.3 | 56.8 | 9 / 35 | 3965 |
| 8 | 2 | 61.4 | 68.3 | 8 / 35 | 4324 |
| 9 | 2 | 62.0 | 69.2 | 9 / 35 | 4524 |
| 10 | 1 | 61.0 | 65.7 | 12 / 35 | 4443 |
| 11 | 2 | 61.9 | 70.5 | 9 / 35 | 4232 |
| 12 | 2 | 60.5 | 66.3 | 9 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 114 | 36% |
| cs.Wren 1.0 | 35 | 86% |
| mz.Cork 0.1 | 18 | 89% |
| js.PinBall 1.6 | 15 | 60% |
| donjezza.Jezza 1.0 | 6 | 67% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 314 of 420 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 146 | 46% | 192 |
| joe.ADinosaur 1.0 | 39 | 12% | 42 |
| js.PinBall 1.6 | 35 | 11% | 47 |
| evd.X1 0.01 | 31 | 10% | 33 |
| cs.Wren 1.0 | 28 | 9% | 46 |
| mz.Cork 0.1 | 19 | 6% | 36 |
| donjezza.Jezza 1.0 | 7 | 2% | 10 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 239 over 12 battles (19.9 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.5 | 250 / 420 | 2.67 | 18.1% | 54512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.1% | 250 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 41 |
| ntc.Opposite 1.5 | 3.5 | 11.0% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.4% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.5% | 42 |
| pfvicm.Sobieski 7.2.3b | 5.1 | 10.0% | 11 |
| DBall.NUKE 0.1 | 6.7 | 8.5% | 16 |
| disan.Chair 2.2.0 | 7.8 | 7.9% | 12 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 9 |
| pbg.R2D2 1.0 | 9.5 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.3 | 25 / 35 | 4861 |
| 2 | 1 | 67.6 | 82.2 | 22 / 35 | 4676 |
| 3 | 1 | 67.7 | 81.9 | 22 / 35 | 4917 |
| 4 | 1 | 65.8 | 79.4 | 17 / 35 | 4406 |
| 5 | 1 | 67.2 | 82.2 | 21 / 35 | 4544 |
| 6 | 1 | 66.5 | 79.4 | 19 / 35 | 4907 |
| 7 | 1 | 67.3 | 85.1 | 23 / 35 | 3881 |
| 8 | 1 | 67.8 | 82.2 | 23 / 35 | 4349 |
| 9 | 1 | 66.3 | 79.4 | 21 / 35 | 4271 |
| 10 | 1 | 67.7 | 83.5 | 23 / 35 | 4698 |
| 11 | 1 | 66.5 | 77.5 | 17 / 35 | 4752 |
| 12 | 1 | 64.6 | 76.8 | 17 / 35 | 4250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 73 | 88% |
| stelo.AreaTargetingBot 1.1 | 59 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 34 | 94% |
| DBall.NUKE 0.1 | 28 | 100% |
| ntc.Opposite 1.5 | 27 | 67% |
| disan.Chair 2.2.0 | 24 | 96% |
| pfvicm.Sobieski 7.2.3b | 19 | 89% |
| donjezza.Muncho 1.0 | 18 | 83% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 173 of 420 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 20% | 75 |
| pfvicm.Sobieski 7.2.3b | 35 | 20% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 29 | 17% | 57 |
| myl.nano.Graviton 1.10 | 28 | 16% | 86 |
| ntc.Opposite 1.5 | 25 | 14% | 51 |
| DBall.NUKE 0.1 | 6 | 3% | 31 |
| pbg.R2D2 1.0 | 6 | 3% | 18 |
| disan.Chair 2.2.0 | 5 | 3% | 21 |
| donjezza.Muncho 1.0 | 4 | 2% | 23 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 785 over 12 battles (65.4 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 69.9 | 144 / 420 | 3.71 | 14.9% | 47247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 14.9% | 144 |
| oog.melee.Capulet 1.2 | 2.3 | 14.1% | 102 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.7% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.4% | 52 |
| yagami.Tidus 0.11 | 4.9 | 11.8% | 17 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 19 |
| stelo.MirrorNano 1.3 | 7.1 | 8.3% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 63.2 | 13 / 35 | 3796 |
| 2 | 1 | 63.4 | 70.2 | 11 / 35 | 4301 |
| 3 | 1 | 61.1 | 64.8 | 11 / 35 | 3877 |
| 4 | 2 | 61.4 | 66.0 | 9 / 35 | 3724 |
| 5 | 1 | 66.1 | 82.9 | 15 / 35 | 3810 |
| 6 | 3 | 63.1 | 68.9 | 11 / 35 | 3904 |
| 7 | 1 | 62.7 | 66.3 | 15 / 35 | 3808 |
| 8 | 2 | 63.6 | 71.1 | 10 / 35 | 3918 |
| 9 | 2 | 61.9 | 68.3 | 10 / 35 | 3864 |
| 10 | 1 | 66.9 | 84.8 | 17 / 35 | 4177 |
| 11 | 1 | 62.1 | 62.5 | 9 / 35 | 4072 |
| 12 | 1 | 63.1 | 69.5 | 13 / 35 | 3996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 71 | 54% |
| kawigi.micro.Shiz 1.1 | 53 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 71% |
| yagami.Tidus 0.11 | 26 | 88% |
| ejb.Polaris 1.0.1 | 12 | 67% |
| stelo.MirrorNano 1.3 | 4 | 100% |

Hadur died in 278 of 420 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 102 | 37% | 150 |
| kawigi.micro.Shiz 1.1 | 40 | 14% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 14% | 69 |
| yagami.Tidus 0.11 | 34 | 12% | 51 |
| ejb.Polaris 1.0.1 | 29 | 10% | 50 |
| stelo.MirrorNano 1.3 | 15 | 5% | 17 |
| step.nanoPri 1.0 | 10 | 4% | 10 |
| kurios.DOSexe .9a | 9 | 3% | 11 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 248 over 12 battles (20.7 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.8 | 201 / 420 | 3.36 | 15.9% | 47076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 15.9% | 201 |
| wee.Gem 1.8.4 | 3.1 | 12.2% | 74 |
| wompi.Quokka 1.6 | 3.4 | 12.1% | 48 |
| bzdp.Pansy 2.1 | 3.4 | 11.9% | 38 |
| ratosh.Nobo 0.21 | 4.3 | 11.5% | 35 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 13 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.9 | 7.1% | 5 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.6 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 78.7 | 19 / 35 | 4100 |
| 2 | 1 | 65.0 | 76.8 | 21 / 35 | 4263 |
| 3 | 1 | 59.4 | 62.5 | 14 / 35 | 3276 |
| 4 | 1 | 66.5 | 81.3 | 20 / 35 | 4404 |
| 5 | 1 | 65.6 | 79.0 | 17 / 35 | 4451 |
| 6 | 1 | 62.8 | 70.8 | 13 / 35 | 3777 |
| 7 | 1 | 61.3 | 69.2 | 15 / 35 | 3402 |
| 8 | 1 | 65.9 | 77.8 | 19 / 35 | 4240 |
| 9 | 1 | 64.0 | 77.1 | 19 / 35 | 3763 |
| 10 | 1 | 64.7 | 78.1 | 17 / 35 | 4085 |
| 11 | 1 | 59.7 | 64.8 | 10 / 35 | 3504 |
| 12 | 1 | 62.8 | 69.5 | 17 / 35 | 3811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 76 | 93% |
| wee.Gem 1.8.4 | 54 | 81% |
| wompi.Quokka 1.6 | 51 | 63% |
| ratosh.Nobo 0.21 | 21 | 81% |
| bayen.UbaMicro 1.4 | 16 | 94% |
| m3thos.Eva00 1.1 | 13 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |

Hadur died in 222 of 420 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 49 | 22% | 69 |
| wee.Gem 1.8.4 | 30 | 14% | 79 |
| ratosh.Nobo 0.21 | 28 | 13% | 52 |
| bzdp.Pansy 2.1 | 26 | 12% | 81 |
| maribo.FollowFire 1 | 26 | 12% | 27 |
| bayen.UbaMicro 1.4 | 19 | 9% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 18 | 8% | 29 |
| m3thos.Eva00 1.1 | 15 | 7% | 27 |
| stelo.MyAgileRobot 0.2 | 11 | 5% | 14 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 12 battles (12.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 80.5 | 97 / 420 | 2.75 | 18.2% | 80287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.2% | 283 |
| hadur117.micro.SaorC 0.1 | 1.8 | 18.2% | 97 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 27 |
| ayk.WallHugger 1.0 | 4.3 | 10.3% | 4 |
| exauge.GateKeeper 1.1.121g | 5.1 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.2% | 1 |
| stelo.PianistNano 1.2 | 7.1 | 7.2% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 6.2% | 4 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 78.1 | 7 / 35 | 6495 |
| 2 | 2 | 70.1 | 85.7 | 7 / 35 | 7211 |
| 3 | 2 | 70.7 | 84.8 | 13 / 35 | 7080 |
| 4 | 2 | 69.1 | 81.6 | 10 / 35 | 6696 |
| 5 | 2 | 68.9 | 81.3 | 8 / 35 | 6533 |
| 6 | 2 | 65.7 | 72.4 | 4 / 35 | 5813 |
| 7 | 2 | 68.0 | 78.1 | 4 / 35 | 6681 |
| 8 | 1 | 71.2 | 87.0 | 12 / 35 | 7277 |
| 9 | 2 | 64.9 | 68.9 | 6 / 35 | 5753 |
| 10 | 2 | 68.6 | 78.1 | 7 / 35 | 6811 |
| 11 | 1 | 71.0 | 87.6 | 12 / 35 | 7059 |
| 12 | 2 | 69.2 | 82.9 | 7 / 35 | 6878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 210 | 20% |
| mz.NanoGod 2.02 | 33 | 70% |
| exauge.GateKeeper 1.1.121g | 13 | 100% |
| drd.Dreadknoght 0.9 | 12 | 92% |
| ayk.WallHugger 1.0 | 5 | 80% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 323 of 420 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 224 | 69% | 277 |
| mz.NanoGod 2.02 | 55 | 17% | 80 |
| ayk.WallHugger 1.0 | 18 | 6% | 22 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 15 |
| stuff.Vlad 0.1 | 9 | 3% | 10 |
| stelo.PianistNano 1.2 | 6 | 2% | 7 |
| drd.Dreadknoght 0.9 | 2 | 1% | 9 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 12 battles (22.6 per battle, most in one battle 87). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.6 | 210 / 420 | 3.56 | 16.1% | 54374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.1% | 210 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 30 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 50 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 38 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.4 | 10.8% | 37 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.6% | 22 |
| conscience.Electron 1.3g | 7.3 | 8.0% | 7 |
| ap.Frederick 1.1 | 8.4 | 7.0% | 19 |
| dl.BetterWalls 1.0 | 8.6 | 6.8% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 66.7 | 15 / 35 | 4631 |
| 2 | 1 | 64.0 | 72.7 | 16 / 35 | 4638 |
| 3 | 1 | 64.9 | 74.0 | 21 / 35 | 4565 |
| 4 | 1 | 65.9 | 79.0 | 18 / 35 | 4698 |
| 5 | 1 | 65.4 | 76.2 | 18 / 35 | 4659 |
| 6 | 1 | 62.5 | 67.9 | 15 / 35 | 4362 |
| 7 | 1 | 62.7 | 68.6 | 16 / 35 | 4378 |
| 8 | 1 | 66.0 | 76.8 | 21 / 35 | 4700 |
| 9 | 1 | 63.3 | 70.5 | 17 / 35 | 4396 |
| 10 | 1 | 59.1 | 58.4 | 14 / 35 | 3832 |
| 11 | 1 | 65.9 | 75.9 | 21 / 35 | 4860 |
| 12 | 1 | 64.0 | 72.1 | 18 / 35 | 4655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 68 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 55 | 95% |
| dummy.micro.Sparrow 2.5 | 41 | 80% |
| bvh.micro.Freya 0.3 | 34 | 85% |
| stelo.MirrorMicro 1.0 | 17 | 65% |
| ap.Frederick 1.1 | 16 | 94% |
| dl.BetterWalls 1.0 | 4 | 50% |
| conscience.Electron 1.3g | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 211 of 420 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 33 | 16% | 34 |
| conscience.Electron 1.3g | 31 | 15% | 41 |
| voidious.micro.BlitzBat 1.05 | 30 | 14% | 86 |
| dummy.micro.Sparrow 2.5 | 30 | 14% | 68 |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 13% | 82 |
| bvh.micro.Freya 0.3 | 24 | 11% | 44 |
| stelo.MirrorMicro 1.0 | 18 | 9% | 34 |
| dl.BetterWalls 1.0 | 17 | 8% | 30 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 12 battles (38.3 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 84.0 | 267 / 420 | 2.44 | 19.9% | 76633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.9% | 267 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.5% | 51 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 28 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 18 |
| dsw.StaticD 1.0 | 5.3 | 9.3% | 17 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.0% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.5% | 10 |
| sample.MyFirstRobot 1.0 | 8.4 | 6.3% | 16 |
| sample.Corners 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 84.8 | 22 / 35 | 6462 |
| 2 | 1 | 70.8 | 87.9 | 25 / 35 | 6146 |
| 3 | 1 | 70.0 | 86.0 | 21 / 35 | 6302 |
| 4 | 1 | 70.3 | 83.2 | 22 / 35 | 6648 |
| 5 | 1 | 70.3 | 84.8 | 23 / 35 | 6673 |
| 6 | 1 | 69.9 | 84.1 | 23 / 35 | 6522 |
| 7 | 1 | 69.0 | 83.2 | 21 / 35 | 6032 |
| 8 | 1 | 70.3 | 83.8 | 24 / 35 | 6814 |
| 9 | 1 | 69.1 | 81.9 | 21 / 35 | 6345 |
| 10 | 1 | 70.0 | 84.4 | 23 / 35 | 6491 |
| 11 | 1 | 68.8 | 81.0 | 22 / 35 | 6153 |
| 12 | 1 | 69.0 | 83.2 | 20 / 35 | 6045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 98 | 92% |
| sul.Lunar 1.1 | 84 | 100% |
| supersample.SuperBoxBot 1.0 | 36 | 83% |
| dsw.StaticD 1.0 | 28 | 57% |
| sample.MyFirstRobot 1.0 | 21 | 62% |
| mme.NikeEnhanced 2.0 | 15 | 93% |
| tlp.ThreeLeggedPig 1 | 10 | 90% |
| sample.Corners 1.0 | 7 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |

Hadur died in 156 of 420 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 28% | 127 |
| supersample.SuperBoxBot 1.0 | 36 | 23% | 63 |
| dsw.StaticD 1.0 | 26 | 17% | 55 |
| mme.NikeEnhanced 2.0 | 11 | 7% | 24 |
| sul.Lunar 1.1 | 9 | 6% | 86 |
| sample.MyFirstRobot 1.0 | 9 | 6% | 20 |
| tlp.ThreeLeggedPig 1 | 8 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 4% | 17 |
| sample.Corners 1.0 | 5 | 3% | 15 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: 13th Gen Intel(R) Core(TM) i5-13600HX, 20 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 12 battles (7.6 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.8 | 207 / 420 | 2.91 | 17.6% | 68696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.6% | 207 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 79 |
| mld.Wisdom 1.0 | 3.9 | 11.7% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 53 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.4% | 15 |
| amz.NanoClone 1.41 | 5.3 | 10.2% | 22 |
| sample.Walls 1.0 | 7.3 | 7.7% | 15 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.6 | 6.4% | 6 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.9 | 16 / 35 | 5721 |
| 2 | 1 | 66.4 | 79.0 | 15 / 35 | 5886 |
| 3 | 1 | 68.7 | 85.1 | 21 / 35 | 5853 |
| 4 | 1 | 67.2 | 79.0 | 20 / 35 | 5651 |
| 5 | 1 | 66.0 | 76.2 | 17 / 35 | 5374 |
| 6 | 1 | 65.7 | 75.6 | 19 / 35 | 5425 |
| 7 | 1 | 69.4 | 86.0 | 20 / 35 | 6471 |
| 8 | 1 | 66.9 | 79.4 | 17 / 35 | 5703 |
| 9 | 1 | 67.9 | 81.9 | 21 / 35 | 5627 |
| 10 | 1 | 66.3 | 79.0 | 16 / 35 | 5542 |
| 11 | 1 | 66.6 | 79.4 | 13 / 35 | 5905 |
| 12 | 1 | 63.7 | 70.2 | 12 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 89 | 92% |
| radnor.DoctorBob 1.42 | 68 | 51% |
| mld.Wisdom 1.0 | 26 | 88% |
| amz.NanoClone 1.41 | 25 | 72% |
| KiraNL.Chupacabra 0.4 | 25 | 80% |
| jangs.ns51 1.0 | 9 | 89% |
| GarmBox.Oranges 1.0 | 9 | 100% |
| sample.Target 1.0 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |

Hadur died in 213 of 420 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 72 | 34% | 118 |
| mld.Wisdom 1.0 | 36 | 17% | 63 |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 15% | 109 |
| KiraNL.Chupacabra 0.4 | 28 | 13% | 43 |
| amz.NanoClone 1.41 | 22 | 10% | 30 |
| jangs.ns51 1.0 | 9 | 4% | 17 |
| GarmBox.Oranges 1.0 | 8 | 4% | 12 |
| sample.Walls 1.0 | 7 | 3% | 21 |

