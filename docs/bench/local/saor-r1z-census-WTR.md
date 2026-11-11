# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.1 | 152 / 210 | 2.07 | 21.6% | 44210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.6% | 152 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 20 |
| mz.AntiGrav 1.0 | 2.8 | 13.7% | 16 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 3 |
| sample.Walls 1.0 | 6.7 | 7.0% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 91.4 | 27 / 35 | 7506 |
| 2 | 1 | 71.1 | 84.4 | 22 / 35 | 7231 |
| 3 | 1 | 72.4 | 89.5 | 25 / 35 | 7397 |
| 4 | 1 | 73.0 | 88.9 | 29 / 35 | 7257 |
| 5 | 1 | 72.8 | 89.2 | 26 / 35 | 7422 |
| 6 | 1 | 71.7 | 85.4 | 23 / 35 | 7397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 93% |
| mld.Infinity 2.2 | 43 | 95% |
| radnor.DoctorBob 1.42 | 38 | 87% |
| amz.NanoClone 1.41 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 38% | 70 |
| mz.AntiGrav 1.0 | 15 | 26% | 65 |
| mld.Infinity 2.2 | 9 | 16% | 45 |
| sample.Walls 1.0 | 4 | 7% | 9 |
| GarmBox.Oranges 1.0 | 4 | 7% | 5 |
| amz.NanoClone 1.41 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.9 | 129 / 210 | 2.09 | 19.1% | 32901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.1% | 129 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 49 |
| mld.DustBunny 3.8 | 3.7 | 11.8% | 12 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.2% | 10 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.2% | 4 |
| bzdp.BoxCar 2.0 | 8.2 | 7.4% | 1 |
| fullsail.SweetTea 1.1 | 8.7 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.6 | 21 / 35 | 5361 |
| 2 | 1 | 67.4 | 86.0 | 18 / 35 | 4860 |
| 3 | 1 | 68.8 | 86.3 | 21 / 35 | 6098 |
| 4 | 1 | 69.0 | 84.4 | 24 / 35 | 5549 |
| 5 | 1 | 69.4 | 89.2 | 23 / 35 | 5312 |
| 6 | 1 | 69.8 | 92.7 | 22 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 69% |
| mld.DustBunny 3.8 | 40 | 80% |
| djdjdj.NanoSkunk10 1.0 | 15 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 100% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| zyx.nano.Ant 1.1 | 6 | 83% |

Hadur died in 81 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 38% | 86 |
| mld.DustBunny 3.8 | 15 | 19% | 46 |
| djdjdj.NanoSkunk10 1.0 | 8 | 10% | 23 |
| maribo.melee.BMV 0.1 | 7 | 9% | 15 |
| zyx.nano.Ant 1.1 | 7 | 9% | 11 |
| fullsail.SweetTea 1.1 | 6 | 7% | 11 |
| bzdp.BoxCar 2.0 | 4 | 5% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 2% | 13 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.5 | 136 / 210 | 2.48 | 20.0% | 38164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.0% | 136 |
| myl.micro.Troodon 1.10 | 2.3 | 13.5% | 28 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.6% | 25 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 9 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 4 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.7% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.2% | 4 |
| sample.Fire 1.0 | 9.5 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 89.5 | 28 / 35 | 6882 |
| 2 | 1 | 70.3 | 87.0 | 22 / 35 | 6230 |
| 3 | 1 | 70.8 | 87.3 | 23 / 35 | 6650 |
| 4 | 1 | 70.0 | 81.3 | 25 / 35 | 6290 |
| 5 | 1 | 67.7 | 76.2 | 18 / 35 | 6008 |
| 6 | 1 | 69.3 | 80.0 | 20 / 35 | 6104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 45 | 91% |
| myl.micro.Troodon 1.10 | 41 | 98% |
| cb.nano.Insomnia 1.0 | 16 | 94% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 14 | 100% |
| fm.mammillarias 1.3 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 24% | 55 |
| fm.mammillarias 1.3 | 13 | 18% | 20 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 16 |
| myl.nano.KomoriNinja 1.1 | 9 | 12% | 30 |
| myl.micro.Troodon 1.10 | 8 | 11% | 56 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 18 |
| sample.Fire 1.0 | 6 | 8% | 9 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.8 | 148 / 210 | 2.10 | 20.8% | 40062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.8% | 148 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 17 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.2% | 16 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.7% | 4 |
| yk.JahMicro 1.0 | 7.2 | 7.7% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 83.5 | 21 / 35 | 6673 |
| 2 | 1 | 70.3 | 87.3 | 25 / 35 | 6358 |
| 3 | 1 | 72.4 | 91.4 | 28 / 35 | 7175 |
| 4 | 1 | 70.7 | 90.2 | 26 / 35 | 6294 |
| 5 | 1 | 69.9 | 84.8 | 23 / 35 | 6642 |
| 6 | 1 | 71.7 | 89.8 | 25 / 35 | 6920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 91% |
| stelo.SoJNanoMelee 1.1 | 44 | 80% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 75% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 28 | 45% | 101 |
| stelo.SoJNanoMelee 1.1 | 12 | 19% | 36 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 13% | 11 |
| tj.zombie1n 1.0.1 | 4 | 6% | 5 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 14 |
| repositorio.NanoStep 1.0 | 2 | 3% | 6 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.6 | 100 / 210 | 3.55 | 16.4% | 29598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.4% | 100 |
| oog.melee.Corsair 1.0 | 2.0 | 12.8% | 36 |
| ahf.NanoAndrew .4 | 3.7 | 11.1% | 23 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.5% | 17 |
| EBBU.Sim2 1.02 | 5.7 | 9.7% | 7 |
| sam.Samspin 1.0 | 5.8 | 9.5% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.4% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.6% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 68.6 | 16 / 35 | 4853 |
| 2 | 1 | 65.3 | 74.0 | 18 / 35 | 5226 |
| 3 | 1 | 64.2 | 71.4 | 14 / 35 | 5093 |
| 4 | 1 | 64.4 | 71.7 | 19 / 35 | 4757 |
| 5 | 1 | 66.2 | 75.2 | 20 / 35 | 5227 |
| 6 | 1 | 62.4 | 68.9 | 13 / 35 | 4442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 41 | 85% |
| oog.melee.Corsair 1.0 | 34 | 74% |
| ahf.NanoAndrew .4 | 12 | 92% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 26 | 24% | 34 |
| oog.melee.Corsair 1.0 | 20 | 18% | 45 |
| zyx.nano.BacillusComma 1.0 | 17 | 15% | 18 |
| ahf.NanoAndrew .4 | 13 | 12% | 28 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 41 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 10 |
| EBBU.Sim2 1.02 | 7 | 6% | 17 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.7 | 135 / 210 | 2.29 | 19.2% | 33020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.2% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 31 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.4% | 8 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.3% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 5 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 5 |
| fm.claire 1.7 | 6.3 | 8.7% | 3 |
| sample.SpinBot 1.0 | 7.7 | 7.5% | 3 |
| pa.Improved 1.0 | 9.3 | 5.6% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.6 | 22 / 35 | 5028 |
| 2 | 1 | 68.4 | 82.9 | 22 / 35 | 5616 |
| 3 | 1 | 69.8 | 86.7 | 23 / 35 | 5956 |
| 4 | 1 | 69.3 | 89.5 | 24 / 35 | 5145 |
| 5 | 1 | 67.7 | 83.5 | 18 / 35 | 5423 |
| 6 | 1 | 70.3 | 89.8 | 26 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 89% |
| oog.melee.CapuletDroid 1.1 | 37 | 97% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| sample.SpinBot 1.0 | 10 | 100% |
| gh.nano.Grofvuil 0.2 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 75 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 36% | 81 |
| gh.nano.Grofvuil 0.2 | 12 | 16% | 30 |
| arthord.NanoSatanMelee Beta | 9 | 12% | 15 |
| oog.melee.CapuletDroid 1.1 | 8 | 11% | 42 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 13 |
| sample.SpinBot 1.0 | 4 | 5% | 8 |
| fm.claire 1.7 | 4 | 5% | 6 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| pa.Improved 1.0 | 3 | 4% | 6 |

## Melee bench: F07

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.1 | 111 / 210 | 2.61 | 18.7% | 36346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.7% | 111 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.5% | 31 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 13.8% | 29 |
| mz.MicroGodMelee 1 | 3.8 | 12.4% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 9.2% | 7 |
| caimano.Furia_Ceca 0.22 | 6.8 | 7.1% | 0 |
| acogdev.alpha 0.2 | 7.5 | 6.5% | 2 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.2% | 2 |
| el.JumpShoot 0.2 | 8.5 | 6.0% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 18 / 35 | 5762 |
| 2 | 1 | 67.4 | 77.5 | 19 / 35 | 5816 |
| 3 | 1 | 66.3 | 76.5 | 13 / 35 | 5697 |
| 4 | 1 | 70.0 | 88.6 | 23 / 35 | 6230 |
| 5 | 1 | 68.5 | 80.3 | 17 / 35 | 6255 |
| 6 | 1 | 70.5 | 87.6 | 21 / 35 | 6586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 87% |
| mz.MicroGodMelee 1 | 37 | 57% |
| gh.micro.Gruweltje 0.7 | 21 | 67% |
| DBall.Anarchy 0.1 | 15 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 30 | 30% | 55 |
| gh.micro.Gruweltje 0.7 | 27 | 27% | 45 |
| spinnercat.micro.Tyger 0.1 | 19 | 19% | 61 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 8 |
| DBall.Anarchy 0.1 | 5 | 5% | 19 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 7 |

## Melee bench: F08

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.9 | 113 / 210 | 3.44 | 16.9% | 31131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 16.9% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 10.3% | 7 |
| germ.TheMind .2 | 5.5 | 9.4% | 10 |
| awesomeness.Elite 1.0 | 6.2 | 8.4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 3 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.8% | 11 |
| sample.Crazy 1.0 | 9.0 | 6.5% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 76.5 | 23 / 35 | 5268 |
| 2 | 1 | 65.8 | 72.1 | 17 / 35 | 5450 |
| 3 | 1 | 66.7 | 76.8 | 21 / 35 | 5244 |
| 4 | 1 | 64.5 | 71.1 | 17 / 35 | 4988 |
| 5 | 2 | 62.1 | 64.8 | 14 / 35 | 4603 |
| 6 | 1 | 66.9 | 75.9 | 21 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 97% |
| qualidafial.MajorDick 1.0.1 | 14 | 93% |
| germ.TheMind .2 | 11 | 91% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| awesomeness.Elite 1.0 | 5 | 80% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 40% | 83 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 20% | 48 |
| germ.TheMind .2 | 10 | 10% | 20 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 9 | 9% | 11 |
| awesomeness.Elite 1.0 | 8 | 8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.0 | 145 / 210 | 2.17 | 19.7% | 30941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.7% | 145 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.6% | 14 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 4 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 10 |
| spinnercat.Omen 1.0 | 7.7 | 7.7% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 4 |
| ratosh.Wesco 1.4 | 8.0 | 7.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.6 | 24 / 35 | 5053 |
| 2 | 1 | 68.7 | 83.8 | 22 / 35 | 4820 |
| 3 | 1 | 71.2 | 89.8 | 27 / 35 | 5244 |
| 4 | 1 | 69.7 | 83.8 | 22 / 35 | 5157 |
| 5 | 1 | 70.1 | 85.1 | 22 / 35 | 5525 |
| 6 | 1 | 70.6 | 91.1 | 28 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 86% |
| nz.jdc.nano.GridFu 1.0 | 37 | 97% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| timmit.nano.TimDog 0.33 | 9 | 56% |
| maribo.IotaCT 1.1 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 29% | 73 |
| nz.jdc.nano.GridFu 1.0 | 12 | 18% | 53 |
| timmit.nano.TimDog 0.33 | 12 | 18% | 19 |
| stelo.PatternRobot 1.0 | 6 | 9% | 18 |
| maribo.IotaCT 1.1 | 5 | 8% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 11 |
| ratosh.Wesco 1.4 | 4 | 6% | 9 |
| spinnercat.Omen 1.0 | 3 | 5% | 7 |

## Melee bench: F10

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.6 | 172 / 210 | 1.75 | 21.4% | 38615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.4% | 172 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.0% | 13 |
| baal.nano.N 1.42 | 3.3 | 11.0% | 6 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.4% | 2 |
| sanja.First 0.1 | 5.8 | 8.8% | 3 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.1% | 0 |
| cvt.Firsty 1.0 | 7.2 | 7.9% | 7 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.6 | 31 / 35 | 6693 |
| 2 | 1 | 71.3 | 91.4 | 28 / 35 | 6510 |
| 3 | 1 | 70.6 | 88.6 | 25 / 35 | 6494 |
| 4 | 1 | 70.7 | 90.2 | 29 / 35 | 5988 |
| 5 | 1 | 71.7 | 92.7 | 30 / 35 | 6459 |
| 6 | 1 | 71.5 | 91.4 | 29 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 34 | 91% |
| cvt.Firsty 1.0 | 33 | 94% |
| sanja.First 0.1 | 28 | 96% |
| baal.nano.N 1.42 | 26 | 96% |
| zyx.micro.Ant 1.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 8 | 21% | 51 |
| baal.nano.N 1.42 | 8 | 21% | 38 |
| sanja.First 0.1 | 6 | 16% | 26 |
| Grystrion.TrackerWO 1.0 | 5 | 13% | 21 |
| amk.Punbot.Punbot 0.01 | 5 | 13% | 6 |
| cvt.Firsty 1.0 | 3 | 8% | 34 |
| sample.RamFire 1.0 | 2 | 5% | 4 |
| zyx.micro.Ant 1.1 | 1 | 3% | 23 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.0 | 100 / 210 | 3.43 | 16.7% | 32752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 16.7% | 100 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 63 |
| cs.Wren 1.0 | 3.3 | 12.1% | 16 |
| mz.Cork 0.1 | 4.3 | 11.5% | 16 |
| js.PinBall 1.6 | 4.5 | 10.8% | 6 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 2 |
| evd.X1 0.01 | 6.8 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 4 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 66.7 | 15 / 35 | 5357 |
| 2 | 1 | 62.4 | 67.6 | 11 / 35 | 4810 |
| 3 | 1 | 68.9 | 84.1 | 21 / 35 | 6100 |
| 4 | 1 | 64.5 | 70.5 | 19 / 35 | 5351 |
| 5 | 2 | 62.9 | 67.0 | 12 / 35 | 4977 |
| 6 | 1 | 69.0 | 82.2 | 22 / 35 | 6157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 75% |
| cs.Wren 1.0 | 28 | 86% |
| mz.Cork 0.1 | 15 | 87% |
| js.PinBall 1.6 | 13 | 85% |
| joe.ADinosaur 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 46% | 107 |
| cs.Wren 1.0 | 17 | 15% | 32 |
| evd.X1 0.01 | 11 | 10% | 11 |
| js.PinBall 1.6 | 10 | 9% | 21 |
| mz.Cork 0.1 | 7 | 6% | 17 |
| PSW.Relentless 0.1 | 5 | 5% | 3 |
| joe.ADinosaur 1.0 | 4 | 4% | 9 |
| jsal.Jsalbot 1.0 | 3 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.6 | 137 / 210 | 2.30 | 19.5% | 31071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.5% | 137 |
| myl.nano.Graviton 1.10 | 2.7 | 11.5% | 22 |
| ntc.Opposite 1.5 | 3.7 | 10.5% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.3% | 3 |
| DBall.NUKE 0.1 | 7.2 | 8.0% | 6 |
| disan.Chair 2.2.0 | 7.5 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 6.6% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.2 | 20 / 35 | 4791 |
| 2 | 1 | 69.7 | 88.9 | 23 / 35 | 5229 |
| 3 | 1 | 69.6 | 88.3 | 25 / 35 | 5176 |
| 4 | 1 | 69.4 | 85.1 | 21 / 35 | 5571 |
| 5 | 1 | 70.5 | 88.6 | 25 / 35 | 5722 |
| 6 | 1 | 66.8 | 79.4 | 23 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 79% |
| myl.nano.Graviton 1.10 | 37 | 86% |
| ntc.Opposite 1.5 | 22 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| donjezza.Muncho 1.0 | 14 | 93% |
| DBall.NUKE 0.1 | 8 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 25% | 50 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 16% | 27 |
| myl.nano.Graviton 1.10 | 9 | 12% | 42 |
| ntc.Opposite 1.5 | 8 | 11% | 20 |
| disan.Chair 2.2.0 | 4 | 5% | 15 |
| donjezza.Muncho 1.0 | 4 | 5% | 12 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |

## Melee bench: F13

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.4 | 77 / 210 | 3.39 | 15.9% | 26475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.3 | 15.9% | 77 |
| oog.melee.Capulet 1.2 | 1.8 | 14.7% | 61 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.2% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.4% | 16 |
| yagami.Tidus 0.11 | 5.0 | 11.7% | 10 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.5 | 15 / 35 | 4569 |
| 2 | 1 | 67.0 | 83.2 | 17 / 35 | 4488 |
| 3 | 1 | 63.5 | 65.4 | 13 / 35 | 4638 |
| 4 | 1 | 64.3 | 73.3 | 14 / 35 | 4179 |
| 5 | 2 | 63.7 | 69.8 | 9 / 35 | 4295 |
| 6 | 2 | 63.7 | 71.4 | 9 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 47% |
| kawigi.micro.Shiz 1.1 | 28 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 85% |
| yagami.Tidus 0.11 | 14 | 86% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 38% | 67 |
| yagami.Tidus 0.11 | 23 | 17% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 13% | 34 |
| kawigi.micro.Shiz 1.1 | 16 | 12% | 38 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| ejb.Polaris 1.0.1 | 7 | 5% | 15 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.8 | 119 / 210 | 3.18 | 16.9% | 27061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.9% | 119 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 14 |
| wee.Gem 1.8.4 | 4.0 | 11.5% | 22 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 12 |
| wompi.Quokka 1.6 | 4.7 | 11.1% | 15 |
| m3thos.Eva00 1.1 | 5.3 | 10.5% | 17 |
| bayen.UbaMicro 1.4 | 6.5 | 9.1% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 3 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 72.7 | 17 / 35 | 4476 |
| 2 | 1 | 67.0 | 79.4 | 22 / 35 | 4815 |
| 3 | 1 | 66.0 | 77.5 | 22 / 35 | 4584 |
| 4 | 1 | 64.3 | 71.1 | 19 / 35 | 4347 |
| 5 | 1 | 64.8 | 76.8 | 18 / 35 | 4380 |
| 6 | 1 | 65.7 | 77.1 | 21 / 35 | 4459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 92% |
| wee.Gem 1.8.4 | 30 | 97% |
| wompi.Quokka 1.6 | 18 | 94% |
| m3thos.Eva00 1.1 | 15 | 67% |
| ratosh.Nobo 0.21 | 11 | 91% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 371. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 14 | 15% | 26 |
| maribo.FollowFire 1 | 13 | 14% | 15 |
| ratosh.Nobo 0.21 | 12 | 13% | 26 |
| bzdp.Pansy 2.1 | 11 | 12% | 54 |
| wompi.Quokka 1.6 | 11 | 12% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 13 |
| bayen.UbaMicro 1.4 | 8 | 9% | 14 |
| wee.Gem 1.8.4 | 6 | 7% | 36 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 86.4 | 124 / 210 | 2.22 | 21.2% | 46701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.2% | 124 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 59 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 16 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.9% | 7 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 2 |
| ayk.WallHugger 1.0 | 5.7 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.8 | 21 / 35 | 7735 |
| 2 | 1 | 70.9 | 81.9 | 20 / 35 | 7135 |
| 3 | 1 | 72.2 | 84.8 | 22 / 35 | 7748 |
| 4 | 1 | 72.0 | 85.4 | 16 / 35 | 7728 |
| 5 | 1 | 72.7 | 87.6 | 19 / 35 | 8086 |
| 6 | 1 | 73.8 | 88.9 | 26 / 35 | 8269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 80% |
| mz.NanoGod 2.02 | 12 | 42% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| exauge.GateKeeper 1.1.121g | 8 | 75% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| stuff.Vlad 0.1 | 2 | 50% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 41% | 126 |
| mz.NanoGod 2.02 | 25 | 29% | 37 |
| exauge.GateKeeper 1.1.121g | 9 | 10% | 17 |
| ayk.WallHugger 1.0 | 9 | 10% | 11 |
| stuff.Vlad 0.1 | 4 | 5% | 7 |
| stelo.PianistNano 1.2 | 4 | 5% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 8 |

## Melee bench: F16

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.0 | 111 / 210 | 3.34 | 16.9% | 29411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.9% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.8% | 24 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 17 |
| bvh.micro.Freya 0.3 | 3.7 | 11.2% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.6% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 7 |
| conscience.Electron 1.3g | 7.2 | 7.7% | 1 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 10 |
| dl.BetterWalls 1.0 | 9.0 | 6.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.7 | 15 / 35 | 4929 |
| 2 | 1 | 64.7 | 71.1 | 20 / 35 | 4769 |
| 3 | 1 | 67.6 | 83.8 | 21 / 35 | 4899 |
| 4 | 1 | 68.2 | 81.3 | 22 / 35 | 5542 |
| 5 | 1 | 62.8 | 66.0 | 18 / 35 | 4579 |
| 6 | 1 | 63.9 | 70.2 | 15 / 35 | 4693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 92% |
| dummy.micro.Sparrow 2.5 | 26 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 83% |
| bvh.micro.Freya 0.3 | 23 | 87% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 17% | 43 |
| voidious.micro.BlitzBat 1.05 | 16 | 16% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 17 |
| dummy.micro.Sparrow 2.5 | 14 | 14% | 37 |
| conscience.Electron 1.3g | 14 | 14% | 19 |
| bvh.micro.Freya 0.3 | 11 | 11% | 25 |
| dl.BetterWalls 1.0 | 8 | 8% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 13 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 86.7 | 152 / 210 | 2.20 | 21.1% | 41834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.1% | 152 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 18 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 13 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.3% | 4 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 5 |
| dsw.StaticD 1.0 | 5.3 | 8.8% | 7 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.5% | 6 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.4% | 3 |
| sample.Corners 1.0 | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 88.9 | 27 / 35 | 7110 |
| 2 | 1 | 68.6 | 77.5 | 21 / 35 | 6534 |
| 3 | 1 | 70.0 | 83.8 | 23 / 35 | 6564 |
| 4 | 1 | 71.3 | 84.8 | 23 / 35 | 7379 |
| 5 | 1 | 71.7 | 87.9 | 28 / 35 | 6864 |
| 6 | 1 | 74.0 | 97.1 | 30 / 35 | 7383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 56 | 96% |
| sul.Lunar 1.1 | 45 | 98% |
| supersample.SuperBoxBot 1.0 | 24 | 96% |
| dsw.StaticD 1.0 | 14 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| sample.Corners 1.0 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 67% |

Hadur died in 59 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 15 | 25% | 70 |
| supersample.SuperBoxBot 1.0 | 13 | 22% | 30 |
| dsw.StaticD 1.0 | 12 | 20% | 24 |
| sample.Corners 1.0 | 5 | 8% | 10 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 7 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 7 |
| sul.Lunar 1.1 | 3 | 5% | 49 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 75.9 | 105 / 210 | 3.17 | 17.7% | 37009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.7% | 105 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.3% | 29 |
| mld.Wisdom 1.0 | 4.2 | 11.0% | 12 |
| amz.NanoClone 1.41 | 4.7 | 10.2% | 15 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 8 |
| sample.Walls 1.0 | 7.0 | 8.0% | 9 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 3 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 77.5 | 18 / 35 | 6308 |
| 2 | 1 | 66.6 | 74.6 | 17 / 35 | 6361 |
| 3 | 1 | 68.6 | 81.9 | 20 / 35 | 6270 |
| 4 | 1 | 63.2 | 64.8 | 13 / 35 | 5704 |
| 5 | 1 | 67.0 | 78.4 | 17 / 35 | 5983 |
| 6 | 1 | 68.0 | 78.4 | 20 / 35 | 6383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 57 | 89% |
| radnor.DoctorBob 1.42 | 32 | 69% |
| mld.Wisdom 1.0 | 12 | 67% |
| jangs.ns51 1.0 | 8 | 88% |
| amz.NanoClone 1.41 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| sample.Target 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 30% | 41 |
| radnor.DoctorBob 1.42 | 20 | 19% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 65 |
| KiraNL.Chupacabra 0.4 | 14 | 13% | 18 |
| amz.NanoClone 1.41 | 12 | 11% | 17 |
| sample.Walls 1.0 | 7 | 7% | 10 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

