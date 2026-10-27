# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.9 | 326 / 420 | 1.91 | 21.6% | 84777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.6% | 326 |
| radnor.DoctorBob 1.42 | 2.6 | 13.7% | 23 |
| mz.AntiGrav 1.0 | 2.8 | 13.6% | 23 |
| mld.Infinity 2.2 | 3.7 | 12.6% | 26 |
| amz.NanoClone 1.41 | 4.9 | 10.7% | 6 |
| sample.Walls 1.0 | 6.6 | 7.1% | 4 |
| jangs.ns51 1.0 | 7.2 | 6.4% | 7 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 3 |
| arthord.MannyPacquiao Beta | 9.1 | 4.4% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.6 | 29 / 35 | 6822 |
| 2 | 1 | 73.2 | 93.3 | 30 / 35 | 7058 |
| 3 | 1 | 70.6 | 82.9 | 27 / 35 | 6255 |
| 4 | 1 | 74.2 | 98.4 | 31 / 35 | 7329 |
| 5 | 1 | 73.3 | 89.2 | 27 / 35 | 7975 |
| 6 | 1 | 73.9 | 94.9 | 28 / 35 | 7515 |
| 7 | 1 | 73.2 | 95.2 | 26 / 35 | 7254 |
| 8 | 1 | 70.8 | 84.8 | 25 / 35 | 6697 |
| 9 | 1 | 73.7 | 93.7 | 26 / 35 | 7733 |
| 10 | 1 | 72.5 | 90.5 | 28 / 35 | 7096 |
| 11 | 1 | 72.2 | 90.8 | 26 / 35 | 6812 |
| 12 | 1 | 68.9 | 76.2 | 23 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 125 | 98% |
| mld.Infinity 2.2 | 95 | 92% |
| radnor.DoctorBob 1.42 | 77 | 84% |
| amz.NanoClone 1.41 | 22 | 95% |
| jangs.ns51 1.0 | 19 | 84% |
| sample.Target 1.0 | 6 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 95 of 420 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 40% | 144 |
| mld.Infinity 2.2 | 19 | 20% | 33 |
| mz.AntiGrav 1.0 | 13 | 14% | 145 |
| amz.NanoClone 1.41 | 9 | 9% | 36 |
| jangs.ns51 1.0 | 7 | 7% | 17 |
| sample.Walls 1.0 | 4 | 4% | 21 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 11 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.2 | 276 / 420 | 2.42 | 18.6% | 60413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 18.6% | 276 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.1% | 78 |
| mld.DustBunny 3.8 | 2.5 | 13.7% | 29 |
| maribo.melee.BMV 0.1 | 4.5 | 10.3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 13 |
| zyx.nano.Ant 1.1 | 6.4 | 7.9% | 2 |
| fullsail.SweetTea 1.1 | 7.4 | 7.5% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.4 | 7.6% | 12 |
| bzdp.BoxCar 2.0 | 7.9 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.9 | 26 / 35 | 5506 |
| 2 | 1 | 71.0 | 94.0 | 32 / 35 | 5468 |
| 3 | 1 | 70.2 | 96.2 | 27 / 35 | 4882 |
| 4 | 1 | 69.3 | 90.8 | 25 / 35 | 4789 |
| 5 | 3 | 58.5 | 51.1 | 12 / 35 | 4255 |
| 6 | 1 | 67.5 | 80.6 | 21 / 35 | 5066 |
| 7 | 1 | 70.3 | 93.3 | 23 / 35 | 5188 |
| 8 | 1 | 71.9 | 98.7 | 32 / 35 | 5560 |
| 9 | 1 | 66.3 | 79.0 | 16 / 35 | 4585 |
| 10 | 3 | 59.0 | 50.8 | 9 / 35 | 4691 |
| 11 | 1 | 68.5 | 87.9 | 25 / 35 | 4831 |
| 12 | 1 | 70.6 | 92.7 | 28 / 35 | 5592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 155 | 76% |
| mld.DustBunny 3.8 | 104 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 80% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| maribo.melee.BMV 0.1 | 13 | 100% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 144 of 420 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 39% | 172 |
| mld.DustBunny 3.8 | 23 | 16% | 107 |
| fullsail.SweetTea 1.1 | 12 | 8% | 20 |
| cs.Grudge 1.0 | 12 | 8% | 11 |
| zyx.nano.Ant 1.1 | 11 | 8% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 7% | 25 |
| djdjdj.NanoSkunk10 1.0 | 7 | 5% | 27 |
| maribo.melee.BMV 0.1 | 7 | 5% | 23 |
| bzdp.BoxCar 2.0 | 6 | 4% | 13 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.3 | 288 / 420 | 2.24 | 20.4% | 74153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.4% | 288 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 59 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 9.9% | 22 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 17 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 9 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 7 |
| sample.Fire 1.0 | 9.3 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.9 | 25 / 35 | 6857 |
| 2 | 1 | 72.5 | 93.7 | 30 / 35 | 6405 |
| 3 | 1 | 69.8 | 82.2 | 22 / 35 | 6303 |
| 4 | 1 | 69.1 | 82.9 | 22 / 35 | 5849 |
| 5 | 1 | 71.2 | 87.9 | 23 / 35 | 6647 |
| 6 | 1 | 70.8 | 88.6 | 26 / 35 | 5947 |
| 7 | 1 | 70.9 | 86.7 | 22 / 35 | 6201 |
| 8 | 1 | 70.3 | 84.8 | 24 / 35 | 6226 |
| 9 | 1 | 69.1 | 82.9 | 22 / 35 | 5712 |
| 10 | 1 | 69.8 | 84.4 | 22 / 35 | 5715 |
| 11 | 1 | 70.3 | 86.7 | 23 / 35 | 6006 |
| 12 | 1 | 70.9 | 86.7 | 27 / 35 | 6285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 112 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 67 | 84% |
| myl.nano.KomoriNinja 1.1 | 42 | 95% |
| cb.nano.Insomnia 1.0 | 37 | 89% |
| sp.Nanos.Ember 1.1 | 29 | 93% |
| fm.mammillarias 1.3 | 18 | 78% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 6 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 133 of 420 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 28 | 21% | 139 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 17% | 65 |
| cb.nano.Insomnia 1.0 | 22 | 17% | 25 |
| myl.nano.KomoriNinja 1.1 | 19 | 14% | 83 |
| fm.mammillarias 1.3 | 19 | 14% | 32 |
| cs.sheldor.Talon 1.1 | 9 | 7% | 23 |
| sp.Nanos.Ember 1.1 | 8 | 6% | 34 |
| sample.Fire 1.0 | 4 | 3% | 9 |
| sample.Tracker 1.0 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.6 | 306 / 420 | 2.11 | 20.6% | 77680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.6% | 306 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 32 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 22 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 22 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.6 | 8.7% | 2 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.4% | 9 |
| repositorio.NanoStep 1.0 | 8.9 | 6.7% | 3 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.5 | 27 / 35 | 6115 |
| 2 | 1 | 70.3 | 87.6 | 24 / 35 | 6561 |
| 3 | 1 | 71.4 | 92.4 | 28 / 35 | 6360 |
| 4 | 1 | 69.2 | 84.1 | 25 / 35 | 5709 |
| 5 | 1 | 71.6 | 91.1 | 28 / 35 | 6486 |
| 6 | 1 | 68.4 | 80.3 | 20 / 35 | 6296 |
| 7 | 1 | 71.1 | 87.3 | 26 / 35 | 7122 |
| 8 | 1 | 71.6 | 91.7 | 27 / 35 | 6708 |
| 9 | 1 | 70.2 | 86.7 | 23 / 35 | 6597 |
| 10 | 1 | 70.9 | 90.8 | 25 / 35 | 6247 |
| 11 | 1 | 71.6 | 89.8 | 25 / 35 | 6990 |
| 12 | 1 | 70.9 | 87.3 | 28 / 35 | 6489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 144 | 92% |
| stelo.SoJNanoMelee 1.1 | 76 | 91% |
| tvv.micro.Antares 1.1.1 | 30 | 93% |
| tj.zombie1n 1.0.1 | 30 | 70% |
| ers.nano.hawk.HawkLA 3.0m | 27 | 74% |
| yk.JahMicro 1.0 | 15 | 93% |
| repositorio.NanoStep 1.0 | 12 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |

Hadur died in 117 of 420 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 40 | 34% | 180 |
| stelo.SoJNanoMelee 1.1 | 22 | 19% | 52 |
| tj.zombie1n 1.0.1 | 16 | 14% | 19 |
| tvv.micro.Antares 1.1.1 | 10 | 9% | 51 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 9% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 7% | 41 |
| yk.JahMicro 1.0 | 8 | 7% | 24 |
| repositorio.NanoStep 1.0 | 3 | 3% | 24 |
| sample.VelociRobot 1.0 | 0 | 0% | 14 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.5 | 205 / 420 | 3.57 | 16.3% | 58711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 205 |
| oog.melee.Corsair 1.0 | 2.1 | 13.3% | 75 |
| ahf.NanoAndrew .4 | 3.7 | 10.8% | 37 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 42 |
| EBBU.Sim2 1.02 | 5.2 | 9.7% | 11 |
| sam.Samspin 1.0 | 6.3 | 9.1% | 22 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.0% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.7% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 73.0 | 18 / 35 | 4850 |
| 2 | 1 | 60.7 | 61.3 | 13 / 35 | 4467 |
| 3 | 1 | 64.5 | 70.5 | 17 / 35 | 5147 |
| 4 | 1 | 61.1 | 64.1 | 12 / 35 | 4598 |
| 5 | 1 | 63.2 | 72.7 | 17 / 35 | 4368 |
| 6 | 1 | 66.6 | 80.0 | 20 / 35 | 5120 |
| 7 | 1 | 67.4 | 82.5 | 22 / 35 | 5149 |
| 8 | 1 | 64.8 | 70.2 | 17 / 35 | 5135 |
| 9 | 1 | 67.2 | 80.0 | 22 / 35 | 5124 |
| 10 | 1 | 63.2 | 66.3 | 17 / 35 | 4768 |
| 11 | 1 | 61.3 | 65.1 | 13 / 35 | 4514 |
| 12 | 1 | 64.9 | 71.7 | 17 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 85 | 66% |
| simonton.nano.MeleeSeed 1.8 | 74 | 88% |
| ahf.NanoAndrew .4 | 28 | 89% |
| EBBU.Sim2 1.02 | 18 | 94% |
| robar.nano.Assertive_Melee 0.2 | 14 | 93% |
| sam.Samspin 1.0 | 13 | 100% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| sample.TrackFire 1.0 | 6 | 100% |

