# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 86.4 | 292 / 420 | 2.22 | 20.8% | 83466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.8% | 292 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 23 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 48 |
| mld.Infinity 2.2 | 3.8 | 13.0% | 38 |
| amz.NanoClone 1.41 | 4.9 | 10.6% | 16 |
| sample.Walls 1.0 | 6.8 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.4 | 6.3% | 3 |
| arthord.MannyPacquiao Beta | 9.1 | 4.1% | 0 |
| sample.Target 1.0 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.8 | 23 / 35 | 7150 |
| 2 | 1 | 70.5 | 81.0 | 24 / 35 | 6562 |
| 3 | 1 | 69.2 | 77.1 | 19 / 35 | 6711 |
| 4 | 1 | 70.3 | 83.8 | 21 / 35 | 6538 |
| 5 | 1 | 72.7 | 89.8 | 27 / 35 | 7143 |
| 6 | 1 | 71.6 | 87.0 | 24 / 35 | 6831 |
| 7 | 1 | 73.5 | 92.4 | 26 / 35 | 7938 |
| 8 | 1 | 72.3 | 90.2 | 26 / 35 | 6926 |
| 9 | 1 | 71.0 | 85.1 | 24 / 35 | 6927 |
| 10 | 1 | 73.2 | 93.0 | 28 / 35 | 7253 |
| 11 | 1 | 71.4 | 87.6 | 26 / 35 | 6482 |
| 12 | 1 | 71.5 | 86.0 | 24 / 35 | 7005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 128 | 100% |
| mld.Infinity 2.2 | 87 | 92% |
| radnor.DoctorBob 1.42 | 70 | 83% |
| jangs.ns51 1.0 | 13 | 92% |
| amz.NanoClone 1.41 | 8 | 88% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 130 of 420 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 55 | 42% | 144 |
| mld.Infinity 2.2 | 21 | 16% | 32 |
| amz.NanoClone 1.41 | 20 | 15% | 31 |
| mz.AntiGrav 1.0 | 19 | 15% | 149 |
| sample.Walls 1.0 | 6 | 5% | 23 |
| GarmBox.Oranges 1.0 | 6 | 5% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 16 |
| arthord.MannyPacquiao Beta | 1 | 1% | 11 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.9 | 268 / 420 | 2.45 | 18.6% | 61591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.1 | 18.6% | 268 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.8% | 100 |
| mld.DustBunny 3.8 | 3.2 | 12.6% | 19 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 8.7% | 8 |
| zyx.nano.Ant 1.1 | 6.2 | 8.4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.0% | 13 |
| fullsail.SweetTea 1.1 | 8.0 | 7.1% | 6 |
| bzdp.BoxCar 2.0 | 8.3 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.4 | 20 / 35 | 5218 |
| 2 | 1 | 70.5 | 90.8 | 26 / 35 | 5798 |
| 3 | 1 | 69.4 | 90.8 | 23 / 35 | 4991 |
| 4 | 1 | 70.7 | 94.3 | 27 / 35 | 5590 |
| 5 | 1 | 65.0 | 73.3 | 20 / 35 | 4623 |
| 6 | 1 | 69.3 | 88.3 | 28 / 35 | 4994 |
| 7 | 1 | 67.2 | 83.2 | 23 / 35 | 4693 |
| 8 | 1 | 70.7 | 95.6 | 30 / 35 | 5173 |
| 9 | 1 | 70.9 | 94.3 | 28 / 35 | 5794 |
| 10 | 2 | 61.6 | 60.0 | 9 / 35 | 4675 |
| 11 | 1 | 68.8 | 90.2 | 20 / 35 | 4914 |
| 12 | 1 | 64.7 | 67.6 | 14 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 166 | 80% |
| mld.DustBunny 3.8 | 74 | 93% |
| djdjdj.NanoSkunk10 1.0 | 22 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 21 | 86% |
| fullsail.SweetTea 1.1 | 13 | 92% |
| zyx.nano.Ant 1.1 | 9 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 154 of 420 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 40% | 180 |
| mld.DustBunny 3.8 | 17 | 11% | 82 |
| zyx.nano.Ant 1.1 | 15 | 10% | 26 |
| cs.Grudge 1.0 | 13 | 8% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 8% | 28 |
| maribo.melee.BMV 0.1 | 12 | 8% | 22 |
| fullsail.SweetTea 1.1 | 10 | 6% | 24 |
| djdjdj.NanoSkunk10 1.0 | 9 | 6% | 38 |
| bzdp.BoxCar 2.0 | 4 | 3% | 5 |

## Melee bench: F03

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.0 | 294 / 420 | 2.26 | 20.3% | 72821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.3% | 294 |
| myl.micro.Troodon 1.10 | 2.2 | 14.1% | 57 |
| myl.nano.KomoriNinja 1.1 | 3.1 | 11.9% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 4.4 | 10.5% | 15 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 20 |
| fm.mammillarias 1.3 | 5.4 | 9.4% | 3 |
| cs.sheldor.Talon 1.1 | 6.6 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 8 |
| sample.Fire 1.0 | 9.3 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.3 | 24 / 35 | 5888 |
| 2 | 1 | 71.4 | 89.2 | 27 / 35 | 6247 |
| 3 | 1 | 70.6 | 84.4 | 26 / 35 | 6219 |
| 4 | 1 | 69.8 | 83.5 | 23 / 35 | 6054 |
| 5 | 1 | 68.3 | 78.7 | 21 / 35 | 5823 |
| 6 | 1 | 70.3 | 87.6 | 24 / 35 | 5716 |
| 7 | 1 | 71.5 | 89.2 | 25 / 35 | 6352 |
| 8 | 1 | 71.3 | 89.2 | 26 / 35 | 6064 |
| 9 | 1 | 71.8 | 90.2 | 28 / 35 | 6422 |
| 10 | 1 | 69.5 | 83.5 | 22 / 35 | 5978 |
| 11 | 1 | 70.0 | 83.8 | 25 / 35 | 5914 |
| 12 | 1 | 70.6 | 85.7 | 23 / 35 | 6144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 102 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 76 | 99% |
| myl.nano.KomoriNinja 1.1 | 45 | 89% |
| cb.nano.Insomnia 1.0 | 43 | 79% |
| sp.Nanos.Ember 1.1 | 21 | 95% |
| fm.mammillarias 1.3 | 15 | 100% |
| sample.Fire 1.0 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 6 | 83% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 127 of 420 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 26 | 20% | 128 |
| myl.nano.KomoriNinja 1.1 | 25 | 20% | 76 |
| cb.nano.Insomnia 1.0 | 21 | 17% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 13% | 86 |
| fm.mammillarias 1.3 | 14 | 11% | 29 |
| cs.sheldor.Talon 1.1 | 11 | 9% | 26 |
| sample.Fire 1.0 | 7 | 6% | 20 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 28 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.0 | 298 / 420 | 2.17 | 20.6% | 77798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.6% | 298 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 30 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 21 |
| tj.zombie1n 1.0.1 | 5.4 | 9.0% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.4 | 9.0% | 4 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.1% | 21 |
| yk.JahMicro 1.0 | 6.4 | 8.4% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 12 |
| repositorio.NanoStep 1.0 | 9.1 | 6.0% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 79.7 | 23 / 35 | 6364 |
| 2 | 1 | 70.5 | 88.6 | 28 / 35 | 5926 |
| 3 | 1 | 70.9 | 90.2 | 25 / 35 | 6320 |
| 4 | 1 | 70.5 | 88.3 | 25 / 35 | 6306 |
| 5 | 1 | 71.2 | 88.9 | 26 / 35 | 6808 |
| 6 | 1 | 71.0 | 87.6 | 26 / 35 | 6891 |
| 7 | 1 | 67.2 | 77.5 | 21 / 35 | 5613 |
| 8 | 1 | 71.5 | 89.5 | 26 / 35 | 6757 |
| 9 | 1 | 70.8 | 88.9 | 25 / 35 | 6464 |
| 10 | 1 | 69.5 | 82.2 | 21 / 35 | 6680 |
| 11 | 1 | 71.9 | 92.1 | 26 / 35 | 6934 |
| 12 | 1 | 71.0 | 90.5 | 26 / 35 | 6735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 134 | 91% |
| stelo.SoJNanoMelee 1.1 | 82 | 94% |
| tvv.micro.Antares 1.1.1 | 33 | 82% |
| yk.JahMicro 1.0 | 24 | 83% |
| tj.zombie1n 1.0.1 | 24 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 74% |
| sample.VelociRobot 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 123 of 420 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 42 | 34% | 168 |
| stelo.SoJNanoMelee 1.1 | 18 | 15% | 55 |
| tvv.micro.Antares 1.1.1 | 17 | 14% | 61 |
| ers.nano.hawk.HawkLA 3.0m | 15 | 12% | 41 |
| Grystrion.RandomTrackerNOREV 1.0 | 14 | 11% | 25 |
| yk.JahMicro 1.0 | 8 | 7% | 25 |
| tj.zombie1n 1.0.1 | 5 | 4% | 12 |
| repositorio.NanoStep 1.0 | 3 | 2% | 13 |
| sample.VelociRobot 1.0 | 1 | 1% | 15 |

## Melee bench: F05

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.8 | 193 / 420 | 3.63 | 16.0% | 57922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 16.0% | 193 |
| oog.melee.Corsair 1.0 | 2.3 | 12.4% | 68 |
| ahf.NanoAndrew .4 | 3.9 | 11.2% | 45 |
| simonton.nano.MeleeSeed 1.8 | 4.1 | 10.9% | 37 |
| EBBU.Sim2 1.02 | 5.1 | 10.2% | 16 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 31 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.3% | 18 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 70.2 | 13 / 35 | 4943 |
| 2 | 1 | 65.1 | 74.0 | 19 / 35 | 4924 |
| 3 | 1 | 59.9 | 61.0 | 12 / 35 | 4572 |
| 4 | 1 | 63.9 | 69.8 | 17 / 35 | 4689 |
| 5 | 1 | 60.0 | 58.4 | 12 / 35 | 4627 |
| 6 | 1 | 64.2 | 74.3 | 12 / 35 | 4902 |
| 7 | 1 | 62.8 | 70.5 | 16 / 35 | 4376 |
| 8 | 1 | 65.7 | 74.3 | 18 / 35 | 4977 |
| 9 | 1 | 64.8 | 74.0 | 18 / 35 | 4737 |
| 10 | 1 | 65.3 | 73.7 | 21 / 35 | 5076 |
| 11 | 1 | 65.3 | 75.6 | 22 / 35 | 4717 |
| 12 | 1 | 64.4 | 74.0 | 13 / 35 | 5382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 67 | 94% |
| oog.melee.Corsair 1.0 | 62 | 60% |
| ahf.NanoAndrew .4 | 41 | 76% |
| sam.Samspin 1.0 | 25 | 92% |
| EBBU.Sim2 1.02 | 17 | 94% |
| robar.nano.Assertive_Melee 0.2 | 12 | 83% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 228 of 420 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 18% | 82 |
| simonton.nano.MeleeSeed 1.8 | 36 | 16% | 90 |
| robar.nano.Assertive_Melee 0.2 | 35 | 15% | 47 |
| EBBU.Sim2 1.02 | 25 | 11% | 37 |
| ahf.NanoAndrew .4 | 24 | 11% | 68 |
| zyx.nano.BacillusComma 1.0 | 23 | 10% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 22 | 10% | 21 |
| sam.Samspin 1.0 | 17 | 7% | 30 |
| sample.TrackFire 1.0 | 4 | 2% | 8 |

## Melee bench: F06

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.9 | 295 / 420 | 2.09 | 19.5% | 63018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 19.5% | 295 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 45 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.7% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.8% | 28 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 9.0% | 12 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.7% | 8 |
| fm.claire 1.7 | 6.4 | 8.4% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 6 |
| pa.Improved 1.0 | 9.3 | 6.0% | 4 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 24 / 35 | 5094 |
| 2 | 1 | 68.9 | 87.3 | 22 / 35 | 5383 |
| 3 | 1 | 68.5 | 87.6 | 25 / 35 | 4640 |
| 4 | 1 | 67.7 | 83.2 | 25 / 35 | 4627 |
| 5 | 1 | 67.1 | 81.3 | 21 / 35 | 4922 |
| 6 | 1 | 71.3 | 94.3 | 27 / 35 | 6030 |
| 7 | 1 | 70.3 | 91.4 | 24 / 35 | 5528 |
| 8 | 1 | 70.8 | 93.3 | 26 / 35 | 5654 |
| 9 | 1 | 67.6 | 82.9 | 22 / 35 | 4927 |
| 10 | 1 | 71.5 | 94.6 | 31 / 35 | 5691 |
| 11 | 1 | 67.0 | 80.0 | 21 / 35 | 5023 |
| 12 | 1 | 70.0 | 88.9 | 27 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 149 | 91% |
| oog.melee.CapuletDroid 1.1 | 66 | 83% |
| gh.nano.Grofvuil 0.2 | 39 | 85% |
| arthord.NanoSatanMelee Beta | 31 | 87% |
| sample.SpinBot 1.0 | 18 | 100% |
| winamp32.micro.MicroMacro 1.0 | 12 | 83% |
| kurios.DOSexe .9b | 9 | 67% |
| fm.claire 1.7 | 7 | 100% |
| pa.Improved 1.0 | 5 | 80% |

Hadur died in 127 of 420 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 24% | 165 |
| oog.melee.CapuletDroid 1.1 | 22 | 17% | 27 |
| arthord.NanoSatanMelee Beta | 21 | 17% | 56 |
| gh.nano.Grofvuil 0.2 | 18 | 14% | 67 |
| winamp32.micro.MicroMacro 1.0 | 12 | 9% | 36 |
| fm.claire 1.7 | 9 | 7% | 19 |
| kurios.DOSexe .9b | 6 | 5% | 21 |
| pa.Improved 1.0 | 5 | 4% | 14 |
| sample.SpinBot 1.0 | 2 | 2% | 10 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.0 | 181 / 420 | 2.53 | 18.4% | 69326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 18.4% | 181 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.3% | 99 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.2% | 39 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 84 |
| DBall.Anarchy 0.1 | 5.4 | 8.2% | 6 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.3% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 5 |
| acogdev.alpha 0.2 | 8.1 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.4 | 14 / 35 | 6346 |
| 2 | 1 | 68.9 | 85.4 | 13 / 35 | 6207 |
| 3 | 1 | 67.7 | 82.5 | 13 / 35 | 5789 |
| 4 | 1 | 68.3 | 85.4 | 16 / 35 | 5786 |
| 5 | 1 | 67.8 | 85.1 | 17 / 35 | 5460 |
| 6 | 1 | 68.6 | 82.5 | 16 / 35 | 6077 |
| 7 | 1 | 68.7 | 85.4 | 18 / 35 | 5559 |
| 8 | 1 | 67.9 | 80.0 | 18 / 35 | 5900 |
| 9 | 1 | 67.8 | 86.0 | 14 / 35 | 5241 |
| 10 | 1 | 69.5 | 87.9 | 15 / 35 | 6293 |
| 11 | 1 | 67.6 | 84.1 | 16 / 35 | 5313 |
| 12 | 1 | 63.5 | 66.3 | 11 / 35 | 5355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 94 | 43% |
| spinnercat.micro.Tyger 0.1 | 90 | 88% |
| gh.micro.Gruweltje 0.7 | 72 | 25% |
| DBall.Anarchy 0.1 | 22 | 100% |
| el.JumpShoot 0.2 | 11 | 91% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 92 | 38% | 123 |
| mz.MicroGodMelee 1 | 81 | 34% | 130 |
| spinnercat.micro.Tyger 0.1 | 34 | 14% | 95 |
| acogdev.alpha 0.2 | 10 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 8 | 3% | 14 |
| fire219.CatBot 1.0 | 6 | 3% | 7 |
| el.JumpShoot 0.2 | 4 | 2% | 8 |
| DBall.Anarchy 0.1 | 3 | 1% | 18 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 10 |

## Melee bench: F08

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.1 | 234 / 420 | 3.33 | 17.1% | 62460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 17.1% | 234 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 65 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 64 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 6 |
| germ.TheMind .2 | 5.3 | 9.4% | 14 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.4% | 5 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 14 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 78.7 | 22 / 35 | 5700 |
| 2 | 1 | 66.6 | 76.5 | 23 / 35 | 4998 |
| 3 | 1 | 66.2 | 75.6 | 20 / 35 | 5328 |
| 4 | 1 | 66.9 | 75.6 | 21 / 35 | 5520 |
| 5 | 1 | 64.5 | 73.0 | 18 / 35 | 4774 |
| 6 | 1 | 63.5 | 67.6 | 17 / 35 | 5135 |
| 7 | 1 | 68.0 | 81.0 | 24 / 35 | 5431 |
| 8 | 1 | 66.8 | 76.8 | 24 / 35 | 5304 |
| 9 | 1 | 66.2 | 75.9 | 19 / 35 | 5228 |
| 10 | 1 | 62.7 | 65.4 | 18 / 35 | 4808 |
| 11 | 1 | 63.7 | 71.4 | 13 / 35 | 4745 |
| 12 | 1 | 65.4 | 72.1 | 15 / 35 | 5489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 160 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 76% |
| germ.TheMind .2 | 16 | 94% |
| stelo.UntouchableNano 1.3 | 13 | 77% |
| qualidafial.MajorDick 1.0.1 | 13 | 92% |
| awesomeness.Elite 1.0 | 9 | 100% |
| sample.Crazy 1.0 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 186 of 420 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 36% | 195 |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 21% | 70 |
| stelo.UntouchableNano 1.3 | 17 | 9% | 35 |
| germ.TheMind .2 | 16 | 9% | 30 |
| qualidafial.MajorDick 1.0.1 | 14 | 8% | 20 |
| awesomeness.Elite 1.0 | 13 | 7% | 26 |
| mym.EdgeStalker 1.0 | 13 | 7% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 3% | 18 |
| sample.Crazy 1.0 | 1 | 1% | 13 |

## Melee bench: F09

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.6 | 320 / 420 | 1.85 | 20.4% | 59863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 20.4% | 320 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 12.0% | 22 |
| maribo.IotaCT 1.1 | 4.4 | 10.3% | 17 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 3 |
| ratosh.Wesco 1.4 | 7.8 | 7.9% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 8.2 | 7.7% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.0 | 27 / 35 | 5414 |
| 2 | 1 | 69.1 | 84.4 | 25 / 35 | 4814 |
| 3 | 1 | 71.9 | 93.0 | 30 / 35 | 4926 |
| 4 | 1 | 71.3 | 92.7 | 28 / 35 | 4828 |
| 5 | 1 | 70.5 | 90.5 | 27 / 35 | 4657 |
| 6 | 1 | 70.2 | 88.6 | 25 / 35 | 4876 |
| 7 | 1 | 72.3 | 94.9 | 29 / 35 | 5487 |
| 8 | 1 | 71.4 | 91.1 | 26 / 35 | 5174 |
| 9 | 1 | 70.1 | 90.5 | 24 / 35 | 4763 |
| 10 | 1 | 70.6 | 90.2 | 25 / 35 | 4947 |
| 11 | 1 | 71.6 | 90.2 | 28 / 35 | 5449 |
| 12 | 1 | 71.3 | 94.3 | 26 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 148 | 91% |
| nz.jdc.nano.GridFu 1.0 | 83 | 92% |
| maribo.IotaCT 1.1 | 30 | 83% |
| timmit.nano.TimDog 0.33 | 24 | 88% |
| stelo.PatternRobot 1.0 | 24 | 96% |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 95% |
| ratosh.Wesco 1.4 | 12 | 92% |
| spinnercat.Omen 1.0 | 9 | 100% |

Hadur died in 101 of 420 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 24 | 24% | 109 |
| rz.HawkOnFire 0.1 | 22 | 22% | 119 |
| timmit.nano.TimDog 0.33 | 19 | 19% | 47 |
| stelo.PatternRobot 1.0 | 12 | 12% | 29 |
| maribo.IotaCT 1.1 | 10 | 10% | 49 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 9% | 24 |
| ratosh.Wesco 1.4 | 4 | 4% | 23 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 13 |

## Melee bench: F10

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.5 | 352 / 420 | 1.76 | 21.4% | 75824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 21.4% | 352 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 28 |
| baal.nano.N 1.42 | 3.0 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.5% | 4 |
| zyx.micro.Ant 1.1 | 4.8 | 9.2% | 12 |
| sanja.First 0.1 | 6.8 | 8.3% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.9 | 8.1% | 0 |
| cvt.Firsty 1.0 | 7.6 | 7.6% | 9 |
| amk.Punbot.Punbot 0.01 | 8.1 | 7.3% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.0 | 29 / 35 | 6632 |
| 2 | 1 | 70.8 | 89.8 | 27 / 35 | 6030 |
| 3 | 1 | 71.8 | 93.7 | 30 / 35 | 6308 |
| 4 | 1 | 72.0 | 92.7 | 32 / 35 | 6394 |
| 5 | 1 | 70.8 | 92.1 | 31 / 35 | 5856 |
| 6 | 1 | 72.5 | 92.4 | 30 / 35 | 6994 |
| 7 | 1 | 70.5 | 87.9 | 29 / 35 | 6213 |
| 8 | 1 | 71.8 | 94.0 | 29 / 35 | 6374 |
| 9 | 1 | 70.6 | 87.0 | 27 / 35 | 6386 |
| 10 | 1 | 73.1 | 97.8 | 32 / 35 | 6934 |
| 11 | 1 | 69.8 | 87.9 | 28 / 35 | 5636 |
| 12 | 1 | 70.5 | 88.9 | 28 / 35 | 6067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 80 | 93% |
| baal.nano.N 1.42 | 63 | 98% |
| cvt.Firsty 1.0 | 58 | 93% |
| zyx.micro.Ant 1.1 | 44 | 95% |
| sanja.First 0.1 | 43 | 95% |
| amk.Punbot.Punbot 0.01 | 30 | 100% |
| Grystrion.TrackerWO 1.0 | 30 | 100% |
| squidM.TentalceMeleeNano 1.1 | 15 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 71 of 420 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 19 | 27% | 71 |
| tvv.nano.Polaris 1.2 | 16 | 23% | 119 |
| Grystrion.TrackerWO 1.0 | 8 | 11% | 34 |
| sample.RamFire 1.0 | 7 | 10% | 10 |
| baal.nano.N 1.42 | 6 | 8% | 62 |
| cvt.Firsty 1.0 | 6 | 8% | 50 |
| sanja.First 0.1 | 5 | 7% | 41 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 23 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 68.1 | 146 / 420 | 3.87 | 15.0% | 57591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.2% | 153 |
| hadur117.micro.SaorW 0.1 | 1.7 | 15.0% | 146 |
| cs.Wren 1.0 | 3.2 | 12.7% | 44 |
| js.PinBall 1.6 | 4.0 | 11.5% | 33 |
| mz.Cork 0.1 | 4.8 | 11.0% | 23 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 10 |
| evd.X1 0.01 | 6.9 | 8.0% | 3 |
| jsal.Jsalbot 1.0 | 8.1 | 6.9% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 66.3 | 13 / 35 | 4735 |
| 2 | 1 | 62.6 | 67.9 | 15 / 35 | 4794 |
| 3 | 2 | 64.5 | 74.3 | 12 / 35 | 5109 |
| 4 | 2 | 64.0 | 72.1 | 13 / 35 | 4703 |
| 5 | 3 | 57.7 | 55.2 | 11 / 35 | 4207 |
| 6 | 2 | 62.3 | 67.3 | 12 / 35 | 4812 |
| 7 | 1 | 63.6 | 70.5 | 14 / 35 | 4717 |
| 8 | 2 | 63.8 | 70.8 | 12 / 35 | 5358 |
| 9 | 1 | 64.2 | 72.7 | 12 / 35 | 5274 |
| 10 | 2 | 60.5 | 63.8 | 12 / 35 | 4594 |
| 11 | 1 | 62.8 | 70.5 | 10 / 35 | 4793 |
| 12 | 2 | 61.2 | 66.3 | 10 / 35 | 4495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 136 | 51% |
| cs.Wren 1.0 | 39 | 90% |
| js.PinBall 1.6 | 17 | 71% |
| mz.Cork 0.1 | 16 | 88% |
| donjezza.Jezza 1.0 | 8 | 63% |
| joe.ADinosaur 1.0 | 6 | 83% |
| jsal.Jsalbot 1.0 | 5 | 100% |

Hadur died in 274 of 420 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 133 | 49% | 212 |
| joe.ADinosaur 1.0 | 34 | 12% | 37 |
| js.PinBall 1.6 | 25 | 9% | 42 |
| cs.Wren 1.0 | 22 | 8% | 38 |
| evd.X1 0.01 | 22 | 8% | 25 |
| mz.Cork 0.1 | 21 | 8% | 37 |
| PSW.Relentless 0.1 | 14 | 5% | 14 |
| donjezza.Jezza 1.0 | 3 | 1% | 7 |
| jsal.Jsalbot 1.0 | 0 | 0% | 8 |

## Melee bench: F12

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.5 | 284 / 420 | 2.40 | 19.0% | 57314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 19.0% | 284 |
| myl.nano.Graviton 1.10 | 2.9 | 11.4% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.8% | 9 |
| ntc.Opposite 1.5 | 3.9 | 10.8% | 18 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.8% | 22 |
| DBall.NUKE 0.1 | 6.9 | 8.4% | 10 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 12 |
| donjezza.Muncho 1.0 | 9.1 | 6.4% | 16 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.1 | 27 / 35 | 5179 |
| 2 | 1 | 67.3 | 77.8 | 22 / 35 | 5136 |
| 3 | 1 | 68.9 | 87.3 | 26 / 35 | 4571 |
| 4 | 1 | 68.3 | 84.4 | 24 / 35 | 4652 |
| 5 | 1 | 68.3 | 82.5 | 25 / 35 | 5036 |
| 6 | 1 | 68.3 | 87.9 | 21 / 35 | 4599 |
| 7 | 1 | 69.5 | 91.1 | 27 / 35 | 4580 |
| 8 | 1 | 69.7 | 87.6 | 25 / 35 | 4905 |
| 9 | 1 | 67.6 | 81.0 | 24 / 35 | 4797 |
| 10 | 1 | 66.3 | 77.5 | 22 / 35 | 4621 |
| 11 | 1 | 67.6 | 84.8 | 21 / 35 | 4686 |
| 12 | 1 | 66.7 | 80.6 | 20 / 35 | 4552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 64 | 91% |
| stelo.AreaTargetingBot 1.1 | 55 | 91% |
| ntc.Opposite 1.5 | 44 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 39 | 97% |
| disan.Chair 2.2.0 | 31 | 94% |
| DBall.NUKE 0.1 | 26 | 96% |
| donjezza.Muncho 1.0 | 23 | 83% |
| pfvicm.Sobieski 7.2.3b | 20 | 95% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 141 of 420 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 30 | 21% | 54 |
| stelo.AreaTargetingBot 1.1 | 25 | 18% | 72 |
| ntc.Opposite 1.5 | 21 | 15% | 43 |
| myl.nano.Graviton 1.10 | 20 | 14% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 14% | 62 |
| disan.Chair 2.2.0 | 10 | 7% | 27 |
| DBall.NUKE 0.1 | 6 | 4% | 39 |
| donjezza.Muncho 1.0 | 6 | 4% | 25 |
| pbg.R2D2 1.0 | 3 | 2% | 13 |

## Melee bench: F13

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.1 | 158 / 420 | 3.78 | 15.0% | 49096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.6 | 15.0% | 158 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 74 |
| oog.melee.Capulet 1.2 | 2.6 | 13.7% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 45 |
| yagami.Tidus 0.11 | 4.7 | 11.8% | 30 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 17 |
| stelo.MirrorNano 1.3 | 7.4 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.6 | 7.2% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.5 | 14 / 35 | 4511 |
| 2 | 1 | 64.3 | 72.1 | 17 / 35 | 4336 |
| 3 | 1 | 63.4 | 70.5 | 10 / 35 | 4012 |
| 4 | 4 | 58.3 | 55.9 | 10 / 35 | 3779 |
| 5 | 3 | 61.3 | 61.9 | 11 / 35 | 3932 |
| 6 | 1 | 64.7 | 74.6 | 18 / 35 | 4331 |
| 7 | 1 | 64.3 | 74.0 | 17 / 35 | 4013 |
| 8 | 1 | 64.5 | 74.6 | 15 / 35 | 3950 |
| 9 | 1 | 63.6 | 68.3 | 14 / 35 | 4445 |
| 10 | 1 | 62.8 | 68.9 | 12 / 35 | 3996 |
| 11 | 3 | 57.9 | 57.8 | 6 / 35 | 3560 |
| 12 | 1 | 66.5 | 80.3 | 14 / 35 | 4231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 78% |
| oog.melee.Capulet 1.2 | 55 | 60% |
| kawigi.micro.Shiz 1.1 | 53 | 85% |
| yagami.Tidus 0.11 | 28 | 86% |
| ejb.Polaris 1.0.1 | 11 | 82% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 263 of 420 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 90 | 34% | 135 |
| yagami.Tidus 0.11 | 46 | 17% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 14% | 77 |
| ejb.Polaris 1.0.1 | 29 | 11% | 50 |
| kawigi.micro.Shiz 1.1 | 28 | 11% | 55 |
| stelo.MirrorNano 1.3 | 15 | 6% | 15 |
| kurios.DOSexe .9a | 13 | 5% | 13 |
| step.nanoPri 1.0 | 5 | 2% | 6 |

## Melee bench: F14

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.0 | 263 / 420 | 2.71 | 17.6% | 53656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 17.6% | 263 |
| wee.Gem 1.8.4 | 2.9 | 11.9% | 53 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 27 |
| wompi.Quokka 1.6 | 3.5 | 11.4% | 30 |
| ratosh.Nobo 0.21 | 4.8 | 11.0% | 24 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 17 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 7.0% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.9 | 20 / 35 | 4117 |
| 2 | 1 | 68.6 | 87.6 | 26 / 35 | 4575 |
| 3 | 1 | 66.2 | 81.3 | 22 / 35 | 4261 |
| 4 | 1 | 65.3 | 78.4 | 21 / 35 | 4245 |
| 5 | 1 | 67.3 | 83.8 | 22 / 35 | 4547 |
| 6 | 1 | 67.7 | 83.2 | 21 / 35 | 5194 |
| 7 | 1 | 66.7 | 82.5 | 21 / 35 | 4341 |
| 8 | 1 | 66.8 | 81.6 | 24 / 35 | 4414 |
| 9 | 1 | 67.5 | 85.1 | 25 / 35 | 4427 |
| 10 | 1 | 65.8 | 78.1 | 19 / 35 | 4575 |
| 11 | 1 | 66.4 | 80.6 | 22 / 35 | 4540 |
| 12 | 1 | 64.3 | 74.3 | 20 / 35 | 4420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 90 | 91% |
| bzdp.Pansy 2.1 | 90 | 96% |
| wompi.Quokka 1.6 | 44 | 80% |
| ratosh.Nobo 0.21 | 33 | 82% |
| m3thos.Eva00 1.1 | 18 | 89% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 159 of 420 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 29 | 18% | 57 |
| wee.Gem 1.8.4 | 24 | 15% | 104 |
| maribo.FollowFire 1 | 22 | 14% | 25 |
| bzdp.Pansy 2.1 | 19 | 12% | 96 |
| ratosh.Nobo 0.21 | 17 | 11% | 47 |
| bayen.UbaMicro 1.4 | 17 | 11% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 9% | 21 |
| m3thos.Eva00 1.1 | 8 | 5% | 21 |
| stelo.MyAgileRobot 0.2 | 7 | 4% | 14 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 82.4 | 127 / 420 | 2.58 | 19.1% | 86776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 19.5% | 245 |
| hadur117.micro.SaorW 0.1 | 1.6 | 19.1% | 127 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 30 |
| ayk.WallHugger 1.0 | 4.4 | 10.1% | 9 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 8 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.5 | 86.0 | 5 / 35 | 7274 |
| 2 | 1 | 68.8 | 76.8 | 11 / 35 | 7049 |
| 3 | 2 | 67.4 | 73.7 | 7 / 35 | 6788 |
| 4 | 1 | 69.0 | 78.7 | 13 / 35 | 7117 |
| 5 | 2 | 71.2 | 84.1 | 9 / 35 | 7763 |
| 6 | 2 | 71.6 | 87.0 | 11 / 35 | 7560 |
| 7 | 2 | 70.1 | 83.5 | 11 / 35 | 7390 |
| 8 | 2 | 69.9 | 81.0 | 9 / 35 | 7497 |
| 9 | 1 | 70.7 | 86.3 | 13 / 35 | 6800 |
| 10 | 2 | 69.8 | 80.6 | 11 / 35 | 7416 |
| 11 | 1 | 70.5 | 88.3 | 13 / 35 | 6996 |
| 12 | 1 | 70.7 | 82.9 | 14 / 35 | 7126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 211 | 29% |
| mz.NanoGod 2.02 | 32 | 63% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| ayk.WallHugger 1.0 | 14 | 93% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stuff.Vlad 0.1 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 293 of 420 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 198 | 68% | 275 |
| mz.NanoGod 2.02 | 57 | 19% | 83 |
| ayk.WallHugger 1.0 | 14 | 5% | 19 |
| exauge.GateKeeper 1.1.121g | 13 | 4% | 18 |
| stuff.Vlad 0.1 | 5 | 2% | 11 |
| stelo.PianistNano 1.2 | 4 | 1% | 5 |
| drd.Dreadknoght 0.9 | 2 | 1% | 8 |

## Melee bench: F16

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.9 | 229 / 420 | 3.35 | 16.8% | 56736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 16.8% | 229 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 12.5% | 31 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.5% | 32 |
| bvh.micro.Freya 0.3 | 3.6 | 11.6% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 46 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.7% | 13 |
| conscience.Electron 1.3g | 7.1 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.4 | 6.9% | 17 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 79.0 | 22 / 35 | 5369 |
| 2 | 1 | 61.8 | 64.8 | 14 / 35 | 4172 |
| 3 | 1 | 66.6 | 79.0 | 19 / 35 | 5020 |
| 4 | 1 | 59.9 | 58.7 | 13 / 35 | 4405 |
| 5 | 1 | 66.8 | 80.3 | 23 / 35 | 5066 |
| 6 | 1 | 63.4 | 68.3 | 17 / 35 | 4553 |
| 7 | 1 | 68.2 | 84.4 | 26 / 35 | 4913 |
| 8 | 1 | 66.8 | 80.3 | 21 / 35 | 4743 |
| 9 | 1 | 65.6 | 77.8 | 17 / 35 | 4845 |
| 10 | 1 | 63.7 | 69.5 | 17 / 35 | 4453 |
| 11 | 1 | 64.3 | 70.5 | 18 / 35 | 4779 |
| 12 | 1 | 64.8 | 74.3 | 22 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 88 | 98% |
| dummy.micro.Sparrow 2.5 | 52 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 41 | 71% |
| bvh.micro.Freya 0.3 | 35 | 94% |
| stelo.MirrorMicro 1.0 | 18 | 94% |
| ap.Frederick 1.1 | 12 | 100% |
| conscience.Electron 1.3g | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 192 of 420 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 36 | 19% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 28 | 15% | 28 |
| voidious.micro.BlitzBat 1.05 | 25 | 13% | 92 |
| dummy.micro.Sparrow 2.5 | 24 | 13% | 74 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 13% | 66 |
| dl.BetterWalls 1.0 | 22 | 11% | 33 |
| bvh.micro.Freya 0.3 | 18 | 9% | 44 |
| stelo.MirrorMicro 1.0 | 14 | 7% | 35 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.8 | 309 / 420 | 2.01 | 21.2% | 80729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 21.2% | 309 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 44 |
| sul.Lunar 1.1 | 3.3 | 11.2% | 16 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 20 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 1 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 11 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.4 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 12 |
| sample.Corners 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 82.5 | 23 / 35 | 6645 |
| 2 | 1 | 69.9 | 85.7 | 23 / 35 | 6018 |
| 3 | 1 | 73.1 | 92.7 | 28 / 35 | 7312 |
| 4 | 1 | 71.2 | 87.0 | 24 / 35 | 6697 |
| 5 | 1 | 71.8 | 91.1 | 30 / 35 | 6502 |
| 6 | 1 | 69.9 | 81.3 | 24 / 35 | 6631 |
| 7 | 1 | 72.5 | 95.9 | 24 / 35 | 6878 |
| 8 | 1 | 73.0 | 95.2 | 27 / 35 | 7449 |
| 9 | 1 | 73.1 | 93.7 | 28 / 35 | 7104 |
| 10 | 1 | 69.0 | 81.0 | 23 / 35 | 5979 |
| 11 | 1 | 72.2 | 93.7 | 28 / 35 | 6918 |
| 12 | 1 | 70.7 | 85.7 | 27 / 35 | 6596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 115 | 88% |
| sul.Lunar 1.1 | 91 | 98% |
| supersample.SuperBoxBot 1.0 | 57 | 86% |
| mme.NikeEnhanced 2.0 | 21 | 100% |
| dsw.StaticD 1.0 | 17 | 59% |
| sample.MyFirstJuniorRobot 1.0 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 14 | 64% |
| tlp.ThreeLeggedPig 1 | 9 | 78% |
| sample.Corners 1.0 | 8 | 100% |

Hadur died in 115 of 420 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 37 | 32% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 27 | 23% | 127 |
| mme.NikeEnhanced 2.0 | 14 | 12% | 30 |
| dsw.StaticD 1.0 | 13 | 11% | 40 |
| sample.MyFirstRobot 1.0 | 8 | 7% | 17 |
| sul.Lunar 1.1 | 6 | 5% | 91 |
| tlp.ThreeLeggedPig 1 | 4 | 3% | 12 |
| sample.Corners 1.0 | 4 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 19 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorW 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.4 | 242 / 420 | 2.85 | 18.3% | 73329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW 0.1 | 1.0 | 18.3% | 242 |
| radnor.DoctorBob 1.42 | 2.4 | 13.2% | 51 |
| mld.Wisdom 1.0 | 3.4 | 11.6% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 11.5% | 44 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 21 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.9% | 13 |
| sample.Walls 1.0 | 7.5 | 7.9% | 9 |
| GarmBox.Oranges 1.0 | 8.0 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 9 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 72.7 | 18 / 35 | 5786 |
| 2 | 1 | 69.6 | 86.0 | 24 / 35 | 6294 |
| 3 | 1 | 70.7 | 91.1 | 25 / 35 | 6627 |
| 4 | 1 | 67.9 | 78.7 | 20 / 35 | 6358 |
| 5 | 1 | 66.9 | 75.9 | 19 / 35 | 6400 |
| 6 | 1 | 69.3 | 85.1 | 24 / 35 | 6483 |
| 7 | 1 | 68.9 | 84.8 | 21 / 35 | 6076 |
| 8 | 1 | 64.3 | 69.2 | 16 / 35 | 5610 |
| 9 | 1 | 66.1 | 73.3 | 15 / 35 | 6137 |
| 10 | 1 | 64.8 | 74.6 | 15 / 35 | 5354 |
| 11 | 1 | 67.2 | 77.1 | 20 / 35 | 5884 |
| 12 | 1 | 69.4 | 84.4 | 25 / 35 | 6320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 83 | 94% |
| radnor.DoctorBob 1.42 | 63 | 81% |
| mld.Wisdom 1.0 | 32 | 72% |
| amz.NanoClone 1.41 | 26 | 85% |
| KiraNL.Chupacabra 0.4 | 24 | 92% |
| jangs.ns51 1.0 | 19 | 84% |
| sample.Walls 1.0 | 16 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 7 | 100% |

Hadur died in 179 of 420 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 52 | 29% | 82 |
| radnor.DoctorBob 1.42 | 34 | 19% | 91 |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 16% | 115 |
| KiraNL.Chupacabra 0.4 | 29 | 16% | 51 |
| amz.NanoClone 1.41 | 21 | 12% | 38 |
| jangs.ns51 1.0 | 6 | 3% | 13 |
| sample.Walls 1.0 | 5 | 3% | 19 |
| GarmBox.Oranges 1.0 | 3 | 2% | 8 |

