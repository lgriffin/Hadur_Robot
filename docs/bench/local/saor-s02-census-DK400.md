# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.7 | 289 / 420 | 2.11 | 21.2% | 86803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 21.2% | 289 |
| radnor.DoctorBob 1.42 | 2.6 | 14.4% | 43 |
| mz.AntiGrav 1.0 | 2.9 | 13.9% | 30 |
| mld.Infinity 2.2 | 3.5 | 13.3% | 48 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 7 |
| sample.Walls 1.0 | 6.5 | 6.8% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.1% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 96.8 | 29 / 35 | 7880 |
| 2 | 1 | 72.5 | 89.2 | 27 / 35 | 7366 |
| 3 | 1 | 71.8 | 86.3 | 23 / 35 | 7540 |
| 4 | 1 | 71.2 | 85.4 | 23 / 35 | 6951 |
| 5 | 1 | 72.0 | 87.3 | 26 / 35 | 7074 |
| 6 | 1 | 71.8 | 86.7 | 25 / 35 | 7022 |
| 7 | 1 | 71.0 | 84.1 | 21 / 35 | 6774 |
| 8 | 1 | 72.7 | 89.2 | 22 / 35 | 7553 |
| 9 | 1 | 70.3 | 80.6 | 19 / 35 | 7058 |
| 10 | 1 | 72.6 | 90.5 | 26 / 35 | 7222 |
| 11 | 1 | 72.5 | 88.3 | 25 / 35 | 7120 |
| 12 | 1 | 72.1 | 87.6 | 23 / 35 | 7243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 114 | 98% |
| mld.Infinity 2.2 | 102 | 84% |
| radnor.DoctorBob 1.42 | 75 | 85% |
| amz.NanoClone 1.41 | 9 | 100% |
| jangs.ns51 1.0 | 6 | 83% |
| sample.Target 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 132 of 420 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 60 | 45% | 170 |
| mz.AntiGrav 1.0 | 24 | 18% | 148 |
| mld.Infinity 2.2 | 23 | 17% | 28 |
| amz.NanoClone 1.41 | 12 | 9% | 27 |
| sample.Walls 1.0 | 6 | 5% | 20 |
| jangs.ns51 1.0 | 3 | 2% | 11 |
| arthord.MannyPacquiao Beta | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.7 | 241 / 420 | 2.56 | 18.3% | 62462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.3 | 18.3% | 241 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.5% | 109 |
| mld.DustBunny 3.8 | 2.7 | 13.4% | 29 |
| maribo.melee.BMV 0.1 | 4.5 | 10.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 13 |
| zyx.nano.Ant 1.1 | 5.9 | 8.7% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 13 |
| fullsail.SweetTea 1.1 | 7.7 | 7.5% | 7 |
| bzdp.BoxCar 2.0 | 8.2 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 22 / 35 | 5188 |
| 2 | 1 | 70.4 | 92.7 | 23 / 35 | 5435 |
| 3 | 1 | 68.6 | 86.3 | 24 / 35 | 5058 |
| 4 | 1 | 70.0 | 90.2 | 23 / 35 | 5709 |
| 5 | 1 | 69.7 | 90.8 | 22 / 35 | 5476 |
| 6 | 1 | 69.7 | 90.5 | 28 / 35 | 5065 |
| 7 | 1 | 68.9 | 84.8 | 24 / 35 | 5550 |
| 8 | 1 | 69.0 | 90.2 | 21 / 35 | 5446 |
| 9 | 1 | 68.5 | 84.1 | 21 / 35 | 5328 |
| 10 | 3 | 59.6 | 55.6 | 8 / 35 | 4318 |
| 11 | 1 | 66.5 | 79.0 | 18 / 35 | 5132 |
| 12 | 3 | 61.7 | 61.3 | 7 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 142 | 64% |
| mld.DustBunny 3.8 | 98 | 92% |
| djdjdj.NanoSkunk10 1.0 | 18 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 86% |
| maribo.melee.BMV 0.1 | 12 | 83% |
| fullsail.SweetTea 1.1 | 11 | 91% |
| zyx.nano.Ant 1.1 | 8 | 88% |
| bzdp.BoxCar 2.0 | 4 | 75% |

Hadur died in 179 of 420 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 40% | 164 |
| mld.DustBunny 3.8 | 32 | 18% | 105 |
| zyx.nano.Ant 1.1 | 20 | 11% | 27 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 7% | 30 |
| maribo.melee.BMV 0.1 | 11 | 6% | 27 |
| cs.Grudge 1.0 | 11 | 6% | 12 |
| fullsail.SweetTea 1.1 | 9 | 5% | 18 |
| djdjdj.NanoSkunk10 1.0 | 8 | 4% | 29 |
| bzdp.BoxCar 2.0 | 4 | 2% | 7 |

## Melee bench: F03

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.7 | 284 / 420 | 2.37 | 20.1% | 73567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 20.1% | 284 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 59 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.3% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.2% | 28 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.8% | 23 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.9 | 7.3% | 8 |
| sample.Fire 1.0 | 9.5 | 4.6% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.8 | 23 / 35 | 5836 |
| 2 | 1 | 69.7 | 81.9 | 25 / 35 | 5918 |
| 3 | 1 | 71.5 | 88.6 | 25 / 35 | 6752 |
| 4 | 1 | 69.6 | 85.4 | 23 / 35 | 5757 |
| 5 | 1 | 68.7 | 79.4 | 20 / 35 | 5878 |
| 6 | 1 | 70.9 | 86.7 | 24 / 35 | 6311 |
| 7 | 1 | 71.0 | 86.3 | 26 / 35 | 6332 |
| 8 | 1 | 68.0 | 77.5 | 20 / 35 | 5700 |
| 9 | 1 | 70.6 | 87.9 | 26 / 35 | 6155 |
| 10 | 1 | 71.9 | 93.0 | 25 / 35 | 6317 |
| 11 | 1 | 69.6 | 81.6 | 24 / 35 | 6184 |
| 12 | 1 | 70.5 | 83.8 | 23 / 35 | 6427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 110 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 65 | 92% |
| cb.nano.Insomnia 1.0 | 38 | 82% |
| sp.Nanos.Ember 1.1 | 36 | 94% |
| myl.nano.KomoriNinja 1.1 | 31 | 90% |
| fm.mammillarias 1.3 | 17 | 94% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 5 | 80% |

Hadur died in 136 of 420 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 30 | 22% | 82 |
| cb.nano.Insomnia 1.0 | 30 | 22% | 31 |
| myl.micro.Troodon 1.10 | 28 | 21% | 131 |
| fm.mammillarias 1.3 | 16 | 12% | 27 |
| myl.nano.KomoriNinja 1.1 | 12 | 9% | 66 |
| sp.Nanos.Ember 1.1 | 6 | 4% | 38 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 27 |
| sample.Fire 1.0 | 5 | 4% | 11 |
| sample.Tracker 1.0 | 3 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 82.8 | 268 / 420 | 2.55 | 19.6% | 76001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 19.6% | 268 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.1% | 45 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 9.1% | 1 |
| tj.zombie1n 1.0.1 | 5.5 | 9.1% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.6 | 9.2% | 37 |
| yk.JahMicro 1.0 | 6.4 | 8.5% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 7.1 | 7.8% | 10 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 26 / 35 | 6999 |
| 2 | 1 | 65.5 | 70.8 | 18 / 35 | 5337 |
| 3 | 1 | 70.7 | 85.4 | 25 / 35 | 6758 |
| 4 | 1 | 69.1 | 84.1 | 21 / 35 | 6239 |
| 5 | 1 | 70.5 | 87.6 | 23 / 35 | 6677 |
| 6 | 1 | 67.8 | 75.2 | 22 / 35 | 6312 |
| 7 | 1 | 68.2 | 80.0 | 21 / 35 | 6192 |
| 8 | 1 | 67.2 | 76.5 | 18 / 35 | 5891 |
| 9 | 1 | 68.8 | 83.5 | 21 / 35 | 6048 |
| 10 | 1 | 71.8 | 91.1 | 26 / 35 | 6892 |
| 11 | 1 | 68.8 | 81.9 | 22 / 35 | 6232 |
| 12 | 1 | 69.9 | 85.4 | 25 / 35 | 6424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 104 | 80% |
| stelo.SoJNanoMelee 1.1 | 78 | 88% |
| tvv.micro.Antares 1.1.1 | 33 | 94% |
| tj.zombie1n 1.0.1 | 31 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 83% |
| yk.JahMicro 1.0 | 20 | 75% |
| repositorio.NanoStep 1.0 | 12 | 92% |
| sample.VelociRobot 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |

Hadur died in 153 of 420 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 38% | 168 |
| stelo.SoJNanoMelee 1.1 | 34 | 22% | 75 |
| tvv.micro.Antares 1.1.1 | 16 | 10% | 50 |
| Grystrion.RandomTrackerNOREV 1.0 | 12 | 8% | 17 |
| yk.JahMicro 1.0 | 11 | 7% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 7% | 39 |
| tj.zombie1n 1.0.1 | 9 | 6% | 14 |
| repositorio.NanoStep 1.0 | 2 | 1% | 22 |
| sample.VelociRobot 1.0 | 1 | 1% | 13 |

## Melee bench: F05

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.2 | 192 / 420 | 3.68 | 16.0% | 58667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 16.0% | 192 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 64 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 55 |
| simonton.nano.MeleeSeed 1.8 | 3.9 | 11.1% | 50 |
| EBBU.Sim2 1.02 | 5.1 | 10.1% | 17 |
| sam.Samspin 1.0 | 6.1 | 9.5% | 17 |
| zyx.nano.BacillusComma 1.0 | 6.9 | 8.9% | 19 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.6% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.5% | 1 |
| sample.TrackFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 69.2 | 14 / 35 | 4624 |
| 2 | 1 | 61.5 | 64.4 | 14 / 35 | 4613 |
| 3 | 1 | 66.7 | 79.7 | 20 / 35 | 4948 |
| 4 | 1 | 65.9 | 78.4 | 19 / 35 | 5031 |
| 5 | 1 | 59.9 | 59.0 | 12 / 35 | 4483 |
| 6 | 1 | 62.7 | 64.8 | 13 / 35 | 4832 |
| 7 | 1 | 65.1 | 74.6 | 16 / 35 | 5430 |
| 8 | 1 | 65.0 | 71.7 | 17 / 35 | 5196 |
| 9 | 1 | 63.6 | 68.6 | 15 / 35 | 4916 |
| 10 | 1 | 60.7 | 60.3 | 16 / 35 | 4677 |
| 11 | 1 | 63.1 | 69.8 | 13 / 35 | 4851 |
| 12 | 1 | 67.3 | 81.9 | 23 / 35 | 5066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 70 | 86% |
| oog.melee.Corsair 1.0 | 51 | 67% |
| ahf.NanoAndrew .4 | 46 | 67% |
| EBBU.Sim2 1.02 | 28 | 93% |
| sam.Samspin 1.0 | 18 | 100% |
| robar.nano.Assertive_Melee 0.2 | 12 | 100% |
| sample.TrackFire 1.0 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |

Hadur died in 228 of 420 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 18% | 84 |
| ahf.NanoAndrew .4 | 41 | 18% | 86 |
| oog.melee.Corsair 1.0 | 38 | 17% | 83 |
| robar.nano.Assertive_Melee 0.2 | 29 | 13% | 42 |
| zyx.nano.BacillusComma 1.0 | 27 | 12% | 36 |
| EBBU.Sim2 1.02 | 19 | 8% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 7% | 17 |
| sample.TrackFire 1.0 | 9 | 4% | 12 |
| sam.Samspin 1.0 | 8 | 4% | 21 |

## Melee bench: F06

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.5 | 282 / 420 | 2.22 | 19.4% | 64637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 19.4% | 282 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 44 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 31 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 31 |
| arthord.NanoSatanMelee Beta | 5.3 | 8.9% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.5% | 12 |
| fm.claire 1.7 | 6.3 | 8.1% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 5 |
| pa.Improved 1.0 | 9.3 | 5.8% | 4 |
| kurios.DOSexe .9b | 9.6 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.0 | 25 / 35 | 5911 |
| 2 | 1 | 70.2 | 89.2 | 26 / 35 | 5585 |
| 3 | 1 | 69.9 | 89.2 | 28 / 35 | 5242 |
| 4 | 1 | 70.4 | 89.8 | 27 / 35 | 5481 |
| 5 | 1 | 69.4 | 88.6 | 22 / 35 | 5671 |
| 6 | 1 | 68.2 | 83.8 | 20 / 35 | 5321 |
| 7 | 1 | 67.3 | 80.3 | 22 / 35 | 5122 |
| 8 | 1 | 69.2 | 89.5 | 27 / 35 | 4886 |
| 9 | 1 | 66.5 | 78.7 | 16 / 35 | 5346 |
| 10 | 1 | 70.7 | 92.7 | 26 / 35 | 5694 |
| 11 | 1 | 66.2 | 78.1 | 18 / 35 | 5083 |
| 12 | 1 | 69.9 | 90.8 | 25 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 129 | 88% |
| oog.melee.CapuletDroid 1.1 | 67 | 84% |
| gh.nano.Grofvuil 0.2 | 51 | 88% |
| arthord.NanoSatanMelee Beta | 26 | 92% |
| sample.SpinBot 1.0 | 13 | 100% |
| winamp32.micro.MicroMacro 1.0 | 12 | 75% |
| fm.claire 1.7 | 10 | 80% |
| kurios.DOSexe .9b | 9 | 89% |
| pa.Improved 1.0 | 6 | 67% |

Hadur died in 140 of 420 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 25% | 161 |
| gh.nano.Grofvuil 0.2 | 31 | 22% | 86 |
| oog.melee.CapuletDroid 1.1 | 27 | 19% | 33 |
| kurios.DOSexe .9b | 10 | 7% | 32 |
| arthord.NanoSatanMelee Beta | 8 | 6% | 28 |
| winamp32.micro.MicroMacro 1.0 | 7 | 5% | 24 |
| fm.claire 1.7 | 7 | 5% | 19 |
| sample.SpinBot 1.0 | 7 | 5% | 12 |
| pa.Improved 1.0 | 6 | 4% | 18 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.1 | 157 / 420 | 2.70 | 17.8% | 67134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 17.8% | 157 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.3% | 99 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.6% | 51 |
| mz.MicroGodMelee 1 | 3.5 | 13.2% | 93 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 12 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.6% | 2 |
| el.JumpShoot 0.2 | 7.4 | 6.4% | 5 |
| acogdev.alpha 0.2 | 8.2 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.7 | 11 / 35 | 5820 |
| 2 | 1 | 68.9 | 88.9 | 14 / 35 | 5726 |
| 3 | 1 | 66.5 | 81.3 | 13 / 35 | 5203 |
| 4 | 1 | 66.9 | 79.4 | 12 / 35 | 5411 |
| 5 | 1 | 65.9 | 78.4 | 12 / 35 | 5429 |
| 6 | 1 | 65.4 | 74.0 | 13 / 35 | 5527 |
| 7 | 1 | 68.2 | 82.9 | 11 / 35 | 5997 |
| 8 | 1 | 67.9 | 81.3 | 15 / 35 | 5572 |
| 9 | 1 | 65.3 | 77.8 | 10 / 35 | 5318 |
| 10 | 1 | 67.2 | 80.0 | 14 / 35 | 5539 |
| 11 | 1 | 70.3 | 91.4 | 17 / 35 | 5979 |
| 12 | 1 | 67.2 | 78.1 | 15 / 35 | 5613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 92 | 86% |
| mz.MicroGodMelee 1 | 83 | 30% |
| gh.micro.Gruweltje 0.7 | 68 | 15% |
| DBall.Anarchy 0.1 | 22 | 95% |
| el.JumpShoot 0.2 | 10 | 80% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |

Hadur died in 263 of 420 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 95 | 36% | 116 |
| mz.MicroGodMelee 1 | 91 | 35% | 128 |
| spinnercat.micro.Tyger 0.1 | 46 | 17% | 99 |
| acogdev.alpha 0.2 | 8 | 3% | 12 |
| caimano.Furia_Ceca 0.22 | 6 | 2% | 13 |
| DBall.Anarchy 0.1 | 5 | 2% | 25 |
| el.JumpShoot 0.2 | 5 | 2% | 9 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 12 |
| fire219.CatBot 1.0 | 3 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.2 | 199 / 420 | 3.59 | 16.4% | 61841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.3 | 16.4% | 199 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.0% | 80 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 74 |
| germ.TheMind .2 | 5.2 | 9.4% | 20 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 13 |
| awesomeness.Elite 1.0 | 5.3 | 9.0% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 3 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 11 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.0 | 11 / 35 | 5036 |
| 2 | 1 | 66.9 | 79.7 | 21 / 35 | 5326 |
| 3 | 2 | 63.1 | 67.3 | 15 / 35 | 4821 |
| 4 | 1 | 63.3 | 67.9 | 18 / 35 | 4867 |
| 5 | 1 | 64.4 | 70.8 | 17 / 35 | 5041 |
| 6 | 1 | 67.3 | 78.1 | 16 / 35 | 5734 |
| 7 | 1 | 64.2 | 69.8 | 19 / 35 | 4983 |
| 8 | 3 | 62.3 | 66.0 | 12 / 35 | 4819 |
| 9 | 1 | 62.5 | 64.1 | 17 / 35 | 4821 |
| 10 | 1 | 66.3 | 74.9 | 20 / 35 | 5299 |
| 11 | 1 | 66.3 | 76.5 | 16 / 35 | 5434 |
| 12 | 1 | 66.1 | 72.4 | 17 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 149 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 37 | 62% |
| qualidafial.MajorDick 1.0.1 | 24 | 96% |
| germ.TheMind .2 | 21 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 63% |
| awesomeness.Elite 1.0 | 8 | 75% |
| sample.Crazy 1.0 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |

Hadur died in 224 of 420 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 105 | 47% | 209 |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 21% | 70 |
| germ.TheMind .2 | 15 | 7% | 38 |
| awesomeness.Elite 1.0 | 15 | 7% | 23 |
| stelo.UntouchableNano 1.3 | 12 | 5% | 18 |
| lrem.micro.MoggFanatic 0.2 | 10 | 4% | 20 |
| mym.EdgeStalker 1.0 | 9 | 4% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 16 |
| sample.Crazy 1.0 | 2 | 1% | 10 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.9 | 282 / 420 | 2.27 | 19.4% | 59875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 19.4% | 282 |
| rz.HawkOnFire 0.1 | 2.3 | 13.5% | 30 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 12.3% | 36 |
| maribo.IotaCT 1.1 | 4.1 | 10.6% | 22 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.2% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 8.1% | 16 |
| ratosh.Wesco 1.4 | 7.9 | 8.1% | 6 |
| spinnercat.Omen 1.0 | 7.9 | 8.2% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 24 / 35 | 5421 |
| 2 | 1 | 70.5 | 90.2 | 26 / 35 | 4794 |
| 3 | 1 | 69.8 | 88.3 | 23 / 35 | 4886 |
| 4 | 1 | 68.5 | 82.2 | 24 / 35 | 4783 |
| 5 | 1 | 69.3 | 82.5 | 22 / 35 | 5349 |
| 6 | 1 | 69.1 | 85.7 | 22 / 35 | 4761 |
| 7 | 1 | 70.9 | 88.3 | 28 / 35 | 5153 |
| 8 | 1 | 69.1 | 84.1 | 23 / 35 | 4721 |
| 9 | 1 | 69.2 | 84.1 | 23 / 35 | 4922 |
| 10 | 1 | 68.5 | 82.2 | 22 / 35 | 5244 |
| 11 | 1 | 68.9 | 82.5 | 20 / 35 | 5223 |
| 12 | 1 | 69.4 | 87.3 | 25 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 119 | 95% |
| nz.jdc.nano.GridFu 1.0 | 77 | 86% |
| stelo.PatternRobot 1.0 | 33 | 85% |
| timmit.nano.TimDog 0.33 | 22 | 77% |
| maribo.IotaCT 1.1 | 22 | 82% |
| spinnercat.Omen 1.0 | 15 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 100% |
| ratosh.Wesco 1.4 | 12 | 92% |

Hadur died in 138 of 420 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 32 | 23% | 108 |
| timmit.nano.TimDog 0.33 | 30 | 22% | 55 |
| rz.HawkOnFire 0.1 | 28 | 20% | 108 |
| stelo.PatternRobot 1.0 | 20 | 14% | 37 |
| maribo.IotaCT 1.1 | 11 | 8% | 43 |
| ratosh.Wesco 1.4 | 10 | 7% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 21 |
| spinnercat.Omen 1.0 | 2 | 1% | 16 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.3 | 325 / 420 | 1.87 | 21.1% | 77698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 21.1% | 325 |
| tvv.nano.Polaris 1.2 | 2.4 | 11.9% | 42 |
| baal.nano.N 1.42 | 3.0 | 11.2% | 10 |
| zyx.micro.Ant 1.1 | 4.7 | 9.6% | 14 |
| Grystrion.TrackerWO 1.0 | 4.9 | 9.6% | 5 |
| sanja.First 0.1 | 5.9 | 8.4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.4% | 15 |
| amk.Punbot.Punbot 0.01 | 8.8 | 6.9% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 23 / 35 | 6238 |
| 2 | 1 | 69.8 | 86.3 | 26 / 35 | 6260 |
| 3 | 1 | 71.6 | 93.7 | 29 / 35 | 6383 |
| 4 | 1 | 71.3 | 91.7 | 28 / 35 | 6497 |
| 5 | 1 | 71.2 | 88.9 | 28 / 35 | 6812 |
| 6 | 1 | 72.1 | 94.9 | 28 / 35 | 6835 |
| 7 | 1 | 68.7 | 84.1 | 23 / 35 | 5480 |
| 8 | 1 | 71.3 | 92.7 | 29 / 35 | 6351 |
| 9 | 1 | 72.2 | 95.2 | 31 / 35 | 6692 |
| 10 | 1 | 70.0 | 86.7 | 26 / 35 | 6346 |
| 11 | 1 | 70.1 | 86.7 | 25 / 35 | 6316 |
| 12 | 1 | 73.2 | 95.2 | 29 / 35 | 7488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 71 | 94% |
| tvv.nano.Polaris 1.2 | 66 | 76% |
| cvt.Firsty 1.0 | 54 | 91% |
| sanja.First 0.1 | 50 | 94% |
| zyx.micro.Ant 1.1 | 38 | 92% |
| amk.Punbot.Punbot 0.01 | 35 | 100% |
| Grystrion.TrackerWO 1.0 | 24 | 100% |
| sample.RamFire 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |

Hadur died in 95 of 420 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 26 | 27% | 109 |
| zyx.micro.Ant 1.1 | 21 | 22% | 80 |
| baal.nano.N 1.42 | 14 | 15% | 60 |
| Grystrion.TrackerWO 1.0 | 10 | 11% | 39 |
| cvt.Firsty 1.0 | 8 | 8% | 43 |
| sanja.First 0.1 | 7 | 7% | 47 |
| sample.RamFire 1.0 | 5 | 5% | 11 |
| amk.Punbot.Punbot 0.01 | 3 | 3% | 9 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 11 |

## Melee bench: F11

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 68.9 | 134 / 420 | 3.80 | 15.2% | 60739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.4 | 15.2% | 134 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 164 |
| cs.Wren 1.0 | 3.2 | 12.3% | 32 |
| mz.Cork 0.1 | 4.0 | 11.5% | 35 |
| js.PinBall 1.6 | 5.1 | 10.5% | 26 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 7 |
| evd.X1 0.01 | 7.0 | 8.3% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 9 |
| donjezza.Jezza 1.0 | 9.1 | 5.5% | 7 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 57.8 | 6 / 35 | 4500 |
| 2 | 1 | 64.2 | 69.2 | 16 / 35 | 5493 |
| 3 | 1 | 63.3 | 71.7 | 13 / 35 | 4770 |
| 4 | 1 | 65.7 | 78.1 | 12 / 35 | 5325 |
| 5 | 1 | 62.0 | 66.0 | 12 / 35 | 5030 |
| 6 | 2 | 61.8 | 66.7 | 6 / 35 | 5006 |
| 7 | 2 | 64.5 | 74.6 | 9 / 35 | 5343 |
| 8 | 2 | 62.6 | 67.0 | 11 / 35 | 5134 |
| 9 | 1 | 63.3 | 69.2 | 15 / 35 | 4760 |
| 10 | 2 | 61.6 | 64.4 | 11 / 35 | 5025 |
| 11 | 1 | 63.5 | 71.4 | 12 / 35 | 5192 |
| 12 | 1 | 63.4 | 70.2 | 11 / 35 | 5161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 134 | 41% |
| cs.Wren 1.0 | 41 | 93% |
| mz.Cork 0.1 | 18 | 89% |
| js.PinBall 1.6 | 14 | 50% |
| jsal.Jsalbot 1.0 | 13 | 69% |
| donjezza.Jezza 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 288 of 420 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 137 | 48% | 200 |
| js.PinBall 1.6 | 31 | 11% | 41 |
| evd.X1 0.01 | 27 | 9% | 32 |
| mz.Cork 0.1 | 22 | 8% | 38 |
| joe.ADinosaur 1.0 | 22 | 8% | 25 |
| cs.Wren 1.0 | 19 | 7% | 42 |
| PSW.Relentless 0.1 | 16 | 6% | 16 |
| jsal.Jsalbot 1.0 | 10 | 3% | 18 |
| donjezza.Jezza 1.0 | 4 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.1 | 259 / 420 | 2.70 | 18.5% | 59226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 18.5% | 259 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 19 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.1% | 44 |
| myl.nano.Graviton 1.10 | 3.9 | 10.8% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.1 | 10.0% | 16 |
| disan.Chair 2.2.0 | 6.8 | 8.8% | 14 |
| DBall.NUKE 0.1 | 7.7 | 7.6% | 8 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 16 |
| pbg.R2D2 1.0 | 9.6 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.5 | 18 / 35 | 4995 |
| 2 | 1 | 69.4 | 86.7 | 25 / 35 | 5225 |
| 3 | 1 | 69.4 | 88.6 | 23 / 35 | 5189 |
| 4 | 1 | 66.6 | 77.5 | 18 / 35 | 5063 |
| 5 | 1 | 66.0 | 76.5 | 19 / 35 | 4656 |
| 6 | 1 | 68.9 | 85.7 | 21 / 35 | 5467 |
| 7 | 1 | 67.1 | 77.5 | 24 / 35 | 4799 |
| 8 | 1 | 66.1 | 74.9 | 18 / 35 | 4852 |
| 9 | 1 | 66.7 | 80.3 | 22 / 35 | 4512 |
| 10 | 1 | 66.6 | 78.7 | 21 / 35 | 4511 |
| 11 | 1 | 69.2 | 86.3 | 26 / 35 | 5107 |
| 12 | 1 | 68.0 | 82.9 | 24 / 35 | 4850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 79 | 89% |
| myl.nano.Graviton 1.10 | 57 | 91% |
| ntc.Opposite 1.5 | 36 | 94% |
| disan.Chair 2.2.0 | 35 | 83% |
| DBall.NUKE 0.1 | 24 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 91% |
| donjezza.Muncho 1.0 | 20 | 65% |
| pfvicm.Sobieski 7.2.3b | 13 | 85% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 164 of 420 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 35 | 21% | 53 |
| stelo.AreaTargetingBot 1.1 | 28 | 17% | 78 |
| lrem.micro.SpikeSoldier 0.4 | 27 | 16% | 69 |
| ntc.Opposite 1.5 | 26 | 16% | 48 |
| myl.nano.Graviton 1.10 | 20 | 12% | 71 |
| disan.Chair 2.2.0 | 9 | 5% | 25 |
| donjezza.Muncho 1.0 | 9 | 5% | 22 |
| DBall.NUKE 0.1 | 6 | 4% | 36 |
| pbg.R2D2 1.0 | 3 | 2% | 14 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.3 | 148 / 420 | 3.94 | 14.8% | 49899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.3 | 14.8% | 148 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 80 |
| oog.melee.Capulet 1.2 | 2.8 | 13.9% | 97 |
| yagami.Tidus 0.11 | 4.0 | 12.4% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 57 |
| ejb.Polaris 1.0.1 | 5.9 | 10.3% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 1 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 67.0 | 9 / 35 | 3884 |
| 2 | 1 | 64.2 | 70.8 | 14 / 35 | 4211 |
| 3 | 1 | 63.3 | 67.3 | 14 / 35 | 4311 |
| 4 | 1 | 65.2 | 74.0 | 15 / 35 | 4391 |
| 5 | 1 | 62.2 | 64.8 | 11 / 35 | 4207 |
| 6 | 1 | 63.5 | 68.3 | 14 / 35 | 4512 |
| 7 | 1 | 61.1 | 62.5 | 11 / 35 | 3942 |
| 8 | 2 | 60.4 | 61.6 | 10 / 35 | 3854 |
| 9 | 1 | 62.7 | 66.0 | 15 / 35 | 4226 |
| 10 | 1 | 63.5 | 69.2 | 14 / 35 | 4008 |
| 11 | 3 | 61.6 | 64.1 | 10 / 35 | 4136 |
| 12 | 1 | 64.1 | 72.1 | 11 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 45% |
| kawigi.micro.Shiz 1.1 | 54 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 70% |
| yagami.Tidus 0.11 | 36 | 100% |
| ejb.Polaris 1.0.1 | 9 | 78% |

Hadur died in 273 of 420 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 110 | 40% | 143 |
| yagami.Tidus 0.11 | 40 | 15% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 13% | 62 |
| kawigi.micro.Shiz 1.1 | 30 | 11% | 67 |
| stelo.MirrorNano 1.3 | 20 | 7% | 21 |
| ejb.Polaris 1.0.1 | 18 | 7% | 31 |
| step.nanoPri 1.0 | 13 | 5% | 18 |
| kurios.DOSexe .9a | 7 | 3% | 9 |

## Melee bench: F14

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.0 | 237 / 420 | 2.89 | 17.2% | 53487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 17.2% | 237 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 45 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 62 |
| wompi.Quokka 1.6 | 4.3 | 11.2% | 34 |
| ratosh.Nobo 0.21 | 4.6 | 10.7% | 14 |
| m3thos.Eva00 1.1 | 5.7 | 9.8% | 19 |
| bayen.UbaMicro 1.4 | 6.9 | 8.8% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 78.7 | 18 / 35 | 4373 |
| 2 | 1 | 65.6 | 77.5 | 19 / 35 | 4604 |
| 3 | 1 | 64.6 | 73.3 | 19 / 35 | 4417 |
| 4 | 1 | 66.1 | 77.5 | 21 / 35 | 4729 |
| 5 | 1 | 67.1 | 82.5 | 20 / 35 | 4711 |
| 6 | 1 | 66.6 | 82.2 | 22 / 35 | 4253 |
| 7 | 1 | 66.8 | 84.4 | 20 / 35 | 4128 |
| 8 | 1 | 64.5 | 74.3 | 15 / 35 | 4563 |
| 9 | 1 | 67.5 | 84.1 | 24 / 35 | 4477 |
| 10 | 1 | 66.6 | 82.5 | 22 / 35 | 4543 |
| 11 | 1 | 66.0 | 79.4 | 22 / 35 | 4383 |
| 12 | 1 | 63.2 | 72.1 | 15 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 97 | 88% |
| wee.Gem 1.8.4 | 71 | 77% |
| wompi.Quokka 1.6 | 42 | 81% |
| m3thos.Eva00 1.1 | 23 | 96% |
| ratosh.Nobo 0.21 | 22 | 86% |
| bayen.UbaMicro 1.4 | 17 | 88% |
| stelo.MyAgileRobot 0.2 | 6 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 31 | 17% | 110 |
| wompi.Quokka 1.6 | 29 | 16% | 61 |
| wee.Gem 1.8.4 | 28 | 15% | 77 |
| ratosh.Nobo 0.21 | 24 | 13% | 49 |
| jeremyreeder.Vincent 2011.12.09 | 19 | 10% | 23 |
| bayen.UbaMicro 1.4 | 14 | 8% | 29 |
| maribo.FollowFire 1 | 14 | 8% | 14 |
| stelo.MyAgileRobot 0.2 | 13 | 7% | 15 |
| m3thos.Eva00 1.1 | 12 | 7% | 32 |

## Melee bench: F15

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 82.4 | 128 / 420 | 2.58 | 19.2% | 87490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.6% | 252 |
| hadur117.micro.SaorDK400 0.1 | 1.7 | 19.2% | 128 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 29 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 8 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.9 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.6 | 80.3 | 12 / 35 | 7314 |
| 2 | 1 | 70.5 | 82.2 | 12 / 35 | 7645 |
| 3 | 1 | 70.7 | 87.0 | 13 / 35 | 7113 |
| 4 | 2 | 69.2 | 79.4 | 8 / 35 | 7109 |
| 5 | 2 | 69.8 | 79.7 | 9 / 35 | 7366 |
| 6 | 2 | 68.9 | 78.4 | 8 / 35 | 7118 |
| 7 | 2 | 70.5 | 83.8 | 9 / 35 | 7635 |
| 8 | 2 | 68.0 | 76.5 | 8 / 35 | 6802 |
| 9 | 1 | 71.9 | 86.7 | 13 / 35 | 8050 |
| 10 | 2 | 70.5 | 85.7 | 11 / 35 | 7132 |
| 11 | 2 | 68.0 | 78.7 | 8 / 35 | 6494 |
| 12 | 1 | 73.0 | 90.8 | 17 / 35 | 7712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 217 | 29% |
| mz.NanoGod 2.02 | 33 | 73% |
| exauge.GateKeeper 1.1.121g | 17 | 88% |
| ayk.WallHugger 1.0 | 11 | 91% |
| stelo.PianistNano 1.2 | 7 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 294 of 420 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 206 | 70% | 277 |
| mz.NanoGod 2.02 | 51 | 17% | 77 |
| exauge.GateKeeper 1.1.121g | 17 | 6% | 26 |
| ayk.WallHugger 1.0 | 14 | 5% | 21 |
| stelo.PianistNano 1.2 | 4 | 1% | 9 |
| stuff.Vlad 0.1 | 1 | 0% | 5 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.8 | 237 / 420 | 3.00 | 17.5% | 58674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 17.5% | 237 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 34 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 42 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.4 | 10.9% | 33 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 17 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 22 |
| dl.BetterWalls 1.0 | 9.0 | 6.5% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.5 | 22 / 35 | 5078 |
| 2 | 1 | 66.5 | 78.1 | 24 / 35 | 4830 |
| 3 | 1 | 62.6 | 66.3 | 13 / 35 | 4487 |
| 4 | 1 | 66.9 | 79.0 | 21 / 35 | 5020 |
| 5 | 1 | 66.1 | 74.6 | 19 / 35 | 5126 |
| 6 | 1 | 66.0 | 77.5 | 19 / 35 | 4601 |
| 7 | 1 | 66.0 | 77.1 | 19 / 35 | 4770 |
| 8 | 1 | 69.6 | 93.0 | 25 / 35 | 4973 |
| 9 | 1 | 67.4 | 81.6 | 21 / 35 | 5174 |
| 10 | 1 | 65.8 | 75.6 | 17 / 35 | 5014 |
| 11 | 1 | 64.9 | 73.3 | 20 / 35 | 4586 |
| 12 | 1 | 65.1 | 74.0 | 17 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 91 | 92% |
| dummy.micro.Sparrow 2.5 | 63 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 47 | 72% |
| bvh.micro.Freya 0.3 | 45 | 91% |
| stelo.MirrorMicro 1.0 | 13 | 54% |
| ap.Frederick 1.1 | 10 | 100% |
| conscience.Electron 1.3g | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 187 of 420 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 17% | 95 |
| dummy.micro.Sparrow 2.5 | 30 | 16% | 85 |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 15% | 71 |
| conscience.Electron 1.3g | 26 | 14% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 11% | 21 |
| bvh.micro.Freya 0.3 | 18 | 10% | 44 |
| stelo.MirrorMicro 1.0 | 18 | 10% | 34 |
| dl.BetterWalls 1.0 | 14 | 7% | 31 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.2 | 295 / 420 | 2.33 | 20.7% | 81843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 20.7% | 295 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.0% | 41 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 24 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 20 |
| mme.NikeEnhanced 2.0 | 5.1 | 9.3% | 8 |
| dsw.StaticD 1.0 | 5.9 | 8.9% | 11 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.4 | 6.3% | 7 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 12 |
| sample.Corners 1.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 90.8 | 25 / 35 | 7218 |
| 2 | 1 | 70.9 | 84.8 | 27 / 35 | 6828 |
| 3 | 1 | 72.4 | 90.5 | 27 / 35 | 7302 |
| 4 | 1 | 71.8 | 87.0 | 25 / 35 | 7010 |
| 5 | 1 | 70.4 | 81.9 | 24 / 35 | 6728 |
| 6 | 1 | 69.4 | 82.2 | 22 / 35 | 6543 |
| 7 | 1 | 72.3 | 90.2 | 28 / 35 | 7236 |
| 8 | 1 | 70.0 | 82.2 | 24 / 35 | 6833 |
| 9 | 1 | 70.4 | 85.4 | 25 / 35 | 6532 |
| 10 | 1 | 67.3 | 74.9 | 19 / 35 | 5981 |
| 11 | 1 | 70.3 | 84.1 | 24 / 35 | 7118 |
| 12 | 1 | 71.2 | 88.3 | 25 / 35 | 6514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 89 | 89% |
| sul.Lunar 1.1 | 82 | 96% |
| supersample.SuperBoxBot 1.0 | 67 | 93% |
| mme.NikeEnhanced 2.0 | 20 | 85% |
| sample.MyFirstRobot 1.0 | 19 | 63% |
| dsw.StaticD 1.0 | 19 | 74% |
| sample.MyFirstJuniorRobot 1.0 | 19 | 95% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.Corners 1.0 | 6 | 100% |

Hadur died in 128 of 420 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 32 | 25% | 114 |
| supersample.SuperBoxBot 1.0 | 29 | 23% | 79 |
| dsw.StaticD 1.0 | 17 | 13% | 46 |
| sul.Lunar 1.1 | 15 | 12% | 100 |
| mme.NikeEnhanced 2.0 | 10 | 8% | 27 |
| sample.MyFirstRobot 1.0 | 8 | 6% | 13 |
| sample.Corners 1.0 | 6 | 5% | 17 |
| tlp.ThreeLeggedPig 1 | 6 | 5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 2% | 14 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorDK400 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 76.9 | 220 / 420 | 3.08 | 17.8% | 74145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDK400 0.1 | 1.0 | 17.8% | 220 |
| radnor.DoctorBob 1.42 | 2.3 | 13.1% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.6 | 11.4% | 47 |
| mld.Wisdom 1.0 | 3.8 | 11.8% | 31 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 18 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 21 |
| sample.Walls 1.0 | 7.1 | 8.2% | 19 |
| GarmBox.Oranges 1.0 | 8.3 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.7% | 6 |
| sample.Target 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.1 | 23 / 35 | 6551 |
| 2 | 1 | 66.4 | 75.6 | 14 / 35 | 5944 |
| 3 | 1 | 67.1 | 77.8 | 20 / 35 | 6090 |
| 4 | 1 | 69.0 | 82.5 | 21 / 35 | 6310 |
| 5 | 1 | 64.2 | 67.6 | 14 / 35 | 5640 |
| 6 | 1 | 67.4 | 78.4 | 20 / 35 | 6110 |
| 7 | 1 | 65.9 | 72.1 | 15 / 35 | 6344 |
| 8 | 1 | 67.2 | 77.8 | 18 / 35 | 6496 |
| 9 | 1 | 68.5 | 80.6 | 21 / 35 | 6458 |
| 10 | 1 | 66.9 | 77.5 | 19 / 35 | 6093 |
| 11 | 1 | 65.8 | 73.7 | 16 / 35 | 6153 |
| 12 | 1 | 65.9 | 74.6 | 19 / 35 | 5956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 86 | 95% |
| radnor.DoctorBob 1.42 | 51 | 73% |
| mld.Wisdom 1.0 | 37 | 76% |
| amz.NanoClone 1.41 | 19 | 84% |
| jangs.ns51 1.0 | 18 | 83% |
| KiraNL.Chupacabra 0.4 | 15 | 73% |
| GarmBox.Oranges 1.0 | 15 | 100% |
| sample.Walls 1.0 | 10 | 100% |
| sample.Target 1.0 | 6 | 100% |

Hadur died in 203 of 420 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 50 | 25% | 80 |
| radnor.DoctorBob 1.42 | 49 | 24% | 94 |
| KiraNL.Chupacabra 0.4 | 43 | 21% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 9% | 99 |
| amz.NanoClone 1.41 | 17 | 8% | 32 |
| jangs.ns51 1.0 | 13 | 6% | 20 |
| sample.Walls 1.0 | 7 | 3% | 22 |
| GarmBox.Oranges 1.0 | 5 | 2% | 10 |

