# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.4 | 244 / 420 | 2.32 | 19.8% | 77015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 19.8% | 244 |
| radnor.DoctorBob 1.42 | 2.3 | 15.1% | 65 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 38 |
| mld.Infinity 2.2 | 3.7 | 13.2% | 55 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 11 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.1 | 6.3% | 6 |
| sample.Walls 1.0 | 7.1 | 6.6% | 0 |
| sample.Target 1.0 | 9.5 | 3.8% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 92.4 | 27 / 35 | 7098 |
| 2 | 1 | 68.3 | 80.0 | 19 / 35 | 5938 |
| 3 | 1 | 70.3 | 85.7 | 21 / 35 | 6147 |
| 4 | 1 | 71.4 | 87.9 | 21 / 35 | 6974 |
| 5 | 1 | 69.9 | 83.8 | 21 / 35 | 5902 |
| 6 | 1 | 69.4 | 81.9 | 18 / 35 | 5975 |
| 7 | 1 | 71.6 | 87.9 | 23 / 35 | 6756 |
| 8 | 1 | 67.4 | 79.7 | 16 / 35 | 5660 |
| 9 | 1 | 70.5 | 84.4 | 19 / 35 | 6547 |
| 10 | 1 | 71.8 | 88.6 | 22 / 35 | 6809 |
| 11 | 1 | 69.0 | 80.6 | 16 / 35 | 6329 |
| 12 | 1 | 72.1 | 91.4 | 21 / 35 | 6880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 101 | 92% |
| radnor.DoctorBob 1.42 | 81 | 67% |
| mld.Infinity 2.2 | 81 | 81% |
| amz.NanoClone 1.41 | 13 | 92% |
| jangs.ns51 1.0 | 9 | 78% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 177 of 420 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 82 | 46% | 170 |
| mz.AntiGrav 1.0 | 35 | 20% | 133 |
| mld.Infinity 2.2 | 28 | 16% | 31 |
| amz.NanoClone 1.41 | 16 | 9% | 34 |
| jangs.ns51 1.0 | 8 | 5% | 19 |
| sample.Walls 1.0 | 4 | 2% | 19 |
| arthord.MannyPacquiao Beta | 3 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |

## Melee bench: F02

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 276 / 420 | 2.16 | 18.7% | 58100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.1 | 18.7% | 276 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 96 |
| mld.DustBunny 3.8 | 3.5 | 11.8% | 14 |
| maribo.melee.BMV 0.1 | 4.2 | 10.1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 4.9 | 9.1% | 10 |
| zyx.nano.Ant 1.1 | 5.8 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 10 |
| bzdp.BoxCar 2.0 | 7.9 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 8.4 | 6.7% | 8 |
| cs.Grudge 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 59.0 | 14 / 35 | 4748 |
| 2 | 1 | 69.4 | 90.8 | 27 / 35 | 4972 |
| 3 | 1 | 68.9 | 91.4 | 25 / 35 | 5021 |
| 4 | 1 | 68.6 | 90.2 | 23 / 35 | 4854 |
| 5 | 1 | 69.8 | 94.6 | 24 / 35 | 5416 |
| 6 | 1 | 69.1 | 90.2 | 23 / 35 | 4920 |
| 7 | 1 | 67.3 | 83.8 | 21 / 35 | 4633 |
| 8 | 1 | 69.1 | 91.7 | 25 / 35 | 4950 |
| 9 | 1 | 69.6 | 92.1 | 28 / 35 | 4693 |
| 10 | 1 | 67.4 | 85.4 | 23 / 35 | 4512 |
| 11 | 1 | 66.4 | 84.8 | 19 / 35 | 4187 |
| 12 | 1 | 68.9 | 91.1 | 24 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 157 | 74% |
| mld.DustBunny 3.8 | 78 | 91% |
| djdjdj.NanoSkunk10 1.0 | 32 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 23 | 78% |
| fullsail.SweetTea 1.1 | 20 | 85% |
| maribo.melee.BMV 0.1 | 16 | 81% |
| zyx.nano.Ant 1.1 | 7 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 144 of 420 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 61 | 42% | 184 |
| mld.DustBunny 3.8 | 15 | 10% | 78 |
| maribo.melee.BMV 0.1 | 14 | 10% | 27 |
| zyx.nano.Ant 1.1 | 14 | 10% | 19 |
| djdjdj.NanoSkunk10 1.0 | 13 | 9% | 44 |
| cs.Grudge 1.0 | 9 | 6% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 5% | 29 |
| fullsail.SweetTea 1.1 | 6 | 4% | 22 |
| bzdp.BoxCar 2.0 | 5 | 3% | 8 |

## Melee bench: F03

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 84.2 | 274 / 420 | 2.42 | 19.7% | 68968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 19.7% | 274 |
| myl.micro.Troodon 1.10 | 2.1 | 13.7% | 52 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 30 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 11 |
| cb.nano.Insomnia 1.0 | 5.6 | 9.4% | 24 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.1 | 6.6% | 11 |
| sample.Tracker 1.0 | 9.3 | 5.3% | 2 |
| sample.Fire 1.0 | 9.6 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 22 / 35 | 5305 |
| 2 | 1 | 68.2 | 79.4 | 19 / 35 | 6057 |
| 3 | 1 | 71.1 | 88.9 | 27 / 35 | 5996 |
| 4 | 1 | 68.5 | 82.2 | 21 / 35 | 5508 |
| 5 | 1 | 70.3 | 84.8 | 25 / 35 | 6115 |
| 6 | 1 | 69.5 | 84.1 | 22 / 35 | 5618 |
| 7 | 1 | 67.7 | 75.9 | 22 / 35 | 5797 |
| 8 | 1 | 70.9 | 87.3 | 25 / 35 | 6320 |
| 9 | 1 | 70.0 | 86.0 | 24 / 35 | 5573 |
| 10 | 1 | 71.1 | 91.1 | 28 / 35 | 5842 |
| 11 | 1 | 70.9 | 88.6 | 23 / 35 | 5837 |
| 12 | 1 | 65.4 | 74.0 | 16 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 100 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 82 | 87% |
| cb.nano.Insomnia 1.0 | 42 | 83% |
| myl.nano.KomoriNinja 1.1 | 41 | 90% |
| sp.Nanos.Ember 1.1 | 17 | 76% |
| fm.mammillarias 1.3 | 15 | 93% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 4 | 100% |

Hadur died in 146 of 420 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 34 | 23% | 95 |
| cb.nano.Insomnia 1.0 | 27 | 18% | 24 |
| myl.micro.Troodon 1.10 | 24 | 16% | 120 |
| fm.mammillarias 1.3 | 21 | 14% | 31 |
| myl.nano.KomoriNinja 1.1 | 18 | 12% | 75 |
| sp.Nanos.Ember 1.1 | 9 | 6% | 32 |
| sample.Fire 1.0 | 7 | 5% | 17 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 18 |
| sample.Tracker 1.0 | 2 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 86.4 | 269 / 420 | 2.22 | 20.0% | 74695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 20.0% | 269 |
| tvv.micro.Antares 1.1.1 | 2.4 | 12.2% | 39 |
| kawigi.nano.Lib 1.0 | 2.6 | 12.0% | 36 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.1% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.6 | 9.2% | 33 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 21 |
| yk.JahMicro 1.0 | 7.2 | 8.0% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.7 | 17 / 35 | 5821 |
| 2 | 1 | 68.8 | 84.1 | 22 / 35 | 5941 |
| 3 | 1 | 71.0 | 88.6 | 25 / 35 | 6735 |
| 4 | 1 | 70.6 | 92.4 | 25 / 35 | 5999 |
| 5 | 1 | 73.2 | 96.8 | 31 / 35 | 6911 |
| 6 | 1 | 69.4 | 85.7 | 23 / 35 | 6196 |
| 7 | 1 | 70.7 | 88.9 | 25 / 35 | 6598 |
| 8 | 1 | 68.3 | 81.3 | 22 / 35 | 5978 |
| 9 | 1 | 70.6 | 89.5 | 23 / 35 | 6586 |
| 10 | 1 | 67.8 | 81.3 | 19 / 35 | 5625 |
| 11 | 1 | 70.4 | 89.2 | 21 / 35 | 6392 |
| 12 | 1 | 67.5 | 80.6 | 16 / 35 | 5913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 101 | 83% |
| stelo.SoJNanoMelee 1.1 | 85 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 37 | 68% |
| tvv.micro.Antares 1.1.1 | 35 | 66% |
| tj.zombie1n 1.0.1 | 29 | 79% |
| yk.JahMicro 1.0 | 15 | 93% |
| sample.VelociRobot 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |

Hadur died in 154 of 420 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 44 | 29% | 141 |
| tvv.micro.Antares 1.1.1 | 35 | 23% | 58 |
| stelo.SoJNanoMelee 1.1 | 24 | 16% | 66 |
| ers.nano.hawk.HawkLA 3.0m | 16 | 10% | 58 |
| tj.zombie1n 1.0.1 | 16 | 10% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 8% | 21 |
| yk.JahMicro 1.0 | 3 | 2% | 16 |
| repositorio.NanoStep 1.0 | 1 | 1% | 25 |
| sample.VelociRobot 1.0 | 1 | 1% | 11 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.1 | 180 / 420 | 3.87 | 15.5% | 56036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 15.5% | 180 |
| oog.melee.Corsair 1.0 | 2.1 | 12.7% | 70 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 52 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.6% | 46 |
| sam.Samspin 1.0 | 5.3 | 10.0% | 21 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 21 |
| zyx.nano.BacillusComma 1.0 | 6.6 | 9.4% | 19 |
| robar.nano.Assertive_Melee 0.2 | 7.4 | 8.9% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.9 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 65.1 | 14 / 35 | 4613 |
| 2 | 1 | 61.7 | 65.1 | 14 / 35 | 4438 |
| 3 | 1 | 59.7 | 62.5 | 11 / 35 | 4136 |
| 4 | 1 | 65.6 | 79.0 | 19 / 35 | 4624 |
| 5 | 1 | 65.4 | 75.6 | 21 / 35 | 4820 |
| 6 | 1 | 60.9 | 61.3 | 12 / 35 | 4565 |
| 7 | 1 | 62.1 | 64.4 | 14 / 35 | 4942 |
| 8 | 1 | 64.3 | 72.7 | 16 / 35 | 4990 |
| 9 | 1 | 62.4 | 67.6 | 15 / 35 | 4527 |
| 10 | 1 | 59.6 | 61.0 | 9 / 35 | 4483 |
| 11 | 1 | 64.3 | 70.5 | 17 / 35 | 4942 |
| 12 | 1 | 65.2 | 73.0 | 18 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 72 | 78% |
| oog.melee.Corsair 1.0 | 56 | 71% |
| ahf.NanoAndrew .4 | 37 | 81% |
| EBBU.Sim2 1.02 | 17 | 94% |
| sam.Samspin 1.0 | 15 | 87% |
| robar.nano.Assertive_Melee 0.2 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 242 of 420 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 47 | 19% | 84 |
| robar.nano.Assertive_Melee 0.2 | 39 | 16% | 51 |
| ahf.NanoAndrew .4 | 34 | 14% | 71 |
| bwbaugh.nano.Tirunculus 0.0.0a | 34 | 14% | 34 |
| oog.melee.Corsair 1.0 | 26 | 11% | 76 |
| zyx.nano.BacillusComma 1.0 | 23 | 10% | 33 |
| EBBU.Sim2 1.02 | 22 | 9% | 34 |
| sam.Samspin 1.0 | 12 | 5% | 24 |
| sample.TrackFire 1.0 | 5 | 2% | 9 |

## Melee bench: F06

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.4 | 264 / 420 | 2.40 | 18.4% | 58030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 18.4% | 264 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.1% | 43 |
| gh.nano.Grofvuil 0.2 | 2.9 | 12.1% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.2% | 45 |
| fm.claire 1.7 | 5.8 | 8.8% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.1% | 18 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.6% | 10 |
| sample.SpinBot 1.0 | 7.7 | 7.2% | 7 |
| pa.Improved 1.0 | 9.1 | 6.1% | 3 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 25 / 35 | 4530 |
| 2 | 1 | 67.4 | 82.5 | 23 / 35 | 4745 |
| 3 | 1 | 66.5 | 80.6 | 19 / 35 | 4689 |
| 4 | 1 | 67.3 | 82.5 | 23 / 35 | 4795 |
| 5 | 1 | 70.1 | 92.7 | 27 / 35 | 5133 |
| 6 | 1 | 65.1 | 76.5 | 14 / 35 | 4511 |
| 7 | 1 | 64.7 | 77.8 | 18 / 35 | 4330 |
| 8 | 1 | 68.5 | 88.9 | 22 / 35 | 4992 |
| 9 | 1 | 70.3 | 92.4 | 25 / 35 | 5397 |
| 10 | 1 | 66.7 | 80.6 | 21 / 35 | 4787 |
| 11 | 1 | 68.0 | 85.1 | 22 / 35 | 5136 |
| 12 | 1 | 68.6 | 85.4 | 25 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 111 | 96% |
| oog.melee.CapuletDroid 1.1 | 76 | 82% |
| gh.nano.Grofvuil 0.2 | 39 | 87% |
| arthord.NanoSatanMelee Beta | 30 | 87% |
| winamp32.micro.MicroMacro 1.0 | 14 | 57% |
| sample.SpinBot 1.0 | 13 | 100% |
| fm.claire 1.7 | 11 | 91% |
| pa.Improved 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 0% |

Hadur died in 159 of 420 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 30 | 19% | 39 |
| d414.nano.Quantum 1.0.0 | 29 | 18% | 129 |
| gh.nano.Grofvuil 0.2 | 29 | 18% | 84 |
| arthord.NanoSatanMelee Beta | 17 | 11% | 41 |
| winamp32.micro.MicroMacro 1.0 | 17 | 11% | 38 |
| fm.claire 1.7 | 11 | 7% | 20 |
| kurios.DOSexe .9b | 9 | 6% | 26 |
| sample.SpinBot 1.0 | 8 | 5% | 21 |
| pa.Improved 1.0 | 6 | 4% | 17 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.8 | 178 / 420 | 2.73 | 17.6% | 64289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 17.6% | 178 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.2% | 89 |
| mz.MicroGodMelee 1 | 3.0 | 13.8% | 89 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 13.1% | 42 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 12 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.5% | 2 |
| el.JumpShoot 0.2 | 7.9 | 6.5% | 6 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.2% | 3 |
| acogdev.alpha 0.2 | 8.2 | 6.1% | 0 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 14 / 35 | 5678 |
| 2 | 1 | 68.9 | 87.3 | 15 / 35 | 5814 |
| 3 | 1 | 66.4 | 78.4 | 13 / 35 | 5506 |
| 4 | 1 | 66.1 | 79.4 | 12 / 35 | 5301 |
| 5 | 1 | 67.3 | 81.0 | 11 / 35 | 5687 |
| 6 | 1 | 68.0 | 84.4 | 19 / 35 | 5451 |
| 7 | 1 | 69.4 | 87.3 | 22 / 35 | 5765 |
| 8 | 1 | 64.5 | 77.1 | 12 / 35 | 4539 |
| 9 | 1 | 66.1 | 78.1 | 17 / 35 | 4920 |
| 10 | 1 | 67.2 | 81.6 | 13 / 35 | 5152 |
| 11 | 1 | 66.6 | 77.1 | 14 / 35 | 5627 |
| 12 | 1 | 64.7 | 73.3 | 16 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 101 | 44% |
| spinnercat.micro.Tyger 0.1 | 92 | 86% |
| gh.micro.Gruweltje 0.7 | 58 | 29% |
| DBall.Anarchy 0.1 | 18 | 100% |
| mbro.Detektor3 0.1.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |

Hadur died in 244 of 420 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 94 | 39% | 135 |
| gh.micro.Gruweltje 0.7 | 68 | 28% | 100 |
| spinnercat.micro.Tyger 0.1 | 34 | 14% | 98 |
| acogdev.alpha 0.2 | 13 | 5% | 18 |
| fire219.CatBot 1.0 | 9 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 8 | 3% | 11 |
| el.JumpShoot 0.2 | 8 | 3% | 10 |
| DBall.Anarchy 0.1 | 5 | 2% | 22 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 17 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.8 | 194 / 420 | 3.54 | 16.2% | 59482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.3 | 16.2% | 194 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.8% | 83 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.7% | 75 |
| qualidafial.MajorDick 1.0.1 | 4.4 | 9.7% | 14 |
| germ.TheMind .2 | 5.1 | 9.4% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 7 |
| awesomeness.Elite 1.0 | 6.7 | 8.5% | 17 |
| stelo.UntouchableNano 1.3 | 7.4 | 8.1% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 71.1 | 16 / 35 | 4716 |
| 2 | 1 | 65.6 | 74.0 | 18 / 35 | 5387 |
| 3 | 2 | 63.8 | 72.1 | 13 / 35 | 4679 |
| 4 | 2 | 62.9 | 67.3 | 9 / 35 | 5110 |
| 5 | 1 | 61.8 | 64.4 | 15 / 35 | 4801 |
| 6 | 1 | 65.3 | 73.7 | 18 / 35 | 4962 |
| 7 | 1 | 62.9 | 67.9 | 15 / 35 | 4827 |
| 8 | 1 | 66.6 | 76.2 | 21 / 35 | 5287 |
| 9 | 1 | 65.2 | 75.2 | 16 / 35 | 4680 |
| 10 | 2 | 65.3 | 74.0 | 17 / 35 | 5005 |
| 11 | 1 | 63.9 | 69.8 | 18 / 35 | 4865 |
| 12 | 1 | 66.1 | 76.2 | 18 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 161 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 66% |
| stelo.UntouchableNano 1.3 | 12 | 100% |
| germ.TheMind .2 | 11 | 64% |
| awesomeness.Elite 1.0 | 10 | 80% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 228 of 420 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 46% | 210 |
| simonton.nano.WeekendObsession_Melee 1.0 | 56 | 25% | 81 |
| germ.TheMind .2 | 20 | 9% | 35 |
| stelo.UntouchableNano 1.3 | 13 | 6% | 29 |
| awesomeness.Elite 1.0 | 11 | 5% | 16 |
| qualidafial.MajorDick 1.0.1 | 9 | 4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 8 | 4% | 11 |
| mym.EdgeStalker 1.0 | 4 | 2% | 11 |
| sample.Crazy 1.0 | 3 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.9 | 298 / 420 | 2.00 | 19.7% | 57241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 19.7% | 298 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 35 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 11.9% | 28 |
| maribo.IotaCT 1.1 | 3.8 | 11.0% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.4% | 6 |
| timmit.nano.TimDog 0.33 | 6.1 | 9.3% | 22 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 8 |
| spinnercat.Omen 1.0 | 7.3 | 8.1% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 24 / 35 | 5174 |
| 2 | 1 | 70.7 | 89.2 | 26 / 35 | 5290 |
| 3 | 1 | 68.1 | 85.1 | 23 / 35 | 4271 |
| 4 | 1 | 68.8 | 86.3 | 25 / 35 | 4289 |
| 5 | 1 | 71.3 | 92.7 | 28 / 35 | 4796 |
| 6 | 1 | 69.9 | 88.9 | 21 / 35 | 4635 |
| 7 | 1 | 67.8 | 81.3 | 23 / 35 | 4509 |
| 8 | 1 | 70.2 | 86.7 | 25 / 35 | 4930 |
| 9 | 1 | 71.0 | 92.7 | 27 / 35 | 4926 |
| 10 | 1 | 69.9 | 90.2 | 23 / 35 | 5081 |
| 11 | 1 | 70.8 | 93.3 | 28 / 35 | 4618 |
| 12 | 1 | 70.1 | 91.4 | 25 / 35 | 4722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 139 | 89% |
| nz.jdc.nano.GridFu 1.0 | 80 | 84% |
| maribo.IotaCT 1.1 | 34 | 91% |
| timmit.nano.TimDog 0.33 | 21 | 62% |
| stelo.PatternRobot 1.0 | 21 | 100% |
| spinnercat.Omen 1.0 | 18 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 17 | 100% |
| ratosh.Wesco 1.4 | 9 | 78% |

Hadur died in 122 of 420 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 30 | 25% | 122 |
| timmit.nano.TimDog 0.33 | 24 | 20% | 50 |
| nz.jdc.nano.GridFu 1.0 | 21 | 17% | 95 |
| stelo.PatternRobot 1.0 | 14 | 11% | 32 |
| maribo.IotaCT 1.1 | 11 | 9% | 53 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 9% | 23 |
| ratosh.Wesco 1.4 | 9 | 7% | 31 |
| spinnercat.Omen 1.0 | 2 | 2% | 8 |

## Melee bench: F10

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.2 | 330 / 420 | 1.88 | 20.7% | 72068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 20.7% | 330 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 38 |
| baal.nano.N 1.42 | 2.8 | 11.9% | 11 |
| Grystrion.TrackerWO 1.0 | 4.4 | 9.6% | 5 |
| zyx.micro.Ant 1.1 | 6.0 | 8.8% | 9 |
| sanja.First 0.1 | 6.2 | 8.6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 4 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 5 |
| cvt.Firsty 1.0 | 8.6 | 6.9% | 12 |
| sample.RamFire 1.0 | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 27 / 35 | 6078 |
| 2 | 1 | 70.4 | 87.0 | 28 / 35 | 6141 |
| 3 | 1 | 71.5 | 94.9 | 30 / 35 | 5978 |
| 4 | 1 | 72.3 | 95.2 | 31 / 35 | 6543 |
| 5 | 1 | 69.5 | 88.6 | 25 / 35 | 5431 |
| 6 | 1 | 70.2 | 89.8 | 23 / 35 | 6001 |
| 7 | 1 | 72.6 | 95.6 | 31 / 35 | 6528 |
| 8 | 1 | 71.0 | 89.5 | 28 / 35 | 6361 |
| 9 | 1 | 70.2 | 90.5 | 28 / 35 | 5652 |
| 10 | 1 | 69.1 | 84.8 | 25 / 35 | 6046 |
| 11 | 1 | 68.2 | 84.8 | 26 / 35 | 5254 |
| 12 | 1 | 70.7 | 90.5 | 28 / 35 | 6055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 90 | 88% |
| baal.nano.N 1.42 | 66 | 94% |
| cvt.Firsty 1.0 | 43 | 88% |
| sanja.First 0.1 | 38 | 92% |
| zyx.micro.Ant 1.1 | 37 | 97% |
| amk.Punbot.Punbot 0.01 | 34 | 94% |
| Grystrion.TrackerWO 1.0 | 31 | 97% |
| squidM.TentalceMeleeNano 1.1 | 17 | 94% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 91 of 420 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 30 | 33% | 135 |
| Grystrion.TrackerWO 1.0 | 11 | 12% | 44 |
| zyx.micro.Ant 1.1 | 10 | 11% | 57 |
| sanja.First 0.1 | 10 | 11% | 46 |
| baal.nano.N 1.42 | 9 | 10% | 63 |
| cvt.Firsty 1.0 | 9 | 10% | 30 |
| sample.RamFire 1.0 | 8 | 9% | 10 |
| amk.Punbot.Punbot 0.01 | 3 | 3% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 18 |

## Melee bench: F11

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 65.4 | 97 / 420 | 4.11 | 14.0% | 52585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.0% | 199 |
| hadur117.micro.SaorR 0.1 | 2.3 | 14.0% | 97 |
| cs.Wren 1.0 | 3.0 | 12.8% | 42 |
| js.PinBall 1.6 | 4.3 | 11.4% | 22 |
| mz.Cork 0.1 | 4.3 | 11.2% | 28 |
| joe.ADinosaur 1.0 | 6.1 | 9.5% | 8 |
| evd.X1 0.01 | 7.1 | 7.9% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 11 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 9 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 73.0 | 10 / 35 | 4507 |
| 2 | 2 | 60.5 | 67.3 | 7 / 35 | 4272 |
| 3 | 2 | 62.5 | 66.7 | 9 / 35 | 4789 |
| 4 | 1 | 63.7 | 74.9 | 10 / 35 | 4677 |
| 5 | 3 | 55.8 | 54.3 | 5 / 35 | 3809 |
| 6 | 2 | 61.6 | 68.9 | 8 / 35 | 4544 |
| 7 | 2 | 62.4 | 71.1 | 8 / 35 | 4627 |
| 8 | 1 | 63.6 | 72.1 | 13 / 35 | 4716 |
| 9 | 2 | 59.0 | 61.0 | 5 / 35 | 4311 |
| 10 | 5 | 53.9 | 47.6 | 6 / 35 | 3846 |
| 11 | 3 | 59.2 | 62.2 | 7 / 35 | 4017 |
| 12 | 2 | 60.8 | 65.7 | 9 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 115 | 29% |
| cs.Wren 1.0 | 49 | 82% |
| mz.Cork 0.1 | 17 | 59% |
| js.PinBall 1.6 | 9 | 56% |
| joe.ADinosaur 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 325 of 420 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 137 | 42% | 173 |
| joe.ADinosaur 1.0 | 49 | 15% | 53 |
| cs.Wren 1.0 | 32 | 10% | 54 |
| js.PinBall 1.6 | 32 | 10% | 41 |
| evd.X1 0.01 | 29 | 9% | 29 |
| mz.Cork 0.1 | 25 | 8% | 40 |
| PSW.Relentless 0.1 | 10 | 3% | 10 |
| jsal.Jsalbot 1.0 | 6 | 2% | 10 |
| donjezza.Jezza 1.0 | 5 | 2% | 10 |

## Melee bench: F12

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.9 | 242 / 420 | 2.99 | 17.5% | 54697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 17.5% | 242 |
| myl.nano.Graviton 1.10 | 2.6 | 11.8% | 51 |
| ntc.Opposite 1.5 | 3.9 | 10.8% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.4% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.2% | 18 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 14 |
| DBall.NUKE 0.1 | 7.2 | 8.6% | 17 |
| donjezza.Muncho 1.0 | 9.1 | 6.4% | 19 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.8 | 21 / 35 | 4440 |
| 2 | 1 | 66.4 | 78.4 | 20 / 35 | 4617 |
| 3 | 1 | 64.2 | 72.7 | 18 / 35 | 4420 |
| 4 | 1 | 66.0 | 78.1 | 21 / 35 | 4457 |
| 5 | 1 | 64.5 | 74.9 | 17 / 35 | 4309 |
| 6 | 1 | 66.1 | 76.8 | 19 / 35 | 4695 |
| 7 | 1 | 65.9 | 77.8 | 20 / 35 | 4303 |
| 8 | 1 | 67.5 | 80.6 | 21 / 35 | 4812 |
| 9 | 1 | 63.7 | 71.1 | 17 / 35 | 4330 |
| 10 | 1 | 67.6 | 83.2 | 22 / 35 | 4900 |
| 11 | 1 | 66.8 | 80.6 | 23 / 35 | 4458 |
| 12 | 1 | 68.2 | 83.2 | 23 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 67 | 88% |
| stelo.AreaTargetingBot 1.1 | 61 | 87% |
| DBall.NUKE 0.1 | 29 | 97% |
| ntc.Opposite 1.5 | 28 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 27 | 100% |
| donjezza.Muncho 1.0 | 25 | 80% |
| disan.Chair 2.2.0 | 18 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 181 of 420 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 45 | 25% | 63 |
| myl.nano.Graviton 1.10 | 32 | 18% | 86 |
| stelo.AreaTargetingBot 1.1 | 29 | 16% | 64 |
| ntc.Opposite 1.5 | 25 | 14% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 10% | 47 |
| DBall.NUKE 0.1 | 10 | 6% | 38 |
| donjezza.Muncho 1.0 | 9 | 5% | 32 |
| disan.Chair 2.2.0 | 9 | 5% | 26 |
| pbg.R2D2 1.0 | 3 | 2% | 12 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 67.9 | 136 / 420 | 3.89 | 14.4% | 45651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 103 |
| hadur117.micro.SaorR 0.1 | 2.1 | 14.4% | 136 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 44 |
| yagami.Tidus 0.11 | 4.2 | 12.4% | 29 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 25 |
| stelo.MirrorNano 1.3 | 7.3 | 7.9% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 2 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 64.8 | 10 / 35 | 3930 |
| 2 | 4 | 58.6 | 58.7 | 7 / 35 | 3496 |
| 3 | 4 | 57.2 | 56.8 | 8 / 35 | 3148 |
| 4 | 1 | 63.2 | 73.0 | 13 / 35 | 3806 |
| 5 | 2 | 61.7 | 64.4 | 12 / 35 | 3835 |
| 6 | 2 | 62.6 | 67.0 | 9 / 35 | 3975 |
| 7 | 1 | 64.1 | 71.7 | 18 / 35 | 3718 |
| 8 | 2 | 61.7 | 67.3 | 12 / 35 | 3840 |
| 9 | 1 | 64.0 | 73.3 | 11 / 35 | 4110 |
| 10 | 3 | 60.9 | 64.8 | 11 / 35 | 3509 |
| 11 | 1 | 65.6 | 80.0 | 12 / 35 | 4058 |
| 12 | 2 | 64.5 | 73.3 | 13 / 35 | 4226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 80% |
| kawigi.micro.Shiz 1.1 | 39 | 92% |
| yagami.Tidus 0.11 | 28 | 86% |
| ejb.Polaris 1.0.1 | 14 | 43% |
| step.nanoPri 1.0 | 3 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 284 of 420 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 120 | 42% | 151 |
| ejb.Polaris 1.0.1 | 42 | 15% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 13% | 77 |
| yagami.Tidus 0.11 | 33 | 12% | 54 |
| kawigi.micro.Shiz 1.1 | 23 | 8% | 49 |
| stelo.MirrorNano 1.3 | 12 | 4% | 15 |
| kurios.DOSexe .9a | 11 | 4% | 11 |
| step.nanoPri 1.0 | 6 | 2% | 9 |

## Melee bench: F14

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.4 | 215 / 420 | 3.13 | 16.3% | 48424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 16.3% | 215 |
| bzdp.Pansy 2.1 | 2.9 | 12.5% | 47 |
| wee.Gem 1.8.4 | 3.0 | 12.1% | 65 |
| wompi.Quokka 1.6 | 3.7 | 11.5% | 36 |
| ratosh.Nobo 0.21 | 4.6 | 11.0% | 25 |
| m3thos.Eva00 1.1 | 6.3 | 9.8% | 20 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 7.9 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 70.8 | 16 / 35 | 4286 |
| 2 | 1 | 62.1 | 69.8 | 14 / 35 | 3763 |
| 3 | 1 | 66.8 | 86.0 | 21 / 35 | 4028 |
| 4 | 1 | 62.2 | 69.2 | 16 / 35 | 4002 |
| 5 | 1 | 66.1 | 79.4 | 19 / 35 | 4452 |
| 6 | 1 | 62.6 | 70.2 | 13 / 35 | 4165 |
| 7 | 1 | 63.2 | 73.3 | 16 / 35 | 3957 |
| 8 | 1 | 64.5 | 77.5 | 18 / 35 | 3710 |
| 9 | 1 | 65.3 | 78.7 | 20 / 35 | 4093 |
| 10 | 1 | 66.4 | 83.8 | 21 / 35 | 4091 |
| 11 | 1 | 64.8 | 76.2 | 18 / 35 | 4163 |
| 12 | 1 | 65.6 | 81.6 | 23 / 35 | 3714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 88 | 81% |
| wee.Gem 1.8.4 | 85 | 82% |
| wompi.Quokka 1.6 | 35 | 60% |
| ratosh.Nobo 0.21 | 26 | 88% |
| m3thos.Eva00 1.1 | 17 | 88% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 205 of 420 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 45 | 22% | 110 |
| wompi.Quokka 1.6 | 36 | 18% | 54 |
| wee.Gem 1.8.4 | 29 | 14% | 95 |
| maribo.FollowFire 1 | 23 | 11% | 27 |
| jeremyreeder.Vincent 2011.12.09 | 20 | 10% | 25 |
| ratosh.Nobo 0.21 | 17 | 8% | 39 |
| bayen.UbaMicro 1.4 | 16 | 8% | 27 |
| m3thos.Eva00 1.1 | 10 | 5% | 29 |
| stelo.MyAgileRobot 0.2 | 9 | 4% | 12 |

## Melee bench: F15

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 80.8 | 107 / 420 | 2.72 | 18.3% | 81283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 19.9% | 267 |
| hadur117.micro.SaorR 0.1 | 1.9 | 18.3% | 107 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 39 |
| ayk.WallHugger 1.0 | 4.4 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 4.9 | 9.3% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.1 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.4 | 81.6 | 10 / 35 | 7521 |
| 2 | 2 | 68.1 | 77.8 | 7 / 35 | 6540 |
| 3 | 1 | 70.6 | 85.4 | 13 / 35 | 7234 |
| 4 | 2 | 68.8 | 80.6 | 7 / 35 | 6832 |
| 5 | 2 | 67.8 | 79.4 | 4 / 35 | 6278 |
| 6 | 2 | 69.3 | 80.6 | 12 / 35 | 6941 |
| 7 | 2 | 69.8 | 84.4 | 9 / 35 | 6883 |
| 8 | 2 | 69.7 | 85.1 | 6 / 35 | 6622 |
| 9 | 2 | 69.1 | 81.0 | 9 / 35 | 6725 |
| 10 | 2 | 69.1 | 80.0 | 13 / 35 | 6548 |
| 11 | 2 | 68.0 | 77.5 | 11 / 35 | 6235 |
| 12 | 2 | 68.3 | 76.8 | 6 / 35 | 6924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 214 | 24% |
| mz.NanoGod 2.02 | 33 | 67% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |

Hadur died in 314 of 420 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 209 | 67% | 261 |
| mz.NanoGod 2.02 | 60 | 19% | 88 |
| exauge.GateKeeper 1.1.121g | 21 | 7% | 24 |
| ayk.WallHugger 1.0 | 15 | 5% | 23 |
| drd.Dreadknoght 0.9 | 4 | 1% | 10 |
| stuff.Vlad 0.1 | 4 | 1% | 8 |
| stelo.PianistNano 1.2 | 1 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.9 | 217 / 420 | 3.35 | 16.6% | 55064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.2 | 16.6% | 217 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.1% | 40 |
| dummy.micro.Sparrow 2.5 | 3.4 | 11.8% | 39 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 39 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 41 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 19 |
| conscience.Electron 1.3g | 7.1 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.1 | 7.0% | 17 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 73.0 | 13 / 35 | 4707 |
| 2 | 1 | 66.9 | 81.0 | 21 / 35 | 4980 |
| 3 | 1 | 66.1 | 79.0 | 24 / 35 | 4336 |
| 4 | 1 | 69.2 | 86.0 | 26 / 35 | 5159 |
| 5 | 1 | 64.5 | 74.6 | 16 / 35 | 4380 |
| 6 | 1 | 67.0 | 81.0 | 22 / 35 | 4730 |
| 7 | 1 | 65.4 | 76.2 | 21 / 35 | 4712 |
| 8 | 3 | 57.1 | 53.0 | 12 / 35 | 3718 |
| 9 | 1 | 64.5 | 73.0 | 17 / 35 | 4666 |
| 10 | 1 | 64.1 | 69.8 | 16 / 35 | 4905 |
| 11 | 1 | 61.9 | 65.7 | 12 / 35 | 4192 |
| 12 | 1 | 64.7 | 74.9 | 17 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 82 | 96% |
| dummy.micro.Sparrow 2.5 | 55 | 93% |
| bvh.micro.Freya 0.3 | 41 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 39 | 85% |
| ap.Frederick 1.1 | 14 | 86% |
| stelo.MirrorMicro 1.0 | 12 | 50% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 203 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 42 | 21% | 48 |
| bvh.micro.Freya 0.3 | 31 | 15% | 51 |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 13% | 77 |
| voidious.micro.BlitzBat 1.05 | 25 | 12% | 93 |
| mn.nano.perceptual.Impact 1.3.0 | 24 | 12% | 26 |
| dummy.micro.Sparrow 2.5 | 19 | 9% | 67 |
| dl.BetterWalls 1.0 | 18 | 9% | 26 |
| stelo.MirrorMicro 1.0 | 16 | 8% | 31 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 84.2 | 263 / 420 | 2.42 | 19.9% | 76654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 19.9% | 263 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 56 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 26 |
| supersample.SuperBoxBot 1.0 | 3.9 | 11.0% | 17 |
| mme.NikeEnhanced 2.0 | 4.9 | 9.3% | 11 |
| dsw.StaticD 1.0 | 5.9 | 8.7% | 21 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.1% | 6 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.2% | 20 |
| sample.Corners 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.5 | 26 / 35 | 6438 |
| 2 | 1 | 69.3 | 84.8 | 22 / 35 | 5972 |
| 3 | 1 | 71.1 | 88.3 | 26 / 35 | 6282 |
| 4 | 1 | 71.1 | 87.3 | 24 / 35 | 7070 |
| 5 | 1 | 71.0 | 88.3 | 25 / 35 | 6494 |
| 6 | 1 | 68.5 | 78.7 | 15 / 35 | 6410 |
| 7 | 1 | 68.6 | 80.6 | 16 / 35 | 6555 |
| 8 | 1 | 69.4 | 80.6 | 23 / 35 | 6396 |
| 9 | 1 | 69.8 | 81.0 | 22 / 35 | 6535 |
| 10 | 1 | 69.8 | 85.7 | 23 / 35 | 6137 |
| 11 | 1 | 68.0 | 79.4 | 16 / 35 | 6299 |
| 12 | 1 | 70.4 | 86.7 | 25 / 35 | 6066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 103 | 83% |
| sul.Lunar 1.1 | 68 | 100% |
| supersample.SuperBoxBot 1.0 | 50 | 92% |
| mme.NikeEnhanced 2.0 | 23 | 91% |
| dsw.StaticD 1.0 | 23 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 10 | 50% |
| tlp.ThreeLeggedPig 1 | 8 | 75% |
| sample.Corners 1.0 | 7 | 100% |

Hadur died in 163 of 420 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 28% | 132 |
| supersample.SuperBoxBot 1.0 | 35 | 21% | 64 |
| dsw.StaticD 1.0 | 31 | 19% | 49 |
| mme.NikeEnhanced 2.0 | 13 | 8% | 33 |
| sul.Lunar 1.1 | 9 | 6% | 80 |
| sample.MyFirstRobot 1.0 | 9 | 6% | 20 |
| sample.Corners 1.0 | 7 | 4% | 15 |
| tlp.ThreeLeggedPig 1 | 6 | 4% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 2% | 13 |
4 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorR 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 80.9 | 220 / 420 | 2.72 | 18.3% | 72169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorR 0.1 | 1.0 | 18.3% | 220 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 60 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.1% | 61 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 31 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 17 |
| KiraNL.Chupacabra 0.4 | 5.4 | 9.8% | 12 |
| sample.Walls 1.0 | 7.2 | 8.1% | 13 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.4% | 6 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.2 | 20 / 35 | 6099 |
| 2 | 1 | 65.6 | 74.9 | 17 / 35 | 5475 |
| 3 | 1 | 65.2 | 75.9 | 15 / 35 | 5484 |
| 4 | 1 | 67.5 | 80.3 | 21 / 35 | 5600 |
| 5 | 1 | 68.5 | 84.4 | 18 / 35 | 6150 |
| 6 | 1 | 69.1 | 82.5 | 19 / 35 | 6737 |
| 7 | 1 | 66.1 | 74.0 | 15 / 35 | 5906 |
| 8 | 1 | 68.0 | 83.5 | 18 / 35 | 6064 |
| 9 | 1 | 68.1 | 80.0 | 19 / 35 | 6189 |
| 10 | 1 | 69.9 | 87.3 | 24 / 35 | 6236 |
| 11 | 1 | 69.2 | 84.4 | 20 / 35 | 6486 |
| 12 | 1 | 66.7 | 81.3 | 14 / 35 | 5743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 82 | 90% |
| radnor.DoctorBob 1.42 | 68 | 66% |
| mld.Wisdom 1.0 | 35 | 77% |
| amz.NanoClone 1.41 | 31 | 87% |
| jangs.ns51 1.0 | 19 | 95% |
| KiraNL.Chupacabra 0.4 | 17 | 76% |
| sample.Walls 1.0 | 8 | 100% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 201 of 420 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 57 | 28% | 92 |
| radnor.DoctorBob 1.42 | 55 | 27% | 105 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 16% | 105 |
| KiraNL.Chupacabra 0.4 | 20 | 10% | 40 |
| amz.NanoClone 1.41 | 20 | 10% | 32 |
| jangs.ns51 1.0 | 7 | 3% | 22 |
| sample.Walls 1.0 | 6 | 3% | 13 |
| GarmBox.Oranges 1.0 | 4 | 2% | 9 |

