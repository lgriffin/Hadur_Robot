# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.3 | 149 / 210 | 1.87 | 21.7% | 44003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.7% | 149 |
| mz.AntiGrav 1.0 | 2.2 | 14.5% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.7% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| sample.Walls 1.0 | 6.0 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 89.8 | 27 / 35 | 7191 |
| 2 | 1 | 72.2 | 88.9 | 23 / 35 | 7164 |
| 3 | 1 | 72.9 | 90.5 | 25 / 35 | 7525 |
| 4 | 1 | 72.6 | 90.8 | 24 / 35 | 7132 |
| 5 | 1 | 73.7 | 94.0 | 27 / 35 | 8053 |
| 6 | 1 | 71.8 | 87.9 | 23 / 35 | 6938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 94% |
| radnor.DoctorBob 1.42 | 41 | 93% |
| mld.Infinity 2.2 | 30 | 87% |
| amz.NanoClone 1.41 | 8 | 63% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 38% | 67 |
| mz.AntiGrav 1.0 | 17 | 28% | 69 |
| mld.Infinity 2.2 | 10 | 16% | 41 |
| amz.NanoClone 1.41 | 8 | 13% | 14 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.6 | 150 / 210 | 1.76 | 20.2% | 34334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.2% | 150 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.9% | 38 |
| mld.DustBunny 3.8 | 3.3 | 12.4% | 10 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 5.8 | 8.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 4 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 7.1% | 0 |
| cs.Grudge 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.0 | 24 / 35 | 5608 |
| 2 | 1 | 70.3 | 94.9 | 25 / 35 | 5903 |
| 3 | 1 | 71.1 | 94.9 | 24 / 35 | 6221 |
| 4 | 1 | 69.7 | 86.7 | 23 / 35 | 5860 |
| 5 | 1 | 69.6 | 87.0 | 27 / 35 | 5429 |
| 6 | 1 | 70.4 | 93.0 | 27 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 91% |
| oog.melee.Mercutio 1.0 | 62 | 76% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| maribo.melee.BMV 0.1 | 13 | 69% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 92% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 38% | 78 |
| mld.DustBunny 3.8 | 12 | 20% | 61 |
| maribo.melee.BMV 0.1 | 7 | 12% | 17 |
| fullsail.SweetTea 1.1 | 6 | 10% | 10 |
| zyx.nano.Ant 1.1 | 5 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 11 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 17 |
| bzdp.BoxCar 2.0 | 1 | 2% | 5 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 85.6 | 145 / 210 | 2.30 | 20.5% | 38314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.5% | 145 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.4% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.9% | 16 |
| fm.mammillarias 1.3 | 4.7 | 10.3% | 6 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.3% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.2% | 2 |
| sample.Fire 1.0 | 9.2 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 85.7 | 24 / 35 | 6373 |
| 2 | 1 | 70.2 | 84.8 | 24 / 35 | 6287 |
| 3 | 1 | 69.7 | 82.5 | 23 / 35 | 6231 |
| 4 | 1 | 72.6 | 93.0 | 29 / 35 | 6839 |
| 5 | 1 | 68.8 | 79.0 | 20 / 35 | 5970 |
| 6 | 1 | 71.4 | 88.6 | 25 / 35 | 6614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 47 | 87% |
| myl.micro.Troodon 1.10 | 46 | 100% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| sp.Nanos.Ember 1.1 | 12 | 92% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 31% | 56 |
| fm.mammillarias 1.3 | 11 | 17% | 17 |
| myl.nano.KomoriNinja 1.1 | 9 | 14% | 29 |
| myl.micro.Troodon 1.10 | 7 | 11% | 56 |
| cb.nano.Insomnia 1.0 | 6 | 9% | 9 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 18 |
| sample.Fire 1.0 | 4 | 6% | 11 |
| cs.sheldor.Talon 1.1 | 3 | 5% | 10 |
| sample.Tracker 1.0 | 1 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.4 | 147 / 210 | 2.22 | 20.3% | 38506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.3% | 147 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 12 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 17 |
| tj.zombie1n 1.0.1 | 5.8 | 8.8% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 11 |
| yk.JahMicro 1.0 | 6.8 | 8.4% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.3% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.5 | 30 / 35 | 6709 |
| 2 | 1 | 70.0 | 86.3 | 24 / 35 | 6529 |
| 3 | 1 | 70.2 | 85.1 | 21 / 35 | 6616 |
| 4 | 1 | 69.3 | 81.9 | 25 / 35 | 6198 |
| 5 | 1 | 70.3 | 87.9 | 25 / 35 | 6423 |
| 6 | 1 | 69.4 | 86.7 | 22 / 35 | 6031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 94% |
| stelo.SoJNanoMelee 1.1 | 44 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 87% |
| tvv.micro.Antares 1.1.1 | 13 | 77% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| yk.JahMicro 1.0 | 6 | 83% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 35% | 86 |
| stelo.SoJNanoMelee 1.1 | 18 | 29% | 47 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 6 |
| repositorio.NanoStep 1.0 | 3 | 5% | 10 |
| tj.zombie1n 1.0.1 | 3 | 5% | 7 |
| yk.JahMicro 1.0 | 2 | 3% | 11 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.5 | 93 / 210 | 3.65 | 16.0% | 28795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.0% | 93 |
| oog.melee.Corsair 1.0 | 2.2 | 13.2% | 41 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.2% | 22 |
| ahf.NanoAndrew .4 | 4.0 | 10.9% | 22 |
| EBBU.Sim2 1.02 | 5.5 | 9.5% | 7 |
| sam.Samspin 1.0 | 5.5 | 9.7% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 68.6 | 15 / 35 | 4826 |
| 2 | 1 | 61.7 | 63.5 | 14 / 35 | 4603 |
| 3 | 1 | 65.0 | 75.2 | 18 / 35 | 4605 |
| 4 | 1 | 64.5 | 74.6 | 17 / 35 | 4768 |
| 5 | 1 | 64.8 | 75.2 | 14 / 35 | 4955 |
| 6 | 1 | 63.3 | 66.0 | 15 / 35 | 5038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 39 | 62% |
| simonton.nano.MeleeSeed 1.8 | 31 | 90% |
| ahf.NanoAndrew .4 | 16 | 75% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| sample.TrackFire 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |

Hadur died in 118 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 24% | 58 |
| simonton.nano.MeleeSeed 1.8 | 21 | 18% | 43 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 17 |
| ahf.NanoAndrew .4 | 13 | 11% | 30 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 16 |
| EBBU.Sim2 1.02 | 9 | 8% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 9 |
| sam.Samspin 1.0 | 5 | 4% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.9 | 129 / 210 | 2.45 | 18.7% | 31809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.7% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 33 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.9% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.7% | 10 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.6% | 7 |
| fm.claire 1.7 | 5.7 | 8.9% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.7% | 5 |
| sample.SpinBot 1.0 | 8.2 | 7.0% | 1 |
| pa.Improved 1.0 | 8.7 | 6.1% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.5 | 24 / 35 | 5282 |
| 2 | 1 | 69.0 | 87.3 | 23 / 35 | 5443 |
| 3 | 1 | 68.0 | 82.5 | 19 / 35 | 5371 |
| 4 | 1 | 67.0 | 82.2 | 21 / 35 | 4940 |
| 5 | 1 | 68.2 | 82.2 | 23 / 35 | 5580 |
| 6 | 1 | 68.3 | 86.3 | 19 / 35 | 5193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 80% |
| oog.melee.CapuletDroid 1.1 | 31 | 97% |
| gh.nano.Grofvuil 0.2 | 18 | 78% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| sample.SpinBot 1.0 | 7 | 100% |
| fm.claire 1.7 | 5 | 60% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 32% | 64 |
| gh.nano.Grofvuil 0.2 | 16 | 20% | 34 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 46 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 17 |
| fm.claire 1.7 | 9 | 11% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 21 |
| sample.SpinBot 1.0 | 5 | 6% | 9 |
| kurios.DOSexe .9b | 1 | 1% | 5 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.1 | 117 / 210 | 2.43 | 19.0% | 36235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.0% | 117 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.4% | 30 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.4% | 28 |
| mz.MicroGodMelee 1 | 3.5 | 13.1% | 26 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 3 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.6% | 1 |
| acogdev.alpha 0.2 | 7.5 | 6.6% | 1 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.9% | 4 |
| el.JumpShoot 0.2 | 8.7 | 5.7% | 0 |
| fire219.CatBot 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 78.7 | 19 / 35 | 5722 |
| 2 | 1 | 66.7 | 78.7 | 15 / 35 | 5606 |
| 3 | 1 | 69.8 | 86.7 | 18 / 35 | 6564 |
| 4 | 1 | 69.6 | 87.9 | 22 / 35 | 6104 |
| 5 | 1 | 70.4 | 87.3 | 20 / 35 | 6680 |
| 6 | 1 | 68.9 | 85.1 | 23 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 54 | 65% |
| spinnercat.micro.Tyger 0.1 | 40 | 88% |
| gh.micro.Gruweltje 0.7 | 32 | 66% |
| DBall.Anarchy 0.1 | 15 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 33% | 64 |
| spinnercat.micro.Tyger 0.1 | 25 | 27% | 58 |
| gh.micro.Gruweltje 0.7 | 24 | 26% | 51 |
| acogdev.alpha 0.2 | 6 | 6% | 9 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 14 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 8 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.3 | 113 / 210 | 3.40 | 16.9% | 30564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.9% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.7% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 38 |
| germ.TheMind .2 | 4.5 | 9.9% | 13 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.2% | 0 |
| awesomeness.Elite 1.0 | 5.8 | 8.7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.4% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 69.5 | 18 / 35 | 4736 |
| 2 | 1 | 67.0 | 78.7 | 21 / 35 | 5404 |
| 3 | 1 | 65.3 | 72.4 | 19 / 35 | 5256 |
| 4 | 1 | 65.6 | 74.3 | 19 / 35 | 4898 |
| 5 | 1 | 64.5 | 71.7 | 17 / 35 | 4604 |
| 6 | 1 | 66.4 | 73.0 | 19 / 35 | 5666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 77% |
| germ.TheMind .2 | 10 | 70% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 41% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 15% | 35 |
| germ.TheMind .2 | 12 | 12% | 19 |
| awesomeness.Elite 1.0 | 8 | 8% | 12 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 9 |
| mym.EdgeStalker 1.0 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 8 |

## Melee bench: F09

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.7 | 148 / 210 | 2.11 | 19.9% | 31579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.9% | 148 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.5% | 9 |
| maribo.IotaCT 1.1 | 4.7 | 10.2% | 8 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 8.5% | 6 |
| stelo.PatternRobot 1.0 | 7.3 | 8.4% | 9 |
| spinnercat.Omen 1.0 | 8.8 | 7.6% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.7 | 26 / 35 | 4862 |
| 2 | 1 | 70.5 | 89.2 | 27 / 35 | 5086 |
| 3 | 1 | 71.4 | 93.0 | 27 / 35 | 5680 |
| 4 | 1 | 68.1 | 80.3 | 21 / 35 | 4999 |
| 5 | 1 | 71.1 | 89.2 | 25 / 35 | 5650 |
| 6 | 1 | 69.0 | 82.5 | 22 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 89% |
| nz.jdc.nano.GridFu 1.0 | 28 | 100% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| timmit.nano.TimDog 0.33 | 13 | 77% |
| ratosh.Wesco 1.4 | 12 | 75% |
| maribo.IotaCT 1.1 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 24% | 66 |
| timmit.nano.TimDog 0.33 | 14 | 23% | 24 |
| stelo.PatternRobot 1.0 | 9 | 15% | 24 |
| ratosh.Wesco 1.4 | 8 | 13% | 21 |
| nz.jdc.nano.GridFu 1.0 | 6 | 10% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 8 |
| maribo.IotaCT 1.1 | 3 | 5% | 19 |
| spinnercat.Omen 1.0 | 2 | 3% | 5 |

## Melee bench: F10

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.4 | 180 / 210 | 1.60 | 21.9% | 39344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.9% | 180 |
| baal.nano.N 1.42 | 2.5 | 11.5% | 4 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.5% | 8 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.3% | 2 |
| sanja.First 0.1 | 5.8 | 8.8% | 1 |
| zyx.micro.Ant 1.1 | 6.0 | 8.7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 2 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.6% | 3 |
| cvt.Firsty 1.0 | 8.2 | 7.1% | 5 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 93.7 | 31 / 35 | 6580 |
| 2 | 1 | 70.8 | 90.8 | 28 / 35 | 6292 |
| 3 | 1 | 72.3 | 96.2 | 31 / 35 | 6494 |
| 4 | 1 | 71.7 | 92.1 | 30 / 35 | 6735 |
| 5 | 1 | 71.7 | 93.0 | 30 / 35 | 6486 |
| 6 | 1 | 72.5 | 94.6 | 30 / 35 | 6757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 92% |
| tvv.nano.Polaris 1.2 | 32 | 100% |
| cvt.Firsty 1.0 | 28 | 89% |
| sanja.First 0.1 | 25 | 100% |
| zyx.micro.Ant 1.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 7 | 23% | 38 |
| zyx.micro.Ant 1.1 | 7 | 23% | 34 |
| tvv.nano.Polaris 1.2 | 5 | 17% | 63 |
| Grystrion.TrackerWO 1.0 | 5 | 17% | 14 |
| cvt.Firsty 1.0 | 3 | 10% | 16 |
| sanja.First 0.1 | 1 | 3% | 24 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 4 |
| sample.RamFire 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 67.2 | 70 / 210 | 3.95 | 15.0% | 30070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.4% | 75 |
| hadur117.micro.SaorWTH 0.1 | 1.8 | 15.0% | 70 |
| cs.Wren 1.0 | 3.2 | 12.9% | 32 |
| mz.Cork 0.1 | 4.3 | 11.1% | 11 |
| js.PinBall 1.6 | 4.7 | 10.7% | 9 |
| evd.X1 0.01 | 6.3 | 8.7% | 3 |
| joe.ADinosaur 1.0 | 6.5 | 9.0% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 3 |
| PSW.Relentless 0.1 | 9.3 | 5.4% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 67.0 | 9 / 35 | 4934 |
| 2 | 2 | 61.0 | 62.5 | 11 / 35 | 4908 |
| 3 | 2 | 64.5 | 75.2 | 10 / 35 | 5310 |
| 4 | 2 | 57.4 | 54.9 | 8 / 35 | 4419 |
| 5 | 2 | 62.4 | 65.4 | 13 / 35 | 4881 |
| 6 | 1 | 67.1 | 78.1 | 19 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 73 | 58% |
| cs.Wren 1.0 | 25 | 64% |
| mz.Cork 0.1 | 7 | 86% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |
| js.PinBall 1.6 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 41% | 98 |
| cs.Wren 1.0 | 25 | 18% | 36 |
| evd.X1 0.01 | 17 | 12% | 19 |
| PSW.Relentless 0.1 | 15 | 11% | 13 |
| joe.ADinosaur 1.0 | 11 | 8% | 12 |
| js.PinBall 1.6 | 7 | 5% | 9 |
| mz.Cork 0.1 | 6 | 4% | 12 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 7 |

## Melee bench: F12

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.2 | 122 / 210 | 2.79 | 18.4% | 30450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.4% | 122 |
| ntc.Opposite 1.5 | 2.8 | 11.7% | 15 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.4% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 8 |
| stelo.AreaTargetingBot 1.1 | 6.3 | 9.2% | 15 |
| disan.Chair 2.2.0 | 6.7 | 8.4% | 9 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 6 |
| pbg.R2D2 1.0 | 9.7 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.2 | 17 / 35 | 5504 |
| 2 | 1 | 66.9 | 80.3 | 22 / 35 | 4482 |
| 3 | 1 | 67.7 | 82.5 | 20 / 35 | 4968 |
| 4 | 1 | 68.0 | 80.6 | 23 / 35 | 5344 |
| 5 | 1 | 66.6 | 78.4 | 21 / 35 | 4775 |
| 6 | 1 | 67.1 | 76.8 | 19 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 30 | 87% |
| ntc.Opposite 1.5 | 24 | 83% |
| stelo.AreaTargetingBot 1.1 | 22 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 81% |
| disan.Chair 2.2.0 | 15 | 93% |
| donjezza.Muncho 1.0 | 14 | 100% |
| DBall.NUKE 0.1 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 20% | 46 |
| ntc.Opposite 1.5 | 18 | 20% | 31 |
| pfvicm.Sobieski 7.2.3b | 17 | 19% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 17% | 28 |
| stelo.AreaTargetingBot 1.1 | 13 | 15% | 26 |
| disan.Chair 2.2.0 | 4 | 5% | 14 |
| pbg.R2D2 1.0 | 2 | 2% | 13 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |
| DBall.NUKE 0.1 | 0 | 0% | 15 |

## Melee bench: F13

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.4 | 77 / 210 | 3.39 | 15.8% | 26487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 15.8% | 77 |
| oog.melee.Capulet 1.2 | 2.2 | 14.1% | 50 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.6% | 28 |
| yagami.Tidus 0.11 | 4.7 | 12.4% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.0 | 7.4% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.0 | 13 / 35 | 4526 |
| 2 | 1 | 64.3 | 71.1 | 13 / 35 | 4603 |
| 3 | 1 | 63.1 | 69.5 | 11 / 35 | 4264 |
| 4 | 1 | 66.0 | 77.8 | 13 / 35 | 4491 |
| 5 | 2 | 62.7 | 69.2 | 11 / 35 | 4007 |
| 6 | 1 | 65.7 | 74.0 | 16 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 50% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 57% |
| yagami.Tidus 0.11 | 20 | 90% |
| ejb.Polaris 1.0.1 | 5 | 80% |

Hadur died in 133 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 43% | 76 |
| yagami.Tidus 0.11 | 19 | 14% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 35 |
| ejb.Polaris 1.0.1 | 15 | 11% | 20 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 29 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.6 | 124 / 210 | 3.29 | 16.9% | 27378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.9% | 124 |
| bzdp.Pansy 2.1 | 2.3 | 12.6% | 17 |
| wompi.Quokka 1.6 | 3.8 | 11.6% | 15 |
| wee.Gem 1.8.4 | 3.8 | 11.7% | 27 |
| ratosh.Nobo 0.21 | 4.2 | 11.1% | 8 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 12 |
| bayen.UbaMicro 1.4 | 6.7 | 8.7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.5 | 22 / 35 | 4713 |
| 2 | 1 | 67.2 | 78.1 | 23 / 35 | 4916 |
| 3 | 1 | 66.4 | 79.4 | 23 / 35 | 4516 |
| 4 | 1 | 64.1 | 69.8 | 19 / 35 | 4476 |
| 5 | 1 | 62.8 | 68.6 | 18 / 35 | 4061 |
| 6 | 1 | 65.3 | 74.3 | 19 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 100% |
| wompi.Quokka 1.6 | 21 | 81% |
| wee.Gem 1.8.4 | 21 | 95% |
| ratosh.Nobo 0.21 | 11 | 100% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 335. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 14 | 16% | 26 |
| maribo.FollowFire 1 | 14 | 16% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 14% | 13 |
| ratosh.Nobo 0.21 | 11 | 13% | 20 |
| bayen.UbaMicro 1.4 | 10 | 12% | 19 |
| wee.Gem 1.8.4 | 8 | 9% | 33 |
| m3thos.Eva00 1.1 | 7 | 8% | 17 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 8 |
| bzdp.Pansy 2.1 | 4 | 5% | 61 |

## Melee bench: F15

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 89.8 | 125 / 210 | 1.91 | 21.6% | 47042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.6% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 59 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 21 |
| ayk.WallHugger 1.0 | 4.7 | 9.7% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.1% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 89.5 | 20 / 35 | 8280 |
| 2 | 1 | 73.3 | 90.8 | 23 / 35 | 7825 |
| 3 | 1 | 73.0 | 89.5 | 22 / 35 | 8072 |
| 4 | 1 | 72.6 | 89.2 | 21 / 35 | 7745 |
| 5 | 1 | 71.8 | 87.3 | 15 / 35 | 7641 |
| 6 | 1 | 73.0 | 92.7 | 24 / 35 | 7479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 106 | 75% |
| mz.NanoGod 2.02 | 16 | 56% |
| ayk.WallHugger 1.0 | 13 | 85% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 50% | 134 |
| mz.NanoGod 2.02 | 24 | 28% | 37 |
| ayk.WallHugger 1.0 | 7 | 8% | 12 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 9 |
| stelo.PianistNano 1.2 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 3 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.0 | 103 / 210 | 3.43 | 16.7% | 29067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.7% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.6% | 34 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.1% | 24 |
| bvh.micro.Freya 0.3 | 4.3 | 11.1% | 17 |
| stelo.MirrorMicro 1.0 | 6.5 | 8.9% | 6 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.0 | 18 / 35 | 5225 |
| 2 | 1 | 62.5 | 65.7 | 16 / 35 | 4521 |
| 3 | 1 | 64.2 | 71.1 | 19 / 35 | 4495 |
| 4 | 1 | 64.1 | 69.5 | 16 / 35 | 4956 |
| 5 | 1 | 68.0 | 83.8 | 21 / 35 | 4969 |
| 6 | 1 | 63.9 | 68.9 | 13 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 86% |
| dummy.micro.Sparrow 2.5 | 26 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 71% |
| bvh.micro.Freya 0.3 | 14 | 64% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 67% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 20% | 65 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 39 |
| conscience.Electron 1.3g | 15 | 14% | 21 |
| dl.BetterWalls 1.0 | 13 | 12% | 17 |
| bvh.micro.Freya 0.3 | 11 | 10% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 11 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 5 |

## Melee bench: F17

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.8 | 141 / 210 | 2.37 | 20.6% | 40700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.6% | 141 |
| sheldor.melee.nano.TestMelee 0.1 | 2.5 | 13.4% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.8% | 14 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.4% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.8% | 9 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 6 |
| sample.Corners 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.5 | 24 / 35 | 7295 |
| 2 | 1 | 71.7 | 88.3 | 26 / 35 | 7002 |
| 3 | 1 | 67.6 | 73.0 | 21 / 35 | 6033 |
| 4 | 1 | 71.2 | 85.7 | 24 / 35 | 6893 |
| 5 | 1 | 70.9 | 86.3 | 23 / 35 | 6881 |
| 6 | 1 | 70.1 | 84.8 | 23 / 35 | 6596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 98% |
| supersample.SuperBoxBot 1.0 | 32 | 88% |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 87% |
| dsw.StaticD 1.0 | 14 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 82% |
| sample.Corners 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 32% | 51 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 26% | 48 |
| dsw.StaticD 1.0 | 12 | 17% | 22 |
| sul.Lunar 1.1 | 5 | 7% | 53 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 11 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 7 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 4 |
| sample.Corners 1.0 | 0 | 0% | 10 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 74.0 | 100 / 210 | 3.34 | 17.2% | 36173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 17.2% | 100 |
| radnor.DoctorBob 1.42 | 2.7 | 13.2% | 27 |
| mld.Wisdom 1.0 | 3.3 | 12.3% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 28 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.4% | 5 |
| amz.NanoClone 1.41 | 5.5 | 9.9% | 13 |
| sample.Walls 1.0 | 7.0 | 8.1% | 8 |
| GarmBox.Oranges 1.0 | 7.8 | 7.5% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 73.3 | 16 / 35 | 5752 |
| 2 | 1 | 69.4 | 86.0 | 22 / 35 | 6251 |
| 3 | 1 | 66.0 | 73.3 | 16 / 35 | 6315 |
| 4 | 1 | 67.7 | 77.8 | 22 / 35 | 6456 |
| 5 | 1 | 61.9 | 62.2 | 11 / 35 | 5534 |
| 6 | 1 | 64.7 | 71.4 | 13 / 35 | 5865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 79% |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 84% |
| mld.Wisdom 1.0 | 17 | 59% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| amz.NanoClone 1.41 | 8 | 50% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 28% | 59 |
| mld.Wisdom 1.0 | 23 | 21% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 18% | 49 |
| KiraNL.Chupacabra 0.4 | 18 | 16% | 23 |
| amz.NanoClone 1.41 | 9 | 8% | 12 |
| jangs.ns51 1.0 | 4 | 4% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 8 |
| sample.Walls 1.0 | 2 | 2% | 9 |

