# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.2 | 288 / 420 | 2.24 | 20.8% | 82963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 20.8% | 288 |
| radnor.DoctorBob 1.42 | 2.7 | 13.9% | 47 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 33 |
| mld.Infinity 2.2 | 3.6 | 13.0% | 39 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 7 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 4 |
| jangs.ns51 1.0 | 7.6 | 6.2% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 86.3 | 25 / 35 | 7458 |
| 2 | 1 | 71.9 | 87.9 | 24 / 35 | 6842 |
| 3 | 1 | 73.1 | 88.9 | 27 / 35 | 7450 |
| 4 | 1 | 68.4 | 76.2 | 16 / 35 | 6523 |
| 5 | 1 | 70.2 | 83.5 | 23 / 35 | 6469 |
| 6 | 1 | 70.3 | 83.2 | 23 / 35 | 6326 |
| 7 | 1 | 69.4 | 81.3 | 21 / 35 | 6442 |
| 8 | 1 | 71.3 | 84.8 | 22 / 35 | 7138 |
| 9 | 1 | 72.4 | 89.5 | 24 / 35 | 7039 |
| 10 | 1 | 72.8 | 90.5 | 29 / 35 | 6916 |
| 11 | 1 | 73.2 | 93.0 | 27 / 35 | 7033 |
| 12 | 1 | 72.6 | 89.2 | 27 / 35 | 7327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 127 | 96% |
| mld.Infinity 2.2 | 90 | 90% |
| radnor.DoctorBob 1.42 | 52 | 88% |
| amz.NanoClone 1.41 | 12 | 92% |
| jangs.ns51 1.0 | 11 | 91% |
| sample.Target 1.0 | 6 | 100% |
| arthord.MannyPacquiao Beta | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 133 of 420 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 58 | 44% | 153 |
| mld.Infinity 2.2 | 20 | 15% | 38 |
| amz.NanoClone 1.41 | 16 | 12% | 42 |
| mz.AntiGrav 1.0 | 15 | 11% | 118 |
| sample.Walls 1.0 | 10 | 8% | 31 |
| jangs.ns51 1.0 | 7 | 5% | 21 |
| GarmBox.Oranges 1.0 | 5 | 4% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.7 | 298 / 420 | 2.10 | 19.2% | 62129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.1 | 19.2% | 298 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 72 |
| mld.DustBunny 3.8 | 3.3 | 12.3% | 18 |
| maribo.melee.BMV 0.1 | 3.8 | 10.4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.4 | 9.0% | 9 |
| zyx.nano.Ant 1.1 | 5.7 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.8% | 9 |
| fullsail.SweetTea 1.1 | 8.0 | 7.3% | 6 |
| bzdp.BoxCar 2.0 | 8.4 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 24 / 35 | 4912 |
| 2 | 1 | 68.4 | 86.7 | 22 / 35 | 4889 |
| 3 | 1 | 70.1 | 91.4 | 26 / 35 | 5341 |
| 4 | 1 | 68.5 | 88.6 | 25 / 35 | 5129 |
| 5 | 1 | 70.3 | 92.1 | 29 / 35 | 5413 |
| 6 | 1 | 68.1 | 85.4 | 25 / 35 | 4937 |
| 7 | 1 | 69.3 | 89.5 | 25 / 35 | 5205 |
| 8 | 1 | 70.5 | 93.7 | 28 / 35 | 5691 |
| 9 | 1 | 68.4 | 89.2 | 24 / 35 | 5054 |
| 10 | 2 | 62.7 | 60.3 | 11 / 35 | 5162 |
| 11 | 1 | 71.6 | 97.8 | 30 / 35 | 5465 |
| 12 | 1 | 69.8 | 90.5 | 29 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 147 | 80% |
| mld.DustBunny 3.8 | 86 | 97% |
| djdjdj.NanoSkunk10 1.0 | 35 | 91% |
| maribo.melee.BMV 0.1 | 26 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 80% |
| fullsail.SweetTea 1.1 | 13 | 77% |
| zyx.nano.Ant 1.1 | 10 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 125 of 420 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 34% | 167 |
| mld.DustBunny 3.8 | 17 | 14% | 71 |
| zyx.nano.Ant 1.1 | 14 | 11% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 10% | 35 |
| cs.Grudge 1.0 | 10 | 8% | 10 |
| fullsail.SweetTea 1.1 | 9 | 7% | 21 |
| maribo.melee.BMV 0.1 | 8 | 6% | 29 |
| djdjdj.NanoSkunk10 1.0 | 7 | 6% | 44 |
| bzdp.BoxCar 2.0 | 5 | 4% | 13 |

