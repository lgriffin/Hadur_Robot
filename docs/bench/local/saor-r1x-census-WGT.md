# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 87.9 | 145 / 210 | 2.09 | 21.8% | 45823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.8% | 145 |
| mz.AntiGrav 1.0 | 2.3 | 14.3% | 18 |
| radnor.DoctorBob 1.42 | 3.2 | 13.7% | 19 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 5 |
| GarmBox.Oranges 1.0 | 6.5 | 6.7% | 1 |
| sample.Walls 1.0 | 7.2 | 6.5% | 2 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 87.3 | 24 / 35 | 7559 |
| 2 | 1 | 73.7 | 91.7 | 26 / 35 | 7997 |
| 3 | 1 | 72.4 | 85.4 | 23 / 35 | 7620 |
| 4 | 1 | 71.2 | 84.4 | 21 / 35 | 7146 |
| 5 | 1 | 73.1 | 89.2 | 25 / 35 | 7650 |
| 6 | 1 | 73.1 | 89.2 | 26 / 35 | 7851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 94% |
| radnor.DoctorBob 1.42 | 40 | 75% |
| mld.Infinity 2.2 | 38 | 92% |
| amz.NanoClone 1.41 | 5 | 80% |
| jangs.ns51 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 46% | 65 |
| mz.AntiGrav 1.0 | 11 | 17% | 69 |
| mld.Infinity 2.2 | 10 | 15% | 47 |
| amz.NanoClone 1.41 | 4 | 6% | 7 |
| sample.Walls 1.0 | 4 | 6% | 7 |
| jangs.ns51 1.0 | 4 | 6% | 6 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.3 | 110 / 210 | 2.68 | 18.6% | 35177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.6% | 110 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.5% | 69 |
| mld.DustBunny 3.8 | 3.0 | 13.5% | 18 |
| maribo.melee.BMV 0.1 | 4.0 | 10.2% | 2 |
| zyx.nano.Ant 1.1 | 6.3 | 8.4% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.6% | 6 |
| fullsail.SweetTea 1.1 | 7.2 | 6.8% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.9 | 20 / 35 | 6046 |
| 2 | 1 | 71.2 | 91.1 | 25 / 35 | 6673 |
| 3 | 1 | 68.4 | 86.0 | 17 / 35 | 5556 |
| 4 | 1 | 66.7 | 77.5 | 15 / 35 | 5561 |
| 5 | 1 | 64.7 | 64.4 | 12 / 35 | 5865 |
| 6 | 1 | 69.0 | 86.0 | 21 / 35 | 5476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 72% |
| mld.DustBunny 3.8 | 46 | 85% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 38% | 86 |
| mld.DustBunny 3.8 | 26 | 25% | 60 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 11 |
| cs.Grudge 1.0 | 8 | 8% | 8 |
| maribo.melee.BMV 0.1 | 5 | 5% | 12 |
| zyx.nano.Ant 1.1 | 5 | 5% | 7 |
| bzdp.BoxCar 2.0 | 4 | 4% | 8 |
| fullsail.SweetTea 1.1 | 4 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 11 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.4 | 136 / 210 | 2.49 | 20.1% | 37921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.1% | 136 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.9% | 15 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.0% | 7 |
| fm.mammillarias 1.3 | 5.5 | 9.1% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.3 | 7.5% | 4 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 82.2 | 19 / 35 | 6323 |
| 2 | 1 | 70.9 | 87.0 | 26 / 35 | 6287 |
| 3 | 1 | 72.6 | 91.1 | 27 / 35 | 6940 |
| 4 | 1 | 70.7 | 83.2 | 23 / 35 | 6560 |
| 5 | 1 | 69.6 | 79.7 | 21 / 35 | 6459 |
| 6 | 1 | 67.4 | 77.5 | 20 / 35 | 5352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 62 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 29 | 83% |
| myl.nano.KomoriNinja 1.1 | 22 | 91% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% | 34 |
| myl.micro.Troodon 1.10 | 14 | 19% | 66 |
| cb.nano.Insomnia 1.0 | 11 | 15% | 14 |
| myl.nano.KomoriNinja 1.1 | 10 | 14% | 49 |
| fm.mammillarias 1.3 | 8 | 11% | 11 |
| cs.sheldor.Talon 1.1 | 7 | 9% | 12 |
| sp.Nanos.Ember 1.1 | 5 | 7% | 16 |
| sample.Tracker 1.0 | 3 | 4% | 2 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.4 | 147 / 210 | 2.13 | 21.1% | 41692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.1% | 147 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 20 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 12 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 8.9% | 11 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.1% | 3 |
| yk.JahMicro 1.0 | 8.0 | 7.3% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.9 | 25 / 35 | 6655 |
| 2 | 1 | 73.8 | 94.6 | 31 / 35 | 7821 |
| 3 | 1 | 71.5 | 87.0 | 26 / 35 | 7180 |
| 4 | 1 | 71.2 | 89.2 | 24 / 35 | 6722 |
| 5 | 1 | 69.5 | 81.6 | 21 / 35 | 6915 |
| 6 | 1 | 69.4 | 84.1 | 20 / 35 | 6399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 78 | 91% |
| stelo.SoJNanoMelee 1.1 | 25 | 88% |
| tvv.micro.Antares 1.1.1 | 20 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 93% |
| tj.zombie1n 1.0.1 | 15 | 73% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 45% | 107 |
| stelo.SoJNanoMelee 1.1 | 9 | 14% | 28 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 26 |
| tj.zombie1n 1.0.1 | 5 | 8% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 17 |
| sample.VelociRobot 1.0 | 3 | 5% | 3 |
| repositorio.NanoStep 1.0 | 2 | 3% | 10 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 3 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.2 | 82 / 210 | 3.86 | 16.1% | 31219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 16.1% | 82 |
| oog.melee.Corsair 1.0 | 2.2 | 13.0% | 36 |
| ahf.NanoAndrew .4 | 3.2 | 12.0% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.7% | 24 |
| EBBU.Sim2 1.02 | 5.2 | 10.0% | 12 |
| sam.Samspin 1.0 | 6.2 | 9.9% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 1 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 71.1 | 14 / 35 | 5417 |
| 2 | 2 | 58.3 | 52.4 | 10 / 35 | 4441 |
| 3 | 1 | 63.4 | 67.0 | 11 / 35 | 5176 |
| 4 | 1 | 66.2 | 75.2 | 17 / 35 | 5380 |
| 5 | 1 | 66.9 | 75.9 | 15 / 35 | 5630 |
| 6 | 1 | 63.9 | 67.6 | 15 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 44 | 64% |
| simonton.nano.MeleeSeed 1.8 | 25 | 84% |
| ahf.NanoAndrew .4 | 15 | 87% |
| sam.Samspin 1.0 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| EBBU.Sim2 1.02 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 24% | 55 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 39 |
| robar.nano.Assertive_Melee 0.2 | 20 | 16% | 23 |
| ahf.NanoAndrew .4 | 17 | 13% | 31 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 12 |
| EBBU.Sim2 1.02 | 9 | 7% | 16 |
| sample.TrackFire 1.0 | 6 | 5% | 8 |
| sam.Samspin 1.0 | 5 | 4% | 11 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.9 | 138 / 210 | 2.36 | 19.4% | 34178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.4% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 31 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 14 |
| fm.claire 1.7 | 5.5 | 9.0% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.3% | 6 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.3% | 2 |
| sample.SpinBot 1.0 | 8.3 | 6.3% | 1 |
| pa.Improved 1.0 | 8.8 | 6.1% | 4 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 28 / 35 | 6044 |
| 2 | 1 | 66.5 | 74.9 | 21 / 35 | 5256 |
| 3 | 1 | 70.5 | 88.6 | 25 / 35 | 5975 |
| 4 | 1 | 67.8 | 78.7 | 17 / 35 | 5973 |
| 5 | 1 | 67.3 | 82.9 | 18 / 35 | 5040 |
| 6 | 1 | 71.6 | 95.2 | 29 / 35 | 5890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 86% |
| oog.melee.CapuletDroid 1.1 | 22 | 95% |
| gh.nano.Grofvuil 0.2 | 19 | 79% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| fm.claire 1.7 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| pa.Improved 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 31% | 84 |
| gh.nano.Grofvuil 0.2 | 13 | 18% | 37 |
| arthord.NanoSatanMelee Beta | 12 | 17% | 27 |
| fm.claire 1.7 | 8 | 11% | 10 |
| oog.melee.CapuletDroid 1.1 | 6 | 8% | 27 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| pa.Improved 1.0 | 2 | 3% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 79.3 | 93 / 210 | 2.87 | 17.9% | 34822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.9% | 93 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 44 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 25 |
| mz.MicroGodMelee 1 | 4.0 | 12.4% | 35 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 8 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.9% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 77.1 | 16 / 35 | 5710 |
| 2 | 1 | 68.0 | 81.3 | 14 / 35 | 5978 |
| 3 | 1 | 69.7 | 85.7 | 19 / 35 | 6024 |
| 4 | 1 | 66.6 | 75.6 | 16 / 35 | 5715 |
| 5 | 1 | 68.5 | 83.8 | 16 / 35 | 6248 |
| 6 | 1 | 64.5 | 72.1 | 12 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 83% |
| mz.MicroGodMelee 1 | 42 | 50% |
| gh.micro.Gruweltje 0.7 | 27 | 56% |
| DBall.Anarchy 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| acogdev.alpha 0.2 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 39 | 33% | 56 |
| spinnercat.micro.Tyger 0.1 | 26 | 22% | 71 |
| gh.micro.Gruweltje 0.7 | 26 | 22% | 45 |
| fire219.CatBot 1.0 | 8 | 7% | 8 |
| acogdev.alpha 0.2 | 7 | 6% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 6 |
| DBall.Anarchy 0.1 | 4 | 3% | 11 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 73.6 | 114 / 210 | 3.38 | 17.1% | 31462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.3 | 17.1% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 31 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.8% | 9 |
| germ.TheMind .2 | 4.7 | 9.9% | 5 |
| awesomeness.Elite 1.0 | 6.5 | 8.0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 7.6% | 1 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 5 |
| sample.Crazy 1.0 | 9.0 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.7 | 20 / 35 | 5102 |
| 2 | 1 | 67.0 | 75.9 | 23 / 35 | 5234 |
| 3 | 1 | 66.1 | 71.4 | 15 / 35 | 5886 |
| 4 | 1 | 68.0 | 80.6 | 20 / 35 | 5557 |
| 5 | 1 | 66.5 | 75.2 | 22 / 35 | 5269 |
| 6 | 3 | 60.1 | 59.7 | 14 / 35 | 4414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 81% |
| stelo.UntouchableNano 1.3 | 10 | 70% |
| germ.TheMind .2 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 42% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 23% | 41 |
| germ.TheMind .2 | 12 | 13% | 22 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 15 |
| awesomeness.Elite 1.0 | 5 | 5% | 15 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.4 | 153 / 210 | 2.13 | 20.6% | 34433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.6% | 153 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.1% | 8 |
| maribo.IotaCT 1.1 | 4.5 | 10.7% | 7 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.1% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.1% | 4 |
| ratosh.Wesco 1.4 | 7.2 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.3% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.1% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.1 | 27 / 35 | 5102 |
| 2 | 1 | 71.0 | 88.3 | 23 / 35 | 5892 |
| 3 | 1 | 71.0 | 88.3 | 24 / 35 | 5756 |
| 4 | 1 | 73.0 | 90.8 | 29 / 35 | 6404 |
| 5 | 1 | 72.2 | 90.5 | 27 / 35 | 5854 |
| 6 | 1 | 69.3 | 82.5 | 23 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 96% |
| nz.jdc.nano.GridFu 1.0 | 37 | 100% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| maribo.IotaCT 1.1 | 11 | 82% |
| ratosh.Wesco 1.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 18 | 32% | 31 |
| rz.HawkOnFire 0.1 | 13 | 23% | 73 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 14% | 14 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 51 |
| maribo.IotaCT 1.1 | 4 | 7% | 14 |
| stelo.PatternRobot 1.0 | 4 | 7% | 13 |
| ratosh.Wesco 1.4 | 2 | 4% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.6 | 165 / 210 | 1.85 | 21.6% | 41286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.6% | 165 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 7 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 5.5 | 9.0% | 8 |
| sanja.First 0.1 | 6.2 | 8.4% | 5 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.4% | 2 |
| cvt.Firsty 1.0 | 8.2 | 6.9% | 7 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.8 | 27 / 35 | 6687 |
| 2 | 1 | 70.3 | 85.7 | 28 / 35 | 6413 |
| 3 | 1 | 71.9 | 91.7 | 26 / 35 | 6757 |
| 4 | 1 | 73.2 | 94.6 | 29 / 35 | 7532 |
| 5 | 1 | 72.5 | 93.0 | 29 / 35 | 7138 |
| 6 | 1 | 70.9 | 88.6 | 26 / 35 | 6759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 95% |
| tvv.nano.Polaris 1.2 | 37 | 95% |
| cvt.Firsty 1.0 | 31 | 84% |
| sanja.First 0.1 | 21 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| zyx.micro.Ant 1.1 | 13 | 92% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 28% | 29 |
| baal.nano.N 1.42 | 10 | 22% | 54 |
| tvv.nano.Polaris 1.2 | 6 | 13% | 59 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 22 |
| cvt.Firsty 1.0 | 5 | 11% | 16 |
| sample.RamFire 1.0 | 3 | 7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |
| sanja.First 0.1 | 0 | 0% | 20 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.1 | 82 / 210 | 3.60 | 16.2% | 33029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 16.2% | 82 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 63 |
| js.PinBall 1.6 | 3.5 | 11.7% | 11 |
| cs.Wren 1.0 | 3.8 | 12.0% | 21 |
| mz.Cork 0.1 | 4.7 | 11.4% | 19 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 4 |
| evd.X1 0.01 | 7.2 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 8.7 | 6.1% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.9 | 11 / 35 | 5413 |
| 2 | 2 | 65.1 | 73.0 | 14 / 35 | 5434 |
| 3 | 1 | 64.3 | 70.5 | 12 / 35 | 5382 |
| 4 | 1 | 66.4 | 74.6 | 17 / 35 | 5781 |
| 5 | 1 | 63.1 | 67.6 | 14 / 35 | 5343 |
| 6 | 1 | 64.8 | 72.7 | 14 / 35 | 5676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 59% |
| cs.Wren 1.0 | 17 | 71% |
| mz.Cork 0.1 | 14 | 79% |
| js.PinBall 1.6 | 7 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 64 | 50% | 104 |
| js.PinBall 1.6 | 13 | 10% | 25 |
| evd.X1 0.01 | 13 | 10% | 14 |
| cs.Wren 1.0 | 11 | 9% | 22 |
| joe.ADinosaur 1.0 | 10 | 8% | 13 |
| mz.Cork 0.1 | 8 | 6% | 16 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.3 | 125 / 210 | 2.60 | 18.9% | 30617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.9% | 125 |
| myl.nano.Graviton 1.10 | 3.2 | 11.4% | 21 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 11 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.8% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.8% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 3 |
| disan.Chair 2.2.0 | 7.5 | 8.2% | 17 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.1 | 18 / 35 | 4541 |
| 2 | 1 | 67.7 | 79.0 | 19 / 35 | 5226 |
| 3 | 1 | 68.9 | 83.5 | 23 / 35 | 5099 |
| 4 | 1 | 65.1 | 71.4 | 18 / 35 | 5126 |
| 5 | 1 | 71.3 | 91.7 | 26 / 35 | 5528 |
| 6 | 1 | 68.7 | 83.8 | 21 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 31 | 87% |
| myl.nano.Graviton 1.10 | 30 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 26 | 92% |
| ntc.Opposite 1.5 | 23 | 87% |
| DBall.NUKE 0.1 | 15 | 93% |
| disan.Chair 2.2.0 | 10 | 40% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| donjezza.Muncho 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 17% | 43 |
| ntc.Opposite 1.5 | 14 | 16% | 33 |
| stelo.AreaTargetingBot 1.1 | 13 | 15% | 37 |
| pfvicm.Sobieski 7.2.3b | 13 | 15% | 20 |
| disan.Chair 2.2.0 | 13 | 15% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 22 |
| DBall.NUKE 0.1 | 7 | 8% | 23 |
| donjezza.Muncho 1.0 | 1 | 1% | 7 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.3 | 97 / 210 | 3.13 | 16.8% | 27496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.8% | 97 |
| oog.melee.Capulet 1.2 | 2.7 | 13.8% | 44 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.2% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.7% | 18 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.4 | 17 / 35 | 4503 |
| 2 | 1 | 64.5 | 69.8 | 15 / 35 | 4605 |
| 3 | 1 | 67.2 | 78.7 | 17 / 35 | 4677 |
| 4 | 1 | 66.3 | 75.9 | 17 / 35 | 4517 |
| 5 | 1 | 65.1 | 70.5 | 14 / 35 | 4706 |
| 6 | 1 | 67.6 | 84.4 | 17 / 35 | 4488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 85% |
| oog.melee.Capulet 1.2 | 25 | 60% |
| yagami.Tidus 0.11 | 22 | 95% |
| kawigi.micro.Shiz 1.1 | 19 | 95% |
| ejb.Polaris 1.0.1 | 15 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 36% | 54 |
| yagami.Tidus 0.11 | 17 | 15% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 14% | 47 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 30 |
| stelo.MirrorNano 1.3 | 11 | 10% | 11 |
| ejb.Polaris 1.0.1 | 8 | 7% | 24 |
| kurios.DOSexe .9a | 6 | 5% | 7 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.9 | 127 / 210 | 2.81 | 17.7% | 28566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.7% | 127 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 17 |
| ratosh.Nobo 0.21 | 3.2 | 11.9% | 13 |
| wee.Gem 1.8.4 | 3.8 | 11.5% | 20 |
| wompi.Quokka 1.6 | 4.2 | 11.0% | 18 |
| m3thos.Eva00 1.1 | 6.2 | 9.5% | 9 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.8 | 20 / 35 | 5144 |
| 2 | 1 | 65.6 | 76.8 | 20 / 35 | 4642 |
| 3 | 1 | 65.3 | 77.5 | 20 / 35 | 4255 |
| 4 | 1 | 67.8 | 83.8 | 23 / 35 | 4763 |
| 5 | 1 | 67.3 | 83.8 | 21 / 35 | 4745 |
| 6 | 1 | 67.1 | 79.7 | 23 / 35 | 5017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 92% |
| wee.Gem 1.8.4 | 34 | 100% |
| wompi.Quokka 1.6 | 14 | 86% |
| ratosh.Nobo 0.21 | 11 | 73% |
| m3thos.Eva00 1.1 | 7 | 71% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 19 | 23% | 32 |
| bzdp.Pansy 2.1 | 14 | 17% | 61 |
| bayen.UbaMicro 1.4 | 11 | 13% | 17 |
| m3thos.Eva00 1.1 | 10 | 12% | 16 |
| maribo.FollowFire 1 | 8 | 10% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 10 |
| wompi.Quokka 1.6 | 5 | 6% | 12 |
| wee.Gem 1.8.4 | 4 | 5% | 41 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 89.0 | 132 / 210 | 1.99 | 22.6% | 52257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.6% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 57 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 16 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.7 | 93.0 | 25 / 35 | 9230 |
| 2 | 1 | 74.9 | 94.0 | 24 / 35 | 8869 |
| 3 | 1 | 73.4 | 87.9 | 25 / 35 | 8214 |
| 4 | 1 | 73.4 | 87.9 | 18 / 35 | 8775 |
| 5 | 1 | 72.7 | 83.2 | 21 / 35 | 8396 |
| 6 | 1 | 73.5 | 88.3 | 19 / 35 | 8773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 123 | 80% |
| mz.NanoGod 2.02 | 18 | 67% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| stelo.PianistNano 1.2 | 6 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 54% | 148 |
| mz.NanoGod 2.02 | 19 | 24% | 32 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 12 |
| stuff.Vlad 0.1 | 4 | 5% | 4 |
| ayk.WallHugger 1.0 | 3 | 4% | 7 |
| drd.Dreadknoght 0.9 | 2 | 3% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.1 | 103 / 210 | 3.51 | 16.8% | 30395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.8% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.4% | 23 |
| bvh.micro.Freya 0.3 | 3.5 | 12.0% | 23 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.4% | 18 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 7 |
| conscience.Electron 1.3g | 6.5 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 67.6 | 15 / 35 | 4820 |
| 2 | 1 | 63.4 | 65.4 | 15 / 35 | 4980 |
| 3 | 1 | 66.6 | 76.2 | 22 / 35 | 5050 |
| 4 | 1 | 67.6 | 80.6 | 20 / 35 | 5198 |
| 5 | 1 | 64.5 | 69.5 | 15 / 35 | 5198 |
| 6 | 1 | 65.4 | 73.3 | 16 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 83% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| bvh.micro.Freya 0.3 | 23 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 75% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 21% | 64 |
| dummy.micro.Sparrow 2.5 | 19 | 18% | 43 |
| conscience.Electron 1.3g | 19 | 18% | 22 |
| bvh.micro.Freya 0.3 | 14 | 13% | 31 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 10% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 11 |
| dl.BetterWalls 1.0 | 6 | 6% | 7 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.2 | 151 / 210 | 1.98 | 22.2% | 45527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.2% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.0% | 23 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 9 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.4% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 5 |
| dsw.StaticD 1.0 | 6.0 | 7.8% | 2 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.3% | 2 |
| sample.Corners 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 84.1 | 21 / 35 | 7206 |
| 2 | 1 | 73.6 | 90.8 | 26 / 35 | 7898 |
| 3 | 1 | 73.8 | 94.0 | 28 / 35 | 7961 |
| 4 | 1 | 72.3 | 87.6 | 25 / 35 | 7502 |
| 5 | 1 | 71.8 | 85.7 | 24 / 35 | 7376 |
| 6 | 1 | 73.3 | 92.7 | 27 / 35 | 7584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 56 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 50 | 86% |
| supersample.SuperBoxBot 1.0 | 27 | 81% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 75% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| dsw.StaticD 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 37% | 75 |
| supersample.SuperBoxBot 1.0 | 16 | 27% | 28 |
| dsw.StaticD 1.0 | 7 | 12% | 18 |
| sul.Lunar 1.1 | 6 | 10% | 63 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 78.6 | 107 / 210 | 2.92 | 18.6% | 39629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.6% | 107 |
| mld.Wisdom 1.0 | 2.7 | 12.7% | 31 |
| radnor.DoctorBob 1.42 | 3.0 | 12.6% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.0% | 17 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.3% | 9 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 13 |
| GarmBox.Oranges 1.0 | 7.8 | 6.8% | 0 |
| sample.Walls 1.0 | 8.0 | 7.2% | 3 |
| jangs.ns51 1.0 | 8.2 | 6.9% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 78.7 | 20 / 35 | 7105 |
| 2 | 1 | 69.7 | 86.3 | 21 / 35 | 6538 |
| 3 | 1 | 67.7 | 77.5 | 19 / 35 | 6596 |
| 4 | 1 | 65.1 | 68.6 | 12 / 35 | 5876 |
| 5 | 1 | 67.6 | 77.8 | 16 / 35 | 6562 |
| 6 | 1 | 69.3 | 82.9 | 19 / 35 | 6952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 89% |
| radnor.DoctorBob 1.42 | 33 | 76% |
| mld.Wisdom 1.0 | 20 | 50% |
| KiraNL.Chupacabra 0.4 | 12 | 100% |
| amz.NanoClone 1.41 | 10 | 90% |
| jangs.ns51 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 39 | 38% | 53 |
| radnor.DoctorBob 1.42 | 22 | 21% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 19% | 51 |
| KiraNL.Chupacabra 0.4 | 9 | 9% | 20 |
| jangs.ns51 1.0 | 7 | 7% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |
| amz.NanoClone 1.41 | 2 | 2% | 12 |
| sample.Walls 1.0 | 2 | 2% | 6 |

