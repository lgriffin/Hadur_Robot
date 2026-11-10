# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 80.7 | 113 / 210 | 2.73 | 18.9% | 39820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 18.9% | 113 |
| mz.AntiGrav 1.0 | 2.5 | 14.9% | 27 |
| mld.Infinity 2.2 | 3.2 | 13.8% | 31 |
| radnor.DoctorBob 1.42 | 3.3 | 14.3% | 32 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 3 |
| sample.Walls 1.0 | 6.0 | 7.7% | 3 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.3 | 21 / 35 | 6819 |
| 2 | 1 | 68.2 | 77.8 | 19 / 35 | 6265 |
| 3 | 1 | 67.2 | 75.6 | 12 / 35 | 6361 |
| 4 | 1 | 68.6 | 79.7 | 20 / 35 | 6279 |
| 5 | 1 | 71.3 | 85.1 | 20 / 35 | 7600 |
| 6 | 1 | 69.3 | 80.0 | 21 / 35 | 6496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 51 | 88% |
| mld.Infinity 2.2 | 32 | 91% |
| radnor.DoctorBob 1.42 | 22 | 77% |
| jangs.ns51 1.0 | 10 | 90% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 35 | 36% | 70 |
| radnor.DoctorBob 1.42 | 31 | 32% | 57 |
| mld.Infinity 2.2 | 14 | 14% | 49 |
| amz.NanoClone 1.41 | 9 | 9% | 13 |
| sample.Walls 1.0 | 5 | 5% | 12 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.6 | 101 / 210 | 2.65 | 17.5% | 32114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 17.5% | 101 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.1% | 61 |
| mld.DustBunny 3.8 | 2.8 | 13.9% | 24 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 8.8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.5% | 9 |
| zyx.nano.Ant 1.1 | 7.3 | 7.8% | 0 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.4% | 5 |
| cs.Grudge 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.3 | 22 / 35 | 5490 |
| 2 | 1 | 67.5 | 82.5 | 19 / 35 | 5634 |
| 3 | 1 | 68.5 | 86.7 | 21 / 35 | 5317 |
| 4 | 1 | 65.3 | 77.1 | 16 / 35 | 5174 |
| 5 | 1 | 64.8 | 77.8 | 10 / 35 | 5167 |
| 6 | 1 | 65.4 | 79.4 | 13 / 35 | 5332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 78% |
| mld.DustBunny 3.8 | 42 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 29% | 76 |
| mld.DustBunny 3.8 | 31 | 28% | 63 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 10% | 17 |
| maribo.melee.BMV 0.1 | 10 | 9% | 15 |
| zyx.nano.Ant 1.1 | 10 | 9% | 14 |
| fullsail.SweetTea 1.1 | 8 | 7% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 11 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.7 | 74 / 210 | 3.82 | 15.6% | 31342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.5 | 15.7% | 71 |
| hadur117.micro.SaorPX 0.1 | 1.5 | 15.6% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 12.7% | 29 |
| cb.nano.Insomnia 1.0 | 4.3 | 11.3% | 14 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 11.7% | 6 |
| fm.mammillarias 1.3 | 6.3 | 9.1% | 7 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.6% | 8 |
| sample.Tracker 1.0 | 9.5 | 4.2% | 0 |
| sample.Fire 1.0 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 61.0 | 10 / 35 | 5029 |
| 2 | 2 | 63.1 | 68.6 | 12 / 35 | 4850 |
| 3 | 2 | 60.2 | 59.0 | 10 / 35 | 4773 |
| 4 | 1 | 67.2 | 78.1 | 17 / 35 | 5622 |
| 5 | 1 | 64.6 | 69.8 | 13 / 35 | 5214 |
| 6 | 1 | 66.4 | 75.6 | 12 / 35 | 5854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 87% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 72% |
| myl.nano.KomoriNinja 1.1 | 10 | 90% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 27% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 28 | 21% | 40 |
| fm.mammillarias 1.3 | 27 | 20% | 30 |
| cb.nano.Insomnia 1.0 | 19 | 14% | 23 |
| myl.nano.KomoriNinja 1.1 | 17 | 13% | 34 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 11 |

## Melee bench: F04

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.6 | 109 / 210 | 2.74 | 18.8% | 39498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 18.8% | 109 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.6% | 31 |
| stelo.SoJNanoMelee 1.1 | 3.3 | 11.6% | 34 |
| tvv.micro.Antares 1.1.1 | 4.0 | 11.0% | 12 |
| tj.zombie1n 1.0.1 | 5.0 | 9.3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.1% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.9% | 2 |
| yk.JahMicro 1.0 | 7.7 | 7.5% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 5.8% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.0 | 17 / 35 | 6221 |
| 2 | 1 | 70.0 | 85.4 | 20 / 35 | 7173 |
| 3 | 1 | 68.9 | 81.9 | 20 / 35 | 6819 |
| 4 | 1 | 67.2 | 74.9 | 15 / 35 | 6878 |
| 5 | 1 | 68.5 | 83.2 | 21 / 35 | 5928 |
| 6 | 1 | 67.6 | 79.4 | 16 / 35 | 6479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 48 | 90% |
| stelo.SoJNanoMelee 1.1 | 38 | 79% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 63% |
| tvv.micro.Antares 1.1.1 | 8 | 75% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 36 | 36% | 85 |
| stelo.SoJNanoMelee 1.1 | 25 | 25% | 40 |
| tvv.micro.Antares 1.1.1 | 12 | 12% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 10% | 20 |
| tj.zombie1n 1.0.1 | 8 | 8% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 7% | 9 |
| yk.JahMicro 1.0 | 3 | 3% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 75.0 | 88 / 210 | 3.25 | 16.2% | 30297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 16.2% | 88 |
| oog.melee.Corsair 1.0 | 2.2 | 13.2% | 42 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.8% | 29 |
| ahf.NanoAndrew .4 | 3.8 | 10.9% | 23 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 7 |
| EBBU.Sim2 1.02 | 6.3 | 9.2% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.6% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.0 | 16 / 35 | 5330 |
| 2 | 1 | 63.7 | 74.9 | 15 / 35 | 4683 |
| 3 | 1 | 62.3 | 69.2 | 12 / 35 | 4994 |
| 4 | 1 | 65.2 | 77.5 | 14 / 35 | 5258 |
| 5 | 1 | 65.5 | 79.0 | 16 / 35 | 5124 |
| 6 | 1 | 64.1 | 75.6 | 15 / 35 | 4908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 44 | 43% |
| simonton.nano.MeleeSeed 1.8 | 18 | 94% |
| sam.Samspin 1.0 | 16 | 100% |
| ahf.NanoAndrew .4 | 14 | 71% |
| zyx.nano.BacillusComma 1.0 | 11 | 100% |
| EBBU.Sim2 1.02 | 11 | 82% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 33% | 64 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 37 |
| ahf.NanoAndrew .4 | 20 | 16% | 33 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 22 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 16 |
| EBBU.Sim2 1.02 | 6 | 5% | 15 |
| sam.Samspin 1.0 | 5 | 4% | 16 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 72.0 | 88 / 210 | 3.52 | 15.7% | 28619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 43 |
| hadur117.micro.SaorPX 0.1 | 1.7 | 15.7% | 88 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.1% | 25 |
| gh.nano.Grofvuil 0.2 | 3.5 | 12.0% | 23 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.7% | 7 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.9% | 11 |
| fm.claire 1.7 | 6.5 | 8.4% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.4% | 11 |
| kurios.DOSexe .9b | 9.3 | 5.2% | 1 |
| pa.Improved 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 71.1 | 17 / 35 | 4799 |
| 2 | 2 | 63.5 | 70.5 | 12 / 35 | 5073 |
| 3 | 2 | 63.5 | 71.1 | 14 / 35 | 4824 |
| 4 | 2 | 62.0 | 69.2 | 15 / 35 | 4171 |
| 5 | 2 | 62.7 | 70.5 | 12 / 35 | 4620 |
| 6 | 1 | 66.4 | 79.4 | 18 / 35 | 5132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 48 | 85% |
| oog.melee.CapuletDroid 1.1 | 23 | 91% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 4 | 75% |
| fm.claire 1.7 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 37% | 87 |
| gh.nano.Grofvuil 0.2 | 24 | 20% | 31 |
| arthord.NanoSatanMelee Beta | 15 | 12% | 22 |
| oog.melee.CapuletDroid 1.1 | 11 | 9% | 33 |
| fm.claire 1.7 | 10 | 8% | 11 |
| sample.SpinBot 1.0 | 9 | 7% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6 | 5% | 9 |
| kurios.DOSexe .9b | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.5 | 81 / 210 | 2.93 | 17.0% | 33264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.2 | 17.0% | 81 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.8% | 38 |
| gh.micro.Gruweltje 0.7 | 3.0 | 14.5% | 31 |
| mz.MicroGodMelee 1 | 3.3 | 14.2% | 41 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 12 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 4 |
| acogdev.alpha 0.2 | 8.2 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 17 / 35 | 5680 |
| 2 | 1 | 64.7 | 74.6 | 14 / 35 | 5129 |
| 3 | 1 | 66.1 | 76.2 | 13 / 35 | 5750 |
| 4 | 2 | 65.7 | 76.5 | 12 / 35 | 5510 |
| 5 | 1 | 67.0 | 81.0 | 13 / 35 | 5887 |
| 6 | 1 | 66.0 | 79.7 | 12 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 80% |
| mz.MicroGodMelee 1 | 34 | 56% |
| gh.micro.Gruweltje 0.7 | 20 | 70% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 5 | 80% |
| acogdev.alpha 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 43 | 33% | 71 |
| mz.MicroGodMelee 1 | 37 | 29% | 58 |
| gh.micro.Gruweltje 0.7 | 28 | 22% | 45 |
| caimano.Furia_Ceca 0.22 | 8 | 6% | 9 |
| acogdev.alpha 0.2 | 5 | 4% | 7 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 8 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 77.8 | 106 / 210 | 3.00 | 17.7% | 35185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.2 | 17.7% | 106 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 16.9% | 56 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.6% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 9.5% | 4 |
| germ.TheMind .2 | 5.3 | 9.1% | 2 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.2% | 1 |
| sample.Crazy 1.0 | 8.5 | 6.7% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.9 | 17 / 35 | 6003 |
| 2 | 2 | 66.1 | 79.0 | 13 / 35 | 5642 |
| 3 | 1 | 67.7 | 78.1 | 21 / 35 | 5829 |
| 4 | 1 | 66.2 | 73.0 | 17 / 35 | 6048 |
| 5 | 1 | 68.9 | 84.8 | 21 / 35 | 5902 |
| 6 | 1 | 66.2 | 75.9 | 17 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 80% |
| germ.TheMind .2 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 25% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 48% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 42 |
| germ.TheMind .2 | 10 | 10% | 20 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 10 |
| awesomeness.Elite 1.0 | 5 | 5% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 3 | 3% | 4 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 76.7 | 108 / 210 | 3.10 | 17.2% | 29883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 17.2% | 108 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 24 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.5% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.3% | 5 |
| maribo.IotaCT 1.1 | 5.0 | 10.3% | 14 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.9% | 11 |
| ratosh.Wesco 1.4 | 7.5 | 8.8% | 9 |
| stelo.PatternRobot 1.0 | 7.8 | 8.1% | 11 |
| spinnercat.Omen 1.0 | 8.0 | 7.9% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 67.0 | 14 / 35 | 4561 |
| 2 | 1 | 68.2 | 82.5 | 19 / 35 | 5360 |
| 3 | 1 | 67.3 | 81.3 | 21 / 35 | 4481 |
| 4 | 1 | 65.6 | 72.4 | 17 / 35 | 5010 |
| 5 | 1 | 68.2 | 78.7 | 20 / 35 | 5483 |
| 6 | 1 | 67.2 | 78.1 | 17 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 53 | 89% |
| nz.jdc.nano.GridFu 1.0 | 26 | 92% |
| stelo.PatternRobot 1.0 | 10 | 80% |
| maribo.IotaCT 1.1 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 36 | 35% | 71 |
| nz.jdc.nano.GridFu 1.0 | 15 | 14% | 46 |
| ratosh.Wesco 1.4 | 14 | 13% | 23 |
| stelo.PatternRobot 1.0 | 14 | 13% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 8% | 12 |
| timmit.nano.TimDog 0.33 | 7 | 7% | 18 |
| maribo.IotaCT 1.1 | 6 | 6% | 15 |
| spinnercat.Omen 1.0 | 4 | 4% | 6 |

## Melee bench: F10

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.2 | 170 / 210 | 1.70 | 21.8% | 44092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 21.8% | 170 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.6% | 13 |
| baal.nano.N 1.42 | 3.3 | 11.0% | 5 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 0 |
| zyx.micro.Ant 1.1 | 4.8 | 9.4% | 4 |
| sanja.First 0.1 | 6.3 | 8.5% | 8 |
| cvt.Firsty 1.0 | 6.8 | 7.7% | 9 |
| amk.Punbot.Punbot 0.01 | 8.0 | 6.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.1% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.4 | 28 / 35 | 7242 |
| 2 | 1 | 73.0 | 96.5 | 32 / 35 | 7379 |
| 3 | 1 | 71.6 | 91.7 | 30 / 35 | 6932 |
| 4 | 1 | 71.2 | 87.9 | 26 / 35 | 7602 |
| 5 | 1 | 71.2 | 88.3 | 25 / 35 | 7580 |
| 6 | 1 | 72.7 | 96.2 | 29 / 35 | 7357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 98% |
| baal.nano.N 1.42 | 33 | 97% |
| zyx.micro.Ant 1.1 | 27 | 96% |
| cvt.Firsty 1.0 | 26 | 96% |
| sanja.First 0.1 | 18 | 89% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 38% | 43 |
| tvv.nano.Polaris 1.2 | 7 | 18% | 59 |
| Grystrion.TrackerWO 1.0 | 6 | 15% | 16 |
| sanja.First 0.1 | 5 | 13% | 25 |
| baal.nano.N 1.42 | 4 | 10% | 30 |
| cvt.Firsty 1.0 | 3 | 8% | 30 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.6 | 77 / 210 | 3.65 | 15.7% | 32188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 17.2% | 95 |
| hadur117.micro.SaorPX 0.1 | 1.8 | 15.7% | 77 |
| cs.Wren 1.0 | 3.0 | 13.5% | 16 |
| js.PinBall 1.6 | 4.0 | 11.0% | 5 |
| mz.Cork 0.1 | 5.2 | 9.8% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 2 |
| evd.X1 0.01 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 2 |
| donjezza.Jezza 1.0 | 8.7 | 5.7% | 6 |
| PSW.Relentless 0.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 64.4 | 8 / 35 | 5242 |
| 2 | 2 | 63.9 | 69.5 | 11 / 35 | 5534 |
| 3 | 2 | 64.2 | 70.8 | 13 / 35 | 5522 |
| 4 | 2 | 63.9 | 69.5 | 15 / 35 | 5252 |
| 5 | 1 | 66.5 | 77.8 | 19 / 35 | 5531 |
| 6 | 2 | 63.7 | 71.4 | 11 / 35 | 5107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 44 | 66% |
| cs.Wren 1.0 | 33 | 88% |
| mz.Cork 0.1 | 9 | 89% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| js.PinBall 1.6 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 43% | 97 |
| cs.Wren 1.0 | 23 | 17% | 40 |
| mz.Cork 0.1 | 18 | 13% | 23 |
| evd.X1 0.01 | 14 | 10% | 13 |
| js.PinBall 1.6 | 7 | 5% | 14 |
| joe.ADinosaur 1.0 | 7 | 5% | 9 |
| PSW.Relentless 0.1 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.8 | 104 / 210 | 3.00 | 17.4% | 29731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 17.4% | 104 |
| stelo.AreaTargetingBot 1.1 | 2.3 | 12.8% | 28 |
| myl.nano.Graviton 1.10 | 3.3 | 11.3% | 27 |
| ntc.Opposite 1.5 | 4.0 | 10.7% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.5 | 8.9% | 6 |
| DBall.NUKE 0.1 | 7.2 | 8.5% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 10 |
| donjezza.Muncho 1.0 | 8.7 | 6.8% | 13 |
| pbg.R2D2 1.0 | 10.0 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.7 | 20 / 35 | 5135 |
| 2 | 1 | 67.8 | 85.7 | 18 / 35 | 4898 |
| 3 | 1 | 66.4 | 79.4 | 17 / 35 | 5040 |
| 4 | 1 | 62.4 | 67.9 | 13 / 35 | 4528 |
| 5 | 1 | 65.8 | 75.2 | 18 / 35 | 5115 |
| 6 | 1 | 66.6 | 79.7 | 18 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 65% |
| myl.nano.Graviton 1.10 | 29 | 97% |
| ntc.Opposite 1.5 | 16 | 75% |
| DBall.NUKE 0.1 | 11 | 100% |
| donjezza.Muncho 1.0 | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| disan.Chair 2.2.0 | 7 | 71% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 26 | 25% | 51 |
| stelo.AreaTargetingBot 1.1 | 25 | 24% | 43 |
| ntc.Opposite 1.5 | 20 | 19% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 24 |
| disan.Chair 2.2.0 | 9 | 8% | 15 |
| donjezza.Muncho 1.0 | 7 | 7% | 14 |
| pfvicm.Sobieski 7.2.3b | 7 | 7% | 12 |
| DBall.NUKE 0.1 | 1 | 1% | 15 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

## Melee bench: F13

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 64.8 | 34 / 210 | 4.17 | 13.3% | 24870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.7% | 52 |
| oog.melee.Capulet 1.2 | 1.7 | 15.1% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.3% | 37 |
| hadur117.micro.SaorPX 0.1 | 3.8 | 13.3% | 34 |
| yagami.Tidus 0.11 | 4.0 | 12.7% | 15 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 11 |
| stelo.MirrorNano 1.3 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 63.5 | 2 / 35 | 4029 |
| 2 | 4 | 60.1 | 61.9 | 7 / 35 | 4277 |
| 3 | 1 | 65.4 | 76.8 | 10 / 35 | 4686 |
| 4 | 5 | 58.4 | 61.0 | 3 / 35 | 3796 |
| 5 | 4 | 60.9 | 65.4 | 6 / 35 | 4124 |
| 6 | 5 | 59.3 | 60.3 | 6 / 35 | 3958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 46% |
| kawigi.micro.Shiz 1.1 | 13 | 92% |
| yagami.Tidus 0.11 | 10 | 90% |
| oog.melee.Capulet 1.2 | 9 | 44% |
| ejb.Polaris 1.0.1 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 45 | 26% | 51 |
| oog.melee.Capulet 1.2 | 41 | 23% | 50 |
| kawigi.micro.Shiz 1.1 | 31 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 16% | 37 |
| ejb.Polaris 1.0.1 | 20 | 11% | 24 |
| stelo.MirrorNano 1.3 | 8 | 5% | 8 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.9 | 114 / 210 | 2.99 | 17.1% | 30253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 17.1% | 114 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 17 |
| wee.Gem 1.8.4 | 2.8 | 12.4% | 29 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 14 |
| ratosh.Nobo 0.21 | 4.7 | 11.2% | 18 |
| m3thos.Eva00 1.1 | 5.5 | 10.1% | 13 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.7 | 22 / 35 | 5506 |
| 2 | 1 | 64.8 | 75.2 | 19 / 35 | 4765 |
| 3 | 1 | 66.2 | 78.7 | 19 / 35 | 5270 |
| 4 | 1 | 63.1 | 68.9 | 16 / 35 | 5106 |
| 5 | 1 | 65.9 | 80.6 | 19 / 35 | 4898 |
| 6 | 1 | 66.7 | 84.1 | 19 / 35 | 4708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 97% |
| wee.Gem 1.8.4 | 34 | 100% |
| wompi.Quokka 1.6 | 21 | 81% |
| m3thos.Eva00 1.1 | 10 | 90% |
| ratosh.Nobo 0.21 | 9 | 56% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 21 | 21% | 51 |
| wee.Gem 1.8.4 | 16 | 16% | 51 |
| ratosh.Nobo 0.21 | 16 | 16% | 26 |
| wompi.Quokka 1.6 | 15 | 15% | 34 |
| m3thos.Eva00 1.1 | 15 | 15% | 26 |
| bayen.UbaMicro 1.4 | 9 | 9% | 11 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 5 |
| maribo.FollowFire 1 | 2 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |

## Melee bench: F15

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 83.4 | 107 / 210 | 2.50 | 19.8% | 45259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.2 | 19.8% | 107 |
| wompi.Wallaby 5.1 | 1.8 | 17.9% | 71 |
| mz.NanoGod 2.02 | 3.0 | 15.1% | 19 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.3% | 9 |
| ayk.WallHugger 1.0 | 4.7 | 10.1% | 3 |
| stuff.Vlad 0.1 | 6.2 | 8.0% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 82.5 | 18 / 35 | 7837 |
| 2 | 1 | 71.2 | 85.4 | 21 / 35 | 7518 |
| 3 | 2 | 70.0 | 80.0 | 17 / 35 | 7206 |
| 4 | 1 | 69.6 | 81.0 | 14 / 35 | 7121 |
| 5 | 1 | 72.5 | 88.9 | 20 / 35 | 7877 |
| 6 | 1 | 70.5 | 82.5 | 17 / 35 | 7700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 79 | 80% |
| exauge.GateKeeper 1.1.121g | 20 | 85% |
| mz.NanoGod 2.02 | 13 | 69% |
| ayk.WallHugger 1.0 | 11 | 82% |
| stuff.Vlad 0.1 | 3 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 37% | 114 |
| mz.NanoGod 2.02 | 38 | 37% | 47 |
| exauge.GateKeeper 1.1.121g | 12 | 12% | 19 |
| ayk.WallHugger 1.0 | 10 | 10% | 20 |
| stuff.Vlad 0.1 | 3 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 77.4 | 97 / 210 | 3.03 | 16.7% | 29445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 16.7% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 29 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.6% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.8% | 25 |
| bvh.micro.Freya 0.3 | 4.8 | 10.5% | 12 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 8 |
| conscience.Electron 1.3g | 7.0 | 7.7% | 0 |
| dl.BetterWalls 1.0 | 8.0 | 6.8% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.2% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.0 | 18 / 35 | 5054 |
| 2 | 1 | 65.2 | 78.7 | 16 / 35 | 4811 |
| 3 | 1 | 65.6 | 77.5 | 16 / 35 | 5141 |
| 4 | 1 | 65.4 | 78.4 | 16 / 35 | 4939 |
| 5 | 1 | 64.6 | 76.5 | 13 / 35 | 5108 |
| 6 | 1 | 63.6 | 73.3 | 18 / 35 | 4392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 88% |
| dummy.micro.Sparrow 2.5 | 30 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| bvh.micro.Freya 0.3 | 11 | 73% |
| stelo.MirrorMicro 1.0 | 5 | 60% |
| dl.BetterWalls 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 28% | 65 |
| dummy.micro.Sparrow 2.5 | 30 | 27% | 53 |
| bvh.micro.Freya 0.3 | 15 | 13% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 12% | 34 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 13 |
| conscience.Electron 1.3g | 5 | 4% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 4% | 7 |
| dl.BetterWalls 1.0 | 4 | 4% | 6 |

## Melee bench: F17

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.8 | 146 / 210 | 2.10 | 21.2% | 44979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.0 | 21.2% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.4% | 9 |
| supersample.SuperBoxBot 1.0 | 3.3 | 12.6% | 21 |
| sul.Lunar 1.1 | 3.5 | 11.8% | 18 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.5% | 1 |
| dsw.StaticD 1.0 | 6.0 | 7.4% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 6.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.3% | 5 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.6% | 2 |
| sample.Corners 1.0 | 9.3 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 85.7 | 23 / 35 | 7345 |
| 2 | 1 | 69.4 | 81.0 | 19 / 35 | 7136 |
| 3 | 1 | 71.6 | 88.3 | 23 / 35 | 7396 |
| 4 | 1 | 72.1 | 87.3 | 26 / 35 | 8016 |
| 5 | 1 | 73.5 | 93.3 | 29 / 35 | 8147 |
| 6 | 1 | 71.9 | 91.4 | 26 / 35 | 6939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 100% |
| sul.Lunar 1.1 | 37 | 100% |
| supersample.SuperBoxBot 1.0 | 28 | 86% |
| sample.MyFirstRobot 1.0 | 12 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| dsw.StaticD 1.0 | 6 | 67% |
| sample.Corners 1.0 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |

Hadur died in 65 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 30 | 46% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 20% | 64 |
| sul.Lunar 1.1 | 5 | 8% | 49 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 8% | 11 |
| dsw.StaticD 1.0 | 4 | 6% | 12 |
| sample.Corners 1.0 | 2 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 11 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorPX 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.5 | 74 / 210 | 3.75 | 15.4% | 33133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPX 0.1 | 1.5 | 15.4% | 74 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.3 | 14.0% | 40 |
| radnor.DoctorBob 1.42 | 2.5 | 13.8% | 40 |
| mld.Wisdom 1.0 | 4.3 | 11.4% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 13 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 10 |
| sample.Walls 1.0 | 7.2 | 8.8% | 11 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.8% | 2 |
| sample.Target 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 66.0 | 10 / 35 | 5557 |
| 2 | 1 | 63.3 | 69.2 | 13 / 35 | 5265 |
| 3 | 3 | 61.1 | 64.1 | 8 / 35 | 5113 |
| 4 | 1 | 64.6 | 71.4 | 15 / 35 | 5664 |
| 5 | 1 | 66.5 | 78.1 | 15 / 35 | 6321 |
| 6 | 1 | 62.5 | 67.9 | 13 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 79% |
| radnor.DoctorBob 1.42 | 24 | 75% |
| amz.NanoClone 1.41 | 12 | 67% |
| mld.Wisdom 1.0 | 10 | 80% |
| KiraNL.Chupacabra 0.4 | 5 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 23% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 21% | 58 |
| radnor.DoctorBob 1.42 | 27 | 20% | 50 |
| amz.NanoClone 1.41 | 16 | 12% | 21 |
| KiraNL.Chupacabra 0.4 | 15 | 11% | 19 |
| GarmBox.Oranges 1.0 | 10 | 7% | 11 |
| sample.Walls 1.0 | 5 | 4% | 8 |
| jangs.ns51 1.0 | 4 | 3% | 5 |

