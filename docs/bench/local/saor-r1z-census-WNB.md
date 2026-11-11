# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 91.1 | 159 / 210 | 1.80 | 22.0% | 44635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 22.0% | 159 |
| mz.AntiGrav 1.0 | 2.3 | 13.9% | 14 |
| radnor.DoctorBob 1.42 | 3.0 | 13.8% | 14 |
| mld.Infinity 2.2 | 3.7 | 13.0% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 7 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 1 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 3.8% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 84.8 | 23 / 35 | 7520 |
| 2 | 1 | 72.3 | 91.7 | 25 / 35 | 6906 |
| 3 | 1 | 73.9 | 96.2 | 30 / 35 | 7582 |
| 4 | 1 | 74.9 | 97.5 | 32 / 35 | 7916 |
| 5 | 1 | 74.3 | 94.6 | 27 / 35 | 7913 |
| 6 | 1 | 70.3 | 81.9 | 22 / 35 | 6798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 93% |
| mld.Infinity 2.2 | 48 | 96% |
| radnor.DoctorBob 1.42 | 35 | 89% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 40% | 68 |
| mz.AntiGrav 1.0 | 11 | 21% | 58 |
| amz.NanoClone 1.41 | 8 | 15% | 14 |
| mld.Infinity 2.2 | 5 | 10% | 49 |
| sample.Walls 1.0 | 2 | 4% | 7 |
| jangs.ns51 1.0 | 2 | 4% | 6 |
| GarmBox.Oranges 1.0 | 2 | 4% | 2 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.8 | 143 / 210 | 2.01 | 19.5% | 33384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.5% | 143 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 41 |
| mld.DustBunny 3.8 | 3.2 | 12.3% | 11 |
| maribo.melee.BMV 0.1 | 3.8 | 10.3% | 2 |
| zyx.nano.Ant 1.1 | 5.7 | 8.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.7% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.3% | 5 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 7.4% | 4 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 20 / 35 | 4973 |
| 2 | 1 | 70.3 | 92.7 | 24 / 35 | 6041 |
| 3 | 1 | 67.4 | 83.2 | 20 / 35 | 5485 |
| 4 | 1 | 69.6 | 87.3 | 25 / 35 | 5700 |
| 5 | 1 | 71.4 | 96.2 | 29 / 35 | 5503 |
| 6 | 1 | 70.0 | 89.5 | 25 / 35 | 5682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 82% |
| mld.DustBunny 3.8 | 55 | 89% |
| djdjdj.NanoSkunk10 1.0 | 16 | 100% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 36% | 72 |
| mld.DustBunny 3.8 | 15 | 22% | 54 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 12% | 20 |
| fullsail.SweetTea 1.1 | 6 | 9% | 16 |
| maribo.melee.BMV 0.1 | 5 | 7% | 15 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 17 |
| zyx.nano.Ant 1.1 | 3 | 4% | 8 |
| bzdp.BoxCar 2.0 | 3 | 4% | 3 |

## Melee bench: F03

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.7 | 122 / 210 | 2.65 | 19.2% | 36020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.2% | 122 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 11.5% | 25 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.5% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 8 |
| fm.mammillarias 1.3 | 6.2 | 9.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.9% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 1 |
| sample.Fire 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 70.5 | 17 / 35 | 5435 |
| 2 | 1 | 69.4 | 81.9 | 21 / 35 | 6105 |
| 3 | 1 | 67.3 | 79.0 | 19 / 35 | 5537 |
| 4 | 1 | 68.7 | 82.9 | 16 / 35 | 5985 |
| 5 | 1 | 71.5 | 89.2 | 24 / 35 | 6739 |
| 6 | 1 | 70.6 | 86.7 | 25 / 35 | 6219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 41 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 78% |
| cb.nano.Insomnia 1.0 | 26 | 92% |
| myl.nano.KomoriNinja 1.1 | 14 | 79% |
| sp.Nanos.Ember 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 28% | 43 |
| myl.micro.Troodon 1.10 | 18 | 20% | 61 |
| fm.mammillarias 1.3 | 12 | 14% | 20 |
| cb.nano.Insomnia 1.0 | 12 | 14% | 17 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 31 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 19 |
| sample.Fire 1.0 | 3 | 3% | 7 |
| sample.Tracker 1.0 | 2 | 2% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.4 | 152 / 210 | 2.05 | 20.8% | 38731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.8% | 152 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.5% | 23 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.5% | 18 |
| tj.zombie1n 1.0.1 | 5.5 | 9.1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.4% | 1 |
| yk.JahMicro 1.0 | 6.5 | 8.3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.8% | 1 |
| repositorio.NanoStep 1.0 | 8.3 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 27 / 35 | 6691 |
| 2 | 1 | 69.3 | 84.8 | 23 / 35 | 5916 |
| 3 | 1 | 72.6 | 95.2 | 30 / 35 | 6636 |
| 4 | 1 | 68.7 | 80.0 | 20 / 35 | 6401 |
| 5 | 1 | 70.8 | 88.6 | 24 / 35 | 6729 |
| 6 | 1 | 70.7 | 88.3 | 28 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 89% |
| stelo.SoJNanoMelee 1.1 | 41 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| tj.zombie1n 1.0.1 | 9 | 100% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| sample.VelociRobot 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 40% | 95 |
| stelo.SoJNanoMelee 1.1 | 15 | 26% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 8 |
| repositorio.NanoStep 1.0 | 4 | 7% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 21 |
| tj.zombie1n 1.0.1 | 3 | 5% | 7 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 20 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.4 | 98 / 210 | 3.67 | 16.1% | 29483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 16.1% | 98 |
| oog.melee.Corsair 1.0 | 2.5 | 11.7% | 19 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 28 |
| EBBU.Sim2 1.02 | 5.7 | 9.5% | 4 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.5% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 9.0% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 71.4 | 18 / 35 | 5178 |
| 2 | 1 | 64.0 | 72.4 | 18 / 35 | 4689 |
| 3 | 1 | 63.8 | 72.7 | 15 / 35 | 4729 |
| 4 | 1 | 63.6 | 68.6 | 17 / 35 | 5067 |
| 5 | 1 | 60.5 | 61.0 | 13 / 35 | 4398 |
| 6 | 1 | 65.8 | 76.2 | 17 / 35 | 5422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 89% |
| oog.melee.Corsair 1.0 | 31 | 71% |
| ahf.NanoAndrew .4 | 12 | 67% |
| EBBU.Sim2 1.02 | 11 | 100% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 9 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 391. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 19% | 43 |
| simonton.nano.MeleeSeed 1.8 | 15 | 13% | 45 |
| ahf.NanoAndrew .4 | 15 | 13% | 27 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 13% | 16 |
| EBBU.Sim2 1.02 | 12 | 11% | 16 |
| zyx.nano.BacillusComma 1.0 | 11 | 10% | 15 |
| sam.Samspin 1.0 | 5 | 4% | 15 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.0 | 151 / 210 | 1.99 | 20.1% | 33538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.1% | 151 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 29 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.2% | 6 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.1% | 7 |
| fm.claire 1.7 | 5.5 | 9.0% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.7% | 2 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.6% | 5 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 3 |
| pa.Improved 1.0 | 9.2 | 6.2% | 3 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.7 | 30 / 35 | 5475 |
| 2 | 1 | 70.0 | 90.5 | 23 / 35 | 5488 |
| 3 | 1 | 67.6 | 80.0 | 24 / 35 | 5469 |
| 4 | 1 | 70.9 | 91.7 | 25 / 35 | 6105 |
| 5 | 1 | 68.8 | 84.1 | 22 / 35 | 5652 |
| 6 | 1 | 70.6 | 94.3 | 27 / 35 | 5349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 87% |
| oog.melee.CapuletDroid 1.1 | 27 | 100% |
| arthord.NanoSatanMelee Beta | 23 | 87% |
| gh.nano.Grofvuil 0.2 | 15 | 100% |
| fm.claire 1.7 | 9 | 89% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 33% | 75 |
| arthord.NanoSatanMelee Beta | 9 | 15% | 25 |
| oog.melee.CapuletDroid 1.1 | 6 | 10% | 36 |
| gh.nano.Grofvuil 0.2 | 6 | 10% | 21 |
| fm.claire 1.7 | 6 | 10% | 14 |
| winamp32.micro.MicroMacro 1.0 | 4 | 7% | 12 |
| sample.SpinBot 1.0 | 4 | 7% | 11 |
| pa.Improved 1.0 | 3 | 5% | 4 |
| kurios.DOSexe .9b | 2 | 3% | 9 |

## Melee bench: F07

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.9 | 105 / 210 | 2.45 | 18.5% | 34309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.5% | 105 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.6% | 29 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.1% | 31 |
| mz.MicroGodMelee 1 | 3.3 | 13.1% | 35 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.0% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 17 / 35 | 5990 |
| 2 | 1 | 67.6 | 81.0 | 17 / 35 | 5683 |
| 3 | 1 | 68.5 | 86.7 | 16 / 35 | 5674 |
| 4 | 1 | 68.5 | 83.5 | 17 / 35 | 5643 |
| 5 | 1 | 66.8 | 76.8 | 16 / 35 | 5560 |
| 6 | 1 | 69.7 | 90.2 | 22 / 35 | 5759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 81% |
| mz.MicroGodMelee 1 | 34 | 59% |
| gh.micro.Gruweltje 0.7 | 23 | 78% |
| DBall.Anarchy 0.1 | 13 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 30 | 29% | 76 |
| gh.micro.Gruweltje 0.7 | 30 | 29% | 51 |
| mz.MicroGodMelee 1 | 29 | 28% | 47 |
| acogdev.alpha 0.2 | 7 | 7% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| DBall.Anarchy 0.1 | 3 | 3% | 11 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.3 | 108 / 210 | 3.40 | 16.9% | 31609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 16.9% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 30 |
| germ.TheMind .2 | 4.7 | 9.9% | 9 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.9% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.8% | 5 |
| awesomeness.Elite 1.0 | 6.5 | 8.7% | 8 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.2% | 2 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 66.0 | 14 / 35 | 4876 |
| 2 | 1 | 66.0 | 73.0 | 20 / 35 | 5498 |
| 3 | 1 | 66.9 | 76.8 | 20 / 35 | 5548 |
| 4 | 1 | 66.8 | 78.7 | 19 / 35 | 5212 |
| 5 | 1 | 66.8 | 76.2 | 18 / 35 | 5539 |
| 6 | 1 | 63.8 | 68.9 | 17 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 76% |
| qualidafial.MajorDick 1.0.1 | 11 | 82% |
| germ.TheMind .2 | 10 | 80% |
| awesomeness.Elite 1.0 | 8 | 63% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 37% | 93 |
| germ.TheMind .2 | 18 | 18% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 15% | 35 |
| qualidafial.MajorDick 1.0.1 | 9 | 9% | 11 |
| awesomeness.Elite 1.0 | 8 | 8% | 15 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 12 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.1 | 150 / 210 | 1.98 | 19.9% | 30764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.9% | 150 |
| rz.HawkOnFire 0.1 | 2.0 | 13.1% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.5% | 8 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.0% | 2 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 7 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 5 |
| ratosh.Wesco 1.4 | 7.8 | 8.3% | 7 |
| stelo.PatternRobot 1.0 | 8.2 | 7.6% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.7 | 23 / 35 | 4958 |
| 2 | 1 | 70.6 | 91.1 | 25 / 35 | 5183 |
| 3 | 1 | 68.8 | 87.9 | 23 / 35 | 4713 |
| 4 | 1 | 68.0 | 81.9 | 22 / 35 | 5027 |
| 5 | 1 | 72.0 | 94.0 | 29 / 35 | 5396 |
| 6 | 1 | 71.8 | 94.0 | 28 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 58 | 91% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 20 | 85% |
| maribo.IotaCT 1.1 | 16 | 94% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 70% |
| spinnercat.Omen 1.0 | 8 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 60 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 27% | 58 |
| stelo.PatternRobot 1.0 | 10 | 17% | 23 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 16 |
| ratosh.Wesco 1.4 | 8 | 13% | 18 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 48 |
| maribo.IotaCT 1.1 | 4 | 7% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 13 |
| spinnercat.Omen 1.0 | 2 | 3% | 10 |

## Melee bench: F10

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.2 | 151 / 210 | 2.24 | 20.3% | 38033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.3% | 151 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 18 |
| baal.nano.N 1.42 | 2.7 | 11.4% | 9 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.1% | 4 |
| zyx.micro.Ant 1.1 | 5.8 | 9.3% | 10 |
| cvt.Firsty 1.0 | 6.7 | 8.1% | 9 |
| sanja.First 0.1 | 6.7 | 8.4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.4 | 28 / 35 | 6878 |
| 2 | 1 | 71.1 | 90.8 | 26 / 35 | 6641 |
| 3 | 1 | 71.0 | 90.8 | 26 / 35 | 6317 |
| 4 | 1 | 68.7 | 82.2 | 24 / 35 | 6226 |
| 5 | 1 | 67.5 | 79.0 | 19 / 35 | 5962 |
| 6 | 1 | 70.3 | 88.9 | 28 / 35 | 6009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 35 | 94% |
| cvt.Firsty 1.0 | 31 | 90% |
| baal.nano.N 1.42 | 30 | 90% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| sanja.First 0.1 | 17 | 88% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 30% | 42 |
| cvt.Firsty 1.0 | 10 | 17% | 25 |
| tvv.nano.Polaris 1.2 | 8 | 13% | 45 |
| Grystrion.TrackerWO 1.0 | 8 | 13% | 22 |
| baal.nano.N 1.42 | 6 | 10% | 33 |
| sample.RamFire 1.0 | 5 | 8% | 6 |
| sanja.First 0.1 | 2 | 3% | 21 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 7 |

## Melee bench: F11

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.8 | 76 / 210 | 3.63 | 15.8% | 31157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.3 | 15.8% | 76 |
| kc.micro.Figment 1.0 | 1.7 | 15.9% | 80 |
| cs.Wren 1.0 | 3.3 | 12.0% | 17 |
| js.PinBall 1.6 | 4.2 | 11.1% | 18 |
| mz.Cork 0.1 | 4.5 | 10.7% | 8 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 4 |
| evd.X1 0.01 | 6.7 | 8.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.1 | 14 / 35 | 5225 |
| 2 | 1 | 66.2 | 79.0 | 16 / 35 | 5191 |
| 3 | 2 | 64.1 | 71.1 | 10 / 35 | 5333 |
| 4 | 2 | 60.0 | 59.0 | 8 / 35 | 4797 |
| 5 | 1 | 63.2 | 66.3 | 15 / 35 | 5180 |
| 6 | 1 | 64.2 | 71.1 | 13 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 61 | 62% |
| cs.Wren 1.0 | 18 | 78% |
| js.PinBall 1.6 | 13 | 69% |
| mz.Cork 0.1 | 8 | 88% |
| jsal.Jsalbot 1.0 | 6 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 44% | 100 |
| evd.X1 0.01 | 19 | 14% | 19 |
| cs.Wren 1.0 | 17 | 13% | 26 |
| joe.ADinosaur 1.0 | 11 | 8% | 15 |
| js.PinBall 1.6 | 9 | 7% | 19 |
| mz.Cork 0.1 | 9 | 7% | 17 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.3 | 115 / 210 | 2.78 | 18.1% | 29650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.1% | 115 |
| myl.nano.Graviton 1.10 | 2.7 | 11.8% | 25 |
| ntc.Opposite 1.5 | 3.0 | 11.6% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.5% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.5% | 1 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 9 |
| disan.Chair 2.2.0 | 7.5 | 8.2% | 8 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 4 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.6 | 19 / 35 | 4738 |
| 2 | 1 | 69.6 | 88.6 | 23 / 35 | 5404 |
| 3 | 1 | 65.8 | 74.9 | 17 / 35 | 5060 |
| 4 | 1 | 67.4 | 79.4 | 20 / 35 | 5286 |
| 5 | 1 | 65.2 | 73.7 | 17 / 35 | 4804 |
| 6 | 1 | 67.1 | 84.4 | 19 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 72% |
| myl.nano.Graviton 1.10 | 30 | 80% |
| ntc.Opposite 1.5 | 19 | 100% |
| disan.Chair 2.2.0 | 17 | 82% |
| DBall.NUKE 0.1 | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pbg.R2D2 1.0 | 3 | 67% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 19% | 40 |
| stelo.AreaTargetingBot 1.1 | 19 | 19% | 39 |
| pfvicm.Sobieski 7.2.3b | 17 | 17% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 16% | 27 |
| disan.Chair 2.2.0 | 12 | 12% | 21 |
| ntc.Opposite 1.5 | 11 | 11% | 26 |
| DBall.NUKE 0.1 | 3 | 3% | 18 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 64.2 | 64 / 210 | 4.22 | 14.1% | 24569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.8% | 50 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 54 |
| hadur117.micro.SaorWNB 0.1 | 2.7 | 14.1% | 64 |
| yagami.Tidus 0.11 | 4.2 | 12.3% | 8 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.6% | 21 |
| ejb.Polaris 1.0.1 | 5.5 | 10.7% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.1% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 1 |
| kurios.DOSexe .9a | 8.8 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 62.9 | 8 / 35 | 4098 |
| 2 | 4 | 59.7 | 59.4 | 7 / 35 | 3652 |
| 3 | 1 | 64.7 | 73.0 | 14 / 35 | 4288 |
| 4 | 2 | 61.6 | 63.8 | 13 / 35 | 4038 |
| 5 | 4 | 61.0 | 60.3 | 9 / 35 | 4230 |
| 6 | 2 | 63.1 | 65.7 | 13 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 61% |
| kawigi.micro.Shiz 1.1 | 21 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 94% |
| yagami.Tidus 0.11 | 10 | 90% |
| ejb.Polaris 1.0.1 | 5 | 40% |

Hadur died in 146 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 40% | 74 |
| yagami.Tidus 0.11 | 25 | 17% | 37 |
| kawigi.micro.Shiz 1.1 | 18 | 12% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 34 |
| ejb.Polaris 1.0.1 | 11 | 8% | 15 |
| kurios.DOSexe .9a | 10 | 7% | 9 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.6 | 135 / 210 | 2.75 | 17.8% | 27766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 17.8% | 135 |
| bzdp.Pansy 2.1 | 2.3 | 12.3% | 21 |
| wee.Gem 1.8.4 | 3.5 | 11.6% | 23 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 9 |
| ratosh.Nobo 0.21 | 5.0 | 10.8% | 9 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 9.5% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 23 / 35 | 4849 |
| 2 | 1 | 66.7 | 79.4 | 20 / 35 | 4399 |
| 3 | 1 | 65.9 | 79.0 | 24 / 35 | 4260 |
| 4 | 1 | 65.7 | 76.2 | 22 / 35 | 4574 |
| 5 | 1 | 68.7 | 87.0 | 24 / 35 | 4853 |
| 6 | 1 | 67.2 | 83.2 | 22 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 84% |
| wee.Gem 1.8.4 | 42 | 95% |
| wompi.Quokka 1.6 | 27 | 96% |
| ratosh.Nobo 0.21 | 13 | 85% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 20% | 57 |
| wompi.Quokka 1.6 | 10 | 13% | 26 |
| ratosh.Nobo 0.21 | 10 | 13% | 22 |
| bayen.UbaMicro 1.4 | 10 | 13% | 18 |
| maribo.FollowFire 1 | 8 | 11% | 7 |
| m3thos.Eva00 1.1 | 7 | 9% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 9 |
| wee.Gem 1.8.4 | 4 | 5% | 47 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 5 |

## Melee bench: F15

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 86.7 | 116 / 210 | 2.20 | 20.6% | 44383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.6% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 64 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 16 |
| ayk.WallHugger 1.0 | 4.5 | 9.7% | 4 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 6 |
| stuff.Vlad 0.1 | 6.3 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.2% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 94.3 | 21 / 35 | 7690 |
| 2 | 1 | 70.7 | 84.4 | 17 / 35 | 6968 |
| 3 | 1 | 71.4 | 84.8 | 20 / 35 | 7449 |
| 4 | 1 | 71.4 | 82.2 | 19 / 35 | 7585 |
| 5 | 1 | 72.3 | 88.9 | 20 / 35 | 7471 |
| 6 | 1 | 71.2 | 85.4 | 19 / 35 | 7220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 73% |
| exauge.GateKeeper 1.1.121g | 15 | 80% |
| ayk.WallHugger 1.0 | 8 | 88% |
| mz.NanoGod 2.02 | 8 | 75% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 48% | 134 |
| mz.NanoGod 2.02 | 23 | 24% | 33 |
| exauge.GateKeeper 1.1.121g | 11 | 12% | 17 |
| ayk.WallHugger 1.0 | 6 | 6% | 13 |
| stelo.PianistNano 1.2 | 4 | 4% | 4 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| drd.Dreadknoght 0.9 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.8 | 104 / 210 | 3.36 | 16.8% | 29128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 16.8% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 22 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.0% | 18 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 14 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 2 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 14 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 73.0 | 18 / 35 | 4601 |
| 2 | 1 | 65.1 | 72.7 | 16 / 35 | 4724 |
| 3 | 1 | 67.0 | 78.4 | 19 / 35 | 5397 |
| 4 | 1 | 64.7 | 71.1 | 17 / 35 | 5053 |
| 5 | 1 | 65.1 | 75.2 | 19 / 35 | 4536 |
| 6 | 1 | 64.0 | 72.1 | 15 / 35 | 4817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 88% |
| dummy.micro.Sparrow 2.5 | 30 | 67% |
| bvh.micro.Freya 0.3 | 22 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 89% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 56 |
| dummy.micro.Sparrow 2.5 | 19 | 18% | 35 |
| conscience.Electron 1.3g | 17 | 16% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 31 |
| bvh.micro.Freya 0.3 | 12 | 11% | 25 |
| dl.BetterWalls 1.0 | 10 | 9% | 18 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 6 |

## Melee bench: F17

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 82.9 | 137 / 210 | 2.54 | 20.4% | 42095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.4% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.9% | 13 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 20 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.6% | 1 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 2 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 1 |
| sample.Corners 1.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 77.8 | 18 / 35 | 6561 |
| 2 | 1 | 72.2 | 86.7 | 26 / 35 | 7782 |
| 3 | 1 | 70.2 | 82.2 | 21 / 35 | 7108 |
| 4 | 1 | 70.9 | 84.1 | 25 / 35 | 7180 |
| 5 | 1 | 69.4 | 81.0 | 23 / 35 | 6700 |
| 6 | 1 | 70.8 | 85.7 | 24 / 35 | 6764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 44 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 91% |
| supersample.SuperBoxBot 1.0 | 24 | 75% |
| dsw.StaticD 1.0 | 11 | 55% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 36 | 49% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 16% | 52 |
| dsw.StaticD 1.0 | 8 | 11% | 15 |
| sul.Lunar 1.1 | 4 | 5% | 51 |
| mme.NikeEnhanced 2.0 | 4 | 5% | 11 |
| sample.Corners 1.0 | 4 | 5% | 11 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F18

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 77.8 | 112 / 210 | 3.00 | 18.1% | 37375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.1% | 112 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.8 | 12.4% | 26 |
| mld.Wisdom 1.0 | 4.0 | 11.3% | 14 |
| amz.NanoClone 1.41 | 4.7 | 10.8% | 19 |
| KiraNL.Chupacabra 0.4 | 6.0 | 9.4% | 7 |
| sample.Walls 1.0 | 6.8 | 8.4% | 8 |
| GarmBox.Oranges 1.0 | 8.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 2 |
| sample.Target 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 78.1 | 18 / 35 | 6246 |
| 2 | 1 | 65.6 | 73.0 | 19 / 35 | 5466 |
| 3 | 1 | 70.1 | 86.7 | 21 / 35 | 6935 |
| 4 | 1 | 68.7 | 82.2 | 19 / 35 | 6547 |
| 5 | 1 | 64.4 | 67.6 | 16 / 35 | 5825 |
| 6 | 1 | 67.8 | 79.4 | 19 / 35 | 6356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 60 | 83% |
| radnor.DoctorBob 1.42 | 27 | 93% |
| amz.NanoClone 1.41 | 13 | 85% |
| mld.Wisdom 1.0 | 9 | 56% |
| sample.Walls 1.0 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 29% | 56 |
| mld.Wisdom 1.0 | 18 | 18% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 17% | 61 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 25 |
| amz.NanoClone 1.41 | 12 | 12% | 18 |
| sample.Walls 1.0 | 5 | 5% | 13 |
| GarmBox.Oranges 1.0 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 1 | 1% | 4 |

