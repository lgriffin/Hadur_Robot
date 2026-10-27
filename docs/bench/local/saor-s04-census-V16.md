# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 88.8 | 311 / 420 | 2.01 | 21.5% | 85698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 21.5% | 311 |
| mz.AntiGrav 1.0 | 2.8 | 13.6% | 26 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 33 |
| mld.Infinity 2.2 | 3.3 | 12.9% | 33 |
| amz.NanoClone 1.41 | 4.9 | 10.3% | 6 |
| sample.Walls 1.0 | 6.3 | 7.0% | 2 |
| GarmBox.Oranges 1.0 | 7.1 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 5 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 1 |
| sample.Target 1.0 | 9.8 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.9 | 27 / 35 | 7185 |
| 2 | 1 | 74.8 | 94.6 | 32 / 35 | 7826 |
| 3 | 1 | 72.4 | 91.7 | 26 / 35 | 6897 |
| 4 | 1 | 70.8 | 83.8 | 26 / 35 | 6916 |
| 5 | 1 | 72.3 | 88.9 | 24 / 35 | 7115 |
| 6 | 1 | 73.1 | 92.7 | 27 / 35 | 7225 |
| 7 | 1 | 71.4 | 86.3 | 24 / 35 | 7107 |
| 8 | 1 | 71.1 | 86.3 | 23 / 35 | 6852 |
| 9 | 1 | 72.1 | 89.5 | 28 / 35 | 7116 |
| 10 | 1 | 71.1 | 85.1 | 21 / 35 | 7175 |
| 11 | 1 | 72.7 | 87.9 | 27 / 35 | 7125 |
| 12 | 1 | 72.2 | 89.2 | 26 / 35 | 7159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 126 | 98% |
| mld.Infinity 2.2 | 103 | 89% |
| radnor.DoctorBob 1.42 | 84 | 82% |
| amz.NanoClone 1.41 | 12 | 83% |
| jangs.ns51 1.0 | 6 | 83% |
| arthord.MannyPacquiao Beta | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 110 of 420 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 38% | 141 |
| mld.Infinity 2.2 | 19 | 17% | 35 |
| mz.AntiGrav 1.0 | 15 | 14% | 143 |
| amz.NanoClone 1.41 | 14 | 13% | 34 |
| GarmBox.Oranges 1.0 | 9 | 8% | 16 |
| sample.Walls 1.0 | 4 | 4% | 23 |
| jangs.ns51 1.0 | 4 | 4% | 10 |
| arthord.MannyPacquiao Beta | 2 | 2% | 11 |
| sample.Target 1.0 | 1 | 1% | 0 |

## Melee bench: F02

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.2 | 281 / 420 | 2.15 | 19.0% | 61803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 19.0% | 281 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 98 |
| mld.DustBunny 3.8 | 3.1 | 12.9% | 16 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.1% | 12 |
| zyx.nano.Ant 1.1 | 7.1 | 7.8% | 1 |
| bzdp.BoxCar 2.0 | 7.5 | 7.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 6.5% | 5 |
| fullsail.SweetTea 1.1 | 8.1 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.1 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.1 | 21 / 35 | 4977 |
| 2 | 1 | 69.3 | 91.4 | 21 / 35 | 5150 |
| 3 | 1 | 66.7 | 81.9 | 23 / 35 | 4609 |
| 4 | 1 | 68.8 | 88.3 | 22 / 35 | 5077 |
| 5 | 1 | 70.5 | 92.1 | 25 / 35 | 5686 |
| 6 | 1 | 70.2 | 94.3 | 30 / 35 | 4820 |
| 7 | 1 | 68.2 | 87.6 | 20 / 35 | 4898 |
| 8 | 1 | 70.1 | 93.7 | 29 / 35 | 5061 |
| 9 | 1 | 68.7 | 88.3 | 24 / 35 | 5170 |
| 10 | 1 | 64.9 | 66.0 | 16 / 35 | 5584 |
| 11 | 1 | 69.0 | 85.7 | 25 / 35 | 5545 |
| 12 | 1 | 69.6 | 92.7 | 25 / 35 | 5226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 169 | 70% |
| mld.DustBunny 3.8 | 106 | 94% |
| djdjdj.NanoSkunk10 1.0 | 27 | 93% |
| fullsail.SweetTea 1.1 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| zyx.nano.Ant 1.1 | 6 | 100% |

Hadur died in 140 of 420 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 49% | 190 |
| mld.DustBunny 3.8 | 21 | 15% | 92 |
| zyx.nano.Ant 1.1 | 9 | 6% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 6% | 19 |
| fullsail.SweetTea 1.1 | 8 | 6% | 20 |
| djdjdj.NanoSkunk10 1.0 | 7 | 5% | 41 |
| maribo.melee.BMV 0.1 | 7 | 5% | 24 |
| cs.Grudge 1.0 | 6 | 4% | 6 |
| bzdp.BoxCar 2.0 | 4 | 3% | 9 |

## Melee bench: F03

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.8 | 299 / 420 | 2.28 | 20.5% | 74071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 20.5% | 299 |
| myl.micro.Troodon 1.10 | 2.1 | 14.0% | 54 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 4.9 | 9.7% | 23 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 14 |
| fm.mammillarias 1.3 | 5.8 | 8.9% | 7 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.3% | 3 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.0 | 27 / 35 | 6290 |
| 2 | 1 | 71.0 | 86.3 | 27 / 35 | 6215 |
| 3 | 1 | 71.7 | 90.2 | 28 / 35 | 6429 |
| 4 | 1 | 72.2 | 92.7 | 28 / 35 | 6584 |
| 5 | 1 | 69.6 | 84.4 | 26 / 35 | 5575 |
| 6 | 1 | 67.6 | 75.6 | 21 / 35 | 5808 |
| 7 | 1 | 71.0 | 85.4 | 24 / 35 | 6577 |
| 8 | 1 | 71.2 | 87.0 | 24 / 35 | 6414 |
| 9 | 1 | 68.0 | 76.8 | 21 / 35 | 5620 |
| 10 | 1 | 72.5 | 94.0 | 27 / 35 | 6718 |
| 11 | 1 | 69.7 | 83.2 | 23 / 35 | 5901 |
| 12 | 1 | 69.2 | 80.6 | 23 / 35 | 5940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 99 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 70 | 91% |
| myl.nano.KomoriNinja 1.1 | 47 | 94% |
| cb.nano.Insomnia 1.0 | 42 | 90% |
| sp.Nanos.Ember 1.1 | 27 | 96% |
| fm.mammillarias 1.3 | 19 | 95% |
| cs.sheldor.Talon 1.1 | 9 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 32 | 26% | 63 |
| fm.mammillarias 1.3 | 22 | 18% | 37 |
| myl.micro.Troodon 1.10 | 18 | 15% | 137 |
| cb.nano.Insomnia 1.0 | 18 | 15% | 26 |
| myl.nano.KomoriNinja 1.1 | 15 | 12% | 59 |
| cs.sheldor.Talon 1.1 | 8 | 7% | 33 |
| sample.Fire 1.0 | 5 | 4% | 17 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 42 |
| sample.Tracker 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.5 | 314 / 420 | 2.13 | 20.9% | 79543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 20.9% | 314 |
| tvv.micro.Antares 1.1.1 | 2.4 | 12.1% | 22 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.2% | 22 |
| stelo.SoJNanoMelee 1.1 | 5.1 | 9.3% | 27 |
| tj.zombie1n 1.0.1 | 5.4 | 8.9% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 0 |
| yk.JahMicro 1.0 | 6.4 | 8.1% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7.6 | 7.8% | 10 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.0 | 27 / 35 | 6850 |
| 2 | 1 | 72.4 | 93.0 | 28 / 35 | 6981 |
| 3 | 1 | 69.5 | 82.5 | 23 / 35 | 6730 |
| 4 | 1 | 70.2 | 84.4 | 26 / 35 | 6420 |
| 5 | 1 | 71.7 | 92.1 | 26 / 35 | 6841 |
| 6 | 1 | 71.1 | 87.3 | 26 / 35 | 6993 |
| 7 | 1 | 68.6 | 81.3 | 25 / 35 | 5875 |
| 8 | 1 | 71.2 | 89.5 | 30 / 35 | 6478 |
| 9 | 1 | 72.9 | 94.0 | 31 / 35 | 6997 |
| 10 | 1 | 71.9 | 91.4 | 27 / 35 | 6710 |
| 11 | 1 | 70.2 | 86.0 | 25 / 35 | 6451 |
| 12 | 1 | 67.3 | 74.3 | 20 / 35 | 6217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 120 | 91% |
| stelo.SoJNanoMelee 1.1 | 95 | 95% |
| tvv.micro.Antares 1.1.1 | 41 | 90% |
| tj.zombie1n 1.0.1 | 28 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 25 | 88% |
| yk.JahMicro 1.0 | 13 | 85% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |

Hadur died in 108 of 420 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 38% | 161 |
| stelo.SoJNanoMelee 1.1 | 20 | 19% | 74 |
| tvv.micro.Antares 1.1.1 | 12 | 11% | 59 |
| yk.JahMicro 1.0 | 12 | 11% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 7% | 19 |
| tj.zombie1n 1.0.1 | 8 | 7% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 37 |
| repositorio.NanoStep 1.0 | 3 | 3% | 20 |
| sample.VelociRobot 1.0 | 1 | 1% | 18 |

## Melee bench: F05

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.4 | 182 / 420 | 3.93 | 15.5% | 56732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.1 | 15.5% | 182 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 65 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 56 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.8% | 43 |
| EBBU.Sim2 1.02 | 5.4 | 10.0% | 20 |
| sam.Samspin 1.0 | 5.8 | 9.9% | 24 |
| zyx.nano.BacillusComma 1.0 | 7.1 | 9.0% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.1% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.1 | 16 / 35 | 5685 |
| 2 | 1 | 62.7 | 66.0 | 15 / 35 | 4471 |
| 3 | 1 | 62.9 | 67.6 | 15 / 35 | 4801 |
| 4 | 1 | 64.3 | 72.1 | 17 / 35 | 5094 |
| 5 | 1 | 61.8 | 65.4 | 13 / 35 | 4767 |
| 6 | 1 | 63.8 | 72.1 | 16 / 35 | 4707 |
| 7 | 1 | 64.4 | 72.1 | 17 / 35 | 4684 |
| 8 | 1 | 65.3 | 78.4 | 20 / 35 | 4584 |
| 9 | 1 | 63.9 | 67.9 | 17 / 35 | 4986 |
| 10 | 2 | 54.8 | 47.9 | 9 / 35 | 3871 |
| 11 | 1 | 60.5 | 62.2 | 12 / 35 | 4555 |
| 12 | 1 | 62.5 | 65.4 | 15 / 35 | 4527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 64 | 94% |
| oog.melee.Corsair 1.0 | 62 | 66% |
| ahf.NanoAndrew .4 | 39 | 82% |
| sam.Samspin 1.0 | 23 | 96% |
| EBBU.Sim2 1.02 | 15 | 87% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 241 of 420 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 17% | 95 |
| oog.melee.Corsair 1.0 | 38 | 16% | 84 |
| bwbaugh.nano.Tirunculus 0.0.0a | 35 | 15% | 35 |
| ahf.NanoAndrew .4 | 33 | 14% | 72 |
| robar.nano.Assertive_Melee 0.2 | 26 | 11% | 32 |
| zyx.nano.BacillusComma 1.0 | 25 | 10% | 30 |
| sam.Samspin 1.0 | 22 | 9% | 36 |
| EBBU.Sim2 1.02 | 14 | 6% | 26 |
| sample.TrackFire 1.0 | 8 | 3% | 10 |

## Melee bench: F06

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.9 | 308 / 420 | 2.00 | 19.9% | 65427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 19.9% | 308 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.9% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.6% | 32 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 10 |
| fm.claire 1.7 | 5.8 | 8.8% | 2 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.5% | 12 |
| sample.SpinBot 1.0 | 7.6 | 7.4% | 7 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 2 |
| pa.Improved 1.0 | 9.5 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 95.2 | 29 / 35 | 5399 |
| 2 | 1 | 68.7 | 89.2 | 22 / 35 | 5024 |
| 3 | 1 | 70.7 | 93.0 | 29 / 35 | 5397 |
| 4 | 1 | 69.0 | 85.1 | 26 / 35 | 5269 |
| 5 | 1 | 71.5 | 92.7 | 28 / 35 | 5911 |
| 6 | 1 | 69.7 | 87.3 | 27 / 35 | 5568 |
| 7 | 1 | 69.5 | 87.0 | 23 / 35 | 5782 |
| 8 | 1 | 70.2 | 90.5 | 24 / 35 | 5803 |
| 9 | 1 | 71.6 | 95.2 | 29 / 35 | 5956 |
| 10 | 1 | 66.9 | 78.7 | 23 / 35 | 5122 |
| 11 | 1 | 69.0 | 87.0 | 24 / 35 | 5282 |
| 12 | 1 | 68.3 | 85.4 | 24 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 147 | 91% |
| oog.melee.CapuletDroid 1.1 | 72 | 82% |
| gh.nano.Grofvuil 0.2 | 40 | 90% |
| arthord.NanoSatanMelee Beta | 27 | 89% |
| sample.SpinBot 1.0 | 21 | 100% |
| winamp32.micro.MicroMacro 1.0 | 14 | 57% |
| fm.claire 1.7 | 12 | 92% |
| kurios.DOSexe .9b | 10 | 100% |
| pa.Improved 1.0 | 5 | 80% |

Hadur died in 114 of 420 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 24% | 158 |
| oog.melee.CapuletDroid 1.1 | 20 | 18% | 24 |
| arthord.NanoSatanMelee Beta | 19 | 17% | 39 |
| gh.nano.Grofvuil 0.2 | 17 | 15% | 76 |
| winamp32.micro.MicroMacro 1.0 | 10 | 9% | 38 |
| fm.claire 1.7 | 8 | 7% | 25 |
| pa.Improved 1.0 | 6 | 5% | 15 |
| sample.SpinBot 1.0 | 4 | 4% | 15 |
| kurios.DOSexe .9b | 3 | 3% | 28 |

## Melee bench: F07

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.7 | 189 / 420 | 2.56 | 18.2% | 67630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 18.2% | 189 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.0% | 88 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 81 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.2% | 38 |
| DBall.Anarchy 0.1 | 5.4 | 8.6% | 12 |
| caimano.Furia_Ceca 0.22 | 6.1 | 7.6% | 3 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 5 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.9 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 17 / 35 | 5278 |
| 2 | 1 | 67.5 | 81.3 | 17 / 35 | 5525 |
| 3 | 1 | 67.6 | 82.5 | 14 / 35 | 5688 |
| 4 | 1 | 68.9 | 85.1 | 20 / 35 | 5775 |
| 5 | 1 | 67.6 | 81.3 | 20 / 35 | 5475 |
| 6 | 1 | 67.9 | 81.6 | 15 / 35 | 5597 |
| 7 | 1 | 68.2 | 84.4 | 16 / 35 | 5551 |
| 8 | 1 | 68.4 | 84.8 | 15 / 35 | 5961 |
| 9 | 1 | 68.6 | 87.3 | 13 / 35 | 5825 |
| 10 | 1 | 67.7 | 83.2 | 15 / 35 | 5492 |
| 11 | 1 | 66.3 | 75.2 | 14 / 35 | 5525 |
| 12 | 1 | 68.2 | 83.5 | 13 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 96 | 42% |
| spinnercat.micro.Tyger 0.1 | 94 | 88% |
| gh.micro.Gruweltje 0.7 | 67 | 27% |
| DBall.Anarchy 0.1 | 27 | 100% |
| el.JumpShoot 0.2 | 11 | 91% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 232 of 420 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 87 | 38% | 130 |
| gh.micro.Gruweltje 0.7 | 75 | 32% | 117 |
| spinnercat.micro.Tyger 0.1 | 32 | 14% | 90 |
| acogdev.alpha 0.2 | 10 | 4% | 16 |
| fire219.CatBot 1.0 | 9 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 8 | 3% | 14 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 7 |
| DBall.Anarchy 0.1 | 3 | 1% | 26 |
| el.JumpShoot 0.2 | 3 | 1% | 10 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 70.6 | 223 / 420 | 3.64 | 16.4% | 61392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.2 | 16.4% | 223 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 59 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.8% | 79 |
| qualidafial.MajorDick 1.0.1 | 4.4 | 9.8% | 14 |
| germ.TheMind .2 | 5.7 | 9.2% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.7% | 4 |
| awesomeness.Elite 1.0 | 6.4 | 8.6% | 18 |
| stelo.UntouchableNano 1.3 | 7.6 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 70.8 | 13 / 35 | 5265 |
| 2 | 3 | 60.1 | 56.8 | 14 / 35 | 4793 |
| 3 | 1 | 65.2 | 71.7 | 18 / 35 | 5227 |
| 4 | 1 | 65.7 | 73.3 | 19 / 35 | 5075 |
| 5 | 1 | 67.3 | 78.4 | 22 / 35 | 5353 |
| 6 | 1 | 64.1 | 68.6 | 18 / 35 | 5169 |
| 7 | 1 | 62.6 | 66.0 | 17 / 35 | 4656 |
| 8 | 1 | 66.0 | 74.0 | 21 / 35 | 5416 |
| 9 | 1 | 64.9 | 72.1 | 20 / 35 | 5119 |
| 10 | 1 | 61.4 | 63.8 | 17 / 35 | 4572 |
| 11 | 1 | 65.7 | 73.0 | 22 / 35 | 5117 |
| 12 | 1 | 67.7 | 79.0 | 22 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 157 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 42 | 74% |
| germ.TheMind .2 | 13 | 85% |
| awesomeness.Elite 1.0 | 12 | 83% |
| lrem.micro.MoggFanatic 0.2 | 9 | 89% |
| sample.Crazy 1.0 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 7 | 100% |

Hadur died in 197 of 420 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 42% | 211 |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 20% | 72 |
| qualidafial.MajorDick 1.0.1 | 18 | 9% | 22 |
| lrem.micro.MoggFanatic 0.2 | 16 | 8% | 26 |
| stelo.UntouchableNano 1.3 | 14 | 7% | 25 |
| germ.TheMind .2 | 9 | 5% | 26 |
| awesomeness.Elite 1.0 | 7 | 4% | 15 |
| mym.EdgeStalker 1.0 | 6 | 3% | 8 |
| sample.Crazy 1.0 | 5 | 3% | 15 |

## Melee bench: F09

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.5 | 311 / 420 | 2.03 | 20.1% | 60786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 20.1% | 311 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 24 |
| maribo.IotaCT 1.1 | 4.1 | 10.9% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.7% | 3 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 11 |
| ratosh.Wesco 1.4 | 7.7 | 8.0% | 8 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 13 |
| spinnercat.Omen 1.0 | 8.1 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.2 | 23 / 35 | 4999 |
| 2 | 1 | 70.3 | 87.3 | 25 / 35 | 5299 |
| 3 | 1 | 68.3 | 80.3 | 21 / 35 | 4932 |
| 4 | 1 | 70.9 | 91.7 | 27 / 35 | 4911 |
| 5 | 1 | 72.1 | 92.7 | 29 / 35 | 5271 |
| 6 | 1 | 71.7 | 91.7 | 30 / 35 | 5155 |
| 7 | 1 | 69.3 | 84.8 | 24 / 35 | 4760 |
| 8 | 1 | 71.0 | 93.3 | 28 / 35 | 4919 |
| 9 | 1 | 70.7 | 90.2 | 26 / 35 | 4912 |
| 10 | 1 | 71.0 | 90.5 | 28 / 35 | 4892 |
| 11 | 1 | 71.5 | 90.2 | 26 / 35 | 5579 |
| 12 | 1 | 69.9 | 87.6 | 24 / 35 | 5157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 134 | 95% |
| nz.jdc.nano.GridFu 1.0 | 76 | 92% |
| maribo.IotaCT 1.1 | 33 | 91% |
| stelo.PatternRobot 1.0 | 30 | 90% |
| timmit.nano.TimDog 0.33 | 26 | 81% |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 94% |
| spinnercat.Omen 1.0 | 12 | 100% |
| ratosh.Wesco 1.4 | 10 | 70% |

Hadur died in 109 of 420 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 28 | 26% | 119 |
| nz.jdc.nano.GridFu 1.0 | 20 | 18% | 108 |
| timmit.nano.TimDog 0.33 | 15 | 14% | 43 |
| stelo.PatternRobot 1.0 | 15 | 14% | 35 |
| maribo.IotaCT 1.1 | 12 | 11% | 52 |
| ratosh.Wesco 1.4 | 11 | 10% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 19 |
| spinnercat.Omen 1.0 | 1 | 1% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.3 | 355 / 420 | 1.61 | 21.7% | 76378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 21.7% | 355 |
| tvv.nano.Polaris 1.2 | 2.4 | 11.8% | 18 |
| baal.nano.N 1.42 | 3.2 | 11.0% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 5 |
| zyx.micro.Ant 1.1 | 5.0 | 9.0% | 10 |
| sanja.First 0.1 | 6.7 | 8.1% | 3 |
| cvt.Firsty 1.0 | 6.8 | 8.2% | 13 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.9% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 27 / 35 | 6419 |
| 2 | 1 | 72.1 | 93.7 | 29 / 35 | 6518 |
| 3 | 1 | 71.0 | 88.9 | 30 / 35 | 6025 |
| 4 | 1 | 72.2 | 95.9 | 33 / 35 | 6335 |
| 5 | 1 | 72.3 | 94.6 | 31 / 35 | 6576 |
| 6 | 1 | 70.4 | 91.7 | 27 / 35 | 5746 |
| 7 | 1 | 71.6 | 92.1 | 30 / 35 | 6364 |
| 8 | 1 | 72.3 | 93.7 | 30 / 35 | 6732 |
| 9 | 1 | 71.9 | 94.0 | 30 / 35 | 6220 |
| 10 | 1 | 71.7 | 95.2 | 29 / 35 | 6084 |
| 11 | 1 | 71.2 | 91.7 | 29 / 35 | 6418 |
| 12 | 1 | 72.7 | 96.2 | 30 / 35 | 6941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 84 | 92% |
| cvt.Firsty 1.0 | 69 | 91% |
| baal.nano.N 1.42 | 66 | 100% |
| zyx.micro.Ant 1.1 | 41 | 93% |
| sanja.First 0.1 | 41 | 95% |
| amk.Punbot.Punbot 0.01 | 32 | 94% |
| Grystrion.TrackerWO 1.0 | 30 | 93% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 66 of 420 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 18 | 27% | 125 |
| Grystrion.TrackerWO 1.0 | 13 | 20% | 44 |
| zyx.micro.Ant 1.1 | 10 | 15% | 65 |
| cvt.Firsty 1.0 | 7 | 11% | 57 |
| sanja.First 0.1 | 6 | 9% | 43 |
| amk.Punbot.Punbot 0.01 | 6 | 9% | 12 |
| sample.RamFire 1.0 | 3 | 5% | 6 |
| baal.nano.N 1.42 | 2 | 3% | 53 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 11 |

## Melee bench: F11

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.7 | 133 / 420 | 3.91 | 15.0% | 59511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.6% | 170 |
| hadur117.micro.SaorV16 0.1 | 1.7 | 15.0% | 133 |
| cs.Wren 1.0 | 3.2 | 12.7% | 31 |
| js.PinBall 1.6 | 4.2 | 11.2% | 34 |
| mz.Cork 0.1 | 4.8 | 10.5% | 16 |
| joe.ADinosaur 1.0 | 6.1 | 9.2% | 16 |
| evd.X1 0.01 | 6.8 | 8.2% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 8 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 9 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 67.0 | 11 / 35 | 4928 |
| 2 | 2 | 60.6 | 62.5 | 10 / 35 | 4639 |
| 3 | 2 | 61.2 | 65.1 | 10 / 35 | 4698 |
| 4 | 1 | 63.8 | 71.7 | 14 / 35 | 4981 |
| 5 | 2 | 59.7 | 61.9 | 10 / 35 | 4587 |
| 6 | 2 | 62.3 | 68.9 | 7 / 35 | 5322 |
| 7 | 2 | 60.9 | 62.2 | 8 / 35 | 5007 |
| 8 | 1 | 64.9 | 74.3 | 16 / 35 | 4753 |
| 9 | 2 | 60.0 | 63.2 | 6 / 35 | 4611 |
| 10 | 1 | 67.2 | 79.0 | 16 / 35 | 5866 |
| 11 | 2 | 60.2 | 61.9 | 9 / 35 | 4690 |
| 12 | 1 | 64.9 | 74.6 | 16 / 35 | 5429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 133 | 42% |
| cs.Wren 1.0 | 43 | 86% |
| js.PinBall 1.6 | 13 | 62% |
| mz.Cork 0.1 | 12 | 83% |
| joe.ADinosaur 1.0 | 8 | 100% |
| evd.X1 0.01 | 6 | 100% |
| donjezza.Jezza 1.0 | 5 | 100% |
| jsal.Jsalbot 1.0 | 4 | 75% |

