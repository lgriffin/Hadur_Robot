# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 74.0 | 71 / 210 | 3.34 | 16.9% | 36724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.2 | 17.5% | 88 |
| hadur117.micro.SaorMP 0.1 | 1.8 | 16.9% | 71 |
| mld.Infinity 2.2 | 3.0 | 14.3% | 24 |
| mz.AntiGrav 1.0 | 4.0 | 13.5% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 4 |
| sample.Walls 1.0 | 6.3 | 7.6% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 1 |
| jangs.ns51 1.0 | 8.0 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 77.1 | 12 / 35 | 6583 |
| 2 | 1 | 68.0 | 75.9 | 15 / 35 | 6278 |
| 3 | 2 | 65.6 | 72.4 | 8 / 35 | 5960 |
| 4 | 2 | 66.1 | 71.1 | 11 / 35 | 5988 |
| 5 | 2 | 66.8 | 76.2 | 11 / 35 | 5968 |
| 6 | 2 | 66.2 | 71.1 | 14 / 35 | 5947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 20% |
| mld.Infinity 2.2 | 34 | 88% |
| mz.AntiGrav 1.0 | 21 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 83 | 59% | 102 |
| mz.AntiGrav 1.0 | 17 | 12% | 44 |
| mld.Infinity 2.2 | 14 | 10% | 19 |
| amz.NanoClone 1.41 | 14 | 10% | 19 |
| GarmBox.Oranges 1.0 | 7 | 5% | 11 |
| sample.Walls 1.0 | 3 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 1% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 55.3 | 45 / 210 | 5.02 | 12.8% | 27853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.0 | 16.6% | 109 |
| mld.DustBunny 3.8 | 2.2 | 14.4% | 28 |
| hadur117.micro.SaorMP 0.1 | 3.2 | 12.8% | 45 |
| maribo.melee.BMV 0.1 | 3.8 | 10.9% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.5% | 9 |
| zyx.nano.Ant 1.1 | 5.8 | 9.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.1% | 5 |
| fullsail.SweetTea 1.1 | 7.7 | 7.6% | 5 |
| bzdp.BoxCar 2.0 | 8.7 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 66.0 | 8 / 35 | 4756 |
| 2 | 3 | 61.5 | 64.4 | 9 / 35 | 5079 |
| 3 | 2 | 61.0 | 66.0 | 9 / 35 | 4524 |
| 4 | 4 | 51.0 | 36.5 | 5 / 35 | 4006 |
| 5 | 3 | 59.8 | 61.0 | 10 / 35 | 4714 |
| 6 | 4 | 53.9 | 38.1 | 4 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 52% |
| mld.DustBunny 3.8 | 22 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| maribo.melee.BMV 0.1 | 4 | 50% |
| djdjdj.NanoSkunk10 1.0 | 4 | 50% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 28% | 63 |
| maribo.melee.BMV 0.1 | 30 | 18% | 32 |
| mld.DustBunny 3.8 | 27 | 16% | 42 |
| cs.Grudge 1.0 | 16 | 10% | 16 |
| zyx.nano.Ant 1.1 | 14 | 8% | 14 |
| bzdp.BoxCar 2.0 | 10 | 6% | 10 |
| fullsail.SweetTea 1.1 | 8 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 7 | 4% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 4% | 11 |

## Melee bench: F03

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.2 | 127 / 210 | 2.60 | 19.3% | 36610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.0 | 19.3% | 127 |
| myl.micro.Troodon 1.10 | 2.2 | 14.1% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 12.0% | 18 |
| cb.nano.Insomnia 1.0 | 4.0 | 11.1% | 12 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 11.6% | 3 |
| fm.mammillarias 1.3 | 6.0 | 9.1% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 7 |
| sample.Fire 1.0 | 9.3 | 4.6% | 7 |
| sample.Tracker 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 24 / 35 | 6133 |
| 2 | 1 | 69.3 | 80.6 | 20 / 35 | 6404 |
| 3 | 1 | 69.2 | 82.2 | 23 / 35 | 5917 |
| 4 | 1 | 68.5 | 80.6 | 18 / 35 | 5816 |
| 5 | 1 | 70.2 | 84.4 | 22 / 35 | 6552 |
| 6 | 1 | 68.3 | 78.7 | 20 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 49 | 88% |
| cb.nano.Insomnia 1.0 | 35 | 86% |
| myl.micro.Troodon 1.10 | 26 | 96% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 15 | 80% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.Fire 1.0 | 2 | 50% |

Hadur died in 85 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 25% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 20% | 33 |
| cb.nano.Insomnia 1.0 | 16 | 19% | 26 |
| fm.mammillarias 1.3 | 11 | 13% | 17 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 42 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 17 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 10 |
| sample.Tracker 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 78.8 | 117 / 210 | 2.90 | 18.3% | 36040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.0 | 18.3% | 117 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.5% | 24 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 10.4% | 19 |
| tj.zombie1n 1.0.1 | 5.8 | 9.5% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 9.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.3% | 14 |
| yk.JahMicro 1.0 | 7.2 | 8.5% | 6 |
| repositorio.NanoStep 1.0 | 9.3 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 79.4 | 21 / 35 | 6508 |
| 2 | 1 | 68.1 | 79.7 | 21 / 35 | 5883 |
| 3 | 1 | 69.4 | 86.3 | 24 / 35 | 6004 |
| 4 | 1 | 66.5 | 75.9 | 18 / 35 | 5866 |
| 5 | 1 | 66.6 | 74.6 | 17 / 35 | 5913 |
| 6 | 1 | 66.4 | 77.1 | 16 / 35 | 5866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 88% |
| stelo.SoJNanoMelee 1.1 | 40 | 95% |
| tj.zombie1n 1.0.1 | 11 | 73% |
| tvv.micro.Antares 1.1.1 | 10 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 75% |
| yk.JahMicro 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 27% | 82 |
| tvv.micro.Antares 1.1.1 | 16 | 17% | 33 |
| ers.nano.hawk.HawkLA 3.0m | 16 | 17% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 11 | 12% | 14 |
| yk.JahMicro 1.0 | 10 | 11% | 17 |
| tj.zombie1n 1.0.1 | 10 | 11% | 15 |
| stelo.SoJNanoMelee 1.1 | 4 | 4% | 21 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 65.8 | 39 / 210 | 4.08 | 14.2% | 28288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.5 | 14.2% | 39 |
| oog.melee.Corsair 1.0 | 2.0 | 13.7% | 62 |
| ahf.NanoAndrew .4 | 2.7 | 13.2% | 57 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.8% | 27 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 5 |
| sam.Samspin 1.0 | 6.5 | 9.5% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.3% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.3 | 62.5 | 7 / 35 | 4416 |
| 2 | 3 | 58.5 | 58.1 | 5 / 35 | 4532 |
| 3 | 1 | 64.2 | 73.0 | 7 / 35 | 5599 |
| 4 | 1 | 60.5 | 67.6 | 5 / 35 | 4492 |
| 5 | 2 | 60.9 | 66.3 | 7 / 35 | 4734 |
| 6 | 1 | 61.6 | 67.3 | 8 / 35 | 4515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 8% |
| ahf.NanoAndrew .4 | 21 | 10% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| sam.Samspin 1.0 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| EBBU.Sim2 1.02 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 55 | 32% | 62 |
| oog.melee.Corsair 1.0 | 51 | 30% | 57 |
| EBBU.Sim2 1.02 | 15 | 9% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 10 | 6% | 10 |
| simonton.nano.MeleeSeed 1.8 | 8 | 5% | 21 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 9 |
| sam.Samspin 1.0 | 7 | 4% | 11 |
| sample.TrackFire 1.0 | 2 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 68.7 | 72 / 210 | 3.82 | 14.9% | 27746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.9% | 58 |
| hadur117.micro.SaorMP 0.1 | 1.8 | 14.9% | 72 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.3% | 26 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 11.4% | 31 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.4% | 4 |
| fm.claire 1.7 | 6.0 | 9.0% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.6% | 11 |
| sample.SpinBot 1.0 | 8.3 | 7.0% | 4 |
| kurios.DOSexe .9b | 9.2 | 5.9% | 3 |
| pa.Improved 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 67.6 | 13 / 35 | 4473 |
| 2 | 2 | 59.4 | 60.6 | 12 / 35 | 4323 |
| 3 | 2 | 63.5 | 72.7 | 13 / 35 | 4821 |
| 4 | 1 | 64.2 | 74.6 | 13 / 35 | 4936 |
| 5 | 2 | 61.2 | 65.1 | 12 / 35 | 4463 |
| 6 | 2 | 62.8 | 71.4 | 9 / 35 | 4730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 84% |
| oog.melee.CapuletDroid 1.1 | 31 | 58% |
| gh.nano.Grofvuil 0.2 | 10 | 60% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 0% |
| kurios.DOSexe .9b | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 23% | 53 |
| gh.nano.Grofvuil 0.2 | 30 | 22% | 40 |
| oog.melee.CapuletDroid 1.1 | 21 | 15% | 43 |
| fm.claire 1.7 | 18 | 13% | 20 |
| winamp32.micro.MicroMacro 1.0 | 16 | 12% | 19 |
| kurios.DOSexe .9b | 9 | 6% | 15 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 12 |
| pa.Improved 1.0 | 3 | 2% | 5 |
| sample.SpinBot 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.3 | 51 / 210 | 3.67 | 15.2% | 30661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.7 | 16.1% | 65 |
| mz.MicroGodMelee 1 | 2.2 | 15.2% | 52 |
| hadur117.micro.SaorMP 0.1 | 2.7 | 15.2% | 51 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 14.1% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 8.4% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.5% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.2% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 2 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 4 |
| fire219.CatBot 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 65.1 | 7 / 35 | 5001 |
| 2 | 4 | 62.2 | 67.3 | 10 / 35 | 4596 |
| 3 | 2 | 63.7 | 70.5 | 8 / 35 | 5335 |
| 4 | 2 | 63.8 | 73.0 | 10 / 35 | 4884 |
| 5 | 2 | 64.2 | 72.7 | 8 / 35 | 5315 |
| 6 | 3 | 64.8 | 73.3 | 8 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 32 | 31% |
| spinnercat.micro.Tyger 0.1 | 30 | 97% |
| gh.micro.Gruweltje 0.7 | 17 | 0% |
| DBall.Anarchy 0.1 | 8 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 66 | 41% | 70 |
| mz.MicroGodMelee 1 | 50 | 31% | 66 |
| spinnercat.micro.Tyger 0.1 | 27 | 17% | 46 |
| mbro.Detektor3 0.1.1 | 5 | 3% | 5 |
| fire219.CatBot 1.0 | 4 | 2% | 5 |
| acogdev.alpha 0.2 | 3 | 2% | 4 |
| DBall.Anarchy 0.1 | 2 | 1% | 8 |
| caimano.Furia_Ceca 0.22 | 2 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.4 | 102 / 210 | 3.12 | 16.8% | 29225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.5 | 16.8% | 102 |
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.5% | 58 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.5% | 23 |
| germ.TheMind .2 | 4.8 | 9.5% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.2% | 3 |
| awesomeness.Elite 1.0 | 5.3 | 9.1% | 12 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 7.8% | 1 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.3% | 4 |
| sample.Crazy 1.0 | 8.8 | 5.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 72.4 | 16 / 35 | 4602 |
| 2 | 2 | 61.4 | 63.5 | 10 / 35 | 4679 |
| 3 | 2 | 65.5 | 75.6 | 17 / 35 | 4845 |
| 4 | 1 | 67.5 | 81.3 | 20 / 35 | 5043 |
| 5 | 2 | 65.3 | 76.2 | 15 / 35 | 4691 |
| 6 | 1 | 69.7 | 89.5 | 24 / 35 | 5365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 95% |
| germ.TheMind .2 | 8 | 100% |
| awesomeness.Elite 1.0 | 5 | 0% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 23 | 21% | 79 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 21% | 41 |
| awesomeness.Elite 1.0 | 23 | 21% | 26 |
| qualidafial.MajorDick 1.0.1 | 11 | 10% | 16 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 15 |
| lrem.micro.MoggFanatic 0.2 | 9 | 8% | 14 |
| germ.TheMind .2 | 7 | 6% | 13 |
| sample.Crazy 1.0 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.2 | 74 / 210 | 3.95 | 15.2% | 28662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.2 | 15.2% | 74 |
| rz.HawkOnFire 0.1 | 2.5 | 13.5% | 28 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.6% | 35 |
| maribo.IotaCT 1.1 | 4.3 | 11.3% | 27 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.6% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.8% | 4 |
| ratosh.Wesco 1.4 | 7.5 | 8.6% | 6 |
| spinnercat.Omen 1.0 | 8.2 | 8.2% | 6 |
| stelo.PatternRobot 1.0 | 8.2 | 8.0% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 67.3 | 12 / 35 | 4870 |
| 2 | 1 | 66.0 | 73.7 | 13 / 35 | 5249 |
| 3 | 1 | 64.9 | 73.0 | 13 / 35 | 4743 |
| 4 | 1 | 63.3 | 67.0 | 15 / 35 | 4570 |
| 5 | 1 | 62.3 | 65.7 | 12 / 35 | 4569 |
| 6 | 2 | 59.3 | 56.5 | 9 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 33 | 94% |
| nz.jdc.nano.GridFu 1.0 | 31 | 84% |
| timmit.nano.TimDog 0.33 | 8 | 13% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |
| maribo.IotaCT 1.1 | 5 | 20% |
| spinnercat.Omen 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 32 | 24% | 36 |
| maribo.IotaCT 1.1 | 31 | 23% | 39 |
| rz.HawkOnFire 0.1 | 21 | 15% | 38 |
| nz.jdc.nano.GridFu 1.0 | 13 | 10% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 10% | 24 |
| ratosh.Wesco 1.4 | 11 | 8% | 17 |
| spinnercat.Omen 1.0 | 10 | 7% | 14 |
| stelo.PatternRobot 1.0 | 5 | 4% | 8 |

## Melee bench: F10

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.7 | 113 / 210 | 2.83 | 18.7% | 38864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.0 | 18.7% | 113 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.4% | 44 |
| baal.nano.N 1.42 | 3.0 | 11.9% | 19 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.4% | 6 |
| zyx.micro.Ant 1.1 | 5.5 | 8.7% | 8 |
| sanja.First 0.1 | 6.8 | 8.1% | 9 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.7% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 9 |
| sample.RamFire 1.0 | 9.3 | 6.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.7 | 14 / 35 | 5875 |
| 2 | 1 | 70.1 | 87.0 | 23 / 35 | 6651 |
| 3 | 1 | 67.0 | 75.2 | 18 / 35 | 6232 |
| 4 | 1 | 68.2 | 83.5 | 18 / 35 | 6489 |
| 5 | 1 | 67.7 | 77.5 | 17 / 35 | 6621 |
| 6 | 1 | 69.5 | 83.2 | 23 / 35 | 6996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 61% |
| baal.nano.N 1.42 | 26 | 73% |
| cvt.Firsty 1.0 | 22 | 86% |
| amk.Punbot.Punbot 0.01 | 19 | 95% |
| sanja.First 0.1 | 11 | 100% |
| zyx.micro.Ant 1.1 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 28 | 29% | 63 |
| Grystrion.TrackerWO 1.0 | 19 | 19% | 29 |
| baal.nano.N 1.42 | 18 | 18% | 40 |
| squidM.TentalceMeleeNano 1.1 | 11 | 11% | 19 |
| amk.Punbot.Punbot 0.01 | 11 | 11% | 16 |
| sample.RamFire 1.0 | 4 | 4% | 5 |
| zyx.micro.Ant 1.1 | 3 | 3% | 10 |
| cvt.Firsty 1.0 | 2 | 2% | 14 |
| sanja.First 0.1 | 2 | 2% | 12 |

## Melee bench: F11

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 60.7 | 27 / 210 | 4.53 | 12.9% | 26610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.3% | 135 |
| cs.Wren 1.0 | 2.3 | 13.1% | 16 |
| hadur117.micro.SaorMP 0.1 | 3.0 | 12.9% | 27 |
| js.PinBall 1.6 | 4.0 | 12.1% | 15 |
| mz.Cork 0.1 | 4.7 | 11.0% | 8 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 2 |
| evd.X1 0.01 | 7.5 | 6.7% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 8.7 | 5.4% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 62.5 | 3 / 35 | 4430 |
| 2 | 5 | 56.1 | 53.3 | 2 / 35 | 4314 |
| 3 | 2 | 61.3 | 67.3 | 7 / 35 | 4671 |
| 4 | 3 | 60.0 | 63.2 | 6 / 35 | 4503 |
| 5 | 3 | 57.9 | 56.5 | 5 / 35 | 4415 |
| 6 | 3 | 58.7 | 61.6 | 4 / 35 | 4277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 42 | 21% |
| cs.Wren 1.0 | 11 | 100% |
| js.PinBall 1.6 | 4 | 25% |
| mz.Cork 0.1 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 65 | 36% | 76 |
| js.PinBall 1.6 | 32 | 17% | 33 |
| joe.ADinosaur 1.0 | 31 | 17% | 33 |
| mz.Cork 0.1 | 25 | 14% | 26 |
| cs.Wren 1.0 | 16 | 9% | 27 |
| PSW.Relentless 0.1 | 6 | 3% | 6 |
| evd.X1 0.01 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 0 |

## Melee bench: F12

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.4 | 93 / 210 | 3.94 | 15.3% | 26199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.0 | 15.3% | 93 |
| myl.nano.Graviton 1.10 | 3.2 | 11.9% | 30 |
| ntc.Opposite 1.5 | 3.5 | 11.6% | 12 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 12.0% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 10.2% | 16 |
| disan.Chair 2.2.0 | 6.7 | 9.2% | 16 |
| DBall.NUKE 0.1 | 8.0 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 12 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.9 | 18 / 35 | 4518 |
| 2 | 1 | 63.3 | 69.8 | 18 / 35 | 4213 |
| 3 | 1 | 65.5 | 76.8 | 18 / 35 | 4503 |
| 4 | 1 | 60.9 | 62.2 | 14 / 35 | 4197 |
| 5 | 1 | 63.2 | 67.3 | 13 / 35 | 4704 |
| 6 | 1 | 59.4 | 60.0 | 12 / 35 | 4064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 33 | 91% |
| myl.nano.Graviton 1.10 | 19 | 100% |
| ntc.Opposite 1.5 | 15 | 87% |
| DBall.NUKE 0.1 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 10 | 20% |
| disan.Chair 2.2.0 | 9 | 89% |
| donjezza.Muncho 1.0 | 5 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 41 | 35% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 23 | 20% | 36 |
| myl.nano.Graviton 1.10 | 15 | 13% | 39 |
| ntc.Opposite 1.5 | 11 | 9% | 19 |
| disan.Chair 2.2.0 | 10 | 9% | 19 |
| stelo.AreaTargetingBot 1.1 | 9 | 8% | 28 |
| DBall.NUKE 0.1 | 5 | 4% | 13 |
| donjezza.Muncho 1.0 | 2 | 2% | 4 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 51.5 | 21 / 210 | 5.36 | 11.2% | 23368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.0 | 16.0% | 84 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.3% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.4% | 26 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 16 |
| hadur117.micro.SaorMP 0.1 | 5.2 | 11.2% | 21 |
| ejb.Polaris 1.0.1 | 5.3 | 11.0% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.7 | 51.7 | 5 / 35 | 4111 |
| 2 | 6 | 55.3 | 49.2 | 3 / 35 | 3788 |
| 3 | 6 | 56.3 | 51.4 | 5 / 35 | 4060 |
| 4 | 4 | 55.1 | 53.3 | 3 / 35 | 3695 |
| 5 | 4 | 58.1 | 56.5 | 3 / 35 | 4122 |
| 6 | 6 | 54.1 | 47.0 | 2 / 35 | 3592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 11 | 45% |
| kawigi.micro.Shiz 1.1 | 11 | 82% |
| yagami.Tidus 0.11 | 5 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 67% |
| ejb.Polaris 1.0.1 | 3 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 20% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 19% | 37 |
| yagami.Tidus 0.11 | 30 | 16% | 32 |
| ejb.Polaris 1.0.1 | 28 | 15% | 31 |
| stelo.MirrorNano 1.3 | 24 | 13% | 23 |
| kawigi.micro.Shiz 1.1 | 20 | 11% | 26 |
| step.nanoPri 1.0 | 11 | 6% | 13 |
| kurios.DOSexe .9a | 3 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 66.9 | 79 / 210 | 3.98 | 14.5% | 25352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.5 | 14.5% | 79 |
| wee.Gem 1.8.4 | 2.5 | 12.5% | 36 |
| wompi.Quokka 1.6 | 3.3 | 12.3% | 25 |
| ratosh.Nobo 0.21 | 3.7 | 12.1% | 14 |
| bzdp.Pansy 2.1 | 4.0 | 12.2% | 30 |
| m3thos.Eva00 1.1 | 6.3 | 9.9% | 12 |
| bayen.UbaMicro 1.4 | 6.7 | 9.4% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 3 |
| maribo.FollowFire 1 | 9.5 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.2 | 21 / 35 | 4475 |
| 2 | 1 | 60.3 | 65.7 | 13 / 35 | 3817 |
| 3 | 3 | 58.7 | 58.4 | 9 / 35 | 4209 |
| 4 | 1 | 63.1 | 71.4 | 16 / 35 | 4239 |
| 5 | 1 | 61.2 | 64.1 | 12 / 35 | 4546 |
| 6 | 2 | 57.8 | 58.7 | 8 / 35 | 4066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 34 | 91% |
| bzdp.Pansy 2.1 | 24 | 79% |
| ratosh.Nobo 0.21 | 13 | 100% |
| wompi.Quokka 1.6 | 10 | 70% |
| m3thos.Eva00 1.1 | 4 | 50% |
| stelo.MyAgileRobot 0.2 | 4 | 75% |
| bayen.UbaMicro 1.4 | 3 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 25 | 19% | 35 |
| ratosh.Nobo 0.21 | 19 | 14% | 30 |
| wee.Gem 1.8.4 | 17 | 13% | 42 |
| bayen.UbaMicro 1.4 | 17 | 13% | 20 |
| bzdp.Pansy 2.1 | 14 | 11% | 34 |
| m3thos.Eva00 1.1 | 13 | 10% | 14 |
| maribo.FollowFire 1 | 12 | 9% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 8% | 15 |
| stelo.MyAgileRobot 0.2 | 6 | 5% | 10 |

## Melee bench: F15

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 62.8 | 7 / 210 | 4.35 | 14.3% | 36078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.6% | 167 |
| mz.NanoGod 2.02 | 2.0 | 15.8% | 26 |
| hadur117.micro.SaorMP 0.1 | 3.0 | 14.3% | 7 |
| ayk.WallHugger 1.0 | 4.2 | 11.0% | 4 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 1 |
| stuff.Vlad 0.1 | 6.2 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 63.5 | 1 / 35 | 6068 |
| 2 | 3 | 61.5 | 57.5 | 1 / 35 | 5582 |
| 3 | 3 | 61.6 | 58.1 | 0 / 35 | 6155 |
| 4 | 3 | 64.4 | 67.6 | 0 / 35 | 6199 |
| 5 | 3 | 63.8 | 64.1 | 4 / 35 | 5862 |
| 6 | 3 | 64.3 | 66.0 | 1 / 35 | 6212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 59 | 0% |
| mz.NanoGod 2.02 | 4 | 25% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 110 | 54% | 110 |
| mz.NanoGod 2.02 | 50 | 25% | 52 |
| ayk.WallHugger 1.0 | 18 | 9% | 18 |
| exauge.GateKeeper 1.1.121g | 10 | 5% | 11 |
| stuff.Vlad 0.1 | 7 | 3% | 10 |
| stelo.PianistNano 1.2 | 6 | 3% | 7 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 65.4 | 82 / 210 | 4.11 | 14.6% | 27039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.3 | 14.6% | 82 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 34 |
| dummy.micro.Sparrow 2.5 | 2.5 | 12.7% | 27 |
| bvh.micro.Freya 0.3 | 4.5 | 10.9% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 13 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 12 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 2 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.4% | 1 |
| ap.Frederick 1.1 | 9.5 | 6.2% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 61.3 | 11 / 35 | 4346 |
| 2 | 1 | 63.2 | 71.4 | 13 / 35 | 4915 |
| 3 | 2 | 60.2 | 62.2 | 12 / 35 | 4285 |
| 4 | 1 | 61.1 | 64.4 | 14 / 35 | 4573 |
| 5 | 1 | 59.0 | 58.7 | 14 / 35 | 4161 |
| 6 | 1 | 64.5 | 74.6 | 18 / 35 | 4759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 100% |
| dummy.micro.Sparrow 2.5 | 14 | 93% |
| bvh.micro.Freya 0.3 | 12 | 75% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 18% | 47 |
| bvh.micro.Freya 0.3 | 20 | 16% | 32 |
| dummy.micro.Sparrow 2.5 | 18 | 14% | 30 |
| conscience.Electron 1.3g | 17 | 13% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 13% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 10% | 32 |
| stelo.MirrorMicro 1.0 | 13 | 10% | 19 |
| dl.BetterWalls 1.0 | 8 | 6% | 12 |

## Melee bench: F17

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.9 | 140 / 210 | 2.36 | 20.3% | 40138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.0 | 20.3% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.2% | 19 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 16 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.0% | 12 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.1% | 2 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 15 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.3% | 2 |
| sample.Corners 1.0 | 9.2 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 84.4 | 24 / 35 | 6692 |
| 2 | 1 | 71.9 | 91.1 | 25 / 35 | 6720 |
| 3 | 1 | 68.2 | 80.3 | 21 / 35 | 5850 |
| 4 | 1 | 71.7 | 85.7 | 23 / 35 | 7395 |
| 5 | 1 | 71.5 | 88.3 | 23 / 35 | 7150 |
| 6 | 1 | 68.7 | 79.4 | 24 / 35 | 6331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 60 | 95% |
| sul.Lunar 1.1 | 43 | 86% |
| supersample.SuperBoxBot 1.0 | 20 | 100% |
| dsw.StaticD 1.0 | 12 | 33% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |

Hadur died in 72 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 25 | 35% | 37 |
| supersample.SuperBoxBot 1.0 | 17 | 24% | 26 |
| sul.Lunar 1.1 | 11 | 15% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 14% | 63 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 8 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 7 |
| sample.Corners 1.0 | 2 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorMP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.9 | 79 / 210 | 3.08 | 16.8% | 33671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorMP 0.1 | 1.0 | 16.8% | 79 |
| radnor.DoctorBob 1.42 | 2.2 | 14.7% | 60 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.7% | 22 |
| mld.Wisdom 1.0 | 4.5 | 11.8% | 20 |
| amz.NanoClone 1.41 | 4.7 | 10.6% | 14 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.8% | 5 |
| sample.Walls 1.0 | 7.0 | 7.9% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.0 | 14 / 35 | 5967 |
| 2 | 1 | 65.3 | 76.8 | 14 / 35 | 5455 |
| 3 | 1 | 67.2 | 80.3 | 18 / 35 | 5697 |
| 4 | 1 | 65.7 | 78.4 | 11 / 35 | 5648 |
| 5 | 1 | 65.9 | 77.8 | 12 / 35 | 5762 |
| 6 | 1 | 62.9 | 68.9 | 10 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 18% |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 94% |
| amz.NanoClone 1.41 | 12 | 92% |
| sample.Walls 1.0 | 9 | 100% |
| mld.Wisdom 1.0 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 67 | 51% | 78 |
| mld.Wisdom 1.0 | 24 | 18% | 38 |
| amz.NanoClone 1.41 | 12 | 9% | 17 |
| KiraNL.Chupacabra 0.4 | 11 | 8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 7% | 39 |
| sample.Walls 1.0 | 4 | 3% | 10 |
| GarmBox.Oranges 1.0 | 4 | 3% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 3 |

