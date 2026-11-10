# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.7 | 130 / 210 | 2.29 | 20.2% | 40820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 20.2% | 130 |
| mz.AntiGrav 1.0 | 2.5 | 14.2% | 20 |
| radnor.DoctorBob 1.42 | 2.8 | 14.1% | 33 |
| mld.Infinity 2.2 | 3.8 | 13.1% | 16 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 6 |
| sample.Walls 1.0 | 6.2 | 7.6% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 1 |
| sample.Target 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 83.2 | 21 / 35 | 6233 |
| 2 | 1 | 70.1 | 82.5 | 21 / 35 | 6786 |
| 3 | 1 | 72.2 | 90.8 | 21 / 35 | 7470 |
| 4 | 1 | 69.9 | 82.9 | 21 / 35 | 6643 |
| 5 | 1 | 71.7 | 88.6 | 24 / 35 | 6830 |
| 6 | 1 | 71.0 | 86.3 | 22 / 35 | 6858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 59 | 85% |
| radnor.DoctorBob 1.42 | 40 | 78% |
| mld.Infinity 2.2 | 29 | 100% |
| sample.Target 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 6 | 50% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 29 | 36% | 76 |
| radnor.DoctorBob 1.42 | 22 | 27% | 58 |
| mld.Infinity 2.2 | 13 | 16% | 37 |
| amz.NanoClone 1.41 | 11 | 14% | 15 |
| GarmBox.Oranges 1.0 | 3 | 4% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 8 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.5 | 111 / 210 | 2.67 | 17.8% | 31015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.3 | 17.8% | 111 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 57 |
| mld.DustBunny 3.8 | 2.5 | 14.2% | 27 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 8 |
| zyx.nano.Ant 1.1 | 7.2 | 7.7% | 0 |
| fullsail.SweetTea 1.1 | 7.5 | 6.8% | 1 |
| bzdp.BoxCar 2.0 | 9.0 | 6.0% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.2 | 17 / 35 | 5189 |
| 2 | 1 | 69.2 | 89.8 | 23 / 35 | 5305 |
| 3 | 1 | 68.0 | 85.7 | 18 / 35 | 5461 |
| 4 | 3 | 57.0 | 47.3 | 6 / 35 | 4498 |
| 5 | 1 | 68.9 | 89.5 | 22 / 35 | 5252 |
| 6 | 1 | 70.4 | 94.3 | 25 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 79% |
| mld.DustBunny 3.8 | 50 | 86% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 29% | 78 |
| mld.DustBunny 3.8 | 25 | 25% | 62 |
| zyx.nano.Ant 1.1 | 11 | 11% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 15 |
| djdjdj.NanoSkunk10 1.0 | 7 | 7% | 14 |
| cs.Grudge 1.0 | 7 | 7% | 5 |
| fullsail.SweetTea 1.1 | 5 | 5% | 9 |
| maribo.melee.BMV 0.1 | 5 | 5% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 78.4 | 105 / 210 | 2.95 | 18.4% | 35481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 18.4% | 105 |
| myl.micro.Troodon 1.10 | 2.0 | 15.3% | 53 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.1% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.6% | 22 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 4 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.4% | 8 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 3 |
| sample.Fire 1.0 | 9.2 | 5.3% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 70.2 | 10 / 35 | 5759 |
| 2 | 1 | 66.0 | 71.7 | 17 / 35 | 5442 |
| 3 | 1 | 69.6 | 82.2 | 21 / 35 | 6163 |
| 4 | 1 | 69.1 | 84.1 | 19 / 35 | 6001 |
| 5 | 1 | 70.0 | 87.0 | 22 / 35 | 6341 |
| 6 | 1 | 67.2 | 74.9 | 16 / 35 | 5775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 39 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 70% |
| myl.nano.KomoriNinja 1.1 | 21 | 76% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 3 | 33% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 34 | 32% | 73 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 25% | 41 |
| fm.mammillarias 1.3 | 16 | 15% | 18 |
| myl.nano.KomoriNinja 1.1 | 10 | 10% | 35 |
| sample.Fire 1.0 | 8 | 8% | 13 |
| cb.nano.Insomnia 1.0 | 6 | 6% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 9 |

## Melee bench: F04

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.1 | 145 / 210 | 2.25 | 20.2% | 38121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 20.2% | 145 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 20 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.7% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.3% | 12 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 14 |
| yk.JahMicro 1.0 | 6.8 | 8.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.0% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 80.0 | 19 / 35 | 6205 |
| 2 | 1 | 71.2 | 91.1 | 26 / 35 | 6578 |
| 3 | 1 | 67.6 | 80.3 | 22 / 35 | 5442 |
| 4 | 1 | 72.2 | 94.3 | 31 / 35 | 6603 |
| 5 | 1 | 70.1 | 84.8 | 22 / 35 | 6727 |
| 6 | 1 | 70.1 | 86.3 | 25 / 35 | 6566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 92% |
| stelo.SoJNanoMelee 1.1 | 41 | 98% |
| tvv.micro.Antares 1.1.1 | 22 | 95% |
| tj.zombie1n 1.0.1 | 13 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 85% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 86% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 44% | 75 |
| stelo.SoJNanoMelee 1.1 | 9 | 14% | 38 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 24 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 26 |
| tj.zombie1n 1.0.1 | 5 | 8% | 12 |
| yk.JahMicro 1.0 | 4 | 6% | 10 |
| repositorio.NanoStep 1.0 | 1 | 2% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 69.3 | 73 / 210 | 3.77 | 15.4% | 28910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 15.4% | 73 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.2% | 29 |
| ahf.NanoAndrew .4 | 4.0 | 11.4% | 28 |
| EBBU.Sim2 1.02 | 4.8 | 10.4% | 12 |
| sam.Samspin 1.0 | 5.8 | 10.0% | 18 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.0% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.9% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 70.5 | 12 / 35 | 4463 |
| 2 | 1 | 64.7 | 74.3 | 15 / 35 | 5118 |
| 3 | 1 | 63.2 | 72.1 | 12 / 35 | 4771 |
| 4 | 1 | 63.4 | 69.2 | 12 / 35 | 5041 |
| 5 | 1 | 60.5 | 60.6 | 10 / 35 | 4747 |
| 6 | 1 | 62.6 | 68.9 | 12 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 59% |
| simonton.nano.MeleeSeed 1.8 | 28 | 79% |
| ahf.NanoAndrew .4 | 18 | 83% |
| sam.Samspin 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 5 | 80% |
| sample.TrackFire 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 18% | 46 |
| simonton.nano.MeleeSeed 1.8 | 22 | 16% | 43 |
| EBBU.Sim2 1.02 | 22 | 16% | 27 |
| zyx.nano.BacillusComma 1.0 | 19 | 14% | 20 |
| robar.nano.Assertive_Melee 0.2 | 16 | 12% | 18 |
| sam.Samspin 1.0 | 11 | 8% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 8% | 10 |
| ahf.NanoAndrew .4 | 7 | 5% | 21 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.1 | 121 / 210 | 2.52 | 18.3% | 31002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 18.3% | 121 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 16 |
| fm.claire 1.7 | 5.7 | 8.9% | 3 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.9% | 7 |
| sample.SpinBot 1.0 | 7.7 | 7.6% | 6 |
| kurios.DOSexe .9b | 9.5 | 5.4% | 2 |
| pa.Improved 1.0 | 9.5 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 74.6 | 16 / 35 | 4630 |
| 2 | 1 | 70.7 | 93.0 | 28 / 35 | 5554 |
| 3 | 1 | 65.2 | 77.1 | 19 / 35 | 4755 |
| 4 | 1 | 68.2 | 83.2 | 18 / 35 | 5745 |
| 5 | 1 | 66.7 | 83.8 | 19 / 35 | 4757 |
| 6 | 1 | 68.7 | 87.0 | 21 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 85% |
| oog.melee.CapuletDroid 1.1 | 28 | 96% |
| gh.nano.Grofvuil 0.2 | 17 | 65% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 34% | 75 |
| oog.melee.CapuletDroid 1.1 | 14 | 15% | 43 |
| gh.nano.Grofvuil 0.2 | 14 | 15% | 27 |
| sample.SpinBot 1.0 | 11 | 12% | 15 |
| arthord.NanoSatanMelee Beta | 10 | 11% | 20 |
| fm.claire 1.7 | 7 | 8% | 11 |
| kurios.DOSexe .9b | 2 | 2% | 7 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 10 |
| pa.Improved 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.7 | 94 / 210 | 2.73 | 17.7% | 33013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 17.7% | 94 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.1% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.5% | 31 |
| mz.MicroGodMelee 1 | 3.8 | 12.2% | 26 |
| DBall.Anarchy 0.1 | 5.0 | 9.3% | 10 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.4% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 3 |
| fire219.CatBot 1.0 | 9.0 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.5 | 17 / 35 | 5279 |
| 2 | 1 | 66.0 | 78.4 | 17 / 35 | 5237 |
| 3 | 1 | 66.5 | 80.3 | 15 / 35 | 5291 |
| 4 | 1 | 68.3 | 84.8 | 16 / 35 | 5958 |
| 5 | 1 | 66.9 | 81.3 | 14 / 35 | 5734 |
| 6 | 1 | 67.4 | 83.2 | 15 / 35 | 5514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 81% |
| gh.micro.Gruweltje 0.7 | 32 | 66% |
| mz.MicroGodMelee 1 | 28 | 50% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 39 | 34% | 59 |
| mz.MicroGodMelee 1 | 29 | 25% | 42 |
| spinnercat.micro.Tyger 0.1 | 22 | 19% | 50 |
| acogdev.alpha 0.2 | 7 | 6% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 10 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 4 | 3% | 22 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.7 | 106 / 210 | 3.19 | 17.1% | 32034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 17.1% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.5% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 33 |
| germ.TheMind .2 | 4.3 | 10.1% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 8.9% | 6 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.4% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.6% | 1 |
| awesomeness.Elite 1.0 | 7.3 | 8.1% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.8 | 21 / 35 | 5642 |
| 2 | 1 | 64.8 | 72.1 | 16 / 35 | 5333 |
| 3 | 1 | 63.3 | 69.2 | 13 / 35 | 5069 |
| 4 | 1 | 63.8 | 68.9 | 17 / 35 | 5033 |
| 5 | 1 | 67.6 | 81.3 | 23 / 35 | 5463 |
| 6 | 1 | 66.4 | 79.0 | 16 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| germ.TheMind .2 | 14 | 100% |
| awesomeness.Elite 1.0 | 8 | 75% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 33% | 78 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 21% | 37 |
| germ.TheMind .2 | 18 | 17% | 31 |
| stelo.UntouchableNano 1.3 | 14 | 13% | 22 |
| awesomeness.Elite 1.0 | 8 | 8% | 18 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.5 | 107 / 210 | 3.11 | 16.8% | 26206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 16.8% | 107 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.3% | 23 |
| maribo.IotaCT 1.1 | 4.0 | 11.6% | 20 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.7% | 10 |
| ratosh.Wesco 1.4 | 6.3 | 9.1% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.6% | 4 |
| stelo.PatternRobot 1.0 | 7.8 | 8.4% | 9 |
| spinnercat.Omen 1.0 | 8.5 | 7.9% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.0 | 19 / 35 | 4749 |
| 2 | 1 | 66.1 | 75.6 | 18 / 35 | 4499 |
| 3 | 1 | 65.1 | 75.9 | 16 / 35 | 4121 |
| 4 | 1 | 67.1 | 83.8 | 19 / 35 | 4360 |
| 5 | 1 | 64.0 | 70.5 | 16 / 35 | 4092 |
| 6 | 1 | 66.0 | 74.3 | 19 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 55 | 87% |
| nz.jdc.nano.GridFu 1.0 | 23 | 100% |
| maribo.IotaCT 1.1 | 16 | 75% |
| stelo.PatternRobot 1.0 | 13 | 77% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| timmit.nano.TimDog 0.33 | 5 | 80% |
| ratosh.Wesco 1.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 27 | 26% | 38 |
| rz.HawkOnFire 0.1 | 22 | 21% | 58 |
| stelo.PatternRobot 1.0 | 18 | 17% | 23 |
| nz.jdc.nano.GridFu 1.0 | 12 | 12% | 43 |
| maribo.IotaCT 1.1 | 10 | 10% | 23 |
| timmit.nano.TimDog 0.33 | 9 | 9% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 7 |
| spinnercat.Omen 1.0 | 2 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.4 | 134 / 210 | 2.49 | 19.1% | 35329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 19.1% | 134 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.8% | 25 |
| baal.nano.N 1.42 | 3.0 | 11.7% | 11 |
| Grystrion.TrackerWO 1.0 | 4.7 | 10.1% | 4 |
| zyx.micro.Ant 1.1 | 4.8 | 9.7% | 16 |
| sanja.First 0.1 | 6.5 | 8.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.6% | 3 |
| cvt.Firsty 1.0 | 7.8 | 7.1% | 10 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.4 | 19 / 35 | 5377 |
| 2 | 1 | 70.9 | 89.8 | 26 / 35 | 6470 |
| 3 | 1 | 68.8 | 85.1 | 20 / 35 | 6334 |
| 4 | 1 | 69.5 | 86.0 | 25 / 35 | 5933 |
| 5 | 1 | 68.3 | 82.5 | 23 / 35 | 5834 |
| 6 | 1 | 66.8 | 77.8 | 21 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 29 | 90% |
| tvv.nano.Polaris 1.2 | 29 | 93% |
| cvt.Firsty 1.0 | 19 | 95% |
| sanja.First 0.1 | 18 | 94% |
| zyx.micro.Ant 1.1 | 16 | 75% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 12 | 83% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 22 | 29% | 32 |
| tvv.nano.Polaris 1.2 | 13 | 17% | 45 |
| Grystrion.TrackerWO 1.0 | 9 | 12% | 16 |
| squidM.TentalceMeleeNano 1.1 | 8 | 11% | 17 |
| cvt.Firsty 1.0 | 7 | 9% | 26 |
| sanja.First 0.1 | 6 | 8% | 30 |
| baal.nano.N 1.42 | 4 | 5% | 32 |
| amk.Punbot.Punbot 0.01 | 4 | 5% | 5 |
| sample.RamFire 1.0 | 3 | 4% | 6 |

## Melee bench: F11

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.7 | 86 / 210 | 3.82 | 15.3% | 29507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.3 | 15.3% | 86 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 64 |
| cs.Wren 1.0 | 3.0 | 12.7% | 21 |
| js.PinBall 1.6 | 4.3 | 11.3% | 17 |
| mz.Cork 0.1 | 4.5 | 10.7% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 3 |
| evd.X1 0.01 | 7.3 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 5 |
| donjezza.Jezza 1.0 | 8.7 | 6.1% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.2 | 17 / 35 | 4829 |
| 2 | 2 | 61.5 | 64.8 | 13 / 35 | 4592 |
| 3 | 1 | 61.7 | 62.2 | 14 / 35 | 4848 |
| 4 | 1 | 65.1 | 75.6 | 17 / 35 | 5027 |
| 5 | 2 | 61.3 | 65.7 | 12 / 35 | 4584 |
| 6 | 1 | 64.7 | 73.7 | 13 / 35 | 5627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 76% |
| cs.Wren 1.0 | 33 | 85% |
| js.PinBall 1.6 | 10 | 70% |
| mz.Cork 0.1 | 9 | 89% |
| donjezza.Jezza 1.0 | 3 | 67% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 44 | 35% | 86 |
| evd.X1 0.01 | 20 | 16% | 23 |
| cs.Wren 1.0 | 16 | 13% | 30 |
| joe.ADinosaur 1.0 | 16 | 13% | 17 |
| mz.Cork 0.1 | 11 | 9% | 16 |
| js.PinBall 1.6 | 10 | 8% | 20 |
| jsal.Jsalbot 1.0 | 4 | 3% | 9 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.8 | 107 / 210 | 2.90 | 17.6% | 28736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 17.6% | 107 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 30 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.3% | 28 |
| ntc.Opposite 1.5 | 3.5 | 11.4% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 9.8% | 3 |
| pfvicm.Sobieski 7.2.3b | 6.3 | 9.1% | 4 |
| DBall.NUKE 0.1 | 6.5 | 8.7% | 5 |
| disan.Chair 2.2.0 | 7.7 | 7.9% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.9% | 3 |
| donjezza.Muncho 1.0 | 9.5 | 6.3% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 72.1 | 13 / 35 | 4488 |
| 2 | 1 | 67.8 | 83.8 | 21 / 35 | 4750 |
| 3 | 1 | 64.4 | 74.0 | 15 / 35 | 4647 |
| 4 | 1 | 66.5 | 80.0 | 18 / 35 | 4906 |
| 5 | 1 | 66.7 | 77.8 | 21 / 35 | 4850 |
| 6 | 1 | 68.2 | 85.4 | 19 / 35 | 5095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 29 | 86% |
| myl.nano.Graviton 1.10 | 26 | 81% |
| ntc.Opposite 1.5 | 19 | 68% |
| DBall.NUKE 0.1 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| disan.Chair 2.2.0 | 9 | 67% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 5 | 60% |

Hadur died in 105 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 20 | 19% | 43 |
| myl.nano.Graviton 1.10 | 19 | 18% | 43 |
| ntc.Opposite 1.5 | 18 | 17% | 30 |
| pfvicm.Sobieski 7.2.3b | 17 | 16% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 16 |
| disan.Chair 2.2.0 | 8 | 8% | 16 |
| pbg.R2D2 1.0 | 7 | 7% | 13 |
| donjezza.Muncho 1.0 | 4 | 4% | 9 |
| DBall.NUKE 0.1 | 3 | 3% | 16 |

## Melee bench: F13

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.7 | 68 / 210 | 3.82 | 14.7% | 25097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.0 | 14.3% | 60 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.1% | 40 |
| hadur117.micro.SaorCEV 0.1 | 2.3 | 14.7% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 21 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 6 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 76.2 | 15 / 35 | 4812 |
| 2 | 1 | 64.5 | 75.6 | 12 / 35 | 4325 |
| 3 | 4 | 59.3 | 60.3 | 8 / 35 | 3691 |
| 4 | 3 | 61.3 | 67.9 | 8 / 35 | 3861 |
| 5 | 1 | 64.8 | 72.1 | 16 / 35 | 4431 |
| 6 | 4 | 59.7 | 60.0 | 9 / 35 | 3977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 62% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| yagami.Tidus 0.11 | 14 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 77% |
| ejb.Polaris 1.0.1 | 5 | 80% |
| step.nanoPri 1.0 | 1 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 34% | 70 |
| yagami.Tidus 0.11 | 26 | 18% | 38 |
| kawigi.micro.Shiz 1.1 | 19 | 13% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 13% | 28 |
| step.nanoPri 1.0 | 12 | 8% | 13 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| ejb.Polaris 1.0.1 | 6 | 4% | 13 |
| kurios.DOSexe .9a | 6 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.8 | 123 / 210 | 3.00 | 16.9% | 25996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 16.9% | 123 |
| wee.Gem 1.8.4 | 2.7 | 12.3% | 34 |
| bzdp.Pansy 2.1 | 3.2 | 11.8% | 14 |
| wompi.Quokka 1.6 | 4.2 | 11.0% | 16 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 5.5 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 2 |
| maribo.FollowFire 1 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.0 | 20 / 35 | 4137 |
| 2 | 1 | 64.4 | 75.6 | 20 / 35 | 4021 |
| 3 | 1 | 67.2 | 81.6 | 24 / 35 | 4618 |
| 4 | 1 | 63.8 | 73.3 | 17 / 35 | 4396 |
| 5 | 1 | 65.1 | 78.7 | 22 / 35 | 3980 |
| 6 | 1 | 67.0 | 83.8 | 20 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 95% |
| wee.Gem 1.8.4 | 38 | 97% |
| wompi.Quokka 1.6 | 20 | 90% |
| m3thos.Eva00 1.1 | 12 | 92% |
| ratosh.Nobo 0.21 | 8 | 63% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jeremyreeder.Vincent 2011.12.09 | 15 | 17% | 20 |
| bayen.UbaMicro 1.4 | 12 | 14% | 18 |
| maribo.FollowFire 1 | 11 | 13% | 11 |
| wee.Gem 1.8.4 | 9 | 10% | 48 |
| wompi.Quokka 1.6 | 9 | 10% | 21 |
| ratosh.Nobo 0.21 | 9 | 10% | 17 |
| bzdp.Pansy 2.1 | 8 | 9% | 48 |
| m3thos.Eva00 1.1 | 7 | 8% | 16 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 10 |