Hadur died in 289 of 420 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 144 | 50% | 212 |
| joe.ADinosaur 1.0 | 30 | 10% | 32 |
| cs.Wren 1.0 | 29 | 10% | 53 |
| js.PinBall 1.6 | 26 | 9% | 37 |
| evd.X1 0.01 | 21 | 7% | 26 |
| mz.Cork 0.1 | 19 | 7% | 29 |
| PSW.Relentless 0.1 | 14 | 5% | 15 |
| jsal.Jsalbot 1.0 | 3 | 1% | 10 |
| donjezza.Jezza 1.0 | 3 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.4 | 284 / 420 | 2.41 | 19.1% | 59338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 19.1% | 284 |
| myl.nano.Graviton 1.10 | 2.7 | 11.7% | 38 |
| ntc.Opposite 1.5 | 3.8 | 10.9% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.6 | 10.3% | 7 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 7 |
| stelo.AreaTargetingBot 1.1 | 5.1 | 9.9% | 29 |
| disan.Chair 2.2.0 | 6.9 | 8.5% | 15 |
| DBall.NUKE 0.1 | 7.6 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 19 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 23 / 35 | 5291 |
| 2 | 1 | 67.7 | 83.5 | 23 / 35 | 4527 |
| 3 | 1 | 68.4 | 84.4 | 25 / 35 | 4835 |
| 4 | 1 | 70.1 | 90.5 | 24 / 35 | 5030 |
| 5 | 1 | 69.8 | 87.3 | 27 / 35 | 5328 |
| 6 | 1 | 68.5 | 86.7 | 24 / 35 | 4649 |
| 7 | 1 | 66.5 | 77.8 | 20 / 35 | 4853 |
| 8 | 1 | 67.3 | 78.4 | 21 / 35 | 5043 |
| 9 | 1 | 66.8 | 80.0 | 22 / 35 | 4787 |
| 10 | 1 | 69.0 | 85.7 | 25 / 35 | 5022 |
| 11 | 1 | 69.0 | 86.0 | 25 / 35 | 4818 |
| 12 | 1 | 69.5 | 87.6 | 25 / 35 | 5155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 76 | 89% |
| stelo.AreaTargetingBot 1.1 | 71 | 90% |
| disan.Chair 2.2.0 | 32 | 88% |
| DBall.NUKE 0.1 | 30 | 100% |
| ntc.Opposite 1.5 | 29 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 27 | 96% |
| donjezza.Muncho 1.0 | 26 | 96% |
| pfvicm.Sobieski 7.2.3b | 14 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 138 of 420 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 31 | 22% | 47 |
| myl.nano.Graviton 1.10 | 27 | 20% | 94 |
| stelo.AreaTargetingBot 1.1 | 25 | 18% | 72 |
| lrem.micro.SpikeSoldier 0.4 | 19 | 14% | 48 |
| ntc.Opposite 1.5 | 17 | 12% | 48 |
| DBall.NUKE 0.1 | 7 | 5% | 47 |
| disan.Chair 2.2.0 | 6 | 4% | 21 |
| donjezza.Muncho 1.0 | 4 | 3% | 26 |
| pbg.R2D2 1.0 | 2 | 1% | 14 |

## Melee bench: F13

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.3 | 182 / 420 | 3.31 | 16.1% | 51579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.2 | 16.1% | 182 |
| oog.melee.Capulet 1.2 | 2.4 | 13.7% | 92 |
| kawigi.micro.Shiz 1.1 | 2.9 | 13.4% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 39 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 24 |
| ejb.Polaris 1.0.1 | 5.7 | 10.5% | 18 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.8 | 17 / 35 | 4755 |
| 2 | 1 | 65.9 | 78.1 | 16 / 35 | 4378 |
| 3 | 2 | 62.5 | 69.8 | 13 / 35 | 3684 |
| 4 | 1 | 66.2 | 78.7 | 17 / 35 | 4273 |
| 5 | 1 | 64.5 | 75.2 | 13 / 35 | 4155 |
| 6 | 1 | 64.3 | 72.7 | 15 / 35 | 4375 |
| 7 | 1 | 66.8 | 78.1 | 17 / 35 | 4521 |
| 8 | 2 | 61.5 | 64.4 | 11 / 35 | 3927 |
| 9 | 1 | 64.1 | 72.7 | 13 / 35 | 4100 |
| 10 | 1 | 64.8 | 72.7 | 15 / 35 | 4239 |
| 11 | 1 | 66.3 | 76.8 | 18 / 35 | 4723 |
| 12 | 1 | 65.6 | 74.6 | 17 / 35 | 4449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 68 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 65 | 82% |
| kawigi.micro.Shiz 1.1 | 61 | 92% |
| yagami.Tidus 0.11 | 25 | 88% |
| ejb.Polaris 1.0.1 | 18 | 56% |
| stelo.MirrorNano 1.3 | 2 | 50% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 107 | 45% | 154 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 12% | 82 |
| ejb.Polaris 1.0.1 | 27 | 11% | 46 |
| kawigi.micro.Shiz 1.1 | 26 | 11% | 58 |
| yagami.Tidus 0.11 | 24 | 10% | 49 |
| stelo.MirrorNano 1.3 | 10 | 4% | 11 |
| step.nanoPri 1.0 | 9 | 4% | 12 |
| kurios.DOSexe .9a | 7 | 3% | 7 |

