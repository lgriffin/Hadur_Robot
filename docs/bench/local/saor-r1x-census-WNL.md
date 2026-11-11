# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.3 | 138 / 210 | 2.41 | 20.4% | 42509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 20.4% | 138 |
| radnor.DoctorBob 1.42 | 2.7 | 14.8% | 26 |
| mld.Infinity 2.2 | 3.0 | 13.6% | 13 |
| mz.AntiGrav 1.0 | 3.3 | 13.5% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.3 | 7.1% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 2 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 81.9 | 22 / 35 | 6692 |
| 2 | 1 | 72.2 | 86.0 | 24 / 35 | 7637 |
| 3 | 1 | 69.4 | 80.0 | 22 / 35 | 6600 |
| 4 | 1 | 72.6 | 87.0 | 26 / 35 | 7245 |
| 5 | 1 | 71.5 | 87.6 | 24 / 35 | 7146 |
| 6 | 1 | 70.6 | 83.2 | 20 / 35 | 7189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 53 | 96% |
| mld.Infinity 2.2 | 51 | 90% |
| radnor.DoctorBob 1.42 | 35 | 91% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 44% | 78 |
| mld.Infinity 2.2 | 13 | 18% | 53 |
| amz.NanoClone 1.41 | 12 | 17% | 18 |
| mz.AntiGrav 1.0 | 11 | 15% | 46 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.4 | 127 / 210 | 2.40 | 18.6% | 32552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.3 | 18.6% | 127 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.5% | 50 |
| mld.DustBunny 3.8 | 2.7 | 13.9% | 19 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 5 |
| zyx.nano.Ant 1.1 | 5.7 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.2% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 5 |
| bzdp.BoxCar 2.0 | 7.5 | 7.4% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 5.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 50.5 | 11 / 35 | 5062 |
| 2 | 1 | 70.5 | 91.7 | 27 / 35 | 5673 |
| 3 | 1 | 69.5 | 90.2 | 22 / 35 | 5720 |
| 4 | 1 | 69.5 | 90.2 | 24 / 35 | 5536 |
| 5 | 1 | 69.1 | 90.2 | 21 / 35 | 5138 |
| 6 | 1 | 70.0 | 94.0 | 22 / 35 | 5423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 81% |
| mld.DustBunny 3.8 | 54 | 85% |
| maribo.melee.BMV 0.1 | 10 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 24 | 29% | 76 |
| oog.melee.Mercutio 1.0 | 24 | 29% | 74 |
| maribo.melee.BMV 0.1 | 10 | 12% | 13 |
| zyx.nano.Ant 1.1 | 8 | 10% | 10 |
| fullsail.SweetTea 1.1 | 5 | 6% | 9 |
| bzdp.BoxCar 2.0 | 4 | 5% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 11 |
| cs.Grudge 1.0 | 3 | 4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.1 | 109 / 210 | 2.88 | 18.4% | 35110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 18.4% | 109 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 50 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.4% | 25 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.3% | 8 |
| fm.mammillarias 1.3 | 6.2 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 4 |
| sample.Fire 1.0 | 9.3 | 4.7% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.9 | 23 / 35 | 6266 |
| 2 | 1 | 68.7 | 81.6 | 22 / 35 | 5812 |
| 3 | 1 | 67.7 | 79.0 | 16 / 35 | 6025 |
| 4 | 1 | 67.0 | 76.2 | 16 / 35 | 5546 |
| 5 | 1 | 66.1 | 72.7 | 14 / 35 | 5718 |
| 6 | 1 | 67.6 | 77.1 | 18 / 35 | 5743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 80% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| myl.nano.KomoriNinja 1.1 | 14 | 79% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 30 | 30% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 26% | 48 |
| cb.nano.Insomnia 1.0 | 18 | 18% | 23 |
| myl.nano.KomoriNinja 1.1 | 9 | 9% | 28 |
| fm.mammillarias 1.3 | 9 | 9% | 13 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 8 |
| sample.Fire 1.0 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.4 | 153 / 210 | 1.95 | 21.1% | 41441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 21.1% | 153 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 17 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 10 |
| tj.zombie1n 1.0.1 | 5.8 | 8.5% | 4 |
| yk.JahMicro 1.0 | 6.5 | 8.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 7.9% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.3 | 24 / 35 | 6630 |
| 2 | 1 | 70.8 | 89.8 | 27 / 35 | 6537 |
| 3 | 1 | 72.0 | 90.2 | 26 / 35 | 7619 |
| 4 | 1 | 69.9 | 85.1 | 22 / 35 | 6720 |
| 5 | 1 | 72.7 | 94.9 | 28 / 35 | 7250 |
| 6 | 1 | 70.7 | 90.2 | 26 / 35 | 6685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 96% |
| stelo.SoJNanoMelee 1.1 | 44 | 93% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 83% |
| tj.zombie1n 1.0.1 | 8 | 88% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 45% | 85 |
| stelo.SoJNanoMelee 1.1 | 7 | 12% | 37 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 12% | 10 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 24 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 22 |
| tj.zombie1n 1.0.1 | 4 | 7% | 7 |
| repositorio.NanoStep 1.0 | 2 | 3% | 12 |
| yk.JahMicro 1.0 | 0 | 0% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 75.6 | 94 / 210 | 3.20 | 16.6% | 29543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.2 | 16.6% | 94 |
| oog.melee.Corsair 1.0 | 1.8 | 13.0% | 31 |
| ahf.NanoAndrew .4 | 3.7 | 11.6% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.0% | 27 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.5% | 5 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.1 | 20 / 35 | 5046 |
| 2 | 1 | 63.7 | 72.4 | 14 / 35 | 4799 |
| 3 | 1 | 66.6 | 79.4 | 16 / 35 | 5472 |
| 4 | 2 | 58.9 | 61.6 | 7 / 35 | 4090 |
| 5 | 1 | 65.8 | 78.7 | 20 / 35 | 4930 |
| 6 | 1 | 65.9 | 77.5 | 17 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 92% |
| oog.melee.Corsair 1.0 | 28 | 61% |
| ahf.NanoAndrew .4 | 18 | 67% |
| EBBU.Sim2 1.02 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| sam.Samspin 1.0 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 18% | 44 |
| ahf.NanoAndrew .4 | 20 | 17% | 33 |
| robar.nano.Assertive_Melee 0.2 | 20 | 17% | 29 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 19 |
| EBBU.Sim2 1.02 | 12 | 10% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 10 |
| sam.Samspin 1.0 | 10 | 9% | 17 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 38 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.4 | 139 / 210 | 2.13 | 19.7% | 34572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 19.7% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.6% | 24 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.2% | 13 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 8 |
| fm.claire 1.7 | 6.0 | 8.6% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 2 |
| sample.SpinBot 1.0 | 8.3 | 6.7% | 4 |
| pa.Improved 1.0 | 8.8 | 6.4% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 24 / 35 | 5831 |
| 2 | 1 | 68.3 | 85.7 | 20 / 35 | 5363 |
| 3 | 1 | 68.0 | 83.5 | 21 / 35 | 5513 |
| 4 | 1 | 71.0 | 91.7 | 26 / 35 | 6378 |
| 5 | 1 | 67.9 | 84.1 | 21 / 35 | 5452 |
| 6 | 1 | 71.0 | 92.1 | 27 / 35 | 6035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 81% |
| oog.melee.CapuletDroid 1.1 | 37 | 97% |
| arthord.NanoSatanMelee Beta | 19 | 95% |
| gh.nano.Grofvuil 0.2 | 14 | 86% |
| winamp32.micro.MicroMacro 1.0 | 12 | 100% |
| sample.SpinBot 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 30% | 64 |
| gh.nano.Grofvuil 0.2 | 14 | 20% | 29 |
| arthord.NanoSatanMelee Beta | 12 | 17% | 23 |
| oog.melee.CapuletDroid 1.1 | 11 | 15% | 54 |
| fm.claire 1.7 | 6 | 8% | 8 |
| sample.SpinBot 1.0 | 3 | 4% | 5 |
| kurios.DOSexe .9b | 2 | 3% | 8 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 13 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 78.6 | 97 / 210 | 2.92 | 17.5% | 33746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.2 | 17.5% | 97 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.5% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.8% | 32 |
| mz.MicroGodMelee 1 | 3.5 | 13.7% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 6 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.3% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.2 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.1% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 73.3 | 11 / 35 | 5356 |
| 2 | 1 | 66.5 | 77.8 | 15 / 35 | 5488 |
| 3 | 1 | 66.7 | 79.0 | 18 / 35 | 5318 |
| 4 | 1 | 68.2 | 79.7 | 21 / 35 | 6133 |
| 5 | 1 | 67.4 | 81.9 | 17 / 35 | 5471 |
| 6 | 1 | 67.5 | 80.0 | 15 / 35 | 5980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 47 | 72% |
| spinnercat.micro.Tyger 0.1 | 35 | 91% |
| gh.micro.Gruweltje 0.7 | 26 | 69% |
| DBall.Anarchy 0.1 | 7 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 39 | 35% | 76 |
| gh.micro.Gruweltje 0.7 | 27 | 24% | 44 |
| spinnercat.micro.Tyger 0.1 | 23 | 20% | 50 |
| DBall.Anarchy 0.1 | 6 | 5% | 11 |
| acogdev.alpha 0.2 | 5 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 10 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 76.3 | 117 / 210 | 3.13 | 17.3% | 32191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.4% | 46 |
| hadur117.micro.SaorWNL 0.1 | 1.7 | 17.3% | 117 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.9% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 5 |
| germ.TheMind .2 | 5.5 | 9.1% | 4 |
| awesomeness.Elite 1.0 | 6.0 | 8.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.3% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 83.8 | 21 / 35 | 5485 |
| 2 | 1 | 65.6 | 72.7 | 17 / 35 | 5873 |
| 3 | 2 | 65.7 | 75.9 | 19 / 35 | 5055 |
| 4 | 1 | 69.6 | 86.3 | 23 / 35 | 5983 |
| 5 | 2 | 63.0 | 66.0 | 19 / 35 | 4835 |
| 6 | 2 | 65.0 | 73.3 | 18 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 77% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| germ.TheMind .2 | 8 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 60% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 44% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 19% | 38 |
| awesomeness.Elite 1.0 | 10 | 11% | 13 |
| stelo.UntouchableNano 1.3 | 9 | 10% | 15 |
| germ.TheMind .2 | 6 | 6% | 15 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 9 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.2 | 140 / 210 | 2.42 | 19.0% | 29899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 19.0% | 140 |
| rz.HawkOnFire 0.1 | 2.0 | 14.4% | 30 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 12.0% | 13 |
| maribo.IotaCT 1.1 | 3.8 | 11.3% | 11 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.1% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 7.4% | 0 |
| stelo.PatternRobot 1.0 | 8.3 | 7.6% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.3 | 25 / 35 | 4598 |
| 2 | 1 | 69.8 | 87.0 | 24 / 35 | 5189 |
| 3 | 1 | 70.1 | 86.3 | 24 / 35 | 5508 |
| 4 | 1 | 70.6 | 88.6 | 26 / 35 | 5164 |
| 5 | 1 | 67.4 | 81.3 | 18 / 35 | 4394 |
| 6 | 1 | 67.3 | 75.6 | 23 / 35 | 5046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 91% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| maribo.IotaCT 1.1 | 15 | 93% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 24% | 66 |
| timmit.nano.TimDog 0.33 | 17 | 24% | 31 |
| stelo.PatternRobot 1.0 | 13 | 19% | 22 |
| ratosh.Wesco 1.4 | 9 | 13% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 9% | 10 |
| maribo.IotaCT 1.1 | 4 | 6% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 33 |
| spinnercat.Omen 1.0 | 1 | 1% | 6 |

## Melee bench: F10

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.2 | 156 / 210 | 1.88 | 21.1% | 39563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 21.1% | 156 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.3% | 8 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 13 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 2 |
| zyx.micro.Ant 1.1 | 4.5 | 9.8% | 16 |
| sanja.First 0.1 | 7.2 | 7.8% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.3% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.7% | 10 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 27 / 35 | 6731 |
| 2 | 1 | 71.1 | 89.2 | 26 / 35 | 6816 |
| 3 | 1 | 71.5 | 92.4 | 27 / 35 | 6753 |
| 4 | 1 | 69.9 | 87.0 | 24 / 35 | 6310 |
| 5 | 1 | 68.6 | 87.0 | 22 / 35 | 5774 |
| 6 | 1 | 72.5 | 93.3 | 30 / 35 | 7179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 97% |
| baal.nano.N 1.42 | 35 | 91% |
| cvt.Firsty 1.0 | 27 | 89% |
| zyx.micro.Ant 1.1 | 23 | 78% |
| sanja.First 0.1 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| amk.Punbot.Punbot 0.01 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 23 | 43% | 43 |
| cvt.Firsty 1.0 | 8 | 15% | 29 |
| Grystrion.TrackerWO 1.0 | 8 | 15% | 21 |
| baal.nano.N 1.42 | 7 | 13% | 36 |
| tvv.nano.Polaris 1.2 | 4 | 7% | 43 |
| sanja.First 0.1 | 2 | 4% | 22 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 6 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 66.2 | 78 / 210 | 4.04 | 15.0% | 31083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 67 |
| hadur117.micro.SaorWNL 0.1 | 1.8 | 15.0% | 78 |
| cs.Wren 1.0 | 2.8 | 13.3% | 25 |
| js.PinBall 1.6 | 4.3 | 11.4% | 16 |
| mz.Cork 0.1 | 4.7 | 11.0% | 15 |
| joe.ADinosaur 1.0 | 6.3 | 8.5% | 2 |
| evd.X1 0.01 | 6.8 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 63.2 | 12 / 35 | 5097 |
| 2 | 1 | 65.0 | 72.7 | 17 / 35 | 5383 |
| 3 | 2 | 61.9 | 62.9 | 13 / 35 | 5068 |
| 4 | 2 | 64.7 | 70.2 | 15 / 35 | 5424 |
| 5 | 3 | 59.1 | 57.5 | 11 / 35 | 4784 |
| 6 | 1 | 63.2 | 70.8 | 10 / 35 | 5327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 41 | 83% |
| cs.Wren 1.0 | 30 | 70% |
| mz.Cork 0.1 | 12 | 67% |
| js.PinBall 1.6 | 8 | 88% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 36% | 88 |
| cs.Wren 1.0 | 25 | 19% | 37 |
| evd.X1 0.01 | 19 | 14% | 20 |
| joe.ADinosaur 1.0 | 15 | 11% | 16 |
| mz.Cork 0.1 | 12 | 9% | 21 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| js.PinBall 1.6 | 6 | 4% | 12 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |

## Melee bench: F12

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.5 | 130 / 210 | 2.48 | 18.6% | 29335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 18.6% | 130 |
| myl.nano.Graviton 1.10 | 2.5 | 11.7% | 28 |
| ntc.Opposite 1.5 | 3.0 | 11.2% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 11.0% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 3 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.1% | 6 |
| disan.Chair 2.2.0 | 7.5 | 7.8% | 5 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.2 | 23 / 35 | 4836 |
| 2 | 1 | 65.0 | 72.7 | 18 / 35 | 5071 |
| 3 | 1 | 67.6 | 82.5 | 21 / 35 | 4947 |
| 4 | 1 | 69.8 | 89.5 | 24 / 35 | 5429 |
| 5 | 1 | 68.7 | 88.9 | 24 / 35 | 4513 |
| 6 | 1 | 67.1 | 84.4 | 20 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 93% |
| myl.nano.Graviton 1.10 | 33 | 82% |
| ntc.Opposite 1.5 | 16 | 63% |
| donjezza.Muncho 1.0 | 14 | 93% |
| DBall.NUKE 0.1 | 12 | 83% |
| disan.Chair 2.2.0 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 21 | 26% | 34 |
| myl.nano.Graviton 1.10 | 16 | 20% | 43 |
| ntc.Opposite 1.5 | 15 | 19% | 23 |
| stelo.AreaTargetingBot 1.1 | 12 | 15% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 6% | 18 |
| DBall.NUKE 0.1 | 4 | 5% | 15 |
| disan.Chair 2.2.0 | 3 | 4% | 14 |
| donjezza.Muncho 1.0 | 3 | 4% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 62.5 | 62 / 210 | 4.37 | 13.7% | 25045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 14.5% | 51 |
| hadur117.micro.SaorWNL 0.1 | 2.3 | 13.7% | 62 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 35 |
| yagami.Tidus 0.11 | 4.5 | 12.4% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.9% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 60.6 | 8 / 35 | 4268 |
| 2 | 1 | 61.7 | 64.4 | 11 / 35 | 4459 |
| 3 | 3 | 61.1 | 62.2 | 11 / 35 | 4205 |
| 4 | 4 | 58.8 | 59.7 | 8 / 35 | 3617 |
| 5 | 1 | 62.3 | 65.7 | 13 / 35 | 4463 |
| 6 | 3 | 60.7 | 62.5 | 11 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 23 | 96% |
| oog.melee.Capulet 1.2 | 22 | 45% |
| yagami.Tidus 0.11 | 14 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 69% |
| ejb.Polaris 1.0.1 | 10 | 70% |

Hadur died in 148 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 68 | 46% | 82 |
| yagami.Tidus 0.11 | 25 | 17% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 11% | 25 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 30 |
| ejb.Polaris 1.0.1 | 10 | 7% | 19 |
| stelo.MirrorNano 1.3 | 10 | 7% | 9 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.4 | 129 / 210 | 2.76 | 17.7% | 28982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 17.7% | 129 |
| wompi.Quokka 1.6 | 3.0 | 11.9% | 26 |
| bzdp.Pansy 2.1 | 3.3 | 12.0% | 16 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 10 |
| wee.Gem 1.8.4 | 4.0 | 11.6% | 17 |
| bayen.UbaMicro 1.4 | 6.3 | 8.6% | 7 |
| m3thos.Eva00 1.1 | 6.7 | 8.6% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.7 | 22 / 35 | 4637 |
| 2 | 1 | 66.2 | 78.4 | 20 / 35 | 4801 |
| 3 | 1 | 65.7 | 76.5 | 18 / 35 | 5139 |
| 4 | 1 | 67.4 | 81.9 | 22 / 35 | 5003 |
| 5 | 1 | 66.2 | 78.7 | 23 / 35 | 4833 |
| 6 | 1 | 67.8 | 87.3 | 24 / 35 | 4569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 96% |
| wee.Gem 1.8.4 | 36 | 100% |
| wompi.Quokka 1.6 | 18 | 83% |
| ratosh.Nobo 0.21 | 17 | 88% |
| m3thos.Eva00 1.1 | 13 | 85% |
| bayen.UbaMicro 1.4 | 8 | 63% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 17 | 21% | 32 |
| wompi.Quokka 1.6 | 13 | 16% | 29 |
| m3thos.Eva00 1.1 | 10 | 12% | 17 |
| bzdp.Pansy 2.1 | 9 | 11% | 46 |
| bayen.UbaMicro 1.4 | 9 | 11% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 10 |
| wee.Gem 1.8.4 | 7 | 9% | 47 |
| maribo.FollowFire 1 | 7 | 9% | 9 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 5 |

## Melee bench: F15

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 79.4 | 100 / 210 | 2.85 | 19.2% | 44408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.3 | 19.2% | 100 |
| wompi.Wallaby 5.1 | 1.7 | 18.8% | 89 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 15 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.4% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.8% | 1 |
| stuff.Vlad 0.1 | 5.0 | 9.0% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.4 | 77.5 | 16 / 35 | 7316 |
| 2 | 1 | 70.7 | 85.7 | 15 / 35 | 7418 |
| 3 | 2 | 68.4 | 73.7 | 14 / 35 | 7026 |
| 4 | 1 | 69.3 | 74.9 | 19 / 35 | 7386 |
| 5 | 1 | 71.1 | 81.0 | 16 / 35 | 8012 |
| 6 | 1 | 70.8 | 83.8 | 20 / 35 | 7250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 71% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| mz.NanoGod 2.02 | 5 | 60% |
| exauge.GateKeeper 1.1.121g | 5 | 80% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 59 | 54% | 139 |
| mz.NanoGod 2.02 | 26 | 24% | 33 |
| ayk.WallHugger 1.0 | 13 | 12% | 18 |
| exauge.GateKeeper 1.1.121g | 6 | 5% | 8 |
| stuff.Vlad 0.1 | 3 | 3% | 4 |
| drd.Dreadknoght 0.9 | 2 | 2% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.7 | 116 / 210 | 3.00 | 17.5% | 31408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 17.5% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.8% | 21 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.7% | 21 |
| bvh.micro.Freya 0.3 | 4.0 | 10.7% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 14 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.6% | 10 |
| conscience.Electron 1.3g | 6.8 | 8.1% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 11 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 22 / 35 | 5781 |
| 2 | 1 | 62.8 | 66.0 | 15 / 35 | 5016 |
| 3 | 1 | 67.5 | 82.9 | 23 / 35 | 5235 |
| 4 | 1 | 67.3 | 79.4 | 24 / 35 | 5169 |
| 5 | 1 | 64.1 | 72.7 | 13 / 35 | 5199 |
| 6 | 1 | 65.4 | 76.8 | 19 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 89% |
| dummy.micro.Sparrow 2.5 | 33 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 82% |
| bvh.micro.Freya 0.3 | 21 | 90% |
| stelo.MirrorMicro 1.0 | 8 | 75% |
| ap.Frederick 1.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 19% | 37 |
| voidious.micro.BlitzBat 1.05 | 17 | 18% | 54 |
| bvh.micro.Freya 0.3 | 16 | 17% | 31 |
| dummy.micro.Sparrow 2.5 | 14 | 15% | 41 |
| conscience.Electron 1.3g | 11 | 12% | 15 |
| dl.BetterWalls 1.0 | 8 | 8% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 6% | 6 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 13 |

## Melee bench: F17

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.4 | 152 / 210 | 2.05 | 21.6% | 44671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 21.6% | 152 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 11 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 10 |
| supersample.SuperBoxBot 1.0 | 3.5 | 10.6% | 16 |
| dsw.StaticD 1.0 | 5.5 | 8.1% | 11 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.5% | 2 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.8% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.3% | 3 |
| sample.Corners 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 94.3 | 31 / 35 | 8217 |
| 2 | 1 | 71.7 | 88.6 | 26 / 35 | 7231 |
| 3 | 1 | 72.6 | 89.8 | 26 / 35 | 7753 |
| 4 | 1 | 70.8 | 86.3 | 24 / 35 | 7120 |
| 5 | 1 | 69.6 | 82.2 | 21 / 35 | 6943 |
| 6 | 1 | 71.6 | 88.9 | 24 / 35 | 7407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 58 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 93% |
| supersample.SuperBoxBot 1.0 | 20 | 85% |
| dsw.StaticD 1.0 | 10 | 30% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.Corners 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 38% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 26% | 56 |
| dsw.StaticD 1.0 | 13 | 22% | 18 |
| sample.Corners 1.0 | 3 | 5% | 12 |
| sul.Lunar 1.1 | 2 | 3% | 56 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 11 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWNL 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.0 | 91 / 210 | 3.61 | 16.3% | 34699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNL 0.1 | 1.0 | 16.3% | 91 |
| mld.Wisdom 1.0 | 2.8 | 12.8% | 34 |
| radnor.DoctorBob 1.42 | 3.0 | 13.1% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.5% | 28 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.9% | 10 |
| amz.NanoClone 1.41 | 5.8 | 9.9% | 9 |
| sample.Walls 1.0 | 6.5 | 8.8% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 65.1 | 12 / 35 | 5324 |
| 2 | 1 | 63.4 | 66.7 | 14 / 35 | 5745 |
| 3 | 1 | 67.9 | 78.7 | 18 / 35 | 6679 |
| 4 | 1 | 65.7 | 73.0 | 16 / 35 | 5879 |
| 5 | 1 | 64.7 | 72.7 | 14 / 35 | 5437 |
| 6 | 1 | 64.4 | 69.5 | 17 / 35 | 5635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 94% |
| radnor.DoctorBob 1.42 | 28 | 96% |
| mld.Wisdom 1.0 | 15 | 40% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 39 | 33% | 44 |
| radnor.DoctorBob 1.42 | 26 | 22% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 13% | 50 |
| KiraNL.Chupacabra 0.4 | 14 | 12% | 20 |
| amz.NanoClone 1.41 | 8 | 7% | 12 |
| jangs.ns51 1.0 | 6 | 5% | 10 |
| GarmBox.Oranges 1.0 | 6 | 5% | 7 |
| sample.Walls 1.0 | 5 | 4% | 8 |

