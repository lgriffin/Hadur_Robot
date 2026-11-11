# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.2 | 76 / 210 | 2.88 | 17.5% | 33131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.5% | 76 |
| radnor.DoctorBob 1.42 | 2.3 | 15.6% | 44 |
| mz.AntiGrav 1.0 | 3.0 | 14.9% | 37 |
| mld.Infinity 2.2 | 3.5 | 14.4% | 41 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.7 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 4 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.3 | 13 / 35 | 5614 |
| 2 | 2 | 66.6 | 77.1 | 9 / 35 | 5627 |
| 3 | 1 | 66.1 | 76.2 | 10 / 35 | 5296 |
| 4 | 1 | 69.0 | 82.5 | 15 / 35 | 5770 |
| 5 | 1 | 65.9 | 72.7 | 11 / 35 | 5319 |
| 6 | 1 | 69.2 | 85.1 | 18 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 51% |
| mz.AntiGrav 1.0 | 36 | 89% |
| mld.Infinity 2.2 | 34 | 56% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 62 | 46% | 82 |
| mld.Infinity 2.2 | 33 | 24% | 29 |
| mz.AntiGrav 1.0 | 21 | 16% | 60 |
| amz.NanoClone 1.41 | 9 | 7% | 13 |
| jangs.ns51 1.0 | 5 | 4% | 12 |
| sample.Walls 1.0 | 3 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 6 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.6 | 105 / 210 | 2.83 | 16.5% | 24050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.5% | 105 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.3% | 59 |
| mld.DustBunny 3.8 | 3.2 | 13.3% | 15 |
| djdjdj.NanoSkunk10 1.0 | 4.5 | 10.4% | 16 |
| maribo.melee.BMV 0.1 | 4.7 | 10.7% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 3 |
| fullsail.SweetTea 1.1 | 7.8 | 6.8% | 7 |
| bzdp.BoxCar 2.0 | 8.0 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 75.6 | 17 / 35 | 3489 |
| 2 | 1 | 66.7 | 86.0 | 18 / 35 | 4122 |
| 3 | 1 | 66.4 | 87.3 | 19 / 35 | 3698 |
| 4 | 1 | 65.7 | 82.5 | 19 / 35 | 4208 |
| 5 | 1 | 65.5 | 81.6 | 20 / 35 | 3975 |
| 6 | 2 | 62.7 | 64.8 | 12 / 35 | 4558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 75 | 68% |
| mld.DustBunny 3.8 | 32 | 88% |
| djdjdj.NanoSkunk10 1.0 | 12 | 100% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 39% | 86 |
| mld.DustBunny 3.8 | 15 | 14% | 39 |
| djdjdj.NanoSkunk10 1.0 | 9 | 9% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 9% | 14 |
| zyx.nano.Ant 1.1 | 9 | 9% | 11 |
| fullsail.SweetTea 1.1 | 6 | 6% | 11 |
| bzdp.BoxCar 2.0 | 6 | 6% | 6 |
| maribo.melee.BMV 0.1 | 5 | 5% | 16 |
| cs.Grudge 1.0 | 5 | 5% | 4 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.0 | 102 / 210 | 2.98 | 17.3% | 28306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 17.3% | 102 |
| myl.micro.Troodon 1.10 | 1.8 | 15.6% | 51 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 13.1% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.2% | 22 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 15 |
| fm.mammillarias 1.3 | 5.8 | 9.3% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.5% | 3 |
| sample.Fire 1.0 | 9.3 | 4.5% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.7 | 19 / 35 | 4553 |
| 2 | 1 | 64.2 | 71.1 | 14 / 35 | 4362 |
| 3 | 1 | 68.5 | 83.8 | 18 / 35 | 5146 |
| 4 | 2 | 64.8 | 72.7 | 12 / 35 | 4707 |
| 5 | 1 | 67.7 | 82.9 | 20 / 35 | 4580 |
| 6 | 1 | 67.2 | 79.0 | 19 / 35 | 4958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 55% |
| cb.nano.Insomnia 1.0 | 18 | 78% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 7 | 71% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 29 | 27% | 82 |
| stelo.SoRobotNanoMelee 1.2 | 24 | 22% | 28 |
| myl.nano.KomoriNinja 1.1 | 16 | 15% | 44 |
| cb.nano.Insomnia 1.0 | 13 | 12% | 9 |
| cs.sheldor.Talon 1.1 | 8 | 7% | 13 |
| fm.mammillarias 1.3 | 7 | 6% | 11 |
| sample.Fire 1.0 | 5 | 5% | 6 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 14 |
| sample.Tracker 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.0 | 105 / 210 | 2.89 | 17.4% | 29750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.4% | 105 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.5% | 19 |
| tvv.micro.Antares 1.1.1 | 2.7 | 13.4% | 42 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.7% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 2 |
| tj.zombie1n 1.0.1 | 6.0 | 9.1% | 9 |
| yk.JahMicro 1.0 | 7.2 | 8.1% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 80.0 | 15 / 35 | 4659 |
| 2 | 1 | 67.6 | 83.5 | 23 / 35 | 4903 |
| 3 | 1 | 65.7 | 77.5 | 14 / 35 | 4858 |
| 4 | 1 | 64.6 | 74.9 | 16 / 35 | 4880 |
| 5 | 1 | 68.8 | 86.3 | 22 / 35 | 5492 |
| 6 | 1 | 64.6 | 71.7 | 15 / 35 | 4958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 84% |
| stelo.SoJNanoMelee 1.1 | 33 | 64% |
| tvv.micro.Antares 1.1.1 | 30 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| tj.zombie1n 1.0.1 | 4 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 35% | 87 |
| stelo.SoJNanoMelee 1.1 | 25 | 24% | 38 |
| tvv.micro.Antares 1.1.1 | 24 | 23% | 41 |
| tj.zombie1n 1.0.1 | 6 | 6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 12 |
| yk.JahMicro 1.0 | 4 | 4% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 66.0 | 92 / 210 | 4.06 | 15.0% | 25768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 15.0% | 92 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.7% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.0% | 16 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 7 |
| sam.Samspin 1.0 | 5.8 | 9.9% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.2% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 9.0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 64.4 | 16 / 35 | 4300 |
| 2 | 1 | 64.6 | 75.9 | 18 / 35 | 4416 |
| 3 | 1 | 62.1 | 66.0 | 16 / 35 | 4316 |
| 4 | 1 | 63.7 | 67.9 | 19 / 35 | 4328 |
| 5 | 2 | 59.1 | 57.1 | 13 / 35 | 3939 |
| 6 | 1 | 61.5 | 64.4 | 10 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 33 | 97% |
| oog.melee.Corsair 1.0 | 23 | 91% |
| ahf.NanoAndrew .4 | 15 | 87% |
| sam.Samspin 1.0 | 11 | 91% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 348. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 19 | 16% | 50 |
| ahf.NanoAndrew .4 | 18 | 15% | 31 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 28 |
| EBBU.Sim2 1.02 | 16 | 14% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 13% | 17 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 12 |
| oog.melee.Corsair 1.0 | 10 | 8% | 32 |
| sam.Samspin 1.0 | 8 | 7% | 13 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.4 | 129 / 210 | 2.40 | 17.8% | 25567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.8% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.3% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.0% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.4% | 9 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.6% | 7 |
| fm.claire 1.7 | 6.7 | 8.2% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 3 |
| kurios.DOSexe .9b | 9.3 | 5.7% | 0 |
| pa.Improved 1.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.6 | 23 / 35 | 4653 |
| 2 | 1 | 65.9 | 83.5 | 21 / 35 | 4040 |
| 3 | 1 | 67.8 | 87.6 | 23 / 35 | 4521 |
| 4 | 1 | 65.3 | 78.4 | 21 / 35 | 4026 |
| 5 | 1 | 66.3 | 83.2 | 16 / 35 | 4323 |
| 6 | 1 | 67.1 | 86.0 | 25 / 35 | 4004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 89% |
| oog.melee.CapuletDroid 1.1 | 31 | 81% |
| gh.nano.Grofvuil 0.2 | 25 | 88% |
| arthord.NanoSatanMelee Beta | 11 | 73% |
| winamp32.micro.MicroMacro 1.0 | 10 | 90% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 50% |

Hadur died in 83 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 30% | 82 |
| oog.melee.CapuletDroid 1.1 | 15 | 18% | 16 |
| gh.nano.Grofvuil 0.2 | 14 | 17% | 37 |
| arthord.NanoSatanMelee Beta | 11 | 13% | 26 |
| sample.SpinBot 1.0 | 7 | 8% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 14 |
| fm.claire 1.7 | 4 | 5% | 8 |
| kurios.DOSexe .9b | 1 | 1% | 10 |
| pa.Improved 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.2 | 83 / 210 | 3.05 | 16.0% | 25669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.5 | 16.0% | 83 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.7% | 43 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.9% | 50 |
| mz.MicroGodMelee 1 | 3.7 | 13.2% | 15 |
| DBall.Anarchy 0.1 | 5.2 | 9.0% | 13 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.2% | 2 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 4 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.8% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 78.7 | 12 / 35 | 4418 |
| 2 | 1 | 63.9 | 75.9 | 13 / 35 | 4077 |
| 3 | 1 | 65.9 | 78.7 | 15 / 35 | 4616 |
| 4 | 2 | 65.6 | 81.0 | 16 / 35 | 4055 |
| 5 | 2 | 63.6 | 74.9 | 12 / 35 | 4188 |
| 6 | 2 | 64.0 | 74.0 | 15 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 54% |
| gh.micro.Gruweltje 0.7 | 33 | 52% |
| mz.MicroGodMelee 1 | 32 | 88% |
| DBall.Anarchy 0.1 | 11 | 64% |
| mbro.Detektor3 0.1.1 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 38 | 30% | 70 |
| spinnercat.micro.Tyger 0.1 | 38 | 30% | 60 |
| mz.MicroGodMelee 1 | 23 | 18% | 43 |
| DBall.Anarchy 0.1 | 9 | 7% | 14 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 8 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 5 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 4 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 66.6 | 68 / 210 | 4.00 | 14.8% | 26975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.2% | 52 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 14.8% | 68 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.4% | 51 |
| germ.TheMind .2 | 4.3 | 10.2% | 11 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.9% | 9 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 6 |
| sample.Crazy 1.0 | 7.8 | 7.2% | 3 |
| stelo.UntouchableNano 1.3 | 8.5 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 67.0 | 13 / 35 | 4773 |
| 2 | 2 | 61.7 | 65.7 | 11 / 35 | 4553 |
| 3 | 2 | 61.1 | 65.4 | 11 / 35 | 4092 |
| 4 | 3 | 58.0 | 58.4 | 9 / 35 | 3669 |
| 5 | 1 | 63.9 | 69.5 | 12 / 35 | 4966 |
| 6 | 2 | 64.6 | 73.7 | 12 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 45% |
| awesomeness.Elite 1.0 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| germ.TheMind .2 | 6 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 38% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 28% | 49 |
| awesomeness.Elite 1.0 | 14 | 10% | 17 |
| germ.TheMind .2 | 13 | 9% | 20 |
| lrem.micro.MoggFanatic 0.2 | 8 | 6% | 10 |
| stelo.UntouchableNano 1.3 | 7 | 5% | 11 |
| qualidafial.MajorDick 1.0.1 | 3 | 2% | 6 |
| sample.Crazy 1.0 | 3 | 2% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.4 | 111 / 210 | 2.76 | 16.7% | 21406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.7% | 111 |
| nz.jdc.nano.GridFu 1.0 | 2.3 | 14.0% | 34 |
| rz.HawkOnFire 0.1 | 2.7 | 13.6% | 22 |
| maribo.IotaCT 1.1 | 4.2 | 11.3% | 18 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.8% | 1 |
| spinnercat.Omen 1.0 | 7.2 | 8.1% | 3 |
| ratosh.Wesco 1.4 | 7.7 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 8.5 | 7.4% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.0 | 23 / 35 | 3964 |
| 2 | 1 | 66.0 | 81.0 | 17 / 35 | 3637 |
| 3 | 1 | 66.7 | 86.0 | 20 / 35 | 3175 |
| 4 | 1 | 65.3 | 79.7 | 16 / 35 | 3306 |
| 5 | 1 | 63.5 | 70.8 | 18 / 35 | 3673 |
| 6 | 1 | 65.2 | 78.1 | 17 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 44 | 95% |
| nz.jdc.nano.GridFu 1.0 | 43 | 70% |
| maribo.IotaCT 1.1 | 15 | 53% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| stelo.PatternRobot 1.0 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 30 | 30% | 65 |
| maribo.IotaCT 1.1 | 17 | 17% | 29 |
| rz.HawkOnFire 0.1 | 16 | 16% | 49 |
| stelo.PatternRobot 1.0 | 10 | 10% | 13 |
| timmit.nano.TimDog 0.33 | 9 | 9% | 20 |
| ratosh.Wesco 1.4 | 9 | 9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 8% | 13 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.8 | 123 / 210 | 2.37 | 18.6% | 31258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.6% | 123 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.2% | 40 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 10 |
| zyx.micro.Ant 1.1 | 4.8 | 10.0% | 12 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.6% | 3 |
| sanja.First 0.1 | 7.2 | 8.2% | 7 |
| cvt.Firsty 1.0 | 7.7 | 7.9% | 9 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 21 / 35 | 5186 |
| 2 | 1 | 64.7 | 77.5 | 15 / 35 | 4537 |
| 3 | 1 | 68.5 | 87.0 | 25 / 35 | 5047 |
| 4 | 1 | 68.3 | 87.6 | 19 / 35 | 5240 |
| 5 | 1 | 69.6 | 86.7 | 24 / 35 | 5646 |
| 6 | 1 | 68.5 | 85.1 | 19 / 35 | 5602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 61% |
| baal.nano.N 1.42 | 27 | 96% |
| zyx.micro.Ant 1.1 | 21 | 86% |
| cvt.Firsty 1.0 | 21 | 86% |
| sanja.First 0.1 | 14 | 79% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 38% | 66 |
| zyx.micro.Ant 1.1 | 17 | 19% | 44 |
| baal.nano.N 1.42 | 9 | 10% | 23 |
| sanja.First 0.1 | 7 | 8% | 18 |
| sample.RamFire 1.0 | 7 | 8% | 7 |
| Grystrion.TrackerWO 1.0 | 6 | 7% | 15 |
| cvt.Firsty 1.0 | 5 | 6% | 24 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 7 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 61.3 | 51 / 210 | 4.48 | 12.9% | 24178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.0% | 93 |
| cs.Wren 1.0 | 2.3 | 13.5% | 24 |
| hadur117.micro.SaorOG1 0.1 | 2.7 | 12.9% | 51 |
| js.PinBall 1.6 | 4.2 | 11.7% | 18 |
| mz.Cork 0.1 | 4.7 | 10.9% | 9 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 1 |
| evd.X1 0.01 | 6.8 | 8.2% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 7 |
| PSW.Relentless 0.1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.8 | 50.5 | 8 / 35 | 3924 |
| 2 | 3 | 57.1 | 59.0 | 10 / 35 | 3392 |
| 3 | 2 | 59.2 | 59.7 | 6 / 35 | 4775 |
| 4 | 3 | 58.2 | 57.1 | 10 / 35 | 4505 |
| 5 | 2 | 60.3 | 66.3 | 10 / 35 | 4090 |
| 6 | 2 | 61.1 | 75.2 | 7 / 35 | 3492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 43% |
| cs.Wren 1.0 | 17 | 94% |
| mz.Cork 0.1 | 7 | 71% |
| donjezza.Jezza 1.0 | 3 | 100% |
| js.PinBall 1.6 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 70 | 44% | 94 |
| cs.Wren 1.0 | 18 | 11% | 31 |
| joe.ADinosaur 1.0 | 18 | 11% | 18 |
| evd.X1 0.01 | 16 | 10% | 17 |
| mz.Cork 0.1 | 15 | 9% | 23 |
| js.PinBall 1.6 | 13 | 8% | 14 |
| PSW.Relentless 0.1 | 9 | 6% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.1 | 91 / 210 | 3.24 | 16.3% | 24787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.3% | 91 |
| myl.nano.Graviton 1.10 | 2.5 | 12.6% | 41 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.2% | 24 |
| ntc.Opposite 1.5 | 4.2 | 11.0% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.9% | 4 |
| DBall.NUKE 0.1 | 7.2 | 8.7% | 9 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 13 |
| donjezza.Muncho 1.0 | 9.3 | 6.3% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 71.1 | 13 / 35 | 3840 |
| 2 | 1 | 63.4 | 71.4 | 14 / 35 | 4169 |
| 3 | 1 | 66.5 | 82.2 | 16 / 35 | 4492 |
| 4 | 1 | 64.3 | 73.3 | 16 / 35 | 4303 |
| 5 | 1 | 61.8 | 69.5 | 13 / 35 | 3751 |
| 6 | 1 | 66.5 | 82.9 | 19 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 74% |
| stelo.AreaTargetingBot 1.1 | 26 | 54% |
| ntc.Opposite 1.5 | 17 | 59% |
| disan.Chair 2.2.0 | 12 | 67% |
| donjezza.Muncho 1.0 | 10 | 90% |
| DBall.NUKE 0.1 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 31 | 26% | 56 |
| stelo.AreaTargetingBot 1.1 | 27 | 23% | 43 |
| pfvicm.Sobieski 7.2.3b | 17 | 14% | 25 |
| ntc.Opposite 1.5 | 15 | 13% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 23 |
| disan.Chair 2.2.0 | 8 | 7% | 10 |
| donjezza.Muncho 1.0 | 5 | 4% | 11 |
| DBall.NUKE 0.1 | 4 | 3% | 11 |
| pbg.R2D2 1.0 | 2 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 63.7 | 73 / 210 | 4.27 | 13.5% | 20223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.7% | 45 |
| kawigi.micro.Shiz 1.1 | 1.8 | 14.7% | 52 |
| hadur117.micro.SaorOG1 0.1 | 3.0 | 13.5% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.1% | 20 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 9 |
| ejb.Polaris 1.0.1 | 5.5 | 11.2% | 9 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 2 |
| step.nanoPri 1.0 | 7.7 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 67.0 | 12 / 35 | 3517 |
| 2 | 2 | 64.2 | 75.2 | 16 / 35 | 3393 |
| 3 | 4 | 59.7 | 58.7 | 10 / 35 | 3564 |
| 4 | 5 | 56.0 | 51.1 | 10 / 35 | 3063 |
| 5 | 3 | 58.8 | 61.0 | 10 / 35 | 3079 |
| 6 | 2 | 63.0 | 68.9 | 15 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 78% |
| kawigi.micro.Shiz 1.1 | 26 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 100% |
| yagami.Tidus 0.11 | 8 | 100% |
| ejb.Polaris 1.0.1 | 5 | 60% |

Hadur died in 137 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 67 | 49% | 86 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 29 |
| yagami.Tidus 0.11 | 15 | 11% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 9% | 30 |
| ejb.Polaris 1.0.1 | 11 | 8% | 17 |
| stelo.MirrorNano 1.3 | 8 | 6% | 10 |
| kurios.DOSexe .9a | 4 | 3% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.2 | 108 / 210 | 3.50 | 14.8% | 18727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 14.8% | 108 |
| wee.Gem 1.8.4 | 2.2 | 13.5% | 41 |
| bzdp.Pansy 2.1 | 3.5 | 12.4% | 16 |
| wompi.Quokka 1.6 | 3.8 | 11.9% | 24 |
| ratosh.Nobo 0.21 | 4.8 | 10.8% | 9 |
| m3thos.Eva00 1.1 | 5.5 | 10.2% | 11 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 71.7 | 18 / 35 | 3058 |
| 2 | 1 | 63.2 | 76.5 | 23 / 35 | 2961 |
| 3 | 1 | 61.9 | 73.3 | 15 / 35 | 3086 |
| 4 | 2 | 61.5 | 70.5 | 17 / 35 | 3033 |
| 5 | 1 | 64.1 | 78.1 | 20 / 35 | 3447 |
| 6 | 1 | 59.3 | 63.2 | 15 / 35 | 3142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 48 | 92% |
| bzdp.Pansy 2.1 | 29 | 93% |
| wompi.Quokka 1.6 | 21 | 71% |
| ratosh.Nobo 0.21 | 8 | 75% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 25 | 25% | 74 |
| wompi.Quokka 1.6 | 19 | 19% | 27 |
| bzdp.Pansy 2.1 | 12 | 12% | 39 |
| stelo.MyAgileRobot 0.2 | 11 | 11% | 12 |
| ratosh.Nobo 0.21 | 10 | 10% | 20 |
| maribo.FollowFire 1 | 10 | 10% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 7% | 7 |
| m3thos.Eva00 1.1 | 4 | 4% | 12 |
| bayen.UbaMicro 1.4 | 4 | 4% | 8 |

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 80.2 | 21 / 210 | 2.78 | 18.2% | 42512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 22.0% | 174 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 18.2% | 21 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 13 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.1% | 1 |
| ayk.WallHugger 1.0 | 4.8 | 8.7% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.4 | 83.5 | 2 / 35 | 7591 |
| 2 | 2 | 70.0 | 80.3 | 3 / 35 | 7395 |
| 3 | 2 | 68.4 | 76.5 | 6 / 35 | 6660 |
| 4 | 2 | 69.9 | 82.5 | 5 / 35 | 7014 |
| 5 | 2 | 68.5 | 80.3 | 3 / 35 | 6463 |
| 6 | 2 | 69.3 | 78.1 | 2 / 35 | 7389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 140 | 6% |
| mz.NanoGod 2.02 | 11 | 64% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 1065. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 148 | 78% | 157 |
| mz.NanoGod 2.02 | 25 | 13% | 32 |
| ayk.WallHugger 1.0 | 6 | 3% | 5 |
| stelo.PianistNano 1.2 | 4 | 2% | 5 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 66.0 | 93 / 210 | 4.06 | 14.5% | 22683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.5 | 14.2% | 32 |
| hadur117.micro.SaorOG1 0.1 | 1.7 | 14.5% | 93 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.8% | 30 |
| bvh.micro.Freya 0.3 | 3.8 | 12.1% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.7% | 12 |
| conscience.Electron 1.3g | 6.3 | 8.7% | 5 |
| stelo.MirrorMicro 1.0 | 6.7 | 8.6% | 4 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 11 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.5 | 19 / 35 | 3919 |
| 2 | 3 | 58.9 | 60.6 | 17 / 35 | 3205 |
| 3 | 2 | 59.1 | 62.2 | 12 / 35 | 3574 |
| 4 | 1 | 62.1 | 66.3 | 14 / 35 | 4154 |
| 5 | 2 | 61.9 | 64.8 | 14 / 35 | 4127 |
| 6 | 1 | 62.9 | 72.4 | 17 / 35 | 3704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 77% |
| dummy.micro.Sparrow 2.5 | 22 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 95% |
| bvh.micro.Freya 0.3 | 14 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 25 | 21% | 31 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 16% | 43 |
| dummy.micro.Sparrow 2.5 | 18 | 15% | 36 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 51 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 11% | 13 |
| dl.BetterWalls 1.0 | 11 | 9% | 15 |
| bvh.micro.Freya 0.3 | 10 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 4 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 79.3 | 109 / 210 | 2.86 | 18.7% | 35270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.7% | 109 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 16.6% | 40 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 16 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 15 |
| dsw.StaticD 1.0 | 5.3 | 9.5% | 10 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.9% | 4 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 0 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.1% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 4 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.3 | 22 / 35 | 5845 |
| 2 | 1 | 67.8 | 76.2 | 18 / 35 | 5677 |
| 3 | 1 | 68.5 | 81.0 | 18 / 35 | 5861 |
| 4 | 1 | 67.9 | 78.7 | 19 / 35 | 5516 |
| 5 | 1 | 69.7 | 81.6 | 19 / 35 | 6574 |
| 6 | 1 | 67.7 | 78.1 | 13 / 35 | 5797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 62 | 81% |
| sul.Lunar 1.1 | 28 | 96% |
| supersample.SuperBoxBot 1.0 | 19 | 68% |
| dsw.StaticD 1.0 | 12 | 50% |
| mme.NikeEnhanced 2.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 7 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 41 | 41% | 90 |
| supersample.SuperBoxBot 1.0 | 18 | 18% | 30 |
| dsw.StaticD 1.0 | 14 | 14% | 21 |
| sul.Lunar 1.1 | 8 | 8% | 33 |
| sample.MyFirstRobot 1.0 | 6 | 6% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 5% | 11 |
| mme.NikeEnhanced 2.0 | 4 | 4% | 10 |
| tlp.ThreeLeggedPig 1 | 3 | 3% | 3 |
| sample.Corners 1.0 | 2 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.4 | 87 / 210 | 3.21 | 16.6% | 32019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.3 | 16.6% | 87 |
| radnor.DoctorBob 1.42 | 1.8 | 14.5% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.9% | 31 |
| mld.Wisdom 1.0 | 4.5 | 11.5% | 17 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 8 |
| amz.NanoClone 1.41 | 5.3 | 10.5% | 9 |
| sample.Walls 1.0 | 7.3 | 7.4% | 2 |
| GarmBox.Oranges 1.0 | 8.2 | 6.4% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.5 | 19 / 35 | 6070 |
| 2 | 1 | 65.4 | 75.2 | 12 / 35 | 5738 |
| 3 | 1 | 66.6 | 81.6 | 16 / 35 | 5132 |
| 4 | 2 | 64.0 | 71.4 | 13 / 35 | 5104 |
| 5 | 2 | 60.3 | 61.0 | 9 / 35 | 4600 |
| 6 | 1 | 66.8 | 79.7 | 18 / 35 | 5375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 74% |
| radnor.DoctorBob 1.42 | 37 | 46% |
| mld.Wisdom 1.0 | 15 | 87% |
| amz.NanoClone 1.41 | 11 | 82% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 34% | 59 |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 26% | 63 |
| mld.Wisdom 1.0 | 14 | 11% | 25 |
| KiraNL.Chupacabra 0.4 | 11 | 9% | 20 |
| amz.NanoClone 1.41 | 11 | 9% | 18 |
| jangs.ns51 1.0 | 6 | 5% | 8 |
| sample.Walls 1.0 | 5 | 4% | 8 |
| GarmBox.Oranges 1.0 | 3 | 2% | 6 |

