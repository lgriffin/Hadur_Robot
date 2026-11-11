# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 92.0 | 169 / 210 | 1.72 | 22.3% | 44354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 22.3% | 169 |
| mz.AntiGrav 1.0 | 2.3 | 13.7% | 8 |
| radnor.DoctorBob 1.42 | 2.8 | 13.7% | 15 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 14 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 3 |
| sample.Walls 1.0 | 6.5 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 95.9 | 31 / 35 | 7411 |
| 2 | 1 | 72.3 | 89.2 | 27 / 35 | 7343 |
| 3 | 1 | 72.5 | 88.9 | 24 / 35 | 7491 |
| 4 | 1 | 74.2 | 94.6 | 30 / 35 | 7758 |
| 5 | 1 | 72.0 | 89.5 | 28 / 35 | 6734 |
| 6 | 1 | 73.9 | 93.7 | 29 / 35 | 7617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 97% |
| mld.Infinity 2.2 | 50 | 90% |
| radnor.DoctorBob 1.42 | 36 | 83% |
| amz.NanoClone 1.41 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 14 | 34% | 65 |
| mld.Infinity 2.2 | 8 | 20% | 14 |
| mz.AntiGrav 1.0 | 7 | 17% | 82 |
| amz.NanoClone 1.41 | 6 | 15% | 18 |
| sample.Walls 1.0 | 3 | 7% | 16 |
| jangs.ns51 1.0 | 1 | 2% | 8 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.2 | 154 / 210 | 1.79 | 19.9% | 32414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.9% | 154 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.5% | 39 |
| mld.DustBunny 3.8 | 3.3 | 12.6% | 6 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.0% | 3 |
| zyx.nano.Ant 1.1 | 6.5 | 7.9% | 2 |
| fullsail.SweetTea 1.1 | 7.3 | 7.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 6.3% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.7 | 25 / 35 | 5179 |
| 2 | 1 | 69.5 | 87.3 | 24 / 35 | 5550 |
| 3 | 1 | 68.2 | 88.3 | 23 / 35 | 4803 |
| 4 | 1 | 71.2 | 95.2 | 28 / 35 | 5530 |
| 5 | 1 | 71.3 | 94.6 | 29 / 35 | 5818 |
| 6 | 1 | 69.3 | 90.2 | 25 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 88 | 76% |
| mld.DustBunny 3.8 | 49 | 98% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| fullsail.SweetTea 1.1 | 10 | 100% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |

Hadur died in 57 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 49% | 96 |
| mld.DustBunny 3.8 | 8 | 14% | 52 |
| zyx.nano.Ant 1.1 | 7 | 12% | 11 |
| maribo.melee.BMV 0.1 | 5 | 9% | 10 |
| djdjdj.NanoSkunk10 1.0 | 3 | 5% | 18 |
| fullsail.SweetTea 1.1 | 2 | 4% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 4% | 6 |
| bzdp.BoxCar 2.0 | 2 | 4% | 3 |

