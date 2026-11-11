# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 83.5 | 133 / 210 | 2.49 | 19.8% | 39896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 19.8% | 133 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 39 |
| mz.AntiGrav 1.0 | 2.7 | 14.0% | 14 |
| mld.Infinity 2.2 | 3.8 | 12.9% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 4 |
| sample.Walls 1.0 | 6.3 | 7.8% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.5% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 82.9 | 20 / 35 | 6585 |
| 2 | 1 | 70.5 | 81.3 | 23 / 35 | 6896 |
| 3 | 1 | 72.7 | 91.1 | 27 / 35 | 7185 |
| 4 | 1 | 70.9 | 87.0 | 22 / 35 | 6819 |
| 5 | 1 | 68.7 | 77.1 | 20 / 35 | 6225 |
| 6 | 1 | 68.9 | 81.6 | 21 / 35 | 6186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 61 | 98% |
| mld.Infinity 2.2 | 31 | 100% |
| radnor.DoctorBob 1.42 | 29 | 66% |
| amz.NanoClone 1.41 | 12 | 92% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 29% | 55 |
| mz.AntiGrav 1.0 | 17 | 22% | 62 |
| amz.NanoClone 1.41 | 15 | 19% | 21 |
| mld.Infinity 2.2 | 10 | 13% | 44 |
| GarmBox.Oranges 1.0 | 5 | 6% | 8 |
| jangs.ns51 1.0 | 4 | 5% | 5 |
| sample.Walls 1.0 | 3 | 4% | 8 |
| arthord.MannyPacquiao Beta | 1 | 1% | 6 |

## Melee bench: F02

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.8 | 124 / 210 | 2.10 | 18.6% | 30840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 18.6% | 124 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.0% | 55 |
| mld.DustBunny 3.8 | 3.2 | 13.0% | 13 |
| maribo.melee.BMV 0.1 | 4.5 | 10.4% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.8% | 10 |
| bzdp.BoxCar 2.0 | 7.8 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.0% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.4 | 19 / 35 | 4477 |
| 2 | 1 | 68.9 | 88.9 | 23 / 35 | 5321 |
| 3 | 1 | 67.6 | 84.8 | 16 / 35 | 5458 |
| 4 | 1 | 69.6 | 93.7 | 23 / 35 | 5606 |
| 5 | 1 | 68.9 | 90.5 | 22 / 35 | 5170 |
| 6 | 1 | 67.7 | 84.4 | 21 / 35 | 4808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 65 | 69% |
| mld.DustBunny 3.8 | 50 | 90% |
| maribo.melee.BMV 0.1 | 11 | 73% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 37% | 86 |
| mld.DustBunny 3.8 | 22 | 26% | 57 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 17 |
| maribo.melee.BMV 0.1 | 7 | 8% | 12 |
| zyx.nano.Ant 1.1 | 6 | 7% | 10 |
| fullsail.SweetTea 1.1 | 5 | 6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 13 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |
| cs.Grudge 1.0 | 1 | 1% | 0 |

## Melee bench: F03

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 75.9 | 98 / 210 | 3.17 | 17.8% | 34557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 17.8% | 98 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.4% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.2% | 22 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 16 |
| fm.mammillarias 1.3 | 6.0 | 9.1% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 9 |
| sample.Fire 1.0 | 9.2 | 5.1% | 4 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 77.5 | 17 / 35 | 5690 |
| 2 | 1 | 68.7 | 81.3 | 20 / 35 | 5945 |
| 3 | 1 | 66.1 | 71.7 | 13 / 35 | 5903 |
| 4 | 1 | 65.5 | 73.3 | 14 / 35 | 5208 |
| 5 | 1 | 67.4 | 76.5 | 19 / 35 | 5765 |
| 6 | 1 | 67.1 | 74.9 | 15 / 35 | 6046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 35 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 79% |
| myl.nano.KomoriNinja 1.1 | 13 | 85% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 71% |
| sample.Fire 1.0 | 6 | 100% |
| fm.mammillarias 1.3 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 30 | 27% | 50 |
| myl.micro.Troodon 1.10 | 23 | 21% | 60 |
| myl.nano.KomoriNinja 1.1 | 17 | 15% | 36 |
| fm.mammillarias 1.3 | 17 | 15% | 22 |
| sp.Nanos.Ember 1.1 | 9 | 8% | 17 |
| cb.nano.Insomnia 1.0 | 8 | 7% | 10 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 5 |
| sample.Fire 1.0 | 2 | 2% | 10 |

## Melee bench: F04

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.4 | 148 / 210 | 2.05 | 20.6% | 38849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 20.6% | 148 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 24 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.7% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.5 | 9.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.3% | 17 |
| tj.zombie1n 1.0.1 | 6.0 | 8.3% | 2 |
| yk.JahMicro 1.0 | 6.2 | 8.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 6.7% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.3 | 23 / 35 | 5849 |
| 2 | 1 | 70.1 | 86.0 | 23 / 35 | 6604 |
| 3 | 1 | 71.2 | 90.2 | 27 / 35 | 6713 |
| 4 | 1 | 71.1 | 91.1 | 26 / 35 | 6616 |
| 5 | 1 | 68.8 | 81.6 | 24 / 35 | 6100 |
| 6 | 1 | 72.2 | 94.0 | 25 / 35 | 6967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 83% |
| stelo.SoJNanoMelee 1.1 | 43 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 94% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 37% | 87 |
| stelo.SoJNanoMelee 1.1 | 15 | 24% | 36 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 28 |
| tj.zombie1n 1.0.1 | 7 | 11% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 20 |
| repositorio.NanoStep 1.0 | 2 | 3% | 9 |
| yk.JahMicro 1.0 | 2 | 3% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.9 | 89 / 210 | 3.80 | 15.6% | 28375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 15.6% | 89 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 35 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.8% | 21 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 9.5% | 4 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.4% | 16 |
| sam.Samspin 1.0 | 6.7 | 8.8% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.6 | 16 / 35 | 5038 |
| 2 | 1 | 63.6 | 69.2 | 17 / 35 | 5003 |
| 3 | 1 | 61.3 | 68.9 | 13 / 35 | 4222 |
| 4 | 1 | 64.4 | 72.4 | 17 / 35 | 5175 |
| 5 | 1 | 62.8 | 65.7 | 15 / 35 | 4592 |
| 6 | 1 | 60.5 | 61.9 | 11 / 35 | 4345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 83% |
| oog.melee.Corsair 1.0 | 32 | 75% |
| ahf.NanoAndrew .4 | 16 | 81% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 23 | 19% | 33 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 46 |
| oog.melee.Corsair 1.0 | 16 | 13% | 39 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 20 |
| ahf.NanoAndrew .4 | 13 | 11% | 25 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 11 |
| sam.Samspin 1.0 | 7 | 6% | 12 |
| sample.TrackFire 1.0 | 7 | 6% | 8 |

## Melee bench: F06

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.4 | 118 / 210 | 2.49 | 18.3% | 30536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 18.3% | 118 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 40 |
| gh.nano.Grofvuil 0.2 | 3.2 | 10.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.3% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 6 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.0% | 3 |
| fm.claire 1.7 | 6.8 | 8.0% | 3 |
| sample.SpinBot 1.0 | 7.2 | 7.9% | 4 |
| pa.Improved 1.0 | 9.2 | 5.9% | 3 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.8 | 23 / 35 | 5235 |
| 2 | 1 | 67.9 | 84.4 | 19 / 35 | 5269 |
| 3 | 1 | 68.0 | 84.4 | 19 / 35 | 5334 |
| 4 | 1 | 65.9 | 80.3 | 16 / 35 | 4917 |
| 5 | 1 | 65.9 | 80.0 | 19 / 35 | 4599 |
| 6 | 1 | 68.9 | 86.7 | 22 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 77% |
| oog.melee.CapuletDroid 1.1 | 25 | 100% |
| arthord.NanoSatanMelee Beta | 16 | 94% |
| sample.SpinBot 1.0 | 7 | 100% |
| gh.nano.Grofvuil 0.2 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 50% |
| fm.claire 1.7 | 3 | 67% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 38% | 78 |
| oog.melee.CapuletDroid 1.1 | 14 | 15% | 41 |
| arthord.NanoSatanMelee Beta | 12 | 13% | 25 |
| gh.nano.Grofvuil 0.2 | 10 | 11% | 19 |
| fm.claire 1.7 | 7 | 8% | 10 |
| sample.SpinBot 1.0 | 6 | 7% | 8 |
| kurios.DOSexe .9b | 5 | 5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 12 |
| pa.Improved 1.0 | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 76.6 | 82 / 210 | 3.11 | 17.1% | 33544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 17.1% | 82 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 32 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 30 |
| DBall.Anarchy 0.1 | 5.0 | 9.0% | 15 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 5 |
| acogdev.alpha 0.2 | 8.2 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 5 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.2 | 12 / 35 | 5710 |
| 2 | 1 | 64.4 | 72.1 | 15 / 35 | 5035 |
| 3 | 1 | 66.6 | 78.1 | 13 / 35 | 5521 |
| 4 | 1 | 68.0 | 81.9 | 17 / 35 | 5951 |
| 5 | 1 | 67.0 | 79.0 | 14 / 35 | 5814 |
| 6 | 1 | 64.7 | 72.1 | 11 / 35 | 5513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 74% |
| mz.MicroGodMelee 1 | 36 | 69% |
| gh.micro.Gruweltje 0.7 | 24 | 50% |
| DBall.Anarchy 0.1 | 9 | 89% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 27% | 58 |
| spinnercat.micro.Tyger 0.1 | 33 | 26% | 58 |
| gh.micro.Gruweltje 0.7 | 33 | 26% | 49 |
| caimano.Furia_Ceca 0.22 | 12 | 9% | 13 |
| DBall.Anarchy 0.1 | 6 | 5% | 13 |
| acogdev.alpha 0.2 | 4 | 3% | 6 |
| el.JumpShoot 0.2 | 3 | 2% | 7 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 71.2 | 100 / 210 | 3.60 | 15.9% | 28791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.5 | 15.9% | 100 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.4% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.2% | 27 |
| germ.TheMind .2 | 5.0 | 9.9% | 9 |
| qualidafial.MajorDick 1.0.1 | 6.0 | 9.2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.9% | 3 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 13 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.5% | 10 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.4 | 19 / 35 | 5243 |
| 2 | 3 | 59.6 | 61.3 | 13 / 35 | 4081 |
| 3 | 1 | 68.2 | 82.9 | 21 / 35 | 5700 |
| 4 | 2 | 62.1 | 67.3 | 14 / 35 | 4289 |
| 5 | 1 | 60.2 | 61.6 | 13 / 35 | 4486 |
| 6 | 1 | 67.0 | 82.5 | 20 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 90% |
| germ.TheMind .2 | 10 | 70% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 8 | 50% |
| lrem.micro.MoggFanatic 0.2 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 7 | 43% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 36 | 32% | 79 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 18% | 39 |
| germ.TheMind .2 | 17 | 15% | 24 |
| stelo.UntouchableNano 1.3 | 13 | 12% | 22 |
| awesomeness.Elite 1.0 | 12 | 11% | 18 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 12 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.7 | 139 / 210 | 2.10 | 19.5% | 30422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 19.5% | 139 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.6% | 10 |
| maribo.IotaCT 1.1 | 4.2 | 10.9% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 4 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.0% | 7 |
| ratosh.Wesco 1.4 | 7.2 | 8.6% | 9 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 8.0% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.7 | 21 / 35 | 5024 |
| 2 | 1 | 70.5 | 90.8 | 26 / 35 | 5422 |
| 3 | 1 | 70.7 | 90.5 | 22 / 35 | 5335 |
| 4 | 1 | 69.7 | 88.6 | 25 / 35 | 4665 |
| 5 | 1 | 70.7 | 90.8 | 25 / 35 | 5337 |
| 6 | 1 | 66.7 | 79.0 | 20 / 35 | 4639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 92% |
| nz.jdc.nano.GridFu 1.0 | 31 | 100% |
| stelo.PatternRobot 1.0 | 18 | 78% |
| maribo.IotaCT 1.1 | 14 | 93% |
| spinnercat.Omen 1.0 | 12 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| ratosh.Wesco 1.4 | 7 | 57% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 18 | 25% | 29 |
| rz.HawkOnFire 0.1 | 17 | 24% | 62 |
| timmit.nano.TimDog 0.33 | 12 | 17% | 27 |
| ratosh.Wesco 1.4 | 12 | 17% | 19 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 38 |
| maribo.IotaCT 1.1 | 3 | 4% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 8 |
| spinnercat.Omen 1.0 | 0 | 0% | 8 |

## Melee bench: F10

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.8 | 140 / 210 | 2.37 | 19.6% | 36642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 19.6% | 140 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.5% | 30 |
| baal.nano.N 1.42 | 3.3 | 10.8% | 7 |
| zyx.micro.Ant 1.1 | 4.0 | 10.4% | 18 |
| Grystrion.TrackerWO 1.0 | 6.0 | 9.0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.7% | 5 |
| cvt.Firsty 1.0 | 7.0 | 7.8% | 5 |
| sanja.First 0.1 | 7.3 | 8.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.7% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.6 | 26 / 35 | 5874 |
| 2 | 1 | 71.4 | 93.7 | 28 / 35 | 6544 |
| 3 | 1 | 69.1 | 87.6 | 24 / 35 | 6077 |
| 4 | 1 | 68.0 | 79.7 | 21 / 35 | 6003 |
| 5 | 1 | 65.0 | 73.0 | 17 / 35 | 5482 |
| 6 | 1 | 70.3 | 87.0 | 24 / 35 | 6662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 93% |
| cvt.Firsty 1.0 | 25 | 96% |
| baal.nano.N 1.42 | 21 | 100% |
| sanja.First 0.1 | 17 | 100% |
| zyx.micro.Ant 1.1 | 17 | 88% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 89% |
| amk.Punbot.Punbot 0.01 | 8 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 35 | 50% | 49 |
| baal.nano.N 1.42 | 7 | 10% | 26 |
| tvv.nano.Polaris 1.2 | 6 | 9% | 50 |
| cvt.Firsty 1.0 | 6 | 9% | 29 |
| squidM.TentalceMeleeNano 1.1 | 5 | 7% | 13 |
| Grystrion.TrackerWO 1.0 | 4 | 6% | 13 |
| sanja.First 0.1 | 3 | 4% | 20 |
| sample.RamFire 1.0 | 3 | 4% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 5 |

## Melee bench: F11

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 64.6 | 75 / 210 | 4.19 | 14.6% | 29679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.1% | 64 |
| hadur117.micro.SaorCEW 0.1 | 1.8 | 14.6% | 75 |
| cs.Wren 1.0 | 3.0 | 12.7% | 24 |
| js.PinBall 1.6 | 4.5 | 11.2% | 19 |
| mz.Cork 0.1 | 4.5 | 11.0% | 13 |
| joe.ADinosaur 1.0 | 6.2 | 9.6% | 7 |
| evd.X1 0.01 | 6.7 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 63.8 | 16 / 35 | 4824 |
| 2 | 2 | 60.6 | 59.0 | 13 / 35 | 4997 |
| 3 | 1 | 65.2 | 74.6 | 15 / 35 | 5240 |
| 4 | 1 | 62.1 | 65.7 | 9 / 35 | 5213 |
| 5 | 2 | 59.6 | 58.4 | 11 / 35 | 4600 |
| 6 | 3 | 61.8 | 66.0 | 11 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 71% |
| cs.Wren 1.0 | 25 | 80% |
| js.PinBall 1.6 | 7 | 71% |
| joe.ADinosaur 1.0 | 3 | 100% |
| mz.Cork 0.1 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 42% | 96 |
| cs.Wren 1.0 | 19 | 14% | 34 |
| evd.X1 0.01 | 19 | 14% | 22 |
| js.PinBall 1.6 | 16 | 12% | 20 |
| joe.ADinosaur 1.0 | 10 | 7% | 13 |
| mz.Cork 0.1 | 6 | 4% | 10 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |

## Melee bench: F12

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.8 | 115 / 210 | 2.72 | 18.0% | 28932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 18.0% | 115 |
| ntc.Opposite 1.5 | 3.0 | 11.8% | 16 |
| myl.nano.Graviton 1.10 | 3.7 | 11.2% | 20 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.6% | 24 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.4% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.8% | 4 |
| disan.Chair 2.2.0 | 6.7 | 8.7% | 10 |
| DBall.NUKE 0.1 | 7.8 | 7.6% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.1 | 16 / 35 | 4640 |
| 2 | 1 | 67.1 | 78.1 | 19 / 35 | 5306 |
| 3 | 1 | 65.9 | 75.6 | 20 / 35 | 4761 |
| 4 | 1 | 66.4 | 79.7 | 20 / 35 | 4443 |
| 5 | 1 | 67.4 | 82.5 | 19 / 35 | 5034 |
| 6 | 1 | 67.8 | 85.1 | 21 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 86% |
| stelo.AreaTargetingBot 1.1 | 30 | 87% |
| ntc.Opposite 1.5 | 16 | 69% |
| DBall.NUKE 0.1 | 12 | 92% |
| disan.Chair 2.2.0 | 11 | 82% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 19% | 44 |
| pfvicm.Sobieski 7.2.3b | 18 | 19% | 25 |
| stelo.AreaTargetingBot 1.1 | 17 | 18% | 40 |
| ntc.Opposite 1.5 | 16 | 16% | 32 |
| disan.Chair 2.2.0 | 10 | 10% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 15 |
| pbg.R2D2 1.0 | 4 | 4% | 4 |
| donjezza.Muncho 1.0 | 3 | 3% | 13 |
| DBall.NUKE 0.1 | 2 | 2% | 13 |

## Melee bench: F13

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.9 | 75 / 210 | 3.53 | 15.5% | 26285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.5 | 15.5% | 75 |
| oog.melee.Capulet 1.2 | 2.7 | 13.8% | 61 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 26 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 9 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 4 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 67.0 | 9 / 35 | 4173 |
| 2 | 3 | 60.8 | 61.6 | 12 / 35 | 4089 |
| 3 | 1 | 62.2 | 66.0 | 11 / 35 | 4318 |
| 4 | 1 | 67.6 | 82.5 | 16 / 35 | 4912 |
| 5 | 1 | 63.4 | 71.4 | 9 / 35 | 4084 |
| 6 | 1 | 67.4 | 82.9 | 18 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 54% |
| kawigi.micro.Shiz 1.1 | 26 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 78% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 135 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 42% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 17% | 41 |
| yagami.Tidus 0.11 | 19 | 14% | 27 |
| ejb.Polaris 1.0.1 | 13 | 10% | 22 |
| step.nanoPri 1.0 | 9 | 7% | 10 |
| kawigi.micro.Shiz 1.1 | 8 | 6% | 28 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.4 | 133 / 210 | 2.76 | 17.6% | 27138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 17.6% | 133 |
| wee.Gem 1.8.4 | 2.8 | 12.1% | 28 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 19 |
| wompi.Quokka 1.6 | 4.0 | 11.0% | 11 |
| ratosh.Nobo 0.21 | 4.2 | 11.0% | 10 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 4 |
| bayen.UbaMicro 1.4 | 7.0 | 9.2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.0 | 21 / 35 | 4467 |
| 2 | 1 | 69.6 | 90.2 | 27 / 35 | 4986 |
| 3 | 1 | 64.0 | 71.1 | 21 / 35 | 4437 |
| 4 | 1 | 67.1 | 81.9 | 23 / 35 | 4633 |
| 5 | 1 | 66.2 | 82.2 | 23 / 35 | 4220 |
| 6 | 1 | 64.9 | 76.2 | 18 / 35 | 4395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 91% |
| wee.Gem 1.8.4 | 35 | 91% |
| wompi.Quokka 1.6 | 22 | 86% |
| m3thos.Eva00 1.1 | 16 | 100% |
| ratosh.Nobo 0.21 | 15 | 87% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 13 | 17% | 27 |
| ratosh.Nobo 0.21 | 12 | 16% | 29 |
| wee.Gem 1.8.4 | 11 | 14% | 45 |
| bzdp.Pansy 2.1 | 11 | 14% | 44 |
| maribo.FollowFire 1 | 10 | 13% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 12 |
| bayen.UbaMicro 1.4 | 5 | 6% | 21 |
| m3thos.Eva00 1.1 | 4 | 5% | 18 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 91.1 | 141 / 210 | 1.80 | 21.8% | 45675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 21.8% | 141 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 47 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 16 |
| ayk.WallHugger 1.0 | 4.7 | 9.3% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 5 |
| stuff.Vlad 0.1 | 5.5 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 88.3 | 24 / 35 | 7264 |
| 2 | 1 | 72.3 | 87.9 | 24 / 35 | 7525 |
| 3 | 1 | 73.7 | 93.0 | 24 / 35 | 7873 |
| 4 | 1 | 73.4 | 90.8 | 22 / 35 | 7854 |
| 5 | 1 | 73.2 | 93.3 | 22 / 35 | 7254 |
| 6 | 1 | 74.0 | 93.0 | 25 / 35 | 7905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 82% |
| mz.NanoGod 2.02 | 16 | 69% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 44% | 131 |
| mz.NanoGod 2.02 | 25 | 36% | 42 |
| ayk.WallHugger 1.0 | 6 | 9% | 12 |
| exauge.GateKeeper 1.1.121g | 5 | 7% | 10 |
| stuff.Vlad 0.1 | 2 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.7 | 99 / 210 | 3.73 | 16.0% | 28581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 16.0% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 25 |
| bvh.micro.Freya 0.3 | 3.3 | 11.9% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.4% | 22 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 8 |
| conscience.Electron 1.3g | 6.7 | 8.8% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.1 | 19 / 35 | 5174 |
| 2 | 1 | 66.1 | 78.1 | 19 / 35 | 4676 |
| 3 | 1 | 66.7 | 77.8 | 22 / 35 | 5119 |
| 4 | 1 | 59.7 | 59.7 | 10 / 35 | 4263 |
| 5 | 1 | 59.9 | 55.9 | 14 / 35 | 4582 |
| 6 | 1 | 63.1 | 69.5 | 15 / 35 | 4767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 92% |
| bvh.micro.Freya 0.3 | 28 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| dummy.micro.Sparrow 2.5 | 20 | 85% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 23 | 21% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 18% | 21 |
| voidious.micro.BlitzBat 1.05 | 15 | 14% | 51 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 14% | 35 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 26 |
| bvh.micro.Freya 0.3 | 10 | 9% | 24 |
| stelo.MirrorMicro 1.0 | 9 | 8% | 16 |
| dl.BetterWalls 1.0 | 6 | 5% | 10 |

## Melee bench: F17

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.9 | 143 / 210 | 2.18 | 20.8% | 41638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 20.8% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 17 |
| sul.Lunar 1.1 | 3.5 | 11.1% | 13 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 15 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 8 |
| dsw.StaticD 1.0 | 6.0 | 8.4% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.5% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 6 |
| sample.Corners 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.1 | 28 / 35 | 6711 |
| 2 | 1 | 70.4 | 85.7 | 23 / 35 | 6669 |
| 3 | 1 | 72.2 | 88.3 | 24 / 35 | 7832 |
| 4 | 1 | 69.2 | 80.3 | 20 / 35 | 6879 |
| 5 | 1 | 71.8 | 88.9 | 27 / 35 | 7078 |
| 6 | 1 | 70.2 | 86.3 | 21 / 35 | 6469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 91% |
| sul.Lunar 1.1 | 37 | 100% |
| supersample.SuperBoxBot 1.0 | 26 | 85% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 31% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 25% | 58 |
| mme.NikeEnhanced 2.0 | 11 | 16% | 18 |
| dsw.StaticD 1.0 | 7 | 10% | 18 |
| sul.Lunar 1.1 | 4 | 6% | 43 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 6 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorCEW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.3 | 109 / 210 | 2.77 | 18.2% | 36908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEW 0.1 | 1.0 | 18.2% | 109 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.0% | 29 |
| mld.Wisdom 1.0 | 3.5 | 12.2% | 18 |
| amz.NanoClone 1.41 | 5.2 | 9.9% | 14 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.4% | 7 |
| GarmBox.Oranges 1.0 | 7.5 | 7.4% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 4 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.4 | 17 / 35 | 5802 |
| 2 | 1 | 65.5 | 75.6 | 18 / 35 | 5257 |
| 3 | 1 | 69.6 | 87.6 | 18 / 35 | 6719 |
| 4 | 1 | 65.4 | 73.0 | 15 / 35 | 6070 |
| 5 | 1 | 69.5 | 85.4 | 21 / 35 | 6602 |
| 6 | 1 | 68.2 | 81.0 | 20 / 35 | 6458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 78% |
| radnor.DoctorBob 1.42 | 45 | 87% |
| mld.Wisdom 1.0 | 17 | 47% |
| amz.NanoClone 1.41 | 13 | 77% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 38% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 20% | 58 |
| radnor.DoctorBob 1.42 | 13 | 13% | 57 |
| amz.NanoClone 1.41 | 12 | 12% | 20 |
| KiraNL.Chupacabra 0.4 | 5 | 5% | 8 |
| jangs.ns51 1.0 | 5 | 5% | 7 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |

