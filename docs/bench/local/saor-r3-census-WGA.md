# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 92.0 | 152 / 210 | 1.72 | 22.2% | 44882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.2% | 152 |
| radnor.DoctorBob 1.42 | 2.5 | 14.3% | 27 |
| mz.AntiGrav 1.0 | 3.2 | 13.8% | 12 |
| mld.Infinity 2.2 | 3.3 | 12.8% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| GarmBox.Oranges 1.0 | 6.5 | 6.7% | 0 |
| sample.Walls 1.0 | 7.3 | 6.1% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 93.7 | 27 / 35 | 7498 |
| 2 | 1 | 72.5 | 89.5 | 25 / 35 | 7492 |
| 3 | 1 | 74.3 | 96.5 | 28 / 35 | 7608 |
| 4 | 1 | 72.7 | 91.7 | 25 / 35 | 7363 |
| 5 | 1 | 72.8 | 91.1 | 24 / 35 | 7176 |
| 6 | 1 | 73.1 | 89.2 | 23 / 35 | 7745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 91% |
| mld.Infinity 2.2 | 48 | 96% |
| radnor.DoctorBob 1.42 | 38 | 79% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 47% | 70 |
| mz.AntiGrav 1.0 | 17 | 29% | 71 |
| mld.Infinity 2.2 | 6 | 10% | 44 |
| amz.NanoClone 1.41 | 4 | 7% | 9 |
| GarmBox.Oranges 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.4 | 120 / 210 | 2.86 | 18.3% | 33944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.3% | 120 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.5% | 47 |
| mld.DustBunny 3.8 | 2.5 | 14.3% | 23 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 4 |
| zyx.nano.Ant 1.1 | 5.3 | 9.1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.5% | 5 |
| bzdp.BoxCar 2.0 | 8.0 | 7.0% | 1 |
| fullsail.SweetTea 1.1 | 8.3 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 22 / 35 | 5973 |
| 2 | 1 | 67.9 | 82.9 | 20 / 35 | 5140 |
| 3 | 1 | 67.7 | 83.8 | 21 / 35 | 4975 |
| 4 | 1 | 67.1 | 71.4 | 19 / 35 | 6152 |
| 5 | 1 | 68.0 | 80.6 | 22 / 35 | 5548 |
| 6 | 1 | 66.0 | 66.7 | 16 / 35 | 6156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 70 | 87% |
| oog.melee.Mercutio 1.0 | 53 | 75% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 23 | 26% | 79 |
| oog.melee.Mercutio 1.0 | 22 | 24% | 64 |
| maribo.melee.BMV 0.1 | 11 | 12% | 19 |
| zyx.nano.Ant 1.1 | 11 | 12% | 14 |
| cs.Grudge 1.0 | 8 | 9% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 12 |
| fullsail.SweetTea 1.1 | 5 | 6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 77.5 | 122 / 210 | 3.02 | 19.0% | 37486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.0% | 122 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.3% | 14 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 13 |
| fm.mammillarias 1.3 | 5.7 | 9.6% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 6 |
| sample.Fire 1.0 | 9.3 | 5.0% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 74.9 | 21 / 35 | 6159 |
| 2 | 1 | 70.5 | 83.5 | 23 / 35 | 6831 |
| 3 | 1 | 68.1 | 75.2 | 20 / 35 | 6234 |
| 4 | 1 | 69.3 | 80.6 | 20 / 35 | 6180 |
| 5 | 1 | 68.9 | 78.1 | 21 / 35 | 6217 |
| 6 | 1 | 66.9 | 72.7 | 17 / 35 | 5865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 96% |
| cb.nano.Insomnia 1.0 | 23 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 94% |
| sp.Nanos.Ember 1.1 | 10 | 70% |
| fm.mammillarias 1.3 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 17 | 19% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 17% | 29 |
| myl.nano.KomoriNinja 1.1 | 13 | 15% | 45 |
| myl.micro.Troodon 1.10 | 12 | 13% | 60 |
| fm.mammillarias 1.3 | 12 | 13% | 18 |
| sp.Nanos.Ember 1.1 | 10 | 11% | 13 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 12 |
| sample.Fire 1.0 | 3 | 3% | 4 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.7 | 145 / 210 | 2.47 | 20.2% | 39636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.2% | 145 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 13 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.3% | 19 |
| tj.zombie1n 1.0.1 | 5.8 | 8.7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.6% | 6 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.1 | 22 / 35 | 6574 |
| 2 | 1 | 71.4 | 87.6 | 27 / 35 | 7018 |
| 3 | 1 | 70.7 | 83.8 | 26 / 35 | 6970 |
| 4 | 1 | 70.5 | 86.7 | 25 / 35 | 6569 |
| 5 | 1 | 69.9 | 83.2 | 22 / 35 | 6559 |
| 6 | 1 | 67.7 | 75.6 | 23 / 35 | 5946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 91% |
| stelo.SoJNanoMelee 1.1 | 40 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 75% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 7 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 28 | 43% | 85 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 12% | 12 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 25 |
| stelo.SoJNanoMelee 1.1 | 6 | 9% | 27 |
| repositorio.NanoStep 1.0 | 4 | 6% | 14 |
| tj.zombie1n 1.0.1 | 3 | 5% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 2 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 68.7 | 95 / 210 | 3.81 | 16.5% | 32274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.5% | 95 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 35 |
| ahf.NanoAndrew .4 | 3.2 | 11.4% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.8% | 17 |
| sam.Samspin 1.0 | 5.2 | 10.0% | 18 |
| EBBU.Sim2 1.02 | 6.2 | 9.7% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 75.6 | 20 / 35 | 5852 |
| 2 | 1 | 60.8 | 60.6 | 9 / 35 | 4723 |
| 3 | 1 | 61.0 | 58.4 | 9 / 35 | 5116 |
| 4 | 1 | 65.8 | 73.0 | 18 / 35 | 5436 |
| 5 | 1 | 62.6 | 62.5 | 14 / 35 | 5022 |
| 6 | 1 | 68.9 | 82.2 | 25 / 35 | 6125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 86% |
| oog.melee.Corsair 1.0 | 33 | 67% |
| ahf.NanoAndrew .4 | 19 | 89% |
| sam.Samspin 1.0 | 9 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 71% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| EBBU.Sim2 1.02 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 23% | 51 |
| oog.melee.Corsair 1.0 | 20 | 17% | 44 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 19 |
| sam.Samspin 1.0 | 12 | 10% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 18 |
| ahf.NanoAndrew .4 | 9 | 8% | 32 |
| EBBU.Sim2 1.02 | 9 | 8% | 12 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.9 | 127 / 210 | 2.45 | 19.0% | 33381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.0% | 127 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 40 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.5% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 9 |
| fm.claire 1.7 | 6.3 | 8.5% | 2 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.2% | 2 |
| sample.SpinBot 1.0 | 8.0 | 6.7% | 2 |
| pa.Improved 1.0 | 8.7 | 6.3% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.5 | 20 / 35 | 5398 |
| 2 | 1 | 68.8 | 83.8 | 19 / 35 | 5790 |
| 3 | 1 | 66.5 | 77.8 | 20 / 35 | 5079 |
| 4 | 1 | 70.1 | 87.9 | 22 / 35 | 5995 |
| 5 | 1 | 68.7 | 83.8 | 23 / 35 | 5539 |
| 6 | 1 | 69.4 | 87.6 | 23 / 35 | 5580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 81% |
| oog.melee.CapuletDroid 1.1 | 30 | 97% |
| gh.nano.Grofvuil 0.2 | 20 | 90% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 40% | 89 |
| gh.nano.Grofvuil 0.2 | 11 | 13% | 29 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 39 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 12 |
| fm.claire 1.7 | 6 | 7% | 8 |
| pa.Improved 1.0 | 5 | 6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 9 |
| sample.SpinBot 1.0 | 3 | 4% | 6 |
| kurios.DOSexe .9b | 2 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.2 | 99 / 210 | 2.60 | 18.6% | 35954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.6% | 99 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.2% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.5% | 32 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.8% | 1 |
| mbro.Detektor3 0.1.1 | 9.5 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.4 | 15 / 35 | 6051 |
| 2 | 1 | 66.5 | 72.4 | 14 / 35 | 5944 |
| 3 | 1 | 68.3 | 83.2 | 18 / 35 | 5631 |
| 4 | 1 | 70.9 | 89.8 | 22 / 35 | 6200 |
| 5 | 1 | 66.7 | 76.5 | 11 / 35 | 6096 |
| 6 | 1 | 69.4 | 86.7 | 19 / 35 | 6032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 81% |
| mz.MicroGodMelee 1 | 34 | 74% |
| gh.micro.Gruweltje 0.7 | 30 | 70% |
| DBall.Anarchy 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 29% | 64 |
| mz.MicroGodMelee 1 | 29 | 26% | 56 |
| spinnercat.micro.Tyger 0.1 | 26 | 23% | 57 |
| acogdev.alpha 0.2 | 7 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 7 |
| DBall.Anarchy 0.1 | 3 | 3% | 7 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 76.5 | 124 / 210 | 3.11 | 17.8% | 32489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.8% | 124 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.8% | 23 |
| germ.TheMind .2 | 5.2 | 9.0% | 5 |
| qualidafial.MajorDick 1.0.1 | 6.0 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.5% | 6 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.5% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.7% | 0 |
| sample.Crazy 1.0 | 9.0 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.5 | 21 / 35 | 5051 |
| 2 | 1 | 68.7 | 80.0 | 21 / 35 | 5990 |
| 3 | 1 | 68.9 | 83.8 | 25 / 35 | 5572 |
| 4 | 1 | 65.1 | 69.8 | 17 / 35 | 5293 |
| 5 | 1 | 66.4 | 73.0 | 20 / 35 | 5268 |
| 6 | 1 | 66.2 | 74.9 | 20 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 89% |
| germ.TheMind .2 | 14 | 79% |
| sample.Crazy 1.0 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 41% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 21% | 37 |
| germ.TheMind .2 | 8 | 9% | 14 |
| stelo.UntouchableNano 1.3 | 7 | 8% | 16 |
| awesomeness.Elite 1.0 | 7 | 8% | 14 |
| lrem.micro.MoggFanatic 0.2 | 5 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 5% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.1 | 156 / 210 | 1.89 | 20.8% | 34212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.8% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.5% | 11 |
| maribo.IotaCT 1.1 | 4.0 | 10.5% | 8 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.3% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.2% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.5% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.6% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 7.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.9 | 24 / 35 | 5744 |
| 2 | 1 | 70.5 | 85.4 | 26 / 35 | 5516 |
| 3 | 1 | 72.5 | 93.7 | 30 / 35 | 5909 |
| 4 | 1 | 71.9 | 92.1 | 25 / 35 | 5660 |
| 5 | 1 | 71.2 | 90.5 | 26 / 35 | 5681 |
| 6 | 1 | 71.4 | 91.1 | 25 / 35 | 5702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 101 | 94% |
| nz.jdc.nano.GridFu 1.0 | 25 | 100% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| timmit.nano.TimDog 0.33 | 9 | 78% |
| maribo.IotaCT 1.1 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 6 | 67% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 35% | 91 |
| stelo.PatternRobot 1.0 | 9 | 17% | 18 |
| maribo.IotaCT 1.1 | 6 | 11% | 18 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 16 |
| ratosh.Wesco 1.4 | 5 | 9% | 19 |
| spinnercat.Omen 1.0 | 5 | 9% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.8 | 161 / 210 | 1.91 | 21.5% | 41208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.5% | 161 |
| baal.nano.N 1.42 | 2.3 | 12.4% | 7 |
| tvv.nano.Polaris 1.2 | 3.3 | 11.4% | 19 |
| Grystrion.TrackerWO 1.0 | 3.8 | 9.8% | 1 |
| sanja.First 0.1 | 5.0 | 9.2% | 9 |
| zyx.micro.Ant 1.1 | 5.7 | 8.8% | 8 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.3% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.1 | 28 / 35 | 7252 |
| 2 | 1 | 71.7 | 91.7 | 27 / 35 | 6783 |
| 3 | 1 | 71.3 | 87.6 | 27 / 35 | 6993 |
| 4 | 1 | 70.8 | 87.9 | 27 / 35 | 6418 |
| 5 | 1 | 70.6 | 87.3 | 23 / 35 | 6909 |
| 6 | 1 | 72.3 | 92.4 | 29 / 35 | 6853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 40 | 93% |
| tvv.nano.Polaris 1.2 | 31 | 90% |
| sanja.First 0.1 | 27 | 89% |
| cvt.Firsty 1.0 | 24 | 100% |
| zyx.micro.Ant 1.1 | 18 | 89% |
| Grystrion.TrackerWO 1.0 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 27% | 34 |
| tvv.nano.Polaris 1.2 | 10 | 20% | 48 |
| baal.nano.N 1.42 | 8 | 16% | 41 |
| sanja.First 0.1 | 7 | 14% | 28 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 21 |
| cvt.Firsty 1.0 | 2 | 4% | 20 |
| sample.RamFire 1.0 | 2 | 4% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.1 | 92 / 210 | 3.69 | 16.0% | 32494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.3 | 16.0% | 92 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 64 |
| cs.Wren 1.0 | 3.2 | 12.9% | 21 |
| js.PinBall 1.6 | 4.2 | 11.2% | 11 |
| mz.Cork 0.1 | 5.0 | 10.5% | 12 |
| joe.ADinosaur 1.0 | 5.8 | 9.2% | 5 |
| evd.X1 0.01 | 6.8 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 70.2 | 20 / 35 | 5555 |
| 2 | 1 | 67.2 | 78.4 | 18 / 35 | 6161 |
| 3 | 2 | 61.8 | 63.2 | 11 / 35 | 5313 |
| 4 | 1 | 65.7 | 75.2 | 18 / 35 | 5318 |
| 5 | 2 | 64.6 | 72.1 | 15 / 35 | 5146 |
| 6 | 1 | 60.7 | 61.6 | 10 / 35 | 5001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 78% |
| cs.Wren 1.0 | 16 | 100% |
| mz.Cork 0.1 | 8 | 88% |
| js.PinBall 1.6 | 8 | 75% |
| donjezza.Jezza 1.0 | 7 | 86% |
| joe.ADinosaur 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 41% | 103 |
| joe.ADinosaur 1.0 | 20 | 17% | 24 |
| cs.Wren 1.0 | 13 | 11% | 28 |
| evd.X1 0.01 | 12 | 10% | 13 |
| js.PinBall 1.6 | 11 | 9% | 16 |
| PSW.Relentless 0.1 | 7 | 6% | 6 |
| mz.Cork 0.1 | 4 | 3% | 10 |
| donjezza.Jezza 1.0 | 2 | 2% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.7 | 136 / 210 | 2.38 | 19.5% | 32259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.5% | 136 |
| myl.nano.Graviton 1.10 | 3.2 | 11.1% | 16 |
| ntc.Opposite 1.5 | 3.8 | 10.8% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.0% | 11 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 7 |
| DBall.NUKE 0.1 | 8.0 | 7.9% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.6 | 24 / 35 | 5699 |
| 2 | 1 | 69.2 | 87.0 | 22 / 35 | 5393 |
| 3 | 1 | 68.0 | 81.0 | 25 / 35 | 5131 |
| 4 | 1 | 69.5 | 85.7 | 23 / 35 | 5435 |
| 5 | 1 | 68.4 | 82.5 | 20 / 35 | 5356 |
| 6 | 1 | 68.6 | 83.5 | 22 / 35 | 5245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 94% |
| stelo.AreaTargetingBot 1.1 | 28 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 95% |
| donjezza.Muncho 1.0 | 18 | 94% |
| disan.Chair 2.2.0 | 16 | 75% |
| ntc.Opposite 1.5 | 15 | 93% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 10 | 60% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 17 | 23% | 37 |
| myl.nano.Graviton 1.10 | 14 | 19% | 41 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 22 |
| ntc.Opposite 1.5 | 10 | 14% | 23 |
| stelo.AreaTargetingBot 1.1 | 9 | 12% | 33 |
| disan.Chair 2.2.0 | 5 | 7% | 13 |
| DBall.NUKE 0.1 | 4 | 5% | 16 |
| donjezza.Muncho 1.0 | 2 | 3% | 17 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.9 | 96 / 210 | 3.08 | 16.9% | 28512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 16.9% | 96 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 44 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 19 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 17 / 35 | 4500 |
| 2 | 1 | 67.2 | 76.2 | 15 / 35 | 5255 |
| 3 | 1 | 65.9 | 77.1 | 13 / 35 | 4752 |
| 4 | 1 | 68.0 | 78.7 | 20 / 35 | 5122 |
| 5 | 1 | 67.5 | 81.3 | 16 / 35 | 4947 |
| 6 | 2 | 62.6 | 65.4 | 15 / 35 | 3936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 66% |
| kawigi.micro.Shiz 1.1 | 31 | 97% |
| yagami.Tidus 0.11 | 22 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 84% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 36% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 19% | 40 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 32 |
| yagami.Tidus 0.11 | 12 | 11% | 35 |
| ejb.Polaris 1.0.1 | 12 | 11% | 20 |
| step.nanoPri 1.0 | 7 | 6% | 7 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.5 | 131 / 210 | 2.85 | 17.9% | 29575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.9% | 131 |
| bzdp.Pansy 2.1 | 2.5 | 12.7% | 20 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 17 |
| ratosh.Nobo 0.21 | 3.8 | 11.4% | 12 |
| wee.Gem 1.8.4 | 4.2 | 11.4% | 18 |
| m3thos.Eva00 1.1 | 6.2 | 9.5% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.6% | 3 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 73.0 | 17 / 35 | 4780 |
| 2 | 1 | 66.2 | 76.5 | 20 / 35 | 5036 |
| 3 | 1 | 67.7 | 81.3 | 24 / 35 | 4988 |
| 4 | 1 | 68.4 | 84.8 | 24 / 35 | 5091 |
| 5 | 1 | 66.8 | 80.0 | 23 / 35 | 4673 |
| 6 | 1 | 67.7 | 81.3 | 23 / 35 | 5007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 95% |
| wompi.Quokka 1.6 | 30 | 87% |
| wee.Gem 1.8.4 | 19 | 100% |
| m3thos.Eva00 1.1 | 14 | 86% |
| ratosh.Nobo 0.21 | 11 | 100% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 20% | 66 |
| ratosh.Nobo 0.21 | 11 | 14% | 25 |
| wompi.Quokka 1.6 | 10 | 12% | 31 |
| maribo.FollowFire 1 | 10 | 12% | 11 |
| bayen.UbaMicro 1.4 | 9 | 11% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 9 |
| m3thos.Eva00 1.1 | 7 | 9% | 15 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 7 |
| wee.Gem 1.8.4 | 4 | 5% | 29 |

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.2 | 90.1 | 135 / 210 | 1.90 | 22.9% | 53709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.9% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 58 |
| mz.NanoGod 2.02 | 3.0 | 13.5% | 9 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.9% | 6 |
| ayk.WallHugger 1.0 | 5.3 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 84.4 | 20 / 35 | 8295 |
| 2 | 1 | 73.5 | 91.7 | 20 / 35 | 8798 |
| 3 | 1 | 76.0 | 94.6 | 25 / 35 | 9609 |
| 4 | 1 | 74.4 | 89.8 | 24 / 35 | 8858 |
| 5 | 1 | 76.2 | 95.9 | 27 / 35 | 10142 |
| 6 | 1 | 72.2 | 83.8 | 19 / 35 | 8007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 81% |
| exauge.GateKeeper 1.1.121g | 16 | 88% |
| mz.NanoGod 2.02 | 12 | 75% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 53% | 145 |
| mz.NanoGod 2.02 | 23 | 30% | 35 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 13 |
| ayk.WallHugger 1.0 | 5 | 7% | 8 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.5 | 102 / 210 | 3.47 | 16.9% | 30980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.9% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.6% | 24 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.2% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 20 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.6% | 6 |
| conscience.Electron 1.3g | 6.8 | 8.1% | 0 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 16 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.0 | 19 / 35 | 5531 |
| 2 | 1 | 64.3 | 69.5 | 19 / 35 | 4919 |
| 3 | 1 | 65.0 | 74.0 | 17 / 35 | 4832 |
| 4 | 1 | 61.5 | 61.9 | 12 / 35 | 4955 |
| 5 | 1 | 66.7 | 76.5 | 18 / 35 | 5178 |
| 6 | 1 | 66.1 | 72.4 | 17 / 35 | 5565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 86% |
| dummy.micro.Sparrow 2.5 | 29 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 71% |
| bvh.micro.Freya 0.3 | 16 | 81% |
| stelo.MirrorMicro 1.0 | 14 | 93% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 17% | 18 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 43 |
| conscience.Electron 1.3g | 16 | 15% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 32 |
| bvh.micro.Freya 0.3 | 11 | 10% | 19 |
| dl.BetterWalls 1.0 | 7 | 6% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 16 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.8 | 159 / 210 | 2.01 | 22.2% | 45358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.2% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 12 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 7 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.2% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 4 |
| dsw.StaticD 1.0 | 5.3 | 8.7% | 9 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.0 | 6.3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 3 |
| sample.Corners 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 89.2 | 24 / 35 | 7540 |
| 2 | 1 | 71.0 | 82.5 | 24 / 35 | 6956 |
| 3 | 1 | 73.3 | 92.7 | 28 / 35 | 7521 |
| 4 | 1 | 72.4 | 88.6 | 26 / 35 | 7647 |
| 5 | 1 | 74.4 | 94.9 | 32 / 35 | 8089 |
| 6 | 1 | 72.0 | 84.8 | 25 / 35 | 7605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 49 | 90% |
| supersample.SuperBoxBot 1.0 | 25 | 88% |
| dsw.StaticD 1.0 | 16 | 56% |
| sample.MyFirstRobot 1.0 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 32% | 30 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 23% | 62 |
| dsw.StaticD 1.0 | 11 | 21% | 22 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 9 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 8 |
| sample.Corners 1.0 | 3 | 6% | 6 |
| sul.Lunar 1.1 | 2 | 4% | 57 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 80.7 | 118 / 210 | 2.73 | 19.1% | 40662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.1% | 118 |
| mld.Wisdom 1.0 | 2.7 | 12.6% | 20 |
| radnor.DoctorBob 1.42 | 3.2 | 11.9% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.3% | 17 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 9 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 10 |
| sample.Walls 1.0 | 7.5 | 7.6% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.3 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 75.2 | 18 / 35 | 5990 |
| 2 | 1 | 68.1 | 78.7 | 18 / 35 | 6503 |
| 3 | 1 | 69.8 | 81.9 | 23 / 35 | 7166 |
| 4 | 1 | 69.3 | 80.0 | 23 / 35 | 6967 |
| 5 | 1 | 67.5 | 78.7 | 17 / 35 | 6515 |
| 6 | 1 | 71.0 | 89.8 | 19 / 35 | 7521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 87% |
| radnor.DoctorBob 1.42 | 32 | 78% |
| mld.Wisdom 1.0 | 22 | 68% |
| amz.NanoClone 1.41 | 15 | 87% |
| jangs.ns51 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| sample.Walls 1.0 | 6 | 67% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 32% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 17% | 49 |
| radnor.DoctorBob 1.42 | 16 | 17% | 44 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 20 |
| amz.NanoClone 1.41 | 6 | 6% | 20 |
| sample.Walls 1.0 | 5 | 5% | 10 |
| jangs.ns51 1.0 | 5 | 5% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |

