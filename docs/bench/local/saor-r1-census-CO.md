# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 92.4 | 165 / 210 | 1.68 | 22.4% | 45156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 22.4% | 165 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 14 |
| mld.Infinity 2.2 | 3.2 | 13.0% | 13 |
| mz.AntiGrav 1.0 | 3.2 | 13.4% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| sample.Walls 1.0 | 6.2 | 7.1% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 0 |
| GarmBox.Oranges 1.0 | 7.5 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 96.2 | 29 / 35 | 7312 |
| 2 | 1 | 74.0 | 95.9 | 28 / 35 | 7598 |
| 3 | 1 | 74.8 | 96.2 | 30 / 35 | 7999 |
| 4 | 1 | 71.7 | 87.0 | 26 / 35 | 6977 |
| 5 | 1 | 71.9 | 86.7 | 23 / 35 | 7431 |
| 6 | 1 | 73.4 | 92.7 | 29 / 35 | 7839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 96% |
| mld.Infinity 2.2 | 45 | 89% |
| radnor.DoctorBob 1.42 | 41 | 90% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 41% | 71 |
| mz.AntiGrav 1.0 | 9 | 20% | 64 |
| mld.Infinity 2.2 | 9 | 20% | 45 |
| amz.NanoClone 1.41 | 4 | 9% | 11 |
| GarmBox.Oranges 1.0 | 3 | 7% | 3 |
| sample.Walls 1.0 | 2 | 4% | 9 |
| jangs.ns51 1.0 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.2 | 114 / 210 | 2.24 | 18.7% | 32707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 18.7% | 114 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 55 |
| mld.DustBunny 3.8 | 2.7 | 13.4% | 19 |
| maribo.melee.BMV 0.1 | 4.8 | 9.8% | 4 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 10 |
| fullsail.SweetTea 1.1 | 8.3 | 7.3% | 3 |
| bzdp.BoxCar 2.0 | 8.7 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.7 | 21 / 35 | 5235 |
| 2 | 1 | 68.9 | 90.2 | 20 / 35 | 5188 |
| 3 | 1 | 69.0 | 87.3 | 20 / 35 | 5747 |
| 4 | 1 | 66.6 | 82.2 | 16 / 35 | 5177 |
| 5 | 1 | 67.4 | 84.4 | 18 / 35 | 5428 |
| 6 | 1 | 69.0 | 86.7 | 19 / 35 | 5932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 59 | 69% |
| mld.DustBunny 3.8 | 46 | 89% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| maribo.melee.BMV 0.1 | 9 | 56% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 5 | 60% |

Hadur died in 96 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 38 | 40% | 83 |
| mld.DustBunny 3.8 | 23 | 24% | 57 |
| maribo.melee.BMV 0.1 | 12 | 13% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 18 |
| zyx.nano.Ant 1.1 | 7 | 7% | 9 |
| fullsail.SweetTea 1.1 | 4 | 4% | 12 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 10 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.3 | 144 / 210 | 2.23 | 20.7% | 38476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 20.7% | 144 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.3% | 9 |
| fm.mammillarias 1.3 | 5.2 | 9.7% | 5 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 13 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 4 |
| sample.Fire 1.0 | 9.3 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 89.5 | 26 / 35 | 6757 |
| 2 | 1 | 70.6 | 83.5 | 24 / 35 | 6295 |
| 3 | 1 | 71.1 | 85.7 | 22 / 35 | 6779 |
| 4 | 1 | 70.5 | 86.7 | 22 / 35 | 6471 |
| 5 | 1 | 71.2 | 90.2 | 26 / 35 | 6309 |
| 6 | 1 | 69.8 | 82.5 | 24 / 35 | 5865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 85% |
| cb.nano.Insomnia 1.0 | 21 | 90% |
| myl.nano.KomoriNinja 1.1 | 20 | 95% |
| fm.mammillarias 1.3 | 9 | 78% |
| sp.Nanos.Ember 1.1 | 8 | 63% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 15 | 23% | 35 |
| myl.micro.Troodon 1.10 | 13 | 20% | 65 |
| myl.nano.KomoriNinja 1.1 | 11 | 17% | 46 |
| cb.nano.Insomnia 1.0 | 8 | 12% | 16 |
| sp.Nanos.Ember 1.1 | 7 | 11% | 18 |
| fm.mammillarias 1.3 | 7 | 11% | 13 |
| sample.Fire 1.0 | 3 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 1 | 2% | 8 |
| sample.Tracker 1.0 | 1 | 2% | 1 |

## Melee bench: F04

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.2 | 150 / 210 | 2.33 | 20.7% | 40717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 20.7% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.1% | 9 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.5% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.1% | 1 |
| tj.zombie1n 1.0.1 | 5.2 | 9.0% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.0% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 9 |
| yk.JahMicro 1.0 | 8.2 | 7.3% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 6.9% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.9 | 25 / 35 | 6941 |
| 2 | 1 | 69.1 | 81.6 | 24 / 35 | 6282 |
| 3 | 1 | 70.7 | 84.1 | 25 / 35 | 7010 |
| 4 | 1 | 69.9 | 84.1 | 24 / 35 | 6642 |
| 5 | 1 | 72.4 | 93.3 | 28 / 35 | 6985 |
| 6 | 1 | 69.3 | 80.0 | 24 / 35 | 6857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 91% |
| stelo.SoJNanoMelee 1.1 | 38 | 89% |
| tvv.micro.Antares 1.1.1 | 24 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| sample.VelociRobot 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 6 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 43% | 83 |
| stelo.SoJNanoMelee 1.1 | 11 | 18% | 32 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 34 |
| repositorio.NanoStep 1.0 | 5 | 8% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 20 |
| tj.zombie1n 1.0.1 | 3 | 5% | 8 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| yk.JahMicro 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 69.3 | 99 / 210 | 3.77 | 16.0% | 29502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 16.0% | 99 |
| oog.melee.Corsair 1.0 | 2.0 | 12.6% | 31 |
| ahf.NanoAndrew .4 | 3.3 | 11.2% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 16 |
| EBBU.Sim2 1.02 | 5.0 | 10.0% | 11 |
| sam.Samspin 1.0 | 5.7 | 10.0% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.9% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 9.0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 63.2 | 13 / 35 | 4776 |
| 2 | 1 | 64.3 | 69.8 | 18 / 35 | 4903 |
| 3 | 1 | 63.1 | 64.4 | 16 / 35 | 5277 |
| 4 | 1 | 66.7 | 80.6 | 21 / 35 | 5117 |
| 5 | 1 | 61.6 | 65.1 | 12 / 35 | 4553 |
| 6 | 1 | 64.8 | 72.4 | 19 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 95% |
| oog.melee.Corsair 1.0 | 31 | 74% |
| ahf.NanoAndrew .4 | 14 | 71% |
| EBBU.Sim2 1.02 | 10 | 70% |
| sam.Samspin 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 21% | 54 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 21 |
| zyx.nano.BacillusComma 1.0 | 15 | 13% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 13% | 13 |
| oog.melee.Corsair 1.0 | 12 | 11% | 38 |
| EBBU.Sim2 1.02 | 11 | 10% | 18 |
| ahf.NanoAndrew .4 | 10 | 9% | 21 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 5 | 4% | 8 |

## Melee bench: F06

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.7 | 146 / 210 | 2.02 | 20.0% | 33896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 20.0% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 21 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.9% | 15 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 5 |
| fm.claire 1.7 | 6.2 | 8.2% | 0 |
| sample.SpinBot 1.0 | 8.5 | 6.5% | 1 |
| pa.Improved 1.0 | 9.0 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 27 / 35 | 5740 |
| 2 | 1 | 72.2 | 96.5 | 27 / 35 | 6252 |
| 3 | 1 | 70.7 | 92.7 | 27 / 35 | 5800 |
| 4 | 1 | 67.8 | 80.3 | 19 / 35 | 5730 |
| 5 | 1 | 68.2 | 84.4 | 20 / 35 | 5286 |
| 6 | 1 | 68.9 | 87.0 | 26 / 35 | 5088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 86% |
| oog.melee.CapuletDroid 1.1 | 36 | 97% |
| arthord.NanoSatanMelee Beta | 21 | 90% |
| gh.nano.Grofvuil 0.2 | 16 | 69% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| fm.claire 1.7 | 4 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 40% | 86 |
| gh.nano.Grofvuil 0.2 | 12 | 18% | 22 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 20 |
| fm.claire 1.7 | 6 | 9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 19 |
| oog.melee.CapuletDroid 1.1 | 4 | 6% | 44 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| sample.SpinBot 1.0 | 2 | 3% | 2 |
| pa.Improved 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.4 | 119 / 210 | 2.31 | 19.3% | 36045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 19.3% | 119 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.3% | 22 |
| mz.MicroGodMelee 1 | 3.8 | 12.9% | 25 |
| DBall.Anarchy 0.1 | 5.0 | 8.5% | 7 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.3% | 0 |
| el.JumpShoot 0.2 | 7.0 | 6.7% | 1 |
| acogdev.alpha 0.2 | 8.2 | 6.0% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.0 | 16 / 35 | 5361 |
| 2 | 1 | 69.9 | 87.6 | 22 / 35 | 6004 |
| 3 | 1 | 70.6 | 91.4 | 24 / 35 | 6029 |
| 4 | 1 | 68.9 | 81.9 | 22 / 35 | 6140 |
| 5 | 1 | 68.7 | 84.1 | 17 / 35 | 5954 |
| 6 | 1 | 70.2 | 87.6 | 18 / 35 | 6557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 90% |
| mz.MicroGodMelee 1 | 37 | 65% |
| gh.micro.Gruweltje 0.7 | 20 | 65% |
| DBall.Anarchy 0.1 | 16 | 94% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 35 | 38% | 63 |
| gh.micro.Gruweltje 0.7 | 22 | 24% | 45 |
| spinnercat.micro.Tyger 0.1 | 21 | 23% | 65 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 14 |

## Melee bench: F08

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.4 | 115 / 210 | 3.30 | 17.2% | 32711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.3 | 17.2% | 115 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.1% | 24 |
| germ.TheMind .2 | 4.8 | 9.5% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.4% | 6 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 7 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.5% | 4 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.4 | 22 / 35 | 5271 |
| 2 | 2 | 63.9 | 67.3 | 18 / 35 | 5276 |
| 3 | 1 | 66.0 | 74.0 | 18 / 35 | 5622 |
| 4 | 1 | 64.6 | 67.6 | 18 / 35 | 5272 |
| 5 | 1 | 68.6 | 81.9 | 21 / 35 | 6056 |
| 6 | 2 | 65.8 | 76.2 | 18 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 89% |
| stelo.UntouchableNano 1.3 | 12 | 92% |
| germ.TheMind .2 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 46% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 19% | 39 |
| lrem.micro.MoggFanatic 0.2 | 9 | 9% | 13 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 19 |
| awesomeness.Elite 1.0 | 6 | 6% | 14 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 10 |
| germ.TheMind .2 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.3 | 159 / 210 | 1.96 | 20.2% | 30893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 20.2% | 159 |
| rz.HawkOnFire 0.1 | 2.0 | 14.2% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.3% | 7 |
| maribo.IotaCT 1.1 | 4.0 | 10.7% | 10 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.2% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 2 |
| spinnercat.Omen 1.0 | 7.3 | 8.1% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.2% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.8 | 27 / 35 | 5193 |
| 2 | 1 | 71.6 | 89.5 | 27 / 35 | 5693 |
| 3 | 1 | 71.5 | 94.3 | 30 / 35 | 5070 |
| 4 | 1 | 69.3 | 85.1 | 25 / 35 | 4960 |
| 5 | 1 | 68.9 | 85.1 | 24 / 35 | 4741 |
| 6 | 1 | 71.0 | 91.1 | 26 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 88 | 99% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| maribo.IotaCT 1.1 | 12 | 100% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| spinnercat.Omen 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 4 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 14 | 27% | 21 |
| rz.HawkOnFire 0.1 | 11 | 22% | 76 |
| stelo.PatternRobot 1.0 | 7 | 14% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 12% | 14 |
| ratosh.Wesco 1.4 | 5 | 10% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 42 |
| maribo.IotaCT 1.1 | 3 | 6% | 25 |
| spinnercat.Omen 1.0 | 2 | 4% | 9 |

## Melee bench: F10

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.1 | 180 / 210 | 1.62 | 21.9% | 39917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 21.9% | 180 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.4% | 10 |
| baal.nano.N 1.42 | 3.3 | 10.8% | 4 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.6% | 4 |
| zyx.micro.Ant 1.1 | 4.7 | 9.3% | 6 |
| sanja.First 0.1 | 6.8 | 8.4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 8.2 | 6.9% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.6 | 27 / 35 | 6553 |
| 2 | 1 | 72.4 | 96.2 | 31 / 35 | 6384 |
| 3 | 1 | 70.2 | 85.7 | 27 / 35 | 6473 |
| 4 | 1 | 73.5 | 97.5 | 33 / 35 | 7236 |
| 5 | 1 | 72.1 | 93.3 | 31 / 35 | 6557 |
| 6 | 1 | 72.7 | 97.5 | 31 / 35 | 6714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 95% |
| cvt.Firsty 1.0 | 26 | 100% |
| Grystrion.TrackerWO 1.0 | 25 | 96% |
| baal.nano.N 1.42 | 24 | 100% |
| sanja.First 0.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 27% | 34 |
| baal.nano.N 1.42 | 6 | 20% | 30 |
| tvv.nano.Polaris 1.2 | 5 | 17% | 68 |
| sanja.First 0.1 | 3 | 10% | 26 |
| cvt.Firsty 1.0 | 2 | 7% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 7% | 13 |
| amk.Punbot.Punbot 0.01 | 2 | 7% | 4 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 14 |
| sample.RamFire 1.0 | 1 | 3% | 2 |

## Melee bench: F11

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.9 | 84 / 210 | 3.89 | 15.4% | 30235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.2 | 15.4% | 84 |
| kc.micro.Figment 1.0 | 2.3 | 13.7% | 57 |
| cs.Wren 1.0 | 2.7 | 13.2% | 23 |
| js.PinBall 1.6 | 4.3 | 11.2% | 20 |
| mz.Cork 0.1 | 4.7 | 10.7% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 6 |
| evd.X1 0.01 | 6.8 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 68.3 | 15 / 35 | 4808 |
| 2 | 1 | 63.5 | 70.8 | 15 / 35 | 4940 |
| 3 | 1 | 64.1 | 70.8 | 15 / 35 | 5255 |
| 4 | 1 | 63.3 | 68.3 | 12 / 35 | 5157 |
| 5 | 2 | 59.4 | 58.7 | 13 / 35 | 4487 |
| 6 | 1 | 64.5 | 70.5 | 14 / 35 | 5588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 66% |
| cs.Wren 1.0 | 19 | 95% |
| js.PinBall 1.6 | 8 | 88% |
| joe.ADinosaur 1.0 | 8 | 88% |
| mz.Cork 0.1 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 4 | 75% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 43% | 96 |
| cs.Wren 1.0 | 15 | 12% | 28 |
| evd.X1 0.01 | 12 | 9% | 16 |
| PSW.Relentless 0.1 | 12 | 9% | 13 |
| js.PinBall 1.6 | 11 | 9% | 22 |
| mz.Cork 0.1 | 10 | 8% | 14 |
| joe.ADinosaur 1.0 | 10 | 8% | 11 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.7 | 138 / 210 | 2.38 | 19.1% | 29560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 19.1% | 138 |
| ntc.Opposite 1.5 | 2.7 | 11.5% | 6 |
| myl.nano.Graviton 1.10 | 3.0 | 11.7% | 18 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.4% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.3% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.5% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 5 |
| DBall.NUKE 0.1 | 7.3 | 7.8% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.7% | 6 |
| pbg.R2D2 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.5 | 19 / 35 | 4785 |
| 2 | 1 | 69.6 | 87.0 | 25 / 35 | 5112 |
| 3 | 1 | 69.2 | 89.2 | 23 / 35 | 4897 |
| 4 | 1 | 68.6 | 84.1 | 26 / 35 | 4875 |
| 5 | 1 | 67.7 | 81.9 | 22 / 35 | 4981 |
| 6 | 1 | 68.3 | 83.5 | 23 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 94% |
| stelo.AreaTargetingBot 1.1 | 29 | 90% |
| ntc.Opposite 1.5 | 23 | 96% |
| disan.Chair 2.2.0 | 16 | 81% |
| donjezza.Muncho 1.0 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 79% |
| DBall.NUKE 0.1 | 14 | 93% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 23% | 24 |
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 34 |
| myl.nano.Graviton 1.10 | 11 | 15% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 15% | 25 |
| ntc.Opposite 1.5 | 10 | 14% | 26 |
| disan.Chair 2.2.0 | 6 | 8% | 23 |
| DBall.NUKE 0.1 | 2 | 3% | 13 |
| donjezza.Muncho 1.0 | 2 | 3% | 13 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.2 | 80 / 210 | 3.68 | 15.6% | 27388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.3 | 15.6% | 80 |
| oog.melee.Capulet 1.2 | 2.5 | 13.5% | 36 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.9% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 26 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 18 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 73.3 | 16 / 35 | 4876 |
| 2 | 1 | 65.0 | 72.7 | 15 / 35 | 4645 |
| 3 | 3 | 61.1 | 62.2 | 8 / 35 | 4198 |
| 4 | 1 | 65.0 | 73.3 | 14 / 35 | 4590 |
| 5 | 1 | 65.5 | 76.5 | 16 / 35 | 4507 |
| 6 | 1 | 62.4 | 63.2 | 11 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 62% |
| kawigi.micro.Shiz 1.1 | 29 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 62% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 8 | 88% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 38% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 18% | 38 |
| yagami.Tidus 0.11 | 17 | 13% | 30 |
| ejb.Polaris 1.0.1 | 16 | 12% | 29 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 31 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 5 |

## Melee bench: F14

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.7 | 136 / 210 | 2.74 | 18.2% | 29838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 18.2% | 136 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 19 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 19 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 14 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 10 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.8 | 22 / 35 | 5000 |
| 2 | 1 | 66.1 | 77.5 | 19 / 35 | 4645 |
| 3 | 1 | 66.1 | 74.9 | 21 / 35 | 4797 |
| 4 | 1 | 68.6 | 86.0 | 26 / 35 | 4910 |
| 5 | 1 | 67.1 | 80.3 | 23 / 35 | 4607 |
| 6 | 1 | 70.0 | 88.6 | 25 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 94% |
| wee.Gem 1.8.4 | 28 | 100% |
| wompi.Quokka 1.6 | 21 | 95% |
| ratosh.Nobo 0.21 | 13 | 85% |
| m3thos.Eva00 1.1 | 8 | 88% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 22% | 32 |
| wompi.Quokka 1.6 | 11 | 15% | 25 |
| bzdp.Pansy 2.1 | 10 | 14% | 61 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 12 |
| maribo.FollowFire 1 | 7 | 9% | 8 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 7 |
| m3thos.Eva00 1.1 | 6 | 8% | 12 |
| bayen.UbaMicro 1.4 | 5 | 7% | 8 |
| wee.Gem 1.8.4 | 4 | 5% | 43 |

## Melee bench: F15

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.8 | 124 / 210 | 2.00 | 21.5% | 47569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 21.5% | 124 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 20 |
| ayk.WallHugger 1.0 | 5.0 | 9.0% | 1 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.9% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.3 | 7.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 89.5 | 23 / 35 | 8254 |
| 2 | 1 | 72.4 | 87.9 | 22 / 35 | 7720 |
| 3 | 1 | 72.7 | 89.2 | 17 / 35 | 8132 |
| 4 | 1 | 71.5 | 84.4 | 20 / 35 | 7468 |
| 5 | 1 | 72.5 | 87.6 | 18 / 35 | 7965 |
| 6 | 1 | 73.5 | 94.3 | 24 / 35 | 8030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 107 | 72% |
| mz.NanoGod 2.02 | 15 | 67% |
| ayk.WallHugger 1.0 | 12 | 92% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 50% | 126 |
| mz.NanoGod 2.02 | 21 | 24% | 36 |
| exauge.GateKeeper 1.1.121g | 9 | 10% | 12 |
| ayk.WallHugger 1.0 | 6 | 7% | 15 |
| drd.Dreadknoght 0.9 | 3 | 3% | 10 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |

## Melee bench: F16

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.9 | 106 / 210 | 3.26 | 17.2% | 30437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 17.2% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 24 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 25 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.0% | 13 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 6.9% | 2 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 68.9 | 18 / 35 | 4267 |
| 2 | 1 | 67.1 | 81.3 | 20 / 35 | 5234 |
| 3 | 1 | 65.9 | 72.4 | 17 / 35 | 5369 |
| 4 | 1 | 67.0 | 78.4 | 19 / 35 | 5405 |
| 5 | 1 | 65.2 | 74.3 | 16 / 35 | 4763 |
| 6 | 1 | 66.0 | 74.0 | 16 / 35 | 5399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 97% |
| dummy.micro.Sparrow 2.5 | 23 | 83% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 88% |
| ap.Frederick 1.1 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 8 | 75% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 20 | 19% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 18% | 34 |
| bvh.micro.Freya 0.3 | 16 | 15% | 27 |
| conscience.Electron 1.3g | 14 | 13% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 15 |
| voidious.micro.BlitzBat 1.05 | 12 | 12% | 47 |
| dl.BetterWalls 1.0 | 6 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 14 |

## Melee bench: F17

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.0 | 149 / 210 | 2.26 | 21.3% | 44511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 21.3% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 20 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 13 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.5% | 7 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 6 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.6% | 4 |
| sample.Corners 1.0 | 9.2 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 81.0 | 25 / 35 | 7611 |
| 2 | 1 | 72.2 | 89.5 | 25 / 35 | 7436 |
| 3 | 1 | 71.9 | 85.7 | 27 / 35 | 7288 |
| 4 | 1 | 72.0 | 88.3 | 24 / 35 | 7593 |
| 5 | 1 | 72.0 | 89.5 | 25 / 35 | 7619 |
| 6 | 1 | 70.0 | 81.9 | 23 / 35 | 6964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 93% |
| sul.Lunar 1.1 | 44 | 98% |
| supersample.SuperBoxBot 1.0 | 28 | 89% |
| dsw.StaticD 1.0 | 13 | 69% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 29% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 27% | 60 |
| dsw.StaticD 1.0 | 7 | 11% | 21 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 10% | 10 |
| sul.Lunar 1.1 | 5 | 8% | 50 |
| tlp.ThreeLeggedPig 1 | 5 | 8% | 7 |
| sample.Corners 1.0 | 2 | 3% | 10 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorCO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.2 | 108 / 210 | 2.96 | 18.1% | 38367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCO 0.1 | 1.0 | 18.1% | 108 |
| radnor.DoctorBob 1.42 | 2.7 | 12.3% | 23 |
| mld.Wisdom 1.0 | 2.7 | 12.6% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.5% | 28 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 14 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 8 |
| sample.Walls 1.0 | 7.5 | 7.5% | 4 |
| jangs.ns51 1.0 | 8.2 | 6.9% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 6.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.4 | 20 / 35 | 7068 |
| 2 | 1 | 68.0 | 79.0 | 21 / 35 | 6261 |
| 3 | 1 | 66.0 | 75.6 | 15 / 35 | 5497 |
| 4 | 1 | 64.5 | 69.5 | 14 / 35 | 6216 |
| 5 | 1 | 68.6 | 81.3 | 18 / 35 | 6907 |
| 6 | 1 | 67.5 | 78.4 | 20 / 35 | 6418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 76% |
| radnor.DoctorBob 1.42 | 28 | 86% |
| mld.Wisdom 1.0 | 18 | 72% |
| amz.NanoClone 1.41 | 10 | 90% |
| jangs.ns51 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| sample.Walls 1.0 | 7 | 86% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 33% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 20% | 54 |
| radnor.DoctorBob 1.42 | 19 | 19% | 52 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 18 |
| sample.Walls 1.0 | 7 | 7% | 12 |
| amz.NanoClone 1.41 | 4 | 4% | 11 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