Hadur died in 216 of 420 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 43 | 20% | 106 |
| robar.nano.Assertive_Melee 0.2 | 37 | 17% | 51 |
| simonton.nano.MeleeSeed 1.8 | 33 | 15% | 93 |
| zyx.nano.BacillusComma 1.0 | 26 | 12% | 36 |
| ahf.NanoAndrew .4 | 22 | 10% | 52 |
| bwbaugh.nano.Tirunculus 0.0.0a | 22 | 10% | 22 |
| EBBU.Sim2 1.02 | 20 | 9% | 32 |
| sam.Samspin 1.0 | 9 | 4% | 17 |
| sample.TrackFire 1.0 | 4 | 2% | 8 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.1 | 303 / 420 | 2.07 | 19.8% | 65194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 303 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.9% | 32 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.3% | 33 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.6% | 28 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 8.7% | 12 |
| fm.claire 1.7 | 6.0 | 8.4% | 3 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.4% | 6 |
| sample.SpinBot 1.0 | 8.0 | 7.3% | 2 |
| pa.Improved 1.0 | 9.3 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.0 | 21 / 35 | 4967 |
| 2 | 1 | 71.4 | 91.7 | 31 / 35 | 5947 |
| 3 | 1 | 69.9 | 91.1 | 27 / 35 | 5471 |
| 4 | 1 | 68.0 | 81.9 | 22 / 35 | 5533 |
| 5 | 1 | 69.9 | 88.6 | 24 / 35 | 5497 |
| 6 | 1 | 69.6 | 89.8 | 26 / 35 | 5270 |
| 7 | 1 | 69.5 | 89.2 | 25 / 35 | 5162 |
| 8 | 1 | 70.4 | 91.1 | 27 / 35 | 5531 |
| 9 | 1 | 68.9 | 87.0 | 24 / 35 | 5249 |
| 10 | 1 | 70.4 | 92.1 | 26 / 35 | 5434 |
| 11 | 1 | 68.1 | 83.2 | 23 / 35 | 5237 |
| 12 | 1 | 71.2 | 92.1 | 27 / 35 | 5896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 123 | 96% |
| oog.melee.CapuletDroid 1.1 | 86 | 84% |
| gh.nano.Grofvuil 0.2 | 50 | 86% |
| arthord.NanoSatanMelee Beta | 30 | 93% |
| winamp32.micro.MicroMacro 1.0 | 15 | 93% |
| sample.SpinBot 1.0 | 10 | 100% |
| fm.claire 1.7 | 9 | 100% |
| kurios.DOSexe .9b | 8 | 75% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 24% | 146 |
| oog.melee.CapuletDroid 1.1 | 26 | 21% | 43 |
| gh.nano.Grofvuil 0.2 | 25 | 20% | 87 |
| arthord.NanoSatanMelee Beta | 12 | 10% | 36 |
| kurios.DOSexe .9b | 9 | 7% | 26 |
| sample.SpinBot 1.0 | 6 | 5% | 14 |
| fm.claire 1.7 | 5 | 4% | 17 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 32 |
| pa.Improved 1.0 | 3 | 2% | 15 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.1 | 176 / 420 | 2.70 | 17.8% | 66213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.8% | 176 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.3% | 103 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 38 |
| mz.MicroGodMelee 1 | 3.4 | 13.6% | 80 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 12 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.6% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 1 |
| acogdev.alpha 0.2 | 7.9 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.9% | 1 |
| mbro.Detektor3 0.1.1 | 8.9 | 5.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 74.3 | 9 / 35 | 5105 |
| 2 | 1 | 68.1 | 85.4 | 11 / 35 | 5740 |
| 3 | 1 | 66.9 | 81.0 | 14 / 35 | 5267 |
| 4 | 1 | 68.4 | 82.9 | 17 / 35 | 5896 |
| 5 | 1 | 66.3 | 80.0 | 16 / 35 | 4701 |
| 6 | 1 | 68.3 | 84.4 | 20 / 35 | 5475 |
| 7 | 1 | 67.0 | 77.5 | 14 / 35 | 5770 |
| 8 | 1 | 66.5 | 77.8 | 12 / 35 | 5988 |
| 9 | 1 | 68.4 | 83.8 | 16 / 35 | 5833 |
| 10 | 1 | 67.3 | 83.2 | 16 / 35 | 5456 |
| 11 | 1 | 68.4 | 84.4 | 18 / 35 | 5551 |
| 12 | 1 | 66.5 | 79.0 | 13 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 96 | 44% |
| spinnercat.micro.Tyger 0.1 | 93 | 87% |
| gh.micro.Gruweltje 0.7 | 74 | 27% |
| DBall.Anarchy 0.1 | 16 | 100% |
| el.JumpShoot 0.2 | 7 | 86% |
| mbro.Detektor3 0.1.1 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 245 of 420 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 90 | 37% | 141 |
| gh.micro.Gruweltje 0.7 | 76 | 31% | 109 |
| spinnercat.micro.Tyger 0.1 | 31 | 13% | 81 |
| fire219.CatBot 1.0 | 16 | 7% | 17 |
| acogdev.alpha 0.2 | 10 | 4% | 13 |
| DBall.Anarchy 0.1 | 6 | 2% | 21 |
| el.JumpShoot 0.2 | 6 | 2% | 12 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 14 |
| caimano.Furia_Ceca 0.22 | 5 | 2% | 11 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 73.1 | 225 / 420 | 3.42 | 16.8% | 62577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.8% | 225 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.9% | 79 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 64 |
| qualidafial.MajorDick 1.0.1 | 4.6 | 9.6% | 12 |
| germ.TheMind .2 | 5.3 | 9.1% | 10 |
| awesomeness.Elite 1.0 | 6.2 | 8.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 13 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.8 | 21 / 35 | 5238 |
| 2 | 1 | 67.3 | 80.0 | 19 / 35 | 5423 |
| 3 | 1 | 66.5 | 76.5 | 21 / 35 | 5341 |
| 4 | 1 | 66.6 | 80.3 | 19 / 35 | 5257 |
| 5 | 1 | 67.4 | 77.8 | 24 / 35 | 5528 |
| 6 | 1 | 61.5 | 62.5 | 14 / 35 | 4920 |
| 7 | 1 | 64.9 | 68.9 | 17 / 35 | 5561 |
| 8 | 1 | 64.0 | 68.9 | 17 / 35 | 4952 |
| 9 | 1 | 65.2 | 73.0 | 20 / 35 | 5027 |
| 10 | 1 | 65.1 | 73.3 | 21 / 35 | 4920 |
| 11 | 1 | 65.7 | 73.3 | 17 / 35 | 5177 |
| 12 | 1 | 63.2 | 65.7 | 15 / 35 | 5233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 152 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 48 | 79% |
| germ.TheMind .2 | 17 | 94% |
| qualidafial.MajorDick 1.0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 15 | 80% |
| sample.Crazy 1.0 | 9 | 89% |
| awesomeness.Elite 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 196 of 420 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 92 | 47% | 202 |
| simonton.nano.WeekendObsession_Melee 1.0 | 35 | 18% | 74 |
| germ.TheMind .2 | 15 | 8% | 35 |
| stelo.UntouchableNano 1.3 | 14 | 7% | 27 |
| qualidafial.MajorDick 1.0.1 | 12 | 6% | 25 |
| awesomeness.Elite 1.0 | 11 | 6% | 21 |
| lrem.micro.MoggFanatic 0.2 | 8 | 4% | 13 |
| mym.EdgeStalker 1.0 | 5 | 3% | 8 |
| sample.Crazy 1.0 | 4 | 2% | 12 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.1 | 327 / 420 | 1.89 | 20.3% | 59604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.3% | 327 |
| rz.HawkOnFire 0.1 | 2.1 | 13.2% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 11.9% | 16 |
| maribo.IotaCT 1.1 | 4.5 | 10.7% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 4 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.3% | 13 |
| ratosh.Wesco 1.4 | 6.8 | 8.7% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 8 |
| spinnercat.Omen 1.0 | 8.3 | 7.6% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 28 / 35 | 4873 |
| 2 | 1 | 71.9 | 93.7 | 29 / 35 | 5108 |
| 3 | 1 | 69.8 | 88.9 | 27 / 35 | 4451 |
| 4 | 1 | 71.1 | 90.2 | 28 / 35 | 4882 |
| 5 | 1 | 71.0 | 89.8 | 28 / 35 | 4999 |
| 6 | 1 | 69.6 | 83.5 | 26 / 35 | 5162 |
| 7 | 1 | 72.1 | 94.6 | 30 / 35 | 5236 |
| 8 | 1 | 71.8 | 92.4 | 29 / 35 | 5382 |
| 9 | 1 | 70.8 | 91.4 | 27 / 35 | 4915 |
| 10 | 1 | 69.7 | 88.9 | 23 / 35 | 4872 |
| 11 | 1 | 69.7 | 88.3 | 25 / 35 | 4787 |
| 12 | 1 | 70.7 | 90.2 | 27 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 127 | 98% |
| nz.jdc.nano.GridFu 1.0 | 87 | 93% |
| maribo.IotaCT 1.1 | 32 | 91% |
| timmit.nano.TimDog 0.33 | 29 | 83% |
| stelo.PatternRobot 1.0 | 26 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 16 | 100% |
| ratosh.Wesco 1.4 | 16 | 88% |
| spinnercat.Omen 1.0 | 14 | 100% |

Hadur died in 94 of 420 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 20 | 21% | 51 |
| nz.jdc.nano.GridFu 1.0 | 17 | 18% | 106 |
| ratosh.Wesco 1.4 | 16 | 17% | 43 |
| rz.HawkOnFire 0.1 | 12 | 13% | 104 |
| maribo.IotaCT 1.1 | 12 | 13% | 50 |
| stelo.PatternRobot 1.0 | 12 | 13% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 15 |
| spinnercat.Omen 1.0 | 0 | 0% | 11 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.6 | 361 / 420 | 1.66 | 21.7% | 77292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.7% | 361 |
| tvv.nano.Polaris 1.2 | 2.4 | 11.8% | 25 |
| baal.nano.N 1.42 | 2.8 | 11.5% | 12 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 1 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.1 | 8.6% | 2 |
| sanja.First 0.1 | 7.2 | 7.9% | 5 |
| cvt.Firsty 1.0 | 7.8 | 7.4% | 6 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 2 |
| sample.RamFire 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.7 | 29 / 35 | 6245 |
| 2 | 1 | 70.7 | 89.8 | 30 / 35 | 6068 |
| 3 | 1 | 72.0 | 94.0 | 32 / 35 | 6110 |
| 4 | 1 | 72.0 | 93.7 | 29 / 35 | 6726 |
| 5 | 1 | 71.6 | 91.4 | 30 / 35 | 6527 |
| 6 | 1 | 72.3 | 94.0 | 31 / 35 | 6721 |
| 7 | 1 | 73.2 | 96.8 | 33 / 35 | 7030 |
| 8 | 1 | 72.2 | 93.3 | 32 / 35 | 6833 |
| 9 | 1 | 70.8 | 92.1 | 27 / 35 | 6320 |
| 10 | 1 | 72.1 | 95.2 | 30 / 35 | 6155 |
| 11 | 1 | 71.8 | 91.7 | 30 / 35 | 6513 |
| 12 | 1 | 70.2 | 87.6 | 28 / 35 | 6044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 75 | 93% |
| baal.nano.N 1.42 | 74 | 99% |
| cvt.Firsty 1.0 | 62 | 95% |
| zyx.micro.Ant 1.1 | 39 | 97% |
| Grystrion.TrackerWO 1.0 | 38 | 100% |
| sanja.First 0.1 | 36 | 92% |
| amk.Punbot.Punbot 0.01 | 26 | 100% |
| squidM.TentalceMeleeNano 1.1 | 21 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 59 of 420 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 19% | 76 |
| cvt.Firsty 1.0 | 9 | 15% | 44 |
| sample.RamFire 1.0 | 8 | 14% | 8 |
| tvv.nano.Polaris 1.2 | 7 | 12% | 110 |
| Grystrion.TrackerWO 1.0 | 7 | 12% | 37 |
| baal.nano.N 1.42 | 5 | 8% | 65 |
| sanja.First 0.1 | 5 | 8% | 40 |
| amk.Punbot.Punbot 0.01 | 5 | 8% | 10 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 23 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.5 | 143 / 420 | 3.84 | 15.2% | 59769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.6 | 15.2% | 143 |
| kc.micro.Figment 1.0 | 1.6 | 15.2% | 151 |
| cs.Wren 1.0 | 3.1 | 12.8% | 39 |
| js.PinBall 1.6 | 4.3 | 11.3% | 27 |
| mz.Cork 0.1 | 4.6 | 11.2% | 32 |
| joe.ADinosaur 1.0 | 5.9 | 9.6% | 8 |
| evd.X1 0.01 | 7.0 | 8.1% | 9 |
| jsal.Jsalbot 1.0 | 7.9 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.4 | 5.2% | 8 |
| PSW.Relentless 0.1 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.0 | 15 / 35 | 5216 |
| 2 | 2 | 62.8 | 67.6 | 12 / 35 | 5040 |
| 3 | 2 | 59.8 | 61.3 | 8 / 35 | 4762 |
| 4 | 2 | 64.5 | 74.3 | 9 / 35 | 4899 |
| 5 | 1 | 63.2 | 67.6 | 15 / 35 | 5187 |
| 6 | 2 | 63.0 | 67.9 | 9 / 35 | 5134 |
| 7 | 2 | 60.0 | 57.8 | 9 / 35 | 4804 |
| 8 | 1 | 64.0 | 72.7 | 15 / 35 | 4928 |
| 9 | 1 | 62.2 | 66.0 | 11 / 35 | 5026 |
| 10 | 2 | 64.9 | 72.1 | 16 / 35 | 5358 |
| 11 | 2 | 64.0 | 73.7 | 13 / 35 | 4854 |
| 12 | 1 | 60.4 | 61.6 | 11 / 35 | 4561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 130 | 44% |
| cs.Wren 1.0 | 46 | 91% |
| mz.Cork 0.1 | 17 | 76% |
| js.PinBall 1.6 | 17 | 71% |
| donjezza.Jezza 1.0 | 8 | 38% |
| evd.X1 0.01 | 6 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |

Hadur died in 279 of 420 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 136 | 49% | 197 |
| js.PinBall 1.6 | 31 | 11% | 47 |
| joe.ADinosaur 1.0 | 25 | 9% | 32 |
| evd.X1 0.01 | 25 | 9% | 29 |
| cs.Wren 1.0 | 21 | 8% | 51 |
| mz.Cork 0.1 | 16 | 6% | 30 |
| PSW.Relentless 0.1 | 15 | 5% | 16 |
| donjezza.Jezza 1.0 | 6 | 2% | 11 |
| jsal.Jsalbot 1.0 | 4 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.6 | 270 / 420 | 2.56 | 18.7% | 58048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 270 |
| myl.nano.Graviton 1.10 | 2.6 | 11.5% | 34 |
| ntc.Opposite 1.5 | 3.8 | 10.9% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 10.3% | 33 |
| pfvicm.Sobieski 7.2.3b | 5.9 | 9.5% | 9 |
| DBall.NUKE 0.1 | 6.9 | 8.4% | 21 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 15 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.7 | 17 / 35 | 4715 |
| 2 | 1 | 69.0 | 87.0 | 25 / 35 | 4968 |
| 3 | 1 | 68.4 | 85.1 | 25 / 35 | 4645 |
| 4 | 1 | 70.4 | 90.2 | 26 / 35 | 5338 |
| 5 | 1 | 69.0 | 85.1 | 23 / 35 | 4927 |
| 6 | 1 | 68.3 | 86.0 | 25 / 35 | 4528 |
| 7 | 1 | 67.7 | 81.9 | 21 / 35 | 4960 |
| 8 | 1 | 68.2 | 82.5 | 23 / 35 | 5111 |
| 9 | 1 | 65.1 | 73.7 | 18 / 35 | 4500 |
| 10 | 1 | 69.5 | 88.6 | 26 / 35 | 4977 |
| 11 | 1 | 68.0 | 86.7 | 21 / 35 | 4729 |
| 12 | 1 | 65.2 | 73.0 | 20 / 35 | 4650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 68 | 96% |
| stelo.AreaTargetingBot 1.1 | 64 | 88% |
| donjezza.Muncho 1.0 | 32 | 84% |
| DBall.NUKE 0.1 | 30 | 90% |
| disan.Chair 2.2.0 | 29 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 29 | 90% |
| ntc.Opposite 1.5 | 27 | 85% |
| pfvicm.Sobieski 7.2.3b | 16 | 75% |
| pbg.R2D2 1.0 | 8 | 100% |

Hadur died in 152 of 420 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 43 | 28% | 60 |
| myl.nano.Graviton 1.10 | 23 | 15% | 77 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 14% | 51 |
| stelo.AreaTargetingBot 1.1 | 20 | 13% | 66 |
| ntc.Opposite 1.5 | 17 | 11% | 49 |
| donjezza.Muncho 1.0 | 9 | 6% | 36 |
| DBall.NUKE 0.1 | 8 | 5% | 33 |
| disan.Chair 2.2.0 | 7 | 5% | 35 |
| pbg.R2D2 1.0 | 3 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.7 | 193 / 420 | 3.36 | 16.0% | 51316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.0% | 193 |
| oog.melee.Capulet 1.2 | 2.6 | 14.1% | 98 |
| kawigi.micro.Shiz 1.1 | 2.9 | 13.6% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.6% | 39 |
| yagami.Tidus 0.11 | 5.1 | 11.4% | 15 |
| ejb.Polaris 1.0.1 | 5.7 | 10.6% | 16 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.5 | 17 / 35 | 4710 |
| 2 | 1 | 65.5 | 74.9 | 15 / 35 | 4363 |
| 3 | 1 | 67.1 | 81.3 | 23 / 35 | 4249 |
| 4 | 1 | 63.5 | 70.5 | 11 / 35 | 4258 |
| 5 | 1 | 65.8 | 75.9 | 17 / 35 | 4458 |
| 6 | 2 | 63.8 | 70.5 | 14 / 35 | 4093 |
| 7 | 1 | 63.2 | 67.6 | 14 / 35 | 4165 |
| 8 | 1 | 63.3 | 66.3 | 16 / 35 | 4351 |
| 9 | 1 | 63.4 | 69.2 | 13 / 35 | 4097 |
| 10 | 1 | 67.9 | 83.8 | 19 / 35 | 4259 |
| 11 | 1 | 65.3 | 74.9 | 19 / 35 | 4289 |
| 12 | 1 | 64.0 | 72.4 | 15 / 35 | 4024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 65 | 91% |
| oog.melee.Capulet 1.2 | 64 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 83% |
| yagami.Tidus 0.11 | 30 | 97% |
| ejb.Polaris 1.0.1 | 25 | 80% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 227 of 420 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 93 | 41% | 132 |
| ejb.Polaris 1.0.1 | 35 | 15% | 64 |
| yagami.Tidus 0.11 | 24 | 11% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 10% | 74 |
| kawigi.micro.Shiz 1.1 | 20 | 9% | 58 |
| stelo.MirrorNano 1.3 | 13 | 6% | 13 |
| step.nanoPri 1.0 | 10 | 4% | 12 |
| kurios.DOSexe .9a | 10 | 4% | 9 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.9 | 279 / 420 | 2.63 | 18.1% | 56430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.1% | 279 |
| wee.Gem 1.8.4 | 3.4 | 11.7% | 47 |
| wompi.Quokka 1.6 | 3.5 | 11.4% | 26 |
| bzdp.Pansy 2.1 | 3.6 | 11.5% | 33 |
| ratosh.Nobo 0.21 | 3.7 | 11.3% | 13 |
| m3thos.Eva00 1.1 | 6.1 | 9.6% | 16 |
| bayen.UbaMicro 1.4 | 6.8 | 8.4% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.0 | 21 / 35 | 4396 |
| 2 | 1 | 66.1 | 77.5 | 20 / 35 | 4922 |
| 3 | 1 | 68.7 | 87.3 | 27 / 35 | 4629 |
| 4 | 1 | 65.9 | 76.5 | 21 / 35 | 4686 |
| 5 | 1 | 65.4 | 77.5 | 18 / 35 | 4646 |
| 6 | 1 | 68.2 | 85.1 | 23 / 35 | 5059 |
| 7 | 1 | 67.9 | 81.3 | 24 / 35 | 5204 |
| 8 | 1 | 66.2 | 80.0 | 23 / 35 | 4443 |
| 9 | 1 | 66.9 | 80.6 | 25 / 35 | 4518 |
| 10 | 1 | 68.8 | 88.9 | 26 / 35 | 4720 |
| 11 | 1 | 67.1 | 82.5 | 26 / 35 | 4406 |
| 12 | 1 | 68.6 | 86.0 | 25 / 35 | 4801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 86 | 90% |
| bzdp.Pansy 2.1 | 74 | 96% |
| wompi.Quokka 1.6 | 49 | 92% |
| ratosh.Nobo 0.21 | 39 | 92% |
| m3thos.Eva00 1.1 | 28 | 96% |
| bayen.UbaMicro 1.4 | 14 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |

Hadur died in 143 of 420 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 26 | 18% | 33 |
| wee.Gem 1.8.4 | 22 | 15% | 101 |
| wompi.Quokka 1.6 | 20 | 14% | 54 |
| ratosh.Nobo 0.21 | 18 | 13% | 56 |
| bzdp.Pansy 2.1 | 17 | 12% | 84 |
| bayen.UbaMicro 1.4 | 15 | 10% | 26 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 6% | 20 |
| stelo.MyAgileRobot 0.2 | 8 | 6% | 15 |
| m3thos.Eva00 1.1 | 7 | 5% | 28 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 83.9 | 152 / 420 | 2.45 | 19.5% | 87940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 19.5% | 152 |
| wompi.Wallaby 5.1 | 1.6 | 19.4% | 228 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 28 |
| ayk.WallHugger 1.0 | 4.4 | 9.8% | 4 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.2% | 5 |
| stuff.Vlad 0.1 | 5.9 | 8.2% | 1 |
| stelo.PianistNano 1.2 | 7.1 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 1 |
| sample.SittingDuck 1.0 | 9.1 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.9 | 13 / 35 | 7039 |
| 2 | 1 | 70.6 | 82.9 | 17 / 35 | 7307 |
| 3 | 1 | 71.7 | 87.9 | 18 / 35 | 7292 |
| 4 | 2 | 70.0 | 86.0 | 11 / 35 | 6783 |
| 5 | 1 | 71.4 | 87.6 | 16 / 35 | 7236 |
| 6 | 2 | 69.7 | 80.0 | 14 / 35 | 7046 |
| 7 | 1 | 71.2 | 85.1 | 14 / 35 | 7950 |
| 8 | 2 | 69.5 | 79.7 | 8 / 35 | 7343 |
| 9 | 2 | 70.5 | 81.9 | 11 / 35 | 7742 |
| 10 | 1 | 71.0 | 82.5 | 13 / 35 | 7989 |
| 11 | 2 | 68.2 | 78.4 | 10 / 35 | 6611 |
| 12 | 1 | 70.7 | 85.7 | 7 / 35 | 7602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 232 | 34% |
| mz.NanoGod 2.02 | 33 | 73% |
| exauge.GateKeeper 1.1.121g | 17 | 100% |
| drd.Dreadknoght 0.9 | 11 | 91% |
| ayk.WallHugger 1.0 | 11 | 82% |
| stelo.PianistNano 1.2 | 7 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 269 of 420 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 197 | 73% | 288 |
| mz.NanoGod 2.02 | 39 | 14% | 73 |
| ayk.WallHugger 1.0 | 11 | 4% | 18 |
| exauge.GateKeeper 1.1.121g | 11 | 4% | 18 |
| stelo.PianistNano 1.2 | 5 | 2% | 7 |
| stuff.Vlad 0.1 | 3 | 1% | 9 |
| drd.Dreadknoght 0.9 | 3 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 73.9 | 230 / 420 | 3.35 | 17.0% | 58765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.0% | 230 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 40 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.6% | 38 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 37 |
| stelo.MirrorMicro 1.0 | 6.1 | 8.9% | 13 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 6 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 16 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.8 | 15 / 35 | 4407 |
| 2 | 1 | 65.4 | 72.7 | 21 / 35 | 5020 |
| 3 | 1 | 64.0 | 70.2 | 18 / 35 | 4584 |
| 4 | 1 | 64.5 | 70.5 | 19 / 35 | 4881 |
| 5 | 1 | 65.3 | 74.0 | 20 / 35 | 4685 |
| 6 | 1 | 66.7 | 79.0 | 20 / 35 | 5013 |
| 7 | 1 | 68.5 | 81.3 | 26 / 35 | 5738 |
| 8 | 1 | 64.7 | 70.8 | 21 / 35 | 4826 |
| 9 | 1 | 67.2 | 78.7 | 20 / 35 | 5195 |
| 10 | 1 | 65.6 | 75.9 | 18 / 35 | 5051 |
| 11 | 1 | 63.6 | 69.8 | 15 / 35 | 4918 |
| 12 | 1 | 64.8 | 73.0 | 17 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 91 | 91% |
| dummy.micro.Sparrow 2.5 | 54 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 37 | 89% |
| bvh.micro.Freya 0.3 | 33 | 91% |
| stelo.MirrorMicro 1.0 | 18 | 89% |
| ap.Frederick 1.1 | 12 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 21% | 121 |
| conscience.Electron 1.3g | 36 | 19% | 42 |
| dummy.micro.Sparrow 2.5 | 28 | 15% | 71 |
| mn.nano.perceptual.Impact 1.3.0 | 26 | 14% | 25 |
| bvh.micro.Freya 0.3 | 22 | 12% | 39 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 11% | 75 |
| dl.BetterWalls 1.0 | 12 | 6% | 20 |
| stelo.MirrorMicro 1.0 | 6 | 3% | 26 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.7 | 319 / 420 | 2.02 | 21.4% | 83756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.4% | 319 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 30 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 19 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 15 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.4% | 7 |
| dsw.StaticD 1.0 | 5.3 | 8.9% | 19 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 7 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.6% | 2 |
| sample.Corners 1.0 | 9.2 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.5 | 29 / 35 | 6921 |
| 2 | 1 | 70.8 | 88.3 | 24 / 35 | 6268 |
| 3 | 1 | 69.0 | 81.0 | 22 / 35 | 6529 |
| 4 | 1 | 72.6 | 92.4 | 28 / 35 | 7309 |
| 5 | 1 | 72.8 | 90.5 | 28 / 35 | 7530 |
| 6 | 1 | 70.7 | 86.7 | 25 / 35 | 6484 |
| 7 | 1 | 72.5 | 90.5 | 27 / 35 | 7339 |
| 8 | 1 | 72.9 | 90.5 | 28 / 35 | 7676 |
| 9 | 1 | 71.5 | 87.9 | 27 / 35 | 6812 |
| 10 | 1 | 72.4 | 92.4 | 29 / 35 | 6903 |
| 11 | 1 | 70.5 | 83.2 | 26 / 35 | 6929 |
| 12 | 1 | 71.9 | 90.8 | 26 / 35 | 7056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 111 | 90% |
| sul.Lunar 1.1 | 90 | 100% |
| supersample.SuperBoxBot 1.0 | 41 | 98% |
| dsw.StaticD 1.0 | 29 | 69% |
| sample.MyFirstJuniorRobot 1.0 | 21 | 90% |
| mme.NikeEnhanced 2.0 | 20 | 90% |
| sample.Corners 1.0 | 12 | 92% |
| tlp.ThreeLeggedPig 1 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 10 | 100% |

Hadur died in 105 of 420 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 28 | 27% | 119 |
| dsw.StaticD 1.0 | 24 | 23% | 52 |
| supersample.SuperBoxBot 1.0 | 21 | 20% | 59 |
| sul.Lunar 1.1 | 7 | 7% | 103 |
| mme.NikeEnhanced 2.0 | 7 | 7% | 27 |
| sample.Corners 1.0 | 6 | 6% | 17 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 4% | 22 |
| tlp.ThreeLeggedPig 1 | 4 | 4% | 8 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 13 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.9 | 231 / 420 | 2.90 | 18.0% | 71667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.0% | 231 |
| radnor.DoctorBob 1.42 | 2.8 | 12.8% | 50 |
| mld.Wisdom 1.0 | 2.9 | 12.4% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.9% | 36 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 27 |
| KiraNL.Chupacabra 0.4 | 5.6 | 9.8% | 13 |
| sample.Walls 1.0 | 7.1 | 7.9% | 15 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.4% | 7 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 25 / 35 | 6123 |
| 2 | 1 | 70.9 | 89.8 | 25 / 35 | 6734 |
| 3 | 1 | 65.2 | 73.7 | 16 / 35 | 5690 |
| 4 | 1 | 66.0 | 73.3 | 16 / 35 | 6156 |
| 5 | 1 | 67.7 | 81.6 | 19 / 35 | 5749 |
| 6 | 1 | 68.2 | 79.0 | 22 / 35 | 6189 |
| 7 | 1 | 65.6 | 74.6 | 17 / 35 | 5705 |
| 8 | 1 | 66.3 | 74.9 | 19 / 35 | 5632 |
| 9 | 1 | 70.4 | 87.9 | 23 / 35 | 6873 |
| 10 | 1 | 65.0 | 71.7 | 18 / 35 | 5329 |
| 11 | 1 | 66.8 | 80.0 | 16 / 35 | 5932 |
| 12 | 1 | 64.5 | 72.4 | 15 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 96 | 98% |
| radnor.DoctorBob 1.42 | 61 | 80% |
| mld.Wisdom 1.0 | 34 | 68% |
| KiraNL.Chupacabra 0.4 | 18 | 89% |
| amz.NanoClone 1.41 | 16 | 81% |
| jangs.ns51 1.0 | 15 | 87% |
| sample.Walls 1.0 | 12 | 100% |
| GarmBox.Oranges 1.0 | 8 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 61 | 32% | 84 |
| radnor.DoctorBob 1.42 | 51 | 27% | 106 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 12% | 110 |
| KiraNL.Chupacabra 0.4 | 17 | 9% | 38 |
| amz.NanoClone 1.41 | 15 | 8% | 30 |
| GarmBox.Oranges 1.0 | 9 | 5% | 11 |
| sample.Walls 1.0 | 8 | 4% | 18 |
| jangs.ns51 1.0 | 7 | 4% | 18 |

