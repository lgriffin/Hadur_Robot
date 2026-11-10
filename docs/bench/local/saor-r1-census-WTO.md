# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 88.7 | 157 / 210 | 2.01 | 21.4% | 42176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.4% | 157 |
| radnor.DoctorBob 1.42 | 2.5 | 13.8% | 13 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 16 |
| mld.Infinity 2.2 | 3.8 | 12.9% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 4 |
| sample.Walls 1.0 | 6.3 | 7.3% | 4 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 1 |
| sample.Target 1.0 | 9.8 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 83.5 | 27 / 35 | 6679 |
| 2 | 1 | 71.9 | 89.2 | 25 / 35 | 6616 |
| 3 | 1 | 73.3 | 91.1 | 26 / 35 | 7770 |
| 4 | 1 | 71.0 | 84.8 | 24 / 35 | 6999 |
| 5 | 1 | 72.2 | 89.2 | 27 / 35 | 7015 |
| 6 | 1 | 73.9 | 94.6 | 28 / 35 | 7097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 96% |
| radnor.DoctorBob 1.42 | 39 | 90% |
| mld.Infinity 2.2 | 34 | 91% |
| amz.NanoClone 1.41 | 8 | 88% |
| sample.Walls 1.0 | 3 | 67% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 43% | 70 |
| mz.AntiGrav 1.0 | 10 | 19% | 83 |
| mld.Infinity 2.2 | 6 | 11% | 13 |
| amz.NanoClone 1.41 | 5 | 9% | 17 |
| sample.Walls 1.0 | 3 | 6% | 7 |
| arthord.MannyPacquiao Beta | 3 | 6% | 6 |
| GarmBox.Oranges 1.0 | 2 | 4% | 4 |
| jangs.ns51 1.0 | 1 | 2% | 6 |

## Melee bench: F02

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.3 | 151 / 210 | 2.05 | 19.4% | 31106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.4% | 151 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 35 |
| mld.DustBunny 3.8 | 2.7 | 13.5% | 14 |
| zyx.nano.Ant 1.1 | 5.0 | 9.1% | 0 |
| maribo.melee.BMV 0.1 | 5.5 | 9.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.2% | 7 |
| bzdp.BoxCar 2.0 | 8.0 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.1 | 26 / 35 | 4615 |
| 2 | 1 | 70.1 | 90.2 | 26 / 35 | 5694 |
| 3 | 1 | 69.1 | 87.9 | 26 / 35 | 5329 |
| 4 | 1 | 70.0 | 90.8 | 26 / 35 | 5335 |
| 5 | 1 | 71.1 | 95.6 | 27 / 35 | 5599 |
| 6 | 1 | 66.7 | 81.3 | 20 / 35 | 4534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 78 | 85% |
| mld.DustBunny 3.8 | 53 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 81% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 22 | 37% | 85 |
| mld.DustBunny 3.8 | 16 | 27% | 70 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 17 |
| zyx.nano.Ant 1.1 | 5 | 8% | 13 |
| fullsail.SweetTea 1.1 | 4 | 7% | 9 |
| maribo.melee.BMV 0.1 | 4 | 7% | 8 |
| cs.Grudge 1.0 | 2 | 3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.2 | 139 / 210 | 2.33 | 20.2% | 36991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.2% | 139 |
| myl.micro.Troodon 1.10 | 2.2 | 14.0% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.8% | 16 |
| fm.mammillarias 1.3 | 5.3 | 9.6% | 7 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.5% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 3 |
| sample.Fire 1.0 | 9.3 | 5.1% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 85.4 | 24 / 35 | 6349 |
| 2 | 1 | 71.1 | 90.5 | 25 / 35 | 6128 |
| 3 | 1 | 69.5 | 84.1 | 22 / 35 | 6035 |
| 4 | 1 | 67.6 | 78.1 | 15 / 35 | 5762 |
| 5 | 1 | 70.9 | 87.9 | 26 / 35 | 6334 |
| 6 | 1 | 71.1 | 85.1 | 27 / 35 | 6383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 80% |
| myl.nano.KomoriNinja 1.1 | 23 | 91% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 12 | 92% |
| fm.mammillarias 1.3 | 9 | 89% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 25% | 31 |
| myl.micro.Troodon 1.10 | 16 | 22% | 71 |
| cb.nano.Insomnia 1.0 | 12 | 17% | 17 |
| myl.nano.KomoriNinja 1.1 | 10 | 14% | 38 |
| fm.mammillarias 1.3 | 9 | 13% | 16 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 19 |
| sample.Fire 1.0 | 2 | 3% | 8 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.8 | 159 / 210 | 2.01 | 21.2% | 40501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.2% | 159 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.4% | 8 |
| kawigi.nano.Lib 1.0 | 3.2 | 11.9% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 9.6% | 16 |
| tj.zombie1n 1.0.1 | 5.7 | 8.9% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.0% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.0% | 2 |
| yk.JahMicro 1.0 | 7.2 | 8.1% | 4 |
| repositorio.NanoStep 1.0 | 9.3 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.4 | 30 / 35 | 6975 |
| 2 | 1 | 72.9 | 94.6 | 29 / 35 | 7292 |
| 3 | 1 | 71.0 | 89.2 | 24 / 35 | 6828 |
| 4 | 1 | 70.0 | 83.2 | 27 / 35 | 6490 |
| 5 | 1 | 70.7 | 87.3 | 26 / 35 | 6458 |
| 6 | 1 | 70.1 | 86.0 | 23 / 35 | 6458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 89% |
| stelo.SoJNanoMelee 1.1 | 49 | 88% |
| tj.zombie1n 1.0.1 | 18 | 83% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 94% |
| yk.JahMicro 1.0 | 9 | 78% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 41% | 82 |
| stelo.SoJNanoMelee 1.1 | 9 | 18% | 42 |
| tvv.micro.Antares 1.1.1 | 6 | 12% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 10% | 21 |
| tj.zombie1n 1.0.1 | 3 | 6% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 6 |
| sample.VelociRobot 1.0 | 2 | 4% | 8 |
| yk.JahMicro 1.0 | 2 | 4% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 11 |

## Melee bench: F05

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.4 | 115 / 210 | 3.48 | 16.7% | 28767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 16.7% | 115 |
| ahf.NanoAndrew .4 | 2.7 | 11.9% | 31 |
| oog.melee.Corsair 1.0 | 2.8 | 11.9% | 15 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 14 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 15 |
| EBBU.Sim2 1.02 | 6.5 | 9.0% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.2% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.0% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 70.8 | 18 / 35 | 4375 |
| 2 | 1 | 64.1 | 68.3 | 21 / 35 | 4748 |
| 3 | 1 | 64.3 | 70.8 | 17 / 35 | 4830 |
| 4 | 1 | 67.0 | 79.0 | 22 / 35 | 5001 |
| 5 | 1 | 64.6 | 70.5 | 18 / 35 | 4859 |
| 6 | 1 | 65.3 | 75.2 | 19 / 35 | 4954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 31 | 90% |
| ahf.NanoAndrew .4 | 22 | 91% |
| sam.Samspin 1.0 | 16 | 88% |
| zyx.nano.BacillusComma 1.0 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| EBBU.Sim2 1.02 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 21 | 22% | 46 |
| robar.nano.Assertive_Melee 0.2 | 16 | 17% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 16% | 18 |
| oog.melee.Corsair 1.0 | 12 | 13% | 36 |
| zyx.nano.BacillusComma 1.0 | 11 | 11% | 17 |
| ahf.NanoAndrew .4 | 9 | 9% | 32 |
| sam.Samspin 1.0 | 6 | 6% | 21 |
| EBBU.Sim2 1.02 | 5 | 5% | 9 |
| sample.TrackFire 1.0 | 1 | 1% | 4 |

## Melee bench: F06

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.7 | 142 / 210 | 2.20 | 19.4% | 32552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.4% | 142 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.5% | 26 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.0% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.8% | 7 |
| fm.claire 1.7 | 6.0 | 8.6% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.3% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 4 |
| kurios.DOSexe .9b | 9.3 | 5.8% | 1 |
| pa.Improved 1.0 | 9.7 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 24 / 35 | 5704 |
| 2 | 1 | 69.0 | 86.7 | 24 / 35 | 5438 |
| 3 | 1 | 69.4 | 89.5 | 25 / 35 | 5329 |
| 4 | 1 | 68.9 | 84.4 | 23 / 35 | 5501 |
| 5 | 1 | 69.9 | 89.8 | 26 / 35 | 5359 |
| 6 | 1 | 66.5 | 78.7 | 20 / 35 | 5221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 82% |
| oog.melee.CapuletDroid 1.1 | 42 | 86% |
| gh.nano.Grofvuil 0.2 | 18 | 89% |
| winamp32.micro.MicroMacro 1.0 | 11 | 73% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| sample.SpinBot 1.0 | 9 | 100% |
| fm.claire 1.7 | 6 | 83% |
| kurios.DOSexe .9b | 4 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 28% | 81 |
| gh.nano.Grofvuil 0.2 | 13 | 19% | 39 |
| oog.melee.CapuletDroid 1.1 | 13 | 19% | 21 |
| arthord.NanoSatanMelee Beta | 8 | 12% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 12 |
| kurios.DOSexe .9b | 4 | 6% | 16 |
| fm.claire 1.7 | 3 | 4% | 10 |
| sample.SpinBot 1.0 | 2 | 3% | 10 |
| pa.Improved 1.0 | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.5 | 105 / 210 | 2.66 | 18.1% | 33313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 18.1% | 105 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.1% | 40 |
| mz.MicroGodMelee 1 | 3.7 | 12.6% | 19 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 6 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.5% | 1 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 2 |
| mbro.Detektor3 0.1.1 | 8.5 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.4 | 19 / 35 | 6100 |
| 2 | 1 | 67.6 | 79.0 | 21 / 35 | 5445 |
| 3 | 1 | 67.7 | 81.9 | 21 / 35 | 5323 |
| 4 | 1 | 66.7 | 78.4 | 12 / 35 | 5627 |
| 5 | 1 | 68.5 | 86.7 | 16 / 35 | 5743 |
| 6 | 1 | 65.9 | 77.8 | 16 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 49 | 84% |
| spinnercat.micro.Tyger 0.1 | 45 | 62% |
| gh.micro.Gruweltje 0.7 | 27 | 63% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 31% | 62 |
| mz.MicroGodMelee 1 | 27 | 26% | 54 |
| gh.micro.Gruweltje 0.7 | 24 | 23% | 54 |
| acogdev.alpha 0.2 | 7 | 7% | 8 |
| DBall.Anarchy 0.1 | 4 | 4% | 12 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.3 | 105 / 210 | 3.67 | 16.3% | 30459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 16.3% | 105 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.4% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.0% | 36 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.5% | 4 |
| germ.TheMind .2 | 5.3 | 10.0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.9% | 2 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 9 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.1% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.2% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 71.7 | 17 / 35 | 4819 |
| 2 | 1 | 66.6 | 76.5 | 19 / 35 | 5382 |
| 3 | 1 | 66.8 | 78.1 | 20 / 35 | 5632 |
| 4 | 1 | 63.5 | 69.8 | 18 / 35 | 4503 |
| 5 | 1 | 62.0 | 61.9 | 16 / 35 | 4964 |
| 6 | 1 | 63.1 | 63.8 | 15 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 71% |
| germ.TheMind .2 | 10 | 90% |
| awesomeness.Elite 1.0 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 46% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 34 |
| qualidafial.MajorDick 1.0.1 | 11 | 10% | 14 |
| germ.TheMind .2 | 10 | 10% | 18 |
| awesomeness.Elite 1.0 | 8 | 8% | 14 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 6 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.3 | 158 / 210 | 1.97 | 20.1% | 31116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.1% | 158 |
| rz.HawkOnFire 0.1 | 2.0 | 13.2% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.0% | 15 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.6% | 7 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 7.9% | 9 |
| spinnercat.Omen 1.0 | 8.5 | 7.7% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 26 / 35 | 5244 |
| 2 | 1 | 69.2 | 85.7 | 26 / 35 | 4949 |
| 3 | 1 | 71.9 | 93.0 | 29 / 35 | 5478 |
| 4 | 1 | 68.9 | 83.8 | 21 / 35 | 5145 |
| 5 | 1 | 72.0 | 93.0 | 30 / 35 | 5521 |
| 6 | 1 | 69.9 | 89.5 | 26 / 35 | 4779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 97% |
| nz.jdc.nano.GridFu 1.0 | 40 | 95% |
| maribo.IotaCT 1.1 | 17 | 94% |
| stelo.PatternRobot 1.0 | 13 | 69% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 12 | 23% | 22 |
| stelo.PatternRobot 1.0 | 10 | 19% | 22 |
| ratosh.Wesco 1.4 | 8 | 15% | 19 |
| rz.HawkOnFire 0.1 | 7 | 13% | 63 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 11% | 9 |
| maribo.IotaCT 1.1 | 2 | 4% | 22 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.2 | 185 / 210 | 1.52 | 22.1% | 39956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 22.1% | 185 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.2% | 8 |
| baal.nano.N 1.42 | 3.3 | 10.8% | 3 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 0 |
| zyx.micro.Ant 1.1 | 4.8 | 9.1% | 5 |
| sanja.First 0.1 | 6.2 | 8.2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.9% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.1 | 32 / 35 | 6645 |
| 2 | 1 | 72.1 | 94.3 | 31 / 35 | 6655 |
| 3 | 1 | 72.3 | 95.2 | 31 / 35 | 6298 |
| 4 | 1 | 71.3 | 90.2 | 30 / 35 | 6624 |
| 5 | 1 | 73.0 | 97.8 | 31 / 35 | 6847 |
| 6 | 1 | 72.5 | 95.6 | 30 / 35 | 6887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 96% |
| cvt.Firsty 1.0 | 30 | 93% |
| baal.nano.N 1.42 | 28 | 100% |
| zyx.micro.Ant 1.1 | 22 | 95% |
| sanja.First 0.1 | 21 | 81% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 0% |

Hadur died in 25 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 28% | 41 |
| sanja.First 0.1 | 4 | 16% | 24 |
| cvt.Firsty 1.0 | 4 | 16% | 23 |
| tvv.nano.Polaris 1.2 | 3 | 12% | 63 |
| Grystrion.TrackerWO 1.0 | 3 | 12% | 17 |
| squidM.TentalceMeleeNano 1.1 | 2 | 8% | 9 |
| baal.nano.N 1.42 | 1 | 4% | 22 |
| sample.RamFire 1.0 | 1 | 4% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.9 | 91 / 210 | 3.35 | 16.3% | 31212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.2 | 16.3% | 91 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 71 |
| cs.Wren 1.0 | 3.3 | 12.1% | 12 |
| js.PinBall 1.6 | 4.0 | 11.1% | 11 |
| mz.Cork 0.1 | 4.8 | 10.8% | 7 |
| joe.ADinosaur 1.0 | 6.2 | 9.4% | 6 |
| evd.X1 0.01 | 6.8 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 5 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 73.0 | 11 / 35 | 5220 |
| 2 | 2 | 61.1 | 65.1 | 12 / 35 | 4473 |
| 3 | 1 | 61.9 | 66.7 | 16 / 35 | 4752 |
| 4 | 1 | 66.7 | 80.6 | 14 / 35 | 5489 |
| 5 | 1 | 64.5 | 72.4 | 17 / 35 | 5254 |
| 6 | 1 | 69.1 | 85.4 | 21 / 35 | 6024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 57% |
| cs.Wren 1.0 | 23 | 83% |
| js.PinBall 1.6 | 13 | 100% |
| mz.Cork 0.1 | 11 | 100% |
| evd.X1 0.01 | 5 | 80% |
| joe.ADinosaur 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 62 | 52% | 99 |
| evd.X1 0.01 | 18 | 15% | 19 |
| joe.ADinosaur 1.0 | 11 | 9% | 12 |
| cs.Wren 1.0 | 10 | 8% | 30 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| mz.Cork 0.1 | 5 | 4% | 16 |
| js.PinBall 1.6 | 3 | 3% | 16 |
| donjezza.Jezza 1.0 | 3 | 3% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.9 | 137 / 210 | 2.27 | 19.4% | 30341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.4% | 137 |
| myl.nano.Graviton 1.10 | 2.2 | 11.8% | 21 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.5% | 19 |
| ntc.Opposite 1.5 | 4.0 | 10.7% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.7% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 1 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.3 | 20 / 35 | 4712 |
| 2 | 1 | 69.2 | 88.6 | 25 / 35 | 4923 |
| 3 | 1 | 69.1 | 86.0 | 25 / 35 | 5113 |
| 4 | 1 | 69.7 | 87.6 | 22 / 35 | 5269 |
| 5 | 1 | 68.7 | 85.1 | 21 / 35 | 5290 |
| 6 | 1 | 69.2 | 87.6 | 24 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 86% |
| stelo.AreaTargetingBot 1.1 | 30 | 73% |
| ntc.Opposite 1.5 | 19 | 84% |
| disan.Chair 2.2.0 | 17 | 94% |
| DBall.NUKE 0.1 | 16 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| donjezza.Muncho 1.0 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 73 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 24 | 33% | 47 |
| myl.nano.Graviton 1.10 | 16 | 22% | 47 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 26 |
| ntc.Opposite 1.5 | 10 | 14% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 5% | 17 |
| disan.Chair 2.2.0 | 2 | 3% | 14 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 2 | 3% | 9 |
| DBall.NUKE 0.1 | 0 | 0% | 15 |

## Melee bench: F13

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.8 | 77 / 210 | 3.81 | 15.1% | 26391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 2.0 | 13.8% | 43 |
| hadur117.micro.SaorWTO 0.1 | 2.0 | 15.1% | 77 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 27 |
| yagami.Tidus 0.11 | 4.3 | 12.1% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 58.4 | 10 / 35 | 4172 |
| 2 | 1 | 66.4 | 79.0 | 17 / 35 | 4761 |
| 3 | 2 | 62.0 | 62.9 | 11 / 35 | 4426 |
| 4 | 3 | 60.7 | 61.0 | 8 / 35 | 4129 |
| 5 | 1 | 65.3 | 77.5 | 16 / 35 | 4350 |
| 6 | 1 | 65.3 | 74.0 | 15 / 35 | 4553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 76% |
| kawigi.micro.Shiz 1.1 | 19 | 79% |
| yagami.Tidus 0.11 | 15 | 67% |
| ejb.Polaris 1.0.1 | 13 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 35% | 61 |
| yagami.Tidus 0.11 | 24 | 18% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 45 |
| ejb.Polaris 1.0.1 | 10 | 8% | 18 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 22 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| step.nanoPri 1.0 | 9 | 7% | 9 |
| kurios.DOSexe .9a | 7 | 5% | 7 |

## Melee bench: F14

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.1 | 128 / 210 | 3.06 | 17.2% | 27494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 17.2% | 128 |
| wee.Gem 1.8.4 | 2.8 | 12.1% | 24 |
| bzdp.Pansy 2.1 | 3.5 | 11.5% | 21 |
| ratosh.Nobo 0.21 | 3.7 | 11.4% | 11 |
| wompi.Quokka 1.6 | 4.7 | 11.2% | 14 |
| m3thos.Eva00 1.1 | 5.7 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 9.2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.7 | 21 / 35 | 4934 |
| 2 | 1 | 65.2 | 75.2 | 22 / 35 | 4386 |
| 3 | 1 | 64.9 | 73.3 | 19 / 35 | 4611 |
| 4 | 1 | 67.7 | 84.4 | 25 / 35 | 4747 |
| 5 | 1 | 63.5 | 72.7 | 19 / 35 | 4019 |
| 6 | 1 | 66.4 | 78.4 | 22 / 35 | 4797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 46 | 93% |
| wompi.Quokka 1.6 | 28 | 100% |
| bzdp.Pansy 2.1 | 27 | 85% |
| ratosh.Nobo 0.21 | 18 | 83% |
| m3thos.Eva00 1.1 | 11 | 82% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 18% | 27 |
| bzdp.Pansy 2.1 | 14 | 17% | 40 |
| wee.Gem 1.8.4 | 11 | 13% | 50 |
| maribo.FollowFire 1 | 11 | 13% | 12 |
| m3thos.Eva00 1.1 | 10 | 12% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 14 |
| wompi.Quokka 1.6 | 5 | 6% | 17 |
| bayen.UbaMicro 1.4 | 4 | 5% | 11 |

## Melee bench: F15

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 82.1 | 61 / 210 | 2.61 | 19.1% | 44468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.3% | 137 |
| hadur117.micro.SaorWTO 0.1 | 1.8 | 19.1% | 61 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 8 |
| ayk.WallHugger 1.0 | 5.0 | 9.5% | 0 |
| stuff.Vlad 0.1 | 5.0 | 9.1% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.2% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 2 |
| sample.SittingDuck 1.0 | 9.0 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 78.4 | 10 / 35 | 6829 |
| 2 | 2 | 70.6 | 83.2 | 10 / 35 | 7785 |
| 3 | 2 | 69.9 | 79.4 | 11 / 35 | 7695 |
| 4 | 1 | 71.9 | 87.3 | 9 / 35 | 8155 |
| 5 | 2 | 69.6 | 81.6 | 10 / 35 | 7122 |
| 6 | 2 | 69.8 | 82.9 | 11 / 35 | 6882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 22% |
| mz.NanoGod 2.02 | 17 | 88% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 4 | 75% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 104 | 70% | 134 |
| mz.NanoGod 2.02 | 15 | 10% | 29 |
| ayk.WallHugger 1.0 | 11 | 7% | 18 |
| exauge.GateKeeper 1.1.121g | 9 | 6% | 16 |
| stuff.Vlad 0.1 | 5 | 3% | 6 |
| stelo.PianistNano 1.2 | 4 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.1 | 112 / 210 | 3.06 | 17.4% | 30296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 17.4% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 30 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 20 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.8% | 3 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.3 | 18 / 35 | 4862 |
| 2 | 1 | 64.6 | 73.0 | 15 / 35 | 4944 |
| 3 | 1 | 64.8 | 70.8 | 16 / 35 | 5171 |
| 4 | 1 | 68.5 | 85.7 | 23 / 35 | 5172 |
| 5 | 1 | 64.0 | 69.5 | 19 / 35 | 4679 |
| 6 | 1 | 69.4 | 89.5 | 21 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 65% |
| dummy.micro.Sparrow 2.5 | 32 | 94% |
| bvh.micro.Freya 0.3 | 22 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 74% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 4 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 26% | 61 |
| dummy.micro.Sparrow 2.5 | 14 | 14% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 17 |
| conscience.Electron 1.3g | 13 | 13% | 14 |
| dl.BetterWalls 1.0 | 9 | 9% | 18 |
| bvh.micro.Freya 0.3 | 7 | 7% | 15 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 10 |

## Melee bench: F17

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 90.0 | 164 / 210 | 1.90 | 21.9% | 42170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.9% | 164 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.6% | 8 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 9 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 16 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.8% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.6% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.8% | 0 |
| sample.Corners 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 87.3 | 26 / 35 | 7274 |
| 2 | 1 | 72.7 | 91.1 | 29 / 35 | 6864 |
| 3 | 1 | 72.3 | 90.8 | 27 / 35 | 7197 |
| 4 | 1 | 71.9 | 87.3 | 24 / 35 | 7565 |
| 5 | 1 | 71.4 | 88.9 | 27 / 35 | 6468 |
| 6 | 1 | 73.0 | 94.6 | 31 / 35 | 6802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 58 | 95% |
| sul.Lunar 1.1 | 50 | 98% |
| supersample.SuperBoxBot 1.0 | 32 | 84% |
| dsw.StaticD 1.0 | 13 | 85% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 31% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 17% | 62 |
| dsw.StaticD 1.0 | 8 | 17% | 18 |
| mme.NikeEnhanced 2.0 | 8 | 17% | 17 |
| sul.Lunar 1.1 | 2 | 4% | 43 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 6 |
| sample.Corners 1.0 | 2 | 4% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 13 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 79.2 | 115 / 210 | 2.87 | 18.2% | 37460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 18.2% | 115 |
| radnor.DoctorBob 1.42 | 2.7 | 13.2% | 28 |
| mld.Wisdom 1.0 | 2.8 | 12.2% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 10.9% | 17 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.4% | 6 |
| amz.NanoClone 1.41 | 5.8 | 9.4% | 11 |
| sample.Walls 1.0 | 7.2 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 7 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.3 | 21 / 35 | 6452 |
| 2 | 1 | 69.8 | 84.8 | 21 / 35 | 7134 |
| 3 | 1 | 67.7 | 81.0 | 19 / 35 | 6305 |
| 4 | 1 | 64.2 | 70.5 | 16 / 35 | 5555 |
| 5 | 1 | 66.7 | 78.4 | 16 / 35 | 5936 |
| 6 | 1 | 67.9 | 79.4 | 22 / 35 | 6078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 94% |
| mld.Wisdom 1.0 | 21 | 71% |
| KiraNL.Chupacabra 0.4 | 13 | 92% |
| amz.NanoClone 1.41 | 10 | 70% |
| jangs.ns51 1.0 | 8 | 88% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 31% | 45 |
| radnor.DoctorBob 1.42 | 20 | 21% | 49 |
| KiraNL.Chupacabra 0.4 | 14 | 14% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 13% | 45 |
| amz.NanoClone 1.41 | 10 | 10% | 15 |
| jangs.ns51 1.0 | 6 | 6% | 15 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 4 |