## Melee bench: F03

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.7 | 295 / 420 | 2.28 | 20.3% | 71925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 20.3% | 295 |
| myl.micro.Troodon 1.10 | 2.0 | 13.7% | 59 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.4% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.6% | 20 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.5% | 17 |
| fm.mammillarias 1.3 | 5.6 | 9.4% | 9 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 5 |
| sample.Fire 1.0 | 9.3 | 5.0% | 3 |
| sample.Tracker 1.0 | 9.6 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.9 | 27 / 35 | 6426 |
| 2 | 1 | 68.5 | 78.7 | 21 / 35 | 5924 |
| 3 | 1 | 70.0 | 83.5 | 24 / 35 | 5866 |
| 4 | 1 | 71.0 | 90.2 | 26 / 35 | 6015 |
| 5 | 1 | 72.0 | 93.0 | 29 / 35 | 6166 |
| 6 | 1 | 68.9 | 82.5 | 22 / 35 | 5679 |
| 7 | 1 | 70.1 | 85.1 | 25 / 35 | 6106 |
| 8 | 1 | 68.8 | 80.6 | 21 / 35 | 5765 |
| 9 | 1 | 71.3 | 89.8 | 25 / 35 | 6126 |
| 10 | 1 | 70.4 | 87.3 | 22 / 35 | 6185 |
| 11 | 1 | 71.6 | 88.9 | 30 / 35 | 5904 |
| 12 | 1 | 68.9 | 80.3 | 23 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 102 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 76 | 96% |
| cb.nano.Insomnia 1.0 | 38 | 82% |
| sp.Nanos.Ember 1.1 | 37 | 97% |
| myl.nano.KomoriNinja 1.1 | 36 | 97% |
| fm.mammillarias 1.3 | 12 | 92% |
| sample.Fire 1.0 | 10 | 90% |
| cs.sheldor.Talon 1.1 | 5 | 100% |

Hadur died in 128 of 420 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 29 | 23% | 77 |
| myl.micro.Troodon 1.10 | 25 | 20% | 134 |
| myl.nano.KomoriNinja 1.1 | 21 | 16% | 77 |
| cb.nano.Insomnia 1.0 | 18 | 14% | 21 |
| fm.mammillarias 1.3 | 16 | 13% | 29 |
| sample.Tracker 1.0 | 5 | 4% | 6 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 39 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 23 |
| sample.Fire 1.0 | 4 | 3% | 9 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 85.3 | 292 / 420 | 2.32 | 20.1% | 74750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 20.1% | 292 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.1% | 26 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.3% | 26 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 31 |
| tj.zombie1n 1.0.1 | 5.0 | 9.4% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.9 | 8.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.9 | 8.0% | 9 |
| yk.JahMicro 1.0 | 7.6 | 7.8% | 10 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 9.9 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 84.4 | 25 / 35 | 5886 |
| 2 | 1 | 70.5 | 87.9 | 23 / 35 | 6385 |
| 3 | 1 | 70.9 | 88.6 | 26 / 35 | 6645 |
| 4 | 1 | 68.8 | 83.8 | 22 / 35 | 5834 |
| 5 | 1 | 68.8 | 83.8 | 25 / 35 | 5530 |
| 6 | 1 | 69.5 | 82.9 | 26 / 35 | 6231 |
| 7 | 1 | 70.1 | 86.0 | 24 / 35 | 6495 |
| 8 | 1 | 70.6 | 86.7 | 26 / 35 | 6648 |
| 9 | 1 | 68.7 | 80.6 | 23 / 35 | 6253 |
| 10 | 1 | 69.6 | 85.1 | 24 / 35 | 6201 |
| 11 | 1 | 70.7 | 90.8 | 25 / 35 | 6226 |
| 12 | 1 | 69.4 | 83.2 | 23 / 35 | 6416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 116 | 91% |
| stelo.SoJNanoMelee 1.1 | 85 | 94% |
| tvv.micro.Antares 1.1.1 | 35 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 30 | 80% |
| tj.zombie1n 1.0.1 | 23 | 70% |
| repositorio.NanoStep 1.0 | 12 | 100% |
| sample.VelociRobot 1.0 | 11 | 91% |
| yk.JahMicro 1.0 | 11 | 82% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 128 of 420 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 44 | 34% | 161 |
| stelo.SoJNanoMelee 1.1 | 20 | 16% | 62 |
| Grystrion.RandomTrackerNOREV 1.0 | 13 | 10% | 22 |
| tj.zombie1n 1.0.1 | 11 | 9% | 19 |
| yk.JahMicro 1.0 | 11 | 9% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 8% | 50 |
| tvv.micro.Antares 1.1.1 | 10 | 8% | 44 |
| sample.VelociRobot 1.0 | 6 | 5% | 18 |
| repositorio.NanoStep 1.0 | 3 | 2% | 21 |

## Melee bench: F05

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.4 | 197 / 420 | 3.57 | 16.0% | 56256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 16.0% | 197 |
| oog.melee.Corsair 1.0 | 2.6 | 12.6% | 72 |
| ahf.NanoAndrew .4 | 3.4 | 11.4% | 46 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.6% | 44 |
| sam.Samspin 1.0 | 5.9 | 9.6% | 20 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.4 | 9.2% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.0% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 73.7 | 15 / 35 | 4728 |
| 2 | 1 | 64.0 | 73.3 | 18 / 35 | 4585 |
| 3 | 1 | 64.6 | 74.9 | 19 / 35 | 4572 |
| 4 | 1 | 64.1 | 69.8 | 18 / 35 | 4847 |
| 5 | 1 | 60.9 | 62.9 | 13 / 35 | 4370 |
| 6 | 1 | 63.6 | 72.1 | 17 / 35 | 4486 |
| 7 | 1 | 64.0 | 74.9 | 12 / 35 | 4746 |
| 8 | 1 | 63.7 | 69.2 | 15 / 35 | 4611 |
| 9 | 1 | 62.8 | 69.8 | 15 / 35 | 4364 |
| 10 | 1 | 65.3 | 72.4 | 21 / 35 | 5111 |
| 11 | 1 | 64.3 | 71.4 | 18 / 35 | 4726 |
| 12 | 1 | 64.8 | 72.4 | 16 / 35 | 5110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 83 | 90% |
| oog.melee.Corsair 1.0 | 61 | 61% |
| ahf.NanoAndrew .4 | 36 | 86% |
| sam.Samspin 1.0 | 19 | 95% |
| EBBU.Sim2 1.02 | 17 | 94% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 224 of 420 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 17% | 107 |
| oog.melee.Corsair 1.0 | 37 | 17% | 76 |
| ahf.NanoAndrew .4 | 30 | 13% | 72 |
| robar.nano.Assertive_Melee 0.2 | 30 | 13% | 43 |
| zyx.nano.BacillusComma 1.0 | 24 | 11% | 34 |
| EBBU.Sim2 1.02 | 20 | 9% | 32 |
| bwbaugh.nano.Tirunculus 0.0.0a | 19 | 8% | 19 |
| sam.Samspin 1.0 | 16 | 7% | 26 |
| sample.TrackFire 1.0 | 9 | 4% | 11 |

## Melee bench: F06

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.5 | 288 / 420 | 2.22 | 19.1% | 61418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 19.1% | 288 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.4% | 48 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.9% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 9.8% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.4 | 8.9% | 15 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 4 |
| fm.claire 1.7 | 6.0 | 8.7% | 1 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 6 |
| pa.Improved 1.0 | 9.1 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.6 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 25 / 35 | 4935 |
| 2 | 1 | 69.7 | 89.2 | 25 / 35 | 5577 |
| 3 | 1 | 70.7 | 90.8 | 30 / 35 | 5656 |
| 4 | 1 | 69.4 | 89.5 | 25 / 35 | 4893 |
| 5 | 1 | 65.8 | 76.8 | 19 / 35 | 4897 |
| 6 | 1 | 69.2 | 89.2 | 27 / 35 | 4932 |
| 7 | 1 | 67.2 | 82.5 | 20 / 35 | 5082 |
| 8 | 1 | 66.9 | 81.9 | 20 / 35 | 4726 |
| 9 | 1 | 68.3 | 84.1 | 23 / 35 | 5188 |
| 10 | 1 | 69.2 | 87.9 | 24 / 35 | 5308 |
| 11 | 1 | 68.8 | 87.3 | 25 / 35 | 5267 |
| 12 | 1 | 69.2 | 88.6 | 25 / 35 | 4957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 137 | 93% |
| oog.melee.CapuletDroid 1.1 | 69 | 83% |
| gh.nano.Grofvuil 0.2 | 34 | 88% |
| arthord.NanoSatanMelee Beta | 28 | 89% |
| winamp32.micro.MicroMacro 1.0 | 19 | 58% |
| sample.SpinBot 1.0 | 19 | 100% |
| fm.claire 1.7 | 14 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 138 of 420 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 20% | 145 |
| gh.nano.Grofvuil 0.2 | 27 | 20% | 84 |
| oog.melee.CapuletDroid 1.1 | 23 | 17% | 32 |
| arthord.NanoSatanMelee Beta | 16 | 12% | 43 |
| winamp32.micro.MicroMacro 1.0 | 13 | 9% | 35 |
| sample.SpinBot 1.0 | 13 | 9% | 23 |
| fm.claire 1.7 | 7 | 5% | 18 |
| pa.Improved 1.0 | 5 | 4% | 14 |
| kurios.DOSexe .9b | 4 | 3% | 22 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.8 | 186 / 420 | 2.55 | 18.1% | 66359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 18.1% | 186 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 95 |
| mz.MicroGodMelee 1 | 3.3 | 13.4% | 70 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.1% | 42 |
| DBall.Anarchy 0.1 | 5.4 | 8.5% | 13 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 7 |
| el.JumpShoot 0.2 | 8.1 | 6.3% | 5 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 17 / 35 | 5499 |
| 2 | 1 | 67.8 | 81.6 | 17 / 35 | 5700 |
| 3 | 1 | 66.7 | 77.8 | 17 / 35 | 5523 |
| 4 | 1 | 69.0 | 87.9 | 15 / 35 | 5947 |
| 5 | 1 | 67.0 | 81.3 | 17 / 35 | 5216 |
| 6 | 1 | 66.7 | 78.7 | 16 / 35 | 5327 |
| 7 | 1 | 68.1 | 84.4 | 17 / 35 | 5458 |
| 8 | 1 | 68.1 | 87.0 | 12 / 35 | 5842 |
| 9 | 1 | 67.0 | 78.4 | 16 / 35 | 5353 |
| 10 | 1 | 65.7 | 80.0 | 11 / 35 | 4939 |
| 11 | 1 | 68.4 | 85.4 | 16 / 35 | 5820 |
| 12 | 1 | 68.4 | 85.1 | 15 / 35 | 5735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 92 | 85% |
| gh.micro.Gruweltje 0.7 | 83 | 31% |
| mz.MicroGodMelee 1 | 82 | 46% |
| DBall.Anarchy 0.1 | 20 | 100% |
| el.JumpShoot 0.2 | 10 | 60% |
| caimano.Furia_Ceca 0.22 | 9 | 89% |
| mbro.Detektor3 0.1.1 | 8 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 235 of 420 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 89 | 38% | 136 |
| mz.MicroGodMelee 1 | 68 | 29% | 118 |
| spinnercat.micro.Tyger 0.1 | 36 | 15% | 93 |
| caimano.Furia_Ceca 0.22 | 13 | 6% | 16 |
| el.JumpShoot 0.2 | 9 | 4% | 11 |
| acogdev.alpha 0.2 | 6 | 3% | 8 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| DBall.Anarchy 0.1 | 4 | 2% | 19 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 14 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.8 | 208 / 420 | 3.81 | 15.9% | 58496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.4 | 15.9% | 208 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 15.1% | 88 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.9% | 67 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 8 |
| germ.TheMind .2 | 5.0 | 9.5% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.6 | 8.5% | 7 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 15 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 52.1 | 11 / 35 | 4718 |
| 2 | 2 | 62.4 | 62.2 | 16 / 35 | 4990 |
| 3 | 2 | 65.6 | 74.6 | 16 / 35 | 4965 |
| 4 | 1 | 64.4 | 70.8 | 18 / 35 | 4842 |
| 5 | 1 | 66.5 | 76.5 | 21 / 35 | 5152 |
| 6 | 1 | 63.4 | 69.5 | 18 / 35 | 4553 |
| 7 | 1 | 64.9 | 72.1 | 17 / 35 | 4909 |
| 8 | 1 | 68.4 | 82.9 | 25 / 35 | 5101 |
| 9 | 1 | 63.3 | 68.6 | 16 / 35 | 4798 |
| 10 | 1 | 64.4 | 71.4 | 19 / 35 | 4782 |
| 11 | 2 | 61.0 | 60.6 | 15 / 35 | 4480 |
| 12 | 1 | 62.9 | 63.8 | 16 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 140 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 44 | 86% |
| germ.TheMind .2 | 18 | 100% |
| qualidafial.MajorDick 1.0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 10 | 100% |
| awesomeness.Elite 1.0 | 8 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 33% |

Hadur died in 212 of 420 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 44% | 199 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 14% | 73 |
| germ.TheMind .2 | 24 | 11% | 42 |
| stelo.UntouchableNano 1.3 | 22 | 10% | 34 |
| lrem.micro.MoggFanatic 0.2 | 11 | 5% | 15 |
| qualidafial.MajorDick 1.0.1 | 10 | 5% | 17 |
| awesomeness.Elite 1.0 | 8 | 4% | 18 |
| mym.EdgeStalker 1.0 | 7 | 3% | 9 |
| sample.Crazy 1.0 | 6 | 3% | 12 |

## Melee bench: F09

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.1 | 311 / 420 | 2.07 | 19.8% | 58373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 19.8% | 311 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 29 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 22 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 21 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 10 |
| ratosh.Wesco 1.4 | 7.9 | 7.9% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 7.9% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.6 | 27 / 35 | 5313 |
| 2 | 1 | 70.5 | 90.8 | 27 / 35 | 4716 |
| 3 | 1 | 71.2 | 91.1 | 28 / 35 | 5281 |
| 4 | 1 | 70.6 | 89.2 | 28 / 35 | 4869 |
| 5 | 1 | 72.6 | 96.2 | 29 / 35 | 5344 |
| 6 | 1 | 70.8 | 89.8 | 26 / 35 | 5179 |
| 7 | 1 | 69.9 | 89.2 | 27 / 35 | 4406 |
| 8 | 1 | 69.3 | 85.7 | 26 / 35 | 4528 |
| 9 | 1 | 69.8 | 86.3 | 24 / 35 | 4777 |
| 10 | 1 | 68.5 | 84.1 | 23 / 35 | 4630 |
| 11 | 1 | 68.2 | 81.6 | 22 / 35 | 4652 |
| 12 | 1 | 69.0 | 84.8 | 24 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 121 | 94% |
| nz.jdc.nano.GridFu 1.0 | 86 | 94% |
| timmit.nano.TimDog 0.33 | 32 | 88% |
| maribo.IotaCT 1.1 | 29 | 83% |
| stelo.PatternRobot 1.0 | 26 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 100% |
| ratosh.Wesco 1.4 | 14 | 100% |
| spinnercat.Omen 1.0 | 11 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 29 | 27% | 119 |
| timmit.nano.TimDog 0.33 | 18 | 17% | 52 |
| rz.HawkOnFire 0.1 | 17 | 16% | 107 |
| maribo.IotaCT 1.1 | 14 | 13% | 44 |
| stelo.PatternRobot 1.0 | 13 | 12% | 35 |
| ratosh.Wesco 1.4 | 10 | 9% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 4% | 18 |
| spinnercat.Omen 1.0 | 3 | 3% | 15 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.8 | 349 / 420 | 1.65 | 21.6% | 77662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 21.6% | 349 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 24 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 3 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 8 |
| zyx.micro.Ant 1.1 | 5.0 | 9.3% | 13 |
| sanja.First 0.1 | 6.8 | 8.1% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.9 | 8.1% | 3 |
| cvt.Firsty 1.0 | 7.8 | 7.3% | 10 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 28 / 35 | 6642 |
| 2 | 1 | 70.1 | 87.9 | 24 / 35 | 6361 |
| 3 | 1 | 72.4 | 97.1 | 33 / 35 | 6350 |
| 4 | 1 | 72.1 | 94.9 | 30 / 35 | 6702 |
| 5 | 1 | 70.2 | 89.2 | 27 / 35 | 6118 |
| 6 | 1 | 72.0 | 94.3 | 31 / 35 | 6287 |
| 7 | 1 | 72.2 | 93.7 | 31 / 35 | 6605 |
| 8 | 1 | 69.7 | 87.0 | 27 / 35 | 6088 |
| 9 | 1 | 73.0 | 96.8 | 31 / 35 | 6748 |
| 10 | 1 | 72.3 | 94.0 | 29 / 35 | 6736 |
| 11 | 1 | 71.6 | 92.4 | 27 / 35 | 6667 |
| 12 | 1 | 71.6 | 93.0 | 31 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 86 | 93% |
| baal.nano.N 1.42 | 70 | 99% |
| cvt.Firsty 1.0 | 57 | 91% |
| zyx.micro.Ant 1.1 | 41 | 93% |
| sanja.First 0.1 | 40 | 95% |
| amk.Punbot.Punbot 0.01 | 36 | 97% |
| Grystrion.TrackerWO 1.0 | 28 | 96% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 73 of 420 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 21 | 29% | 76 |
| tvv.nano.Polaris 1.2 | 12 | 16% | 109 |
| cvt.Firsty 1.0 | 9 | 12% | 52 |
| Grystrion.TrackerWO 1.0 | 8 | 11% | 43 |
| baal.nano.N 1.42 | 6 | 8% | 54 |
| amk.Punbot.Punbot 0.01 | 5 | 7% | 13 |
| sample.RamFire 1.0 | 5 | 7% | 7 |
| sanja.First 0.1 | 4 | 5% | 40 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 21 |

## Melee bench: F11

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.7 | 138 / 420 | 3.81 | 15.1% | 59237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.7 | 15.1% | 138 |
| kc.micro.Figment 1.0 | 1.9 | 15.0% | 152 |
| cs.Wren 1.0 | 2.9 | 12.9% | 42 |
| mz.Cork 0.1 | 4.3 | 11.3% | 30 |
| js.PinBall 1.6 | 4.3 | 11.4% | 31 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 6 |
| evd.X1 0.01 | 7.1 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 7 |
| donjezza.Jezza 1.0 | 8.9 | 5.7% | 11 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 47.9 | 4 / 35 | 4170 |
| 2 | 1 | 63.2 | 67.9 | 14 / 35 | 5332 |
| 3 | 1 | 65.8 | 78.1 | 14 / 35 | 5400 |
| 4 | 1 | 66.6 | 78.7 | 16 / 35 | 5484 |
| 5 | 1 | 63.6 | 74.0 | 11 / 35 | 4804 |
| 6 | 1 | 59.8 | 61.6 | 7 / 35 | 4706 |
| 7 | 2 | 61.7 | 63.2 | 13 / 35 | 4888 |
| 8 | 1 | 65.7 | 77.8 | 13 / 35 | 5309 |
| 9 | 2 | 61.5 | 64.1 | 9 / 35 | 4692 |
| 10 | 2 | 63.0 | 67.6 | 14 / 35 | 4832 |
| 11 | 1 | 66.0 | 80.0 | 16 / 35 | 5036 |
| 12 | 2 | 60.2 | 63.8 | 7 / 35 | 4584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 128 | 48% |
| cs.Wren 1.0 | 40 | 90% |
| mz.Cork 0.1 | 21 | 71% |
| js.PinBall 1.6 | 16 | 56% |
| joe.ADinosaur 1.0 | 8 | 75% |
| donjezza.Jezza 1.0 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 284 of 420 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 123 | 43% | 189 |
| js.PinBall 1.6 | 32 | 11% | 50 |
| cs.Wren 1.0 | 31 | 11% | 47 |
| mz.Cork 0.1 | 28 | 10% | 42 |
| joe.ADinosaur 1.0 | 27 | 10% | 33 |
| PSW.Relentless 0.1 | 16 | 6% | 16 |
| evd.X1 0.01 | 15 | 5% | 20 |
| donjezza.Jezza 1.0 | 7 | 2% | 10 |
| jsal.Jsalbot 1.0 | 5 | 2% | 11 |

## Melee bench: F12

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.7 | 286 / 420 | 2.47 | 18.8% | 56081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 18.8% | 286 |
| ntc.Opposite 1.5 | 3.3 | 11.0% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.9% | 8 |
| myl.nano.Graviton 1.10 | 3.9 | 10.8% | 30 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 10.4% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.3% | 15 |
| DBall.NUKE 0.1 | 7.0 | 8.6% | 12 |
| disan.Chair 2.2.0 | 7.8 | 7.9% | 10 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 11 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 27 / 35 | 4826 |
| 2 | 1 | 66.5 | 79.0 | 19 / 35 | 4654 |
| 3 | 1 | 68.5 | 84.1 | 25 / 35 | 4797 |
| 4 | 1 | 68.3 | 85.7 | 26 / 35 | 4507 |
| 5 | 1 | 68.6 | 86.7 | 26 / 35 | 4570 |
| 6 | 1 | 66.1 | 76.5 | 18 / 35 | 4669 |
| 7 | 1 | 71.3 | 94.3 | 28 / 35 | 5201 |
| 8 | 1 | 68.4 | 85.1 | 24 / 35 | 4656 |
| 9 | 1 | 66.7 | 79.7 | 22 / 35 | 4824 |
| 10 | 1 | 68.2 | 85.7 | 26 / 35 | 4452 |
| 11 | 1 | 67.4 | 82.5 | 22 / 35 | 4429 |
| 12 | 1 | 65.8 | 74.9 | 23 / 35 | 4496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 73 | 88% |
| myl.nano.Graviton 1.10 | 57 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 49 | 98% |
| ntc.Opposite 1.5 | 30 | 93% |
| DBall.NUKE 0.1 | 27 | 85% |
| disan.Chair 2.2.0 | 26 | 88% |
| pfvicm.Sobieski 7.2.3b | 24 | 100% |
| donjezza.Muncho 1.0 | 22 | 91% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 137 of 420 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 32 | 23% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 16% | 61 |
| stelo.AreaTargetingBot 1.1 | 21 | 15% | 68 |
| myl.nano.Graviton 1.10 | 19 | 14% | 74 |
| ntc.Opposite 1.5 | 13 | 9% | 45 |
| disan.Chair 2.2.0 | 11 | 8% | 35 |
| DBall.NUKE 0.1 | 8 | 6% | 37 |
| pbg.R2D2 1.0 | 8 | 6% | 23 |
| donjezza.Muncho 1.0 | 3 | 2% | 18 |

## Melee bench: F13

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.4 | 183 / 420 | 3.57 | 15.5% | 49625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.3 | 15.5% | 183 |
| oog.melee.Capulet 1.2 | 2.3 | 14.0% | 80 |
| kawigi.micro.Shiz 1.1 | 3.1 | 13.5% | 78 |
| yagami.Tidus 0.11 | 4.3 | 12.1% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.4 | 12.5% | 40 |
| ejb.Polaris 1.0.1 | 5.6 | 10.7% | 22 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 18 / 35 | 4347 |
| 2 | 2 | 62.0 | 67.0 | 13 / 35 | 3605 |
| 3 | 1 | 63.3 | 69.2 | 14 / 35 | 4091 |
| 4 | 2 | 62.9 | 67.3 | 15 / 35 | 4238 |
| 5 | 1 | 65.9 | 79.0 | 18 / 35 | 4241 |
| 6 | 1 | 62.6 | 65.1 | 16 / 35 | 3944 |
| 7 | 1 | 66.3 | 76.2 | 18 / 35 | 4767 |
| 8 | 1 | 62.1 | 67.3 | 12 / 35 | 3897 |
| 9 | 3 | 60.3 | 61.6 | 10 / 35 | 3899 |
| 10 | 1 | 62.9 | 66.7 | 15 / 35 | 3995 |
| 11 | 1 | 65.2 | 74.6 | 14 / 35 | 4366 |
| 12 | 1 | 66.6 | 80.6 | 20 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 75 | 63% |
| kawigi.micro.Shiz 1.1 | 55 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 96% |
| yagami.Tidus 0.11 | 32 | 88% |
| ejb.Polaris 1.0.1 | 17 | 59% |
| stelo.MirrorNano 1.3 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 102 | 43% | 160 |
| yagami.Tidus 0.11 | 33 | 14% | 55 |
| kawigi.micro.Shiz 1.1 | 27 | 11% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 10% | 66 |
| ejb.Polaris 1.0.1 | 21 | 9% | 42 |
| stelo.MirrorNano 1.3 | 16 | 7% | 17 |
| kurios.DOSexe .9a | 12 | 5% | 12 |
| step.nanoPri 1.0 | 5 | 2% | 5 |

## Melee bench: F14

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.2 | 258 / 420 | 2.78 | 17.4% | 53193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 17.4% | 258 |
| bzdp.Pansy 2.1 | 3.3 | 11.8% | 35 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 50 |
| wompi.Quokka 1.6 | 3.6 | 11.6% | 33 |
| ratosh.Nobo 0.21 | 4.1 | 11.0% | 13 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 17 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.0 | 20 / 35 | 4614 |
| 2 | 1 | 65.5 | 77.8 | 18 / 35 | 4583 |
| 3 | 1 | 63.9 | 72.4 | 16 / 35 | 4204 |
| 4 | 1 | 64.5 | 73.7 | 21 / 35 | 4197 |
| 5 | 1 | 67.7 | 85.4 | 26 / 35 | 4393 |
| 6 | 1 | 68.3 | 90.2 | 28 / 35 | 4225 |
| 7 | 1 | 66.0 | 79.4 | 23 / 35 | 4333 |
| 8 | 1 | 67.1 | 83.5 | 22 / 35 | 4714 |
| 9 | 1 | 67.5 | 82.5 | 26 / 35 | 4650 |
| 10 | 1 | 64.3 | 75.2 | 19 / 35 | 4325 |
| 11 | 1 | 65.7 | 77.8 | 19 / 35 | 4517 |
| 12 | 1 | 67.3 | 84.4 | 20 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 85 | 93% |
| wee.Gem 1.8.4 | 83 | 92% |
| wompi.Quokka 1.6 | 48 | 90% |
| ratosh.Nobo 0.21 | 29 | 86% |
| m3thos.Eva00 1.1 | 16 | 100% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| stelo.MyAgileRobot 0.2 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 163 of 420 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 25 | 15% | 91 |
| wompi.Quokka 1.6 | 23 | 14% | 60 |
| wee.Gem 1.8.4 | 21 | 13% | 100 |
| ratosh.Nobo 0.21 | 20 | 12% | 44 |
| maribo.FollowFire 1 | 18 | 11% | 21 |
| stelo.MyAgileRobot 0.2 | 17 | 10% | 25 |
| bayen.UbaMicro 1.4 | 14 | 9% | 29 |
| m3thos.Eva00 1.1 | 13 | 8% | 28 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 7% | 20 |

## Melee bench: F15

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.5 | 118 / 420 | 2.67 | 18.6% | 82675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 20.0% | 263 |
| hadur117.micro.SaorT2 0.1 | 1.9 | 18.6% | 118 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 28 |
| ayk.WallHugger 1.0 | 4.3 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 7 |
| stuff.Vlad 0.1 | 6.0 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 6.9 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 78.1 | 8 / 35 | 7115 |
| 2 | 2 | 69.8 | 85.4 | 9 / 35 | 6909 |
| 3 | 1 | 71.4 | 87.6 | 13 / 35 | 7509 |
| 4 | 2 | 70.7 | 87.3 | 11 / 35 | 7205 |
| 5 | 2 | 69.4 | 83.5 | 10 / 35 | 6766 |
| 6 | 2 | 68.3 | 76.2 | 6 / 35 | 6820 |
| 7 | 2 | 68.5 | 79.0 | 9 / 35 | 6683 |
| 8 | 2 | 68.7 | 81.3 | 9 / 35 | 6304 |
| 9 | 2 | 68.2 | 75.9 | 9 / 35 | 6792 |
| 10 | 2 | 68.2 | 79.0 | 11 / 35 | 6459 |
| 11 | 2 | 70.0 | 81.9 | 10 / 35 | 7176 |
| 12 | 2 | 69.6 | 82.2 | 13 / 35 | 6937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 222 | 26% |
| mz.NanoGod 2.02 | 28 | 71% |
| exauge.GateKeeper 1.1.121g | 20 | 95% |
| ayk.WallHugger 1.0 | 9 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 304 of 420 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 222 | 73% | 284 |
| mz.NanoGod 2.02 | 40 | 13% | 66 |
| exauge.GateKeeper 1.1.121g | 16 | 5% | 26 |
| ayk.WallHugger 1.0 | 11 | 4% | 18 |
| stuff.Vlad 0.1 | 6 | 2% | 10 |
| stelo.PianistNano 1.2 | 5 | 2% | 5 |
| drd.Dreadknoght 0.9 | 4 | 1% | 11 |

## Melee bench: F16

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.2 | 219 / 420 | 3.50 | 16.3% | 54189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 16.3% | 219 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 13.0% | 44 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.3% | 43 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 34 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.9% | 33 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 15 |
| conscience.Electron 1.3g | 7.1 | 8.0% | 9 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 20 |
| dl.BetterWalls 1.0 | 8.6 | 6.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 67.0 | 15 / 35 | 4297 |
| 2 | 1 | 65.5 | 74.9 | 23 / 35 | 4438 |
| 3 | 1 | 60.8 | 61.0 | 14 / 35 | 4528 |
| 4 | 1 | 65.7 | 76.5 | 20 / 35 | 4632 |
| 5 | 1 | 63.1 | 68.6 | 17 / 35 | 4410 |
| 6 | 1 | 65.9 | 77.5 | 21 / 35 | 4525 |
| 7 | 1 | 61.9 | 65.4 | 14 / 35 | 4404 |
| 8 | 1 | 66.0 | 77.5 | 18 / 35 | 4720 |
| 9 | 1 | 66.0 | 80.3 | 20 / 35 | 4376 |
| 10 | 1 | 63.0 | 67.6 | 19 / 35 | 4338 |
| 11 | 1 | 64.4 | 69.8 | 18 / 35 | 4749 |
| 12 | 1 | 66.8 | 80.3 | 20 / 35 | 4772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 76 | 95% |
| dummy.micro.Sparrow 2.5 | 63 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 38 | 74% |
| bvh.micro.Freya 0.3 | 37 | 89% |
| ap.Frederick 1.1 | 13 | 100% |
| stelo.MirrorMicro 1.0 | 11 | 82% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 203 of 420 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 33 | 16% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 32 | 16% | 69 |
| dummy.micro.Sparrow 2.5 | 30 | 15% | 82 |
| voidious.micro.BlitzBat 1.05 | 29 | 14% | 99 |
| conscience.Electron 1.3g | 25 | 12% | 31 |
| dl.BetterWalls 1.0 | 23 | 11% | 37 |
| stelo.MirrorMicro 1.0 | 16 | 8% | 34 |
| bvh.micro.Freya 0.3 | 14 | 7% | 35 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.4 | 309 / 420 | 2.14 | 21.1% | 82843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 21.1% | 309 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 35 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 19 |
| supersample.SuperBoxBot 1.0 | 4.4 | 10.4% | 16 |
| mme.NikeEnhanced 2.0 | 5.1 | 9.2% | 11 |
| dsw.StaticD 1.0 | 5.4 | 9.2% | 17 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.1 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 8 |
| sample.Corners 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 93.0 | 29 / 35 | 7327 |
| 2 | 1 | 72.4 | 91.4 | 28 / 35 | 6834 |
| 3 | 1 | 71.4 | 87.9 | 25 / 35 | 7075 |
| 4 | 1 | 71.9 | 86.7 | 28 / 35 | 7310 |
| 5 | 1 | 70.2 | 83.5 | 23 / 35 | 6811 |
| 6 | 1 | 71.5 | 88.9 | 26 / 35 | 6595 |
| 7 | 1 | 69.0 | 78.4 | 21 / 35 | 6807 |
| 8 | 1 | 71.3 | 87.9 | 25 / 35 | 6556 |
| 9 | 1 | 70.5 | 85.7 | 24 / 35 | 6455 |
| 10 | 1 | 71.6 | 87.9 | 27 / 35 | 7022 |
| 11 | 1 | 71.5 | 86.7 | 26 / 35 | 7129 |
| 12 | 1 | 71.9 | 90.5 | 27 / 35 | 6922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 111 | 89% |
| sul.Lunar 1.1 | 96 | 99% |
| supersample.SuperBoxBot 1.0 | 43 | 93% |
| dsw.StaticD 1.0 | 34 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 18 | 94% |
| mme.NikeEnhanced 2.0 | 16 | 100% |
| tlp.ThreeLeggedPig 1 | 9 | 78% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 117 of 420 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 30 | 26% | 62 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 24% | 120 |
| supersample.SuperBoxBot 1.0 | 26 | 22% | 57 |
| mme.NikeEnhanced 2.0 | 9 | 8% | 26 |
| sul.Lunar 1.1 | 7 | 6% | 105 |
| tlp.ThreeLeggedPig 1 | 7 | 6% | 13 |
| sample.Corners 1.0 | 4 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 19 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 12 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorT2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 77.1 | 213 / 420 | 3.06 | 17.8% | 73597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorT2 0.1 | 1.0 | 17.8% | 213 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 64 |
| mld.Wisdom 1.0 | 2.9 | 12.3% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.1 | 11.3% | 46 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.3% | 14 |
| amz.NanoClone 1.41 | 5.4 | 10.0% | 24 |
| sample.Walls 1.0 | 7.0 | 8.3% | 17 |
| GarmBox.Oranges 1.0 | 8.1 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 6 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 73.3 | 16 / 35 | 5756 |
| 2 | 1 | 66.9 | 74.9 | 18 / 35 | 6411 |
| 3 | 1 | 68.1 | 82.9 | 17 / 35 | 6246 |
| 4 | 1 | 64.0 | 68.9 | 15 / 35 | 5479 |
| 5 | 1 | 67.6 | 77.1 | 19 / 35 | 6548 |
| 6 | 1 | 67.9 | 81.0 | 20 / 35 | 6050 |
| 7 | 1 | 67.7 | 79.4 | 18 / 35 | 6307 |
| 8 | 1 | 64.3 | 70.2 | 13 / 35 | 5647 |
| 9 | 1 | 68.6 | 81.0 | 20 / 35 | 6699 |
| 10 | 1 | 68.5 | 82.9 | 20 / 35 | 6095 |
| 11 | 1 | 66.0 | 74.9 | 18 / 35 | 5821 |
| 12 | 1 | 68.2 | 79.4 | 19 / 35 | 6538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 84 | 94% |
| radnor.DoctorBob 1.42 | 58 | 60% |
| mld.Wisdom 1.0 | 32 | 72% |
| amz.NanoClone 1.41 | 26 | 81% |
| KiraNL.Chupacabra 0.4 | 21 | 71% |
| jangs.ns51 1.0 | 17 | 100% |
| GarmBox.Oranges 1.0 | 12 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 207 of 420 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 67 | 32% | 100 |
| radnor.DoctorBob 1.42 | 48 | 23% | 95 |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 15% | 104 |
| KiraNL.Chupacabra 0.4 | 26 | 13% | 38 |
| amz.NanoClone 1.41 | 16 | 8% | 27 |
| jangs.ns51 1.0 | 9 | 4% | 19 |
| sample.Walls 1.0 | 5 | 2% | 21 |
| GarmBox.Oranges 1.0 | 5 | 2% | 9 |

