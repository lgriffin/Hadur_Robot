# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.6 | 145 / 210 | 2.11 | 20.8% | 41835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 20.8% | 145 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 22 |
| mld.Infinity 2.2 | 3.7 | 13.2% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 4 |
| sample.Walls 1.0 | 6.2 | 7.5% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 94.6 | 28 / 35 | 7506 |
| 2 | 1 | 70.5 | 85.1 | 24 / 35 | 6594 |
| 3 | 1 | 68.7 | 76.8 | 20 / 35 | 6555 |
| 4 | 1 | 71.3 | 85.4 | 21 / 35 | 6821 |
| 5 | 1 | 72.7 | 92.7 | 26 / 35 | 7346 |
| 6 | 1 | 72.7 | 91.1 | 26 / 35 | 7013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 96% |
| mld.Infinity 2.2 | 41 | 95% |
| radnor.DoctorBob 1.42 | 31 | 77% |
| jangs.ns51 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 32% | 58 |
| mld.Infinity 2.2 | 15 | 23% | 45 |
| mz.AntiGrav 1.0 | 12 | 18% | 69 |
| amz.NanoClone 1.41 | 8 | 12% | 14 |
| jangs.ns51 1.0 | 3 | 5% | 5 |
| GarmBox.Oranges 1.0 | 3 | 5% | 4 |
| sample.Walls 1.0 | 2 | 3% | 10 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 72.3 | 80 / 210 | 3.50 | 15.7% | 27771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.8 | 15.4% | 81 |
| hadur117.micro.SaorC16 0.1 | 1.8 | 15.7% | 80 |
| mld.DustBunny 3.8 | 2.3 | 14.2% | 22 |
| maribo.melee.BMV 0.1 | 4.5 | 10.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.1% | 8 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.2% | 13 |
| fullsail.SweetTea 1.1 | 8.3 | 7.2% | 2 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 81.3 | 13 / 35 | 4610 |
| 2 | 1 | 67.0 | 87.6 | 17 / 35 | 4840 |
| 3 | 1 | 67.4 | 83.5 | 21 / 35 | 5109 |
| 4 | 3 | 55.1 | 47.0 | 4 / 35 | 4118 |
| 5 | 1 | 67.6 | 86.0 | 19 / 35 | 4856 |
| 6 | 3 | 56.5 | 48.3 | 6 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 45 | 82% |
| oog.melee.Mercutio 1.0 | 37 | 59% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 25% | 62 |
| mld.DustBunny 3.8 | 31 | 24% | 62 |
| cs.Grudge 1.0 | 17 | 13% | 17 |
| zyx.nano.Ant 1.1 | 15 | 12% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 10% | 16 |
| maribo.melee.BMV 0.1 | 7 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 17 |
| fullsail.SweetTea 1.1 | 5 | 4% | 7 |
| bzdp.BoxCar 2.0 | 4 | 3% | 5 |

## Melee bench: F03

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 75.4 | 99 / 210 | 3.21 | 17.5% | 33455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 17.5% | 99 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 50 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.1% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.5% | 29 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.8% | 7 |
| fm.mammillarias 1.3 | 5.8 | 9.7% | 9 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.4% | 5 |
| sample.Fire 1.0 | 9.3 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.6 | 19 / 35 | 5965 |
| 2 | 1 | 68.0 | 79.7 | 19 / 35 | 5548 |
| 3 | 1 | 65.3 | 71.1 | 17 / 35 | 5522 |
| 4 | 1 | 64.9 | 70.8 | 14 / 35 | 5069 |
| 5 | 1 | 63.4 | 66.7 | 12 / 35 | 4971 |
| 6 | 1 | 69.2 | 82.5 | 18 / 35 | 6380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 39 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 71% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| myl.nano.KomoriNinja 1.1 | 10 | 90% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 30 | 27% | 77 |
| stelo.SoRobotNanoMelee 1.2 | 27 | 24% | 45 |
| myl.nano.KomoriNinja 1.1 | 17 | 15% | 31 |
| fm.mammillarias 1.3 | 16 | 14% | 20 |
| cb.nano.Insomnia 1.0 | 12 | 11% | 15 |
| sample.Fire 1.0 | 3 | 3% | 7 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 11 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 2 |
| sample.Tracker 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.2 | 124 / 210 | 2.33 | 19.7% | 38111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 19.7% | 124 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.8% | 33 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.8% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 8.7% | 21 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| yk.JahMicro 1.0 | 6.5 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.1% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.8% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 82.5 | 18 / 35 | 6316 |
| 2 | 1 | 67.5 | 80.0 | 19 / 35 | 5798 |
| 3 | 1 | 68.8 | 83.5 | 20 / 35 | 6227 |
| 4 | 1 | 70.3 | 88.6 | 23 / 35 | 6535 |
| 5 | 1 | 70.6 | 88.9 | 22 / 35 | 6772 |
| 6 | 1 | 70.2 | 87.6 | 22 / 35 | 6463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 79% |
| stelo.SoJNanoMelee 1.1 | 29 | 79% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 75% |
| yk.JahMicro 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 43% | 86 |
| stelo.SoJNanoMelee 1.1 | 19 | 22% | 33 |
| tvv.micro.Antares 1.1.1 | 10 | 12% | 33 |
| tj.zombie1n 1.0.1 | 7 | 8% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 20 |
| repositorio.NanoStep 1.0 | 1 | 1% | 9 |
| yk.JahMicro 1.0 | 1 | 1% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 71.5 | 87 / 210 | 3.57 | 15.7% | 27986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 15.7% | 87 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 33 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 26 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.3% | 31 |
| sam.Samspin 1.0 | 5.2 | 10.2% | 12 |
| EBBU.Sim2 1.02 | 5.8 | 9.8% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 69.2 | 10 / 35 | 4701 |
| 2 | 1 | 61.4 | 67.3 | 15 / 35 | 4193 |
| 3 | 1 | 63.8 | 74.0 | 16 / 35 | 4549 |
| 4 | 1 | 61.4 | 67.0 | 11 / 35 | 4406 |
| 5 | 1 | 65.0 | 77.1 | 15 / 35 | 5116 |
| 6 | 1 | 65.5 | 74.3 | 20 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 69% |
| simonton.nano.MeleeSeed 1.8 | 25 | 88% |
| ahf.NanoAndrew .4 | 23 | 83% |
| EBBU.Sim2 1.02 | 13 | 92% |
| sam.Samspin 1.0 | 10 | 70% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 24 | 19% | 29 |
| ahf.NanoAndrew .4 | 15 | 12% | 33 |
| EBBU.Sim2 1.02 | 15 | 12% | 22 |
| sam.Samspin 1.0 | 15 | 12% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 15 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 35 |
| oog.melee.Corsair 1.0 | 13 | 10% | 33 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 17 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.9 | 113 / 210 | 2.81 | 17.5% | 29338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 17.5% | 113 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 40 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.8% | 14 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 10.9% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 8 |
| fm.claire 1.7 | 6.2 | 8.9% | 4 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.5% | 5 |
| sample.SpinBot 1.0 | 7.8 | 7.6% | 7 |
| pa.Improved 1.0 | 9.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 71.4 | 11 / 35 | 4295 |
| 2 | 1 | 65.9 | 77.8 | 20 / 35 | 4694 |
| 3 | 1 | 69.6 | 89.8 | 25 / 35 | 5523 |
| 4 | 1 | 66.0 | 79.4 | 18 / 35 | 4769 |
| 5 | 1 | 66.7 | 81.0 | 18 / 35 | 5165 |
| 6 | 1 | 66.9 | 80.0 | 21 / 35 | 4892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 81% |
| oog.melee.CapuletDroid 1.1 | 34 | 100% |
| gh.nano.Grofvuil 0.2 | 17 | 71% |
| arthord.NanoSatanMelee Beta | 8 | 75% |
| sample.SpinBot 1.0 | 5 | 80% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 5 | 60% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 31% | 67 |
| gh.nano.Grofvuil 0.2 | 15 | 15% | 26 |
| sample.SpinBot 1.0 | 13 | 13% | 16 |
| oog.melee.CapuletDroid 1.1 | 12 | 12% | 45 |
| arthord.NanoSatanMelee Beta | 9 | 9% | 19 |
| fm.claire 1.7 | 9 | 9% | 13 |
| kurios.DOSexe .9b | 7 | 7% | 12 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.6 | 88 / 210 | 2.93 | 17.1% | 31668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.2 | 17.1% | 88 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 42 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.2% | 39 |
| mz.MicroGodMelee 1 | 3.7 | 13.4% | 32 |
| DBall.Anarchy 0.1 | 5.5 | 8.5% | 6 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.1% | 2 |
| mbro.Detektor3 0.1.1 | 7.8 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.5 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.5 | 6.1% | 0 |
| fire219.CatBot 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.8 | 15 / 35 | 5218 |
| 2 | 1 | 68.5 | 84.1 | 21 / 35 | 5828 |
| 3 | 2 | 62.7 | 72.1 | 8 / 35 | 4694 |
| 4 | 1 | 66.6 | 77.8 | 15 / 35 | 5346 |
| 5 | 1 | 67.0 | 82.2 | 13 / 35 | 5423 |
| 6 | 1 | 65.7 | 78.4 | 16 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 44 | 70% |
| mz.MicroGodMelee 1 | 28 | 64% |
| gh.micro.Gruweltje 0.7 | 25 | 60% |
| DBall.Anarchy 0.1 | 14 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 27% | 55 |
| gh.micro.Gruweltje 0.7 | 30 | 25% | 50 |
| mz.MicroGodMelee 1 | 29 | 24% | 49 |
| caimano.Furia_Ceca 0.22 | 9 | 7% | 12 |
| acogdev.alpha 0.2 | 7 | 6% | 11 |
| fire219.CatBot 1.0 | 5 | 4% | 7 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 8 |
| DBall.Anarchy 0.1 | 3 | 2% | 14 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.9 | 91 / 210 | 3.62 | 16.0% | 29914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.3 | 16.0% | 91 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.1% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 26 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.3% | 8 |
| germ.TheMind .2 | 5.3 | 9.5% | 11 |
| awesomeness.Elite 1.0 | 6.2 | 9.1% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.0% | 4 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.0 | 20 / 35 | 5433 |
| 2 | 1 | 63.5 | 69.5 | 17 / 35 | 4802 |
| 3 | 2 | 64.9 | 75.2 | 15 / 35 | 4900 |
| 4 | 1 | 62.6 | 67.0 | 14 / 35 | 4857 |
| 5 | 2 | 60.5 | 61.6 | 10 / 35 | 4667 |
| 6 | 1 | 64.7 | 72.1 | 15 / 35 | 5255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| awesomeness.Elite 1.0 | 12 | 67% |
| stelo.UntouchableNano 1.3 | 8 | 63% |
| germ.TheMind .2 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 29% | 74 |
| germ.TheMind .2 | 24 | 20% | 28 |
| stelo.UntouchableNano 1.3 | 17 | 14% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 13% | 41 |
| awesomeness.Elite 1.0 | 14 | 12% | 21 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 0 |

## Melee bench: F09

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.2 | 113 / 210 | 2.60 | 18.0% | 28321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 18.0% | 113 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 35 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.6% | 16 |
| maribo.IotaCT 1.1 | 4.0 | 10.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.2% | 8 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.4% | 10 |
| stelo.PatternRobot 1.0 | 7.3 | 8.6% | 11 |
| ratosh.Wesco 1.4 | 7.7 | 8.4% | 4 |
| spinnercat.Omen 1.0 | 8.5 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.4 | 22 / 35 | 4850 |
| 2 | 1 | 70.0 | 87.6 | 23 / 35 | 5350 |
| 3 | 1 | 65.9 | 75.9 | 16 / 35 | 4680 |
| 4 | 1 | 66.2 | 79.7 | 18 / 35 | 4125 |
| 5 | 1 | 66.4 | 80.3 | 16 / 35 | 4429 |
| 6 | 1 | 68.4 | 84.4 | 18 / 35 | 4887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 59 | 90% |
| nz.jdc.nano.GridFu 1.0 | 23 | 87% |
| stelo.PatternRobot 1.0 | 14 | 79% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| maribo.IotaCT 1.1 | 9 | 89% |
| timmit.nano.TimDog 0.33 | 7 | 86% |
| ratosh.Wesco 1.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 25 | 26% | 66 |
| stelo.PatternRobot 1.0 | 24 | 25% | 32 |
| ratosh.Wesco 1.4 | 18 | 19% | 23 |
| nz.jdc.nano.GridFu 1.0 | 12 | 12% | 37 |
| timmit.nano.TimDog 0.33 | 8 | 8% | 16 |
| maribo.IotaCT 1.1 | 4 | 4% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 10 |
| spinnercat.Omen 1.0 | 3 | 3% | 7 |

## Melee bench: F10

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.8 | 142 / 210 | 2.19 | 19.8% | 35894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 19.8% | 142 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.2% | 19 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 6 |
| zyx.micro.Ant 1.1 | 4.0 | 10.9% | 25 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 4 |
| sanja.First 0.1 | 6.0 | 8.5% | 6 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.6% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.6% | 6 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.4 | 25 / 35 | 5780 |
| 2 | 1 | 67.7 | 82.5 | 22 / 35 | 5550 |
| 3 | 1 | 68.7 | 83.8 | 21 / 35 | 6045 |
| 4 | 1 | 70.3 | 89.5 | 26 / 35 | 5945 |
| 5 | 1 | 68.9 | 85.4 | 22 / 35 | 6056 |
| 6 | 1 | 71.4 | 94.0 | 26 / 35 | 6518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 35 | 94% |
| baal.nano.N 1.42 | 30 | 93% |
| amk.Punbot.Punbot 0.01 | 21 | 95% |
| zyx.micro.Ant 1.1 | 18 | 78% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| cvt.Firsty 1.0 | 13 | 92% |
| sample.RamFire 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 37 | 54% | 54 |
| Grystrion.TrackerWO 1.0 | 7 | 10% | 18 |
| cvt.Firsty 1.0 | 6 | 9% | 21 |
| tvv.nano.Polaris 1.2 | 5 | 7% | 47 |
| baal.nano.N 1.42 | 5 | 7% | 36 |
| sanja.First 0.1 | 4 | 6% | 21 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 5 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 65.3 | 74 / 210 | 4.12 | 14.6% | 28322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.8 | 14.6% | 74 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 71 |
| cs.Wren 1.0 | 2.8 | 12.8% | 20 |
| mz.Cork 0.1 | 4.5 | 10.6% | 10 |
| js.PinBall 1.6 | 4.5 | 10.9% | 17 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 3 |
| evd.X1 0.01 | 6.5 | 9.0% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 7.2% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 8 |
| PSW.Relentless 0.1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 72.4 | 14 / 35 | 4833 |
| 2 | 1 | 65.1 | 73.3 | 17 / 35 | 5499 |
| 3 | 2 | 57.3 | 57.1 | 8 / 35 | 4047 |
| 4 | 1 | 63.3 | 71.4 | 15 / 35 | 4722 |
| 5 | 4 | 56.3 | 51.1 | 8 / 35 | 4371 |
| 6 | 2 | 62.2 | 66.3 | 12 / 35 | 4850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 51 | 69% |
| cs.Wren 1.0 | 21 | 86% |
| js.PinBall 1.6 | 7 | 86% |
| mz.Cork 0.1 | 6 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 38% | 87 |
| evd.X1 0.01 | 26 | 19% | 28 |
| cs.Wren 1.0 | 17 | 13% | 33 |
| joe.ADinosaur 1.0 | 15 | 11% | 20 |
| js.PinBall 1.6 | 10 | 7% | 14 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| mz.Cork 0.1 | 4 | 3% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.6 | 107 / 210 | 2.74 | 17.7% | 28014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 17.7% | 107 |
| myl.nano.Graviton 1.10 | 2.3 | 12.2% | 33 |
| ntc.Opposite 1.5 | 3.5 | 11.4% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.5% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.3% | 19 |
| DBall.NUKE 0.1 | 7.2 | 8.1% | 4 |
| disan.Chair 2.2.0 | 7.8 | 7.7% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.7% | 14 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.2 | 14 / 35 | 4312 |
| 2 | 1 | 65.6 | 78.7 | 19 / 35 | 4422 |
| 3 | 1 | 68.2 | 85.4 | 21 / 35 | 4940 |
| 4 | 1 | 67.2 | 83.2 | 19 / 35 | 4689 |
| 5 | 1 | 65.6 | 78.1 | 17 / 35 | 4654 |
| 6 | 1 | 67.4 | 83.2 | 17 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 86% |
| myl.nano.Graviton 1.10 | 32 | 78% |
| donjezza.Muncho 1.0 | 12 | 92% |
| ntc.Opposite 1.5 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| DBall.NUKE 0.1 | 9 | 100% |
| disan.Chair 2.2.0 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 27 | 26% | 51 |
| pfvicm.Sobieski 7.2.3b | 19 | 18% | 23 |
| ntc.Opposite 1.5 | 16 | 16% | 33 |
| stelo.AreaTargetingBot 1.1 | 15 | 15% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 21 |
| disan.Chair 2.2.0 | 5 | 5% | 13 |
| donjezza.Muncho 1.0 | 4 | 4% | 14 |
| DBall.NUKE 0.1 | 2 | 2% | 14 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.0 | 67 / 210 | 3.79 | 14.7% | 24673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.7 | 14.7% | 67 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 46 |
| oog.melee.Capulet 1.2 | 3.0 | 13.2% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.8% | 23 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 11.0% | 13 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 66.0 | 10 / 35 | 4164 |
| 2 | 2 | 62.0 | 66.7 | 12 / 35 | 3982 |
| 3 | 2 | 61.4 | 64.1 | 14 / 35 | 3959 |
| 4 | 1 | 63.3 | 73.7 | 7 / 35 | 4199 |
| 5 | 1 | 66.1 | 78.1 | 16 / 35 | 4343 |
| 6 | 3 | 61.1 | 65.7 | 8 / 35 | 4026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 24 | 63% |
| kawigi.micro.Shiz 1.1 | 21 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 76% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 143 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 29% | 55 |
| yagami.Tidus 0.11 | 28 | 20% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% | 39 |
| kawigi.micro.Shiz 1.1 | 15 | 10% | 27 |
| ejb.Polaris 1.0.1 | 15 | 10% | 25 |
| kurios.DOSexe .9a | 7 | 5% | 8 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 73.7 | 106 / 210 | 3.37 | 16.0% | 25357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 16.0% | 106 |
| bzdp.Pansy 2.1 | 3.3 | 11.8% | 22 |
| ratosh.Nobo 0.21 | 3.3 | 12.0% | 20 |
| wee.Gem 1.8.4 | 3.5 | 12.1% | 26 |
| wompi.Quokka 1.6 | 3.8 | 11.7% | 17 |
| m3thos.Eva00 1.1 | 6.2 | 9.8% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 9.3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 66.7 | 15 / 35 | 4289 |
| 2 | 1 | 64.3 | 74.9 | 19 / 35 | 4131 |
| 3 | 1 | 66.3 | 81.6 | 21 / 35 | 4334 |
| 4 | 1 | 60.0 | 62.5 | 13 / 35 | 4012 |
| 5 | 1 | 65.4 | 78.7 | 18 / 35 | 4267 |
| 6 | 1 | 65.1 | 77.5 | 20 / 35 | 4324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 35 | 94% |
| bzdp.Pansy 2.1 | 31 | 90% |
| wompi.Quokka 1.6 | 18 | 94% |
| ratosh.Nobo 0.21 | 18 | 72% |
| m3thos.Eva00 1.1 | 10 | 80% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 17 | 16% | 33 |
| maribo.FollowFire 1 | 17 | 16% | 18 |
| m3thos.Eva00 1.1 | 14 | 13% | 22 |
| bayen.UbaMicro 1.4 | 13 | 12% | 22 |
| bzdp.Pansy 2.1 | 12 | 11% | 36 |
| stelo.MyAgileRobot 0.2 | 12 | 11% | 13 |
| wee.Gem 1.8.4 | 9 | 8% | 41 |
| wompi.Quokka 1.6 | 7 | 7% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.5 | 132 / 210 | 2.04 | 20.9% | 43326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 20.9% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 18 |
| ayk.WallHugger 1.0 | 4.3 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.2% | 4 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 89.2 | 24 / 35 | 7653 |
| 2 | 1 | 71.5 | 87.9 | 20 / 35 | 6939 |
| 3 | 1 | 72.9 | 92.1 | 24 / 35 | 7153 |
| 4 | 1 | 70.8 | 83.5 | 20 / 35 | 6927 |
| 5 | 1 | 71.0 | 84.4 | 21 / 35 | 6931 |
| 6 | 1 | 73.2 | 93.7 | 23 / 35 | 7723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 110 | 85% |
| mz.NanoGod 2.02 | 18 | 44% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 36% | 124 |
| mz.NanoGod 2.02 | 27 | 34% | 40 |
| exauge.GateKeeper 1.1.121g | 10 | 13% | 12 |
| ayk.WallHugger 1.0 | 6 | 8% | 16 |
| stelo.PianistNano 1.2 | 6 | 8% | 9 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.4 | 86 / 210 | 3.84 | 15.6% | 28146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 15.6% | 86 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.4% | 26 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 22 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 26 |
| conscience.Electron 1.3g | 6.3 | 8.9% | 4 |
| stelo.MirrorMicro 1.0 | 6.7 | 9.5% | 16 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 7 |
| dl.BetterWalls 1.0 | 8.5 | 6.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 70.8 | 13 / 35 | 4650 |
| 2 | 1 | 62.1 | 66.7 | 14 / 35 | 4601 |
| 3 | 1 | 63.3 | 70.2 | 15 / 35 | 4679 |
| 4 | 1 | 61.4 | 63.2 | 15 / 35 | 4474 |
| 5 | 1 | 63.3 | 67.6 | 16 / 35 | 4500 |
| 6 | 1 | 64.7 | 72.1 | 13 / 35 | 5242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 29 | 86% |
| dummy.micro.Sparrow 2.5 | 25 | 92% |
| bvh.micro.Freya 0.3 | 20 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 71% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 124 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 16% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 16% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 16% | 20 |
| dummy.micro.Sparrow 2.5 | 17 | 14% | 39 |
| conscience.Electron 1.3g | 17 | 14% | 19 |
| bvh.micro.Freya 0.3 | 14 | 11% | 27 |
| stelo.MirrorMicro 1.0 | 12 | 10% | 19 |
| dl.BetterWalls 1.0 | 4 | 3% | 9 |

## Melee bench: F17

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.9 | 127 / 210 | 2.27 | 20.3% | 41126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 20.3% | 127 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.4% | 22 |
| sul.Lunar 1.1 | 2.8 | 12.2% | 22 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 16 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 5 |
| dsw.StaticD 1.0 | 6.7 | 7.7% | 6 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 7.0% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 6 |
| sample.Corners 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.3 | 22 / 35 | 6953 |
| 2 | 1 | 70.3 | 87.6 | 23 / 35 | 6509 |
| 3 | 1 | 70.0 | 85.1 | 20 / 35 | 6503 |
| 4 | 1 | 70.8 | 88.3 | 23 / 35 | 6862 |
| 5 | 1 | 69.4 | 81.6 | 19 / 35 | 6981 |
| 6 | 1 | 70.6 | 85.7 | 20 / 35 | 7318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 89% |
| supersample.SuperBoxBot 1.0 | 27 | 89% |
| sample.MyFirstRobot 1.0 | 9 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| dsw.StaticD 1.0 | 6 | 67% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 30% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 24% | 53 |
| mme.NikeEnhanced 2.0 | 10 | 12% | 14 |
| sul.Lunar 1.1 | 9 | 11% | 53 |
| dsw.StaticD 1.0 | 6 | 7% | 12 |
| sample.MyFirstRobot 1.0 | 5 | 6% | 17 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 6% | 13 |
| sample.Corners 1.0 | 2 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorC16 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.4 | 103 / 210 | 2.94 | 17.7% | 36003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC16 0.1 | 1.0 | 17.7% | 103 |
| radnor.DoctorBob 1.42 | 2.7 | 13.1% | 31 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 25 |
| amz.NanoClone 1.41 | 4.7 | 11.1% | 12 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.9% | 7 |
| sample.Walls 1.0 | 6.8 | 7.8% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 80.6 | 19 / 35 | 6182 |
| 2 | 1 | 68.2 | 84.8 | 16 / 35 | 6172 |
| 3 | 1 | 66.0 | 77.1 | 19 / 35 | 5562 |
| 4 | 1 | 65.8 | 76.5 | 15 / 35 | 5780 |
| 5 | 1 | 64.8 | 72.7 | 16 / 35 | 5645 |
| 6 | 1 | 67.9 | 78.7 | 18 / 35 | 6662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 88% |
| radnor.DoctorBob 1.42 | 34 | 79% |
| mld.Wisdom 1.0 | 15 | 67% |
| amz.NanoClone 1.41 | 11 | 73% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 60% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 29% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 22% | 59 |
| radnor.DoctorBob 1.42 | 17 | 16% | 45 |
| KiraNL.Chupacabra 0.4 | 17 | 16% | 22 |
| amz.NanoClone 1.41 | 11 | 10% | 19 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 7 |
| sample.Walls 1.0 | 1 | 1% | 6 |

