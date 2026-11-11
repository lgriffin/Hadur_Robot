# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 87.5 | 146 / 210 | 2.12 | 20.7% | 41090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 20.7% | 146 |
| mz.AntiGrav 1.0 | 2.5 | 13.9% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 13.3% | 19 |
| mld.Infinity 2.2 | 3.5 | 12.8% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 7 |
| sample.Walls 1.0 | 6.7 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 7.0% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 8.8 | 5.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.9 | 24 / 35 | 7354 |
| 2 | 1 | 70.7 | 84.4 | 20 / 35 | 6796 |
| 3 | 1 | 71.0 | 87.6 | 22 / 35 | 7029 |
| 4 | 1 | 73.0 | 93.3 | 31 / 35 | 7189 |
| 5 | 1 | 69.3 | 82.2 | 22 / 35 | 5914 |
| 6 | 1 | 71.8 | 88.6 | 27 / 35 | 6808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 96% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| mld.Infinity 2.2 | 33 | 97% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 31% | 58 |
| mz.AntiGrav 1.0 | 16 | 24% | 62 |
| mld.Infinity 2.2 | 13 | 19% | 52 |
| amz.NanoClone 1.41 | 8 | 12% | 18 |
| sample.Walls 1.0 | 3 | 4% | 9 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.7 | 99 / 210 | 2.56 | 17.6% | 30514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 17.6% | 99 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.2% | 67 |
| mld.DustBunny 3.8 | 3.0 | 14.1% | 18 |
| maribo.melee.BMV 0.1 | 4.0 | 10.2% | 5 |
| zyx.nano.Ant 1.1 | 5.7 | 8.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.9% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 6.4% | 9 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.0 | 17 / 35 | 5074 |
| 2 | 1 | 67.3 | 83.2 | 16 / 35 | 5385 |
| 3 | 1 | 67.8 | 84.1 | 18 / 35 | 5334 |
| 4 | 1 | 67.4 | 88.3 | 19 / 35 | 4384 |
| 5 | 1 | 66.0 | 80.6 | 18 / 35 | 4926 |
| 6 | 1 | 66.2 | 79.0 | 11 / 35 | 5411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 63% |
| mld.DustBunny 3.8 | 50 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 5 | 60% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 32% | 70 |
| mld.DustBunny 3.8 | 34 | 31% | 76 |
| djdjdj.NanoSkunk10 1.0 | 11 | 10% | 19 |
| maribo.melee.BMV 0.1 | 11 | 10% | 16 |
| zyx.nano.Ant 1.1 | 8 | 7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 5 | 5% | 6 |

## Melee bench: F03

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 81.7 | 115 / 210 | 2.64 | 19.1% | 36650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 19.1% | 115 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.3% | 27 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 11 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.9% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.0% | 10 |
| sample.Fire 1.0 | 9.0 | 5.2% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 19 / 35 | 6070 |
| 2 | 1 | 69.6 | 85.1 | 21 / 35 | 5963 |
| 3 | 1 | 68.7 | 80.3 | 20 / 35 | 5919 |
| 4 | 1 | 69.9 | 84.4 | 19 / 35 | 6499 |
| 5 | 1 | 65.8 | 71.7 | 14 / 35 | 5741 |
| 6 | 1 | 69.9 | 83.8 | 22 / 35 | 6458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 73% |
| cb.nano.Insomnia 1.0 | 21 | 90% |
| myl.nano.KomoriNinja 1.1 | 14 | 71% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 28 | 29% | 46 |
| fm.mammillarias 1.3 | 22 | 23% | 28 |
| myl.nano.KomoriNinja 1.1 | 14 | 15% | 32 |
| myl.micro.Troodon 1.10 | 12 | 13% | 58 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 20 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 15 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| sample.Fire 1.0 | 0 | 0% | 3 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 84.8 | 130 / 210 | 2.37 | 19.7% | 37961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 19.7% | 130 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 25 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.1% | 26 |
| tj.zombie1n 1.0.1 | 5.5 | 9.1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 6 |
| yk.JahMicro 1.0 | 8.0 | 7.2% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.9 | 23 / 35 | 6242 |
| 2 | 1 | 68.0 | 83.2 | 18 / 35 | 6001 |
| 3 | 1 | 70.2 | 85.7 | 23 / 35 | 6861 |
| 4 | 1 | 70.3 | 88.9 | 24 / 35 | 6389 |
| 5 | 1 | 70.3 | 86.7 | 22 / 35 | 6788 |
| 6 | 1 | 67.9 | 82.5 | 20 / 35 | 5680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 86% |
| stelo.SoJNanoMelee 1.1 | 35 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 80% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 38% | 90 |
| stelo.SoJNanoMelee 1.1 | 20 | 25% | 35 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 13% | 11 |
| sample.VelociRobot 1.0 | 5 | 6% | 10 |
| tj.zombie1n 1.0.1 | 5 | 6% | 9 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 23 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| yk.JahMicro 1.0 | 1 | 1% | 8 |

## Melee bench: F05

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 69.1 | 87 / 210 | 3.78 | 15.5% | 28946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 15.5% | 87 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 32 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.9% | 29 |
| EBBU.Sim2 1.02 | 5.7 | 9.6% | 9 |
| sam.Samspin 1.0 | 6.2 | 9.6% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.4% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 69.5 | 16 / 35 | 4919 |
| 2 | 1 | 60.5 | 64.8 | 12 / 35 | 4308 |
| 3 | 1 | 62.8 | 69.8 | 15 / 35 | 4790 |
| 4 | 1 | 63.9 | 72.1 | 18 / 35 | 4881 |
| 5 | 1 | 64.1 | 73.7 | 13 / 35 | 5131 |
| 6 | 1 | 61.8 | 64.8 | 13 / 35 | 4917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 79% |
| ahf.NanoAndrew .4 | 19 | 74% |
| simonton.nano.MeleeSeed 1.8 | 16 | 88% |
| sam.Samspin 1.0 | 12 | 100% |
| EBBU.Sim2 1.02 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 23 | 19% | 41 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 34 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 27 |
| EBBU.Sim2 1.02 | 16 | 13% | 22 |
| oog.melee.Corsair 1.0 | 14 | 11% | 35 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 10 |
| sample.TrackFire 1.0 | 7 | 6% | 9 |
| sam.Samspin 1.0 | 6 | 5% | 17 |

## Melee bench: F06

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.3 | 113 / 210 | 2.69 | 18.0% | 31397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 18.0% | 113 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 43 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.3% | 16 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.9% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 8 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 3 |
| fm.claire 1.7 | 6.5 | 8.4% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.5% | 5 |
| pa.Improved 1.0 | 9.5 | 5.5% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.1 | 17 / 35 | 4858 |
| 2 | 1 | 67.5 | 82.9 | 21 / 35 | 4887 |
| 3 | 1 | 69.7 | 88.9 | 22 / 35 | 5792 |
| 4 | 1 | 66.9 | 77.8 | 19 / 35 | 5473 |
| 5 | 1 | 64.3 | 74.0 | 14 / 35 | 4860 |
| 6 | 1 | 68.4 | 86.0 | 20 / 35 | 5527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 72% |
| oog.melee.CapuletDroid 1.1 | 44 | 93% |
| gh.nano.Grofvuil 0.2 | 15 | 87% |
| arthord.NanoSatanMelee Beta | 9 | 78% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| fm.claire 1.7 | 5 | 80% |
| sample.SpinBot 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 33% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 31% | 64 |
| gh.nano.Grofvuil 0.2 | 16 | 16% | 38 |
| oog.melee.CapuletDroid 1.1 | 11 | 11% | 51 |
| arthord.NanoSatanMelee Beta | 10 | 10% | 17 |
| sample.SpinBot 1.0 | 9 | 9% | 10 |
| fm.claire 1.7 | 8 | 8% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 8 |
| kurios.DOSexe .9b | 4 | 4% | 6 |
| pa.Improved 1.0 | 4 | 4% | 6 |

## Melee bench: F07

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.3 | 95 / 210 | 2.77 | 17.7% | 33829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 17.7% | 95 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.0% | 29 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.0% | 42 |
| mz.MicroGodMelee 1 | 3.3 | 13.4% | 36 |
| DBall.Anarchy 0.1 | 5.7 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 2 |
| acogdev.alpha 0.2 | 7.5 | 6.0% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.4 | 14 / 35 | 5809 |
| 2 | 1 | 66.6 | 78.1 | 14 / 35 | 5817 |
| 3 | 1 | 66.1 | 77.1 | 14 / 35 | 5307 |
| 4 | 1 | 66.2 | 78.4 | 13 / 35 | 5373 |
| 5 | 1 | 68.1 | 82.5 | 18 / 35 | 5742 |
| 6 | 1 | 69.5 | 86.3 | 22 / 35 | 5781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 83% |
| mz.MicroGodMelee 1 | 36 | 61% |
| gh.micro.Gruweltje 0.7 | 23 | 78% |
| DBall.Anarchy 0.1 | 13 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 29% | 56 |
| spinnercat.micro.Tyger 0.1 | 31 | 27% | 58 |
| gh.micro.Gruweltje 0.7 | 25 | 22% | 46 |
| caimano.Furia_Ceca 0.22 | 12 | 10% | 15 |
| acogdev.alpha 0.2 | 6 | 5% | 6 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 17 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.9 | 116 / 210 | 3.26 | 17.2% | 32859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 17.2% | 116 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.6% | 19 |
| germ.TheMind .2 | 4.5 | 9.7% | 10 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.0% | 3 |
| awesomeness.Elite 1.0 | 6.2 | 8.6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.7% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.8% | 9 |
| sample.Crazy 1.0 | 8.7 | 7.2% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.8 | 15 / 35 | 5448 |
| 2 | 1 | 65.4 | 73.0 | 22 / 35 | 5073 |
| 3 | 1 | 66.4 | 74.9 | 20 / 35 | 5541 |
| 4 | 1 | 66.4 | 78.1 | 19 / 35 | 5365 |
| 5 | 1 | 65.7 | 71.4 | 19 / 35 | 5804 |
| 6 | 1 | 67.6 | 81.3 | 21 / 35 | 5628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 90% |
| germ.TheMind .2 | 12 | 83% |
| awesomeness.Elite 1.0 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 41% | 101 |
| germ.TheMind .2 | 14 | 15% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 14% | 26 |
| stelo.UntouchableNano 1.3 | 11 | 12% | 17 |
| awesomeness.Elite 1.0 | 8 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 10 |
| mym.EdgeStalker 1.0 | 1 | 1% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 5 |

## Melee bench: F09

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.1 | 135 / 210 | 2.25 | 19.1% | 29898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 19.1% | 135 |
| rz.HawkOnFire 0.1 | 2.0 | 13.2% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 14 |
| maribo.IotaCT 1.1 | 4.5 | 10.7% | 10 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.4% | 10 |
| ratosh.Wesco 1.4 | 6.3 | 9.2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.2% | 4 |
| stelo.PatternRobot 1.0 | 8.5 | 7.7% | 8 |
| spinnercat.Omen 1.0 | 8.5 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 22 / 35 | 4683 |
| 2 | 1 | 68.7 | 83.8 | 22 / 35 | 4758 |
| 3 | 1 | 67.6 | 80.3 | 19 / 35 | 5018 |
| 4 | 1 | 69.4 | 87.9 | 23 / 35 | 5155 |
| 5 | 1 | 70.8 | 90.5 | 27 / 35 | 4984 |
| 6 | 1 | 70.0 | 87.9 | 22 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 58 | 90% |
| nz.jdc.nano.GridFu 1.0 | 31 | 97% |
| timmit.nano.TimDog 0.33 | 17 | 100% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| maribo.IotaCT 1.1 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 26% | 64 |
| ratosh.Wesco 1.4 | 15 | 20% | 27 |
| stelo.PatternRobot 1.0 | 12 | 16% | 23 |
| timmit.nano.TimDog 0.33 | 10 | 13% | 27 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 39 |
| maribo.IotaCT 1.1 | 7 | 9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 8 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |

## Melee bench: F10

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.5 | 150 / 210 | 2.12 | 20.1% | 36249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 20.1% | 150 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 20 |
| baal.nano.N 1.42 | 3.0 | 11.6% | 6 |
| zyx.micro.Ant 1.1 | 4.2 | 10.5% | 17 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 4 |
| sanja.First 0.1 | 6.3 | 8.4% | 3 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 10 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.7% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 26 / 35 | 6129 |
| 2 | 1 | 70.9 | 91.7 | 27 / 35 | 6192 |
| 3 | 1 | 71.2 | 91.1 | 27 / 35 | 6521 |
| 4 | 1 | 70.4 | 88.6 | 26 / 35 | 6180 |
| 5 | 1 | 66.9 | 79.4 | 21 / 35 | 5439 |
| 6 | 1 | 68.4 | 83.2 | 23 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 34 | 85% |
| baal.nano.N 1.42 | 32 | 94% |
| cvt.Firsty 1.0 | 26 | 96% |
| zyx.micro.Ant 1.1 | 26 | 85% |
| sanja.First 0.1 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 22 | 37% | 47 |
| tvv.nano.Polaris 1.2 | 10 | 17% | 54 |
| baal.nano.N 1.42 | 8 | 13% | 34 |
| cvt.Firsty 1.0 | 5 | 8% | 29 |
| sanja.First 0.1 | 4 | 7% | 23 |
| squidM.TentalceMeleeNano 1.1 | 4 | 7% | 9 |
| Grystrion.TrackerWO 1.0 | 3 | 5% | 7 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 5 |
| sample.RamFire 1.0 | 2 | 3% | 2 |

## Melee bench: F11

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.9 | 84 / 210 | 3.89 | 15.3% | 30397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.3 | 15.3% | 84 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 68 |
| cs.Wren 1.0 | 3.3 | 12.5% | 20 |
| mz.Cork 0.1 | 4.3 | 10.8% | 13 |
| js.PinBall 1.6 | 4.3 | 11.3% | 16 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 4 |
| evd.X1 0.01 | 6.8 | 8.6% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 3 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 68.9 | 14 / 35 | 4782 |
| 2 | 1 | 65.7 | 75.2 | 17 / 35 | 5580 |
| 3 | 2 | 60.5 | 61.6 | 10 / 35 | 4658 |
| 4 | 1 | 66.0 | 74.9 | 16 / 35 | 5733 |
| 5 | 2 | 61.5 | 64.4 | 13 / 35 | 4680 |
| 6 | 1 | 61.7 | 62.5 | 14 / 35 | 4964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 47 | 81% |
| cs.Wren 1.0 | 22 | 77% |
| mz.Cork 0.1 | 10 | 90% |
| js.PinBall 1.6 | 8 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 40 | 32% | 85 |
| evd.X1 0.01 | 23 | 18% | 24 |
| cs.Wren 1.0 | 20 | 16% | 32 |
| joe.ADinosaur 1.0 | 14 | 11% | 16 |
| mz.Cork 0.1 | 11 | 9% | 20 |
| js.PinBall 1.6 | 10 | 8% | 19 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.2 | 129 / 210 | 2.60 | 18.2% | 28049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 18.2% | 129 |
| myl.nano.Graviton 1.10 | 3.2 | 11.3% | 26 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 10 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.0% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.0% | 4 |
| disan.Chair 2.2.0 | 7.5 | 7.9% | 4 |
| DBall.NUKE 0.1 | 8.2 | 7.4% | 3 |
| donjezza.Muncho 1.0 | 8.7 | 6.5% | 11 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.8 | 20 / 35 | 4306 |
| 2 | 1 | 67.4 | 82.2 | 23 / 35 | 4556 |
| 3 | 1 | 67.1 | 82.2 | 18 / 35 | 4930 |
| 4 | 1 | 68.0 | 84.4 | 22 / 35 | 4941 |
| 5 | 1 | 66.3 | 80.6 | 21 / 35 | 4422 |
| 6 | 1 | 69.0 | 86.0 | 25 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 97% |
| myl.nano.Graviton 1.10 | 30 | 90% |
| ntc.Opposite 1.5 | 25 | 88% |
| donjezza.Muncho 1.0 | 17 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| disan.Chair 2.2.0 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 86% |
| DBall.NUKE 0.1 | 6 | 83% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 23 | 28% | 51 |
| pfvicm.Sobieski 7.2.3b | 17 | 20% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 16% | 24 |
| stelo.AreaTargetingBot 1.1 | 9 | 11% | 44 |
| ntc.Opposite 1.5 | 9 | 11% | 25 |
| disan.Chair 2.2.0 | 7 | 8% | 12 |
| DBall.NUKE 0.1 | 2 | 2% | 11 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.7 | 68 / 210 | 3.64 | 15.3% | 26129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.3 | 15.3% | 68 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 38 |
| oog.melee.Capulet 1.2 | 2.8 | 14.1% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 25 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 64.1 | 9 / 35 | 4137 |
| 2 | 1 | 64.6 | 74.0 | 12 / 35 | 4555 |
| 3 | 1 | 65.2 | 73.7 | 13 / 35 | 4531 |
| 4 | 2 | 64.1 | 73.3 | 11 / 35 | 4450 |
| 5 | 1 | 63.7 | 70.5 | 10 / 35 | 4197 |
| 6 | 1 | 63.6 | 68.6 | 13 / 35 | 4259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 69% |
| kawigi.micro.Shiz 1.1 | 24 | 96% |
| oog.melee.Capulet 1.2 | 24 | 50% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 34% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 18% | 47 |
| kawigi.micro.Shiz 1.1 | 19 | 13% | 34 |
| ejb.Polaris 1.0.1 | 17 | 12% | 21 |
| yagami.Tidus 0.11 | 16 | 11% | 27 |
| stelo.MirrorNano 1.3 | 9 | 6% | 10 |
| kurios.DOSexe .9a | 4 | 3% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.8 | 117 / 210 | 3.18 | 16.8% | 27011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 16.8% | 117 |
| wee.Gem 1.8.4 | 2.3 | 12.7% | 34 |
| bzdp.Pansy 2.1 | 3.3 | 11.7% | 20 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 11 |
| ratosh.Nobo 0.21 | 4.8 | 10.8% | 8 |
| m3thos.Eva00 1.1 | 5.7 | 10.1% | 13 |
| bayen.UbaMicro 1.4 | 7.2 | 8.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 7.3% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 76.5 | 20 / 35 | 4803 |
| 2 | 1 | 67.2 | 85.1 | 20 / 35 | 4638 |
| 3 | 1 | 66.2 | 79.0 | 22 / 35 | 4384 |
| 4 | 1 | 65.2 | 75.9 | 19 / 35 | 4611 |
| 5 | 1 | 65.3 | 74.0 | 22 / 35 | 4757 |
| 6 | 1 | 61.0 | 64.1 | 14 / 35 | 3818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 90% |
| wee.Gem 1.8.4 | 33 | 91% |
| wompi.Quokka 1.6 | 20 | 95% |
| m3thos.Eva00 1.1 | 15 | 93% |
| ratosh.Nobo 0.21 | 14 | 79% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 15 | 16% | 13 |
| wompi.Quokka 1.6 | 13 | 14% | 29 |
| wee.Gem 1.8.4 | 12 | 13% | 47 |
| bzdp.Pansy 2.1 | 11 | 12% | 39 |
| m3thos.Eva00 1.1 | 10 | 11% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 11 |
| bayen.UbaMicro 1.4 | 9 | 10% | 17 |
| ratosh.Nobo 0.21 | 8 | 9% | 19 |
| stelo.MyAgileRobot 0.2 | 6 | 6% | 10 |

## Melee bench: F15

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.5 | 129 / 210 | 2.03 | 21.2% | 45829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 21.2% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 24 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 1 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.3 | 9.1% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.9% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 86.7 | 20 / 35 | 7044 |
| 2 | 1 | 72.8 | 90.8 | 22 / 35 | 7693 |
| 3 | 1 | 73.6 | 89.8 | 24 / 35 | 8429 |
| 4 | 1 | 73.2 | 93.3 | 24 / 35 | 7985 |
| 5 | 1 | 71.7 | 85.1 | 22 / 35 | 7201 |
| 6 | 1 | 71.1 | 85.4 | 17 / 35 | 7477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 95 | 82% |
| mz.NanoGod 2.02 | 18 | 61% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| ayk.WallHugger 1.0 | 13 | 92% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| cli.WasteOfAmmo 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 43% | 120 |
| mz.NanoGod 2.02 | 34 | 42% | 48 |
| ayk.WallHugger 1.0 | 5 | 6% | 17 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 13 |
| drd.Dreadknoght 0.9 | 2 | 2% | 9 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.5 | 92 / 210 | 3.66 | 16.0% | 28508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 16.0% | 92 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.4% | 35 |
| bvh.micro.Freya 0.3 | 3.5 | 11.4% | 15 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 15 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 14 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 7.1% | 6 |
| ap.Frederick 1.1 | 8.8 | 6.8% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 76.8 | 15 / 35 | 5302 |
| 2 | 1 | 65.1 | 75.9 | 14 / 35 | 4788 |
| 3 | 1 | 62.5 | 65.1 | 18 / 35 | 4601 |
| 4 | 1 | 60.4 | 60.3 | 13 / 35 | 4413 |
| 5 | 1 | 64.3 | 71.4 | 16 / 35 | 4864 |
| 6 | 1 | 64.3 | 73.3 | 16 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 78% |
| dummy.micro.Sparrow 2.5 | 25 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 89% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 21% | 49 |
| conscience.Electron 1.3g | 18 | 15% | 20 |
| dummy.micro.Sparrow 2.5 | 17 | 14% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 14% | 17 |
| bvh.micro.Freya 0.3 | 15 | 13% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 12% | 33 |
| dl.BetterWalls 1.0 | 7 | 6% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 16 |

## Melee bench: F17

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.1 | 138 / 210 | 2.25 | 21.0% | 44270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 21.0% | 138 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 21 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 14 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.9% | 16 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.8% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.4% | 7 |
| sample.Corners 1.0 | 9.2 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.9 | 26 / 35 | 7359 |
| 2 | 1 | 71.2 | 86.3 | 23 / 35 | 7116 |
| 3 | 1 | 70.3 | 85.7 | 20 / 35 | 7048 |
| 4 | 1 | 71.8 | 87.9 | 23 / 35 | 7707 |
| 5 | 1 | 72.1 | 88.9 | 24 / 35 | 7792 |
| 6 | 1 | 70.0 | 79.7 | 22 / 35 | 7248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 44 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 95% |
| supersample.SuperBoxBot 1.0 | 27 | 85% |
| dsw.StaticD 1.0 | 11 | 36% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 35% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 21% | 58 |
| dsw.StaticD 1.0 | 11 | 15% | 19 |
| sul.Lunar 1.1 | 9 | 13% | 50 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 7% | 9 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 6 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |

## Melee bench: F18

hadur117.micro.SaorC3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 76.4 | 102 / 210 | 3.12 | 17.6% | 37003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC3 0.1 | 1.0 | 17.6% | 102 |
| radnor.DoctorBob 1.42 | 2.5 | 13.2% | 29 |
| mld.Wisdom 1.0 | 3.0 | 12.7% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.2% | 36 |
| amz.NanoClone 1.41 | 5.2 | 10.5% | 13 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.7% | 6 |
| sample.Walls 1.0 | 7.0 | 8.0% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.2 | 17 / 35 | 5968 |
| 2 | 1 | 68.5 | 82.9 | 17 / 35 | 6792 |
| 3 | 1 | 67.4 | 77.1 | 17 / 35 | 6521 |
| 4 | 1 | 66.3 | 74.3 | 17 / 35 | 6068 |
| 5 | 1 | 64.6 | 69.5 | 15 / 35 | 5573 |
| 6 | 1 | 67.3 | 78.4 | 19 / 35 | 6081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 85% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| mld.Wisdom 1.0 | 16 | 69% |
| sample.Walls 1.0 | 9 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 26% | 38 |
| radnor.DoctorBob 1.42 | 23 | 21% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 16% | 52 |
| amz.NanoClone 1.41 | 17 | 16% | 23 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 23 |
| GarmBox.Oranges 1.0 | 6 | 6% | 8 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 5 |

