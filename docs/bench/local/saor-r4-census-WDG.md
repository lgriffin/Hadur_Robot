# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 90.2 | 152 / 210 | 1.88 | 22.0% | 44058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 22.0% | 152 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 14 |
| radnor.DoctorBob 1.42 | 2.7 | 14.0% | 22 |
| mld.Infinity 2.2 | 4.0 | 12.1% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 5 |
| sample.Walls 1.0 | 6.2 | 7.2% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.6% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 86.7 | 22 / 35 | 7250 |
| 2 | 1 | 73.4 | 90.5 | 27 / 35 | 7384 |
| 3 | 1 | 72.7 | 89.2 | 26 / 35 | 7219 |
| 4 | 1 | 73.1 | 92.1 | 25 / 35 | 7377 |
| 5 | 1 | 71.7 | 85.7 | 23 / 35 | 7340 |
| 6 | 1 | 74.2 | 97.1 | 29 / 35 | 7488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 93% |
| radnor.DoctorBob 1.42 | 44 | 82% |
| mld.Infinity 2.2 | 26 | 92% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 6 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 42% | 64 |
| mz.AntiGrav 1.0 | 12 | 20% | 78 |
| amz.NanoClone 1.41 | 9 | 15% | 13 |
| mld.Infinity 2.2 | 7 | 12% | 37 |
| jangs.ns51 1.0 | 4 | 7% | 7 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.7 | 118 / 210 | 2.83 | 18.0% | 33045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.3 | 18.0% | 118 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.9% | 60 |
| mld.DustBunny 3.8 | 3.0 | 12.7% | 9 |
| maribo.melee.BMV 0.1 | 4.0 | 11.2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.4% | 4 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 5 |
| bzdp.BoxCar 2.0 | 7.8 | 7.1% | 2 |
| fullsail.SweetTea 1.1 | 9.2 | 5.1% | 3 |
| cs.Grudge 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.2 | 23 / 35 | 5589 |
| 2 | 1 | 67.6 | 80.0 | 20 / 35 | 5432 |
| 3 | 1 | 69.5 | 87.6 | 23 / 35 | 6021 |
| 4 | 1 | 67.6 | 81.9 | 20 / 35 | 5262 |
| 5 | 1 | 70.0 | 88.9 | 24 / 35 | 5867 |
| 6 | 3 | 58.2 | 49.5 | 8 / 35 | 4874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 71% |
| mld.DustBunny 3.8 | 41 | 95% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 35% | 90 |
| maribo.melee.BMV 0.1 | 14 | 15% | 20 |
| mld.DustBunny 3.8 | 11 | 12% | 37 |
| cs.Grudge 1.0 | 11 | 12% | 11 |
| zyx.nano.Ant 1.1 | 10 | 11% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 13 |
| fullsail.SweetTea 1.1 | 4 | 4% | 6 |
| bzdp.BoxCar 2.0 | 4 | 4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 14 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.8 | 137 / 210 | 2.46 | 20.2% | 37557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.2% | 137 |
| myl.micro.Troodon 1.10 | 2.3 | 13.6% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.9% | 21 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.3% | 6 |
| fm.mammillarias 1.3 | 5.2 | 9.5% | 7 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 7 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.8% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 3 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 84.4 | 24 / 35 | 6244 |
| 2 | 1 | 70.3 | 84.8 | 22 / 35 | 6485 |
| 3 | 1 | 69.0 | 79.7 | 22 / 35 | 5906 |
| 4 | 1 | 71.0 | 86.3 | 24 / 35 | 6493 |
| 5 | 1 | 68.1 | 76.5 | 20 / 35 | 5724 |
| 6 | 1 | 72.2 | 91.1 | 25 / 35 | 6705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 81% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| sp.Nanos.Ember 1.1 | 17 | 88% |
| fm.mammillarias 1.3 | 14 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 26% | 46 |
| myl.micro.Troodon 1.10 | 11 | 15% | 53 |
| fm.mammillarias 1.3 | 10 | 14% | 16 |
| cb.nano.Insomnia 1.0 | 9 | 12% | 12 |
| myl.nano.KomoriNinja 1.1 | 7 | 10% | 32 |
| sp.Nanos.Ember 1.1 | 7 | 10% | 22 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 18 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.2 | 151 / 210 | 2.33 | 20.6% | 39403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.6% | 151 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.4% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 11 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.9% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.3% | 0 |
| yk.JahMicro 1.0 | 7.0 | 8.1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.2% | 2 |
| repositorio.NanoStep 1.0 | 8.3 | 6.9% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 81.3 | 25 / 35 | 6129 |
| 2 | 1 | 71.2 | 85.7 | 26 / 35 | 6996 |
| 3 | 1 | 71.2 | 87.9 | 23 / 35 | 6860 |
| 4 | 1 | 72.4 | 93.0 | 27 / 35 | 7094 |
| 5 | 1 | 69.1 | 81.9 | 24 / 35 | 5972 |
| 6 | 1 | 69.3 | 81.6 | 26 / 35 | 6352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 92% |
| stelo.SoJNanoMelee 1.1 | 47 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 96% |
| tj.zombie1n 1.0.1 | 19 | 89% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| yk.JahMicro 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 36% | 75 |
| tvv.micro.Antares 1.1.1 | 9 | 15% | 28 |
| stelo.SoJNanoMelee 1.1 | 8 | 14% | 30 |
| tj.zombie1n 1.0.1 | 6 | 10% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 28 |
| yk.JahMicro 1.0 | 3 | 5% | 6 |
| repositorio.NanoStep 1.0 | 2 | 3% | 13 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.1 | 101 / 210 | 3.51 | 16.7% | 29716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.7% | 101 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.7% | 25 |
| ahf.NanoAndrew .4 | 3.8 | 11.2% | 26 |
| EBBU.Sim2 1.02 | 5.5 | 9.7% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 8.9% | 8 |
| sam.Samspin 1.0 | 6.7 | 8.9% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 66.3 | 14 / 35 | 4848 |
| 2 | 1 | 66.3 | 78.4 | 21 / 35 | 4737 |
| 3 | 1 | 66.2 | 74.3 | 18 / 35 | 5209 |
| 4 | 1 | 65.3 | 75.2 | 18 / 35 | 4971 |
| 5 | 1 | 61.9 | 63.5 | 12 / 35 | 4571 |
| 6 | 1 | 66.3 | 74.9 | 18 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 86% |
| oog.melee.Corsair 1.0 | 35 | 60% |
| ahf.NanoAndrew .4 | 14 | 86% |
| EBBU.Sim2 1.02 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 9 | 100% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 60% |

Hadur died in 109 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 22% | 55 |
| oog.melee.Corsair 1.0 | 23 | 21% | 44 |
| robar.nano.Assertive_Melee 0.2 | 13 | 12% | 16 |
| zyx.nano.BacillusComma 1.0 | 12 | 11% | 23 |
| ahf.NanoAndrew .4 | 10 | 9% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 10 |
| EBBU.Sim2 1.02 | 8 | 7% | 19 |
| sam.Samspin 1.0 | 7 | 6% | 17 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.9 | 149 / 210 | 1.91 | 20.3% | 34357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.3% | 149 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 27 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.5% | 10 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.0% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 5 |
| fm.claire 1.7 | 6.5 | 8.3% | 1 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 3 |
| pa.Improved 1.0 | 8.8 | 6.1% | 0 |
| kurios.DOSexe .9b | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.5 | 20 / 35 | 5520 |
| 2 | 1 | 70.9 | 91.1 | 25 / 35 | 6114 |
| 3 | 1 | 70.1 | 88.6 | 25 / 35 | 5791 |
| 4 | 1 | 71.8 | 94.0 | 27 / 35 | 6416 |
| 5 | 1 | 69.0 | 90.8 | 25 / 35 | 4755 |
| 6 | 1 | 71.1 | 91.4 | 27 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 87% |
| oog.melee.CapuletDroid 1.1 | 39 | 92% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| arthord.NanoSatanMelee Beta | 16 | 94% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 34% | 81 |
| gh.nano.Grofvuil 0.2 | 12 | 20% | 31 |
| oog.melee.CapuletDroid 1.1 | 8 | 13% | 44 |
| arthord.NanoSatanMelee Beta | 7 | 11% | 18 |
| winamp32.micro.MicroMacro 1.0 | 4 | 7% | 13 |
| sample.SpinBot 1.0 | 3 | 5% | 8 |
| kurios.DOSexe .9b | 3 | 5% | 8 |
| fm.claire 1.7 | 3 | 5% | 5 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 78.7 | 98 / 210 | 2.91 | 17.9% | 34150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.9% | 98 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.5% | 29 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.6% | 30 |
| mz.MicroGodMelee 1 | 3.3 | 13.2% | 34 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.2% | 3 |
| DBall.Anarchy 0.1 | 6.2 | 8.1% | 10 |
| el.JumpShoot 0.2 | 7.7 | 6.7% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.5% | 1 |
| fire219.CatBot 1.0 | 8.5 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 70.8 | 13 / 35 | 5041 |
| 2 | 1 | 67.9 | 82.2 | 20 / 35 | 5502 |
| 3 | 1 | 66.4 | 76.2 | 15 / 35 | 5505 |
| 4 | 1 | 69.5 | 85.4 | 21 / 35 | 6101 |
| 5 | 1 | 67.9 | 80.6 | 18 / 35 | 5809 |
| 6 | 1 | 67.0 | 77.1 | 11 / 35 | 6192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 42 | 64% |
| spinnercat.micro.Tyger 0.1 | 38 | 84% |
| gh.micro.Gruweltje 0.7 | 20 | 65% |
| DBall.Anarchy 0.1 | 16 | 100% |
| el.JumpShoot 0.2 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 37 | 33% | 61 |
| spinnercat.micro.Tyger 0.1 | 26 | 23% | 55 |
| gh.micro.Gruweltje 0.7 | 22 | 20% | 46 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 12 |
| acogdev.alpha 0.2 | 6 | 5% | 7 |
| DBall.Anarchy 0.1 | 4 | 4% | 16 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 76.6 | 127 / 210 | 3.11 | 17.9% | 32883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.9% | 127 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.1% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.2% | 24 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 6 |
| germ.TheMind .2 | 5.2 | 9.3% | 7 |
| awesomeness.Elite 1.0 | 6.0 | 8.6% | 4 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.7 | 7.6% | 2 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 72.4 | 21 / 35 | 5410 |
| 2 | 1 | 66.1 | 74.6 | 21 / 35 | 5190 |
| 3 | 1 | 66.6 | 74.0 | 19 / 35 | 5430 |
| 4 | 1 | 67.6 | 79.7 | 22 / 35 | 5627 |
| 5 | 1 | 66.8 | 75.6 | 20 / 35 | 5443 |
| 6 | 1 | 69.1 | 83.2 | 24 / 35 | 5783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 94% |
| germ.TheMind .2 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 31% | 82 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 23% | 40 |
| germ.TheMind .2 | 11 | 13% | 25 |
| awesomeness.Elite 1.0 | 9 | 11% | 14 |
| mym.EdgeStalker 1.0 | 5 | 6% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 6% | 9 |
| stelo.UntouchableNano 1.3 | 4 | 5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 3 | 4% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 8 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.6 | 153 / 210 | 1.84 | 20.6% | 32874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.6% | 153 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.7% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 11.0% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 1 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.0% | 5 |
| ratosh.Wesco 1.4 | 7.7 | 7.9% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.4% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 23 / 35 | 5547 |
| 2 | 1 | 71.2 | 91.7 | 27 / 35 | 5401 |
| 3 | 1 | 72.3 | 91.1 | 28 / 35 | 6088 |
| 4 | 1 | 70.4 | 89.8 | 27 / 35 | 4814 |
| 5 | 1 | 72.7 | 95.2 | 26 / 35 | 6037 |
| 6 | 1 | 68.7 | 84.8 | 22 / 35 | 4987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 93% |
| nz.jdc.nano.GridFu 1.0 | 26 | 100% |
| maribo.IotaCT 1.1 | 18 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 93% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| timmit.nano.TimDog 0.33 | 9 | 67% |
| ratosh.Wesco 1.4 | 8 | 50% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 13 | 23% | 25 |
| rz.HawkOnFire 0.1 | 11 | 19% | 68 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 14% | 14 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 41 |
| stelo.PatternRobot 1.0 | 6 | 11% | 14 |
| ratosh.Wesco 1.4 | 5 | 9% | 15 |
| maribo.IotaCT 1.1 | 4 | 7% | 24 |
| rrh.Iwillfindyou 2.0 | 2 | 4% | 2 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 94.6 | 183 / 210 | 1.49 | 22.3% | 41356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 22.3% | 183 |
| baal.nano.N 1.42 | 2.5 | 11.6% | 3 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.4% | 12 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.0% | 0 |
| squidM.TentalceMeleeNano 1.1 | 5.8 | 8.7% | 1 |
| zyx.micro.Ant 1.1 | 6.0 | 8.4% | 3 |
| sanja.First 0.1 | 6.5 | 8.2% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 3 |
| cvt.Firsty 1.0 | 8.5 | 7.0% | 1 |
| sample.RamFire 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 98.7 | 32 / 35 | 7313 |
| 2 | 1 | 71.9 | 92.4 | 29 / 35 | 6537 |
| 3 | 1 | 71.8 | 90.2 | 31 / 35 | 6915 |
| 4 | 1 | 72.7 | 98.4 | 32 / 35 | 6557 |
| 5 | 1 | 72.7 | 94.0 | 32 / 35 | 6982 |
| 6 | 1 | 71.9 | 93.7 | 27 / 35 | 7052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 95% |
| tvv.nano.Polaris 1.2 | 29 | 90% |
| sanja.First 0.1 | 28 | 100% |
| cvt.Firsty 1.0 | 27 | 100% |
| Grystrion.TrackerWO 1.0 | 24 | 100% |
| zyx.micro.Ant 1.1 | 17 | 88% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 29% | 27 |
| tvv.nano.Polaris 1.2 | 7 | 25% | 55 |
| sample.RamFire 1.0 | 4 | 14% | 6 |
| baal.nano.N 1.42 | 3 | 11% | 37 |
| squidM.TentalceMeleeNano 1.1 | 2 | 7% | 13 |
| amk.Punbot.Punbot 0.01 | 2 | 7% | 7 |
| Grystrion.TrackerWO 1.0 | 1 | 4% | 25 |
| cvt.Firsty 1.0 | 1 | 4% | 23 |
| sanja.First 0.1 | 0 | 0% | 16 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.1 | 97 / 210 | 3.51 | 16.5% | 33020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.5% | 97 |
| kc.micro.Figment 1.0 | 2.2 | 14.0% | 45 |
| cs.Wren 1.0 | 3.0 | 12.8% | 20 |
| js.PinBall 1.6 | 4.3 | 11.4% | 19 |
| mz.Cork 0.1 | 4.5 | 11.5% | 16 |
| joe.ADinosaur 1.0 | 6.2 | 8.7% | 5 |
| evd.X1 0.01 | 6.8 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.0 | 12 / 35 | 5464 |
| 2 | 1 | 65.0 | 72.4 | 17 / 35 | 5585 |
| 3 | 1 | 64.0 | 68.3 | 14 / 35 | 5148 |
| 4 | 1 | 67.4 | 79.4 | 17 / 35 | 6072 |
| 5 | 1 | 65.4 | 73.3 | 19 / 35 | 5472 |
| 6 | 1 | 64.7 | 72.1 | 18 / 35 | 5279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 48 | 81% |
| cs.Wren 1.0 | 39 | 79% |
| js.PinBall 1.6 | 13 | 69% |
| mz.Cork 0.1 | 10 | 90% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| evd.X1 0.01 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 37 | 32% | 81 |
| js.PinBall 1.6 | 22 | 19% | 32 |
| cs.Wren 1.0 | 18 | 16% | 41 |
| evd.X1 0.01 | 12 | 10% | 12 |
| joe.ADinosaur 1.0 | 10 | 9% | 11 |
| mz.Cork 0.1 | 8 | 7% | 17 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 3% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.9 | 123 / 210 | 2.63 | 18.6% | 30522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.6% | 123 |
| myl.nano.Graviton 1.10 | 3.2 | 11.4% | 25 |
| ntc.Opposite 1.5 | 3.3 | 11.1% | 6 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.1% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 5.5 | 9.9% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.9 | 21 / 35 | 4821 |
| 2 | 1 | 66.9 | 79.0 | 21 / 35 | 4947 |
| 3 | 1 | 66.4 | 78.7 | 17 / 35 | 5015 |
| 4 | 1 | 67.2 | 80.3 | 17 / 35 | 5105 |
| 5 | 1 | 68.9 | 82.9 | 23 / 35 | 5315 |
| 6 | 1 | 69.4 | 87.3 | 24 / 35 | 5319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 85% |
| myl.nano.Graviton 1.10 | 34 | 88% |
| ntc.Opposite 1.5 | 15 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| disan.Chair 2.2.0 | 10 | 100% |
| donjezza.Muncho 1.0 | 10 | 80% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 23 | 26% | 44 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 25 |
| stelo.AreaTargetingBot 1.1 | 14 | 16% | 45 |
| ntc.Opposite 1.5 | 10 | 11% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 19 |
| donjezza.Muncho 1.0 | 8 | 9% | 19 |
| DBall.NUKE 0.1 | 4 | 5% | 14 |
| disan.Chair 2.2.0 | 2 | 2% | 12 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.0 | 70 / 210 | 3.34 | 16.0% | 27810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.0% | 70 |
| oog.melee.Capulet 1.2 | 2.7 | 13.6% | 50 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 35 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 8 |
| step.nanoPri 1.0 | 7.5 | 6.8% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.0 | 15 / 35 | 4675 |
| 2 | 1 | 63.7 | 71.7 | 9 / 35 | 4366 |
| 3 | 1 | 63.1 | 70.2 | 8 / 35 | 4226 |
| 4 | 1 | 64.6 | 73.0 | 13 / 35 | 4467 |
| 5 | 1 | 65.8 | 74.6 | 12 / 35 | 5023 |
| 6 | 1 | 66.2 | 75.2 | 13 / 35 | 5053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 47% |
| kawigi.micro.Shiz 1.1 | 26 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 58% |
| yagami.Tidus 0.11 | 13 | 92% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 35% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 19% | 42 |
| kawigi.micro.Shiz 1.1 | 21 | 15% | 39 |
| yagami.Tidus 0.11 | 21 | 15% | 31 |
| ejb.Polaris 1.0.1 | 10 | 7% | 20 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 3 | 2% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.6 | 143 / 210 | 2.39 | 18.7% | 29158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.7% | 143 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 15 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 22 |
| wompi.Quokka 1.6 | 3.8 | 11.1% | 14 |
| ratosh.Nobo 0.21 | 4.3 | 10.7% | 6 |
| m3thos.Eva00 1.1 | 6.0 | 9.4% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.2 | 25 / 35 | 4792 |
| 2 | 1 | 67.1 | 82.9 | 23 / 35 | 4687 |
| 3 | 1 | 69.8 | 88.9 | 27 / 35 | 5461 |
| 4 | 1 | 66.7 | 76.5 | 21 / 35 | 4931 |
| 5 | 1 | 66.6 | 81.3 | 22 / 35 | 4401 |
| 6 | 1 | 68.8 | 88.6 | 25 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 90% |
| wee.Gem 1.8.4 | 34 | 97% |
| wompi.Quokka 1.6 | 24 | 96% |
| ratosh.Nobo 0.21 | 19 | 84% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| m3thos.Eva00 1.1 | 10 | 100% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 14 | 21% | 33 |
| bzdp.Pansy 2.1 | 11 | 16% | 55 |
| wee.Gem 1.8.4 | 10 | 15% | 43 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 15% | 13 |
| bayen.UbaMicro 1.4 | 7 | 10% | 18 |
| wompi.Quokka 1.6 | 6 | 9% | 23 |
| maribo.FollowFire 1 | 4 | 6% | 6 |
| m3thos.Eva00 1.1 | 3 | 4% | 14 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 5 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 89.0 | 136 / 210 | 1.99 | 21.7% | 47705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.7% | 136 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 49 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 19 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 3 |
| ayk.WallHugger 1.0 | 4.7 | 9.2% | 2 |
| stelo.PianistNano 1.2 | 6.3 | 7.5% | 0 |
| stuff.Vlad 0.1 | 6.5 | 7.8% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 89.2 | 26 / 35 | 7666 |
| 2 | 1 | 73.6 | 91.4 | 21 / 35 | 8442 |
| 3 | 1 | 72.8 | 88.3 | 22 / 35 | 7978 |
| 4 | 1 | 71.5 | 85.4 | 17 / 35 | 7638 |
| 5 | 1 | 75.1 | 97.1 | 29 / 35 | 8552 |
| 6 | 1 | 71.0 | 82.5 | 21 / 35 | 7429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 83% |
| exauge.GateKeeper 1.1.121g | 19 | 95% |
| mz.NanoGod 2.02 | 17 | 71% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 43% | 128 |
| mz.NanoGod 2.02 | 26 | 34% | 40 |
| exauge.GateKeeper 1.1.121g | 10 | 13% | 19 |
| ayk.WallHugger 1.0 | 4 | 5% | 9 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.0 | 95 / 210 | 3.61 | 16.4% | 29744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.4% | 95 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.5% | 23 |
| bvh.micro.Freya 0.3 | 3.2 | 11.9% | 18 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.7% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.5% | 19 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.6% | 12 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 8 |
| dl.BetterWalls 1.0 | 8.3 | 7.0% | 4 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 68.9 | 15 / 35 | 4704 |
| 2 | 1 | 63.3 | 68.6 | 13 / 35 | 4811 |
| 3 | 1 | 67.9 | 80.0 | 22 / 35 | 5453 |
| 4 | 1 | 62.2 | 64.4 | 15 / 35 | 4355 |
| 5 | 1 | 64.8 | 70.8 | 14 / 35 | 5466 |
| 6 | 1 | 64.8 | 73.0 | 16 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 31 | 87% |
| voidious.micro.BlitzBat 1.05 | 30 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 74% |
| dummy.micro.Sparrow 2.5 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 25 | 22% | 41 |
| voidious.micro.BlitzBat 1.05 | 22 | 19% | 52 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 15% | 34 |
| conscience.Electron 1.3g | 15 | 13% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 10 |
| bvh.micro.Freya 0.3 | 10 | 9% | 27 |
| dl.BetterWalls 1.0 | 8 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 85.9 | 153 / 210 | 2.27 | 21.4% | 42831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.4% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 18 |
| sul.Lunar 1.1 | 3.2 | 12.0% | 15 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.4% | 7 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 4 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 4 |
| sample.Corners 1.0 | 8.5 | 5.7% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 4 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 86.3 | 27 / 35 | 7314 |
| 2 | 1 | 71.9 | 86.0 | 26 / 35 | 7242 |
| 3 | 1 | 71.7 | 84.1 | 26 / 35 | 7498 |
| 4 | 1 | 70.2 | 83.8 | 22 / 35 | 6429 |
| 5 | 1 | 72.2 | 87.6 | 26 / 35 | 7174 |
| 6 | 1 | 71.8 | 87.6 | 26 / 35 | 7174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 56 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 91% |
| supersample.SuperBoxBot 1.0 | 28 | 93% |
| dsw.StaticD 1.0 | 13 | 77% |
| sample.Corners 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 26% | 30 |
| dsw.StaticD 1.0 | 14 | 25% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 19% | 59 |
| sul.Lunar 1.1 | 6 | 11% | 61 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 8 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 9 |
| sample.Corners 1.0 | 2 | 4% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.5 | 103 / 210 | 2.85 | 18.4% | 37507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.4% | 103 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.5% | 33 |
| mld.Wisdom 1.0 | 3.3 | 12.4% | 22 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.8% | 9 |
| amz.NanoClone 1.41 | 5.7 | 9.4% | 10 |
| GarmBox.Oranges 1.0 | 7.3 | 7.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.2% | 4 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 0 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.0 | 15 / 35 | 6108 |
| 2 | 1 | 66.7 | 76.5 | 15 / 35 | 5961 |
| 3 | 1 | 67.5 | 78.4 | 15 / 35 | 6331 |
| 4 | 1 | 69.4 | 83.5 | 21 / 35 | 6671 |
| 5 | 1 | 67.8 | 77.8 | 19 / 35 | 6604 |
| 6 | 1 | 67.5 | 80.6 | 18 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 78% |
| radnor.DoctorBob 1.42 | 30 | 67% |
| mld.Wisdom 1.0 | 14 | 71% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| amz.NanoClone 1.41 | 6 | 50% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 41 | 38% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 25% | 70 |
| radnor.DoctorBob 1.42 | 16 | 15% | 41 |
| KiraNL.Chupacabra 0.4 | 10 | 9% | 15 |
| amz.NanoClone 1.41 | 6 | 6% | 11 |
| sample.Walls 1.0 | 4 | 4% | 11 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 7 |

