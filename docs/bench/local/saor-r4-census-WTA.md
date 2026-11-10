# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 93.7 | 166 / 210 | 1.57 | 22.8% | 46038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 22.8% | 166 |
| mz.AntiGrav 1.0 | 2.2 | 14.6% | 13 |
| radnor.DoctorBob 1.42 | 3.3 | 13.4% | 15 |
| mld.Infinity 2.2 | 3.5 | 12.5% | 9 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 6 |
| sample.Walls 1.0 | 6.5 | 7.1% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.3% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 89.8 | 26 / 35 | 7869 |
| 2 | 1 | 74.5 | 96.8 | 30 / 35 | 7655 |
| 3 | 1 | 73.4 | 94.0 | 31 / 35 | 7151 |
| 4 | 1 | 74.5 | 95.2 | 28 / 35 | 8041 |
| 5 | 1 | 73.1 | 92.1 | 25 / 35 | 7482 |
| 6 | 1 | 73.9 | 94.0 | 26 / 35 | 7840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 93% |
| mld.Infinity 2.2 | 45 | 96% |
| radnor.DoctorBob 1.42 | 37 | 84% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 6 | 50% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 15 | 34% | 49 |
| mz.AntiGrav 1.0 | 9 | 20% | 79 |
| mld.Infinity 2.2 | 9 | 20% | 57 |
| amz.NanoClone 1.41 | 5 | 11% | 11 |
| sample.Walls 1.0 | 3 | 7% | 5 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.5 | 115 / 210 | 2.49 | 18.4% | 32731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.4% | 115 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 58 |
| mld.DustBunny 3.8 | 3.5 | 12.7% | 16 |
| maribo.melee.BMV 0.1 | 3.8 | 10.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.1% | 5 |
| zyx.nano.Ant 1.1 | 6.5 | 8.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.5% | 9 |
| bzdp.BoxCar 2.0 | 7.8 | 6.8% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.7% | 3 |
| cs.Grudge 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 21 / 35 | 5459 |
| 2 | 1 | 71.4 | 95.6 | 26 / 35 | 5959 |
| 3 | 1 | 68.2 | 83.8 | 22 / 35 | 5786 |
| 4 | 1 | 67.4 | 83.8 | 17 / 35 | 5123 |
| 5 | 1 | 68.3 | 88.6 | 19 / 35 | 5093 |
| 6 | 1 | 63.2 | 63.8 | 10 / 35 | 5311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 73% |
| mld.DustBunny 3.8 | 40 | 78% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| fullsail.SweetTea 1.1 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 38% | 75 |
| mld.DustBunny 3.8 | 28 | 29% | 59 |
| maribo.melee.BMV 0.1 | 8 | 8% | 16 |
| cs.Grudge 1.0 | 8 | 8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 13 |
| zyx.nano.Ant 1.1 | 4 | 4% | 9 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 15 |
| fullsail.SweetTea 1.1 | 2 | 2% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 78.8 | 118 / 210 | 2.91 | 18.9% | 35614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.9% | 118 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.7% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.7% | 23 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.2% | 9 |
| fm.mammillarias 1.3 | 5.7 | 9.7% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 2 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 86.0 | 24 / 35 | 6210 |
| 2 | 1 | 67.6 | 73.7 | 19 / 35 | 5852 |
| 3 | 1 | 67.9 | 75.9 | 18 / 35 | 5966 |
| 4 | 1 | 65.3 | 69.5 | 16 / 35 | 5368 |
| 5 | 1 | 69.8 | 84.4 | 20 / 35 | 5985 |
| 6 | 1 | 70.0 | 83.2 | 21 / 35 | 6233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 29 | 66% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| myl.nano.KomoriNinja 1.1 | 10 | 90% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 27% | 35 |
| myl.micro.Troodon 1.10 | 18 | 20% | 67 |
| cb.nano.Insomnia 1.0 | 15 | 16% | 27 |
| myl.nano.KomoriNinja 1.1 | 12 | 13% | 32 |
| fm.mammillarias 1.3 | 9 | 10% | 17 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 13 |
| sample.Fire 1.0 | 3 | 3% | 6 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 10 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.7 | 148 / 210 | 2.38 | 20.3% | 39028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.3% | 148 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.2% | 14 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.1% | 10 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.7% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.0 | 9.2% | 4 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 8.0% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 82.2 | 24 / 35 | 6692 |
| 2 | 1 | 70.3 | 82.9 | 25 / 35 | 6732 |
| 3 | 1 | 68.8 | 81.0 | 23 / 35 | 6425 |
| 4 | 1 | 69.7 | 84.1 | 23 / 35 | 6325 |
| 5 | 1 | 70.2 | 88.3 | 26 / 35 | 6198 |
| 6 | 1 | 71.4 | 89.8 | 27 / 35 | 6656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 95% |
| stelo.SoJNanoMelee 1.1 | 39 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 81% |
| tj.zombie1n 1.0.1 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 39% | 82 |
| stelo.SoJNanoMelee 1.1 | 12 | 19% | 36 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 27 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 9 |
| repositorio.NanoStep 1.0 | 2 | 3% | 11 |
| tj.zombie1n 1.0.1 | 2 | 3% | 11 |
| sample.VelociRobot 1.0 | 2 | 3% | 3 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 63.4 | 76 / 210 | 4.29 | 14.8% | 27312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 14.8% | 76 |
| oog.melee.Corsair 1.0 | 2.0 | 12.7% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.7% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 23 |
| EBBU.Sim2 1.02 | 5.5 | 10.0% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.5% | 8 |
| sam.Samspin 1.0 | 6.8 | 9.0% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.7% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 62.5 | 9 / 35 | 4673 |
| 2 | 1 | 60.2 | 61.0 | 13 / 35 | 4257 |
| 3 | 1 | 62.4 | 66.3 | 16 / 35 | 4501 |
| 4 | 1 | 61.3 | 63.5 | 12 / 35 | 4607 |
| 5 | 1 | 63.7 | 67.6 | 19 / 35 | 4672 |
| 6 | 2 | 60.2 | 59.7 | 7 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 90% |
| oog.melee.Corsair 1.0 | 25 | 56% |
| ahf.NanoAndrew .4 | 15 | 73% |
| sam.Samspin 1.0 | 12 | 92% |
| EBBU.Sim2 1.02 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 6 | 50% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 20% | 51 |
| oog.melee.Corsair 1.0 | 24 | 18% | 41 |
| bwbaugh.nano.Tirunculus 0.0.0a | 24 | 18% | 24 |
| EBBU.Sim2 1.02 | 16 | 12% | 26 |
| robar.nano.Assertive_Melee 0.2 | 15 | 11% | 19 |
| ahf.NanoAndrew .4 | 13 | 10% | 29 |
| sam.Samspin 1.0 | 8 | 6% | 12 |
| zyx.nano.BacillusComma 1.0 | 5 | 4% | 6 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.2 | 136 / 210 | 2.51 | 18.8% | 32387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.8% | 136 |
| d414.nano.Quantum 1.0.0 | 2.2 | 15.1% | 37 |
| gh.nano.Grofvuil 0.2 | 2.8 | 11.7% | 13 |
| arthord.NanoSatanMelee Beta | 4.7 | 9.5% | 2 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 9.5% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.7% | 8 |
| fm.claire 1.7 | 6.7 | 8.2% | 0 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 1 |
| pa.Improved 1.0 | 8.8 | 6.3% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 24 / 35 | 5133 |
| 2 | 1 | 66.8 | 78.7 | 19 / 35 | 5176 |
| 3 | 1 | 68.6 | 86.0 | 23 / 35 | 5348 |
| 4 | 1 | 68.9 | 84.4 | 23 / 35 | 5508 |
| 5 | 1 | 69.1 | 86.7 | 25 / 35 | 5374 |
| 6 | 1 | 68.6 | 81.3 | 22 / 35 | 5848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 86% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| arthord.NanoSatanMelee Beta | 21 | 90% |
| gh.nano.Grofvuil 0.2 | 14 | 71% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 29% | 75 |
| gh.nano.Grofvuil 0.2 | 12 | 16% | 28 |
| oog.melee.CapuletDroid 1.1 | 11 | 14% | 39 |
| arthord.NanoSatanMelee Beta | 10 | 13% | 24 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 19 |
| kurios.DOSexe .9b | 6 | 8% | 8 |
| fm.claire 1.7 | 4 | 5% | 8 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| pa.Improved 1.0 | 2 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.4 | 99 / 210 | 2.59 | 18.3% | 34489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.3% | 99 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.0% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.6% | 28 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 29 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.6% | 2 |
| el.JumpShoot 0.2 | 8.0 | 6.3% | 2 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.9% | 3 |
| acogdev.alpha 0.2 | 8.5 | 6.1% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.2 | 15 / 35 | 5245 |
| 2 | 1 | 67.9 | 81.3 | 16 / 35 | 5744 |
| 3 | 1 | 67.1 | 78.4 | 16 / 35 | 5759 |
| 4 | 1 | 68.9 | 83.2 | 18 / 35 | 6110 |
| 5 | 1 | 67.3 | 81.0 | 16 / 35 | 5666 |
| 6 | 1 | 69.2 | 87.3 | 18 / 35 | 5965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 82% |
| mz.MicroGodMelee 1 | 34 | 56% |
| gh.micro.Gruweltje 0.7 | 30 | 60% |
| DBall.Anarchy 0.1 | 12 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 44 | 40% | 68 |
| gh.micro.Gruweltje 0.7 | 26 | 23% | 49 |
| spinnercat.micro.Tyger 0.1 | 24 | 22% | 55 |
| acogdev.alpha 0.2 | 8 | 7% | 9 |
| DBall.Anarchy 0.1 | 4 | 4% | 14 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.4 | 118 / 210 | 3.30 | 17.2% | 31082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.2% | 118 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 24 |
| germ.TheMind .2 | 4.8 | 9.7% | 3 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.1% | 3 |
| awesomeness.Elite 1.0 | 5.7 | 9.2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 3 |
| sample.Crazy 1.0 | 8.3 | 6.6% | 0 |
| stelo.UntouchableNano 1.3 | 8.5 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 66.3 | 19 / 35 | 4876 |
| 2 | 1 | 65.5 | 72.4 | 19 / 35 | 5130 |
| 3 | 1 | 68.8 | 82.9 | 21 / 35 | 5733 |
| 4 | 1 | 67.6 | 81.0 | 23 / 35 | 5171 |
| 5 | 1 | 64.5 | 70.5 | 16 / 35 | 5072 |
| 6 | 1 | 65.9 | 73.7 | 20 / 35 | 5100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 94% |
| germ.TheMind .2 | 9 | 100% |
| sample.Crazy 1.0 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 47% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 12% | 35 |
| stelo.UntouchableNano 1.3 | 10 | 11% | 15 |
| awesomeness.Elite 1.0 | 8 | 9% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6 | 7% | 11 |
| germ.TheMind .2 | 4 | 4% | 13 |
| sample.Crazy 1.0 | 4 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 3 | 3% | 6 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.8 | 156 / 210 | 2.01 | 20.1% | 31297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.1% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.3% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 11.1% | 9 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 4 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.9% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.7% | 1 |
| spinnercat.Omen 1.0 | 7.3 | 8.4% | 3 |
| ratosh.Wesco 1.4 | 7.8 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 7.6% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.2 | 27 / 35 | 5190 |
| 2 | 1 | 71.0 | 90.2 | 29 / 35 | 5280 |
| 3 | 1 | 70.2 | 90.5 | 23 / 35 | 5378 |
| 4 | 1 | 69.8 | 87.6 | 25 / 35 | 5525 |
| 5 | 1 | 71.7 | 91.1 | 29 / 35 | 5345 |
| 6 | 1 | 68.5 | 84.1 | 23 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 91% |
| nz.jdc.nano.GridFu 1.0 | 28 | 96% |
| timmit.nano.TimDog 0.33 | 17 | 88% |
| maribo.IotaCT 1.1 | 16 | 100% |
| stelo.PatternRobot 1.0 | 15 | 73% |
| spinnercat.Omen 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 89% |
| ratosh.Wesco 1.4 | 5 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 28% | 65 |
| stelo.PatternRobot 1.0 | 11 | 20% | 21 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 42 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 11% | 11 |
| timmit.nano.TimDog 0.33 | 5 | 9% | 27 |
| maribo.IotaCT 1.1 | 4 | 7% | 19 |
| ratosh.Wesco 1.4 | 4 | 7% | 14 |
| spinnercat.Omen 1.0 | 2 | 4% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.6 | 177 / 210 | 1.67 | 21.8% | 39947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.8% | 177 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 10 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 5.7 | 8.5% | 4 |
| sanja.First 0.1 | 6.3 | 8.3% | 4 |
| zyx.micro.Ant 1.1 | 6.5 | 8.0% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.1% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.0% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.3 | 25 / 35 | 6182 |
| 2 | 1 | 71.1 | 88.9 | 29 / 35 | 6398 |
| 3 | 1 | 73.3 | 96.2 | 32 / 35 | 7294 |
| 4 | 1 | 71.0 | 91.1 | 30 / 35 | 6098 |
| 5 | 1 | 72.7 | 93.3 | 32 / 35 | 7017 |
| 6 | 1 | 71.9 | 91.7 | 29 / 35 | 6958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 38 | 95% |
| cvt.Firsty 1.0 | 32 | 97% |
| tvv.nano.Polaris 1.2 | 28 | 93% |
| sanja.First 0.1 | 27 | 96% |
| Grystrion.TrackerWO 1.0 | 22 | 95% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| zyx.micro.Ant 1.1 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |

Hadur died in 34 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 8 | 24% | 42 |
| Grystrion.TrackerWO 1.0 | 6 | 18% | 23 |
| tvv.nano.Polaris 1.2 | 5 | 15% | 48 |
| zyx.micro.Ant 1.1 | 5 | 15% | 26 |
| squidM.TentalceMeleeNano 1.1 | 3 | 9% | 9 |
| sanja.First 0.1 | 2 | 6% | 24 |
| cvt.Firsty 1.0 | 2 | 6% | 23 |
| sample.RamFire 1.0 | 2 | 6% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.5 | 96 / 210 | 3.39 | 16.7% | 33323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 16.7% | 96 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 60 |
| cs.Wren 1.0 | 3.3 | 12.4% | 17 |
| js.PinBall 1.6 | 4.0 | 11.4% | 16 |
| mz.Cork 0.1 | 4.7 | 11.1% | 8 |
| joe.ADinosaur 1.0 | 6.2 | 8.9% | 2 |
| evd.X1 0.01 | 6.8 | 7.9% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 65.7 | 12 / 35 | 4999 |
| 2 | 1 | 67.0 | 78.1 | 17 / 35 | 5709 |
| 3 | 1 | 65.6 | 71.1 | 16 / 35 | 6133 |
| 4 | 1 | 65.5 | 72.7 | 19 / 35 | 5462 |
| 5 | 1 | 66.0 | 77.8 | 14 / 35 | 5559 |
| 6 | 1 | 65.8 | 75.6 | 18 / 35 | 5461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 75% |
| cs.Wren 1.0 | 27 | 78% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 5 | 80% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 3 | 33% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 41% | 101 |
| cs.Wren 1.0 | 22 | 19% | 39 |
| PSW.Relentless 0.1 | 12 | 11% | 11 |
| joe.ADinosaur 1.0 | 11 | 10% | 14 |
| evd.X1 0.01 | 10 | 9% | 12 |
| js.PinBall 1.6 | 8 | 7% | 14 |
| mz.Cork 0.1 | 3 | 3% | 12 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.3 | 137 / 210 | 2.32 | 19.2% | 30147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.2% | 137 |
| ntc.Opposite 1.5 | 2.7 | 11.4% | 12 |
| myl.nano.Graviton 1.10 | 3.3 | 11.3% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.5% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 7 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 3 |
| disan.Chair 2.2.0 | 7.8 | 8.1% | 8 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.9 | 24 / 35 | 5200 |
| 2 | 1 | 67.3 | 80.0 | 23 / 35 | 4784 |
| 3 | 1 | 68.3 | 88.3 | 23 / 35 | 4736 |
| 4 | 1 | 68.6 | 84.8 | 21 / 35 | 5167 |
| 5 | 1 | 69.9 | 88.3 | 25 / 35 | 5201 |
| 6 | 1 | 67.8 | 81.9 | 21 / 35 | 5059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 85% |
| myl.nano.Graviton 1.10 | 33 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 89% |
| DBall.NUKE 0.1 | 17 | 94% |
| ntc.Opposite 1.5 | 17 | 82% |
| donjezza.Muncho 1.0 | 12 | 100% |
| disan.Chair 2.2.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 50% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 26% | 42 |
| ntc.Opposite 1.5 | 14 | 19% | 30 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 14% | 22 |
| myl.nano.Graviton 1.10 | 9 | 12% | 33 |
| DBall.NUKE 0.1 | 4 | 5% | 20 |
| disan.Chair 2.2.0 | 3 | 4% | 17 |
| donjezza.Muncho 1.0 | 2 | 3% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.0 | 82 / 210 | 3.25 | 16.3% | 26917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.3 | 16.3% | 82 |
| oog.melee.Capulet 1.2 | 2.7 | 13.5% | 48 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 30 |
| yagami.Tidus 0.11 | 4.8 | 11.9% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 72.4 | 14 / 35 | 4165 |
| 2 | 1 | 66.2 | 77.1 | 15 / 35 | 4784 |
| 3 | 3 | 61.8 | 65.1 | 9 / 35 | 4022 |
| 4 | 1 | 68.3 | 86.3 | 19 / 35 | 4623 |
| 5 | 1 | 63.6 | 69.8 | 12 / 35 | 4440 |
| 6 | 1 | 66.5 | 79.4 | 13 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 55% |
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 69% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 41% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 44 |
| yagami.Tidus 0.11 | 16 | 13% | 25 |
| ejb.Polaris 1.0.1 | 14 | 11% | 22 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 28 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.3 | 126 / 210 | 2.87 | 17.8% | 29437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.8% | 126 |
| wee.Gem 1.8.4 | 3.0 | 11.9% | 27 |
| wompi.Quokka 1.6 | 3.3 | 11.8% | 19 |
| bzdp.Pansy 2.1 | 3.7 | 11.8% | 15 |
| ratosh.Nobo 0.21 | 4.7 | 10.7% | 8 |
| m3thos.Eva00 1.1 | 5.7 | 9.6% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.0 | 20 / 35 | 5136 |
| 2 | 1 | 68.2 | 85.4 | 22 / 35 | 4987 |
| 3 | 1 | 67.6 | 83.2 | 24 / 35 | 4979 |
| 4 | 1 | 65.9 | 76.5 | 20 / 35 | 4746 |
| 5 | 1 | 67.4 | 81.0 | 21 / 35 | 4999 |
| 6 | 1 | 65.7 | 76.5 | 19 / 35 | 4590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 93% |
| wee.Gem 1.8.4 | 37 | 100% |
| wompi.Quokka 1.6 | 19 | 89% |
| m3thos.Eva00 1.1 | 13 | 85% |
| ratosh.Nobo 0.21 | 10 | 80% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |

Hadur died in 84 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 15% | 42 |
| ratosh.Nobo 0.21 | 12 | 14% | 29 |
| wompi.Quokka 1.6 | 12 | 14% | 26 |
| wee.Gem 1.8.4 | 11 | 13% | 56 |
| stelo.MyAgileRobot 0.2 | 10 | 12% | 13 |
| maribo.FollowFire 1 | 9 | 11% | 11 |
| bayen.UbaMicro 1.4 | 7 | 8% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 9 |
| m3thos.Eva00 1.1 | 4 | 5% | 11 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.2 | 123 / 210 | 2.15 | 21.0% | 45615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.0% | 123 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 59 |
| mz.NanoGod 2.02 | 3.0 | 15.0% | 17 |
| ayk.WallHugger 1.0 | 4.5 | 9.9% | 1 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.9% | 7 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.3 | 20 / 35 | 7576 |
| 2 | 1 | 72.1 | 88.9 | 20 / 35 | 7325 |
| 3 | 1 | 71.7 | 85.7 | 20 / 35 | 7478 |
| 4 | 1 | 72.3 | 87.0 | 21 / 35 | 7621 |
| 5 | 1 | 72.8 | 87.6 | 21 / 35 | 7656 |
| 6 | 1 | 72.4 | 85.7 | 21 / 35 | 7959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 80% |
| mz.NanoGod 2.02 | 27 | 74% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 9 | 89% |
| ayk.WallHugger 1.0 | 7 | 86% |
| stuff.Vlad 0.1 | 1 | 0% |
| stelo.PianistNano 1.2 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 40% | 120 |
| mz.NanoGod 2.02 | 27 | 31% | 49 |
| exauge.GateKeeper 1.1.121g | 11 | 13% | 15 |
| ayk.WallHugger 1.0 | 9 | 10% | 12 |
| drd.Dreadknoght 0.9 | 2 | 2% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.4 | 107 / 210 | 3.21 | 17.0% | 28879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.0% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 29 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 26 |
| bvh.micro.Freya 0.3 | 4.2 | 10.7% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 9.8% | 12 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 1 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 10 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.3 | 17 / 35 | 5067 |
| 2 | 1 | 67.7 | 81.3 | 22 / 35 | 5125 |
| 3 | 1 | 64.8 | 74.9 | 17 / 35 | 4528 |
| 4 | 1 | 66.1 | 78.7 | 20 / 35 | 4877 |
| 5 | 1 | 61.3 | 64.1 | 14 / 35 | 4183 |
| 6 | 1 | 66.4 | 79.4 | 17 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 77% |
| dummy.micro.Sparrow 2.5 | 29 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 95% |
| bvh.micro.Freya 0.3 | 15 | 67% |
| ap.Frederick 1.1 | 9 | 100% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 26% | 61 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 36 |
| bvh.micro.Freya 0.3 | 13 | 13% | 21 |
| conscience.Electron 1.3g | 13 | 13% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 9% | 33 |
| dl.BetterWalls 1.0 | 9 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 11 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 82.9 | 141 / 210 | 2.54 | 20.4% | 40936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.4% | 141 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 24 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 12 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.7% | 12 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.1% | 5 |
| dsw.StaticD 1.0 | 5.5 | 8.9% | 9 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.8% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 1 |
| sample.Corners 1.0 | 9.5 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 83.2 | 24 / 35 | 6675 |
| 2 | 1 | 71.3 | 83.5 | 25 / 35 | 7265 |
| 3 | 1 | 69.1 | 80.3 | 19 / 35 | 6304 |
| 4 | 1 | 73.3 | 92.1 | 28 / 35 | 7749 |
| 5 | 1 | 68.6 | 77.5 | 22 / 35 | 6198 |
| 6 | 1 | 69.9 | 81.0 | 23 / 35 | 6745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 42 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 93% |
| supersample.SuperBoxBot 1.0 | 28 | 86% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| dsw.StaticD 1.0 | 10 | 50% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 30% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 28% | 61 |
| dsw.StaticD 1.0 | 11 | 16% | 17 |
| mme.NikeEnhanced 2.0 | 9 | 13% | 17 |
| sul.Lunar 1.1 | 3 | 4% | 54 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
| sample.Corners 1.0 | 2 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.8 | 103 / 210 | 2.73 | 18.5% | 36983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.5% | 103 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.8 | 12.6% | 33 |
| mld.Wisdom 1.0 | 4.0 | 11.6% | 20 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.7% | 10 |
| amz.NanoClone 1.41 | 5.5 | 10.0% | 10 |
| sample.Walls 1.0 | 7.8 | 7.0% | 8 |
| jangs.ns51 1.0 | 8.0 | 6.4% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.2 | 22 / 35 | 6460 |
| 2 | 1 | 68.0 | 79.7 | 17 / 35 | 6154 |
| 3 | 1 | 68.1 | 80.0 | 16 / 35 | 6269 |
| 4 | 1 | 67.3 | 76.5 | 16 / 35 | 6226 |
| 5 | 1 | 68.0 | 84.4 | 15 / 35 | 6132 |
| 6 | 1 | 67.2 | 81.9 | 17 / 35 | 5742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 73% |
| radnor.DoctorBob 1.42 | 38 | 79% |
| KiraNL.Chupacabra 0.4 | 13 | 85% |
| mld.Wisdom 1.0 | 11 | 64% |
| amz.NanoClone 1.41 | 11 | 64% |
| jangs.ns51 1.0 | 6 | 67% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 24% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 20% | 52 |
| radnor.DoctorBob 1.42 | 20 | 18% | 52 |
| KiraNL.Chupacabra 0.4 | 19 | 17% | 32 |
| amz.NanoClone 1.41 | 9 | 8% | 13 |
| jangs.ns51 1.0 | 7 | 6% | 9 |
| sample.Walls 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 3 | 3% | 8 |

