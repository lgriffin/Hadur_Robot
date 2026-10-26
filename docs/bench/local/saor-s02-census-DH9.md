# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.5 | 296 / 420 | 2.13 | 21.0% | 83156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 21.0% | 296 |
| mz.AntiGrav 1.0 | 2.8 | 13.8% | 24 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 32 |
| mld.Infinity 2.2 | 3.2 | 13.2% | 47 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 15 |
| sample.Walls 1.0 | 6.9 | 6.7% | 3 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 3 |
| arthord.MannyPacquiao Beta | 8.8 | 4.7% | 0 |
| sample.Target 1.0 | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.1 | 24 / 35 | 6403 |
| 2 | 1 | 71.4 | 87.3 | 24 / 35 | 6504 |
| 3 | 1 | 71.8 | 87.6 | 28 / 35 | 7001 |
| 4 | 1 | 71.8 | 85.4 | 26 / 35 | 7067 |
| 5 | 1 | 72.0 | 88.3 | 26 / 35 | 7263 |
| 6 | 1 | 71.2 | 87.3 | 21 / 35 | 6680 |
| 7 | 1 | 71.2 | 84.4 | 27 / 35 | 6866 |
| 8 | 1 | 72.7 | 89.2 | 26 / 35 | 7411 |
| 9 | 1 | 71.7 | 86.0 | 22 / 35 | 7235 |
| 10 | 1 | 72.4 | 89.5 | 24 / 35 | 7163 |
| 11 | 1 | 72.2 | 90.8 | 25 / 35 | 6610 |
| 12 | 1 | 71.8 | 88.9 | 23 / 35 | 6953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 129 | 100% |
| mld.Infinity 2.2 | 100 | 86% |
| radnor.DoctorBob 1.42 | 64 | 77% |
| amz.NanoClone 1.41 | 18 | 67% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 36% | 146 |
| mld.Infinity 2.2 | 23 | 18% | 36 |
| amz.NanoClone 1.41 | 22 | 18% | 37 |
| mz.AntiGrav 1.0 | 17 | 14% | 129 |
| sample.Walls 1.0 | 5 | 4% | 28 |
| jangs.ns51 1.0 | 5 | 4% | 15 |
| GarmBox.Oranges 1.0 | 4 | 3% | 10 |
| arthord.MannyPacquiao Beta | 3 | 2% | 14 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.4 | 270 / 420 | 2.50 | 18.5% | 61551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.3 | 18.5% | 270 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.5% | 100 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 21 |
| maribo.melee.BMV 0.1 | 4.2 | 10.2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.6% | 4 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 8.1% | 10 |
| fullsail.SweetTea 1.1 | 7.3 | 7.7% | 8 |
| bzdp.BoxCar 2.0 | 8.6 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.8 | 23 / 35 | 5485 |
| 2 | 1 | 68.8 | 88.3 | 28 / 35 | 4740 |
| 3 | 1 | 70.2 | 91.7 | 26 / 35 | 5343 |
| 4 | 1 | 69.4 | 90.5 | 22 / 35 | 5432 |
| 5 | 1 | 70.2 | 91.4 | 26 / 35 | 5599 |
| 6 | 1 | 70.4 | 94.6 | 25 / 35 | 5291 |
| 7 | 1 | 67.9 | 83.8 | 22 / 35 | 5146 |
| 8 | 1 | 69.4 | 90.5 | 28 / 35 | 5210 |
| 9 | 1 | 69.0 | 88.9 | 26 / 35 | 5227 |
| 10 | 3 | 58.9 | 51.7 | 9 / 35 | 4624 |
| 11 | 1 | 69.8 | 92.7 | 27 / 35 | 5036 |
| 12 | 3 | 56.9 | 46.3 | 8 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 127 | 76% |
| mld.DustBunny 3.8 | 93 | 96% |
| maribo.melee.BMV 0.1 | 26 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 89% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| fullsail.SweetTea 1.1 | 14 | 100% |
| zyx.nano.Ant 1.1 | 11 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 151 of 420 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 44% | 168 |
| mld.DustBunny 3.8 | 25 | 17% | 98 |
| cs.Grudge 1.0 | 18 | 12% | 16 |
| zyx.nano.Ant 1.1 | 11 | 7% | 20 |
| maribo.melee.BMV 0.1 | 10 | 7% | 28 |
| djdjdj.NanoSkunk10 1.0 | 7 | 5% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 4% | 26 |
| fullsail.SweetTea 1.1 | 4 | 3% | 26 |
| bzdp.BoxCar 2.0 | 3 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.1 | 292 / 420 | 2.35 | 20.1% | 70952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 20.1% | 292 |
| myl.micro.Troodon 1.10 | 2.1 | 13.8% | 58 |
| myl.nano.KomoriNinja 1.1 | 3.6 | 11.4% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.2% | 32 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 19 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 6.9 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 3 |
| sample.Tracker 1.0 | 9.4 | 4.7% | 1 |
| sample.Fire 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 84.8 | 23 / 35 | 6094 |
| 2 | 1 | 70.3 | 85.1 | 24 / 35 | 6161 |
| 3 | 1 | 68.3 | 79.0 | 20 / 35 | 5908 |
| 4 | 1 | 68.6 | 80.6 | 23 / 35 | 5538 |
| 5 | 1 | 71.6 | 90.2 | 26 / 35 | 6310 |
| 6 | 1 | 69.0 | 81.9 | 24 / 35 | 5473 |
| 7 | 1 | 69.8 | 86.7 | 27 / 35 | 5548 |
| 8 | 1 | 69.8 | 85.1 | 23 / 35 | 5848 |
| 9 | 1 | 69.9 | 80.3 | 23 / 35 | 6075 |
| 10 | 1 | 70.3 | 85.7 | 25 / 35 | 6082 |
| 11 | 1 | 69.4 | 84.4 | 22 / 35 | 5641 |
| 12 | 1 | 73.4 | 96.8 | 32 / 35 | 6274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 109 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 77 | 90% |
| cb.nano.Insomnia 1.0 | 45 | 78% |
| myl.nano.KomoriNinja 1.1 | 42 | 95% |
| sp.Nanos.Ember 1.1 | 19 | 95% |
| fm.mammillarias 1.3 | 13 | 100% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 129 of 420 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 29 | 22% | 144 |
| stelo.SoRobotNanoMelee 1.2 | 27 | 21% | 85 |
| cb.nano.Insomnia 1.0 | 25 | 19% | 22 |
| fm.mammillarias 1.3 | 18 | 14% | 32 |
| myl.nano.KomoriNinja 1.1 | 13 | 10% | 74 |
| cs.sheldor.Talon 1.1 | 8 | 6% | 24 |
| sp.Nanos.Ember 1.1 | 7 | 5% | 27 |
| sample.Fire 1.0 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.2 | 311 / 420 | 1.98 | 20.9% | 76521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 20.9% | 311 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 28 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 30 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 16 |
| stelo.SoJNanoMelee 1.1 | 5.4 | 8.8% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 8.8% | 1 |
| yk.JahMicro 1.0 | 7.0 | 7.9% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 4 |
| sample.VelociRobot 1.0 | 9.9 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 86.0 | 25 / 35 | 6673 |
| 2 | 1 | 70.2 | 86.3 | 26 / 35 | 6081 |
| 3 | 1 | 70.9 | 88.9 | 25 / 35 | 6354 |
| 4 | 1 | 72.5 | 96.2 | 26 / 35 | 6790 |
| 5 | 1 | 71.1 | 89.8 | 28 / 35 | 6394 |
| 6 | 1 | 70.9 | 89.5 | 25 / 35 | 6292 |
| 7 | 1 | 72.9 | 94.6 | 31 / 35 | 7082 |
| 8 | 1 | 72.0 | 92.1 | 25 / 35 | 7211 |
| 9 | 1 | 71.1 | 90.2 | 28 / 35 | 6371 |
| 10 | 1 | 67.3 | 80.0 | 22 / 35 | 5170 |
| 11 | 1 | 68.9 | 83.5 | 23 / 35 | 5967 |
| 12 | 1 | 71.0 | 92.7 | 27 / 35 | 6136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 120 | 88% |
| stelo.SoJNanoMelee 1.1 | 82 | 96% |
| tj.zombie1n 1.0.1 | 43 | 84% |
| tvv.micro.Antares 1.1.1 | 40 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 95% |
| yk.JahMicro 1.0 | 21 | 90% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 67% |

Hadur died in 110 of 420 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 34% | 162 |
| tvv.micro.Antares 1.1.1 | 24 | 22% | 63 |
| tj.zombie1n 1.0.1 | 16 | 15% | 19 |
| stelo.SoJNanoMelee 1.1 | 15 | 14% | 61 |
| yk.JahMicro 1.0 | 6 | 5% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 5% | 43 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 5% | 19 |
| sample.VelociRobot 1.0 | 2 | 2% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 15 |

## Melee bench: F05

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.2 | 186 / 420 | 3.68 | 15.8% | 55220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.1 | 15.8% | 186 |
| oog.melee.Corsair 1.0 | 2.0 | 12.7% | 67 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 56 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.0% | 40 |
| EBBU.Sim2 1.02 | 5.1 | 10.2% | 22 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 21 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 12 |
| zyx.nano.BacillusComma 1.0 | 7.1 | 9.0% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.3% | 2 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 68.9 | 17 / 35 | 4651 |
| 2 | 1 | 62.8 | 68.3 | 15 / 35 | 4646 |
| 3 | 1 | 63.3 | 71.7 | 15 / 35 | 4581 |
| 4 | 1 | 63.1 | 67.9 | 14 / 35 | 4552 |
| 5 | 1 | 65.4 | 78.7 | 15 / 35 | 4937 |
| 6 | 1 | 65.1 | 74.0 | 19 / 35 | 4762 |
| 7 | 1 | 61.6 | 63.2 | 14 / 35 | 4448 |
| 8 | 1 | 62.8 | 69.2 | 13 / 35 | 4458 |
| 9 | 2 | 59.1 | 57.5 | 12 / 35 | 4270 |
| 10 | 1 | 63.4 | 69.8 | 17 / 35 | 4518 |
| 11 | 1 | 63.1 | 71.4 | 14 / 35 | 4443 |
| 12 | 1 | 67.0 | 81.6 | 21 / 35 | 4954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 68 | 88% |
| oog.melee.Corsair 1.0 | 59 | 63% |
| ahf.NanoAndrew .4 | 49 | 78% |
| sam.Samspin 1.0 | 24 | 88% |
| EBBU.Sim2 1.02 | 16 | 81% |
| robar.nano.Assertive_Melee 0.2 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| sample.TrackFire 1.0 | 4 | 100% |

Hadur died in 235 of 420 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 19% | 102 |
| oog.melee.Corsair 1.0 | 39 | 17% | 81 |
| ahf.NanoAndrew .4 | 37 | 16% | 77 |
| robar.nano.Assertive_Melee 0.2 | 31 | 13% | 41 |
| zyx.nano.BacillusComma 1.0 | 27 | 11% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 19 | 8% | 19 |
| EBBU.Sim2 1.02 | 18 | 8% | 31 |
| sam.Samspin 1.0 | 10 | 4% | 20 |
| sample.TrackFire 1.0 | 9 | 4% | 13 |

## Melee bench: F06

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.6 | 294 / 420 | 2.12 | 19.4% | 61708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 19.4% | 294 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.1% | 33 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.8% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.6% | 34 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.2% | 15 |
| fm.claire 1.7 | 6.3 | 8.4% | 3 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.2% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.4% | 5 |
| pa.Improved 1.0 | 9.3 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 23 / 35 | 5674 |
| 2 | 1 | 68.6 | 85.7 | 24 / 35 | 5092 |
| 3 | 1 | 70.1 | 93.0 | 25 / 35 | 5317 |
| 4 | 1 | 69.0 | 88.3 | 25 / 35 | 5056 |
| 5 | 1 | 69.3 | 89.5 | 25 / 35 | 5082 |
| 6 | 1 | 65.4 | 77.1 | 19 / 35 | 4603 |
| 7 | 1 | 68.7 | 87.0 | 27 / 35 | 5005 |
| 8 | 1 | 70.9 | 94.3 | 27 / 35 | 5543 |
| 9 | 1 | 66.5 | 81.9 | 24 / 35 | 4446 |
| 10 | 1 | 69.6 | 88.3 | 26 / 35 | 5373 |
| 11 | 1 | 70.3 | 92.1 | 27 / 35 | 5269 |
| 12 | 1 | 68.0 | 83.8 | 22 / 35 | 5248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 127 | 94% |
| oog.melee.CapuletDroid 1.1 | 74 | 84% |
| gh.nano.Grofvuil 0.2 | 32 | 81% |
| arthord.NanoSatanMelee Beta | 27 | 93% |
| sample.SpinBot 1.0 | 24 | 100% |
| winamp32.micro.MicroMacro 1.0 | 19 | 63% |
| kurios.DOSexe .9b | 12 | 92% |
| fm.claire 1.7 | 10 | 100% |
| pa.Improved 1.0 | 6 | 83% |

Hadur died in 128 of 420 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 28 | 22% | 79 |
| d414.nano.Quantum 1.0.0 | 26 | 20% | 144 |
| oog.melee.CapuletDroid 1.1 | 26 | 20% | 41 |
| winamp32.micro.MicroMacro 1.0 | 13 | 10% | 40 |
| arthord.NanoSatanMelee Beta | 11 | 9% | 38 |
| fm.claire 1.7 | 6 | 5% | 18 |
| sample.SpinBot 1.0 | 6 | 5% | 16 |
| pa.Improved 1.0 | 6 | 5% | 14 |
| kurios.DOSexe .9b | 5 | 4% | 28 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.0 | 195 / 420 | 2.53 | 18.3% | 66494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 18.3% | 195 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.3% | 100 |
| spinnercat.micro.Tyger 0.1 | 3.1 | 13.3% | 32 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 72 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 11 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 4 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 6.0% | 4 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.7 | 11 / 35 | 4870 |
| 2 | 1 | 67.9 | 82.2 | 17 / 35 | 5538 |
| 3 | 1 | 67.0 | 82.2 | 12 / 35 | 5374 |
| 4 | 1 | 66.0 | 79.4 | 12 / 35 | 5070 |
| 5 | 1 | 68.3 | 83.5 | 17 / 35 | 5643 |
| 6 | 1 | 67.0 | 81.9 | 12 / 35 | 5329 |
| 7 | 1 | 69.0 | 85.7 | 17 / 35 | 5828 |
| 8 | 1 | 68.4 | 81.6 | 19 / 35 | 5890 |
| 9 | 1 | 71.3 | 92.4 | 25 / 35 | 6144 |
| 10 | 1 | 68.7 | 83.8 | 21 / 35 | 5674 |
| 11 | 1 | 67.2 | 81.0 | 13 / 35 | 5539 |
| 12 | 1 | 68.1 | 82.5 | 19 / 35 | 5595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 88 | 51% |
| spinnercat.micro.Tyger 0.1 | 84 | 94% |
| gh.micro.Gruweltje 0.7 | 77 | 32% |
| DBall.Anarchy 0.1 | 30 | 100% |
| el.JumpShoot 0.2 | 9 | 89% |
| caimano.Furia_Ceca 0.22 | 6 | 67% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 226 of 420 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 79 | 35% | 119 |
| mz.MicroGodMelee 1 | 74 | 33% | 135 |
| spinnercat.micro.Tyger 0.1 | 35 | 15% | 89 |
| acogdev.alpha 0.2 | 9 | 4% | 12 |
| fire219.CatBot 1.0 | 9 | 4% | 9 |
| el.JumpShoot 0.2 | 7 | 3% | 12 |
| caimano.Furia_Ceca 0.22 | 6 | 3% | 8 |
| DBall.Anarchy 0.1 | 4 | 2% | 30 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 70.0 | 201 / 420 | 3.70 | 16.1% | 60815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.3 | 16.1% | 201 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 81 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.0% | 77 |
| germ.TheMind .2 | 4.7 | 9.7% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.4 | 9.3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.4% | 3 |
| awesomeness.Elite 1.0 | 6.4 | 8.5% | 15 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 11 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 71.4 | 19 / 35 | 5091 |
| 2 | 2 | 63.5 | 67.3 | 16 / 35 | 4860 |
| 3 | 2 | 61.0 | 60.6 | 16 / 35 | 4522 |
| 4 | 2 | 63.3 | 66.0 | 14 / 35 | 4942 |
| 5 | 1 | 66.0 | 74.6 | 21 / 35 | 5171 |
| 6 | 1 | 66.0 | 75.9 | 19 / 35 | 5247 |
| 7 | 1 | 63.5 | 67.3 | 16 / 35 | 4918 |
| 8 | 1 | 65.2 | 72.1 | 12 / 35 | 5589 |
| 9 | 2 | 61.7 | 62.5 | 14 / 35 | 4625 |
| 10 | 1 | 66.2 | 74.0 | 19 / 35 | 5791 |
| 11 | 1 | 66.4 | 78.1 | 16 / 35 | 5187 |
| 12 | 1 | 63.9 | 70.5 | 19 / 35 | 4872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 149 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 67% |
| qualidafial.MajorDick 1.0.1 | 13 | 100% |
| germ.TheMind .2 | 13 | 85% |
| stelo.UntouchableNano 1.3 | 9 | 89% |
| awesomeness.Elite 1.0 | 6 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |

Hadur died in 219 of 420 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 88 | 40% | 190 |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 18% | 71 |
| germ.TheMind .2 | 22 | 10% | 42 |
| qualidafial.MajorDick 1.0.1 | 18 | 8% | 25 |
| lrem.micro.MoggFanatic 0.2 | 16 | 7% | 21 |
| stelo.UntouchableNano 1.3 | 13 | 6% | 28 |
| awesomeness.Elite 1.0 | 13 | 6% | 22 |
| mym.EdgeStalker 1.0 | 7 | 3% | 12 |
| sample.Crazy 1.0 | 2 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.9 | 299 / 420 | 2.09 | 19.8% | 59184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 19.8% | 299 |
| rz.HawkOnFire 0.1 | 2.2 | 13.2% | 29 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 26 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 26 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.8% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.8% | 12 |
| spinnercat.Omen 1.0 | 8.3 | 7.6% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.6 | 23 / 35 | 4925 |
| 2 | 1 | 70.9 | 90.5 | 24 / 35 | 5437 |
| 3 | 1 | 71.4 | 92.1 | 29 / 35 | 5095 |
| 4 | 1 | 69.5 | 86.3 | 25 / 35 | 4565 |
| 5 | 1 | 70.5 | 87.3 | 26 / 35 | 5043 |
| 6 | 1 | 71.0 | 90.8 | 27 / 35 | 4998 |
| 7 | 1 | 67.0 | 77.8 | 21 / 35 | 4458 |
| 8 | 1 | 68.4 | 83.2 | 22 / 35 | 4681 |
| 9 | 1 | 71.4 | 92.1 | 27 / 35 | 5014 |
| 10 | 1 | 69.8 | 89.5 | 25 / 35 | 4517 |
| 11 | 1 | 69.5 | 84.8 | 24 / 35 | 5249 |
| 12 | 1 | 71.1 | 92.4 | 26 / 35 | 5202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 132 | 92% |
| nz.jdc.nano.GridFu 1.0 | 83 | 93% |
| timmit.nano.TimDog 0.33 | 34 | 76% |
| maribo.IotaCT 1.1 | 25 | 64% |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 100% |
| stelo.PatternRobot 1.0 | 16 | 94% |
| ratosh.Wesco 1.4 | 16 | 94% |
| spinnercat.Omen 1.0 | 9 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 29 | 24% | 55 |
| rz.HawkOnFire 0.1 | 24 | 20% | 109 |
| maribo.IotaCT 1.1 | 21 | 17% | 51 |
| nz.jdc.nano.GridFu 1.0 | 16 | 13% | 103 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 9% | 23 |
| ratosh.Wesco 1.4 | 10 | 8% | 34 |
| stelo.PatternRobot 1.0 | 10 | 8% | 29 |
| spinnercat.Omen 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.2 | 350 / 420 | 1.88 | 21.1% | 74775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 21.1% | 350 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 33 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 14 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.5% | 0 |
| zyx.micro.Ant 1.1 | 5.5 | 9.1% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.4% | 1 |
| sanja.First 0.1 | 6.7 | 8.3% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 8 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 28 / 35 | 6049 |
| 2 | 1 | 69.1 | 81.6 | 25 / 35 | 6090 |
| 3 | 1 | 71.9 | 94.0 | 31 / 35 | 6335 |
| 4 | 1 | 69.7 | 87.9 | 26 / 35 | 5750 |
| 5 | 1 | 70.6 | 86.7 | 27 / 35 | 6614 |
| 6 | 1 | 71.9 | 93.0 | 32 / 35 | 6159 |
| 7 | 1 | 70.4 | 88.9 | 30 / 35 | 6231 |
| 8 | 1 | 70.1 | 86.3 | 28 / 35 | 6031 |
| 9 | 1 | 72.4 | 94.3 | 33 / 35 | 6393 |
| 10 | 1 | 69.8 | 86.7 | 27 / 35 | 5939 |
| 11 | 1 | 72.1 | 96.2 | 32 / 35 | 6314 |
| 12 | 1 | 72.8 | 96.2 | 31 / 35 | 6870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 74 | 99% |
| tvv.nano.Polaris 1.2 | 71 | 96% |
| cvt.Firsty 1.0 | 59 | 95% |
| zyx.micro.Ant 1.1 | 43 | 98% |
| sanja.First 0.1 | 37 | 97% |
| amk.Punbot.Punbot 0.01 | 36 | 97% |
| Grystrion.TrackerWO 1.0 | 30 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 72 of 420 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 21% | 77 |
| sample.RamFire 1.0 | 12 | 17% | 13 |
| tvv.nano.Polaris 1.2 | 11 | 15% | 128 |
| Grystrion.TrackerWO 1.0 | 9 | 13% | 35 |
| sanja.First 0.1 | 6 | 8% | 40 |
| cvt.Firsty 1.0 | 6 | 8% | 38 |
| baal.nano.N 1.42 | 5 | 7% | 50 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 24 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.4 | 138 / 420 | 3.94 | 14.9% | 58457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.6% | 155 |
| hadur117.micro.SaorDH9 0.1 | 1.6 | 14.9% | 138 |
| cs.Wren 1.0 | 3.3 | 12.5% | 36 |
| js.PinBall 1.6 | 4.0 | 11.7% | 39 |
| mz.Cork 0.1 | 4.8 | 10.8% | 23 |
| joe.ADinosaur 1.0 | 5.9 | 9.6% | 13 |
| evd.X1 0.01 | 7.0 | 8.1% | 5 |
| jsal.Jsalbot 1.0 | 7.9 | 6.6% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.2% | 7 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 77.8 | 13 / 35 | 5323 |
| 2 | 1 | 64.7 | 75.2 | 13 / 35 | 5029 |
| 3 | 2 | 62.4 | 67.3 | 8 / 35 | 4843 |
| 4 | 2 | 61.3 | 63.2 | 12 / 35 | 4631 |
| 5 | 1 | 63.0 | 66.7 | 12 / 35 | 5053 |
| 6 | 2 | 60.7 | 63.2 | 8 / 35 | 4793 |
| 7 | 2 | 60.5 | 59.4 | 11 / 35 | 4833 |
| 8 | 1 | 65.8 | 77.8 | 16 / 35 | 4906 |
| 9 | 3 | 58.5 | 58.7 | 6 / 35 | 4496 |
| 10 | 1 | 62.7 | 67.0 | 15 / 35 | 5017 |
| 11 | 1 | 64.3 | 74.6 | 15 / 35 | 4952 |
| 12 | 2 | 58.9 | 57.8 | 9 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 136 | 54% |
| cs.Wren 1.0 | 34 | 85% |
| js.PinBall 1.6 | 18 | 61% |
| mz.Cork 0.1 | 16 | 88% |
| joe.ADinosaur 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 284 of 420 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 121 | 43% | 199 |
| joe.ADinosaur 1.0 | 39 | 14% | 43 |
| cs.Wren 1.0 | 31 | 11% | 53 |
| evd.X1 0.01 | 28 | 10% | 29 |
| js.PinBall 1.6 | 26 | 9% | 40 |
| mz.Cork 0.1 | 14 | 5% | 26 |
| PSW.Relentless 0.1 | 14 | 5% | 14 |
| jsal.Jsalbot 1.0 | 5 | 2% | 10 |
| donjezza.Jezza 1.0 | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.9 | 266 / 420 | 2.54 | 18.7% | 57895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 18.7% | 266 |
| ntc.Opposite 1.5 | 3.2 | 11.2% | 15 |
| myl.nano.Graviton 1.10 | 3.6 | 11.1% | 45 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 10.5% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.4 | 10.0% | 16 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 12 |
| DBall.NUKE 0.1 | 7.4 | 8.1% | 13 |
| donjezza.Muncho 1.0 | 9.1 | 6.3% | 19 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 25 / 35 | 4676 |
| 2 | 1 | 67.8 | 83.8 | 21 / 35 | 4799 |
| 3 | 1 | 69.8 | 90.5 | 28 / 35 | 4684 |
| 4 | 1 | 69.3 | 87.6 | 24 / 35 | 5051 |
| 5 | 1 | 66.6 | 83.5 | 20 / 35 | 4163 |
| 6 | 1 | 68.8 | 83.5 | 22 / 35 | 5369 |
| 7 | 1 | 67.5 | 81.0 | 22 / 35 | 4773 |
| 8 | 1 | 66.7 | 79.7 | 18 / 35 | 4791 |
| 9 | 1 | 66.6 | 78.1 | 21 / 35 | 4829 |
| 10 | 1 | 67.4 | 83.5 | 20 / 35 | 4623 |
| 11 | 1 | 68.5 | 83.8 | 24 / 35 | 4992 |
| 12 | 1 | 66.5 | 75.6 | 21 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 76 | 88% |
| myl.nano.Graviton 1.10 | 62 | 89% |
| ntc.Opposite 1.5 | 35 | 94% |
| disan.Chair 2.2.0 | 35 | 77% |
| DBall.NUKE 0.1 | 27 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 96% |
| donjezza.Muncho 1.0 | 21 | 81% |
| pfvicm.Sobieski 7.2.3b | 15 | 93% |
| pbg.R2D2 1.0 | 6 | 83% |

Hadur died in 157 of 420 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 23% | 80 |
| pfvicm.Sobieski 7.2.3b | 28 | 18% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 24 | 15% | 60 |
| myl.nano.Graviton 1.10 | 22 | 14% | 76 |
| ntc.Opposite 1.5 | 17 | 11% | 43 |
| disan.Chair 2.2.0 | 11 | 7% | 38 |
| donjezza.Muncho 1.0 | 9 | 6% | 23 |
| DBall.NUKE 0.1 | 7 | 4% | 37 |
| pbg.R2D2 1.0 | 3 | 2% | 15 |

## Melee bench: F13

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.5 | 176 / 420 | 3.39 | 15.7% | 48959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.2 | 15.7% | 176 |
| oog.melee.Capulet 1.2 | 2.3 | 14.3% | 99 |
| kawigi.micro.Shiz 1.1 | 3.1 | 13.4% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.4% | 44 |
| yagami.Tidus 0.11 | 4.6 | 12.1% | 14 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 26 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 79.4 | 20 / 35 | 4592 |
| 2 | 2 | 61.9 | 65.7 | 9 / 35 | 3891 |
| 3 | 1 | 64.5 | 73.3 | 14 / 35 | 4202 |
| 4 | 2 | 62.7 | 68.3 | 13 / 35 | 4038 |
| 5 | 1 | 64.6 | 72.4 | 15 / 35 | 4130 |
| 6 | 1 | 64.1 | 72.7 | 11 / 35 | 4072 |
| 7 | 1 | 65.0 | 74.6 | 18 / 35 | 4158 |
| 8 | 1 | 64.1 | 74.3 | 14 / 35 | 3859 |
| 9 | 1 | 65.2 | 77.1 | 16 / 35 | 3953 |
| 10 | 1 | 64.8 | 75.9 | 12 / 35 | 3884 |
| 11 | 1 | 62.5 | 66.7 | 16 / 35 | 3911 |
| 12 | 1 | 66.9 | 81.3 | 18 / 35 | 4269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 83 | 55% |
| kawigi.micro.Shiz 1.1 | 49 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 82% |
| yagami.Tidus 0.11 | 37 | 95% |
| ejb.Polaris 1.0.1 | 14 | 64% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 247 of 420 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 111 | 45% | 155 |
| yagami.Tidus 0.11 | 32 | 13% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 12% | 70 |
| kawigi.micro.Shiz 1.1 | 21 | 9% | 53 |
| ejb.Polaris 1.0.1 | 21 | 9% | 39 |
| step.nanoPri 1.0 | 12 | 5% | 13 |
| stelo.MirrorNano 1.3 | 12 | 5% | 12 |
| kurios.DOSexe .9a | 9 | 4% | 8 |

## Melee bench: F14

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.7 | 256 / 420 | 2.83 | 17.4% | 52617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 17.4% | 256 |
| bzdp.Pansy 2.1 | 3.1 | 12.1% | 38 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 53 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 30 |
| ratosh.Nobo 0.21 | 4.0 | 11.4% | 17 |
| m3thos.Eva00 1.1 | 5.6 | 9.7% | 18 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 7.9 | 7.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.8% | 3 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 26 / 35 | 4926 |
| 2 | 1 | 62.5 | 68.9 | 16 / 35 | 3898 |
| 3 | 1 | 67.3 | 82.2 | 22 / 35 | 4579 |
| 4 | 1 | 66.5 | 84.1 | 23 / 35 | 4114 |
| 5 | 1 | 66.3 | 80.3 | 19 / 35 | 4599 |
| 6 | 1 | 65.3 | 75.2 | 21 / 35 | 4410 |
| 7 | 1 | 65.6 | 77.8 | 23 / 35 | 4106 |
| 8 | 1 | 63.6 | 71.1 | 16 / 35 | 4166 |
| 9 | 1 | 65.6 | 79.0 | 20 / 35 | 4417 |
| 10 | 1 | 67.5 | 84.8 | 24 / 35 | 4563 |
| 11 | 1 | 68.2 | 87.6 | 26 / 35 | 4376 |
| 12 | 1 | 65.6 | 75.9 | 20 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 90 | 92% |
| wee.Gem 1.8.4 | 71 | 86% |
| wompi.Quokka 1.6 | 43 | 86% |
| ratosh.Nobo 0.21 | 35 | 91% |
| m3thos.Eva00 1.1 | 20 | 95% |
| bayen.UbaMicro 1.4 | 18 | 94% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 165 of 420 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 28 | 17% | 93 |
| wompi.Quokka 1.6 | 25 | 15% | 60 |
| ratosh.Nobo 0.21 | 22 | 13% | 58 |
| bzdp.Pansy 2.1 | 21 | 13% | 87 |
| stelo.MyAgileRobot 0.2 | 19 | 12% | 23 |
| maribo.FollowFire 1 | 16 | 10% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 14 | 8% | 23 |
| bayen.UbaMicro 1.4 | 12 | 7% | 23 |
| m3thos.Eva00 1.1 | 8 | 5% | 29 |

## Melee bench: F15

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 85.8 | 165 / 420 | 2.28 | 19.9% | 88004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.2 | 19.9% | 165 |
| wompi.Wallaby 5.1 | 1.8 | 19.3% | 227 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 21 |
| ayk.WallHugger 1.0 | 4.3 | 10.0% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 3 |
| stuff.Vlad 0.1 | 5.9 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 86.3 | 12 / 35 | 7245 |
| 2 | 1 | 71.0 | 86.7 | 14 / 35 | 7366 |
| 3 | 1 | 72.6 | 92.4 | 15 / 35 | 7587 |
| 4 | 1 | 71.1 | 84.8 | 11 / 35 | 7988 |
| 5 | 1 | 69.4 | 81.0 | 14 / 35 | 6695 |
| 6 | 2 | 70.4 | 82.9 | 16 / 35 | 7043 |
| 7 | 1 | 70.2 | 83.2 | 16 / 35 | 6827 |
| 8 | 2 | 71.8 | 88.3 | 11 / 35 | 7904 |
| 9 | 1 | 71.0 | 83.2 | 14 / 35 | 7534 |
| 10 | 1 | 70.3 | 84.1 | 13 / 35 | 7024 |
| 11 | 1 | 72.1 | 89.8 | 15 / 35 | 7789 |
| 12 | 1 | 70.8 | 87.0 | 14 / 35 | 7002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 235 | 38% |
| mz.NanoGod 2.02 | 36 | 81% |
| exauge.GateKeeper 1.1.121g | 19 | 95% |
| ayk.WallHugger 1.0 | 13 | 92% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 257 of 420 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 192 | 75% | 289 |
| mz.NanoGod 2.02 | 27 | 11% | 63 |
| ayk.WallHugger 1.0 | 15 | 6% | 25 |
| exauge.GateKeeper 1.1.121g | 15 | 6% | 18 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
| stuff.Vlad 0.1 | 3 | 1% | 8 |
| drd.Dreadknoght 0.9 | 1 | 0% | 11 |

## Melee bench: F16

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.3 | 241 / 420 | 3.23 | 17.1% | 56744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 17.1% | 241 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 41 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 38 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.6 | 10.8% | 31 |
| stelo.MirrorMicro 1.0 | 6.1 | 9.4% | 12 |
| conscience.Electron 1.3g | 6.8 | 8.1% | 4 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 16 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 68.9 | 16 / 35 | 4186 |
| 2 | 1 | 65.1 | 74.3 | 19 / 35 | 4576 |
| 3 | 1 | 66.1 | 77.8 | 22 / 35 | 4755 |
| 4 | 1 | 60.7 | 58.4 | 15 / 35 | 4571 |
| 5 | 1 | 65.8 | 76.2 | 21 / 35 | 4743 |
| 6 | 1 | 65.0 | 72.1 | 18 / 35 | 4933 |
| 7 | 1 | 68.7 | 86.0 | 26 / 35 | 5113 |
| 8 | 1 | 65.3 | 74.3 | 17 / 35 | 4691 |
| 9 | 1 | 67.0 | 80.6 | 23 / 35 | 4819 |
| 10 | 1 | 65.0 | 70.5 | 18 / 35 | 4925 |
| 11 | 1 | 66.5 | 78.7 | 22 / 35 | 4695 |
| 12 | 1 | 67.9 | 85.4 | 24 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 86 | 97% |
| dummy.micro.Sparrow 2.5 | 54 | 81% |
| bvh.micro.Freya 0.3 | 50 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 44 | 86% |
| stelo.MirrorMicro 1.0 | 16 | 88% |
| ap.Frederick 1.1 | 14 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 179 of 420 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 35 | 20% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 29 | 16% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 15% | 76 |
| voidious.micro.BlitzBat 1.05 | 25 | 14% | 95 |
| dummy.micro.Sparrow 2.5 | 24 | 13% | 74 |
| bvh.micro.Freya 0.3 | 20 | 11% | 55 |
| dl.BetterWalls 1.0 | 12 | 7% | 19 |
| stelo.MirrorMicro 1.0 | 8 | 4% | 29 |

## Melee bench: F17

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 87.7 | 309 / 420 | 2.10 | 20.9% | 79910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 20.9% | 309 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 38 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 21 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 19 |
| dsw.StaticD 1.0 | 5.4 | 9.0% | 17 |
| mme.NikeEnhanced 2.0 | 5.4 | 9.2% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.3% | 6 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.7% | 4 |
| sample.Corners 1.0 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.2 | 21 / 35 | 6083 |
| 2 | 1 | 70.9 | 89.2 | 27 / 35 | 6411 |
| 3 | 1 | 69.4 | 82.9 | 25 / 35 | 6434 |
| 4 | 1 | 71.5 | 89.8 | 27 / 35 | 6462 |
| 5 | 1 | 70.7 | 83.2 | 26 / 35 | 6821 |
| 6 | 1 | 69.5 | 78.7 | 20 / 35 | 6848 |
| 7 | 1 | 70.4 | 89.8 | 24 / 35 | 6029 |
| 8 | 1 | 70.3 | 85.7 | 25 / 35 | 6460 |
| 9 | 1 | 72.7 | 90.5 | 27 / 35 | 7312 |
| 10 | 1 | 71.6 | 87.3 | 26 / 35 | 7218 |
| 11 | 1 | 72.8 | 95.9 | 30 / 35 | 6738 |
| 12 | 1 | 73.3 | 96.5 | 31 / 35 | 7094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 116 | 90% |
| sul.Lunar 1.1 | 88 | 99% |
| supersample.SuperBoxBot 1.0 | 53 | 91% |
| dsw.StaticD 1.0 | 24 | 63% |
| mme.NikeEnhanced 2.0 | 18 | 94% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 11 | 91% |
| tlp.ThreeLeggedPig 1 | 10 | 90% |
| sample.Corners 1.0 | 6 | 100% |

Hadur died in 117 of 420 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 37 | 32% | 132 |
| dsw.StaticD 1.0 | 24 | 21% | 58 |
| supersample.SuperBoxBot 1.0 | 21 | 18% | 60 |
| mme.NikeEnhanced 2.0 | 9 | 8% | 23 |
| tlp.ThreeLeggedPig 1 | 7 | 6% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 4% | 19 |
| sul.Lunar 1.1 | 4 | 3% | 96 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 10 |
| sample.Corners 1.0 | 2 | 2% | 8 |
5 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDH9 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 77.7 | 229 / 420 | 3.01 | 17.9% | 71904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDH9 0.1 | 1.0 | 17.9% | 229 |
| radnor.DoctorBob 1.42 | 2.6 | 12.7% | 62 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.6 | 11.8% | 38 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 16 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 20 |
| sample.Walls 1.0 | 7.0 | 8.1% | 12 |
| GarmBox.Oranges 1.0 | 8.1 | 7.3% | 3 |
| jangs.ns51 1.0 | 8.6 | 6.6% | 9 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.4 | 18 / 35 | 5890 |
| 2 | 1 | 71.5 | 87.6 | 26 / 35 | 7376 |
| 3 | 1 | 68.7 | 84.8 | 23 / 35 | 5978 |
| 4 | 1 | 65.3 | 71.4 | 16 / 35 | 5689 |
| 5 | 1 | 62.9 | 65.7 | 15 / 35 | 5433 |
| 6 | 1 | 68.4 | 83.8 | 20 / 35 | 5879 |
| 7 | 1 | 67.7 | 77.8 | 19 / 35 | 6539 |
| 8 | 1 | 65.3 | 74.6 | 17 / 35 | 5468 |
| 9 | 1 | 68.6 | 84.1 | 18 / 35 | 6230 |
| 10 | 1 | 65.2 | 71.7 | 18 / 35 | 5852 |
| 11 | 1 | 67.7 | 80.0 | 20 / 35 | 5987 |
| 12 | 1 | 65.5 | 72.4 | 19 / 35 | 5583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 94 | 98% |
| radnor.DoctorBob 1.42 | 61 | 64% |
| mld.Wisdom 1.0 | 32 | 78% |
| jangs.ns51 1.0 | 21 | 86% |
| amz.NanoClone 1.41 | 19 | 84% |
| KiraNL.Chupacabra 0.4 | 18 | 89% |
| sample.Walls 1.0 | 16 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 194 of 420 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 26% | 98 |
| mld.Wisdom 1.0 | 41 | 21% | 69 |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 16% | 123 |
| KiraNL.Chupacabra 0.4 | 25 | 13% | 42 |
| amz.NanoClone 1.41 | 25 | 13% | 34 |
| jangs.ns51 1.0 | 10 | 5% | 24 |
| sample.Walls 1.0 | 8 | 4% | 23 |
| GarmBox.Oranges 1.0 | 4 | 2% | 7 |

