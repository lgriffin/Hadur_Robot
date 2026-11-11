# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 89.3 | 131 / 210 | 1.97 | 20.8% | 41584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 20.8% | 131 |
| radnor.DoctorBob 1.42 | 2.5 | 14.4% | 28 |
| mz.AntiGrav 1.0 | 2.7 | 14.3% | 24 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 6 |
| sample.Walls 1.0 | 6.7 | 7.1% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.6 | 22 / 35 | 7368 |
| 2 | 1 | 72.6 | 93.3 | 23 / 35 | 7094 |
| 3 | 1 | 71.9 | 89.2 | 22 / 35 | 6836 |
| 4 | 1 | 70.6 | 85.7 | 22 / 35 | 6638 |
| 5 | 1 | 72.3 | 92.4 | 25 / 35 | 7096 |
| 6 | 1 | 70.2 | 86.3 | 17 / 35 | 6552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 80% |
| radnor.DoctorBob 1.42 | 49 | 63% |
| mld.Infinity 2.2 | 39 | 90% |
| amz.NanoClone 1.41 | 9 | 67% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 50% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 37% | 60 |
| mz.AntiGrav 1.0 | 26 | 33% | 72 |
| amz.NanoClone 1.41 | 10 | 13% | 16 |
| mld.Infinity 2.2 | 7 | 9% | 30 |
| jangs.ns51 1.0 | 3 | 4% | 11 |
| sample.Walls 1.0 | 2 | 3% | 14 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.0 | 110 / 210 | 2.44 | 17.6% | 28181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 17.6% | 110 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 50 |
| mld.DustBunny 3.8 | 2.7 | 13.7% | 28 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 2 |
| zyx.nano.Ant 1.1 | 5.5 | 9.2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.7% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.0% | 5 |
| fullsail.SweetTea 1.1 | 7.8 | 6.9% | 5 |
| bzdp.BoxCar 2.0 | 9.0 | 5.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 18 / 35 | 4863 |
| 2 | 1 | 68.1 | 88.3 | 21 / 35 | 4822 |
| 3 | 1 | 67.3 | 85.1 | 21 / 35 | 4808 |
| 4 | 1 | 65.1 | 79.0 | 16 / 35 | 4369 |
| 5 | 1 | 68.1 | 88.6 | 20 / 35 | 4959 |
| 6 | 1 | 63.8 | 75.2 | 14 / 35 | 4360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 72% |
| mld.DustBunny 3.8 | 46 | 61% |
| djdjdj.NanoSkunk10 1.0 | 11 | 91% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| zyx.nano.Ant 1.1 | 10 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| fullsail.SweetTea 1.1 | 8 | 88% |

Hadur died in 100 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 39 | 39% | 70 |
| oog.melee.Mercutio 1.0 | 22 | 22% | 62 |
| zyx.nano.Ant 1.1 | 16 | 16% | 20 |
| fullsail.SweetTea 1.1 | 7 | 7% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 13 |
| maribo.melee.BMV 0.1 | 5 | 5% | 14 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 11 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 76.2 | 103 / 210 | 3.14 | 17.6% | 33263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 17.6% | 103 |
| myl.micro.Troodon 1.10 | 2.0 | 15.4% | 61 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.0% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.7% | 14 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.6% | 7 |
| fm.mammillarias 1.3 | 5.5 | 9.4% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.1% | 4 |
| sample.Fire 1.0 | 9.2 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.2 | 18 / 35 | 5591 |
| 2 | 1 | 65.6 | 72.7 | 15 / 35 | 5488 |
| 3 | 1 | 67.1 | 76.2 | 18 / 35 | 5828 |
| 4 | 1 | 68.5 | 81.3 | 21 / 35 | 5679 |
| 5 | 1 | 65.6 | 73.0 | 15 / 35 | 5380 |
| 6 | 1 | 65.3 | 72.1 | 16 / 35 | 5297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 88% |
| myl.nano.KomoriNinja 1.1 | 24 | 75% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 83% |
| cb.nano.Insomnia 1.0 | 8 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 32 | 30% | 43 |
| myl.micro.Troodon 1.10 | 26 | 24% | 68 |
| fm.mammillarias 1.3 | 15 | 14% | 18 |
| myl.nano.KomoriNinja 1.1 | 11 | 10% | 35 |
| cb.nano.Insomnia 1.0 | 10 | 9% | 11 |
| sample.Fire 1.0 | 5 | 5% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 11 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 10 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.6 | 120 / 210 | 2.30 | 19.5% | 37063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 19.5% | 120 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 28 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 18 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 10.1% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 0 |
| tj.zombie1n 1.0.1 | 5.3 | 9.4% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.6% | 6 |
| yk.JahMicro 1.0 | 7.7 | 7.3% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.5 | 25 / 35 | 6952 |
| 2 | 1 | 68.0 | 80.0 | 21 / 35 | 5951 |
| 3 | 1 | 69.9 | 88.9 | 21 / 35 | 6207 |
| 4 | 1 | 69.5 | 87.3 | 22 / 35 | 6098 |
| 5 | 1 | 66.8 | 81.3 | 14 / 35 | 5636 |
| 6 | 1 | 68.6 | 85.4 | 17 / 35 | 6219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 75% |
| stelo.SoJNanoMelee 1.1 | 41 | 78% |
| tvv.micro.Antares 1.1.1 | 16 | 81% |
| tj.zombie1n 1.0.1 | 15 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 92% |
| yk.JahMicro 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 37% | 86 |
| stelo.SoJNanoMelee 1.1 | 24 | 26% | 46 |
| tj.zombie1n 1.0.1 | 9 | 10% | 13 |
| tvv.micro.Antares 1.1.1 | 8 | 9% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 17 |
| yk.JahMicro 1.0 | 4 | 4% | 7 |
| sample.VelociRobot 1.0 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 13 |

## Melee bench: F05

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 67.0 | 77 / 210 | 3.97 | 15.2% | 28502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 15.2% | 77 |
| oog.melee.Corsair 1.0 | 2.7 | 12.3% | 35 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 31 |
| sam.Samspin 1.0 | 5.0 | 10.2% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.5% | 22 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.2% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 73.7 | 16 / 35 | 4579 |
| 2 | 1 | 65.0 | 74.3 | 15 / 35 | 5313 |
| 3 | 1 | 62.3 | 67.6 | 13 / 35 | 4700 |
| 4 | 1 | 61.6 | 62.2 | 13 / 35 | 4863 |
| 5 | 1 | 59.4 | 59.4 | 10 / 35 | 4631 |
| 6 | 1 | 60.9 | 64.8 | 10 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 88% |
| oog.melee.Corsair 1.0 | 23 | 74% |
| ahf.NanoAndrew .4 | 20 | 60% |
| EBBU.Sim2 1.02 | 12 | 83% |
| sam.Samspin 1.0 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 25 | 19% | 34 |
| ahf.NanoAndrew .4 | 21 | 16% | 33 |
| oog.melee.Corsair 1.0 | 17 | 13% | 32 |
| robar.nano.Assertive_Melee 0.2 | 16 | 12% | 17 |
| zyx.nano.BacillusComma 1.0 | 15 | 11% | 19 |
| sam.Samspin 1.0 | 13 | 10% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 9% | 12 |
| simonton.nano.MeleeSeed 1.8 | 9 | 7% | 33 |
| sample.TrackFire 1.0 | 6 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.0 | 115 / 210 | 2.53 | 18.3% | 31605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 18.3% | 115 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.5% | 38 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.2% | 19 |
| fm.claire 1.7 | 5.8 | 9.1% | 7 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.8% | 7 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.3% | 6 |
| sample.SpinBot 1.0 | 7.2 | 7.7% | 5 |
| pa.Improved 1.0 | 9.2 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 16 / 35 | 5137 |
| 2 | 1 | 67.2 | 81.3 | 19 / 35 | 5117 |
| 3 | 1 | 67.3 | 80.6 | 21 / 35 | 5376 |
| 4 | 1 | 66.1 | 76.5 | 18 / 35 | 5291 |
| 5 | 1 | 68.9 | 87.6 | 22 / 35 | 5248 |
| 6 | 1 | 68.3 | 86.3 | 19 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 64 | 66% |
| oog.melee.CapuletDroid 1.1 | 29 | 90% |
| gh.nano.Grofvuil 0.2 | 24 | 88% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 67% |
| kurios.DOSexe .9b | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 36% | 82 |
| oog.melee.CapuletDroid 1.1 | 14 | 15% | 35 |
| fm.claire 1.7 | 12 | 13% | 13 |
| gh.nano.Grofvuil 0.2 | 10 | 10% | 34 |
| sample.SpinBot 1.0 | 10 | 10% | 15 |
| arthord.NanoSatanMelee Beta | 7 | 7% | 12 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 13 |
| kurios.DOSexe .9b | 3 | 3% | 3 |
| pa.Improved 1.0 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.9 | 72 / 210 | 2.99 | 16.6% | 30350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.2 | 16.6% | 72 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.1% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.0% | 40 |
| mz.MicroGodMelee 1 | 3.7 | 13.3% | 41 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 2 |
| fire219.CatBot 1.0 | 8.5 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.5 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.4 | 14 / 35 | 4692 |
| 2 | 1 | 66.9 | 82.9 | 15 / 35 | 4989 |
| 3 | 1 | 66.5 | 82.5 | 12 / 35 | 5229 |
| 4 | 1 | 66.4 | 79.4 | 13 / 35 | 5452 |
| 5 | 2 | 62.0 | 67.0 | 7 / 35 | 4837 |
| 6 | 1 | 65.0 | 76.5 | 11 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 59% |
| mz.MicroGodMelee 1 | 41 | 49% |
| gh.micro.Gruweltje 0.7 | 26 | 54% |
| DBall.Anarchy 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 50% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 30% | 58 |
| mz.MicroGodMelee 1 | 31 | 22% | 51 |
| gh.micro.Gruweltje 0.7 | 28 | 20% | 48 |
| caimano.Furia_Ceca 0.22 | 17 | 12% | 20 |
| mbro.Detektor3 0.1.1 | 6 | 4% | 8 |
| acogdev.alpha 0.2 | 5 | 4% | 5 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 3 | 2% | 11 |
| el.JumpShoot 0.2 | 2 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.3 | 83 / 210 | 3.86 | 15.4% | 29885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.4% | 58 |
| hadur117.micro.SaorCG 0.1 | 1.8 | 15.4% | 83 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.4% | 27 |
| germ.TheMind .2 | 5.2 | 9.5% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.5% | 9 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.7% | 2 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.4% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.6 | 12 / 35 | 5086 |
| 2 | 2 | 62.4 | 67.0 | 13 / 35 | 4801 |
| 3 | 2 | 61.8 | 65.1 | 11 / 35 | 4871 |
| 4 | 3 | 59.9 | 60.6 | 11 / 35 | 4509 |
| 5 | 1 | 64.5 | 70.5 | 18 / 35 | 5411 |
| 6 | 1 | 66.7 | 78.7 | 18 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 57% |
| qualidafial.MajorDick 1.0.1 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 10 | 70% |
| germ.TheMind .2 | 8 | 88% |
| awesomeness.Elite 1.0 | 5 | 60% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 37% | 85 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 17% | 35 |
| germ.TheMind .2 | 13 | 10% | 23 |
| stelo.UntouchableNano 1.3 | 13 | 10% | 19 |
| awesomeness.Elite 1.0 | 11 | 9% | 12 |
| qualidafial.MajorDick 1.0.1 | 9 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 10 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.1 | 117 / 210 | 2.61 | 17.9% | 27614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 17.9% | 117 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 24 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.7% | 23 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 8 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.4% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 8.4% | 8 |
| spinnercat.Omen 1.0 | 7.7 | 8.3% | 6 |
| ratosh.Wesco 1.4 | 8.2 | 8.1% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.7 | 22 / 35 | 4573 |
| 2 | 1 | 67.4 | 80.3 | 21 / 35 | 4753 |
| 3 | 1 | 68.4 | 84.8 | 20 / 35 | 4556 |
| 4 | 1 | 67.3 | 76.8 | 20 / 35 | 4848 |
| 5 | 1 | 66.9 | 84.4 | 18 / 35 | 4153 |
| 6 | 1 | 66.5 | 80.3 | 16 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 67 | 85% |
| nz.jdc.nano.GridFu 1.0 | 34 | 85% |
| timmit.nano.TimDog 0.33 | 17 | 41% |
| stelo.PatternRobot 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| maribo.IotaCT 1.1 | 6 | 83% |
| spinnercat.Omen 1.0 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 19 | 20% | 28 |
| rz.HawkOnFire 0.1 | 18 | 19% | 56 |
| ratosh.Wesco 1.4 | 16 | 17% | 19 |
| stelo.PatternRobot 1.0 | 14 | 15% | 22 |
| nz.jdc.nano.GridFu 1.0 | 11 | 12% | 47 |
| maribo.IotaCT 1.1 | 7 | 7% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 4% | 7 |
| spinnercat.Omen 1.0 | 3 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.1 | 142 / 210 | 2.07 | 20.1% | 36996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 20.1% | 142 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 25 |
| baal.nano.N 1.42 | 3.3 | 11.1% | 4 |
| zyx.micro.Ant 1.1 | 3.7 | 10.6% | 22 |
| Grystrion.TrackerWO 1.0 | 5.5 | 9.1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.5% | 2 |
| cvt.Firsty 1.0 | 7.0 | 7.9% | 6 |
| sanja.First 0.1 | 7.0 | 8.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.4% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 23 / 35 | 6117 |
| 2 | 1 | 72.1 | 96.8 | 30 / 35 | 6409 |
| 3 | 1 | 69.3 | 86.7 | 24 / 35 | 6086 |
| 4 | 1 | 69.6 | 87.6 | 22 / 35 | 6293 |
| 5 | 1 | 68.2 | 85.7 | 19 / 35 | 5830 |
| 6 | 1 | 69.2 | 84.1 | 24 / 35 | 6261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 88% |
| cvt.Firsty 1.0 | 33 | 91% |
| baal.nano.N 1.42 | 30 | 93% |
| zyx.micro.Ant 1.1 | 19 | 63% |
| sanja.First 0.1 | 14 | 93% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 38 | 54% | 61 |
| tvv.nano.Polaris 1.2 | 10 | 14% | 42 |
| cvt.Firsty 1.0 | 7 | 10% | 28 |
| sanja.First 0.1 | 5 | 7% | 20 |
| Grystrion.TrackerWO 1.0 | 4 | 6% | 11 |
| baal.nano.N 1.42 | 3 | 4% | 32 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 9 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 4 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 62.5 | 68 / 210 | 4.37 | 14.0% | 27413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.6% | 70 |
| hadur117.micro.SaorCG 0.1 | 2.2 | 14.0% | 68 |
| cs.Wren 1.0 | 3.0 | 13.1% | 26 |
| mz.Cork 0.1 | 4.0 | 11.4% | 16 |
| js.PinBall 1.6 | 4.5 | 11.2% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 3 |
| evd.X1 0.01 | 6.8 | 8.3% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 8 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 54.3 | 6 / 35 | 4453 |
| 2 | 2 | 58.7 | 60.0 | 8 / 35 | 4213 |
| 3 | 4 | 56.7 | 53.3 | 10 / 35 | 4018 |
| 4 | 2 | 62.9 | 67.9 | 12 / 35 | 4950 |
| 5 | 1 | 64.4 | 73.3 | 17 / 35 | 4791 |
| 6 | 1 | 62.8 | 66.3 | 15 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 64% |
| cs.Wren 1.0 | 18 | 83% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 31% | 79 |
| cs.Wren 1.0 | 27 | 19% | 40 |
| evd.X1 0.01 | 23 | 16% | 22 |
| js.PinBall 1.6 | 15 | 10% | 19 |
| joe.ADinosaur 1.0 | 13 | 9% | 17 |
| mz.Cork 0.1 | 8 | 6% | 14 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| donjezza.Jezza 1.0 | 5 | 3% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.9 | 97 / 210 | 2.90 | 17.3% | 27812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 17.3% | 97 |
| myl.nano.Graviton 1.10 | 2.8 | 11.6% | 26 |
| ntc.Opposite 1.5 | 3.0 | 11.5% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.2% | 2 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.8% | 7 |
| disan.Chair 2.2.0 | 6.7 | 9.4% | 16 |
| DBall.NUKE 0.1 | 7.7 | 8.5% | 8 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 12 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.3 | 17 / 35 | 4719 |
| 2 | 1 | 64.6 | 77.8 | 13 / 35 | 4273 |
| 3 | 1 | 64.6 | 75.6 | 15 / 35 | 4697 |
| 4 | 1 | 65.2 | 75.9 | 18 / 35 | 4470 |
| 5 | 1 | 66.2 | 80.3 | 17 / 35 | 4785 |
| 6 | 1 | 67.3 | 83.5 | 17 / 35 | 4868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 41 | 73% |
| myl.nano.Graviton 1.10 | 28 | 71% |
| disan.Chair 2.2.0 | 13 | 77% |
| ntc.Opposite 1.5 | 13 | 62% |
| donjezza.Muncho 1.0 | 10 | 70% |
| DBall.NUKE 0.1 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 4 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 23 | 20% | 40 |
| myl.nano.Graviton 1.10 | 22 | 19% | 47 |
| pfvicm.Sobieski 7.2.3b | 18 | 16% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 16% | 23 |
| ntc.Opposite 1.5 | 17 | 15% | 25 |
| donjezza.Muncho 1.0 | 7 | 6% | 13 |
| disan.Chair 2.2.0 | 5 | 4% | 10 |
| DBall.NUKE 0.1 | 3 | 3% | 15 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 67.8 | 53 / 210 | 3.90 | 14.2% | 24041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.8 | 14.2% | 53 |
| kawigi.micro.Shiz 1.1 | 2.0 | 15.2% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 30 |
| oog.melee.Capulet 1.2 | 3.5 | 13.5% | 41 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 56.2 | 6 / 35 | 3969 |
| 2 | 1 | 64.0 | 71.1 | 13 / 35 | 4175 |
| 3 | 1 | 63.8 | 72.7 | 11 / 35 | 4137 |
| 4 | 1 | 63.1 | 72.7 | 8 / 35 | 4043 |
| 5 | 3 | 62.2 | 69.2 | 6 / 35 | 3737 |
| 6 | 1 | 60.7 | 65.1 | 9 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 27 | 81% |
| oog.melee.Capulet 1.2 | 17 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 77% |
| yagami.Tidus 0.11 | 12 | 58% |
| ejb.Polaris 1.0.1 | 4 | 50% |

Hadur died in 157 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 26% | 54 |
| yagami.Tidus 0.11 | 40 | 25% | 47 |
| kawigi.micro.Shiz 1.1 | 26 | 17% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 13% | 31 |
| ejb.Polaris 1.0.1 | 10 | 6% | 13 |
| kurios.DOSexe .9a | 9 | 6% | 9 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.1 | 107 / 210 | 3.33 | 16.1% | 25778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 16.1% | 107 |
| bzdp.Pansy 2.1 | 2.7 | 12.9% | 21 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 32 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 22 |
| ratosh.Nobo 0.21 | 4.5 | 11.2% | 10 |
| m3thos.Eva00 1.1 | 6.3 | 9.0% | 11 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 75.6 | 17 / 35 | 4303 |
| 2 | 1 | 64.8 | 78.4 | 19 / 35 | 4294 |
| 3 | 1 | 64.2 | 72.7 | 18 / 35 | 4420 |
| 4 | 1 | 62.8 | 70.2 | 18 / 35 | 3912 |
| 5 | 1 | 63.2 | 70.2 | 15 / 35 | 4536 |
| 6 | 1 | 65.5 | 77.8 | 20 / 35 | 4313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 84% |
| wee.Gem 1.8.4 | 28 | 89% |
| wompi.Quokka 1.6 | 20 | 85% |
| ratosh.Nobo 0.21 | 16 | 81% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| m3thos.Eva00 1.1 | 6 | 33% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 17 | 16% | 17 |
| bzdp.Pansy 2.1 | 15 | 14% | 55 |
| wee.Gem 1.8.4 | 13 | 13% | 40 |
| ratosh.Nobo 0.21 | 13 | 13% | 25 |
| bayen.UbaMicro 1.4 | 11 | 11% | 17 |
| m3thos.Eva00 1.1 | 11 | 11% | 15 |
| wompi.Quokka 1.6 | 9 | 9% | 22 |
| stelo.MyAgileRobot 0.2 | 9 | 9% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 91.0 | 145 / 210 | 1.81 | 21.8% | 45524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 21.8% | 145 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 49 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 12 |
| ayk.WallHugger 1.0 | 4.8 | 9.2% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 90.2 | 25 / 35 | 7845 |
| 2 | 1 | 71.3 | 85.7 | 21 / 35 | 7122 |
| 3 | 1 | 75.1 | 97.8 | 30 / 35 | 8233 |
| 4 | 1 | 71.0 | 86.7 | 18 / 35 | 7056 |
| 5 | 1 | 73.4 | 91.7 | 26 / 35 | 7641 |
| 6 | 1 | 73.4 | 94.0 | 25 / 35 | 7627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 84% |
| mz.NanoGod 2.02 | 20 | 60% |
| exauge.GateKeeper 1.1.121g | 14 | 86% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 45% | 135 |
| mz.NanoGod 2.02 | 21 | 32% | 38 |
| exauge.GateKeeper 1.1.121g | 8 | 12% | 15 |
| ayk.WallHugger 1.0 | 5 | 8% | 10 |
| drd.Dreadknoght 0.9 | 1 | 2% | 7 |
| stelo.PianistNano 1.2 | 1 | 2% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 75.3 | 100 / 210 | 3.22 | 16.7% | 28521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 16.7% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 34 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.2% | 21 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.0% | 25 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.3% | 11 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.0% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 66.7 | 14 / 35 | 4417 |
| 2 | 1 | 64.9 | 76.5 | 17 / 35 | 4370 |
| 3 | 1 | 67.8 | 83.8 | 19 / 35 | 5237 |
| 4 | 1 | 66.6 | 80.6 | 20 / 35 | 4841 |
| 5 | 1 | 67.4 | 82.9 | 20 / 35 | 5034 |
| 6 | 1 | 60.6 | 61.3 | 10 / 35 | 4622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 76% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 75% |
| bvh.micro.Freya 0.3 | 20 | 95% |
| dummy.micro.Sparrow 2.5 | 18 | 89% |
| stelo.MirrorMicro 1.0 | 9 | 67% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 30% | 64 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 15 |
| dummy.micro.Sparrow 2.5 | 14 | 13% | 34 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 27 |
| conscience.Electron 1.3g | 12 | 11% | 14 |
| dl.BetterWalls 1.0 | 9 | 8% | 17 |
| bvh.micro.Freya 0.3 | 8 | 7% | 22 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 85.8 | 113 / 210 | 2.28 | 20.0% | 39771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 20.0% | 113 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 30 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.6% | 25 |
| sul.Lunar 1.1 | 3.7 | 11.6% | 17 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.8% | 11 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 3 |
| sample.Corners 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.6 | 20 / 35 | 7071 |
| 2 | 1 | 70.5 | 87.3 | 22 / 35 | 6653 |
| 3 | 1 | 66.9 | 76.2 | 14 / 35 | 5813 |
| 4 | 1 | 70.0 | 88.9 | 17 / 35 | 6474 |
| 5 | 1 | 69.8 | 85.4 | 19 / 35 | 6758 |
| 6 | 1 | 71.3 | 89.5 | 21 / 35 | 7002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 57 | 79% |
| sul.Lunar 1.1 | 36 | 86% |
| supersample.SuperBoxBot 1.0 | 21 | 81% |
| dsw.StaticD 1.0 | 8 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 67% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 50% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 37 | 38% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 20% | 65 |
| mme.NikeEnhanced 2.0 | 16 | 16% | 21 |
| dsw.StaticD 1.0 | 8 | 8% | 14 |
| sul.Lunar 1.1 | 7 | 7% | 40 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 9 |
| sample.Corners 1.0 | 2 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorCG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.3 | 88 / 210 | 3.13 | 17.1% | 35247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCG 0.1 | 1.0 | 17.1% | 88 |
| radnor.DoctorBob 1.42 | 2.8 | 13.2% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.5% | 36 |
| mld.Wisdom 1.0 | 3.7 | 11.9% | 21 |
| KiraNL.Chupacabra 0.4 | 5.0 | 9.9% | 11 |
| amz.NanoClone 1.41 | 5.3 | 9.5% | 12 |
| sample.Walls 1.0 | 7.3 | 8.0% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.8% | 5 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 72.4 | 10 / 35 | 5636 |
| 2 | 1 | 66.9 | 77.8 | 15 / 35 | 6289 |
| 3 | 1 | 67.0 | 78.7 | 16 / 35 | 6174 |
| 4 | 1 | 67.0 | 81.6 | 16 / 35 | 5999 |
| 5 | 1 | 62.6 | 67.6 | 12 / 35 | 5363 |
| 6 | 1 | 67.4 | 80.0 | 19 / 35 | 5786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 76% |
| radnor.DoctorBob 1.42 | 30 | 63% |
| mld.Wisdom 1.0 | 21 | 67% |
| amz.NanoClone 1.41 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| jangs.ns51 1.0 | 3 | 33% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 27% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 16% | 49 |
| radnor.DoctorBob 1.42 | 20 | 16% | 42 |
| amz.NanoClone 1.41 | 15 | 12% | 24 |
| KiraNL.Chupacabra 0.4 | 15 | 12% | 19 |
| GarmBox.Oranges 1.0 | 8 | 7% | 8 |
| sample.Walls 1.0 | 7 | 6% | 13 |
| jangs.ns51 1.0 | 4 | 3% | 9 |