## Melee bench: F14

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.4 | 262 / 420 | 2.85 | 17.5% | 53317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 17.5% | 262 |
| bzdp.Pansy 2.1 | 2.6 | 12.4% | 42 |
| ratosh.Nobo 0.21 | 3.7 | 11.6% | 20 |
| wee.Gem 1.8.4 | 3.7 | 11.8% | 58 |
| wompi.Quokka 1.6 | 4.2 | 11.3% | 26 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.3 | 20 / 35 | 4462 |
| 2 | 1 | 65.8 | 76.5 | 22 / 35 | 4596 |
| 3 | 1 | 66.1 | 79.4 | 22 / 35 | 4251 |
| 4 | 1 | 64.4 | 72.7 | 17 / 35 | 4408 |
| 5 | 1 | 67.1 | 83.2 | 21 / 35 | 4471 |
| 6 | 1 | 66.3 | 78.4 | 24 / 35 | 4214 |
| 7 | 1 | 66.5 | 80.3 | 22 / 35 | 4441 |
| 8 | 1 | 66.2 | 78.7 | 21 / 35 | 4420 |
| 9 | 1 | 68.7 | 87.0 | 26 / 35 | 4699 |
| 10 | 1 | 68.0 | 85.7 | 24 / 35 | 4585 |
| 11 | 1 | 66.3 | 76.5 | 23 / 35 | 4551 |
| 12 | 1 | 64.8 | 74.0 | 20 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 92 | 90% |
| wee.Gem 1.8.4 | 83 | 92% |
| wompi.Quokka 1.6 | 55 | 82% |
| ratosh.Nobo 0.21 | 22 | 95% |
| m3thos.Eva00 1.1 | 19 | 95% |
| bayen.UbaMicro 1.4 | 13 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 159 of 420 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 29 | 18% | 66 |
| wee.Gem 1.8.4 | 25 | 16% | 101 |
| maribo.FollowFire 1 | 25 | 16% | 26 |
| bzdp.Pansy 2.1 | 17 | 11% | 86 |
| jeremyreeder.Vincent 2011.12.09 | 17 | 11% | 23 |
| bayen.UbaMicro 1.4 | 14 | 9% | 33 |
| ratosh.Nobo 0.21 | 12 | 8% | 41 |
| stelo.MyAgileRobot 0.2 | 11 | 7% | 17 |
| m3thos.Eva00 1.1 | 9 | 6% | 24 |

## Melee bench: F15

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.5 | 162 / 420 | 2.40 | 19.7% | 88306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.4 | 19.7% | 162 |
| wompi.Wallaby 5.1 | 1.6 | 19.3% | 217 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 26 |
| ayk.WallHugger 1.0 | 4.3 | 10.0% | 5 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 7 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 3 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 86.7 | 13 / 35 | 7163 |
| 2 | 1 | 71.8 | 88.6 | 20 / 35 | 7512 |
| 3 | 1 | 71.7 | 85.7 | 15 / 35 | 7641 |
| 4 | 2 | 69.3 | 80.6 | 10 / 35 | 7048 |
| 5 | 2 | 70.7 | 85.4 | 13 / 35 | 7308 |
| 6 | 1 | 71.2 | 86.3 | 18 / 35 | 7555 |
| 7 | 2 | 69.4 | 81.3 | 11 / 35 | 6709 |
| 8 | 2 | 69.8 | 81.0 | 10 / 35 | 7400 |
| 9 | 1 | 72.0 | 87.9 | 18 / 35 | 7695 |
| 10 | 1 | 70.0 | 81.3 | 11 / 35 | 7369 |
| 11 | 1 | 70.9 | 88.9 | 12 / 35 | 7205 |
| 12 | 2 | 69.9 | 80.3 | 11 / 35 | 7701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 231 | 38% |
| mz.NanoGod 2.02 | 34 | 74% |
| exauge.GateKeeper 1.1.121g | 21 | 90% |
| ayk.WallHugger 1.0 | 13 | 77% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stuff.Vlad 0.1 | 6 | 83% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 259 of 420 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 184 | 71% | 282 |
| mz.NanoGod 2.02 | 36 | 14% | 68 |
| exauge.GateKeeper 1.1.121g | 16 | 6% | 26 |
| ayk.WallHugger 1.0 | 13 | 5% | 24 |
| stuff.Vlad 0.1 | 5 | 2% | 8 |
| stelo.PianistNano 1.2 | 3 | 1% | 6 |
| drd.Dreadknoght 0.9 | 2 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.9 | 232 / 420 | 3.17 | 17.4% | 59469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 17.4% | 232 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 42 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.3% | 46 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.5% | 29 |
| stelo.MirrorMicro 1.0 | 5.9 | 9.3% | 16 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 6 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 14 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.8 | 20 / 35 | 4680 |
| 2 | 1 | 66.5 | 76.5 | 24 / 35 | 4771 |
| 3 | 1 | 66.6 | 74.6 | 18 / 35 | 5455 |
| 4 | 1 | 66.6 | 79.0 | 20 / 35 | 4981 |
| 5 | 1 | 65.4 | 72.4 | 17 / 35 | 5128 |
| 6 | 1 | 68.8 | 85.1 | 22 / 35 | 5184 |
| 7 | 1 | 67.6 | 80.3 | 23 / 35 | 5131 |
| 8 | 1 | 65.8 | 73.3 | 22 / 35 | 4857 |
| 9 | 1 | 65.9 | 76.8 | 17 / 35 | 4981 |
| 10 | 1 | 64.3 | 71.4 | 15 / 35 | 4924 |
| 11 | 1 | 66.3 | 77.1 | 19 / 35 | 4970 |
| 12 | 1 | 63.0 | 67.0 | 15 / 35 | 4407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 98 | 88% |
| dummy.micro.Sparrow 2.5 | 61 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 42 | 90% |
| bvh.micro.Freya 0.3 | 29 | 90% |
| stelo.MirrorMicro 1.0 | 14 | 64% |
| ap.Frederick 1.1 | 11 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 189 of 420 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 20% | 102 |
| dummy.micro.Sparrow 2.5 | 33 | 17% | 90 |
| conscience.Electron 1.3g | 26 | 14% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 25 | 13% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 10% | 68 |
| dl.BetterWalls 1.0 | 18 | 10% | 31 |
| bvh.micro.Freya 0.3 | 16 | 8% | 34 |
| stelo.MirrorMicro 1.0 | 15 | 8% | 32 |

## Melee bench: F17

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.0 | 317 / 420 | 2.08 | 21.2% | 82280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 21.2% | 317 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 13.7% | 39 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 17 |
| supersample.SuperBoxBot 1.0 | 3.6 | 11.0% | 19 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 8 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 6 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.6% | 5 |
| sample.Corners 1.0 | 9.4 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.1 | 28 / 35 | 6179 |
| 2 | 1 | 72.7 | 92.7 | 29 / 35 | 6683 |
| 3 | 1 | 72.4 | 91.7 | 29 / 35 | 6883 |
| 4 | 1 | 72.0 | 90.2 | 26 / 35 | 6966 |
| 5 | 1 | 74.0 | 98.4 | 31 / 35 | 7221 |
| 6 | 1 | 70.1 | 85.4 | 27 / 35 | 6384 |
| 7 | 1 | 68.4 | 75.9 | 20 / 35 | 6962 |
| 8 | 1 | 72.4 | 90.2 | 29 / 35 | 7498 |
| 9 | 1 | 69.8 | 80.3 | 22 / 35 | 7065 |
| 10 | 1 | 70.9 | 85.7 | 23 / 35 | 7134 |
| 11 | 1 | 71.7 | 90.2 | 27 / 35 | 6738 |
| 12 | 1 | 71.0 | 84.8 | 26 / 35 | 6567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 99 | 92% |
| sul.Lunar 1.1 | 98 | 100% |
| supersample.SuperBoxBot 1.0 | 48 | 94% |
| sample.MyFirstJuniorRobot 1.0 | 20 | 95% |
| mme.NikeEnhanced 2.0 | 19 | 95% |
| dsw.StaticD 1.0 | 19 | 84% |
| sample.MyFirstRobot 1.0 | 15 | 73% |
| tlp.ThreeLeggedPig 1 | 11 | 100% |
| sample.Corners 1.0 | 8 | 88% |

Hadur died in 110 of 420 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 33 | 30% | 122 |
| supersample.SuperBoxBot 1.0 | 27 | 25% | 66 |
| dsw.StaticD 1.0 | 15 | 14% | 43 |
| mme.NikeEnhanced 2.0 | 8 | 7% | 31 |
| tlp.ThreeLeggedPig 1 | 7 | 6% | 17 |
| sul.Lunar 1.1 | 6 | 5% | 90 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 21 |
| sample.Corners 1.0 | 3 | 3% | 12 |
4 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorV16 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.4 | 249 / 420 | 2.67 | 18.7% | 74681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorV16 0.1 | 1.0 | 18.7% | 249 |
| radnor.DoctorBob 1.42 | 2.1 | 13.1% | 54 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.4% | 30 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.4% | 18 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 15 |
| sample.Walls 1.0 | 7.2 | 8.0% | 10 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 10 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.6 | 17 / 35 | 5963 |
| 2 | 1 | 69.8 | 86.0 | 25 / 35 | 6640 |
| 3 | 1 | 69.1 | 86.0 | 20 / 35 | 6473 |
| 4 | 1 | 67.9 | 80.6 | 22 / 35 | 5900 |
| 5 | 1 | 69.9 | 87.9 | 24 / 35 | 6375 |
| 6 | 1 | 68.0 | 81.6 | 21 / 35 | 5952 |
| 7 | 1 | 69.2 | 83.8 | 22 / 35 | 6450 |
| 8 | 1 | 71.3 | 88.6 | 23 / 35 | 7499 |
| 9 | 1 | 67.0 | 77.5 | 19 / 35 | 6110 |
| 10 | 1 | 65.4 | 73.3 | 18 / 35 | 5647 |
| 11 | 1 | 66.8 | 77.8 | 16 / 35 | 6056 |
| 12 | 1 | 67.3 | 78.1 | 22 / 35 | 5616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 81 | 94% |
| radnor.DoctorBob 1.42 | 72 | 75% |
| mld.Wisdom 1.0 | 37 | 76% |
| KiraNL.Chupacabra 0.4 | 29 | 83% |
| sample.Walls 1.0 | 20 | 100% |
| amz.NanoClone 1.41 | 20 | 95% |
| jangs.ns51 1.0 | 19 | 79% |
| GarmBox.Oranges 1.0 | 10 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 173 of 420 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 48 | 28% | 86 |
| radnor.DoctorBob 1.42 | 38 | 22% | 105 |
| KiraNL.Chupacabra 0.4 | 27 | 16% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 14% | 98 |
| amz.NanoClone 1.41 | 14 | 8% | 28 |
| jangs.ns51 1.0 | 12 | 7% | 17 |
| sample.Walls 1.0 | 5 | 3% | 20 |
| GarmBox.Oranges 1.0 | 4 | 2% | 7 |

