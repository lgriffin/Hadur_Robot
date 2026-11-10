# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 91.1 | 160 / 210 | 1.80 | 22.0% | 44287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.0% | 160 |
| mz.AntiGrav 1.0 | 2.7 | 13.7% | 10 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 21 |
| mld.Infinity 2.2 | 3.3 | 13.2% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 0 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 87.9 | 24 / 35 | 7379 |
| 2 | 1 | 72.6 | 90.8 | 29 / 35 | 7070 |
| 3 | 1 | 72.7 | 89.8 | 25 / 35 | 7521 |
| 4 | 1 | 72.3 | 87.6 | 23 / 35 | 7386 |
| 5 | 1 | 73.9 | 96.5 | 30 / 35 | 7395 |
| 6 | 1 | 73.5 | 93.7 | 29 / 35 | 7536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 60 | 98% |
| mld.Infinity 2.2 | 58 | 90% |
| radnor.DoctorBob 1.42 | 37 | 89% |
| amz.NanoClone 1.41 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 45% | 73 |
| mld.Infinity 2.2 | 12 | 24% | 23 |
| amz.NanoClone 1.41 | 5 | 10% | 14 |
| mz.AntiGrav 1.0 | 4 | 8% | 70 |
| sample.Walls 1.0 | 4 | 8% | 10 |
| GarmBox.Oranges 1.0 | 2 | 4% | 8 |
| jangs.ns51 1.0 | 0 | 0% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.3 | 142 / 210 | 2.23 | 18.9% | 30145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.9% | 142 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 40 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 13 |
| maribo.melee.BMV 0.1 | 4.7 | 10.0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 4.8 | 9.4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.9% | 6 |
| zyx.nano.Ant 1.1 | 7.5 | 7.4% | 0 |
| bzdp.BoxCar 2.0 | 7.8 | 6.8% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 95.9 | 28 / 35 | 4983 |
| 2 | 1 | 69.4 | 91.7 | 27 / 35 | 4692 |
| 3 | 1 | 69.2 | 87.9 | 23 / 35 | 5363 |
| 4 | 1 | 69.3 | 89.8 | 24 / 35 | 5246 |
| 5 | 1 | 69.1 | 89.5 | 24 / 35 | 4887 |
| 6 | 1 | 63.6 | 63.2 | 16 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 81% |
| mld.DustBunny 3.8 | 56 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| djdjdj.NanoSkunk10 1.0 | 10 | 90% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 35% | 80 |
| mld.DustBunny 3.8 | 14 | 21% | 61 |
| cs.Grudge 1.0 | 9 | 13% | 11 |
| maribo.melee.BMV 0.1 | 7 | 10% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 6% | 17 |
| zyx.nano.Ant 1.1 | 3 | 4% | 3 |
| fullsail.SweetTea 1.1 | 2 | 3% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.7 | 150 / 210 | 2.29 | 20.4% | 36822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.4% | 150 |
| myl.micro.Troodon 1.10 | 2.3 | 13.1% | 26 |
| myl.nano.KomoriNinja 1.1 | 2.7 | 12.3% | 11 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.2% | 8 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.6% | 8 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 3 |
| sample.Fire 1.0 | 9.0 | 5.2% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 86.7 | 27 / 35 | 5987 |
| 2 | 1 | 70.9 | 86.7 | 24 / 35 | 6250 |
| 3 | 1 | 70.3 | 84.8 | 25 / 35 | 6361 |
| 4 | 1 | 69.5 | 80.6 | 23 / 35 | 6319 |
| 5 | 1 | 72.0 | 92.4 | 27 / 35 | 6299 |
| 6 | 1 | 69.1 | 83.2 | 24 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 40 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 95% |
| cb.nano.Insomnia 1.0 | 28 | 96% |
| myl.nano.KomoriNinja 1.1 | 21 | 95% |
| sp.Nanos.Ember 1.1 | 17 | 94% |
| fm.mammillarias 1.3 | 8 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 13 | 21% | 58 |
| fm.mammillarias 1.3 | 11 | 18% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 16% | 31 |
| myl.nano.KomoriNinja 1.1 | 9 | 15% | 50 |
| cb.nano.Insomnia 1.0 | 8 | 13% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 7% | 23 |
| cs.sheldor.Talon 1.1 | 4 | 7% | 11 |
| sample.Fire 1.0 | 2 | 3% | 8 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.7 | 159 / 210 | 2.01 | 21.1% | 39703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.1% | 159 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.6% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.4% | 8 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.6% | 13 |
| tj.zombie1n 1.0.1 | 5.3 | 9.4% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.9% | 1 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 81.3 | 24 / 35 | 6875 |
| 2 | 1 | 70.4 | 89.5 | 24 / 35 | 6152 |
| 3 | 1 | 72.6 | 94.3 | 32 / 35 | 6499 |
| 4 | 1 | 71.2 | 87.6 | 25 / 35 | 7076 |
| 5 | 1 | 70.6 | 87.6 | 27 / 35 | 6091 |
| 6 | 1 | 72.1 | 92.1 | 27 / 35 | 7010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 88% |
| stelo.SoJNanoMelee 1.1 | 52 | 92% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 16 | 75% |
| yk.JahMicro 1.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 80% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 42% | 82 |
| stelo.SoJNanoMelee 1.1 | 9 | 17% | 36 |
| tj.zombie1n 1.0.1 | 6 | 12% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 10% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 7 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 28 |
| repositorio.NanoStep 1.0 | 2 | 4% | 15 |
| yk.JahMicro 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.1 | 110 / 210 | 3.51 | 16.5% | 29952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.5% | 110 |
| oog.melee.Corsair 1.0 | 2.3 | 12.3% | 34 |
| ahf.NanoAndrew .4 | 3.0 | 11.3% | 19 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.4% | 9 |
| EBBU.Sim2 1.02 | 5.7 | 9.7% | 7 |
| sam.Samspin 1.0 | 5.7 | 9.7% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.6 | 22 / 35 | 5502 |
| 2 | 1 | 61.0 | 62.5 | 14 / 35 | 4468 |
| 3 | 1 | 66.3 | 75.9 | 19 / 35 | 5502 |
| 4 | 1 | 65.1 | 76.2 | 22 / 35 | 4473 |
| 5 | 1 | 61.9 | 64.4 | 14 / 35 | 4973 |
| 6 | 1 | 64.6 | 72.7 | 19 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 95% |
| oog.melee.Corsair 1.0 | 25 | 52% |
| ahf.NanoAndrew .4 | 22 | 86% |
| sam.Samspin 1.0 | 14 | 93% |
| EBBU.Sim2 1.02 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 19 | 19% | 39 |
| simonton.nano.MeleeSeed 1.8 | 17 | 17% | 45 |
| robar.nano.Assertive_Melee 0.2 | 16 | 16% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 14% | 13 |
| zyx.nano.BacillusComma 1.0 | 10 | 10% | 13 |
| sam.Samspin 1.0 | 9 | 9% | 21 |
| EBBU.Sim2 1.02 | 7 | 7% | 16 |
| ahf.NanoAndrew .4 | 6 | 6% | 35 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.9 | 152 / 210 | 2.09 | 19.8% | 33054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 152 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 21 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.3% | 6 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 6 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.0% | 4 |
| fm.claire 1.7 | 6.5 | 8.3% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.3% | 8 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 23 / 35 | 5467 |
| 2 | 1 | 69.7 | 87.3 | 28 / 35 | 5407 |
| 3 | 1 | 70.2 | 89.5 | 25 / 35 | 5650 |
| 4 | 1 | 71.5 | 95.6 | 30 / 35 | 5644 |
| 5 | 1 | 67.0 | 81.0 | 21 / 35 | 5042 |
| 6 | 1 | 70.3 | 89.8 | 25 / 35 | 5844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 93% |
| oog.melee.CapuletDroid 1.1 | 44 | 89% |
| gh.nano.Grofvuil 0.2 | 20 | 95% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| sample.SpinBot 1.0 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 59 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 22% | 70 |
| oog.melee.CapuletDroid 1.1 | 13 | 22% | 24 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 45 |
| arthord.NanoSatanMelee Beta | 9 | 15% | 25 |
| kurios.DOSexe .9b | 5 | 8% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 11 |
| fm.claire 1.7 | 3 | 5% | 9 |
| sample.SpinBot 1.0 | 3 | 5% | 7 |
| pa.Improved 1.0 | 1 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.1 | 97 / 210 | 2.52 | 18.4% | 34532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.4% | 97 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.3% | 47 |
| mz.MicroGodMelee 1 | 3.3 | 13.3% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.8% | 13 |
| DBall.Anarchy 0.1 | 5.2 | 9.1% | 6 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 3 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.7% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.8% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.8 | 18 / 35 | 5918 |
| 2 | 1 | 67.8 | 81.6 | 15 / 35 | 5964 |
| 3 | 1 | 68.8 | 84.8 | 19 / 35 | 5869 |
| 4 | 1 | 68.9 | 86.3 | 18 / 35 | 5965 |
| 5 | 1 | 68.0 | 86.3 | 15 / 35 | 5290 |
| 6 | 1 | 65.8 | 74.6 | 12 / 35 | 5526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 54 | 39% |
| spinnercat.micro.Tyger 0.1 | 46 | 96% |
| gh.micro.Gruweltje 0.7 | 27 | 19% |
| DBall.Anarchy 0.1 | 12 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 47 | 41% | 71 |
| gh.micro.Gruweltje 0.7 | 35 | 30% | 53 |
| spinnercat.micro.Tyger 0.1 | 17 | 15% | 51 |
| acogdev.alpha 0.2 | 5 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.6 | 109 / 210 | 3.55 | 16.4% | 30585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.4% | 109 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.3% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 32 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 7 |
| germ.TheMind .2 | 5.2 | 9.1% | 4 |
| awesomeness.Elite 1.0 | 6.2 | 8.6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.8 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 67.3 | 17 / 35 | 4862 |
| 2 | 1 | 64.0 | 67.6 | 18 / 35 | 5059 |
| 3 | 1 | 65.1 | 70.8 | 18 / 35 | 5459 |
| 4 | 1 | 68.7 | 85.1 | 23 / 35 | 5116 |
| 5 | 1 | 63.0 | 65.4 | 15 / 35 | 5161 |
| 6 | 1 | 64.5 | 73.7 | 18 / 35 | 4928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 89% |
| qualidafial.MajorDick 1.0.1 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |
| germ.TheMind .2 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 40% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 17% | 32 |
| awesomeness.Elite 1.0 | 14 | 14% | 18 |
| germ.TheMind .2 | 8 | 8% | 13 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 7 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.1 | 162 / 210 | 1.89 | 20.3% | 30539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.3% | 162 |
| rz.HawkOnFire 0.1 | 2.3 | 13.3% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.3% | 10 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.8% | 2 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.1% | 5 |
| spinnercat.Omen 1.0 | 7.3 | 7.5% | 0 |
| ratosh.Wesco 1.4 | 7.8 | 7.9% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 28 / 35 | 4916 |
| 2 | 1 | 71.5 | 92.4 | 30 / 35 | 4995 |
| 3 | 1 | 70.2 | 90.2 | 24 / 35 | 5133 |
| 4 | 1 | 71.4 | 90.8 | 29 / 35 | 5221 |
| 5 | 1 | 70.2 | 87.0 | 25 / 35 | 5379 |
| 6 | 1 | 70.4 | 89.8 | 26 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 94% |
| nz.jdc.nano.GridFu 1.0 | 46 | 91% |
| maribo.IotaCT 1.1 | 17 | 88% |
| stelo.PatternRobot 1.0 | 17 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 67% |

Hadur died in 48 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 23% | 48 |
| timmit.nano.TimDog 0.33 | 10 | 21% | 28 |
| nz.jdc.nano.GridFu 1.0 | 7 | 15% | 53 |
| ratosh.Wesco 1.4 | 7 | 15% | 15 |
| stelo.PatternRobot 1.0 | 6 | 13% | 14 |
| maribo.IotaCT 1.1 | 4 | 8% | 31 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 14 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.2 | 179 / 210 | 1.70 | 21.6% | 39191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.6% | 179 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.2% | 13 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 5.8 | 8.7% | 1 |
| zyx.micro.Ant 1.1 | 6.2 | 8.3% | 3 |
| sanja.First 0.1 | 6.3 | 8.4% | 3 |
| amk.Punbot.Punbot 0.01 | 7.0 | 8.1% | 3 |
| cvt.Firsty 1.0 | 9.0 | 6.9% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.3 | 31 / 35 | 6178 |
| 2 | 1 | 71.4 | 91.1 | 29 / 35 | 6540 |
| 3 | 1 | 71.6 | 93.0 | 28 / 35 | 6417 |
| 4 | 1 | 72.1 | 92.7 | 31 / 35 | 6807 |
| 5 | 1 | 72.3 | 94.3 | 31 / 35 | 6734 |
| 6 | 1 | 71.1 | 87.9 | 29 / 35 | 6515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 93% |
| baal.nano.N 1.42 | 37 | 92% |
| cvt.Firsty 1.0 | 28 | 100% |
| amk.Punbot.Punbot 0.01 | 22 | 95% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| sanja.First 0.1 | 17 | 94% |
| zyx.micro.Ant 1.1 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 6 | 19% | 65 |
| baal.nano.N 1.42 | 4 | 13% | 37 |
| squidM.TentalceMeleeNano 1.1 | 4 | 13% | 14 |
| amk.Punbot.Punbot 0.01 | 4 | 13% | 6 |
| zyx.micro.Ant 1.1 | 3 | 9% | 27 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 19 |
| sanja.First 0.1 | 3 | 9% | 17 |
| cvt.Firsty 1.0 | 2 | 6% | 20 |
| sample.RamFire 1.0 | 2 | 6% | 5 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.6 | 74 / 210 | 3.74 | 15.5% | 31049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 15.5% | 74 |
| kc.micro.Figment 1.0 | 1.7 | 14.8% | 72 |
| cs.Wren 1.0 | 2.8 | 12.5% | 25 |
| mz.Cork 0.1 | 4.5 | 11.1% | 14 |
| js.PinBall 1.6 | 4.5 | 11.0% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 2 |
| evd.X1 0.01 | 7.0 | 8.3% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 72.4 | 10 / 35 | 5200 |
| 2 | 2 | 61.5 | 65.4 | 10 / 35 | 4774 |
| 3 | 1 | 63.8 | 67.9 | 18 / 35 | 5320 |
| 4 | 1 | 61.0 | 63.8 | 10 / 35 | 5121 |
| 5 | 1 | 66.6 | 79.4 | 14 / 35 | 5567 |
| 6 | 2 | 62.8 | 68.6 | 12 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 44% |
| cs.Wren 1.0 | 25 | 88% |
| mz.Cork 0.1 | 12 | 58% |
| js.PinBall 1.6 | 9 | 67% |
| jsal.Jsalbot 1.0 | 3 | 33% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 69 | 50% | 107 |
| mz.Cork 0.1 | 15 | 11% | 20 |
| cs.Wren 1.0 | 12 | 9% | 27 |
| joe.ADinosaur 1.0 | 12 | 9% | 16 |
| js.PinBall 1.6 | 10 | 7% | 17 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| evd.X1 0.01 | 5 | 4% | 7 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.1 | 151 / 210 | 2.16 | 19.7% | 29650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.7% | 151 |
| myl.nano.Graviton 1.10 | 3.2 | 11.1% | 16 |
| ntc.Opposite 1.5 | 3.2 | 10.8% | 4 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 10.8% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.0% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.3% | 3 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 7 |
| DBall.NUKE 0.1 | 7.7 | 8.2% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.6 | 21 / 35 | 5081 |
| 2 | 1 | 67.6 | 84.4 | 22 / 35 | 4562 |
| 3 | 1 | 68.8 | 86.7 | 25 / 35 | 4755 |
| 4 | 1 | 69.6 | 88.9 | 27 / 35 | 5138 |
| 5 | 1 | 71.1 | 93.3 | 28 / 35 | 5271 |
| 6 | 1 | 69.8 | 88.6 | 28 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 43 | 81% |
| myl.nano.Graviton 1.10 | 37 | 92% |
| ntc.Opposite 1.5 | 20 | 90% |
| DBall.NUKE 0.1 | 19 | 100% |
| disan.Chair 2.2.0 | 17 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 15 | 25% | 39 |
| pfvicm.Sobieski 7.2.3b | 11 | 18% | 18 |
| myl.nano.Graviton 1.10 | 10 | 17% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 17% | 21 |
| ntc.Opposite 1.5 | 7 | 12% | 23 |
| disan.Chair 2.2.0 | 3 | 5% | 23 |
| DBall.NUKE 0.1 | 2 | 3% | 22 |
| donjezza.Muncho 1.0 | 1 | 2% | 11 |
| pbg.R2D2 1.0 | 1 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.5 | 99 / 210 | 3.39 | 16.4% | 27254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 16.4% | 99 |
| oog.melee.Capulet 1.2 | 2.7 | 13.6% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 23 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.6% | 41 |
| ejb.Polaris 1.0.1 | 5.5 | 10.7% | 4 |
| yagami.Tidus 0.11 | 5.5 | 11.0% | 5 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 63.5 | 14 / 35 | 4227 |
| 2 | 1 | 65.5 | 73.3 | 17 / 35 | 4552 |
| 3 | 1 | 67.7 | 76.8 | 20 / 35 | 4862 |
| 4 | 1 | 65.3 | 74.3 | 15 / 35 | 4489 |
| 5 | 1 | 65.1 | 74.0 | 16 / 35 | 4389 |
| 6 | 1 | 66.8 | 79.0 | 17 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 85% |
| kawigi.micro.Shiz 1.1 | 31 | 87% |
| yagami.Tidus 0.11 | 17 | 100% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 45% | 72 |
| kawigi.micro.Shiz 1.1 | 17 | 15% | 38 |
| yagami.Tidus 0.11 | 14 | 13% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 9% | 39 |
| ejb.Polaris 1.0.1 | 8 | 7% | 17 |
| stelo.MirrorNano 1.3 | 6 | 5% | 8 |
| step.nanoPri 1.0 | 3 | 3% | 4 |
| kurios.DOSexe .9a | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.7 | 146 / 210 | 2.47 | 18.4% | 28114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.4% | 146 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 17 |
| wompi.Quokka 1.6 | 3.3 | 11.7% | 10 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 18 |
| ratosh.Nobo 0.21 | 4.7 | 11.0% | 5 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 9 |
| bayen.UbaMicro 1.4 | 7.2 | 7.9% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 25 / 35 | 4655 |
| 2 | 1 | 67.8 | 83.2 | 26 / 35 | 4557 |
| 3 | 1 | 66.6 | 81.3 | 21 / 35 | 4533 |
| 4 | 1 | 69.9 | 89.5 | 29 / 35 | 5135 |
| 5 | 1 | 68.2 | 87.0 | 25 / 35 | 4819 |
| 6 | 1 | 65.5 | 77.8 | 20 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 93% |
| wee.Gem 1.8.4 | 51 | 90% |
| wompi.Quokka 1.6 | 23 | 96% |
| ratosh.Nobo 0.21 | 15 | 100% |
| m3thos.Eva00 1.1 | 6 | 83% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 12 | 18% | 58 |
| wompi.Quokka 1.6 | 10 | 15% | 24 |
| bzdp.Pansy 2.1 | 8 | 12% | 51 |
| ratosh.Nobo 0.21 | 8 | 12% | 21 |
| m3thos.Eva00 1.1 | 6 | 9% | 19 |
| bayen.UbaMicro 1.4 | 6 | 9% | 13 |
| stelo.MyAgileRobot 0.2 | 5 | 8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 8% | 7 |
| maribo.FollowFire 1 | 5 | 8% | 5 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 82.6 | 82 / 210 | 2.56 | 19.3% | 43091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 19.3% | 82 |
| wompi.Wallaby 5.1 | 1.5 | 19.0% | 110 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 11 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 5 |
| stuff.Vlad 0.1 | 5.8 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 81.6 | 14 / 35 | 7851 |
| 2 | 1 | 71.8 | 86.7 | 18 / 35 | 7488 |
| 3 | 2 | 69.6 | 83.2 | 12 / 35 | 6807 |
| 4 | 2 | 69.1 | 78.1 | 12 / 35 | 6820 |
| 5 | 1 | 70.1 | 83.5 | 16 / 35 | 6932 |
| 6 | 2 | 70.2 | 82.9 | 10 / 35 | 7193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 36% |
| mz.NanoGod 2.02 | 24 | 92% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| ayk.WallHugger 1.0 | 5 | 80% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 85 | 65% | 118 |
| mz.NanoGod 2.02 | 26 | 20% | 54 |
| exauge.GateKeeper 1.1.121g | 11 | 8% | 15 |
| stelo.PianistNano 1.2 | 4 | 3% | 5 |
| stuff.Vlad 0.1 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 2% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 9 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.4 | 113 / 210 | 3.39 | 16.7% | 28205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.7% | 113 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.7% | 14 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 27 |
| bvh.micro.Freya 0.3 | 4.2 | 10.9% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.1% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.6% | 10 |
| conscience.Electron 1.3g | 7.2 | 8.0% | 2 |
| dl.BetterWalls 1.0 | 8.2 | 6.7% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 75.6 | 18 / 35 | 4569 |
| 2 | 1 | 62.0 | 61.9 | 18 / 35 | 4523 |
| 3 | 1 | 65.8 | 76.5 | 21 / 35 | 4474 |
| 4 | 1 | 65.5 | 75.2 | 18 / 35 | 4960 |
| 5 | 1 | 64.8 | 74.0 | 17 / 35 | 4861 |
| 6 | 1 | 66.4 | 77.5 | 21 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 100% |
| dummy.micro.Sparrow 2.5 | 31 | 87% |
| bvh.micro.Freya 0.3 | 25 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 82% |
| stelo.MirrorMicro 1.0 | 6 | 50% |
| ap.Frederick 1.1 | 5 | 80% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 20% | 19 |
| conscience.Electron 1.3g | 16 | 16% | 21 |
| dummy.micro.Sparrow 2.5 | 14 | 14% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 12% | 34 |
| stelo.MirrorMicro 1.0 | 10 | 10% | 16 |
| dl.BetterWalls 1.0 | 10 | 10% | 15 |
| voidious.micro.BlitzBat 1.05 | 8 | 8% | 40 |
| bvh.micro.Freya 0.3 | 8 | 8% | 24 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.6 | 162 / 210 | 2.12 | 21.3% | 41881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.3% | 162 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.6% | 17 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.2% | 8 |
| dsw.StaticD 1.0 | 5.3 | 9.2% | 6 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 0 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.5% | 3 |
| sample.Corners 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 86.0 | 29 / 35 | 6780 |
| 2 | 1 | 72.4 | 90.2 | 27 / 35 | 7554 |
| 3 | 1 | 70.3 | 87.0 | 24 / 35 | 6355 |
| 4 | 1 | 71.1 | 85.4 | 28 / 35 | 6582 |
| 5 | 1 | 71.4 | 87.0 | 25 / 35 | 7211 |
| 6 | 1 | 72.7 | 89.8 | 29 / 35 | 7399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 92% |
| sul.Lunar 1.1 | 50 | 98% |
| supersample.SuperBoxBot 1.0 | 25 | 96% |
| dsw.StaticD 1.0 | 13 | 69% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 33% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 27% | 58 |
| dsw.StaticD 1.0 | 9 | 18% | 28 |
| mme.NikeEnhanced 2.0 | 5 | 10% | 14 |
| sul.Lunar 1.1 | 3 | 6% | 53 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |
| sample.Corners 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 78.6 | 121 / 210 | 2.92 | 18.4% | 37654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.4% | 121 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 26 |
| mld.Wisdom 1.0 | 3.3 | 12.0% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.2% | 13 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.3% | 12 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 10 |
| sample.Walls 1.0 | 7.3 | 8.1% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 7.4% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 76.5 | 21 / 35 | 6504 |
| 2 | 1 | 64.6 | 71.1 | 15 / 35 | 5394 |
| 3 | 1 | 67.8 | 76.8 | 17 / 35 | 6760 |
| 4 | 1 | 68.0 | 79.0 | 23 / 35 | 6082 |
| 5 | 1 | 69.0 | 84.1 | 22 / 35 | 6184 |
| 6 | 1 | 69.6 | 84.1 | 23 / 35 | 6730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 98% |
| radnor.DoctorBob 1.42 | 31 | 87% |
| mld.Wisdom 1.0 | 18 | 72% |
| amz.NanoClone 1.41 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| jangs.ns51 1.0 | 8 | 88% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 5 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 30% | 43 |
| radnor.DoctorBob 1.42 | 18 | 20% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 17% | 51 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 20 |
| amz.NanoClone 1.41 | 7 | 8% | 18 |
| sample.Walls 1.0 | 5 | 6% | 12 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 8 |

