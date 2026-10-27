# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.9 | 310 / 420 | 1.91 | 21.6% | 85358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.6% | 310 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 32 |
| mz.AntiGrav 1.0 | 2.8 | 13.9% | 27 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 31 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 10 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| sample.Walls 1.0 | 7.0 | 6.5% | 5 |
| jangs.ns51 1.0 | 7.4 | 6.3% | 5 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 92.7 | 27 / 35 | 7532 |
| 2 | 1 | 71.8 | 86.3 | 25 / 35 | 7130 |
| 3 | 1 | 71.6 | 85.4 | 27 / 35 | 7005 |
| 4 | 1 | 72.7 | 92.7 | 26 / 35 | 7051 |
| 5 | 1 | 74.1 | 95.6 | 27 / 35 | 7412 |
| 6 | 1 | 73.2 | 94.6 | 27 / 35 | 6970 |
| 7 | 1 | 70.3 | 83.5 | 24 / 35 | 6364 |
| 8 | 1 | 71.6 | 86.7 | 26 / 35 | 6816 |
| 9 | 1 | 73.0 | 92.1 | 28 / 35 | 7027 |
| 10 | 1 | 73.1 | 92.1 | 26 / 35 | 7291 |
| 11 | 1 | 72.5 | 88.3 | 24 / 35 | 7437 |
| 12 | 1 | 72.5 | 88.6 | 23 / 35 | 7323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 138 | 96% |
| mld.Infinity 2.2 | 93 | 89% |
| radnor.DoctorBob 1.42 | 82 | 87% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 111 of 420 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 46 | 41% | 159 |
| mld.Infinity 2.2 | 19 | 17% | 31 |
| mz.AntiGrav 1.0 | 18 | 16% | 153 |
| amz.NanoClone 1.41 | 16 | 14% | 26 |
| jangs.ns51 1.0 | 6 | 5% | 12 |
| sample.Walls 1.0 | 3 | 3% | 16 |
| GarmBox.Oranges 1.0 | 2 | 2% | 8 |
| arthord.MannyPacquiao Beta | 1 | 1% | 8 |

## Melee bench: F02

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.1 | 243 / 420 | 2.97 | 17.5% | 59043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.4 | 17.5% | 243 |
| oog.melee.Mercutio 1.0 | 1.9 | 14.8% | 118 |
| mld.DustBunny 3.8 | 2.8 | 13.4% | 25 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.4% | 17 |
| zyx.nano.Ant 1.1 | 6.1 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 6.8% | 7 |
| bzdp.BoxCar 2.0 | 7.9 | 7.5% | 1 |
| fullsail.SweetTea 1.1 | 8.3 | 6.5% | 7 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 24 / 35 | 5073 |
| 2 | 1 | 66.4 | 77.5 | 19 / 35 | 4758 |
| 3 | 1 | 67.7 | 85.4 | 22 / 35 | 4843 |
| 4 | 1 | 69.6 | 87.3 | 26 / 35 | 5266 |
| 5 | 1 | 70.1 | 90.5 | 27 / 35 | 5812 |
| 6 | 1 | 69.9 | 91.7 | 29 / 35 | 4854 |
| 7 | 3 | 60.5 | 57.1 | 8 / 35 | 4476 |
| 8 | 1 | 68.8 | 86.7 | 25 / 35 | 4919 |
| 9 | 1 | 69.1 | 88.9 | 25 / 35 | 5144 |
| 10 | 1 | 66.8 | 81.3 | 21 / 35 | 4753 |
| 11 | 3 | 55.8 | 43.8 | 8 / 35 | 4171 |
| 12 | 2 | 62.1 | 58.7 | 9 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 130 | 69% |
| mld.DustBunny 3.8 | 92 | 93% |
| djdjdj.NanoSkunk10 1.0 | 20 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 95% |
| fullsail.SweetTea 1.1 | 14 | 79% |
| maribo.melee.BMV 0.1 | 13 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 178 of 420 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 35% | 157 |
| cs.Grudge 1.0 | 26 | 15% | 25 |
| mld.DustBunny 3.8 | 19 | 11% | 86 |
| zyx.nano.Ant 1.1 | 19 | 11% | 26 |
| maribo.melee.BMV 0.1 | 15 | 8% | 24 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 7% | 31 |
| djdjdj.NanoSkunk10 1.0 | 12 | 7% | 42 |
| fullsail.SweetTea 1.1 | 9 | 5% | 21 |
| bzdp.BoxCar 2.0 | 3 | 2% | 7 |

## Melee bench: F03

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.9 | 277 / 420 | 2.45 | 19.9% | 71875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.9% | 277 |
| myl.micro.Troodon 1.10 | 2.2 | 14.2% | 55 |
| myl.nano.KomoriNinja 1.1 | 2.9 | 11.8% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.8% | 31 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.5% | 22 |
| fm.mammillarias 1.3 | 6.5 | 8.5% | 3 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.6 | 7.2% | 9 |
| sample.Fire 1.0 | 9.3 | 5.1% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.3 | 27 / 35 | 6467 |
| 2 | 1 | 69.4 | 82.2 | 22 / 35 | 6026 |
| 3 | 1 | 70.4 | 85.1 | 24 / 35 | 6455 |
| 4 | 1 | 69.3 | 82.2 | 23 / 35 | 5633 |
| 5 | 1 | 69.5 | 84.1 | 23 / 35 | 5705 |
| 6 | 1 | 68.7 | 80.6 | 22 / 35 | 5718 |
| 7 | 1 | 69.5 | 82.2 | 23 / 35 | 5893 |
| 8 | 1 | 71.2 | 84.4 | 27 / 35 | 6510 |
| 9 | 1 | 70.5 | 87.6 | 25 / 35 | 5771 |
| 10 | 1 | 69.5 | 83.2 | 20 / 35 | 6081 |
| 11 | 1 | 67.6 | 78.7 | 20 / 35 | 5389 |
| 12 | 1 | 70.3 | 82.9 | 21 / 35 | 6227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 103 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 78 | 87% |
| cb.nano.Insomnia 1.0 | 40 | 80% |
| myl.nano.KomoriNinja 1.1 | 37 | 86% |
| sp.Nanos.Ember 1.1 | 29 | 86% |
| fm.mammillarias 1.3 | 12 | 92% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 143 of 420 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 30 | 21% | 80 |
| myl.micro.Troodon 1.10 | 28 | 20% | 127 |
| myl.nano.KomoriNinja 1.1 | 22 | 15% | 76 |
| cb.nano.Insomnia 1.0 | 22 | 15% | 20 |
| fm.mammillarias 1.3 | 12 | 8% | 27 |
| sp.Nanos.Ember 1.1 | 9 | 6% | 40 |
| cs.sheldor.Talon 1.1 | 9 | 6% | 24 |
| sample.Fire 1.0 | 7 | 5% | 16 |
| sample.Tracker 1.0 | 4 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.0 | 318 / 420 | 2.08 | 20.6% | 75650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 20.6% | 318 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.2% | 29 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.9 | 9.2% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.4% | 17 |
| tj.zombie1n 1.0.1 | 5.9 | 8.7% | 8 |
| yk.JahMicro 1.0 | 6.8 | 7.8% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.7% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.7 | 27 / 35 | 6325 |
| 2 | 1 | 69.6 | 85.4 | 28 / 35 | 5922 |
| 3 | 1 | 72.4 | 94.0 | 29 / 35 | 6794 |
| 4 | 1 | 70.4 | 89.8 | 27 / 35 | 5756 |
| 5 | 1 | 69.2 | 81.6 | 24 / 35 | 6378 |
| 6 | 1 | 70.6 | 87.0 | 27 / 35 | 6424 |
| 7 | 1 | 71.0 | 89.5 | 30 / 35 | 6156 |
| 8 | 1 | 71.0 | 90.2 | 26 / 35 | 6187 |
| 9 | 1 | 70.8 | 89.2 | 26 / 35 | 6225 |
| 10 | 1 | 72.0 | 94.3 | 30 / 35 | 6483 |
| 11 | 1 | 68.9 | 79.7 | 20 / 35 | 6571 |
| 12 | 1 | 69.7 | 84.1 | 24 / 35 | 6429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 129 | 92% |
| stelo.SoJNanoMelee 1.1 | 97 | 95% |
| tvv.micro.Antares 1.1.1 | 28 | 96% |
| tj.zombie1n 1.0.1 | 27 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 26 | 88% |
| yk.JahMicro 1.0 | 15 | 87% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 106 of 420 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 35% | 179 |
| stelo.SoJNanoMelee 1.1 | 22 | 21% | 65 |
| tvv.micro.Antares 1.1.1 | 13 | 12% | 51 |
| yk.JahMicro 1.0 | 8 | 8% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 8% | 16 |
| tj.zombie1n 1.0.1 | 7 | 7% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 5% | 37 |
| repositorio.NanoStep 1.0 | 3 | 3% | 21 |
| sample.VelociRobot 1.0 | 2 | 2% | 15 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.7 | 195 / 420 | 3.73 | 16.0% | 57612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 16.0% | 195 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 79 |
| ahf.NanoAndrew .4 | 3.0 | 11.4% | 49 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.5% | 31 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 11 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 27 |
| zyx.nano.BacillusComma 1.0 | 6.6 | 9.3% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.9 | 9.1% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.0 | 20 / 35 | 5192 |
| 2 | 1 | 61.3 | 65.1 | 12 / 35 | 4694 |
| 3 | 1 | 67.7 | 82.5 | 20 / 35 | 5255 |
| 4 | 1 | 60.0 | 60.0 | 14 / 35 | 4422 |
| 5 | 1 | 63.6 | 69.8 | 18 / 35 | 4611 |
| 6 | 1 | 63.7 | 67.6 | 15 / 35 | 4943 |
| 7 | 1 | 64.7 | 73.3 | 19 / 35 | 4881 |
| 8 | 1 | 64.6 | 71.1 | 16 / 35 | 4909 |
| 9 | 1 | 63.8 | 72.4 | 15 / 35 | 4462 |
| 10 | 1 | 63.3 | 66.7 | 14 / 35 | 4959 |
| 11 | 1 | 61.1 | 62.5 | 15 / 35 | 4699 |
| 12 | 1 | 63.6 | 71.4 | 17 / 35 | 4585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 71 | 93% |
| oog.melee.Corsair 1.0 | 71 | 62% |
| ahf.NanoAndrew .4 | 29 | 90% |
| EBBU.Sim2 1.02 | 18 | 94% |
| sam.Samspin 1.0 | 16 | 94% |
| zyx.nano.BacillusComma 1.0 | 13 | 85% |
| robar.nano.Assertive_Melee 0.2 | 12 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 227 of 420 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 49 | 22% | 94 |
| bwbaugh.nano.Tirunculus 0.0.0a | 35 | 15% | 33 |
| simonton.nano.MeleeSeed 1.8 | 34 | 15% | 93 |
| zyx.nano.BacillusComma 1.0 | 26 | 11% | 39 |
| ahf.NanoAndrew .4 | 25 | 11% | 61 |
| robar.nano.Assertive_Melee 0.2 | 24 | 11% | 37 |
| EBBU.Sim2 1.02 | 18 | 8% | 31 |
| sam.Samspin 1.0 | 12 | 5% | 23 |
| sample.TrackFire 1.0 | 4 | 2% | 7 |

## Melee bench: F06

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.0 | 310 / 420 | 1.99 | 19.8% | 63989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.8% | 310 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 38 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.8% | 17 |
| oog.melee.CapuletDroid 1.1 | 5.1 | 9.8% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 8 |
| arthord.NanoSatanMelee Beta | 5.9 | 8.6% | 12 |
| fm.claire 1.7 | 6.2 | 8.7% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.4% | 2 |
| pa.Improved 1.0 | 9.2 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 26 / 35 | 5464 |
| 2 | 1 | 68.0 | 85.7 | 23 / 35 | 4668 |
| 3 | 1 | 69.5 | 86.3 | 23 / 35 | 5767 |
| 4 | 1 | 70.3 | 91.4 | 28 / 35 | 5135 |
| 5 | 1 | 72.7 | 98.1 | 33 / 35 | 6053 |
| 6 | 1 | 69.6 | 88.3 | 28 / 35 | 5272 |
| 7 | 1 | 69.3 | 88.9 | 22 / 35 | 5310 |
| 8 | 1 | 68.1 | 83.8 | 25 / 35 | 5102 |
| 9 | 1 | 70.3 | 91.4 | 27 / 35 | 5559 |
| 10 | 1 | 70.3 | 92.7 | 28 / 35 | 5064 |
| 11 | 1 | 69.5 | 88.3 | 25 / 35 | 5398 |
| 12 | 1 | 67.7 | 81.9 | 22 / 35 | 5197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 132 | 93% |
| oog.melee.CapuletDroid 1.1 | 70 | 86% |
| gh.nano.Grofvuil 0.2 | 49 | 92% |
| arthord.NanoSatanMelee Beta | 27 | 85% |
| winamp32.micro.MicroMacro 1.0 | 23 | 83% |
| sample.SpinBot 1.0 | 17 | 100% |
| fm.claire 1.7 | 14 | 100% |
| pa.Improved 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 75% |

Hadur died in 113 of 420 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 24% | 160 |
| oog.melee.CapuletDroid 1.1 | 25 | 22% | 36 |
| arthord.NanoSatanMelee Beta | 19 | 17% | 44 |
| gh.nano.Grofvuil 0.2 | 15 | 13% | 73 |
| winamp32.micro.MicroMacro 1.0 | 8 | 7% | 41 |
| fm.claire 1.7 | 6 | 5% | 13 |
| kurios.DOSexe .9b | 5 | 4% | 20 |
| sample.SpinBot 1.0 | 5 | 4% | 20 |
| pa.Improved 1.0 | 3 | 3% | 10 |

## Melee bench: F07

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.5 | 192 / 420 | 2.57 | 18.2% | 67452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 18.2% | 192 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 87 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.5% | 40 |
| mz.MicroGodMelee 1 | 3.6 | 13.4% | 82 |
| DBall.Anarchy 0.1 | 5.6 | 8.2% | 10 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 3 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.4 | 5.9% | 0 |
| el.JumpShoot 0.2 | 8.4 | 6.1% | 3 |
| mbro.Detektor3 0.1.1 | 9.1 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 18 / 35 | 5831 |
| 2 | 2 | 65.1 | 71.7 | 16 / 35 | 4890 |
| 3 | 1 | 68.4 | 85.4 | 17 / 35 | 5798 |
| 4 | 1 | 68.6 | 86.0 | 16 / 35 | 5857 |
| 5 | 1 | 67.7 | 84.8 | 16 / 35 | 5345 |
| 6 | 1 | 67.6 | 81.6 | 17 / 35 | 5560 |
| 7 | 1 | 67.6 | 80.6 | 17 / 35 | 5486 |
| 8 | 1 | 67.7 | 81.9 | 18 / 35 | 5225 |
| 9 | 1 | 69.1 | 86.0 | 16 / 35 | 5955 |
| 10 | 1 | 66.1 | 74.0 | 12 / 35 | 5664 |
| 11 | 1 | 67.6 | 80.6 | 12 / 35 | 6029 |
| 12 | 1 | 68.8 | 86.7 | 17 / 35 | 5812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 96 | 88% |
| mz.MicroGodMelee 1 | 92 | 40% |
| gh.micro.Gruweltje 0.7 | 68 | 38% |
| DBall.Anarchy 0.1 | 21 | 95% |
| mbro.Detektor3 0.1.1 | 9 | 100% |
| el.JumpShoot 0.2 | 8 | 75% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| acogdev.alpha 0.2 | 4 | 100% |

Hadur died in 228 of 420 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 81 | 36% | 122 |
| gh.micro.Gruweltje 0.7 | 65 | 29% | 108 |
| spinnercat.micro.Tyger 0.1 | 38 | 17% | 101 |
| acogdev.alpha 0.2 | 14 | 6% | 21 |
| fire219.CatBot 1.0 | 13 | 6% | 12 |
| caimano.Furia_Ceca 0.22 | 8 | 4% | 15 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 11 |
| el.JumpShoot 0.2 | 3 | 1% | 8 |
| DBall.Anarchy 0.1 | 2 | 1% | 21 |

## Melee bench: F08

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.0 | 218 / 420 | 3.61 | 16.4% | 62014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 16.4% | 218 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.5% | 69 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.4 | 13.5% | 56 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 19 |
| germ.TheMind .2 | 5.4 | 9.4% | 14 |
| awesomeness.Elite 1.0 | 6.2 | 8.8% | 18 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.5% | 7 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 11 |
| sample.Crazy 1.0 | 8.6 | 6.9% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 70.2 | 15 / 35 | 4963 |
| 2 | 2 | 61.4 | 63.8 | 17 / 35 | 4670 |
| 3 | 2 | 65.3 | 71.7 | 15 / 35 | 5308 |
| 4 | 1 | 62.9 | 66.7 | 18 / 35 | 4789 |
| 5 | 1 | 65.9 | 71.1 | 19 / 35 | 5499 |
| 6 | 1 | 67.3 | 78.7 | 21 / 35 | 5593 |
| 7 | 1 | 66.7 | 80.0 | 20 / 35 | 5305 |
| 8 | 1 | 67.8 | 79.7 | 22 / 35 | 5714 |
| 9 | 1 | 62.5 | 62.5 | 16 / 35 | 5091 |
| 10 | 1 | 68.4 | 83.5 | 23 / 35 | 5366 |
| 11 | 1 | 60.9 | 60.3 | 14 / 35 | 5042 |
| 12 | 1 | 61.8 | 64.1 | 18 / 35 | 4674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 150 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 45 | 76% |
| qualidafial.MajorDick 1.0.1 | 18 | 89% |
| germ.TheMind .2 | 13 | 100% |
| awesomeness.Elite 1.0 | 10 | 80% |
| stelo.UntouchableNano 1.3 | 9 | 89% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| sample.Crazy 1.0 | 5 | 100% |

Hadur died in 203 of 420 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 90 | 44% | 211 |
| simonton.nano.WeekendObsession_Melee 1.0 | 44 | 22% | 80 |
| awesomeness.Elite 1.0 | 17 | 8% | 28 |
| germ.TheMind .2 | 15 | 7% | 33 |
| qualidafial.MajorDick 1.0.1 | 13 | 6% | 18 |
| stelo.UntouchableNano 1.3 | 12 | 6% | 21 |
| lrem.micro.MoggFanatic 0.2 | 6 | 3% | 14 |
| mym.EdgeStalker 1.0 | 4 | 2% | 4 |
| sample.Crazy 1.0 | 2 | 1% | 8 |

## Melee bench: F09

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 86.2 | 300 / 420 | 2.25 | 19.5% | 59195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.5% | 300 |
| rz.HawkOnFire 0.1 | 2.2 | 13.2% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.9% | 34 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 21 |
| timmit.nano.TimDog 0.33 | 5.2 | 10.0% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 8.3% | 3 |
| stelo.PatternRobot 1.0 | 7.9 | 7.9% | 12 |
| ratosh.Wesco 1.4 | 8.1 | 8.1% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 22 / 35 | 4733 |
| 2 | 1 | 71.2 | 90.2 | 27 / 35 | 5363 |
| 3 | 1 | 67.9 | 78.7 | 22 / 35 | 4728 |
| 4 | 1 | 70.9 | 90.2 | 26 / 35 | 5251 |
| 5 | 1 | 70.4 | 87.9 | 26 / 35 | 5064 |
| 6 | 1 | 69.4 | 83.8 | 23 / 35 | 4909 |
| 7 | 1 | 68.6 | 84.1 | 20 / 35 | 4966 |
| 8 | 1 | 70.4 | 89.2 | 28 / 35 | 4872 |
| 9 | 1 | 70.9 | 90.8 | 29 / 35 | 4864 |
| 10 | 1 | 69.6 | 85.1 | 26 / 35 | 4810 |
| 11 | 1 | 69.2 | 83.8 | 25 / 35 | 4832 |
| 12 | 1 | 69.2 | 84.8 | 26 / 35 | 4803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 119 | 98% |
| nz.jdc.nano.GridFu 1.0 | 80 | 94% |
| maribo.IotaCT 1.1 | 34 | 79% |
| timmit.nano.TimDog 0.33 | 30 | 80% |
| stelo.PatternRobot 1.0 | 24 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 100% |
| ratosh.Wesco 1.4 | 11 | 91% |
| spinnercat.Omen 1.0 | 10 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 26 | 22% | 62 |
| nz.jdc.nano.GridFu 1.0 | 22 | 18% | 104 |
| rz.HawkOnFire 0.1 | 20 | 17% | 108 |
| stelo.PatternRobot 1.0 | 14 | 12% | 33 |
| ratosh.Wesco 1.4 | 13 | 11% | 24 |
| maribo.IotaCT 1.1 | 11 | 9% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 8% | 22 |
| spinnercat.Omen 1.0 | 3 | 3% | 15 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.7 | 337 / 420 | 1.93 | 21.0% | 75238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.0% | 337 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.0% | 22 |
| baal.nano.N 1.42 | 3.1 | 10.9% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.0% | 6 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 24 |
| sanja.First 0.1 | 6.7 | 8.3% | 5 |
| cvt.Firsty 1.0 | 6.8 | 8.0% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 8.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 23 / 35 | 6094 |
| 2 | 1 | 71.3 | 94.0 | 30 / 35 | 6059 |
| 3 | 1 | 70.4 | 86.0 | 26 / 35 | 6512 |
| 4 | 1 | 71.5 | 93.3 | 30 / 35 | 6216 |
| 5 | 1 | 70.4 | 89.2 | 29 / 35 | 5841 |
| 6 | 1 | 69.5 | 86.0 | 27 / 35 | 6071 |
| 7 | 1 | 70.2 | 83.8 | 26 / 35 | 6389 |
| 8 | 1 | 72.4 | 95.9 | 31 / 35 | 6693 |
| 9 | 1 | 70.8 | 90.8 | 29 / 35 | 6094 |
| 10 | 1 | 71.1 | 88.6 | 27 / 35 | 6624 |
| 11 | 1 | 71.7 | 92.4 | 29 / 35 | 6709 |
| 12 | 1 | 70.8 | 89.2 | 30 / 35 | 5936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 68 | 93% |
| cvt.Firsty 1.0 | 65 | 91% |
| baal.nano.N 1.42 | 61 | 93% |
| sanja.First 0.1 | 41 | 98% |
| zyx.micro.Ant 1.1 | 38 | 95% |
| amk.Punbot.Punbot 0.01 | 36 | 100% |
| Grystrion.TrackerWO 1.0 | 24 | 100% |
| squidM.TentalceMeleeNano 1.1 | 18 | 100% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 85 of 420 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 20% | 74 |
| tvv.nano.Polaris 1.2 | 16 | 19% | 103 |
| Grystrion.TrackerWO 1.0 | 13 | 15% | 41 |
| baal.nano.N 1.42 | 12 | 14% | 59 |
| cvt.Firsty 1.0 | 8 | 9% | 53 |
| sample.RamFire 1.0 | 7 | 8% | 13 |
| amk.Punbot.Punbot 0.01 | 5 | 6% | 15 |
| squidM.TentalceMeleeNano 1.1 | 4 | 5% | 19 |
| sanja.First 0.1 | 3 | 4% | 36 |

## Melee bench: F11

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 67.4 | 144 / 420 | 3.93 | 14.9% | 58500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.5% | 152 |
| hadur117.micro.SaorS1 0.1 | 1.8 | 14.9% | 144 |
| cs.Wren 1.0 | 2.9 | 13.0% | 38 |
| mz.Cork 0.1 | 4.5 | 11.1% | 26 |
| js.PinBall 1.6 | 4.6 | 11.1% | 22 |
| joe.ADinosaur 1.0 | 5.9 | 9.5% | 13 |
| evd.X1 0.01 | 7.1 | 8.0% | 7 |
| jsal.Jsalbot 1.0 | 8.4 | 6.4% | 6 |
| donjezza.Jezza 1.0 | 8.9 | 5.6% | 12 |
| PSW.Relentless 0.1 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 60.6 | 13 / 35 | 4469 |
| 2 | 2 | 62.1 | 65.7 | 13 / 35 | 4845 |
| 3 | 3 | 58.7 | 55.9 | 12 / 35 | 4631 |
| 4 | 1 | 63.3 | 73.0 | 10 / 35 | 4935 |
| 5 | 2 | 59.4 | 58.4 | 9 / 35 | 4637 |
| 6 | 2 | 64.8 | 73.0 | 16 / 35 | 5099 |
| 7 | 1 | 62.6 | 66.3 | 15 / 35 | 4822 |
| 8 | 2 | 61.6 | 67.3 | 8 / 35 | 4695 |
| 9 | 2 | 63.4 | 73.0 | 12 / 35 | 4832 |
| 10 | 2 | 63.7 | 71.7 | 12 / 35 | 5144 |
| 11 | 2 | 61.2 | 64.1 | 11 / 35 | 4641 |
| 12 | 1 | 67.1 | 80.0 | 13 / 35 | 5750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 136 | 53% |
| cs.Wren 1.0 | 38 | 97% |
| js.PinBall 1.6 | 14 | 71% |
| mz.Cork 0.1 | 14 | 79% |
| jsal.Jsalbot 1.0 | 6 | 67% |
| joe.ADinosaur 1.0 | 5 | 100% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 276 of 420 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 136 | 49% | 220 |
| cs.Wren 1.0 | 32 | 12% | 55 |
| joe.ADinosaur 1.0 | 25 | 9% | 27 |
| evd.X1 0.01 | 24 | 9% | 25 |
| mz.Cork 0.1 | 20 | 7% | 33 |
| js.PinBall 1.6 | 17 | 6% | 30 |
| PSW.Relentless 0.1 | 10 | 4% | 12 |
| jsal.Jsalbot 1.0 | 8 | 3% | 12 |
| donjezza.Jezza 1.0 | 4 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.6 | 280 / 420 | 2.48 | 18.9% | 58915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.9% | 280 |
| myl.nano.Graviton 1.10 | 2.9 | 11.4% | 33 |
| ntc.Opposite 1.5 | 3.4 | 11.0% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 4.9 | 10.3% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 11 |
| disan.Chair 2.2.0 | 7.3 | 8.5% | 16 |
| DBall.NUKE 0.1 | 7.4 | 8.1% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 15 |
| pbg.R2D2 1.0 | 9.8 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 27 / 35 | 5166 |
| 2 | 1 | 69.9 | 87.0 | 27 / 35 | 4970 |
| 3 | 1 | 69.4 | 88.3 | 28 / 35 | 4987 |
| 4 | 1 | 68.2 | 85.7 | 22 / 35 | 4683 |
| 5 | 1 | 66.4 | 78.7 | 20 / 35 | 4602 |
| 6 | 1 | 70.5 | 90.5 | 28 / 35 | 5174 |
| 7 | 1 | 69.2 | 88.6 | 21 / 35 | 5129 |
| 8 | 1 | 67.7 | 80.0 | 24 / 35 | 4848 |
| 9 | 1 | 66.7 | 80.6 | 20 / 35 | 4724 |
| 10 | 1 | 67.3 | 78.1 | 23 / 35 | 5103 |
| 11 | 1 | 65.7 | 74.9 | 19 / 35 | 4630 |
| 12 | 1 | 67.4 | 81.3 | 21 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 76 | 87% |
| myl.nano.Graviton 1.10 | 70 | 93% |
| DBall.NUKE 0.1 | 33 | 100% |
| ntc.Opposite 1.5 | 32 | 91% |
| disan.Chair 2.2.0 | 32 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 24 | 96% |
| donjezza.Muncho 1.0 | 18 | 83% |
| pfvicm.Sobieski 7.2.3b | 18 | 94% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 32 | 22% | 54 |
| myl.nano.Graviton 1.10 | 31 | 21% | 87 |
| stelo.AreaTargetingBot 1.1 | 31 | 21% | 79 |
| ntc.Opposite 1.5 | 19 | 13% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 10% | 42 |
| disan.Chair 2.2.0 | 9 | 6% | 26 |
| donjezza.Muncho 1.0 | 4 | 3% | 24 |
| pbg.R2D2 1.0 | 3 | 2% | 11 |
| DBall.NUKE 0.1 | 2 | 1% | 33 |

## Melee bench: F13

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.1 | 169 / 420 | 3.78 | 15.1% | 50095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 15.1% | 169 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 71 |
| oog.melee.Capulet 1.2 | 2.9 | 13.5% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 49 |
| yagami.Tidus 0.11 | 4.6 | 11.9% | 20 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 25 |
| stelo.MirrorNano 1.3 | 7.1 | 8.1% | 3 |
| step.nanoPri 1.0 | 7.9 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 71.4 | 14 / 35 | 4484 |
| 2 | 1 | 60.6 | 63.8 | 12 / 35 | 3782 |
| 3 | 1 | 63.5 | 67.9 | 14 / 35 | 4464 |
| 4 | 3 | 60.6 | 64.1 | 10 / 35 | 3751 |
| 5 | 1 | 66.5 | 76.8 | 20 / 35 | 4150 |
| 6 | 1 | 64.3 | 69.2 | 16 / 35 | 4585 |
| 7 | 1 | 64.6 | 73.0 | 15 / 35 | 4181 |
| 8 | 1 | 62.9 | 70.5 | 14 / 35 | 3763 |
| 9 | 1 | 65.9 | 77.1 | 16 / 35 | 4612 |
| 10 | 1 | 61.5 | 63.2 | 13 / 35 | 4081 |
| 11 | 1 | 64.5 | 73.7 | 13 / 35 | 4247 |
| 12 | 3 | 60.4 | 58.4 | 12 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 63 | 54% |
| kawigi.micro.Shiz 1.1 | 53 | 98% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 89% |
| yagami.Tidus 0.11 | 27 | 93% |
| ejb.Polaris 1.0.1 | 19 | 84% |
| stelo.MirrorNano 1.3 | 3 | 100% |

Hadur died in 251 of 420 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 110 | 44% | 154 |
| yagami.Tidus 0.11 | 35 | 14% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 11% | 70 |
| ejb.Polaris 1.0.1 | 23 | 9% | 45 |
| kawigi.micro.Shiz 1.1 | 18 | 7% | 48 |
| stelo.MirrorNano 1.3 | 17 | 7% | 18 |
| step.nanoPri 1.0 | 12 | 5% | 14 |
| kurios.DOSexe .9a | 8 | 3% | 9 |

## Melee bench: F14

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.8 | 283 / 420 | 2.55 | 18.3% | 56057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.3% | 283 |
| bzdp.Pansy 2.1 | 2.8 | 11.9% | 31 |
| wee.Gem 1.8.4 | 3.3 | 11.6% | 44 |
| wompi.Quokka 1.6 | 3.9 | 11.3% | 27 |
| ratosh.Nobo 0.21 | 4.3 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 5.9 | 9.6% | 14 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 8.9 | 6.0% | 3 |
| maribo.FollowFire 1 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.3 | 24 / 35 | 4602 |
| 2 | 1 | 66.4 | 81.0 | 21 / 35 | 4492 |
| 3 | 1 | 66.8 | 78.1 | 23 / 35 | 4793 |
| 4 | 1 | 68.8 | 87.0 | 26 / 35 | 4858 |
| 5 | 1 | 68.1 | 85.1 | 23 / 35 | 4835 |
| 6 | 1 | 67.6 | 83.8 | 21 / 35 | 4607 |
| 7 | 1 | 70.1 | 92.4 | 29 / 35 | 5001 |
| 8 | 1 | 65.9 | 78.1 | 21 / 35 | 4460 |
| 9 | 1 | 66.1 | 77.1 | 21 / 35 | 4746 |
| 10 | 1 | 70.6 | 96.2 | 30 / 35 | 4784 |
| 11 | 1 | 67.0 | 81.6 | 24 / 35 | 4404 |
| 12 | 1 | 64.2 | 72.1 | 20 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 96 | 95% |
| wee.Gem 1.8.4 | 87 | 93% |
| wompi.Quokka 1.6 | 45 | 91% |
| ratosh.Nobo 0.21 | 28 | 96% |
| bayen.UbaMicro 1.4 | 17 | 88% |
| m3thos.Eva00 1.1 | 17 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 6 | 100% |

Hadur died in 139 of 420 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 24 | 17% | 63 |
| bzdp.Pansy 2.1 | 21 | 15% | 105 |
| ratosh.Nobo 0.21 | 18 | 13% | 47 |
| maribo.FollowFire 1 | 18 | 13% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 16 | 12% | 26 |
| wee.Gem 1.8.4 | 15 | 11% | 91 |
| m3thos.Eva00 1.1 | 11 | 8% | 25 |
| stelo.MyAgileRobot 0.2 | 9 | 6% | 14 |
| bayen.UbaMicro 1.4 | 7 | 5% | 19 |

## Melee bench: F15

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 84.3 | 160 / 420 | 2.41 | 19.7% | 89112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.2% | 222 |
| hadur117.micro.SaorS1 0.1 | 1.5 | 19.7% | 160 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 25 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 2 |
| exauge.GateKeeper 1.1.121g | 5.1 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 3 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 3 |
| drd.Dreadknoght 0.9 | 7.9 | 5.9% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.0 | 80.6 | 13 / 35 | 7257 |
| 2 | 1 | 71.7 | 86.7 | 14 / 35 | 7773 |
| 3 | 1 | 71.8 | 89.8 | 17 / 35 | 7397 |
| 4 | 1 | 70.6 | 84.8 | 13 / 35 | 7459 |
| 5 | 2 | 69.1 | 80.3 | 10 / 35 | 6680 |
| 6 | 2 | 70.4 | 81.0 | 13 / 35 | 7442 |
| 7 | 1 | 71.2 | 87.3 | 15 / 35 | 7481 |
| 8 | 1 | 72.3 | 87.3 | 16 / 35 | 8041 |
| 9 | 1 | 71.5 | 87.6 | 16 / 35 | 7499 |
| 10 | 2 | 70.5 | 83.5 | 12 / 35 | 7476 |
| 11 | 2 | 69.2 | 80.6 | 9 / 35 | 7336 |
| 12 | 2 | 70.2 | 81.9 | 12 / 35 | 7271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 222 | 36% |
| mz.NanoGod 2.02 | 28 | 79% |
| exauge.GateKeeper 1.1.121g | 18 | 100% |
| ayk.WallHugger 1.0 | 14 | 93% |
| drd.Dreadknoght 0.9 | 13 | 100% |
| stelo.PianistNano 1.2 | 9 | 100% |
| stuff.Vlad 0.1 | 6 | 67% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 261 of 420 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 192 | 74% | 276 |
| mz.NanoGod 2.02 | 35 | 13% | 69 |
| ayk.WallHugger 1.0 | 14 | 5% | 24 |
| exauge.GateKeeper 1.1.121g | 8 | 3% | 21 |
| stelo.PianistNano 1.2 | 6 | 2% | 8 |
| stuff.Vlad 0.1 | 4 | 2% | 8 |
| drd.Dreadknoght 0.9 | 2 | 1% | 14 |

## Melee bench: F16

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.5 | 239 / 420 | 3.21 | 17.3% | 59316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.3% | 239 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.2% | 49 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.5% | 34 |
| bvh.micro.Freya 0.3 | 4.0 | 10.9% | 30 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.1% | 31 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 13 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 6 |
| ap.Frederick 1.1 | 8.3 | 7.1% | 12 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 77.8 | 23 / 35 | 5288 |
| 2 | 1 | 64.6 | 70.5 | 18 / 35 | 4952 |
| 3 | 1 | 66.6 | 77.1 | 21 / 35 | 5266 |
| 4 | 1 | 66.7 | 78.4 | 20 / 35 | 4805 |
| 5 | 1 | 66.6 | 78.1 | 19 / 35 | 5075 |
| 6 | 1 | 60.6 | 61.3 | 14 / 35 | 4271 |
| 7 | 1 | 66.7 | 77.1 | 18 / 35 | 5310 |
| 8 | 1 | 66.2 | 77.1 | 20 / 35 | 4990 |
| 9 | 1 | 66.2 | 74.9 | 23 / 35 | 5026 |
| 10 | 1 | 68.1 | 82.5 | 22 / 35 | 5347 |
| 11 | 1 | 65.9 | 77.1 | 20 / 35 | 4606 |
| 12 | 1 | 65.2 | 73.7 | 21 / 35 | 4380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 89 | 93% |
| bvh.micro.Freya 0.3 | 53 | 94% |
| dummy.micro.Sparrow 2.5 | 52 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 47 | 83% |
| ap.Frederick 1.1 | 11 | 100% |
| stelo.MirrorMicro 1.0 | 10 | 70% |
| conscience.Electron 1.3g | 4 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 181 of 420 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 20% | 102 |
| mn.nano.perceptual.Impact 1.3.0 | 28 | 15% | 35 |
| dummy.micro.Sparrow 2.5 | 27 | 15% | 69 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 14% | 78 |
| conscience.Electron 1.3g | 24 | 13% | 37 |
| bvh.micro.Freya 0.3 | 16 | 9% | 46 |
| stelo.MirrorMicro 1.0 | 13 | 7% | 25 |
| dl.BetterWalls 1.0 | 11 | 6% | 27 |

## Melee bench: F17

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 90.4 | 321 / 420 | 1.86 | 21.7% | 83784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.7% | 321 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 28 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 24 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.6% | 13 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 10 |
| dsw.StaticD 1.0 | 6.1 | 8.2% | 9 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.6% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 6 |
| sample.Corners 1.0 | 9.2 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 94.6 | 28 / 35 | 7057 |
| 2 | 1 | 72.0 | 92.1 | 26 / 35 | 6857 |
| 3 | 1 | 71.9 | 90.8 | 30 / 35 | 6501 |
| 4 | 1 | 69.9 | 81.0 | 24 / 35 | 6863 |
| 5 | 1 | 72.8 | 92.4 | 28 / 35 | 7278 |
| 6 | 1 | 71.6 | 88.9 | 24 / 35 | 6980 |
| 7 | 1 | 72.3 | 91.7 | 27 / 35 | 7018 |
| 8 | 1 | 72.7 | 90.2 | 29 / 35 | 7211 |
| 9 | 1 | 72.6 | 97.5 | 29 / 35 | 6726 |
| 10 | 1 | 72.6 | 93.7 | 28 / 35 | 6909 |
| 11 | 1 | 72.7 | 91.1 | 27 / 35 | 7508 |
| 12 | 1 | 69.8 | 81.3 | 21 / 35 | 6876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 125 | 94% |
| sul.Lunar 1.1 | 99 | 98% |
| supersample.SuperBoxBot 1.0 | 54 | 94% |
| dsw.StaticD 1.0 | 19 | 63% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 12 | 92% |
| tlp.ThreeLeggedPig 1 | 11 | 82% |
| mme.NikeEnhanced 2.0 | 10 | 70% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 102 of 420 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 27 | 26% | 137 |
| supersample.SuperBoxBot 1.0 | 27 | 26% | 72 |
| dsw.StaticD 1.0 | 21 | 21% | 41 |
| mme.NikeEnhanced 2.0 | 8 | 8% | 22 |
| sul.Lunar 1.1 | 7 | 7% | 100 |
| tlp.ThreeLeggedPig 1 | 6 | 6% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 15 |
| sample.Corners 1.0 | 2 | 2% | 13 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 11 |

## Melee bench: F18

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 80.6 | 224 / 420 | 2.75 | 18.3% | 73685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.3% | 224 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 52 |
| mld.Wisdom 1.0 | 2.8 | 12.6% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.1 | 11.3% | 43 |
| amz.NanoClone 1.41 | 5.2 | 10.2% | 21 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 22 |
| sample.Walls 1.0 | 7.3 | 7.5% | 10 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.9 | 6.2% | 5 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.6 | 20 / 35 | 6907 |
| 2 | 1 | 66.2 | 77.8 | 17 / 35 | 5528 |
| 3 | 1 | 64.9 | 73.7 | 13 / 35 | 5825 |
| 4 | 1 | 67.2 | 78.1 | 19 / 35 | 6071 |
| 5 | 1 | 69.2 | 84.8 | 22 / 35 | 6311 |
| 6 | 1 | 66.5 | 78.1 | 18 / 35 | 5760 |
| 7 | 1 | 68.2 | 81.3 | 19 / 35 | 6173 |
| 8 | 1 | 69.9 | 84.1 | 23 / 35 | 6958 |
| 9 | 1 | 69.6 | 86.7 | 20 / 35 | 6447 |
| 10 | 1 | 67.4 | 81.6 | 19 / 35 | 5635 |
| 11 | 1 | 68.1 | 78.7 | 19 / 35 | 6385 |
| 12 | 1 | 66.8 | 80.6 | 15 / 35 | 5685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 101 | 85% |
| radnor.DoctorBob 1.42 | 58 | 81% |
| mld.Wisdom 1.0 | 38 | 66% |
| KiraNL.Chupacabra 0.4 | 22 | 73% |
| amz.NanoClone 1.41 | 19 | 74% |
| sample.Walls 1.0 | 14 | 100% |
| jangs.ns51 1.0 | 12 | 92% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 199 of 420 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 62 | 31% | 90 |
| radnor.DoctorBob 1.42 | 38 | 19% | 90 |
| KiraNL.Chupacabra 0.4 | 35 | 18% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 14% | 116 |
| amz.NanoClone 1.41 | 22 | 11% | 33 |
| sample.Walls 1.0 | 7 | 4% | 16 |
| GarmBox.Oranges 1.0 | 4 | 2% | 8 |
| jangs.ns51 1.0 | 3 | 2% | 9 |

