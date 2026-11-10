# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 84.3 | 107 / 210 | 2.41 | 19.4% | 39091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 19.4% | 107 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 29 |
| mld.Infinity 2.2 | 3.2 | 13.8% | 38 |
| radnor.DoctorBob 1.42 | 3.5 | 13.7% | 24 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 7 |
| sample.Walls 1.0 | 6.3 | 7.5% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 4 |
| sample.Target 1.0 | 9.2 | 4.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.1 | 14 / 35 | 6372 |
| 2 | 1 | 69.4 | 82.2 | 20 / 35 | 6410 |
| 3 | 1 | 70.5 | 86.3 | 16 / 35 | 7073 |
| 4 | 1 | 69.5 | 84.4 | 17 / 35 | 6606 |
| 5 | 1 | 69.1 | 82.5 | 18 / 35 | 6084 |
| 6 | 1 | 70.4 | 85.4 | 22 / 35 | 6546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 49 | 71% |
| radnor.DoctorBob 1.42 | 39 | 77% |
| mld.Infinity 2.2 | 35 | 60% |
| amz.NanoClone 1.41 | 11 | 73% |
| jangs.ns51 1.0 | 8 | 63% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 28 | 27% | 81 |
| radnor.DoctorBob 1.42 | 26 | 25% | 51 |
| mld.Infinity 2.2 | 18 | 17% | 9 |
| amz.NanoClone 1.41 | 14 | 13% | 24 |
| GarmBox.Oranges 1.0 | 7 | 7% | 9 |
| jangs.ns51 1.0 | 5 | 5% | 14 |
| sample.Walls 1.0 | 4 | 4% | 16 |
| arthord.MannyPacquiao Beta | 2 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.3 | 62 / 210 | 3.13 | 16.0% | 27752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.3 | 16.0% | 62 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.3% | 78 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 30 |
| maribo.melee.BMV 0.1 | 4.2 | 10.1% | 4 |
| zyx.nano.Ant 1.1 | 6.0 | 8.7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.4% | 19 |
| fullsail.SweetTea 1.1 | 8.0 | 7.4% | 6 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 77.8 | 11 / 35 | 4532 |
| 2 | 1 | 64.3 | 78.4 | 10 / 35 | 4588 |
| 3 | 1 | 65.8 | 82.5 | 13 / 35 | 4511 |
| 4 | 3 | 58.1 | 53.3 | 2 / 35 | 4642 |
| 5 | 1 | 64.2 | 80.0 | 10 / 35 | 4251 |
| 6 | 1 | 67.1 | 85.7 | 16 / 35 | 5228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 49 | 57% |
| mld.DustBunny 3.8 | 29 | 38% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 18% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 0% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 149 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 55 | 37% | 73 |
| oog.melee.Mercutio 1.0 | 33 | 22% | 58 |
| zyx.nano.Ant 1.1 | 16 | 11% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 10% | 18 |
| fullsail.SweetTea 1.1 | 9 | 6% | 12 |
| maribo.melee.BMV 0.1 | 7 | 5% | 12 |
| cs.Grudge 1.0 | 7 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5 | 3% | 11 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.9 | 58 / 210 | 3.26 | 16.8% | 33523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.3 | 16.8% | 58 |
| myl.micro.Troodon 1.10 | 1.7 | 16.6% | 81 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.5% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.0% | 36 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.4% | 11 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 4 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.7% | 5 |
| sample.Fire 1.0 | 9.3 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 72.1 | 8 / 35 | 5334 |
| 2 | 1 | 67.0 | 78.7 | 10 / 35 | 5950 |
| 3 | 1 | 65.0 | 74.9 | 9 / 35 | 4972 |
| 4 | 1 | 66.4 | 77.5 | 9 / 35 | 5841 |
| 5 | 2 | 64.5 | 69.8 | 9 / 35 | 5577 |
| 6 | 1 | 66.4 | 76.5 | 13 / 35 | 5849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 41% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 25% |
| myl.nano.KomoriNinja 1.1 | 14 | 79% |
| cb.nano.Insomnia 1.0 | 8 | 75% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| sp.Nanos.Ember 1.1 | 4 | 75% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 39% | 86 |
| stelo.SoRobotNanoMelee 1.2 | 37 | 24% | 41 |
| fm.mammillarias 1.3 | 18 | 12% | 20 |
| cb.nano.Insomnia 1.0 | 17 | 11% | 15 |
| myl.nano.KomoriNinja 1.1 | 9 | 6% | 24 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 5 |
| sample.Fire 1.0 | 3 | 2% | 8 |
| sp.Nanos.Ember 1.1 | 3 | 2% | 7 |
| sample.Tracker 1.0 | 2 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.6 | 61 / 210 | 2.75 | 17.9% | 36232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 17.9% | 61 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.9% | 63 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 19 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 10.1% | 37 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.1% | 5 |
| tj.zombie1n 1.0.1 | 5.5 | 8.9% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.0% | 5 |
| yk.JahMicro 1.0 | 7.7 | 7.8% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 6 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.3 | 11 / 35 | 6103 |
| 2 | 1 | 67.5 | 82.9 | 9 / 35 | 6234 |
| 3 | 1 | 66.8 | 79.7 | 11 / 35 | 6189 |
| 4 | 1 | 64.3 | 74.3 | 6 / 35 | 5552 |
| 5 | 1 | 67.0 | 81.3 | 10 / 35 | 6081 |
| 6 | 1 | 68.2 | 85.1 | 14 / 35 | 6073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 27% |
| stelo.SoJNanoMelee 1.1 | 31 | 19% |
| tvv.micro.Antares 1.1.1 | 19 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 64% |
| tj.zombie1n 1.0.1 | 10 | 40% |
| yk.JahMicro 1.0 | 9 | 78% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 25% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 42% | 85 |
| stelo.SoJNanoMelee 1.1 | 44 | 29% | 55 |
| tj.zombie1n 1.0.1 | 10 | 7% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 6% | 12 |
| tvv.micro.Antares 1.1.1 | 6 | 4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 3% | 13 |
| repositorio.NanoStep 1.0 | 5 | 3% | 9 |
| yk.JahMicro 1.0 | 4 | 3% | 2 |
| sample.VelociRobot 1.0 | 3 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.3 | 77 / 210 | 3.22 | 16.4% | 29620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 16.4% | 77 |
| oog.melee.Corsair 1.0 | 2.7 | 11.8% | 22 |
| simonton.nano.MeleeSeed 1.8 | 2.8 | 11.9% | 42 |
| ahf.NanoAndrew .4 | 4.2 | 10.8% | 17 |
| sam.Samspin 1.0 | 5.3 | 10.0% | 23 |
| EBBU.Sim2 1.02 | 6.0 | 9.8% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 70.5 | 13 / 35 | 4777 |
| 2 | 1 | 66.1 | 81.9 | 15 / 35 | 5049 |
| 3 | 1 | 65.5 | 76.2 | 14 / 35 | 5552 |
| 4 | 1 | 62.0 | 71.4 | 9 / 35 | 4306 |
| 5 | 1 | 64.4 | 76.2 | 14 / 35 | 4685 |
| 6 | 1 | 64.9 | 75.9 | 12 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 51% |
| oog.melee.Corsair 1.0 | 29 | 83% |
| ahf.NanoAndrew .4 | 18 | 83% |
| sam.Samspin 1.0 | 16 | 25% |
| EBBU.Sim2 1.02 | 11 | 55% |
| robar.nano.Assertive_Melee 0.2 | 9 | 67% |
| zyx.nano.BacillusComma 1.0 | 5 | 60% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 25 | 19% | 31 |
| simonton.nano.MeleeSeed 1.8 | 24 | 18% | 43 |
| EBBU.Sim2 1.02 | 18 | 13% | 21 |
| sam.Samspin 1.0 | 17 | 13% | 23 |
| zyx.nano.BacillusComma 1.0 | 14 | 10% | 19 |
| oog.melee.Corsair 1.0 | 13 | 10% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 7% | 10 |
| ahf.NanoAndrew .4 | 8 | 6% | 22 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.7 | 81 / 210 | 2.65 | 17.1% | 28611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 17.1% | 81 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.5% | 69 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.5% | 25 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.5% | 7 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 9.0% | 8 |
| fm.claire 1.7 | 6.3 | 8.5% | 3 |
| sample.SpinBot 1.0 | 7.7 | 7.6% | 6 |
| pa.Improved 1.0 | 9.0 | 5.8% | 2 |
| kurios.DOSexe .9b | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 84.1 | 16 / 35 | 4331 |
| 2 | 1 | 64.4 | 78.1 | 12 / 35 | 4549 |
| 3 | 1 | 69.4 | 88.9 | 18 / 35 | 5774 |
| 4 | 1 | 66.1 | 81.6 | 13 / 35 | 4866 |
| 5 | 1 | 66.0 | 83.2 | 12 / 35 | 4873 |
| 6 | 1 | 63.3 | 74.3 | 10 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 34% |
| oog.melee.CapuletDroid 1.1 | 24 | 71% |
| gh.nano.Grofvuil 0.2 | 23 | 70% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| winamp32.micro.MicroMacro 1.0 | 12 | 75% |
| sample.SpinBot 1.0 | 2 | 50% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 46% | 89 |
| oog.melee.CapuletDroid 1.1 | 25 | 19% | 25 |
| gh.nano.Grofvuil 0.2 | 13 | 10% | 34 |
| fm.claire 1.7 | 10 | 8% | 13 |
| sample.SpinBot 1.0 | 8 | 6% | 11 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 15 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 13 |
| pa.Improved 1.0 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.8 | 44 / 210 | 3.27 | 15.9% | 30739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.7 | 15.9% | 44 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 15.1% | 65 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.8% | 48 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 27 |
| caimano.Furia_Ceca 0.22 | 5.2 | 8.7% | 7 |
| DBall.Anarchy 0.1 | 6.0 | 8.2% | 7 |
| acogdev.alpha 0.2 | 7.7 | 6.4% | 2 |
| el.JumpShoot 0.2 | 8.0 | 6.5% | 5 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 6 |
| fire219.CatBot 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 72.4 | 6 / 35 | 4905 |
| 2 | 1 | 65.9 | 77.5 | 9 / 35 | 5652 |
| 3 | 2 | 62.4 | 71.1 | 4 / 35 | 4888 |
| 4 | 1 | 66.5 | 81.9 | 9 / 35 | 5453 |
| 5 | 2 | 64.7 | 77.1 | 8 / 35 | 5244 |
| 6 | 1 | 62.6 | 68.9 | 8 / 35 | 4597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 18% |
| mz.MicroGodMelee 1 | 29 | 62% |
| gh.micro.Gruweltje 0.7 | 21 | 29% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 33% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 75 | 45% | 80 |
| gh.micro.Gruweltje 0.7 | 30 | 18% | 39 |
| caimano.Furia_Ceca 0.22 | 19 | 11% | 21 |
| mz.MicroGodMelee 1 | 18 | 11% | 29 |
| mbro.Detektor3 0.1.1 | 7 | 4% | 9 |
| acogdev.alpha 0.2 | 6 | 4% | 8 |
| DBall.Anarchy 0.1 | 4 | 2% | 13 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 7 |

## Melee bench: F08

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 67.8 | 50 / 210 | 3.90 | 14.6% | 28291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.2% | 83 |
| hadur117.micro.SaorWF 0.1 | 2.0 | 14.6% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.9% | 36 |
| germ.TheMind .2 | 4.8 | 9.8% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.8% | 14 |
| awesomeness.Elite 1.0 | 6.0 | 9.0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 69.8 | 11 / 35 | 4748 |
| 2 | 2 | 60.3 | 66.3 | 7 / 35 | 4228 |
| 3 | 1 | 63.7 | 70.8 | 10 / 35 | 5161 |
| 4 | 2 | 61.1 | 66.3 | 5 / 35 | 4413 |
| 5 | 3 | 62.1 | 67.3 | 8 / 35 | 4979 |
| 6 | 2 | 61.4 | 66.0 | 9 / 35 | 4762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 34% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 55% |
| awesomeness.Elite 1.0 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 4 | 50% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 38% | 79 |
| simonton.nano.WeekendObsession_Melee 1.0 | 39 | 24% | 52 |
| germ.TheMind .2 | 21 | 13% | 23 |
| stelo.UntouchableNano 1.3 | 18 | 11% | 20 |
| qualidafial.MajorDick 1.0.1 | 8 | 5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5 | 3% | 8 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| awesomeness.Elite 1.0 | 3 | 2% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.0 | 77 / 210 | 2.89 | 16.6% | 26258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.2 | 16.6% | 77 |
| rz.HawkOnFire 0.1 | 1.8 | 14.7% | 44 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.6% | 27 |
| maribo.IotaCT 1.1 | 4.5 | 10.6% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 10.3% | 7 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 8 |
| ratosh.Wesco 1.4 | 6.7 | 9.1% | 13 |
| spinnercat.Omen 1.0 | 8.2 | 8.4% | 4 |
| stelo.PatternRobot 1.0 | 8.7 | 7.9% | 11 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 16 / 35 | 4789 |
| 2 | 1 | 65.2 | 76.2 | 12 / 35 | 4336 |
| 3 | 2 | 65.3 | 75.9 | 13 / 35 | 4362 |
| 4 | 1 | 65.7 | 80.6 | 15 / 35 | 4061 |
| 5 | 1 | 63.4 | 74.0 | 10 / 35 | 4273 |
| 6 | 1 | 66.4 | 82.9 | 11 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 61 | 56% |
| nz.jdc.nano.GridFu 1.0 | 26 | 62% |
| maribo.IotaCT 1.1 | 13 | 69% |
| timmit.nano.TimDog 0.33 | 8 | 100% |
| ratosh.Wesco 1.4 | 8 | 38% |
| stelo.PatternRobot 1.0 | 7 | 29% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 44 | 33% | 75 |
| stelo.PatternRobot 1.0 | 28 | 21% | 30 |
| ratosh.Wesco 1.4 | 26 | 20% | 32 |
| nz.jdc.nano.GridFu 1.0 | 17 | 13% | 32 |
| maribo.IotaCT 1.1 | 9 | 7% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 3% | 7 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 10 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.2 | 113 / 210 | 2.42 | 18.8% | 34356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 18.8% | 113 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.4% | 29 |
| baal.nano.N 1.42 | 3.5 | 11.5% | 7 |
| zyx.micro.Ant 1.1 | 3.8 | 10.8% | 26 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.5% | 6 |
| sanja.First 0.1 | 6.3 | 8.6% | 7 |
| cvt.Firsty 1.0 | 7.0 | 8.1% | 20 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 19 / 35 | 5996 |
| 2 | 1 | 68.3 | 82.5 | 19 / 35 | 6182 |
| 3 | 1 | 66.9 | 81.3 | 18 / 35 | 5329 |
| 4 | 1 | 68.7 | 85.7 | 21 / 35 | 5832 |
| 5 | 1 | 66.7 | 82.2 | 17 / 35 | 5269 |
| 6 | 1 | 68.1 | 85.4 | 19 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 89% |
| baal.nano.N 1.42 | 24 | 100% |
| cvt.Firsty 1.0 | 24 | 42% |
| amk.Punbot.Punbot 0.01 | 15 | 93% |
| zyx.micro.Ant 1.1 | 13 | 54% |
| sanja.First 0.1 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 80% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 46 | 47% | 58 |
| cvt.Firsty 1.0 | 23 | 24% | 34 |
| tvv.nano.Polaris 1.2 | 7 | 7% | 33 |
| baal.nano.N 1.42 | 5 | 5% | 31 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 14 |
| sanja.First 0.1 | 4 | 4% | 22 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 6 |
| amk.Punbot.Punbot 0.01 | 3 | 3% | 7 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 63.8 | 40 / 210 | 4.26 | 13.5% | 26651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.2% | 96 |
| hadur117.micro.SaorWF 0.1 | 2.3 | 13.5% | 40 |
| cs.Wren 1.0 | 2.8 | 12.7% | 24 |
| mz.Cork 0.1 | 4.3 | 11.7% | 18 |
| js.PinBall 1.6 | 5.0 | 10.7% | 13 |
| joe.ADinosaur 1.0 | 5.7 | 9.2% | 7 |
| evd.X1 0.01 | 6.8 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.2% | 4 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 6 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 60.0 | 4 / 35 | 4628 |
| 2 | 2 | 61.6 | 67.9 | 11 / 35 | 4735 |
| 3 | 2 | 58.3 | 61.6 | 5 / 35 | 3801 |
| 4 | 2 | 58.3 | 58.7 | 7 / 35 | 4433 |
| 5 | 2 | 62.7 | 74.3 | 7 / 35 | 4654 |
| 6 | 3 | 58.7 | 60.3 | 6 / 35 | 4400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 48 | 31% |
| cs.Wren 1.0 | 17 | 53% |
| mz.Cork 0.1 | 11 | 73% |
| joe.ADinosaur 1.0 | 4 | 75% |
| js.PinBall 1.6 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 33% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 73 | 43% | 89 |
| evd.X1 0.01 | 28 | 16% | 31 |
| cs.Wren 1.0 | 28 | 16% | 31 |
| joe.ADinosaur 1.0 | 17 | 10% | 20 |
| mz.Cork 0.1 | 10 | 6% | 16 |
| js.PinBall 1.6 | 7 | 4% | 11 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.3 | 72 / 210 | 2.87 | 17.1% | 28579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 17.1% | 72 |
| myl.nano.Graviton 1.10 | 2.3 | 12.1% | 45 |
| ntc.Opposite 1.5 | 3.0 | 11.3% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.9% | 28 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.0% | 7 |
| disan.Chair 2.2.0 | 7.0 | 9.1% | 16 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 8 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.3 | 10 / 35 | 5078 |
| 2 | 1 | 66.5 | 83.5 | 10 / 35 | 5030 |
| 3 | 1 | 64.6 | 76.8 | 11 / 35 | 4516 |
| 4 | 1 | 64.7 | 77.1 | 14 / 35 | 4459 |
| 5 | 1 | 66.2 | 81.0 | 14 / 35 | 4838 |
| 6 | 1 | 65.0 | 76.8 | 13 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 32 | 38% |
| stelo.AreaTargetingBot 1.1 | 27 | 44% |
| ntc.Opposite 1.5 | 18 | 61% |
| disan.Chair 2.2.0 | 14 | 57% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 77% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| donjezza.Muncho 1.0 | 6 | 67% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 26% | 49 |
| stelo.AreaTargetingBot 1.1 | 30 | 21% | 43 |
| ntc.Opposite 1.5 | 26 | 19% | 29 |
| pfvicm.Sobieski 7.2.3b | 13 | 9% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 6% | 18 |
| donjezza.Muncho 1.0 | 9 | 6% | 16 |
| disan.Chair 2.2.0 | 8 | 6% | 12 |
| DBall.NUKE 0.1 | 5 | 4% | 14 |
| pbg.R2D2 1.0 | 3 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 62.2 | 22 / 210 | 4.40 | 13.0% | 23676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.8 | 14.7% | 58 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 68 |
| hadur117.micro.SaorWF 0.1 | 3.5 | 13.0% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 34 |
| yagami.Tidus 0.11 | 4.0 | 12.5% | 15 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 12 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 59.7 | 3 / 35 | 3809 |
| 2 | 4 | 60.8 | 67.9 | 3 / 35 | 3596 |
| 3 | 3 | 60.0 | 60.6 | 5 / 35 | 4203 |
| 4 | 2 | 62.0 | 68.3 | 5 / 35 | 4408 |
| 5 | 5 | 57.0 | 54.3 | 2 / 35 | 3722 |
| 6 | 4 | 59.6 | 62.5 | 4 / 35 | 3938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 13 | 38% |
| yagami.Tidus 0.11 | 10 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 44% |
| oog.melee.Capulet 1.2 | 9 | 22% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 28% | 54 |
| yagami.Tidus 0.11 | 50 | 27% | 55 |
| kawigi.micro.Shiz 1.1 | 45 | 24% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 13% | 31 |
| ejb.Polaris 1.0.1 | 7 | 4% | 10 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.7 | 90 / 210 | 3.00 | 16.3% | 24808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 16.3% | 90 |
| bzdp.Pansy 2.1 | 3.2 | 12.7% | 32 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 38 |
| wompi.Quokka 1.6 | 3.3 | 11.8% | 22 |
| ratosh.Nobo 0.21 | 4.7 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 10 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 3 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 72.7 | 11 / 35 | 3940 |
| 2 | 1 | 63.8 | 77.5 | 14 / 35 | 3596 |
| 3 | 1 | 64.3 | 76.8 | 17 / 35 | 4213 |
| 4 | 1 | 66.3 | 81.0 | 15 / 35 | 4627 |
| 5 | 1 | 65.4 | 79.4 | 14 / 35 | 4346 |
| 6 | 1 | 64.9 | 79.0 | 19 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 69% |
| wee.Gem 1.8.4 | 38 | 61% |
| wompi.Quokka 1.6 | 25 | 80% |
| ratosh.Nobo 0.21 | 13 | 77% |
| m3thos.Eva00 1.1 | 10 | 50% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 25 | 20% | 45 |
| wee.Gem 1.8.4 | 18 | 14% | 43 |
| m3thos.Eva00 1.1 | 18 | 14% | 25 |
| bayen.UbaMicro 1.4 | 18 | 14% | 21 |
| wompi.Quokka 1.6 | 13 | 10% | 30 |
| stelo.MyAgileRobot 0.2 | 10 | 8% | 10 |
| maribo.FollowFire 1 | 9 | 7% | 10 |
| ratosh.Nobo 0.21 | 7 | 6% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 84.4 | 88 / 210 | 2.40 | 19.5% | 41526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.2 | 19.5% | 88 |
| wompi.Wallaby 5.1 | 1.8 | 18.3% | 93 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 12 |
| ayk.WallHugger 1.0 | 4.7 | 10.0% | 7 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.6% | 8 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 84.8 | 12 / 35 | 6371 |
| 2 | 1 | 70.4 | 83.5 | 13 / 35 | 7211 |
| 3 | 1 | 71.6 | 88.9 | 18 / 35 | 7250 |
| 4 | 1 | 70.5 | 85.7 | 14 / 35 | 6908 |
| 5 | 1 | 69.3 | 79.4 | 14 / 35 | 6857 |
| 6 | 1 | 70.4 | 84.1 | 17 / 35 | 6929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 45% |
| mz.NanoGod 2.02 | 14 | 93% |
| exauge.GateKeeper 1.1.121g | 12 | 67% |
| drd.Dreadknoght 0.9 | 9 | 89% |
| ayk.WallHugger 1.0 | 6 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 79 | 64% | 138 |
| exauge.GateKeeper 1.1.121g | 17 | 14% | 21 |
| mz.NanoGod 2.02 | 11 | 9% | 19 |
| ayk.WallHugger 1.0 | 9 | 7% | 13 |
| stelo.PianistNano 1.2 | 4 | 3% | 4 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 11 |

## Melee bench: F16

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 67.9 | 55 / 210 | 3.89 | 14.9% | 27437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.2 | 14.9% | 55 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 42 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.5% | 34 |
| bvh.micro.Freya 0.3 | 4.3 | 11.1% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.6% | 32 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.3 | 7.3% | 14 |
| dl.BetterWalls 1.0 | 9.0 | 6.6% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.1 | 62.9 | 7 / 35 | 4717 |
| 2 | 2 | 59.9 | 62.2 | 9 / 35 | 4349 |
| 3 | 1 | 62.2 | 68.3 | 10 / 35 | 4627 |
| 4 | 1 | 62.7 | 70.2 | 9 / 35 | 4516 |
| 5 | 1 | 62.7 | 73.3 | 11 / 35 | 4263 |
| 6 | 1 | 63.2 | 70.8 | 9 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 30% |
| dummy.micro.Sparrow 2.5 | 27 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 25% |
| bvh.micro.Freya 0.3 | 11 | 91% |
| stelo.MirrorMicro 1.0 | 7 | 43% |
| ap.Frederick 1.1 | 6 | 83% |

Hadur died in 155 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 29% | 63 |
| davidalves.net.DuelistMicroMelee 1.4 | 34 | 22% | 42 |
| dummy.micro.Sparrow 2.5 | 22 | 14% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 13% | 24 |
| conscience.Electron 1.3g | 15 | 10% | 19 |
| bvh.micro.Freya 0.3 | 7 | 5% | 8 |
| stelo.MirrorMicro 1.0 | 6 | 4% | 9 |
| dl.BetterWalls 1.0 | 5 | 3% | 9 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.1 | 83 / 210 | 2.52 | 18.9% | 37880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 18.9% | 83 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.2% | 38 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.7% | 35 |
| sul.Lunar 1.1 | 3.8 | 11.5% | 21 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.3% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 9 |
| tlp.ThreeLeggedPig 1 | 7.7 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.8% | 7 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.3% | 4 |
| sample.Corners 1.0 | 9.7 | 5.6% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.8 | 14 / 35 | 6381 |
| 2 | 1 | 67.9 | 81.3 | 15 / 35 | 5975 |
| 3 | 1 | 69.8 | 83.2 | 18 / 35 | 6953 |
| 4 | 1 | 67.7 | 82.9 | 11 / 35 | 6272 |
| 5 | 1 | 67.3 | 80.6 | 12 / 35 | 6027 |
| 6 | 1 | 68.9 | 86.0 | 13 / 35 | 6272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 64% |
| supersample.SuperBoxBot 1.0 | 23 | 43% |
| sul.Lunar 1.1 | 20 | 90% |
| dsw.StaticD 1.0 | 11 | 64% |
| mme.NikeEnhanced 2.0 | 8 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 63% |
| sample.MyFirstRobot 1.0 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 2 | 50% |

Hadur died in 129 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 48 | 37% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 22% | 57 |
| mme.NikeEnhanced 2.0 | 14 | 11% | 16 |
| sul.Lunar 1.1 | 12 | 9% | 36 |
| sample.MyFirstJuniorRobot 1.0 | 10 | 8% | 17 |
| dsw.StaticD 1.0 | 6 | 5% | 13 |
| sample.MyFirstRobot 1.0 | 5 | 4% | 14 |
| sample.Corners 1.0 | 3 | 2% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.7 | 80 / 210 | 3.28 | 16.5% | 33871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWF 0.1 | 1.0 | 16.5% | 80 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.3% | 37 |
| mld.Wisdom 1.0 | 4.0 | 11.6% | 14 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.7% | 16 |
| amz.NanoClone 1.41 | 5.5 | 10.3% | 16 |
| sample.Walls 1.0 | 7.2 | 8.2% | 6 |
| GarmBox.Oranges 1.0 | 7.7 | 7.6% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.8% | 5 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.3 | 14 / 35 | 5898 |
| 2 | 1 | 67.6 | 84.4 | 16 / 35 | 5865 |
| 3 | 1 | 63.7 | 70.8 | 11 / 35 | 5490 |
| 4 | 1 | 65.3 | 76.2 | 12 / 35 | 5766 |
| 5 | 1 | 64.5 | 70.8 | 15 / 35 | 5554 |
| 6 | 1 | 63.6 | 71.7 | 12 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 65% |
| radnor.DoctorBob 1.42 | 27 | 74% |
| mld.Wisdom 1.0 | 12 | 75% |
| amz.NanoClone 1.41 | 12 | 33% |
| sample.Walls 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 7 | 43% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 22% | 58 |
| KiraNL.Chupacabra 0.4 | 25 | 19% | 31 |
| mld.Wisdom 1.0 | 23 | 18% | 32 |
| amz.NanoClone 1.41 | 19 | 15% | 22 |
| radnor.DoctorBob 1.42 | 16 | 12% | 35 |
| sample.Walls 1.0 | 11 | 8% | 17 |
| GarmBox.Oranges 1.0 | 6 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 9 |

