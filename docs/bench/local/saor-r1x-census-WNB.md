# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 90.7 | 155 / 210 | 1.83 | 21.6% | 43257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 21.6% | 155 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 13 |
| radnor.DoctorBob 1.42 | 2.8 | 13.7% | 15 |
| mld.Infinity 2.2 | 3.7 | 13.0% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 6 |
| sample.Walls 1.0 | 6.3 | 6.9% | 4 |
| jangs.ns51 1.0 | 7.2 | 6.4% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 93.3 | 28 / 35 | 7167 |
| 2 | 1 | 73.1 | 93.0 | 25 / 35 | 7470 |
| 3 | 1 | 72.5 | 89.2 | 24 / 35 | 7515 |
| 4 | 1 | 71.4 | 89.2 | 25 / 35 | 6661 |
| 5 | 1 | 71.7 | 87.0 | 25 / 35 | 7242 |
| 6 | 1 | 73.2 | 92.7 | 28 / 35 | 7202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 96% |
| mld.Infinity 2.2 | 39 | 92% |
| radnor.DoctorBob 1.42 | 30 | 87% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 40% | 58 |
| mz.AntiGrav 1.0 | 16 | 29% | 73 |
| mld.Infinity 2.2 | 8 | 15% | 47 |
| amz.NanoClone 1.41 | 5 | 9% | 12 |
| sample.Walls 1.0 | 1 | 2% | 8 |
| jangs.ns51 1.0 | 1 | 2% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.1 | 146 / 210 | 1.80 | 19.8% | 33265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.8% | 146 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 40 |
| mld.DustBunny 3.8 | 3.5 | 12.7% | 14 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 1 |
| zyx.nano.Ant 1.1 | 5.7 | 8.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.3% | 5 |
| bzdp.BoxCar 2.0 | 8.2 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.4% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.5 | 24 / 35 | 5508 |
| 2 | 1 | 70.5 | 92.4 | 27 / 35 | 6183 |
| 3 | 1 | 69.6 | 89.8 | 22 / 35 | 5371 |
| 4 | 1 | 70.8 | 94.3 | 28 / 35 | 5576 |
| 5 | 1 | 68.9 | 88.3 | 20 / 35 | 5391 |
| 6 | 1 | 69.6 | 91.1 | 25 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 73% |
| mld.DustBunny 3.8 | 56 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| maribo.melee.BMV 0.1 | 13 | 100% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 9 | 89% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 42% | 84 |
| mld.DustBunny 3.8 | 15 | 23% | 60 |
| maribo.melee.BMV 0.1 | 7 | 11% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 8% | 14 |
| djdjdj.NanoSkunk10 1.0 | 4 | 6% | 12 |
| fullsail.SweetTea 1.1 | 4 | 6% | 11 |
| zyx.nano.Ant 1.1 | 2 | 3% | 6 |
| cs.Grudge 1.0 | 1 | 2% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 80.4 | 120 / 210 | 2.76 | 19.1% | 35930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.1% | 120 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.7% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 21 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.1% | 9 |
| fm.mammillarias 1.3 | 5.8 | 9.5% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 0 |
| sample.Fire 1.0 | 9.0 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 81.3 | 22 / 35 | 5956 |
| 2 | 1 | 68.7 | 80.3 | 21 / 35 | 5767 |
| 3 | 1 | 68.7 | 78.4 | 19 / 35 | 6033 |
| 4 | 1 | 69.1 | 81.6 | 21 / 35 | 6042 |
| 5 | 1 | 67.5 | 77.5 | 16 / 35 | 5636 |
| 6 | 1 | 70.1 | 83.5 | 21 / 35 | 6496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 80% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| myl.nano.KomoriNinja 1.1 | 14 | 79% |
| fm.mammillarias 1.3 | 9 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 28% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 26% | 42 |
| cb.nano.Insomnia 1.0 | 15 | 17% | 20 |
| myl.nano.KomoriNinja 1.1 | 9 | 10% | 30 |
| fm.mammillarias 1.3 | 6 | 7% | 11 |
| sample.Fire 1.0 | 5 | 6% | 9 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 12 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 8 |

## Melee bench: F04

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.5 | 151 / 210 | 2.04 | 21.0% | 40288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 21.0% | 151 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 22 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.3% | 17 |
| tj.zombie1n 1.0.1 | 5.5 | 8.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.4% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.9% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.6 | 31 / 35 | 6710 |
| 2 | 1 | 70.0 | 82.5 | 21 / 35 | 7082 |
| 3 | 1 | 70.1 | 84.4 | 22 / 35 | 6728 |
| 4 | 1 | 71.9 | 92.1 | 29 / 35 | 6629 |
| 5 | 1 | 68.4 | 81.3 | 19 / 35 | 6273 |
| 6 | 1 | 72.9 | 95.9 | 29 / 35 | 6866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 96% |
| stelo.SoJNanoMelee 1.1 | 41 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 100% |
| tj.zombie1n 1.0.1 | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 14 | 86% |
| yk.JahMicro 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 45% | 91 |
| stelo.SoJNanoMelee 1.1 | 10 | 17% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 12% | 9 |
| tj.zombie1n 1.0.1 | 5 | 8% | 8 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 28 |
| repositorio.NanoStep 1.0 | 2 | 3% | 7 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.6 | 104 / 210 | 3.46 | 16.5% | 29773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 16.5% | 104 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.0% | 19 |
| ahf.NanoAndrew .4 | 3.8 | 11.1% | 26 |
| sam.Samspin 1.0 | 5.7 | 9.4% | 6 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.5% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.6% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 76.5 | 24 / 35 | 5095 |
| 2 | 1 | 62.4 | 66.0 | 11 / 35 | 4963 |
| 3 | 1 | 64.0 | 72.7 | 17 / 35 | 4537 |
| 4 | 1 | 64.6 | 73.0 | 19 / 35 | 4883 |
| 5 | 1 | 65.7 | 74.9 | 16 / 35 | 5557 |
| 6 | 1 | 64.5 | 72.7 | 17 / 35 | 4738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 94% |
| oog.melee.Corsair 1.0 | 32 | 72% |
| ahf.NanoAndrew .4 | 18 | 83% |
| EBBU.Sim2 1.02 | 16 | 94% |
| sam.Samspin 1.0 | 12 | 83% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 21% | 48 |
| bwbaugh.nano.Tirunculus 0.0.0a | 19 | 18% | 19 |
| robar.nano.Assertive_Melee 0.2 | 16 | 15% | 22 |
| simonton.nano.MeleeSeed 1.8 | 14 | 13% | 43 |
| EBBU.Sim2 1.02 | 10 | 9% | 21 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 10 |
| ahf.NanoAndrew .4 | 7 | 7% | 25 |
| sam.Samspin 1.0 | 7 | 7% | 15 |
| sample.TrackFire 1.0 | 4 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.7 | 140 / 210 | 2.29 | 19.3% | 32781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.3% | 140 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 32 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 8 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.3% | 14 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.4% | 0 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.6% | 8 |
| fm.claire 1.7 | 5.8 | 8.7% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.2% | 5 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.7 | 27 / 35 | 5283 |
| 2 | 1 | 69.1 | 87.0 | 23 / 35 | 5489 |
| 3 | 1 | 68.9 | 85.4 | 23 / 35 | 5638 |
| 4 | 1 | 69.2 | 86.7 | 26 / 35 | 5506 |
| 5 | 1 | 67.1 | 80.0 | 19 / 35 | 5412 |
| 6 | 1 | 68.2 | 82.2 | 22 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 88% |
| oog.melee.CapuletDroid 1.1 | 32 | 91% |
| arthord.NanoSatanMelee Beta | 15 | 100% |
| gh.nano.Grofvuil 0.2 | 11 | 82% |
| fm.claire 1.7 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 70 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 30% | 80 |
| oog.melee.CapuletDroid 1.1 | 11 | 16% | 40 |
| gh.nano.Grofvuil 0.2 | 11 | 16% | 25 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 14 |
| sample.SpinBot 1.0 | 7 | 10% | 12 |
| fm.claire 1.7 | 5 | 7% | 9 |
| kurios.DOSexe .9b | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 15 |
| pa.Improved 1.0 | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.3 | 112 / 210 | 2.41 | 18.8% | 35710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.8% | 112 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.3% | 22 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 29 |
| DBall.Anarchy 0.1 | 5.5 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.0% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.5% | 3 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.3 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.5 | 16 / 35 | 5520 |
| 2 | 1 | 68.1 | 84.1 | 15 / 35 | 5873 |
| 3 | 1 | 67.9 | 80.6 | 18 / 35 | 5957 |
| 4 | 1 | 69.7 | 84.8 | 20 / 35 | 6661 |
| 5 | 1 | 68.5 | 85.4 | 21 / 35 | 5653 |
| 6 | 1 | 69.8 | 88.3 | 22 / 35 | 6046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 89% |
| mz.MicroGodMelee 1 | 42 | 71% |
| gh.micro.Gruweltje 0.7 | 30 | 73% |
| DBall.Anarchy 0.1 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 29 | 30% | 64 |
| mz.MicroGodMelee 1 | 29 | 30% | 60 |
| gh.micro.Gruweltje 0.7 | 16 | 16% | 47 |
| acogdev.alpha 0.2 | 8 | 8% | 9 |
| fire219.CatBot 1.0 | 7 | 7% | 8 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 11 |

## Melee bench: F08

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 70.4 | 101 / 210 | 3.66 | 16.5% | 32387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.2 | 16.5% | 101 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 38 |
| germ.TheMind .2 | 4.3 | 10.2% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.2% | 6 |
| awesomeness.Elite 1.0 | 6.0 | 8.5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 1 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 74.3 | 15 / 35 | 5719 |
| 2 | 1 | 63.1 | 66.0 | 18 / 35 | 5082 |
| 3 | 1 | 66.6 | 74.3 | 19 / 35 | 5660 |
| 4 | 1 | 64.6 | 68.9 | 18 / 35 | 5472 |
| 5 | 2 | 62.6 | 66.7 | 12 / 35 | 4931 |
| 6 | 1 | 66.1 | 72.4 | 19 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 75% |
| germ.TheMind .2 | 10 | 80% |
| sample.Crazy 1.0 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 2 | 50% |

Hadur died in 109 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 45% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 16% | 35 |
| germ.TheMind .2 | 16 | 15% | 25 |
| awesomeness.Elite 1.0 | 7 | 6% | 13 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 3 | 3% | 9 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.7 | 155 / 210 | 1.93 | 20.1% | 30254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.1% | 155 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 12 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 10 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 7 |
| ratosh.Wesco 1.4 | 6.8 | 8.7% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 8.2% | 1 |
| stelo.PatternRobot 1.0 | 8.2 | 7.7% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.7 | 25 / 35 | 4803 |
| 2 | 1 | 71.6 | 93.0 | 27 / 35 | 5398 |
| 3 | 1 | 69.6 | 88.3 | 23 / 35 | 4923 |
| 4 | 1 | 70.7 | 87.6 | 26 / 35 | 5558 |
| 5 | 1 | 70.9 | 91.7 | 26 / 35 | 5082 |
| 6 | 1 | 70.6 | 90.8 | 28 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 93% |
| nz.jdc.nano.GridFu 1.0 | 33 | 100% |
| stelo.PatternRobot 1.0 | 19 | 95% |
| ratosh.Wesco 1.4 | 13 | 92% |
| maribo.IotaCT 1.1 | 9 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| timmit.nano.TimDog 0.33 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 13 | 24% | 25 |
| ratosh.Wesco 1.4 | 11 | 20% | 24 |
| rz.HawkOnFire 0.1 | 10 | 18% | 56 |
| nz.jdc.nano.GridFu 1.0 | 6 | 11% | 42 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 20 |
| maribo.IotaCT 1.1 | 4 | 7% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 10 |
| spinnercat.Omen 1.0 | 2 | 4% | 9 |

## Melee bench: F10

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.0 | 152 / 210 | 2.08 | 20.3% | 36768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.3% | 152 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 23 |
| baal.nano.N 1.42 | 2.7 | 11.8% | 9 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.7% | 3 |
| zyx.micro.Ant 1.1 | 5.5 | 9.3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.2 | 7.8% | 0 |
| sanja.First 0.1 | 7.2 | 7.8% | 3 |
| cvt.Firsty 1.0 | 7.7 | 7.7% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 30 / 35 | 5852 |
| 2 | 1 | 69.6 | 84.4 | 26 / 35 | 6162 |
| 3 | 1 | 71.4 | 93.0 | 27 / 35 | 6447 |
| 4 | 1 | 68.8 | 82.2 | 23 / 35 | 5995 |
| 5 | 1 | 70.0 | 88.9 | 21 / 35 | 6308 |
| 6 | 1 | 69.1 | 86.0 | 25 / 35 | 6004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 97% |
| baal.nano.N 1.42 | 34 | 88% |
| cvt.Firsty 1.0 | 22 | 100% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| sanja.First 0.1 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 5 | 80% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 21 | 36% | 46 |
| tvv.nano.Polaris 1.2 | 8 | 14% | 51 |
| baal.nano.N 1.42 | 8 | 14% | 28 |
| sanja.First 0.1 | 6 | 10% | 25 |
| cvt.Firsty 1.0 | 5 | 9% | 25 |
| amk.Punbot.Punbot 0.01 | 5 | 9% | 11 |
| Grystrion.TrackerWO 1.0 | 3 | 5% | 11 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 9 |
| sample.RamFire 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.4 | 88 / 210 | 3.67 | 15.9% | 31359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.9% | 58 |
| hadur117.micro.SaorWNB 0.1 | 1.5 | 15.9% | 88 |
| cs.Wren 1.0 | 3.0 | 13.0% | 25 |
| js.PinBall 1.6 | 4.2 | 11.5% | 18 |
| mz.Cork 0.1 | 4.8 | 10.7% | 8 |
| evd.X1 0.01 | 6.3 | 8.8% | 6 |
| joe.ADinosaur 1.0 | 6.7 | 8.4% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 62.9 | 12 / 35 | 4442 |
| 2 | 2 | 63.6 | 69.2 | 13 / 35 | 5199 |
| 3 | 2 | 62.1 | 63.2 | 12 / 35 | 5018 |
| 4 | 1 | 67.2 | 78.7 | 18 / 35 | 5608 |
| 5 | 1 | 65.0 | 74.3 | 14 / 35 | 5422 |
| 6 | 1 | 66.0 | 74.0 | 19 / 35 | 5670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 79% |
| cs.Wren 1.0 | 33 | 79% |
| mz.Cork 0.1 | 6 | 100% |
| js.PinBall 1.6 | 5 | 60% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 0% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 42 | 34% | 96 |
| cs.Wren 1.0 | 25 | 20% | 43 |
| evd.X1 0.01 | 16 | 13% | 16 |
| mz.Cork 0.1 | 12 | 10% | 17 |
| js.PinBall 1.6 | 10 | 8% | 15 |
| joe.ADinosaur 1.0 | 10 | 8% | 10 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.3 | 124 / 210 | 2.41 | 19.1% | 31285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.1% | 124 |
| myl.nano.Graviton 1.10 | 3.0 | 11.1% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 3.3 | 10.8% | 8 |
| ntc.Opposite 1.5 | 3.7 | 11.0% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 6 |
| disan.Chair 2.2.0 | 7.3 | 8.6% | 11 |
| DBall.NUKE 0.1 | 7.3 | 8.7% | 9 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 5 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.8 | 16 / 35 | 4929 |
| 2 | 1 | 67.5 | 84.1 | 22 / 35 | 4738 |
| 3 | 1 | 70.6 | 92.4 | 25 / 35 | 5356 |
| 4 | 1 | 69.8 | 87.9 | 23 / 35 | 5297 |
| 5 | 1 | 69.4 | 86.7 | 23 / 35 | 5365 |
| 6 | 1 | 67.1 | 77.1 | 15 / 35 | 5600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 48 | 88% |
| myl.nano.Graviton 1.10 | 30 | 77% |
| ntc.Opposite 1.5 | 15 | 87% |
| disan.Chair 2.2.0 | 15 | 73% |
| donjezza.Muncho 1.0 | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| DBall.NUKE 0.1 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 6 | 50% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 23% | 27 |
| myl.nano.Graviton 1.10 | 18 | 21% | 46 |
| stelo.AreaTargetingBot 1.1 | 17 | 20% | 45 |
| ntc.Opposite 1.5 | 15 | 17% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 5% | 18 |
| DBall.NUKE 0.1 | 4 | 5% | 17 |
| disan.Chair 2.2.0 | 4 | 5% | 16 |
| donjezza.Muncho 1.0 | 3 | 3% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.7 | 78 / 210 | 3.37 | 15.8% | 25793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.2 | 15.8% | 78 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 34 |
| oog.melee.Capulet 1.2 | 2.7 | 13.9% | 54 |
| yagami.Tidus 0.11 | 4.2 | 12.5% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.0% | 23 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 6 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.7% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 74.6 | 13 / 35 | 4593 |
| 2 | 1 | 63.5 | 72.1 | 10 / 35 | 4211 |
| 3 | 1 | 65.5 | 76.5 | 13 / 35 | 4408 |
| 4 | 1 | 63.6 | 71.1 | 12 / 35 | 4130 |
| 5 | 2 | 63.1 | 68.3 | 11 / 35 | 4252 |
| 6 | 1 | 66.7 | 79.4 | 19 / 35 | 4199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 64% |
| yagami.Tidus 0.11 | 24 | 88% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 73% |
| ejb.Polaris 1.0.1 | 7 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 39% | 72 |
| kawigi.micro.Shiz 1.1 | 27 | 20% | 44 |
| yagami.Tidus 0.11 | 20 | 15% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 11% | 27 |
| ejb.Polaris 1.0.1 | 12 | 9% | 25 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 76.9 | 122 / 210 | 3.08 | 17.1% | 27680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 17.1% | 122 |
| bzdp.Pansy 2.1 | 2.3 | 12.3% | 18 |
| wompi.Quokka 1.6 | 3.3 | 11.7% | 16 |
| wee.Gem 1.8.4 | 3.8 | 11.2% | 29 |
| ratosh.Nobo 0.21 | 4.8 | 10.5% | 8 |
| bayen.UbaMicro 1.4 | 6.2 | 9.3% | 8 |
| m3thos.Eva00 1.1 | 6.5 | 9.4% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 69.8 | 17 / 35 | 4223 |
| 2 | 1 | 67.3 | 81.6 | 23 / 35 | 4863 |
| 3 | 1 | 67.1 | 82.5 | 21 / 35 | 4672 |
| 4 | 1 | 63.4 | 68.6 | 20 / 35 | 4508 |
| 5 | 1 | 65.8 | 77.1 | 20 / 35 | 4820 |
| 6 | 1 | 66.5 | 81.9 | 21 / 35 | 4594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 93% |
| wee.Gem 1.8.4 | 29 | 90% |
| wompi.Quokka 1.6 | 22 | 86% |
| ratosh.Nobo 0.21 | 10 | 90% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| m3thos.Eva00 1.1 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 14 | 16% | 23 |
| bzdp.Pansy 2.1 | 13 | 15% | 55 |
| wee.Gem 1.8.4 | 11 | 13% | 42 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 11 |
| maribo.FollowFire 1 | 10 | 11% | 10 |
| wompi.Quokka 1.6 | 9 | 10% | 28 |
| bayen.UbaMicro 1.4 | 9 | 10% | 16 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 12 |
| m3thos.Eva00 1.1 | 4 | 5% | 11 |

## Melee bench: F15

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 81.8 | 105 / 210 | 2.64 | 19.5% | 42624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.3 | 19.5% | 105 |
| wompi.Wallaby 5.1 | 1.7 | 18.3% | 73 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 22 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.0% | 6 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 74.6 | 13 / 35 | 6082 |
| 2 | 1 | 70.2 | 79.4 | 15 / 35 | 7205 |
| 3 | 2 | 70.5 | 86.3 | 18 / 35 | 6852 |
| 4 | 1 | 71.2 | 83.2 | 19 / 35 | 7202 |
| 5 | 1 | 72.5 | 86.3 | 21 / 35 | 7822 |
| 6 | 1 | 70.5 | 81.0 | 19 / 35 | 7461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 76% |
| mz.NanoGod 2.02 | 15 | 47% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| drd.Dreadknoght 0.9 | 6 | 83% |
| ayk.WallHugger 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 46 | 44% | 120 |
| mz.NanoGod 2.02 | 23 | 22% | 32 |
| exauge.GateKeeper 1.1.121g | 11 | 10% | 21 |
| ayk.WallHugger 1.0 | 11 | 10% | 15 |
| stuff.Vlad 0.1 | 6 | 6% | 8 |
| stelo.PianistNano 1.2 | 6 | 6% | 7 |
| drd.Dreadknoght 0.9 | 2 | 2% | 7 |

## Melee bench: F16

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.3 | 116 / 210 | 3.04 | 17.5% | 29787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 17.5% | 116 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.1% | 12 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.3% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.7 | 11.6% | 25 |
| bvh.micro.Freya 0.3 | 4.8 | 10.5% | 11 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 10 |
| conscience.Electron 1.3g | 7.2 | 7.5% | 1 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.5 | 18 / 35 | 5108 |
| 2 | 1 | 65.1 | 73.0 | 18 / 35 | 4822 |
| 3 | 1 | 65.5 | 75.6 | 19 / 35 | 4893 |
| 4 | 1 | 65.4 | 74.6 | 20 / 35 | 4816 |
| 5 | 1 | 66.2 | 77.5 | 19 / 35 | 4880 |
| 6 | 1 | 67.5 | 80.6 | 22 / 35 | 5268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 38 | 82% |
| dummy.micro.Sparrow 2.5 | 31 | 90% |
| voidious.micro.BlitzBat 1.05 | 26 | 92% |
| bvh.micro.Freya 0.3 | 16 | 100% |
| stelo.MirrorMicro 1.0 | 12 | 67% |
| ap.Frederick 1.1 | 8 | 88% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 23% | 46 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 18% | 51 |
| conscience.Electron 1.3g | 17 | 18% | 21 |
| dummy.micro.Sparrow 2.5 | 10 | 11% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 11% | 10 |
| stelo.MirrorMicro 1.0 | 9 | 9% | 21 |
| bvh.micro.Freya 0.3 | 5 | 5% | 16 |
| dl.BetterWalls 1.0 | 4 | 4% | 5 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 85.9 | 143 / 210 | 2.27 | 20.8% | 41928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.8% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 27 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 11 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.4% | 19 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.7% | 2 |
| dsw.StaticD 1.0 | 7.0 | 7.6% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 5.8% | 0 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 1 |
| sample.Corners 1.0 | 9.2 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 91.4 | 24 / 35 | 7547 |
| 2 | 1 | 70.7 | 84.1 | 24 / 35 | 6646 |
| 3 | 1 | 70.3 | 82.2 | 22 / 35 | 6924 |
| 4 | 1 | 71.4 | 86.3 | 25 / 35 | 7054 |
| 5 | 1 | 72.1 | 91.4 | 26 / 35 | 7040 |
| 6 | 1 | 69.2 | 79.7 | 22 / 35 | 6717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 87% |
| sul.Lunar 1.1 | 43 | 98% |
| supersample.SuperBoxBot 1.0 | 28 | 79% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| dsw.StaticD 1.0 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 26 | 38% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 29% | 68 |
| sul.Lunar 1.1 | 7 | 10% | 52 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 16 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 5 |
| dsw.StaticD 1.0 | 2 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.7 | 96 / 210 | 3.10 | 17.5% | 36312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 17.5% | 96 |
| radnor.DoctorBob 1.42 | 2.8 | 13.0% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.8 | 12.4% | 36 |
| mld.Wisdom 1.0 | 3.5 | 11.8% | 21 |
| amz.NanoClone 1.41 | 5.2 | 10.8% | 14 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.6% | 11 |
| sample.Walls 1.0 | 7.2 | 7.8% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 71.4 | 13 / 35 | 5911 |
| 2 | 1 | 68.1 | 83.2 | 21 / 35 | 6142 |
| 3 | 1 | 65.3 | 75.2 | 10 / 35 | 6064 |
| 4 | 1 | 64.0 | 69.2 | 14 / 35 | 5493 |
| 5 | 1 | 67.1 | 77.8 | 18 / 35 | 6140 |
| 6 | 1 | 69.1 | 83.5 | 20 / 35 | 6562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 72% |
| radnor.DoctorBob 1.42 | 33 | 82% |
| amz.NanoClone 1.41 | 14 | 71% |
| mld.Wisdom 1.0 | 13 | 69% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 28% | 63 |
| mld.Wisdom 1.0 | 26 | 23% | 36 |
| radnor.DoctorBob 1.42 | 24 | 21% | 53 |
| amz.NanoClone 1.41 | 10 | 9% | 20 |
| KiraNL.Chupacabra 0.4 | 9 | 8% | 11 |
| sample.Walls 1.0 | 7 | 6% | 13 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

