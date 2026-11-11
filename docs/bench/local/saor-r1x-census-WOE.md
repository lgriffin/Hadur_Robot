# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.6 | 143 / 210 | 2.11 | 21.0% | 44234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 21.0% | 143 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 20 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 24 |
| mld.Infinity 2.2 | 3.5 | 12.6% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 3 |
| sample.Walls 1.0 | 6.2 | 7.4% | 1 |
| jangs.ns51 1.0 | 7.2 | 6.6% | 5 |
| GarmBox.Oranges 1.0 | 7.7 | 6.6% | 0 |
| sample.Target 1.0 | 9.5 | 3.9% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 86.7 | 20 / 35 | 7379 |
| 2 | 1 | 72.3 | 88.3 | 26 / 35 | 7622 |
| 3 | 1 | 73.2 | 92.4 | 24 / 35 | 7882 |
| 4 | 1 | 71.9 | 89.5 | 24 / 35 | 7100 |
| 5 | 1 | 70.1 | 82.5 | 23 / 35 | 6983 |
| 6 | 1 | 71.3 | 86.3 | 26 / 35 | 7268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 91% |
| mld.Infinity 2.2 | 37 | 100% |
| radnor.DoctorBob 1.42 | 32 | 78% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 42% | 62 |
| mz.AntiGrav 1.0 | 16 | 24% | 69 |
| mld.Infinity 2.2 | 7 | 10% | 39 |
| jangs.ns51 1.0 | 6 | 9% | 14 |
| amz.NanoClone 1.41 | 4 | 6% | 12 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |
| sample.Walls 1.0 | 1 | 1% | 7 |

## Melee bench: F02

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.7 | 125 / 210 | 2.10 | 18.6% | 30167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 18.6% | 125 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 52 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 20 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 4.8 | 9.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.0% | 6 |
| zyx.nano.Ant 1.1 | 7.2 | 8.0% | 0 |
| bzdp.BoxCar 2.0 | 8.2 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.8 | 5.5% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.7 | 24 / 35 | 5553 |
| 2 | 1 | 67.2 | 84.8 | 16 / 35 | 5256 |
| 3 | 1 | 66.5 | 84.1 | 16 / 35 | 4711 |
| 4 | 1 | 70.5 | 95.2 | 27 / 35 | 5319 |
| 5 | 1 | 69.0 | 91.1 | 23 / 35 | 4975 |
| 6 | 1 | 66.9 | 84.4 | 19 / 35 | 4353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 76% |
| mld.DustBunny 3.8 | 50 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| maribo.melee.BMV 0.1 | 12 | 92% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 28 | 33% | 75 |
| oog.melee.Mercutio 1.0 | 28 | 33% | 71 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 20 |
| maribo.melee.BMV 0.1 | 7 | 8% | 17 |
| zyx.nano.Ant 1.1 | 7 | 8% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 10 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 85.5 | 124 / 210 | 2.30 | 20.0% | 38241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 20.0% | 124 |
| myl.micro.Troodon 1.10 | 2.2 | 14.1% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.6% | 17 |
| fm.mammillarias 1.3 | 5.3 | 9.0% | 3 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.0% | 11 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.7% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 7.0% | 4 |
| sample.Fire 1.0 | 9.0 | 5.3% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.1 | 22 / 35 | 6789 |
| 2 | 1 | 69.1 | 83.8 | 20 / 35 | 5955 |
| 3 | 1 | 70.6 | 87.9 | 21 / 35 | 6447 |
| 4 | 1 | 71.0 | 88.9 | 22 / 35 | 6667 |
| 5 | 1 | 69.6 | 85.4 | 20 / 35 | 6365 |
| 6 | 1 | 68.8 | 81.9 | 19 / 35 | 6018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 78% |
| cb.nano.Insomnia 1.0 | 27 | 89% |
| sp.Nanos.Ember 1.1 | 14 | 93% |
| myl.nano.KomoriNinja 1.1 | 12 | 92% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 28% | 47 |
| myl.micro.Troodon 1.10 | 20 | 23% | 62 |
| myl.nano.KomoriNinja 1.1 | 12 | 14% | 32 |
| fm.mammillarias 1.3 | 12 | 14% | 17 |
| cb.nano.Insomnia 1.0 | 11 | 13% | 19 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 20 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 6 |
| sample.Fire 1.0 | 0 | 0% | 5 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.3 | 152 / 210 | 1.78 | 21.2% | 39955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 21.2% | 152 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 15 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 8.9% | 5 |
| yk.JahMicro 1.0 | 6.3 | 8.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 28 / 35 | 6552 |
| 2 | 1 | 70.0 | 86.7 | 24 / 35 | 6375 |
| 3 | 1 | 71.2 | 92.1 | 27 / 35 | 6309 |
| 4 | 1 | 72.1 | 93.7 | 26 / 35 | 6955 |
| 5 | 1 | 70.9 | 88.6 | 23 / 35 | 6790 |
| 6 | 1 | 71.9 | 93.3 | 24 / 35 | 6974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 87% |
| stelo.SoJNanoMelee 1.1 | 45 | 89% |
| tvv.micro.Antares 1.1.1 | 25 | 84% |
| tj.zombie1n 1.0.1 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 75% |
| yk.JahMicro 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 33% | 83 |
| stelo.SoJNanoMelee 1.1 | 14 | 24% | 43 |
| tvv.micro.Antares 1.1.1 | 11 | 19% | 31 |
| tj.zombie1n 1.0.1 | 5 | 9% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 4 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.6 | 84 / 210 | 3.56 | 16.1% | 30297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 16.1% | 84 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 26 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 24 |
| EBBU.Sim2 1.02 | 5.3 | 10.0% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.5% | 11 |
| sam.Samspin 1.0 | 6.5 | 9.1% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.9 | 16 / 35 | 5582 |
| 2 | 1 | 60.5 | 65.1 | 11 / 35 | 4529 |
| 3 | 1 | 65.2 | 74.3 | 16 / 35 | 5061 |
| 4 | 1 | 63.2 | 67.6 | 14 / 35 | 5092 |
| 5 | 1 | 67.5 | 83.5 | 19 / 35 | 5258 |
| 6 | 1 | 60.8 | 63.2 | 8 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 29 | 79% |
| oog.melee.Corsair 1.0 | 25 | 68% |
| ahf.NanoAndrew .4 | 22 | 91% |
| sam.Samspin 1.0 | 10 | 90% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 17% | 41 |
| ahf.NanoAndrew .4 | 22 | 17% | 41 |
| robar.nano.Assertive_Melee 0.2 | 22 | 17% | 24 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 35 |
| sam.Samspin 1.0 | 14 | 11% | 21 |
| EBBU.Sim2 1.02 | 13 | 10% | 18 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 7 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.6 | 128 / 210 | 2.39 | 18.7% | 31908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 18.7% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 14 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.7% | 8 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 5 |
| fm.claire 1.7 | 5.8 | 8.7% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.5% | 8 |
| sample.SpinBot 1.0 | 6.8 | 8.0% | 6 |
| pa.Improved 1.0 | 9.2 | 5.8% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.7 | 22 / 35 | 5671 |
| 2 | 1 | 65.1 | 76.8 | 15 / 35 | 4982 |
| 3 | 1 | 68.9 | 85.4 | 23 / 35 | 5594 |
| 4 | 1 | 70.4 | 92.1 | 25 / 35 | 5749 |
| 5 | 1 | 67.8 | 84.8 | 21 / 35 | 4941 |
| 6 | 1 | 67.1 | 81.9 | 22 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 78% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| arthord.NanoSatanMelee Beta | 20 | 90% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| sample.SpinBot 1.0 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| fm.claire 1.7 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 38% | 76 |
| gh.nano.Grofvuil 0.2 | 11 | 13% | 31 |
| sample.SpinBot 1.0 | 10 | 12% | 14 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 40 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 22 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 11 |
| fm.claire 1.7 | 3 | 4% | 5 |
| kurios.DOSexe .9b | 2 | 2% | 8 |
| pa.Improved 1.0 | 2 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.6 | 109 / 210 | 2.48 | 18.4% | 34353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 18.4% | 109 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.5% | 32 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 31 |
| mz.MicroGodMelee 1 | 3.7 | 12.7% | 21 |
| DBall.Anarchy 0.1 | 5.0 | 9.0% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.1% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 7 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.5 | 18 / 35 | 5872 |
| 2 | 1 | 65.7 | 78.4 | 15 / 35 | 5224 |
| 3 | 1 | 69.2 | 87.6 | 20 / 35 | 5739 |
| 4 | 1 | 69.6 | 88.3 | 19 / 35 | 6317 |
| 5 | 1 | 66.4 | 78.7 | 16 / 35 | 5291 |
| 6 | 1 | 69.2 | 86.0 | 21 / 35 | 5910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 77% |
| mz.MicroGodMelee 1 | 37 | 78% |
| gh.micro.Gruweltje 0.7 | 28 | 64% |
| DBall.Anarchy 0.1 | 13 | 100% |
| el.JumpShoot 0.2 | 3 | 33% |
| acogdev.alpha 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 32% | 66 |
| gh.micro.Gruweltje 0.7 | 25 | 25% | 47 |
| mz.MicroGodMelee 1 | 21 | 21% | 50 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 10 |
| DBall.Anarchy 0.1 | 4 | 4% | 16 |
| el.JumpShoot 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| acogdev.alpha 0.2 | 3 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 5 |

## Melee bench: F08

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.8 | 98 / 210 | 3.62 | 15.9% | 30433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.3 | 15.9% | 98 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.0% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.6% | 30 |
| germ.TheMind .2 | 4.7 | 10.6% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.6% | 7 |
| sample.Crazy 1.0 | 8.8 | 6.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.6 | 17 / 35 | 4749 |
| 2 | 1 | 62.7 | 67.0 | 15 / 35 | 5233 |
| 3 | 2 | 64.5 | 71.1 | 17 / 35 | 5077 |
| 4 | 1 | 66.4 | 77.8 | 16 / 35 | 5605 |
| 5 | 2 | 63.0 | 67.9 | 17 / 35 | 4798 |
| 6 | 1 | 64.4 | 73.7 | 16 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| germ.TheMind .2 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |

Hadur died in 112 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 42% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 19% | 38 |
| germ.TheMind .2 | 21 | 19% | 30 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 7 |
| awesomeness.Elite 1.0 | 4 | 4% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.1 | 135 / 210 | 2.52 | 18.7% | 29971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 18.7% | 135 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.8% | 16 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 0 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.4% | 11 |
| stelo.PatternRobot 1.0 | 7.5 | 8.3% | 9 |
| spinnercat.Omen 1.0 | 7.7 | 7.9% | 3 |
| ratosh.Wesco 1.4 | 8.2 | 8.0% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.5 | 21 / 35 | 4962 |
| 2 | 1 | 69.0 | 84.1 | 25 / 35 | 5017 |
| 3 | 1 | 69.4 | 85.7 | 23 / 35 | 5320 |
| 4 | 1 | 69.0 | 83.2 | 22 / 35 | 5195 |
| 5 | 1 | 68.7 | 85.1 | 23 / 35 | 4775 |
| 6 | 1 | 66.5 | 76.8 | 21 / 35 | 4702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 73 | 95% |
| nz.jdc.nano.GridFu 1.0 | 33 | 97% |
| stelo.PatternRobot 1.0 | 11 | 82% |
| maribo.IotaCT 1.1 | 9 | 89% |
| timmit.nano.TimDog 0.33 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 75 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 19 | 25% | 25 |
| stelo.PatternRobot 1.0 | 13 | 17% | 18 |
| rz.HawkOnFire 0.1 | 12 | 16% | 68 |
| ratosh.Wesco 1.4 | 10 | 13% | 18 |
| nz.jdc.nano.GridFu 1.0 | 8 | 11% | 45 |
| maribo.IotaCT 1.1 | 6 | 8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 16 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.6 | 156 / 210 | 1.84 | 20.9% | 38620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 20.9% | 156 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 15 |
| baal.nano.N 1.42 | 3.0 | 10.8% | 9 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.7% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.8% | 18 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.8% | 0 |
| sanja.First 0.1 | 7.2 | 8.0% | 3 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.5% | 4 |
| cvt.Firsty 1.0 | 7.7 | 7.3% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.9 | 21 / 35 | 6146 |
| 2 | 1 | 72.3 | 95.9 | 29 / 35 | 6827 |
| 3 | 1 | 69.8 | 89.5 | 26 / 35 | 6044 |
| 4 | 1 | 70.8 | 90.5 | 24 / 35 | 6197 |
| 5 | 1 | 71.9 | 92.7 | 28 / 35 | 6794 |
| 6 | 1 | 71.7 | 92.4 | 28 / 35 | 6612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 89% |
| cvt.Firsty 1.0 | 27 | 93% |
| baal.nano.N 1.42 | 23 | 83% |
| sanja.First 0.1 | 21 | 100% |
| zyx.micro.Ant 1.1 | 18 | 72% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 37% | 36 |
| tvv.nano.Polaris 1.2 | 9 | 17% | 59 |
| baal.nano.N 1.42 | 7 | 13% | 29 |
| Grystrion.TrackerWO 1.0 | 7 | 13% | 23 |
| cvt.Firsty 1.0 | 4 | 7% | 21 |
| amk.Punbot.Punbot 0.01 | 4 | 7% | 6 |
| sanja.First 0.1 | 1 | 2% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 13 |
| sample.RamFire 1.0 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 65.3 | 70 / 210 | 4.12 | 14.6% | 30024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.5% | 71 |
| hadur117.micro.SaorWOE 0.1 | 1.8 | 14.6% | 70 |
| cs.Wren 1.0 | 3.0 | 12.6% | 28 |
| js.PinBall 1.6 | 4.3 | 11.5% | 13 |
| mz.Cork 0.1 | 4.5 | 11.1% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.7% | 5 |
| evd.X1 0.01 | 7.0 | 8.1% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 67.6 | 13 / 35 | 4822 |
| 2 | 2 | 61.5 | 67.0 | 9 / 35 | 4874 |
| 3 | 2 | 60.2 | 59.7 | 12 / 35 | 5026 |
| 4 | 1 | 63.7 | 70.8 | 14 / 35 | 5149 |
| 5 | 2 | 60.9 | 63.5 | 11 / 35 | 4672 |
| 6 | 2 | 62.3 | 63.5 | 11 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 67% |
| cs.Wren 1.0 | 22 | 68% |
| mz.Cork 0.1 | 10 | 70% |
| donjezza.Jezza 1.0 | 7 | 86% |
| js.PinBall 1.6 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 39% | 92 |
| cs.Wren 1.0 | 29 | 21% | 39 |
| joe.ADinosaur 1.0 | 15 | 11% | 15 |
| evd.X1 0.01 | 14 | 10% | 16 |
| mz.Cork 0.1 | 13 | 9% | 22 |
| js.PinBall 1.6 | 9 | 6% | 14 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.4 | 121 / 210 | 2.67 | 18.4% | 30422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 18.4% | 121 |
| myl.nano.Graviton 1.10 | 2.3 | 11.7% | 24 |
| ntc.Opposite 1.5 | 4.0 | 10.7% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.3% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 5.5 | 9.9% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.8% | 10 |
| DBall.NUKE 0.1 | 7.2 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 14 |
| pbg.R2D2 1.0 | 9.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 21 / 35 | 5245 |
| 2 | 1 | 68.0 | 82.9 | 21 / 35 | 5185 |
| 3 | 1 | 65.9 | 76.5 | 16 / 35 | 5023 |
| 4 | 1 | 69.1 | 88.3 | 24 / 35 | 5000 |
| 5 | 1 | 64.0 | 71.1 | 16 / 35 | 4704 |
| 6 | 1 | 69.0 | 86.3 | 23 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 82% |
| stelo.AreaTargetingBot 1.1 | 33 | 88% |
| ntc.Opposite 1.5 | 15 | 87% |
| disan.Chair 2.2.0 | 14 | 86% |
| donjezza.Muncho 1.0 | 13 | 100% |
| DBall.NUKE 0.1 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 26 | 29% | 36 |
| myl.nano.Graviton 1.10 | 19 | 21% | 51 |
| stelo.AreaTargetingBot 1.1 | 15 | 17% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 21 |
| ntc.Opposite 1.5 | 8 | 9% | 13 |
| disan.Chair 2.2.0 | 4 | 4% | 15 |
| donjezza.Muncho 1.0 | 3 | 3% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 16 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 66.8 | 66 / 210 | 3.99 | 14.7% | 26097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.8 | 14.7% | 66 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.6% | 45 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.4% | 25 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 67.3 | 10 / 35 | 4271 |
| 2 | 1 | 62.8 | 65.1 | 12 / 35 | 4671 |
| 3 | 1 | 64.2 | 72.1 | 13 / 35 | 4190 |
| 4 | 1 | 64.3 | 71.1 | 12 / 35 | 4705 |
| 5 | 4 | 56.9 | 51.7 | 6 / 35 | 3962 |
| 6 | 1 | 64.5 | 73.7 | 13 / 35 | 4298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| oog.melee.Capulet 1.2 | 20 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 61% |
| yagami.Tidus 0.11 | 17 | 71% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 34% | 65 |
| kawigi.micro.Shiz 1.1 | 26 | 18% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 14% | 33 |
| yagami.Tidus 0.11 | 19 | 13% | 31 |
| step.nanoPri 1.0 | 12 | 8% | 12 |
| ejb.Polaris 1.0.1 | 9 | 6% | 19 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.0 | 136 / 210 | 2.80 | 17.7% | 27893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 17.7% | 136 |
| wee.Gem 1.8.4 | 2.8 | 12.1% | 27 |
| wompi.Quokka 1.6 | 3.5 | 11.9% | 14 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 8 |
| bzdp.Pansy 2.1 | 4.0 | 11.6% | 11 |
| bayen.UbaMicro 1.4 | 6.5 | 8.8% | 5 |
| m3thos.Eva00 1.1 | 6.5 | 9.2% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.1 | 22 / 35 | 4588 |
| 2 | 1 | 67.7 | 81.9 | 25 / 35 | 4701 |
| 3 | 1 | 66.7 | 82.2 | 22 / 35 | 4549 |
| 4 | 1 | 66.4 | 79.7 | 21 / 35 | 4689 |
| 5 | 1 | 66.1 | 78.4 | 22 / 35 | 4698 |
| 6 | 1 | 66.9 | 79.7 | 24 / 35 | 4668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 100% |
| wee.Gem 1.8.4 | 37 | 100% |
| wompi.Quokka 1.6 | 27 | 93% |
| ratosh.Nobo 0.21 | 17 | 88% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| m3thos.Eva00 1.1 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 382. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 16 | 21% | 16 |
| wompi.Quokka 1.6 | 11 | 15% | 28 |
| wee.Gem 1.8.4 | 10 | 13% | 50 |
| bzdp.Pansy 2.1 | 9 | 12% | 45 |
| ratosh.Nobo 0.21 | 9 | 12% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 9 |
| bayen.UbaMicro 1.4 | 4 | 5% | 14 |
| m3thos.Eva00 1.1 | 3 | 4% | 10 |

## Melee bench: F15

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 84.6 | 128 / 210 | 2.39 | 20.4% | 44874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 20.4% | 128 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 17 |
| ayk.WallHugger 1.0 | 4.2 | 10.3% | 2 |
| exauge.GateKeeper 1.1.121g | 5.5 | 8.9% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.5 | 6.3% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 87.9 | 24 / 35 | 7853 |
| 2 | 1 | 73.2 | 91.7 | 22 / 35 | 8222 |
| 3 | 1 | 71.2 | 88.3 | 25 / 35 | 6744 |
| 4 | 1 | 70.8 | 81.3 | 17 / 35 | 7580 |
| 5 | 1 | 71.0 | 80.6 | 21 / 35 | 7515 |
| 6 | 1 | 69.9 | 77.8 | 19 / 35 | 6960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 81% |
| mz.NanoGod 2.02 | 11 | 73% |
| ayk.WallHugger 1.0 | 10 | 90% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| stelo.PianistNano 1.2 | 5 | 80% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 44% | 126 |
| mz.NanoGod 2.02 | 21 | 26% | 32 |
| exauge.GateKeeper 1.1.121g | 10 | 12% | 18 |
| ayk.WallHugger 1.0 | 7 | 9% | 17 |
| stelo.PianistNano 1.2 | 4 | 5% | 6 |
| stuff.Vlad 0.1 | 3 | 4% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.1 | 106 / 210 | 3.24 | 17.0% | 30449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 17.0% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.9% | 24 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.4% | 28 |
| bvh.micro.Freya 0.3 | 4.2 | 11.5% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.4% | 14 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 9 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.1 | 19 / 35 | 4892 |
| 2 | 1 | 63.8 | 71.7 | 18 / 35 | 4608 |
| 3 | 1 | 66.3 | 76.8 | 19 / 35 | 5303 |
| 4 | 1 | 67.4 | 80.6 | 22 / 35 | 5182 |
| 5 | 1 | 66.5 | 76.8 | 16 / 35 | 5503 |
| 6 | 1 | 62.8 | 66.7 | 12 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 89% |
| dummy.micro.Sparrow 2.5 | 23 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 75% |
| bvh.micro.Freya 0.3 | 13 | 100% |
| ap.Frederick 1.1 | 12 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 86% |

Hadur died in 104 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 51 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 35 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 16 |
| bvh.micro.Freya 0.3 | 11 | 11% | 27 |
| dl.BetterWalls 1.0 | 11 | 11% | 16 |
| conscience.Electron 1.3g | 11 | 11% | 12 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 13 |

## Melee bench: F17

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.1 | 155 / 210 | 1.90 | 21.2% | 39785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 21.2% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 24 |
| supersample.SuperBoxBot 1.0 | 3.2 | 11.4% | 16 |
| sul.Lunar 1.1 | 3.8 | 10.8% | 7 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 2 |
| dsw.StaticD 1.0 | 6.7 | 7.8% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 3 |
| sample.Corners 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.4 | 25 / 35 | 6098 |
| 2 | 1 | 72.5 | 94.0 | 27 / 35 | 6942 |
| 3 | 1 | 71.7 | 92.1 | 26 / 35 | 6413 |
| 4 | 1 | 72.3 | 92.7 | 28 / 35 | 6933 |
| 5 | 1 | 70.2 | 86.3 | 24 / 35 | 6371 |
| 6 | 1 | 71.7 | 89.8 | 25 / 35 | 7028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 94% |
| sul.Lunar 1.1 | 38 | 97% |
| supersample.SuperBoxBot 1.0 | 31 | 84% |
| dsw.StaticD 1.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.Corners 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 26 | 46% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 23% | 61 |
| sul.Lunar 1.1 | 5 | 9% | 43 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 14 |
| dsw.StaticD 1.0 | 3 | 5% | 13 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWOE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 79.4 | 109 / 210 | 2.86 | 18.0% | 36941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOE 0.1 | 1.0 | 18.0% | 109 |
| radnor.DoctorBob 1.42 | 2.7 | 13.1% | 30 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 26 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 9 |
| amz.NanoClone 1.41 | 5.2 | 10.4% | 8 |
| sample.Walls 1.0 | 7.3 | 8.1% | 9 |
| GarmBox.Oranges 1.0 | 7.7 | 7.1% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.8% | 7 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 80.6 | 19 / 35 | 6649 |
| 2 | 1 | 66.7 | 76.8 | 16 / 35 | 6414 |
| 3 | 1 | 66.9 | 77.5 | 18 / 35 | 6286 |
| 4 | 1 | 67.6 | 82.9 | 21 / 35 | 5517 |
| 5 | 1 | 66.7 | 76.8 | 18 / 35 | 5962 |
| 6 | 1 | 67.9 | 81.6 | 17 / 35 | 6113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 80% |
| radnor.DoctorBob 1.42 | 33 | 76% |
| mld.Wisdom 1.0 | 13 | 92% |
| sample.Walls 1.0 | 11 | 100% |
| amz.NanoClone 1.41 | 9 | 100% |
| jangs.ns51 1.0 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 26% | 52 |
| mld.Wisdom 1.0 | 25 | 25% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 22% | 61 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 24 |
| GarmBox.Oranges 1.0 | 5 | 5% | 7 |
| amz.NanoClone 1.41 | 4 | 4% | 10 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 1 | 1% | 11 |

