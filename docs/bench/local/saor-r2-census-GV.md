# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 91.4 | 167 / 210 | 1.77 | 22.2% | 43935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 22.2% | 167 |
| mz.AntiGrav 1.0 | 2.7 | 13.7% | 10 |
| radnor.DoctorBob 1.42 | 2.7 | 13.7% | 15 |
| mld.Infinity 2.2 | 3.7 | 12.6% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 2 |
| sample.Walls 1.0 | 6.5 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 90.5 | 27 / 35 | 7310 |
| 2 | 1 | 72.4 | 86.7 | 24 / 35 | 7517 |
| 3 | 1 | 72.8 | 90.2 | 28 / 35 | 7301 |
| 4 | 1 | 74.4 | 97.5 | 32 / 35 | 7600 |
| 5 | 1 | 73.0 | 92.7 | 28 / 35 | 6888 |
| 6 | 1 | 72.7 | 91.1 | 28 / 35 | 7319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 97% |
| mld.Infinity 2.2 | 50 | 94% |
| radnor.DoctorBob 1.42 | 33 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 15 | 34% | 69 |
| amz.NanoClone 1.41 | 10 | 23% | 15 |
| mld.Infinity 2.2 | 8 | 18% | 18 |
| mz.AntiGrav 1.0 | 7 | 16% | 75 |
| sample.Walls 1.0 | 2 | 5% | 14 |
| jangs.ns51 1.0 | 1 | 2% | 8 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.5 | 156 / 210 | 1.76 | 20.0% | 32630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 20.0% | 156 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.3% | 34 |
| mld.DustBunny 3.8 | 3.2 | 12.4% | 7 |
| maribo.melee.BMV 0.1 | 5.2 | 9.4% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.2% | 6 |
| zyx.nano.Ant 1.1 | 6.2 | 8.1% | 1 |
| fullsail.SweetTea 1.1 | 7.0 | 6.9% | 2 |
| bzdp.BoxCar 2.0 | 7.5 | 7.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.1% | 3 |
| cs.Grudge 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.2 | 25 / 35 | 5799 |
| 2 | 1 | 69.3 | 90.2 | 24 / 35 | 4925 |
| 3 | 1 | 71.8 | 98.1 | 30 / 35 | 5680 |
| 4 | 1 | 69.2 | 87.9 | 23 / 35 | 5635 |
| 5 | 1 | 69.4 | 90.5 | 26 / 35 | 5171 |
| 6 | 1 | 70.4 | 93.3 | 28 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 86 | 76% |
| mld.DustBunny 3.8 | 51 | 94% |
| djdjdj.NanoSkunk10 1.0 | 23 | 96% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 44% | 90 |
| mld.DustBunny 3.8 | 10 | 18% | 45 |
| bzdp.BoxCar 2.0 | 6 | 11% | 9 |
| fullsail.SweetTea 1.1 | 4 | 7% | 14 |
| djdjdj.NanoSkunk10 1.0 | 3 | 5% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 13 |
| maribo.melee.BMV 0.1 | 2 | 4% | 9 |
| zyx.nano.Ant 1.1 | 2 | 4% | 5 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F03

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.4 | 155 / 210 | 1.95 | 20.8% | 36829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 20.8% | 155 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.6% | 9 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.6% | 9 |
| fm.mammillarias 1.3 | 5.7 | 8.9% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 7 |
| sample.Fire 1.0 | 9.3 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 81.3 | 21 / 35 | 6678 |
| 2 | 1 | 72.3 | 94.0 | 27 / 35 | 6426 |
| 3 | 1 | 70.2 | 89.2 | 26 / 35 | 5567 |
| 4 | 1 | 70.8 | 86.7 | 26 / 35 | 6286 |
| 5 | 1 | 70.7 | 90.2 | 26 / 35 | 5693 |
| 6 | 1 | 72.2 | 95.2 | 29 / 35 | 6179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 43 | 93% |
| cb.nano.Insomnia 1.0 | 21 | 81% |
| myl.nano.KomoriNinja 1.1 | 17 | 94% |
| sp.Nanos.Ember 1.1 | 13 | 85% |
| fm.mammillarias 1.3 | 11 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 13 | 23% | 13 |
| myl.micro.Troodon 1.10 | 12 | 21% | 66 |
| myl.nano.KomoriNinja 1.1 | 12 | 21% | 50 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 16% | 36 |
| sp.Nanos.Ember 1.1 | 4 | 7% | 21 |
| fm.mammillarias 1.3 | 3 | 5% | 6 |
| cs.sheldor.Talon 1.1 | 2 | 4% | 7 |
| sample.Fire 1.0 | 0 | 0% | 7 |
| sample.Tracker 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.7 | 165 / 210 | 1.83 | 21.6% | 40751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 21.6% | 165 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.2% | 15 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.0% | 9 |
| tj.zombie1n 1.0.1 | 5.0 | 9.6% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.9% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.4% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.9% | 5 |
| yk.JahMicro 1.0 | 7.0 | 7.8% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 89.5 | 28 / 35 | 6632 |
| 2 | 1 | 72.4 | 94.0 | 31 / 35 | 6724 |
| 3 | 1 | 71.4 | 91.4 | 25 / 35 | 6573 |
| 4 | 1 | 72.3 | 93.0 | 28 / 35 | 6911 |
| 5 | 1 | 71.1 | 87.0 | 26 / 35 | 6966 |
| 6 | 1 | 71.3 | 89.5 | 27 / 35 | 6945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 93% |
| stelo.SoJNanoMelee 1.1 | 46 | 98% |
| tvv.micro.Antares 1.1.1 | 26 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 85% |
| yk.JahMicro 1.0 | 12 | 83% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| sample.VelociRobot 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 13 | 29% | 78 |
| tvv.micro.Antares 1.1.1 | 7 | 16% | 34 |
| stelo.SoJNanoMelee 1.1 | 6 | 13% | 25 |
| yk.JahMicro 1.0 | 5 | 11% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 9% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 9% | 6 |
| tj.zombie1n 1.0.1 | 3 | 7% | 8 |
| repositorio.NanoStep 1.0 | 2 | 4% | 13 |
| sample.VelociRobot 1.0 | 1 | 2% | 8 |

## Melee bench: F05

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.2 | 101 / 210 | 3.32 | 16.7% | 29937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 16.7% | 101 |
| oog.melee.Corsair 1.0 | 2.2 | 13.3% | 38 |
| ahf.NanoAndrew .4 | 3.5 | 11.1% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 22 |
| EBBU.Sim2 1.02 | 5.2 | 9.9% | 3 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.3% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 6 |
| sam.Samspin 1.0 | 7.3 | 8.7% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.9% | 2 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.2 | 17 / 35 | 4707 |
| 2 | 1 | 65.1 | 71.7 | 18 / 35 | 5361 |
| 3 | 1 | 66.3 | 79.0 | 18 / 35 | 5128 |
| 4 | 1 | 67.2 | 81.3 | 19 / 35 | 5359 |
| 5 | 1 | 64.1 | 73.3 | 17 / 35 | 4658 |
| 6 | 1 | 61.4 | 64.8 | 12 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 44 | 66% |
| simonton.nano.MeleeSeed 1.8 | 25 | 96% |
| ahf.NanoAndrew .4 | 24 | 83% |
| EBBU.Sim2 1.02 | 11 | 100% |
| sam.Samspin 1.0 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 25% | 61 |
| robar.nano.Assertive_Melee 0.2 | 18 | 17% | 20 |
| zyx.nano.BacillusComma 1.0 | 16 | 15% | 19 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 32 |
| ahf.NanoAndrew .4 | 11 | 10% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 8 |
| EBBU.Sim2 1.02 | 7 | 6% | 18 |
| sam.Samspin 1.0 | 7 | 6% | 10 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.9 | 139 / 210 | 2.18 | 19.2% | 31868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 19.2% | 139 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.2% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 11 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.5% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 5 |
| fm.claire 1.7 | 5.8 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.0% | 4 |
| sample.SpinBot 1.0 | 7.5 | 7.4% | 3 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.8 | 22 / 35 | 5433 |
| 2 | 1 | 69.7 | 90.2 | 25 / 35 | 5396 |
| 3 | 1 | 69.5 | 90.5 | 26 / 35 | 5232 |
| 4 | 1 | 69.7 | 88.9 | 23 / 35 | 5444 |
| 5 | 1 | 68.0 | 85.4 | 21 / 35 | 5202 |
| 6 | 1 | 67.7 | 82.9 | 22 / 35 | 5161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 86% |
| oog.melee.CapuletDroid 1.1 | 41 | 76% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 22 | 31% | 26 |
| d414.nano.Quantum 1.0.0 | 20 | 28% | 79 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 41 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 15 |
| fm.claire 1.7 | 4 | 6% | 13 |
| kurios.DOSexe .9b | 3 | 4% | 12 |
| sample.SpinBot 1.0 | 3 | 4% | 11 |
| arthord.NanoSatanMelee Beta | 3 | 4% | 11 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.4 | 117 / 210 | 2.40 | 19.0% | 35530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 19.0% | 117 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.1% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 20 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 27 |
| DBall.Anarchy 0.1 | 5.0 | 9.1% | 7 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 5 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.2 | 18 / 35 | 5481 |
| 2 | 1 | 69.2 | 85.7 | 18 / 35 | 6164 |
| 3 | 1 | 71.7 | 93.3 | 27 / 35 | 6516 |
| 4 | 1 | 66.7 | 76.5 | 18 / 35 | 5483 |
| 5 | 1 | 67.0 | 77.1 | 15 / 35 | 5826 |
| 6 | 1 | 70.6 | 91.7 | 21 / 35 | 6060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 91% |
| mz.MicroGodMelee 1 | 45 | 62% |
| gh.micro.Gruweltje 0.7 | 35 | 49% |
| DBall.Anarchy 0.1 | 16 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 3 | 33% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 35 | 37% | 69 |
| gh.micro.Gruweltje 0.7 | 25 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 12 | 13% | 43 |
| fire219.CatBot 1.0 | 7 | 7% | 6 |
| acogdev.alpha 0.2 | 6 | 6% | 8 |
| el.JumpShoot 0.2 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 15 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.8 | 119 / 210 | 3.18 | 17.1% | 30978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.2 | 17.1% | 119 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.5% | 33 |
| germ.TheMind .2 | 4.3 | 9.8% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 9.3% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.7% | 5 |
| awesomeness.Elite 1.0 | 6.3 | 8.6% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 2 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.3 | 24 / 35 | 5709 |
| 2 | 1 | 66.3 | 77.8 | 20 / 35 | 5197 |
| 3 | 1 | 67.6 | 82.9 | 21 / 35 | 5441 |
| 4 | 2 | 62.7 | 67.3 | 15 / 35 | 4632 |
| 5 | 1 | 66.7 | 79.7 | 21 / 35 | 5292 |
| 6 | 1 | 62.7 | 65.7 | 18 / 35 | 4707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 81% |
| qualidafial.MajorDick 1.0.1 | 12 | 92% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 8 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 37 | 41% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 20% | 39 |
| qualidafial.MajorDick 1.0.1 | 9 | 10% | 14 |
| germ.TheMind .2 | 7 | 8% | 19 |
| awesomeness.Elite 1.0 | 6 | 7% | 17 |
| stelo.UntouchableNano 1.3 | 6 | 7% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.4 | 162 / 210 | 1.87 | 20.3% | 29959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 20.3% | 162 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.3 | 10.3% | 3 |
| maribo.IotaCT 1.1 | 4.8 | 10.1% | 6 |
| timmit.nano.TimDog 0.33 | 6.5 | 8.9% | 8 |
| ratosh.Wesco 1.4 | 7.7 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 0 |
| stelo.PatternRobot 1.0 | 7.8 | 7.8% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.0 | 27 / 35 | 5334 |
| 2 | 1 | 71.2 | 93.0 | 27 / 35 | 4944 |
| 3 | 1 | 69.9 | 87.3 | 25 / 35 | 4935 |
| 4 | 1 | 71.8 | 94.6 | 30 / 35 | 5029 |
| 5 | 1 | 69.7 | 86.7 | 23 / 35 | 5035 |
| 6 | 1 | 71.1 | 93.7 | 30 / 35 | 4682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 96% |
| nz.jdc.nano.GridFu 1.0 | 38 | 97% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 92% |
| maribo.IotaCT 1.1 | 12 | 83% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 8 | 63% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 27% | 60 |
| timmit.nano.TimDog 0.33 | 11 | 23% | 23 |
| ratosh.Wesco 1.4 | 7 | 15% | 16 |
| nz.jdc.nano.GridFu 1.0 | 6 | 13% | 51 |
| maribo.IotaCT 1.1 | 4 | 8% | 20 |
| stelo.PatternRobot 1.0 | 4 | 8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 15 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |

## Melee bench: F10

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.8 | 181 / 210 | 1.56 | 21.7% | 37935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 21.7% | 181 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 7 |
| baal.nano.N 1.42 | 3.2 | 11.5% | 4 |
| Grystrion.TrackerWO 1.0 | 3.8 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 5.5 | 8.8% | 4 |
| sanja.First 0.1 | 6.5 | 8.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.8% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.3% | 7 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.2% | 1 |
| sample.RamFire 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.6 | 31 / 35 | 6208 |
| 2 | 1 | 72.3 | 98.4 | 32 / 35 | 6177 |
| 3 | 1 | 73.2 | 96.2 | 32 / 35 | 6898 |
| 4 | 1 | 70.5 | 88.9 | 30 / 35 | 5950 |
| 5 | 1 | 70.3 | 87.6 | 27 / 35 | 6232 |
| 6 | 1 | 72.4 | 96.8 | 29 / 35 | 6470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 95% |
| tvv.nano.Polaris 1.2 | 42 | 95% |
| cvt.Firsty 1.0 | 23 | 91% |
| Grystrion.TrackerWO 1.0 | 22 | 100% |
| sanja.First 0.1 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 94% |
| zyx.micro.Ant 1.1 | 15 | 87% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 21% | 32 |
| baal.nano.N 1.42 | 6 | 18% | 31 |
| tvv.nano.Polaris 1.2 | 4 | 12% | 57 |
| sanja.First 0.1 | 3 | 9% | 26 |
| amk.Punbot.Punbot 0.01 | 3 | 9% | 9 |
| sample.RamFire 1.0 | 3 | 9% | 6 |
| cvt.Firsty 1.0 | 2 | 6% | 18 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 7 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.0 | 83 / 210 | 3.52 | 16.1% | 31683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 16.1% | 83 |
| kc.micro.Figment 1.0 | 2.2 | 14.6% | 65 |
| cs.Wren 1.0 | 3.2 | 12.8% | 21 |
| js.PinBall 1.6 | 4.0 | 11.6% | 11 |
| mz.Cork 0.1 | 4.7 | 11.1% | 14 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 6 |
| evd.X1 0.01 | 7.0 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.6% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.4 | 17 / 35 | 5200 |
| 2 | 1 | 67.0 | 80.0 | 15 / 35 | 5644 |
| 3 | 1 | 64.1 | 71.7 | 11 / 35 | 5373 |
| 4 | 1 | 61.3 | 61.6 | 10 / 35 | 5219 |
| 5 | 1 | 60.5 | 61.3 | 12 / 35 | 5067 |
| 6 | 1 | 66.2 | 78.1 | 18 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 47% |
| cs.Wren 1.0 | 25 | 96% |
| js.PinBall 1.6 | 15 | 73% |
| mz.Cork 0.1 | 14 | 93% |
| evd.X1 0.01 | 2 | 50% |
| PSW.Relentless 0.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 62 | 48% | 96 |
| js.PinBall 1.6 | 17 | 13% | 32 |
| joe.ADinosaur 1.0 | 14 | 11% | 14 |
| evd.X1 0.01 | 13 | 10% | 15 |
| cs.Wren 1.0 | 11 | 9% | 27 |
| mz.Cork 0.1 | 5 | 4% | 16 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| PSW.Relentless 0.1 | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.2 | 135 / 210 | 2.69 | 18.6% | 29306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 18.6% | 135 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 10.9% | 19 |
| myl.nano.Graviton 1.10 | 3.3 | 10.8% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.3% | 5 |
| ntc.Opposite 1.5 | 4.7 | 10.4% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.6% | 3 |
| disan.Chair 2.2.0 | 7.3 | 8.5% | 10 |
| donjezza.Muncho 1.0 | 9.3 | 6.5% | 12 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.5 | 19 / 35 | 4512 |
| 2 | 1 | 68.9 | 86.3 | 25 / 35 | 4987 |
| 3 | 1 | 66.5 | 77.5 | 21 / 35 | 4676 |
| 4 | 1 | 69.0 | 87.0 | 23 / 35 | 5056 |
| 5 | 1 | 67.5 | 79.7 | 21 / 35 | 4832 |
| 6 | 1 | 69.6 | 86.3 | 26 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 87% |
| myl.nano.Graviton 1.10 | 30 | 87% |
| DBall.NUKE 0.1 | 17 | 100% |
| donjezza.Muncho 1.0 | 14 | 86% |
| disan.Chair 2.2.0 | 14 | 86% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| ntc.Opposite 1.5 | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 22% | 48 |
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 28 |
| myl.nano.Graviton 1.10 | 8 | 10% | 36 |
| ntc.Opposite 1.5 | 8 | 10% | 14 |
| DBall.NUKE 0.1 | 6 | 8% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 17 |
| disan.Chair 2.2.0 | 3 | 4% | 9 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 41 over 6 battles (6.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.0 | 102 / 210 | 3.25 | 16.6% | 27766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 16.6% | 102 |
| oog.melee.Capulet 1.2 | 2.3 | 13.5% | 37 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.1% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.5% | 21 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 9 |
| stelo.MirrorNano 1.3 | 7.5 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 71.1 | 16 / 35 | 4291 |
| 2 | 1 | 66.7 | 78.1 | 16 / 35 | 4658 |
| 3 | 1 | 65.6 | 74.6 | 18 / 35 | 4674 |
| 4 | 1 | 66.1 | 76.5 | 18 / 35 | 4712 |
| 5 | 1 | 65.2 | 73.0 | 16 / 35 | 4588 |
| 6 | 1 | 66.5 | 76.5 | 18 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 63% |
| kawigi.micro.Shiz 1.1 | 29 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 83% |
| yagami.Tidus 0.11 | 21 | 95% |
| ejb.Polaris 1.0.1 | 8 | 63% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 49% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 10% | 36 |
| yagami.Tidus 0.11 | 11 | 10% | 25 |
| kawigi.micro.Shiz 1.1 | 10 | 9% | 28 |
| ejb.Polaris 1.0.1 | 10 | 9% | 21 |
| step.nanoPri 1.0 | 5 | 5% | 8 |
| stelo.MirrorNano 1.3 | 5 | 5% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.6 | 152 / 210 | 2.21 | 19.2% | 29437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 19.2% | 152 |
| wee.Gem 1.8.4 | 3.0 | 11.7% | 20 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 8 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 16 |
| ratosh.Nobo 0.21 | 4.5 | 10.7% | 5 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 6 |
| bayen.UbaMicro 1.4 | 6.5 | 8.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.1% | 0 |
| maribo.FollowFire 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 28 / 35 | 4996 |
| 2 | 1 | 67.1 | 81.3 | 22 / 35 | 4558 |
| 3 | 1 | 70.6 | 91.1 | 28 / 35 | 5366 |
| 4 | 1 | 69.9 | 89.5 | 27 / 35 | 5025 |
| 5 | 1 | 67.6 | 83.2 | 26 / 35 | 4687 |
| 6 | 1 | 67.4 | 82.9 | 21 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 50 | 94% |
| bzdp.Pansy 2.1 | 48 | 98% |
| wompi.Quokka 1.6 | 32 | 78% |
| m3thos.Eva00 1.1 | 15 | 100% |
| ratosh.Nobo 0.21 | 10 | 90% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 17 | 28% | 37 |
| m3thos.Eva00 1.1 | 9 | 15% | 25 |
| wee.Gem 1.8.4 | 7 | 12% | 58 |
| bzdp.Pansy 2.1 | 7 | 12% | 49 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 12% | 9 |
| bayen.UbaMicro 1.4 | 6 | 10% | 10 |
| maribo.FollowFire 1 | 5 | 8% | 5 |
| ratosh.Nobo 0.21 | 1 | 2% | 11 |
| stelo.MyAgileRobot 0.2 | 1 | 2% | 3 |

## Melee bench: F15

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.7 | 85 / 210 | 2.38 | 20.1% | 45912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.3 | 20.1% | 85 |
| wompi.Wallaby 5.1 | 1.7 | 19.1% | 109 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 15 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 1 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 82.2 | 13 / 35 | 7811 |
| 2 | 2 | 69.6 | 80.0 | 13 / 35 | 6887 |
| 3 | 1 | 71.3 | 87.3 | 18 / 35 | 7447 |
| 4 | 1 | 72.5 | 85.7 | 12 / 35 | 8473 |
| 5 | 2 | 69.8 | 84.1 | 12 / 35 | 7008 |
| 6 | 1 | 72.6 | 88.9 | 17 / 35 | 8286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 39% |
| exauge.GateKeeper 1.1.121g | 16 | 94% |
| mz.NanoGod 2.02 | 15 | 53% |
| ayk.WallHugger 1.0 | 7 | 86% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 89 | 70% | 145 |
| mz.NanoGod 2.02 | 23 | 18% | 35 |
| exauge.GateKeeper 1.1.121g | 9 | 7% | 13 |
| ayk.WallHugger 1.0 | 4 | 3% | 9 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.7 | 112 / 210 | 3.46 | 16.9% | 29344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 16.9% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.3% | 18 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.4% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.1% | 18 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.8% | 8 |
| conscience.Electron 1.3g | 7.3 | 8.3% | 5 |
| dl.BetterWalls 1.0 | 8.3 | 7.1% | 4 |
| ap.Frederick 1.1 | 8.5 | 7.2% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.5 | 20 / 35 | 5248 |
| 2 | 1 | 65.8 | 74.6 | 20 / 35 | 4927 |
| 3 | 1 | 63.9 | 67.6 | 18 / 35 | 4631 |
| 4 | 1 | 65.9 | 76.2 | 20 / 35 | 4805 |
| 5 | 1 | 65.7 | 76.5 | 17 / 35 | 4905 |
| 6 | 1 | 63.2 | 63.8 | 17 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 40 | 93% |
| voidious.micro.BlitzBat 1.05 | 36 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 83% |
| bvh.micro.Freya 0.3 | 18 | 67% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 18 | 18% | 24 |
| dummy.micro.Sparrow 2.5 | 15 | 15% | 42 |
| bvh.micro.Freya 0.3 | 15 | 15% | 28 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 39 |
| voidious.micro.BlitzBat 1.05 | 13 | 13% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 14 |
| dl.BetterWalls 1.0 | 8 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.8 | 165 / 210 | 1.91 | 22.0% | 44032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 22.0% | 165 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 17 |
| sul.Lunar 1.1 | 3.5 | 11.1% | 3 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.6% | 9 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.9% | 2 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.7% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 7 |
| sample.Corners 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.0 | 27 / 35 | 7740 |
| 2 | 1 | 73.3 | 93.0 | 29 / 35 | 7475 |
| 3 | 1 | 74.1 | 97.5 | 32 / 35 | 7791 |
| 4 | 1 | 71.4 | 85.4 | 25 / 35 | 7456 |
| 5 | 1 | 70.3 | 83.5 | 26 / 35 | 6685 |
| 6 | 1 | 71.2 | 86.7 | 26 / 35 | 6885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 59 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 53 | 92% |
| supersample.SuperBoxBot 1.0 | 24 | 100% |
| dsw.StaticD 1.0 | 14 | 64% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 11 | 23% | 63 |
| supersample.SuperBoxBot 1.0 | 10 | 21% | 33 |
| dsw.StaticD 1.0 | 10 | 21% | 24 |
| mme.NikeEnhanced 2.0 | 5 | 10% | 11 |
| sample.MyFirstRobot 1.0 | 4 | 8% | 8 |
| sul.Lunar 1.1 | 2 | 4% | 55 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 6 |
| sample.Corners 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.2 | 122 / 210 | 2.69 | 18.6% | 36687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGV 0.1 | 1.0 | 18.6% | 122 |
| radnor.DoctorBob 1.42 | 2.0 | 13.5% | 32 |
| mld.Wisdom 1.0 | 3.3 | 12.0% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 16 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 9 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.9% | 6 |
| sample.Walls 1.0 | 7.3 | 7.8% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.0 | 21 / 35 | 5933 |
| 2 | 1 | 68.0 | 79.7 | 20 / 35 | 6227 |
| 3 | 1 | 69.1 | 84.8 | 21 / 35 | 5912 |
| 4 | 1 | 67.2 | 76.8 | 21 / 35 | 5990 |
| 5 | 1 | 68.7 | 84.1 | 20 / 35 | 6135 |
| 6 | 1 | 68.4 | 81.9 | 19 / 35 | 6490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 62 | 95% |
| radnor.DoctorBob 1.42 | 27 | 78% |
| mld.Wisdom 1.0 | 19 | 68% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| amz.NanoClone 1.41 | 8 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 30% | 41 |
| radnor.DoctorBob 1.42 | 23 | 26% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 16% | 72 |
| KiraNL.Chupacabra 0.4 | 12 | 14% | 18 |
| GarmBox.Oranges 1.0 | 6 | 7% | 8 |
| jangs.ns51 1.0 | 4 | 5% | 8 |
| amz.NanoClone 1.41 | 2 | 2% | 10 |
| sample.Walls 1.0 | 1 | 1% | 3 |

