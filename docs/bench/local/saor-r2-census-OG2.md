# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.2 | 72 / 210 | 3.41 | 15.8% | 27176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.8 | 15.8% | 72 |
| mld.Infinity 2.2 | 2.7 | 15.2% | 57 |
| radnor.DoctorBob 1.42 | 2.7 | 15.3% | 41 |
| mz.AntiGrav 1.0 | 2.8 | 15.2% | 33 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 1 |
| sample.Walls 1.0 | 6.3 | 8.1% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.3% | 3 |
| GarmBox.Oranges 1.0 | 7.3 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 0 |
| sample.Target 1.0 | 9.5 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.7 | 16 / 35 | 4714 |
| 2 | 1 | 65.8 | 76.5 | 10 / 35 | 4716 |
| 3 | 1 | 65.3 | 74.6 | 10 / 35 | 4736 |
| 4 | 4 | 61.5 | 62.5 | 11 / 35 | 4084 |
| 5 | 2 | 66.3 | 76.8 | 14 / 35 | 4487 |
| 6 | 2 | 63.7 | 70.2 | 11 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 41 | 88% |
| mld.Infinity 2.2 | 34 | 44% |
| radnor.DoctorBob 1.42 | 33 | 52% |
| amz.NanoClone 1.41 | 4 | 75% |
| sample.Walls 1.0 | 2 | 50% |

Hadur died in 138 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 36% | 69 |
| mld.Infinity 2.2 | 39 | 28% | 34 |
| mz.AntiGrav 1.0 | 19 | 14% | 59 |
| amz.NanoClone 1.41 | 11 | 8% | 11 |
| sample.Walls 1.0 | 8 | 6% | 16 |
| jangs.ns51 1.0 | 5 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 3% | 4 |
| arthord.MannyPacquiao Beta | 2 | 1% | 4 |

## Melee bench: F02

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 78.1 | 105 / 210 | 2.97 | 15.9% | 22095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 15.9% | 105 |
| oog.melee.Mercutio 1.0 | 1.7 | 15.6% | 70 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 9 |
| djdjdj.NanoSkunk10 1.0 | 4.5 | 10.2% | 14 |
| maribo.melee.BMV 0.1 | 4.7 | 10.4% | 3 |
| zyx.nano.Ant 1.1 | 7.2 | 7.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.8% | 8 |
| bzdp.BoxCar 2.0 | 7.5 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 81.9 | 12 / 35 | 3160 |
| 2 | 1 | 65.3 | 82.2 | 22 / 35 | 3624 |
| 3 | 1 | 66.3 | 88.3 | 22 / 35 | 3445 |
| 4 | 1 | 67.4 | 88.9 | 23 / 35 | 3922 |
| 5 | 1 | 63.4 | 77.1 | 16 / 35 | 3586 |
| 6 | 3 | 58.2 | 50.5 | 10 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 64% |
| mld.DustBunny 3.8 | 42 | 98% |
| djdjdj.NanoSkunk10 1.0 | 18 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 33% | 77 |
| mld.DustBunny 3.8 | 19 | 17% | 60 |
| djdjdj.NanoSkunk10 1.0 | 19 | 17% | 32 |
| zyx.nano.Ant 1.1 | 10 | 9% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 8% | 13 |
| fullsail.SweetTea 1.1 | 5 | 5% | 8 |
| maribo.melee.BMV 0.1 | 5 | 5% | 6 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 70.5 | 82 / 210 | 3.65 | 15.0% | 22846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.2 | 16.4% | 68 |
| hadur117.micro.SaorOG2 0.1 | 1.8 | 15.0% | 82 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 13.2% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 12.0% | 25 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.4% | 13 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.6% | 4 |
| sample.Fire 1.0 | 8.7 | 5.8% | 5 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 64.4 | 10 / 35 | 3046 |
| 2 | 2 | 61.8 | 66.7 | 12 / 35 | 3866 |
| 3 | 2 | 66.0 | 81.0 | 17 / 35 | 4108 |
| 4 | 2 | 61.0 | 61.3 | 10 / 35 | 4337 |
| 5 | 2 | 63.6 | 76.5 | 17 / 35 | 3480 |
| 6 | 1 | 64.2 | 73.3 | 16 / 35 | 4009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 69% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 64% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| sample.Fire 1.0 | 5 | 60% |
| fm.mammillarias 1.3 | 4 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 38 | 30% | 71 |
| stelo.SoRobotNanoMelee 1.2 | 28 | 22% | 36 |
| myl.nano.KomoriNinja 1.1 | 16 | 13% | 44 |
| cb.nano.Insomnia 1.0 | 15 | 12% | 10 |
| fm.mammillarias 1.3 | 12 | 9% | 15 |
| cs.sheldor.Talon 1.1 | 7 | 5% | 9 |
| sample.Tracker 1.0 | 5 | 4% | 6 |
| sample.Fire 1.0 | 4 | 3% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 2% | 9 |

## Melee bench: F04

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 74.1 | 82 / 210 | 3.33 | 16.0% | 26874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 16.0% | 82 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.6% | 29 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.5% | 27 |
| tj.zombie1n 1.0.1 | 4.5 | 10.5% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 10.1% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 9.4% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.3% | 7 |
| yk.JahMicro 1.0 | 7.2 | 8.4% | 8 |
| repositorio.NanoStep 1.0 | 9.3 | 5.7% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 66.0 | 9 / 35 | 4304 |
| 2 | 1 | 68.0 | 83.5 | 18 / 35 | 5282 |
| 3 | 1 | 64.5 | 75.2 | 17 / 35 | 4285 |
| 4 | 1 | 64.7 | 76.5 | 13 / 35 | 4671 |
| 5 | 1 | 62.1 | 72.1 | 10 / 35 | 3957 |
| 6 | 1 | 63.1 | 71.1 | 15 / 35 | 4375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 42 | 79% |
| stelo.SoJNanoMelee 1.1 | 26 | 38% |
| tj.zombie1n 1.0.1 | 16 | 69% |
| tvv.micro.Antares 1.1.1 | 12 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 100% |
| sample.VelociRobot 1.0 | 6 | 83% |
| yk.JahMicro 1.0 | 5 | 60% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 32% | 83 |
| stelo.SoJNanoMelee 1.1 | 33 | 26% | 39 |
| tvv.micro.Antares 1.1.1 | 16 | 13% | 25 |
| tj.zombie1n 1.0.1 | 12 | 9% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 8% | 12 |
| sample.VelociRobot 1.0 | 6 | 5% | 11 |
| repositorio.NanoStep 1.0 | 4 | 3% | 11 |
| yk.JahMicro 1.0 | 4 | 3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 9 |

## Melee bench: F05

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 57.9 | 59 / 210 | 4.79 | 12.6% | 20464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 1.2 | 13.8% | 42 |
| hadur117.micro.SaorOG2 0.1 | 2.3 | 12.6% | 59 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 39 |
| zyx.nano.BacillusComma 1.0 | 4.3 | 10.4% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 25 |
| sam.Samspin 1.0 | 6.7 | 9.7% | 15 |
| EBBU.Sim2 1.02 | 6.7 | 9.4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.2% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 69.5 | 14 / 35 | 3459 |
| 2 | 3 | 54.6 | 51.4 | 8 / 35 | 3369 |
| 3 | 3 | 55.7 | 56.8 | 5 / 35 | 3136 |
| 4 | 2 | 58.2 | 61.0 | 13 / 35 | 3342 |
| 5 | 3 | 56.6 | 54.3 | 8 / 35 | 3690 |
| 6 | 2 | 56.6 | 54.3 | 11 / 35 | 3468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 86% |
| simonton.nano.MeleeSeed 1.8 | 19 | 68% |
| ahf.NanoAndrew .4 | 14 | 64% |
| sam.Samspin 1.0 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 0% |
| EBBU.Sim2 1.02 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.nano.BacillusComma 1.0 | 32 | 21% | 33 |
| simonton.nano.MeleeSeed 1.8 | 29 | 19% | 40 |
| oog.melee.Corsair 1.0 | 17 | 11% | 39 |
| robar.nano.Assertive_Melee 0.2 | 17 | 11% | 21 |
| ahf.NanoAndrew .4 | 14 | 9% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 9% | 17 |
| EBBU.Sim2 1.02 | 13 | 8% | 14 |
| sam.Samspin 1.0 | 12 | 8% | 16 |
| sample.TrackFire 1.0 | 6 | 4% | 8 |

## Melee bench: F06

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.6 | 94 / 210 | 2.93 | 16.2% | 23544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 16.2% | 94 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.3% | 42 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.5% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.1% | 21 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.0% | 8 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 12 |
| sample.SpinBot 1.0 | 6.8 | 8.2% | 10 |
| fm.claire 1.7 | 7.2 | 8.0% | 0 |
| pa.Improved 1.0 | 9.0 | 6.4% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.4 | 15 / 35 | 4588 |
| 2 | 1 | 67.0 | 87.6 | 23 / 35 | 3797 |
| 3 | 1 | 63.0 | 76.2 | 13 / 35 | 3807 |
| 4 | 1 | 64.3 | 79.4 | 13 / 35 | 4122 |
| 5 | 2 | 61.6 | 70.2 | 13 / 35 | 3636 |
| 6 | 1 | 64.3 | 78.7 | 17 / 35 | 3594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 74% |
| oog.melee.CapuletDroid 1.1 | 25 | 76% |
| gh.nano.Grofvuil 0.2 | 17 | 65% |
| arthord.NanoSatanMelee Beta | 13 | 85% |
| sample.SpinBot 1.0 | 4 | 50% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 28% | 83 |
| gh.nano.Grofvuil 0.2 | 29 | 25% | 44 |
| arthord.NanoSatanMelee Beta | 16 | 14% | 23 |
| sample.SpinBot 1.0 | 16 | 14% | 21 |
| oog.melee.CapuletDroid 1.1 | 12 | 10% | 12 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 11 |
| pa.Improved 1.0 | 4 | 3% | 7 |
| fm.claire 1.7 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.1 | 58 / 210 | 3.69 | 14.3% | 23225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.3 | 15.9% | 57 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 14.9% | 45 |
| hadur117.micro.SaorOG2 0.1 | 2.8 | 14.3% | 58 |
| mz.MicroGodMelee 1 | 3.7 | 13.9% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 9.4% | 13 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 5 |
| acogdev.alpha 0.2 | 7.3 | 6.8% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 63.5 | 8 / 35 | 3468 |
| 2 | 1 | 64.4 | 77.5 | 12 / 35 | 4300 |
| 3 | 3 | 61.3 | 68.6 | 9 / 35 | 4109 |
| 4 | 4 | 59.7 | 69.5 | 8 / 35 | 3158 |
| 5 | 3 | 62.6 | 69.8 | 11 / 35 | 3999 |
| 6 | 2 | 62.7 | 71.7 | 10 / 35 | 4191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 34 | 53% |
| gh.micro.Gruweltje 0.7 | 29 | 48% |
| mz.MicroGodMelee 1 | 20 | 80% |
| DBall.Anarchy 0.1 | 11 | 64% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 2 | 0% |

Hadur died in 152 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 40 | 26% | 58 |
| spinnercat.micro.Tyger 0.1 | 35 | 23% | 52 |
| mz.MicroGodMelee 1 | 29 | 19% | 46 |
| acogdev.alpha 0.2 | 15 | 10% | 16 |
| DBall.Anarchy 0.1 | 11 | 7% | 13 |
| caimano.Furia_Ceca 0.22 | 10 | 7% | 11 |
| el.JumpShoot 0.2 | 5 | 3% | 6 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 60.8 | 65 / 210 | 4.52 | 13.5% | 24697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 15.6% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1.8 | 14.9% | 47 |
| hadur117.micro.SaorOG2 0.1 | 2.8 | 13.5% | 65 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 9 |
| germ.TheMind .2 | 4.8 | 9.7% | 12 |
| awesomeness.Elite 1.0 | 6.3 | 8.9% | 9 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.7 | 7.8% | 3 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 66.7 | 14 / 35 | 4387 |
| 2 | 3 | 59.2 | 58.1 | 9 / 35 | 4326 |
| 3 | 3 | 59.2 | 61.6 | 11 / 35 | 3769 |
| 4 | 3 | 58.2 | 58.1 | 7 / 35 | 4124 |
| 5 | 3 | 59.7 | 61.9 | 10 / 35 | 4078 |
| 6 | 3 | 59.9 | 58.7 | 14 / 35 | 4013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 63% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| germ.TheMind .2 | 4 | 50% |
| awesomeness.Elite 1.0 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| mym.EdgeStalker 1.0 | 3 | 67% |

Hadur died in 145 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 46% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 22% | 42 |
| qualidafial.MajorDick 1.0.1 | 12 | 8% | 15 |
| awesomeness.Elite 1.0 | 9 | 6% | 18 |
| germ.TheMind .2 | 9 | 6% | 10 |
| stelo.UntouchableNano 1.3 | 7 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 8 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.9 | 120 / 210 | 2.45 | 17.9% | 25087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 17.9% | 120 |
| rz.HawkOnFire 0.1 | 2.3 | 14.5% | 23 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.7% | 18 |
| maribo.IotaCT 1.1 | 4.0 | 11.6% | 28 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 5 |
| ratosh.Wesco 1.4 | 6.5 | 8.4% | 6 |
| stelo.PatternRobot 1.0 | 7.2 | 8.0% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 7.9% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.5 | 21 / 35 | 4248 |
| 2 | 1 | 66.6 | 79.7 | 16 / 35 | 4373 |
| 3 | 1 | 69.6 | 89.5 | 21 / 35 | 4743 |
| 4 | 1 | 67.5 | 81.9 | 21 / 35 | 4312 |
| 5 | 1 | 67.5 | 84.8 | 19 / 35 | 3991 |
| 6 | 1 | 67.1 | 83.8 | 22 / 35 | 3420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 61 | 87% |
| nz.jdc.nano.GridFu 1.0 | 48 | 83% |
| maribo.IotaCT 1.1 | 26 | 46% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| stelo.PatternRobot 1.0 | 6 | 33% |
| ratosh.Wesco 1.4 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.IotaCT 1.1 | 23 | 25% | 44 |
| nz.jdc.nano.GridFu 1.0 | 19 | 21% | 62 |
| rz.HawkOnFire 0.1 | 15 | 16% | 51 |
| stelo.PatternRobot 1.0 | 9 | 10% | 12 |
| timmit.nano.TimDog 0.33 | 7 | 8% | 13 |
| ratosh.Wesco 1.4 | 7 | 8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 7% | 8 |
| rrh.Iwillfindyou 2.0 | 3 | 3% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.7 | 126 / 210 | 2.47 | 18.4% | 31284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.4% | 126 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.0% | 33 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 13 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 3 |
| zyx.micro.Ant 1.1 | 5.5 | 9.3% | 8 |
| sanja.First 0.1 | 6.5 | 8.5% | 6 |
| cvt.Firsty 1.0 | 6.7 | 8.4% | 19 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.7% | 1 |
| amk.Punbot.Punbot 0.01 | 8.7 | 7.4% | 6 |
| sample.RamFire 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 22 / 35 | 5598 |
| 2 | 1 | 67.2 | 81.3 | 20 / 35 | 5459 |
| 3 | 1 | 68.4 | 85.4 | 23 / 35 | 5477 |
| 4 | 1 | 66.1 | 80.6 | 19 / 35 | 4834 |
| 5 | 1 | 65.6 | 76.5 | 17 / 35 | 4679 |
| 6 | 1 | 69.1 | 89.2 | 25 / 35 | 5237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 79% |
| cvt.Firsty 1.0 | 34 | 79% |
| baal.nano.N 1.42 | 26 | 100% |
| sanja.First 0.1 | 14 | 86% |
| zyx.micro.Ant 1.1 | 13 | 92% |
| amk.Punbot.Punbot 0.01 | 7 | 57% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| Grystrion.TrackerWO 1.0 | 5 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 22 | 25% | 61 |
| cvt.Firsty 1.0 | 15 | 17% | 35 |
| zyx.micro.Ant 1.1 | 12 | 13% | 32 |
| Grystrion.TrackerWO 1.0 | 10 | 11% | 17 |
| baal.nano.N 1.42 | 8 | 9% | 28 |
| amk.Punbot.Punbot 0.01 | 7 | 8% | 7 |
| sanja.First 0.1 | 6 | 7% | 21 |
| sample.RamFire 1.0 | 4 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 59.9 | 43 / 210 | 4.60 | 12.8% | 24112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.5% | 102 |
| cs.Wren 1.0 | 2.5 | 13.0% | 20 |
| hadur117.micro.SaorOG2 0.1 | 2.8 | 12.8% | 43 |
| js.PinBall 1.6 | 3.7 | 12.0% | 21 |
| mz.Cork 0.1 | 5.0 | 10.6% | 12 |
| joe.ADinosaur 1.0 | 6.5 | 8.7% | 0 |
| evd.X1 0.01 | 6.7 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 7 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.3 | 54.3 | 5 / 35 | 3425 |
| 2 | 3 | 58.5 | 62.2 | 7 / 35 | 4040 |
| 3 | 2 | 58.2 | 58.7 | 9 / 35 | 4138 |
| 4 | 3 | 57.4 | 59.0 | 4 / 35 | 3694 |
| 5 | 3 | 58.7 | 60.0 | 7 / 35 | 4406 |
| 6 | 2 | 61.3 | 65.4 | 11 / 35 | 4409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 32% |
| cs.Wren 1.0 | 20 | 70% |
| js.PinBall 1.6 | 7 | 57% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| evd.X1 0.01 | 1 | 0% |
| mz.Cork 0.1 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 87 | 52% | 105 |
| cs.Wren 1.0 | 22 | 13% | 33 |
| PSW.Relentless 0.1 | 17 | 10% | 17 |
| evd.X1 0.01 | 13 | 8% | 13 |
| mz.Cork 0.1 | 10 | 6% | 14 |
| js.PinBall 1.6 | 8 | 5% | 12 |
| joe.ADinosaur 1.0 | 8 | 5% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.4 | 71 / 210 | 3.76 | 14.6% | 21130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 14.6% | 71 |
| ntc.Opposite 1.5 | 2.8 | 12.0% | 19 |
| stelo.AreaTargetingBot 1.1 | 2.8 | 12.5% | 39 |
| myl.nano.Graviton 1.10 | 4.2 | 11.3% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.8% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 10.2% | 11 |
| DBall.NUKE 0.1 | 7.2 | 8.4% | 11 |
| disan.Chair 2.2.0 | 7.3 | 8.6% | 13 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 17 |
| pbg.R2D2 1.0 | 9.7 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.3 | 59.0 | 5 / 35 | 3158 |
| 2 | 1 | 60.5 | 68.3 | 11 / 35 | 3559 |
| 3 | 1 | 59.5 | 64.4 | 11 / 35 | 3235 |
| 4 | 1 | 65.1 | 80.0 | 19 / 35 | 3539 |
| 5 | 1 | 63.6 | 74.6 | 13 / 35 | 3909 |
| 6 | 1 | 61.6 | 69.8 | 12 / 35 | 3730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 31 | 42% |
| myl.nano.Graviton 1.10 | 21 | 81% |
| DBall.NUKE 0.1 | 13 | 69% |
| disan.Chair 2.2.0 | 12 | 67% |
| ntc.Opposite 1.5 | 11 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| donjezza.Muncho 1.0 | 6 | 33% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 43 | 30% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 15% | 29 |
| pfvicm.Sobieski 7.2.3b | 19 | 13% | 21 |
| ntc.Opposite 1.5 | 18 | 13% | 26 |
| myl.nano.Graviton 1.10 | 13 | 9% | 28 |
| DBall.NUKE 0.1 | 13 | 9% | 22 |
| donjezza.Muncho 1.0 | 8 | 6% | 11 |
| disan.Chair 2.2.0 | 6 | 4% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 64.0 | 70 / 210 | 4.24 | 12.9% | 16744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 14.9% | 49 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.1% | 43 |
| yagami.Tidus 0.11 | 3.7 | 13.1% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.1% | 24 |
| hadur117.micro.SaorOG2 0.1 | 3.8 | 12.9% | 70 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.0% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.5 | 59.4 | 12 / 35 | 2692 |
| 2 | 4 | 59.2 | 61.3 | 12 / 35 | 2845 |
| 3 | 2 | 61.9 | 68.3 | 12 / 35 | 3446 |
| 4 | 4 | 61.2 | 66.7 | 11 / 35 | 3213 |
| 5 | 6 | 54.5 | 57.5 | 6 / 35 | 2055 |
| 6 | 2 | 61.5 | 71.1 | 17 / 35 | 2493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 91% |
| kawigi.micro.Shiz 1.1 | 19 | 79% |
| yagami.Tidus 0.11 | 13 | 62% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 38% | 67 |
| yagami.Tidus 0.11 | 30 | 21% | 41 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 9% | 37 |
| ejb.Polaris 1.0.1 | 9 | 6% | 15 |
| kurios.DOSexe .9a | 9 | 6% | 9 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.6 | 89 / 210 | 3.74 | 14.2% | 18062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 14.2% | 89 |
| wee.Gem 1.8.4 | 2.2 | 13.6% | 46 |
| bzdp.Pansy 2.1 | 3.2 | 12.4% | 21 |
| wompi.Quokka 1.6 | 4.3 | 11.5% | 23 |
| ratosh.Nobo 0.21 | 4.3 | 11.3% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 10.0% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 9.3% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 5 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 72.7 | 14 / 35 | 3311 |
| 2 | 3 | 58.8 | 61.0 | 13 / 35 | 3294 |
| 3 | 1 | 62.1 | 72.4 | 15 / 35 | 3206 |
| 4 | 2 | 60.6 | 69.8 | 15 / 35 | 2949 |
| 5 | 1 | 60.8 | 73.3 | 14 / 35 | 2590 |
| 6 | 1 | 60.0 | 68.3 | 18 / 35 | 2712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 42 | 76% |
| bzdp.Pansy 2.1 | 27 | 93% |
| wompi.Quokka 1.6 | 17 | 71% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| ratosh.Nobo 0.21 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 25 | 21% | 62 |
| wompi.Quokka 1.6 | 17 | 14% | 22 |
| bzdp.Pansy 2.1 | 16 | 13% | 35 |
| maribo.FollowFire 1 | 16 | 13% | 16 |
| bayen.UbaMicro 1.4 | 14 | 12% | 21 |
| ratosh.Nobo 0.21 | 11 | 9% | 20 |
| stelo.MyAgileRobot 0.2 | 10 | 8% | 11 |
| m3thos.Eva00 1.1 | 9 | 7% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |

## Melee bench: F15

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.0 | 16 / 210 | 3.43 | 15.5% | 31865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.6% | 167 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 15.5% | 16 |
| mz.NanoGod 2.02 | 2.8 | 14.4% | 16 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.7% | 6 |
| ayk.WallHugger 1.0 | 5.0 | 9.3% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.1% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 4.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 73.7 | 3 / 35 | 4934 |
| 2 | 2 | 67.7 | 80.3 | 4 / 35 | 6334 |
| 3 | 2 | 66.4 | 75.9 | 4 / 35 | 5563 |
| 4 | 2 | 65.8 | 76.2 | 3 / 35 | 5637 |
| 5 | 3 | 61.7 | 63.5 | 2 / 35 | 4386 |
| 6 | 2 | 63.5 | 68.6 | 0 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 4% |
| mz.NanoGod 2.02 | 9 | 56% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 3 | 67% |
| exauge.GateKeeper 1.1.121g | 3 | 33% |
| drd.Dreadknoght 0.9 | 1 | 0% |
| sample.SittingDuck 1.0 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 129 | 66% | 135 |
| mz.NanoGod 2.02 | 32 | 16% | 37 |
| exauge.GateKeeper 1.1.121g | 12 | 6% | 13 |
| stelo.PianistNano 1.2 | 7 | 4% | 8 |
| ayk.WallHugger 1.0 | 7 | 4% | 7 |
| drd.Dreadknoght 0.9 | 4 | 2% | 4 |
| stuff.Vlad 0.1 | 3 | 2% | 6 |

## Melee bench: F16

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 63.5 | 68 / 210 | 4.29 | 13.5% | 21372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.2 | 14.5% | 49 |
| hadur117.micro.SaorOG2 0.1 | 2.0 | 13.5% | 68 |
| bvh.micro.Freya 0.3 | 3.7 | 11.6% | 12 |
| dummy.micro.Sparrow 2.5 | 4.0 | 12.0% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 11.1% | 23 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 10 |
| conscience.Electron 1.3g | 6.7 | 8.7% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 3 |
| ap.Frederick 1.1 | 9.0 | 6.4% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 66.3 | 11 / 35 | 3453 |
| 2 | 2 | 61.7 | 67.0 | 13 / 35 | 3832 |
| 3 | 2 | 60.2 | 65.7 | 12 / 35 | 3594 |
| 4 | 2 | 58.9 | 62.2 | 11 / 35 | 3597 |
| 5 | 1 | 59.7 | 64.4 | 11 / 35 | 3496 |
| 6 | 3 | 55.7 | 55.2 | 10 / 35 | 3400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 51% |
| dummy.micro.Sparrow 2.5 | 21 | 81% |
| bvh.micro.Freya 0.3 | 16 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 64% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 24% | 57 |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 20% | 44 |
| conscience.Electron 1.3g | 23 | 16% | 27 |
| dummy.micro.Sparrow 2.5 | 19 | 13% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 10% | 13 |
| dl.BetterWalls 1.0 | 13 | 9% | 18 |
| bvh.micro.Freya 0.3 | 8 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 8 |

## Melee bench: F17

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 71.1 | 86 / 210 | 3.60 | 15.6% | 25796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 15.6% | 86 |
| sheldor.melee.nano.TestMelee 0.1 | 1.5 | 16.8% | 46 |
| sul.Lunar 1.1 | 3.2 | 12.3% | 29 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.7% | 16 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.0% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.9% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.5% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.6% | 8 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.2% | 7 |
| sample.Corners 1.0 | 10.0 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.5 | 16 / 35 | 4719 |
| 2 | 2 | 61.8 | 66.0 | 13 / 35 | 4362 |
| 3 | 1 | 64.5 | 76.5 | 16 / 35 | 4114 |
| 4 | 2 | 61.6 | 67.9 | 9 / 35 | 3958 |
| 5 | 1 | 65.4 | 73.7 | 16 / 35 | 4980 |
| 6 | 2 | 62.1 | 66.0 | 16 / 35 | 3663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 72% |
| sul.Lunar 1.1 | 23 | 78% |
| supersample.SuperBoxBot 1.0 | 14 | 71% |
| dsw.StaticD 1.0 | 8 | 88% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| sample.Corners 1.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 57 | 45% | 88 |
| supersample.SuperBoxBot 1.0 | 23 | 18% | 33 |
| sul.Lunar 1.1 | 13 | 10% | 33 |
| dsw.StaticD 1.0 | 8 | 6% | 17 |
| mme.NikeEnhanced 2.0 | 7 | 6% | 12 |
| sample.Corners 1.0 | 7 | 6% | 8 |
| sample.MyFirstRobot 1.0 | 5 | 4% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 3 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.4 | 71 / 210 | 3.30 | 15.8% | 27931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 15.8% | 71 |
| radnor.DoctorBob 1.42 | 2.2 | 14.1% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.7 | 13.1% | 33 |
| mld.Wisdom 1.0 | 4.5 | 11.1% | 13 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.3% | 11 |
| amz.NanoClone 1.41 | 5.5 | 9.9% | 15 |
| sample.Walls 1.0 | 6.7 | 8.5% | 10 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 5 |
| sample.Target 1.0 | 10.0 | 3.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 68.6 | 9 / 35 | 3964 |
| 2 | 1 | 64.4 | 77.5 | 11 / 35 | 4745 |
| 3 | 1 | 63.4 | 72.1 | 11 / 35 | 4552 |
| 4 | 1 | 64.6 | 78.7 | 13 / 35 | 4685 |
| 5 | 1 | 63.6 | 73.3 | 12 / 35 | 4620 |
| 6 | 1 | 65.5 | 76.2 | 15 / 35 | 5365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 60% |
| radnor.DoctorBob 1.42 | 33 | 39% |
| amz.NanoClone 1.41 | 15 | 73% |
| sample.Walls 1.0 | 12 | 75% |
| mld.Wisdom 1.0 | 10 | 60% |
| KiraNL.Chupacabra 0.4 | 7 | 71% |
| jangs.ns51 1.0 | 6 | 67% |
| sample.Target 1.0 | 3 | 33% |
| GarmBox.Oranges 1.0 | 2 | 50% |

Hadur died in 140 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 27% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 26% | 63 |
| KiraNL.Chupacabra 0.4 | 19 | 14% | 23 |
| mld.Wisdom 1.0 | 17 | 12% | 24 |
| sample.Walls 1.0 | 8 | 6% | 13 |
| amz.NanoClone 1.41 | 8 | 6% | 12 |
| jangs.ns51 1.0 | 8 | 6% | 11 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |
| sample.Target 1.0 | 2 | 1% | 0 |
1 death(s) with no robot to name.

