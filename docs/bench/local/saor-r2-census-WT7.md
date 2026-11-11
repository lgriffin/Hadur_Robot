# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 92.5 | 160 / 210 | 1.68 | 22.6% | 46186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.6% | 160 |
| mz.AntiGrav 1.0 | 2.7 | 13.5% | 9 |
| radnor.DoctorBob 1.42 | 2.8 | 13.7% | 16 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 13 |
| amz.NanoClone 1.41 | 4.7 | 11.1% | 5 |
| GarmBox.Oranges 1.0 | 6.3 | 6.7% | 1 |
| sample.Walls 1.0 | 7.2 | 6.4% | 3 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 92.1 | 29 / 35 | 7095 |
| 2 | 1 | 73.3 | 91.4 | 26 / 35 | 7571 |
| 3 | 1 | 74.6 | 95.9 | 30 / 35 | 8024 |
| 4 | 1 | 73.7 | 92.4 | 25 / 35 | 7619 |
| 5 | 1 | 73.7 | 92.7 | 26 / 35 | 7976 |
| 6 | 1 | 73.1 | 90.5 | 24 / 35 | 7901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 96% |
| mld.Infinity 2.2 | 44 | 91% |
| radnor.DoctorBob 1.42 | 35 | 80% |
| amz.NanoClone 1.41 | 10 | 90% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 46% | 63 |
| mz.AntiGrav 1.0 | 9 | 18% | 64 |
| mld.Infinity 2.2 | 9 | 18% | 49 |
| amz.NanoClone 1.41 | 5 | 10% | 12 |
| jangs.ns51 1.0 | 2 | 4% | 4 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.4 | 127 / 210 | 2.22 | 19.2% | 34663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.2% | 127 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.6% | 47 |
| mld.DustBunny 3.8 | 2.5 | 14.0% | 10 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.8% | 9 |
| fullsail.SweetTea 1.1 | 6.5 | 7.5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.7% | 2 |
| zyx.nano.Ant 1.1 | 7.3 | 7.2% | 0 |
| bzdp.BoxCar 2.0 | 8.3 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 26 / 35 | 6359 |
| 2 | 1 | 69.3 | 89.5 | 19 / 35 | 5502 |
| 3 | 1 | 69.1 | 90.8 | 23 / 35 | 5108 |
| 4 | 1 | 70.4 | 93.7 | 25 / 35 | 5724 |
| 5 | 1 | 68.7 | 84.4 | 22 / 35 | 5665 |
| 6 | 1 | 66.2 | 69.8 | 12 / 35 | 6305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 94% |
| oog.melee.Mercutio 1.0 | 57 | 81% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 33% | 78 |
| mld.DustBunny 3.8 | 20 | 24% | 79 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 16% | 19 |
| maribo.melee.BMV 0.1 | 10 | 12% | 13 |
| fullsail.SweetTea 1.1 | 3 | 4% | 6 |
| zyx.nano.Ant 1.1 | 3 | 4% | 4 |
| cs.Grudge 1.0 | 3 | 4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.7 | 139 / 210 | 2.38 | 20.4% | 39191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.4% | 139 |
| myl.micro.Troodon 1.10 | 2.2 | 14.2% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 8 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.7% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.6% | 16 |
| fm.mammillarias 1.3 | 5.8 | 8.9% | 3 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 5 |
| sample.Fire 1.0 | 9.3 | 5.1% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 81.3 | 24 / 35 | 6427 |
| 2 | 1 | 70.4 | 84.8 | 22 / 35 | 6845 |
| 3 | 1 | 72.0 | 88.3 | 26 / 35 | 7101 |
| 4 | 1 | 70.4 | 86.3 | 25 / 35 | 6232 |
| 5 | 1 | 69.9 | 85.4 | 19 / 35 | 6273 |
| 6 | 1 | 70.3 | 81.9 | 23 / 35 | 6313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 79% |
| cb.nano.Insomnia 1.0 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 20 | 100% |
| sp.Nanos.Ember 1.1 | 11 | 73% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 23% | 37 |
| cb.nano.Insomnia 1.0 | 13 | 18% | 22 |
| myl.micro.Troodon 1.10 | 12 | 17% | 61 |
| fm.mammillarias 1.3 | 9 | 13% | 14 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 20 |
| sample.Fire 1.0 | 6 | 8% | 10 |
| myl.nano.KomoriNinja 1.1 | 5 | 7% | 34 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 9 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 85.6 | 150 / 210 | 2.30 | 20.8% | 41247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.8% | 150 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 14 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 17 |
| tj.zombie1n 1.0.1 | 5.0 | 8.8% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 5.7 | 8.5% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.4% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.3% | 12 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 5 |
| repositorio.NanoStep 1.0 | 9.3 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 83.5 | 23 / 35 | 6511 |
| 2 | 1 | 69.8 | 84.8 | 25 / 35 | 6130 |
| 3 | 1 | 72.4 | 90.8 | 29 / 35 | 7364 |
| 4 | 1 | 70.1 | 82.9 | 25 / 35 | 6807 |
| 5 | 1 | 69.9 | 83.8 | 23 / 35 | 6855 |
| 6 | 1 | 71.8 | 87.9 | 25 / 35 | 7580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 89% |
| stelo.SoJNanoMelee 1.1 | 28 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 27 | 93% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| tj.zombie1n 1.0.1 | 14 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 33% | 82 |
| stelo.SoJNanoMelee 1.1 | 12 | 20% | 27 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 31 |
| tj.zombie1n 1.0.1 | 6 | 10% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 30 |
| yk.JahMicro 1.0 | 4 | 7% | 12 |
| repositorio.NanoStep 1.0 | 2 | 3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 3 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.7 | 87 / 210 | 3.63 | 16.5% | 31446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.5% | 87 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 38 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 25 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 9 |
| sam.Samspin 1.0 | 5.8 | 10.0% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.9% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 71.1 | 14 / 35 | 5010 |
| 2 | 1 | 66.8 | 76.2 | 17 / 35 | 5709 |
| 3 | 1 | 64.6 | 70.2 | 13 / 35 | 5346 |
| 4 | 1 | 67.7 | 79.7 | 19 / 35 | 5707 |
| 5 | 1 | 65.0 | 70.8 | 16 / 35 | 5241 |
| 6 | 1 | 58.9 | 56.5 | 8 / 35 | 4433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 85% |
| oog.melee.Corsair 1.0 | 30 | 60% |
| ahf.NanoAndrew .4 | 19 | 79% |
| sam.Samspin 1.0 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 25% |

Hadur died in 124 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 43 |
| oog.melee.Corsair 1.0 | 20 | 16% | 42 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 30 |
| ahf.NanoAndrew .4 | 16 | 13% | 31 |
| EBBU.Sim2 1.02 | 15 | 12% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 10% | 13 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 11 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.9 | 140 / 210 | 2.27 | 19.8% | 36125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.8% | 140 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.5% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.6% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 9 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.3% | 3 |
| fm.claire 1.7 | 6.0 | 8.5% | 1 |
| pa.Improved 1.0 | 8.5 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.2 | 6.1% | 1 |
| sample.SpinBot 1.0 | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 29 / 35 | 6505 |
| 2 | 1 | 69.8 | 87.0 | 25 / 35 | 5586 |
| 3 | 1 | 68.8 | 81.6 | 21 / 35 | 6055 |
| 4 | 1 | 70.2 | 89.2 | 23 / 35 | 6028 |
| 5 | 1 | 67.8 | 81.6 | 20 / 35 | 5744 |
| 6 | 1 | 69.2 | 83.2 | 22 / 35 | 6207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 84 | 88% |
| oog.melee.CapuletDroid 1.1 | 28 | 86% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| kurios.DOSexe .9b | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 39% | 96 |
| oog.melee.CapuletDroid 1.1 | 10 | 14% | 37 |
| gh.nano.Grofvuil 0.2 | 8 | 11% | 23 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 13 |
| kurios.DOSexe .9b | 5 | 7% | 13 |
| pa.Improved 1.0 | 4 | 6% | 8 |
| sample.SpinBot 1.0 | 4 | 6% | 5 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 9 |
| fm.claire 1.7 | 3 | 4% | 6 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.0 | 101 / 210 | 2.71 | 18.2% | 34738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.2% | 101 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.4% | 31 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 32 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.5% | 3 |
| DBall.Anarchy 0.1 | 5.7 | 8.4% | 4 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 0 |
| acogdev.alpha 0.2 | 8.5 | 5.8% | 2 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.7% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 77.1 | 19 / 35 | 5890 |
| 2 | 1 | 68.2 | 86.3 | 18 / 35 | 5099 |
| 3 | 1 | 68.6 | 81.9 | 15 / 35 | 6198 |
| 4 | 1 | 68.9 | 82.9 | 19 / 35 | 6111 |
| 5 | 1 | 67.6 | 81.9 | 16 / 35 | 5608 |
| 6 | 1 | 66.4 | 75.9 | 14 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 83% |
| gh.micro.Gruweltje 0.7 | 34 | 59% |
| mz.MicroGodMelee 1 | 25 | 64% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 33 | 30% | 53 |
| mz.MicroGodMelee 1 | 29 | 27% | 51 |
| spinnercat.micro.Tyger 0.1 | 28 | 26% | 67 |
| fire219.CatBot 1.0 | 5 | 5% | 4 |
| acogdev.alpha 0.2 | 4 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 9 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 73.2 | 108 / 210 | 3.41 | 17.2% | 32655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 17.2% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 32 |
| germ.TheMind .2 | 4.7 | 9.5% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 1 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.0% | 7 |
| awesomeness.Elite 1.0 | 7.2 | 8.0% | 7 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.1 | 16 / 35 | 4998 |
| 2 | 1 | 70.6 | 88.6 | 28 / 35 | 6098 |
| 3 | 1 | 66.1 | 73.3 | 17 / 35 | 5752 |
| 4 | 1 | 67.9 | 78.1 | 21 / 35 | 5468 |
| 5 | 1 | 64.6 | 67.3 | 17 / 35 | 5179 |
| 6 | 3 | 61.2 | 60.6 | 9 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 95% |
| germ.TheMind .2 | 10 | 80% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 39% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 21% | 45 |
| germ.TheMind .2 | 11 | 11% | 18 |
| awesomeness.Elite 1.0 | 11 | 11% | 14 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.7 | 158 / 210 | 1.75 | 21.0% | 33941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.0% | 158 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 12 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.3% | 2 |
| maribo.IotaCT 1.1 | 5.3 | 9.7% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 8.5% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 0 |
| stelo.PatternRobot 1.0 | 8.5 | 7.2% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.6 | 28 / 35 | 5946 |
| 2 | 1 | 69.0 | 83.8 | 22 / 35 | 5080 |
| 3 | 1 | 72.7 | 95.9 | 31 / 35 | 5515 |
| 4 | 1 | 71.8 | 92.1 | 25 / 35 | 5717 |
| 5 | 1 | 70.7 | 89.5 | 23 / 35 | 5862 |
| 6 | 1 | 72.7 | 94.3 | 29 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 84 | 88% |
| nz.jdc.nano.GridFu 1.0 | 40 | 88% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| timmit.nano.TimDog 0.33 | 11 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 35% | 80 |
| timmit.nano.TimDog 0.33 | 8 | 15% | 18 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 47 |
| maribo.IotaCT 1.1 | 6 | 12% | 14 |
| stelo.PatternRobot 1.0 | 4 | 8% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 14 |
| ratosh.Wesco 1.4 | 3 | 6% | 13 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 91.9 | 169 / 210 | 1.73 | 22.0% | 42477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.0% | 169 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 13 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.3% | 10 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.4% | 4 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 10 |
| sanja.First 0.1 | 5.8 | 8.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.2% | 1 |
| cvt.Firsty 1.0 | 8.8 | 6.6% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.4 | 29 / 35 | 6639 |
| 2 | 1 | 71.7 | 89.8 | 25 / 35 | 7314 |
| 3 | 1 | 72.5 | 94.0 | 26 / 35 | 7270 |
| 4 | 1 | 72.6 | 93.3 | 28 / 35 | 7234 |
| 5 | 1 | 72.6 | 93.3 | 32 / 35 | 6937 |
| 6 | 1 | 71.6 | 88.3 | 29 / 35 | 7083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 51 | 92% |
| baal.nano.N 1.42 | 47 | 89% |
| zyx.micro.Ant 1.1 | 26 | 88% |
| sanja.First 0.1 | 18 | 94% |
| cvt.Firsty 1.0 | 16 | 88% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| sample.RamFire 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 9 | 22% | 39 |
| tvv.nano.Polaris 1.2 | 7 | 17% | 66 |
| amk.Punbot.Punbot 0.01 | 7 | 17% | 11 |
| zyx.micro.Ant 1.1 | 6 | 15% | 36 |
| cvt.Firsty 1.0 | 4 | 10% | 20 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 12 |
| sanja.First 0.1 | 2 | 5% | 18 |
| sample.RamFire 1.0 | 2 | 5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.5 | 84 / 210 | 3.74 | 15.9% | 32178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 15.9% | 84 |
| kc.micro.Figment 1.0 | 2.2 | 14.4% | 58 |
| cs.Wren 1.0 | 3.0 | 12.7% | 23 |
| js.PinBall 1.6 | 4.2 | 11.3% | 14 |
| mz.Cork 0.1 | 4.5 | 11.0% | 13 |
| joe.ADinosaur 1.0 | 6.3 | 8.7% | 3 |
| evd.X1 0.01 | 6.8 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 10 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 65.1 | 11 / 35 | 4644 |
| 2 | 1 | 66.3 | 75.2 | 14 / 35 | 6096 |
| 3 | 1 | 65.1 | 73.7 | 14 / 35 | 5837 |
| 4 | 1 | 64.6 | 70.8 | 16 / 35 | 5174 |
| 5 | 1 | 62.6 | 65.7 | 15 / 35 | 5021 |
| 6 | 1 | 62.9 | 66.7 | 14 / 35 | 5406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 65% |
| cs.Wren 1.0 | 25 | 88% |
| js.PinBall 1.6 | 9 | 89% |
| mz.Cork 0.1 | 8 | 88% |
| donjezza.Jezza 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 37% | 91 |
| cs.Wren 1.0 | 24 | 19% | 40 |
| js.PinBall 1.6 | 18 | 14% | 22 |
| mz.Cork 0.1 | 13 | 10% | 19 |
| evd.X1 0.01 | 8 | 6% | 8 |
| joe.ADinosaur 1.0 | 7 | 6% | 13 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.6 | 131 / 210 | 2.56 | 19.1% | 31565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.1% | 131 |
| myl.nano.Graviton 1.10 | 3.2 | 11.7% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.7% | 5 |
| ntc.Opposite 1.5 | 3.7 | 10.9% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.8% | 16 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 8 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.5 | 6.1% | 10 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.0 | 21 / 35 | 5516 |
| 2 | 1 | 68.4 | 82.9 | 24 / 35 | 5181 |
| 3 | 1 | 67.8 | 82.2 | 21 / 35 | 4941 |
| 4 | 1 | 69.4 | 85.1 | 24 / 35 | 5429 |
| 5 | 1 | 69.2 | 85.7 | 20 / 35 | 5438 |
| 6 | 1 | 67.2 | 79.0 | 21 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 88% |
| ntc.Opposite 1.5 | 23 | 100% |
| stelo.AreaTargetingBot 1.1 | 16 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 71% |
| DBall.NUKE 0.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 23% | 53 |
| pfvicm.Sobieski 7.2.3b | 17 | 21% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 14% | 30 |
| stelo.AreaTargetingBot 1.1 | 11 | 14% | 28 |
| ntc.Opposite 1.5 | 8 | 10% | 21 |
| disan.Chair 2.2.0 | 7 | 9% | 17 |
| donjezza.Muncho 1.0 | 4 | 5% | 12 |
| DBall.NUKE 0.1 | 2 | 2% | 16 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.0 | 83 / 210 | 3.34 | 16.2% | 27628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 16.2% | 83 |
| oog.melee.Capulet 1.2 | 2.2 | 14.3% | 58 |
| kawigi.micro.Shiz 1.1 | 3.0 | 14.0% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.3% | 17 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.0 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.2 | 6.7% | 2 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.5 | 15 / 35 | 4663 |
| 2 | 1 | 66.8 | 76.2 | 16 / 35 | 4800 |
| 3 | 1 | 67.8 | 82.5 | 17 / 35 | 4935 |
| 4 | 1 | 65.3 | 75.2 | 13 / 35 | 4513 |
| 5 | 2 | 61.4 | 62.5 | 8 / 35 | 4177 |
| 6 | 1 | 64.2 | 71.1 | 14 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 59% |
| kawigi.micro.Shiz 1.1 | 28 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 70% |
| yagami.Tidus 0.11 | 14 | 86% |
| ejb.Polaris 1.0.1 | 6 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 42% | 77 |
| yagami.Tidus 0.11 | 23 | 18% | 33 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 12% | 35 |
| kurios.DOSexe .9a | 8 | 6% | 8 |
| ejb.Polaris 1.0.1 | 7 | 6% | 12 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.2 | 139 / 210 | 2.70 | 18.2% | 29128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.2% | 139 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 14 |
| wee.Gem 1.8.4 | 3.5 | 11.6% | 24 |
| ratosh.Nobo 0.21 | 3.7 | 11.6% | 12 |
| wompi.Quokka 1.6 | 4.8 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 6.3 | 8.9% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 2 |
| maribo.FollowFire 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 26 / 35 | 5289 |
| 2 | 1 | 68.4 | 85.1 | 23 / 35 | 5054 |
| 3 | 1 | 66.3 | 76.8 | 23 / 35 | 4790 |
| 4 | 1 | 65.2 | 71.7 | 20 / 35 | 4772 |
| 5 | 1 | 67.7 | 84.1 | 23 / 35 | 4557 |
| 6 | 1 | 67.7 | 84.1 | 24 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 96% |
| wee.Gem 1.8.4 | 37 | 95% |
| ratosh.Nobo 0.21 | 19 | 84% |
| wompi.Quokka 1.6 | 16 | 94% |
| m3thos.Eva00 1.1 | 15 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 14 | 19% | 27 |
| bzdp.Pansy 2.1 | 13 | 18% | 57 |
| wee.Gem 1.8.4 | 10 | 14% | 53 |
| bayen.UbaMicro 1.4 | 9 | 12% | 17 |
| maribo.FollowFire 1 | 9 | 12% | 9 |
| wompi.Quokka 1.6 | 8 | 11% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 9 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 5 |
| m3thos.Eva00 1.1 | 1 | 1% | 12 |

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 89.1 | 131 / 210 | 1.98 | 22.3% | 51421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.3% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 55 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 21 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.2% | 0 |
| stuff.Vlad 0.1 | 6.0 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 84.8 | 21 / 35 | 8617 |
| 2 | 1 | 73.4 | 89.8 | 23 / 35 | 8448 |
| 3 | 1 | 74.7 | 94.0 | 23 / 35 | 8642 |
| 4 | 1 | 73.5 | 87.9 | 18 / 35 | 8840 |
| 5 | 1 | 72.9 | 87.0 | 22 / 35 | 8042 |
| 6 | 1 | 74.5 | 91.1 | 24 / 35 | 8832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 126 | 75% |
| mz.NanoGod 2.02 | 18 | 72% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 51% | 143 |
| mz.NanoGod 2.02 | 25 | 32% | 40 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 11 |
| ayk.WallHugger 1.0 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.3 | 100 / 210 | 3.50 | 16.4% | 29037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.4% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 16 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.0% | 29 |
| bvh.micro.Freya 0.3 | 3.8 | 11.7% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 19 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 6 |
| conscience.Electron 1.3g | 6.8 | 8.3% | 4 |
| ap.Frederick 1.1 | 8.5 | 7.1% | 9 |
| dl.BetterWalls 1.0 | 8.8 | 6.1% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.9 | 15 / 35 | 4714 |
| 2 | 1 | 62.0 | 64.8 | 15 / 35 | 4474 |
| 3 | 1 | 64.3 | 70.8 | 17 / 35 | 4784 |
| 4 | 1 | 64.2 | 70.5 | 15 / 35 | 5044 |
| 5 | 1 | 65.8 | 75.6 | 17 / 35 | 5103 |
| 6 | 1 | 65.9 | 76.2 | 21 / 35 | 4918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 98% |
| dummy.micro.Sparrow 2.5 | 30 | 77% |
| bvh.micro.Freya 0.3 | 29 | 69% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 56% |
| ap.Frederick 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 21 | 19% | 46 |
| bvh.micro.Freya 0.3 | 21 | 19% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 29 |
| voidious.micro.BlitzBat 1.05 | 14 | 13% | 53 |
| conscience.Electron 1.3g | 10 | 9% | 14 |
| dl.BetterWalls 1.0 | 8 | 7% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 4 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.8 | 142 / 210 | 2.37 | 21.0% | 42456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.0% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 21 |
| sul.Lunar 1.1 | 3.5 | 11.1% | 11 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.6% | 14 |
| dsw.StaticD 1.0 | 5.3 | 9.1% | 10 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 0 |
| sample.Corners 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.6 | 23 / 35 | 7211 |
| 2 | 1 | 71.7 | 87.9 | 27 / 35 | 6815 |
| 3 | 1 | 68.9 | 76.2 | 19 / 35 | 6424 |
| 4 | 1 | 72.1 | 86.3 | 25 / 35 | 7503 |
| 5 | 1 | 70.4 | 80.6 | 23 / 35 | 7034 |
| 6 | 1 | 72.5 | 89.2 | 25 / 35 | 7469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 89% |
| sul.Lunar 1.1 | 31 | 100% |
| supersample.SuperBoxBot 1.0 | 26 | 85% |
| dsw.StaticD 1.0 | 15 | 60% |
| sample.MyFirstRobot 1.0 | 12 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 26 | 38% | 41 |
| dsw.StaticD 1.0 | 15 | 22% | 25 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 18% | 68 |
| sul.Lunar 1.1 | 5 | 7% | 36 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 8 |
| sample.Corners 1.0 | 3 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 10 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.7 | 107 / 210 | 2.64 | 19.0% | 40011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.0% | 107 |
| mld.Wisdom 1.0 | 2.7 | 12.8% | 30 |
| radnor.DoctorBob 1.42 | 2.8 | 12.8% | 24 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.5% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.7% | 23 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 12 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 0 |
| sample.Walls 1.0 | 8.0 | 6.9% | 3 |
| jangs.ns51 1.0 | 8.5 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 17 / 35 | 6142 |
| 2 | 1 | 68.4 | 81.6 | 17 / 35 | 6352 |
| 3 | 1 | 69.5 | 80.3 | 20 / 35 | 7261 |
| 4 | 1 | 69.3 | 82.2 | 19 / 35 | 7042 |
| 5 | 1 | 68.3 | 81.9 | 14 / 35 | 6708 |
| 6 | 1 | 69.1 | 82.9 | 20 / 35 | 6506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 80% |
| mld.Wisdom 1.0 | 28 | 61% |
| radnor.DoctorBob 1.42 | 25 | 84% |
| amz.NanoClone 1.41 | 14 | 79% |
| KiraNL.Chupacabra 0.4 | 11 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 37 | 36% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 19% | 45 |
| radnor.DoctorBob 1.42 | 16 | 16% | 44 |
| amz.NanoClone 1.41 | 11 | 11% | 19 |
| KiraNL.Chupacabra 0.4 | 7 | 7% | 19 |
| jangs.ns51 1.0 | 6 | 6% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 3 | 3% | 4 |

