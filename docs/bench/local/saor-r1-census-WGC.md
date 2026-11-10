# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 91.0 | 148 / 210 | 1.81 | 22.3% | 46890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.3% | 148 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 26 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 20 |
| mld.Infinity 2.2 | 4.0 | 12.2% | 7 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 6 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 6.8 | 6.5% | 2 |
| sample.Walls 1.0 | 7.5 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 94.9 | 28 / 35 | 7521 |
| 2 | 1 | 71.5 | 83.2 | 20 / 35 | 7637 |
| 3 | 1 | 73.6 | 90.2 | 26 / 35 | 8116 |
| 4 | 1 | 73.2 | 91.4 | 22 / 35 | 7829 |
| 5 | 1 | 74.0 | 94.9 | 28 / 35 | 7565 |
| 6 | 1 | 73.6 | 91.1 | 24 / 35 | 8222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 93% |
| radnor.DoctorBob 1.42 | 43 | 77% |
| mld.Infinity 2.2 | 27 | 96% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 48% | 77 |
| mz.AntiGrav 1.0 | 13 | 21% | 72 |
| amz.NanoClone 1.41 | 11 | 17% | 16 |
| mld.Infinity 2.2 | 6 | 10% | 29 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.3 | 134 / 210 | 1.97 | 19.8% | 34834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.8% | 134 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 47 |
| mld.DustBunny 3.8 | 3.0 | 13.0% | 14 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 4 |
| zyx.nano.Ant 1.1 | 6.3 | 8.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.9% | 5 |
| fullsail.SweetTea 1.1 | 7.8 | 6.7% | 1 |
| bzdp.BoxCar 2.0 | 8.3 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.3 | 22 / 35 | 6072 |
| 2 | 1 | 71.0 | 92.7 | 26 / 35 | 5915 |
| 3 | 1 | 68.2 | 85.7 | 20 / 35 | 5494 |
| 4 | 1 | 70.4 | 91.4 | 25 / 35 | 5981 |
| 5 | 1 | 70.2 | 92.4 | 21 / 35 | 5777 |
| 6 | 1 | 68.6 | 86.0 | 20 / 35 | 5595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 73 | 75% |
| mld.DustBunny 3.8 | 58 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| zyx.nano.Ant 1.1 | 6 | 83% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 45% | 96 |
| mld.DustBunny 3.8 | 20 | 26% | 61 |
| maribo.melee.BMV 0.1 | 8 | 11% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 8% | 16 |
| cs.Grudge 1.0 | 3 | 4% | 5 |
| zyx.nano.Ant 1.1 | 2 | 3% | 3 |
| bzdp.BoxCar 2.0 | 2 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 8 |
| fullsail.SweetTea 1.1 | 0 | 0% | 3 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 82.0 | 127 / 210 | 2.62 | 19.8% | 37800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.8% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 15 |
| fm.mammillarias 1.3 | 5.0 | 9.6% | 3 |
| cb.nano.Insomnia 1.0 | 6.0 | 8.9% | 11 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.7% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.5 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 80.0 | 22 / 35 | 6261 |
| 2 | 1 | 71.8 | 89.2 | 22 / 35 | 6567 |
| 3 | 1 | 66.3 | 73.3 | 18 / 35 | 5571 |
| 4 | 1 | 71.7 | 89.5 | 23 / 35 | 6565 |
| 5 | 1 | 70.7 | 84.4 | 25 / 35 | 6615 |
| 6 | 1 | 68.0 | 75.2 | 17 / 35 | 6221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 61 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 92% |
| myl.nano.KomoriNinja 1.1 | 19 | 89% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| fm.mammillarias 1.3 | 9 | 89% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Tracker 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 27% | 42 |
| myl.micro.Troodon 1.10 | 14 | 17% | 64 |
| cb.nano.Insomnia 1.0 | 13 | 16% | 17 |
| myl.nano.KomoriNinja 1.1 | 10 | 12% | 38 |
| fm.mammillarias 1.3 | 9 | 11% | 14 |
| sp.Nanos.Ember 1.1 | 7 | 8% | 15 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 14 |
| sample.Fire 1.0 | 3 | 4% | 5 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.0 | 145 / 210 | 2.26 | 20.7% | 40965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.7% | 145 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.9% | 18 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.2% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 17 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.3% | 5 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.0% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 88.6 | 22 / 35 | 7141 |
| 2 | 1 | 72.0 | 90.5 | 25 / 35 | 7325 |
| 3 | 1 | 68.9 | 81.3 | 24 / 35 | 5912 |
| 4 | 1 | 70.3 | 85.7 | 23 / 35 | 6785 |
| 5 | 1 | 68.9 | 80.6 | 22 / 35 | 6418 |
| 6 | 1 | 72.4 | 89.2 | 29 / 35 | 7384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 88% |
| tvv.micro.Antares 1.1.1 | 31 | 94% |
| stelo.SoJNanoMelee 1.1 | 29 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 89% |
| tj.zombie1n 1.0.1 | 16 | 75% |
| yk.JahMicro 1.0 | 10 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 41% | 72 |
| stelo.SoJNanoMelee 1.1 | 14 | 21% | 38 |
| tvv.micro.Antares 1.1.1 | 10 | 15% | 49 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 20 |
| tj.zombie1n 1.0.1 | 4 | 6% | 10 |
| repositorio.NanoStep 1.0 | 3 | 5% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 5 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |
| yk.JahMicro 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.3 | 82 / 210 | 3.94 | 15.6% | 29264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 15.6% | 82 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 45 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 27 |
| sam.Samspin 1.0 | 5.3 | 9.8% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.3% | 22 |
| EBBU.Sim2 1.02 | 5.8 | 9.4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.9% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 64.1 | 12 / 35 | 5341 |
| 2 | 1 | 61.7 | 65.1 | 14 / 35 | 4588 |
| 3 | 1 | 62.6 | 66.0 | 14 / 35 | 4882 |
| 4 | 1 | 62.4 | 67.3 | 12 / 35 | 4609 |
| 5 | 1 | 64.5 | 73.0 | 13 / 35 | 4958 |
| 6 | 1 | 64.4 | 68.3 | 17 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 81% |
| oog.melee.Corsair 1.0 | 32 | 47% |
| ahf.NanoAndrew .4 | 24 | 88% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| EBBU.Sim2 1.02 | 6 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 23% | 44 |
| simonton.nano.MeleeSeed 1.8 | 25 | 19% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 17 | 13% | 15 |
| ahf.NanoAndrew .4 | 14 | 11% | 35 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 20 |
| sam.Samspin 1.0 | 12 | 9% | 18 |
| EBBU.Sim2 1.02 | 9 | 7% | 13 |
| zyx.nano.BacillusComma 1.0 | 7 | 5% | 12 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.0 | 135 / 210 | 2.35 | 19.1% | 32762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.1% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 17 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 4 |
| fm.claire 1.7 | 5.7 | 8.8% | 5 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.3% | 3 |
| sample.SpinBot 1.0 | 7.7 | 7.4% | 3 |
| pa.Improved 1.0 | 9.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 23 / 35 | 5557 |
| 2 | 1 | 68.2 | 83.2 | 21 / 35 | 5429 |
| 3 | 1 | 67.9 | 83.5 | 20 / 35 | 5405 |
| 4 | 1 | 69.7 | 87.9 | 25 / 35 | 5639 |
| 5 | 1 | 67.8 | 80.0 | 23 / 35 | 5312 |
| 6 | 1 | 69.0 | 87.3 | 23 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 89% |
| oog.melee.CapuletDroid 1.1 | 32 | 100% |
| gh.nano.Grofvuil 0.2 | 22 | 73% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| sample.SpinBot 1.0 | 8 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 76 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 33% | 73 |
| gh.nano.Grofvuil 0.2 | 15 | 20% | 37 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 44 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 13 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 13 |
| fm.claire 1.7 | 5 | 7% | 8 |
| kurios.DOSexe .9b | 4 | 5% | 12 |
| sample.SpinBot 1.0 | 4 | 5% | 7 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.4 | 98 / 210 | 2.76 | 18.2% | 34697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.2% | 98 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.2% | 43 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.7% | 36 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 25 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 6.0 | 7.8% | 4 |
| acogdev.alpha 0.2 | 7.5 | 6.2% | 1 |
| el.JumpShoot 0.2 | 8.3 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.3 | 15 / 35 | 5833 |
| 2 | 1 | 69.4 | 84.4 | 19 / 35 | 5927 |
| 3 | 1 | 66.0 | 74.0 | 16 / 35 | 5469 |
| 4 | 1 | 66.9 | 76.5 | 16 / 35 | 5517 |
| 5 | 1 | 69.1 | 84.1 | 20 / 35 | 5990 |
| 6 | 1 | 67.6 | 82.2 | 12 / 35 | 5961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 87% |
| mz.MicroGodMelee 1 | 34 | 68% |
| gh.micro.Gruweltje 0.7 | 23 | 65% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 31 | 28% | 49 |
| spinnercat.micro.Tyger 0.1 | 30 | 27% | 74 |
| mz.MicroGodMelee 1 | 25 | 22% | 53 |
| acogdev.alpha 0.2 | 13 | 12% | 14 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 71.8 | 103 / 210 | 3.54 | 17.1% | 33194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.1% | 103 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.5% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.1% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.0% | 8 |
| germ.TheMind .2 | 4.7 | 9.8% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.9% | 2 |
| awesomeness.Elite 1.0 | 7.0 | 8.3% | 8 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 7 |
| sample.Crazy 1.0 | 8.3 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 73.7 | 17 / 35 | 5673 |
| 2 | 1 | 66.0 | 71.1 | 17 / 35 | 5473 |
| 3 | 1 | 64.8 | 69.8 | 14 / 35 | 5410 |
| 4 | 1 | 65.2 | 69.2 | 18 / 35 | 5184 |
| 5 | 1 | 66.8 | 74.0 | 19 / 35 | 5950 |
| 6 | 1 | 65.9 | 73.0 | 18 / 35 | 5504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| germ.TheMind .2 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 43% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 16% | 34 |
| germ.TheMind .2 | 14 | 13% | 18 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 15 |
| awesomeness.Elite 1.0 | 6 | 6% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 14 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 11 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.7 | 158 / 210 | 1.92 | 20.7% | 34146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.7% | 158 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 9 |
| timmit.nano.TimDog 0.33 | 4.3 | 10.4% | 8 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.4% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.0% | 0 |
| spinnercat.Omen 1.0 | 7.7 | 7.4% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.6% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.2 | 25 / 35 | 5679 |
| 2 | 1 | 70.4 | 85.1 | 26 / 35 | 5551 |
| 3 | 1 | 73.4 | 96.8 | 31 / 35 | 5989 |
| 4 | 1 | 70.7 | 87.6 | 26 / 35 | 5483 |
| 5 | 1 | 71.2 | 90.5 | 26 / 35 | 5369 |
| 6 | 1 | 70.7 | 88.3 | 24 / 35 | 6075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 78 | 90% |
| nz.jdc.nano.GridFu 1.0 | 38 | 97% |
| timmit.nano.TimDog 0.33 | 17 | 88% |
| maribo.IotaCT 1.1 | 12 | 100% |
| ratosh.Wesco 1.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 22 | 42% | 71 |
| timmit.nano.TimDog 0.33 | 12 | 23% | 24 |
| stelo.PatternRobot 1.0 | 6 | 11% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 55 |
| ratosh.Wesco 1.4 | 4 | 8% | 20 |
| maribo.IotaCT 1.1 | 2 | 4% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 5 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.1 | 174 / 210 | 1.62 | 22.1% | 41616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.1% | 174 |
| baal.nano.N 1.42 | 2.5 | 11.8% | 10 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 11 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 0 |
| sanja.First 0.1 | 5.7 | 8.8% | 4 |
| zyx.micro.Ant 1.1 | 6.2 | 8.3% | 6 |
| amk.Punbot.Punbot 0.01 | 6.5 | 8.0% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.1% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 90.8 | 27 / 35 | 7000 |
| 2 | 1 | 72.2 | 92.7 | 31 / 35 | 6812 |
| 3 | 1 | 71.3 | 89.5 | 29 / 35 | 6708 |
| 4 | 1 | 72.5 | 94.0 | 28 / 35 | 6959 |
| 5 | 1 | 72.7 | 94.9 | 30 / 35 | 7083 |
| 6 | 1 | 72.8 | 96.5 | 29 / 35 | 7054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 90% |
| tvv.nano.Polaris 1.2 | 37 | 92% |
| cvt.Firsty 1.0 | 31 | 97% |
| sanja.First 0.1 | 24 | 96% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 25% | 30 |
| tvv.nano.Polaris 1.2 | 6 | 17% | 62 |
| baal.nano.N 1.42 | 5 | 14% | 40 |
| Grystrion.TrackerWO 1.0 | 5 | 14% | 20 |
| cvt.Firsty 1.0 | 4 | 11% | 23 |
| sanja.First 0.1 | 3 | 8% | 23 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.4 | 80 / 210 | 3.76 | 15.9% | 33273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 15.9% | 80 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 63 |
| cs.Wren 1.0 | 3.0 | 13.0% | 25 |
| mz.Cork 0.1 | 4.3 | 10.9% | 16 |
| js.PinBall 1.6 | 4.5 | 11.5% | 17 |
| joe.ADinosaur 1.0 | 6.3 | 9.3% | 2 |
| evd.X1 0.01 | 6.7 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 66.3 | 12 / 35 | 5230 |
| 2 | 2 | 61.0 | 59.4 | 13 / 35 | 5253 |
| 3 | 1 | 64.3 | 71.1 | 12 / 35 | 5185 |
| 4 | 1 | 65.2 | 71.7 | 12 / 35 | 6018 |
| 5 | 1 | 65.2 | 71.7 | 18 / 35 | 5837 |
| 6 | 1 | 66.0 | 75.9 | 13 / 35 | 5750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 69% |
| cs.Wren 1.0 | 28 | 79% |
| mz.Cork 0.1 | 13 | 77% |
| js.PinBall 1.6 | 10 | 70% |
| joe.ADinosaur 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 130 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 41% | 89 |
| cs.Wren 1.0 | 20 | 15% | 35 |
| js.PinBall 1.6 | 15 | 12% | 22 |
| joe.ADinosaur 1.0 | 12 | 9% | 16 |
| mz.Cork 0.1 | 11 | 8% | 19 |
| evd.X1 0.01 | 10 | 8% | 15 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.6 | 139 / 210 | 2.39 | 19.5% | 31789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.5% | 139 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 19 |
| ntc.Opposite 1.5 | 3.0 | 11.2% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.6% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.8% | 6 |
| stelo.AreaTargetingBot 1.1 | 6.2 | 9.3% | 9 |
| disan.Chair 2.2.0 | 6.7 | 8.8% | 9 |
| DBall.NUKE 0.1 | 8.3 | 7.4% | 1 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 10 |
| pbg.R2D2 1.0 | 9.5 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 73.7 | 17 / 35 | 4914 |
| 2 | 1 | 68.3 | 83.8 | 20 / 35 | 5190 |
| 3 | 1 | 70.0 | 89.2 | 24 / 35 | 5459 |
| 4 | 1 | 70.6 | 89.5 | 28 / 35 | 5462 |
| 5 | 1 | 68.6 | 84.4 | 24 / 35 | 4984 |
| 6 | 1 | 70.0 | 86.7 | 26 / 35 | 5780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 92% |
| ntc.Opposite 1.5 | 29 | 83% |
| disan.Chair 2.2.0 | 23 | 83% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| donjezza.Muncho 1.0 | 14 | 93% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 23% | 49 |
| ntc.Opposite 1.5 | 12 | 17% | 28 |
| pfvicm.Sobieski 7.2.3b | 11 | 15% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 14% | 24 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 31 |
| disan.Chair 2.2.0 | 6 | 8% | 20 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |
| donjezza.Muncho 1.0 | 2 | 3% | 12 |

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.1 | 97 / 210 | 3.06 | 16.8% | 27603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.8% | 97 |
| oog.melee.Capulet 1.2 | 2.5 | 14.2% | 48 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 20 |
| yagami.Tidus 0.11 | 5.0 | 11.6% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.1 | 16 / 35 | 4427 |
| 2 | 1 | 68.3 | 83.5 | 20 / 35 | 4879 |
| 3 | 1 | 66.1 | 77.8 | 15 / 35 | 4374 |
| 4 | 1 | 65.8 | 76.5 | 15 / 35 | 4330 |
| 5 | 1 | 64.6 | 67.9 | 16 / 35 | 4694 |
| 6 | 1 | 66.6 | 80.0 | 15 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 83% |
| kawigi.micro.Shiz 1.1 | 32 | 100% |
| oog.melee.Capulet 1.2 | 30 | 63% |
| yagami.Tidus 0.11 | 13 | 77% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 39% | 67 |
| yagami.Tidus 0.11 | 21 | 19% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 18% | 55 |
| kawigi.micro.Shiz 1.1 | 12 | 11% | 29 |
| ejb.Polaris 1.0.1 | 6 | 5% | 18 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.0 | 135 / 210 | 2.89 | 17.7% | 28532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.7% | 135 |
| bzdp.Pansy 2.1 | 2.3 | 13.0% | 18 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 25 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 10 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.4% | 3 |
| bayen.UbaMicro 1.4 | 7.2 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.4 | 23 / 35 | 4308 |
| 2 | 1 | 65.3 | 74.9 | 21 / 35 | 4457 |
| 3 | 1 | 65.7 | 75.9 | 17 / 35 | 5038 |
| 4 | 1 | 67.2 | 83.2 | 25 / 35 | 4513 |
| 5 | 1 | 67.8 | 80.6 | 24 / 35 | 5008 |
| 6 | 1 | 67.8 | 80.3 | 25 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 70 | 96% |
| wee.Gem 1.8.4 | 25 | 96% |
| ratosh.Nobo 0.21 | 18 | 83% |
| wompi.Quokka 1.6 | 15 | 93% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 379. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 17% | 73 |
| ratosh.Nobo 0.21 | 11 | 14% | 24 |
| stelo.MyAgileRobot 0.2 | 11 | 14% | 14 |
| wee.Gem 1.8.4 | 10 | 13% | 42 |
| maribo.FollowFire 1 | 10 | 13% | 9 |
| wompi.Quokka 1.6 | 9 | 12% | 19 |
| bayen.UbaMicro 1.4 | 5 | 6% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 6 |
| m3thos.Eva00 1.1 | 4 | 5% | 10 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 88.3 | 134 / 210 | 2.06 | 22.0% | 49419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.0% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 14 |
| ayk.WallHugger 1.0 | 4.5 | 9.1% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.3% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 92.4 | 28 / 35 | 8740 |
| 2 | 1 | 73.6 | 87.9 | 23 / 35 | 8520 |
| 3 | 1 | 72.3 | 84.8 | 19 / 35 | 7777 |
| 4 | 1 | 74.1 | 90.5 | 26 / 35 | 8540 |
| 5 | 1 | 73.3 | 89.8 | 20 / 35 | 8061 |
| 6 | 1 | 72.1 | 84.1 | 18 / 35 | 7781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 137 | 82% |
| mz.NanoGod 2.02 | 9 | 89% |
| exauge.GateKeeper 1.1.121g | 8 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 47% | 147 |
| mz.NanoGod 2.02 | 17 | 22% | 25 |
| ayk.WallHugger 1.0 | 10 | 13% | 13 |
| stelo.PianistNano 1.2 | 6 | 8% | 9 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 9 |
| stuff.Vlad 0.1 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.5 | 96 / 210 | 3.84 | 16.0% | 29157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.0% | 96 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 28 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.4% | 32 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 21 |
| bvh.micro.Freya 0.3 | 4.3 | 11.2% | 13 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.5% | 7 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 4 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 2 |
| ap.Frederick 1.1 | 8.8 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 64.8 | 16 / 35 | 4463 |
| 2 | 1 | 67.8 | 81.3 | 20 / 35 | 5351 |
| 3 | 1 | 63.6 | 66.0 | 17 / 35 | 4824 |
| 4 | 1 | 61.1 | 60.3 | 13 / 35 | 4679 |
| 5 | 1 | 64.5 | 70.5 | 15 / 35 | 4918 |
| 6 | 1 | 63.7 | 67.9 | 15 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| dummy.micro.Sparrow 2.5 | 23 | 87% |
| bvh.micro.Freya 0.3 | 22 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 77% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 18% | 63 |
| conscience.Electron 1.3g | 18 | 16% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 19 |
| dummy.micro.Sparrow 2.5 | 14 | 12% | 33 |
| bvh.micro.Freya 0.3 | 14 | 12% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 11% | 26 |
| dl.BetterWalls 1.0 | 12 | 11% | 15 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 83.9 | 145 / 210 | 2.45 | 21.2% | 43263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.2% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 21 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 11 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.7% | 14 |
| dsw.StaticD 1.0 | 5.3 | 9.0% | 6 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.3% | 6 |
| tlp.ThreeLeggedPig 1 | 6.5 | 8.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 5.9% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.7% | 1 |
| sample.Corners 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 84.1 | 24 / 35 | 7107 |
| 2 | 1 | 70.8 | 78.7 | 24 / 35 | 7044 |
| 3 | 1 | 71.4 | 82.9 | 23 / 35 | 7269 |
| 4 | 1 | 74.3 | 94.3 | 29 / 35 | 8114 |
| 5 | 1 | 70.2 | 81.3 | 23 / 35 | 6687 |
| 6 | 1 | 70.7 | 81.9 | 22 / 35 | 7042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 88% |
| sul.Lunar 1.1 | 50 | 98% |
| supersample.SuperBoxBot 1.0 | 23 | 83% |
| dsw.StaticD 1.0 | 11 | 55% |
| tlp.ThreeLeggedPig 1 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 38% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 27% | 66 |
| dsw.StaticD 1.0 | 7 | 11% | 18 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 12 |
| sul.Lunar 1.1 | 4 | 6% | 50 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.5 | 108 / 210 | 2.66 | 18.6% | 38179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.6% | 108 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 27 |
| mld.Wisdom 1.0 | 3.0 | 12.5% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.8% | 24 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 11 |
| amz.NanoClone 1.41 | 5.7 | 9.8% | 11 |
| sample.Walls 1.0 | 7.3 | 7.3% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 3 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.9 | 21 / 35 | 7006 |
| 2 | 1 | 67.6 | 82.5 | 16 / 35 | 5799 |
| 3 | 1 | 68.4 | 84.1 | 16 / 35 | 6449 |
| 4 | 1 | 70.0 | 84.8 | 23 / 35 | 6849 |
| 5 | 1 | 65.4 | 71.7 | 15 / 35 | 5941 |
| 6 | 1 | 67.3 | 78.1 | 17 / 35 | 6135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 83% |
| radnor.DoctorBob 1.42 | 37 | 76% |
| mld.Wisdom 1.0 | 17 | 76% |
| amz.NanoClone 1.41 | 13 | 69% |
| jangs.ns51 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 28% | 47 |
| radnor.DoctorBob 1.42 | 25 | 24% | 59 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 22% | 58 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 16 |
| amz.NanoClone 1.41 | 11 | 11% | 15 |
| jangs.ns51 1.0 | 2 | 2% | 8 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

