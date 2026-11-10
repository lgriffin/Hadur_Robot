# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.0 | 119 / 210 | 2.26 | 20.0% | 39463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 20.0% | 119 |
| mz.AntiGrav 1.0 | 3.0 | 13.8% | 15 |
| radnor.DoctorBob 1.42 | 3.0 | 14.3% | 31 |
| mld.Infinity 2.2 | 3.0 | 13.9% | 35 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 6 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 89.8 | 21 / 35 | 7177 |
| 2 | 1 | 71.2 | 89.5 | 20 / 35 | 6675 |
| 3 | 1 | 68.5 | 80.0 | 19 / 35 | 6084 |
| 4 | 1 | 69.8 | 82.2 | 20 / 35 | 6179 |
| 5 | 1 | 69.1 | 81.3 | 19 / 35 | 5915 |
| 6 | 1 | 72.6 | 93.3 | 20 / 35 | 7433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 52 | 96% |
| mld.Infinity 2.2 | 51 | 67% |
| radnor.DoctorBob 1.42 | 41 | 61% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1171. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 47% | 88 |
| mld.Infinity 2.2 | 22 | 24% | 17 |
| mz.AntiGrav 1.0 | 11 | 12% | 61 |
| amz.NanoClone 1.41 | 6 | 7% | 15 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| arthord.MannyPacquiao Beta | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |

## Melee bench: F02

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.3 | 112 / 210 | 2.41 | 17.8% | 27821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.2 | 17.8% | 112 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 59 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 12 |
| maribo.melee.BMV 0.1 | 4.7 | 9.9% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.3% | 15 |
| zyx.nano.Ant 1.1 | 6.7 | 8.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.5% | 7 |
| fullsail.SweetTea 1.1 | 7.8 | 6.6% | 1 |
| bzdp.BoxCar 2.0 | 8.2 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 86.3 | 16 / 35 | 4165 |
| 2 | 1 | 69.5 | 93.3 | 24 / 35 | 4804 |
| 3 | 1 | 67.6 | 87.0 | 20 / 35 | 4692 |
| 4 | 1 | 69.6 | 92.1 | 27 / 35 | 4805 |
| 5 | 1 | 66.7 | 83.5 | 16 / 35 | 4806 |
| 6 | 2 | 61.9 | 63.8 | 9 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 63% |
| mld.DustBunny 3.8 | 46 | 93% |
| djdjdj.NanoSkunk10 1.0 | 13 | 54% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| maribo.melee.BMV 0.1 | 6 | 50% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 36% | 88 |
| djdjdj.NanoSkunk10 1.0 | 18 | 18% | 28 |
| mld.DustBunny 3.8 | 15 | 15% | 47 |
| zyx.nano.Ant 1.1 | 8 | 8% | 13 |
| maribo.melee.BMV 0.1 | 8 | 8% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 9 |
| fullsail.SweetTea 1.1 | 4 | 4% | 7 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.9 | 140 / 210 | 2.36 | 20.0% | 35974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 20.0% | 140 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.4% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 15 |
| fm.mammillarias 1.3 | 5.7 | 8.8% | 1 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.6% | 4 |
| sample.Fire 1.0 | 9.3 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 89.2 | 23 / 35 | 6572 |
| 2 | 1 | 69.9 | 82.2 | 22 / 35 | 6221 |
| 3 | 1 | 70.8 | 88.3 | 26 / 35 | 5887 |
| 4 | 1 | 71.5 | 92.7 | 27 / 35 | 5643 |
| 5 | 1 | 68.0 | 79.4 | 21 / 35 | 5690 |
| 6 | 1 | 68.2 | 77.5 | 21 / 35 | 5961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 94% |
| cb.nano.Insomnia 1.0 | 24 | 75% |
| myl.nano.KomoriNinja 1.1 | 23 | 96% |
| sp.Nanos.Ember 1.1 | 16 | 88% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 15 | 21% | 69 |
| cb.nano.Insomnia 1.0 | 15 | 21% | 16 |
| myl.nano.KomoriNinja 1.1 | 14 | 20% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 19% | 37 |
| sp.Nanos.Ember 1.1 | 6 | 9% | 23 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 9 |
| fm.mammillarias 1.3 | 3 | 4% | 4 |
| sample.Fire 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.6 | 143 / 210 | 2.03 | 20.3% | 36454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 20.3% | 143 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.1% | 20 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.6% | 16 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.3% | 0 |
| tj.zombie1n 1.0.1 | 5.7 | 8.8% | 8 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 5.8% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.7 | 20 / 35 | 5989 |
| 2 | 1 | 69.3 | 86.3 | 21 / 35 | 5768 |
| 3 | 1 | 70.4 | 87.3 | 26 / 35 | 6323 |
| 4 | 1 | 70.5 | 91.1 | 24 / 35 | 6124 |
| 5 | 1 | 71.7 | 94.3 | 29 / 35 | 5984 |
| 6 | 1 | 69.7 | 85.7 | 23 / 35 | 6266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 83% |
| stelo.SoJNanoMelee 1.1 | 37 | 76% |
| tvv.micro.Antares 1.1.1 | 25 | 76% |
| tj.zombie1n 1.0.1 | 18 | 78% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 79% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 37% | 86 |
| stelo.SoJNanoMelee 1.1 | 15 | 22% | 36 |
| tvv.micro.Antares 1.1.1 | 14 | 21% | 35 |
| tj.zombie1n 1.0.1 | 8 | 12% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |
| yk.JahMicro 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 66.0 | 82 / 210 | 4.06 | 15.0% | 27348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 15.0% | 82 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 29 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.2% | 25 |
| sam.Samspin 1.0 | 5.0 | 10.5% | 17 |
| EBBU.Sim2 1.02 | 6.0 | 9.8% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 8.3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 67.6 | 13 / 35 | 4688 |
| 2 | 1 | 62.4 | 66.0 | 15 / 35 | 4858 |
| 3 | 1 | 61.6 | 67.3 | 13 / 35 | 4019 |
| 4 | 1 | 63.2 | 69.5 | 14 / 35 | 4654 |
| 5 | 1 | 61.4 | 63.5 | 13 / 35 | 4569 |
| 6 | 1 | 61.1 | 61.9 | 14 / 35 | 4560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 84% |
| oog.melee.Corsair 1.0 | 30 | 73% |
| ahf.NanoAndrew .4 | 18 | 61% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 17% | 50 |
| ahf.NanoAndrew .4 | 22 | 17% | 33 |
| oog.melee.Corsair 1.0 | 20 | 16% | 45 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 14% | 18 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 19 |
| EBBU.Sim2 1.02 | 11 | 9% | 17 |
| robar.nano.Assertive_Melee 0.2 | 9 | 7% | 12 |
| sam.Samspin 1.0 | 8 | 6% | 11 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.9 | 129 / 210 | 2.54 | 18.1% | 28739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 18.1% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 23 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.5% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.1% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 13 |
| fm.claire 1.7 | 6.0 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.0% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.3% | 2 |
| pa.Improved 1.0 | 9.2 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.0 | 19 / 35 | 4597 |
| 2 | 1 | 68.6 | 87.3 | 23 / 35 | 5054 |
| 3 | 1 | 65.1 | 75.2 | 20 / 35 | 4412 |
| 4 | 1 | 67.4 | 84.4 | 22 / 35 | 4553 |
| 5 | 1 | 66.1 | 76.8 | 20 / 35 | 4910 |
| 6 | 1 | 69.9 | 92.4 | 25 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 96% |
| oog.melee.CapuletDroid 1.1 | 40 | 83% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| winamp32.micro.MicroMacro 1.0 | 8 | 75% |
| arthord.NanoSatanMelee Beta | 8 | 100% |
| sample.SpinBot 1.0 | 7 | 100% |
| fm.claire 1.7 | 6 | 83% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 20 | 24% | 27 |
| d414.nano.Quantum 1.0.0 | 16 | 20% | 67 |
| gh.nano.Grofvuil 0.2 | 15 | 18% | 44 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 19 |
| fm.claire 1.7 | 7 | 9% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 17 |
| sample.SpinBot 1.0 | 4 | 5% | 11 |
| kurios.DOSexe .9b | 3 | 4% | 10 |
| pa.Improved 1.0 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.1 | 80 / 210 | 2.80 | 17.3% | 31225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.3 | 17.3% | 80 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.2% | 44 |
| mz.MicroGodMelee 1 | 3.3 | 13.6% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.2% | 24 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 15 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.4% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.7% | 2 |
| acogdev.alpha 0.2 | 8.2 | 6.4% | 3 |
| fire219.CatBot 1.0 | 8.8 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 79.0 | 14 / 35 | 5093 |
| 2 | 1 | 68.0 | 83.8 | 17 / 35 | 5409 |
| 3 | 1 | 68.3 | 84.8 | 14 / 35 | 5667 |
| 4 | 2 | 64.1 | 70.5 | 11 / 35 | 5285 |
| 5 | 2 | 63.3 | 74.6 | 10 / 35 | 4570 |
| 6 | 1 | 67.9 | 87.6 | 14 / 35 | 5201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 43 | 88% |
| mz.MicroGodMelee 1 | 40 | 35% |
| gh.micro.Gruweltje 0.7 | 33 | 30% |
| DBall.Anarchy 0.1 | 15 | 67% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 39 | 30% | 61 |
| mz.MicroGodMelee 1 | 38 | 29% | 54 |
| spinnercat.micro.Tyger 0.1 | 19 | 15% | 42 |
| DBall.Anarchy 0.1 | 10 | 8% | 19 |
| acogdev.alpha 0.2 | 9 | 7% | 9 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 9 |
| fire219.CatBot 1.0 | 6 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 8 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.8 | 114 / 210 | 3.00 | 17.4% | 31249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 17.4% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.6% | 26 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 3 |
| germ.TheMind .2 | 5.2 | 9.5% | 7 |
| awesomeness.Elite 1.0 | 6.2 | 8.4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 7.8% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.4% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.2 | 22 / 35 | 5508 |
| 2 | 1 | 61.7 | 68.6 | 11 / 35 | 4443 |
| 3 | 1 | 66.9 | 76.8 | 21 / 35 | 5450 |
| 4 | 1 | 67.6 | 83.2 | 21 / 35 | 4913 |
| 5 | 1 | 67.6 | 81.0 | 21 / 35 | 5495 |
| 6 | 1 | 66.3 | 75.2 | 18 / 35 | 5440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 77% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 43% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 30% | 52 |
| awesomeness.Elite 1.0 | 7 | 7% | 12 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| germ.TheMind .2 | 3 | 3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 8 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.4 | 149 / 210 | 2.14 | 19.4% | 28584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 19.4% | 149 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.7% | 21 |
| maribo.IotaCT 1.1 | 4.0 | 10.7% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.1% | 3 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 7.7% | 1 |
| stelo.PatternRobot 1.0 | 8.7 | 7.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.2 | 21 / 35 | 4954 |
| 2 | 1 | 69.8 | 87.0 | 23 / 35 | 4917 |
| 3 | 1 | 66.4 | 75.6 | 21 / 35 | 4528 |
| 4 | 1 | 70.2 | 91.1 | 28 / 35 | 4346 |
| 5 | 1 | 69.9 | 87.9 | 27 / 35 | 4753 |
| 6 | 1 | 71.3 | 93.3 | 29 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 97% |
| nz.jdc.nano.GridFu 1.0 | 39 | 82% |
| ratosh.Wesco 1.4 | 12 | 83% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| maribo.IotaCT 1.1 | 11 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 88% |
| spinnercat.Omen 1.0 | 8 | 88% |

Hadur died in 61 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 18 | 30% | 56 |
| rz.HawkOnFire 0.1 | 8 | 13% | 58 |
| timmit.nano.TimDog 0.33 | 7 | 11% | 22 |
| maribo.IotaCT 1.1 | 7 | 11% | 21 |
| stelo.PatternRobot 1.0 | 7 | 11% | 13 |
| ratosh.Wesco 1.4 | 6 | 10% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 13 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.7 | 161 / 210 | 1.93 | 20.5% | 35663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 20.5% | 161 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.6% | 23 |
| baal.nano.N 1.42 | 3.2 | 11.1% | 8 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.7% | 0 |
| zyx.micro.Ant 1.1 | 5.2 | 9.4% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.1% | 0 |
| sanja.First 0.1 | 7.2 | 7.9% | 1 |
| cvt.Firsty 1.0 | 7.3 | 7.9% | 6 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 31 / 35 | 5926 |
| 2 | 1 | 70.8 | 89.5 | 28 / 35 | 6434 |
| 3 | 1 | 67.5 | 83.8 | 20 / 35 | 5378 |
| 4 | 1 | 70.0 | 89.2 | 25 / 35 | 6097 |
| 5 | 1 | 71.0 | 92.4 | 28 / 35 | 6035 |
| 6 | 1 | 70.5 | 89.5 | 29 / 35 | 5793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 86% |
| cvt.Firsty 1.0 | 34 | 97% |
| baal.nano.N 1.42 | 26 | 92% |
| amk.Punbot.Punbot 0.01 | 21 | 95% |
| sanja.First 0.1 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| zyx.micro.Ant 1.1 | 13 | 85% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 34% | 40 |
| tvv.nano.Polaris 1.2 | 15 | 30% | 62 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 23 |
| sample.RamFire 1.0 | 4 | 8% | 5 |
| baal.nano.N 1.42 | 3 | 6% | 16 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 6 |
| cvt.Firsty 1.0 | 2 | 4% | 29 |
| sanja.First 0.1 | 1 | 2% | 20 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 66.6 | 54 / 210 | 4.01 | 14.6% | 29342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.6% | 92 |
| hadur117.micro.SaorG2V 0.1 | 1.8 | 14.6% | 54 |
| cs.Wren 1.0 | 3.0 | 13.0% | 24 |
| js.PinBall 1.6 | 4.0 | 11.4% | 17 |
| mz.Cork 0.1 | 4.8 | 10.9% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 3 |
| evd.X1 0.01 | 7.0 | 8.4% | 5 |
| jsal.Jsalbot 1.0 | 8.3 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 61.6 | 8 / 35 | 4725 |
| 2 | 1 | 65.3 | 73.7 | 11 / 35 | 5620 |
| 3 | 2 | 61.7 | 65.4 | 10 / 35 | 4862 |
| 4 | 1 | 61.9 | 67.6 | 9 / 35 | 4840 |
| 5 | 2 | 62.5 | 69.8 | 8 / 35 | 4890 |
| 6 | 3 | 59.2 | 61.3 | 8 / 35 | 4405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 24% |
| cs.Wren 1.0 | 20 | 100% |
| js.PinBall 1.6 | 12 | 42% |
| mz.Cork 0.1 | 8 | 88% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 78 | 50% | 96 |
| evd.X1 0.01 | 18 | 12% | 19 |
| joe.ADinosaur 1.0 | 16 | 10% | 19 |
| cs.Wren 1.0 | 13 | 8% | 26 |
| js.PinBall 1.6 | 13 | 8% | 19 |
| mz.Cork 0.1 | 9 | 6% | 15 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.1 | 119 / 210 | 2.88 | 17.7% | 27357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 17.7% | 119 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 24 |
| ntc.Opposite 1.5 | 3.2 | 11.1% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 11.0% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.4% | 19 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.0% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 10 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 14 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 24 / 35 | 4932 |
| 2 | 1 | 64.3 | 72.7 | 18 / 35 | 4383 |
| 3 | 1 | 66.6 | 81.6 | 19 / 35 | 4327 |
| 4 | 1 | 66.6 | 79.4 | 19 / 35 | 4781 |
| 5 | 1 | 65.3 | 77.1 | 17 / 35 | 4455 |
| 6 | 1 | 67.0 | 82.2 | 22 / 35 | 4479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 81% |
| myl.nano.Graviton 1.10 | 31 | 90% |
| ntc.Opposite 1.5 | 16 | 100% |
| disan.Chair 2.2.0 | 15 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 85% |
| donjezza.Muncho 1.0 | 11 | 64% |
| DBall.NUKE 0.1 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 91 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 18 | 20% | 24 |
| stelo.AreaTargetingBot 1.1 | 17 | 19% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 16% | 25 |
| ntc.Opposite 1.5 | 13 | 14% | 28 |
| myl.nano.Graviton 1.10 | 11 | 12% | 34 |
| disan.Chair 2.2.0 | 6 | 7% | 17 |
| DBall.NUKE 0.1 | 5 | 5% | 17 |
| donjezza.Muncho 1.0 | 4 | 4% | 9 |
| pbg.R2D2 1.0 | 2 | 2% | 12 |

## Melee bench: F13

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 69.0 | 70 / 210 | 3.79 | 14.8% | 24180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.7 | 14.8% | 70 |
| oog.melee.Capulet 1.2 | 1.7 | 14.4% | 51 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 37 |
| yagami.Tidus 0.11 | 4.2 | 12.1% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 12.1% | 23 |
| ejb.Polaris 1.0.1 | 5.8 | 11.2% | 14 |
| stelo.MirrorNano 1.3 | 7.3 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 64.4 | 12 / 35 | 3957 |
| 2 | 1 | 64.4 | 71.7 | 13 / 35 | 4529 |
| 3 | 2 | 62.0 | 68.3 | 11 / 35 | 3564 |
| 4 | 2 | 63.9 | 74.6 | 12 / 35 | 3967 |
| 5 | 1 | 62.4 | 66.7 | 9 / 35 | 4225 |
| 6 | 2 | 62.7 | 68.6 | 13 / 35 | 3938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 50% |
| kawigi.micro.Shiz 1.1 | 22 | 91% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 67% |
| yagami.Tidus 0.11 | 12 | 83% |
| ejb.Polaris 1.0.1 | 7 | 43% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 61 | 44% | 81 |
| ejb.Polaris 1.0.1 | 19 | 14% | 29 |
| yagami.Tidus 0.11 | 17 | 12% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 11% | 32 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 25 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.6 | 121 / 210 | 3.02 | 16.9% | 25828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 16.9% | 121 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 23 |
| wee.Gem 1.8.4 | 3.0 | 12.3% | 31 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 7 |
| wompi.Quokka 1.6 | 4.3 | 11.1% | 17 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 7.2 | 8.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 7.5 | 7.7% | 3 |
| maribo.FollowFire 1 | 9.5 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.4 | 21 / 35 | 4445 |
| 2 | 1 | 64.8 | 73.3 | 19 / 35 | 4482 |
| 3 | 1 | 65.7 | 75.6 | 21 / 35 | 4547 |
| 4 | 1 | 66.3 | 82.5 | 22 / 35 | 4068 |
| 5 | 1 | 63.3 | 73.3 | 18 / 35 | 3819 |
| 6 | 1 | 66.5 | 81.3 | 20 / 35 | 4467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 94% |
| wee.Gem 1.8.4 | 45 | 78% |
| wompi.Quokka 1.6 | 17 | 65% |
| m3thos.Eva00 1.1 | 14 | 100% |
| ratosh.Nobo 0.21 | 12 | 92% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 23 | 25% | 56 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 12% | 12 |
| wompi.Quokka 1.6 | 10 | 11% | 20 |
| maribo.FollowFire 1 | 10 | 11% | 9 |
| bzdp.Pansy 2.1 | 9 | 10% | 53 |
| ratosh.Nobo 0.21 | 9 | 10% | 20 |
| bayen.UbaMicro 1.4 | 8 | 9% | 13 |
| m3thos.Eva00 1.1 | 6 | 7% | 17 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 80.4 | 56 / 210 | 2.76 | 18.2% | 40077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 19.9% | 129 |
| hadur117.micro.SaorG2V 0.1 | 2.0 | 18.2% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 17 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.9% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 6.2 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 79.4 | 10 / 35 | 6851 |
| 2 | 2 | 66.6 | 77.5 | 7 / 35 | 5639 |
| 3 | 2 | 70.5 | 85.1 | 11 / 35 | 7340 |
| 4 | 2 | 68.1 | 79.4 | 6 / 35 | 6430 |
| 5 | 2 | 69.7 | 80.3 | 11 / 35 | 7309 |
| 6 | 2 | 69.1 | 81.0 | 11 / 35 | 6508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 25% |
| mz.NanoGod 2.02 | 15 | 73% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| ayk.WallHugger 1.0 | 3 | 67% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 104 | 67% | 135 |
| mz.NanoGod 2.02 | 27 | 17% | 43 |
| ayk.WallHugger 1.0 | 10 | 6% | 11 |
| exauge.GateKeeper 1.1.121g | 8 | 5% | 11 |
| stelo.PianistNano 1.2 | 3 | 2% | 3 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.0 | 95 / 210 | 3.79 | 15.7% | 27064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 15.7% | 95 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.9% | 27 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.0% | 25 |
| bvh.micro.Freya 0.3 | 4.8 | 11.1% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 2 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 13 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 67.0 | 17 / 35 | 4544 |
| 2 | 1 | 64.8 | 74.0 | 20 / 35 | 4290 |
| 3 | 1 | 62.9 | 68.3 | 15 / 35 | 4378 |
| 4 | 1 | 62.3 | 66.7 | 13 / 35 | 4388 |
| 5 | 1 | 64.6 | 71.7 | 18 / 35 | 4815 |
| 6 | 1 | 62.4 | 66.7 | 12 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 94% |
| dummy.micro.Sparrow 2.5 | 31 | 90% |
| bvh.micro.Freya 0.3 | 16 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 71% |
| stelo.MirrorMicro 1.0 | 7 | 57% |
| ap.Frederick 1.1 | 7 | 71% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 21 | 18% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 15% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 16 |
| voidious.micro.BlitzBat 1.05 | 16 | 14% | 48 |
| dummy.micro.Sparrow 2.5 | 15 | 13% | 39 |
| bvh.micro.Freya 0.3 | 10 | 9% | 18 |
| dl.BetterWalls 1.0 | 9 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 20 |
| ap.Frederick 1.1 | 2 | 2% | 0 |

## Melee bench: F17

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 88.1 | 146 / 210 | 2.07 | 21.0% | 41524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 21.0% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 27 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 7 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.1% | 6 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 9 |
| dsw.StaticD 1.0 | 5.2 | 9.2% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 6 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.6% | 3 |
| sample.Corners 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 84.1 | 25 / 35 | 7611 |
| 2 | 1 | 71.9 | 90.8 | 24 / 35 | 7257 |
| 3 | 1 | 73.4 | 94.6 | 29 / 35 | 7380 |
| 4 | 1 | 69.6 | 85.4 | 22 / 35 | 6283 |
| 5 | 1 | 70.1 | 84.8 | 21 / 35 | 6647 |
| 6 | 1 | 71.0 | 88.9 | 25 / 35 | 6346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 64 | 83% |
| sul.Lunar 1.1 | 47 | 100% |
| supersample.SuperBoxBot 1.0 | 25 | 96% |
| dsw.StaticD 1.0 | 10 | 50% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 21 | 32% | 78 |
| supersample.SuperBoxBot 1.0 | 17 | 26% | 32 |
| dsw.StaticD 1.0 | 12 | 18% | 22 |
| sul.Lunar 1.1 | 6 | 9% | 50 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 1 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorG2V 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.4 | 92 / 210 | 2.94 | 17.6% | 36209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2V 0.1 | 1.0 | 17.6% | 92 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 46 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.6% | 23 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.8% | 12 |
| amz.NanoClone 1.41 | 5.5 | 9.8% | 8 |
| sample.Walls 1.0 | 7.2 | 7.8% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 5 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.6 | 14 / 35 | 6335 |
| 2 | 1 | 68.6 | 83.2 | 18 / 35 | 6352 |
| 3 | 1 | 65.5 | 74.9 | 17 / 35 | 5589 |
| 4 | 1 | 65.6 | 72.4 | 15 / 35 | 6052 |
| 5 | 1 | 67.0 | 81.6 | 12 / 35 | 6045 |
| 6 | 1 | 66.4 | 77.8 | 16 / 35 | 5836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 93% |
| radnor.DoctorBob 1.42 | 37 | 59% |
| mld.Wisdom 1.0 | 22 | 27% |
| KiraNL.Chupacabra 0.4 | 11 | 55% |
| amz.NanoClone 1.41 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 71% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 30% | 58 |
| mld.Wisdom 1.0 | 30 | 25% | 39 |
| KiraNL.Chupacabra 0.4 | 23 | 19% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 9% | 49 |
| amz.NanoClone 1.41 | 8 | 7% | 14 |
| sample.Walls 1.0 | 6 | 5% | 12 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

