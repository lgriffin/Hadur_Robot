# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 91.4 | 159 / 210 | 1.77 | 21.9% | 42000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.9% | 159 |
| mz.AntiGrav 1.0 | 2.0 | 14.9% | 12 |
| mld.Infinity 2.2 | 3.3 | 12.9% | 16 |
| radnor.DoctorBob 1.42 | 3.7 | 13.3% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 3 |
| sample.Walls 1.0 | 6.7 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 89.5 | 24 / 35 | 7175 |
| 2 | 1 | 73.2 | 94.0 | 27 / 35 | 7089 |
| 3 | 1 | 71.8 | 87.9 | 26 / 35 | 6553 |
| 4 | 1 | 72.7 | 90.2 | 26 / 35 | 7140 |
| 5 | 1 | 74.7 | 98.1 | 32 / 35 | 7410 |
| 6 | 1 | 71.8 | 88.9 | 24 / 35 | 6633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 91 | 95% |
| mld.Infinity 2.2 | 40 | 98% |
| radnor.DoctorBob 1.42 | 26 | 88% |
| jangs.ns51 1.0 | 5 | 60% |
| amz.NanoClone 1.41 | 4 | 75% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 35% | 47 |
| mz.AntiGrav 1.0 | 13 | 25% | 84 |
| mld.Infinity 2.2 | 6 | 12% | 50 |
| jangs.ns51 1.0 | 6 | 12% | 10 |
| amz.NanoClone 1.41 | 3 | 6% | 6 |
| GarmBox.Oranges 1.0 | 3 | 6% | 4 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.3 | 121 / 210 | 2.32 | 18.6% | 31846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 18.6% | 121 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.7% | 63 |
| mld.DustBunny 3.8 | 3.2 | 13.4% | 17 |
| maribo.melee.BMV 0.1 | 4.0 | 10.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 6.7 | 8.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 2 |
| fullsail.SweetTea 1.1 | 7.7 | 6.3% | 1 |
| bzdp.BoxCar 2.0 | 8.5 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 23 / 35 | 5567 |
| 2 | 1 | 68.9 | 90.2 | 21 / 35 | 5028 |
| 3 | 1 | 68.0 | 85.1 | 20 / 35 | 5042 |
| 4 | 1 | 69.3 | 91.4 | 22 / 35 | 5449 |
| 5 | 1 | 69.3 | 90.5 | 22 / 35 | 5133 |
| 6 | 2 | 64.5 | 65.4 | 13 / 35 | 5627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 74 | 77% |
| mld.DustBunny 3.8 | 51 | 78% |
| maribo.melee.BMV 0.1 | 12 | 92% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 36% | 66 |
| oog.melee.Mercutio 1.0 | 30 | 34% | 87 |
| cs.Grudge 1.0 | 9 | 10% | 10 |
| zyx.nano.Ant 1.1 | 5 | 6% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 9 |
| fullsail.SweetTea 1.1 | 4 | 4% | 7 |
| maribo.melee.BMV 0.1 | 3 | 3% | 14 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 82.6 | 136 / 210 | 2.56 | 19.1% | 32922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.1% | 136 |
| myl.micro.Troodon 1.10 | 2.3 | 13.9% | 27 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.3% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.5% | 20 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.2% | 9 |
| fm.mammillarias 1.3 | 5.7 | 9.9% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.0% | 3 |
| sample.Fire 1.0 | 9.3 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.1 | 23 / 35 | 5356 |
| 2 | 1 | 69.5 | 84.4 | 24 / 35 | 5526 |
| 3 | 1 | 67.3 | 78.1 | 23 / 35 | 4711 |
| 4 | 1 | 68.9 | 80.6 | 21 / 35 | 5783 |
| 5 | 1 | 68.7 | 81.0 | 21 / 35 | 5534 |
| 6 | 1 | 70.5 | 87.6 | 24 / 35 | 6012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 47 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 94% |
| myl.nano.KomoriNinja 1.1 | 22 | 91% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| fm.mammillarias 1.3 | 10 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 17 | 23% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 20% | 37 |
| myl.micro.Troodon 1.10 | 12 | 16% | 62 |
| fm.mammillarias 1.3 | 10 | 13% | 18 |
| sp.Nanos.Ember 1.1 | 8 | 11% | 15 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 38 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 10 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| sample.Fire 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.9 | 167 / 210 | 1.73 | 21.7% | 40139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.7% | 167 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.4% | 7 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.4% | 12 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.4% | 9 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.8% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 25 / 35 | 6271 |
| 2 | 1 | 72.7 | 96.8 | 31 / 35 | 6498 |
| 3 | 1 | 72.6 | 94.9 | 30 / 35 | 6973 |
| 4 | 1 | 72.0 | 92.1 | 29 / 35 | 6803 |
| 5 | 1 | 69.6 | 84.1 | 22 / 35 | 6355 |
| 6 | 1 | 73.4 | 96.8 | 30 / 35 | 7239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 97% |
| stelo.SoJNanoMelee 1.1 | 30 | 87% |
| tvv.micro.Antares 1.1.1 | 25 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 86% |
| tj.zombie1n 1.0.1 | 15 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 75% |

Hadur died in 44 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 14 | 32% | 79 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 16% | 25 |
| stelo.SoJNanoMelee 1.1 | 6 | 14% | 28 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 34 |
| yk.JahMicro 1.0 | 3 | 7% | 16 |
| repositorio.NanoStep 1.0 | 3 | 7% | 12 |
| sample.VelociRobot 1.0 | 3 | 7% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 7% | 5 |
| tj.zombie1n 1.0.1 | 1 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.3 | 90 / 210 | 3.77 | 15.9% | 28930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 15.9% | 90 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 33 |
| ahf.NanoAndrew .4 | 3.0 | 12.1% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.0% | 25 |
| EBBU.Sim2 1.02 | 5.8 | 9.8% | 5 |
| sam.Samspin 1.0 | 5.8 | 10.0% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.2% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 65.4 | 13 / 35 | 5395 |
| 2 | 1 | 64.7 | 72.7 | 17 / 35 | 4985 |
| 3 | 1 | 63.6 | 67.6 | 15 / 35 | 4962 |
| 4 | 1 | 60.4 | 65.1 | 11 / 35 | 4056 |
| 5 | 1 | 63.6 | 70.8 | 17 / 35 | 4570 |
| 6 | 1 | 65.1 | 74.0 | 17 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 67% |
| simonton.nano.MeleeSeed 1.8 | 32 | 81% |
| ahf.NanoAndrew .4 | 26 | 85% |
| EBBU.Sim2 1.02 | 7 | 100% |
| sam.Samspin 1.0 | 7 | 71% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |

Hadur died in 122 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 20% | 44 |
| ahf.NanoAndrew .4 | 24 | 20% | 43 |
| oog.melee.Corsair 1.0 | 14 | 11% | 40 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 21 |
| EBBU.Sim2 1.02 | 13 | 11% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| sam.Samspin 1.0 | 11 | 9% | 12 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 16 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.6 | 139 / 210 | 2.02 | 19.7% | 32695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.7% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 29 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.9% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.2% | 7 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.2% | 3 |
| fm.claire 1.7 | 6.2 | 8.3% | 1 |
| pa.Improved 1.0 | 8.7 | 6.2% | 1 |
| sample.SpinBot 1.0 | 8.7 | 6.4% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 96.5 | 27 / 35 | 5646 |
| 2 | 1 | 68.8 | 84.4 | 26 / 35 | 5042 |
| 3 | 1 | 68.8 | 85.1 | 22 / 35 | 5466 |
| 4 | 1 | 70.2 | 91.1 | 23 / 35 | 5473 |
| 5 | 1 | 69.9 | 90.2 | 23 / 35 | 5653 |
| 6 | 1 | 68.4 | 84.4 | 18 / 35 | 5415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 84% |
| oog.melee.CapuletDroid 1.1 | 36 | 89% |
| gh.nano.Grofvuil 0.2 | 19 | 89% |
| arthord.NanoSatanMelee Beta | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 9 | 78% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 42% | 86 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 34 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 40 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 13 |
| kurios.DOSexe .9b | 4 | 6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 10 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| pa.Improved 1.0 | 2 | 3% | 4 |
| fm.claire 1.7 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.9 | 112 / 210 | 2.54 | 18.3% | 32670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.3% | 112 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.9% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.5% | 24 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 32 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 7 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 1 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.3 | 5.8% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 17 / 35 | 5111 |
| 2 | 1 | 67.0 | 79.7 | 16 / 35 | 5511 |
| 3 | 1 | 70.0 | 89.2 | 23 / 35 | 5479 |
| 4 | 1 | 67.3 | 78.4 | 17 / 35 | 5546 |
| 5 | 1 | 66.7 | 79.4 | 17 / 35 | 5165 |
| 6 | 1 | 69.1 | 85.1 | 22 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 67 | 90% |
| mz.MicroGodMelee 1 | 40 | 65% |
| gh.micro.Gruweltje 0.7 | 24 | 75% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 34% | 57 |
| gh.micro.Gruweltje 0.7 | 25 | 26% | 51 |
| spinnercat.micro.Tyger 0.1 | 20 | 20% | 70 |
| acogdev.alpha 0.2 | 8 | 8% | 9 |
| DBall.Anarchy 0.1 | 4 | 4% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 7 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 69.7 | 107 / 210 | 3.72 | 16.1% | 29433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 16.1% | 107 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 32 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.6% | 6 |
| germ.TheMind .2 | 5.2 | 9.9% | 14 |
| awesomeness.Elite 1.0 | 5.3 | 9.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 7 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.7 | 16 / 35 | 4569 |
| 2 | 1 | 64.0 | 70.2 | 18 / 35 | 4679 |
| 3 | 1 | 64.5 | 69.2 | 18 / 35 | 5113 |
| 4 | 1 | 66.3 | 77.5 | 22 / 35 | 4937 |
| 5 | 1 | 65.6 | 70.2 | 18 / 35 | 5450 |
| 6 | 2 | 62.5 | 65.7 | 15 / 35 | 4685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 67% |
| germ.TheMind .2 | 11 | 73% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 6 | 67% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 45% | 110 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 37 |
| germ.TheMind .2 | 13 | 13% | 22 |
| qualidafial.MajorDick 1.0.1 | 9 | 9% | 9 |
| awesomeness.Elite 1.0 | 8 | 8% | 12 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 5 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.8 | 166 / 210 | 1.74 | 20.8% | 31213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.8% | 166 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.4% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 5 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.5% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.1% | 2 |
| spinnercat.Omen 1.0 | 7.5 | 7.7% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.5% | 4 |
| ratosh.Wesco 1.4 | 8.2 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.1 | 26 / 35 | 5574 |
| 2 | 1 | 71.7 | 94.9 | 30 / 35 | 4908 |
| 3 | 1 | 71.9 | 93.0 | 30 / 35 | 5109 |
| 4 | 1 | 71.6 | 91.4 | 29 / 35 | 5297 |
| 5 | 1 | 70.2 | 87.6 | 24 / 35 | 4947 |
| 6 | 1 | 71.2 | 91.7 | 27 / 35 | 5378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 89 | 91% |
| nz.jdc.nano.GridFu 1.0 | 47 | 100% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| maribo.IotaCT 1.1 | 11 | 100% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| spinnercat.Omen 1.0 | 4 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 45 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 27% | 70 |
| timmit.nano.TimDog 0.33 | 9 | 20% | 21 |
| stelo.PatternRobot 1.0 | 8 | 18% | 17 |
| nz.jdc.nano.GridFu 1.0 | 5 | 11% | 56 |
| maribo.IotaCT 1.1 | 5 | 11% | 22 |
| ratosh.Wesco 1.4 | 3 | 7% | 6 |
| spinnercat.Omen 1.0 | 2 | 4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 4 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.3 | 174 / 210 | 1.78 | 21.1% | 37058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.1% | 174 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 7 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 6 |
| zyx.micro.Ant 1.1 | 4.3 | 10.2% | 14 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.7% | 2 |
| sanja.First 0.1 | 6.8 | 8.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.8% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.3 | 30 / 35 | 6363 |
| 2 | 1 | 70.9 | 91.4 | 30 / 35 | 5966 |
| 3 | 1 | 71.6 | 93.0 | 29 / 35 | 6471 |
| 4 | 1 | 68.7 | 83.2 | 25 / 35 | 5780 |
| 5 | 1 | 70.2 | 88.3 | 28 / 35 | 5997 |
| 6 | 1 | 72.8 | 97.8 | 32 / 35 | 6481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 98% |
| baal.nano.N 1.42 | 33 | 94% |
| zyx.micro.Ant 1.1 | 24 | 96% |
| sanja.First 0.1 | 21 | 100% |
| cvt.Firsty 1.0 | 21 | 90% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 31% | 41 |
| baal.nano.N 1.42 | 9 | 25% | 41 |
| cvt.Firsty 1.0 | 4 | 11% | 24 |
| Grystrion.TrackerWO 1.0 | 4 | 11% | 12 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 6% | 60 |
| sample.RamFire 1.0 | 2 | 6% | 4 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 4 |
| sanja.First 0.1 | 0 | 0% | 17 |

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.2 | 101 / 210 | 3.32 | 16.7% | 31674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 16.7% | 101 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 53 |
| cs.Wren 1.0 | 3.0 | 12.9% | 20 |
| js.PinBall 1.6 | 4.5 | 11.0% | 10 |
| mz.Cork 0.1 | 4.5 | 10.7% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 5 |
| evd.X1 0.01 | 7.5 | 7.5% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 7 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 72.1 | 16 / 35 | 4964 |
| 2 | 1 | 67.1 | 80.3 | 18 / 35 | 5584 |
| 3 | 1 | 64.5 | 73.0 | 15 / 35 | 5125 |
| 4 | 2 | 63.4 | 67.3 | 15 / 35 | 4937 |
| 5 | 1 | 66.0 | 74.9 | 20 / 35 | 5416 |
| 6 | 1 | 66.5 | 77.8 | 17 / 35 | 5648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 83 | 70% |
| cs.Wren 1.0 | 27 | 85% |
| mz.Cork 0.1 | 8 | 88% |
| js.PinBall 1.6 | 7 | 71% |
| joe.ADinosaur 1.0 | 5 | 60% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 49% | 118 |
| joe.ADinosaur 1.0 | 13 | 12% | 16 |
| cs.Wren 1.0 | 10 | 9% | 23 |
| mz.Cork 0.1 | 8 | 7% | 15 |
| evd.X1 0.01 | 8 | 7% | 8 |
| js.PinBall 1.6 | 6 | 6% | 11 |
| jsal.Jsalbot 1.0 | 4 | 4% | 8 |
| donjezza.Jezza 1.0 | 4 | 4% | 7 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.9 | 133 / 210 | 2.90 | 17.9% | 26927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.9% | 133 |
| myl.nano.Graviton 1.10 | 2.8 | 11.6% | 18 |
| ntc.Opposite 1.5 | 3.2 | 11.4% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.5% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 10.2% | 6 |
| DBall.NUKE 0.1 | 7.0 | 8.2% | 7 |
| disan.Chair 2.2.0 | 7.5 | 8.3% | 7 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.6 | 24 / 35 | 4462 |
| 2 | 1 | 65.9 | 76.8 | 21 / 35 | 4441 |
| 3 | 1 | 66.9 | 78.7 | 24 / 35 | 4625 |
| 4 | 1 | 68.9 | 87.0 | 25 / 35 | 4761 |
| 5 | 1 | 67.0 | 80.6 | 22 / 35 | 4396 |
| 6 | 1 | 63.9 | 69.5 | 17 / 35 | 4242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 98% |
| stelo.AreaTargetingBot 1.1 | 28 | 93% |
| ntc.Opposite 1.5 | 20 | 85% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| disan.Chair 2.2.0 | 13 | 77% |
| donjezza.Muncho 1.0 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 13 | 16% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 26 |
| ntc.Opposite 1.5 | 12 | 15% | 25 |
| stelo.AreaTargetingBot 1.1 | 11 | 14% | 36 |
| pfvicm.Sobieski 7.2.3b | 9 | 11% | 18 |
| disan.Chair 2.2.0 | 7 | 9% | 16 |
| DBall.NUKE 0.1 | 6 | 8% | 14 |
| donjezza.Muncho 1.0 | 4 | 5% | 13 |
| pbg.R2D2 1.0 | 4 | 5% | 10 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.6 | 91 / 210 | 3.38 | 15.8% | 24578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.5 | 15.8% | 91 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 35 |
| oog.melee.Capulet 1.2 | 2.7 | 14.1% | 54 |
| yagami.Tidus 0.11 | 3.8 | 12.4% | 10 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.2% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.2% | 4 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 76.2 | 16 / 35 | 3789 |
| 2 | 2 | 66.2 | 74.6 | 17 / 35 | 4650 |
| 3 | 1 | 62.5 | 69.5 | 12 / 35 | 4018 |
| 4 | 1 | 64.6 | 73.0 | 15 / 35 | 3884 |
| 5 | 3 | 62.1 | 64.4 | 11 / 35 | 4059 |
| 6 | 1 | 67.5 | 83.8 | 20 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 57% |
| kawigi.micro.Shiz 1.1 | 33 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 84% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 10 | 80% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 43% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 14% | 30 |
| ejb.Polaris 1.0.1 | 14 | 12% | 26 |
| yagami.Tidus 0.11 | 13 | 11% | 29 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 36 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 3% | 4 |
| logiblocs.SittingDroid 1.0 | 1 | 1% | 0 |

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.3 | 128 / 210 | 2.95 | 17.2% | 25945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.2% | 128 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 20 |
| wee.Gem 1.8.4 | 3.7 | 11.9% | 25 |
| ratosh.Nobo 0.21 | 3.7 | 11.6% | 13 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 3 |
| maribo.FollowFire 1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 23 / 35 | 4795 |
| 2 | 1 | 65.8 | 79.4 | 20 / 35 | 4135 |
| 3 | 1 | 67.0 | 81.0 | 24 / 35 | 4369 |
| 4 | 1 | 63.3 | 71.7 | 18 / 35 | 3804 |
| 5 | 1 | 65.9 | 75.2 | 22 / 35 | 4425 |
| 6 | 1 | 65.3 | 76.5 | 21 / 35 | 4417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 93% |
| wee.Gem 1.8.4 | 24 | 92% |
| ratosh.Nobo 0.21 | 21 | 90% |
| wompi.Quokka 1.6 | 20 | 90% |
| m3thos.Eva00 1.1 | 9 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 20% | 60 |
| maribo.FollowFire 1 | 13 | 16% | 16 |
| ratosh.Nobo 0.21 | 11 | 13% | 28 |
| wee.Gem 1.8.4 | 9 | 11% | 34 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 11 |
| bayen.UbaMicro 1.4 | 8 | 10% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 13 |
| wompi.Quokka 1.6 | 6 | 7% | 26 |
| m3thos.Eva00 1.1 | 3 | 4% | 14 |

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.5 | 135 / 210 | 1.94 | 21.5% | 46055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.5% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 12 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 1 |
| ayk.WallHugger 1.0 | 5.5 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 88.3 | 21 / 35 | 7610 |
| 2 | 1 | 74.5 | 95.6 | 27 / 35 | 8196 |
| 3 | 1 | 72.7 | 89.8 | 25 / 35 | 7483 |
| 4 | 1 | 71.5 | 83.8 | 19 / 35 | 7339 |
| 5 | 1 | 71.1 | 85.4 | 18 / 35 | 7353 |
| 6 | 1 | 74.0 | 94.3 | 25 / 35 | 8074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 80% |
| mz.NanoGod 2.02 | 20 | 65% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 46% | 137 |
| mz.NanoGod 2.02 | 24 | 32% | 38 |
| exauge.GateKeeper 1.1.121g | 10 | 13% | 15 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| stuff.Vlad 0.1 | 2 | 3% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.0 | 109 / 210 | 3.34 | 16.7% | 28214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.7% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 32 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 14 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.8% | 14 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 4 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 7 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 18 / 35 | 4898 |
| 2 | 1 | 64.3 | 69.8 | 17 / 35 | 4900 |
| 3 | 1 | 64.2 | 71.7 | 18 / 35 | 4659 |
| 4 | 1 | 65.4 | 75.2 | 19 / 35 | 4932 |
| 5 | 1 | 63.8 | 70.2 | 19 / 35 | 4393 |
| 6 | 1 | 66.1 | 79.0 | 18 / 35 | 4432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 86% |
| dummy.micro.Sparrow 2.5 | 25 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| bvh.micro.Freya 0.3 | 12 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 25 | 25% | 50 |
| voidious.micro.BlitzBat 1.05 | 20 | 20% | 65 |
| conscience.Electron 1.3g | 15 | 15% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 12% | 29 |
| bvh.micro.Freya 0.3 | 6 | 6% | 19 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 11 |
| dl.BetterWalls 1.0 | 4 | 4% | 5 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.3 | 155 / 210 | 2.23 | 21.0% | 40258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.0% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.4% | 11 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 15 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.1% | 10 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 6 |
| tlp.ThreeLeggedPig 1 | 7.7 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.6% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 3 |
| sample.Corners 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 89.5 | 27 / 35 | 6921 |
| 2 | 1 | 71.8 | 89.8 | 27 / 35 | 6754 |
| 3 | 1 | 70.8 | 81.9 | 25 / 35 | 6849 |
| 4 | 1 | 71.0 | 87.0 | 22 / 35 | 6900 |
| 5 | 1 | 72.4 | 93.0 | 31 / 35 | 6708 |
| 6 | 1 | 68.3 | 76.5 | 23 / 35 | 6126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 60 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 98% |
| supersample.SuperBoxBot 1.0 | 30 | 93% |
| dsw.StaticD 1.0 | 14 | 64% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 32% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 25% | 61 |
| dsw.StaticD 1.0 | 11 | 20% | 21 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 12 |
| sul.Lunar 1.1 | 3 | 5% | 59 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 12 |
| sample.Corners 1.0 | 2 | 4% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.5 | 122 / 210 | 2.40 | 19.0% | 37448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.0% | 122 |
| radnor.DoctorBob 1.42 | 2.5 | 13.2% | 26 |
| mld.Wisdom 1.0 | 3.0 | 12.9% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.9% | 19 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.8% | 3 |
| amz.NanoClone 1.41 | 5.8 | 8.8% | 8 |
| sample.Walls 1.0 | 7.3 | 7.2% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 26 / 35 | 6658 |
| 2 | 1 | 70.0 | 88.3 | 22 / 35 | 6346 |
| 3 | 1 | 67.8 | 83.2 | 15 / 35 | 6404 |
| 4 | 1 | 64.5 | 73.0 | 14 / 35 | 5489 |
| 5 | 1 | 69.9 | 88.3 | 25 / 35 | 6235 |
| 6 | 1 | 68.9 | 85.1 | 20 / 35 | 6316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 90% |
| radnor.DoctorBob 1.42 | 36 | 86% |
| mld.Wisdom 1.0 | 22 | 73% |
| KiraNL.Chupacabra 0.4 | 12 | 100% |
| jangs.ns51 1.0 | 7 | 71% |
| amz.NanoClone 1.41 | 6 | 67% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 34% | 44 |
| radnor.DoctorBob 1.42 | 21 | 24% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 14% | 58 |
| KiraNL.Chupacabra 0.4 | 8 | 9% | 21 |
| amz.NanoClone 1.41 | 8 | 9% | 12 |
| jangs.ns51 1.0 | 4 | 5% | 7 |
| sample.Walls 1.0 | 4 | 5% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 6 |