## Melee bench: F03

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.9 | 149 / 210 | 2.36 | 20.4% | 38106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.4% | 149 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.0% | 10 |
| fm.mammillarias 1.3 | 4.8 | 9.6% | 1 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.1% | 2 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 84.4 | 24 / 35 | 6495 |
| 2 | 1 | 69.0 | 79.7 | 22 / 35 | 5682 |
| 3 | 1 | 72.2 | 90.2 | 28 / 35 | 6546 |
| 4 | 1 | 72.2 | 92.4 | 29 / 35 | 6692 |
| 5 | 1 | 69.7 | 80.6 | 24 / 35 | 6499 |
| 6 | 1 | 69.2 | 81.9 | 22 / 35 | 6192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 64 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 91% |
| cb.nano.Insomnia 1.0 | 24 | 83% |
| myl.nano.KomoriNinja 1.1 | 16 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 17 | 27% | 17 |
| myl.micro.Troodon 1.10 | 13 | 21% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 18% | 31 |
| fm.mammillarias 1.3 | 8 | 13% | 15 |
| cs.sheldor.Talon 1.1 | 6 | 10% | 16 |
| myl.nano.KomoriNinja 1.1 | 5 | 8% | 39 |
| sample.Fire 1.0 | 1 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 12 |
| sample.Tracker 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.7 | 156 / 210 | 2.02 | 21.0% | 39306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.0% | 156 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 6 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 12 |
| tj.zombie1n 1.0.1 | 5.0 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.1% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.7% | 1 |
| yk.JahMicro 1.0 | 6.7 | 8.4% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.6% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.2 | 26 / 35 | 6476 |
| 2 | 1 | 70.9 | 86.7 | 24 / 35 | 6613 |
| 3 | 1 | 72.3 | 96.2 | 27 / 35 | 6782 |
| 4 | 1 | 70.6 | 88.6 | 26 / 35 | 6330 |
| 5 | 1 | 69.7 | 83.2 | 26 / 35 | 6442 |
| 6 | 1 | 72.4 | 95.2 | 27 / 35 | 6663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 98% |
| stelo.SoJNanoMelee 1.1 | 43 | 84% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| tj.zombie1n 1.0.1 | 15 | 73% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 92% |
| yk.JahMicro 1.0 | 13 | 69% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 14 | 26% | 81 |
| stelo.SoJNanoMelee 1.1 | 12 | 22% | 33 |
| yk.JahMicro 1.0 | 7 | 13% | 14 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 11% | 12 |
| tj.zombie1n 1.0.1 | 6 | 11% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 23 |
| repositorio.NanoStep 1.0 | 1 | 2% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.7 | 99 / 210 | 3.63 | 16.0% | 28943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 16.0% | 99 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 37 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 25 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.7% | 19 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.4% | 7 |
| EBBU.Sim2 1.02 | 6.2 | 9.8% | 7 |
| sam.Samspin 1.0 | 6.5 | 9.5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.5 | 19 / 35 | 4929 |
| 2 | 1 | 64.6 | 74.3 | 15 / 35 | 4948 |
| 3 | 1 | 65.8 | 76.8 | 22 / 35 | 4748 |
| 4 | 1 | 59.4 | 56.8 | 13 / 35 | 4684 |
| 5 | 1 | 62.3 | 67.3 | 13 / 35 | 4754 |
| 6 | 1 | 64.4 | 71.7 | 17 / 35 | 4880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 92% |
| oog.melee.Corsair 1.0 | 24 | 50% |
| ahf.NanoAndrew .4 | 21 | 90% |
| sam.Samspin 1.0 | 11 | 100% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 3 | 67% |

Hadur died in 111 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 23% | 51 |
| oog.melee.Corsair 1.0 | 25 | 23% | 43 |
| ahf.NanoAndrew .4 | 13 | 12% | 31 |
| robar.nano.Assertive_Melee 0.2 | 12 | 11% | 19 |
| zyx.nano.BacillusComma 1.0 | 12 | 11% | 18 |
| EBBU.Sim2 1.02 | 11 | 10% | 19 |
| sam.Samspin 1.0 | 5 | 5% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 5% | 4 |
| sample.TrackFire 1.0 | 3 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.3 | 156 / 210 | 1.88 | 20.2% | 32346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.2% | 156 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.1% | 18 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.9% | 10 |
| fm.claire 1.7 | 5.7 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.6% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.8% | 4 |
| sample.SpinBot 1.0 | 8.0 | 6.9% | 2 |
| pa.Improved 1.0 | 9.0 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.7 | 24 / 35 | 5662 |
| 2 | 1 | 69.9 | 90.8 | 25 / 35 | 5298 |
| 3 | 1 | 69.1 | 88.3 | 25 / 35 | 5289 |
| 4 | 1 | 69.9 | 90.5 | 28 / 35 | 5185 |
| 5 | 1 | 70.3 | 93.0 | 25 / 35 | 5348 |
| 6 | 1 | 71.5 | 93.3 | 29 / 35 | 5564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 95% |
| oog.melee.CapuletDroid 1.1 | 38 | 89% |
| gh.nano.Grofvuil 0.2 | 22 | 73% |
| arthord.NanoSatanMelee Beta | 18 | 94% |
| sample.SpinBot 1.0 | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| kurios.DOSexe .9b | 6 | 83% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 15 | 28% | 45 |
| d414.nano.Quantum 1.0.0 | 12 | 22% | 69 |
| oog.melee.CapuletDroid 1.1 | 11 | 20% | 20 |
| arthord.NanoSatanMelee Beta | 5 | 9% | 24 |
| kurios.DOSexe .9b | 3 | 6% | 14 |
| pa.Improved 1.0 | 3 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 4% | 12 |
| fm.claire 1.7 | 2 | 4% | 9 |
| sample.SpinBot 1.0 | 1 | 2% | 7 |

## Melee bench: F07

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.1 | 103 / 210 | 2.61 | 18.4% | 34689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 18.4% | 103 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.7% | 45 |
| mz.MicroGodMelee 1 | 3.2 | 13.0% | 30 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.9% | 17 |
| DBall.Anarchy 0.1 | 5.5 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.4% | 4 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 3 |
| acogdev.alpha 0.2 | 8.3 | 6.3% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.7 | 16 / 35 | 5679 |
| 2 | 1 | 69.0 | 86.0 | 16 / 35 | 5856 |
| 3 | 1 | 66.4 | 76.2 | 15 / 35 | 5574 |
| 4 | 1 | 68.6 | 83.2 | 21 / 35 | 5613 |
| 5 | 1 | 67.4 | 79.7 | 18 / 35 | 5721 |
| 6 | 1 | 69.6 | 87.6 | 17 / 35 | 6246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 91% |
| mz.MicroGodMelee 1 | 42 | 48% |
| gh.micro.Gruweltje 0.7 | 32 | 25% |
| DBall.Anarchy 0.1 | 16 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 36% | 63 |
| gh.micro.Gruweltje 0.7 | 34 | 32% | 46 |
| spinnercat.micro.Tyger 0.1 | 11 | 10% | 51 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 7 |
| fire219.CatBot 1.0 | 6 | 6% | 8 |
| DBall.Anarchy 0.1 | 4 | 4% | 20 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 71.5 | 113 / 210 | 3.56 | 16.7% | 31837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.5 | 16.7% | 113 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.2% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.2% | 5 |
| germ.TheMind .2 | 5.5 | 9.2% | 6 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 1 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 74.3 | 17 / 35 | 5050 |
| 2 | 1 | 67.0 | 78.1 | 23 / 35 | 5269 |
| 3 | 1 | 63.4 | 67.6 | 15 / 35 | 5212 |
| 4 | 1 | 70.1 | 84.1 | 26 / 35 | 6459 |
| 5 | 3 | 61.3 | 59.4 | 15 / 35 | 4892 |
| 6 | 1 | 63.0 | 65.7 | 17 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 75% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| awesomeness.Elite 1.0 | 5 | 100% |
| germ.TheMind .2 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 48% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 22% | 44 |
| germ.TheMind .2 | 10 | 10% | 16 |
| awesomeness.Elite 1.0 | 5 | 5% | 12 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 4 | 4% | 6 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.2 | 160 / 210 | 2.06 | 20.0% | 30371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.0% | 160 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 12.7% | 19 |
| rz.HawkOnFire 0.1 | 2.5 | 12.7% | 12 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 1 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 9 |
| ratosh.Wesco 1.4 | 7.2 | 8.4% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 8.2% | 4 |
| spinnercat.Omen 1.0 | 8.2 | 7.6% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.1 | 24 / 35 | 5065 |
| 2 | 1 | 70.8 | 93.0 | 28 / 35 | 4702 |
| 3 | 1 | 69.9 | 87.9 | 26 / 35 | 5092 |
| 4 | 1 | 71.0 | 89.5 | 28 / 35 | 5452 |
| 5 | 1 | 67.0 | 77.1 | 21 / 35 | 4747 |
| 6 | 1 | 72.8 | 96.5 | 33 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 55 | 95% |
| nz.jdc.nano.GridFu 1.0 | 47 | 91% |
| stelo.PatternRobot 1.0 | 23 | 100% |
| maribo.IotaCT 1.1 | 12 | 92% |
| ratosh.Wesco 1.4 | 11 | 100% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 24% | 51 |
| nz.jdc.nano.GridFu 1.0 | 10 | 20% | 58 |
| timmit.nano.TimDog 0.33 | 10 | 20% | 25 |
| ratosh.Wesco 1.4 | 6 | 12% | 22 |
| stelo.PatternRobot 1.0 | 4 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 8 |
| maribo.IotaCT 1.1 | 2 | 4% | 20 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.3 | 184 / 210 | 1.51 | 21.9% | 38838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.9% | 184 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.4% | 11 |
| baal.nano.N 1.42 | 2.7 | 11.2% | 3 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 3 |
| zyx.micro.Ant 1.1 | 5.7 | 9.0% | 4 |
| sanja.First 0.1 | 6.5 | 8.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.1% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.5 | 32 / 35 | 6727 |
| 2 | 1 | 71.5 | 92.7 | 31 / 35 | 6322 |
| 3 | 1 | 71.4 | 91.1 | 27 / 35 | 6630 |
| 4 | 1 | 72.5 | 96.2 | 32 / 35 | 6662 |
| 5 | 1 | 71.6 | 96.2 | 31 / 35 | 5971 |
| 6 | 1 | 71.9 | 93.0 | 31 / 35 | 6526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 35 | 97% |
| tvv.nano.Polaris 1.2 | 32 | 100% |
| sanja.First 0.1 | 28 | 96% |
| zyx.micro.Ant 1.1 | 28 | 93% |
| baal.nano.N 1.42 | 27 | 100% |
| amk.Punbot.Punbot 0.01 | 23 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 30% | 42 |
| tvv.nano.Polaris 1.2 | 5 | 19% | 53 |
| cvt.Firsty 1.0 | 4 | 15% | 20 |
| sample.RamFire 1.0 | 3 | 11% | 4 |
| sanja.First 0.1 | 2 | 7% | 25 |
| Grystrion.TrackerWO 1.0 | 2 | 7% | 17 |
| baal.nano.N 1.42 | 1 | 4% | 30 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 8 |

## Melee bench: F11

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 66.5 | 78 / 210 | 4.02 | 15.1% | 30451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.2% | 67 |
| hadur117.micro.SaorAA 0.1 | 1.8 | 15.1% | 78 |
| cs.Wren 1.0 | 3.3 | 12.7% | 22 |
| js.PinBall 1.6 | 4.2 | 11.4% | 21 |
| mz.Cork 0.1 | 4.3 | 11.4% | 10 |
| joe.ADinosaur 1.0 | 6.5 | 8.7% | 3 |
| evd.X1 0.01 | 6.7 | 8.0% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 5 |
| donjezza.Jezza 1.0 | 8.7 | 6.2% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 69.5 | 14 / 35 | 4636 |
| 2 | 2 | 61.7 | 63.5 | 12 / 35 | 4969 |
| 3 | 1 | 67.6 | 79.4 | 19 / 35 | 6000 |
| 4 | 1 | 62.9 | 68.6 | 11 / 35 | 5117 |
| 5 | 2 | 62.7 | 67.6 | 12 / 35 | 5022 |
| 6 | 3 | 56.9 | 50.2 | 10 / 35 | 4707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 74 | 61% |
| cs.Wren 1.0 | 13 | 85% |
| mz.Cork 0.1 | 10 | 100% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| donjezza.Jezza 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 4 | 75% |
| js.PinBall 1.6 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 68 | 51% | 114 |
| cs.Wren 1.0 | 13 | 10% | 22 |
| mz.Cork 0.1 | 10 | 7% | 19 |
| js.PinBall 1.6 | 10 | 7% | 15 |
| joe.ADinosaur 1.0 | 10 | 7% | 13 |
| evd.X1 0.01 | 9 | 7% | 9 |
| PSW.Relentless 0.1 | 8 | 6% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.6 | 144 / 210 | 2.21 | 19.8% | 30629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.8% | 144 |
| myl.nano.Graviton 1.10 | 2.7 | 11.2% | 19 |
| ntc.Opposite 1.5 | 3.7 | 10.8% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.8% | 8 |
| disan.Chair 2.2.0 | 6.8 | 8.9% | 7 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 3 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 3 |
| donjezza.Muncho 1.0 | 9.5 | 5.2% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 25 / 35 | 5039 |
| 2 | 1 | 68.2 | 82.2 | 23 / 35 | 5122 |
| 3 | 1 | 69.9 | 87.0 | 24 / 35 | 5191 |
| 4 | 1 | 70.3 | 90.5 | 26 / 35 | 5163 |
| 5 | 1 | 70.6 | 91.1 | 24 / 35 | 5314 |
| 6 | 1 | 67.4 | 79.7 | 22 / 35 | 4800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 44 | 86% |
| stelo.AreaTargetingBot 1.1 | 38 | 97% |
| ntc.Opposite 1.5 | 16 | 81% |
| disan.Chair 2.2.0 | 16 | 100% |
| DBall.NUKE 0.1 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| donjezza.Muncho 1.0 | 7 | 71% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 14 | 21% | 30 |
| stelo.AreaTargetingBot 1.1 | 13 | 19% | 41 |
| pfvicm.Sobieski 7.2.3b | 10 | 15% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 13% | 25 |
| myl.nano.Graviton 1.10 | 8 | 12% | 40 |
| disan.Chair 2.2.0 | 6 | 9% | 15 |
| donjezza.Muncho 1.0 | 4 | 6% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 18 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |

## Melee bench: F13

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.1 | 90 / 210 | 3.60 | 15.7% | 26237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.2 | 15.7% | 90 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 30 |
| oog.melee.Capulet 1.2 | 3.0 | 13.4% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 28 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 12 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.3 | 15 / 35 | 4230 |
| 2 | 2 | 62.1 | 63.8 | 13 / 35 | 4311 |
| 3 | 1 | 65.2 | 73.3 | 18 / 35 | 4422 |
| 4 | 1 | 65.8 | 76.5 | 15 / 35 | 4497 |
| 5 | 1 | 63.9 | 70.5 | 13 / 35 | 4309 |
| 6 | 1 | 65.1 | 74.3 | 16 / 35 | 4468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| oog.melee.Capulet 1.2 | 30 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 92% |
| yagami.Tidus 0.11 | 13 | 85% |
| ejb.Polaris 1.0.1 | 10 | 60% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 43% | 72 |
| ejb.Polaris 1.0.1 | 17 | 14% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 12% | 39 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 32 |
| yagami.Tidus 0.11 | 12 | 10% | 28 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.3 | 138 / 210 | 2.60 | 18.3% | 28733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 18.3% | 138 |
| wee.Gem 1.8.4 | 3.0 | 11.5% | 18 |
| bzdp.Pansy 2.1 | 3.3 | 11.8% | 13 |
| ratosh.Nobo 0.21 | 3.8 | 11.4% | 12 |
| wompi.Quokka 1.6 | 3.8 | 11.6% | 18 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 3 |
| bayen.UbaMicro 1.4 | 7.2 | 8.4% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 3 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 23 / 35 | 4743 |
| 2 | 1 | 67.9 | 83.8 | 24 / 35 | 4907 |
| 3 | 1 | 69.7 | 89.5 | 26 / 35 | 5198 |
| 4 | 1 | 64.2 | 69.8 | 21 / 35 | 4394 |
| 5 | 1 | 67.9 | 83.8 | 24 / 35 | 4811 |
| 6 | 1 | 66.7 | 80.6 | 20 / 35 | 4680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 94% |
| wee.Gem 1.8.4 | 49 | 92% |
| wompi.Quokka 1.6 | 23 | 78% |
| m3thos.Eva00 1.1 | 13 | 92% |
| ratosh.Nobo 0.21 | 8 | 88% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 15 | 21% | 32 |
| wee.Gem 1.8.4 | 12 | 17% | 55 |
| bzdp.Pansy 2.1 | 12 | 17% | 52 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 14% | 17 |
| maribo.FollowFire 1 | 8 | 11% | 9 |
| m3thos.Eva00 1.1 | 6 | 8% | 16 |
| ratosh.Nobo 0.21 | 5 | 7% | 14 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 9 |
| bayen.UbaMicro 1.4 | 1 | 1% | 5 |

## Melee bench: F15

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.5 | 84 / 210 | 2.30 | 20.2% | 45515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.5 | 20.2% | 84 |
| wompi.Wallaby 5.1 | 1.5 | 19.3% | 109 |
| mz.NanoGod 2.02 | 3.2 | 13.9% | 12 |
| ayk.WallHugger 1.0 | 3.8 | 10.2% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 1 |
| stuff.Vlad 0.1 | 6.0 | 7.8% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 89.5 | 19 / 35 | 8677 |
| 2 | 1 | 70.4 | 82.9 | 13 / 35 | 7223 |
| 3 | 2 | 70.4 | 85.1 | 11 / 35 | 7101 |
| 4 | 2 | 69.1 | 80.3 | 10 / 35 | 6878 |
| 5 | 2 | 70.0 | 81.0 | 11 / 35 | 7248 |
| 6 | 1 | 73.7 | 94.3 | 20 / 35 | 8388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 36% |
| mz.NanoGod 2.02 | 18 | 78% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 8 | 88% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 89 | 70% | 135 |
| mz.NanoGod 2.02 | 21 | 17% | 41 |
| ayk.WallHugger 1.0 | 6 | 5% | 8 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 9 |
| stelo.PianistNano 1.2 | 4 | 3% | 6 |
| stuff.Vlad 0.1 | 3 | 2% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 78.8 | 131 / 210 | 2.90 | 18.0% | 30041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 18.0% | 131 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.8% | 16 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 18 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 14 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.7% | 6 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 0 |
| ap.Frederick 1.1 | 8.0 | 6.7% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 70.8 | 17 / 35 | 4637 |
| 2 | 1 | 66.4 | 75.6 | 22 / 35 | 5051 |
| 3 | 1 | 65.1 | 73.0 | 20 / 35 | 4973 |
| 4 | 1 | 68.0 | 82.9 | 23 / 35 | 5056 |
| 5 | 1 | 69.1 | 85.1 | 24 / 35 | 4977 |
| 6 | 1 | 69.1 | 85.7 | 25 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 91% |
| dummy.micro.Sparrow 2.5 | 34 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| bvh.micro.Freya 0.3 | 23 | 87% |
| stelo.MirrorMicro 1.0 | 9 | 56% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 5 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 15 | 19% | 53 |
| conscience.Electron 1.3g | 15 | 19% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 16% | 14 |
| dummy.micro.Sparrow 2.5 | 12 | 15% | 30 |
| dl.BetterWalls 1.0 | 7 | 9% | 13 |
| bvh.micro.Freya 0.3 | 6 | 8% | 26 |
| stelo.MirrorMicro 1.0 | 6 | 8% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 6% | 36 |

## Melee bench: F17

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 88.7 | 164 / 210 | 2.02 | 21.7% | 43180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.7% | 164 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 4.2 | 9.9% | 4 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.4% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.4% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 3 |
| sample.Corners 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 86.7 | 28 / 35 | 7157 |
| 2 | 1 | 70.5 | 83.5 | 25 / 35 | 6711 |
| 3 | 1 | 73.4 | 95.2 | 30 / 35 | 7312 |
| 4 | 1 | 72.3 | 89.5 | 28 / 35 | 7554 |
| 5 | 1 | 70.0 | 85.7 | 26 / 35 | 6289 |
| 6 | 1 | 73.5 | 91.4 | 27 / 35 | 8157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 59 | 92% |
| sul.Lunar 1.1 | 43 | 95% |
| supersample.SuperBoxBot 1.0 | 22 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 14 | 100% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| dsw.StaticD 1.0 | 9 | 78% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 37% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 24% | 60 |
| dsw.StaticD 1.0 | 6 | 12% | 17 |
| sul.Lunar 1.1 | 5 | 10% | 53 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 15 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.Corners 1.0 | 1 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 13 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.0 | 115 / 210 | 2.71 | 18.6% | 37660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 18.6% | 115 |
| radnor.DoctorBob 1.42 | 2.8 | 12.1% | 24 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.8% | 20 |
| KiraNL.Chupacabra 0.4 | 4.2 | 11.1% | 14 |
| amz.NanoClone 1.41 | 5.8 | 9.9% | 9 |
| sample.Walls 1.0 | 7.0 | 8.0% | 9 |
| GarmBox.Oranges 1.0 | 8.3 | 6.7% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.3 | 18 / 35 | 5980 |
| 2 | 1 | 70.3 | 87.0 | 25 / 35 | 6786 |
| 3 | 1 | 66.4 | 75.6 | 16 / 35 | 6098 |
| 4 | 1 | 69.8 | 84.4 | 20 / 35 | 7100 |
| 5 | 1 | 67.2 | 78.7 | 20 / 35 | 5637 |
| 6 | 1 | 66.8 | 79.0 | 16 / 35 | 6059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 54 | 93% |
| radnor.DoctorBob 1.42 | 34 | 74% |
| mld.Wisdom 1.0 | 21 | 76% |
| KiraNL.Chupacabra 0.4 | 11 | 55% |
| amz.NanoClone 1.41 | 10 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 23 | 24% | 39 |
| KiraNL.Chupacabra 0.4 | 23 | 24% | 27 |
| radnor.DoctorBob 1.42 | 18 | 19% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 61 |
| amz.NanoClone 1.41 | 5 | 5% | 13 |
| jangs.ns51 1.0 | 5 | 5% | 6 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |

