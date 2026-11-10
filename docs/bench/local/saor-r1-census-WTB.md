# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.0 | 154 / 210 | 1.99 | 21.5% | 43090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.5% | 154 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 16 |
| mz.AntiGrav 1.0 | 2.8 | 13.8% | 9 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 15 |
| amz.NanoClone 1.41 | 4.7 | 10.9% | 9 |
| sample.Walls 1.0 | 6.0 | 7.6% | 4 |
| GarmBox.Oranges 1.0 | 7.2 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 2 |
| sample.Target 1.0 | 9.5 | 3.8% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 91.1 | 26 / 35 | 7640 |
| 2 | 1 | 74.3 | 95.6 | 30 / 35 | 7397 |
| 3 | 1 | 71.7 | 85.4 | 25 / 35 | 7071 |
| 4 | 1 | 73.0 | 90.5 | 28 / 35 | 7436 |
| 5 | 1 | 71.8 | 90.2 | 25 / 35 | 6674 |
| 6 | 1 | 70.3 | 81.6 | 20 / 35 | 6872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 97% |
| radnor.DoctorBob 1.42 | 37 | 81% |
| mld.Infinity 2.2 | 30 | 97% |
| amz.NanoClone 1.41 | 13 | 85% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 41% | 64 |
| amz.NanoClone 1.41 | 12 | 21% | 18 |
| mz.AntiGrav 1.0 | 8 | 14% | 63 |
| mld.Infinity 2.2 | 7 | 13% | 45 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| GarmBox.Oranges 1.0 | 2 | 4% | 2 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.7 | 95 / 210 | 2.83 | 17.5% | 31672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.3 | 17.5% | 95 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.5% | 79 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 19 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 4 |
| zyx.nano.Ant 1.1 | 6.7 | 8.0% | 1 |
| fullsail.SweetTea 1.1 | 7.3 | 6.7% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 3 |
| bzdp.BoxCar 2.0 | 8.8 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.2 | 14 / 35 | 5157 |
| 2 | 1 | 69.1 | 89.8 | 21 / 35 | 5425 |
| 3 | 1 | 67.8 | 82.5 | 17 / 35 | 5540 |
| 4 | 3 | 60.0 | 54.9 | 6 / 35 | 5170 |
| 5 | 1 | 67.3 | 83.8 | 16 / 35 | 5150 |
| 6 | 1 | 68.1 | 84.8 | 21 / 35 | 5230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 63% |
| mld.DustBunny 3.8 | 51 | 82% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 37% | 79 |
| mld.DustBunny 3.8 | 32 | 28% | 67 |
| cs.Grudge 1.0 | 11 | 9% | 10 |
| zyx.nano.Ant 1.1 | 9 | 8% | 16 |
| maribo.melee.BMV 0.1 | 9 | 8% | 11 |
| fullsail.SweetTea 1.1 | 5 | 4% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.4 | 139 / 210 | 2.49 | 20.1% | 38366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.1% | 139 |
| myl.micro.Troodon 1.10 | 2.2 | 14.4% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.0% | 17 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 11.1% | 6 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 5 |
| fm.mammillarias 1.3 | 5.3 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.8% | 6 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |
| sample.Fire 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 82.9 | 23 / 35 | 6399 |
| 2 | 1 | 70.0 | 82.2 | 25 / 35 | 6328 |
| 3 | 1 | 69.1 | 80.0 | 21 / 35 | 6284 |
| 4 | 1 | 69.3 | 81.6 | 22 / 35 | 6066 |
| 5 | 1 | 71.1 | 88.3 | 24 / 35 | 6764 |
| 6 | 1 | 70.8 | 85.7 | 24 / 35 | 6525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 40 | 88% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| sp.Nanos.Ember 1.1 | 15 | 87% |
| myl.nano.KomoriNinja 1.1 | 11 | 82% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Tracker 1.0 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 14 | 20% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 15% | 38 |
| fm.mammillarias 1.3 | 11 | 15% | 14 |
| myl.nano.KomoriNinja 1.1 | 10 | 14% | 33 |
| cb.nano.Insomnia 1.0 | 9 | 13% | 16 |
| cs.sheldor.Talon 1.1 | 9 | 13% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 22 |
| sample.Fire 1.0 | 2 | 3% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.7 | 159 / 210 | 2.01 | 21.1% | 39821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.1% | 159 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.3% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.5% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.5 | 9.5% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.1% | 11 |
| tj.zombie1n 1.0.1 | 6.5 | 8.5% | 5 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.3% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.1 | 28 / 35 | 6714 |
| 2 | 1 | 71.2 | 87.3 | 25 / 35 | 7004 |
| 3 | 1 | 72.3 | 93.7 | 30 / 35 | 6901 |
| 4 | 1 | 68.8 | 82.5 | 24 / 35 | 5970 |
| 5 | 1 | 72.5 | 94.3 | 27 / 35 | 7178 |
| 6 | 1 | 69.0 | 82.5 | 25 / 35 | 6054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 97% |
| stelo.SoJNanoMelee 1.1 | 45 | 91% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| tj.zombie1n 1.0.1 | 15 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| yk.JahMicro 1.0 | 10 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 80% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 31% | 75 |
| stelo.SoJNanoMelee 1.1 | 10 | 20% | 39 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 12% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 10% | 18 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 28 |
| yk.JahMicro 1.0 | 4 | 8% | 16 |
| tj.zombie1n 1.0.1 | 4 | 8% | 11 |
| repositorio.NanoStep 1.0 | 2 | 4% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.7 | 94 / 210 | 3.54 | 16.4% | 30358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.4% | 94 |
| ahf.NanoAndrew .4 | 2.5 | 12.0% | 31 |
| oog.melee.Corsair 1.0 | 2.7 | 12.0% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.7% | 18 |
| EBBU.Sim2 1.02 | 4.8 | 10.1% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 9 |
| sam.Samspin 1.0 | 6.7 | 9.3% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.6 | 16 / 35 | 5084 |
| 2 | 1 | 65.2 | 74.3 | 16 / 35 | 4965 |
| 3 | 1 | 63.2 | 68.3 | 15 / 35 | 5034 |
| 4 | 1 | 65.3 | 74.6 | 16 / 35 | 5149 |
| 5 | 1 | 64.4 | 69.8 | 17 / 35 | 5190 |
| 6 | 1 | 64.5 | 74.9 | 14 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 97% |
| oog.melee.Corsair 1.0 | 25 | 64% |
| ahf.NanoAndrew .4 | 24 | 75% |
| EBBU.Sim2 1.02 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sam.Samspin 1.0 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 19% | 40 |
| EBBU.Sim2 1.02 | 20 | 17% | 31 |
| robar.nano.Assertive_Melee 0.2 | 20 | 17% | 24 |
| ahf.NanoAndrew .4 | 19 | 16% | 44 |
| simonton.nano.MeleeSeed 1.8 | 18 | 16% | 41 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 7 |
| sam.Samspin 1.0 | 4 | 3% | 12 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 6 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.5 | 132 / 210 | 2.40 | 19.0% | 33477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.0% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.5% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 6 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.3% | 4 |
| fm.claire 1.7 | 6.5 | 8.2% | 4 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 1 |
| pa.Improved 1.0 | 8.7 | 6.4% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 20 / 35 | 5701 |
| 2 | 1 | 68.7 | 84.4 | 22 / 35 | 5747 |
| 3 | 1 | 68.2 | 85.7 | 25 / 35 | 4928 |
| 4 | 1 | 69.6 | 85.4 | 24 / 35 | 6086 |
| 5 | 1 | 67.9 | 82.2 | 22 / 35 | 5580 |
| 6 | 1 | 67.4 | 81.0 | 19 / 35 | 5435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 79% |
| oog.melee.CapuletDroid 1.1 | 29 | 100% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| sample.SpinBot 1.0 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 78 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 32% | 66 |
| gh.nano.Grofvuil 0.2 | 23 | 29% | 42 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 39 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 19 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 17 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| sample.SpinBot 1.0 | 3 | 4% | 8 |
| pa.Improved 1.0 | 1 | 1% | 6 |
| fm.claire 1.7 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.7 | 118 / 210 | 2.29 | 19.4% | 36759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.4% | 118 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.4% | 30 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 20 |
| mz.MicroGodMelee 1 | 3.3 | 13.3% | 34 |
| DBall.Anarchy 0.1 | 5.5 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.3% | 1 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 3 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.1 | 19 / 35 | 5845 |
| 2 | 1 | 71.5 | 91.7 | 22 / 35 | 7019 |
| 3 | 1 | 69.3 | 84.4 | 21 / 35 | 6166 |
| 4 | 1 | 69.7 | 89.8 | 22 / 35 | 5537 |
| 5 | 1 | 68.8 | 83.2 | 18 / 35 | 6039 |
| 6 | 1 | 68.0 | 81.0 | 16 / 35 | 6153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 91% |
| mz.MicroGodMelee 1 | 44 | 59% |
| gh.micro.Gruweltje 0.7 | 30 | 67% |
| DBall.Anarchy 0.1 | 11 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| acogdev.alpha 0.2 | 3 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 30 | 33% | 54 |
| gh.micro.Gruweltje 0.7 | 23 | 25% | 53 |
| spinnercat.micro.Tyger 0.1 | 17 | 18% | 58 |
| caimano.Furia_Ceca 0.22 | 9 | 10% | 11 |
| DBall.Anarchy 0.1 | 3 | 3% | 11 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 8 |
| fire219.CatBot 1.0 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.3 | 110 / 210 | 3.58 | 16.5% | 30630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 16.5% | 110 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 12.9% | 28 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.7% | 7 |
| germ.TheMind .2 | 5.2 | 9.5% | 7 |
| awesomeness.Elite 1.0 | 6.2 | 8.9% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.0% | 5 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 76.5 | 17 / 35 | 5066 |
| 2 | 1 | 64.1 | 68.9 | 18 / 35 | 5146 |
| 3 | 1 | 66.4 | 74.6 | 20 / 35 | 5488 |
| 4 | 1 | 65.0 | 70.8 | 20 / 35 | 5202 |
| 5 | 1 | 64.8 | 72.1 | 19 / 35 | 4734 |
| 6 | 1 | 62.7 | 65.1 | 16 / 35 | 4994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 95% |
| germ.TheMind .2 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 0% |

Hadur died in 101 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 43% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 36 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 13 |
| mym.EdgeStalker 1.0 | 8 | 8% | 9 |
| germ.TheMind .2 | 7 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 9 |
| awesomeness.Elite 1.0 | 6 | 6% | 10 |
| sample.Crazy 1.0 | 3 | 3% | 10 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.6 | 144 / 210 | 2.12 | 19.8% | 31472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.8% | 144 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.2% | 21 |
| maribo.IotaCT 1.1 | 4.3 | 10.0% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.4% | 1 |
| timmit.nano.TimDog 0.33 | 6.2 | 8.8% | 6 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 1 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 11 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 21 / 35 | 5245 |
| 2 | 1 | 69.4 | 87.0 | 23 / 35 | 5003 |
| 3 | 1 | 69.5 | 83.5 | 24 / 35 | 5009 |
| 4 | 1 | 69.4 | 86.3 | 23 / 35 | 5180 |
| 5 | 1 | 72.2 | 95.9 | 27 / 35 | 5550 |
| 6 | 1 | 70.6 | 87.6 | 26 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 93% |
| nz.jdc.nano.GridFu 1.0 | 36 | 97% |
| stelo.PatternRobot 1.0 | 15 | 60% |
| ratosh.Wesco 1.4 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| maribo.IotaCT 1.1 | 7 | 86% |
| spinnercat.Omen 1.0 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 5 | 80% |

Hadur died in 66 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 26% | 59 |
| stelo.PatternRobot 1.0 | 11 | 17% | 19 |
| nz.jdc.nano.GridFu 1.0 | 9 | 14% | 50 |
| timmit.nano.TimDog 0.33 | 8 | 12% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 12% | 16 |
| maribo.IotaCT 1.1 | 6 | 9% | 23 |
| ratosh.Wesco 1.4 | 4 | 6% | 14 |
| spinnercat.Omen 1.0 | 3 | 5% | 11 |

## Melee bench: F10

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.3 | 171 / 210 | 1.51 | 21.8% | 39582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.8% | 171 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.7% | 7 |
| baal.nano.N 1.42 | 2.8 | 11.1% | 11 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 1 |
| zyx.micro.Ant 1.1 | 5.2 | 9.2% | 10 |
| sanja.First 0.1 | 5.7 | 8.7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.4% | 0 |
| cvt.Firsty 1.0 | 8.7 | 7.0% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 99.0 | 32 / 35 | 6722 |
| 2 | 1 | 72.2 | 95.6 | 29 / 35 | 6761 |
| 3 | 1 | 71.2 | 93.0 | 29 / 35 | 6084 |
| 4 | 1 | 71.7 | 92.7 | 26 / 35 | 6884 |
| 5 | 1 | 70.6 | 89.5 | 26 / 35 | 6204 |
| 6 | 1 | 72.4 | 95.9 | 29 / 35 | 6927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 95% |
| baal.nano.N 1.42 | 33 | 82% |
| cvt.Firsty 1.0 | 30 | 97% |
| zyx.micro.Ant 1.1 | 21 | 81% |
| sanja.First 0.1 | 20 | 95% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 11 | 28% | 40 |
| zyx.micro.Ant 1.1 | 10 | 25% | 31 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 56 |
| cvt.Firsty 1.0 | 4 | 10% | 28 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 19 |
| sanja.First 0.1 | 3 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 10 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 6 |
| sample.RamFire 1.0 | 1 | 3% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.6 | 88 / 210 | 3.83 | 15.6% | 31587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 15.6% | 88 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 64 |
| cs.Wren 1.0 | 3.0 | 12.6% | 22 |
| mz.Cork 0.1 | 4.2 | 11.4% | 9 |
| js.PinBall 1.6 | 4.7 | 11.1% | 8 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 8 |
| evd.X1 0.01 | 6.7 | 8.3% | 6 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 63.5 | 11 / 35 | 4942 |
| 2 | 1 | 63.1 | 68.6 | 17 / 35 | 4964 |
| 3 | 1 | 63.7 | 70.5 | 15 / 35 | 5241 |
| 4 | 1 | 64.2 | 68.9 | 15 / 35 | 5747 |
| 5 | 1 | 63.0 | 66.0 | 14 / 35 | 5155 |
| 6 | 1 | 65.3 | 74.0 | 16 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 71% |
| cs.Wren 1.0 | 33 | 76% |
| js.PinBall 1.6 | 10 | 90% |
| mz.Cork 0.1 | 7 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 41% | 94 |
| cs.Wren 1.0 | 23 | 19% | 39 |
| js.PinBall 1.6 | 13 | 11% | 22 |
| mz.Cork 0.1 | 10 | 8% | 20 |
| evd.X1 0.01 | 9 | 7% | 11 |
| joe.ADinosaur 1.0 | 9 | 7% | 10 |
| PSW.Relentless 0.1 | 6 | 5% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.5 | 124 / 210 | 2.48 | 18.7% | 29766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.7% | 124 |
| ntc.Opposite 1.5 | 2.5 | 12.1% | 9 |
| stelo.AreaTargetingBot 1.1 | 3.0 | 11.8% | 28 |
| myl.nano.Graviton 1.10 | 3.7 | 11.3% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.0% | 7 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.7% | 3 |
| disan.Chair 2.2.0 | 6.7 | 8.4% | 7 |
| DBall.NUKE 0.1 | 8.0 | 7.3% | 4 |
| pbg.R2D2 1.0 | 9.3 | 5.2% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 21 / 35 | 4678 |
| 2 | 1 | 65.7 | 76.2 | 15 / 35 | 4766 |
| 3 | 1 | 68.7 | 83.2 | 24 / 35 | 5216 |
| 4 | 1 | 68.0 | 82.5 | 20 / 35 | 5212 |
| 5 | 1 | 67.9 | 84.4 | 21 / 35 | 4831 |
| 6 | 1 | 69.2 | 88.3 | 23 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 92% |
| stelo.AreaTargetingBot 1.1 | 37 | 78% |
| ntc.Opposite 1.5 | 21 | 95% |
| disan.Chair 2.2.0 | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| donjezza.Muncho 1.0 | 9 | 100% |
| DBall.NUKE 0.1 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 21 | 24% | 47 |
| pfvicm.Sobieski 7.2.3b | 16 | 19% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 30 |
| ntc.Opposite 1.5 | 13 | 15% | 26 |
| myl.nano.Graviton 1.10 | 10 | 12% | 46 |
| donjezza.Muncho 1.0 | 4 | 5% | 10 |
| DBall.NUKE 0.1 | 4 | 5% | 9 |
| disan.Chair 2.2.0 | 3 | 3% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.6 | 79 / 210 | 3.55 | 15.5% | 26587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 15.5% | 79 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 13.1% | 30 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.1% | 34 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 9.7% | 4 |
| stelo.MirrorNano 1.3 | 7.0 | 8.1% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 67.0 | 11 / 35 | 4394 |
| 2 | 1 | 67.0 | 79.4 | 18 / 35 | 4744 |
| 3 | 1 | 65.6 | 75.9 | 17 / 35 | 4626 |
| 4 | 1 | 64.5 | 73.0 | 11 / 35 | 4514 |
| 5 | 2 | 60.4 | 64.1 | 8 / 35 | 3985 |
| 6 | 1 | 63.3 | 70.5 | 14 / 35 | 4324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 71% |
| kawigi.micro.Shiz 1.1 | 20 | 100% |
| yagami.Tidus 0.11 | 14 | 93% |
| ejb.Polaris 1.0.1 | 8 | 88% |
| stelo.MirrorNano 1.3 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 44% | 82 |
| yagami.Tidus 0.11 | 22 | 17% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 37 |
| ejb.Polaris 1.0.1 | 13 | 10% | 25 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 18 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.8 | 119 / 210 | 3.00 | 17.2% | 28124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.2% | 119 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 30 |
| ratosh.Nobo 0.21 | 3.3 | 11.6% | 15 |
| bzdp.Pansy 2.1 | 3.5 | 11.8% | 17 |
| wompi.Quokka 1.6 | 4.3 | 11.2% | 16 |
| bayen.UbaMicro 1.4 | 6.2 | 9.0% | 10 |
| m3thos.Eva00 1.1 | 6.3 | 9.3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.7 | 21 / 35 | 4909 |
| 2 | 1 | 64.9 | 79.0 | 17 / 35 | 4380 |
| 3 | 1 | 63.9 | 70.2 | 19 / 35 | 4629 |
| 4 | 1 | 67.2 | 81.0 | 23 / 35 | 4813 |
| 5 | 1 | 65.9 | 78.1 | 21 / 35 | 4654 |
| 6 | 1 | 66.3 | 80.0 | 18 / 35 | 4739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 87% |
| wee.Gem 1.8.4 | 37 | 97% |
| ratosh.Nobo 0.21 | 17 | 65% |
| wompi.Quokka 1.6 | 14 | 86% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 17 | 18% | 35 |
| bzdp.Pansy 2.1 | 15 | 16% | 47 |
| bayen.UbaMicro 1.4 | 14 | 15% | 23 |
| wee.Gem 1.8.4 | 10 | 11% | 52 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 13 |
| wompi.Quokka 1.6 | 8 | 9% | 13 |
| m3thos.Eva00 1.1 | 7 | 8% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 8 |
| maribo.FollowFire 1 | 6 | 7% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 88.0 | 127 / 210 | 2.08 | 21.4% | 47168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.4% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 65 |
| mz.NanoGod 2.02 | 3.0 | 13.4% | 10 |
| ayk.WallHugger 1.0 | 4.3 | 9.6% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 1 |
| exauge.GateKeeper 1.1.121g | 5.5 | 8.7% | 3 |
| stelo.PianistNano 1.2 | 7.2 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 7.7 | 6.4% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 85.1 | 20 / 35 | 7927 |
| 2 | 1 | 72.7 | 89.2 | 23 / 35 | 7746 |
| 3 | 1 | 72.0 | 84.4 | 19 / 35 | 8024 |
| 4 | 1 | 73.8 | 92.7 | 24 / 35 | 8273 |
| 5 | 1 | 73.2 | 91.7 | 21 / 35 | 7833 |
| 6 | 1 | 71.6 | 84.8 | 20 / 35 | 7365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 79% |
| mz.NanoGod 2.02 | 13 | 69% |
| drd.Dreadknoght 0.9 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 9 | 78% |
| ayk.WallHugger 1.0 | 7 | 86% |
| stelo.PianistNano 1.2 | 6 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 47% | 127 |
| mz.NanoGod 2.02 | 24 | 29% | 36 |
| exauge.GateKeeper 1.1.121g | 8 | 10% | 11 |
| ayk.WallHugger 1.0 | 7 | 8% | 14 |
| stuff.Vlad 0.1 | 3 | 4% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 10 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.2 | 101 / 210 | 3.50 | 16.5% | 29123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.5% | 101 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.8% | 30 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.4% | 20 |
| bvh.micro.Freya 0.3 | 3.7 | 11.3% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.4% | 18 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 7 |
| conscience.Electron 1.3g | 7.0 | 7.9% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.9% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.1 | 21 / 35 | 5082 |
| 2 | 1 | 63.7 | 67.9 | 17 / 35 | 4843 |
| 3 | 1 | 63.0 | 67.6 | 15 / 35 | 4564 |
| 4 | 1 | 64.8 | 73.0 | 13 / 35 | 5079 |
| 5 | 1 | 63.5 | 71.4 | 15 / 35 | 4624 |
| 6 | 1 | 65.6 | 74.9 | 20 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 30 | 83% |
| voidious.micro.BlitzBat 1.05 | 28 | 93% |
| bvh.micro.Freya 0.3 | 26 | 77% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 25% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 23 | 21% | 44 |
| conscience.Electron 1.3g | 15 | 14% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 42 |
| bvh.micro.Freya 0.3 | 14 | 13% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 13 |
| voidious.micro.BlitzBat 1.05 | 12 | 11% | 37 |
| stelo.MirrorMicro 1.0 | 10 | 9% | 12 |
| dl.BetterWalls 1.0 | 7 | 6% | 14 |

## Melee bench: F17

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 84.8 | 145 / 210 | 2.37 | 20.5% | 40211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.5% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 27 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 14 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 10 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.8% | 5 |
| dsw.StaticD 1.0 | 6.3 | 8.3% | 2 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.6% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 1 |
| sample.Corners 1.0 | 9.0 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 79.4 | 25 / 35 | 6509 |
| 2 | 1 | 71.2 | 88.6 | 25 / 35 | 6580 |
| 3 | 1 | 70.5 | 84.4 | 21 / 35 | 6850 |
| 4 | 1 | 72.1 | 88.9 | 25 / 35 | 7441 |
| 5 | 1 | 70.2 | 81.9 | 25 / 35 | 6602 |
| 6 | 1 | 70.4 | 85.7 | 24 / 35 | 6229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 56 | 86% |
| supersample.SuperBoxBot 1.0 | 35 | 86% |
| sul.Lunar 1.1 | 35 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| dsw.StaticD 1.0 | 6 | 67% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 19 | 29% | 67 |
| supersample.SuperBoxBot 1.0 | 16 | 25% | 40 |
| dsw.StaticD 1.0 | 8 | 12% | 14 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 12 |
| sul.Lunar 1.1 | 5 | 8% | 45 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 8 |
| sample.Corners 1.0 | 2 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F18

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 75.6 | 100 / 210 | 3.20 | 17.5% | 36246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.5% | 100 |
| radnor.DoctorBob 1.42 | 2.5 | 12.9% | 27 |
| mld.Wisdom 1.0 | 3.7 | 12.4% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.0% | 28 |
| KiraNL.Chupacabra 0.4 | 4.7 | 11.2% | 11 |
| amz.NanoClone 1.41 | 5.5 | 10.6% | 10 |
| sample.Walls 1.0 | 7.3 | 7.6% | 8 |
| GarmBox.Oranges 1.0 | 8.2 | 6.3% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 66.0 | 12 / 35 | 5008 |
| 2 | 1 | 67.3 | 79.4 | 16 / 35 | 6386 |
| 3 | 1 | 66.0 | 74.3 | 15 / 35 | 6172 |
| 4 | 1 | 67.7 | 76.8 | 20 / 35 | 6289 |
| 5 | 1 | 68.1 | 81.6 | 18 / 35 | 6037 |
| 6 | 1 | 67.5 | 75.6 | 19 / 35 | 6354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 82% |
| radnor.DoctorBob 1.42 | 26 | 77% |
| mld.Wisdom 1.0 | 16 | 63% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 6 | 83% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 35% | 55 |
| radnor.DoctorBob 1.42 | 20 | 18% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 16% | 59 |
| KiraNL.Chupacabra 0.4 | 16 | 15% | 24 |
| amz.NanoClone 1.41 | 12 | 11% | 16 |
| GarmBox.Oranges 1.0 | 3 | 3% | 1 |
| jangs.ns51 1.0 | 2 | 2% | 4 |
| sample.Walls 1.0 | 1 | 1% | 2 |

