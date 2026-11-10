# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 90.6 | 153 / 210 | 1.84 | 21.6% | 42121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.6% | 153 |
| mz.AntiGrav 1.0 | 2.3 | 14.3% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 15 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 15 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 7.0% | 0 |
| sample.Walls 1.0 | 7.0 | 6.6% | 3 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 1 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 94.0 | 26 / 35 | 7537 |
| 2 | 1 | 73.0 | 94.3 | 27 / 35 | 6781 |
| 3 | 1 | 71.3 | 87.9 | 26 / 35 | 6288 |
| 4 | 1 | 72.6 | 89.8 | 28 / 35 | 7259 |
| 5 | 1 | 72.4 | 90.8 | 24 / 35 | 7297 |
| 6 | 1 | 71.7 | 87.0 | 22 / 35 | 6959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 82 | 95% |
| mld.Infinity 2.2 | 35 | 100% |
| radnor.DoctorBob 1.42 | 33 | 88% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 0% |

Hadur died in 57 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 40% | 60 |
| mz.AntiGrav 1.0 | 14 | 25% | 81 |
| amz.NanoClone 1.41 | 8 | 14% | 14 |
| mld.Infinity 2.2 | 7 | 12% | 38 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| sample.Walls 1.0 | 2 | 4% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.5 | 145 / 210 | 2.03 | 19.2% | 30984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.2% | 145 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.9% | 43 |
| mld.DustBunny 3.8 | 3.0 | 12.8% | 10 |
| maribo.melee.BMV 0.1 | 3.8 | 10.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.7% | 3 |
| zyx.nano.Ant 1.1 | 5.8 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.3% | 7 |
| fullsail.SweetTea 1.1 | 8.3 | 5.6% | 1 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 23 / 35 | 4818 |
| 2 | 1 | 66.5 | 78.4 | 19 / 35 | 4752 |
| 3 | 1 | 68.4 | 88.9 | 23 / 35 | 5178 |
| 4 | 1 | 67.6 | 87.6 | 23 / 35 | 4378 |
| 5 | 1 | 71.2 | 95.2 | 30 / 35 | 5570 |
| 6 | 1 | 71.2 | 92.7 | 27 / 35 | 6288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 82 | 80% |
| mld.DustBunny 3.8 | 54 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 25 | 38% | 97 |
| mld.DustBunny 3.8 | 17 | 26% | 57 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 11% | 18 |
| zyx.nano.Ant 1.1 | 5 | 8% | 6 |
| maribo.melee.BMV 0.1 | 3 | 5% | 10 |
| fullsail.SweetTea 1.1 | 3 | 5% | 4 |
| cs.Grudge 1.0 | 3 | 5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 13 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.5 | 129 / 210 | 2.66 | 19.1% | 33848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.1% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 12.2% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.3% | 26 |
| fm.mammillarias 1.3 | 5.3 | 9.3% | 3 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 8.5 | 6.2% | 1 |
| sample.Fire 1.0 | 9.0 | 5.3% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 80.6 | 21 / 35 | 6197 |
| 2 | 1 | 70.8 | 88.3 | 25 / 35 | 5773 |
| 3 | 1 | 70.3 | 86.0 | 22 / 35 | 6138 |
| 4 | 1 | 68.0 | 80.0 | 22 / 35 | 5048 |
| 5 | 1 | 68.9 | 81.0 | 24 / 35 | 5382 |
| 6 | 1 | 65.8 | 73.3 | 15 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 73% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| cb.nano.Insomnia 1.0 | 16 | 100% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 25% | 39 |
| myl.micro.Troodon 1.10 | 18 | 22% | 78 |
| fm.mammillarias 1.3 | 14 | 17% | 18 |
| cb.nano.Insomnia 1.0 | 13 | 16% | 17 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 37 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 6 |
| sample.Fire 1.0 | 1 | 1% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.4 | 148 / 210 | 2.40 | 20.0% | 37515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.0% | 148 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.0% | 13 |
| kawigi.nano.Lib 1.0 | 2.5 | 11.9% | 15 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.6% | 6 |
| yk.JahMicro 1.0 | 7.5 | 8.0% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 80.3 | 23 / 35 | 5978 |
| 2 | 1 | 69.9 | 87.0 | 25 / 35 | 6009 |
| 3 | 1 | 68.5 | 80.0 | 23 / 35 | 6103 |
| 4 | 1 | 71.4 | 90.5 | 26 / 35 | 6836 |
| 5 | 1 | 70.9 | 89.2 | 28 / 35 | 6325 |
| 6 | 1 | 68.5 | 79.7 | 23 / 35 | 6264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 89% |
| stelo.SoJNanoMelee 1.1 | 42 | 90% |
| tj.zombie1n 1.0.1 | 20 | 80% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| yk.JahMicro 1.0 | 11 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 32% | 66 |
| stelo.SoJNanoMelee 1.1 | 11 | 18% | 40 |
| tj.zombie1n 1.0.1 | 8 | 13% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 22 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 8 |
| yk.JahMicro 1.0 | 3 | 5% | 15 |
| sample.VelociRobot 1.0 | 3 | 5% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 11 |

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.2 | 82 / 210 | 3.95 | 15.5% | 28779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 15.5% | 82 |
| oog.melee.Corsair 1.0 | 2.0 | 13.3% | 47 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.6% | 31 |
| ahf.NanoAndrew .4 | 4.2 | 11.5% | 20 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.0% | 4 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.7% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 71.1 | 14 / 35 | 4718 |
| 2 | 1 | 60.2 | 60.0 | 12 / 35 | 4401 |
| 3 | 1 | 61.8 | 62.5 | 13 / 35 | 4834 |
| 4 | 1 | 63.5 | 67.0 | 18 / 35 | 4479 |
| 5 | 1 | 63.3 | 67.3 | 10 / 35 | 5365 |
| 6 | 1 | 65.4 | 75.2 | 15 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 58% |
| simonton.nano.MeleeSeed 1.8 | 31 | 81% |
| ahf.NanoAndrew .4 | 17 | 76% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| EBBU.Sim2 1.02 | 4 | 75% |
| sample.TrackFire 1.0 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 31% | 63 |
| oog.melee.Corsair 1.0 | 24 | 19% | 43 |
| ahf.NanoAndrew .4 | 16 | 13% | 29 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 21 |
| EBBU.Sim2 1.02 | 12 | 9% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| sam.Samspin 1.0 | 7 | 5% | 14 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 10 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.6 | 137 / 210 | 2.20 | 19.1% | 31052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.1% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.6% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 6 |
| fm.claire 1.7 | 6.0 | 8.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 4 |
| sample.SpinBot 1.0 | 8.5 | 6.2% | 1 |
| pa.Improved 1.0 | 8.8 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.3 | 25 / 35 | 5405 |
| 2 | 1 | 69.6 | 89.2 | 24 / 35 | 5667 |
| 3 | 1 | 69.0 | 89.8 | 25 / 35 | 4977 |
| 4 | 1 | 69.7 | 85.1 | 24 / 35 | 5691 |
| 5 | 1 | 67.0 | 85.1 | 20 / 35 | 4461 |
| 6 | 1 | 67.1 | 82.2 | 19 / 35 | 4851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 89 | 85% |
| oog.melee.CapuletDroid 1.1 | 24 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 78% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| fm.claire 1.7 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 38% | 91 |
| gh.nano.Grofvuil 0.2 | 18 | 25% | 38 |
| arthord.NanoSatanMelee Beta | 12 | 16% | 19 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 33 |
| kurios.DOSexe .9b | 4 | 5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 11 |
| sample.SpinBot 1.0 | 2 | 3% | 3 |
| pa.Improved 1.0 | 2 | 3% | 3 |
| fm.claire 1.7 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.5 | 113 / 210 | 2.85 | 18.1% | 34262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.1% | 113 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.9% | 39 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.2% | 29 |
| mz.MicroGodMelee 1 | 3.7 | 12.5% | 23 |
| DBall.Anarchy 0.1 | 5.5 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.2 | 6.6% | 0 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.5 | 18 / 35 | 5311 |
| 2 | 1 | 67.2 | 80.3 | 19 / 35 | 5306 |
| 3 | 1 | 69.4 | 82.2 | 22 / 35 | 6330 |
| 4 | 1 | 68.6 | 81.6 | 19 / 35 | 5982 |
| 5 | 1 | 68.1 | 82.5 | 20 / 35 | 5936 |
| 6 | 1 | 65.5 | 73.7 | 15 / 35 | 5397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 91% |
| gh.micro.Gruweltje 0.7 | 30 | 73% |
| mz.MicroGodMelee 1 | 28 | 71% |
| DBall.Anarchy 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 28 | 29% | 70 |
| gh.micro.Gruweltje 0.7 | 24 | 25% | 52 |
| mz.MicroGodMelee 1 | 24 | 25% | 48 |
| acogdev.alpha 0.2 | 8 | 8% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 9 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 8 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.5 | 114 / 210 | 3.30 | 17.0% | 30464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.3 | 17.0% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 30 |
| awesomeness.Elite 1.0 | 5.2 | 9.2% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.1% | 4 |
| germ.TheMind .2 | 5.3 | 9.5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.3% | 5 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.5% | 2 |
| sample.Crazy 1.0 | 8.7 | 6.7% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.5 | 23 / 35 | 5146 |
| 2 | 1 | 68.5 | 83.8 | 24 / 35 | 5546 |
| 3 | 2 | 61.7 | 61.0 | 14 / 35 | 4911 |
| 4 | 1 | 66.3 | 75.2 | 17 / 35 | 5428 |
| 5 | 2 | 62.4 | 66.3 | 13 / 35 | 4473 |
| 6 | 1 | 66.8 | 78.1 | 23 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 96% |
| germ.TheMind .2 | 7 | 57% |
| awesomeness.Elite 1.0 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 37 | 39% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 21% | 43 |
| germ.TheMind .2 | 13 | 14% | 20 |
| awesomeness.Elite 1.0 | 10 | 10% | 22 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.4 | 159 / 210 | 1.86 | 20.3% | 30061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.3% | 159 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 9 |
| maribo.IotaCT 1.1 | 4.5 | 10.1% | 2 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 5 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 6 |
| stelo.PatternRobot 1.0 | 7.5 | 7.8% | 3 |
| spinnercat.Omen 1.0 | 8.7 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.2 | 26 / 35 | 5124 |
| 2 | 1 | 69.5 | 86.7 | 21 / 35 | 4996 |
| 3 | 1 | 70.8 | 89.5 | 26 / 35 | 5161 |
| 4 | 1 | 71.0 | 93.0 | 28 / 35 | 4677 |
| 5 | 1 | 71.2 | 92.1 | 30 / 35 | 5008 |
| 6 | 1 | 71.2 | 92.1 | 28 / 35 | 5095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 95% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| timmit.nano.TimDog 0.33 | 20 | 75% |
| maribo.IotaCT 1.1 | 13 | 100% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| ratosh.Wesco 1.4 | 5 | 60% |

Hadur died in 51 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 24% | 72 |
| timmit.nano.TimDog 0.33 | 11 | 22% | 31 |
| nz.jdc.nano.GridFu 1.0 | 10 | 20% | 47 |
| stelo.PatternRobot 1.0 | 6 | 12% | 16 |
| ratosh.Wesco 1.4 | 5 | 10% | 10 |
| maribo.IotaCT 1.1 | 4 | 8% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.3 | 180 / 210 | 1.70 | 21.4% | 37985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.4% | 180 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.5% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 6 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.7% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.1% | 5 |
| sanja.First 0.1 | 6.2 | 8.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.6% | 1 |
| cvt.Firsty 1.0 | 7.5 | 7.9% | 5 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.6 | 32 / 35 | 6412 |
| 2 | 1 | 72.0 | 93.3 | 32 / 35 | 6433 |
| 3 | 1 | 71.9 | 93.0 | 28 / 35 | 6911 |
| 4 | 1 | 69.6 | 87.9 | 28 / 35 | 5504 |
| 5 | 1 | 71.1 | 90.8 | 29 / 35 | 6191 |
| 6 | 1 | 72.0 | 94.0 | 31 / 35 | 6534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 38 | 97% |
| cvt.Firsty 1.0 | 36 | 94% |
| tvv.nano.Polaris 1.2 | 33 | 97% |
| sanja.First 0.1 | 27 | 100% |
| zyx.micro.Ant 1.1 | 24 | 96% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 9 | 28% | 55 |
| Grystrion.TrackerWO 1.0 | 6 | 19% | 15 |
| baal.nano.N 1.42 | 3 | 9% | 34 |
| cvt.Firsty 1.0 | 3 | 9% | 32 |
| sample.RamFire 1.0 | 3 | 9% | 3 |
| zyx.micro.Ant 1.1 | 2 | 6% | 38 |
| sanja.First 0.1 | 2 | 6% | 21 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 67.0 | 87 / 210 | 3.97 | 15.3% | 29985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.8% | 58 |
| hadur117.micro.SaorWAP 0.1 | 1.5 | 15.3% | 87 |
| cs.Wren 1.0 | 3.7 | 12.1% | 16 |
| js.PinBall 1.6 | 4.0 | 11.6% | 21 |
| mz.Cork 0.1 | 4.3 | 11.6% | 19 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 1 |
| evd.X1 0.01 | 7.2 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.9 | 56.2 | 10 / 35 | 4447 |
| 2 | 1 | 65.1 | 71.1 | 17 / 35 | 5117 |
| 3 | 2 | 62.7 | 64.8 | 11 / 35 | 5084 |
| 4 | 2 | 61.6 | 66.7 | 12 / 35 | 4637 |
| 5 | 1 | 66.8 | 77.8 | 21 / 35 | 5297 |
| 6 | 1 | 63.2 | 65.7 | 16 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 76% |
| cs.Wren 1.0 | 18 | 89% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 40% | 100 |
| evd.X1 0.01 | 16 | 13% | 16 |
| cs.Wren 1.0 | 15 | 12% | 27 |
| joe.ADinosaur 1.0 | 12 | 10% | 13 |
| mz.Cork 0.1 | 10 | 8% | 18 |
| js.PinBall 1.6 | 10 | 8% | 14 |
| PSW.Relentless 0.1 | 8 | 7% | 7 |
| donjezza.Jezza 1.0 | 2 | 2% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.4 | 135 / 210 | 2.40 | 18.8% | 28128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.8% | 135 |
| myl.nano.Graviton 1.10 | 2.3 | 12.4% | 26 |
| ntc.Opposite 1.5 | 3.5 | 10.9% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.1% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 3 |
| disan.Chair 2.2.0 | 6.5 | 8.7% | 10 |
| DBall.NUKE 0.1 | 8.0 | 7.3% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.4 | 21 / 35 | 4620 |
| 2 | 1 | 68.2 | 87.6 | 23 / 35 | 4168 |
| 3 | 1 | 68.0 | 83.8 | 21 / 35 | 5075 |
| 4 | 1 | 65.6 | 79.4 | 19 / 35 | 4250 |
| 5 | 1 | 68.4 | 83.8 | 23 / 35 | 4891 |
| 6 | 1 | 71.0 | 93.7 | 28 / 35 | 5124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 56 | 95% |
| stelo.AreaTargetingBot 1.1 | 32 | 75% |
| ntc.Opposite 1.5 | 20 | 90% |
| disan.Chair 2.2.0 | 19 | 68% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| DBall.NUKE 0.1 | 9 | 100% |
| donjezza.Muncho 1.0 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 21% | 35 |
| myl.nano.Graviton 1.10 | 14 | 18% | 61 |
| ntc.Opposite 1.5 | 12 | 16% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 21 |
| disan.Chair 2.2.0 | 7 | 9% | 25 |
| pfvicm.Sobieski 7.2.3b | 7 | 9% | 11 |
| pbg.R2D2 1.0 | 5 | 7% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 13 |
| donjezza.Muncho 1.0 | 3 | 4% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.5 | 84 / 210 | 3.38 | 15.8% | 25036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 15.8% | 84 |
| oog.melee.Capulet 1.2 | 2.5 | 14.2% | 52 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.9% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 20 |
| yagami.Tidus 0.11 | 5.0 | 12.0% | 11 |
| ejb.Polaris 1.0.1 | 5.7 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 17 / 35 | 4351 |
| 2 | 1 | 66.0 | 75.2 | 18 / 35 | 4481 |
| 3 | 1 | 64.3 | 72.4 | 10 / 35 | 4285 |
| 4 | 1 | 63.0 | 69.5 | 14 / 35 | 3838 |
| 5 | 1 | 65.1 | 76.2 | 15 / 35 | 3920 |
| 6 | 2 | 63.2 | 69.2 | 10 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 78% |
| oog.melee.Capulet 1.2 | 30 | 57% |
| kawigi.micro.Shiz 1.1 | 25 | 100% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 126 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 40% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 19% | 50 |
| yagami.Tidus 0.11 | 16 | 13% | 28 |
| ejb.Polaris 1.0.1 | 11 | 9% | 20 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 26 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.0 | 131 / 210 | 2.80 | 17.5% | 26578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.5% | 131 |
| wee.Gem 1.8.4 | 3.0 | 12.1% | 26 |
| bzdp.Pansy 2.1 | 3.2 | 12.2% | 15 |
| wompi.Quokka 1.6 | 4.0 | 11.5% | 15 |
| ratosh.Nobo 0.21 | 4.5 | 11.3% | 12 |
| m3thos.Eva00 1.1 | 5.3 | 9.8% | 8 |
| bayen.UbaMicro 1.4 | 7.0 | 8.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 78.4 | 22 / 35 | 4282 |
| 2 | 1 | 66.5 | 80.6 | 19 / 35 | 4348 |
| 3 | 1 | 67.3 | 81.6 | 24 / 35 | 4685 |
| 4 | 1 | 68.8 | 87.0 | 26 / 35 | 4872 |
| 5 | 1 | 65.6 | 79.0 | 19 / 35 | 4158 |
| 6 | 1 | 64.6 | 73.3 | 21 / 35 | 4233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 94% |
| wee.Gem 1.8.4 | 35 | 89% |
| wompi.Quokka 1.6 | 19 | 79% |
| ratosh.Nobo 0.21 | 11 | 73% |
| m3thos.Eva00 1.1 | 11 | 82% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 20% | 62 |
| wompi.Quokka 1.6 | 10 | 13% | 22 |
| ratosh.Nobo 0.21 | 10 | 13% | 19 |
| maribo.FollowFire 1 | 10 | 13% | 11 |
| bayen.UbaMicro 1.4 | 9 | 11% | 15 |
| wee.Gem 1.8.4 | 7 | 9% | 45 |
| m3thos.Eva00 1.1 | 7 | 9% | 18 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 90.4 | 147 / 210 | 1.86 | 21.9% | 46596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.9% | 147 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 50 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 9 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 2 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 92.7 | 27 / 35 | 7834 |
| 2 | 1 | 73.2 | 90.5 | 22 / 35 | 7607 |
| 3 | 1 | 71.6 | 84.4 | 20 / 35 | 7319 |
| 4 | 1 | 74.0 | 92.4 | 24 / 35 | 8219 |
| 5 | 1 | 73.5 | 88.3 | 28 / 35 | 7817 |
| 6 | 1 | 73.6 | 94.3 | 26 / 35 | 7800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 137 | 85% |
| exauge.GateKeeper 1.1.121g | 14 | 100% |
| mz.NanoGod 2.02 | 13 | 69% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |

Hadur died in 63 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 46% | 145 |
| mz.NanoGod 2.02 | 21 | 33% | 33 |
| ayk.WallHugger 1.0 | 3 | 5% | 10 |
| exauge.GateKeeper 1.1.121g | 3 | 5% | 9 |
| stuff.Vlad 0.1 | 3 | 5% | 5 |
| stelo.PianistNano 1.2 | 3 | 5% | 4 |
| drd.Dreadknoght 0.9 | 1 | 2% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.6 | 122 / 210 | 2.93 | 17.5% | 28446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.5% | 122 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 18 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.5% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 10.9% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.8% | 16 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 3 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 0 |
| ap.Frederick 1.1 | 7.8 | 7.0% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 75.2 | 19 / 35 | 4543 |
| 2 | 1 | 66.2 | 78.1 | 20 / 35 | 4664 |
| 3 | 1 | 66.0 | 77.1 | 17 / 35 | 4840 |
| 4 | 1 | 66.5 | 80.0 | 23 / 35 | 4576 |
| 5 | 1 | 67.5 | 80.6 | 22 / 35 | 4972 |
| 6 | 1 | 67.3 | 80.3 | 21 / 35 | 4851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 92% |
| dummy.micro.Sparrow 2.5 | 38 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| bvh.micro.Freya 0.3 | 14 | 93% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 25 | 28% | 53 |
| voidious.micro.BlitzBat 1.05 | 20 | 23% | 66 |
| conscience.Electron 1.3g | 12 | 14% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 13% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 10% | 32 |
| bvh.micro.Freya 0.3 | 5 | 6% | 17 |
| dl.BetterWalls 1.0 | 4 | 5% | 6 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 10 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.8 | 143 / 210 | 2.55 | 20.2% | 39819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.2% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.5 | 14.0% | 13 |
| sul.Lunar 1.1 | 3.0 | 12.4% | 23 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.4% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 5 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 5 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 4 |
| sample.Corners 1.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 74.3 | 19 / 35 | 6158 |
| 2 | 1 | 72.8 | 92.7 | 26 / 35 | 7316 |
| 3 | 1 | 67.9 | 73.7 | 20 / 35 | 6466 |
| 4 | 1 | 72.3 | 91.4 | 27 / 35 | 6890 |
| 5 | 1 | 69.0 | 77.8 | 23 / 35 | 6398 |
| 6 | 1 | 71.2 | 86.7 | 28 / 35 | 6591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 57 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 95% |
| supersample.SuperBoxBot 1.0 | 22 | 82% |
| dsw.StaticD 1.0 | 13 | 77% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 29% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 22% | 55 |
| dsw.StaticD 1.0 | 9 | 13% | 21 |
| sul.Lunar 1.1 | 8 | 12% | 64 |
| mme.NikeEnhanced 2.0 | 8 | 12% | 11 |
| sample.Corners 1.0 | 3 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.3 | 129 / 210 | 2.41 | 19.0% | 36210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.0% | 129 |
| radnor.DoctorBob 1.42 | 2.3 | 12.8% | 19 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.6% | 22 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 8 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.7% | 7 |
| sample.Walls 1.0 | 7.5 | 7.4% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.4% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 4 |
| sample.Target 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.0 | 22 / 35 | 5712 |
| 2 | 1 | 68.1 | 83.8 | 20 / 35 | 5471 |
| 3 | 1 | 67.1 | 77.8 | 20 / 35 | 5985 |
| 4 | 1 | 68.5 | 83.2 | 17 / 35 | 6484 |
| 5 | 1 | 70.9 | 92.4 | 28 / 35 | 6139 |
| 6 | 1 | 70.1 | 89.5 | 22 / 35 | 6419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 91% |
| radnor.DoctorBob 1.42 | 34 | 79% |
| mld.Wisdom 1.0 | 24 | 79% |
| amz.NanoClone 1.41 | 23 | 87% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 32% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 20% | 55 |
| radnor.DoctorBob 1.42 | 16 | 20% | 51 |
| KiraNL.Chupacabra 0.4 | 10 | 12% | 20 |
| amz.NanoClone 1.41 | 8 | 10% | 20 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 3 |

