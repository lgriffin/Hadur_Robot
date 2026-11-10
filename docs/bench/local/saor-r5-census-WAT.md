# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 91.4 | 152 / 210 | 1.78 | 21.8% | 43110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.8% | 152 |
| radnor.DoctorBob 1.42 | 2.2 | 14.3% | 15 |
| mz.AntiGrav 1.0 | 3.3 | 13.4% | 18 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 7 |
| sample.Walls 1.0 | 6.5 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 1 |
| GarmBox.Oranges 1.0 | 7.7 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 8.5 | 4.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 91.7 | 24 / 35 | 7291 |
| 2 | 1 | 72.4 | 91.7 | 22 / 35 | 7220 |
| 3 | 1 | 74.5 | 95.9 | 29 / 35 | 7593 |
| 4 | 1 | 72.6 | 90.2 | 23 / 35 | 7373 |
| 5 | 1 | 71.5 | 86.7 | 25 / 35 | 6528 |
| 6 | 1 | 72.5 | 92.1 | 29 / 35 | 7105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 94% |
| mld.Infinity 2.2 | 35 | 94% |
| radnor.DoctorBob 1.42 | 34 | 76% |
| amz.NanoClone 1.41 | 12 | 75% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Target 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 44% | 66 |
| mz.AntiGrav 1.0 | 15 | 25% | 66 |
| mld.Infinity 2.2 | 8 | 14% | 44 |
| amz.NanoClone 1.41 | 7 | 12% | 16 |
| jangs.ns51 1.0 | 2 | 3% | 6 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.1 | 127 / 210 | 2.16 | 19.1% | 32247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.1% | 127 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 44 |
| mld.DustBunny 3.8 | 2.7 | 14.2% | 24 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 3 |
| zyx.nano.Ant 1.1 | 6.3 | 8.0% | 1 |
| bzdp.BoxCar 2.0 | 7.0 | 7.7% | 1 |
| fullsail.SweetTea 1.1 | 7.0 | 7.5% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 6.7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.6% | 2 |
| cs.Grudge 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.0 | 22 / 35 | 5089 |
| 2 | 1 | 66.0 | 71.4 | 14 / 35 | 5603 |
| 3 | 1 | 69.2 | 88.9 | 25 / 35 | 4933 |
| 4 | 1 | 70.2 | 92.7 | 21 / 35 | 5764 |
| 5 | 1 | 69.8 | 89.8 | 26 / 35 | 5410 |
| 6 | 1 | 69.0 | 86.7 | 19 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 70 | 87% |
| oog.melee.Mercutio 1.0 | 57 | 74% |
| fullsail.SweetTea 1.1 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 33 | 40% | 83 |
| oog.melee.Mercutio 1.0 | 24 | 29% | 73 |
| maribo.melee.BMV 0.1 | 8 | 10% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 11 |
| cs.Grudge 1.0 | 4 | 5% | 3 |
| fullsail.SweetTea 1.1 | 3 | 4% | 10 |
| bzdp.BoxCar 2.0 | 3 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 84.3 | 134 / 210 | 2.41 | 19.8% | 35607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.8% | 134 |
| myl.micro.Troodon 1.10 | 2.3 | 14.0% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.7% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.1% | 16 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.3% | 7 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 6 |
| sample.Fire 1.0 | 9.2 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 79.0 | 20 / 35 | 6275 |
| 2 | 1 | 69.3 | 84.4 | 24 / 35 | 5534 |
| 3 | 1 | 70.9 | 90.2 | 23 / 35 | 6071 |
| 4 | 1 | 69.3 | 82.2 | 24 / 35 | 5645 |
| 5 | 1 | 69.4 | 81.3 | 19 / 35 | 6098 |
| 6 | 1 | 70.6 | 88.9 | 24 / 35 | 5984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 88% |
| cb.nano.Insomnia 1.0 | 30 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 94% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 0% |

Hadur died in 76 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 19 | 25% | 30 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 41 |
| myl.micro.Troodon 1.10 | 15 | 20% | 55 |
| fm.mammillarias 1.3 | 12 | 16% | 20 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 39 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 7 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 9 |
| sample.Fire 1.0 | 1 | 1% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.3 | 158 / 210 | 2.23 | 20.7% | 39920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.7% | 158 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.7% | 15 |
| tvv.micro.Antares 1.1.1 | 3.5 | 11.5% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.4% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.7% | 9 |
| tj.zombie1n 1.0.1 | 6.0 | 9.1% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 5 |
| yk.JahMicro 1.0 | 7.0 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 83.2 | 26 / 35 | 7022 |
| 2 | 1 | 72.6 | 93.7 | 30 / 35 | 7175 |
| 3 | 1 | 73.1 | 93.3 | 30 / 35 | 7465 |
| 4 | 1 | 68.0 | 81.0 | 22 / 35 | 5779 |
| 5 | 1 | 68.5 | 81.0 | 25 / 35 | 5889 |
| 6 | 1 | 70.1 | 86.0 | 25 / 35 | 6590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 92% |
| stelo.SoJNanoMelee 1.1 | 42 | 98% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 100% |
| tj.zombie1n 1.0.1 | 10 | 100% |
| tvv.micro.Antares 1.1.1 | 9 | 89% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 46% | 89 |
| yk.JahMicro 1.0 | 7 | 13% | 17 |
| stelo.SoJNanoMelee 1.1 | 5 | 10% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 28 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 12 |
| tj.zombie1n 1.0.1 | 3 | 6% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 6 |
| repositorio.NanoStep 1.0 | 2 | 4% | 12 |
| sample.VelociRobot 1.0 | 1 | 2% | 2 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.2 | 96 / 210 | 3.60 | 16.2% | 28581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.2% | 96 |
| oog.melee.Corsair 1.0 | 2.0 | 13.8% | 47 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.6% | 11 |
| EBBU.Sim2 1.02 | 5.3 | 9.6% | 9 |
| sam.Samspin 1.0 | 6.2 | 9.2% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.6% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 72.1 | 15 / 35 | 4391 |
| 2 | 1 | 63.7 | 69.5 | 15 / 35 | 4578 |
| 3 | 1 | 61.3 | 61.3 | 12 / 35 | 4606 |
| 4 | 1 | 64.4 | 70.5 | 19 / 35 | 4897 |
| 5 | 1 | 64.3 | 72.1 | 15 / 35 | 4820 |
| 6 | 1 | 67.5 | 81.6 | 20 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 43 | 63% |
| simonton.nano.MeleeSeed 1.8 | 39 | 95% |
| ahf.NanoAndrew .4 | 17 | 76% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 26% | 56 |
| simonton.nano.MeleeSeed 1.8 | 21 | 18% | 51 |
| robar.nano.Assertive_Melee 0.2 | 14 | 12% | 16 |
| ahf.NanoAndrew .4 | 13 | 11% | 29 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 11 |
| EBBU.Sim2 1.02 | 9 | 8% | 16 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 12 |
| sample.TrackFire 1.0 | 6 | 5% | 7 |
| sam.Samspin 1.0 | 5 | 4% | 12 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 137 / 210 | 2.21 | 19.3% | 32364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.3% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 15 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 9.5% | 5 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.5% | 10 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 3 |
| fm.claire 1.7 | 6.2 | 8.7% | 3 |
| pa.Improved 1.0 | 8.5 | 6.0% | 2 |
| sample.SpinBot 1.0 | 8.7 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.1 | 27 / 35 | 6205 |
| 2 | 1 | 67.6 | 81.0 | 17 / 35 | 5445 |
| 3 | 1 | 67.8 | 83.2 | 20 / 35 | 5237 |
| 4 | 1 | 67.3 | 83.2 | 21 / 35 | 4854 |
| 5 | 1 | 69.1 | 86.3 | 25 / 35 | 5176 |
| 6 | 1 | 70.8 | 94.6 | 27 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 84 | 86% |
| oog.melee.CapuletDroid 1.1 | 23 | 100% |
| gh.nano.Grofvuil 0.2 | 19 | 89% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| fm.claire 1.7 | 7 | 71% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 44% | 91 |
| gh.nano.Grofvuil 0.2 | 13 | 18% | 33 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 13 |
| oog.melee.CapuletDroid 1.1 | 5 | 7% | 36 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 9 |
| fm.claire 1.7 | 5 | 7% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 5 |
| pa.Improved 1.0 | 2 | 3% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 7 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.9 | 120 / 210 | 2.36 | 19.0% | 35209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.0% | 120 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.6% | 28 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 25 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 29 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 5.8 | 7.7% | 3 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.2 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.3% | 1 |
| acogdev.alpha 0.2 | 9.2 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.3 | 21 / 35 | 5873 |
| 2 | 1 | 68.4 | 83.8 | 21 / 35 | 5466 |
| 3 | 1 | 69.3 | 87.6 | 17 / 35 | 5852 |
| 4 | 1 | 71.4 | 91.4 | 21 / 35 | 6625 |
| 5 | 1 | 68.5 | 81.3 | 20 / 35 | 5874 |
| 6 | 1 | 67.4 | 79.0 | 20 / 35 | 5519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 93% |
| mz.MicroGodMelee 1 | 44 | 73% |
| gh.micro.Gruweltje 0.7 | 26 | 77% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 28 | 31% | 64 |
| spinnercat.micro.Tyger 0.1 | 26 | 29% | 63 |
| gh.micro.Gruweltje 0.7 | 21 | 23% | 49 |
| DBall.Anarchy 0.1 | 4 | 4% | 11 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 8 |
| acogdev.alpha 0.2 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 4 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.6 | 108 / 210 | 3.47 | 16.7% | 29987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.3 | 16.7% | 108 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.3% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.5% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 10.0% | 5 |
| germ.TheMind .2 | 5.2 | 9.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.7% | 3 |
| awesomeness.Elite 1.0 | 7.3 | 7.8% | 5 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.5 | 6.7% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 65.4 | 16 / 35 | 4894 |
| 2 | 1 | 66.6 | 75.9 | 21 / 35 | 4901 |
| 3 | 2 | 62.8 | 67.0 | 14 / 35 | 4548 |
| 4 | 1 | 65.7 | 75.6 | 19 / 35 | 4889 |
| 5 | 1 | 64.7 | 70.5 | 16 / 35 | 4942 |
| 6 | 1 | 68.6 | 81.3 | 22 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| germ.TheMind .2 | 10 | 70% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 51 | 50% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 31 |
| qualidafial.MajorDick 1.0.1 | 10 | 10% | 11 |
| germ.TheMind .2 | 8 | 8% | 19 |
| awesomeness.Elite 1.0 | 6 | 6% | 14 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.4 | 170 / 210 | 1.59 | 21.1% | 32314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.1% | 170 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.7% | 10 |
| maribo.IotaCT 1.1 | 3.8 | 10.6% | 5 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.7% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 0 |
| stelo.PatternRobot 1.0 | 8.7 | 7.1% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.6 | 25 / 35 | 5109 |
| 2 | 1 | 71.4 | 92.4 | 26 / 35 | 5283 |
| 3 | 1 | 71.1 | 93.3 | 27 / 35 | 5088 |
| 4 | 1 | 71.4 | 92.7 | 28 / 35 | 5184 |
| 5 | 1 | 73.5 | 98.1 | 33 / 35 | 6068 |
| 6 | 1 | 72.5 | 95.6 | 31 / 35 | 5582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 93 | 95% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| maribo.IotaCT 1.1 | 18 | 89% |
| timmit.nano.TimDog 0.33 | 17 | 76% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 38% | 75 |
| timmit.nano.TimDog 0.33 | 8 | 20% | 26 |
| nz.jdc.nano.GridFu 1.0 | 4 | 10% | 50 |
| ratosh.Wesco 1.4 | 4 | 10% | 14 |
| stelo.PatternRobot 1.0 | 4 | 10% | 6 |
| maribo.IotaCT 1.1 | 3 | 8% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 5% | 8 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.7 | 180 / 210 | 1.66 | 21.9% | 39709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.9% | 180 |
| baal.nano.N 1.42 | 2.3 | 12.5% | 5 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.9% | 9 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.5% | 2 |
| zyx.micro.Ant 1.1 | 5.8 | 8.7% | 7 |
| amk.Punbot.Punbot 0.01 | 6.7 | 7.8% | 1 |
| sanja.First 0.1 | 6.8 | 7.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.6% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.9 | 28 / 35 | 6264 |
| 2 | 1 | 71.3 | 91.7 | 28 / 35 | 6288 |
| 3 | 1 | 72.7 | 98.1 | 32 / 35 | 6314 |
| 4 | 1 | 72.0 | 91.1 | 30 / 35 | 6435 |
| 5 | 1 | 72.3 | 91.1 | 31 / 35 | 7098 |
| 6 | 1 | 73.5 | 96.2 | 31 / 35 | 7310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 47 | 96% |
| tvv.nano.Polaris 1.2 | 39 | 97% |
| cvt.Firsty 1.0 | 29 | 100% |
| zyx.micro.Ant 1.1 | 20 | 95% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| sanja.First 0.1 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| sample.RamFire 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 8 | 27% | 67 |
| baal.nano.N 1.42 | 7 | 23% | 45 |
| Grystrion.TrackerWO 1.0 | 4 | 13% | 11 |
| zyx.micro.Ant 1.1 | 3 | 10% | 29 |
| amk.Punbot.Punbot 0.01 | 3 | 10% | 11 |
| sample.RamFire 1.0 | 3 | 10% | 4 |
| sanja.First 0.1 | 1 | 3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 4 |
| cvt.Firsty 1.0 | 0 | 0% | 21 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.0 | 88 / 210 | 3.88 | 15.8% | 32103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.3 | 15.8% | 88 |
| kc.micro.Figment 1.0 | 1.8 | 14.7% | 56 |
| cs.Wren 1.0 | 2.8 | 13.0% | 23 |
| js.PinBall 1.6 | 4.0 | 11.4% | 11 |
| mz.Cork 0.1 | 5.2 | 10.5% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 5 |
| evd.X1 0.01 | 6.8 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 7 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.2 | 13 / 35 | 5702 |
| 2 | 1 | 63.3 | 69.2 | 14 / 35 | 4995 |
| 3 | 1 | 66.4 | 73.0 | 19 / 35 | 5841 |
| 4 | 1 | 64.2 | 67.9 | 18 / 35 | 5272 |
| 5 | 2 | 61.3 | 61.6 | 11 / 35 | 5017 |
| 6 | 2 | 63.3 | 67.0 | 13 / 35 | 5276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 72% |
| cs.Wren 1.0 | 24 | 88% |
| mz.Cork 0.1 | 8 | 100% |
| js.PinBall 1.6 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 39% | 100 |
| cs.Wren 1.0 | 24 | 20% | 33 |
| joe.ADinosaur 1.0 | 15 | 12% | 17 |
| evd.X1 0.01 | 12 | 10% | 12 |
| mz.Cork 0.1 | 10 | 8% | 20 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| js.PinBall 1.6 | 6 | 5% | 14 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.8 | 130 / 210 | 2.64 | 18.6% | 29196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.6% | 130 |
| myl.nano.Graviton 1.10 | 2.2 | 12.6% | 28 |
| ntc.Opposite 1.5 | 4.0 | 10.7% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 6 |
| disan.Chair 2.2.0 | 6.5 | 8.8% | 14 |
| pfvicm.Sobieski 7.2.3b | 6.7 | 9.2% | 3 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 6 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.5 | 21 / 35 | 5154 |
| 2 | 1 | 67.7 | 80.0 | 26 / 35 | 4859 |
| 3 | 1 | 69.2 | 87.9 | 22 / 35 | 4737 |
| 4 | 1 | 66.9 | 80.0 | 22 / 35 | 4597 |
| 5 | 1 | 68.6 | 83.8 | 22 / 35 | 5139 |
| 6 | 1 | 65.8 | 75.6 | 17 / 35 | 4710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 48 | 83% |
| stelo.AreaTargetingBot 1.1 | 29 | 93% |
| ntc.Opposite 1.5 | 20 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| disan.Chair 2.2.0 | 13 | 69% |
| DBall.NUKE 0.1 | 9 | 89% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 23% | 57 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 18% | 26 |
| pfvicm.Sobieski 7.2.3b | 12 | 15% | 15 |
| stelo.AreaTargetingBot 1.1 | 11 | 14% | 40 |
| ntc.Opposite 1.5 | 9 | 11% | 23 |
| disan.Chair 2.2.0 | 8 | 10% | 23 |
| DBall.NUKE 0.1 | 4 | 5% | 12 |
| donjezza.Muncho 1.0 | 4 | 5% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.6 | 73 / 210 | 3.56 | 15.6% | 26570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.7 | 15.6% | 73 |
| oog.melee.Capulet 1.2 | 2.2 | 14.9% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.5% | 21 |
| kawigi.micro.Shiz 1.1 | 3.7 | 12.8% | 31 |
| yagami.Tidus 0.11 | 5.2 | 11.3% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 9 |
| stelo.MirrorNano 1.3 | 7.5 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 66.0 | 11 / 35 | 4189 |
| 2 | 1 | 67.8 | 81.0 | 17 / 35 | 4854 |
| 3 | 1 | 64.5 | 72.7 | 12 / 35 | 4487 |
| 4 | 1 | 63.8 | 67.9 | 14 / 35 | 4300 |
| 5 | 3 | 62.7 | 67.9 | 9 / 35 | 4301 |
| 6 | 2 | 65.6 | 74.0 | 10 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 86% |
| kawigi.micro.Shiz 1.1 | 15 | 100% |
| yagami.Tidus 0.11 | 11 | 91% |
| ejb.Polaris 1.0.1 | 3 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 41% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 17% | 47 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 32 |
| yagami.Tidus 0.11 | 17 | 12% | 23 |
| ejb.Polaris 1.0.1 | 16 | 12% | 20 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.3 | 130 / 210 | 2.86 | 17.5% | 27453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.5% | 130 |
| wee.Gem 1.8.4 | 2.7 | 12.6% | 30 |
| bzdp.Pansy 2.1 | 3.2 | 11.8% | 17 |
| wompi.Quokka 1.6 | 4.0 | 11.5% | 18 |
| ratosh.Nobo 0.21 | 4.5 | 10.4% | 5 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.8 | 22 / 35 | 4684 |
| 2 | 1 | 66.5 | 79.7 | 21 / 35 | 4581 |
| 3 | 1 | 65.2 | 73.3 | 17 / 35 | 4868 |
| 4 | 1 | 67.7 | 83.5 | 25 / 35 | 4841 |
| 5 | 1 | 65.9 | 79.4 | 21 / 35 | 4477 |
| 6 | 1 | 66.5 | 82.2 | 24 / 35 | 4002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| wee.Gem 1.8.4 | 30 | 83% |
| wompi.Quokka 1.6 | 21 | 86% |
| ratosh.Nobo 0.21 | 17 | 100% |
| m3thos.Eva00 1.1 | 17 | 94% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 17 | 21% | 52 |
| wompi.Quokka 1.6 | 17 | 21% | 31 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 10 |
| maribo.FollowFire 1 | 8 | 10% | 9 |
| bzdp.Pansy 2.1 | 7 | 9% | 51 |
| m3thos.Eva00 1.1 | 7 | 9% | 19 |
| ratosh.Nobo 0.21 | 6 | 7% | 21 |
| bayen.UbaMicro 1.4 | 5 | 6% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 87.9 | 136 / 210 | 2.09 | 21.5% | 47132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.5% | 136 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 13 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.3% | 5 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.5 | 9.1% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 87.3 | 22 / 35 | 7598 |
| 2 | 1 | 73.8 | 92.1 | 25 / 35 | 8183 |
| 3 | 1 | 71.1 | 81.6 | 20 / 35 | 7309 |
| 4 | 1 | 73.9 | 91.7 | 25 / 35 | 8162 |
| 5 | 1 | 72.6 | 86.3 | 22 / 35 | 7803 |
| 6 | 1 | 73.1 | 88.3 | 22 / 35 | 8077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 86% |
| mz.NanoGod 2.02 | 23 | 74% |
| exauge.GateKeeper 1.1.121g | 7 | 86% |
| sample.SittingDuck 1.0 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 39% | 130 |
| mz.NanoGod 2.02 | 26 | 35% | 43 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 17 |
| stelo.PianistNano 1.2 | 5 | 7% | 6 |
| ayk.WallHugger 1.0 | 4 | 5% | 6 |
| drd.Dreadknoght 0.9 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 70.1 | 103 / 210 | 3.69 | 16.3% | 28852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.3% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 22 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 26 |
| bvh.micro.Freya 0.3 | 4.3 | 11.2% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.0% | 21 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 5 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 72.7 | 19 / 35 | 4563 |
| 2 | 1 | 64.8 | 69.8 | 15 / 35 | 5312 |
| 3 | 1 | 64.6 | 70.8 | 19 / 35 | 4752 |
| 4 | 1 | 61.4 | 61.9 | 15 / 35 | 4245 |
| 5 | 1 | 65.6 | 74.3 | 16 / 35 | 5139 |
| 6 | 1 | 64.4 | 71.1 | 19 / 35 | 4841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| dummy.micro.Sparrow 2.5 | 30 | 77% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 83% |
| bvh.micro.Freya 0.3 | 13 | 77% |
| ap.Frederick 1.1 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 20% | 39 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 53 |
| conscience.Electron 1.3g | 16 | 15% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 15% | 13 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 43 |
| bvh.micro.Freya 0.3 | 11 | 10% | 17 |
| dl.BetterWalls 1.0 | 8 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 83.0 | 137 / 210 | 2.53 | 20.4% | 40434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.4% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 22 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 16 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.5% | 10 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.0% | 7 |
| dsw.StaticD 1.0 | 5.7 | 9.1% | 11 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.6% | 0 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 4 |
| sample.Corners 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.7 | 25 / 35 | 6782 |
| 2 | 1 | 70.5 | 84.1 | 22 / 35 | 6739 |
| 3 | 1 | 72.4 | 90.2 | 25 / 35 | 7310 |
| 4 | 1 | 66.7 | 69.8 | 18 / 35 | 5936 |
| 5 | 1 | 72.0 | 88.9 | 26 / 35 | 7322 |
| 6 | 1 | 69.0 | 79.4 | 21 / 35 | 6345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 47 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 43 | 86% |
| supersample.SuperBoxBot 1.0 | 22 | 86% |
| dsw.StaticD 1.0 | 16 | 50% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 32% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 29% | 61 |
| dsw.StaticD 1.0 | 17 | 23% | 27 |
| sul.Lunar 1.1 | 4 | 5% | 47 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 8 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.2 | 109 / 210 | 2.96 | 17.9% | 35982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.9% | 109 |
| mld.Wisdom 1.0 | 2.3 | 13.4% | 23 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.9% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 18 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 6 |
| sample.Walls 1.0 | 7.2 | 7.7% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.1 | 17 / 35 | 5518 |
| 2 | 1 | 68.9 | 87.3 | 21 / 35 | 5640 |
| 3 | 1 | 63.5 | 68.3 | 15 / 35 | 5330 |
| 4 | 1 | 67.9 | 79.7 | 20 / 35 | 6273 |
| 5 | 1 | 69.4 | 84.8 | 20 / 35 | 6783 |
| 6 | 1 | 66.2 | 72.1 | 16 / 35 | 6438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 92% |
| mld.Wisdom 1.0 | 31 | 68% |
| radnor.DoctorBob 1.42 | 26 | 73% |
| amz.NanoClone 1.41 | 11 | 73% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 31% | 51 |
| radnor.DoctorBob 1.42 | 25 | 25% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 13% | 45 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 21 |
| amz.NanoClone 1.41 | 11 | 11% | 17 |
| jangs.ns51 1.0 | 5 | 5% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 0 | 0% | 6 |

