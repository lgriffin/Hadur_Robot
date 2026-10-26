# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.8 | 240 / 420 | 2.45 | 19.6% | 77087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 19.6% | 240 |
| radnor.DoctorBob 1.42 | 2.3 | 15.5% | 93 |
| mz.AntiGrav 1.0 | 3.3 | 13.5% | 24 |
| mld.Infinity 2.2 | 3.4 | 13.5% | 42 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 13 |
| sample.Walls 1.0 | 6.7 | 6.9% | 6 |
| GarmBox.Oranges 1.0 | 6.9 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.4 | 6.2% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.6 | 20 / 35 | 6411 |
| 2 | 1 | 70.6 | 85.7 | 21 / 35 | 6100 |
| 3 | 1 | 69.1 | 78.7 | 20 / 35 | 6333 |
| 4 | 1 | 70.4 | 85.7 | 20 / 35 | 6444 |
| 5 | 1 | 71.4 | 87.9 | 23 / 35 | 6507 |
| 6 | 1 | 70.8 | 86.7 | 22 / 35 | 6559 |
| 7 | 1 | 71.3 | 87.9 | 19 / 35 | 6926 |
| 8 | 1 | 70.7 | 85.4 | 25 / 35 | 6421 |
| 9 | 1 | 69.2 | 81.3 | 18 / 35 | 6382 |
| 10 | 1 | 68.0 | 76.2 | 14 / 35 | 6298 |
| 11 | 1 | 69.2 | 81.3 | 17 / 35 | 6108 |
| 12 | 1 | 71.0 | 87.6 | 21 / 35 | 6598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 95 | 97% |
| mld.Infinity 2.2 | 91 | 82% |
| radnor.DoctorBob 1.42 | 79 | 52% |
| amz.NanoClone 1.41 | 8 | 63% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 7 | 86% |
| sample.Target 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |

Hadur died in 182 of 420 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 95 | 52% | 176 |
| amz.NanoClone 1.41 | 23 | 13% | 37 |
| mld.Infinity 2.2 | 23 | 13% | 27 |
| mz.AntiGrav 1.0 | 18 | 10% | 108 |
| GarmBox.Oranges 1.0 | 7 | 4% | 11 |
| sample.Walls 1.0 | 6 | 3% | 24 |
| jangs.ns51 1.0 | 6 | 3% | 13 |
| arthord.MannyPacquiao Beta | 4 | 2% | 10 |

## Melee bench: F02

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 290 / 420 | 2.08 | 19.1% | 60841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.2 | 19.1% | 290 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.5% | 87 |
| maribo.melee.BMV 0.1 | 3.9 | 10.3% | 2 |
| mld.DustBunny 3.8 | 4.0 | 11.9% | 14 |
| zyx.nano.Ant 1.1 | 5.1 | 9.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.9% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.0% | 8 |
| bzdp.BoxCar 2.0 | 7.8 | 7.4% | 2 |
| fullsail.SweetTea 1.1 | 8.3 | 6.5% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 54.9 | 12 / 35 | 4458 |
| 2 | 1 | 70.1 | 94.3 | 28 / 35 | 5045 |
| 3 | 1 | 70.5 | 94.0 | 25 / 35 | 5688 |
| 4 | 1 | 68.8 | 89.5 | 23 / 35 | 5385 |
| 5 | 1 | 69.0 | 90.5 | 23 / 35 | 5395 |
| 6 | 1 | 69.6 | 90.5 | 28 / 35 | 4785 |
| 7 | 1 | 69.3 | 88.9 | 26 / 35 | 5023 |
| 8 | 1 | 69.8 | 89.5 | 28 / 35 | 4960 |
| 9 | 1 | 69.3 | 90.5 | 24 / 35 | 4936 |
| 10 | 1 | 67.7 | 85.7 | 23 / 35 | 4545 |
| 11 | 1 | 70.1 | 91.4 | 24 / 35 | 5246 |
| 12 | 1 | 70.3 | 95.9 | 26 / 35 | 5375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 162 | 71% |
| mld.DustBunny 3.8 | 81 | 99% |
| djdjdj.NanoSkunk10 1.0 | 25 | 96% |
| maribo.melee.BMV 0.1 | 25 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 83% |
| fullsail.SweetTea 1.1 | 19 | 100% |
| zyx.nano.Ant 1.1 | 8 | 100% |
| bzdp.BoxCar 2.0 | 2 | 50% |

Hadur died in 132 of 420 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 47% | 177 |
| mld.DustBunny 3.8 | 15 | 11% | 80 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 8% | 33 |
| zyx.nano.Ant 1.1 | 11 | 8% | 24 |
| djdjdj.NanoSkunk10 1.0 | 8 | 6% | 40 |
| maribo.melee.BMV 0.1 | 8 | 6% | 23 |
| cs.Grudge 1.0 | 7 | 5% | 7 |
| fullsail.SweetTea 1.1 | 6 | 5% | 23 |
| bzdp.BoxCar 2.0 | 4 | 3% | 10 |

## Melee bench: F03

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 82.4 | 264 / 420 | 2.59 | 19.1% | 66037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 19.1% | 264 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 67 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.7% | 29 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 4 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.8% | 28 |
| cs.sheldor.Talon 1.1 | 6.9 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 11 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.6 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 76.8 | 21 / 35 | 5858 |
| 2 | 1 | 67.5 | 78.4 | 21 / 35 | 5157 |
| 3 | 1 | 66.4 | 75.2 | 16 / 35 | 5233 |
| 4 | 1 | 69.2 | 84.4 | 23 / 35 | 5409 |
| 5 | 1 | 68.9 | 81.6 | 21 / 35 | 5679 |
| 6 | 1 | 66.9 | 76.5 | 18 / 35 | 5384 |
| 7 | 1 | 69.8 | 83.8 | 24 / 35 | 5793 |
| 8 | 1 | 70.6 | 88.6 | 24 / 35 | 5575 |
| 9 | 1 | 70.9 | 89.5 | 26 / 35 | 5846 |
| 10 | 1 | 69.1 | 85.1 | 24 / 35 | 5257 |
| 11 | 1 | 68.7 | 83.5 | 21 / 35 | 5252 |
| 12 | 1 | 70.2 | 85.1 | 25 / 35 | 5594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 97 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 67 | 93% |
| myl.nano.KomoriNinja 1.1 | 43 | 95% |
| cb.nano.Insomnia 1.0 | 38 | 71% |
| sp.Nanos.Ember 1.1 | 28 | 89% |
| fm.mammillarias 1.3 | 12 | 92% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 156 of 420 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 35 | 22% | 125 |
| stelo.SoRobotNanoMelee 1.2 | 29 | 19% | 73 |
| cb.nano.Insomnia 1.0 | 25 | 16% | 26 |
| fm.mammillarias 1.3 | 21 | 13% | 33 |
| myl.nano.KomoriNinja 1.1 | 19 | 12% | 87 |
| sp.Nanos.Ember 1.1 | 7 | 4% | 31 |
| sample.Fire 1.0 | 7 | 4% | 16 |
| sample.Tracker 1.0 | 7 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 18 |

## Melee bench: F04

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.1 | 255 / 420 | 2.61 | 19.0% | 70272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 19.0% | 255 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.5% | 37 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 45 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.4% | 3 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.4% | 35 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 18 |
| yk.JahMicro 1.0 | 7.3 | 7.8% | 10 |
| repositorio.NanoStep 1.0 | 8.9 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 24 / 35 | 6203 |
| 2 | 1 | 67.3 | 78.4 | 19 / 35 | 5755 |
| 3 | 1 | 70.4 | 87.6 | 24 / 35 | 6115 |
| 4 | 1 | 67.9 | 82.2 | 21 / 35 | 5551 |
| 5 | 1 | 68.5 | 79.7 | 21 / 35 | 6420 |
| 6 | 1 | 65.8 | 73.0 | 17 / 35 | 5508 |
| 7 | 1 | 68.9 | 85.7 | 20 / 35 | 6018 |
| 8 | 1 | 68.8 | 82.5 | 22 / 35 | 5983 |
| 9 | 1 | 68.2 | 82.5 | 22 / 35 | 5311 |
| 10 | 1 | 69.1 | 84.1 | 22 / 35 | 5817 |
| 11 | 1 | 68.5 | 82.5 | 21 / 35 | 5857 |
| 12 | 1 | 67.5 | 77.8 | 22 / 35 | 5734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 121 | 92% |
| stelo.SoJNanoMelee 1.1 | 62 | 89% |
| tvv.micro.Antares 1.1.1 | 42 | 74% |
| tj.zombie1n 1.0.1 | 22 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 53% |
| yk.JahMicro 1.0 | 12 | 92% |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 4 | 75% |

Hadur died in 165 of 420 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 31% | 168 |
| tvv.micro.Antares 1.1.1 | 42 | 25% | 80 |
| stelo.SoJNanoMelee 1.1 | 20 | 12% | 46 |
| Grystrion.RandomTrackerNOREV 1.0 | 15 | 9% | 25 |
| tj.zombie1n 1.0.1 | 14 | 8% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 8% | 35 |
| yk.JahMicro 1.0 | 5 | 3% | 16 |
| sample.VelociRobot 1.0 | 4 | 2% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 19 |

## Melee bench: F05

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.2 | 188 / 420 | 3.86 | 15.4% | 53248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 15.4% | 188 |
| oog.melee.Corsair 1.0 | 2.5 | 12.3% | 63 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 62 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 43 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 13 |
| sam.Samspin 1.0 | 6.1 | 9.8% | 19 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.4% | 14 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.9% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.2 | 62.9 | 10 / 35 | 4103 |
| 2 | 1 | 64.1 | 74.9 | 16 / 35 | 4465 |
| 3 | 1 | 61.6 | 65.4 | 16 / 35 | 4392 |
| 4 | 1 | 62.3 | 68.6 | 15 / 35 | 4047 |
| 5 | 1 | 62.9 | 67.9 | 17 / 35 | 4472 |
| 6 | 1 | 62.4 | 67.3 | 15 / 35 | 4280 |
| 7 | 1 | 63.2 | 68.3 | 18 / 35 | 4592 |
| 8 | 1 | 60.9 | 62.2 | 12 / 35 | 4370 |
| 9 | 1 | 62.8 | 68.9 | 17 / 35 | 4272 |
| 10 | 1 | 66.2 | 73.3 | 21 / 35 | 5392 |
| 11 | 1 | 62.8 | 67.9 | 15 / 35 | 4676 |
| 12 | 1 | 63.0 | 70.8 | 16 / 35 | 4187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 61 | 95% |
| ahf.NanoAndrew .4 | 56 | 77% |
| oog.melee.Corsair 1.0 | 42 | 60% |
| EBBU.Sim2 1.02 | 25 | 96% |
| sam.Samspin 1.0 | 20 | 100% |
| robar.nano.Assertive_Melee 0.2 | 14 | 86% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 233 of 420 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 18% | 94 |
| robar.nano.Assertive_Melee 0.2 | 38 | 16% | 49 |
| ahf.NanoAndrew .4 | 36 | 15% | 86 |
| oog.melee.Corsair 1.0 | 27 | 12% | 65 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 10% | 25 |
| EBBU.Sim2 1.02 | 22 | 9% | 38 |
| zyx.nano.BacillusComma 1.0 | 19 | 8% | 22 |
| sam.Samspin 1.0 | 18 | 8% | 29 |
| sample.TrackFire 1.0 | 7 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.4 | 247 / 420 | 2.49 | 18.1% | 58346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 18.1% | 247 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 68 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 36 |
| arthord.NanoSatanMelee Beta | 5.1 | 9.2% | 5 |
| oog.melee.CapuletDroid 1.1 | 5.1 | 9.6% | 33 |
| fm.claire 1.7 | 6.0 | 8.5% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.7% | 17 |
| sample.SpinBot 1.0 | 7.7 | 7.6% | 7 |
| pa.Improved 1.0 | 9.4 | 6.0% | 3 |
| kurios.DOSexe .9b | 9.6 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.4 | 18 / 35 | 4706 |
| 2 | 1 | 66.5 | 81.6 | 20 / 35 | 4595 |
| 3 | 1 | 67.0 | 82.5 | 18 / 35 | 5171 |
| 4 | 1 | 67.9 | 87.3 | 21 / 35 | 4802 |
| 5 | 1 | 66.8 | 79.4 | 21 / 35 | 4918 |
| 6 | 1 | 64.1 | 73.7 | 14 / 35 | 4557 |
| 7 | 1 | 67.0 | 83.5 | 22 / 35 | 4762 |
| 8 | 1 | 67.7 | 85.1 | 21 / 35 | 5031 |
| 9 | 1 | 68.0 | 85.7 | 21 / 35 | 5159 |
| 10 | 1 | 68.2 | 88.9 | 25 / 35 | 4329 |
| 11 | 1 | 69.8 | 89.5 | 25 / 35 | 5494 |
| 12 | 1 | 66.6 | 79.4 | 21 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 109 | 83% |
| oog.melee.CapuletDroid 1.1 | 63 | 84% |
| gh.nano.Grofvuil 0.2 | 46 | 74% |
| arthord.NanoSatanMelee Beta | 24 | 96% |
| sample.SpinBot 1.0 | 18 | 94% |
| winamp32.micro.MicroMacro 1.0 | 17 | 71% |
| fm.claire 1.7 | 7 | 71% |
| kurios.DOSexe .9b | 7 | 100% |
| pa.Improved 1.0 | 6 | 83% |

Hadur died in 177 of 420 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 23% | 129 |
| gh.nano.Grofvuil 0.2 | 37 | 21% | 88 |
| oog.melee.CapuletDroid 1.1 | 27 | 15% | 32 |
| arthord.NanoSatanMelee Beta | 20 | 11% | 51 |
| winamp32.micro.MicroMacro 1.0 | 14 | 8% | 35 |
| fm.claire 1.7 | 12 | 7% | 28 |
| sample.SpinBot 1.0 | 12 | 7% | 15 |
| kurios.DOSexe .9b | 6 | 3% | 23 |
| pa.Improved 1.0 | 6 | 3% | 15 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.8 | 178 / 420 | 2.72 | 17.6% | 64210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 17.6% | 178 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.3% | 99 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 51 |
| mz.MicroGodMelee 1 | 3.5 | 13.1% | 75 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 8 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.7% | 4 |
| el.JumpShoot 0.2 | 7.6 | 6.4% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 5.9% | 4 |
| fire219.CatBot 1.0 | 9.1 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.4 | 18 / 35 | 5215 |
| 2 | 1 | 65.5 | 74.3 | 11 / 35 | 5440 |
| 3 | 1 | 67.0 | 82.5 | 11 / 35 | 5293 |
| 4 | 1 | 68.0 | 84.4 | 17 / 35 | 5491 |
| 5 | 1 | 67.2 | 82.9 | 15 / 35 | 5344 |
| 6 | 1 | 67.0 | 79.7 | 16 / 35 | 5603 |
| 7 | 1 | 67.4 | 81.9 | 15 / 35 | 5370 |
| 8 | 1 | 66.3 | 81.3 | 16 / 35 | 4983 |
| 9 | 1 | 68.6 | 85.4 | 17 / 35 | 5525 |
| 10 | 1 | 65.8 | 77.1 | 12 / 35 | 5302 |
| 11 | 1 | 66.0 | 74.6 | 16 / 35 | 5363 |
| 12 | 1 | 66.6 | 80.6 | 14 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 89 | 88% |
| mz.MicroGodMelee 1 | 84 | 43% |
| gh.micro.Gruweltje 0.7 | 70 | 29% |
| DBall.Anarchy 0.1 | 24 | 100% |
| caimano.Furia_Ceca 0.22 | 9 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 243 of 420 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 83 | 34% | 124 |
| gh.micro.Gruweltje 0.7 | 77 | 32% | 114 |
| spinnercat.micro.Tyger 0.1 | 36 | 15% | 90 |
| fire219.CatBot 1.0 | 13 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 17 |
| acogdev.alpha 0.2 | 8 | 3% | 14 |
| DBall.Anarchy 0.1 | 7 | 3% | 28 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 10 |
| el.JumpShoot 0.2 | 3 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 67.9 | 177 / 420 | 3.89 | 15.4% | 56830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.6 | 15.4% | 177 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.6 | 13.9% | 72 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 14 |
| germ.TheMind .2 | 4.9 | 9.8% | 14 |
| awesomeness.Elite 1.0 | 6.6 | 8.4% | 14 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.0% | 16 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 8.1% | 8 |
| sample.Crazy 1.0 | 8.4 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 62.2 | 16 / 35 | 4757 |
| 2 | 2 | 63.4 | 68.6 | 13 / 35 | 4882 |
| 3 | 3 | 57.0 | 52.7 | 8 / 35 | 4637 |
| 4 | 1 | 65.2 | 75.9 | 19 / 35 | 4734 |
| 5 | 1 | 62.0 | 66.3 | 14 / 35 | 4633 |
| 6 | 2 | 60.9 | 61.3 | 14 / 35 | 4624 |
| 7 | 1 | 67.7 | 80.6 | 21 / 35 | 5268 |
| 8 | 1 | 65.0 | 74.0 | 17 / 35 | 4539 |
| 9 | 1 | 64.4 | 72.4 | 16 / 35 | 4813 |
| 10 | 2 | 63.7 | 71.7 | 14 / 35 | 4687 |
| 11 | 1 | 62.1 | 65.4 | 14 / 35 | 4697 |
| 12 | 2 | 61.7 | 63.8 | 11 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 129 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 75% |
| germ.TheMind .2 | 15 | 80% |
| stelo.UntouchableNano 1.3 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 10 | 90% |
| sample.Crazy 1.0 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| mym.EdgeStalker 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 243 of 420 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 103 | 42% | 191 |
| simonton.nano.WeekendObsession_Melee 1.0 | 46 | 19% | 75 |
| germ.TheMind .2 | 26 | 11% | 42 |
| stelo.UntouchableNano 1.3 | 21 | 9% | 31 |
| awesomeness.Elite 1.0 | 16 | 7% | 22 |
| qualidafial.MajorDick 1.0.1 | 14 | 6% | 22 |
| lrem.micro.MoggFanatic 0.2 | 10 | 4% | 18 |
| mym.EdgeStalker 1.0 | 5 | 2% | 10 |
| sample.Crazy 1.0 | 2 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.0 | 295 / 420 | 2.08 | 19.3% | 54350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 19.3% | 295 |
| rz.HawkOnFire 0.1 | 2.3 | 14.0% | 41 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.5% | 25 |
| maribo.IotaCT 1.1 | 4.4 | 10.5% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 6 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 17 |
| stelo.PatternRobot 1.0 | 7.6 | 8.1% | 11 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 5 |
| spinnercat.Omen 1.0 | 8.4 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.7 | 25 / 35 | 4700 |
| 2 | 1 | 69.1 | 87.0 | 24 / 35 | 4411 |
| 3 | 1 | 70.7 | 91.1 | 26 / 35 | 4731 |
| 4 | 1 | 69.1 | 88.6 | 24 / 35 | 4415 |
| 5 | 1 | 70.5 | 91.7 | 25 / 35 | 4493 |
| 6 | 1 | 69.4 | 87.0 | 24 / 35 | 4837 |
| 7 | 1 | 70.6 | 91.1 | 24 / 35 | 4838 |
| 8 | 1 | 69.8 | 88.9 | 26 / 35 | 4648 |
| 9 | 1 | 69.2 | 88.3 | 26 / 35 | 4047 |
| 10 | 1 | 69.5 | 86.3 | 23 / 35 | 4561 |
| 11 | 1 | 69.4 | 88.3 | 25 / 35 | 4206 |
| 12 | 1 | 68.4 | 82.5 | 23 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 146 | 93% |
| nz.jdc.nano.GridFu 1.0 | 73 | 84% |
| maribo.IotaCT 1.1 | 26 | 92% |
| timmit.nano.TimDog 0.33 | 24 | 92% |
| stelo.PatternRobot 1.0 | 23 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 100% |
| ratosh.Wesco 1.4 | 10 | 80% |
| spinnercat.Omen 1.0 | 8 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 34 | 27% | 95 |
| rz.HawkOnFire 0.1 | 28 | 22% | 133 |
| timmit.nano.TimDog 0.33 | 23 | 18% | 56 |
| maribo.IotaCT 1.1 | 13 | 10% | 49 |
| stelo.PatternRobot 1.0 | 12 | 10% | 31 |
| ratosh.Wesco 1.4 | 8 | 6% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 16 |
| spinnercat.Omen 1.0 | 1 | 1% | 8 |

## Melee bench: F10

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.6 | 330 / 420 | 1.85 | 20.7% | 71453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 20.7% | 330 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 37 |
| baal.nano.N 1.42 | 3.1 | 11.3% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 4 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 14 |
| sanja.First 0.1 | 6.8 | 8.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.1 | 8.0% | 4 |
| cvt.Firsty 1.0 | 7.5 | 7.8% | 16 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.3% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 97.1 | 31 / 35 | 6166 |
| 2 | 1 | 67.9 | 82.5 | 23 / 35 | 5616 |
| 3 | 1 | 70.3 | 89.2 | 26 / 35 | 6177 |
| 4 | 1 | 71.7 | 95.9 | 29 / 35 | 5770 |
| 5 | 1 | 70.8 | 91.4 | 28 / 35 | 5882 |
| 6 | 1 | 72.6 | 94.9 | 29 / 35 | 6770 |
| 7 | 1 | 70.0 | 87.9 | 26 / 35 | 5982 |
| 8 | 1 | 71.3 | 94.3 | 28 / 35 | 5874 |
| 9 | 1 | 71.1 | 92.7 | 31 / 35 | 5831 |
| 10 | 1 | 69.8 | 85.1 | 26 / 35 | 6035 |
| 11 | 1 | 67.8 | 81.9 | 23 / 35 | 5299 |
| 12 | 1 | 71.2 | 93.7 | 30 / 35 | 6051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 79 | 87% |
| cvt.Firsty 1.0 | 64 | 91% |
| baal.nano.N 1.42 | 59 | 100% |
| zyx.micro.Ant 1.1 | 37 | 89% |
| sanja.First 0.1 | 36 | 97% |
| Grystrion.TrackerWO 1.0 | 35 | 97% |
| amk.Punbot.Punbot 0.01 | 31 | 97% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 91 of 420 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 25 | 27% | 134 |
| zyx.micro.Ant 1.1 | 22 | 24% | 68 |
| Grystrion.TrackerWO 1.0 | 14 | 15% | 40 |
| cvt.Firsty 1.0 | 10 | 11% | 51 |
| sanja.First 0.1 | 6 | 7% | 36 |
| baal.nano.N 1.42 | 5 | 5% | 53 |
| amk.Punbot.Punbot 0.01 | 5 | 5% | 10 |
| sample.RamFire 1.0 | 4 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 15 |

## Melee bench: F11

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 64.3 | 107 / 420 | 4.22 | 13.8% | 52206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.6% | 186 |
| hadur117.micro.SaorG 0.1 | 2.2 | 13.8% | 107 |
| cs.Wren 1.0 | 3.4 | 12.3% | 30 |
| mz.Cork 0.1 | 4.2 | 11.6% | 33 |
| js.PinBall 1.6 | 4.3 | 11.4% | 31 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 10 |
| evd.X1 0.01 | 6.9 | 8.3% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 11 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 72.1 | 9 / 35 | 4468 |
| 2 | 2 | 59.6 | 62.5 | 6 / 35 | 4543 |
| 3 | 3 | 59.2 | 62.5 | 6 / 35 | 3974 |
| 4 | 2 | 61.6 | 65.1 | 14 / 35 | 4488 |
| 5 | 2 | 58.2 | 58.7 | 8 / 35 | 4419 |
| 6 | 2 | 62.1 | 71.1 | 12 / 35 | 4249 |
| 7 | 3 | 58.9 | 60.0 | 9 / 35 | 4195 |
| 8 | 2 | 60.6 | 68.9 | 8 / 35 | 4049 |
| 9 | 2 | 61.4 | 65.7 | 10 / 35 | 4490 |
| 10 | 2 | 61.8 | 65.4 | 10 / 35 | 4712 |
| 11 | 2 | 59.0 | 59.0 | 6 / 35 | 4495 |
| 12 | 3 | 59.0 | 60.0 | 9 / 35 | 4124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 113 | 36% |
| cs.Wren 1.0 | 38 | 89% |
| mz.Cork 0.1 | 17 | 71% |
| js.PinBall 1.6 | 10 | 60% |
| donjezza.Jezza 1.0 | 7 | 71% |
| joe.ADinosaur 1.0 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 313 of 420 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 142 | 45% | 188 |
| joe.ADinosaur 1.0 | 37 | 12% | 37 |
| js.PinBall 1.6 | 36 | 12% | 51 |
| mz.Cork 0.1 | 34 | 11% | 45 |
| evd.X1 0.01 | 23 | 7% | 26 |
| cs.Wren 1.0 | 21 | 7% | 46 |
| PSW.Relentless 0.1 | 9 | 3% | 10 |
| donjezza.Jezza 1.0 | 6 | 2% | 7 |
| jsal.Jsalbot 1.0 | 5 | 2% | 10 |

## Melee bench: F12

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.1 | 243 / 420 | 2.79 | 17.8% | 53124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 17.8% | 243 |
| ntc.Opposite 1.5 | 3.4 | 11.3% | 19 |
| myl.nano.Graviton 1.10 | 3.5 | 11.2% | 42 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.0% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 10 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 15 |
| DBall.NUKE 0.1 | 7.9 | 7.7% | 11 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 15 |
| pbg.R2D2 1.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 23 / 35 | 5002 |
| 2 | 1 | 66.5 | 77.8 | 22 / 35 | 4455 |
| 3 | 1 | 66.6 | 81.0 | 17 / 35 | 4545 |
| 4 | 1 | 67.9 | 85.4 | 25 / 35 | 4080 |
| 5 | 1 | 67.9 | 84.8 | 24 / 35 | 4491 |
| 6 | 1 | 69.2 | 88.9 | 24 / 35 | 4586 |
| 7 | 1 | 65.9 | 78.1 | 21 / 35 | 4172 |
| 8 | 1 | 65.0 | 76.5 | 16 / 35 | 4048 |
| 9 | 1 | 65.9 | 78.7 | 20 / 35 | 4225 |
| 10 | 1 | 67.6 | 83.8 | 18 / 35 | 4824 |
| 11 | 1 | 64.8 | 72.1 | 20 / 35 | 4419 |
| 12 | 1 | 62.1 | 67.3 | 13 / 35 | 4277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 73 | 79% |
| myl.nano.Graviton 1.10 | 59 | 85% |
| ntc.Opposite 1.5 | 38 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 28 | 93% |
| disan.Chair 2.2.0 | 27 | 89% |
| donjezza.Muncho 1.0 | 25 | 76% |
| DBall.NUKE 0.1 | 17 | 76% |
| pfvicm.Sobieski 7.2.3b | 16 | 100% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 182 of 420 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 19% | 85 |
| pfvicm.Sobieski 7.2.3b | 35 | 19% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 26 | 14% | 51 |
| ntc.Opposite 1.5 | 25 | 14% | 55 |
| myl.nano.Graviton 1.10 | 22 | 12% | 73 |
| disan.Chair 2.2.0 | 14 | 8% | 32 |
| DBall.NUKE 0.1 | 9 | 5% | 27 |
| pbg.R2D2 1.0 | 9 | 5% | 23 |
| donjezza.Muncho 1.0 | 7 | 4% | 21 |

## Melee bench: F13

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 67.6 | 133 / 420 | 3.92 | 14.4% | 45497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.9 | 14.3% | 109 |
| hadur117.micro.SaorG 0.1 | 2.2 | 14.4% | 133 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 46 |
| yagami.Tidus 0.11 | 4.6 | 11.8% | 19 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 18 |
| stelo.MirrorNano 1.3 | 7.3 | 8.0% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 62.5 | 9 / 35 | 3692 |
| 2 | 1 | 63.9 | 70.2 | 13 / 35 | 4316 |
| 3 | 1 | 65.0 | 76.5 | 14 / 35 | 4082 |
| 4 | 3 | 59.8 | 59.4 | 9 / 35 | 3835 |
| 5 | 3 | 59.9 | 62.5 | 7 / 35 | 3934 |
| 6 | 5 | 55.9 | 52.1 | 6 / 35 | 3279 |
| 7 | 1 | 63.9 | 70.8 | 15 / 35 | 3943 |
| 8 | 3 | 60.1 | 62.2 | 10 / 35 | 3616 |
| 9 | 3 | 60.3 | 68.3 | 6 / 35 | 3390 |
| 10 | 1 | 64.0 | 71.1 | 16 / 35 | 3790 |
| 11 | 1 | 66.1 | 81.3 | 14 / 35 | 3829 |
| 12 | 1 | 64.5 | 74.0 | 14 / 35 | 3791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 54% |
| kawigi.micro.Shiz 1.1 | 43 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 80% |
| yagami.Tidus 0.11 | 22 | 95% |
| ejb.Polaris 1.0.1 | 14 | 71% |
| step.nanoPri 1.0 | 2 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 288 of 420 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 116 | 40% | 154 |
| kawigi.micro.Shiz 1.1 | 43 | 15% | 70 |
| yagami.Tidus 0.11 | 36 | 13% | 55 |
| ejb.Polaris 1.0.1 | 33 | 11% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 10% | 60 |
| stelo.MirrorNano 1.3 | 12 | 4% | 12 |
| kurios.DOSexe .9a | 11 | 4% | 12 |
| step.nanoPri 1.0 | 7 | 2% | 9 |

## Melee bench: F14

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.4 | 212 / 420 | 3.21 | 16.2% | 48957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 16.2% | 212 |
| wee.Gem 1.8.4 | 3.0 | 12.2% | 74 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 46 |
| wompi.Quokka 1.6 | 3.9 | 11.5% | 43 |
| ratosh.Nobo 0.21 | 4.1 | 11.4% | 25 |
| m3thos.Eva00 1.1 | 6.3 | 9.7% | 13 |
| bayen.UbaMicro 1.4 | 6.5 | 9.4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.0 | 22 / 35 | 4038 |
| 2 | 1 | 63.9 | 72.7 | 20 / 35 | 3934 |
| 3 | 1 | 65.7 | 80.0 | 18 / 35 | 4334 |
| 4 | 1 | 60.8 | 66.7 | 17 / 35 | 3370 |
| 5 | 1 | 64.7 | 75.6 | 17 / 35 | 4166 |
| 6 | 1 | 64.1 | 76.2 | 17 / 35 | 3961 |
| 7 | 1 | 66.1 | 82.2 | 21 / 35 | 4035 |
| 8 | 1 | 64.6 | 76.5 | 17 / 35 | 4190 |
| 9 | 1 | 65.9 | 78.7 | 18 / 35 | 4524 |
| 10 | 1 | 63.5 | 74.0 | 14 / 35 | 4106 |
| 11 | 1 | 65.6 | 79.7 | 20 / 35 | 4147 |
| 12 | 1 | 60.1 | 62.9 | 11 / 35 | 4152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 75 | 87% |
| wee.Gem 1.8.4 | 68 | 81% |
| wompi.Quokka 1.6 | 40 | 73% |
| ratosh.Nobo 0.21 | 30 | 83% |
| m3thos.Eva00 1.1 | 17 | 94% |
| bayen.UbaMicro 1.4 | 14 | 86% |
| stelo.MyAgileRobot 0.2 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 209 of 420 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 36 | 17% | 60 |
| wee.Gem 1.8.4 | 33 | 16% | 94 |
| bzdp.Pansy 2.1 | 29 | 14% | 83 |
| jeremyreeder.Vincent 2011.12.09 | 25 | 12% | 32 |
| bayen.UbaMicro 1.4 | 22 | 11% | 40 |
| ratosh.Nobo 0.21 | 21 | 10% | 44 |
| maribo.FollowFire 1 | 20 | 10% | 20 |
| stelo.MyAgileRobot 0.2 | 12 | 6% | 15 |
| m3thos.Eva00 1.1 | 11 | 5% | 27 |

## Melee bench: F15

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 79.7 | 101 / 420 | 2.83 | 17.9% | 78438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 20.2% | 273 |
| hadur117.micro.SaorG 0.1 | 1.9 | 17.9% | 101 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 32 |
| ayk.WallHugger 1.0 | 4.4 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 4.9 | 9.2% | 9 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 81.3 | 9 / 35 | 6718 |
| 2 | 1 | 71.9 | 91.1 | 14 / 35 | 7626 |
| 3 | 2 | 67.7 | 78.7 | 6 / 35 | 6450 |
| 4 | 2 | 68.2 | 81.3 | 5 / 35 | 6293 |
| 5 | 2 | 66.0 | 74.6 | 8 / 35 | 5672 |
| 6 | 2 | 70.5 | 84.4 | 9 / 35 | 7053 |
| 7 | 2 | 68.2 | 79.4 | 11 / 35 | 6111 |
| 8 | 2 | 69.8 | 83.8 | 8 / 35 | 6935 |
| 9 | 2 | 67.5 | 73.7 | 9 / 35 | 6334 |
| 10 | 2 | 68.2 | 77.5 | 9 / 35 | 6878 |
| 11 | 2 | 66.3 | 73.3 | 6 / 35 | 5945 |
| 12 | 2 | 68.2 | 77.5 | 7 / 35 | 6423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 201 | 19% |
| mz.NanoGod 2.02 | 36 | 75% |
| exauge.GateKeeper 1.1.121g | 14 | 79% |
| ayk.WallHugger 1.0 | 10 | 100% |
| stuff.Vlad 0.1 | 6 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 320 of 420 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 221 | 69% | 263 |
| mz.NanoGod 2.02 | 51 | 16% | 90 |
| ayk.WallHugger 1.0 | 18 | 6% | 24 |
| exauge.GateKeeper 1.1.121g | 18 | 6% | 21 |
| drd.Dreadknoght 0.9 | 5 | 2% | 8 |
| stelo.PianistNano 1.2 | 5 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 8 |

## Melee bench: F16

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.7 | 225 / 420 | 3.46 | 16.5% | 55046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 16.5% | 225 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 42 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 35 |
| bvh.micro.Freya 0.3 | 3.9 | 11.1% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 44 |
| stelo.MirrorMicro 1.0 | 6.1 | 9.0% | 16 |
| conscience.Electron 1.3g | 7.1 | 8.3% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 7.2% | 5 |
| ap.Frederick 1.1 | 8.6 | 7.1% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 72.4 | 21 / 35 | 4735 |
| 2 | 1 | 65.8 | 79.0 | 22 / 35 | 4412 |
| 3 | 1 | 64.0 | 71.1 | 20 / 35 | 4501 |
| 4 | 1 | 66.9 | 81.0 | 20 / 35 | 4887 |
| 5 | 1 | 64.0 | 72.7 | 16 / 35 | 4378 |
| 6 | 1 | 66.6 | 76.8 | 23 / 35 | 4686 |
| 7 | 1 | 64.4 | 72.7 | 21 / 35 | 4241 |
| 8 | 1 | 62.9 | 67.0 | 16 / 35 | 4679 |
| 9 | 1 | 65.8 | 75.2 | 20 / 35 | 4875 |
| 10 | 1 | 63.1 | 68.3 | 12 / 35 | 4748 |
| 11 | 1 | 62.2 | 66.0 | 16 / 35 | 4195 |
| 12 | 1 | 63.9 | 70.2 | 18 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 74 | 91% |
| dummy.micro.Sparrow 2.5 | 61 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 42 | 88% |
| bvh.micro.Freya 0.3 | 36 | 89% |
| ap.Frederick 1.1 | 15 | 93% |
| stelo.MirrorMicro 1.0 | 14 | 93% |
| conscience.Electron 1.3g | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 196 of 420 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 38 | 19% | 47 |
| voidious.micro.BlitzBat 1.05 | 35 | 18% | 96 |
| mn.nano.perceptual.Impact 1.3.0 | 29 | 15% | 29 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 69 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 12% | 68 |
| bvh.micro.Freya 0.3 | 23 | 12% | 54 |
| dl.BetterWalls 1.0 | 15 | 8% | 31 |
| stelo.MirrorMicro 1.0 | 9 | 5% | 26 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.4 | 285 / 420 | 2.31 | 20.4% | 77442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.0 | 20.4% | 285 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.0% | 39 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 31 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.6% | 17 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.8% | 12 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 10 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.6 | 6.3% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.2% | 7 |
| sample.Corners 1.0 | 9.5 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 84.4 | 22 / 35 | 6503 |
| 2 | 1 | 70.4 | 87.6 | 25 / 35 | 6179 |
| 3 | 1 | 71.8 | 88.3 | 27 / 35 | 6982 |
| 4 | 1 | 68.8 | 83.5 | 18 / 35 | 6165 |
| 5 | 1 | 68.4 | 79.0 | 18 / 35 | 5970 |
| 6 | 1 | 70.5 | 80.6 | 26 / 35 | 7219 |
| 7 | 1 | 69.9 | 84.4 | 26 / 35 | 6444 |
| 8 | 1 | 71.2 | 89.5 | 25 / 35 | 6593 |
| 9 | 1 | 71.3 | 88.3 | 27 / 35 | 6350 |
| 10 | 1 | 69.0 | 81.0 | 22 / 35 | 5960 |
| 11 | 1 | 71.4 | 90.5 | 24 / 35 | 6418 |
| 12 | 1 | 71.4 | 88.3 | 25 / 35 | 6659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 115 | 90% |
| sul.Lunar 1.1 | 75 | 99% |
| supersample.SuperBoxBot 1.0 | 42 | 83% |
| mme.NikeEnhanced 2.0 | 22 | 86% |
| dsw.StaticD 1.0 | 21 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 19 | 84% |
| sample.MyFirstRobot 1.0 | 10 | 60% |
| tlp.ThreeLeggedPig 1 | 9 | 100% |
| sample.Corners 1.0 | 7 | 86% |

Hadur died in 138 of 420 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 34 | 25% | 129 |
| supersample.SuperBoxBot 1.0 | 31 | 22% | 60 |
| dsw.StaticD 1.0 | 30 | 22% | 52 |
| mme.NikeEnhanced 2.0 | 15 | 11% | 39 |
| sul.Lunar 1.1 | 8 | 6% | 81 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 5% | 22 |
| sample.Corners 1.0 | 6 | 4% | 12 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 17 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorG 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.9 | 183 / 420 | 3.25 | 16.7% | 65794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG 0.1 | 1.1 | 16.7% | 183 |
| radnor.DoctorBob 1.42 | 2.3 | 13.8% | 83 |
| mld.Wisdom 1.0 | 3.4 | 12.2% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.1 | 11.7% | 52 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.7% | 29 |
| amz.NanoClone 1.41 | 5.4 | 10.2% | 21 |
| sample.Walls 1.0 | 7.3 | 7.6% | 12 |
| GarmBox.Oranges 1.0 | 8.1 | 6.9% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.6 | 13 / 35 | 5323 |
| 2 | 1 | 64.2 | 74.6 | 15 / 35 | 4841 |
| 3 | 1 | 61.6 | 65.1 | 12 / 35 | 4677 |
| 4 | 2 | 62.4 | 65.4 | 12 / 35 | 5219 |
| 5 | 1 | 69.2 | 84.4 | 21 / 35 | 6670 |
| 6 | 1 | 64.5 | 73.7 | 13 / 35 | 5415 |
| 7 | 1 | 68.3 | 82.5 | 19 / 35 | 6154 |
| 8 | 1 | 63.9 | 71.7 | 12 / 35 | 5140 |
| 9 | 1 | 66.9 | 82.2 | 19 / 35 | 5334 |
| 10 | 1 | 66.0 | 74.0 | 15 / 35 | 6057 |
| 11 | 1 | 65.8 | 75.6 | 17 / 35 | 5607 |
| 12 | 1 | 65.3 | 75.6 | 15 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 77 | 88% |
| radnor.DoctorBob 1.42 | 47 | 51% |
| mld.Wisdom 1.0 | 41 | 80% |
| KiraNL.Chupacabra 0.4 | 20 | 65% |
| amz.NanoClone 1.41 | 18 | 78% |
| jangs.ns51 1.0 | 13 | 85% |
| sample.Walls 1.0 | 11 | 100% |
| sample.Target 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |

Hadur died in 238 of 420 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 74 | 31% | 108 |
| mld.Wisdom 1.0 | 54 | 23% | 90 |
| KiraNL.Chupacabra 0.4 | 38 | 16% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 13% | 103 |
| amz.NanoClone 1.41 | 19 | 8% | 26 |
| sample.Walls 1.0 | 10 | 4% | 20 |
| jangs.ns51 1.0 | 6 | 3% | 11 |
| GarmBox.Oranges 1.0 | 5 | 2% | 9 |