## Melee bench: F15

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.0 | 137 / 210 | 1.99 | 21.3% | 45241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 21.3% | 137 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 48 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 18 |
| ayk.WallHugger 1.0 | 4.7 | 9.9% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.9% | 4 |
| stuff.Vlad 0.1 | 5.5 | 8.5% | 3 |
| stelo.PianistNano 1.2 | 7.2 | 6.4% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 89.8 | 24 / 35 | 7869 |
| 2 | 1 | 73.0 | 88.9 | 24 / 35 | 7623 |
| 3 | 1 | 71.7 | 87.0 | 20 / 35 | 7398 |
| 4 | 1 | 74.1 | 95.2 | 26 / 35 | 7874 |
| 5 | 1 | 69.9 | 80.3 | 18 / 35 | 6778 |
| 6 | 1 | 73.5 | 93.0 | 25 / 35 | 7699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 99 | 86% |
| mz.NanoGod 2.02 | 20 | 55% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 36% | 123 |
| mz.NanoGod 2.02 | 22 | 30% | 36 |
| exauge.GateKeeper 1.1.121g | 11 | 15% | 16 |
| ayk.WallHugger 1.0 | 8 | 11% | 16 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 8 |

## Melee bench: F16

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.7 | 100 / 210 | 3.55 | 16.1% | 27596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 16.1% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 31 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 26 |
| bvh.micro.Freya 0.3 | 3.7 | 11.2% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 9 |
| conscience.Electron 1.3g | 6.8 | 7.9% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 5 |
| ap.Frederick 1.1 | 8.8 | 6.7% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 71.7 | 19 / 35 | 4443 |
| 2 | 1 | 62.0 | 68.3 | 13 / 35 | 4251 |
| 3 | 1 | 63.2 | 68.3 | 16 / 35 | 4605 |
| 4 | 1 | 66.1 | 77.1 | 19 / 35 | 5051 |
| 5 | 1 | 62.8 | 68.9 | 14 / 35 | 4682 |
| 6 | 1 | 65.3 | 75.9 | 19 / 35 | 4564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 84% |
| dummy.micro.Sparrow 2.5 | 31 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 84% |
| bvh.micro.Freya 0.3 | 11 | 100% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 28% | 65 |
| conscience.Electron 1.3g | 18 | 16% | 22 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 14 |
| bvh.micro.Freya 0.3 | 12 | 11% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 8% | 24 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 14 |
| dl.BetterWalls 1.0 | 4 | 4% | 6 |

## Melee bench: F17

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 86.5 | 135 / 210 | 2.21 | 20.9% | 43048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 20.9% | 135 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 29 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 11 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.3% | 15 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.8% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 6 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 5 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.2% | 5 |
| sample.Corners 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.4 | 22 / 35 | 6708 |
| 2 | 1 | 71.8 | 87.6 | 24 / 35 | 7100 |
| 3 | 1 | 70.8 | 84.4 | 21 / 35 | 7511 |
| 4 | 1 | 70.6 | 86.3 | 22 / 35 | 6845 |
| 5 | 1 | 72.0 | 89.2 | 22 / 35 | 7359 |
| 6 | 1 | 71.4 | 86.0 | 24 / 35 | 7525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 51 | 94% |
| sul.Lunar 1.1 | 43 | 100% |
| supersample.SuperBoxBot 1.0 | 18 | 83% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 31% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 21% | 65 |
| dsw.StaticD 1.0 | 9 | 12% | 17 |
| mme.NikeEnhanced 2.0 | 9 | 12% | 13 |
| sul.Lunar 1.1 | 8 | 11% | 48 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 12 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 14 |
| sample.Corners 1.0 | 2 | 3% | 4 |

## Melee bench: F18

hadur117.micro.SaorCEV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.0 | 102 / 210 | 3.07 | 17.4% | 35650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCEV 0.1 | 1.0 | 17.4% | 102 |
| radnor.DoctorBob 1.42 | 2.2 | 13.2% | 25 |
| mld.Wisdom 1.0 | 3.8 | 11.7% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 26 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 10 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 15 |
| sample.Walls 1.0 | 7.2 | 8.3% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 70.2 | 11 / 35 | 5521 |
| 2 | 1 | 67.8 | 82.2 | 21 / 35 | 5788 |
| 3 | 1 | 68.6 | 81.9 | 22 / 35 | 6630 |
| 4 | 1 | 64.3 | 70.5 | 15 / 35 | 6017 |
| 5 | 1 | 66.3 | 78.4 | 16 / 35 | 5795 |
| 6 | 1 | 66.6 | 79.0 | 17 / 35 | 5899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 85% |
| radnor.DoctorBob 1.42 | 28 | 71% |
| mld.Wisdom 1.0 | 13 | 77% |
| amz.NanoClone 1.41 | 13 | 46% |
| sample.Walls 1.0 | 12 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 25% | 41 |
| KiraNL.Chupacabra 0.4 | 20 | 19% | 30 |
| radnor.DoctorBob 1.42 | 18 | 17% | 45 |
| amz.NanoClone 1.41 | 18 | 17% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 14% | 46 |
| sample.Walls 1.0 | 4 | 4% | 12 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 9 |

