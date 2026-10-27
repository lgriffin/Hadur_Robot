# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.9 | 318 / 420 | 1.91 | 21.7% | 85937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.7% | 318 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 41 |
| mz.AntiGrav 1.0 | 3.0 | 13.7% | 19 |
| mld.Infinity 2.2 | 3.4 | 12.8% | 28 |
| amz.NanoClone 1.41 | 4.9 | 10.0% | 10 |
| sample.Walls 1.0 | 6.2 | 7.3% | 0 |
| GarmBox.Oranges 1.0 | 6.9 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.1 | 5.7% | 1 |
| arthord.MannyPacquiao Beta | 9.1 | 4.4% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.0 | 29 / 35 | 7305 |
| 2 | 1 | 73.2 | 88.6 | 26 / 35 | 8155 |
| 3 | 1 | 72.7 | 91.7 | 26 / 35 | 6984 |
| 4 | 1 | 70.8 | 85.1 | 25 / 35 | 6480 |
| 5 | 1 | 74.0 | 95.6 | 29 / 35 | 7721 |
| 6 | 1 | 73.2 | 91.4 | 30 / 35 | 7174 |
| 7 | 1 | 71.1 | 87.0 | 24 / 35 | 6480 |
| 8 | 1 | 72.2 | 87.3 | 25 / 35 | 7405 |
| 9 | 1 | 71.7 | 87.6 | 25 / 35 | 6758 |
| 10 | 1 | 72.5 | 88.9 | 27 / 35 | 7329 |
| 11 | 1 | 72.9 | 90.8 | 26 / 35 | 7295 |
| 12 | 1 | 72.6 | 91.7 | 26 / 35 | 6851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 135 | 99% |
| mld.Infinity 2.2 | 91 | 93% |
| radnor.DoctorBob 1.42 | 81 | 79% |
| jangs.ns51 1.0 | 14 | 93% |
| amz.NanoClone 1.41 | 9 | 78% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 103 of 420 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 47% | 156 |
| mld.Infinity 2.2 | 20 | 19% | 32 |
| mz.AntiGrav 1.0 | 14 | 14% | 158 |
| amz.NanoClone 1.41 | 11 | 11% | 24 |
| GarmBox.Oranges 1.0 | 4 | 4% | 9 |
| jangs.ns51 1.0 | 3 | 3% | 12 |
| arthord.MannyPacquiao Beta | 2 | 2% | 8 |
| sample.Walls 1.0 | 1 | 1% | 16 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.3 | 299 / 420 | 2.05 | 19.4% | 63129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 19.4% | 299 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 78 |
| mld.DustBunny 3.8 | 2.9 | 13.2% | 21 |
| maribo.melee.BMV 0.1 | 4.2 | 10.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 8 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 7.0 | 7.4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.4 | 7.1% | 5 |
| bzdp.BoxCar 2.0 | 8.3 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 98.1 | 31 / 35 | 5412 |
| 2 | 1 | 70.7 | 93.7 | 30 / 35 | 5325 |
| 3 | 1 | 69.4 | 91.4 | 24 / 35 | 5276 |
| 4 | 1 | 68.0 | 84.8 | 22 / 35 | 5067 |
| 5 | 1 | 69.6 | 89.2 | 26 / 35 | 5193 |
| 6 | 1 | 69.9 | 93.3 | 25 / 35 | 5313 |
| 7 | 1 | 69.6 | 89.5 | 26 / 35 | 5409 |
| 8 | 1 | 69.4 | 87.9 | 25 / 35 | 5175 |
| 9 | 1 | 68.6 | 85.7 | 24 / 35 | 5014 |
| 10 | 2 | 63.1 | 61.6 | 14 / 35 | 5084 |
| 11 | 1 | 69.3 | 91.4 | 25 / 35 | 5051 |
| 12 | 1 | 70.7 | 93.0 | 27 / 35 | 5810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 148 | 79% |
| mld.DustBunny 3.8 | 115 | 97% |
| djdjdj.NanoSkunk10 1.0 | 18 | 100% |
| maribo.melee.BMV 0.1 | 18 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 100% |
| fullsail.SweetTea 1.1 | 16 | 88% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 47 | 39% | 177 |
| mld.DustBunny 3.8 | 23 | 19% | 110 |
| zyx.nano.Ant 1.1 | 13 | 11% | 20 |
| maribo.melee.BMV 0.1 | 11 | 9% | 28 |
| fullsail.SweetTea 1.1 | 8 | 7% | 23 |
| cs.Grudge 1.0 | 8 | 7% | 8 |
| bzdp.BoxCar 2.0 | 5 | 4% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 3% | 21 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 25 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.3 | 303 / 420 | 2.05 | 20.7% | 73786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.7% | 303 |
| myl.micro.Troodon 1.10 | 2.3 | 13.7% | 51 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.7% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.4% | 27 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.7% | 17 |
| fm.mammillarias 1.3 | 6.1 | 8.5% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 3 |
| sample.Fire 1.0 | 9.3 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.5 | 27 / 35 | 5946 |
| 2 | 1 | 71.3 | 91.7 | 25 / 35 | 5882 |
| 3 | 1 | 70.1 | 83.5 | 25 / 35 | 6344 |
| 4 | 1 | 71.0 | 89.2 | 27 / 35 | 5951 |
| 5 | 1 | 70.0 | 85.1 | 23 / 35 | 6053 |
| 6 | 1 | 72.4 | 93.0 | 29 / 35 | 6374 |
| 7 | 1 | 69.2 | 82.9 | 21 / 35 | 5663 |
| 8 | 1 | 70.7 | 88.9 | 23 / 35 | 6415 |
| 9 | 1 | 69.9 | 83.8 | 23 / 35 | 6288 |
| 10 | 1 | 72.1 | 90.5 | 24 / 35 | 6663 |
| 11 | 1 | 71.5 | 90.5 | 28 / 35 | 5867 |
| 12 | 1 | 71.9 | 91.4 | 28 / 35 | 6340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 104 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 84 | 92% |
| cb.nano.Insomnia 1.0 | 48 | 90% |
| myl.nano.KomoriNinja 1.1 | 45 | 91% |
| sp.Nanos.Ember 1.1 | 26 | 100% |
| sample.Fire 1.0 | 6 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 117 of 420 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 28 | 24% | 139 |
| cb.nano.Insomnia 1.0 | 28 | 24% | 32 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 18% | 81 |
| myl.nano.KomoriNinja 1.1 | 20 | 17% | 80 |
| fm.mammillarias 1.3 | 12 | 10% | 16 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 40 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 14 |
| sample.Fire 1.0 | 2 | 2% | 11 |
| sample.Tracker 1.0 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.7 | 307 / 420 | 2.11 | 20.7% | 77362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.7% | 307 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 34 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 3 |
| tj.zombie1n 1.0.1 | 5.5 | 8.9% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 9.0% | 17 |
| yk.JahMicro 1.0 | 6.6 | 8.1% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 7 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.8 | 21 / 35 | 6086 |
| 2 | 1 | 70.9 | 87.9 | 27 / 35 | 6579 |
| 3 | 1 | 70.6 | 87.6 | 24 / 35 | 6657 |
| 4 | 1 | 71.0 | 91.7 | 25 / 35 | 6135 |
| 5 | 1 | 71.5 | 89.2 | 26 / 35 | 6888 |
| 6 | 1 | 69.9 | 83.8 | 24 / 35 | 6377 |
| 7 | 1 | 68.3 | 79.4 | 22 / 35 | 6318 |
| 8 | 1 | 72.6 | 94.6 | 30 / 35 | 6717 |
| 9 | 1 | 72.3 | 95.2 | 28 / 35 | 6745 |
| 10 | 1 | 70.2 | 88.6 | 28 / 35 | 5994 |
| 11 | 1 | 70.3 | 84.4 | 26 / 35 | 6342 |
| 12 | 1 | 70.6 | 85.7 | 26 / 35 | 6524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 130 | 90% |
| stelo.SoJNanoMelee 1.1 | 89 | 93% |
| tvv.micro.Antares 1.1.1 | 36 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 29 | 90% |
| tj.zombie1n 1.0.1 | 28 | 75% |
| yk.JahMicro 1.0 | 17 | 94% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 114 of 420 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 40 | 35% | 166 |
| stelo.SoJNanoMelee 1.1 | 21 | 18% | 63 |
| tvv.micro.Antares 1.1.1 | 19 | 17% | 66 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 9% | 14 |
| yk.JahMicro 1.0 | 8 | 7% | 25 |
| tj.zombie1n 1.0.1 | 8 | 7% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 40 |
| repositorio.NanoStep 1.0 | 3 | 3% | 20 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 70.0 | 196 / 420 | 3.70 | 15.9% | 57544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 15.9% | 196 |
| oog.melee.Corsair 1.0 | 2.1 | 12.9% | 70 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 43 |
| ahf.NanoAndrew .4 | 3.8 | 11.4% | 48 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 31 |
| EBBU.Sim2 1.02 | 6.2 | 9.5% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.9 | 9.0% | 15 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 6.7% | 2 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 63.5 | 14 / 35 | 4788 |
| 2 | 1 | 64.3 | 72.4 | 16 / 35 | 4910 |
| 3 | 1 | 60.9 | 60.3 | 14 / 35 | 4286 |
| 4 | 1 | 61.7 | 67.0 | 16 / 35 | 4496 |
| 5 | 1 | 62.9 | 67.0 | 15 / 35 | 4765 |
| 6 | 1 | 62.3 | 67.0 | 12 / 35 | 4487 |
| 7 | 1 | 64.9 | 74.3 | 18 / 35 | 4895 |
| 8 | 1 | 67.4 | 82.9 | 21 / 35 | 5038 |
| 9 | 1 | 63.9 | 72.1 | 17 / 35 | 4726 |
| 10 | 1 | 62.0 | 64.1 | 16 / 35 | 4752 |
| 11 | 1 | 64.4 | 71.4 | 18 / 35 | 5010 |
| 12 | 1 | 67.2 | 78.4 | 19 / 35 | 5391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 75 | 69% |
| simonton.nano.MeleeSeed 1.8 | 68 | 93% |
| ahf.NanoAndrew .4 | 36 | 83% |
| sam.Samspin 1.0 | 23 | 96% |
| EBBU.Sim2 1.02 | 12 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |

Hadur died in 225 of 420 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 18% | 99 |
| simonton.nano.MeleeSeed 1.8 | 38 | 17% | 97 |
| robar.nano.Assertive_Melee 0.2 | 38 | 17% | 47 |
| ahf.NanoAndrew .4 | 35 | 16% | 67 |
| bwbaugh.nano.Tirunculus 0.0.0a | 22 | 10% | 22 |
| zyx.nano.BacillusComma 1.0 | 19 | 8% | 24 |
| sam.Samspin 1.0 | 15 | 7% | 27 |
| EBBU.Sim2 1.02 | 13 | 6% | 25 |
| sample.TrackFire 1.0 | 4 | 2% | 8 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.7 | 290 / 420 | 2.11 | 19.4% | 62600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 290 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 51 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.4% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.1% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 14 |
| arthord.NanoSatanMelee Beta | 5.9 | 8.9% | 12 |
| fm.claire 1.7 | 6.7 | 8.2% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 5 |
| pa.Improved 1.0 | 8.9 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.9 | 19 / 35 | 5015 |
| 2 | 1 | 68.7 | 87.9 | 22 / 35 | 5324 |
| 3 | 1 | 68.3 | 85.4 | 23 / 35 | 4747 |
| 4 | 1 | 68.5 | 86.3 | 24 / 35 | 5056 |
| 5 | 1 | 69.5 | 88.6 | 27 / 35 | 5381 |
| 6 | 1 | 70.7 | 92.4 | 29 / 35 | 5538 |
| 7 | 1 | 69.0 | 88.3 | 23 / 35 | 5238 |
| 8 | 1 | 69.1 | 87.9 | 24 / 35 | 5139 |
| 9 | 1 | 69.4 | 88.6 | 23 / 35 | 5391 |
| 10 | 1 | 69.1 | 87.6 | 25 / 35 | 5224 |
| 11 | 1 | 69.5 | 89.2 | 26 / 35 | 5152 |
| 12 | 1 | 69.3 | 87.3 | 25 / 35 | 5395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 126 | 90% |
| oog.melee.CapuletDroid 1.1 | 80 | 80% |
| gh.nano.Grofvuil 0.2 | 34 | 91% |
| arthord.NanoSatanMelee Beta | 24 | 96% |
| winamp32.micro.MicroMacro 1.0 | 23 | 87% |
| sample.SpinBot 1.0 | 20 | 100% |
| fm.claire 1.7 | 12 | 92% |
| pa.Improved 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 137 of 420 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 23% | 150 |
| oog.melee.CapuletDroid 1.1 | 29 | 21% | 36 |
| gh.nano.Grofvuil 0.2 | 26 | 19% | 80 |
| arthord.NanoSatanMelee Beta | 17 | 12% | 43 |
| winamp32.micro.MicroMacro 1.0 | 11 | 8% | 41 |
| fm.claire 1.7 | 10 | 7% | 26 |
| sample.SpinBot 1.0 | 6 | 4% | 15 |
| pa.Improved 1.0 | 2 | 1% | 8 |
| kurios.DOSexe .9b | 1 | 1% | 18 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.3 | 197 / 420 | 2.50 | 18.4% | 68409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.4% | 197 |
| gh.micro.Gruweltje 0.7 | 2.1 | 15.0% | 90 |
| mz.MicroGodMelee 1 | 3.4 | 12.9% | 66 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.1% | 41 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 15 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 3 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 6.1% | 5 |
| fire219.CatBot 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 16 / 35 | 6316 |
| 2 | 1 | 68.2 | 82.9 | 19 / 35 | 5612 |
| 3 | 1 | 67.4 | 81.6 | 15 / 35 | 5429 |
| 4 | 1 | 68.6 | 87.0 | 18 / 35 | 5503 |
| 5 | 1 | 67.4 | 81.6 | 15 / 35 | 5624 |
| 6 | 1 | 68.4 | 84.8 | 18 / 35 | 5713 |
| 7 | 1 | 68.4 | 82.5 | 15 / 35 | 6119 |
| 8 | 1 | 66.7 | 79.7 | 15 / 35 | 5268 |
| 9 | 1 | 66.2 | 78.7 | 13 / 35 | 5558 |
| 10 | 1 | 68.5 | 86.3 | 15 / 35 | 5611 |
| 11 | 1 | 69.0 | 84.8 | 21 / 35 | 5900 |
| 12 | 1 | 68.1 | 81.9 | 17 / 35 | 5756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 91 | 86% |
| mz.MicroGodMelee 1 | 86 | 47% |
| gh.micro.Gruweltje 0.7 | 73 | 44% |
| DBall.Anarchy 0.1 | 27 | 100% |
| el.JumpShoot 0.2 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 223 of 420 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 81 | 36% | 133 |
| gh.micro.Gruweltje 0.7 | 76 | 34% | 119 |
| spinnercat.micro.Tyger 0.1 | 34 | 15% | 92 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 14 |
| mbro.Detektor3 0.1.1 | 6 | 3% | 13 |
| acogdev.alpha 0.2 | 6 | 3% | 10 |
| el.JumpShoot 0.2 | 4 | 2% | 10 |
| fire219.CatBot 1.0 | 4 | 2% | 7 |
| DBall.Anarchy 0.1 | 2 | 1% | 22 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 70.5 | 229 / 420 | 3.66 | 16.4% | 60756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.4% | 229 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.4% | 62 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 62 |
| qualidafial.MajorDick 1.0.1 | 4.4 | 10.1% | 19 |
| germ.TheMind .2 | 5.3 | 9.3% | 8 |
| awesomeness.Elite 1.0 | 6.4 | 8.5% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.9 | 8.4% | 7 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 12 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 62.9 | 13 / 35 | 4372 |
| 2 | 1 | 62.3 | 63.5 | 21 / 35 | 4548 |
| 3 | 1 | 66.8 | 79.4 | 19 / 35 | 5256 |
| 4 | 1 | 64.1 | 69.2 | 17 / 35 | 5235 |
| 5 | 1 | 63.1 | 66.3 | 19 / 35 | 4560 |
| 6 | 1 | 67.1 | 75.9 | 21 / 35 | 5485 |
| 7 | 1 | 64.4 | 67.6 | 19 / 35 | 5264 |
| 8 | 1 | 66.0 | 76.2 | 21 / 35 | 4973 |
| 9 | 1 | 67.0 | 77.1 | 22 / 35 | 5355 |
| 10 | 1 | 67.0 | 75.6 | 20 / 35 | 5818 |
| 11 | 1 | 61.3 | 62.2 | 17 / 35 | 4680 |
| 12 | 1 | 64.7 | 69.8 | 20 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 138 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 45 | 82% |
| germ.TheMind .2 | 19 | 89% |
| awesomeness.Elite 1.0 | 18 | 83% |
| stelo.UntouchableNano 1.3 | 15 | 93% |
| qualidafial.MajorDick 1.0.1 | 13 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |

Hadur died in 192 of 420 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 39% | 193 |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 20% | 75 |
| qualidafial.MajorDick 1.0.1 | 20 | 10% | 31 |
| germ.TheMind .2 | 15 | 8% | 33 |
| awesomeness.Elite 1.0 | 14 | 7% | 29 |
| stelo.UntouchableNano 1.3 | 13 | 7% | 26 |
| lrem.micro.MoggFanatic 0.2 | 8 | 4% | 11 |
| mym.EdgeStalker 1.0 | 5 | 3% | 8 |
| sample.Crazy 1.0 | 4 | 2% | 11 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.4 | 310 / 420 | 2.05 | 19.9% | 59356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.9% | 310 |
| rz.HawkOnFire 0.1 | 2.3 | 13.0% | 30 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 29 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 4 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.8% | 10 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 3 |
| ratosh.Wesco 1.4 | 7.8 | 8.0% | 6 |
| stelo.PatternRobot 1.0 | 8.1 | 7.9% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 24 / 35 | 4876 |
| 2 | 1 | 70.2 | 85.7 | 27 / 35 | 5018 |
| 3 | 1 | 71.4 | 90.2 | 28 / 35 | 5178 |
| 4 | 1 | 70.2 | 90.2 | 25 / 35 | 4836 |
| 5 | 1 | 71.4 | 94.0 | 28 / 35 | 4990 |
| 6 | 1 | 71.1 | 91.4 | 26 / 35 | 4940 |
| 7 | 1 | 69.7 | 87.6 | 25 / 35 | 4609 |
| 8 | 1 | 68.8 | 85.1 | 23 / 35 | 4613 |
| 9 | 1 | 69.4 | 85.4 | 24 / 35 | 4785 |
| 10 | 1 | 71.1 | 90.5 | 26 / 35 | 5274 |
| 11 | 1 | 69.6 | 83.5 | 26 / 35 | 5109 |
| 12 | 1 | 70.8 | 89.8 | 28 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 130 | 95% |
| nz.jdc.nano.GridFu 1.0 | 90 | 93% |
| maribo.IotaCT 1.1 | 30 | 73% |
| stelo.PatternRobot 1.0 | 26 | 92% |
| timmit.nano.TimDog 0.33 | 19 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 16 | 100% |
| ratosh.Wesco 1.4 | 15 | 100% |
| spinnercat.Omen 1.0 | 9 | 100% |

Hadur died in 111 of 420 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 30 | 27% | 124 |
| nz.jdc.nano.GridFu 1.0 | 19 | 17% | 105 |
| timmit.nano.TimDog 0.33 | 16 | 14% | 43 |
| stelo.PatternRobot 1.0 | 16 | 14% | 32 |
| maribo.IotaCT 1.1 | 13 | 12% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 7% | 19 |
| ratosh.Wesco 1.4 | 5 | 5% | 28 |
| spinnercat.Omen 1.0 | 4 | 4% | 13 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.0 | 344 / 420 | 1.81 | 21.3% | 77025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.3% | 344 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 26 |
| baal.nano.N 1.42 | 2.9 | 11.1% | 11 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 2 |
| zyx.micro.Ant 1.1 | 5.4 | 9.2% | 13 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.5% | 2 |
| sanja.First 0.1 | 6.5 | 8.4% | 11 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 4 |
| cvt.Firsty 1.0 | 8.4 | 7.1% | 8 |
| sample.RamFire 1.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.0 | 31 / 35 | 6837 |
| 2 | 1 | 71.7 | 90.5 | 30 / 35 | 6764 |
| 3 | 1 | 69.8 | 85.7 | 26 / 35 | 6121 |
| 4 | 1 | 72.5 | 96.8 | 33 / 35 | 6481 |
| 5 | 1 | 71.7 | 90.5 | 28 / 35 | 6812 |
| 6 | 1 | 70.6 | 90.2 | 28 / 35 | 5809 |
| 7 | 1 | 71.0 | 91.4 | 28 / 35 | 6349 |
| 8 | 1 | 73.3 | 97.5 | 34 / 35 | 6791 |
| 9 | 1 | 69.1 | 86.0 | 23 / 35 | 5795 |
| 10 | 1 | 71.3 | 89.5 | 28 / 35 | 6743 |
| 11 | 1 | 70.1 | 87.0 | 25 / 35 | 6092 |
| 12 | 1 | 71.6 | 92.4 | 30 / 35 | 6431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 71 | 97% |
| tvv.nano.Polaris 1.2 | 64 | 95% |
| cvt.Firsty 1.0 | 51 | 94% |
| sanja.First 0.1 | 50 | 94% |
| zyx.micro.Ant 1.1 | 40 | 90% |
| amk.Punbot.Punbot 0.01 | 38 | 95% |
| Grystrion.TrackerWO 1.0 | 35 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 76 of 420 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 26% | 79 |
| tvv.nano.Polaris 1.2 | 11 | 14% | 100 |
| Grystrion.TrackerWO 1.0 | 10 | 13% | 46 |
| baal.nano.N 1.42 | 8 | 11% | 60 |
| sample.RamFire 1.0 | 8 | 11% | 9 |
| amk.Punbot.Punbot 0.01 | 7 | 9% | 14 |
| sanja.First 0.1 | 6 | 8% | 47 |
| cvt.Firsty 1.0 | 5 | 7% | 42 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 13 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.4 | 146 / 420 | 3.75 | 15.3% | 59069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.5% | 149 |
| hadur117.micro.SaorC 0.1 | 1.5 | 15.3% | 146 |
| cs.Wren 1.0 | 3.3 | 12.6% | 37 |
| mz.Cork 0.1 | 4.3 | 11.3% | 27 |
| js.PinBall 1.6 | 4.5 | 10.8% | 24 |
| joe.ADinosaur 1.0 | 5.9 | 9.5% | 6 |
| evd.X1 0.01 | 7.0 | 8.0% | 7 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 12 |
| donjezza.Jezza 1.0 | 9.1 | 5.6% | 12 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 73.7 | 13 / 35 | 4893 |
| 2 | 2 | 61.5 | 65.1 | 8 / 35 | 5126 |
| 3 | 1 | 64.2 | 73.3 | 14 / 35 | 4983 |
| 4 | 1 | 65.0 | 74.9 | 16 / 35 | 4911 |
| 5 | 2 | 61.7 | 67.0 | 12 / 35 | 4332 |
| 6 | 1 | 63.1 | 69.8 | 12 / 35 | 4886 |
| 7 | 2 | 60.8 | 62.5 | 12 / 35 | 4700 |
| 8 | 1 | 63.3 | 69.8 | 13 / 35 | 4940 |
| 9 | 1 | 65.2 | 73.0 | 15 / 35 | 5541 |
| 10 | 2 | 60.9 | 63.2 | 11 / 35 | 4605 |
| 11 | 2 | 61.7 | 64.4 | 10 / 35 | 4887 |
| 12 | 1 | 65.0 | 76.2 | 10 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 149 | 51% |
| cs.Wren 1.0 | 39 | 90% |
| mz.Cork 0.1 | 17 | 88% |
| js.PinBall 1.6 | 11 | 64% |
| donjezza.Jezza 1.0 | 7 | 86% |
| joe.ADinosaur 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 275 of 420 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 133 | 48% | 220 |
| evd.X1 0.01 | 29 | 11% | 29 |
| js.PinBall 1.6 | 26 | 9% | 36 |
| cs.Wren 1.0 | 25 | 9% | 45 |
| joe.ADinosaur 1.0 | 21 | 8% | 24 |
| mz.Cork 0.1 | 20 | 7% | 38 |
| PSW.Relentless 0.1 | 13 | 5% | 12 |
| donjezza.Jezza 1.0 | 4 | 1% | 8 |
| jsal.Jsalbot 1.0 | 4 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.0 | 281 / 420 | 2.44 | 19.0% | 58321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 281 |
| myl.nano.Graviton 1.10 | 2.7 | 11.5% | 33 |
| ntc.Opposite 1.5 | 3.5 | 11.0% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.5% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 29 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.8% | 11 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 12 |
| DBall.NUKE 0.1 | 7.4 | 8.1% | 12 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 16 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 75.9 | 17 / 35 | 4344 |
| 2 | 1 | 66.6 | 80.0 | 19 / 35 | 4645 |
| 3 | 1 | 68.1 | 82.2 | 22 / 35 | 4856 |
| 4 | 1 | 68.4 | 84.8 | 24 / 35 | 4905 |
| 5 | 1 | 67.9 | 81.6 | 21 / 35 | 5173 |
| 6 | 1 | 66.7 | 78.4 | 24 / 35 | 4373 |
| 7 | 1 | 70.0 | 90.2 | 23 / 35 | 5190 |
| 8 | 1 | 68.5 | 81.9 | 25 / 35 | 5262 |
| 9 | 1 | 67.3 | 81.6 | 24 / 35 | 4577 |
| 10 | 1 | 70.8 | 92.7 | 30 / 35 | 4886 |
| 11 | 1 | 67.8 | 82.9 | 21 / 35 | 4727 |
| 12 | 1 | 71.9 | 95.9 | 31 / 35 | 5383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 72 | 93% |
| stelo.AreaTargetingBot 1.1 | 64 | 88% |
| ntc.Opposite 1.5 | 39 | 90% |
| DBall.NUKE 0.1 | 32 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 31 | 97% |
| disan.Chair 2.2.0 | 24 | 92% |
| donjezza.Muncho 1.0 | 23 | 87% |
| pfvicm.Sobieski 7.2.3b | 15 | 93% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 142 of 420 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 34 | 24% | 53 |
| stelo.AreaTargetingBot 1.1 | 25 | 18% | 79 |
| ntc.Opposite 1.5 | 23 | 16% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 15% | 58 |
| myl.nano.Graviton 1.10 | 14 | 10% | 78 |
| DBall.NUKE 0.1 | 8 | 6% | 37 |
| donjezza.Muncho 1.0 | 6 | 4% | 24 |
| pbg.R2D2 1.0 | 5 | 4% | 21 |
| disan.Chair 2.2.0 | 5 | 4% | 19 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.2 | 161 / 420 | 3.68 | 15.1% | 49636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.8 | 15.1% | 161 |
| oog.melee.Capulet 1.2 | 2.0 | 14.3% | 96 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.4% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 47 |
| yagami.Tidus 0.11 | 4.9 | 11.9% | 22 |
| ejb.Polaris 1.0.1 | 5.6 | 11.1% | 25 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 78.4 | 18 / 35 | 3797 |
| 2 | 1 | 66.1 | 78.7 | 15 / 35 | 4506 |
| 3 | 1 | 65.8 | 75.6 | 17 / 35 | 4661 |
| 4 | 3 | 60.9 | 62.9 | 10 / 35 | 3819 |
| 5 | 1 | 63.7 | 70.8 | 16 / 35 | 4268 |
| 6 | 2 | 62.8 | 70.2 | 11 / 35 | 3870 |
| 7 | 2 | 63.7 | 70.2 | 10 / 35 | 4289 |
| 8 | 1 | 65.4 | 75.6 | 15 / 35 | 4374 |
| 9 | 3 | 60.9 | 61.3 | 11 / 35 | 3785 |
| 10 | 3 | 60.4 | 62.5 | 11 / 35 | 3987 |
| 11 | 2 | 61.2 | 66.3 | 10 / 35 | 3803 |
| 12 | 1 | 64.4 | 70.2 | 17 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 74 | 59% |
| kawigi.micro.Shiz 1.1 | 54 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 79% |
| yagami.Tidus 0.11 | 21 | 100% |
| ejb.Polaris 1.0.1 | 19 | 63% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 260 of 420 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 109 | 42% | 157 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 13% | 68 |
| ejb.Polaris 1.0.1 | 34 | 13% | 54 |
| yagami.Tidus 0.11 | 25 | 10% | 43 |
| kawigi.micro.Shiz 1.1 | 23 | 9% | 62 |
| step.nanoPri 1.0 | 13 | 5% | 14 |
| stelo.MirrorNano 1.3 | 11 | 4% | 11 |
| kurios.DOSexe .9a | 10 | 4% | 10 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.6 | 272 / 420 | 2.66 | 17.9% | 54278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.9% | 272 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 36 |
| wee.Gem 1.8.4 | 3.6 | 11.7% | 48 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 30 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 15 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 11 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.9 | 7.2% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.4% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.3 | 23 / 35 | 3798 |
| 2 | 1 | 65.5 | 77.1 | 22 / 35 | 4170 |
| 3 | 1 | 68.2 | 86.3 | 25 / 35 | 4774 |
| 4 | 1 | 65.6 | 77.5 | 19 / 35 | 4340 |
| 5 | 1 | 67.7 | 84.1 | 21 / 35 | 4939 |
| 6 | 1 | 67.2 | 82.2 | 25 / 35 | 4339 |
| 7 | 1 | 66.5 | 78.7 | 23 / 35 | 4575 |
| 8 | 1 | 66.6 | 80.6 | 21 / 35 | 4370 |
| 9 | 1 | 68.8 | 86.3 | 26 / 35 | 4733 |
| 10 | 1 | 69.4 | 87.6 | 25 / 35 | 5272 |
| 11 | 1 | 65.3 | 77.1 | 22 / 35 | 4312 |
| 12 | 1 | 66.5 | 79.7 | 20 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 109 | 94% |
| wee.Gem 1.8.4 | 73 | 90% |
| wompi.Quokka 1.6 | 43 | 88% |
| ratosh.Nobo 0.21 | 31 | 90% |
| m3thos.Eva00 1.1 | 20 | 100% |
| bayen.UbaMicro 1.4 | 14 | 93% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 149 of 420 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 28 | 19% | 58 |
| wee.Gem 1.8.4 | 24 | 16% | 95 |
| bzdp.Pansy 2.1 | 20 | 13% | 101 |
| bayen.UbaMicro 1.4 | 16 | 11% | 36 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 10% | 20 |
| ratosh.Nobo 0.21 | 14 | 9% | 46 |
| maribo.FollowFire 1 | 12 | 8% | 13 |
| m3thos.Eva00 1.1 | 11 | 7% | 30 |
| stelo.MyAgileRobot 0.2 | 9 | 6% | 14 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.1 | 142 / 420 | 2.61 | 19.2% | 87411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.9% | 245 |
| hadur117.micro.SaorC 0.1 | 1.7 | 19.2% | 142 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 24 |
| ayk.WallHugger 1.0 | 4.6 | 9.4% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.6 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 86.0 | 12 / 35 | 7221 |
| 2 | 2 | 70.2 | 80.6 | 9 / 35 | 7962 |
| 3 | 1 | 70.4 | 81.9 | 17 / 35 | 7423 |
| 4 | 2 | 69.2 | 79.4 | 12 / 35 | 6765 |
| 5 | 2 | 69.6 | 81.0 | 6 / 35 | 7291 |
| 6 | 2 | 68.9 | 79.7 | 11 / 35 | 6225 |
| 7 | 2 | 69.3 | 80.6 | 12 / 35 | 6883 |
| 8 | 1 | 71.8 | 87.6 | 13 / 35 | 7803 |
| 9 | 1 | 71.0 | 81.3 | 15 / 35 | 7812 |
| 10 | 2 | 69.9 | 80.6 | 12 / 35 | 7448 |
| 11 | 2 | 69.9 | 81.0 | 12 / 35 | 7037 |
| 12 | 2 | 70.6 | 86.0 | 11 / 35 | 7541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 229 | 31% |
| mz.NanoGod 2.02 | 26 | 77% |
| ayk.WallHugger 1.0 | 17 | 94% |
| exauge.GateKeeper 1.1.121g | 17 | 94% |
| drd.Dreadknoght 0.9 | 11 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 279 of 420 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 205 | 73% | 284 |
| mz.NanoGod 2.02 | 33 | 12% | 62 |
| exauge.GateKeeper 1.1.121g | 13 | 5% | 23 |
| ayk.WallHugger 1.0 | 12 | 4% | 24 |
| stuff.Vlad 0.1 | 7 | 3% | 10 |
| drd.Dreadknoght 0.9 | 6 | 2% | 12 |
| stelo.PianistNano 1.2 | 3 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.2 | 237 / 420 | 3.23 | 17.1% | 57233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.1% | 237 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 37 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.5% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.9 | 11.1% | 42 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 31 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 15 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 6 |
| dl.BetterWalls 1.0 | 8.4 | 6.8% | 2 |
| ap.Frederick 1.1 | 9.0 | 6.5% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.0 | 19 / 35 | 4660 |
| 2 | 1 | 65.4 | 74.9 | 18 / 35 | 4897 |
| 3 | 1 | 66.1 | 76.8 | 22 / 35 | 4775 |
| 4 | 1 | 64.4 | 73.3 | 17 / 35 | 4857 |
| 5 | 1 | 65.5 | 72.4 | 18 / 35 | 5155 |
| 6 | 1 | 66.8 | 80.6 | 23 / 35 | 4730 |
| 7 | 1 | 69.9 | 91.4 | 26 / 35 | 5094 |
| 8 | 1 | 61.2 | 61.9 | 15 / 35 | 4261 |
| 9 | 1 | 65.0 | 73.7 | 22 / 35 | 4642 |
| 10 | 1 | 66.9 | 79.4 | 23 / 35 | 4898 |
| 11 | 1 | 63.8 | 67.9 | 18 / 35 | 4713 |
| 12 | 1 | 63.7 | 71.4 | 16 / 35 | 4551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 77 | 91% |
| dummy.micro.Sparrow 2.5 | 68 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 50 | 92% |
| bvh.micro.Freya 0.3 | 32 | 97% |
| stelo.MirrorMicro 1.0 | 18 | 83% |
| ap.Frederick 1.1 | 8 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 36 | 20% | 50 |
| voidious.micro.BlitzBat 1.05 | 34 | 18% | 99 |
| mn.nano.perceptual.Impact 1.3.0 | 34 | 18% | 36 |
| dummy.micro.Sparrow 2.5 | 25 | 14% | 76 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 13% | 77 |
| dl.BetterWalls 1.0 | 12 | 7% | 27 |
| stelo.MirrorMicro 1.0 | 10 | 5% | 28 |
| bvh.micro.Freya 0.3 | 9 | 5% | 25 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.9 | 310 / 420 | 2.00 | 21.4% | 82963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.4% | 310 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 42 |
| sul.Lunar 1.1 | 3.3 | 11.0% | 10 |
| supersample.SuperBoxBot 1.0 | 4.1 | 10.7% | 14 |
| mme.NikeEnhanced 2.0 | 5.1 | 9.3% | 9 |
| dsw.StaticD 1.0 | 5.5 | 8.9% | 11 |
| tlp.ThreeLeggedPig 1 | 7.6 | 6.7% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.4 | 6.1% | 6 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 14 |
| sample.Corners 1.0 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.9 | 28 / 35 | 6433 |
| 2 | 1 | 72.4 | 92.1 | 26 / 35 | 7125 |
| 3 | 1 | 71.5 | 85.4 | 25 / 35 | 7278 |
| 4 | 1 | 69.9 | 83.2 | 23 / 35 | 6506 |
| 5 | 1 | 72.0 | 88.9 | 24 / 35 | 7218 |
| 6 | 1 | 72.6 | 94.3 | 30 / 35 | 6888 |
| 7 | 1 | 71.2 | 88.3 | 24 / 35 | 7137 |
| 8 | 1 | 72.2 | 91.7 | 27 / 35 | 6848 |
| 9 | 1 | 70.0 | 84.8 | 22 / 35 | 6456 |
| 10 | 1 | 72.5 | 89.2 | 28 / 35 | 7373 |
| 11 | 1 | 71.9 | 89.5 | 27 / 35 | 6992 |
| 12 | 1 | 72.4 | 91.4 | 26 / 35 | 6709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 118 | 92% |
| sul.Lunar 1.1 | 85 | 99% |
| supersample.SuperBoxBot 1.0 | 45 | 89% |
| dsw.StaticD 1.0 | 27 | 74% |
| mme.NikeEnhanced 2.0 | 25 | 92% |
| sample.MyFirstRobot 1.0 | 14 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 13 | 85% |
| sample.Corners 1.0 | 10 | 90% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 115 of 420 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 35 | 30% | 77 |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 19% | 122 |
| dsw.StaticD 1.0 | 22 | 19% | 51 |
| mme.NikeEnhanced 2.0 | 10 | 9% | 28 |
| sample.MyFirstJuniorRobot 1.0 | 8 | 7% | 21 |
| sul.Lunar 1.1 | 7 | 6% | 87 |
| sample.MyFirstRobot 1.0 | 7 | 6% | 14 |
| sample.Corners 1.0 | 3 | 3% | 14 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.6 | 239 / 420 | 2.75 | 18.5% | 74796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.5% | 239 |
| radnor.DoctorBob 1.42 | 2.4 | 12.7% | 49 |
| mld.Wisdom 1.0 | 3.5 | 12.0% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.9 | 11.3% | 29 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 22 |
| amz.NanoClone 1.41 | 5.2 | 10.4% | 24 |
| sample.Walls 1.0 | 7.5 | 7.6% | 12 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 6 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 76.2 | 20 / 35 | 5972 |
| 2 | 1 | 65.5 | 74.9 | 17 / 35 | 5571 |
| 3 | 1 | 68.8 | 84.4 | 21 / 35 | 6226 |
| 4 | 1 | 67.0 | 76.8 | 21 / 35 | 5782 |
| 5 | 1 | 68.4 | 83.2 | 22 / 35 | 6379 |
| 6 | 1 | 67.3 | 75.9 | 17 / 35 | 6591 |
| 7 | 1 | 67.9 | 81.6 | 19 / 35 | 6084 |
| 8 | 1 | 68.0 | 77.1 | 21 / 35 | 6287 |
| 9 | 1 | 68.2 | 81.3 | 22 / 35 | 6276 |
| 10 | 1 | 69.8 | 85.7 | 22 / 35 | 6561 |
| 11 | 1 | 68.6 | 84.4 | 18 / 35 | 6365 |
| 12 | 1 | 69.4 | 85.4 | 19 / 35 | 6702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 108 | 96% |
| radnor.DoctorBob 1.42 | 51 | 76% |
| mld.Wisdom 1.0 | 32 | 75% |
| amz.NanoClone 1.41 | 23 | 70% |
| KiraNL.Chupacabra 0.4 | 23 | 74% |
| jangs.ns51 1.0 | 18 | 89% |
| sample.Walls 1.0 | 12 | 92% |
| sample.Target 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |

Hadur died in 181 of 420 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 52 | 29% | 74 |
| radnor.DoctorBob 1.42 | 37 | 20% | 84 |
| KiraNL.Chupacabra 0.4 | 35 | 19% | 52 |
| amz.NanoClone 1.41 | 19 | 10% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 8% | 127 |
| sample.Walls 1.0 | 10 | 6% | 20 |
| jangs.ns51 1.0 | 8 | 4% | 19 |
| GarmBox.Oranges 1.0 | 6 | 3% | 9 |

