# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 81.3 | 126 / 210 | 2.69 | 19.5% | 40782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 19.5% | 126 |
| radnor.DoctorBob 1.42 | 2.5 | 15.1% | 30 |
| mld.Infinity 2.2 | 3.2 | 13.8% | 28 |
| mz.AntiGrav 1.0 | 3.3 | 13.5% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.9% | 6 |
| sample.Walls 1.0 | 6.2 | 7.9% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 3.8% | 0 |
| sample.Target 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 76.2 | 20 / 35 | 6536 |
| 2 | 1 | 69.3 | 78.4 | 20 / 35 | 6563 |
| 3 | 1 | 72.0 | 87.0 | 24 / 35 | 7179 |
| 4 | 1 | 68.9 | 78.7 | 15 / 35 | 6681 |
| 5 | 1 | 70.9 | 84.8 | 23 / 35 | 6904 |
| 6 | 1 | 70.5 | 82.5 | 24 / 35 | 6919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 52 | 94% |
| mld.Infinity 2.2 | 40 | 93% |
| radnor.DoctorBob 1.42 | 30 | 83% |
| amz.NanoClone 1.41 | 12 | 83% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 44% | 68 |
| mld.Infinity 2.2 | 15 | 17% | 47 |
| mz.AntiGrav 1.0 | 12 | 14% | 54 |
| amz.NanoClone 1.41 | 11 | 13% | 19 |
| sample.Walls 1.0 | 4 | 5% | 9 |
| GarmBox.Oranges 1.0 | 4 | 5% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.3 | 117 / 210 | 2.50 | 18.2% | 33447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 18.2% | 117 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.8% | 40 |
| mld.DustBunny 3.8 | 2.7 | 13.2% | 25 |
| maribo.melee.BMV 0.1 | 4.7 | 10.9% | 6 |
| zyx.nano.Ant 1.1 | 5.2 | 9.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.7% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.2% | 11 |
| bzdp.BoxCar 2.0 | 7.8 | 7.7% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.6 | 20 / 35 | 5346 |
| 2 | 1 | 66.0 | 80.3 | 17 / 35 | 5201 |
| 3 | 1 | 68.5 | 86.7 | 19 / 35 | 5972 |
| 4 | 1 | 69.9 | 92.4 | 25 / 35 | 5802 |
| 5 | 1 | 66.7 | 78.1 | 17 / 35 | 5500 |
| 6 | 1 | 67.2 | 80.6 | 19 / 35 | 5626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 55 | 78% |
| oog.melee.Mercutio 1.0 | 46 | 85% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 9 | 78% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 22 | 24% | 67 |
| oog.melee.Mercutio 1.0 | 21 | 23% | 63 |
| maribo.melee.BMV 0.1 | 20 | 22% | 27 |
| zyx.nano.Ant 1.1 | 9 | 10% | 11 |
| djdjdj.NanoSkunk10 1.0 | 8 | 9% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 12 |
| bzdp.BoxCar 2.0 | 5 | 5% | 8 |
| fullsail.SweetTea 1.1 | 2 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.6 | 129 / 210 | 2.66 | 19.4% | 37746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 19.4% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 31 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.2% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.1% | 24 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.5% | 4 |
| fm.mammillarias 1.3 | 5.8 | 8.7% | 0 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 2 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.3% | 6 |
| sample.Fire 1.0 | 9.5 | 4.5% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 77.8 | 17 / 35 | 6377 |
| 2 | 1 | 71.0 | 87.3 | 26 / 35 | 6662 |
| 3 | 1 | 67.9 | 77.8 | 21 / 35 | 5879 |
| 4 | 1 | 69.3 | 78.4 | 23 / 35 | 6389 |
| 5 | 1 | 69.1 | 82.9 | 18 / 35 | 6166 |
| 6 | 1 | 70.1 | 85.4 | 24 / 35 | 6273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 39 | 87% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| myl.nano.KomoriNinja 1.1 | 14 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 80% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 19 | 23% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 22% | 44 |
| myl.nano.KomoriNinja 1.1 | 15 | 19% | 37 |
| fm.mammillarias 1.3 | 12 | 15% | 16 |
| cb.nano.Insomnia 1.0 | 8 | 10% | 15 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 17 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 11 |
| sample.Fire 1.0 | 0 | 0% | 3 |
| sample.Tracker 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 85.5 | 145 / 210 | 2.30 | 20.4% | 40751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 20.4% | 145 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.3% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 17 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.7% | 22 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 1 |
| yk.JahMicro 1.0 | 7.0 | 8.0% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.1% | 5 |
| repositorio.NanoStep 1.0 | 9.2 | 5.9% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.2 | 28 / 35 | 6532 |
| 2 | 1 | 68.1 | 78.1 | 18 / 35 | 6579 |
| 3 | 1 | 71.7 | 91.1 | 29 / 35 | 6847 |
| 4 | 1 | 73.0 | 91.4 | 30 / 35 | 7520 |
| 5 | 1 | 70.7 | 87.3 | 22 / 35 | 6998 |
| 6 | 1 | 66.9 | 74.9 | 18 / 35 | 6275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 93% |
| stelo.SoJNanoMelee 1.1 | 44 | 91% |
| tj.zombie1n 1.0.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| tvv.micro.Antares 1.1.1 | 9 | 78% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 37% | 84 |
| tvv.micro.Antares 1.1.1 | 15 | 23% | 36 |
| stelo.SoJNanoMelee 1.1 | 11 | 17% | 34 |
| tj.zombie1n 1.0.1 | 5 | 8% | 9 |
| yk.JahMicro 1.0 | 4 | 6% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 21 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.9 | 95 / 210 | 3.53 | 16.0% | 29648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 16.0% | 95 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 32 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 15 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 28 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 16 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.3% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.0 | 21 / 35 | 5535 |
| 2 | 1 | 61.2 | 66.0 | 14 / 35 | 4531 |
| 3 | 1 | 62.2 | 67.6 | 17 / 35 | 4476 |
| 4 | 1 | 63.2 | 71.1 | 13 / 35 | 4859 |
| 5 | 1 | 63.7 | 72.7 | 14 / 35 | 4925 |
| 6 | 1 | 64.9 | 74.0 | 16 / 35 | 5322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 69% |
| simonton.nano.MeleeSeed 1.8 | 29 | 93% |
| ahf.NanoAndrew .4 | 19 | 95% |
| sam.Samspin 1.0 | 12 | 92% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 23% | 48 |
| ahf.NanoAndrew .4 | 22 | 19% | 41 |
| oog.melee.Corsair 1.0 | 20 | 17% | 43 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 23 |
| robar.nano.Assertive_Melee 0.2 | 10 | 9% | 14 |
| EBBU.Sim2 1.02 | 9 | 8% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 8 |
| sam.Samspin 1.0 | 7 | 6% | 14 |
| sample.TrackFire 1.0 | 1 | 1% | 4 |

## Melee bench: F06

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.7 | 112 / 210 | 2.91 | 17.8% | 32663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 17.8% | 112 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 46 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.4% | 5 |
| fm.claire 1.7 | 6.2 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.6% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 7 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.5 | 20 / 35 | 5381 |
| 2 | 1 | 66.9 | 80.3 | 17 / 35 | 5350 |
| 3 | 1 | 66.5 | 78.1 | 19 / 35 | 5451 |
| 4 | 1 | 68.4 | 84.8 | 19 / 35 | 5792 |
| 5 | 1 | 66.9 | 78.1 | 20 / 35 | 5651 |
| 6 | 1 | 64.7 | 73.7 | 17 / 35 | 5038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 79% |
| oog.melee.CapuletDroid 1.1 | 35 | 94% |
| gh.nano.Grofvuil 0.2 | 12 | 67% |
| arthord.NanoSatanMelee Beta | 10 | 90% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 26% | 66 |
| gh.nano.Grofvuil 0.2 | 19 | 19% | 32 |
| arthord.NanoSatanMelee Beta | 13 | 13% | 18 |
| oog.melee.CapuletDroid 1.1 | 12 | 12% | 43 |
| fm.claire 1.7 | 11 | 11% | 13 |
| kurios.DOSexe .9b | 10 | 10% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 14 |
| sample.SpinBot 1.0 | 2 | 2% | 5 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.5 | 101 / 210 | 2.85 | 18.0% | 36012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 18.0% | 101 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.1% | 39 |
| mz.MicroGodMelee 1 | 3.3 | 13.6% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.3% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 2 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 1 |
| acogdev.alpha 0.2 | 7.2 | 6.5% | 1 |
| el.JumpShoot 0.2 | 8.7 | 5.7% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.7 | 18 / 35 | 5902 |
| 2 | 1 | 68.2 | 84.1 | 18 / 35 | 5819 |
| 3 | 1 | 68.8 | 81.9 | 19 / 35 | 6294 |
| 4 | 1 | 67.1 | 76.8 | 13 / 35 | 6290 |
| 5 | 1 | 67.9 | 81.9 | 18 / 35 | 6174 |
| 6 | 1 | 65.3 | 72.4 | 15 / 35 | 5533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 90% |
| mz.MicroGodMelee 1 | 38 | 58% |
| gh.micro.Gruweltje 0.7 | 25 | 64% |
| DBall.Anarchy 0.1 | 13 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 44 | 40% | 73 |
| gh.micro.Gruweltje 0.7 | 28 | 26% | 47 |
| spinnercat.micro.Tyger 0.1 | 24 | 22% | 59 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 7 |
| acogdev.alpha 0.2 | 3 | 3% | 4 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 12 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 69.5 | 100 / 210 | 3.75 | 16.2% | 33054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.2 | 17.3% | 60 |
| hadur117.micro.SaorWCD 0.1 | 1.8 | 16.2% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.4% | 27 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.1% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 8.7% | 2 |
| awesomeness.Elite 1.0 | 5.8 | 8.4% | 5 |
| germ.TheMind .2 | 6.3 | 8.1% | 5 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.4% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 72.1 | 19 / 35 | 5577 |
| 2 | 2 | 63.3 | 65.4 | 14 / 35 | 5675 |
| 3 | 2 | 65.2 | 73.7 | 15 / 35 | 5383 |
| 4 | 2 | 64.1 | 70.8 | 17 / 35 | 4986 |
| 5 | 2 | 61.5 | 56.8 | 14 / 35 | 5335 |
| 6 | 1 | 68.1 | 78.1 | 21 / 35 | 6098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 80% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |
| germ.TheMind .2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 54% | 124 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 21% | 40 |
| awesomeness.Elite 1.0 | 7 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 11 |
| germ.TheMind .2 | 6 | 5% | 8 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.2 | 142 / 210 | 2.33 | 19.3% | 30868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 19.3% | 142 |
| rz.HawkOnFire 0.1 | 2.3 | 13.6% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.3% | 14 |
| maribo.IotaCT 1.1 | 3.8 | 11.0% | 10 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.3 | 8.5% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 1 |
| stelo.PatternRobot 1.0 | 8.0 | 7.5% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.7 | 26 / 35 | 4769 |
| 2 | 1 | 70.2 | 87.3 | 25 / 35 | 5380 |
| 3 | 1 | 67.4 | 77.5 | 19 / 35 | 5006 |
| 4 | 1 | 71.2 | 91.4 | 26 / 35 | 5243 |
| 5 | 1 | 69.2 | 83.2 | 21 / 35 | 5175 |
| 6 | 1 | 69.8 | 86.3 | 25 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 88% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| maribo.IotaCT 1.1 | 15 | 87% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| ratosh.Wesco 1.4 | 12 | 100% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 16 | 24% | 30 |
| rz.HawkOnFire 0.1 | 15 | 22% | 53 |
| nz.jdc.nano.GridFu 1.0 | 10 | 15% | 50 |
| stelo.PatternRobot 1.0 | 10 | 15% | 19 |
| ratosh.Wesco 1.4 | 8 | 12% | 22 |
| maribo.IotaCT 1.1 | 5 | 7% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 8 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |

## Melee bench: F10

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.1 | 171 / 210 | 1.62 | 22.0% | 42367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 22.0% | 171 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.9% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 11 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 2 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 8 |
| sanja.First 0.1 | 5.8 | 8.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.8% | 0 |
| cvt.Firsty 1.0 | 7.3 | 7.4% | 5 |
| amk.Punbot.Punbot 0.01 | 9.0 | 6.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 94.9 | 30 / 35 | 7294 |
| 2 | 1 | 71.2 | 89.2 | 27 / 35 | 6980 |
| 3 | 1 | 71.4 | 89.8 | 26 / 35 | 7043 |
| 4 | 1 | 72.2 | 92.7 | 30 / 35 | 6978 |
| 5 | 1 | 72.5 | 94.3 | 27 / 35 | 7188 |
| 6 | 1 | 72.7 | 97.8 | 31 / 35 | 6884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 92% |
| baal.nano.N 1.42 | 39 | 90% |
| cvt.Firsty 1.0 | 27 | 85% |
| sanja.First 0.1 | 25 | 100% |
| zyx.micro.Ant 1.1 | 18 | 89% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 28% | 64 |
| baal.nano.N 1.42 | 7 | 18% | 48 |
| zyx.micro.Ant 1.1 | 6 | 15% | 28 |
| cvt.Firsty 1.0 | 6 | 15% | 25 |
| sanja.First 0.1 | 4 | 10% | 26 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 5 |
| sample.RamFire 1.0 | 2 | 5% | 2 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 63.5 | 75 / 210 | 4.29 | 14.4% | 29642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.6% | 87 |
| hadur117.micro.SaorWCD 0.1 | 2.0 | 14.4% | 75 |
| cs.Wren 1.0 | 2.7 | 13.3% | 19 |
| js.PinBall 1.6 | 4.3 | 10.8% | 10 |
| mz.Cork 0.1 | 4.8 | 10.7% | 11 |
| joe.ADinosaur 1.0 | 5.8 | 9.3% | 1 |
| evd.X1 0.01 | 7.0 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 2 |
| PSW.Relentless 0.1 | 9.5 | 5.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 68.9 | 17 / 35 | 5149 |
| 2 | 3 | 58.2 | 56.8 | 7 / 35 | 4705 |
| 3 | 2 | 62.9 | 68.3 | 13 / 35 | 5346 |
| 4 | 2 | 60.1 | 59.7 | 10 / 35 | 4833 |
| 5 | 3 | 56.9 | 53.0 | 10 / 35 | 4091 |
| 6 | 1 | 66.0 | 74.3 | 18 / 35 | 5518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 71% |
| cs.Wren 1.0 | 34 | 82% |
| mz.Cork 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| js.PinBall 1.6 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 40% | 89 |
| cs.Wren 1.0 | 23 | 17% | 44 |
| joe.ADinosaur 1.0 | 23 | 17% | 26 |
| js.PinBall 1.6 | 11 | 8% | 16 |
| mz.Cork 0.1 | 10 | 7% | 16 |
| PSW.Relentless 0.1 | 7 | 5% | 9 |
| evd.X1 0.01 | 7 | 5% | 9 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.8 | 109 / 210 | 3.54 | 16.7% | 29697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 16.7% | 109 |
| ntc.Opposite 1.5 | 3.0 | 11.6% | 14 |
| myl.nano.Graviton 1.10 | 3.3 | 11.4% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.4% | 14 |
| disan.Chair 2.2.0 | 6.2 | 9.5% | 15 |
| DBall.NUKE 0.1 | 7.8 | 8.1% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.6% | 10 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.4 | 19 / 35 | 5278 |
| 2 | 1 | 67.5 | 79.7 | 22 / 35 | 5187 |
| 3 | 1 | 64.6 | 70.5 | 18 / 35 | 5089 |
| 4 | 1 | 63.6 | 67.9 | 18 / 35 | 4850 |
| 5 | 1 | 58.5 | 55.9 | 13 / 35 | 4296 |
| 6 | 1 | 66.5 | 78.4 | 19 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 27 | 89% |
| myl.nano.Graviton 1.10 | 22 | 95% |
| ntc.Opposite 1.5 | 21 | 90% |
| donjezza.Muncho 1.0 | 14 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 85% |
| disan.Chair 2.2.0 | 12 | 83% |
| DBall.NUKE 0.1 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 34 | 34% | 42 |
| ntc.Opposite 1.5 | 17 | 17% | 31 |
| stelo.AreaTargetingBot 1.1 | 14 | 14% | 36 |
| disan.Chair 2.2.0 | 11 | 11% | 18 |
| myl.nano.Graviton 1.10 | 9 | 9% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 5% | 18 |
| DBall.NUKE 0.1 | 5 | 5% | 17 |
| donjezza.Muncho 1.0 | 4 | 4% | 10 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 66.5 | 66 / 210 | 4.02 | 14.6% | 27075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.7 | 14.6% | 66 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 43 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 55 |
| yagami.Tidus 0.11 | 4.2 | 12.1% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 12.3% | 16 |
| ejb.Polaris 1.0.1 | 5.5 | 10.6% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.5% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 62.5 | 9 / 35 | 4305 |
| 2 | 1 | 64.9 | 71.4 | 9 / 35 | 5106 |
| 3 | 1 | 63.1 | 69.8 | 13 / 35 | 4445 |
| 4 | 3 | 59.7 | 55.9 | 11 / 35 | 4196 |
| 5 | 1 | 64.1 | 71.1 | 13 / 35 | 4768 |
| 6 | 1 | 62.3 | 67.9 | 11 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| kawigi.micro.Shiz 1.1 | 14 | 100% |
| yagami.Tidus 0.11 | 11 | 91% |
| ejb.Polaris 1.0.1 | 10 | 80% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 38% | 72 |
| ejb.Polaris 1.0.1 | 19 | 13% | 32 |
| kawigi.micro.Shiz 1.1 | 16 | 11% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 31 |
| yagami.Tidus 0.11 | 14 | 10% | 21 |
| step.nanoPri 1.0 | 12 | 8% | 12 |
| stelo.MirrorNano 1.3 | 11 | 8% | 13 |
| kurios.DOSexe .9a | 4 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.1 | 121 / 210 | 3.33 | 16.6% | 28271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 16.6% | 121 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 19 |
| wee.Gem 1.8.4 | 3.2 | 12.2% | 30 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 13 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 7.3 | 8.6% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.2% | 4 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.6 | 23 / 35 | 4758 |
| 2 | 1 | 64.6 | 71.7 | 21 / 35 | 4731 |
| 3 | 1 | 63.5 | 70.8 | 17 / 35 | 4609 |
| 4 | 1 | 62.6 | 68.6 | 18 / 35 | 4364 |
| 5 | 1 | 66.5 | 75.2 | 21 / 35 | 5430 |
| 6 | 1 | 64.9 | 76.8 | 21 / 35 | 4379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 98% |
| wee.Gem 1.8.4 | 30 | 97% |
| ratosh.Nobo 0.21 | 17 | 76% |
| wompi.Quokka 1.6 | 16 | 94% |
| m3thos.Eva00 1.1 | 10 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 352. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 13 | 14% | 26 |
| wompi.Quokka 1.6 | 13 | 14% | 25 |
| wee.Gem 1.8.4 | 12 | 13% | 46 |
| maribo.FollowFire 1 | 12 | 13% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 13% | 12 |
| m3thos.Eva00 1.1 | 10 | 11% | 21 |
| bayen.UbaMicro 1.4 | 9 | 10% | 15 |
| bzdp.Pansy 2.1 | 6 | 7% | 44 |
| stelo.MyAgileRobot 0.2 | 4 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 77.1 | 95 / 210 | 3.06 | 18.8% | 43976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 18.2% | 80 |
| hadur117.micro.SaorWCD 0.1 | 1.5 | 18.8% | 95 |
| mz.NanoGod 2.02 | 3.0 | 15.2% | 21 |
| ayk.WallHugger 1.0 | 4.3 | 10.3% | 3 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.5% | 6 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 6.9% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.5 | 3.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 71.7 | 13 / 35 | 7055 |
| 2 | 2 | 67.1 | 71.7 | 12 / 35 | 6752 |
| 3 | 2 | 66.8 | 69.2 | 13 / 35 | 6609 |
| 4 | 1 | 70.8 | 81.3 | 19 / 35 | 7692 |
| 5 | 1 | 71.8 | 84.1 | 18 / 35 | 7873 |
| 6 | 1 | 71.8 | 84.4 | 20 / 35 | 7995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 83 | 78% |
| mz.NanoGod 2.02 | 13 | 77% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| ayk.WallHugger 1.0 | 7 | 71% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 49 | 42% | 64 |
| wompi.Wallaby 5.1 | 43 | 37% | 113 |
| ayk.WallHugger 1.0 | 12 | 10% | 14 |
| exauge.GateKeeper 1.1.121g | 7 | 6% | 9 |
| stuff.Vlad 0.1 | 4 | 3% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.9 | 98 / 210 | 3.80 | 15.8% | 29593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 15.8% | 98 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.3% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.5 | 11.7% | 25 |
| dummy.micro.Sparrow 2.5 | 4.5 | 10.8% | 16 |
| bvh.micro.Freya 0.3 | 4.5 | 10.9% | 7 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 15 |
| conscience.Electron 1.3g | 6.5 | 8.6% | 4 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 16 |
| dl.BetterWalls 1.0 | 9.0 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 70.5 | 17 / 35 | 4591 |
| 2 | 1 | 65.8 | 75.9 | 18 / 35 | 5027 |
| 3 | 1 | 62.1 | 62.2 | 14 / 35 | 5078 |
| 4 | 1 | 65.0 | 72.1 | 19 / 35 | 5351 |
| 5 | 1 | 61.3 | 64.1 | 13 / 35 | 4766 |
| 6 | 1 | 63.5 | 68.9 | 17 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 88% |
| dummy.micro.Sparrow 2.5 | 17 | 100% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| dl.BetterWalls 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 18 | 16% | 19 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 52 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 14% | 38 |
| conscience.Electron 1.3g | 15 | 13% | 17 |
| bvh.micro.Freya 0.3 | 14 | 13% | 23 |
| dl.BetterWalls 1.0 | 9 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.4 | 142 / 210 | 2.31 | 20.9% | 43873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 20.9% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 14 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 8 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 5 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 9 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.3% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 2 |
| sample.Corners 1.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 89.2 | 23 / 35 | 7789 |
| 2 | 1 | 71.0 | 85.4 | 27 / 35 | 6758 |
| 3 | 1 | 70.4 | 83.2 | 21 / 35 | 7154 |
| 4 | 1 | 69.8 | 81.3 | 21 / 35 | 7012 |
| 5 | 1 | 70.8 | 83.8 | 24 / 35 | 7136 |
| 6 | 1 | 72.4 | 89.5 | 26 / 35 | 8024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 48 | 94% |
| sul.Lunar 1.1 | 47 | 98% |
| supersample.SuperBoxBot 1.0 | 22 | 86% |
| dsw.StaticD 1.0 | 12 | 58% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 29% | 68 |
| supersample.SuperBoxBot 1.0 | 19 | 28% | 33 |
| dsw.StaticD 1.0 | 19 | 28% | 30 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 10 |
| sul.Lunar 1.1 | 3 | 4% | 44 |
| sample.Corners 1.0 | 1 | 1% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.0 | 92 / 210 | 3.88 | 15.9% | 34639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 15.9% | 92 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 36 |
| mld.Wisdom 1.0 | 3.3 | 12.0% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 23 |
| amz.NanoClone 1.41 | 4.7 | 10.8% | 17 |
| KiraNL.Chupacabra 0.4 | 5.8 | 10.0% | 5 |
| sample.Walls 1.0 | 6.8 | 8.7% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.2 | 17 / 35 | 6203 |
| 2 | 1 | 61.6 | 63.2 | 15 / 35 | 5211 |
| 3 | 1 | 63.1 | 64.8 | 13 / 35 | 6071 |
| 4 | 1 | 63.4 | 64.1 | 16 / 35 | 5893 |
| 5 | 1 | 62.7 | 66.0 | 13 / 35 | 5523 |
| 6 | 1 | 65.6 | 73.7 | 18 / 35 | 5738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 83% |
| radnor.DoctorBob 1.42 | 25 | 84% |
| sample.Walls 1.0 | 10 | 100% |
| amz.NanoClone 1.41 | 9 | 78% |
| mld.Wisdom 1.0 | 7 | 71% |
| jangs.ns51 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 39 | 33% | 46 |
| radnor.DoctorBob 1.42 | 28 | 24% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 14% | 56 |
| KiraNL.Chupacabra 0.4 | 14 | 12% | 23 |
| amz.NanoClone 1.41 | 10 | 8% | 14 |
| GarmBox.Oranges 1.0 | 4 | 3% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| sample.Walls 1.0 | 3 | 3% | 7 |

