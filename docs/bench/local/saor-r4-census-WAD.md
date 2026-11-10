# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 91.4 | 171 / 210 | 1.78 | 22.4% | 44990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 22.4% | 171 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 15 |
| mz.AntiGrav 1.0 | 2.7 | 14.0% | 7 |
| mld.Infinity 2.2 | 4.2 | 11.8% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 2 |
| sample.Walls 1.0 | 6.3 | 7.2% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 92.1 | 29 / 35 | 7283 |
| 2 | 1 | 74.0 | 95.9 | 31 / 35 | 7321 |
| 3 | 1 | 73.3 | 90.2 | 27 / 35 | 7748 |
| 4 | 1 | 72.7 | 88.3 | 27 / 35 | 7438 |
| 5 | 1 | 74.3 | 94.3 | 31 / 35 | 7942 |
| 6 | 1 | 72.3 | 87.6 | 26 / 35 | 7258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 86 | 98% |
| mld.Infinity 2.2 | 46 | 96% |
| radnor.DoctorBob 1.42 | 25 | 92% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 28% | 50 |
| amz.NanoClone 1.41 | 8 | 21% | 14 |
| mz.AntiGrav 1.0 | 7 | 18% | 74 |
| mld.Infinity 2.2 | 5 | 13% | 44 |
| sample.Walls 1.0 | 3 | 8% | 13 |
| jangs.ns51 1.0 | 2 | 5% | 6 |
| arthord.MannyPacquiao Beta | 2 | 5% | 3 |
| GarmBox.Oranges 1.0 | 1 | 3% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.7 | 132 / 210 | 2.29 | 19.2% | 33941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.2% | 132 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.4% | 42 |
| mld.DustBunny 3.8 | 3.2 | 12.9% | 16 |
| maribo.melee.BMV 0.1 | 3.8 | 10.7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.5% | 4 |
| zyx.nano.Ant 1.1 | 6.8 | 7.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.1% | 9 |
| bzdp.BoxCar 2.0 | 7.7 | 7.1% | 1 |
| fullsail.SweetTea 1.1 | 8.3 | 6.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 24 / 35 | 5714 |
| 2 | 1 | 69.4 | 87.6 | 21 / 35 | 5674 |
| 3 | 1 | 70.1 | 90.2 | 27 / 35 | 6090 |
| 4 | 1 | 70.4 | 92.1 | 25 / 35 | 5650 |
| 5 | 1 | 69.6 | 88.6 | 22 / 35 | 5539 |
| 6 | 1 | 64.1 | 65.4 | 13 / 35 | 5274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 82% |
| mld.DustBunny 3.8 | 40 | 90% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| maribo.melee.BMV 0.1 | 15 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 57% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 40% | 90 |
| mld.DustBunny 3.8 | 17 | 22% | 50 |
| maribo.melee.BMV 0.1 | 8 | 10% | 19 |
| cs.Grudge 1.0 | 8 | 10% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 9 |
| bzdp.BoxCar 2.0 | 4 | 5% | 3 |
| zyx.nano.Ant 1.1 | 3 | 4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 19 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 85.2 | 144 / 210 | 2.33 | 20.5% | 38036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.5% | 144 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 12 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.3% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 10.3% | 9 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.9% | 6 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.4 | 22 / 35 | 5882 |
| 2 | 1 | 71.6 | 89.2 | 26 / 35 | 6659 |
| 3 | 1 | 71.1 | 86.7 | 24 / 35 | 6453 |
| 4 | 1 | 70.9 | 86.3 | 28 / 35 | 6162 |
| 5 | 1 | 67.9 | 76.2 | 21 / 35 | 5951 |
| 6 | 1 | 71.8 | 87.3 | 23 / 35 | 6929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 40 | 90% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 83% |
| sp.Nanos.Ember 1.1 | 17 | 88% |
| fm.mammillarias 1.3 | 9 | 78% |
| sample.Tracker 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 24% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 21% | 42 |
| cb.nano.Insomnia 1.0 | 11 | 17% | 18 |
| myl.nano.KomoriNinja 1.1 | 9 | 14% | 37 |
| fm.mammillarias 1.3 | 6 | 9% | 12 |
| sp.Nanos.Ember 1.1 | 5 | 8% | 25 |
| sample.Fire 1.0 | 3 | 5% | 4 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 12 |

## Melee bench: F04

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.2 | 147 / 210 | 2.33 | 20.4% | 38889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.4% | 147 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.4% | 10 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.0% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.7% | 1 |
| tj.zombie1n 1.0.1 | 4.8 | 9.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.6% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 10 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.7 | 24 / 35 | 6387 |
| 2 | 1 | 70.2 | 86.0 | 23 / 35 | 6770 |
| 3 | 1 | 67.7 | 75.9 | 21 / 35 | 6233 |
| 4 | 1 | 71.8 | 90.8 | 28 / 35 | 6531 |
| 5 | 1 | 70.0 | 85.4 | 24 / 35 | 6499 |
| 6 | 1 | 71.0 | 87.6 | 27 / 35 | 6469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 95% |
| stelo.SoJNanoMelee 1.1 | 33 | 82% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 76% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 15 | 24% | 74 |
| stelo.SoJNanoMelee 1.1 | 13 | 21% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 16% | 27 |
| tj.zombie1n 1.0.1 | 8 | 13% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 14 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 28 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 2 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 10 |

## Melee bench: F05

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.6 | 86 / 210 | 3.83 | 15.9% | 29093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 15.9% | 86 |
| oog.melee.Corsair 1.0 | 2.3 | 13.3% | 37 |
| ahf.NanoAndrew .4 | 3.2 | 11.7% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.5% | 32 |
| EBBU.Sim2 1.02 | 5.8 | 9.3% | 9 |
| sam.Samspin 1.0 | 6.2 | 9.4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 68.6 | 15 / 35 | 4863 |
| 2 | 1 | 65.0 | 73.0 | 16 / 35 | 4936 |
| 3 | 1 | 64.1 | 68.9 | 14 / 35 | 5143 |
| 4 | 1 | 61.3 | 62.9 | 12 / 35 | 4614 |
| 5 | 1 | 64.7 | 72.4 | 15 / 35 | 4941 |
| 6 | 1 | 62.5 | 65.7 | 14 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 44 | 59% |
| simonton.nano.MeleeSeed 1.8 | 25 | 84% |
| ahf.NanoAndrew .4 | 19 | 84% |
| EBBU.Sim2 1.02 | 12 | 83% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 22% | 50 |
| simonton.nano.MeleeSeed 1.8 | 27 | 22% | 44 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 13% | 17 |
| EBBU.Sim2 1.02 | 11 | 9% | 18 |
| ahf.NanoAndrew .4 | 10 | 8% | 28 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| sam.Samspin 1.0 | 5 | 4% | 15 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.4 | 148 / 210 | 2.14 | 20.1% | 35080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.1% | 148 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 29 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.0% | 6 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 5.3 | 8.9% | 4 |
| fm.claire 1.7 | 6.7 | 8.3% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 4 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 24 / 35 | 5860 |
| 2 | 1 | 67.4 | 79.7 | 22 / 35 | 5250 |
| 3 | 1 | 70.0 | 88.9 | 26 / 35 | 5759 |
| 4 | 1 | 70.2 | 88.3 | 22 / 35 | 5931 |
| 5 | 1 | 70.1 | 86.0 | 27 / 35 | 6078 |
| 6 | 1 | 71.8 | 93.7 | 27 / 35 | 6202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 84% |
| oog.melee.CapuletDroid 1.1 | 43 | 98% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| sample.SpinBot 1.0 | 11 | 100% |
| gh.nano.Grofvuil 0.2 | 7 | 86% |
| fm.claire 1.7 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 37% | 81 |
| arthord.NanoSatanMelee Beta | 9 | 15% | 22 |
| gh.nano.Grofvuil 0.2 | 7 | 11% | 23 |
| oog.melee.CapuletDroid 1.1 | 6 | 10% | 44 |
| winamp32.micro.MicroMacro 1.0 | 6 | 10% | 12 |
| fm.claire 1.7 | 5 | 8% | 9 |
| sample.SpinBot 1.0 | 3 | 5% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 1 | 2% | 2 |

## Melee bench: F07

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 79.4 | 97 / 210 | 2.85 | 18.0% | 34934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.2 | 18.0% | 97 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 36 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.2% | 30 |
| mz.MicroGodMelee 1 | 4.0 | 12.2% | 30 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 9 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.6% | 3 |
| fire219.CatBot 1.0 | 8.0 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.3 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.7 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 17 / 35 | 5631 |
| 2 | 1 | 68.1 | 82.2 | 15 / 35 | 5749 |
| 3 | 2 | 62.7 | 64.4 | 10 / 35 | 5353 |
| 4 | 1 | 70.3 | 87.9 | 22 / 35 | 6379 |
| 5 | 1 | 68.6 | 83.2 | 20 / 35 | 5831 |
| 6 | 1 | 67.8 | 80.0 | 13 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 80% |
| mz.MicroGodMelee 1 | 39 | 64% |
| gh.micro.Gruweltje 0.7 | 22 | 68% |
| DBall.Anarchy 0.1 | 9 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 30 | 27% | 55 |
| mz.MicroGodMelee 1 | 29 | 26% | 54 |
| spinnercat.micro.Tyger 0.1 | 27 | 24% | 54 |
| acogdev.alpha 0.2 | 10 | 9% | 12 |
| fire219.CatBot 1.0 | 7 | 6% | 8 |
| DBall.Anarchy 0.1 | 4 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.5 | 107 / 210 | 3.57 | 16.7% | 31335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.7% | 107 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.1% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.8% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.0 | 10.5% | 10 |
| germ.TheMind .2 | 5.3 | 9.6% | 2 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.8% | 11 |
| awesomeness.Elite 1.0 | 7.0 | 8.2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 8.2% | 5 |
| sample.Crazy 1.0 | 9.0 | 6.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 61.3 | 17 / 35 | 4868 |
| 2 | 1 | 64.7 | 71.4 | 17 / 35 | 5135 |
| 3 | 1 | 66.5 | 76.5 | 20 / 35 | 5369 |
| 4 | 1 | 65.9 | 72.4 | 20 / 35 | 5277 |
| 5 | 1 | 63.8 | 69.2 | 13 / 35 | 4951 |
| 6 | 1 | 67.5 | 78.1 | 20 / 35 | 5735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 80% |
| qualidafial.MajorDick 1.0.1 | 12 | 100% |
| germ.TheMind .2 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| awesomeness.Elite 1.0 | 2 | 50% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 44% | 100 |
| germ.TheMind .2 | 16 | 16% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 15% | 30 |
| awesomeness.Elite 1.0 | 9 | 9% | 16 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 4 | 4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.5 | 169 / 210 | 1.85 | 20.9% | 33970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.9% | 169 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.5 | 10.5% | 3 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 3 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.3% | 6 |
| stelo.PatternRobot 1.0 | 7.7 | 7.0% | 6 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 2 |
| ratosh.Wesco 1.4 | 8.2 | 7.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.4 | 26 / 35 | 5750 |
| 2 | 1 | 71.1 | 90.8 | 28 / 35 | 5394 |
| 3 | 1 | 72.0 | 91.4 | 29 / 35 | 5972 |
| 4 | 1 | 71.1 | 89.2 | 27 / 35 | 5591 |
| 5 | 1 | 72.5 | 94.6 | 29 / 35 | 5688 |
| 6 | 1 | 71.6 | 92.7 | 30 / 35 | 5575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 95% |
| nz.jdc.nano.GridFu 1.0 | 45 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| maribo.IotaCT 1.1 | 10 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 27% | 74 |
| nz.jdc.nano.GridFu 1.0 | 7 | 17% | 52 |
| timmit.nano.TimDog 0.33 | 7 | 17% | 17 |
| stelo.PatternRobot 1.0 | 6 | 15% | 11 |
| ratosh.Wesco 1.4 | 4 | 10% | 12 |
| maribo.IotaCT 1.1 | 2 | 5% | 21 |
| spinnercat.Omen 1.0 | 2 | 5% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 12 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 90.8 | 172 / 210 | 1.82 | 21.6% | 40216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.6% | 172 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.7% | 13 |
| baal.nano.N 1.42 | 3.0 | 11.2% | 11 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 5.8 | 8.7% | 2 |
| sanja.First 0.1 | 6.2 | 8.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.4% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.3% | 5 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.1 | 30 / 35 | 6759 |
| 2 | 1 | 72.6 | 96.5 | 30 / 35 | 7044 |
| 3 | 1 | 72.1 | 91.1 | 30 / 35 | 6873 |
| 4 | 1 | 72.5 | 93.0 | 29 / 35 | 6837 |
| 5 | 1 | 69.5 | 83.8 | 25 / 35 | 5967 |
| 6 | 1 | 71.2 | 89.5 | 28 / 35 | 6736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 35 | 94% |
| cvt.Firsty 1.0 | 32 | 97% |
| sanja.First 0.1 | 31 | 100% |
| baal.nano.N 1.42 | 31 | 84% |
| zyx.micro.Ant 1.1 | 19 | 95% |
| amk.Punbot.Punbot 0.01 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 11 | 29% | 35 |
| zyx.micro.Ant 1.1 | 7 | 18% | 37 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 50 |
| sample.RamFire 1.0 | 5 | 13% | 7 |
| cvt.Firsty 1.0 | 4 | 11% | 23 |
| sanja.First 0.1 | 3 | 8% | 31 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 10 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 4 |

## Melee bench: F11

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.3 | 90 / 210 | 3.31 | 16.7% | 33608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.7% | 90 |
| kc.micro.Figment 1.0 | 2.2 | 14.8% | 56 |
| cs.Wren 1.0 | 2.8 | 12.7% | 28 |
| mz.Cork 0.1 | 4.5 | 10.7% | 13 |
| js.PinBall 1.6 | 4.7 | 10.5% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 2 |
| evd.X1 0.01 | 6.7 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 8.5 | 6.3% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 15 / 35 | 6036 |
| 2 | 1 | 67.1 | 79.0 | 16 / 35 | 5929 |
| 3 | 1 | 62.7 | 67.9 | 8 / 35 | 5506 |
| 4 | 1 | 64.2 | 70.5 | 16 / 35 | 5469 |
| 5 | 1 | 66.1 | 77.5 | 17 / 35 | 5513 |
| 6 | 1 | 64.7 | 72.1 | 18 / 35 | 5155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 70% |
| cs.Wren 1.0 | 36 | 75% |
| js.PinBall 1.6 | 9 | 89% |
| mz.Cork 0.1 | 7 | 71% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 41 | 34% | 95 |
| cs.Wren 1.0 | 26 | 22% | 39 |
| evd.X1 0.01 | 15 | 13% | 15 |
| mz.Cork 0.1 | 11 | 9% | 18 |
| js.PinBall 1.6 | 10 | 8% | 20 |
| joe.ADinosaur 1.0 | 10 | 8% | 13 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.0 | 133 / 210 | 2.53 | 18.8% | 28993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 18.8% | 133 |
| myl.nano.Graviton 1.10 | 3.5 | 11.1% | 21 |
| ntc.Opposite 1.5 | 4.0 | 10.8% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.5% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.6% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 2 |
| disan.Chair 2.2.0 | 7.5 | 8.5% | 2 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.3 | 20 / 35 | 4736 |
| 2 | 1 | 69.7 | 88.3 | 25 / 35 | 5115 |
| 3 | 1 | 66.4 | 78.1 | 19 / 35 | 4497 |
| 4 | 1 | 69.0 | 84.1 | 27 / 35 | 5068 |
| 5 | 1 | 66.1 | 80.0 | 16 / 35 | 4563 |
| 6 | 1 | 69.3 | 86.0 | 26 / 35 | 5014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 41 | 83% |
| myl.nano.Graviton 1.10 | 28 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| ntc.Opposite 1.5 | 15 | 87% |
| pfvicm.Sobieski 7.2.3b | 14 | 93% |
| donjezza.Muncho 1.0 | 12 | 92% |
| disan.Chair 2.2.0 | 12 | 100% |
| DBall.NUKE 0.1 | 10 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 25% | 51 |
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 28 |
| myl.nano.Graviton 1.10 | 12 | 16% | 39 |
| ntc.Opposite 1.5 | 10 | 13% | 24 |
| disan.Chair 2.2.0 | 8 | 10% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 10% | 20 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| DBall.NUKE 0.1 | 0 | 0% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 6 |

## Melee bench: F13

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.2 | 77 / 210 | 3.41 | 15.9% | 27316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.3 | 15.9% | 77 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 36 |
| oog.melee.Capulet 1.2 | 3.5 | 13.1% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.4% | 22 |
| yagami.Tidus 0.11 | 4.7 | 11.6% | 18 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 67.3 | 9 / 35 | 4531 |
| 2 | 1 | 63.2 | 66.3 | 12 / 35 | 4661 |
| 3 | 2 | 63.6 | 71.7 | 11 / 35 | 4215 |
| 4 | 1 | 66.9 | 82.9 | 18 / 35 | 4520 |
| 5 | 1 | 66.0 | 77.1 | 14 / 35 | 4745 |
| 6 | 1 | 65.2 | 73.7 | 13 / 35 | 4644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 97% |
| yagami.Tidus 0.11 | 23 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| oog.melee.Capulet 1.2 | 20 | 45% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 2 | 50% |

Hadur died in 133 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 33% | 55 |
| yagami.Tidus 0.11 | 28 | 21% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 46 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 32 |
| stelo.MirrorNano 1.3 | 9 | 7% | 11 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| ejb.Polaris 1.0.1 | 5 | 4% | 13 |
| kurios.DOSexe .9a | 5 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.2 | 132 / 210 | 2.87 | 17.7% | 28171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 17.7% | 132 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 17 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 25 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 15 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 21 / 35 | 5003 |
| 2 | 1 | 69.9 | 92.4 | 31 / 35 | 4714 |
| 3 | 1 | 68.2 | 85.7 | 24 / 35 | 4839 |
| 4 | 1 | 63.9 | 70.8 | 18 / 35 | 4543 |
| 5 | 1 | 67.0 | 79.0 | 22 / 35 | 4809 |
| 6 | 1 | 63.0 | 68.6 | 16 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 96% |
| wee.Gem 1.8.4 | 38 | 95% |
| wompi.Quokka 1.6 | 18 | 94% |
| m3thos.Eva00 1.1 | 15 | 93% |
| ratosh.Nobo 0.21 | 14 | 86% |
| bayen.UbaMicro 1.4 | 5 | 40% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 18 | 23% | 30 |
| wompi.Quokka 1.6 | 12 | 15% | 24 |
| maribo.FollowFire 1 | 10 | 13% | 11 |
| bzdp.Pansy 2.1 | 9 | 11% | 52 |
| wee.Gem 1.8.4 | 8 | 10% | 46 |
| bayen.UbaMicro 1.4 | 8 | 10% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 12 |
| m3thos.Eva00 1.1 | 5 | 6% | 13 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 88.1 | 127 / 210 | 2.07 | 21.2% | 46171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.2% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 21 |
| ayk.WallHugger 1.0 | 4.5 | 9.4% | 3 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.3% | 3 |
| stuff.Vlad 0.1 | 6.2 | 8.1% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 86.3 | 21 / 35 | 7548 |
| 2 | 1 | 70.3 | 81.6 | 15 / 35 | 7273 |
| 3 | 1 | 72.3 | 88.3 | 18 / 35 | 7874 |
| 4 | 1 | 72.0 | 86.0 | 23 / 35 | 7586 |
| 5 | 1 | 74.4 | 95.6 | 27 / 35 | 8185 |
| 6 | 1 | 72.4 | 90.8 | 23 / 35 | 7705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 80% |
| mz.NanoGod 2.02 | 12 | 58% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 53% | 131 |
| mz.NanoGod 2.02 | 26 | 31% | 41 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 16 |
| ayk.WallHugger 1.0 | 4 | 5% | 11 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.6 | 100 / 210 | 3.46 | 16.6% | 29217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.6% | 100 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.1% | 21 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 11.8% | 21 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 25 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.3% | 8 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 6 |
| dl.BetterWalls 1.0 | 8.3 | 7.1% | 4 |
| ap.Frederick 1.1 | 8.8 | 6.7% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 74.6 | 17 / 35 | 5432 |
| 2 | 1 | 64.0 | 71.7 | 16 / 35 | 4610 |
| 3 | 1 | 64.5 | 72.7 | 15 / 35 | 4878 |
| 4 | 1 | 64.6 | 70.5 | 17 / 35 | 4789 |
| 5 | 1 | 62.7 | 65.7 | 18 / 35 | 4434 |
| 6 | 1 | 66.6 | 80.6 | 17 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 86% |
| dummy.micro.Sparrow 2.5 | 34 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 65% |
| bvh.micro.Freya 0.3 | 15 | 60% |
| stelo.MirrorMicro 1.0 | 9 | 89% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 21 | 19% | 19 |
| dummy.micro.Sparrow 2.5 | 19 | 17% | 45 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 16% | 35 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 41 |
| bvh.micro.Freya 0.3 | 15 | 14% | 24 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 22 |
| conscience.Electron 1.3g | 7 | 6% | 12 |
| dl.BetterWalls 1.0 | 7 | 6% | 11 |

## Melee bench: F17

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 83.7 | 136 / 210 | 2.47 | 20.7% | 41806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.7% | 136 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 26 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 16 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.2% | 10 |
| dsw.StaticD 1.0 | 5.5 | 8.6% | 7 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.2% | 6 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 5 |
| sample.Corners 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 82.5 | 23 / 35 | 6813 |
| 2 | 1 | 72.0 | 87.6 | 24 / 35 | 7263 |
| 3 | 1 | 70.4 | 82.9 | 21 / 35 | 6633 |
| 4 | 1 | 70.7 | 83.2 | 23 / 35 | 7161 |
| 5 | 1 | 73.8 | 93.0 | 29 / 35 | 7696 |
| 6 | 1 | 67.1 | 73.0 | 16 / 35 | 6240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 83% |
| sul.Lunar 1.1 | 41 | 98% |
| supersample.SuperBoxBot 1.0 | 24 | 96% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| dsw.StaticD 1.0 | 8 | 75% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 24% | 60 |
| supersample.SuperBoxBot 1.0 | 18 | 24% | 35 |
| dsw.StaticD 1.0 | 14 | 19% | 23 |
| sample.Corners 1.0 | 7 | 9% | 9 |
| sul.Lunar 1.1 | 6 | 8% | 50 |
| mme.NikeEnhanced 2.0 | 6 | 8% | 15 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.6 | 116 / 210 | 2.84 | 18.6% | 38616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 18.6% | 116 |
| radnor.DoctorBob 1.42 | 2.5 | 12.7% | 25 |
| mld.Wisdom 1.0 | 2.8 | 12.4% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 10.9% | 17 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 8 |
| amz.NanoClone 1.41 | 5.2 | 10.6% | 12 |
| sample.Walls 1.0 | 7.0 | 8.0% | 2 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.0 | 17 / 35 | 5944 |
| 2 | 1 | 65.9 | 73.3 | 14 / 35 | 5975 |
| 3 | 1 | 69.3 | 84.4 | 20 / 35 | 6599 |
| 4 | 1 | 67.4 | 76.5 | 19 / 35 | 6637 |
| 5 | 1 | 69.1 | 82.9 | 22 / 35 | 6416 |
| 6 | 1 | 70.6 | 86.3 | 24 / 35 | 7045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 87% |
| radnor.DoctorBob 1.42 | 35 | 74% |
| mld.Wisdom 1.0 | 21 | 71% |
| amz.NanoClone 1.41 | 16 | 88% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 28% | 46 |
| radnor.DoctorBob 1.42 | 19 | 20% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 17% | 53 |
| KiraNL.Chupacabra 0.4 | 15 | 16% | 23 |
| amz.NanoClone 1.41 | 11 | 12% | 23 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

