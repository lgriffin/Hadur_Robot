# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.9 | 145 / 210 | 2.18 | 20.8% | 42007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.8% | 145 |
| radnor.DoctorBob 1.42 | 2.5 | 14.7% | 26 |
| mz.AntiGrav 1.0 | 3.0 | 13.4% | 17 |
| mld.Infinity 2.2 | 3.5 | 13.4% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 4 |
| sample.Walls 1.0 | 6.2 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.2 | 27 / 35 | 7467 |
| 2 | 1 | 73.3 | 92.1 | 28 / 35 | 7352 |
| 3 | 1 | 69.3 | 80.6 | 19 / 35 | 6548 |
| 4 | 1 | 71.3 | 87.3 | 23 / 35 | 6872 |
| 5 | 1 | 72.4 | 90.2 | 27 / 35 | 7115 |
| 6 | 1 | 70.3 | 81.9 | 21 / 35 | 6653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 93% |
| mld.Infinity 2.2 | 43 | 86% |
| radnor.DoctorBob 1.42 | 36 | 86% |
| amz.NanoClone 1.41 | 8 | 88% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 40% | 65 |
| mld.Infinity 2.2 | 13 | 20% | 42 |
| mz.AntiGrav 1.0 | 10 | 15% | 66 |
| amz.NanoClone 1.41 | 4 | 6% | 12 |
| sample.Walls 1.0 | 4 | 6% | 9 |
| GarmBox.Oranges 1.0 | 4 | 6% | 5 |
| jangs.ns51 1.0 | 3 | 5% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 5 |

## Melee bench: F02

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.4 | 120 / 210 | 2.68 | 17.9% | 30782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 17.9% | 120 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 50 |
| mld.DustBunny 3.8 | 2.5 | 14.1% | 19 |
| maribo.melee.BMV 0.1 | 4.8 | 9.6% | 3 |
| djdjdj.NanoSkunk10 1.0 | 4.8 | 9.3% | 7 |
| zyx.nano.Ant 1.1 | 5.8 | 8.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.0% | 9 |
| bzdp.BoxCar 2.0 | 8.3 | 6.7% | 1 |
| fullsail.SweetTea 1.1 | 8.8 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.0 | 20 / 35 | 4686 |
| 2 | 1 | 70.5 | 95.2 | 23 / 35 | 5358 |
| 3 | 1 | 69.8 | 91.1 | 27 / 35 | 5540 |
| 4 | 3 | 56.6 | 46.0 | 6 / 35 | 4560 |
| 5 | 1 | 68.2 | 86.0 | 19 / 35 | 5506 |
| 6 | 1 | 69.5 | 90.8 | 25 / 35 | 5132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 58 | 83% |
| oog.melee.Mercutio 1.0 | 57 | 74% |
| djdjdj.NanoSkunk10 1.0 | 12 | 100% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 30 | 33% | 82 |
| oog.melee.Mercutio 1.0 | 26 | 29% | 66 |
| cs.Grudge 1.0 | 11 | 12% | 13 |
| zyx.nano.Ant 1.1 | 6 | 7% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 12 |
| maribo.melee.BMV 0.1 | 4 | 4% | 7 |
| bzdp.BoxCar 2.0 | 4 | 4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 8 |

## Melee bench: F03

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.0 | 140 / 210 | 2.35 | 20.2% | 37904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.2% | 140 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 28 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.7% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 9.9% | 17 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 4 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 4 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |
| sample.Fire 1.0 | 9.5 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 80.6 | 20 / 35 | 6125 |
| 2 | 1 | 70.4 | 85.7 | 22 / 35 | 6196 |
| 3 | 1 | 72.7 | 92.4 | 25 / 35 | 7057 |
| 4 | 1 | 69.5 | 84.1 | 22 / 35 | 5822 |
| 5 | 1 | 70.1 | 81.6 | 26 / 35 | 6421 |
| 6 | 1 | 70.3 | 85.4 | 25 / 35 | 6283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 74% |
| cb.nano.Insomnia 1.0 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 16 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 24% | 38 |
| myl.micro.Troodon 1.10 | 12 | 17% | 61 |
| cb.nano.Insomnia 1.0 | 12 | 17% | 20 |
| fm.mammillarias 1.3 | 12 | 17% | 17 |
| myl.nano.KomoriNinja 1.1 | 8 | 11% | 37 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 10 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 20 |
| sample.Tracker 1.0 | 2 | 3% | 3 |
| sample.Fire 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.4 | 148 / 210 | 2.14 | 20.7% | 40596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.7% | 148 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.2% | 15 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.5% | 11 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 9.8% | 17 |
| tj.zombie1n 1.0.1 | 4.5 | 9.6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.9% | 1 |
| yk.JahMicro 1.0 | 7.0 | 7.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.6% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 84.1 | 23 / 35 | 6523 |
| 2 | 1 | 68.2 | 79.7 | 18 / 35 | 6600 |
| 3 | 1 | 71.4 | 91.1 | 27 / 35 | 6791 |
| 4 | 1 | 71.2 | 89.8 | 27 / 35 | 6807 |
| 5 | 1 | 71.4 | 90.2 | 27 / 35 | 7085 |
| 6 | 1 | 70.9 | 89.2 | 26 / 35 | 6790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 91% |
| stelo.SoJNanoMelee 1.1 | 53 | 83% |
| tj.zombie1n 1.0.1 | 18 | 72% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 93% |
| tvv.micro.Antares 1.1.1 | 9 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 39% | 84 |
| stelo.SoJNanoMelee 1.1 | 18 | 29% | 49 |
| tj.zombie1n 1.0.1 | 9 | 15% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 21 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.5 | 90 / 210 | 3.65 | 16.0% | 28960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.0% | 90 |
| oog.melee.Corsair 1.0 | 2.7 | 13.0% | 47 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 26 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 23 |
| sam.Samspin 1.0 | 5.5 | 9.8% | 12 |
| EBBU.Sim2 1.02 | 5.7 | 9.6% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 68.6 | 17 / 35 | 4925 |
| 2 | 1 | 63.1 | 71.1 | 15 / 35 | 4512 |
| 3 | 1 | 64.0 | 73.3 | 15 / 35 | 4628 |
| 4 | 1 | 64.5 | 73.3 | 13 / 35 | 5163 |
| 5 | 1 | 63.4 | 68.6 | 15 / 35 | 5037 |
| 6 | 1 | 63.6 | 68.3 | 15 / 35 | 4695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 90% |
| oog.melee.Corsair 1.0 | 30 | 43% |
| sam.Samspin 1.0 | 22 | 95% |
| ahf.NanoAndrew .4 | 20 | 65% |
| EBBU.Sim2 1.02 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 0% |

Hadur died in 120 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 23% | 43 |
| ahf.NanoAndrew .4 | 20 | 17% | 32 |
| simonton.nano.MeleeSeed 1.8 | 19 | 16% | 51 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 20 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 10 |
| EBBU.Sim2 1.02 | 8 | 7% | 12 |
| sam.Samspin 1.0 | 4 | 3% | 23 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.9 | 139 / 210 | 2.36 | 19.2% | 32800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.2% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.4% | 13 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.4% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.0% | 6 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 4 |
| fm.claire 1.7 | 6.8 | 8.6% | 1 |
| sample.SpinBot 1.0 | 7.3 | 8.2% | 6 |
| pa.Improved 1.0 | 9.3 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.8 | 22 / 35 | 5355 |
| 2 | 1 | 65.7 | 74.9 | 20 / 35 | 5006 |
| 3 | 1 | 70.5 | 92.4 | 23 / 35 | 5962 |
| 4 | 1 | 69.1 | 84.4 | 25 / 35 | 5568 |
| 5 | 1 | 71.2 | 94.6 | 28 / 35 | 5686 |
| 6 | 1 | 66.7 | 79.0 | 21 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 84% |
| oog.melee.CapuletDroid 1.1 | 28 | 100% |
| arthord.NanoSatanMelee Beta | 17 | 94% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| sample.SpinBot 1.0 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 33% | 83 |
| gh.nano.Grofvuil 0.2 | 13 | 18% | 28 |
| winamp32.micro.MicroMacro 1.0 | 8 | 11% | 16 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 15 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 36 |
| fm.claire 1.7 | 5 | 7% | 7 |
| kurios.DOSexe .9b | 4 | 6% | 10 |
| sample.SpinBot 1.0 | 3 | 4% | 12 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.6 | 115 / 210 | 2.56 | 18.5% | 34585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.5% | 115 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 14.6% | 32 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.3% | 26 |
| mz.MicroGodMelee 1 | 4.0 | 12.6% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 2 |
| acogdev.alpha 0.2 | 7.5 | 6.7% | 1 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 75.6 | 19 / 35 | 5855 |
| 2 | 1 | 68.4 | 84.4 | 18 / 35 | 5567 |
| 3 | 1 | 69.0 | 85.7 | 17 / 35 | 6063 |
| 4 | 1 | 67.7 | 82.2 | 20 / 35 | 5414 |
| 5 | 1 | 69.2 | 84.1 | 21 / 35 | 5977 |
| 6 | 1 | 68.2 | 83.8 | 20 / 35 | 5709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 83% |
| mz.MicroGodMelee 1 | 44 | 68% |
| gh.micro.Gruweltje 0.7 | 26 | 65% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 28 | 29% | 59 |
| spinnercat.micro.Tyger 0.1 | 26 | 27% | 66 |
| gh.micro.Gruweltje 0.7 | 20 | 21% | 44 |
| acogdev.alpha 0.2 | 8 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 7 |
| DBall.Anarchy 0.1 | 0 | 0% | 9 |

## Melee bench: F08

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.9 | 103 / 210 | 3.44 | 16.9% | 31491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 16.9% | 103 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.9% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.3% | 5 |
| germ.TheMind .2 | 5.2 | 9.2% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 5 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 3 |
| sample.Crazy 1.0 | 8.8 | 7.2% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.7 | 15 / 35 | 5114 |
| 2 | 1 | 65.7 | 73.3 | 13 / 35 | 5676 |
| 3 | 1 | 66.4 | 74.6 | 17 / 35 | 5743 |
| 4 | 2 | 61.1 | 60.6 | 17 / 35 | 4310 |
| 5 | 1 | 69.3 | 85.4 | 22 / 35 | 5693 |
| 6 | 1 | 65.3 | 71.7 | 19 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 72% |
| germ.TheMind .2 | 10 | 90% |
| awesomeness.Elite 1.0 | 9 | 78% |
| sample.Crazy 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 41% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 21% | 39 |
| germ.TheMind .2 | 16 | 15% | 26 |
| sample.Crazy 1.0 | 6 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| awesomeness.Elite 1.0 | 4 | 4% | 9 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.6 | 151 / 210 | 1.84 | 20.2% | 30497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.2% | 151 |
| rz.HawkOnFire 0.1 | 2.0 | 13.4% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.8% | 13 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 5 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.9% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.7 | 8.2% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 7.6% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 28 / 35 | 5217 |
| 2 | 1 | 70.5 | 91.4 | 27 / 35 | 4588 |
| 3 | 1 | 69.4 | 86.0 | 22 / 35 | 4715 |
| 4 | 1 | 71.5 | 92.4 | 28 / 35 | 5471 |
| 5 | 1 | 70.3 | 90.8 | 24 / 35 | 5159 |
| 6 | 1 | 69.9 | 90.2 | 22 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 91% |
| nz.jdc.nano.GridFu 1.0 | 36 | 100% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| ratosh.Wesco 1.4 | 13 | 77% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| maribo.IotaCT 1.1 | 8 | 88% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 27% | 60 |
| stelo.PatternRobot 1.0 | 11 | 19% | 25 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 22 |
| ratosh.Wesco 1.4 | 9 | 15% | 24 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 46 |
| maribo.IotaCT 1.1 | 4 | 7% | 12 |
| spinnercat.Omen 1.0 | 3 | 5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 12 |

## Melee bench: F10

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.2 | 180 / 210 | 1.52 | 22.1% | 39951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 22.1% | 180 |
| baal.nano.N 1.42 | 2.7 | 11.0% | 8 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 9.1% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 1 |
| cvt.Firsty 1.0 | 7.0 | 7.8% | 4 |
| sanja.First 0.1 | 7.0 | 8.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.7 | 6.9% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 28 / 35 | 6428 |
| 2 | 1 | 72.6 | 94.9 | 30 / 35 | 6998 |
| 3 | 1 | 72.1 | 95.2 | 30 / 35 | 6502 |
| 4 | 1 | 73.3 | 97.5 | 34 / 35 | 7018 |
| 5 | 1 | 72.2 | 93.7 | 28 / 35 | 6967 |
| 6 | 1 | 71.3 | 90.8 | 30 / 35 | 6038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 85% |
| cvt.Firsty 1.0 | 35 | 97% |
| tvv.nano.Polaris 1.2 | 33 | 97% |
| zyx.micro.Ant 1.1 | 22 | 91% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 27% | 33 |
| baal.nano.N 1.42 | 6 | 20% | 42 |
| tvv.nano.Polaris 1.2 | 4 | 13% | 53 |
| cvt.Firsty 1.0 | 4 | 13% | 30 |
| Grystrion.TrackerWO 1.0 | 3 | 10% | 17 |
| sanja.First 0.1 | 3 | 10% | 14 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 9 |
| sample.RamFire 1.0 | 1 | 3% | 3 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.4 | 92 / 210 | 3.58 | 16.3% | 32629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 16.3% | 92 |
| kc.micro.Figment 1.0 | 2.5 | 13.8% | 46 |
| cs.Wren 1.0 | 3.0 | 12.9% | 27 |
| js.PinBall 1.6 | 4.0 | 11.2% | 13 |
| mz.Cork 0.1 | 4.3 | 11.6% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 7 |
| evd.X1 0.01 | 7.0 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 5.4% | 7 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.1 | 20 / 35 | 5978 |
| 2 | 1 | 65.1 | 74.0 | 15 / 35 | 5280 |
| 3 | 2 | 62.4 | 65.7 | 12 / 35 | 5143 |
| 4 | 1 | 64.6 | 71.4 | 16 / 35 | 5320 |
| 5 | 1 | 63.9 | 70.2 | 11 / 35 | 5543 |
| 6 | 1 | 64.4 | 68.9 | 18 / 35 | 5365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 78% |
| cs.Wren 1.0 | 25 | 72% |
| mz.Cork 0.1 | 15 | 93% |
| js.PinBall 1.6 | 7 | 71% |
| joe.ADinosaur 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| PSW.Relentless 0.1 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 39% | 95 |
| cs.Wren 1.0 | 24 | 20% | 36 |
| joe.ADinosaur 1.0 | 15 | 13% | 17 |
| evd.X1 0.01 | 12 | 10% | 14 |
| js.PinBall 1.6 | 7 | 6% | 16 |
| mz.Cork 0.1 | 6 | 5% | 20 |
| PSW.Relentless 0.1 | 6 | 5% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.8 | 137 / 210 | 2.46 | 19.3% | 31236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.3% | 137 |
| ntc.Opposite 1.5 | 2.8 | 11.4% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.5% | 10 |
| myl.nano.Graviton 1.10 | 3.7 | 10.9% | 14 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.7% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 4 |
| disan.Chair 2.2.0 | 6.3 | 8.8% | 7 |
| DBall.NUKE 0.1 | 8.0 | 7.6% | 2 |
| donjezza.Muncho 1.0 | 8.8 | 6.7% | 13 |
| pbg.R2D2 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.9 | 22 / 35 | 5066 |
| 2 | 1 | 70.1 | 87.6 | 24 / 35 | 5843 |
| 3 | 1 | 66.0 | 77.1 | 20 / 35 | 4522 |
| 4 | 1 | 70.4 | 85.7 | 29 / 35 | 5654 |
| 5 | 1 | 69.3 | 89.5 | 22 / 35 | 4960 |
| 6 | 1 | 67.6 | 79.7 | 20 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 89% |
| stelo.AreaTargetingBot 1.1 | 26 | 73% |
| ntc.Opposite 1.5 | 23 | 96% |
| disan.Chair 2.2.0 | 21 | 95% |
| DBall.NUKE 0.1 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 16 | 22% | 33 |
| myl.nano.Graviton 1.10 | 15 | 21% | 48 |
| stelo.AreaTargetingBot 1.1 | 11 | 15% | 25 |
| pfvicm.Sobieski 7.2.3b | 11 | 15% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 8% | 22 |
| disan.Chair 2.2.0 | 5 | 7% | 20 |
| DBall.NUKE 0.1 | 4 | 5% | 16 |
| donjezza.Muncho 1.0 | 3 | 4% | 14 |
| pbg.R2D2 1.0 | 2 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.4 | 81 / 210 | 3.58 | 15.6% | 26591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 15.6% | 81 |
| oog.melee.Capulet 1.2 | 2.5 | 14.1% | 47 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 22 |
| yagami.Tidus 0.11 | 4.5 | 11.6% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 63.5 | 12 / 35 | 4234 |
| 2 | 1 | 67.6 | 83.2 | 16 / 35 | 4810 |
| 3 | 2 | 62.0 | 65.1 | 12 / 35 | 4246 |
| 4 | 1 | 64.1 | 73.3 | 12 / 35 | 4199 |
| 5 | 1 | 65.6 | 74.6 | 15 / 35 | 4459 |
| 6 | 1 | 64.3 | 68.6 | 14 / 35 | 4643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 50% |
| kawigi.micro.Shiz 1.1 | 26 | 92% |
| yagami.Tidus 0.11 | 18 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 93% |
| ejb.Polaris 1.0.1 | 9 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 43% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 19% | 36 |
| kawigi.micro.Shiz 1.1 | 19 | 15% | 35 |
| yagami.Tidus 0.11 | 14 | 11% | 31 |
| ejb.Polaris 1.0.1 | 10 | 8% | 22 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 1 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.9 | 141 / 210 | 2.45 | 18.5% | 28457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.5% | 141 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 17 |
| wee.Gem 1.8.4 | 3.5 | 11.2% | 24 |
| ratosh.Nobo 0.21 | 3.5 | 11.2% | 8 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 5 |
| bayen.UbaMicro 1.4 | 6.8 | 8.4% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.4% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 24 / 35 | 4348 |
| 2 | 1 | 66.4 | 79.4 | 19 / 35 | 4849 |
| 3 | 1 | 67.7 | 84.1 | 23 / 35 | 4537 |
| 4 | 1 | 69.7 | 89.5 | 28 / 35 | 5120 |
| 5 | 1 | 66.2 | 78.4 | 21 / 35 | 4824 |
| 6 | 1 | 68.7 | 87.0 | 26 / 35 | 4779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 91% |
| wee.Gem 1.8.4 | 35 | 100% |
| ratosh.Nobo 0.21 | 23 | 83% |
| wompi.Quokka 1.6 | 19 | 95% |
| m3thos.Eva00 1.1 | 13 | 92% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 18% | 59 |
| ratosh.Nobo 0.21 | 10 | 14% | 19 |
| wompi.Quokka 1.6 | 9 | 13% | 25 |
| bayen.UbaMicro 1.4 | 8 | 11% | 13 |
| m3thos.Eva00 1.1 | 7 | 10% | 21 |
| maribo.FollowFire 1 | 7 | 10% | 8 |
| wee.Gem 1.8.4 | 6 | 8% | 44 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 9 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 8 |

## Melee bench: F15

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.6 | 123 / 210 | 2.20 | 20.8% | 44739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.8% | 123 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 63 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 20 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.5 | 9.0% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.8% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.9 | 18 / 35 | 7724 |
| 2 | 1 | 70.7 | 83.8 | 18 / 35 | 6763 |
| 3 | 1 | 70.2 | 79.4 | 19 / 35 | 7436 |
| 4 | 1 | 71.4 | 85.4 | 18 / 35 | 7254 |
| 5 | 1 | 74.1 | 93.7 | 27 / 35 | 7941 |
| 6 | 1 | 72.6 | 89.5 | 23 / 35 | 7621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 101 | 76% |
| mz.NanoGod 2.02 | 14 | 86% |
| ayk.WallHugger 1.0 | 9 | 89% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 51% | 129 |
| mz.NanoGod 2.02 | 23 | 26% | 36 |
| ayk.WallHugger 1.0 | 8 | 9% | 14 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 13 |
| stuff.Vlad 0.1 | 3 | 3% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.9 | 110 / 210 | 2.99 | 17.4% | 29626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 17.4% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 31 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 22 |
| bvh.micro.Freya 0.3 | 3.7 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.9% | 3 |
| conscience.Electron 1.3g | 6.8 | 7.9% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 6.1% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 6.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 18 / 35 | 5305 |
| 2 | 1 | 66.9 | 77.5 | 20 / 35 | 5281 |
| 3 | 1 | 66.3 | 79.7 | 20 / 35 | 4599 |
| 4 | 1 | 63.7 | 70.5 | 16 / 35 | 4639 |
| 5 | 1 | 65.8 | 78.1 | 16 / 35 | 4780 |
| 6 | 1 | 66.5 | 77.8 | 20 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 84% |
| dummy.micro.Sparrow 2.5 | 31 | 84% |
| bvh.micro.Freya 0.3 | 29 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 73% |
| stelo.MirrorMicro 1.0 | 10 | 80% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 27% | 58 |
| dummy.micro.Sparrow 2.5 | 20 | 20% | 51 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 11% | 31 |
| conscience.Electron 1.3g | 11 | 11% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 11% | 11 |
| bvh.micro.Freya 0.3 | 10 | 10% | 27 |
| dl.BetterWalls 1.0 | 6 | 6% | 9 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.7 | 148 / 210 | 2.29 | 21.1% | 41661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.1% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.1% | 11 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.4% | 8 |
| dsw.StaticD 1.0 | 5.5 | 9.0% | 8 |
| tlp.ThreeLeggedPig 1 | 7.7 | 7.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.0 | 6.4% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 0 |
| sample.Corners 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 85.4 | 27 / 35 | 6884 |
| 2 | 1 | 72.6 | 87.9 | 26 / 35 | 7325 |
| 3 | 1 | 70.7 | 84.8 | 23 / 35 | 6820 |
| 4 | 1 | 71.6 | 87.3 | 24 / 35 | 7021 |
| 5 | 1 | 70.2 | 82.9 | 23 / 35 | 6570 |
| 6 | 1 | 71.2 | 85.7 | 25 / 35 | 7041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 96% |
| sul.Lunar 1.1 | 37 | 97% |
| supersample.SuperBoxBot 1.0 | 24 | 100% |
| mme.NikeEnhanced 2.0 | 15 | 87% |
| dsw.StaticD 1.0 | 14 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 25% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 22% | 61 |
| dsw.StaticD 1.0 | 11 | 17% | 22 |
| mme.NikeEnhanced 2.0 | 10 | 16% | 23 |
| sul.Lunar 1.1 | 5 | 8% | 43 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 11 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 3 |
| sample.Corners 1.0 | 1 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.2 | 114 / 210 | 2.79 | 18.2% | 36495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.2% | 114 |
| mld.Wisdom 1.0 | 2.5 | 12.9% | 32 |
| radnor.DoctorBob 1.42 | 3.0 | 12.5% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.8% | 13 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.9% | 4 |
| amz.NanoClone 1.41 | 5.7 | 10.1% | 15 |
| sample.Walls 1.0 | 6.8 | 8.3% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.8% | 3 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 71.7 | 12 / 35 | 5379 |
| 2 | 1 | 65.7 | 75.6 | 14 / 35 | 5795 |
| 3 | 1 | 68.3 | 81.3 | 20 / 35 | 6222 |
| 4 | 1 | 68.4 | 82.9 | 21 / 35 | 6024 |
| 5 | 1 | 69.4 | 84.4 | 24 / 35 | 6591 |
| 6 | 1 | 69.4 | 85.1 | 23 / 35 | 6484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 88% |
| radnor.DoctorBob 1.42 | 27 | 78% |
| mld.Wisdom 1.0 | 23 | 70% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| amz.NanoClone 1.41 | 8 | 75% |
| sample.Walls 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 29% | 48 |
| radnor.DoctorBob 1.42 | 17 | 18% | 46 |
| amz.NanoClone 1.41 | 16 | 17% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 14% | 52 |
| KiraNL.Chupacabra 0.4 | 10 | 10% | 15 |
| sample.Walls 1.0 | 6 | 6% | 9 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |

