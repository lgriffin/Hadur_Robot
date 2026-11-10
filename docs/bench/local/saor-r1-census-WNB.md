# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 90.1 | 148 / 210 | 1.89 | 21.6% | 43692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 21.6% | 148 |
| mz.AntiGrav 1.0 | 2.3 | 14.5% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 13.8% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 16 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 6 |
| sample.Walls 1.0 | 6.2 | 7.3% | 1 |
| jangs.ns51 1.0 | 7.0 | 6.0% | 2 |
| GarmBox.Oranges 1.0 | 7.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 91.4 | 26 / 35 | 7127 |
| 2 | 1 | 73.2 | 93.7 | 25 / 35 | 7651 |
| 3 | 1 | 71.5 | 87.0 | 21 / 35 | 7085 |
| 4 | 1 | 73.7 | 94.9 | 27 / 35 | 7824 |
| 5 | 1 | 73.1 | 91.7 | 27 / 35 | 7304 |
| 6 | 1 | 70.3 | 81.9 | 22 / 35 | 6701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 96% |
| radnor.DoctorBob 1.42 | 42 | 81% |
| mld.Infinity 2.2 | 32 | 97% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 43% | 69 |
| mz.AntiGrav 1.0 | 14 | 22% | 69 |
| amz.NanoClone 1.41 | 9 | 14% | 13 |
| sample.Walls 1.0 | 7 | 11% | 15 |
| mld.Infinity 2.2 | 5 | 8% | 34 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.3 | 126 / 210 | 2.50 | 18.6% | 32324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.2 | 18.6% | 126 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.5% | 52 |
| mld.DustBunny 3.8 | 3.0 | 12.9% | 9 |
| maribo.melee.BMV 0.1 | 4.5 | 10.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.2% | 4 |
| zyx.nano.Ant 1.1 | 6.0 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.4% | 11 |
| fullsail.SweetTea 1.1 | 8.3 | 6.8% | 4 |
| bzdp.BoxCar 2.0 | 8.7 | 6.0% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 76.2 | 16 / 35 | 4557 |
| 2 | 1 | 69.9 | 88.9 | 25 / 35 | 5747 |
| 3 | 1 | 70.4 | 91.1 | 23 / 35 | 5702 |
| 4 | 2 | 60.9 | 57.5 | 8 / 35 | 4917 |
| 5 | 1 | 71.0 | 94.9 | 26 / 35 | 5868 |
| 6 | 1 | 70.0 | 91.1 | 28 / 35 | 5533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 77% |
| mld.DustBunny 3.8 | 45 | 96% |
| djdjdj.NanoSkunk10 1.0 | 19 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 75% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 33% | 72 |
| mld.DustBunny 3.8 | 13 | 15% | 55 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 14% | 26 |
| zyx.nano.Ant 1.1 | 8 | 9% | 11 |
| maribo.melee.BMV 0.1 | 8 | 9% | 10 |
| cs.Grudge 1.0 | 6 | 7% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 19 |
| fullsail.SweetTea 1.1 | 4 | 5% | 9 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 82.6 | 129 / 210 | 2.56 | 19.5% | 36506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.5% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 6 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.3% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.4% | 19 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.2% | 4 |
| sample.Fire 1.0 | 9.2 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.2 | 19 / 35 | 6476 |
| 2 | 1 | 69.6 | 83.2 | 22 / 35 | 5970 |
| 3 | 1 | 69.0 | 83.2 | 22 / 35 | 5857 |
| 4 | 1 | 69.7 | 81.6 | 25 / 35 | 6082 |
| 5 | 1 | 68.5 | 81.9 | 19 / 35 | 5805 |
| 6 | 1 | 70.1 | 83.8 | 22 / 35 | 6316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 100% |
| cb.nano.Insomnia 1.0 | 27 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 85% |
| myl.nano.KomoriNinja 1.1 | 13 | 85% |
| sp.Nanos.Ember 1.1 | 12 | 83% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 23% | 37 |
| cb.nano.Insomnia 1.0 | 18 | 22% | 21 |
| myl.micro.Troodon 1.10 | 17 | 21% | 67 |
| fm.mammillarias 1.3 | 14 | 17% | 21 |
| myl.nano.KomoriNinja 1.1 | 5 | 6% | 24 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 23 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 9 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.5 | 143 / 210 | 1.95 | 20.7% | 39159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.7% | 143 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 23 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.3 | 9.4% | 19 |
| tj.zombie1n 1.0.1 | 5.7 | 9.0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 6 |
| yk.JahMicro 1.0 | 8.0 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.7 | 27 / 35 | 6718 |
| 2 | 1 | 70.0 | 87.0 | 24 / 35 | 6235 |
| 3 | 1 | 70.0 | 85.7 | 21 / 35 | 6640 |
| 4 | 1 | 71.7 | 94.3 | 27 / 35 | 6688 |
| 5 | 1 | 70.6 | 90.5 | 22 / 35 | 6509 |
| 6 | 1 | 69.8 | 85.7 | 22 / 35 | 6369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 90% |
| stelo.SoJNanoMelee 1.1 | 43 | 77% |
| tvv.micro.Antares 1.1.1 | 22 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 76% |
| tj.zombie1n 1.0.1 | 12 | 92% |
| yk.JahMicro 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 33% | 82 |
| stelo.SoJNanoMelee 1.1 | 20 | 30% | 42 |
| tvv.micro.Antares 1.1.1 | 10 | 15% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 8 |
| tj.zombie1n 1.0.1 | 3 | 4% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| yk.JahMicro 1.0 | 1 | 1% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.7 | 96 / 210 | 3.54 | 16.2% | 28968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 16.2% | 96 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 26 |
| ahf.NanoAndrew .4 | 3.8 | 11.2% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.9% | 26 |
| EBBU.Sim2 1.02 | 5.0 | 9.8% | 10 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 14 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.9% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.9% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.5 | 19 / 35 | 5034 |
| 2 | 1 | 62.1 | 64.4 | 11 / 35 | 5017 |
| 3 | 1 | 61.1 | 63.5 | 13 / 35 | 4442 |
| 4 | 1 | 64.4 | 73.7 | 15 / 35 | 4947 |
| 5 | 1 | 66.1 | 81.9 | 19 / 35 | 4764 |
| 6 | 1 | 63.9 | 69.5 | 19 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 67% |
| simonton.nano.MeleeSeed 1.8 | 32 | 100% |
| ahf.NanoAndrew .4 | 20 | 75% |
| sam.Samspin 1.0 | 8 | 75% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 19 | 17% | 46 |
| oog.melee.Corsair 1.0 | 18 | 16% | 45 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 21 |
| ahf.NanoAndrew .4 | 13 | 11% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 14 |
| EBBU.Sim2 1.02 | 11 | 10% | 15 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 14 |
| sam.Samspin 1.0 | 9 | 8% | 14 |
| sample.TrackFire 1.0 | 5 | 4% | 9 |

## Melee bench: F06

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.1 | 123 / 210 | 2.61 | 18.4% | 32000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.4% | 123 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 38 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.7% | 22 |
| fm.claire 1.7 | 5.7 | 8.7% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.0% | 6 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 6 |
| pa.Improved 1.0 | 8.8 | 6.4% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.5 | 18 / 35 | 5683 |
| 2 | 1 | 68.6 | 83.2 | 22 / 35 | 5598 |
| 3 | 1 | 66.7 | 77.1 | 22 / 35 | 5279 |
| 4 | 1 | 68.8 | 84.4 | 22 / 35 | 5660 |
| 5 | 1 | 67.6 | 85.4 | 21 / 35 | 4904 |
| 6 | 1 | 66.2 | 80.0 | 18 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 86% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| gh.nano.Grofvuil 0.2 | 14 | 86% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 87 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 30% | 76 |
| oog.melee.CapuletDroid 1.1 | 16 | 18% | 41 |
| gh.nano.Grofvuil 0.2 | 12 | 14% | 27 |
| arthord.NanoSatanMelee Beta | 11 | 13% | 17 |
| sample.SpinBot 1.0 | 7 | 8% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 14 |
| fm.claire 1.7 | 5 | 6% | 10 |
| kurios.DOSexe .9b | 3 | 3% | 7 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.2 | 97 / 210 | 2.51 | 18.4% | 34966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.4% | 97 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.4% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 12.3% | 29 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 8 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.5% | 5 |
| el.JumpShoot 0.2 | 7.0 | 6.7% | 2 |
| acogdev.alpha 0.2 | 7.5 | 6.5% | 0 |
| fire219.CatBot 1.0 | 9.2 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.4 | 14 / 35 | 5760 |
| 2 | 1 | 69.1 | 89.2 | 14 / 35 | 6069 |
| 3 | 1 | 67.7 | 78.7 | 18 / 35 | 5689 |
| 4 | 1 | 68.7 | 84.1 | 19 / 35 | 5951 |
| 5 | 1 | 66.7 | 80.3 | 15 / 35 | 5635 |
| 6 | 1 | 68.3 | 82.5 | 17 / 35 | 5862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 76% |
| mz.MicroGodMelee 1 | 36 | 67% |
| gh.micro.Gruweltje 0.7 | 24 | 58% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 35 | 31% | 71 |
| mz.MicroGodMelee 1 | 28 | 25% | 51 |
| gh.micro.Gruweltje 0.7 | 25 | 22% | 48 |
| acogdev.alpha 0.2 | 10 | 9% | 12 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 9 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 8 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 68.8 | 99 / 210 | 3.80 | 16.0% | 30980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.5 | 16.0% | 99 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 53 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 24 |
| germ.TheMind .2 | 5.2 | 9.5% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.8% | 4 |
| qualidafial.MajorDick 1.0.1 | 6.0 | 8.8% | 5 |
| awesomeness.Elite 1.0 | 6.2 | 8.5% | 9 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.3% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.7% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 69.2 | 14 / 35 | 5488 |
| 2 | 2 | 60.7 | 60.6 | 14 / 35 | 4613 |
| 3 | 2 | 62.5 | 61.0 | 15 / 35 | 5425 |
| 4 | 1 | 65.6 | 73.0 | 21 / 35 | 5045 |
| 5 | 1 | 66.4 | 78.1 | 17 / 35 | 5432 |
| 6 | 1 | 64.5 | 71.1 | 18 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 100% |
| stelo.UntouchableNano 1.3 | 10 | 90% |
| germ.TheMind .2 | 9 | 89% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 43% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 15% | 35 |
| germ.TheMind .2 | 13 | 12% | 24 |
| lrem.micro.MoggFanatic 0.2 | 10 | 9% | 16 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 12 |
| awesomeness.Elite 1.0 | 6 | 5% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.5 | 156 / 210 | 1.94 | 20.2% | 31141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.2% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 10.5% | 10 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 7.9% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 7.9% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 25 / 35 | 4933 |
| 2 | 1 | 71.3 | 92.1 | 27 / 35 | 5300 |
| 3 | 1 | 68.7 | 83.8 | 24 / 35 | 4781 |
| 4 | 1 | 71.5 | 91.7 | 27 / 35 | 5644 |
| 5 | 1 | 70.5 | 91.1 | 28 / 35 | 4989 |
| 6 | 1 | 70.6 | 87.3 | 25 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 97% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| ratosh.Wesco 1.4 | 12 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 78% |
| maribo.IotaCT 1.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 24% | 67 |
| stelo.PatternRobot 1.0 | 13 | 24% | 27 |
| timmit.nano.TimDog 0.33 | 10 | 19% | 20 |
| spinnercat.Omen 1.0 | 6 | 11% | 10 |
| ratosh.Wesco 1.4 | 5 | 9% | 21 |
| maribo.IotaCT 1.1 | 3 | 6% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 9 |
| nz.jdc.nano.GridFu 1.0 | 1 | 2% | 41 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.0 | 161 / 210 | 1.81 | 21.3% | 40245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 21.3% | 161 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.2% | 14 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 11 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.4% | 1 |
| zyx.micro.Ant 1.1 | 5.2 | 9.3% | 11 |
| sanja.First 0.1 | 6.3 | 8.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 7.8% | 1 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 6 |
| sample.RamFire 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 29 / 35 | 6515 |
| 2 | 1 | 70.7 | 87.3 | 23 / 35 | 6968 |
| 3 | 1 | 72.7 | 96.2 | 29 / 35 | 7095 |
| 4 | 1 | 71.2 | 90.2 | 24 / 35 | 6721 |
| 5 | 1 | 69.8 | 85.4 | 28 / 35 | 6133 |
| 6 | 1 | 71.4 | 91.7 | 28 / 35 | 6813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 91% |
| baal.nano.N 1.42 | 34 | 82% |
| zyx.micro.Ant 1.1 | 22 | 82% |
| sanja.First 0.1 | 21 | 95% |
| cvt.Firsty 1.0 | 20 | 85% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 30% | 38 |
| baal.nano.N 1.42 | 8 | 16% | 31 |
| tvv.nano.Polaris 1.2 | 7 | 14% | 63 |
| cvt.Firsty 1.0 | 7 | 14% | 20 |
| sample.RamFire 1.0 | 4 | 8% | 8 |
| sanja.First 0.1 | 3 | 6% | 25 |
| Grystrion.TrackerWO 1.0 | 3 | 6% | 13 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.3 | 91 / 210 | 3.77 | 15.8% | 31350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.2 | 15.8% | 91 |
| kc.micro.Figment 1.0 | 1.8 | 14.3% | 51 |
| cs.Wren 1.0 | 3.0 | 12.7% | 22 |
| js.PinBall 1.6 | 4.3 | 11.3% | 19 |
| mz.Cork 0.1 | 5.0 | 10.7% | 12 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 6 |
| evd.X1 0.01 | 6.8 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.4% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.6 | 16 / 35 | 5375 |
| 2 | 1 | 68.5 | 81.9 | 20 / 35 | 5999 |
| 3 | 1 | 60.9 | 63.5 | 10 / 35 | 4724 |
| 4 | 1 | 64.1 | 67.9 | 16 / 35 | 5494 |
| 5 | 2 | 59.2 | 57.5 | 11 / 35 | 4770 |
| 6 | 1 | 64.1 | 70.2 | 18 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 80% |
| cs.Wren 1.0 | 33 | 88% |
| js.PinBall 1.6 | 6 | 67% |
| donjezza.Jezza 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 5 | 100% |
| mz.Cork 0.1 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 41 | 34% | 89 |
| cs.Wren 1.0 | 24 | 20% | 44 |
| evd.X1 0.01 | 21 | 18% | 23 |
| js.PinBall 1.6 | 13 | 11% | 19 |
| joe.ADinosaur 1.0 | 9 | 8% | 11 |
| mz.Cork 0.1 | 4 | 3% | 8 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.8 | 137 / 210 | 2.37 | 19.2% | 31000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 19.2% | 137 |
| myl.nano.Graviton 1.10 | 3.5 | 10.9% | 19 |
| ntc.Opposite 1.5 | 3.5 | 11.0% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.3% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.1% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.0% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 4 |
| DBall.NUKE 0.1 | 7.5 | 8.1% | 2 |
| donjezza.Muncho 1.0 | 9.3 | 6.3% | 9 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.5 | 22 / 35 | 4451 |
| 2 | 1 | 68.3 | 82.9 | 24 / 35 | 5285 |
| 3 | 1 | 68.9 | 87.0 | 22 / 35 | 5099 |
| 4 | 1 | 69.6 | 87.0 | 23 / 35 | 5406 |
| 5 | 1 | 68.7 | 84.1 | 22 / 35 | 5475 |
| 6 | 1 | 68.9 | 84.4 | 24 / 35 | 5284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 84% |
| myl.nano.Graviton 1.10 | 31 | 90% |
| ntc.Opposite 1.5 | 20 | 90% |
| DBall.NUKE 0.1 | 14 | 100% |
| donjezza.Muncho 1.0 | 13 | 92% |
| disan.Chair 2.2.0 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 70% |

Hadur died in 73 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 23 | 32% | 32 |
| myl.nano.Graviton 1.10 | 13 | 18% | 42 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 44 |
| ntc.Opposite 1.5 | 8 | 11% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 10% | 22 |
| disan.Chair 2.2.0 | 4 | 5% | 18 |
| donjezza.Muncho 1.0 | 3 | 4% | 14 |
| pbg.R2D2 1.0 | 3 | 4% | 7 |
| DBall.NUKE 0.1 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.8 | 75 / 210 | 3.45 | 15.9% | 27359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.3 | 15.9% | 75 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 35 |
| oog.melee.Capulet 1.2 | 3.0 | 13.8% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.9% | 32 |
| yagami.Tidus 0.11 | 4.2 | 12.2% | 12 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.1 | 13 / 35 | 4683 |
| 2 | 1 | 65.3 | 74.9 | 12 / 35 | 4542 |
| 3 | 1 | 67.1 | 80.6 | 17 / 35 | 4649 |
| 4 | 1 | 62.0 | 63.8 | 10 / 35 | 4405 |
| 5 | 1 | 67.8 | 82.2 | 14 / 35 | 5149 |
| 6 | 3 | 61.0 | 64.1 | 9 / 35 | 3931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| oog.melee.Capulet 1.2 | 24 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 59% |
| yagami.Tidus 0.11 | 17 | 100% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 30% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 19% | 41 |
| yagami.Tidus 0.11 | 26 | 19% | 39 |
| kawigi.micro.Shiz 1.1 | 21 | 16% | 41 |
| ejb.Polaris 1.0.1 | 7 | 5% | 13 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 7 | 5% | 7 |

## Melee bench: F14

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.1 | 136 / 210 | 2.70 | 17.8% | 27386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 17.8% | 136 |
| bzdp.Pansy 2.1 | 2.5 | 12.0% | 16 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 21 |
| wompi.Quokka 1.6 | 3.8 | 11.1% | 13 |
| ratosh.Nobo 0.21 | 4.2 | 10.8% | 5 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 10 |
| bayen.UbaMicro 1.4 | 6.7 | 9.2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 8.7 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 71.1 | 18 / 35 | 4491 |
| 2 | 1 | 68.5 | 86.3 | 27 / 35 | 4566 |
| 3 | 1 | 66.1 | 80.6 | 21 / 35 | 4342 |
| 4 | 1 | 68.3 | 86.7 | 26 / 35 | 4782 |
| 5 | 1 | 67.8 | 87.0 | 25 / 35 | 4648 |
| 6 | 1 | 65.3 | 74.6 | 19 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 96% |
| wee.Gem 1.8.4 | 33 | 97% |
| wompi.Quokka 1.6 | 23 | 83% |
| m3thos.Eva00 1.1 | 17 | 82% |
| ratosh.Nobo 0.21 | 13 | 85% |
| bayen.UbaMicro 1.4 | 9 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 11 | 15% | 28 |
| stelo.MyAgileRobot 0.2 | 10 | 13% | 13 |
| bzdp.Pansy 2.1 | 9 | 12% | 51 |
| wee.Gem 1.8.4 | 9 | 12% | 42 |
| wompi.Quokka 1.6 | 9 | 12% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 11 |
| maribo.FollowFire 1 | 8 | 11% | 9 |
| bayen.UbaMicro 1.4 | 7 | 9% | 19 |
| m3thos.Eva00 1.1 | 4 | 5% | 17 |

## Melee bench: F15

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 84.9 | 124 / 210 | 2.36 | 20.4% | 44228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 20.4% | 124 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 62 |
| mz.NanoGod 2.02 | 3.0 | 13.4% | 14 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.9% | 7 |
| ayk.WallHugger 1.0 | 4.8 | 9.9% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 2 |
| sample.SittingDuck 1.0 | 9.0 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.6 | 24 / 35 | 7427 |
| 2 | 1 | 70.6 | 83.5 | 19 / 35 | 6764 |
| 3 | 1 | 71.6 | 85.1 | 18 / 35 | 7516 |
| 4 | 1 | 70.0 | 81.6 | 19 / 35 | 7048 |
| 5 | 1 | 70.2 | 79.7 | 18 / 35 | 7449 |
| 6 | 1 | 73.6 | 92.1 | 26 / 35 | 8024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 78% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| mz.NanoGod 2.02 | 11 | 82% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 54% | 135 |
| mz.NanoGod 2.02 | 15 | 17% | 27 |
| exauge.GateKeeper 1.1.121g | 13 | 15% | 19 |
| ayk.WallHugger 1.0 | 9 | 10% | 21 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.0 | 106 / 210 | 3.43 | 16.7% | 29125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.2 | 16.7% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 23 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 26 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 6.9% | 5 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 25 / 35 | 5486 |
| 2 | 1 | 64.3 | 71.7 | 16 / 35 | 4539 |
| 3 | 1 | 67.2 | 79.4 | 20 / 35 | 5111 |
| 4 | 1 | 62.4 | 68.6 | 14 / 35 | 4432 |
| 5 | 1 | 66.0 | 73.3 | 18 / 35 | 5287 |
| 6 | 2 | 59.2 | 57.8 | 13 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 89% |
| dummy.micro.Sparrow 2.5 | 21 | 86% |
| bvh.micro.Freya 0.3 | 20 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 90% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 29% | 65 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 18% | 19 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 39 |
| bvh.micro.Freya 0.3 | 11 | 11% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 29 |
| conscience.Electron 1.3g | 9 | 9% | 12 |
| dl.BetterWalls 1.0 | 5 | 5% | 11 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 10 |

## Melee bench: F17

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 88.9 | 151 / 210 | 2.00 | 21.8% | 44784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 21.8% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.9% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 14 |
| supersample.SuperBoxBot 1.0 | 3.5 | 10.7% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 7 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 82.9 | 23 / 35 | 7602 |
| 2 | 1 | 72.7 | 91.4 | 27 / 35 | 7322 |
| 3 | 1 | 71.9 | 88.6 | 27 / 35 | 6864 |
| 4 | 1 | 71.7 | 90.5 | 22 / 35 | 7496 |
| 5 | 1 | 72.7 | 90.2 | 27 / 35 | 7653 |
| 6 | 1 | 72.6 | 89.8 | 25 / 35 | 7847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 88% |
| supersample.SuperBoxBot 1.0 | 30 | 87% |
| dsw.StaticD 1.0 | 15 | 73% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 38% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 25% | 47 |
| dsw.StaticD 1.0 | 7 | 12% | 17 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 11 |
| sul.Lunar 1.1 | 3 | 5% | 54 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |
| sample.Corners 1.0 | 1 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorWNB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.6 | 111 / 210 | 2.83 | 18.0% | 36283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNB 0.1 | 1.0 | 18.0% | 111 |
| radnor.DoctorBob 1.42 | 2.0 | 13.4% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.5% | 20 |
| mld.Wisdom 1.0 | 4.0 | 11.4% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 17 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.0% | 9 |
| sample.Walls 1.0 | 7.3 | 7.8% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.9% | 4 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 65.7 | 14 / 35 | 5710 |
| 2 | 1 | 68.0 | 81.6 | 22 / 35 | 6026 |
| 3 | 1 | 68.0 | 83.8 | 18 / 35 | 5971 |
| 4 | 1 | 66.8 | 76.2 | 19 / 35 | 6040 |
| 5 | 1 | 69.7 | 88.6 | 20 / 35 | 6463 |
| 6 | 1 | 67.8 | 81.9 | 18 / 35 | 6073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 92% |
| radnor.DoctorBob 1.42 | 36 | 78% |
| mld.Wisdom 1.0 | 12 | 75% |
| sample.Walls 1.0 | 11 | 91% |
| amz.NanoClone 1.41 | 10 | 50% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 30% | 37 |
| radnor.DoctorBob 1.42 | 19 | 19% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 17% | 62 |
| amz.NanoClone 1.41 | 14 | 14% | 18 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 21 |
| jangs.ns51 1.0 | 3 | 3% | 9 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |

