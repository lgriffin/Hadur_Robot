# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 88.1 | 140 / 210 | 2.07 | 20.6% | 40931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.6% | 140 |
| mz.AntiGrav 1.0 | 2.5 | 14.8% | 25 |
| mld.Infinity 2.2 | 3.2 | 13.9% | 23 |
| radnor.DoctorBob 1.42 | 3.5 | 13.4% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 2 |
| GarmBox.Oranges 1.0 | 6.2 | 6.9% | 0 |
| sample.Walls 1.0 | 7.3 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 0 |
| sample.Target 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 91.1 | 27 / 35 | 7012 |
| 2 | 1 | 70.2 | 84.8 | 20 / 35 | 6814 |
| 3 | 1 | 71.0 | 86.3 | 21 / 35 | 6524 |
| 4 | 1 | 70.9 | 86.7 | 23 / 35 | 6525 |
| 5 | 1 | 71.9 | 88.9 | 23 / 35 | 6833 |
| 6 | 1 | 72.8 | 91.1 | 26 / 35 | 7223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 90% |
| mld.Infinity 2.2 | 48 | 85% |
| radnor.DoctorBob 1.42 | 32 | 84% |
| amz.NanoClone 1.41 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 31% | 57 |
| mz.AntiGrav 1.0 | 18 | 26% | 68 |
| mld.Infinity 2.2 | 10 | 14% | 48 |
| amz.NanoClone 1.41 | 8 | 11% | 12 |
| GarmBox.Oranges 1.0 | 6 | 9% | 7 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |

## Melee bench: F02

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.2 | 133 / 210 | 2.06 | 19.0% | 31772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 19.0% | 133 |
| mld.DustBunny 3.8 | 2.3 | 13.9% | 20 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.9% | 42 |
| maribo.melee.BMV 0.1 | 4.5 | 9.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.1% | 4 |
| zyx.nano.Ant 1.1 | 6.3 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.8% | 7 |
| bzdp.BoxCar 2.0 | 8.2 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 5.9% | 3 |
| cs.Grudge 1.0 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.9 | 24 / 35 | 5318 |
| 2 | 1 | 67.3 | 83.5 | 21 / 35 | 4954 |
| 3 | 1 | 68.5 | 86.7 | 20 / 35 | 5298 |
| 4 | 1 | 69.0 | 86.3 | 22 / 35 | 5703 |
| 5 | 1 | 68.8 | 92.4 | 22 / 35 | 4774 |
| 6 | 1 | 69.8 | 91.4 | 24 / 35 | 5725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 65 | 82% |
| mld.DustBunny 3.8 | 58 | 83% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 35% | 68 |
| oog.melee.Mercutio 1.0 | 23 | 30% | 74 |
| maribo.melee.BMV 0.1 | 6 | 8% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 16 |
| zyx.nano.Ant 1.1 | 5 | 6% | 9 |
| fullsail.SweetTea 1.1 | 4 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 14 |
| bzdp.BoxCar 2.0 | 2 | 3% | 4 |
| cs.Grudge 1.0 | 2 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 83.3 | 127 / 210 | 2.50 | 19.4% | 36366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 19.4% | 127 |
| myl.micro.Troodon 1.10 | 2.2 | 14.5% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 21 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.3% | 6 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.7% | 4 |
| sample.Fire 1.0 | 9.2 | 5.2% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 74.3 | 19 / 35 | 5350 |
| 2 | 1 | 71.2 | 88.3 | 24 / 35 | 6629 |
| 3 | 1 | 68.7 | 84.4 | 20 / 35 | 5703 |
| 4 | 1 | 70.3 | 83.5 | 23 / 35 | 6499 |
| 5 | 1 | 70.3 | 86.7 | 21 / 35 | 6472 |
| 6 | 1 | 68.3 | 82.9 | 20 / 35 | 5713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 82% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 3 | 33% |
| sample.Fire 1.0 | 3 | 67% |

Hadur died in 83 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 23% | 41 |
| myl.micro.Troodon 1.10 | 18 | 22% | 66 |
| cb.nano.Insomnia 1.0 | 16 | 19% | 19 |
| fm.mammillarias 1.3 | 16 | 19% | 19 |
| myl.nano.KomoriNinja 1.1 | 6 | 7% | 38 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 12 |
| sample.Fire 1.0 | 1 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 11 |

## Melee bench: F04

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.3 | 143 / 210 | 2.14 | 20.3% | 38594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.3% | 143 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 10.0% | 20 |
| tj.zombie1n 1.0.1 | 5.5 | 9.2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.6% | 0 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.0 | 18 / 35 | 6035 |
| 2 | 1 | 70.9 | 90.8 | 27 / 35 | 6147 |
| 3 | 1 | 71.2 | 91.4 | 24 / 35 | 6705 |
| 4 | 1 | 70.4 | 86.0 | 27 / 35 | 6398 |
| 5 | 1 | 70.3 | 85.7 | 23 / 35 | 6924 |
| 6 | 1 | 69.6 | 83.8 | 24 / 35 | 6385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 90% |
| stelo.SoJNanoMelee 1.1 | 36 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 95% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| tj.zombie1n 1.0.1 | 12 | 92% |
| yk.JahMicro 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 37% | 82 |
| stelo.SoJNanoMelee 1.1 | 17 | 25% | 41 |
| tj.zombie1n 1.0.1 | 11 | 16% | 15 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 26 |
| repositorio.NanoStep 1.0 | 1 | 1% | 7 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.4 | 104 / 210 | 3.04 | 17.2% | 31426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 17.2% | 104 |
| oog.melee.Corsair 1.0 | 2.7 | 12.5% | 33 |
| ahf.NanoAndrew .4 | 3.2 | 11.4% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 19 |
| sam.Samspin 1.0 | 5.2 | 10.0% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.0% | 4 |
| EBBU.Sim2 1.02 | 6.5 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.0 | 20 / 35 | 5302 |
| 2 | 1 | 66.2 | 77.5 | 20 / 35 | 5291 |
| 3 | 1 | 65.6 | 74.9 | 16 / 35 | 5683 |
| 4 | 1 | 67.1 | 81.0 | 22 / 35 | 5197 |
| 5 | 1 | 64.9 | 76.5 | 14 / 35 | 5180 |
| 6 | 1 | 63.7 | 75.2 | 12 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 62% |
| simonton.nano.MeleeSeed 1.8 | 31 | 94% |
| ahf.NanoAndrew .4 | 18 | 78% |
| EBBU.Sim2 1.02 | 16 | 88% |
| sam.Samspin 1.0 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |

Hadur died in 107 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 21% | 49 |
| ahf.NanoAndrew .4 | 16 | 15% | 31 |
| robar.nano.Assertive_Melee 0.2 | 14 | 13% | 20 |
| zyx.nano.BacillusComma 1.0 | 13 | 12% | 14 |
| EBBU.Sim2 1.02 | 12 | 11% | 22 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 43 |
| sam.Samspin 1.0 | 9 | 8% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 6% | 7 |
| sample.TrackFire 1.0 | 4 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.9 | 129 / 210 | 2.27 | 18.9% | 31693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.9% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 29 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 16 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 9.5% | 11 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.4% | 10 |
| fm.claire 1.7 | 6.2 | 8.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 5 |
| sample.SpinBot 1.0 | 7.3 | 7.6% | 3 |
| pa.Improved 1.0 | 9.3 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 22 / 35 | 5480 |
| 2 | 1 | 68.4 | 84.8 | 18 / 35 | 5545 |
| 3 | 1 | 69.4 | 90.5 | 25 / 35 | 5218 |
| 4 | 1 | 68.5 | 85.1 | 21 / 35 | 5437 |
| 5 | 1 | 69.3 | 89.8 | 25 / 35 | 5341 |
| 6 | 1 | 65.6 | 79.0 | 18 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 85% |
| oog.melee.CapuletDroid 1.1 | 26 | 96% |
| gh.nano.Grofvuil 0.2 | 14 | 71% |
| winamp32.micro.MicroMacro 1.0 | 12 | 92% |
| arthord.NanoSatanMelee Beta | 10 | 80% |
| sample.SpinBot 1.0 | 9 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 28% | 78 |
| gh.nano.Grofvuil 0.2 | 12 | 15% | 28 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 37 |
| fm.claire 1.7 | 10 | 12% | 11 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 17 |
| kurios.DOSexe .9b | 5 | 6% | 10 |
| sample.SpinBot 1.0 | 4 | 5% | 12 |
| pa.Improved 1.0 | 3 | 4% | 4 |

## Melee bench: F07

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.5 | 101 / 210 | 2.58 | 18.3% | 34570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.3% | 101 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.1% | 25 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 34 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 2 |
| el.JumpShoot 0.2 | 8.0 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| acogdev.alpha 0.2 | 8.7 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.7 | 20 / 35 | 5643 |
| 2 | 1 | 69.1 | 87.0 | 20 / 35 | 5668 |
| 3 | 1 | 66.3 | 76.5 | 16 / 35 | 5646 |
| 4 | 1 | 67.1 | 82.5 | 14 / 35 | 5615 |
| 5 | 1 | 68.0 | 81.6 | 15 / 35 | 6119 |
| 6 | 1 | 67.5 | 80.6 | 16 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 81% |
| mz.MicroGodMelee 1 | 46 | 61% |
| gh.micro.Gruweltje 0.7 | 21 | 76% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 29% | 60 |
| spinnercat.micro.Tyger 0.1 | 28 | 26% | 56 |
| gh.micro.Gruweltje 0.7 | 28 | 26% | 49 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 9 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 13 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.5 | 102 / 210 | 3.66 | 16.2% | 31587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.5 | 16.2% | 102 |
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.0% | 58 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.9% | 19 |
| germ.TheMind .2 | 4.3 | 10.1% | 10 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.5% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.7% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 4 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.8% | 4 |
| sample.Crazy 1.0 | 9.0 | 6.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.6 | 19 / 35 | 5632 |
| 2 | 2 | 59.7 | 55.2 | 12 / 35 | 5297 |
| 3 | 2 | 66.0 | 76.2 | 20 / 35 | 4898 |
| 4 | 1 | 65.0 | 70.5 | 18 / 35 | 5243 |
| 5 | 1 | 66.5 | 77.1 | 18 / 35 | 5480 |
| 6 | 2 | 63.6 | 69.2 | 15 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 94% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 7 | 86% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 44% | 96 |
| germ.TheMind .2 | 18 | 17% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 12% | 29 |
| awesomeness.Elite 1.0 | 10 | 9% | 18 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 17 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.6 | 145 / 210 | 2.03 | 19.7% | 30513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 19.7% | 145 |
| rz.HawkOnFire 0.1 | 2.0 | 14.5% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.3% | 12 |
| maribo.IotaCT 1.1 | 4.5 | 10.2% | 8 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.3% | 3 |
| ratosh.Wesco 1.4 | 7.7 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 7.6% | 2 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.4 | 22 / 35 | 4584 |
| 2 | 1 | 70.3 | 89.5 | 25 / 35 | 5344 |
| 3 | 1 | 71.0 | 88.3 | 24 / 35 | 5422 |
| 4 | 1 | 70.3 | 88.9 | 27 / 35 | 4955 |
| 5 | 1 | 69.1 | 87.0 | 21 / 35 | 4888 |
| 6 | 1 | 71.2 | 93.3 | 26 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 91% |
| nz.jdc.nano.GridFu 1.0 | 26 | 100% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| maribo.IotaCT 1.1 | 10 | 90% |
| ratosh.Wesco 1.4 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 24% | 75 |
| timmit.nano.TimDog 0.33 | 13 | 20% | 19 |
| stelo.PatternRobot 1.0 | 11 | 17% | 24 |
| nz.jdc.nano.GridFu 1.0 | 8 | 12% | 44 |
| maribo.IotaCT 1.1 | 7 | 11% | 18 |
| ratosh.Wesco 1.4 | 6 | 9% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| spinnercat.Omen 1.0 | 2 | 3% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.8 | 144 / 210 | 2.01 | 20.4% | 37738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.4% | 144 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.5% | 24 |
| baal.nano.N 1.42 | 3.3 | 10.9% | 10 |
| zyx.micro.Ant 1.1 | 4.2 | 10.0% | 21 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.3% | 1 |
| sanja.First 0.1 | 7.0 | 8.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 24 / 35 | 6120 |
| 2 | 1 | 71.2 | 90.2 | 25 / 35 | 6862 |
| 3 | 1 | 68.6 | 86.0 | 21 / 35 | 5826 |
| 4 | 1 | 72.4 | 96.5 | 28 / 35 | 6913 |
| 5 | 1 | 69.0 | 85.1 | 22 / 35 | 6252 |
| 6 | 1 | 69.0 | 85.7 | 24 / 35 | 5765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 79% |
| cvt.Firsty 1.0 | 23 | 91% |
| sanja.First 0.1 | 22 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| baal.nano.N 1.42 | 18 | 61% |
| zyx.micro.Ant 1.1 | 17 | 76% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 11 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 25 | 38% | 44 |
| baal.nano.N 1.42 | 12 | 18% | 26 |
| tvv.nano.Polaris 1.2 | 10 | 15% | 55 |
| Grystrion.TrackerWO 1.0 | 7 | 11% | 18 |
| cvt.Firsty 1.0 | 4 | 6% | 17 |
| sample.RamFire 1.0 | 4 | 6% | 4 |
| sanja.First 0.1 | 3 | 5% | 22 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 10 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 13 |

## Melee bench: F11

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 64.1 | 74 / 210 | 4.23 | 14.3% | 28451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.2% | 55 |
| hadur117.micro.SaorWNG 0.1 | 1.8 | 14.3% | 74 |
| cs.Wren 1.0 | 2.8 | 13.4% | 31 |
| js.PinBall 1.6 | 4.5 | 11.4% | 14 |
| mz.Cork 0.1 | 4.7 | 11.2% | 20 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 4 |
| evd.X1 0.01 | 6.7 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 7 |
| PSW.Relentless 0.1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 63.5 | 11 / 35 | 4897 |
| 2 | 3 | 58.4 | 56.8 | 10 / 35 | 4377 |
| 3 | 1 | 63.5 | 68.9 | 18 / 35 | 4786 |
| 4 | 2 | 60.6 | 62.2 | 13 / 35 | 4648 |
| 5 | 2 | 62.2 | 68.6 | 10 / 35 | 4958 |
| 6 | 1 | 61.0 | 64.4 | 12 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 47 | 72% |
| cs.Wren 1.0 | 35 | 80% |
| mz.Cork 0.1 | 5 | 60% |
| donjezza.Jezza 1.0 | 4 | 75% |
| js.PinBall 1.6 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 42% | 98 |
| cs.Wren 1.0 | 21 | 15% | 39 |
| evd.X1 0.01 | 16 | 12% | 16 |
| js.PinBall 1.6 | 12 | 9% | 15 |
| mz.Cork 0.1 | 10 | 7% | 17 |
| PSW.Relentless 0.1 | 10 | 7% | 9 |
| joe.ADinosaur 1.0 | 7 | 5% | 9 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.1 | 120 / 210 | 2.61 | 18.3% | 29147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.3% | 120 |
| ntc.Opposite 1.5 | 2.5 | 11.8% | 9 |
| myl.nano.Graviton 1.10 | 3.0 | 12.0% | 33 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5.5 | 9.9% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.1% | 9 |
| DBall.NUKE 0.1 | 7.3 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 9 |
| pbg.R2D2 1.0 | 9.7 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.8 | 19 / 35 | 4601 |
| 2 | 1 | 68.6 | 84.8 | 24 / 35 | 5180 |
| 3 | 1 | 68.5 | 87.0 | 21 / 35 | 4923 |
| 4 | 1 | 65.9 | 75.9 | 17 / 35 | 4727 |
| 5 | 1 | 65.6 | 75.9 | 19 / 35 | 4744 |
| 6 | 1 | 68.1 | 85.4 | 20 / 35 | 4972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 84% |
| stelo.AreaTargetingBot 1.1 | 33 | 94% |
| ntc.Opposite 1.5 | 19 | 95% |
| disan.Chair 2.2.0 | 14 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| DBall.NUKE 0.1 | 9 | 100% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 21% | 42 |
| myl.nano.Graviton 1.10 | 18 | 20% | 49 |
| ntc.Opposite 1.5 | 18 | 20% | 31 |
| pfvicm.Sobieski 7.2.3b | 10 | 11% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 24 |
| disan.Chair 2.2.0 | 7 | 8% | 18 |
| pbg.R2D2 1.0 | 4 | 4% | 6 |
| donjezza.Muncho 1.0 | 3 | 3% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 9 |

## Melee bench: F13

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 70.4 | 78 / 210 | 3.67 | 15.2% | 26007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.7 | 15.2% | 78 |
| kawigi.micro.Shiz 1.1 | 1.8 | 14.2% | 38 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 28 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.9% | 10 |
| stelo.MirrorNano 1.3 | 7.0 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 16 / 35 | 4787 |
| 2 | 2 | 61.4 | 61.9 | 11 / 35 | 4336 |
| 3 | 3 | 60.6 | 62.9 | 9 / 35 | 4133 |
| 4 | 2 | 62.5 | 66.3 | 13 / 35 | 4031 |
| 5 | 1 | 65.0 | 74.9 | 17 / 35 | 4289 |
| 6 | 1 | 65.3 | 77.1 | 12 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 97% |
| oog.melee.Capulet 1.2 | 28 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 65% |
| yagami.Tidus 0.11 | 17 | 88% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 37% | 69 |
| yagami.Tidus 0.11 | 24 | 18% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 42 |
| ejb.Polaris 1.0.1 | 13 | 10% | 17 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 28 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.5 | 133 / 210 | 2.75 | 17.5% | 26947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 17.5% | 133 |
| bzdp.Pansy 2.1 | 2.7 | 12.5% | 19 |
| wee.Gem 1.8.4 | 3.5 | 12.0% | 26 |
| wompi.Quokka 1.6 | 4.0 | 11.1% | 9 |
| m3thos.Eva00 1.1 | 4.7 | 10.4% | 12 |
| ratosh.Nobo 0.21 | 5.2 | 10.4% | 5 |
| bayen.UbaMicro 1.4 | 7.2 | 8.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.7 | 23 / 35 | 4423 |
| 2 | 1 | 66.4 | 80.6 | 24 / 35 | 4438 |
| 3 | 1 | 69.4 | 90.5 | 30 / 35 | 4692 |
| 4 | 1 | 63.5 | 70.8 | 19 / 35 | 4212 |
| 5 | 1 | 64.2 | 75.6 | 17 / 35 | 4499 |
| 6 | 1 | 66.5 | 80.0 | 20 / 35 | 4683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 90% |
| wee.Gem 1.8.4 | 30 | 100% |
| wompi.Quokka 1.6 | 20 | 100% |
| m3thos.Eva00 1.1 | 15 | 87% |
| ratosh.Nobo 0.21 | 15 | 87% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 21% | 26 |
| bzdp.Pansy 2.1 | 12 | 15% | 64 |
| bayen.UbaMicro 1.4 | 10 | 13% | 11 |
| wompi.Quokka 1.6 | 9 | 12% | 25 |
| m3thos.Eva00 1.1 | 8 | 10% | 17 |
| maribo.FollowFire 1 | 8 | 10% | 8 |
| wee.Gem 1.8.4 | 6 | 8% | 48 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 86.7 | 120 / 210 | 2.20 | 20.8% | 45720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.8% | 120 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 64 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 18 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 0 |
| stuff.Vlad 0.1 | 5.5 | 9.0% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.3 | 16 / 35 | 7057 |
| 2 | 1 | 72.9 | 89.5 | 23 / 35 | 7958 |
| 3 | 1 | 71.7 | 84.4 | 20 / 35 | 7810 |
| 4 | 1 | 71.9 | 86.7 | 20 / 35 | 7609 |
| 5 | 1 | 72.7 | 88.6 | 21 / 35 | 7939 |
| 6 | 1 | 71.6 | 84.8 | 20 / 35 | 7347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 69% |
| exauge.GateKeeper 1.1.121g | 20 | 95% |
| mz.NanoGod 2.02 | 18 | 61% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 47% | 121 |
| mz.NanoGod 2.02 | 29 | 32% | 42 |
| exauge.GateKeeper 1.1.121g | 11 | 12% | 22 |
| ayk.WallHugger 1.0 | 3 | 3% | 10 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.0 | 90 / 210 | 3.70 | 16.0% | 29814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 16.0% | 90 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 27 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 25 |
| bvh.micro.Freya 0.3 | 3.7 | 11.9% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.6% | 20 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.9 | 14 / 35 | 5083 |
| 2 | 1 | 63.0 | 66.7 | 18 / 35 | 4710 |
| 3 | 1 | 67.1 | 79.0 | 18 / 35 | 5547 |
| 4 | 1 | 61.8 | 63.8 | 14 / 35 | 4865 |
| 5 | 1 | 62.3 | 67.9 | 14 / 35 | 4590 |
| 6 | 1 | 62.8 | 66.7 | 12 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 80% |
| bvh.micro.Freya 0.3 | 21 | 90% |
| dummy.micro.Sparrow 2.5 | 19 | 79% |
| stelo.MirrorMicro 1.0 | 11 | 82% |
| dl.BetterWalls 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 21% | 49 |
| conscience.Electron 1.3g | 20 | 17% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 13% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 13% | 16 |
| dummy.micro.Sparrow 2.5 | 14 | 12% | 31 |
| bvh.micro.Freya 0.3 | 13 | 11% | 25 |
| dl.BetterWalls 1.0 | 11 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 5 | 4% | 16 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.6 | 140 / 210 | 2.21 | 20.8% | 42313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.8% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 30 |
| sul.Lunar 1.1 | 3.0 | 11.8% | 14 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.7% | 17 |
| mme.NikeEnhanced 2.0 | 5.0 | 10.2% | 3 |
| dsw.StaticD 1.0 | 6.2 | 7.9% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 2 |
| sample.Corners 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 87.6 | 22 / 35 | 7021 |
| 2 | 1 | 71.8 | 89.8 | 26 / 35 | 7187 |
| 3 | 1 | 72.0 | 89.2 | 25 / 35 | 7387 |
| 4 | 1 | 68.0 | 76.5 | 20 / 35 | 6227 |
| 5 | 1 | 72.8 | 93.7 | 28 / 35 | 7506 |
| 6 | 1 | 69.6 | 82.5 | 19 / 35 | 6985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 95% |
| supersample.SuperBoxBot 1.0 | 26 | 88% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| dsw.StaticD 1.0 | 11 | 82% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 39% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 21% | 54 |
| sul.Lunar 1.1 | 7 | 10% | 56 |
| mme.NikeEnhanced 2.0 | 7 | 10% | 17 |
| dsw.StaticD 1.0 | 5 | 7% | 19 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 9 |
| sample.Corners 1.0 | 3 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.6 | 95 / 210 | 3.29 | 16.8% | 34809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 16.8% | 95 |
| radnor.DoctorBob 1.42 | 2.7 | 13.2% | 28 |
| mld.Wisdom 1.0 | 2.8 | 12.8% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.4% | 34 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.3% | 11 |
| amz.NanoClone 1.41 | 6.2 | 9.5% | 10 |
| sample.Walls 1.0 | 6.8 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.5 | 19 / 35 | 5980 |
| 2 | 1 | 63.7 | 67.9 | 12 / 35 | 5660 |
| 3 | 1 | 66.7 | 75.9 | 16 / 35 | 6437 |
| 4 | 1 | 64.9 | 71.4 | 16 / 35 | 5649 |
| 5 | 1 | 64.2 | 72.4 | 16 / 35 | 5216 |
| 6 | 1 | 65.9 | 76.5 | 16 / 35 | 5867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 80% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| mld.Wisdom 1.0 | 17 | 71% |
| sample.Walls 1.0 | 10 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| KiraNL.Chupacabra 0.4 | 6 | 33% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |

Hadur died in 115 of 210 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 44 | 38% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 17% | 55 |
| radnor.DoctorBob 1.42 | 16 | 14% | 44 |
| KiraNL.Chupacabra 0.4 | 15 | 13% | 19 |
| amz.NanoClone 1.41 | 12 | 10% | 15 |
| GarmBox.Oranges 1.0 | 5 | 4% | 5 |
| sample.Walls 1.0 | 2 | 2% | 9 |
| jangs.ns51 1.0 | 2 | 2% | 6 |

