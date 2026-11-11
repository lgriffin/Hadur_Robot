# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.9 | 141 / 210 | 2.00 | 21.6% | 44404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.6% | 141 |
| radnor.DoctorBob 1.42 | 2.5 | 14.2% | 21 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 26 |
| mld.Infinity 2.2 | 4.0 | 12.3% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.7% | 8 |
| sample.Walls 1.0 | 6.8 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.2% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 84.1 | 20 / 35 | 7621 |
| 2 | 1 | 74.4 | 97.1 | 30 / 35 | 7575 |
| 3 | 1 | 72.4 | 89.8 | 24 / 35 | 7116 |
| 4 | 1 | 71.9 | 86.7 | 24 / 35 | 7439 |
| 5 | 1 | 71.5 | 83.8 | 20 / 35 | 7611 |
| 6 | 1 | 72.8 | 91.7 | 23 / 35 | 7042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 94% |
| mld.Infinity 2.2 | 35 | 91% |
| radnor.DoctorBob 1.42 | 34 | 76% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 42% | 61 |
| mz.AntiGrav 1.0 | 17 | 25% | 75 |
| mld.Infinity 2.2 | 8 | 12% | 39 |
| amz.NanoClone 1.41 | 8 | 12% | 16 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.5 | 113 / 210 | 2.49 | 18.7% | 34318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.2 | 18.7% | 113 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.7% | 70 |
| mld.DustBunny 3.8 | 3.3 | 13.1% | 11 |
| maribo.melee.BMV 0.1 | 4.7 | 10.2% | 3 |
| zyx.nano.Ant 1.1 | 6.5 | 8.3% | 1 |
| fullsail.SweetTea 1.1 | 6.5 | 7.1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.0% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.4% | 5 |
| bzdp.BoxCar 2.0 | 7.8 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 24 / 35 | 6189 |
| 2 | 1 | 68.3 | 86.0 | 21 / 35 | 5068 |
| 3 | 1 | 69.1 | 87.3 | 19 / 35 | 5767 |
| 4 | 1 | 71.1 | 92.7 | 26 / 35 | 6653 |
| 5 | 1 | 68.1 | 83.8 | 16 / 35 | 5313 |
| 6 | 2 | 62.9 | 61.9 | 7 / 35 | 5328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 74% |
| mld.DustBunny 3.8 | 41 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 44% | 103 |
| mld.DustBunny 3.8 | 19 | 19% | 47 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 9% | 14 |
| zyx.nano.Ant 1.1 | 7 | 7% | 10 |
| maribo.melee.BMV 0.1 | 6 | 6% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 11 |
| bzdp.BoxCar 2.0 | 5 | 5% | 3 |
| cs.Grudge 1.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 83.7 | 139 / 210 | 2.47 | 20.3% | 38647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.3% | 139 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.4% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.5% | 21 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.5% | 4 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.7% | 2 |
| sample.Tracker 1.0 | 9.0 | 4.9% | 0 |
| sample.Fire 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 84.8 | 25 / 35 | 6651 |
| 2 | 1 | 70.4 | 83.8 | 21 / 35 | 6248 |
| 3 | 1 | 71.7 | 87.6 | 26 / 35 | 6965 |
| 4 | 1 | 68.9 | 77.8 | 21 / 35 | 6155 |
| 5 | 1 | 70.9 | 86.0 | 25 / 35 | 6568 |
| 6 | 1 | 69.1 | 82.2 | 21 / 35 | 6060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 83% |
| cb.nano.Insomnia 1.0 | 24 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 94% |
| sp.Nanos.Ember 1.1 | 13 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 24% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 24% | 39 |
| myl.nano.KomoriNinja 1.1 | 11 | 15% | 36 |
| fm.mammillarias 1.3 | 11 | 15% | 16 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 15 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 13 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 7 |
| sample.Fire 1.0 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.9 | 130 / 210 | 2.27 | 20.2% | 39066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.2% | 130 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.4% | 24 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.4% | 22 |
| tj.zombie1n 1.0.1 | 4.3 | 9.2% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.4% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 6 |
| yk.JahMicro 1.0 | 7.3 | 7.5% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.5 | 19 / 35 | 6334 |
| 2 | 1 | 70.0 | 87.3 | 21 / 35 | 6089 |
| 3 | 1 | 71.4 | 87.9 | 26 / 35 | 7047 |
| 4 | 1 | 69.8 | 86.7 | 20 / 35 | 6460 |
| 5 | 1 | 71.2 | 87.6 | 22 / 35 | 7345 |
| 6 | 1 | 68.9 | 83.5 | 22 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 86% |
| stelo.SoJNanoMelee 1.1 | 32 | 88% |
| tvv.micro.Antares 1.1.1 | 19 | 74% |
| tj.zombie1n 1.0.1 | 13 | 69% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 80% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 28 | 35% | 88 |
| tvv.micro.Antares 1.1.1 | 16 | 20% | 36 |
| stelo.SoJNanoMelee 1.1 | 13 | 16% | 29 |
| tj.zombie1n 1.0.1 | 10 | 13% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 14 |
| sample.VelociRobot 1.0 | 3 | 4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 5 |
| repositorio.NanoStep 1.0 | 2 | 3% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 66.9 | 89 / 210 | 3.98 | 15.9% | 30569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 15.9% | 89 |
| oog.melee.Corsair 1.0 | 2.0 | 13.5% | 34 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.7% | 20 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.4% | 3 |
| EBBU.Sim2 1.02 | 6.5 | 9.5% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.3% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 68.9 | 16 / 35 | 5241 |
| 2 | 1 | 64.2 | 67.6 | 14 / 35 | 5275 |
| 3 | 1 | 62.7 | 62.2 | 13 / 35 | 4949 |
| 4 | 1 | 66.2 | 75.9 | 21 / 35 | 5006 |
| 5 | 1 | 61.1 | 58.7 | 12 / 35 | 5088 |
| 6 | 1 | 63.6 | 67.9 | 13 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 75% |
| simonton.nano.MeleeSeed 1.8 | 36 | 86% |
| ahf.NanoAndrew .4 | 13 | 54% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 363. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 17% | 51 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 47 |
| zyx.nano.BacillusComma 1.0 | 16 | 13% | 20 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 13 |
| EBBU.Sim2 1.02 | 13 | 11% | 19 |
| ahf.NanoAndrew .4 | 12 | 10% | 25 |
| sam.Samspin 1.0 | 9 | 7% | 15 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.9 | 127 / 210 | 2.27 | 19.1% | 32384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.1% | 127 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 36 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.3% | 18 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.2% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.4% | 11 |
| fm.claire 1.7 | 5.7 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.1% | 4 |
| sample.SpinBot 1.0 | 8.7 | 6.1% | 0 |
| pa.Improved 1.0 | 8.8 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 24 / 35 | 5562 |
| 2 | 1 | 68.1 | 82.9 | 18 / 35 | 5724 |
| 3 | 1 | 68.5 | 86.0 | 21 / 35 | 5253 |
| 4 | 1 | 67.2 | 83.2 | 16 / 35 | 4824 |
| 5 | 1 | 70.0 | 88.6 | 25 / 35 | 5776 |
| 6 | 1 | 69.1 | 87.6 | 23 / 35 | 5245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 84% |
| oog.melee.CapuletDroid 1.1 | 29 | 93% |
| gh.nano.Grofvuil 0.2 | 20 | 85% |
| winamp32.micro.MicroMacro 1.0 | 10 | 60% |
| arthord.NanoSatanMelee Beta | 7 | 71% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 40% | 91 |
| gh.nano.Grofvuil 0.2 | 16 | 19% | 42 |
| oog.melee.CapuletDroid 1.1 | 11 | 13% | 34 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 14 |
| winamp32.micro.MicroMacro 1.0 | 7 | 8% | 15 |
| fm.claire 1.7 | 4 | 5% | 5 |
| sample.SpinBot 1.0 | 2 | 2% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 2 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.3 | 102 / 210 | 2.68 | 18.3% | 34953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.3% | 102 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.7% | 31 |
| mz.MicroGodMelee 1 | 3.2 | 14.0% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 14.1% | 28 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.0% | 4 |
| DBall.Anarchy 0.1 | 5.7 | 8.3% | 5 |
| acogdev.alpha 0.2 | 8.0 | 6.0% | 1 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.8 | 24 / 35 | 5833 |
| 2 | 1 | 67.4 | 79.7 | 14 / 35 | 5850 |
| 3 | 1 | 66.7 | 74.0 | 16 / 35 | 5645 |
| 4 | 1 | 68.3 | 81.6 | 19 / 35 | 5789 |
| 5 | 1 | 67.3 | 81.3 | 15 / 35 | 5573 |
| 6 | 1 | 68.5 | 81.6 | 14 / 35 | 6263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 92% |
| mz.MicroGodMelee 1 | 45 | 53% |
| gh.micro.Gruweltje 0.7 | 24 | 63% |
| el.JumpShoot 0.2 | 7 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 37 | 34% | 60 |
| gh.micro.Gruweltje 0.7 | 24 | 22% | 43 |
| spinnercat.micro.Tyger 0.1 | 21 | 19% | 62 |
| caimano.Furia_Ceca 0.22 | 12 | 11% | 15 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 8 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.8 | 115 / 210 | 3.45 | 16.9% | 31019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.9% | 115 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.0% | 28 |
| germ.TheMind .2 | 4.5 | 10.1% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.4% | 8 |
| awesomeness.Elite 1.0 | 6.5 | 8.5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.5% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 10 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 68.6 | 19 / 35 | 5061 |
| 2 | 1 | 63.9 | 71.4 | 19 / 35 | 4515 |
| 3 | 1 | 65.8 | 74.0 | 21 / 35 | 4899 |
| 4 | 1 | 66.3 | 76.5 | 16 / 35 | 5548 |
| 5 | 1 | 64.6 | 69.5 | 17 / 35 | 5200 |
| 6 | 1 | 67.8 | 76.5 | 23 / 35 | 5796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 78% |
| germ.TheMind .2 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 40% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 22% | 36 |
| germ.TheMind .2 | 9 | 9% | 22 |
| awesomeness.Elite 1.0 | 8 | 8% | 17 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 14 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| stelo.UntouchableNano 1.3 | 3 | 3% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.6 | 153 / 210 | 2.02 | 20.3% | 32437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.3% | 153 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.2% | 7 |
| maribo.IotaCT 1.1 | 4.0 | 10.7% | 7 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 6.5 | 8.5% | 6 |
| stelo.PatternRobot 1.0 | 8.2 | 7.4% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 26 / 35 | 5475 |
| 2 | 1 | 70.9 | 91.4 | 26 / 35 | 5292 |
| 3 | 1 | 72.0 | 92.1 | 31 / 35 | 5420 |
| 4 | 1 | 68.3 | 79.7 | 21 / 35 | 5062 |
| 5 | 1 | 71.1 | 88.6 | 25 / 35 | 5739 |
| 6 | 1 | 70.5 | 86.7 | 24 / 35 | 5449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 89% |
| nz.jdc.nano.GridFu 1.0 | 47 | 100% |
| maribo.IotaCT 1.1 | 14 | 64% |
| ratosh.Wesco 1.4 | 10 | 90% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 37% | 75 |
| maribo.IotaCT 1.1 | 8 | 14% | 19 |
| ratosh.Wesco 1.4 | 7 | 12% | 16 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 22 |
| stelo.PatternRobot 1.0 | 6 | 11% | 16 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 51 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.8 | 169 / 210 | 1.65 | 22.2% | 42652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 22.2% | 169 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.7% | 21 |
| baal.nano.N 1.42 | 3.2 | 11.1% | 1 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 8.9% | 7 |
| sanja.First 0.1 | 6.0 | 8.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.6% | 0 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 8 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.7 | 26 / 35 | 7141 |
| 2 | 1 | 70.3 | 87.3 | 24 / 35 | 6519 |
| 3 | 1 | 73.6 | 95.6 | 32 / 35 | 7553 |
| 4 | 1 | 73.2 | 94.0 | 30 / 35 | 7431 |
| 5 | 1 | 72.6 | 93.0 | 28 / 35 | 7075 |
| 6 | 1 | 72.2 | 93.3 | 29 / 35 | 6933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 53 | 92% |
| baal.nano.N 1.42 | 34 | 97% |
| cvt.Firsty 1.0 | 30 | 83% |
| zyx.micro.Ant 1.1 | 20 | 85% |
| sanja.First 0.1 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 24% | 73 |
| zyx.micro.Ant 1.1 | 8 | 20% | 35 |
| cvt.Firsty 1.0 | 7 | 17% | 22 |
| Grystrion.TrackerWO 1.0 | 6 | 15% | 17 |
| baal.nano.N 1.42 | 3 | 7% | 34 |
| sanja.First 0.1 | 3 | 7% | 18 |
| sample.RamFire 1.0 | 3 | 7% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.2 | 78 / 210 | 3.95 | 15.5% | 32349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.5 | 15.5% | 78 |
| kc.micro.Figment 1.0 | 1.7 | 15.0% | 66 |
| cs.Wren 1.0 | 3.0 | 13.1% | 28 |
| js.PinBall 1.6 | 4.5 | 11.2% | 13 |
| mz.Cork 0.1 | 4.5 | 11.2% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 8.9% | 3 |
| evd.X1 0.01 | 7.0 | 7.9% | 0 |
| jsal.Jsalbot 1.0 | 7.8 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 71.1 | 16 / 35 | 5251 |
| 2 | 2 | 63.0 | 65.7 | 9 / 35 | 5596 |
| 3 | 2 | 65.8 | 72.4 | 15 / 35 | 5796 |
| 4 | 2 | 60.8 | 60.3 | 11 / 35 | 5171 |
| 5 | 1 | 64.3 | 72.1 | 14 / 35 | 5457 |
| 6 | 1 | 61.8 | 61.6 | 13 / 35 | 5078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 75% |
| cs.Wren 1.0 | 22 | 82% |
| mz.Cork 0.1 | 8 | 50% |
| js.PinBall 1.6 | 6 | 67% |
| donjezza.Jezza 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 43 | 33% | 93 |
| joe.ADinosaur 1.0 | 20 | 15% | 23 |
| cs.Wren 1.0 | 18 | 14% | 28 |
| evd.X1 0.01 | 15 | 11% | 15 |
| mz.Cork 0.1 | 14 | 11% | 19 |
| js.PinBall 1.6 | 12 | 9% | 16 |
| donjezza.Jezza 1.0 | 5 | 4% | 7 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.7 | 147 / 210 | 2.11 | 19.9% | 30724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.9% | 147 |
| myl.nano.Graviton 1.10 | 2.2 | 12.0% | 18 |
| ntc.Opposite 1.5 | 3.5 | 10.8% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.3% | 15 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.8 | 7.2% | 3 |
| pbg.R2D2 1.0 | 9.3 | 5.3% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 26 / 35 | 5067 |
| 2 | 1 | 68.6 | 84.1 | 21 / 35 | 5222 |
| 3 | 1 | 70.7 | 90.8 | 28 / 35 | 5509 |
| 4 | 1 | 67.1 | 82.2 | 20 / 35 | 4515 |
| 5 | 1 | 71.1 | 93.3 | 27 / 35 | 5249 |
| 6 | 1 | 70.0 | 86.7 | 25 / 35 | 5162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 94% |
| stelo.AreaTargetingBot 1.1 | 36 | 83% |
| disan.Chair 2.2.0 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 88% |
| ntc.Opposite 1.5 | 17 | 94% |
| donjezza.Muncho 1.0 | 11 | 100% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 13 | 21% | 36 |
| ntc.Opposite 1.5 | 10 | 16% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 16% | 25 |
| myl.nano.Graviton 1.10 | 9 | 14% | 47 |
| pfvicm.Sobieski 7.2.3b | 9 | 14% | 18 |
| disan.Chair 2.2.0 | 6 | 10% | 19 |
| pbg.R2D2 1.0 | 3 | 5% | 10 |
| donjezza.Muncho 1.0 | 2 | 3% | 9 |
| DBall.NUKE 0.1 | 1 | 2% | 14 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.2 | 84 / 210 | 3.59 | 15.6% | 26041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.5 | 15.6% | 84 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 47 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.9% | 29 |
| yagami.Tidus 0.11 | 5.2 | 11.7% | 6 |
| ejb.Polaris 1.0.1 | 5.7 | 10.8% | 4 |
| stelo.MirrorNano 1.3 | 7.2 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 63.2 | 9 / 35 | 4143 |
| 2 | 1 | 64.8 | 74.3 | 15 / 35 | 3979 |
| 3 | 1 | 66.2 | 75.9 | 16 / 35 | 4675 |
| 4 | 1 | 66.2 | 76.2 | 17 / 35 | 4654 |
| 5 | 1 | 64.9 | 73.0 | 17 / 35 | 4238 |
| 6 | 2 | 62.5 | 64.8 | 10 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 74% |
| oog.melee.Capulet 1.2 | 26 | 62% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| ejb.Polaris 1.0.1 | 11 | 91% |
| yagami.Tidus 0.11 | 11 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 36% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 46 |
| yagami.Tidus 0.11 | 18 | 14% | 28 |
| stelo.MirrorNano 1.3 | 12 | 10% | 12 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 27 |
| ejb.Polaris 1.0.1 | 9 | 7% | 23 |
| step.nanoPri 1.0 | 7 | 6% | 8 |
| kurios.DOSexe .9a | 4 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.3 | 131 / 210 | 2.87 | 17.7% | 28150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.7% | 131 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 18 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 14 |
| wee.Gem 1.8.4 | 3.5 | 11.9% | 28 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.3% | 4 |
| bayen.UbaMicro 1.4 | 7.0 | 8.2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.3% | 4 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.2% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.0 | 24 / 35 | 4704 |
| 2 | 1 | 64.7 | 72.7 | 20 / 35 | 4474 |
| 3 | 1 | 66.3 | 77.8 | 22 / 35 | 4721 |
| 4 | 1 | 68.0 | 84.4 | 25 / 35 | 4739 |
| 5 | 1 | 65.0 | 73.3 | 19 / 35 | 4513 |
| 6 | 1 | 66.9 | 80.3 | 21 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 100% |
| wee.Gem 1.8.4 | 33 | 97% |
| wompi.Quokka 1.6 | 19 | 95% |
| ratosh.Nobo 0.21 | 16 | 88% |
| m3thos.Eva00 1.1 | 5 | 100% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 20% | 65 |
| ratosh.Nobo 0.21 | 15 | 19% | 35 |
| wee.Gem 1.8.4 | 10 | 13% | 47 |
| maribo.FollowFire 1 | 8 | 10% | 8 |
| wompi.Quokka 1.6 | 7 | 9% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 9 |
| bayen.UbaMicro 1.4 | 7 | 9% | 9 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 11 |
| m3thos.Eva00 1.1 | 3 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 91.0 | 137 / 210 | 1.81 | 22.7% | 51974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 22.7% | 137 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 10 |
| ayk.WallHugger 1.0 | 4.7 | 9.4% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.1% | 5 |
| stuff.Vlad 0.1 | 5.3 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 87.6 | 19 / 35 | 8476 |
| 2 | 1 | 73.5 | 87.9 | 22 / 35 | 8356 |
| 3 | 1 | 75.1 | 93.7 | 27 / 35 | 9288 |
| 4 | 1 | 73.3 | 87.9 | 20 / 35 | 8355 |
| 5 | 1 | 74.4 | 94.0 | 23 / 35 | 8583 |
| 6 | 1 | 74.9 | 94.6 | 26 / 35 | 8916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 78% |
| mz.NanoGod 2.02 | 21 | 71% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 48% | 133 |
| mz.NanoGod 2.02 | 27 | 37% | 45 |
| exauge.GateKeeper 1.1.121g | 5 | 7% | 13 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 9 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 73.8 | 105 / 210 | 3.36 | 16.9% | 29833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 16.9% | 105 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.4% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.4% | 17 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 19 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 11 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 9.2 | 6.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.6 | 14 / 35 | 4531 |
| 2 | 1 | 65.6 | 73.3 | 17 / 35 | 5265 |
| 3 | 1 | 65.7 | 75.6 | 18 / 35 | 4845 |
| 4 | 1 | 67.2 | 77.8 | 22 / 35 | 5359 |
| 5 | 1 | 67.8 | 81.6 | 21 / 35 | 5376 |
| 6 | 1 | 62.7 | 66.7 | 13 / 35 | 4457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 83% |
| dummy.micro.Sparrow 2.5 | 36 | 89% |
| bvh.micro.Freya 0.3 | 14 | 71% |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 83% |
| ap.Frederick 1.1 | 9 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 22 | 21% | 56 |
| voidious.micro.BlitzBat 1.05 | 17 | 16% | 51 |
| conscience.Electron 1.3g | 15 | 14% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 29 |
| bvh.micro.Freya 0.3 | 11 | 10% | 23 |
| dl.BetterWalls 1.0 | 8 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 8 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.6 | 151 / 210 | 2.12 | 21.6% | 43597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.6% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 20 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.0% | 14 |
| sul.Lunar 1.1 | 3.7 | 10.8% | 8 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 9 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 3 |
| sample.Corners 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 88.3 | 29 / 35 | 7466 |
| 2 | 1 | 72.2 | 89.2 | 23 / 35 | 7395 |
| 3 | 1 | 71.5 | 84.8 | 22 / 35 | 7419 |
| 4 | 1 | 70.7 | 82.5 | 25 / 35 | 6770 |
| 5 | 1 | 73.5 | 94.6 | 28 / 35 | 7548 |
| 6 | 1 | 71.3 | 86.0 | 24 / 35 | 6999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 93% |
| supersample.SuperBoxBot 1.0 | 32 | 88% |
| dsw.StaticD 1.0 | 13 | 46% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 33% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 27% | 61 |
| dsw.StaticD 1.0 | 12 | 20% | 21 |
| sul.Lunar 1.1 | 5 | 8% | 45 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
| sample.Corners 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.3 | 112 / 210 | 2.69 | 18.8% | 38953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.8% | 112 |
| mld.Wisdom 1.0 | 2.7 | 12.6% | 29 |
| radnor.DoctorBob 1.42 | 3.0 | 12.6% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.2% | 16 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.3% | 10 |
| amz.NanoClone 1.41 | 5.3 | 10.3% | 7 |
| sample.Walls 1.0 | 7.3 | 7.9% | 3 |
| GarmBox.Oranges 1.0 | 8.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 1 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.0 | 17 / 35 | 6274 |
| 2 | 1 | 68.4 | 81.9 | 17 / 35 | 6493 |
| 3 | 1 | 68.9 | 80.0 | 21 / 35 | 6853 |
| 4 | 1 | 68.3 | 79.0 | 20 / 35 | 6490 |
| 5 | 1 | 69.4 | 86.3 | 22 / 35 | 6223 |
| 6 | 1 | 67.9 | 80.3 | 15 / 35 | 6620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 91% |
| radnor.DoctorBob 1.42 | 32 | 63% |
| mld.Wisdom 1.0 | 23 | 61% |
| amz.NanoClone 1.41 | 15 | 80% |
| sample.Walls 1.0 | 8 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 30% | 47 |
| radnor.DoctorBob 1.42 | 23 | 23% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 12% | 50 |
| amz.NanoClone 1.41 | 12 | 12% | 23 |
| KiraNL.Chupacabra 0.4 | 12 | 12% | 20 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| sample.Walls 1.0 | 3 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

