# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.4 | 145 / 210 | 2.13 | 21.3% | 43804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.3% | 145 |
| mz.AntiGrav 1.0 | 2.3 | 14.4% | 15 |
| radnor.DoctorBob 1.42 | 2.7 | 14.6% | 31 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 5 |
| GarmBox.Oranges 1.0 | 6.5 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.2% | 1 |
| sample.Walls 1.0 | 7.5 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 95.2 | 27 / 35 | 7404 |
| 2 | 1 | 72.1 | 88.3 | 24 / 35 | 7160 |
| 3 | 1 | 68.1 | 70.8 | 17 / 35 | 6446 |
| 4 | 1 | 72.9 | 90.5 | 24 / 35 | 7420 |
| 5 | 1 | 74.4 | 94.0 | 28 / 35 | 8045 |
| 6 | 1 | 72.4 | 85.7 | 25 / 35 | 7329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 75 | 95% |
| radnor.DoctorBob 1.42 | 40 | 75% |
| mld.Infinity 2.2 | 24 | 96% |
| amz.NanoClone 1.41 | 12 | 75% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 44% | 65 |
| mz.AntiGrav 1.0 | 13 | 20% | 68 |
| amz.NanoClone 1.41 | 12 | 18% | 22 |
| mld.Infinity 2.2 | 6 | 9% | 35 |
| GarmBox.Oranges 1.0 | 3 | 5% | 3 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.6 | 113 / 210 | 2.56 | 18.2% | 32411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.3 | 18.2% | 113 |
| mld.DustBunny 3.8 | 2.3 | 14.5% | 30 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.9% | 50 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 1 |
| zyx.nano.Ant 1.1 | 5.5 | 9.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.5% | 10 |
| fullsail.SweetTea 1.1 | 7.5 | 7.1% | 1 |
| bzdp.BoxCar 2.0 | 8.7 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 24 / 35 | 5270 |
| 2 | 1 | 67.9 | 86.7 | 22 / 35 | 4847 |
| 3 | 1 | 67.7 | 84.1 | 18 / 35 | 5240 |
| 4 | 1 | 69.8 | 90.2 | 22 / 35 | 5546 |
| 5 | 1 | 69.7 | 87.3 | 17 / 35 | 6238 |
| 6 | 3 | 62.1 | 57.8 | 10 / 35 | 5270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 57 | 91% |
| oog.melee.Mercutio 1.0 | 56 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 41% | 82 |
| mld.DustBunny 3.8 | 20 | 21% | 70 |
| zyx.nano.Ant 1.1 | 12 | 12% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 12 |
| maribo.melee.BMV 0.1 | 5 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 10 |
| fullsail.SweetTea 1.1 | 3 | 3% | 10 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| cs.Grudge 1.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 82.3 | 136 / 210 | 2.59 | 20.0% | 37766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.0% | 136 |
| myl.micro.Troodon 1.10 | 2.2 | 14.1% | 35 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.0% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 12 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 9 |
| fm.mammillarias 1.3 | 5.5 | 9.9% | 6 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.9% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.2% | 3 |
| sample.Fire 1.0 | 9.5 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 74.0 | 19 / 35 | 6041 |
| 2 | 1 | 70.3 | 87.0 | 26 / 35 | 5637 |
| 3 | 1 | 71.9 | 84.4 | 24 / 35 | 7166 |
| 4 | 1 | 71.3 | 90.2 | 23 / 35 | 6229 |
| 5 | 1 | 67.9 | 73.0 | 19 / 35 | 6279 |
| 6 | 1 | 70.4 | 85.4 | 25 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 88% |
| cb.nano.Insomnia 1.0 | 25 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 96% |
| myl.nano.KomoriNinja 1.1 | 18 | 89% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 23% | 68 |
| fm.mammillarias 1.3 | 17 | 23% | 24 |
| myl.nano.KomoriNinja 1.1 | 11 | 15% | 39 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 8% | 23 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 11 |
| sample.Fire 1.0 | 4 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 14 |
| sample.Tracker 1.0 | 2 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.0 | 147 / 210 | 1.99 | 21.2% | 41509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.2% | 147 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.9% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 5.8 | 8.6% | 7 |
| tj.zombie1n 1.0.1 | 6.2 | 8.2% | 8 |
| yk.JahMicro 1.0 | 7.2 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 88.3 | 24 / 35 | 6838 |
| 2 | 1 | 72.1 | 92.1 | 27 / 35 | 6824 |
| 3 | 1 | 71.0 | 87.6 | 24 / 35 | 7183 |
| 4 | 1 | 71.1 | 89.2 | 24 / 35 | 6868 |
| 5 | 1 | 70.9 | 87.3 | 25 / 35 | 6963 |
| 6 | 1 | 71.5 | 89.8 | 23 / 35 | 6833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 84% |
| stelo.SoJNanoMelee 1.1 | 36 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 26 | 85% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| tj.zombie1n 1.0.1 | 13 | 77% |
| yk.JahMicro 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 38% | 83 |
| stelo.SoJNanoMelee 1.1 | 9 | 14% | 33 |
| tvv.micro.Antares 1.1.1 | 9 | 14% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 13% | 32 |
| tj.zombie1n 1.0.1 | 5 | 8% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 6 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.4 | 85 / 210 | 3.93 | 15.7% | 29703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 15.7% | 85 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 39 |
| ahf.NanoAndrew .4 | 3.7 | 11.8% | 39 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 20 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 6 |
| sam.Samspin 1.0 | 5.5 | 9.7% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 58.7 | 15 / 35 | 4538 |
| 2 | 1 | 65.7 | 74.3 | 15 / 35 | 5334 |
| 3 | 1 | 61.7 | 62.9 | 10 / 35 | 4758 |
| 4 | 1 | 63.4 | 66.3 | 16 / 35 | 5006 |
| 5 | 1 | 62.8 | 65.7 | 13 / 35 | 4860 |
| 6 | 1 | 65.6 | 76.5 | 16 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 56% |
| simonton.nano.MeleeSeed 1.8 | 33 | 88% |
| ahf.NanoAndrew .4 | 24 | 71% |
| robar.nano.Assertive_Melee 0.2 | 9 | 78% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 20% | 52 |
| simonton.nano.MeleeSeed 1.8 | 23 | 18% | 41 |
| zyx.nano.BacillusComma 1.0 | 17 | 13% | 19 |
| ahf.NanoAndrew .4 | 14 | 11% | 33 |
| EBBU.Sim2 1.02 | 12 | 9% | 18 |
| robar.nano.Assertive_Melee 0.2 | 12 | 9% | 18 |
| sam.Samspin 1.0 | 11 | 9% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 11 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.1 | 122 / 210 | 2.43 | 18.7% | 31780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.7% | 122 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 32 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.9% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.5% | 11 |
| fm.claire 1.7 | 6.5 | 8.1% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.6% | 5 |
| sample.SpinBot 1.0 | 7.7 | 7.0% | 3 |
| pa.Improved 1.0 | 9.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 19 / 35 | 5162 |
| 2 | 1 | 69.2 | 87.3 | 24 / 35 | 5299 |
| 3 | 1 | 66.1 | 76.5 | 18 / 35 | 5044 |
| 4 | 1 | 69.4 | 89.8 | 21 / 35 | 5522 |
| 5 | 1 | 68.0 | 81.0 | 19 / 35 | 5669 |
| 6 | 1 | 68.2 | 86.0 | 21 / 35 | 5084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 78% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| gh.nano.Grofvuil 0.2 | 13 | 69% |
| winamp32.micro.MicroMacro 1.0 | 11 | 82% |
| sample.SpinBot 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 42% | 95 |
| gh.nano.Grofvuil 0.2 | 13 | 15% | 30 |
| oog.melee.CapuletDroid 1.1 | 11 | 12% | 35 |
| winamp32.micro.MicroMacro 1.0 | 7 | 8% | 16 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 11 |
| sample.SpinBot 1.0 | 5 | 6% | 7 |
| fm.claire 1.7 | 4 | 4% | 8 |
| pa.Improved 1.0 | 3 | 3% | 2 |
| kurios.DOSexe .9b | 2 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.0 | 110 / 210 | 2.62 | 18.6% | 35349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.6% | 110 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 39 |
| mz.MicroGodMelee 1 | 3.2 | 12.9% | 27 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.9% | 30 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 1 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.6% | 1 |
| acogdev.alpha 0.2 | 7.2 | 6.5% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.5% | 1 |
| fire219.CatBot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.6 | 16 / 35 | 5349 |
| 2 | 1 | 70.2 | 87.9 | 23 / 35 | 5983 |
| 3 | 1 | 68.0 | 80.6 | 18 / 35 | 5725 |
| 4 | 1 | 69.4 | 84.4 | 21 / 35 | 6173 |
| 5 | 1 | 67.7 | 77.1 | 18 / 35 | 5994 |
| 6 | 1 | 67.9 | 80.3 | 14 / 35 | 6125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 71 | 77% |
| mz.MicroGodMelee 1 | 31 | 77% |
| gh.micro.Gruweltje 0.7 | 29 | 62% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| DBall.Anarchy 0.1 | 3 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 28 | 28% | 49 |
| spinnercat.micro.Tyger 0.1 | 27 | 27% | 72 |
| mz.MicroGodMelee 1 | 23 | 23% | 50 |
| acogdev.alpha 0.2 | 8 | 8% | 13 |
| DBall.Anarchy 0.1 | 4 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 71.0 | 115 / 210 | 3.61 | 16.8% | 30996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.5 | 16.8% | 115 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.5% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 31 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.1% | 5 |
| germ.TheMind .2 | 5.3 | 9.4% | 8 |
| awesomeness.Elite 1.0 | 6.0 | 8.7% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 9.0% | 0 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 11 |
| sample.Crazy 1.0 | 9.0 | 6.6% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 75.6 | 22 / 35 | 5237 |
| 2 | 1 | 66.8 | 75.6 | 22 / 35 | 5241 |
| 3 | 3 | 62.2 | 62.9 | 17 / 35 | 4628 |
| 4 | 2 | 63.8 | 65.1 | 17 / 35 | 4898 |
| 5 | 1 | 66.6 | 74.6 | 19 / 35 | 5692 |
| 6 | 1 | 65.7 | 72.4 | 18 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 92% |
| germ.TheMind .2 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 356. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 48% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 18% | 35 |
| awesomeness.Elite 1.0 | 9 | 9% | 18 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 15 |
| germ.TheMind .2 | 8 | 8% | 22 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 84.9 | 137 / 210 | 2.36 | 19.7% | 32565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.7% | 137 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 16 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 13 |
| maribo.IotaCT 1.1 | 5.0 | 10.2% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 5 |
| stelo.PatternRobot 1.0 | 7.5 | 7.8% | 6 |
| ratosh.Wesco 1.4 | 7.7 | 8.0% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 78.4 | 21 / 35 | 4960 |
| 2 | 1 | 71.2 | 87.0 | 26 / 35 | 5811 |
| 3 | 1 | 69.0 | 81.3 | 22 / 35 | 5338 |
| 4 | 1 | 69.0 | 82.9 | 21 / 35 | 5241 |
| 5 | 1 | 70.5 | 90.2 | 24 / 35 | 5348 |
| 6 | 1 | 71.3 | 89.5 | 23 / 35 | 5867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 90% |
| nz.jdc.nano.GridFu 1.0 | 28 | 100% |
| timmit.nano.TimDog 0.33 | 19 | 68% |
| stelo.PatternRobot 1.0 | 17 | 76% |
| maribo.IotaCT 1.1 | 12 | 83% |
| ratosh.Wesco 1.4 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 29% | 68 |
| nz.jdc.nano.GridFu 1.0 | 13 | 18% | 55 |
| timmit.nano.TimDog 0.33 | 13 | 18% | 31 |
| stelo.PatternRobot 1.0 | 8 | 11% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 8% | 9 |
| maribo.IotaCT 1.1 | 5 | 7% | 17 |
| ratosh.Wesco 1.4 | 4 | 5% | 7 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.1 | 164 / 210 | 1.80 | 21.7% | 41616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.7% | 164 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.5% | 4 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 5.2 | 9.4% | 9 |
| sanja.First 0.1 | 6.7 | 8.3% | 4 |
| cvt.Firsty 1.0 | 7.2 | 7.7% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.1% | 1 |
| sample.RamFire 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 28 / 35 | 6791 |
| 2 | 1 | 72.9 | 93.3 | 30 / 35 | 7268 |
| 3 | 1 | 70.0 | 82.5 | 24 / 35 | 6555 |
| 4 | 1 | 72.9 | 94.0 | 28 / 35 | 7455 |
| 5 | 1 | 69.8 | 86.3 | 24 / 35 | 6227 |
| 6 | 1 | 73.3 | 97.1 | 30 / 35 | 7320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 88% |
| baal.nano.N 1.42 | 33 | 91% |
| cvt.Firsty 1.0 | 29 | 90% |
| sanja.First 0.1 | 20 | 95% |
| zyx.micro.Ant 1.1 | 17 | 88% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 23% | 59 |
| zyx.micro.Ant 1.1 | 9 | 19% | 36 |
| baal.nano.N 1.42 | 7 | 15% | 36 |
| cvt.Firsty 1.0 | 7 | 15% | 30 |
| amk.Punbot.Punbot 0.01 | 4 | 9% | 6 |
| sanja.First 0.1 | 3 | 6% | 20 |
| Grystrion.TrackerWO 1.0 | 3 | 6% | 19 |
| sample.RamFire 1.0 | 3 | 6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 65.3 | 77 / 210 | 4.12 | 15.0% | 30994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.8 | 15.0% | 77 |
| kc.micro.Figment 1.0 | 2.2 | 14.5% | 59 |
| cs.Wren 1.0 | 2.8 | 12.8% | 30 |
| js.PinBall 1.6 | 3.7 | 11.7% | 19 |
| mz.Cork 0.1 | 4.5 | 11.5% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 9.6% | 2 |
| evd.X1 0.01 | 6.8 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.2 | 17 / 35 | 5747 |
| 2 | 3 | 59.2 | 56.5 | 11 / 35 | 4368 |
| 3 | 2 | 61.3 | 60.6 | 10 / 35 | 5327 |
| 4 | 1 | 64.8 | 72.1 | 15 / 35 | 5444 |
| 5 | 1 | 65.8 | 74.6 | 15 / 35 | 5770 |
| 6 | 3 | 56.5 | 52.7 | 9 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 71% |
| cs.Wren 1.0 | 27 | 78% |
| mz.Cork 0.1 | 11 | 91% |
| js.PinBall 1.6 | 8 | 75% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 38% | 86 |
| cs.Wren 1.0 | 22 | 17% | 35 |
| joe.ADinosaur 1.0 | 18 | 14% | 20 |
| evd.X1 0.01 | 17 | 13% | 18 |
| js.PinBall 1.6 | 9 | 7% | 17 |
| mz.Cork 0.1 | 7 | 5% | 17 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.0 | 130 / 210 | 2.53 | 18.9% | 30126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.9% | 130 |
| myl.nano.Graviton 1.10 | 2.7 | 11.8% | 23 |
| ntc.Opposite 1.5 | 3.3 | 11.3% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.9% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 8 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 7 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 3 |
| donjezza.Muncho 1.0 | 9.0 | 5.9% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.9 | 17 / 35 | 4940 |
| 2 | 1 | 67.6 | 81.6 | 22 / 35 | 5080 |
| 3 | 1 | 70.1 | 90.2 | 27 / 35 | 4947 |
| 4 | 1 | 67.3 | 78.7 | 21 / 35 | 5024 |
| 5 | 1 | 70.4 | 92.1 | 26 / 35 | 5149 |
| 6 | 1 | 66.0 | 73.7 | 17 / 35 | 4986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 90% |
| stelo.AreaTargetingBot 1.1 | 23 | 87% |
| disan.Chair 2.2.0 | 22 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 91% |
| DBall.NUKE 0.1 | 11 | 100% |
| ntc.Opposite 1.5 | 11 | 82% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 20 | 25% | 52 |
| pfvicm.Sobieski 7.2.3b | 14 | 18% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 29 |
| ntc.Opposite 1.5 | 12 | 15% | 19 |
| stelo.AreaTargetingBot 1.1 | 10 | 13% | 30 |
| disan.Chair 2.2.0 | 8 | 10% | 29 |
| DBall.NUKE 0.1 | 3 | 4% | 13 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |
| donjezza.Muncho 1.0 | 0 | 0% | 6 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.3 | 99 / 210 | 2.87 | 17.1% | 27484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 17.1% | 99 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 45 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.3% | 28 |
| yagami.Tidus 0.11 | 4.0 | 12.5% | 8 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 20 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 10 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 0 |
| step.nanoPri 1.0 | 7.5 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 16 / 35 | 4874 |
| 2 | 1 | 67.1 | 78.4 | 17 / 35 | 4724 |
| 3 | 2 | 63.4 | 70.5 | 9 / 35 | 4437 |
| 4 | 1 | 67.1 | 78.1 | 19 / 35 | 4478 |
| 5 | 1 | 66.7 | 80.3 | 20 / 35 | 4408 |
| 6 | 1 | 68.3 | 84.4 | 18 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 47% |
| yagami.Tidus 0.11 | 29 | 90% |
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 83% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 45% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 18% | 45 |
| ejb.Polaris 1.0.1 | 14 | 13% | 24 |
| yagami.Tidus 0.11 | 11 | 10% | 33 |
| kawigi.micro.Shiz 1.1 | 8 | 7% | 25 |
| stelo.MirrorNano 1.3 | 4 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 3% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.9 | 132 / 210 | 2.63 | 18.0% | 28940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.0% | 132 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 18 |
| ratosh.Nobo 0.21 | 2.8 | 11.6% | 17 |
| wee.Gem 1.8.4 | 4.0 | 11.6% | 23 |
| wompi.Quokka 1.6 | 5.0 | 10.4% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 6 |
| bayen.UbaMicro 1.4 | 6.8 | 9.1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 3 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.1 | 23 / 35 | 5344 |
| 2 | 1 | 67.1 | 81.0 | 23 / 35 | 4799 |
| 3 | 1 | 64.5 | 74.0 | 17 / 35 | 4784 |
| 4 | 1 | 66.9 | 81.3 | 21 / 35 | 4660 |
| 5 | 1 | 66.3 | 81.9 | 23 / 35 | 4278 |
| 6 | 1 | 69.1 | 87.9 | 25 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 92% |
| wee.Gem 1.8.4 | 37 | 95% |
| wompi.Quokka 1.6 | 21 | 95% |
| ratosh.Nobo 0.21 | 15 | 73% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| m3thos.Eva00 1.1 | 6 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 18% | 60 |
| maribo.FollowFire 1 | 12 | 15% | 11 |
| wee.Gem 1.8.4 | 11 | 14% | 50 |
| ratosh.Nobo 0.21 | 11 | 14% | 23 |
| m3thos.Eva00 1.1 | 8 | 10% | 16 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 10 |
| bayen.UbaMicro 1.4 | 6 | 8% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 10 |
| wompi.Quokka 1.6 | 3 | 4% | 14 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 86.7 | 124 / 210 | 2.20 | 21.8% | 50475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.8% | 124 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 21 |
| ayk.WallHugger 1.0 | 4.7 | 9.3% | 0 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 93.7 | 25 / 35 | 9054 |
| 2 | 1 | 73.1 | 87.9 | 18 / 35 | 8151 |
| 3 | 1 | 71.1 | 79.7 | 17 / 35 | 7634 |
| 4 | 1 | 72.8 | 84.1 | 21 / 35 | 8529 |
| 5 | 1 | 75.1 | 91.7 | 24 / 35 | 9164 |
| 6 | 1 | 72.2 | 83.2 | 19 / 35 | 7943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 127 | 78% |
| mz.NanoGod 2.02 | 15 | 60% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 49% | 144 |
| mz.NanoGod 2.02 | 27 | 31% | 40 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 9 |
| ayk.WallHugger 1.0 | 5 | 6% | 11 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.4 | 95 / 210 | 3.76 | 15.9% | 27856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 15.9% | 95 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 30 |
| bvh.micro.Freya 0.3 | 3.3 | 12.0% | 24 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.6% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 21 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 5 |
| conscience.Electron 1.3g | 7.0 | 7.8% | 2 |
| ap.Frederick 1.1 | 7.8 | 6.8% | 10 |
| dl.BetterWalls 1.0 | 9.0 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 66.7 | 15 / 35 | 4632 |
| 2 | 1 | 63.8 | 69.8 | 15 / 35 | 4775 |
| 3 | 1 | 61.3 | 66.0 | 17 / 35 | 3932 |
| 4 | 1 | 64.1 | 68.6 | 15 / 35 | 4762 |
| 5 | 1 | 63.5 | 69.2 | 14 / 35 | 4948 |
| 6 | 1 | 65.9 | 75.9 | 19 / 35 | 4807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 80% |
| dummy.micro.Sparrow 2.5 | 25 | 76% |
| bvh.micro.Freya 0.3 | 23 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 92% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 24% | 65 |
| dummy.micro.Sparrow 2.5 | 21 | 18% | 44 |
| conscience.Electron 1.3g | 17 | 15% | 21 |
| bvh.micro.Freya 0.3 | 15 | 13% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 12% | 14 |
| dl.BetterWalls 1.0 | 9 | 8% | 11 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 4% | 19 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 81.3 | 135 / 210 | 2.69 | 20.3% | 41421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.3% | 135 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 21 |
| sul.Lunar 1.1 | 3.7 | 11.4% | 16 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.3% | 17 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.1% | 9 |
| dsw.StaticD 1.0 | 5.8 | 8.9% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.5% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 5.9% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 2 |
| sample.Corners 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 81.3 | 20 / 35 | 7179 |
| 2 | 1 | 70.6 | 84.1 | 23 / 35 | 6618 |
| 3 | 1 | 70.6 | 81.6 | 20 / 35 | 7172 |
| 4 | 1 | 71.5 | 84.4 | 26 / 35 | 6942 |
| 5 | 1 | 69.8 | 80.3 | 23 / 35 | 6449 |
| 6 | 1 | 69.8 | 75.9 | 23 / 35 | 7061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 43 | 88% |
| sul.Lunar 1.1 | 41 | 100% |
| supersample.SuperBoxBot 1.0 | 32 | 91% |
| dsw.StaticD 1.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 29% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 25% | 62 |
| mme.NikeEnhanced 2.0 | 15 | 19% | 18 |
| dsw.StaticD 1.0 | 9 | 12% | 18 |
| sul.Lunar 1.1 | 4 | 5% | 46 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 80.5 | 114 / 210 | 2.75 | 18.7% | 39369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.7% | 114 |
| radnor.DoctorBob 1.42 | 2.3 | 12.9% | 20 |
| mld.Wisdom 1.0 | 2.7 | 12.9% | 21 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.6% | 21 |
| amz.NanoClone 1.41 | 5.5 | 9.9% | 14 |
| sample.Walls 1.0 | 7.0 | 7.7% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 82.5 | 19 / 35 | 6898 |
| 2 | 1 | 66.8 | 80.0 | 17 / 35 | 5750 |
| 3 | 1 | 69.3 | 81.9 | 19 / 35 | 6762 |
| 4 | 1 | 68.5 | 78.4 | 21 / 35 | 7276 |
| 5 | 1 | 67.1 | 77.5 | 18 / 35 | 5884 |
| 6 | 1 | 69.3 | 82.9 | 20 / 35 | 6799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 92% |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 86% |
| mld.Wisdom 1.0 | 30 | 67% |
| amz.NanoClone 1.41 | 14 | 86% |
| sample.Walls 1.0 | 9 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 31% | 51 |
| radnor.DoctorBob 1.42 | 19 | 20% | 57 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 14% | 42 |
| amz.NanoClone 1.41 | 8 | 8% | 17 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 3 |

