# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 89.2 | 154 / 210 | 1.97 | 21.9% | 43945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.9% | 154 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 14 |
| radnor.DoctorBob 1.42 | 3.0 | 13.5% | 17 |
| mld.Infinity 2.2 | 3.3 | 13.5% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 2 |
| sample.Walls 1.0 | 6.5 | 6.8% | 1 |
| jangs.ns51 1.0 | 7.2 | 5.8% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.9 | 24 / 35 | 6955 |
| 2 | 1 | 73.0 | 90.2 | 25 / 35 | 7339 |
| 3 | 1 | 71.4 | 83.2 | 25 / 35 | 7043 |
| 4 | 1 | 73.7 | 90.5 | 25 / 35 | 7819 |
| 5 | 1 | 72.0 | 87.3 | 26 / 35 | 6773 |
| 6 | 1 | 74.6 | 96.2 | 29 / 35 | 8016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 93% |
| mld.Infinity 2.2 | 46 | 98% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| jangs.ns51 1.0 | 4 | 50% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| arthord.MannyPacquiao Beta | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 39% | 62 |
| mz.AntiGrav 1.0 | 19 | 34% | 74 |
| mld.Infinity 2.2 | 6 | 11% | 48 |
| amz.NanoClone 1.41 | 6 | 11% | 11 |
| jangs.ns51 1.0 | 2 | 4% | 6 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 76.1 | 107 / 210 | 3.15 | 17.3% | 31482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.5 | 17.3% | 107 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.8% | 62 |
| mld.DustBunny 3.8 | 2.5 | 13.6% | 20 |
| maribo.melee.BMV 0.1 | 4.3 | 10.1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.3% | 6 |
| zyx.nano.Ant 1.1 | 6.0 | 8.9% | 4 |
| fullsail.SweetTea 1.1 | 7.2 | 7.6% | 2 |
| bzdp.BoxCar 2.0 | 7.7 | 7.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.3 | 6.9% | 5 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 21 / 35 | 5379 |
| 2 | 2 | 60.6 | 56.8 | 7 / 35 | 5023 |
| 3 | 3 | 59.4 | 50.5 | 8 / 35 | 5016 |
| 4 | 1 | 68.3 | 86.7 | 21 / 35 | 5180 |
| 5 | 1 | 68.8 | 85.4 | 23 / 35 | 5235 |
| 6 | 1 | 70.7 | 92.7 | 27 / 35 | 5649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 52 | 67% |
| mld.DustBunny 3.8 | 50 | 88% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 28% | 66 |
| mld.DustBunny 3.8 | 22 | 21% | 61 |
| zyx.nano.Ant 1.1 | 11 | 11% | 13 |
| cs.Grudge 1.0 | 11 | 11% | 12 |
| fullsail.SweetTea 1.1 | 8 | 8% | 14 |
| maribo.melee.BMV 0.1 | 8 | 8% | 12 |
| bzdp.BoxCar 2.0 | 7 | 7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 15 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.5 | 139 / 210 | 2.22 | 20.5% | 37377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.5% | 139 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.4% | 25 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.1% | 6 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.8% | 6 |
| fm.mammillarias 1.3 | 5.7 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.1 | 23 / 35 | 6311 |
| 2 | 1 | 70.9 | 84.4 | 22 / 35 | 6483 |
| 3 | 1 | 70.3 | 86.0 | 25 / 35 | 6048 |
| 4 | 1 | 72.2 | 90.2 | 28 / 35 | 6495 |
| 5 | 1 | 68.2 | 82.5 | 17 / 35 | 5639 |
| 6 | 1 | 70.5 | 84.4 | 24 / 35 | 6401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 47 | 77% |
| myl.micro.Troodon 1.10 | 40 | 93% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| myl.nano.KomoriNinja 1.1 | 14 | 100% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 10 | 90% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 30% | 56 |
| myl.micro.Troodon 1.10 | 19 | 27% | 66 |
| myl.nano.KomoriNinja 1.1 | 12 | 17% | 36 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 10 |
| fm.mammillarias 1.3 | 5 | 7% | 10 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 13 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 12 |
| sample.Fire 1.0 | 2 | 3% | 6 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.6 | 143 / 210 | 2.39 | 20.2% | 38876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.2% | 143 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.7% | 22 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 9 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.3% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.3% | 16 |
| yk.JahMicro 1.0 | 6.5 | 8.0% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.1% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 83.8 | 22 / 35 | 6351 |
| 2 | 1 | 71.1 | 86.7 | 24 / 35 | 6736 |
| 3 | 1 | 69.5 | 82.9 | 24 / 35 | 6428 |
| 4 | 1 | 69.5 | 84.4 | 24 / 35 | 6187 |
| 5 | 1 | 67.7 | 76.5 | 22 / 35 | 6227 |
| 6 | 1 | 72.5 | 93.0 | 27 / 35 | 6947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 73 | 92% |
| stelo.SoJNanoMelee 1.1 | 33 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 86% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| yk.JahMicro 1.0 | 7 | 86% |
| sample.VelociRobot 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 34% | 88 |
| stelo.SoJNanoMelee 1.1 | 12 | 18% | 32 |
| tj.zombie1n 1.0.1 | 12 | 18% | 15 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 31 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 21 |
| repositorio.NanoStep 1.0 | 3 | 4% | 6 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 4 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 63.9 | 78 / 210 | 4.25 | 15.0% | 28208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 15.0% | 78 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 44 |
| ahf.NanoAndrew .4 | 2.7 | 12.2% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 24 |
| sam.Samspin 1.0 | 5.2 | 9.9% | 14 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.7% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.5 | 13 / 35 | 4753 |
| 2 | 1 | 60.4 | 56.8 | 12 / 35 | 4756 |
| 3 | 1 | 60.4 | 59.0 | 11 / 35 | 4713 |
| 4 | 1 | 66.3 | 78.7 | 19 / 35 | 5016 |
| 5 | 1 | 61.0 | 60.3 | 13 / 35 | 4523 |
| 6 | 2 | 59.7 | 57.8 | 10 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 88% |
| ahf.NanoAndrew .4 | 23 | 78% |
| oog.melee.Corsair 1.0 | 21 | 43% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 17% | 47 |
| oog.melee.Corsair 1.0 | 22 | 17% | 34 |
| ahf.NanoAndrew .4 | 21 | 16% | 40 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 12% | 17 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 11 |
| sam.Samspin 1.0 | 11 | 8% | 18 |
| EBBU.Sim2 1.02 | 7 | 5% | 16 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.2 | 141 / 210 | 2.15 | 19.5% | 33018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.5% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 28 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.4% | 8 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.4% | 12 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 9 |
| fm.claire 1.7 | 6.5 | 8.1% | 2 |
| sample.SpinBot 1.0 | 8.5 | 6.6% | 2 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.4 | 25 / 35 | 5061 |
| 2 | 1 | 67.4 | 81.9 | 18 / 35 | 5350 |
| 3 | 1 | 69.8 | 88.3 | 23 / 35 | 5972 |
| 4 | 1 | 69.7 | 89.2 | 24 / 35 | 5616 |
| 5 | 1 | 69.5 | 88.9 | 24 / 35 | 5490 |
| 6 | 1 | 70.1 | 89.8 | 27 / 35 | 5529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 85% |
| oog.melee.CapuletDroid 1.1 | 38 | 97% |
| arthord.NanoSatanMelee Beta | 19 | 84% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| kurios.DOSexe .9b | 8 | 75% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 70 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 33% | 79 |
| arthord.NanoSatanMelee Beta | 12 | 17% | 20 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 42 |
| gh.nano.Grofvuil 0.2 | 8 | 11% | 24 |
| fm.claire 1.7 | 6 | 9% | 8 |
| sample.SpinBot 1.0 | 5 | 7% | 8 |
| kurios.DOSexe .9b | 4 | 6% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 12 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.8 | 115 / 210 | 2.64 | 18.7% | 35933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.7% | 115 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.3% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.3% | 23 |
| mz.MicroGodMelee 1 | 3.5 | 12.4% | 26 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.1% | 3 |
| acogdev.alpha 0.2 | 7.5 | 6.7% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.3% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.6 | 17 / 35 | 6249 |
| 2 | 1 | 68.3 | 81.3 | 21 / 35 | 5857 |
| 3 | 1 | 69.0 | 82.2 | 17 / 35 | 6240 |
| 4 | 1 | 67.4 | 79.7 | 18 / 35 | 5643 |
| 5 | 1 | 70.5 | 90.2 | 25 / 35 | 6148 |
| 6 | 1 | 67.1 | 76.8 | 17 / 35 | 5796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 92% |
| mz.MicroGodMelee 1 | 31 | 81% |
| gh.micro.Gruweltje 0.7 | 25 | 64% |
| DBall.Anarchy 0.1 | 12 | 100% |
| el.JumpShoot 0.2 | 7 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 33 | 35% | 61 |
| spinnercat.micro.Tyger 0.1 | 22 | 23% | 64 |
| mz.MicroGodMelee 1 | 22 | 23% | 45 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 3 | 3% | 15 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.6 | 102 / 210 | 3.56 | 16.6% | 31052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.3 | 16.6% | 102 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 5 |
| germ.TheMind .2 | 5.3 | 8.9% | 7 |
| awesomeness.Elite 1.0 | 5.7 | 9.1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.8% | 11 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 74.6 | 20 / 35 | 5359 |
| 2 | 1 | 65.6 | 75.2 | 16 / 35 | 5059 |
| 3 | 1 | 63.2 | 67.3 | 16 / 35 | 4846 |
| 4 | 2 | 65.8 | 74.3 | 16 / 35 | 5255 |
| 5 | 2 | 63.1 | 63.5 | 14 / 35 | 5169 |
| 6 | 1 | 66.3 | 74.6 | 20 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 88% |
| awesomeness.Elite 1.0 | 6 | 83% |
| germ.TheMind .2 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 44% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 20% | 34 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 13 |
| awesomeness.Elite 1.0 | 8 | 7% | 19 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 10 |
| germ.TheMind .2 | 5 | 5% | 11 |
| sample.Crazy 1.0 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.9 | 138 / 210 | 2.27 | 19.6% | 31671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.6% | 138 |
| rz.HawkOnFire 0.1 | 2.5 | 12.8% | 20 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.3% | 12 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 10 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.0% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.8% | 1 |
| stelo.PatternRobot 1.0 | 7.7 | 7.9% | 8 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 4 |
| ratosh.Wesco 1.4 | 8.2 | 7.9% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 84.1 | 23 / 35 | 5021 |
| 2 | 1 | 71.7 | 92.4 | 27 / 35 | 5903 |
| 3 | 1 | 68.1 | 81.3 | 22 / 35 | 5034 |
| 4 | 1 | 69.1 | 85.1 | 20 / 35 | 5002 |
| 5 | 1 | 71.2 | 91.7 | 26 / 35 | 5369 |
| 6 | 1 | 68.7 | 81.0 | 20 / 35 | 5342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 88% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| stelo.PatternRobot 1.0 | 15 | 73% |
| maribo.IotaCT 1.1 | 12 | 83% |
| ratosh.Wesco 1.4 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 22% | 58 |
| maribo.IotaCT 1.1 | 11 | 15% | 22 |
| stelo.PatternRobot 1.0 | 11 | 15% | 21 |
| timmit.nano.TimDog 0.33 | 9 | 13% | 27 |
| nz.jdc.nano.GridFu 1.0 | 8 | 11% | 43 |
| spinnercat.Omen 1.0 | 6 | 8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 8% | 13 |
| ratosh.Wesco 1.4 | 5 | 7% | 13 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.5 | 177 / 210 | 1.67 | 21.8% | 39757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.8% | 177 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 5 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 17 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.0% | 0 |
| zyx.micro.Ant 1.1 | 5.5 | 8.8% | 3 |
| sanja.First 0.1 | 6.0 | 8.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.1% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.5% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 30 / 35 | 6504 |
| 2 | 1 | 72.0 | 94.6 | 31 / 35 | 6506 |
| 3 | 1 | 71.3 | 88.3 | 29 / 35 | 6605 |
| 4 | 1 | 71.6 | 87.6 | 27 / 35 | 6865 |
| 5 | 1 | 72.3 | 95.2 | 28 / 35 | 6598 |
| 6 | 1 | 72.2 | 95.2 | 32 / 35 | 6679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 98% |
| tvv.nano.Polaris 1.2 | 35 | 100% |
| cvt.Firsty 1.0 | 33 | 91% |
| zyx.micro.Ant 1.1 | 21 | 95% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| sanja.First 0.1 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 9 | 27% | 57 |
| tvv.nano.Polaris 1.2 | 5 | 15% | 50 |
| Grystrion.TrackerWO 1.0 | 5 | 15% | 11 |
| zyx.micro.Ant 1.1 | 4 | 12% | 32 |
| cvt.Firsty 1.0 | 4 | 12% | 30 |
| sanja.First 0.1 | 3 | 9% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 6 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.1 | 87 / 210 | 3.51 | 16.2% | 32069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.3 | 16.2% | 87 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 61 |
| cs.Wren 1.0 | 3.3 | 12.6% | 23 |
| js.PinBall 1.6 | 4.3 | 11.0% | 12 |
| mz.Cork 0.1 | 4.5 | 10.7% | 14 |
| joe.ADinosaur 1.0 | 5.8 | 9.1% | 5 |
| evd.X1 0.01 | 7.2 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 7.0% | 4 |
| donjezza.Jezza 1.0 | 8.7 | 6.0% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 66.0 | 10 / 35 | 4806 |
| 2 | 2 | 59.5 | 59.7 | 8 / 35 | 5102 |
| 3 | 1 | 66.6 | 78.4 | 17 / 35 | 5601 |
| 4 | 1 | 66.2 | 76.8 | 18 / 35 | 5438 |
| 5 | 1 | 63.9 | 69.8 | 16 / 35 | 5231 |
| 6 | 1 | 67.9 | 81.9 | 18 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 74% |
| cs.Wren 1.0 | 27 | 85% |
| mz.Cork 0.1 | 12 | 75% |
| js.PinBall 1.6 | 5 | 80% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 39% | 99 |
| cs.Wren 1.0 | 19 | 15% | 34 |
| mz.Cork 0.1 | 16 | 13% | 25 |
| joe.ADinosaur 1.0 | 12 | 10% | 14 |
| js.PinBall 1.6 | 10 | 8% | 13 |
| PSW.Relentless 0.1 | 8 | 6% | 9 |
| evd.X1 0.01 | 6 | 5% | 7 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.8 | 139 / 210 | 2.46 | 19.2% | 30330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.2% | 139 |
| myl.nano.Graviton 1.10 | 2.5 | 11.7% | 16 |
| ntc.Opposite 1.5 | 3.2 | 10.9% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.9% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 10.0% | 11 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 9 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 25 / 35 | 4865 |
| 2 | 1 | 68.6 | 85.4 | 22 / 35 | 5023 |
| 3 | 1 | 67.7 | 81.6 | 22 / 35 | 4810 |
| 4 | 1 | 69.3 | 86.7 | 24 / 35 | 5334 |
| 5 | 1 | 68.8 | 83.5 | 22 / 35 | 5330 |
| 6 | 1 | 68.3 | 81.6 | 24 / 35 | 4968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 87% |
| myl.nano.Graviton 1.10 | 36 | 94% |
| DBall.NUKE 0.1 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 75% |
| ntc.Opposite 1.5 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| donjezza.Muncho 1.0 | 11 | 100% |
| disan.Chair 2.2.0 | 10 | 80% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 14 | 19% | 27 |
| stelo.AreaTargetingBot 1.1 | 13 | 18% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 18% | 27 |
| ntc.Opposite 1.5 | 12 | 17% | 28 |
| myl.nano.Graviton 1.10 | 9 | 13% | 44 |
| disan.Chair 2.2.0 | 6 | 8% | 14 |
| DBall.NUKE 0.1 | 4 | 6% | 17 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.9 | 76 / 210 | 3.53 | 15.8% | 27008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 15.8% | 76 |
| oog.melee.Capulet 1.2 | 2.3 | 13.8% | 47 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.2% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 24 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 15 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 14 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 70.8 | 10 / 35 | 4891 |
| 2 | 1 | 67.9 | 82.5 | 21 / 35 | 4767 |
| 3 | 1 | 62.3 | 61.9 | 12 / 35 | 4638 |
| 4 | 1 | 65.2 | 73.7 | 11 / 35 | 4500 |
| 5 | 1 | 64.6 | 74.6 | 11 / 35 | 4667 |
| 6 | 2 | 61.6 | 67.6 | 11 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 70% |
| kawigi.micro.Shiz 1.1 | 19 | 95% |
| yagami.Tidus 0.11 | 17 | 71% |
| ejb.Polaris 1.0.1 | 10 | 60% |
| stelo.MirrorNano 1.3 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 37% | 71 |
| yagami.Tidus 0.11 | 21 | 16% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 38 |
| ejb.Polaris 1.0.1 | 14 | 10% | 24 |
| kawigi.micro.Shiz 1.1 | 13 | 10% | 24 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| step.nanoPri 1.0 | 5 | 4% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.7 | 123 / 210 | 3.10 | 17.2% | 28885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.2% | 123 |
| bzdp.Pansy 2.1 | 3.0 | 12.3% | 17 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 31 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 19 |
| ratosh.Nobo 0.21 | 4.0 | 11.4% | 7 |
| m3thos.Eva00 1.1 | 6.3 | 9.2% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 8.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 25 / 35 | 5183 |
| 2 | 1 | 65.8 | 73.7 | 21 / 35 | 4883 |
| 3 | 1 | 62.0 | 68.3 | 17 / 35 | 3939 |
| 4 | 1 | 66.7 | 78.4 | 22 / 35 | 4973 |
| 5 | 1 | 65.3 | 74.0 | 19 / 35 | 4808 |
| 6 | 1 | 66.5 | 79.0 | 19 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 90% |
| wee.Gem 1.8.4 | 26 | 100% |
| wompi.Quokka 1.6 | 20 | 80% |
| ratosh.Nobo 0.21 | 11 | 91% |
| m3thos.Eva00 1.1 | 6 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 21% | 64 |
| maribo.FollowFire 1 | 14 | 16% | 15 |
| wompi.Quokka 1.6 | 11 | 13% | 27 |
| m3thos.Eva00 1.1 | 10 | 11% | 18 |
| ratosh.Nobo 0.21 | 10 | 11% | 18 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 7 |
| wee.Gem 1.8.4 | 5 | 6% | 43 |
| bayen.UbaMicro 1.4 | 4 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 87.9 | 122 / 210 | 2.09 | 21.2% | 47280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.2% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 64 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 19 |
| ayk.WallHugger 1.0 | 4.3 | 9.5% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.2% | 3 |
| stuff.Vlad 0.1 | 6.0 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 6.1% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 91.1 | 26 / 35 | 8242 |
| 2 | 1 | 72.5 | 88.6 | 21 / 35 | 7883 |
| 3 | 1 | 72.7 | 90.8 | 20 / 35 | 8118 |
| 4 | 1 | 73.4 | 91.4 | 23 / 35 | 8287 |
| 5 | 1 | 70.8 | 82.5 | 15 / 35 | 7238 |
| 6 | 1 | 71.0 | 83.2 | 17 / 35 | 7512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 76% |
| mz.NanoGod 2.02 | 21 | 76% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 47% | 127 |
| mz.NanoGod 2.02 | 30 | 34% | 49 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 18 |
| stelo.PianistNano 1.2 | 5 | 6% | 5 |
| ayk.WallHugger 1.0 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.9 | 95 / 210 | 3.89 | 15.8% | 28325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 15.8% | 95 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.0% | 24 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 24 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 21 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.5 | 7.9% | 5 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 11 |
| dl.BetterWalls 1.0 | 8.3 | 7.0% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 63.5 | 12 / 35 | 4826 |
| 2 | 1 | 60.9 | 63.2 | 13 / 35 | 4208 |
| 3 | 1 | 64.1 | 69.2 | 17 / 35 | 4866 |
| 4 | 1 | 65.8 | 75.6 | 18 / 35 | 4961 |
| 5 | 1 | 63.8 | 67.9 | 18 / 35 | 4736 |
| 6 | 1 | 63.5 | 68.3 | 17 / 35 | 4728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 85% |
| bvh.micro.Freya 0.3 | 21 | 95% |
| dummy.micro.Sparrow 2.5 | 15 | 73% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 17% | 20 |
| dummy.micro.Sparrow 2.5 | 19 | 17% | 32 |
| voidious.micro.BlitzBat 1.05 | 18 | 16% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 14% | 39 |
| conscience.Electron 1.3g | 13 | 11% | 18 |
| bvh.micro.Freya 0.3 | 11 | 10% | 23 |
| dl.BetterWalls 1.0 | 11 | 10% | 17 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.2 | 146 / 210 | 2.42 | 20.8% | 41534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.8% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 24 |
| sul.Lunar 1.1 | 3.5 | 11.1% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 14 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.5% | 6 |
| dsw.StaticD 1.0 | 5.3 | 8.7% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 1 |
| sample.Corners 1.0 | 8.7 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 85.1 | 25 / 35 | 7000 |
| 2 | 1 | 69.4 | 80.3 | 22 / 35 | 6675 |
| 3 | 1 | 71.5 | 84.4 | 25 / 35 | 7201 |
| 4 | 1 | 69.9 | 81.6 | 24 / 35 | 6735 |
| 5 | 1 | 71.2 | 84.8 | 25 / 35 | 6874 |
| 6 | 1 | 71.9 | 88.9 | 25 / 35 | 7049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 98% |
| sul.Lunar 1.1 | 37 | 97% |
| supersample.SuperBoxBot 1.0 | 22 | 95% |
| sample.Corners 1.0 | 13 | 92% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 28% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 20% | 66 |
| dsw.StaticD 1.0 | 13 | 20% | 22 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 12 |
| sul.Lunar 1.1 | 5 | 8% | 39 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 11 |
| sample.Corners 1.0 | 3 | 5% | 10 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.1 | 120 / 210 | 2.61 | 19.0% | 38944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.0% | 120 |
| mld.Wisdom 1.0 | 2.8 | 12.5% | 18 |
| radnor.DoctorBob 1.42 | 3.0 | 12.0% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.5% | 30 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.6% | 8 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 8 |
| sample.Walls 1.0 | 7.2 | 7.8% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 2 |
| jangs.ns51 1.0 | 9.0 | 5.8% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.4 | 19 / 35 | 6479 |
| 2 | 1 | 68.6 | 80.3 | 17 / 35 | 6817 |
| 3 | 1 | 67.7 | 77.8 | 20 / 35 | 6431 |
| 4 | 1 | 69.7 | 87.3 | 23 / 35 | 6198 |
| 5 | 1 | 70.5 | 86.3 | 24 / 35 | 6810 |
| 6 | 1 | 66.6 | 76.2 | 17 / 35 | 6209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 81% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| KiraNL.Chupacabra 0.4 | 16 | 100% |
| amz.NanoClone 1.41 | 14 | 79% |
| mld.Wisdom 1.0 | 12 | 58% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 30% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 22% | 59 |
| radnor.DoctorBob 1.42 | 15 | 17% | 43 |
| KiraNL.Chupacabra 0.4 | 15 | 17% | 34 |
| amz.NanoClone 1.41 | 8 | 9% | 21 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

