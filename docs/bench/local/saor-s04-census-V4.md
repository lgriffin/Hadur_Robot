# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 90.0 | 311 / 420 | 1.90 | 21.5% | 84582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 21.5% | 311 |
| radnor.DoctorBob 1.42 | 2.6 | 14.1% | 38 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 21 |
| mld.Infinity 2.2 | 3.8 | 12.7% | 38 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 5 |
| sample.Walls 1.0 | 6.4 | 7.1% | 4 |
| GarmBox.Oranges 1.0 | 7.2 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 1 |
| sample.Target 1.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 91.7 | 26 / 35 | 7518 |
| 2 | 1 | 72.0 | 89.5 | 26 / 35 | 6887 |
| 3 | 1 | 73.3 | 92.4 | 28 / 35 | 7344 |
| 4 | 1 | 72.6 | 91.4 | 27 / 35 | 7172 |
| 5 | 1 | 72.6 | 90.5 | 27 / 35 | 7314 |
| 6 | 1 | 73.5 | 93.7 | 28 / 35 | 7413 |
| 7 | 1 | 71.7 | 86.7 | 23 / 35 | 7018 |
| 8 | 1 | 73.1 | 92.7 | 28 / 35 | 6985 |
| 9 | 1 | 68.9 | 80.3 | 22 / 35 | 6011 |
| 10 | 1 | 72.0 | 88.6 | 27 / 35 | 6894 |
| 11 | 1 | 72.7 | 92.1 | 26 / 35 | 7131 |
| 12 | 1 | 71.6 | 90.5 | 23 / 35 | 6895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 138 | 96% |
| mld.Infinity 2.2 | 88 | 92% |
| radnor.DoctorBob 1.42 | 82 | 84% |
| jangs.ns51 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 8 | 75% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 110 of 420 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 41% | 153 |
| mz.AntiGrav 1.0 | 25 | 23% | 150 |
| mld.Infinity 2.2 | 15 | 14% | 32 |
| amz.NanoClone 1.41 | 14 | 13% | 27 |
| sample.Walls 1.0 | 5 | 5% | 24 |
| arthord.MannyPacquiao Beta | 3 | 3% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 13 |

## Melee bench: F02

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.4 | 269 / 420 | 2.22 | 19.0% | 62339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.1 | 19.0% | 269 |
| oog.melee.Mercutio 1.0 | 1.9 | 14.8% | 108 |
| mld.DustBunny 3.8 | 3.2 | 13.0% | 16 |
| maribo.melee.BMV 0.1 | 4.2 | 10.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.0% | 9 |
| zyx.nano.Ant 1.1 | 6.5 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 7.5% | 11 |
| bzdp.BoxCar 2.0 | 8.2 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.4 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.7 | 23 / 35 | 5047 |
| 2 | 1 | 70.1 | 93.0 | 30 / 35 | 4710 |
| 3 | 1 | 70.4 | 93.0 | 28 / 35 | 5637 |
| 4 | 1 | 68.6 | 88.9 | 22 / 35 | 4831 |
| 5 | 1 | 69.1 | 89.8 | 23 / 35 | 5079 |
| 6 | 1 | 70.0 | 91.4 | 23 / 35 | 5534 |
| 7 | 1 | 70.9 | 92.1 | 27 / 35 | 5588 |
| 8 | 1 | 69.1 | 88.9 | 24 / 35 | 5112 |
| 9 | 1 | 68.6 | 87.0 | 19 / 35 | 5390 |
| 10 | 2 | 61.6 | 58.1 | 6 / 35 | 5005 |
| 11 | 1 | 68.8 | 84.8 | 22 / 35 | 5369 |
| 12 | 1 | 68.0 | 83.2 | 22 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 152 | 70% |
| mld.DustBunny 3.8 | 109 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 71% |
| djdjdj.NanoSkunk10 1.0 | 16 | 94% |
| fullsail.SweetTea 1.1 | 16 | 100% |
| maribo.melee.BMV 0.1 | 14 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 152 of 420 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 42% | 175 |
| mld.DustBunny 3.8 | 29 | 19% | 104 |
| zyx.nano.Ant 1.1 | 19 | 13% | 26 |
| maribo.melee.BMV 0.1 | 10 | 7% | 22 |
| djdjdj.NanoSkunk10 1.0 | 7 | 5% | 35 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 5% | 24 |
| cs.Grudge 1.0 | 7 | 5% | 7 |
| fullsail.SweetTea 1.1 | 6 | 4% | 20 |
| bzdp.BoxCar 2.0 | 3 | 2% | 7 |

## Melee bench: F03

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.5 | 300 / 420 | 2.12 | 20.6% | 73402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 20.6% | 300 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 4.6 | 10.4% | 17 |
| cb.nano.Insomnia 1.0 | 4.9 | 9.7% | 17 |
| fm.mammillarias 1.3 | 5.8 | 8.9% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 14 |
| sample.Fire 1.0 | 9.4 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 90.2 | 25 / 35 | 6197 |
| 2 | 1 | 71.7 | 90.5 | 28 / 35 | 6250 |
| 3 | 1 | 70.4 | 84.8 | 26 / 35 | 6291 |
| 4 | 1 | 72.6 | 92.7 | 27 / 35 | 6696 |
| 5 | 1 | 70.1 | 84.8 | 22 / 35 | 6145 |
| 6 | 1 | 69.5 | 83.5 | 22 / 35 | 6182 |
| 7 | 1 | 68.4 | 79.0 | 22 / 35 | 5848 |
| 8 | 1 | 70.1 | 85.7 | 25 / 35 | 5805 |
| 9 | 1 | 71.2 | 90.5 | 27 / 35 | 5860 |
| 10 | 1 | 70.3 | 84.8 | 24 / 35 | 6123 |
| 11 | 1 | 70.2 | 89.5 | 23 / 35 | 5606 |
| 12 | 1 | 72.6 | 94.6 | 29 / 35 | 6399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 111 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 75 | 93% |
| cb.nano.Insomnia 1.0 | 49 | 88% |
| myl.nano.KomoriNinja 1.1 | 45 | 89% |
| sp.Nanos.Ember 1.1 | 24 | 83% |
| fm.mammillarias 1.3 | 12 | 83% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 19% | 140 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 18% | 78 |
| cb.nano.Insomnia 1.0 | 20 | 17% | 24 |
| myl.nano.KomoriNinja 1.1 | 18 | 15% | 69 |
| sp.Nanos.Ember 1.1 | 11 | 9% | 37 |
| fm.mammillarias 1.3 | 9 | 8% | 25 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 23 |
| sample.Fire 1.0 | 6 | 5% | 16 |
| sample.Tracker 1.0 | 5 | 4% | 6 |

## Melee bench: F04

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.3 | 318 / 420 | 1.96 | 21.1% | 78111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 21.1% | 318 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 28 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.9 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 5.0 | 9.1% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.7% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.0% | 15 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 6 |
| repositorio.NanoStep 1.0 | 8.9 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.8 | 23 / 35 | 6217 |
| 2 | 1 | 70.0 | 84.8 | 23 / 35 | 6278 |
| 3 | 1 | 73.4 | 95.2 | 30 / 35 | 7347 |
| 4 | 1 | 71.1 | 87.0 | 26 / 35 | 6625 |
| 5 | 1 | 71.0 | 90.5 | 27 / 35 | 6203 |
| 6 | 1 | 71.9 | 92.4 | 29 / 35 | 6448 |
| 7 | 1 | 69.9 | 85.1 | 26 / 35 | 6350 |
| 8 | 1 | 70.8 | 88.3 | 27 / 35 | 6258 |
| 9 | 1 | 71.4 | 91.7 | 26 / 35 | 6576 |
| 10 | 1 | 72.0 | 89.5 | 28 / 35 | 6924 |
| 11 | 1 | 71.1 | 88.9 | 27 / 35 | 6497 |
| 12 | 1 | 71.8 | 93.3 | 26 / 35 | 6388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 134 | 90% |
| stelo.SoJNanoMelee 1.1 | 88 | 92% |
| tvv.micro.Antares 1.1.1 | 36 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 33 | 79% |
| tj.zombie1n 1.0.1 | 33 | 88% |
| yk.JahMicro 1.0 | 13 | 77% |
| repositorio.NanoStep 1.0 | 11 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 102 of 420 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 36 | 35% | 179 |
| stelo.SoJNanoMelee 1.1 | 13 | 13% | 53 |
| ers.nano.hawk.HawkLA 3.0m | 12 | 12% | 49 |
| tvv.micro.Antares 1.1.1 | 11 | 11% | 45 |
| yk.JahMicro 1.0 | 9 | 9% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 9% | 18 |
| tj.zombie1n 1.0.1 | 8 | 8% | 14 |
| repositorio.NanoStep 1.0 | 3 | 3% | 23 |
| sample.VelociRobot 1.0 | 1 | 1% | 15 |

## Melee bench: F05

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.4 | 207 / 420 | 3.57 | 16.3% | 58950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 16.3% | 207 |
| oog.melee.Corsair 1.0 | 2.1 | 12.7% | 63 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 51 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 36 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 26 |
| zyx.nano.BacillusComma 1.0 | 6.1 | 9.3% | 17 |
| EBBU.Sim2 1.02 | 6.4 | 9.5% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7.1 | 8.8% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.4% | 0 |
| sample.TrackFire 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 72.7 | 17 / 35 | 5062 |
| 2 | 1 | 67.5 | 82.2 | 21 / 35 | 5264 |
| 3 | 1 | 63.0 | 69.5 | 17 / 35 | 4349 |
| 4 | 1 | 64.1 | 69.8 | 15 / 35 | 5401 |
| 5 | 1 | 63.6 | 67.9 | 16 / 35 | 5037 |
| 6 | 1 | 60.8 | 62.2 | 15 / 35 | 4693 |
| 7 | 1 | 65.6 | 77.5 | 21 / 35 | 4571 |
| 8 | 1 | 63.5 | 69.5 | 18 / 35 | 4773 |
| 9 | 1 | 63.6 | 69.8 | 15 / 35 | 4851 |
| 10 | 1 | 66.6 | 77.1 | 19 / 35 | 5303 |
| 11 | 1 | 65.8 | 77.5 | 19 / 35 | 4981 |
| 12 | 1 | 60.7 | 61.0 | 14 / 35 | 4665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 70 | 96% |
| oog.melee.Corsair 1.0 | 68 | 62% |
| ahf.NanoAndrew .4 | 40 | 83% |
| EBBU.Sim2 1.02 | 22 | 95% |
| sam.Samspin 1.0 | 20 | 100% |
| zyx.nano.BacillusComma 1.0 | 12 | 92% |
| robar.nano.Assertive_Melee 0.2 | 12 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 215 of 420 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 20% | 89 |
| robar.nano.Assertive_Melee 0.2 | 35 | 16% | 43 |
| simonton.nano.MeleeSeed 1.8 | 32 | 15% | 93 |
| EBBU.Sim2 1.02 | 25 | 12% | 42 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 11% | 22 |
| zyx.nano.BacillusComma 1.0 | 20 | 9% | 36 |
| ahf.NanoAndrew .4 | 17 | 8% | 56 |
| sam.Samspin 1.0 | 14 | 7% | 26 |
| sample.TrackFire 1.0 | 7 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.1 | 292 / 420 | 2.16 | 19.4% | 63478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 19.4% | 292 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.2% | 37 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.9% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.4% | 41 |
| winamp32.micro.MicroMacro 1.0 | 5.4 | 9.0% | 14 |
| fm.claire 1.7 | 6.0 | 8.3% | 2 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.2% | 2 |
| sample.SpinBot 1.0 | 8.2 | 6.7% | 1 |
| pa.Improved 1.0 | 9.0 | 6.0% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 28 / 35 | 5136 |
| 2 | 1 | 68.3 | 82.2 | 23 / 35 | 5662 |
| 3 | 1 | 67.9 | 82.9 | 23 / 35 | 4744 |
| 4 | 1 | 70.9 | 90.8 | 27 / 35 | 5831 |
| 5 | 1 | 69.4 | 89.2 | 25 / 35 | 5384 |
| 6 | 1 | 69.9 | 89.2 | 25 / 35 | 5633 |
| 7 | 1 | 68.5 | 86.7 | 24 / 35 | 4899 |
| 8 | 1 | 69.2 | 88.9 | 23 / 35 | 5497 |
| 9 | 1 | 70.9 | 93.0 | 27 / 35 | 5622 |
| 10 | 1 | 66.2 | 80.6 | 19 / 35 | 4535 |
| 11 | 1 | 68.3 | 85.4 | 25 / 35 | 4958 |
| 12 | 1 | 69.4 | 88.6 | 23 / 35 | 5577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 133 | 91% |
| oog.melee.CapuletDroid 1.1 | 88 | 84% |
| gh.nano.Grofvuil 0.2 | 41 | 88% |
| arthord.NanoSatanMelee Beta | 22 | 95% |
| winamp32.micro.MicroMacro 1.0 | 18 | 89% |
| sample.SpinBot 1.0 | 8 | 100% |
| kurios.DOSexe .9b | 7 | 86% |
| pa.Improved 1.0 | 6 | 100% |
| fm.claire 1.7 | 5 | 80% |

Hadur died in 132 of 420 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 27% | 159 |
| oog.melee.CapuletDroid 1.1 | 26 | 20% | 37 |
| gh.nano.Grofvuil 0.2 | 24 | 18% | 89 |
| arthord.NanoSatanMelee Beta | 14 | 11% | 34 |
| winamp32.micro.MicroMacro 1.0 | 8 | 6% | 32 |
| kurios.DOSexe .9b | 8 | 6% | 26 |
| fm.claire 1.7 | 7 | 5% | 16 |
| sample.SpinBot 1.0 | 6 | 5% | 17 |
| pa.Improved 1.0 | 1 | 1% | 9 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.9 | 210 / 420 | 2.45 | 18.5% | 67669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 18.5% | 210 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.2% | 93 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.0% | 34 |
| mz.MicroGodMelee 1 | 3.6 | 12.8% | 61 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.2% | 3 |
| DBall.Anarchy 0.1 | 5.7 | 8.2% | 8 |
| el.JumpShoot 0.2 | 7.4 | 6.6% | 8 |
| mbro.Detektor3 0.1.1 | 8.6 | 5.9% | 3 |
| acogdev.alpha 0.2 | 8.8 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.9 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.9 | 16 / 35 | 5351 |
| 2 | 1 | 68.8 | 84.8 | 20 / 35 | 6022 |
| 3 | 1 | 68.2 | 86.3 | 13 / 35 | 5689 |
| 4 | 1 | 66.9 | 80.3 | 14 / 35 | 5402 |
| 5 | 1 | 68.2 | 86.3 | 17 / 35 | 5466 |
| 6 | 1 | 69.3 | 87.6 | 24 / 35 | 5509 |
| 7 | 1 | 66.9 | 78.7 | 15 / 35 | 5483 |
| 8 | 1 | 69.0 | 86.3 | 16 / 35 | 6311 |
| 9 | 1 | 67.1 | 76.5 | 15 / 35 | 6094 |
| 10 | 1 | 69.8 | 89.2 | 22 / 35 | 5611 |
| 11 | 1 | 68.5 | 86.7 | 21 / 35 | 5087 |
| 12 | 1 | 67.5 | 81.3 | 17 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 96 | 84% |
| mz.MicroGodMelee 1 | 94 | 57% |
| gh.micro.Gruweltje 0.7 | 72 | 39% |
| DBall.Anarchy 0.1 | 24 | 100% |
| el.JumpShoot 0.2 | 9 | 89% |
| caimano.Furia_Ceca 0.22 | 7 | 71% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| acogdev.alpha 0.2 | 4 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 211 of 420 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 71 | 34% | 132 |
| gh.micro.Gruweltje 0.7 | 65 | 31% | 110 |
| spinnercat.micro.Tyger 0.1 | 34 | 16% | 91 |
| fire219.CatBot 1.0 | 10 | 5% | 12 |
| acogdev.alpha 0.2 | 9 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 8 | 4% | 17 |
| DBall.Anarchy 0.1 | 6 | 3% | 26 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 13 |
| el.JumpShoot 0.2 | 3 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.9 | 226 / 420 | 3.44 | 16.9% | 64342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.2 | 16.9% | 226 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.8% | 74 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.9 | 13.1% | 50 |
| qualidafial.MajorDick 1.0.1 | 5.1 | 9.5% | 15 |
| germ.TheMind .2 | 5.3 | 9.3% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5.9 | 8.8% | 12 |
| awesomeness.Elite 1.0 | 6.6 | 8.5% | 13 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.9% | 10 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 75.9 | 23 / 35 | 5834 |
| 2 | 1 | 61.9 | 65.4 | 15 / 35 | 4702 |
| 3 | 1 | 63.6 | 69.5 | 15 / 35 | 5161 |
| 4 | 2 | 64.2 | 68.9 | 16 / 35 | 5162 |
| 5 | 1 | 68.8 | 84.1 | 23 / 35 | 5744 |
| 6 | 1 | 65.5 | 72.1 | 19 / 35 | 5133 |
| 7 | 1 | 68.5 | 79.7 | 23 / 35 | 6042 |
| 8 | 1 | 68.0 | 81.9 | 24 / 35 | 5360 |
| 9 | 1 | 60.9 | 58.4 | 13 / 35 | 5303 |
| 10 | 1 | 67.9 | 79.0 | 23 / 35 | 5405 |
| 11 | 1 | 65.6 | 72.1 | 17 / 35 | 5601 |
| 12 | 2 | 62.9 | 67.9 | 15 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 157 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 83% |
| germ.TheMind .2 | 19 | 89% |
| qualidafial.MajorDick 1.0.1 | 15 | 93% |
| stelo.UntouchableNano 1.3 | 13 | 92% |
| lrem.micro.MoggFanatic 0.2 | 9 | 67% |
| awesomeness.Elite 1.0 | 8 | 63% |
| sample.Crazy 1.0 | 6 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 195 of 420 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 47% | 213 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 16% | 66 |
| awesomeness.Elite 1.0 | 21 | 11% | 31 |
| lrem.micro.MoggFanatic 0.2 | 14 | 7% | 21 |
| qualidafial.MajorDick 1.0.1 | 13 | 7% | 22 |
| stelo.UntouchableNano 1.3 | 11 | 6% | 26 |
| germ.TheMind .2 | 8 | 4% | 27 |
| sample.Crazy 1.0 | 3 | 2% | 9 |
| mym.EdgeStalker 1.0 | 3 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.9 | 316 / 420 | 2.00 | 20.1% | 60415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 20.1% | 316 |
| rz.HawkOnFire 0.1 | 2.3 | 13.2% | 28 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 12.0% | 29 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 3 |
| timmit.nano.TimDog 0.33 | 5.4 | 9.8% | 12 |
| ratosh.Wesco 1.4 | 7.9 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 7.9 | 8.0% | 6 |
| stelo.PatternRobot 1.0 | 8.1 | 7.7% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 95.2 | 30 / 35 | 5156 |
| 2 | 1 | 70.9 | 92.4 | 28 / 35 | 4713 |
| 3 | 1 | 70.9 | 90.8 | 25 / 35 | 5020 |
| 4 | 1 | 70.4 | 88.6 | 25 / 35 | 5089 |
| 5 | 1 | 69.4 | 82.5 | 23 / 35 | 5094 |
| 6 | 1 | 69.5 | 86.0 | 26 / 35 | 4857 |
| 7 | 1 | 69.6 | 85.7 | 24 / 35 | 5221 |
| 8 | 1 | 70.8 | 91.4 | 29 / 35 | 5103 |
| 9 | 1 | 72.3 | 94.0 | 29 / 35 | 5563 |
| 10 | 1 | 69.4 | 86.3 | 25 / 35 | 4704 |
| 11 | 1 | 69.3 | 85.7 | 27 / 35 | 4656 |
| 12 | 1 | 70.7 | 88.6 | 25 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 127 | 96% |
| nz.jdc.nano.GridFu 1.0 | 85 | 96% |
| stelo.PatternRobot 1.0 | 32 | 97% |
| timmit.nano.TimDog 0.33 | 20 | 100% |
| maribo.IotaCT 1.1 | 19 | 79% |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 94% |
| ratosh.Wesco 1.4 | 16 | 88% |
| spinnercat.Omen 1.0 | 15 | 100% |

Hadur died in 106 of 420 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 22 | 21% | 53 |
| rz.HawkOnFire 0.1 | 18 | 17% | 112 |
| maribo.IotaCT 1.1 | 16 | 15% | 47 |
| nz.jdc.nano.GridFu 1.0 | 14 | 13% | 106 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 10% | 22 |
| stelo.PatternRobot 1.0 | 9 | 8% | 33 |
| ratosh.Wesco 1.4 | 9 | 8% | 25 |
| spinnercat.Omen 1.0 | 5 | 5% | 18 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.4 | 360 / 420 | 1.59 | 21.8% | 77907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 21.8% | 360 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 21 |
| baal.nano.N 1.42 | 2.9 | 11.3% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.8% | 3 |
| zyx.micro.Ant 1.1 | 5.2 | 9.1% | 12 |
| sanja.First 0.1 | 6.3 | 8.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.9 | 8.0% | 3 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 7 |
| amk.Punbot.Punbot 0.01 | 8.4 | 7.1% | 4 |
| sample.RamFire 1.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 31 / 35 | 6099 |
| 2 | 1 | 72.7 | 92.7 | 29 / 35 | 7064 |
| 3 | 1 | 71.4 | 92.7 | 30 / 35 | 6245 |
| 4 | 1 | 71.4 | 91.7 | 30 / 35 | 6555 |
| 5 | 1 | 72.2 | 94.0 | 29 / 35 | 6805 |
| 6 | 1 | 71.0 | 91.1 | 28 / 35 | 6400 |
| 7 | 1 | 71.7 | 96.2 | 30 / 35 | 6227 |
| 8 | 1 | 71.0 | 90.5 | 27 / 35 | 6250 |
| 9 | 1 | 72.2 | 94.6 | 31 / 35 | 6522 |
| 10 | 1 | 73.4 | 100.0 | 35 / 35 | 6818 |
| 11 | 1 | 71.8 | 93.0 | 30 / 35 | 6585 |
| 12 | 1 | 71.5 | 93.0 | 30 / 35 | 6337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 91 | 93% |
| baal.nano.N 1.42 | 77 | 100% |
| cvt.Firsty 1.0 | 57 | 95% |
| sanja.First 0.1 | 43 | 98% |
| Grystrion.TrackerWO 1.0 | 33 | 97% |
| amk.Punbot.Punbot 0.01 | 33 | 100% |
| zyx.micro.Ant 1.1 | 29 | 90% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 63 of 420 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 14 | 22% | 123 |
| zyx.micro.Ant 1.1 | 14 | 22% | 66 |
| cvt.Firsty 1.0 | 10 | 16% | 50 |
| Grystrion.TrackerWO 1.0 | 6 | 10% | 44 |
| sample.RamFire 1.0 | 5 | 8% | 7 |
| baal.nano.N 1.42 | 4 | 6% | 64 |
| sanja.First 0.1 | 4 | 6% | 37 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 12 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 67.1 | 142 / 420 | 3.96 | 14.9% | 59311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.8% | 145 |
| hadur117.micro.SaorV4 0.1 | 1.7 | 14.9% | 142 |
| cs.Wren 1.0 | 2.8 | 12.6% | 44 |
| js.PinBall 1.6 | 4.5 | 11.2% | 31 |
| mz.Cork 0.1 | 4.7 | 10.8% | 24 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 6 |
| evd.X1 0.01 | 6.6 | 8.6% | 8 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 9 |
| donjezza.Jezza 1.0 | 9.3 | 5.7% | 12 |
| PSW.Relentless 0.1 | 9.4 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.9 | 13 / 35 | 5421 |
| 2 | 1 | 64.4 | 72.4 | 14 / 35 | 5167 |
| 3 | 2 | 61.1 | 64.4 | 8 / 35 | 4852 |
| 4 | 1 | 62.6 | 67.0 | 11 / 35 | 5239 |
| 5 | 2 | 60.2 | 63.2 | 9 / 35 | 4550 |
| 6 | 2 | 61.2 | 64.1 | 15 / 35 | 4604 |
| 7 | 2 | 60.2 | 62.9 | 10 / 35 | 4759 |
| 8 | 2 | 60.3 | 60.0 | 9 / 35 | 5064 |
| 9 | 3 | 59.5 | 61.6 | 8 / 35 | 4642 |
| 10 | 2 | 62.7 | 67.9 | 13 / 35 | 4726 |
| 11 | 1 | 64.1 | 72.4 | 16 / 35 | 4931 |
| 12 | 1 | 64.9 | 73.0 | 16 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 126 | 53% |
| cs.Wren 1.0 | 33 | 88% |
| mz.Cork 0.1 | 21 | 71% |
| js.PinBall 1.6 | 20 | 65% |
| donjezza.Jezza 1.0 | 6 | 100% |
| evd.X1 0.01 | 5 | 100% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 280 of 420 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 140 | 50% | 217 |
| joe.ADinosaur 1.0 | 27 | 10% | 31 |
| mz.Cork 0.1 | 26 | 9% | 37 |
| cs.Wren 1.0 | 23 | 8% | 40 |
| js.PinBall 1.6 | 21 | 8% | 38 |
| evd.X1 0.01 | 21 | 8% | 25 |
| PSW.Relentless 0.1 | 16 | 6% | 14 |
| jsal.Jsalbot 1.0 | 6 | 2% | 11 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |

## Melee bench: F12

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.2 | 289 / 420 | 2.33 | 19.4% | 60711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 19.4% | 289 |
| ntc.Opposite 1.5 | 2.9 | 11.5% | 19 |
| myl.nano.Graviton 1.10 | 3.4 | 11.2% | 37 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.0% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.0% | 9 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 10 |
| DBall.NUKE 0.1 | 7.6 | 8.2% | 8 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 12 |
| pbg.R2D2 1.0 | 9.9 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 24 / 35 | 4699 |
| 2 | 1 | 68.1 | 84.8 | 22 / 35 | 4732 |
| 3 | 1 | 69.7 | 86.7 | 24 / 35 | 5224 |
| 4 | 1 | 68.0 | 83.5 | 22 / 35 | 4669 |
| 5 | 1 | 68.6 | 81.3 | 24 / 35 | 5208 |
| 6 | 1 | 68.2 | 82.9 | 22 / 35 | 4980 |
| 7 | 1 | 68.8 | 85.4 | 25 / 35 | 5032 |
| 8 | 1 | 67.7 | 81.3 | 23 / 35 | 5068 |
| 9 | 1 | 69.1 | 85.1 | 26 / 35 | 4869 |
| 10 | 1 | 69.7 | 88.3 | 26 / 35 | 5525 |
| 11 | 1 | 70.6 | 90.2 | 25 / 35 | 5427 |
| 12 | 1 | 69.8 | 87.6 | 26 / 35 | 5278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 69 | 90% |
| myl.nano.Graviton 1.10 | 66 | 94% |
| ntc.Opposite 1.5 | 46 | 96% |
| donjezza.Muncho 1.0 | 37 | 92% |
| disan.Chair 2.2.0 | 27 | 96% |
| DBall.NUKE 0.1 | 26 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 25 | 92% |
| pfvicm.Sobieski 7.2.3b | 13 | 77% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 132 of 420 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 29 | 22% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 27 | 20% | 61 |
| stelo.AreaTargetingBot 1.1 | 22 | 17% | 72 |
| ntc.Opposite 1.5 | 21 | 16% | 53 |
| myl.nano.Graviton 1.10 | 14 | 11% | 78 |
| disan.Chair 2.2.0 | 9 | 7% | 32 |
| donjezza.Muncho 1.0 | 5 | 4% | 30 |
| pbg.R2D2 1.0 | 3 | 2% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 32 |

## Melee bench: F13

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.3 | 171 / 420 | 3.67 | 15.5% | 52582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.3 | 15.5% | 171 |
| oog.melee.Capulet 1.2 | 2.3 | 14.1% | 100 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.7% | 43 |
| yagami.Tidus 0.11 | 4.6 | 12.2% | 24 |
| ejb.Polaris 1.0.1 | 5.9 | 10.4% | 14 |
| stelo.MirrorNano 1.3 | 7.1 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.9 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.6 | 16 / 35 | 4578 |
| 2 | 1 | 65.4 | 74.3 | 13 / 35 | 4628 |
| 3 | 1 | 66.5 | 75.9 | 17 / 35 | 4847 |
| 4 | 1 | 63.3 | 69.8 | 12 / 35 | 4058 |
| 5 | 1 | 63.3 | 69.8 | 11 / 35 | 4317 |
| 6 | 3 | 60.2 | 58.4 | 13 / 35 | 3803 |
| 7 | 1 | 62.6 | 65.1 | 15 / 35 | 4422 |
| 8 | 3 | 61.5 | 62.9 | 12 / 35 | 4212 |
| 9 | 1 | 65.1 | 72.1 | 16 / 35 | 4398 |
| 10 | 1 | 65.1 | 74.9 | 17 / 35 | 4333 |
| 11 | 1 | 61.3 | 62.5 | 11 / 35 | 4150 |
| 12 | 1 | 67.8 | 82.2 | 18 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 72 | 46% |
| kawigi.micro.Shiz 1.1 | 54 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 87% |
| yagami.Tidus 0.11 | 33 | 97% |
| ejb.Polaris 1.0.1 | 12 | 83% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 250 of 420 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 116 | 46% | 160 |
| yagami.Tidus 0.11 | 33 | 13% | 63 |
| ejb.Polaris 1.0.1 | 24 | 10% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 9% | 66 |
| kawigi.micro.Shiz 1.1 | 18 | 7% | 53 |
| step.nanoPri 1.0 | 15 | 6% | 16 |
| stelo.MirrorNano 1.3 | 11 | 4% | 13 |
| kurios.DOSexe .9a | 10 | 4% | 10 |

## Melee bench: F14

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.5 | 274 / 420 | 2.40 | 18.4% | 55814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 18.4% | 274 |
| wompi.Quokka 1.6 | 3.3 | 11.6% | 30 |
| bzdp.Pansy 2.1 | 3.6 | 11.6% | 23 |
| wee.Gem 1.8.4 | 3.7 | 11.7% | 52 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 23 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 8.9 | 6.0% | 2 |
| maribo.FollowFire 1 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 24 / 35 | 4625 |
| 2 | 1 | 62.5 | 67.3 | 16 / 35 | 4283 |
| 3 | 1 | 70.1 | 91.4 | 28 / 35 | 5102 |
| 4 | 1 | 65.1 | 76.5 | 17 / 35 | 4518 |
| 5 | 1 | 67.9 | 82.5 | 24 / 35 | 4828 |
| 6 | 1 | 70.0 | 91.7 | 28 / 35 | 4872 |
| 7 | 1 | 68.4 | 87.9 | 22 / 35 | 4808 |
| 8 | 1 | 66.0 | 78.4 | 21 / 35 | 4280 |
| 9 | 1 | 67.9 | 83.8 | 23 / 35 | 4787 |
| 10 | 1 | 68.1 | 88.6 | 25 / 35 | 4290 |
| 11 | 1 | 68.4 | 88.3 | 21 / 35 | 4851 |
| 12 | 1 | 68.4 | 87.9 | 25 / 35 | 4570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 91 | 84% |
| bzdp.Pansy 2.1 | 88 | 93% |
| wompi.Quokka 1.6 | 51 | 78% |
| ratosh.Nobo 0.21 | 34 | 91% |
| m3thos.Eva00 1.1 | 28 | 96% |
| bayen.UbaMicro 1.4 | 12 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 148 of 420 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 27 | 18% | 64 |
| bzdp.Pansy 2.1 | 26 | 18% | 88 |
| wee.Gem 1.8.4 | 21 | 14% | 110 |
| bayen.UbaMicro 1.4 | 17 | 11% | 31 |
| maribo.FollowFire 1 | 16 | 11% | 23 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 10% | 20 |
| ratosh.Nobo 0.21 | 13 | 9% | 48 |
| m3thos.Eva00 1.1 | 7 | 5% | 19 |
| stelo.MyAgileRobot 0.2 | 6 | 4% | 11 |

## Melee bench: F15

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 83.9 | 134 / 420 | 2.45 | 19.5% | 90197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 20.0% | 253 |
| hadur117.micro.SaorV4 0.1 | 1.7 | 19.5% | 134 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 24 |
| ayk.WallHugger 1.0 | 4.3 | 9.6% | 5 |
| exauge.GateKeeper 1.1.121g | 5.2 | 8.8% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.9 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 7.9 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 88.6 | 15 / 35 | 7313 |
| 2 | 2 | 68.2 | 76.8 | 6 / 35 | 7286 |
| 3 | 2 | 69.8 | 79.4 | 11 / 35 | 7663 |
| 4 | 2 | 69.5 | 80.0 | 13 / 35 | 7041 |
| 5 | 2 | 71.2 | 86.0 | 10 / 35 | 8105 |
| 6 | 2 | 70.7 | 82.9 | 10 / 35 | 7646 |
| 7 | 2 | 71.3 | 88.3 | 10 / 35 | 7467 |
| 8 | 1 | 71.1 | 85.1 | 11 / 35 | 7787 |
| 9 | 2 | 70.4 | 85.7 | 11 / 35 | 7049 |
| 10 | 1 | 72.7 | 90.2 | 16 / 35 | 8158 |
| 11 | 1 | 71.3 | 86.0 | 12 / 35 | 7685 |
| 12 | 2 | 68.8 | 78.1 | 9 / 35 | 6997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 231 | 31% |
| mz.NanoGod 2.02 | 40 | 75% |
| ayk.WallHugger 1.0 | 11 | 82% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 289 of 420 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 209 | 72% | 292 |
| mz.NanoGod 2.02 | 48 | 17% | 76 |
| exauge.GateKeeper 1.1.121g | 16 | 6% | 18 |
| ayk.WallHugger 1.0 | 8 | 3% | 18 |
| stuff.Vlad 0.1 | 5 | 2% | 6 |
| stelo.PianistNano 1.2 | 3 | 1% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.9 | 234 / 420 | 3.35 | 16.9% | 57630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 16.9% | 234 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 12.8% | 39 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.8% | 41 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.6 | 10.9% | 38 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 13 |
| conscience.Electron 1.3g | 7.1 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.6 | 6.6% | 15 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 72.7 | 19 / 35 | 4913 |
| 2 | 1 | 68.5 | 85.4 | 27 / 35 | 4999 |
| 3 | 1 | 62.7 | 65.4 | 16 / 35 | 4709 |
| 4 | 1 | 66.2 | 76.2 | 21 / 35 | 4896 |
| 5 | 1 | 65.6 | 74.6 | 19 / 35 | 4905 |
| 6 | 1 | 65.5 | 73.7 | 20 / 35 | 4839 |
| 7 | 1 | 66.5 | 76.2 | 21 / 35 | 5217 |
| 8 | 1 | 63.6 | 67.9 | 18 / 35 | 4514 |
| 9 | 1 | 63.9 | 69.2 | 15 / 35 | 4771 |
| 10 | 1 | 64.0 | 69.2 | 16 / 35 | 4881 |
| 11 | 1 | 61.0 | 64.4 | 15 / 35 | 4023 |
| 12 | 1 | 70.1 | 92.1 | 27 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 85 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 61 | 82% |
| dummy.micro.Sparrow 2.5 | 50 | 88% |
| bvh.micro.Freya 0.3 | 38 | 95% |
| stelo.MirrorMicro 1.0 | 14 | 79% |
| ap.Frederick 1.1 | 10 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 187 of 420 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 32 | 17% | 32 |
| voidious.micro.BlitzBat 1.05 | 28 | 15% | 95 |
| dummy.micro.Sparrow 2.5 | 28 | 15% | 75 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 14% | 89 |
| conscience.Electron 1.3g | 26 | 14% | 34 |
| dl.BetterWalls 1.0 | 17 | 9% | 31 |
| stelo.MirrorMicro 1.0 | 15 | 8% | 33 |
| bvh.micro.Freya 0.3 | 15 | 8% | 30 |

## Melee bench: F17

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.3 | 316 / 420 | 2.05 | 21.1% | 81646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 21.1% | 316 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 37 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 24 |
| supersample.SuperBoxBot 1.0 | 3.9 | 10.6% | 13 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 7 |
| dsw.StaticD 1.0 | 5.6 | 8.6% | 7 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.6 | 6.2% | 6 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.0% | 10 |
| sample.Corners 1.0 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.3 | 30 / 35 | 6875 |
| 2 | 1 | 70.4 | 84.4 | 25 / 35 | 6852 |
| 3 | 1 | 69.7 | 81.6 | 25 / 35 | 6559 |
| 4 | 1 | 70.8 | 89.2 | 27 / 35 | 6533 |
| 5 | 1 | 72.8 | 93.7 | 26 / 35 | 7308 |
| 6 | 1 | 71.1 | 88.3 | 27 / 35 | 6656 |
| 7 | 1 | 72.1 | 92.4 | 28 / 35 | 6520 |
| 8 | 1 | 72.8 | 92.1 | 28 / 35 | 7320 |
| 9 | 1 | 71.4 | 88.6 | 26 / 35 | 6796 |
| 10 | 1 | 70.6 | 86.3 | 25 / 35 | 6846 |
| 11 | 1 | 70.1 | 84.4 | 23 / 35 | 6704 |
| 12 | 1 | 70.8 | 84.8 | 26 / 35 | 6677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 103 | 90% |
| sul.Lunar 1.1 | 93 | 98% |
| supersample.SuperBoxBot 1.0 | 41 | 93% |
| dsw.StaticD 1.0 | 28 | 86% |
| mme.NikeEnhanced 2.0 | 23 | 96% |
| sample.MyFirstRobot 1.0 | 20 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 92% |
| sample.Corners 1.0 | 11 | 100% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |

Hadur died in 108 of 420 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 29 | 27% | 121 |
| supersample.SuperBoxBot 1.0 | 28 | 26% | 66 |
| dsw.StaticD 1.0 | 17 | 16% | 50 |
| sample.MyFirstJuniorRobot 1.0 | 8 | 7% | 22 |
| mme.NikeEnhanced 2.0 | 7 | 6% | 24 |
| sul.Lunar 1.1 | 6 | 6% | 91 |
| sample.MyFirstRobot 1.0 | 6 | 6% | 19 |
| tlp.ThreeLeggedPig 1 | 3 | 3% | 9 |
| sample.Corners 1.0 | 1 | 1% | 17 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorV4 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.8 | 230 / 420 | 2.82 | 18.4% | 74699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV4 0.1 | 1.0 | 18.4% | 230 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 54 |
| mld.Wisdom 1.0 | 3.1 | 12.4% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 49 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 13 |
| amz.NanoClone 1.41 | 5.8 | 9.8% | 21 |
| sample.Walls 1.0 | 7.2 | 8.1% | 8 |
| GarmBox.Oranges 1.0 | 7.5 | 7.4% | 4 |
| jangs.ns51 1.0 | 8.9 | 5.9% | 6 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.1 | 22 / 35 | 6446 |
| 2 | 1 | 67.1 | 77.5 | 17 / 35 | 6199 |
| 3 | 1 | 67.0 | 78.1 | 18 / 35 | 5920 |
| 4 | 1 | 70.4 | 90.2 | 24 / 35 | 6472 |
| 5 | 1 | 68.6 | 81.6 | 24 / 35 | 6141 |
| 6 | 1 | 67.0 | 77.8 | 19 / 35 | 6039 |
| 7 | 1 | 67.2 | 77.5 | 13 / 35 | 6562 |
| 8 | 1 | 69.0 | 82.9 | 19 / 35 | 6629 |
| 9 | 1 | 67.0 | 78.1 | 19 / 35 | 5983 |
| 10 | 1 | 68.7 | 82.5 | 18 / 35 | 6651 |
| 11 | 1 | 68.0 | 78.1 | 20 / 35 | 6059 |
| 12 | 1 | 63.9 | 69.5 | 17 / 35 | 5598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 96 | 94% |
| radnor.DoctorBob 1.42 | 61 | 72% |
| mld.Wisdom 1.0 | 37 | 70% |
| amz.NanoClone 1.41 | 25 | 76% |
| KiraNL.Chupacabra 0.4 | 21 | 81% |
| jangs.ns51 1.0 | 12 | 92% |
| sample.Walls 1.0 | 12 | 100% |
| GarmBox.Oranges 1.0 | 7 | 71% |
| sample.Target 1.0 | 6 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 50 | 26% | 77 |
| radnor.DoctorBob 1.42 | 49 | 26% | 98 |
| KiraNL.Chupacabra 0.4 | 33 | 17% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 14% | 119 |
| amz.NanoClone 1.41 | 18 | 9% | 36 |
| GarmBox.Oranges 1.0 | 6 | 3% | 8 |
| sample.Walls 1.0 | 5 | 3% | 18 |
| jangs.ns51 1.0 | 2 | 1% | 11 |

