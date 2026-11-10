# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 88.1 | 145 / 210 | 2.07 | 21.4% | 44574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.4% | 145 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 33 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 11 |
| mld.Infinity 2.2 | 3.5 | 12.8% | 18 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 1 |
| sample.Walls 1.0 | 6.5 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 7.2% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 82.5 | 22 / 35 | 6867 |
| 2 | 1 | 73.2 | 90.5 | 27 / 35 | 7736 |
| 3 | 1 | 72.8 | 87.0 | 23 / 35 | 8354 |
| 4 | 1 | 72.6 | 90.2 | 27 / 35 | 7384 |
| 5 | 1 | 71.7 | 88.6 | 23 / 35 | 6881 |
| 6 | 1 | 72.6 | 89.8 | 23 / 35 | 7352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 98% |
| mld.Infinity 2.2 | 45 | 87% |
| radnor.DoctorBob 1.42 | 34 | 79% |
| amz.NanoClone 1.41 | 7 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 45% | 65 |
| mld.Infinity 2.2 | 13 | 20% | 59 |
| mz.AntiGrav 1.0 | 12 | 18% | 66 |
| sample.Walls 1.0 | 4 | 6% | 5 |
| amz.NanoClone 1.41 | 3 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.3 | 123 / 210 | 2.50 | 18.7% | 34144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 18.7% | 123 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.9% | 55 |
| mld.DustBunny 3.8 | 3.7 | 12.9% | 12 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 4.8 | 9.4% | 7 |
| zyx.nano.Ant 1.1 | 6.3 | 8.3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.5% | 7 |
| fullsail.SweetTea 1.1 | 8.0 | 6.4% | 1 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.7 | 22 / 35 | 5592 |
| 2 | 1 | 69.0 | 88.9 | 23 / 35 | 5424 |
| 3 | 1 | 69.8 | 88.6 | 23 / 35 | 6102 |
| 4 | 1 | 69.8 | 90.2 | 23 / 35 | 6084 |
| 5 | 1 | 68.6 | 87.6 | 19 / 35 | 5509 |
| 6 | 2 | 62.8 | 57.8 | 13 / 35 | 5433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 73% |
| mld.DustBunny 3.8 | 50 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 75% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 34% | 85 |
| mld.DustBunny 3.8 | 18 | 20% | 57 |
| maribo.melee.BMV 0.1 | 10 | 11% | 13 |
| zyx.nano.Ant 1.1 | 8 | 9% | 10 |
| bzdp.BoxCar 2.0 | 6 | 7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| fullsail.SweetTea 1.1 | 4 | 5% | 8 |
| cs.Grudge 1.0 | 4 | 5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 15 |

## Melee bench: F03

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 82.6 | 135 / 210 | 2.57 | 19.8% | 37411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.8% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 13.5% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.3% | 18 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.4% | 10 |
| fm.mammillarias 1.3 | 6.0 | 8.9% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 6 |
| sample.Fire 1.0 | 9.3 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 86.7 | 22 / 35 | 6632 |
| 2 | 1 | 70.2 | 81.6 | 23 / 35 | 6828 |
| 3 | 1 | 67.7 | 76.2 | 20 / 35 | 5773 |
| 4 | 1 | 70.9 | 86.7 | 26 / 35 | 6381 |
| 5 | 1 | 69.5 | 83.8 | 22 / 35 | 6098 |
| 6 | 1 | 68.4 | 80.6 | 22 / 35 | 5699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 88% |
| cb.nano.Insomnia 1.0 | 20 | 90% |
| sp.Nanos.Ember 1.1 | 15 | 87% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 24% | 54 |
| cb.nano.Insomnia 1.0 | 16 | 21% | 21 |
| myl.micro.Troodon 1.10 | 12 | 16% | 50 |
| fm.mammillarias 1.3 | 10 | 13% | 13 |
| myl.nano.KomoriNinja 1.1 | 8 | 11% | 36 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 12 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 15 |
| sample.Fire 1.0 | 2 | 3% | 8 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.8 | 158 / 210 | 1.83 | 21.4% | 40417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.4% | 158 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 16 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 6 |
| tj.zombie1n 1.0.1 | 4.5 | 9.3% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.0% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.3% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 6 |
| yk.JahMicro 1.0 | 7.5 | 7.3% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.8% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 86.7 | 23 / 35 | 6273 |
| 2 | 1 | 68.6 | 84.1 | 22 / 35 | 5853 |
| 3 | 1 | 72.0 | 92.4 | 26 / 35 | 6970 |
| 4 | 1 | 72.1 | 92.7 | 27 / 35 | 6914 |
| 5 | 1 | 71.4 | 89.8 | 27 / 35 | 6794 |
| 6 | 1 | 74.4 | 99.0 | 33 / 35 | 7613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 72 | 88% |
| stelo.SoJNanoMelee 1.1 | 43 | 93% |
| tj.zombie1n 1.0.1 | 23 | 83% |
| tvv.micro.Antares 1.1.1 | 15 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 87% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 43% | 90 |
| stelo.SoJNanoMelee 1.1 | 8 | 15% | 29 |
| tj.zombie1n 1.0.1 | 8 | 15% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 21 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 26 |
| repositorio.NanoStep 1.0 | 2 | 4% | 13 |
| yk.JahMicro 1.0 | 2 | 4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 3 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.9 | 97 / 210 | 3.80 | 16.0% | 29542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.0% | 97 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 29 |
| ahf.NanoAndrew .4 | 3.3 | 11.1% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.8% | 25 |
| EBBU.Sim2 1.02 | 5.5 | 9.9% | 5 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 8.9% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.2 | 18 / 35 | 5039 |
| 2 | 1 | 66.0 | 74.6 | 21 / 35 | 4998 |
| 3 | 1 | 63.7 | 69.2 | 17 / 35 | 4818 |
| 4 | 1 | 67.5 | 78.1 | 19 / 35 | 5542 |
| 5 | 1 | 61.5 | 64.8 | 12 / 35 | 4673 |
| 6 | 1 | 58.8 | 56.8 | 10 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 89% |
| oog.melee.Corsair 1.0 | 28 | 64% |
| ahf.NanoAndrew .4 | 16 | 94% |
| sam.Samspin 1.0 | 12 | 100% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 21% | 43 |
| simonton.nano.MeleeSeed 1.8 | 17 | 15% | 48 |
| robar.nano.Assertive_Melee 0.2 | 17 | 15% | 22 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| ahf.NanoAndrew .4 | 12 | 11% | 27 |
| EBBU.Sim2 1.02 | 12 | 11% | 23 |
| sam.Samspin 1.0 | 3 | 3% | 9 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.9 | 141 / 210 | 2.18 | 19.6% | 33473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.6% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 8 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.6% | 4 |
| fm.claire 1.7 | 6.8 | 8.0% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 3 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.3 | 29 / 35 | 5441 |
| 2 | 1 | 69.2 | 87.0 | 22 / 35 | 5521 |
| 3 | 1 | 67.9 | 83.5 | 19 / 35 | 5369 |
| 4 | 1 | 69.3 | 87.3 | 25 / 35 | 5529 |
| 5 | 1 | 69.1 | 83.5 | 21 / 35 | 5926 |
| 6 | 1 | 69.8 | 86.7 | 25 / 35 | 5687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 82% |
| oog.melee.CapuletDroid 1.1 | 31 | 100% |
| gh.nano.Grofvuil 0.2 | 19 | 89% |
| arthord.NanoSatanMelee Beta | 17 | 94% |
| sample.SpinBot 1.0 | 9 | 100% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 35% | 76 |
| gh.nano.Grofvuil 0.2 | 16 | 23% | 38 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 41 |
| arthord.NanoSatanMelee Beta | 9 | 13% | 20 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 8 |
| fm.claire 1.7 | 3 | 4% | 7 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.9 | 104 / 210 | 2.54 | 18.5% | 34513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.5% | 104 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.2% | 31 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 30 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 7 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.8% | 5 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 0 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.4 | 18 / 35 | 5719 |
| 2 | 1 | 67.6 | 82.2 | 14 / 35 | 5616 |
| 3 | 1 | 70.3 | 87.3 | 21 / 35 | 6545 |
| 4 | 1 | 69.3 | 87.9 | 21 / 35 | 5615 |
| 5 | 1 | 66.4 | 76.2 | 14 / 35 | 5547 |
| 6 | 1 | 67.4 | 79.0 | 16 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 75% |
| mz.MicroGodMelee 1 | 36 | 61% |
| gh.micro.Gruweltje 0.7 | 24 | 67% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 32% | 59 |
| spinnercat.micro.Tyger 0.1 | 28 | 26% | 63 |
| gh.micro.Gruweltje 0.7 | 19 | 18% | 40 |
| DBall.Anarchy 0.1 | 6 | 6% | 15 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| el.JumpShoot 0.2 | 3 | 3% | 8 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 67.2 | 101 / 210 | 3.95 | 15.7% | 29421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.3 | 15.7% | 101 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 36 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 9 |
| germ.TheMind .2 | 5.3 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.8% | 4 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 5 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.8% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 67.0 | 18 / 35 | 4838 |
| 2 | 1 | 62.6 | 64.8 | 18 / 35 | 4737 |
| 3 | 2 | 63.8 | 66.3 | 14 / 35 | 5065 |
| 4 | 2 | 59.9 | 57.5 | 11 / 35 | 4678 |
| 5 | 1 | 65.8 | 74.0 | 19 / 35 | 5069 |
| 6 | 1 | 65.3 | 74.0 | 21 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 71% |
| germ.TheMind .2 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 45% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 13% | 30 |
| germ.TheMind .2 | 9 | 8% | 17 |
| awesomeness.Elite 1.0 | 9 | 8% | 12 |
| stelo.UntouchableNano 1.3 | 8 | 7% | 11 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 9 |
| mym.EdgeStalker 1.0 | 6 | 5% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.2 | 151 / 210 | 2.06 | 20.2% | 31982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.2% | 151 |
| rz.HawkOnFire 0.1 | 2.3 | 13.5% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.7% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.1% | 11 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.6% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.1% | 3 |
| stelo.PatternRobot 1.0 | 7.7 | 7.9% | 4 |
| ratosh.Wesco 1.4 | 7.7 | 8.0% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 7.6% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.3 | 25 / 35 | 5220 |
| 2 | 1 | 70.4 | 89.2 | 25 / 35 | 5042 |
| 3 | 1 | 68.7 | 82.9 | 22 / 35 | 5405 |
| 4 | 1 | 71.0 | 89.8 | 25 / 35 | 5482 |
| 5 | 1 | 72.1 | 92.4 | 28 / 35 | 5673 |
| 6 | 1 | 70.6 | 87.6 | 26 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 90% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| spinnercat.Omen 1.0 | 12 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 60% |
| maribo.IotaCT 1.1 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| ratosh.Wesco 1.4 | 6 | 83% |

Hadur died in 59 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 31% | 59 |
| timmit.nano.TimDog 0.33 | 12 | 20% | 22 |
| stelo.PatternRobot 1.0 | 6 | 10% | 21 |
| ratosh.Wesco 1.4 | 6 | 10% | 11 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 9 |
| maribo.IotaCT 1.1 | 4 | 7% | 21 |
| spinnercat.Omen 1.0 | 3 | 5% | 15 |

## Melee bench: F10

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.6 | 180 / 210 | 1.49 | 22.4% | 41555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 22.4% | 180 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.6% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.4% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 0 |
| zyx.micro.Ant 1.1 | 5.0 | 9.3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.2% | 1 |
| sanja.First 0.1 | 6.8 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.2 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 6.6% | 3 |
| sample.RamFire 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 28 / 35 | 6600 |
| 2 | 1 | 73.3 | 97.8 | 32 / 35 | 7110 |
| 3 | 1 | 72.4 | 94.3 | 31 / 35 | 6646 |
| 4 | 1 | 73.2 | 96.5 | 31 / 35 | 7187 |
| 5 | 1 | 72.8 | 95.6 | 31 / 35 | 6913 |
| 6 | 1 | 71.9 | 89.2 | 27 / 35 | 7099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 93% |
| tvv.nano.Polaris 1.2 | 39 | 90% |
| cvt.Firsty 1.0 | 25 | 92% |
| zyx.micro.Ant 1.1 | 25 | 96% |
| sanja.First 0.1 | 22 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 10 | 32% | 33 |
| zyx.micro.Ant 1.1 | 5 | 16% | 37 |
| tvv.nano.Polaris 1.2 | 4 | 13% | 61 |
| sample.RamFire 1.0 | 4 | 13% | 5 |
| Grystrion.TrackerWO 1.0 | 3 | 10% | 19 |
| cvt.Firsty 1.0 | 3 | 10% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 8 |
| sanja.First 0.1 | 0 | 0% | 18 |

## Melee bench: F11

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 70.6 | 95 / 210 | 3.65 | 16.0% | 31742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.5 | 16.0% | 95 |
| kc.micro.Figment 1.0 | 1.5 | 16.1% | 64 |
| cs.Wren 1.0 | 3.2 | 12.2% | 21 |
| js.PinBall 1.6 | 4.5 | 10.9% | 11 |
| mz.Cork 0.1 | 4.5 | 10.7% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 5 |
| evd.X1 0.01 | 6.8 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 2 |
| PSW.Relentless 0.1 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.5 | 13 / 35 | 5422 |
| 2 | 1 | 63.9 | 67.3 | 19 / 35 | 5248 |
| 3 | 1 | 67.0 | 76.8 | 21 / 35 | 5709 |
| 4 | 2 | 64.8 | 72.1 | 15 / 35 | 5467 |
| 5 | 2 | 65.5 | 74.9 | 18 / 35 | 5056 |
| 6 | 2 | 60.2 | 61.9 | 9 / 35 | 4840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 74 | 74% |
| cs.Wren 1.0 | 26 | 85% |
| mz.Cork 0.1 | 9 | 100% |
| js.PinBall 1.6 | 5 | 60% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 51% | 119 |
| cs.Wren 1.0 | 14 | 12% | 28 |
| mz.Cork 0.1 | 9 | 8% | 17 |
| joe.ADinosaur 1.0 | 9 | 8% | 11 |
| js.PinBall 1.6 | 8 | 7% | 14 |
| evd.X1 0.01 | 7 | 6% | 9 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| jsal.Jsalbot 1.0 | 3 | 3% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.3 | 134 / 210 | 2.50 | 18.9% | 30326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.9% | 134 |
| ntc.Opposite 1.5 | 3.0 | 11.4% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 10.9% | 9 |
| myl.nano.Graviton 1.10 | 3.8 | 10.8% | 21 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.3% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 8 |
| disan.Chair 2.2.0 | 6.8 | 8.2% | 8 |
| DBall.NUKE 0.1 | 7.5 | 7.6% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.5% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.9 | 25 / 35 | 4488 |
| 2 | 1 | 68.7 | 84.4 | 24 / 35 | 5352 |
| 3 | 1 | 68.9 | 85.7 | 22 / 35 | 5439 |
| 4 | 1 | 67.8 | 81.0 | 18 / 35 | 5444 |
| 5 | 1 | 68.3 | 85.1 | 22 / 35 | 4944 |
| 6 | 1 | 67.2 | 81.6 | 23 / 35 | 4659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 31 | 90% |
| stelo.AreaTargetingBot 1.1 | 30 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 95% |
| ntc.Opposite 1.5 | 19 | 84% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 13 | 77% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 25 |
| ntc.Opposite 1.5 | 12 | 16% | 29 |
| myl.nano.Graviton 1.10 | 11 | 14% | 39 |
| stelo.AreaTargetingBot 1.1 | 11 | 14% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 26 |
| disan.Chair 2.2.0 | 7 | 9% | 16 |
| pbg.R2D2 1.0 | 4 | 5% | 9 |
| donjezza.Muncho 1.0 | 3 | 4% | 15 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |

## Melee bench: F13

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.7 | 75 / 210 | 3.55 | 15.7% | 27319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 15.7% | 75 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 42 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 27 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 5 |
| ejb.Polaris 1.0.1 | 5.8 | 11.1% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.5 | 12 / 35 | 4495 |
| 2 | 1 | 64.1 | 68.9 | 15 / 35 | 4398 |
| 3 | 1 | 65.9 | 75.9 | 10 / 35 | 5034 |
| 4 | 1 | 63.2 | 69.8 | 12 / 35 | 4315 |
| 5 | 1 | 64.1 | 71.4 | 10 / 35 | 4503 |
| 6 | 1 | 65.4 | 73.7 | 16 / 35 | 4574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 67% |
| oog.melee.Capulet 1.2 | 20 | 55% |
| yagami.Tidus 0.11 | 18 | 100% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 42% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 44 |
| ejb.Polaris 1.0.1 | 18 | 13% | 25 |
| yagami.Tidus 0.11 | 17 | 13% | 30 |
| kawigi.micro.Shiz 1.1 | 11 | 8% | 27 |
| kurios.DOSexe .9a | 6 | 4% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.3 | 130 / 210 | 2.60 | 18.0% | 28092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.0% | 130 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 19 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 27 |
| wompi.Quokka 1.6 | 3.8 | 11.6% | 17 |
| ratosh.Nobo 0.21 | 4.7 | 10.7% | 4 |
| m3thos.Eva00 1.1 | 5.8 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 24 / 35 | 4505 |
| 2 | 1 | 64.7 | 73.7 | 19 / 35 | 4320 |
| 3 | 1 | 65.0 | 76.5 | 18 / 35 | 4508 |
| 4 | 1 | 68.5 | 85.1 | 22 / 35 | 5321 |
| 5 | 1 | 67.1 | 83.5 | 23 / 35 | 4421 |
| 6 | 1 | 69.1 | 89.8 | 24 / 35 | 5017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 87% |
| wee.Gem 1.8.4 | 27 | 100% |
| wompi.Quokka 1.6 | 25 | 96% |
| m3thos.Eva00 1.1 | 19 | 95% |
| ratosh.Nobo 0.21 | 11 | 73% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 16% | 51 |
| maribo.FollowFire 1 | 12 | 15% | 13 |
| wee.Gem 1.8.4 | 11 | 14% | 50 |
| wompi.Quokka 1.6 | 10 | 13% | 28 |
| ratosh.Nobo 0.21 | 9 | 11% | 21 |
| bayen.UbaMicro 1.4 | 9 | 11% | 16 |
| m3thos.Eva00 1.1 | 8 | 10% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 8 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 4 |

## Melee bench: F15

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.2 | 125 / 210 | 2.15 | 20.9% | 45606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.9% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 14 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.6% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 6 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 81.6 | 16 / 35 | 7379 |
| 2 | 1 | 71.9 | 88.6 | 20 / 35 | 7546 |
| 3 | 1 | 71.9 | 87.3 | 18 / 35 | 7661 |
| 4 | 1 | 70.7 | 82.9 | 21 / 35 | 7325 |
| 5 | 1 | 73.6 | 94.9 | 25 / 35 | 7773 |
| 6 | 1 | 72.6 | 87.9 | 25 / 35 | 7922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 80% |
| drd.Dreadknoght 0.9 | 14 | 100% |
| mz.NanoGod 2.02 | 12 | 50% |
| exauge.GateKeeper 1.1.121g | 8 | 75% |
| stelo.PianistNano 1.2 | 8 | 88% |
| ayk.WallHugger 1.0 | 5 | 100% |
| cli.WasteOfAmmo 1.0 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 52% | 139 |
| mz.NanoGod 2.02 | 18 | 21% | 29 |
| ayk.WallHugger 1.0 | 8 | 9% | 10 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 12 |
| stelo.PianistNano 1.2 | 4 | 5% | 4 |
| drd.Dreadknoght 0.9 | 3 | 4% | 9 |
| stuff.Vlad 0.1 | 1 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.8 | 114 / 210 | 3.27 | 17.2% | 30634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.2% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.3% | 15 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.9% | 20 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 14 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.3% | 4 |
| conscience.Electron 1.3g | 7.2 | 8.4% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.8% | 9 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.6 | 22 / 35 | 4748 |
| 2 | 1 | 60.4 | 57.1 | 14 / 35 | 4780 |
| 3 | 1 | 65.9 | 78.4 | 17 / 35 | 4990 |
| 4 | 1 | 68.6 | 84.1 | 20 / 35 | 5846 |
| 5 | 1 | 66.6 | 78.4 | 21 / 35 | 5123 |
| 6 | 1 | 66.0 | 76.2 | 20 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 93% |
| dummy.micro.Sparrow 2.5 | 27 | 93% |
| bvh.micro.Freya 0.3 | 16 | 75% |
| stelo.MirrorMicro 1.0 | 8 | 75% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 21% | 60 |
| dummy.micro.Sparrow 2.5 | 16 | 17% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 17% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 14% | 40 |
| bvh.micro.Freya 0.3 | 13 | 14% | 27 |
| conscience.Electron 1.3g | 8 | 8% | 15 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 10 |
| dl.BetterWalls 1.0 | 5 | 5% | 9 |

## Melee bench: F17

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 88.9 | 161 / 210 | 2.00 | 22.2% | 45108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 22.2% | 161 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.4% | 13 |
| sul.Lunar 1.1 | 3.2 | 11.8% | 13 |
| supersample.SuperBoxBot 1.0 | 4.3 | 9.9% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.3% | 2 |
| dsw.StaticD 1.0 | 5.7 | 9.0% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 0 |
| sample.Corners 1.0 | 8.8 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.9 | 26 / 35 | 7595 |
| 2 | 1 | 72.0 | 89.5 | 26 / 35 | 7147 |
| 3 | 1 | 71.7 | 86.0 | 24 / 35 | 7308 |
| 4 | 1 | 72.1 | 87.3 | 27 / 35 | 7428 |
| 5 | 1 | 72.7 | 88.6 | 28 / 35 | 7542 |
| 6 | 1 | 74.1 | 94.0 | 30 / 35 | 8088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 89% |
| supersample.SuperBoxBot 1.0 | 31 | 90% |
| dsw.StaticD 1.0 | 13 | 77% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 45% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 25% | 59 |
| dsw.StaticD 1.0 | 6 | 12% | 21 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 8 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 4 |
| sul.Lunar 1.1 | 2 | 4% | 51 |
| sample.Corners 1.0 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.6 | 112 / 210 | 2.84 | 18.5% | 38463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.5% | 112 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 10.9% | 22 |
| amz.NanoClone 1.41 | 4.2 | 11.0% | 18 |
| mld.Wisdom 1.0 | 4.3 | 11.0% | 10 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.4% | 2 |
| sample.Walls 1.0 | 7.3 | 7.8% | 8 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 11 |
| sample.Target 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 76.5 | 19 / 35 | 6158 |
| 2 | 1 | 68.6 | 83.5 | 19 / 35 | 6387 |
| 3 | 1 | 69.0 | 83.2 | 22 / 35 | 6516 |
| 4 | 1 | 68.2 | 80.6 | 16 / 35 | 6872 |
| 5 | 1 | 68.2 | 79.0 | 20 / 35 | 6329 |
| 6 | 1 | 66.4 | 74.6 | 16 / 35 | 6201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 89% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| amz.NanoClone 1.41 | 15 | 60% |
| sample.Walls 1.0 | 15 | 100% |
| mld.Wisdom 1.0 | 11 | 82% |
| jangs.ns51 1.0 | 9 | 78% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 50% |

Hadur died in 99 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 22 | 22% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 19% | 55 |
| KiraNL.Chupacabra 0.4 | 16 | 16% | 26 |
| radnor.DoctorBob 1.42 | 15 | 15% | 45 |
| amz.NanoClone 1.41 | 14 | 14% | 21 |
| jangs.ns51 1.0 | 8 | 8% | 12 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |

