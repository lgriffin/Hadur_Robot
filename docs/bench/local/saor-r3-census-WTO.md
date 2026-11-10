# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 91.4 | 160 / 210 | 1.77 | 22.2% | 44019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 22.2% | 160 |
| mz.AntiGrav 1.0 | 2.3 | 13.8% | 17 |
| mld.Infinity 2.2 | 3.2 | 12.9% | 18 |
| radnor.DoctorBob 1.42 | 3.5 | 13.1% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 0 |
| sample.Walls 1.0 | 6.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 94.0 | 28 / 35 | 7297 |
| 2 | 1 | 71.9 | 87.6 | 24 / 35 | 7203 |
| 3 | 1 | 73.4 | 90.2 | 28 / 35 | 7489 |
| 4 | 1 | 72.6 | 92.7 | 27 / 35 | 7058 |
| 5 | 1 | 74.1 | 94.9 | 27 / 35 | 7881 |
| 6 | 1 | 72.4 | 89.2 | 26 / 35 | 7091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 97% |
| mld.Infinity 2.2 | 56 | 80% |
| radnor.DoctorBob 1.42 | 31 | 90% |
| jangs.ns51 1.0 | 9 | 78% |
| amz.NanoClone 1.41 | 7 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 33% | 17 |
| radnor.DoctorBob 1.42 | 13 | 25% | 60 |
| mz.AntiGrav 1.0 | 9 | 17% | 91 |
| amz.NanoClone 1.41 | 5 | 10% | 18 |
| jangs.ns51 1.0 | 5 | 10% | 10 |
| sample.Walls 1.0 | 3 | 6% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.7 | 139 / 210 | 2.56 | 18.5% | 31230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.3 | 18.5% | 139 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.3% | 45 |
| mld.DustBunny 3.8 | 2.8 | 13.2% | 9 |
| maribo.melee.BMV 0.1 | 4.8 | 10.2% | 2 |
| zyx.nano.Ant 1.1 | 5.7 | 9.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.8 | 8.6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.6% | 4 |
| bzdp.BoxCar 2.0 | 8.3 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.1% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.6 | 30 / 35 | 5807 |
| 2 | 1 | 67.4 | 82.9 | 22 / 35 | 4753 |
| 3 | 1 | 68.5 | 84.1 | 22 / 35 | 5224 |
| 4 | 1 | 70.6 | 93.0 | 29 / 35 | 5451 |
| 5 | 1 | 69.7 | 89.5 | 25 / 35 | 5458 |
| 6 | 3 | 58.9 | 52.1 | 11 / 35 | 4537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 78% |
| mld.DustBunny 3.8 | 50 | 98% |
| djdjdj.NanoSkunk10 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 32% | 83 |
| mld.DustBunny 3.8 | 11 | 15% | 57 |
| maribo.melee.BMV 0.1 | 9 | 13% | 16 |
| cs.Grudge 1.0 | 8 | 11% | 7 |
| fullsail.SweetTea 1.1 | 6 | 8% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 11 |
| zyx.nano.Ant 1.1 | 4 | 6% | 7 |
| bzdp.BoxCar 2.0 | 0 | 0% | 3 |

## Melee bench: F03

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.9 | 144 / 210 | 2.09 | 20.9% | 38675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.9% | 144 |
| myl.micro.Troodon 1.10 | 2.2 | 13.6% | 27 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.5% | 19 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.3% | 6 |
| fm.mammillarias 1.3 | 6.2 | 8.8% | 4 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 1 |
| sample.Fire 1.0 | 9.2 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 87.6 | 24 / 35 | 6735 |
| 2 | 1 | 69.6 | 81.9 | 22 / 35 | 6181 |
| 3 | 1 | 70.6 | 88.9 | 23 / 35 | 6019 |
| 4 | 1 | 73.9 | 94.0 | 31 / 35 | 7517 |
| 5 | 1 | 70.1 | 84.4 | 21 / 35 | 6140 |
| 6 | 1 | 70.9 | 90.5 | 23 / 35 | 6083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 77% |
| myl.nano.KomoriNinja 1.1 | 24 | 96% |
| cb.nano.Insomnia 1.0 | 22 | 86% |
| sp.Nanos.Ember 1.1 | 18 | 100% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 19 | 29% | 71 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 20% | 28 |
| cb.nano.Insomnia 1.0 | 9 | 14% | 12 |
| fm.mammillarias 1.3 | 9 | 14% | 12 |
| cs.sheldor.Talon 1.1 | 7 | 11% | 15 |
| myl.nano.KomoriNinja 1.1 | 5 | 8% | 39 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 25 |
| sample.Fire 1.0 | 0 | 0% | 4 |
| sample.Tracker 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.6 | 158 / 210 | 1.93 | 21.3% | 40854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 21.3% | 158 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.8% | 13 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 13 |
| tj.zombie1n 1.0.1 | 5.0 | 9.1% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 14 |
| yk.JahMicro 1.0 | 7.0 | 7.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.8 | 27 / 35 | 6810 |
| 2 | 1 | 71.3 | 89.8 | 26 / 35 | 6949 |
| 3 | 1 | 70.9 | 87.3 | 26 / 35 | 6715 |
| 4 | 1 | 72.0 | 93.7 | 29 / 35 | 6670 |
| 5 | 1 | 71.0 | 86.3 | 23 / 35 | 7234 |
| 6 | 1 | 71.2 | 90.8 | 27 / 35 | 6476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 93% |
| stelo.SoJNanoMelee 1.1 | 41 | 85% |
| tj.zombie1n 1.0.1 | 23 | 78% |
| yk.JahMicro 1.0 | 13 | 92% |
| tvv.micro.Antares 1.1.1 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 33% | 89 |
| stelo.SoJNanoMelee 1.1 | 11 | 21% | 41 |
| tj.zombie1n 1.0.1 | 11 | 21% | 16 |
| tvv.micro.Antares 1.1.1 | 5 | 10% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 8 |
| repositorio.NanoStep 1.0 | 2 | 4% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 15 |
| yk.JahMicro 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.1 | 110 / 210 | 3.51 | 16.3% | 27620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 16.3% | 110 |
| oog.melee.Corsair 1.0 | 2.2 | 12.3% | 26 |
| ahf.NanoAndrew .4 | 3.2 | 11.5% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.5% | 16 |
| EBBU.Sim2 1.02 | 5.8 | 9.9% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.9% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.4% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.7 | 20 / 35 | 4739 |
| 2 | 1 | 64.7 | 73.3 | 18 / 35 | 4580 |
| 3 | 1 | 64.1 | 71.7 | 19 / 35 | 4721 |
| 4 | 1 | 66.3 | 78.7 | 20 / 35 | 4788 |
| 5 | 1 | 63.8 | 70.2 | 17 / 35 | 4560 |
| 6 | 1 | 61.9 | 66.0 | 16 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 84% |
| ahf.NanoAndrew .4 | 31 | 97% |
| simonton.nano.MeleeSeed 1.8 | 30 | 90% |
| EBBU.Sim2 1.02 | 11 | 82% |
| sam.Samspin 1.0 | 10 | 80% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |

Hadur died in 102 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 19 | 19% | 24 |
| simonton.nano.MeleeSeed 1.8 | 17 | 17% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 14% | 16 |
| ahf.NanoAndrew .4 | 13 | 13% | 45 |
| oog.melee.Corsair 1.0 | 11 | 11% | 35 |
| zyx.nano.BacillusComma 1.0 | 11 | 11% | 14 |
| sam.Samspin 1.0 | 8 | 8% | 20 |
| EBBU.Sim2 1.02 | 7 | 7% | 14 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.9 | 141 / 210 | 2.36 | 19.2% | 32921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.2% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 25 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.2% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.4% | 15 |
| arthord.NanoSatanMelee Beta | 5.2 | 8.8% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.8% | 7 |
| fm.claire 1.7 | 6.5 | 8.7% | 0 |
| sample.SpinBot 1.0 | 7.3 | 8.1% | 4 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.4 | 23 / 35 | 5482 |
| 2 | 1 | 68.6 | 84.4 | 23 / 35 | 5564 |
| 3 | 1 | 69.2 | 88.9 | 24 / 35 | 5129 |
| 4 | 1 | 68.2 | 79.7 | 23 / 35 | 5643 |
| 5 | 1 | 69.5 | 88.3 | 25 / 35 | 5708 |
| 6 | 1 | 68.6 | 83.5 | 23 / 35 | 5395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 85% |
| oog.melee.CapuletDroid 1.1 | 30 | 83% |
| arthord.NanoSatanMelee Beta | 22 | 86% |
| gh.nano.Grofvuil 0.2 | 19 | 95% |
| sample.SpinBot 1.0 | 9 | 78% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 34% | 87 |
| oog.melee.CapuletDroid 1.1 | 13 | 19% | 14 |
| gh.nano.Grofvuil 0.2 | 9 | 13% | 33 |
| arthord.NanoSatanMelee Beta | 9 | 13% | 19 |
| sample.SpinBot 1.0 | 6 | 9% | 15 |
| fm.claire 1.7 | 4 | 6% | 9 |
| kurios.DOSexe .9b | 3 | 4% | 10 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 15 |
| pa.Improved 1.0 | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.4 | 112 / 210 | 2.40 | 18.9% | 35243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 18.9% | 112 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.4% | 30 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.9% | 40 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 21 |
| DBall.Anarchy 0.1 | 5.5 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.0 | 6.7% | 2 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 19 / 35 | 6012 |
| 2 | 1 | 67.8 | 83.2 | 14 / 35 | 5930 |
| 3 | 1 | 67.9 | 80.3 | 16 / 35 | 5708 |
| 4 | 1 | 67.9 | 82.2 | 22 / 35 | 5580 |
| 5 | 1 | 69.6 | 88.3 | 20 / 35 | 5884 |
| 6 | 1 | 69.8 | 85.1 | 21 / 35 | 6129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 45% |
| mz.MicroGodMelee 1 | 48 | 79% |
| gh.micro.Gruweltje 0.7 | 32 | 69% |
| DBall.Anarchy 0.1 | 18 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 40% | 63 |
| gh.micro.Gruweltje 0.7 | 18 | 18% | 50 |
| mz.MicroGodMelee 1 | 18 | 18% | 45 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 14 |
| DBall.Anarchy 0.1 | 3 | 3% | 15 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 73.2 | 109 / 210 | 3.41 | 17.0% | 31714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.3 | 17.0% | 109 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.6% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.7% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 7 |
| germ.TheMind .2 | 5.5 | 9.2% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.6% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 6 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 62.9 | 13 / 35 | 5005 |
| 2 | 1 | 63.3 | 68.3 | 16 / 35 | 4608 |
| 3 | 1 | 68.8 | 81.9 | 22 / 35 | 6080 |
| 4 | 2 | 64.5 | 69.8 | 18 / 35 | 4723 |
| 5 | 1 | 68.2 | 81.0 | 23 / 35 | 5420 |
| 6 | 1 | 67.0 | 75.6 | 17 / 35 | 5878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 77% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| germ.TheMind .2 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 47% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 20% | 32 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 11 |
| awesomeness.Elite 1.0 | 7 | 7% | 12 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 14 |
| germ.TheMind .2 | 5 | 5% | 14 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.0 | 156 / 210 | 1.99 | 20.2% | 31214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.2% | 156 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 9 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 11 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.1% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.2% | 2 |
| ratosh.Wesco 1.4 | 6.8 | 8.5% | 2 |
| stelo.PatternRobot 1.0 | 8.2 | 7.4% | 9 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.5 | 27 / 35 | 5668 |
| 2 | 1 | 71.7 | 91.7 | 26 / 35 | 5637 |
| 3 | 1 | 70.1 | 87.6 | 26 / 35 | 5060 |
| 4 | 1 | 69.9 | 86.7 | 24 / 35 | 5129 |
| 5 | 1 | 69.6 | 87.0 | 27 / 35 | 4789 |
| 6 | 1 | 70.6 | 90.8 | 26 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 95% |
| nz.jdc.nano.GridFu 1.0 | 46 | 93% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| stelo.PatternRobot 1.0 | 13 | 54% |
| maribo.IotaCT 1.1 | 10 | 90% |
| ratosh.Wesco 1.4 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 24% | 65 |
| stelo.PatternRobot 1.0 | 11 | 20% | 16 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 60 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 22 |
| ratosh.Wesco 1.4 | 6 | 11% | 16 |
| maribo.IotaCT 1.1 | 5 | 9% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 6 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.8 | 182 / 210 | 1.47 | 22.2% | 39550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 22.2% | 182 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.7% | 13 |
| baal.nano.N 1.42 | 3.0 | 11.4% | 0 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 2 |
| zyx.micro.Ant 1.1 | 5.2 | 9.2% | 9 |
| sanja.First 0.1 | 6.3 | 8.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.3% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 9.0 | 6.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.5 | 32 / 35 | 6352 |
| 2 | 1 | 72.3 | 94.3 | 32 / 35 | 6524 |
| 3 | 1 | 72.0 | 94.3 | 29 / 35 | 6376 |
| 4 | 1 | 73.2 | 98.4 | 32 / 35 | 6861 |
| 5 | 1 | 72.9 | 95.2 | 29 / 35 | 7010 |
| 6 | 1 | 70.9 | 90.2 | 28 / 35 | 6427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 100% |
| tvv.nano.Polaris 1.2 | 36 | 89% |
| cvt.Firsty 1.0 | 29 | 93% |
| zyx.micro.Ant 1.1 | 28 | 86% |
| sanja.First 0.1 | 24 | 96% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 29% | 36 |
| tvv.nano.Polaris 1.2 | 5 | 18% | 61 |
| cvt.Firsty 1.0 | 4 | 14% | 29 |
| Grystrion.TrackerWO 1.0 | 4 | 14% | 17 |
| sample.RamFire 1.0 | 4 | 14% | 4 |
| sanja.First 0.1 | 2 | 7% | 20 |
| baal.nano.N 1.42 | 1 | 4% | 24 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.1 | 96 / 210 | 3.42 | 16.7% | 33376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 16.7% | 96 |
| kc.micro.Figment 1.0 | 2.2 | 14.3% | 63 |
| cs.Wren 1.0 | 3.2 | 12.5% | 18 |
| js.PinBall 1.6 | 4.0 | 11.4% | 11 |
| mz.Cork 0.1 | 4.7 | 10.6% | 8 |
| joe.ADinosaur 1.0 | 6.0 | 9.6% | 5 |
| evd.X1 0.01 | 7.2 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.6% | 4 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 3 |
| PSW.Relentless 0.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 65.1 | 12 / 35 | 5499 |
| 2 | 1 | 63.9 | 68.9 | 14 / 35 | 5424 |
| 3 | 1 | 64.9 | 73.3 | 16 / 35 | 5318 |
| 4 | 1 | 67.1 | 80.0 | 20 / 35 | 5694 |
| 5 | 1 | 69.5 | 87.3 | 21 / 35 | 5918 |
| 6 | 1 | 63.0 | 63.8 | 13 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 56% |
| cs.Wren 1.0 | 22 | 95% |
| js.PinBall 1.6 | 15 | 100% |
| mz.Cork 0.1 | 13 | 92% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| PSW.Relentless 0.1 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 61 | 52% | 110 |
| cs.Wren 1.0 | 14 | 12% | 25 |
| joe.ADinosaur 1.0 | 11 | 9% | 16 |
| mz.Cork 0.1 | 8 | 7% | 13 |
| evd.X1 0.01 | 8 | 7% | 11 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| js.PinBall 1.6 | 4 | 3% | 17 |
| jsal.Jsalbot 1.0 | 3 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.4 | 132 / 210 | 2.31 | 19.2% | 30244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 19.2% | 132 |
| myl.nano.Graviton 1.10 | 3.3 | 11.1% | 15 |
| ntc.Opposite 1.5 | 4.0 | 10.9% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.6% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.1% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.8% | 4 |
| DBall.NUKE 0.1 | 7.2 | 8.4% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 6 |
| pbg.R2D2 1.0 | 9.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 6.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.1 | 22 / 35 | 5461 |
| 2 | 1 | 66.5 | 81.3 | 16 / 35 | 4487 |
| 3 | 1 | 67.7 | 84.4 | 21 / 35 | 4755 |
| 4 | 1 | 68.9 | 84.8 | 24 / 35 | 5226 |
| 5 | 1 | 68.3 | 84.8 | 25 / 35 | 5069 |
| 6 | 1 | 70.4 | 92.4 | 24 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 86% |
| stelo.AreaTargetingBot 1.1 | 37 | 65% |
| ntc.Opposite 1.5 | 19 | 89% |
| donjezza.Muncho 1.0 | 17 | 88% |
| disan.Chair 2.2.0 | 15 | 73% |
| DBall.NUKE 0.1 | 15 | 93% |
| pfvicm.Sobieski 7.2.3b | 14 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 25 | 30% | 52 |
| pfvicm.Sobieski 7.2.3b | 18 | 22% | 30 |
| ntc.Opposite 1.5 | 11 | 13% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 10% | 18 |
| disan.Chair 2.2.0 | 7 | 9% | 14 |
| myl.nano.Graviton 1.10 | 5 | 6% | 33 |
| DBall.NUKE 0.1 | 4 | 5% | 19 |
| donjezza.Muncho 1.0 | 3 | 4% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.0 | 82 / 210 | 3.43 | 15.8% | 26443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 15.8% | 82 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 45 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 37 |
| yagami.Tidus 0.11 | 4.2 | 12.5% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.2% | 20 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 2 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 15 / 35 | 4557 |
| 2 | 1 | 63.7 | 69.8 | 13 / 35 | 4338 |
| 3 | 1 | 63.4 | 67.9 | 15 / 35 | 4217 |
| 4 | 1 | 65.0 | 74.6 | 13 / 35 | 4601 |
| 5 | 1 | 63.9 | 71.4 | 12 / 35 | 4391 |
| 6 | 1 | 64.6 | 70.8 | 14 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 73% |
| oog.melee.Capulet 1.2 | 27 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 84% |
| yagami.Tidus 0.11 | 17 | 82% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 128 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 38% | 67 |
| kawigi.micro.Shiz 1.1 | 21 | 16% | 38 |
| yagami.Tidus 0.11 | 19 | 15% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 13% | 43 |
| ejb.Polaris 1.0.1 | 11 | 9% | 15 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 5 | 4% | 7 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.6 | 125 / 210 | 2.92 | 17.5% | 27848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 17.5% | 125 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 25 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 23 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 12 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 11 |
| m3thos.Eva00 1.1 | 5.5 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 7.3 | 8.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.7 | 16 / 35 | 4579 |
| 2 | 1 | 66.3 | 78.4 | 24 / 35 | 4407 |
| 3 | 1 | 65.3 | 74.9 | 19 / 35 | 4597 |
| 4 | 1 | 64.3 | 74.3 | 19 / 35 | 4299 |
| 5 | 1 | 69.6 | 92.1 | 25 / 35 | 5136 |
| 6 | 1 | 66.8 | 80.3 | 22 / 35 | 4830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 39 | 90% |
| bzdp.Pansy 2.1 | 35 | 94% |
| wompi.Quokka 1.6 | 26 | 85% |
| ratosh.Nobo 0.21 | 20 | 85% |
| m3thos.Eva00 1.1 | 11 | 82% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 16 | 19% | 18 |
| wompi.Quokka 1.6 | 14 | 16% | 24 |
| bzdp.Pansy 2.1 | 10 | 12% | 42 |
| m3thos.Eva00 1.1 | 10 | 12% | 18 |
| ratosh.Nobo 0.21 | 9 | 10% | 27 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 12 |
| bayen.UbaMicro 1.4 | 7 | 8% | 17 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 7 |
| wee.Gem 1.8.4 | 5 | 6% | 40 |

## Melee bench: F15

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 81.9 | 57 / 210 | 2.63 | 19.1% | 45485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.6% | 127 |
| hadur117.micro.SaorWTO 0.1 | 1.5 | 19.1% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 17 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 3 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 3 |
| stuff.Vlad 0.1 | 6.0 | 8.7% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 75.6 | 9 / 35 | 6972 |
| 2 | 1 | 71.0 | 86.3 | 7 / 35 | 7865 |
| 3 | 2 | 69.7 | 81.9 | 9 / 35 | 7319 |
| 4 | 1 | 70.6 | 84.1 | 12 / 35 | 7759 |
| 5 | 2 | 68.9 | 76.2 | 9 / 35 | 7347 |
| 6 | 1 | 71.7 | 87.0 | 11 / 35 | 8223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 113 | 22% |
| mz.NanoGod 2.02 | 16 | 81% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |
| ayk.WallHugger 1.0 | 4 | 75% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 106 | 69% | 136 |
| mz.NanoGod 2.02 | 21 | 14% | 37 |
| exauge.GateKeeper 1.1.121g | 11 | 7% | 12 |
| ayk.WallHugger 1.0 | 10 | 6% | 13 |
| stelo.PianistNano 1.2 | 3 | 2% | 3 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.9 | 110 / 210 | 3.53 | 16.5% | 28596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 16.5% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 32 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.6% | 17 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 17 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.4% | 6 |
| conscience.Electron 1.3g | 7.2 | 8.4% | 0 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 9 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 63.5 | 14 / 35 | 4413 |
| 2 | 1 | 67.7 | 81.3 | 21 / 35 | 5349 |
| 3 | 1 | 65.8 | 73.7 | 21 / 35 | 4871 |
| 4 | 1 | 62.2 | 66.0 | 17 / 35 | 4453 |
| 5 | 1 | 65.6 | 75.2 | 21 / 35 | 4795 |
| 6 | 1 | 64.2 | 71.7 | 16 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 62% |
| dummy.micro.Sparrow 2.5 | 30 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 83% |
| bvh.micro.Freya 0.3 | 21 | 100% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 7 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 23% | 46 |
| conscience.Electron 1.3g | 20 | 20% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 15 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 11% | 42 |
| dl.BetterWalls 1.0 | 9 | 9% | 16 |
| bvh.micro.Freya 0.3 | 6 | 6% | 14 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 14 |

## Melee bench: F17

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.2 | 150 / 210 | 2.33 | 20.7% | 40246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 20.7% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.8% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 15 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.3% | 17 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 2 |
| dsw.StaticD 1.0 | 6.5 | 8.2% | 1 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 7.0% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 4 |
| sample.Corners 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 90.5 | 26 / 35 | 7450 |
| 2 | 1 | 70.3 | 80.3 | 24 / 35 | 6863 |
| 3 | 1 | 71.9 | 89.2 | 25 / 35 | 6881 |
| 4 | 1 | 69.4 | 82.2 | 25 / 35 | 6197 |
| 5 | 1 | 70.0 | 83.5 | 24 / 35 | 6378 |
| 6 | 1 | 70.5 | 85.7 | 26 / 35 | 6477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 98% |
| supersample.SuperBoxBot 1.0 | 36 | 67% |
| sul.Lunar 1.1 | 35 | 97% |
| sample.MyFirstJuniorRobot 1.0 | 14 | 93% |
| dsw.StaticD 1.0 | 12 | 92% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 31 | 49% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 16% | 54 |
| dsw.StaticD 1.0 | 7 | 11% | 21 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 17 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 8 |
| sul.Lunar 1.1 | 2 | 3% | 42 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| sample.Corners 1.0 | 1 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 1 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTO 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 78.3 | 107 / 210 | 2.95 | 17.9% | 36470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTO 0.1 | 1.0 | 17.9% | 107 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 32 |
| mld.Wisdom 1.0 | 3.3 | 12.0% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 22 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.6% | 12 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 7 |
| sample.Walls 1.0 | 7.3 | 7.7% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 7 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.3 | 19 / 35 | 6276 |
| 2 | 1 | 62.7 | 67.0 | 13 / 35 | 5082 |
| 3 | 1 | 66.7 | 76.8 | 18 / 35 | 6090 |
| 4 | 1 | 67.7 | 77.8 | 19 / 35 | 6316 |
| 5 | 1 | 69.1 | 85.1 | 19 / 35 | 6571 |
| 6 | 1 | 67.9 | 81.9 | 19 / 35 | 6135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 89% |
| radnor.DoctorBob 1.42 | 36 | 81% |
| mld.Wisdom 1.0 | 16 | 75% |
| amz.NanoClone 1.41 | 12 | 83% |
| KiraNL.Chupacabra 0.4 | 12 | 58% |
| sample.Walls 1.0 | 7 | 86% |
| jangs.ns51 1.0 | 7 | 57% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 31% | 43 |
| radnor.DoctorBob 1.42 | 25 | 24% | 58 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 9% | 45 |
| jangs.ns51 1.0 | 7 | 7% | 11 |
| sample.Walls 1.0 | 7 | 7% | 10 |
| amz.NanoClone 1.41 | 4 | 4% | 13 |
| GarmBox.Oranges 1.0 | 4 | 4% | 7 |

