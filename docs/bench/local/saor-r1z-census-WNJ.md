# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 83.1 | 137 / 210 | 2.52 | 19.9% | 40744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 19.9% | 137 |
| radnor.DoctorBob 1.42 | 2.7 | 14.7% | 24 |
| mz.AntiGrav 1.0 | 3.0 | 14.3% | 17 |
| mld.Infinity 2.2 | 3.3 | 13.8% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 6 |
| sample.Walls 1.0 | 6.7 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.4% | 3 |
| GarmBox.Oranges 1.0 | 7.5 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.3 | 22 / 35 | 6384 |
| 2 | 1 | 72.9 | 90.8 | 25 / 35 | 7346 |
| 3 | 1 | 72.3 | 88.3 | 25 / 35 | 7197 |
| 4 | 1 | 68.3 | 74.6 | 18 / 35 | 6711 |
| 5 | 1 | 67.7 | 76.2 | 20 / 35 | 6022 |
| 6 | 1 | 71.9 | 87.3 | 27 / 35 | 7084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 59 | 98% |
| mld.Infinity 2.2 | 38 | 89% |
| radnor.DoctorBob 1.42 | 34 | 88% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 40% | 66 |
| mld.Infinity 2.2 | 20 | 27% | 54 |
| amz.NanoClone 1.41 | 11 | 15% | 13 |
| mz.AntiGrav 1.0 | 7 | 10% | 62 |
| sample.Walls 1.0 | 4 | 5% | 6 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.7 | 121 / 210 | 2.01 | 18.7% | 31926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 18.7% | 121 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 53 |
| mld.DustBunny 3.8 | 3.2 | 13.5% | 18 |
| maribo.melee.BMV 0.1 | 4.3 | 9.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 4.7 | 9.6% | 8 |
| zyx.nano.Ant 1.1 | 6.5 | 8.0% | 1 |
| bzdp.BoxCar 2.0 | 7.2 | 7.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 6.8% | 5 |
| fullsail.SweetTea 1.1 | 8.7 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.3 | 18 / 35 | 5491 |
| 2 | 1 | 68.7 | 90.5 | 21 / 35 | 5531 |
| 3 | 1 | 67.5 | 85.1 | 20 / 35 | 5325 |
| 4 | 1 | 69.0 | 90.8 | 24 / 35 | 4991 |
| 5 | 1 | 68.6 | 88.3 | 17 / 35 | 5517 |
| 6 | 1 | 68.7 | 89.5 | 21 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 65 | 69% |
| mld.DustBunny 3.8 | 58 | 84% |
| djdjdj.NanoSkunk10 1.0 | 13 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 44% | 85 |
| mld.DustBunny 3.8 | 27 | 30% | 76 |
| maribo.melee.BMV 0.1 | 8 | 9% | 11 |
| zyx.nano.Ant 1.1 | 4 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 13 |
| fullsail.SweetTea 1.1 | 3 | 3% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 2% | 7 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 82.2 | 123 / 210 | 2.60 | 19.4% | 37440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 19.4% | 123 |
| myl.micro.Troodon 1.10 | 2.2 | 15.0% | 48 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.1% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.9% | 21 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 4 |
| fm.mammillarias 1.3 | 5.8 | 8.7% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 2 |
| sample.Fire 1.0 | 9.3 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 71.4 | 15 / 35 | 5707 |
| 2 | 1 | 70.7 | 87.9 | 27 / 35 | 6266 |
| 3 | 1 | 68.3 | 80.0 | 17 / 35 | 6053 |
| 4 | 1 | 69.7 | 82.9 | 21 / 35 | 6298 |
| 5 | 1 | 70.4 | 85.4 | 21 / 35 | 6732 |
| 6 | 1 | 70.5 | 85.4 | 22 / 35 | 6384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 70% |
| myl.nano.KomoriNinja 1.1 | 23 | 91% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 30% | 47 |
| myl.micro.Troodon 1.10 | 21 | 24% | 68 |
| fm.mammillarias 1.3 | 15 | 17% | 16 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 38 |
| cb.nano.Insomnia 1.0 | 5 | 6% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 13 |
| sample.Fire 1.0 | 2 | 2% | 10 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 78.9 | 114 / 210 | 2.90 | 18.5% | 37748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 18.5% | 114 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.4% | 30 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 22 |
| tj.zombie1n 1.0.1 | 5.2 | 8.9% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.5% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.5% | 14 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 5 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 75.9 | 17 / 35 | 6462 |
| 2 | 1 | 69.2 | 84.4 | 22 / 35 | 6391 |
| 3 | 1 | 67.7 | 81.0 | 17 / 35 | 6110 |
| 4 | 1 | 67.9 | 79.0 | 21 / 35 | 6229 |
| 5 | 1 | 66.6 | 74.0 | 17 / 35 | 6197 |
| 6 | 1 | 68.0 | 79.0 | 20 / 35 | 6359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 83% |
| stelo.SoJNanoMelee 1.1 | 29 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 69% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| tvv.micro.Antares 1.1.1 | 8 | 75% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 43 | 45% | 98 |
| ers.nano.hawk.HawkLA 3.0m | 12 | 13% | 25 |
| stelo.SoJNanoMelee 1.1 | 9 | 9% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 9% | 10 |
| tvv.micro.Antares 1.1.1 | 7 | 7% | 23 |
| tj.zombie1n 1.0.1 | 7 | 7% | 10 |
| repositorio.NanoStep 1.0 | 4 | 4% | 10 |
| yk.JahMicro 1.0 | 3 | 3% | 8 |
| sample.VelociRobot 1.0 | 2 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 67.5 | 71 / 210 | 3.93 | 15.0% | 29173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.2 | 15.0% | 71 |
| oog.melee.Corsair 1.0 | 1.8 | 13.4% | 43 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.7% | 28 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.4% | 14 |
| EBBU.Sim2 1.02 | 6.5 | 9.5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 2 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 76.5 | 17 / 35 | 4916 |
| 2 | 1 | 64.7 | 72.4 | 16 / 35 | 5415 |
| 3 | 1 | 63.6 | 71.1 | 12 / 35 | 5303 |
| 4 | 1 | 59.5 | 60.0 | 9 / 35 | 4708 |
| 5 | 2 | 59.9 | 63.2 | 10 / 35 | 4450 |
| 6 | 1 | 59.4 | 61.6 | 7 / 35 | 4381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 53% |
| simonton.nano.MeleeSeed 1.8 | 21 | 81% |
| ahf.NanoAndrew .4 | 19 | 79% |
| sam.Samspin 1.0 | 9 | 100% |
| EBBU.Sim2 1.02 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 23% | 47 |
| ahf.NanoAndrew .4 | 19 | 14% | 37 |
| robar.nano.Assertive_Melee 0.2 | 18 | 13% | 22 |
| simonton.nano.MeleeSeed 1.8 | 16 | 11% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 11% | 14 |
| EBBU.Sim2 1.02 | 12 | 9% | 18 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 14 |
| sam.Samspin 1.0 | 10 | 7% | 15 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.4 | 122 / 210 | 2.76 | 18.0% | 31906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 18.0% | 122 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 30 |
| gh.nano.Grofvuil 0.2 | 3.3 | 12.0% | 13 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 10.8% | 21 |
| fm.claire 1.7 | 5.8 | 8.7% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.4% | 8 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 6 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 6 |
| pa.Improved 1.0 | 9.0 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 79.7 | 21 / 35 | 5761 |
| 2 | 1 | 64.5 | 76.2 | 16 / 35 | 4739 |
| 3 | 1 | 69.3 | 85.7 | 22 / 35 | 5996 |
| 4 | 1 | 63.5 | 68.9 | 19 / 35 | 4702 |
| 5 | 1 | 67.7 | 85.1 | 21 / 35 | 5088 |
| 6 | 1 | 68.7 | 87.0 | 23 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 79% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| arthord.NanoSatanMelee Beta | 12 | 100% |
| sample.SpinBot 1.0 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 36% | 84 |
| gh.nano.Grofvuil 0.2 | 16 | 18% | 25 |
| oog.melee.CapuletDroid 1.1 | 10 | 11% | 47 |
| fm.claire 1.7 | 9 | 10% | 13 |
| sample.SpinBot 1.0 | 8 | 9% | 10 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 10 |
| kurios.DOSexe .9b | 3 | 3% | 6 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.9 | 81 / 210 | 3.35 | 16.4% | 32298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.2 | 16.4% | 81 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.3% | 46 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.8% | 47 |
| mz.MicroGodMelee 1 | 4.0 | 13.1% | 25 |
| DBall.Anarchy 0.1 | 5.0 | 9.1% | 8 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.6% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.6% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 77.5 | 14 / 35 | 5491 |
| 2 | 1 | 63.9 | 70.8 | 15 / 35 | 4753 |
| 3 | 2 | 65.6 | 73.0 | 12 / 35 | 5683 |
| 4 | 1 | 66.0 | 76.8 | 16 / 35 | 5212 |
| 5 | 1 | 63.4 | 68.9 | 13 / 35 | 5148 |
| 6 | 1 | 65.9 | 76.2 | 11 / 35 | 6011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 79% |
| mz.MicroGodMelee 1 | 30 | 63% |
| gh.micro.Gruweltje 0.7 | 22 | 55% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 37 | 29% | 56 |
| gh.micro.Gruweltje 0.7 | 35 | 27% | 49 |
| spinnercat.micro.Tyger 0.1 | 28 | 22% | 60 |
| fire219.CatBot 1.0 | 9 | 7% | 9 |
| acogdev.alpha 0.2 | 8 | 6% | 10 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 10 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 64.8 | 75 / 210 | 4.17 | 14.9% | 30894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 15.6% | 57 |
| hadur117.micro.SaorWNJ 0.1 | 2.0 | 14.9% | 75 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 33 |
| germ.TheMind .2 | 4.5 | 10.0% | 8 |
| awesomeness.Elite 1.0 | 5.3 | 9.2% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 8.9% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.4% | 7 |
| sample.Crazy 1.0 | 8.3 | 7.3% | 5 |
| stelo.UntouchableNano 1.3 | 8.5 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 61.3 | 12 / 35 | 4895 |
| 2 | 2 | 59.0 | 57.8 | 12 / 35 | 4619 |
| 3 | 3 | 59.2 | 57.1 | 8 / 35 | 5046 |
| 4 | 1 | 65.7 | 73.7 | 16 / 35 | 5577 |
| 5 | 1 | 65.8 | 76.5 | 17 / 35 | 5217 |
| 6 | 2 | 62.1 | 62.2 | 10 / 35 | 5540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 76% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 5 | 40% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| germ.TheMind .2 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 43% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 19% | 41 |
| germ.TheMind .2 | 16 | 12% | 16 |
| awesomeness.Elite 1.0 | 13 | 10% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 7 |
| sample.Crazy 1.0 | 3 | 2% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.7 | 118 / 210 | 2.74 | 18.3% | 31124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 18.3% | 118 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.8% | 19 |
| maribo.IotaCT 1.1 | 4.0 | 11.0% | 10 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.0% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.7% | 5 |
| stelo.PatternRobot 1.0 | 7.7 | 8.4% | 11 |
| ratosh.Wesco 1.4 | 8.2 | 8.0% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.9 | 21 / 35 | 5331 |
| 2 | 1 | 68.9 | 83.5 | 21 / 35 | 5594 |
| 3 | 1 | 66.7 | 74.6 | 17 / 35 | 5355 |
| 4 | 1 | 68.6 | 82.2 | 21 / 35 | 5272 |
| 5 | 1 | 67.6 | 79.4 | 20 / 35 | 4619 |
| 6 | 1 | 67.8 | 82.5 | 18 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 90% |
| nz.jdc.nano.GridFu 1.0 | 24 | 88% |
| timmit.nano.TimDog 0.33 | 17 | 82% |
| stelo.PatternRobot 1.0 | 15 | 87% |
| maribo.IotaCT 1.1 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 30 | 32% | 45 |
| nz.jdc.nano.GridFu 1.0 | 14 | 15% | 34 |
| stelo.PatternRobot 1.0 | 13 | 14% | 27 |
| rz.HawkOnFire 0.1 | 12 | 13% | 49 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 9% | 16 |
| ratosh.Wesco 1.4 | 7 | 8% | 13 |
| maribo.IotaCT 1.1 | 6 | 6% | 17 |
| spinnercat.Omen 1.0 | 2 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.9 | 166 / 210 | 1.90 | 20.9% | 39017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 20.9% | 166 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 7 |
| tvv.nano.Polaris 1.2 | 3.0 | 11.5% | 14 |
| Grystrion.TrackerWO 1.0 | 3.7 | 10.6% | 7 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.4% | 3 |
| sanja.First 0.1 | 7.2 | 8.1% | 2 |
| cvt.Firsty 1.0 | 7.3 | 7.5% | 9 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.4 | 31 / 35 | 6899 |
| 2 | 1 | 69.9 | 87.0 | 26 / 35 | 6076 |
| 3 | 1 | 70.1 | 87.9 | 27 / 35 | 6288 |
| 4 | 1 | 72.0 | 94.3 | 32 / 35 | 6441 |
| 5 | 1 | 68.5 | 85.7 | 20 / 35 | 6241 |
| 6 | 1 | 72.0 | 92.4 | 30 / 35 | 7072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 95% |
| cvt.Firsty 1.0 | 28 | 93% |
| sanja.First 0.1 | 26 | 100% |
| Grystrion.TrackerWO 1.0 | 22 | 100% |
| baal.nano.N 1.42 | 19 | 89% |
| zyx.micro.Ant 1.1 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 8 | 88% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 27% | 35 |
| Grystrion.TrackerWO 1.0 | 9 | 20% | 28 |
| baal.nano.N 1.42 | 7 | 16% | 35 |
| tvv.nano.Polaris 1.2 | 6 | 13% | 45 |
| cvt.Firsty 1.0 | 3 | 7% | 26 |
| sample.RamFire 1.0 | 3 | 7% | 3 |
| sanja.First 0.1 | 2 | 4% | 22 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 61.8 | 71 / 210 | 4.44 | 14.0% | 28909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.5% | 75 |
| hadur117.micro.SaorWNJ 0.1 | 2.2 | 14.0% | 71 |
| cs.Wren 1.0 | 2.8 | 13.2% | 23 |
| mz.Cork 0.1 | 4.3 | 10.9% | 11 |
| js.PinBall 1.6 | 4.5 | 11.1% | 17 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 2 |
| evd.X1 0.01 | 7.0 | 8.3% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 7 |
| PSW.Relentless 0.1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 61.6 | 11 / 35 | 5053 |
| 2 | 2 | 61.6 | 68.9 | 10 / 35 | 4719 |
| 3 | 3 | 58.9 | 57.5 | 10 / 35 | 4704 |
| 4 | 2 | 61.1 | 62.2 | 15 / 35 | 4791 |
| 5 | 1 | 63.3 | 67.9 | 18 / 35 | 5034 |
| 6 | 3 | 57.0 | 52.7 | 7 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 40 | 73% |
| cs.Wren 1.0 | 24 | 67% |
| mz.Cork 0.1 | 11 | 91% |
| js.PinBall 1.6 | 7 | 86% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 44 | 31% | 77 |
| cs.Wren 1.0 | 28 | 20% | 37 |
| joe.ADinosaur 1.0 | 16 | 11% | 18 |
| evd.X1 0.01 | 14 | 10% | 14 |
| mz.Cork 0.1 | 13 | 9% | 21 |
| js.PinBall 1.6 | 13 | 9% | 20 |
| PSW.Relentless 0.1 | 8 | 6% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 10 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.3 | 89 / 210 | 3.58 | 16.2% | 29329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 16.2% | 89 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 34 |
| ntc.Opposite 1.5 | 3.2 | 11.9% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.8% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.1% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.8% | 19 |
| DBall.NUKE 0.1 | 6.7 | 8.8% | 14 |
| disan.Chair 2.2.0 | 7.7 | 8.2% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.6% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 69.5 | 12 / 35 | 4612 |
| 2 | 1 | 66.9 | 79.0 | 18 / 35 | 5404 |
| 3 | 1 | 63.4 | 68.6 | 15 / 35 | 4961 |
| 4 | 1 | 65.4 | 76.2 | 19 / 35 | 4731 |
| 5 | 1 | 63.1 | 67.0 | 13 / 35 | 4809 |
| 6 | 1 | 62.9 | 67.6 | 12 / 35 | 4812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 82% |
| stelo.AreaTargetingBot 1.1 | 23 | 83% |
| DBall.NUKE 0.1 | 12 | 83% |
| ntc.Opposite 1.5 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 10 | 70% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| pbg.R2D2 1.0 | 6 | 83% |
| disan.Chair 2.2.0 | 5 | 80% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 34 | 27% | 39 |
| ntc.Opposite 1.5 | 19 | 15% | 27 |
| stelo.AreaTargetingBot 1.1 | 18 | 15% | 35 |
| myl.nano.Graviton 1.10 | 17 | 14% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 11% | 21 |
| disan.Chair 2.2.0 | 10 | 8% | 14 |
| DBall.NUKE 0.1 | 6 | 5% | 14 |
| pbg.R2D2 1.0 | 3 | 2% | 10 |
| donjezza.Muncho 1.0 | 3 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 63.1 | 66 / 210 | 4.32 | 13.9% | 24987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.3% | 48 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 42 |
| hadur117.micro.SaorWNJ 0.1 | 2.7 | 13.9% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 23 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 11.0% | 15 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.6 | 49.8 | 9 / 35 | 3903 |
| 2 | 2 | 62.9 | 67.9 | 12 / 35 | 4354 |
| 3 | 3 | 59.3 | 61.6 | 7 / 35 | 4058 |
| 4 | 4 | 59.4 | 58.7 | 10 / 35 | 3655 |
| 5 | 1 | 64.5 | 70.5 | 13 / 35 | 4733 |
| 6 | 1 | 63.7 | 69.8 | 15 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 63% |
| kawigi.micro.Shiz 1.1 | 22 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 69% |
| yagami.Tidus 0.11 | 14 | 100% |
| ejb.Polaris 1.0.1 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 37% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% | 36 |
| yagami.Tidus 0.11 | 17 | 12% | 27 |
| step.nanoPri 1.0 | 12 | 8% | 15 |
| ejb.Polaris 1.0.1 | 11 | 8% | 18 |
| stelo.MirrorNano 1.3 | 11 | 8% | 12 |
| kawigi.micro.Shiz 1.1 | 10 | 7% | 24 |
| kurios.DOSexe .9a | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 67.4 | 92 / 210 | 3.94 | 15.0% | 26121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 15.0% | 92 |
| bzdp.Pansy 2.1 | 3.0 | 12.6% | 28 |
| ratosh.Nobo 0.21 | 3.3 | 12.3% | 23 |
| wee.Gem 1.8.4 | 3.7 | 12.0% | 28 |
| wompi.Quokka 1.6 | 4.2 | 11.5% | 18 |
| m3thos.Eva00 1.1 | 6.0 | 10.1% | 15 |
| bayen.UbaMicro 1.4 | 7.2 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.6 | 59.0 | 15 / 35 | 4294 |
| 2 | 1 | 62.6 | 66.3 | 15 / 35 | 4653 |
| 3 | 1 | 64.8 | 76.2 | 19 / 35 | 4659 |
| 4 | 1 | 61.6 | 67.6 | 11 / 35 | 4035 |
| 5 | 1 | 64.3 | 75.2 | 18 / 35 | 4192 |
| 6 | 1 | 59.6 | 59.7 | 14 / 35 | 4288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 34 | 88% |
| wee.Gem 1.8.4 | 31 | 94% |
| wompi.Quokka 1.6 | 18 | 94% |
| ratosh.Nobo 0.21 | 13 | 62% |
| m3thos.Eva00 1.1 | 6 | 83% |
| bayen.UbaMicro 1.4 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 19 | 16% | 49 |
| maribo.FollowFire 1 | 18 | 15% | 18 |
| bzdp.Pansy 2.1 | 16 | 14% | 40 |
| ratosh.Nobo 0.21 | 16 | 14% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 16 | 14% | 19 |
| wompi.Quokka 1.6 | 13 | 11% | 26 |
| bayen.UbaMicro 1.4 | 13 | 11% | 17 |
| m3thos.Eva00 1.1 | 5 | 4% | 11 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 4 |

## Melee bench: F15

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 78.3 | 94 / 210 | 2.96 | 18.9% | 43997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.0% | 88 |
| hadur117.micro.SaorWNJ 0.1 | 1.7 | 18.9% | 94 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 20 |
| ayk.WallHugger 1.0 | 4.2 | 10.6% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 3 |
| stuff.Vlad 0.1 | 6.2 | 8.1% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 76.5 | 15 / 35 | 7404 |
| 2 | 2 | 70.4 | 80.3 | 14 / 35 | 7737 |
| 3 | 1 | 69.8 | 78.7 | 18 / 35 | 7204 |
| 4 | 1 | 70.8 | 85.1 | 17 / 35 | 7047 |
| 5 | 2 | 68.8 | 74.9 | 12 / 35 | 7279 |
| 6 | 2 | 69.2 | 74.0 | 18 / 35 | 7326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 76% |
| mz.NanoGod 2.02 | 10 | 20% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| exauge.GateKeeper 1.1.121g | 6 | 83% |
| ayk.WallHugger 1.0 | 4 | 75% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 41% | 126 |
| mz.NanoGod 2.02 | 40 | 34% | 41 |
| ayk.WallHugger 1.0 | 16 | 14% | 18 |
| exauge.GateKeeper 1.1.121g | 9 | 8% | 12 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 64.2 | 78 / 210 | 4.22 | 14.8% | 28687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.2 | 14.8% | 78 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.9% | 28 |
| bvh.micro.Freya 0.3 | 3.3 | 11.6% | 20 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 31 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.5% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.5% | 9 |
| conscience.Electron 1.3g | 6.8 | 8.8% | 4 |
| dl.BetterWalls 1.0 | 8.2 | 7.6% | 8 |
| ap.Frederick 1.1 | 8.7 | 7.0% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 64.4 | 11 / 35 | 4553 |
| 2 | 1 | 61.2 | 61.9 | 14 / 35 | 4766 |
| 3 | 1 | 63.0 | 67.6 | 15 / 35 | 4665 |
| 4 | 1 | 64.8 | 72.1 | 17 / 35 | 5241 |
| 5 | 2 | 58.7 | 59.4 | 9 / 35 | 4652 |
| 6 | 1 | 60.7 | 59.7 | 12 / 35 | 4810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 71% |
| dummy.micro.Sparrow 2.5 | 22 | 95% |
| bvh.micro.Freya 0.3 | 11 | 82% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 33 | 25% | 35 |
| dummy.micro.Sparrow 2.5 | 20 | 15% | 40 |
| voidious.micro.BlitzBat 1.05 | 18 | 14% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 13% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 11% | 12 |
| bvh.micro.Freya 0.3 | 13 | 10% | 19 |
| dl.BetterWalls 1.0 | 13 | 10% | 16 |
| stelo.MirrorMicro 1.0 | 4 | 3% | 8 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 81.5 | 120 / 210 | 2.67 | 19.6% | 41307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.0 | 19.6% | 120 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 29 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.1% | 26 |
| sul.Lunar 1.1 | 3.8 | 11.4% | 15 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.6% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 7 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 5 |
| sample.Corners 1.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 77.8 | 19 / 35 | 7110 |
| 2 | 1 | 70.1 | 86.3 | 18 / 35 | 6740 |
| 3 | 1 | 70.1 | 81.3 | 21 / 35 | 7055 |
| 4 | 1 | 70.6 | 83.8 | 21 / 35 | 7564 |
| 5 | 1 | 69.7 | 82.5 | 23 / 35 | 6707 |
| 6 | 1 | 67.1 | 77.1 | 18 / 35 | 6131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 87% |
| sul.Lunar 1.1 | 36 | 97% |
| supersample.SuperBoxBot 1.0 | 25 | 52% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 78% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| dsw.StaticD 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 32 | 35% | 67 |
| supersample.SuperBoxBot 1.0 | 31 | 34% | 45 |
| dsw.StaticD 1.0 | 10 | 11% | 16 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 10 |
| sample.Corners 1.0 | 4 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 4% | 6 |
| sul.Lunar 1.1 | 3 | 3% | 39 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 10 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 8 |

## Melee bench: F18

hadur117.micro.SaorWNJ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 65.4 | 66 / 210 | 4.11 | 14.7% | 32348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNJ 0.1 | 1.7 | 14.7% | 66 |
| radnor.DoctorBob 1.42 | 2.2 | 14.1% | 38 |
| mld.Wisdom 1.0 | 3.0 | 13.3% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.5% | 38 |
| amz.NanoClone 1.41 | 4.8 | 11.0% | 22 |
| KiraNL.Chupacabra 0.4 | 6.2 | 9.4% | 7 |
| sample.Walls 1.0 | 7.0 | 8.2% | 7 |
| GarmBox.Oranges 1.0 | 7.7 | 7.1% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.2% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 57.8 | 9 / 35 | 5210 |
| 2 | 2 | 63.1 | 67.0 | 10 / 35 | 5756 |
| 3 | 1 | 62.2 | 68.3 | 12 / 35 | 5356 |
| 4 | 1 | 63.3 | 72.1 | 13 / 35 | 4908 |
| 5 | 1 | 61.6 | 61.3 | 12 / 35 | 5391 |
| 6 | 2 | 63.0 | 66.0 | 10 / 35 | 5727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 78% |
| radnor.DoctorBob 1.42 | 26 | 69% |
| mld.Wisdom 1.0 | 13 | 69% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 46 | 32% | 53 |
| radnor.DoctorBob 1.42 | 35 | 24% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 26 | 18% | 45 |
| amz.NanoClone 1.41 | 13 | 9% | 21 |
| KiraNL.Chupacabra 0.4 | 13 | 9% | 17 |
| sample.Walls 1.0 | 6 | 4% | 11 |
| jangs.ns51 1.0 | 3 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 3 |

