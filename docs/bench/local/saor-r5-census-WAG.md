# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 91.4 | 157 / 210 | 1.78 | 22.3% | 45206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 22.3% | 157 |
| mz.AntiGrav 1.0 | 2.5 | 14.6% | 18 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 20 |
| mld.Infinity 2.2 | 3.8 | 12.0% | 9 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 3 |
| sample.Walls 1.0 | 6.0 | 7.0% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 6.1% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 87.9 | 23 / 35 | 7445 |
| 2 | 1 | 75.3 | 98.4 | 32 / 35 | 8159 |
| 3 | 1 | 73.7 | 92.4 | 29 / 35 | 7854 |
| 4 | 1 | 73.1 | 91.4 | 24 / 35 | 7641 |
| 5 | 1 | 72.4 | 89.8 | 24 / 35 | 7160 |
| 6 | 1 | 72.4 | 88.3 | 25 / 35 | 6947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 92% |
| radnor.DoctorBob 1.42 | 39 | 85% |
| mld.Infinity 2.2 | 39 | 95% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 4 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 38% | 60 |
| mz.AntiGrav 1.0 | 15 | 28% | 76 |
| amz.NanoClone 1.41 | 7 | 13% | 11 |
| mld.Infinity 2.2 | 6 | 11% | 35 |
| jangs.ns51 1.0 | 2 | 4% | 8 |
| sample.Walls 1.0 | 1 | 2% | 9 |
| GarmBox.Oranges 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.5 | 121 / 210 | 2.30 | 18.8% | 32498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.8% | 121 |
| mld.DustBunny 3.8 | 2.3 | 13.9% | 19 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.8% | 48 |
| maribo.melee.BMV 0.1 | 4.5 | 10.2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 5 |
| zyx.nano.Ant 1.1 | 6.2 | 8.2% | 3 |
| fullsail.SweetTea 1.1 | 7.3 | 7.4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.6% | 8 |
| bzdp.BoxCar 2.0 | 7.8 | 7.4% | 0 |
| cs.Grudge 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 21 / 35 | 5277 |
| 2 | 1 | 64.8 | 67.6 | 12 / 35 | 5349 |
| 3 | 1 | 70.6 | 93.0 | 23 / 35 | 5893 |
| 4 | 1 | 68.0 | 86.0 | 19 / 35 | 5199 |
| 5 | 1 | 70.4 | 92.1 | 24 / 35 | 5849 |
| 6 | 1 | 67.8 | 85.4 | 22 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 55 | 82% |
| oog.melee.Mercutio 1.0 | 49 | 71% |
| djdjdj.NanoSkunk10 1.0 | 20 | 95% |
| fullsail.SweetTea 1.1 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 56% |
| maribo.melee.BMV 0.1 | 7 | 57% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 34% | 68 |
| mld.DustBunny 3.8 | 26 | 29% | 65 |
| maribo.melee.BMV 0.1 | 9 | 10% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 9 |
| cs.Grudge 1.0 | 6 | 7% | 6 |
| zyx.nano.Ant 1.1 | 5 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 19 |
| fullsail.SweetTea 1.1 | 2 | 2% | 15 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 80.4 | 129 / 210 | 2.77 | 19.4% | 36521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.4% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.4% | 17 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.7% | 10 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.2% | 11 |
| fm.mammillarias 1.3 | 6.3 | 8.7% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.7% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.5% | 1 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 67.3 | 18 / 35 | 5328 |
| 2 | 1 | 70.2 | 83.8 | 23 / 35 | 6260 |
| 3 | 1 | 68.3 | 78.4 | 20 / 35 | 6008 |
| 4 | 1 | 69.1 | 79.7 | 19 / 35 | 6203 |
| 5 | 1 | 70.6 | 86.7 | 23 / 35 | 6226 |
| 6 | 1 | 71.2 | 86.3 | 26 / 35 | 6496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 92% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| myl.nano.KomoriNinja 1.1 | 21 | 90% |
| sp.Nanos.Ember 1.1 | 12 | 83% |
| sample.Fire 1.0 | 3 | 100% |
| fm.mammillarias 1.3 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 22% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 21% | 42 |
| myl.nano.KomoriNinja 1.1 | 13 | 16% | 39 |
| cb.nano.Insomnia 1.0 | 10 | 12% | 13 |
| fm.mammillarias 1.3 | 7 | 9% | 8 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 19 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 13 |
| sample.Fire 1.0 | 4 | 5% | 11 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.9 | 150 / 210 | 2.18 | 20.8% | 40633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.8% | 150 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.5% | 16 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.4% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.1% | 11 |
| tj.zombie1n 1.0.1 | 6.3 | 8.6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.1% | 3 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 91.4 | 27 / 35 | 7110 |
| 2 | 1 | 70.5 | 86.7 | 25 / 35 | 6697 |
| 3 | 1 | 71.1 | 88.3 | 26 / 35 | 6679 |
| 4 | 1 | 69.9 | 82.5 | 24 / 35 | 6722 |
| 5 | 1 | 70.5 | 87.0 | 24 / 35 | 6599 |
| 6 | 1 | 70.7 | 85.7 | 24 / 35 | 6826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 89% |
| stelo.SoJNanoMelee 1.1 | 43 | 91% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 94% |
| tj.zombie1n 1.0.1 | 11 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 39% | 89 |
| stelo.SoJNanoMelee 1.1 | 11 | 18% | 33 |
| yk.JahMicro 1.0 | 7 | 11% | 13 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 22 |
| tj.zombie1n 1.0.1 | 3 | 5% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.8 | 97 / 210 | 3.72 | 16.1% | 28737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 16.1% | 97 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 34 |
| ahf.NanoAndrew .4 | 3.0 | 11.5% | 30 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 15 |
| sam.Samspin 1.0 | 5.7 | 9.5% | 17 |
| EBBU.Sim2 1.02 | 6.2 | 9.5% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 59.0 | 11 / 35 | 4492 |
| 2 | 1 | 65.1 | 72.7 | 18 / 35 | 4978 |
| 3 | 1 | 65.4 | 74.0 | 17 / 35 | 5235 |
| 4 | 1 | 65.5 | 75.6 | 19 / 35 | 4693 |
| 5 | 1 | 64.1 | 71.7 | 17 / 35 | 4613 |
| 6 | 1 | 62.7 | 65.7 | 15 / 35 | 4726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 66% |
| simonton.nano.MeleeSeed 1.8 | 29 | 100% |
| ahf.NanoAndrew .4 | 16 | 81% |
| robar.nano.Assertive_Melee 0.2 | 11 | 100% |
| EBBU.Sim2 1.02 | 11 | 91% |
| sam.Samspin 1.0 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 20 | 18% | 43 |
| simonton.nano.MeleeSeed 1.8 | 19 | 17% | 51 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 13% | 16 |
| ahf.NanoAndrew .4 | 14 | 12% | 27 |
| sam.Samspin 1.0 | 13 | 12% | 23 |
| robar.nano.Assertive_Melee 0.2 | 13 | 12% | 21 |
| EBBU.Sim2 1.02 | 11 | 10% | 13 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 11 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.0 | 129 / 210 | 2.35 | 19.2% | 33678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.2% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 7 |
| fm.claire 1.7 | 6.0 | 8.8% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.4% | 3 |
| pa.Improved 1.0 | 9.3 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.8 | 22 / 35 | 5383 |
| 2 | 1 | 68.0 | 84.8 | 21 / 35 | 5207 |
| 3 | 1 | 70.3 | 89.8 | 25 / 35 | 5991 |
| 4 | 1 | 68.8 | 86.3 | 20 / 35 | 5813 |
| 5 | 1 | 69.9 | 86.7 | 21 / 35 | 6196 |
| 6 | 1 | 66.8 | 78.7 | 20 / 35 | 5088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 75% |
| oog.melee.CapuletDroid 1.1 | 37 | 95% |
| sample.SpinBot 1.0 | 13 | 100% |
| gh.nano.Grofvuil 0.2 | 12 | 50% |
| arthord.NanoSatanMelee Beta | 11 | 82% |
| fm.claire 1.7 | 6 | 67% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 33% | 70 |
| gh.nano.Grofvuil 0.2 | 18 | 22% | 31 |
| arthord.NanoSatanMelee Beta | 11 | 14% | 16 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 46 |
| fm.claire 1.7 | 5 | 6% | 12 |
| sample.SpinBot 1.0 | 5 | 6% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 9 |
| pa.Improved 1.0 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 13 |

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.7 | 111 / 210 | 2.38 | 19.0% | 35670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.0% | 111 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 25 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 34 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.4% | 2 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.0% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.6% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.3 | 23 / 35 | 6205 |
| 2 | 1 | 70.3 | 88.3 | 21 / 35 | 6386 |
| 3 | 1 | 69.1 | 86.0 | 20 / 35 | 5598 |
| 4 | 1 | 66.0 | 75.6 | 13 / 35 | 5479 |
| 5 | 1 | 68.5 | 82.5 | 17 / 35 | 5922 |
| 6 | 1 | 69.6 | 89.5 | 17 / 35 | 6080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 49 | 67% |
| spinnercat.micro.Tyger 0.1 | 45 | 84% |
| gh.micro.Gruweltje 0.7 | 25 | 52% |
| DBall.Anarchy 0.1 | 16 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 32% | 56 |
| mz.MicroGodMelee 1 | 29 | 29% | 65 |
| spinnercat.micro.Tyger 0.1 | 15 | 15% | 43 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 13 |
| acogdev.alpha 0.2 | 6 | 6% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 11 |
| DBall.Anarchy 0.1 | 2 | 2% | 8 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| fire219.CatBot 1.0 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.1 | 113 / 210 | 3.15 | 17.3% | 30893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.3% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.2% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 30 |
| germ.TheMind .2 | 4.8 | 9.6% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 5 |
| awesomeness.Elite 1.0 | 6.2 | 9.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.3% | 1 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 72.7 | 19 / 35 | 4643 |
| 2 | 1 | 65.5 | 75.6 | 17 / 35 | 4864 |
| 3 | 1 | 66.8 | 76.2 | 19 / 35 | 5305 |
| 4 | 1 | 69.4 | 88.9 | 23 / 35 | 5569 |
| 5 | 1 | 67.0 | 77.1 | 21 / 35 | 5386 |
| 6 | 1 | 63.1 | 66.0 | 14 / 35 | 5126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 80% |
| stelo.UntouchableNano 1.3 | 11 | 91% |
| germ.TheMind .2 | 8 | 88% |
| awesomeness.Elite 1.0 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 36 | 37% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 21% | 40 |
| awesomeness.Elite 1.0 | 11 | 11% | 17 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 15 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 10 |
| germ.TheMind .2 | 6 | 6% | 14 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 2 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.2 | 158 / 210 | 1.98 | 20.2% | 30942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.2% | 158 |
| rz.HawkOnFire 0.1 | 2.2 | 13.2% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.7% | 8 |
| maribo.IotaCT 1.1 | 4.8 | 10.4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 2 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.5% | 8 |
| stelo.PatternRobot 1.0 | 7.5 | 8.2% | 5 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 24 / 35 | 5481 |
| 2 | 1 | 70.5 | 86.7 | 28 / 35 | 5177 |
| 3 | 1 | 71.1 | 90.8 | 29 / 35 | 5058 |
| 4 | 1 | 70.3 | 87.9 | 26 / 35 | 5423 |
| 5 | 1 | 70.4 | 89.8 | 24 / 35 | 4747 |
| 6 | 1 | 70.4 | 87.3 | 27 / 35 | 5056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 94% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 22 | 91% |
| timmit.nano.TimDog 0.33 | 14 | 64% |
| maribo.IotaCT 1.1 | 11 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 27% | 69 |
| timmit.nano.TimDog 0.33 | 10 | 19% | 18 |
| nz.jdc.nano.GridFu 1.0 | 8 | 15% | 49 |
| maribo.IotaCT 1.1 | 7 | 13% | 22 |
| stelo.PatternRobot 1.0 | 5 | 10% | 21 |
| ratosh.Wesco 1.4 | 5 | 10% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 9 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.6 | 170 / 210 | 1.66 | 21.9% | 40468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.9% | 170 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.3% | 8 |
| zyx.micro.Ant 1.1 | 5.2 | 9.1% | 10 |
| Grystrion.TrackerWO 1.0 | 5.3 | 9.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.4% | 2 |
| sanja.First 0.1 | 6.7 | 7.8% | 2 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.3% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 30 / 35 | 6739 |
| 2 | 1 | 72.1 | 91.4 | 27 / 35 | 6882 |
| 3 | 1 | 73.1 | 97.1 | 31 / 35 | 7025 |
| 4 | 1 | 72.2 | 94.0 | 31 / 35 | 6637 |
| 5 | 1 | 71.9 | 91.1 | 30 / 35 | 6685 |
| 6 | 1 | 70.4 | 88.6 | 21 / 35 | 6500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 95% |
| baal.nano.N 1.42 | 35 | 89% |
| cvt.Firsty 1.0 | 26 | 92% |
| sanja.First 0.1 | 25 | 96% |
| zyx.micro.Ant 1.1 | 18 | 83% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 31% | 35 |
| baal.nano.N 1.42 | 9 | 21% | 40 |
| cvt.Firsty 1.0 | 6 | 14% | 24 |
| tvv.nano.Polaris 1.2 | 4 | 10% | 47 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 10 |
| sanja.First 0.1 | 2 | 5% | 23 |
| Grystrion.TrackerWO 1.0 | 2 | 5% | 12 |
| sample.RamFire 1.0 | 2 | 5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 11 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.8 | 104 / 210 | 3.00 | 17.3% | 32397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.3% | 104 |
| kc.micro.Figment 1.0 | 2.0 | 14.5% | 54 |
| cs.Wren 1.0 | 3.3 | 12.1% | 19 |
| js.PinBall 1.6 | 4.3 | 11.4% | 14 |
| mz.Cork 0.1 | 4.7 | 11.0% | 8 |
| joe.ADinosaur 1.0 | 5.7 | 9.2% | 2 |
| evd.X1 0.01 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.9% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 5.5% | 8 |
| PSW.Relentless 0.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.5 | 22 / 35 | 5408 |
| 2 | 1 | 67.3 | 80.0 | 21 / 35 | 5560 |
| 3 | 1 | 64.2 | 72.7 | 16 / 35 | 5204 |
| 4 | 1 | 67.3 | 84.4 | 15 / 35 | 5595 |
| 5 | 1 | 64.1 | 71.1 | 12 / 35 | 5290 |
| 6 | 1 | 65.7 | 76.2 | 18 / 35 | 5340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 72% |
| cs.Wren 1.0 | 24 | 88% |
| js.PinBall 1.6 | 13 | 69% |
| mz.Cork 0.1 | 13 | 92% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 50% | 110 |
| cs.Wren 1.0 | 17 | 16% | 33 |
| js.PinBall 1.6 | 8 | 8% | 21 |
| evd.X1 0.01 | 7 | 7% | 7 |
| PSW.Relentless 0.1 | 7 | 7% | 7 |
| joe.ADinosaur 1.0 | 6 | 6% | 7 |
| mz.Cork 0.1 | 3 | 3% | 17 |
| donjezza.Jezza 1.0 | 3 | 3% | 2 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.7 | 143 / 210 | 2.29 | 19.4% | 29622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.4% | 143 |
| myl.nano.Graviton 1.10 | 2.5 | 11.8% | 17 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 10.8% | 20 |
| ntc.Opposite 1.5 | 4.2 | 10.5% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 9.9% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.9% | 2 |
| disan.Chair 2.2.0 | 6.3 | 9.2% | 9 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 4 |
| donjezza.Muncho 1.0 | 9.5 | 5.3% | 2 |
| pbg.R2D2 1.0 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 24 / 35 | 5264 |
| 2 | 1 | 68.8 | 86.3 | 22 / 35 | 4891 |
| 3 | 1 | 69.5 | 88.6 | 25 / 35 | 5037 |
| 4 | 1 | 68.0 | 82.9 | 22 / 35 | 4865 |
| 5 | 1 | 68.6 | 82.5 | 25 / 35 | 4887 |
| 6 | 1 | 68.9 | 86.0 | 25 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 44 | 89% |
| myl.nano.Graviton 1.10 | 42 | 93% |
| donjezza.Muncho 1.0 | 16 | 100% |
| disan.Chair 2.2.0 | 15 | 73% |
| ntc.Opposite 1.5 | 15 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 25% | 51 |
| stelo.AreaTargetingBot 1.1 | 14 | 21% | 53 |
| pfvicm.Sobieski 7.2.3b | 8 | 12% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 12% | 21 |
| ntc.Opposite 1.5 | 8 | 12% | 17 |
| disan.Chair 2.2.0 | 7 | 10% | 18 |
| pbg.R2D2 1.0 | 3 | 4% | 7 |
| DBall.NUKE 0.1 | 2 | 3% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.5 | 91 / 210 | 3.39 | 16.0% | 25803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 16.0% | 91 |
| oog.melee.Capulet 1.2 | 2.2 | 14.3% | 50 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 38 |
| yagami.Tidus 0.11 | 4.5 | 12.0% | 8 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.4% | 17 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.1% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.7% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 68.3 | 9 / 35 | 4012 |
| 2 | 1 | 65.6 | 73.3 | 16 / 35 | 4618 |
| 3 | 1 | 67.0 | 79.4 | 20 / 35 | 4623 |
| 4 | 1 | 65.0 | 74.3 | 15 / 35 | 4066 |
| 5 | 1 | 65.6 | 76.5 | 18 / 35 | 4169 |
| 6 | 1 | 64.1 | 69.2 | 13 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 71% |
| kawigi.micro.Shiz 1.1 | 29 | 90% |
| yagami.Tidus 0.11 | 25 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 89% |
| ejb.Polaris 1.0.1 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 43% | 76 |
| yagami.Tidus 0.11 | 20 | 17% | 43 |
| kawigi.micro.Shiz 1.1 | 18 | 15% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% | 27 |
| ejb.Polaris 1.0.1 | 8 | 7% | 13 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.9 | 138 / 210 | 2.72 | 17.8% | 27448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.8% | 138 |
| ratosh.Nobo 0.21 | 3.0 | 11.6% | 12 |
| wee.Gem 1.8.4 | 3.3 | 11.5% | 23 |
| bzdp.Pansy 2.1 | 3.5 | 11.4% | 13 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 9 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 2 |
| maribo.FollowFire 1 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 68.9 | 17 / 35 | 4090 |
| 2 | 1 | 65.9 | 80.6 | 22 / 35 | 4289 |
| 3 | 1 | 66.8 | 80.6 | 24 / 35 | 4596 |
| 4 | 1 | 68.1 | 82.5 | 25 / 35 | 5150 |
| 5 | 1 | 68.7 | 87.0 | 27 / 35 | 5007 |
| 6 | 1 | 67.1 | 85.7 | 23 / 35 | 4316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 93% |
| wee.Gem 1.8.4 | 41 | 95% |
| wompi.Quokka 1.6 | 18 | 100% |
| ratosh.Nobo 0.21 | 17 | 71% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 14 | 19% | 15 |
| bzdp.Pansy 2.1 | 11 | 15% | 54 |
| stelo.MyAgileRobot 0.2 | 11 | 15% | 13 |
| ratosh.Nobo 0.21 | 10 | 14% | 28 |
| wompi.Quokka 1.6 | 8 | 11% | 18 |
| m3thos.Eva00 1.1 | 8 | 11% | 16 |
| wee.Gem 1.8.4 | 6 | 8% | 53 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 5 |
| bayen.UbaMicro 1.4 | 2 | 3% | 7 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 89.7 | 138 / 210 | 1.92 | 21.7% | 47111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.7% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 56 |
| mz.NanoGod 2.02 | 3.0 | 13.5% | 9 |
| ayk.WallHugger 1.0 | 4.5 | 9.6% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 4 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 85.7 | 24 / 35 | 7587 |
| 2 | 1 | 73.5 | 93.3 | 24 / 35 | 7841 |
| 3 | 1 | 73.4 | 87.9 | 23 / 35 | 7924 |
| 4 | 1 | 72.1 | 88.6 | 21 / 35 | 7412 |
| 5 | 1 | 72.1 | 87.9 | 20 / 35 | 7717 |
| 6 | 1 | 74.4 | 94.9 | 26 / 35 | 8630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 120 | 82% |
| exauge.GateKeeper 1.1.121g | 14 | 93% |
| mz.NanoGod 2.02 | 11 | 73% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| ayk.WallHugger 1.0 | 7 | 86% |
| sample.SittingDuck 1.0 | 4 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 46% | 145 |
| mz.NanoGod 2.02 | 21 | 29% | 32 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 14 |
| stelo.PianistNano 1.2 | 4 | 6% | 4 |
| ayk.WallHugger 1.0 | 3 | 4% | 9 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.7 | 111 / 210 | 3.37 | 16.8% | 29052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.8% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 25 |
| bvh.micro.Freya 0.3 | 3.5 | 11.7% | 18 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 15 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 4 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 0 |
| ap.Frederick 1.1 | 8.0 | 6.7% | 9 |
| dl.BetterWalls 1.0 | 9.3 | 6.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 72.1 | 17 / 35 | 4855 |
| 2 | 1 | 68.5 | 85.1 | 21 / 35 | 5353 |
| 3 | 1 | 61.7 | 62.5 | 15 / 35 | 4544 |
| 4 | 1 | 62.6 | 66.3 | 18 / 35 | 4625 |
| 5 | 1 | 67.1 | 79.4 | 23 / 35 | 4824 |
| 6 | 1 | 65.7 | 76.5 | 17 / 35 | 4851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| dummy.micro.Sparrow 2.5 | 25 | 88% |
| bvh.micro.Freya 0.3 | 21 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 89% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 22% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 15 |
| dl.BetterWalls 1.0 | 14 | 14% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 32 |
| bvh.micro.Freya 0.3 | 13 | 13% | 30 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 29 |
| conscience.Electron 1.3g | 9 | 9% | 14 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 15 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.6 | 144 / 210 | 2.39 | 20.8% | 41445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.8% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.5% | 22 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.6% | 14 |
| sul.Lunar 1.1 | 4.0 | 11.4% | 8 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.9% | 12 |
| dsw.StaticD 1.0 | 6.2 | 8.6% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 6.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.8% | 0 |
| sample.Corners 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 81.9 | 24 / 35 | 6713 |
| 2 | 1 | 71.9 | 91.7 | 24 / 35 | 7048 |
| 3 | 1 | 68.6 | 74.9 | 19 / 35 | 6789 |
| 4 | 1 | 70.9 | 83.8 | 25 / 35 | 6858 |
| 5 | 1 | 71.7 | 88.3 | 25 / 35 | 6998 |
| 6 | 1 | 71.7 | 86.7 | 27 / 35 | 7039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 43 | 98% |
| supersample.SuperBoxBot 1.0 | 36 | 83% |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 94% |
| dsw.StaticD 1.0 | 14 | 79% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 37% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 22% | 47 |
| mme.NikeEnhanced 2.0 | 10 | 15% | 17 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 5 |
| sul.Lunar 1.1 | 4 | 6% | 48 |
| dsw.StaticD 1.0 | 4 | 6% | 17 |
| sample.Corners 1.0 | 2 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 13 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 10 |

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.1 | 106 / 210 | 2.97 | 17.9% | 36327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.9% | 106 |
| radnor.DoctorBob 1.42 | 2.8 | 13.0% | 34 |
| mld.Wisdom 1.0 | 3.0 | 12.1% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.2% | 25 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 7 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 11 |
| sample.Walls 1.0 | 7.3 | 7.6% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.1 | 19 / 35 | 6098 |
| 2 | 1 | 66.4 | 76.2 | 18 / 35 | 5681 |
| 3 | 1 | 66.9 | 77.5 | 18 / 35 | 5769 |
| 4 | 1 | 66.9 | 76.8 | 19 / 35 | 5901 |
| 5 | 1 | 66.2 | 72.7 | 15 / 35 | 6556 |
| 6 | 1 | 67.9 | 81.3 | 17 / 35 | 6322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 88% |
| radnor.DoctorBob 1.42 | 29 | 69% |
| mld.Wisdom 1.0 | 17 | 47% |
| sample.Walls 1.0 | 12 | 100% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 5 | 40% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 25% | 36 |
| radnor.DoctorBob 1.42 | 25 | 24% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 17% | 54 |
| KiraNL.Chupacabra 0.4 | 18 | 17% | 28 |
| amz.NanoClone 1.41 | 9 | 9% | 14 |
| jangs.ns51 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 2 | 2% | 13 |

