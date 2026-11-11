# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.8 | 142 / 210 | 2.10 | 21.2% | 43393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.2% | 142 |
| mz.AntiGrav 1.0 | 2.5 | 13.7% | 20 |
| radnor.DoctorBob 1.42 | 2.5 | 13.8% | 24 |
| mld.Infinity 2.2 | 4.2 | 12.4% | 14 |
| amz.NanoClone 1.41 | 4.8 | 11.0% | 8 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 1 |
| sample.Walls 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 78.7 | 21 / 35 | 6312 |
| 2 | 1 | 71.1 | 83.8 | 23 / 35 | 7187 |
| 3 | 1 | 72.7 | 92.1 | 23 / 35 | 7384 |
| 4 | 1 | 73.7 | 93.7 | 27 / 35 | 7623 |
| 5 | 1 | 71.8 | 86.0 | 26 / 35 | 7280 |
| 6 | 1 | 72.8 | 92.4 | 22 / 35 | 7607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 92% |
| radnor.DoctorBob 1.42 | 37 | 78% |
| mld.Infinity 2.2 | 32 | 97% |
| amz.NanoClone 1.41 | 10 | 70% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 38% | 67 |
| mz.AntiGrav 1.0 | 21 | 31% | 69 |
| amz.NanoClone 1.41 | 9 | 13% | 20 |
| mld.Infinity 2.2 | 7 | 10% | 33 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| GarmBox.Oranges 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.7 | 110 / 210 | 2.56 | 18.5% | 34165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.5% | 110 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.3% | 64 |
| mld.DustBunny 3.8 | 3.0 | 13.1% | 18 |
| maribo.melee.BMV 0.1 | 4.2 | 10.8% | 3 |
| zyx.nano.Ant 1.1 | 5.2 | 9.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.9% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 6.4% | 6 |
| fullsail.SweetTea 1.1 | 7.8 | 6.5% | 1 |
| bzdp.BoxCar 2.0 | 7.8 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 21 / 35 | 5853 |
| 2 | 1 | 68.2 | 84.4 | 17 / 35 | 5364 |
| 3 | 1 | 68.4 | 87.6 | 20 / 35 | 5336 |
| 4 | 1 | 69.1 | 86.0 | 19 / 35 | 5887 |
| 5 | 1 | 69.0 | 85.7 | 23 / 35 | 5643 |
| 6 | 1 | 64.3 | 64.1 | 10 / 35 | 6082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 72% |
| mld.DustBunny 3.8 | 44 | 89% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 37% | 89 |
| mld.DustBunny 3.8 | 23 | 23% | 58 |
| zyx.nano.Ant 1.1 | 11 | 11% | 13 |
| maribo.melee.BMV 0.1 | 8 | 8% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 10 |
| fullsail.SweetTea 1.1 | 7 | 7% | 8 |
| cs.Grudge 1.0 | 7 | 7% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.5 | 136 / 210 | 2.58 | 20.0% | 37692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.0% | 136 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.9% | 11 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 7 |
| fm.mammillarias 1.3 | 6.2 | 8.5% | 1 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 5 |
| sample.Fire 1.0 | 9.2 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 80.6 | 23 / 35 | 6324 |
| 2 | 1 | 71.5 | 86.0 | 24 / 35 | 6965 |
| 3 | 1 | 69.7 | 81.9 | 24 / 35 | 5865 |
| 4 | 1 | 67.6 | 75.2 | 19 / 35 | 5726 |
| 5 | 1 | 70.2 | 82.5 | 21 / 35 | 6406 |
| 6 | 1 | 71.7 | 88.6 | 25 / 35 | 6406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 84% |
| myl.nano.KomoriNinja 1.1 | 26 | 88% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| sp.Nanos.Ember 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 21% | 61 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 46 |
| cb.nano.Insomnia 1.0 | 16 | 21% | 24 |
| fm.mammillarias 1.3 | 8 | 11% | 11 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 35 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 7 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| sample.Tracker 1.0 | 3 | 4% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 18 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.3 | 149 / 210 | 2.41 | 20.6% | 41316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.6% | 149 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 14 |
| tvv.micro.Antares 1.1.1 | 3.2 | 12.0% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 8.8% | 14 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 8 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 9.3 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 80.3 | 25 / 35 | 7020 |
| 2 | 1 | 70.4 | 85.7 | 24 / 35 | 6633 |
| 3 | 1 | 70.8 | 84.1 | 26 / 35 | 7003 |
| 4 | 1 | 71.9 | 90.8 | 28 / 35 | 6925 |
| 5 | 1 | 69.7 | 80.6 | 22 / 35 | 7035 |
| 6 | 1 | 70.2 | 84.4 | 24 / 35 | 6700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 74 | 93% |
| stelo.SoJNanoMelee 1.1 | 23 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 100% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| yk.JahMicro 1.0 | 7 | 71% |
| sample.VelociRobot 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 39% | 92 |
| stelo.SoJNanoMelee 1.1 | 10 | 16% | 25 |
| yk.JahMicro 1.0 | 6 | 10% | 9 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 9 |
| tj.zombie1n 1.0.1 | 4 | 7% | 6 |
| repositorio.NanoStep 1.0 | 3 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 18 |
| sample.VelociRobot 1.0 | 2 | 3% | 11 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.5 | 92 / 210 | 3.57 | 16.6% | 31400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.6% | 92 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 30 |
| ahf.NanoAndrew .4 | 2.8 | 12.0% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.8% | 22 |
| EBBU.Sim2 1.02 | 4.8 | 10.3% | 7 |
| sam.Samspin 1.0 | 6.5 | 9.1% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.9% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.8% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 75.6 | 22 / 35 | 5146 |
| 2 | 1 | 65.8 | 72.4 | 19 / 35 | 5281 |
| 3 | 1 | 64.7 | 73.7 | 11 / 35 | 5466 |
| 4 | 1 | 64.2 | 69.8 | 15 / 35 | 5173 |
| 5 | 1 | 64.6 | 69.2 | 12 / 35 | 5587 |
| 6 | 1 | 63.4 | 68.3 | 13 / 35 | 4747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 67% |
| simonton.nano.MeleeSeed 1.8 | 29 | 83% |
| ahf.NanoAndrew .4 | 25 | 72% |
| EBBU.Sim2 1.02 | 14 | 86% |
| sam.Samspin 1.0 | 8 | 63% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 23% | 49 |
| oog.melee.Corsair 1.0 | 19 | 16% | 43 |
| ahf.NanoAndrew .4 | 16 | 13% | 36 |
| EBBU.Sim2 1.02 | 16 | 13% | 27 |
| robar.nano.Assertive_Melee 0.2 | 14 | 12% | 20 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 10 |
| sam.Samspin 1.0 | 5 | 4% | 7 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.9 | 138 / 210 | 2.27 | 19.2% | 31969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.2% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 28 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.9% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.3% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.8% | 4 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 4 |
| fm.claire 1.7 | 6.5 | 8.0% | 2 |
| sample.SpinBot 1.0 | 8.0 | 6.9% | 3 |
| pa.Improved 1.0 | 9.2 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.6 | 26 / 35 | 5033 |
| 2 | 1 | 68.9 | 86.0 | 23 / 35 | 5500 |
| 3 | 1 | 65.0 | 74.9 | 18 / 35 | 4712 |
| 4 | 1 | 70.1 | 90.5 | 25 / 35 | 5393 |
| 5 | 1 | 70.3 | 91.7 | 25 / 35 | 5546 |
| 6 | 1 | 69.4 | 84.8 | 21 / 35 | 5785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 64 | 92% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| gh.nano.Grofvuil 0.2 | 18 | 83% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 32% | 78 |
| gh.nano.Grofvuil 0.2 | 14 | 19% | 41 |
| oog.melee.CapuletDroid 1.1 | 10 | 14% | 47 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 14 |
| winamp32.micro.MicroMacro 1.0 | 7 | 10% | 13 |
| fm.claire 1.7 | 4 | 6% | 6 |
| sample.SpinBot 1.0 | 4 | 6% | 5 |
| kurios.DOSexe .9b | 3 | 4% | 4 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 77.8 | 96 / 210 | 3.00 | 17.6% | 33330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.6% | 96 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.5% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 14.1% | 32 |
| mz.MicroGodMelee 1 | 3.7 | 13.5% | 32 |
| DBall.Anarchy 0.1 | 5.0 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 2 |
| fire219.CatBot 1.0 | 8.3 | 5.7% | 0 |
| acogdev.alpha 0.2 | 8.3 | 5.7% | 1 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.7 | 17 / 35 | 6072 |
| 2 | 1 | 65.9 | 74.6 | 12 / 35 | 5278 |
| 3 | 1 | 68.3 | 81.9 | 19 / 35 | 5857 |
| 4 | 1 | 65.6 | 73.7 | 13 / 35 | 5275 |
| 5 | 1 | 68.4 | 81.6 | 21 / 35 | 5592 |
| 6 | 1 | 66.0 | 75.6 | 14 / 35 | 5256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 76% |
| mz.MicroGodMelee 1 | 38 | 76% |
| gh.micro.Gruweltje 0.7 | 30 | 70% |
| el.JumpShoot 0.2 | 4 | 75% |
| DBall.Anarchy 0.1 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 114 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 27% | 61 |
| mz.MicroGodMelee 1 | 29 | 25% | 59 |
| gh.micro.Gruweltje 0.7 | 29 | 25% | 56 |
| acogdev.alpha 0.2 | 7 | 6% | 7 |
| DBall.Anarchy 0.1 | 5 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.3 | 100 / 210 | 3.59 | 16.5% | 31018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 16.5% | 100 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 31 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.1% | 5 |
| germ.TheMind .2 | 5.2 | 9.3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 4 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.2% | 9 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 6 |
| sample.Crazy 1.0 | 9.0 | 6.6% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 68.6 | 16 / 35 | 4913 |
| 2 | 1 | 65.5 | 72.4 | 17 / 35 | 5405 |
| 3 | 2 | 62.3 | 64.1 | 14 / 35 | 4767 |
| 4 | 1 | 65.1 | 70.5 | 15 / 35 | 5242 |
| 5 | 1 | 67.0 | 78.1 | 21 / 35 | 5316 |
| 6 | 1 | 65.9 | 74.0 | 17 / 35 | 5375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| stelo.UntouchableNano 1.3 | 12 | 83% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 67% |
| awesomeness.Elite 1.0 | 5 | 80% |
| germ.TheMind .2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 50% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 16% | 39 |
| germ.TheMind .2 | 13 | 12% | 17 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 9 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 15 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 11 |
| awesomeness.Elite 1.0 | 4 | 4% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.7 | 152 / 210 | 2.10 | 20.3% | 32995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.3% | 152 |
| rz.HawkOnFire 0.1 | 2.0 | 13.5% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.9% | 15 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 6 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 4 |
| stelo.PatternRobot 1.0 | 7.2 | 8.2% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 8.8 | 6.9% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 81.9 | 22 / 35 | 5373 |
| 2 | 1 | 71.1 | 89.5 | 26 / 35 | 5256 |
| 3 | 1 | 71.7 | 89.5 | 28 / 35 | 5825 |
| 4 | 1 | 71.5 | 92.1 | 25 / 35 | 5642 |
| 5 | 1 | 68.5 | 78.7 | 21 / 35 | 5302 |
| 6 | 1 | 72.2 | 94.6 | 30 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 96% |
| nz.jdc.nano.GridFu 1.0 | 33 | 94% |
| maribo.IotaCT 1.1 | 14 | 100% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| stelo.PatternRobot 1.0 | 13 | 100% |
| ratosh.Wesco 1.4 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 31% | 73 |
| nz.jdc.nano.GridFu 1.0 | 9 | 15% | 48 |
| stelo.PatternRobot 1.0 | 9 | 15% | 16 |
| timmit.nano.TimDog 0.33 | 8 | 14% | 20 |
| ratosh.Wesco 1.4 | 6 | 10% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 15 |
| spinnercat.Omen 1.0 | 3 | 5% | 6 |
| maribo.IotaCT 1.1 | 1 | 2% | 14 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.0 | 163 / 210 | 1.81 | 21.6% | 41004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.6% | 163 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 18 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 5 |
| zyx.micro.Ant 1.1 | 5.2 | 9.3% | 10 |
| Grystrion.TrackerWO 1.0 | 5.3 | 9.1% | 2 |
| sanja.First 0.1 | 6.0 | 8.1% | 4 |
| cvt.Firsty 1.0 | 7.0 | 7.8% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.8 | 26 / 35 | 6466 |
| 2 | 1 | 72.2 | 89.8 | 28 / 35 | 7481 |
| 3 | 1 | 69.9 | 82.5 | 25 / 35 | 6587 |
| 4 | 1 | 71.6 | 93.0 | 28 / 35 | 6506 |
| 5 | 1 | 72.9 | 95.9 | 31 / 35 | 6768 |
| 6 | 1 | 72.4 | 94.6 | 25 / 35 | 7196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 93% |
| tvv.nano.Polaris 1.2 | 38 | 87% |
| cvt.Firsty 1.0 | 26 | 100% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 30% | 43 |
| tvv.nano.Polaris 1.2 | 11 | 23% | 63 |
| baal.nano.N 1.42 | 5 | 11% | 35 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 12 |
| squidM.TentalceMeleeNano 1.1 | 4 | 9% | 7 |
| cvt.Firsty 1.0 | 3 | 6% | 23 |
| sanja.First 0.1 | 3 | 6% | 17 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 3 |
| sample.RamFire 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 69.7 | 83 / 210 | 3.73 | 15.8% | 31861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 15.8% | 83 |
| kc.micro.Figment 1.0 | 1.8 | 14.4% | 58 |
| cs.Wren 1.0 | 3.2 | 12.6% | 27 |
| js.PinBall 1.6 | 4.2 | 11.7% | 14 |
| mz.Cork 0.1 | 4.7 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 8.8% | 4 |
| evd.X1 0.01 | 7.0 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 7 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 2 |
| PSW.Relentless 0.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 74.6 | 14 / 35 | 5645 |
| 2 | 1 | 60.7 | 60.6 | 9 / 35 | 5111 |
| 3 | 2 | 60.7 | 62.5 | 8 / 35 | 5153 |
| 4 | 1 | 61.8 | 63.5 | 14 / 35 | 4919 |
| 5 | 1 | 68.5 | 83.5 | 21 / 35 | 5897 |
| 6 | 1 | 64.6 | 73.3 | 17 / 35 | 5136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 63% |
| cs.Wren 1.0 | 23 | 78% |
| mz.Cork 0.1 | 13 | 85% |
| js.PinBall 1.6 | 12 | 83% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 44% | 101 |
| cs.Wren 1.0 | 17 | 13% | 30 |
| mz.Cork 0.1 | 13 | 10% | 23 |
| js.PinBall 1.6 | 11 | 9% | 19 |
| joe.ADinosaur 1.0 | 10 | 8% | 12 |
| evd.X1 0.01 | 10 | 8% | 11 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.3 | 136 / 210 | 2.60 | 19.0% | 30584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.0% | 136 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 22 |
| ntc.Opposite 1.5 | 3.5 | 10.8% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.7% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.9% | 15 |
| disan.Chair 2.2.0 | 6.8 | 8.7% | 8 |
| DBall.NUKE 0.1 | 7.3 | 8.5% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.3 | 23 / 35 | 4655 |
| 2 | 1 | 69.3 | 85.1 | 24 / 35 | 5422 |
| 3 | 1 | 67.0 | 77.5 | 19 / 35 | 5353 |
| 4 | 1 | 69.0 | 83.2 | 22 / 35 | 5283 |
| 5 | 1 | 66.7 | 76.5 | 22 / 35 | 4770 |
| 6 | 1 | 70.1 | 90.2 | 26 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 89% |
| ntc.Opposite 1.5 | 19 | 95% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| stelo.AreaTargetingBot 1.1 | 16 | 100% |
| DBall.NUKE 0.1 | 16 | 94% |
| disan.Chair 2.2.0 | 16 | 88% |
| donjezza.Muncho 1.0 | 16 | 88% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 24% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 23% | 33 |
| disan.Chair 2.2.0 | 8 | 11% | 20 |
| pfvicm.Sobieski 7.2.3b | 8 | 11% | 19 |
| ntc.Opposite 1.5 | 7 | 9% | 27 |
| donjezza.Muncho 1.0 | 6 | 8% | 17 |
| stelo.AreaTargetingBot 1.1 | 5 | 7% | 18 |
| DBall.NUKE 0.1 | 3 | 4% | 16 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.6 | 81 / 210 | 3.47 | 15.8% | 26577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 15.8% | 81 |
| oog.melee.Capulet 1.2 | 2.0 | 14.4% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 25 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.2% | 37 |
| yagami.Tidus 0.11 | 5.2 | 11.8% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 5 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 1 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 68.9 | 11 / 35 | 3931 |
| 2 | 1 | 66.7 | 80.6 | 13 / 35 | 4580 |
| 3 | 1 | 65.0 | 72.7 | 17 / 35 | 4244 |
| 4 | 1 | 64.0 | 69.2 | 13 / 35 | 4594 |
| 5 | 1 | 63.9 | 68.9 | 10 / 35 | 4788 |
| 6 | 1 | 65.9 | 75.2 | 17 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 53% |
| kawigi.micro.Shiz 1.1 | 25 | 92% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 83% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 8 | 88% |

Hadur died in 129 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 43% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 14% | 40 |
| yagami.Tidus 0.11 | 16 | 12% | 25 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 33 |
| ejb.Polaris 1.0.1 | 11 | 9% | 19 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.1 | 135 / 210 | 2.61 | 18.0% | 28137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.0% | 135 |
| wee.Gem 1.8.4 | 2.7 | 12.0% | 25 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 15 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 12 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 10 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.5 | 8.8% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 27 / 35 | 4613 |
| 2 | 1 | 64.4 | 75.9 | 17 / 35 | 4247 |
| 3 | 1 | 65.7 | 76.8 | 23 / 35 | 4430 |
| 4 | 1 | 67.7 | 82.5 | 19 / 35 | 4954 |
| 5 | 1 | 68.4 | 85.7 | 24 / 35 | 5007 |
| 6 | 1 | 68.3 | 87.0 | 25 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 96% |
| wee.Gem 1.8.4 | 37 | 95% |
| ratosh.Nobo 0.21 | 21 | 81% |
| wompi.Quokka 1.6 | 16 | 94% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| m3thos.Eva00 1.1 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 20% | 58 |
| ratosh.Nobo 0.21 | 11 | 15% | 28 |
| m3thos.Eva00 1.1 | 10 | 13% | 19 |
| wee.Gem 1.8.4 | 7 | 9% | 41 |
| wompi.Quokka 1.6 | 7 | 9% | 19 |
| bayen.UbaMicro 1.4 | 7 | 9% | 18 |
| maribo.FollowFire 1 | 7 | 9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 8 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.5 | 138 / 210 | 1.94 | 22.4% | 50655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 22.4% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 10 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.6% | 1 |
| stuff.Vlad 0.1 | 5.0 | 9.2% | 2 |
| ayk.WallHugger 1.0 | 5.8 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 83.5 | 21 / 35 | 8192 |
| 2 | 1 | 73.7 | 89.5 | 21 / 35 | 8210 |
| 3 | 1 | 74.3 | 91.4 | 22 / 35 | 8717 |
| 4 | 1 | 72.6 | 86.3 | 22 / 35 | 7921 |
| 5 | 1 | 75.7 | 97.1 | 28 / 35 | 8777 |
| 6 | 1 | 74.2 | 89.2 | 24 / 35 | 8838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 132 | 80% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| mz.NanoGod 2.02 | 11 | 73% |
| stelo.PianistNano 1.2 | 5 | 80% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 50% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 46% | 141 |
| mz.NanoGod 2.02 | 23 | 31% | 35 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 13 |
| stuff.Vlad 0.1 | 5 | 7% | 8 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| ayk.WallHugger 1.0 | 2 | 3% | 7 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.2 | 94 / 210 | 3.95 | 15.8% | 29252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 15.8% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 20 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 22 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 20 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 10 |
| conscience.Electron 1.3g | 7.3 | 8.2% | 2 |
| ap.Frederick 1.1 | 7.8 | 7.4% | 15 |
| dl.BetterWalls 1.0 | 9.0 | 6.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 65.1 | 16 / 35 | 4890 |
| 2 | 1 | 65.3 | 73.0 | 20 / 35 | 4967 |
| 3 | 1 | 63.2 | 67.9 | 14 / 35 | 4665 |
| 4 | 1 | 64.7 | 70.2 | 16 / 35 | 4978 |
| 5 | 1 | 63.1 | 65.7 | 14 / 35 | 5155 |
| 6 | 1 | 61.4 | 61.6 | 14 / 35 | 4597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 84% |
| dummy.micro.Sparrow 2.5 | 26 | 92% |
| bvh.micro.Freya 0.3 | 18 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 75% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 17% | 56 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 39 |
| conscience.Electron 1.3g | 17 | 15% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 16 |
| dl.BetterWalls 1.0 | 14 | 12% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 11% | 31 |
| bvh.micro.Freya 0.3 | 12 | 10% | 21 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.7 | 143 / 210 | 2.38 | 20.9% | 42355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.9% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.7 | 13.8% | 19 |
| supersample.SuperBoxBot 1.0 | 3.2 | 12.4% | 18 |
| sul.Lunar 1.1 | 3.2 | 12.1% | 12 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.2% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 4 |
| sample.Corners 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 91.7 | 28 / 35 | 7334 |
| 2 | 1 | 68.6 | 77.1 | 21 / 35 | 6502 |
| 3 | 1 | 70.2 | 81.6 | 22 / 35 | 6476 |
| 4 | 1 | 72.0 | 87.0 | 24 / 35 | 7193 |
| 5 | 1 | 71.7 | 87.0 | 23 / 35 | 7177 |
| 6 | 1 | 71.7 | 83.8 | 25 / 35 | 7673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 98% |
| supersample.SuperBoxBot 1.0 | 38 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 27 | 93% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| dsw.StaticD 1.0 | 8 | 63% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 32% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 25% | 46 |
| dsw.StaticD 1.0 | 11 | 16% | 18 |
| sul.Lunar 1.1 | 7 | 10% | 64 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 12 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 12 |

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 81.0 | 119 / 210 | 2.71 | 19.0% | 39723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.0% | 119 |
| radnor.DoctorBob 1.42 | 2.8 | 12.4% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.0% | 19 |
| mld.Wisdom 1.0 | 3.7 | 11.7% | 18 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 7 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 12 |
| sample.Walls 1.0 | 7.5 | 7.2% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.3 | 6.5% | 6 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.4 | 22 / 35 | 7107 |
| 2 | 1 | 67.1 | 76.5 | 16 / 35 | 6562 |
| 3 | 1 | 68.3 | 80.3 | 18 / 35 | 6881 |
| 4 | 1 | 70.3 | 84.4 | 23 / 35 | 7005 |
| 5 | 1 | 69.6 | 87.0 | 23 / 35 | 6217 |
| 6 | 1 | 65.9 | 72.4 | 17 / 35 | 5951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 96% |
| radnor.DoctorBob 1.42 | 29 | 93% |
| mld.Wisdom 1.0 | 19 | 63% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 8 | 50% |
| sample.Walls 1.0 | 7 | 86% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 23 | 25% | 38 |
| radnor.DoctorBob 1.42 | 17 | 19% | 45 |
| KiraNL.Chupacabra 0.4 | 14 | 15% | 25 |
| amz.NanoClone 1.41 | 14 | 15% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 13% | 58 |
| jangs.ns51 1.0 | 7 | 8% | 10 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |

