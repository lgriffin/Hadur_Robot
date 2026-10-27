# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.3 | 264 / 420 | 2.24 | 20.2% | 78352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.2% | 264 |
| radnor.DoctorBob 1.42 | 2.5 | 14.8% | 65 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 30 |
| mld.Infinity 2.2 | 3.5 | 13.5% | 49 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.7 | 6.7% | 2 |
| GarmBox.Oranges 1.0 | 7.1 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.6 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 8.9 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.1 | 22 / 35 | 6250 |
| 2 | 1 | 71.4 | 85.7 | 23 / 35 | 6594 |
| 3 | 1 | 72.5 | 90.8 | 25 / 35 | 6959 |
| 4 | 1 | 69.0 | 81.6 | 16 / 35 | 6242 |
| 5 | 1 | 70.6 | 83.2 | 21 / 35 | 6743 |
| 6 | 1 | 73.4 | 96.8 | 32 / 35 | 6670 |
| 7 | 1 | 71.6 | 88.9 | 24 / 35 | 6596 |
| 8 | 1 | 70.6 | 84.4 | 19 / 35 | 6550 |
| 9 | 1 | 71.9 | 91.1 | 21 / 35 | 6738 |
| 10 | 1 | 70.2 | 81.0 | 20 / 35 | 6702 |
| 11 | 1 | 69.2 | 80.6 | 21 / 35 | 6016 |
| 12 | 1 | 70.5 | 86.0 | 20 / 35 | 6292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 117 | 97% |
| mld.Infinity 2.2 | 80 | 84% |
| radnor.DoctorBob 1.42 | 79 | 72% |
| amz.NanoClone 1.41 | 16 | 94% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 157 of 420 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 77 | 49% | 167 |
| mld.Infinity 2.2 | 32 | 20% | 37 |
| mz.AntiGrav 1.0 | 26 | 17% | 130 |
| amz.NanoClone 1.41 | 10 | 6% | 31 |
| sample.Walls 1.0 | 4 | 3% | 21 |
| jangs.ns51 1.0 | 4 | 3% | 12 |
| arthord.MannyPacquiao Beta | 2 | 1% | 10 |
| GarmBox.Oranges 1.0 | 2 | 1% | 8 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.3 | 237 / 420 | 2.86 | 17.5% | 57516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.5% | 237 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.8% | 102 |
| mld.DustBunny 3.8 | 2.9 | 13.3% | 34 |
| maribo.melee.BMV 0.1 | 4.8 | 10.0% | 7 |
| zyx.nano.Ant 1.1 | 4.9 | 9.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 9.3% | 20 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 6.8% | 10 |
| fullsail.SweetTea 1.1 | 7.8 | 7.3% | 6 |
| bzdp.BoxCar 2.0 | 8.1 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 24 / 35 | 4625 |
| 2 | 1 | 66.2 | 78.4 | 17 / 35 | 4731 |
| 3 | 1 | 66.2 | 82.9 | 19 / 35 | 4545 |
| 4 | 1 | 68.6 | 86.7 | 24 / 35 | 5018 |
| 5 | 1 | 67.9 | 87.3 | 20 / 35 | 5136 |
| 6 | 4 | 54.7 | 42.9 | 9 / 35 | 3957 |
| 7 | 1 | 65.3 | 70.5 | 15 / 35 | 4921 |
| 8 | 1 | 69.4 | 90.5 | 27 / 35 | 4986 |
| 9 | 1 | 68.3 | 81.9 | 21 / 35 | 5325 |
| 10 | 1 | 66.6 | 80.6 | 21 / 35 | 4616 |
| 11 | 1 | 65.2 | 68.6 | 15 / 35 | 4954 |
| 12 | 1 | 69.4 | 92.4 | 25 / 35 | 4702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 128 | 72% |
| mld.DustBunny 3.8 | 84 | 93% |
| djdjdj.NanoSkunk10 1.0 | 21 | 95% |
| maribo.melee.BMV 0.1 | 19 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 93% |
| fullsail.SweetTea 1.1 | 9 | 78% |
| zyx.nano.Ant 1.1 | 9 | 89% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 183 of 420 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 30% | 138 |
| mld.DustBunny 3.8 | 26 | 14% | 93 |
| cs.Grudge 1.0 | 25 | 14% | 29 |
| zyx.nano.Ant 1.1 | 20 | 11% | 27 |
| maribo.melee.BMV 0.1 | 18 | 10% | 32 |
| fullsail.SweetTea 1.1 | 14 | 8% | 26 |
| djdjdj.NanoSkunk10 1.0 | 12 | 7% | 36 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 4% | 26 |
| bzdp.BoxCar 2.0 | 6 | 3% | 13 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.9 | 239 / 420 | 2.81 | 18.4% | 64267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.4% | 239 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 76 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.4% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.0% | 38 |
| fm.mammillarias 1.3 | 5.3 | 9.8% | 6 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 24 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.9 | 6.6% | 14 |
| sample.Fire 1.0 | 9.5 | 5.0% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 65.1 | 12 / 35 | 4986 |
| 2 | 1 | 66.8 | 78.4 | 19 / 35 | 4836 |
| 3 | 1 | 66.8 | 78.7 | 19 / 35 | 5093 |
| 4 | 1 | 67.9 | 81.3 | 22 / 35 | 5264 |
| 5 | 1 | 70.7 | 88.9 | 26 / 35 | 5926 |
| 6 | 1 | 67.4 | 76.2 | 18 / 35 | 5600 |
| 7 | 1 | 69.3 | 81.6 | 21 / 35 | 6237 |
| 8 | 1 | 66.8 | 76.8 | 17 / 35 | 5282 |
| 9 | 1 | 68.6 | 83.5 | 21 / 35 | 5219 |
| 10 | 1 | 68.0 | 81.0 | 18 / 35 | 5316 |
| 11 | 1 | 68.9 | 85.4 | 24 / 35 | 4727 |
| 12 | 1 | 69.0 | 81.6 | 22 / 35 | 5781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 90 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 59 | 85% |
| cb.nano.Insomnia 1.0 | 41 | 80% |
| myl.nano.KomoriNinja 1.1 | 36 | 94% |
| sp.Nanos.Ember 1.1 | 23 | 74% |
| fm.mammillarias 1.3 | 12 | 92% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 185 of 420 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 45 | 24% | 90 |
| myl.nano.KomoriNinja 1.1 | 33 | 18% | 78 |
| cb.nano.Insomnia 1.0 | 33 | 18% | 32 |
| myl.micro.Troodon 1.10 | 24 | 13% | 122 |
| fm.mammillarias 1.3 | 22 | 12% | 30 |
| sp.Nanos.Ember 1.1 | 10 | 5% | 26 |
| cs.sheldor.Talon 1.1 | 8 | 4% | 19 |
| sample.Fire 1.0 | 6 | 3% | 14 |
| sample.Tracker 1.0 | 2 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.0 | 265 / 420 | 2.44 | 19.5% | 72600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.5% | 265 |
| kawigi.nano.Lib 1.0 | 2.4 | 12.9% | 39 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.4% | 43 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 3 |
| stelo.SoJNanoMelee 1.1 | 5.1 | 9.7% | 33 |
| tj.zombie1n 1.0.1 | 5.6 | 9.0% | 15 |
| yk.JahMicro 1.0 | 6.9 | 8.2% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.8% | 11 |
| repositorio.NanoStep 1.0 | 9.2 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.4 | 25 / 35 | 6110 |
| 2 | 1 | 70.6 | 88.6 | 22 / 35 | 6508 |
| 3 | 1 | 68.6 | 80.3 | 20 / 35 | 6283 |
| 4 | 1 | 69.3 | 85.4 | 25 / 35 | 5954 |
| 5 | 1 | 70.3 | 86.7 | 24 / 35 | 6475 |
| 6 | 1 | 68.9 | 83.8 | 20 / 35 | 6201 |
| 7 | 1 | 70.5 | 88.3 | 25 / 35 | 6012 |
| 8 | 1 | 68.1 | 81.3 | 24 / 35 | 5653 |
| 9 | 1 | 68.2 | 84.1 | 17 / 35 | 5711 |
| 10 | 1 | 70.5 | 87.3 | 23 / 35 | 6241 |
| 11 | 1 | 66.6 | 75.6 | 18 / 35 | 5543 |
| 12 | 1 | 68.6 | 81.0 | 22 / 35 | 5909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 106 | 84% |
| stelo.SoJNanoMelee 1.1 | 86 | 87% |
| tvv.micro.Antares 1.1.1 | 38 | 74% |
| tj.zombie1n 1.0.1 | 28 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 78% |
| yk.JahMicro 1.0 | 17 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |

Hadur died in 155 of 420 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 30% | 152 |
| stelo.SoJNanoMelee 1.1 | 32 | 21% | 75 |
| tvv.micro.Antares 1.1.1 | 26 | 17% | 62 |
| tj.zombie1n 1.0.1 | 14 | 9% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 6% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 5% | 32 |
| yk.JahMicro 1.0 | 8 | 5% | 27 |
| sample.VelociRobot 1.0 | 7 | 5% | 13 |
| repositorio.NanoStep 1.0 | 4 | 3% | 19 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 64.7 | 162 / 420 | 4.18 | 14.6% | 52049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 14.6% | 162 |
| oog.melee.Corsair 1.0 | 2.3 | 12.9% | 70 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 68 |
| simonton.nano.MeleeSeed 1.8 | 3.9 | 11.6% | 56 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 19 |
| sam.Samspin 1.0 | 6.0 | 9.5% | 25 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.1% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.9% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 63.8 | 11 / 35 | 4409 |
| 2 | 1 | 59.5 | 58.1 | 14 / 35 | 4179 |
| 3 | 1 | 64.5 | 73.7 | 18 / 35 | 4794 |
| 4 | 1 | 63.8 | 71.4 | 18 / 35 | 4470 |
| 5 | 1 | 61.1 | 62.2 | 12 / 35 | 4547 |
| 6 | 1 | 60.3 | 62.9 | 13 / 35 | 4325 |
| 7 | 1 | 60.0 | 62.9 | 12 / 35 | 3907 |
| 8 | 2 | 58.1 | 56.2 | 10 / 35 | 3845 |
| 9 | 1 | 62.9 | 69.2 | 15 / 35 | 4503 |
| 10 | 1 | 64.4 | 75.6 | 16 / 35 | 4613 |
| 11 | 1 | 62.5 | 67.3 | 11 / 35 | 4371 |
| 12 | 3 | 57.3 | 53.3 | 12 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 62 | 77% |
| oog.melee.Corsair 1.0 | 52 | 67% |
| ahf.NanoAndrew .4 | 42 | 74% |
| sam.Samspin 1.0 | 20 | 90% |
| EBBU.Sim2 1.02 | 12 | 92% |
| robar.nano.Assertive_Melee 0.2 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 259 of 420 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 69 | 27% | 117 |
| oog.melee.Corsair 1.0 | 38 | 15% | 79 |
| ahf.NanoAndrew .4 | 34 | 13% | 70 |
| robar.nano.Assertive_Melee 0.2 | 30 | 12% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 25 | 10% | 21 |
| EBBU.Sim2 1.02 | 20 | 8% | 29 |
| sam.Samspin 1.0 | 18 | 7% | 29 |
| zyx.nano.BacillusComma 1.0 | 17 | 7% | 31 |
| sample.TrackFire 1.0 | 8 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.3 | 275 / 420 | 2.32 | 18.7% | 58983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 275 |
| d414.nano.Quantum 1.0.0 | 2.1 | 13.7% | 40 |
| gh.nano.Grofvuil 0.2 | 2.9 | 11.9% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.6 | 9.9% | 45 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.1% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 9 |
| fm.claire 1.7 | 6.5 | 8.6% | 6 |
| sample.SpinBot 1.0 | 7.6 | 7.5% | 9 |
| pa.Improved 1.0 | 9.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.4 | 25 / 35 | 4886 |
| 2 | 1 | 68.4 | 87.0 | 25 / 35 | 4795 |
| 3 | 1 | 67.0 | 81.3 | 23 / 35 | 4611 |
| 4 | 1 | 68.3 | 87.9 | 23 / 35 | 4898 |
| 5 | 1 | 67.8 | 85.1 | 22 / 35 | 4931 |
| 6 | 1 | 66.9 | 83.5 | 20 / 35 | 4678 |
| 7 | 1 | 66.7 | 80.3 | 20 / 35 | 5092 |
| 8 | 1 | 67.7 | 83.2 | 23 / 35 | 4750 |
| 9 | 1 | 68.1 | 86.0 | 27 / 35 | 4775 |
| 10 | 1 | 68.6 | 85.1 | 24 / 35 | 5193 |
| 11 | 1 | 68.1 | 84.8 | 19 / 35 | 5509 |
| 12 | 1 | 68.6 | 87.3 | 24 / 35 | 4865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 116 | 93% |
| oog.melee.CapuletDroid 1.1 | 82 | 77% |
| gh.nano.Grofvuil 0.2 | 50 | 84% |
| arthord.NanoSatanMelee Beta | 30 | 77% |
| winamp32.micro.MicroMacro 1.0 | 16 | 63% |
| sample.SpinBot 1.0 | 11 | 100% |
| fm.claire 1.7 | 9 | 78% |
| kurios.DOSexe .9b | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |

Hadur died in 147 of 420 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 31 | 21% | 37 |
| d414.nano.Quantum 1.0.0 | 30 | 20% | 148 |
| gh.nano.Grofvuil 0.2 | 25 | 17% | 80 |
| arthord.NanoSatanMelee Beta | 21 | 14% | 52 |
| winamp32.micro.MicroMacro 1.0 | 11 | 7% | 37 |
| sample.SpinBot 1.0 | 9 | 6% | 16 |
| kurios.DOSexe .9b | 8 | 5% | 23 |
| fm.claire 1.7 | 8 | 5% | 16 |
| pa.Improved 1.0 | 2 | 1% | 10 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.7 | 181 / 420 | 2.74 | 17.5% | 62888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 17.5% | 181 |
| gh.micro.Gruweltje 0.7 | 1.9 | 15.6% | 102 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.6% | 37 |
| mz.MicroGodMelee 1 | 3.9 | 13.0% | 70 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 13 |
| caimano.Furia_Ceca 0.22 | 6.1 | 7.5% | 7 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 3 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 4 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 3 |
| fire219.CatBot 1.0 | 9.1 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 78.7 | 14 / 35 | 5379 |
| 2 | 1 | 66.4 | 81.6 | 16 / 35 | 4945 |
| 3 | 1 | 67.9 | 85.1 | 18 / 35 | 5395 |
| 4 | 2 | 66.4 | 81.6 | 8 / 35 | 5409 |
| 5 | 1 | 67.0 | 83.5 | 15 / 35 | 5076 |
| 6 | 1 | 67.3 | 82.2 | 15 / 35 | 5099 |
| 7 | 1 | 67.4 | 80.6 | 17 / 35 | 5506 |
| 8 | 1 | 66.4 | 79.0 | 17 / 35 | 4786 |
| 9 | 1 | 67.8 | 83.8 | 18 / 35 | 5165 |
| 10 | 1 | 66.1 | 76.2 | 15 / 35 | 5278 |
| 11 | 1 | 67.7 | 81.3 | 15 / 35 | 5654 |
| 12 | 1 | 65.0 | 74.6 | 13 / 35 | 5196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 92 | 90% |
| mz.MicroGodMelee 1 | 79 | 43% |
| gh.micro.Gruweltje 0.7 | 64 | 25% |
| DBall.Anarchy 0.1 | 20 | 100% |
| mbro.Detektor3 0.1.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 11 | 82% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 4 | 100% |

Hadur died in 239 of 420 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 87 | 36% | 128 |
| gh.micro.Gruweltje 0.7 | 80 | 33% | 113 |
| spinnercat.micro.Tyger 0.1 | 26 | 11% | 82 |
| acogdev.alpha 0.2 | 18 | 8% | 21 |
| caimano.Furia_Ceca 0.22 | 12 | 5% | 18 |
| fire219.CatBot 1.0 | 8 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 16 |
| el.JumpShoot 0.2 | 3 | 1% | 7 |
| DBall.Anarchy 0.1 | 2 | 1% | 24 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.2 | 197 / 420 | 3.59 | 16.2% | 60272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.2% | 197 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.6% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.7% | 67 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.5% | 13 |
| germ.TheMind .2 | 4.9 | 9.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 6 |
| awesomeness.Elite 1.0 | 6.9 | 8.2% | 8 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.3% | 8 |
| sample.Crazy 1.0 | 8.3 | 7.0% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 71.4 | 16 / 35 | 5023 |
| 2 | 1 | 66.7 | 76.8 | 20 / 35 | 5134 |
| 3 | 1 | 66.2 | 76.2 | 19 / 35 | 5290 |
| 4 | 1 | 62.5 | 67.0 | 14 / 35 | 4801 |
| 5 | 1 | 66.1 | 77.1 | 18 / 35 | 5288 |
| 6 | 3 | 59.8 | 57.5 | 15 / 35 | 4258 |
| 7 | 2 | 65.9 | 74.6 | 18 / 35 | 4938 |
| 8 | 1 | 67.3 | 76.8 | 20 / 35 | 5199 |
| 9 | 2 | 62.2 | 65.1 | 14 / 35 | 4623 |
| 10 | 1 | 64.5 | 71.1 | 17 / 35 | 5047 |
| 11 | 1 | 63.5 | 68.9 | 14 / 35 | 5032 |
| 12 | 1 | 65.0 | 71.7 | 12 / 35 | 5639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 135 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 54 | 74% |
| germ.TheMind .2 | 19 | 84% |
| qualidafial.MajorDick 1.0.1 | 16 | 94% |
| awesomeness.Elite 1.0 | 10 | 90% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |

Hadur died in 223 of 420 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 40% | 172 |
| simonton.nano.WeekendObsession_Melee 1.0 | 49 | 22% | 82 |
| germ.TheMind .2 | 24 | 11% | 42 |
| awesomeness.Elite 1.0 | 13 | 6% | 28 |
| lrem.micro.MoggFanatic 0.2 | 13 | 6% | 22 |
| qualidafial.MajorDick 1.0.1 | 12 | 5% | 22 |
| stelo.UntouchableNano 1.3 | 11 | 5% | 20 |
| mym.EdgeStalker 1.0 | 11 | 5% | 14 |
| sample.Crazy 1.0 | 1 | 0% | 14 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.4 | 287 / 420 | 2.23 | 19.1% | 54926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.1% | 287 |
| rz.HawkOnFire 0.1 | 2.1 | 13.8% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.6% | 36 |
| maribo.IotaCT 1.1 | 4.3 | 11.0% | 24 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 12 |
| ratosh.Wesco 1.4 | 7.9 | 7.7% | 3 |
| spinnercat.Omen 1.0 | 7.9 | 7.6% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 24 / 35 | 4678 |
| 2 | 1 | 69.6 | 85.7 | 22 / 35 | 4711 |
| 3 | 1 | 67.7 | 79.7 | 21 / 35 | 4520 |
| 4 | 1 | 70.0 | 89.5 | 25 / 35 | 4411 |
| 5 | 1 | 70.7 | 93.3 | 29 / 35 | 4690 |
| 6 | 1 | 70.1 | 89.8 | 25 / 35 | 4499 |
| 7 | 1 | 71.0 | 91.4 | 26 / 35 | 4859 |
| 8 | 1 | 69.8 | 89.5 | 25 / 35 | 4529 |
| 9 | 1 | 68.8 | 84.1 | 23 / 35 | 4518 |
| 10 | 1 | 68.0 | 83.8 | 22 / 35 | 4113 |
| 11 | 1 | 67.7 | 81.3 | 20 / 35 | 4298 |
| 12 | 1 | 69.0 | 83.2 | 25 / 35 | 5100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 125 | 94% |
| nz.jdc.nano.GridFu 1.0 | 74 | 85% |
| timmit.nano.TimDog 0.33 | 32 | 91% |
| maribo.IotaCT 1.1 | 31 | 87% |
| stelo.PatternRobot 1.0 | 25 | 96% |
| spinnercat.Omen 1.0 | 15 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 75% |
| ratosh.Wesco 1.4 | 6 | 83% |

Hadur died in 134 of 420 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 25 | 19% | 97 |
| timmit.nano.TimDog 0.33 | 25 | 19% | 59 |
| rz.HawkOnFire 0.1 | 23 | 17% | 112 |
| stelo.PatternRobot 1.0 | 18 | 13% | 28 |
| maribo.IotaCT 1.1 | 13 | 10% | 54 |
| ratosh.Wesco 1.4 | 12 | 9% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 9% | 21 |
| spinnercat.Omen 1.0 | 6 | 4% | 14 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.0 | 310 / 420 | 2.08 | 20.1% | 70154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.1% | 310 |
| tvv.nano.Polaris 1.2 | 2.1 | 13.1% | 51 |
| baal.nano.N 1.42 | 3.1 | 11.1% | 15 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 3 |
| zyx.micro.Ant 1.1 | 5.0 | 9.4% | 13 |
| squidM.TentalceMeleeNano 1.1 | 6.6 | 8.2% | 3 |
| sanja.First 0.1 | 6.7 | 8.3% | 6 |
| cvt.Firsty 1.0 | 7.0 | 7.9% | 17 |
| amk.Punbot.Punbot 0.01 | 8.8 | 6.8% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.6 | 25 / 35 | 5856 |
| 2 | 1 | 70.1 | 91.1 | 26 / 35 | 5716 |
| 3 | 1 | 70.1 | 88.6 | 26 / 35 | 6048 |
| 4 | 1 | 69.8 | 89.5 | 26 / 35 | 5687 |
| 5 | 1 | 69.8 | 88.3 | 24 / 35 | 5821 |
| 6 | 1 | 66.8 | 79.4 | 20 / 35 | 5217 |
| 7 | 1 | 69.6 | 86.0 | 24 / 35 | 6073 |
| 8 | 1 | 71.5 | 93.7 | 31 / 35 | 6186 |
| 9 | 1 | 70.5 | 92.1 | 28 / 35 | 5797 |
| 10 | 1 | 70.4 | 87.6 | 28 / 35 | 6009 |
| 11 | 1 | 69.8 | 87.3 | 24 / 35 | 6098 |
| 12 | 1 | 70.4 | 90.8 | 28 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 81 | 88% |
| cvt.Firsty 1.0 | 60 | 90% |
| baal.nano.N 1.42 | 57 | 96% |
| zyx.micro.Ant 1.1 | 38 | 92% |
| sanja.First 0.1 | 35 | 100% |
| amk.Punbot.Punbot 0.01 | 24 | 96% |
| Grystrion.TrackerWO 1.0 | 23 | 100% |
| squidM.TentalceMeleeNano 1.1 | 12 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 113 of 420 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 36% | 135 |
| zyx.micro.Ant 1.1 | 23 | 20% | 72 |
| cvt.Firsty 1.0 | 10 | 9% | 50 |
| Grystrion.TrackerWO 1.0 | 10 | 9% | 30 |
| baal.nano.N 1.42 | 8 | 7% | 54 |
| amk.Punbot.Punbot 0.01 | 7 | 6% | 12 |
| sample.RamFire 1.0 | 6 | 5% | 8 |
| sanja.First 0.1 | 3 | 3% | 35 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 17 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 63.1 | 95 / 420 | 4.32 | 13.5% | 51619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.4% | 177 |
| hadur117.micro.SaorC 0.1 | 2.5 | 13.5% | 95 |
| cs.Wren 1.0 | 2.8 | 13.1% | 48 |
| js.PinBall 1.6 | 4.2 | 11.8% | 36 |
| mz.Cork 0.1 | 4.5 | 11.3% | 23 |
| joe.ADinosaur 1.0 | 6.1 | 9.4% | 8 |
| evd.X1 0.01 | 6.8 | 7.9% | 7 |
| jsal.Jsalbot 1.0 | 8.2 | 7.0% | 14 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 12 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 56.2 | 5 / 35 | 4254 |
| 2 | 2 | 59.7 | 62.5 | 5 / 35 | 4552 |
| 3 | 4 | 57.7 | 58.4 | 3 / 35 | 4404 |
| 4 | 2 | 58.3 | 59.7 | 8 / 35 | 4168 |
| 5 | 2 | 59.4 | 65.1 | 7 / 35 | 4012 |
| 6 | 2 | 60.2 | 64.1 | 10 / 35 | 4495 |
| 7 | 5 | 55.5 | 51.7 | 8 / 35 | 3759 |
| 8 | 3 | 61.1 | 66.7 | 8 / 35 | 4177 |
| 9 | 2 | 62.8 | 72.1 | 9 / 35 | 4567 |
| 10 | 1 | 62.9 | 68.6 | 14 / 35 | 4862 |
| 11 | 1 | 63.0 | 71.4 | 11 / 35 | 4830 |
| 12 | 3 | 57.0 | 60.3 | 7 / 35 | 3539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 112 | 26% |
| cs.Wren 1.0 | 40 | 93% |
| js.PinBall 1.6 | 16 | 56% |
| mz.Cork 0.1 | 10 | 90% |
| jsal.Jsalbot 1.0 | 9 | 56% |
| donjezza.Jezza 1.0 | 6 | 33% |
| joe.ADinosaur 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 329 of 420 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 151 | 46% | 188 |
| joe.ADinosaur 1.0 | 36 | 11% | 38 |
| cs.Wren 1.0 | 34 | 10% | 54 |
| js.PinBall 1.6 | 33 | 10% | 45 |
| mz.Cork 0.1 | 22 | 7% | 30 |
| PSW.Relentless 0.1 | 20 | 6% | 20 |
| evd.X1 0.01 | 19 | 6% | 21 |
| jsal.Jsalbot 1.0 | 9 | 3% | 16 |
| donjezza.Jezza 1.0 | 5 | 2% | 8 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.4 | 238 / 420 | 2.86 | 17.5% | 51849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 238 |
| ntc.Opposite 1.5 | 3.3 | 11.2% | 22 |
| stelo.AreaTargetingBot 1.1 | 3.4 | 11.1% | 35 |
| myl.nano.Graviton 1.10 | 4.1 | 10.8% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.2% | 16 |
| disan.Chair 2.2.0 | 6.6 | 9.2% | 22 |
| DBall.NUKE 0.1 | 7.9 | 7.9% | 11 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 23 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 78.4 | 17 / 35 | 4295 |
| 2 | 1 | 68.0 | 84.8 | 22 / 35 | 4759 |
| 3 | 1 | 69.1 | 89.5 | 25 / 35 | 4458 |
| 4 | 1 | 64.3 | 74.6 | 18 / 35 | 4442 |
| 5 | 1 | 64.2 | 76.5 | 16 / 35 | 3816 |
| 6 | 1 | 63.6 | 70.2 | 18 / 35 | 4205 |
| 7 | 1 | 65.8 | 77.8 | 21 / 35 | 4281 |
| 8 | 1 | 67.1 | 82.5 | 24 / 35 | 4017 |
| 9 | 1 | 63.4 | 73.0 | 15 / 35 | 4064 |
| 10 | 1 | 67.8 | 84.8 | 20 / 35 | 4488 |
| 11 | 1 | 66.8 | 79.0 | 19 / 35 | 4803 |
| 12 | 1 | 66.8 | 81.3 | 23 / 35 | 4221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 65 | 88% |
| myl.nano.Graviton 1.10 | 45 | 80% |
| ntc.Opposite 1.5 | 35 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 32 | 91% |
| disan.Chair 2.2.0 | 31 | 77% |
| donjezza.Muncho 1.0 | 26 | 81% |
| DBall.NUKE 0.1 | 22 | 91% |
| pfvicm.Sobieski 7.2.3b | 18 | 83% |
| pbg.R2D2 1.0 | 6 | 100% |

Hadur died in 186 of 420 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 51 | 27% | 65 |
| myl.nano.Graviton 1.10 | 27 | 15% | 75 |
| lrem.micro.SpikeSoldier 0.4 | 26 | 14% | 56 |
| ntc.Opposite 1.5 | 23 | 12% | 41 |
| stelo.AreaTargetingBot 1.1 | 22 | 12% | 67 |
| disan.Chair 2.2.0 | 15 | 8% | 38 |
| DBall.NUKE 0.1 | 12 | 6% | 35 |
| donjezza.Muncho 1.0 | 6 | 3% | 25 |
| pbg.R2D2 1.0 | 4 | 2% | 16 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 68.9 | 117 / 420 | 3.80 | 14.4% | 46471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.7 | 14.4% | 117 |
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 118 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 51 |
| yagami.Tidus 0.11 | 4.8 | 11.9% | 20 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 24 |
| stelo.MirrorNano 1.3 | 7.1 | 7.7% | 2 |
| step.nanoPri 1.0 | 7.9 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 66.3 | 12 / 35 | 3697 |
| 2 | 1 | 63.3 | 73.3 | 9 / 35 | 4036 |
| 3 | 2 | 61.7 | 65.4 | 6 / 35 | 4272 |
| 4 | 2 | 62.1 | 67.0 | 11 / 35 | 3866 |
| 5 | 2 | 61.9 | 68.9 | 10 / 35 | 3646 |
| 6 | 1 | 63.9 | 71.4 | 14 / 35 | 4129 |
| 7 | 3 | 61.4 | 66.7 | 9 / 35 | 3575 |
| 8 | 1 | 63.4 | 73.7 | 10 / 35 | 3703 |
| 9 | 3 | 60.1 | 61.6 | 7 / 35 | 3890 |
| 10 | 1 | 63.1 | 73.0 | 9 / 35 | 3950 |
| 11 | 1 | 62.9 | 74.3 | 9 / 35 | 3628 |
| 12 | 1 | 61.3 | 64.8 | 11 / 35 | 4079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 65 | 42% |
| kawigi.micro.Shiz 1.1 | 48 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 74% |
| yagami.Tidus 0.11 | 19 | 95% |
| ejb.Polaris 1.0.1 | 6 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 303 of 420 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 123 | 41% | 160 |
| yagami.Tidus 0.11 | 40 | 13% | 57 |
| ejb.Polaris 1.0.1 | 37 | 12% | 48 |
| kawigi.micro.Shiz 1.1 | 35 | 12% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 11% | 62 |
| stelo.MirrorNano 1.3 | 15 | 5% | 15 |
| step.nanoPri 1.0 | 13 | 4% | 14 |
| kurios.DOSexe .9a | 8 | 3% | 7 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 76.5 | 217 / 420 | 3.12 | 16.3% | 47968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 217 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 36 |
| wee.Gem 1.8.4 | 3.2 | 12.5% | 82 |
| wompi.Quokka 1.6 | 3.5 | 12.2% | 38 |
| ratosh.Nobo 0.21 | 4.7 | 11.2% | 19 |
| m3thos.Eva00 1.1 | 6.1 | 9.6% | 21 |
| bayen.UbaMicro 1.4 | 6.6 | 8.9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 65.1 | 14 / 35 | 3855 |
| 2 | 1 | 64.8 | 77.8 | 16 / 35 | 4161 |
| 3 | 1 | 64.5 | 77.1 | 22 / 35 | 3813 |
| 4 | 1 | 64.3 | 75.2 | 18 / 35 | 4016 |
| 5 | 1 | 64.5 | 79.0 | 17 / 35 | 3798 |
| 6 | 1 | 65.1 | 76.5 | 18 / 35 | 4408 |
| 7 | 1 | 66.1 | 81.3 | 21 / 35 | 4271 |
| 8 | 1 | 64.0 | 76.2 | 16 / 35 | 3783 |
| 9 | 1 | 62.2 | 68.9 | 15 / 35 | 3694 |
| 10 | 1 | 67.9 | 87.9 | 21 / 35 | 4514 |
| 11 | 1 | 66.5 | 80.6 | 22 / 35 | 4067 |
| 12 | 1 | 62.7 | 72.1 | 17 / 35 | 3588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 78 | 78% |
| bzdp.Pansy 2.1 | 76 | 89% |
| wompi.Quokka 1.6 | 47 | 87% |
| ratosh.Nobo 0.21 | 24 | 92% |
| m3thos.Eva00 1.1 | 14 | 86% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 203 of 420 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 35 | 17% | 97 |
| wompi.Quokka 1.6 | 35 | 17% | 66 |
| jeremyreeder.Vincent 2011.12.09 | 30 | 15% | 31 |
| bzdp.Pansy 2.1 | 23 | 11% | 88 |
| bayen.UbaMicro 1.4 | 20 | 10% | 30 |
| ratosh.Nobo 0.21 | 19 | 9% | 40 |
| m3thos.Eva00 1.1 | 17 | 8% | 32 |
| maribo.FollowFire 1 | 15 | 7% | 16 |
| stelo.MyAgileRobot 0.2 | 9 | 4% | 13 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 79.3 | 110 / 420 | 2.86 | 17.9% | 79108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 20.2% | 271 |
| hadur117.micro.SaorC 0.1 | 1.9 | 17.9% | 110 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 24 |
| ayk.WallHugger 1.0 | 4.3 | 10.0% | 3 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.5% | 10 |
| stuff.Vlad 0.1 | 5.8 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 83.8 | 13 / 35 | 6759 |
| 2 | 2 | 68.7 | 80.0 | 7 / 35 | 6788 |
| 3 | 2 | 68.9 | 80.6 | 11 / 35 | 6810 |
| 4 | 2 | 68.7 | 78.7 | 11 / 35 | 6672 |
| 5 | 2 | 65.1 | 67.0 | 7 / 35 | 5960 |
| 6 | 2 | 68.5 | 81.6 | 9 / 35 | 6477 |
| 7 | 2 | 68.0 | 75.6 | 7 / 35 | 6522 |
| 8 | 1 | 70.5 | 85.7 | 12 / 35 | 7178 |
| 9 | 2 | 68.7 | 81.0 | 8 / 35 | 6378 |
| 10 | 2 | 69.4 | 82.9 | 11 / 35 | 6743 |
| 11 | 2 | 65.9 | 71.4 | 5 / 35 | 6087 |
| 12 | 2 | 69.6 | 83.8 | 9 / 35 | 6734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 220 | 25% |
| mz.NanoGod 2.02 | 24 | 83% |
| drd.Dreadknoght 0.9 | 13 | 92% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| stuff.Vlad 0.1 | 7 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 310 of 420 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 215 | 69% | 270 |
| mz.NanoGod 2.02 | 57 | 18% | 89 |
| exauge.GateKeeper 1.1.121g | 16 | 5% | 23 |
| ayk.WallHugger 1.0 | 16 | 5% | 22 |
| stuff.Vlad 0.1 | 3 | 1% | 6 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 1 | 0% | 7 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.7 | 219 / 420 | 3.46 | 16.3% | 54030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 219 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.8% | 45 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 39 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.2% | 36 |
| stelo.MirrorMicro 1.0 | 5.9 | 9.0% | 14 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 4 |
| dl.BetterWalls 1.0 | 8.4 | 6.9% | 10 |
| ap.Frederick 1.1 | 8.6 | 7.0% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.3 | 21 / 35 | 4896 |
| 2 | 1 | 66.7 | 79.4 | 20 / 35 | 4818 |
| 3 | 1 | 63.2 | 72.1 | 15 / 35 | 4376 |
| 4 | 1 | 61.9 | 67.0 | 17 / 35 | 3989 |
| 5 | 1 | 64.5 | 73.3 | 19 / 35 | 4508 |
| 6 | 1 | 61.4 | 63.5 | 15 / 35 | 4364 |
| 7 | 1 | 63.3 | 68.9 | 19 / 35 | 4278 |
| 8 | 1 | 65.3 | 76.2 | 19 / 35 | 4644 |
| 9 | 1 | 64.3 | 72.4 | 18 / 35 | 4638 |
| 10 | 1 | 63.7 | 70.2 | 17 / 35 | 4663 |
| 11 | 1 | 64.2 | 72.4 | 20 / 35 | 4117 |
| 12 | 1 | 65.5 | 75.9 | 19 / 35 | 4739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 76 | 92% |
| dummy.micro.Sparrow 2.5 | 50 | 88% |
| bvh.micro.Freya 0.3 | 45 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 43 | 86% |
| ap.Frederick 1.1 | 18 | 94% |
| stelo.MirrorMicro 1.0 | 7 | 43% |
| dl.BetterWalls 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 202 of 420 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 44 | 22% | 55 |
| voidious.micro.BlitzBat 1.05 | 37 | 18% | 109 |
| mn.nano.perceptual.Impact 1.3.0 | 31 | 15% | 28 |
| dummy.micro.Sparrow 2.5 | 23 | 11% | 69 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 10% | 64 |
| dl.BetterWalls 1.0 | 18 | 9% | 29 |
| bvh.micro.Freya 0.3 | 17 | 8% | 50 |
| stelo.MirrorMicro 1.0 | 10 | 5% | 16 |
| ap.Frederick 1.1 | 1 | 0% | 0 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 83.8 | 260 / 420 | 2.46 | 19.8% | 76759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 260 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 55 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 34 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.1% | 19 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 11 |
| dsw.StaticD 1.0 | 5.6 | 9.1% | 19 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.5% | 8 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.0% | 10 |
| sample.Corners 1.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 77.1 | 21 / 35 | 5530 |
| 2 | 1 | 69.6 | 86.3 | 22 / 35 | 6130 |
| 3 | 1 | 72.8 | 96.2 | 25 / 35 | 6967 |
| 4 | 1 | 69.9 | 84.1 | 22 / 35 | 6553 |
| 5 | 1 | 67.2 | 75.6 | 22 / 35 | 5652 |
| 6 | 1 | 71.6 | 90.8 | 23 / 35 | 6761 |
| 7 | 1 | 67.7 | 76.2 | 17 / 35 | 6362 |
| 8 | 1 | 69.6 | 82.9 | 19 / 35 | 6888 |
| 9 | 1 | 70.1 | 84.4 | 23 / 35 | 6369 |
| 10 | 1 | 70.8 | 85.4 | 23 / 35 | 7039 |
| 11 | 1 | 69.6 | 83.2 | 25 / 35 | 5944 |
| 12 | 1 | 69.4 | 82.9 | 18 / 35 | 6564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 92 | 83% |
| sul.Lunar 1.1 | 71 | 99% |
| supersample.SuperBoxBot 1.0 | 40 | 93% |
| dsw.StaticD 1.0 | 26 | 62% |
| mme.NikeEnhanced 2.0 | 22 | 95% |
| sample.MyFirstJuniorRobot 1.0 | 18 | 83% |
| sample.MyFirstRobot 1.0 | 12 | 83% |
| sample.Corners 1.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |

Hadur died in 161 of 420 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 34% | 129 |
| supersample.SuperBoxBot 1.0 | 30 | 19% | 66 |
| dsw.StaticD 1.0 | 27 | 17% | 54 |
| mme.NikeEnhanced 2.0 | 15 | 9% | 33 |
| sul.Lunar 1.1 | 9 | 6% | 80 |
| sample.MyFirstJuniorRobot 1.0 | 9 | 6% | 23 |
| sample.MyFirstRobot 1.0 | 6 | 4% | 16 |
| tlp.ThreeLeggedPig 1 | 6 | 4% | 9 |
| sample.Corners 1.0 | 3 | 2% | 10 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.7 | 206 / 420 | 2.92 | 17.5% | 67751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 206 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 68 |
| mld.Wisdom 1.0 | 3.2 | 12.6% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.4 | 11.0% | 37 |
| KiraNL.Chupacabra 0.4 | 4.9 | 10.7% | 22 |
| amz.NanoClone 1.41 | 5.4 | 10.2% | 22 |
| sample.Walls 1.0 | 7.0 | 7.8% | 15 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 7 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.8 | 16 / 35 | 5494 |
| 2 | 1 | 68.1 | 83.2 | 19 / 35 | 6057 |
| 3 | 1 | 66.7 | 81.9 | 16 / 35 | 5409 |
| 4 | 1 | 66.8 | 77.5 | 18 / 35 | 5482 |
| 5 | 1 | 67.7 | 82.5 | 17 / 35 | 5742 |
| 6 | 1 | 66.1 | 80.0 | 17 / 35 | 5350 |
| 7 | 1 | 63.4 | 67.6 | 14 / 35 | 5619 |
| 8 | 1 | 68.2 | 82.2 | 20 / 35 | 5932 |
| 9 | 1 | 63.6 | 70.5 | 12 / 35 | 5256 |
| 10 | 1 | 68.4 | 84.8 | 21 / 35 | 5991 |
| 11 | 1 | 66.1 | 75.9 | 18 / 35 | 5783 |
| 12 | 1 | 67.0 | 80.6 | 18 / 35 | 5636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 81 | 95% |
| radnor.DoctorBob 1.42 | 65 | 57% |
| mld.Wisdom 1.0 | 35 | 86% |
| amz.NanoClone 1.41 | 23 | 78% |
| KiraNL.Chupacabra 0.4 | 20 | 75% |
| sample.Walls 1.0 | 12 | 92% |
| jangs.ns51 1.0 | 10 | 90% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 214 of 420 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 56 | 26% | 100 |
| mld.Wisdom 1.0 | 49 | 23% | 77 |
| KiraNL.Chupacabra 0.4 | 40 | 19% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 13% | 108 |
| amz.NanoClone 1.41 | 17 | 8% | 26 |
| sample.Walls 1.0 | 10 | 5% | 24 |
| jangs.ns51 1.0 | 8 | 4% | 17 |
| GarmBox.Oranges 1.0 | 7 | 3% | 9 |

