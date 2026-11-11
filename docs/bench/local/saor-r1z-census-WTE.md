# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.4 | 150 / 210 | 1.96 | 21.6% | 43622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 21.6% | 150 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 15 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 18 |
| mld.Infinity 2.2 | 3.7 | 13.0% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 6 |
| sample.Walls 1.0 | 6.5 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 1 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 89.5 | 26 / 35 | 7403 |
| 2 | 1 | 73.6 | 93.3 | 26 / 35 | 7838 |
| 3 | 1 | 71.5 | 87.3 | 23 / 35 | 7034 |
| 4 | 1 | 72.6 | 90.8 | 23 / 35 | 7092 |
| 5 | 1 | 73.4 | 92.1 | 30 / 35 | 6968 |
| 6 | 1 | 71.0 | 83.2 | 22 / 35 | 7287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 85 | 98% |
| mld.Infinity 2.2 | 31 | 97% |
| radnor.DoctorBob 1.42 | 27 | 70% |
| jangs.ns51 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 0% |

Hadur died in 60 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 43% | 51 |
| mz.AntiGrav 1.0 | 14 | 23% | 82 |
| mld.Infinity 2.2 | 8 | 13% | 43 |
| amz.NanoClone 1.41 | 5 | 8% | 11 |
| sample.Walls 1.0 | 3 | 5% | 9 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |
| jangs.ns51 1.0 | 1 | 2% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.0 | 129 / 210 | 2.08 | 19.1% | 33288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 19.1% | 129 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 48 |
| maribo.melee.BMV 0.1 | 3.7 | 10.4% | 1 |
| mld.DustBunny 3.8 | 4.3 | 11.9% | 15 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.0% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.5% | 5 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 2 |
| fullsail.SweetTea 1.1 | 7.8 | 6.9% | 3 |
| bzdp.BoxCar 2.0 | 8.5 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 22 / 35 | 5641 |
| 2 | 1 | 69.9 | 89.8 | 28 / 35 | 5735 |
| 3 | 1 | 68.3 | 87.3 | 23 / 35 | 5423 |
| 4 | 1 | 69.8 | 90.5 | 24 / 35 | 5705 |
| 5 | 1 | 68.3 | 87.9 | 18 / 35 | 5291 |
| 6 | 1 | 67.1 | 81.3 | 14 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 68 | 68% |
| mld.DustBunny 3.8 | 40 | 80% |
| fullsail.SweetTea 1.1 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 38% | 78 |
| mld.DustBunny 3.8 | 21 | 26% | 50 |
| maribo.melee.BMV 0.1 | 6 | 7% | 17 |
| fullsail.SweetTea 1.1 | 6 | 7% | 16 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 15 |
| zyx.nano.Ant 1.1 | 6 | 7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 17 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.9 | 127 / 210 | 2.36 | 20.0% | 37724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.0% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.2% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.8% | 21 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 8 |
| fm.mammillarias 1.3 | 5.5 | 9.3% | 5 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 2 |
| sample.Fire 1.0 | 9.5 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 86.7 | 24 / 35 | 6114 |
| 2 | 1 | 70.0 | 86.7 | 20 / 35 | 6276 |
| 3 | 1 | 70.6 | 85.1 | 20 / 35 | 6666 |
| 4 | 1 | 70.3 | 84.4 | 22 / 35 | 6381 |
| 5 | 1 | 70.3 | 86.7 | 22 / 35 | 6200 |
| 6 | 1 | 68.4 | 79.7 | 19 / 35 | 6087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 40 | 73% |
| cb.nano.Insomnia 1.0 | 24 | 96% |
| sp.Nanos.Ember 1.1 | 18 | 94% |
| myl.nano.KomoriNinja 1.1 | 15 | 73% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 29% | 46 |
| myl.micro.Troodon 1.10 | 17 | 20% | 61 |
| cb.nano.Insomnia 1.0 | 15 | 18% | 25 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 32 |
| fm.mammillarias 1.3 | 8 | 10% | 11 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 22 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 6 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.6 | 166 / 210 | 1.85 | 21.6% | 41653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 21.6% | 166 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.2% | 7 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 14 |
| tj.zombie1n 1.0.1 | 5.2 | 9.2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.6% | 1 |
| yk.JahMicro 1.0 | 6.5 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.3% | 9 |
| repositorio.NanoStep 1.0 | 9.2 | 5.8% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.7 | 25 / 35 | 7597 |
| 2 | 1 | 72.8 | 94.3 | 33 / 35 | 6769 |
| 3 | 1 | 72.4 | 90.5 | 30 / 35 | 7488 |
| 4 | 1 | 71.1 | 89.2 | 27 / 35 | 6830 |
| 5 | 1 | 70.9 | 89.8 | 27 / 35 | 6539 |
| 6 | 1 | 70.2 | 86.0 | 24 / 35 | 6430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 96% |
| stelo.SoJNanoMelee 1.1 | 52 | 92% |
| tj.zombie1n 1.0.1 | 21 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 76% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| yk.JahMicro 1.0 | 9 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 11 | 25% | 72 |
| stelo.SoJNanoMelee 1.1 | 9 | 20% | 40 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 16% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 16% | 10 |
| tvv.micro.Antares 1.1.1 | 4 | 9% | 31 |
| yk.JahMicro 1.0 | 2 | 5% | 10 |
| repositorio.NanoStep 1.0 | 2 | 5% | 9 |
| tj.zombie1n 1.0.1 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.5 | 79 / 210 | 3.83 | 15.5% | 28243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 15.5% | 79 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 35 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 11.9% | 35 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 32 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 11 |
| sam.Samspin 1.0 | 6.2 | 9.5% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.1% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 67.0 | 14 / 35 | 4423 |
| 2 | 1 | 65.9 | 77.5 | 16 / 35 | 5003 |
| 3 | 1 | 64.6 | 73.7 | 14 / 35 | 4774 |
| 4 | 1 | 60.3 | 60.0 | 11 / 35 | 4393 |
| 5 | 1 | 61.7 | 63.8 | 12 / 35 | 4734 |
| 6 | 1 | 63.4 | 69.2 | 12 / 35 | 4916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 33 | 79% |
| oog.melee.Corsair 1.0 | 28 | 46% |
| ahf.NanoAndrew .4 | 20 | 70% |
| sam.Samspin 1.0 | 14 | 100% |
| EBBU.Sim2 1.02 | 7 | 57% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 19% | 50 |
| oog.melee.Corsair 1.0 | 25 | 19% | 40 |
| robar.nano.Assertive_Melee 0.2 | 23 | 17% | 28 |
| ahf.NanoAndrew .4 | 21 | 16% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 12 |
| EBBU.Sim2 1.02 | 11 | 8% | 15 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| sam.Samspin 1.0 | 5 | 4% | 13 |
| sample.TrackFire 1.0 | 0 | 0% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.9 | 137 / 210 | 2.18 | 19.7% | 34983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 19.7% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 28 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.2% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.3% | 11 |
| fm.claire 1.7 | 6.2 | 8.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 6 |
| sample.SpinBot 1.0 | 8.2 | 7.0% | 2 |
| pa.Improved 1.0 | 8.8 | 6.2% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.9 | 23 / 35 | 5571 |
| 2 | 1 | 69.9 | 89.2 | 25 / 35 | 5737 |
| 3 | 1 | 68.3 | 82.9 | 22 / 35 | 5692 |
| 4 | 1 | 69.4 | 88.9 | 21 / 35 | 5769 |
| 5 | 1 | 71.0 | 92.1 | 25 / 35 | 6289 |
| 6 | 1 | 69.4 | 85.4 | 21 / 35 | 5925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 83% |
| oog.melee.CapuletDroid 1.1 | 39 | 100% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| gh.nano.Grofvuil 0.2 | 12 | 75% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 37% | 75 |
| arthord.NanoSatanMelee Beta | 14 | 19% | 19 |
| gh.nano.Grofvuil 0.2 | 11 | 15% | 25 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 12 |
| fm.claire 1.7 | 5 | 7% | 6 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 47 |
| kurios.DOSexe .9b | 2 | 3% | 11 |
| sample.SpinBot 1.0 | 2 | 3% | 9 |
| pa.Improved 1.0 | 2 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.1 | 106 / 210 | 2.79 | 18.2% | 35202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 18.2% | 106 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.4% | 28 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.5% | 28 |
| mz.MicroGodMelee 1 | 3.5 | 12.7% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 9.0% | 11 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.4% | 0 |
| el.JumpShoot 0.2 | 6.8 | 6.7% | 3 |
| acogdev.alpha 0.2 | 8.2 | 6.4% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.0 | 15 / 35 | 6076 |
| 2 | 1 | 67.7 | 79.7 | 15 / 35 | 6118 |
| 3 | 1 | 66.6 | 79.0 | 18 / 35 | 5480 |
| 4 | 1 | 65.9 | 76.2 | 18 / 35 | 5191 |
| 5 | 1 | 66.8 | 75.6 | 16 / 35 | 5978 |
| 6 | 1 | 71.0 | 91.1 | 24 / 35 | 6359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 88% |
| mz.MicroGodMelee 1 | 44 | 70% |
| gh.micro.Gruweltje 0.7 | 22 | 59% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 26 | 25% | 60 |
| spinnercat.micro.Tyger 0.1 | 24 | 23% | 62 |
| gh.micro.Gruweltje 0.7 | 21 | 20% | 38 |
| acogdev.alpha 0.2 | 9 | 9% | 12 |
| fire219.CatBot 1.0 | 8 | 8% | 8 |
| el.JumpShoot 0.2 | 6 | 6% | 10 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 8 |

## Melee bench: F08

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.5 | 116 / 210 | 3.38 | 16.8% | 30556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 16.8% | 116 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.8% | 37 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.3% | 30 |
| germ.TheMind .2 | 4.7 | 10.1% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.6% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.5 | 18 / 35 | 5028 |
| 2 | 1 | 68.3 | 84.4 | 23 / 35 | 5194 |
| 3 | 1 | 63.9 | 68.6 | 18 / 35 | 5137 |
| 4 | 1 | 66.9 | 79.4 | 20 / 35 | 5024 |
| 5 | 1 | 64.1 | 69.8 | 18 / 35 | 4816 |
| 6 | 1 | 65.1 | 69.5 | 19 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 89% |
| germ.TheMind .2 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 44% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 17% | 33 |
| germ.TheMind .2 | 10 | 11% | 21 |
| stelo.UntouchableNano 1.3 | 8 | 9% | 17 |
| awesomeness.Elite 1.0 | 8 | 9% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.8 | 151 / 210 | 1.92 | 20.3% | 32101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.3% | 151 |
| rz.HawkOnFire 0.1 | 2.0 | 13.3% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 11 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 2 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.0% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 8.3% | 3 |
| stelo.PatternRobot 1.0 | 7.3 | 8.2% | 11 |
| spinnercat.Omen 1.0 | 8.3 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 23 / 35 | 5335 |
| 2 | 1 | 70.8 | 88.6 | 26 / 35 | 5362 |
| 3 | 1 | 71.6 | 93.7 | 29 / 35 | 5398 |
| 4 | 1 | 69.8 | 87.9 | 23 / 35 | 5077 |
| 5 | 1 | 71.1 | 90.8 | 27 / 35 | 5281 |
| 6 | 1 | 70.9 | 89.5 | 23 / 35 | 5648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 91% |
| nz.jdc.nano.GridFu 1.0 | 40 | 95% |
| stelo.PatternRobot 1.0 | 18 | 78% |
| maribo.IotaCT 1.1 | 18 | 89% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| ratosh.Wesco 1.4 | 6 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 27% | 64 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 22 |
| ratosh.Wesco 1.4 | 10 | 17% | 19 |
| stelo.PatternRobot 1.0 | 9 | 15% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 50 |
| maribo.IotaCT 1.1 | 4 | 7% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.2 | 171 / 210 | 1.70 | 21.7% | 39832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 21.7% | 171 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 12 |
| baal.nano.N 1.42 | 3.0 | 11.2% | 5 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.3% | 0 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 12 |
| sanja.First 0.1 | 5.7 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.5% | 4 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.1% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.6 | 24 / 35 | 6403 |
| 2 | 1 | 72.6 | 95.2 | 30 / 35 | 6737 |
| 3 | 1 | 70.6 | 88.9 | 28 / 35 | 6330 |
| 4 | 1 | 71.1 | 88.9 | 26 / 35 | 6858 |
| 5 | 1 | 72.6 | 95.2 | 32 / 35 | 6750 |
| 6 | 1 | 72.4 | 96.2 | 31 / 35 | 6754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 95% |
| sanja.First 0.1 | 33 | 97% |
| cvt.Firsty 1.0 | 28 | 96% |
| baal.nano.N 1.42 | 25 | 92% |
| zyx.micro.Ant 1.1 | 23 | 83% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 36% | 38 |
| tvv.nano.Polaris 1.2 | 6 | 15% | 61 |
| baal.nano.N 1.42 | 5 | 13% | 28 |
| sanja.First 0.1 | 5 | 13% | 27 |
| cvt.Firsty 1.0 | 4 | 10% | 27 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| sample.RamFire 1.0 | 1 | 3% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.6 | 92 / 210 | 3.56 | 16.2% | 32388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.5 | 16.2% | 92 |
| kc.micro.Figment 1.0 | 1.5 | 15.8% | 70 |
| cs.Wren 1.0 | 3.0 | 12.8% | 17 |
| mz.Cork 0.1 | 4.3 | 10.7% | 10 |
| js.PinBall 1.6 | 4.7 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 8.4% | 1 |
| evd.X1 0.01 | 6.7 | 8.3% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.1 | 17 / 35 | 5522 |
| 2 | 2 | 63.3 | 68.6 | 11 / 35 | 5366 |
| 3 | 1 | 62.9 | 67.0 | 16 / 35 | 4807 |
| 4 | 2 | 66.4 | 76.8 | 17 / 35 | 5751 |
| 5 | 2 | 62.6 | 64.8 | 12 / 35 | 5398 |
| 6 | 1 | 65.7 | 74.3 | 19 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 69% |
| cs.Wren 1.0 | 30 | 90% |
| mz.Cork 0.1 | 8 | 100% |
| js.PinBall 1.6 | 7 | 86% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 41% | 101 |
| cs.Wren 1.0 | 23 | 19% | 39 |
| js.PinBall 1.6 | 13 | 11% | 19 |
| evd.X1 0.01 | 13 | 11% | 13 |
| mz.Cork 0.1 | 8 | 7% | 17 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| joe.ADinosaur 1.0 | 6 | 5% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.8 | 147 / 210 | 2.46 | 19.3% | 30484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 19.3% | 147 |
| myl.nano.Graviton 1.10 | 3.2 | 11.3% | 19 |
| ntc.Opposite 1.5 | 3.5 | 10.9% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.5% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 4 |
| DBall.NUKE 0.1 | 7.3 | 8.4% | 3 |
| disan.Chair 2.2.0 | 7.7 | 8.3% | 7 |
| donjezza.Muncho 1.0 | 9.3 | 5.6% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.9 | 22 / 35 | 5430 |
| 2 | 1 | 69.6 | 85.4 | 24 / 35 | 5213 |
| 3 | 1 | 67.2 | 79.7 | 21 / 35 | 4892 |
| 4 | 1 | 69.2 | 87.3 | 27 / 35 | 4911 |
| 5 | 1 | 68.3 | 81.0 | 25 / 35 | 5043 |
| 6 | 1 | 69.4 | 86.3 | 28 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ntc.Opposite 1.5 | 31 | 94% |
| stelo.AreaTargetingBot 1.1 | 31 | 97% |
| myl.nano.Graviton 1.10 | 28 | 93% |
| DBall.NUKE 0.1 | 16 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| disan.Chair 2.2.0 | 14 | 86% |
| donjezza.Muncho 1.0 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 31% | 29 |
| stelo.AreaTargetingBot 1.1 | 14 | 22% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 15% | 22 |
| myl.nano.Graviton 1.10 | 7 | 11% | 36 |
| ntc.Opposite 1.5 | 7 | 11% | 33 |
| disan.Chair 2.2.0 | 4 | 6% | 18 |
| DBall.NUKE 0.1 | 2 | 3% | 17 |
| pbg.R2D2 1.0 | 1 | 2% | 7 |
| donjezza.Muncho 1.0 | 0 | 0% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.2 | 74 / 210 | 3.69 | 15.3% | 26596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.3 | 15.3% | 74 |
| oog.melee.Capulet 1.2 | 1.8 | 14.6% | 61 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 20 |
| yagami.Tidus 0.11 | 5.0 | 11.6% | 7 |
| ejb.Polaris 1.0.1 | 6.0 | 11.0% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.2% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 72.7 | 13 / 35 | 4219 |
| 2 | 1 | 62.4 | 65.4 | 13 / 35 | 4056 |
| 3 | 2 | 63.3 | 68.6 | 12 / 35 | 4417 |
| 4 | 1 | 64.4 | 72.1 | 11 / 35 | 4419 |
| 5 | 2 | 63.7 | 67.3 | 9 / 35 | 4627 |
| 6 | 1 | 65.7 | 74.9 | 16 / 35 | 4858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 49% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 78% |
| ejb.Polaris 1.0.1 | 8 | 75% |
| yagami.Tidus 0.11 | 7 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 43% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 17% | 41 |
| yagami.Tidus 0.11 | 18 | 13% | 26 |
| kawigi.micro.Shiz 1.1 | 14 | 10% | 31 |
| ejb.Polaris 1.0.1 | 14 | 10% | 23 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.8 | 118 / 210 | 3.09 | 17.2% | 28778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 17.2% | 118 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 18 |
| wee.Gem 1.8.4 | 3.2 | 11.6% | 27 |
| wompi.Quokka 1.6 | 3.3 | 11.6% | 24 |
| ratosh.Nobo 0.21 | 4.8 | 11.0% | 10 |
| bayen.UbaMicro 1.4 | 6.0 | 9.4% | 3 |
| m3thos.Eva00 1.1 | 6.5 | 9.5% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.3 | 19 / 35 | 4664 |
| 2 | 1 | 66.1 | 77.5 | 21 / 35 | 4897 |
| 3 | 1 | 65.6 | 76.5 | 17 / 35 | 5080 |
| 4 | 1 | 64.4 | 73.7 | 18 / 35 | 4474 |
| 5 | 1 | 67.7 | 83.8 | 23 / 35 | 4901 |
| 6 | 1 | 65.5 | 75.9 | 20 / 35 | 4762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 95% |
| wee.Gem 1.8.4 | 32 | 100% |
| wompi.Quokka 1.6 | 21 | 71% |
| ratosh.Nobo 0.21 | 15 | 73% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |

Hadur died in 92 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 17 | 18% | 18 |
| wee.Gem 1.8.4 | 13 | 14% | 51 |
| bzdp.Pansy 2.1 | 13 | 14% | 47 |
| wompi.Quokka 1.6 | 12 | 13% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 13 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 10 |
| m3thos.Eva00 1.1 | 7 | 8% | 11 |
| ratosh.Nobo 0.21 | 6 | 7% | 20 |
| bayen.UbaMicro 1.4 | 6 | 7% | 13 |

## Melee bench: F15

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.2 | 117 / 210 | 2.33 | 20.5% | 44956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.2 | 20.5% | 117 |
| wompi.Wallaby 5.1 | 1.8 | 18.0% | 67 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 22 |
| ayk.WallHugger 1.0 | 4.2 | 10.2% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 86.3 | 22 / 35 | 7346 |
| 2 | 1 | 71.3 | 82.2 | 21 / 35 | 7323 |
| 3 | 1 | 72.8 | 90.5 | 19 / 35 | 7883 |
| 4 | 1 | 72.0 | 85.7 | 18 / 35 | 7668 |
| 5 | 2 | 70.2 | 79.4 | 15 / 35 | 7215 |
| 6 | 1 | 71.9 | 87.0 | 22 / 35 | 7521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 73% |
| mz.NanoGod 2.02 | 21 | 57% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| ayk.WallHugger 1.0 | 11 | 91% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 48% | 121 |
| mz.NanoGod 2.02 | 24 | 26% | 41 |
| ayk.WallHugger 1.0 | 13 | 14% | 19 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 16 |
| stuff.Vlad 0.1 | 3 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.6 | 100 / 210 | 3.74 | 16.1% | 29157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 16.1% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 27 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 20 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.1% | 21 |
| stelo.MirrorMicro 1.0 | 5.3 | 9.7% | 4 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.9% | 7 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.4 | 19 / 35 | 4650 |
| 2 | 1 | 64.0 | 69.5 | 17 / 35 | 4877 |
| 3 | 1 | 63.0 | 67.3 | 16 / 35 | 4846 |
| 4 | 1 | 65.3 | 72.7 | 19 / 35 | 5086 |
| 5 | 1 | 64.2 | 69.8 | 18 / 35 | 4891 |
| 6 | 1 | 60.6 | 59.7 | 11 / 35 | 4807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 87% |
| dummy.micro.Sparrow 2.5 | 23 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 72% |
| bvh.micro.Freya 0.3 | 14 | 86% |
| stelo.MirrorMicro 1.0 | 11 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 33% |

Hadur died in 110 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 18% | 18 |
| conscience.Electron 1.3g | 18 | 16% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 33 |
| voidious.micro.BlitzBat 1.05 | 13 | 12% | 44 |
| dl.BetterWalls 1.0 | 13 | 12% | 17 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 38 |
| bvh.micro.Freya 0.3 | 12 | 11% | 19 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 17 |

## Melee bench: F17

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.0 | 147 / 210 | 2.26 | 20.9% | 41397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.9% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 15 |
| sul.Lunar 1.1 | 3.5 | 11.1% | 14 |
| supersample.SuperBoxBot 1.0 | 3.5 | 10.8% | 9 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 6 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 11 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.3% | 6 |
| sample.Corners 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 89.8 | 26 / 35 | 7576 |
| 2 | 1 | 69.3 | 79.7 | 19 / 35 | 6788 |
| 3 | 1 | 72.0 | 87.9 | 26 / 35 | 6971 |
| 4 | 1 | 70.0 | 83.5 | 24 / 35 | 6581 |
| 5 | 1 | 72.6 | 93.0 | 29 / 35 | 6898 |
| 6 | 1 | 69.7 | 82.2 | 23 / 35 | 6583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 49 | 92% |
| supersample.SuperBoxBot 1.0 | 28 | 93% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| dsw.StaticD 1.0 | 9 | 22% |
| mme.NikeEnhanced 2.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 25% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 22% | 61 |
| dsw.StaticD 1.0 | 10 | 16% | 16 |
| mme.NikeEnhanced 2.0 | 8 | 13% | 20 |
| sul.Lunar 1.1 | 5 | 8% | 50 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 10 |
| sample.Corners 1.0 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.3 | 107 / 210 | 3.31 | 17.2% | 35408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 17.2% | 107 |
| mld.Wisdom 1.0 | 2.3 | 13.3% | 30 |
| radnor.DoctorBob 1.42 | 2.8 | 13.5% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.2% | 18 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.2% | 8 |
| amz.NanoClone 1.41 | 5.7 | 9.7% | 9 |
| GarmBox.Oranges 1.0 | 7.5 | 7.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.3% | 4 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 67.3 | 14 / 35 | 5852 |
| 2 | 1 | 67.8 | 81.3 | 19 / 35 | 6007 |
| 3 | 1 | 64.1 | 68.6 | 16 / 35 | 5429 |
| 4 | 1 | 68.8 | 83.5 | 20 / 35 | 6332 |
| 5 | 1 | 67.5 | 79.4 | 21 / 35 | 6015 |
| 6 | 1 | 63.8 | 65.7 | 17 / 35 | 5773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 95% |
| radnor.DoctorBob 1.42 | 28 | 82% |
| mld.Wisdom 1.0 | 23 | 78% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 31% | 48 |
| radnor.DoctorBob 1.42 | 19 | 18% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 56 |
| KiraNL.Chupacabra 0.4 | 14 | 14% | 28 |
| amz.NanoClone 1.41 | 10 | 10% | 10 |
| jangs.ns51 1.0 | 5 | 5% | 10 |
| sample.Walls 1.0 | 5 | 5% | 8 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

