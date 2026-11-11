# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 92.4 | 165 / 210 | 1.69 | 22.5% | 45173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.5% | 165 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 23 |
| mz.AntiGrav 1.0 | 2.8 | 13.6% | 8 |
| mld.Infinity 2.2 | 3.8 | 12.8% | 12 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 1 |
| sample.Walls 1.0 | 6.3 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 6.5% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.5 | 94.0 | 30 / 35 | 7973 |
| 2 | 1 | 74.3 | 96.2 | 29 / 35 | 7712 |
| 3 | 1 | 74.0 | 94.6 | 30 / 35 | 7878 |
| 4 | 1 | 70.6 | 82.5 | 20 / 35 | 7094 |
| 5 | 1 | 73.7 | 94.9 | 30 / 35 | 7133 |
| 6 | 1 | 72.9 | 92.1 | 26 / 35 | 7383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 99% |
| mld.Infinity 2.2 | 53 | 92% |
| radnor.DoctorBob 1.42 | 40 | 83% |
| amz.NanoClone 1.41 | 9 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 51% | 80 |
| mz.AntiGrav 1.0 | 8 | 18% | 68 |
| mld.Infinity 2.2 | 7 | 16% | 18 |
| sample.Walls 1.0 | 2 | 4% | 11 |
| jangs.ns51 1.0 | 2 | 4% | 7 |
| GarmBox.Oranges 1.0 | 2 | 4% | 4 |
| amz.NanoClone 1.41 | 1 | 2% | 11 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.1 | 152 / 210 | 2.07 | 19.4% | 31420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 152 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.2% | 34 |
| mld.DustBunny 3.8 | 3.3 | 12.3% | 7 |
| maribo.melee.BMV 0.1 | 3.8 | 10.8% | 3 |
| djdjdj.NanoSkunk10 1.0 | 4.7 | 9.1% | 6 |
| zyx.nano.Ant 1.1 | 6.5 | 8.4% | 1 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.2 | 6.9% | 4 |
| fullsail.SweetTea 1.1 | 8.3 | 7.2% | 3 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.2 | 25 / 35 | 5119 |
| 2 | 1 | 68.7 | 85.4 | 25 / 35 | 5535 |
| 3 | 1 | 67.8 | 82.2 | 22 / 35 | 5154 |
| 4 | 1 | 70.1 | 90.8 | 28 / 35 | 5331 |
| 5 | 1 | 68.8 | 87.6 | 24 / 35 | 4953 |
| 6 | 1 | 70.5 | 92.4 | 28 / 35 | 5328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 78 | 83% |
| mld.DustBunny 3.8 | 51 | 94% |
| djdjdj.NanoSkunk10 1.0 | 18 | 94% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 5 | 60% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 21 | 36% | 84 |
| mld.DustBunny 3.8 | 9 | 15% | 47 |
| maribo.melee.BMV 0.1 | 8 | 14% | 17 |
| zyx.nano.Ant 1.1 | 8 | 14% | 13 |
| djdjdj.NanoSkunk10 1.0 | 4 | 7% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 13 |
| fullsail.SweetTea 1.1 | 3 | 5% | 10 |
| cs.Grudge 1.0 | 2 | 3% | 1 |
| bzdp.BoxCar 2.0 | 1 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.8 | 150 / 210 | 2.19 | 20.7% | 37888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.7% | 150 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 24 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.4% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.3% | 9 |
| fm.mammillarias 1.3 | 5.0 | 9.3% | 1 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.2% | 9 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.1% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 1 |
| sample.Fire 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.4 | 27 / 35 | 6476 |
| 2 | 1 | 68.0 | 77.1 | 19 / 35 | 5853 |
| 3 | 1 | 71.3 | 86.0 | 26 / 35 | 7001 |
| 4 | 1 | 70.8 | 86.3 | 23 / 35 | 6401 |
| 5 | 1 | 71.5 | 90.2 | 28 / 35 | 6047 |
| 6 | 1 | 71.4 | 88.9 | 27 / 35 | 6110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 95% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| myl.nano.KomoriNinja 1.1 | 19 | 84% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| fm.mammillarias 1.3 | 8 | 100% |
| sample.Fire 1.0 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 14 | 23% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 22% | 39 |
| myl.nano.KomoriNinja 1.1 | 8 | 13% | 37 |
| fm.mammillarias 1.3 | 7 | 12% | 13 |
| sp.Nanos.Ember 1.1 | 5 | 8% | 20 |
| sample.Fire 1.0 | 5 | 8% | 10 |
| cb.nano.Insomnia 1.0 | 3 | 5% | 8 |
| sample.Tracker 1.0 | 3 | 5% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 11 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 86.0 | 154 / 210 | 2.26 | 20.4% | 38700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.4% | 154 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 12 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 13 |
| tj.zombie1n 1.0.1 | 5.0 | 9.5% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.4% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 11 |
| yk.JahMicro 1.0 | 7.2 | 7.7% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.8% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 83.5 | 23 / 35 | 6544 |
| 2 | 1 | 68.9 | 81.6 | 23 / 35 | 6228 |
| 3 | 1 | 71.2 | 87.6 | 27 / 35 | 6886 |
| 4 | 1 | 72.1 | 93.0 | 31 / 35 | 6455 |
| 5 | 1 | 69.2 | 83.2 | 25 / 35 | 6112 |
| 6 | 1 | 70.5 | 87.3 | 25 / 35 | 6475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 89% |
| stelo.SoJNanoMelee 1.1 | 44 | 93% |
| tj.zombie1n 1.0.1 | 26 | 81% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 91% |
| yk.JahMicro 1.0 | 6 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 50% |

Hadur died in 56 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 36% | 77 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 36 |
| tj.zombie1n 1.0.1 | 9 | 16% | 12 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 29 |
| yk.JahMicro 1.0 | 5 | 9% | 9 |
| repositorio.NanoStep 1.0 | 3 | 5% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.3 | 105 / 210 | 3.40 | 16.5% | 28857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.5% | 105 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 33 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.3% | 17 |
| ahf.NanoAndrew .4 | 3.8 | 11.4% | 25 |
| sam.Samspin 1.0 | 5.3 | 9.7% | 11 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.7% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 79.7 | 23 / 35 | 5060 |
| 2 | 1 | 61.7 | 61.3 | 16 / 35 | 4817 |
| 3 | 1 | 65.3 | 78.4 | 18 / 35 | 4713 |
| 4 | 1 | 63.0 | 69.5 | 13 / 35 | 4500 |
| 5 | 1 | 64.9 | 75.9 | 16 / 35 | 4707 |
| 6 | 1 | 65.9 | 75.2 | 19 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 94% |
| oog.melee.Corsair 1.0 | 34 | 71% |
| ahf.NanoAndrew .4 | 21 | 81% |
| EBBU.Sim2 1.02 | 14 | 86% |
| sam.Samspin 1.0 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 19% | 47 |
| oog.melee.Corsair 1.0 | 18 | 17% | 46 |
| ahf.NanoAndrew .4 | 14 | 13% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 13% | 16 |
| EBBU.Sim2 1.02 | 10 | 10% | 16 |
| sample.TrackFire 1.0 | 8 | 8% | 9 |
| zyx.nano.BacillusComma 1.0 | 7 | 7% | 16 |
| sam.Samspin 1.0 | 7 | 7% | 15 |
| robar.nano.Assertive_Melee 0.2 | 7 | 7% | 11 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.9 | 170 / 210 | 1.64 | 20.9% | 34193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.9% | 170 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.7% | 12 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.6% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.5% | 4 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 4 |
| fm.claire 1.7 | 6.7 | 8.0% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 0 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.7 | 31 / 35 | 5317 |
| 2 | 1 | 69.8 | 88.9 | 26 / 35 | 5601 |
| 3 | 1 | 72.1 | 95.6 | 31 / 35 | 5989 |
| 4 | 1 | 70.4 | 93.0 | 27 / 35 | 5435 |
| 5 | 1 | 71.6 | 94.0 | 29 / 35 | 6043 |
| 6 | 1 | 70.8 | 92.4 | 26 / 35 | 5808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 97% |
| oog.melee.CapuletDroid 1.1 | 41 | 85% |
| gh.nano.Grofvuil 0.2 | 21 | 90% |
| arthord.NanoSatanMelee Beta | 16 | 88% |
| sample.SpinBot 1.0 | 13 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 25% | 81 |
| oog.melee.CapuletDroid 1.1 | 8 | 20% | 21 |
| gh.nano.Grofvuil 0.2 | 6 | 15% | 33 |
| fm.claire 1.7 | 6 | 15% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 10% | 18 |
| winamp32.micro.MicroMacro 1.0 | 3 | 8% | 21 |
| kurios.DOSexe .9b | 2 | 5% | 11 |
| sample.SpinBot 1.0 | 1 | 3% | 9 |
| pa.Improved 1.0 | 0 | 0% | 6 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.1 | 99 / 210 | 2.43 | 18.5% | 34080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.5% | 99 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.8% | 46 |
| mz.MicroGodMelee 1 | 3.0 | 13.6% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.4% | 18 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 2 |
| acogdev.alpha 0.2 | 8.2 | 5.9% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.5 | 18 / 35 | 5568 |
| 2 | 1 | 67.3 | 83.5 | 17 / 35 | 5080 |
| 3 | 1 | 67.1 | 84.4 | 12 / 35 | 5146 |
| 4 | 1 | 68.7 | 83.8 | 20 / 35 | 5607 |
| 5 | 1 | 69.1 | 83.8 | 19 / 35 | 6145 |
| 6 | 1 | 69.3 | 85.4 | 13 / 35 | 6534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 53 | 47% |
| spinnercat.micro.Tyger 0.1 | 48 | 92% |
| gh.micro.Gruweltje 0.7 | 31 | 32% |
| DBall.Anarchy 0.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 44 | 40% | 77 |
| gh.micro.Gruweltje 0.7 | 29 | 26% | 47 |
| spinnercat.micro.Tyger 0.1 | 22 | 20% | 56 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 6 |
| acogdev.alpha 0.2 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 76.6 | 123 / 210 | 3.10 | 17.7% | 33271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.7% | 123 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.9% | 24 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.6% | 5 |
| germ.TheMind .2 | 5.2 | 9.0% | 4 |
| awesomeness.Elite 1.0 | 6.3 | 8.3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.5% | 3 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.2 | 17 / 35 | 5594 |
| 2 | 1 | 65.0 | 69.2 | 19 / 35 | 5618 |
| 3 | 1 | 68.4 | 82.5 | 22 / 35 | 5829 |
| 4 | 1 | 66.3 | 75.2 | 20 / 35 | 5257 |
| 5 | 1 | 66.7 | 76.2 | 21 / 35 | 5640 |
| 6 | 1 | 67.8 | 81.3 | 24 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| germ.TheMind .2 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 36 | 41% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 31% | 47 |
| qualidafial.MajorDick 1.0.1 | 6 | 7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 6% | 12 |
| germ.TheMind .2 | 5 | 6% | 9 |
| awesomeness.Elite 1.0 | 4 | 5% | 17 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.7 | 154 / 210 | 2.38 | 19.4% | 29859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 154 |
| rz.HawkOnFire 0.1 | 2.0 | 13.2% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.9% | 12 |
| maribo.IotaCT 1.1 | 4.3 | 10.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.0% | 3 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.4% | 6 |
| ratosh.Wesco 1.4 | 7.2 | 8.6% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.9% | 8 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.9 | 28 / 35 | 5153 |
| 2 | 1 | 68.3 | 82.5 | 25 / 35 | 4364 |
| 3 | 1 | 69.4 | 81.9 | 23 / 35 | 5603 |
| 4 | 1 | 69.1 | 82.9 | 24 / 35 | 4970 |
| 5 | 1 | 70.3 | 87.9 | 27 / 35 | 4765 |
| 6 | 1 | 69.7 | 85.1 | 27 / 35 | 5004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 98% |
| nz.jdc.nano.GridFu 1.0 | 36 | 100% |
| stelo.PatternRobot 1.0 | 16 | 100% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 15 | 27% | 36 |
| rz.HawkOnFire 0.1 | 9 | 16% | 60 |
| stelo.PatternRobot 1.0 | 9 | 16% | 19 |
| ratosh.Wesco 1.4 | 7 | 13% | 22 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 38 |
| spinnercat.Omen 1.0 | 4 | 7% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 5 |
| maribo.IotaCT 1.1 | 2 | 4% | 16 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.2 | 181 / 210 | 1.61 | 22.2% | 40416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.2% | 181 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.1% | 5 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.3% | 2 |
| zyx.micro.Ant 1.1 | 5.2 | 8.7% | 4 |
| sanja.First 0.1 | 5.7 | 8.5% | 2 |
| cvt.Firsty 1.0 | 7.2 | 7.9% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.3 | 30 / 35 | 6875 |
| 2 | 1 | 73.5 | 98.7 | 32 / 35 | 6872 |
| 3 | 1 | 73.1 | 98.1 | 33 / 35 | 6715 |
| 4 | 1 | 70.5 | 85.1 | 27 / 35 | 6536 |
| 5 | 1 | 72.1 | 93.7 | 31 / 35 | 6449 |
| 6 | 1 | 71.8 | 90.5 | 28 / 35 | 6969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 88% |
| cvt.Firsty 1.0 | 32 | 97% |
| baal.nano.N 1.42 | 31 | 97% |
| sanja.First 0.1 | 29 | 100% |
| zyx.micro.Ant 1.1 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 8 | 26% | 63 |
| zyx.micro.Ant 1.1 | 5 | 16% | 27 |
| Grystrion.TrackerWO 1.0 | 4 | 13% | 14 |
| sample.RamFire 1.0 | 4 | 13% | 7 |
| baal.nano.N 1.42 | 3 | 10% | 29 |
| sanja.First 0.1 | 2 | 6% | 29 |
| cvt.Firsty 1.0 | 2 | 6% | 21 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 13 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 2 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.4 | 87 / 210 | 3.75 | 15.5% | 29575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.0% | 69 |
| hadur117.micro.SaorC 0.1 | 1.5 | 15.5% | 87 |
| cs.Wren 1.0 | 3.5 | 12.8% | 19 |
| mz.Cork 0.1 | 4.2 | 11.6% | 16 |
| js.PinBall 1.6 | 4.3 | 11.3% | 12 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 4 |
| evd.X1 0.01 | 6.7 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 1 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 62.2 | 10 / 35 | 4999 |
| 2 | 1 | 66.7 | 79.0 | 20 / 35 | 5205 |
| 3 | 1 | 63.7 | 67.0 | 17 / 35 | 5009 |
| 4 | 2 | 63.5 | 69.8 | 17 / 35 | 4726 |
| 5 | 2 | 61.6 | 66.3 | 8 / 35 | 4628 |
| 6 | 1 | 64.3 | 72.1 | 15 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 60% |
| cs.Wren 1.0 | 30 | 100% |
| mz.Cork 0.1 | 12 | 50% |
| js.PinBall 1.6 | 8 | 63% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 44% | 100 |
| evd.X1 0.01 | 17 | 14% | 21 |
| js.PinBall 1.6 | 13 | 10% | 20 |
| joe.ADinosaur 1.0 | 13 | 10% | 14 |
| mz.Cork 0.1 | 11 | 9% | 23 |
| cs.Wren 1.0 | 10 | 8% | 19 |
| PSW.Relentless 0.1 | 5 | 4% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.5 | 146 / 210 | 2.30 | 19.4% | 29901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 146 |
| myl.nano.Graviton 1.10 | 3.3 | 11.2% | 20 |
| ntc.Opposite 1.5 | 3.7 | 10.8% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.3% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.5% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 5 |
| DBall.NUKE 0.1 | 7.3 | 8.1% | 4 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 26 / 35 | 4775 |
| 2 | 1 | 67.8 | 82.2 | 22 / 35 | 4970 |
| 3 | 1 | 69.8 | 87.3 | 26 / 35 | 5158 |
| 4 | 1 | 68.0 | 85.4 | 21 / 35 | 4882 |
| 5 | 1 | 70.2 | 90.8 | 27 / 35 | 5001 |
| 6 | 1 | 68.5 | 82.5 | 24 / 35 | 5115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 89% |
| myl.nano.Graviton 1.10 | 33 | 88% |
| ntc.Opposite 1.5 | 22 | 95% |
| DBall.NUKE 0.1 | 18 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| disan.Chair 2.2.0 | 11 | 100% |
| donjezza.Muncho 1.0 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 12 | 19% | 32 |
| pfvicm.Sobieski 7.2.3b | 12 | 19% | 19 |
| myl.nano.Graviton 1.10 | 11 | 17% | 41 |
| stelo.AreaTargetingBot 1.1 | 10 | 16% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 14% | 29 |
| donjezza.Muncho 1.0 | 5 | 8% | 13 |
| pbg.R2D2 1.0 | 3 | 5% | 8 |
| DBall.NUKE 0.1 | 1 | 2% | 17 |
| disan.Chair 2.2.0 | 1 | 2% | 5 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.1 | 96 / 210 | 3.24 | 16.3% | 26805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 96 |
| oog.melee.Capulet 1.2 | 2.7 | 13.6% | 47 |
| kawigi.micro.Shiz 1.1 | 3.0 | 12.9% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 25 |
| yagami.Tidus 0.11 | 4.8 | 11.9% | 10 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 11 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 69.2 | 17 / 35 | 4492 |
| 2 | 1 | 63.8 | 70.5 | 13 / 35 | 4388 |
| 3 | 1 | 62.8 | 67.6 | 15 / 35 | 4216 |
| 4 | 1 | 66.6 | 80.3 | 17 / 35 | 4498 |
| 5 | 1 | 67.3 | 82.9 | 18 / 35 | 4557 |
| 6 | 1 | 66.7 | 80.3 | 16 / 35 | 4654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 53% |
| kawigi.micro.Shiz 1.1 | 32 | 97% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 87% |
| yagami.Tidus 0.11 | 21 | 90% |
| ejb.Polaris 1.0.1 | 12 | 50% |
| kurios.DOSexe .9a | 2 | 50% |

Hadur died in 114 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 44% | 72 |
| ejb.Polaris 1.0.1 | 16 | 14% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 11% | 34 |
| yagami.Tidus 0.11 | 12 | 11% | 26 |
| kawigi.micro.Shiz 1.1 | 11 | 10% | 36 |
| kurios.DOSexe .9a | 7 | 6% | 6 |
| step.nanoPri 1.0 | 3 | 3% | 3 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.3 | 137 / 210 | 2.68 | 18.0% | 28059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.0% | 137 |
| wee.Gem 1.8.4 | 2.7 | 12.1% | 26 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 16 |
| wompi.Quokka 1.6 | 4.2 | 10.9% | 14 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 7 |
| m3thos.Eva00 1.1 | 6.3 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.7 | 8.6% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.4% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.1 | 21 / 35 | 4389 |
| 2 | 1 | 66.1 | 79.0 | 18 / 35 | 4620 |
| 3 | 1 | 67.6 | 85.4 | 21 / 35 | 4841 |
| 4 | 1 | 68.7 | 87.3 | 26 / 35 | 4723 |
| 5 | 1 | 67.8 | 82.9 | 27 / 35 | 4623 |
| 6 | 1 | 67.5 | 82.2 | 24 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 91% |
| wee.Gem 1.8.4 | 41 | 88% |
| m3thos.Eva00 1.1 | 17 | 100% |
| ratosh.Nobo 0.21 | 17 | 94% |
| wompi.Quokka 1.6 | 14 | 86% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 16% | 53 |
| ratosh.Nobo 0.21 | 12 | 16% | 28 |
| wee.Gem 1.8.4 | 11 | 15% | 43 |
| maribo.FollowFire 1 | 10 | 14% | 10 |
| bayen.UbaMicro 1.4 | 7 | 9% | 14 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 8 |
| wompi.Quokka 1.6 | 6 | 8% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 13 |
| m3thos.Eva00 1.1 | 4 | 5% | 17 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.3 | 75 / 210 | 2.41 | 19.8% | 45660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 19.8% | 75 |
| wompi.Wallaby 5.1 | 1.7 | 19.2% | 111 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 18 |
| ayk.WallHugger 1.0 | 4.0 | 10.3% | 4 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.2% | 1 |
| stuff.Vlad 0.1 | 6.3 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 89.8 | 14 / 35 | 8324 |
| 2 | 2 | 70.5 | 85.1 | 14 / 35 | 6980 |
| 3 | 2 | 69.7 | 81.9 | 11 / 35 | 7186 |
| 4 | 1 | 70.7 | 83.8 | 11 / 35 | 7533 |
| 5 | 1 | 71.6 | 86.0 | 15 / 35 | 7773 |
| 6 | 1 | 70.2 | 79.4 | 10 / 35 | 7864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 34% |
| mz.NanoGod 2.02 | 20 | 70% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 96 | 71% | 142 |
| mz.NanoGod 2.02 | 21 | 16% | 33 |
| exauge.GateKeeper 1.1.121g | 7 | 5% | 12 |
| ayk.WallHugger 1.0 | 7 | 5% | 11 |
| stelo.PianistNano 1.2 | 3 | 2% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.7 | 116 / 210 | 3.28 | 16.9% | 28746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.9% | 116 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.3% | 23 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.1% | 18 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.3% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.6% | 9 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.6% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.2 | 19 / 35 | 4622 |
| 2 | 1 | 66.9 | 77.8 | 21 / 35 | 5222 |
| 3 | 1 | 69.1 | 85.1 | 26 / 35 | 5561 |
| 4 | 1 | 63.6 | 71.4 | 15 / 35 | 4558 |
| 5 | 1 | 64.3 | 72.4 | 20 / 35 | 4273 |
| 6 | 1 | 61.7 | 65.4 | 15 / 35 | 4510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 41 | 83% |
| voidious.micro.BlitzBat 1.05 | 35 | 97% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 100% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 71% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 17 | 18% | 49 |
| conscience.Electron 1.3g | 16 | 17% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 16% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 15% | 37 |
| bvh.micro.Freya 0.3 | 13 | 14% | 25 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 14 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| voidious.micro.BlitzBat 1.05 | 5 | 5% | 37 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 86.5 | 161 / 210 | 2.21 | 21.2% | 43008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.2% | 161 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.0% | 14 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 7 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 12 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 3 |
| dsw.StaticD 1.0 | 5.8 | 9.1% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 3 |
| sample.Corners 1.0 | 9.3 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 82.9 | 26 / 35 | 7383 |
| 2 | 1 | 72.2 | 90.8 | 28 / 35 | 7156 |
| 3 | 1 | 70.3 | 84.1 | 26 / 35 | 6851 |
| 4 | 1 | 72.0 | 89.8 | 28 / 35 | 7329 |
| 5 | 1 | 71.8 | 86.7 | 26 / 35 | 7681 |
| 6 | 1 | 70.3 | 84.8 | 27 / 35 | 6608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 44 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 100% |
| supersample.SuperBoxBot 1.0 | 30 | 90% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| dsw.StaticD 1.0 | 11 | 91% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 82% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 16 | 32% | 52 |
| supersample.SuperBoxBot 1.0 | 14 | 28% | 35 |
| dsw.StaticD 1.0 | 8 | 16% | 31 |
| sul.Lunar 1.1 | 5 | 10% | 47 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 15 |
| sample.Corners 1.0 | 1 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 81.7 | 131 / 210 | 2.64 | 19.0% | 38998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 131 |
| radnor.DoctorBob 1.42 | 2.5 | 12.6% | 20 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 10.8% | 14 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 9 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 10 |
| sample.Walls 1.0 | 7.3 | 7.7% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 72.4 | 20 / 35 | 5890 |
| 2 | 1 | 68.7 | 83.2 | 18 / 35 | 6576 |
| 3 | 1 | 69.1 | 83.5 | 23 / 35 | 6519 |
| 4 | 1 | 67.1 | 76.5 | 19 / 35 | 6361 |
| 5 | 1 | 69.6 | 84.4 | 24 / 35 | 6742 |
| 6 | 1 | 71.2 | 90.5 | 27 / 35 | 6910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 53 | 94% |
| radnor.DoctorBob 1.42 | 38 | 82% |
| mld.Wisdom 1.0 | 20 | 80% |
| amz.NanoClone 1.41 | 13 | 92% |
| KiraNL.Chupacabra 0.4 | 11 | 55% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 24% | 50 |
| mld.Wisdom 1.0 | 16 | 20% | 37 |
| KiraNL.Chupacabra 0.4 | 14 | 18% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 16% | 58 |
| amz.NanoClone 1.41 | 8 | 10% | 19 |
| jangs.ns51 1.0 | 5 | 6% | 9 |
| sample.Walls 1.0 | 4 | 5% | 10 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

