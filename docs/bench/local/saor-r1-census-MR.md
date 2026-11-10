# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.8 | 90 / 210 | 2.82 | 17.7% | 35462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.2 | 17.7% | 90 |
| radnor.DoctorBob 1.42 | 2.2 | 15.3% | 38 |
| mz.AntiGrav 1.0 | 3.0 | 15.3% | 37 |
| mld.Infinity 2.2 | 3.7 | 13.5% | 36 |
| amz.NanoClone 1.41 | 5.2 | 9.6% | 1 |
| sample.Walls 1.0 | 5.8 | 8.6% | 4 |
| GarmBox.Oranges 1.0 | 7.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.5% | 4 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.2 | 18 / 35 | 5963 |
| 2 | 1 | 66.0 | 75.9 | 11 / 35 | 5860 |
| 3 | 2 | 65.5 | 74.9 | 13 / 35 | 5263 |
| 4 | 1 | 67.3 | 79.0 | 14 / 35 | 6014 |
| 5 | 1 | 67.3 | 78.1 | 16 / 35 | 5938 |
| 6 | 1 | 70.6 | 87.6 | 18 / 35 | 6424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 44 | 66% |
| radnor.DoctorBob 1.42 | 39 | 77% |
| mld.Infinity 2.2 | 26 | 65% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 50% |
| sample.Target 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 35 | 29% | 72 |
| sample.Walls 1.0 | 32 | 27% | 40 |
| mld.Infinity 2.2 | 20 | 17% | 18 |
| radnor.DoctorBob 1.42 | 17 | 14% | 50 |
| amz.NanoClone 1.41 | 7 | 6% | 12 |
| jangs.ns51 1.0 | 6 | 5% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.8 | 94 / 210 | 2.00 | 17.8% | 27219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.2 | 17.8% | 94 |
| mld.DustBunny 3.8 | 2.3 | 14.9% | 39 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.5% | 51 |
| maribo.melee.BMV 0.1 | 4.3 | 10.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.5% | 6 |
| zyx.nano.Ant 1.1 | 6.3 | 8.3% | 6 |
| fullsail.SweetTea 1.1 | 6.7 | 8.1% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.6% | 5 |
| bzdp.BoxCar 2.0 | 9.2 | 5.8% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 91.4 | 17 / 35 | 4356 |
| 2 | 2 | 65.1 | 86.0 | 11 / 35 | 4053 |
| 3 | 1 | 65.7 | 85.4 | 14 / 35 | 4291 |
| 4 | 1 | 67.4 | 90.8 | 15 / 35 | 4364 |
| 5 | 1 | 68.6 | 90.2 | 20 / 35 | 4993 |
| 6 | 1 | 68.1 | 89.2 | 17 / 35 | 5162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 78 | 65% |
| mld.DustBunny 3.8 | 47 | 40% |
| fullsail.SweetTea 1.1 | 11 | 64% |
| djdjdj.NanoSkunk10 1.0 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 57% |
| zyx.nano.Ant 1.1 | 5 | 40% |
| maribo.melee.BMV 0.1 | 5 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 50 | 43% | 73 |
| oog.melee.Mercutio 1.0 | 34 | 29% | 77 |
| fullsail.SweetTea 1.1 | 13 | 11% | 19 |
| zyx.nano.Ant 1.1 | 8 | 7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 4% | 12 |
| maribo.melee.BMV 0.1 | 3 | 3% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.1 | 67 / 210 | 3.33 | 15.5% | 26586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.3 | 16.4% | 70 |
| hadur117.micro.SaorMR 0.1 | 1.8 | 15.5% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 2.8 | 13.4% | 31 |
| myl.nano.KomoriNinja 1.1 | 4.2 | 11.8% | 15 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.9% | 12 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 6 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.9% | 8 |
| sample.Fire 1.0 | 9.2 | 4.4% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 69.2 | 11 / 35 | 4304 |
| 2 | 2 | 66.1 | 80.0 | 14 / 35 | 4610 |
| 3 | 1 | 64.2 | 75.9 | 11 / 35 | 4455 |
| 4 | 1 | 65.6 | 78.7 | 13 / 35 | 4780 |
| 5 | 3 | 60.0 | 65.7 | 4 / 35 | 3878 |
| 6 | 2 | 64.8 | 75.2 | 14 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 61% |
| myl.nano.KomoriNinja 1.1 | 16 | 63% |
| cb.nano.Insomnia 1.0 | 9 | 56% |
| sp.Nanos.Ember 1.1 | 4 | 50% |
| fm.mammillarias 1.3 | 1 | 0% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 35% | 92 |
| stelo.SoRobotNanoMelee 1.2 | 40 | 28% | 43 |
| fm.mammillarias 1.3 | 17 | 12% | 17 |
| cb.nano.Insomnia 1.0 | 15 | 10% | 15 |
| myl.nano.KomoriNinja 1.1 | 13 | 9% | 28 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 2% | 3 |
| sample.Fire 1.0 | 2 | 1% | 4 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 75.6 | 75 / 210 | 3.20 | 16.2% | 30090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.3 | 16.8% | 61 |
| hadur117.micro.SaorMR 0.1 | 1.7 | 16.2% | 75 |
| tvv.micro.Antares 1.1.1 | 3.3 | 12.1% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.0 | 11.2% | 28 |
| tj.zombie1n 1.0.1 | 5.0 | 9.4% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.4% | 0 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.4% | 3 |
| repositorio.NanoStep 1.0 | 9.3 | 5.7% | 3 |
| sample.VelociRobot 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 74.6 | 12 / 35 | 4739 |
| 2 | 2 | 64.8 | 77.1 | 12 / 35 | 4926 |
| 3 | 1 | 65.6 | 76.5 | 16 / 35 | 5197 |
| 4 | 1 | 66.0 | 80.0 | 15 / 35 | 5263 |
| 5 | 2 | 65.7 | 78.7 | 14 / 35 | 5195 |
| 6 | 2 | 60.9 | 66.3 | 6 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 43 | 53% |
| stelo.SoJNanoMelee 1.1 | 26 | 77% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 88% |
| tj.zombie1n 1.0.1 | 7 | 57% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 84 | 62% | 117 |
| stelo.SoJNanoMelee 1.1 | 31 | 23% | 41 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 5% | 8 |
| tj.zombie1n 1.0.1 | 6 | 4% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 1% | 14 |
| tvv.micro.Antares 1.1.1 | 2 | 1% | 12 |
| sample.VelociRobot 1.0 | 1 | 1% | 6 |
| yk.JahMicro 1.0 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.8 | 104 / 210 | 2.55 | 17.1% | 26742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.0 | 17.1% | 104 |
| oog.melee.Corsair 1.0 | 2.5 | 12.5% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 12.1% | 28 |
| ahf.NanoAndrew .4 | 4.3 | 10.8% | 16 |
| sam.Samspin 1.0 | 5.3 | 10.0% | 17 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.7% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 7.9% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 86.3 | 20 / 35 | 4282 |
| 2 | 1 | 65.8 | 84.1 | 18 / 35 | 4445 |
| 3 | 1 | 65.4 | 79.4 | 18 / 35 | 4698 |
| 4 | 1 | 63.6 | 78.7 | 13 / 35 | 4179 |
| 5 | 1 | 66.5 | 86.3 | 16 / 35 | 4614 |
| 6 | 1 | 65.6 | 81.9 | 19 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 68% |
| oog.melee.Corsair 1.0 | 38 | 68% |
| ahf.NanoAndrew .4 | 19 | 79% |
| sam.Samspin 1.0 | 16 | 56% |
| EBBU.Sim2 1.02 | 15 | 87% |
| robar.nano.Assertive_Melee 0.2 | 9 | 67% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 21% | 52 |
| robar.nano.Assertive_Melee 0.2 | 21 | 19% | 26 |
| oog.melee.Corsair 1.0 | 16 | 15% | 43 |
| sam.Samspin 1.0 | 13 | 12% | 19 |
| ahf.NanoAndrew .4 | 11 | 10% | 32 |
| EBBU.Sim2 1.02 | 9 | 8% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 6% | 6 |
| zyx.nano.BacillusComma 1.0 | 5 | 5% | 7 |
| sample.TrackFire 1.0 | 4 | 4% | 5 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 84.0 | 76 / 210 | 2.44 | 16.8% | 25841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.2 | 16.8% | 76 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.0% | 54 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.0% | 39 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.9% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 10 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.9% | 6 |
| fm.claire 1.7 | 6.7 | 8.1% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.5% | 5 |
| pa.Improved 1.0 | 9.3 | 5.7% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 87.6 | 12 / 35 | 4442 |
| 2 | 1 | 65.1 | 83.2 | 13 / 35 | 4490 |
| 3 | 1 | 66.6 | 86.3 | 16 / 35 | 4434 |
| 4 | 1 | 66.0 | 86.0 | 14 / 35 | 4296 |
| 5 | 1 | 66.7 | 88.9 | 12 / 35 | 4373 |
| 6 | 2 | 61.6 | 72.1 | 9 / 35 | 3806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 41% |
| oog.melee.CapuletDroid 1.1 | 42 | 40% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 13 | 69% |
| arthord.NanoSatanMelee Beta | 12 | 75% |
| sample.SpinBot 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 83% |
| kurios.DOSexe .9b | 1 | 0% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 45% | 82 |
| oog.melee.CapuletDroid 1.1 | 34 | 25% | 50 |
| sample.SpinBot 1.0 | 12 | 9% | 17 |
| fm.claire 1.7 | 9 | 7% | 9 |
| arthord.NanoSatanMelee Beta | 8 | 6% | 12 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 19 |
| winamp32.micro.MicroMacro 1.0 | 6 | 4% | 12 |
| pa.Improved 1.0 | 1 | 1% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.7 | 80 / 210 | 2.74 | 16.5% | 27824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.2 | 16.5% | 80 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 15.0% | 59 |
| mz.MicroGodMelee 1 | 3.0 | 14.4% | 27 |
| gh.micro.Gruweltje 0.7 | 3.2 | 14.5% | 28 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 3 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 6 |
| acogdev.alpha 0.2 | 8.0 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.3% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 76.5 | 11 / 35 | 4134 |
| 2 | 1 | 67.1 | 84.1 | 16 / 35 | 4944 |
| 3 | 1 | 66.3 | 82.5 | 19 / 35 | 4473 |
| 4 | 1 | 66.4 | 82.9 | 11 / 35 | 4992 |
| 5 | 1 | 64.0 | 78.1 | 10 / 35 | 4566 |
| 6 | 1 | 65.3 | 80.0 | 13 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 46 | 80% |
| spinnercat.micro.Tyger 0.1 | 39 | 38% |
| gh.micro.Gruweltje 0.7 | 20 | 40% |
| DBall.Anarchy 0.1 | 17 | 94% |
| el.JumpShoot 0.2 | 4 | 0% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 48% | 78 |
| gh.micro.Gruweltje 0.7 | 17 | 13% | 27 |
| mz.MicroGodMelee 1 | 16 | 12% | 45 |
| caimano.Furia_Ceca 0.22 | 12 | 9% | 14 |
| el.JumpShoot 0.2 | 9 | 7% | 10 |
| acogdev.alpha 0.2 | 8 | 6% | 10 |
| DBall.Anarchy 0.1 | 3 | 2% | 20 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.2 | 92 / 210 | 2.88 | 16.3% | 26362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 16.9% | 60 |
| hadur117.micro.SaorMR 0.1 | 1.8 | 16.3% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 27 |
| germ.TheMind .2 | 4.3 | 9.8% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.2% | 6 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.8% | 1 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 6 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 79.7 | 14 / 35 | 3964 |
| 2 | 1 | 68.6 | 89.5 | 21 / 35 | 4922 |
| 3 | 2 | 62.1 | 70.8 | 13 / 35 | 4409 |
| 4 | 2 | 66.7 | 84.4 | 18 / 35 | 4365 |
| 5 | 2 | 63.7 | 73.7 | 11 / 35 | 4719 |
| 6 | 2 | 63.7 | 76.8 | 15 / 35 | 3983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 72% |
| stelo.UntouchableNano 1.3 | 10 | 70% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| sample.Crazy 1.0 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| germ.TheMind .2 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 39% | 100 |
| germ.TheMind .2 | 26 | 22% | 32 |
| stelo.UntouchableNano 1.3 | 20 | 17% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 12% | 25 |
| awesomeness.Elite 1.0 | 5 | 4% | 10 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.6 | 102 / 210 | 2.84 | 16.6% | 24355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.3 | 16.6% | 102 |
| rz.HawkOnFire 0.1 | 2.0 | 14.8% | 35 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.4% | 32 |
| maribo.IotaCT 1.1 | 4.0 | 10.6% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.4% | 3 |
| ratosh.Wesco 1.4 | 6.2 | 9.1% | 3 |
| timmit.nano.TimDog 0.33 | 6.8 | 8.9% | 8 |
| spinnercat.Omen 1.0 | 8.2 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 8.0% | 12 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.0 | 17 / 35 | 4069 |
| 2 | 1 | 67.6 | 85.4 | 22 / 35 | 4139 |
| 3 | 3 | 62.6 | 71.1 | 14 / 35 | 3488 |
| 4 | 1 | 67.5 | 86.7 | 20 / 35 | 4488 |
| 5 | 1 | 64.1 | 76.8 | 14 / 35 | 3827 |
| 6 | 1 | 66.1 | 78.4 | 15 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 82% |
| nz.jdc.nano.GridFu 1.0 | 34 | 88% |
| stelo.PatternRobot 1.0 | 11 | 55% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| maribo.IotaCT 1.1 | 7 | 57% |
| spinnercat.Omen 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 108 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 28 | 26% | 67 |
| ratosh.Wesco 1.4 | 24 | 22% | 27 |
| stelo.PatternRobot 1.0 | 21 | 19% | 27 |
| nz.jdc.nano.GridFu 1.0 | 16 | 15% | 49 |
| timmit.nano.TimDog 0.33 | 8 | 7% | 18 |
| maribo.IotaCT 1.1 | 7 | 6% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.9 | 152 / 210 | 1.90 | 19.8% | 33658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.0 | 19.8% | 152 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 18 |
| baal.nano.N 1.42 | 3.0 | 11.5% | 6 |
| zyx.micro.Ant 1.1 | 4.2 | 10.0% | 13 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.7% | 2 |
| sanja.First 0.1 | 6.5 | 9.1% | 4 |
| cvt.Firsty 1.0 | 7.3 | 7.9% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.4% | 3 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.3 | 25 / 35 | 5396 |
| 2 | 1 | 67.8 | 85.1 | 24 / 35 | 5219 |
| 3 | 1 | 66.9 | 82.9 | 22 / 35 | 5217 |
| 4 | 1 | 71.0 | 95.6 | 27 / 35 | 5848 |
| 5 | 1 | 69.8 | 90.5 | 23 / 35 | 6035 |
| 6 | 1 | 71.7 | 97.5 | 31 / 35 | 5943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 93% |
| cvt.Firsty 1.0 | 28 | 71% |
| baal.nano.N 1.42 | 28 | 96% |
| sanja.First 0.1 | 27 | 93% |
| zyx.micro.Ant 1.1 | 25 | 76% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| amk.Punbot.Punbot 0.01 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 25 | 41% | 50 |
| cvt.Firsty 1.0 | 14 | 23% | 43 |
| sanja.First 0.1 | 6 | 10% | 30 |
| tvv.nano.Polaris 1.2 | 5 | 8% | 30 |
| baal.nano.N 1.42 | 3 | 5% | 27 |
| Grystrion.TrackerWO 1.0 | 3 | 5% | 18 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 3 |
| sample.RamFire 1.0 | 1 | 2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.7 | 82 / 210 | 3.10 | 15.7% | 26238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.8% | 79 |
| hadur117.micro.SaorMR 0.1 | 1.8 | 15.7% | 82 |
| cs.Wren 1.0 | 3.3 | 13.0% | 24 |
| js.PinBall 1.6 | 4.2 | 11.2% | 7 |
| mz.Cork 0.1 | 4.8 | 10.6% | 7 |
| joe.ADinosaur 1.0 | 5.8 | 9.3% | 3 |
| evd.X1 0.01 | 6.8 | 7.6% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 5.8% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 73.7 | 12 / 35 | 4275 |
| 2 | 2 | 64.7 | 78.4 | 14 / 35 | 4575 |
| 3 | 2 | 64.3 | 76.5 | 15 / 35 | 4409 |
| 4 | 2 | 64.3 | 77.8 | 15 / 35 | 4348 |
| 5 | 2 | 62.9 | 74.3 | 12 / 35 | 4377 |
| 6 | 1 | 64.3 | 79.4 | 14 / 35 | 4254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 70 | 74% |
| cs.Wren 1.0 | 21 | 52% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Wren 1.0 | 46 | 36% | 54 |
| kc.micro.Figment 1.0 | 36 | 28% | 89 |
| joe.ADinosaur 1.0 | 24 | 19% | 26 |
| mz.Cork 0.1 | 7 | 5% | 10 |
| js.PinBall 1.6 | 6 | 5% | 12 |
| evd.X1 0.01 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |
| PSW.Relentless 0.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.4 | 97 / 210 | 2.31 | 17.5% | 24443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.0 | 17.5% | 97 |
| myl.nano.Graviton 1.10 | 3.0 | 12.3% | 44 |
| ntc.Opposite 1.5 | 3.2 | 12.1% | 14 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 12.1% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.3 | 9.1% | 4 |
| DBall.NUKE 0.1 | 7.0 | 8.2% | 5 |
| disan.Chair 2.2.0 | 7.5 | 7.8% | 8 |
| donjezza.Muncho 1.0 | 9.0 | 6.0% | 10 |
| pbg.R2D2 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.3 | 17 / 35 | 3926 |
| 2 | 1 | 64.8 | 82.2 | 11 / 35 | 4007 |
| 3 | 1 | 67.7 | 88.6 | 22 / 35 | 3970 |
| 4 | 1 | 68.7 | 89.8 | 20 / 35 | 4568 |
| 5 | 1 | 65.8 | 84.1 | 14 / 35 | 3943 |
| 6 | 1 | 66.2 | 86.7 | 13 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 59% |
| myl.nano.Graviton 1.10 | 34 | 47% |
| ntc.Opposite 1.5 | 25 | 56% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| donjezza.Muncho 1.0 | 12 | 50% |
| DBall.NUKE 0.1 | 12 | 100% |
| disan.Chair 2.2.0 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 32 | 28% | 52 |
| ntc.Opposite 1.5 | 20 | 18% | 32 |
| stelo.AreaTargetingBot 1.1 | 19 | 17% | 36 |
| pfvicm.Sobieski 7.2.3b | 13 | 12% | 17 |
| donjezza.Muncho 1.0 | 12 | 11% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 16 |
| pbg.R2D2 1.0 | 3 | 3% | 5 |
| disan.Chair 2.2.0 | 2 | 2% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 25 |

## Melee bench: F13

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.0 | 44 / 210 | 3.61 | 13.9% | 21570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 15.0% | 68 |
| kawigi.micro.Shiz 1.1 | 1.8 | 14.8% | 55 |
| hadur117.micro.SaorMR 0.1 | 2.8 | 13.9% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 24 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 12 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 6 |
| stelo.MirrorNano 1.3 | 7.3 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 73.3 | 10 / 35 | 3717 |
| 2 | 4 | 60.7 | 66.7 | 8 / 35 | 3429 |
| 3 | 2 | 62.1 | 72.7 | 9 / 35 | 3714 |
| 4 | 2 | 63.5 | 75.9 | 9 / 35 | 3954 |
| 5 | 3 | 58.6 | 65.1 | 3 / 35 | 3304 |
| 6 | 3 | 61.4 | 72.1 | 5 / 35 | 3452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 34% |
| kawigi.micro.Shiz 1.1 | 20 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 56% |
| yagami.Tidus 0.11 | 10 | 100% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 27% | 53 |
| yagami.Tidus 0.11 | 42 | 25% | 50 |
| kawigi.micro.Shiz 1.1 | 40 | 24% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 13% | 34 |
| ejb.Polaris 1.0.1 | 8 | 5% | 12 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 2 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 87.8 | 127 / 210 | 2.10 | 17.9% | 24355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.0 | 17.9% | 127 |
| wee.Gem 1.8.4 | 2.8 | 12.7% | 32 |
| bzdp.Pansy 2.1 | 3.3 | 11.7% | 19 |
| wompi.Quokka 1.6 | 3.3 | 11.8% | 12 |
| ratosh.Nobo 0.21 | 4.8 | 10.9% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 11 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.3% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 91.1 | 20 / 35 | 4061 |
| 2 | 1 | 65.8 | 84.1 | 19 / 35 | 3709 |
| 3 | 1 | 66.0 | 84.8 | 22 / 35 | 4020 |
| 4 | 1 | 68.5 | 93.0 | 25 / 35 | 4094 |
| 5 | 1 | 63.8 | 79.0 | 15 / 35 | 3656 |
| 6 | 1 | 70.0 | 94.9 | 26 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 63 | 76% |
| bzdp.Pansy 2.1 | 41 | 83% |
| wompi.Quokka 1.6 | 25 | 80% |
| ratosh.Nobo 0.21 | 13 | 69% |
| m3thos.Eva00 1.1 | 12 | 58% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 19 | 22% | 64 |
| wompi.Quokka 1.6 | 14 | 16% | 27 |
| bzdp.Pansy 2.1 | 13 | 15% | 52 |
| ratosh.Nobo 0.21 | 13 | 15% | 22 |
| m3thos.Eva00 1.1 | 9 | 10% | 16 |
| bayen.UbaMicro 1.4 | 7 | 8% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 3% | 6 |
| maribo.FollowFire 1 | 3 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.9 | 75 / 210 | 2.09 | 19.1% | 39121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.7% | 121 |
| hadur117.micro.SaorMR 0.1 | 1.5 | 19.1% | 75 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 9 |
| ayk.WallHugger 1.0 | 4.2 | 9.7% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.2% | 5 |
| stuff.Vlad 0.1 | 6.0 | 8.1% | 0 |
| stelo.PianistNano 1.2 | 7.3 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 84.4 | 13 / 35 | 6447 |
| 2 | 1 | 70.7 | 89.2 | 16 / 35 | 6652 |
| 3 | 2 | 68.8 | 83.8 | 9 / 35 | 6337 |
| 4 | 1 | 70.2 | 89.5 | 13 / 35 | 6607 |
| 5 | 2 | 70.2 | 89.2 | 9 / 35 | 6603 |
| 6 | 1 | 70.8 | 91.1 | 15 / 35 | 6475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 32% |
| mz.NanoGod 2.02 | 18 | 94% |
| ayk.WallHugger 1.0 | 6 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| exauge.GateKeeper 1.1.121g | 5 | 60% |
| stuff.Vlad 0.1 | 3 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 1306. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 108 | 80% | 150 |
| exauge.GateKeeper 1.1.121g | 12 | 9% | 15 |
| mz.NanoGod 2.02 | 10 | 7% | 23 |
| drd.Dreadknoght 0.9 | 2 | 1% | 10 |
| ayk.WallHugger 1.0 | 2 | 1% | 8 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 74.6 | 72 / 210 | 3.29 | 15.5% | 25751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.0 | 15.5% | 72 |
| dummy.micro.Sparrow 2.5 | 2.7 | 13.4% | 36 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.8% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.8% | 32 |
| bvh.micro.Freya 0.3 | 4.8 | 10.9% | 13 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.6% | 3 |
| conscience.Electron 1.3g | 6.8 | 8.1% | 1 |
| ap.Frederick 1.1 | 8.7 | 6.1% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 68.3 | 11 / 35 | 4350 |
| 2 | 1 | 64.5 | 76.8 | 13 / 35 | 4659 |
| 3 | 1 | 63.9 | 77.5 | 13 / 35 | 4225 |
| 4 | 1 | 63.2 | 75.6 | 11 / 35 | 4038 |
| 5 | 1 | 64.5 | 79.4 | 13 / 35 | 4338 |
| 6 | 1 | 61.8 | 69.8 | 11 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 50% |
| dummy.micro.Sparrow 2.5 | 31 | 74% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 50% |
| bvh.micro.Freya 0.3 | 12 | 83% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| conscience.Electron 1.3g | 5 | 80% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 34% | 63 |
| dummy.micro.Sparrow 2.5 | 35 | 25% | 59 |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 21% | 41 |
| bvh.micro.Freya 0.3 | 10 | 7% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 5% | 7 |
| conscience.Electron 1.3g | 5 | 4% | 9 |
| dl.BetterWalls 1.0 | 4 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 5 |

## Melee bench: F17

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.0 | 94 / 210 | 2.71 | 17.7% | 32633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.2 | 17.7% | 94 |
| sheldor.melee.nano.TestMelee 0.1 | 1.8 | 15.4% | 38 |
| sul.Lunar 1.1 | 3.7 | 11.8% | 13 |
| supersample.SuperBoxBot 1.0 | 3.8 | 12.4% | 29 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.8% | 10 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 6 |
| tlp.ThreeLeggedPig 1 | 8.0 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 6 |
| sample.Corners 1.0 | 9.0 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.1 | 18 / 35 | 5866 |
| 2 | 1 | 64.9 | 77.1 | 10 / 35 | 5247 |
| 3 | 1 | 66.2 | 78.1 | 14 / 35 | 5588 |
| 4 | 1 | 66.0 | 78.4 | 17 / 35 | 5022 |
| 5 | 2 | 63.9 | 74.0 | 10 / 35 | 4858 |
| 6 | 1 | 71.2 | 93.3 | 25 / 35 | 6052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 73% |
| sul.Lunar 1.1 | 31 | 97% |
| supersample.SuperBoxBot 1.0 | 16 | 50% |
| dsw.StaticD 1.0 | 10 | 80% |
| mme.NikeEnhanced 2.0 | 8 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 60% |
| sample.MyFirstRobot 1.0 | 4 | 25% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 39 | 33% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 26% | 65 |
| mme.NikeEnhanced 2.0 | 11 | 9% | 15 |
| sample.MyFirstRobot 1.0 | 9 | 8% | 12 |
| sample.Corners 1.0 | 8 | 7% | 10 |
| dsw.StaticD 1.0 | 7 | 6% | 16 |
| sul.Lunar 1.1 | 6 | 5% | 37 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorMR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.3 | 101 / 210 | 3.13 | 16.1% | 29207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMR 0.1 | 1.2 | 16.1% | 101 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.8 | 13.0% | 22 |
| mld.Wisdom 1.0 | 3.7 | 12.3% | 17 |
| KiraNL.Chupacabra 0.4 | 5.7 | 10.2% | 9 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 13 |
| sample.Walls 1.0 | 6.5 | 9.2% | 15 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 77.5 | 18 / 35 | 4652 |
| 2 | 1 | 64.2 | 74.6 | 16 / 35 | 5146 |
| 3 | 1 | 65.5 | 80.0 | 21 / 35 | 4710 |
| 4 | 2 | 62.7 | 72.1 | 13 / 35 | 4721 |
| 5 | 1 | 66.0 | 78.7 | 18 / 35 | 5378 |
| 6 | 1 | 63.1 | 74.9 | 15 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 41 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 92% |
| mld.Wisdom 1.0 | 13 | 77% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sample.Walls 1.0 | 26 | 23% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 18% | 53 |
| mld.Wisdom 1.0 | 16 | 14% | 29 |
| radnor.DoctorBob 1.42 | 15 | 13% | 42 |
| amz.NanoClone 1.41 | 12 | 11% | 18 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 17 |
| jangs.ns51 1.0 | 8 | 7% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
1 death(s) with no robot to name.

