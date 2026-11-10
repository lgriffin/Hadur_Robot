# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.5 | 107 / 210 | 2.67 | 18.2% | 35774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 18.2% | 107 |
| radnor.DoctorBob 1.42 | 2.5 | 15.1% | 34 |
| mld.Infinity 2.2 | 3.2 | 13.5% | 27 |
| mz.AntiGrav 1.0 | 3.3 | 13.7% | 25 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 7 |
| sample.Walls 1.0 | 5.8 | 8.8% | 5 |
| GarmBox.Oranges 1.0 | 7.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.3% | 5 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 76.5 | 19 / 35 | 5697 |
| 2 | 1 | 69.0 | 85.7 | 15 / 35 | 6092 |
| 3 | 1 | 69.6 | 83.2 | 21 / 35 | 6354 |
| 4 | 1 | 68.7 | 83.2 | 22 / 35 | 5812 |
| 5 | 1 | 68.6 | 83.8 | 13 / 35 | 6249 |
| 6 | 1 | 66.2 | 76.5 | 17 / 35 | 5570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 49 | 67% |
| mld.Infinity 2.2 | 37 | 97% |
| mz.AntiGrav 1.0 | 34 | 76% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sample.Walls 1.0 | 32 | 31% | 41 |
| mz.AntiGrav 1.0 | 27 | 26% | 58 |
| radnor.DoctorBob 1.42 | 25 | 24% | 54 |
| amz.NanoClone 1.41 | 7 | 7% | 13 |
| mld.Infinity 2.2 | 4 | 4% | 28 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.0 | 101 / 210 | 2.35 | 17.3% | 26861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.2 | 17.3% | 101 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.4% | 66 |
| mld.DustBunny 3.8 | 3.8 | 13.0% | 18 |
| maribo.melee.BMV 0.1 | 4.7 | 9.9% | 2 |
| zyx.nano.Ant 1.1 | 5.2 | 9.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 9.0% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.3% | 6 |
| fullsail.SweetTea 1.1 | 7.8 | 7.2% | 6 |
| bzdp.BoxCar 2.0 | 8.7 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 82.5 | 16 / 35 | 4100 |
| 2 | 1 | 66.0 | 82.9 | 13 / 35 | 4922 |
| 3 | 1 | 67.5 | 87.9 | 19 / 35 | 4504 |
| 4 | 1 | 65.7 | 84.1 | 14 / 35 | 4009 |
| 5 | 1 | 68.7 | 89.8 | 24 / 35 | 5134 |
| 6 | 2 | 64.5 | 82.5 | 15 / 35 | 4192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 73 | 68% |
| mld.DustBunny 3.8 | 28 | 75% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| zyx.nano.Ant 1.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 4 | 50% |
| maribo.melee.BMV 0.1 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 36 | 33% | 56 |
| oog.melee.Mercutio 1.0 | 35 | 32% | 82 |
| zyx.nano.Ant 1.1 | 12 | 11% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 7% | 15 |
| fullsail.SweetTea 1.1 | 8 | 7% | 9 |
| maribo.melee.BMV 0.1 | 6 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 16 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 75.2 | 85 / 210 | 3.23 | 15.9% | 26533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.3 | 15.9% | 85 |
| myl.micro.Troodon 1.10 | 1.8 | 15.2% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 13.9% | 34 |
| myl.nano.KomoriNinja 1.1 | 4.2 | 11.7% | 14 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.7% | 10 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 1 |
| sample.Fire 1.0 | 9.2 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.6 | 14 / 35 | 4918 |
| 2 | 1 | 65.8 | 77.1 | 17 / 35 | 4615 |
| 3 | 1 | 65.4 | 77.5 | 17 / 35 | 4311 |
| 4 | 1 | 63.7 | 75.2 | 11 / 35 | 4361 |
| 5 | 2 | 62.5 | 68.3 | 12 / 35 | 4473 |
| 6 | 2 | 62.9 | 72.7 | 14 / 35 | 3855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 40 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 77% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| myl.nano.KomoriNinja 1.1 | 9 | 44% |
| sp.Nanos.Ember 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 125 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 42 | 34% | 65 |
| myl.micro.Troodon 1.10 | 35 | 28% | 76 |
| fm.mammillarias 1.3 | 20 | 16% | 23 |
| myl.nano.KomoriNinja 1.1 | 15 | 12% | 25 |
| cb.nano.Insomnia 1.0 | 10 | 8% | 13 |
| sample.Fire 1.0 | 2 | 2% | 1 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.5 | 92 / 210 | 2.94 | 16.6% | 29490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.3 | 16.6% | 92 |
| kawigi.nano.Lib 1.0 | 1.7 | 16.1% | 41 |
| stelo.SoJNanoMelee 1.1 | 3.3 | 12.0% | 34 |
| tvv.micro.Antares 1.1.1 | 3.7 | 12.1% | 21 |
| tj.zombie1n 1.0.1 | 5.3 | 9.4% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.6% | 0 |
| yk.JahMicro 1.0 | 7.2 | 7.6% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.9% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 5.9% | 3 |
| sample.VelociRobot 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 68.9 | 15 / 35 | 4648 |
| 2 | 1 | 67.1 | 83.8 | 17 / 35 | 5237 |
| 3 | 1 | 66.3 | 82.2 | 19 / 35 | 4699 |
| 4 | 1 | 65.0 | 76.2 | 16 / 35 | 4980 |
| 5 | 2 | 63.4 | 74.6 | 9 / 35 | 4871 |
| 6 | 1 | 66.9 | 85.1 | 16 / 35 | 5055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 84% |
| stelo.SoJNanoMelee 1.1 | 31 | 87% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| tj.zombie1n 1.0.1 | 11 | 82% |
| yk.JahMicro 1.0 | 10 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 72 | 61% | 112 |
| stelo.SoJNanoMelee 1.1 | 24 | 20% | 39 |
| tj.zombie1n 1.0.1 | 8 | 7% | 10 |
| tvv.micro.Antares 1.1.1 | 6 | 5% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 4% | 8 |
| yk.JahMicro 1.0 | 2 | 2% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 9 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.8 | 101 / 210 | 2.64 | 17.2% | 28379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 17.2% | 101 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 12.0% | 28 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 25 |
| EBBU.Sim2 1.02 | 5.8 | 9.3% | 6 |
| sam.Samspin 1.0 | 5.8 | 9.4% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.6% | 4 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 8.1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 81.6 | 15 / 35 | 4664 |
| 2 | 1 | 64.0 | 75.6 | 16 / 35 | 4680 |
| 3 | 1 | 67.1 | 82.5 | 22 / 35 | 4933 |
| 4 | 1 | 66.5 | 85.1 | 17 / 35 | 4899 |
| 5 | 1 | 66.3 | 82.9 | 17 / 35 | 4838 |
| 6 | 1 | 65.1 | 83.2 | 14 / 35 | 4365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 74% |
| simonton.nano.MeleeSeed 1.8 | 40 | 85% |
| ahf.NanoAndrew .4 | 23 | 57% |
| sam.Samspin 1.0 | 12 | 75% |
| EBBU.Sim2 1.02 | 7 | 57% |
| robar.nano.Assertive_Melee 0.2 | 7 | 43% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 67% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 22% | 55 |
| robar.nano.Assertive_Melee 0.2 | 22 | 20% | 27 |
| ahf.NanoAndrew .4 | 20 | 18% | 39 |
| oog.melee.Corsair 1.0 | 13 | 12% | 44 |
| EBBU.Sim2 1.02 | 10 | 9% | 16 |
| sam.Samspin 1.0 | 10 | 9% | 16 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 6 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 3% | 3 |

## Melee bench: F06

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 81.6 | 95 / 210 | 2.65 | 16.4% | 23771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.2 | 16.4% | 95 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.1% | 62 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 11.4% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.6% | 3 |
| fm.claire 1.7 | 6.5 | 8.6% | 3 |
| sample.SpinBot 1.0 | 8.0 | 7.7% | 5 |
| pa.Improved 1.0 | 9.2 | 5.5% | 3 |
| kurios.DOSexe .9b | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 85.4 | 14 / 35 | 4190 |
| 2 | 2 | 63.4 | 80.0 | 13 / 35 | 3666 |
| 3 | 1 | 63.6 | 78.1 | 18 / 35 | 3329 |
| 4 | 1 | 66.9 | 85.1 | 20 / 35 | 4391 |
| 5 | 1 | 64.2 | 80.3 | 14 / 35 | 3986 |
| 6 | 1 | 64.6 | 81.0 | 16 / 35 | 4209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 51% |
| oog.melee.CapuletDroid 1.1 | 24 | 92% |
| gh.nano.Grofvuil 0.2 | 20 | 90% |
| arthord.NanoSatanMelee Beta | 16 | 94% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| kurios.DOSexe .9b | 4 | 75% |
| sample.SpinBot 1.0 | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 116 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 53% | 84 |
| fm.claire 1.7 | 12 | 10% | 14 |
| oog.melee.CapuletDroid 1.1 | 11 | 9% | 33 |
| sample.SpinBot 1.0 | 10 | 9% | 14 |
| gh.nano.Grofvuil 0.2 | 8 | 7% | 27 |
| arthord.NanoSatanMelee Beta | 8 | 7% | 17 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 10 |
| kurios.DOSexe .9b | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 5 |

## Melee bench: F07

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.9 | 90 / 210 | 2.63 | 17.0% | 29267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.2 | 17.0% | 90 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.2% | 41 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.5% | 46 |
| mz.MicroGodMelee 1 | 3.8 | 13.2% | 21 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 4 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.1% | 2 |
| acogdev.alpha 0.2 | 7.2 | 6.6% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 2 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.8% | 2 |
| fire219.CatBot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.2 | 16 / 35 | 5227 |
| 2 | 1 | 67.9 | 87.6 | 16 / 35 | 5020 |
| 3 | 1 | 65.2 | 79.0 | 14 / 35 | 4573 |
| 4 | 1 | 67.2 | 84.1 | 16 / 35 | 5305 |
| 5 | 1 | 66.1 | 82.2 | 15 / 35 | 4689 |
| 6 | 2 | 63.8 | 76.2 | 13 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 42 | 71% |
| spinnercat.micro.Tyger 0.1 | 38 | 66% |
| gh.micro.Gruweltje 0.7 | 36 | 56% |
| DBall.Anarchy 0.1 | 12 | 92% |
| el.JumpShoot 0.2 | 4 | 50% |
| acogdev.alpha 0.2 | 2 | 50% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 40% | 71 |
| gh.micro.Gruweltje 0.7 | 24 | 20% | 46 |
| mz.MicroGodMelee 1 | 17 | 14% | 46 |
| acogdev.alpha 0.2 | 12 | 10% | 13 |
| el.JumpShoot 0.2 | 7 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 6 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 14 |

## Melee bench: F08

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.5 | 96 / 210 | 2.85 | 16.5% | 27225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 17.2% | 68 |
| hadur117.micro.SaorMD 0.1 | 1.7 | 16.5% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 21 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 8 |
| germ.TheMind .2 | 5.3 | 9.4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 6.8 | 7.6% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 7.9% | 2 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.4 | 21 / 35 | 4781 |
| 2 | 2 | 68.1 | 88.3 | 20 / 35 | 4791 |
| 3 | 2 | 61.6 | 72.4 | 11 / 35 | 3959 |
| 4 | 1 | 63.7 | 75.6 | 12 / 35 | 4588 |
| 5 | 2 | 67.2 | 84.4 | 18 / 35 | 4875 |
| 6 | 2 | 63.0 | 71.7 | 14 / 35 | 4231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 92% |
| qualidafial.MajorDick 1.0.1 | 11 | 82% |
| germ.TheMind .2 | 9 | 67% |
| awesomeness.Elite 1.0 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 115 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 34% | 78 |
| germ.TheMind .2 | 24 | 21% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 20% | 49 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 15 |
| awesomeness.Elite 1.0 | 6 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.5 | 93 / 210 | 2.76 | 16.6% | 24338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 16.6% | 93 |
| rz.HawkOnFire 0.1 | 2.2 | 14.2% | 32 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.7% | 31 |
| maribo.IotaCT 1.1 | 4.7 | 10.2% | 15 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.1% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 1 |
| stelo.PatternRobot 1.0 | 7.5 | 8.3% | 13 |
| ratosh.Wesco 1.4 | 7.7 | 8.3% | 10 |
| spinnercat.Omen 1.0 | 8.3 | 7.7% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.7 | 17 / 35 | 4084 |
| 2 | 1 | 65.0 | 78.4 | 15 / 35 | 4215 |
| 3 | 1 | 66.9 | 83.2 | 16 / 35 | 4367 |
| 4 | 1 | 66.9 | 85.7 | 14 / 35 | 3845 |
| 5 | 1 | 64.3 | 75.9 | 16 / 35 | 4038 |
| 6 | 1 | 65.2 | 80.0 | 15 / 35 | 3789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 46 | 67% |
| nz.jdc.nano.GridFu 1.0 | 34 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| ratosh.Wesco 1.4 | 8 | 50% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| maribo.IotaCT 1.1 | 7 | 43% |
| spinnercat.Omen 1.0 | 7 | 100% |
| stelo.PatternRobot 1.0 | 4 | 50% |

Hadur died in 117 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 34 | 29% | 59 |
| ratosh.Wesco 1.4 | 24 | 21% | 30 |
| stelo.PatternRobot 1.0 | 18 | 15% | 20 |
| nz.jdc.nano.GridFu 1.0 | 13 | 11% | 48 |
| maribo.IotaCT 1.1 | 10 | 9% | 20 |
| timmit.nano.TimDog 0.33 | 8 | 7% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 6% | 11 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.7 | 152 / 210 | 2.01 | 19.6% | 33696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 19.6% | 152 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 22 |
| baal.nano.N 1.42 | 3.0 | 11.1% | 8 |
| zyx.micro.Ant 1.1 | 4.5 | 10.3% | 14 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 1 |
| sanja.First 0.1 | 5.8 | 8.9% | 3 |
| cvt.Firsty 1.0 | 7.5 | 8.2% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 24 / 35 | 5639 |
| 2 | 1 | 69.9 | 92.4 | 25 / 35 | 5722 |
| 3 | 1 | 68.4 | 83.8 | 26 / 35 | 5601 |
| 4 | 1 | 68.4 | 88.3 | 25 / 35 | 5373 |
| 5 | 1 | 68.1 | 85.7 | 23 / 35 | 5548 |
| 6 | 1 | 70.5 | 93.3 | 29 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 33 | 91% |
| tvv.nano.Polaris 1.2 | 33 | 88% |
| baal.nano.N 1.42 | 30 | 90% |
| sanja.First 0.1 | 24 | 96% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| zyx.micro.Ant 1.1 | 12 | 75% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 29 | 49% | 50 |
| cvt.Firsty 1.0 | 9 | 15% | 43 |
| tvv.nano.Polaris 1.2 | 5 | 8% | 30 |
| baal.nano.N 1.42 | 5 | 8% | 27 |
| amk.Punbot.Punbot 0.01 | 4 | 7% | 7 |
| sanja.First 0.1 | 3 | 5% | 25 |
| Grystrion.TrackerWO 1.0 | 3 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 12 |

## Melee bench: F11

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.7 | 93 / 210 | 3.10 | 16.1% | 28084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.5 | 16.1% | 93 |
| kc.micro.Figment 1.0 | 1.5 | 16.9% | 79 |
| cs.Wren 1.0 | 3.0 | 12.8% | 15 |
| js.PinBall 1.6 | 4.3 | 10.8% | 5 |
| mz.Cork 0.1 | 4.8 | 10.2% | 7 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 2 |
| evd.X1 0.01 | 6.8 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.8 | 16 / 35 | 5150 |
| 2 | 1 | 66.4 | 81.0 | 17 / 35 | 4906 |
| 3 | 2 | 64.4 | 77.5 | 12 / 35 | 4462 |
| 4 | 1 | 65.5 | 79.7 | 18 / 35 | 4562 |
| 5 | 2 | 62.5 | 69.2 | 12 / 35 | 4657 |
| 6 | 2 | 64.1 | 75.2 | 18 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 76% |
| cs.Wren 1.0 | 20 | 95% |
| mz.Cork 0.1 | 10 | 80% |
| js.PinBall 1.6 | 7 | 100% |
| joe.ADinosaur 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 40% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 43 | 37% | 92 |
| cs.Wren 1.0 | 34 | 29% | 48 |
| joe.ADinosaur 1.0 | 15 | 13% | 21 |
| evd.X1 0.01 | 7 | 6% | 9 |
| js.PinBall 1.6 | 5 | 4% | 12 |
| mz.Cork 0.1 | 4 | 3% | 14 |
| donjezza.Jezza 1.0 | 3 | 3% | 6 |
| jsal.Jsalbot 1.0 | 3 | 3% | 5 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |

## Melee bench: F12

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.9 | 118 / 210 | 2.45 | 17.7% | 24187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 17.7% | 118 |
| stelo.AreaTargetingBot 1.1 | 2.7 | 12.3% | 15 |
| myl.nano.Graviton 1.10 | 3.2 | 11.9% | 30 |
| ntc.Opposite 1.5 | 4.0 | 11.4% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.5% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.8% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.0% | 9 |
| DBall.NUKE 0.1 | 7.5 | 7.5% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 5 |
| pbg.R2D2 1.0 | 9.8 | 4.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.1 | 19 / 35 | 4394 |
| 2 | 1 | 68.6 | 89.8 | 24 / 35 | 4231 |
| 3 | 1 | 65.7 | 81.6 | 18 / 35 | 3959 |
| 4 | 1 | 65.9 | 81.3 | 20 / 35 | 3950 |
| 5 | 1 | 68.0 | 89.2 | 21 / 35 | 4127 |
| 6 | 1 | 63.5 | 77.1 | 16 / 35 | 3526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 45 | 87% |
| myl.nano.Graviton 1.10 | 34 | 82% |
| ntc.Opposite 1.5 | 20 | 75% |
| disan.Chair 2.2.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| DBall.NUKE 0.1 | 7 | 86% |
| donjezza.Muncho 1.0 | 3 | 67% |

Hadur died in 94 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 25 | 27% | 57 |
| pfvicm.Sobieski 7.2.3b | 20 | 21% | 34 |
| stelo.AreaTargetingBot 1.1 | 17 | 18% | 44 |
| ntc.Opposite 1.5 | 11 | 12% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 16 |
| DBall.NUKE 0.1 | 4 | 4% | 14 |
| disan.Chair 2.2.0 | 4 | 4% | 7 |
| donjezza.Muncho 1.0 | 3 | 3% | 7 |
| pbg.R2D2 1.0 | 3 | 3% | 5 |

## Melee bench: F13

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.6 | 56 / 210 | 3.46 | 14.4% | 22129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 15.4% | 57 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.7% | 54 |
| hadur117.micro.SaorMD 0.1 | 2.5 | 14.4% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 18 |
| yagami.Tidus 0.11 | 4.8 | 12.0% | 17 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 8 |
| stelo.MirrorNano 1.3 | 7.5 | 7.0% | 0 |
| step.nanoPri 1.0 | 7.5 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 74.9 | 11 / 35 | 3851 |
| 2 | 1 | 64.6 | 79.0 | 13 / 35 | 3752 |
| 3 | 3 | 60.8 | 67.6 | 9 / 35 | 3469 |
| 4 | 3 | 61.9 | 73.0 | 6 / 35 | 3460 |
| 5 | 2 | 62.0 | 71.4 | 9 / 35 | 3611 |
| 6 | 3 | 62.1 | 69.8 | 8 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 59% |
| kawigi.micro.Shiz 1.1 | 27 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 60% |
| yagami.Tidus 0.11 | 9 | 100% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 46 | 30% | 53 |
| kawigi.micro.Shiz 1.1 | 38 | 25% | 51 |
| oog.melee.Capulet 1.2 | 31 | 20% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 16% | 35 |
| ejb.Polaris 1.0.1 | 9 | 6% | 17 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.5 | 122 / 210 | 2.21 | 17.9% | 25958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 17.9% | 122 |
| bzdp.Pansy 2.1 | 3.0 | 11.9% | 21 |
| ratosh.Nobo 0.21 | 3.3 | 11.8% | 14 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 15 |
| wee.Gem 1.8.4 | 3.8 | 11.6% | 26 |
| bayen.UbaMicro 1.4 | 6.3 | 9.0% | 8 |
| m3thos.Eva00 1.1 | 6.7 | 9.0% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 80.0 | 20 / 35 | 3925 |
| 2 | 1 | 66.0 | 86.3 | 16 / 35 | 3981 |
| 3 | 1 | 68.1 | 89.5 | 21 / 35 | 4561 |
| 4 | 1 | 67.3 | 87.3 | 22 / 35 | 4385 |
| 5 | 1 | 68.5 | 91.1 | 22 / 35 | 4631 |
| 6 | 1 | 66.7 | 84.8 | 21 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 79% |
| wee.Gem 1.8.4 | 42 | 86% |
| wompi.Quokka 1.6 | 23 | 74% |
| ratosh.Nobo 0.21 | 19 | 58% |
| bayen.UbaMicro 1.4 | 10 | 50% |
| m3thos.Eva00 1.1 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 20% | 56 |
| ratosh.Nobo 0.21 | 18 | 20% | 34 |
| bayen.UbaMicro 1.4 | 14 | 16% | 19 |
| wompi.Quokka 1.6 | 10 | 11% | 22 |
| wee.Gem 1.8.4 | 8 | 9% | 46 |
| m3thos.Eva00 1.1 | 7 | 8% | 15 |
| maribo.FollowFire 1 | 7 | 8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 7 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |

## Melee bench: F15

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.2 | 124 / 210 | 1.80 | 20.5% | 40718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 20.5% | 124 |
| wompi.Wallaby 5.1 | 2.0 | 18.8% | 71 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 9 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 4.7 | 9.6% | 3 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.9 | 20 / 35 | 6664 |
| 2 | 1 | 71.5 | 90.8 | 20 / 35 | 6936 |
| 3 | 1 | 71.4 | 90.8 | 20 / 35 | 6793 |
| 4 | 1 | 71.8 | 91.7 | 20 / 35 | 7085 |
| 5 | 1 | 71.6 | 92.1 | 23 / 35 | 6187 |
| 6 | 1 | 72.5 | 92.7 | 21 / 35 | 7053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 136 | 71% |
| mz.NanoGod 2.02 | 16 | 75% |
| ayk.WallHugger 1.0 | 6 | 83% |
| stelo.PianistNano 1.2 | 4 | 100% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 51 | 59% | 147 |
| mz.NanoGod 2.02 | 16 | 19% | 28 |
| exauge.GateKeeper 1.1.121g | 11 | 13% | 14 |
| ayk.WallHugger 1.0 | 7 | 8% | 10 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 79.2 | 96 / 210 | 2.87 | 16.6% | 26313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.0 | 16.6% | 96 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.7% | 31 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.3% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.7% | 26 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 19 |
| conscience.Electron 1.3g | 6.3 | 8.4% | 0 |
| stelo.MirrorMicro 1.0 | 6.7 | 8.3% | 4 |
| ap.Frederick 1.1 | 8.3 | 6.5% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.9 | 20 / 35 | 4813 |
| 2 | 1 | 64.1 | 77.8 | 13 / 35 | 4414 |
| 3 | 1 | 65.0 | 77.1 | 18 / 35 | 4599 |
| 4 | 1 | 65.2 | 79.0 | 16 / 35 | 4311 |
| 5 | 1 | 62.1 | 73.7 | 9 / 35 | 4014 |
| 6 | 1 | 65.3 | 79.7 | 20 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 73% |
| dummy.micro.Sparrow 2.5 | 29 | 72% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 67% |
| bvh.micro.Freya 0.3 | 19 | 84% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 4 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 37% | 70 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 21% | 44 |
| dummy.micro.Sparrow 2.5 | 19 | 17% | 37 |
| bvh.micro.Freya 0.3 | 11 | 10% | 25 |
| conscience.Electron 1.3g | 7 | 6% | 11 |
| dl.BetterWalls 1.0 | 6 | 5% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 4% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 9 |

## Melee bench: F17

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.3 | 100 / 210 | 2.69 | 17.7% | 32582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.2 | 17.7% | 100 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.8% | 35 |
| supersample.SuperBoxBot 1.0 | 3.3 | 12.8% | 30 |
| sul.Lunar 1.1 | 3.7 | 11.4% | 19 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 11 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 5 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 6 |
| sample.Corners 1.0 | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.8 | 17 / 35 | 5807 |
| 2 | 1 | 66.1 | 80.3 | 15 / 35 | 5111 |
| 3 | 1 | 67.9 | 82.9 | 17 / 35 | 5663 |
| 4 | 2 | 64.9 | 76.2 | 14 / 35 | 4846 |
| 5 | 1 | 66.7 | 80.0 | 14 / 35 | 5555 |
| 6 | 1 | 69.6 | 90.5 | 23 / 35 | 5600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 57 | 77% |
| sul.Lunar 1.1 | 24 | 92% |
| supersample.SuperBoxBot 1.0 | 21 | 62% |
| sample.MyFirstRobot 1.0 | 7 | 71% |
| dsw.StaticD 1.0 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.Corners 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 33% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 41 | 37% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 25% | 73 |
| sample.MyFirstJuniorRobot 1.0 | 10 | 9% | 11 |
| sample.Corners 1.0 | 9 | 8% | 11 |
| sul.Lunar 1.1 | 8 | 7% | 35 |
| mme.NikeEnhanced 2.0 | 8 | 7% | 12 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 9 |
| dsw.StaticD 1.0 | 1 | 1% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorMD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 75.5 | 75 / 210 | 3.20 | 15.4% | 28043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMD 0.1 | 1.5 | 15.4% | 75 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.0 | 14.3% | 48 |
| radnor.DoctorBob 1.42 | 3.2 | 13.2% | 35 |
| mld.Wisdom 1.0 | 3.5 | 12.3% | 21 |
| amz.NanoClone 1.41 | 5.2 | 10.6% | 17 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.9% | 7 |
| sample.Walls 1.0 | 7.0 | 8.5% | 5 |
| jangs.ns51 1.0 | 8.3 | 6.1% | 2 |
| GarmBox.Oranges 1.0 | 8.5 | 6.4% | 0 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 80.6 | 15 / 35 | 4687 |
| 2 | 2 | 64.0 | 76.5 | 16 / 35 | 4333 |
| 3 | 3 | 59.3 | 67.3 | 5 / 35 | 4184 |
| 4 | 1 | 65.0 | 77.1 | 16 / 35 | 5000 |
| 5 | 1 | 65.0 | 76.8 | 14 / 35 | 5258 |
| 6 | 1 | 62.7 | 74.6 | 9 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 66% |
| radnor.DoctorBob 1.42 | 25 | 68% |
| mld.Wisdom 1.0 | 12 | 67% |
| amz.NanoClone 1.41 | 12 | 50% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 24% | 61 |
| sample.Walls 1.0 | 30 | 22% | 35 |
| radnor.DoctorBob 1.42 | 24 | 18% | 41 |
| amz.NanoClone 1.41 | 16 | 12% | 18 |
| mld.Wisdom 1.0 | 13 | 10% | 23 |
| KiraNL.Chupacabra 0.4 | 10 | 7% | 17 |
| jangs.ns51 1.0 | 7 | 5% | 11 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |

