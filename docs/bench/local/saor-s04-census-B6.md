# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.3 | 315 / 420 | 1.96 | 21.6% | 86620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 21.6% | 315 |
| mz.AntiGrav 1.0 | 2.8 | 13.5% | 23 |
| radnor.DoctorBob 1.42 | 2.8 | 13.6% | 35 |
| mld.Infinity 2.2 | 3.4 | 12.8% | 33 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 9 |
| sample.Walls 1.0 | 6.3 | 7.3% | 2 |
| GarmBox.Oranges 1.0 | 7.1 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.3% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 89.8 | 27 / 35 | 6868 |
| 2 | 1 | 73.5 | 93.3 | 31 / 35 | 7360 |
| 3 | 1 | 72.6 | 91.1 | 29 / 35 | 7297 |
| 4 | 1 | 73.4 | 91.4 | 27 / 35 | 7720 |
| 5 | 1 | 73.3 | 92.7 | 27 / 35 | 7745 |
| 6 | 1 | 71.4 | 87.0 | 27 / 35 | 6487 |
| 7 | 1 | 73.4 | 93.7 | 28 / 35 | 7364 |
| 8 | 1 | 72.8 | 89.5 | 26 / 35 | 7446 |
| 9 | 1 | 70.6 | 85.1 | 21 / 35 | 6716 |
| 10 | 1 | 70.8 | 83.2 | 23 / 35 | 6927 |
| 11 | 1 | 70.6 | 83.5 | 23 / 35 | 6704 |
| 12 | 1 | 73.6 | 91.1 | 26 / 35 | 7986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 136 | 98% |
| mld.Infinity 2.2 | 96 | 90% |
| radnor.DoctorBob 1.42 | 66 | 86% |
| amz.NanoClone 1.41 | 14 | 79% |
| sample.Target 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 107 of 420 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 36% | 135 |
| mz.AntiGrav 1.0 | 21 | 20% | 160 |
| amz.NanoClone 1.41 | 16 | 15% | 33 |
| mld.Infinity 2.2 | 15 | 14% | 27 |
| GarmBox.Oranges 1.0 | 8 | 7% | 17 |
| sample.Walls 1.0 | 4 | 4% | 19 |
| jangs.ns51 1.0 | 2 | 2% | 14 |
| arthord.MannyPacquiao Beta | 2 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.6 | 267 / 420 | 2.39 | 18.6% | 60998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.2 | 18.6% | 267 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.5% | 91 |
| mld.DustBunny 3.8 | 2.8 | 13.4% | 25 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.1% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.8% | 14 |
| zyx.nano.Ant 1.1 | 7.4 | 7.5% | 2 |
| fullsail.SweetTea 1.1 | 7.9 | 6.9% | 7 |
| bzdp.BoxCar 2.0 | 8.2 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 96.5 | 30 / 35 | 5241 |
| 2 | 1 | 70.0 | 92.4 | 25 / 35 | 5114 |
| 3 | 1 | 70.2 | 93.3 | 25 / 35 | 5570 |
| 4 | 1 | 67.9 | 88.9 | 21 / 35 | 4515 |
| 5 | 3 | 61.8 | 58.1 | 10 / 35 | 5021 |
| 6 | 1 | 67.0 | 81.9 | 20 / 35 | 4799 |
| 7 | 1 | 69.0 | 89.5 | 23 / 35 | 5136 |
| 8 | 1 | 67.3 | 81.9 | 22 / 35 | 4787 |
| 9 | 1 | 69.3 | 89.8 | 26 / 35 | 5136 |
| 10 | 1 | 66.5 | 68.9 | 16 / 35 | 5655 |
| 11 | 1 | 69.5 | 89.5 | 25 / 35 | 5276 |
| 12 | 1 | 67.8 | 83.8 | 24 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 148 | 75% |
| mld.DustBunny 3.8 | 104 | 95% |
| djdjdj.NanoSkunk10 1.0 | 18 | 83% |
| maribo.melee.BMV 0.1 | 17 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 87% |
| zyx.nano.Ant 1.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 154 of 420 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 39% | 169 |
| mld.DustBunny 3.8 | 29 | 19% | 105 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 10% | 28 |
| zyx.nano.Ant 1.1 | 12 | 8% | 20 |
| djdjdj.NanoSkunk10 1.0 | 11 | 7% | 42 |
| cs.Grudge 1.0 | 9 | 6% | 8 |
| fullsail.SweetTea 1.1 | 7 | 5% | 14 |
| maribo.melee.BMV 0.1 | 6 | 4% | 23 |
| bzdp.BoxCar 2.0 | 5 | 3% | 8 |

## Melee bench: F03

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.6 | 292 / 420 | 2.20 | 20.5% | 74495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 20.5% | 292 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 50 |
| myl.nano.KomoriNinja 1.1 | 3.6 | 11.3% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.1 | 10.7% | 31 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.7% | 21 |
| fm.mammillarias 1.3 | 5.3 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.9 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 5 |
| sample.Fire 1.0 | 9.2 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.4 | 26 / 35 | 5573 |
| 2 | 1 | 71.4 | 87.6 | 27 / 35 | 6367 |
| 3 | 1 | 70.3 | 86.3 | 25 / 35 | 5910 |
| 4 | 1 | 70.9 | 87.0 | 23 / 35 | 6198 |
| 5 | 1 | 69.6 | 82.9 | 20 / 35 | 6183 |
| 6 | 1 | 70.7 | 85.4 | 22 / 35 | 6565 |
| 7 | 1 | 71.8 | 90.2 | 26 / 35 | 6775 |
| 8 | 1 | 72.1 | 92.1 | 26 / 35 | 6550 |
| 9 | 1 | 69.3 | 81.0 | 23 / 35 | 6085 |
| 10 | 1 | 70.7 | 89.5 | 25 / 35 | 5949 |
| 11 | 1 | 69.5 | 83.5 | 21 / 35 | 5717 |
| 12 | 1 | 72.0 | 89.8 | 28 / 35 | 6623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 100 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 70 | 89% |
| cb.nano.Insomnia 1.0 | 50 | 92% |
| myl.nano.KomoriNinja 1.1 | 41 | 93% |
| sp.Nanos.Ember 1.1 | 28 | 93% |
| fm.mammillarias 1.3 | 19 | 95% |
| sample.Fire 1.0 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 129 of 420 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 33 | 26% | 77 |
| myl.micro.Troodon 1.10 | 22 | 17% | 123 |
| myl.nano.KomoriNinja 1.1 | 22 | 17% | 80 |
| cb.nano.Insomnia 1.0 | 18 | 14% | 21 |
| fm.mammillarias 1.3 | 12 | 9% | 32 |
| cs.sheldor.Talon 1.1 | 8 | 6% | 18 |
| sp.Nanos.Ember 1.1 | 7 | 5% | 44 |
| sample.Fire 1.0 | 4 | 3% | 15 |
| sample.Tracker 1.0 | 3 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.6 | 321 / 420 | 2.03 | 21.0% | 78205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 21.0% | 321 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 20 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 19 |
| tj.zombie1n 1.0.1 | 4.7 | 9.3% | 14 |
| yk.JahMicro 1.0 | 5.8 | 8.6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.1 | 8.8% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.1% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.1% | 12 |
| repositorio.NanoStep 1.0 | 8.9 | 6.3% | 2 |
| sample.VelociRobot 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 25 / 35 | 6482 |
| 2 | 1 | 72.0 | 92.7 | 31 / 35 | 6518 |
| 3 | 1 | 71.1 | 89.2 | 29 / 35 | 6401 |
| 4 | 1 | 72.2 | 94.6 | 32 / 35 | 6325 |
| 5 | 1 | 71.0 | 88.3 | 26 / 35 | 6551 |
| 6 | 1 | 72.1 | 92.1 | 29 / 35 | 6725 |
| 7 | 1 | 71.6 | 89.8 | 28 / 35 | 6631 |
| 8 | 1 | 70.3 | 86.3 | 26 / 35 | 6493 |
| 9 | 1 | 71.6 | 90.8 | 27 / 35 | 6756 |
| 10 | 1 | 69.8 | 84.4 | 23 / 35 | 6707 |
| 11 | 1 | 69.3 | 82.9 | 21 / 35 | 6400 |
| 12 | 1 | 69.9 | 85.1 | 24 / 35 | 6216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 127 | 96% |
| stelo.SoJNanoMelee 1.1 | 64 | 92% |
| tvv.micro.Antares 1.1.1 | 45 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 34 | 82% |
| tj.zombie1n 1.0.1 | 31 | 90% |
| yk.JahMicro 1.0 | 21 | 86% |
| repositorio.NanoStep 1.0 | 12 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 100 of 420 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 23% | 151 |
| stelo.SoJNanoMelee 1.1 | 17 | 17% | 54 |
| tvv.micro.Antares 1.1.1 | 14 | 14% | 60 |
| ers.nano.hawk.HawkLA 3.0m | 12 | 12% | 57 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 11% | 19 |
| tj.zombie1n 1.0.1 | 11 | 11% | 13 |
| yk.JahMicro 1.0 | 9 | 9% | 33 |
| repositorio.NanoStep 1.0 | 1 | 1% | 19 |
| sample.VelociRobot 1.0 | 1 | 1% | 14 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.1 | 195 / 420 | 3.70 | 16.0% | 57423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 16.0% | 195 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 72 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.6% | 48 |
| ahf.NanoAndrew .4 | 3.4 | 11.6% | 55 |
| EBBU.Sim2 1.02 | 5.6 | 9.9% | 10 |
| sam.Samspin 1.0 | 6.1 | 9.4% | 21 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.0% | 10 |
| zyx.nano.BacillusComma 1.0 | 7.6 | 8.3% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.8 | 17 / 35 | 4863 |
| 2 | 1 | 64.1 | 69.8 | 18 / 35 | 5000 |
| 3 | 1 | 63.8 | 72.1 | 16 / 35 | 4669 |
| 4 | 1 | 63.4 | 66.3 | 16 / 35 | 4939 |
| 5 | 1 | 64.6 | 71.4 | 16 / 35 | 5039 |
| 6 | 1 | 65.6 | 74.3 | 19 / 35 | 4958 |
| 7 | 1 | 64.9 | 72.4 | 17 / 35 | 5121 |
| 8 | 1 | 62.0 | 66.0 | 14 / 35 | 4441 |
| 9 | 1 | 60.6 | 61.9 | 14 / 35 | 3982 |
| 10 | 1 | 62.4 | 65.4 | 16 / 35 | 4865 |
| 11 | 1 | 63.6 | 69.8 | 16 / 35 | 4724 |
| 12 | 1 | 64.3 | 73.3 | 16 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 79 | 86% |
| oog.melee.Corsair 1.0 | 57 | 63% |
| ahf.NanoAndrew .4 | 38 | 89% |
| sam.Samspin 1.0 | 23 | 87% |
| EBBU.Sim2 1.02 | 18 | 100% |
| robar.nano.Assertive_Melee 0.2 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 226 of 420 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 17% | 100 |
| oog.melee.Corsair 1.0 | 37 | 16% | 76 |
| robar.nano.Assertive_Melee 0.2 | 33 | 15% | 46 |
| zyx.nano.BacillusComma 1.0 | 30 | 13% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 25 | 11% | 27 |
| EBBU.Sim2 1.02 | 22 | 10% | 35 |
| ahf.NanoAndrew .4 | 19 | 8% | 65 |
| sam.Samspin 1.0 | 14 | 6% | 26 |
| sample.TrackFire 1.0 | 6 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.5 | 306 / 420 | 1.94 | 19.8% | 63226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 19.8% | 306 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 34 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.2% | 40 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.6% | 10 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 10 |
| fm.claire 1.7 | 6.5 | 8.1% | 1 |
| sample.SpinBot 1.0 | 7.0 | 7.6% | 10 |
| pa.Improved 1.0 | 9.3 | 6.0% | 3 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.2 | 27 / 35 | 5043 |
| 2 | 1 | 70.1 | 90.2 | 27 / 35 | 5413 |
| 3 | 1 | 69.5 | 92.1 | 26 / 35 | 4941 |
| 4 | 1 | 70.9 | 91.4 | 26 / 35 | 5747 |
| 5 | 1 | 71.1 | 95.2 | 29 / 35 | 5475 |
| 6 | 1 | 69.1 | 91.1 | 25 / 35 | 4878 |
| 7 | 1 | 71.0 | 92.1 | 28 / 35 | 5778 |
| 8 | 1 | 69.9 | 91.4 | 26 / 35 | 5123 |
| 9 | 1 | 68.6 | 88.6 | 25 / 35 | 4521 |
| 10 | 1 | 67.1 | 77.5 | 19 / 35 | 5608 |
| 11 | 1 | 69.7 | 90.8 | 26 / 35 | 5412 |
| 12 | 1 | 68.2 | 83.8 | 22 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 133 | 95% |
| oog.melee.CapuletDroid 1.1 | 89 | 79% |
| gh.nano.Grofvuil 0.2 | 38 | 89% |
| arthord.NanoSatanMelee Beta | 37 | 86% |
| winamp32.micro.MicroMacro 1.0 | 15 | 80% |
| sample.SpinBot 1.0 | 13 | 100% |
| fm.claire 1.7 | 8 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| pa.Improved 1.0 | 5 | 80% |

Hadur died in 118 of 420 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 32 | 27% | 43 |
| d414.nano.Quantum 1.0.0 | 28 | 24% | 148 |
| gh.nano.Grofvuil 0.2 | 15 | 13% | 78 |
| arthord.NanoSatanMelee Beta | 13 | 11% | 41 |
| winamp32.micro.MicroMacro 1.0 | 8 | 7% | 26 |
| sample.SpinBot 1.0 | 8 | 7% | 25 |
| pa.Improved 1.0 | 7 | 6% | 17 |
| fm.claire 1.7 | 4 | 3% | 17 |
| kurios.DOSexe .9b | 2 | 2% | 20 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.1 | 189 / 420 | 2.61 | 18.2% | 68191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.1 | 18.2% | 189 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.3% | 91 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.1% | 37 |
| mz.MicroGodMelee 1 | 3.6 | 13.0% | 81 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 13 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 0 |
| acogdev.alpha 0.2 | 7.6 | 6.5% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 3 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 5 |
| fire219.CatBot 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.2 | 13 / 35 | 5955 |
| 2 | 1 | 67.8 | 83.2 | 15 / 35 | 5446 |
| 3 | 1 | 69.6 | 87.3 | 21 / 35 | 6235 |
| 4 | 1 | 66.1 | 75.9 | 14 / 35 | 5447 |
| 5 | 2 | 64.7 | 72.7 | 10 / 35 | 5503 |
| 6 | 1 | 68.5 | 85.4 | 18 / 35 | 5457 |
| 7 | 1 | 69.0 | 85.1 | 18 / 35 | 5759 |
| 8 | 1 | 68.6 | 84.4 | 18 / 35 | 5667 |
| 9 | 1 | 67.1 | 82.5 | 14 / 35 | 5312 |
| 10 | 1 | 65.2 | 74.0 | 14 / 35 | 5211 |
| 11 | 1 | 69.2 | 87.0 | 17 / 35 | 5864 |
| 12 | 1 | 69.3 | 85.7 | 17 / 35 | 6335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 92 | 89% |
| mz.MicroGodMelee 1 | 84 | 43% |
| gh.micro.Gruweltje 0.7 | 64 | 28% |
| DBall.Anarchy 0.1 | 25 | 100% |
| mbro.Detektor3 0.1.1 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 10 | 100% |
| el.JumpShoot 0.2 | 7 | 86% |
| acogdev.alpha 0.2 | 3 | 67% |

Hadur died in 231 of 420 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 79 | 34% | 127 |
| gh.micro.Gruweltje 0.7 | 79 | 34% | 116 |
| spinnercat.micro.Tyger 0.1 | 33 | 14% | 92 |
| acogdev.alpha 0.2 | 12 | 5% | 15 |
| DBall.Anarchy 0.1 | 8 | 3% | 28 |
| caimano.Furia_Ceca 0.22 | 6 | 3% | 15 |
| el.JumpShoot 0.2 | 5 | 2% | 10 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 11 |

## Melee bench: F08

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.8 | 236 / 420 | 3.36 | 16.8% | 60745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.1 | 16.8% | 236 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 77 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.9 | 13.4% | 58 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 12 |
| germ.TheMind .2 | 5.2 | 9.2% | 11 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.6 | 8.5% | 5 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 8 |
| sample.Crazy 1.0 | 8.4 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.0 | 23 / 35 | 5254 |
| 2 | 1 | 65.3 | 72.7 | 18 / 35 | 5145 |
| 3 | 1 | 67.5 | 80.0 | 24 / 35 | 5050 |
| 4 | 1 | 66.6 | 76.8 | 20 / 35 | 5014 |
| 5 | 1 | 64.7 | 70.5 | 18 / 35 | 5268 |
| 6 | 1 | 65.8 | 77.8 | 20 / 35 | 4844 |
| 7 | 2 | 63.5 | 67.6 | 18 / 35 | 4658 |
| 8 | 1 | 68.2 | 81.9 | 21 / 35 | 5670 |
| 9 | 1 | 64.7 | 72.7 | 21 / 35 | 4670 |
| 10 | 1 | 63.2 | 65.4 | 15 / 35 | 5326 |
| 11 | 1 | 63.7 | 68.3 | 17 / 35 | 4792 |
| 12 | 1 | 65.0 | 71.4 | 21 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 156 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 79% |
| germ.TheMind .2 | 19 | 84% |
| qualidafial.MajorDick 1.0.1 | 17 | 88% |
| stelo.UntouchableNano 1.3 | 13 | 92% |
| awesomeness.Elite 1.0 | 9 | 89% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 7 | 86% |

Hadur died in 184 of 420 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 41% | 197 |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 22% | 76 |
| awesomeness.Elite 1.0 | 16 | 9% | 28 |
| qualidafial.MajorDick 1.0.1 | 11 | 6% | 18 |
| germ.TheMind .2 | 10 | 5% | 30 |
| mym.EdgeStalker 1.0 | 9 | 5% | 14 |
| lrem.micro.MoggFanatic 0.2 | 8 | 4% | 25 |
| stelo.UntouchableNano 1.3 | 8 | 4% | 19 |
| sample.Crazy 1.0 | 6 | 3% | 11 |

## Melee bench: F09

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.4 | 316 / 420 | 2.05 | 19.9% | 59167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 19.9% | 316 |
| rz.HawkOnFire 0.1 | 2.1 | 13.5% | 35 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.1% | 19 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.2% | 3 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.5% | 8 |
| ratosh.Wesco 1.4 | 7.4 | 8.1% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 7.4% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.1 | 24 / 35 | 4568 |
| 2 | 1 | 70.9 | 88.6 | 28 / 35 | 5234 |
| 3 | 1 | 70.2 | 90.5 | 26 / 35 | 4774 |
| 4 | 1 | 69.6 | 88.9 | 27 / 35 | 4529 |
| 5 | 1 | 69.0 | 82.2 | 26 / 35 | 4742 |
| 6 | 1 | 71.4 | 90.8 | 27 / 35 | 5349 |
| 7 | 1 | 69.6 | 87.6 | 24 / 35 | 4669 |
| 8 | 1 | 70.3 | 87.6 | 28 / 35 | 5279 |
| 9 | 1 | 69.8 | 87.9 | 25 / 35 | 4793 |
| 10 | 1 | 70.8 | 89.5 | 27 / 35 | 4813 |
| 11 | 1 | 70.4 | 86.7 | 24 / 35 | 5201 |
| 12 | 1 | 71.8 | 94.9 | 30 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 132 | 92% |
| nz.jdc.nano.GridFu 1.0 | 87 | 93% |
| maribo.IotaCT 1.1 | 28 | 93% |
| stelo.PatternRobot 1.0 | 22 | 95% |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 95% |
| timmit.nano.TimDog 0.33 | 21 | 95% |
| spinnercat.Omen 1.0 | 14 | 100% |
| ratosh.Wesco 1.4 | 12 | 92% |
| rrh.Iwillfindyou 2.0 | 2 | 100% |

Hadur died in 104 of 420 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 23% | 108 |
| nz.jdc.nano.GridFu 1.0 | 16 | 15% | 118 |
| timmit.nano.TimDog 0.33 | 16 | 15% | 40 |
| ratosh.Wesco 1.4 | 15 | 14% | 32 |
| maribo.IotaCT 1.1 | 10 | 10% | 51 |
| stelo.PatternRobot 1.0 | 10 | 10% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 10% | 19 |
| spinnercat.Omen 1.0 | 2 | 2% | 13 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 4 |

## Melee bench: F10

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.8 | 350 / 420 | 1.74 | 21.4% | 75808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 21.4% | 350 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 29 |
| baal.nano.N 1.42 | 2.9 | 11.3% | 11 |
| Grystrion.TrackerWO 1.0 | 4.1 | 10.0% | 1 |
| zyx.micro.Ant 1.1 | 5.7 | 9.1% | 8 |
| sanja.First 0.1 | 5.8 | 8.7% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.4 | 7.8% | 0 |
| cvt.Firsty 1.0 | 7.4 | 7.6% | 12 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.1% | 3 |
| sample.RamFire 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 97.1 | 30 / 35 | 6403 |
| 2 | 1 | 70.6 | 88.6 | 28 / 35 | 6237 |
| 3 | 1 | 72.1 | 93.7 | 31 / 35 | 6447 |
| 4 | 1 | 69.8 | 83.8 | 24 / 35 | 6383 |
| 5 | 1 | 73.5 | 97.8 | 33 / 35 | 6935 |
| 6 | 1 | 70.6 | 87.9 | 29 / 35 | 6235 |
| 7 | 1 | 70.6 | 92.1 | 30 / 35 | 5664 |
| 8 | 1 | 71.7 | 92.4 | 29 / 35 | 6547 |
| 9 | 1 | 70.7 | 91.7 | 28 / 35 | 5928 |
| 10 | 1 | 72.3 | 93.7 | 31 / 35 | 6893 |
| 11 | 1 | 71.7 | 93.0 | 30 / 35 | 6304 |
| 12 | 1 | 70.4 | 89.5 | 27 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 76 | 91% |
| baal.nano.N 1.42 | 73 | 97% |
| cvt.Firsty 1.0 | 55 | 93% |
| sanja.First 0.1 | 50 | 96% |
| zyx.micro.Ant 1.1 | 39 | 97% |
| Grystrion.TrackerWO 1.0 | 31 | 100% |
| amk.Punbot.Punbot 0.01 | 31 | 97% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 70 of 420 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 14 | 20% | 102 |
| cvt.Firsty 1.0 | 14 | 20% | 39 |
| zyx.micro.Ant 1.1 | 11 | 16% | 76 |
| sanja.First 0.1 | 11 | 16% | 60 |
| Grystrion.TrackerWO 1.0 | 9 | 13% | 42 |
| squidM.TentalceMeleeNano 1.1 | 4 | 6% | 18 |
| baal.nano.N 1.42 | 3 | 4% | 58 |
| sample.RamFire 1.0 | 3 | 4% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 10 |

## Melee bench: F11

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.3 | 152 / 420 | 3.67 | 15.5% | 59782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.4 | 15.5% | 152 |
| kc.micro.Figment 1.0 | 1.6 | 15.6% | 153 |
| cs.Wren 1.0 | 3.3 | 12.4% | 25 |
| js.PinBall 1.6 | 4.0 | 11.3% | 34 |
| mz.Cork 0.1 | 4.7 | 10.5% | 25 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 12 |
| evd.X1 0.01 | 7.2 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.1% | 9 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 8 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 57.8 | 10 / 35 | 4405 |
| 2 | 1 | 62.1 | 67.6 | 11 / 35 | 4628 |
| 3 | 1 | 64.3 | 72.7 | 14 / 35 | 5155 |
| 4 | 2 | 61.7 | 65.1 | 13 / 35 | 4930 |
| 5 | 2 | 63.9 | 70.2 | 12 / 35 | 5148 |
| 6 | 2 | 63.6 | 71.1 | 10 / 35 | 5307 |
| 7 | 1 | 62.2 | 68.9 | 12 / 35 | 4436 |
| 8 | 2 | 63.5 | 72.7 | 15 / 35 | 4752 |
| 9 | 1 | 62.4 | 67.6 | 9 / 35 | 4846 |
| 10 | 1 | 64.9 | 73.3 | 14 / 35 | 5478 |
| 11 | 1 | 66.9 | 81.9 | 19 / 35 | 5197 |
| 12 | 1 | 65.1 | 74.9 | 13 / 35 | 5500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 153 | 47% |
| cs.Wren 1.0 | 40 | 90% |
| js.PinBall 1.6 | 23 | 74% |
| mz.Cork 0.1 | 18 | 67% |
| donjezza.Jezza 1.0 | 7 | 57% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| joe.ADinosaur 1.0 | 4 | 100% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 271 of 420 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 136 | 50% | 221 |
| joe.ADinosaur 1.0 | 29 | 11% | 33 |
| js.PinBall 1.6 | 26 | 10% | 47 |
| cs.Wren 1.0 | 19 | 7% | 38 |
| mz.Cork 0.1 | 19 | 7% | 30 |
| evd.X1 0.01 | 18 | 7% | 20 |
| PSW.Relentless 0.1 | 12 | 4% | 11 |
| jsal.Jsalbot 1.0 | 7 | 3% | 14 |
| donjezza.Jezza 1.0 | 4 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.2 | 278 / 420 | 2.51 | 18.9% | 58519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 18.9% | 278 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 41 |
| ntc.Opposite 1.5 | 3.6 | 10.8% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.2% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 15 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.6% | 10 |
| DBall.NUKE 0.1 | 7.4 | 8.2% | 13 |
| disan.Chair 2.2.0 | 7.5 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 8.6 | 6.8% | 23 |
| pbg.R2D2 1.0 | 9.9 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.3 | 23 / 35 | 4881 |
| 2 | 1 | 68.6 | 84.8 | 25 / 35 | 4988 |
| 3 | 1 | 66.9 | 79.0 | 20 / 35 | 4825 |
| 4 | 1 | 69.5 | 89.2 | 23 / 35 | 5167 |
| 5 | 1 | 68.3 | 83.2 | 24 / 35 | 4931 |
| 6 | 1 | 70.5 | 89.8 | 26 / 35 | 5472 |
| 7 | 1 | 65.7 | 77.1 | 23 / 35 | 4176 |
| 8 | 1 | 69.0 | 85.7 | 24 / 35 | 5093 |
| 9 | 1 | 65.0 | 75.6 | 20 / 35 | 4260 |
| 10 | 1 | 66.8 | 78.7 | 21 / 35 | 4665 |
| 11 | 1 | 68.6 | 84.4 | 24 / 35 | 5087 |
| 12 | 1 | 69.9 | 89.8 | 25 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 76 | 92% |
| stelo.AreaTargetingBot 1.1 | 69 | 88% |
| ntc.Opposite 1.5 | 32 | 88% |
| donjezza.Muncho 1.0 | 32 | 84% |
| disan.Chair 2.2.0 | 26 | 88% |
| DBall.NUKE 0.1 | 24 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 87% |
| pfvicm.Sobieski 7.2.3b | 20 | 85% |
| pbg.R2D2 1.0 | 6 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 32 | 22% | 55 |
| ntc.Opposite 1.5 | 24 | 17% | 54 |
| stelo.AreaTargetingBot 1.1 | 22 | 15% | 74 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 14% | 49 |
| myl.nano.Graviton 1.10 | 19 | 13% | 77 |
| DBall.NUKE 0.1 | 9 | 6% | 38 |
| donjezza.Muncho 1.0 | 8 | 6% | 25 |
| disan.Chair 2.2.0 | 6 | 4% | 28 |
| pbg.R2D2 1.0 | 4 | 3% | 15 |

## Melee bench: F13

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.2 | 170 / 420 | 3.50 | 15.7% | 50787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.2 | 15.7% | 170 |
| oog.melee.Capulet 1.2 | 2.6 | 13.9% | 86 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 52 |
| yagami.Tidus 0.11 | 4.6 | 11.9% | 26 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 21 |
| stelo.MirrorNano 1.3 | 7.1 | 7.5% | 2 |
| step.nanoPri 1.0 | 7.9 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 66.7 | 11 / 35 | 4067 |
| 2 | 1 | 63.5 | 70.2 | 13 / 35 | 4066 |
| 3 | 1 | 62.9 | 71.1 | 10 / 35 | 3840 |
| 4 | 2 | 61.6 | 65.4 | 9 / 35 | 4100 |
| 5 | 1 | 67.0 | 78.7 | 22 / 35 | 4423 |
| 6 | 1 | 64.4 | 73.7 | 13 / 35 | 4304 |
| 7 | 1 | 65.7 | 73.0 | 16 / 35 | 4759 |
| 8 | 1 | 63.0 | 68.9 | 11 / 35 | 4172 |
| 9 | 1 | 64.4 | 73.3 | 16 / 35 | 4028 |
| 10 | 1 | 66.4 | 80.3 | 17 / 35 | 3910 |
| 11 | 1 | 64.2 | 72.4 | 13 / 35 | 4255 |
| 12 | 1 | 66.0 | 73.3 | 19 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 74 | 53% |
| kawigi.micro.Shiz 1.1 | 57 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 79% |
| yagami.Tidus 0.11 | 31 | 87% |
| ejb.Polaris 1.0.1 | 15 | 73% |
| step.nanoPri 1.0 | 3 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 251 of 420 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 90 | 36% | 142 |
| yagami.Tidus 0.11 | 49 | 20% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 15% | 79 |
| kawigi.micro.Shiz 1.1 | 29 | 12% | 60 |
| ejb.Polaris 1.0.1 | 17 | 7% | 36 |
| stelo.MirrorNano 1.3 | 15 | 6% | 16 |
| kurios.DOSexe .9a | 6 | 2% | 8 |
| step.nanoPri 1.0 | 5 | 2% | 7 |
| logiblocs.SittingDroid 1.0 | 1 | 0% | 0 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.2 | 255 / 420 | 2.87 | 17.4% | 53636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 17.4% | 255 |
| wee.Gem 1.8.4 | 2.7 | 12.3% | 62 |
| bzdp.Pansy 2.1 | 3.1 | 11.9% | 37 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 31 |
| ratosh.Nobo 0.21 | 4.6 | 11.0% | 16 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 11 |
| bayen.UbaMicro 1.4 | 6.8 | 8.4% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.9 | 6.1% | 0 |
| maribo.FollowFire 1 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 74.3 | 20 / 35 | 4030 |
| 2 | 1 | 66.4 | 78.7 | 22 / 35 | 4556 |
| 3 | 1 | 65.8 | 78.7 | 19 / 35 | 4528 |
| 4 | 1 | 68.6 | 87.9 | 26 / 35 | 4777 |
| 5 | 1 | 66.4 | 80.6 | 22 / 35 | 4549 |
| 6 | 1 | 65.4 | 76.5 | 18 / 35 | 4437 |
| 7 | 1 | 64.8 | 76.2 | 19 / 35 | 4250 |
| 8 | 1 | 64.5 | 73.7 | 18 / 35 | 4256 |
| 9 | 1 | 68.6 | 87.6 | 24 / 35 | 4767 |
| 10 | 1 | 67.5 | 82.2 | 24 / 35 | 4719 |
| 11 | 1 | 66.8 | 81.9 | 23 / 35 | 4409 |
| 12 | 1 | 64.5 | 72.4 | 20 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 98 | 93% |
| wee.Gem 1.8.4 | 84 | 88% |
| wompi.Quokka 1.6 | 42 | 81% |
| ratosh.Nobo 0.21 | 28 | 79% |
| m3thos.Eva00 1.1 | 19 | 100% |
| bayen.UbaMicro 1.4 | 10 | 60% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 166 of 420 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 25 | 15% | 48 |
| wompi.Quokka 1.6 | 24 | 14% | 58 |
| bzdp.Pansy 2.1 | 23 | 14% | 105 |
| maribo.FollowFire 1 | 23 | 14% | 25 |
| wee.Gem 1.8.4 | 19 | 11% | 84 |
| stelo.MyAgileRobot 0.2 | 18 | 11% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 8% | 20 |
| m3thos.Eva00 1.1 | 11 | 7% | 29 |
| bayen.UbaMicro 1.4 | 10 | 6% | 27 |

## Melee bench: F15

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 82.3 | 136 / 420 | 2.59 | 19.0% | 86289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 19.9% | 257 |
| hadur117.micro.SaorB6 0.1 | 1.8 | 19.0% | 136 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 16 |
| ayk.WallHugger 1.0 | 4.5 | 9.6% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 4 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 6.9 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.4% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 81.6 | 8 / 35 | 6624 |
| 2 | 2 | 70.3 | 86.0 | 11 / 35 | 7418 |
| 3 | 2 | 69.3 | 79.7 | 11 / 35 | 6836 |
| 4 | 2 | 69.9 | 80.0 | 12 / 35 | 7314 |
| 5 | 2 | 69.8 | 80.3 | 11 / 35 | 7249 |
| 6 | 2 | 69.7 | 83.8 | 8 / 35 | 7248 |
| 7 | 2 | 70.7 | 83.5 | 13 / 35 | 7565 |
| 8 | 2 | 69.3 | 83.2 | 8 / 35 | 6950 |
| 9 | 2 | 68.9 | 80.3 | 11 / 35 | 6693 |
| 10 | 1 | 72.4 | 87.6 | 16 / 35 | 7956 |
| 11 | 2 | 67.6 | 74.3 | 12 / 35 | 6672 |
| 12 | 1 | 71.4 | 87.3 | 15 / 35 | 7764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 223 | 29% |
| mz.NanoGod 2.02 | 19 | 79% |
| exauge.GateKeeper 1.1.121g | 16 | 94% |
| ayk.WallHugger 1.0 | 12 | 100% |
| stelo.PianistNano 1.2 | 12 | 100% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| stuff.Vlad 0.1 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 285 of 420 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 213 | 75% | 296 |
| mz.NanoGod 2.02 | 29 | 10% | 55 |
| exauge.GateKeeper 1.1.121g | 24 | 8% | 28 |
| ayk.WallHugger 1.0 | 11 | 4% | 22 |
| stelo.PianistNano 1.2 | 4 | 1% | 5 |
| stuff.Vlad 0.1 | 3 | 1% | 7 |
| drd.Dreadknoght 0.9 | 1 | 0% | 7 |

## Melee bench: F16

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.0 | 235 / 420 | 3.16 | 17.2% | 57504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 17.2% | 235 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.4% | 34 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.4% | 33 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 34 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 43 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.7% | 19 |
| conscience.Electron 1.3g | 7.5 | 8.0% | 0 |
| ap.Frederick 1.1 | 8.3 | 7.1% | 16 |
| dl.BetterWalls 1.0 | 8.4 | 6.9% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 71.4 | 19 / 35 | 4788 |
| 2 | 1 | 63.6 | 72.1 | 18 / 35 | 4209 |
| 3 | 1 | 66.0 | 78.1 | 22 / 35 | 4580 |
| 4 | 1 | 67.7 | 81.0 | 25 / 35 | 4890 |
| 5 | 1 | 64.3 | 69.8 | 18 / 35 | 4994 |
| 6 | 1 | 69.1 | 86.7 | 23 / 35 | 5231 |
| 7 | 1 | 67.6 | 82.5 | 22 / 35 | 5102 |
| 8 | 1 | 66.2 | 77.1 | 19 / 35 | 5118 |
| 9 | 1 | 62.9 | 65.7 | 17 / 35 | 4585 |
| 10 | 1 | 65.3 | 74.6 | 17 / 35 | 4753 |
| 11 | 1 | 65.1 | 76.8 | 18 / 35 | 4460 |
| 12 | 1 | 65.0 | 76.5 | 17 / 35 | 4794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 71 | 92% |
| dummy.micro.Sparrow 2.5 | 67 | 91% |
| bvh.micro.Freya 0.3 | 45 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 43 | 77% |
| stelo.MirrorMicro 1.0 | 17 | 71% |
| ap.Frederick 1.1 | 16 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 187 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 17% | 84 |
| conscience.Electron 1.3g | 27 | 14% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 27 | 14% | 27 |
| bvh.micro.Freya 0.3 | 24 | 13% | 49 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 12% | 71 |
| dummy.micro.Sparrow 2.5 | 19 | 10% | 78 |
| stelo.MirrorMicro 1.0 | 19 | 10% | 43 |
| dl.BetterWalls 1.0 | 16 | 9% | 34 |

## Melee bench: F17

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 89.8 | 326 / 420 | 1.92 | 21.5% | 82535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 21.5% | 326 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.6% | 29 |
| supersample.SuperBoxBot 1.0 | 3.6 | 10.8% | 20 |
| sul.Lunar 1.1 | 3.7 | 11.1% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 9 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 9 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.4 | 6.1% | 6 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 12 |
| sample.Corners 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.9 | 23 / 35 | 6162 |
| 2 | 1 | 72.7 | 94.6 | 29 / 35 | 7120 |
| 3 | 1 | 71.6 | 90.5 | 28 / 35 | 6429 |
| 4 | 1 | 74.0 | 95.6 | 30 / 35 | 7921 |
| 5 | 1 | 71.5 | 89.5 | 29 / 35 | 6358 |
| 6 | 1 | 71.0 | 87.0 | 25 / 35 | 6570 |
| 7 | 1 | 72.9 | 93.7 | 31 / 35 | 6776 |
| 8 | 1 | 71.8 | 91.1 | 25 / 35 | 7128 |
| 9 | 1 | 72.7 | 91.7 | 31 / 35 | 7106 |
| 10 | 1 | 72.4 | 92.1 | 26 / 35 | 7180 |
| 11 | 1 | 69.2 | 81.9 | 23 / 35 | 6431 |
| 12 | 1 | 71.4 | 87.0 | 26 / 35 | 7354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 104 | 94% |
| sul.Lunar 1.1 | 98 | 99% |
| supersample.SuperBoxBot 1.0 | 59 | 93% |
| dsw.StaticD 1.0 | 26 | 81% |
| mme.NikeEnhanced 2.0 | 25 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 77% |
| sample.MyFirstRobot 1.0 | 11 | 64% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.Corners 1.0 | 7 | 100% |

Hadur died in 100 of 420 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 30 | 30% | 78 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 21% | 122 |
| dsw.StaticD 1.0 | 12 | 12% | 44 |
| sample.MyFirstRobot 1.0 | 10 | 10% | 16 |
| mme.NikeEnhanced 2.0 | 6 | 6% | 34 |
| sul.Lunar 1.1 | 5 | 5% | 98 |
| sample.Corners 1.0 | 5 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 5% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 5 |
5 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorB6 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.7 | 237 / 420 | 2.74 | 18.5% | 73847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB6 0.1 | 1.0 | 18.5% | 237 |
| radnor.DoctorBob 1.42 | 2.6 | 12.8% | 54 |
| mld.Wisdom 1.0 | 3.0 | 12.6% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 35 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.8% | 17 |
| amz.NanoClone 1.41 | 5.4 | 9.9% | 16 |
| sample.Walls 1.0 | 7.1 | 7.8% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 5 |
| sample.Target 1.0 | 9.9 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.9 | 19 / 35 | 5946 |
| 2 | 1 | 65.0 | 70.2 | 16 / 35 | 5783 |
| 3 | 1 | 67.7 | 79.7 | 24 / 35 | 5804 |
| 4 | 1 | 67.1 | 80.3 | 15 / 35 | 5938 |
| 5 | 1 | 70.6 | 86.0 | 20 / 35 | 7220 |
| 6 | 1 | 70.1 | 87.6 | 24 / 35 | 6588 |
| 7 | 1 | 66.8 | 78.4 | 19 / 35 | 5643 |
| 8 | 1 | 68.6 | 82.5 | 20 / 35 | 6255 |
| 9 | 1 | 70.7 | 90.8 | 27 / 35 | 6354 |
| 10 | 1 | 68.7 | 82.2 | 21 / 35 | 6442 |
| 11 | 1 | 64.4 | 70.5 | 15 / 35 | 5583 |
| 12 | 1 | 67.0 | 77.1 | 17 / 35 | 6291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 86 | 91% |
| radnor.DoctorBob 1.42 | 63 | 78% |
| mld.Wisdom 1.0 | 51 | 73% |
| KiraNL.Chupacabra 0.4 | 26 | 81% |
| amz.NanoClone 1.41 | 18 | 89% |
| sample.Walls 1.0 | 14 | 93% |
| jangs.ns51 1.0 | 13 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 54 | 29% | 92 |
| radnor.DoctorBob 1.42 | 43 | 23% | 101 |
| KiraNL.Chupacabra 0.4 | 28 | 15% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 26 | 14% | 102 |
| amz.NanoClone 1.41 | 17 | 9% | 31 |
| sample.Walls 1.0 | 7 | 4% | 19 |
| jangs.ns51 1.0 | 5 | 3% | 14 |
| GarmBox.Oranges 1.0 | 4 | 2% | 6 |

